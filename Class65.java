/* Class65 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class65 {
	static String aString591;
	static int flagY;
	static int pingTimer = 0;
	static int[][] anIntArrayArray594;
	static DisplayModeInfo[] displayModes;
	static int loadAttempts;
	static js5 aClass50_597;

	static {
		aString591 = "Attack";
		flagY = 0;
		anIntArrayArray594 = new int[5][5000];
		loadAttempts = 0;
	}

	static final int method576(final int i) {
		return i >>> 8;
	}

	static final void method578(final int i, final Class120_Sub9[] class120_sub9s) {
		Canvas_Sub1.aClass120_Sub9ArrayArray17[i] = class120_sub9s;
	}
}
