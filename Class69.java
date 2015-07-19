/* Class69 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Class69 {
	static int anInt614;
	static boolean loadingScreenOpened = true;
	static int rootInterfaceId;
	static int mouseButtons = 0;
	
	static {
		rootInterfaceId = -1;
	}

	static final void method612(final int interfaceX, final int interfaceY, final int interfaceWidth, final int interfaceHeight, final int i_0_, final int i_2_) {
		Class120_Sub12_Sub19.textOnScreenCount = 0;
		for (int id = -1; id < Class148.localNpcCount + FileSystemWorker.localPlayerCount; id++) {
			GameEntity gameEntity;
			if (id == -1) {
				gameEntity = TileParticleQueue.selfPlayer;
			} else if (id < FileSystemWorker.localPlayerCount) {
				gameEntity = Class118.playersList[Class112.playerIndices[id]];
			} else {
				gameEntity = Class120_Sub12_Sub11.npcList[Class120_Sub12_Sub36.npcIndices[id - FileSystemWorker.localPlayerCount]];
			}
			if (gameEntity != null && gameEntity.isVisible()) {
				if (gameEntity instanceof Npc) {
					NpcType npcType = ((Npc) gameEntity).npcType;
					if (npcType.transmogrificationIds != null) {
						npcType = npcType.handleVarp();
					}
					if (npcType == null) {
						continue;
					}
				}
				if (id >= FileSystemWorker.localPlayerCount) {
					NpcType npcType = ((Npc) gameEntity).npcType;
					if (npcType.transmogrificationIds != null) {
						npcType = npcType.handleVarp();
					}
					if (npcType.headIcon >= 0 && npcType.headIcon < FileSystemRequest.prayerIconSprites.length) {
						int y;
						if (npcType.iconHeight == -1) {
							y = gameEntity.getHeight() + 15;
						} else {
							y = npcType.iconHeight + 15;
						}
						UnderlayType.worldToScreenEntity(gameEntity, interfaceWidth >> 1, y, interfaceHeight >> 1, i_2_, i_0_);
						if (Class120_Sub12_Sub38.screenX > -1) {
							FileSystemRequest.prayerIconSprites[npcType.headIcon].drawReg(Class120_Sub12_Sub38.screenX + interfaceX - 12, Class120_Sub15.screenY + interfaceY - 30);
						}
					}
					final HintIcon[] hintIcons = Class187.hintIcons;
					for (final HintIcon hintIcon : hintIcons) {
						if (hintIcon != null && hintIcon.targetType == 1 && hintIcon.targetIndex == Class120_Sub12_Sub36.npcIndices[id - FileSystemWorker.localPlayerCount] && Class101_Sub2.loopCycle % 20 < 10) {
							int y;
							if (npcType.iconHeight == -1) {
								y = gameEntity.getHeight() + 15;
							} else {
								y = npcType.iconHeight + 15;
							}
							UnderlayType.worldToScreenEntity(gameEntity, interfaceWidth >> 1, y, interfaceHeight >> 1, i_2_, i_0_);
							if (Class120_Sub12_Sub38.screenX > -1) {
								AnimatedLocation.hintHeadIconsSprites[hintIcon.iconType].drawReg(Class120_Sub12_Sub38.screenX + interfaceX - 12, Class120_Sub15.screenY + interfaceY - 28);
							}
						}
					}
				} else {
					int yOff = 30;
					final Player player = (Player) gameEntity;
					if (player.pkIcon != -1 || player.prayerIcon != -1) {
						UnderlayType.worldToScreenEntity(gameEntity, interfaceWidth >> 1, gameEntity.getHeight() + 15, interfaceHeight >> 1, i_2_, i_0_);
						if (Class120_Sub12_Sub38.screenX > -1) {
							if (player.pkIcon != -1) {
								Class54.pkIconSprites[player.pkIcon].drawReg(Class120_Sub12_Sub38.screenX + interfaceX - 12, Class120_Sub15.screenY + interfaceY - yOff);
								yOff += 25;
							}
							if (player.prayerIcon != -1) {
								FileSystemRequest.prayerIconSprites[player.prayerIcon].drawReg(Class120_Sub12_Sub38.screenX + interfaceX - 12, Class120_Sub15.screenY + interfaceY - yOff);
								yOff += 25;
							}
						}
					}
					if (id >= 0) {
						final HintIcon[] hintIcons = Class187.hintIcons;
						for (final HintIcon hintIcon : hintIcons) {
							if (hintIcon != null && hintIcon.targetType == 10 && Class112.playerIndices[id] == hintIcon.targetIndex) {
								UnderlayType.worldToScreenEntity(gameEntity, interfaceWidth >> 1, gameEntity.getHeight() + 15, interfaceHeight >> 1, i_2_, i_0_);
								if (Class120_Sub12_Sub38.screenX > -1) {
									AnimatedLocation.hintHeadIconsSprites[hintIcon.iconType].drawReg(Class120_Sub12_Sub38.screenX + interfaceX - 12, Class120_Sub15.screenY + interfaceY - yOff);
								}
							}
						}
					}
				}
				if (gameEntity.textSpoken != null && (id >= FileSystemWorker.localPlayerCount || Class69_Sub3_Sub1.publicChatSetting == 0 || Class69_Sub3_Sub1.publicChatSetting == 3 || Class69_Sub3_Sub1.publicChatSetting == 1 && SpotAnimType.isFriendOrSelf(((Player) gameEntity).name))) {
					UnderlayType.worldToScreenEntity(gameEntity, interfaceWidth >> 1, gameEntity.getHeight(), interfaceHeight >> 1, i_2_, i_0_);
					if (Class120_Sub12_Sub38.screenX > -1 && Class120_Sub12_Sub19.textOnScreenCount < AbstractGraphicsBuffer.maxTextOnScreen) {
						AbstractGraphicsBuffer.anIntArray1162[Class120_Sub12_Sub19.textOnScreenCount] = Class120_Sub12_Sub22.boldFont.method1459(gameEntity.textSpoken) / 2;
						AbstractGraphicsBuffer.anIntArray1158[Class120_Sub12_Sub19.textOnScreenCount] = Class120_Sub12_Sub22.boldFont.yOff;
						AbstractGraphicsBuffer.anIntArray1161[Class120_Sub12_Sub19.textOnScreenCount] = Class120_Sub12_Sub38.screenX;
						AbstractGraphicsBuffer.anIntArray1171[Class120_Sub12_Sub19.textOnScreenCount] = Class120_Sub15.screenY;
						AbstractGraphicsBuffer.anIntArray1159[Class120_Sub12_Sub19.textOnScreenCount] = gameEntity.textColor;
						AbstractGraphicsBuffer.anIntArray1156[Class120_Sub12_Sub19.textOnScreenCount] = gameEntity.textEffect;
						AbstractGraphicsBuffer.anIntArray1163[Class120_Sub12_Sub19.textOnScreenCount] = gameEntity.textCycle;
						AbstractGraphicsBuffer.aStringArray1167[Class120_Sub12_Sub19.textOnScreenCount] = gameEntity.textSpoken;
						Class120_Sub12_Sub19.textOnScreenCount++;
					}
				}
				if (Class101_Sub2.loopCycle < gameEntity.hpBarCycle) {
					AbstractSprite redBar = SeqType.hitBarDefaultSprites[0];
					AbstractSprite greenBar = SeqType.hitBarDefaultSprites[1];
					int height;
					if (gameEntity instanceof Npc) {
						final Npc npc = (Npc) gameEntity;
						AbstractSprite[] hitBarSprites = (AbstractSprite[]) Class120_Sub12_Sub2.hitBarSpriteCache.get(npc.npcType.hitBarSpriteId);
						if (hitBarSprites == null) {
							hitBarSprites = Class125.constructTransparentSprites(client.spritesJs5, npc.npcType.hitBarSpriteId, 0);
							if (hitBarSprites != null) {
								Class120_Sub12_Sub2.hitBarSpriteCache.put(hitBarSprites, npc.npcType.hitBarSpriteId);
							}
						}
						if (hitBarSprites != null && hitBarSprites.length == 2) {
							redBar = hitBarSprites[0];
							greenBar = hitBarSprites[1];
						}
						final NpcType npcType = npc.npcType;
						if (npcType.iconHeight != -1) {
							height = npcType.iconHeight;
						} else {
							height = gameEntity.getHeight();
						}
					} else {
						height = gameEntity.getHeight();
					}
					UnderlayType.worldToScreenEntity(gameEntity, interfaceWidth >> 1, redBar.height + height + 10, interfaceHeight >> 1, i_2_, i_0_);
					if (Class120_Sub12_Sub38.screenX > -1) {
						final int barX = Class120_Sub12_Sub38.screenX + interfaceX - (redBar.width >> 1);
						final int barY = Class120_Sub15.screenY + interfaceY - 3;
						redBar.drawReg(barX, barY);
						final int barWidth = gameEntity.hpBarRatio * redBar.width / 255;
						final int barHeight = redBar.height;
						if (!HDToolkit.glEnabled) {
							GraphicsLD.setBounds(barX, barY, barX + barWidth, barY + barHeight);
						} else {
							GraphicsHD.setBounds(barX, barY, barX + barWidth, barY + barHeight);
						}
						greenBar.drawReg(barX, barY);
						if (HDToolkit.glEnabled) {
							GraphicsHD.clipRect(interfaceX, interfaceY, interfaceWidth + interfaceX, interfaceHeight + interfaceY);
						} else {
							GraphicsLD.clipRect(interfaceX, interfaceY, interfaceWidth + interfaceX, interfaceHeight + interfaceY);
						}
					}
				}
				for (int i = 0; i < 4; i++) {
					if (gameEntity.hitsCycle[i] > Class101_Sub2.loopCycle) {
						int height;
						if (gameEntity instanceof Npc) {
							final Npc npc = (Npc) gameEntity;
							final NpcType npcType = npc.npcType;
							if (npcType.iconHeight == -1) {
								height = gameEntity.getHeight() / 2;
							} else {
								height = npcType.iconHeight / 2;
							}
						} else {
							height = gameEntity.getHeight() / 2;
						}
						UnderlayType.worldToScreenEntity(gameEntity, interfaceWidth >> 1, height, interfaceHeight >> 1, i_2_, i_0_);
						if (Class120_Sub12_Sub38.screenX > -1) {
							if (i == 1) {
								Class120_Sub15.screenY -= 20;
							}
							if (i == 2) {
								Class120_Sub15.screenY -= 10;
								Class120_Sub12_Sub38.screenX -= 15;
							}
							if (i == 3) {
								Class120_Sub12_Sub38.screenX += 15;
								Class120_Sub15.screenY -= 10;
							}
							Class69_Sub2.hitMarkSprites[gameEntity.hitsType[i]].drawReg(interfaceX + Class120_Sub12_Sub38.screenX - 12, interfaceY + Class120_Sub15.screenY - 12);
							ObjectCache.smallFont.method1478(Integer.toString(gameEntity.hitsValue[i]), interfaceX + Class120_Sub12_Sub38.screenX - 1, interfaceY + Class120_Sub15.screenY + 3, 16777215, 0);
						}
					}
				}
			}
		}
		for (int id = 0; id < Class120_Sub12_Sub19.textOnScreenCount; id++) {
			int i_6_ = AbstractGraphicsBuffer.anIntArray1161[id];
			int i_24_ = AbstractGraphicsBuffer.anIntArray1171[id];
			final int i_25_ = AbstractGraphicsBuffer.anIntArray1162[id];
			final int i_26_ = AbstractGraphicsBuffer.anIntArray1158[id];
			boolean bool = true;
			while (bool) {
				bool = false;
				for (int i_27_ = 0; id > i_27_; i_27_++) {
					if (AbstractGraphicsBuffer.anIntArray1171[i_27_] - AbstractGraphicsBuffer.anIntArray1158[i_27_] < i_24_ - -2 && -i_26_ + i_24_ < 2 + AbstractGraphicsBuffer.anIntArray1171[i_27_] && i_6_ + -i_25_ < AbstractGraphicsBuffer.anIntArray1162[i_27_] + AbstractGraphicsBuffer.anIntArray1161[i_27_] && i_6_ + i_25_ > AbstractGraphicsBuffer.anIntArray1161[i_27_] - AbstractGraphicsBuffer.anIntArray1162[i_27_] && i_24_ > -AbstractGraphicsBuffer.anIntArray1158[i_27_] + AbstractGraphicsBuffer.anIntArray1171[i_27_]) {
						bool = true;
						i_24_ = -AbstractGraphicsBuffer.anIntArray1158[i_27_] + AbstractGraphicsBuffer.anIntArray1171[i_27_];
					}
				}
			}
			Class120_Sub12_Sub38.screenX = AbstractGraphicsBuffer.anIntArray1161[id];
			Class120_Sub15.screenY = AbstractGraphicsBuffer.anIntArray1171[id] = i_24_;
			final String string = AbstractGraphicsBuffer.aStringArray1167[id];
			if (Player.chatEffectsEnabled != 0) {
				Class120_Sub12_Sub22.boldFont.method1478(string, Class120_Sub12_Sub38.screenX + interfaceX, Class120_Sub15.screenY + interfaceY, 16776960, 0);
			} else {
				int i_28_ = 16776960;
				if (AbstractGraphicsBuffer.anIntArray1159[id] < 6) {
					i_28_ = SpotAnimType.anIntArray987[AbstractGraphicsBuffer.anIntArray1159[id]];
				}
				if (AbstractGraphicsBuffer.anIntArray1159[id] == 6) {
					i_28_ = InterfaceChangeNode.anInt3490 % 20 >= 10 ? 16776960 : 16711680;
				}
				if (AbstractGraphicsBuffer.anIntArray1159[id] == 7) {
					i_28_ = InterfaceChangeNode.anInt3490 % 20 < 10 ? 255 : 65535;
				}
				if (AbstractGraphicsBuffer.anIntArray1159[id] == 8) {
					i_28_ = InterfaceChangeNode.anInt3490 % 20 < 10 ? 45056 : 8454016;
				}
				if (AbstractGraphicsBuffer.anIntArray1159[id] == 9) {
					final int i_29_ = -AbstractGraphicsBuffer.anIntArray1163[id] + 150;
					if (i_29_ < 50) {
						i_28_ = i_29_ * 1280 + 16711680;
					} else if (i_29_ >= 100) {
						if (i_29_ < 150) {
							i_28_ = 65280 - (500 + -(5 * i_29_));
						}
					} else {
						i_28_ = 16776960 + -((i_29_ + -50) * 327680);
					}
				}
				if (AbstractGraphicsBuffer.anIntArray1159[id] == 10) {
					final int i_30_ = -AbstractGraphicsBuffer.anIntArray1163[id] + 150;
					if (i_30_ >= 50) {
						if (i_30_ < 100) {
							i_28_ = 16711935 + -((i_30_ + -50) * 327680);
						} else if (i_30_ < 150) {
							i_28_ = 500 + -(5 * i_30_) + (i_30_ - 100) * 327680 + 255;
						}
					} else {
						i_28_ = 16711680 - -(5 * i_30_);
					}
				}
				if (AbstractGraphicsBuffer.anIntArray1159[id] == 11) {
					final int i_31_ = 150 + -AbstractGraphicsBuffer.anIntArray1163[id];
					if (i_31_ >= 50) {
						if (i_31_ >= 100) {
							if (i_31_ < 150) {
								i_28_ = 32768000 + -(327680 * i_31_) + 16777215;
							}
						} else {
							i_28_ = 327685 * (i_31_ + -50) + 65280;
						}
					} else {
						i_28_ = -(327685 * i_31_) + 16777215;
					}
				}
				if (AbstractGraphicsBuffer.anIntArray1156[id] == 0) {
					Class120_Sub12_Sub22.boldFont.method1478(string, interfaceX + Class120_Sub12_Sub38.screenX, interfaceY - -Class120_Sub15.screenY, i_28_, 0);
				}
				if (AbstractGraphicsBuffer.anIntArray1156[id] == 1) {
					Class120_Sub12_Sub22.boldFont.method1469(string, Class120_Sub12_Sub38.screenX + interfaceX, interfaceY - -Class120_Sub15.screenY, i_28_, 0, InterfaceChangeNode.anInt3490);
				}
				if (AbstractGraphicsBuffer.anIntArray1156[id] == 2) {
					Class120_Sub12_Sub22.boldFont.method1463(string, Class120_Sub12_Sub38.screenX + interfaceX, Class120_Sub15.screenY + interfaceY, i_28_, 0, InterfaceChangeNode.anInt3490);
				}
				if (AbstractGraphicsBuffer.anIntArray1156[id] == 3) {
					Class120_Sub12_Sub22.boldFont.method1473(string, interfaceX - -Class120_Sub12_Sub38.screenX, Class120_Sub15.screenY + interfaceY, i_28_, 0, InterfaceChangeNode.anInt3490, 150 + -AbstractGraphicsBuffer.anIntArray1163[id]);
				}
				if (AbstractGraphicsBuffer.anIntArray1156[id] == 4) {
					final int i_32_ = (-AbstractGraphicsBuffer.anIntArray1163[id] + 150) * (Class120_Sub12_Sub22.boldFont.method1459(string) - -100) / 150;
					if (!HDToolkit.glEnabled) {
						GraphicsLD.setBounds(-50 + interfaceX - -Class120_Sub12_Sub38.screenX, interfaceY, Class120_Sub12_Sub38.screenX + interfaceX - -50, interfaceHeight + interfaceY);
					} else {
						GraphicsHD.setBounds(Class120_Sub12_Sub38.screenX + interfaceX - 50, interfaceY, 50 + interfaceX - -Class120_Sub12_Sub38.screenX, interfaceY - -interfaceHeight);
					}
					Class120_Sub12_Sub22.boldFont.method1466(string, -i_32_ + Class120_Sub12_Sub38.screenX + interfaceX - -50, interfaceY - -Class120_Sub15.screenY, i_28_, 0);
					if (!HDToolkit.glEnabled) {
						GraphicsLD.clipRect(interfaceX, interfaceY, interfaceX + interfaceWidth, interfaceY - -interfaceHeight);
					} else {
						GraphicsHD.clipRect(interfaceX, interfaceY, interfaceWidth + interfaceX, interfaceY - -interfaceHeight);
					}
				}
				if (AbstractGraphicsBuffer.anIntArray1156[id] == 5) {
					int i_33_ = 0;
					final int i_34_ = 150 + -AbstractGraphicsBuffer.anIntArray1163[id];
					if (!HDToolkit.glEnabled) {
						GraphicsLD.setBounds(interfaceX, -Class120_Sub12_Sub22.boldFont.yOff + Class120_Sub15.screenY + interfaceY - 1, interfaceWidth + interfaceX, 5 + interfaceY - -Class120_Sub15.screenY);
					} else {
						GraphicsHD.setBounds(interfaceX, -1 + Class120_Sub15.screenY + interfaceY - Class120_Sub12_Sub22.boldFont.yOff, interfaceX - -interfaceWidth, Class120_Sub15.screenY + interfaceY + 5);
					}
					if (i_34_ >= 25) {
						if (i_34_ > 125) {
							i_33_ = i_34_ - 125;
						}
					} else {
						i_33_ = i_34_ - 25;
					}
					Class120_Sub12_Sub22.boldFont.method1478(string, Class120_Sub12_Sub38.screenX + interfaceX, i_33_ + Class120_Sub15.screenY + interfaceY, i_28_, 0);
					if (HDToolkit.glEnabled) {
						GraphicsHD.clipRect(interfaceX, interfaceY, interfaceX + interfaceWidth, interfaceY - -interfaceHeight);
					} else {
						GraphicsLD.clipRect(interfaceX, interfaceY, interfaceX - -interfaceWidth, interfaceY + interfaceHeight);
					}
				}
			}
		}
	}

	static final void method613() {
		Class101_Sub2.gameShellTimer.method738();
		for (int id = 0; id < 32; id++) {
			GameShell.mainRedrawCache[id] = 0L;
		}
		for (int id = 0; id < 32; id++) {
			Class120_Sub12_Sub26.mainLoopTimeCache[id] = 0L;
		}
		Class112.gameLoopCount = 0;
	}

	static final void method614(final int i) {
		Class120_Sub15.aFloatArray2596[0] = (i >> 16 & 0xff) / 255.0F;
		Class120_Sub15.aFloatArray2596[1] = (i >> 8 & 0xff) / 255.0F;
		Class120_Sub15.aFloatArray2596[2] = (i & 0xff) / 255.0F;
		Class120_Sub12_Sub31.method1364(3);
		Class120_Sub12_Sub31.method1364(4);
	}

	static final void method616(final int i_37_, final int i_38_, final int i_39_, final int i_40_) {
		Identikit.anInt1334 = i_39_;
		ParamType.anInt3544 = i_40_;
		Class120_Sub30_Sub2.anInt3699 = i_37_;
		MagnetType.anInt260 = i_38_;
	}
}
