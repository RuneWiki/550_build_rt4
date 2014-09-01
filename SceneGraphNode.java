/* Class180 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class SceneGraphNode {
	static Class137 aClass137_1780;
	static Class188[] aClass188Array1782;
	static int[] skillsLevel = new int[25];

	public SceneGraphNode() {
		/* empty */
	}

	abstract void render(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, long l, int i_7_, ParticleEngine class108_sub2);

	abstract void method2266(int i, int i_8_, int i_9_, int i_10_, int i_11_);

	void method2267(final SceneGraphNode class180_12_, final int i, final int i_13_, final int i_14_, final boolean bool) {
		/* empty */
	}

	boolean method2268() {
		return false;
	}

	SceneGraphNode method2269(final int i, final int i_15_, final int i_16_) {
		return this;
	}

	public static void method2270() {
		aClass137_1780 = null;
		skillsLevel = null;
		FrameLoader.recentUse = null;
		aClass188Array1782 = null;
	}

	static final void method2271(final MapFunctionNode class120_sub14_sub5, final MapFunctionType class73, final int i, final int i_18_) {
		if (class73.anIntArray638 != null) {
			boolean bool_19_ = false;
			final int[] is = new int[class73.anIntArray638.length];
			for (int i_20_ = 0; is.length / 2 > i_20_; i_20_++) {
				final int i_21_ = class73.anIntArray638[i_20_ * 2] + class120_sub14_sub5.x;
				final int i_22_ = class120_sub14_sub5.z + -class73.anIntArray638[1 + 2 * i_20_];
				final int i_23_ = is[i_20_ * 2] = WorldMapHandler.anInt708 + (i_21_ + -WorldMapHandler.anInt716) * (WorldMapHandler.anInt709 - WorldMapHandler.anInt708) / (WorldMapHandler.anInt714 - WorldMapHandler.anInt716);
				final int i_24_ = is[1 + 2 * i_20_] = WorldMapHandler.anInt705 + (i_22_ + -WorldMapHandler.anInt704) * (-WorldMapHandler.anInt705 + WorldMapHandler.anInt712) / (WorldMapHandler.anInt701 - WorldMapHandler.anInt704);
				if (WorldMapHandler.anInt708 < i_23_ && i_23_ < WorldMapHandler.anInt709 && WorldMapHandler.anInt705 < i_24_ && i_24_ < WorldMapHandler.anInt712) {
					bool_19_ = true;
				}
			}
			if (!bool_19_) {
				return;
			}
			Class59.method542(is, class73.anInt651, class73.anInt651 >>> 24);
			for (int i_25_ = 0; -1 + is.length / 2 > i_25_; i_25_++) {
				GraphicsLD.method2176(is[i_25_ * 2], is[1 + i_25_ * 2], is[2 * (1 + i_25_)], is[1 + (1 + i_25_) * 2], class73.anInt630, class73.anInt630 >>> 24);
			}
			GraphicsLD.method2176(is[is.length - 2], is[is.length + -1], is[0], is[1], class73.anInt630, class73.anInt630 >>> 24);
		} else if (class120_sub14_sub5.aBoolean3476) {
			return;
		}
		final Class120_Sub16 class120_sub16 = new Class120_Sub16(class120_sub14_sub5);
		LDIndexedSprite class107_sub1 = null;
		if (class73.unfocusedSpriteId != -1) {
			if (!class120_sub14_sub5.focused || class73.focusedSpriteId == -1) {
				class107_sub1 = (LDIndexedSprite) class73.consturctSprite(false, true);
			} else {
				class107_sub1 = (LDIndexedSprite) class73.consturctSprite(true, true);
			}
			if (class107_sub1 != null) {
				if (Class96.clickedMouseFunctionBlinksLeft > 0 && (Class127.anInt1215 != -1 && class120_sub14_sub5.id == Class127.anInt1215 || Class120_Sub12_Sub9.clickedMouseFunctionId != -1 && class73.anInt652 == Class120_Sub12_Sub9.clickedMouseFunctionId)) {
					int alpha;
					if (Class136.clickedMouseFunctionCycle <= 50) {
						alpha = Class136.clickedMouseFunctionCycle * 3;
					} else {
						alpha = 300 - 3 * Class136.clickedMouseFunctionCycle;
					}
					GraphicsLD.drawAlphaCircle(class120_sub14_sub5.worldMapX, class120_sub14_sub5.worldMapY, class107_sub1.width / 2 + 7, 16776960, alpha);
					GraphicsLD.drawAlphaCircle(class120_sub14_sub5.worldMapX, class120_sub14_sub5.worldMapY, class107_sub1.width / 2 + 5, 16776960, alpha);
					GraphicsLD.drawAlphaCircle(class120_sub14_sub5.worldMapX, class120_sub14_sub5.worldMapY, class107_sub1.width / 2 + 3, 16776960, alpha);
					GraphicsLD.drawAlphaCircle(class120_sub14_sub5.worldMapX, class120_sub14_sub5.worldMapY, class107_sub1.width / 2 + 1, 16776960, alpha);
					GraphicsLD.drawAlphaCircle(class120_sub14_sub5.worldMapX, class120_sub14_sub5.worldMapY, class107_sub1.width / 2, 16776960, alpha);
				}
				class107_sub1.method910(class120_sub14_sub5.worldMapX - (class107_sub1.width >> 1), class120_sub14_sub5.worldMapY - (class107_sub1.height >> 1));
				class120_sub16.anInt2605 = i + class120_sub14_sub5.worldMapX + (class107_sub1.width >> 1);
				class120_sub16.anInt2602 = i + class120_sub14_sub5.worldMapX - (class107_sub1.width >> 1);
				class120_sub16.anInt2604 = i_18_ + class120_sub14_sub5.worldMapY + (class107_sub1.height >> 1);
				class120_sub16.anInt2603 = i_18_ + class120_sub14_sub5.worldMapY - (class107_sub1.height >> 1);
			}
		}
		if (class73.headerText != null) {
			if (class107_sub1 != null) {
				Class120_Sub19.method1673(class120_sub14_sub5, class120_sub16, class73, i, 5 + (class107_sub1.height >> 1), i_18_, false);
			} else {
				Class120_Sub19.method1673(class120_sub14_sub5, class120_sub16, class73, i, 0, i_18_, true);
			}
		}
		if (class120_sub16.inBounds(Queue.lastMouseX, Class191.lastMouseY) && class73.actionPrefixes != null) {
			if (class73.actionPrefixes[4] != null) {
				InvType.addMenuOption(class73.actionPrefixes[4], class73.actionSufix, class120_sub14_sub5.id, class73.anInt652, 0, (short) 1011, -1);
			}
			if (class73.actionPrefixes[3] != null) {
				InvType.addMenuOption(class73.actionPrefixes[3], class73.actionSufix, class120_sub14_sub5.id, class73.anInt652, 0, (short) 1003, -1);
			}
			if (class73.actionPrefixes[2] != null) {
				InvType.addMenuOption(class73.actionPrefixes[2], class73.actionSufix, class120_sub14_sub5.id, class73.anInt652, 0, (short) 1008, -1);
			}
			if (class73.actionPrefixes[1] != null) {
				InvType.addMenuOption(class73.actionPrefixes[1], class73.actionSufix, class120_sub14_sub5.id, class73.anInt652, 0, (short) 1002, -1);
			}
			if (class73.actionPrefixes[0] != null) {
				InvType.addMenuOption(class73.actionPrefixes[0], class73.actionSufix, class120_sub14_sub5.id, class73.anInt652, 0, (short) 1012, -1);
			}
		}
		MapFunctionType.aClass105_653.addLast(class120_sub16);
	}

	static final void updateInterfacePosition(final JagexInterface jagexInterface, final int width, final int height) {
		if (jagexInterface.dynamicXValue == 0) {
			jagexInterface.x = jagexInterface.originalX;
		} else if (jagexInterface.dynamicXValue == 1) {
			jagexInterface.x = jagexInterface.originalX + (width - jagexInterface.width) / 2;
		} else if (jagexInterface.dynamicXValue == 2) {
			jagexInterface.x = -jagexInterface.originalX + -jagexInterface.width + width;
		} else if (jagexInterface.dynamicXValue == 3) {
			jagexInterface.x = jagexInterface.originalX * width >> 14;
		} else if (jagexInterface.dynamicXValue == 4) {
			jagexInterface.x = (jagexInterface.originalX * width >> 14) + (width - jagexInterface.width) / 2;
		} else {
			jagexInterface.x = -(width * jagexInterface.originalX >> 14) + -jagexInterface.width + width;
		}
		if (jagexInterface.dynamicYValue == 0) {
			jagexInterface.y = jagexInterface.originalY;
		} else if (jagexInterface.dynamicYValue == 1) {
			jagexInterface.y = jagexInterface.originalY + (-jagexInterface.height + height) / 2;
		} else if (jagexInterface.dynamicYValue == 2) {
			jagexInterface.y = height + -jagexInterface.height - jagexInterface.originalY;
		} else if (jagexInterface.dynamicYValue == 3) {
			jagexInterface.y = height * jagexInterface.originalY >> 14;
		} else if (jagexInterface.dynamicYValue == 4) {
			jagexInterface.y = (jagexInterface.originalY * height >> 14) + (height - jagexInterface.height) / 2;
		} else {
			jagexInterface.y = -(jagexInterface.originalY * height >> 14) + height + -jagexInterface.height;
		}
		if (Class120_Sub30_Sub1.aBoolean3673 && (client.getClickMask(jagexInterface).optionMask != 0 || jagexInterface.type == 0)) {
			if (jagexInterface.x < 0) {
				jagexInterface.x = 0;
			} else if (jagexInterface.x + jagexInterface.width > width) {
				jagexInterface.x = width - jagexInterface.width;
			}
			if (jagexInterface.y < 0) {
				jagexInterface.y = 0;
			} else if (jagexInterface.height + jagexInterface.y > height) {
				jagexInterface.y = height - jagexInterface.height;
			}
		}
	}

	abstract int getMaxY();
}
