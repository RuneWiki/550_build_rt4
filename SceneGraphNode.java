/* Class180 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class SceneGraphNode {
	static MapFunctionGroup mapFunctionGroup;
	static Class188[] aClass188Array1782;
	static int[] skillsLevel = new int[25];

	public SceneGraphNode() {
		/* empty */
	}

	abstract void render(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, long l, int i_7_, ParticleEngine class108_sub2);

	abstract void method2266(int i, int i_8_, int i_10_, int i_9_, int i_11_);

	void method2267(final SceneGraphNode class180_12_, final int xOff, final int yOff, final int zOff, final boolean bool) {
		/* empty */
	}

	boolean method2268() {
		return false;
	}

	SceneGraphNode method2269(final int i, final int i_15_, final int i_16_) {
		return this;
	}

	static final void method2271(final MapFunctionNode mapFunctionNode, final MapFunctionType mapFunction, int i, int i_18_) {
		if (mapFunction.anIntArray638 != null) {
			boolean bool_19_ = false;
			final int[] is = new int[mapFunction.anIntArray638.length];
			for (int i_20_ = 0; is.length / 2 > i_20_; i_20_++) {
				final int i_21_ = mapFunction.anIntArray638[i_20_ * 2] + mapFunctionNode.x;
				final int i_22_ = mapFunctionNode.z + -mapFunction.anIntArray638[1 + 2 * i_20_];
				final int i_23_ = is[i_20_ * 2] = WorldMapHandler.anInt708 + (i_21_ + -WorldMapHandler.anInt716) * (WorldMapHandler.anInt709 - WorldMapHandler.anInt708) / (WorldMapHandler.anInt714 - WorldMapHandler.anInt716);
				final int i_24_ = is[1 + 2 * i_20_] = WorldMapHandler.anInt705 + (i_22_ + -WorldMapHandler.anInt704) * (-WorldMapHandler.anInt705 + WorldMapHandler.anInt712) / (WorldMapHandler.anInt701 - WorldMapHandler.anInt704);
				if (WorldMapHandler.anInt708 < i_23_ && i_23_ < WorldMapHandler.anInt709 && WorldMapHandler.anInt705 < i_24_ && i_24_ < WorldMapHandler.anInt712) {
					bool_19_ = true;
				}
			}
			if (!bool_19_) {
				return;
			}
			Class59.method542(is, mapFunction.anInt651, mapFunction.anInt651 >>> 24);
			for (int i_25_ = 0; -1 + is.length / 2 > i_25_; i_25_++) {
				GraphicsLD.drawLineAlpha(is[i_25_ * 2], is[1 + i_25_ * 2], is[2 * (1 + i_25_)], is[1 + (1 + i_25_) * 2], mapFunction.anInt630, mapFunction.anInt630 >>> 24);
			}
			GraphicsLD.drawLineAlpha(is[is.length - 2], is[is.length + -1], is[0], is[1], mapFunction.anInt630, mapFunction.anInt630 >>> 24);
		} else if (mapFunctionNode.aBoolean3476) {
			return;
		}
		final Class120_Sub16 class120_sub16 = new Class120_Sub16(mapFunctionNode);
		LDIndexedSprite mapFunctionSprite = null;
		if (mapFunction.unfocusedSpriteId != -1) {
			if (!mapFunctionNode.focused || mapFunction.focusedSpriteId == -1) {
				mapFunctionSprite = (LDIndexedSprite) mapFunction.consturctSprite(false, true);
			} else {
				mapFunctionSprite = (LDIndexedSprite) mapFunction.consturctSprite(true, true);
			}
			if (mapFunctionSprite != null) {
				if (Class96.clickedMouseFunctionBlinksLeft > 0 && (Class127.anInt1215 != -1 && mapFunctionNode.id == Class127.anInt1215 || Class120_Sub12_Sub9.clickedMouseFunctionId != -1 && mapFunction.anInt652 == Class120_Sub12_Sub9.clickedMouseFunctionId)) {
					int alpha;
					if (Class136.clickedMouseFunctionCycle <= 50) {
						alpha = Class136.clickedMouseFunctionCycle * 3;
					} else {
						alpha = 300 - 3 * Class136.clickedMouseFunctionCycle;
					}
					GraphicsLD.drawAlphaCircle(mapFunctionNode.worldMapX, mapFunctionNode.worldMapY, mapFunctionSprite.width / 2 + 7, 16776960, alpha);
					GraphicsLD.drawAlphaCircle(mapFunctionNode.worldMapX, mapFunctionNode.worldMapY, mapFunctionSprite.width / 2 + 5, 16776960, alpha);
					GraphicsLD.drawAlphaCircle(mapFunctionNode.worldMapX, mapFunctionNode.worldMapY, mapFunctionSprite.width / 2 + 3, 16776960, alpha);
					GraphicsLD.drawAlphaCircle(mapFunctionNode.worldMapX, mapFunctionNode.worldMapY, mapFunctionSprite.width / 2 + 1, 16776960, alpha);
					GraphicsLD.drawAlphaCircle(mapFunctionNode.worldMapX, mapFunctionNode.worldMapY, mapFunctionSprite.width / 2, 16776960, alpha);
				}
				mapFunctionSprite.drawReg(mapFunctionNode.worldMapX - (mapFunctionSprite.width >> 1), mapFunctionNode.worldMapY - (mapFunctionSprite.height >> 1));
				class120_sub16.startX = i + mapFunctionNode.worldMapX - (mapFunctionSprite.width >> 1);
				class120_sub16.startY = i_18_ + mapFunctionNode.worldMapY - (mapFunctionSprite.height >> 1);
				class120_sub16.endX = i + mapFunctionNode.worldMapX + (mapFunctionSprite.width >> 1);
				class120_sub16.endY = i_18_ + mapFunctionNode.worldMapY + (mapFunctionSprite.height >> 1);
			}
		}
		if (mapFunction.headerText != null) {
			if (mapFunctionSprite != null) {
				Class120_Sub19.method1673(mapFunctionNode, class120_sub16, mapFunction, i, 5 + (mapFunctionSprite.height >> 1), i_18_, false);
			} else {
				Class120_Sub19.method1673(mapFunctionNode, class120_sub16, mapFunction, i, 0, i_18_, true);
			}
		}
		if (class120_sub16.inBounds(Queue.lastMouseX, ChunkAtmosphere.lastMouseY) && mapFunction.actionPrefixes != null) {
			if (mapFunction.actionPrefixes[4] != null) {
				InvType.addMenuOption(mapFunction.actionPrefixes[4], mapFunction.actionSufix, mapFunctionNode.id, mapFunction.anInt652, 0, (short) 1011, -1);
			}
			if (mapFunction.actionPrefixes[3] != null) {
				InvType.addMenuOption(mapFunction.actionPrefixes[3], mapFunction.actionSufix, mapFunctionNode.id, mapFunction.anInt652, 0, (short) 1003, -1);
			}
			if (mapFunction.actionPrefixes[2] != null) {
				InvType.addMenuOption(mapFunction.actionPrefixes[2], mapFunction.actionSufix, mapFunctionNode.id, mapFunction.anInt652, 0, (short) 1008, -1);
			}
			if (mapFunction.actionPrefixes[1] != null) {
				InvType.addMenuOption(mapFunction.actionPrefixes[1], mapFunction.actionSufix, mapFunctionNode.id, mapFunction.anInt652, 0, (short) 1002, -1);
			}
			if (mapFunction.actionPrefixes[0] != null) {
				InvType.addMenuOption(mapFunction.actionPrefixes[0], mapFunction.actionSufix, mapFunctionNode.id, mapFunction.anInt652, 0, (short) 1012, -1);
			}
		}
		MapFunctionType.aClass105_653.addLast(class120_sub16);
	}

	static final void updateInterfacePosition(final JagexInterface jagexInterface, final int screenWidth, final int screenHeight) {
		if (jagexInterface.dynamicXValue == 0) {
			jagexInterface.x = jagexInterface.originalX;
		} else if (jagexInterface.dynamicXValue == 1) {
			jagexInterface.x = jagexInterface.originalX + (screenWidth - jagexInterface.width) / 2;
		} else if (jagexInterface.dynamicXValue == 2) {
			jagexInterface.x = -jagexInterface.originalX + -jagexInterface.width + screenWidth;
		} else if (jagexInterface.dynamicXValue == 3) {
			jagexInterface.x = jagexInterface.originalX * screenWidth >> 14;
		} else if (jagexInterface.dynamicXValue == 4) {
			jagexInterface.x = (jagexInterface.originalX * screenWidth >> 14) + (screenWidth - jagexInterface.width) / 2;
		} else {
			jagexInterface.x = -(screenWidth * jagexInterface.originalX >> 14) + -jagexInterface.width + screenWidth;
		}
		if (jagexInterface.dynamicYValue == 0) {
			jagexInterface.y = jagexInterface.originalY;
		} else if (jagexInterface.dynamicYValue == 1) {
			jagexInterface.y = jagexInterface.originalY + (-jagexInterface.height + screenHeight) / 2;
		} else if (jagexInterface.dynamicYValue == 2) {
			jagexInterface.y = screenHeight + -jagexInterface.height - jagexInterface.originalY;
		} else if (jagexInterface.dynamicYValue == 3) {
			jagexInterface.y = screenHeight * jagexInterface.originalY >> 14;
		} else if (jagexInterface.dynamicYValue == 4) {
			jagexInterface.y = (jagexInterface.originalY * screenHeight >> 14) + (screenHeight - jagexInterface.height) / 2;
		} else {
			jagexInterface.y = -(jagexInterface.originalY * screenHeight >> 14) + screenHeight + -jagexInterface.height;
		}
		if (Class120_Sub30_Sub1.qaOpTestEnabled && (client.getClickMask(jagexInterface).optionMask != 0 || jagexInterface.type == 0)) {
			if (jagexInterface.x < 0) {
				jagexInterface.x = 0;
			} else if (jagexInterface.x + jagexInterface.width > screenWidth) {
				jagexInterface.x = screenWidth - jagexInterface.width;
			}
			if (jagexInterface.y < 0) {
				jagexInterface.y = 0;
			} else if (jagexInterface.height + jagexInterface.y > screenHeight) {
				jagexInterface.y = screenHeight - jagexInterface.height;
			}
		}
	}

	abstract int getMaxY();
}
