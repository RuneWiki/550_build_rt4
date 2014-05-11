/* Class69_Sub2_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class69_Sub2_Sub1 extends Class69_Sub2 {
	static String aString3078 = " is already on your ignore list.";

	static final int method620(final String string) {
		return string.length() + 1;
	}

	public static void method621(final int i) {
		try {
			if (i == -4112) {
				aString3078 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("hm.F(").append(i).append(')').toString());
		}
	}

	static final void method622(final int i) {
		try {
			Class86.aClass21_816.method190(false);
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("hm.I(").append(i).append(')').toString());
		}
	}

	static final int method623(final int i) {
		int i_1_;
		try {
			if (i != 1) {
				method623(-54);
			}
			i_1_ = Class120_Sub14_Sub15.anInt3582;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("hm.H(").append(i).append(')').toString());
		}
		return i_1_;
	}
}
