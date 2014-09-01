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
			throw EnumType.method1428(runtimeexception, new StringBuilder("ga.E(").append(i).append(')').toString());
		}
	}

	static final void method457(final Class120_Sub24 class120_sub24, final byte i) {
		try {
			int i_0_ = -1;
			int i_1_ = 0;
			long l = 0L;
			if (class120_sub24.anInt2721 == 0) {
				l = Class114.method1005(class120_sub24.anInt2731, class120_sub24.anInt2725, class120_sub24.anInt2722);
			}
			if (i < -83) {
				if (class120_sub24.anInt2721 == 1) {
					l = JagexInterface.method2502(class120_sub24.anInt2731, class120_sub24.anInt2725, class120_sub24.anInt2722);
				}
				int i_2_ = 0;
				if (class120_sub24.anInt2721 == 2) {
					l = Class120_Sub11.method1173(class120_sub24.anInt2731, class120_sub24.anInt2725, class120_sub24.anInt2722);
				}
				if (class120_sub24.anInt2721 == 3) {
					l = Class79_Sub1.method696(class120_sub24.anInt2731, class120_sub24.anInt2725, class120_sub24.anInt2722);
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
			throw EnumType.method1428(runtimeexception, new StringBuilder("ga.C(").append(class120_sub24 != null ? "{...}" : "null").append(',').append(i).append(')').toString());
		}
	}

	abstract int getCompletion(int i);

	abstract void method459(int id);

	abstract byte[] method460(int i_5_);

	static final LDFont constructLDFont(final byte[] data) {
		if (data == null) {
			return null;
		}
		final LDFont ldFont = new LDFont(data, Projectile.spriteXOffsets, GroundTile.spriteYOffsets, Class120_Sub12_Sub11.spriteWidths, Class120_Sub12_Sub39.spriteHeights, Class145.spritePaletteIndicators);
		Class53_Sub1.resetSpriteInfo();
		return ldFont;
	}

	public Class53() {
		/* empty */
	}

	abstract MasterIndexInfo method462();
}
