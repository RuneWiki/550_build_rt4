/* Class121 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class121 {
	static int[] anIntArray1152 = { 0, 4, 4, 8, 0, 0, 8, 0, 0 };
	static int anInt1153 = 0;
	static int anInt1154;
	static String aString1155 = "Loaded fonts";

	public static void method1836() {
		aString1155 = null;
		anIntArray1152 = null;
	}

	static final String getMenuOptionName(final int option) {
		if (Class120_Sub12_Sub29.menuOptionSufix[option].length() <= 0) {
			return Class120_Sub12_Sub33.menuOptionPrefix[option];
		}
		return Class120_Sub12_Sub33.menuOptionPrefix[option] + Class29.aString196 + Class120_Sub12_Sub29.menuOptionSufix[option];
	}
}
