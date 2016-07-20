/* Class157 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class157 {
	int anInt1459;
	int anInt1460;
	static int[] anIntArray1461;
	int anInt1463;
	int anInt1464;
	static ShaderInterface[] shaders;
	static int anInt1466 = -1;
	int anInt1467;
	byte[] aByteArray1468;
	static int worldId;
	int anInt1470;
	byte[] aByteArray1471;
	static AbstractSprite aClass120_Sub14_Sub19_1472;
	int anInt1473;
	static AbstractSprite compassSprite;

	static {
		anIntArray1461 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };
		worldId = 1;
	}

	static final void method2088(final ShapedTile shapedTile, final int i, final int i_1_, final int i_2_, final int i_3_, final int i_4_, final int i_5_, final boolean bool) {
		int i_6_ = shapedTile.xVertices.length;
		for (int i_7_ = 0; i_7_ < i_6_; i_7_++) {
			int i_8_ = shapedTile.xVertices[i_7_] - DisplayModeInfo.renderX;
			int i_9_ = shapedTile.anIntArray1639[i_7_] - PlayerAppearance.renderY;
			int i_10_ = shapedTile.anIntArray1635[i_7_] - SkyboxType.renderZ;
			int i_11_ = i_10_ * i_2_ + i_8_ * i_3_ >> 16;
			i_10_ = i_10_ * i_3_ - i_8_ * i_2_ >> 16;
			i_8_ = i_11_;
			i_11_ = i_9_ * i_1_ - i_10_ * i >> 16;
			i_10_ = i_9_ * i + i_10_ * i_1_ >> 16;
			i_9_ = i_11_;
			if (i_10_ < 50) {
				return;
			}
			if (shapedTile.anIntArray1621 != null) {
				ShapedTile.anIntArray1640[i_7_] = i_8_;
				ShapedTile.anIntArray1632[i_7_] = i_9_;
				ShapedTile.anIntArray1623[i_7_] = i_10_;
			}
			ShapedTile.anIntArray1630[i_7_] = Rasterizer.centerX + (i_8_ << 9) / i_10_;
			ShapedTile.anIntArray1636[i_7_] = Rasterizer.centerY + (i_9_ << 9) / i_10_;
		}
		Rasterizer.alpha = 0;
		i_6_ = shapedTile.anIntArray1634.length;
		for (int i_12_ = 0; i_12_ < i_6_; i_12_++) {
			final int i_13_ = shapedTile.anIntArray1634[i_12_];
			final int i_14_ = shapedTile.anIntArray1633[i_12_];
			final int i_15_ = shapedTile.anIntArray1641[i_12_];
			final int i_16_ = ShapedTile.anIntArray1630[i_13_];
			final int i_17_ = ShapedTile.anIntArray1630[i_14_];
			final int i_18_ = ShapedTile.anIntArray1630[i_15_];
			final int i_19_ = ShapedTile.anIntArray1636[i_13_];
			final int i_20_ = ShapedTile.anIntArray1636[i_14_];
			final int i_21_ = ShapedTile.anIntArray1636[i_15_];
			if ((i_16_ - i_17_) * (i_21_ - i_20_) - (i_19_ - i_20_) * (i_18_ - i_17_) > 0) {
				if (Class120_Sub12_Sub7.mouseClickToTileRequested && Class48.method400(ParticleEmitter.mouseClickToTileOffX + Rasterizer.centerX, Class187.mouseClickToTileOffZ + Rasterizer.centerY, i_19_, i_20_, i_21_, i_16_, i_17_, i_18_)) {
					ObjectCache.clickedTileX = i_4_;
					WaterfallShader.clickedTileZ = i_5_;
				}
				if (!HDToolkit.glEnabled && !bool) {
					Rasterizer.boundsLeft = false;
					if (i_16_ < 0 || i_17_ < 0 || i_18_ < 0 || i_16_ > Rasterizer.endX || i_17_ > Rasterizer.endX || i_18_ > Rasterizer.endX) {
						Rasterizer.boundsLeft = true;
					}
					if (shapedTile.anIntArray1621 == null || shapedTile.anIntArray1621[i_12_] == -1) {
						if (shapedTile.anIntArray1627[i_12_] != 12345678) {
							Rasterizer.method856(i_19_, i_20_, i_21_, i_16_, i_17_, i_18_, shapedTile.anIntArray1627[i_12_], shapedTile.anIntArray1625[i_12_], shapedTile.anIntArray1624[i_12_]);
						}
					} else if (Class120_Sub30_Sub1.manyGroundTextures) {
						if (shapedTile.aBoolean1629) {
							Rasterizer.method871(i_19_, i_20_, i_21_, i_16_, i_17_, i_18_, shapedTile.anIntArray1627[i_12_], shapedTile.anIntArray1625[i_12_], shapedTile.anIntArray1624[i_12_], ShapedTile.anIntArray1640[0], ShapedTile.anIntArray1640[1], ShapedTile.anIntArray1640[3], ShapedTile.anIntArray1632[0],
									ShapedTile.anIntArray1632[1], ShapedTile.anIntArray1632[3], ShapedTile.anIntArray1623[0], ShapedTile.anIntArray1623[1], ShapedTile.anIntArray1623[3], shapedTile.anIntArray1621[i_12_]);
						} else {
							Rasterizer.method871(i_19_, i_20_, i_21_, i_16_, i_17_, i_18_, shapedTile.anIntArray1627[i_12_], shapedTile.anIntArray1625[i_12_], shapedTile.anIntArray1624[i_12_], ShapedTile.anIntArray1640[i_13_], ShapedTile.anIntArray1640[i_14_], ShapedTile.anIntArray1640[i_15_],
									ShapedTile.anIntArray1632[i_13_], ShapedTile.anIntArray1632[i_14_], ShapedTile.anIntArray1632[i_15_], ShapedTile.anIntArray1623[i_13_], ShapedTile.anIntArray1623[i_14_], ShapedTile.anIntArray1623[i_15_], shapedTile.anIntArray1621[i_12_]);
						}
					} else {
						final int i_22_ = Rasterizer.anInterface5_973.getColorPaletteIndex(shapedTile.anIntArray1621[i_12_]);
						Rasterizer.method856(i_19_, i_20_, i_21_, i_16_, i_17_, i_18_, ParticleEmitter.method935(i_22_, shapedTile.anIntArray1627[i_12_]), ParticleEmitter.method935(i_22_, shapedTile.anIntArray1625[i_12_]), ParticleEmitter.method935(i_22_, shapedTile.anIntArray1624[i_12_]));
					}
				}
			}
		}
	}

	public Class157() {
		/* empty */
	}
}
