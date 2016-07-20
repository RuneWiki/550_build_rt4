/* Class120_Sub19 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class120_Sub19 extends Node {
	int anInt2654;
	static int anInt2655 = 3353893;
	int anInt2656;
	static int lastWorldId;
	static int[] anIntArray2658 = new int[128];

	static {
		lastWorldId = 0;
	}

	static final void method1673(final MapFunctionNode class120_sub14_sub5, final Class120_Sub16 class120_sub16, final MapFunctionType class73, final int i, final int i_0_, final int i_1_, final boolean bool) {
		WorldMapFont class98 = null;
		if (class73.fontType == 0) {
			if (WorldMapHandler.currentZoom == 3.0) {
				class98 = PlayerAppearance.aClass98_1373;
			}
			if (WorldMapHandler.currentZoom == 4.0) {
				class98 = Class92.aClass98_863;
			}
			if (WorldMapHandler.currentZoom == 6.0) {
				class98 = Class112.aClass98_1070;
			}
			if (WorldMapHandler.currentZoom >= 8.0) {
				class98 = Class110.aClass98_1052;
			}
		} else if (class73.fontType == 1) {
			if (3.0 == WorldMapHandler.currentZoom) {
				class98 = Class112.aClass98_1070;
			}
			if (4.0 == WorldMapHandler.currentZoom) {
				class98 = Class110.aClass98_1052;
			}
			if (WorldMapHandler.currentZoom == 6.0) {
				class98 = FileSystemRequest.aClass98_3929;
			}
			if (WorldMapHandler.currentZoom >= 8.0) {
				class98 = World.aClass98_2833;
			}
		} else if (class73.fontType == 2) {
			if (3.0 == WorldMapHandler.currentZoom) {
				class98 = FileSystemRequest.aClass98_3929;
			}
			if (WorldMapHandler.currentZoom == 4.0) {
				class98 = World.aClass98_2833;
			}
			if (WorldMapHandler.currentZoom == 6.0) {
				class98 = OverlayType.aClass98_1201;
			}
			if (WorldMapHandler.currentZoom >= 8.0) {
				class98 = SubInterface.aClass98_2739;
			}
		}
		if (class98 != null) {
			int color = class73.unfocusedFontColor;
			if (class120_sub14_sub5.focused && class73.focusedFontColor != -1) {
				color = class73.focusedFontColor;
			}
			final int i_4_ = ObjectCache.smallFont.method1486(class73.headerText, null, Class125.aStringArray2148);
			int i_5_ = class120_sub14_sub5.worldMapY;
			if (!bool) {
				i_5_ -= i_0_ - (-((-1 + i_4_) * class98.method817()) + -(class98.method813() / 2));
			} else {
				i_5_ -= class98.method813() * i_4_ / 2;
			}
			final int i_6_ = i_5_ + -class98.method813();
			i_5_ += class98.method813() / 2;
			int i_7_ = 0;
			for (int i_8_ = 0; i_8_ < i_4_; i_8_++) {
				String string = Class125.aStringArray2148[i_8_];
				if (-1 + i_4_ > i_8_) {
					string = string.substring(0, string.length() - 4);
				}
				final int i_9_ = class98.method811(string);
				if (i_7_ < i_9_) {
					i_7_ = i_9_;
				}
			}
			class120_sub16.textStartX = i + class120_sub14_sub5.worldMapX + -(i_7_ / 2) ;
			class120_sub16.textEndX = i + class120_sub14_sub5.worldMapX + i_7_ / 2;
			class120_sub16.textStartY = i_1_ + i_6_;
			class120_sub16.textEndY = i_1_ + i_6_ + class98.method817() * i_4_;
			final int i_10_ = i_6_ + 2 ;
			final int i_11_ = -(i_7_ / 2) + class120_sub14_sub5.worldMapX + -5;
			if (class73.fillRectARGB != 0) {
				GraphicsLD.fillRectAlpha(i_11_, i_10_, i_7_ + 10, 1 + i_6_ - -(i_4_ * class98.method817()) - i_10_, class73.fillRectARGB, class73.fillRectARGB >>> 24);
			}
			if (class73.rectARGB != 0) {
				GraphicsLD.drawRectAlpha(i_11_, i_10_, i_7_ + 10, -i_10_ + class98.method817() * i_4_ + i_6_ + 1, class73.rectARGB, class73.rectARGB >>> 24);
			}
			for (int i_12_ = 0; i_12_ < i_4_; i_12_++) {
				String string = Class125.aStringArray2148[i_12_];
				if (i_4_ - 1 > i_12_) {
					string = string.substring(0, string.length() - 4);
				}
				final int i_13_ = class98.method811(string);
				if (i_7_ < i_13_) {
					i_7_ = i_13_;
				}
				class98.method815(string, class120_sub14_sub5.worldMapX, i_5_, color, true);
				i_5_ += class98.method817();
			}
		}
	}

	static final void removeSubInterface(final SubInterface subInterface, final boolean uncache) {
		final int uid = (int) subInterface.uid;
		final int interfaceId = subInterface.interfaceId;
		subInterface.unlink();
		if (uncache) {
			Class120_Sub12_Sub32.uncacheJInterface(interfaceId);
		}
		Class120_Sub15.clearClickMasks(interfaceId);
		final JagexInterface jagexInterface = Class74.getJagexInterface(uid);
		if (jagexInterface != null) {
			InterfaceClickMask.redrawInterface(jagexInterface);
		}
		for (int option = 0; option < WallDecoration.menuOptionCount; option++) {
			if (Class150.method2064(Class120_Sub29.menuOptionsCode[option])) {
				Class120_Sub16.shiftOptions(option);
			}
		}
		if (WallDecoration.menuOptionCount != 1) {
			Class120_Sub12_Sub1.redrawScreen(Huffman.menuDrawX, Class120_Sub16.menuDrawY, CustomLocation.menuWidth, QuickChatMessageType.menuHeight);
			int i_18_ = Class120_Sub12_Sub22.boldFont.method1459(StringLibrary.chooseOption);
			for (int i_19_ = 0; WallDecoration.menuOptionCount > i_19_; i_19_++) {
				final int i_20_ = Class120_Sub12_Sub22.boldFont.method1459(client.getMenuOptionText(i_19_));
				if (i_20_ > i_18_) {
					i_18_ = i_20_;
				}
			}
			QuickChatMessageType.menuHeight = (WallDecoration.usingSpriteMenu ? 26 : 22) + 15 * WallDecoration.menuOptionCount;
			CustomLocation.menuWidth = 8 + i_18_;
		} else {
			Class15.menuOpen = false;
			Class120_Sub12_Sub1.redrawScreen(Huffman.menuDrawX, Class120_Sub16.menuDrawY, CustomLocation.menuWidth, QuickChatMessageType.menuHeight);
		}
		if (Class69.rootInterfaceId != -1) {
			InterfaceClickMask.method1689(1, Class69.rootInterfaceId);
		}
	}

	Class120_Sub19(final int i, final int i_21_) {
		this.anInt2656 = i;
		this.anInt2654 = i_21_;
	}
}
