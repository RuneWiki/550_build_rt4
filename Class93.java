/* Class93 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class93 {
	static int[] packetSizes = { 0, -2, -2, 0, 1, 0, 0, 0, 1, 0, 6, 8, 0, 0, 0, 0, 0, 15, 8, 20, 0, 0, 0, 3, 0, -2, 4, 0, 0, 0, -1, 12, 0, 3, -2, 9, 0, 0, 3, 0, 7, 0, 6, -2, -1, 0, 8, 7, 0, -2, 0, 0, 2, -2, -1, 1, 0, 0, 0, -1, 5, 0, 0, 7, 0, 10, 0, 0, 0, 0, 0, 0, 2, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0,
			0, 0, 0, -1, 8, 0, 10, 12, 0, 0, 8, 0, 2, 0, 2, 0, -1, 3, 0, 0, 4, -1, 15, 0, 0, 0, 0, 0, 17, 0, 12, 7, 3, -2, 0, 0, 0, 3, 0, 0, 0, 0, 0, -1, 0, 0, 6, 3, 4, 0, 14, 0, 6, -2, 3, 6, 0, 0, 0, 0, 0, 6, 0, 0, 2, 8, 0, 5, 8, 10, 6, 0, -2, 2, 0, 6, 0, 0, 0, 14, 0, 6, 0, 28, 0, 2, 0, 0, 0, 8,
			-2, -1, 0, 5, 11, 0, 4, 0, 0, -1, 12, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 6, 0, 0, 0, 0, 0, 0, 6, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, -1, -1, 0, 0, 5, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 10, 0, 0, 0, 0, 3, 8, 0, 0, -1, 0, 0, 0, 0, 0, -1, -2, 0, 0 };
	static int anInt867 = 0;
	static int spriteAmount;
	static JagexInterface aClass189_869;
	static boolean aBoolean870 = false;

	static final void method770(final long l, final byte i) {
		try {
			if ((l ^ 0xffffffffffffffffL) != -1L && i == -67) {
				for (int i_0_ = 0; i_0_ < Class120_Sub12_Sub26.ignoreCount; i_0_++) {
					if ((l ^ 0xffffffffffffffffL) == (HintIcon.ignoreNamesAsLong[i_0_] ^ 0xffffffffffffffffL)) {
						Class120_Sub12_Sub26.ignoreCount--;
						for (int i_1_ = i_0_; i_1_ < Class120_Sub12_Sub26.ignoreCount; i_1_++) {
							HintIcon.ignoreNamesAsLong[i_1_] = HintIcon.ignoreNamesAsLong[i_1_ - -1];
							Class84.ignoreNames[i_1_] = Class84.ignoreNames[1 + i_1_];
							Class120_Sub14_Sub4.aBooleanArray3468[i_1_] = Class120_Sub14_Sub4.aBooleanArray3468[1 + i_1_];
						}
						Class61.anInt563 = GrandExchangeObject.anInt1494;
						Class120_Sub12_Sub11.outputStream.putByteIsaac(142);
						Class120_Sub12_Sub11.outputStream.putLong(l);
						break;
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("ka.F(").append(l).append(',').append(i).append(')').toString());
		}
	}

	static final void method771(final int i, final int i_2_, final int i_3_, final int i_4_, final int i_5_, final int i_6_, final boolean bool, final int i_7_, final CollisionMap collisionMap, final boolean bool_8_, final int i_9_) {
		try {
			if (!bool_8_ || Class143_Sub1.method2021() || (0x2 & Class114.tileSettings[0][i_5_][i_7_]) != 0 || (Class114.tileSettings[i_2_][i_5_][i_7_] & 0x10) == 0 && SubScript.method2242(i_7_, i_2_, (byte) 106, i_5_) == Class120_Sub14_Sub4.anInt3469) {
				if (DummyOutputStream.anInt29 > i_2_) {
					DummyOutputStream.anInt29 = i_2_;
				}
				final LocType locType = LocType.list(i_3_);
				if (!HDToolkit.glEnabled || !locType.aBoolean1876) {
					int i_10_;
					int i_11_;
					if (i == 1 || i == 3) {
						i_11_ = locType.anInt1827;
						i_10_ = locType.anInt1841;
					} else {
						i_10_ = locType.anInt1827;
						i_11_ = locType.anInt1841;
					}
					int i_12_;
					int i_13_;
					if (i_11_ + i_5_ > 104) {
						i_12_ = i_5_ - -1;
						i_13_ = i_5_;
					} else {
						i_12_ = i_5_ + (1 + i_11_ >> 1);
						i_13_ = (i_11_ >> 1) + i_5_;
					}
					int i_14_;
					int i_15_;
					if (i_7_ - -i_10_ > 104) {
						i_15_ = i_7_ + 1;
						i_14_ = i_7_;
					} else {
						i_14_ = (i_10_ >> 1) + i_7_;
						i_15_ = i_7_ - -(i_10_ - -1 >> 1);
					}
					final int[][] is = OverridedJInterface.anIntArrayArrayArray2741[i_4_];
					final int i_16_ = (i_11_ << 6) + (i_5_ << 7);
					final int i_17_ = (i_10_ << 6) + (i_7_ << 7);
					final int i_18_ = is[i_12_][i_14_] + is[i_13_][i_14_] + is[i_13_][i_15_] + is[i_12_][i_15_] >> 2;
					int i_19_ = 0;
					if (HDToolkit.glEnabled && i_4_ != 0) {
						final int[][] is_20_ = OverridedJInterface.anIntArrayArrayArray2741[0];
						i_19_ = i_18_ + -(is_20_[i_13_][i_15_] + is_20_[i_13_][i_14_] - (-is_20_[i_12_][i_14_] - is_20_[i_12_][i_15_]) >> 2);
					}
					long l = i_5_ | i_7_ << 7 | i_9_ << 14 | i << 20 | 0x40000000;
					int[][] is_21_ = null;
					if (bool) {
						is_21_ = Class120_Sub12_Sub33.anIntArrayArrayArray3388[0];
					} else if (i_4_ < 3) {
						is_21_ = OverridedJInterface.anIntArrayArrayArray2741[i_4_ + 1];
					}
					if (locType.anInt1835 == 0 || bool) {
						l |= ~0x7fffffffffffffffL;
					}
					if (locType.anInt1831 == 1) {
						l |= 0x400000L;
					}
					if (locType.aBoolean1878) {
						l |= 0x80000000L;
					}
					if (locType.method2466(92)) {
						Class7.addAmbientSound(locType, i_5_, null, i_7_, null, i, i_2_);
					}
					l |= (long) i_3_ << 32;
					final boolean bool_22_ = locType.aBoolean1823 & !bool;
					if (i_9_ == 22) {
						if (Hashtable.showGroundDecorations || locType.anInt1835 != 0 || locType.anInt1821 == 1 || locType.aBoolean1853) {
							SceneGraphNode sceneGraphNode;
							if ((locType.anInt1836 ^ 0xffffffff) != 0 || locType.anIntArray1881 != null || locType.childrenIDs != null || locType.aBoolean1863) {
								sceneGraphNode = new Class180_Sub6(i_3_, 22, i, i_4_, i_5_, i_7_, -1, locType.aBoolean1864, null);
							} else {
								final Class88 class88 = locType.method2453(i_16_, bool_8_, 22, i_18_, is, is_21_, bool_22_, i, i_17_, -123, null);
								if (HDToolkit.glEnabled && bool_22_) {
									Class47.method389(class88.aClass107_Sub1_830, i_16_, i_19_, i_17_);
								}
								sceneGraphNode = class88.aClass180_826;
							}
							Class120_Sub14_Sub24.method1649(i_2_, i_5_, i_7_, i_18_, sceneGraphNode, l, locType.aBoolean1822);
							if (locType.anInt1821 == 1 && collisionMap != null) {
								collisionMap.method212(i_7_, -28, i_5_);
							}
						}
					} else if (i_9_ == 10 || i_9_ == 11) {
						SceneGraphNode sceneGraphNode;
						if ((locType.anInt1836 ^ 0xffffffff) == 0 && locType.anIntArray1881 == null && locType.childrenIDs == null && !locType.aBoolean1863) {
							final Class88 class88 = locType.method2453(i_16_, bool_8_, 10, i_18_, is, is_21_, bool_22_, i_9_ != 11 ? i : i + 4, i_17_, i_6_ + -118, null);
							if (HDToolkit.glEnabled && bool_22_) {
								Class47.method389(class88.aClass107_Sub1_830, i_16_, i_19_, i_17_);
							}
							sceneGraphNode = class88.aClass180_826;
						} else {
							sceneGraphNode = new Class180_Sub6(i_3_, 10, i_9_ != 11 ? i : i + 4, i_4_, i_5_, i_7_, -1, locType.aBoolean1864, null);
						}
						if (sceneGraphNode != null) {
							final boolean bool_23_ = method774(i_2_, i_5_, i_7_, i_18_, i_11_, i_10_, sceneGraphNode, 0, l);
							if (locType.aBoolean1858 && bool_23_ && bool_8_) {
								int i_24_ = 15;
								if (sceneGraphNode instanceof Class180_Sub7) {
									i_24_ = ((Class180_Sub7) sceneGraphNode).method2371() / 4;
									if (i_24_ > 30) {
										i_24_ = 30;
									}
								}
								for (int i_25_ = 0; i_11_ >= i_25_; i_25_++) {
									for (int i_26_ = 0; i_26_ <= i_10_; i_26_++) {
										if (Npc.aByteArrayArrayArray3754[i_2_][i_25_ + i_5_][i_7_ - -i_26_] < i_24_) {
											Npc.aByteArrayArrayArray3754[i_2_][i_5_ + i_25_][i_26_ + i_7_] = (byte) i_24_;
										}
									}
								}
							}
						}
						if (locType.anInt1821 != 0 && collisionMap != null) {
							collisionMap.method213(locType.aBoolean1844, !locType.aBoolean1880, i_10_, i_11_, i_7_, i_5_);
						}
					} else if (i_9_ >= 12) {
						SceneGraphNode sceneGraphNode;
						if (locType.anInt1836 != -1 || locType.anIntArray1881 != null || locType.childrenIDs != null || locType.aBoolean1863) {
							sceneGraphNode = new Class180_Sub6(i_3_, i_9_, i, i_4_, i_5_, i_7_, -1, locType.aBoolean1864, null);
						} else {
							final Class88 class88 = locType.method2453(i_16_, bool_8_, i_9_, i_18_, is, is_21_, bool_22_, i, i_17_, -115, null);
							if (HDToolkit.glEnabled && bool_22_) {
								Class47.method389(class88.aClass107_Sub1_830, i_16_, i_19_, i_17_);
							}
							sceneGraphNode = class88.aClass180_826;
						}
						method774(i_2_, i_5_, i_7_, i_18_, 1, 1, sceneGraphNode, 0, l);
						if (bool_8_ && i_9_ >= 12 && i_9_ <= 17 && i_9_ != 13 && i_2_ > 0 && locType.anInt1866 != 0) {
							Class110.anIntArrayArrayArray1050[i_2_][i_5_][i_7_] = Class191.method2512(Class110.anIntArrayArrayArray1050[i_2_][i_5_][i_7_], 4);
						}
						if (locType.anInt1821 != 0 && collisionMap != null) {
							collisionMap.method213(locType.aBoolean1844, !locType.aBoolean1880, i_10_, i_11_, i_7_, i_5_);
						}
					} else if (i_9_ == 0) {
						SceneGraphNode sceneGraphNode;
						if ((locType.anInt1836 ^ 0xffffffff) != 0 || locType.anIntArray1881 != null || locType.childrenIDs != null || locType.aBoolean1863) {
							sceneGraphNode = new Class180_Sub6(i_3_, 0, i, i_4_, i_5_, i_7_, -1, locType.aBoolean1864, null);
						} else {
							final Class88 class88 = locType.method2453(i_16_, bool_8_, 0, i_18_, is, is_21_, bool_22_, i, i_17_, -128, null);
							if (HDToolkit.glEnabled && bool_22_) {
								Class47.method389(class88.aClass107_Sub1_830, i_16_, i_19_, i_17_);
							}
							sceneGraphNode = class88.aClass180_826;
						}
						RuntimeException_Sub1.method2530(i_2_, i_5_, i_7_, i_18_, sceneGraphNode, null, Class53.anIntArray485[i], 0, l);
						if (bool_8_) {
							if (i != 0) {
								if (i != 1) {
									if (i != 2) {
										if (i == 3) {
											if (locType.aBoolean1858) {
												Npc.aByteArrayArrayArray3754[i_2_][i_5_][i_7_] = (byte) 50;
												Npc.aByteArrayArrayArray3754[i_2_][1 + i_5_][i_7_] = (byte) 50;
											}
											if (locType.anInt1866 == 1) {
												Class110.anIntArrayArrayArray1050[i_2_][i_5_][i_7_] = Class191.method2512(Class110.anIntArrayArrayArray1050[i_2_][i_5_][i_7_], 2);
											}
										}
									} else {
										if (locType.aBoolean1858) {
											Npc.aByteArrayArrayArray3754[i_2_][i_5_ + 1][i_7_] = (byte) 50;
											Npc.aByteArrayArrayArray3754[i_2_][1 + i_5_][1 + i_7_] = (byte) 50;
										}
										if (locType.anInt1866 == 1) {
											Class110.anIntArrayArrayArray1050[i_2_][i_5_ + 1][i_7_] = Class191.method2512(Class110.anIntArrayArrayArray1050[i_2_][i_5_ + 1][i_7_], 1);
										}
									}
								} else {
									if (locType.aBoolean1858) {
										Npc.aByteArrayArrayArray3754[i_2_][i_5_][1 + i_7_] = (byte) 50;
										Npc.aByteArrayArrayArray3754[i_2_][1 + i_5_][1 + i_7_] = (byte) 50;
									}
									if (locType.anInt1866 == 1) {
										Class110.anIntArrayArrayArray1050[i_2_][i_5_][i_7_ + 1] = Class191.method2512(Class110.anIntArrayArrayArray1050[i_2_][i_5_][i_7_ + 1], 2);
									}
								}
							} else {
								if (locType.aBoolean1858) {
									Npc.aByteArrayArrayArray3754[i_2_][i_5_][i_7_] = (byte) 50;
									Npc.aByteArrayArrayArray3754[i_2_][i_5_][1 + i_7_] = (byte) 50;
								}
								if (locType.anInt1866 == 1) {
									Class110.anIntArrayArrayArray1050[i_2_][i_5_][i_7_] = Class191.method2512(Class110.anIntArrayArrayArray1050[i_2_][i_5_][i_7_], 1);
								}
							}
						}
						if (locType.anInt1821 != 0 && collisionMap != null) {
							collisionMap.method219(i_7_, -21665, locType.aBoolean1844, !locType.aBoolean1880, i_5_, i_9_, i);
						}
						if (locType.anInt1819 != 16) {
							Class120_Sub12_Sub2.method1201(i_2_, i_5_, i_7_, locType.anInt1819);
						}
					} else if (i_9_ == 1) {
						SceneGraphNode sceneGraphNode;
						if (locType.anInt1836 != -1 || locType.anIntArray1881 != null || locType.childrenIDs != null || locType.aBoolean1863) {
							sceneGraphNode = new Class180_Sub6(i_3_, 1, i, i_4_, i_5_, i_7_, -1, locType.aBoolean1864, null);
						} else {
							final Class88 class88 = locType.method2453(i_16_, bool_8_, 1, i_18_, is, is_21_, bool_22_, i, i_17_, -116, null);
							if (HDToolkit.glEnabled && bool_22_) {
								Class47.method389(class88.aClass107_Sub1_830, i_16_, i_19_, i_17_);
							}
							sceneGraphNode = class88.aClass180_826;
						}
						RuntimeException_Sub1.method2530(i_2_, i_5_, i_7_, i_18_, sceneGraphNode, null, Class156.anIntArray1458[i], 0, l);
						if (locType.aBoolean1858 && bool_8_) {
							if (i == 0) {
								Npc.aByteArrayArrayArray3754[i_2_][i_5_][i_7_ + 1] = (byte) 50;
							} else if (i == 1) {
								Npc.aByteArrayArrayArray3754[i_2_][i_5_ - -1][1 + i_7_] = (byte) 50;
							} else if (i != 2) {
								if (i == 3) {
									Npc.aByteArrayArrayArray3754[i_2_][i_5_][i_7_] = (byte) 50;
								}
							} else {
								Npc.aByteArrayArrayArray3754[i_2_][1 + i_5_][i_7_] = (byte) 50;
							}
						}
						if (locType.anInt1821 != 0 && collisionMap != null) {
							collisionMap.method219(i_7_, i_6_ ^ ~0x54a4, locType.aBoolean1844, !locType.aBoolean1880, i_5_, i_9_, i);
						}
					} else if (i_9_ == 2) {
						final int i_27_ = 0x3 & i - -1;
						SceneGraphNode sceneGraphNode;
						SceneGraphNode class180_28_;
						if (locType.anInt1836 != -1 || locType.anIntArray1881 != null || locType.childrenIDs != null || locType.aBoolean1863) {
							sceneGraphNode = new Class180_Sub6(i_3_, 2, i + 4, i_4_, i_5_, i_7_, -1, locType.aBoolean1864, null);
							class180_28_ = new Class180_Sub6(i_3_, 2, i_27_, i_4_, i_5_, i_7_, -1, locType.aBoolean1864, null);
						} else {
							Class88 class88 = locType.method2453(i_16_, bool_8_, 2, i_18_, is, is_21_, bool_22_, i + 4, i_17_, i_6_ ^ ~0x71, null);
							if (HDToolkit.glEnabled && bool_22_) {
								Class47.method389(class88.aClass107_Sub1_830, i_16_, i_19_, i_17_);
							}
							sceneGraphNode = class88.aClass180_826;
							class88 = locType.method2453(i_16_, bool_8_, 2, i_18_, is, is_21_, bool_22_, i_27_, i_17_, i_6_ + -119, null);
							if (HDToolkit.glEnabled && bool_22_) {
								Class47.method389(class88.aClass107_Sub1_830, i_16_, i_19_, i_17_);
							}
							class180_28_ = class88.aClass180_826;
						}
						RuntimeException_Sub1.method2530(i_2_, i_5_, i_7_, i_18_, sceneGraphNode, class180_28_, Class53.anIntArray485[i], Class53.anIntArray485[i_27_], l);
						if (locType.anInt1866 == 1 && bool_8_) {
							if (i != 0) {
								if (i != 1) {
									if (i == 2) {
										Class110.anIntArrayArrayArray1050[i_2_][i_5_ - -1][i_7_] = Class191.method2512(Class110.anIntArrayArrayArray1050[i_2_][i_5_ - -1][i_7_], 1);
										Class110.anIntArrayArrayArray1050[i_2_][i_5_][i_7_] = Class191.method2512(Class110.anIntArrayArrayArray1050[i_2_][i_5_][i_7_], 2);
									} else if (i == 3) {
										Class110.anIntArrayArrayArray1050[i_2_][i_5_][i_7_] = Class191.method2512(Class110.anIntArrayArrayArray1050[i_2_][i_5_][i_7_], 2);
										Class110.anIntArrayArrayArray1050[i_2_][i_5_][i_7_] = Class191.method2512(Class110.anIntArrayArrayArray1050[i_2_][i_5_][i_7_], 1);
									}
								} else {
									Class110.anIntArrayArrayArray1050[i_2_][i_5_][1 + i_7_] = Class191.method2512(Class110.anIntArrayArrayArray1050[i_2_][i_5_][1 + i_7_], 2);
									Class110.anIntArrayArrayArray1050[i_2_][i_5_ + 1][i_7_] = Class191.method2512(Class110.anIntArrayArrayArray1050[i_2_][i_5_ + 1][i_7_], 1);
								}
							} else {
								Class110.anIntArrayArrayArray1050[i_2_][i_5_][i_7_] = Class191.method2512(Class110.anIntArrayArrayArray1050[i_2_][i_5_][i_7_], 1);
								Class110.anIntArrayArrayArray1050[i_2_][i_5_][1 + i_7_] = Class191.method2512(Class110.anIntArrayArrayArray1050[i_2_][i_5_][1 + i_7_], 2);
							}
						}
						if (locType.anInt1821 != 0 && collisionMap != null) {
							collisionMap.method219(i_7_, -21665, locType.aBoolean1844, !locType.aBoolean1880, i_5_, i_9_, i);
						}
						if (locType.anInt1819 != 16) {
							Class120_Sub12_Sub2.method1201(i_2_, i_5_, i_7_, locType.anInt1819);
						}
					} else if (i_9_ == 3) {
						SceneGraphNode sceneGraphNode;
						if ((locType.anInt1836 ^ 0xffffffff) != 0 || locType.anIntArray1881 != null || locType.childrenIDs != null || locType.aBoolean1863) {
							sceneGraphNode = new Class180_Sub6(i_3_, 3, i, i_4_, i_5_, i_7_, -1, locType.aBoolean1864, null);
						} else {
							final Class88 class88 = locType.method2453(i_16_, bool_8_, 3, i_18_, is, is_21_, bool_22_, i, i_17_, -128, null);
							if (HDToolkit.glEnabled && bool_22_) {
								Class47.method389(class88.aClass107_Sub1_830, i_16_, i_19_, i_17_);
							}
							sceneGraphNode = class88.aClass180_826;
						}
						RuntimeException_Sub1.method2530(i_2_, i_5_, i_7_, i_18_, sceneGraphNode, null, Class156.anIntArray1458[i], 0, l);
						if (locType.aBoolean1858 && bool_8_) {
							if (i == 0) {
								Npc.aByteArrayArrayArray3754[i_2_][i_5_][1 + i_7_] = (byte) 50;
							} else if (i == 1) {
								Npc.aByteArrayArrayArray3754[i_2_][1 + i_5_][1 + i_7_] = (byte) 50;
							} else if (i == 2) {
								Npc.aByteArrayArrayArray3754[i_2_][1 + i_5_][i_7_] = (byte) 50;
							} else if (i == 3) {
								Npc.aByteArrayArrayArray3754[i_2_][i_5_][i_7_] = (byte) 50;
							}
						}
						if (locType.anInt1821 != 0 && collisionMap != null) {
							collisionMap.method219(i_7_, i_6_ + -21669, locType.aBoolean1844, !locType.aBoolean1880, i_5_, i_9_, i);
						}
					} else if (i_9_ == 9) {
						SceneGraphNode sceneGraphNode;
						if (locType.anInt1836 != -1 || locType.anIntArray1881 != null || locType.childrenIDs != null || locType.aBoolean1863) {
							sceneGraphNode = new Class180_Sub6(i_3_, i_9_, i, i_4_, i_5_, i_7_, -1, locType.aBoolean1864, null);
						} else {
							final Class88 class88 = locType.method2453(i_16_, bool_8_, i_9_, i_18_, is, is_21_, bool_22_, i, i_17_, -119, null);
							if (HDToolkit.glEnabled && bool_22_) {
								Class47.method389(class88.aClass107_Sub1_830, i_16_, i_19_, i_17_);
							}
							sceneGraphNode = class88.aClass180_826;
						}
						method774(i_2_, i_5_, i_7_, i_18_, 1, 1, sceneGraphNode, 0, l);
						if (locType.anInt1821 != 0 && collisionMap != null) {
							collisionMap.method213(locType.aBoolean1844, !locType.aBoolean1880, i_10_, i_11_, i_7_, i_5_);
						}
						if (locType.anInt1819 != 16) {
							Class120_Sub12_Sub2.method1201(i_2_, i_5_, i_7_, locType.anInt1819);
						}
					} else if (i_6_ == 4) {
						if (i_9_ == 4) {
							SceneGraphNode sceneGraphNode;
							if ((locType.anInt1836 ^ 0xffffffff) != 0 || locType.anIntArray1881 != null || locType.childrenIDs != null || locType.aBoolean1863) {
								sceneGraphNode = new Class180_Sub6(i_3_, 4, i, i_4_, i_5_, i_7_, -1, locType.aBoolean1864, null);
							} else {
								final Class88 class88 = locType.method2453(i_16_, bool_8_, 4, i_18_, is, is_21_, bool_22_, i, i_17_, -125, null);
								if (HDToolkit.glEnabled && bool_22_) {
									Class47.method389(class88.aClass107_Sub1_830, i_16_, i_19_, i_17_);
								}
								sceneGraphNode = class88.aClass180_826;
							}
							Class11.method127(i_2_, i_5_, i_7_, i_18_, sceneGraphNode, null, Class53.anIntArray485[i], 0, 0, 0, l);
						} else if (i_9_ == 5) {
							final long l_29_ = Class114.method1005(i_2_, i_5_, i_7_);
							int i_30_ = 16;
							if ((l_29_ ^ 0xffffffffffffffffL) != -1L) {
								i_30_ = LocType.list((int) (l_29_ >>> 32) & 0x7fffffff).anInt1819;
							}
							SceneGraphNode sceneGraphNode;
							if (locType.anInt1836 == -1 && locType.anIntArray1881 == null && locType.childrenIDs == null && !locType.aBoolean1863) {
								final Class88 class88 = locType.method2453(i_16_, bool_8_, 4, i_18_, is, is_21_, bool_22_, i, i_17_, -116, null);
								if (HDToolkit.glEnabled && bool_22_) {
									Class47.method389(class88.aClass107_Sub1_830, -(8 * Class109.anIntArray1037[i]) + i_16_, i_19_, i_17_ - Class147.anIntArray1396[i] * 8);
								}
								sceneGraphNode = class88.aClass180_826;
							} else {
								sceneGraphNode = new Class180_Sub6(i_3_, 4, i, i_4_, i_5_, i_7_, -1, locType.aBoolean1864, null);
							}
							Class11.method127(i_2_, i_5_, i_7_, i_18_, sceneGraphNode, null, Class53.anIntArray485[i], 0, Class109.anIntArray1037[i] * i_30_, Class147.anIntArray1396[i] * i_30_, l);
						} else if (i_9_ == 6) {
							final long l_31_ = Class114.method1005(i_2_, i_5_, i_7_);
							int i_32_ = 8;
							if (-1L != (l_31_ ^ 0xffffffffffffffffL)) {
								i_32_ = LocType.list(0x7fffffff & (int) (l_31_ >>> 32)).anInt1819 / 2;
							}
							SceneGraphNode sceneGraphNode;
							if ((locType.anInt1836 ^ 0xffffffff) == 0 && locType.anIntArray1881 == null && locType.childrenIDs == null && !locType.aBoolean1863) {
								final Class88 class88 = locType.method2453(i_16_, bool_8_, 4, i_18_, is, is_21_, bool_22_, i + 4, i_17_, -117, null);
								if (HDToolkit.glEnabled && bool_22_) {
									Class47.method389(class88.aClass107_Sub1_830, i_16_ - Class55.anIntArray493[i] * 8, i_19_, -(GroundObjectNode.anIntArray3629[i] * 8) + i_17_);
								}
								sceneGraphNode = class88.aClass180_826;
							} else {
								sceneGraphNode = new Class180_Sub6(i_3_, 4, i + 4, i_4_, i_5_, i_7_, -1, locType.aBoolean1864, null);
							}
							Class11.method127(i_2_, i_5_, i_7_, i_18_, sceneGraphNode, null, 256, i, Class55.anIntArray493[i] * i_32_, GroundObjectNode.anIntArray3629[i] * i_32_, l);
						} else if (i_9_ == 7) {
							final int i_33_ = i - -2 & 0x3;
							SceneGraphNode sceneGraphNode;
							if (locType.anInt1836 != -1 || locType.anIntArray1881 != null || locType.childrenIDs != null || locType.aBoolean1863) {
								sceneGraphNode = new Class180_Sub6(i_3_, 4, 4 + i_33_, i_4_, i_5_, i_7_, -1, locType.aBoolean1864, null);
							} else {
								final Class88 class88 = locType.method2453(i_16_, bool_8_, 4, i_18_, is, is_21_, bool_22_, 4 + i_33_, i_17_, -123, null);
								if (HDToolkit.glEnabled && bool_22_) {
									Class47.method389(class88.aClass107_Sub1_830, i_16_, i_19_, i_17_);
								}
								sceneGraphNode = class88.aClass180_826;
							}
							Class11.method127(i_2_, i_5_, i_7_, i_18_, sceneGraphNode, null, 256, i_33_, 0, 0, l);
						} else if (i_9_ == 8) {
							int i_34_ = 8;
							final long l_35_ = Class114.method1005(i_2_, i_5_, i_7_);
							if (0L != l_35_) {
								i_34_ = LocType.list((int) (l_35_ >>> 32) & 0x7fffffff).anInt1819 / 2;
							}
							final int i_36_ = 0x3 & i + 2;
							SceneGraphNode sceneGraphNode;
							SceneGraphNode class180_37_;
							if ((locType.anInt1836 ^ 0xffffffff) == 0 && locType.anIntArray1881 == null && locType.childrenIDs == null && !locType.aBoolean1863) {
								final int i_38_ = Class55.anIntArray493[i] * 8;
								final int i_39_ = GroundObjectNode.anIntArray3629[i] * 8;
								Class88 class88 = locType.method2453(i_16_, bool_8_, 4, i_18_, is, is_21_, bool_22_, 4 + i, i_17_, -113, null);
								if (HDToolkit.glEnabled && bool_22_) {
									Class47.method389(class88.aClass107_Sub1_830, -i_38_ + i_16_, i_19_, -i_39_ + i_17_);
								}
								sceneGraphNode = class88.aClass180_826;
								class88 = locType.method2453(i_16_, bool_8_, 4, i_18_, is, is_21_, bool_22_, 4 + i_36_, i_17_, i_6_ + -117, null);
								if (HDToolkit.glEnabled && bool_22_) {
									Class47.method389(class88.aClass107_Sub1_830, i_16_ + -i_38_, i_19_, -i_39_ + i_17_);
								}
								class180_37_ = class88.aClass180_826;
							} else {
								sceneGraphNode = new Class180_Sub6(i_3_, 4, 4 + i, i_4_, i_5_, i_7_, -1, locType.aBoolean1864, null);
								class180_37_ = new Class180_Sub6(i_3_, 4, 4 + i_36_, i_4_, i_5_, i_7_, -1, locType.aBoolean1864, null);
							}
							Class11.method127(i_2_, i_5_, i_7_, i_18_, sceneGraphNode, class180_37_, 256, i, i_34_ * Class55.anIntArray493[i], i_34_ * GroundObjectNode.anIntArray3629[i], l);
						}
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception,
					new StringBuilder("ka.E(").append(i).append(',').append(i_2_).append(',').append(i_3_).append(',').append(i_4_).append(',').append(i_5_).append(',').append(i_6_).append(',').append(bool).append(',').append(i_7_).append(',').append(collisionMap != null ? "{...}" : "null").append(',')
							.append(bool_8_).append(',').append(i_9_).append(')').toString());
		}
	}

	static final Class120_Sub14_Sub8_Sub2 method772(final int i, final js5 js5, final int i_40_, final js5 class50_41_, final int i_42_) {
		Class120_Sub14_Sub8_Sub2 class120_sub14_sub8_sub2;
		try {
			if (!Class10.decodedSprites(class50_41_, i_40_, i)) {
				return null;
			}
			class120_sub14_sub8_sub2 = Class53.method461(js5.getFile(i_40_, i), (byte) -81);
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("ka.A(").append(i).append(',').append(js5 != null ? "{...}" : "null").append(',').append(i_40_).append(',').append(class50_41_ != null ? "{...}" : "null").append(',').append(i_42_).append(')').toString());
		}
		return class120_sub14_sub8_sub2;
	}

	public static void method773(final int i) {
		try {
			aClass189_869 = null;
			packetSizes = null;
			if (i != 1) {
				spriteAmount = 33;
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("ka.D(").append(i).append(')').toString());
		}
	}

	private static final boolean method774(final int i, final int i_43_, final int i_44_, final int i_45_, final int i_46_, final int i_47_, final SceneGraphNode sceneGraphNode, final int i_48_, final long l) {
		if (sceneGraphNode == null) {
			return true;
		}
		final int i_49_ = i_43_ * 128 + 64 * i_46_;
		final int i_50_ = i_44_ * 128 + 64 * i_47_;
		return ClanMember.method1403(i, i_43_, i_44_, i_46_, i_47_, i_49_, i_50_, i_45_, sceneGraphNode, i_48_, false, l);
	}

	static final void method775(final boolean bool, final int i, final int i_51_, final int i_52_, final int i_53_, final int i_54_, final int i_55_, final int i_56_, final int i_57_, final int i_58_, final int i_59_) {
		try {
			for (int i_60_ = 0; i_60_ < 104; i_60_++) {
				for (int i_61_ = 0; i_61_ < 104; i_61_++) {
					Class179.anIntArrayArray1774[i_60_][i_61_] = 0;
					Class120_Sub2.anIntArrayArray2416[i_60_][i_61_] = 99999999;
				}
			}
			int i_62_ = i_56_;
			int i_63_ = i;
			int i_64_ = 0;
			Class179.anIntArrayArray1774[i_56_][i] = 99;
			int i_65_ = 0;
			Class120_Sub2.anIntArrayArray2416[i_56_][i] = 0;
			Class150.anIntArray1412[i_64_] = i_56_;
			Class120_Sub12.anIntArray2565[i_64_++] = i;
			boolean bool_66_ = false;
			final int[][] is = Class182.collisionMaps[Class173.gameLevel].anIntArrayArray152;
			while (i_64_ != i_65_) {
				i_63_ = Class120_Sub12.anIntArray2565[i_65_];
				i_62_ = Class150.anIntArray1412[i_65_];
				i_65_ = 0xfff & i_65_ - -1;
				if (i_62_ == i_51_ && i_54_ == i_63_) {
					bool_66_ = true;
					break;
				}
				if (i_55_ != 0) {
					if (i_55_ >= 5 && i_55_ != 10 || !Class182.collisionMaps[Class173.gameLevel].method220(i_54_, i_53_, i_63_, i_62_, (byte) -120, i_51_, 1, -1 + i_55_)) {
						if (i_55_ < 10 && Class182.collisionMaps[Class173.gameLevel].method223(i_51_, i_62_, i_54_, 1024, i_63_, i_55_ + -1, i_53_, 1)) {
							bool_66_ = true;
							break;
						}
					} else {
						bool_66_ = true;
						break;
					}
				}
				if (i_59_ != 0 && i_52_ != 0 && Class182.collisionMaps[Class173.gameLevel].method216(i_63_, -1, i_57_, 1, i_54_, i_51_, i_52_, i_59_, i_62_)) {
					bool_66_ = true;
					break;
				}
				final int i_67_ = 1 + Class120_Sub2.anIntArrayArray2416[i_62_][i_63_];
				if (i_62_ > 0 && Class179.anIntArrayArray1774[-1 + i_62_][i_63_] == 0 && (0x2c0108 & is[-1 + i_62_][i_63_]) == 0) {
					Class150.anIntArray1412[i_64_] = -1 + i_62_;
					Class120_Sub12.anIntArray2565[i_64_] = i_63_;
					i_64_ = i_64_ + 1 & 0xfff;
					Class179.anIntArrayArray1774[i_62_ - 1][i_63_] = 2;
					Class120_Sub2.anIntArrayArray2416[-1 + i_62_][i_63_] = i_67_;
				}
				if (i_62_ < 103 && Class179.anIntArrayArray1774[i_62_ + 1][i_63_] == 0 && (is[i_62_ - -1][i_63_] & 0x2c0180) == 0) {
					Class150.anIntArray1412[i_64_] = i_62_ - -1;
					Class120_Sub12.anIntArray2565[i_64_] = i_63_;
					Class179.anIntArrayArray1774[1 + i_62_][i_63_] = 8;
					i_64_ = 1 + i_64_ & 0xfff;
					Class120_Sub2.anIntArrayArray2416[i_62_ - -1][i_63_] = i_67_;
				}
				if (i_63_ > 0 && Class179.anIntArrayArray1774[i_62_][i_63_ - 1] == 0 && (is[i_62_][-1 + i_63_] & 0x2c0102) == 0) {
					Class150.anIntArray1412[i_64_] = i_62_;
					Class120_Sub12.anIntArray2565[i_64_] = i_63_ - 1;
					Class179.anIntArrayArray1774[i_62_][-1 + i_63_] = 1;
					i_64_ = 0xfff & i_64_ + 1;
					Class120_Sub2.anIntArrayArray2416[i_62_][-1 + i_63_] = i_67_;
				}
				if (i_63_ < 103 && Class179.anIntArrayArray1774[i_62_][1 + i_63_] == 0 && (0x2c0120 & is[i_62_][1 + i_63_]) == 0) {
					Class150.anIntArray1412[i_64_] = i_62_;
					Class120_Sub12.anIntArray2565[i_64_] = i_63_ + 1;
					Class179.anIntArrayArray1774[i_62_][1 + i_63_] = 4;
					i_64_ = i_64_ + 1 & 0xfff;
					Class120_Sub2.anIntArrayArray2416[i_62_][1 + i_63_] = i_67_;
				}
				if (i_62_ > 0 && i_63_ > 0 && Class179.anIntArrayArray1774[i_62_ + -1][-1 + i_63_] == 0 && (is[i_62_ - 1][-1 + i_63_] & 0x2c010e) == 0 && (0x2c0108 & is[-1 + i_62_][i_63_]) == 0 && (0x2c0102 & is[i_62_][i_63_ + -1]) == 0) {
					Class150.anIntArray1412[i_64_] = i_62_ - 1;
					Class120_Sub12.anIntArray2565[i_64_] = -1 + i_63_;
					Class179.anIntArrayArray1774[i_62_ - 1][-1 + i_63_] = 3;
					i_64_ = i_64_ + 1 & 0xfff;
					Class120_Sub2.anIntArrayArray2416[i_62_ + -1][-1 + i_63_] = i_67_;
				}
				if (i_62_ < 103 && i_63_ > 0 && Class179.anIntArrayArray1774[i_62_ - -1][-1 + i_63_] == 0 && (is[1 + i_62_][i_63_ + -1] & 0x2c0183) == 0 && (0x2c0180 & is[1 + i_62_][i_63_]) == 0 && (is[i_62_][i_63_ + -1] & 0x2c0102) == 0) {
					Class150.anIntArray1412[i_64_] = 1 + i_62_;
					Class120_Sub12.anIntArray2565[i_64_] = -1 + i_63_;
					i_64_ = 0xfff & i_64_ - -1;
					Class179.anIntArrayArray1774[1 + i_62_][i_63_ - 1] = 9;
					Class120_Sub2.anIntArrayArray2416[1 + i_62_][-1 + i_63_] = i_67_;
				}
				if (i_62_ > 0 && i_63_ < 103 && Class179.anIntArrayArray1774[i_62_ - 1][i_63_ - -1] == 0 && (0x2c0138 & is[i_62_ - 1][1 + i_63_]) == 0 && (is[i_62_ - 1][i_63_] & 0x2c0108) == 0 && (is[i_62_][i_63_ + 1] & 0x2c0120) == 0) {
					Class150.anIntArray1412[i_64_] = i_62_ - 1;
					Class120_Sub12.anIntArray2565[i_64_] = 1 + i_63_;
					i_64_ = i_64_ - -1 & 0xfff;
					Class179.anIntArrayArray1774[-1 + i_62_][i_63_ - -1] = 6;
					Class120_Sub2.anIntArrayArray2416[i_62_ - 1][i_63_ - -1] = i_67_;
				}
				if (i_62_ < 103 && i_63_ < 103 && Class179.anIntArrayArray1774[1 + i_62_][i_63_ - -1] == 0 && (is[i_62_ + 1][i_63_ + 1] & 0x2c01e0) == 0 && (is[i_62_ + 1][i_63_] & 0x2c0180) == 0 && (is[i_62_][1 + i_63_] & 0x2c0120) == 0) {
					Class150.anIntArray1412[i_64_] = i_62_ + 1;
					Class120_Sub12.anIntArray2565[i_64_] = 1 + i_63_;
					i_64_ = 0xfff & 1 + i_64_;
					Class179.anIntArrayArray1774[i_62_ - -1][1 + i_63_] = 12;
					Class120_Sub2.anIntArrayArray2416[i_62_ + 1][1 + i_63_] = i_67_;
				}
			}
			if (!bool_66_) {
				if (!bool) {
					return;
				}
				int i_68_ = 1000;
				int i_70_ = 100;
				for (int i_71_ = -10 + i_51_; i_71_ <= 10 + i_51_; i_71_++) {
					for (int i_72_ = i_54_ - 10; i_54_ + 10 >= i_72_; i_72_++) {
						if (i_71_ >= 0 && i_72_ >= 0 && i_71_ < 104 && i_72_ < 104 && Class120_Sub2.anIntArrayArray2416[i_71_][i_72_] < 100) {
							int i_73_ = 0;
							if (i_51_ <= i_71_) {
								if (i_59_ + i_51_ - 1 < i_71_) {
									i_73_ = i_71_ - -1 - (i_59_ + i_51_);
								}
							} else {
								i_73_ = -i_71_ + i_51_;
							}
							int i_74_ = 0;
							if (i_54_ > i_72_) {
								i_74_ = -i_72_ + i_54_;
							} else if (i_54_ - (-i_52_ + 1) < i_72_) {
								i_74_ = -i_54_ + -i_52_ + 1 + i_72_;
							}
							final int i_75_ = i_74_ * i_74_ + i_73_ * i_73_;
							if (i_68_ > i_75_ || i_68_ == i_75_ && i_70_ > Class120_Sub2.anIntArrayArray2416[i_71_][i_72_]) {
								i_63_ = i_72_;
								i_70_ = Class120_Sub2.anIntArrayArray2416[i_71_][i_72_];
								i_68_ = i_75_;
								i_62_ = i_71_;
							}
						}
					}
				}
				if (i_68_ == 1000 || i_62_ == i_56_ && i_63_ == i) {
					return;
				}
			}
			Class120_Sub12_Sub26.flagX = i_62_;
			SceneGroundObject.packetSetFlagPosition = false;
			Class65.flagY = i_63_;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("ka.B(").append(bool).append(',').append(i).append(',').append(i_51_).append(',').append(i_52_).append(',').append(i_53_).append(',').append(i_54_).append(',').append(i_55_).append(',').append(i_56_).append(',')
					.append(i_57_).append(',').append(i_58_).append(',').append(i_59_).append(')').toString());
		}
	}
}
