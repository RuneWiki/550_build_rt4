/* Class190 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class190 {
	static Class50 aClass50_2099;
	static int anInt2100;
	static int anInt2101 = 0;

	static final boolean method2504(final int i, final int i_0_, final int i_1_, final int i_2_, final int i_3_, final boolean bool, final int i_4_, final int i_5_) {
		boolean bool_6_;
		try {
			if (!bool) {
				aClass50_2099 = null;
			}
			long l = Class114.method1005(i_0_, i_2_ + i_5_, i_4_ - -i_1_);
			if (l != 0L) {
				final int i_7_ = 0x3 & (int) l >> 20;
				final int i_8_ = ((int) l & 0x7e0cc) >> 14;
				final int i_9_ = 0x7fffffff & (int) (l >>> 32);
				final LocType locType = LocType.list(i_9_);
				if (locType.anInt1826 == -1) {
					int i_10_ = i;
					final int[] is = GraphicsLD.pixels;
					final int i_11_ = 24624 - (-(i_5_ * 4) + -((52736 + -(i_4_ * 512)) * 4));
					if (l > 0L) {
						i_10_ = i_3_;
					}
					if (i_8_ == 0 || i_8_ == 2) {
						if (i_7_ != 0) {
							if (i_7_ == 1) {
								is[i_11_] = i_10_;
								is[i_11_ - -1] = i_10_;
								is[i_11_ - -2] = i_10_;
								is[i_11_ - -3] = i_10_;
							} else if (i_7_ != 2) {
								if (i_7_ == 3) {
									is[i_11_ - -1536] = i_10_;
									is[1536 + i_11_ + 1] = i_10_;
									is[1538 + i_11_] = i_10_;
									is[3 + i_11_ - -1536] = i_10_;
								}
							} else {
								is[i_11_ + 3] = i_10_;
								is[512 + i_11_ + 3] = i_10_;
								is[1027 + i_11_] = i_10_;
								is[1536 + i_11_ - -3] = i_10_;
							}
						} else {
							is[i_11_] = i_10_;
							is[i_11_ + 512] = i_10_;
							is[i_11_ - -1024] = i_10_;
							is[1536 + i_11_] = i_10_;
						}
					}
					if (i_8_ == 3) {
						if (i_7_ == 0) {
							is[i_11_] = i_10_;
						} else if (i_7_ != 1) {
							if (i_7_ != 2) {
								if (i_7_ == 3) {
									is[i_11_ - -1536] = i_10_;
								}
							} else {
								is[3 + i_11_ + 1536] = i_10_;
							}
						} else {
							is[i_11_ + 3] = i_10_;
						}
					}
					if (i_8_ == 2) {
						if (i_7_ != 3) {
							if (i_7_ != 0) {
								if (i_7_ != 1) {
									if (i_7_ == 2) {
										is[1536 + i_11_] = i_10_;
										is[1536 + i_11_ + 1] = i_10_;
										is[1538 + i_11_] = i_10_;
										is[i_11_ - -1539] = i_10_;
									}
								} else {
									is[i_11_ + 3] = i_10_;
									is[512 + i_11_ + 3] = i_10_;
									is[1027 + i_11_] = i_10_;
									is[3 + i_11_ + 1536] = i_10_;
								}
							} else {
								is[i_11_] = i_10_;
								is[i_11_ - -1] = i_10_;
								is[i_11_ - -2] = i_10_;
								is[i_11_ + 3] = i_10_;
							}
						} else {
							is[i_11_] = i_10_;
							is[512 + i_11_] = i_10_;
							is[i_11_ + 1024] = i_10_;
							is[1536 + i_11_] = i_10_;
						}
					}
				} else if (!Class120_Sub14_Sub18.method1583(i_2_, i_4_, locType, 4, i_5_, i_1_, i_7_)) {
					return false;
				}
			}
			l = Class120_Sub11.method1173(i_0_, i_2_ + i_5_, i_1_ + i_4_);
			if (l != 0L) {
				final int i_12_ = ((int) l & 0x35e805) >> 20;
				final int i_13_ = 0x7fffffff & (int) (l >>> 32);
				final int i_14_ = ((int) l & 0x7da9b) >> 14;
				final LocType locType = LocType.list(i_13_);
				if (locType.anInt1826 == -1) {
					if (i_14_ == 9) {
						int i_15_ = 15658734;
						final int[] is = GraphicsLD.pixels;
						if (-1L > (l ^ 0xffffffffffffffffL)) {
							i_15_ = 15597568;
						}
						final int i_16_ = i_5_ * 4 + 24624 - -((52736 + -(512 * i_4_)) * 4);
						if (i_12_ == 0 || i_12_ == 2) {
							is[1536 + i_16_] = i_15_;
							is[1024 + i_16_ + 1] = i_15_;
							is[2 + i_16_ - -512] = i_15_;
							is[i_16_ - -3] = i_15_;
						} else {
							is[i_16_] = i_15_;
							is[1 + i_16_ + 512] = i_15_;
							is[i_16_ - -1024 - -2] = i_15_;
							is[3 + i_16_ + 1536] = i_15_;
						}
					}
				} else if (!Class120_Sub14_Sub18.method1583(i_2_, i_4_, locType, 4, i_5_, i_1_, i_12_)) {
					return false;
				}
			}
			l = Class79_Sub1.method696(i_0_, i_5_ + i_2_, i_1_ + i_4_);
			if (0L != l) {
				final int i_17_ = (int) (l >>> 32) & 0x7fffffff;
				final int i_18_ = (0x389bda & (int) l) >> 20;
				final LocType locType = LocType.list(i_17_);
				if ((locType.anInt1826 ^ 0xffffffff) != 0 && !Class120_Sub14_Sub18.method1583(i_2_, i_4_, locType, 4, i_5_, i_1_, i_18_)) {
					return false;
				}
			}
			bool_6_ = true;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("wi.C(").append(i).append(',').append(i_0_).append(',').append(i_1_).append(',').append(i_2_).append(',').append(i_3_).append(',').append(bool).append(',').append(i_4_).append(',').append(i_5_).append(')')
					.toString());
		}
		return bool_6_;
	}

	public static void method2505(final boolean bool) {
		try {
			aClass50_2099 = null;
			if (!bool) {
				aClass50_2099 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("wi.A(").append(bool).append(')').toString());
		}
	}

	static final void method2506(final int i) {
		Class120_Sub12_Sub1.sleepModifier2 = 1000 / i;
	}
}
