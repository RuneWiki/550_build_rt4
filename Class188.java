/* Class188 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.net.URL;

final class Class188 {
	int anInt1910;
	int anInt1911;
	int anInt1912;
	int anInt1913;
	int anInt1914;
	int anInt1915;
	int anInt1916;
	int anInt1917;
	int anInt1918;
	int anInt1919;
	int anInt1920;
	int anInt1921;
	int anInt1922;
	int anInt1923;
	int anInt1924;
	static boolean aBoolean1925 = false;
	int anInt1926;
	int anInt1927;
	int anInt1928;

	static final void method2481() {
		Class30.aClass120_Sub30_Sub2_234.method1770();
		Class120_Sub12_Sub25.anInt3312 = 1;
		MasterIndexInfo.activeMusicJs5 = null;
	}

	static final void openUrl(final String string, final boolean newTab) {
		if (newTab) {
			if (HDToolkit.glEnabled && Class99.openwinjsEnabled) {
				try {
					JSHelper.call(new Object[] { new URL(Class31.gameApplet.getCodeBase(), string).toString() }, NpcType.gameSignlink.gameApplet, "openjs");
				} catch (final Throwable throwable) {
					/* empty */
				}
				return;
			}
			try {
				Class31.gameApplet.getAppletContext().showDocument(new URL(Class31.gameApplet.getCodeBase(), string), "_blank");
			} catch (final Exception exception) {
				/* empty */
			}
		} else {
			try {
				JSHelper.call(NpcType.gameSignlink.gameApplet, "loggedout");
			} catch (final Throwable throwable) {
				/* empty */
			}
			try {
				Class31.gameApplet.getAppletContext().showDocument(new URL(Class31.gameApplet.getCodeBase(), string), "_top");
			} catch (final Exception exception) {
				/* empty */
			}
		}
	}

	static final boolean hopWorld(final int worldId) {
		final World world = World.getWorld(worldId);
		if (world == null) {
			return false;
		}
		if (Signlink.clientType == 1 || Signlink.clientType == 2 || AbstractIndexedSprite.modeWhere == 2) {
			Class120_Sub12_Sub30.worldIpAddress = world.ip;
			Class157.worldId = world.worldId;
			if (AbstractIndexedSprite.modeWhere != 0) {
				GameEntity.anInt3045 = Class157.worldId + 50000;
				Class71.anInt625 = Class157.worldId + 40000;
				ModelParticleEmitter.worldPort = Class71.anInt625;
			}
			return true;
		}
		String portString = "";
		String params = "";
		if (Class120_Sub12_Sub25.params != null) {
			params = "/p=" + Class120_Sub12_Sub25.params;
		}
		if (AbstractIndexedSprite.modeWhere != 0) {
			portString = ":" + (world.worldId + 7000);
		}
		final String url = "http://" + world.ip + portString + "/l=" + Class9.language + "/a=" + Class120_Sub12_Sub33.affiliateId + params + "/j" + (Class48.jsEnabled ? "1" : "0") + ",o" + (Class110.objectTagEnabled ? "1" : "0") + ",a2,m" + (Class31.advertSuppressed ? "1" : "0");
		try {
			Class179.clientInstance.getAppletContext().showDocument(new URL(url), "_self");
		} catch (final Exception exception) {
			return false;
		}
		return true;
	}

	public Class188() {
		/* empty */
	}

	static final void method2484() {
		while_177_: do {
			if (Class24.method207() == 2) {
				final byte i = (byte) (0xff & InterfaceChangeNode.anInt3490 + -4);
				final int i_3_ = InterfaceChangeNode.anInt3490 % 104;
				for (int i_4_ = 0; i_4_ < 4; i_4_++) {
					for (int i_5_ = 0; i_5_ < 104; i_5_++) {
						Class9.aByteArrayArrayArray70[i_4_][i_3_][i_5_] = i;
					}
				}
				if (Class173.gameLevel != 3) {
					for (int i_6_ = 0; i_6_ < 2; i_6_++) {
						Class134.anIntArray1284[i_6_] = -1000000;
						Class54.anIntArray488[i_6_] = 1000000;
						IntegerNode.anIntArray2787[i_6_] = 0;
						StringNode.anIntArray2735[i_6_] = 1000000;
						AnimatedLocation.anIntArray3075[i_6_] = 0;
					}
					if (client.cameraType != 1) {
						final int i_7_ = Class22.getTileHeight(FileSystemWorker.renderX, GroundObjectNode.renderZ, Class173.gameLevel);
						if (-Class120_Sub12_Sub10.renderY + i_7_ < 800 && (0x4 & Class114.tileSettings[Class173.gameLevel][FileSystemWorker.renderX >> 7][GroundObjectNode.renderZ >> 7]) != 0) {
							LongNode.method1055(1, FileSystemWorker.renderX >> 7, false, GroundObjectNode.renderZ >> 7, SeqFrameBase.activeGroundTiles);
						}
					} else {
						if ((0x4 & Class114.tileSettings[Class173.gameLevel][TileParticleQueue.selfPlayer.x >> 7][TileParticleQueue.selfPlayer.z >> 7]) != 0) {
							LongNode.method1055(0, TileParticleQueue.selfPlayer.x >> 7, false, TileParticleQueue.selfPlayer.z >> 7, SeqFrameBase.activeGroundTiles);
						}
						if (UnderlayType.renderPitch < 310) {
							int cameraX = FileSystemWorker.renderX >> 7;
							int cameraZ = GroundObjectNode.renderZ >> 7;
							final int playerX = TileParticleQueue.selfPlayer.x >> 7;
							final int playerZ = TileParticleQueue.selfPlayer.z >> 7;
							int deltaX;
							if (playerX > cameraX) {
								deltaX = playerX - cameraX;
							} else {
								deltaX = cameraX - playerX;
							}
							int deltaZ;
							if (cameraZ >= playerZ) {
								deltaZ = cameraZ - playerZ;
							} else {
								deltaZ = playerZ - cameraZ;
							}
							//System.out.println(cameraX+":"+cameraZ+":"+playerX+":"+playerZ);
							if (deltaX == 0 && deltaZ == 0 || deltaX <= -104 || deltaX >= 104 || deltaZ <= -104 || deltaZ >= 104) {
								SpotAnimation.method2312(null, "RC: " + cameraX + "," + cameraZ + " " + playerX + "," + playerZ + " " + GameEntity.currentBaseX + "," + LightType.currentBaseZ);
							} else if (deltaX <= deltaZ) {
								int i_14_ = 32768;
								final int i_15_ = deltaX * 65536 / deltaZ;
								for (;;) {
									if (cameraZ == playerZ) {
										break while_177_;
									}
									if (playerZ > cameraZ) {
										cameraZ++;
									} else if (playerZ < cameraZ) {
										cameraZ--;
									}
									if ((Class114.tileSettings[Class173.gameLevel][cameraX][cameraZ] & 0x4) != 0) {
										LongNode.method1055(1, cameraX, false, cameraZ, SeqFrameBase.activeGroundTiles);
										break while_177_;
									}
									i_14_ += i_15_;
									if (i_14_ >= 65536) {
										i_14_ -= 65536;
										if (playerX > cameraX) {
											cameraX++;
										} else if (cameraX > playerX) {
											cameraX--;
										}
										if ((0x4 & Class114.tileSettings[Class173.gameLevel][cameraX][cameraZ]) != 0) {
											break;
										}
									}
								}
								LongNode.method1055(1, cameraX, false, cameraZ, SeqFrameBase.activeGroundTiles);
							} else {
								int i_17_ = 32768;
								final int i_16_ = 65536 * deltaZ / deltaX;
								for (;;) {
									if (playerX == cameraX) {
										break while_177_;
									}
									if (cameraX >= playerX) {
										if (playerX < cameraX) {
											cameraX--;
										}
									} else {
										cameraX++;
									}
									if ((0x4 & Class114.tileSettings[Class173.gameLevel][cameraX][cameraZ]) != 0) {
										LongNode.method1055(1, cameraX, false, cameraZ, SeqFrameBase.activeGroundTiles);
										break while_177_;
									}
									i_17_ += i_16_;
									if (-65537 >= (i_17_ ^ 0xffffffff)) {
										if (cameraZ < playerZ) {
											cameraZ++;
										} else if (playerZ < cameraZ) {
											cameraZ--;
										}
										i_17_ -= 65536;
										if ((Class114.tileSettings[Class173.gameLevel][cameraX][cameraZ] & 0x4) != 0) {
											break;
										}
									}
								}
								LongNode.method1055(1, cameraX, false, cameraZ, SeqFrameBase.activeGroundTiles);
							}
						}
					}
				}
			}
		} while (false);
	}
}
