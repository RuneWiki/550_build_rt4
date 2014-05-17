/* Class164 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;

class Class164 {
	private Class120_Sub30 aClass120_Sub30_1583;
	private long aLong1584;
	static boolean forceTween;
	int[] anIntArray1587;
	static long serverSessionKey = 0L;
	private boolean aBoolean1589 = false;
	static int anInt1590 = 0;
	private int anInt1591;
	private int anInt1592;
	private int anInt1593;
	int anInt1594;
	private final Class120_Sub30[] aClass120_Sub30Array1595;
	int anInt1596;
	private final Class120_Sub30[] aClass120_Sub30Array1597;
	private int anInt1598;
	private int anInt1599;
	private long aLong1600;
	private long aLong1601;
	private boolean aBoolean1602;

	static {
		forceTween = false;
	}

	private final void method2129(final int i, final Class120_Sub30 class120_sub30, final byte i_0_) {
		try {
			final int i_1_ = i >> 5;
			final Class120_Sub30 class120_sub30_2_ = aClass120_Sub30Array1595[i_1_];
			if (class120_sub30_2_ == null) {
				aClass120_Sub30Array1597[i_1_] = class120_sub30;
			} else {
				class120_sub30_2_.aClass120_Sub30_2783 = class120_sub30;
			}
			aClass120_Sub30Array1595[i_1_] = class120_sub30;
			if (i_0_ == 30) {
				class120_sub30.anInt2781 = i;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("tj.F(").append(i).append(',').append(class120_sub30 != null ? "{...}" : "null").append(',').append(i_0_).append(')').toString());
		}
	}

	private final void method2130(final byte i, final int i_3_) {
		try {
			anInt1592 -= i_3_;
			if (anInt1592 < 0) {
				anInt1592 = 0;
			}
			if (aClass120_Sub30_1583 != null) {
				aClass120_Sub30_1583.method1731(i_3_);
			}
			if (i > -51) {
				anInt1598 = -98;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("tj.B(").append(i).append(',').append(i_3_).append(')').toString());
		}
	}

	final void method2131() {
		aBoolean1602 = true;
	}

	static final void method2132(final int i, final int i_4_, final boolean bool) {
		try {
			final InterfaceChangeNode class120_sub14_sub7 = AbstractObject.putInterfaceChange(7, i);
			class120_sub14_sub7.method1454((byte) -125);
			class120_sub14_sub7.anInt3484 = i_4_;
			if (!bool) {
				method2135(-76);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("tj.N(").append(i).append(',').append(i_4_).append(',').append(bool).append(')').toString());
		}
	}

	final synchronized void method2133(final byte i) {
		try {
			if (!aBoolean1589) {
				if (i >= -100) {
					method2131();
				}
				final long l = TimeUtil.getSafeTime();
				try {
					if ((500000L + aLong1584 ^ 0xffffffffffffffffL) > (l ^ 0xffffffffffffffffL)) {
						aLong1584 = -500000L + l;
					}
					for (/**/; aLong1584 + 5000L < l; aLong1584 += 256000 / Class178.anInt1771) {
						method2130((byte) -120, 256);
					}
				} catch (final Exception exception) {
					aLong1584 = l;
				}
				if (this.anIntArray1587 != null) {
					try {
						if (0L != aLong1601) {
							if ((l ^ 0xffffffffffffffffL) > (aLong1601 ^ 0xffffffffffffffffL)) {
								return;
							}
							method2134(this.anInt1596);
							aBoolean1602 = true;
							aLong1601 = 0L;
						}
						int i_5_ = method2137();
						if (anInt1599 < -i_5_ + anInt1593) {
							anInt1599 = -i_5_ + anInt1593;
						}
						int i_6_ = anInt1598 + this.anInt1594;
						if (256 + i_6_ > 16384) {
							i_6_ = 16128;
						}
						if (256 + i_6_ > this.anInt1596) {
							this.anInt1596 += 1024;
							i_5_ = 0;
							if (this.anInt1596 > 16384) {
								this.anInt1596 = 16384;
							}
							method2139();
							method2134(this.anInt1596);
							if (this.anInt1596 < 256 + i_6_) {
								i_6_ = -256 + this.anInt1596;
								anInt1598 = -this.anInt1594 + i_6_;
							}
							aBoolean1602 = true;
						}
						while (i_6_ > i_5_) {
							i_5_ += 256;
							method2147(this.anIntArray1587, 256);
							method2140();
						}
						if ((l ^ 0xffffffffffffffffL) < (aLong1600 ^ 0xffffffffffffffffL)) {
							if (aBoolean1602) {
								aBoolean1602 = false;
							} else {
								if (anInt1599 == 0 && anInt1591 == 0) {
									method2139();
									aLong1601 = l - -2000L;
									return;
								}
								anInt1598 = Math.min(anInt1591, anInt1599);
								anInt1591 = anInt1599;
							}
							anInt1599 = 0;
							aLong1600 = l + 2000L;
						}
						anInt1593 = i_5_;
					} catch (final Exception exception) {
						method2139();
						aLong1601 = l + 2000L;
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("tj.Q(").append(i).append(')').toString());
		}
	}

	void method2134(final int i) throws Exception {
		/* empty */
	}

	static final void method2135(final int i) {
		try {
			Class120_Sub12_Sub29.ping(false);
			Class66.anInt599 = 0;
			boolean bool = true;
			for (int i_7_ = 0; RuntimeException_Sub1.aByteArrayArray2140.length > i_7_; i_7_++) {
				if ((Class56.anIntArray495[i_7_] ^ 0xffffffff) != 0 && RuntimeException_Sub1.aByteArrayArray2140[i_7_] == null) {
					RuntimeException_Sub1.aByteArrayArray2140[i_7_] = Class65.aClass50_597.getFile(Class56.anIntArray495[i_7_], 0);
					if (RuntimeException_Sub1.aByteArrayArray2140[i_7_] == null) {
						bool = false;
						Class66.anInt599++;
					}
				}
				if (Class28.anIntArray183[i_7_] != -1 && Class134.aByteArrayArray1287[i_7_] == null) {
					Class134.aByteArrayArray1287[i_7_] = Class65.aClass50_597.method431(0, Class28.anIntArray183[i_7_], Class125.anIntArrayArray2150[i_7_], 0);
					if (Class134.aByteArrayArray1287[i_7_] == null) {
						bool = false;
						Class66.anInt599++;
					}
				}
				if (HDToolkit.glEnabled) {
					if (Class111.anIntArray1063[i_7_] != -1 && Class120_Sub12_Sub36.aByteArrayArray3421[i_7_] == null) {
						Class120_Sub12_Sub36.aByteArrayArray3421[i_7_] = Class65.aClass50_597.getFile(Class111.anIntArray1063[i_7_], 0);
						if (Class120_Sub12_Sub36.aByteArrayArray3421[i_7_] == null) {
							bool = false;
							Class66.anInt599++;
						}
					}
					if (Class76.anIntArray680[i_7_] != -1 && Class101_Sub1.aByteArrayArray2271[i_7_] == null) {
						Class101_Sub1.aByteArrayArray2271[i_7_] = Class65.aClass50_597.getFile(Class76.anIntArray680[i_7_], 0);
						if (Class101_Sub1.aByteArrayArray2271[i_7_] == null) {
							Class66.anInt599++;
							bool = false;
						}
					}
				}
				if (ProducingGraphicsBuffer.anIntArray2796 != null && Class179.aByteArrayArray1777[i_7_] == null && (ProducingGraphicsBuffer.anIntArray2796[i_7_] ^ 0xffffffff) != 0) {
					Class179.aByteArrayArray1777[i_7_] = Class65.aClass50_597.method431(0, ProducingGraphicsBuffer.anIntArray2796[i_7_], Class125.anIntArrayArray2150[i_7_], 0);
					if (Class179.aByteArrayArray1777[i_7_] == null) {
						bool = false;
						Class66.anInt599++;
					}
				}
			}
			if (SceneGraphNode.aClass137_1780 == null) {
				if (Class120_Sub12_Sub6.aClass120_Sub14_Sub22_3174 == null || !Class120_Sub12_Sub24.aClass50_3309.method414(new StringBuilder(Class120_Sub12_Sub6.aClass120_Sub14_Sub22_3174.aString3645).append("_labels").toString(), i + 4)) {
					SceneGraphNode.aClass137_1780 = new Class137(0);
				} else if (!Class120_Sub12_Sub24.aClass50_3309.method435(new StringBuilder(Class120_Sub12_Sub6.aClass120_Sub14_Sub22_3174.aString3645).append("_labels").toString(), 2)) {
					Class66.anInt599++;
					bool = false;
				} else {
					SceneGraphNode.aClass137_1780 = Class54.method478(Class120_Sub12_Sub24.aClass50_3309, -2, new StringBuilder(Class120_Sub12_Sub6.aClass120_Sub14_Sub22_3174.aString3645).append("_labels").toString(), Class120_Sub12_Sub37.membersClient);
				}
			}
			if (!bool) {
				Class120_Sub12_Sub28.anInt3361 = 1;
			} else {
				Class181.anInt1791 = 0;
				bool = true;
				for (int i_8_ = 0; i_8_ < RuntimeException_Sub1.aByteArrayArray2140.length; i_8_++) {
					byte[] is = Class134.aByteArrayArray1287[i_8_];
					if (is != null) {
						int i_9_ = 64 * (Class120_Sub12_Sub36.anIntArray3417[i_8_] >> 8) - GameEntity.currentBaseX;
						int i_10_ = -Class181.currentBaseZ + 64 * (0xff & Class120_Sub12_Sub36.anIntArray3417[i_8_]);
						if (Class134.aBoolean1282) {
							i_10_ = 10;
							i_9_ = 10;
						}
						bool &= Npc.method2349(0, i_10_, i_9_, is);
					}
					if (HDToolkit.glEnabled) {
						is = Class101_Sub1.aByteArrayArray2271[i_8_];
						if (is != null) {
							int i_11_ = -GameEntity.currentBaseX + 64 * (Class120_Sub12_Sub36.anIntArray3417[i_8_] >> 8);
							int i_12_ = -Class181.currentBaseZ + 64 * (Class120_Sub12_Sub36.anIntArray3417[i_8_] & 0xff);
							if (Class134.aBoolean1282) {
								i_11_ = 10;
								i_12_ = 10;
							}
							bool &= Npc.method2349(0, i_12_, i_11_, is);
						}
					}
				}
				if (!bool) {
					Class120_Sub12_Sub28.anInt3361 = 2;
				} else {
					boolean bool_13_ = false;
					if (Class120_Sub12_Sub28.anInt3361 != 0) {
						Class120_Sub12_Sub21_Sub1.drawTextOnScreen(new StringBuilder(Class120_Sub30_Sub2.aString3679).append("<br>(100%)").toString(), true);
					}
					Class120_Sub2.method1050();
					Class110.method976(-7603);
					if (HDToolkit.glEnabled && PacketBuffer.highWaterDetail) {
						for (int i_14_ = 0; i_14_ < RuntimeException_Sub1.aByteArrayArray2140.length; i_14_++) {
							if (Class101_Sub1.aByteArrayArray2271[i_14_] != null || Class120_Sub12_Sub36.aByteArrayArray3421[i_14_] != null) {
								bool_13_ = true;
								break;
							}
						}
					}
					Class3.method84(4, 104, 104, !HDToolkit.glEnabled ? 25 : 28, bool_13_);
					for (int i_15_ = 0; i_15_ < 4; i_15_++) {
						Class182.aClass25Array1802[i_15_].method225(i + 11742);
					}
					for (int i_16_ = 0; i_16_ < 4; i_16_++) {
						for (int i_17_ = 0; i_17_ < 104; i_17_++) {
							for (int i_18_ = 0; i_18_ < 104; i_18_++) {
								Class114.tileSettings[i_16_][i_17_][i_18_] = (byte) 0;
							}
						}
					}
					Class180_Sub6.method2355(false, 14713);
					if (HDToolkit.glEnabled) {
						Class47.aClass107_Sub1_432.method912();
						for (int i_19_ = 0; i_19_ < 13; i_19_++) {
							for (int i_20_ = 0; i_20_ < 13; i_20_++) {
								Class47.aClass94ArrayArray433[i_19_][i_20_].aBoolean875 = true;
							}
						}
					}
					if (HDToolkit.glEnabled) {
						LightManager.method1857();
					}
					if (HDToolkit.glEnabled) {
						Class187.method2478(false);
					}
					Class120_Sub2.method1050();
					System.gc();
					Class120_Sub12_Sub29.ping(true);
					Class120_Sub14_Sub16.method1567(false, (byte) -15);
					if (!Class134.aBoolean1282) {
						Class86.method729(false, i ^ ~0x4);
						Class120_Sub12_Sub29.ping(true);
						if (HDToolkit.glEnabled) {
							final int i_21_ = Class100.selfPlayer.anIntArray2958[0] >> 3;
							final int i_22_ = Class100.selfPlayer.anIntArray3040[0] >> 3;
							Class57.method494(i_21_, i_22_);
						}
						Class120_Sub12_Sub21_Sub1.method1312(24505, false);
						if (Class179.aByteArrayArray1777 != null) {
							Class42.method336((byte) 91);
						}
					}
					if (Class134.aBoolean1282) {
						Class120_Sub14_Sub14.method1542(false, false);
						Class120_Sub12_Sub29.ping(true);
						if (HDToolkit.glEnabled) {
							final int i_23_ = Class100.selfPlayer.anIntArray3040[0] >> 3;
							final int i_24_ = Class100.selfPlayer.anIntArray2958[0] >> 3;
							Class57.method494(i_24_, i_23_);
						}
						Class112.method987(false, 13371);
					}
					Class110.method976(-7603);
					Class120_Sub12_Sub29.ping(true);
					Class120_Sub12_Sub28.method1344(Class182.aClass25Array1802, (byte) 71, Class134.aBoolean1282 ? Class120_Sub12_Sub36.anIntArrayArrayArray3420 : null, false);
					if (HDToolkit.glEnabled) {
						LightManager.method1869();
					}
					Class120_Sub12_Sub29.ping(true);
					int i_25_ = DummyOutputStream.anInt29;
					if (i_25_ > Class173.gameLevel) {
						i_25_ = Class173.gameLevel;
					}
					if (i_25_ < -1 + Class173.gameLevel) {
						i_25_ = Class173.gameLevel + -1;
					}
					if (Class143_Sub1.method2021()) {
						Class5.method98(0);
					} else {
						Class5.method98(DummyOutputStream.anInt29);
					}
					Class192.method2515(1);
					if (HDToolkit.glEnabled && bool_13_) {
						Class178.method2257(true);
						Class120_Sub14_Sub16.method1567(true, (byte) -15);
						if (!Class134.aBoolean1282) {
							Class86.method729(true, 1);
							Class120_Sub12_Sub29.ping(true);
							Class120_Sub12_Sub21_Sub1.method1312(24505, true);
						}
						if (Class134.aBoolean1282) {
							Class120_Sub14_Sub14.method1542(true, false);
							Class120_Sub12_Sub29.ping(true);
							Class112.method987(true, 13371);
						}
						Class110.method976(-7603);
						Class120_Sub12_Sub29.ping(true);
						Class120_Sub12_Sub28.method1344(Class182.aClass25Array1802, (byte) 71, !Class134.aBoolean1282 ? null : Class120_Sub12_Sub36.anIntArrayArrayArray3420, true);
						Class120_Sub12_Sub29.ping(true);
						Class192.method2515(1);
						Class178.method2257(false);
					}
					if (HDToolkit.glEnabled) {
						for (int i_26_ = 0; i_26_ < 13; i_26_++) {
							for (int i_27_ = 0; i_27_ < 13; i_27_++) {
								Class47.aClass94ArrayArray433[i_26_][i_27_].method778(OverridedJInterface.anIntArrayArrayArray2741[0], 8 * i_26_, i_27_ * 8);
							}
						}
					}
					for (int i_28_ = 0; i_28_ < 104; i_28_++) {
						for (int i_29_ = 0; i_29_ < 104; i_29_++) {
							Class5.spawnGroundObject(i_28_, i_29_);
						}
					}
					Class57.method492(124);
					Class120_Sub2.method1050();
					Class120_Sub12_Sub21_Sub1.method1316(i ^ ~0x71);
					Class110.method976(-7603);
					Class93.aBoolean870 = false;
					if (HDToolkit.glEnabled) {
						System.out.println("a");
					//	Class101.method835(i + -3466, true);
					}
					if (Class112.frame != null && AbstractTimer.worldConnection != null && Class109.gameState == 25) {
						Class120_Sub12_Sub11.outputStream.putByteIsaac(236);
						Class120_Sub12_Sub11.outputStream.putInt(1057001181);
					}
					if (!Class134.aBoolean1282) {
						final int i_30_ = (-6 + Class116.anInt1118) / 8;
						final int i_31_ = (Class116.anInt1118 + 6) / 8;
						final int i_32_ = (Class3.anInt53 + -6) / 8;
						final int i_33_ = (Class3.anInt53 - -6) / 8;
						for (int i_34_ = i_30_ + -1; i_34_ <= 1 + i_31_; i_34_++) {
							for (int i_35_ = -1 + i_32_; 1 + i_33_ >= i_35_; i_35_++) {
								if (i_34_ < i_30_ || i_34_ > i_31_ || i_35_ < i_32_ || i_33_ < i_35_) {
									Class65.aClass50_597.method427(22, new StringBuilder("m").append(i_34_).append("_").append(i_35_).toString());
									Class65.aClass50_597.method427(71, new StringBuilder("l").append(i_34_).append("_").append(i_35_).toString());
								}
							}
						}
					}
					if (Class109.gameState == 28) {
						Class120_Sub14_Sub1.setGameState(10);
					} else {
						Class120_Sub14_Sub1.setGameState(30);
						if (AbstractTimer.worldConnection != null) {
							Class120_Sub12_Sub11.outputStream.putByteIsaac(113);
						}
					}
					Decimator.method2221(false);
					Class120_Sub2.method1050();
					Class69.method613((byte) 53);
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("tj.L(").append(i).append(')').toString());
		}
	}

	final synchronized void method2136(final int i) {
		try {
			if (i != 14680) {
				method2130((byte) 53, 98);
			}
			if (Class90.aClass82_850 != null) {
				boolean bool = true;
				for (int i_36_ = 0; i_36_ < 2; i_36_++) {
					if (this == Class90.aClass82_850.aClass164Array782[i_36_]) {
						Class90.aClass82_850.aClass164Array782[i_36_] = null;
					}
					if (Class90.aClass82_850.aClass164Array782[i_36_] != null) {
						bool = false;
					}
				}
				if (bool) {
					Class90.aClass82_850.aBoolean780 = true;
					while (Class90.aClass82_850.aBoolean784) {
						PacketBuffer.sleepWrapper(50L);
					}
					Class90.aClass82_850 = null;
				}
			}
			method2139();
			aBoolean1589 = true;
			this.anIntArray1587 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("tj.I(").append(i).append(')').toString());
		}
	}

	int method2137() throws Exception {
		int i;
		try {
			i = this.anInt1596;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, "tj.G()");
		}
		return i;
	}

	static final Class107_Sub1 method2138(final int i, final int i_37_, final Class50 class50, final int i_38_) {
		Class107_Sub1 class107_sub1;
		try {
			if (!Class10.method121(class50, i_38_, i_37_)) {
				return null;
			}
			if (i != 32) {
				method2135(10);
			}
			class107_sub1 = Class120_Sub12_Sub20.method1303(true);
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("tj.J(").append(i).append(',').append(i_37_).append(',').append(class50 != null ? "{...}" : "null").append(',').append(i_38_).append(')').toString());
		}
		return class107_sub1;
	}

	void method2139() {
		/* empty */
	}

	void method2140() throws Exception {
		/* empty */
	}

	void method2141(final Component component) throws Exception {
		/* empty */
	}

	static final void method2142() {
		if (!Class188.aBoolean1925) {
			Class118.aBoolean1134 = true;
			if (!Class134.aBoolean1277) {
				Class120_Sub15.aFloat2598 += (-Class120_Sub15.aFloat2598 + -24.0F) / 2.0F;
			} else {
				DummyOutputStream.aFloat28 = (int) DummyOutputStream.aFloat28 - 65 & ~0x7f;
			}
			Class188.aBoolean1925 = true;
		}
	}

	final synchronized void method2143(final Class120_Sub30 class120_sub30, final int i) {
		try {
			if (i == 8) {
				aClass120_Sub30_1583 = class120_sub30;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("tj.H(").append(class120_sub30 != null ? "{...}" : "null").append(',').append(i).append(')').toString());
		}
	}

	final synchronized void method2144(final byte i) {
		do {
			try {
				aBoolean1602 = true;
				try {
					method2146();
				} catch (final Exception exception) {
					method2139();
					aLong1601 = TimeUtil.getSafeTime() - -2000L;
					break;
				}
				break;
			} catch (final RuntimeException runtimeexception) {
				throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("tj.A(").append(i).append(')').toString());
			}
		} while (false);
	}

	static final void method2145(final int i, final int i_39_, final JagexInterface jagexInterface, final int i_40_, final int i_41_) {
		try {
			Class120_Sub2.method1050();
			if (i_41_ != 0) {
				method2138(10, 30, null, -107);
			}
			if (HDToolkit.glEnabled) {
				GraphicsHD.clipRect(i, i_40_, jagexInterface.anInt1948 + i, jagexInterface.anInt2059 + i_40_);
			} else {
				GraphicsLD.clipRect(i, i_40_, i - -jagexInterface.anInt1948, i_40_ - -jagexInterface.anInt2059);
			}
			if (AbstractGraphicsBuffer.anInt1175 == 2 || AbstractGraphicsBuffer.anInt1175 == 5 || Class134.aClass120_Sub14_Sub19_1276 == null) {
				if (HDToolkit.glEnabled) {
					final AbstractSprite class120_sub14_sub19 = jagexInterface.method2492(false);
					if (class120_sub14_sub19 != null) {
						class120_sub14_sub19.method1587(i, i_40_);
					}
				} else {
					GraphicsLD.method2156(i, i_40_, 0, jagexInterface.anIntArray2079, jagexInterface.anIntArray1949);
				}
			} else {
				final int i_42_ = (int) DummyOutputStream.aFloat28 - -anInt1590 & 0x7ff;
				final int i_43_ = 464 - (Class100.selfPlayer.z / 32 + 0);
				final int i_44_ = 48 - -(Class100.selfPlayer.x / 32);
				if (!HDToolkit.glEnabled) {
					((LDSprite) Class134.aClass120_Sub14_Sub19_1276).method1606(i, i_40_, jagexInterface.anInt1948, jagexInterface.anInt2059, i_44_, i_43_, i_42_, 256 + Class154.anInt1442, jagexInterface.anIntArray2079, jagexInterface.anIntArray1949);
				} else {
					((HDSprite) Class134.aClass120_Sub14_Sub19_1276).method1600(i, i_40_, jagexInterface.anInt1948, jagexInterface.anInt2059, i_44_, i_43_, i_42_, 256 - -Class154.anInt1442, (HDSprite) jagexInterface.method2492(false));
				}
				if (SceneGraphNode.aClass137_1780 != null) {
					for (int i_45_ = 0; i_45_ < SceneGraphNode.aClass137_1780.anInt1325; i_45_++) {
						if (SceneGraphNode.aClass137_1780.aClass120_Sub14_Sub5Array1324[i_45_] != null && SceneGraphNode.aClass137_1780.anIntArray1322[i_45_] >> 28 == Class173.gameLevel) {
							final int i_46_ = -GameEntity.currentBaseX + (SceneGraphNode.aClass137_1780.anIntArray1322[i_45_] >> 14 & 0x3fff);
							final int i_47_ = (SceneGraphNode.aClass137_1780.anIntArray1322[i_45_] & 0x3fff) - Class181.currentBaseZ;
							if (i_46_ >= 0 && i_46_ < 104 && i_47_ >= 0 && i_47_ < 104) {
								final int i_48_ = -(Class100.selfPlayer.x / 32) + i_46_ * 4 - -2;
								final int i_49_ = -(Class100.selfPlayer.z / 32) + 4 * i_47_ + 2;
								Class120_Sub14_Sub14_Sub2.method1547(i_40_, jagexInterface, i, SceneGraphNode.aClass137_1780.aClass120_Sub14_Sub5Array1324[i_45_].anInt3473, i_48_, i_49_, i_41_ + 2);
							}
						}
					}
				}
				for (int i_50_ = 0; Class120_Sub24.anInt2718 > i_50_; i_50_++) {
					final int i_51_ = 2 + Class73.anIntArray661[i_50_] * 4 + -(Class100.selfPlayer.x / 32);
					final int i_52_ = Class69_Sub2.anIntArray2235[i_50_] * 4 - -2 - Class100.selfPlayer.z / 32 - 0;
					LocType locType = LocType.list(Class7.anIntArray62[i_50_]);
					if (locType.childrenIDs != null) {
						locType = locType.handleVarp();
						if (locType == null || locType.anInt1840 == -1) {
							continue;
						}
					}
					Class120_Sub14_Sub14_Sub2.method1547(i_40_, jagexInterface, i, locType.anInt1840, i_51_, i_52_, 2);
				}
				for (int i_53_ = 0; i_53_ < 104; i_53_++) {
					for (int i_54_ = 0; i_54_ < 104; i_54_++) {
						final Deque deque = Class120_Sub14_Sub12.groundObjects[Class173.gameLevel][i_53_][i_54_];
						if (deque != null) {
							final int i_55_ = 2 + 4 * i_53_ + -(Class100.selfPlayer.x / 32);
							final int i_56_ = -(Class100.selfPlayer.z / 32) + 4 * i_54_ - -2;
							Class23.method200(i, jagexInterface, i_40_, i_55_, i_41_ ^ 0x2, i_56_, Class120_Sub12_Sub6.aClass120_Sub14_Sub19Array3168[0]);
						}
					}
				}
				for (int i_57_ = 0; i_57_ < Class148.localNpcCount; i_57_++) {
					final Npc class180_sub5_sub2 = Class120_Sub12_Sub11.npcList[Class120_Sub12_Sub36.localNpcIndices[i_57_]];
					if (class180_sub5_sub2 != null && class180_sub5_sub2.isVisible()) {
						NpcType npcType = class180_sub5_sub2.npcType;
						if (npcType != null && npcType.childrenIDs != null) {
							npcType = npcType.handleVarp();
						}
						if (npcType != null && npcType.aBoolean1671 && npcType.aBoolean1688) {
							final int i_58_ = -(Class100.selfPlayer.x / 32) + class180_sub5_sub2.x / 32;
							final int i_59_ = -(Class100.selfPlayer.z / 32) + class180_sub5_sub2.z / 32;
							if (npcType.anInt1698 != -1) {
								Class120_Sub14_Sub14_Sub2.method1547(i_40_, jagexInterface, i, npcType.anInt1698, i_58_, i_59_, i_41_ ^ 0x2);
							} else {
								Class23.method200(i, jagexInterface, i_40_, i_58_, i_41_ + 2, i_59_, Class120_Sub12_Sub6.aClass120_Sub14_Sub19Array3168[1]);
							}
						}
					}
				}
				for (int i_60_ = 0; i_60_ < Class83.localPlayerCount; i_60_++) {
					final Player class180_sub5_sub1 = Class118.playersList[Class112.playerIndices[i_60_]];
					if (class180_sub5_sub1 != null && class180_sub5_sub1.isVisible()) {
						final int i_61_ = class180_sub5_sub1.x / 32 + -(Class100.selfPlayer.x / 32);
						boolean bool = false;
						final int i_62_ = class180_sub5_sub1.z / 32 + -(Class100.selfPlayer.z / 32);
						final long l = Class70.stringToLong(class180_sub5_sub1.name);
						for (int i_63_ = 0; ProducingGraphicsBuffer.anInt2799 > i_63_; i_63_++) {
							if (l == AbstractSprite.aLongArray3617[i_63_] && Class120_Sub12_Sub16.anIntArray3252[i_63_] != 0) {
								bool = true;
								break;
							}
						}
						boolean bool_64_ = false;
						for (int i_65_ = 0; i_65_ < Class120_Sub14_Sub13.anInt3572; i_65_++) {
							if (Class120_Sub28.aClass120_Sub13Array2754[i_65_].uid == l) {
								bool_64_ = true;
								break;
							}
						}
						boolean bool_66_ = false;
						if (Class100.selfPlayer.anInt3744 != 0 && class180_sub5_sub1.anInt3744 != 0 && Class100.selfPlayer.anInt3744 == class180_sub5_sub1.anInt3744) {
							bool_66_ = true;
						}
						if (bool) {
							Class23.method200(i, jagexInterface, i_40_, i_61_, 2, i_62_, Class120_Sub12_Sub6.aClass120_Sub14_Sub19Array3168[3]);
						} else if (bool_64_) {
							Class23.method200(i, jagexInterface, i_40_, i_61_, i_41_ + 2, i_62_, Class120_Sub12_Sub6.aClass120_Sub14_Sub19Array3168[5]);
						} else if (!bool_66_) {
							Class23.method200(i, jagexInterface, i_40_, i_61_, 2, i_62_, Class120_Sub12_Sub6.aClass120_Sub14_Sub19Array3168[2]);
						} else {
							Class23.method200(i, jagexInterface, i_40_, i_61_, i_41_ ^ 0x2, i_62_, Class120_Sub12_Sub6.aClass120_Sub14_Sub19Array3168[4]);
						}
					}
				}
				int i_67_ = 0;
				for (final Class85[] class85s = Class187.aClass85Array1909; class85s.length > i_67_; i_67_++) {
					final Class85 class85 = class85s[i_67_];
					if (class85 != null && class85.anInt809 != 0 && Class101_Sub2.loopCycle % 20 < 10) {
						if (class85.anInt809 == 1 && class85.anInt808 >= 0 && class85.anInt808 < Class120_Sub12_Sub11.npcList.length) {
							final Npc class180_sub5_sub2 = Class120_Sub12_Sub11.npcList[class85.anInt808];
							if (class180_sub5_sub2 != null) {
								final int i_68_ = -(Class100.selfPlayer.z / 32) + class180_sub5_sub2.z / 32;
								final int i_69_ = -(Class100.selfPlayer.x / 32) + class180_sub5_sub2.x / 32;
								Class145.method2048(jagexInterface, 360000, i, 7403, i_68_, i_40_, i_69_, class85.anInt805);
							}
						}
						if (class85.anInt809 == 2) {
							final int i_70_ = -(Class100.selfPlayer.z / 32) + 4 * (class85.anInt813 - Class181.currentBaseZ) + 2;
							int i_71_ = 4 * class85.anInt810;
							final int i_72_ = -(Class100.selfPlayer.x / 32) + 4 * (-GameEntity.currentBaseX + class85.anInt804) - -2;
							i_71_ *= i_71_;
							Class145.method2048(jagexInterface, i_71_, i, 7403, i_70_, i_40_, i_72_, class85.anInt805);
						}
						if (class85.anInt809 == 10 && class85.anInt808 >= 0 && class85.anInt808 < Class118.playersList.length) {
							final Player class180_sub5_sub1 = Class118.playersList[class85.anInt808];
							if (class180_sub5_sub1 != null) {
								final int i_73_ = class180_sub5_sub1.x / 32 - Class100.selfPlayer.x / 32;
								final int i_74_ = -(Class100.selfPlayer.z / 32) + class180_sub5_sub1.z / 32;
								Class145.method2048(jagexInterface, 360000, i, 7403, i_74_, i_40_, i_73_, class85.anInt805);
							}
						}
					}
				}
				if (Class120_Sub12_Sub26.anInt3327 != 0) {
					final int i_75_ = -(Class100.selfPlayer.x / 32) + Class120_Sub12_Sub26.anInt3327 * 4 + 2 - 2 - -(2 * Class100.selfPlayer.getSize());
					i_67_ = 2 + Class65.anInt592 * 4 - Class100.selfPlayer.z / 32 - (2 + -(2 * Class100.selfPlayer.getSize()));
					Class23.method200(i, jagexInterface, i_40_, i_75_, 2, i_67_, Class101_Sub1.aClass120_Sub14_Sub19Array2274[!SceneGroundObject.aBoolean2848 ? 0 : 1]);
				}
				if (!HDToolkit.glEnabled) {
					GraphicsLD.fillRect(i + jagexInterface.anInt1948 / 2 - 1, -1 + jagexInterface.anInt2059 / 2 + i_40_, 3, 3, 16777215);
				} else {
					GraphicsHD.fillRect(-1 + i + jagexInterface.anInt1948 / 2, -1 + jagexInterface.anInt2059 / 2 + i_40_, 3, 3, 16777215);
				}
			}
			Class120_Sub12_Sub33.aBooleanArray3391[i_39_] = true;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("tj.C(").append(i).append(',').append(i_39_).append(',').append(jagexInterface != null ? "{...}" : "null").append(',').append(i_40_).append(',').append(i_41_).append(')').toString());
		}
	}

	void method2146() throws Exception {
		/* empty */
	}

	private final void method2147(final int[] is, final int i) {
		int i_76_ = i;
		if (Class90.aBoolean846) {
			i_76_ <<= 1;
		}
		ArrayUtils.resetArray(is, 0, i_76_);
		anInt1592 -= i;
		if (aClass120_Sub30_1583 != null && anInt1592 <= 0) {
			anInt1592 += Class178.anInt1771 >> 4;
			Class49.method409(aClass120_Sub30_1583, (byte) 24);
			method2129(aClass120_Sub30_1583.method1733(), aClass120_Sub30_1583, (byte) 30);
			int i_77_ = 0;
			int i_78_ = 255;
			int i_79_ = 7;
			while_121_: while (i_78_ != 0) {
				int i_80_;
				int i_81_;
				if (i_79_ < 0) {
					i_80_ = i_79_ & 0x3;
					i_81_ = -(i_79_ >> 2);
				} else {
					i_80_ = i_79_;
					i_81_ = 0;
				}
				for (int i_82_ = i_78_ >>> i_80_ & 0x11111111; i_82_ != 0; i_82_ >>>= 4) {
					if ((i_82_ & 0x1) != 0) {
						i_78_ &= 1 << i_80_ ^ 0xffffffff;
						Class120_Sub30 class120_sub30 = null;
						Class120_Sub30 class120_sub30_83_ = aClass120_Sub30Array1597[i_80_];
						while (class120_sub30_83_ != null) {
							final Class120_Sub5 class120_sub5 = class120_sub30_83_.aClass120_Sub5_2782;
							if (class120_sub5 != null && class120_sub5.anInt2442 > i_81_) {
								i_78_ |= 1 << i_80_;
								class120_sub30 = class120_sub30_83_;
								class120_sub30_83_ = class120_sub30_83_.aClass120_Sub30_2783;
							} else {
								class120_sub30_83_.aBoolean2784 = true;
								final int i_84_ = class120_sub30_83_.method1732();
								i_77_ += i_84_;
								if (class120_sub5 != null) {
									class120_sub5.anInt2442 += i_84_;
								}
								if (i_77_ >= 32) {
									break while_121_;
								}
								Class120_Sub30 class120_sub30_85_ = class120_sub30_83_.method1736();
								if (class120_sub30_85_ != null) {
									final int i_86_ = class120_sub30_83_.anInt2781;
									for (/**/; class120_sub30_85_ != null; class120_sub30_85_ = class120_sub30_83_.method1735()) {
										method2129(i_86_ * class120_sub30_85_.method1733() >> 8, class120_sub30_85_, (byte) 30);
									}
								}
								final Class120_Sub30 class120_sub30_87_ = class120_sub30_83_.aClass120_Sub30_2783;
								class120_sub30_83_.aClass120_Sub30_2783 = null;
								if (class120_sub30 == null) {
									aClass120_Sub30Array1597[i_80_] = class120_sub30_87_;
								} else {
									class120_sub30.aClass120_Sub30_2783 = class120_sub30_87_;
								}
								if (class120_sub30_87_ == null) {
									aClass120_Sub30Array1595[i_80_] = class120_sub30;
								}
								class120_sub30_83_ = class120_sub30_87_;
							}
						}
					}
					i_80_ += 4;
					i_81_++;
				}
				i_79_--;
			}
			for (i_79_ = 0; i_79_ < 8; i_79_++) {
				Class120_Sub30 class120_sub30 = aClass120_Sub30Array1597[i_79_];
				aClass120_Sub30Array1597[i_79_] = aClass120_Sub30Array1595[i_79_] = null;
				Class120_Sub30 class120_sub30_88_;
				for (/**/; class120_sub30 != null; class120_sub30 = class120_sub30_88_) {
					class120_sub30_88_ = class120_sub30.aClass120_Sub30_2783;
					class120_sub30.aClass120_Sub30_2783 = null;
				}
			}
		}
		if (anInt1592 < 0) {
			anInt1592 = 0;
		}
		if (aClass120_Sub30_1583 != null) {
			aClass120_Sub30_1583.method1734(is, 0, i);
		}
		aLong1584 = TimeUtil.getSafeTime();
	}

	public Class164() {
		aLong1584 = TimeUtil.getSafeTime();
		anInt1593 = 0;
		anInt1591 = 0;
		anInt1592 = 0;
		aClass120_Sub30Array1597 = new Class120_Sub30[8];
		anInt1599 = 0;
		aClass120_Sub30Array1595 = new Class120_Sub30[8];
		aLong1601 = 0L;
		aBoolean1602 = true;
		aLong1600 = 0L;
	}
}
