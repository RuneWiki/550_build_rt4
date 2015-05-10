/* Class69_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Class69_Sub3 extends Class69 {
	static int isInTutIsland = 0;
	static String[] aStringArray2242 = { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

	static final String method626(int i, final int radix, final boolean bool) {
		if (radix < 2 || radix > 36) {
			throw new IllegalArgumentException(new StringBuilder("Invalid radix:").append(radix).toString());
		}
		if (!bool || i < 0) {
			return Integer.toString(i, radix);
		}
		int i_2_ = 2;
		for (int i_3_ = i / radix; i_3_ != 0; i_3_ /= radix) {
			i_2_++;
		}
		final char[] cs = new char[i_2_];
		cs[0] = '+';
		for (int i_4_ = i_2_ + -1; i_4_ > 0; i_4_--) {
			final int i_5_ = i;
			i /= radix;
			final int i_6_ = -(radix * i) + i_5_;
			if (i_6_ >= 10) {
				cs[i_4_] = (char) (i_6_ + 87);
			} else {
				cs[i_4_] = (char) (48 + i_6_);
			}
		}
		return new String(cs);
	}

	static final void method628(final int i_7_, final int i_8_, final int i_9_, final int i_10_, final int i_11_) {
		AmbientSound.fillArray(GameEntity.anIntArrayArray3009[i_10_], i_9_, i_8_ + -i_11_, i_11_ + i_8_);
		int i_12_ = 0;
		int i_13_ = i_7_;
		final int i_14_ = i_11_ * i_11_;
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
}
