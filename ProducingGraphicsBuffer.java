/* Class122_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Shape;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;

final class ProducingGraphicsBuffer extends AbstractGraphicsBuffer implements ImageProducer, ImageObserver {
	static int[] npcSpawnsFileIds;
	private ColorModel colorModel;
	static int currentLightZ;
	static int friendCount = 0;
	private ImageConsumer imageConsumer;
	static int[] intStack = new int[1000];

	@Override
	public final synchronized void addConsumer(final ImageConsumer imageconsumer) {
		imageConsumer = imageconsumer;
		imageconsumer.setDimensions(this.width, this.height);
		imageconsumer.setProperties(null);
		imageconsumer.setColorModel(colorModel);
		imageconsumer.setHints(14);
	}

	@Override
	public final void requestTopDownLeftRightResend(final ImageConsumer imageconsumer) {
		/* empty */
	}

	@Override
	final void drawClippedImage(final Graphics graphics, final int x, final int y, final int width, final int height) {
		setPixels(x, y, width, height);
		final Shape shape = graphics.getClip();
		graphics.clipRect(x, y, width, height);
		graphics.drawImage(this.image, 0, 0, this);
		graphics.setClip(shape);
	}

	private final synchronized void setPixels() {
		if (imageConsumer != null) {
			imageConsumer.setPixels(0, 0, this.width, this.height, colorModel, this.pixels, 0, this.width);
			imageConsumer.imageComplete(2);
		}
	}

	static final void method1850(final GameEntity gameEntity) {
		if (gameEntity.anInt3010 != 0) {
			final BasType class29 = gameEntity.getBasType();
			if (gameEntity.facingEntityIndex != -1 && gameEntity.facingEntityIndex < 32768) {
				final Npc npc = Class120_Sub12_Sub11.npcList[gameEntity.facingEntityIndex];
				if (npc != null) {
					final int x = gameEntity.x - npc.x;
					final int z = gameEntity.z - npc.z;
					if (x != 0 || z != 0) {
						gameEntity.newFaceDegrees = (int) (Math.atan2(x, z) * 325.949) & 0x7ff;
					}
				}
			}
			if (gameEntity.facingEntityIndex >= 32768) {
				int index = gameEntity.facingEntityIndex - 32768;
				if (index == Class167.selfPlayerIndex) {
					index = 2047;
				}
				final Player player = Class118.playersList[index];
				if (player != null) {
					final int x = gameEntity.x - player.x;
					final int z = gameEntity.z - player.z;
					if (x != 0 || z != 0) {
						gameEntity.newFaceDegrees = (int) (Math.atan2(x, z) * 325.949) & 0x7ff;
					}
				}
			}
			if ((gameEntity.faceX != 0 || gameEntity.faceZ != 0) && (gameEntity.walkQueuePos == 0 || gameEntity.anInt3037 > 0)) {
				final int x = gameEntity.x - (gameEntity.faceX - GameEntity.currentBaseX - GameEntity.currentBaseX) * 64;
				final int y = gameEntity.z - (gameEntity.faceZ - LightType.currentBaseZ - LightType.currentBaseZ) * 64;
				if (x != 0 || y != 0) {
					gameEntity.newFaceDegrees = (int) (Math.atan2(x, y) * 325.949) & 0x7ff;
				}
				gameEntity.faceX = 0;
				gameEntity.faceZ = 0;
			}
			final int i_10_ = gameEntity.newFaceDegrees - gameEntity.faceDegrees & 0x7ff;
			if (i_10_ != 0) {
				if (class29.anInt189 != 0) {
					gameEntity.idleAnimId = -1;
					final int i_11_ = gameEntity.newFaceDegrees << 5;
					if (gameEntity.anInt2983 != i_11_) {
						gameEntity.anInt3030 = 0;
						gameEntity.anInt2983 = i_11_;
						final int i_12_ = 0xffff & -gameEntity.anInt2987 + i_11_;
						final int i_13_ = gameEntity.anInt3022 * gameEntity.anInt3022 / (2 * class29.anInt189);
						if (gameEntity.anInt3022 <= 0 || i_13_ > i_12_ || i_12_ - i_13_ >= 32768) {
							if (gameEntity.anInt3022 >= 0 || i_13_ > -i_12_ + 65536 || -32769 >= (-i_12_ + 65536 - i_13_ ^ 0xffffffff)) {
								gameEntity.aBoolean2997 = false;
							} else {
								gameEntity.anInt2990 = (65536 - i_12_) / 2;
								gameEntity.aBoolean2997 = true;
								int i_14_ = class29.anInt220 * class29.anInt220 / (class29.anInt189 * 2);
								if (i_14_ > 32767) {
									i_14_ = 32767;
								}
								if (gameEntity.anInt2990 > i_14_) {
									gameEntity.anInt2990 = -i_14_ + 65536 + -i_12_;
								}
							}
						} else {
							gameEntity.aBoolean2997 = true;
							gameEntity.anInt2990 = i_12_ / 2;
							int i_15_ = class29.anInt220 * class29.anInt220 / (class29.anInt189 * 2);
							if (i_15_ > 32767) {
								i_15_ = 32767;
							}
							if (gameEntity.anInt2990 > i_15_) {
								gameEntity.anInt2990 = i_12_ - i_15_;
							}
						}
					}
					if (gameEntity.anInt3022 == 0) {
						final int i_16_ = -gameEntity.anInt2987 + gameEntity.anInt2983 & 0xffff;
						if (i_16_ < class29.anInt189) {
							gameEntity.anInt2987 = gameEntity.anInt2983;
						} else {
							gameEntity.anInt3030 = 0;
							gameEntity.aBoolean2997 = true;
							int i_17_ = class29.anInt220 * class29.anInt220 / (2 * class29.anInt189);
							if (i_17_ > 32767) {
								i_17_ = 32767;
							}
							if (i_16_ >= 32768) {
								gameEntity.anInt2990 = (-i_16_ + 65536) / 2;
								if (i_17_ < gameEntity.anInt2990) {
									gameEntity.anInt2990 = -i_16_ + 65536 - i_17_;
								}
								gameEntity.anInt3022 = -class29.anInt189;
							} else {
								gameEntity.anInt2990 = i_16_ / 2;
								gameEntity.anInt3022 = class29.anInt189;
								if (gameEntity.anInt2990 > i_17_) {
									gameEntity.anInt2990 = -i_17_ + i_16_;
								}
							}
						}
					} else if (gameEntity.anInt3022 > 0) {
						if (gameEntity.anInt3030 >= gameEntity.anInt2990) {
							gameEntity.aBoolean2997 = false;
						}
						if (gameEntity.aBoolean2997) {
							if (gameEntity.anInt3022 < class29.anInt220) {
								gameEntity.anInt3022 += class29.anInt189;
							}
						} else {
							gameEntity.anInt3022 -= class29.anInt189;
							if (gameEntity.anInt3022 < 0) {
								gameEntity.anInt3022 = 0;
							}
						}
					} else {
						if (gameEntity.anInt3030 >= gameEntity.anInt2990) {
							gameEntity.aBoolean2997 = false;
						}
						if (gameEntity.aBoolean2997) {
							if (-class29.anInt220 < gameEntity.anInt3022) {
								gameEntity.anInt3022 -= class29.anInt189;
							}
						} else {
							gameEntity.anInt3022 += class29.anInt189;
							if (gameEntity.anInt3022 > 0) {
								gameEntity.anInt3022 = 0;
							}
						}
					}
					gameEntity.anInt2987 += gameEntity.anInt3022;
					gameEntity.anInt2987 &= 0xffff;
					gameEntity.faceDegrees = gameEntity.anInt2987 >> 5;
					if (gameEntity.anInt3022 <= 0) {
						gameEntity.anInt3030 -= gameEntity.anInt3022;
					} else {
						gameEntity.anInt3030 += gameEntity.anInt3022;
					}
					if (gameEntity.anInt3022 < 0) {
						if (gameEntity.walkQueuePos > 0) {
							if (gameEntity.walkQueueType[gameEntity.walkQueuePos - 1] == 2) {
								if (class29.anInt194 != -1) {
									gameEntity.idleAnimId = class29.anInt194;
								} else if ((class29.runAnimationId ^ 0xffffffff) != 0) {
									gameEntity.idleAnimId = class29.runAnimationId;
								}
							} else if (gameEntity.walkQueueType[gameEntity.walkQueuePos - 1] == 0) {
								if ((class29.anInt203 ^ 0xffffffff) == 0) {
									if (class29.anInt212 != -1) {
										gameEntity.idleAnimId = class29.anInt212;
									}
								} else {
									gameEntity.idleAnimId = class29.anInt203;
								}
							}
						}
						if ((gameEntity.idleAnimId ^ 0xffffffff) == 0) {
							if (class29.anInt202 == -1) {
								if ((class29.anInt193 ^ 0xffffffff) != 0) {
									gameEntity.idleAnimId = class29.anInt193;
								}
							} else {
								gameEntity.idleAnimId = class29.anInt202;
							}
						}
					} else {
						if (gameEntity.walkQueuePos > 0) {
							if (gameEntity.walkQueueType[gameEntity.walkQueuePos - 1] == 2) {
								if ((class29.anInt211 ^ 0xffffffff) == 0) {
									if (class29.runAnimationId != -1) {
										gameEntity.idleAnimId = class29.runAnimationId;
									}
								} else {
									gameEntity.idleAnimId = class29.anInt211;
								}
							} else if (gameEntity.walkQueueType[gameEntity.walkQueuePos - 1] == 0) {
								if (class29.anInt198 != -1) {
									gameEntity.idleAnimId = class29.anInt198;
								} else if (class29.anInt212 != -1) {
									gameEntity.idleAnimId = class29.anInt212;
								}
							}
						}
						if ((gameEntity.idleAnimId ^ 0xffffffff) == 0) {
							if ((class29.anInt222 ^ 0xffffffff) == 0) {
								if ((class29.anInt191 ^ 0xffffffff) != 0) {
									gameEntity.idleAnimId = class29.anInt191;
								}
							} else {
								gameEntity.idleAnimId = class29.anInt222;
							}
						}
					}
					if (gameEntity.idleAnimId == -1) {
						gameEntity.idleAnimId = class29.walkAnimation;
					}
				} else {
					gameEntity.anInt3017++;
					if (i_10_ <= 1024) {
						gameEntity.faceDegrees += gameEntity.anInt3010;
						boolean bool = true;
						if (gameEntity.anInt3010 > i_10_ || i_10_ > -gameEntity.anInt3010 + 2048) {
							bool = false;
							gameEntity.faceDegrees = gameEntity.newFaceDegrees;
						}
						if (gameEntity.anInt3017 > 25 || bool) {
							gameEntity.idleAnimId = class29.walkAnimation;
							if (gameEntity.walkQueuePos > 0) {
								if (gameEntity.walkQueueType[-1 + gameEntity.walkQueuePos] == 2) {
									if ((class29.anInt211 ^ 0xffffffff) != 0) {
										gameEntity.idleAnimId = class29.anInt211;
									} else if (class29.runAnimationId != -1) {
										gameEntity.idleAnimId = class29.runAnimationId;
									}
								} else if (gameEntity.walkQueueType[gameEntity.walkQueuePos - 1] != 0) {
									if ((class29.anInt222 ^ 0xffffffff) != 0) {
										gameEntity.idleAnimId = class29.anInt222;
									}
								} else if (class29.anInt198 == -1) {
									if (class29.anInt212 != -1) {
										gameEntity.idleAnimId = class29.anInt212;
									}
								} else {
									gameEntity.idleAnimId = class29.anInt198;
								}
							} else if ((class29.anInt191 ^ 0xffffffff) != 0) {
								gameEntity.idleAnimId = class29.anInt191;
							}
						}
					} else {
						gameEntity.faceDegrees -= gameEntity.anInt3010;
						boolean bool = true;
						if (i_10_ < gameEntity.anInt3010 || -gameEntity.anInt3010 + 2048 < i_10_) {
							bool = false;
							gameEntity.faceDegrees = gameEntity.newFaceDegrees;
						}
						if (gameEntity.anInt3017 > 25 || bool) {
							gameEntity.idleAnimId = class29.walkAnimation;
							if (gameEntity.walkQueuePos <= 0) {
								if (class29.anInt193 != -1) {
									gameEntity.idleAnimId = class29.anInt193;
								}
							} else if (gameEntity.walkQueueType[gameEntity.walkQueuePos - 1] == 2) {
								if ((class29.anInt194 ^ 0xffffffff) != 0) {
									gameEntity.idleAnimId = class29.anInt194;
								} else if ((class29.runAnimationId ^ 0xffffffff) != 0) {
									gameEntity.idleAnimId = class29.runAnimationId;
								}
							} else if (gameEntity.walkQueueType[gameEntity.walkQueuePos - 1] != 0) {
								if (class29.anInt202 != -1) {
									gameEntity.idleAnimId = class29.anInt202;
								}
							} else if ((class29.anInt203 ^ 0xffffffff) != 0) {
								gameEntity.idleAnimId = class29.anInt203;
							} else if ((class29.anInt212 ^ 0xffffffff) != 0) {
								gameEntity.idleAnimId = class29.anInt212;
							}
						}
					}
					gameEntity.faceDegrees &= 0x7ff;
				}
			} else {
				gameEntity.anInt3022 = 0;
				gameEntity.anInt3017 = 0;
			}
		}
	}

	static final int[] method1851(final boolean bool, final CollisionMap[] class25s, final int i_18_, final int i_19_, final int i_20_, final int i_21_, final byte[] is) {
		int i_23_;
		if (!bool) {
			i_23_ = 4;
		} else {
			i_23_ = 1;
		}
		if (!bool) {
			for (int i_24_ = 0; i_24_ < 4; i_24_++) {
				for (int i_25_ = 0; i_25_ < 64; i_25_++) {
					for (int i_26_ = 0; i_26_ < 64; i_26_++) {
						if (i_20_ + i_25_ > 0 && i_25_ + i_20_ < 103 && i_19_ + i_26_ > 0 && i_26_ + i_19_ < 103) {
							class25s[i_24_].collisionFlags[i_25_ + i_20_][i_26_ + i_19_] = Class120_Sub12_Sub3.method1207(class25s[i_24_].collisionFlags[i_25_ + i_20_][i_26_ + i_19_], -2097153);
						}
					}
				}
			}
		}
		final int i_27_ = i_21_ + i_20_;
		final Buffer class120_sub7 = new Buffer(is);
		final int i_28_ = i_18_ + i_19_;
		for (int i_29_ = 0; i_23_ > i_29_; i_29_++) {
			for (int i_30_ = 0; i_30_ < 64; i_30_++) {
				for (int i_31_ = 0; i_31_ < 64; i_31_++) {
					Class10.method119(class120_sub7, false, bool, i_29_, i_27_ + i_30_, i_31_ + i_28_, i_31_ + i_19_, 0, 0, 0, i_20_ + i_30_);
				}
			}
		}
		boolean bool_32_ = false;
		boolean bool_33_ = false;
		while (class120_sub7.buf.length > class120_sub7.pos) {
			final int i_34_ = class120_sub7.getUByte();
			if (i_34_ != 128) {
				if (i_34_ != 129) {
					class120_sub7.pos--;
					break;
				}
				for (int i_35_ = 0; i_35_ < 4; i_35_++) {
					final byte i_36_ = class120_sub7.getByte();
					if (i_36_ == 0) {
						int i_37_ = i_20_ + 64;
						if (i_37_ < 0) {
							i_37_ = 0;
						} else if (i_37_ >= 104) {
							i_37_ = 104;
						}
						int i_38_ = i_20_;
						int i_39_ = i_19_;
						if (i_39_ < 0) {
							i_39_ = 0;
						} else if (i_39_ >= 104) {
							i_39_ = 104;
						}
						int i_40_ = 64 + i_19_;
						if (i_38_ >= 0) {
							if (i_38_ >= 104) {
								i_38_ = 104;
							}
						} else {
							i_38_ = 0;
						}
						if (i_40_ >= 0) {
							if (i_40_ >= 104) {
								i_40_ = 104;
							}
						} else {
							i_40_ = 0;
						}
						for (/**/; i_37_ > i_38_; i_38_++) {
							for (/**/; i_39_ < i_40_; i_39_++) {
								Class114.aByteArrayArrayArray1094[i_35_][i_38_][i_39_] = (byte) 0;
							}
						}
					} else if (i_36_ == 1) {
						for (int i_41_ = 0; i_41_ < 64; i_41_ += 4) {
							for (int i_42_ = 0; i_42_ < 64; i_42_ += 4) {
								final byte i_43_ = class120_sub7.getByte();
								for (int i_44_ = i_41_ + i_20_; i_41_ - (-i_20_ - 4) > i_44_; i_44_++) {
									for (int i_45_ = i_19_ + i_42_; 4 + i_42_ + i_19_ > i_45_; i_45_++) {
										if (i_44_ >= 0 && i_44_ < 104 && i_45_ >= 0 && i_45_ < 104) {
											Class114.aByteArrayArrayArray1094[i_35_][i_44_][i_45_] = i_43_;
										}
									}
								}
							}
						}
					} else if (i_36_ == 2 && i_35_ > 0) {
						int i_46_ = 64 + i_20_;
						if (i_46_ >= 0) {
							if (i_46_ >= 104) {
								i_46_ = 104;
							}
						} else {
							i_46_ = 0;
						}
						int i_47_ = i_19_;
						if (i_47_ < 0) {
							i_47_ = 0;
						} else if (i_47_ >= 104) {
							i_47_ = 104;
						}
						int i_48_ = i_20_;
						int i_49_ = 64 + i_19_;
						if (i_48_ >= 0) {
							if (i_48_ >= 104) {
								i_48_ = 104;
							}
						} else {
							i_48_ = 0;
						}
						if (i_49_ >= 0) {
							if (i_49_ >= 104) {
								i_49_ = 104;
							}
						} else {
							i_49_ = 0;
						}
						for (/**/; i_46_ > i_48_; i_48_++) {
							for (/**/; i_49_ > i_47_; i_47_++) {
								Class114.aByteArrayArrayArray1094[i_35_][i_48_][i_47_] = Class114.aByteArrayArrayArray1094[i_35_ + -1][i_48_][i_47_];
							}
						}
					}
				}
				bool_33_ = true;
			} else {
				bool_32_ = true;
				CanvasWrapper.anIntArray21[0] = class120_sub7.getUShort();
				CanvasWrapper.anIntArray21[1] = class120_sub7.getShort();
				CanvasWrapper.anIntArray21[2] = class120_sub7.getShort();
				CanvasWrapper.anIntArray21[3] = class120_sub7.getShort();
				CanvasWrapper.anIntArray21[4] = class120_sub7.getUShort();
			}
		}
		if (HDToolkit.glEnabled && !bool) {
			ChunkAtmosphere class191 = null;
			while (class120_sub7.pos < class120_sub7.buf.length) {
				final int type = class120_sub7.getUByte();
				if (type == 0) {
					class191 = new ChunkAtmosphere(class120_sub7);
				} else if (type == 1) {
					final int lightAmount = class120_sub7.getUByte();
					if (lightAmount > 0) {
						for (int lightId = 0; lightId < lightAmount; lightId++) {
							final Light light = new Light(class120_sub7);
							if (light.anInt376 == 31) {
								final LightType class181 = LightType.list(class120_sub7.getUShort());
								light.method347(class181.anInt1789, class181.anInt1786, class181.anInt1788, class181.anInt1787);
							}
							light.x += i_20_ << 7;
							light.z += i_19_ << 7;
							final int tileX = light.x >> 7;
							final int tileZ = light.z >> 7;
							if (tileX >= 0 && tileZ >= 0 && tileX < 104 && tileZ < 104) {
								light.lightOverBridge = (Class114.tileSettings[1][tileX][tileZ] & 0x2) != 0;
								light.y = SubInterface.activeTileHeightMap[light.level][tileX][tileZ] - light.y;
								LightManager.addLight(light);
							}
						}
					}
				} else if (type == 2) {
					if (class191 == null) {
						class191 = new ChunkAtmosphere();
					}
					class191.method2510(class120_sub7);
				} else {
					throw new IllegalStateException();
				}
			}
			if (class191 == null) {
				class191 = new ChunkAtmosphere();
			}
			for (int i_55_ = 0; i_55_ < 8; i_55_++) {
				for (int i_56_ = 0; i_56_ < 8; i_56_++) {
					final int x = (i_20_ >> 3) + i_55_;
					final int z = (i_19_ >> 3) + i_56_;
					if (x >= 0 && x < 13 && z >= 0 && z < 13) {
						Identikit.chunksAtmosphere[x][z] = class191;
					}
				}
			}
		}
		if (!bool_33_) {
			for (int i_59_ = 0; i_59_ < 4; i_59_++) {
				for (int i_60_ = 0; i_60_ < 16; i_60_++) {
					for (int i_61_ = 0; i_61_ < 16; i_61_++) {
						final int i_62_ = (i_19_ >> 2) + i_61_;
						final int i_63_ = (i_20_ >> 2) + i_60_;
						if (i_63_ >= 0 && i_63_ < 26 && i_62_ >= 0 && i_62_ < 26) {
							Class114.aByteArrayArrayArray1094[i_59_][i_63_][i_62_] = (byte) 0;
						}
					}
				}
			}
		}
		return bool_32_ ? CanvasWrapper.anIntArray21 : null;
	}

	@Override
	final void drawImage(final Graphics graphics, final int x, final int y) {
		setPixels();
		graphics.drawImage(this.image, x, y, this);
	}

	static final void method1853(final int i, final int i_66_, final int i_68_, final int i_69_, final int i_70_, final int i_71_, int i_72_) {
		if (i_66_ >= 0 && i_69_ >= 0 && i_66_ < 103 && i_69_ < 103) {
			if (i_70_ == 0) {
				final WallLocation class182 = Deque.getWallLocation(i_66_, i_69_, i_68_);
				if (class182 != null) {
					final int i_73_ = (int) (class182.bitPackedUid >>> 32) & 0x7fffffff;
					if (i_72_ == 2) {
						class182.aClass180_1800 = new AnimatedLocation(i_73_, 2, 4 + i_71_, i_68_, i_66_, i_69_, i, false, class182.aClass180_1800);
						class182.aClass180_1796 = new AnimatedLocation(i_73_, 2, 1 + i_71_ & 0x3, i_68_, i_66_, i_69_, i, false, class182.aClass180_1796);
					} else {
						class182.aClass180_1800 = new AnimatedLocation(i_73_, i_72_, i_71_, i_68_, i_66_, i_69_, i, false, class182.aClass180_1800);
					}
				}
			}
			if (i_70_ == 1) {
				final WallDecoration class186 = ObjType.getWallDecoration(i_66_, i_69_, i_68_);
				if (class186 != null) {
					final int i_74_ = 0x7fffffff & (int) (class186.bitPacked >>> 32);
					if (i_72_ != 4 && i_72_ != 5) {
						if (i_72_ != 6) {
							if (i_72_ == 7) {
								class186.aClass180_1901 = new AnimatedLocation(i_74_, 4, (0x3 & i_71_ - -2) - -4, i_68_, i_66_, i_69_, i, false, class186.aClass180_1901);
							} else if (i_72_ == 8) {
								class186.aClass180_1901 = new AnimatedLocation(i_74_, 4, 4 + i_71_, i_68_, i_66_, i_69_, i, false, class186.aClass180_1901);
								class186.aClass180_1898 = new AnimatedLocation(i_74_, 4, (i_71_ - -2 & 0x3) + 4, i_68_, i_66_, i_69_, i, false, class186.aClass180_1898);
							}
						} else {
							class186.aClass180_1901 = new AnimatedLocation(i_74_, 4, 4 + i_71_, i_68_, i_66_, i_69_, i, false, class186.aClass180_1901);
						}
					} else {
						class186.aClass180_1901 = new AnimatedLocation(i_74_, 4, i_71_, i_68_, i_66_, i_69_, i, false, class186.aClass180_1901);
					}
				}
			}
			if (i_70_ == 2) {
				if (i_72_ == 11) {
					i_72_ = 10;
				}
				final Class28 class28 = SpotAnimation.method2315(i_66_, i_69_, i_68_);
				if (class28 != null) {
					class28.sceneGraphNode = new AnimatedLocation((int) (class28.bitPacked >>> 32) & 0x7fffffff, i_72_, i_71_, i_68_, i_66_, i_69_, i, false, class28.sceneGraphNode);
				}
			}
			if (i_70_ == 3) {
				final GroundDecoration class36 = client.getGroundDecoration(i_66_, i_69_, i_68_);
				if (class36 != null) {
					class36.sceneGraphNode = new AnimatedLocation(0x7fffffff & (int) (class36.bitPackedUid >>> 32), 22, i_71_, i_68_, i_66_, i_69_, i, false, class36.sceneGraphNode);
				}
			}
		}
	}

	static final void method1854(final JagexInterface jagexInterface, final boolean activateResizeListener) {
		final int i = jagexInterface.maxScrollHorizontal == 0 ? jagexInterface.width : jagexInterface.maxScrollHorizontal;
		final int i_76_ = jagexInterface.maxScrollVertical == 0 ? jagexInterface.height : jagexInterface.maxScrollVertical;
		WorldInfo.method2065(JagexInterface.interfaceCache[jagexInterface.bitPacked >> 16], activateResizeListener, i, i_76_, jagexInterface.bitPacked);
		if (jagexInterface.components != null) {
			WorldInfo.method2065(jagexInterface.components, activateResizeListener, i, i_76_, jagexInterface.bitPacked);
		}
		final SubInterface subInterface = (SubInterface) Class120_Sub12_Sub13.subInterfaces.get(jagexInterface.bitPacked);
		if (subInterface != null) {
			Class120_Sub12_Sub12.method1258(subInterface.interfaceId, i, i_76_, activateResizeListener);
		}
	}

	@Override
	public final boolean imageUpdate(final Image image, final int i, final int i_77_, final int i_78_, final int i_79_, final int i_80_) {
		return true;
	}

	@Override
	public final void startProduction(final ImageConsumer imageconsumer) {
		addConsumer(imageconsumer);
	}

	public ProducingGraphicsBuffer() {
		/* empty */
	}

	private final synchronized void setPixels(final int x, final int y, final int width, final int height) {
		if (imageConsumer != null) {
			imageConsumer.setPixels(x, y, width, height, colorModel, this.pixels, this.width * y + x, this.width);
			imageConsumer.imageComplete(2);
		}
	}

	@Override
	public final synchronized boolean isConsumer(final ImageConsumer imageconsumer) {
		return imageConsumer == imageconsumer;
	}

	@Override
	public final synchronized void removeConsumer(final ImageConsumer imageconsumer) {
		if (imageConsumer == imageconsumer) {
			imageConsumer = null;
		}
	}

	@Override
	final void init(final Component component, final int width, final int height) {
		this.width = width;
		this.height = height;
		this.pixels = new int[1 + width * height];
		colorModel = new DirectColorModel(32, 16711680, 65280, 255);
		this.image = component.createImage(this);
		setPixels();
		component.prepareImage(this.image, this);
		setPixels();
		component.prepareImage(this.image, this);
		setPixels();
		component.prepareImage(this.image, this);
		init2dCanvas();
	}
}
