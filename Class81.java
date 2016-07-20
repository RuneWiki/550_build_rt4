/* Class81 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class81 {
	static Hashtable aClass75_777;
	static int nameiconsId;
	static int[] soundEffectDelays = new int[50];

	static final String getCombatLevelDifferenceColor(final int selfLevel, final int opponentLevel) {
		final int levelDelta = selfLevel - opponentLevel;
		if (levelDelta < -9) {
			return "<col=ff0000>";
		}
		if (levelDelta < -6) {
			return "<col=ff3000>";
		}
		if (levelDelta < -3) {
			return "<col=ff7000>";
		}
		if (levelDelta < 0) {
			return "<col=ffb000>";
		}
		if (levelDelta > 9) {
			return "<col=00ff00>";
		}
		if (levelDelta > 6) {
			return "<col=40ff00>";
		}
		if (levelDelta > 3) {
			return "<col=80ff00>";
		}
		if (levelDelta > 0) {
			return "<col=c0ff00>";
		}
		return "<col=ffff00>";
	}

	static final void loadWorldMap() {
		if (WorldMapHandler.aClass120_Sub14_Sub22_691 != null) {
			if (Class90.laodingStage < 10) {
				if (!WorldMapHandler.aClass50_689.allFilesComplete(WorldMapHandler.aClass120_Sub14_Sub22_691.configName)) {
					Class90.laodingStage = Class120_Sub12_Sub24.worldMapJs5.getCompletion(WorldMapHandler.aClass120_Sub14_Sub22_691.configName) / 10;
					return;
				}
				Class120_Sub12_Sub25.method1332();
				Class90.laodingStage = 10;
			}
			if (Class90.laodingStage == 10) {
				WorldMapHandler.anInt695 = WorldMapHandler.aClass120_Sub14_Sub22_691.anInt3632 >> 6 << 6;
				WorldMapHandler.mapSizeX = -WorldMapHandler.anInt695 + (WorldMapHandler.aClass120_Sub14_Sub22_691.anInt3642 >> 6 << 6) + 64;
				WorldMapHandler.anInt694 = WorldMapHandler.aClass120_Sub14_Sub22_691.anInt3636 >> 6 << 6;
				final int[] is = new int[3];
				WorldMapHandler.mapSizeY = -WorldMapHandler.anInt694 + (WorldMapHandler.aClass120_Sub14_Sub22_691.anInt3644 >> 6 << 6) + 64;
				int i_3_ = -1;
				int i_4_ = -1;
				if (WorldMapHandler.aClass120_Sub14_Sub22_691.method1630(LightType.currentBaseZ + (TileParticleQueue.selfPlayer.z >> 7), Class173.gameLevel, is, (TileParticleQueue.selfPlayer.x >> 7) + GameEntity.currentBaseX)) {
					i_4_ = is[1] - WorldMapHandler.anInt695;
					i_3_ = -is[2] + WorldMapHandler.anInt694 + -1 + WorldMapHandler.mapSizeY;
				}
				if (!JagexSocket.aBoolean423 && i_4_ >= 0 && WorldMapHandler.mapSizeX > i_4_ && i_3_ >= 0 && WorldMapHandler.mapSizeY > i_3_) {
					i_3_ += (int) (Math.random() * 10.0) - 5;
					ModelParticleMagnet.anInt1646 = i_3_;
					i_4_ += -5 + (int) (Math.random() * 10.0);
					ParticleEmitter.anInt2336 = i_4_;
				} else if (Class120_Sub12_Sub33.anInt3407 != -1 && Class86.anInt818 != -1) {
					WorldMapHandler.aClass120_Sub14_Sub22_691.method1632(is, Class86.anInt818, Class120_Sub12_Sub33.anInt3407);
					Class120_Sub12_Sub33.anInt3407 = Class86.anInt818 = -1;
					JagexSocket.aBoolean423 = false;
					if (is != null) {
						ModelParticleMagnet.anInt1646 = -1 + WorldMapHandler.mapSizeY - is[2] - -WorldMapHandler.anInt694;
						ParticleEmitter.anInt2336 = is[1] + -WorldMapHandler.anInt695;
					}
				} else {
					WorldMapHandler.aClass120_Sub14_Sub22_691.method1632(is, 0x3fff & WorldMapHandler.aClass120_Sub14_Sub22_691.anInt3633, 0x3fff & WorldMapHandler.aClass120_Sub14_Sub22_691.anInt3633 >> 14);
					ModelParticleMagnet.anInt1646 = WorldMapHandler.anInt694 - (is[2] - (-1 + WorldMapHandler.mapSizeY));
					ParticleEmitter.anInt2336 = -WorldMapHandler.anInt695 + is[1];
				}
				if (WorldMapHandler.aClass120_Sub14_Sub22_691.zoom == 37) {
					WorldMapHandler.wantedZoom = WorldMapHandler.currentZoom = 3.0F;
				} else if (WorldMapHandler.aClass120_Sub14_Sub22_691.zoom == 50) {
					WorldMapHandler.wantedZoom = WorldMapHandler.currentZoom = 4.0F;
				} else if (WorldMapHandler.aClass120_Sub14_Sub22_691.zoom == 75) {
					WorldMapHandler.wantedZoom = WorldMapHandler.currentZoom = 6.0F;
				} else if (WorldMapHandler.aClass120_Sub14_Sub22_691.zoom == 100) {
					WorldMapHandler.wantedZoom = WorldMapHandler.currentZoom = 8.0F;
				} else if (WorldMapHandler.aClass120_Sub14_Sub22_691.zoom == 200) {
					WorldMapHandler.wantedZoom = WorldMapHandler.currentZoom = 16.0F;
				} else {
					WorldMapHandler.wantedZoom = WorldMapHandler.currentZoom = 8.0F;
				}
				Class127.fixWorldMapBounds();
				final int i_5_ = WorldMapHandler.mapSizeX >> 6;
				final int i_6_ = WorldMapHandler.mapSizeY >> 6;
				WorldMapHandler.overlayColors = new int[1 + OverlayType.overlayAmount];
				WorldMapHandler.aByteArrayArrayArray706 = new byte[i_5_][i_6_][];
				WorldMapHandler.mapscenesLoc = new int[i_5_][i_6_][];
				WorldMapHandler.wallsLoc = new byte[i_5_][i_6_][];
				WorldMapHandler.aByteArrayArrayArray710 = new byte[i_5_][i_6_][];
				WorldMapHandler.underlayColors = new int[i_5_][i_6_][];
				WorldMapHandler.aByteArrayArrayArray703 = new byte[i_5_][i_6_][];
				WorldMapHandler.aByteArrayArrayArray711 = new byte[i_5_][i_6_][];
				MapFunctionType.aClass105_653 = new Deque();
				Class22.aClass127_130 = new Class127();
				WorldMapHandler.setupOverlayColors();
				Class43.resetMapFunctionCache(1024, 256);
				MasterIndexInfo.resetVarBit(256);
				Class90.laodingStage = 20;
			} else if (Class90.laodingStage == 20) {
				WorldMapHandler.decodeUnderlay(new Buffer(WorldMapHandler.aClass50_689.method428("underlay", WorldMapHandler.aClass120_Sub14_Sub22_691.configName)));
				Class90.laodingStage = 30;
				Class120_Sub12_Sub29.ping(true);
				Class69.method613();
			} else if (Class90.laodingStage == 30) {
				WorldMapHandler.decodeOverlay(new Buffer(WorldMapHandler.aClass50_689.method428("overlay", WorldMapHandler.aClass120_Sub14_Sub22_691.configName)));
				Class90.laodingStage = 40;
				Class69.method613();
			} else if (Class90.laodingStage == 40) {
				WorldMapHandler.decodeOverlay2(new Buffer(WorldMapHandler.aClass50_689.method428("overlay2", WorldMapHandler.aClass120_Sub14_Sub22_691.configName)));
				Class90.laodingStage = 50;
				Class69.method613();
			} else if (Class90.laodingStage == 50) {
				WorldMapHandler.decodeLoc(new Buffer(WorldMapHandler.aClass50_689.method428("loc", WorldMapHandler.aClass120_Sub14_Sub22_691.configName)), Class120_Sub12_Sub37.membersClient);
				Class90.laodingStage = 60;
				Class120_Sub12_Sub29.ping(true);
				Class69.method613();
			} else if (Class90.laodingStage == 60) {
				if (!WorldMapHandler.aClass50_689.method414(new StringBuilder(WorldMapHandler.aClass120_Sub14_Sub22_691.configName).append("_labels").toString())) {
					WorldMapHandler.aClass137_693 = new MapFunctionGroup(0);
				} else {
					if (!WorldMapHandler.aClass50_689.allFilesComplete(new StringBuilder(WorldMapHandler.aClass120_Sub14_Sub22_691.configName).append("_labels").toString())) {
						return;
					}
					WorldMapHandler.aClass137_693 = Class54.createMapFunctionGroup(WorldMapHandler.aClass50_689, new StringBuilder(WorldMapHandler.aClass120_Sub14_Sub22_691.configName).append("_labels").toString(), Class120_Sub12_Sub37.membersClient);
				}
				WorldMapHandler.method682();
				Class90.laodingStage = 70;
				Class69.method613();
			} else if (Class90.laodingStage == 70) {
				PlayerAppearance.aClass98_1373 = new WorldMapFont(11, true, Node.canvas);
				Class90.laodingStage = 73;
				Class120_Sub12_Sub29.ping(true);
				Class69.method613();
			} else if (Class90.laodingStage == 73) {
				Class92.aClass98_863 = new WorldMapFont(12, true, Node.canvas);
				Class90.laodingStage = 76;
				Class120_Sub12_Sub29.ping(true);
				Class69.method613();
			} else if (Class90.laodingStage == 76) {
				Class112.aClass98_1070 = new WorldMapFont(14, true, Node.canvas);
				Class90.laodingStage = 79;
				Class120_Sub12_Sub29.ping(true);
				Class69.method613();
			} else if (Class90.laodingStage == 79) {
				Class110.aClass98_1052 = new WorldMapFont(17, true, Node.canvas);
				Class90.laodingStage = 82;
				Class120_Sub12_Sub29.ping(true);
				Class69.method613();
			} else if (Class90.laodingStage == 82) {
				FileSystemRequest.aClass98_3929 = new WorldMapFont(19, true, Node.canvas);
				Class90.laodingStage = 85;
				Class120_Sub12_Sub29.ping(true);
				Class69.method613();
			} else if (Class90.laodingStage == 85) {
				World.aClass98_2833 = new WorldMapFont(22, true, Node.canvas);
				Class90.laodingStage = 88;
				Class120_Sub12_Sub29.ping(true);
				Class69.method613();
			} else if (Class90.laodingStage == 88) {
				OverlayType.aClass98_1201 = new WorldMapFont(26, true, Node.canvas);
				Class90.laodingStage = 91;
				Class120_Sub12_Sub29.ping(true);
				Class69.method613();
			} else {
				SubInterface.aClass98_2739 = new WorldMapFont(30, true, Node.canvas);
				Class90.laodingStage = 100;
				Class120_Sub12_Sub29.ping(true);
				Class69.method613();
				System.gc();
			}
		}
	}

	static final void cameraRight() {
		if (!Class188.aBoolean1925) {
			if (!Class134.updateCameraFromCs2) {
				Class120_Sub15.cameraYawWrapper += (24.0F - Class120_Sub15.cameraYawWrapper) / 2.0F;
			} else {
				DummyOutputStream.cameraYaw = (int) DummyOutputStream.cameraYaw + 191 & ~0x7f;
			}
			Class188.aBoolean1925 = true;
			Class118.sendCameraPacket = true;
		}
	}
}
