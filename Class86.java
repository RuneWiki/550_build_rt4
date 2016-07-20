/* Class86 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class86 {
	static World[] worlds = new World[0];
	static int anInt818;
	static int loginStep = 0;
	static GroundTile[][][] surfaceGroundTiles;
	static int staffLevel = 0;
	static SeekableFile aClass193_822;
	static Hashtable aClass75_823;

	static {
		anInt818 = -1;
	}

	static final void cameraUp() {
		if (!Class154.aBoolean1439) {
			Class154.aBoolean1439 = true;
			Class118.sendCameraPacket = true;
			if (!Class134.updateCameraFromCs2) {
				Class120_Sub12_Sub4.cameraPitchWrapper += (12.0F - Class120_Sub12_Sub4.cameraPitchWrapper) / 2.0F;
			} else {
				Class120_Sub12_Sub21.cameraPitch = 47 + (int) Class120_Sub12_Sub21.cameraPitch & ~0xf;
			}
		}
	}

	static final void method728(final JagexInterface jagexInterface, final int drawX, final int drawY) {
		if ((WallDecoration.menuOptionCount >= 2 || Light.objSelected != 0 || Class88.spellSelected)) {
			final String string = SubScript.method2243();
			if (jagexInterface == null) {
				final int i_1_ = Class120_Sub12_Sub22.boldFont.method1470(string, drawX + 4, drawY + 15, 16777215, 0, Class136.aRandom1319, MasterIndexInfo.gregorianDateSeed);
				Class120_Sub12_Sub1.redrawScreen(drawX + 4, drawY, i_1_ + Class120_Sub12_Sub22.boldFont.method1459(string), 15);
			} else {
				AbstractFont class120_sub14_sub8 = jagexInterface.getFont(Class82.nameIconSprites);
				if (class120_sub14_sub8 == null) {
					class120_sub14_sub8 = Class120_Sub12_Sub22.boldFont;
				}
				class120_sub14_sub8.method1476(string, drawX, drawY, jagexInterface.width, jagexInterface.height, jagexInterface.disabledColor, jagexInterface.shadow, jagexInterface.horizontalAlignment, jagexInterface.verticalAlignment, Class136.aRandom1319, MasterIndexInfo.gregorianDateSeed, Class173.anIntArray1730);
				Class120_Sub12_Sub1.redrawScreen(Class173.anIntArray1730[0], Class173.anIntArray1730[1], Class173.anIntArray1730[2], Class173.anIntArray1730[3]);
			}
		}
	}

	static final void method729(final boolean underwater) {
		int i_2_;
		byte[][] is;
		if (!HDToolkit.glEnabled || !underwater) {
			i_2_ = 4;
			is = RuntimeException_Sub1.mapFilesBuffer;
		} else {
			i_2_ = 1;
			is = Class120_Sub12_Sub36.underWaterMapFilesBuffer;
		}
		final int i_3_ = is.length;
		for (int i_4_ = 0; i_4_ < i_3_; i_4_++) {
			int[] is_5_ = null;
			final int i_6_ = Class120_Sub12_Sub36.regionBitPackeds[i_4_] >> 8;
			final byte[] is_7_ = is[i_4_];
			final int i_8_ = 0xff & Class120_Sub12_Sub36.regionBitPackeds[i_4_];
			final int i_9_ = -GameEntity.currentBaseX + 64 * i_6_;
			final int i_10_ = i_8_ * 64 + -LightType.currentBaseZ;
			if (is_7_ != null) {
				Class120_Sub2.method1050();
				is_5_ = ProducingGraphicsBuffer.method1851(underwater, WallLocation.collisionMaps, LightType.currentBaseZ, i_10_, i_9_, GameEntity.currentBaseX, is_7_);
			}
			if (!underwater && Class116.currentRegionX / 8 == i_6_ && i_8_ == Class3.currentRegionZ / 8) {
				if (is_5_ == null) {
					ModelParticleEmitter.activeSkyboxId = -1;
				} else {
					ModelParticleEmitter.activeSkyboxId = is_5_[0];
					PlainTile.activeSkyboxSphereOffsetZ = is_5_[3];
					Class143_Sub1.activeSkyboxSphereOffsetY = is_5_[2];
					Class120_Sub12.activeSkyboxSphereOffsetX = is_5_[1];
					Class132.activeSkyboxYawOffset = is_5_[4];
				}
			}
		}
		for (int i_11_ = 0; i_3_ > i_11_; i_11_++) {
			final int i_13_ = (Class120_Sub12_Sub36.regionBitPackeds[i_11_] >> 8) * 64 - GameEntity.currentBaseX;
			final int i_12_ = (Class120_Sub12_Sub36.regionBitPackeds[i_11_] & 0xff) * 64 - LightType.currentBaseZ;
			final byte[] is_14_ = is[i_11_];
			if (is_14_ == null && Class3.currentRegionZ < 800) {
				Class120_Sub2.method1050();
				for (int i_15_ = 0; i_15_ < i_2_; i_15_++) {
					Class120_Sub14_Sub15.method1556(i_13_, i_15_, 64, i_12_, 64);
				}
			}
		}
	}

}
