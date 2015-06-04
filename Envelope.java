/* Class63 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

/*
 * Big thanks to:
 * http://www.rune-server.org/members/veer/ - http://stackoverflow.com/users/591495/oldrinb
 */
final class Envelope {
	private int[] phase_peak;
	int end;
	int start;
	private int[] phase_dur;
	int form;
	private int num_phases = 2;
	private int critical;
	private int phase_idx;
	private int amp;
	private int ticks;
	private int step;

	final void reset() {
		critical = 0;
		phase_idx = 0;
		step = 0;
		amp = 0;
		ticks = 0;
	}

	final void decode(final Buffer buffer) {
		this.form = buffer.getUByte();
		this.start = buffer.getInt();
		this.end = buffer.getInt();
		decode_shape(buffer);
	}

	final int step(final int period) {
		if (ticks >= critical) {
			amp = phase_peak[phase_idx++] << 15;
			if (phase_idx >= num_phases) {
				phase_idx = num_phases - 1;
			}
			critical = (int) (phase_dur[phase_idx] / 65536.0 * period);
			if (critical > ticks) {
				step = ((phase_peak[phase_idx] << 15) - amp) / (critical - ticks);
			}
		}
		amp += step;
		ticks++;
		return amp - step >> 15;
	}

	final void decode_shape(final Buffer buffer) {
		num_phases = buffer.getUByte();
		phase_dur = new int[num_phases];
		phase_peak = new int[num_phases];
		for (int id = 0; id < num_phases; id++) {
			phase_dur[id] = buffer.getUShort();
			phase_peak[id] = buffer.getUShort();
		}
	}

	public Envelope() {
		phase_dur = new int[2];
		phase_peak = new int[2];
		phase_dur[0] = 0;
		phase_dur[1] = 65535;
		phase_peak[0] = 0;
		phase_peak[1] = 65535;
	}
}
