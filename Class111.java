/* Class111 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class111 {
	static Class28[] aClass28Array1057;
	static boolean aBoolean1058;
	static int anInt1060 = 0;
	static int soundEffectVolume = 127;
	static int[] underWaterMapFileIds;
	static js5 aClass50_1064;
	static int anInt1065;
	
	static {
		aBoolean1058 = false;
	}

	static final void method981(int i) {
		if (i > 256) {
			i = 256;
		}
		if (i > 10) {
			i = 10;
		}
		DummyOutputStream.anInt32 += i * 128;
		if (DummyOutputStream.anInt32 > InterfaceChangeNode.anIntArray3485.length) {
			DummyOutputStream.anInt32 -= InterfaceChangeNode.anIntArray3485.length;
			final int i_2_ = (int) (Math.random() * 12.0);
			Class96.method787(JagexSocket.runesSprite[i_2_]);
		}
		int i_3_ = 0;
		final int i_4_ = 128 * i;
		final int i_5_ = 128 * (256 - i);
		for (int i_6_ = 0; i_6_ < i_5_; i_6_++) {
			int i_7_ = Light.anIntArray392[i_4_ + i_3_] - i * InterfaceChangeNode.anIntArray3485[DummyOutputStream.anInt32 + i_3_ & -1 + InterfaceChangeNode.anIntArray3485.length] / 6;
			if (i_7_ < 0) {
				i_7_ = 0;
			}
			Light.anIntArray392[i_3_++] = i_7_;
		}
		for (int i_6_ = 256 - i; i_6_ < 256; i_6_++) {
			final int i_8_ = 128 * i_6_;
			for (int i_9_ = 0; i_9_ < 128; i_9_++) {
				final int i_10_ = (int) (Math.random() * 100.0);
				if (i_10_ < 50 && i_9_ > 10 && i_9_ < 118) {
					Light.anIntArray392[i_8_ + i_9_] = 255;
				} else {
					Light.anIntArray392[i_8_ + i_9_] = 0;
				}
			}
		}
		for (int i_6_ = 0; i_6_ < 256 - i; i_6_++) {
			Class120_Sub15.anIntArray2597[i_6_] = Class120_Sub15.anIntArray2597[i_6_ + i];
		}
		for (int i_6_ = 256 - i; i_6_ < 256; i_6_++) {
			Class120_Sub15.anIntArray2597[i_6_] = (int) (16.0 * Math.sin(MouseRecorder.anInt852 / 14.0) + 14.0 * Math.sin(MouseRecorder.anInt852 / 15.0) + 12.0 * Math.sin(MouseRecorder.anInt852 / 16.0));
			MouseRecorder.anInt852++;
		}
		Class74.anInt667 += i;
		int i_6_ = (i - -(0x1 & Class101_Sub2.clientClock)) / 2;
		if (i_6_ > 0) {
			for (int i_11_ = 0; i_11_ < Class74.anInt667; i_11_++) {
				final int i_12_ = 2 + (int) (124.0 * Math.random());
				final int i_13_ = (int) (128.0 * Math.random()) - -128;
				Light.anIntArray392[(i_13_ << 7) + i_12_] = 192;
			}
			Class74.anInt667 = 0;
			for (int i_14_ = 0; i_14_ < 256; i_14_++) {
				int i_15_ = 0;
				final int i_16_ = 128 * i_14_;
				for (int i_17_ = -i_6_; i_17_ < 128; i_17_++) {
					if (i_17_ + i_6_ < 128) {
						i_15_ += Light.anIntArray392[i_6_ + i_17_ - -i_16_];
					}
					if (-1 + -i_6_ + i_17_ >= 0) {
						i_15_ -= Light.anIntArray392[i_16_ + i_17_ + -1 + -i_6_];
					}
					if (i_17_ >= 0) {
						GrandExchangeObject.anIntArray1501[i_17_ + i_16_] = i_15_ / (1 + 2 * i_6_);
					}
				}
			}
			for (int i_18_ = 0; i_18_ < 128; i_18_++) {
				int i_19_ = 0;
				for (int i_20_ = -i_6_; i_20_ < 256; i_20_++) {
					final int i_21_ = 128 * i_20_;
					if (i_20_ + i_6_ < 256) {
						i_19_ += GrandExchangeObject.anIntArray1501[i_21_ + i_18_ - -(128 * i_6_)];
					}
					if (i_20_ + -1 + -i_6_ >= 0) {
						i_19_ -= GrandExchangeObject.anIntArray1501[-128 - (128 * i_6_ - i_21_ - i_18_)];
					}
					if (i_20_ >= 0) {
						Light.anIntArray392[i_21_ + i_18_] = i_19_ / (2 * i_6_ - -1);
					}
				}
			}
		}
	}

	static final int stringToIntRadix(final String text, final int radix) {
		return CanvasWrapper.stringToIntRadix(text, radix, true);
	}

	static final void method984(final GameEntity gameEntity) {
		if (Class101_Sub2.clientClock == gameEntity.anInt2961 || gameEntity.animId == -1 || gameEntity.animDelay != 0 || gameEntity.animFrameDelay + 1 > SeqType.list(gameEntity.animId).delays[gameEntity.animFrame]) {
			final int i_24_ = gameEntity.anInt2961 - gameEntity.anInt3035;
			final int i_25_ = Class101_Sub2.clientClock - gameEntity.anInt3035;
			final int i_27_ = gameEntity.anInt3034 * 128 + gameEntity.getSize() * 64;
			final int i_28_ = gameEntity.anInt3015 * 128 + gameEntity.getSize() * 64;
			final int i_26_ = gameEntity.anInt2967 * 128 + gameEntity.getSize() * 64;
			final int i_29_ = gameEntity.anInt3026 * 128 + gameEntity.getSize() * 64;
			gameEntity.x = (i_26_ * (i_24_ - i_25_) + i_28_ * i_25_) / i_24_;
			gameEntity.z = (i_27_ * (i_24_ - i_25_) + i_25_ * i_29_) / i_24_;
		}
		if (gameEntity.anInt3008 == 0) {
			gameEntity.newFaceDegrees = 1024;
		}
		if (gameEntity.anInt3008 == 1) {
			gameEntity.newFaceDegrees = 1536;
		}
		if (gameEntity.anInt3008 == 2) {
			gameEntity.newFaceDegrees = 0;
		}
		if (gameEntity.anInt3008 == 3) {
			gameEntity.newFaceDegrees = 512;
		}
		gameEntity.anInt3037 = 0;
		gameEntity.faceDegrees = gameEntity.newFaceDegrees;
	}
}
