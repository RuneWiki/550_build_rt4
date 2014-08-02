/* Class79_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class79_Sub1 extends Class79 {
	static String[] stringArguments;
	static int anInt2244;
	static js5 aClass50_2245;
	static int[] anIntArray2246 = new int[256];
	static String[] friendsSideText;

	static {
		anInt2244 = 0;
		friendsSideText = new String[200];
	}

	static final void resetTitleScreen() {
		if (Class101_Sub3.titleScreenSpritesDrawn) {
			Class101_Sub3.titleScreenSpritesDrawn = false;
			KeyboardHandler.titlebgSprite = null;
			Class120_Sub12_Sub27.logoSprite = null;
		}
	}

	public static void method694(final int i) {
		try {
			friendsSideText = null;
			if (i <= 79) {
				aClass50_2245 = null;
			}
			aClass50_2245 = null;
			anIntArray2246 = null;
			stringArguments = null;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("kn.D(").append(i).append(')').toString());
		}
	}

	static final void method695() {
		Class33.aClass21_273.clear();
	}

	static final long method696(final int x, final int z, final int level) {
		final GroundTile class120_sub18 = LabelGroup.groundTiles[level][x][z];
		if (class120_sub18 == null || class120_sub18.aClass36_2650 == null) {
			return 0L;
		}
		return class120_sub18.aClass36_2650.bitPacked;
	}
}
