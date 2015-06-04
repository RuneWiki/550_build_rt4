/* Class146 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

/*
 * Big thanks to:
 * http://www.rune-server.org/members/veer/ - http://stackoverflow.com/users/591495/oldrinb
 */
final class Filter {
	private static float[][] _coef;
	static int[][] coef = new int[2][8];
	static int inv_unity;
	private final int[][][] pair_mag;
	private final int[][][] pair_phase;
	int[] num_pairs = new int[2];
	private static float _inv_unity;
	private final int[] unity;

	static {
		_coef = new float[2][8];
	}

	private final float adapt_mag(final int dir, final int p, final float f) {
		float alpha = pair_mag[dir][0][p] + f * (pair_mag[dir][1][p] - pair_mag[dir][0][p]);
		alpha *= 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0, -alpha / 20.0F);
	}

	final int compute(final int dir, final float t) {
		if (dir == 0) {
			float alpha = unity[0] + (unity[1] - unity[0]) * t;
			alpha *= 0.0030517578F;
			_inv_unity = (float) Math.pow(0.1, alpha / 20.0F);
			inv_unity = (int) (_inv_unity * 65536.0F);
		}
		if (this.num_pairs[dir] == 0) {
			return 0;
		}
		float r = adapt_mag(dir, 0, t);
		_coef[dir][0] = -2.0F * r * (float) Math.cos(adapt_phase(dir, 0, t));
		_coef[dir][1] = r * r;
		for (int p = 1; p < this.num_pairs[dir]; p++) {
			r = adapt_mag(dir, p, t);
			final float a1 = -2.0F * r * (float) Math.cos(adapt_phase(dir, p, t));
			final float a2 = r * r;
			_coef[dir][p * 2 + 1] = _coef[dir][p * 2 - 1] * a2;
			_coef[dir][p * 2] = _coef[dir][p * 2 - 1] * a1 + _coef[dir][p * 2 - 2] * a2;
			for (int m = p * 2 - 1; m >= 2; m--) {
				_coef[dir][m] += _coef[dir][m - 1] * a1 + _coef[dir][m - 2] * a2;
			}
			_coef[dir][1] += _coef[dir][0] * a1 + a2;
			_coef[dir][0] += a1;
		}
		if (dir == 0) {
			for (int l = 0; l < this.num_pairs[0] * 2; l++) {
				_coef[0][l] *= _inv_unity;
			}
		}
		for (int i1 = 0; i1 < this.num_pairs[dir] * 2; i1++) {
			coef[dir][i1] = (int) (_coef[dir][i1] * 65536.0F);
		}
		return this.num_pairs[dir] * 2;
	}

	private static final float normalize(final float octaves) {
		final float f = 32.703197F * (float) Math.pow(2.0, octaves);
		return f * 3.1415927F / 11025.0F;
	}

	final void decode(final Buffer buffer, final Envelope envelope) {
		final int bitPacked = buffer.getUByte();
		this.num_pairs[0] = bitPacked >> 4;
		this.num_pairs[1] = bitPacked & 0xf;
		if (bitPacked != 0) {
			unity[0] = buffer.getUShort();
			unity[1] = buffer.getUShort();
			final int migrated = buffer.getUByte();
			for (int dir = 0; dir < 2; dir++) {
				for (int term = 0; term < this.num_pairs[dir]; term++) {
					pair_phase[dir][0][term] = buffer.getUShort();
					pair_mag[dir][0][term] = buffer.getUShort();
				}
			}
			for (int dir = 0; dir < 2; dir++) {
				for (int p = 0; p < this.num_pairs[dir]; p++) {
					if ((migrated & 1 << dir * 4 << p) != 0) {
						pair_phase[dir][1][p] = buffer.getUShort();
						pair_mag[dir][1][p] = buffer.getUShort();
					} else {
						pair_phase[dir][1][p] = pair_phase[dir][0][p];
						pair_mag[dir][1][p] = pair_mag[dir][0][p];
					}
				}
			}
			if (migrated != 0 || unity[1] != unity[0]) {
				envelope.decode_shape(buffer);
			}
		} else {
			unity[0] = unity[1] = 0;
		}
	}

	private final float adapt_phase(final int dir, final int p, final float t) {
		float f1 = pair_phase[dir][0][p] + t * (pair_phase[dir][1][p] - pair_phase[dir][0][p]);
		f1 *= 1.2207031E-4F;//1 / 8192
		return normalize(f1);
	}

	public Filter() {
		pair_phase = new int[2][2][4];
		pair_mag = new int[2][2][4];
		unity = new int[2];
	}
}
