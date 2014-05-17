/* Class85 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class85 {
	static int anInt802;
	static boolean showFps = true;
	int anInt804;
	int anInt805;
	static long[] aLongArray806 = new long[100];
	static String aString807 = "wave:";
	int anInt808;
	int anInt809;
	int anInt810;
	int anInt811 = -1;
	int anInt812;
	int anInt813;
	int anInt814;
	int anInt815;

	static final LDSprite method722() {
		final byte[] is = Class145.spritePaletteIndicators[0];
		final int i_0_ = Class120_Sub12_Sub11.spriteWidths[0] * Class120_Sub12_Sub39.spriteHeights[0];
		final int[] is_1_ = new int[i_0_];
		for (int i_2_ = 0; i_2_ < i_0_; i_2_++) {
			is_1_[i_2_] = Class132_Sub1.spritePalette[is[i_2_] & 0xff];
		}
		final LDSprite class120_sub14_sub19_sub2_3_ = new LDSprite(Class31.spriteTrimWidth, SceneGroundObject.spriteTrimHeight, Class180_Sub4.spriteXOffsets[0], GroundTile.spriteYOffsets[0], Class120_Sub12_Sub11.spriteWidths[0], Class120_Sub12_Sub39.spriteHeights[0], is_1_);
		Class53_Sub1.resetSpriteInfo();
		return class120_sub14_sub19_sub2_3_;
	}

	static final boolean method723(final int i, final int i_4_, final int i_5_, final int i_6_, final int i_7_, final int i_8_) {
		if (i_4_ == i_5_ && i_6_ == i_7_) {
			if (!Class69_Sub1.method618(i, i_4_, i_6_)) {
				return false;
			}
			final int i_9_ = i_4_ << 7;
			final int i_10_ = i_6_ << 7;
			if (Class120_Sub12_Sub34.method1380(i_9_ + 1, OverridedJInterface.anIntArrayArrayArray2741[i][i_4_][i_6_] + i_8_, i_10_ + 1) && Class120_Sub12_Sub34.method1380(i_9_ + 128 - 1, OverridedJInterface.anIntArrayArrayArray2741[i][i_4_ + 1][i_6_] + i_8_, i_10_ + 1)
					&& Class120_Sub12_Sub34.method1380(i_9_ + 128 - 1, OverridedJInterface.anIntArrayArrayArray2741[i][i_4_ + 1][i_6_ + 1] + i_8_, i_10_ + 128 - 1) && Class120_Sub12_Sub34.method1380(i_9_ + 1, OverridedJInterface.anIntArrayArrayArray2741[i][i_4_][i_6_ + 1] + i_8_, i_10_ + 128 - 1)) {
				return true;
			}
			return false;
		}
		for (int i_11_ = i_4_; i_11_ <= i_5_; i_11_++) {
			for (int i_12_ = i_6_; i_12_ <= i_7_; i_12_++) {
				if (JagexSocket.anIntArrayArrayArray419[i][i_11_][i_12_] == -Class120_Sub12_Sub9.anInt3193) {
					return false;
				}
			}
		}
		final int i_13_ = (i_4_ << 7) + 1;
		final int i_14_ = (i_6_ << 7) + 2;
		final int i_15_ = OverridedJInterface.anIntArrayArrayArray2741[i][i_4_][i_6_] + i_8_;
		if (!Class120_Sub12_Sub34.method1380(i_13_, i_15_, i_14_)) {
			return false;
		}
		final int i_16_ = (i_5_ << 7) - 1;
		if (!Class120_Sub12_Sub34.method1380(i_16_, i_15_, i_14_)) {
			return false;
		}
		final int i_17_ = (i_7_ << 7) - 1;
		if (!Class120_Sub12_Sub34.method1380(i_13_, i_15_, i_17_)) {
			return false;
		}
		if (!Class120_Sub12_Sub34.method1380(i_16_, i_15_, i_17_)) {
			return false;
		}
		return true;
	}

	static final void method725(final byte i, final Class50 class50) {
		try {
			JagexSocket.aClass107_Sub1Array426 = Class191.method2514(class50, Class120_Sub14_Sub13.anInt3561, (byte) -118);
			Class76.anIntArray679 = new int[256];
			for (int i_20_ = 0; i_20_ < 3; i_20_++) {
				float f = Class191.anIntArray2119[i_20_] >> 16 & 0xff;
				final int i_21_ = Class191.anIntArray2119[i_20_ + 1] >> 16 & 0xff;
				final float f_22_ = (i_21_ - f) / 64.0F;
				float f_23_ = 0xff & Class191.anIntArray2119[i_20_] >> 8;
				float f_24_ = Class191.anIntArray2119[i_20_] & 0xff;
				final int i_25_ = 0xff & Class191.anIntArray2119[1 + i_20_] >> 8;
				final float f_26_ = (i_25_ - f_23_) / 64.0F;
				final int i_27_ = Class191.anIntArray2119[i_20_ - -1] & 0xff;
				final float f_28_ = (i_27_ - f_24_) / 64.0F;
				for (int i_29_ = 0; i_29_ < 64; i_29_++) {
					Class76.anIntArray679[i_29_ + 64 * i_20_] = Class191.method2512(Class191.method2512((int) f << 16, (int) f_23_ << 8), (int) f_24_);
					f_23_ += f_26_;
					f += f_22_;
					f_24_ += f_28_;
				}
			}
			for (int i_30_ = 192; i_30_ < 255; i_30_++) {
				Class76.anIntArray679[i_30_] = Class191.anIntArray2119[3];
			}
			InterfaceChangeNode.anIntArray3485 = new int[32768];
			if (i > -30) {
				aLongArray806 = null;
			}
			KeyboardHandler.anIntArray1503 = new int[32768];
			Class96.method787(103, null);
			Class160.anIntArray1501 = new int[32768];
			Light.anIntArray392 = new int[32768];
			Class92.aClass120_Sub14_Sub19_Sub2_862 = new LDSprite(128, 254);
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("jd.E(").append(i).append(',').append(class50 != null ? "{...}" : "null").append(')').toString());
		}
	}

	public static void method726(final int i) {
		try {
			aLongArray806 = null;
			if (i != 255) {
				SpotAnimType.list(-118);
			}
			aString807 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("jd.C(").append(i).append(')').toString());
		}
	}

	public Class85() {
		/* empty */
	}
}
