/* Class127 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class127 {
	static boolean recordMouseMovements;
	private Queue aClass177_1212;
	static js5 objectsJs5;
	static short[] aShortArray1214 = new short[256];
	static int anInt1215;
	private NodeSub aClass120_Sub14_1216;
	static {
		recordMouseMovements = false;
		anInt1215 = -1;
	}

	static final void fixWorldMapBounds() {
		if (ParticleEmitter.anInt2336 < 0) {
			ParticleEmitter.anInt2336 = 0;
			CanvasWrapper.anInt20 = -1;
			Class120_Sub2.anInt2422 = -1;
		}
		if (ModelParticleMagnet.anInt1646 < 0) {
			ModelParticleMagnet.anInt1646 = 0;
			CanvasWrapper.anInt20 = -1;
			Class120_Sub2.anInt2422 = -1;
		}
		if (ParticleEmitter.anInt2336 > WorldMapHandler.mapSizeX) {
			ParticleEmitter.anInt2336 = WorldMapHandler.mapSizeX;
			CanvasWrapper.anInt20 = -1;
			Class120_Sub2.anInt2422 = -1;
		}
		if (ModelParticleMagnet.anInt1646 > WorldMapHandler.mapSizeY) {
			ModelParticleMagnet.anInt1646 = WorldMapHandler.mapSizeY;
			CanvasWrapper.anInt20 = -1;
			Class120_Sub2.anInt2422 = -1;
		}
	}

	final NodeSub method1890() {
		final NodeSub class120_sub14_5_ = aClass120_Sub14_1216;
		if (class120_sub14_5_ == aClass177_1212.head) {
			aClass120_Sub14_1216 = null;
			return null;
		}
		aClass120_Sub14_1216 = class120_sub14_5_.nextSub;
		return class120_sub14_5_;
	}

	static final void method1891(final js5 js5, final int i, final int i_7_, final int i_8_, final boolean bool) {
		SeqType.activeMusicFileId = i_7_;
		Js5Request.activeMusicVolume = i;
		Class69.anInt614 = 10000;
		QuickChatCategoryType.activeMusicGroupId = i_8_;
		MasterIndexInfo.activeMusicJs5 = js5;
		StringNode.aBoolean2734 = bool;
		Class120_Sub12_Sub25.anInt3312 = 1;
	}

	static final void fixCameraBounds() {
		if (Class120_Sub12_Sub21.cameraPitch < 128.0F) {
			Class120_Sub12_Sub21.cameraPitch = 128.0F;
		}
		if (Class120_Sub12_Sub21.cameraPitch > 383.0F) {
			Class120_Sub12_Sub21.cameraPitch = 383.0F;
		}
		if (DummyOutputStream.cameraYaw < 0.0F) {
			DummyOutputStream.cameraYaw += 2048.0F;
		}
		if (DummyOutputStream.cameraYaw >= 2048.0F) {
			DummyOutputStream.cameraYaw -= 2048.0F;
		}
		final int tileX = Class69_Sub3_Sub1.cameraX >> 7;
		final int tileY = Class22.getTileHeight(Class69_Sub3_Sub1.cameraX, InterfaceListener.cameraZ, Class173.gameLevel);
		final int tileZ = InterfaceListener.cameraZ >> 7;
		int highestY = 0;
		if (tileX > 3 && tileZ > 3 && tileX < 100 && tileZ < 100) {
			for (int x = tileX - 4; x <= tileX + 4; x++) {
				for (int z = tileZ - 4; z <= tileZ + 4; z++) {
					int level = Class173.gameLevel;
					if (level < 3 && (Class114.tileSettings[1][x][z] & 0x2) == 2) {
						level++;
					}
					final int y = tileY - (SubInterface.activeTileHeightMap[level][x][z] - 8 * (Class114.aByteArrayArrayArray1094[level][x][z] & 0xff));
					if (highestY < y) {
						highestY = y;
					}
				}
			}
		}
		int i_17_ = 192 * highestY;
		if (i_17_ > 256 * 383) {//383 highest pitch
			i_17_ = 256 * 383;
		}
		if (i_17_ < 256 * 128) {//128 lowest pitch
			i_17_ = 256 * 128;
		}
		if (i_17_ > Normal.cameraYLimit) {
			Normal.cameraYLimit += (i_17_ - Normal.cameraYLimit) / 24;
		} else if (Normal.cameraYLimit > i_17_) {
			Normal.cameraYLimit += (i_17_ - Normal.cameraYLimit) / 80;
		}
	}

	static final void setBridgeTile(final int x, final int z) {
		final GroundTile class120_sub18 = SeqFrameBase.activeGroundTiles[0][x][z];
		for (int level = 0; level < 3; level++) {//Shift levels below
			final GroundTile class120_sub18_20_ = SeqFrameBase.activeGroundTiles[level][x][z] = SeqFrameBase.activeGroundTiles[level + 1][x][z];
			if (class120_sub18_20_ != null) {
				class120_sub18_20_.anInt2636--;
				for (int i_21_ = 0; i_21_ < class120_sub18_20_.anInt2638; i_21_++) {
					final Class28 class28 = class120_sub18_20_.aClass28Array2625[i_21_];
					if ((class28.bitPacked >> 29 & 0x3L) == 2L && class28.anInt180 == x && class28.anInt184 == z) {
						class28.anInt177--;
					}
				}
			}
		}
		if (SeqFrameBase.activeGroundTiles[0][x][z] == null) {
			SeqFrameBase.activeGroundTiles[0][x][z] = new GroundTile(0, x, z);
		}
		SeqFrameBase.activeGroundTiles[0][x][z].bridgeTile = class120_sub18;
		SeqFrameBase.activeGroundTiles[3][x][z] = null;
	}

	final NodeSub method1895() {
		final NodeSub class120_sub14_22_ = aClass177_1212.head.nextSub;
		if (aClass177_1212.head == class120_sub14_22_) {
			aClass120_Sub14_1216 = null;
			return null;
		}
		aClass120_Sub14_1216 = class120_sub14_22_.nextSub;
		return class120_sub14_22_;
	}

	final void method1896(final Queue queue) {
		aClass177_1212 = queue;
	}

	public Class127() {
		/* empty */
	}
}
