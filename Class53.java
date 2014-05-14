/* Class53 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class53 {
	static int[] anIntArray485 = { 1, 2, 4, 8 };
	static String[] suffixTitles;
	static int anInt487;

	public static void method456(final byte i) {
		try {
			suffixTitles = null;
			anIntArray485 = null;
			if (i != 126) {
				method457(null, (byte) -77);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ga.E(").append(i).append(')').toString());
		}
	}

	static final void method457(final Class120_Sub24 class120_sub24, final byte i) {
		try {
			int i_0_ = -1;
			int i_1_ = 0;
			long l = 0L;
			if (class120_sub24.anInt2721 == 0) {
				l = Class114.method1005(class120_sub24.anInt2722, class120_sub24.anInt2731, class120_sub24.anInt2725);
			}
			if (i < -83) {
				if (class120_sub24.anInt2721 == 1) {
					l = JagexInterface.method2502(class120_sub24.anInt2722, class120_sub24.anInt2731, class120_sub24.anInt2725);
				}
				int i_2_ = 0;
				if (class120_sub24.anInt2721 == 2) {
					l = Class120_Sub11.method1173(class120_sub24.anInt2722, class120_sub24.anInt2731, class120_sub24.anInt2725);
				}
				if (class120_sub24.anInt2721 == 3) {
					l = Class79_Sub1.method696(class120_sub24.anInt2722, class120_sub24.anInt2731, class120_sub24.anInt2725);
				}
				if (l != 0L) {
					i_1_ = (0x7fc95 & (int) l) >> 14;
					i_2_ = 0x3 & (int) l >> 20;
					i_0_ = 0x7fffffff & (int) (l >>> 32);
				}
				class120_sub24.anInt2729 = i_2_;
				class120_sub24.anInt2728 = i_1_;
				class120_sub24.anInt2723 = i_0_;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ga.C(").append(class120_sub24 != null ? "{...}" : "null").append(',').append(i).append(')').toString());
		}
	}

	abstract int method458(int i, int i_3_);

	abstract void method459(int i, int i_4_);

	abstract byte[] method460(int i, int i_5_);

	static final Class120_Sub14_Sub8_Sub2 method461(final byte[] is, final byte i) {
		Class120_Sub14_Sub8_Sub2 class120_sub14_sub8_sub2;
		try {
			if (is == null) {
				return null;
			}
			if (i > -59) {
				return null;
			}
			final Class120_Sub14_Sub8_Sub2 class120_sub14_sub8_sub2_6_ = new Class120_Sub14_Sub8_Sub2(is, Class180_Sub4.spriteXOffsets, GroundTile.spriteYOffsets, Class120_Sub12_Sub11.spriteWidths, Class120_Sub12_Sub39.spriteHeights, Class145.spritePaletteIndicators);
			Class53_Sub1.resetSpriteInfo();
			class120_sub14_sub8_sub2 = class120_sub14_sub8_sub2_6_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ga.G(").append(is != null ? "{...}" : "null").append(',').append(i).append(')').toString());
		}
		return class120_sub14_sub8_sub2;
	}

	public Class53() {
		/* empty */
	}

	abstract Class52 method462();
}
