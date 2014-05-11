/* Class178 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class178 {
	static int anInt1771;
	static Class45 aClass45_1772;

	static final int method2256(final boolean bool, final int i, int i_0_) {
		int i_1_;
		try {
			if ((i ^ 0xffffffff) == 0) {
				return 12345678;
			}
			i_0_ = (i & 0x7f) * i_0_ >> 7;
			if (i_0_ >= 2) {
				if (i_0_ > 126) {
					i_0_ = 126;
				}
			} else {
				i_0_ = 2;
			}
			if (!bool) {
				return 59;
			}
			i_1_ = i_0_ + (i & 0xff80);
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("um.A(").append(bool).append(',').append(i).append(',').append(i_0_).append(')').toString());
		}
		return i_1_;
	}

	static final void method2257(final boolean bool) {
		if (bool) {
			Class120_Sub1.aClass120_Sub18ArrayArrayArray2411 = Class120_Sub12_Sub38.aClass120_Sub18ArrayArrayArray3437;
			Class120_Sub26.anIntArrayArrayArray2741 = Class24.anIntArrayArrayArray140;
			Canvas_Sub1.aClass120_Sub9ArrayArray17 = Class120_Sub32.aClass120_Sub9ArrayArray2789;
		} else {
			Class120_Sub1.aClass120_Sub18ArrayArrayArray2411 = Class86.aClass120_Sub18ArrayArrayArray820;
			Class120_Sub26.anIntArrayArrayArray2741 = Class120_Sub12_Sub33.anIntArrayArrayArray3388;
			Canvas_Sub1.aClass120_Sub9ArrayArray17 = Class180_Sub1.aClass120_Sub9ArrayArray2844;
		}
		Class142.anInt1361 = Class120_Sub1.aClass120_Sub18ArrayArrayArray2411.length;
	}

	public static void method2258(final byte i) {
		try {
			if (i > -85) {
				anInt1771 = -119;
			}
			aClass45_1772 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("um.B(").append(i).append(')').toString());
		}
	}
}
