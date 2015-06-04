/* Class92 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class92 {
	static LDSprite torchFlamesSprite;
	static WorldMapFont aClass98_863;
	static int anInt864;
	static boolean[][] aBooleanArrayArray865 = { new boolean[0], { true, false, true }, { true, false, false, true }, { false, false, true, true }, { true, true, false }, { false, true, true }, { true, false, false, true }, { false, false, false, true, true }, { false, true, true },
			{ true, false, true, true, true }, { false, true, true, true, true }, { false, true, true, true, true, false } };

	static final int method766(final int x, final int z, int rot) {
		rot &= 3;
		if (rot == 0) {
			return z;
		}
		if (rot == 1) {
			return 1023 - x;
		}
		if (rot == 2) {
			return 1023 - z;
		}
		return x;
	}

	static final void method767() {
		Canvas_Sub1.inputStream.startBitAccess();
		final int i_4_ = Canvas_Sub1.inputStream.getBitValue(1);
		if (i_4_ != 0) {
			final int i_5_ = Canvas_Sub1.inputStream.getBitValue(2);
			if (i_5_ == 0) {
				ModelParticleMagnet.toUpdateEntityIndex[Class154.toUpdateEntitiesPos++] = 2047;
			} else if (i_5_ == 1) {
				final int i_6_ = Canvas_Sub1.inputStream.getBitValue(3);
				TileParticleQueue.selfPlayer.move(i_6_, 1);
				final int i_7_ = Canvas_Sub1.inputStream.getBitValue(1);
				if (i_7_ == 1) {
					ModelParticleMagnet.toUpdateEntityIndex[Class154.toUpdateEntitiesPos++] = 2047;
				}
			} else if (i_5_ == 2) {
				if (Canvas_Sub1.inputStream.getBitValue(1) == 1) {
					final int i_8_ = Canvas_Sub1.inputStream.getBitValue(3);
					TileParticleQueue.selfPlayer.move(i_8_, 2);
					final int i_9_ = Canvas_Sub1.inputStream.getBitValue(3);
					TileParticleQueue.selfPlayer.move(i_9_, 2);
				} else {
					final int i_10_ = Canvas_Sub1.inputStream.getBitValue(3);
					TileParticleQueue.selfPlayer.move(i_10_, 0);
				}
				final int i_11_ = Canvas_Sub1.inputStream.getBitValue(1);
				if (i_11_ == 1) {
					ModelParticleMagnet.toUpdateEntityIndex[Class154.toUpdateEntitiesPos++] = 2047;
				}
			} else if (i_5_ == 3) {
				final int i_12_ = Canvas_Sub1.inputStream.getBitValue(7);
				final int i_13_ = Canvas_Sub1.inputStream.getBitValue(1);
				final int i_14_ = Canvas_Sub1.inputStream.getBitValue(1);
				if (i_14_ == 1) {
					ModelParticleMagnet.toUpdateEntityIndex[Class154.toUpdateEntitiesPos++] = 2047;
				}
				Class173.gameLevel = Canvas_Sub1.inputStream.getBitValue(2);
				final int i_15_ = Canvas_Sub1.inputStream.getBitValue(7);
				TileParticleQueue.selfPlayer.setPos(i_15_, i_12_, i_13_ == 1);
			}
		}
	}

	static final void method768(final int i, final int i_16_, final int i_17_, final int i_18_, final int i_19_, final int i_21_, final int i_22_) {
		final int i_23_ = Class3.method83(Class120_Sub30_Sub2.anInt3699, i_22_, Identikit.anInt1334);
		final int i_24_ = Class3.method83(Class120_Sub30_Sub2.anInt3699, i, Identikit.anInt1334);
		final int i_25_ = Class3.method83(MagnetType.anInt260, i_19_, ParamType.anInt3544);
		final int i_26_ = Class3.method83(MagnetType.anInt260, i_21_, ParamType.anInt3544);
		final int i_27_ = Class3.method83(Class120_Sub30_Sub2.anInt3699, i_22_ - -i_16_, Identikit.anInt1334);
		final int i_28_ = Class3.method83(Class120_Sub30_Sub2.anInt3699, -i_16_ + i, Identikit.anInt1334);
		for (int i_29_ = i_23_; i_29_ < i_27_; i_29_++) {
			AmbientSound.fillArray(GameEntity.anIntArrayArray3009[i_29_], i_18_, i_25_, i_26_);
		}
		for (int i_30_ = i_24_; i_30_ > i_28_; i_30_--) {
			AmbientSound.fillArray(GameEntity.anIntArrayArray3009[i_30_], i_18_, i_25_, i_26_);
		}
		final int i_31_ = Class3.method83(MagnetType.anInt260, i_19_ - -i_16_, ParamType.anInt3544);
		final int i_32_ = Class3.method83(MagnetType.anInt260, -i_16_ + i_21_, ParamType.anInt3544);
		for (int i_33_ = i_27_; i_28_ >= i_33_; i_33_++) {
			final int[] is = GameEntity.anIntArrayArray3009[i_33_];
			AmbientSound.fillArray(is, i_18_, i_25_, i_31_);
			AmbientSound.fillArray(is, i_17_, i_31_, i_32_);
			AmbientSound.fillArray(is, i_18_, i_32_, i_26_);
		}
	}
}
