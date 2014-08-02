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
			throw EnumType.method1428(runtimeexception, new StringBuilder("qm.A(").append(i).append(',').append(i_0_).append(',').append(i_1_).append(',').append(class120_sub7 != null ? "{...}" : "null").append(')').toString());
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
			throw EnumType.method1428(runtimeexception, new StringBuilder("qm.D(").append(i).append(',').append(i_3_).append(',').append(class120_sub7 != null ? "{...}" : "null").append(')').toString());
		}
	}

	static final void method2048(final JagexInterface jagexInterface, final int maxDist, final int interfaceX, final int playerY, final int interfaceY, final int playerX, final int iconType) {
		final int dist = playerX * playerX + playerY * playerY;
		if (dist <= maxDist) {
			int i_12_ = Math.min(jagexInterface.width / 2, jagexInterface.height / 2);
			if (dist > i_12_ * i_12_) {
				i_12_ -= 10;
				final int i_13_ = Class164.anInt1590 + (int) DummyOutputStream.aFloat28 & 0x7ff;
				int i_14_ = Rasterizer.cosineTable[i_13_];
				i_14_ = 256 * i_14_ / (Class154.anInt1442 + 256);
				int i_15_ = Rasterizer.sineTable[i_13_];
				i_15_ = i_15_ * 256 / (Class154.anInt1442 + 256);
				final int i_16_ = i_14_ * playerY + -(playerX * i_15_) >> 16;
				final int i_17_ = playerX * i_14_ + i_15_ * playerY >> 16;
				final double d = Math.atan2(i_17_, i_16_);
				final int i_18_ = (int) (i_12_ * Math.sin(d));
				final int i_19_ = (int) (i_12_ * Math.cos(d));
				if (!HDToolkit.glEnabled) {
					((LDSprite) Class69_Sub2.aClass120_Sub14_Sub19Array2237[iconType]).method1612(-10 + interfaceX + jagexInterface.width / 2 + i_18_, -i_19_ + jagexInterface.height / 2 + interfaceY + -10, 20, 20, 15, 15, d, 256);
				} else {
					((HDSprite) Class69_Sub2.aClass120_Sub14_Sub19Array2237[iconType]).method1601(240, 240, (interfaceX - -(jagexInterface.width / 2) + i_18_) * 16, (-i_19_ + interfaceY + jagexInterface.height / 2) * 16, (int) (d * 10430.378), 4096);
				}
			} else {
				Class23.method200(interfaceX, jagexInterface, interfaceY, playerX, playerY, Class120_Sub12_Sub5.aClass120_Sub14_Sub19Array3167[iconType]);
			}
		}
	}

	public static void method2049(final int i) {
		try {
			spritePaletteIndicators = null;
			if (i != -5868) {
				sleepModifier1 = -23;
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("qm.C(").append(i).append(')').toString());
		}
	}

	public Class145() {
		/* empty */
	}
}
