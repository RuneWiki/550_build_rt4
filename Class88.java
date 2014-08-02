/* Class88 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class88 {
	SceneGraphNode aClass180_826;
	static int anInt827;
	static boolean spellSelected = false;
	static Deque aClass105_829;
	LDIndexedSprite aClass107_Sub1_830;
	static Queue aClass177_831;
	static int anInt832;
	static int[] anIntArray833;
	static js5 aClass50_834;
	static boolean aBoolean835;

	static {
		anInt827 = 0;
		aClass105_829 = new Deque();
		aClass177_831 = new Queue();
		anIntArray833 = new int[32];
		aBoolean835 = false;
	}

	static final void method743(final byte i, final int i_0_, final int i_1_, final int i_2_, final CollisionMap collisionMap, final int i_3_, final int i_4_) {
		try {
			int i_5_ = -1;
			long l = 0L;
			if (i > -97) {
				aClass105_829 = null;
			}
			if (i_3_ == 0) {
				l = Class114.method1005(i_4_, i_2_, i_0_);
			} else if (i_3_ == 1) {
				l = JagexInterface.method2502(i_4_, i_2_, i_0_);
			} else if (i_3_ != 2) {
				if (i_3_ == 3) {
					l = Class79_Sub1.method696(i_4_, i_2_, i_0_);
				}
			} else {
				l = Class120_Sub11.method1173(i_4_, i_2_, i_0_);
			}
			final int i_6_ = ((int) l & 0x7dc53) >> 14;
			i_5_ = 0x7fffffff & (int) (l >>> 32);
			final int i_7_ = 0x3 & (int) l >> 20;
			LocType locType = LocType.list(i_5_);
			if (locType.method2466()) {
				Class120_Sub12.method1183(i_2_, locType, i_0_, 16157, i_4_);
			}
			if ((l ^ 0xffffffffffffffffL) != -1L) {
				SceneGraphNode sceneGraphNode = null;
				SceneGraphNode class180_8_ = null;
				if (i_3_ == 0) {
					final Class182 class182 = Class99.method821(i_0_, i_4_, i_2_);
					if (class182 != null) {
						class180_8_ = class182.aClass180_1796;
						sceneGraphNode = class182.aClass180_1800;
					}
					if (locType.anInt1821 != 0) {
						collisionMap.method215(i_7_, i_4_, i_6_, i_2_, !locType.aBoolean1880, locType.aBoolean1844);
					}
				} else if (i_3_ == 1) {
					final Class186 class186 = Class153.method2072(i_0_, i_4_, i_2_);
					if (class186 != null) {
						sceneGraphNode = class186.aClass180_1901;
						class180_8_ = class186.aClass180_1898;
					}
				} else if (i_3_ == 2) {
					final Class28 class28 = Class120_Sub12_Sub17.method1281(i_0_, i_4_, i_2_);
					if (class28 != null) {
						sceneGraphNode = class28.aClass180_174;
					}
					if (locType.anInt1821 != 0 && i_4_ + locType.sizeX < 104 && locType.sizeX + i_2_ < 104 && i_4_ + locType.sizeZ < 104 && locType.sizeZ + i_2_ < 104) {
						collisionMap.method214(i_7_, i_2_, locType.sizeZ, i_4_, locType.sizeX, locType.aBoolean1844, !locType.aBoolean1880);
					}
				} else if (i_3_ == 3) {
					final Class36 class36 = Class118.method1022(i_0_, i_4_, i_2_);
					if (class36 != null) {
						sceneGraphNode = class36.aClass180_309;
					}
					if (locType.anInt1821 == 1) {
						collisionMap.method228(i_4_, i_2_);
					}
				}
				if (locType.childrenIDs != null) {
					locType = locType.handleVarp();
				}
				if (HDToolkit.glEnabled && locType != null && locType.aBoolean1823) {
					if (i_6_ != 2) {
						if (i_6_ != 5) {
							if (i_6_ == 6) {
								if (!(sceneGraphNode instanceof AnimatedLocation)) {
									Buffer.method1094(i_4_, Class55.anIntArray493[i_7_] * 8, i_7_ + 4, i_1_, locType, (byte) 93, GroundObjectNode.anIntArray3629[i_7_] * 8, i_2_, 4);
								} else {
									((AnimatedLocation) sceneGraphNode).method2354();
								}
							} else if (i_6_ != 7) {
								if (i_6_ != 8) {
									if (i_6_ != 11) {
										if (!(sceneGraphNode instanceof AnimatedLocation)) {
											Buffer.method1094(i_4_, 0, i_7_, i_1_, locType, (byte) 93, 0, i_2_, i_6_);
										} else {
											((AnimatedLocation) sceneGraphNode).method2354();
										}
									} else if (sceneGraphNode instanceof AnimatedLocation) {
										((AnimatedLocation) sceneGraphNode).method2354();
									} else {
										Buffer.method1094(i_4_, 0, i_7_ + 4, i_1_, locType, (byte) 93, 0, i_2_, 10);
									}
								} else {
									if (sceneGraphNode instanceof AnimatedLocation) {
										((AnimatedLocation) sceneGraphNode).method2354();
									} else {
										Buffer.method1094(i_4_, Class55.anIntArray493[i_7_] * 8, 4 + i_7_, i_1_, locType, (byte) 93, 8 * GroundObjectNode.anIntArray3629[i_7_], i_2_, 4);
									}
									if (class180_8_ instanceof AnimatedLocation) {
										((AnimatedLocation) class180_8_).method2354();
									} else {
										Buffer.method1094(i_4_, Class55.anIntArray493[i_7_] * 8, 4 + (0x3 & i_7_ + 2), i_1_, locType, (byte) 93, GroundObjectNode.anIntArray3629[i_7_] * 8, i_2_, 4);
									}
								}
							} else if (sceneGraphNode instanceof AnimatedLocation) {
								((AnimatedLocation) sceneGraphNode).method2354();
							} else {
								Buffer.method1094(i_4_, 0, (0x3 & 2 + i_7_) + 4, i_1_, locType, (byte) 93, 0, i_2_, 4);
							}
						} else if (!(sceneGraphNode instanceof AnimatedLocation)) {
							Buffer.method1094(i_4_, 8 * Class109.anIntArray1037[i_7_], i_7_, i_1_, locType, (byte) 93, Class147.anIntArray1396[i_7_] * 8, i_2_, 4);
						} else {
							((AnimatedLocation) sceneGraphNode).method2354();
						}
					} else {
						if (sceneGraphNode instanceof AnimatedLocation) {
							((AnimatedLocation) sceneGraphNode).method2354();
						} else {
							Buffer.method1094(i_4_, 0, i_7_ + 4, i_1_, locType, (byte) 93, 0, i_2_, i_6_);
						}
						if (!(class180_8_ instanceof AnimatedLocation)) {
							Buffer.method1094(i_4_, 0, 0x3 & i_7_ - -1, i_1_, locType, (byte) 93, 0, i_2_, i_6_);
						} else {
							((AnimatedLocation) class180_8_).method2354();
						}
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("jh.A(").append(i).append(',').append(i_0_).append(',').append(i_1_).append(',').append(i_2_).append(',').append(collisionMap != null ? "{...}" : "null").append(',').append(i_3_).append(',').append(i_4_).append(')')
					.toString());
		}
	}

	static final void method744(final InterfaceListener interfaceListener) {
		ObjectCache.method194(interfaceListener, 200000);
	}

	public static void method745(final boolean bool) {
		try {
			if (!bool) {
				anInt832 = -38;
			}
			aClass105_829 = null;
			aClass50_834 = null;
			anIntArray833 = null;
			aClass177_831 = null;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("jh.C(").append(bool).append(')').toString());
		}
	}

	public Class88() {
		/* empty */
	}
}
