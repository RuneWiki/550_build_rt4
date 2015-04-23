import java.util.Arrays;

/* Class59 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class59 {
	private static int anInt554;
	private static int anInt555;
	private static int anInt556;
	private static int anInt557;
	private static int anInt558;
	private static int anInt559;
	private static int[] anIntArray560;
	private static int anInt561;

	private static final void method540(final int i, final int i_0_) {
		if (i_0_ > i + 4) {
			int i_1_ = i;
			final int i_2_ = anIntArray560[i_1_];
			final int i_3_ = anIntArray560[i_1_ + 1];
			final int i_4_ = anIntArray560[i_1_ + 2];
			final int i_5_ = anIntArray560[i_1_ + 3];
			for (int i_6_ = i + 4; i_6_ < i_0_; i_6_ += 4) {
				final int i_7_ = anIntArray560[i_6_ + 1];
				if (i_7_ < i_3_) {
					anIntArray560[i_1_] = anIntArray560[i_6_];
					anIntArray560[i_1_ + 1] = i_7_;
					anIntArray560[i_1_ + 2] = anIntArray560[i_6_ + 2];
					anIntArray560[i_1_ + 3] = anIntArray560[i_6_ + 3];
					i_1_ += 4;
					anIntArray560[i_6_] = anIntArray560[i_1_];
					anIntArray560[i_6_ + 1] = anIntArray560[i_1_ + 1];
					anIntArray560[i_6_ + 2] = anIntArray560[i_1_ + 2];
					anIntArray560[i_6_ + 3] = anIntArray560[i_1_ + 3];
				}
			}
			anIntArray560[i_1_] = i_2_;
			anIntArray560[i_1_ + 1] = i_3_;
			anIntArray560[i_1_ + 2] = i_4_;
			anIntArray560[i_1_ + 3] = i_5_;
			method540(i, i_1_);
			method540(i_1_ + 4, i_0_);
		}
	}

	private static final void method541(final int i, final int i_8_, final int[] is, final int[] is_9_) {
		method548();
		while (method545()) {
			int i_10_ = anInt555;
			int i_11_ = anInt554;
			final int i_12_ = anInt561;
			if (is != null) {
				final int i_13_ = i_12_ - GraphicsLD.startY;
				if (i_10_ < is[i_13_] + GraphicsLD.startX) {
					i_10_ = is[i_13_] + GraphicsLD.startX;
				}
				if (i_11_ > is[i_13_] + is_9_[i_13_] + GraphicsLD.startX) {
					i_11_ = is[i_13_] + is_9_[i_13_] + GraphicsLD.startX;
				}
			}
			GraphicsLD.drawHorizontalLineAlpha(i_10_, i_12_, i_11_ - i_10_, i, i_8_);
		}
	}

	static final void method542(final int[] is, final int i, final int i_14_) {
		method547(is, 0, is.length, i, i_14_, null, null);
	}

	public static void method543() {
		anIntArray560 = null;
	}

	static final void method544(final int[] is, final int i, final int i_15_, final int[] is_16_, final int[] is_17_) {
		method547(is, 0, is.length, i, i_15_, is_16_, is_17_);
	}

	private static final boolean method545() {
		int i = anInt557;
		int i_18_ = anInt559;
		int i_19_ = anInt561;
		int i_20_;
		for (/**/; i_18_ >= i; i_18_ = i_20_) {
			anInt561 = ++i_19_;
			if (i_19_ >= GraphicsLD.endY) {
				return false;
			}
			i_20_ = anInt558;
			for (/**/; i < anInt556; i += 4) {
				final int i_21_ = anIntArray560[i + 1];
				if (i_19_ < i_21_) {
					break;
				}
				final int i_22_ = anIntArray560[i];
				final int i_23_ = anIntArray560[i + 2];
				final int i_24_ = anIntArray560[i + 3];
				final int i_25_ = (i_23_ - i_22_ << 16) / (i_24_ - i_21_);
				final int i_26_ = (i_22_ << 16) + 32768;
				anIntArray560[i] = i_26_;
				anIntArray560[i + 2] = i_25_;
			}
			for (int i_27_ = i_20_; i_27_ < i; i_27_ += 4) {
				final int i_28_ = anIntArray560[i_27_ + 3];
				if (i_19_ >= i_28_) {
					anIntArray560[i_27_] = anIntArray560[i_20_];
					anIntArray560[i_27_ + 1] = anIntArray560[i_20_ + 1];
					anIntArray560[i_27_ + 2] = anIntArray560[i_20_ + 2];
					anIntArray560[i_27_ + 3] = anIntArray560[i_20_ + 3];
					i_20_ += 4;
				}
			}
			if (i_20_ == anInt556) {
				anInt556 = 0;
				return false;
			}
			method549(i_20_, i);
			anInt558 = i_20_;
			anInt557 = i;
		}
		anInt555 = anIntArray560[i_18_] >> 16;
		anInt554 = anIntArray560[i_18_ + 4] >> 16;
		anIntArray560[i_18_] += anIntArray560[i_18_ + 2];
		anIntArray560[i_18_ + 4] += anIntArray560[i_18_ + 6];
		i_18_ += 8;
		anInt559 = i_18_;
		return true;
	}

	private static final void method546(final int[] is, final int i, int i_29_) {
		final int i_30_ = anInt556 + (i_29_ << 1);
		if (anIntArray560 == null || anIntArray560.length < i_30_) {
			final int[] is_31_ = new int[i_30_];
			for (int i_32_ = 0; i_32_ < anInt556; i_32_++) {
				is_31_[i_32_] = anIntArray560[i_32_];
			}
			anIntArray560 = is_31_;
		}
		i_29_ += i;
		int i_33_ = i_29_ - 2;
		for (int i_34_ = i; i_34_ < i_29_; i_34_ += 2) {
			final int i_35_ = is[i_33_ + 1];
			final int i_36_ = is[i_34_ + 1];
			if (i_35_ < i_36_) {
				anIntArray560[anInt556++] = is[i_33_];
				anIntArray560[anInt556++] = i_35_;
				anIntArray560[anInt556++] = is[i_34_];
				anIntArray560[anInt556++] = i_36_;
			} else if (i_36_ < i_35_) {
				anIntArray560[anInt556++] = is[i_34_];
				anIntArray560[anInt556++] = i_36_;
				anIntArray560[anInt556++] = is[i_33_];
				anIntArray560[anInt556++] = i_35_;
			}
			i_33_ = i_34_;
		}
	}

	private static final void method547(final int[] is, final int i, final int i_37_, final int i_38_, final int i_39_, final int[] is_40_, final int[] is_41_) {
		if (is_40_ != null && GraphicsLD.endY - GraphicsLD.startY != is_40_.length) {
			throw new IllegalStateException();
		}
		method550();
		method546(is, i, i_37_);
		method541(i_38_, i_39_, is_40_, is_41_);
	}

	private static final void method548() {
		if (anInt556 < 0) {
			anInt558 = anInt557 = anInt559 = 0;
			anInt561 = 2147483646;
		} else {
			method540(0, anInt556);
			int i = anIntArray560[1];
			if (i < GraphicsLD.startY) {
				i = GraphicsLD.startY;
			}
			int i_42_;
			for (i_42_ = 0; i_42_ < anInt556; i_42_ += 4) {
				final int i_43_ = anIntArray560[i_42_ + 1];
				if (i < i_43_) {
					break;
				}
				final int i_44_ = anIntArray560[i_42_];
				final int i_45_ = anIntArray560[i_42_ + 2];
				final int i_46_ = anIntArray560[i_42_ + 3];
				final int i_47_ = (i_45_ - i_44_ << 16) / (i_46_ - i_43_);
				final int i_48_ = (i_44_ << 16) + 32768;
				anIntArray560[i_42_] = i_48_ + (i - i_43_) * i_47_;
				anIntArray560[i_42_ + 2] = i_47_;
			}
			anInt558 = 0;
			anInt557 = i_42_;
			anInt559 = i_42_;
			anInt561 = i - 1;
		}
	}

	private static final void method549(final int i, int i_49_) {
		for (/**/; i_49_ >= i + 8; i_49_ -= 4) {
			boolean bool = true;
			for (int i_50_ = i + 4; i_50_ < i_49_; i_50_ += 4) {
				int i_51_ = anIntArray560[i_50_ - 4];
				final int i_52_ = anIntArray560[i_50_];
				if (i_51_ > i_52_) {
					bool = false;
					anIntArray560[i_50_ - 4] = i_52_;
					anIntArray560[i_50_] = i_51_;
					i_51_ = anIntArray560[i_50_ - 2];
					anIntArray560[i_50_ - 2] = anIntArray560[i_50_ + 2];
					anIntArray560[i_50_ + 2] = i_51_;
					i_51_ = anIntArray560[i_50_ - 1];
					anIntArray560[i_50_ - 1] = anIntArray560[i_50_ + 3];
					anIntArray560[i_50_ + 3] = i_51_;
				}
			}
			if (bool) {
				break;
			}
		}
	}

	private static final void method550() {
		anInt556 = 0;
	}
}
