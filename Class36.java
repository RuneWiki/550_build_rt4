/* Class36 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class36 {
	static int antiAliasingSamples = 0;
	long bitPacked;
	SceneGraphNode aClass180_309;
	int anInt310;
	int anInt311;
	int anInt312;
	static String aString313 = "Loading...";
	boolean aBoolean314 = false;

	static final void method307(final GameEntity gameEntity) {
		gameEntity.aBoolean3002 = false;
		if ((gameEntity.anInt3004 ^ 0xffffffff) != 0) {
			final SeqType seqType = SeqType.list(gameEntity.anInt3004);
			if (seqType == null || seqType.frames == null) {
				gameEntity.anInt3004 = -1;
			} else {
				gameEntity.anInt2998++;
				if (gameEntity.anInt3046 < seqType.frames.length && seqType.delays[gameEntity.anInt3046] < gameEntity.anInt2998) {
					gameEntity.anInt3021++;
					gameEntity.anInt2998 = 1;
					gameEntity.anInt3046++;
					Class120_Sub12_Sub23.method1323(seqType, gameEntity.x, gameEntity.z, gameEntity.anInt3046, gameEntity == TileParticleQueue.selfPlayer);
				}
				if (gameEntity.anInt3046 >= seqType.frames.length) {
					gameEntity.anInt2998 = 0;
					gameEntity.anInt3046 = 0;
					Class120_Sub12_Sub23.method1323(seqType, gameEntity.x, gameEntity.z, gameEntity.anInt3046, TileParticleQueue.selfPlayer == gameEntity);
				}
				gameEntity.anInt3021 = 1 + gameEntity.anInt3046;
				if (gameEntity.anInt3021 >= seqType.frames.length) {
					gameEntity.anInt3021 = 0;
				}
			}
		}
		do {
			if (gameEntity.spotAnimId != -1 && Class101_Sub2.loopCycle >= gameEntity.anInt2979) {
				final SpotAnimType spotAnimType = SpotAnimType.list(gameEntity.spotAnimId);
				final int i_0_ = spotAnimType.animationId;
				if ((i_0_ ^ 0xffffffff) == 0) {
					gameEntity.spotAnimId = -1;
				} else {
					final SeqType seqType = SeqType.list(i_0_);
					if (spotAnimType.aBoolean998) {
						if (seqType.speedupType == 3) {
							if (gameEntity.anInt3031 > 0 && gameEntity.anInt3035 <= Class101_Sub2.loopCycle && Class101_Sub2.loopCycle > gameEntity.anInt2961) {
								gameEntity.spotAnimId = -1;
								break;
							}
						} else if (seqType.speedupType == 1 && gameEntity.anInt3031 > 0 && gameEntity.anInt3035 <= Class101_Sub2.loopCycle && gameEntity.anInt2961 < Class101_Sub2.loopCycle) {
							gameEntity.anInt2979 = Class101_Sub2.loopCycle + 1;
							break;
						}
					}
					if (seqType == null || seqType.frames == null) {
						gameEntity.spotAnimId = -1;
					} else {
						if (gameEntity.spotAnimFrameId < 0) {
							gameEntity.spotAnimFrameId = 0;
							Class120_Sub12_Sub23.method1323(seqType, gameEntity.x, gameEntity.z, 0, gameEntity == TileParticleQueue.selfPlayer);
						}
						gameEntity.anInt2963++;
						if (seqType.frames.length > gameEntity.spotAnimFrameId && seqType.delays[gameEntity.spotAnimFrameId] < gameEntity.anInt2963) {
							gameEntity.anInt2963 = 1;
							gameEntity.spotAnimFrameId++;
							Class120_Sub12_Sub23.method1323(seqType, gameEntity.x, gameEntity.z, gameEntity.spotAnimFrameId, TileParticleQueue.selfPlayer == gameEntity);
						}
						if (gameEntity.spotAnimFrameId >= seqType.frames.length) {
							if (!spotAnimType.aBoolean998) {
								gameEntity.spotAnimId = -1;
							} else {
								gameEntity.anInt2984++;
								gameEntity.spotAnimFrameId -= seqType.padding;
								if (seqType.resetCycle > gameEntity.anInt2984) {
									if (gameEntity.spotAnimFrameId >= 0 && seqType.frames.length > gameEntity.spotAnimFrameId) {
										Class120_Sub12_Sub23.method1323(seqType, gameEntity.x, gameEntity.z, gameEntity.spotAnimFrameId, TileParticleQueue.selfPlayer == gameEntity);
									} else {
										gameEntity.spotAnimId = -1;
									}
								} else {
									gameEntity.spotAnimId = -1;
								}
							}
						}
						gameEntity.anInt2971 = gameEntity.spotAnimFrameId - -1;
						if (gameEntity.anInt2971 >= seqType.frames.length) {
							if (!spotAnimType.aBoolean998) {
								gameEntity.anInt2971 = -1;
							} else {
								gameEntity.anInt2971 -= seqType.padding;
								if (seqType.resetCycle <= 1 + gameEntity.anInt2984) {
									gameEntity.anInt2971 = -1;
								} else if (gameEntity.anInt2971 < 0 || gameEntity.anInt2971 >= seqType.frames.length) {
									gameEntity.anInt2971 = -1;
								}
							}
						}
					}
				}
			}
		} while (false);
		if ((gameEntity.anInt3006 ^ 0xffffffff) != 0 && gameEntity.anInt2993 <= 1) {
			final SeqType seqType = SeqType.list(gameEntity.anInt3006);
			if (seqType.speedupType != 3) {
				if (seqType.speedupType == 1 && gameEntity.anInt3031 > 0 && Class101_Sub2.loopCycle >= gameEntity.anInt3035 && Class101_Sub2.loopCycle > gameEntity.anInt2961) {
					gameEntity.anInt2993 = 2;
				}
			} else if (gameEntity.anInt3031 > 0 && Class101_Sub2.loopCycle >= gameEntity.anInt3035 && gameEntity.anInt2961 < Class101_Sub2.loopCycle) {
				gameEntity.anInt3006 = -1;
			}
		}
		if ((gameEntity.anInt3006 ^ 0xffffffff) != 0 && gameEntity.anInt2993 == 0) {
			final SeqType seqType = SeqType.list(gameEntity.anInt3006);
			if (seqType != null && seqType.frames != null) {
				gameEntity.anInt3044++;
				if (seqType.frames.length > gameEntity.anInt2964 && gameEntity.anInt3044 > seqType.delays[gameEntity.anInt2964]) {
					gameEntity.anInt2964++;
					gameEntity.anInt3044 = 1;
					Class120_Sub12_Sub23.method1323(seqType, gameEntity.x, gameEntity.z, gameEntity.anInt2964, gameEntity == TileParticleQueue.selfPlayer);
				}
				if (gameEntity.anInt2964 >= seqType.frames.length) {
					gameEntity.anInt2999++;
					gameEntity.anInt2964 -= seqType.padding;
					if (seqType.resetCycle > gameEntity.anInt2999) {
						if (gameEntity.anInt2964 < 0 || gameEntity.anInt2964 >= seqType.frames.length) {
							gameEntity.anInt3006 = -1;
						} else {
							Class120_Sub12_Sub23.method1323(seqType, gameEntity.x, gameEntity.z, gameEntity.anInt2964, gameEntity == TileParticleQueue.selfPlayer);
						}
					} else {
						gameEntity.anInt3006 = -1;
					}
				}
				gameEntity.anInt3013 = 1 + gameEntity.anInt2964;
				if (gameEntity.anInt3013 >= seqType.frames.length) {
					gameEntity.anInt3013 -= seqType.padding;
					if (1 + gameEntity.anInt2999 < seqType.resetCycle) {
						if (gameEntity.anInt3013 < 0 || gameEntity.anInt3013 >= seqType.frames.length) {
							gameEntity.anInt3013 = -1;
						}
					} else {
						gameEntity.anInt3013 = -1;
					}
				}
				gameEntity.aBoolean3002 = seqType.aBoolean344;
			} else {
				gameEntity.anInt3006 = -1;
			}
		}
		if (gameEntity.anInt2993 > 0) {
			gameEntity.anInt2993--;
		}
		for (int i_1_ = 0; i_1_ < gameEntity.aClass150Array2972.length; i_1_++) {
			final Class150 class150 = gameEntity.aClass150Array2972[i_1_];
			if (class150 != null) {
				if (class150.delay > 0) {
					class150.delay--;
				} else {
					final SeqType seqType = SeqType.list(class150.anInt1406);
					if (seqType == null || seqType.frames == null) {
						gameEntity.aClass150Array2972[i_1_] = null;
					} else {
						class150.anInt1410++;
						if (seqType.frames.length > class150.anInt1413 && seqType.delays[class150.anInt1413] < class150.anInt1410) {
							class150.anInt1410 = 1;
							class150.anInt1413++;
							Class120_Sub12_Sub23.method1323(seqType, gameEntity.x, gameEntity.z, class150.anInt1413, gameEntity == TileParticleQueue.selfPlayer);
						}
						if (class150.anInt1413 >= seqType.frames.length) {
							class150.anInt1413 -= seqType.padding;
							class150.anInt1416++;
							if (seqType.resetCycle > class150.anInt1416) {
								if (class150.anInt1413 >= 0 && seqType.frames.length > class150.anInt1413) {
									Class120_Sub12_Sub23.method1323(seqType, gameEntity.x, gameEntity.z, class150.anInt1413, gameEntity == TileParticleQueue.selfPlayer);
								} else {
									gameEntity.aClass150Array2972[i_1_] = null;
								}
							} else {
								gameEntity.aClass150Array2972[i_1_] = null;
							}
						}
						class150.anInt1414 = class150.anInt1413 + 1;
						if (seqType.frames.length <= class150.anInt1414) {
							class150.anInt1414 -= seqType.padding;
							if (class150.anInt1416 - -1 >= seqType.resetCycle) {
								class150.anInt1414 = -1;
							} else if (class150.anInt1414 < 0 || class150.anInt1414 >= seqType.frames.length) {
								class150.anInt1414 = -1;
							}
						}
					}
				}
			}
		}
	}

	public static void method308(final int i) {
		try {
			aString313 = null;
			if (i != 30900) {
				method309();
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("dm.B(").append(i).append(')').toString());
		}
	}

	static final void method309() {
		Class159.aClass21_1486.clear();
		Class120_Sub6.aClass21_2443.clear();
	}

	public Class36() {
		/* empty */
	}
}
