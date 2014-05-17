/* Class172 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Decimator {
	static int anInt1716;
	private int anInt1717;
	private int anInt1718;
	private int[][] anIntArrayArray1719;
	static int[] anIntArray1720 = new int[25];
	static Class50 aClass50_1721;
	static boolean fogEnabled;

	static {
		anInt1716 = 0;
		fogEnabled = true;
	}

	final int method2217(int i, final byte i_0_) {
		int i_1_;
		try {
			if (i_0_ > -126) {
				method2219(-29L);
			}
			if (anIntArrayArray1719 != null) {
				i = (int) ((long) anInt1717 * (long) i / anInt1718);
			}
			i_1_ = i;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ud.E(").append(i).append(',').append(i_0_).append(')').toString());
		}
		return i_1_;
	}

	final int method2218(final int i, int i_2_) {
		int i_3_;
		try {
			if (i >= -124) {
				method2219(103L);
			}
			if (anIntArrayArray1719 != null) {
				i_2_ = (int) ((long) anInt1717 * (long) i_2_ / anInt1718) + 6;
			}
			i_3_ = i_2_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ud.A(").append(i).append(',').append(i_2_).append(')').toString());
		}
		return i_3_;
	}

	static final void method2219(final long l) {
		if (client.cameraType == 1 || client.cameraType == 5) {
			Class120_Sub12_Sub5.method1222(l);
		} else if (client.cameraType == 2) {
			Class120_Sub12_Sub16.method1279();
		} else {
			Class120_Sub14_Sub6.method1445();
		}
		if (!Class15.menuOpen) {
			if (FileSystem.anInt455 == 0) {
				if (Class156.lastMouseClick == 0) {
					Class120_Sub12_Sub21.anInt3298 = Class191.lastMouseY;
					Class115.anInt1110 = Queue.lastMouseX;
				} else {
					Class120_Sub12_Sub21.anInt3298 = Class120_Sub12_Sub36.lastClickY;
					Class115.anInt1110 = Class50.lastClickX;
				}
			} else {
				Class115.anInt1110 = Class120_Sub14_Sub12.anInt3558;
				Class120_Sub12_Sub21.anInt3298 = Class31.anInt250;
			}
			Class120_Sub29.aShortArray2777[0] = (short) 1006;
			Class120_Sub12_Sub33.menuOptionName[0] = Class157.aString1462;
			Class120_Sub12_Sub29.aStringArray3369[0] = "";
			Class186.menuOptionCount = 1;
			InterfaceChangeNode.menuOptionsCursorId[0] = Class192.anInt2123;
		}
		ParticleEngine.method959(Class101_Sub2.loopCycle);
		if ((Class69.rootInterfaceId ^ 0xffffffff) != 0) {
			AbstractGraphicsBuffer.method1846(Class69.rootInterfaceId);
		}
		for (int i_4_ = 0; i_4_ < Class120_Sub1.anInt2414; i_4_++) {
			if (Class52.aBooleanArray467[i_4_]) {
				Class120_Sub12_Sub33.aBooleanArray3391[i_4_] = true;
			}
			Class9.aBooleanArray74[i_4_] = Class52.aBooleanArray467[i_4_];
			Class52.aBooleanArray467[i_4_] = false;
		}
		Class69_Sub3_Sub1.aClass189_3080 = null;
		Class84.anInt796 = Class101_Sub2.loopCycle;
		Class56.anInt497 = -1;
		Class120_Sub14_Sub16.anInt3590 = -1;
		Class120_Sub14_Sub16.aClass189_3588 = null;
		if (HDToolkit.glEnabled) {
			Class167.aBoolean1620 = true;
		}
		if (Class69.rootInterfaceId != -1) {
			Class120_Sub1.anInt2414 = 0;
			Class56.method486();
		}
		if (HDToolkit.glEnabled) {
			GraphicsHD.method597();
		} else {
			GraphicsLD.method2175();
		}
		Class120_Sub12_Sub12.method1262();
		if (Class15.menuOpen) {
			if (Class186.usingSpriteMenu) {
				Class120_Sub12_Sub18.method1293();
			} else {
				FileSystem.drawMenu();
			}
		} else if (Class69_Sub3_Sub1.aClass189_3080 == null) {
			if (Class56.anInt497 != -1) {
				Class86.method728(null, Class56.anInt497, Class120_Sub14_Sub16.anInt3590);
			}
		} else {
			Class86.method728(Class69_Sub3_Sub1.aClass189_3080, Class9.anInt68, Class90.anInt847);
		}
		int cursor = !Class15.menuOpen ? Class53_Sub1.getMenuOptionCursor() : -1;
		if (cursor == -1) {
			cursor = Class107.defaultCursorId;
		}
		Class120_Sub12_Sub6.setCursor(cursor);
		if (Class120_Sub12_Sub33.anInt3401 == 1) {
			Class120_Sub12_Sub33.anInt3401 = 2;
		}
		if (Class120_Sub14_Sub5.anInt3479 == 1) {
			Class120_Sub14_Sub5.anInt3479 = 2;
		}
		if (Class15.anInt96 == 3) {
			for (int i_6_ = 0; i_6_ < Class120_Sub1.anInt2414; i_6_++) {
				if (Class9.aBooleanArray74[i_6_]) {
					if (HDToolkit.glEnabled) {
						GraphicsHD.fillRect(Class160.anIntArray1495[i_6_], Class120_Sub12_Sub38.anIntArray3441[i_6_], Class120_Sub16.anIntArray2608[i_6_], Class69_Sub3_Sub1.anIntArray3081[i_6_], 16711935, 128);
					} else {
						GraphicsLD.fillRect(Class160.anIntArray1495[i_6_], Class120_Sub12_Sub38.anIntArray3441[i_6_], Class120_Sub16.anIntArray2608[i_6_], Class69_Sub3_Sub1.anIntArray3081[i_6_], 16711935, 128);
					}
				} else if (Class120_Sub12_Sub33.aBooleanArray3391[i_6_]) {
					if (HDToolkit.glEnabled) {
						GraphicsHD.fillRect(Class160.anIntArray1495[i_6_], Class120_Sub12_Sub38.anIntArray3441[i_6_], Class120_Sub16.anIntArray2608[i_6_], Class69_Sub3_Sub1.anIntArray3081[i_6_], 16711680, 128);
					} else {
						GraphicsLD.fillRect(Class160.anIntArray1495[i_6_], Class120_Sub12_Sub38.anIntArray3441[i_6_], Class120_Sub16.anIntArray2608[i_6_], Class69_Sub3_Sub1.anIntArray3081[i_6_], 16711680, 128);
					}
				}
			}
		}
		Class120_Sub11.method1176(Class173.gameLevel, 78, Class100.selfPlayer.z, Class100.selfPlayer.x, Class120_Sub12_Sub22.redrawRate);
		Class120_Sub12_Sub22.redrawRate = 0;
	}

	final byte[] method2220(final byte i, byte[] is) {
		byte[] is_7_;
		try {
			if (i > -53) {
				anInt1716 = -25;
			}
			if (anIntArrayArray1719 != null) {
				final int i_8_ = (int) ((long) anInt1717 * (long) is.length / anInt1718) - -14;
				int i_9_ = 0;
				final int[] is_10_ = new int[i_8_];
				int i_11_ = 0;
				byte[] is_13_;
				final int i_12_ = (is_13_ = is).length;
				for (int i_14_ = 0; i_14_ < i_12_; i_14_++) {
					final int i_15_ = is_13_[i_14_];
					final int[] is_16_ = anIntArrayArray1719[i_11_];
					for (int i_17_ = 0; i_17_ < 14; i_17_++) {
						is_10_[i_9_ + i_17_] += is_16_[i_17_] * i_15_;
					}
					i_11_ += anInt1717;
					final int i_18_ = i_11_ / anInt1718;
					i_9_ += i_18_;
					i_11_ -= anInt1718 * i_18_;
				}
				is = new byte[i_8_];
				for (int i_19_ = 0; i_8_ > i_19_; i_19_++) {
					final int i_20_ = 32768 + is_10_[i_19_] >> 16;
					if (i_20_ >= -128) {
						if (i_20_ > 127) {
							is[i_19_] = (byte) 127;
						} else {
							is[i_19_] = (byte) i_20_;
						}
					} else {
						is[i_19_] = (byte) -128;
					}
				}
			}
			is_7_ = is;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ud.G(").append(i).append(',').append(is != null ? "{...}" : "null").append(')').toString());
		}
		return is_7_;
	}

	static final void method2221(final boolean bool) {
		do {
			try {
				if (Class85.anInt802 != -1) {
					Class108.method932(false, -1, -1, Class85.anInt802, 27712);
					Class85.anInt802 = -1;
				}
				if (bool) {
					break;
				}
			} catch (final RuntimeException runtimeexception) {
				throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ud.B(").append(bool).append(')').toString());
			}
		} while (false);
	}

	Decimator(int i, int i_21_) {
		if (i != i_21_) {
			final int i_22_ = PlayerAppearance.method2035(i, (byte) 26, i_21_);
			i /= i_22_;
			anIntArrayArray1719 = new int[i][14];
			i_21_ /= i_22_;
			anInt1718 = i;
			anInt1717 = i_21_;
			for (int i_23_ = 0; i_23_ < i; i_23_++) {
				final double d = 6.0 + (double) i_23_ / (double) i;
				final int[] is = anIntArrayArray1719[i_23_];
				int i_24_ = (int) Math.floor(-7.0 + d + 1.0);
				int i_25_ = (int) Math.ceil(7.0 + d);
				if (i_25_ > 14) {
					i_25_ = 14;
				}
				final double d_26_ = (double) i_21_ / (double) i;
				if (i_24_ < 0) {
					i_24_ = 0;
				}
				for (/**/; i_24_ < i_25_; i_24_++) {
					final double d_27_ = (-d + i_24_) * 3.141592653589793;
					double d_28_ = d_26_;
					if (-1.0E-4 > d_27_ || 1.0E-4 < d_27_) {
						d_28_ *= Math.sin(d_27_) / d_27_;
					}
					d_28_ *= Math.cos(0.2243994752564138 * (i_24_ - d)) * 0.46 + 0.54;
					is[i_24_] = (int) Math.floor(0.5 + 65536.0 * d_28_);
				}
			}
		}
	}

	public static void method2222(final boolean bool) {
		try {
			anIntArray1720 = null;
			if (bool) {
				aClass50_1721 = null;
			}
			aClass50_1721 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ud.H(").append(bool).append(')').toString());
		}
	}

	static final void method2223(final int i) {
		try {
			if (i != -12937) {
				method2224(null, (byte) 20, 17, 17, 52);
			}
			for (int i_29_ = 0; Class154.anInt1441 > i_29_; i_29_++) {
				final int i_30_ = Class169.anIntArray1648[i_29_];
				final Player class180_sub5_sub1 = Class118.playersList[i_30_];
				int i_31_ = Canvas_Sub1.inputStream.getUByte();
				if ((i_31_ & 0x80) != 0) {
					i_31_ += Canvas_Sub1.inputStream.getUByte() << 8;
				}
				Class120_Sub22.method1701(i_30_, i_31_, -20, class180_sub5_sub1);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ud.C(").append(i).append(')').toString());
		}
	}

	static final void method2224(final JagexInterface jagexInterface, final byte i, final int i_32_, final int i_33_, final int i_34_) {
		try {
			if (HDToolkit.glEnabled) {
				GraphicsHD.clipRect(i_34_, i_32_, jagexInterface.anInt1948 + i_34_, i_32_ - -jagexInterface.anInt2059);
			}
			if (AbstractGraphicsBuffer.anInt1175 >= 3) {
				if (!HDToolkit.glEnabled) {
					GraphicsLD.method2156(i_34_, i_32_, 0, jagexInterface.anIntArray2079, jagexInterface.anIntArray1949);
				} else {
					final AbstractSprite class120_sub14_sub19 = jagexInterface.method2492(false);
					if (class120_sub14_sub19 != null) {
						class120_sub14_sub19.method1587(i_34_, i_32_);
					}
				}
			} else if (!HDToolkit.glEnabled) {
				((LDSprite) Class157.aClass120_Sub14_Sub19_1474).method1604(i_34_, i_32_, jagexInterface.anInt1948, jagexInterface.anInt2059, Class157.aClass120_Sub14_Sub19_1474.width / 2, Class157.aClass120_Sub14_Sub19_1474.height / 2, (int) DummyOutputStream.aFloat28, 256,
						jagexInterface.anIntArray2079, jagexInterface.anIntArray1949);
			} else {
				((HDSprite) Class157.aClass120_Sub14_Sub19_1474).method1600(i_34_, i_32_, jagexInterface.anInt1948, jagexInterface.anInt2059, Class157.aClass120_Sub14_Sub19_1474.width / 2, Class157.aClass120_Sub14_Sub19_1474.height / 2, (int) DummyOutputStream.aFloat28, 256,
						(HDSprite) jagexInterface.method2492(false));
			}
			Class120_Sub12_Sub33.aBooleanArray3391[i_33_] = true;
			if (i < 2) {
				anInt1716 = 66;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ud.F(").append(jagexInterface != null ? "{...}" : "null").append(',').append(i).append(',').append(i_32_).append(',').append(i_33_).append(',').append(i_34_).append(')').toString());
		}
	}
}
