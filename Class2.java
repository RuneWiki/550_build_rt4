/* Class2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class2 {
	static int anInt49 = 0;
	static js5 aClass50_50;
	static int[] anIntArray51 = { 1, 1, 0, 0, 0, 8, 0, 0, 8 };
	static int[] permanentVariable = new int[2500];

	static final void method76(final boolean bool, final int baseX, final boolean bool_1_, final int playerZ, final int playerX, final int baseZ, final int level) {
		if (bool_1_ || Class116.anInt1118 != baseX || Class3.anInt53 != baseZ || Class120_Sub14_Sub4.anInt3469 != level && !Class143_Sub1.method2021()) {
			Class3.anInt53 = baseZ;
			Class120_Sub14_Sub4.anInt3469 = level;
			Class116.anInt1118 = baseX;
			if (Class143_Sub1.method2021()) {
				Class120_Sub14_Sub4.anInt3469 = 0;
			}
			if (bool) {
				Class120_Sub14_Sub1.setGameState(28);
			} else {
				Class120_Sub14_Sub1.setGameState(25);
			}
			Class120_Sub12_Sub21_Sub1.drawTextOnScreen(Class120_Sub30_Sub2.aString3679, true);
			int i_6_ = GameEntity.currentBaseX;
			int i_7_ = Class181.currentBaseZ;
			GameEntity.currentBaseX = baseX * 8 - 48;
			Class181.currentBaseZ = baseZ * 8 - 48;
			Class120_Sub12_Sub6.aClass120_Sub14_Sub22_3174 = Class79.method676(Class116.anInt1118 * 8, Class3.anInt53 * 8);
			SceneGraphNode.aClass137_1780 = null;
			final int i_8_ = Class181.currentBaseZ - i_7_;
			final int i_9_ = GameEntity.currentBaseX - i_6_;
			i_6_ = GameEntity.currentBaseX;
			i_7_ = Class181.currentBaseZ;
			if (!bool) {
				for (int i_10_ = 0; i_10_ < 32768; i_10_++) {
					final Npc class180_sub5_sub2 = Class120_Sub12_Sub11.npcList[i_10_];
					if (class180_sub5_sub2 != null) {
						for (int i_11_ = 0; i_11_ < 10; i_11_++) {
							class180_sub5_sub2.walkQueueX[i_11_] -= i_9_;
							class180_sub5_sub2.walkQueueZ[i_11_] -= i_8_;
						}
						class180_sub5_sub2.x -= i_9_ * 128;
						class180_sub5_sub2.z -= 128 * i_8_;
					}
				}
			} else {
				Class148.localNpcCount = 0;
				for (int i_12_ = 0; i_12_ < 32768; i_12_++) {
					final Npc class180_sub5_sub2 = Class120_Sub12_Sub11.npcList[i_12_];
					if (class180_sub5_sub2 != null) {
						class180_sub5_sub2.z -= 128 * i_8_;
						class180_sub5_sub2.x -= i_9_ * 128;
						if (class180_sub5_sub2.x < 0 || class180_sub5_sub2.x > 13184 || class180_sub5_sub2.z < 0 || class180_sub5_sub2.z > 13184) {
							Class120_Sub12_Sub11.npcList[i_12_].setNpcType(null);
							Class120_Sub12_Sub11.npcList[i_12_] = null;
						} else {
							for (int i_13_ = 0; i_13_ < 10; i_13_++) {
								class180_sub5_sub2.walkQueueX[i_13_] -= i_9_;
								class180_sub5_sub2.walkQueueZ[i_13_] -= i_8_;
							}
							Class120_Sub12_Sub36.localNpcIndices[Class148.localNpcCount++] = i_12_;
						}
					}
				}
			}
			for (int i_14_ = 0; i_14_ < 2048; i_14_++) {
				final Player class180_sub5_sub1 = Class118.playersList[i_14_];
				if (class180_sub5_sub1 != null) {
					for (int i_15_ = 0; i_15_ < 10; i_15_++) {
						class180_sub5_sub1.walkQueueX[i_15_] -= i_9_;
						class180_sub5_sub1.walkQueueZ[i_15_] -= i_8_;
					}
					class180_sub5_sub1.z -= 128 * i_8_;
					class180_sub5_sub1.x -= 128 * i_9_;
				}
			}
			int i_16_ = 0;
			int i_17_ = 1;
			int i_18_ = 104;
			if (i_9_ < 0) {
				i_17_ = -1;
				i_18_ = -1;
				i_16_ = 103;
			}
			int i_19_ = 0;
			Class173.gameLevel = level;
			int i_20_ = 104;
			Class100.selfPlayer.method2343(playerX, playerZ, false);
			int i_21_ = 1;
			if (i_8_ < 0) {
				i_20_ = -1;
				i_21_ = -1;
				i_19_ = 103;
			}
			for (int i_22_ = i_16_; i_22_ != i_18_; i_22_ += i_17_) {
				for (int i_23_ = i_19_; i_23_ != i_20_; i_23_ += i_21_) {
					final int i_24_ = i_9_ + i_22_;
					final int i_25_ = i_8_ + i_23_;
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
				class120_sub24.anInt2725 -= i_8_;
				class120_sub24.anInt2731 -= i_9_;
				if (class120_sub24.anInt2731 < 0 || class120_sub24.anInt2725 < 0 || class120_sub24.anInt2731 >= 104 || class120_sub24.anInt2725 >= 104) {
					class120_sub24.unlink();
				}
			}
			if (Class120_Sub12_Sub26.flagX != 0) {
				Class65.flagY -= i_8_;
				Class120_Sub12_Sub26.flagX -= i_9_;
			}
			if (!bool) {
				client.cameraType = 1;
			} else {
				GroundObjectNode.renderZ -= 128 * i_8_;
				Class99.anInt951 -= i_9_;
				InterfaceListener.anInt2546 -= i_8_;
				Class109.anInt1042 -= i_9_;
				Class134.anInt1280 -= i_8_;
				FileSystemWorker.renderX -= i_9_ * 128;
			}
			Class150.anInt1407 = 0;
			if (HDToolkit.glEnabled && bool && (Math.abs(i_9_) > 104 || Math.abs(i_8_) > 104)) {
				AmbientSound.method1159();
			}
			Class132_Sub2.method1937((byte) 84);
			Class120_Sub12_Sub7.aClass105_3177.clear();
			FileSystemRequest.aClass105_3928.clear();
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
