/* Class15 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class15 {
	static Cache aClass21_95;
	static int rectDebugType = 0;
	static boolean menuOpen;
	static long aLong98;
	static Class120_Sub14_Sub8_Sub2 aClass120_Sub14_Sub8_Sub2_99;
	static byte[] aByteArray100;
	static int[] anIntArray101;

	static {
		aClass21_95 = new Cache(4);
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

	static final void method145(final js5 js5, final int i) {
		try {
			if (i != 1024) {
				method145(null, 7);
			}
			ObjType.aClass50_1517 = js5;
			Class120_Sub12_Sub22.anInt3302 = ObjType.aClass50_1517.getFileAmount(16);
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("be.A(").append(js5 != null ? "{...}" : "null").append(',').append(i).append(')').toString());
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
			throw EnumType.method1428(runtimeexception, new StringBuilder("be.B(").append(i).append(')').toString());
		}
	}
}
