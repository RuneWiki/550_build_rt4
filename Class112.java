/* Class112 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Frame;

final class Class112 {
	static int[] playerIndices = new int[2048];
	private final Class83 aClass83_1068;
	static int[] anIntArray1069;
	static Class98 aClass98_1070;
	private final Class45 aClass45_1071;
	private Buffer aClass120_Sub7_1072;
	private Class120_Sub14_Sub14_Sub2 aClass120_Sub14_Sub14_Sub2_1073;
	private Class53_Sub1[] aClass53_Sub1Array1074;
	static int gameLoopCount;
	static Frame frame;
	static int anInt1077 = 0;
	static byte aByte1078;
	static String aString1079;
	static int anInt1080;

	static {
		anIntArray1069 = new int[] { 0, 2, 2, 2, 1, 1, 2, 2, 1, 3, 1, 1 };
		aString1079 = "You can't add yourself to your own ignore list.";
	}

	final void method985(final boolean bool) {
		try {
			if (aClass53_Sub1Array1074 != null) {
				for (final Class53_Sub1 element : aClass53_Sub1Array1074) {
					if (element != null) {
						element.method469(false);
					}
				}
				if (!bool) {
					anInt1080 = 20;
				}
				Class53_Sub1[] class53_sub1s;
				final int i = (class53_sub1s = aClass53_Sub1Array1074).length;
				for (int i_0_ = 0; i_0_ < i; i_0_++) {
					final Class53_Sub1 class53_sub1 = class53_sub1s[i_0_];
					if (class53_sub1 != null) {
						class53_sub1.method476(-2);
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("mg.H(").append(bool).append(')').toString());
		}
	}

	final boolean method986(final byte i) {
		boolean bool;
		try {
			if (i != 70) {
				method987(true, -26);
			}
			if (aClass120_Sub7_1072 != null) {
				return true;
			}
			if (aClass120_Sub14_Sub14_Sub2_1073 == null) {
				if (aClass45_1071.method357()) {
					return false;
				}
				aClass120_Sub14_Sub14_Sub2_1073 = aClass45_1071.method362((byte) 0, 255, true, -24559, 255);
			}
			if (aClass120_Sub14_Sub14_Sub2_1073.aBoolean3576) {
				return false;
			}
			aClass120_Sub7_1072 = new Buffer(aClass120_Sub14_Sub14_Sub2_1073.method1535((byte) -90));
			aClass53_Sub1Array1074 = new Class53_Sub1[(aClass120_Sub7_1072.buf.length + -5) / 8];
			bool = true;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("mg.A(").append(i).append(')').toString());
		}
		return bool;
	}

	static final void method987(final boolean bool, final int i) {
		try {
			byte[][] is;
			int i_1_;
			if (HDToolkit.glEnabled && bool) {
				i_1_ = 1;
				is = Class101_Sub1.aByteArrayArray2271;
			} else {
				is = Class134.aByteArrayArray1287;
				i_1_ = 4;
			}
			if (i != 13371) {
				method992(80);
			}
			for (int i_2_ = 0; i_1_ > i_2_; i_2_++) {
				Class120_Sub2.method1050();
				for (int i_3_ = 0; i_3_ < 13; i_3_++) {
					for (int i_4_ = 0; i_4_ < 13; i_4_++) {
						final int i_5_ = Class120_Sub12_Sub36.anIntArrayArrayArray3420[i_2_][i_3_][i_4_];
						if (i_5_ != -1) {
							final int i_6_ = (0x39ff11b & i_5_) >> 24;
							if (!bool || i_6_ == 0) {
								final int i_7_ = (0x7 & i_5_) >> 1;
								final int i_8_ = (i_5_ & 0x3fff) >> 3;
								final int i_9_ = (i_5_ & 0xffd503) >> 14;
								final int i_10_ = (i_9_ / 8 << 8) + i_8_ / 8;
								for (int i_11_ = 0; Class120_Sub12_Sub36.anIntArray3417.length > i_11_; i_11_++) {
									if (i_10_ == Class120_Sub12_Sub36.anIntArray3417[i_11_] && is[i_11_] != null) {
										Class120_Sub12_Sub10.method1247(i_2_, i_3_ * 8, Class182.aClass25Array1802, is[i_11_], i_7_, 8 * (0x7 & i_8_), (0x7 & i_9_) * 8, i_6_, bool, 1, i_4_ * 8);
										break;
									}
								}
							}
						}
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("mg.D(").append(bool).append(',').append(i).append(')').toString());
		}
	}

	public static void method988(final byte i) {
		try {
			playerIndices = null;
			aClass98_1070 = null;
			frame = null;
			aString1079 = null;
			anIntArray1069 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("mg.F(").append(i).append(')').toString());
		}
	}

	static final void method989(final int i, final int i_12_, final int i_13_, final int i_14_) {
		try {
			if (i_13_ != -30073) {
				method989(102, 57, 60, -123);
			}
			final Class120_Sub14_Sub12 class120_sub14_sub12 = Class120_Sub12_Sub16.method1277(i, i_12_, i_14_, 933634440);
			if (class120_sub14_sub12 != null) {
				Class100.anIntArray956 = new int[class120_sub14_sub12.anInt3557];
				Class79_Sub1.aStringArray2243 = new String[class120_sub14_sub12.anInt3555];
				if (class120_sub14_sub12.anInt3546 == 15 || class120_sub14_sub12.anInt3546 == 17 || class120_sub14_sub12.anInt3546 == 16) {
					int i_15_ = 0;
					int i_16_ = 0;
					if (Class142.aClass189_1362 != null) {
						i_15_ = Class142.aClass189_1362.anInt2073;
						i_16_ = Class142.aClass189_1362.anInt1938;
					}
					Class100.anIntArray956[1] = Class191.lastMouseY + -i_16_;
					Class100.anIntArray956[0] = -i_15_ + Queue.lastMouseX;
				}
				Class167_Sub1.method2194(200000, 1006199388, class120_sub14_sub12);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("mg.I(").append(i).append(',').append(i_12_).append(',').append(i_13_).append(',').append(i_14_).append(')').toString());
		}
	}

	static final void method990(final Class50 class50, final int i) {
		try {
			Class120_Sub14_Sub13.anInt3561 = class50.method432(false, "runes");
			if (i != 0) {
				method992(-96);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("mg.E(").append(class50 != null ? "{...}" : "null").append(',').append(i).append(')').toString());
		}
	}

	private final Class53_Sub1 method991(final FileSystem fileSystem, final byte i, final FileSystem class51_17_, final boolean bool, final int i_18_) {
		Class53_Sub1 class53_sub1;
		try {
			if (aClass120_Sub7_1072 == null) {
				throw new RuntimeException();
			}
			aClass120_Sub7_1072.pos = 5 + i_18_ * 8;
			if (aClass120_Sub7_1072.buf.length <= aClass120_Sub7_1072.pos) {
				throw new RuntimeException();
			}
			if (aClass53_Sub1Array1074[i_18_] != null) {
				return aClass53_Sub1Array1074[i_18_];
			}
			final int i_19_ = aClass120_Sub7_1072.getInt();
			final int i_20_ = aClass120_Sub7_1072.getInt();
			if (i != -75) {
				method990(null, 48);
			}
			final Class53_Sub1 class53_sub1_21_ = new Class53_Sub1(i_18_, class51_17_, fileSystem, aClass45_1071, aClass83_1068, i_19_, i_20_, bool);
			aClass53_Sub1Array1074[i_18_] = class53_sub1_21_;
			class53_sub1 = class53_sub1_21_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("mg.G(").append(fileSystem != null ? "{...}" : "null").append(',').append(i).append(',').append(class51_17_ != null ? "{...}" : "null").append(',').append(bool).append(',').append(i_18_).append(')').toString());
		}
		return class53_sub1;
	}

	static final Class120_Sub14_Sub5 method992(final int i) {
		Class120_Sub14_Sub5 class120_sub14_sub5;
		try {
			if (Class79.aClass177_690 == null) {
				return null;
			}
			if (i != 2048) {
				method990(null, 18);
			}
			for (Class120_Sub14_Sub5 class120_sub14_sub5_22_ = (Class120_Sub14_Sub5) Class22.aClass127_130.method1890(20389); class120_sub14_sub5_22_ != null; class120_sub14_sub5_22_ = (Class120_Sub14_Sub5) Class22.aClass127_130.method1890(20389)) {
				final Class73 class73 = Class73.list(class120_sub14_sub5_22_.anInt3473);
				if (class73 != null && class73.aBoolean659 && class73.method647(i ^ ~0x800)) {
					return class120_sub14_sub5_22_;
				}
			}
			class120_sub14_sub5 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("mg.C(").append(i).append(')').toString());
		}
		return class120_sub14_sub5;
	}

	final Class53_Sub1 method993(final FileSystem fileSystem, final FileSystem class51_23_, final int i, final byte i_24_) {
		Class53_Sub1 class53_sub1;
		try {
			if (i_24_ > -15) {
				return null;
			}
			class53_sub1 = method991(fileSystem, (byte) -75, class51_23_, true, i);
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("mg.B(").append(fileSystem != null ? "{...}" : "null").append(',').append(class51_23_ != null ? "{...}" : "null").append(',').append(i).append(',').append(i_24_).append(')').toString());
		}
		return class53_sub1;
	}

	Class112(final Class45 class45, final Class83 class83) {
		aClass45_1071 = class45;
		aClass83_1068 = class83;
		if (!aClass45_1071.method357()) {
			aClass120_Sub14_Sub14_Sub2_1073 = aClass45_1071.method362((byte) 0, 255, true, -24559, 255);
		}
	}
}
