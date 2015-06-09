/* Class134 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class134 {
	static AbstractSprite landscapeAsAbstractSprite;
	static boolean aBoolean1277;
	static int scrollbarId;
	static byte[][] aByteArrayArray1279;
	static int anInt1280;
	static int entityRenderPriority;
	static boolean dynamicMapRegion;
	static String loadingText;
	static int[] anIntArray1284;
	static int[] anIntArray1285 = new int[128];
	static char[] aCharArray1286;
	static byte[][] locationMapFilesBuffer;

	static {
		dynamicMapRegion = false;
		loadingText = "";
		aCharArray1286 = new char[128];
		entityRenderPriority = 0;
		anIntArray1284 = new int[2];
		aByteArrayArray1279 = new byte[250][];
	}

	static final String method1949(final int i, final boolean bool_0_) {
		if (!bool_0_ || i < 0) {
			return Integer.toString(i);
		}
		return Class69_Sub3.method626(i, 10, bool_0_);
	}

}
