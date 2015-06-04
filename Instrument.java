/* Class175 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

/*
 * Big thanks to:
 * http://www.rune-server.org/members/veer/ - http://stackoverflow.com/users/591495/oldrinb
 */
final class Instrument {
	private Envelope gate_attack_env;
	private Envelope vol_mod_amp_env;
	private Envelope gate_release_env;
	int duration = 500;
	private Envelope vol_env;
	private static int[] sine;
	private Envelope vol_mod_env;
	private int delay_time;
	private int delay_feedback;
	int begin = 0;
	private Envelope pitch_mod_env;
	private static int[] output;
	private Envelope pitch_env;
	private final int[] oscillator_pitch_delta;
	private final int[] oscillator_volume;
	private Filter filter;
	private final int[] oscillator_delay = new int[5];
	private Envelope pitch_mod_amp_env;
	private static int[] noise = new int[32768];
	private static int[] phase_delta_base;
	private static int[] delays;
	private static int[] volume_step;
	private static int[] phases;
	private Envelope filter_env;
	private static int[] phase_delta;

	static {
		final Random random = new Random(0L);
		for (int id = 0; id < 32768; id++) {
			noise[id] = (random.nextInt() & 0x2) - 1;
		}
		sine = new int[32768];
		for (int id = 0; id < 32768; id++) {
			sine[id] = (int) (Math.sin(id / 5215.1903) * 16384.0);
		}
		output = new int[220500];
		delays = new int[5];
		phase_delta_base = new int[5];
		phases = new int[5];
		volume_step = new int[5];
		phase_delta = new int[5];
	}

	final void decode(final Buffer buffer) {
		pitch_env = new Envelope();
		pitch_env.decode(buffer);
		vol_env = new Envelope();
		vol_env.decode(buffer);
		int option = buffer.getUByte();
		if (option != 0) {
			buffer.pos--;
			pitch_mod_env = new Envelope();
			pitch_mod_env.decode(buffer);
			pitch_mod_amp_env = new Envelope();
			pitch_mod_amp_env.decode(buffer);
		}
		option = buffer.getUByte();
		if (option != 0) {
			buffer.pos--;
			vol_mod_env = new Envelope();
			vol_mod_env.decode(buffer);
			vol_mod_amp_env = new Envelope();
			vol_mod_amp_env.decode(buffer);
		}
		option = buffer.getUByte();
		if (option != 0) {
			buffer.pos--;
			gate_release_env = new Envelope();
			gate_release_env.decode(buffer);
			gate_attack_env = new Envelope();
			gate_attack_env.decode(buffer);
		}
		for (int id = 0; id < 10; id++) {
			final int volume = buffer.getUSmart();
			if (volume == 0) {
				break;
			}
			oscillator_volume[id] = volume;
			oscillator_pitch_delta[id] = buffer.getSmart();
			oscillator_delay[id] = buffer.getUSmart();
		}
		delay_time = buffer.getUSmart();
		delay_feedback = buffer.getUSmart();
		this.duration = buffer.getUShort();
		this.begin = buffer.getUShort();
		filter = new Filter();
		filter_env = new Envelope();
		filter.decode(buffer, filter_env);
	}

	final int[] synthesize(final int num_samples, final int dt) {
		ArrayUtils.resetArray(output, 0, num_samples);
		if (dt < 10) {
			return output;
		}
		final double sample_rate = num_samples / (dt + 0.0);
		pitch_env.reset();
		vol_env.reset();
		int pm_phase_delta = 0;
		int pm_phase_delta_base = 0;
		int pm_phase = 0;
		if (pitch_mod_env != null) {
			pitch_mod_env.reset();
			pitch_mod_amp_env.reset();
			pm_phase_delta = (int) ((pitch_mod_env.end - pitch_mod_env.start) * 32.768 / sample_rate);
			pm_phase_delta_base = (int) (pitch_mod_env.start * 32.768 / sample_rate);
		}
		int vm_phase_delta = 0;
		int vm_phase_delta_base = 0;
		int vm_phase = 0;
		if (vol_mod_env != null) {
			vol_mod_env.reset();
			vol_mod_amp_env.reset();
			vm_phase_delta = (int) ((vol_mod_env.end - vol_mod_env.start) * 32.768 / sample_rate);
			vm_phase_delta_base = (int) (vol_mod_env.start * 32.768 / sample_rate);
		}
		for (int id = 0; id < 5; id++) {
			if (oscillator_volume[id] != 0) {
				phases[id] = 0;
				delays[id] = (int) (oscillator_delay[id] * sample_rate);
				volume_step[id] = (oscillator_volume[id] << 14) / 100;
				phase_delta[id] = (int) ((pitch_env.end - pitch_env.start) * 32.768 * Math.pow(1.0057929410678534, oscillator_pitch_delta[id]) / sample_rate);
				phase_delta_base[id] = (int) (pitch_env.start * 32.768 / sample_rate);
			}
		}
		for (int id = 0; id < num_samples; id++) {
			int dp = pitch_env.step(num_samples);
			int dv = vol_env.step(num_samples);
			if (pitch_mod_env != null) {
				final int pm = pitch_mod_env.step(num_samples);
				final int pm_amp = pitch_mod_amp_env.step(num_samples);
				dp += lookup(pm_phase, pm_amp, pitch_mod_env.form) >> 1;
				pm_phase += (pm * pm_phase_delta >> 16) + pm_phase_delta_base;
			}
			if (vol_mod_env != null) {
				final int vm = vol_mod_env.step(num_samples);
				final int vm_amp = vol_mod_amp_env.step(num_samples);
				dv = dv * ((lookup(vm_phase, vm_amp, vol_mod_env.form) >> 1) + 32768) >> 15;
				vm_phase += (vm * vm_phase_delta >> 16) + vm_phase_delta_base;
			}
			for (int idx = 0; idx < 5; idx++) {
				if (oscillator_volume[idx] != 0) {
					final int outputIdx = id + delays[idx];
					if (outputIdx < num_samples) {
						output[outputIdx] += lookup(phases[idx], dv * volume_step[idx] >> 15, pitch_env.form);
						phases[idx] += (dp * phase_delta[idx] >> 16) + phase_delta_base[idx];
					}
				}
			}
		}
		if (gate_release_env != null) {
			gate_release_env.reset();
			gate_attack_env.reset();
			int counter = 0;
			boolean muted = true;
			for (int sample = 0; sample < num_samples; sample++) {
				final int on_step = gate_release_env.step(num_samples);
				final int off_step = gate_attack_env.step(num_samples);
				int threshold;
				if (muted) {
					threshold = gate_release_env.start + ((gate_release_env.end - gate_release_env.start) * on_step >> 8);
				} else {
					threshold = gate_release_env.start + ((gate_release_env.end - gate_release_env.start) * off_step >> 8);
				}
				counter += 256;
				if (counter >= threshold) {
					counter = 0;
					muted = !muted;
				}
				if (muted) {
					output[sample] = 0;
				}
			}
		}
		if (delay_time > 0 && delay_feedback > 0) {
			final int delay = (int) (delay_time * sample_rate);
			for (int nextDelays = delay; nextDelays < num_samples; nextDelays++) {
				output[nextDelays] += output[nextDelays - delay] * delay_feedback / 100;
			}
		}
		if (filter.num_pairs[0] > 0 || filter.num_pairs[1] > 0) {
			filter_env.reset();
			int t = filter_env.step(num_samples + 1);
			int M = filter.compute(0, t / 65536.0F);
			int N = filter.compute(1, t / 65536.0F);
			if (num_samples >= M + N) {
				int n = 0;
				int delay = N;
				if (delay > num_samples - M) {
					delay = num_samples - M;
				}
				for (/**/; n < delay; n++) {
					int y = (int) ((long) output[n + M] * (long) Filter.inv_unity >> 16);
					for (int i = 0; i < M; i++) {
						y += (int) ((long) output[n + M - 1 - i] * (long) Filter.coef[0][i] >> 16);
					}
					for (int i = 0; i < n; i++) {
						y -= (int) ((long) output[n - 1 - i] * (long) Filter.coef[1][i] >> 16);
					}
					output[n] = y;
					t = filter_env.step(num_samples + 1);
				}
				delay = 128;
				for (;;) {
					if (delay > num_samples - M) {
						delay = num_samples - M;
					}
					for (/**/; n < delay; n++) {
						int y = (int) ((long) output[n + M] * (long) Filter.inv_unity >> 16);
						for (int i = 0; i < M; i++) {
							y += (int) ((long) output[n + M - 1 - i] * (long) Filter.coef[0][i] >> 16);
						}
						for (int i = 0; i < N; i++) {
							y -= (int) ((long) output[n - 1 - i] * (long) Filter.coef[1][i] >> 16);
						}
						output[n] = y;
						t = filter_env.step(num_samples + 1);
					}
					if (n >= num_samples - M) {
						break;
					}
					M = filter.compute(0, t / 65536.0F);
					N = filter.compute(1, t / 65536.0F);
					delay += 128;
				}
				for (/**/; n < num_samples; n++) {
					int y = 0;
					for (int i = n + M - num_samples; i < M; i++) {
						y += (int) ((long) output[n + M - 1 - i] * (long) Filter.coef[0][i] >> 16);
					}
					for (int i = 0; i < N; i++) {
						y -= (int) ((long) output[n - 1 - i] * (long) Filter.coef[1][i] >> 16);
					}
					output[n] = y;
					t = filter_env.step(num_samples + 1);
				}
			}
		}
		for (int sample = 0; sample < num_samples; sample++) {
			if (output[sample] < -32768) {
				output[sample] = -32768;
			}
			if (output[sample] > 32767) {
				output[sample] = 32767;
			}
		}
		return output;
	}

	private final int lookup(final int i, final int amplitude, final int table) {
		if (table == 1) {
			if ((i & 0x7fff) < 16384) {
				return amplitude;
			}
			return -amplitude;
		}
		if (table == 2) {
			return sine[i & 0x7fff] * amplitude >> 14;
		}
		if (table == 3) {
			return ((i & 0x7fff) * amplitude >> 14) - amplitude;
		}
		if (table == 4) {
			return noise[i / 2607 & 0x7fff] * amplitude;
		}
		return 0;
	}

	public Instrument() {
		oscillator_volume = new int[5];
		delay_time = 0;
		oscillator_pitch_delta = new int[5];
		delay_feedback = 100;
	}
}
