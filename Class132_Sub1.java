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
	static Image loadingTextImage;
	private int anInt2810;
	static boolean[][] aBooleanArrayArray2811;
	static int[] spritePalette;
	static js5 framesJs5;
	private final int anInt2815;
	static int worldListDataOff = 0;
	private int anInt2817;

	static {
		aBooleanArrayArray2811 = new boolean[][] { { true, true, true }, new boolean[2], { false, true }, { true, false }, { false, true, true }, { true, false, true }, { false, true, false }, { true, false, false } };
	}

	static final void method1931() {
		for (int id = 0; id < 100; id++) {
			MasterIndexInfo.needInterfaceRedrawWrapper[id] = true;
		}
	}

	void method1932(final int i, final byte i_1_) {
		aByteArray2808[i] = i_1_;
	}

	@Override
	final void method1922() {
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
	}

	@Override
	final void method1925() {
		anInt2807 = 0;
		anInt2803 = 0;
	}

	@Override
	final void method1927(final int i, final int i_10_) {
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
	}

	Class132_Sub1(final int i, final int i_12_, final int i_13_, final int i_14_, final int i_15_, final float f, final float f_16_, final float f_17_) {
		super(i, i_12_, i_13_, i_14_, i_15_);
		anInt2804 = (int) (f_16_ * 4096.0F);
		anInt2815 = (int) (4096.0F * f_17_);
		anInt2802 = anInt2810 = (int) (Math.pow(0.5, -f) * 4096.0);
	}
}
