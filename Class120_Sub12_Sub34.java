/* Class120_Sub12_Sub34 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class120_Sub12_Sub34 extends Class120_Sub12 {
	static int[] anIntArray3409;

	public static void method1378(final int i) {
		try {
			if (i != 8) {
				method1379(null, (byte) -115);
			}
			anIntArray3409 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("tc.S(").append(i).append(')').toString());
		}
	}

	static final void method1379(final Class189 class189, final byte i) {
		try {
			final Class189 class189_0_ = Class120_Sub17.method1665(72, class189);
			int i_1_;
			int i_2_;
			if (class189_0_ != null) {
				i_2_ = class189_0_.anInt1948;
				i_1_ = class189_0_.anInt2059;
			} else {
				i_1_ = Class120_Sub12_Sub5.canvasHeight;
				i_2_ = Class69_Sub1.canvasWidth;
			}
			Class23.method201(false, i_2_, class189, i_1_, -4);
			Class180.method2272(i_2_, i_1_, class189, 125);
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("tc.R(").append(class189 != null ? "{...}" : "null").append(',').append(i).append(')').toString());
		}
	}

	static final boolean method1380(final int i, final int i_3_, final int i_4_) {
		for (int i_5_ = 0; i_5_ < CursorType.anInt1237; i_5_++) {
			final Class188 class188 = Class180_Sub6.aClass188Array3076[i_5_];
			if (class188.anInt1921 == 1) {
				final int i_6_ = class188.anInt1913 - i;
				if (i_6_ > 0) {
					final int i_7_ = class188.anInt1911 + (class188.anInt1914 * i_6_ >> 8);
					final int i_8_ = class188.anInt1927 + (class188.anInt1922 * i_6_ >> 8);
					final int i_9_ = class188.anInt1920 + (class188.anInt1918 * i_6_ >> 8);
					final int i_10_ = class188.anInt1928 + (class188.anInt1917 * i_6_ >> 8);
					if (i_4_ >= i_7_ && i_4_ <= i_8_ && i_3_ >= i_9_ && i_3_ <= i_10_) {
						return true;
					}
				}
			} else if (class188.anInt1921 == 2) {
				final int i_11_ = i - class188.anInt1913;
				if (i_11_ > 0) {
					final int i_12_ = class188.anInt1911 + (class188.anInt1914 * i_11_ >> 8);
					final int i_13_ = class188.anInt1927 + (class188.anInt1922 * i_11_ >> 8);
					final int i_14_ = class188.anInt1920 + (class188.anInt1918 * i_11_ >> 8);
					final int i_15_ = class188.anInt1928 + (class188.anInt1917 * i_11_ >> 8);
					if (i_4_ >= i_12_ && i_4_ <= i_13_ && i_3_ >= i_14_ && i_3_ <= i_15_) {
						return true;
					}
				}
			} else if (class188.anInt1921 == 3) {
				final int i_16_ = class188.anInt1911 - i_4_;
				if (i_16_ > 0) {
					final int i_17_ = class188.anInt1913 + (class188.anInt1912 * i_16_ >> 8);
					final int i_18_ = class188.anInt1924 + (class188.anInt1926 * i_16_ >> 8);
					final int i_19_ = class188.anInt1920 + (class188.anInt1918 * i_16_ >> 8);
					final int i_20_ = class188.anInt1928 + (class188.anInt1917 * i_16_ >> 8);
					if (i >= i_17_ && i <= i_18_ && i_3_ >= i_19_ && i_3_ <= i_20_) {
						return true;
					}
				}
			} else if (class188.anInt1921 == 4) {
				final int i_21_ = i_4_ - class188.anInt1911;
				if (i_21_ > 0) {
					final int i_22_ = class188.anInt1913 + (class188.anInt1912 * i_21_ >> 8);
					final int i_23_ = class188.anInt1924 + (class188.anInt1926 * i_21_ >> 8);
					final int i_24_ = class188.anInt1920 + (class188.anInt1918 * i_21_ >> 8);
					final int i_25_ = class188.anInt1928 + (class188.anInt1917 * i_21_ >> 8);
					if (i >= i_22_ && i <= i_23_ && i_3_ >= i_24_ && i_3_ <= i_25_) {
						return true;
					}
				}
			} else if (class188.anInt1921 == 5) {
				final int i_26_ = i_3_ - class188.anInt1920;
				if (i_26_ > 0) {
					final int i_27_ = class188.anInt1913 + (class188.anInt1912 * i_26_ >> 8);
					final int i_28_ = class188.anInt1924 + (class188.anInt1926 * i_26_ >> 8);
					final int i_29_ = class188.anInt1911 + (class188.anInt1914 * i_26_ >> 8);
					final int i_30_ = class188.anInt1927 + (class188.anInt1922 * i_26_ >> 8);
					if (i >= i_27_ && i <= i_28_ && i_4_ >= i_29_ && i_4_ <= i_30_) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@Override
	final void method1180(final byte i, final Buffer class120_sub7, final int i_31_) {
		try {
			if (i_31_ == 0) {
				this.aBoolean2558 = class120_sub7.getUByte() == 1;
			}
			if (i != -43) {
				method1380(90, 65, 93);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("tc.M(").append(i).append(',').append(class120_sub7 != null ? "{...}" : "null").append(',').append(i_31_).append(')').toString());
		}
	}

	public Class120_Sub12_Sub34() {
		super(1, false);
	}

	@Override
	final int[] method1187(final int i, final int i_32_) {
		int[] is;
		try {
			final int[] is_33_ = this.aClass30_2563.method258(i_32_, -116);
			if (this.aClass30_2563.aBoolean238) {
				final int[] is_34_ = method1192(i ^ 0x1895, i_32_, 0);
				for (int i_35_ = 0; Class120_Sub12_Sub7.anInt3178 > i_35_; i_35_++) {
					is_33_[i_35_] = -is_34_[i_35_] + 4096;
				}
			}
			if (i != -1735) {
				return null;
			}
			is = is_33_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("tc.D(").append(i).append(',').append(i_32_).append(')').toString());
		}
		return is;
	}

	@Override
	final int[][] method1188(final int i, final int i_36_) {
		int[][] is;
		try {
			if (i_36_ != -29869) {
				anIntArray3409 = null;
			}
			final int[][] is_37_ = this.aClass109_2559.method975(i, -83);
			if (this.aClass109_2559.aBoolean1049) {
				final int[][] is_38_ = method1179(0, i, (byte) -51);
				final int[] is_39_ = is_38_[0];
				final int[] is_40_ = is_38_[2];
				final int[] is_41_ = is_37_[0];
				final int[] is_42_ = is_38_[1];
				final int[] is_43_ = is_37_[1];
				final int[] is_44_ = is_37_[2];
				for (int i_45_ = 0; Class120_Sub12_Sub7.anInt3178 > i_45_; i_45_++) {
					is_41_[i_45_] = -is_39_[i_45_] + 4096;
					is_43_[i_45_] = -is_42_[i_45_] + 4096;
					is_44_[i_45_] = 4096 + -is_40_[i_45_];
				}
			}
			is = is_37_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("tc.K(").append(i).append(',').append(i_36_).append(')').toString());
		}
		return is;
	}
}
