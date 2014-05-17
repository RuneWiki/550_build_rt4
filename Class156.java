/* Class156 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class156 {
	static int anInt1453;
	static JagexInterface aClass189_1454 = null;
	static int lastMouseClick;
	static Class50 aClass50_1456;
	static String aString1457 = "glow2:";
	static int[] anIntArray1458;

	static {
		lastMouseClick = 0;
		anIntArray1458 = new int[] { 16, 32, 64, 128 };
	}

	static final void method2085(final int i) {
		try {
			Class120_Sub10.aClass21_2542.clear();
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("sg.B(").append(i).append(')').toString());
		}
	}

	public static void method2086(final int i) {
		try {
			aString1457 = null;
			aClass50_1456 = null;
			anIntArray1458 = null;
			if (i != -2366) {
				lastMouseClick = -83;
			}
			aClass189_1454 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("sg.A(").append(i).append(')').toString());
		}
	}
}
