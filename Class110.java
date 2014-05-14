/* Class110 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class110 {
	static int[][][] anIntArrayArrayArray1050;
	static int anInt1051;
	static Class98 aClass98_1052;
	static InterfaceClickMask aClass120_Sub20_1053;
	static boolean aBoolean1054 = false;
	static Class91 aClass91_1055;

	static {
		aClass120_Sub20_1053 = new InterfaceClickMask(0, -1);
	}

	static final void method976(final int i) {
		try {
			Class156.method2085(-93);
			Class173.method2228(i ^ ~0x7458);
			LocType.method2451((byte) 22);
			Class120_Sub12_Sub25.method1334(-102);
			Class35.method297(i + 7670);
			Class120_Sub12_Sub18.method1291(256);
			Class120_Sub12_Sub20.method1296((byte) -114);
			StringNode.method1720(-19674);
			Class120_Sub16.method1657(true);
			Class120_Sub12_Sub35.method1383(725);
			PlayerAppearance.method2033(-104);
			InterfaceClickMask.method1693(-15681);
			Class120_Sub16.method1658(i + 7536);
			Class36.method309(-14865);
			PacketBuffer.method1151(32);
			Class148.method2058(1);
			DisplayModeInfo.method2214(false);
			AbstractMouseWheelHandler.method160();
			Class120_Sub12_Sub26.method1337((byte) 96);
			if (LocType.modeWhat != 0) {
				for (int i_0_ = 0; Class120_Sub12_Sub25.aByteArrayArray3318.length > i_0_; i_0_++) {
					Class120_Sub12_Sub25.aByteArrayArray3318[i_0_] = null;
				}
				Class120_Sub14_Sub20.anInt3624 = 0;
			}
			Class108_Sub1.method934((byte) 61);
			Class143.method2015(i + 2534);
			Class11.method125((byte) 113);
			Class142.method2009(255);
			Class15.aClass21_95.clear();
			if (!HDToolkit.glEnabled) {
				((Class143_Sub1) Rasterizer.anInterface5_973).method2025(-45);
			}
			Class128.aClass35_1219.method306((byte) 115);
			Class120_Sub8.aClass50_2479.method419(0);
			Class79_Sub1.aClass50_2245.method419(0);
			Class33.aClass50_275.method419(i ^ i);
			Class159.aClass50_1490.method419(i + 7603);
			Class65.aClass50_597.method419(0);
			Class120_Sub12_Sub36.aClass50_3419.method419(i + 7603);
			Class120_Sub12_Sub17.aClass50_3258.method419(0);
			Class7.aClass50_63.method419(0);
			Class108_Sub3.aClass50_2400.method419(0);
			Class120_Sub10.aClass50_2544.method419(0);
			IsaacCipher.aClass50_1019.method419(0);
			Class120_Sub12_Sub2.aClass21_3144.clear();
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("me.A(").append(i).append(')').toString());
		}
	}

	public static void method977(final byte i) {
		try {
			aClass98_1052 = null;
			aClass91_1055 = null;
			if (i < -65) {
				aClass120_Sub20_1053 = null;
				anIntArrayArrayArray1050 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("me.B(").append(i).append(')').toString());
		}
	}

	static final void method978(final boolean bool, String string, final int i) {
		try {
			short[] is = new short[16];
			string = string.toLowerCase();
			final int i_1_ = !bool ? 0 : 32768;
			int i_2_ = 0;
			final int i_3_ = (bool ? Class192.anInt2120 : Class32.anInt269) + i_1_;
			for (int i_4_ = i_1_; i_4_ < i_3_; i_4_++) {
				final Class120_Sub14_Sub10 class120_sub14_sub10 = Class121.method1837(i_4_, true);
				if (class120_sub14_sub10.aBoolean3531 && (class120_sub14_sub10.method1510(17538).toLowerCase().indexOf(string) ^ 0xffffffff) != 0) {
					if (i_2_ >= 50) {
						Buffer.anInt2474 = -1;
						Class120_Sub12_Sub37.aShortArray3430 = null;
						return;
					}
					if (is.length <= i_2_) {
						final short[] is_5_ = new short[is.length * 2];
						for (int i_6_ = 0; i_2_ > i_6_; i_6_++) {
							is_5_[i_6_] = is[i_6_];
						}
						is = is_5_;
					}
					is[i_2_++] = (short) i_4_;
				}
			}
			Class108.anInt1035 = 0;
			Buffer.anInt2474 = i_2_;
			final String[] strings = new String[Buffer.anInt2474];
			Class120_Sub12_Sub37.aShortArray3430 = is;
			for (int i_7_ = 0; Buffer.anInt2474 > i_7_; i_7_++) {
				strings[i_7_] = Class121.method1837(is[i_7_], true).method1510(17538);
			}
			Class28.method242(Class120_Sub12_Sub37.aShortArray3430, 56, strings);
			if (i != 18262) {
				method979(20, -115);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("me.D(").append(bool).append(',').append(string != null ? "{...}" : "null").append(',').append(i).append(')').toString());
		}
	}

	static final int method979(int i, final int i_8_) {
		int i_9_;
		try {
			int i_10_ = 0;
			if (i < 0 || i >= 65536) {
				i >>>= 16;
				i_10_ += 16;
			}
			if (i_8_ >= -59) {
				aClass98_1052 = null;
			}
			if (i >= 256) {
				i >>>= 8;
				i_10_ += 8;
			}
			if (i >= 16) {
				i >>>= 4;
				i_10_ += 4;
			}
			if (i >= 4) {
				i_10_ += 2;
				i >>>= 2;
			}
			if (i >= 1) {
				i_10_++;
				i >>>= 1;
			}
			i_9_ = i_10_ - -i;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("me.E(").append(i).append(',').append(i_8_).append(')').toString());
		}
		return i_9_;
	}

	static final Class22 method980(final int i, final Buffer class120_sub7) {
		Class22 class22;
		try {
			final Class22 class22_11_ = new Class22();
			class22_11_.anInt129 = class120_sub7.getUShort();
			if (i <= 71) {
				method980(-65, null);
			}
			class22_11_.aClass120_Sub14_Sub10_128 = Class121.method1837(class22_11_.anInt129, true);
			class22 = class22_11_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("me.C(").append(i).append(',').append(class120_sub7 != null ? "{...}" : "null").append(')').toString());
		}
		return class22;
	}
}
