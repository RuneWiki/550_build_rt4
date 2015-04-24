/* Class93 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class93 {
	static int[] packetSizes = { 0, -2, -2, 0, 1, 0, 0, 0, 1, 0, 6, 8, 0, 0, 0, 0, 0, 15, 8, 20, 0, 0, 0, 3, 0, -2, 4, 0, 0, 0, -1, 12, 0, 3, -2, 9, 0, 0, 3, 0, 7, 0, 6, -2, -1, 0, 8, 7, 0, -2, 0, 0, 2, -2, -1, 1, 0, 0, 0, -1, 5, 0, 0, 7, 0, 10, 0, 0, 0, 0, 0, 0, 2, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0,
			0, 0, 0, -1, 8, 0, 10, 12, 0, 0, 8, 0, 2, 0, 2, 0, -1, 3, 0, 0, 4, -1, 15, 0, 0, 0, 0, 0, 17, 0, 12, 7, 3, -2, 0, 0, 0, 3, 0, 0, 0, 0, 0, -1, 0, 0, 6, 3, 4, 0, 14, 0, 6, -2, 3, 6, 0, 0, 0, 0, 0, 6, 0, 0, 2, 8, 0, 5, 8, 10, 6, 0, -2, 2, 0, 6, 0, 0, 0, 14, 0, 6, 0, 28, 0, 2, 0, 0, 0, 8,
			-2, -1, 0, 5, 11, 0, 4, 0, 0, -1, 12, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 6, 0, 0, 0, 0, 0, 0, 6, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, -1, -1, 0, 0, 5, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 10, 0, 0, 0, 0, 3, 8, 0, 0, -1, 0, 0, 0, 0, 0, -1, -2, 0, 0 };
	static int anInt867 = 0;
	static int spriteAmount;
	static JagexInterface staticActiveComponent2;
	static boolean aBoolean870 = false;

	static final void removeIgnore(final long nameAsLong) {
		if (nameAsLong != 0L) {
			for (int ignoreId = 0; ignoreId < Class120_Sub12_Sub26.ignoreCount; ignoreId++) {
				if (nameAsLong == HintIcon.ignoreNamesAsLong[ignoreId]) {
					Class120_Sub12_Sub26.ignoreCount--;
					for (int nextIgnoreId = ignoreId; nextIgnoreId < Class120_Sub12_Sub26.ignoreCount; nextIgnoreId++) {
						HintIcon.ignoreNamesAsLong[nextIgnoreId] = HintIcon.ignoreNamesAsLong[nextIgnoreId + 1];
						GZIPDecompressor.ignoreNames[nextIgnoreId] = GZIPDecompressor.ignoreNames[nextIgnoreId + 1];
						SpotAnimationNode.aBooleanArray3468[nextIgnoreId] = SpotAnimationNode.aBooleanArray3468[nextIgnoreId + 1];
					}
					client.anInt563 = GrandExchangeObject.anInt1494;
					Class120_Sub12_Sub11.outputStream.putByteIsaac(142);
					Class120_Sub12_Sub11.outputStream.putLong(nameAsLong);
					break;
				}
			}
		}
	}

	static final void spawnLocation(final int rotation, final int level, final int locationId, final int level2, final int x, final boolean bool, final int z, final CollisionMap collisionMap, final boolean bool_8_, final int type) {
		if (!bool_8_ || Class143_Sub1.method2021() || (0x2 & Class114.tileSettings[0][x][z]) != 0 || (Class114.tileSettings[level][x][z] & 0x10) == 0 && SubScript.method2242(x, z, level) == SpotAnimationNode.anInt3469) {
			if (DummyOutputStream.anInt29 > level) {
				DummyOutputStream.anInt29 = level;
			}
			final LocType locType = LocType.list(locationId);
			if (!HDToolkit.glEnabled || !locType.aBoolean1876) {
				int i_10_;
				int i_11_;
				if (rotation == 1 || rotation == 3) {
					i_10_ = locType.sizeX;
					i_11_ = locType.sizeZ;
				} else {
					i_10_ = locType.sizeZ;
					i_11_ = locType.sizeX;
				}
				int i_12_;
				int i_13_;
				if (i_11_ + x > 104) {
					i_12_ = x - -1;
					i_13_ = x;
				} else {
					i_12_ = x + (1 + i_11_ >> 1);
					i_13_ = (i_11_ >> 1) + x;
				}
				int i_14_;
				int i_15_;
				if (z - -i_10_ > 104) {
					i_15_ = z + 1;
					i_14_ = z;
				} else {
					i_14_ = (i_10_ >> 1) + z;
					i_15_ = z - -(i_10_ - -1 >> 1);
				}
				final int[][] is = OverridedJInterface.tileHeightMap[level2];
				final int i_16_ = (i_11_ << 6) + (x << 7);
				final int i_17_ = (i_10_ << 6) + (z << 7);
				final int y = is[i_12_][i_14_] + is[i_13_][i_14_] + is[i_13_][i_15_] + is[i_12_][i_15_] >> 2;
				int i_19_ = 0;
				if (HDToolkit.glEnabled && level2 != 0) {
					final int[][] is_20_ = OverridedJInterface.tileHeightMap[0];
					i_19_ = y + -(is_20_[i_13_][i_15_] + is_20_[i_13_][i_14_] - (-is_20_[i_12_][i_14_] - is_20_[i_12_][i_15_]) >> 2);
				}
				long bitPackedUid = x | z << 7 | type << 14 | rotation << 20 | 0x40000000;
				int[][] is_21_ = null;
				if (bool) {
					is_21_ = Class120_Sub12_Sub33.anIntArrayArrayArray3388[0];
				} else if (level2 < 3) {
					is_21_ = OverridedJInterface.tileHeightMap[level2 + 1];
				}
				if (locType.anInt1835 == 0 || bool) {
					bitPackedUid |= ~0x7fffffffffffffffL;
				}
				if (locType.anInt1831 == 1) {
					bitPackedUid |= 0x400000L;
				}
				if (locType.aBoolean1878) {
					bitPackedUid |= 0x80000000L;
				}
				if (locType.hasAmbientSound()) {
					AmbientSound.addAmbientSound(locType, x, null, z, null, rotation, level);
				}
				bitPackedUid |= (long) locationId << 32;
				final boolean bool_22_ = locType.aBoolean1823 & !bool;
				if (type == 22) {
					if (Hashtable.showGroundDecorations || locType.anInt1835 != 0 || locType.anInt1821 == 1 || locType.aBoolean1853) {
						SceneGraphNode sceneGraphNode;
						if (locType.animationId != -1 || locType.anIntArray1881 != null || locType.childrenIDs != null || locType.aBoolean1863) {
							sceneGraphNode = new AnimatedLocation(locationId, 22, rotation, level2, x, z, -1, locType.aBoolean1864, null);
						} else {
							final Class88 class88 = locType.method2453(i_16_, bool_8_, 22, y, is, is_21_, bool_22_, rotation, i_17_, null);
							if (HDToolkit.glEnabled && bool_22_) {
								Class47.method389(class88.aClass107_Sub1_830, i_16_, i_19_, i_17_);
							}
							sceneGraphNode = class88.aClass180_826;
						}
						Class120_Sub14_Sub24.addGroundDecoration(sceneGraphNode, x, y, z, level, bitPackedUid, locType.aBoolean1822);
						if (locType.anInt1821 == 1 && collisionMap != null) {
							collisionMap.method212(x, z);
						}
					}
				} else if (type == 10 || type == 11) {
					SceneGraphNode sceneGraphNode;
					if (locType.animationId == -1 && locType.anIntArray1881 == null && locType.childrenIDs == null && !locType.aBoolean1863) {
						final Class88 class88 = locType.method2453(i_16_, bool_8_, 10, y, is, is_21_, bool_22_, type != 11 ? rotation : rotation + 4, i_17_, null);
						if (HDToolkit.glEnabled && bool_22_) {
							Class47.method389(class88.aClass107_Sub1_830, i_16_, i_19_, i_17_);
						}
						sceneGraphNode = class88.aClass180_826;
					} else {
						sceneGraphNode = new AnimatedLocation(locationId, 10, type != 11 ? rotation : rotation + 4, level2, x, z, -1, locType.aBoolean1864, null);
					}
					if (sceneGraphNode != null) {
						final boolean bool_23_ = method774(level, x, z, y, i_11_, i_10_, sceneGraphNode, 0, bitPackedUid);
						if (locType.aBoolean1858 && bool_23_ && bool_8_) {
							int i_24_ = 15;
							if (sceneGraphNode instanceof AbstractModelRenderer) {
								i_24_ = ((AbstractModelRenderer) sceneGraphNode).method2371() / 4;
								if (i_24_ > 30) {
									i_24_ = 30;
								}
							}
							for (int i_25_ = 0; i_11_ >= i_25_; i_25_++) {
								for (int i_26_ = 0; i_26_ <= i_10_; i_26_++) {
									if (Npc.aByteArrayArrayArray3754[level][x + i_25_][z + i_26_] < i_24_) {
										Npc.aByteArrayArrayArray3754[level][x + i_25_][z + i_26_] = (byte) i_24_;
									}
								}
							}
						}
					}
					if (locType.anInt1821 != 0 && collisionMap != null) {
						collisionMap.method213(x, z, i_10_, i_11_, locType.aBoolean1844, !locType.aBoolean1880);
					}
				} else if (type >= 12) {
					SceneGraphNode sceneGraphNode;
					if (locType.animationId != -1 || locType.anIntArray1881 != null || locType.childrenIDs != null || locType.aBoolean1863) {
						sceneGraphNode = new AnimatedLocation(locationId, type, rotation, level2, x, z, -1, locType.aBoolean1864, null);
					} else {
						final Class88 class88 = locType.method2453(i_16_, bool_8_, type, y, is, is_21_, bool_22_, rotation, i_17_, null);
						if (HDToolkit.glEnabled && bool_22_) {
							Class47.method389(class88.aClass107_Sub1_830, i_16_, i_19_, i_17_);
						}
						sceneGraphNode = class88.aClass180_826;
					}
					method774(level, x, z, y, 1, 1, sceneGraphNode, 0, bitPackedUid);
					if (bool_8_ && type >= 12 && type <= 17 && type != 13 && level > 0 && locType.anInt1866 != 0) {
						Class110.tileOccludeFlags[level][x][z] |= 0x4;
					}
					if (locType.anInt1821 != 0 && collisionMap != null) {
						collisionMap.method213(x, z, i_10_, i_11_, locType.aBoolean1844, !locType.aBoolean1880);
					}
				} else if (type == 0) {
					SceneGraphNode sceneGraphNode;
					if (locType.animationId != -1 || locType.anIntArray1881 != null || locType.childrenIDs != null || locType.aBoolean1863) {
						sceneGraphNode = new AnimatedLocation(locationId, 0, rotation, level2, x, z, -1, locType.aBoolean1864, null);
					} else {
						final Class88 class88 = locType.method2453(i_16_, bool_8_, 0, y, is, is_21_, bool_22_, rotation, i_17_, null);
						if (HDToolkit.glEnabled && bool_22_) {
							Class47.method389(class88.aClass107_Sub1_830, i_16_, i_19_, i_17_);
						}
						sceneGraphNode = class88.aClass180_826;
					}
					RuntimeException_Sub1.addWallLocation(level, x, z, y, sceneGraphNode, null, Class53.anIntArray485[rotation], 0, bitPackedUid);
					if (bool_8_) {
						if (rotation != 0) {
							if (rotation != 1) {
								if (rotation != 2) {
									if (rotation == 3) {
										if (locType.aBoolean1858) {
											Npc.aByteArrayArrayArray3754[level][x][z] = (byte) 50;
											Npc.aByteArrayArrayArray3754[level][1 + x][z] = (byte) 50;
										}
										if (locType.anInt1866 == 1) {
											Class110.tileOccludeFlags[level][x][z] |= 0x2;
										}
									}
								} else {
									if (locType.aBoolean1858) {
										Npc.aByteArrayArrayArray3754[level][x + 1][z] = (byte) 50;
										Npc.aByteArrayArrayArray3754[level][1 + x][1 + z] = (byte) 50;
									}
									if (locType.anInt1866 == 1) {
										Class110.tileOccludeFlags[level][x + 1][z] |= 0x1;
									}
								}
							} else {
								if (locType.aBoolean1858) {
									Npc.aByteArrayArrayArray3754[level][x][1 + z] = (byte) 50;
									Npc.aByteArrayArrayArray3754[level][1 + x][1 + z] = (byte) 50;
								}
								if (locType.anInt1866 == 1) {
									Class110.tileOccludeFlags[level][x][z + 1] |= 0x2;
								}
							}
						} else {
							if (locType.aBoolean1858) {
								Npc.aByteArrayArrayArray3754[level][x][z] = (byte) 50;
								Npc.aByteArrayArrayArray3754[level][x][1 + z] = (byte) 50;
							}
							if (locType.anInt1866 == 1) {
								Class110.tileOccludeFlags[level][x][z] |= 0x1;
							}
						}
					}
					if (locType.anInt1821 != 0 && collisionMap != null) {
						collisionMap.method219(x, z, locType.aBoolean1844, !locType.aBoolean1880, type, rotation);
					}
					if (locType.anInt1819 != 16) {
						Class120_Sub12_Sub2.method1201(level, x, z, locType.anInt1819);
					}
				} else if (type == 1) {
					SceneGraphNode sceneGraphNode;
					if (locType.animationId != -1 || locType.anIntArray1881 != null || locType.childrenIDs != null || locType.aBoolean1863) {
						sceneGraphNode = new AnimatedLocation(locationId, 1, rotation, level2, x, z, -1, locType.aBoolean1864, null);
					} else {
						final Class88 class88 = locType.method2453(i_16_, bool_8_, 1, y, is, is_21_, bool_22_, rotation, i_17_, null);
						if (HDToolkit.glEnabled && bool_22_) {
							Class47.method389(class88.aClass107_Sub1_830, i_16_, i_19_, i_17_);
						}
						sceneGraphNode = class88.aClass180_826;
					}
					RuntimeException_Sub1.addWallLocation(level, x, z, y, sceneGraphNode, null, Class156.anIntArray1458[rotation], 0, bitPackedUid);
					if (locType.aBoolean1858 && bool_8_) {
						if (rotation == 0) {
							Npc.aByteArrayArrayArray3754[level][x][z + 1] = (byte) 50;
						} else if (rotation == 1) {
							Npc.aByteArrayArrayArray3754[level][x - -1][1 + z] = (byte) 50;
						} else if (rotation != 2) {
							if (rotation == 3) {
								Npc.aByteArrayArrayArray3754[level][x][z] = (byte) 50;
							}
						} else {
							Npc.aByteArrayArrayArray3754[level][1 + x][z] = (byte) 50;
						}
					}
					if (locType.anInt1821 != 0 && collisionMap != null) {
						collisionMap.method219(x, z, locType.aBoolean1844, !locType.aBoolean1880, type, rotation);
					}
				} else if (type == 2) {
					final int i_27_ = 0x3 & rotation - -1;
					SceneGraphNode sceneGraphNode;
					SceneGraphNode class180_28_;
					if (locType.animationId != -1 || locType.anIntArray1881 != null || locType.childrenIDs != null || locType.aBoolean1863) {
						sceneGraphNode = new AnimatedLocation(locationId, 2, rotation + 4, level2, x, z, -1, locType.aBoolean1864, null);
						class180_28_ = new AnimatedLocation(locationId, 2, i_27_, level2, x, z, -1, locType.aBoolean1864, null);
					} else {
						Class88 class88 = locType.method2453(i_16_, bool_8_, 2, y, is, is_21_, bool_22_, rotation + 4, i_17_, null);
						if (HDToolkit.glEnabled && bool_22_) {
							Class47.method389(class88.aClass107_Sub1_830, i_16_, i_19_, i_17_);
						}
						sceneGraphNode = class88.aClass180_826;
						class88 = locType.method2453(i_16_, bool_8_, 2, y, is, is_21_, bool_22_, i_27_, i_17_, null);
						if (HDToolkit.glEnabled && bool_22_) {
							Class47.method389(class88.aClass107_Sub1_830, i_16_, i_19_, i_17_);
						}
						class180_28_ = class88.aClass180_826;
					}
					RuntimeException_Sub1.addWallLocation(level, x, z, y, sceneGraphNode, class180_28_, Class53.anIntArray485[rotation], Class53.anIntArray485[i_27_], bitPackedUid);
					if (locType.anInt1866 == 1 && bool_8_) {
						if (rotation != 0) {
							if (rotation != 1) {
								if (rotation == 2) {
									Class110.tileOccludeFlags[level][x + 1][z] |= 0x1;
									Class110.tileOccludeFlags[level][x][z] |= 0x2;
								} else if (rotation == 3) {
									Class110.tileOccludeFlags[level][x][z] |= 0x2;
									Class110.tileOccludeFlags[level][x][z] |= 0x1;
								}
							} else {
								Class110.tileOccludeFlags[level][x][z + 1] |= 0x2;
								Class110.tileOccludeFlags[level][x + 1][z] |= 0x1;
							}
						} else {
							Class110.tileOccludeFlags[level][x][z] |= 0x1;
							Class110.tileOccludeFlags[level][x][z + 1] |= 0x2;
						}
					}
					if (locType.anInt1821 != 0 && collisionMap != null) {
						collisionMap.method219(x, z, locType.aBoolean1844, !locType.aBoolean1880, type, rotation);
					}
					if (locType.anInt1819 != 16) {
						Class120_Sub12_Sub2.method1201(level, x, z, locType.anInt1819);
					}
				} else if (type == 3) {
					SceneGraphNode sceneGraphNode;
					if (locType.animationId != -1 || locType.anIntArray1881 != null || locType.childrenIDs != null || locType.aBoolean1863) {
						sceneGraphNode = new AnimatedLocation(locationId, 3, rotation, level2, x, z, -1, locType.aBoolean1864, null);
					} else {
						final Class88 class88 = locType.method2453(i_16_, bool_8_, 3, y, is, is_21_, bool_22_, rotation, i_17_, null);
						if (HDToolkit.glEnabled && bool_22_) {
							Class47.method389(class88.aClass107_Sub1_830, i_16_, i_19_, i_17_);
						}
						sceneGraphNode = class88.aClass180_826;
					}
					RuntimeException_Sub1.addWallLocation(level, x, z, y, sceneGraphNode, null, Class156.anIntArray1458[rotation], 0, bitPackedUid);
					if (locType.aBoolean1858 && bool_8_) {
						if (rotation == 0) {
							Npc.aByteArrayArrayArray3754[level][x][1 + z] = (byte) 50;
						} else if (rotation == 1) {
							Npc.aByteArrayArrayArray3754[level][1 + x][1 + z] = (byte) 50;
						} else if (rotation == 2) {
							Npc.aByteArrayArrayArray3754[level][1 + x][z] = (byte) 50;
						} else if (rotation == 3) {
							Npc.aByteArrayArrayArray3754[level][x][z] = (byte) 50;
						}
					}
					if (locType.anInt1821 != 0 && collisionMap != null) {
						collisionMap.method219(x, z, locType.aBoolean1844, !locType.aBoolean1880, type, rotation);
					}
				} else if (type == 9) {
					SceneGraphNode sceneGraphNode;
					if (locType.animationId != -1 || locType.anIntArray1881 != null || locType.childrenIDs != null || locType.aBoolean1863) {
						sceneGraphNode = new AnimatedLocation(locationId, type, rotation, level2, x, z, -1, locType.aBoolean1864, null);
					} else {
						final Class88 class88 = locType.method2453(i_16_, bool_8_, type, y, is, is_21_, bool_22_, rotation, i_17_, null);
						if (HDToolkit.glEnabled && bool_22_) {
							Class47.method389(class88.aClass107_Sub1_830, i_16_, i_19_, i_17_);
						}
						sceneGraphNode = class88.aClass180_826;
					}
					method774(level, x, z, y, 1, 1, sceneGraphNode, 0, bitPackedUid);
					if (locType.anInt1821 != 0 && collisionMap != null) {
						collisionMap.method213(x, z, i_10_, i_11_, locType.aBoolean1844, !locType.aBoolean1880);
					}
					if (locType.anInt1819 != 16) {
						Class120_Sub12_Sub2.method1201(level, x, z, locType.anInt1819);
					}
				} else if (type == 4) {
					SceneGraphNode sceneGraphNode;
					if (locType.animationId != -1 || locType.anIntArray1881 != null || locType.childrenIDs != null || locType.aBoolean1863) {
						sceneGraphNode = new AnimatedLocation(locationId, 4, rotation, level2, x, z, -1, locType.aBoolean1864, null);
					} else {
						final Class88 class88 = locType.method2453(i_16_, bool_8_, 4, y, is, is_21_, bool_22_, rotation, i_17_, null);
						if (HDToolkit.glEnabled && bool_22_) {
							Class47.method389(class88.aClass107_Sub1_830, i_16_, i_19_, i_17_);
						}
						sceneGraphNode = class88.aClass180_826;
					}
					Class11.addWallDecoration(level, x, z, y, sceneGraphNode, null, Class53.anIntArray485[rotation], 0, 0, 0, bitPackedUid);
				} else if (type == 5) {
					final long wallLocUid = Class114.getWallLocationUid(x, z, level);
					int i_30_ = 16;
					if (wallLocUid != 0L) {
						i_30_ = LocType.list((int) (wallLocUid >>> 32) & 0x7fffffff).anInt1819;
					}
					SceneGraphNode sceneGraphNode;
					if (locType.animationId == -1 && locType.anIntArray1881 == null && locType.childrenIDs == null && !locType.aBoolean1863) {
						final Class88 class88 = locType.method2453(i_16_, bool_8_, 4, y, is, is_21_, bool_22_, rotation, i_17_, null);
						if (HDToolkit.glEnabled && bool_22_) {
							Class47.method389(class88.aClass107_Sub1_830, -(8 * Class109.anIntArray1037[rotation]) + i_16_, i_19_, i_17_ - client.anIntArray1396[rotation] * 8);
						}
						sceneGraphNode = class88.aClass180_826;
					} else {
						sceneGraphNode = new AnimatedLocation(locationId, 4, rotation, level2, x, z, -1, locType.aBoolean1864, null);
					}
					Class11.addWallDecoration(level, x, z, y, sceneGraphNode, null, Class53.anIntArray485[rotation], 0, Class109.anIntArray1037[rotation] * i_30_, client.anIntArray1396[rotation] * i_30_, bitPackedUid);
				} else if (type == 6) {
					final long l_31_ = Class114.getWallLocationUid(x, z, level);
					int i_32_ = 8;
					if (-1L != (l_31_ ^ 0xffffffffffffffffL)) {
						i_32_ = LocType.list(0x7fffffff & (int) (l_31_ >>> 32)).anInt1819 / 2;
					}
					SceneGraphNode sceneGraphNode;
					if (locType.animationId == -1 && locType.anIntArray1881 == null && locType.childrenIDs == null && !locType.aBoolean1863) {
						final Class88 class88 = locType.method2453(i_16_, bool_8_, 4, y, is, is_21_, bool_22_, rotation + 4, i_17_, null);
						if (HDToolkit.glEnabled && bool_22_) {
							Class47.method389(class88.aClass107_Sub1_830, i_16_ - Class55.anIntArray493[rotation] * 8, i_19_, -(GroundObjectNode.anIntArray3629[rotation] * 8) + i_17_);
						}
						sceneGraphNode = class88.aClass180_826;
					} else {
						sceneGraphNode = new AnimatedLocation(locationId, 4, rotation + 4, level2, x, z, -1, locType.aBoolean1864, null);
					}
					Class11.addWallDecoration(level, x, z, y, sceneGraphNode, null, 256, rotation, Class55.anIntArray493[rotation] * i_32_, GroundObjectNode.anIntArray3629[rotation] * i_32_, bitPackedUid);
				} else if (type == 7) {
					final int i_33_ = rotation + 2 & 0x3;
					SceneGraphNode sceneGraphNode;
					if (locType.animationId != -1 || locType.anIntArray1881 != null || locType.childrenIDs != null || locType.aBoolean1863) {
						sceneGraphNode = new AnimatedLocation(locationId, 4, 4 + i_33_, level2, x, z, -1, locType.aBoolean1864, null);
					} else {
						final Class88 class88 = locType.method2453(i_16_, bool_8_, 4, y, is, is_21_, bool_22_, 4 + i_33_, i_17_, null);
						if (HDToolkit.glEnabled && bool_22_) {
							Class47.method389(class88.aClass107_Sub1_830, i_16_, i_19_, i_17_);
						}
						sceneGraphNode = class88.aClass180_826;
					}
					Class11.addWallDecoration(level, x, z, y, sceneGraphNode, null, 256, i_33_, 0, 0, bitPackedUid);
				} else if (type == 8) {
					int i_34_ = 8;
					final long l_35_ = Class114.getWallLocationUid(x, z, level);
					if (0L != l_35_) {
						i_34_ = LocType.list((int) (l_35_ >>> 32) & 0x7fffffff).anInt1819 / 2;
					}
					final int i_36_ = rotation + 2 & 0x3;
					SceneGraphNode sceneGraphNode;
					SceneGraphNode class180_37_;
					if (locType.animationId == -1 && locType.anIntArray1881 == null && locType.childrenIDs == null && !locType.aBoolean1863) {
						final int i_38_ = Class55.anIntArray493[rotation] * 8;
						final int i_39_ = GroundObjectNode.anIntArray3629[rotation] * 8;
						Class88 class88 = locType.method2453(i_16_, bool_8_, 4, y, is, is_21_, bool_22_, 4 + rotation, i_17_, null);
						if (HDToolkit.glEnabled && bool_22_) {
							Class47.method389(class88.aClass107_Sub1_830, -i_38_ + i_16_, i_19_, -i_39_ + i_17_);
						}
						sceneGraphNode = class88.aClass180_826;
						class88 = locType.method2453(i_16_, bool_8_, 4, y, is, is_21_, bool_22_, 4 + i_36_, i_17_, null);
						if (HDToolkit.glEnabled && bool_22_) {
							Class47.method389(class88.aClass107_Sub1_830, i_16_ + -i_38_, i_19_, -i_39_ + i_17_);
						}
						class180_37_ = class88.aClass180_826;
					} else {
						sceneGraphNode = new AnimatedLocation(locationId, 4, 4 + rotation, level2, x, z, -1, locType.aBoolean1864, null);
						class180_37_ = new AnimatedLocation(locationId, 4, 4 + i_36_, level2, x, z, -1, locType.aBoolean1864, null);
					}
					Class11.addWallDecoration(level, x, z, y, sceneGraphNode, class180_37_, 256, rotation, i_34_ * Class55.anIntArray493[rotation], i_34_ * GroundObjectNode.anIntArray3629[rotation], bitPackedUid);
				}
			}
		}
	}

	static final LDFont constructLDFont(final js5 spriteJs5, final js5 fontJs5, final int group, final int file) {
		if (!Class10.decodedSprites(spriteJs5, group, file)) {
			return null;
		}
		return Class53.constructLDFont(fontJs5.getFile(group, file));
	}

	private static final boolean method774(final int i, final int i_43_, final int i_44_, final int i_45_, final int i_46_, final int i_47_, final SceneGraphNode sceneGraphNode, final int i_48_, final long l) {
		if (sceneGraphNode == null) {
			return true;
		}
		final int i_49_ = i_43_ * 128 + 64 * i_46_;
		final int i_50_ = i_44_ * 128 + 64 * i_47_;
		return ClanMember.method1403(i, i_43_, i_44_, i_46_, i_47_, i_49_, i_50_, i_45_, sceneGraphNode, i_48_, false, l);
	}

	static final void method775(final boolean bool, final int i, final int i_51_, final int i_52_, final int i_53_, final int i_54_, final int i_55_, final int i_56_, final int i_57_, final int i_59_) {
		for (int i_60_ = 0; i_60_ < 104; i_60_++) {
			for (int i_61_ = 0; i_61_ < 104; i_61_++) {
				Class179.anIntArrayArray1774[i_60_][i_61_] = 0;
				Class120_Sub2.anIntArrayArray2416[i_60_][i_61_] = 99999999;
			}
		}
		int i_62_ = i_56_;
		int i_63_ = i;
		int i_64_ = 0;
		Class179.anIntArrayArray1774[i_56_][i] = 99;
		int i_65_ = 0;
		Class120_Sub2.anIntArrayArray2416[i_56_][i] = 0;
		Class150.anIntArray1412[i_64_] = i_56_;
		Class120_Sub12.anIntArray2565[i_64_++] = i;
		boolean bool_66_ = false;
		final int[][] is = WallLocation.collisionMaps[Class173.gameLevel].collisionFlags;
		while (i_64_ != i_65_) {
			i_63_ = Class120_Sub12.anIntArray2565[i_65_];
			i_62_ = Class150.anIntArray1412[i_65_];
			i_65_ = 0xfff & i_65_ - -1;
			if (i_62_ == i_51_ && i_54_ == i_63_) {
				bool_66_ = true;
				break;
			}
			if (i_55_ != 0) {
				if (i_55_ >= 5 && i_55_ != 10 || !WallLocation.collisionMaps[Class173.gameLevel].method220(i_54_, i_53_, i_63_, i_62_, i_51_, 1, -1 + i_55_)) {
					if (i_55_ < 10 && WallLocation.collisionMaps[Class173.gameLevel].method223(i_51_, i_62_, i_54_, i_63_, i_55_ + -1, i_53_, 1)) {
						bool_66_ = true;
						break;
					}
				} else {
					bool_66_ = true;
					break;
				}
			}
			if (i_59_ != 0 && i_52_ != 0 && WallLocation.collisionMaps[Class173.gameLevel].method216(i_63_, -1, i_57_, 1, i_54_, i_51_, i_52_, i_59_, i_62_)) {
				bool_66_ = true;
				break;
			}
			final int i_67_ = 1 + Class120_Sub2.anIntArrayArray2416[i_62_][i_63_];
			if (i_62_ > 0 && Class179.anIntArrayArray1774[-1 + i_62_][i_63_] == 0 && (0x2c0108 & is[-1 + i_62_][i_63_]) == 0) {
				Class150.anIntArray1412[i_64_] = -1 + i_62_;
				Class120_Sub12.anIntArray2565[i_64_] = i_63_;
				i_64_ = i_64_ + 1 & 0xfff;
				Class179.anIntArrayArray1774[i_62_ - 1][i_63_] = 2;
				Class120_Sub2.anIntArrayArray2416[-1 + i_62_][i_63_] = i_67_;
			}
			if (i_62_ < 103 && Class179.anIntArrayArray1774[i_62_ + 1][i_63_] == 0 && (is[i_62_ - -1][i_63_] & 0x2c0180) == 0) {
				Class150.anIntArray1412[i_64_] = i_62_ - -1;
				Class120_Sub12.anIntArray2565[i_64_] = i_63_;
				Class179.anIntArrayArray1774[1 + i_62_][i_63_] = 8;
				i_64_ = 1 + i_64_ & 0xfff;
				Class120_Sub2.anIntArrayArray2416[i_62_ - -1][i_63_] = i_67_;
			}
			if (i_63_ > 0 && Class179.anIntArrayArray1774[i_62_][i_63_ - 1] == 0 && (is[i_62_][-1 + i_63_] & 0x2c0102) == 0) {
				Class150.anIntArray1412[i_64_] = i_62_;
				Class120_Sub12.anIntArray2565[i_64_] = i_63_ - 1;
				Class179.anIntArrayArray1774[i_62_][-1 + i_63_] = 1;
				i_64_ = 0xfff & i_64_ + 1;
				Class120_Sub2.anIntArrayArray2416[i_62_][-1 + i_63_] = i_67_;
			}
			if (i_63_ < 103 && Class179.anIntArrayArray1774[i_62_][1 + i_63_] == 0 && (0x2c0120 & is[i_62_][1 + i_63_]) == 0) {
				Class150.anIntArray1412[i_64_] = i_62_;
				Class120_Sub12.anIntArray2565[i_64_] = i_63_ + 1;
				Class179.anIntArrayArray1774[i_62_][1 + i_63_] = 4;
				i_64_ = i_64_ + 1 & 0xfff;
				Class120_Sub2.anIntArrayArray2416[i_62_][1 + i_63_] = i_67_;
			}
			if (i_62_ > 0 && i_63_ > 0 && Class179.anIntArrayArray1774[i_62_ + -1][-1 + i_63_] == 0 && (is[i_62_ - 1][-1 + i_63_] & 0x2c010e) == 0 && (0x2c0108 & is[-1 + i_62_][i_63_]) == 0 && (0x2c0102 & is[i_62_][i_63_ + -1]) == 0) {
				Class150.anIntArray1412[i_64_] = i_62_ - 1;
				Class120_Sub12.anIntArray2565[i_64_] = -1 + i_63_;
				Class179.anIntArrayArray1774[i_62_ - 1][-1 + i_63_] = 3;
				i_64_ = i_64_ + 1 & 0xfff;
				Class120_Sub2.anIntArrayArray2416[i_62_ + -1][-1 + i_63_] = i_67_;
			}
			if (i_62_ < 103 && i_63_ > 0 && Class179.anIntArrayArray1774[i_62_ - -1][-1 + i_63_] == 0 && (is[1 + i_62_][i_63_ + -1] & 0x2c0183) == 0 && (0x2c0180 & is[1 + i_62_][i_63_]) == 0 && (is[i_62_][i_63_ + -1] & 0x2c0102) == 0) {
				Class150.anIntArray1412[i_64_] = 1 + i_62_;
				Class120_Sub12.anIntArray2565[i_64_] = -1 + i_63_;
				i_64_ = 0xfff & i_64_ - -1;
				Class179.anIntArrayArray1774[1 + i_62_][i_63_ - 1] = 9;
				Class120_Sub2.anIntArrayArray2416[1 + i_62_][-1 + i_63_] = i_67_;
			}
			if (i_62_ > 0 && i_63_ < 103 && Class179.anIntArrayArray1774[i_62_ - 1][i_63_ - -1] == 0 && (0x2c0138 & is[i_62_ - 1][1 + i_63_]) == 0 && (is[i_62_ - 1][i_63_] & 0x2c0108) == 0 && (is[i_62_][i_63_ + 1] & 0x2c0120) == 0) {
				Class150.anIntArray1412[i_64_] = i_62_ - 1;
				Class120_Sub12.anIntArray2565[i_64_] = 1 + i_63_;
				i_64_ = i_64_ - -1 & 0xfff;
				Class179.anIntArrayArray1774[-1 + i_62_][i_63_ - -1] = 6;
				Class120_Sub2.anIntArrayArray2416[i_62_ - 1][i_63_ - -1] = i_67_;
			}
			if (i_62_ < 103 && i_63_ < 103 && Class179.anIntArrayArray1774[1 + i_62_][i_63_ - -1] == 0 && (is[i_62_ + 1][i_63_ + 1] & 0x2c01e0) == 0 && (is[i_62_ + 1][i_63_] & 0x2c0180) == 0 && (is[i_62_][1 + i_63_] & 0x2c0120) == 0) {
				Class150.anIntArray1412[i_64_] = i_62_ + 1;
				Class120_Sub12.anIntArray2565[i_64_] = 1 + i_63_;
				i_64_ = 0xfff & 1 + i_64_;
				Class179.anIntArrayArray1774[i_62_ - -1][1 + i_63_] = 12;
				Class120_Sub2.anIntArrayArray2416[i_62_ + 1][1 + i_63_] = i_67_;
			}
		}
		if (!bool_66_) {
			if (!bool) {
				return;
			}
			int i_68_ = 1000;
			int i_70_ = 100;
			for (int i_71_ = -10 + i_51_; i_71_ <= 10 + i_51_; i_71_++) {
				for (int i_72_ = i_54_ - 10; i_54_ + 10 >= i_72_; i_72_++) {
					if (i_71_ >= 0 && i_72_ >= 0 && i_71_ < 104 && i_72_ < 104 && Class120_Sub2.anIntArrayArray2416[i_71_][i_72_] < 100) {
						int i_73_ = 0;
						if (i_51_ <= i_71_) {
							if (i_59_ + i_51_ - 1 < i_71_) {
								i_73_ = i_71_ - -1 - (i_59_ + i_51_);
							}
						} else {
							i_73_ = -i_71_ + i_51_;
						}
						int i_74_ = 0;
						if (i_54_ > i_72_) {
							i_74_ = -i_72_ + i_54_;
						} else if (i_54_ - (-i_52_ + 1) < i_72_) {
							i_74_ = -i_54_ + -i_52_ + 1 + i_72_;
						}
						final int i_75_ = i_74_ * i_74_ + i_73_ * i_73_;
						if (i_68_ > i_75_ || i_68_ == i_75_ && i_70_ > Class120_Sub2.anIntArrayArray2416[i_71_][i_72_]) {
							i_63_ = i_72_;
							i_70_ = Class120_Sub2.anIntArrayArray2416[i_71_][i_72_];
							i_68_ = i_75_;
							i_62_ = i_71_;
						}
					}
				}
			}
			if (i_68_ == 1000 || i_62_ == i_56_ && i_63_ == i) {
				return;
			}
		}
		Class120_Sub12_Sub26.flagX = i_62_;
		SceneGroundObject.packetSetFlagPosition = false;
		Class65.flagY = i_63_;
	}
}
