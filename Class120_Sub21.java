/* Class120_Sub21 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;

final class Class120_Sub21 extends Node {
	static int anInt2664;
	static String aString2665 = "glow1:";
	String aString2666;
	static Class120_Sub14_Sub18[] aClass120_Sub14_Sub18Array2667;
	static Interface1 anInterface1_2668 = null;
	static String aString2669;
	static int anInt2670;

	static {
		aClass120_Sub14_Sub18Array2667 = new Class120_Sub14_Sub18[14];
		aString2669 = " has logged in.";
		anInt2670 = 0;
	}

	static final void method1695(final int i, final int i_0_, final int i_1_, final int i_2_, final byte i_3_) {
		try {
			if (i_3_ != 66) {
				method1697(null, (byte) 51);
			}
			final InterfaceChangeNode class120_sub14_sub7 = Class120_Sub14_Sub3.putInterfaceChange(4, i_1_);
			class120_sub14_sub7.method1454((byte) -92);
			class120_sub14_sub7.anInt3484 = i;
			class120_sub14_sub7.anInt3492 = i_2_;
			class120_sub14_sub7.anInt3486 = i_0_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("pl.E(").append(i).append(',').append(i_0_).append(',').append(i_1_).append(',').append(i_2_).append(',').append(i_3_).append(')').toString());
		}
	}

	public static void method1696(final int i) {
		try {
			anInterface1_2668 = null;
			aString2665 = null;
			aString2669 = null;
			if (i != 26213) {
				anInt2670 = 107;
			}
			aClass120_Sub14_Sub18Array2667 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("pl.D(").append(i).append(')').toString());
		}
	}

	static final boolean method1697(final String string, final byte i) {
		boolean bool;
		try {
			if (i != -36) {
				method1696(66);
			}
			bool = Class126.method1882(10, 55, true, string);
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("pl.A(").append(string != null ? "{...}" : "null").append(',').append(i).append(')').toString());
		}
		return bool;
	}

	static final void method1698(final byte i, final Class50 class50, final Class50 class50_4_) {
		try {
			Class31.aClass50_241 = class50;
			Class88.aClass50_834 = class50_4_;
			Class31.aClass50_241.method441(36, 1);
			if (i != -11) {
				aString2665 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("pl.F(").append(i).append(',').append(class50 != null ? "{...}" : "null").append(',').append(class50_4_ != null ? "{...}" : "null").append(')').toString());
		}
	}

	static final void method1699(final int i, final long l) {
		try {
			if ((l ^ 0xffffffffffffffffL) != -1L) {
				Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putPacket(218);
				Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putLong(l);
				if (i != 18014) {
					aClass120_Sub14_Sub18Array2667 = null;
				}
				Class126.anInt1208++;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("pl.C(").append(i).append(',').append(l).append(')').toString());
		}
	}

	static final void method1700(final int i) {
		try {
			if (Class120_Sub22.anInt2675 > 1) {
				Class120_Sub2.anInt2419 = Class160.anInt1494;
				Class120_Sub22.anInt2675--;
			}
			if (Class31.anInt244 > 0) {
				Class31.anInt244--;
			}
			if (Class120_Sub12_Sub5.aBoolean3163) {
				Class120_Sub12_Sub5.aBoolean3163 = false;
				Class100.method825((byte) -111);
			} else {
				for (int i_5_ = 0; i_5_ < 100 && Class182.method2445(0); i_5_++) {
					/* empty */
				}
				if (Class109.gameState == 30) {
					Class120_Sub26.method1722(Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209, true, 78);
					synchronized (Class110.aClass91_1055.anObject857) {
						if (Class127.aBoolean1211) {
							if (Class156.anInt1455 != 0 || Class110.aClass91_1055.anInt859 >= 40) {
								Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putPacket(199);
								Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putByte(0);
								int i_6_ = 0;
								final int i_7_ = Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.pos;
								for (int i_8_ = 0; i_8_ < Class110.aClass91_1055.anInt859 && Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.pos - i_7_ < 240; i_8_++) {
									i_6_++;
									int i_9_ = Class110.aClass91_1055.anIntArray861[i_8_];
									int i_10_ = Class110.aClass91_1055.anIntArray860[i_8_];
									if (i_10_ >= 0) {
										if ((i_10_ ^ 0xffffffff) < -65535) {
											i_10_ = 65534;
										}
									} else {
										i_10_ = 0;
									}
									boolean bool = false;
									if (i_9_ >= 0) {
										if ((i_9_ ^ 0xffffffff) < -65535) {
											i_9_ = 65534;
										}
									} else {
										i_9_ = 0;
									}
									if ((Class110.aClass91_1055.anIntArray860[i_8_] ^ 0xffffffff) == 0 && (Class110.aClass91_1055.anIntArray861[i_8_] ^ 0xffffffff) == 0) {
										bool = true;
										i_9_ = -1;
										i_10_ = -1;
									}
									if (Class120_Sub11.anInt2549 == i_9_ && i_10_ == Class120_Sub12_Sub31.anInt3380) {
										if (Class120_Sub12_Sub11.anInt3214 < 2047) {
											Class120_Sub12_Sub11.anInt3214++;
										}
									} else {
										int i_11_ = -Class120_Sub12_Sub31.anInt3380 + i_10_;
										Class120_Sub12_Sub31.anInt3380 = i_10_;
										int i_12_ = i_9_ - Class120_Sub11.anInt2549;
										Class120_Sub11.anInt2549 = i_9_;
										if (Class120_Sub12_Sub11.anInt3214 < 8 && i_12_ >= -32 && i_12_ <= 31 && i_11_ >= -32 && i_11_ <= 31) {
											i_12_ += 32;
											i_11_ += 32;
											Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putShort((Class120_Sub12_Sub11.anInt3214 << 12) - (-(i_12_ << 6) - i_11_));
											Class120_Sub12_Sub11.anInt3214 = 0;
										} else if (Class120_Sub12_Sub11.anInt3214 < 32 && i_12_ >= -128 && i_12_ <= 127 && i_11_ >= -128 && i_11_ <= 127) {
											Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putByte(128 + Class120_Sub12_Sub11.anInt3214);
											i_11_ += 128;
											i_12_ += 128;
											Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putShort((i_12_ << 8) - -i_11_);
											Class120_Sub12_Sub11.anInt3214 = 0;
										} else if (Class120_Sub12_Sub11.anInt3214 < 32) {
											Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putByte(Class120_Sub12_Sub11.anInt3214 + 192);
											if (!bool) {
												Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putInt(i_9_ | i_10_ << 16);
											} else {
												Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putInt(-2147483648);
											}
											Class120_Sub12_Sub11.anInt3214 = 0;
										} else {
											Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putShort(Class120_Sub12_Sub11.anInt3214 + 57344);
											if (!bool) {
												Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putInt(i_9_ | i_10_ << 16);
											} else {
												Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putInt(-2147483648);
											}
											Class120_Sub12_Sub11.anInt3214 = 0;
										}
									}
								}
								Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.method1140((byte) -118, Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.pos - i_7_);
								if (i_6_ < Class110.aClass91_1055.anInt859) {
									Class110.aClass91_1055.anInt859 -= i_6_;
									for (int i_13_ = 0; Class110.aClass91_1055.anInt859 > i_13_; i_13_++) {
										Class110.aClass91_1055.anIntArray861[i_13_] = Class110.aClass91_1055.anIntArray861[i_6_ + i_13_];
										Class110.aClass91_1055.anIntArray860[i_13_] = Class110.aClass91_1055.anIntArray860[i_6_ + i_13_];
									}
								} else {
									Class110.aClass91_1055.anInt859 = 0;
								}
							}
						} else {
							Class110.aClass91_1055.anInt859 = 0;
						}
					}
					if (Class156.anInt1455 != 0) {
						int i_14_ = Class120_Sub12_Sub36.anInt3424;
						if (i_14_ < 0) {
							i_14_ = 0;
						} else if (-65536 > (i_14_ ^ 0xffffffff)) {
							i_14_ = 65535;
						}
						long l = (Class120_Sub12_Sub2.aLong3146 - Class120_Sub14_Sub2.aLong3462) / 50L;
						if ((l ^ 0xffffffffffffffffL) < -32768L) {
							l = 32767L;
						}
						Class120_Sub14_Sub2.aLong3462 = Class120_Sub12_Sub2.aLong3146;
						int i_15_ = Class50.anInt449;
						if (i_15_ >= 0) {
							if (65535 < i_15_) {
								i_15_ = 65535;
							}
						} else {
							i_15_ = 0;
						}
						int i_16_ = 0;
						if (Class156.anInt1455 == 2) {
							i_16_ = 1;
						}
						Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putPacket(200);
						Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.method1093(-127, i_14_ << 16 | i_15_);
						final int i_17_ = (int) l;
						Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.method1116(-2076007248, i_16_ << 15 | i_17_);
					}
					if (NpcType.anInt1702 > 0) {
						NpcType.anInt1702--;
					}
					if (Class118.aBoolean1134 && NpcType.anInt1702 <= 0) {
						Class118.aBoolean1134 = false;
						NpcType.anInt1702 = 20;
						Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putPacket(140);
						Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.method1115(255, (int) Class120_Sub12_Sub21.aFloat3293);
						Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putLEShortA((int) OutputStream_Sub1.aFloat28);
					}
					if (InputStream_Sub1.focus && !Class179.aBoolean1779) {
						Class179.aBoolean1779 = true;
						Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putPacket(248);
						Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putByte(1);
						Class120_Sub12_Sub9.anInt3198++;
					}
					if (!InputStream_Sub1.focus && Class179.aBoolean1779) {
						Class179.aBoolean1779 = false;
						Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putPacket(248);
						Class120_Sub12_Sub9.anInt3198++;
						Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putByte(0);
					}
					if (!Class120_Sub14_Sub5.aBoolean3471) {
						Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putPacket(120);
						Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putInt(Class120_Sub12_Sub18.method1288());
						Class120_Sub14_Sub5.aBoolean3471 = true;
					}
					if (!Class188.aBoolean1925) {
						Class120_Sub15.aFloat2598 /= 2.0F;
					} else {
						Class188.aBoolean1925 = false;
					}
					if (!Class154.aBoolean1439) {
						Class120_Sub12_Sub4.aFloat3154 /= 2.0F;
					} else {
						Class154.aBoolean1439 = false;
					}
					Class120_Sub12_Sub35.method1385((byte) -108);
					if (Class109.gameState == 30) {
						Class120_Sub12.method1185(3);
						Class120_Sub12_Sub21_Sub1.method1315(-1122255295);
						Class120_Sub12_Sub21.method1306((byte) -124);
						Class88.anInt827++;
						if (Class88.anInt827 > 750) {
							Class100.method825((byte) -17);
						} else {
							Class101_Sub3.method848(2047);
							Class3.method82((byte) 97);
							Class120_Sub14_Sub24.method1648((byte) 127);
							for (int i_18_ = Class31.method263(2061, true); i_18_ != -1; i_18_ = Class31.method263(2061, false)) {
								Class120_Sub14_Sub15.method1554((byte) -98, i_18_);
								Class88.anIntArray833[Class120_Sub12_Sub3.method1207(Class27.anInt165++, 31)] = i_18_;
							}
							for (InterfaceChangeNode node = InterfaceChangeNode.poll(); node != null; node = InterfaceChangeNode.poll()) {
								final int i_19_ = node.getType();
								final int i_20_ = node.getUid();
								if (i_19_ == 1) {
									Class120_Sub12_Sub25.anIntArray3320[i_20_] = node.anInt3484;
									Class101_Sub4.anIntArray2296[Class120_Sub12_Sub3.method1207(Class120_Sub12_Sub23.anInt3308++, 31)] = i_20_;
								} else if (i_19_ != 2) {
									if (i_19_ != 3) {
										if (i_19_ == 4) {
											final Class189 class189 = Class74.method650(89, i_20_);
											final int i_21_ = node.anInt3484;
											final int i_22_ = node.anInt3492;
											final int i_23_ = node.anInt3486;
											if (class189.anInt2031 != i_21_ || i_22_ != class189.anInt1961 || class189.anInt1997 != i_23_) {
												class189.anInt1961 = i_22_;
												class189.anInt1997 = i_23_;
												class189.anInt2031 = i_21_;
												InterfaceClickMask.redrawInterface(class189);
											}
										} else if (i_19_ != 5) {
											if (i_19_ != 6) {
												if (i_19_ == 7) {
													final Class189 class189 = Class74.method650(-100, i_20_);
													final boolean bool = node.anInt3484 == 1;
													if (class189.aBoolean2045 == !bool) {
														class189.aBoolean2045 = bool;
														InterfaceClickMask.redrawInterface(class189);
													}
												} else if (i_19_ == 8) {
													final Class189 class189 = Class74.method650(-124, i_20_);
													if (class189.anInt2047 != node.anInt3484 || node.anInt3492 != class189.anInt2091 || node.anInt3486 != class189.anInt2005) {
														class189.anInt2091 = node.anInt3492;
														class189.anInt2005 = node.anInt3486;
														if (class189.anInt2030 != -1) {
															if (class189.anInt2069 > 0) {
																class189.anInt2005 = 32 * class189.anInt2005 / class189.anInt2069;
															} else if (class189.anInt2014 > 0) {
																class189.anInt2005 = class189.anInt2005 * 32 / class189.anInt2014;
															}
														}
														class189.anInt2047 = node.anInt3484;
														InterfaceClickMask.redrawInterface(class189);
													}
												} else if (i_19_ == 9) {
													final Class189 class189 = Class74.method650(75, i_20_);
													if (class189.anInt2030 != node.anInt3484 || class189.anInt2075 != node.anInt3492) {
														class189.anInt2075 = node.anInt3492;
														class189.anInt2030 = node.anInt3484;
														InterfaceClickMask.redrawInterface(class189);
													}
												} else if (i_19_ != 10) {
													if (i_19_ == 11) {
														final Class189 class189 = Class74.method650(-127, i_20_);
														class189.anInt2073 = class189.anInt2015 = node.anInt3484;
														class189.anInt1938 = class189.anInt2061 = node.anInt3492;
														class189.aByte2017 = (byte) 0;
														class189.aByte2051 = (byte) 0;
														InterfaceClickMask.redrawInterface(class189);
													} else if (i_19_ != 12) {
														if (i_19_ == 13) {
															final Class189 class189 = Class74.method650(-124, i_20_);
															class189.anInt1969 = node.anInt3484;
														}
													} else {
														final Class189 class189 = Class74.method650(71, i_20_);
														int i_24_ = node.anInt3484;
														if (class189 != null && class189.anInt1995 == 0) {
															if (-class189.anInt2059 + class189.anInt1937 < i_24_) {
																i_24_ = class189.anInt1937 - class189.anInt2059;
															}
															if (i_24_ < 0) {
																i_24_ = 0;
															}
															if (class189.anInt2021 != i_24_) {
																class189.anInt2021 = i_24_;
																InterfaceClickMask.redrawInterface(class189);
															}
														}
													}
												} else {
													final Class189 class189 = Class74.method650(-119, i_20_);
													if (class189.anInt2076 != node.anInt3484 || node.anInt3492 != class189.anInt1977 || class189.anInt1935 != node.anInt3486) {
														class189.anInt1977 = node.anInt3492;
														class189.anInt2076 = node.anInt3484;
														class189.anInt1935 = node.anInt3486;
														InterfaceClickMask.redrawInterface(class189);
													}
												}
											} else {
												final int i_25_ = node.anInt3484;
												final int i_26_ = 0x1f & i_25_ >> 5;
												final Class189 class189 = Class74.method650(74, i_20_);
												final int i_27_ = (0x7e28 & i_25_) >> 10;
												final int i_28_ = 0x1f & i_25_;
												final int i_29_ = (i_28_ << 3) + (i_27_ << 19) - -(i_26_ << 11);
												if (class189.anInt2025 != i_29_) {
													class189.anInt2025 = i_29_;
													InterfaceClickMask.redrawInterface(class189);
												}
											}
										} else {
											final Class189 class189 = Class74.method650(-92, i_20_);
											if (class189.anInt1945 != node.anInt3484 || (node.anInt3484 ^ 0xffffffff) == 0) {
												class189.anInt1946 = 0;
												class189.anInt1945 = node.anInt3484;
												class189.anInt2098 = 1;
												class189.anInt1965 = 0;
												InterfaceClickMask.redrawInterface(class189);
											}
										}
									} else {
										final Class189 class189 = Class74.method650(-119, i_20_);
										if (!node.aString3493.equals(class189.aString1950)) {
											class189.aString1950 = node.aString3493;
											InterfaceClickMask.redrawInterface(class189);
										}
									}
								} else {
									Class120_Sub2.aStringArray2420[i_20_] = node.aString3493;
									Class101_Sub4.anIntArray2304[Class120_Sub12_Sub3.method1207(31, Class112.anInt1077++)] = i_20_;
								}
							}
							if (Class120_Sub14_Sub22.crossState != 0) {
								Class120_Sub12_Sub7.crossIndex += 20;
								if (Class120_Sub12_Sub7.crossIndex >= 400) {
									Class120_Sub14_Sub22.crossState = 0;
								}
							}
							Class120_Sub12_Sub22.anInt3301++;
							if (Class32.aClass189_256 != null) {
								Class69_Sub2.anInt2236++;
								if (Class69_Sub2.anInt2236 >= 15) {
									InterfaceClickMask.redrawInterface(Class32.aClass189_256);
									Class32.aClass189_256 = null;
								}
							}
							if (Class180_Sub4.aClass189_2954 != null) {
								InterfaceClickMask.redrawInterface(Class180_Sub4.aClass189_2954);
								if (5 + Class23.anInt134 < Queue.anInt1767 || Queue.anInt1767 < Class23.anInt134 + -5 || Class191.anInt2113 > 5 + Class27.anInt166 || Class191.anInt2113 < -5 + Class27.anInt166) {
									Class126.aBoolean1207 = true;
								}
								Class120_Sub14_Sub3_Sub1.anInt3915++;
								if (InterfaceChangeNode.anInt3483 == 0) {
									if (Class126.aBoolean1207 && Class120_Sub14_Sub3_Sub1.anInt3915 >= 5) {
										if (Class180_Sub4.aClass189_2954 == Class120_Sub14_Sub16.aClass189_3588 && Class120_Sub13.anInt2572 != Class5.anInt2154) {
											final Class189 class189 = Class180_Sub4.aClass189_2954;
											int i_30_ = 0;
											if (Class189.anInt2027 == 1 && class189.anInt1975 == 206) {
												i_30_ = 1;
											}
											if (class189.anIntArray1978[Class120_Sub13.anInt2572] <= 0) {
												i_30_ = 0;
											}
											if (client.method54(class189).method1691(-45)) {
												final int i_31_ = Class120_Sub13.anInt2572;
												final int i_32_ = Class5.anInt2154;
												class189.anIntArray1978[i_31_] = class189.anIntArray1978[i_32_];
												class189.anIntArray1983[i_31_] = class189.anIntArray1983[i_32_];
												class189.anIntArray1978[i_32_] = -1;
												class189.anIntArray1983[i_32_] = 0;
											} else if (i_30_ == 1) {
												int i_33_ = Class5.anInt2154;
												final int i_34_ = Class120_Sub13.anInt2572;
												while (i_34_ != i_33_) {
													if (i_34_ < i_33_) {
														class189.method2496(i_33_, (byte) 89, i_33_ - 1);
														i_33_--;
													} else if (i_33_ < i_34_) {
														class189.method2496(i_33_, (byte) 89, 1 + i_33_);
														i_33_++;
													}
												}
											} else {
												class189.method2496(Class5.anInt2154, (byte) 88, Class120_Sub13.anInt2572);
											}
											Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putPacket(6);
											Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putLEShortA(Class120_Sub13.anInt2572);
											Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putByteS(i_30_);
											Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.method1086((byte) 21, Class180_Sub4.aClass189_2954.anInt1999);
											Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.method1115(255, Class5.anInt2154);
										}
									} else if (Class69.anInt617 != 1 && !Class120_Sub14_Sub4.method1438(0, Class186.anInt1906 + -1) || Class186.anInt1906 <= 2) {
										if (Class186.anInt1906 > 0) {
											Class191.method2508((byte) -125);
										}
									} else {
										Class120_Sub12_Sub28.method1349((byte) 77);
									}
									Class69_Sub2.anInt2236 = 10;
									Class180_Sub4.aClass189_2954 = null;
									Class156.anInt1455 = 0;
								}
							}
							Class111.aBoolean1058 = false;
							LocType.aClass189_1818 = null;
							ObjType.anInt1551 = 0;
							final Class189 class189 = CursorType.aClass189_1243;
							CursorType.aClass189_1243 = null;
							final Class189 class189_35_ = Class49.aClass189_441;
							Class49.aClass189_441 = null;
							Class151.aBoolean1419 = false;
							for (/**/; Class120_Sub12_Sub13.method1265((byte) -66) && ObjType.anInt1551 < 128; ObjType.anInt1551++) {
								Class134.anIntArray1285[ObjType.anInt1551] = Class35.anInt301;
								Class120_Sub19.anIntArray2658[ObjType.anInt1551] = ObjType.aChar1536;
							}
							Class142.aClass189_1362 = null;
							if (Class69.anInt616 != -1) {
								Class120_Sub6.method1074(Class69.anInt616, Class69_Sub1.canvasWidth, 0, 0, 0, 0, -115, Class120_Sub12_Sub5.canvasHeight);
							}
							Class160.anInt1494++;
							if (Class142.aClass189_1362 != null) {
								Class116.method1009((byte) -107);
							}
							for (;;) {
								final Class120_Sub10 class120_sub10 = (Class120_Sub10) Class120_Sub4.aClass105_2435.removeFront();
								if (class120_sub10 == null) {
									break;
								}
								final Class189 class189_36_ = class120_sub10.aClass189_2534;
								if (class189_36_.anInt2083 >= 0) {
									final Class189 class189_37_ = Class74.method650(-103, class189_36_.anInt2029);
									if (class189_37_ == null || class189_37_.aClass189Array2072 == null || class189_37_.aClass189Array2072.length <= class189_36_.anInt2083 || class189_37_.aClass189Array2072[class189_36_.anInt2083] != class189_36_) {
										continue;
									}
								}
								Class88.method744(true, class120_sub10);
							}
							for (;;) {
								final Class120_Sub10 class120_sub10 = (Class120_Sub10) FileSystem.aClass105_456.removeFront();
								if (class120_sub10 == null) {
									break;
								}
								final Class189 class189_38_ = class120_sub10.aClass189_2534;
								if (class189_38_.anInt2083 >= 0) {
									final Class189 class189_39_ = Class74.method650(33, class189_38_.anInt2029);
									if (class189_39_ == null || class189_39_.aClass189Array2072 == null || class189_39_.aClass189Array2072.length <= class189_38_.anInt2083 || class189_38_ != class189_39_.aClass189Array2072[class189_38_.anInt2083]) {
										continue;
									}
								}
								Class88.method744(true, class120_sub10);
							}
							for (;;) {
								final Class120_Sub10 class120_sub10 = (Class120_Sub10) Class88.aClass105_829.removeFront();
								if (class120_sub10 == null) {
									break;
								}
								final Class189 class189_40_ = class120_sub10.aClass189_2534;
								if (class189_40_.anInt2083 >= 0) {
									final Class189 class189_41_ = Class74.method650(-99, class189_40_.anInt2029);
									if (class189_41_ == null || class189_41_.aClass189Array2072 == null || class189_40_.anInt2083 >= class189_41_.aClass189Array2072.length || class189_41_.aClass189Array2072[class189_40_.anInt2083] != class189_40_) {
										continue;
									}
								}
								Class88.method744(true, class120_sub10);
							}
							if (Class142.aClass189_1362 == null) {
								Class120_Sub14_Sub2.anInt3450 = 0;
							}
							if (Class120_Sub12_Sub4.aClass189_3156 != null) {
								Class120_Sub14_Sub3_Sub1.method1435(-2);
							}
							if (Class86.anInt821 > 0 && Class35.aBooleanArray299[82] && Class35.aBooleanArray299[81] && Class66.anInt598 != 0) {
								int i_42_ = -Class66.anInt598 + Class173.gameLevel;
								if (i_42_ < 0) {
									i_42_ = 0;
								} else if (i_42_ > 3) {
									i_42_ = 3;
								}
								Class108.method930((byte) -120, Class100.selfPlayer.anIntArray2958[0] + GameEntity.currentBaseX, Class181.currentBaseZ + Class100.selfPlayer.anIntArray3040[0], i_42_);
							}
							if (Class86.anInt821 <= 0 || !Class35.aBooleanArray299[82] || !Class35.aBooleanArray299[81]) {
								if (Class120_Sub14_Sub5.anInt3479 != 2) {
									if (Class120_Sub12_Sub33.anInt3401 != 2) {
										if ((Class21.anInt122 ^ 0xffffffff) != 0 && Class120_Sub14_Sub5.anInt3479 == 0 && Class120_Sub12_Sub33.anInt3401 == 0) {
											final int i_43_ = (Class21.anInt122 << 1) + -Class100.selfPlayer.getSize() + 1 >> 1;
											final int i_44_ = (Class20.anInt2174 << 1) - Class100.selfPlayer.getSize() + 1 >> 1;
											Class53_Sub1.method464(i_43_, 0, i_44_);
											Class120_Sub12_Sub35.crossX = Class50.anInt449;
											IsaacCipher.crossY = Class120_Sub12_Sub36.anInt3424;
											Class120_Sub14_Sub22.crossState = 1;
											Class120_Sub12_Sub7.crossIndex = 0;
											Class120_Sub14_Sub5.method1440(Class100.selfPlayer.anIntArray2958[0], 0, 0, true, 0, i_44_, Class100.selfPlayer.anIntArray3040[0], 0, (byte) -99, 0, i_43_);
										}
									} else {
										if ((Class21.anInt122 ^ 0xffffffff) != 0) {
											Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putPacket(85);
											Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putLEShortA(GameEntity.currentBaseX + Class21.anInt122);
											Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.method1115(255, Class181.currentBaseZ - -Class20.anInt2174);
											Class120_Sub14_Sub22.crossState = 1;
											Class120_Sub12_Sub7.crossIndex = 0;
											IsaacCipher.crossY = Class120_Sub12_Sub36.anInt3424;
											Class120_Sub12_Sub35.crossX = Class50.anInt449;
										}
										Class120_Sub12_Sub33.anInt3401 = 0;
									}
								} else {
									if (Class21.anInt122 != -1) {
										Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putPacket(204);
										Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.method1116(-2076007248, Class20.anInt2174 + Class181.currentBaseZ);
										Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.method1116(-2076007248, Class46.anInt420);
										Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.method1086((byte) 21, AbstractMouseWheelHandler.anInt119);
										Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.method1115(255, Class21.anInt122 + GameEntity.currentBaseX);
										Class120_Sub12_Sub35.crossX = Class50.anInt449;
										Class120_Sub14_Sub22.crossState = 1;
										Class120_Sub12_Sub7.crossIndex = 0;
										IsaacCipher.crossY = Class120_Sub12_Sub36.anInt3424;
									}
									Class120_Sub14_Sub5.anInt3479 = 0;
								}
							} else {
								if (Class21.anInt122 != -1) {
									Class108.method930((byte) -120, Class21.anInt122 + GameEntity.currentBaseX, Class20.anInt2174 + Class181.currentBaseZ, Class173.gameLevel);
								}
								Class120_Sub14_Sub5.anInt3479 = Class120_Sub12_Sub33.anInt3401 = 0;
							}
							Class21.anInt122 = -1;
							CursorType.method1918(13);
							if (class189 != CursorType.aClass189_1243) {
								if (class189 != null) {
									InterfaceClickMask.redrawInterface(class189);
								}
								if (CursorType.aClass189_1243 != null) {
									InterfaceClickMask.redrawInterface(CursorType.aClass189_1243);
								}
							}
							if (class189_35_ != Class49.aClass189_441 && Class120_Sub12_Sub21.anInt3291 == Class108.anInt1031) {
								if (class189_35_ != null) {
									InterfaceClickMask.redrawInterface(class189_35_);
								}
								if (Class49.aClass189_441 != null) {
									InterfaceClickMask.redrawInterface(Class49.aClass189_441);
								}
							}
							if (Class49.aClass189_441 != null) {
								if (Class108.anInt1031 < Class120_Sub12_Sub21.anInt3291) {
									Class108.anInt1031++;
									if (Class120_Sub12_Sub21.anInt3291 == Class108.anInt1031) {
										InterfaceClickMask.redrawInterface(Class49.aClass189_441);
									}
								}
							} else if (Class108.anInt1031 > 0) {
								Class108.anInt1031--;
							}
							for (int i_45_ = 0; i_45_ < 5; i_45_++) {
								Class120_Sub1.anIntArray2412[i_45_]++;
							}
							if (i > -70) {
								method1695(88, -89, -117, 117, (byte) -65);
							}
							final int i_46_ = Class182.method2444(0);
							final int i_47_ = Class69_Sub2_Sub1.method623(1);
							if (i_46_ > 15000 && i_47_ > 15000) {
								Class31.anInt244 = 250;
								Class120_Sub12_Sub39.method1402(3, 14500);
								Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putPacket(91);
							}
							if (Class3.aClass185_56 != null && Class3.aClass185_56.status == 1) {
								if (Class3.aClass185_56.value != null) {
									Class188.method2482(124, Class151.aString1421, Class99.aBoolean950);
								}
								Class151.aString1421 = null;
								Class3.aClass185_56 = null;
								Class99.aBoolean950 = false;
							}
							Class120_Sub12_Sub7.anInt3184++;
							Class65.anInt593++;
							Class120_Sub14_Sub24.anInt3666++;
							if (Class120_Sub12_Sub7.anInt3184 > 500) {
								Class120_Sub12_Sub7.anInt3184 = 0;
								final int i_48_ = (int) (8.0 * Math.random());
								if ((0x2 & i_48_) == 2) {
									Class29.anInt195 += Class120_Sub30_Sub1.anInt3671;
								}
								if ((i_48_ & 0x1) == 1) {
									Class23.anInt136 += Class120_Sub14_Sub22.anInt3637;
								}
								if ((0x4 & i_48_) == 4) {
									Class120_Sub14_Sub1.anInt3447 += Class30.anInt231;
								}
							}
							if (Class29.anInt195 < -55) {
								Class120_Sub30_Sub1.anInt3671 = 2;
							}
							if (Class29.anInt195 > 55) {
								Class120_Sub30_Sub1.anInt3671 = -2;
							}
							if (Class23.anInt136 < -50) {
								Class120_Sub14_Sub22.anInt3637 = 2;
							}
							if (Class120_Sub14_Sub24.anInt3666 > 500) {
								Class120_Sub14_Sub24.anInt3666 = 0;
								final int i_49_ = (int) (8.0 * Math.random());
								if ((i_49_ & 0x1) == 1) {
									Class164.anInt1590 += Class143.anInt2188;
								}
								if ((i_49_ & 0x2) == 2) {
									Class154.anInt1442 += Class132_Sub1.anInt2814;
								}
							}
							if (Class154.anInt1442 < -20) {
								Class132_Sub1.anInt2814 = 1;
							}
							if (Class23.anInt136 > 50) {
								Class120_Sub14_Sub22.anInt3637 = -2;
							}
							if (Class164.anInt1590 < -60) {
								Class143.anInt2188 = 2;
							}
							if (Class164.anInt1590 > 60) {
								Class143.anInt2188 = -2;
							}
							if (Class120_Sub14_Sub1.anInt3447 < -40) {
								Class30.anInt231 = 1;
							}
							if (Class120_Sub14_Sub1.anInt3447 > 40) {
								Class30.anInt231 = -1;
							}
							if (Class154.anInt1442 > 10) {
								Class132_Sub1.anInt2814 = -1;
							}
							if (Class65.anInt593 > 50) {
								Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putPacket(137);
								Class158.anInt1477++;
							}
							if (Class30.interfaceCounterUpdated) {
								GroundObject.method1628();
								Class30.interfaceCounterUpdated = false;
							}
							try {
								if (AbstractTimer.aClass46_825 != null && Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.pos > 0) {
									AbstractTimer.aClass46_825.method381(0, Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.buf, Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.pos, 30000);
									Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.pos = 0;
									Class65.anInt593 = 0;
								}
							} catch (final IOException ioexception) {
								Class100.method825((byte) -94);
							}
						}
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("pl.B(").append(i).append(')').toString());
		}
	}

	public Class120_Sub21() {
		/* empty */
	}

	Class120_Sub21(final String string, final int i) {
		this.aString2666 = string;
	}
}
