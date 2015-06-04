/* Class85 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class HintIcon {
	static int anInt802;
	static boolean showFps = true;
	int x;
	int iconType;
	static long[] ignoreNamesAsLong = new long[100];
	int targetIndex;
	int targetType;
	int showDistance;
	int modelId = -1;
	int offX;
	int z;
	int y;
	int offY;

	static final LDSprite constructLDSprite() {
		final byte[] indicators = Class145.spritePaletteIndicators[0];
		final int pixelAmt = Class120_Sub12_Sub11.spriteWidths[0] * Class120_Sub12_Sub39.spriteHeights[0];
		final int[] pixels = new int[pixelAmt];
		for (int id = 0; id < pixelAmt; id++) {
			pixels[id] = Class132_Sub1.spritePalette[indicators[id] & 0xff];
		}
		final LDSprite ldSprite = new LDSprite(Class31.spriteTrimWidth, SceneGroundObject.spriteTrimHeight, Projectile.spriteXOffsets[0], GroundTile.spriteYOffsets[0], Class120_Sub12_Sub11.spriteWidths[0], Class120_Sub12_Sub39.spriteHeights[0], pixels);
		Class53_Sub1.resetSpriteInfo();
		return ldSprite;
	}

	static final boolean method723(final int i, final int i_4_, final int i_5_, final int i_6_, final int i_7_, final int i_8_) {
		if (i_4_ == i_5_ && i_6_ == i_7_) {
			if (!Class69_Sub1.method618(i, i_4_, i_6_)) {
				return false;
			}
			final int i_9_ = i_4_ << 7;
			final int i_10_ = i_6_ << 7;
			if (Class120_Sub12_Sub34.method1380(i_9_ + 1, OverridedJInterface.activeTileHeightMap[i][i_4_][i_6_] + i_8_, i_10_ + 1) && Class120_Sub12_Sub34.method1380(i_9_ + 128 - 1, OverridedJInterface.activeTileHeightMap[i][i_4_ + 1][i_6_] + i_8_, i_10_ + 1)
					&& Class120_Sub12_Sub34.method1380(i_9_ + 128 - 1, OverridedJInterface.activeTileHeightMap[i][i_4_ + 1][i_6_ + 1] + i_8_, i_10_ + 128 - 1) && Class120_Sub12_Sub34.method1380(i_9_ + 1, OverridedJInterface.activeTileHeightMap[i][i_4_][i_6_ + 1] + i_8_, i_10_ + 128 - 1)) {
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
		final int i_15_ = OverridedJInterface.activeTileHeightMap[i][i_4_][i_6_] + i_8_;
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

	static final void method725(final js5 js5) {
		JagexSocket.runesSprite = ChunkAtmosphere.constructLDIndexedSprites(js5, Class120_Sub14_Sub13.runesId);
		client.anIntArray679 = new int[256];
		for (int i_20_ = 0; i_20_ < 3; i_20_++) {
			float f = ChunkAtmosphere.torchesFlamesPalette[i_20_] >> 16 & 0xff;
			final int i_21_ = ChunkAtmosphere.torchesFlamesPalette[i_20_ + 1] >> 16 & 0xff;
			final float f_22_ = (i_21_ - f) / 64.0F;
			float f_23_ = 0xff & ChunkAtmosphere.torchesFlamesPalette[i_20_] >> 8;
			float f_24_ = ChunkAtmosphere.torchesFlamesPalette[i_20_] & 0xff;
			final int i_25_ = 0xff & ChunkAtmosphere.torchesFlamesPalette[1 + i_20_] >> 8;
			final float f_26_ = (i_25_ - f_23_) / 64.0F;
			final int i_27_ = ChunkAtmosphere.torchesFlamesPalette[i_20_ + 1] & 0xff;
			final float f_28_ = (i_27_ - f_24_) / 64.0F;
			for (int i_29_ = 0; i_29_ < 64; i_29_++) {
				client.anIntArray679[i_29_ + 64 * i_20_] = ChunkAtmosphere.method2512(ChunkAtmosphere.method2512((int) f << 16, (int) f_23_ << 8), (int) f_24_);
				f_23_ += f_26_;
				f += f_22_;
				f_24_ += f_28_;
			}
		}
		for (int i_30_ = 192; i_30_ < 255; i_30_++) {
			client.anIntArray679[i_30_] = ChunkAtmosphere.torchesFlamesPalette[3];
		}
		InterfaceChangeNode.anIntArray3485 = new int[32768];
		KeyboardHandler.anIntArray1503 = new int[32768];
		Class96.method787(null);
		GrandExchangeObject.anIntArray1501 = new int[32768];
		Light.anIntArray392 = new int[32768];
		Class92.torchFlamesSprite = new LDSprite(128, 254);
	}

	public HintIcon() {
		/* empty */
	}
}
