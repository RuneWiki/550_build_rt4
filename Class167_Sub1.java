/* Class167_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Date;

final class Class167_Sub1 extends Class167 {
	private static int[] anIntArray2832 = new int[3];
	static Class98 aClass98_2833;
	String aString2834;
	static int[] anIntArray2835;
	String aString2836;
	static String aString2837 = "Started 3d Library";
	int anInt2838;

	public static void method2192(final int i) {
		try {
			anIntArray2832 = null;
			aString2837 = null;
			aClass98_2833 = null;
			anIntArray2835 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("gb.L(").append(i).append(')').toString());
		}
	}

	static final boolean method2193(final int i) {
		boolean bool;
		try {
			if (Class120_Sub12_Sub25.anInt3312 != 0) {
				return true;
			}
			if (i < 17) {
				anIntArray2835 = null;
			}
			bool = Class30.aClass120_Sub30_Sub2_234.method1766((byte) 70);
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("gb.K(").append(i).append(')').toString());
		}
		return bool;
	}

	static final void method2194(final int i, final int i_0_, Class120_Sub14_Sub12 class120_sub14_sub12) {
		try {
			Buffer.anInt2475 = 0;
			int i_1_ = 0;
			int i_2_ = -1;
			int i_3_ = 0;
			int[] is = class120_sub14_sub12.anIntArray3550;
			if (i_0_ == 1006199388) {
				int[] is_4_ = class120_sub14_sub12.anIntArray3548;
				int i_5_ = -1;
				try {
					int i_6_ = 0;
					while_218_: for (;;) {
						if (++i_6_ > i) {
							throw new RuntimeException("slow");
						}
						i_5_ = is[++i_2_];
						if (i_5_ < 100) {
							if (i_5_ == 0) {
								ProducingGraphicsBuffer.anIntArray2801[i_1_++] = is_4_[i_2_];
								continue;
							}
							if (i_5_ == 1) {
								final int i_7_ = is_4_[i_2_];
								ProducingGraphicsBuffer.anIntArray2801[i_1_++] = Class2.permanentVariable[i_7_];
								continue;
							}
							if (i_5_ == 2) {
								final int i_8_ = is_4_[i_2_];
								Class140.method1997(false, i_8_, ProducingGraphicsBuffer.anIntArray2801[--i_1_]);
								continue;
							}
							if (i_5_ == 3) {
								Class33.aStringArray277[i_3_++] = class120_sub14_sub12.aStringArray3551[i_2_];
								continue;
							}
							if (i_5_ == 6) {
								i_2_ += is_4_[i_2_];
								continue;
							}
							if (i_5_ == 7) {
								i_1_ -= 2;
								if (ProducingGraphicsBuffer.anIntArray2801[i_1_] != ProducingGraphicsBuffer.anIntArray2801[1 + i_1_]) {
									i_2_ += is_4_[i_2_];
								}
								continue;
							}
							if (i_5_ == 8) {
								i_1_ -= 2;
								if (ProducingGraphicsBuffer.anIntArray2801[i_1_] == ProducingGraphicsBuffer.anIntArray2801[1 + i_1_]) {
									i_2_ += is_4_[i_2_];
								}
								continue;
							}
							if (i_5_ == 9) {
								i_1_ -= 2;
								if (ProducingGraphicsBuffer.anIntArray2801[i_1_] < ProducingGraphicsBuffer.anIntArray2801[1 + i_1_]) {
									i_2_ += is_4_[i_2_];
								}
								continue;
							}
							if (i_5_ == 10) {
								i_1_ -= 2;
								if (ProducingGraphicsBuffer.anIntArray2801[1 + i_1_] < ProducingGraphicsBuffer.anIntArray2801[i_1_]) {
									i_2_ += is_4_[i_2_];
								}
								continue;
							}
							if (i_5_ == 21) {
								if (Buffer.anInt2475 != 0) {
									final Class176 class176 = Class179.aClass176Array1773[--Buffer.anInt2475];
									Class79_Sub1.aStringArray2243 = class176.aStringArray1762;
									class120_sub14_sub12 = class176.aClass120_Sub14_Sub12_1761;
									i_2_ = class176.anInt1763;
									is_4_ = class120_sub14_sub12.anIntArray3548;
									Class100.anIntArray956 = class176.anIntArray1765;
									is = class120_sub14_sub12.anIntArray3550;
								} else {
									return;
								}
								continue;
							}
							if (i_5_ == 25) {
								final int i_9_ = is_4_[i_2_];
								ProducingGraphicsBuffer.anIntArray2801[i_1_++] = Class173.method2226((byte) -103, i_9_);
								continue;
							}
							if (i_5_ == 27) {
								final int i_10_ = is_4_[i_2_];
								Class101.method836(i_10_, 0, ProducingGraphicsBuffer.anIntArray2801[--i_1_]);
								continue;
							}
							if (i_5_ == 31) {
								i_1_ -= 2;
								if (ProducingGraphicsBuffer.anIntArray2801[i_1_] <= ProducingGraphicsBuffer.anIntArray2801[1 + i_1_]) {
									i_2_ += is_4_[i_2_];
								}
								continue;
							}
							if (i_5_ == 32) {
								i_1_ -= 2;
								if (ProducingGraphicsBuffer.anIntArray2801[1 + i_1_] <= ProducingGraphicsBuffer.anIntArray2801[i_1_]) {
									i_2_ += is_4_[i_2_];
								}
								continue;
							}
							if (i_5_ == 33) {
								ProducingGraphicsBuffer.anIntArray2801[i_1_++] = Class100.anIntArray956[is_4_[i_2_]];
								continue;
							}
							if (i_5_ == 34) {
								Class100.anIntArray956[is_4_[i_2_]] = ProducingGraphicsBuffer.anIntArray2801[--i_1_];
								continue;
							}
							if (i_5_ == 35) {
								Class33.aStringArray277[i_3_++] = Class79_Sub1.aStringArray2243[is_4_[i_2_]];
								continue;
							}
							if (i_5_ == 36) {
								Class79_Sub1.aStringArray2243[is_4_[i_2_]] = Class33.aStringArray277[--i_3_];
								continue;
							}
							if (i_5_ == 37) {
								final int i_11_ = is_4_[i_2_];
								i_3_ -= i_11_;
								final String string = Class120_Sub12_Sub21_Sub1.method1317(false, Class33.aStringArray277, i_3_, i_11_);
								Class33.aStringArray277[i_3_++] = string;
								continue;
							}
							if (i_5_ == 38) {
								i_1_--;
								continue;
							}
							if (i_5_ == 39) {
								i_3_--;
								continue;
							}
							if (i_5_ == 40) {
								final int i_12_ = is_4_[i_2_];
								final Class120_Sub14_Sub12 class120_sub14_sub12_13_ = Class28.method246(false, i_12_);
								final int[] is_14_ = new int[class120_sub14_sub12_13_.anInt3557];
								final String[] strings = new String[class120_sub14_sub12_13_.anInt3555];
								for (int i_15_ = 0; class120_sub14_sub12_13_.anInt3553 > i_15_; i_15_++) {
									is_14_[i_15_] = ProducingGraphicsBuffer.anIntArray2801[i_15_ + -class120_sub14_sub12_13_.anInt3553 + i_1_];
								}
								for (int i_16_ = 0; i_16_ < class120_sub14_sub12_13_.anInt3547; i_16_++) {
									strings[i_16_] = Class33.aStringArray277[i_3_ + -class120_sub14_sub12_13_.anInt3547 - -i_16_];
								}
								i_1_ -= class120_sub14_sub12_13_.anInt3553;
								i_3_ -= class120_sub14_sub12_13_.anInt3547;
								final Class176 class176 = new Class176();
								class176.anIntArray1765 = Class100.anIntArray956;
								class176.aStringArray1762 = Class79_Sub1.aStringArray2243;
								class176.anInt1763 = i_2_;
								class176.aClass120_Sub14_Sub12_1761 = class120_sub14_sub12;
								if (Buffer.anInt2475 >= Class179.aClass176Array1773.length) {
									throw new RuntimeException();
								}
								Class179.aClass176Array1773[Buffer.anInt2475++] = class176;
								Class79_Sub1.aStringArray2243 = strings;
								class120_sub14_sub12 = class120_sub14_sub12_13_;
								i_2_ = -1;
								is = class120_sub14_sub12.anIntArray3550;
								Class100.anIntArray956 = is_14_;
								is_4_ = class120_sub14_sub12.anIntArray3548;
								continue;
							}
							if (i_5_ == 42) {
								ProducingGraphicsBuffer.anIntArray2801[i_1_++] = Class120_Sub12_Sub25.anIntArray3320[is_4_[i_2_]];
								continue;
							}
							if (i_5_ == 43) {
								final int i_17_ = is_4_[i_2_];
								Class120_Sub12_Sub25.anIntArray3320[i_17_] = ProducingGraphicsBuffer.anIntArray2801[--i_1_];
								CursorType.method1914(-9626, i_17_);
								continue;
							}
							if (i_5_ == 44) {
								final int i_18_ = is_4_[i_2_] & 0xffff;
								final int i_19_ = is_4_[i_2_] >> 16;
								final int i_20_ = ProducingGraphicsBuffer.anIntArray2801[--i_1_];
								if (i_20_ < 0 || i_20_ > 5000) {
									throw new RuntimeException();
								}
								int i_21_ = -1;
								if (i_18_ == 105) {
									i_21_ = 0;
								}
								Class69_Sub3_Sub1.anIntArray3082[i_19_] = i_20_;
								for (int i_22_ = 0; i_22_ < i_20_; i_22_++) {
									Class65.anIntArrayArray594[i_19_][i_22_] = i_21_;
								}
								continue;
							}
							if (i_5_ == 45) {
								final int i_23_ = is_4_[i_2_];
								final int i_24_ = ProducingGraphicsBuffer.anIntArray2801[--i_1_];
								if (i_24_ < 0 || i_24_ >= Class69_Sub3_Sub1.anIntArray3082[i_23_]) {
									throw new RuntimeException();
								}
								ProducingGraphicsBuffer.anIntArray2801[i_1_++] = Class65.anIntArrayArray594[i_23_][i_24_];
								continue;
							}
							if (i_5_ == 46) {
								final int i_25_ = is_4_[i_2_];
								i_1_ -= 2;
								final int i_26_ = ProducingGraphicsBuffer.anIntArray2801[i_1_];
								if (i_26_ < 0 || i_26_ >= Class69_Sub3_Sub1.anIntArray3082[i_25_]) {
									throw new RuntimeException();
								}
								Class65.anIntArrayArray594[i_25_][i_26_] = ProducingGraphicsBuffer.anIntArray2801[1 + i_1_];
								continue;
							}
							if (i_5_ == 47) {
								String string = Class120_Sub2.aStringArray2420[is_4_[i_2_]];
								if (string == null) {
									string = "null";
								}
								Class33.aStringArray277[i_3_++] = string;
								continue;
							}
							if (i_5_ == 48) {
								final int i_27_ = is_4_[i_2_];
								Class120_Sub2.aStringArray2420[i_27_] = Class33.aStringArray277[--i_3_];
								NodeSub.method1411(i_27_, false);
								continue;
							}
							if (i_5_ == 51) {
								final Hashtable hashtable = class120_sub14_sub12.aClass75Array3552[is_4_[i_2_]];
								final IntegerNode class120_sub32 = (IntegerNode) hashtable.get(ProducingGraphicsBuffer.anIntArray2801[--i_1_]);
								if (class120_sub32 != null) {
									i_2_ += class120_sub32.value;
								}
								continue;
							}
						}
						boolean bool;
						if (is_4_[i_2_] != 1) {
							bool = false;
						} else {
							bool = true;
						}
						if (i_5_ >= 300) {
							if (i_5_ >= 500) {
								if (i_5_ >= 1000 && i_5_ < 1100 || i_5_ >= 2000 && i_5_ < 2100) {
									JagexInterface jagexInterface;
									if (i_5_ < 2000) {
										jagexInterface = bool ? Class120_Sub14_Sub11.aClass189_3540 : Class93.aClass189_869;
									} else {
										jagexInterface = Class74.getJagexInterface(ProducingGraphicsBuffer.anIntArray2801[--i_1_]);
										i_5_ -= 1000;
									}
									if (i_5_ == 1000) {
										i_1_ -= 4;
										jagexInterface.anInt2015 = ProducingGraphicsBuffer.anIntArray2801[i_1_];
										jagexInterface.anInt2061 = ProducingGraphicsBuffer.anIntArray2801[1 + i_1_];
										int i_28_ = ProducingGraphicsBuffer.anIntArray2801[i_1_ + 2];
										if (i_28_ >= 0) {
											if (i_28_ > 5) {
												i_28_ = 5;
											}
										} else {
											i_28_ = 0;
										}
										int i_29_ = ProducingGraphicsBuffer.anIntArray2801[i_1_ - -3];
										jagexInterface.aByte2051 = (byte) i_28_;
										if (i_29_ < 0) {
											i_29_ = 0;
										} else if (i_29_ > 5) {
											i_29_ = 5;
										}
										jagexInterface.aByte2017 = (byte) i_29_;
										InterfaceClickMask.redrawInterface(jagexInterface);
										Class120_Sub12_Sub34.method1379(jagexInterface, (byte) -102);
										if ((jagexInterface.anInt2083 ^ 0xffffffff) == 0) {
											Class179.method2261(jagexInterface.bitPacked, 11);
										}
									} else if (i_5_ == 1001) {
										i_1_ -= 4;
										jagexInterface.anInt2014 = ProducingGraphicsBuffer.anIntArray2801[i_1_];
										jagexInterface.anInt2060 = ProducingGraphicsBuffer.anIntArray2801[i_1_ + 1];
										jagexInterface.anInt2069 = 0;
										jagexInterface.anInt2007 = 0;
										int i_30_ = ProducingGraphicsBuffer.anIntArray2801[i_1_ + 3];
										if (i_30_ >= 0) {
											if (i_30_ > 4) {
												i_30_ = 4;
											}
										} else {
											i_30_ = 0;
										}
										int i_31_ = ProducingGraphicsBuffer.anIntArray2801[2 + i_1_];
										if (i_31_ >= 0) {
											if (i_31_ > 4) {
												i_31_ = 4;
											}
										} else {
											i_31_ = 0;
										}
										jagexInterface.aByte2092 = (byte) i_30_;
										jagexInterface.aByte1963 = (byte) i_31_;
										InterfaceClickMask.redrawInterface(jagexInterface);
										Class120_Sub12_Sub34.method1379(jagexInterface, (byte) 99);
										if (jagexInterface.type == 0) {
											ProducingGraphicsBuffer.method1854(false, false, jagexInterface);
										}
									} else if (i_5_ == 1003) {
										final boolean bool_32_ = ProducingGraphicsBuffer.anIntArray2801[--i_1_] == 1;
										if (!bool_32_ != !jagexInterface.aBoolean2045) {
											jagexInterface.aBoolean2045 = bool_32_;
											InterfaceClickMask.redrawInterface(jagexInterface);
										}
										if (jagexInterface.anInt2083 == -1) {
											Class120_Sub12_Sub32.method1373(jagexInterface.bitPacked, 881);
										}
									} else if (i_5_ == 1004) {
										i_1_ -= 2;
										jagexInterface.anInt1982 = ProducingGraphicsBuffer.anIntArray2801[i_1_];
										jagexInterface.anInt2085 = ProducingGraphicsBuffer.anIntArray2801[1 + i_1_];
										InterfaceClickMask.redrawInterface(jagexInterface);
										Class120_Sub12_Sub34.method1379(jagexInterface, (byte) 111);
										if (jagexInterface.type == 0) {
											ProducingGraphicsBuffer.method1854(false, false, jagexInterface);
										}
									} else {
										if (i_5_ != 1005) {
											break;
										}
										jagexInterface.aBoolean1960 = ProducingGraphicsBuffer.anIntArray2801[--i_1_] == 1;
									}
								} else if (i_5_ >= 1100 && i_5_ < 1200 || i_5_ >= 2100 && i_5_ < 2200) {
									JagexInterface jagexInterface;
									if (i_5_ >= 2000) {
										jagexInterface = Class74.getJagexInterface(ProducingGraphicsBuffer.anIntArray2801[--i_1_]);
										i_5_ -= 1000;
									} else {
										jagexInterface = bool ? Class120_Sub14_Sub11.aClass189_3540 : Class93.aClass189_869;
									}
									if (i_5_ == 1100) {
										i_1_ -= 2;
										jagexInterface.anInt2023 = ProducingGraphicsBuffer.anIntArray2801[i_1_];
										if (-jagexInterface.anInt1948 + jagexInterface.anInt1930 < jagexInterface.anInt2023) {
											jagexInterface.anInt2023 = jagexInterface.anInt1930 - jagexInterface.anInt1948;
										}
										if (jagexInterface.anInt2023 < 0) {
											jagexInterface.anInt2023 = 0;
										}
										jagexInterface.anInt2021 = ProducingGraphicsBuffer.anIntArray2801[1 + i_1_];
										if (jagexInterface.anInt2021 > -jagexInterface.anInt2059 + jagexInterface.anInt1937) {
											jagexInterface.anInt2021 = jagexInterface.anInt1937 + -jagexInterface.anInt2059;
										}
										if (jagexInterface.anInt2021 < 0) {
											jagexInterface.anInt2021 = 0;
										}
										InterfaceClickMask.redrawInterface(jagexInterface);
										if ((jagexInterface.anInt2083 ^ 0xffffffff) == 0) {
											Class7.method108(jagexInterface.bitPacked, 12);
										}
									} else if (i_5_ == 1101) {
										jagexInterface.anInt2025 = ProducingGraphicsBuffer.anIntArray2801[--i_1_];
										InterfaceClickMask.redrawInterface(jagexInterface);
										if ((jagexInterface.anInt2083 ^ 0xffffffff) == 0) {
											Class120_Sub29.method1730(true, jagexInterface.bitPacked);
										}
									} else if (i_5_ == 1102) {
										jagexInterface.aBoolean2019 = ProducingGraphicsBuffer.anIntArray2801[--i_1_] == 1;
										InterfaceClickMask.redrawInterface(jagexInterface);
									} else if (i_5_ == 1103) {
										jagexInterface.anInt1974 = ProducingGraphicsBuffer.anIntArray2801[--i_1_];
										InterfaceClickMask.redrawInterface(jagexInterface);
									} else if (i_5_ == 1104) {
										jagexInterface.anInt1967 = ProducingGraphicsBuffer.anIntArray2801[--i_1_];
										InterfaceClickMask.redrawInterface(jagexInterface);
									} else if (i_5_ == 1105) {
										jagexInterface.anInt2055 = ProducingGraphicsBuffer.anIntArray2801[--i_1_];
										InterfaceClickMask.redrawInterface(jagexInterface);
									} else if (i_5_ == 1106) {
										jagexInterface.anInt2070 = ProducingGraphicsBuffer.anIntArray2801[--i_1_];
										InterfaceClickMask.redrawInterface(jagexInterface);
									} else if (i_5_ == 1107) {
										jagexInterface.aBoolean2001 = ProducingGraphicsBuffer.anIntArray2801[--i_1_] == 1;
										InterfaceClickMask.redrawInterface(jagexInterface);
									} else if (i_5_ == 1108) {
										jagexInterface.anInt2031 = 1;
										jagexInterface.anInt1961 = ProducingGraphicsBuffer.anIntArray2801[--i_1_];
										InterfaceClickMask.redrawInterface(jagexInterface);
										if ((jagexInterface.anInt2083 ^ 0xffffffff) == 0) {
											Class33.method276(i_0_ + -1006199388, jagexInterface.bitPacked);
										}
									} else if (i_5_ == 1109) {
										i_1_ -= 6;
										jagexInterface.anInt2076 = ProducingGraphicsBuffer.anIntArray2801[i_1_];
										jagexInterface.anInt1977 = ProducingGraphicsBuffer.anIntArray2801[1 + i_1_];
										jagexInterface.anInt2047 = ProducingGraphicsBuffer.anIntArray2801[i_1_ + 2];
										jagexInterface.anInt2091 = ProducingGraphicsBuffer.anIntArray2801[3 + i_1_];
										jagexInterface.anInt1935 = ProducingGraphicsBuffer.anIntArray2801[i_1_ - -4];
										jagexInterface.anInt2005 = ProducingGraphicsBuffer.anIntArray2801[i_1_ - -5];
										InterfaceClickMask.redrawInterface(jagexInterface);
										if ((jagexInterface.anInt2083 ^ 0xffffffff) == 0) {
											Class120_Sub14_Sub11.method1514(i_0_ ^ 0x3bf96254, jagexInterface.bitPacked);
											Class48.method401(jagexInterface.bitPacked, i_0_ ^ 0x3bf96237);
										}
									} else if (i_5_ == 1110) {
										final int i_33_ = ProducingGraphicsBuffer.anIntArray2801[--i_1_];
										if (i_33_ != jagexInterface.anInt1945) {
											jagexInterface.anInt1965 = 0;
											jagexInterface.anInt1945 = i_33_;
											jagexInterface.anInt2098 = 1;
											jagexInterface.anInt1946 = 0;
											InterfaceClickMask.redrawInterface(jagexInterface);
										}
										if ((jagexInterface.anInt2083 ^ 0xffffffff) == 0) {
											GameShell.method47(jagexInterface.bitPacked, false);
										}
									} else if (i_5_ == 1111) {
										jagexInterface.aBoolean2046 = ProducingGraphicsBuffer.anIntArray2801[--i_1_] == 1;
										InterfaceClickMask.redrawInterface(jagexInterface);
									} else if (i_5_ == 1112) {
										final String string = Class33.aStringArray277[--i_3_];
										if (!string.equals(jagexInterface.aString1950)) {
											jagexInterface.aString1950 = string;
											InterfaceClickMask.redrawInterface(jagexInterface);
										}
										if ((jagexInterface.anInt2083 ^ 0xffffffff) == 0) {
											Class187.method2479(jagexInterface.bitPacked, 3);
										}
									} else if (i_5_ == 1113) {
										jagexInterface.anInt2067 = ProducingGraphicsBuffer.anIntArray2801[--i_1_];
										InterfaceClickMask.redrawInterface(jagexInterface);
									} else if (i_5_ == 1114) {
										i_1_ -= 3;
										jagexInterface.anInt2011 = ProducingGraphicsBuffer.anIntArray2801[i_1_];
										jagexInterface.anInt2009 = ProducingGraphicsBuffer.anIntArray2801[1 + i_1_];
										jagexInterface.anInt2057 = ProducingGraphicsBuffer.anIntArray2801[i_1_ + 2];
										InterfaceClickMask.redrawInterface(jagexInterface);
									} else if (i_5_ == 1115) {
										jagexInterface.aBoolean2040 = ProducingGraphicsBuffer.anIntArray2801[--i_1_] == 1;
										InterfaceClickMask.redrawInterface(jagexInterface);
									} else if (i_5_ == 1116) {
										jagexInterface.anInt2090 = ProducingGraphicsBuffer.anIntArray2801[--i_1_];
										InterfaceClickMask.redrawInterface(jagexInterface);
									} else if (i_5_ == 1117) {
										jagexInterface.anInt2026 = ProducingGraphicsBuffer.anIntArray2801[--i_1_];
										InterfaceClickMask.redrawInterface(jagexInterface);
									} else if (i_5_ == 1118) {
										jagexInterface.aBoolean1943 = ProducingGraphicsBuffer.anIntArray2801[--i_1_] == 1;
										InterfaceClickMask.redrawInterface(jagexInterface);
									} else if (i_5_ == 1119) {
										jagexInterface.aBoolean1958 = ProducingGraphicsBuffer.anIntArray2801[--i_1_] == 1;
										InterfaceClickMask.redrawInterface(jagexInterface);
									} else if (i_5_ == 1120) {
										i_1_ -= 2;
										jagexInterface.anInt1930 = ProducingGraphicsBuffer.anIntArray2801[i_1_];
										jagexInterface.anInt1937 = ProducingGraphicsBuffer.anIntArray2801[i_1_ + 1];
										InterfaceClickMask.redrawInterface(jagexInterface);
										if (jagexInterface.type == 0) {
											ProducingGraphicsBuffer.method1854(false, false, jagexInterface);
										}
									} else if (i_5_ == 1121) {
										i_1_ -= 2;
										jagexInterface.aShort2093 = (short) ProducingGraphicsBuffer.anIntArray2801[i_1_];
										jagexInterface.aShort2065 = (short) ProducingGraphicsBuffer.anIntArray2801[1 + i_1_];
										InterfaceClickMask.redrawInterface(jagexInterface);
									} else if (i_5_ == 1122) {
										jagexInterface.aBoolean2018 = ProducingGraphicsBuffer.anIntArray2801[--i_1_] == 1;
										InterfaceClickMask.redrawInterface(jagexInterface);
									} else if (i_5_ == 1123) {
										jagexInterface.anInt2005 = ProducingGraphicsBuffer.anIntArray2801[--i_1_];
										InterfaceClickMask.redrawInterface(jagexInterface);
										if (jagexInterface.anInt2083 == -1) {
											Class120_Sub14_Sub11.method1514(i_0_ ^ 0x3bf96254, jagexInterface.bitPacked);
										}
									} else {
										if (i_5_ != 1124) {
											break;
										}
										final int i_34_ = ProducingGraphicsBuffer.anIntArray2801[--i_1_];
										jagexInterface.aBoolean1989 = i_34_ == 1;
										InterfaceClickMask.redrawInterface(jagexInterface);
									}
								} else if (i_5_ >= 1200 && i_5_ < 1300 || i_5_ >= 2200 && i_5_ < 2300) {
									JagexInterface jagexInterface;
									if (i_5_ < 2000) {
										jagexInterface = bool ? Class120_Sub14_Sub11.aClass189_3540 : Class93.aClass189_869;
									} else {
										i_5_ -= 1000;
										jagexInterface = Class74.getJagexInterface(ProducingGraphicsBuffer.anIntArray2801[--i_1_]);
									}
									InterfaceClickMask.redrawInterface(jagexInterface);
									if (i_5_ == 1200 || i_5_ == 1205 || i_5_ == 1208 || i_5_ == 1209) {
										i_1_ -= 2;
										final int i_35_ = ProducingGraphicsBuffer.anIntArray2801[1 + i_1_];
										final int i_36_ = ProducingGraphicsBuffer.anIntArray2801[i_1_];
										if (jagexInterface.anInt2083 == -1) {
											GameShell.method43(jagexInterface.bitPacked, 9);
											Class120_Sub14_Sub11.method1514(8, jagexInterface.bitPacked);
											Class48.method401(jagexInterface.bitPacked, 118);
										}
										if ((i_36_ ^ 0xffffffff) == 0) {
											jagexInterface.anInt2031 = 1;
											jagexInterface.anInt1961 = -1;
											jagexInterface.anInt2030 = -1;
										} else {
											jagexInterface.anInt2075 = i_35_;
											if (i_5_ == 1208 || i_5_ == 1209) {
												jagexInterface.aBoolean2097 = true;
											} else {
												jagexInterface.aBoolean2097 = false;
											}
											jagexInterface.anInt2030 = i_36_;
											final ObjType objType = ObjType.list(i_36_);
											jagexInterface.anInt1977 = objType.yof2d;
											jagexInterface.anInt2076 = objType.xof2d;
											jagexInterface.anInt2047 = objType.xan2d;
											jagexInterface.anInt2091 = objType.yan2d;
											jagexInterface.anInt2005 = objType.zoom2d;
											jagexInterface.anInt1935 = objType.zan2d;
											if (i_5_ != 1205) {
												jagexInterface.aBoolean1956 = true;
											} else {
												jagexInterface.aBoolean1956 = false;
											}
											if (jagexInterface.anInt2069 > 0) {
												jagexInterface.anInt2005 = 32 * jagexInterface.anInt2005 / jagexInterface.anInt2069;
											} else if (jagexInterface.anInt2014 > 0) {
												jagexInterface.anInt2005 = jagexInterface.anInt2005 * 32 / jagexInterface.anInt2014;
											}
										}
									} else if (i_5_ == 1201) {
										jagexInterface.anInt2031 = 2;
										jagexInterface.anInt1961 = ProducingGraphicsBuffer.anIntArray2801[--i_1_];
										if ((jagexInterface.anInt2083 ^ 0xffffffff) == 0) {
											Class33.method276(0, jagexInterface.bitPacked);
										}
									} else if (i_5_ == 1202) {
										jagexInterface.anInt2031 = 3;
										jagexInterface.anInt1961 = Class100.selfPlayer.appearance.method2043((byte) 99);
										if ((jagexInterface.anInt2083 ^ 0xffffffff) == 0) {
											Class33.method276(0, jagexInterface.bitPacked);
										}
									} else if (i_5_ == 1203) {
										jagexInterface.anInt2031 = 6;
										jagexInterface.anInt1961 = ProducingGraphicsBuffer.anIntArray2801[--i_1_];
										if ((jagexInterface.anInt2083 ^ 0xffffffff) == 0) {
											Class33.method276(0, jagexInterface.bitPacked);
										}
									} else if (i_5_ == 1204) {
										jagexInterface.anInt2031 = 5;
										jagexInterface.anInt1961 = ProducingGraphicsBuffer.anIntArray2801[--i_1_];
										if (jagexInterface.anInt2083 == -1) {
											Class33.method276(0, jagexInterface.bitPacked);
										}
									} else if (i_5_ == 1206) {
										i_1_ -= 4;
										jagexInterface.anInt2088 = ProducingGraphicsBuffer.anIntArray2801[i_1_];
										jagexInterface.anInt2002 = ProducingGraphicsBuffer.anIntArray2801[i_1_ - -1];
										jagexInterface.anInt2094 = ProducingGraphicsBuffer.anIntArray2801[2 + i_1_];
										jagexInterface.anInt1966 = ProducingGraphicsBuffer.anIntArray2801[3 + i_1_];
										InterfaceClickMask.redrawInterface(jagexInterface);
									} else {
										if (i_5_ != 1207) {
											break;
										}
										i_1_ -= 2;
										jagexInterface.anInt2078 = ProducingGraphicsBuffer.anIntArray2801[i_1_];
										jagexInterface.anInt2004 = ProducingGraphicsBuffer.anIntArray2801[i_1_ + 1];
										InterfaceClickMask.redrawInterface(jagexInterface);
									}
								} else if (i_5_ >= 1300 && i_5_ < 1400 || i_5_ >= 2300 && i_5_ < 2400) {
									JagexInterface jagexInterface;
									if (i_5_ < 2000) {
										jagexInterface = bool ? Class120_Sub14_Sub11.aClass189_3540 : Class93.aClass189_869;
									} else {
										i_5_ -= 1000;
										jagexInterface = Class74.getJagexInterface(ProducingGraphicsBuffer.anIntArray2801[--i_1_]);
									}
									if (i_5_ == 1300) {
										final int i_37_ = -1 + ProducingGraphicsBuffer.anIntArray2801[--i_1_];
										if (i_37_ < 0 || i_37_ > 9) {
											i_3_--;
										} else {
											jagexInterface.setAction(Class33.aStringArray277[--i_3_], i_37_);
										}
									} else if (i_5_ == 1301) {
										i_1_ -= 2;
										final int i_38_ = ProducingGraphicsBuffer.anIntArray2801[i_1_ - -1];
										final int i_39_ = ProducingGraphicsBuffer.anIntArray2801[i_1_];
										jagexInterface.aClass189_1931 = Class120_Sub13.method1404(i_39_, i_38_);
									} else if (i_5_ == 1302) {
										jagexInterface.aBoolean1939 = ProducingGraphicsBuffer.anIntArray2801[--i_1_] == 1;
									} else if (i_5_ == 1303) {
										jagexInterface.anInt1962 = ProducingGraphicsBuffer.anIntArray2801[--i_1_];
									} else if (i_5_ == 1304) {
										jagexInterface.anInt2066 = ProducingGraphicsBuffer.anIntArray2801[--i_1_];
									} else if (i_5_ == 1305) {
										jagexInterface.aString1964 = Class33.aStringArray277[--i_3_];
									} else if (i_5_ == 1306) {
										jagexInterface.aString2095 = Class33.aStringArray277[--i_3_];
									} else if (i_5_ == 1307) {
										jagexInterface.aStringArray2052 = null;
									} else if (i_5_ == 1308) {
										jagexInterface.cursorId = ProducingGraphicsBuffer.anIntArray2801[--i_1_];
										jagexInterface.anInt2020 = ProducingGraphicsBuffer.anIntArray2801[--i_1_];
									} else if (i_5_ == 1309) {
										final int i_40_ = ProducingGraphicsBuffer.anIntArray2801[--i_1_];
										final int i_41_ = ProducingGraphicsBuffer.anIntArray2801[--i_1_];
										if (i_41_ >= 1 && i_41_ <= 10) {
											jagexInterface.method2488(-1 + i_41_, i_40_, i_0_ ^ ~0x3bf96224);
										}
									} else {
										if (i_5_ != 1310) {
											break;
										}
										jagexInterface.aString1994 = Class33.aStringArray277[--i_3_];
									}
								} else if (i_5_ >= 1400 && i_5_ < 1500 || i_5_ >= 2400 && i_5_ < 2500) {
									JagexInterface jagexInterface;
									if (i_5_ < 2000) {
										jagexInterface = bool ? Class120_Sub14_Sub11.aClass189_3540 : Class93.aClass189_869;
									} else {
										jagexInterface = Class74.getJagexInterface(ProducingGraphicsBuffer.anIntArray2801[--i_1_]);
										i_5_ -= 1000;
									}
									String string = Class33.aStringArray277[--i_3_];
									int[] is_42_ = null;
									if (string.length() > 0 && string.charAt(-1 + string.length()) == 'Y') {
										int i_43_ = ProducingGraphicsBuffer.anIntArray2801[--i_1_];
										if (i_43_ > 0) {
											is_42_ = new int[i_43_];
											while ((i_43_-- ^ 0xffffffff) < -1) {
												is_42_[i_43_] = ProducingGraphicsBuffer.anIntArray2801[--i_1_];
											}
										}
										string = string.substring(0, -1 + string.length());
									}
									Object[] objects = new Object[string.length() - -1];
									for (int i_44_ = objects.length - 1; i_44_ >= 1; i_44_--) {
										if (string.charAt(-1 + i_44_) != 's') {
											objects[i_44_] = new Integer(ProducingGraphicsBuffer.anIntArray2801[--i_1_]);
										} else {
											objects[i_44_] = Class33.aStringArray277[--i_3_];
										}
									}
									final int i_45_ = ProducingGraphicsBuffer.anIntArray2801[--i_1_];
									if (i_45_ != -1) {
										objects[0] = new Integer(i_45_);
									} else {
										objects = null;
									}
									jagexInterface.aBoolean1940 = true;
									if (i_5_ == 1400) {
										jagexInterface.anObjectArray2080 = objects;
									} else if (i_5_ != 1401) {
										if (i_5_ == 1402) {
											jagexInterface.anObjectArray2084 = objects;
										} else if (i_5_ != 1403) {
											if (i_5_ != 1404) {
												if (i_5_ == 1405) {
													jagexInterface.anObjectArray1959 = objects;
												} else if (i_5_ != 1406) {
													if (i_5_ == 1407) {
														jagexInterface.anObjectArray2050 = objects;
														jagexInterface.anIntArray2039 = is_42_;
													} else if (i_5_ == 1408) {
														jagexInterface.anObjectArray1998 = objects;
													} else if (i_5_ == 1409) {
														jagexInterface.anObjectArray2006 = objects;
													} else if (i_5_ != 1410) {
														if (i_5_ != 1411) {
															if (i_5_ == 1412) {
																jagexInterface.anObjectArray1953 = objects;
															} else if (i_5_ != 1414) {
																if (i_5_ != 1415) {
																	if (i_5_ == 1416) {
																		jagexInterface.anObjectArray1980 = objects;
																	} else if (i_5_ == 1417) {
																		jagexInterface.anObjectArray2024 = objects;
																	} else if (i_5_ != 1418) {
																		if (i_5_ != 1419) {
																			if (i_5_ != 1420) {
																				if (i_5_ == 1421) {
																					jagexInterface.anObjectArray2036 = objects;
																				} else if (i_5_ != 1422) {
																					if (i_5_ == 1423) {
																						jagexInterface.anObjectArray2013 = objects;
																					} else if (i_5_ == 1424) {
																						jagexInterface.anObjectArray1932 = objects;
																					} else if (i_5_ != 1425) {
																						if (i_5_ == 1426) {
																							jagexInterface.anObjectArray1942 = objects;
																						} else if (i_5_ != 1427) {
																							if (i_5_ == 1428) {
																								jagexInterface.anObjectArray2062 = objects;
																								jagexInterface.anIntArray2096 = is_42_;
																							} else if (i_5_ == 1429) {
																								jagexInterface.anObjectArray2032 = objects;
																								jagexInterface.anIntArray1991 = is_42_;
																							}
																						} else {
																							jagexInterface.anObjectArray2089 = objects;
																						}
																					} else {
																						jagexInterface.anObjectArray1984 = objects;
																					}
																				} else {
																					jagexInterface.anObjectArray2086 = objects;
																				}
																			} else {
																				jagexInterface.anObjectArray1976 = objects;
																			}
																		} else {
																			jagexInterface.anObjectArray1954 = objects;
																		}
																	} else {
																		jagexInterface.anObjectArray1944 = objects;
																	}
																} else {
																	jagexInterface.anObjectArray2054 = objects;
																	jagexInterface.anIntArray2022 = is_42_;
																}
															} else {
																jagexInterface.anIntArray2063 = is_42_;
																jagexInterface.anObjectArray1929 = objects;
															}
														} else {
															jagexInterface.anObjectArray1993 = objects;
														}
													} else {
														jagexInterface.anObjectArray1947 = objects;
													}
												} else {
													jagexInterface.anObjectArray2000 = objects;
												}
											} else {
												jagexInterface.anObjectArray2074 = objects;
											}
										} else {
											jagexInterface.anObjectArray2058 = objects;
										}
									} else {
										jagexInterface.anObjectArray1951 = objects;
									}
								} else if (i_5_ >= 1600) {
									if (i_5_ < 1700) {
										final JagexInterface jagexInterface = !bool ? Class93.aClass189_869 : Class120_Sub14_Sub11.aClass189_3540;
										if (i_5_ == 1600) {
											ProducingGraphicsBuffer.anIntArray2801[i_1_++] = jagexInterface.anInt2023;
										} else if (i_5_ == 1601) {
											ProducingGraphicsBuffer.anIntArray2801[i_1_++] = jagexInterface.anInt2021;
										} else if (i_5_ == 1602) {
											Class33.aStringArray277[i_3_++] = jagexInterface.aString1950;
										} else if (i_5_ == 1603) {
											ProducingGraphicsBuffer.anIntArray2801[i_1_++] = jagexInterface.anInt1930;
										} else if (i_5_ == 1604) {
											ProducingGraphicsBuffer.anIntArray2801[i_1_++] = jagexInterface.anInt1937;
										} else if (i_5_ == 1605) {
											ProducingGraphicsBuffer.anIntArray2801[i_1_++] = jagexInterface.anInt2005;
										} else if (i_5_ == 1606) {
											ProducingGraphicsBuffer.anIntArray2801[i_1_++] = jagexInterface.anInt2047;
										} else if (i_5_ == 1607) {
											ProducingGraphicsBuffer.anIntArray2801[i_1_++] = jagexInterface.anInt1935;
										} else if (i_5_ == 1608) {
											ProducingGraphicsBuffer.anIntArray2801[i_1_++] = jagexInterface.anInt2091;
										} else if (i_5_ == 1609) {
											ProducingGraphicsBuffer.anIntArray2801[i_1_++] = jagexInterface.anInt1974;
										} else if (i_5_ == 1610) {
											ProducingGraphicsBuffer.anIntArray2801[i_1_++] = jagexInterface.anInt2076;
										} else if (i_5_ == 1611) {
											ProducingGraphicsBuffer.anIntArray2801[i_1_++] = jagexInterface.anInt1977;
										} else {
											if (i_5_ != 1612) {
												break;
											}
											ProducingGraphicsBuffer.anIntArray2801[i_1_++] = jagexInterface.anInt2055;
										}
									} else if (i_5_ < 1800) {
										final JagexInterface jagexInterface = bool ? Class120_Sub14_Sub11.aClass189_3540 : Class93.aClass189_869;
										if (i_5_ == 1700) {
											ProducingGraphicsBuffer.anIntArray2801[i_1_++] = jagexInterface.anInt2030;
										} else if (i_5_ == 1701) {
											if (jagexInterface.anInt2030 == -1) {
												ProducingGraphicsBuffer.anIntArray2801[i_1_++] = 0;
											} else {
												ProducingGraphicsBuffer.anIntArray2801[i_1_++] = jagexInterface.anInt2075;
											}
										} else {
											if (i_5_ != 1702) {
												break;
											}
											ProducingGraphicsBuffer.anIntArray2801[i_1_++] = jagexInterface.anInt2083;
										}
									} else if (i_5_ < 1900) {
										final JagexInterface jagexInterface = !bool ? Class93.aClass189_869 : Class120_Sub14_Sub11.aClass189_3540;
										if (i_5_ == 1800) {
											ProducingGraphicsBuffer.anIntArray2801[i_1_++] = client.getClickMask(jagexInterface).method1685(1105924391);
										} else if (i_5_ == 1801) {
											int i_46_ = ProducingGraphicsBuffer.anIntArray2801[--i_1_];
											i_46_--;
											if (jagexInterface.aStringArray2052 != null && jagexInterface.aStringArray2052.length > i_46_ && jagexInterface.aStringArray2052[i_46_] != null) {
												Class33.aStringArray277[i_3_++] = jagexInterface.aStringArray2052[i_46_];
											} else {
												Class33.aStringArray277[i_3_++] = "";
											}
										} else {
											if (i_5_ != 1802) {
												break;
											}
											if (jagexInterface.aString1964 != null) {
												Class33.aStringArray277[i_3_++] = jagexInterface.aString1964;
											} else {
												Class33.aStringArray277[i_3_++] = "";
											}
										}
									} else if (i_5_ >= 2600) {
										if (i_5_ >= 2700) {
											if (i_5_ >= 2800) {
												if (i_5_ < 2900) {
													final JagexInterface jagexInterface = Class74.getJagexInterface(ProducingGraphicsBuffer.anIntArray2801[--i_1_]);
													if (i_5_ == 2800) {
														ProducingGraphicsBuffer.anIntArray2801[i_1_++] = client.getClickMask(jagexInterface).method1685(1105924391);
													} else if (i_5_ == 2801) {
														int i_47_ = ProducingGraphicsBuffer.anIntArray2801[--i_1_];
														i_47_--;
														if (jagexInterface.aStringArray2052 == null || i_47_ >= jagexInterface.aStringArray2052.length || jagexInterface.aStringArray2052[i_47_] == null) {
															Class33.aStringArray277[i_3_++] = "";
														} else {
															Class33.aStringArray277[i_3_++] = jagexInterface.aStringArray2052[i_47_];
														}
													} else {
														if (i_5_ != 2802) {
															break;
														}
														if (jagexInterface.aString1964 != null) {
															Class33.aStringArray277[i_3_++] = jagexInterface.aString1964;
														} else {
															Class33.aStringArray277[i_3_++] = "";
														}
													}
												} else if (i_5_ >= 3200) {
													if (i_5_ >= 3300) {
														if (i_5_ >= 3400) {
															if (i_5_ < 3500) {
																if (i_5_ == 3400) {
																	i_1_ -= 2;
																	final int i_48_ = ProducingGraphicsBuffer.anIntArray2801[i_1_];
																	final int i_49_ = ProducingGraphicsBuffer.anIntArray2801[i_1_ - -1];
																	final Class120_Sub14_Sub2 class120_sub14_sub2 = Class90.method751(i_48_);
																	if (class120_sub14_sub2.aChar3451 != 0) {
																		/* empty */
																	}
																	Class33.aStringArray277[i_3_++] = class120_sub14_sub2.method1422(i_49_);
																} else if (i_5_ == 3408) {
																	i_1_ -= 4;
																	final int i_50_ = ProducingGraphicsBuffer.anIntArray2801[1 + i_1_];
																	final int i_51_ = ProducingGraphicsBuffer.anIntArray2801[i_1_];
																	final int i_52_ = ProducingGraphicsBuffer.anIntArray2801[i_1_ - -2];
																	final int i_53_ = ProducingGraphicsBuffer.anIntArray2801[3 + i_1_];
																	final Class120_Sub14_Sub2 class120_sub14_sub2 = Class90.method751(i_52_);
																	if (i_51_ != class120_sub14_sub2.aChar3458 || i_50_ != class120_sub14_sub2.aChar3451) {
																		throw new RuntimeException("C3408-1");
																	}
																	if (i_50_ == 115) {
																		Class33.aStringArray277[i_3_++] = class120_sub14_sub2.method1422(i_53_);
																	} else {
																		ProducingGraphicsBuffer.anIntArray2801[i_1_++] = class120_sub14_sub2.method1417(0, i_53_);
																	}
																} else if (i_5_ == 3409) {
																	i_1_ -= 3;
																	final int i_54_ = ProducingGraphicsBuffer.anIntArray2801[i_1_];
																	final int i_55_ = ProducingGraphicsBuffer.anIntArray2801[1 + i_1_];
																	final int i_56_ = ProducingGraphicsBuffer.anIntArray2801[2 + i_1_];
																	if (i_55_ == -1) {
																		throw new RuntimeException("C3409-2");
																	}
																	final Class120_Sub14_Sub2 class120_sub14_sub2 = Class90.method751(i_55_);
																	if (class120_sub14_sub2.aChar3451 != i_54_) {
																		throw new RuntimeException("C3409-1");
																	}
																	ProducingGraphicsBuffer.anIntArray2801[i_1_++] = !class120_sub14_sub2.method1420(Class120_Sub12_Sub38.method1397(i_0_, -1006199391), i_56_) ? 0 : 1;
																} else if (i_5_ == 3410) {
																	final String string = Class33.aStringArray277[--i_3_];
																	final int i_57_ = ProducingGraphicsBuffer.anIntArray2801[--i_1_];
																	if ((i_57_ ^ 0xffffffff) == 0) {
																		throw new RuntimeException("C3410-2");
																	}
																	final Class120_Sub14_Sub2 class120_sub14_sub2 = Class90.method751(i_57_);
																	if (class120_sub14_sub2.aChar3451 != 's') {
																		throw new RuntimeException("C3410-1");
																	}
																	ProducingGraphicsBuffer.anIntArray2801[i_1_++] = class120_sub14_sub2.method1427(Class120_Sub12_Sub38.method1397(i_0_, 1006175982), string) ? 1 : 0;
																} else {
																	if (i_5_ != 3411) {
																		break;
																	}
																	final int i_58_ = ProducingGraphicsBuffer.anIntArray2801[--i_1_];
																	final Class120_Sub14_Sub2 class120_sub14_sub2 = Class90.method751(i_58_);
																	ProducingGraphicsBuffer.anIntArray2801[i_1_++] = class120_sub14_sub2.aClass75_3461.getCount();
																}
															} else if (i_5_ >= 3700) {
																if (i_5_ < 4000) {
																	if (i_5_ == 3903) {
																		final int i_59_ = ProducingGraphicsBuffer.anIntArray2801[--i_1_];
																		ProducingGraphicsBuffer.anIntArray2801[i_1_++] = Class120_Sub3.aClass160Array2427[i_59_].method2097(89);
																	} else if (i_5_ == 3904) {
																		final int i_60_ = ProducingGraphicsBuffer.anIntArray2801[--i_1_];
																		ProducingGraphicsBuffer.anIntArray2801[i_1_++] = Class120_Sub3.aClass160Array2427[i_60_].anInt1500;
																	} else if (i_5_ == 3905) {
																		final int i_61_ = ProducingGraphicsBuffer.anIntArray2801[--i_1_];
																		ProducingGraphicsBuffer.anIntArray2801[i_1_++] = Class120_Sub3.aClass160Array2427[i_61_].anInt1499;
																	} else if (i_5_ == 3906) {
																		final int i_62_ = ProducingGraphicsBuffer.anIntArray2801[--i_1_];
																		ProducingGraphicsBuffer.anIntArray2801[i_1_++] = Class120_Sub3.aClass160Array2427[i_62_].anInt1491;
																	} else if (i_5_ == 3907) {
																		final int i_63_ = ProducingGraphicsBuffer.anIntArray2801[--i_1_];
																		ProducingGraphicsBuffer.anIntArray2801[i_1_++] = Class120_Sub3.aClass160Array2427[i_63_].anInt1497;
																	} else if (i_5_ == 3908) {
																		final int i_64_ = ProducingGraphicsBuffer.anIntArray2801[--i_1_];
																		ProducingGraphicsBuffer.anIntArray2801[i_1_++] = Class120_Sub3.aClass160Array2427[i_64_].anInt1498;
																	} else if (i_5_ == 3910) {
																		final int i_65_ = ProducingGraphicsBuffer.anIntArray2801[--i_1_];
																		final int i_66_ = Class120_Sub3.aClass160Array2427[i_65_].method2100(-1);
																		ProducingGraphicsBuffer.anIntArray2801[i_1_++] = i_66_ == 0 ? 1 : 0;
																	} else if (i_5_ == 3911) {
																		final int i_67_ = ProducingGraphicsBuffer.anIntArray2801[--i_1_];
																		final int i_68_ = Class120_Sub3.aClass160Array2427[i_67_].method2100(-1);
																		ProducingGraphicsBuffer.anIntArray2801[i_1_++] = i_68_ != 2 ? 0 : 1;
																	} else if (i_5_ == 3912) {
																		final int i_69_ = ProducingGraphicsBuffer.anIntArray2801[--i_1_];
																		final int i_70_ = Class120_Sub3.aClass160Array2427[i_69_].method2100(i_0_ ^ ~0x3bf9625c);
																		ProducingGraphicsBuffer.anIntArray2801[i_1_++] = i_70_ != 5 ? 0 : 1;
																	} else {
																		if (i_5_ != 3913) {
																			break;
																		}
																		final int i_71_ = ProducingGraphicsBuffer.anIntArray2801[--i_1_];
																		final int i_72_ = Class120_Sub3.aClass160Array2427[i_71_].method2100(-1);
																		ProducingGraphicsBuffer.anIntArray2801[i_1_++] = i_72_ == 1 ? 1 : 0;
																	}
																} else if (i_5_ >= 4100) {
																	if (i_5_ >= 4200) {
																		if (i_5_ >= 4300) {
																			if (i_5_ < 4400) {
																				if (i_5_ != 4300) {
																					break;
																				}
																				i_1_ -= 2;
																				final int i_73_ = ProducingGraphicsBuffer.anIntArray2801[i_1_ + 1];
																				final int i_74_ = ProducingGraphicsBuffer.anIntArray2801[i_1_];
																				final Class120_Sub14_Sub11 class120_sub14_sub11 = Class120_Sub14_Sub11.list(i_73_);
																				if (!class120_sub14_sub11.method1515(123)) {
																					ProducingGraphicsBuffer.anIntArray2801[i_1_++] = NpcType.list(i_74_).method2206(-9059, class120_sub14_sub11.anInt3542, i_73_);
																				} else {
																					Class33.aStringArray277[i_3_++] = NpcType.list(i_74_).method2202(-1575770623, i_73_, class120_sub14_sub11.aString3539);
																				}
																			} else if (i_5_ >= 4500) {
																				if (i_5_ >= 4600) {
																					if (i_5_ < 5100) {
																						if (i_5_ == 5000) {
																							ProducingGraphicsBuffer.anIntArray2801[i_1_++] = Class69_Sub3_Sub1.anInt3084;
																						} else if (i_5_ == 5001) {
																							i_1_ -= 3;
																							Class69_Sub3_Sub1.anInt3084 = ProducingGraphicsBuffer.anIntArray2801[i_1_];
																							Class120_Sub12_Sub31.anInt3382 = ProducingGraphicsBuffer.anIntArray2801[i_1_ - -1];
																							KeyboardHandler.anInt1507 = ProducingGraphicsBuffer.anIntArray2801[i_1_ + 2];
																							Class120_Sub12_Sub11.outputStream.putByteIsaac(234);
																							Class120_Sub12_Sub11.outputStream.putByte(Class69_Sub3_Sub1.anInt3084);
																							Class120_Sub12_Sub11.outputStream.putByte(Class120_Sub12_Sub31.anInt3382);
																							Class120_Sub12_Sub11.outputStream.putByte(KeyboardHandler.anInt1507);
																						} else if (i_5_ == 5002) {
																							final String string = Class33.aStringArray277[--i_3_];
																							i_1_ -= 2;
																							final int i_75_ = ProducingGraphicsBuffer.anIntArray2801[i_1_];
																							final int i_76_ = ProducingGraphicsBuffer.anIntArray2801[1 + i_1_];
																							Class120_Sub12_Sub11.outputStream.putByteIsaac(90);
																							Class120_Sub12_Sub11.outputStream.putLong(Class70.stringToLong(string));
																							Class120_Sub12_Sub11.outputStream.putByte(i_75_ + -1);
																							Class120_Sub12_Sub11.outputStream.putByte(i_76_);
																						} else if (i_5_ == 5003) {
																							final int i_77_ = ProducingGraphicsBuffer.anIntArray2801[--i_1_];
																							String string = null;
																							if (i_77_ < 100) {
																								string = Class160.aStringArray1502[i_77_];
																							}
																							if (string == null) {
																								string = "";
																							}
																							Class33.aStringArray277[i_3_++] = string;
																						} else if (i_5_ == 5004) {
																							int i_78_ = -1;
																							final int i_79_ = ProducingGraphicsBuffer.anIntArray2801[--i_1_];
																							if (i_79_ < 100 && Class160.aStringArray1502[i_79_] != null) {
																								i_78_ = Class136.anIntArray1315[i_79_];
																							}
																							ProducingGraphicsBuffer.anIntArray2801[i_1_++] = i_78_;
																						} else if (i_5_ == 5005) {
																							ProducingGraphicsBuffer.anIntArray2801[i_1_++] = Class120_Sub12_Sub31.anInt3382;
																						} else if (i_5_ == 5008) {
																							String string = Class33.aStringArray277[--i_3_];
																							if (string.startsWith("::")) {
																								Class120_Sub12_Sub20.method1301((byte) 124, string);
																							} else if (Class86.anInt821 != 0 || (!Class27.aBoolean167 || Class128.aBoolean1228) && !Class120_Sub14_Sub4.aBoolean3464) {
																								String string_80_ = string.toLowerCase();
																								int i_81_ = 0;
																								int i_82_ = 0;
																								if (string_80_.startsWith(Class120_Sub12.aString2566)) {
																									string = string.substring(Class120_Sub12.aString2566.length());
																									i_81_ = 0;
																								} else if (string_80_.startsWith(Class120_Sub15.aString2589)) {
																									i_81_ = 1;
																									string = string.substring(Class120_Sub15.aString2589.length());
																								} else if (!string_80_.startsWith(Class33.aString276)) {
																									if (!string_80_.startsWith(Class111.aString1066)) {
																										if (string_80_.startsWith(Node.aString1148)) {
																											string = string.substring(Node.aString1148.length());
																											i_81_ = 4;
																										} else if (!string_80_.startsWith(Class118.aString1137)) {
																											if (!string_80_.startsWith(GroundTile.aString2622)) {
																												if (!string_80_.startsWith(Class176.aString1766)) {
																													if (string_80_.startsWith(Class127.aString1217)) {
																														string = string.substring(Class127.aString1217.length());
																														i_81_ = 8;
																													} else if (string_80_.startsWith(Class120_Sub21.aString2665)) {
																														string = string.substring(Class120_Sub21.aString2665.length());
																														i_81_ = 9;
																													} else if (string_80_.startsWith(Class7.aString60)) {
																														i_81_ = 10;
																														string = string.substring(Class7.aString60.length());
																													} else if (string_80_.startsWith(Class120_Sub17.aString2614)) {
																														string = string.substring(Class120_Sub17.aString2614.length());
																														i_81_ = 11;
																													} else if (Class9.language != 0) {
																														if (!string_80_.startsWith(Class69_Sub1.aString2231)) {
																															if (!string_80_.startsWith(Class53_Sub1.aString2213)) {
																																if (string_80_.startsWith(Class69.aString618)) {
																																	i_81_ = 2;
																																	string = string.substring(Class69.aString618.length());
																																} else if (!string_80_.startsWith(Class158.aString1483)) {
																																	if (!string_80_.startsWith(Class120_Sub14_Sub14.aString3575)) {
																																		if (string_80_.startsWith(Class120_Sub13.aString2574)) {
																																			string = string.substring(Class120_Sub13.aString2574.length());
																																			i_81_ = 5;
																																		} else if (!string_80_.startsWith(Class147.aString1397)) {
																																			if (string_80_.startsWith(Class53_Sub1.aString2206)) {
																																				i_81_ = 7;
																																				string = string.substring(Class53_Sub1.aString2206.length());
																																			} else if (string_80_.startsWith(NpcType.aString1685)) {
																																				string = string.substring(NpcType.aString1685.length());
																																				i_81_ = 8;
																																			} else if (!string_80_.startsWith(Class111.aString1062)) {
																																				if (!string_80_.startsWith(Class156.aString1457)) {
																																					if (string_80_.startsWith(Class136.aString1316)) {
																																						i_81_ = 11;
																																						string = string.substring(Class136.aString1316.length());
																																					}
																																				} else {
																																					string = string.substring(Class156.aString1457.length());
																																					i_81_ = 10;
																																				}
																																			} else {
																																				i_81_ = 9;
																																				string = string.substring(Class111.aString1062.length());
																																			}
																																		} else {
																																			string = string.substring(Class147.aString1397.length());
																																			i_81_ = 6;
																																		}
																																	} else {
																																		i_81_ = 4;
																																		string = string.substring(Class120_Sub14_Sub14.aString3575.length());
																																	}
																																} else {
																																	i_81_ = 3;
																																	string = string.substring(Class158.aString1483.length());
																																}
																															} else {
																																string = string.substring(Class53_Sub1.aString2213.length());
																																i_81_ = 1;
																															}
																														} else {
																															string = string.substring(Class69_Sub1.aString2231.length());
																															i_81_ = 0;
																														}
																													}
																												} else {
																													i_81_ = 7;
																													string = string.substring(Class176.aString1766.length());
																												}
																											} else {
																												string = string.substring(GroundTile.aString2622.length());
																												i_81_ = 6;
																											}
																										} else {
																											string = string.substring(Class118.aString1137.length());
																											i_81_ = 5;
																										}
																									} else {
																										string = string.substring(Class111.aString1066.length());
																										i_81_ = 3;
																									}
																								} else {
																									string = string.substring(Class33.aString276.length());
																									i_81_ = 2;
																								}
																								string_80_ = string.toLowerCase();
																								if (string_80_.startsWith(Class71.aString624)) {
																									string = string.substring(Class71.aString624.length());
																									i_82_ = 1;
																								} else if (string_80_.startsWith(Class99.aString952)) {
																									i_82_ = 2;
																									string = string.substring(Class99.aString952.length());
																								} else if (string_80_.startsWith(Class39.aString325)) {
																									i_82_ = 3;
																									string = string.substring(Class39.aString325.length());
																								} else if (!string_80_.startsWith(Class186.aString1903)) {
																									if (string_80_.startsWith(Class120_Sub10.aString2548)) {
																										i_82_ = 5;
																										string = string.substring(Class120_Sub10.aString2548.length());
																									} else if (Class9.language != 0) {
																										if (!string_80_.startsWith(Class85.aString807)) {
																											if (string_80_.startsWith(Class147.aString1398)) {
																												string = string.substring(Class147.aString1398.length());
																												i_82_ = 2;
																											} else if (!string_80_.startsWith(Class96.aString915)) {
																												if (string_80_.startsWith(GameEntity.aString3011)) {
																													i_82_ = 4;
																													string = string.substring(GameEntity.aString3011.length());
																												} else if (string_80_.startsWith(Class120_Sub10.aString2538)) {
																													string = string.substring(Class120_Sub10.aString2538.length());
																													i_82_ = 5;
																												}
																											} else {
																												i_82_ = 3;
																												string = string.substring(Class96.aString915.length());
																											}
																										} else {
																											string = string.substring(Class85.aString807.length());
																											i_82_ = 1;
																										}
																									}
																								} else {
																									string = string.substring(Class186.aString1903.length());
																									i_82_ = 4;
																								}
																								Class120_Sub12_Sub11.outputStream.putByteIsaac(186);
																								Class120_Sub12_Sub11.outputStream.putByte(0);
																								final int i_83_ = Class120_Sub12_Sub11.outputStream.pos;
																								Class120_Sub12_Sub11.outputStream.putByte(i_81_);
																								Class120_Sub12_Sub11.outputStream.putByte(i_82_);
																								Class148.method2060(Class120_Sub12_Sub11.outputStream, string, -32696);
																								Class120_Sub12_Sub11.outputStream.method1140((byte) -116, Class120_Sub12_Sub11.outputStream.pos + -i_83_);
																							}
																						} else if (i_5_ == 5009) {
																							i_3_ -= 2;
																							final String string = Class33.aStringArray277[i_3_];
																							final String string_84_ = Class33.aStringArray277[i_3_ + 1];
																							if (Class86.anInt821 != 0 || (!Class27.aBoolean167 || Class128.aBoolean1228) && !Class120_Sub14_Sub4.aBoolean3464) {
																								Class120_Sub12_Sub11.outputStream.putByteIsaac(157);
																								Class120_Sub12_Sub11.outputStream.putByte(0);
																								final int i_85_ = Class120_Sub12_Sub11.outputStream.pos;
																								Class120_Sub12_Sub11.outputStream.putLong(Class70.stringToLong(string));
																								Class148.method2060(Class120_Sub12_Sub11.outputStream, string_84_, -32696);
																								Class120_Sub12_Sub11.outputStream.method1140((byte) -120, -i_85_ + Class120_Sub12_Sub11.outputStream.pos);
																							}
																						} else if (i_5_ == 5010) {
																							String string = null;
																							final int i_86_ = ProducingGraphicsBuffer.anIntArray2801[--i_1_];
																							if (i_86_ < 100) {
																								string = Class76.aStringArray677[i_86_];
																							}
																							if (string == null) {
																								string = "";
																							}
																							Class33.aStringArray277[i_3_++] = string;
																						} else if (i_5_ == 5011) {
																							final int i_87_ = ProducingGraphicsBuffer.anIntArray2801[--i_1_];
																							String string = null;
																							if (i_87_ < 100) {
																								string = Class120_Sub2.aStringArray2423[i_87_];
																							}
																							if (string == null) {
																								string = "";
																							}
																							Class33.aStringArray277[i_3_++] = string;
																						} else if (i_5_ == 5012) {
																							final int i_88_ = ProducingGraphicsBuffer.anIntArray2801[--i_1_];
																							int i_89_ = -1;
																							if (i_88_ < 100) {
																								i_89_ = Class120_Sub12_Sub36.anIntArray3422[i_88_];
																							}
																							ProducingGraphicsBuffer.anIntArray2801[i_1_++] = i_89_;
																						} else if (i_5_ == 5015) {
																							String string;
																							if (Class100.selfPlayer != null && Class100.selfPlayer.name != null) {
																								string = Class100.selfPlayer.getTitledName();
																							} else {
																								string = Class74.aString666;
																							}
																							Class33.aStringArray277[i_3_++] = string;
																						} else if (i_5_ == 5016) {
																							ProducingGraphicsBuffer.anIntArray2801[i_1_++] = KeyboardHandler.anInt1507;
																						} else if (i_5_ == 5017) {
																							ProducingGraphicsBuffer.anIntArray2801[i_1_++] = Class120_Sub16.messageCount;
																						} else if (i_5_ == 5050) {
																							final int i_90_ = ProducingGraphicsBuffer.anIntArray2801[--i_1_];
																							Class33.aStringArray277[i_3_++] = Class120_Sub11.method1174(i_90_, i_0_ + -1006169490).aString3650;
																						} else if (i_5_ == 5051) {
																							final int i_91_ = ProducingGraphicsBuffer.anIntArray2801[--i_1_];
																							final Class120_Sub14_Sub23 class120_sub14_sub23 = Class120_Sub11.method1174(i_91_, 29898);
																							if (class120_sub14_sub23.anIntArray3651 != null) {
																								ProducingGraphicsBuffer.anIntArray2801[i_1_++] = class120_sub14_sub23.anIntArray3651.length;
																							} else {
																								ProducingGraphicsBuffer.anIntArray2801[i_1_++] = 0;
																							}
																						} else if (i_5_ == 5052) {
																							i_1_ -= 2;
																							final int i_92_ = ProducingGraphicsBuffer.anIntArray2801[1 + i_1_];
																							final int i_93_ = ProducingGraphicsBuffer.anIntArray2801[i_1_];
																							final Class120_Sub14_Sub23 class120_sub14_sub23 = Class120_Sub11.method1174(i_93_, 29898);
																							final int i_94_ = class120_sub14_sub23.anIntArray3651[i_92_];
																							ProducingGraphicsBuffer.anIntArray2801[i_1_++] = i_94_;
																						} else if (i_5_ == 5053) {
																							final int i_95_ = ProducingGraphicsBuffer.anIntArray2801[--i_1_];
																							final Class120_Sub14_Sub23 class120_sub14_sub23 = Class120_Sub11.method1174(i_95_, i_0_ ^ 0x3bf91696);
																							if (class120_sub14_sub23.anIntArray3648 != null) {
																								ProducingGraphicsBuffer.anIntArray2801[i_1_++] = class120_sub14_sub23.anIntArray3648.length;
																							} else {
																								ProducingGraphicsBuffer.anIntArray2801[i_1_++] = 0;
																							}
																						} else if (i_5_ == 5054) {
																							i_1_ -= 2;
																							final int i_96_ = ProducingGraphicsBuffer.anIntArray2801[i_1_];
																							final int i_97_ = ProducingGraphicsBuffer.anIntArray2801[1 + i_1_];
																							ProducingGraphicsBuffer.anIntArray2801[i_1_++] = Class120_Sub11.method1174(i_96_, 29898).anIntArray3648[i_97_];
																						} else if (i_5_ == 5055) {
																							final int i_98_ = ProducingGraphicsBuffer.anIntArray2801[--i_1_];
																							Class33.aStringArray277[i_3_++] = Class121.method1837(i_98_, true).method1510(Class120_Sub12_Sub38.method1397(i_0_, 1006184158));
																						} else if (i_5_ == 5056) {
																							final int i_99_ = ProducingGraphicsBuffer.anIntArray2801[--i_1_];
																							final Class120_Sub14_Sub10 class120_sub14_sub10 = Class121.method1837(i_99_, true);
																							if (class120_sub14_sub10.anIntArray3535 != null) {
																								ProducingGraphicsBuffer.anIntArray2801[i_1_++] = class120_sub14_sub10.anIntArray3535.length;
																							} else {
																								ProducingGraphicsBuffer.anIntArray2801[i_1_++] = 0;
																							}
																						} else if (i_5_ == 5057) {
																							i_1_ -= 2;
																							final int i_100_ = ProducingGraphicsBuffer.anIntArray2801[i_1_];
																							final int i_101_ = ProducingGraphicsBuffer.anIntArray2801[i_1_ - -1];
																							ProducingGraphicsBuffer.anIntArray2801[i_1_++] = Class121.method1837(i_100_, true).anIntArray3535[i_101_];
																						} else if (i_5_ == 5058) {
																							Class101_Sub1.aClass22_2273 = new Class22();
																							Class101_Sub1.aClass22_2273.anInt129 = ProducingGraphicsBuffer.anIntArray2801[--i_1_];
																							Class101_Sub1.aClass22_2273.aClass120_Sub14_Sub10_128 = Class121.method1837(Class101_Sub1.aClass22_2273.anInt129, true);
																							Class101_Sub1.aClass22_2273.anIntArray133 = new int[Class101_Sub1.aClass22_2273.aClass120_Sub14_Sub10_128.method1500(i_0_ + -1006199388)];
																						} else if (i_5_ == 5059) {
																							Class120_Sub12_Sub11.outputStream.putByteIsaac(222);
																							Class120_Sub12_Sub11.outputStream.putByte(0);
																							final int i_102_ = Class120_Sub12_Sub11.outputStream.pos;
																							Class120_Sub12_Sub11.outputStream.putByte(0);
																							Class120_Sub12_Sub11.outputStream.putShort(Class101_Sub1.aClass22_2273.anInt129);
																							Class101_Sub1.aClass22_2273.aClass120_Sub14_Sub10_128.method1508(Class101_Sub1.aClass22_2273.anIntArray133, (byte) 107, Class120_Sub12_Sub11.outputStream);
																							Class120_Sub12_Sub11.outputStream.method1140((byte) -123, -i_102_ + Class120_Sub12_Sub11.outputStream.pos);
																						} else if (i_5_ == 5060) {
																							final String string = Class33.aStringArray277[--i_3_];
																							Class120_Sub12_Sub11.outputStream.putByteIsaac(42);
																							Class120_Sub12_Sub11.outputStream.putByte(0);
																							final int i_103_ = Class120_Sub12_Sub11.outputStream.pos;
																							Class120_Sub12_Sub11.outputStream.putLong(Class70.stringToLong(string));
																							Class120_Sub12_Sub11.outputStream.putShort(Class101_Sub1.aClass22_2273.anInt129);
																							Class101_Sub1.aClass22_2273.aClass120_Sub14_Sub10_128.method1508(Class101_Sub1.aClass22_2273.anIntArray133, (byte) 107, Class120_Sub12_Sub11.outputStream);
																							Class120_Sub12_Sub11.outputStream.method1140((byte) -120, -i_103_ + Class120_Sub12_Sub11.outputStream.pos);
																						} else if (i_5_ == 5061) {
																							Class120_Sub12_Sub11.outputStream.putByteIsaac(222);
																							Class120_Sub12_Sub11.outputStream.putByte(0);
																							final int i_104_ = Class120_Sub12_Sub11.outputStream.pos;
																							Class120_Sub12_Sub11.outputStream.putByte(1);
																							Class120_Sub12_Sub11.outputStream.putShort(Class101_Sub1.aClass22_2273.anInt129);
																							Class101_Sub1.aClass22_2273.aClass120_Sub14_Sub10_128.method1508(Class101_Sub1.aClass22_2273.anIntArray133, (byte) 107, Class120_Sub12_Sub11.outputStream);
																							Class120_Sub12_Sub11.outputStream.method1140((byte) -125, Class120_Sub12_Sub11.outputStream.pos + -i_104_);
																						} else if (i_5_ == 5062) {
																							i_1_ -= 2;
																							final int i_105_ = ProducingGraphicsBuffer.anIntArray2801[i_1_];
																							final int i_106_ = ProducingGraphicsBuffer.anIntArray2801[i_1_ - -1];
																							ProducingGraphicsBuffer.anIntArray2801[i_1_++] = Class120_Sub11.method1174(i_105_, i_0_ + -1006169490).aCharArray3652[i_106_];
																						} else if (i_5_ == 5063) {
																							i_1_ -= 2;
																							final int i_107_ = ProducingGraphicsBuffer.anIntArray2801[i_1_];
																							final int i_108_ = ProducingGraphicsBuffer.anIntArray2801[1 + i_1_];
																							ProducingGraphicsBuffer.anIntArray2801[i_1_++] = Class120_Sub11.method1174(i_107_, 29898).aCharArray3653[i_108_];
																						} else if (i_5_ == 5064) {
																							i_1_ -= 2;
																							final int i_109_ = ProducingGraphicsBuffer.anIntArray2801[i_1_ - -1];
																							final int i_110_ = ProducingGraphicsBuffer.anIntArray2801[i_1_];
																							if (i_109_ != -1) {
																								ProducingGraphicsBuffer.anIntArray2801[i_1_++] = Class120_Sub11.method1174(i_110_, 29898).method1643((char) i_109_, i_0_ + -1006199279);
																							} else {
																								ProducingGraphicsBuffer.anIntArray2801[i_1_++] = -1;
																							}
																						} else if (i_5_ == 5065) {
																							i_1_ -= 2;
																							final int i_111_ = ProducingGraphicsBuffer.anIntArray2801[i_1_ + 1];
																							final int i_112_ = ProducingGraphicsBuffer.anIntArray2801[i_1_];
																							if (i_111_ != -1) {
																								ProducingGraphicsBuffer.anIntArray2801[i_1_++] = Class120_Sub11.method1174(i_112_, 29898).method1640((char) i_111_, -1);
																							} else {
																								ProducingGraphicsBuffer.anIntArray2801[i_1_++] = -1;
																							}
																						} else if (i_5_ == 5066) {
																							final int i_113_ = ProducingGraphicsBuffer.anIntArray2801[--i_1_];
																							ProducingGraphicsBuffer.anIntArray2801[i_1_++] = Class121.method1837(i_113_, true).method1500(i_0_ + -1006199388);
																						} else if (i_5_ == 5067) {
																							i_1_ -= 2;
																							final int i_114_ = ProducingGraphicsBuffer.anIntArray2801[i_1_];
																							final int i_115_ = ProducingGraphicsBuffer.anIntArray2801[i_1_ + 1];
																							final int i_116_ = Class121.method1837(i_114_, true).method1502(i_115_, 0);
																							ProducingGraphicsBuffer.anIntArray2801[i_1_++] = i_116_;
																						} else if (i_5_ == 5068) {
																							i_1_ -= 2;
																							final int i_117_ = ProducingGraphicsBuffer.anIntArray2801[i_1_];
																							final int i_118_ = ProducingGraphicsBuffer.anIntArray2801[1 + i_1_];
																							Class101_Sub1.aClass22_2273.anIntArray133[i_117_] = i_118_;
																						} else if (i_5_ == 5069) {
																							i_1_ -= 2;
																							final int i_119_ = ProducingGraphicsBuffer.anIntArray2801[i_1_];
																							final int i_120_ = ProducingGraphicsBuffer.anIntArray2801[1 + i_1_];
																							Class101_Sub1.aClass22_2273.anIntArray133[i_119_] = i_120_;
																						} else if (i_5_ == 5070) {
																							i_1_ -= 3;
																							final int i_121_ = ProducingGraphicsBuffer.anIntArray2801[i_1_];
																							final int i_122_ = ProducingGraphicsBuffer.anIntArray2801[2 + i_1_];
																							final int i_123_ = ProducingGraphicsBuffer.anIntArray2801[1 + i_1_];
																							final Class120_Sub14_Sub10 class120_sub14_sub10 = Class121.method1837(i_121_, true);
																							if (class120_sub14_sub10.method1502(i_123_, 0) != 0) {
																								throw new RuntimeException("bad command");
																							}
																							ProducingGraphicsBuffer.anIntArray2801[i_1_++] = class120_sub14_sub10.method1501(i_122_, 0, i_123_);
																						} else if (i_5_ == 5071) {
																							final String string = Class33.aStringArray277[--i_3_];
																							final boolean bool_124_ = ProducingGraphicsBuffer.anIntArray2801[--i_1_] == 1;
																							Class110.method978(bool_124_, string, i_0_ + -1006181126);
																							ProducingGraphicsBuffer.anIntArray2801[i_1_++] = Buffer.anInt2474;
																						} else if (i_5_ == 5072) {
																							if (Class120_Sub12_Sub37.aShortArray3430 != null && Buffer.anInt2474 > Class108.anInt1035) {
																								ProducingGraphicsBuffer.anIntArray2801[i_1_++] = Class120_Sub12_Sub3.method1207(65535, Class120_Sub12_Sub37.aShortArray3430[Class108.anInt1035++]);
																							} else {
																								ProducingGraphicsBuffer.anIntArray2801[i_1_++] = -1;
																							}
																						} else {
																							if (i_5_ != 5073) {
																								break;
																							}
																							Class108.anInt1035 = 0;
																						}
																					} else if (i_5_ < 5200) {
																						if (i_5_ == 5100) {
																							if (Class35.aBooleanArray299[86]) {
																								ProducingGraphicsBuffer.anIntArray2801[i_1_++] = 1;
																							} else {
																								ProducingGraphicsBuffer.anIntArray2801[i_1_++] = 0;
																							}
																						} else if (i_5_ == 5101) {
																							if (!Class35.aBooleanArray299[82]) {
																								ProducingGraphicsBuffer.anIntArray2801[i_1_++] = 0;
																							} else {
																								ProducingGraphicsBuffer.anIntArray2801[i_1_++] = 1;
																							}
																						} else {
																							if (i_5_ != 5102) {
																								break;
																							}
																							if (Class35.aBooleanArray299[81]) {
																								ProducingGraphicsBuffer.anIntArray2801[i_1_++] = 1;
																							} else {
																								ProducingGraphicsBuffer.anIntArray2801[i_1_++] = 0;
																							}
																						}
																					} else if (i_5_ >= 5300) {
																						if (i_5_ < 5400) {
																							if (i_5_ == 5300) {
																								i_1_ -= 2;
																								final int i_125_ = ProducingGraphicsBuffer.anIntArray2801[i_1_];
																								final int i_126_ = ProducingGraphicsBuffer.anIntArray2801[i_1_ + 1];
																								AbstractSprite.method1593(false, 3, i_125_, i_126_);
																								ProducingGraphicsBuffer.anIntArray2801[i_1_++] = Class120_Sub14_Sub10.fullscreenFrame != null ? 1 : 0;
																							} else if (i_5_ == 5301) {
																								if (Class120_Sub14_Sub10.fullscreenFrame != null) {
																									AbstractSprite.method1593(false, Class120_Sub12_Sub19.currentDisplayMode, -1, -1);
																								}
																							} else if (i_5_ == 5302) {
																								final DisplayModeInfo[] class171s = Class114.method1004((byte) -52);
																								ProducingGraphicsBuffer.anIntArray2801[i_1_++] = class171s.length;
																							} else if (i_5_ == 5303) {
																								final int i_127_ = ProducingGraphicsBuffer.anIntArray2801[--i_1_];
																								final DisplayModeInfo[] class171s = Class114.method1004((byte) -71);
																								ProducingGraphicsBuffer.anIntArray2801[i_1_++] = class171s[i_127_].width;
																								ProducingGraphicsBuffer.anIntArray2801[i_1_++] = class171s[i_127_].height;
																							} else if (i_5_ == 5305) {
																								final int i_128_ = Class120_Sub12_Sub18.lastFullscreenWidth;
																								final int i_129_ = Class120_Sub12_Sub12.lastFullscreenHeight;
																								int i_130_ = -1;
																								final DisplayModeInfo[] class171s = Class114.method1004((byte) -92);
																								for (int i_131_ = 0; class171s.length > i_131_; i_131_++) {
																									final DisplayModeInfo displayModeInfo = class171s[i_131_];
																									if (displayModeInfo.width == i_128_ && displayModeInfo.height == i_129_) {
																										i_130_ = i_131_;
																										break;
																									}
																								}
																								ProducingGraphicsBuffer.anIntArray2801[i_1_++] = i_130_;
																							} else if (i_5_ == 5306) {
																								ProducingGraphicsBuffer.anIntArray2801[i_1_++] = Class120_Sub12_Sub4.getDisplayMode();
																							} else if (i_5_ == 5307) {
																								int i_132_ = ProducingGraphicsBuffer.anIntArray2801[--i_1_];
																								if (i_132_ < 0 || i_132_ > 2) {
																									i_132_ = 0;
																								}
																								AbstractSprite.method1593(false, i_132_, -1, -1);
																							} else if (i_5_ == 5308) {
																								ProducingGraphicsBuffer.anIntArray2801[i_1_++] = Class120_Sub12_Sub19.currentDisplayMode;
																							} else {
																								if (i_5_ != 5309) {
																									break;
																								}
																								int i_133_ = ProducingGraphicsBuffer.anIntArray2801[--i_1_];
																								if (i_133_ < 0 || i_133_ > 2) {
																									i_133_ = 0;
																								}
																								Class120_Sub12_Sub19.currentDisplayMode = i_133_;
																								Class120_Sub6.savePreferences(NpcType.gameSignlink);
																							}
																						} else if (i_5_ >= 5500) {
																							if (i_5_ >= 5600) {
																								if (i_5_ < 5700) {
																									if (i_5_ == 5600) {
																										i_3_ -= 2;
																										final int i_134_ = ProducingGraphicsBuffer.anIntArray2801[--i_1_];
																										final String string = Class33.aStringArray277[i_3_];
																										final String string_135_ = Class33.aStringArray277[i_3_ - -1];
																										if (Class109.gameState == 10 && Class120_Sub14_Sub18.anInt3609 == 0 && Class86.anInt819 == 0 && Class154.anInt1440 == 0 && Decimator.anInt1716 == 0) {
																											CanvasWrapper.method66(string_135_, string, i_134_, (byte) 115);
																										}
																									} else if (i_5_ == 5601) {
																										Buffer.method1121(-3);
																									} else if (i_5_ == 5602) {
																										if (Class86.anInt819 == 0) {
																											Class48.anInt436 = -2;
																										}
																									} else if (i_5_ == 5603) {
																										i_1_ -= 4;
																										if (Class109.gameState == 10 && Class120_Sub14_Sub18.anInt3609 == 0 && Class86.anInt819 == 0 && Class154.anInt1440 == 0 && Decimator.anInt1716 == 0) {
																											Queue.method2254(false, ProducingGraphicsBuffer.anIntArray2801[2 + i_1_], ProducingGraphicsBuffer.anIntArray2801[i_1_ - -3], ProducingGraphicsBuffer.anIntArray2801[i_1_ - -1], ProducingGraphicsBuffer.anIntArray2801[i_1_]);
																										}
																									} else if (i_5_ == 5604) {
																										i_3_--;
																										if (Class109.gameState == 10 && Class120_Sub14_Sub18.anInt3609 == 0 && Class86.anInt819 == 0 && Class154.anInt1440 == 0 && Decimator.anInt1716 == 0) {
																											Class3.method87(19536, Class70.stringToLong(Class33.aStringArray277[i_3_]));
																										}
																									} else if (i_5_ == 5605) {
																										i_1_ -= 7;
																										i_3_ -= 3;
																										if (Class109.gameState == 10 && Class120_Sub14_Sub18.anInt3609 == 0 && Class86.anInt819 == 0 && Class154.anInt1440 == 0 && Decimator.anInt1716 == 0) {
																											Class142.method2007(ProducingGraphicsBuffer.anIntArray2801[i_1_ - -6] == 1, ProducingGraphicsBuffer.anIntArray2801[i_1_], ProducingGraphicsBuffer.anIntArray2801[i_1_ - -4] == 1, ProducingGraphicsBuffer.anIntArray2801[i_1_ - -3],
																													Class33.aStringArray277[i_3_ + 2], ProducingGraphicsBuffer.anIntArray2801[i_1_ - -1], ProducingGraphicsBuffer.anIntArray2801[2 + i_1_], (byte) 119, Class70.stringToLong(Class33.aStringArray277[i_3_]),
																													ProducingGraphicsBuffer.anIntArray2801[i_1_ - -5] == 1, Class33.aStringArray277[1 + i_3_]);
																										}
																									} else if (i_5_ == 5606) {
																										if (Class154.anInt1440 == 0) {
																											Class120_Sub12_Sub35.anInt3410 = -2;
																										}
																									} else if (i_5_ == 5607) {
																										ProducingGraphicsBuffer.anIntArray2801[i_1_++] = Class48.anInt436;
																									} else if (i_5_ == 5608) {
																										ProducingGraphicsBuffer.anIntArray2801[i_1_++] = Class57.anInt504;
																									} else if (i_5_ == 5609) {
																										ProducingGraphicsBuffer.anIntArray2801[i_1_++] = Class120_Sub12_Sub35.anInt3410;
																									} else if (i_5_ == 5610) {
																										for (int i_136_ = 0; i_136_ < 5; i_136_++) {
																											Class33.aStringArray277[i_3_++] = Class45.aStringArray399.length > i_136_ ? Class120_Sub12_Sub23.method1326(Class45.aStringArray399[i_136_], true) : "";
																										}
																										Class45.aStringArray399 = null;
																									} else {
																										if (i_5_ != 5611) {
																											break;
																										}
																										ProducingGraphicsBuffer.anIntArray2801[i_1_++] = Class120_Sub22.anInt2672;
																									}
																								} else if (i_5_ < 6100) {
																									if (i_5_ == 6001) {
																										int i_137_ = ProducingGraphicsBuffer.anIntArray2801[--i_1_];
																										if (i_137_ < 1) {
																											i_137_ = 1;
																										}
																										if (i_137_ > 4) {
																											i_137_ = 4;
																										}
																										Class120_Sub14_Sub14_Sub1.brightness = i_137_;
																										if (!HDToolkit.glEnabled || !Class120_Sub12_Sub6.highLightingDetail) {
																											if (Class120_Sub14_Sub14_Sub1.brightness == 1) {
																												Rasterizer.method852(0.9F);
																											}
																											if (Class120_Sub14_Sub14_Sub1.brightness == 2) {
																												Rasterizer.method852(0.8F);
																											}
																											if (Class120_Sub14_Sub14_Sub1.brightness == 3) {
																												Rasterizer.method852(0.7F);
																											}
																											if (Class120_Sub14_Sub14_Sub1.brightness == 4) {
																												Rasterizer.method852(0.6F);
																											}
																										}
																										if (HDToolkit.glEnabled) {
																											Class120_Sub8.method1159();
																											if (!Class120_Sub12_Sub6.highLightingDetail) {
																												LocType.method2458();
																											}
																										}
																										Class10.method122();
																										Class120_Sub6.savePreferences(NpcType.gameSignlink);
																										Class120_Sub14_Sub5.aBoolean3471 = false;
																									} else if (i_5_ == 6002) {
																										GameShell.method32(ProducingGraphicsBuffer.anIntArray2801[--i_1_] == 1);
																										Class120_Sub12_Sub25.method1334(-94);
																										LocType.method2458();
																										Class57.method492(125);
																										Class120_Sub6.savePreferences(NpcType.gameSignlink);
																										Class120_Sub14_Sub5.aBoolean3471 = false;
																									} else if (i_5_ == 6003) {
																										Class120_Sub12.aBoolean2564 = ProducingGraphicsBuffer.anIntArray2801[--i_1_] == 1;
																										Class57.method492(101);
																										Class120_Sub6.savePreferences(NpcType.gameSignlink);
																										Class120_Sub14_Sub5.aBoolean3471 = false;
																									} else if (i_5_ == 6005) {
																										Hashtable.showGroundDecorations = ProducingGraphicsBuffer.anIntArray2801[--i_1_] == 1;
																										LocType.method2458();
																										Class120_Sub6.savePreferences(NpcType.gameSignlink);
																										Class120_Sub14_Sub5.aBoolean3471 = false;
																									} else if (i_5_ == 6006) {
																										Class108_Sub3.highDetailTextures = ProducingGraphicsBuffer.anIntArray2801[--i_1_] == 1;
																										((Class143_Sub1) Rasterizer.anInterface5_973).method2022(!Class108_Sub3.highDetailTextures, 2047);
																										Class120_Sub6.savePreferences(NpcType.gameSignlink);
																										Class120_Sub14_Sub5.aBoolean3471 = false;
																									} else if (i_5_ == 6007) {
																										Class120_Sub12_Sub10.manyIdleAnimations = ProducingGraphicsBuffer.anIntArray2801[--i_1_] == 1;
																										Class120_Sub6.savePreferences(NpcType.gameSignlink);
																										Class120_Sub14_Sub5.aBoolean3471 = false;
																									} else if (i_5_ == 6008) {
																										Class191.flickeringEffectsOn = ProducingGraphicsBuffer.anIntArray2801[--i_1_] == 1;
																										Class120_Sub6.savePreferences(NpcType.gameSignlink);
																										Class120_Sub14_Sub5.aBoolean3471 = false;
																									} else if (i_5_ == 6009) {
																										Class120_Sub30_Sub1.manyGroundTextures = ProducingGraphicsBuffer.anIntArray2801[--i_1_] == 1;
																										Class120_Sub6.savePreferences(NpcType.gameSignlink);
																										Class120_Sub14_Sub5.aBoolean3471 = false;
																									} else if (i_5_ == 6010) {
																										Class120_Sub6.characterShadowsOn = ProducingGraphicsBuffer.anIntArray2801[--i_1_] == 1;
																										Class120_Sub6.savePreferences(NpcType.gameSignlink);
																										Class120_Sub14_Sub5.aBoolean3471 = false;
																									} else if (i_5_ == 6011) {
																										int i_138_ = ProducingGraphicsBuffer.anIntArray2801[--i_1_];
																										if (i_138_ < 0 || i_138_ > 2) {
																											i_138_ = 0;
																										}
																										Class74.sceneryShadowsType = i_138_;//TODO this, dig deeper
																										Class120_Sub6.savePreferences(NpcType.gameSignlink);
																										Class120_Sub14_Sub5.aBoolean3471 = false;
																									} else if (i_5_ == 6012) {
																										if (HDToolkit.glEnabled) {
																											Class120_Sub14_Sub13.method1532(0, 0);
																										}
																										Class120_Sub12_Sub6.highLightingDetail = ProducingGraphicsBuffer.anIntArray2801[--i_1_] == 1;
																										if (!HDToolkit.glEnabled || !Class120_Sub12_Sub6.highLightingDetail) {
																											if (Class120_Sub14_Sub14_Sub1.brightness == 1) {
																												Rasterizer.method852(0.9F);
																											}
																											if (Class120_Sub14_Sub14_Sub1.brightness == 2) {
																												Rasterizer.method852(0.8F);
																											}
																											if (Class120_Sub14_Sub14_Sub1.brightness == 3) {
																												Rasterizer.method852(0.7F);
																											}
																											if (Class120_Sub14_Sub14_Sub1.brightness == 4) {
																												Rasterizer.method852(0.6F);
																											}
																										} else {
																											Rasterizer.method852(0.7F);
																										}
																										LocType.method2458();
																										Class120_Sub6.savePreferences(NpcType.gameSignlink);
																										Class120_Sub14_Sub5.aBoolean3471 = false;
																									} else if (i_5_ == 6014) {
																										PacketBuffer.highWaterDetail = ProducingGraphicsBuffer.anIntArray2801[--i_1_] == 1;
																										if (HDToolkit.glEnabled) {
																											LocType.method2458();
																										}
																										Class120_Sub6.savePreferences(NpcType.gameSignlink);
																										Class120_Sub14_Sub5.aBoolean3471 = false;
																									} else if (i_5_ == 6015) {
																										Decimator.fogEnabled = ProducingGraphicsBuffer.anIntArray2801[--i_1_] == 1;
																										if (HDToolkit.glEnabled) {
																											Class120_Sub8.method1159();
																										}
																										Class120_Sub6.savePreferences(NpcType.gameSignlink);
																										Class120_Sub14_Sub5.aBoolean3471 = false;
																									} else if (i_5_ == 6016) {
																										int i_139_ = ProducingGraphicsBuffer.anIntArray2801[--i_1_];
																										if (HDToolkit.glEnabled) {
																											Class120_Sub3.canvasReplaceRecommended = true;
																										}
																										if (i_139_ < 0 || i_139_ > 2) {
																											i_139_ = 0;
																										}
																										Class36.antiAliasingSamples = i_139_;
																									} else if (i_5_ == 6017) {
																										Class167.aBoolean1619 = ProducingGraphicsBuffer.anIntArray2801[--i_1_] == 1;
																										Class10.method123(23529);
																										Class120_Sub6.savePreferences(NpcType.gameSignlink);
																										Class120_Sub14_Sub5.aBoolean3471 = false;
																									} else if (i_5_ == 6018) {
																										int i_140_ = ProducingGraphicsBuffer.anIntArray2801[--i_1_];
																										if (i_140_ < 0) {
																											i_140_ = 0;
																										}
																										if (i_140_ > 127) {
																											i_140_ = 127;
																										}
																										Class111.anInt1061 = i_140_;
																										Class120_Sub6.savePreferences(NpcType.gameSignlink);
																										Class120_Sub14_Sub5.aBoolean3471 = false;
																									} else if (i_5_ == 6019) {
																										int i_141_ = ProducingGraphicsBuffer.anIntArray2801[--i_1_];
																										if (i_141_ < 0) {
																											i_141_ = 0;
																										}
																										if (i_141_ > 255) {
																											i_141_ = 255;
																										}
																										if (RuntimeException_Sub1.anInt2142 != i_141_) {
																											if (RuntimeException_Sub1.anInt2142 != 0 || (Class157.anInt1466 ^ 0xffffffff) == 0) {
																												if (i_141_ == 0) {
																													Class188.method2481(104);
																													Class120_Sub12_Sub15.aBoolean3247 = false;
																												} else {
																													Class140.method1995(i_141_, i_0_ ^ ~0x3bf9625c);
																												}
																											} else {
																												Class127.method1891(i_141_, -20329, 0, Class157.anInt1466, false, Class120_Sub12_Sub36.aClass50_3419);
																												Class120_Sub12_Sub15.aBoolean3247 = false;
																											}
																											RuntimeException_Sub1.anInt2142 = i_141_;
																										}
																										Class120_Sub6.savePreferences(NpcType.gameSignlink);
																										Class120_Sub14_Sub5.aBoolean3471 = false;
																									} else if (i_5_ == 6020) {
																										int i_142_ = ProducingGraphicsBuffer.anIntArray2801[--i_1_];
																										if (i_142_ < 0) {
																											i_142_ = 0;
																										}
																										if (i_142_ > 127) {
																											i_142_ = 127;
																										}
																										CursorType.anInt1242 = i_142_;
																										Class120_Sub6.savePreferences(NpcType.gameSignlink);
																										Class120_Sub14_Sub5.aBoolean3471 = false;
																									} else if (i_5_ == 6021) {
																										Class52.aBoolean466 = ProducingGraphicsBuffer.anIntArray2801[--i_1_] == 1;
																										Class57.method492(i_0_ ^ 0x3bf96222);
																									} else if (i_5_ == 6023) {
																										boolean bool_143_ = false;
																										int i_144_ = ProducingGraphicsBuffer.anIntArray2801[--i_1_];
																										if (i_144_ < 0) {
																											i_144_ = 0;
																										}
																										if (i_144_ > 2) {
																											i_144_ = 2;
																										}
																										if (Class120_Sub14_Sub13.maxMemory < 96) {
																											i_144_ = 0;
																											bool_143_ = true;
																										}
																										ParticleEngine.method952(i_144_);
																										Class120_Sub6.savePreferences(NpcType.gameSignlink);
																										Class120_Sub14_Sub5.aBoolean3471 = false;
																										ProducingGraphicsBuffer.anIntArray2801[i_1_++] = bool_143_ ? 0 : 1;
																									} else if (i_5_ == 6024) {
																										int i_145_ = ProducingGraphicsBuffer.anIntArray2801[--i_1_];
																										if (i_145_ < 0 || i_145_ > 2) {
																											i_145_ = 0;
																										}
																										AbstractMouseWheelHandler.anInt117 = i_145_;
																										Class120_Sub6.savePreferences(NpcType.gameSignlink);
																									} else if (i_5_ == 6027) {
																										int i_146_ = ProducingGraphicsBuffer.anIntArray2801[--i_1_];
																										if (HDToolkit.glEnabled) {
																											if (i_146_ < 0 || i_146_ > 1) {
																												i_146_ = 0;
																											}
																											Class108_Sub1.method933(i_146_ == 1, i_0_ ^ 0x382a64c);
																										}
																									} else {
																										if (i_5_ != 6028) {
																											break;
																										}
																										Class38.cursorsEnabled = ProducingGraphicsBuffer.anIntArray2801[--i_1_] != 0;
																										Class120_Sub6.savePreferences(NpcType.gameSignlink);
																									}
																								} else if (i_5_ < 6200) {
																									if (i_5_ == 6101) {
																										ProducingGraphicsBuffer.anIntArray2801[i_1_++] = Class120_Sub14_Sub14_Sub1.brightness;
																									} else if (i_5_ == 6102) {
																										ProducingGraphicsBuffer.anIntArray2801[i_1_++] = !Class143_Sub1.method2021() ? 0 : 1;
																									} else if (i_5_ == 6103) {
																										ProducingGraphicsBuffer.anIntArray2801[i_1_++] = Class120_Sub12.aBoolean2564 ? 1 : 0;
																									} else if (i_5_ == 6105) {
																										ProducingGraphicsBuffer.anIntArray2801[i_1_++] = !Hashtable.showGroundDecorations ? 0 : 1;
																									} else if (i_5_ == 6106) {
																										ProducingGraphicsBuffer.anIntArray2801[i_1_++] = Class108_Sub3.highDetailTextures ? 1 : 0;
																									} else if (i_5_ == 6107) {
																										ProducingGraphicsBuffer.anIntArray2801[i_1_++] = Class120_Sub12_Sub10.manyIdleAnimations ? 1 : 0;
																									} else if (i_5_ == 6108) {
																										ProducingGraphicsBuffer.anIntArray2801[i_1_++] = !Class191.flickeringEffectsOn ? 0 : 1;
																									} else if (i_5_ == 6109) {
																										ProducingGraphicsBuffer.anIntArray2801[i_1_++] = Class120_Sub30_Sub1.manyGroundTextures ? 1 : 0;
																									} else if (i_5_ == 6110) {
																										ProducingGraphicsBuffer.anIntArray2801[i_1_++] = Class120_Sub6.characterShadowsOn ? 1 : 0;
																									} else if (i_5_ == 6111) {
																										ProducingGraphicsBuffer.anIntArray2801[i_1_++] = Class74.sceneryShadowsType;
																									} else if (i_5_ == 6112) {
																										ProducingGraphicsBuffer.anIntArray2801[i_1_++] = Class120_Sub12_Sub6.highLightingDetail ? 1 : 0;
																									} else if (i_5_ == 6114) {
																										ProducingGraphicsBuffer.anIntArray2801[i_1_++] = !PacketBuffer.highWaterDetail ? 0 : 1;
																									} else if (i_5_ == 6115) {
																										ProducingGraphicsBuffer.anIntArray2801[i_1_++] = Decimator.fogEnabled ? 1 : 0;
																									} else if (i_5_ == 6116) {
																										ProducingGraphicsBuffer.anIntArray2801[i_1_++] = Class36.antiAliasingSamples;
																									} else if (i_5_ == 6117) {
																										ProducingGraphicsBuffer.anIntArray2801[i_1_++] = Class167.aBoolean1619 ? 1 : 0;
																									} else if (i_5_ == 6118) {
																										ProducingGraphicsBuffer.anIntArray2801[i_1_++] = Class111.anInt1061;
																									} else if (i_5_ == 6119) {
																										ProducingGraphicsBuffer.anIntArray2801[i_1_++] = RuntimeException_Sub1.anInt2142;
																									} else if (i_5_ == 6120) {
																										ProducingGraphicsBuffer.anIntArray2801[i_1_++] = CursorType.anInt1242;
																									} else if (i_5_ == 6121) {
																										if (HDToolkit.glEnabled) {
																											ProducingGraphicsBuffer.anIntArray2801[i_1_++] = HDToolkit.aBoolean523 ? 1 : 0;
																										} else {
																											ProducingGraphicsBuffer.anIntArray2801[i_1_++] = 0;
																										}
																									} else if (i_5_ == 6123) {
																										ProducingGraphicsBuffer.anIntArray2801[i_1_++] = ParticleEngine.method949();
																									} else if (i_5_ == 6124) {
																										ProducingGraphicsBuffer.anIntArray2801[i_1_++] = AbstractMouseWheelHandler.anInt117;
																									} else if (i_5_ == 6126) {
																										if (HDToolkit.glEnabled) {
																											ProducingGraphicsBuffer.anIntArray2801[i_1_++] = !Class34.method286() ? 0 : 1;
																										} else {
																											ProducingGraphicsBuffer.anIntArray2801[i_1_++] = 0;
																										}
																									} else if (i_5_ == 6127) {
																										ProducingGraphicsBuffer.anIntArray2801[i_1_++] = !Class186.aBoolean1902 ? 0 : 1;
																									} else {
																										if (i_5_ != 6128) {
																											break;
																										}
																										ProducingGraphicsBuffer.anIntArray2801[i_1_++] = Class38.cursorsEnabled ? 1 : 0;
																									}
																								} else if (i_5_ >= 6300) {
																									if (i_5_ < 6400) {
																										if (i_5_ == 6300) {
																											ProducingGraphicsBuffer.anIntArray2801[i_1_++] = (int) (TimeUtil.getSafeTime() / 60000L);
																										} else if (i_5_ == 6301) {
																											ProducingGraphicsBuffer.anIntArray2801[i_1_++] = (int) (TimeUtil.getSafeTime() / 86400000L) + -11745;
																										} else if (i_5_ == 6302) {
																											i_1_ -= 3;
																											final int i_147_ = ProducingGraphicsBuffer.anIntArray2801[i_1_];
																											final int i_148_ = ProducingGraphicsBuffer.anIntArray2801[i_1_ - -2];
																											final int i_149_ = ProducingGraphicsBuffer.anIntArray2801[1 + i_1_];
																											Class192.aCalendar2121.clear();
																											Class192.aCalendar2121.set(11, 12);
																											Class192.aCalendar2121.set(i_148_, i_149_, i_147_);
																											ProducingGraphicsBuffer.anIntArray2801[i_1_++] = -11745 + (int) (Class192.aCalendar2121.getTime().getTime() / 86400000L);
																										} else if (i_5_ == 6303) {
																											Class192.aCalendar2121.clear();
																											Class192.aCalendar2121.setTime(new Date(TimeUtil.getSafeTime()));
																											ProducingGraphicsBuffer.anIntArray2801[i_1_++] = Class192.aCalendar2121.get(1);
																										} else {
																											if (i_5_ != 6304) {
																												break;
																											}
																											final int i_150_ = ProducingGraphicsBuffer.anIntArray2801[--i_1_];
																											boolean bool_151_ = true;
																											if (i_150_ >= 0) {
																												if (i_150_ < 1582) {
																													bool_151_ = i_150_ % 4 == 0;
																												} else if (i_150_ % 4 != 0) {
																													bool_151_ = false;
																												} else if (i_150_ % 100 != 0) {
																													bool_151_ = true;
																												} else if (i_150_ % 400 != 0) {
																													bool_151_ = false;
																												}
																											} else {
																												bool_151_ = (1 + i_150_) % 4 == 0;
																											}
																											ProducingGraphicsBuffer.anIntArray2801[i_1_++] = !bool_151_ ? 0 : 1;
																										}
																									} else if (i_5_ < 6500) {
																										if (i_5_ == 6405) {
																											ProducingGraphicsBuffer.anIntArray2801[i_1_++] = Canvas_Sub1.method63(4) ? 1 : 0;
																										} else {
																											if (i_5_ != 6406) {
																												break;
																											}
																											ProducingGraphicsBuffer.anIntArray2801[i_1_++] = !Light.method353(4096) ? 0 : 1;
																										}
																									} else if (i_5_ < 6600) {
																										if (i_5_ == 6500) {
																											if (Class109.gameState != 10 || Class120_Sub14_Sub18.anInt3609 != 0 || Class86.anInt819 != 0 || Class154.anInt1440 != 0) {
																												ProducingGraphicsBuffer.anIntArray2801[i_1_++] = 1;
																											} else {
																												ProducingGraphicsBuffer.anIntArray2801[i_1_++] = (Class96.method788(61) ^ 0xffffffff) != 0 ? 1 : 0;
																											}
																										} else if (i_5_ == 6501) {
																											final Class167_Sub1 class167_sub1 = Class120_Sub14_Sub11.method1511(2);
																											if (class167_sub1 != null) {
																												ProducingGraphicsBuffer.anIntArray2801[i_1_++] = class167_sub1.anInt2838;
																												ProducingGraphicsBuffer.anIntArray2801[i_1_++] = class167_sub1.anInt1614;
																												Class33.aStringArray277[i_3_++] = class167_sub1.aString2834;
																												final Class151 class151 = class167_sub1.method2195(true);
																												ProducingGraphicsBuffer.anIntArray2801[i_1_++] = class151.anInt1418;
																												Class33.aStringArray277[i_3_++] = class151.aString1422;
																												ProducingGraphicsBuffer.anIntArray2801[i_1_++] = class167_sub1.anInt1617;
																											} else {
																												ProducingGraphicsBuffer.anIntArray2801[i_1_++] = -1;
																												ProducingGraphicsBuffer.anIntArray2801[i_1_++] = 0;
																												Class33.aStringArray277[i_3_++] = "";
																												ProducingGraphicsBuffer.anIntArray2801[i_1_++] = 0;
																												Class33.aStringArray277[i_3_++] = "";
																												ProducingGraphicsBuffer.anIntArray2801[i_1_++] = 0;
																											}
																										} else if (i_5_ == 6502) {
																											final Class167_Sub1 class167_sub1 = Class120_Sub12_Sub11.method1254(6);
																											if (class167_sub1 == null) {
																												ProducingGraphicsBuffer.anIntArray2801[i_1_++] = -1;
																												ProducingGraphicsBuffer.anIntArray2801[i_1_++] = 0;
																												Class33.aStringArray277[i_3_++] = "";
																												ProducingGraphicsBuffer.anIntArray2801[i_1_++] = 0;
																												Class33.aStringArray277[i_3_++] = "";
																												ProducingGraphicsBuffer.anIntArray2801[i_1_++] = 0;
																											} else {
																												ProducingGraphicsBuffer.anIntArray2801[i_1_++] = class167_sub1.anInt2838;
																												ProducingGraphicsBuffer.anIntArray2801[i_1_++] = class167_sub1.anInt1614;
																												Class33.aStringArray277[i_3_++] = class167_sub1.aString2834;
																												final Class151 class151 = class167_sub1.method2195(true);
																												ProducingGraphicsBuffer.anIntArray2801[i_1_++] = class151.anInt1418;
																												Class33.aStringArray277[i_3_++] = class151.aString1422;
																												ProducingGraphicsBuffer.anIntArray2801[i_1_++] = class167_sub1.anInt1617;
																											}
																										} else if (i_5_ == 6503) {
																											final int i_152_ = ProducingGraphicsBuffer.anIntArray2801[--i_1_];
																											if (Class109.gameState == 10 && Class120_Sub14_Sub18.anInt3609 == 0 && Class86.anInt819 == 0 && Class154.anInt1440 == 0) {
																												ProducingGraphicsBuffer.anIntArray2801[i_1_++] = Class188.method2483((byte) 87, i_152_) ? 1 : 0;
																											} else {
																												ProducingGraphicsBuffer.anIntArray2801[i_1_++] = 0;
																											}
																										} else if (i_5_ == 6504) {
																											Class120_Sub19.anInt2657 = ProducingGraphicsBuffer.anIntArray2801[--i_1_];
																											Class120_Sub6.savePreferences(NpcType.gameSignlink);
																										} else if (i_5_ == 6505) {
																											ProducingGraphicsBuffer.anIntArray2801[i_1_++] = Class120_Sub19.anInt2657;
																										} else if (i_5_ == 6506) {
																											final int i_153_ = ProducingGraphicsBuffer.anIntArray2801[--i_1_];
																											final Class167_Sub1 class167_sub1 = Class82.method710((byte) -24, i_153_);
																											if (class167_sub1 == null) {
																												ProducingGraphicsBuffer.anIntArray2801[i_1_++] = -1;
																												Class33.aStringArray277[i_3_++] = "";
																												ProducingGraphicsBuffer.anIntArray2801[i_1_++] = 0;
																												Class33.aStringArray277[i_3_++] = "";
																												ProducingGraphicsBuffer.anIntArray2801[i_1_++] = 0;
																											} else {
																												ProducingGraphicsBuffer.anIntArray2801[i_1_++] = class167_sub1.anInt1614;
																												Class33.aStringArray277[i_3_++] = class167_sub1.aString2834;
																												final Class151 class151 = class167_sub1.method2195(true);
																												ProducingGraphicsBuffer.anIntArray2801[i_1_++] = class151.anInt1418;
																												Class33.aStringArray277[i_3_++] = class151.aString1422;
																												ProducingGraphicsBuffer.anIntArray2801[i_1_++] = class167_sub1.anInt1617;
																											}
																										} else {
																											if (i_5_ != 6507) {
																												break;
																											}
																											i_1_ -= 4;
																											final int i_154_ = ProducingGraphicsBuffer.anIntArray2801[i_1_];
																											final boolean bool_155_ = ProducingGraphicsBuffer.anIntArray2801[1 + i_1_] == 1;
																											final int i_156_ = ProducingGraphicsBuffer.anIntArray2801[i_1_ - -2];
																											final boolean bool_157_ = ProducingGraphicsBuffer.anIntArray2801[3 + i_1_] == 1;
																											Class120_Sub12_Sub4.method1211(bool_155_, 80, i_154_, bool_157_, i_156_);
																										}
																									} else if (i_5_ >= 6700) {
																										if (i_5_ >= 6900) {
																											break;
																										}
																										if (i_5_ == 6800) {
																											final int i_158_ = ProducingGraphicsBuffer.anIntArray2801[--i_1_];
																											final Class73 class73 = Class73.list(i_158_);
																											if (class73.aString649 != null) {
																												Class33.aStringArray277[i_3_++] = class73.aString649;
																											} else {
																												Class33.aStringArray277[i_3_++] = "";
																											}
																										} else if (i_5_ == 6801) {
																											final int i_159_ = ProducingGraphicsBuffer.anIntArray2801[--i_1_];
																											final Class73 class73 = Class73.list(i_159_);
																											ProducingGraphicsBuffer.anIntArray2801[i_1_++] = class73.anInt644;
																										} else if (i_5_ == 6802) {
																											final int i_160_ = ProducingGraphicsBuffer.anIntArray2801[--i_1_];
																											final Class73 class73 = Class73.list(i_160_);
																											ProducingGraphicsBuffer.anIntArray2801[i_1_++] = class73.anInt634;
																										} else {
																											if (i_5_ != 6803) {
																												break;
																											}
																											final int i_161_ = ProducingGraphicsBuffer.anIntArray2801[--i_1_];
																											final Class73 class73 = Class73.list(i_161_);
																											ProducingGraphicsBuffer.anIntArray2801[i_1_++] = class73.anInt652;
																										}
																									} else if (i_5_ == 6600) {
																										Class134.aBoolean1277 = ProducingGraphicsBuffer.anIntArray2801[--i_1_] == 1;
																										Class120_Sub6.savePreferences(NpcType.gameSignlink);
																									} else {
																										if (i_5_ != 6601) {
																											break;
																										}
																										ProducingGraphicsBuffer.anIntArray2801[i_1_++] = Class134.aBoolean1277 ? 1 : 0;
																									}
																								} else if (i_5_ == 6200) {
																									i_1_ -= 2;
																									Class169.aShort1651 = (short) ProducingGraphicsBuffer.anIntArray2801[i_1_];
																									if (Class169.aShort1651 <= 0) {
																										Class169.aShort1651 = (short) 256;
																									}
																									Class120_Sub14_Sub13.aShort3570 = (short) ProducingGraphicsBuffer.anIntArray2801[i_1_ - -1];
																									if (Class120_Sub14_Sub13.aShort3570 <= 0) {
																										Class120_Sub14_Sub13.aShort3570 = (short) 205;
																									}
																								} else if (i_5_ == 6201) {
																									i_1_ -= 2;
																									Class120_Sub12_Sub11.aShort3216 = (short) ProducingGraphicsBuffer.anIntArray2801[i_1_];
																									if (Class120_Sub12_Sub11.aShort3216 <= 0) {
																										Class120_Sub12_Sub11.aShort3216 = (short) 256;
																									}
																									Class61.aShort565 = (short) ProducingGraphicsBuffer.anIntArray2801[i_1_ - -1];
																									if (Class61.aShort565 <= 0) {
																										Class61.aShort565 = (short) 320;
																									}
																								} else if (i_5_ == 6202) {
																									i_1_ -= 4;
																									Class120_Sub12_Sub16.aShort3250 = (short) ProducingGraphicsBuffer.anIntArray2801[i_1_];
																									if (Class120_Sub12_Sub16.aShort3250 <= 0) {
																										Class120_Sub12_Sub16.aShort3250 = (short) 1;
																									}
																									Class120_Sub14_Sub14_Sub1.aShort3932 = (short) ProducingGraphicsBuffer.anIntArray2801[1 + i_1_];
																									if (Class120_Sub14_Sub14_Sub1.aShort3932 > 0) {
																										if (Class120_Sub12_Sub16.aShort3250 > Class120_Sub14_Sub14_Sub1.aShort3932) {
																											Class120_Sub14_Sub14_Sub1.aShort3932 = Class120_Sub12_Sub16.aShort3250;
																										}
																									} else {
																										Class120_Sub14_Sub14_Sub1.aShort3932 = (short) 32767;
																									}
																									RuntimeException_Sub1.aShort2143 = (short) ProducingGraphicsBuffer.anIntArray2801[i_1_ + 2];
																									if (RuntimeException_Sub1.aShort2143 <= 0) {
																										RuntimeException_Sub1.aShort2143 = (short) 1;
																									}
																									GameShell.aShort2 = (short) ProducingGraphicsBuffer.anIntArray2801[i_1_ + 3];
																									if (GameShell.aShort2 > 0) {
																										if (RuntimeException_Sub1.aShort2143 > GameShell.aShort2) {
																											GameShell.aShort2 = RuntimeException_Sub1.aShort2143;
																										}
																									} else {
																										GameShell.aShort2 = (short) 32767;
																									}
																								} else if (i_5_ == 6203) {
																									Class154.method2079(0, false, false, InputStream_Sub1.aClass189_26.anInt2059, 0, InputStream_Sub1.aClass189_26.anInt1948);
																									ProducingGraphicsBuffer.anIntArray2801[i_1_++] = Class120_Sub12_Sub27.anInt3339;
																									ProducingGraphicsBuffer.anIntArray2801[i_1_++] = Light.anInt391;
																								} else if (i_5_ == 6204) {
																									ProducingGraphicsBuffer.anIntArray2801[i_1_++] = Class120_Sub12_Sub11.aShort3216;
																									ProducingGraphicsBuffer.anIntArray2801[i_1_++] = Class61.aShort565;
																								} else {
																									if (i_5_ != 6205) {
																										break;
																									}
																									ProducingGraphicsBuffer.anIntArray2801[i_1_++] = Class169.aShort1651;
																									ProducingGraphicsBuffer.anIntArray2801[i_1_++] = Class120_Sub14_Sub13.aShort3570;
																								}
																							} else if (i_5_ == 5500) {
																								i_1_ -= 4;
																								final int i_162_ = ProducingGraphicsBuffer.anIntArray2801[i_1_];
																								final int i_163_ = ProducingGraphicsBuffer.anIntArray2801[1 + i_1_];
																								final int i_164_ = ProducingGraphicsBuffer.anIntArray2801[2 + i_1_];
																								final int i_165_ = ProducingGraphicsBuffer.anIntArray2801[i_1_ - -3];
																								Class120_Sub14_Sub23.method1639(i_164_, -GameEntity.currentBaseX + ((i_162_ & 0xffffb19) >> 14), i_165_, i_163_, false, 0, (i_162_ & 0x3fff) + -Class181.currentBaseZ);
																							} else if (i_5_ == 5501) {
																								i_1_ -= 4;
																								final int i_166_ = ProducingGraphicsBuffer.anIntArray2801[i_1_];
																								final int i_167_ = ProducingGraphicsBuffer.anIntArray2801[1 + i_1_];
																								final int i_168_ = ProducingGraphicsBuffer.anIntArray2801[2 + i_1_];
																								final int i_169_ = ProducingGraphicsBuffer.anIntArray2801[3 + i_1_];
																								Class120_Sub12_Sub16.method1278(26379, i_167_, i_168_, ((i_166_ & 0xffff699) >> 14) - GameEntity.currentBaseX, -Class181.currentBaseZ + (0x3fff & i_166_), i_169_);
																							} else if (i_5_ == 5502) {
																								i_1_ -= 6;
																								final int i_170_ = ProducingGraphicsBuffer.anIntArray2801[i_1_];
																								if (i_170_ >= 2) {
																									throw new RuntimeException();
																								}
																								AbstractGraphicsBuffer.anInt1157 = i_170_;
																								final int i_171_ = ProducingGraphicsBuffer.anIntArray2801[1 + i_1_];
																								if (Class143_Sub1.anIntArrayArrayArray2195[AbstractGraphicsBuffer.anInt1157].length >> 1 <= 1 + i_171_) {
																									throw new RuntimeException();
																								}
																								Class32.anInt272 = 0;
																								PlayerAppearance.anInt1372 = i_171_;
																								JagexInterface.anInt2053 = ProducingGraphicsBuffer.anIntArray2801[i_1_ - -2];
																								Class120_Sub12_Sub6.anInt3176 = ProducingGraphicsBuffer.anIntArray2801[i_1_ - -3];
																								final int i_172_ = ProducingGraphicsBuffer.anIntArray2801[4 + i_1_];
																								if (i_172_ >= 2) {
																									throw new RuntimeException();
																								}
																								Class120_Sub12_Sub15.anInt3248 = i_172_;
																								final int i_173_ = ProducingGraphicsBuffer.anIntArray2801[i_1_ + 5];
																								if (Class143_Sub1.anIntArrayArrayArray2195[Class120_Sub12_Sub15.anInt3248].length >> 1 <= 1 + i_173_) {
																									throw new RuntimeException();
																								}
																								client.cameraType = 3;
																								Class9.anInt67 = i_173_;
																							} else if (i_5_ == 5503) {
																								SpotAnimType.method876((byte) 103);
																							} else if (i_5_ == 5504) {
																								i_1_ -= 2;
																								Class120_Sub8.method1158(ProducingGraphicsBuffer.anIntArray2801[i_1_], (byte) 125, ProducingGraphicsBuffer.anIntArray2801[1 + i_1_]);
																							} else if (i_5_ == 5505) {
																								ProducingGraphicsBuffer.anIntArray2801[i_1_++] = (int) Class120_Sub12_Sub21.aFloat3293;
																							} else if (i_5_ == 5506) {
																								ProducingGraphicsBuffer.anIntArray2801[i_1_++] = (int) OutputStream_Sub1.aFloat28;
																							} else if (i_5_ == 5507) {
																								Class86.method727();
																							} else if (i_5_ == 5508) {
																								MouseHandler.method1028();
																							} else if (i_5_ == 5509) {
																								Class81.method707();
																							} else if (i_5_ == 5510) {
																								Class164.method2142();
																							} else {
																								if (i_5_ != 5512) {
																									break;
																								}
																								Class3.smoothCamera();
																							}
																						} else if (i_5_ == 5400) {
																							i_3_ -= 2;
																							final String string = Class33.aStringArray277[1 + i_3_];
																							final int i_174_ = ProducingGraphicsBuffer.anIntArray2801[--i_1_];
																							final String string_175_ = Class33.aStringArray277[i_3_];
																							Class120_Sub12_Sub11.outputStream.putByteIsaac(243);
																							Class120_Sub12_Sub11.outputStream.putByte(1 + Class69_Sub2_Sub1.method620(string_175_) + Class69_Sub2_Sub1.method620(string));
																							Class120_Sub12_Sub11.outputStream.putJString(string_175_);
																							Class120_Sub12_Sub11.outputStream.putJString(string);
																							Class120_Sub12_Sub11.outputStream.putByte(i_174_);
																						} else if (i_5_ == 5401) {
																							i_1_ -= 2;
																							Class120_Sub14_Sub22.aShortArray3639[ProducingGraphicsBuffer.anIntArray2801[i_1_]] = (short) InterfaceClickMask.method1688(122, ProducingGraphicsBuffer.anIntArray2801[i_1_ + 1]);
																							Class79_Sub1.method695();
																							Class10.method122();
																							Class69_Sub3.method625(114);
																							Class38.method316(2883872);
																							Class132_Sub1.method1931();
																						} else if (i_5_ == 5405) {
																							i_1_ -= 2;
																							final int i_176_ = ProducingGraphicsBuffer.anIntArray2801[i_1_];
																							final int i_177_ = ProducingGraphicsBuffer.anIntArray2801[1 + i_1_];
																							if (i_176_ >= 0 && i_176_ < 2) {
																								Class143_Sub1.anIntArrayArrayArray2195[i_176_] = new int[i_177_ << 1][4];
																							}
																						} else if (i_5_ == 5406) {
																							i_1_ -= 7;
																							final int i_178_ = ProducingGraphicsBuffer.anIntArray2801[i_1_ + 1] << 1;
																							final int i_179_ = ProducingGraphicsBuffer.anIntArray2801[i_1_];
																							final int i_180_ = ProducingGraphicsBuffer.anIntArray2801[i_1_ - -3];
																							final int i_181_ = ProducingGraphicsBuffer.anIntArray2801[2 + i_1_];
																							final int i_182_ = ProducingGraphicsBuffer.anIntArray2801[i_1_ + 4];
																							final int i_183_ = ProducingGraphicsBuffer.anIntArray2801[5 + i_1_];
																							final int i_184_ = ProducingGraphicsBuffer.anIntArray2801[i_1_ + 6];
																							if (i_179_ >= 0 && i_179_ < 2 && Class143_Sub1.anIntArrayArrayArray2195[i_179_] != null && i_178_ >= 0 && Class143_Sub1.anIntArrayArrayArray2195[i_179_].length > i_178_) {
																								Class143_Sub1.anIntArrayArrayArray2195[i_179_][i_178_] = new int[] { 128 * Class120_Sub12_Sub3.method1207(i_181_ >> 14, 16383), i_180_, 128 * Class120_Sub12_Sub3.method1207(16383, i_181_), i_184_ };
																								Class143_Sub1.anIntArrayArrayArray2195[i_179_][1 + i_178_] = new int[] { 128 * (Class120_Sub12_Sub3.method1207(i_182_, 268421244) >> 14), i_183_, Class120_Sub12_Sub3.method1207(16383, i_182_) * 128 };
																							}
																						} else if (i_5_ == 5407) {
																							final int i_185_ = Class143_Sub1.anIntArrayArrayArray2195[ProducingGraphicsBuffer.anIntArray2801[--i_1_]].length >> 1;
																							ProducingGraphicsBuffer.anIntArray2801[i_1_++] = i_185_;
																						} else if (i_5_ == 5411) {
																							if (Class120_Sub14_Sub10.fullscreenFrame != null) {
																								AbstractSprite.method1593(false, Class120_Sub12_Sub19.currentDisplayMode, -1, -1);
																							}
																							if (Class112.frame != null) {
																								System.exit(0);
																							} else {
																								Class188.method2482(Class181.method2439((byte) 104), false);
																							}
																						} else if (i_5_ == 5419) {
																							String string = "";
																							if (Class120_Sub1.aClass185_2403 != null) {
																								if (Class120_Sub1.aClass185_2403.value != null) {
																									string = (String) Class120_Sub1.aClass185_2403.value;
																								} else {
																									string = Class125.method1879((byte) 39, Class120_Sub1.aClass185_2403.integerData);
																								}
																							}
																							Class33.aStringArray277[i_3_++] = string;
																						} else if (i_5_ == 5420) {
																							ProducingGraphicsBuffer.anIntArray2801[i_1_++] = Signlink.anInt1310 == 3 ? 1 : 0;
																						} else if (i_5_ == 5421) {
																							if (Class120_Sub14_Sub10.fullscreenFrame != null) {
																								AbstractSprite.method1593(false, Class120_Sub12_Sub19.currentDisplayMode, -1, -1);
																							}
																							final String string = Class33.aStringArray277[--i_3_];
																							final boolean bool_186_ = ProducingGraphicsBuffer.anIntArray2801[--i_1_] == 1;
																							final String string_187_ = new StringBuilder(Class181.method2439((byte) 104)).append(string).toString();
																							if (Class112.frame == null && (!bool_186_ || Signlink.anInt1310 == 3 || !Signlink.osName.startsWith("win") || FileSystem.haveInternetExplorer6)) {
																								Class188.method2482(string_187_, bool_186_);
																							} else {
																								Class151.aString1421 = string_187_;
																								Class99.aBoolean950 = bool_186_;
																								Class3.aClass185_56 = NpcType.gameSignlink.method1953(string_187_, (byte) -88);
																							}
																						} else if (i_5_ == 5422) {
																							i_3_ -= 2;
																							final String string = Class33.aStringArray277[i_3_];
																							final String string_188_ = Class33.aStringArray277[i_3_ + 1];
																							final int i_189_ = ProducingGraphicsBuffer.anIntArray2801[--i_1_];
																							if (string.length() > 0) {
																								if (Class182.prefixTitles == null) {
																									Class182.prefixTitles = new String[Node.anIntArray1151[Buffer.gameId]];
																								}
																								Class182.prefixTitles[i_189_] = string;
																							}
																							if (string_188_.length() > 0) {
																								if (Class53.suffixTitles == null) {
																									Class53.suffixTitles = new String[Node.anIntArray1151[Buffer.gameId]];
																								}
																								Class53.suffixTitles[i_189_] = string_188_;
																							}
																						} else if (i_5_ == 5423) {
																							System.out.println(Class33.aStringArray277[--i_3_]);
																						} else if (i_5_ == 5424) {
																							i_1_ -= 11;
																							Class140.anInt1345 = ProducingGraphicsBuffer.anIntArray2801[i_1_];
																							Class89.anInt837 = ProducingGraphicsBuffer.anIntArray2801[1 + i_1_];
																							Class120_Sub12_Sub3.anInt3147 = ProducingGraphicsBuffer.anIntArray2801[2 + i_1_];
																							Class88.anInt832 = ProducingGraphicsBuffer.anIntArray2801[i_1_ + 3];
																							client.anInt2199 = ProducingGraphicsBuffer.anIntArray2801[i_1_ + 4];
																							Class114.anInt1099 = ProducingGraphicsBuffer.anIntArray2801[i_1_ + 5];
																							Class24.anInt146 = ProducingGraphicsBuffer.anIntArray2801[i_1_ + 6];
																							Class92.anInt864 = ProducingGraphicsBuffer.anIntArray2801[i_1_ + 7];
																							Class31.anInt240 = ProducingGraphicsBuffer.anIntArray2801[i_1_ + 8];
																							Class120_Sub12_Sub3.anInt3151 = ProducingGraphicsBuffer.anIntArray2801[i_1_ + 9];
																							Class120_Sub12_Sub13.anInt3233 = ProducingGraphicsBuffer.anIntArray2801[i_1_ + 10];
																							Class7.aClass50_63.method429(client.anInt2199);
																							Class7.aClass50_63.method429(Class114.anInt1099);
																							Class7.aClass50_63.method429(Class24.anInt146);
																							Class7.aClass50_63.method429(Class92.anInt864);
																							Class7.aClass50_63.method429(Class31.anInt240);
																							Class186.aBoolean1899 = true;
																						} else if (i_5_ == 5425) {
																							LocType.method2450();
																							Class186.aBoolean1899 = false;
																						} else if (i_5_ == 5426) {
																							Class107.defaultCursorId = ProducingGraphicsBuffer.anIntArray2801[--i_1_];
																						} else if (i_5_ == 5427) {
																							i_1_ -= 2;
																							Class120_Sub12_Sub10.anInt3205 = ProducingGraphicsBuffer.anIntArray2801[i_1_];
																							Class120_Sub12_Sub11.anInt3211 = ProducingGraphicsBuffer.anIntArray2801[i_1_ - -1];
																						} else {
																							if (i_5_ != 5428) {
																								break;
																							}
																							i_1_ -= 2;
																							final int i_190_ = ProducingGraphicsBuffer.anIntArray2801[i_1_ - -1];
																							final int i_191_ = ProducingGraphicsBuffer.anIntArray2801[i_1_];
																							ProducingGraphicsBuffer.anIntArray2801[i_1_++] = !Player.method2345(i_191_, i_190_, (byte) 117) ? 0 : 1;
																						}
																					} else if (i_5_ == 5200) {
																						Class120_Sub14_Sub12.method1522(ProducingGraphicsBuffer.anIntArray2801[--i_1_], i_0_ + -1006220826);
																					} else if (i_5_ == 5201) {
																						ProducingGraphicsBuffer.anIntArray2801[i_1_++] = Class120_Sub14_Sub11.method1517((byte) -120);
																					} else if (i_5_ == 5205) {
																						Class108.method932(false, -1, -1, ProducingGraphicsBuffer.anIntArray2801[--i_1_], 27712);
																					} else if (i_5_ == 5206) {
																						final int i_192_ = ProducingGraphicsBuffer.anIntArray2801[--i_1_];
																						final Class120_Sub14_Sub22 class120_sub14_sub22 = Class79.method676((i_192_ & 0xfffc4e5) >> 14, 0x3fff & i_192_);
																						if (class120_sub14_sub22 == null) {
																							ProducingGraphicsBuffer.anIntArray2801[i_1_++] = -1;
																						} else {
																							ProducingGraphicsBuffer.anIntArray2801[i_1_++] = class120_sub14_sub22.anInt3634;
																						}
																					} else if (i_5_ == 5207) {
																						final Class120_Sub14_Sub22 class120_sub14_sub22 = Class79.method687(ProducingGraphicsBuffer.anIntArray2801[--i_1_]);
																						if (class120_sub14_sub22 == null || class120_sub14_sub22.aString3647 == null) {
																							Class33.aStringArray277[i_3_++] = "";
																						} else {
																							Class33.aStringArray277[i_3_++] = class120_sub14_sub22.aString3647;
																						}
																					} else if (i_5_ == 5208) {
																						ProducingGraphicsBuffer.anIntArray2801[i_1_++] = Class173.anInt1726;
																						ProducingGraphicsBuffer.anIntArray2801[i_1_++] = GroundObjectNode.anInt3628;
																					} else if (i_5_ == 5209) {
																						ProducingGraphicsBuffer.anIntArray2801[i_1_++] = Class108_Sub1.anInt2336 - -Class79.anInt695;
																						ProducingGraphicsBuffer.anIntArray2801[i_1_++] = Class79.anInt694 + -Class169.anInt1646 + -1 + Class79.anInt692;
																					} else if (i_5_ == 5210) {
																						final int i_193_ = ProducingGraphicsBuffer.anIntArray2801[--i_1_];
																						final Class120_Sub14_Sub22 class120_sub14_sub22 = Class79.method687(i_193_);
																						if (class120_sub14_sub22 != null) {
																							ProducingGraphicsBuffer.anIntArray2801[i_1_++] = Class120_Sub12_Sub3.method1207(class120_sub14_sub22.anInt3633 >> 14, 16383);
																							ProducingGraphicsBuffer.anIntArray2801[i_1_++] = Class120_Sub12_Sub3.method1207(class120_sub14_sub22.anInt3633, 16383);
																						} else {
																							ProducingGraphicsBuffer.anIntArray2801[i_1_++] = 0;
																							ProducingGraphicsBuffer.anIntArray2801[i_1_++] = 0;
																						}
																					} else if (i_5_ == 5211) {
																						final int i_194_ = ProducingGraphicsBuffer.anIntArray2801[--i_1_];
																						final Class120_Sub14_Sub22 class120_sub14_sub22 = Class79.method687(i_194_);
																						if (class120_sub14_sub22 != null) {
																							ProducingGraphicsBuffer.anIntArray2801[i_1_++] = class120_sub14_sub22.anInt3642 - class120_sub14_sub22.anInt3632;
																							ProducingGraphicsBuffer.anIntArray2801[i_1_++] = class120_sub14_sub22.anInt3644 + -class120_sub14_sub22.anInt3636;
																						} else {
																							ProducingGraphicsBuffer.anIntArray2801[i_1_++] = 0;
																							ProducingGraphicsBuffer.anIntArray2801[i_1_++] = 0;
																						}
																					} else if (i_5_ == 5212) {
																						final Class120_Sub14_Sub5 class120_sub14_sub5 = Class120_Sub12_Sub3.method1206((byte) 113);
																						if (class120_sub14_sub5 == null) {
																							ProducingGraphicsBuffer.anIntArray2801[i_1_++] = -1;
																							ProducingGraphicsBuffer.anIntArray2801[i_1_++] = -1;
																						} else {
																							ProducingGraphicsBuffer.anIntArray2801[i_1_++] = class120_sub14_sub5.anInt3473;
																							final int i_195_ = Class79.anInt695 + class120_sub14_sub5.anInt3480 << 14 | class120_sub14_sub5.anInt3474 << 28 | Class79.anInt694 + Class79.anInt692 + -1 + -class120_sub14_sub5.anInt3481;
																							ProducingGraphicsBuffer.anIntArray2801[i_1_++] = i_195_;
																						}
																					} else if (i_5_ == 5213) {
																						final Class120_Sub14_Sub5 class120_sub14_sub5 = Class112.method992(2048);
																						if (class120_sub14_sub5 != null) {
																							ProducingGraphicsBuffer.anIntArray2801[i_1_++] = class120_sub14_sub5.anInt3473;
																							final int i_196_ = -1 + Class79.anInt692 + Class79.anInt694 + -class120_sub14_sub5.anInt3481 | class120_sub14_sub5.anInt3474 << 28 | class120_sub14_sub5.anInt3480 - -Class79.anInt695 << 14;
																							ProducingGraphicsBuffer.anIntArray2801[i_1_++] = i_196_;
																						} else {
																							ProducingGraphicsBuffer.anIntArray2801[i_1_++] = -1;
																							ProducingGraphicsBuffer.anIntArray2801[i_1_++] = -1;
																						}
																					} else if (i_5_ == 5214) {
																						final int i_197_ = ProducingGraphicsBuffer.anIntArray2801[--i_1_];
																						final Class120_Sub14_Sub22 class120_sub14_sub22 = Class108_Sub1.method938(257238413);
																						if (class120_sub14_sub22 != null) {
																							final boolean bool_198_ = class120_sub14_sub22.method1630(0x3fff & i_197_, -1, i_197_ >> 28 & 0x3, anIntArray2832, i_197_ >> 14 & 0x3fff);
																							if (bool_198_) {
																								Class83.a(anIntArray2832[1], (byte) 82, anIntArray2832[2]);
																							}
																						}
																					} else if (i_5_ == 5215) {
																						i_1_ -= 2;
																						final int i_199_ = ProducingGraphicsBuffer.anIntArray2801[i_1_ + 1];
																						final int i_200_ = ProducingGraphicsBuffer.anIntArray2801[i_1_];
																						final Queue queue = Class79.method677(0x3fff & i_200_ >> 14, i_200_ & 0x3fff);
																						boolean bool_201_ = false;
																						for (Class120_Sub14_Sub22 class120_sub14_sub22 = (Class120_Sub14_Sub22) queue.peekFirst(); class120_sub14_sub22 != null; class120_sub14_sub22 = (Class120_Sub14_Sub22) queue.peekNext()) {
																							if (class120_sub14_sub22.anInt3634 == i_199_) {
																								bool_201_ = true;
																								break;
																							}
																						}
																						if (!bool_201_) {
																							ProducingGraphicsBuffer.anIntArray2801[i_1_++] = 0;
																						} else {
																							ProducingGraphicsBuffer.anIntArray2801[i_1_++] = 1;
																						}
																					} else if (i_5_ == 5218) {
																						final int i_202_ = ProducingGraphicsBuffer.anIntArray2801[--i_1_];
																						final Class120_Sub14_Sub22 class120_sub14_sub22 = Class79.method687(i_202_);
																						if (class120_sub14_sub22 == null) {
																							ProducingGraphicsBuffer.anIntArray2801[i_1_++] = -1;
																						} else {
																							ProducingGraphicsBuffer.anIntArray2801[i_1_++] = class120_sub14_sub22.anInt3643;
																						}
																					} else if (i_5_ == 5220) {
																						ProducingGraphicsBuffer.anIntArray2801[i_1_++] = Class90.anInt848 != 100 ? 0 : 1;
																					} else if (i_5_ == 5221) {
																						final int i_203_ = ProducingGraphicsBuffer.anIntArray2801[--i_1_];
																						Class83.a((i_203_ & 0xfffc9be) >> 14, (byte) -121, 0x3fff & i_203_);
																					} else if (i_5_ == 5222) {
																						final Class120_Sub14_Sub22 class120_sub14_sub22 = Class108_Sub1.method938(257238413);
																						if (class120_sub14_sub22 == null) {
																							ProducingGraphicsBuffer.anIntArray2801[i_1_++] = -1;
																							ProducingGraphicsBuffer.anIntArray2801[i_1_++] = -1;
																						} else {
																							final boolean bool_204_ = class120_sub14_sub22.method1635(Class79.anInt695 + Class108_Sub1.anInt2336, Class79.anInt692 - (1 + Class169.anInt1646 + -Class79.anInt694), (byte) -125, anIntArray2832);
																							if (!bool_204_) {
																								ProducingGraphicsBuffer.anIntArray2801[i_1_++] = -1;
																								ProducingGraphicsBuffer.anIntArray2801[i_1_++] = -1;
																							} else {
																								ProducingGraphicsBuffer.anIntArray2801[i_1_++] = anIntArray2832[1];
																								ProducingGraphicsBuffer.anIntArray2801[i_1_++] = anIntArray2832[2];
																							}
																						}
																					} else if (i_5_ == 5223) {
																						i_1_ -= 2;
																						final int i_205_ = ProducingGraphicsBuffer.anIntArray2801[1 + i_1_];
																						final int i_206_ = ProducingGraphicsBuffer.anIntArray2801[i_1_];
																						Class108.method932(false, i_205_ & 0x3fff, i_205_ >> 14 & 0x3fff, i_206_, i_0_ + -1006171676);
																					} else if (i_5_ == 5224) {
																						final int i_207_ = ProducingGraphicsBuffer.anIntArray2801[--i_1_];
																						final Class120_Sub14_Sub22 class120_sub14_sub22 = Class108_Sub1.method938(i_0_ ^ 0x34ac47d1);
																						if (class120_sub14_sub22 == null) {
																							ProducingGraphicsBuffer.anIntArray2801[i_1_++] = -1;
																							ProducingGraphicsBuffer.anIntArray2801[i_1_++] = -1;
																						} else {
																							final boolean bool_208_ = class120_sub14_sub22.method1630(0x3fff & i_207_, -1, i_207_ >> 28 & 0x3, anIntArray2832, i_207_ >> 14 & 0x3fff);
																							if (bool_208_) {
																								ProducingGraphicsBuffer.anIntArray2801[i_1_++] = anIntArray2832[1];
																								ProducingGraphicsBuffer.anIntArray2801[i_1_++] = anIntArray2832[2];
																							} else {
																								ProducingGraphicsBuffer.anIntArray2801[i_1_++] = -1;
																								ProducingGraphicsBuffer.anIntArray2801[i_1_++] = -1;
																							}
																						}
																					} else if (i_5_ == 5225) {
																						final int i_209_ = ProducingGraphicsBuffer.anIntArray2801[--i_1_];
																						final Class120_Sub14_Sub22 class120_sub14_sub22 = Class108_Sub1.method938(257238413);
																						if (class120_sub14_sub22 != null) {
																							final boolean bool_210_ = class120_sub14_sub22.method1635((i_209_ & 0xfffdf1a) >> 14, i_209_ & 0x3fff, (byte) -128, anIntArray2832);
																							if (bool_210_) {
																								ProducingGraphicsBuffer.anIntArray2801[i_1_++] = anIntArray2832[1];
																								ProducingGraphicsBuffer.anIntArray2801[i_1_++] = anIntArray2832[2];
																							} else {
																								ProducingGraphicsBuffer.anIntArray2801[i_1_++] = -1;
																								ProducingGraphicsBuffer.anIntArray2801[i_1_++] = -1;
																							}
																						} else {
																							ProducingGraphicsBuffer.anIntArray2801[i_1_++] = -1;
																							ProducingGraphicsBuffer.anIntArray2801[i_1_++] = -1;
																						}
																					} else if (i_5_ == 5226) {
																						Class151.method2066((byte) -121, ProducingGraphicsBuffer.anIntArray2801[--i_1_]);
																					} else if (i_5_ == 5227) {
																						i_1_ -= 2;
																						final int i_211_ = ProducingGraphicsBuffer.anIntArray2801[i_1_];
																						final int i_212_ = ProducingGraphicsBuffer.anIntArray2801[i_1_ - -1];
																						Class108.method932(true, 0x3fff & i_212_, 0x3fff & i_212_ >> 14, i_211_, i_0_ + -1006171676);
																					} else if (i_5_ == 5228) {
																						Class120_Sub12_Sub27.aBoolean3348 = ProducingGraphicsBuffer.anIntArray2801[--i_1_] == 1;
																					} else if (i_5_ == 5229) {
																						ProducingGraphicsBuffer.anIntArray2801[i_1_++] = Class120_Sub12_Sub27.aBoolean3348 ? 1 : 0;
																					} else if (i_5_ == 5230) {
																						final int i_213_ = ProducingGraphicsBuffer.anIntArray2801[--i_1_];
																						PacketBuffer.method1143(i_213_, (byte) -113);
																					} else if (i_5_ == 5231) {
																						i_1_ -= 2;
																						final int i_214_ = ProducingGraphicsBuffer.anIntArray2801[i_1_];
																						final boolean bool_215_ = ProducingGraphicsBuffer.anIntArray2801[i_1_ + 1] == 1;
																						if (Class81.aClass75_777 != null) {
																							Node node = Class81.aClass75_777.get(i_214_);
																							if (node == null || bool_215_) {
																								if (node == null && bool_215_) {
																									node = new Node();
																									Class81.aClass75_777.put(node, i_214_);
																								}
																							} else {
																								node.unlink();
																							}
																						}
																					} else if (i_5_ == 5232) {
																						final int i_216_ = ProducingGraphicsBuffer.anIntArray2801[--i_1_];
																						if (Class81.aClass75_777 == null) {
																							ProducingGraphicsBuffer.anIntArray2801[i_1_++] = 0;
																						} else {
																							final Node node = Class81.aClass75_777.get(i_216_);
																							ProducingGraphicsBuffer.anIntArray2801[i_1_++] = node != null ? 1 : 0;
																						}
																					} else if (i_5_ == 5233) {
																						i_1_ -= 2;
																						final int i_217_ = ProducingGraphicsBuffer.anIntArray2801[i_1_];
																						final boolean bool_218_ = ProducingGraphicsBuffer.anIntArray2801[i_1_ + 1] == 1;
																						if (Class86.aClass75_823 != null) {
																							Node node = Class86.aClass75_823.get(i_217_);
																							if (node == null || bool_218_) {
																								if (node == null && bool_218_) {
																									node = new Node();
																									Class86.aClass75_823.put(node, i_217_);
																								}
																							} else {
																								node.unlink();
																							}
																						}
																					} else if (i_5_ == 5234) {
																						final int i_219_ = ProducingGraphicsBuffer.anIntArray2801[--i_1_];
																						if (Class86.aClass75_823 == null) {
																							ProducingGraphicsBuffer.anIntArray2801[i_1_++] = 0;
																						} else {
																							final Node node = Class86.aClass75_823.get(i_219_);
																							ProducingGraphicsBuffer.anIntArray2801[i_1_++] = node != null ? 1 : 0;
																						}
																					} else {
																						if (i_5_ != 5235) {
																							break;
																						}
																						ProducingGraphicsBuffer.anIntArray2801[i_1_++] = Class79.aClass120_Sub14_Sub22_691 == null ? -1 : Class79.aClass120_Sub14_Sub22_691.anInt3634;
																					}
																				} else {
																					if (i_5_ != 4500) {
																						break;
																					}
																					i_1_ -= 2;
																					final int i_220_ = ProducingGraphicsBuffer.anIntArray2801[i_1_];
																					final int i_221_ = ProducingGraphicsBuffer.anIntArray2801[i_1_ + 1];
																					final Class120_Sub14_Sub11 class120_sub14_sub11 = Class120_Sub14_Sub11.list(i_221_);
																					if (class120_sub14_sub11.method1515(-121)) {
																						Class33.aStringArray277[i_3_++] = Class120_Sub12_Sub21.method1305(i_0_ + -1006195308, i_220_).method1568(class120_sub14_sub11.aString3539, i_221_, (byte) -113);
																					} else {
																						ProducingGraphicsBuffer.anIntArray2801[i_1_++] = Class120_Sub12_Sub21.method1305(Class120_Sub12_Sub38.method1397(i_0_, 1006202284), i_220_).method1564(class120_sub14_sub11.anInt3542, i_221_,
																								Class120_Sub12_Sub38.method1397(i_0_, -1006182499));
																					}
																				}
																			} else {
																				if (i_5_ != 4400) {
																					break;
																				}
																				i_1_ -= 2;
																				final int i_222_ = ProducingGraphicsBuffer.anIntArray2801[i_1_];
																				final int i_223_ = ProducingGraphicsBuffer.anIntArray2801[1 + i_1_];
																				final Class120_Sub14_Sub11 class120_sub14_sub11 = Class120_Sub14_Sub11.list(i_223_);
																				if (class120_sub14_sub11.method1515(121)) {
																					Class33.aStringArray277[i_3_++] = LocType.list(i_222_).method2470(class120_sub14_sub11.aString3539, i_223_, -108);
																				} else {
																					ProducingGraphicsBuffer.anIntArray2801[i_1_++] = LocType.list(i_222_).method2454((byte) 75, class120_sub14_sub11.anInt3542, i_223_);
																				}
																			}
																		} else if (i_5_ == 4200) {
																			final int i_224_ = ProducingGraphicsBuffer.anIntArray2801[--i_1_];
																			Class33.aStringArray277[i_3_++] = ObjType.list(i_224_).name;
																		} else if (i_5_ == 4201) {
																			i_1_ -= 2;
																			final int i_225_ = ProducingGraphicsBuffer.anIntArray2801[1 + i_1_];
																			final int i_226_ = ProducingGraphicsBuffer.anIntArray2801[i_1_];
																			final ObjType objType = ObjType.list(i_226_);
																			if (i_225_ < 1 || i_225_ > 5 || objType.options[i_225_ - 1] == null) {
																				Class33.aStringArray277[i_3_++] = "";
																			} else {
																				Class33.aStringArray277[i_3_++] = objType.options[i_225_ - 1];
																			}
																		} else if (i_5_ == 4202) {
																			i_1_ -= 2;
																			final int i_227_ = ProducingGraphicsBuffer.anIntArray2801[i_1_];
																			final int i_228_ = ProducingGraphicsBuffer.anIntArray2801[1 + i_1_];
																			final ObjType objType = ObjType.list(i_227_);
																			if (i_228_ < 1 || i_228_ > 5 || objType.inventoryOptions[-1 + i_228_] == null) {
																				Class33.aStringArray277[i_3_++] = "";
																			} else {
																				Class33.aStringArray277[i_3_++] = objType.inventoryOptions[i_228_ + -1];
																			}
																		} else if (i_5_ == 4203) {
																			final int i_229_ = ProducingGraphicsBuffer.anIntArray2801[--i_1_];
																			ProducingGraphicsBuffer.anIntArray2801[i_1_++] = ObjType.list(i_229_).cost;
																		} else if (i_5_ == 4204) {
																			final int i_230_ = ProducingGraphicsBuffer.anIntArray2801[--i_1_];
																			ProducingGraphicsBuffer.anIntArray2801[i_1_++] = ObjType.list(i_230_).stackable == 1 ? 1 : 0;
																		} else if (i_5_ == 4205) {
																			final int i_231_ = ProducingGraphicsBuffer.anIntArray2801[--i_1_];
																			final ObjType objType = ObjType.list(i_231_);
																			if (objType.certtemplate != -1 || objType.certlink < 0) {
																				ProducingGraphicsBuffer.anIntArray2801[i_1_++] = i_231_;
																			} else {
																				ProducingGraphicsBuffer.anIntArray2801[i_1_++] = objType.certlink;
																			}
																		} else if (i_5_ == 4206) {
																			final int i_232_ = ProducingGraphicsBuffer.anIntArray2801[--i_1_];
																			final ObjType objType = ObjType.list(i_232_);
																			if (objType.certtemplate >= 0 && objType.certlink >= 0) {
																				ProducingGraphicsBuffer.anIntArray2801[i_1_++] = objType.certlink;
																			} else {
																				ProducingGraphicsBuffer.anIntArray2801[i_1_++] = i_232_;
																			}
																		} else if (i_5_ == 4207) {
																			final int i_233_ = ProducingGraphicsBuffer.anIntArray2801[--i_1_];
																			ProducingGraphicsBuffer.anIntArray2801[i_1_++] = ObjType.list(i_233_).members ? 1 : 0;
																		} else if (i_5_ == 4208) {
																			i_1_ -= 2;
																			final int i_234_ = ProducingGraphicsBuffer.anIntArray2801[i_1_ + 1];
																			final int i_235_ = ProducingGraphicsBuffer.anIntArray2801[i_1_];
																			final Class120_Sub14_Sub11 class120_sub14_sub11 = Class120_Sub14_Sub11.list(i_234_);
																			if (class120_sub14_sub11.method1515(-112)) {
																				Class33.aStringArray277[i_3_++] = ObjType.list(i_235_).getStringParam(class120_sub14_sub11.aString3539, i_234_);
																			} else {
																				ProducingGraphicsBuffer.anIntArray2801[i_1_++] = ObjType.list(i_235_).getIntegerParam(class120_sub14_sub11.anInt3542, i_234_);
																			}
																		} else if (i_5_ == 4210) {
																			final String string = Class33.aStringArray277[--i_3_];
																			final int i_236_ = ProducingGraphicsBuffer.anIntArray2801[--i_1_];
																			Class120_Sub12_Sub25.method1333(string, i_236_ == 1);
																			ProducingGraphicsBuffer.anIntArray2801[i_1_++] = Buffer.anInt2474;
																		} else if (i_5_ == 4211) {
																			if (Class120_Sub12_Sub37.aShortArray3430 == null || Buffer.anInt2474 <= Class108.anInt1035) {
																				ProducingGraphicsBuffer.anIntArray2801[i_1_++] = -1;
																			} else {
																				ProducingGraphicsBuffer.anIntArray2801[i_1_++] = Class120_Sub12_Sub3.method1207(Class120_Sub12_Sub37.aShortArray3430[Class108.anInt1035++], 65535);
																			}
																		} else {
																			if (i_5_ != 4212) {
																				break;
																			}
																			Class108.anInt1035 = 0;
																		}
																	} else if (i_5_ == 4100) {
																		final String string = Class33.aStringArray277[--i_3_];
																		final int i_237_ = ProducingGraphicsBuffer.anIntArray2801[--i_1_];
																		Class33.aStringArray277[i_3_++] = new StringBuilder(string).append(i_237_).toString();
																	} else if (i_5_ == 4101) {
																		i_3_ -= 2;
																		final String string = Class33.aStringArray277[i_3_];
																		final String string_238_ = Class33.aStringArray277[i_3_ - -1];
																		Class33.aStringArray277[i_3_++] = new StringBuilder(string).append(string_238_).toString();
																	} else if (i_5_ == 4102) {
																		final int i_239_ = ProducingGraphicsBuffer.anIntArray2801[--i_1_];
																		final String string = Class33.aStringArray277[--i_3_];
																		Class33.aStringArray277[i_3_++] = new StringBuilder(string).append(Class134.method1949(false, i_239_, true)).toString();
																	} else if (i_5_ == 4103) {
																		final String string = Class33.aStringArray277[--i_3_];
																		Class33.aStringArray277[i_3_++] = string.toLowerCase();
																	} else if (i_5_ == 4104) {
																		final int i_240_ = ProducingGraphicsBuffer.anIntArray2801[--i_1_];
																		final long l = 1014768000000L + 86400000L * i_240_;
																		Class192.aCalendar2121.setTime(new Date(l));
																		final int i_241_ = Class192.aCalendar2121.get(5);
																		final int i_242_ = Class192.aCalendar2121.get(2);
																		final int i_243_ = Class192.aCalendar2121.get(1);
																		Class33.aStringArray277[i_3_++] = new StringBuilder(String.valueOf(i_241_)).append("-").append(Class120_Sub24.aStringArray2716[i_242_]).append("-").append(i_243_).toString();
																	} else if (i_5_ == 4105) {
																		i_3_ -= 2;
																		final String string = Class33.aStringArray277[i_3_ - -1];
																		final String string_244_ = Class33.aStringArray277[i_3_];
																		if (Class100.selfPlayer.appearance != null && Class100.selfPlayer.appearance.aBoolean1371) {
																			Class33.aStringArray277[i_3_++] = string;
																		} else {
																			Class33.aStringArray277[i_3_++] = string_244_;
																		}
																	} else if (i_5_ == 4106) {
																		final int i_245_ = ProducingGraphicsBuffer.anIntArray2801[--i_1_];
																		Class33.aStringArray277[i_3_++] = Integer.toString(i_245_);
																	} else if (i_5_ == 4107) {
																		i_3_ -= 2;
																		ProducingGraphicsBuffer.anIntArray2801[i_1_++] = Class124.method1874(-1, Class120_Sub12_Sub21_Sub1.method1313(5379, Class33.aStringArray277[1 + i_3_], Class9.language, Class33.aStringArray277[i_3_]));
																	} else if (i_5_ == 4108) {
																		i_1_ -= 2;
																		final int i_246_ = ProducingGraphicsBuffer.anIntArray2801[1 + i_1_];
																		final int i_247_ = ProducingGraphicsBuffer.anIntArray2801[i_1_];
																		final String string = Class33.aStringArray277[--i_3_];
																		ProducingGraphicsBuffer.anIntArray2801[i_1_++] = Class148.method2061(94, i_246_).method1481(string, i_247_);
																	} else if (i_5_ == 4109) {
																		i_1_ -= 2;
																		final String string = Class33.aStringArray277[--i_3_];
																		final int i_248_ = ProducingGraphicsBuffer.anIntArray2801[i_1_];
																		final int i_249_ = ProducingGraphicsBuffer.anIntArray2801[1 + i_1_];
																		ProducingGraphicsBuffer.anIntArray2801[i_1_++] = Class148.method2061(-97, i_249_).method1468(string, i_248_);
																	} else if (i_5_ == 4110) {
																		i_3_ -= 2;
																		final String string = Class33.aStringArray277[i_3_];
																		final String string_250_ = Class33.aStringArray277[1 + i_3_];
																		if (ProducingGraphicsBuffer.anIntArray2801[--i_1_] != 1) {
																			Class33.aStringArray277[i_3_++] = string_250_;
																		} else {
																			Class33.aStringArray277[i_3_++] = string;
																		}
																	} else if (i_5_ == 4111) {
																		final String string = Class33.aStringArray277[--i_3_];
																		Class33.aStringArray277[i_3_++] = Class120_Sub14_Sub8.method1472(string);
																	} else if (i_5_ == 4112) {
																		final String string = Class33.aStringArray277[--i_3_];
																		final int i_251_ = ProducingGraphicsBuffer.anIntArray2801[--i_1_];
																		if ((i_251_ ^ 0xffffffff) == 0) {
																			throw new RuntimeException("null char");
																		}
																		Class33.aStringArray277[i_3_++] = new StringBuilder(string).append((char) i_251_).toString();
																	} else if (i_5_ == 4113) {
																		final int i_252_ = ProducingGraphicsBuffer.anIntArray2801[--i_1_];
																		ProducingGraphicsBuffer.anIntArray2801[i_1_++] = Class120_Sub14_Sub10.method1504(80, (char) i_252_) ? 1 : 0;
																	} else if (i_5_ == 4114) {
																		final int i_253_ = ProducingGraphicsBuffer.anIntArray2801[--i_1_];
																		ProducingGraphicsBuffer.anIntArray2801[i_1_++] = !Class120_Sub12_Sub5.method1217(true, (char) i_253_) ? 0 : 1;
																	} else if (i_5_ == 4115) {
																		final int i_254_ = ProducingGraphicsBuffer.anIntArray2801[--i_1_];
																		ProducingGraphicsBuffer.anIntArray2801[i_1_++] = Class120_Sub14_Sub11.method1516((char) i_254_, true) ? 1 : 0;
																	} else if (i_5_ == 4116) {
																		final int i_255_ = ProducingGraphicsBuffer.anIntArray2801[--i_1_];
																		ProducingGraphicsBuffer.anIntArray2801[i_1_++] = FileSystem.method447(false, (char) i_255_) ? 1 : 0;
																	} else if (i_5_ == 4117) {
																		final String string = Class33.aStringArray277[--i_3_];
																		if (string == null) {
																			ProducingGraphicsBuffer.anIntArray2801[i_1_++] = 0;
																		} else {
																			ProducingGraphicsBuffer.anIntArray2801[i_1_++] = string.length();
																		}
																	} else if (i_5_ == 4118) {
																		i_1_ -= 2;
																		final String string = Class33.aStringArray277[--i_3_];
																		final int i_256_ = ProducingGraphicsBuffer.anIntArray2801[i_1_];
																		final int i_257_ = ProducingGraphicsBuffer.anIntArray2801[i_1_ - -1];
																		Class33.aStringArray277[i_3_++] = string.substring(i_256_, i_257_);
																	} else if (i_5_ == 4119) {
																		final String string = Class33.aStringArray277[--i_3_];
																		boolean bool_258_ = false;
																		final StringBuffer stringbuffer = new StringBuffer(string.length());
																		for (int i_259_ = 0; i_259_ < string.length(); i_259_++) {
																			final char c = string.charAt(i_259_);
																			if (c == '<') {
																				bool_258_ = true;
																			} else if (c == '>') {
																				bool_258_ = false;
																			} else if (!bool_258_) {
																				stringbuffer.append(c);
																			}
																		}
																		Class33.aStringArray277[i_3_++] = stringbuffer.toString();
																	} else if (i_5_ == 4120) {
																		i_1_ -= 2;
																		final String string = Class33.aStringArray277[--i_3_];
																		final int i_260_ = ProducingGraphicsBuffer.anIntArray2801[i_1_];
																		final int i_261_ = ProducingGraphicsBuffer.anIntArray2801[1 + i_1_];
																		ProducingGraphicsBuffer.anIntArray2801[i_1_++] = string.indexOf(i_260_, i_261_);
																	} else if (i_5_ == 4121) {
																		final int i_262_ = ProducingGraphicsBuffer.anIntArray2801[--i_1_];
																		i_3_ -= 2;
																		final String string = Class33.aStringArray277[i_3_];
																		final String string_263_ = Class33.aStringArray277[1 + i_3_];
																		ProducingGraphicsBuffer.anIntArray2801[i_1_++] = string.indexOf(string_263_, i_262_);
																	} else if (i_5_ == 4122) {
																		final int i_264_ = ProducingGraphicsBuffer.anIntArray2801[--i_1_];
																		ProducingGraphicsBuffer.anIntArray2801[i_1_++] = Character.toLowerCase((char) i_264_);
																	} else if (i_5_ == 4123) {
																		final int i_265_ = ProducingGraphicsBuffer.anIntArray2801[--i_1_];
																		ProducingGraphicsBuffer.anIntArray2801[i_1_++] = Character.toUpperCase((char) i_265_);
																	} else {
																		if (i_5_ != 4124) {
																			break;
																		}
																		final boolean bool_266_ = ProducingGraphicsBuffer.anIntArray2801[--i_1_] != 0;
																		final int i_267_ = ProducingGraphicsBuffer.anIntArray2801[--i_1_];
																		Class33.aStringArray277[i_3_++] = Class120_Sub12_Sub37.method1395(i_267_, bool_266_, -7, 0, Class9.language);
																	}
																} else if (i_5_ == 4000) {
																	i_1_ -= 2;
																	final int i_268_ = ProducingGraphicsBuffer.anIntArray2801[i_1_ + 1];
																	final int i_269_ = ProducingGraphicsBuffer.anIntArray2801[i_1_];
																	ProducingGraphicsBuffer.anIntArray2801[i_1_++] = i_269_ - -i_268_;
																} else if (i_5_ == 4001) {
																	i_1_ -= 2;
																	final int i_270_ = ProducingGraphicsBuffer.anIntArray2801[i_1_];
																	final int i_271_ = ProducingGraphicsBuffer.anIntArray2801[i_1_ - -1];
																	ProducingGraphicsBuffer.anIntArray2801[i_1_++] = i_270_ - i_271_;
																} else if (i_5_ == 4002) {
																	i_1_ -= 2;
																	final int i_272_ = ProducingGraphicsBuffer.anIntArray2801[i_1_];
																	final int i_273_ = ProducingGraphicsBuffer.anIntArray2801[i_1_ + 1];
																	ProducingGraphicsBuffer.anIntArray2801[i_1_++] = i_272_ * i_273_;
																} else if (i_5_ == 4003) {
																	i_1_ -= 2;
																	final int i_274_ = ProducingGraphicsBuffer.anIntArray2801[i_1_ + 1];
																	final int i_275_ = ProducingGraphicsBuffer.anIntArray2801[i_1_];
																	ProducingGraphicsBuffer.anIntArray2801[i_1_++] = i_275_ / i_274_;
																} else if (i_5_ == 4004) {
																	final int i_276_ = ProducingGraphicsBuffer.anIntArray2801[--i_1_];
																	ProducingGraphicsBuffer.anIntArray2801[i_1_++] = (int) (i_276_ * Math.random());
																} else if (i_5_ == 4005) {
																	final int i_277_ = ProducingGraphicsBuffer.anIntArray2801[--i_1_];
																	ProducingGraphicsBuffer.anIntArray2801[i_1_++] = (int) ((i_277_ - -1) * Math.random());
																} else if (i_5_ == 4006) {
																	i_1_ -= 5;
																	final int i_278_ = ProducingGraphicsBuffer.anIntArray2801[i_1_];
																	final int i_279_ = ProducingGraphicsBuffer.anIntArray2801[2 + i_1_];
																	final int i_280_ = ProducingGraphicsBuffer.anIntArray2801[3 + i_1_];
																	final int i_281_ = ProducingGraphicsBuffer.anIntArray2801[i_1_ - -1];
																	final int i_282_ = ProducingGraphicsBuffer.anIntArray2801[4 + i_1_];
																	ProducingGraphicsBuffer.anIntArray2801[i_1_++] = (-i_279_ + i_282_) * (-i_278_ + i_281_) / (-i_279_ + i_280_) + i_278_;
																} else if (i_5_ == 4007) {
																	i_1_ -= 2;
																	final long l = ProducingGraphicsBuffer.anIntArray2801[i_1_];
																	final long l_283_ = ProducingGraphicsBuffer.anIntArray2801[i_1_ + 1];
																	ProducingGraphicsBuffer.anIntArray2801[i_1_++] = (int) (l_283_ * l / 100L + l);
																} else if (i_5_ == 4008) {
																	i_1_ -= 2;
																	final int i_284_ = ProducingGraphicsBuffer.anIntArray2801[i_1_];
																	final int i_285_ = ProducingGraphicsBuffer.anIntArray2801[i_1_ + 1];
																	ProducingGraphicsBuffer.anIntArray2801[i_1_++] = Class191.method2512(1 << i_285_, i_284_);
																} else if (i_5_ == 4009) {
																	i_1_ -= 2;
																	final int i_286_ = ProducingGraphicsBuffer.anIntArray2801[i_1_];
																	final int i_287_ = ProducingGraphicsBuffer.anIntArray2801[1 + i_1_];
																	ProducingGraphicsBuffer.anIntArray2801[i_1_++] = Class120_Sub12_Sub3.method1207(-(1 << i_287_) + -1, i_286_);
																} else if (i_5_ == 4010) {
																	i_1_ -= 2;
																	final int i_288_ = ProducingGraphicsBuffer.anIntArray2801[i_1_];
																	final int i_289_ = ProducingGraphicsBuffer.anIntArray2801[1 + i_1_];
																	ProducingGraphicsBuffer.anIntArray2801[i_1_++] = Class120_Sub12_Sub3.method1207(i_288_, 1 << i_289_) != 0 ? 1 : 0;
																} else if (i_5_ == 4011) {
																	i_1_ -= 2;
																	final int i_290_ = ProducingGraphicsBuffer.anIntArray2801[i_1_];
																	final int i_291_ = ProducingGraphicsBuffer.anIntArray2801[1 + i_1_];
																	ProducingGraphicsBuffer.anIntArray2801[i_1_++] = i_290_ % i_291_;
																} else if (i_5_ == 4012) {
																	i_1_ -= 2;
																	final int i_292_ = ProducingGraphicsBuffer.anIntArray2801[i_1_];
																	final int i_293_ = ProducingGraphicsBuffer.anIntArray2801[i_1_ + 1];
																	if (i_292_ == 0) {
																		ProducingGraphicsBuffer.anIntArray2801[i_1_++] = 0;
																	} else {
																		ProducingGraphicsBuffer.anIntArray2801[i_1_++] = (int) Math.pow(i_292_, i_293_);
																	}
																} else if (i_5_ == 4013) {
																	i_1_ -= 2;
																	final int i_294_ = ProducingGraphicsBuffer.anIntArray2801[i_1_];
																	final int i_295_ = ProducingGraphicsBuffer.anIntArray2801[i_1_ + 1];
																	if (i_294_ != 0) {
																		if (i_295_ == 0) {
																			ProducingGraphicsBuffer.anIntArray2801[i_1_++] = 2147483647;
																		} else {
																			ProducingGraphicsBuffer.anIntArray2801[i_1_++] = (int) Math.pow(i_294_, 1.0 / i_295_);
																		}
																	} else {
																		ProducingGraphicsBuffer.anIntArray2801[i_1_++] = 0;
																	}
																} else if (i_5_ == 4014) {
																	i_1_ -= 2;
																	final int i_296_ = ProducingGraphicsBuffer.anIntArray2801[i_1_];
																	final int i_297_ = ProducingGraphicsBuffer.anIntArray2801[i_1_ - -1];
																	ProducingGraphicsBuffer.anIntArray2801[i_1_++] = Class120_Sub12_Sub3.method1207(i_297_, i_296_);
																} else if (i_5_ == 4015) {
																	i_1_ -= 2;
																	final int i_298_ = ProducingGraphicsBuffer.anIntArray2801[i_1_ + 1];
																	final int i_299_ = ProducingGraphicsBuffer.anIntArray2801[i_1_];
																	ProducingGraphicsBuffer.anIntArray2801[i_1_++] = Class191.method2512(i_298_, i_299_);
																} else if (i_5_ == 4016) {
																	i_1_ -= 2;
																	final int i_300_ = ProducingGraphicsBuffer.anIntArray2801[i_1_];
																	final int i_301_ = ProducingGraphicsBuffer.anIntArray2801[i_1_ - -1];
																	ProducingGraphicsBuffer.anIntArray2801[i_1_++] = i_301_ <= i_300_ ? i_301_ : i_300_;
																} else if (i_5_ == 4017) {
																	i_1_ -= 2;
																	final int i_302_ = ProducingGraphicsBuffer.anIntArray2801[i_1_];
																	final int i_303_ = ProducingGraphicsBuffer.anIntArray2801[1 + i_1_];
																	ProducingGraphicsBuffer.anIntArray2801[i_1_++] = i_302_ > i_303_ ? i_302_ : i_303_;
																} else {
																	if (i_5_ != 4018) {
																		break;
																	}
																	i_1_ -= 3;
																	final long l = ProducingGraphicsBuffer.anIntArray2801[i_1_];
																	final long l_304_ = ProducingGraphicsBuffer.anIntArray2801[i_1_ + 2];
																	final long l_305_ = ProducingGraphicsBuffer.anIntArray2801[i_1_ - -1];
																	ProducingGraphicsBuffer.anIntArray2801[i_1_++] = (int) (l_304_ * l / l_305_);
																}
															} else if (i_5_ == 3600) {
																if (ObjectPile.anInt1805 != 0) {
																	if (ObjectPile.anInt1805 == 1) {
																		ProducingGraphicsBuffer.anIntArray2801[i_1_++] = -1;
																	} else {
																		ProducingGraphicsBuffer.anIntArray2801[i_1_++] = ProducingGraphicsBuffer.anInt2799;
																	}
																} else {
																	ProducingGraphicsBuffer.anIntArray2801[i_1_++] = -2;
																}
															} else if (i_5_ == 3601) {
																final int i_306_ = ProducingGraphicsBuffer.anIntArray2801[--i_1_];
																if (ObjectPile.anInt1805 == 2 && i_306_ < ProducingGraphicsBuffer.anInt2799) {
																	Class33.aStringArray277[i_3_++] = Class120_Sub16.aStringArray2599[i_306_];
																} else {
																	Class33.aStringArray277[i_3_++] = "";
																}
															} else if (i_5_ == 3602) {
																final int i_307_ = ProducingGraphicsBuffer.anIntArray2801[--i_1_];
																if (ObjectPile.anInt1805 == 2 && i_307_ < ProducingGraphicsBuffer.anInt2799) {
																	ProducingGraphicsBuffer.anIntArray2801[i_1_++] = Class120_Sub12_Sub16.anIntArray3252[i_307_];
																} else {
																	ProducingGraphicsBuffer.anIntArray2801[i_1_++] = 0;
																}
															} else if (i_5_ == 3603) {
																final int i_308_ = ProducingGraphicsBuffer.anIntArray2801[--i_1_];
																if (ObjectPile.anInt1805 != 2 || i_308_ >= ProducingGraphicsBuffer.anInt2799) {
																	ProducingGraphicsBuffer.anIntArray2801[i_1_++] = 0;
																} else {
																	ProducingGraphicsBuffer.anIntArray2801[i_1_++] = Class120_Sub12_Sub30.anIntArray3374[i_308_];
																}
															} else if (i_5_ == 3604) {
																final String string = Class33.aStringArray277[--i_3_];
																final int i_309_ = ProducingGraphicsBuffer.anIntArray2801[--i_1_];
																Class90.method755(215, i_309_, string);
															} else if (i_5_ == 3605) {
																final String string = Class33.aStringArray277[--i_3_];
																Class48.method406(0, Class70.stringToLong(string));
															} else if (i_5_ == 3606) {
																final String string = Class33.aStringArray277[--i_3_];
																Class108_Sub1.method941(Class70.stringToLong(string), i_0_ ^ 0x3bf96272);
															} else if (i_5_ == 3607) {
																final String string = Class33.aStringArray277[--i_3_];
																Class154.method2078(false, Class70.stringToLong(string), (byte) 92);
															} else if (i_5_ == 3608) {
																final String string = Class33.aStringArray277[--i_3_];
																Class93.method770(Class70.stringToLong(string), (byte) -67);
															} else if (i_5_ == 3609) {
																String string = Class33.aStringArray277[--i_3_];
																if (string.startsWith("<img=0>") || string.startsWith("<img=1>")) {
																	string = string.substring(7);
																}
																ProducingGraphicsBuffer.anIntArray2801[i_1_++] = SpotAnimType.method875(-38, string) ? 1 : 0;
															} else if (i_5_ == 3610) {
																final int i_310_ = ProducingGraphicsBuffer.anIntArray2801[--i_1_];
																if (ObjectPile.anInt1805 == 2 && i_310_ < ProducingGraphicsBuffer.anInt2799) {
																	Class33.aStringArray277[i_3_++] = Class79_Sub1.aStringArray2247[i_310_];
																} else {
																	Class33.aStringArray277[i_3_++] = "";
																}
															} else if (i_5_ == 3611) {
																if (InterfaceChangeNode.aString3489 == null) {
																	Class33.aStringArray277[i_3_++] = "";
																} else {
																	Class33.aStringArray277[i_3_++] = Class120_Sub12_Sub23.method1326(InterfaceChangeNode.aString3489, true);
																}
															} else if (i_5_ == 3612) {
																if (InterfaceChangeNode.aString3489 == null) {
																	ProducingGraphicsBuffer.anIntArray2801[i_1_++] = 0;
																} else {
																	ProducingGraphicsBuffer.anIntArray2801[i_1_++] = Class120_Sub14_Sub13.anInt3572;
																}
															} else if (i_5_ == 3613) {
																final int i_311_ = ProducingGraphicsBuffer.anIntArray2801[--i_1_];
																if (InterfaceChangeNode.aString3489 != null && i_311_ < Class120_Sub14_Sub13.anInt3572) {
																	Class33.aStringArray277[i_3_++] = Class120_Sub12_Sub23.method1326(Class120_Sub28.aClass120_Sub13Array2754[i_311_].aString2580, true);
																} else {
																	Class33.aStringArray277[i_3_++] = "";
																}
															} else if (i_5_ == 3614) {
																final int i_312_ = ProducingGraphicsBuffer.anIntArray2801[--i_1_];
																if (InterfaceChangeNode.aString3489 != null && Class120_Sub14_Sub13.anInt3572 > i_312_) {
																	ProducingGraphicsBuffer.anIntArray2801[i_1_++] = Class120_Sub28.aClass120_Sub13Array2754[i_312_].anInt2571;
																} else {
																	ProducingGraphicsBuffer.anIntArray2801[i_1_++] = 0;
																}
															} else if (i_5_ == 3615) {
																final int i_313_ = ProducingGraphicsBuffer.anIntArray2801[--i_1_];
																if (InterfaceChangeNode.aString3489 == null || Class120_Sub14_Sub13.anInt3572 <= i_313_) {
																	ProducingGraphicsBuffer.anIntArray2801[i_1_++] = 0;
																} else {
																	ProducingGraphicsBuffer.anIntArray2801[i_1_++] = Class120_Sub28.aClass120_Sub13Array2754[i_313_].aByte2575;
																}
															} else if (i_5_ == 3616) {
																ProducingGraphicsBuffer.anIntArray2801[i_1_++] = Class112.aByte1078;
															} else if (i_5_ == 3617) {
																final String string = Class33.aStringArray277[--i_3_];
																Class166.method2182(6137, string);
															} else if (i_5_ == 3618) {
																ProducingGraphicsBuffer.anIntArray2801[i_1_++] = MouseHandler.aByte1141;
															} else if (i_5_ == 3619) {
																final String string = Class33.aStringArray277[--i_3_];
																Class120_Sub21.joinClanChat(Class70.stringToLong(string));
															} else if (i_5_ == 3620) {
																client.leaveClanChat();
															} else if (i_5_ == 3621) {
																if (ObjectPile.anInt1805 != 0) {
																	ProducingGraphicsBuffer.anIntArray2801[i_1_++] = Class120_Sub12_Sub26.anInt3335;
																} else {
																	ProducingGraphicsBuffer.anIntArray2801[i_1_++] = -1;
																}
															} else if (i_5_ == 3622) {
																final int i_314_ = ProducingGraphicsBuffer.anIntArray2801[--i_1_];
																if (ObjectPile.anInt1805 == 0 || Class120_Sub12_Sub26.anInt3335 <= i_314_) {
																	Class33.aStringArray277[i_3_++] = "";
																} else {
																	Class33.aStringArray277[i_3_++] = Class136.longToString(Class85.aLongArray806[i_314_]);
																}
															} else if (i_5_ == 3623) {
																String string = Class33.aStringArray277[--i_3_];
																if (string.startsWith("<img=0>") || string.startsWith("<img=1>")) {
																	string = string.substring(7);
																}
																ProducingGraphicsBuffer.anIntArray2801[i_1_++] = Light.method351(false, string) ? 1 : 0;
															} else if (i_5_ == 3624) {
																final int i_315_ = ProducingGraphicsBuffer.anIntArray2801[--i_1_];
																if (Class120_Sub28.aClass120_Sub13Array2754 == null || i_315_ >= Class120_Sub14_Sub13.anInt3572 || !Class120_Sub28.aClass120_Sub13Array2754[i_315_].aString2580.equalsIgnoreCase(Class100.selfPlayer.name)) {
																	ProducingGraphicsBuffer.anIntArray2801[i_1_++] = 0;
																} else {
																	ProducingGraphicsBuffer.anIntArray2801[i_1_++] = 1;
																}
															} else if (i_5_ == 3625) {
																if (Class150.aString1415 != null) {
																	Class33.aStringArray277[i_3_++] = Class120_Sub12_Sub23.method1326(Class150.aString1415, true);
																} else {
																	Class33.aStringArray277[i_3_++] = "";
																}
															} else if (i_5_ == 3626) {
																final int i_316_ = ProducingGraphicsBuffer.anIntArray2801[--i_1_];
																if (InterfaceChangeNode.aString3489 == null || Class120_Sub14_Sub13.anInt3572 <= i_316_) {
																	Class33.aStringArray277[i_3_++] = "";
																} else {
																	Class33.aStringArray277[i_3_++] = Class120_Sub28.aClass120_Sub13Array2754[i_316_].aString2579;
																}
															} else if (i_5_ == 3627) {
																final int i_317_ = ProducingGraphicsBuffer.anIntArray2801[--i_1_];
																if (ObjectPile.anInt1805 == 2 && i_317_ >= 0 && ProducingGraphicsBuffer.anInt2799 > i_317_) {
																	ProducingGraphicsBuffer.anIntArray2801[i_1_++] = !Class120_Sub12_Sub9.aBooleanArray3194[i_317_] ? 0 : 1;
																} else {
																	ProducingGraphicsBuffer.anIntArray2801[i_1_++] = 0;
																}
															} else if (i_5_ == 3628) {
																String string = Class33.aStringArray277[--i_3_];
																if (string.startsWith("<img=0>") || string.startsWith("<img=1>")) {
																	string = string.substring(7);
																}
																ProducingGraphicsBuffer.anIntArray2801[i_1_++] = Class120_Sub12_Sub7.method1232(string, 92);
															} else if (i_5_ == 3629) {
																ProducingGraphicsBuffer.anIntArray2801[i_1_++] = Node.countryId;
															} else if (i_5_ == 3630) {
																final String string = Class33.aStringArray277[--i_3_];
																Class154.method2078(true, Class70.stringToLong(string), (byte) 91);
															} else {
																if (i_5_ != 3631) {
																	break;
																}
																final int i_318_ = ProducingGraphicsBuffer.anIntArray2801[--i_1_];
																ProducingGraphicsBuffer.anIntArray2801[i_1_++] = Class120_Sub14_Sub4.aBooleanArray3468[i_318_] ? 1 : 0;
															}
														} else if (i_5_ == 3300) {
															ProducingGraphicsBuffer.anIntArray2801[i_1_++] = Class101_Sub2.loopCycle;
														} else if (i_5_ == 3301) {
															i_1_ -= 2;
															final int i_319_ = ProducingGraphicsBuffer.anIntArray2801[1 + i_1_];
															final int i_320_ = ProducingGraphicsBuffer.anIntArray2801[i_1_];
															ProducingGraphicsBuffer.anIntArray2801[i_1_++] = Class120_Sub12_Sub1.method1199(i_320_, i_319_, false);
														} else if (i_5_ == 3302) {
															i_1_ -= 2;
															final int i_321_ = ProducingGraphicsBuffer.anIntArray2801[i_1_];
															final int i_322_ = ProducingGraphicsBuffer.anIntArray2801[1 + i_1_];
															ProducingGraphicsBuffer.anIntArray2801[i_1_++] = AbstractTimer.method735(0, i_322_, i_321_);
														} else if (i_5_ == 3303) {
															i_1_ -= 2;
															final int i_323_ = ProducingGraphicsBuffer.anIntArray2801[i_1_];
															final int i_324_ = ProducingGraphicsBuffer.anIntArray2801[1 + i_1_];
															ProducingGraphicsBuffer.anIntArray2801[i_1_++] = Class48.method403(i_324_, (byte) 69, i_323_);
														} else if (i_5_ == 3304) {
															final int i_325_ = ProducingGraphicsBuffer.anIntArray2801[--i_1_];
															ProducingGraphicsBuffer.anIntArray2801[i_1_++] = Class15.method147(i_325_, 10057).anInt3482;
														} else if (i_5_ == 3305) {
															final int i_326_ = ProducingGraphicsBuffer.anIntArray2801[--i_1_];
															ProducingGraphicsBuffer.anIntArray2801[i_1_++] = SceneGraphNode.anIntArray1783[i_326_];
														} else if (i_5_ == 3306) {
															final int i_327_ = ProducingGraphicsBuffer.anIntArray2801[--i_1_];
															ProducingGraphicsBuffer.anIntArray2801[i_1_++] = Decimator.anIntArray1720[i_327_];
														} else if (i_5_ == 3307) {
															final int i_328_ = ProducingGraphicsBuffer.anIntArray2801[--i_1_];
															ProducingGraphicsBuffer.anIntArray2801[i_1_++] = Class120_Sub12_Sub38.anIntArray3439[i_328_];
														} else if (i_5_ == 3308) {
															final int i_329_ = Class173.gameLevel;
															final int i_330_ = GameEntity.currentBaseX + (Class100.selfPlayer.x >> 7);
															final int i_331_ = Class181.currentBaseZ + (Class100.selfPlayer.z >> 7);
															ProducingGraphicsBuffer.anIntArray2801[i_1_++] = (i_330_ << 14) + (i_329_ << 28) + i_331_;
														} else if (i_5_ == 3309) {
															final int i_332_ = ProducingGraphicsBuffer.anIntArray2801[--i_1_];
															ProducingGraphicsBuffer.anIntArray2801[i_1_++] = Class120_Sub12_Sub3.method1207(16383, i_332_ >> 14);
														} else if (i_5_ == 3310) {
															final int i_333_ = ProducingGraphicsBuffer.anIntArray2801[--i_1_];
															ProducingGraphicsBuffer.anIntArray2801[i_1_++] = i_333_ >> 28;
														} else if (i_5_ == 3311) {
															final int i_334_ = ProducingGraphicsBuffer.anIntArray2801[--i_1_];
															ProducingGraphicsBuffer.anIntArray2801[i_1_++] = Class120_Sub12_Sub3.method1207(16383, i_334_);
														} else if (i_5_ == 3312) {
															ProducingGraphicsBuffer.anIntArray2801[i_1_++] = !Class120_Sub12_Sub37.membersClient ? 0 : 1;
														} else if (i_5_ == 3313) {
															i_1_ -= 2;
															final int i_335_ = ProducingGraphicsBuffer.anIntArray2801[1 + i_1_];
															final int i_336_ = ProducingGraphicsBuffer.anIntArray2801[i_1_] - -32768;
															ProducingGraphicsBuffer.anIntArray2801[i_1_++] = Class120_Sub12_Sub1.method1199(i_336_, i_335_, false);
														} else if (i_5_ == 3314) {
															i_1_ -= 2;
															final int i_337_ = ProducingGraphicsBuffer.anIntArray2801[1 + i_1_];
															final int i_338_ = 32768 + ProducingGraphicsBuffer.anIntArray2801[i_1_];
															ProducingGraphicsBuffer.anIntArray2801[i_1_++] = AbstractTimer.method735(0, i_337_, i_338_);
														} else if (i_5_ == 3315) {
															i_1_ -= 2;
															final int i_339_ = 32768 + ProducingGraphicsBuffer.anIntArray2801[i_1_];
															final int i_340_ = ProducingGraphicsBuffer.anIntArray2801[1 + i_1_];
															ProducingGraphicsBuffer.anIntArray2801[i_1_++] = Class48.method403(i_340_, (byte) 102, i_339_);
														} else if (i_5_ == 3316) {
															if (Class86.anInt821 >= 2) {
																ProducingGraphicsBuffer.anIntArray2801[i_1_++] = Class86.anInt821;
															} else {
																ProducingGraphicsBuffer.anIntArray2801[i_1_++] = 0;
															}
														} else if (i_5_ == 3317) {
															ProducingGraphicsBuffer.anIntArray2801[i_1_++] = Class120_Sub22.anInt2675;
														} else if (i_5_ == 3318) {
															ProducingGraphicsBuffer.anIntArray2801[i_1_++] = Class157.anInt1469;
														} else if (i_5_ == 3321) {
															ProducingGraphicsBuffer.anIntArray2801[i_1_++] = Class69_Sub2.anInt2240;
														} else if (i_5_ == 3322) {
															ProducingGraphicsBuffer.anIntArray2801[i_1_++] = Class56.anInt498;
														} else if (i_5_ == 3323) {
															if (Class120_Sub12_Sub9.anInt3199 < 5 || Class120_Sub12_Sub9.anInt3199 > 9) {
																ProducingGraphicsBuffer.anIntArray2801[i_1_++] = 0;
															} else {
																ProducingGraphicsBuffer.anIntArray2801[i_1_++] = 1;
															}
														} else if (i_5_ == 3324) {
															if (Class120_Sub12_Sub9.anInt3199 >= 5 && Class120_Sub12_Sub9.anInt3199 <= 9) {
																ProducingGraphicsBuffer.anIntArray2801[i_1_++] = Class120_Sub12_Sub9.anInt3199;
															} else {
																ProducingGraphicsBuffer.anIntArray2801[i_1_++] = 0;
															}
														} else if (i_5_ == 3325) {
															ProducingGraphicsBuffer.anIntArray2801[i_1_++] = Class120_Sub12_Sub21_Sub1.aBoolean3908 ? 1 : 0;
														} else if (i_5_ == 3326) {
															ProducingGraphicsBuffer.anIntArray2801[i_1_++] = Class100.selfPlayer.anInt3747;
														} else if (i_5_ == 3327) {
															ProducingGraphicsBuffer.anIntArray2801[i_1_++] = Class100.selfPlayer.appearance.aBoolean1371 ? 1 : 0;
														} else if (i_5_ == 3328) {
															ProducingGraphicsBuffer.anIntArray2801[i_1_++] = Class27.aBoolean167 && !Class128.aBoolean1228 ? 1 : 0;
														} else if (i_5_ == 3329) {
															ProducingGraphicsBuffer.anIntArray2801[i_1_++] = !Class120_Sub14_Sub4.aBoolean3464 ? 0 : 1;
														} else if (i_5_ == 3330) {
															final int i_341_ = ProducingGraphicsBuffer.anIntArray2801[--i_1_];
															ProducingGraphicsBuffer.anIntArray2801[i_1_++] = Class120_Sub29.method1726(i_341_, (byte) -38);
														} else if (i_5_ == 3331) {
															i_1_ -= 2;
															final int i_342_ = ProducingGraphicsBuffer.anIntArray2801[i_1_ - -1];
															final int i_343_ = ProducingGraphicsBuffer.anIntArray2801[i_1_];
															ProducingGraphicsBuffer.anIntArray2801[i_1_++] = Class127.method1888(i_342_, (byte) -65, i_343_, false);
														} else if (i_5_ == 3332) {
															i_1_ -= 2;
															final int i_344_ = ProducingGraphicsBuffer.anIntArray2801[1 + i_1_];
															final int i_345_ = ProducingGraphicsBuffer.anIntArray2801[i_1_];
															ProducingGraphicsBuffer.anIntArray2801[i_1_++] = Class127.method1888(i_344_, (byte) -95, i_345_, true);
														} else if (i_5_ == 3333) {
															ProducingGraphicsBuffer.anIntArray2801[i_1_++] = AbstractMouseWheelHandler.anInt116;
														} else if (i_5_ == 3335) {
															ProducingGraphicsBuffer.anIntArray2801[i_1_++] = Class9.language;
														} else if (i_5_ == 3336) {
															i_1_ -= 4;
															int i_346_ = ProducingGraphicsBuffer.anIntArray2801[i_1_];
															final int i_347_ = ProducingGraphicsBuffer.anIntArray2801[1 + i_1_];
															final int i_348_ = ProducingGraphicsBuffer.anIntArray2801[2 + i_1_];
															i_346_ += i_347_ << 14;
															i_346_ += i_348_ << 28;
															final int i_349_ = ProducingGraphicsBuffer.anIntArray2801[3 + i_1_];
															i_346_ += i_349_;
															ProducingGraphicsBuffer.anIntArray2801[i_1_++] = i_346_;
														} else {
															if (i_5_ != 3337) {
																break;
															}
															ProducingGraphicsBuffer.anIntArray2801[i_1_++] = Class120_Sub12_Sub33.affiliateId;
														}
													} else if (i_5_ == 3200) {
														i_1_ -= 3;
														Class48.method404((byte) -100, ProducingGraphicsBuffer.anIntArray2801[i_1_ - -2], ProducingGraphicsBuffer.anIntArray2801[i_1_], ProducingGraphicsBuffer.anIntArray2801[i_1_ - -1], 255);
													} else if (i_5_ == 3201) {
														ObjectPile.method2447((byte) 89, 255, ProducingGraphicsBuffer.anIntArray2801[--i_1_]);
													} else {
														if (i_5_ != 3202) {
															break;
														}
														i_1_ -= 2;
														Class101.method832(-1, 255, ProducingGraphicsBuffer.anIntArray2801[1 + i_1_], ProducingGraphicsBuffer.anIntArray2801[i_1_]);
													}
												} else if (i_5_ == 3100) {
													final String string = Class33.aStringArray277[--i_3_];
													Class120_Sub14_Sub14.method1540("", 0, string);
												} else if (i_5_ == 3101) {
													i_1_ -= 2;
													Class192.method2517(Class100.selfPlayer, ProducingGraphicsBuffer.anIntArray2801[i_1_], ProducingGraphicsBuffer.anIntArray2801[1 + i_1_], -1);
												} else if (i_5_ == 3103) {
													Class90.method758(i_0_ + -1006199388);
												} else if (i_5_ == 3104) {
													final String string = Class33.aStringArray277[--i_3_];
													int i_350_ = 0;
													if (Class120_Sub21.method1697(string, (byte) -36)) {
														i_350_ = Class31.method265(true, string);
													}
													Class120_Sub12_Sub11.outputStream.putByteIsaac(219);
													Class120_Sub12_Sub11.outputStream.putInt(i_350_);
												} else if (i_5_ == 3105) {
													final String string = Class33.aStringArray277[--i_3_];
													Class120_Sub12_Sub11.outputStream.putByteIsaac(149);
													Class120_Sub12_Sub11.outputStream.putLong(Class70.stringToLong(string));
												} else if (i_5_ == 3106) {
													final String string = Class33.aStringArray277[--i_3_];
													Class120_Sub12_Sub11.outputStream.putByteIsaac(164);
													Class120_Sub12_Sub11.outputStream.putByte(string.length() - -1);
													Class120_Sub12_Sub11.outputStream.putJString(string);
												} else if (i_5_ == 3107) {
													final int i_351_ = ProducingGraphicsBuffer.anIntArray2801[--i_1_];
													final String string = Class33.aStringArray277[--i_3_];
													Class3.method81(i_351_, (byte) 61, string);
												} else if (i_5_ == 3108) {
													i_1_ -= 3;
													final int i_352_ = ProducingGraphicsBuffer.anIntArray2801[i_1_];
													final int i_353_ = ProducingGraphicsBuffer.anIntArray2801[i_1_ - -2];
													final int i_354_ = ProducingGraphicsBuffer.anIntArray2801[1 + i_1_];
													final JagexInterface jagexInterface = Class74.getJagexInterface(i_353_);
													Class120_Sub12_Sub8.method1241(jagexInterface, i_352_, i_354_, (byte) 93);
												} else if (i_5_ == 3109) {
													i_1_ -= 2;
													final int i_355_ = ProducingGraphicsBuffer.anIntArray2801[1 + i_1_];
													final int i_356_ = ProducingGraphicsBuffer.anIntArray2801[i_1_];
													final JagexInterface jagexInterface = !bool ? Class93.aClass189_869 : Class120_Sub14_Sub11.aClass189_3540;
													Class120_Sub12_Sub8.method1241(jagexInterface, i_356_, i_355_, (byte) 127);
												} else {
													if (i_5_ != 3110) {
														break;
													}
													final int i_357_ = ProducingGraphicsBuffer.anIntArray2801[--i_1_];
													Class120_Sub12_Sub11.outputStream.putByteIsaac(231);
													Class120_Sub12_Sub11.outputStream.putShort(i_357_);
												}
											} else if (i_5_ == 2700) {
												final JagexInterface jagexInterface = Class74.getJagexInterface(ProducingGraphicsBuffer.anIntArray2801[--i_1_]);
												ProducingGraphicsBuffer.anIntArray2801[i_1_++] = jagexInterface.anInt2030;
											} else if (i_5_ == 2701) {
												final JagexInterface jagexInterface = Class74.getJagexInterface(ProducingGraphicsBuffer.anIntArray2801[--i_1_]);
												if ((jagexInterface.anInt2030 ^ 0xffffffff) == 0) {
													ProducingGraphicsBuffer.anIntArray2801[i_1_++] = 0;
												} else {
													ProducingGraphicsBuffer.anIntArray2801[i_1_++] = jagexInterface.anInt2075;
												}
											} else if (i_5_ == 2702) {
												final int i_358_ = ProducingGraphicsBuffer.anIntArray2801[--i_1_];
												final OverridedJInterface class120_sub26 = (OverridedJInterface) Class120_Sub12_Sub13.overridedInterfaces.get(i_358_);
												if (class120_sub26 == null) {
													ProducingGraphicsBuffer.anIntArray2801[i_1_++] = 0;
												} else {
													ProducingGraphicsBuffer.anIntArray2801[i_1_++] = 1;
												}
											} else if (i_5_ == 2703) {
												final JagexInterface jagexInterface = Class74.getJagexInterface(ProducingGraphicsBuffer.anIntArray2801[--i_1_]);
												if (jagexInterface.aClass189Array2072 == null) {
													ProducingGraphicsBuffer.anIntArray2801[i_1_++] = 0;
												} else {
													int i_359_ = jagexInterface.aClass189Array2072.length;
													for (int i_360_ = 0; jagexInterface.aClass189Array2072.length > i_360_; i_360_++) {
														if (jagexInterface.aClass189Array2072[i_360_] == null) {
															i_359_ = i_360_;
															break;
														}
													}
													ProducingGraphicsBuffer.anIntArray2801[i_1_++] = i_359_;
												}
											} else {
												if (i_5_ != 2704 && i_5_ != 2705) {
													break;
												}
												i_1_ -= 2;
												final int i_361_ = ProducingGraphicsBuffer.anIntArray2801[i_1_];
												final int i_362_ = ProducingGraphicsBuffer.anIntArray2801[1 + i_1_];
												final OverridedJInterface class120_sub26 = (OverridedJInterface) Class120_Sub12_Sub13.overridedInterfaces.get(i_361_);
												if (class120_sub26 == null || class120_sub26.interfaceId != i_362_) {
													ProducingGraphicsBuffer.anIntArray2801[i_1_++] = 0;
												} else {
													ProducingGraphicsBuffer.anIntArray2801[i_1_++] = 1;
												}
											}
										} else {
											final JagexInterface jagexInterface = Class74.getJagexInterface(ProducingGraphicsBuffer.anIntArray2801[--i_1_]);
											if (i_5_ == 2600) {
												ProducingGraphicsBuffer.anIntArray2801[i_1_++] = jagexInterface.anInt2023;
											} else if (i_5_ == 2601) {
												ProducingGraphicsBuffer.anIntArray2801[i_1_++] = jagexInterface.anInt2021;
											} else if (i_5_ == 2602) {
												Class33.aStringArray277[i_3_++] = jagexInterface.aString1950;
											} else if (i_5_ == 2603) {
												ProducingGraphicsBuffer.anIntArray2801[i_1_++] = jagexInterface.anInt1930;
											} else if (i_5_ == 2604) {
												ProducingGraphicsBuffer.anIntArray2801[i_1_++] = jagexInterface.anInt1937;
											} else if (i_5_ == 2605) {
												ProducingGraphicsBuffer.anIntArray2801[i_1_++] = jagexInterface.anInt2005;
											} else if (i_5_ == 2606) {
												ProducingGraphicsBuffer.anIntArray2801[i_1_++] = jagexInterface.anInt2047;
											} else if (i_5_ == 2607) {
												ProducingGraphicsBuffer.anIntArray2801[i_1_++] = jagexInterface.anInt1935;
											} else if (i_5_ == 2608) {
												ProducingGraphicsBuffer.anIntArray2801[i_1_++] = jagexInterface.anInt2091;
											} else if (i_5_ == 2609) {
												ProducingGraphicsBuffer.anIntArray2801[i_1_++] = jagexInterface.anInt1974;
											} else if (i_5_ == 2610) {
												ProducingGraphicsBuffer.anIntArray2801[i_1_++] = jagexInterface.anInt2076;
											} else if (i_5_ == 2611) {
												ProducingGraphicsBuffer.anIntArray2801[i_1_++] = jagexInterface.anInt1977;
											} else {
												if (i_5_ != 2612) {
													break;
												}
												ProducingGraphicsBuffer.anIntArray2801[i_1_++] = jagexInterface.anInt2055;
											}
										}
									} else {
										final JagexInterface jagexInterface = Class74.getJagexInterface(ProducingGraphicsBuffer.anIntArray2801[--i_1_]);
										if (i_5_ == 2500) {
											ProducingGraphicsBuffer.anIntArray2801[i_1_++] = jagexInterface.anInt2073;
										} else if (i_5_ == 2501) {
											ProducingGraphicsBuffer.anIntArray2801[i_1_++] = jagexInterface.anInt1938;
										} else if (i_5_ == 2502) {
											ProducingGraphicsBuffer.anIntArray2801[i_1_++] = jagexInterface.anInt1948;
										} else if (i_5_ == 2503) {
											ProducingGraphicsBuffer.anIntArray2801[i_1_++] = jagexInterface.anInt2059;
										} else if (i_5_ == 2504) {
											ProducingGraphicsBuffer.anIntArray2801[i_1_++] = !jagexInterface.aBoolean2045 ? 0 : 1;
										} else {
											if (i_5_ != 2505) {
												break;
											}
											ProducingGraphicsBuffer.anIntArray2801[i_1_++] = jagexInterface.anInt2029;
										}
									}
								} else {
									final JagexInterface jagexInterface = bool ? Class120_Sub14_Sub11.aClass189_3540 : Class93.aClass189_869;
									if (i_5_ == 1500) {
										ProducingGraphicsBuffer.anIntArray2801[i_1_++] = jagexInterface.anInt2073;
									} else if (i_5_ == 1501) {
										ProducingGraphicsBuffer.anIntArray2801[i_1_++] = jagexInterface.anInt1938;
									} else if (i_5_ == 1502) {
										ProducingGraphicsBuffer.anIntArray2801[i_1_++] = jagexInterface.anInt1948;
									} else if (i_5_ == 1503) {
										ProducingGraphicsBuffer.anIntArray2801[i_1_++] = jagexInterface.anInt2059;
									} else if (i_5_ == 1504) {
										ProducingGraphicsBuffer.anIntArray2801[i_1_++] = jagexInterface.aBoolean2045 ? 1 : 0;
									} else {
										if (i_5_ != 1505) {
											break;
										}
										ProducingGraphicsBuffer.anIntArray2801[i_1_++] = jagexInterface.anInt2029;
									}
								}
							} else if (i_5_ == 403) {
								i_1_ -= 2;
								final int i_363_ = ProducingGraphicsBuffer.anIntArray2801[i_1_];
								final int i_364_ = ProducingGraphicsBuffer.anIntArray2801[i_1_ + 1];
								for (int i_365_ = 0; i_365_ < ObjType.anIntArray1520.length; i_365_++) {
									if (i_363_ == ObjType.anIntArray1520[i_365_]) {
										Class100.selfPlayer.appearance.method2036((byte) -111, i_365_, i_364_);
										continue while_218_;
									}
								}
								for (int i_366_ = 0; Class120_Sub12_Sub27.anIntArray3349.length > i_366_; i_366_++) {
									if (Class120_Sub12_Sub27.anIntArray3349[i_366_] == i_363_) {
										Class100.selfPlayer.appearance.method2036((byte) -40, i_366_, i_364_);
										break;
									}
								}
							} else if (i_5_ == 404) {
								i_1_ -= 2;
								final int i_367_ = ProducingGraphicsBuffer.anIntArray2801[i_1_];
								final int i_368_ = ProducingGraphicsBuffer.anIntArray2801[1 + i_1_];
								Class100.selfPlayer.appearance.method2045(i_367_, (byte) -103, i_368_);
							} else {
								if (i_5_ != 410) {
									break;
								}
								final boolean bool_369_ = ProducingGraphicsBuffer.anIntArray2801[--i_1_] != 0;
								Class100.selfPlayer.appearance.method2037(bool_369_, i_0_ + -1006199376);
							}
						} else if (i_5_ == 100) {
							i_1_ -= 3;
							final int i_370_ = ProducingGraphicsBuffer.anIntArray2801[2 + i_1_];
							final int i_371_ = ProducingGraphicsBuffer.anIntArray2801[i_1_];
							final int i_372_ = ProducingGraphicsBuffer.anIntArray2801[i_1_ + 1];
							if (i_372_ == 0) {
								throw new RuntimeException();
							}
							final JagexInterface jagexInterface = Class74.getJagexInterface(i_371_);
							if (jagexInterface.aClass189Array2072 == null) {
								jagexInterface.aClass189Array2072 = new JagexInterface[1 + i_370_];
							}
							if (i_370_ >= jagexInterface.aClass189Array2072.length) {
								final JagexInterface[] class189s = new JagexInterface[i_370_ + 1];
								for (int i_373_ = 0; i_373_ < jagexInterface.aClass189Array2072.length; i_373_++) {
									class189s[i_373_] = jagexInterface.aClass189Array2072[i_373_];
								}
								jagexInterface.aClass189Array2072 = class189s;
							}
							if (i_370_ > 0 && jagexInterface.aClass189Array2072[-1 + i_370_] == null) {
								throw new RuntimeException(new StringBuilder("Gap at:").append(i_370_ + -1).toString());
							}
							final JagexInterface class189_374_ = new JagexInterface();
							class189_374_.anInt2029 = class189_374_.bitPacked = jagexInterface.bitPacked;
							class189_374_.aBoolean2041 = true;
							class189_374_.anInt2083 = i_370_;
							class189_374_.type = i_372_;
							jagexInterface.aClass189Array2072[i_370_] = class189_374_;
							if (bool) {
								Class120_Sub14_Sub11.aClass189_3540 = class189_374_;
							} else {
								Class93.aClass189_869 = class189_374_;
							}
							InterfaceClickMask.redrawInterface(jagexInterface);
						} else if (i_5_ == 101) {
							final JagexInterface jagexInterface = !bool ? Class93.aClass189_869 : Class120_Sub14_Sub11.aClass189_3540;
							if (jagexInterface.anInt2083 == -1) {
								if (!bool) {
									throw new RuntimeException("Tried to cc_delete static active-component!");
								}
								throw new RuntimeException("Tried to .cc_delete static .active-component!");
							}
							final JagexInterface class189_375_ = Class74.getJagexInterface(jagexInterface.bitPacked);
							class189_375_.aClass189Array2072[jagexInterface.anInt2083] = null;
							InterfaceClickMask.redrawInterface(class189_375_);
						} else if (i_5_ == 102) {
							final JagexInterface jagexInterface = Class74.getJagexInterface(ProducingGraphicsBuffer.anIntArray2801[--i_1_]);
							jagexInterface.aClass189Array2072 = null;
							InterfaceClickMask.redrawInterface(jagexInterface);
						} else if (i_5_ == 200) {
							i_1_ -= 2;
							final int i_376_ = ProducingGraphicsBuffer.anIntArray2801[i_1_];
							final int i_377_ = ProducingGraphicsBuffer.anIntArray2801[i_1_ + 1];
							final JagexInterface jagexInterface = Class120_Sub13.method1404(i_376_, i_377_);
							if (jagexInterface == null || i_377_ == -1) {
								ProducingGraphicsBuffer.anIntArray2801[i_1_++] = 0;
							} else {
								ProducingGraphicsBuffer.anIntArray2801[i_1_++] = 1;
								if (bool) {
									Class120_Sub14_Sub11.aClass189_3540 = jagexInterface;
								} else {
									Class93.aClass189_869 = jagexInterface;
								}
							}
						} else {
							if (i_5_ != 201) {
								break;
							}
							final int i_378_ = ProducingGraphicsBuffer.anIntArray2801[--i_1_];
							final JagexInterface jagexInterface = Class74.getJagexInterface(i_378_);
							if (jagexInterface == null) {
								ProducingGraphicsBuffer.anIntArray2801[i_1_++] = 0;
							} else {
								ProducingGraphicsBuffer.anIntArray2801[i_1_++] = 1;
								if (bool) {
									Class120_Sub14_Sub11.aClass189_3540 = jagexInterface;
								} else {
									Class93.aClass189_869 = jagexInterface;
								}
							}
						}
					}
					throw new IllegalStateException();
				} catch (final Exception exception) {
					if (class120_sub14_sub12.aString3554 != null) {
						final StringBuffer stringbuffer = new StringBuffer(30);
						stringbuffer.append("%0a - in: ").append(class120_sub14_sub12.aString3554);
						for (int i_379_ = Buffer.anInt2475 + -1; i_379_ >= 0; i_379_--) {
							stringbuffer.append("%0a - via: ").append(Class179.aClass176Array1773[i_379_].aClass120_Sub14_Sub12_1761.aString3554);
						}
						if (i_5_ == 40) {
							final int i_380_ = is_4_[i_2_];
							stringbuffer.append("%0a - non-existant gosub script-num: ").append(Integer.toString(i_380_));
						}
						if (Class107.modeWhere != 0) {
							Class120_Sub14_Sub14.method1540("", 0, new StringBuilder("Clientscript error in: ").append(class120_sub14_sub12.aString3554).toString());
						}
						Class180_Sub3.method2312(exception, new StringBuilder("CS2 - scr:").append(class120_sub14_sub12.uid).append(" op:").append(i_5_).append(stringbuffer.toString()).toString());
					} else {
						if (Class107.modeWhere != 0) {
							Class120_Sub14_Sub14.method1540("", 0, "Clientscript error - check log for details");
						}
						Class180_Sub3.method2312(exception, new StringBuilder("CS2 - scr:").append(class120_sub14_sub12.uid).append(" op:").append(i_5_).toString());
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("gb.N(").append(i).append(',').append(i_0_).append(',').append(class120_sub14_sub12 != null ? "{...}" : "null").append(')').toString());
		}
	}

	final Class151 method2195(final boolean bool) {
		Class151 class151;
		try {
			if (!bool) {
				anIntArray2832 = null;
			}
			class151 = Class148.aClass151Array1400[this.anInt1615];
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("gb.J(").append(bool).append(')').toString());
		}
		return class151;
	}

	static final float[] method2196(final int i, final int i_381_) {
		float[] fs;
		try {
			final float f = Class117.method1012() + Class117.method1015();
			final int i_382_ = Class117.method1017();
			final float f_383_ = (i_382_ >> 16 & 0xff) / 255.0F;
			if (i != -13316) {
				return null;
			}
			final float f_384_ = (0xff & i_382_) / 255.0F;
			NodeSub.aFloatArray2583[3] = 1.0F;
			final float f_385_ = (0xff & i_382_ >> 8) / 255.0F;
			NodeSub.aFloatArray2583[0] = f * (f_383_ * ((Class120_Sub12_Sub3.method1207(16740947, i_381_) >> 16) / 255.0F) * 0.58823526F);
			NodeSub.aFloatArray2583[2] = f_384_ * (Class120_Sub12_Sub3.method1207(255, i_381_) / 255.0F) * 0.58823526F * f;
			NodeSub.aFloatArray2583[1] = f_385_ * ((Class120_Sub12_Sub3.method1207(i_381_, 65526) >> 8) / 255.0F) * 0.58823526F * f;
			fs = NodeSub.aFloatArray2583;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("gb.M(").append(i).append(',').append(i_381_).append(')').toString());
		}
		return fs;
	}
}
