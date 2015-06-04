/* Class180_Sub5_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Player extends GameEntity {
	int pkIcon;
	int anInt3733 = 0;
	int anInt3734;
	int ambientSoundHearDistance;
	int anInt3736;
	int skill = 0;
	int anInt3738;
	int ambientSoundVolume;
	int anInt3740;
	private byte titleId;
	int anInt3742;
	boolean playerLimitReached;
	int team;
	String name;
	int prayerIcon;
	int combatLevel;
	static int chatEffectsEnabled = 0;
	PlayerAppearance appearance;

	final void decodeAppearance(final Buffer buffer) {
		buffer.pos = 0;
		int newNpcId = -1;
		final int i_1_ = buffer.getUByte();
		final int isFemale = i_1_ & 0x1;
		final boolean inGamesArena = (i_1_ & 0x4) != 0;
		setSize(1 + ((0x3e & i_1_) >> 3));
		titleId = (byte) (i_1_ >> 6 & 0x3);
		final int oldSize = super.getSize();
		final int[] is = new int[12];
		this.x += (getSize() - oldSize) * 64;
		this.z += (getSize() - oldSize) * 64;
		this.pkIcon = buffer.getByte();
		this.prayerIcon = buffer.getByte();
		this.team = 0;
		for (int id = 0; id < 12; id++) {
			final int val1 = buffer.getUByte();
			if (val1 == 0) {
				is[id] = 0;
			} else {
				final int val2 = buffer.getUByte();
				int data = (val1 << 8) + val2;
				//data can be object or appearance id
				if (id == 0 && data == 65535) {
					newNpcId = buffer.getUShort();
					this.team = buffer.getUByte();
					break;
				}
				if (data >= 32768) {
					data = KeyboardHandler.equipmentLookupTable[data - 32768];
					is[id] = data | 0x40000000;
					final int team = ObjType.list(data).team;
					if (team != 0) {
						this.team = team;
					}
				} else {
					is[id] = (data - 256) | -0x80000000;
				}
			}
		}
		final int[] colors = new int[5];
		for (int id = 0; id < 5; id++) {
			int color = buffer.getUByte();
			if (color < 0 || color >= Class159.aShortArrayArray1489[id].length) {
				color = 0;
			}
			colors[id] = color;
		}
		this.entityRenderDataId = buffer.getUShort();
		final long nameAsLong = buffer.getLong();
		this.name = Class136.longToString(nameAsLong);
		this.combatLevel = buffer.getUByte();
		if (inGamesArena) {
			this.skill = buffer.getUShort();
			this.anInt3733 = this.combatLevel;
			this.anInt3738 = -1;
		} else {
			this.skill = 0;
			this.anInt3733 = buffer.getUByte();
			this.anInt3738 = buffer.getUByte();
			if (this.anInt3738 == 255) {
				this.anInt3738 = -1;
			}
		}
		final int oldHearDistance = this.ambientSoundHearDistance;
		this.ambientSoundHearDistance = buffer.getUByte();
		if (this.ambientSoundHearDistance != 0) {
			final int i_13_ = this.anInt3736;
			final int i_14_ = this.anInt3740;
			final int i_15_ = this.anInt3734;
			final int i_16_ = this.anInt3742;
			final int i_17_ = this.ambientSoundVolume;
			this.anInt3740 = buffer.getUShort();
			this.anInt3736 = buffer.getUShort();
			this.anInt3734 = buffer.getUShort();
			this.anInt3742 = buffer.getUShort();
			this.ambientSoundVolume = buffer.getUByte();
			if (this.ambientSoundHearDistance != oldHearDistance || i_14_ != this.anInt3740 || i_13_ != this.anInt3736 || this.anInt3734 != i_15_ || this.anInt3742 != i_16_ || this.ambientSoundVolume != i_17_) {
				Class120_Sub30_Sub1.addRefreshPlayerAmbientSound(this);
			}
		} else {
			Class31.removePlayerAmbientSound(this);
		}
		if (this.appearance == null) {
			this.appearance = new PlayerAppearance();
		}
		final int npcId = this.appearance.npcId;
		this.appearance.init(newNpcId, is, this.entityRenderDataId, colors, isFemale == 1);
		if (newNpcId != npcId) {
			this.x = this.walkQueueX[0] * 128 + (64 * getSize());
			this.z = this.walkQueueZ[0] * 128 + (64 * getSize());
		}
		if (this.aClass108_Sub2_2988 != null) {
			this.aClass108_Sub2_2988.method947();
		}
	}

	@Override
	final int getMaxY() {
		return this.maxY;
	}

	@Override
	final void method2266(final int i, final int i_19_, final int i_21_, final int i_20_, final int i_22_) {
		if (!this.aBoolean3007) {
			if (this.appearance == null) {
				return;
			}
			final SeqType animSeqType = this.animId == -1 || this.animDelay != 0 ? null : SeqType.list(this.animId);
			final SeqType idleSeqType = this.idleAnimId != -1 && !this.playerLimitReached && (this.idleAnimId != getEntityRenderData().idleAnimationId || animSeqType == null) ? SeqType.list(this.idleAnimId) : null;
			final AbstractModelRenderer class180_sub7 = this.appearance.method2040(this.aClass150Array2972, this.idleAnimFrame, this.animNextFrame, this.idleAnimNextFrame, idleSeqType, this.animFrame, false, this.idleAnimFrameDelay, animSeqType, false, this.animCurrentFrameDelay);
			if (class180_sub7 == null) {
				return;
			}
			method2337(class180_sub7, null);
		}
		if (this.aClass108_Sub2_2988 != null) {
			this.aClass108_Sub2_2988.method944(i, i_19_, i_21_, i_20_, i_22_);
		}
	}

	static final void method2340(final js5 js5, final LDFont class120_sub14_sub8_sub2, final boolean bool, final js5 class50_24_) {
		Class111.aClass50_1064 = class50_24_;
		Class120_Sub12_Sub23.aClass50_3305 = js5;
		ObjType.objMemberClient = bool;
		final int i_25_ = Class120_Sub12_Sub23.aClass50_3305.method421() - 1;
		Node.objCount = Class120_Sub12_Sub23.aClass50_3305.getFileAmount(i_25_) + i_25_ * 256;
		Class15.objSmallFont = class120_sub14_sub8_sub2;
		Class120_Sub12_Sub29.membersObjInventoryOptions = new String[] { null, null, null, null, StringLibrary.drop };
		Class120_Sub12_Sub32.membersObjOptions = new String[] { null, null, StringLibrary.take, null, null };
	}

	@Override
	final int getEntityRenderDataId() {
		return entityRenderDataId;
	}

	@Override
	final void render(final int i, final int i_26_, final int i_27_, final int i_28_, final int i_29_, final int i_30_, final int i_31_, final int i_32_, final long l, final int i_33_, final ParticleEngine class108_sub2) {
		if (this.appearance != null) {
			final SeqType animSeq = this.animId != -1 && this.animDelay == 0 ? SeqType.list(this.animId) : null;
			final EntityRenderData renderData = getEntityRenderData();
			final boolean bool = renderData.anInt204 != 0 || renderData.anInt206 != 0 || renderData.anInt208 != 0 || renderData.anInt209 != 0;
			final SeqType idleSeq = this.idleAnimId != -1 && !this.playerLimitReached && (this.idleAnimId != getEntityRenderData().idleAnimationId || animSeq == null) ? SeqType.list(this.idleAnimId) : null;
			AbstractModelRenderer playerModel = this.appearance.method2040(this.aClass150Array2972, this.idleAnimFrame, this.animNextFrame, this.idleAnimNextFrame, idleSeq, this.animFrame, bool, this.idleAnimFrameDelay, animSeq, true, this.animCurrentFrameDelay);
			final int playerCount = Class48.getPlayersCacheSize();
			if (HDToolkit.glEnabled && Class120_Sub14_Sub13.maxMemory < 96 && playerCount > 50) {
				SpotAnimType.method880();
			}
			if (LocType.modeWhat != 0 && playerCount < 50) {
				int i_36_;
				for (i_36_ = 50 - playerCount; OverlayFrequencyNode.anInt3624 < i_36_; OverlayFrequencyNode.anInt3624++) {
					Class120_Sub12_Sub25.aByteArrayArray3318[OverlayFrequencyNode.anInt3624] = new byte[102400];
				}
				while (i_36_ < OverlayFrequencyNode.anInt3624) {
					OverlayFrequencyNode.anInt3624--;
					Class120_Sub12_Sub25.aByteArrayArray3318[OverlayFrequencyNode.anInt3624] = null;
				}
			}
			if (playerModel != null) {
				this.maxY = playerModel.getMaxY();
				if (Class120_Sub6.characterShadowsOn && (this.appearance.npcId == -1 || NpcType.list(this.appearance.npcId).hasShadow)) {
					final AbstractModelRenderer shadowModel = MagnetType.constructShadowModel(0, idleSeq == null ? animSeq : idleSeq, i, super.getSize(), 240, playerModel, idleSeq != null ? this.idleAnimFrame : this.animFrame, this.y, this.z, this.aBoolean3002, 0, 160, this.x);
					if (!HDToolkit.glEnabled) {
						shadowModel.render(0, i_26_, i_27_, i_28_, i_29_, i_30_, i_31_, i_32_, -1L, i_33_, null);
					} else {
						final float f = HDToolkit.method534();
						final float f_38_ = HDToolkit.method526();
						HDToolkit.disableDepthMask();
						HDToolkit.method535(f, f_38_ - 150.0F);
						shadowModel.render(0, i_26_, i_27_, i_28_, i_29_, i_30_, i_31_, i_32_, -1L, i_33_, null);
						HDToolkit.enableDepthMask();
						HDToolkit.method535(f, f_38_);
					}
				}
				if (TileParticleQueue.selfPlayer == this) {
					for (int hintIconId = Class187.hintIcons.length - 1; hintIconId >= 0; hintIconId--) {
						final HintIcon hintIcon = Class187.hintIcons[hintIconId];
						if (hintIcon != null && hintIcon.modelId != -1) {
							if (hintIcon.targetType == 1 && hintIcon.targetIndex >= 0 && hintIcon.targetIndex < Class120_Sub12_Sub11.npcList.length) {
								final Npc npc = Class120_Sub12_Sub11.npcList[hintIcon.targetIndex];
								if (npc != null) {
									final int hintX = npc.x / 32 - TileParticleQueue.selfPlayer.x / 32;
									final int hintY = npc.z / 32 - TileParticleQueue.selfPlayer.z / 32;
									renderHintIcon(i_28_, hintY, null, i_27_, i_33_, i_26_, i, i_30_, hintX, i_31_, hintIcon.modelId, i_29_, 360000, playerModel, i_32_);
								}
							}
							if (hintIcon.targetType == 2) {
								final int hintX = 2 + 4 * (hintIcon.x - GameEntity.currentBaseX) - (TileParticleQueue.selfPlayer.x / 32);
								final int hintY = 2 + 4 * (hintIcon.z - LightType.currentBaseZ) - (TileParticleQueue.selfPlayer.z / 32);
								int showDistance = hintIcon.showDistance * 4;
								showDistance *= showDistance;
								renderHintIcon(i_28_, hintY, null, i_27_, i_33_, i_26_, i, i_30_, hintX, i_31_, hintIcon.modelId, i_29_, showDistance, playerModel, i_32_);
							}
							if (hintIcon.targetType == 10 && hintIcon.targetIndex >= 0 && Class118.playersList.length > hintIcon.targetIndex) {
								final Player player = Class118.playersList[hintIcon.targetIndex];
								if (player != null) {
									final int hintX = player.x / 32 - TileParticleQueue.selfPlayer.x / 32;
									final int hintY = player.z / 32 - TileParticleQueue.selfPlayer.z / 32;
									renderHintIcon(i_28_, hintY, null, i_27_, i_33_, i_26_, i, i_30_, hintX, i_31_, hintIcon.modelId, i_29_, 360000, playerModel, i_32_);
								}
							}
						}
					}
				}
				method2327(playerModel);
				AbstractModelRenderer spotAnimModel = null;
				method2334(playerModel, i);
				if (!this.playerLimitReached && this.spotAnimId != -1 && this.spotAnimFrame != -1) {
					final SpotAnimType spotAnimType = SpotAnimType.list(this.spotAnimId);
					spotAnimModel = spotAnimType.constructModel(this.spotAnimNextFrame, this.spotAnimFrameDelay, this.spotAnimFrame);
					if (spotAnimModel != null) {
						spotAnimModel.translate(0, -this.spotAnimHeight, 0);
						if (spotAnimType.aBoolean989) {
							if (MouseHandler.anInt1140 != 0) {
								spotAnimModel.rotateX(MouseHandler.anInt1140);
							}
							if (Class159.anInt1488 != 0) {
								spotAnimModel.rotateZ(Class159.anInt1488);
							}
							if (Class93.anInt867 != 0) {
								spotAnimModel.translate(0, Class93.anInt867, 0);
							}
						}
					}
				}
				AbstractModelRenderer locationModel = null;
				if (!this.playerLimitReached && this.anObject3047 != null) {
					if (this.anInt3012 <= Class101_Sub2.loopCycle) {
						this.anObject3047 = null;
					}
					if (this.anInt3042 <= Class101_Sub2.loopCycle && Class101_Sub2.loopCycle < this.anInt3012) {
						if (!(this.anObject3047 instanceof AnimatedLocation)) {
							locationModel = (AbstractModelRenderer) this.anObject3047;
						} else {
							locationModel = (AbstractModelRenderer) ((AnimatedLocation) this.anObject3047).method2357();
						}
						locationModel.translate(this.anInt3033 - this.x, this.anInt2970 - this.y, this.anInt3028 - this.z);
						if (this.newFaceDegrees == 512) {
							locationModel.rotate270();
						} else if (this.newFaceDegrees == 1024) {
							locationModel.rotate180();
						} else if (this.newFaceDegrees == 1536) {
							locationModel.rotate90();
						}
					}
				}
				if (!HDToolkit.glEnabled) {
					if (spotAnimModel != null) {
						playerModel = ((LDModelRenderer) playerModel).mergeModel(spotAnimModel);
					}
					if (locationModel != null) {
						playerModel = ((LDModelRenderer) playerModel).mergeModel(locationModel);
					}
					method2337(playerModel, spotAnimModel);
					playerModel.haveActions = true;
					playerModel.render(i, i_26_, i_27_, i_28_, i_29_, i_30_, i_31_, i_32_, l, i_33_, this.aClass108_Sub2_2988);
				} else {
					method2337(playerModel, spotAnimModel);
					playerModel.haveActions = true;
					playerModel.render(i, i_26_, i_27_, i_28_, i_29_, i_30_, i_31_, i_32_, l, i_33_, this.aClass108_Sub2_2988);
					if (spotAnimModel != null) {
						if (this.aClass108_Sub2_2988 != null) {
							final HDModelRenderer class180_sub7_sub2 = (HDModelRenderer) spotAnimModel;
							this.aClass108_Sub2_2988.method962(class180_sub7_sub2.aClass158Array3892, class180_sub7_sub2.aClass169Array3858, true, class180_sub7_sub2.xVertices, class180_sub7_sub2.yVertices, class180_sub7_sub2.zVertices);
						}
						spotAnimModel.haveActions = true;
						spotAnimModel.render(i, i_26_, i_27_, i_28_, i_29_, i_30_, i_31_, i_32_, l, i_33_, this.aClass108_Sub2_2988);
					}
				}
				if (locationModel != null) {
					if (this.newFaceDegrees == 512) {
						locationModel.rotate90();
					} else if (this.newFaceDegrees == 1024) {
						locationModel.rotate180();
					} else if (this.newFaceDegrees == 1536) {
						locationModel.rotate270();
					}
					locationModel.translate(this.x - this.anInt3033, this.y - this.anInt2970, this.z - this.anInt3028);
				}
			}
		}
	}

	@Override
	final boolean isVisible() {
		if (this.appearance == null) {
			return false;
		}
		return true;
	}

	final String getTitledName() {
		String name = this.name;
		if (WallLocation.prefixTitles != null) {
			name = WallLocation.prefixTitles[titleId] + name;
		}
		if (Class53.suffixTitles != null) {
			name = name + Class53.suffixTitles[titleId];
		}
		return name;
	}

	@Override
	final int getSize() {
		if (this.appearance != null && this.appearance.npcId != -1) {
			return NpcType.list(this.appearance.npcId).size;
		}
		return super.getSize();
	}

	@Override
	protected final void finalize() {
		if (this.aClass108_Sub2_2988 != null) {
			this.aClass108_Sub2_2988.method953();
		}
	}

	final void setPos(final int x, final int z, final boolean bool) {
		super.setPos(x, z, getSize(), bool);
	}

	private final void renderHintIcon(final int i, final int i_54_, final ParticleEngine class108_sub2, final int i_55_, final int i_56_, final int i_57_, final int i_58_, final int i_59_, final int i_60_, final int i_61_, final int i_62_, final int i_64_, final int i_65_, final AbstractModelRenderer class180_sub7, final int i_66_) {
		final int i_67_ = i_60_ * i_60_ + i_54_ * i_54_;
		if (i_67_ >= 16 && i_67_ <= i_65_) {
			final int i_68_ = (int) (Math.atan2(i_60_, i_54_) * 325.949) & 0x7ff;
			final AbstractModelRenderer class180_sub7_69_ = Class120_Sub12_Sub22.method1319(i_68_, class180_sub7, this.z, i_62_, this.y, this.x);
			if (class180_sub7_69_ != null) {
				if (HDToolkit.glEnabled) {
					final float f = HDToolkit.method534();
					final float f_70_ = HDToolkit.method526();
					HDToolkit.disableDepthMask();
					HDToolkit.method535(f, f_70_ - 150.0F);
					class180_sub7_69_.render(0, i_57_, i_55_, i, i_64_, i_59_, i_61_, i_66_, -1L, i_56_, class108_sub2);
					HDToolkit.enableDepthMask();
					HDToolkit.method535(f, f_70_);
				} else {
					class180_sub7_69_.render(0, i_57_, i_55_, i, i_64_, i_59_, i_61_, i_66_, -1L, i_56_, class108_sub2);
				}
			}
		}
	}

	static final boolean method2345(final int bitPacked, final int i_71_) {
		if (!Class15.menuOpen) {
			return false;
		}
		final int parent = bitPacked >> 16;
		final int child = bitPacked & 0xffff;
		if (JagexInterface.interfaceCache[parent] == null || JagexInterface.interfaceCache[parent][child] == null) {
			return false;
		}
		final JagexInterface jagexInterface = JagexInterface.interfaceCache[parent][child];
		if (i_71_ != -1 || jagexInterface.type != 0) {
			for (int i_75_ = 0; i_75_ < WallDecoration.menuOptionCount; i_75_++) {
				if (Class120_Sub12_Sub7.menuOptionsData2[i_75_] == i_71_ && jagexInterface.bitPacked == Class120_Sub29.menuOptionsData3[i_75_] && (Class120_Sub29.menuOptionsCode[i_75_] == 1 || Class120_Sub29.menuOptionsCode[i_75_] == 1009 || Class120_Sub29.menuOptionsCode[i_75_] == 34 || Class120_Sub29.menuOptionsCode[i_75_] == 23 || Class120_Sub29.menuOptionsCode[i_75_] == 3)) {
					return true;
				}
			}
		} else {
			for (int i_76_ = 0; i_76_ < WallDecoration.menuOptionCount; i_76_++) {
				if (Class120_Sub29.menuOptionsCode[i_76_] == 1 || Class120_Sub29.menuOptionsCode[i_76_] == 1009 || Class120_Sub29.menuOptionsCode[i_76_] == 34 || Class120_Sub29.menuOptionsCode[i_76_] == 23 || Class120_Sub29.menuOptionsCode[i_76_] == 3) {
					for (JagexInterface class189_77_ = Class74.getJagexInterface(Class120_Sub29.menuOptionsData3[i_76_]); class189_77_ != null; class189_77_ = JagexInterface.getParentInterface(class189_77_)) {
						if (class189_77_.bitPacked == jagexInterface.bitPacked) {
							return true;
						}
					}
				}
			}
		}
		return false;
	}

	Player() {
		this.anInt3734 = -1;
		this.ambientSoundHearDistance = 0;
		this.anInt3738 = -1;
		this.pkIcon = -1;
		this.ambientSoundVolume = 255;
		this.anInt3736 = -1;
		this.team = 0;
		titleId = (byte) 0;
		this.anInt3742 = -1;
		this.anInt3740 = -1;
		this.playerLimitReached = false;
		this.combatLevel = 0;
		this.prayerIcon = -1;
	}
}
