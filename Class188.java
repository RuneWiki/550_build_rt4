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

	static final void method2481(final int i) {
		try {
			if (i != 104) {
				method2483(48);
			}
			Class30.aClass120_Sub30_Sub2_234.method1770(21229);
			Class120_Sub12_Sub25.anInt3312 = 1;
			MasterIndexInfo.aClass50_476 = null;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("we.E(").append(i).append(')').toString());
		}
	}

	static final void method2482(final String string, final boolean bool) {
		if (bool) {
			do {
				if (HDToolkit.glEnabled && Class99.openwinjsEnabled) {
					try {
						JSHelper.call(new Object[] { new URL(Class31.gameApplet.getCodeBase(), string).toString() }, NpcType.gameSignlink.gameApplet, "openjs");
					} catch (final Throwable throwable) {
						break;
					}
					return;
				}
			} while (false);
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

	static final boolean method2483(final int i_0_) {
		final World class167_sub1 = Class82.method710(i_0_);
		if (class167_sub1 == null) {
			return false;
		}
		if (Signlink.anInt1310 == 1 || Signlink.anInt1310 == 2 || AbstractIndexedSprite.modeWhere == 2) {
			Class120_Sub12_Sub30.aString3375 = class167_sub1.ip;
			Class157.worldId = class167_sub1.worldId;
			if (AbstractIndexedSprite.modeWhere != 0) {
				GameEntity.anInt3045 = Class157.worldId + 50000;
				Class71.anInt625 = Class157.worldId + 40000;
				Class158.anInt1479 = Class71.anInt625;
			}
			return true;
		}
		String string = "";
		String string_1_ = "";
		if (Class120_Sub12_Sub25.settings != null) {
			string_1_ = new StringBuilder("/p=").append(Class120_Sub12_Sub25.settings).toString();
		}
		if (AbstractIndexedSprite.modeWhere != 0) {
			string = new StringBuilder(":").append(7000 + class167_sub1.worldId).toString();
		}
		final String string_2_ = new StringBuilder("http://").append(class167_sub1.ip).append(string).append("/l=").append(Class9.language).append("/a=").append(Class120_Sub12_Sub33.affiliateId).append(string_1_).append("/j").append(Class48.jsEnabled ? "1" : "0").append(",o").append(Class110.objectTagEnabled ? "1" : "0").append(",a2,m").append(Class31.advertSuppressed ? "1" : "0").toString();
		try {
			Class179.aClient1776.getAppletContext().showDocument(new URL(string_2_), "_self");
		} catch (final Exception exception) {
			return false;
		}
		return true;
	}

	public Class188() {
		/* empty */
	}

	static final void method2484(final boolean bool) {
		while_177_: do {
			try {
				//System.out.println(Class24.method207());
				if (Class24.method207() == 2) {
					final byte i = (byte) (0xff & InterfaceChangeNode.anInt3490 + -4);
					if (bool) {
						aBoolean1925 = false;
					}
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
							Class180_Sub6.anIntArray3075[i_6_] = 0;
						}
						if (client.cameraType != 1) {
							final int i_7_ = Class22.getTileHeight(Class173.gameLevel, FileSystemWorker.renderX, GroundObjectNode.renderZ);
							if (-Class120_Sub12_Sub10.renderY + i_7_ < 800 && (0x4 & Class114.tileSettings[Class173.gameLevel][FileSystemWorker.renderX >> 7][GroundObjectNode.renderZ >> 7]) != 0) {
								Class120_Sub3.method1055(1, FileSystemWorker.renderX >> 7, false, GroundObjectNode.renderZ >> 7, LabelGroup.groundTiles);
							}
						} else {
							if ((0x4 & Class114.tileSettings[Class173.gameLevel][TileParticleQueue.selfPlayer.x >> 7][TileParticleQueue.selfPlayer.z >> 7]) != 0) {
								Class120_Sub3.method1055(0, TileParticleQueue.selfPlayer.x >> 7, false, TileParticleQueue.selfPlayer.z >> 7, LabelGroup.groundTiles);
							}
							if (OverlayType.renderPitch < 310) {
								int i_8_ = GroundObjectNode.renderZ >> 7;
								int i_9_ = FileSystemWorker.renderX >> 7;
								final int i_10_ = TileParticleQueue.selfPlayer.z >> 7;
								int i_11_;
								if (i_8_ >= i_10_) {
									i_11_ = i_8_ + -i_10_;
								} else {
									i_11_ = -i_8_ + i_10_;
								}
								final int i_12_ = TileParticleQueue.selfPlayer.x >> 7;
								int i_13_;
								if (i_12_ > i_9_) {
									i_13_ = -i_9_ + i_12_;
								} else {
									i_13_ = -i_12_ + i_9_;
								}
								if (i_13_ == 0 && i_11_ == 0 || i_13_ <= -104 || i_13_ >= 104 || i_11_ <= -104 || i_11_ >= 104) {
									Class180_Sub3.method2312(null, new StringBuilder("RC: ").append(i_9_).append(",").append(i_8_).append(" ").append(i_12_).append(",").append(i_10_).append(" ").append(GameEntity.currentBaseX).append(",").append(Class181.currentBaseZ).toString());
								} else if (i_13_ <= i_11_) {
									int i_14_ = 32768;
									final int i_15_ = i_13_ * 65536 / i_11_;
									for (;;) {
										if (i_8_ == i_10_) {
											break while_177_;
										}
										if (i_10_ <= i_8_) {
											if (i_10_ < i_8_) {
												i_8_--;
											}
										} else {
											i_8_++;
										}
										if ((Class114.tileSettings[Class173.gameLevel][i_9_][i_8_] & 0x4) != 0) {
											Class120_Sub3.method1055(1, i_9_, false, i_8_, LabelGroup.groundTiles);
											break while_177_;
										}
										i_14_ += i_15_;
										if (i_14_ >= 65536) {
											i_14_ -= 65536;
											if (i_12_ > i_9_) {
												i_9_++;
											} else if (i_9_ > i_12_) {
												i_9_--;
											}
											if ((0x4 & Class114.tileSettings[Class173.gameLevel][i_9_][i_8_]) != 0) {
												break;
											}
										}
									}
									Class120_Sub3.method1055(1, i_9_, false, i_8_, LabelGroup.groundTiles);
								} else {
									final int i_16_ = 65536 * i_11_ / i_13_;
									int i_17_ = 32768;
									for (;;) {
										if (i_12_ == i_9_) {
											break while_177_;
										}
										if (i_9_ >= i_12_) {
											if (i_12_ < i_9_) {
												i_9_--;
											}
										} else {
											i_9_++;
										}
										if ((0x4 & Class114.tileSettings[Class173.gameLevel][i_9_][i_8_]) != 0) {
											Class120_Sub3.method1055(1, i_9_, false, i_8_, LabelGroup.groundTiles);
											break while_177_;
										}
										i_17_ += i_16_;
										if (-65537 >= (i_17_ ^ 0xffffffff)) {
											if (i_8_ < i_10_) {
												i_8_++;
											} else if (i_10_ < i_8_) {
												i_8_--;
											}
											i_17_ -= 65536;
											if ((Class114.tileSettings[Class173.gameLevel][i_9_][i_8_] & 0x4) != 0) {
												break;
											}
										}
									}
									Class120_Sub3.method1055(1, i_9_, false, i_8_, LabelGroup.groundTiles);
								}
							}
						}
					}
				}
			} catch (final RuntimeException runtimeexception) {
				throw EnumType.method1428(runtimeexception, new StringBuilder("we.D(").append(bool).append(')').toString());
			}
		} while (false);
	}
}
