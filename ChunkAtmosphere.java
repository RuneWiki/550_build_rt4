/* Class191 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class ChunkAtmosphere {
	float lightModelAmbient;
	static boolean flickeringEffectsOn = true;
	float light1Diffuse;
	float light0Diffuse;
	int lightZ;
	float aFloat2108;
	int screenColorRgb;
	int lightX;
	int fogColorRgb;
	int lightY;
	static int lastMouseY = 0;
	float aFloat2114 = 0.25F;
	static int p12fullId;
	float aFloat2116 = 1.0F;
	Class120_Sub14_Sub9 aClass120_Sub14_Sub9_2117;
	int fogDepth;
	static int[] torchesFlamesBaseColors;

	static {
		torchesFlamesBaseColors = new int[] { 12543016, 15504954, 15914854, 16773818 };
	}

	static final void method2508() {
		if (FileSystem.anInt455 != 2) {
			if (Class115.menuMouseX == js5.lastClickX && Class120_Sub12_Sub21.menuMouseY == Class120_Sub12_Sub36.lastClickY) {
				FileSystem.anInt455 = 0;
				if (SpotAnimationNode.shiftClickEnabled && NodeCache.heldKeys[81] && WallDecoration.menuOptionCount > 2) {
					GameShell.method31(WallDecoration.menuOptionCount - 2);
				} else {
					GameShell.method31(WallDecoration.menuOptionCount - 1);
				}
			} else {
				FileSystem.anInt455 = 2;
				Class31.anInt250 = Class120_Sub12_Sub36.lastClickY;
				ClientScript.anInt3558 = js5.lastClickX;
			}
		} else if (Class115.menuMouseX == ClientScript.anInt3558 && Class31.anInt250 == Class120_Sub12_Sub21.menuMouseY) {
			FileSystem.anInt455 = 0;
			if (SpotAnimationNode.shiftClickEnabled && NodeCache.heldKeys[81] && WallDecoration.menuOptionCount > 2) {
				GameShell.method31(WallDecoration.menuOptionCount - 2);
			} else {
				GameShell.method31(WallDecoration.menuOptionCount - 1);
			}
		}
	}

	final void method2510(final Buffer buffer) {
		this.aFloat2108 = buffer.getUByte() * 8 / 255.0F;
		this.aFloat2114 = buffer.getUByte() * 8 / 255.0F;
		this.aFloat2116 = buffer.getUByte() * 8 / 255.0F;
	}

	static int method2512(final int i, final int i_5_) {
		return i | i_5_;
	}

	static final void method2513() {
		if (client.packetType == 17) {
			final int i_7_ = Canvas_Sub1.inputStream.getUByte();
			int i_8_ = MagnetType.anInt254 * 2 + (i_7_ >> 4 & 0xf);
			int i_9_ = Class28.anInt176 * 2 + (i_7_ & 0xf);
			int i_10_ = Canvas_Sub1.inputStream.getByte() + i_8_;
			int i_11_ = Canvas_Sub1.inputStream.getByte() + i_9_;
			final int i_12_ = Canvas_Sub1.inputStream.getShort();
			final int i_13_ = Canvas_Sub1.inputStream.getUShort();
			final int i_14_ = Canvas_Sub1.inputStream.getUByte() * 4;
			final int i_15_ = Canvas_Sub1.inputStream.getUByte() * 4;
			final int i_16_ = Canvas_Sub1.inputStream.getUShort();
			final int i_17_ = Canvas_Sub1.inputStream.getUShort();
			int i_18_ = Canvas_Sub1.inputStream.getUByte();
			if (i_18_ == 0xff) {
				i_18_ = -1;
			}
			final int i_19_ = Canvas_Sub1.inputStream.getUByte();
			if (i_8_ >= 0 && i_9_ >= 0 && i_8_ < 208 && i_9_ < 208 && i_10_ >= 0 && i_11_ >= 0 && i_10_ < 208 && i_11_ < 208 && i_13_ != 0xffff) {
				i_8_ *= 64;
				i_9_ *= 64;
				i_10_ *= 64;
				i_11_ *= 64;
				final Projectile class180_sub4 = new Projectile(i_13_, Class173.gameLevel, i_8_, i_9_, Class22.getTileHeight(i_8_, i_9_, Class173.gameLevel) - i_14_, i_16_ + Class101_Sub2.clientClock, i_17_ + Class101_Sub2.clientClock, i_18_, i_19_, i_12_, i_15_);
				class180_sub4.method2319(i_10_, Class22.getTileHeight(i_10_, i_11_, Class173.gameLevel) - i_15_, i_11_, i_16_ + Class101_Sub2.clientClock);
				FileSystemRequest.projectileDeque.addLast(new ProjectileNode(class180_sub4));
			}
		} else if (client.packetType == 114) {
			final int i_20_ = Canvas_Sub1.inputStream.getUByte();
			final int x = MagnetType.anInt254 + (i_20_ >> 4 & 0x7);
			final int z = Class28.anInt176 + (i_20_ & 0x7);
			final int objectId = Canvas_Sub1.inputStream.getUShort();
			final int currentObjectAmount = Canvas_Sub1.inputStream.getUShort();
			final int newObjectAmount = Canvas_Sub1.inputStream.getUShort();
			if (x >= 0 && z >= 0 && x < 104 && z < 104) {
				final Deque deque = ClientScript.groundObjects[Class173.gameLevel][x][z];
				if (deque != null) {
					for (GroundObjectNode groundObjectNode = (GroundObjectNode) deque.getFront(); groundObjectNode != null; groundObjectNode = (GroundObjectNode) deque.getNext()) {
						final SceneGroundObject sceneGroundObject = groundObjectNode.sceneGroundObject;
						if (sceneGroundObject.id == (objectId & 0x7fff) && currentObjectAmount == sceneGroundObject.amount) {
							sceneGroundObject.amount = newObjectAmount;
							break;
						}
					}
					Class5.spawnGroundObject(x, z);
				}
			}
		} else if (client.packetType == 133) {
			final int i_26_ = Canvas_Sub1.inputStream.getShortA();
			final int i_27_ = Canvas_Sub1.inputStream.getUByteA();
			final int i_28_ = Class28.anInt176 + (i_27_ & 0x7);
			final int i_29_ = MagnetType.anInt254 + (i_27_ >> 4 & 0x7);
			final int i_30_ = Canvas_Sub1.inputStream.getULEShortA();
			final int i_31_ = Canvas_Sub1.inputStream.getUByte();
			final int i_32_ = i_31_ >> 2;
			final byte i_33_ = Canvas_Sub1.inputStream.getByteS();
			final int i_34_ = 0x3 & i_31_;
			final byte i_35_ = Canvas_Sub1.inputStream.getByteC();
			final byte i_36_ = Canvas_Sub1.inputStream.getByte();
			final byte i_37_ = Canvas_Sub1.inputStream.getByteC();
			final int i_38_ = Canvas_Sub1.inputStream.getULEShortA();
			final int i_39_ = Canvas_Sub1.inputStream.getUShort();
			if (!HDToolkit.glEnabled) {
				Class120_Sub12_Sub6.method1226(i_33_, i_26_, i_30_, i_38_, i_32_, i_35_, i_36_, i_39_, i_34_, i_28_, i_37_, i_29_);
			}
		} else if (client.packetType == 111) {
			final int i_40_ = Canvas_Sub1.inputStream.getUByte();
			int i_41_ = 2 * MagnetType.anInt254 + (i_40_ >> 4 & 0xf);
			int i_42_ = (i_40_ & 0xf) + Class28.anInt176 * 2;
			int i_43_ = Canvas_Sub1.inputStream.getByte() + i_41_;
			int i_44_ = i_42_ - -Canvas_Sub1.inputStream.getByte();
			final int i_45_ = Canvas_Sub1.inputStream.getShort();
			final int i_46_ = Canvas_Sub1.inputStream.getShort();
			final int i_47_ = Canvas_Sub1.inputStream.getUShort();
			int i_48_ = Canvas_Sub1.inputStream.getByte();
			final int i_49_ = 4 * Canvas_Sub1.inputStream.getUByte();
			final int i_50_ = Canvas_Sub1.inputStream.getUShort();
			final int i_51_ = Canvas_Sub1.inputStream.getUShort();
			int i_52_ = Canvas_Sub1.inputStream.getUByte();
			if (i_52_ == 255) {
				i_52_ = -1;
			}
			final int i_53_ = Canvas_Sub1.inputStream.getUByte();
			if (i_41_ >= 0 && i_42_ >= 0 && i_41_ < 208 && i_42_ < 208 && i_43_ >= 0 && i_44_ >= 0 && i_43_ < 208 && i_44_ < 208 && i_47_ != 65535) {
				i_44_ *= 64;
				i_43_ *= 64;
				i_41_ *= 64;
				i_42_ *= 64;
				if (i_45_ != 0) {
					int i_54_;
					GameEntity class180_sub5;
					if (i_45_ >= 0) {
						final int i_55_ = i_45_ - 1;
						i_54_ = (0x782f & i_55_) >> 11;
						final int i_56_ = 0x7ff & i_55_;
						class180_sub5 = Class120_Sub12_Sub11.npcList[i_56_];
					} else {
						final int i_57_ = -i_45_ - 1;
						i_54_ = (i_57_ & 0x7c23) >> 11;
						final int i_58_ = 0x7ff & i_57_;
						if (i_58_ == Class167.selfPlayerIndex) {
							class180_sub5 = TileParticleQueue.selfPlayer;
						} else {
							class180_sub5 = Class118.playersList[i_58_];
						}
					}
					if (class180_sub5 != null) {
						final BasType class29 = class180_sub5.getBasType();
						if (class29.modelRotateTranslate != null && class29.modelRotateTranslate[i_54_] != null) {
							i_48_ -= class29.modelRotateTranslate[i_54_][1];
							int i_59_ = class29.modelRotateTranslate[i_54_][0];
							final int i_60_ = Rasterizer.sinTable[class180_sub5.faceDegrees];
							int i_61_ = class29.modelRotateTranslate[i_54_][2];
							final int i_62_ = Rasterizer.cosTable[class180_sub5.faceDegrees];
							final int i_63_ = i_59_ * i_62_ + i_60_ * i_61_ >> 16;
							i_61_ = -(i_59_ * i_60_) + i_62_ * i_61_ >> 16;
							i_59_ = i_63_;
							i_42_ += i_61_;
							i_41_ += i_59_;
						}
					}
				}
				final Projectile class180_sub4 = new Projectile(i_47_, Class173.gameLevel, i_41_, i_42_, Class22.getTileHeight(i_41_, i_42_, Class173.gameLevel) + -i_48_, i_50_ - -Class101_Sub2.clientClock, Class101_Sub2.clientClock + i_51_, i_52_, i_53_, i_46_, i_49_);
				class180_sub4.method2319(i_43_, Class22.getTileHeight(i_43_, i_44_, Class173.gameLevel) + -i_49_, i_44_, Class101_Sub2.clientClock + i_50_);
				FileSystemRequest.projectileDeque.addLast(new ProjectileNode(class180_sub4));
			}
		} else if (client.packetType == 158) {
			final int coordsOff = Canvas_Sub1.inputStream.getUByte();
			int x = MagnetType.anInt254 + (coordsOff >> 4 & 0x7);
			int z = Class28.anInt176 + (coordsOff & 0x7);
			final int id = Canvas_Sub1.inputStream.getUShort();
			final int y = Canvas_Sub1.inputStream.getUByte();
			final int delay = Canvas_Sub1.inputStream.getUShort();
			if (x >= 0 && z >= 0 && x < 104 && z < 104) {
				x = 64 + 128 * x;
				z = 64 + 128 * z;
				final SpotAnimation spotAnimation = new SpotAnimation(id, Class173.gameLevel, x, z, Class22.getTileHeight(x, z, Class173.gameLevel) - y, delay, Class101_Sub2.clientClock);
				Class120_Sub12_Sub7.spotAnimationDeque.addLast(new SpotAnimationNode(spotAnimation));
			}
		} else if (client.packetType == 179) {
			int i_70_ = Canvas_Sub1.inputStream.getUShort();
			if (i_70_ == 65535) {
				i_70_ = -1;
			}
			final int i_71_ = Canvas_Sub1.inputStream.getUByteS();
			final int i_72_ = i_71_ >> 2;
			final int i_73_ = 0x3 & i_71_;
			final int i_74_ = CollisionMap.locTypeToClientType[i_72_];
			final int i_75_ = Canvas_Sub1.inputStream.getUByte();
			final int i_76_ = (i_75_ & 0x7) + Class28.anInt176;
			final int i_77_ = MagnetType.anInt254 + ((0x7f & i_75_) >> 4);
			ProducingGraphicsBuffer.method1853(i_70_, i_77_, Class173.gameLevel, i_76_, i_74_, i_73_, i_72_);
		} else if (client.packetType == 131) {
			final int renderInfo = Canvas_Sub1.inputStream.getUByteS();
			final int type = renderInfo >> 2;
			final int clientType = CollisionMap.locTypeToClientType[type];
			final int rotation = renderInfo & 0x3;
			final int id = Canvas_Sub1.inputStream.getULEShort();
			final int coordsOff = Canvas_Sub1.inputStream.getUByte();
			final int x = MagnetType.anInt254 + (coordsOff >> 4 & 0x7);
			final int z = Class28.anInt176 + (coordsOff & 0x7);
			if (x >= 0 && z >= 0 && x < 104 && z < 104) {
				Class38.spawnCustomLocation(id, Class173.gameLevel, rotation, x, -1, z, type, clientType, 0);
			}
		} else if (client.packetType == 115) {
			final int i_86_ = Canvas_Sub1.inputStream.getUShort();
			final int i_87_ = Canvas_Sub1.inputStream.getUByte();
			LocType.list(i_86_).method2460(i_87_);
		} else if (client.packetType == 232) {
			final int coordsOff = Canvas_Sub1.inputStream.getUByteC();
			final int x = MagnetType.anInt254 + (coordsOff >> 4 & 0x7);
			final int z = Class28.anInt176 + (coordsOff & 0x7);
			final int renderInfo = Canvas_Sub1.inputStream.getUByte();
			final int type = renderInfo >> 2;
			final int clientType = CollisionMap.locTypeToClientType[type];
			final int rotation = renderInfo & 0x3;
			if (x >= 0 && z >= 0 && x < 104 && z < 104) {
				Class38.spawnCustomLocation(-1, Class173.gameLevel, rotation, x, -1, z, type, clientType, 0);
			}
		} else if (client.packetType == 105) {
			final int i_95_ = Canvas_Sub1.inputStream.getUByte();
			int i_96_ = (i_95_ >> 4 & 0x7) + MagnetType.anInt254;
			int i_97_ = (i_95_ & 0x7) + Class28.anInt176;
			int i_98_ = Canvas_Sub1.inputStream.getByte() + i_96_;
			int i_99_ = Canvas_Sub1.inputStream.getByte() + i_97_;
			final int i_100_ = Canvas_Sub1.inputStream.getShort();
			final int i_101_ = Canvas_Sub1.inputStream.getUShort();
			final int i_102_ = Canvas_Sub1.inputStream.getUByte() * 4;
			final int i_103_ = 4 * Canvas_Sub1.inputStream.getUByte();
			final int i_104_ = Canvas_Sub1.inputStream.getUShort();
			final int i_105_ = Canvas_Sub1.inputStream.getUShort();
			int i_106_ = Canvas_Sub1.inputStream.getUByte();
			final int i_107_ = Canvas_Sub1.inputStream.getUByte();
			if (i_106_ == 255) {
				i_106_ = -1;
			}
			if (i_96_ >= 0 && i_97_ >= 0 && i_96_ < 104 && i_97_ < 104 && i_98_ >= 0 && i_99_ >= 0 && i_98_ < 104 && i_99_ < 104 && 65535 != i_101_) {
				i_97_ = 64 + 128 * i_97_;
				i_98_ = i_98_ * 128 + 64;
				i_99_ = 64 + i_99_ * 128;
				i_96_ = 64 + i_96_ * 128;
				final Projectile class180_sub4 = new Projectile(i_101_, Class173.gameLevel, i_96_, i_97_, Class22.getTileHeight(i_96_, i_97_, Class173.gameLevel) - i_102_, i_104_ + Class101_Sub2.clientClock, i_105_  + Class101_Sub2.clientClock, i_106_, i_107_, i_100_, i_103_);
				class180_sub4.method2319(i_98_, Class22.getTileHeight(i_98_, i_99_, Class173.gameLevel) - i_103_, i_99_, i_104_ + Class101_Sub2.clientClock);
				FileSystemRequest.projectileDeque.addLast(new ProjectileNode(class180_sub4));
			}
		} else if (client.packetType == 120) {
			final int i_108_ = Canvas_Sub1.inputStream.getUByteS();
			final int i_109_ = MagnetType.anInt254 - -((0x73 & i_108_) >> 4);
			final int i_110_ = (0x7 & i_108_) + Class28.anInt176;
			final int i_111_ = Canvas_Sub1.inputStream.getUShortA();
			if (i_109_ >= 0 && i_110_ >= 0 && i_109_ < 104 && i_110_ < 104) {
				final Deque deque = ClientScript.groundObjects[Class173.gameLevel][i_109_][i_110_];
				if (deque != null) {
					for (GroundObjectNode class120_sub14_sub21 = (GroundObjectNode) deque.getFront(); class120_sub14_sub21 != null; class120_sub14_sub21 = (GroundObjectNode) deque.getNext()) {
						if ((i_111_ & 0x7fff) == class120_sub14_sub21.sceneGroundObject.id) {
							class120_sub14_sub21.unlink();
							break;
						}
					}
					if (deque.getFront() == null) {
						ClientScript.groundObjects[Class173.gameLevel][i_109_][i_110_] = null;
					}
					Class5.spawnGroundObject(i_109_, i_110_);
				}
			}
		} else if (client.packetType == 60) {
			final int i_112_ = Canvas_Sub1.inputStream.getUByteA();
			final int i_113_ = Class28.anInt176 + (0x7 & i_112_);
			final int i_114_ = (i_112_ >> 4 & 0x7) + MagnetType.anInt254;
			final int i_115_ = Canvas_Sub1.inputStream.getULEShort();
			final int i_116_ = Canvas_Sub1.inputStream.getUShortA();
			if (i_114_ >= 0 && i_113_ >= 0 && i_114_ < 104 && i_113_ < 104) {
				final SceneGroundObject class180_sub1 = new SceneGroundObject();
				class180_sub1.amount = i_116_;
				class180_sub1.id = i_115_;
				if (ClientScript.groundObjects[Class173.gameLevel][i_114_][i_113_] == null) {
					ClientScript.groundObjects[Class173.gameLevel][i_114_][i_113_] = new Deque();
				}
				ClientScript.groundObjects[Class173.gameLevel][i_114_][i_113_].addLast(new GroundObjectNode(class180_sub1));
				Class5.spawnGroundObject(i_114_, i_113_);
			}
		} else if (client.packetType == 144) {
			final int i_117_ = Canvas_Sub1.inputStream.getUByte();
			final int z = Class28.anInt176 + (i_117_ & 0x7);
			final int x = MagnetType.anInt254 + (0x7 & i_117_ >> 4);
			int synth = Canvas_Sub1.inputStream.getUShort();
			if (synth == 0xffff) {
				synth = -1;
			}
			final int i_121_ = Canvas_Sub1.inputStream.getUByte();
			final int range = 0xf & i_121_ >> 4;
			final int loops = 0x7 & i_121_;
			final int i_124_ = Canvas_Sub1.inputStream.getUByte();
			final int i_125_ = Canvas_Sub1.inputStream.getUByte();
			if (x >= 0 && z >= 0 && x < 104 && z < 104) {
				final int i_126_ = range + 1;
				if (-i_126_ + x <= TileParticleQueue.selfPlayer.walkQueueX[0] && TileParticleQueue.selfPlayer.walkQueueX[0] <= i_126_ + x && z + -i_126_ <= TileParticleQueue.selfPlayer.walkQueueZ[0] && z - -i_126_ >= TileParticleQueue.selfPlayer.walkQueueZ[0] && CursorType.ambientSoundsVolume != 0 && loops > 0 && Class150.soundEffectCount < 50 && synth != -1) {
					Class120_Sub12_Sub16.soundEffectIds[Class150.soundEffectCount] = synth;
					LocType.soundEffectLoops[Class150.soundEffectCount] = loops;
					Class81.soundEffectDelays[Class150.soundEffectCount] = i_124_;
					Class109.soundEffects[Class150.soundEffectCount] = null;
					Class174.SoundEffectCoordinates[Class150.soundEffectCount] = range + (z << 8) + (x << 16);
					FileSystemRequest.soundEffectVolumes[Class150.soundEffectCount] = i_125_;
					Class150.soundEffectCount++;
				}
			}
		} else if (client.packetType == 47) {
			final int i_127_ = Canvas_Sub1.inputStream.getULEShortA();
			final int i_128_ = Canvas_Sub1.inputStream.getUShort();
			final int i_129_ = Canvas_Sub1.inputStream.getUShort();
			final int i_130_ = Canvas_Sub1.inputStream.getUByteA();
			final int i_131_ = ((i_130_ & 0x7a) >> 4) + MagnetType.anInt254;
			final int i_132_ = Class28.anInt176 + (0x7 & i_130_);
			if (i_131_ >= 0 && i_132_ >= 0 && i_131_ < 104 && i_132_ < 104 && i_128_ != Class167.selfPlayerIndex) {
				final SceneGroundObject class180_sub1 = new SceneGroundObject();
				class180_sub1.amount = i_129_;
				class180_sub1.id = i_127_;
				if (ClientScript.groundObjects[Class173.gameLevel][i_131_][i_132_] == null) {
					ClientScript.groundObjects[Class173.gameLevel][i_131_][i_132_] = new Deque();
				}
				ClientScript.groundObjects[Class173.gameLevel][i_131_][i_132_].addLast(new GroundObjectNode(class180_sub1));
				Class5.spawnGroundObject(i_131_, i_132_);
			}
		}
	}

	static final LDIndexedSprite[] constructLDIndexedSprites(final js5 js5, final int groupId) {
		if (!ObjType.decodedSprites(js5, groupId)) {
			return null;
		}
		return AbstractRequest.constructLDIndexedSprites();
	}

	public ChunkAtmosphere() {
		this.aFloat2108 = 1.0F;
		this.screenColorRgb = AtmosphereManager.defaultLightColorRgb;
		this.light1Diffuse = 1.2F;
		this.lightZ = -50;
		this.lightX = -50;
		this.fogDepth = 0;
		this.lightModelAmbient = 1.1523438F;
		this.lightY = -60;
		this.light0Diffuse = 0.69921875F;
		this.fogColorRgb = AtmosphereManager.defaulFogColorRgb;
		if (World.anIntArray2835 != null) {
			this.aClass120_Sub14_Sub9_2117 = Class120_Sub14_Sub9.method1498(World.anIntArray2835[0], World.anIntArray2835[1], World.anIntArray2835[2], World.anIntArray2835[3], World.anIntArray2835[4], World.anIntArray2835[5]);
		}
	}

	ChunkAtmosphere(final Buffer buffer) {
		this.aFloat2108 = 1.0F;
		final int flag = buffer.getUByte();
		if ((flag & 0x1) == 0) {
			this.screenColorRgb = AtmosphereManager.defaultLightColorRgb;
		} else {
			this.screenColorRgb = buffer.getInt();
		}
		if ((flag & 0x2) == 0) {
			this.lightModelAmbient = 1.1523438F;
		} else {
			this.lightModelAmbient = buffer.getUShort() / 256.0F;
		}
		if ((flag & 0x4) == 0) {
			this.light0Diffuse = 0.69921875F;
		} else {
			this.light0Diffuse = buffer.getUShort() / 256.0F;
		}
		if ((flag & 0x8) == 0) {
			this.light1Diffuse = 1.2F;
		} else {
			this.light1Diffuse = buffer.getUShort() / 256.0F;
		}
		if ((flag & 0x10) == 0) {
			this.lightX = -50;
			this.lightY = -60;
			this.lightZ = -50;
		} else {
			this.lightX = buffer.getShort();
			this.lightY = buffer.getShort();
			this.lightZ = buffer.getShort();

		}
		if ((flag & 0x20) == 0) {
			this.fogColorRgb = AtmosphereManager.defaulFogColorRgb;
		} else {
			this.fogColorRgb = buffer.getInt();
		}
		if ((flag & 0x40) == 0) {
			this.fogDepth = 0;
		} else {
			this.fogDepth = buffer.getUShort();
		}
		if ((flag & 0x80) == 0) {
			if (World.anIntArray2835 != null) {
				this.aClass120_Sub14_Sub9_2117 = Class120_Sub14_Sub9.method1498(World.anIntArray2835[0], World.anIntArray2835[1], World.anIntArray2835[2], World.anIntArray2835[3], World.anIntArray2835[4], World.anIntArray2835[5]);
			}
		} else {
			this.aClass120_Sub14_Sub9_2117 = Class120_Sub14_Sub9.method1498(buffer.getUShort(), buffer.getUShort(), buffer.getUShort(), buffer.getUShort(), buffer.getUShort(), buffer.getUShort());
		}
	}
}
