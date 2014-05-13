/* Class145 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class145 {
	static int sleepModifier1 = 1;
	static int anInt1379 = 1;
	int anInt1380 = -1;
	static int anInt1381;
	static int anInt1382;
	int[] anIntArray1383;
	int anInt1384 = -1;
	static byte[][] spritePaletteIndicators;

	private final void method2046(final int i, final int i_0_, final int i_1_, final Buffer class120_sub7) {
		try {
			if (i < -44) {
				if (i_0_ == 1) {
					this.anInt1384 = class120_sub7.getUShort();
				} else if (i_0_ == 2) {
					this.anIntArray1383 = new int[class120_sub7.getUByte()];
					for (int i_2_ = 0; i_2_ < this.anIntArray1383.length; i_2_++) {
						this.anIntArray1383[i_2_] = class120_sub7.getUShort();
					}
				} else if (i_0_ == 3) {
					this.anInt1380 = class120_sub7.getUByte();
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("qm.A(").append(i).append(',').append(i_0_).append(',').append(i_1_).append(',').append(class120_sub7 != null ? "{...}" : "null").append(')').toString());
		}
	}

	final void method2047(final int i, final int i_3_, final Buffer class120_sub7) {
		try {
			if (i != 14364) {
				this.anInt1380 = 74;
			}
			for (;;) {
				final int i_4_ = class120_sub7.getUByte();
				if (i_4_ == 0) {
					break;
				}
				method2046(-51, i_4_, i_3_, class120_sub7);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("qm.D(").append(i).append(',').append(i_3_).append(',').append(class120_sub7 != null ? "{...}" : "null").append(')').toString());
		}
	}

	static final void method2048(final JagexInterface jagexInterface, final int i, final int i_5_, final int i_6_, final int i_7_, final int i_8_, final int i_9_, final int i_10_) {
		try {
			if (i_6_ != 7403) {
				anInt1382 = -38;
			}
			final int i_11_ = i_7_ * i_7_ + i_9_ * i_9_;
			if (i >= i_11_) {
				int i_12_ = Math.min(jagexInterface.anInt1948 / 2, jagexInterface.anInt2059 / 2);
				if (i_11_ > i_12_ * i_12_) {
					i_12_ -= 10;
					final int i_13_ = Class164.anInt1590 + (int) OutputStream_Sub1.aFloat28 & 0x7ff;
					int i_14_ = Rasterizer.cosineTable[i_13_];
					i_14_ = 256 * i_14_ / (Class154.anInt1442 - -256);
					int i_15_ = Rasterizer.sineTable[i_13_];
					i_15_ = i_15_ * 256 / (Class154.anInt1442 + 256);
					final int i_16_ = i_14_ * i_7_ + -(i_9_ * i_15_) >> 16;
					final int i_17_ = i_9_ * i_14_ + i_15_ * i_7_ >> 16;
					final double d = Math.atan2(i_17_, i_16_);
					final int i_18_ = (int) (i_12_ * Math.sin(d));
					final int i_19_ = (int) (i_12_ * Math.cos(d));
					if (!HDToolkit.glEnabled) {
						((LDSprite) Class69_Sub2.aClass120_Sub14_Sub19Array2237[i_10_]).method1612(-10 + i_5_ + jagexInterface.anInt1948 / 2 + i_18_, -i_19_ + jagexInterface.anInt2059 / 2 + i_8_ + -10, 20, 20, 15, 15, d, 256);
					} else {
						((HDSprite) Class69_Sub2.aClass120_Sub14_Sub19Array2237[i_10_]).method1601(240, 240, (i_5_ - -(jagexInterface.anInt1948 / 2) + i_18_) * 16, (-i_19_ + i_8_ + jagexInterface.anInt2059 / 2) * 16, (int) (d * 10430.378), 4096);
					}
				} else {
					Class23.method200(i_5_, jagexInterface, i_8_, i_9_, 2, i_7_, Class120_Sub12_Sub5.aClass120_Sub14_Sub19Array3167[i_10_]);
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("qm.B(").append(jagexInterface != null ? "{...}" : "null").append(',').append(i).append(',').append(i_5_).append(',').append(i_6_).append(',').append(i_7_).append(',').append(i_8_).append(',').append(i_9_).append(',')
					.append(i_10_).append(')').toString());
		}
	}

	public static void method2049(final int i) {
		try {
			spritePaletteIndicators = null;
			if (i != -5868) {
				sleepModifier1 = -23;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("qm.C(").append(i).append(')').toString());
		}
	}

	public Class145() {
		/* empty */
	}
}
