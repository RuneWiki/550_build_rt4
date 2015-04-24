/* Class38 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class38 {
	static FileSystemWorker fileSystemWorker;
	static boolean cursorsEnabled = true;

	static final void handleMapFunctionAction(final int i_0_, final int i_1_, final int i_2_) {
		if (i_1_ == 1012) {
			Class112.method989(10, i_0_, i_2_);
		} else if (i_1_ == 1002) {
			Class112.method989(11, i_0_, i_2_);
		} else if (i_1_ == 1008) {
			Class112.method989(12, i_0_, i_2_);
		} else if (i_1_ == 1003) {
			Class112.method989(13, i_0_, i_2_);
		} else if (i_1_ == 1011) {
			Class112.method989(14, i_0_, i_2_);
		}
	}

	static final void method314(final int i, final int i_3_, final int i_4_) {
		for (int i_5_ = 0; i_5_ < MapSceneType.anInt1361; i_5_++) {
			for (int i_6_ = 0; i_6_ < WallDecoration.anInt1900; i_6_++) {
				for (int i_7_ = 0; i_7_ < Class120_Sub12_Sub38.anInt3440; i_7_++) {
					final GroundTile class120_sub18 = LabelGroup.groundTiles[i_5_][i_6_][i_7_];
					if (class120_sub18 != null) {
						final WallLocation class182 = class120_sub18.wallLocation;
						if (class182 != null && class182.aClass180_1800.method2268()) {
							InterfaceListener.method1170(class182.aClass180_1800, i_5_, i_6_, i_7_, 1, 1);
							if (class182.aClass180_1796 != null && class182.aClass180_1796.method2268()) {
								InterfaceListener.method1170(class182.aClass180_1796, i_5_, i_6_, i_7_, 1, 1);
								class182.aClass180_1800.method2267(class182.aClass180_1796, 0, 0, 0, false);
								class182.aClass180_1796 = class182.aClass180_1796.method2269(i, i_3_, i_4_);
							}
							class182.aClass180_1800 = class182.aClass180_1800.method2269(i, i_3_, i_4_);
						}
						for (int i_8_ = 0; i_8_ < class120_sub18.anInt2638; i_8_++) {
							final Class28 class28 = class120_sub18.aClass28Array2625[i_8_];
							if (class28 != null && class28.aClass180_174.method2268()) {
								InterfaceListener.method1170(class28.aClass180_174, i_5_, i_6_, i_7_, class28.anInt182 - class28.anInt180 + 1, class28.anInt175 - class28.anInt184 + 1);
								class28.aClass180_174 = class28.aClass180_174.method2269(i, i_3_, i_4_);
							}
						}
						final GroundDecoration class36 = class120_sub18.groundDecoration;
						if (class36 != null && class36.sceneGraphNode.method2268()) {
							GroundTile.method1668(class36.sceneGraphNode, i_5_, i_6_, i_7_);
							class36.sceneGraphNode = class36.sceneGraphNode.method2269(i, i_3_, i_4_);
						}
					}
				}
			}
		}
	}

	static final boolean method315(final int level) {
		if (Class120_Sub14_Sub10.landScapeAsLDSprite == null) {
			if (!HDToolkit.glEnabled && Class134.landscapeAsAbstractSprite != null) {
				Class120_Sub14_Sub10.landScapeAsLDSprite = (LDSprite) Class134.landscapeAsAbstractSprite;
			} else {
				Class120_Sub14_Sub10.landScapeAsLDSprite = new LDSprite(512, 512);
			}
			final int[] pixels = Class120_Sub14_Sub10.landScapeAsLDSprite.pixels;
			for (int id = 0; id < pixels.length; id++) {
				pixels[id] = 1;
			}
			for (int z = 1; z < 103; z++) {
				int pixelPos = (103 - z) * 512 * 4 + 24628;
				for (int x = 1; x < 103; x++) {
					if ((0x18 & Class114.tileSettings[level][x][z]) == 0) {
						Class120_Sub12_Sub6.pushTilesPixels(pixels, pixelPos, 512, x, z, level);
					}
					if (level < 3 && (Class114.tileSettings[level + 1][x][z] & 0x8) != 0) {
						Class120_Sub12_Sub6.pushTilesPixels(pixels, pixelPos, 512, x, z, level + 1);
					}
					pixelPos += 4;
				}
			}
			Class120_Sub24.mapFunctionCount = 0;
			for (int x = 0; x < 104; x++) {
				for (int z = 0; z < 104; z++) {
					long bitPacked = Class79_Sub1.getGroundDecorationUid(x, z, level);
					if (bitPacked == 0L) {
						bitPacked = Class120_Sub11.method1173(x, z, level);
					}
					if (bitPacked == 0L) {
						bitPacked = Class114.getWallLocationUid(x, z , level);
					}
					if (bitPacked == 0L) {
						bitPacked = JagexInterface.getWallDecorationUid(x, z, level);
					}
					if (bitPacked != 0L) {
						final LocType locType = LocType.list(0x7fffffff & (int) (bitPacked >>> 32));
						if (!locType.members || Class120_Sub12_Sub37.membersClient) {
							int mapFunctionId = locType.mapFunctionId;
							if (locType.childrenIDs != null) {
								for (int id = 0; id < locType.childrenIDs.length; id++) {
									if (locType.childrenIDs[id] != -1) {
										final LocType varpLocType = LocType.list(locType.childrenIDs[id]);
										if (varpLocType.mapFunctionId >= 0) {
											mapFunctionId = varpLocType.mapFunctionId;
										}
									}
								}
							}
							if (mapFunctionId >= 0) {
								boolean randomizePosition = false;
								final MapFunctionType mapFunctionType = MapFunctionType.list(mapFunctionId);
								int x2 = x;
								int z2 = z;
								if (mapFunctionType != null && mapFunctionType.randomizePosition) {
									randomizePosition = true;
								}
								if (randomizePosition) {
									final int[][] collisionFlags = WallLocation.collisionMaps[level].collisionFlags;
									for (int id = 0; id < 10; id++) {
										final int random = (int) (Math.random() * 4.0);
										if (random == 0 && x2 > 0 && x2 > x - 3 && (collisionFlags[x2 - 1][z2] & 0x2c0108) == 0) {
											x2--;
										}
										if (random == 1 && x2 < 103 && x2 < x + 3 && (collisionFlags[x2 + 1][z2] & 0x2c0180) == 0) {
											x2++;
										}
										if (random == 2 && z2 > 0 && z2 > z - 3 && (0x2c0102 & collisionFlags[x2][z2 - 1]) == 0) {
											z2--;
										}
										if (random == 3 && z2 < 103 && z2 < 3 + z && (collisionFlags[x2][z2 + 1] & 0x2c0120) == 0) {
											z2++;
										}
									}
								}
								Class7.mapFunctionLocIds[Class120_Sub24.mapFunctionCount] = locType.myId;
								MapFunctionType.mapFunctionXs[Class120_Sub24.mapFunctionCount] = x2;
								Class69_Sub2.mapFunctionZs[Class120_Sub24.mapFunctionCount] = z2;
								Class120_Sub24.mapFunctionCount++;
							}
						}
					}
				}
			}
		}
		Class120_Sub14_Sub10.landScapeAsLDSprite.method1617();
		final int whiteColor = 0xffffff;//-10 - (-238 + -(int) (20.0 * Math.random())) + (228 + (int) (20.0 * Math.random()) << 8) + (-10 + (int) (20.0 * Math.random()) + 238 << 16);
		final int redColor = 0xff0000;//-10 + (int) (Math.random() * 20.0) + 238 << 16;
		for (int z = 1; z < 103; z++) {
			for (int x = 1; x < 103; x++) {
				if ((Class114.tileSettings[level][x][z] & 0x18) == 0 && !Class190.method2504(x, z, level, 0, 0, whiteColor, redColor)) {
					if (HDToolkit.glEnabled) {
						GraphicsLD.pixels = null;
					} else {
						ClanMember.fullscreenGraphics.init2dCanvas();
					}
					return false;
				}
				if (level < 3 && (Class114.tileSettings[level + 1][x][z] & 0x8) != 0 && !Class190.method2504(x, z, level + 1, 0, 0, whiteColor, redColor)) {
					if (HDToolkit.glEnabled) {
						GraphicsLD.pixels = null;
					} else {
						ClanMember.fullscreenGraphics.init2dCanvas();
					}
					return false;
				}
			}
		}
		if (HDToolkit.glEnabled) {
			final int[] pixels = Class120_Sub14_Sub10.landScapeAsLDSprite.pixels;
			for (int id = 0; id < pixels.length; id++) {
				if (pixels[id] == 0) {
					pixels[id] = 1;
				}
			}
			Class134.landscapeAsAbstractSprite = new HDSprite(Class120_Sub14_Sub10.landScapeAsLDSprite);
		} else {
			Class134.landscapeAsAbstractSprite = Class120_Sub14_Sub10.landScapeAsLDSprite;
		}
		if (HDToolkit.glEnabled) {
			GraphicsLD.pixels = null;
		} else {
			ClanMember.fullscreenGraphics.init2dCanvas();
		}
		Class120_Sub14_Sub10.landScapeAsLDSprite = null;
		return true;
	}

	static final void method317(final int i, final int i_34_, final int i_35_, final int i_36_, final int i_37_, final int i_38_, final byte i_39_, final int i_40_, final int i_41_, final int i_42_) {
		try {
			Class120_Sub24 class120_sub24 = null;
			for (Class120_Sub24 class120_sub24_43_ = (Class120_Sub24) Class120_Sub4.aClass105_2439.getFront(); class120_sub24_43_ != null; class120_sub24_43_ = (Class120_Sub24) Class120_Sub4.aClass105_2439.getNext()) {
				if (i_34_ == class120_sub24_43_.anInt2722 && i_36_ == class120_sub24_43_.anInt2731 && class120_sub24_43_.anInt2725 == i_38_ && i_41_ == class120_sub24_43_.anInt2721) {
					class120_sub24 = class120_sub24_43_;
					break;
				}
			}
			if (class120_sub24 == null) {
				class120_sub24 = new Class120_Sub24();
				class120_sub24.anInt2725 = i_38_;
				class120_sub24.anInt2722 = i_34_;
				class120_sub24.anInt2721 = i_41_;
				class120_sub24.anInt2731 = i_36_;
				Class53.method457(class120_sub24, (byte) -112);
				Class120_Sub4.aClass105_2439.addLast(class120_sub24);
			}
			class120_sub24.anInt2732 = i_42_;
			class120_sub24.anInt2719 = i;
			class120_sub24.anInt2720 = i_37_;
			class120_sub24.anInt2717 = i_35_;
			class120_sub24.anInt2727 = i_40_;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("ee.E(").append(i).append(',').append(i_34_).append(',').append(i_35_).append(',').append(i_36_).append(',').append(i_37_).append(',').append(i_38_).append(',').append(i_39_).append(',').append(i_40_).append(',')
					.append(i_41_).append(',').append(i_42_).append(')').toString());
		}
	}
}
