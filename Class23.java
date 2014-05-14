/* Class23 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Font;

final class Class23 {
	static int anInt134;
	static Font aFont135;
	static int anInt136;
	static int anInt137 = 0;
	static int packetType;

	static {
		anInt136 = 0;
		anInt134 = 0;
		packetType = 0;
	}

	static final void method200(final int i, final JagexInterface jagexInterface, final int i_0_, final int i_1_, final int i_2_, final int i_3_, final AbstractSprite class120_sub14_sub19) {
		try {
			if (class120_sub14_sub19 != null) {
				final int i_4_ = (int) OutputStream_Sub1.aFloat28 + Class164.anInt1590 & 0x7ff;
				final int i_5_ = 10 + Math.max(jagexInterface.anInt1948 / i_2_, jagexInterface.anInt2059 / 2);
				final int i_6_ = i_3_ * i_3_ + i_1_ * i_1_;
				if (i_6_ <= i_5_ * i_5_) {
					int i_7_ = Rasterizer.sineTable[i_4_];
					i_7_ = 256 * i_7_ / (Class154.anInt1442 + 256);
					int i_8_ = Rasterizer.cosineTable[i_4_];
					i_8_ = 256 * i_8_ / (256 + Class154.anInt1442);
					final int i_9_ = i_1_ * i_8_ + i_3_ * i_7_ >> 16;
					final int i_10_ = i_8_ * i_3_ + -(i_1_ * i_7_) >> 16;
					if (!HDToolkit.glEnabled) {
						((LDSprite) class120_sub14_sub19).method1610(-(class120_sub14_sub19.trimWidth / 2) + i + jagexInterface.anInt1948 / 2 - -i_9_, -(class120_sub14_sub19.trimHeight / 2) + -i_10_ + jagexInterface.anInt2059 / 2 + i_0_, jagexInterface.anIntArray2079, jagexInterface.anIntArray1949);
					} else {
						((HDSprite) class120_sub14_sub19).method1598(-(class120_sub14_sub19.trimWidth / 2) + jagexInterface.anInt1948 / 2 + i + i_9_, -(class120_sub14_sub19.trimHeight / 2) + -i_10_ + jagexInterface.anInt2059 / 2 + i_0_,
								(HDSprite) jagexInterface.method2492(false, (byte) -18));
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception,
					new StringBuilder("ce.B(").append(i).append(',').append(jagexInterface != null ? "{...}" : "null").append(',').append(i_0_).append(',').append(i_1_).append(',').append(i_2_).append(',').append(i_3_).append(',').append(class120_sub14_sub19 != null ? "{...}" : "null").append(')')
							.toString());
		}
	}

	static final void method201(final boolean bool, final int i, final JagexInterface jagexInterface, final int i_11_, final int i_12_) {
		try {
			if (i_12_ != -4) {
				anInt136 = 25;
			}
			final int i_13_ = jagexInterface.anInt2059;
			if (jagexInterface.aByte2092 == 0) {
				jagexInterface.anInt2059 = jagexInterface.anInt2060;
			} else if (jagexInterface.aByte2092 != 1) {
				if (jagexInterface.aByte2092 != 2) {
					if (jagexInterface.aByte2092 == 3) {
						if (jagexInterface.type != 2) {
							if (jagexInterface.type == 7) {
								jagexInterface.anInt2059 = jagexInterface.anInt2060 * 12 - -((-1 + jagexInterface.anInt2060) * jagexInterface.anInt2077);
							}
						} else {
							jagexInterface.anInt2059 = jagexInterface.anInt2077 * (jagexInterface.anInt2060 + -1) + 32 * jagexInterface.anInt2060;
						}
					}
				} else {
					jagexInterface.anInt2059 = i_11_ * jagexInterface.anInt2060 >> 14;
				}
			} else {
				jagexInterface.anInt2059 = -jagexInterface.anInt2060 + i_11_;
			}
			final int i_14_ = jagexInterface.anInt1948;
			if (jagexInterface.aByte1963 == 0) {
				jagexInterface.anInt1948 = jagexInterface.anInt2014;
			} else if (jagexInterface.aByte1963 == 1) {
				jagexInterface.anInt1948 = i + -jagexInterface.anInt2014;
			} else if (jagexInterface.aByte1963 != 2) {
				if (jagexInterface.aByte1963 == 3) {
					if (jagexInterface.type != 2) {
						if (jagexInterface.type == 7) {
							jagexInterface.anInt1948 = 115 * jagexInterface.anInt2014 - -(jagexInterface.anInt2044 * (-1 + jagexInterface.anInt2014));
						}
					} else {
						jagexInterface.anInt1948 = (-1 + jagexInterface.anInt2014) * jagexInterface.anInt2044 + 32 * jagexInterface.anInt2014;
					}
				}
			} else {
				jagexInterface.anInt1948 = i * jagexInterface.anInt2014 >> 14;
			}
			if (jagexInterface.aByte1963 == 4) {
				jagexInterface.anInt1948 = jagexInterface.anInt1982 * jagexInterface.anInt2059 / jagexInterface.anInt2085;
			}
			if (jagexInterface.aByte2092 == 4) {
				jagexInterface.anInt2059 = jagexInterface.anInt2085 * jagexInterface.anInt1948 / jagexInterface.anInt1982;
			}
			if (Class120_Sub30_Sub1.aBoolean3673 && (client.getClickMask(jagexInterface).anInt2662 != 0 || jagexInterface.type == 0)) {
				if (jagexInterface.anInt2059 >= 5 || jagexInterface.anInt1948 >= 5) {
					if (jagexInterface.anInt2059 <= 0) {
						jagexInterface.anInt2059 = 5;
					}
					if (jagexInterface.anInt1948 <= 0) {
						jagexInterface.anInt1948 = 5;
					}
				} else {
					jagexInterface.anInt2059 = 5;
					jagexInterface.anInt1948 = 5;
				}
			}
			if (jagexInterface.clientCode == 1337) {
				InputStream_Sub1.aClass189_26 = jagexInterface;
			}
			if (bool && jagexInterface.anObjectArray2089 != null && (i_14_ != jagexInterface.anInt1948 || i_13_ != jagexInterface.anInt2059)) {
				final Class120_Sub10 class120_sub10 = new Class120_Sub10();
				class120_sub10.anObjectArray2537 = jagexInterface.anObjectArray2089;
				class120_sub10.aClass189_2534 = jagexInterface;
				Class88.aClass105_829.addLast(class120_sub10);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ce.A(").append(bool).append(',').append(i).append(',').append(jagexInterface != null ? "{...}" : "null").append(',').append(i_11_).append(',').append(i_12_).append(')').toString());
		}
	}

	static final Class36 method202(final int i, final int i_15_, final int i_16_) {
		final GroundTile class120_sub18 = Class120_Sub1.groundTiles[i][i_15_][i_16_];
		if (class120_sub18 == null || class120_sub18.aClass36_2650 == null) {
			return null;
		}
		return class120_sub18.aClass36_2650;
	}

	public static void method203(final int i) {
		try {
			aFont135 = null;
			if (i != 5) {
				method200(112, null, -82, 29, 46, -44, null);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ce.E(").append(i).append(')').toString());
		}
	}

	static final void method204(final int i, final Npc class180_sub5_sub2, final byte i_17_, final int i_18_) {
		try {
			if (i_17_ != -118) {
				anInt136 = 103;
			}
			if (i == class180_sub5_sub2.anInt3006 && i != -1) {
				final Class40 class40 = Class120_Sub30_Sub2.method1763(i, 126);
				final int i_19_ = class40.anInt337;
				if (i_19_ == 1) {
					class180_sub5_sub2.anInt2964 = 0;
					class180_sub5_sub2.anInt2993 = i_18_;
					class180_sub5_sub2.anInt3013 = 1;
					class180_sub5_sub2.anInt2999 = 0;
					class180_sub5_sub2.anInt3044 = 0;
					Class120_Sub12_Sub23.method1323(class40, class180_sub5_sub2.z, class180_sub5_sub2.x, class180_sub5_sub2.anInt2964, false, false);
				}
				if (i_19_ == 2) {
					class180_sub5_sub2.anInt2999 = 0;
				}
			} else if (i == -1 || (class180_sub5_sub2.anInt3006 ^ 0xffffffff) == 0 || Class120_Sub30_Sub2.method1763(i, 122).anInt348 >= Class120_Sub30_Sub2.method1763(class180_sub5_sub2.anInt3006, 127).anInt348) {
				class180_sub5_sub2.anInt3013 = 1;
				class180_sub5_sub2.anInt3031 = class180_sub5_sub2.anInt2960;
				class180_sub5_sub2.anInt2999 = 0;
				class180_sub5_sub2.anInt2964 = 0;
				class180_sub5_sub2.anInt2993 = i_18_;
				class180_sub5_sub2.anInt3006 = i;
				class180_sub5_sub2.anInt3044 = 0;
				if (class180_sub5_sub2.anInt3006 != -1) {
					Class120_Sub12_Sub23.method1323(Class120_Sub30_Sub2.method1763(class180_sub5_sub2.anInt3006, 124), class180_sub5_sub2.z, class180_sub5_sub2.x, class180_sub5_sub2.anInt2964, false, false);
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ce.D(").append(i).append(',').append(class180_sub5_sub2 != null ? "{...}" : "null").append(',').append(i_17_).append(',').append(i_18_).append(')').toString());
		}
	}
}
