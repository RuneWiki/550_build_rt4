/* Class99 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class99 {
	static byte[][][] aByteArrayArrayArray949;
	static boolean aBoolean950;
	static int anInt951;
	static String aString952 = "wave2:";
	static boolean aBoolean953;
	static int anInt954;

	static final Class182 method821(final int i, final int i_0_, final int i_1_) {
		final Class120_Sub18 class120_sub18 = Class120_Sub1.aClass120_Sub18ArrayArrayArray2411[i][i_0_][i_1_];
		if (class120_sub18 == null) {
			return null;
		}
		final Class182 class182 = class120_sub18.aClass182_2628;
		class120_sub18.aClass182_2628 = null;
		return class182;
	}

	static final void method822(final int i, final int i_2_) {
		try {
			Class117.method1021(Class117.anInt1126, (i * 0.1F + 0.7F) * 1.1523438F, 0.69921875F, 0.69921875F);
			if (i_2_ <= -32) {
				Class117.method1014(-50.0F, -60.0F, -50.0F);
				Class117.method1020(Class117.anInt1128, 0, false);
				Class117.method1016();
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ko.A(").append(i).append(',').append(i_2_).append(')').toString());
		}
	}

	public static void method823(final int i) {
		try {
			if (i != -3237) {
				method822(63, 109);
			}
			aByteArrayArrayArray949 = null;
			aString952 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ko.C(").append(i).append(')').toString());
		}
	}
}
