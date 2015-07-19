/* Class164 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;

class Class164 {
	private Class120_Sub30 aClass120_Sub30_1583;
	private long aLong1584;
	static boolean forceTweenEnabled;
	int[] anIntArray1587;
	static long serverSessionKey = 0L;
	private boolean aBoolean1589 = false;
	static int minimapRandomaRotation = 0;
	private int anInt1591;
	private int anInt1592;
	private int anInt1593;
	int anInt1594;
	private final Class120_Sub30[] aClass120_Sub30Array1595;
	int anInt1596;
	private final Class120_Sub30[] aClass120_Sub30Array1597;
	private int anInt1598;
	private int anInt1599;
	private long aLong1600;
	private long aLong1601;
	private boolean aBoolean1602;

	static {
		forceTweenEnabled = false;
	}

	private final void method2129(final Class120_Sub30 class120_sub30, final int i) {
		final int i_1_ = i >> 5;
		final Class120_Sub30 class120_sub30_2_ = aClass120_Sub30Array1595[i_1_];
		if (class120_sub30_2_ == null) {
			aClass120_Sub30Array1597[i_1_] = class120_sub30;
		} else {
			class120_sub30_2_.aClass120_Sub30_2783 = class120_sub30;
		}
		aClass120_Sub30Array1595[i_1_] = class120_sub30;
		class120_sub30.anInt2781 = i;
	}

	private final void method2130(final int i_3_) {
		anInt1592 -= i_3_;
		if (anInt1592 < 0) {
			anInt1592 = 0;
		}
		if (aClass120_Sub30_1583 != null) {
			aClass120_Sub30_1583.method1731(i_3_);
		}
	}

	final void method2131() {
		aBoolean1602 = true;
	}

	static final void method2132(final int i, final int i_4_) {
		final InterfaceChangeNode class120_sub14_sub7 = InterfaceChangeNode.putInterfaceChange(7, i);
		class120_sub14_sub7.method1454();
		class120_sub14_sub7.anInt3484 = i_4_;
	}

	final synchronized void method2133() {
		if (!aBoolean1589) {
			final long l = TimeUtil.getSafeTime();
			try {
				if ((500000L + aLong1584 ^ 0xffffffffffffffffL) > (l ^ 0xffffffffffffffffL)) {
					aLong1584 = -500000L + l;
				}
				for (/**/; aLong1584 + 5000L < l; aLong1584 += 256000 / Class178.anInt1771) {
					method2130(256);
				}
			} catch (final Exception exception) {
				aLong1584 = l;
			}
			if (this.anIntArray1587 != null) {
				try {
					if (0L != aLong1601) {
						if ((l ^ 0xffffffffffffffffL) > (aLong1601 ^ 0xffffffffffffffffL)) {
							return;
						}
						method2134(this.anInt1596);
						aBoolean1602 = true;
						aLong1601 = 0L;
					}
					int i_5_ = method2137();
					if (anInt1599 < -i_5_ + anInt1593) {
						anInt1599 = -i_5_ + anInt1593;
					}
					int i_6_ = anInt1598 + this.anInt1594;
					if (256 + i_6_ > 16384) {
						i_6_ = 16128;
					}
					if (256 + i_6_ > this.anInt1596) {
						this.anInt1596 += 1024;
						i_5_ = 0;
						if (this.anInt1596 > 16384) {
							this.anInt1596 = 16384;
						}
						method2139();
						method2134(this.anInt1596);
						if (this.anInt1596 < 256 + i_6_) {
							i_6_ = -256 + this.anInt1596;
							anInt1598 = -this.anInt1594 + i_6_;
						}
						aBoolean1602 = true;
					}
					while (i_6_ > i_5_) {
						i_5_ += 256;
						method2147(this.anIntArray1587, 256);
						method2140();
					}
					if ((l ^ 0xffffffffffffffffL) < (aLong1600 ^ 0xffffffffffffffffL)) {
						if (aBoolean1602) {
							aBoolean1602 = false;
						} else {
							if (anInt1599 == 0 && anInt1591 == 0) {
								method2139();
								aLong1601 = l - -2000L;
								return;
							}
							anInt1598 = Math.min(anInt1591, anInt1599);
							anInt1591 = anInt1599;
						}
						anInt1599 = 0;
						aLong1600 = l + 2000L;
					}
					anInt1593 = i_5_;
				} catch (final Exception exception) {
					method2139();
					aLong1601 = l + 2000L;
				}
			}
		}
	}

	void method2134(final int i) throws Exception {
		/* empty */
	}

	static final void rebuildMap() {
		Class120_Sub12_Sub29.ping(false);
		AbstractBuffer.mapFilesMissingCount = 0;
		boolean fileExists = true;
		for (int id = 0; id < RuntimeException_Sub1.mapFilesBuffer.length; id++) {
			if (LookupTable.mapFileIds[id] != -1 && RuntimeException_Sub1.mapFilesBuffer[id] == null) {
				RuntimeException_Sub1.mapFilesBuffer[id] = Class65.mapsJs5.getFile(LookupTable.mapFileIds[id], 0);
				if (RuntimeException_Sub1.mapFilesBuffer[id] == null) {
					fileExists = false;
					AbstractBuffer.mapFilesMissingCount++;
				}
			}
			if (Class28.locationsMapFileIds[id] != -1 && Class134.locationMapFilesBuffer[id] == null) {
				Class134.locationMapFilesBuffer[id] = Class65.mapsJs5.getFileXTEA(0, Class28.locationsMapFileIds[id], Class125.anIntArrayArray2150[id]);
				if (Class134.locationMapFilesBuffer[id] == null) {
					fileExists = false;
					AbstractBuffer.mapFilesMissingCount++;
				}
			}
			if (HDToolkit.glEnabled) {
				if (Class111.underWaterMapFileIds[id] != -1 && Class120_Sub12_Sub36.underWaterMapFilesBuffer[id] == null) {
					Class120_Sub12_Sub36.underWaterMapFilesBuffer[id] = Class65.mapsJs5.getFile(Class111.underWaterMapFileIds[id], 0);
					if (Class120_Sub12_Sub36.underWaterMapFilesBuffer[id] == null) {
						fileExists = false;
						AbstractBuffer.mapFilesMissingCount++;
					}
				}
				if (client.underWaterLocationsMapFileIds[id] != -1 && Class101_Sub1.underWaterLocationsMapFilesBuffer[id] == null) {
					Class101_Sub1.underWaterLocationsMapFilesBuffer[id] = Class65.mapsJs5.getFile(client.underWaterLocationsMapFileIds[id], 0);
					if (Class101_Sub1.underWaterLocationsMapFilesBuffer[id] == null) {
						AbstractBuffer.mapFilesMissingCount++;
						fileExists = false;
					}
				}
			}
			if (ProducingGraphicsBuffer.npcSpawnsFileIds != null && Class179.npcSpawnsFilesBuffer[id] == null && ProducingGraphicsBuffer.npcSpawnsFileIds[id] != -1) {
				Class179.npcSpawnsFilesBuffer[id] = Class65.mapsJs5.getFileXTEA(0, ProducingGraphicsBuffer.npcSpawnsFileIds[id], Class125.anIntArrayArray2150[id]);
				if (Class179.npcSpawnsFilesBuffer[id] == null) {
					fileExists = false;
					AbstractBuffer.mapFilesMissingCount++;
				}
			}
		}
		if (SceneGraphNode.mapFunctionGroup == null) {
			if (Class120_Sub12_Sub6.aClass120_Sub14_Sub22_3174 == null || !Class120_Sub12_Sub24.aClass50_3309.method414(Class120_Sub12_Sub6.aClass120_Sub14_Sub22_3174.configName + "_labels")) {
				SceneGraphNode.mapFunctionGroup = new MapFunctionGroup(0);
			} else if (!Class120_Sub12_Sub24.aClass50_3309.allFilesComplete(Class120_Sub12_Sub6.aClass120_Sub14_Sub22_3174.configName + "_labels")) {
				AbstractBuffer.mapFilesMissingCount++;
				fileExists = false;
			} else {
				SceneGraphNode.mapFunctionGroup = Class54.createMapFunctionGroup(Class120_Sub12_Sub24.aClass50_3309, Class120_Sub12_Sub6.aClass120_Sub14_Sub22_3174.configName + "_labels", Class120_Sub12_Sub37.membersClient);
			}
		}
		if (!fileExists) {
			Class120_Sub12_Sub28.loadingScreenState = 1;
		} else {
			LightType.locationModelMissingCount = 0;
			fileExists = true;
			for (int i_8_ = 0; i_8_ < RuntimeException_Sub1.mapFilesBuffer.length; i_8_++) {
				byte[] is = Class134.locationMapFilesBuffer[i_8_];
				if (is != null) {
					int x = (Class120_Sub12_Sub36.regionBitPackeds[i_8_] >> 8) * 64 - GameEntity.currentBaseX;
					int z = (Class120_Sub12_Sub36.regionBitPackeds[i_8_] & 0xff) * 64 - LightType.currentBaseZ;
					if (Class134.dynamicMapRegion) {
						x = 10;
						z = 10;
					}
					fileExists &= Npc.method2349(z, x, is);
				}
				if (HDToolkit.glEnabled) {
					is = Class101_Sub1.underWaterLocationsMapFilesBuffer[i_8_];
					if (is != null) {
						int i_11_ = -GameEntity.currentBaseX + 64 * (Class120_Sub12_Sub36.regionBitPackeds[i_8_] >> 8);
						int i_12_ = -LightType.currentBaseZ + 64 * (Class120_Sub12_Sub36.regionBitPackeds[i_8_] & 0xff);
						if (Class134.dynamicMapRegion) {
							i_11_ = 10;
							i_12_ = 10;
						}
						fileExists &= Npc.method2349(i_12_, i_11_, is);
					}
				}
			}
			if (!fileExists) {
				Class120_Sub12_Sub28.loadingScreenState = 2;
			} else {
				boolean hasUnderWaterMap = false;
				if (Class120_Sub12_Sub28.loadingScreenState != 0) {
					Class120_Sub12_Sub21_Sub1.drawTextOnScreen(StringLibrary.loadingPleaseWait + "<br>(100%)", true);
				}
				Class120_Sub2.method1050();
				Class110.method976();
				if (HDToolkit.glEnabled && PacketBuffer.highWaterDetail) {
					for (int id = 0; id < RuntimeException_Sub1.mapFilesBuffer.length; id++) {
						if (Class101_Sub1.underWaterLocationsMapFilesBuffer[id] != null || Class120_Sub12_Sub36.underWaterMapFilesBuffer[id] != null) {
							hasUnderWaterMap = true;
							break;
						}
					}
				}
				Class3.method84(4, 104, 104, HDToolkit.glEnabled ? 28 : 25, hasUnderWaterMap);
				for (int i_15_ = 0; i_15_ < 4; i_15_++) {
					WallLocation.collisionMaps[i_15_].resetFlags();
				}
				for (int i_16_ = 0; i_16_ < 4; i_16_++) {
					for (int i_17_ = 0; i_17_ < 104; i_17_++) {
						for (int i_18_ = 0; i_18_ < 104; i_18_++) {
							Class114.tileSettings[i_16_][i_17_][i_18_] = (byte) 0;
						}
					}
				}
				AnimatedLocation.clearAmbientSounds(false);
				if (HDToolkit.glEnabled) {
					ShadowManager.shadowMapImage.method912();
					for (int x = 0; x < 13; x++) {
						for (int z = 0; z < 13; z++) {
							ShadowManager.shadows[x][z].outputToSprite = true;
						}
					}
				}
				if (HDToolkit.glEnabled) {
					LightManager.method1857();
				}
				if (HDToolkit.glEnabled) {
					Class187.setDefaultChunksAtmosphere();
				}
				Class120_Sub2.method1050();
				System.gc();
				Class120_Sub12_Sub29.ping(true);
				StructType.method1567(false);
				if (!Class134.dynamicMapRegion) {
					Class86.method729(false);
					Class120_Sub12_Sub29.ping(true);
					if (HDToolkit.glEnabled) {
						final int chunkX = TileParticleQueue.selfPlayer.walkQueueX[0] >> 3;
						final int chunkZ = TileParticleQueue.selfPlayer.walkQueueZ[0] >> 3;
						Class57.setLightPosition(chunkX, chunkZ);
					}
					Class120_Sub12_Sub21_Sub1.method1312(false);
					if (Class179.npcSpawnsFilesBuffer != null) {
						Class42.decodeNpcFiles();
					}
				}
				if (Class134.dynamicMapRegion) {
					AbstractRequest.method1542(false);
					Class120_Sub12_Sub29.ping(true);
					if (HDToolkit.glEnabled) {
						final int chunkX = TileParticleQueue.selfPlayer.walkQueueZ[0] >> 3;
						final int chunkZ = TileParticleQueue.selfPlayer.walkQueueX[0] >> 3;
						Class57.setLightPosition(chunkZ, chunkX);
					}
					Class112.method987(false);
				}
				Class110.method976();
				Class120_Sub12_Sub29.ping(true);
				Class120_Sub12_Sub28.method1344(WallLocation.collisionMaps, Class134.dynamicMapRegion ? Class120_Sub12_Sub36.anIntArrayArrayArray3420 : null, false);
				if (HDToolkit.glEnabled) {
					LightManager.method1869();
				}
				Class120_Sub12_Sub29.ping(true);
				int i_25_ = DummyOutputStream.anInt29;
				if (i_25_ > Class173.gameLevel) {
					i_25_ = Class173.gameLevel;
				}
				if (i_25_ < Class173.gameLevel - 1) {
					i_25_ = Class173.gameLevel - 1;
				}
				if (Class143_Sub1.allLevelsAreVisible()) {
					Class5.method98(0);
				} else {
					Class5.method98(DummyOutputStream.anInt29);
				}
				Class192.method2515();
				if (HDToolkit.glEnabled && hasUnderWaterMap) {
					Class178.setRenderTiles(true);
					StructType.method1567(true);
					if (!Class134.dynamicMapRegion) {
						Class86.method729(true);
						Class120_Sub12_Sub29.ping(true);
						Class120_Sub12_Sub21_Sub1.method1312(true);
					}
					if (Class134.dynamicMapRegion) {
						AbstractRequest.method1542(true);
						Class120_Sub12_Sub29.ping(true);
						Class112.method987(true);
					}
					Class110.method976();
					Class120_Sub12_Sub29.ping(true);
					Class120_Sub12_Sub28.method1344(WallLocation.collisionMaps, Class134.dynamicMapRegion ? Class120_Sub12_Sub36.anIntArrayArrayArray3420 : null, true);
					Class120_Sub12_Sub29.ping(true);
					Class192.method2515();
					Class178.setRenderTiles(false);
				}
				if (HDToolkit.glEnabled) {
					for (int chunkX = 0; chunkX < 13; chunkX++) {
						for (int chunkZ = 0; chunkZ < 13; chunkZ++) {
							ShadowManager.shadows[chunkX][chunkZ].method778(OverridedJInterface.activeTileHeightMap[0], chunkX * 8, chunkZ * 8);
						}
					}
				}
				for (int x = 0; x < 104; x++) {
					for (int z = 0; z < 104; z++) {
						Class5.spawnGroundObject(x, z);
					}
				}
				Class57.method492();
				Class120_Sub2.method1050();
				Class120_Sub12_Sub21_Sub1.method1316();
				Class110.method976();
				Class93.aBoolean870 = false;
				if (HDToolkit.glEnabled) {
					Class101.refreshAtmosphere(true);
				}
				if (Class112.frame != null && AbstractTimer.worldConnection != null && Class109.gameState == 25) {
					Class120_Sub12_Sub11.outputStream.putByteIsaac(236);
					Class120_Sub12_Sub11.outputStream.putInt(1057001181);
				}
				if (!Class134.dynamicMapRegion) {
					final int i_30_ = (Class116.anInt1118 - 6) / 8;
					final int i_31_ = (Class116.anInt1118 + 6) / 8;
					final int i_32_ = (Class3.anInt53 - 6) / 8;
					final int i_33_ = (Class3.anInt53 + 6) / 8;
					for (int i_34_ = i_30_ + -1; i_34_ <= 1 + i_31_; i_34_++) {
						for (int i_35_ = -1 + i_32_; 1 + i_33_ >= i_35_; i_35_++) {
							if (i_34_ < i_30_ || i_34_ > i_31_ || i_35_ < i_32_ || i_33_ < i_35_) {
								Class65.mapsJs5.method427("m" + i_34_ + "_" + i_35_);
								Class65.mapsJs5.method427("l" + i_34_ + "_" + i_35_);
							}
						}
					}
				}
				if (Class109.gameState == 28) {
					ProjectileNode.setGameState(10);
				} else {
					ProjectileNode.setGameState(30);
					if (AbstractTimer.worldConnection != null) {
						Class120_Sub12_Sub11.outputStream.putByteIsaac(113);
					}
				}
				Decimator.method2221();
				Class120_Sub2.method1050();
				Class69.method613();
			}
		}
	}

	final synchronized void method2136() {
		if (Class90.aClass82_850 != null) {
			boolean bool = true;
			for (int i_36_ = 0; i_36_ < 2; i_36_++) {
				if (this == Class90.aClass82_850.aClass164Array782[i_36_]) {
					Class90.aClass82_850.aClass164Array782[i_36_] = null;
				}
				if (Class90.aClass82_850.aClass164Array782[i_36_] != null) {
					bool = false;
				}
			}
			if (bool) {
				Class90.aClass82_850.aBoolean780 = true;
				while (Class90.aClass82_850.aBoolean784) {
					PacketBuffer.sleepWrapper(50L);
				}
				Class90.aClass82_850 = null;
			}
		}
		method2139();
		aBoolean1589 = true;
		this.anIntArray1587 = null;
	}

	int method2137() throws Exception {
		return this.anInt1596;
	}

	static final LDIndexedSprite constructLDIndexedSprite(final js5 js5, final int group, final int file) {
		if (!Class10.decodedSprites(js5, group, file)) {
			return null;
		}
		return Class120_Sub12_Sub20.constructLDIndexedSprite();
	}

	void method2139() {
		/* empty */
	}

	void method2140() throws Exception {
		/* empty */
	}

	void method2141(final Component component) throws Exception {
		/* empty */
	}

	static final void cameraLeft() {
		if (!Class188.aBoolean1925) {
			Class118.sendCameraPacket = true;
			if (!Class134.updateCameraFromCs2) {
				Class120_Sub15.cameraYawWrapper -= (Class120_Sub15.cameraYawWrapper + 24.0F) / 2.0F;
			} else {
				DummyOutputStream.cameraYaw = (int) DummyOutputStream.cameraYaw - 65 & ~0x7f;
			}
			Class188.aBoolean1925 = true;
		}
	}

	final synchronized void method2143(final Class120_Sub30 class120_sub30) {
		aClass120_Sub30_1583 = class120_sub30;
	}

	final synchronized void method2144() {
		aBoolean1602 = true;
		try {
			method2146();
		} catch (final Exception exception) {
			method2139();
			aLong1601 = TimeUtil.getSafeTime() + 2000L;
		}
	}

	static final void drawMinimapContents(final JagexInterface jagexInterface, final int interfaceX, final int interfaceY, final int redrawId) {
		Class120_Sub2.method1050();
		if (HDToolkit.glEnabled) {
			GraphicsHD.clipRect(interfaceX, interfaceY, interfaceX + jagexInterface.width, interfaceY + jagexInterface.height);
		} else {
			GraphicsLD.clipRect(interfaceX, interfaceY, interfaceX + jagexInterface.width, interfaceY + jagexInterface.height);
		}
		if (AbstractGraphicsBuffer.mapbackState == 2 || AbstractGraphicsBuffer.mapbackState == 5 || Class134.landscapeAsAbstractSprite == null) {
			if (HDToolkit.glEnabled) {
				final AbstractSprite abstractSprite = jagexInterface.constructSpriteFromId(false);
				if (abstractSprite != null) {
					abstractSprite.drawReg(interfaceX, interfaceY);
				}
			} else {
				GraphicsLD.fillPixels(interfaceX, interfaceY, 0, jagexInterface.startOfSpriteLookupTable, jagexInterface.lengthOfSpriteLookupTable);
			}
		} else {
			final int rotation = (int) DummyOutputStream.cameraYaw & 0x7ff;
			final int spriteX = 48 + (TileParticleQueue.selfPlayer.x / 32);
			final int spriteY = 464 - (TileParticleQueue.selfPlayer.z / 32);
			if (HDToolkit.glEnabled) {
				((HDSprite) Class134.landscapeAsAbstractSprite).method1600(interfaceX, interfaceY, jagexInterface.width, jagexInterface.height, spriteX, spriteY, rotation, 256, (HDSprite) jagexInterface.constructSpriteFromId(false));
			} else {
				((LDSprite) Class134.landscapeAsAbstractSprite).method1606(interfaceX, interfaceY, jagexInterface.width, jagexInterface.height, spriteX, spriteY, rotation, 256, jagexInterface.startOfSpriteLookupTable, jagexInterface.lengthOfSpriteLookupTable);
			}
			if (SceneGraphNode.mapFunctionGroup != null) {
				for (int id = 0; id < SceneGraphNode.mapFunctionGroup.length; id++) {
					if (SceneGraphNode.mapFunctionGroup.nodes[id] != null && SceneGraphNode.mapFunctionGroup.coordinates[id] >> 28 == Class173.gameLevel) {
						final int functionX = (SceneGraphNode.mapFunctionGroup.coordinates[id] >> 14 & 0x3fff) - GameEntity.currentBaseX;
						final int functionY = (SceneGraphNode.mapFunctionGroup.coordinates[id] & 0x3fff) - LightType.currentBaseZ;
						if (functionX >= 0 && functionX < 104 && functionY >= 0 && functionY < 104) {
							final int iconX = functionX * 4 - (TileParticleQueue.selfPlayer.x / 32) + 2;
							final int iconY = functionY * 4 - (TileParticleQueue.selfPlayer.z / 32) + 2;
							Js5Request.drawMapFunctionOnMinimap(jagexInterface, SceneGraphNode.mapFunctionGroup.nodes[id].id, interfaceX, interfaceY, iconX, iconY);
						}
					}
				}
			}
			for (int id = 0; id < Class120_Sub24.mapFunctionCount; id++) {
				final int mapFunctionX = (MapFunctionType.mapFunctionXs[id] * 4) - (TileParticleQueue.selfPlayer.x / 32) + 2;
				final int mapFunctionY = (Class69_Sub2.mapFunctionZs[id] * 4) - (TileParticleQueue.selfPlayer.z / 32) + 2;
				LocType locType = LocType.list(client.mapFunctionLocIds[id]);
				if (locType.transmogrificationIds != null) {
					locType = locType.handleVarp();
					if (locType == null || locType.mapFunctionId == -1) {
						continue;
					}
				}
				Js5Request.drawMapFunctionOnMinimap(jagexInterface, locType.mapFunctionId, interfaceX, interfaceY, mapFunctionX, mapFunctionY);
			}
			for (int x = 0; x < 104; x++) {
				for (int z = 0; z < 104; z++) {
					final Deque deque = ClientScript.groundObjects[Class173.gameLevel][x][z];
					if (deque != null) {
						final int iconX = (x * 4) - (TileParticleQueue.selfPlayer.x / 32) + 2;
						final int iconY = (z * 4) - (TileParticleQueue.selfPlayer.z / 32) + 2;
						client.drawSpriteOnMinimap(jagexInterface, interfaceX, interfaceY, iconX, iconY, Class120_Sub12_Sub6.mapDotSprites[0]);
					}
				}
			}
			for (int id = 0; id < Class148.localNpcCount; id++) {
				final Npc npc = Class120_Sub12_Sub11.npcList[Class120_Sub12_Sub36.npcIndices[id]];
				if (npc != null && npc.isVisible()) {
					NpcType npcType = npc.npcType;
					if (npcType != null && npcType.transmogrificationIds != null) {
						npcType = npcType.handleVarp();
					}
					if (npcType != null && npcType.displayOnMinimap && npcType.canRightClick) {
						final int npcX = (npc.x / 32) - (TileParticleQueue.selfPlayer.x / 32);
						final int npcY = (npc.z / 32) - (TileParticleQueue.selfPlayer.z / 32);
						if (npcType.mapFunctionId != -1) {
							Js5Request.drawMapFunctionOnMinimap(jagexInterface, npcType.mapFunctionId, interfaceX, interfaceY, npcX, npcY);
						} else {
							client.drawSpriteOnMinimap(jagexInterface, interfaceX, interfaceY, npcX, npcY, Class120_Sub12_Sub6.mapDotSprites[1]);
						}
					}
				}
			}
			for (int id = 0; id < FileSystemWorker.localPlayerCount; id++) {
				final Player player = Class118.playersList[Class112.playerIndices[id]];
				if (player != null && player.isVisible()) {
					final int playerX = (player.x / 32) - (TileParticleQueue.selfPlayer.x / 32);
					final int playerY = (player.z / 32) - (TileParticleQueue.selfPlayer.z / 32);
					boolean isFriend = false;
					final long nameAsLong = Varp.stringToLong(player.name);
					for (int friendId = 0; friendId < ProducingGraphicsBuffer.friendCount; friendId++) {
						if (nameAsLong == AbstractSprite.friendsNameAsLong[friendId] && Class120_Sub12_Sub16.friendsWorld[friendId] != 0) {
							isFriend = true;
							break;
						}
					}
					boolean isClanM8 = false;
					for (int clanId = 0; clanId < Class120_Sub14_Sub13.clanMembersAmount; clanId++) {
						if (ReflectionCheckNode.clanMembers[clanId].uid == nameAsLong) {
							isClanM8 = true;
							break;
						}
					}
					boolean isTeam = false;
					if (TileParticleQueue.selfPlayer.team != 0 && player.team != 0 && TileParticleQueue.selfPlayer.team == player.team) {
						isTeam = true;
					}
					if (isFriend) {
						client.drawSpriteOnMinimap(jagexInterface, interfaceX, interfaceY, playerX, playerY, Class120_Sub12_Sub6.mapDotSprites[3]);
					} else if (isClanM8) {
						client.drawSpriteOnMinimap(jagexInterface, interfaceX, interfaceY, playerX, playerY, Class120_Sub12_Sub6.mapDotSprites[5]);
					} else if (isTeam) {
						client.drawSpriteOnMinimap(jagexInterface, interfaceX, interfaceY, playerX, playerY, Class120_Sub12_Sub6.mapDotSprites[4]);
					} else {
						client.drawSpriteOnMinimap(jagexInterface, interfaceX, interfaceY, playerX, playerY, Class120_Sub12_Sub6.mapDotSprites[2]);
					}
				}
			}
			for (final HintIcon hintIcon : Class187.hintIcons) {
				if (hintIcon != null && hintIcon.targetType != 0 && Class101_Sub2.loopCycle % 20 < 10) {
					if (hintIcon.targetType == 1 && hintIcon.targetIndex >= 0 && hintIcon.targetIndex < Class120_Sub12_Sub11.npcList.length) {
						final Npc npc = Class120_Sub12_Sub11.npcList[hintIcon.targetIndex];
						if (npc != null) {
							final int targetX = npc.x / 32 - TileParticleQueue.selfPlayer.x / 32;
							final int targetY = npc.z / 32 - TileParticleQueue.selfPlayer.z / 32;
							SkyboxType.drawHintIconOnMinimap(jagexInterface, 360000, interfaceX, targetY, interfaceY, targetX, hintIcon.iconType);
						}
					}
					if (hintIcon.targetType == 2) {
						final int targetX = (hintIcon.x - GameEntity.currentBaseX) * 4 - TileParticleQueue.selfPlayer.x / 32 + 2;
						final int targetY = (hintIcon.z - LightType.currentBaseZ) * 4 - TileParticleQueue.selfPlayer.z / 32 + 2;
						int showDistance = hintIcon.showDistance * 4;
						showDistance *= showDistance;
						SkyboxType.drawHintIconOnMinimap(jagexInterface, showDistance, interfaceX, targetY, interfaceY, targetX, hintIcon.iconType);
					}
					if (hintIcon.targetType == 10 && hintIcon.targetIndex >= 0 && hintIcon.targetIndex < Class118.playersList.length) {
						final Player player = Class118.playersList[hintIcon.targetIndex];
						if (player != null) {
							final int targetX = player.x / 32 - TileParticleQueue.selfPlayer.x / 32;
							final int targetY = player.z / 32 - TileParticleQueue.selfPlayer.z / 32;
							SkyboxType.drawHintIconOnMinimap(jagexInterface, 360000, interfaceX, targetY, interfaceY, targetX, hintIcon.iconType);
						}
					}
				}
			}
			if (Class120_Sub12_Sub26.flagX != 0) {
				int flagX = Class120_Sub12_Sub26.flagX;
				int flagY = Class65.flagY;
				final int x = flagX * 4 - TileParticleQueue.selfPlayer.x / 32 + 2 - 2 + (TileParticleQueue.selfPlayer.getSize() * 2);
				final int y = flagY * 4 - TileParticleQueue.selfPlayer.z / 32 + 2 - 2 + (TileParticleQueue.selfPlayer.getSize() * 2);
				client.drawSpriteOnMinimap(jagexInterface, interfaceX, interfaceY, x, y, Class101_Sub1.mapFlagSprites[SceneGroundObject.packetSetFlagPosition ? 1 : 0]);
			}
			if (!HDToolkit.glEnabled) {
				GraphicsLD.fillRect(interfaceX + jagexInterface.width / 2 - 1, interfaceY + jagexInterface.height / 2 - 1, 3, 3, 16777215);
			} else {
				GraphicsHD.fillRect(interfaceX + jagexInterface.width / 2 - 1, interfaceY + jagexInterface.height / 2 - 1, 3, 3, 16777215);
			}
		}
		Class120_Sub12_Sub33.needScreenRedraw[redrawId] = true;
	}

	void method2146() throws Exception {
		/* empty */
	}

	private final void method2147(final int[] is, final int i) {
		int i_76_ = i;
		if (Class90.aBoolean846) {
			i_76_ <<= 1;
		}
		ArrayUtils.resetArray(is, 0, i_76_);
		anInt1592 -= i;
		if (aClass120_Sub30_1583 != null && anInt1592 <= 0) {
			anInt1592 += Class178.anInt1771 >> 4;
			Class49.method409(aClass120_Sub30_1583);
			method2129(aClass120_Sub30_1583, aClass120_Sub30_1583.method1733());
			int i_77_ = 0;
			int i_78_ = 255;
			int i_79_ = 7;
			while_121_: while (i_78_ != 0) {
				int i_80_;
				int i_81_;
				if (i_79_ < 0) {
					i_80_ = i_79_ & 0x3;
					i_81_ = -(i_79_ >> 2);
				} else {
					i_80_ = i_79_;
					i_81_ = 0;
				}
				for (int i_82_ = i_78_ >>> i_80_ & 0x11111111; i_82_ != 0; i_82_ >>>= 4) {
					if ((i_82_ & 0x1) != 0) {
						i_78_ &= 1 << i_80_ ^ 0xffffffff;
						Class120_Sub30 class120_sub30 = null;
						Class120_Sub30 class120_sub30_83_ = aClass120_Sub30Array1597[i_80_];
						while (class120_sub30_83_ != null) {
							final Class120_Sub5 class120_sub5 = class120_sub30_83_.aClass120_Sub5_2782;
							if (class120_sub5 != null && class120_sub5.anInt2442 > i_81_) {
								i_78_ |= 1 << i_80_;
								class120_sub30 = class120_sub30_83_;
								class120_sub30_83_ = class120_sub30_83_.aClass120_Sub30_2783;
							} else {
								class120_sub30_83_.aBoolean2784 = true;
								final int i_84_ = class120_sub30_83_.method1732();
								i_77_ += i_84_;
								if (class120_sub5 != null) {
									class120_sub5.anInt2442 += i_84_;
								}
								if (i_77_ >= 32) {
									break while_121_;
								}
								Class120_Sub30 class120_sub30_85_ = class120_sub30_83_.method1736();
								if (class120_sub30_85_ != null) {
									final int i_86_ = class120_sub30_83_.anInt2781;
									for (/**/; class120_sub30_85_ != null; class120_sub30_85_ = class120_sub30_83_.method1735()) {
										method2129(class120_sub30_85_, i_86_ * class120_sub30_85_.method1733() >> 8);
									}
								}
								final Class120_Sub30 class120_sub30_87_ = class120_sub30_83_.aClass120_Sub30_2783;
								class120_sub30_83_.aClass120_Sub30_2783 = null;
								if (class120_sub30 == null) {
									aClass120_Sub30Array1597[i_80_] = class120_sub30_87_;
								} else {
									class120_sub30.aClass120_Sub30_2783 = class120_sub30_87_;
								}
								if (class120_sub30_87_ == null) {
									aClass120_Sub30Array1595[i_80_] = class120_sub30;
								}
								class120_sub30_83_ = class120_sub30_87_;
							}
						}
					}
					i_80_ += 4;
					i_81_++;
				}
				i_79_--;
			}
			for (i_79_ = 0; i_79_ < 8; i_79_++) {
				Class120_Sub30 class120_sub30 = aClass120_Sub30Array1597[i_79_];
				aClass120_Sub30Array1597[i_79_] = aClass120_Sub30Array1595[i_79_] = null;
				Class120_Sub30 class120_sub30_88_;
				for (/**/; class120_sub30 != null; class120_sub30 = class120_sub30_88_) {
					class120_sub30_88_ = class120_sub30.aClass120_Sub30_2783;
					class120_sub30.aClass120_Sub30_2783 = null;
				}
			}
		}
		if (anInt1592 < 0) {
			anInt1592 = 0;
		}
		if (aClass120_Sub30_1583 != null) {
			aClass120_Sub30_1583.method1734(is, 0, i);
		}
		aLong1584 = TimeUtil.getSafeTime();
	}

	public Class164() {
		aLong1584 = TimeUtil.getSafeTime();
		anInt1593 = 0;
		anInt1591 = 0;
		anInt1592 = 0;
		aClass120_Sub30Array1597 = new Class120_Sub30[8];
		anInt1599 = 0;
		aClass120_Sub30Array1595 = new Class120_Sub30[8];
		aLong1601 = 0L;
		aBoolean1602 = true;
		aLong1600 = 0L;
	}
}
