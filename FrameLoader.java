/* Class120_Sub14_Sub18 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;

final class FrameLoader extends NodeSub {
	static int anInt3609 = 0;
	SeqFrame[] seqFrames;
	static ObjectCache recentUse = new ObjectCache(100);
	static AbstractSprite aClass120_Sub14_Sub19_3611;
	static int anInt3612 = -1;

	static final void method1577(final Signlink signlink) {
		FileOnDisk fileOnDisk = null;
		FileSystemRequest.brightness = 3;
		GameShell.method32(true);
		Class120_Sub6.characterShadowsOn = true;
		ParticleNodeSub.highDetailTextures = true;
		Class120_Sub12.aBoolean2564 = true;
		CursorType.ambientSoundsVolume = 127;
		Class120_Sub30_Sub1.manyGroundTextures = true;
		Hashtable.showGroundDecorations = true;
		Class120_Sub12_Sub6.highLightingDetail = true;
		Class191.flickeringEffectsOn = true;
		PacketBuffer.highWaterDetail = true;
		Class167.aBoolean1619 = true;
		Class120_Sub12_Sub18.lastFullscreenWidth = 0;
		Decimator.fogEnabled = true;
		Class74.sceneryShadowsType = 2;
		Class111.anInt1061 = 127;
		Class120_Sub12_Sub12.lastFullscreenHeight = 0;
		GroundDecoration.antiAliasingSamples = 0;
		Class120_Sub12_Sub10.manyIdleAnimations = true;
		AbstractMouseWheelHandler.antiAliasingSamplesWrapper = 0;
		RuntimeException_Sub1.anInt2142 = 255;
		if (Class120_Sub14_Sub13.maxMemory < 96) {
			ParticleEngine.setParticles(0);
		} else {
			ParticleEngine.setParticles(2);
		}
		InterfaceClickMask.safeModeEnabled = false;
		Class120_Sub12_Sub19.currentDisplayMode = 0;
		WallDecoration.hdrEnabled = false;
		Class140.anInt1343 = 0;
		Class38.cursorsEnabled = true;
		Class120_Sub19.anInt2657 = 0;
		Class134.aBoolean1277 = false;
		try {
			final SignlinkNode signlinkNode = signlink.openPreferencesFile("runescape");
			while (signlinkNode.status == 0) {
				PacketBuffer.sleepWrapper(1L);
			}
			if (signlinkNode.status == 1) {
				fileOnDisk = (FileOnDisk) signlinkNode.value;
				int i_0_ = 0;
				int i_1_;
				byte[] is;
				for (is = new byte[(int) fileOnDisk.getLength()]; i_0_ < is.length; i_0_ += i_1_) {
					i_1_ = fileOnDisk.read(is, i_0_, is.length - i_0_);
					if (i_1_ == -1) {
						throw new IOException("EOF");
					}
				}
				PacketBuffer.method1145(new Buffer(is));
			}
		} catch (final Exception exception) {
			/* empty */
		}
		try {
			if (fileOnDisk != null) {
				fileOnDisk.close();
			}
		} catch (final Exception exception) {
			/* empty */
		}
	}

	final boolean method1578(final int frameId) {
		return this.seqFrames[frameId].aBoolean37;
	}

	final boolean method1579(final int frameId) {
		return this.seqFrames[frameId].aBoolean42;
	}

	static final FrameLoader method1633(final js5 framesJs5, final js5 labelsJs5, final int groupId, final boolean swap) {
		boolean downloaded = true;
		final int[] fileIds = framesJs5.getFileIds(groupId);
		for (final int element : fileIds) {
			final byte[] frameBuffer = framesJs5.getFile2(groupId, element);
			if (frameBuffer == null) {
				downloaded = false;
			} else {
				final int labelId = (frameBuffer[0] & 0xff) << 8 | frameBuffer[1] & 0xff;
				byte[] labelBuffer;
				if (!swap) {
					labelBuffer = labelsJs5.getFile2(labelId, 0);
				} else {
					labelBuffer = labelsJs5.getFile2(0, labelId);
				}
				if (labelBuffer == null) {
					downloaded = false;
				}
			}
		}
		if (!downloaded) {
			return null;
		}
		FrameLoader frameLoader;
		try {
			frameLoader = new FrameLoader(framesJs5, labelsJs5, groupId, swap);
		} catch (final Exception exception) {
			return null;
		}
		return frameLoader;
	}

	static final FrameLoader list(final int id) {
		FrameLoader frameLoader = (FrameLoader) recentUse.get(id);
		if (frameLoader != null) {
			return frameLoader;
		}
		frameLoader = FrameLoader.method1633(Class132_Sub1.framesJs5, Class179.labelsJs5, id, false);
		if (frameLoader != null) {
			recentUse.put(frameLoader, id);
		}
		return frameLoader;
	}

	FrameLoader(final js5 framesJs5, final js5 labelsJs5, final int groupId, final boolean swap) {
		final Deque labelsDeque = new Deque();
		final int framesLength = framesJs5.getFileAmount(groupId);
		this.seqFrames = new SeqFrame[framesLength];
		final int[] fileIds = framesJs5.getFileIds(groupId);
		for (int file = 0; file < fileIds.length; file++) {
			final byte[] frameBuffer = framesJs5.getFile(groupId, fileIds[file]);
			LabelGroup labelGroup = null;
			final int labelId = (frameBuffer[0] & 0xff) << 8 | frameBuffer[1] & 0xff;
			for (LabelGroup firstLabel = (LabelGroup) labelsDeque.getFront(); firstLabel != null; firstLabel = (LabelGroup) labelsDeque.getNext()) {
				if (labelId == firstLabel.id) {
					labelGroup = firstLabel;
					break;
				}
			}
			if (labelGroup == null) {
				byte[] labelBuffer;
				if (swap) {
					labelBuffer = labelsJs5.getFile2(0, labelId);
				} else {
					labelBuffer = labelsJs5.getFile2(labelId, 0);
				}
				labelGroup = new LabelGroup(labelId, labelBuffer);
				labelsDeque.addLast(labelGroup);
			}
			this.seqFrames[fileIds[file]] = new SeqFrame(frameBuffer, labelGroup);
		}
	}

	static final void buildNpcMenu(NpcType npcType, final int x, final int z, final int index) {
		if (WallDecoration.menuOptionCount < 400) {
			if (npcType.transmogrificationIds != null) {
				npcType = npcType.handleVarp();
			}
			if (npcType != null && npcType.canRightClick) {
				String string = npcType.name;
				if (npcType.combatLevel != 0) {
					final String string_14_ = Buffer.gameId != 1 ? TextRepository.level : TextRepository.rating;
					string = new StringBuilder(string).append(Class81.method704(TileParticleQueue.selfPlayer.combatLevel, npcType.combatLevel)).append(" (").append(string_14_).append(npcType.combatLevel).append(")").toString();
				}
				if (Light.objSelected != 1) {
					if (Class88.spellSelected) {
						final ParamType class120_sub14_sub11 = IdentityKit.selectedSpellParam != -1 ? ParamType.list(IdentityKit.selectedSpellParam) : null;
						if ((0x2 & GroundTile.selectedSpellUseMask) != 0 && (class120_sub14_sub11 == null || npcType.getIntegerParamValue(IdentityKit.selectedSpellParam, class120_sub14_sub11.defaultInt) != class120_sub14_sub11.defaultInt)) {
							InvType.addMenuOption(Class101.selectedSpellPrefix, new StringBuilder(Light.selectedSpellName).append(" -> <col=ffff00>").append(string).toString(), index, x, z, (short) 42, Class150.selectedSpellTargetCursor);
						}
					} else {
						String[] options = npcType.options;
						if (MouseHandler.showNumbersOnOptions) {
							options = Class120_Sub12_Sub36.addNumbers(options);
						}
						if (options != null) {
							for (int optionId = 4; optionId >= 0; optionId--) {
								if (options[optionId] != null && (Buffer.gameId != 0 || !options[optionId].equalsIgnoreCase(Class65.aString591))) {
									short code = 0;
									int cursorId = -1;
									if (optionId == npcType.cursor1op) {
										cursorId = npcType.cursor1;
									}
									if (optionId == npcType.cursor2op) {
										cursorId = npcType.cursor2;
									}
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
									InvType.addMenuOption(options[optionId], new StringBuilder("<col=ffff00>").append(string).toString(), index, x, z, code, cursorId);
								}
							}
						}
						if (Buffer.gameId == 0 && options != null) {
							for (int actionId = 4; actionId >= 0; actionId--) {
								if (options[actionId] != null && options[actionId].equalsIgnoreCase(Class65.aString591)) {
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
									InvType.addMenuOption(options[actionId], new StringBuilder("<col=ffff00>").append(string).toString(), index, x, z, code, npcType.anInt1668);
								}
							}
						}
						InvType.addMenuOption(TextRepository.examine, new StringBuilder("<col=ffff00>").append(string).toString(), index, x, z, (short) 1010, Class120_Sub12_Sub11.anInt3211);
					}
				} else {
					InvType.addMenuOption(TextRepository.use, new StringBuilder(Class192.selectedObjName).append(" -> <col=ffff00>").append(string).toString(), index, x, z, (short) 33, Class120_Sub12_Sub10.selectedObjectTargetCursor);
				}
			}
		}
	}

	static final int method1581(final int x, final int z, final int brightness, int redrawRate) {
		if (ModelParticleEmitter.instantScreenFade) {
			redrawRate = 1000000;
			ModelParticleEmitter.instantScreenFade = false;
		}
		final Class191 class191 = IdentityKit.aClass191ArrayArray1337[x][z];
		final float f = class191.aFloat2102 * (0.7F + 0.1F * brightness);
		final int i_25_ = class191.anInt2109;
		final float f_26_ = class191.aFloat2106;
		final float f_27_ = class191.aFloat2104;
		final int i_28_ = class191.fogColorRgb;
		int i_29_ = class191.anInt2118;
		if (!Decimator.fogEnabled) {
			i_29_ = 0;
		}
		final Class120_Sub14_Sub9 class120_sub14_sub9 = class191.aClass120_Sub14_Sub9_2117;
		final float f_30_ = class191.aFloat2114;
		final float f_31_ = class191.aFloat2108;
		final float f_32_ = class191.aFloat2116;
		if (i_25_ != Class120_Sub12_Sub17.anInt3257 || Class120_Sub12.aFloat2569 != f || Class125.aFloat2149 != f_26_ || Class132_Sub2.aFloat2821 != f_27_ || Light.anInt379 != i_28_ || i_29_ != Class43.anInt368 || class120_sub14_sub9 != Class120_Sub12_Sub10.aClass120_Sub14_Sub9_3204 || Class101.aFloat965 != f_30_ || Class120_Sub2.aFloat2417 != f_32_ || Varp.aFloat622 != f_31_) {
			Class132.anInt1248 = Class9.anInt72;
			Class156.anInt1453 = Deque.anInt1007;
			Class120_Sub12_Sub39.aFloat3444 = client.aFloat1395;
			MouseRecorder.aFloat856 = AbstractBuffer.aFloat600;
			Class120_Sub12_Sub1.aFloat3124 = ParticleNode.aFloat1034;
			FileSystem.aFloat460 = Class120_Sub12_Sub23.aFloat3306;
			GZIPDecompressor.aClass120_Sub14_Sub9_798 = Class3.aClass120_Sub14_Sub9_54;
			Class120_Sub12_Sub30.anInt3376 = CollisionMap.anInt151;
			MapFunctionType.aFloat632 = Class101.aFloat962;
			Class24.aFloat144 = Class120_Sub12.aFloat2557;
			if (RuntimeException_Sub1.aClass120_Sub14_Sub9_2145 == null || GZIPDecompressor.aClass120_Sub14_Sub9_798 == RuntimeException_Sub1.aClass120_Sub14_Sub9_2145) {
				RuntimeException_Sub1.aClass120_Sub14_Sub9_2145 = new Class120_Sub14_Sub9();
			}
			Class43.anInt368 = i_29_;
			Class132_Sub2.aFloat2821 = f_27_;
			Class120_Sub12.aFloat2569 = f;
			Class57.anInt500 = 0;
			Class120_Sub12_Sub17.anInt3257 = i_25_;
			Class120_Sub2.aFloat2417 = f_32_;
			Class120_Sub12_Sub10.aClass120_Sub14_Sub9_3204 = class120_sub14_sub9;
			Class125.aFloat2149 = f_26_;
			Varp.aFloat622 = f_31_;
			Light.anInt379 = i_28_;
			Class101.aFloat965 = f_30_;
		}
		if (Class57.anInt500 < 65536) {
			Class57.anInt500 += redrawRate * 250;
			if (Class57.anInt500 >= 65536) {
				Class120_Sub12.aFloat2557 = Class101.aFloat965;
				AbstractBuffer.aFloat600 = Class125.aFloat2149;
				Class101.aFloat962 = Varp.aFloat622;
				Class3.aClass120_Sub14_Sub9_54 = Class120_Sub12_Sub10.aClass120_Sub14_Sub9_3204;
				CollisionMap.anInt151 = Class43.anInt368;
				ParticleNode.aFloat1034 = Class120_Sub2.aFloat2417;
				Class120_Sub12_Sub23.aFloat3306 = Class120_Sub12.aFloat2569;
				Deque.anInt1007 = Light.anInt379;
				Class57.anInt500 = 65536;
				GZIPDecompressor.aClass120_Sub14_Sub9_798 = null;
				client.aFloat1395 = Class132_Sub2.aFloat2821;
				Class9.anInt72 = Class120_Sub12_Sub17.anInt3257;
			} else {
				final int i_33_ = 65536 - Class57.anInt500 >> 8;
				final float f_34_ = Class57.anInt500 / 65536.0F;
				final int i_35_ = Class57.anInt500 >> 8;
				CollisionMap.anInt151 = Class120_Sub12_Sub30.anInt3376 * i_33_ - -(Class43.anInt368 * i_35_) >> 8;
				Class9.anInt72 = (i_33_ * (0xff00ff & Class132.anInt1248) - -((Class120_Sub12_Sub17.anInt3257 & 0xff00ff) * i_35_) & ~0xff00ff) + (i_35_ * (0xff00 & Class120_Sub12_Sub17.anInt3257) + (Class132.anInt1248 & 0xff00) * i_33_ & 0xff0000) >> 8;
				final float f_36_ = (-Class57.anInt500 + 65536) / 65536.0F;
				Class120_Sub12_Sub23.aFloat3306 = f_34_ * Class120_Sub12.aFloat2569 + FileSystem.aFloat460 * f_36_;
				client.aFloat1395 = f_34_ * Class132_Sub2.aFloat2821 + Class120_Sub12_Sub39.aFloat3444 * f_36_;
				Class120_Sub12.aFloat2557 = f_36_ * Class24.aFloat144 + f_34_ * Class101.aFloat965;
				AbstractBuffer.aFloat600 = f_34_ * Class125.aFloat2149 + MouseRecorder.aFloat856 * f_36_;
				Deque.anInt1007 = ((0xff00 & Class156.anInt1453) * i_33_ - -((Light.anInt379 & 0xff00) * i_35_) & 0xff0000) + ((Light.anInt379 & 0xff00ff) * i_35_ + i_33_ * (Class156.anInt1453 & 0xff00ff) & ~0xff00ff) >> 8;
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
		return Deque.anInt1007;
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
