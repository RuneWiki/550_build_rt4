/* Class110 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class110 {
	static int[][][] tileOccludeFlags;
	static int b12fullId;
	static WorldMapFont aClass98_1052;
	static InterfaceClickMask aClass120_Sub20_1053;
	static boolean objectTagEnabled = false;
	static MouseRecorder mouseRecorder;

	static {
		aClass120_Sub20_1053 = new InterfaceClickMask(0, -1);
	}

	static final void method976() {
		OverlayType.recentUse.clear();
		UnderlayType.recentUse.clear();
		Identikit.recentUse.clear();
		Class120_Sub12_Sub25.clearLocCache();
		NodeCache.clearNpcCache();
		Class120_Sub12_Sub18.clearObjCache();
		Class120_Sub12_Sub20.method1296();
		StringNode.method1720();
		VarBit.recentUse.clear();
		Varp.recentUse.clear();
		EntityRenderData.recentUse.clear();
		MapSceneType.clear();
		MapFunctionType.clear();
		GroundDecoration.method309();
		Class153.recentUse.clear();
		LightType.recentUse.clear();
		DisplayModeInfo.method2214();
		AbstractMouseWheelHandler.method160();
		Class120_Sub12_Sub26.method1337();
		if (LocType.modeWhat != 0) {
			for (int i_0_ = 0; i_0_ < Class120_Sub12_Sub25.aByteArrayArray3318.length; i_0_++) {
				Class120_Sub12_Sub25.aByteArrayArray3318[i_0_] = null;
			}
			OverlayFrequencyNode.anInt3624 = 0;
		}
		Class120_Sub14_Sub13.aClass21_3564.clear();
		Class154.shadowModelCache.clear();
		EmitterType.recentUse.clear();
		SceneGroundObject.aClass21_2841.clear();
		Class15.aClass21_95.clear();
		if (!HDToolkit.glEnabled) {
			((Class143_Sub1) Rasterizer.anInterface5_973).method2025();
		}
		ClientScript.recentUse.clear();
		AmbientSound.aClass50_2479.method419();
		Class79_Sub1.aClass50_2245.method419();
		Class33.aClass50_275.method419();
		Class159.aClass50_1490.method419();
		Class65.aClass50_597.method419();
		Class120_Sub12_Sub36.aClass50_3419.method419();
		Class120_Sub12_Sub17.aClass50_3258.method419();
		client.aClass50_63.method419();
		ParticleNodeSub.aClass50_2400.method419();
		InterfaceListener.aClass50_2544.method419();
		IsaacCipher.aClass50_1019.method419();
		Class120_Sub12_Sub2.aClass21_3144.clear();
	}

	static final void method978(final boolean bool, String string) {
		short[] is = new short[16];
		string = string.toLowerCase();
		final int i_1_ = bool ? 32768 : 0;
		int i_2_ = 0;
		final int i_3_ = (bool ? Class192.anInt2120 : MagnetType.anInt269) + i_1_;
		for (int i_4_ = i_1_; i_4_ < i_3_; i_4_++) {
			final QuickChatMessageType class120_sub14_sub10 = QuickChatMessageType.list(i_4_);
			if (class120_sub14_sub10.aBoolean3531 && class120_sub14_sub10.method1510().toLowerCase().indexOf(string) != -1) {
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
		ParticleNode.anInt1035 = 0;
		Buffer.anInt2474 = i_2_;
		final String[] strings = new String[Buffer.anInt2474];
		Class120_Sub12_Sub37.aShortArray3430 = is;
		for (int i_7_ = 0; Buffer.anInt2474 > i_7_; i_7_++) {
			strings[i_7_] = QuickChatMessageType.list(is[i_7_]).method1510();
		}
		Class28.method242(strings, Class120_Sub12_Sub37.aShortArray3430);
	}
}
