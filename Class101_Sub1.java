/* Class101_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class101_Sub1 extends Class101 {
	static Deque locationAmbientSounds = new Deque();
	private int anInt2267;
	private final int anInt2268;
	private final int anInt2269;
	private final int anInt2270;
	static byte[][] underWaterLocationsMapFileBuffers;
	static int anInt2272;
	static Class22 aClass22_2273;
	static AbstractSprite[] mapFlagSprites;
	static int anInt2275 = 0;

	@Override
	final void method833(final int i, final int i_0_) {
		final int i_2_ = i * anInt2269 >> 12;
		final int i_3_ = anInt2270 * i >> 12;
		final int i_4_ = i_0_ * anInt2267 >> 12;
		final int i_5_ = i_0_ * anInt2268 >> 12;
		Varp.method635(i_3_, this.anInt960, i_2_, this.anInt964, this.anInt959, i_5_, i_4_);
	}

	static final void method842(final Deque deque, final int i, final int i_10_) {
		MapFunctionType.aClass105_653.clear();
		if (!Class120_Sub12_Sub27.disableWorldMapMapFunctions) {
			for (MapFunctionNode class120_sub14_sub5 = (MapFunctionNode) deque.getFront(); class120_sub14_sub5 != null; class120_sub14_sub5 = (MapFunctionNode) deque.getNext()) {
				final MapFunctionType class73 = MapFunctionType.list(class120_sub14_sub5.id);
				if (Class9.method116(class73)) {
					SceneGraphNode.method2271(class120_sub14_sub5, class73, i, i_10_);
					if (class120_sub14_sub5.aBoolean3476) {
						SubScript.method2244(class120_sub14_sub5, class73);
					}
				}
			}
		}
	}

	@Override
	final void method834(final int i_11_, final int i_12_) {
		final int i_13_ = anInt2269 * i_11_ >> 12;
		final int i_14_ = anInt2270 * i_11_ >> 12;
		final int i_15_ = anInt2267 * i_12_ >> 12;
		final int i_16_ = anInt2268 * i_12_ >> 12;
		UnderlayType.method1901(i_15_, i_13_, this.anInt960, i_16_, true, i_14_);
	}

	Class101_Sub1(final int i, final int i_17_, final int i_18_, final int i_19_, final int i_20_, final int i_21_, final int i_22_) {
		super(i_20_, i_21_, i_22_);
		anInt2269 = i;
		anInt2270 = i_18_;
		anInt2268 = i_17_;
		anInt2267 = i_19_;
	}

	static final void drawTextOnMinimap(final AbstractFont font, final JagexInterface jagexInterface, final int interfaceX, final int interfaceY, final int mapFunctionX, final int mapFunctionY, final String text, final int color, final int yOff) {
		final int maxDist = mapFunctionX * mapFunctionX + mapFunctionY * mapFunctionY;
		final int dist = Math.max(jagexInterface.width / 2, jagexInterface.height / 2) + 10;
		if (dist * dist >= maxDist) {
			final int rot = (int) DummyOutputStream.cameraYaw & 0x7ff;
			int rotSin = Rasterizer.sinTable[rot];
			int rotCos = Rasterizer.cosTable[rot];
			int posX = rotSin * mapFunctionY + rotCos * mapFunctionX >> 16;
			final int posY = rotCos * mapFunctionY - rotSin * mapFunctionX >> 16;
			final int i_35_ = font.method1468(text, 100);
			final int i_36_ = font.method1480(text, 100, 0);
			posX -= i_35_ / 2;
			if (-jagexInterface.width <= posX && posX <= jagexInterface.width && -jagexInterface.height <= posY && posY <= jagexInterface.height) {
				if (HDToolkit.glEnabled) {
					GraphicsHD.method595((HDSprite) jagexInterface.constructSpriteFromId(false));
				} else {
					GraphicsLD.method2164(jagexInterface.startOfSpriteLookupTable, jagexInterface.lengthOfSpriteLookupTable);
				}
				font.method1467(text, posX + interfaceX + jagexInterface.width / 2, interfaceY + jagexInterface.height / 2 - posY - yOff - i_36_, i_35_, 50, color, 0, 256, 1, 0, 0);
				if (!HDToolkit.glEnabled) {
					GraphicsLD.method2174();
				} else {
					GraphicsHD.method601();
				}
			}
		}
	}

	@Override
	final void method837(final int i, final int i_38_) {
	}
}
