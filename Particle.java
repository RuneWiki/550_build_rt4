/* Class108_Sub3_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

//Big thanks to http://www.rune-server.org/members/method/
final class Particle extends ParticleNodeSub {
	private static int anInt3086 = 12;
	int positionX;
	int positionY;
	private short directionX;
	int positionZ;
	int color;
	private int fractionalColor;
	private short time;
	short aShort3094;
	private short lifespan;
	private short directionY;
	boolean aBoolean3097 = false;
	private short directionZ;
	ParticleEmitter particleEmitter;
	private int speed;

	final void update(final long cycle, final int dt) {
		if (this.particleEmitter != null) {
			time -= dt;
			if (time <= 0) {
				die();
			} else {
				final int currentX = this.positionX >> anInt3086;
				final int currentY = this.positionY >> anInt3086;
				final int currentZ = this.positionZ >> anInt3086;
				final ParticleEngine particleEngine = this.particleEmitter.particleEngine;
				final EmitterType emitterType = this.particleEmitter.emitterType;
				if (emitterType.fadeColor != 0) {
					if (lifespan - time <= emitterType.colorFadeStart) {
						int red = (this.color >> 8 & 0xff00) + (fractionalColor >> 16 & 0xff) + emitterType.fadeRedStep * dt;
						int green = (this.color & 0xff00) + (fractionalColor >> 8 & 0xff) + emitterType.fadeGreenStep * dt;
						int blue = (this.color << 8 & 0xff00) + (fractionalColor & 0xff) + emitterType.fadeBlueStep * dt;
						if (red < 0) {
							red = 0;
						} else if (red > 65535) {
							red = 65535;
						}
						if (green < 0) {
							green = 0;
						} else if (green > 65535) {
							green = 65535;
						}
						if (blue < 0) {
							blue = 0;
						} else if (blue > 65535) {
							blue = 65535;
						}
						this.color &= ~0xffffff;
						this.color |= ((red & 0xff00) << 8) + (green & 0xff00) + ((blue & 0xff00) >> 8);
						fractionalColor &= ~0xffffff;
						fractionalColor |= ((red & 0xff) << 16) + ((green & 0xff) << 8) + (blue & 0xff);
					}
					if (lifespan - time <= emitterType.alphaFadeStart) {
						int alpha = (this.color >> 16 & 0xff00) + (fractionalColor >> 24 & 0xff) + emitterType.alphaFadeStep * dt;
						if (alpha < 0) {
							alpha = 0;
						} else if (alpha > 65535) {
							alpha = 65535;
						}
						this.color &= 0xffffff;
						this.color |= (alpha & 0xff00) << 16;
						fractionalColor &= 0xffffff;
						fractionalColor |= (alpha & 0xff) << 24;
					}
				}
				if (emitterType.endSpeed != -1 && lifespan - time <= emitterType.speedChangeStart) {
					speed += emitterType.speedStep * dt;
				}
				int dirX = directionX;
				int dirY = directionY;
				int dirZ = directionZ;
				boolean directionChange = false;
				if (emitterType.decelerationType == 1) {
					final int deltaX = currentX - this.particleEmitter.centerX;
					final int deltaY = currentY - this.particleEmitter.centerY;
					final int deltaZ = currentZ - this.particleEmitter.centerZ;
					final int distance = (int) Math.sqrt(deltaX * deltaX + deltaY * deltaY + deltaZ * deltaZ);
					final long fraction = emitterType.decelerationRate * distance * dt;
					speed -= speed * fraction >> 18;
				} else if (emitterType.decelerationType == 2) {
					final int deltaX = currentX - this.particleEmitter.centerX;
					final int deltaY = currentY - this.particleEmitter.centerY;
					final int deltaZ = currentZ - this.particleEmitter.centerZ;
					final int distance = deltaX * deltaX + deltaY * deltaY + deltaZ * deltaZ;
					final long fraction = emitterType.decelerationRate * distance * dt;
					speed -= speed * fraction >> 28;
				}
				final Node node = particleEngine.localMagnets.head;
				for (Node next = node.next; next != node; next = next.next) {
					final ParticleMagnet particleMagnet = (ParticleMagnet) next;
					final MagnetType magnetType = particleMagnet.modelParticleMagnet.magnetType;
					if (magnetType.visibility != 1) {
						final int deltaX = currentX - particleMagnet.positionX;
						final int deltaY = currentY - particleMagnet.positionY;
						final int deltaZ = currentZ - particleMagnet.positionZ;
						final long dist = deltaX * deltaX + deltaY * deltaY + deltaZ * deltaZ;
						if (dist <= magnetType.maxRange) {
							int sqrtDist = (int) Math.sqrt(dist);
							if (sqrtDist == 0) {
								sqrtDist = 1;
							}
							final long cosTheta = (deltaX * particleMagnet.localDirectionX + deltaY * magnetType.localDirectionY + deltaZ * particleMagnet.localDirectionZ) * 65535L / (magnetType.directionLength * sqrtDist);
							if (cosTheta >= magnetType.rotCos) {
								int delta = 0;
								if (magnetType.effectType == 1) {
									delta = (sqrtDist >> 4) * magnetType.strength;
								} else if (magnetType.effectType == 2) {
									delta = (sqrtDist >> 4) * (sqrtDist >> 4) * magnetType.strength;
								}
								if (magnetType.constantStrength == 0) {
									if (magnetType.constantSpeed == 0) {
										dirX += (particleMagnet.localDirectionX - delta) * dt;
										dirY += (magnetType.localDirectionY - delta) * dt;
										dirZ += (particleMagnet.localDirectionZ - delta) * dt;
										directionChange = true;
									} else {
										this.positionX += (particleMagnet.localDirectionX - delta) * dt;
										this.positionY += (magnetType.localDirectionY - delta) * dt;
										this.positionZ += (particleMagnet.localDirectionZ - delta) * dt;
									}
								} else {
									final int x = (deltaX << 15) / sqrtDist * magnetType.directionLength;
									final int y = (deltaY << 15) / sqrtDist * magnetType.directionLength;
									final int z = (deltaZ << 15) / sqrtDist * magnetType.directionLength;
									if (magnetType.constantSpeed == 0) {
										dirX += x * dt >> 15;
										dirY += y * dt >> 15;
										dirZ += z * dt >> 15;
										directionChange = true;
									} else {
										this.positionX += x * dt >> 15;
										this.positionY += y * dt >> 15;
										this.positionZ += z * dt >> 15;
									}
								}
							}
						}
					}
				}
				if (emitterType.generalMagnets != null) {
					for (int id = 0; id < emitterType.generalMagnets.length; id++) {
						final int magnetId = emitterType.generalMagnets[id];
						ParticleMagnet particleMagnet = (ParticleMagnet) ParticleEngine.activeMagnets.get(magnetId);
						while (particleMagnet != null) {
							final MagnetType magnetType = particleMagnet.modelParticleMagnet.magnetType;
							final int deltaX = currentX - particleMagnet.positionX;
							final int deltaY = currentY - particleMagnet.positionY;
							final int deltaZ = currentZ - particleMagnet.positionZ;
							final long dist = deltaX * deltaX + deltaY * deltaY + deltaZ * deltaZ;
							if (dist > magnetType.maxRange) {
								particleMagnet = (ParticleMagnet) ParticleEngine.activeMagnets.poll();
							} else {
								int sqrtDist = (int) Math.sqrt(dist);
								if (sqrtDist == 0) {
									sqrtDist = 1;
								}
								final long cosTheta = (deltaX * particleMagnet.localDirectionX + deltaY * magnetType.localDirectionY + deltaZ * particleMagnet.localDirectionZ) * 65535L / (magnetType.directionLength * sqrtDist);
								if (cosTheta < magnetType.rotCos) {
									particleMagnet = (ParticleMagnet) ParticleEngine.activeMagnets.poll();
								} else {
									int delta = 0;
									if (magnetType.effectType == 1) {
										delta = (sqrtDist >> 4) * magnetType.strength;
									} else if (magnetType.effectType == 2) {
										delta = (sqrtDist >> 4) * (sqrtDist >> 4) * magnetType.strength;
									}
									if (magnetType.constantStrength == 0) {
										if (magnetType.constantSpeed == 0) {
											dirX += (particleMagnet.localDirectionX - delta) * dt;
											dirY += (magnetType.localDirectionY - delta) * dt;
											dirZ += (particleMagnet.localDirectionZ - delta) * dt;
											directionChange = true;
										} else {
											this.positionX += (particleMagnet.localDirectionX - delta) * dt;
											this.positionY += (magnetType.localDirectionY - delta) * dt;
											this.positionZ += (particleMagnet.localDirectionZ - delta) * dt;
										}
									} else {
										final int x = (deltaX << 15) / sqrtDist * magnetType.directionLength;
										final int y = (deltaY << 15) / sqrtDist * magnetType.directionLength;
										final int z = (deltaZ << 15) / sqrtDist * magnetType.directionLength;
										if (magnetType.constantSpeed == 0) {
											dirX += x * dt >> 15;
											dirY += y * dt >> 15;
											dirZ += z * dt >> 15;
											directionChange = true;
										} else {
											this.positionX += x * dt >> 15;
											this.positionY += y * dt >> 15;
											this.positionZ += z * dt >> 15;
										}
									}
									particleMagnet = (ParticleMagnet) ParticleEngine.activeMagnets.poll();
								}
							}
						}
					}
				}
				if (emitterType.globalMagnets != null) {
					if (emitterType.globalMagnetIndices == null) {
						emitterType.globalMagnetIndices = new int[emitterType.globalMagnets.length];
						for (int id = 0; id < emitterType.globalMagnets.length; id++) {
							MagnetType.list(emitterType.globalMagnets[id]);
							emitterType.globalMagnetIndices[id] = ((IntegerNode) GroundTile.globalMagnets.get(emitterType.globalMagnets[id])).value;
						}
					}
					for (int id = 0; id < emitterType.globalMagnetIndices.length; id++) {
						final int magnetId = emitterType.globalMagnetIndices[id];
						final MagnetType magnetType = Class154.globalMagnets[magnetId];
						if (magnetType.constantSpeed == 0) {
							dirX += magnetType.localDirectionX * dt;
							dirY += magnetType.localDirectionY * dt;
							dirZ += magnetType.localDirectionZ * dt;
							directionChange = true;
						} else {
							this.positionX += magnetType.localDirectionX * dt;
							this.positionY += magnetType.localDirectionY * dt;
							this.positionZ += magnetType.localDirectionZ * dt;
						}
					}
				}
				if (directionChange) {
					while (dirX > 32767 || dirY > 32767 || dirZ > 32767 || dirX < -32767 || dirY < -32767 || dirZ < -32767) {
						dirX >>= 1;
						dirY >>= 1;
						dirZ >>= 1;
						speed <<= 1;
					}
					directionX = (short) dirX;
					directionY = (short) dirY;
					directionZ = (short) dirZ;
				}
				this.positionX += ((long) directionX * (long) speed >> 23) * dt;
				this.positionY += ((long) directionY * (long) speed >> 23) * dt;
				this.positionZ += ((long) directionZ * (long) speed >> 23) * dt;
				final int tileX = this.positionX >> 19;
				final int tileZ = this.positionZ >> 19;
				final int tileY = this.positionY >> anInt3086;
				if (tileY > 0 || tileY < -65535 || tileX < 0 || tileX >= WallDecoration.mapSizeX || tileZ < 0 || tileZ >= Class120_Sub12_Sub38.mapSizeZ) {
					die();
				} else {
					final int[][][] heightMap = SubInterface.activeTileHeightMap;
					final int tileHeight = heightMap[particleEngine.level][tileX][tileZ];
					int nextLevelHeight;
					if (particleEngine.level < 3) {
						nextLevelHeight = heightMap[particleEngine.level + 1][tileX][tileZ];
					} else {
						nextLevelHeight = heightMap[particleEngine.level][tileX][tileZ] - 1024;
					}
					if (emitterType.checkHeight) {
						if (emitterType.minLevel == -1 && tileY > tileHeight) {
							die();
							return;
						}
						if (emitterType.minLevel >= 0 && tileY > heightMap[emitterType.minLevel][tileX][tileZ]) {
							die();
							return;
						}
						if (emitterType.maxLevel == -1 && tileY < nextLevelHeight) {
							die();
							return;
						}
						if (emitterType.maxLevel >= 0 && tileY < heightMap[emitterType.maxLevel + 1][tileX][tileZ]) {
							die();
							return;
						}
					}
					if (tileX < particleEngine.anInt2373 || tileX > particleEngine.anInt2384 || tileZ < particleEngine.anInt2367 || tileZ > particleEngine.anInt2375 || tileY > particleEngine.anInt2369 || tileY < particleEngine.anInt2382) {
						this.aBoolean3097 = true;
						int tileLevel = 3;
						if (tileY > heightMap[1][tileX][tileZ]) {
							tileLevel = 0;
						} else if (tileY > heightMap[2][tileX][tileZ]) {
							tileLevel = 1;
						} else if (tileY > heightMap[3][tileX][tileZ]) {
							tileLevel = 2;
						} else if (tileY < heightMap[3][tileX][tileZ] - 1024) {
							die();
							return;
						}
						GroundTile groundTile = SeqFrameBase.activeGroundTiles[tileLevel][tileX][tileZ];
						if (groundTile == null) {
							groundTile = SeqFrameBase.activeGroundTiles[tileLevel][tileX][tileZ] = new GroundTile(tileLevel, tileX, tileZ);
						}
						if (groundTile.tileParticle == null) {
							groundTile.tileParticle = new TileParticleQueue();
							groundTile.particleCycle = (byte) (int) (cycle & 0xffL);
						} else if (groundTile.particleCycle != (byte) (int) (cycle & 0xffL)) {
							groundTile.tileParticle.clear();
							groundTile.particleCycle = (byte) (int) (cycle & 0xffL);
						}
						groundTile.tileParticle.insertLast(this);
					} else {
						this.aBoolean3097 = false;
					}
				}
			}
		}
	}

	private final void die() {
		this.particleEmitter.particleEngine.aClass108_Sub3_Sub1Array2355[this.aShort3094] = null;
		ParticleEngine.aClass108_Sub3_Sub1Array2350[ParticleEngine.anInt2354] = this;
		ParticleEngine.anInt2354 = ParticleEngine.anInt2354 + 1 & 0x3ff;
		this.particleEmitter = null;
		unlink();
		unlinkSub();
	}

	private final void method970() {
		final int i = this.particleEmitter.particleEngine.anInt2348;
		if (this.particleEmitter.particleEngine.aClass108_Sub3_Sub1Array2355[i] != null) {
			this.particleEmitter.particleEngine.aClass108_Sub3_Sub1Array2355[i].die();
		}
		this.particleEmitter.particleEngine.aClass108_Sub3_Sub1Array2355[i] = this;
		this.aShort3094 = (short) this.particleEmitter.particleEngine.anInt2348;
		this.particleEmitter.particleEngine.anInt2348 = i + 1 & 0x1fff;
		this.particleEmitter.aClass174_2337.insertLast(this);
	}

	final void method971(final ParticleEmitter class108_sub1, final int i, final int i_53_, final int i_54_, final int i_55_, final int i_56_, final int i_57_, final int i_58_, final int i_59_, final int i_60_) {
		this.particleEmitter = class108_sub1;
		this.positionX = i << anInt3086;
		this.positionY = i_53_ << anInt3086;
		this.positionZ = i_54_ << anInt3086;
		this.color = i_60_;
		lifespan = time = (short) i_59_;
		directionX = (short) i_55_;
		directionY = (short) i_56_;
		directionZ = (short) i_57_;
		speed = i_58_;
		method970();
	}

	Particle(final ParticleEmitter class108_sub1, final int i, final int i_61_, final int i_62_, final int i_63_, final int i_64_, final int i_65_, final int i_66_, final int i_67_, final int i_68_) {
		this.particleEmitter = class108_sub1;
		this.positionX = i << anInt3086;
		this.positionY = i_61_ << anInt3086;
		this.positionZ = i_62_ << anInt3086;
		this.color = i_68_;
		lifespan = time = (short) i_67_;
		directionX = (short) i_63_;
		directionY = (short) i_64_;
		directionZ = (short) i_65_;
		speed = i_66_;
		method970();
	}
}
