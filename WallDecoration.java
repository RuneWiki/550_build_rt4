/* Class186 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class WallDecoration {
	static int topMargin;
	static int actionsLen;
	int renderZ;
	int anInt1892;
	int renderX;
	int renderY;
	int anInt1895;
	int anInt1896;
	static volatile long currentClickTime = 0L;
	SceneGraphNode aClass180_1898;
	static boolean usingSpriteMenu;
	static int anInt1900;
	SceneGraphNode aClass180_1901;
	static boolean hdrEnabled;
	long bitPacked = 0L;
	int anInt1905;
	static int menuOptionCount;

	static {
		topMargin = 0;
		usingSpriteMenu = false;
		actionsLen = 0;
		hdrEnabled = false;
		menuOptionCount = 0;
	}

	static final void method2471() {
		Class154.anInt1441 = 0;
		Class120_Sub12_Sub23.anInt3307 = 0;
		SpotAnimation.method2309();
		Class31.method262();
		Class120_Sub12_Sub36.method1389();
		for (int i_0_ = 0; Class120_Sub12_Sub23.anInt3307 > i_0_; i_0_++) {
			final int i_1_ = Class43.anIntArray366[i_0_];
			if (Class101_Sub2.loopCycle != Class120_Sub12_Sub11.npcList[i_1_].lastUpdateCycle) {
				if (Class120_Sub12_Sub11.npcList[i_1_].npcType.hasAmbientSound()) {
					Class120_Sub16.removeAmbientSoundNpc(Class120_Sub12_Sub11.npcList[i_1_]);
				}
				Class120_Sub12_Sub11.npcList[i_1_].setNpcType(null);
				Class120_Sub12_Sub11.npcList[i_1_] = null;
			}
		}
		if (Canvas_Sub1.inputStream.pos != AbstractMouseWheelHandler.packetSize) {
			throw new RuntimeException(new StringBuilder("gnp1 pos:").append(Canvas_Sub1.inputStream.pos).append(" psize:").append(AbstractMouseWheelHandler.packetSize).toString());
		}
		for (int i_2_ = 0; Class148.localNpcCount > i_2_; i_2_++) {
			if (Class120_Sub12_Sub11.npcList[Class120_Sub12_Sub36.npcIndices[i_2_]] == null) {
				throw new RuntimeException(new StringBuilder("gnp2 pos:").append(i_2_).append(" size:").append(Class148.localNpcCount).toString());
			}
		}
	}

	static final void method2472(final js5 js5, final js5 class50_3_) {
		SceneGroundObject.aClass50_2839 = js5;
		IdentityKit.configClient = class50_3_;
		Class7.anInt61 = IdentityKit.configClient.getFileAmount(3);
	}

	static final void method2473(int drawX, int drawY, final int width, final int height) {
		if (HDToolkit.glEnabled) {
			GraphicsHD.clipRect(drawX, drawY, drawX + width, drawY + height);
			GraphicsHD.fillRect(drawX, drawY, width, height, 0);
		} else {
			GraphicsLD.clipRect(drawX, drawY, drawX + width, drawY + height);
			GraphicsLD.fillRect(drawX, drawY, width, height, 0);
		}
		if (Class90.laodingStage >= 100) {
			final float f = (float) WorldMapHandler.mapSizeY / (float) WorldMapHandler.mapSizeX;
			int drawWidth = width;
			int drawHeight = height;
			if (f < 1.0F) {
				drawHeight = (int) (width * f);
			} else {
				drawWidth = (int) (height / f);
			}
			drawX += (width - drawWidth) / 2;
			drawY += (height - drawHeight) / 2;
			if (Class116.aClass120_Sub14_Sub19_1114 == null || Class116.aClass120_Sub14_Sub19_1114.width != width || Class116.aClass120_Sub14_Sub19_1114.height != height) {
				final LDSprite ldSprite = new LDSprite(width, height);
				GraphicsLD.init2dCanvas(ldSprite.pixels, width, height);
				if (WorldMapHandler.aClass120_Sub14_Sub22_691.anInt3635 != -1) {
					GraphicsLD.fillRect(0, 0, width, height, WorldMapHandler.aClass120_Sub14_Sub22_691.anInt3635);
				}
				WorldMapHandler.method683(0, 0, WorldMapHandler.mapSizeX, WorldMapHandler.mapSizeY, 0, 0, drawWidth, drawHeight);
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
			final int pointerX = drawX + ParamType.worldMapLookAtX * drawWidth / WorldMapHandler.mapSizeX;
			final int pointerY = drawY - GroundTile.worldMapLookAtY * drawHeight / WorldMapHandler.mapSizeY;
			final int pointerWidth = Class173.worldMapPointerWidth * drawWidth / WorldMapHandler.mapSizeX;
			final int pointerHeight = GroundObjectNode.worldMapPointerHeight * drawHeight / WorldMapHandler.mapSizeY;
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
				for (MapFunctionNode mapFunctionNode = (MapFunctionNode) WorldMapHandler.aClass177_690.peekFirst(); mapFunctionNode != null; mapFunctionNode = (MapFunctionNode) WorldMapHandler.aClass177_690.peekNext()) {
					final MapFunctionType mapFunctionType = MapFunctionType.list(mapFunctionNode.id);
					if (Class9.method116(mapFunctionType)) {
						if (mapFunctionNode.id == Class127.anInt1215) {
							final int blinkX = drawX + drawWidth * mapFunctionNode.x / WorldMapHandler.mapSizeX;
							final int blinkY = drawY + drawHeight * mapFunctionNode.z / WorldMapHandler.mapSizeY;
							if (!HDToolkit.glEnabled) {
								GraphicsLD.fillRectAlpha(blinkX - 2, blinkY - 2, 4, 4, 16776960, blinkAlpha);
							} else {
								GraphicsHD.fillRectAlpha(blinkX - 2, blinkY - 2, 4, 4, 16776960, blinkAlpha);
							}
						} else if (Class120_Sub12_Sub9.clickedMouseFunctionId != -1 && mapFunctionType.anInt652 == Class120_Sub12_Sub9.clickedMouseFunctionId) {
							final int blinkX = drawX + drawWidth * mapFunctionNode.x / WorldMapHandler.mapSizeX;
							final int blinkY = drawY + drawHeight * mapFunctionNode.z / WorldMapHandler.mapSizeY;
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
