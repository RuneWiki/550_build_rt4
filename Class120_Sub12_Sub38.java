/* Class120_Sub12_Sub38 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class120_Sub12_Sub38 extends Class120_Sub12 {
	static int screenX = -1;
	private int anInt3435;
	private int anInt3436 = 1;
	static GroundTile[][][] underWaterGroundTiles;
	static int anInt3438;
	static int[] skillsXp = new int[25];
	static int mapSizeZ;
	static int[] screenRedrawYs = new int[100];

	@Override
	final int[][] method1188(final int i) {
		final int[][] is_1_ = this.aClass109_2559.method975(i);
		if (this.aClass109_2559.aBoolean1049) {
			final int i_2_ = anInt3436 - (-anInt3436 - 1);
			final int i_3_ = 65536 / i_2_;
			final int i_4_ = anInt3435 + anInt3435 - -1;
			final int i_5_ = 65536 / i_4_;
			final int[][][] is_6_ = new int[i_2_][][];
			for (int i_7_ = i + -anInt3436; i - -anInt3436 >= i_7_; i_7_++) {
				final int[][] is_8_ = method1179(0, i_7_ & Class120_Sub29.anInt2774);
				final int[][] is_9_ = new int[3][Class120_Sub12_Sub7.anInt3178];
				int i_10_ = 0;
				int i_11_ = 0;
				final int[] is_12_ = is_8_[0];
				int i_13_ = 0;
				final int[] is_14_ = is_8_[2];
				final int[] is_15_ = is_8_[1];
				for (int i_16_ = -anInt3435; i_16_ <= anInt3435; i_16_++) {
					final int i_17_ = MagnetType.anInt259 & i_16_;
					i_13_ += is_15_[i_17_];
					i_10_ += is_12_[i_17_];
					i_11_ += is_14_[i_17_];
				}
				final int[] is_18_ = is_9_[0];
				final int[] is_19_ = is_9_[1];
				final int[] is_20_ = is_9_[2];
				int i_21_ = 0;
				while (Class120_Sub12_Sub7.anInt3178 > i_21_) {
					is_18_[i_21_] = i_5_ * i_10_ >> 16;
					is_19_[i_21_] = i_13_ * i_5_ >> 16;
					is_20_[i_21_] = i_5_ * i_11_ >> 16;
					int i_22_ = i_21_ + -anInt3435 & MagnetType.anInt259;
					i_13_ -= is_15_[i_22_];
					i_10_ -= is_12_[i_22_];
					i_21_++;
					i_11_ -= is_14_[i_22_];
					i_22_ = i_21_ - -anInt3435 & MagnetType.anInt259;
					i_10_ += is_12_[i_22_];
					i_13_ += is_15_[i_22_];
					i_11_ += is_14_[i_22_];
				}
				is_6_[-i + i_7_ - -anInt3436] = is_9_;
			}
			final int[] is_23_ = is_1_[1];
			final int[] is_24_ = is_1_[2];
			final int[] is_25_ = is_1_[0];
			for (int i_26_ = 0; Class120_Sub12_Sub7.anInt3178 > i_26_; i_26_++) {
				int i_27_ = 0;
				int i_28_ = 0;
				int i_29_ = 0;
				for (int i_30_ = 0; i_2_ > i_30_; i_30_++) {
					final int[][] is_31_ = is_6_[i_30_];
					i_29_ += is_31_[2][i_26_];
					i_27_ += is_31_[0][i_26_];
					i_28_ += is_31_[1][i_26_];
				}
				is_25_[i_26_] = i_3_ * i_27_ >> 16;
				is_23_[i_26_] = i_3_ * i_28_ >> 16;
				is_24_[i_26_] = i_29_ * i_3_ >> 16;
			}
		}
		return is_1_;
	}

	@Override
	final void decode(final Buffer buffer, final int i_33_) {
		while_166_: do {
			do {
				if (i_33_ != 0) {
					if (i_33_ != 1) {
						if (i_33_ == 2) {
							break;
						}
						break while_166_;
					}
				} else {
					anInt3435 = buffer.getUByte();
					break while_166_;
				}
				anInt3436 = buffer.getUByte();
				break while_166_;
			} while (false);
			this.aBoolean2558 = buffer.getUByte() == 1;
		} while (false);
	}

	@Override
	final int[] method1187(final int i_36_) {
		final int[] is_37_ = this.aClass30_2563.method258(i_36_);
		if (this.aClass30_2563.aBoolean238) {
			final int i_38_ = anInt3436 - -anInt3436 - -1;
			final int i_39_ = 65536 / i_38_;
			final int i_40_ = 1 + anInt3435 + anInt3435;
			final int i_41_ = 65536 / i_40_;
			final int[][] is_42_ = new int[i_38_][];
			for (int i_43_ = i_36_ + -anInt3436; i_43_ <= i_36_ - -anInt3436; i_43_++) {
				final int[] is_44_ = method1192(Class120_Sub29.anInt2774 & i_43_, 0);
				final int[] is_45_ = new int[Class120_Sub12_Sub7.anInt3178];
				int i_46_ = 0;
				for (int i_47_ = -anInt3435; i_47_ <= anInt3435; i_47_++) {
					i_46_ += is_44_[MagnetType.anInt259 & i_47_];
				}
				int i_48_ = 0;
				while (i_48_ < Class120_Sub12_Sub7.anInt3178) {
					is_45_[i_48_] = i_46_ * i_41_ >> 16;
					i_46_ -= is_44_[MagnetType.anInt259 & -anInt3435 + i_48_];
					i_48_++;
					i_46_ += is_44_[i_48_ + anInt3435 & MagnetType.anInt259];
				}
				is_42_[i_43_ - -anInt3436 + -i_36_] = is_45_;
			}
			for (int i_49_ = 0; i_49_ < Class120_Sub12_Sub7.anInt3178; i_49_++) {
				int i_50_ = 0;
				for (int i_51_ = 0; i_38_ > i_51_; i_51_++) {
					i_50_ += is_42_[i_51_][i_49_];
				}
				is_37_[i_49_] = i_39_ * i_50_ >> 16;
			}
		}
		return is_37_;
	}

	public Class120_Sub12_Sub38() {
		super(1, false);
		anInt3435 = 1;
	}
}
