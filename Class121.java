/* Class121 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class121 {
	static int[] anIntArray1152 = { 0, 4, 4, 8, 0, 0, 8, 0, 0 };
	static int anInt1153 = 0;
	static int anInt1154;
	static String aString1155 = "Loaded fonts";

	public static void method1836(final int i) {
		try {
			aString1155 = null;
			anIntArray1152 = null;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("nl.D(").append(i).append(')').toString());
		}
	}

	static final String getMenuOptionName(final int option) {
		if (Class120_Sub12_Sub29.menuOptionSufix[option].length() <= 0) {
			return Class120_Sub12_Sub33.menuOptionPrefix[option];
		}
		return Class120_Sub12_Sub33.menuOptionPrefix[option] + Class29.aString196 + Class120_Sub12_Sub29.menuOptionSufix[option];
	}

	static final void method1839(final int i) {
		try {
			MapFunctionType.recentUse.clearSoftReference();
			if (i == -14307) {
				Class82.aClass21_786.clearSoftReference();
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("nl.A(").append(i).append(')').toString());
		}
	}
}
