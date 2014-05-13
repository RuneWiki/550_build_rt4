/* Class120_Sub32 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class IntegerNode extends Node {
	static int[] anIntArray2787;
	static String aString2788 = "Loading interfaces - ";
	static Class120_Sub9[][] aClass120_Sub9ArrayArray2789;
	int value;
	static int[] anIntArray2791 = { 160, 192, 80, 96, 0, 144, 80, 48, 160 };
	static int anInt2792;
	static long killtime;

	static {
		anIntArray2787 = new int[2];
		killtime = 0L;
	}

	static final void method1831(final int i) {
		try {
			Class56.aClass21_494.clearSoftReference();
			InterfaceClickMask.aClass21_2663.clearSoftReference();
			if (i != 18786) {
				killtime = 81L;
			}
			Class167.aClass21_1618.clearSoftReference();
			Class116.aClass21_1117.clearSoftReference();
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("v.A(").append(i).append(')').toString());
		}
	}

	public static void method1832(final int i) {
		try {
			aString2788 = null;
			anIntArray2791 = null;
			aClass120_Sub9ArrayArray2789 = null;
			anIntArray2787 = null;
			if (i != 0) {
				method1831(113);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("v.C(").append(i).append(')').toString());
		}
	}

	static final boolean method1833(final byte i, final JagexInterface jagexInterface) {
		boolean bool;
		try {
			if (i != -101) {
				method1833((byte) 8, null);
			}
			if (jagexInterface.anInt1975 == 205) {
				Class31.anInt244 = 250;
				return true;
			}
			bool = false;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("v.B(").append(i).append(',').append(jagexInterface != null ? "{...}" : "null").append(')').toString());
		}
		return bool;
	}

	public IntegerNode() {
		/* empty */
	}

	IntegerNode(final int i) {
		this.value = i;
	}
}
