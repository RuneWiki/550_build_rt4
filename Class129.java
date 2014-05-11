/* Class129 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class129 {
	private final int anInt1230;
	private int[] anIntArray1231;
	private float[][] aFloatArrayArray1232;
	private final int[] anIntArray1233;
	int anInt1234;
	private int[] anIntArray1235;

	final float[] method1910() {
		return aFloatArrayArray1232[method1913()];
	}

	private static final int method1911(final int i, final int i_0_) {
		int i_1_;
		for (i_1_ = (int) Math.pow(i, 1.0 / i_0_) + 1; NpcType.method2201(6, i_0_, i_1_) > i; i_1_--) {
			/* empty */
		}
		return i_1_;
	}

	private final void method1912() {
		final int[] is = new int[anInt1230];
		final int[] is_2_ = new int[33];
		for (int i = 0; i < anInt1230; i++) {
			final int i_3_ = anIntArray1233[i];
			if (i_3_ != 0) {
				final int i_4_ = 1 << 32 - i_3_;
				final int i_5_ = is_2_[i_3_];
				is[i] = i_5_;
				int i_6_;
				if ((i_5_ & i_4_) != 0) {
					i_6_ = is_2_[i_3_ - 1];
				} else {
					i_6_ = i_5_ | i_4_;
					for (int i_7_ = i_3_ - 1; i_7_ >= 1; i_7_--) {
						final int i_8_ = is_2_[i_7_];
						if (i_8_ != i_5_) {
							break;
						}
						final int i_9_ = 1 << 32 - i_7_;
						if ((i_8_ & i_9_) != 0) {
							is_2_[i_7_] = is_2_[i_7_ - 1];
							break;
						}
						is_2_[i_7_] = i_8_ | i_9_;
					}
				}
				is_2_[i_3_] = i_6_;
				for (int i_10_ = i_3_ + 1; i_10_ <= 32; i_10_++) {
					final int i_11_ = is_2_[i_10_];
					if (i_11_ == i_5_) {
						is_2_[i_10_] = i_6_;
					}
				}
			}
		}
		anIntArray1235 = new int[8];
		int i = 0;
		for (int i_12_ = 0; i_12_ < anInt1230; i_12_++) {
			final int i_13_ = anIntArray1233[i_12_];
			if (i_13_ != 0) {
				final int i_14_ = is[i_12_];
				int i_15_ = 0;
				for (int i_16_ = 0; i_16_ < i_13_; i_16_++) {
					int i_17_ = -2147483648 >>> i_16_;
					if ((i_14_ & i_17_) != 0) {
						if (anIntArray1235[i_15_] == 0) {
							anIntArray1235[i_15_] = i;
						}
						i_15_ = anIntArray1235[i_15_];
					} else {
						i_15_++;
					}
					if (i_15_ >= anIntArray1235.length) {
						final int[] is_18_ = new int[anIntArray1235.length * 2];
						for (int i_19_ = 0; i_19_ < anIntArray1235.length; i_19_++) {
							is_18_[i_19_] = anIntArray1235[i_19_];
						}
						anIntArray1235 = is_18_;
					}
					i_17_ >>>= 1;
				}
				anIntArray1235[i_15_] = i_12_ ^ 0xffffffff;
				if (i_15_ >= i) {
					i = i_15_ + 1;
				}
			}
		}
	}

	final int method1913() {
		int i;
		for (i = 0; anIntArray1235[i] >= 0; i = Class120_Sub23.method1712() != 0 ? anIntArray1235[i] : i + 1) {
			/* empty */
		}
		return anIntArray1235[i] ^ 0xffffffff;
	}

	Class129() {
		Class120_Sub23.method1717(24);
		this.anInt1234 = Class120_Sub23.method1717(16);
		anInt1230 = Class120_Sub23.method1717(24);
		anIntArray1233 = new int[anInt1230];
		final boolean bool = Class120_Sub23.method1712() != 0;
		if (bool) {
			int i = 0;
			int i_20_ = Class120_Sub23.method1717(5) + 1;
			while (i < anInt1230) {
				final int i_21_ = Class120_Sub23.method1717(Class110.method979(anInt1230 - i, -107));
				for (int i_22_ = 0; i_22_ < i_21_; i_22_++) {
					anIntArray1233[i++] = i_20_;
				}
				i_20_++;
			}
		} else {
			final boolean bool_23_ = Class120_Sub23.method1712() != 0;
			for (int i = 0; i < anInt1230; i++) {
				if (bool_23_ && Class120_Sub23.method1712() == 0) {
					anIntArray1233[i] = 0;
				} else {
					anIntArray1233[i] = Class120_Sub23.method1717(5) + 1;
				}
			}
		}
		method1912();
		final int i = Class120_Sub23.method1717(4);
		if (i > 0) {
			final float f = Class120_Sub23.method1714(Class120_Sub23.method1717(32));
			final float f_24_ = Class120_Sub23.method1714(Class120_Sub23.method1717(32));
			final int i_25_ = Class120_Sub23.method1717(4) + 1;
			final boolean bool_26_ = Class120_Sub23.method1712() != 0;
			int i_27_;
			if (i == 1) {
				i_27_ = method1911(anInt1230, this.anInt1234);
			} else {
				i_27_ = anInt1230 * this.anInt1234;
			}
			anIntArray1231 = new int[i_27_];
			for (int i_28_ = 0; i_28_ < i_27_; i_28_++) {
				anIntArray1231[i_28_] = Class120_Sub23.method1717(i_25_);
			}
			aFloatArrayArray1232 = new float[anInt1230][this.anInt1234];
			if (i == 1) {
				for (int i_29_ = 0; i_29_ < anInt1230; i_29_++) {
					float f_30_ = 0.0F;
					int i_31_ = 1;
					for (int i_32_ = 0; i_32_ < this.anInt1234; i_32_++) {
						final int i_33_ = i_29_ / i_31_ % i_27_;
						final float f_34_ = anIntArray1231[i_33_] * f_24_ + f + f_30_;
						aFloatArrayArray1232[i_29_][i_32_] = f_34_;
						if (bool_26_) {
							f_30_ = f_34_;
						}
						i_31_ *= i_27_;
					}
				}
			} else {
				for (int i_35_ = 0; i_35_ < anInt1230; i_35_++) {
					float f_36_ = 0.0F;
					int i_37_ = i_35_ * this.anInt1234;
					for (int i_38_ = 0; i_38_ < this.anInt1234; i_38_++) {
						final float f_39_ = anIntArray1231[i_37_] * f_24_ + f + f_36_;
						aFloatArrayArray1232[i_35_][i_38_] = f_39_;
						if (bool_26_) {
							f_36_ = f_39_;
						}
						i_37_++;
					}
				}
			}
		}
	}
}
