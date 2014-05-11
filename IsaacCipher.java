/* Class106 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class IsaacCipher {
	private int anInt1010;
	static Class50 aClass50_1011;
	private int anInt1012;
	static int crossY = 0;
	private int anInt1014;
	static int[] anIntArray1015;
	private int anInt1016;
	private final int[] anIntArray1017;
	private final int[] anIntArray1018 = new int[256];
	static Class50 aClass50_1019;

	static final void method900(final int i, final Class50 class50) {
		try {
			if (!Class101_Sub3.aBoolean2291 && i > 50) {
				if (!HDToolkit.glEnabled) {
					GraphicsLD.method2173();
				} else {
					GraphicsHD.method599();
				}
				KeyboardHandler.aClass120_Sub14_Sub19_1508 = Class26.method229(-1, Class120_Sub14_Sub16.anInt3589, class50);
				final int i_0_ = Class120_Sub12_Sub5.canvasHeight;
				final int i_1_ = 956 * i_0_ / 503;
				KeyboardHandler.aClass120_Sub14_Sub19_1508.method1588((-i_1_ + Class69_Sub1.canvasWidth) / 2, 0, i_1_, i_0_);
				Class120_Sub12_Sub27.aClass107_3354 = Class153.method2069(26494, class50, Class108_Sub1.anInt2328);
				Class120_Sub12_Sub27.aClass107_3354.method910(-(Class120_Sub12_Sub27.aClass107_3354.anInt1026 / 2) + Class69_Sub1.canvasWidth / 2, 18);
				Class101_Sub3.aBoolean2291 = true;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("m.D(").append(i).append(',').append(class50 != null ? "{...}" : "null").append(')').toString());
		}
	}

	private final void method901(final int i) {
		try {
			int i_3_;
			int i_4_;
			int i_5_;
			int i_6_;
			int i_7_;
			int i_8_;
			int i_9_;
			int i_2_ = i_3_ = i_4_ = i_5_ = i_6_ = i_7_ = i_8_ = i_9_ = -1640531527;
			int i_10_ = 0;
			if (i == 1) {
				for (/**/; i_10_ < 4; i_10_++) {
					i_2_ ^= i_3_ << 11;
					i_5_ += i_2_;
					i_3_ += i_4_;
					i_3_ ^= i_4_ >>> 2;
					i_4_ += i_5_;
					i_4_ ^= i_5_ << 8;
					i_6_ += i_3_;
					i_5_ += i_6_;
					i_5_ ^= i_6_ >>> 16;
					i_8_ += i_5_;
					i_7_ += i_4_;
					i_6_ += i_7_;
					i_6_ ^= i_7_ << 10;
					i_7_ += i_8_;
					i_7_ ^= i_8_ >>> 4;
					i_9_ += i_6_;
					i_8_ += i_9_;
					i_2_ += i_7_;
					i_8_ ^= i_9_ << 8;
					i_3_ += i_8_;
					i_9_ += i_2_;
					i_9_ ^= i_2_ >>> 9;
					i_2_ += i_3_;
					i_4_ += i_9_;
				}
				for (i_10_ = 0; i_10_ < 256; i_10_ += 8) {
					i_9_ += anIntArray1017[i_10_ + 7];
					i_8_ += anIntArray1017[6 + i_10_];
					i_3_ += anIntArray1017[i_10_ + 1];
					i_6_ += anIntArray1017[i_10_ + 4];
					i_7_ += anIntArray1017[i_10_ - -5];
					i_2_ += anIntArray1017[i_10_];
					i_2_ ^= i_3_ << 11;
					i_5_ += anIntArray1017[3 + i_10_];
					i_4_ += anIntArray1017[i_10_ + 2];
					i_3_ += i_4_;
					i_3_ ^= i_4_ >>> 2;
					i_6_ += i_3_;
					i_5_ += i_2_;
					i_4_ += i_5_;
					i_4_ ^= i_5_ << 8;
					i_7_ += i_4_;
					i_5_ += i_6_;
					i_5_ ^= i_6_ >>> 16;
					i_8_ += i_5_;
					i_6_ += i_7_;
					i_6_ ^= i_7_ << 10;
					i_9_ += i_6_;
					i_7_ += i_8_;
					i_7_ ^= i_8_ >>> 4;
					i_8_ += i_9_;
					i_8_ ^= i_9_ << 8;
					i_2_ += i_7_;
					i_9_ += i_2_;
					i_9_ ^= i_2_ >>> 9;
					i_3_ += i_8_;
					i_2_ += i_3_;
					i_4_ += i_9_;
					anIntArray1018[i_10_] = i_2_;
					anIntArray1018[i_10_ - -1] = i_3_;
					anIntArray1018[i_10_ + 2] = i_4_;
					anIntArray1018[i_10_ + 3] = i_5_;
					anIntArray1018[4 + i_10_] = i_6_;
					anIntArray1018[5 + i_10_] = i_7_;
					anIntArray1018[i_10_ + 6] = i_8_;
					anIntArray1018[7 + i_10_] = i_9_;
				}
				for (i_10_ = 0; i_10_ < 256; i_10_ += 8) {
					i_6_ += anIntArray1018[4 + i_10_];
					i_5_ += anIntArray1018[3 + i_10_];
					i_3_ += anIntArray1018[i_10_ - -1];
					i_4_ += anIntArray1018[2 + i_10_];
					i_8_ += anIntArray1018[6 + i_10_];
					i_7_ += anIntArray1018[i_10_ + 5];
					i_2_ += anIntArray1018[i_10_];
					i_9_ += anIntArray1018[i_10_ - -7];
					i_2_ ^= i_3_ << 11;
					i_5_ += i_2_;
					i_3_ += i_4_;
					i_3_ ^= i_4_ >>> 2;
					i_6_ += i_3_;
					i_4_ += i_5_;
					i_4_ ^= i_5_ << 8;
					i_5_ += i_6_;
					i_5_ ^= i_6_ >>> 16;
					i_7_ += i_4_;
					i_6_ += i_7_;
					i_8_ += i_5_;
					i_6_ ^= i_7_ << 10;
					i_9_ += i_6_;
					i_7_ += i_8_;
					i_7_ ^= i_8_ >>> 4;
					i_2_ += i_7_;
					i_8_ += i_9_;
					i_8_ ^= i_9_ << 8;
					i_3_ += i_8_;
					i_9_ += i_2_;
					i_9_ ^= i_2_ >>> 9;
					i_2_ += i_3_;
					anIntArray1018[i_10_] = i_2_;
					anIntArray1018[i_10_ + 1] = i_3_;
					i_4_ += i_9_;
					anIntArray1018[2 + i_10_] = i_4_;
					anIntArray1018[3 + i_10_] = i_5_;
					anIntArray1018[4 + i_10_] = i_6_;
					anIntArray1018[i_10_ + 5] = i_7_;
					anIntArray1018[6 + i_10_] = i_8_;
					anIntArray1018[i_10_ + 7] = i_9_;
				}
				method906(i + -1);
				anInt1010 = 256;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("m.C(").append(i).append(')').toString());
		}
	}

	public static void method902(final int i) {
		try {
			anIntArray1015 = null;
			if (i != 2) {
				method902(-26);
			}
			aClass50_1011 = null;
			aClass50_1019 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("m.F(").append(i).append(')').toString());
		}
	}

	final int method903() {
		if (anInt1010-- == 0) {
			method906(0);
			anInt1010 = 255;
		}
		return 0;
		//return anIntArray1017[anInt1010];
	}

	IsaacCipher(final int[] is) {
		anIntArray1017 = new int[256];
		for (int i = 0; i < is.length; i++) {
			anIntArray1017[i] = is[i];
		}
		method901(1);
	}

	static final LDSprite method904(final Class50 class50, final int i, final byte i_12_) {
		LDSprite class120_sub14_sub19_sub2;
		try {
			if (!ObjType.method2113(class50, -5, i)) {
				return null;
			}
			if (i_12_ != 118) {
				return null;
			}
			class120_sub14_sub19_sub2 = Class85.method722(90);
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("m.E(").append(class50 != null ? "{...}" : "null").append(',').append(i).append(',').append(i_12_).append(')').toString());
		}
		return class120_sub14_sub19_sub2;
	}

	static final void method905(final int i, final int i_13_) {
		try {
			Class54.anIntArray488 = new int[i_13_];
			StringNode.anIntArray2735 = new int[i_13_];
			Class134.anIntArray1284 = new int[i_13_];
			if (i == 16448) {
				Class120_Sub32.anIntArray2787 = new int[i_13_];
				Class180_Sub6.anIntArray3075 = new int[i_13_];
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("m.G(").append(i).append(',').append(i_13_).append(')').toString());
		}
	}

	private final void method906(final int i) {
		try {
			anInt1014 += ++anInt1012;
			for (int i_14_ = i; i_14_ < 256; i_14_++) {
				final int i_15_ = anIntArray1018[i_14_];
				if ((0x2 & i_14_) == 0) {
					if ((i_14_ & 0x1) != 0) {
						anInt1016 ^= anInt1016 >>> 6;
					} else {
						anInt1016 ^= anInt1016 << 13;
					}
				} else if ((i_14_ & 0x1) != 0) {
					anInt1016 ^= anInt1016 >>> 16;
				} else {
					anInt1016 ^= anInt1016 << 2;
				}
				anInt1016 += anIntArray1018[0xff & i_14_ + 128];
				int i_16_;
				anIntArray1018[i_14_] = i_16_ = anInt1014 + anIntArray1018[Class120_Sub12_Sub3.method1207(i_15_, 1020) >> 2] - -anInt1016;
				anIntArray1017[i_14_] = anInt1014 = anIntArray1018[Class120_Sub12_Sub3.method1207(255, i_16_ >> 8 >> 2)] - -i_15_;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("m.H(").append(i).append(')').toString());
		}
	}

	static final long method907(final byte i, final String string) {
		long l;
		try {
			if (i < 67) {
				return -16L;
			}
			final int i_17_ = string.length();
			long l_18_ = 0L;
			for (int i_19_ = 0; i_19_ < i_17_; i_19_++) {
				l_18_ = string.charAt(i_19_) + (l_18_ << 5) - l_18_;
			}
			l = l_18_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("m.B(").append(i).append(',').append(string != null ? "{...}" : "null").append(')').toString());
		}
		return l;
	}
}
