/* Class110 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class110 {
	static int[][][] anIntArrayArrayArray1050;
	static int b12fullId;
	static Class98 aClass98_1052;
	static InterfaceClickMask aClass120_Sub20_1053;
	static boolean objectTagEnabled = false;
	static MouseRecorder mouseRecorder;

	static {
		aClass120_Sub20_1053 = new InterfaceClickMask(0, -1);
	}

	static final void method976() {
		InterfaceListener.aClass21_2542.clear();
		OverlayType.recentUse.clear();
		IdentityKit.recentUse.clear();
		Class120_Sub12_Sub25.method1334();
		NodeCache.method297();
		Class120_Sub12_Sub18.method1291();
		Class120_Sub12_Sub20.method1296();
		StringNode.method1720();
		VarBit.recentUse.clear();
		Varp.recentUse.clear();
		Class120_Sub12_Sub31.aClass21_3378.clear();
		InterfaceClickMask.method1693();
		Class120_Sub16.method1658();
		Class36.method309();
		Class120_Sub12_Sub9.aClass21_3196.clear();
		Class120_Sub12_Sub35.aClass21_3411.clear();
		DisplayModeInfo.method2214();
		AbstractMouseWheelHandler.method160();
		Class120_Sub12_Sub26.method1337();
		if (LocType.modeWhat != 0) {
			for (int i_0_ = 0; i_0_ < Class120_Sub12_Sub25.aByteArrayArray3318.length; i_0_++) {
				Class120_Sub12_Sub25.aByteArrayArray3318[i_0_] = null;
			}
			Class120_Sub14_Sub20.anInt3624 = 0;
		}
		Class120_Sub14_Sub13.aClass21_3564.clear();
		Class154.aClass21_1438.clear();
		Class120_Sub12_Sub16.aClass21_3251.clear();
		SceneGroundObject.aClass21_2841.clear();
		Class15.aClass21_95.clear();
		if (!HDToolkit.glEnabled) {
			((Class143_Sub1) Rasterizer.anInterface5_973).method2025(-45);
		}
		OverlayType.aClass35_1219.clear();
		AmbientSound.aClass50_2479.method419();
		Class79_Sub1.aClass50_2245.method419();
		Class33.aClass50_275.method419();
		Class159.aClass50_1490.method419();
		Class65.aClass50_597.method419();
		Class120_Sub12_Sub36.aClass50_3419.method419();
		Class120_Sub12_Sub17.aClass50_3258.method419();
		Class7.aClass50_63.method419();
		Class108_Sub3.aClass50_2400.method419();
		InterfaceListener.aClass50_2544.method419();
		IsaacCipher.aClass50_1019.method419();
		Class120_Sub12_Sub2.aClass21_3144.clear();
	}

	public static void method977(final byte i) {
		try {
			aClass98_1052 = null;
			mouseRecorder = null;
			if (i < -65) {
				aClass120_Sub20_1053 = null;
				anIntArrayArrayArray1050 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("me.B(").append(i).append(')').toString());
		}
	}

	static final void method978(final boolean bool, String string) {
		short[] is = new short[16];
		string = string.toLowerCase();
		final int i_1_ = !bool ? 0 : 32768;
		int i_2_ = 0;
		final int i_3_ = (bool ? Class192.anInt2120 : Class32.anInt269) + i_1_;
		for (int i_4_ = i_1_; i_4_ < i_3_; i_4_++) {
			final Class120_Sub14_Sub10 class120_sub14_sub10 = Class121.method1837(i_4_, true);
			if (class120_sub14_sub10.aBoolean3531 && (class120_sub14_sub10.method1510().toLowerCase().indexOf(string) ^ 0xffffffff) != 0) {
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
			strings[i_7_] = Class121.method1837(is[i_7_], true).method1510();
		}
		Class28.method242(Class120_Sub12_Sub37.aShortArray3430, 56, strings);
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
			throw EnumType.method1428(runtimeexception, new StringBuilder("me.E(").append(i).append(',').append(i_8_).append(')').toString());
		}
		return i_9_;
	}

	static final Class22 method980(final Buffer bufer) {
		final Class22 class22_11_ = new Class22();
		class22_11_.anInt129 = bufer.getUShort();
		class22_11_.aClass120_Sub14_Sub10_128 = Class121.method1837(class22_11_.anInt129, true);
		return class22_11_;
	}
}
