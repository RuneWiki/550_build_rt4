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
		Class120_Sub12_Sub20.clearSeqCache();
		StringNode.method1720();
		VarBit.recentUse.clear();
		Varp.recentUse.clear();
		BasType.recentUse.clear();
		MapSceneType.clear();
		MapFunctionType.clear();
		GroundDecoration.method309();
		SphereType.recentUse.clear();
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
		MagnetType.recentUse.clear();
		LDFont.fontCache.clear();
		if (!HDToolkit.glEnabled) {
			((Class143_Sub1) Rasterizer.anInterface5_973).method2025();
		}
		ClientScript.recentUse.clear();
		AmbientSound.framesJs5.method419();
		Class79_Sub1.frameBasesJs5.method419();
		Class33.interfaceJs5.method419();
		Class159.aClass50_1490.method419();
		Class65.mapsJs5.method419();
		Class120_Sub12_Sub36.musicJs5.method419();
		Class120_Sub12_Sub17.modelsJs5.method419();
		client.spritesJs5.method419();
		ParticleNodeSub.binaryJs5.method419();
		InterfaceListener.aClass50_2544.method419();
		ClientScript.scriptsJs5.method419();
		Class120_Sub12_Sub2.hitBarSpriteCache.clear();
	}

	static final void searchQuickChatMessages(final boolean bool, String string) {
		string = string.toLowerCase();
		short[] results = new short[16];
		int resultsPos = 0;
		final int loopStart = bool ? 32768 : 0;
		final int loopEnd = (bool ? Class192.anInt2120 : MagnetType.anInt269) + loopStart;
		for (int id = loopStart; id < loopEnd; id++) {
			final QuickChatMessageType quickChatMessage = QuickChatMessageType.list(id);
			if (quickChatMessage.searchable && quickChatMessage.getOptionBase().toLowerCase().indexOf(string) != -1) {
				if (resultsPos >= 50) {
					Buffer.searchResultCount = -1;
					Class120_Sub12_Sub37.searchResults = null;
					return;
				}
				if (results.length <= resultsPos) {
					final short[] newArray = new short[results.length * 2];
					for (int i = 0; i < resultsPos; i++) {
						newArray[i] = results[i];
					}
					results = newArray;
				}
				results[resultsPos++] = (short) id;
			}
		}
		ParticleNode.searchResultsPos = 0;
		Buffer.searchResultCount = resultsPos;
		final String[] names = new String[Buffer.searchResultCount];
		Class120_Sub12_Sub37.searchResults = results;
		for (int id = 0; id < Buffer.searchResultCount; id++) {
			names[id] = QuickChatMessageType.list(results[id]).getOptionBase();
		}
		ArrayUtils.quicksort(names, Class120_Sub12_Sub37.searchResults);
	}
}
