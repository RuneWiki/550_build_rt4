/* Class88 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class88 {
	SceneGraphNode aClass180_826;
	static int timoutCycle;
	static boolean spellSelected = false;
	static Deque aClass105_829;
	LDIndexedSprite aClass107_Sub1_830;
	static Queue aClass177_831;
	static int anInt832;
	static int[] anIntArray833;
	static js5 aClass50_834;
	static boolean interfaceSpriteIsNull;

	static {
		timoutCycle = 0;
		aClass105_829 = new Deque();
		aClass177_831 = new Queue();
		anIntArray833 = new int[32];
		interfaceSpriteIsNull = false;
	}

	static final void method743(final CollisionMap collisionMap, final int level, final int i_1_, final int z, final int i_3_, final int x) {
		long uid = 0L;
		if (i_3_ == 0) {
			uid = Class114.getWallLocationUid(x, z, level);
		} else if (i_3_ == 1) {
			uid = JagexInterface.getWallDecorationUid(x, z, level);
		} else if (i_3_ == 2) {
			uid = Class120_Sub11.method1173(x, z, level);
		} else if (i_3_ == 3) {
			uid = Class79_Sub1.getGroundDecorationUid(x, z, level);
		}
		final int i_6_ = ((int) uid & 0x7dc53) >> 14;
		int locId = (int) (uid >>> 32) & 0x7fffffff;
		final int i_7_ = (int) uid >> 20 & 0x3;
		LocType locType = LocType.list(locId);
		if (locType.hasAmbientSound()) {
			Class120_Sub12.method1183(locType, x, z, level);
		}
		if (uid != 0L) {
			SceneGraphNode sceneGraphNode = null;
			SceneGraphNode class180_8_ = null;
			if (i_3_ == 0) {
				final WallLocation wallLocation = Class99.removeWallLocation(x, z, level);
				if (wallLocation != null) {
					class180_8_ = wallLocation.aClass180_1796;
					sceneGraphNode = wallLocation.aClass180_1800;
				}
				if (locType.anInt1821 != 0) {
					collisionMap.method215(i_7_, x, i_6_, z, !locType.aBoolean1880, locType.aBoolean1844);
				}
			} else if (i_3_ == 1) {
				final WallDecoration wallDecoration = Class153.removeWallDecoration(x, z, level);
				if (wallDecoration != null) {
					sceneGraphNode = wallDecoration.aClass180_1901;
					class180_8_ = wallDecoration.aClass180_1898;
				}
			} else if (i_3_ == 2) {
				final Class28 class28 = Class120_Sub12_Sub17.method1281(x, z, level);
				if (class28 != null) {
					sceneGraphNode = class28.aClass180_174;
				}
				if (locType.anInt1821 != 0 && x + locType.sizeX < 104 && locType.sizeX + z < 104 && x + locType.sizeZ < 104 && locType.sizeZ + z < 104) {
					collisionMap.method214(i_7_, z, locType.sizeZ, x, locType.sizeX, locType.aBoolean1844, !locType.aBoolean1880);
				}
			} else if (i_3_ == 3) {
				final GroundDecoration class36 = Class118.removeGroundDecoration(x, z, level);
				if (class36 != null) {
					sceneGraphNode = class36.sceneGraphNode;
				}
				if (locType.anInt1821 == 1) {
					collisionMap.method228(x, z);
				}
			}
			if (locType.transmogrificationIds != null) {
				locType = locType.handleVarp();
			}
			if (HDToolkit.glEnabled && locType != null && locType.aBoolean1823) {
				if (i_6_ != 2) {
					if (i_6_ != 5) {
						if (i_6_ == 6) {
							if ((sceneGraphNode instanceof AnimatedLocation)) {
								((AnimatedLocation) sceneGraphNode).method2354();
							} else {
								Buffer.method1094(locType, x, Class55.anIntArray493[i_7_] * 8, i_7_ + 4, i_1_, GroundObjectNode.anIntArray3629[i_7_] * 8, z, 4);
							}
						} else if (i_6_ != 7) {
							if (i_6_ != 8) {
								if (i_6_ != 11) {
									if ((sceneGraphNode instanceof AnimatedLocation)) {
										((AnimatedLocation) sceneGraphNode).method2354();
									} else {
										Buffer.method1094(locType, x, 0, i_7_, i_1_, 0, z, i_6_);
									}
								} else if (sceneGraphNode instanceof AnimatedLocation) {
									((AnimatedLocation) sceneGraphNode).method2354();
								} else {
									Buffer.method1094(locType, x, 0, i_7_ + 4, i_1_, 0, z, 10);
								}
							} else {
								if (sceneGraphNode instanceof AnimatedLocation) {
									((AnimatedLocation) sceneGraphNode).method2354();
								} else {
									Buffer.method1094(locType, x, Class55.anIntArray493[i_7_] * 8, 4 + i_7_, i_1_, 8 * GroundObjectNode.anIntArray3629[i_7_], z, 4);
								}
								if (class180_8_ instanceof AnimatedLocation) {
									((AnimatedLocation) class180_8_).method2354();
								} else {
									Buffer.method1094(locType, x, Class55.anIntArray493[i_7_] * 8, 4 + (0x3 & i_7_ + 2), i_1_, GroundObjectNode.anIntArray3629[i_7_] * 8, z, 4);
								}
							}
						} else if (sceneGraphNode instanceof AnimatedLocation) {
							((AnimatedLocation) sceneGraphNode).method2354();
						} else {
							Buffer.method1094(locType, x, 0, (0x3 & 2 + i_7_) + 4, i_1_, 0, z, 4);
						}
					} else if (!(sceneGraphNode instanceof AnimatedLocation)) {
						Buffer.method1094(locType, x, 8 * Class109.anIntArray1037[i_7_], i_7_, i_1_, client.anIntArray1396[i_7_] * 8, z, 4);
					} else {
						((AnimatedLocation) sceneGraphNode).method2354();
					}
				} else {
					if (sceneGraphNode instanceof AnimatedLocation) {
						((AnimatedLocation) sceneGraphNode).method2354();
					} else {
						Buffer.method1094(locType, x, 0, i_7_ + 4, i_1_, 0, z, i_6_);
					}
					if ((class180_8_ instanceof AnimatedLocation)) {
						((AnimatedLocation) class180_8_).method2354();
					} else {
						Buffer.method1094(locType, x, 0, i_7_ + 1 & 0x3, i_1_, 0, z, i_6_);
					}
				}
			}
		}
	}

	static final void method744(final InterfaceListener interfaceListener) {
		ObjectCache.method194(interfaceListener, 200000);
	}

	public Class88() {
		/* empty */
	}
}
