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
			final InterfaceChangeNode class120_sub14_sub7 = AbstractObject.putInterfaceChange(4, i_1_);
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
			Class31.aClass50_241.getFileAmount(36);
			if (i != -11) {
				aString2665 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("pl.F(").append(i).append(',').append(class50 != null ? "{...}" : "null").append(',').append(class50_4_ != null ? "{...}" : "null").append(')').toString());
		}
	}

	static final void joinClanChat(final long l) {
		if (l != 0L) {
			Class120_Sub12_Sub11.outputStream.putByteIsaac(218);
			Class120_Sub12_Sub11.outputStream.putLong(l);
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
			if (Class120_Sub12_Sub5.errorPinging) {
				Class120_Sub12_Sub5.errorPinging = false;
				Class100.dropClient();
			} else {
				for (int i_5_ = 0; i_5_ < 100 && Class182.method2445(0); i_5_++) {
					/* empty */
				}
				if (Class109.gameState == 30) {
					OverridedJInterface.method1722(Class120_Sub12_Sub11.outputStream, true, 78);
					synchronized (Class110.aClass91_1055.anObject857) {
						if (Class127.aBoolean1211) {
							if (Class156.lastMouseClick != 0 || Class110.aClass91_1055.anInt859 >= 40) {
								Class120_Sub12_Sub11.outputStream.putByteIsaac(199);
								Class120_Sub12_Sub11.outputStream.putByte(0);
								int i_6_ = 0;
								final int i_7_ = Class120_Sub12_Sub11.outputStream.pos;
								for (int i_8_ = 0; i_8_ < Class110.aClass91_1055.anInt859 && Class120_Sub12_Sub11.outputStream.pos - i_7_ < 240; i_8_++) {
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
											Class120_Sub12_Sub11.outputStream.putShort((Class120_Sub12_Sub11.anInt3214 << 12) - (-(i_12_ << 6) - i_11_));
											Class120_Sub12_Sub11.anInt3214 = 0;
										} else if (Class120_Sub12_Sub11.anInt3214 < 32 && i_12_ >= -128 && i_12_ <= 127 && i_11_ >= -128 && i_11_ <= 127) {
											Class120_Sub12_Sub11.outputStream.putByte(128 + Class120_Sub12_Sub11.anInt3214);
											i_11_ += 128;
											i_12_ += 128;
											Class120_Sub12_Sub11.outputStream.putShort((i_12_ << 8) - -i_11_);
											Class120_Sub12_Sub11.anInt3214 = 0;
										} else if (Class120_Sub12_Sub11.anInt3214 < 32) {
											Class120_Sub12_Sub11.outputStream.putByte(Class120_Sub12_Sub11.anInt3214 + 192);
											if (!bool) {
												Class120_Sub12_Sub11.outputStream.putInt(i_9_ | i_10_ << 16);
											} else {
												Class120_Sub12_Sub11.outputStream.putInt(-2147483648);
											}
											Class120_Sub12_Sub11.anInt3214 = 0;
										} else {
											Class120_Sub12_Sub11.outputStream.putShort(Class120_Sub12_Sub11.anInt3214 + 57344);
											if (!bool) {
												Class120_Sub12_Sub11.outputStream.putInt(i_9_ | i_10_ << 16);
											} else {
												Class120_Sub12_Sub11.outputStream.putInt(-2147483648);
											}
											Class120_Sub12_Sub11.anInt3214 = 0;
										}
									}
								}
								Class120_Sub12_Sub11.outputStream.putSizedByte(Class120_Sub12_Sub11.outputStream.pos - i_7_);
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
					if (Class156.lastMouseClick != 0) {
						int i_14_ = Class120_Sub12_Sub36.lastClickY;
						if (i_14_ < 0) {
							i_14_ = 0;
						} else if (-65536 > (i_14_ ^ 0xffffffff)) {
							i_14_ = 65535;
						}
						long l = (Class120_Sub12_Sub2.lastClickTime - Class120_Sub14_Sub2.aLong3462) / 50L;
						if ((l ^ 0xffffffffffffffffL) < -32768L) {
							l = 32767L;
						}
						Class120_Sub14_Sub2.aLong3462 = Class120_Sub12_Sub2.lastClickTime;
						int i_15_ = Class50.lastClickX;
						if (i_15_ >= 0) {
							if (65535 < i_15_) {
								i_15_ = 65535;
							}
						} else {
							i_15_ = 0;
						}
						int i_16_ = 0;
						if (Class156.lastMouseClick == 2) {
							i_16_ = 1;
						}
						Class120_Sub12_Sub11.outputStream.putByteIsaac(200);
						Class120_Sub12_Sub11.outputStream.putInt1(i_14_ << 16 | i_15_);
						final int i_17_ = (int) l;
						Class120_Sub12_Sub11.outputStream.putShortA(i_16_ << 15 | i_17_);
					}
					if (NpcType.anInt1702 > 0) {
						NpcType.anInt1702--;
					}
					if (Class118.aBoolean1134 && NpcType.anInt1702 <= 0) {
						Class118.aBoolean1134 = false;
						NpcType.anInt1702 = 20;
						Class120_Sub12_Sub11.outputStream.putByteIsaac(140);
						Class120_Sub12_Sub11.outputStream.putLEShort((int) Class120_Sub12_Sub21.aFloat3293);
						Class120_Sub12_Sub11.outputStream.putLEShortA((int) DummyOutputStream.aFloat28);
					}
					if (DummyInputStream.focus && !Class179.aBoolean1779) {
						Class179.aBoolean1779 = true;
						Class120_Sub12_Sub11.outputStream.putByteIsaac(248);
						Class120_Sub12_Sub11.outputStream.putByte(1);
					}
					if (!DummyInputStream.focus && Class179.aBoolean1779) {
						Class179.aBoolean1779 = false;
						Class120_Sub12_Sub11.outputStream.putByteIsaac(248);
						Class120_Sub12_Sub11.outputStream.putByte(0);
					}
					if (!Class120_Sub14_Sub5.aBoolean3471) {
						Class120_Sub12_Sub11.outputStream.putByteIsaac(120);
						Class120_Sub12_Sub11.outputStream.putInt(Class120_Sub12_Sub18.method1288());
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
							Class100.dropClient();
						} else {
							Class101_Sub3.method848(2047);
							Class3.method82((byte) 97);
							Class120_Sub14_Sub24.updateEntityText();
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
											final JagexInterface jagexInterface = Class74.getJagexInterface(i_20_);
											final int i_21_ = node.anInt3484;
											final int i_22_ = node.anInt3492;
											final int i_23_ = node.anInt3486;
											if (jagexInterface.modelTypeDisabled != i_21_ || i_22_ != jagexInterface.mediaIdDisabled || jagexInterface.anInt1997 != i_23_) {
												jagexInterface.mediaIdDisabled = i_22_;
												jagexInterface.anInt1997 = i_23_;
												jagexInterface.modelTypeDisabled = i_21_;
												InterfaceClickMask.redrawInterface(jagexInterface);
											}
										} else if (i_19_ != 5) {
											if (i_19_ != 6) {
												if (i_19_ == 7) {
													final JagexInterface jagexInterface = Class74.getJagexInterface(i_20_);
													final boolean bool = node.anInt3484 == 1;
													if (jagexInterface.hidden == !bool) {
														jagexInterface.hidden = bool;
														InterfaceClickMask.redrawInterface(jagexInterface);
													}
												} else if (i_19_ == 8) {
													final JagexInterface jagexInterface = Class74.getJagexInterface(i_20_);
													if (jagexInterface.rotateX != node.anInt3484 || node.anInt3492 != jagexInterface.rotateY || node.anInt3486 != jagexInterface.zoom) {
														jagexInterface.rotateY = node.anInt3492;
														jagexInterface.zoom = node.anInt3486;
														if (jagexInterface.anInt2030 != -1) {
															if (jagexInterface.anInt2069 > 0) {
																jagexInterface.zoom = 32 * jagexInterface.zoom / jagexInterface.anInt2069;
															} else if (jagexInterface.originalWidth > 0) {
																jagexInterface.zoom = jagexInterface.zoom * 32 / jagexInterface.originalWidth;
															}
														}
														jagexInterface.rotateX = node.anInt3484;
														InterfaceClickMask.redrawInterface(jagexInterface);
													}
												} else if (i_19_ == 9) {
													final JagexInterface jagexInterface = Class74.getJagexInterface(i_20_);
													if (jagexInterface.anInt2030 != node.anInt3484 || jagexInterface.anInt2075 != node.anInt3492) {
														jagexInterface.anInt2075 = node.anInt3492;
														jagexInterface.anInt2030 = node.anInt3484;
														InterfaceClickMask.redrawInterface(jagexInterface);
													}
												} else if (i_19_ != 10) {
													if (i_19_ == 11) {
														final JagexInterface jagexInterface = Class74.getJagexInterface(i_20_);
														jagexInterface.x = jagexInterface.originalX = node.anInt3484;
														jagexInterface.y = jagexInterface.originalY = node.anInt3492;
														jagexInterface.aByte2017 = (byte) 0;
														jagexInterface.aByte2051 = (byte) 0;
														InterfaceClickMask.redrawInterface(jagexInterface);
													} else if (i_19_ != 12) {
														if (i_19_ == 13) {
															final JagexInterface jagexInterface = Class74.getJagexInterface(i_20_);
															jagexInterface.rotateSpeed = node.anInt3484;
														}
													} else {
														final JagexInterface jagexInterface = Class74.getJagexInterface(i_20_);
														int i_24_ = node.anInt3484;
														if (jagexInterface != null && jagexInterface.type == 0) {
															if (-jagexInterface.anInt2059 + jagexInterface.maxScrollVertical < i_24_) {
																i_24_ = jagexInterface.maxScrollVertical - jagexInterface.anInt2059;
															}
															if (i_24_ < 0) {
																i_24_ = 0;
															}
															if (jagexInterface.horizontalScrollPosition != i_24_) {
																jagexInterface.horizontalScrollPosition = i_24_;
																InterfaceClickMask.redrawInterface(jagexInterface);
															}
														}
													}
												} else {
													final JagexInterface jagexInterface = Class74.getJagexInterface(i_20_);
													if (jagexInterface.anInt2076 != node.anInt3484 || node.anInt3492 != jagexInterface.anInt1977 || jagexInterface.rotateZ != node.anInt3486) {
														jagexInterface.anInt1977 = node.anInt3492;
														jagexInterface.anInt2076 = node.anInt3484;
														jagexInterface.rotateZ = node.anInt3486;
														InterfaceClickMask.redrawInterface(jagexInterface);
													}
												}
											} else {
												final int i_25_ = node.anInt3484;
												final int i_26_ = 0x1f & i_25_ >> 5;
												final JagexInterface jagexInterface = Class74.getJagexInterface(i_20_);
												final int i_27_ = (0x7e28 & i_25_) >> 10;
												final int i_28_ = 0x1f & i_25_;
												final int i_29_ = (i_28_ << 3) + (i_27_ << 19) - -(i_26_ << 11);
												if (jagexInterface.disabledColor != i_29_) {
													jagexInterface.disabledColor = i_29_;
													InterfaceClickMask.redrawInterface(jagexInterface);
												}
											}
										} else {
											final JagexInterface jagexInterface = Class74.getJagexInterface(i_20_);
											if (jagexInterface.disabledAnim != node.anInt3484 || (node.anInt3484 ^ 0xffffffff) == 0) {
												jagexInterface.currentFrame = 0;
												jagexInterface.disabledAnim = node.anInt3484;
												jagexInterface.nextFrame = 1;
												jagexInterface.frameDelay = 0;
												InterfaceClickMask.redrawInterface(jagexInterface);
											}
										}
									} else {
										final JagexInterface jagexInterface = Class74.getJagexInterface(i_20_);
										if (!node.aString3493.equals(jagexInterface.disabledText)) {
											jagexInterface.disabledText = node.aString3493;
											InterfaceClickMask.redrawInterface(jagexInterface);
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
							Class120_Sub12_Sub22.redrawRate++;
							if (Class32.aClass189_256 != null) {
								Class69_Sub2.anInt2236++;
								if (Class69_Sub2.anInt2236 >= 15) {
									InterfaceClickMask.redrawInterface(Class32.aClass189_256);
									Class32.aClass189_256 = null;
								}
							}
							if (Class180_Sub4.aClass189_2954 != null) {
								InterfaceClickMask.redrawInterface(Class180_Sub4.aClass189_2954);
								if (5 + Class23.anInt134 < Queue.lastMouseX || Queue.lastMouseX < Class23.anInt134 + -5 || Class191.lastMouseY > 5 + Class27.anInt166 || Class191.lastMouseY < -5 + Class27.anInt166) {
									Class126.aBoolean1207 = true;
								}
								JavaObject.anInt3915++;
								if (InterfaceChangeNode.lastMousePress == 0) {
									if (Class126.aBoolean1207 && JavaObject.anInt3915 >= 5) {
										if (Class180_Sub4.aClass189_2954 == Class120_Sub14_Sub16.aClass189_3588 && Class120_Sub13.anInt2572 != Class5.anInt2154) {
											final JagexInterface jagexInterface = Class180_Sub4.aClass189_2954;
											int i_30_ = 0;
											if (JagexInterface.anInt2027 == 1 && jagexInterface.clientCode == 206) {
												i_30_ = 1;
											}
											if (jagexInterface.objAmounts[Class120_Sub13.anInt2572] <= 0) {
												i_30_ = 0;
											}
											if (client.getClickMask(jagexInterface).method1691(-45)) {
												final int i_31_ = Class120_Sub13.anInt2572;
												final int i_32_ = Class5.anInt2154;
												jagexInterface.objAmounts[i_31_] = jagexInterface.objAmounts[i_32_];
												jagexInterface.objIds[i_31_] = jagexInterface.objIds[i_32_];
												jagexInterface.objAmounts[i_32_] = -1;
												jagexInterface.objIds[i_32_] = 0;
											} else if (i_30_ == 1) {
												int i_33_ = Class5.anInt2154;
												final int i_34_ = Class120_Sub13.anInt2572;
												while (i_34_ != i_33_) {
													if (i_34_ < i_33_) {
														jagexInterface.method2496(i_33_, (byte) 89, i_33_ - 1);
														i_33_--;
													} else if (i_33_ < i_34_) {
														jagexInterface.method2496(i_33_, (byte) 89, 1 + i_33_);
														i_33_++;
													}
												}
											} else {
												jagexInterface.method2496(Class5.anInt2154, (byte) 88, Class120_Sub13.anInt2572);
											}
											Class120_Sub12_Sub11.outputStream.putByteIsaac(6);
											Class120_Sub12_Sub11.outputStream.putLEShortA(Class120_Sub13.anInt2572);
											Class120_Sub12_Sub11.outputStream.putByteS(i_30_);
											Class120_Sub12_Sub11.outputStream.putInt2(Class180_Sub4.aClass189_2954.bitPacked);
											Class120_Sub12_Sub11.outputStream.putLEShort(Class5.anInt2154);
										}
									} else if (Class69.anInt617 != 1 && !Class120_Sub14_Sub4.method1438(0, Class186.menuOptionCount + -1) || Class186.menuOptionCount <= 2) {
										if (Class186.menuOptionCount > 0) {
											Class191.method2508((byte) -125);
										}
									} else {
										Class120_Sub12_Sub28.determineMenuSize();
									}
									Class69_Sub2.anInt2236 = 10;
									Class180_Sub4.aClass189_2954 = null;
									Class156.lastMouseClick = 0;
								}
							}
							Class111.aBoolean1058 = false;
							LocType.aClass189_1818 = null;
							ObjType.anInt1551 = 0;
							final JagexInterface jagexInterface = CursorType.aClass189_1243;
							CursorType.aClass189_1243 = null;
							final JagexInterface class189_35_ = Class49.aClass189_441;
							Class49.aClass189_441 = null;
							WorldInfo.aBoolean1419 = false;
							for (/**/; Class120_Sub12_Sub13.method1265((byte) -66) && ObjType.anInt1551 < 128; ObjType.anInt1551++) {
								Class134.anIntArray1285[ObjType.anInt1551] = Class35.anInt301;
								Class120_Sub19.anIntArray2658[ObjType.anInt1551] = ObjType.aChar1536;
							}
							Class142.aClass189_1362 = null;
							if (Class69.rootInterfaceId != -1) {
								Class120_Sub6.method1074(Class69.rootInterfaceId, Class69_Sub1.canvasWidth, 0, 0, 0, 0, Class120_Sub12_Sub5.canvasHeight);
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
								final JagexInterface class189_36_ = class120_sub10.aClass189_2534;
								if (class189_36_.anInt2083 >= 0) {
									final JagexInterface class189_37_ = Class74.getJagexInterface(class189_36_.parent);
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
								final JagexInterface class189_38_ = class120_sub10.aClass189_2534;
								if (class189_38_.anInt2083 >= 0) {
									final JagexInterface class189_39_ = Class74.getJagexInterface(class189_38_.parent);
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
								final JagexInterface class189_40_ = class120_sub10.aClass189_2534;
								if (class189_40_.anInt2083 >= 0) {
									final JagexInterface class189_41_ = Class74.getJagexInterface(class189_40_.parent);
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
								JavaObject.method1435(-2);
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
										if ((Cache.anInt122 ^ 0xffffffff) != 0 && Class120_Sub14_Sub5.anInt3479 == 0 && Class120_Sub12_Sub33.anInt3401 == 0) {
											final int i_43_ = (Cache.anInt122 << 1) + -Class100.selfPlayer.getSize() + 1 >> 1;
											final int i_44_ = (Class20.anInt2174 << 1) - Class100.selfPlayer.getSize() + 1 >> 1;
											Class53_Sub1.method464(i_43_, 0, i_44_);
											Class120_Sub12_Sub35.crossX = Class50.lastClickX;
											IsaacCipher.crossY = Class120_Sub12_Sub36.lastClickY;
											Class120_Sub14_Sub22.crossState = 1;
											Class120_Sub12_Sub7.crossIndex = 0;
											Class120_Sub14_Sub5.method1440(Class100.selfPlayer.anIntArray2958[0], 0, 0, true, 0, i_44_, Class100.selfPlayer.anIntArray3040[0], 0, (byte) -99, 0, i_43_);
										}
									} else {
										if ((Cache.anInt122 ^ 0xffffffff) != 0) {
											Class120_Sub12_Sub11.outputStream.putByteIsaac(85);
											Class120_Sub12_Sub11.outputStream.putLEShortA(GameEntity.currentBaseX + Cache.anInt122);
											Class120_Sub12_Sub11.outputStream.putLEShort(Class181.currentBaseZ - -Class20.anInt2174);
											Class120_Sub14_Sub22.crossState = 1;
											Class120_Sub12_Sub7.crossIndex = 0;
											IsaacCipher.crossY = Class120_Sub12_Sub36.lastClickY;
											Class120_Sub12_Sub35.crossX = Class50.lastClickX;
										}
										Class120_Sub12_Sub33.anInt3401 = 0;
									}
								} else {
									if (Cache.anInt122 != -1) {
										Class120_Sub12_Sub11.outputStream.putByteIsaac(204);
										Class120_Sub12_Sub11.outputStream.putShortA(Class20.anInt2174 + Class181.currentBaseZ);
										Class120_Sub12_Sub11.outputStream.putShortA(JagexSocket.anInt420);
										Class120_Sub12_Sub11.outputStream.putInt2(AbstractMouseWheelHandler.anInt119);
										Class120_Sub12_Sub11.outputStream.putLEShort(Cache.anInt122 + GameEntity.currentBaseX);
										Class120_Sub12_Sub35.crossX = Class50.lastClickX;
										Class120_Sub14_Sub22.crossState = 1;
										Class120_Sub12_Sub7.crossIndex = 0;
										IsaacCipher.crossY = Class120_Sub12_Sub36.lastClickY;
									}
									Class120_Sub14_Sub5.anInt3479 = 0;
								}
							} else {
								if (Cache.anInt122 != -1) {
									Class108.method930((byte) -120, Cache.anInt122 + GameEntity.currentBaseX, Class20.anInt2174 + Class181.currentBaseZ, Class173.gameLevel);
								}
								Class120_Sub14_Sub5.anInt3479 = Class120_Sub12_Sub33.anInt3401 = 0;
							}
							Cache.anInt122 = -1;
							CursorType.method1918(13);
							if (jagexInterface != CursorType.aClass189_1243) {
								if (jagexInterface != null) {
									InterfaceClickMask.redrawInterface(jagexInterface);
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
							final int i_46_ = Class182.getMouseIdleCycle();
							final int i_47_ = Class69_Sub2_Sub1.method623(1);
							if (i_46_ > 15000 && i_47_ > 15000) {
								Class31.anInt244 = 250;
								Class120_Sub12_Sub39.setMouseIdleCycle(14500);
								Class120_Sub12_Sub11.outputStream.putByteIsaac(91);
							}
							if (Class3.aClass185_56 != null && Class3.aClass185_56.status == 1) {
								if (Class3.aClass185_56.value != null) {
									Class188.method2482(WorldInfo.aString1421, Class99.aBoolean950);
								}
								WorldInfo.aString1421 = null;
								Class3.aClass185_56 = null;
								Class99.aBoolean950 = false;
							}
							Class120_Sub12_Sub7.anInt3184++;
							Class65.pingTimer++;
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
							if (Class65.pingTimer > 50) {
								Class120_Sub12_Sub11.outputStream.putByteIsaac(137);
							}
							if (Class30.interfaceCounterUpdated) {
								GroundObjectNode.method1628();
								Class30.interfaceCounterUpdated = false;
							}
							try {
								if (AbstractTimer.worldConnection != null && Class120_Sub12_Sub11.outputStream.pos > 0) {
									AbstractTimer.worldConnection.put(Class120_Sub12_Sub11.outputStream.buf, 0, Class120_Sub12_Sub11.outputStream.pos);
									Class120_Sub12_Sub11.outputStream.pos = 0;
									Class65.pingTimer = 0;
								}
							} catch (final IOException ioexception) {
								Class100.dropClient();
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
