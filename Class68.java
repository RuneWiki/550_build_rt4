/* Class68 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class68 {
	private static int anInt606;
	private static int anInt607;
	private static int[] anIntArray608;
	private static int anInt609;
	private static int anInt610;
	private static int anInt611;
	private static int anInt612;
	private static int anInt613;

	public static void method602() {
		anIntArray608 = null;
	}

	private static final void method603(final int i, final int i_0_, final int[] is, final int[] is_1_) {
		method609();
		while (method611()) {
			int i_2_ = anInt607;
			int i_3_ = anInt609;
			final int i_4_ = anInt610;
			if (is != null) {
				final int i_5_ = i_4_ - GraphicsHD.startY;
				if (i_2_ < is[i_5_] + GraphicsHD.startX) {
					i_2_ = is[i_5_] + GraphicsHD.startX;
				}
				if (i_3_ > is[i_5_] + is_1_[i_5_] + GraphicsHD.startX) {
					i_3_ = is[i_5_] + is_1_[i_5_] + GraphicsHD.startX;
				}
				if (i_2_ >= i_3_) {
					continue;
				}
			}
			GraphicsHD.method584(i_2_, i_4_, i_3_ - i_2_, i, i_0_);
		}
	}

	private static final void method604(final int i, int i_6_) {
		for (/**/; i_6_ >= i + 8; i_6_ -= 4) {
			boolean bool = true;
			for (int i_7_ = i + 4; i_7_ < i_6_; i_7_ += 4) {
				int i_8_ = anIntArray608[i_7_ - 4];
				final int i_9_ = anIntArray608[i_7_];
				if (i_8_ > i_9_) {
					bool = false;
					anIntArray608[i_7_ - 4] = i_9_;
					anIntArray608[i_7_] = i_8_;
					i_8_ = anIntArray608[i_7_ - 2];
					anIntArray608[i_7_ - 2] = anIntArray608[i_7_ + 2];
					anIntArray608[i_7_ + 2] = i_8_;
					i_8_ = anIntArray608[i_7_ - 1];
					anIntArray608[i_7_ - 1] = anIntArray608[i_7_ + 3];
					anIntArray608[i_7_ + 3] = i_8_;
				}
			}
			if (bool) {
				break;
			}
		}
	}

	private static final void method605(final int[] is, final int i, int i_10_) {
		final int i_11_ = anInt613 + (i_10_ << 1);
		if (anIntArray608 == null || anIntArray608.length < i_11_) {
			final int[] is_12_ = new int[i_11_];
			for (int i_13_ = 0; i_13_ < anInt613; i_13_++) {
				is_12_[i_13_] = anIntArray608[i_13_];
			}
			anIntArray608 = is_12_;
		}
		i_10_ += i;
		int i_14_ = i_10_ - 2;
		for (int i_15_ = i; i_15_ < i_10_; i_15_ += 2) {
			final int i_16_ = is[i_14_ + 1];
			final int i_17_ = is[i_15_ + 1];
			if (i_16_ < i_17_) {
				anIntArray608[anInt613++] = is[i_14_];
				anIntArray608[anInt613++] = i_16_;
				anIntArray608[anInt613++] = is[i_15_];
				anIntArray608[anInt613++] = i_17_;
			} else if (i_17_ < i_16_) {
				anIntArray608[anInt613++] = is[i_15_];
				anIntArray608[anInt613++] = i_17_;
				anIntArray608[anInt613++] = is[i_14_];
				anIntArray608[anInt613++] = i_16_;
			}
			i_14_ = i_15_;
		}
	}

	private static final void method606(final int[] is, final int i, final int i_18_, final int i_19_, final int i_20_, final int[] is_21_, final int[] is_22_) {
		if (is_21_ != null && GraphicsHD.endY - GraphicsHD.startY != is_21_.length) {
			throw new IllegalStateException();
		}
		method610();
		method605(is, i, i_18_);
		method603(i_19_, i_20_, is_21_, is_22_);
	}

	private static final void method607(final int i, final int i_23_) {
		if (i_23_ > i + 4) {
			int i_24_ = i;
			final int i_25_ = anIntArray608[i_24_];
			final int i_26_ = anIntArray608[i_24_ + 1];
			final int i_27_ = anIntArray608[i_24_ + 2];
			final int i_28_ = anIntArray608[i_24_ + 3];
			for (int i_29_ = i + 4; i_29_ < i_23_; i_29_ += 4) {
				final int i_30_ = anIntArray608[i_29_ + 1];
				if (i_30_ < i_26_) {
					anIntArray608[i_24_] = anIntArray608[i_29_];
					anIntArray608[i_24_ + 1] = i_30_;
					anIntArray608[i_24_ + 2] = anIntArray608[i_29_ + 2];
					anIntArray608[i_24_ + 3] = anIntArray608[i_29_ + 3];
					i_24_ += 4;
					anIntArray608[i_29_] = anIntArray608[i_24_];
					anIntArray608[i_29_ + 1] = anIntArray608[i_24_ + 1];
					anIntArray608[i_29_ + 2] = anIntArray608[i_24_ + 2];
					anIntArray608[i_29_ + 3] = anIntArray608[i_24_ + 3];
				}
			}
			anIntArray608[i_24_] = i_25_;
			anIntArray608[i_24_ + 1] = i_26_;
			anIntArray608[i_24_ + 2] = i_27_;
			anIntArray608[i_24_ + 3] = i_28_;
			method607(i, i_24_);
			method607(i_24_ + 4, i_23_);
		}
	}

	static final void method608(final int[] is, final int i, final int i_31_, final int[] is_32_, final int[] is_33_) {
		method606(is, 0, is.length, i, i_31_, is_32_, is_33_);
	}

	private static final void method609() {
		if (anInt613 < 0) {
			anInt606 = anInt612 = anInt611 = 0;
			anInt610 = 2147483646;
		} else {
			method607(0, anInt613);
			int i = anIntArray608[1];
			if (i < GraphicsHD.startY) {
				i = GraphicsHD.startY;
			}
			int i_34_;
			for (i_34_ = 0; i_34_ < anInt613; i_34_ += 4) {
				final int i_35_ = anIntArray608[i_34_ + 1];
				if (i < i_35_) {
					break;
				}
				final int i_36_ = anIntArray608[i_34_];
				final int i_37_ = anIntArray608[i_34_ + 2];
				final int i_38_ = anIntArray608[i_34_ + 3];
				final int i_39_ = (i_37_ - i_36_ << 16) / (i_38_ - i_35_);
				final int i_40_ = (i_36_ << 16) + 32768;
				anIntArray608[i_34_] = i_40_ + (i - i_35_) * i_39_;
				anIntArray608[i_34_ + 2] = i_39_;
			}
			anInt606 = 0;
			anInt612 = i_34_;
			anInt611 = i_34_;
			anInt610 = i - 1;
		}
	}

	private static final void method610() {
		anInt613 = 0;
	}

	private static final boolean method611() {
		int i = anInt612;
		int i_41_ = anInt611;
		int i_42_ = anInt610;
		int i_43_;
		for (/**/; i_41_ >= i; i_41_ = i_43_) {
			anInt610 = ++i_42_;
			if (i_42_ >= GraphicsHD.endY) {
				return false;
			}
			i_43_ = anInt606;
			for (/**/; i < anInt613; i += 4) {
				final int i_44_ = anIntArray608[i + 1];
				if (i_42_ < i_44_) {
					break;
				}
				final int i_45_ = anIntArray608[i];
				final int i_46_ = anIntArray608[i + 2];
				final int i_47_ = anIntArray608[i + 3];
				final int i_48_ = (i_46_ - i_45_ << 16) / (i_47_ - i_44_);
				final int i_49_ = (i_45_ << 16) + 32768;
				anIntArray608[i] = i_49_;
				anIntArray608[i + 2] = i_48_;
			}
			for (int i_50_ = i_43_; i_50_ < i; i_50_ += 4) {
				final int i_51_ = anIntArray608[i_50_ + 3];
				if (i_42_ >= i_51_) {
					anIntArray608[i_50_] = anIntArray608[i_43_];
					anIntArray608[i_50_ + 1] = anIntArray608[i_43_ + 1];
					anIntArray608[i_50_ + 2] = anIntArray608[i_43_ + 2];
					anIntArray608[i_50_ + 3] = anIntArray608[i_43_ + 3];
					i_43_ += 4;
				}
			}
			if (i_43_ == anInt613) {
				anInt613 = 0;
				return false;
			}
			method604(i_43_, i);
			anInt606 = i_43_;
			anInt612 = i;
		}
		anInt607 = anIntArray608[i_41_] >> 16;
		anInt609 = anIntArray608[i_41_ + 4] >> 16;
		anIntArray608[i_41_] += anIntArray608[i_41_ + 2];
		anIntArray608[i_41_ + 4] += anIntArray608[i_41_ + 6];
		i_41_ += 8;
		anInt611 = i_41_;
		return true;
	}
}
