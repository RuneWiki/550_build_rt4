/* Class61 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class61 {
	static int[] anIntArray562;
	static int anInt563 = 0;
	static Class35 aClass35_564 = new Class35(64);
	static short aShort565;
	static boolean aBoolean566 = true;
	static long aLong567 = 0L;
	static String aString568;

	static {
		aShort565 = (short) 320;
		aString568 = "wishes to trade with you.";
	}

	public static void method554(final byte i) {
		try {
			aString568 = null;
			aClass35_564 = null;
			if (i != 73) {
				method554((byte) -85);
			}
			anIntArray562 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("gm.A(").append(i).append(')').toString());
		}
	}
}
