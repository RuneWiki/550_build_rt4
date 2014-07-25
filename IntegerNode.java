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

	static final void method1831() {
		LocType.recentUse.clearSoftReference();
		InterfaceClickMask.aClass21_2663.clearSoftReference();
		Class167.aClass21_1618.clearSoftReference();
		Class116.aClass21_1117.clearSoftReference();
	}

	public static void method1832(final int i) {
		try {
			aString2788 = null;
			anIntArray2791 = null;
			aClass120_Sub9ArrayArray2789 = null;
			anIntArray2787 = null;
			if (i != 0) {
				method1831();
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("v.C(").append(i).append(')').toString());
		}
	}

	static final boolean method1833(final JagexInterface jagexInterface) {
		if (jagexInterface.clientCode == 205) {
			Class31.anInt244 = 250;
			return true;
		}
		return false;
	}

	public IntegerNode() {
		/* empty */
	}

	IntegerNode(final int i) {
		this.value = i;
	}
}
