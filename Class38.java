/* Class38 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class38 {
	static FileSystemWorker fileSystemWorker;
	static boolean cursorsEnabled = true;

	static final void handleMapFunctionAction(final int i_0_, final int i_1_, final int i_2_) {
		if (i_1_ == 1012) {//opworldmapelement1
			Class112.method989(10, i_0_, i_2_);
		} else if (i_1_ == 1002) {//opworldmapelement2
			Class112.method989(11, i_0_, i_2_);
		} else if (i_1_ == 1008) {//opworldmapelement3
			Class112.method989(12, i_0_, i_2_);
		} else if (i_1_ == 1003) {//opworldmapelement4
			Class112.method989(13, i_0_, i_2_);
		} else if (i_1_ == 1011) {//opworldmapelement5
			Class112.method989(14, i_0_, i_2_);
		}
	}

	static final void method314(final int lightX, final int lightY, final int lightZ) {
		for (int level = 0; level < MapSceneType.activeGroundTileLength; level++) {
			for (int x = 0; x < WallDecoration.mapSizeX; x++) {
				for (int z = 0; z < Class120_Sub12_Sub38.mapSizeZ; z++) {
					final GroundTile class120_sub18 = SeqFrameBase.activeGroundTiles[level][x][z];
					if (class120_sub18 != null) {
						final WallLocation class182 = class120_sub18.wallLocation;
						if (class182 != null && class182.aClass180_1800.method2268()) {
							InterfaceListener.method1170(class182.aClass180_1800, level, x, z, 1, 1);
							if (class182.aClass180_1796 != null && class182.aClass180_1796.method2268()) {
								InterfaceListener.method1170(class182.aClass180_1796, level, x, z, 1, 1);
								class182.aClass180_1800.method2267(class182.aClass180_1796, 0, 0, 0, false);
								class182.aClass180_1796 = class182.aClass180_1796.method2269(lightX, lightY, lightZ);
							}
							class182.aClass180_1800 = class182.aClass180_1800.method2269(lightX, lightY, lightZ);
						}
						for (int i_8_ = 0; i_8_ < class120_sub18.anInt2638; i_8_++) {
							final Class28 class28 = class120_sub18.aClass28Array2625[i_8_];
							if (class28 != null && class28.sceneGraphNode.method2268()) {
								InterfaceListener.method1170(class28.sceneGraphNode, level, x, z, class28.anInt182 - class28.anInt180 + 1, class28.anInt175 - class28.anInt184 + 1);
								class28.sceneGraphNode = class28.sceneGraphNode.method2269(lightX, lightY, lightZ);
							}
						}
						final GroundDecoration class36 = class120_sub18.groundDecoration;
						if (class36 != null && class36.sceneGraphNode.method2268()) {
							GroundTile.method1668(class36.sceneGraphNode, level, x, z);
							class36.sceneGraphNode = class36.sceneGraphNode.method2269(lightX, lightY, lightZ);
						}
					}
				}
			}
		}
	}

	static final boolean method315(final int level) {
		if (QuickChatMessageType.landScapeAsLDSprite == null) {
			if (!HDToolkit.glEnabled && Class134.landscapeAsAbstractSprite != null) {
				QuickChatMessageType.landScapeAsLDSprite = (LDSprite) Class134.landscapeAsAbstractSprite;
			} else {
				QuickChatMessageType.landScapeAsLDSprite = new LDSprite(512, 512);
			}
			final int[] pixels = QuickChatMessageType.landScapeAsLDSprite.pixels;
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
			CustomLocation.mapFunctionCount = 0;
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
							if (locType.transmogrificationIds != null) {
								for (int id = 0; id < locType.transmogrificationIds.length; id++) {
									if (locType.transmogrificationIds[id] != -1) {
										final LocType varpLocType = LocType.list(locType.transmogrificationIds[id]);
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
								client.mapFunctionLocIds[CustomLocation.mapFunctionCount] = locType.myId;
								MapFunctionType.mapFunctionXs[CustomLocation.mapFunctionCount] = x2;
								Class69_Sub2.mapFunctionZs[CustomLocation.mapFunctionCount] = z2;
								CustomLocation.mapFunctionCount++;
							}
						}
					}
				}
			}
		}
		QuickChatMessageType.landScapeAsLDSprite.init2dCanvas();
		final int whiteColor = 0xffffff;//-10 - (-238 + -(int) (20.0 * Math.random())) + (228 + (int) (20.0 * Math.random()) << 8) + (-10 + (int) (20.0 * Math.random()) + 238 << 16);
		final int redColor = 0xff0000;//-10 + (int) (Math.random() * 20.0) + 238 << 16;
		for (int z = 1; z < 103; z++) {
			for (int x = 1; x < 103; x++) {
				if ((Class114.tileSettings[level][x][z] & 0x18) == 0 && !Class190.pushMinimapPixels(x, z, level, 0, 0, whiteColor, redColor)) {
					if (HDToolkit.glEnabled) {
						GraphicsLD.pixels = null;
					} else {
						ClanMember.fullscreenGraphics.init2dCanvas();
					}
					return false;
				}
				if (level < 3 && (Class114.tileSettings[level + 1][x][z] & 0x8) != 0 && !Class190.pushMinimapPixels(x, z, level + 1, 0, 0, whiteColor, redColor)) {
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
			final int[] pixels = QuickChatMessageType.landScapeAsLDSprite.pixels;
			for (int id = 0; id < pixels.length; id++) {
				if (pixels[id] == 0) {
					pixels[id] = 1;
				}
			}
			Class134.landscapeAsAbstractSprite = new HDSprite(QuickChatMessageType.landScapeAsLDSprite);
		} else {
			Class134.landscapeAsAbstractSprite = QuickChatMessageType.landScapeAsLDSprite;
		}
		if (HDToolkit.glEnabled) {
			GraphicsLD.pixels = null;
		} else {
			ClanMember.fullscreenGraphics.init2dCanvas();
		}
		QuickChatMessageType.landScapeAsLDSprite = null;
		return true;
	}

	static final void spawnCustomLocation(final int id, final int level, final int rotation, final int x, final int playerCycle1, final int z, final int type, final int clientType, final int playerCycle2) {
		CustomLocation customLocation = null;
		for (CustomLocation customLocation_ = (CustomLocation) Class120_Sub4.customLocations.getFront(); customLocation_ != null; customLocation_ = (CustomLocation) Class120_Sub4.customLocations.getNext()) {
			if (customLocation_.level == level && customLocation_.x == x && customLocation_.z == z && customLocation_.clientType == clientType) {
				customLocation = customLocation_;
				break;
			}
		}
		if (customLocation == null) {
			customLocation = new CustomLocation();
			customLocation.z = z;
			customLocation.level = level;
			customLocation.clientType = clientType;
			customLocation.x = x;
			Class53.gatherOriginalLocationInfo(customLocation);
			Class120_Sub4.customLocations.addLast(customLocation);
		}
		customLocation.cycle2 = playerCycle2;
		customLocation.id = id;
		customLocation.cycle1 = playerCycle1;
		customLocation.rotation = rotation;
		customLocation.type = type;
	}
}
