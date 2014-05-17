/* Class120_Sub14_Sub14_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class120_Sub14_Sub14_Sub2 extends Class120_Sub14_Sub14 {
	int anInt3936;
	static Cache aClass21_3937 = new Cache(64);
	byte aByte3938;
	Buffer aClass120_Sub7_3939;
	static int anInt3940;
	static Class120_Sub31 aClass120_Sub31_3941;

	static final void method1547(final int i, final JagexInterface jagexInterface, final int i_0_, final int i_1_, final int i_2_, final int i_3_, final int i_4_) {
		try {
			if (i_4_ != 2) {
				anInt3940 = -112;
			}
			final Class73 class73 = Class73.list(i_1_);
			if (class73 != null && class73.aBoolean633 && class73.method647(i_4_ + -3)) {
				if (class73.anIntArray638 != null) {
					final int[] is = new int[class73.anIntArray638.length];
					for (int i_5_ = 0; i_5_ < is.length / 2; i_5_++) {
						final int i_6_ = (int) DummyOutputStream.aFloat28 - -Class164.anInt1590 & 0x7ff;
						int i_7_ = Rasterizer.cosineTable[i_6_];
						i_7_ = 256 * i_7_ / (Class154.anInt1442 - -256);
						int i_8_ = Rasterizer.sineTable[i_6_];
						i_8_ = 256 * i_8_ / (Class154.anInt1442 - -256);
						is[i_5_ * 2] = i_0_ + jagexInterface.anInt1948 / 2 - -((i_3_ - -(class73.anIntArray638[1 + 2 * i_5_] * 4)) * i_8_ + i_7_ * (i_2_ - -(class73.anIntArray638[2 * i_5_] * 4)) >> 16);
						is[1 + 2 * i_5_] = i - (-(jagexInterface.anInt2059 / 2) - -(-(i_8_ * (i_2_ + 4 * class73.anIntArray638[i_5_ * 2])) + i_7_ * (i_3_ + 4 * class73.anIntArray638[i_5_ * 2 + 1]) >> 16));
					}
					if (HDToolkit.glEnabled) {
						Class68.method608(is, class73.anInt651, class73.anInt651 >>> 24, jagexInterface.anIntArray2079, jagexInterface.anIntArray1949);
					} else {
						Class59.method544(is, class73.anInt651, class73.anInt651 >>> 24, jagexInterface.anIntArray2079, jagexInterface.anIntArray1949);
					}
					for (int i_9_ = 0; -1 + is.length / 2 > i_9_; i_9_++) {
						if (!HDToolkit.glEnabled) {
							GraphicsLD.method2165(is[2 * i_9_], is[i_9_ * 2 + 1], is[2 + i_9_ * 2], is[2 * i_9_ + 3], class73.anInt630, class73.anInt630 >>> 24, jagexInterface.anIntArray2079, jagexInterface.anIntArray1949);
						} else {
							GraphicsHD.method588(is[2 * i_9_], is[2 * i_9_ + 1], is[(1 + i_9_) * 2], is[1 + 2 * i_9_ + 2], class73.anInt630, class73.anInt630 >>> 24, (HDSprite) jagexInterface.method2492(false));
						}
					}
					if (!HDToolkit.glEnabled) {
						GraphicsLD.method2165(is[is.length - 2], is[-1 + is.length], is[0], is[1], class73.anInt630, class73.anInt630 >>> 24, jagexInterface.anIntArray2079, jagexInterface.anIntArray1949);
					} else {
						GraphicsHD.method588(is[-2 + is.length], is[-1 + is.length], is[0], is[1], class73.anInt630, class73.anInt630 >>> 24, (HDSprite) jagexInterface.method2492(false));
					}
				}
				Class107 class107 = null;
				if (class73.anInt644 != -1) {
					class107 = class73.method648(false, false, false);
					if (class107 != null) {
						Class120_Sub12_Sub28.method1346(class107, i_0_, jagexInterface, (byte) -119, i_2_, i_3_, i);
					}
				}
				if (class73.aString649 != null) {
					int i_10_ = 0;
					Class120_Sub14_Sub8 class120_sub14_sub8 = Cache.aClass120_Sub14_Sub8_121;
					if (class73.anInt634 == 1) {
						class120_sub14_sub8 = Class120_Sub12_Sub20.aClass120_Sub14_Sub8_3286;
					}
					if (class73.anInt634 == 2) {
						class120_sub14_sub8 = Class120_Sub12_Sub22.boldFont;
					}
					if (class107 != null) {
						i_10_ = class107.anInt1030;
					}
					Class101_Sub1.method843(class73.anInt655, class73.aString649, 27497, i, i_3_, i_0_, i_2_, i_10_, class120_sub14_sub8, jagexInterface);
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ul.E(").append(i).append(',').append(jagexInterface != null ? "{...}" : "null").append(',').append(i_0_).append(',').append(i_1_).append(',').append(i_2_).append(',').append(i_3_).append(',').append(i_4_).append(')')
					.toString());
		}
	}

	public static void method1549(final int i) {
		try {
			aClass21_3937 = null;
			aClass120_Sub31_3941 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ul.I(").append(i).append(')').toString());
		}
	}

	static final void method1550(final int i) {
		try {
			JavaObject.anIntArray3916 = Class3.method86(8, 4, 35, 0.4F, 2048, 8, true, (byte) -24);
			if (i != 1) {
				method1547(-28, null, -110, 25, -100, -93, 32);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ul.F(").append(i).append(')').toString());
		}
	}

	static final Class145 method1551(final int i, final byte i_13_) {
		Class145 class145;
		try {
			Class145 class145_14_ = (Class145) Class159.aClass21_1486.get(i);
			if (class145_14_ != null) {
				return class145_14_;
			}
			final byte[] is = Class76.aClass50_678.getFile(29, i);
			class145_14_ = new Class145();
			if (is != null) {
				class145_14_.method2047(14364, i, new Buffer(is));
			}
			if (i_13_ > -60) {
				return null;
			}
			Class159.aClass21_1486.put(class145_14_, i);
			class145 = class145_14_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ul.H(").append(i).append(',').append(i_13_).append(')').toString());
		}
		return class145;
	}

	static final void method1552(final boolean bool, final int i, final int i_15_, final int i_16_, final boolean bool_17_, final int i_18_, final int i_19_) {
		try {
			if (i_18_ < i_16_) {
				final int i_20_ = (i_16_ + i_18_) / 2;
				int i_21_ = i_18_;
				final World class167_sub1 = Class86.aClass167_Sub1Array817[i_20_];
				Class86.aClass167_Sub1Array817[i_20_] = Class86.aClass167_Sub1Array817[i_16_];
				Class86.aClass167_Sub1Array817[i_16_] = class167_sub1;
				for (int i_22_ = i_18_; i_16_ > i_22_; i_22_++) {
					if (Class120_Sub12_Sub7.method1233(i_15_, bool, class167_sub1, bool_17_, Class86.aClass167_Sub1Array817[i_22_], i, true) <= 0) {
						final World class167_sub1_23_ = Class86.aClass167_Sub1Array817[i_22_];
						Class86.aClass167_Sub1Array817[i_22_] = Class86.aClass167_Sub1Array817[i_21_];
						Class86.aClass167_Sub1Array817[i_21_++] = class167_sub1_23_;
					}
				}
				Class86.aClass167_Sub1Array817[i_16_] = Class86.aClass167_Sub1Array817[i_21_];
				Class86.aClass167_Sub1Array817[i_21_] = class167_sub1;
				method1552(bool, i, i_15_, i_21_ - 1, bool_17_, i_18_, 1);
				method1552(bool, i, i_15_, i_16_, bool_17_, i_21_ - -1, i_19_);
			}
			if (i_19_ != 1) {
				aClass120_Sub31_3941 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ul.A(").append(bool).append(',').append(i).append(',').append(i_15_).append(',').append(i_16_).append(',').append(bool_17_).append(',').append(i_18_).append(',').append(i_19_).append(')').toString());
		}
	}

	@Override
	final int method1537(final int i) {
		int i_24_;
		try {
			if (this.aClass120_Sub7_3939 == null) {
				return 0;
			}
			i_24_ = this.aClass120_Sub7_3939.pos * 100 / (-this.aByte3938 + this.aClass120_Sub7_3939.buf.length);
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ul.G(").append(i).append(')').toString());
		}
		return i_24_;
	}

	static final int method1553(final int i, final World class167_sub1, final int i_25_, final World class167_sub1_26_, final boolean bool) {
		int i_27_;
		try {
			if (i_25_ == 1) {
				int i_28_ = class167_sub1_26_.players;
				int i_29_ = class167_sub1.players;
				if (!bool) {
					if ((i_29_ ^ 0xffffffff) == 0) {
						i_29_ = 2001;
					}
					if (i_28_ == -1) {
						i_28_ = 2001;
					}
				}
				return i_28_ + -i_29_;
			}
			if (i_25_ == 2) {
				return Class120_Sub12_Sub21_Sub1.method1313(i ^ ~0x5019, class167_sub1.getWorldInfo().region, Class9.language, class167_sub1_26_.getWorldInfo().region);
			}
			if (i_25_ == 3) {
				if (class167_sub1_26_.activity.equals("-")) {
					if (class167_sub1.activity.equals("-")) {
						return 0;
					}
					return bool ? -1 : 1;
				}
				if (class167_sub1.activity.equals("-")) {
					return bool ? 1 : -1;
				}
				return Class120_Sub12_Sub21_Sub1.method1313(i + 23070, class167_sub1.activity, Class9.language, class167_sub1_26_.activity);
			}
			if (i_25_ == 4) {
				return class167_sub1_26_.method2185((byte) -123) ? class167_sub1.method2185((byte) -126) ? 0 : 1 : class167_sub1.method2185((byte) -127) ? -1 : 0;
			}
			if (i_25_ == 5) {
				return class167_sub1_26_.method2186((byte) 84) ? class167_sub1.method2186((byte) 98) ? 0 : 1 : !class167_sub1.method2186((byte) 126) ? 0 : -1;
			}
			if (i_25_ == 6) {
				return class167_sub1_26_.method2187(i ^ ~0x4120) ? class167_sub1.method2187(1082) ? 0 : 1 : !class167_sub1.method2187(i ^ ~0x4120) ? 0 : -1;
			}
			if (i_25_ == 7) {
				return !class167_sub1_26_.method2183(i ^ 0x482b) ? !class167_sub1.method2183(-3378) ? 0 : -1 : class167_sub1.method2183(i ^ 0x482b) ? 0 : 1;
			}
			if (i != -17691) {
				return 12;
			}
			i_27_ = -class167_sub1.worldId + class167_sub1_26_.worldId;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ul.D(").append(i).append(',').append(class167_sub1 != null ? "{...}" : "null").append(',').append(i_25_).append(',').append(class167_sub1_26_ != null ? "{...}" : "null").append(',').append(bool).append(')')
					.toString());
		}
		return i_27_;
	}

	@Override
	final byte[] method1535(final byte i) {
		byte[] is;
		try {
			if (i != -90) {
				method1552(true, -64, -11, 126, true, -99, 51);
			}
			if (this.aBoolean3576 || this.aClass120_Sub7_3939.buf.length - this.aByte3938 > this.aClass120_Sub7_3939.pos) {
				throw new RuntimeException();
			}
			is = this.aClass120_Sub7_3939.buf;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ul.C(").append(i).append(')').toString());
		}
		return is;
	}
}
