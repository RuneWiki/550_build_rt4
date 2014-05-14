/* Class120_Sub12_Sub9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class120_Sub12_Sub9 extends Class120_Sub12 {
	private boolean aBoolean3192 = true;
	static int anInt3193;
	static boolean[] aBooleanArray3194 = new boolean[200];
	static int anInt3195 = -1;
	static Cache aClass21_3196 = new Cache(16);
	private boolean aBoolean3197 = true;
	static int anInt3199 = 0;

	static final void method1244(final JagexInterface jagexInterface, final int i, final int i_0_, final int i_1_) {
		try {
			if (jagexInterface.anInt1996 == 1) {
				Class120_Sub14_Sub6.addMenuOption(0L, 0, jagexInterface.bitPacked, "", jagexInterface.aString1934, (short) 57, -1);
			}
			if (jagexInterface.anInt1996 == 2 && !Class88.aBoolean828) {
				final String string = Class33.method277((byte) 117, jagexInterface);
				if (string != null) {
					Class120_Sub14_Sub6.addMenuOption(0L, -1, jagexInterface.bitPacked, new StringBuilder("<col=00ff00>").append(jagexInterface.aString1979).toString(), string, (short) 34, -1);
				}
			}
			if (jagexInterface.anInt1996 == 3) {
				Class120_Sub14_Sub6.addMenuOption(0L, 0, jagexInterface.bitPacked, "", Class5.aString2153, (short) 7, -1);
			}
			if (i <= 78) {
				method1245(-53, 52, null);
			}
			if (jagexInterface.anInt1996 == 4) {
				Class120_Sub14_Sub6.addMenuOption(0L, 0, jagexInterface.bitPacked, "", jagexInterface.aString1934, (short) 18, -1);
			}
			if (jagexInterface.anInt1996 == 5) {
				Class120_Sub14_Sub6.addMenuOption(0L, 0, jagexInterface.bitPacked, "", jagexInterface.aString1934, (short) 11, -1);
			}
			if (jagexInterface.anInt1996 == 6 && Class156.aClass189_1454 == null) {
				Class120_Sub14_Sub6.addMenuOption(0L, -1, jagexInterface.bitPacked, "", jagexInterface.aString1934, (short) 3, -1);
			}
			if (jagexInterface.type == 2) {
				int i_2_ = 0;
				for (int i_3_ = 0; jagexInterface.anInt2060 > i_3_; i_3_++) {
					for (int i_4_ = 0; i_4_ < jagexInterface.anInt2014; i_4_++) {
						int i_5_ = i_4_ * (32 + jagexInterface.anInt2044);
						int i_6_ = i_3_ * (32 - -jagexInterface.anInt2077);
						if (i_2_ < 20) {
							i_6_ += jagexInterface.anIntArray1986[i_2_];
							i_5_ += jagexInterface.anIntArray1988[i_2_];
						}
						if (i_1_ >= i_5_ && i_0_ >= i_6_ && i_5_ + 32 > i_1_ && i_0_ < 32 + i_6_) {
							Class120_Sub13.anInt2572 = i_2_;
							Class120_Sub14_Sub16.aClass189_3588 = jagexInterface;
							if (jagexInterface.anIntArray1978[i_2_] > 0) {
								final InterfaceClickMask class120_sub20 = client.getClickMask(jagexInterface);
								final ObjType objType = ObjType.list(jagexInterface.anIntArray1978[i_2_] - 1);
								if (Light.objSelected != 1 || !class120_sub20.method1694(500)) {
									if (Class88.aBoolean828 && class120_sub20.method1694(500)) {
										final Class120_Sub14_Sub11 class120_sub14_sub11 = Class139.anInt1330 == -1 ? null : Class120_Sub14_Sub11.list(Class139.anInt1330);
										if ((0x10 & GroundTile.anInt2652) != 0 && (class120_sub14_sub11 == null || objType.getIntegerParam(class120_sub14_sub11.anInt3542, Class139.anInt1330) != class120_sub14_sub11.anInt3542)) {
											Class120_Sub14_Sub6.addMenuOption(objType.myId, i_2_, jagexInterface.bitPacked, new StringBuilder(Light.aString369).append(" -> <col=ff9040>").append(objType.name).toString(), Class101.aString963, (short) 50, Class150.anInt1417);
										}
									} else {
										String[] strings = objType.inventoryOptions;
										if (MouseHandler.showNumbersOnActions) {
											strings = Class120_Sub12_Sub36.addNumbers(strings);
										}
										if (class120_sub20.method1694(500)) {
											for (int i_7_ = 4; i_7_ >= 3; i_7_--) {
												if (strings != null && strings[i_7_] != null) {
													short i_8_;
													if (i_7_ == 3) {
														i_8_ = (short) 10;
													} else {
														i_8_ = (short) 51;
													}
													Class120_Sub14_Sub6.addMenuOption(objType.myId, i_2_, jagexInterface.bitPacked, new StringBuilder("<col=ff9040>").append(objType.name).toString(), strings[i_7_], i_8_, -1);
												}
											}
										}
										if (class120_sub20.method1687(119)) {
											Class120_Sub14_Sub6.addMenuOption(objType.myId, i_2_, jagexInterface.bitPacked, new StringBuilder("<col=ff9040>").append(objType.name).toString(), AbstractGraphicsBuffer.aString1176, (short) 9, Class120_Sub12_Sub10.anInt3205);
										}
										if (class120_sub20.method1694(500) && strings != null) {
											for (int i_9_ = 2; i_9_ >= 0; i_9_--) {
												if (strings[i_9_] != null) {
													short i_10_ = 0;
													if (i_9_ == 0) {
														i_10_ = (short) 58;
													}
													if (i_9_ == 1) {
														i_10_ = (short) 35;
													}
													if (i_9_ == 2) {
														i_10_ = (short) 17;
													}
													Class120_Sub14_Sub6.addMenuOption(objType.myId, i_2_, jagexInterface.bitPacked, new StringBuilder("<col=ff9040>").append(objType.name).toString(), strings[i_9_], i_10_, -1);
												}
											}
										}
										strings = jagexInterface.aStringArray2056;
										if (MouseHandler.showNumbersOnActions) {
											strings = Class120_Sub12_Sub36.addNumbers(strings);
										}
										if (strings != null) {
											for (int i_11_ = 4; i_11_ >= 0; i_11_--) {
												if (strings[i_11_] != null) {
													short i_12_ = 0;
													if (i_11_ == 0) {
														i_12_ = (short) 30;
													}
													if (i_11_ == 1) {
														i_12_ = (short) 20;
													}
													if (i_11_ == 2) {
														i_12_ = (short) 13;
													}
													if (i_11_ == 3) {
														i_12_ = (short) 2;
													}
													if (i_11_ == 4) {
														i_12_ = (short) 49;
													}
													Class120_Sub14_Sub6.addMenuOption(objType.myId, i_2_, jagexInterface.bitPacked, new StringBuilder("<col=ff9040>").append(objType.name).toString(), strings[i_11_], i_12_, -1);
												}
											}
										}
										Class120_Sub14_Sub6.addMenuOption(objType.myId, i_2_, jagexInterface.bitPacked, new StringBuilder("<col=ff9040>").append(objType.name).toString(), Class11.aString81, (short) 1001, Class120_Sub12_Sub11.anInt3211);
									}
								} else if (Class141.selectedObjInterface != jagexInterface.bitPacked || Class108_Sub1.selectedObjSlot != i_2_) {
									Class120_Sub14_Sub6.addMenuOption(objType.myId, i_2_, jagexInterface.bitPacked, new StringBuilder(Class192.selectedObjName).append(" -> <col=ff9040>").append(objType.name).toString(), AbstractGraphicsBuffer.aString1176, (short) 15, -1);
								}
							}
						}
						i_2_++;
					}
				}
			}
			if (jagexInterface.aBoolean2041) {
				if (Class88.aBoolean828) {
					if (client.getClickMask(jagexInterface).method1692(false) && (0x20 & GroundTile.anInt2652) != 0) {
						Class120_Sub14_Sub6.addMenuOption(0L, jagexInterface.anInt2083, jagexInterface.bitPacked, new StringBuilder(Light.aString369).append(" -> ").append(jagexInterface.aString1964).toString(), Class101.aString963, (short) 1, Class150.anInt1417);
					}
				} else {
					for (int i_13_ = 9; i_13_ >= 5; i_13_--) {
						final String string = Class120_Sub12_Sub17.method1285(i_13_, jagexInterface, (byte) 35);
						if (string != null) {
							Class120_Sub14_Sub6.addMenuOption(1 + i_13_, jagexInterface.anInt2083, jagexInterface.bitPacked, jagexInterface.aString1964, string, (short) 1009, Class120_Sub12_Sub31.method1368(jagexInterface, i_13_, (byte) -25));
						}
					}
					final String string = Class33.method277((byte) 126, jagexInterface);
					if (string != null) {
						Class120_Sub14_Sub6.addMenuOption(0L, jagexInterface.anInt2083, jagexInterface.bitPacked, jagexInterface.aString1964, string, (short) 34, -1);
					}
					for (int i_14_ = 4; i_14_ >= 0; i_14_--) {
						final String string_15_ = Class120_Sub12_Sub17.method1285(i_14_, jagexInterface, (byte) 120);
						if (string_15_ != null) {
							Class120_Sub14_Sub6.addMenuOption(1 + i_14_, jagexInterface.anInt2083, jagexInterface.bitPacked, jagexInterface.aString1964, string_15_, (short) 23, Class120_Sub12_Sub31.method1368(jagexInterface, i_14_, (byte) -35));
						}
					}
					if (client.getClickMask(jagexInterface).method1686((byte) -101)) {
						if (jagexInterface.aString1994 != null) {
							Class120_Sub14_Sub6.addMenuOption(0L, jagexInterface.anInt2083, jagexInterface.bitPacked, "", jagexInterface.aString1994, (short) 3, -1);
						} else {
							Class120_Sub14_Sub6.addMenuOption(0L, jagexInterface.anInt2083, jagexInterface.bitPacked, "", Class109.aString1046, (short) 3, -1);
						}
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("fj.R(").append(jagexInterface != null ? "{...}" : "null").append(',').append(i).append(',').append(i_0_).append(',').append(i_1_).append(')').toString());
		}
	}

	@Override
	final int[] method1187(final int i, final int i_16_) {
		int[] is;
		try {
			if (i != -1735) {
				return null;
			}
			final int[] is_17_ = this.aClass30_2563.method258(i_16_, i + 1615);
			if (this.aClass30_2563.aBoolean238) {
				final int[] is_18_ = method1192(-7764, aBoolean3192 ? -i_16_ + Class120_Sub29.anInt2774 : i_16_, 0);
				if (!aBoolean3197) {
					ArrayUtils.arrayCopy(is_18_, 0, is_17_, 0, Class120_Sub12_Sub7.anInt3178);
				} else {
					for (int i_19_ = 0; Class120_Sub12_Sub7.anInt3178 > i_19_; i_19_++) {
						is_17_[i_19_] = is_18_[Class32.anInt259 - i_19_];
					}
				}
			}
			is = is_17_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("fj.D(").append(i).append(',').append(i_16_).append(')').toString());
		}
		return is;
	}

	@Override
	final void method1180(final byte i, final Buffer class120_sub7, final int i_20_) {
		do {
			try {
				final int i_21_ = i_20_;
				while_112_: do {
					do {
						if (i_21_ != 0) {
							if (i_21_ != 1) {
								if (i_21_ == 2) {
									break;
								}
								break while_112_;
							}
						} else {
							aBoolean3197 = class120_sub7.getUByte() == 1;
							break while_112_;
						}
						aBoolean3192 = class120_sub7.getUByte() == 1;
						break while_112_;
					} while (false);
					this.aBoolean2558 = class120_sub7.getUByte() == 1;
				} while (false);
				if (i != -43) {
					break;
				}
			} catch (final RuntimeException runtimeexception) {
				throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("fj.M(").append(i).append(',').append(class120_sub7 != null ? "{...}" : "null").append(',').append(i_20_).append(')').toString());
			}
		} while (false);
	}

	static final void method1245(final int i, final int i_22_, final GameEntity class180_sub5) {
		try {
			if (Class101_Sub2.loopCycle < class180_sub5.anInt3035) {
				Class166.method2180(class180_sub5, true);
			} else if (class180_sub5.anInt2961 < Class101_Sub2.loopCycle) {
				Class120_Sub12_Sub32.method1371(class180_sub5, (byte) -49);
			} else {
				Class111.method984(class180_sub5, 0);
			}
			if (class180_sub5.x < 128 || class180_sub5.z < 128 || class180_sub5.x >= 13184 || class180_sub5.z >= 13184) {
				class180_sub5.anInt2961 = 0;
				class180_sub5.anInt3035 = 0;
				class180_sub5.spotAnimId = -1;
				class180_sub5.anInt3006 = -1;
				class180_sub5.x = 128 * class180_sub5.anIntArray2958[0] + class180_sub5.getSize() * 64;
				class180_sub5.z = class180_sub5.anIntArray3040[0] * 128 - -(class180_sub5.getSize() * 64);
				class180_sub5.method2329(-31966);
			}
			if (Class100.selfPlayer == class180_sub5 && (class180_sub5.x < 1536 || class180_sub5.z < 1536 || class180_sub5.x >= 11776 || class180_sub5.z >= 11776)) {
				class180_sub5.spotAnimId = -1;
				class180_sub5.anInt2961 = 0;
				class180_sub5.anInt3035 = 0;
				class180_sub5.anInt3006 = -1;
				class180_sub5.x = 128 * class180_sub5.anIntArray2958[0] - -(class180_sub5.getSize() * 64);
				class180_sub5.z = class180_sub5.anIntArray3040[0] * 128 - -(class180_sub5.getSize() * 64);
				class180_sub5.method2329(i + -2567);
			}
			if (i != -29399) {
				anInt3193 = -29;
			}
			ProducingGraphicsBuffer.method1850(126, class180_sub5);
			Class36.method307(-25431, class180_sub5);
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("fj.S(").append(i).append(',').append(i_22_).append(',').append(class180_sub5 != null ? "{...}" : "null").append(')').toString());
		}
	}

	public Class120_Sub12_Sub9() {
		super(1, false);
	}

	@Override
	final int[][] method1188(final int i, final int i_23_) {
		int[][] is;
		try {
			if (i_23_ != -29869) {
				return null;
			}
			final int[][] is_24_ = this.aClass109_2559.method975(i, -64);
			if (this.aClass109_2559.aBoolean1049) {
				final int[][] is_25_ = method1179(0, aBoolean3192 ? Class120_Sub29.anInt2774 + -i : i, (byte) -51);
				final int[] is_26_ = is_25_[0];
				final int[] is_27_ = is_25_[1];
				final int[] is_28_ = is_24_[0];
				final int[] is_29_ = is_25_[2];
				final int[] is_30_ = is_24_[1];
				final int[] is_31_ = is_24_[2];
				if (aBoolean3197) {
					for (int i_32_ = 0; Class120_Sub12_Sub7.anInt3178 > i_32_; i_32_++) {
						is_28_[i_32_] = is_26_[Class32.anInt259 - i_32_];
						is_30_[i_32_] = is_27_[Class32.anInt259 + -i_32_];
						is_31_[i_32_] = is_29_[-i_32_ + Class32.anInt259];
					}
				} else {
					for (int i_33_ = 0; Class120_Sub12_Sub7.anInt3178 > i_33_; i_33_++) {
						is_28_[i_33_] = is_26_[i_33_];
						is_30_[i_33_] = is_27_[i_33_];
						is_31_[i_33_] = is_29_[i_33_];
					}
				}
			}
			is = is_24_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("fj.K(").append(i).append(',').append(i_23_).append(')').toString());
		}
		return is;
	}

	public static void method1246(final int i) {
		try {
			aBooleanArray3194 = null;
			if (i == 23665) {
				aClass21_3196 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("fj.T(").append(i).append(')').toString());
		}
	}
}
