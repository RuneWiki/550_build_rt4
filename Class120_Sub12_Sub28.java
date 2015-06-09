/* Class120_Sub12_Sub28 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class120_Sub12_Sub28 extends Class120_Sub12 {
	private int anInt3355 = 10;
	private int anInt3356 = 2048;
	private int anInt3357 = 0;
	private int[] anIntArray3358;
	private int[] anIntArray3359;
	static int loadingScreenState = 0;//1 maps, 2 objects

	static final void method1344(final CollisionMap[] class25s, final int[][][] is, final boolean underwater) {
		int levelAmount;
		if (underwater) {
			levelAmount = 1;
		} else {
			levelAmount = 4;
		}
		if (!underwater) {
			for (int level = 0; level < 4; level++) {
				for (int x = 0; x < 104; x++) {
					for (int z = 0; z < 104; z++) {
						if ((Class114.tileSettings[level][x][z] & 0x1) == 1) {
							int transformedLevel = level;
							if ((Class114.tileSettings[1][x][z] & 0x2) == 2) {
								transformedLevel--;
							}
							if (transformedLevel >= 0) {
								class25s[transformedLevel].addRangableFlag(x, z);
							}
						}
					}
				}
			}
		}
		final int[][] is_6_ = new int[104][104];
		final int[][] is_8_ = new int[104][104];
		for (int level = 0; level < levelAmount; level++) {
			final byte[][] is_10_ = Npc.aByteArrayArrayArray3754[level];
			if (HDToolkit.glEnabled) {
				if (Class120_Sub12_Sub6.highLightingDetail) {
					for (int i_11_ = 1; i_11_ < 103; i_11_++) {
						for (int i_12_ = 1; i_12_ < 103; i_12_++) {
							final int i_14_ = (is_10_[i_12_][i_11_ + -1] >> 2) + (is_10_[i_12_ + 1][i_11_] >> 3) + (is_10_[-1 + i_12_][i_11_] >> 2) + (is_10_[i_12_][1 + i_11_] >> 3) + (is_10_[i_12_][i_11_] >> 1);
							is_8_[i_12_][i_11_] = 74 - i_14_;
						}
					}
				} else {
					final int xLight0 = (int) AtmosphereManager.light0Position[0];
					final int yLight0 = (int) AtmosphereManager.light0Position[1];
					final int zLight0 = (int) AtmosphereManager.light0Position[2];
					final int i_18_ = (int) Math.sqrt(xLight0 * xLight0 + yLight0 * yLight0 + zLight0 * zLight0);
					final int i_19_ = 1024 * i_18_ >> 8;
					for (int i_20_ = 1; i_20_ < 103; i_20_++) {
						for (int i_21_ = 1; i_21_ < 103; i_21_++) {
							int i_22_ = 96;
							final int i_23_ = -OverridedJInterface.activeTileHeightMap[level][i_21_][i_20_ + -1] + OverridedJInterface.activeTileHeightMap[level][i_21_][1 + i_20_];
							final int i_24_ = OverridedJInterface.activeTileHeightMap[level][1 + i_21_][i_20_] + -OverridedJInterface.activeTileHeightMap[level][-1 + i_21_][i_20_];
							final int i_25_ = (int) Math.sqrt(65536 + i_24_ * i_24_ - -(i_23_ * i_23_));
							final int i_26_ = -65536 / i_25_;
							final int i_27_ = (i_23_ << 8) / i_25_;
							final int i_28_ = (i_24_ << 8) / i_25_;
							i_22_ += (zLight0 * i_27_ + xLight0 * i_28_ - -(yLight0 * i_26_)) / i_19_;
							final int i_29_ = (is_10_[i_21_][i_20_] >> 1) + (is_10_[i_21_][i_20_ - -1] >> 3) + (is_10_[i_21_ + 1][i_20_] >> 3) + (is_10_[i_21_ + -1][i_20_] >> 2) + (is_10_[i_21_][i_20_ - 1] >> 2);
							is_8_[i_21_][i_20_] = -(int) (1.7F * i_29_) + i_22_;
						}
					}
				}
			} else {
				final int xLight0 = -50;
				final int yLight0 = -10;
				final int zLight0 = -50;
				final int length = (int) Math.sqrt(xLight0 * xLight0 + yLight0 * yLight0 + zLight0 * zLight0);
				final int i_31_ = 768 * length >> 8;
				for (int z = 1; z < 103; z++) {
					for (int x = 1; x < 103; x++) {
						int i_34_ = 74;
						final int xHeightDiff = OverridedJInterface.activeTileHeightMap[level][x + 1][z] - OverridedJInterface.activeTileHeightMap[level][x - 1][z];
						final int yHeightDiff = 0x10000;
						final int zHeightDiff = OverridedJInterface.activeTileHeightMap[level][x][z + 1] - OverridedJInterface.activeTileHeightMap[level][x][z - 1];
						final int i_37_ = (int) Math.sqrt(xHeightDiff * xHeightDiff + yHeightDiff + zHeightDiff * zHeightDiff);
						final int i_38_ = (xHeightDiff << 8) / i_37_;
						final int i_39_ = -yHeightDiff / i_37_;
						final int i_40_ = (zHeightDiff << 8) / i_37_;
						i_34_ += (xLight0 * i_38_ + yLight0 * i_39_ + zLight0 * i_40_) / i_31_;
						final int i_41_ = (is_10_[x][z - 1] >> 2) + (is_10_[x - 1][z] >> 2) + (is_10_[x + 1][z] >> 3) + (is_10_[x][z + 1] >> 3) + (is_10_[x][z] >> 1);
						is_8_[x][z] = i_34_ - i_41_;
					}
				}
			}
			for (int i_42_ = 0; i_42_ < 104; i_42_++) {
				StringNode.anIntArray2733[i_42_] = 0;
				PacketBuffer.anIntArray3120[i_42_] = 0;
				Class120_Sub12_Sub31.anIntArray3383[i_42_] = 0;
				Buffer.anIntArray2477[i_42_] = 0;
				Class120_Sub12_Sub34.anIntArray3409[i_42_] = 0;
			}
			for (int i_43_ = -5; i_43_ < 104; i_43_++) {
				for (int i_44_ = 0; i_44_ < 104; i_44_++) {
					final int i_45_ = i_43_ + 5;
					if (i_45_ < 104) {
						final int i_46_ = Class120_Sub4.tileUnderlayIds[level][i_45_][i_44_] & 0xff;
						if (i_46_ > 0) {
							final UnderlayType overlayType = UnderlayType.list(i_46_ - 1);
							StringNode.anIntArray2733[i_44_] += overlayType.anInt1218;
							PacketBuffer.anIntArray3120[i_44_] += overlayType.anInt1222;
							Class120_Sub12_Sub31.anIntArray3383[i_44_] += overlayType.anInt1229;
							Buffer.anIntArray2477[i_44_] += overlayType.anInt1226;
							Class120_Sub12_Sub34.anIntArray3409[i_44_]++;
						}
					}
					final int i_47_ = i_43_ - 5;
					if (i_47_ >= 0) {
						final int i_48_ = Class120_Sub4.tileUnderlayIds[level][i_47_][i_44_] & 0xff;
						if (i_48_ > 0) {
							final UnderlayType overlayType = UnderlayType.list(i_48_- 1);
							StringNode.anIntArray2733[i_44_] -= overlayType.anInt1218;
							PacketBuffer.anIntArray3120[i_44_] -= overlayType.anInt1222;
							Class120_Sub12_Sub31.anIntArray3383[i_44_] -= overlayType.anInt1229;
							Buffer.anIntArray2477[i_44_] -= overlayType.anInt1226;
							Class120_Sub12_Sub34.anIntArray3409[i_44_]--;
						}
					}
				}
				if (i_43_ >= 0) {
					int i_49_ = 0;
					int i_50_ = 0;
					int i_51_ = 0;
					int i_52_ = 0;
					int i_53_ = 0;
					for (int i_54_ = -5; i_54_ < 104; i_54_++) {
						final int i_55_ = i_54_ + 5;
						if (i_55_ < 104) {
							i_51_ += Buffer.anIntArray2477[i_55_];
							i_52_ += Class120_Sub12_Sub34.anIntArray3409[i_55_];
							i_53_ += PacketBuffer.anIntArray3120[i_55_];
							i_49_ += StringNode.anIntArray2733[i_55_];
							i_50_ += Class120_Sub12_Sub31.anIntArray3383[i_55_];
						}
						final int i_56_ = i_54_ - 5;
						if (i_56_ >= 0) {
							i_51_ -= Buffer.anIntArray2477[i_56_];
							i_50_ -= Class120_Sub12_Sub31.anIntArray3383[i_56_];
							i_49_ -= StringNode.anIntArray2733[i_56_];
							i_52_ -= Class120_Sub12_Sub34.anIntArray3409[i_56_];
							i_53_ -= PacketBuffer.anIntArray3120[i_56_];
						}
						if (i_54_ >= 0 && i_52_ > 0) {
							is_6_[i_43_][i_54_] = MapFunctionNode.method1442(i_49_ * 256 / i_51_, i_53_ / i_52_, i_50_ / i_52_);
						}
					}
				}
			}
			for (int x = 1; x < 103; x++) {
				for (int z = 1; z < 103; z++) {
					if (underwater || Class143_Sub1.allLevelsAreVisible() || (Class114.tileSettings[0][x][z] & 0x2) != 0 || (Class114.tileSettings[level][x][z] & 0x10) == 0 && SubScript.method2242(x, z, level) == SpotAnimationNode.visibleLevel) {
						if (DummyOutputStream.anInt29 > level) {
							DummyOutputStream.anInt29 = level;
						}
						final int underlayId = Class120_Sub4.tileUnderlayIds[level][x][z] & 0xff;
						final int overlayId = Class99.tileOverlayIds[level][x][z] & 0xff;
						if (underlayId > 0 || overlayId > 0) {
							final int tileHeight = OverridedJInterface.activeTileHeightMap[level][x][z];
							final int tileHeightNorth = OverridedJInterface.activeTileHeightMap[level][x][z + 1];
							final int tileHeightEast = OverridedJInterface.activeTileHeightMap[level][x + 1][z];
							final int tileHeightNorthEast = OverridedJInterface.activeTileHeightMap[level][x + 1][z + 1];
							if (level > 0) {
								boolean occlude = true;
								if (underlayId == 0 && MapFunctionNode.tileOverlayShapes[level][x][z] != 0) {
									occlude = false;
								}
								if (overlayId > 0 && !OverlayType.list(overlayId - 1).occlude) {
									occlude = false;
								}
								if (occlude && tileHeight == tileHeightEast && tileHeightNorthEast == tileHeight && tileHeight == tileHeightNorth) {
									Class110.tileOccludeFlags[level][x][z] |= 0x4;
								}
							}
							int i_66_;
							int overlayMinimapColor;
							if (underlayId <= 0) {
								i_66_ = -1;
								overlayMinimapColor = 0;
							} else {
								i_66_ = is_6_[x][z];
								int i_68_ = (i_66_ & 0x7f);
								if (i_68_ < 0) {
									i_68_ = 0;
								} else if (i_68_ > 127) {
									i_68_ = 127;
								}
								final int i_69_ = (0xfc00 & i_66_) + (i_66_ & 0x380) + i_68_;
								overlayMinimapColor = Rasterizer.palette[Class178.method2256(i_69_, 96)];
							}
							final int i_73_ = is_8_[x][z];
							final int i_70_ = is_8_[x + 1][z];
							final int i_72_ = is_8_[x][z + 1];
							final int i_71_ = is_8_[x + 1][z + 1];
							if (overlayId == 0) {
								Class120_Sub12.setTile(level, x, z, 0, 0, -1, tileHeight, tileHeightEast, tileHeightNorthEast, tileHeightNorth, Class178.method2256(i_66_, i_73_), Class178.method2256(i_66_, i_70_), Class178.method2256(i_66_, i_71_), Class178.method2256(i_66_, i_72_), 0, 0, 0, 0, overlayMinimapColor, 0);
								if (HDToolkit.glEnabled && level > 0 && i_66_ != -1 && UnderlayType.list(underlayId - 1).aBoolean1220) {
									ShadowManager.method384(0, 0, true, false, x, z, tileHeight - OverridedJInterface.activeTileHeightMap[0][x][z], tileHeightEast - OverridedJInterface.activeTileHeightMap[0][x + 1][z], tileHeightNorthEast - OverridedJInterface.activeTileHeightMap[0][x + 1][z + 1], tileHeightNorth - OverridedJInterface.activeTileHeightMap[0][x][z + 1]);
								}
								if (HDToolkit.glEnabled && !underwater && NodeCache.anIntArrayArray300 != null && level == 0) {
									while_130_: for (int i_74_ = x + -1; i_74_ <= x + 1; i_74_++) {
										for (int i_75_ = z + -1; z + 1 >= i_75_; i_75_++) {
											if ((i_74_ != x || z != i_75_) && i_74_ >= 0 && i_74_ < 104 && i_75_ >= 0 && i_75_ < 104) {
												final int i_76_ = Class99.tileOverlayIds[level][i_74_][i_75_] & 0xff;
												if (i_76_ != 0) {
													final OverlayType class124 = OverlayType.list(-1 + i_76_);
													if (class124.textureId != -1 && Class120_Sub12_Sub29.method1355(Rasterizer.anInterface5_973.method18(class124.textureId))) {
														NodeCache.anIntArrayArray300[x][z] = (class124.anInt1199 << 24) + class124.anInt1200;
														break while_130_;
													}
												}
											}
										}
									}
								}
							} else {
								final int i_77_ = MapFunctionNode.tileOverlayShapes[level][x][z] + 1;
								final byte i_78_ = Class8.tileOverlayRotations[level][x][z];
								final OverlayType class124 = OverlayType.list(-1 + overlayId);
								if (HDToolkit.glEnabled && !underwater && NodeCache.anIntArrayArray300 != null && level == 0) {
									if ((class124.textureId ^ 0xffffffff) == 0 || !Class120_Sub12_Sub29.method1355(Rasterizer.anInterface5_973.method18(class124.textureId))) {
										while_129_: for (int i_79_ = x - 1; i_79_ <= x + 1; i_79_++) {
											for (int i_80_ = z - 1; i_80_ <= z + 1; i_80_++) {
												if ((i_79_ != x || i_80_ != z) && i_79_ >= 0 && i_79_ < 104 && i_80_ >= 0 && i_80_ < 104) {
													final int i_81_ = Class99.tileOverlayIds[level][i_79_][i_80_] & 0xff;
													if (i_81_ != 0) {
														final OverlayType class124_82_ = OverlayType.list(-1 + i_81_);
														if (class124_82_.textureId != -1 && Class120_Sub12_Sub29.method1355(Rasterizer.anInterface5_973.method18(class124_82_.textureId))) {
															NodeCache.anIntArrayArray300[x][z] = class124_82_.anInt1200 + (class124_82_.anInt1199 << 24);
															break while_129_;
														}
													}
												}
											}
										}
									} else {
										NodeCache.anIntArrayArray300[x][z] = (class124.anInt1199 << 24) + class124.anInt1200;
									}
								}
								int i_83_ = class124.textureId;
								if (i_83_ >= 0 && !Rasterizer.anInterface5_973.method15(i_83_)) {
									i_83_ = -1;
								}
								int underlayMinimapColor;
								int i_85_;
								if (i_83_ >= 0) {
									i_85_ = -1;
									underlayMinimapColor = Rasterizer.palette[Class96.method789(Rasterizer.anInterface5_973.method20(i_83_), 96)];
								} else if (class124.color == -1) {
									underlayMinimapColor = 0;
									i_85_ = -2;
								} else {
									i_85_ = class124.color;
									int i_86_ = (0x7f & i_85_);
									if (i_86_ >= 0) {
										if (i_86_ > 127) {
											i_86_ = 127;
										}
									} else {
										i_86_ = 0;
									}
									final int i_87_ = i_86_ + (0xfc00 & i_85_) + (0x380 & i_85_);
									underlayMinimapColor = Rasterizer.palette[Class96.method789(i_87_, 96)];
								}
								if (class124.anInt1198 >= 0) {
									final int i_88_ = class124.anInt1198;
									int i_89_ = (0x7f & i_88_);
									if (i_89_ >= 0) {
										if (i_89_ > 127) {
											i_89_ = 127;
										}
									} else {
										i_89_ = 0;
									}
									final int i_90_ = (0xfc00 & i_88_) + (0x380 & i_88_) - -i_89_;
									underlayMinimapColor = Rasterizer.palette[Class96.method789(i_90_, 96)];
								}
								Class120_Sub12.setTile(level, x, z, i_77_, i_78_, i_83_, tileHeight, tileHeightEast, tileHeightNorthEast, tileHeightNorth, Class178.method2256(i_66_, i_73_), Class178.method2256(i_66_, i_70_), Class178.method2256(i_66_, i_71_), Class178.method2256(i_66_, i_72_), Class96.method789(i_85_, i_73_), Class96.method789(i_85_, i_70_), Class96.method789(i_85_, i_71_), Class96.method789(i_85_, i_72_), overlayMinimapColor, underlayMinimapColor);
								if (HDToolkit.glEnabled && level > 0) {
									ShadowManager.method384(i_77_, i_78_, i_85_ == -2 || !class124.aBoolean1193, i_66_ == -1 || !UnderlayType.list(underlayId - 1).aBoolean1220, x, z, -OverridedJInterface.activeTileHeightMap[0][x][z] + tileHeight, tileHeightEast - OverridedJInterface.activeTileHeightMap[0][x - -1][z], tileHeightNorthEast + -OverridedJInterface.activeTileHeightMap[0][x + 1][z + 1], tileHeightNorth - OverridedJInterface.activeTileHeightMap[0][x][z + 1]);
								}
							}
						}
					}
				}
			}
			if (HDToolkit.glEnabled) {
				final float[][] fs = new float[105][105];
				final float[][] fs_91_ = new float[105][105];
				final float[][] fs_92_ = new float[105][105];
				final int[][] is_93_ = OverridedJInterface.activeTileHeightMap[level];
				for (int i_94_ = 1; i_94_ <= 103; i_94_++) {
					for (int i_95_ = 1; i_95_ <= 103; i_95_++) {
						final int i_96_ = -is_93_[i_95_][-1 + i_94_] + is_93_[i_95_][1 + i_94_];
						final int i_97_ = is_93_[i_95_ - -1][i_94_] - is_93_[-1 + i_95_][i_94_];
						final float f = (float) Math.sqrt(65536 + i_97_ * i_97_ + i_96_ * i_96_);
						fs[i_95_][i_94_] = i_97_ / f;
						fs_91_[i_95_][i_94_] = -256.0F / f;
						fs_92_[i_95_][i_94_] = i_96_ / f;
					}
				}
				if (underwater) {
					final HDTile[] class120_sub9s = Class120_Sub12_Sub14.constructUnderlayHDTiles(is, Class99.tileOverlayIds[level], fs, NodeCache.anIntArrayArray300, is_6_, fs_91_, MapFunctionNode.tileOverlayShapes[level], is_8_, Class8.tileOverlayRotations[level], level, fs_92_, Class120_Sub12_Sub33.surfaceTileHeightMap[0], Class114.tileSettings, Class120_Sub4.tileUnderlayIds[level], OverridedJInterface.activeTileHeightMap[level]);
					Class65.setHDTiles(level, class120_sub9s);
				} else {
					final HDTile[] class120_sub9s = Class120_Sub12_Sub14.constructUnderlayHDTiles(is, Class99.tileOverlayIds[level], fs, null, is_6_, fs_91_, MapFunctionNode.tileOverlayShapes[level], is_8_, Class8.tileOverlayRotations[level], level, fs_92_, null, Class114.tileSettings, Class120_Sub4.tileUnderlayIds[level], OverridedJInterface.activeTileHeightMap[level]);
					final HDTile[] class120_sub9s_98_ = Class132.constructOverlayHDTiles(Class114.tileSettings, Class99.tileOverlayIds[level], is_8_, fs, level, MapFunctionNode.tileOverlayShapes[level], Class8.tileOverlayRotations[level], OverridedJInterface.activeTileHeightMap[level], Class120_Sub4.tileUnderlayIds[level], fs_91_, fs_92_);
					final HDTile[] class120_sub9s_99_ = new HDTile[class120_sub9s.length + class120_sub9s_98_.length];
					for (int i_100_ = 0; i_100_ < class120_sub9s.length; i_100_++) {
						class120_sub9s_99_[i_100_] = class120_sub9s[i_100_];
					}
					for (int i_101_ = 0; i_101_ < class120_sub9s_98_.length; i_101_++) {
						class120_sub9s_99_[i_101_ + class120_sub9s.length] = class120_sub9s_98_[i_101_];
					}
					Class65.setHDTiles(level, class120_sub9s_99_);
					Js5Worker.method368(Class8.tileOverlayRotations[level], LightManager.lightsPos, LightManager.lights, OverridedJInterface.activeTileHeightMap[level], Class120_Sub4.tileUnderlayIds[level], fs, Class99.tileOverlayIds[level], fs_92_, fs_91_, level, MapFunctionNode.tileOverlayShapes[level]);
				}
			}
			Class120_Sub4.tileUnderlayIds[level] = null;
			Class99.tileOverlayIds[level] = null;
			MapFunctionNode.tileOverlayShapes[level] = null;
			Class8.tileOverlayRotations[level] = null;
			Npc.aByteArrayArrayArray3754[level] = null;
		}
		Class38.method314(-50, -10, -50);
		if (!underwater) {
			for (int x = 0; x < 104; x++) {
				for (int z = 0; z < 104; z++) {
					if ((Class114.tileSettings[1][x][z] & 0x2) == 2) {
						Class127.setBridgeTile(x, z);
					}
				}
			}
			for (int i_104_ = 0; i_104_ < 4; i_104_++) {
				for (int i_105_ = 0; i_105_ <= 104; i_105_++) {
					for (int i_106_ = 0; i_106_ <= 104; i_106_++) {
						if ((0x1 & Class110.tileOccludeFlags[i_104_][i_106_][i_105_]) != 0) {
							int i_107_ = i_105_;
							int i_108_ = i_104_;
							int i_109_ = i_105_;
							for (/**/; i_107_ < 104; i_107_++) {
								if ((Class110.tileOccludeFlags[i_104_][i_106_][i_107_ + 1] & 0x1) == 0) {
									break;
								}
							}
							for (/**/; i_109_ > 0; i_109_--) {
								if ((0x1 & Class110.tileOccludeFlags[i_104_][i_106_][-1 + i_109_]) == 0) {
									break;
								}
							}
							while_131_: for (/**/; i_108_ > 0; i_108_--) {
								for (int i_110_ = i_109_; i_110_ <= i_107_; i_110_++) {
									if ((0x1 & Class110.tileOccludeFlags[-1 + i_108_][i_106_][i_110_]) == 0) {
										break while_131_;
									}
								}
							}
							int i_111_;
							while_132_: for (i_111_ = i_104_; i_111_ < 3; i_111_++) {
								for (int i_112_ = i_109_; i_112_ <= i_107_; i_112_++) {
									if ((0x1 & Class110.tileOccludeFlags[i_111_ - -1][i_106_][i_112_]) == 0) {
										break while_132_;
									}
								}
							}
							final int i_113_ = (1 + -i_109_ + i_107_) * (i_111_ - -1 - i_108_);
							if (i_113_ >= 8) {
								final int i_115_ = OverridedJInterface.activeTileHeightMap[i_111_][i_106_][i_109_] + -240;
								final int i_116_ = OverridedJInterface.activeTileHeightMap[i_108_][i_106_][i_109_];
								AbstractTimer.method734(1, 128 * i_106_, 128 * i_106_, i_109_ * 128, 128 + 128 * i_107_, i_115_, i_116_);
								for (int i_117_ = i_108_; i_111_ >= i_117_; i_117_++) {
									for (int i_118_ = i_109_; i_107_ >= i_118_; i_118_++) {
										Class110.tileOccludeFlags[i_117_][i_106_][i_118_] = Class120_Sub12_Sub3.method1207(Class110.tileOccludeFlags[i_117_][i_106_][i_118_], -2);
									}
								}
							}
						}
						if ((Class110.tileOccludeFlags[i_104_][i_106_][i_105_] & 0x2) != 0) {
							int i_119_;
							for (i_119_ = i_106_; i_119_ > 0 && (0x2 & Class110.tileOccludeFlags[i_104_][-1 + i_119_][i_105_]) != 0; i_119_--) {
								/* empty */
							}
							int i_120_;
							for (i_120_ = i_106_; i_120_ < 104 && (Class110.tileOccludeFlags[i_104_][i_120_ - -1][i_105_] & 0x2) != 0; i_120_++) {
								/* empty */
							}
							int i_121_ = i_104_;
							int i_122_ = i_104_;
							while_133_: for (/**/; i_121_ > 0; i_121_--) {
								for (int i_123_ = i_119_; i_120_ >= i_123_; i_123_++) {
									if ((Class110.tileOccludeFlags[-1 + i_121_][i_123_][i_105_] & 0x2) == 0) {
										break while_133_;
									}
								}
							}
							while_134_: for (/**/; i_122_ < 3; i_122_++) {
								for (int i_124_ = i_119_; i_124_ <= i_120_; i_124_++) {
									if ((0x2 & Class110.tileOccludeFlags[1 + i_122_][i_124_][i_105_]) == 0) {
										break while_134_;
									}
								}
							}
							final int i_125_ = (1 + i_122_ - i_121_) * (1 + i_120_ - i_119_);
							if (i_125_ >= 8) {
								final int i_127_ = OverridedJInterface.activeTileHeightMap[i_122_][i_119_][i_105_] + -240;
								final int i_128_ = OverridedJInterface.activeTileHeightMap[i_121_][i_119_][i_105_];
								AbstractTimer.method734(2, i_119_ * 128, 128 * i_120_ + 128, 128 * i_105_, 128 * i_105_, i_127_, i_128_);
								for (int i_129_ = i_121_; i_122_ >= i_129_; i_129_++) {
									for (int i_130_ = i_119_; i_120_ >= i_130_; i_130_++) {
										Class110.tileOccludeFlags[i_129_][i_130_][i_105_] = Class120_Sub12_Sub3.method1207(Class110.tileOccludeFlags[i_129_][i_130_][i_105_], -3);
									}
								}
							}
						}
						if ((Class110.tileOccludeFlags[i_104_][i_106_][i_105_] & 0x4) != 0) {
							int i_131_ = i_106_;
							int i_132_ = i_106_;
							int i_133_;
							for (i_133_ = i_105_; i_133_ > 0 && (0x4 & Class110.tileOccludeFlags[i_104_][i_106_][-1 + i_133_]) != 0; i_133_--) {
								/* empty */
							}
							int i_134_;
							for (i_134_ = i_105_; i_134_ < 104; i_134_++) {
								if ((Class110.tileOccludeFlags[i_104_][i_106_][1 + i_134_] & 0x4) == 0) {
									break;
								}
							}
							while_135_: for (/**/; i_131_ > 0; i_131_--) {
								for (int i_135_ = i_133_; i_135_ <= i_134_; i_135_++) {
									if ((Class110.tileOccludeFlags[i_104_][-1 + i_131_][i_135_] & 0x4) == 0) {
										break while_135_;
									}
								}
							}
							while_136_: for (/**/; i_132_ < 104; i_132_++) {
								for (int i_136_ = i_133_; i_134_ >= i_136_; i_136_++) {
									if ((Class110.tileOccludeFlags[i_104_][i_132_ - -1][i_136_] & 0x4) == 0) {
										break while_136_;
									}
								}
							}
							if ((1 + -i_133_ + i_134_) * (1 + i_132_ + -i_131_) >= 4) {
								final int i_137_ = OverridedJInterface.activeTileHeightMap[i_104_][i_131_][i_133_];
								AbstractTimer.method734(4, i_131_ * 128, 128 + i_132_ * 128, i_133_ * 128, 128 + 128 * i_134_, i_137_, i_137_);
								for (int i_138_ = i_131_; i_132_ >= i_138_; i_138_++) {
									for (int i_139_ = i_133_; i_139_ <= i_134_; i_139_++) {
										Class110.tileOccludeFlags[i_104_][i_138_][i_139_] = Class120_Sub12_Sub3.method1207(Class110.tileOccludeFlags[i_104_][i_138_][i_139_], -5);
									}
								}
							}
						}
					}
				}
			}
		}
	}

	static final void method1345(final String string, final int i) {
		final InterfaceChangeNode class120_sub14_sub7 = InterfaceChangeNode.putInterfaceChange(2, i);
		class120_sub14_sub7.method1454();
		class120_sub14_sub7.aString3493 = string;
	}

	static final void drawMapFunctionSprite(final AbstractIndexedSprite abstractIndexedSprite, final JagexInterface jagexInterface, final int interfaceX, final int interfaceY, final int mapFunctionX, final int mapFunctionY) {
		if (abstractIndexedSprite != null) {
			final int dist = Math.max(jagexInterface.width / 2, jagexInterface.height / 2) + 10;
			final int maxDist = mapFunctionX * mapFunctionX + mapFunctionY * mapFunctionY;
			if (dist * dist >= maxDist) {
				final int rot = (int) DummyOutputStream.cameraYaw & 0x7ff;
				int rotSin = Rasterizer.sinTable[rot];
				int rotCos = Rasterizer.cosTable[rot];
				final int posX = mapFunctionX * rotCos + mapFunctionY * rotSin >> 16;
				final int posY = mapFunctionY * rotCos - mapFunctionX * rotSin >> 16;
				if (HDToolkit.glEnabled) {
					((HDIndexedSprite) abstractIndexedSprite).method928(interfaceX + posX + jagexInterface.width / 2 - abstractIndexedSprite.trimWidth / 2, interfaceY - posY + jagexInterface.height / 2 - abstractIndexedSprite.trimHeight / 2, (HDSprite) jagexInterface.constructSpriteFromId(false));
				} else {
					((LDIndexedSprite) abstractIndexedSprite).method924(interfaceX + posX + jagexInterface.width / 2 - abstractIndexedSprite.trimWidth / 2, interfaceY - posY + jagexInterface.height / 2 - abstractIndexedSprite.trimHeight / 2, jagexInterface.startOfSpriteLookupTable, jagexInterface.lengthOfSpriteLookupTable);
				}
			}
		}
	}

	static final void method1347(final int i, final int i_152_, final int i_153_, final int i_154_, final int i_156_, final int i_157_) {
		final int i_158_ = Class3.method83(Class120_Sub30_Sub2.anInt3699, i_156_, Identikit.anInt1334);
		final int i_159_ = Class3.method83(Class120_Sub30_Sub2.anInt3699, i_157_, Identikit.anInt1334);
		final int i_160_ = Class3.method83(MagnetType.anInt260, i_154_, ParamType.anInt3544);
		final int i_161_ = Class3.method83(MagnetType.anInt260, i, ParamType.anInt3544);
		final int i_162_ = Class3.method83(Class120_Sub30_Sub2.anInt3699, i_153_ + i_156_, Identikit.anInt1334);
		final int i_163_ = Class3.method83(Class120_Sub30_Sub2.anInt3699, i_157_ + -i_153_, Identikit.anInt1334);
		for (int i_164_ = i_158_; i_162_ > i_164_; i_164_++) {
			AmbientSound.fillArray(GameEntity.anIntArrayArray3009[i_164_], i_152_, i_160_, i_161_);
		}
		for (int i_165_ = i_159_; i_165_ > i_163_; i_165_--) {
			AmbientSound.fillArray(GameEntity.anIntArrayArray3009[i_165_], i_152_, i_160_, i_161_);
		}
		final int i_166_ = Class3.method83(MagnetType.anInt260, i_154_ - -i_153_, ParamType.anInt3544);
		final int i_167_ = Class3.method83(MagnetType.anInt260, i + -i_153_, ParamType.anInt3544);
		for (int i_168_ = i_162_; i_163_ >= i_168_; i_168_++) {
			final int[] is = GameEntity.anIntArrayArray3009[i_168_];
			AmbientSound.fillArray(is, i_152_, i_160_, i_166_);
			AmbientSound.fillArray(is, i_152_, i_167_, i_161_);
		}
	}

	@Override
	final void decode(final Buffer buffer, final int i_170_) {
		while_137_: do {
			do {
				if (i_170_ != 0) {
					if (i_170_ != 1) {
						if (i_170_ == 2) {
							break;
						}
						break while_137_;
					}
				} else {
					anInt3355 = buffer.getUByte();
					break while_137_;
				}
				anInt3356 = buffer.getUShort();
				break while_137_;
			} while (false);
			anInt3357 = buffer.getUByte();
		} while (false);
	}

	static final void determineMenuSize() {
		int chooseOptionWidth = Class120_Sub12_Sub22.boldFont.method1459(StringLibrary.chooseOption);
		for (int id = 0; id < WallDecoration.menuOptionCount; id++) {
			final int actionWidth = Class120_Sub12_Sub22.boldFont.method1459(client.getMenuOptionText(id));
			if (chooseOptionWidth < actionWidth) {
				chooseOptionWidth = actionWidth;
			}
		}
		chooseOptionWidth += 8;
		final int i_174_ = 21 + WallDecoration.menuOptionCount * 15;
		int menuDrawY = Class120_Sub12_Sub21.menuMouseY;
		if (menuDrawY < 0) {
			menuDrawY = 0;
		}
		if (i_174_ + menuDrawY > Class120_Sub12_Sub5.canvasHeight) {
			menuDrawY = Class120_Sub12_Sub5.canvasHeight - i_174_;
		}
		int menuDrawX = Class115.menuMouseX - (chooseOptionWidth / 2);
		if (menuDrawX < 0) {
			menuDrawX = 0;
		}
		if (menuDrawX + chooseOptionWidth > Class69_Sub1.canvasWidth) {
			menuDrawX = Class69_Sub1.canvasWidth - chooseOptionWidth;
		}
		if (FileSystem.anInt455 != 1) {
			if (js5.lastClickX == Class115.menuMouseX && Class120_Sub12_Sub36.lastClickY == Class120_Sub12_Sub21.menuMouseY) {
				Huffman.menuDrawX = menuDrawX;
				Class120_Sub16.menuDrawY = menuDrawY;
				Class120_Sub24.menuWidth = chooseOptionWidth;
				QuickChatMessageType.menuHeight = (WallDecoration.usingSpriteMenu ? 26 : 22) + WallDecoration.menuOptionCount * 15;
				FileSystem.anInt455 = 0;
				Class15.menuOpen = true;
			} else {
				ClientScript.anInt3558 = js5.lastClickX;
				Class31.anInt250 = Class120_Sub12_Sub36.lastClickY;
				FileSystem.anInt455 = 1;
			}
		} else if (Class115.menuMouseX == ClientScript.anInt3558 && Class120_Sub12_Sub21.menuMouseY == Class31.anInt250) {
			Huffman.menuDrawX = menuDrawX;
			Class120_Sub16.menuDrawY = menuDrawY;
			Class120_Sub24.menuWidth = chooseOptionWidth;
			QuickChatMessageType.menuHeight = (WallDecoration.usingSpriteMenu ? 26 : 22) + 15 * WallDecoration.menuOptionCount;
			FileSystem.anInt455 = 0;
			Class15.menuOpen = true;
		}
	}

	@Override
	final void postDecode() {
		method1350();
	}

	private final void method1350() {
		anIntArray3358 = new int[anInt3355 - -1];
		final int i_177_ = 4096 / anInt3355;
		anIntArray3359 = new int[anInt3355 - -1];
		final int i_178_ = i_177_ * anInt3356 >> 12;
		int i_179_ = 0;
		for (int i_180_ = 0; i_180_ < anInt3355; i_180_++) {
			anIntArray3358[i_180_] = i_179_;
			anIntArray3359[i_180_] = i_178_ + i_179_;
			i_179_ += i_177_;
		}
		anIntArray3358[anInt3355] = 4096;
		anIntArray3359[anInt3355] = anIntArray3359[0] + 4096;
	}

	public Class120_Sub12_Sub28() {
		super(0, true);
	}

	@Override
	final int[] method1187(final int i_181_) {
		final int[] is_182_ = this.aClass30_2563.method258(i_181_);
		if (this.aClass30_2563.aBoolean238) {
			final int i_183_ = Class150.anIntArray1405[i_181_];
			if (anInt3357 != 0) {
				for (int i_184_ = 0; Class120_Sub12_Sub7.anInt3178 > i_184_; i_184_++) {
					int i_185_ = 0;
					int i_186_ = 0;
					final int i_187_ = Class90.anIntArray849[i_184_];
					int i_188_ = anInt3357;
					while_138_: do {
						do {
							if (i_188_ != 1) {
								if (i_188_ != 2) {
									if (i_188_ == 3) {
										break;
									}
									break while_138_;
								}
							} else {
								i_185_ = i_187_;
								break while_138_;
							}
							i_185_ = 2048 - -(i_183_ - 4096 + i_187_ >> 1);
							break while_138_;
						} while (false);
						i_185_ = (i_187_ - i_183_ >> 1) + 2048;
					} while (false);
					for (i_188_ = 0; anInt3355 > i_188_; i_188_++) {
						if (anIntArray3358[i_188_] <= i_185_ && i_185_ < anIntArray3358[i_188_ + 1]) {
							if (i_185_ < anIntArray3359[i_188_]) {
								i_186_ = 4096;
							}
							break;
						}
					}
					is_182_[i_184_] = i_186_;
				}
			} else {
				int i_189_ = 0;
				for (int i_190_ = 0; anInt3355 > i_190_; i_190_++) {
					if (i_183_ >= anIntArray3358[i_190_] && i_183_ < anIntArray3358[1 + i_190_]) {
						if (i_183_ < anIntArray3359[i_190_]) {
							i_189_ = 4096;
						}
						break;
					}
				}
				ArrayUtils.fillArray(is_182_, 0, Class120_Sub12_Sub7.anInt3178, i_189_);
			}
		}
		return is_182_;
	}
}
