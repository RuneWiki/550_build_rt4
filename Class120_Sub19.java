/* Class120_Sub19 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class120_Sub19 extends Node {
	static String aString2653 = "M";
	int anInt2654;
	static int anInt2655 = 3353893;
	int anInt2656;
	static int anInt2657;
	static int[] anIntArray2658 = new int[128];

	static {
		anInt2657 = 0;
	}

	static final void method1673(final MapFunctionNode class120_sub14_sub5, final Class120_Sub16 class120_sub16, final MapFunctionType class73, final int i, final int i_0_, final int i_1_, final boolean bool) {
		WorldMapFont class98 = null;
		if (class73.fontType == 0) {
			if (3.0 == WorldMapHandler.currentZoom) {
				class98 = PlayerAppearance.aClass98_1373;
			}
			if (WorldMapHandler.currentZoom == 4.0) {
				class98 = Class92.aClass98_863;
			}
			if (6.0 == WorldMapHandler.currentZoom) {
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
				class98 = OverridedJInterface.aClass98_2739;
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
			class120_sub16.anInt2601 = class120_sub14_sub5.worldMapX + -(i_7_ / 2) - -i;
			class120_sub16.anInt2609 = i + class120_sub14_sub5.worldMapX + i_7_ / 2;
			class120_sub16.anInt2606 = i_6_ + i_1_;
			class120_sub16.anInt2607 = i_1_ + i_6_ + class98.method817() * i_4_;
			final int i_10_ = i_6_ + 2 ;
			final int i_11_ = -(i_7_ / 2) + class120_sub14_sub5.worldMapX + -5;
			if (class73.fillRectARGB != 0) {
				GraphicsLD.fillRect(i_11_, i_10_, i_7_ + 10, 1 + i_6_ - -(i_4_ * class98.method817()) - i_10_, class73.fillRectARGB, class73.fillRectARGB >>> 24);
			}
			if (class73.rectARGB != 0) {
				GraphicsLD.drawRect(i_11_, i_10_, i_7_ + 10, -i_10_ + class98.method817() * i_4_ + i_6_ + 1, class73.rectARGB, class73.rectARGB >>> 24);
			}
			for (int i_12_ = 0; i_12_ < i_4_; i_12_++) {
				String string = Class125.aStringArray2148[i_12_];
				if (i_4_ - 1 > i_12_) {
					string = string.substring(0, -4 + string.length());
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

	public static void method1674(final int i) {
		try {
			aString2653 = null;
			anIntArray2658 = null;
			if (i != 6530) {
				anInt2657 = -121;
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("ol.D(").append(i).append(')').toString());
		}
	}

	static final void removeOverridedInterface(final OverridedJInterface class120_sub26, final boolean bool) {
		final int uid = (int) class120_sub26.uid;
		final int interfaceId = class120_sub26.interfaceId;
		class120_sub26.unlink();
		if (bool) {
			Class120_Sub12_Sub32.uncacheJInterface(interfaceId);
		}
		Class120_Sub15.clearClickMasks(interfaceId);
		final JagexInterface jagexInterface = Class74.getJagexInterface(uid);
		if (jagexInterface != null) {
			InterfaceClickMask.redrawInterface(jagexInterface);
		}
		for (int option = 0; option < Class186.menuOptionCount; option++) {
			if (Class150.method2064(Class120_Sub29.menuOptionsCode[option])) {
				Class120_Sub16.shiftOptions(option);
			}
		}
		if (Class186.menuOptionCount != 1) {
			Class120_Sub12_Sub1.redrawScreen(Huffman.menuDrawX, Class120_Sub16.menuDrawY, Class120_Sub24.menuWidth, Class120_Sub14_Sub10.menuHeight);
			int i_18_ = Class120_Sub12_Sub22.boldFont.method1459(Class111.aString1056);
			for (int i_19_ = 0; Class186.menuOptionCount > i_19_; i_19_++) {
				final int i_20_ = Class120_Sub12_Sub22.boldFont.method1459(Class121.getMenuOptionName(i_19_));
				if (i_20_ > i_18_) {
					i_18_ = i_20_;
				}
			}
			Class120_Sub14_Sub10.menuHeight = (Class186.usingSpriteMenu ? 26 : 22) + 15 * Class186.menuOptionCount;
			Class120_Sub24.menuWidth = 8 + i_18_;
		} else {
			Class15.menuOpen = false;
			Class120_Sub12_Sub1.redrawScreen(Huffman.menuDrawX, Class120_Sub16.menuDrawY, Class120_Sub24.menuWidth, Class120_Sub14_Sub10.menuHeight);
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
