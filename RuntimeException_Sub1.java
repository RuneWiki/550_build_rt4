/* RuntimeException_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class RuntimeException_Sub1 extends RuntimeException {
	static byte[][] aByteArrayArray2140;
	String aString2141;
	static int anInt2142 = 255;
	static short aShort2143 = 1;
	static AbstractSprite aClass120_Sub14_Sub19_2144;
	static Class120_Sub14_Sub9 aClass120_Sub14_Sub9_2145;
	Throwable aThrowable2146;

	static final OverridedJInterface overrideInterface(final int i, final int i_0_, final int i_2_) {
		final OverridedJInterface class120_sub26_3_ = new OverridedJInterface();
		class120_sub26_3_.type = i_0_;
		class120_sub26_3_.interfaceId = i;
		Class120_Sub12_Sub13.overridedInterfaces.put(class120_sub26_3_, i_2_);
		ProjectileNode.stopInterfaceAnimation(i);
		final JagexInterface jagexInterface = Class74.getJagexInterface(i_2_);
		if (jagexInterface != null) {
			InterfaceClickMask.redrawInterface(jagexInterface);
		}
		if (Class156.aClass189_1454 != null) {
			InterfaceClickMask.redrawInterface(Class156.aClass189_1454);
			Class156.aClass189_1454 = null;
		}
		final int i_4_ = Class186.menuOptionCount;
		for (int i_5_ = 0; i_4_ > i_5_; i_5_++) {
			if (Class150.method2064(Class120_Sub29.menuOptionsCode[i_5_])) {
				Class120_Sub16.shiftOptions(i_5_);
			}
		}
		if (Class186.menuOptionCount == 1) {
			Class15.menuOpen = false;
			Class120_Sub12_Sub1.redrawScreen(Huffman.menuDrawX, Class120_Sub16.menuDrawY, Class120_Sub24.menuWidth, Class120_Sub14_Sub10.menuHeight);
		} else {
			Class120_Sub12_Sub1.redrawScreen(Huffman.menuDrawX, Class120_Sub16.menuDrawY, Class120_Sub24.menuWidth, Class120_Sub14_Sub10.menuHeight);
			int i_6_ = Class120_Sub12_Sub22.boldFont.method1459(Class111.aString1056);
			for (int i_7_ = 0; Class186.menuOptionCount > i_7_; i_7_++) {
				final int i_8_ = Class120_Sub12_Sub22.boldFont.method1459(Class121.getMenuOptionName(i_7_));
				if (i_6_ < i_8_) {
					i_6_ = i_8_;
				}
			}
			Class120_Sub14_Sub10.menuHeight = (Class186.usingSpriteMenu ? 26 : 22) + Class186.menuOptionCount * 15;
			Class120_Sub24.menuWidth = 8 + i_6_;
		}
		if (jagexInterface != null) {
			ProducingGraphicsBuffer.method1854(jagexInterface, false);
		}
		JagexSocket.executeOnloadScript(i);
		if (Class69.rootInterfaceId != -1) {
			InterfaceClickMask.method1689(1, Class69.rootInterfaceId);
		}
		return class120_sub26_3_;
	}

	public static void method2529(final int i) {
		aClass120_Sub14_Sub9_2145 = null;
		aByteArrayArray2140 = null;
		aClass120_Sub14_Sub19_2144 = null;
		if (i != -16553) {
			overrideInterface(2, 79, 61);
		}
	}

	static final void method2530(final int i, final int i_9_, final int i_10_, final int i_11_, final SceneGraphNode sceneGraphNode, final SceneGraphNode class180_12_, final int i_13_, final int i_14_, final long l) {
		if (sceneGraphNode != null || class180_12_ != null) {
			final Class182 class182 = new Class182();
			class182.bitPacked = l;
			class182.anInt1797 = i_9_ * 128 + 64;
			class182.anInt1795 = i_10_ * 128 + 64;
			class182.anInt1801 = i_11_;
			class182.aClass180_1800 = sceneGraphNode;
			class182.aClass180_1796 = class180_12_;
			class182.anInt1799 = i_13_;
			class182.anInt1792 = i_14_;
			for (int i_15_ = i; i_15_ >= 0; i_15_--) {
				if (LabelGroup.groundTiles[i_15_][i_9_][i_10_] == null) {
					LabelGroup.groundTiles[i_15_][i_9_][i_10_] = new GroundTile(i_15_, i_9_, i_10_);
				}
			}
			LabelGroup.groundTiles[i][i_9_][i_10_].aClass182_2628 = class182;
		}
	}

	RuntimeException_Sub1(final Throwable throwable, final String string) {
		this.aString2141 = string;
		this.aThrowable2146 = throwable;
	}
}
