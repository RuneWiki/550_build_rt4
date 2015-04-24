/* Class146 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class146 {
	private static float[][] aFloatArrayArray1386;
	static int[][] anIntArrayArray1387 = new int[2][8];
	static int anInt1388;
	private final int[][][] anIntArrayArrayArray1389;
	private final int[][][] anIntArrayArrayArray1390;
	int[] anIntArray1391 = new int[2];
	private static float aFloat1392;
	private final int[] anIntArray1393;

	static {
		aFloatArrayArray1386 = new float[2][8];
	}

	private final float method2050(final int i, final int i_0_, final float f) {
		float f_1_ = anIntArrayArrayArray1389[i][0][i_0_] + f * (anIntArrayArrayArray1389[i][1][i_0_] - anIntArrayArrayArray1389[i][0][i_0_]);
		f_1_ *= 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0, -f_1_ / 20.0F);
	}

	final int method2052(final int i, final float f) {
		if (i == 0) {
			float f_2_ = anIntArray1393[0] + (anIntArray1393[1] - anIntArray1393[0]) * f;
			f_2_ *= 0.0030517578F;
			aFloat1392 = (float) Math.pow(0.1, f_2_ / 20.0F);
			anInt1388 = (int) (aFloat1392 * 65536.0F);
		}
		if (this.anIntArray1391[i] == 0) {
			return 0;
		}
		float f_3_ = method2050(i, 0, f);
		aFloatArrayArray1386[i][0] = -2.0F * f_3_ * (float) Math.cos(method2055(i, 0, f));
		aFloatArrayArray1386[i][1] = f_3_ * f_3_;
		for (int i_4_ = 1; i_4_ < this.anIntArray1391[i]; i_4_++) {
			f_3_ = method2050(i, i_4_, f);
			final float f_5_ = -2.0F * f_3_ * (float) Math.cos(method2055(i, i_4_, f));
			final float f_6_ = f_3_ * f_3_;
			aFloatArrayArray1386[i][i_4_ * 2 + 1] = aFloatArrayArray1386[i][i_4_ * 2 - 1] * f_6_;
			aFloatArrayArray1386[i][i_4_ * 2] = aFloatArrayArray1386[i][i_4_ * 2 - 1] * f_5_ + aFloatArrayArray1386[i][i_4_ * 2 - 2] * f_6_;
			for (int i_7_ = i_4_ * 2 - 1; i_7_ >= 2; i_7_--) {
				aFloatArrayArray1386[i][i_7_] += aFloatArrayArray1386[i][i_7_ - 1] * f_5_ + aFloatArrayArray1386[i][i_7_ - 2] * f_6_;
			}
			aFloatArrayArray1386[i][1] += aFloatArrayArray1386[i][0] * f_5_ + f_6_;
			aFloatArrayArray1386[i][0] += f_5_;
		}
		if (i == 0) {
			for (int i_8_ = 0; i_8_ < this.anIntArray1391[0] * 2; i_8_++) {
				aFloatArrayArray1386[0][i_8_] *= aFloat1392;
			}
		}
		for (int i_9_ = 0; i_9_ < this.anIntArray1391[i] * 2; i_9_++) {
			anIntArrayArray1387[i][i_9_] = (int) (aFloatArrayArray1386[i][i_9_] * 65536.0F);
		}
		return this.anIntArray1391[i] * 2;
	}

	private static final float method2053(final float f) {
		final float f_10_ = 32.703197F * (float) Math.pow(2.0, f);
		return f_10_ * 3.1415927F / 11025.0F;
	}

	final void method2054(final Buffer class120_sub7, final Class63 class63) {
		final int i = class120_sub7.getUByte();
		this.anIntArray1391[0] = i >> 4;
		this.anIntArray1391[1] = i & 0xf;
		if (i != 0) {
			anIntArray1393[0] = class120_sub7.getUShort();
			anIntArray1393[1] = class120_sub7.getUShort();
			final int i_11_ = class120_sub7.getUByte();
			for (int i_12_ = 0; i_12_ < 2; i_12_++) {
				for (int i_13_ = 0; i_13_ < this.anIntArray1391[i_12_]; i_13_++) {
					anIntArrayArrayArray1390[i_12_][0][i_13_] = class120_sub7.getUShort();
					anIntArrayArrayArray1389[i_12_][0][i_13_] = class120_sub7.getUShort();
				}
			}
			for (int i_14_ = 0; i_14_ < 2; i_14_++) {
				for (int i_15_ = 0; i_15_ < this.anIntArray1391[i_14_]; i_15_++) {
					if ((i_11_ & 1 << i_14_ * 4 << i_15_) != 0) {
						anIntArrayArrayArray1390[i_14_][1][i_15_] = class120_sub7.getUShort();
						anIntArrayArrayArray1389[i_14_][1][i_15_] = class120_sub7.getUShort();
					} else {
						anIntArrayArrayArray1390[i_14_][1][i_15_] = anIntArrayArrayArray1390[i_14_][0][i_15_];
						anIntArrayArrayArray1389[i_14_][1][i_15_] = anIntArrayArrayArray1389[i_14_][0][i_15_];
					}
				}
			}
			if (i_11_ != 0 || anIntArray1393[1] != anIntArray1393[0]) {
				class63.method574(class120_sub7);
			}
		} else {
			anIntArray1393[0] = anIntArray1393[1] = 0;
		}
	}

	private final float method2055(final int i, final int i_16_, final float f) {
		float f_17_ = anIntArrayArrayArray1390[i][0][i_16_] + f * (anIntArrayArrayArray1390[i][1][i_16_] - anIntArrayArrayArray1390[i][0][i_16_]);
		f_17_ *= 1.2207031E-4F;
		return method2053(f_17_);
	}

	public Class146() {
		anIntArrayArrayArray1390 = new int[2][2][4];
		anIntArrayArrayArray1389 = new int[2][2][4];
		anIntArray1393 = new int[2];
	}
}
