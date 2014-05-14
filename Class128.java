/* Class128 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

final class Class128 {
	int anInt1218;
	static Class35 aClass35_1219;
	boolean aBoolean1220;
	static short[][] aShortArrayArray1221 = {
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
					0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
					0, 0, 0, 0, 4, 24, 44, 64, 84, 104, 304, 678, 698, 550, 934, 954, 6448, 6946, 6966, 2352, 2726, 2746, 10544, 10918, 10938, 10304, 10550, 10570, 14640, 15014, 15034, 19760, 20134, 20154, -29392, -29018, -28998, 31024, 31270, 31290, -24272, -23898, -23878, -19152, -18778, -18758,
					-14032, -13658, -13638, -6864, -6490, -6470, 516, 536, 6788, 6808, 11012, 11032, 14980, 15000, 21124, 21144, -28924, -28904, -22012, -21992, -12924, -12904 },
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
					0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
					0, 0, 0, 0, 10339, 10574, 10425, 10398, 10345, 7512, 8507, 7378, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
					0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
					0, 0, 0, 0, 4, 24, 44, 64, 84, 104, 304, 678, 698, 550, 934, 954, 6448, 6946, 6966, 2352, 2726, 2746, 10544, 10918, 10938, 10304, 10550, 10570, 14640, 15014, 15034, 19760, 20134, 20154, -29392, -29018, -28998, 31024, 31270, 31290, -24272, -23898, -23878, -19152, -18778, -18758,
					-14032, -13658, -13638, -6864, -6490, -6470, 516, 536, 6788, 6808, 11012, 11032, 14980, 15000, 21124, 21144, -28924, -28904, -22012, -21992, -12924, -12904 },
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
					0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
					0, 0, 0, 0, 13753, 13737, 13719, 13883, 13863, 13974, 19643, 18601, 16532, 23993, 25121, 24980, 26944, 26921, 24854, 27191, 27171, 26130, 26941, 28696, 30100, 12477, 10407, 10388, 10685, 10665, 10646, 6711, 6693, 6674, 6965, 7073, 7056, 2361, 4387, 3346, 0, 0, 0, 0, 0, 0, 0, 0,
					0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
					0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
					0, 0, 0, 0, 4, 24, 44, 64, 84, 104, 304, 678, 698, 550, 934, 954, 6448, 6946, 6966, 2352, 2726, 2746, 10544, 10918, 10938, 10304, 10550, 10570, 14640, 15014, 15034, 19760, 20134, 20154, -29392, -29018, -28998, 31024, 31270, 31290, -24272, -23898, -23878, -19152, -18778, -18758,
					-14032, -13658, -13638, -6864, -6490, -6470, 516, 536, 6788, 6808, 11012, 11032, 14980, 15000, 21124, 21144, -28924, -28904, -22012, -21992, -12924, -12904 } };
	int anInt1222;
	static int renderPitch;
	private int anInt1224 = 0;
	int anInt1225;
	int anInt1226;
	int anInt1227;
	static boolean aBoolean1228;
	int anInt1229;

	static {
		aClass35_1219 = new Class35(128);
		aBoolean1228 = false;
	}

	static final byte[] method1899(final int i, final int i_0_) {
		byte[] is;
		try {
			if (i_0_ != -29382) {
				aClass35_1219 = null;
			}
			Class120_Sub14_Sub20 class120_sub14_sub20 = (Class120_Sub14_Sub20) Class181.aClass35_1784.method302(17301, i);
			if (class120_sub14_sub20 == null) {
				final byte[] is_1_ = new byte[512];
				final Random random = new Random(i);
				for (int i_2_ = 0; i_2_ < 255; i_2_++) {
					is_1_[i_2_] = (byte) i_2_;
				}
				for (int i_3_ = 0; i_3_ < 255; i_3_++) {
					final int i_4_ = 255 + -i_3_;
					final int i_5_ = Class28.method244(random, i_4_, 106);
					final byte i_6_ = is_1_[i_5_];
					is_1_[i_5_] = is_1_[i_4_];
					is_1_[i_4_] = is_1_[511 + -i_3_] = i_6_;
				}
				class120_sub14_sub20 = new Class120_Sub14_Sub20(is_1_);
				Class181.aClass35_1784.method301(i, i_0_ ^ ~0x72bf, class120_sub14_sub20);
			}
			is = class120_sub14_sub20.aByteArray3623;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("pa.H(").append(i).append(',').append(i_0_).append(')').toString());
		}
		return is;
	}

	static final void method1900(final int i) {
		try {
			Class180_Sub4.method2318((byte) 25, Class140.anInt1343);
			final int i_7_ = (Class83.renderX >> 10) + (GameEntity.currentBaseX >> 3);
			final int i_8_ = (Class181.currentBaseZ >> 3) + (GroundObjectNode.renderZ >> 10);
			int i_11_ = 18;
			RuntimeException_Sub1.aByteArrayArray2140 = new byte[i_11_][];
			Class56.anIntArray495 = new int[i_11_];
			Class120_Sub12_Sub36.aByteArrayArray3421 = new byte[i_11_][];
			ProducingGraphicsBuffer.anIntArray2796 = new int[i_11_];
			Class28.anIntArray183 = new int[i_11_];
			Class179.aByteArrayArray1777 = new byte[i_11_][];
			if (i != 0) {
				renderPitch = 59;
			}
			Class111.anIntArray1063 = new int[i_11_];
			Class101_Sub1.aByteArrayArray2271 = new byte[i_11_][];
			Class120_Sub12_Sub36.anIntArray3417 = new int[i_11_];
			Class125.anIntArrayArray2150 = new int[i_11_][4];
			Class76.anIntArray680 = new int[i_11_];
			Class134.aByteArrayArray1287 = new byte[i_11_][];
			i_11_ = 0;
			for (int i_12_ = (-6 + i_7_) / 8; i_12_ <= (i_7_ + 6) / 8; i_12_++) {
				for (int i_13_ = (-6 + i_8_) / 8; (i_8_ - -6) / 8 >= i_13_; i_13_++) {
					final int i_14_ = (i_12_ << 8) + i_13_;
					Class120_Sub12_Sub36.anIntArray3417[i_11_] = i_14_;
					Class56.anIntArray495[i_11_] = Class65.aClass50_597.method432(false, new StringBuilder("m").append(i_12_).append("_").append(i_13_).toString());
					Class28.anIntArray183[i_11_] = Class65.aClass50_597.method432(false, new StringBuilder("l").append(i_12_).append("_").append(i_13_).toString());
					ProducingGraphicsBuffer.anIntArray2796[i_11_] = Class65.aClass50_597.method432(false, new StringBuilder("n").append(i_12_).append("_").append(i_13_).toString());
					Class111.anIntArray1063[i_11_] = Class65.aClass50_597.method432(false, new StringBuilder("um").append(i_12_).append("_").append(i_13_).toString());
					Class76.anIntArray680[i_11_] = Class65.aClass50_597.method432(false, new StringBuilder("ul").append(i_12_).append("_").append(i_13_).toString());
					if ((ProducingGraphicsBuffer.anIntArray2796[i_11_] ^ 0xffffffff) == 0) {
						Class56.anIntArray495[i_11_] = -1;
						Class28.anIntArray183[i_11_] = -1;
						Class111.anIntArray1063[i_11_] = -1;
						Class76.anIntArray680[i_11_] = -1;
					}
					i_11_++;
				}
			}
			for (int i_15_ = i_11_; i_15_ < ProducingGraphicsBuffer.anIntArray2796.length; i_15_++) {
				ProducingGraphicsBuffer.anIntArray2796[i_15_] = -1;
				Class56.anIntArray495[i_15_] = -1;
				Class28.anIntArray183[i_15_] = -1;
				Class111.anIntArray1063[i_15_] = -1;
				Class76.anIntArray680[i_15_] = -1;
			}
			Class2.method76(true, 111, i_7_, false, 8, 8, i_8_, 0);
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("pa.G(").append(i).append(')').toString());
		}
	}

	static final void method1901(final int i, final int i_16_, final int i_17_, final int i_18_, final boolean bool, final int i_19_) {
		try {
			if (i == i_19_) {
				Class159.method2096(i_19_, i_17_, false, i_18_, i_16_);
			} else {
				if (Class32.anInt260 > -i_19_ + i_16_ || Class120_Sub14_Sub11.anInt3544 < i_16_ - -i_19_ || i_18_ + -i < Class120_Sub30_Sub2.anInt3699 || Class139.anInt1334 < i_18_ - -i) {
					Node.method1031(i_18_, i, i_17_, i_19_, i_16_, -43);
				} else {
					Class69_Sub3.method628(-593542495, i, i_16_, i_17_, i_18_, i_19_);
				}
				if (!bool) {
					method1900(4);
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("pa.F(").append(i).append(',').append(i_16_).append(',').append(i_17_).append(',').append(i_18_).append(',').append(bool).append(',').append(i_19_).append(')').toString());
		}
	}

	public static void method1902(final byte i) {
		try {
			aClass35_1219 = null;
			aShortArrayArray1221 = null;
			if (i != -110) {
				renderPitch = 115;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("pa.D(").append(i).append(')').toString());
		}
	}

	static final void method1903(final int i, final int i_20_, final int i_21_, final int i_22_, final boolean bool, final int i_23_, final GameEntity class180_sub5) {
		try {
			Class137.method1982((byte) -116, i, i_23_, i_20_, class180_sub5.x, class180_sub5.z, i_21_, i_22_);
			if (bool) {
				drawOverlay(-56, -106, -38, -28);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("pa.I(").append(i).append(',').append(i_20_).append(',').append(i_21_).append(',').append(i_22_).append(',').append(bool).append(',').append(i_23_).append(',').append(class180_sub5 != null ? "{...}" : "null")
					.append(')').toString());
		}
	}

	final void method1904(final Buffer class120_sub7, final int i, final int i_24_) {
		try {
			if (i != 0) {
				method1907((byte) -21);
			}
			for (;;) {
				final int i_25_ = class120_sub7.getUByte();
				if (i_25_ == 0) {
					break;
				}
				method1906(i_24_, class120_sub7, i_25_, (byte) -87);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("pa.C(").append(class120_sub7 != null ? "{...}" : "null").append(',').append(i).append(',').append(i_24_).append(')').toString());
		}
	}

	static final void drawOverlay(final int i, final int i_26_, final int i_27_, final int i_28_) {
		if (Class120_Sub14_Sub22.crossState == 1) {
			Class120_Sub12_Sub30.crossSprites[Class120_Sub12_Sub7.crossIndex / 100].method1587(Class120_Sub12_Sub35.crossX - 8, IsaacCipher.crossY - 8);
		}
		if (Class120_Sub14_Sub22.crossState == 2) {
			Class120_Sub12_Sub30.crossSprites[Class120_Sub12_Sub7.crossIndex / 100 + 4].method1587(Class120_Sub12_Sub35.crossX - 8, IsaacCipher.crossY - 8);
		}
		FileSystem.checkPlayerLocation();
	}

	private final void method1906(final int i, final Buffer class120_sub7, final int i_29_, final byte i_30_) {
		try {
			if (i_29_ == 1) {
				anInt1224 = class120_sub7.getTriByte();
				method1908((byte) 59, anInt1224);
			} else if (i_29_ != 2) {
				if (i_29_ != 3) {
					if (i_29_ == 4) {
						this.aBoolean1220 = false;
					}
				} else {
					this.anInt1225 = class120_sub7.getUShort();
				}
			} else {
				this.anInt1227 = class120_sub7.getUShort();
				if ((this.anInt1227 ^ 0xffffffff) == -65536) {
					this.anInt1227 = -1;
				}
			}
			if (i_30_ > -75) {
				method1908((byte) -40, -88);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("pa.B(").append(i).append(',').append(class120_sub7 != null ? "{...}" : "null").append(',').append(i_29_).append(',').append(i_30_).append(')').toString());
		}
	}

	static final void method1907(final byte i) {
		do {
			try {
				Class120_Sub12_Sub37.aClass21_3427.clearSoftReference();
				if (i < 86) {
					break;
				}
			} catch (final RuntimeException runtimeexception) {
				throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("pa.J(").append(i).append(')').toString());
			}
		} while (false);
	}

	private final void method1908(final byte i, final int i_31_) {
		try {
			final double d = (i_31_ >> 16 & 0xff) / 256.0;
			final double d_32_ = ((i_31_ & 0xff18) >> 8) / 256.0;
			final double d_33_ = (i_31_ & 0xff) / 256.0;
			double d_34_ = d;
			if (d_34_ > d_32_) {
				d_34_ = d_32_;
			}
			if (d_34_ > d_33_) {
				d_34_ = d_33_;
			}
			double d_35_ = d;
			if (d_35_ < d_32_) {
				d_35_ = d_32_;
			}
			double d_36_ = 0.0;
			if (d_35_ < d_33_) {
				d_35_ = d_33_;
			}
			double d_37_ = 0.0;
			final double d_38_ = (d_34_ + d_35_) / 2.0;
			if (i == 59) {
				this.anInt1229 = (int) (d_38_ * 256.0);
				if (this.anInt1229 >= 0) {
					if (this.anInt1229 > 255) {
						this.anInt1229 = 255;
					}
				} else {
					this.anInt1229 = 0;
				}
				if (d_35_ != d_34_) {
					if (0.5 > d_38_) {
						d_37_ = (d_35_ - d_34_) / (d_35_ + d_34_);
					}
					if (d_35_ == d) {
						d_36_ = (-d_33_ + d_32_) / (d_35_ - d_34_);
					} else if (d_32_ != d_35_) {
						if (d_35_ == d_33_) {
							d_36_ = 4.0 + (d - d_32_) / (-d_34_ + d_35_);
						}
					} else {
						d_36_ = 2.0 + (-d + d_33_) / (-d_34_ + d_35_);
					}
					if (d_38_ >= 0.5) {
						d_37_ = (d_35_ - d_34_) / (-d_34_ + (2.0 - d_35_));
					}
				}
				this.anInt1222 = (int) (d_37_ * 256.0);
				if (d_38_ > 0.5) {
					this.anInt1226 = (int) (512.0 * ((-d_38_ + 1.0) * d_37_));
				} else {
					this.anInt1226 = (int) (512.0 * (d_37_ * d_38_));
				}
				if (this.anInt1226 < 1) {
					this.anInt1226 = 1;
				}
				d_36_ /= 6.0;
				this.anInt1218 = (int) (this.anInt1226 * d_36_);
				if (this.anInt1222 >= 0) {
					if (this.anInt1222 > 255) {
						this.anInt1222 = 255;
					}
				} else {
					this.anInt1222 = 0;
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("pa.A(").append(i).append(',').append(i_31_).append(')').toString());
		}
	}

	static final void method1909(final boolean bool, final Class120_Sub14_Sub8 class120_sub14_sub8, final boolean bool_39_) {
		try {
			if (HDToolkit.glEnabled || bool) {
				final int i = Class120_Sub12_Sub5.canvasHeight;
				final int i_40_ = 956 * i / 503;
				KeyboardHandler.aClass120_Sub14_Sub19_1508.method1588((Class69_Sub1.canvasWidth - i_40_) / 2, 0, i_40_, i);
				Class120_Sub12_Sub27.aClass107_3354.method910(Class69_Sub1.canvasWidth / 2 + -(Class120_Sub12_Sub27.aClass107_3354.anInt1026 / 2), 18);
			}
			class120_sub14_sub8.method1478(Buffer.gameId != 1 ? Class120_Sub12_Sub18.aString3272 : Class108_Sub3.aString2396, Class69_Sub1.canvasWidth / 2, Class120_Sub12_Sub5.canvasHeight / 2 + -26, 16777215, -1);
			if (bool_39_) {
				aShortArrayArray1221 = null;
			}
			final int i = Class120_Sub12_Sub5.canvasHeight / 2 + -18;
			if (!HDToolkit.glEnabled) {
				GraphicsLD.drawRect(-152 + Class69_Sub1.canvasWidth / 2, i, 304, 34, 9179409);
				GraphicsLD.drawRect(Class69_Sub1.canvasWidth / 2 + -151, 1 + i, 302, 32, 0);
				GraphicsLD.fillRect(-150 + Class69_Sub1.canvasWidth / 2, 2 + i, OverridedJInterface.anInt2747 * 3, 30, 9179409);
				GraphicsLD.fillRect(OverridedJInterface.anInt2747 * 3 + Class69_Sub1.canvasWidth / 2 - 150, i - -2, -(3 * OverridedJInterface.anInt2747) + 300, 30, 0);
			} else {
				GraphicsHD.drawRect(Class69_Sub1.canvasWidth / 2 + -152, i, 304, 34, 9179409);
				GraphicsHD.drawRect(-151 + Class69_Sub1.canvasWidth / 2, i + 1, 302, 32, 0);
				GraphicsHD.fillRect(Class69_Sub1.canvasWidth / 2 - 150, i + 2, 3 * OverridedJInterface.anInt2747, 30, 9179409);
				GraphicsHD.fillRect(Class69_Sub1.canvasWidth / 2 + -150 + 3 * OverridedJInterface.anInt2747, i + 2, 300 + -(OverridedJInterface.anInt2747 * 3), 30, 0);
			}
			class120_sub14_sub8.method1478(Class134.aString1283, Class69_Sub1.canvasWidth / 2, 4 + Class120_Sub12_Sub5.canvasHeight / 2, 16777215, -1);
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("pa.K(").append(bool).append(',').append(class120_sub14_sub8 != null ? "{...}" : "null").append(',').append(bool_39_).append(')').toString());
		}
	}

	public Class128() {
		this.aBoolean1220 = true;
		this.anInt1227 = -1;
		this.anInt1225 = 128;
	}
}
