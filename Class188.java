/* Class188 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.net.URL;

final class Class188 {
	int anInt1910;
	int anInt1911;
	int anInt1912;
	int anInt1913;
	int anInt1914;
	int anInt1915;
	int anInt1916;
	int anInt1917;
	int anInt1918;
	int anInt1919;
	int anInt1920;
	int anInt1921;
	int anInt1922;
	int anInt1923;
	int anInt1924;
	static boolean aBoolean1925 = false;
	int anInt1926;
	int anInt1927;
	int anInt1928;

	static final void method2480(final boolean bool, final int i) {
		try {
			Class120_Sub12_Sub14.aClass21_3238.method192(i);
			if (!bool) {
				aBoolean1925 = true;
			}
			Class82.aClass21_786.method192(i);
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("we.B(").append(bool).append(',').append(i).append(')').toString());
		}
	}

	static final void method2481(final int i) {
		try {
			if (i != 104) {
				method2483((byte) -31, 48);
			}
			Class30.aClass120_Sub30_Sub2_234.method1770(21229);
			Class120_Sub12_Sub25.anInt3312 = 1;
			Class52.aClass50_476 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("we.E(").append(i).append(')').toString());
		}
	}

	static final void method2482(final String string, final boolean bool) {
		if (bool) {
			do {
				if (HDToolkit.glEnabled && Class99.openwinjsEnabled) {
					try {
						Class77.method667(new Object[] { new URL(Class31.gameApplet.getCodeBase(), string).toString() }, NpcType.gameSignlink.gameApplet, "openjs");
					} catch (final Throwable throwable) {
						break;
					}
					return;
				}
			} while (false);
			try {
				Class31.gameApplet.getAppletContext().showDocument(new URL(Class31.gameApplet.getCodeBase(), string), "_blank");
			} catch (final Exception exception) {
				/* empty */
			}
		} else {
			try {
				Class77.method666(NpcType.gameSignlink.gameApplet, "loggedout");
			} catch (final Throwable throwable) {
				/* empty */
			}
			try {
				Class31.gameApplet.getAppletContext().showDocument(new URL(Class31.gameApplet.getCodeBase(), string), "_top");
			} catch (final Exception exception) {
				/* empty */
			}
		}
	}

	static final boolean method2483(final byte i, final int i_0_) {
		boolean bool;
		try {
			if (i < 57) {
				method2484(false);
			}
			final Class167_Sub1 class167_sub1 = Class82.method710((byte) -24, i_0_);
			if (class167_sub1 == null) {
				return false;
			}
			if (Signlink.anInt1310 == 1 || Signlink.anInt1310 == 2 || Class107.modeWhere == 2) {
				Class120_Sub12_Sub30.aString3375 = class167_sub1.aString2836;
				Class157.anInt1469 = class167_sub1.anInt2838;
				if (Class107.modeWhere != 0) {
					GameEntity.anInt3045 = 50000 - -Class157.anInt1469;
					Class71.anInt625 = Class157.anInt1469 + 40000;
					Class158.anInt1479 = Class71.anInt625;
				}
				return true;
			}
			String string = "";
			String string_1_ = "";
			if (Class120_Sub12_Sub25.settings != null) {
				string_1_ = new StringBuilder("/p=").append(Class120_Sub12_Sub25.settings).toString();
			}
			if (Class107.modeWhere != 0) {
				string = new StringBuilder(":").append(7000 + class167_sub1.anInt2838).toString();
			}
			final String string_2_ = new StringBuilder("http://").append(class167_sub1.aString2836).append(string).append("/l=").append(Class9.language).append("/a=").append(Class120_Sub12_Sub33.affiliateId).append(string_1_).append("/j").append(!Class48.aBoolean437 ? "0" : "1").append(",o")
					.append(Class110.aBoolean1054 ? "1" : "0").append(",a2,m").append(Class31.advertSuppressed ? "1" : "0").toString();
			try {
				Class179.aClient1776.getAppletContext().showDocument(new URL(string_2_), "_self");
			} catch (final Exception exception) {
				return false;
			}
			bool = true;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("we.C(").append(i).append(',').append(i_0_).append(')').toString());
		}
		return bool;
	}

	public Class188() {
		/* empty */
	}

	static final void method2484(final boolean bool) {
		while_177_: do {
			try {
				if (Class24.method207() == 2) {
					final byte i = (byte) (0xff & InterfaceChangeNode.anInt3490 + -4);
					if (bool) {
						aBoolean1925 = false;
					}
					final int i_3_ = InterfaceChangeNode.anInt3490 % 104;
					for (int i_4_ = 0; i_4_ < 4; i_4_++) {
						for (int i_5_ = 0; i_5_ < 104; i_5_++) {
							Class9.aByteArrayArrayArray70[i_4_][i_3_][i_5_] = i;
						}
					}
					if (Class173.gameLevel != 3) {
						for (int i_6_ = 0; i_6_ < 2; i_6_++) {
							Class134.anIntArray1284[i_6_] = -1000000;
							Class54.anIntArray488[i_6_] = 1000000;
							IntegerNode.anIntArray2787[i_6_] = 0;
							StringNode.anIntArray2735[i_6_] = 1000000;
							Class180_Sub6.anIntArray3075[i_6_] = 0;
						}
						if (client.anInt2200 != 1) {
							final int i_7_ = Class22.method197(Class173.gameLevel, Class83.anInt792, GroundObjectNode.anInt3626);
							if (-Class120_Sub12_Sub10.anInt3200 + i_7_ < 800 && (0x4 & Class114.aByteArrayArrayArray1095[Class173.gameLevel][Class83.anInt792 >> 7][GroundObjectNode.anInt3626 >> 7]) != 0) {
								Class120_Sub3.method1055(1, Class83.anInt792 >> 7, false, false, GroundObjectNode.anInt3626 >> 7, Class120_Sub1.groundTiles);
							}
						} else {
							if ((0x4 & Class114.aByteArrayArrayArray1095[Class173.gameLevel][Class100.selfPlayer.x >> 7][Class100.selfPlayer.z >> 7]) != 0) {
								Class120_Sub3.method1055(0, Class100.selfPlayer.x >> 7, bool, false, Class100.selfPlayer.z >> 7, Class120_Sub1.groundTiles);
							}
							if (Class128.anInt1223 < 310) {
								int i_8_ = GroundObjectNode.anInt3626 >> 7;
								int i_9_ = Class83.anInt792 >> 7;
								final int i_10_ = Class100.selfPlayer.z >> 7;
								int i_11_;
								if (i_8_ >= i_10_) {
									i_11_ = i_8_ + -i_10_;
								} else {
									i_11_ = -i_8_ + i_10_;
								}
								final int i_12_ = Class100.selfPlayer.x >> 7;
								int i_13_;
								if (i_12_ > i_9_) {
									i_13_ = -i_9_ + i_12_;
								} else {
									i_13_ = -i_12_ + i_9_;
								}
								if (i_13_ == 0 && i_11_ == 0 || i_13_ <= -104 || i_13_ >= 104 || i_11_ <= -104 || i_11_ >= 104) {
									Class180_Sub3.method2312(null, new StringBuilder("RC: ").append(i_9_).append(",").append(i_8_).append(" ").append(i_12_).append(",").append(i_10_).append(" ").append(GameEntity.currentBaseX).append(",").append(Class181.currentBaseZ).toString());
								} else if (i_13_ <= i_11_) {
									int i_14_ = 32768;
									final int i_15_ = i_13_ * 65536 / i_11_;
									for (;;) {
										if (i_8_ == i_10_) {
											break while_177_;
										}
										if (i_10_ <= i_8_) {
											if (i_10_ < i_8_) {
												i_8_--;
											}
										} else {
											i_8_++;
										}
										if ((Class114.aByteArrayArrayArray1095[Class173.gameLevel][i_9_][i_8_] & 0x4) != 0) {
											Class120_Sub3.method1055(1, i_9_, false, false, i_8_, Class120_Sub1.groundTiles);
											break while_177_;
										}
										i_14_ += i_15_;
										if (i_14_ >= 65536) {
											i_14_ -= 65536;
											if (i_12_ > i_9_) {
												i_9_++;
											} else if (i_9_ > i_12_) {
												i_9_--;
											}
											if ((0x4 & Class114.aByteArrayArrayArray1095[Class173.gameLevel][i_9_][i_8_]) != 0) {
												break;
											}
										}
									}
									Class120_Sub3.method1055(1, i_9_, false, false, i_8_, Class120_Sub1.groundTiles);
								} else {
									final int i_16_ = 65536 * i_11_ / i_13_;
									int i_17_ = 32768;
									for (;;) {
										if (i_12_ == i_9_) {
											break while_177_;
										}
										if (i_9_ >= i_12_) {
											if (i_12_ < i_9_) {
												i_9_--;
											}
										} else {
											i_9_++;
										}
										if ((0x4 & Class114.aByteArrayArrayArray1095[Class173.gameLevel][i_9_][i_8_]) != 0) {
											Class120_Sub3.method1055(1, i_9_, bool, false, i_8_, Class120_Sub1.groundTiles);
											break while_177_;
										}
										i_17_ += i_16_;
										if (-65537 >= (i_17_ ^ 0xffffffff)) {
											if (i_8_ < i_10_) {
												i_8_++;
											} else if (i_10_ < i_8_) {
												i_8_--;
											}
											i_17_ -= 65536;
											if ((Class114.aByteArrayArrayArray1095[Class173.gameLevel][i_9_][i_8_] & 0x4) != 0) {
												break;
											}
										}
									}
									Class120_Sub3.method1055(1, i_9_, bool, false, i_8_, Class120_Sub1.groundTiles);
								}
							}
						}
					}
				}
			} catch (final RuntimeException runtimeexception) {
				throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("we.D(").append(bool).append(')').toString());
			}
		} while (false);
	}
}
