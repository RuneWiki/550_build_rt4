/* Class8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class8 {
	static String aString64 = "Discard";
	static byte[][][] aByteArrayArrayArray65;

	static final void method109(final Class50 class50, final Class50 class50_0_, final byte i) {
		try {
			Class21.aClass120_Sub14_Sub8_121 = Class9.method117(class50, class50_0_, 18265, Class32.anInt270, 0);
			if (HDToolkit.glEnabled) {
				Class33.aClass120_Sub14_Sub8_Sub2_274 = Class93.method772(0, class50_0_, Class32.anInt270, class50, 1);
			} else {
				Class33.aClass120_Sub14_Sub8_Sub2_274 = (Class120_Sub14_Sub8_Sub2) Class21.aClass120_Sub14_Sub8_121;
			}
			Class120_Sub12_Sub20.aClass120_Sub14_Sub8_3286 = Class9.method117(class50, class50_0_, 18265, Class191.anInt2115, 0);
			Class120_Sub12_Sub22.aClass120_Sub14_Sub8_3303 = Class9.method117(class50, class50_0_, 18265, Class110.anInt1051, 0);
			if (i < 68) {
				aByteArrayArrayArray65 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("aj.A(").append(class50 != null ? "{...}" : "null").append(',').append(class50_0_ != null ? "{...}" : "null").append(',').append(i).append(')').toString());
		}
	}

	static final int method110(final char c, final String string, final boolean bool) {
		int i;
		try {
			int i_1_ = 0;
			final int i_2_ = string.length();
			if (bool) {
				return -30;
			}
			for (int i_3_ = 0; i_3_ < i_2_; i_3_++) {
				if (string.charAt(i_3_) == c) {
					i_1_++;
				}
			}
			i = i_1_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("aj.D(").append(c).append(',').append(string != null ? "{...}" : "null").append(',').append(bool).append(')').toString());
		}
		return i;
	}

	static final void method111(final byte i) {
		try {
			AbstractGraphicsBuffer.anInt1175 = 0;
			client.aByte2201 = i;
			Class65.anInt592 = 0;
			Class120_Sub12_Sub26.anInt3327 = 0;
			Class180_Sub1.aBoolean2848 = false;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("aj.C(").append(i).append(')').toString());
		}
	}

	public static void method112(final byte i) {
		try {
			if (i >= -28) {
				aString64 = null;
			}
			aString64 = null;
			aByteArrayArrayArray65 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("aj.B(").append(i).append(')').toString());
		}
	}
}
