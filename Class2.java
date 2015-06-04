/* Class2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class2 {
	static int anInt49 = 0;
	static js5 aClass50_50;
	static int[] anIntArray51 = { 1, 1, 0, 0, 0, 8, 0, 0, 8 };
	static int[] permanentVariable = new int[2500];

	static final void method76(final int baseX, final int baseZ, final int level, final int playerX, final int playerZ, final boolean loginScreen, final boolean bool_1_) {
		if (bool_1_ || Class116.anInt1118 != baseX || Class3.anInt53 != baseZ || SpotAnimationNode.anInt3469 != level && !Class143_Sub1.method2021()) {
			Class116.anInt1118 = baseX;
			Class3.anInt53 = baseZ;
			SpotAnimationNode.anInt3469 = level;
			if (Class143_Sub1.method2021()) {
				SpotAnimationNode.anInt3469 = 0;
			}
			if (loginScreen) {
				ProjectileNode.setGameState(28);
			} else {
				ProjectileNode.setGameState(25);
			}
			Class120_Sub12_Sub21_Sub1.drawTextOnScreen(StringLibrary.loadingPleaseWait, true);
			int i_6_ = GameEntity.currentBaseX;
			int i_7_ = LightType.currentBaseZ;
			GameEntity.currentBaseX = baseX * 8 - 48;
			LightType.currentBaseZ = baseZ * 8 - 48;
			Class120_Sub12_Sub6.aClass120_Sub14_Sub22_3174 = WorldMapHandler.method676(Class116.anInt1118 * 8, Class3.anInt53 * 8);
			SceneGraphNode.mapFunctionGroup = null;
			final int xOff = GameEntity.currentBaseX - i_6_;
			final int zOff = LightType.currentBaseZ - i_7_;
			i_6_ = GameEntity.currentBaseX;
			i_7_ = LightType.currentBaseZ;
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
			for (Class120_Sub24 class120_sub24 = (Class120_Sub24) Class120_Sub4.aClass105_2439.getFront(); class120_sub24 != null; class120_sub24 = (Class120_Sub24) Class120_Sub4.aClass105_2439.getNext()) {
				class120_sub24.anInt2731 -= xOff;
				class120_sub24.anInt2725 -= zOff;
				if (class120_sub24.anInt2731 < 0 || class120_sub24.anInt2725 < 0 || class120_sub24.anInt2731 >= 104 || class120_sub24.anInt2725 >= 104) {
					class120_sub24.unlink();
				}
			}
			if (Class120_Sub12_Sub26.flagX != 0) {
				Class120_Sub12_Sub26.flagX -= xOff;
				Class65.flagY -= zOff;
			}
			if (!loginScreen) {
				client.cameraType = 1;
			} else {
				GroundObjectNode.renderZ -= 128 * zOff;
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
