/* Class69_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Class69_Sub3 extends Class69 {
	static int isInTutIsland = 0;
	static String[] aStringArray2242 = { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

	public static void method624(final byte i) {
		try {
			aStringArray2242 = null;
			if (i < 34) {
				aStringArray2242 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("hn.J(").append(i).append(')').toString());
		}
	}

	static final void method625(final int i) {
		try {
			if (i < 76) {
				isInTutIsland = -33;
			}
			Class11.aClass21_80.clear();
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("hn.M(").append(i).append(')').toString());
		}
	}

	static final String method626(int i, final int i_0_, final int i_1_, final boolean bool) {
		String string;
		try {
			if (i_0_ < 2 || i_0_ > 36) {
				throw new IllegalArgumentException(new StringBuilder("Invalid radix:").append(i_0_).toString());
			}
			if (!bool || i < 0) {
				return Integer.toString(i, i_0_);
			}
			if (i_1_ != -1556668830) {
				isInTutIsland = 103;
			}
			int i_2_ = 2;
			for (int i_3_ = i / i_0_; i_3_ != 0; i_3_ /= i_0_) {
				i_2_++;
			}
			final char[] cs = new char[i_2_];
			cs[0] = '+';
			for (int i_4_ = i_2_ + -1; i_4_ > 0; i_4_--) {
				final int i_5_ = i;
				i /= i_0_;
				final int i_6_ = -(i_0_ * i) + i_5_;
				if (i_6_ >= 10) {
					cs[i_4_] = (char) (i_6_ + 87);
				} else {
					cs[i_4_] = (char) (48 + i_6_);
				}
			}
			string = new String(cs);
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("hn.I(").append(i).append(',').append(i_0_).append(',').append(i_1_).append(',').append(bool).append(')').toString());
		}
		return string;
	}

	static final void method627(final boolean bool, final int i) {
		try {
			if (i == 6497794 && bool != Class140.aBoolean1340) {
				Class140.aBoolean1340 = bool;
				NodeCache.method297();
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("hn.K(").append(bool).append(',').append(i).append(')').toString());
		}
	}

	static final void method628(final int i, final int i_7_, final int i_8_, final int i_9_, final int i_10_, final int i_11_) {
		try {
			AmbientSound.fillArray(GameEntity.anIntArrayArray3009[i_10_], i_9_, i_8_ + -i_11_, i_11_ + i_8_);
			int i_12_ = 0;
			int i_13_ = i_7_;
			final int i_14_ = i_11_ * i_11_;
			if (i == -593542495) {
				final int i_15_ = i_7_ * i_7_;
				final int i_16_ = i_14_ << 1;
				final int i_17_ = i_7_ << 1;
				final int i_18_ = i_15_ << 1;
				int i_19_ = i_15_ - i_16_ * (i_17_ - 1);
				int i_20_ = i_18_ + (-i_17_ + 1) * i_14_;
				final int i_21_ = i_14_ << 2;
				int i_22_ = i_18_ * (3 + (i_12_ << 1));
				int i_23_ = i_16_ * ((i_13_ << 1) + -3);
				final int i_24_ = i_15_ << 2;
				int i_25_ = i_24_ * (i_12_ + 1);
				int i_26_ = (-1 + i_13_) * i_21_;
				while (i_13_ > 0) {
					if (i_20_ < 0) {
						while (i_20_ < 0) {
							i_12_++;
							i_20_ += i_22_;
							i_19_ += i_25_;
							i_25_ += i_24_;
							i_22_ += i_24_;
						}
					}
					i_13_--;
					if (i_19_ < 0) {
						i_19_ += i_25_;
						i_20_ += i_22_;
						i_22_ += i_24_;
						i_25_ += i_24_;
						i_12_++;
					}
					final int i_27_ = -i_13_ + i_10_;
					i_20_ += -i_26_;
					final int i_28_ = i_8_ + i_12_;
					i_26_ -= i_21_;
					final int i_29_ = i_13_ + i_10_;
					i_19_ += -i_23_;
					i_23_ -= i_21_;
					final int i_30_ = -i_12_ + i_8_;
					AmbientSound.fillArray(GameEntity.anIntArrayArray3009[i_27_], i_9_, i_30_, i_28_);
					AmbientSound.fillArray(GameEntity.anIntArrayArray3009[i_29_], i_9_, i_30_, i_28_);
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("hn.L(").append(i).append(',').append(i_7_).append(',').append(i_8_).append(',').append(i_9_).append(',').append(i_10_).append(',').append(i_11_).append(')').toString());
		}
	}
}
