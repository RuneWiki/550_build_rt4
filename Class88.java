/* Class88 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class88 {
	Class180 aClass180_826;
	static int anInt827;
	static boolean aBoolean828 = false;
	static Class105 aClass105_829;
	Class107_Sub1 aClass107_Sub1_830;
	static Queue aClass177_831;
	static int anInt832;
	static int[] anIntArray833;
	static Class50 aClass50_834;
	static boolean aBoolean835;

	static {
		anInt827 = 0;
		aClass105_829 = new Class105();
		aClass177_831 = new Queue();
		anIntArray833 = new int[32];
		aBoolean835 = false;
	}

	static final void method743(final byte i, final int i_0_, final int i_1_, final int i_2_, final Class25 class25, final int i_3_, final int i_4_) {
		try {
			int i_5_ = -1;
			long l = 0L;
			if (i > -97) {
				aClass105_829 = null;
			}
			if (i_3_ == 0) {
				l = Class114.method1005(i_0_, i_4_, i_2_);
			} else if (i_3_ == 1) {
				l = Class189.method2502(i_0_, i_4_, i_2_);
			} else if (i_3_ != 2) {
				if (i_3_ == 3) {
					l = Class79_Sub1.method696(i_0_, i_4_, i_2_);
				}
			} else {
				l = Class120_Sub11.method1173(i_0_, i_4_, i_2_);
			}
			final int i_6_ = ((int) l & 0x7dc53) >> 14;
			i_5_ = 0x7fffffff & (int) (l >>> 32);
			final int i_7_ = 0x3 & (int) l >> 20;
			Class184 class184 = Class120_Sub1.method1035(i_5_, 0);
			if (class184.method2466(-120)) {
				Class120_Sub12.method1183(i_2_, class184, i_0_, 16157, i_4_);
			}
			if ((l ^ 0xffffffffffffffffL) != -1L) {
				Class180 class180 = null;
				Class180 class180_8_ = null;
				if (i_3_ == 0) {
					final Class182 class182 = Class99.method821(i_0_, i_4_, i_2_);
					if (class182 != null) {
						class180_8_ = class182.aClass180_1796;
						class180 = class182.aClass180_1800;
					}
					if (class184.anInt1821 != 0) {
						class25.method215(i_7_, !class184.aBoolean1880, i_4_, i_6_, class184.aBoolean1844, 123, i_2_);
					}
				} else if (i_3_ == 1) {
					final Class186 class186 = Class153.method2072(i_0_, i_4_, i_2_);
					if (class186 != null) {
						class180 = class186.aClass180_1901;
						class180_8_ = class186.aClass180_1898;
					}
				} else if (i_3_ == 2) {
					final Class28 class28 = Class120_Sub12_Sub17.method1281(i_0_, i_4_, i_2_);
					if (class28 != null) {
						class180 = class28.aClass180_174;
					}
					if (class184.anInt1821 != 0 && i_4_ + class184.anInt1841 < 104 && class184.anInt1841 + i_2_ < 104 && i_4_ + class184.anInt1827 < 104 && class184.anInt1827 + i_2_ < 104) {
						class25.method214(i_7_, i_2_, class184.anInt1827, 3, class184.aBoolean1844, i_4_, class184.anInt1841, !class184.aBoolean1880);
					}
				} else if (i_3_ == 3) {
					final Class36 class36 = Class118.method1022(i_0_, i_4_, i_2_);
					if (class36 != null) {
						class180 = class36.aClass180_309;
					}
					if (class184.anInt1821 == 1) {
						class25.method228(33, i_4_, i_2_);
					}
				}
				if (class184.anIntArray1852 != null) {
					class184 = class184.method2456(0);
				}
				if (HDToolkit.glEnabled && class184 != null && class184.aBoolean1823) {
					if (i_6_ != 2) {
						if (i_6_ != 5) {
							if (i_6_ == 6) {
								if (!(class180 instanceof Class180_Sub6)) {
									Buffer.method1094(i_4_, Class55.anIntArray493[i_7_] * 8, i_7_ + 4, i_1_, class184, (byte) 93, Class120_Sub14_Sub21.anIntArray3629[i_7_] * 8, i_2_, 4);
								} else {
									((Class180_Sub6) class180).method2354(-70);
								}
							} else if (i_6_ != 7) {
								if (i_6_ != 8) {
									if (i_6_ != 11) {
										if (!(class180 instanceof Class180_Sub6)) {
											Buffer.method1094(i_4_, 0, i_7_, i_1_, class184, (byte) 93, 0, i_2_, i_6_);
										} else {
											((Class180_Sub6) class180).method2354(-71);
										}
									} else if (class180 instanceof Class180_Sub6) {
										((Class180_Sub6) class180).method2354(-58);
									} else {
										Buffer.method1094(i_4_, 0, i_7_ + 4, i_1_, class184, (byte) 93, 0, i_2_, 10);
									}
								} else {
									if (class180 instanceof Class180_Sub6) {
										((Class180_Sub6) class180).method2354(52);
									} else {
										Buffer.method1094(i_4_, Class55.anIntArray493[i_7_] * 8, 4 + i_7_, i_1_, class184, (byte) 93, 8 * Class120_Sub14_Sub21.anIntArray3629[i_7_], i_2_, 4);
									}
									if (class180_8_ instanceof Class180_Sub6) {
										((Class180_Sub6) class180_8_).method2354(-122);
									} else {
										Buffer.method1094(i_4_, Class55.anIntArray493[i_7_] * 8, 4 + (0x3 & i_7_ + 2), i_1_, class184, (byte) 93, Class120_Sub14_Sub21.anIntArray3629[i_7_] * 8, i_2_, 4);
									}
								}
							} else if (class180 instanceof Class180_Sub6) {
								((Class180_Sub6) class180).method2354(111);
							} else {
								Buffer.method1094(i_4_, 0, (0x3 & 2 + i_7_) + 4, i_1_, class184, (byte) 93, 0, i_2_, 4);
							}
						} else if (!(class180 instanceof Class180_Sub6)) {
							Buffer.method1094(i_4_, 8 * Class109.anIntArray1037[i_7_], i_7_, i_1_, class184, (byte) 93, Class147.anIntArray1396[i_7_] * 8, i_2_, 4);
						} else {
							((Class180_Sub6) class180).method2354(-64);
						}
					} else {
						if (class180 instanceof Class180_Sub6) {
							((Class180_Sub6) class180).method2354(-125);
						} else {
							Buffer.method1094(i_4_, 0, i_7_ + 4, i_1_, class184, (byte) 93, 0, i_2_, i_6_);
						}
						if (!(class180_8_ instanceof Class180_Sub6)) {
							Buffer.method1094(i_4_, 0, 0x3 & i_7_ - -1, i_1_, class184, (byte) 93, 0, i_2_, i_6_);
						} else {
							((Class180_Sub6) class180_8_).method2354(50);
						}
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("jh.A(").append(i).append(',').append(i_0_).append(',').append(i_1_).append(',').append(i_2_).append(',').append(class25 != null ? "{...}" : "null").append(',').append(i_3_).append(',').append(i_4_).append(')')
					.toString());
		}
	}

	static final void method744(final boolean bool, final Class120_Sub10 class120_sub10) {
		try {
			Class21.method194(class120_sub10, !bool, 200000);
			if (!bool) {
				method744(false, null);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("jh.B(").append(bool).append(',').append(class120_sub10 != null ? "{...}" : "null").append(')').toString());
		}
	}

	public static void method745(final boolean bool) {
		try {
			if (!bool) {
				anInt832 = -38;
			}
			aClass105_829 = null;
			aClass50_834 = null;
			anIntArray833 = null;
			aClass177_831 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("jh.C(").append(bool).append(')').toString());
		}
	}

	public Class88() {
		/* empty */
	}
}
