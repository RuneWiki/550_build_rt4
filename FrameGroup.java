/* Class120_Sub14_Sub18 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;

final class FrameGroup extends NodeSub {
	static int anInt3609 = 0;
	SeqFrame[] seqFrames;
	static ObjectCache recentUse = new ObjectCache(100);
	static AbstractSprite aClass120_Sub14_Sub19_3611;
	static int anInt3612 = -1;

	static final void loadPreferencesFile(final Signlink signlink) {
		FileOnDisk preferencesFile = null;
		FileSystemRequest.brightness = 3;
		GameShell.setAllVisibleLevels(true);
		Class120_Sub6.characterShadowsOn = true;
		ParticleNodeSub.highDetailTextures = true;
		Class120_Sub12.removeRoofsSelectively = true;
		CursorType.ambientSoundsVolume = 127;
		Class120_Sub30_Sub1.manyGroundTextures = true;
		Hashtable.showGroundDecorations = true;
		Class120_Sub12_Sub6.highLightingDetail = true;
		ChunkAtmosphere.flickeringEffectsOn = true;
		PacketBuffer.highWaterDetail = true;
		Class167.isStereo = true;
		Class120_Sub12_Sub18.lastFullscreenWidth = 0;
		Decimator.fogEnabled = true;
		Class74.sceneryShadowsType = 2;
		Class111.soundEffectVolume = 127;
		Class120_Sub12_Sub12.lastFullscreenHeight = 0;
		GroundDecoration.antiAliasingSamples = 0;
		Class120_Sub12_Sub10.manyIdleAnimations = true;
		AbstractMouseWheelHandler.antiAliasingDefault = 0;
		RuntimeException_Sub1.musicVolume = 255;
		if (Class120_Sub14_Sub13.maxMemory < 96) {
			ParticleEngine.setParticles(0);
		} else {
			ParticleEngine.setParticles(2);
		}
		InterfaceClickMask.safeModeEnabled = false;
		Class120_Sub12_Sub19.lastUsedDisplayMode = 0;
		WallDecoration.hdrEnabled = false;
		Class140.buildArea = 0;
		Class38.cursorsEnabled = true;
		Class120_Sub19.lastWorldId = 0;
		Class134.updateCameraFromCs2 = false;
		try {
			final SignlinkNode signlinkNode = signlink.openPreferencesFile("runescape");
			while (signlinkNode.status == 0) {
				PacketBuffer.sleepWrapper(1L);
			}
			if (signlinkNode.status == 1) {
				preferencesFile = (FileOnDisk) signlinkNode.value;
				int len;
				byte[] buffer = new byte[(int) preferencesFile.getLength()];
				for (int off = 0; off < buffer.length; off += len) {
					len = preferencesFile.read(buffer, off, buffer.length - off);
					if (len == -1) {
						throw new IOException("EOF");
					}
				}
				PacketBuffer.decodePreferences(new Buffer(buffer));
			}
		} catch (final Exception exception) {
			/* empty */
		}
		try {
			if (preferencesFile != null) {
				preferencesFile.close();
			}
		} catch (final Exception exception) {
			/* empty */
		}
	}

	final boolean hasAlpha(final int frameId) {
		return this.seqFrames[frameId].hasAlpha;
	}

	final boolean method1579(final int frameId) {
		return this.seqFrames[frameId].aBoolean42;
	}

	static final FrameGroup method1633(final js5 framesJs5, final js5 basesJs5, final int groupId, final boolean isFile) {
		boolean downloaded = true;
		final int[] fileIds = framesJs5.getFileIds(groupId);
		for (final int element : fileIds) {
			final byte[] frameBuffer = framesJs5.getFile2(groupId, element);
			if (frameBuffer == null) {
				downloaded = false;
			} else {
				final int baseId = (frameBuffer[0] & 0xff) << 8 | frameBuffer[1] & 0xff;
				byte[] baseBuffer;
				if (isFile) {
					baseBuffer = basesJs5.getFile2(0, baseId);
				} else {
					baseBuffer = basesJs5.getFile2(baseId, 0);
				}
				if (baseBuffer == null) {
					downloaded = false;
				}
			}
		}
		if (!downloaded) {
			return null;
		}
		FrameGroup frameLoader;
		try {
			frameLoader = new FrameGroup(framesJs5, basesJs5, groupId, isFile);
		} catch (final Exception exception) {
			return null;
		}
		return frameLoader;
	}

	static final FrameGroup list(final int id) {
		FrameGroup frameLoader = (FrameGroup) recentUse.get(id);
		if (frameLoader != null) {
			return frameLoader;
		}
		frameLoader = FrameGroup.method1633(Class132_Sub1.framesJs5, Class179.frameBasesJs5, id, false);
		if (frameLoader != null) {
			recentUse.put(frameLoader, id);
		}
		return frameLoader;
	}

	FrameGroup(final js5 framesJs5, final js5 basesJs5, final int groupId, final boolean isFile) {
		final Deque basesDeque = new Deque();
		final int framesLength = framesJs5.getFileAmount(groupId);
		this.seqFrames = new SeqFrame[framesLength];
		final int[] fileIds = framesJs5.getFileIds(groupId);
		for (int file = 0; file < fileIds.length; file++) {
			final byte[] frameBuffer = framesJs5.getFile(groupId, fileIds[file]);
			SeqFrameBase frameBase = null;
			final int baseId = (frameBuffer[0] & 0xff) << 8 | frameBuffer[1] & 0xff;
			for (SeqFrameBase firstBase = (SeqFrameBase) basesDeque.getFront(); firstBase != null; firstBase = (SeqFrameBase) basesDeque.getNext()) {
				if (baseId == firstBase.id) {
					frameBase = firstBase;
					break;
				}
			}
			if (frameBase == null) {
				byte[] baseBuffer;
				if (isFile) {
					baseBuffer = basesJs5.getFile2(0, baseId);
				} else {
					baseBuffer = basesJs5.getFile2(baseId, 0);
				}
				frameBase = new SeqFrameBase(baseId, baseBuffer);
				basesDeque.addLast(frameBase);
			}
			this.seqFrames[fileIds[file]] = new SeqFrame(frameBuffer, frameBase);
		}
	}

	static final void buildNpcMenu(NpcType npcType, final int x, final int z, final int index) {
		if (WallDecoration.menuOptionCount < 400) {
			if (npcType.transmogrificationIds != null) {
				npcType = npcType.handleVarp();
			}
			if (npcType != null && npcType.canRightClick) {
				String name = npcType.name;
				if (npcType.combatLevel != 0) {
					final String gameLevelIdentifier = Buffer.gameId != 1 ? StringLibrary.level : StringLibrary.rating;
					name += Class81.getCombatLevelDifferenceColor(TileParticleQueue.selfPlayer.combatLevel, npcType.combatLevel) + " (" + gameLevelIdentifier + npcType.combatLevel + ")";
				}
				if (Light.objSelected != 1) {
					if (Class88.spellSelected) {
						final ParamType paramType = Identikit.selectedSpellParam != -1 ? ParamType.list(Identikit.selectedSpellParam) : null;
						if ((GroundTile.selectedSpellUseMask & 0x2) != 0 && (paramType == null || npcType.getIntegerParamValue(Identikit.selectedSpellParam, paramType.defaultInt) != paramType.defaultInt)) {
							InvType.addMenuOption(Class101.selectedSpellPrefix, Light.selectedSpellName + " -> <col=ffff00>" + name, index, x, z, (short) 42, Class150.selectedSpellTargetCursor);
						}
					} else {
						String[] options = npcType.options;
						if (MouseHandler.showNumbersOnOptions) {
							options = Class120_Sub12_Sub36.addNumbers(options);
						}
						if (options != null) {
							for (int optionId = 4; optionId >= 0; optionId--) {
								if (options[optionId] != null && (Buffer.gameId != 0 || !options[optionId].equalsIgnoreCase(StringLibrary.attack))) {
									short code = 0;
									if (optionId == 0) {
										code = (short) 39;
									}
									if (optionId == 1) {
										code = (short) 8;
									}
									if (optionId == 2) {
										code = (short) 36;
									}
									if (optionId == 3) {
										code = (short) 25;
									}
									if (optionId == 4) {
										code = (short) 59;
									}
									int cursorId = -1;
									if (optionId == npcType.cursor1op) {
										cursorId = npcType.cursor1;
									}
									if (optionId == npcType.cursor2op) {
										cursorId = npcType.cursor2;
									}
									InvType.addMenuOption(options[optionId], "<col=ffff00>" + name, index, x, z, code, cursorId);
								}
							}
						}
						if (Buffer.gameId == 0 && options != null) {
							for (int actionId = 4; actionId >= 0; actionId--) {
								if (options[actionId] != null && options[actionId].equalsIgnoreCase(StringLibrary.attack)) {
									short combatModifier = 0;
									if (TileParticleQueue.selfPlayer.combatLevel < npcType.combatLevel) {
										combatModifier = (short) 2000;
									}
									short code = 0;
									if (actionId == 0) {
										code = (short) 39;
									}
									if (actionId == 1) {
										code = (short) 8;
									}
									if (actionId == 2) {
										code = (short) 36;
									}
									if (actionId == 3) {
										code = (short) 25;
									}
									if (actionId == 4) {
										code = (short) 59;
									}
									if (code != 0) {
										code += combatModifier;
									}
									InvType.addMenuOption(options[actionId], "<col=ffff00>" + name, index, x, z, code, npcType.attackCursor);
								}
							}
						}
						InvType.addMenuOption(StringLibrary.examine, "<col=ffff00>" + name, index, x, z, (short) 1010, Class120_Sub12_Sub11.examineOptionCursor);
					}
				} else {
					InvType.addMenuOption(StringLibrary.use, Class192.selectedObjName + " -> <col=ffff00>" + name, index, x, z, (short) 33, Class120_Sub12_Sub10.selectedObjectTargetCursor);
				}
			}
		}
	}

	static final int method1581(final int x, final int z, final int brightness, int redrawRate) {
		if (ModelParticleEmitter.instantScreenFade) {
			redrawRate = 1000000;
			ModelParticleEmitter.instantScreenFade = false;
		}
		final ChunkAtmosphere class191 = Identikit.chunksAtmosphere[x][z];
		final float f = class191.lightModelAmbient * (0.7F + 0.1F * brightness);
		final int screenColorRgb = class191.screenColorRgb;
		final float light0Diffuse = class191.light0Diffuse;
		final float light1Diffuse = class191.light1Diffuse;
		final int fogColorRgb = class191.fogColorRgb;
		int fogOffset = class191.fogDepth;
		if (!Decimator.fogEnabled) {
			fogOffset = 0;
		}
		final Class120_Sub14_Sub9 class120_sub14_sub9 = class191.aClass120_Sub14_Sub9_2117;
		final float f_30_ = class191.aFloat2114;
		final float f_31_ = class191.aFloat2108;
		final float f_32_ = class191.aFloat2116;
		if (screenColorRgb != Class120_Sub12_Sub17.anInt3257 || Class120_Sub12.aFloat2569 != f || Class125.aFloat2149 != light0Diffuse || Class132_Sub2.aFloat2821 != light1Diffuse || Light.anInt379 != fogColorRgb || fogOffset != Class43.anInt368 || class120_sub14_sub9 != Class120_Sub12_Sub10.aClass120_Sub14_Sub9_3204 || Class101.aFloat965 != f_30_ || Class120_Sub2.aFloat2417 != f_32_ || Varp.aFloat622 != f_31_) {
			Class132.anInt1248 = Class9.currentLightColor;
			Class156.anInt1453 = Deque.currentFogColor;
			Class120_Sub12_Sub39.aFloat3444 = client.currentLight1Diffuse;
			MouseRecorder.aFloat856 = AbstractBuffer.currentLight0Diffuse;
			Class120_Sub12_Sub1.aFloat3124 = ParticleNode.aFloat1034;
			FileSystem.aFloat460 = Class120_Sub12_Sub23.currentLightModelAmbient;
			GZIPDecompressor.aClass120_Sub14_Sub9_798 = Class3.aClass120_Sub14_Sub9_54;
			Class120_Sub12_Sub30.anInt3376 = CollisionMap.currentFogOffset;
			MapFunctionType.aFloat632 = Class101.aFloat962;
			Class24.aFloat144 = Class120_Sub12.aFloat2557;
			if (RuntimeException_Sub1.aClass120_Sub14_Sub9_2145 == null || GZIPDecompressor.aClass120_Sub14_Sub9_798 == RuntimeException_Sub1.aClass120_Sub14_Sub9_2145) {
				RuntimeException_Sub1.aClass120_Sub14_Sub9_2145 = new Class120_Sub14_Sub9();
			}
			Class43.anInt368 = fogOffset;
			Class132_Sub2.aFloat2821 = light1Diffuse;
			Class120_Sub12.aFloat2569 = f;
			Class57.anInt500 = 0;
			Class120_Sub12_Sub17.anInt3257 = screenColorRgb;
			Class120_Sub2.aFloat2417 = f_32_;
			Class120_Sub12_Sub10.aClass120_Sub14_Sub9_3204 = class120_sub14_sub9;
			Class125.aFloat2149 = light0Diffuse;
			Varp.aFloat622 = f_31_;
			Light.anInt379 = fogColorRgb;
			Class101.aFloat965 = f_30_;
		}
		if (Class57.anInt500 < 65536) {
			Class57.anInt500 += redrawRate * 250;
			if (Class57.anInt500 >= 65536) {
				Class120_Sub12.aFloat2557 = Class101.aFloat965;
				AbstractBuffer.currentLight0Diffuse = Class125.aFloat2149;
				Class101.aFloat962 = Varp.aFloat622;
				Class3.aClass120_Sub14_Sub9_54 = Class120_Sub12_Sub10.aClass120_Sub14_Sub9_3204;
				CollisionMap.currentFogOffset = Class43.anInt368;
				ParticleNode.aFloat1034 = Class120_Sub2.aFloat2417;
				Class120_Sub12_Sub23.currentLightModelAmbient = Class120_Sub12.aFloat2569;
				Deque.currentFogColor = Light.anInt379;
				Class57.anInt500 = 65536;
				GZIPDecompressor.aClass120_Sub14_Sub9_798 = null;
				client.currentLight1Diffuse = Class132_Sub2.aFloat2821;
				Class9.currentLightColor = Class120_Sub12_Sub17.anInt3257;
			} else {
				final int i_33_ = 65536 - Class57.anInt500 >> 8;
				final float f_34_ = Class57.anInt500 / 65536.0F;
				final int i_35_ = Class57.anInt500 >> 8;
				CollisionMap.currentFogOffset = Class120_Sub12_Sub30.anInt3376 * i_33_ + (Class43.anInt368 * i_35_) >> 8;
				Class9.currentLightColor = (i_33_ * (0xff00ff & Class132.anInt1248) + ((Class120_Sub12_Sub17.anInt3257 & 0xff00ff) * i_35_) & ~0xff00ff) + (i_35_ * (0xff00 & Class120_Sub12_Sub17.anInt3257) + (Class132.anInt1248 & 0xff00) * i_33_ & 0xff0000) >> 8;
				final float f_36_ = (-Class57.anInt500 + 65536) / 65536.0F;
				Class120_Sub12_Sub23.currentLightModelAmbient = f_34_ * Class120_Sub12.aFloat2569 + FileSystem.aFloat460 * f_36_;
				client.currentLight1Diffuse = f_34_ * Class132_Sub2.aFloat2821 + Class120_Sub12_Sub39.aFloat3444 * f_36_;
				Class120_Sub12.aFloat2557 = f_36_ * Class24.aFloat144 + f_34_ * Class101.aFloat965;
				AbstractBuffer.currentLight0Diffuse = f_34_ * Class125.aFloat2149 + MouseRecorder.aFloat856 * f_36_;
				Deque.currentFogColor = ((0xff00 & Class156.anInt1453) * i_33_ - -((Light.anInt379 & 0xff00) * i_35_) & 0xff0000) + ((Light.anInt379 & 0xff00ff) * i_35_ + i_33_ * (Class156.anInt1453 & 0xff00ff) & ~0xff00ff) >> 8;
				Class101.aFloat962 = f_36_ * MapFunctionType.aFloat632 + Varp.aFloat622 * f_34_;
				ParticleNode.aFloat1034 = Class120_Sub2.aFloat2417 * f_34_ + Class120_Sub12_Sub1.aFloat3124 * f_36_;
				if (Class120_Sub12_Sub10.aClass120_Sub14_Sub9_3204 != GZIPDecompressor.aClass120_Sub14_Sub9_798) {
					if (GZIPDecompressor.aClass120_Sub14_Sub9_798 != null && Class120_Sub12_Sub10.aClass120_Sub14_Sub9_3204 != null) {
						Class3.aClass120_Sub14_Sub9_54 = RuntimeException_Sub1.aClass120_Sub14_Sub9_2145.method1495(GZIPDecompressor.aClass120_Sub14_Sub9_798, Class120_Sub12_Sub10.aClass120_Sub14_Sub9_3204, Class57.anInt500 / 65536.0F);
					} else {
						Class3.aClass120_Sub14_Sub9_54 = null;
					}
				}
			}
		}
		return Deque.currentFogColor;
	}

	static final boolean drawMapSceneOnMinimap(final LocType locType, final int x, final int z, final int xOff, final int zOff, int rotation) {
		final MapSceneType mapSceneType = MapSceneType.list(locType.mapSceneId);
		if (mapSceneType.spriteId == -1) {
			return true;
		}
		if (locType.adjustMapSceneRotation) {
			rotation += locType.mapSceneRotationOff;
			rotation &= 0x3;
		} else {
			rotation = 0;
		}
		final LDIndexedSprite mapSceneSprite = mapSceneType.constructSprite(rotation, locType.flipMapSceneSprite);
		if (mapSceneSprite == null) {
			return false;
		}
		int sizeX = locType.sizeX;
		int sizeZ = locType.sizeZ;
		if ((rotation & 0x1) == 1) {
			sizeX = locType.sizeZ;
			sizeZ = locType.sizeX;
		}
		int i_44_ = mapSceneSprite.trimWidth;
		int i_45_ = mapSceneSprite.trimHeight;
		if (mapSceneType.enlarge) {
			i_44_ = 4 * sizeX;
			i_45_ = 4 * sizeZ;
		}
		if (mapSceneType.anInt1360 == 0) {
			mapSceneSprite.method918(x * 4 + 48, (104 - z - sizeZ) * 4 + 48, i_44_, i_45_);
		} else {
			mapSceneSprite.method919(x * 4 + 48, (104 - z - sizeZ) * 4 + 48, i_44_, i_45_, mapSceneType.anInt1360);
		}
		return true;
	}

	static final Class getClassType(final String string) throws ClassNotFoundException {
		if (string.equals("B")) {
			return Byte.TYPE;
		}
		if (string.equals("I")) {
			return Integer.TYPE;
		}
		if (string.equals("S")) {
			return Short.TYPE;
		}
		if (string.equals("J")) {
			return Long.TYPE;
		}
		if (string.equals("Z")) {
			return Boolean.TYPE;
		}
		if (string.equals("F")) {
			return Float.TYPE;
		}
		if (string.equals("D")) {
			return Double.TYPE;
		}
		if (string.equals("C")) {
			return Character.TYPE;
		}
		return Class.forName(string);
	}
}
