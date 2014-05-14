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
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("nl.D(").append(i).append(')').toString());
		}
	}

	static final Class120_Sub14_Sub10 method1837(final int i, final boolean bool) {
		Class120_Sub14_Sub10 class120_sub14_sub10;
		try {
			Class120_Sub14_Sub10 class120_sub14_sub10_0_ = (Class120_Sub14_Sub10) Class26.aClass35_158.method302(17301, i);
			if (class120_sub14_sub10_0_ != null) {
				return class120_sub14_sub10_0_;
			}
			byte[] is;
			if (32768 > i) {
				is = Class24.aClass50_143.getFile(1, i);
			} else {
				is = IsaacCipher.aClass50_1011.getFile(1, i & 0x7fff);
			}
			class120_sub14_sub10_0_ = new Class120_Sub14_Sub10();
			if (is != null) {
				class120_sub14_sub10_0_.method1505(new Buffer(is), 0);
			}
			if (!bool) {
				getMenuOptionName(-17);
			}
			if (i >= 32768) {
				class120_sub14_sub10_0_.method1507(90);
			}
			Class26.aClass35_158.method301(i, 69, class120_sub14_sub10_0_);
			class120_sub14_sub10 = class120_sub14_sub10_0_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("nl.B(").append(i).append(',').append(bool).append(')').toString());
		}
		return class120_sub14_sub10;
	}

	static final String getMenuOptionName(final int option) {
		if (Class120_Sub12_Sub29.aStringArray3369[option].length() <= 0) {
			return Class120_Sub12_Sub33.menuOptionName[option];
		}
		return Class120_Sub12_Sub33.menuOptionName[option] + Class29.aString196 + Class120_Sub12_Sub29.aStringArray3369[option];
	}

	static final void method1839(final int i) {
		try {
			Class120_Sub12_Sub14.aClass21_3238.clearSoftReference();
			if (i == -14307) {
				Class82.aClass21_786.clearSoftReference();
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("nl.A(").append(i).append(')').toString());
		}
	}
}
