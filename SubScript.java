/* Class176 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class SubScript {
	ClientScript origClientScript;
	String[] stringLocalVariables;
	int opcodeIndex = -1;
	static short[][] aShortArrayArray1764 = { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 },
			{ 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };
	int[] intLocalVariables;
	
	static final int method2242(final int x, final int z, final int level) {
		if ((Class114.tileSettings[level][x][z] & 0x8) != 0) {
			return 0;
		}
		if (level > 0 && (Class114.tileSettings[1][x][z] & 0x2) != 0) {
			return level - 1;
		}
		return level;
	}

	static final String method2243() {
		String string_4_;
		if (Light.objSelected == 1 && WallDecoration.menuOptionCount < 2) {
			string_4_ = StringLibrary.use + StringLibrary.useSeperator + Class192.selectedObjName + " ->";
		} else if (Class88.spellSelected && WallDecoration.menuOptionCount < 2) {
			string_4_ = Class101.selectedSpellPrefix + StringLibrary.useSeperator + Light.selectedSpellName + " ->";
		} else if (SpotAnimationNode.shiftClickEnabled && NodeCache.heldKeys[81] && WallDecoration.menuOptionCount > 2) {
			string_4_ = client.getMenuOptionText(WallDecoration.menuOptionCount - 2);
		} else {
			string_4_ = client.getMenuOptionText(WallDecoration.menuOptionCount - 1);
		}
		if (WallDecoration.menuOptionCount > 2) {
			string_4_ += "<col=ffffff> / " + (WallDecoration.menuOptionCount - 2) + StringLibrary.moreOptions;
		}
		return string_4_;
	}

	static final void method2244(final MapFunctionNode mapFunctionNode, final MapFunctionType mapFunctionType) {
		final LDIndexedSprite mapFunctionSprite = mapFunctionType.constructSpriteForWorldMap();
		if (mapFunctionSprite != null) {
			int i_5_ = mapFunctionSprite.width;
			if (i_5_ < mapFunctionSprite.height) {
				i_5_ = mapFunctionSprite.height;
			}
			int i_6_ = mapFunctionNode.worldMapX;
			int i_7_ = mapFunctionNode.worldMapY;
			int i_8_ = 0;
			int i_9_ = 0;
			int i_10_ = 0;
			if (mapFunctionType.headerText != null) {
				i_8_ = ObjectCache.smallFont.method1486(mapFunctionType.headerText, null, Class125.aStringArray2148);
				for (int i_11_ = 0; i_11_ < i_8_; i_11_++) {
					String string = Class125.aStringArray2148[i_11_];
					if (i_8_ - 1 > i_11_) {
						string = string.substring(0, -4 + string.length());
					}
					final int i_12_ = Class112.aClass98_1070.method811(string);
					if (i_9_ < i_12_) {
						i_9_ = i_12_;
					}
				}
				i_10_ = (i_8_ + -1) * Class112.aClass98_1070.method817() + Class112.aClass98_1070.method813() / 2;
			}
			int i_13_ = mapFunctionNode.worldMapX;
			if (WorldMapHandler.anInt708 + i_5_ <= i_6_) {
				if (-i_5_ + WorldMapHandler.anInt709 < i_6_) {
					i_13_ = -5 + -i_5_ + WorldMapHandler.anInt709 - i_5_ / 2 - i_9_ / 2;
					i_6_ = WorldMapHandler.anInt709 - i_5_;
				}
			} else {
				i_6_ = i_5_ + WorldMapHandler.anInt708;
				i_13_ = 5 + i_9_ / 2 + i_5_ / 2 + WorldMapHandler.anInt708 - -i_5_;
			}
			int i_14_ = mapFunctionNode.worldMapY - i_10_ / 2;
			if (i_7_ >= i_5_ + WorldMapHandler.anInt705) {
				if (-i_5_ + WorldMapHandler.anInt712 < i_7_) {
					i_14_ = -i_5_ + WorldMapHandler.anInt712 - (i_5_ / 2 + i_10_);
					i_7_ = WorldMapHandler.anInt712 - i_5_;
				}
			} else {
				i_7_ = WorldMapHandler.anInt705 + i_5_;
				i_14_ = i_5_ / 2 + i_5_ + WorldMapHandler.anInt705 - -Class112.aClass98_1070.method817();
			}
			int i_15_ = -2;
			int i_16_ = -2;
			i_5_ >>= 1;
			int i_17_ = -2;
			final int i_18_ = (int) (Math.atan2(i_6_ - mapFunctionNode.worldMapX, -mapFunctionNode.worldMapY + i_7_) / Math.PI * 32767.0) & 0xffff;
			int i_19_ = -2;
			mapFunctionSprite.method917(mapFunctionSprite.trimWidth << 3, mapFunctionSprite.trimHeight << 3, i_5_ + (i_6_ << 4), i_5_ + (i_7_ << 4), i_18_, 4096);
			if (mapFunctionType.headerText != null) {
				i_16_ = i_14_ - Class112.aClass98_1070.method813() - 3;
				i_15_ = i_13_ + -(i_9_ / 2) - 5;
				i_19_ = i_8_ * Class112.aClass98_1070.method817() + i_16_;
				i_17_ = i_9_ + i_15_ + 10;
				if (mapFunctionType.fillRectARGB != 0) {
					GraphicsLD.fillRectAlpha(i_15_, i_16_, -i_15_ + i_17_, -i_16_ + i_19_, mapFunctionType.fillRectARGB, mapFunctionType.fillRectARGB >>> 24);
				}
				if (mapFunctionType.rectARGB != 0) {
					GraphicsLD.drawRectAlpha(i_15_, i_16_, -i_15_ + i_17_, -i_16_ + i_19_, mapFunctionType.rectARGB, mapFunctionType.rectARGB >>> 24);
				}
				for (int i_20_ = 0; i_8_ > i_20_; i_20_++) {
					String string = Class125.aStringArray2148[i_20_];
					if (i_20_ < i_8_ - 1) {
						string = string.substring(0, -4 + string.length());
					}
					Class112.aClass98_1070.method815(string, i_13_, i_14_, mapFunctionType.unfocusedFontColor, true);
					i_14_ += Class112.aClass98_1070.method817();
				}
			}
			if (Queue.lastMouseX > -i_5_ + i_6_ && i_6_ - -i_5_ > Queue.lastMouseX && ChunkAtmosphere.lastMouseY > -i_5_ + i_7_ && ChunkAtmosphere.lastMouseY < i_7_ - -i_5_ || Queue.lastMouseX > i_15_ && i_17_ > Queue.lastMouseX && i_16_ < ChunkAtmosphere.lastMouseY && ChunkAtmosphere.lastMouseY < i_19_) {
				if (mapFunctionType.actionPrefixes[4] != null) {
					InvType.addMenuOption(mapFunctionType.actionPrefixes[4], mapFunctionType.actionSufix, mapFunctionNode.id, 0, 0, (short) 1011, -1);
				}
				if (mapFunctionType.actionPrefixes[3] != null) {
					InvType.addMenuOption(mapFunctionType.actionPrefixes[3], mapFunctionType.actionSufix, mapFunctionNode.id, 0, 0, (short) 1003, -1);
				}
				if (mapFunctionType.actionPrefixes[2] != null) {
					InvType.addMenuOption(mapFunctionType.actionPrefixes[2], mapFunctionType.actionSufix, mapFunctionNode.id, 0, 0, (short) 1008, -1);
				}
				if (mapFunctionType.actionPrefixes[1] != null) {
					InvType.addMenuOption(mapFunctionType.actionPrefixes[1], mapFunctionType.actionSufix, mapFunctionNode.id, 0, 0, (short) 1002, -1);
				}
				if (mapFunctionType.actionPrefixes[0] != null) {
					InvType.addMenuOption(mapFunctionType.actionPrefixes[0], mapFunctionType.actionSufix, mapFunctionNode.id, 0, 0, (short) 1012, -1);
				}
			}
		}
	}

	public SubScript() {
		/* empty */
	}

	static final int method2246(final int i, final int i_22_, final int i_23_) {
		final int i_25_ = i_22_ / i_23_;
		final int i_26_ = i_23_ + -1 & i_22_;
		final int i_27_ = i / i_23_;
		final int i_28_ = i_23_ + -1 & i;
		final int i_29_ = InterfaceListener.method1172(i_27_, i_25_);
		final int i_30_ = InterfaceListener.method1172(i_27_, i_25_ + 1);
		final int i_31_ = InterfaceListener.method1172(i_27_ + 1, i_25_);
		final int i_32_ = InterfaceListener.method1172(i_27_ + 1, i_25_ + 1);
		final int i_33_ = Class24.method208(i_23_, i_30_, i_29_, i_26_);
		final int i_34_ = Class24.method208(i_23_, i_32_, i_31_, i_26_);
		return Class24.method208(i_23_, i_34_, i_33_, i_28_);
	}
}
