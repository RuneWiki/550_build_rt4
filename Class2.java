/* Class2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class2 {
	static int anInt49 = 0;
	static js5 aClass50_50;
	static int[] anIntArray51 = { 1, 1, 0, 0, 0, 8, 0, 0, 8 };
	static int[] permanentVariable = new int[2500];

	static final void method76(final boolean loginScreen, final int baseX, final boolean bool_1_, final int playerZ, final int playerX, final int baseZ, final int level) {
		if (bool_1_ || Class116.anInt1118 != baseX || Class3.anInt53 != baseZ || Class120_Sub14_Sub4.anInt3469 != level && !Class143_Sub1.method2021()) {
			Class3.anInt53 = baseZ;
			Class120_Sub14_Sub4.anInt3469 = level;
			Class116.anInt1118 = baseX;
			if (Class143_Sub1.method2021()) {
				Class120_Sub14_Sub4.anInt3469 = 0;
			}
			if (loginScreen) {
				ProjectileNode.setGameState(28);
			} else {
				ProjectileNode.setGameState(25);
			}
			Class120_Sub12_Sub21_Sub1.drawTextOnScreen(Class120_Sub30_Sub2.aString3679, true);
			int i_6_ = GameEntity.currentBaseX;
			int i_7_ = Class181.currentBaseZ;
			GameEntity.currentBaseX = baseX * 8 - 48;
			Class181.currentBaseZ = baseZ * 8 - 48;
			Class120_Sub12_Sub6.aClass120_Sub14_Sub22_3174 = WorldMapHandler.method676(Class116.anInt1118 * 8, Class3.anInt53 * 8);
			SceneGraphNode.aClass137_1780 = null;
			final int zOff = Class181.currentBaseZ - i_7_;
			final int xOff = GameEntity.currentBaseX - i_6_;
			i_6_ = GameEntity.currentBaseX;
			i_7_ = Class181.currentBaseZ;
			if (!loginScreen) {
				for (int npcIndex = 0; npcIndex < 32768; npcIndex++) {
					final Npc npc = Class120_Sub12_Sub11.npcList[npcIndex];
					if (npc != null) {
						for (int i_11_ = 0; i_11_ < 10; i_11_++) {
							npc.walkQueueX[i_11_] -= xOff;
							npc.walkQueueZ[i_11_] -= zOff;
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
							Class120_Sub12_Sub36.localNpcIndices[Class148.localNpcCount++] = npcIndex;
						}
					}
				}
			}
			for (int playerIndex = 0; playerIndex < 2048; playerIndex++) {
				final Player player = Class118.playersList[playerIndex];
				if (player != null) {
					for (int i_15_ = 0; i_15_ < 10; i_15_++) {
						player.walkQueueX[i_15_] -= xOff;
						player.walkQueueZ[i_15_] -= zOff;
					}
					player.x -= 128 * xOff;
					player.z -= 128 * zOff;
				}
			}
			int i_16_ = 0;
			int i_17_ = 1;
			int i_18_ = 104;
			if (xOff < 0) {
				i_17_ = -1;
				i_18_ = -1;
				i_16_ = 103;
			}
			int i_19_ = 0;
			Class173.gameLevel = level;
			int i_20_ = 104;
			TileParticleQueue.selfPlayer.method2343(playerX, playerZ, false);
			int i_21_ = 1;
			if (zOff < 0) {
				i_20_ = -1;
				i_21_ = -1;
				i_19_ = 103;
			}
			for (int i_22_ = i_16_; i_22_ != i_18_; i_22_ += i_17_) {
				for (int i_23_ = i_19_; i_23_ != i_20_; i_23_ += i_21_) {
					final int i_24_ = xOff + i_22_;
					final int i_25_ = zOff + i_23_;
					for (int i_26_ = 0; i_26_ < 4; i_26_++) {
						if (i_24_ >= 0 && i_25_ >= 0 && i_24_ < 104 && i_25_ < 104) {
							ClientScript.groundObjects[i_26_][i_22_][i_23_] = ClientScript.groundObjects[i_26_][i_24_][i_25_];
						} else {
							ClientScript.groundObjects[i_26_][i_22_][i_23_] = null;
						}
					}
				}
			}
			for (Class120_Sub24 class120_sub24 = (Class120_Sub24) Class120_Sub4.aClass105_2439.getFront(); class120_sub24 != null; class120_sub24 = (Class120_Sub24) Class120_Sub4.aClass105_2439.getNext()) {
				class120_sub24.anInt2725 -= zOff;
				class120_sub24.anInt2731 -= xOff;
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
			Class150.anInt1407 = 0;
			if (HDToolkit.glEnabled && loginScreen && (Math.abs(xOff) > 104 || Math.abs(zOff) > 104)) {
				Class158.aBoolean1478 = true;
			}
			Class132_Sub2.resetMinimapLandscape();
			Class120_Sub12_Sub7.aClass105_3177.clear();
			FileSystemRequest.projectileDeque.clear();
			ParticleEngine.method958();
		}
	}

	static final void method77(final int i) {
		try {
			Class157.shaders = null;
			Class78.method673();
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("aa.A(").append(i).append(')').toString());
		}
	}

	public static void method78(final byte i) {
		try {
			permanentVariable = null;
			if (i == -54) {
				anIntArray51 = null;
				aClass50_50 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("aa.C(").append(i).append(')').toString());
		}
	}
}
