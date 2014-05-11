/* Class120_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class120_Sub1 extends Node {
	int[] anIntArray2402;
	static SignlinkNode aClass185_2403;
	int anInt2404;
	int[] anIntArray2405;
	static Class21 aClass21_2406;
	boolean[] aBooleanArray2407;
	int anInt2408;
	static int[] anIntArray2409 = new int[5];
	int[][] anIntArrayArray2410;
	static Class120_Sub18[][][] aClass120_Sub18ArrayArrayArray2411;
	static int[] anIntArray2412;
	static Class50 aClass50_2413;
	static int anInt2414;

	static {
		aClass21_2406 = new Class21(50);
		anIntArray2412 = new int[5];
		anInt2414 = 0;
	}

	static final Class184 method1035(final int i, final int i_0_) {
		Class184 class184;
		try {
			if (i_0_ != 0) {
				method1037((byte) -2);
			}
			Class184 class184_1_ = (Class184) Class56.aClass21_494.method193(i, (byte) -124);
			if (class184_1_ != null) {
				return class184_1_;
			}
			final byte[] is = Class120_Sub6.aClass50_2450.method442(Class53_Sub1.method465(114, i), (byte) 120, Class120_Sub18.method1667(true, i));
			class184_1_ = new Class184();
			class184_1_.anInt1877 = i;
			if (is != null) {
				class184_1_.method2457(-1, new Buffer(is));
			}
			class184_1_.method2469(125);
			if (!Class69_Sub2.aBoolean2234 && class184_1_.aBoolean1851) {
				class184_1_.aStringArray1849 = null;
			}
			if (class184_1_.aBoolean1880) {
				class184_1_.anInt1821 = 0;
				class184_1_.aBoolean1844 = false;
			}
			Class56.aClass21_494.method185(-126, class184_1_, i);
			class184 = class184_1_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("af.E(").append(i).append(',').append(i_0_).append(')').toString());
		}
		return class184;
	}

	static final void method1036(final int i, final int i_2_, final int i_3_, final int i_4_, final byte i_5_, final int i_6_, final int i_7_) {
		try {
			if (i_5_ != 84) {
				method1037((byte) -110);
			}
			if (Class32.anInt260 > -i + i_6_ || i + i_6_ > Class120_Sub14_Sub11.anInt3544 || i_3_ - i < Class120_Sub30_Sub2.anInt3699 || Class139.anInt1334 < i + i_3_) {
				Class45.method356(i, i_7_, i_6_, i_2_, i_5_ + -85, i_4_, i_3_);
			} else {
				AbstractMouseWheelHandler.method158(i_7_, i_2_, true, i, i_4_, i_6_, i_3_);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("af.C(").append(i).append(',').append(i_2_).append(',').append(i_3_).append(',').append(i_4_).append(',').append(i_5_).append(',').append(i_6_).append(',').append(i_7_).append(')').toString());
		}
	}

	static final void method1037(final byte i) {
		try {
			Class57.anInt504 = 0;
			Class86.anInt819 = 1;
			Class120_Sub12_Sub5.aBoolean3163 = false;
			if (i == -120) {
				Class121.anInt1153 = 0;
				Class150.anInt1408 = 0;
				Class120_Sub22.anInt2672 = -1;
				Class48.anInt436 = -3;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("af.D(").append(i).append(')').toString());
		}
	}

	public static void method1038(final int i) {
		try {
			if (i != 5) {
				anIntArray2412 = null;
			}
			aClass21_2406 = null;
			anIntArray2412 = null;
			anIntArray2409 = null;
			aClass120_Sub18ArrayArrayArray2411 = null;
			aClass185_2403 = null;
			aClass50_2413 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("af.A(").append(i).append(')').toString());
		}
	}

	static final LDSprite[] method1039(final int i) {
		LDSprite[] class120_sub14_sub19_sub2s;
		try {
			final LDSprite[] class120_sub14_sub19_sub2s_8_ = new LDSprite[Class93.spriteAmount];
			for (int i_9_ = 0; i_9_ < Class93.spriteAmount; i_9_++) {
				final int i_10_ = Class120_Sub12_Sub39.spriteHeights[i_9_] * Class120_Sub12_Sub11.spriteWidths[i_9_];
				final int[] is = new int[i_10_];
				final byte[] is_11_ = Class145.spritePaletteIndicators[i_9_];
				for (int i_12_ = 0; i_10_ > i_12_; i_12_++) {
					is[i_12_] = Class132_Sub1.spritePalette[Class120_Sub12_Sub3.method1207(255, is_11_[i_12_])];
				}
				class120_sub14_sub19_sub2s_8_[i_9_] = new LDSprite(Class31.spriteTrimWidth, Class180_Sub1.spriteTrimHeight, Class180_Sub4.spriteXOffsets[i_9_], Class120_Sub18.spriteYOffsets[i_9_], Class120_Sub12_Sub11.spriteWidths[i_9_], Class120_Sub12_Sub39.spriteHeights[i_9_], is);
			}
			if (i != 5325) {
				method1038(-127);
			}
			Class53_Sub1.resetSpriteInfo();
			class120_sub14_sub19_sub2s = class120_sub14_sub19_sub2s_8_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("af.B(").append(i).append(')').toString());
		}
		return class120_sub14_sub19_sub2s;
	}

	Class120_Sub1(final int i, final byte[] is) {
		this.anInt2408 = i;
		final Buffer class120_sub7 = new Buffer(is);
		this.anInt2404 = class120_sub7.getUByte();
		this.anIntArray2402 = new int[this.anInt2404];
		this.anIntArray2405 = new int[this.anInt2404];
		this.aBooleanArray2407 = new boolean[this.anInt2404];
		this.anIntArrayArray2410 = new int[this.anInt2404][];
		for (int i_13_ = 0; this.anInt2404 > i_13_; i_13_++) {
			this.anIntArray2402[i_13_] = class120_sub7.getUByte();
		}
		for (int i_14_ = 0; this.anInt2404 > i_14_; i_14_++) {
			this.aBooleanArray2407[i_14_] = class120_sub7.getUByte() == 1;
		}
		for (int i_15_ = 0; i_15_ < this.anInt2404; i_15_++) {
			this.anIntArray2405[i_15_] = class120_sub7.getUShort();
		}
		for (int i_16_ = 0; i_16_ < this.anInt2404; i_16_++) {
			this.anIntArrayArray2410[i_16_] = new int[class120_sub7.getUByte()];
		}
		for (int i_17_ = 0; this.anInt2404 > i_17_; i_17_++) {
			for (int i_18_ = 0; i_18_ < this.anIntArrayArray2410[i_17_].length; i_18_++) {
				this.anIntArrayArray2410[i_17_][i_18_] = class120_sub7.getUByte();
			}
		}
	}
}
