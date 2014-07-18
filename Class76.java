/* Class76 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class76 {
	static String[] aStringArray677 = new String[100];
	static js5 aClass50_678;
	static int[] anIntArray679;
	static int[] anIntArray680;

	static final int method663(final int i, final byte i_0_) {
		int i_1_;
		try {
			if (i_0_ != -67) {
				method664(-44);
			}
			i_1_ = i & 0xff;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("id.A(").append(i).append(',').append(i_0_).append(')').toString());
		}
		return i_1_;
	}

	public static void method664(final int i) {
		try {
			aClass50_678 = null;
			anIntArray679 = null;
			if (i != 100) {
				method665((byte) 28, null);
			}
			aStringArray677 = null;
			anIntArray680 = null;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("id.B(").append(i).append(')').toString());
		}
	}

	static final void method665(final byte i, final js5 js5) {
		try {
			SeqType.aClass50_331 = js5;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("id.C(").append(i).append(',').append(js5 != null ? "{...}" : "null").append(')').toString());
		}
	}
}
