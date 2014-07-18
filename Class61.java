/* Class61 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class61 {
	static int[] anIntArray562;
	static int anInt563 = 0;
	static short aShort565;
	static boolean aBoolean566 = true;
	static long allocateGcTime = 0L;
	static String aString568;

	static {
		aShort565 = (short) 320;
		aString568 = "wishes to trade with you.";
	}

	public static void method554(final byte i) {
		try {
			aString568 = null;
			StructType.recentUse = null;
			if (i != 73) {
				method554((byte) -85);
			}
			anIntArray562 = null;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("gm.A(").append(i).append(')').toString());
		}
	}
}
