/* Class2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class2 {
	static js5 seqsJs5;
	static int[] anIntArray51 = { 1, 1, 0, 0, 0, 8, 0, 0, 8 };
	static int[] playerVariables = new int[2500];

	static final void updateRegion(final int regionX, final int regionZ, final int level, final int playerX, final int playerZ, final boolean loginScreen, final boolean buildAreaChanged) {
		if (buildAreaChanged || Class116.currentRegionX != regionX || Class3.currentRegionZ != regionZ || SpotAnimationNode.visibleLevel != level && !Class143_Sub1.allLevelsAreVisible()) {
			Class116.currentRegionX = regionX;
			Class3.currentRegionZ = regionZ;
			SpotAnimationNode.visibleLevel = level;
			if (Class143_Sub1.allLevelsAreVisible()) {
				SpotAnimationNode.visibleLevel = 0;
			}
			if (loginScreen) {
				ProjectileNode.setGameState(28);
			} else {
				ProjectileNode.setGameState(25);
			}
			Class120_Sub12_Sub21_Sub1.drawTextOnScreen(StringLibrary.loadingPleaseWait, true);
			int oldBaseX = GameEntity.currentBaseX;
			int oldBaseZ = LightType.currentBaseZ;
			GameEntity.currentBaseX = regionX * 8 - 48;
			LightType.currentBaseZ = regionZ * 8 - 48;
			Class120_Sub12_Sub6.aClass120_Sub14_Sub22_3174 = WorldMapHandler.method676(Class116.currentRegionX * 8, Class3.currentRegionZ * 8);
			SceneGraphNode.mapFunctionGroup = null;
			final int xOff = GameEntity.currentBaseX - oldBaseX;
			final int zOff = LightType.currentBaseZ - oldBaseZ;
			oldBaseX = GameEntity.currentBaseX;
			oldBaseZ = LightType.currentBaseZ;
			if (!loginScreen) {
				for (int npcIndex = 0; npcIndex < 32768; npcIndex++) {
					final Npc npc = Class120_Sub12_Sub11.npcList[npcIndex];
					if (npc != null) {
						for (int id = 0; id < 10; id++) {
							npc.walkQueueX[id] -= xOff;
							npc.walkQueueZ[id] -= zOff;
						}
						npc.x -= xOff * 128;
						npc.z -= zOff * 128;
					}
				}
			} else {
				Class148.localNpcCount = 0;
				for (int npcIndex = 0; npcIndex < 32768; npcIndex++) {
					final Npc npc = Class120_Sub12_Sub11.npcList[npcIndex];
					if (npc != null) {
						npc.x -= xOff * 128;
						npc.z -= zOff * 128;
						if (npc.x < 0 || npc.x > 13184 || npc.z < 0 || npc.z > 13184) {
							Class120_Sub12_Sub11.npcList[npcIndex].setNpcType(null);
							Class120_Sub12_Sub11.npcList[npcIndex] = null;
						} else {
							for (int id = 0; id < 10; id++) {
								npc.walkQueueX[id] -= xOff;
								npc.walkQueueZ[id] -= zOff;
							}
							Class120_Sub12_Sub36.npcIndices[Class148.localNpcCount++] = npcIndex;
						}
					}
				}
			}
			for (int playerIndex = 0; playerIndex < 2048; playerIndex++) {
				final Player player = Class118.playersList[playerIndex];
				if (player != null) {
					for (int id = 0; id < 10; id++) {
						player.walkQueueX[id] -= xOff;
						player.walkQueueZ[id] -= zOff;
					}
					player.x -= 128 * xOff;
					player.z -= 128 * zOff;
				}
			}
			int xStart = 0;
			int xStep = 1;
			int xEquality = 104;
			if (xOff < 0) {
				xStart = 103;
				xStep = -1;
				xEquality = -1;
			}
			int zStart = 0;
			int zEquality = 104;
			int zStep = 1;
			if (zOff < 0) {
				zStart = 103;
				zEquality = -1;
				zStep = -1;
			}
			Class173.gameLevel = level;
			TileParticleQueue.selfPlayer.setPos(playerX, playerZ, false);
			for (int x = xStart; x != xEquality; x += xStep) {
				for (int z = zStart; z != zEquality; z += zStep) {
					final int oldX = x + xOff;
					final int oldZ = z + zOff;
					for (int level_ = 0; level_ < 4; level_++) {
						if (oldX >= 0 && oldZ >= 0 && oldX < 104 && oldZ < 104) {
							ClientScript.groundObjects[level_][x][z] = ClientScript.groundObjects[level_][oldX][oldZ];
						} else {
							ClientScript.groundObjects[level_][x][z] = null;
						}
					}
				}
			}
			for (CustomLocation customLocation = (CustomLocation) Class120_Sub4.customLocations.getFront(); customLocation != null; customLocation = (CustomLocation) Class120_Sub4.customLocations.getNext()) {
				customLocation.x -= xOff;
				customLocation.z -= zOff;
				if (customLocation.x < 0 || customLocation.z < 0 || customLocation.x >= 104 || customLocation.z >= 104) {
					customLocation.unlink();
				}
			}
			if (Class120_Sub12_Sub26.flagX != 0) {
				Class120_Sub12_Sub26.flagX -= xOff;
				Class65.flagY -= zOff;
			}
			if (!loginScreen) {
				client.cameraType = 1;
			} else {
				GroundObjectNode.renderZ -= zOff * 128;
				Class99.anInt951 -= xOff;
				InterfaceListener.anInt2546 -= zOff;
				Class109.anInt1042 -= xOff;
				Class134.anInt1280 -= zOff;
				FileSystemWorker.renderX -= xOff * 128;
			}
			Class150.soundEffectCount = 0;
			if (HDToolkit.glEnabled && loginScreen && (Math.abs(xOff) > 104 || Math.abs(zOff) > 104)) {
				ModelParticleEmitter.instantScreenFade = true;
			}
			Class132_Sub2.resetMinimapLandscape();
			Class120_Sub12_Sub7.spotAnimationDeque.clear();
			FileSystemRequest.projectileDeque.clear();
			ParticleEngine.clear();
		}
	}

	static final void method77() {
		Class157.shaders = null;
		Class78.method673();
	}

}
