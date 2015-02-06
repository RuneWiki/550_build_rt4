/* Class127 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class127 {
	static boolean recordMouseMovements;
	private Queue aClass177_1212;
	static js5 aClass50_1213;
	static short[] aShortArray1214 = new short[256];
	static int anInt1215;
	private NodeSub aClass120_Sub14_1216;
	static String aString1217;

	static {
		recordMouseMovements = false;
		anInt1215 = -1;
		aString1217 = "flash3:";
	}

	static final int method1888(final int paramId, final int containerId, final boolean multiplyByCount) {
		final ObjectContainer objectContainer = (ObjectContainer) ObjectContainer.objectContainerCache.get(containerId);
		if (objectContainer == null) {
			return 0;
		}
		int value = 0;
		for (int id = 0; id < objectContainer.objectIds.length; id++) {
			if (objectContainer.objectIds[id] >= 0 && Node.objCount > objectContainer.objectIds[id]) {
				final ObjType objType = ObjType.list(objectContainer.objectIds[id]);
				if (objType.params != null) {
					final IntegerNode integerNode = (IntegerNode) objType.params.get(paramId);
					if (integerNode != null) {
						if (!multiplyByCount) {
							value += integerNode.value;
						} else {
							value += integerNode.value * objectContainer.objectCounts[id];
						}
					}
				}
			}
		}
		return value;
	}

	static final void fixWorldMapBounds() {
		if (ParticleManager.anInt2336 < 0) {
			ParticleManager.anInt2336 = 0;
			CanvasWrapper.anInt20 = -1;
			Class120_Sub2.anInt2422 = -1;
		}
		if (Class169.anInt1646 < 0) {
			Class169.anInt1646 = 0;
			CanvasWrapper.anInt20 = -1;
			Class120_Sub2.anInt2422 = -1;
		}
		if (ParticleManager.anInt2336 > WorldMapHandler.mapSizeX) {
			ParticleManager.anInt2336 = WorldMapHandler.mapSizeX;
			CanvasWrapper.anInt20 = -1;
			Class120_Sub2.anInt2422 = -1;
		}
		if (Class169.anInt1646 > WorldMapHandler.mapSizeY) {
			Class169.anInt1646 = WorldMapHandler.mapSizeY;
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
		SeqType.anInt349 = i_7_;
		Js5Request.anInt3940 = i;
		Class69.anInt614 = 10000;
		Class120_Sub14_Sub23.anInt3649 = i_8_;
		MasterIndexInfo.aClass50_476 = js5;
		StringNode.aBoolean2734 = bool;
		Class120_Sub12_Sub25.anInt3312 = 1;
	}

	static final void method1892() {
		if (Class120_Sub12_Sub21.aFloat3293 < 128.0F) {
			Class120_Sub12_Sub21.aFloat3293 = 128.0F;
		}
		final int i_9_ = Class69_Sub3_Sub1.playerRenderX >> 7;
		if (383.0F < Class120_Sub12_Sub21.aFloat3293) {
			Class120_Sub12_Sub21.aFloat3293 = 383.0F;
		}
		for (/**/; 2048.0F <= DummyOutputStream.aFloat28; DummyOutputStream.aFloat28 -= 2048.0F) {
			/* empty */
		}
		final int i_10_ = InterfaceListener.playerRenderZ >> 7;
		int i_11_ = 0;
		for (/**/; DummyOutputStream.aFloat28 < 0.0F; DummyOutputStream.aFloat28 += 2048.0F) {
			/* empty */
		}
		final int i_12_ = Class22.getTileHeight(Class69_Sub3_Sub1.playerRenderX, InterfaceListener.playerRenderZ, Class173.gameLevel);
		if (i_9_ > 3 && i_10_ > 3 && i_9_ < 100 && i_10_ < 100) {
			for (int i_13_ = i_9_ + -4; i_9_ + 4 >= i_13_; i_13_++) {
				for (int i_14_ = i_10_ + -4; 4 + i_10_ >= i_14_; i_14_++) {
					int i_15_ = Class173.gameLevel;
					if (i_15_ < 3 && (Class114.tileSettings[1][i_13_][i_14_] & 0x2) == 2) {
						i_15_++;
					}
					final int i_16_ = i_12_ - (OverridedJInterface.tileHeightMap[i_15_][i_13_][i_14_] - 8 * (Class114.aByteArrayArrayArray1094[i_15_][i_13_][i_14_] & 0xff));
					if (i_16_ > i_11_) {
						i_11_ = i_16_;
					}
				}
			}
		}
		int i_17_ = 192 * i_11_;
		if (i_17_ > 98048) {
			i_17_ = 98048;
		}
		if (i_17_ < 32768) {
			i_17_ = 32768;
		}
		if (i_17_ > Class26.anInt162) {
			Class26.anInt162 += (i_17_ + -Class26.anInt162) / 24;
		} else if (Class26.anInt162 > i_17_) {
			Class26.anInt162 += (i_17_ + -Class26.anInt162) / 80;
		}
	}

	static final void method1893(final int i, final int i_18_) {
		final GroundTile class120_sub18 = LabelGroup.groundTiles[0][i][i_18_];
		for (int i_19_ = 0; i_19_ < 3; i_19_++) {
			final GroundTile class120_sub18_20_ = LabelGroup.groundTiles[i_19_][i][i_18_] = LabelGroup.groundTiles[i_19_ + 1][i][i_18_];
			if (class120_sub18_20_ != null) {
				class120_sub18_20_.anInt2636--;
				for (int i_21_ = 0; i_21_ < class120_sub18_20_.anInt2638; i_21_++) {
					final Class28 class28 = class120_sub18_20_.aClass28Array2625[i_21_];
					if ((class28.bitPacked >> 29 & 0x3L) == 2L && class28.anInt180 == i && class28.anInt184 == i_18_) {
						class28.anInt177--;
					}
				}
			}
		}
		if (LabelGroup.groundTiles[0][i][i_18_] == null) {
			LabelGroup.groundTiles[0][i][i_18_] = new GroundTile(0, i, i_18_);
		}
		LabelGroup.groundTiles[0][i][i_18_].aClass120_Sub18_2644 = class120_sub18;
		LabelGroup.groundTiles[3][i][i_18_] = null;
	}

	public static void method1894() {
		aShortArray1214 = null;
		aClass50_1213 = null;
		aString1217 = null;
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
