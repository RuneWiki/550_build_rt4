/* Class151 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class151 {
	int anInt1418;
	static boolean aBoolean1419 = false;
	static int anInt1420 = 0;
	static String aString1421;
	String aString1422;

	static final void method2065(final Class189[] class189s, final boolean bool, final int i, final int i_0_, final int i_1_, final int i_2_) {
		try {
			for (final Class189 class1892 : class189s) {
				final Class189 class189 = class1892;
				if (class189 != null && class189.anInt2029 == i_0_) {
					Class23.method201(bool, i, class189, i_1_, -4);
					Class180.method2272(i, i_1_, class189, 97);
					if (class189.anInt2021 > -class189.anInt2059 + class189.anInt1937) {
						class189.anInt2021 = -class189.anInt2059 + class189.anInt1937;
					}
					if (class189.anInt2023 > class189.anInt1930 + -class189.anInt1948) {
						class189.anInt2023 = class189.anInt1930 + -class189.anInt1948;
					}
					if (class189.anInt2021 < 0) {
						class189.anInt2021 = 0;
					}
					if (class189.anInt2023 < 0) {
						class189.anInt2023 = 0;
					}
					if (class189.anInt1995 == 0) {
						ProducingGraphicsBuffer.method1854(bool, false, class189);
					}
				}
			}
			if (i_2_ >= -100) {
				method2066((byte) -75, 90);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("rf.B(").append(class189s != null ? "{...}" : "null").append(',').append(bool).append(',').append(i).append(',').append(i_0_).append(',').append(i_1_).append(',').append(i_2_).append(')').toString());
		}
	}

	static final void method2066(final byte i, final int i_4_) {
		try {
			Class136.anInt1321 = 100;
			Class96.anInt919 = 3;
			if (i == -121) {
				Class120_Sub12_Sub9.anInt3195 = -1;
				Class127.anInt1215 = i_4_;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("rf.C(").append(i).append(',').append(i_4_).append(')').toString());
		}
	}

	static final void method2067(final int i, final int i_5_, final int i_6_, final int i_7_, final int i_8_, final int i_9_, final int i_10_, final int i_11_, final int i_12_, final int i_13_) {
		try {
			if (i_11_ == -17731) {
				if (i_7_ == i && i_8_ == i_9_ && i_13_ == i_6_ && i_5_ == i_10_) {
					Class120_Sub12_Sub32.method1369(i_9_, i_10_, i_12_, -29, i, i_6_);
				} else {
					int i_14_ = i;
					int i_15_ = i_9_;
					final int i_16_ = 3 * i;
					final int i_17_ = 3 * i_8_;
					final int i_18_ = 3 * i_7_;
					final int i_19_ = 3 * i_13_;
					final int i_20_ = -i + -i_19_ + i_6_ - -i_18_;
					final int i_21_ = 3 * i_9_;
					final int i_22_ = i_16_ + -i_18_ + -i_18_ + i_19_;
					final int i_23_ = i_5_ * 3;
					final int i_24_ = -i_17_ + i_23_ + -i_17_ - -i_21_;
					final int i_25_ = -i_9_ + i_17_ + i_10_ + -i_23_;
					final int i_26_ = i_18_ - i_16_;
					final int i_27_ = i_17_ - i_21_;
					for (int i_28_ = 128; i_28_ <= 4096; i_28_ += 128) {
						final int i_29_ = i_28_ * i_28_ >> 12;
						final int i_30_ = i_29_ * i_22_;
						final int i_31_ = i_28_ * i_29_ >> 12;
						final int i_32_ = i_31_ * i_20_;
						final int i_33_ = i_27_ * i_28_;
						final int i_34_ = i_24_ * i_29_;
						final int i_35_ = i_25_ * i_31_;
						final int i_36_ = i_26_ * i_28_;
						final int i_37_ = (i_36_ + i_30_ + i_32_ >> 12) + i;
						final int i_38_ = (i_33_ + i_35_ - -i_34_ >> 12) + i_9_;
						Class120_Sub12_Sub32.method1369(i_15_, i_38_, i_12_, -40, i_14_, i_37_);
						i_15_ = i_38_;
						i_14_ = i_37_;
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("rf.D(").append(i).append(',').append(i_5_).append(',').append(i_6_).append(',').append(i_7_).append(',').append(i_8_).append(',').append(i_9_).append(',').append(i_10_).append(',').append(i_11_).append(',')
					.append(i_12_).append(',').append(i_13_).append(')').toString());
		}
	}

	public static void method2068(final boolean bool) {
		try {
			aString1421 = null;
			if (bool) {
				method2065(null, false, 101, -99, 41, -24);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("rf.A(").append(bool).append(')').toString());
		}
	}
}
