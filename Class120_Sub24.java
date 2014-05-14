/* Class120_Sub24 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class120_Sub24 extends Node {
	static String[] aStringArray2716;
	int anInt2717;
	static int anInt2718;
	int anInt2719;
	int anInt2720 = -1;
	int anInt2721;
	int anInt2722;
	int anInt2723;
	static int menuWidth;
	int anInt2725;
	static String aString2726 = "Loaded sprites";
	int anInt2727;
	int anInt2728;
	int anInt2729;
	static int[] anIntArray2730;
	int anInt2731;
	int anInt2732 = 0;

	static {
		anInt2718 = 0;
		aStringArray2716 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
		anIntArray2730 = new int[] { 1, 1, 1, 1, 4, 1, 1, 5, 6, 1, 5, 0, 7, 0, 4, 1, 7, 2, 1, 1, 6, 1, 1, 3, 6, 1, 7, 0, 0, 6, 7, 0, 1, 7, 6, 1, 1, 1, 5, 4, 3, 2, 1, 1, 0, 4, 1, 5 };
	}

	public static void method1718(final byte i) {
		try {
			anIntArray2730 = null;
			aStringArray2716 = null;
			aString2726 = null;
			if (i != -76) {
				menuWidth = -65;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ra.A(").append(i).append(')').toString());
		}
	}
}
