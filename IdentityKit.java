/* Class139 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import javax.media.opengl.GL;

final class IdentityKit {
	private short[] recolorOriginal;
	private short[] recolorModified;
	private short[] retextureOriginal;
	static int selectedSpellParam;
	boolean noInterface = false;
	private short[] retextureModified;
	private int[] modelIds;
	static int anInt1334 = 100;
	private final int[] headModelIds = { -1, -1, -1, -1, -1 };
	int partId = -1;
	static js5 configClient;
	static ObjectCache recentUse = new ObjectCache(64);
	static Class191[][] aClass191ArrayArray1337;

	static final void buildPlayerMenu(final Player player, final int x, final int z, final int index) {
		if (TileParticleQueue.selfPlayer != player && WallDecoration.menuOptionCount < 400) {
			String string;
			if (player.skill == 0) {
				boolean markCombatDifference = true;
				if (TileParticleQueue.selfPlayer.anInt3738 != -1 && player.anInt3738 != -1) {
					final int highestCombatLevel = player.combatLevel >= TileParticleQueue.selfPlayer.combatLevel ? player.combatLevel : TileParticleQueue.selfPlayer.combatLevel;
					final int i_4_ = TileParticleQueue.selfPlayer.anInt3738 >= player.anInt3738 ? player.anInt3738 : TileParticleQueue.selfPlayer.anInt3738;
					final int i_5_ = 10 * highestCombatLevel / 100 + 5 + i_4_;
					int combatDelta = TileParticleQueue.selfPlayer.combatLevel - player.combatLevel;
					if (combatDelta < 0) {
						combatDelta = -combatDelta;
					}
					if (i_5_ < combatDelta) {
						markCombatDifference = false;
					}
				}
				final String identifier = Buffer.gameId != 1 ? TextRepository.level : TextRepository.rating;
				if (player.anInt3733 <= player.combatLevel) {
					string = player.getTitledName() + (markCombatDifference ? Class81.method704(TileParticleQueue.selfPlayer.combatLevel, player.combatLevel) : "<col=ffffff>") + " (" + identifier + player.combatLevel + ")";
				} else {
					string = player.getTitledName() + (markCombatDifference ? Class81.method704(TileParticleQueue.selfPlayer.combatLevel, player.combatLevel) : "<col=ffffff>") + " (" + identifier + player.combatLevel + "+" + (player.anInt3733 - player.combatLevel) + ")";
				}
			} else {
				string = player.getTitledName() + " (" + TextRepository.skill + player.skill + ")";
			}
			if (Light.objSelected == 1) {
				InvType.addMenuOption(TextRepository.use, Class192.selectedObjName + " -> <col=ffffff>" + string, index, x, z, (short) 21, Class120_Sub12_Sub10.selectedObjectTargetCursor);
			} else if (Class88.spellSelected) {
				if ((0x8 & GroundTile.selectedSpellUseMask) != 0) {
					InvType.addMenuOption(Class101.selectedSpellPrefix, Light.selectedSpellName + " -> <col=ffffff>" + string, index, x, z, (short) 5, Class150.selectedSpellTargetCursor);
				}
			} else {
				for (int optionId = 7; optionId >= 0; optionId--) {
					if (Buffer.playerOptions[optionId] != null) {
						short codeModifier = 0;
						if (Buffer.gameId == 0 && Buffer.playerOptions[optionId].equalsIgnoreCase(Class65.aString591)) {
							if (TileParticleQueue.selfPlayer.combatLevel < player.combatLevel) {
								codeModifier = (short) 2000;
							}
							if (TileParticleQueue.selfPlayer.team != 0 && player.team != 0) {
								if (player.team == TileParticleQueue.selfPlayer.team) {
									codeModifier = (short) 2000;
								} else {
									codeModifier = (short) 0;
								}
							}
						} else if (InterfaceListener.playerOptionsOnTop[optionId]) {
							codeModifier = (short) 2000;
						}
						short code = JagexInterface.playerMenuActionCodes[optionId];
						code += codeModifier;
						InvType.addMenuOption(Buffer.playerOptions[optionId], "<col=ffffff>" + string, index, x, z, code, AbstractRequest.playerOptionsIcon[optionId]);
					}
				}
			}
			for (int id = 0; id < WallDecoration.menuOptionCount; id++) {
				if (Class120_Sub29.menuOptionsCode[id] == 26) {
					Class120_Sub12_Sub29.menuOptionSuffix[id] = "<col=ffffff>" + string;
					break;
				}
			}
		}
	}

	final Model constructHeadModel() {
		final Model[] models = new Model[5];
		int modelPos = 0;
		for (int id = 0; id < 5; id++) {
			if (headModelIds[id] != -1) {
				models[modelPos++] = Model.get(SceneGroundObject.aClass50_2839, headModelIds[id], 0);
			}
		}
		final Model model = new Model(models, modelPos);
		if (recolorOriginal != null) {
			for (int id = 0; id < recolorOriginal.length; id++) {
				model.recolor(recolorOriginal[id], recolorModified[id]);
			}
		}
		if (retextureOriginal != null) {
			for (int id = 0; id < retextureOriginal.length; id++) {
				model.retexture(retextureOriginal[id], retextureModified[id]);
			}
		}
		return model;
	}

	final Model constructModel() {
		if (modelIds == null) {
			return null;
		}
		final Model[] models = new Model[modelIds.length];
		for (int id = 0; id < modelIds.length; id++) {
			models[id] = Model.get(SceneGroundObject.aClass50_2839, modelIds[id], 0);
		}
		Model model;
		if (models.length != 1) {
			model = new Model(models, models.length);
		} else {
			model = models[0];
		}
		if (recolorOriginal != null) {
			for (int id = 0; id < recolorOriginal.length; id++) {
				model.recolor(recolorOriginal[id], recolorModified[id]);
			}
		}
		if (retextureOriginal != null) {
			for (int id = 0; id< retextureOriginal.length; id++) {
				model.retexture(retextureOriginal[id], retextureModified[id]);
			}
		}
		return model;
	}

	private final void decode(final Buffer buffer, final int code) {
		if (code == 1) {
			this.partId = buffer.getUByte();
		}
		if (code == 2) {
			final int len = buffer.getUByte();
			modelIds = new int[len];
			for (int id = 0; id < len; id++) {
				modelIds[id] = buffer.getUShort();
			}
		}
		if (code == 3) {
			this.noInterface = true;
		}
		if (code == 40) {
			final int len = buffer.getUByte();
			recolorOriginal = new short[len];
			recolorModified = new short[len];
			for (int id = 0; id < len; id++) {
				recolorOriginal[id] = (short) buffer.getUShort();
				recolorModified[id] = (short) buffer.getUShort();
			}
		}
		if (code == 41) {
			final int len = buffer.getUByte();
			retextureOriginal = new short[len];
			retextureModified = new short[len];
			for (int id = 0; id < len; id++) {
				retextureOriginal[id] = (short) buffer.getUShort();
				retextureModified[id] = (short) buffer.getUShort();
			}
		}
		if (code >= 60 && code < 70) {
			headModelIds[code - 60] = buffer.getUShort();
		}
	}

	static final byte[] method1988(final Object object, final boolean newBuffer) {
		if (object == null) {
			return null;
		}
		if (object instanceof byte[]) {
			final byte[] data = (byte[]) object;
			if (newBuffer) {
				return ObjectPile.copyBuffer(data);
			}
			return data;
		}
		if (object instanceof AbstractBuffer) {
			final AbstractBuffer abstractBuffer = (AbstractBuffer) object;
			return abstractBuffer.get();
		}
		throw new IllegalArgumentException();
	}

	static final void method1989(final GroundTile class120_sub18, boolean bool) {
		AbstractTimer.aClass105_824.addLast(class120_sub18);
		for (;;) {
			final GroundTile class120_sub18_27_ = (GroundTile) AbstractTimer.aClass105_824.removeFront();
			if (class120_sub18_27_ == null) {
				break;
			}
			if (class120_sub18_27_.aBoolean2624) {
				final int i = class120_sub18_27_.anInt2632;
				final int i_28_ = class120_sub18_27_.anInt2629;
				final int i_29_ = class120_sub18_27_.anInt2636;
				final int i_30_ = class120_sub18_27_.anInt2642;
				final GroundTile[][] class120_sub18s = LabelGroup.groundTiles[i_29_];
				float f = 0.0F;
				if (HDToolkit.glEnabled) {
					if (Class24.anIntArrayArrayArray140 == OverridedJInterface.tileHeightMap) {
						final int i_31_ = NodeCache.anIntArrayArray300[i][i_28_];
						final int i_32_ = i_31_ & 0xffffff;
						if (i_32_ != Class120_Sub12_Sub19.anInt3281) {
							Class120_Sub12_Sub19.anInt3281 = i_32_;
							Class69.method614(i_32_);
							AtmosphereManager.setFogColor(EntityRenderData.method251());
						}
						final int i_33_ = i_31_ >>> 24 << 2;
						if (i_33_ != FrameLoader.anInt3612) {
							FrameLoader.anInt3612 = i_33_;
							Canvas_Sub1.method64(i_33_);
						}
						final int i_34_ = Class120_Sub12_Sub33.anIntArrayArrayArray3388[0][i][i_28_] + Class120_Sub12_Sub33.anIntArrayArrayArray3388[0][i + 1][i_28_] + Class120_Sub12_Sub33.anIntArrayArrayArray3388[0][i][i_28_ + 1] + Class120_Sub12_Sub33.anIntArrayArrayArray3388[0][i + 1][i_28_ + 1] >> 2;
						Class120_Sub14_Sub13.method1532(3, -i_34_);
						f = 201.5F;
						HDToolkit.method527(f);
					} else {
						f = 201.5F - 50.0F * (i_30_ + 1);
						HDToolkit.method527(f);
					}
				}
				if (class120_sub18_27_.aBoolean2647) {
					if (bool) {
						if (i_29_ > 0) {
							final GroundTile class120_sub18_35_ = LabelGroup.groundTiles[i_29_ - 1][i][i_28_];
							if (class120_sub18_35_ != null && class120_sub18_35_.aBoolean2624) {
								continue;
							}
						}
						if (i <= Class120_Sub12_Sub26.anInt3332 && i > GrandExchangeObject.anInt1493) {
							final GroundTile class120_sub18_36_ = class120_sub18s[i - 1][i_28_];
							if (class120_sub18_36_ != null && class120_sub18_36_.aBoolean2624 && (class120_sub18_36_.aBoolean2647 || (class120_sub18_27_.anInt2635 & 0x1) == 0)) {
								continue;
							}
						}
						if (i >= Class120_Sub12_Sub26.anInt3332 && i < Class53.anInt487 - 1) {
							final GroundTile class120_sub18_37_ = class120_sub18s[i + 1][i_28_];
							if (class120_sub18_37_ != null && class120_sub18_37_.aBoolean2624 && (class120_sub18_37_.aBoolean2647 || (class120_sub18_27_.anInt2635 & 0x4) == 0)) {
								continue;
							}
						}
						if (i_28_ <= Class112.anInt1080 && i_28_ > Class31.anInt248) {
							final GroundTile class120_sub18_38_ = class120_sub18s[i][i_28_ - 1];
							if (class120_sub18_38_ != null && class120_sub18_38_.aBoolean2624 && (class120_sub18_38_.aBoolean2647 || (class120_sub18_27_.anInt2635 & 0x8) == 0)) {
								continue;
							}
						}
						if (i_28_ >= Class112.anInt1080 && i_28_ < Js5Worker.anInt396 - 1) {
							final GroundTile class120_sub18_39_ = class120_sub18s[i][i_28_ + 1];
							if (class120_sub18_39_ != null && class120_sub18_39_.aBoolean2624 && (class120_sub18_39_.aBoolean2647 || (class120_sub18_27_.anInt2635 & 0x2) == 0)) {
								continue;
							}
						}
					} else {
						bool = true;
					}
					class120_sub18_27_.aBoolean2647 = false;
					if (class120_sub18_27_.aClass120_Sub18_2644 != null) {
						final GroundTile class120_sub18_40_ = class120_sub18_27_.aClass120_Sub18_2644;
						if (HDToolkit.glEnabled) {
							HDToolkit.method527(201.5F - 50.0F * (class120_sub18_40_.anInt2642 + 1));
						}
						if (class120_sub18_40_.plainTile != null) {
							if (!Class69_Sub1.method618(0, i, i_28_)) {
								Class132_Sub2.method1942(class120_sub18_40_.plainTile, 0, Class69_Sub2.anInt2239, ObjectContainer.anInt2616, Class120_Sub12_Sub30.anInt3377, MapFunctionType.anInt637, i, i_28_, false);
							} else {
								Class132_Sub2.method1942(class120_sub18_40_.plainTile, 0, Class69_Sub2.anInt2239, ObjectContainer.anInt2616, Class120_Sub12_Sub30.anInt3377, MapFunctionType.anInt637, i, i_28_, true);
							}
						} else if (class120_sub18_40_.shapedTile != null) {
							if (!Class69_Sub1.method618(0, i, i_28_)) {
								Class157.method2088(class120_sub18_40_.shapedTile, Class69_Sub2.anInt2239, ObjectContainer.anInt2616, Class120_Sub12_Sub30.anInt3377, MapFunctionType.anInt637, i, i_28_, false);
							} else {
								Class157.method2088(class120_sub18_40_.shapedTile, Class69_Sub2.anInt2239, ObjectContainer.anInt2616, Class120_Sub12_Sub30.anInt3377, MapFunctionType.anInt637, i, i_28_, true);
							}
						}
						final WallLocation class182 = class120_sub18_40_.wallLocation;
						if (class182 != null) {
							if (HDToolkit.glEnabled) {
								if ((class182.anInt1799 & class120_sub18_27_.anInt2646) != 0) {
									LightManager.method1866(class182.anInt1799, DisplayModeInfo.anInt1713, PlayerAppearance.anInt1367, Class145.anInt1381, i_30_, i, i_28_);
								} else {
									LightManager.method1861(DisplayModeInfo.anInt1713, PlayerAppearance.anInt1367, Class145.anInt1381, i_29_, i, i_28_);
								}
							}
							class182.aClass180_1800.render(0, Class69_Sub2.anInt2239, ObjectContainer.anInt2616, Class120_Sub12_Sub30.anInt3377, MapFunctionType.anInt637, class182.renderX - DisplayModeInfo.anInt1713, class182.renderY - PlayerAppearance.anInt1367, class182.renderZ - Class145.anInt1381,
									class182.bitPackedUid, i_29_, null);
						}
						for (int i_41_ = 0; i_41_ < class120_sub18_40_.anInt2638; i_41_++) {
							final Class28 class28 = class120_sub18_40_.aClass28Array2625[i_41_];
							if (class28 != null) {
								if (HDToolkit.glEnabled) {
									LightManager.method1861(DisplayModeInfo.anInt1713, PlayerAppearance.anInt1367, Class145.anInt1381, i_29_, i, i_28_);
								}
								class28.aClass180_174.render(class28.anInt172, Class69_Sub2.anInt2239, ObjectContainer.anInt2616, Class120_Sub12_Sub30.anInt3377, MapFunctionType.anInt637, class28.anInt178 - DisplayModeInfo.anInt1713, class28.anInt179 - PlayerAppearance.anInt1367, class28.anInt185 - Class145.anInt1381,
										class28.bitPacked, i_29_, null);
							}
						}
						if (HDToolkit.glEnabled) {
							HDToolkit.method527(f);
						}
					}
					boolean bool_42_ = false;
					if (class120_sub18_27_.plainTile != null) {
						if (!Class69_Sub1.method618(i_30_, i, i_28_)) {
							bool_42_ = true;
							if (class120_sub18_27_.plainTile.anInt1351 != 12345678 || Class120_Sub12_Sub7.aBoolean3181 && i_29_ <= Projectile.anInt2933) {
								Class132_Sub2.method1942(class120_sub18_27_.plainTile, i_30_, Class69_Sub2.anInt2239, ObjectContainer.anInt2616, Class120_Sub12_Sub30.anInt3377, MapFunctionType.anInt637, i, i_28_, false);
							}
						} else {
							Class132_Sub2.method1942(class120_sub18_27_.plainTile, i_30_, Class69_Sub2.anInt2239, ObjectContainer.anInt2616, Class120_Sub12_Sub30.anInt3377, MapFunctionType.anInt637, i, i_28_, true);
						}
					} else if (class120_sub18_27_.shapedTile != null) {
						if (!Class69_Sub1.method618(i_30_, i, i_28_)) {
							bool_42_ = true;
							Class157.method2088(class120_sub18_27_.shapedTile, Class69_Sub2.anInt2239, ObjectContainer.anInt2616, Class120_Sub12_Sub30.anInt3377, MapFunctionType.anInt637, i, i_28_, false);
						} else {
							Class157.method2088(class120_sub18_27_.shapedTile, Class69_Sub2.anInt2239, ObjectContainer.anInt2616, Class120_Sub12_Sub30.anInt3377, MapFunctionType.anInt637, i, i_28_, true);
						}
					}
					if (bool_42_) {
						final GroundDecoration class36 = class120_sub18_27_.groundDecoration;
						if (class36 != null && (class36.bitPackedUid & 0x80000000L) != 0L) {
							if (HDToolkit.glEnabled && class36.aBoolean314) {
								HDToolkit.method527(f + 50.0F - 1.5F);
							}
							if (HDToolkit.glEnabled) {
								LightManager.method1861(DisplayModeInfo.anInt1713, PlayerAppearance.anInt1367, Class145.anInt1381, i_29_, i, i_28_);
							}
							class36.sceneGraphNode.render(0, Class69_Sub2.anInt2239, ObjectContainer.anInt2616, Class120_Sub12_Sub30.anInt3377, MapFunctionType.anInt637, class36.renderX - DisplayModeInfo.anInt1713, class36.renderY - PlayerAppearance.anInt1367, class36.renderZ - Class145.anInt1381, class36.bitPackedUid,
									i_29_, null);
							if (HDToolkit.glEnabled && class36.aBoolean314) {
								HDToolkit.method527(f);
							}
						}
					}
					int i_43_ = 0;
					int i_44_ = 0;
					final WallLocation class182 = class120_sub18_27_.wallLocation;
					final WallDecoration class186 = class120_sub18_27_.wallDecoration;
					if (class182 != null || class186 != null) {
						if (Class120_Sub12_Sub26.anInt3332 == i) {
							i_43_++;
						} else if (Class120_Sub12_Sub26.anInt3332 < i) {
							i_43_ += 2;
						}
						if (Class112.anInt1080 == i_28_) {
							i_43_ += 3;
						} else if (Class112.anInt1080 > i_28_) {
							i_43_ += 6;
						}
						i_44_ = Class120_Sub15.anIntArray2591[i_43_];
						class120_sub18_27_.anInt2646 = FileSystem.anIntArray453[i_43_];
					}
					if (class182 != null) {
						if ((class182.anInt1799 & IntegerNode.anIntArray2791[i_43_]) != 0) {
							if (class182.anInt1799 == 16) {
								class120_sub18_27_.anInt2633 = 3;
								class120_sub18_27_.anInt2637 = Class157.anIntArray1461[i_43_];
								class120_sub18_27_.anInt2648 = 3 - class120_sub18_27_.anInt2637;
							} else if (class182.anInt1799 == 32) {
								class120_sub18_27_.anInt2633 = 6;
								class120_sub18_27_.anInt2637 = Class120_Sub12_Sub12.anIntArray3220[i_43_];
								class120_sub18_27_.anInt2648 = 6 - class120_sub18_27_.anInt2637;
							} else if (class182.anInt1799 == 64) {
								class120_sub18_27_.anInt2633 = 12;
								class120_sub18_27_.anInt2637 = client.anIntArray1152[i_43_];
								class120_sub18_27_.anInt2648 = 12 - class120_sub18_27_.anInt2637;
							} else {
								class120_sub18_27_.anInt2633 = 9;
								class120_sub18_27_.anInt2637 = Class2.anIntArray51[i_43_];
								class120_sub18_27_.anInt2648 = 9 - class120_sub18_27_.anInt2637;
							}
						} else {
							class120_sub18_27_.anInt2633 = 0;
						}
						if ((class182.anInt1799 & i_44_) != 0 && !GameEntity.method2335(i_30_, i, i_28_, class182.anInt1799)) {
							if (HDToolkit.glEnabled) {
								LightManager.method1861(DisplayModeInfo.anInt1713, PlayerAppearance.anInt1367, Class145.anInt1381, i_29_, i, i_28_);
							}
							class182.aClass180_1800.render(0, Class69_Sub2.anInt2239, ObjectContainer.anInt2616, Class120_Sub12_Sub30.anInt3377, MapFunctionType.anInt637, class182.renderX - DisplayModeInfo.anInt1713, class182.renderY - PlayerAppearance.anInt1367, class182.renderZ - Class145.anInt1381,
									class182.bitPackedUid, i_29_, null);
						}
						if ((class182.anInt1792 & i_44_) != 0 && !GameEntity.method2335(i_30_, i, i_28_, class182.anInt1792)) {
							if (HDToolkit.glEnabled) {
								LightManager.method1861(DisplayModeInfo.anInt1713, PlayerAppearance.anInt1367, Class145.anInt1381, i_29_, i, i_28_);
							}
							class182.aClass180_1796.render(0, Class69_Sub2.anInt2239, ObjectContainer.anInt2616, Class120_Sub12_Sub30.anInt3377, MapFunctionType.anInt637, class182.renderX - DisplayModeInfo.anInt1713, class182.renderY - PlayerAppearance.anInt1367, class182.renderZ - Class145.anInt1381,
									class182.bitPackedUid, i_29_, null);
						}
					}
					if (class186 != null && !Js5Worker.method363(i_30_, i, i_28_, class186.aClass180_1901.getMaxY())) {
						if (HDToolkit.glEnabled) {
							HDToolkit.method527(f - 0.5F);
						}
						if ((class186.anInt1895 & i_44_) != 0) {
							if (HDToolkit.glEnabled) {
								LightManager.method1861(DisplayModeInfo.anInt1713, PlayerAppearance.anInt1367, Class145.anInt1381, i_29_, i, i_28_);
							}
							class186.aClass180_1901.render(0, Class69_Sub2.anInt2239, ObjectContainer.anInt2616, Class120_Sub12_Sub30.anInt3377, MapFunctionType.anInt637, class186.renderX - DisplayModeInfo.anInt1713 + class186.anInt1905, class186.renderY - PlayerAppearance.anInt1367, class186.renderZ
									- Class145.anInt1381 + class186.anInt1892, class186.bitPacked, i_29_, null);
						} else if (class186.anInt1895 == 256) {
							final int i_45_ = class186.renderX - DisplayModeInfo.anInt1713;
							final int i_46_ = class186.renderY - PlayerAppearance.anInt1367;
							final int i_47_ = class186.renderZ - Class145.anInt1381;
							final int i_48_ = class186.anInt1896;
							int i_49_;
							if (i_48_ == 1 || i_48_ == 2) {
								i_49_ = -i_45_;
							} else {
								i_49_ = i_45_;
							}
							int i_50_;
							if (i_48_ == 2 || i_48_ == 3) {
								i_50_ = -i_47_;
							} else {
								i_50_ = i_47_;
							}
							if (i_50_ < i_49_) {
								if (HDToolkit.glEnabled) {
									LightManager.method1861(DisplayModeInfo.anInt1713, PlayerAppearance.anInt1367, Class145.anInt1381, i_29_, i, i_28_);
								}
								class186.aClass180_1901.render(0, Class69_Sub2.anInt2239, ObjectContainer.anInt2616, Class120_Sub12_Sub30.anInt3377, MapFunctionType.anInt637, i_45_ + class186.anInt1905, i_46_, i_47_ + class186.anInt1892, class186.bitPacked, i_29_, null);
							} else if (class186.aClass180_1898 != null) {
								if (HDToolkit.glEnabled) {
									LightManager.method1861(DisplayModeInfo.anInt1713, PlayerAppearance.anInt1367, Class145.anInt1381, i_29_, i, i_28_);
								}
								class186.aClass180_1898.render(0, Class69_Sub2.anInt2239, ObjectContainer.anInt2616, Class120_Sub12_Sub30.anInt3377, MapFunctionType.anInt637, i_45_, i_46_, i_47_, class186.bitPacked, i_29_, null);
							}
						}
						if (HDToolkit.glEnabled) {
							HDToolkit.method527(f);
						}
					}
					if (bool_42_) {
						final GroundDecoration groundDecoration = class120_sub18_27_.groundDecoration;
						if (groundDecoration != null && (groundDecoration.bitPackedUid & 0x80000000L) == 0L) {
							if (HDToolkit.glEnabled && groundDecoration.aBoolean314) {
								HDToolkit.method527(f + 50.0F - 1.5F);
							}
							if (HDToolkit.glEnabled) {
								LightManager.method1861(DisplayModeInfo.anInt1713, PlayerAppearance.anInt1367, Class145.anInt1381, i_29_, i, i_28_);
							}
							groundDecoration.sceneGraphNode.render(0, Class69_Sub2.anInt2239, ObjectContainer.anInt2616, Class120_Sub12_Sub30.anInt3377, MapFunctionType.anInt637, groundDecoration.renderX - DisplayModeInfo.anInt1713, groundDecoration.renderY - PlayerAppearance.anInt1367, groundDecoration.renderZ - Class145.anInt1381, groundDecoration.bitPackedUid,
									i_29_, null);
							if (HDToolkit.glEnabled && groundDecoration.aBoolean314) {
								HDToolkit.method527(f);
							}
						}
						final ObjectPile objectPile = class120_sub18_27_.objectPile;
						if (objectPile != null && objectPile.yLocationModifier == 0) {
							if (HDToolkit.glEnabled) {
								LightManager.method1861(DisplayModeInfo.anInt1713, PlayerAppearance.anInt1367, Class145.anInt1381, i_29_, i, i_28_);
							}
							if (objectPile.secondItemModel != null) {
								objectPile.secondItemModel.render(0, Class69_Sub2.anInt2239, ObjectContainer.anInt2616, Class120_Sub12_Sub30.anInt3377, MapFunctionType.anInt637, objectPile.renderX - DisplayModeInfo.anInt1713, objectPile.renderY - PlayerAppearance.anInt1367, objectPile.renderZ - Class145.anInt1381,
										objectPile.bitPacked, i_29_, null);
							}
							if (objectPile.thirdItemModel != null) {
								objectPile.thirdItemModel.render(0, Class69_Sub2.anInt2239, ObjectContainer.anInt2616, Class120_Sub12_Sub30.anInt3377, MapFunctionType.anInt637, objectPile.renderX - DisplayModeInfo.anInt1713, objectPile.renderY - PlayerAppearance.anInt1367, objectPile.renderZ - Class145.anInt1381,
										objectPile.bitPacked, i_29_, null);
							}
							if (objectPile.mainItemModel != null) {
								objectPile.mainItemModel.render(0, Class69_Sub2.anInt2239, ObjectContainer.anInt2616, Class120_Sub12_Sub30.anInt3377, MapFunctionType.anInt637, objectPile.renderX - DisplayModeInfo.anInt1713, objectPile.renderY - PlayerAppearance.anInt1367, objectPile.renderZ - Class145.anInt1381,
										objectPile.bitPacked, i_29_, null);
							}
						}
					}
					final int i_51_ = class120_sub18_27_.anInt2635;
					if (i_51_ != 0) {
						if (i < Class120_Sub12_Sub26.anInt3332 && (i_51_ & 0x4) != 0) {
							final GroundTile class120_sub18_52_ = class120_sub18s[i + 1][i_28_];
							if (class120_sub18_52_ != null && class120_sub18_52_.aBoolean2624) {
								AbstractTimer.aClass105_824.addLast(class120_sub18_52_);
							}
						}
						if (i_28_ < Class112.anInt1080 && (i_51_ & 0x2) != 0) {
							final GroundTile class120_sub18_53_ = class120_sub18s[i][i_28_ + 1];
							if (class120_sub18_53_ != null && class120_sub18_53_.aBoolean2624) {
								AbstractTimer.aClass105_824.addLast(class120_sub18_53_);
							}
						}
						if (i > Class120_Sub12_Sub26.anInt3332 && (i_51_ & 0x1) != 0) {
							final GroundTile class120_sub18_54_ = class120_sub18s[i - 1][i_28_];
							if (class120_sub18_54_ != null && class120_sub18_54_.aBoolean2624) {
								AbstractTimer.aClass105_824.addLast(class120_sub18_54_);
							}
						}
						if (i_28_ > Class112.anInt1080 && (i_51_ & 0x8) != 0) {
							final GroundTile class120_sub18_55_ = class120_sub18s[i][i_28_ - 1];
							if (class120_sub18_55_ != null && class120_sub18_55_.aBoolean2624) {
								AbstractTimer.aClass105_824.addLast(class120_sub18_55_);
							}
						}
					}
				}
				if (class120_sub18_27_.anInt2633 != 0) {
					boolean bool_56_ = true;
					for (int i_57_ = 0; i_57_ < class120_sub18_27_.anInt2638; i_57_++) {
						if (class120_sub18_27_.aClass28Array2625[i_57_].anInt173 != Class120_Sub12_Sub9.anInt3193 && (class120_sub18_27_.anIntArray2641[i_57_] & class120_sub18_27_.anInt2633) == class120_sub18_27_.anInt2637) {
							bool_56_ = false;
							break;
						}
					}
					if (bool_56_) {
						final WallLocation class182 = class120_sub18_27_.wallLocation;
						if (!GameEntity.method2335(i_30_, i, i_28_, class182.anInt1799)) {
							do {
								if (HDToolkit.glEnabled) {
									if ((class182.bitPackedUid & 0xfc000L) == 16384L) {
										int i_58_ = class182.renderX - DisplayModeInfo.anInt1713;
										int i_59_ = class182.renderZ - Class145.anInt1381;
										final int i_60_ = (int) (class182.bitPackedUid >> 20 & 0x3L);
										if (i_60_ == 0) {
											i_58_ -= 64;
											i_59_ += 64;
											if (i_59_ < i_58_ && i > 0 && i_28_ < Class120_Sub12_Sub38.anInt3440 - 1) {
												LightManager.method1861(DisplayModeInfo.anInt1713, PlayerAppearance.anInt1367, Class145.anInt1381, i_29_, i - 1, i_28_ + 1);
												break;
											}
										} else if (i_60_ == 1) {
											i_58_ += 64;
											i_59_ += 64;
											if (i_59_ < -i_58_ && i < WallDecoration.anInt1900 - 1 && i_28_ < Class120_Sub12_Sub38.anInt3440 - 1) {
												LightManager.method1861(DisplayModeInfo.anInt1713, PlayerAppearance.anInt1367, Class145.anInt1381, i_29_, i + 1, i_28_ + 1);
												break;
											}
										} else if (i_60_ == 2) {
											i_58_ += 64;
											i_59_ -= 64;
											if (i_59_ > i_58_ && i < WallDecoration.anInt1900 - 1 && i_28_ > 0) {
												LightManager.method1861(DisplayModeInfo.anInt1713, PlayerAppearance.anInt1367, Class145.anInt1381, i_29_, i + 1, i_28_ - 1);
												break;
											}
										} else if (i_60_ == 3) {
											i_58_ -= 64;
											i_59_ -= 64;
											if (i_59_ > -i_58_ && i > 0 && i_28_ > 0) {
												LightManager.method1861(DisplayModeInfo.anInt1713, PlayerAppearance.anInt1367, Class145.anInt1381, i_29_, i - 1, i_28_ - 1);
												break;
											}
										}
									}
									LightManager.method1861(DisplayModeInfo.anInt1713, PlayerAppearance.anInt1367, Class145.anInt1381, i_29_, i, i_28_);
								}
							} while (false);
							class182.aClass180_1800.render(0, Class69_Sub2.anInt2239, ObjectContainer.anInt2616, Class120_Sub12_Sub30.anInt3377, MapFunctionType.anInt637, class182.renderX - DisplayModeInfo.anInt1713, class182.renderY - PlayerAppearance.anInt1367, class182.renderZ - Class145.anInt1381,
									class182.bitPackedUid, i_29_, null);
						}
						class120_sub18_27_.anInt2633 = 0;
					}
				}
				if (class120_sub18_27_.aBoolean2631) {
					try {
						final int i_61_ = class120_sub18_27_.anInt2638;
						class120_sub18_27_.aBoolean2631 = false;
						int i_62_ = 0;
						while_84_: for (int i_63_ = 0; i_63_ < i_61_; i_63_++) {
							final Class28 class28 = class120_sub18_27_.aClass28Array2625[i_63_];
							if (class28.anInt173 != Class120_Sub12_Sub9.anInt3193) {
								for (int i_64_ = class28.anInt180; i_64_ <= class28.anInt182; i_64_++) {
									for (int i_65_ = class28.anInt184; i_65_ <= class28.anInt175; i_65_++) {
										final GroundTile class120_sub18_66_ = class120_sub18s[i_64_][i_65_];
										if (class120_sub18_66_.aBoolean2647) {
											class120_sub18_27_.aBoolean2631 = true;
											continue while_84_;
										}
										if (class120_sub18_66_.anInt2633 != 0) {
											int i_67_ = 0;
											if (i_64_ > class28.anInt180) {
												i_67_++;
											}
											if (i_64_ < class28.anInt182) {
												i_67_ += 4;
											}
											if (i_65_ > class28.anInt184) {
												i_67_ += 8;
											}
											if (i_65_ < class28.anInt175) {
												i_67_ += 2;
											}
											if ((i_67_ & class120_sub18_66_.anInt2633) == class120_sub18_27_.anInt2648) {
												class120_sub18_27_.aBoolean2631 = true;
												continue while_84_;
											}
										}
									}
								}
								client.aClass28Array323[i_62_++] = class28;
								int i_68_ = Class120_Sub12_Sub26.anInt3332 - class28.anInt180;
								final int i_69_ = class28.anInt182 - Class120_Sub12_Sub26.anInt3332;
								if (i_69_ > i_68_) {
									i_68_ = i_69_;
								}
								final int i_70_ = Class112.anInt1080 - class28.anInt184;
								final int i_71_ = class28.anInt175 - Class112.anInt1080;
								if (i_71_ > i_70_) {
									class28.anInt171 = i_68_ + i_71_;
								} else {
									class28.anInt171 = i_68_ + i_70_;
								}
							}
						}
						while (i_62_ > 0) {
							int i_72_ = -50;
							int i_73_ = -1;
							for (int i_74_ = 0; i_74_ < i_62_; i_74_++) {
								final Class28 class28 = client.aClass28Array323[i_74_];
								if (class28.anInt173 != Class120_Sub12_Sub9.anInt3193) {
									if (class28.anInt171 > i_72_) {
										i_72_ = class28.anInt171;
										i_73_ = i_74_;
									} else if (class28.anInt171 == i_72_) {
										final int i_75_ = class28.anInt178 - DisplayModeInfo.anInt1713;
										final int i_76_ = class28.anInt185 - Class145.anInt1381;
										final int i_77_ = client.aClass28Array323[i_73_].anInt178 - DisplayModeInfo.anInt1713;
										final int i_78_ = client.aClass28Array323[i_73_].anInt185 - Class145.anInt1381;
										if (i_75_ * i_75_ + i_76_ * i_76_ > i_77_ * i_77_ + i_78_ * i_78_) {
											i_73_ = i_74_;
										}
									}
								}
							}
							if (i_73_ == -1) {
								break;
							}
							final Class28 class28 = client.aClass28Array323[i_73_];
							class28.anInt173 = Class120_Sub12_Sub9.anInt3193;
							if (!HintIcon.method723(i_30_, class28.anInt180, class28.anInt182, class28.anInt184, class28.anInt175, class28.aClass180_174.getMaxY())) {
								if (HDToolkit.glEnabled) {
									if ((class28.bitPacked & 0xfc000L) == 147456L) {
										LightManager.method1861(DisplayModeInfo.anInt1713, PlayerAppearance.anInt1367, Class145.anInt1381, i_29_, i, i_28_);
										final int i_79_ = class28.anInt178 - DisplayModeInfo.anInt1713;
										final int i_80_ = class28.anInt185 - Class145.anInt1381;
										final int i_81_ = (int) (class28.bitPacked >> 20 & 0x3L);
										if (i_81_ == 1 || i_81_ == 3) {
											if (i_80_ > -i_79_) {
												LightManager.method1864(i_29_, i, i_28_ - 1, i - 1, i_28_);
											} else {
												LightManager.method1864(i_29_, i, i_28_ + 1, i + 1, i_28_);
											}
										} else if (i_80_ > i_79_) {
											LightManager.method1864(i_29_, i, i_28_ - 1, i + 1, i_28_);
										} else {
											LightManager.method1864(i_29_, i, i_28_ + 1, i - 1, i_28_);
										}
									} else {
										LightManager.method1862(DisplayModeInfo.anInt1713, PlayerAppearance.anInt1367, Class145.anInt1381, i_29_, class28.anInt180, class28.anInt184, class28.anInt182, class28.anInt175);
									}
								}
								class28.aClass180_174.render(class28.anInt172, Class69_Sub2.anInt2239, ObjectContainer.anInt2616, Class120_Sub12_Sub30.anInt3377, MapFunctionType.anInt637, class28.anInt178 - DisplayModeInfo.anInt1713, class28.anInt179 - PlayerAppearance.anInt1367, class28.anInt185 - Class145.anInt1381,
										class28.bitPacked, i_29_, null);
							}
							for (int i_82_ = class28.anInt180; i_82_ <= class28.anInt182; i_82_++) {
								for (int i_83_ = class28.anInt184; i_83_ <= class28.anInt175; i_83_++) {
									final GroundTile class120_sub18_84_ = class120_sub18s[i_82_][i_83_];
									if (class120_sub18_84_.anInt2633 != 0) {
										AbstractTimer.aClass105_824.addLast(class120_sub18_84_);
									} else if ((i_82_ != i || i_83_ != i_28_) && class120_sub18_84_.aBoolean2624) {
										AbstractTimer.aClass105_824.addLast(class120_sub18_84_);
									}
								}
							}
						}
						if (class120_sub18_27_.aBoolean2631) {
							continue;
						}
					} catch (final Exception exception) {
						class120_sub18_27_.aBoolean2631 = false;
					}
				}
				if (class120_sub18_27_.tileParticle != null) {
					if (HDToolkit.glEnabled) {
						final GL gl = HDToolkit.gl;
						HDToolkit.method527(f);
						ParticleEngine.method956(DisplayModeInfo.anInt1713, PlayerAppearance.anInt1367, Class145.anInt1381);
						final int i_85_ = class120_sub18_27_.anInt2632 * 128 + 64 - DisplayModeInfo.anInt1713;
						final int i_86_ = OverridedJInterface.tileHeightMap[i_29_][class120_sub18_27_.anInt2632][class120_sub18_27_.anInt2629] - PlayerAppearance.anInt1367;
						final int i_87_ = class120_sub18_27_.anInt2629 * 128 + 64 - Class145.anInt1381;
						int i_88_;
						if (i_29_ < 3) {
							i_88_ = OverridedJInterface.tileHeightMap[i_29_][class120_sub18_27_.anInt2632][class120_sub18_27_.anInt2629] - OverridedJInterface.tileHeightMap[i_29_ + 1][class120_sub18_27_.anInt2632][class120_sub18_27_.anInt2629];
						} else {
							i_88_ = 1024;
						}
						final int i_89_ = i_87_ * MapFunctionType.anInt637 - i_85_ * Class120_Sub12_Sub30.anInt3377 >> 16;
						final int i_90_ = i_86_ * Class69_Sub2.anInt2239 + i_89_ * ObjectContainer.anInt2616 >> 16;
						final int i_91_ = i_90_ + (91 * ObjectContainer.anInt2616 + 0 * Class69_Sub2.anInt2239 >> 16);
						int i_92_ = i_90_ + (-91 * ObjectContainer.anInt2616 - i_88_ * Class69_Sub2.anInt2239 >> 16);
						if (i_92_ < i_91_ - 1597) {
							i_92_ = i_91_ - 1597;
						}
						final int i_93_ = i_91_ - i_92_ + 2;
						Particle class108_sub3_sub1 = null;
						ParticleEmitter class108_sub1 = null;
						int i_94_ = -1;
						Particle class108_sub3_sub1_95_ = (Particle) class120_sub18_27_.tileParticle.peekFirst();
						for (/**/; true; class108_sub3_sub1_95_ = (Particle) class120_sub18_27_.tileParticle.peekNext()) {
							if (class108_sub3_sub1_95_ != null) {
								if (class108_sub3_sub1_95_.aClass108_Sub1_3099 == null || class108_sub3_sub1_95_.aClass108_Sub1_3099.particleEngine.aBoolean2356) {
									class108_sub3_sub1_95_.unlink();
									continue;
								}
								if ((byte) (int) (class108_sub3_sub1_95_.aClass108_Sub1_3099.particleEngine.aLong2359 & 0xffL) != class120_sub18_27_.aByte2623) {
									class120_sub18_27_.tileParticle = null;
									break;
								}
								if (class108_sub3_sub1 == null) {
									class108_sub3_sub1 = class108_sub3_sub1_95_;
									class108_sub1 = class108_sub3_sub1_95_.aClass108_Sub1_3099;
									i_94_ = class108_sub1.emitterType.size;
									continue;
								}
							}
							if (class108_sub3_sub1 != null && (class108_sub3_sub1_95_ == null || class108_sub3_sub1_95_.aClass108_Sub1_3099 != class108_sub1 || class108_sub3_sub1_95_.aClass108_Sub1_3099.emitterType.size != i_94_)) {
								for (int i_96_ = 0; i_96_ < i_93_; i_96_++) {
									ParticleEngine.anIntArray2389[i_96_] = 0;
								}
								for (int i_97_ = 0; i_97_ < 32; i_97_++) {
									ParticleEngine.anIntArray2390[i_97_] = 0;
								}
								ParticleEngine.anInt2380 = 0;
								for (Particle class108_sub3_sub1_98_ = class108_sub3_sub1; class108_sub3_sub1_98_ != class108_sub3_sub1_95_; class108_sub3_sub1_98_ = (Particle) class108_sub3_sub1_98_.nextSub) {
									if (class108_sub3_sub1_98_.aClass108_Sub1_3099 != null) {
										final int i_99_ = (class108_sub3_sub1_98_.anInt3087 >> 12) - DisplayModeInfo.anInt1713;
										final int i_100_ = (class108_sub3_sub1_98_.anInt3088 >> 12) - PlayerAppearance.anInt1367;
										int i_101_ = (class108_sub3_sub1_98_.anInt3090 >> 12) - Class145.anInt1381;
										i_101_ = i_101_ * MapFunctionType.anInt637 - i_99_ * Class120_Sub12_Sub30.anInt3377 >> 16;
										i_101_ = (i_100_ * Class69_Sub2.anInt2239 + i_101_ * ObjectContainer.anInt2616 >> 16) - i_92_;
										if (ParticleEngine.anIntArray2389[i_101_] < 32) {
											ParticleEngine.aShortArrayArray2378[i_101_][ParticleEngine.anIntArray2389[i_101_]++] = class108_sub3_sub1_98_.aShort3094;
										} else {
											if (ParticleEngine.anIntArray2389[i_101_] == 32) {
												if (ParticleEngine.anInt2380 == 32) {
													if (ParticleEngine.aBoolean2362) {
														System.out.println("Overflowed world-based radix sort");
													}
													break;
												}
												ParticleEngine.anIntArray2389[i_101_] += 1 + ParticleEngine.anInt2380++;
											}
											final int i_102_ = ParticleEngine.anIntArray2390[ParticleEngine.anIntArray2389[i_101_] - 32 - 1];
											if (i_102_ < 768) {
												ParticleEngine.aShortArrayArray2387[ParticleEngine.anIntArray2389[i_101_] - 32 - 1][ParticleEngine.anIntArray2390[ParticleEngine.anIntArray2389[i_101_] - 32 - 1]++] = class108_sub3_sub1_98_.aShort3094;
											}
										}
									}
									if (class108_sub3_sub1_98_.nextSub == class120_sub18_27_.tileParticle.head) {
										break;
									}
								}
								boolean bool_103_ = false;
								if (ParticleEngine.aBoolean2347 && class108_sub1.emitterType.anInt724 != -1) {
									Rasterizer.anInterface5_973.method25(class108_sub1.emitterType.anInt724);
									bool_103_ = true;
								} else {
									HDToolkit.bindTexture2D(-1);
								}
								float f_104_ = i_94_ * ParticleEngine.aFloat2393;
								if (f_104_ > 64.0F) {
									f_104_ = 64.0F;
								}
								gl.glPointSize(f_104_);
								class108_sub1.particleEngine.method950(gl, i_93_, bool_103_, class108_sub1.emitterType.aBoolean750);
								if (class108_sub3_sub1_95_ != null) {
									class108_sub3_sub1 = class108_sub3_sub1_95_;
									class108_sub1 = class108_sub3_sub1_95_.aClass108_Sub1_3099;
									i_94_ = class108_sub3_sub1_95_.aClass108_Sub1_3099.emitterType.size;
								}
							}
							if (class108_sub3_sub1_95_ == null) {
								break;
							}
						}
						ParticleEngine.method957();
					} else {
						final int xOff = ParticleEngine.anInt2364 + Rasterizer.anInt967;
						final int yOff = ParticleEngine.anInt2358 + Rasterizer.anInt970;
						final ParticleNodeSub class108_sub3 = class120_sub18_27_.tileParticle.head;
						for (ParticleNodeSub class108_sub3_107_ = class108_sub3.nextSub; class108_sub3_107_ != class108_sub3; class108_sub3_107_ = class108_sub3_107_.nextSub) {
							final Particle class108_sub3_sub1 = (Particle) class108_sub3_107_;
							if (class108_sub3_sub1.aClass108_Sub1_3099 != null && !class108_sub3_sub1.aClass108_Sub1_3099.particleEngine.aBoolean2356) {
								if ((byte) (int) (class108_sub3_sub1.aClass108_Sub1_3099.particleEngine.aLong2359 & 0xffL) != class120_sub18_27_.aByte2623) {
									class120_sub18_27_.tileParticle = null;
									break;
								}
								int x = (class108_sub3_sub1.anInt3087 >> 12) - DisplayModeInfo.anInt1713;
								int y = (class108_sub3_sub1.anInt3088 >> 12) - PlayerAppearance.anInt1367;
								int z = (class108_sub3_sub1.anInt3090 >> 12) - Class145.anInt1381;
								int i_111_ = z * Class120_Sub12_Sub30.anInt3377 + x * MapFunctionType.anInt637 >> 16;
								z = z * MapFunctionType.anInt637 - x * Class120_Sub12_Sub30.anInt3377 >> 16;
								x = i_111_;
								i_111_ = y * ObjectContainer.anInt2616 - z * Class69_Sub2.anInt2239 >> 16;
								z = y * Class69_Sub2.anInt2239 + z * ObjectContainer.anInt2616 >> 16;
								y = i_111_;
								if (z >= 50) {
									final int renderX = xOff + (x << 9) / z;
									final int renderY = yOff + (y << 9) / z;
									int size = z * 400;
									if (size == 0) {
										size = 1;
									}
									GraphicsLD.drawAlphaCircle(renderX, renderY, (class108_sub3_sub1.aClass108_Sub1_3099.emitterType.size << 16) / size, class108_sub3_sub1.color, class108_sub3_sub1.color >> 24 & 0xff);
								}
							}
						}
					}
				}
				if (class120_sub18_27_.aBoolean2624 && class120_sub18_27_.anInt2633 == 0) {
					if (i <= Class120_Sub12_Sub26.anInt3332 && i > GrandExchangeObject.anInt1493) {
						final GroundTile class120_sub18_115_ = class120_sub18s[i - 1][i_28_];
						if (class120_sub18_115_ != null && class120_sub18_115_.aBoolean2624) {
							continue;
						}
					}
					if (i >= Class120_Sub12_Sub26.anInt3332 && i < Class53.anInt487 - 1) {
						final GroundTile class120_sub18_116_ = class120_sub18s[i + 1][i_28_];
						if (class120_sub18_116_ != null && class120_sub18_116_.aBoolean2624) {
							continue;
						}
					}
					if (i_28_ <= Class112.anInt1080 && i_28_ > Class31.anInt248) {
						final GroundTile class120_sub18_117_ = class120_sub18s[i][i_28_ - 1];
						if (class120_sub18_117_ != null && class120_sub18_117_.aBoolean2624) {
							continue;
						}
					}
					if (i_28_ >= Class112.anInt1080 && i_28_ < Js5Worker.anInt396 - 1) {
						final GroundTile class120_sub18_118_ = class120_sub18s[i][i_28_ + 1];
						if (class120_sub18_118_ != null && class120_sub18_118_.aBoolean2624) {
							continue;
						}
					}
					class120_sub18_27_.aBoolean2624 = false;
					ObjectContainer.anInt2615--;
					final ObjectPile objectPile = class120_sub18_27_.objectPile;
					if (objectPile != null && objectPile.yLocationModifier != 0) {
						if (HDToolkit.glEnabled) {
							LightManager.method1861(DisplayModeInfo.anInt1713, PlayerAppearance.anInt1367, Class145.anInt1381, i_29_, i, i_28_);
						}
						if (objectPile.secondItemModel != null) {
							objectPile.secondItemModel.render(0, Class69_Sub2.anInt2239, ObjectContainer.anInt2616, Class120_Sub12_Sub30.anInt3377, MapFunctionType.anInt637, objectPile.renderX - DisplayModeInfo.anInt1713, objectPile.renderY - PlayerAppearance.anInt1367 - objectPile.yLocationModifier, objectPile.renderZ
									- Class145.anInt1381, objectPile.bitPacked, i_29_, null);
						}
						if (objectPile.thirdItemModel != null) {
							objectPile.thirdItemModel.render(0, Class69_Sub2.anInt2239, ObjectContainer.anInt2616, Class120_Sub12_Sub30.anInt3377, MapFunctionType.anInt637, objectPile.renderX - DisplayModeInfo.anInt1713, objectPile.renderY - PlayerAppearance.anInt1367 - objectPile.yLocationModifier, objectPile.renderZ
									- Class145.anInt1381, objectPile.bitPacked, i_29_, null);
						}
						if (objectPile.mainItemModel != null) {
							objectPile.mainItemModel.render(0, Class69_Sub2.anInt2239, ObjectContainer.anInt2616, Class120_Sub12_Sub30.anInt3377, MapFunctionType.anInt637, objectPile.renderX - DisplayModeInfo.anInt1713, objectPile.renderY - PlayerAppearance.anInt1367 - objectPile.yLocationModifier, objectPile.renderZ
									- Class145.anInt1381, objectPile.bitPacked, i_29_, null);
						}
					}
					if (class120_sub18_27_.anInt2646 != 0) {
						final WallDecoration class186 = class120_sub18_27_.wallDecoration;
						if (class186 != null && !Js5Worker.method363(i_30_, i, i_28_, class186.aClass180_1901.getMaxY())) {
							if ((class186.anInt1895 & class120_sub18_27_.anInt2646) != 0) {
								if (HDToolkit.glEnabled) {
									LightManager.method1861(DisplayModeInfo.anInt1713, PlayerAppearance.anInt1367, Class145.anInt1381, i_29_, i, i_28_);
								}
								class186.aClass180_1901.render(0, Class69_Sub2.anInt2239, ObjectContainer.anInt2616, Class120_Sub12_Sub30.anInt3377, MapFunctionType.anInt637, class186.renderX - DisplayModeInfo.anInt1713 + class186.anInt1905, class186.renderY - PlayerAppearance.anInt1367, class186.renderZ
										- Class145.anInt1381 + class186.anInt1892, class186.bitPacked, i_29_, null);
							} else if (class186.anInt1895 == 256) {
								final int i_119_ = class186.renderX - DisplayModeInfo.anInt1713;
								final int i_120_ = class186.renderY - PlayerAppearance.anInt1367;
								final int i_121_ = class186.renderZ - Class145.anInt1381;
								final int i_122_ = class186.anInt1896;
								int i_123_;
								if (i_122_ == 1 || i_122_ == 2) {
									i_123_ = -i_119_;
								} else {
									i_123_ = i_119_;
								}
								int i_124_;
								if (i_122_ == 2 || i_122_ == 3) {
									i_124_ = -i_121_;
								} else {
									i_124_ = i_121_;
								}
								if (i_124_ >= i_123_) {
									if (HDToolkit.glEnabled) {
										LightManager.method1861(DisplayModeInfo.anInt1713, PlayerAppearance.anInt1367, Class145.anInt1381, i_29_, i, i_28_);
									}
									class186.aClass180_1901.render(0, Class69_Sub2.anInt2239, ObjectContainer.anInt2616, Class120_Sub12_Sub30.anInt3377, MapFunctionType.anInt637, i_119_ + class186.anInt1905, i_120_, i_121_ + class186.anInt1892, class186.bitPacked, i_29_, null);
								} else if (class186.aClass180_1898 != null) {
									if (HDToolkit.glEnabled) {
										LightManager.method1861(DisplayModeInfo.anInt1713, PlayerAppearance.anInt1367, Class145.anInt1381, i_29_, i, i_28_);
									}
									class186.aClass180_1898.render(0, Class69_Sub2.anInt2239, ObjectContainer.anInt2616, Class120_Sub12_Sub30.anInt3377, MapFunctionType.anInt637, i_119_, i_120_, i_121_, class186.bitPacked, i_29_, null);
								}
							}
						}
						final WallLocation class182 = class120_sub18_27_.wallLocation;
						if (class182 != null) {
							if ((class182.anInt1792 & class120_sub18_27_.anInt2646) != 0 && !GameEntity.method2335(i_30_, i, i_28_, class182.anInt1792)) {
								if (HDToolkit.glEnabled) {
									LightManager.method1866(class182.anInt1792, DisplayModeInfo.anInt1713, PlayerAppearance.anInt1367, Class145.anInt1381, i_30_, i, i_28_);
								}
								class182.aClass180_1796.render(0, Class69_Sub2.anInt2239, ObjectContainer.anInt2616, Class120_Sub12_Sub30.anInt3377, MapFunctionType.anInt637, class182.renderX - DisplayModeInfo.anInt1713, class182.renderY - PlayerAppearance.anInt1367, class182.renderZ - Class145.anInt1381,
										class182.bitPackedUid, i_29_, null);
							}
							if ((class182.anInt1799 & class120_sub18_27_.anInt2646) != 0 && !GameEntity.method2335(i_30_, i, i_28_, class182.anInt1799)) {
								if (HDToolkit.glEnabled) {
									LightManager.method1866(class182.anInt1799, DisplayModeInfo.anInt1713, PlayerAppearance.anInt1367, Class145.anInt1381, i_30_, i, i_28_);
								}
								class182.aClass180_1800.render(0, Class69_Sub2.anInt2239, ObjectContainer.anInt2616, Class120_Sub12_Sub30.anInt3377, MapFunctionType.anInt637, class182.renderX - DisplayModeInfo.anInt1713, class182.renderY - PlayerAppearance.anInt1367, class182.renderZ - Class145.anInt1381,
										class182.bitPackedUid, i_29_, null);
							}
						}
					}
					if (i_29_ < MapSceneType.anInt1361 - 1) {
						final GroundTile class120_sub18_125_ = LabelGroup.groundTiles[i_29_ + 1][i][i_28_];
						if (class120_sub18_125_ != null && class120_sub18_125_.aBoolean2624) {
							AbstractTimer.aClass105_824.addLast(class120_sub18_125_);
						}
					}
					if (i < Class120_Sub12_Sub26.anInt3332) {
						final GroundTile class120_sub18_126_ = class120_sub18s[i + 1][i_28_];
						if (class120_sub18_126_ != null && class120_sub18_126_.aBoolean2624) {
							AbstractTimer.aClass105_824.addLast(class120_sub18_126_);
						}
					}
					if (i_28_ < Class112.anInt1080) {
						final GroundTile class120_sub18_127_ = class120_sub18s[i][i_28_ + 1];
						if (class120_sub18_127_ != null && class120_sub18_127_.aBoolean2624) {
							AbstractTimer.aClass105_824.addLast(class120_sub18_127_);
						}
					}
					if (i > Class120_Sub12_Sub26.anInt3332) {
						final GroundTile class120_sub18_128_ = class120_sub18s[i - 1][i_28_];
						if (class120_sub18_128_ != null && class120_sub18_128_.aBoolean2624) {
							AbstractTimer.aClass105_824.addLast(class120_sub18_128_);
						}
					}
					if (i_28_ > Class112.anInt1080) {
						final GroundTile class120_sub18_129_ = class120_sub18s[i][i_28_ - 1];
						if (class120_sub18_129_ != null && class120_sub18_129_.aBoolean2624) {
							AbstractTimer.aClass105_824.addLast(class120_sub18_129_);
						}
					}
				}
			}
		}
	}

	final boolean modelsDownloaded() {
		if (modelIds == null) {
			return true;
		}
		boolean bool_130_ = true;
		for (int id = 0; id < modelIds.length; id++) {
			if (!SceneGroundObject.aClass50_2839.requestDownload(modelIds[id], 0)) {
				bool_130_ = false;
			}
		}
		return bool_130_;
	}

	static final void animateInterfaces(final JagexInterface[] class189s, final int parent) {
		for (final JagexInterface jagexInterface : class189s) {
			if (jagexInterface != null && jagexInterface.parent == parent && (!jagexInterface.newFormat || !client.isHidden(jagexInterface))) {
				if (jagexInterface.type == 0) {
					if (!jagexInterface.newFormat && client.isHidden(jagexInterface) && CursorType.aClass189_1243 != jagexInterface) {
						continue;
					}
					animateInterfaces(class189s, jagexInterface.bitPacked);
					if (jagexInterface.components != null) {
						animateInterfaces(jagexInterface.components, jagexInterface.bitPacked);
					}
					final OverridedJInterface class120_sub26 = (OverridedJInterface) Class120_Sub12_Sub13.overridedInterfaces.get(jagexInterface.bitPacked);
					if (class120_sub26 != null) {
						AbstractGraphicsBuffer.animateInterface(class120_sub26.interfaceId);
					}
				}
				if (jagexInterface.type == 6) {
					if (jagexInterface.disabledAnim != -1 || jagexInterface.enabledAnim != -1) {
						final boolean enabled = Class120_Sub12_Sub35.isIntefaceEnabled(jagexInterface);
						int animation;
						if (enabled) {
							animation = jagexInterface.enabledAnim;
						} else {
							animation = jagexInterface.disabledAnim;
						}
						if (animation != -1) {
							final SeqType seqType = SeqType.list(animation);
							if (seqType != null) {
								jagexInterface.frameDelay += Class120_Sub12_Sub22.redrawRate;
								while (jagexInterface.frameDelay > seqType.delays[jagexInterface.currentFrame]) {
									jagexInterface.frameDelay -= seqType.delays[jagexInterface.currentFrame];
									jagexInterface.currentFrame++;
									if (jagexInterface.currentFrame >= seqType.frames.length) {
										jagexInterface.currentFrame -= seqType.padding;
										if (jagexInterface.currentFrame < 0 || jagexInterface.currentFrame >= seqType.frames.length) {
											jagexInterface.currentFrame = 0;
										}
									}
									jagexInterface.nextFrame = jagexInterface.currentFrame + 1;
									if (jagexInterface.nextFrame >= seqType.frames.length) {
										jagexInterface.nextFrame -= seqType.padding;
										if (jagexInterface.nextFrame < 0 || jagexInterface.nextFrame >= seqType.frames.length) {
											jagexInterface.nextFrame = -1;
										}
									}
									InterfaceClickMask.redrawInterface(jagexInterface);
								}
							}
						}
					}
					if (jagexInterface.rotateSpeed != 0 && !jagexInterface.newFormat) {
						int i_135_ = jagexInterface.rotateSpeed >> 16;
						i_135_ *= Class120_Sub12_Sub22.redrawRate;
						int i_136_ = jagexInterface.rotateSpeed << 16 >> 16;
						jagexInterface.rotateX = i_135_ + jagexInterface.rotateX & 0x7ff;
						i_136_ *= Class120_Sub12_Sub22.redrawRate;
						jagexInterface.rotateY = i_136_ + jagexInterface.rotateY & 0x7ff;
						InterfaceClickMask.redrawInterface(jagexInterface);
					}
				}
			}
		}
	}

	final void decode(final Buffer buffer) {
		for (;;) {
			final int code = buffer.getUByte();
			if (code == 0) {
				break;
			}
			decode(buffer, code);
		}
	}

	final boolean method1993() {
		boolean bool_137_ = true;
		for (int i_138_ = 0; i_138_ < 5; i_138_++) {
			if (headModelIds[i_138_] != -1 && !SceneGroundObject.aClass50_2839.requestDownload(headModelIds[i_138_], 0)) {
				bool_137_ = false;
			}
		}
		return bool_137_;
	}

	static final IdentityKit list(final int id) {
		IdentityKit identityKit = (IdentityKit) recentUse.get(id);
		if (identityKit != null) {
			return identityKit;
		}
		final byte[] data = configClient.getFile(3, id);
		identityKit = new IdentityKit();
		if (data != null) {
			identityKit.decode(new Buffer(data));
		}
		recentUse.put(identityKit, id);
		return identityKit;
	}

	public IdentityKit() {
		/* empty */
	}
}
