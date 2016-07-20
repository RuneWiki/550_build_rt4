/* Class115 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class115 {
	int y;
	static int menuMouseX;//TODO new name
	int x;
	int z;

	static final void method1007(int renderX, final int renderY, int renderZ, final int renderPitch, final int renderYaw, final byte[][][] is, final int[] is_4_, final int[] is_5_, final int[] is_6_, final int[] is_7_, final int[] is_8_, final int i_9_, final byte i_10_, final int playerX, final int playerZ) {
		if (renderX < 0) {
			renderX = 0;
		} else if (renderX >= WallDecoration.mapSizeX * 128) {
			renderX = WallDecoration.mapSizeX * 128 - 1;
		}
		if (renderZ < 0) {
			renderZ = 0;
		} else if (renderZ >= Class120_Sub12_Sub38.mapSizeZ * 128) {
			renderZ = Class120_Sub12_Sub38.mapSizeZ * 128 - 1;
		}
		Class69_Sub2.renderPitchSin = Rasterizer.sinTable[renderPitch];
		ObjectContainer.renderPitchCos = Rasterizer.cosTable[renderPitch];
		Class120_Sub12_Sub30.renderYawSin = Rasterizer.sinTable[renderYaw];
		MapFunctionType.renderYawCos = Rasterizer.cosTable[renderYaw];
		DisplayModeInfo.renderX = renderX;
		PlayerAppearance.renderY = renderY;
		SkyboxType.renderZ = renderZ;
		Class120_Sub12_Sub26.renderTileX = renderX / 128;
		Class112.renderTileZ = renderZ / 128;
		GrandExchangeObject.minTileX = Class120_Sub12_Sub26.renderTileX - Class120_Sub14_Sub13.tileVisibilityDistance;
		if (GrandExchangeObject.minTileX < 0) {
			GrandExchangeObject.minTileX = 0;
		}
		Class31.minTileZ = Class112.renderTileZ - Class120_Sub14_Sub13.tileVisibilityDistance;
		if (Class31.minTileZ < 0) {
			Class31.minTileZ = 0;
		}
		Class53.maxTileX = Class120_Sub12_Sub26.renderTileX + Class120_Sub14_Sub13.tileVisibilityDistance;
		if (Class53.maxTileX > WallDecoration.mapSizeX) {
			Class53.maxTileX = WallDecoration.mapSizeX;
		}
		Js5Worker.maxTileZ = Class112.renderTileZ + Class120_Sub14_Sub13.tileVisibilityDistance;
		if (Js5Worker.maxTileZ > Class120_Sub12_Sub38.mapSizeZ) {
			Js5Worker.maxTileZ = Class120_Sub12_Sub38.mapSizeZ;
		}
		int far;
		if (HDToolkit.glEnabled) {
			far = 3584;
		} else {
			far = 3500;
		}
		for (int x = 0; x < Class120_Sub14_Sub13.tileVisibilityDistance + Class120_Sub14_Sub13.tileVisibilityDistance + 2; x++) {
			for (int z = 0; z < Class120_Sub14_Sub13.tileVisibilityDistance + Class120_Sub14_Sub13.tileVisibilityDistance + 2; z++) {
				final int tilePosX = (x - Class120_Sub14_Sub13.tileVisibilityDistance << 7) - (DisplayModeInfo.renderX & 0x7f);
				final int tilePosZ = (z - Class120_Sub14_Sub13.tileVisibilityDistance << 7) - (SkyboxType.renderZ & 0x7f);
				final int tileX = Class120_Sub12_Sub26.renderTileX - Class120_Sub14_Sub13.tileVisibilityDistance + x;
				final int tileZ = Class112.renderTileZ - Class120_Sub14_Sub13.tileVisibilityDistance + z;
				if (tileX >= 0 && tileZ >= 0 && tileX < WallDecoration.mapSizeX && tileZ < Class120_Sub12_Sub38.mapSizeZ) {
					int tileY;
					if (Class24.underWaterTileHeightMap != null) {
						tileY = Class24.underWaterTileHeightMap[0][tileX][tileZ] - PlayerAppearance.renderY + 128;
					} else {
						tileY = Class120_Sub12_Sub33.surfaceTileHeightMap[0][tileX][tileZ] - PlayerAppearance.renderY + 128;
					}
					final int maxTileY = Class120_Sub12_Sub33.surfaceTileHeightMap[3][tileX][tileZ] - PlayerAppearance.renderY - 1000;
					ClanMember.aBooleanArrayArray2573[x][z] = Class120_Sub2.method1046(tilePosX, maxTileY, tileY, tilePosZ, far);
				} else {
					ClanMember.aBooleanArrayArray2573[x][z] = false;
				}
			}
		}
		for (int x = 0; x < Class120_Sub14_Sub13.tileVisibilityDistance + Class120_Sub14_Sub13.tileVisibilityDistance + 1; x++) {
			for (int z = 0; z < Class120_Sub14_Sub13.tileVisibilityDistance + Class120_Sub14_Sub13.tileVisibilityDistance + 1; z++) {
				SpotAnimType.aBooleanArrayArray992[x][z] = ClanMember.aBooleanArrayArray2573[x][z] || ClanMember.aBooleanArrayArray2573[x + 1][z] || ClanMember.aBooleanArrayArray2573[x][z + 1] || ClanMember.aBooleanArrayArray2573[x + 1][z + 1];
			}
		}
		client.anIntArray562 = is_4_;
		Class31.anIntArray243 = is_5_;
		SpotAnimation.anIntArray2921 = is_6_;
		IsaacCipher.anIntArray1015 = is_7_;
		Class89.anIntArray838 = is_8_;
		JagexInterface.method2500();
		if (Class120_Sub12_Sub38.underWaterGroundTiles != null) {
			Class178.setRenderTiles(true);
			StructType.method1561(renderX, renderY, renderZ, null, 0, (byte) 0, playerX, playerZ);
			if (HDToolkit.glEnabled) {
				ParamType.aBoolean3545 = false;
				Class120_Sub14_Sub13.method1532(0, 0);
				AtmosphereManager.setFogColor(null);
				LightManager.disableLights();
			}
			Class178.setRenderTiles(false);
		}
		StructType.method1561(renderX, renderY, renderZ, is, i_9_, i_10_, playerX, playerZ);
	}

	static final LDSprite[] constructLDSprites(final js5 js5, final int group, final int file) {
		if (!Class10.decodedSprites(js5, group, file)) {
			return null;
		}
		return SeqFrameBase.constructLDSprites();
	}

	public Class115() {
		/* empty */
	}
}
