/* Class155 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class155 {
	private final int[] anIntArray1446;
	private final int anInt1447;
	private final int anInt1448;
	private final int anInt1449;
	private final int anInt1450 = Class120_Sub23.method1717(16);
	private final int anInt1451;
	private final int anInt1452 = Class120_Sub23.method1717(24);

	final void method2084(final float[] fs, final int i, final boolean bool) {
		for (int i_0_ = 0; i_0_ < i; i_0_++) {
			fs[i_0_] = 0.0F;
		}
		if (!bool) {
			final int i_1_ = Class120_Sub23.aClass129Array2710[anInt1449].anInt1234;
			final int i_2_ = anInt1448 - anInt1452;
			final int i_3_ = i_2_ / anInt1447;
			final int[] is = new int[i_3_];
			for (int i_4_ = 0; i_4_ < 8; i_4_++) {
				int i_5_ = 0;
				while (i_5_ < i_3_) {
					if (i_4_ == 0) {
						int i_6_ = Class120_Sub23.aClass129Array2710[anInt1449].method1913();
						for (int i_7_ = i_1_ - 1; i_7_ >= 0; i_7_--) {
							if (i_5_ + i_7_ < i_3_) {
								is[i_5_ + i_7_] = i_6_ % anInt1451;
							}
							i_6_ /= anInt1451;
						}
					}
					for (int i_8_ = 0; i_8_ < i_1_; i_8_++) {
						final int i_9_ = is[i_5_];
						final int i_10_ = anIntArray1446[i_9_ * 8 + i_4_];
						if (i_10_ >= 0) {
							final int i_11_ = anInt1452 + i_5_ * anInt1447;
							final Class129 class129 = Class120_Sub23.aClass129Array2710[i_10_];
							if (anInt1450 == 0) {
								final int i_12_ = anInt1447 / class129.anInt1234;
								for (int i_13_ = 0; i_13_ < i_12_; i_13_++) {
									final float[] fs_14_ = class129.method1910();
									for (int i_15_ = 0; i_15_ < class129.anInt1234; i_15_++) {
										fs[i_11_ + i_13_ + i_15_ * i_12_] += fs_14_[i_15_];
									}
								}
							} else {
								int i_16_ = 0;
								while (i_16_ < anInt1447) {
									final float[] fs_17_ = class129.method1910();
									for (int i_18_ = 0; i_18_ < class129.anInt1234; i_18_++) {
										fs[i_11_ + i_16_] += fs_17_[i_18_];
										i_16_++;
									}
								}
							}
						}
						if (++i_5_ >= i_3_) {
							break;
						}
					}
				}
			}
		}
	}

	Class155() {
		anInt1448 = Class120_Sub23.method1717(24);
		anInt1447 = Class120_Sub23.method1717(24) + 1;
		anInt1451 = Class120_Sub23.method1717(6) + 1;
		anInt1449 = Class120_Sub23.method1717(8);
		final int[] is = new int[anInt1451];
		for (int i = 0; i < anInt1451; i++) {
			int i_19_ = 0;
			final int i_20_ = Class120_Sub23.method1717(3);
			final boolean bool = Class120_Sub23.method1712() != 0;
			if (bool) {
				i_19_ = Class120_Sub23.method1717(5);
			}
			is[i] = i_19_ << 3 | i_20_;
		}
		anIntArray1446 = new int[anInt1451 * 8];
		for (int i = 0; i < anInt1451 * 8; i++) {
			anIntArray1446[i] = (is[i >> 3] & 1 << (i & 0x7)) != 0 ? Class120_Sub23.method1717(8) : -1;
		}
	}
}
