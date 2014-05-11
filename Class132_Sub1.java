/* Class132_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Image;

class Class132_Sub1 extends Class132 {
	private int anInt2802;
	private int anInt2803;
	private final int anInt2804;
	static Class120_Sub15 aClass120_Sub15_2805 = new Class120_Sub15(0, 0);
	private int anInt2806;
	private int anInt2807;
	private byte[] aByteArray2808;
	static Image anImage2809;
	private int anInt2810;
	static boolean[][] aBooleanArrayArray2811;
	static int[] spritePalette;
	static Class50 aClass50_2813;
	static int anInt2814;
	private final int anInt2815;
	static int anInt2816 = 0;
	private int anInt2817;

	static {
		aBooleanArrayArray2811 = new boolean[][] { { true, true, true }, new boolean[2], { false, true }, { true, false }, { false, true, true }, { true, false, true }, { false, true, false }, { true, false, false } };
		anInt2814 = 1;
	}

	static final void method1931(final int i) {
		try {
			for (int i_0_ = 0; i_0_ < 100; i_0_++) {
				Class52.aBooleanArray467[i_0_] = true;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ea.A(").append(i).append(')').toString());
		}
	}

	void method1932(final int i, final byte i_1_) {
		try {
			aByteArray2808[i] = i_1_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ea.G(").append(i).append(',').append(i_1_).append(')').toString());
		}
	}

	@Override
	final void method1922(final byte i) {
		try {
			anInt2802 = anInt2810;
			anInt2807 >>= 4;
			if (anInt2807 >= 0) {
				if (anInt2807 > 255) {
					anInt2807 = 255;
				}
			} else {
				anInt2807 = 0;
			}
			method1932(anInt2803++, (byte) anInt2807);
			anInt2807 = 0;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ea.E(").append(i).append(')').toString());
		}
	}

	static final Class70 method1933(final byte i, final int i_2_) {
		Class70 class70;
		try {
			if (i > -105) {
				method1933((byte) 102, 66);
			}
			Class70 class70_3_ = (Class70) Class86.aClass21_816.method193(i_2_, (byte) 64);
			if (class70_3_ != null) {
				return class70_3_;
			}
			final byte[] is = ObjType.aClass50_1517.method442(16, (byte) 110, i_2_);
			class70_3_ = new Class70();
			if (is != null) {
				class70_3_.method637(new Buffer(is), 40);
			}
			Class86.aClass21_816.method185(-125, class70_3_, i_2_);
			class70 = class70_3_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ea.B(").append(i).append(',').append(i_2_).append(')').toString());
		}
		return class70;
	}

	static final Class41 method1934(final int i, final byte i_4_, final int i_5_, final int i_6_, final int i_7_) {
		Class41 class41;
		try {
			final long l = 0xffffL & i_6_ | (0xffffL & i) << 48 | (0xffffL & i_5_) << 32 | (i_7_ & 0xffffL) << 16;
			Class41 class41_8_ = (Class41) Class120_Sub6.aClass21_2443.method193(l, (byte) 33);
			if (class41_8_ != null) {
				return class41_8_;
			}
			Class97[] class97s = null;
			final Class145 class145 = Class120_Sub14_Sub14_Sub2.method1551(i_6_, (byte) -83);
			if (class145.anIntArray1383 != null) {
				class97s = new Class97[class145.anIntArray1383.length];
				for (int i_9_ = 0; i_9_ < class97s.length; i_9_++) {
					final Class153 class153 = Class189.method2494((byte) -10, class145.anIntArray1383[i_9_]);
					class97s[i_9_] = new Class97(class153.anInt1434, class153.anInt1429, class153.anInt1427, class153.anInt1428, class153.anInt1431, class153.anInt1435, class153.anInt1432, class153.aBoolean1430);
				}
			}
			class41_8_ = new Class41(class145.anInt1384, class97s, class145.anInt1380, i, i_5_, i_7_);
			Class120_Sub6.aClass21_2443.method185(-127, class41_8_, l);
			class41 = class41_8_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ea.D(").append(i).append(',').append(i_4_).append(',').append(i_5_).append(',').append(i_6_).append(',').append(i_7_).append(')').toString());
		}
		return class41;
	}

	@Override
	final void method1925(final int i) {
		try {
			anInt2807 = 0;
			anInt2803 = 0;
			if (i != 255) {
				method1934(-3, (byte) 87, -16, 108, -56);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ea.I(").append(i).append(')').toString());
		}
	}

	public static void method1935(final int i) {
		try {
			spritePalette = null;
			anImage2809 = null;
			aClass120_Sub15_2805 = null;
			aClass50_2813 = null;
			if (i == 2061936524) {
				aBooleanArrayArray2811 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ea.C(").append(i).append(')').toString());
		}
	}

	@Override
	final void method1927(final int i, final int i_10_, final byte i_11_) {
		try {
			if (i != 0) {
				anInt2806 = anInt2817 * anInt2815 >> 12;
				if (anInt2806 >= 0) {
					if (anInt2806 > 4096) {
						anInt2806 = 4096;
					}
				} else {
					anInt2806 = 0;
				}
				anInt2817 = anInt2804 + -(i_10_ < 0 ? -i_10_ : i_10_);
				anInt2817 = anInt2817 * anInt2817 >> 12;
				anInt2817 = anInt2817 * anInt2806 >> 12;
				anInt2807 += anInt2802 * anInt2817 >> 12;
				anInt2802 = anInt2802 * anInt2810 >> 12;
			} else {
				anInt2806 = 4096;
				anInt2817 = anInt2804 - (i_10_ < 0 ? -i_10_ : i_10_);
				anInt2817 = anInt2817 * anInt2817 >> 12;
				anInt2807 = anInt2817;
			}
			if (i_11_ >= -17) {
				anImage2809 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ea.F(").append(i).append(',').append(i_10_).append(',').append(i_11_).append(')').toString());
		}
	}

	Class132_Sub1(final int i, final int i_12_, final int i_13_, final int i_14_, final int i_15_, final float f, final float f_16_, final float f_17_) {
		super(i, i_12_, i_13_, i_14_, i_15_);
		anInt2804 = (int) (f_16_ * 4096.0F);
		anInt2815 = (int) (4096.0F * f_17_);
		anInt2802 = anInt2810 = (int) (Math.pow(0.5, -f) * 4096.0);
	}
}
