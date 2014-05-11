/* Class56 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class56 {
	static Class21 aClass21_494 = new Class21(64);
	static int[] anIntArray495;
	private final int[] anIntArray496;
	static int anInt497 = -1;
	static int anInt498 = 0;

	static final void method486(final byte i) {
		try {
			if (i <= 100) {
				aClass21_494 = null;
			}
			Class107.aClass189Array1022 = null;
			Class43.method343(Class69.anInt616, 0, 0, (byte) -100, 0, Class120_Sub12_Sub5.canvasHeight, 0, Class69_Sub1.canvasWidth, -1);
			if (Class107.aClass189Array1022 != null) {
				Class142.method2008(Class120_Sub12_Sub38.anInt3438, -1412584499, (byte) -116, Class26.aClass189_161.anInt2082, Class107.aClass189Array1022, Class120_Sub12_Sub5.canvasHeight, Class69_Sub1.canvasWidth, 0, Class111.anInt1065, 0);
				Class107.aClass189Array1022 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("gf.A(").append(i).append(')').toString());
		}
	}

	final int method487(final int i, final int i_0_) {
		try {
			final int i_1_ = (anIntArray496.length >> 1) + -1;
			int i_2_ = i_0_ & i_1_;
			if (i > -70) {
				method490(5);
			}
			for (;;) {
				final int i_3_ = anIntArray496[1 + i_2_ + i_2_];
				if (i_3_ == -1) {
					return -1;
				}
				if (anIntArray496[i_2_ + i_2_] == i_0_) {
					return i_3_;
				}
				i_2_ = i_1_ & i_2_ + 1;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("gf.D(").append(i).append(',').append(i_0_).append(')').toString());
		}
	}

	static final int method488(final int i) {
		int i_4_;
		try {
			if (i != 23421) {
				return -84;
			}
			i_4_ = 6;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("gf.E(").append(i).append(')').toString());
		}
		return i_4_;
	}

	static final void method489(final byte i) {
		try {
			Class120_Sub14_Sub10.aClass75_3534.method662((byte) -104);
			AbstractMouseWheelHandler.aClass177_114.clear();
			if (i != -44) {
				method490(125);
			}
			Class88.aClass177_831.clear();
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("gf.C(").append(i).append(')').toString());
		}
	}

	public static void method490(final int i) {
		try {
			if (i <= -122) {
				aClass21_494 = null;
				anIntArray495 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("gf.B(").append(i).append(')').toString());
		}
	}

	Class56(final int[] is) {
		int i;
		for (i = 1; is.length + (is.length >> 1) >= i; i <<= 1) {
			/* empty */
		}
		anIntArray496 = new int[i + i];
		for (int i_5_ = 0; i_5_ < i + i; i_5_++) {
			anIntArray496[i_5_] = -1;
		}
		for (int i_6_ = 0; is.length > i_6_; i_6_++) {
			int i_7_;
			for (i_7_ = is[i_6_] & -1 + i; (anIntArray496[i_7_ + i_7_ + 1] ^ 0xffffffff) != 0; i_7_ = i - 1 & i_7_ + 1) {
				/* empty */
			}
			anIntArray496[i_7_ - -i_7_] = is[i_6_];
			anIntArray496[i_7_ - (-i_7_ - 1)] = i_6_;
		}
	}
}
