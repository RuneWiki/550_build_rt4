/* Class65 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class65 {
	static String aString591;
	static int anInt592;
	static int pingTimer = 0;
	static int[][] anIntArrayArray594;
	static DisplayModeInfo[] aClass171Array595;
	static int loadAttempts;
	static Class50 aClass50_597;

	static {
		aString591 = "Attack";
		anInt592 = 0;
		anIntArrayArray594 = new int[5][5000];
		loadAttempts = 0;
	}

	static final int method576(final int i, final byte i_0_) {
		int i_1_;
		try {
			if (i_0_ != 70) {
				loadAttempts = 13;
			}
			i_1_ = i >>> 8;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("hb.C(").append(i).append(',').append(i_0_).append(')').toString());
		}
		return i_1_;
	}

	public static void method577(final byte i) {
		try {
			aClass50_597 = null;
			anIntArrayArray594 = null;
			aClass171Array595 = null;
			aString591 = null;
			if (i <= 60) {
				method578(-105, null);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("hb.A(").append(i).append(')').toString());
		}
	}

	static final void method578(final int i, final Class120_Sub9[] class120_sub9s) {
		Canvas_Sub1.aClass120_Sub9ArrayArray17[i] = class120_sub9s;
	}
}
