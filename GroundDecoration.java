/* Class36 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class GroundDecoration {
	static int antiAliasingSamples = 0;
	long bitPackedUid;
	SceneGraphNode sceneGraphNode;
	int renderZ;
	int renderX;
	int renderY;
	boolean aBoolean314 = false;

	static final void animateEntity(final GameEntity gameEntity) {
		gameEntity.aBoolean3002 = false;
		if (gameEntity.idleAnimId != -1) {
			final SeqType seqType = SeqType.list(gameEntity.idleAnimId);
			if (seqType == null || seqType.frames == null) {
				gameEntity.idleAnimId = -1;
			} else {
				gameEntity.idleAnimFrameDelay++;
				if (gameEntity.idleAnimFrame < seqType.frames.length && seqType.delays[gameEntity.idleAnimFrame] < gameEntity.idleAnimFrameDelay) {
					gameEntity.idleAnimNextFrame++;
					gameEntity.idleAnimFrameDelay = 1;
					gameEntity.idleAnimFrame++;
					Class120_Sub12_Sub23.method1323(seqType, gameEntity.x, gameEntity.z, gameEntity.idleAnimFrame, gameEntity == TileParticleQueue.selfPlayer);
				}
				if (gameEntity.idleAnimFrame >= seqType.frames.length) {
					gameEntity.idleAnimFrameDelay = 0;
					gameEntity.idleAnimFrame = 0;
					Class120_Sub12_Sub23.method1323(seqType, gameEntity.x, gameEntity.z, gameEntity.idleAnimFrame, gameEntity == TileParticleQueue.selfPlayer);
				}
				gameEntity.idleAnimNextFrame = gameEntity.idleAnimFrame + 1;
				if (gameEntity.idleAnimNextFrame >= seqType.frames.length) {
					gameEntity.idleAnimNextFrame = 0;
				}
			}
		}
		do {
			if (gameEntity.spotAnimId != -1 && Class101_Sub2.loopCycle >= gameEntity.spotAnimDelay) {
				final SpotAnimType spotAnimType = SpotAnimType.list(gameEntity.spotAnimId);
				final int spotAnimAnimationId = spotAnimType.animationId;
				if (spotAnimAnimationId == -1) {
					gameEntity.spotAnimId = -1;
				} else {
					final SeqType seqType = SeqType.list(spotAnimAnimationId);
					if (spotAnimType.aBoolean998) {
						if (seqType.speedupType == 3) {
							if (gameEntity.onAnimPlayWalkQueuePos > 0 && gameEntity.anInt3035 <= Class101_Sub2.loopCycle && Class101_Sub2.loopCycle > gameEntity.anInt2961) {
								gameEntity.spotAnimId = -1;
								break;
							}
						} else if (seqType.speedupType == 1 && gameEntity.onAnimPlayWalkQueuePos > 0 && gameEntity.anInt3035 <= Class101_Sub2.loopCycle && gameEntity.anInt2961 < Class101_Sub2.loopCycle) {
							gameEntity.spotAnimDelay = Class101_Sub2.loopCycle + 1;
							break;
						}
					}
					if (seqType == null || seqType.frames == null) {
						gameEntity.spotAnimId = -1;
					} else {
						if (gameEntity.spotAnimFrame < 0) {
							gameEntity.spotAnimFrame = 0;
							Class120_Sub12_Sub23.method1323(seqType, gameEntity.x, gameEntity.z, 0, gameEntity == TileParticleQueue.selfPlayer);
						}
						gameEntity.spotAnimFrameDelay++;
						if (seqType.frames.length > gameEntity.spotAnimFrame && seqType.delays[gameEntity.spotAnimFrame] < gameEntity.spotAnimFrameDelay) {
							gameEntity.spotAnimFrameDelay = 1;
							gameEntity.spotAnimFrame++;
							Class120_Sub12_Sub23.method1323(seqType, gameEntity.x, gameEntity.z, gameEntity.spotAnimFrame, TileParticleQueue.selfPlayer == gameEntity);
						}
						if (gameEntity.spotAnimFrame >= seqType.frames.length) {
							if (!spotAnimType.aBoolean998) {
								gameEntity.spotAnimId = -1;
							} else {
								gameEntity.spotAnimCyclesElapsed++;
								gameEntity.spotAnimFrame -= seqType.padding;
								if (seqType.resetCycle > gameEntity.spotAnimCyclesElapsed) {
									if (gameEntity.spotAnimFrame >= 0 && seqType.frames.length > gameEntity.spotAnimFrame) {
										Class120_Sub12_Sub23.method1323(seqType, gameEntity.x, gameEntity.z, gameEntity.spotAnimFrame, TileParticleQueue.selfPlayer == gameEntity);
									} else {
										gameEntity.spotAnimId = -1;
									}
								} else {
									gameEntity.spotAnimId = -1;
								}
							}
						}
						gameEntity.spotAnimNextFrame = gameEntity.spotAnimFrame + 1;
						if (gameEntity.spotAnimNextFrame >= seqType.frames.length) {
							if (!spotAnimType.aBoolean998) {
								gameEntity.spotAnimNextFrame = -1;
							} else {
								gameEntity.spotAnimNextFrame -= seqType.padding;
								if (seqType.resetCycle <= 1 + gameEntity.spotAnimCyclesElapsed) {
									gameEntity.spotAnimNextFrame = -1;
								} else if (gameEntity.spotAnimNextFrame < 0 || gameEntity.spotAnimNextFrame >= seqType.frames.length) {
									gameEntity.spotAnimNextFrame = -1;
								}
							}
						}
					}
				}
			}
		} while (false);
		if (gameEntity.animId != -1 && gameEntity.animDelay <= 1) {
			final SeqType seqType = SeqType.list(gameEntity.animId);
			if (seqType.speedupType != 3) {
				if (seqType.speedupType == 1 && gameEntity.onAnimPlayWalkQueuePos > 0 && Class101_Sub2.loopCycle >= gameEntity.anInt3035 && Class101_Sub2.loopCycle > gameEntity.anInt2961) {
					gameEntity.animDelay = 2;
				}
			} else if (gameEntity.onAnimPlayWalkQueuePos > 0 && Class101_Sub2.loopCycle >= gameEntity.anInt3035 && gameEntity.anInt2961 < Class101_Sub2.loopCycle) {
				gameEntity.animId = -1;
			}
		}
		if (gameEntity.animId != -1 && gameEntity.animDelay == 0) {
			final SeqType seqType = SeqType.list(gameEntity.animId);
			if (seqType != null && seqType.frames != null) {
				gameEntity.animCurrentFrameDelay++;
				if (seqType.frames.length > gameEntity.animFrame && gameEntity.animCurrentFrameDelay > seqType.delays[gameEntity.animFrame]) {
					gameEntity.animFrame++;
					gameEntity.animCurrentFrameDelay = 1;
					Class120_Sub12_Sub23.method1323(seqType, gameEntity.x, gameEntity.z, gameEntity.animFrame, gameEntity == TileParticleQueue.selfPlayer);
				}
				if (gameEntity.animFrame >= seqType.frames.length) {
					gameEntity.animCyclesElapsed++;
					gameEntity.animFrame -= seqType.padding;
					if (seqType.resetCycle > gameEntity.animCyclesElapsed) {
						if (gameEntity.animFrame < 0 || gameEntity.animFrame >= seqType.frames.length) {
							gameEntity.animId = -1;
						} else {
							Class120_Sub12_Sub23.method1323(seqType, gameEntity.x, gameEntity.z, gameEntity.animFrame, gameEntity == TileParticleQueue.selfPlayer);
						}
					} else {
						gameEntity.animId = -1;
					}
				}
				gameEntity.animNextFrame = 1 + gameEntity.animFrame;
				if (gameEntity.animNextFrame >= seqType.frames.length) {
					gameEntity.animNextFrame -= seqType.padding;
					if (1 + gameEntity.animCyclesElapsed < seqType.resetCycle) {
						if (gameEntity.animNextFrame < 0 || gameEntity.animNextFrame >= seqType.frames.length) {
							gameEntity.animNextFrame = -1;
						}
					} else {
						gameEntity.animNextFrame = -1;
					}
				}
				gameEntity.aBoolean3002 = seqType.aBoolean344;
			} else {
				gameEntity.animId = -1;
			}
		}
		if (gameEntity.animDelay > 0) {
			gameEntity.animDelay--;
		}
		for (int id = 0; id < gameEntity.aClass150Array2972.length; id++) {
			final Class150 class150 = gameEntity.aClass150Array2972[id];
			if (class150 != null) {
				if (class150.delay > 0) {
					class150.delay--;
				} else {
					final SeqType seqType = SeqType.list(class150.seqId);
					if (seqType == null || seqType.frames == null) {
						gameEntity.aClass150Array2972[id] = null;
					} else {
						class150.frameDelay++;
						if (seqType.frames.length > class150.frameId && seqType.delays[class150.frameId] < class150.frameDelay) {
							class150.frameDelay = 1;
							class150.frameId++;
							Class120_Sub12_Sub23.method1323(seqType, gameEntity.x, gameEntity.z, class150.frameId, gameEntity == TileParticleQueue.selfPlayer);
						}
						if (class150.frameId >= seqType.frames.length) {
							class150.frameId -= seqType.padding;
							class150.cyclesElapsed++;
							if (seqType.resetCycle > class150.cyclesElapsed) {
								if (class150.frameId >= 0 && seqType.frames.length > class150.frameId) {
									Class120_Sub12_Sub23.method1323(seqType, gameEntity.x, gameEntity.z, class150.frameId, gameEntity == TileParticleQueue.selfPlayer);
								} else {
									gameEntity.aClass150Array2972[id] = null;
								}
							} else {
								gameEntity.aClass150Array2972[id] = null;
							}
						}
						class150.nextFrameId = class150.frameId + 1;
						if (seqType.frames.length <= class150.nextFrameId) {
							class150.nextFrameId -= seqType.padding;
							if (class150.cyclesElapsed + 1 >= seqType.resetCycle) {
								class150.nextFrameId = -1;
							} else if (class150.nextFrameId < 0 || class150.nextFrameId >= seqType.frames.length) {
								class150.nextFrameId = -1;
							}
						}
					}
				}
			}
		}
	}

	static final void method309() {
		Class145.aClass21_1486.clear();
		Class120_Sub6.aClass21_2443.clear();
	}

	public GroundDecoration() {
		/* empty */
	}
}
