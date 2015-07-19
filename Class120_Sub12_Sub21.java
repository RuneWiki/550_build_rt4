/* Class120_Sub12_Sub21 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Class120_Sub12_Sub21 extends Class120_Sub12 {
	int anInt3290;
	static int anInt3291 = 50;
	int anInt3292;
	static float cameraPitch = 128.0F;
	static long[] actions = new long[1000];
	private int anInt3295 = -1;
	int[] anIntArray3296;
	static Class120_Sub14_Sub9 aClass120_Sub14_Sub9_3297;
	static int menuMouseY;

	final boolean method1304() {
		if (this.anIntArray3296 != null) {
			return true;
		}
		if (anInt3295 >= 0) {
			final LDSprite class120_sub14_sub19_sub2 = Class120_Sub12_Sub25.anInt3316 < 0 ? IsaacCipher.constructLDSprite(Class10.aClass50_79, anInt3295) : Class120_Sub14_Sub13.constructLDSprite(Class10.aClass50_79, Class120_Sub12_Sub25.anInt3316, anInt3295);
			class120_sub14_sub19_sub2.method1615();
			this.anIntArray3296 = class120_sub14_sub19_sub2.pixels;
			this.anInt3292 = class120_sub14_sub19_sub2.width;
			this.anInt3290 = class120_sub14_sub19_sub2.height;
			return true;
		}
		return false;
	}

	@Override
	final void decode(final Buffer buffer, final int code) {
		if (code == 0) {
			anInt3295 = buffer.getUShort();
		}
	}

	static final void method1306() {
		for (int id = 0; id < Class150.soundEffectCount; id++) {
			Class81.soundEffectDelays[id]--;
			if (Class81.soundEffectDelays[id] < -10) {
				Class150.soundEffectCount--;
				for (int higherIds = id; higherIds < Class150.soundEffectCount; higherIds++) {
					Class120_Sub12_Sub16.anIntArray3255[higherIds] = Class120_Sub12_Sub16.anIntArray3255[higherIds + 1];
					Class109.aClass6Array1047[higherIds] = Class109.aClass6Array1047[higherIds + 1];
					LocType.anIntArray1834[higherIds] = LocType.anIntArray1834[higherIds + 1];
					Class81.soundEffectDelays[higherIds] = Class81.soundEffectDelays[higherIds + 1];
					Class174.anIntArray1731[higherIds] = Class174.anIntArray1731[higherIds + 1];
					FileSystemRequest.anIntArray3926[higherIds] = FileSystemRequest.anIntArray3926[higherIds + 1];
				}
				id--;
			} else {
				SoundEffect class6 = Class109.aClass6Array1047[id];
				if (class6 == null) {
					class6 = SoundEffect.list(Class159.aClass50_1490, Class120_Sub12_Sub16.anIntArray3255[id], 0);
					if (class6 == null) {
						continue;
					}
					Class81.soundEffectDelays[id] += class6.delay();
					Class109.aClass6Array1047[id] = class6;
				}
				if (Class81.soundEffectDelays[id] < 0) {
					int i_5_;
					if (Class174.anIntArray1731[id] != 0) {
						final int i_6_ = (Class174.anIntArray1731[id] & 0xff) * 128;
						final int i_9_ = Class174.anIntArray1731[id] >> 8 & 0xff;
						final int i_7_ = Class174.anIntArray1731[id] >> 16 & 0xff;
						int i_8_ = i_7_ * 128 + 64 - TileParticleQueue.selfPlayer.x;
						if (i_8_ < 0) {
							i_8_ = -i_8_;
						}
						int i_10_ = i_9_ * 128 + 64 - TileParticleQueue.selfPlayer.z;
						if (i_10_ < 0) {
							i_10_ = -i_10_;
						}
						int i_11_ = i_10_ + i_8_ - 128;
						if (i_6_ < i_11_) {
							Class81.soundEffectDelays[id] = -100;
							continue;
						}
						if (i_11_ < 0) {
							i_11_ = 0;
						}
						i_5_ = (i_6_ - i_11_) * CursorType.ambientSoundsVolume * FileSystemRequest.anIntArray3926[id] / i_6_ >> 8;
					} else {
						i_5_ = FileSystemRequest.anIntArray3926[id] * Class111.anInt1061 >> 8;
					}
					if (i_5_ > 0) {
						final Class120_Sub5_Sub1 class120_sub5_sub1 = class6.method104().method1067(ObjectPile.aClass172_1809);
						final Class120_Sub30_Sub4 class120_sub30_sub4 = Class120_Sub30_Sub4.method1821(class120_sub5_sub1, 100, i_5_);
						class120_sub30_sub4.method1795(LocType.anIntArray1834[id] - 1);
						Class120_Sub12_Sub22.aClass120_Sub30_Sub3_3299.method1787(class120_sub30_sub4);
					}
					Class81.soundEffectDelays[id] = -100;
				}
			}
		}
		if (!Class120_Sub12_Sub15.aBoolean3247 || World.method2193()) {
			if (RuntimeException_Sub1.anInt2142 != 0 && Class157.anInt1466 != -1 && !World.method2193()) {
				Class120_Sub12_Sub11.outputStream.putByteIsaac(250);
				Class120_Sub12_Sub11.outputStream.putInt(Class157.anInt1466);
				Class157.anInt1466 = -1;
			}
		} else {
			if (RuntimeException_Sub1.anInt2142 != 0 && Class157.anInt1466 != -1) {
				Class127.method1891(Class120_Sub12_Sub36.musicJs5, RuntimeException_Sub1.anInt2142, 0, Class157.anInt1466, false);
			}
			Class120_Sub12_Sub15.aBoolean3247 = false;
		}
	}

	static final void method1308(final int i_12_, final int i_13_, final int i_14_, int i_15_, int i_16_) {
		AmbientSound.fillArray(GameEntity.anIntArrayArray3009[i_15_++], i_12_, i_13_, i_14_);
		AmbientSound.fillArray(GameEntity.anIntArrayArray3009[i_16_--], i_12_, i_13_, i_14_);
		for (int i_17_ = i_15_; i_16_ >= i_17_; i_17_++) {
			final int[] is = GameEntity.anIntArrayArray3009[i_17_];
			is[i_13_] = is[i_14_] = i_12_;
		}
	}

	@Override
	final void method1189() {
		super.method1189();
		this.anIntArray3296 = null;
	}

	@Override
	final int method1181() {
		return anInt3295;
	}

	static final void method1311() {
		OverlayType.recentUse.clearSoftReference();
		UnderlayType.recentUse.clearSoftReference();
		Identikit.recentUse.clearSoftReference();
		LocType.recentUse.clearSoftReference();
		LocType.aClass21_2663.clearSoftReference();
		LocType.aClass21_1618.clearSoftReference();
		LocType.aClass21_1117.clearSoftReference();
		NpcType.recentUse.clearSoftReference();
		NpcType.aClass21_80.clearSoftReference();
		Projectile.aClass21_2931.clearSoftReference();
		ObjType.recentUse.clearSoftReference();
		Class33.aClass21_273.clearSoftReference();
		SpotAnimation.objectSpriteCache.clearSoftReference();
		SeqType.recentUse.clearSoftReference();
		FrameGroup.recentUse.clearSoftReference();
		SpotAnimType.recentUse.clearSoftReference();
		SpotAnimType.modelCache.clearSoftReference();
		VarBit.recentUse.clearSoftReference();
		Varp.recentUse.clearSoftReference();
		EntityRenderData.recentUse.clearSoftReference();
		MapSceneType.recentUse.clearSoftReference();
		MapSceneType.spriteCache.clearSoftReference();
		MapFunctionType.recentUse.clearSoftReference();
		MapFunctionType.spriteCache.clearSoftReference();
		SkyboxType.aClass21_1486.clearSoftReference();
		Skybox.recentUse.clearSoftReference();
		SphereType.recentUse.clearSoftReference();
		LightType.recentUse.clearSoftReference();
		CursorType.recentUse.clearSoftReference();
		CursorType.graphicCache.clearSoftReference();
		Class43.playerModelsCache.clearSoftReference();
		Class90.playerHeadModelsCache.clearSoftReference();
		JagexInterface.spriteCache.clearSoftReference();
		JagexInterface.modelCache.clearSoftReference();
		JagexInterface.fontCache.clearSoftReference();
		Class120_Sub14_Sub13.aClass21_3564.clearSoftReference();
		Class154.shadowModelCache.clearSoftReference();
		Class120_Sub12_Sub2.hitBarSpriteCache.clearSoftReference();
		LDFont.fontCache.clearSoftReference();
	}

	public Class120_Sub12_Sub21() {
		super(0, false);
	}

	@Override
	int[][] method1188(final int i) {
		final int[][] is_20_ = this.aClass109_2559.method975(i);
		if (this.aClass109_2559.aBoolean1049 && method1304()) {
			final int[] is_21_ = is_20_[0];
			final int[] is_22_ = is_20_[1];
			final int[] is_23_ = is_20_[2];
			int i_24_ = (Class120_Sub12_Sub2.anInt3145 != this.anInt3290 ? i * this.anInt3290 / Class120_Sub12_Sub2.anInt3145 : i) * this.anInt3292;
			if (this.anInt3292 == Class120_Sub12_Sub7.anInt3178) {
				for (int i_25_ = 0; Class120_Sub12_Sub7.anInt3178 > i_25_; i_25_++) {
					final int i_26_ = this.anIntArray3296[i_24_++];
					is_23_[i_25_] = Class120_Sub12_Sub3.method1207(i_26_ << 4, 4080);
					is_22_[i_25_] = Class120_Sub12_Sub3.method1207(65280, i_26_) >> 4;
					is_21_[i_25_] = Class120_Sub12_Sub3.method1207(i_26_, 16711680) >> 12;
				}
			} else {
				for (int i_27_ = 0; i_27_ < Class120_Sub12_Sub7.anInt3178; i_27_++) {
					final int i_28_ = this.anInt3292 * i_27_ / Class120_Sub12_Sub7.anInt3178;
					final int i_29_ = this.anIntArray3296[i_28_ + i_24_];
					is_23_[i_27_] = Class120_Sub12_Sub3.method1207(255, i_29_) << 4;
					is_22_[i_27_] = Class120_Sub12_Sub3.method1207(i_29_, 65280) >> 4;
					is_21_[i_27_] = Class120_Sub12_Sub3.method1207(i_29_ >> 12, 4080);
				}
			}
		}
		return is_20_;
	}
}
