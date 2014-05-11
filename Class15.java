/* Class15 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class15 {
	static Class21 aClass21_95;
	static int anInt96 = 0;
	static boolean menuOpen;
	static long aLong98;
	static Class120_Sub14_Sub8_Sub2 aClass120_Sub14_Sub8_Sub2_99;
	static byte[] aByteArray100;
	static int[] anIntArray101;

	static {
		aClass21_95 = new Class21(4);
		menuOpen = false;
		aLong98 = 0L;
		aByteArray100 = new byte[32896];
		int i = 0;
		for (int i_0_ = 0; i_0_ < 256; i_0_++) {
			for (int i_1_ = 0; i_1_ <= i_0_; i_1_++) {
				aByteArray100[i++] = (byte) (int) (255.0 / Math.sqrt((i_0_ * i_0_ + i_1_ * i_1_ - -65535) / 65535.0F));
			}
		}
		anIntArray101 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };
	}

	static final void method145(final Class50 class50, final int i) {
		try {
			if (i != 1024) {
				method145(null, 7);
			}
			ObjType.aClass50_1517 = class50;
			Class120_Sub12_Sub22.anInt3302 = ObjType.aClass50_1517.method441(16, 1);
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("be.A(").append(class50 != null ? "{...}" : "null").append(',').append(i).append(')').toString());
		}
	}

	public static void method146(final int i) {
		try {
			if (i > -98) {
				aLong98 = -10L;
			}
			aClass120_Sub14_Sub8_Sub2_99 = null;
			aByteArray100 = null;
			aClass21_95 = null;
			anIntArray101 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("be.B(").append(i).append(')').toString());
		}
	}

	static final Class120_Sub14_Sub6 method147(final int i, final int i_2_) {
		Class120_Sub14_Sub6 class120_sub14_sub6;
		try {
			if (i_2_ != 10057) {
				return null;
			}
			Class120_Sub14_Sub6 class120_sub14_sub6_3_ = (Class120_Sub14_Sub6) Light.aClass35_383.method302(i_2_ + 7244, i);
			if (class120_sub14_sub6_3_ != null) {
				return class120_sub14_sub6_3_;
			}
			final byte[] is = Class166.aClass50_1613.method442(5, (byte) 122, i);
			class120_sub14_sub6_3_ = new Class120_Sub14_Sub6();
			if (is != null) {
				class120_sub14_sub6_3_.method1448(0, new Buffer(is));
			}
			Light.aClass35_383.method301(i, 83, class120_sub14_sub6_3_);
			class120_sub14_sub6 = class120_sub14_sub6_3_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("be.C(").append(i).append(',').append(i_2_).append(')').toString());
		}
		return class120_sub14_sub6;
	}
}
