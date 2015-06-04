/* Class6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

/*
 * Big thanks to:
 * http://www.rune-server.org/members/veer/ - http://stackoverflow.com/users/591495/oldrinb
 */
final class SoundEffect {
	private int loop_end;
	private int loop_begin;
	private final Instrument[] instruments;

	private final byte[] getOutput() {
		int _dur = 0;
		for (int id = 0; id < 10; id++) {
			if (instruments[id] != null && instruments[id].duration + instruments[id].begin > _dur) {
				_dur = instruments[id].duration + instruments[id].begin;
			}
		}
		if (_dur == 0) {
			return new byte[0];
		}
		final int n_s = 22050 * _dur / 1000;
		final byte[] output = new byte[n_s];
		for (int id = 0; id < 10; id++) {
			if (instruments[id] != null) {
				final int dur = instruments[id].duration * 22050 / 1000;
				final int offset = instruments[id].begin * 22050 / 1000;
				final int[] samples = instruments[id].synthesize(dur, instruments[id].duration);
				for (int i_6_ = 0; i_6_ < dur; i_6_++) {
					int out = output[i_6_ + offset] + (samples[i_6_] >> 8);
					if ((out + 128 & ~0xff) != 0) {
						out = out >> 31 ^ 0x7f;
					}
					output[i_6_ + offset] = (byte) out;
				}
			}
		}
		return output;
	}

	final int delay() {
		int offset = 9999999;
		for (int id = 0; id < 10; id++) {
			if (instruments[id] != null && instruments[id].begin / 20 < offset) {
				offset = instruments[id].begin / 20;
			}
		}
		if (loop_begin < loop_end && loop_begin / 20 < offset) {
			offset = loop_begin / 20;
		}
		if (offset == 9999999 || offset == 0) {
			return 0;
		}
		for (int id = 0; id < 10; id++) {
			if (instruments[id] != null) {
				instruments[id].begin -= offset * 20;
			}
		}
		if (loop_begin < loop_end) {
			loop_begin -= offset * 20;
			loop_end -= offset * 20;
		}
		return offset;
	}

	static final SoundEffect list(final js5 js5, final int group, final int file) {
		final byte[] buffer = js5.getFile(group, file);
		if (buffer == null) {
			return null;
		}
		return new SoundEffect(new Buffer(buffer));
	}

	final Class120_Sub5_Sub1 method104() {
		final byte[] output = getOutput();
		return new Class120_Sub5_Sub1(22050, output, 22050 * loop_begin / 1000, 22050 * loop_end / 1000);
	}

	private SoundEffect(final Buffer buffer) {
		instruments = new Instrument[10];
		for (int id = 0; id < 10; id++) {
			final int active = buffer.getUByte();
			if (active != 0) {
				buffer.pos--;
				instruments[id] = new Instrument();
				instruments[id].decode(buffer);
			}
		}
		loop_begin = buffer.getUShort();
		loop_end = buffer.getUShort();
	}

	private SoundEffect() {
		instruments = new Instrument[10];
	}
}
