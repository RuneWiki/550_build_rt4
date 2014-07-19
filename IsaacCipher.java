/* Class106 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class IsaacCipher {
	private int anInt1010;
	static js5 aClass50_1011;
	private int anInt1012;
	static int crossY = 0;
	private int anInt1014;
	static int[] anIntArray1015;
	private int anInt1016;
	private final int[] anIntArray1017;
	private final int[] anIntArray1018 = new int[256];
	static js5 aClass50_1019;

	static final void drawTitleScreenSprites(final js5 js5) {
		if (!Class101_Sub3.titleScreenSpritesDrawn) {
			if (!HDToolkit.glEnabled) {
				GraphicsLD.clearPixels();
			} else {
				GraphicsHD.clearPixels();
			}
			KeyboardHandler.titlebgSprite = Class26.constructAbstractSprite(js5, StructType.titlebgId);
			final int canvasHeight = Class120_Sub12_Sub5.canvasHeight;
			final int i_1_ = 956 * canvasHeight / 503;
			KeyboardHandler.titlebgSprite.method1588((Class69_Sub1.canvasWidth - i_1_) / 2, 0, i_1_, canvasHeight);
			Class120_Sub12_Sub27.logoSprite = Class153.constructAbstractIndexedSprite(js5, Class108_Sub1.logoId);
			Class120_Sub12_Sub27.logoSprite.method910(Class69_Sub1.canvasWidth / 2 - (Class120_Sub12_Sub27.logoSprite.width / 2), 18);
			Class101_Sub3.titleScreenSpritesDrawn = true;
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
				method906();
				anInt1010 = 256;
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("m.C(").append(i).append(')').toString());
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
			throw EnumType.method1428(runtimeexception, new StringBuilder("m.F(").append(i).append(')').toString());
		}
	}

	final int method903() {
		if (anInt1010-- == 0) {
			method906();
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

	static final LDSprite constructLDSprite(final js5 js5, final int groupId) {
		if (!ObjType.decodedSprites(js5, groupId)) {
			return null;
		}
		return HintIcon.constructLDSprite();
	}

	static final void method905(final int i_13_) {
		Class54.anIntArray488 = new int[i_13_];
		StringNode.anIntArray2735 = new int[i_13_];
		Class134.anIntArray1284 = new int[i_13_];
		IntegerNode.anIntArray2787 = new int[i_13_];
		Class180_Sub6.anIntArray3075 = new int[i_13_];
	}

	private final void method906() {
		anInt1014 += ++anInt1012;
		for (int i_14_ = 0; i_14_ < 256; i_14_++) {
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
	}

	static final long method907(final String string) {
		final int i_17_ = string.length();
		long l_18_ = 0L;
		for (int i_19_ = 0; i_19_ < i_17_; i_19_++) {
			l_18_ = string.charAt(i_19_) + (l_18_ << 5) - l_18_;
		}
		return l_18_;
	}
}
