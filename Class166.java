/* Class166 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class166 {
	static int anInt1612 = 0;
	static js5 aClass50_1613;

	static final void method2178(final js5 js5, final boolean bool, final js5 class50_0_) {
		Class69_Sub2.aBoolean2234 = bool;
		Class120_Sub12_Sub36.aClass50_3418 = class50_0_;
		Class120_Sub6.aClass50_2450 = js5;
	}

	public static void method2179(final byte i) {
		try {
			aClass50_1613 = null;
			if (i != 12) {
				method2179((byte) -64);
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("tl.E(").append(i).append(')').toString());
		}
	}

	static final void method2180(final GameEntity class180_sub5, final boolean bool) {
		try {
			if (bool) {
				final int i = -Class101_Sub2.loopCycle + class180_sub5.anInt3035;
				final int i_1_ = class180_sub5.anInt2967 * 128 - -(class180_sub5.getSize() * 64);
				final int i_2_ = class180_sub5.anInt3034 * 128 - -(64 * class180_sub5.getSize());
				if (class180_sub5.anInt3008 == 0) {
					class180_sub5.anInt3019 = 1024;
				}
				class180_sub5.z += (i_2_ - class180_sub5.z) / i;
				class180_sub5.x += (i_1_ - class180_sub5.x) / i;
				if (class180_sub5.anInt3008 == 1) {
					class180_sub5.anInt3019 = 1536;
				}
				class180_sub5.anInt3037 = 0;
				if (class180_sub5.anInt3008 == 2) {
					class180_sub5.anInt3019 = 0;
				}
				if (class180_sub5.anInt3008 == 3) {
					class180_sub5.anInt3019 = 512;
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("tl.A(").append(class180_sub5 != null ? "{...}" : "null").append(',').append(bool).append(')').toString());
		}
	}

	static final void method2181(final int i, final int i_3_) {
		try {
			if (i_3_ < 10) {
				aClass50_1613 = null;
			}
			Class120_Sub12_Sub9.aClass21_3196.method192(i);
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("tl.B(").append(i).append(',').append(i_3_).append(')').toString());
		}
	}

	static final void method2182(final int i, final String string) {
		try {
			if (i == 6137 && Class120_Sub28.aClass120_Sub13Array2754 != null) {
				int i_4_ = 0;
				final long l = Varp.stringToLong(string);
				if (0L != l) {
					for (/**/; Class120_Sub28.aClass120_Sub13Array2754.length > i_4_ && l != Class120_Sub28.aClass120_Sub13Array2754[i_4_].uid; i_4_++) {
						/* empty */
					}
					if (Class120_Sub28.aClass120_Sub13Array2754.length > i_4_ && Class120_Sub28.aClass120_Sub13Array2754[i_4_] != null) {
						Class120_Sub12_Sub11.outputStream.putByteIsaac(75);
						Class120_Sub12_Sub11.outputStream.putLong(Class120_Sub28.aClass120_Sub13Array2754[i_4_].uid);
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("tl.D(").append(i).append(',').append(string != null ? "{...}" : "null").append(')').toString());
		}
	}
}
