/* Class186 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class WallDecoration {
	static int topMargin;
	int renderZ;
	int anInt1892;
	int renderX;
	int renderY;
	int anInt1895;
	int rotation;
	static volatile long currentClickTime = 0L;
	SceneGraphNode aClass180_1898;
	static boolean usingSpriteMenu;
	static int mapSizeX;
	SceneGraphNode aClass180_1901;
	static boolean hdrEnabled;
	long bitPacked = 0L;
	int anInt1905;
	static int menuOptionCount;

	static {
		topMargin = 0;
		usingSpriteMenu = false;
		hdrEnabled = false;
		menuOptionCount = 0;
	}

	static final void method2471() {
		Class154.toUpdateEntitiesPos = 0;
		Class120_Sub12_Sub23.toRemoveEntitiesPos = 0;
		SpotAnimation.method2309();
		Class31.method262();
		Class120_Sub12_Sub36.method1389();
		for (int id = 0; id < Class120_Sub12_Sub23.toRemoveEntitiesPos; id++) {
			final int index = Class43.toRemoveEntityIndices[id];
			if (Class101_Sub2.clientClock != Class120_Sub12_Sub11.npcList[index].lastUpdateCycle) {
				if (Class120_Sub12_Sub11.npcList[index].npcType.hasAmbientSound()) {
					Class120_Sub16.removeAmbientSoundNpc(Class120_Sub12_Sub11.npcList[index]);
				}
				Class120_Sub12_Sub11.npcList[index].setNpcType(null);
				Class120_Sub12_Sub11.npcList[index] = null;
			}
		}
		if (Canvas_Sub1.inputStream.pos != AbstractMouseWheelHandler.packetSize) {
			throw new RuntimeException("gnp1 pos:" + Canvas_Sub1.inputStream.pos + " psize:" + AbstractMouseWheelHandler.packetSize);
		}
		for (int id = 0; id < Class148.localNpcCount; id++) {
			if (Class120_Sub12_Sub11.npcList[Class120_Sub12_Sub36.npcIndices[id]] == null) {
				throw new RuntimeException("gnp2 pos:" + id + " size:" + Class148.localNpcCount);
			}
		}
	}

	static final void method2473(int drawX, int drawY, final int interfaceWidth, final int interfaceHeight) {
		if (HDToolkit.glEnabled) {
			GraphicsHD.clipRect(drawX, drawY, drawX + interfaceWidth, drawY + interfaceHeight);
			GraphicsHD.fillRect(drawX, drawY, interfaceWidth, interfaceHeight, 0);
		} else {
			GraphicsLD.clipRect(drawX, drawY, drawX + interfaceWidth, drawY + interfaceHeight);
			GraphicsLD.fillRect(drawX, drawY, interfaceWidth, interfaceHeight, 0);
		}
		if (Class90.laodingStage >= 100) {
			final float f = (float) WorldMapHandler.mapSizeY / (float) WorldMapHandler.mapSizeX;
			int width = interfaceWidth;
			int height = interfaceHeight;
			if (f < 1.0F) {
				height = (int) (interfaceWidth * f);
			} else {
				width = (int) (interfaceHeight / f);
			}
			drawX += (interfaceWidth - width) / 2;
			drawY += (interfaceHeight - height) / 2;
			if (Class116.aClass120_Sub14_Sub19_1114 == null || Class116.aClass120_Sub14_Sub19_1114.width != interfaceWidth || Class116.aClass120_Sub14_Sub19_1114.height != interfaceHeight) {
				final LDSprite ldSprite = new LDSprite(interfaceWidth, interfaceHeight);
				GraphicsLD.init2dCanvas(ldSprite.pixels, interfaceWidth, interfaceHeight);
				if (WorldMapHandler.aClass120_Sub14_Sub22_691.backgroundColor != -1) {
					GraphicsLD.fillRect(0, 0, interfaceWidth, interfaceHeight, WorldMapHandler.aClass120_Sub14_Sub22_691.backgroundColor);
				}
				WorldMapHandler.method683(0, 0, WorldMapHandler.mapSizeX, WorldMapHandler.mapSizeY, 0, 0, width, height);
				WorldMapHandler.method685();
				if (!HDToolkit.glEnabled) {
					Class116.aClass120_Sub14_Sub19_1114 = ldSprite;
				} else {
					Class116.aClass120_Sub14_Sub19_1114 = new HDSprite(ldSprite);
				}
				if (!HDToolkit.glEnabled) {
					ClanMember.fullscreenGraphics.init2dCanvas();
				} else {
					GraphicsLD.pixels = null;
				}
			}
			int pointerColor = 16711680;
			Class116.aClass120_Sub14_Sub19_1114.method1591(drawX, drawY);
			final int pointerX = drawX + ParamType.worldMapLookAtX * width / WorldMapHandler.mapSizeX;
			final int pointerY = drawY - GroundTile.worldMapLookAtY * height / WorldMapHandler.mapSizeY;
			final int pointerWidth = Class173.worldMapPointerWidth * width / WorldMapHandler.mapSizeX;
			final int pointerHeight = GroundObjectNode.worldMapPointerHeight * height / WorldMapHandler.mapSizeY;
			if (Buffer.gameId == 1) {
				pointerColor = 16777215;
			}
			if (HDToolkit.glEnabled) {
				GraphicsHD.fillRectAlpha(pointerX, pointerY, pointerWidth, pointerHeight, pointerColor, 128);
				GraphicsHD.drawRect(pointerX, pointerY, pointerWidth, pointerHeight, pointerColor);
			} else {
				GraphicsLD.fillRectAlpha(pointerX, pointerY, pointerWidth, pointerHeight, pointerColor, 128);
				GraphicsLD.drawRect(pointerX, pointerY, pointerWidth, pointerHeight, pointerColor);
			}
			if (Class96.clickedMouseFunctionBlinksLeft > 0) {
				int blinkAlpha;
				if (Class136.clickedMouseFunctionCycle > 50) {
					blinkAlpha = 500 - (Class136.clickedMouseFunctionCycle * 5);
				} else {
					blinkAlpha = Class136.clickedMouseFunctionCycle * 5;
				}
				for (MapFunctionNode mapFunctionNode = (MapFunctionNode) WorldMapHandler.mapFunctionsQueue.peekFirst(); mapFunctionNode != null; mapFunctionNode = (MapFunctionNode) WorldMapHandler.mapFunctionsQueue.peekNext()) {
					final MapFunctionType mapFunctionType = MapFunctionType.list(mapFunctionNode.id);
					if (Class9.method116(mapFunctionType)) {
						if (mapFunctionNode.id == Class127.anInt1215) {
							final int blinkX = drawX + width * mapFunctionNode.x / WorldMapHandler.mapSizeX;
							final int blinkY = drawY + height * mapFunctionNode.z / WorldMapHandler.mapSizeY;
							if (!HDToolkit.glEnabled) {
								GraphicsLD.fillRectAlpha(blinkX - 2, blinkY - 2, 4, 4, 16776960, blinkAlpha);
							} else {
								GraphicsHD.fillRectAlpha(blinkX - 2, blinkY - 2, 4, 4, 16776960, blinkAlpha);
							}
						} else if (Class120_Sub12_Sub9.clickedMouseFunctionId != -1 && mapFunctionType.anInt652 == Class120_Sub12_Sub9.clickedMouseFunctionId) {
							final int blinkX = drawX + width * mapFunctionNode.x / WorldMapHandler.mapSizeX;
							final int blinkY = drawY + height * mapFunctionNode.z / WorldMapHandler.mapSizeY;
							if (!HDToolkit.glEnabled) {
								GraphicsLD.fillRectAlpha(blinkX - 2, blinkY - 2, 4, 4, 16776960, blinkAlpha);
							} else {
								GraphicsHD.fillRectAlpha(blinkX - 2, blinkY - 2, 4, 4, 16776960, blinkAlpha);
							}
						}
					}
				}
			}
		}
	}

	public WallDecoration() {
		/* empty */
	}
}
