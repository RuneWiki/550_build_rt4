/* Class134 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class134 {
	static AbstractSprite aClass120_Sub14_Sub19_1276;
	static boolean aBoolean1277;
	static int scrollbarId;
	static byte[][] aByteArrayArray1279;
	static int anInt1280;
	static int renderPriority;
	static boolean aBoolean1282;
	static String loadingText;
	static int[] anIntArray1284;
	static int[] anIntArray1285 = new int[128];
	static char[] aCharArray1286;
	static byte[][] aByteArrayArray1287;

	static {
		aBoolean1282 = false;
		loadingText = "";
		aCharArray1286 = new char[128];
		renderPriority = 0;
		anIntArray1284 = new int[2];
		aByteArrayArray1279 = new byte[250][];
	}

	static final String method1949(final boolean bool, final int i, final boolean bool_0_) {
		String string;
		try {
			if (!bool_0_ || i < 0) {
				return Integer.toString(i);
			}
			if (bool) {
				return null;
			}
			string = Class69_Sub3.method626(i, 10, -1556668830, bool_0_);
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("pj.B(").append(bool).append(',').append(i).append(',').append(bool_0_).append(')').toString());
		}
		return string;
	}

	public static void method1950(final int i) {
		try {
			aClass120_Sub14_Sub19_1276 = null;
			aByteArrayArray1279 = null;
			aCharArray1286 = null;
			anIntArray1284 = null;
			loadingText = null;
			if (i == -9077) {
				aByteArrayArray1287 = null;
				anIntArray1285 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("pj.A(").append(i).append(')').toString());
		}
	}
}
