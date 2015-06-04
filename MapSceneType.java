/* Class142 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class MapSceneType {
	boolean enlarge = false;//Not sure TODO 
	int anInt1360;
	static int activeGroundTileLength;
	static JagexInterface worldMapInterface;
	int spriteId;
	static js5 configClient;
	static js5 spriteJs5;
	static ObjectCache spriteCache = new ObjectCache(64);
	static ObjectCache recentUse = new ObjectCache(64);

	static final void method2004(int i_0_, final int i_1_) {
		final VarBit varBit = VarBit.list(i_1_);
		final int i_2_ = varBit.setting;
		final int i_3_ = varBit.startBit;
		final int i_4_ = varBit.endBit;
		int i_5_ = Class120_Sub14_Sub15.masklookup[i_4_ - i_3_];
		if (i_0_ < 0 || i_0_ > i_5_) {
			i_0_ = 0;
		}
		i_5_ <<= i_3_;
		FileSystemRequest.method1544(i_2_, i_0_ << i_3_ & i_5_ | (i_5_ ^ 0xffffffff) & Class30.anIntArray239[i_2_]);
	}

	static final void method2005() {
		try {
			if (Class120_Sub12_Sub25.anInt3312 == 1) {
				int i_6_ = Class30.aClass120_Sub30_Sub2_234.method1757();
				if (i_6_ > 0 && Class30.aClass120_Sub30_Sub2_234.method1766()) {
					i_6_ -= Class69.anInt614;
					if (i_6_ < 0) {
						i_6_ = 0;
					}
					Class30.aClass120_Sub30_Sub2_234.method1748(i_6_);
				} else {
					Class30.aClass120_Sub30_Sub2_234.method1770();
					Class30.aClass120_Sub30_Sub2_234.method1753();
					if (MasterIndexInfo.aClass50_476 != null) {
						Class120_Sub12_Sub25.anInt3312 = 2;
					} else {
						Class120_Sub12_Sub25.anInt3312 = 0;
					}
					Js5Request.aClass120_Sub31_3941 = null;
					Normal.aClass90_163 = null;
				}
			}
		} catch (final Exception exception) {
			exception.printStackTrace();
			Class30.aClass120_Sub30_Sub2_234.method1770();
			Js5Request.aClass120_Sub31_3941 = null;
			MasterIndexInfo.aClass50_476 = null;
			Normal.aClass90_163 = null;
			Class120_Sub12_Sub25.anInt3312 = 0;
		}
	}

	private final void decode(final Buffer buffer, final int code) {
		if (code == 1) {
			this.spriteId = buffer.getUShort();
		} else if (code == 2) {
			this.anInt1360 = buffer.getMedium();
		} else if (code == 3) {
			this.enlarge = true;
		} else if (code == 4) {
			this.spriteId = -1;
		}
	}

	static final void sendAccountDetails(final String email, final String password, final int day, final int country, final int month, final int year, final long nameAsLong, final boolean bool, final boolean runescapeDontReceiveNewsLetters, final boolean dontReceiveNewsLetters) {
		final int[] xteaKeys = new int[4];
		for (int id = 0; id < 3; id++) {
			xteaKeys[id] = (int) (Math.random() * 9.9999999E7);
		}
		final Buffer informationBuffer = new Buffer(128);
		informationBuffer.putByte(10);
		informationBuffer.putShort((runescapeDontReceiveNewsLetters ? 1 : 0) | (dontReceiveNewsLetters ? 2 : 0) | (bool ? 4 : 0));
		informationBuffer.putLong(nameAsLong);
		informationBuffer.putInt(xteaKeys[0]);
		informationBuffer.putJagexString(password);
		informationBuffer.putInt(xteaKeys[1]);
		informationBuffer.putShort(Class120_Sub12_Sub33.affiliateId);
		informationBuffer.putByte(day);
		informationBuffer.putByte(month);
		informationBuffer.putInt(xteaKeys[2]);
		informationBuffer.putShort(year);
		informationBuffer.putShort(country);
		informationBuffer.putInt(xteaKeys[3]);
		informationBuffer.encryptRsa(JagexSocket.aBigInteger415, KeyboardHandler.aBigInteger1505);
		final Buffer emailBuffer = new Buffer(350);
		emailBuffer.putJagexString(email);
		final int i_18_ = 8 - (Class69_Sub2_Sub1.getLengthPlusOne(email) % 8);
		for (int i_19_ = 0; i_19_ < i_18_; i_19_++) {
			emailBuffer.putByte((int) (Math.random() * 255.0));
		}
		emailBuffer.encryptXTEA(xteaKeys);
		Class120_Sub12_Sub11.outputStream.pos = 0;
		Class120_Sub12_Sub11.outputStream.putByte(22);
		Class120_Sub12_Sub11.outputStream.putShort(emailBuffer.pos + informationBuffer.pos + 2);
		Class120_Sub12_Sub11.outputStream.putShort(550);
		Class120_Sub12_Sub11.outputStream.putBuffer(informationBuffer.buf, 0, informationBuffer.pos);
		Class120_Sub12_Sub11.outputStream.putBuffer(emailBuffer.buf, 0, emailBuffer.pos);
		Class120_Sub12_Sub35.accountCreationReturnCode = -3;
		SpotAnimationNode.anInt3466 = 0;
		AbstractIndexedSprite.anInt1027 = 0;
		Class154.accountCreationStep = 1;
	}

	static final void method2008(final JagexInterface[] class189s, final int i, final int i_20_, final int i_22_, final int i_23_, final int i_24_, final int i_25_, final int i_26_, final int i_27_) {
		if (!HDToolkit.glEnabled) {
			GraphicsLD.clipRect(i_27_, i_25_, i_24_, i_23_);
			Rasterizer.calculateByBounds();
		} else {
			GraphicsHD.clipRect(i_27_, i_25_, i_24_, i_23_);
		}
		for (int i_28_ = 0; i_28_ < class189s.length; i_28_++) {
			final JagexInterface jagexInterface = class189s[i_28_];
			if (jagexInterface != null && (i_20_ == jagexInterface.parent || i_20_ == -1412584499 && jagexInterface == Class120_Sub12_Sub4.draggedComponent)) {
				int redrawId;
				if (i_22_ == -1) {
					GrandExchangeObject.screenRedrawXs[LabelGroup.screenRedrawPos] = jagexInterface.x + i;
					Class120_Sub12_Sub38.screenRedrawYs[LabelGroup.screenRedrawPos] = jagexInterface.y + i_26_;
					Class120_Sub16.screenRedrawWidhts[LabelGroup.screenRedrawPos] = jagexInterface.width;
					Class69_Sub3_Sub1.screenRedrawHeights[LabelGroup.screenRedrawPos] = jagexInterface.height;
					redrawId = LabelGroup.screenRedrawPos++;
				} else {
					redrawId = i_22_;
				}
				jagexInterface.redrawCycle = Class101_Sub2.loopCycle;
				jagexInterface.redrawId = redrawId;
				if (!jagexInterface.newFormat || !client.isHidden(jagexInterface)) {
					if (jagexInterface.clientCode > 0) {
						Class143_Sub1.method2032(jagexInterface);
					}
					int drawX = jagexInterface.x + i;
					int drawY = jagexInterface.y + i_26_;
					int alpha = jagexInterface.alpha;
					if (Class120_Sub30_Sub1.qaOpTestEnabled && (client.getClickMask(jagexInterface).optionMask != 0 || jagexInterface.type == 0) && alpha > 127) {
						alpha = 127;
					}
					if (jagexInterface == Class120_Sub12_Sub4.draggedComponent) {
						if (i_20_ != -1412584499 && !jagexInterface.keepDragAlpha) {
							Class120_Sub12_Sub38.anInt3438 = i;
							Class111.anInt1065 = i_26_;
							AbstractIndexedSprite.aClass189Array1022 = class189s;
							continue;
						}
						if (!jagexInterface.keepDragAlpha) {
							alpha = 128;
						}
						if (Class120_Sub11.draggingComponent && Class111.aBoolean1058) {
							int newComponentX = Queue.lastMouseX;
							newComponentX -= AbstractGraphicsBuffer.clickedComponentX;
							int newComponentY = ChunkAtmosphere.lastMouseY;
							newComponentY -= client.clickedComponentY;
							if (newComponentX < Class120_Sub12_Sub7.anInt3183) {
								newComponentX = Class120_Sub12_Sub7.anInt3183;
							}
							if (newComponentY < Class120_Sub12_Sub35.anInt3413) {
								newComponentY = Class120_Sub12_Sub35.anInt3413;
							}
							if (newComponentX + jagexInterface.width > Normal.aClass189_161.width + Class120_Sub12_Sub7.anInt3183) {
								newComponentX = Normal.aClass189_161.width - jagexInterface.width + Class120_Sub12_Sub7.anInt3183;
							}
							if (newComponentY + jagexInterface.height > Class120_Sub12_Sub35.anInt3413 + Normal.aClass189_161.height) {
								newComponentY = Normal.aClass189_161.height - jagexInterface.height + Class120_Sub12_Sub35.anInt3413;
							}
							drawX = newComponentX;
							drawY = newComponentY;
						}
					}
					int i_35_;
					int i_36_;
					int i_37_;
					int i_38_;
					if (jagexInterface.type != 2) {
						i_35_ = i_25_ < drawY ? drawY : i_25_;
						i_37_ = drawX <= i_27_ ? i_27_ : drawX;
						int i_39_ = drawX + jagexInterface.width;
						int i_40_ = drawY + jagexInterface.height;
						if (jagexInterface.type == 9) {
							i_39_++;
							i_40_++;
						}
						i_38_ = i_40_ >= i_23_ ? i_23_ : i_40_;
						i_36_ = i_39_ >= i_24_ ? i_24_ : i_39_;
					} else {
						i_35_ = i_25_;
						i_36_ = i_24_;
						i_37_ = i_27_;
						i_38_ = i_23_;
					}
					if (!jagexInterface.newFormat || i_37_ < i_36_ && i_38_ > i_35_) {
						if (jagexInterface.clientCode != 0) {
							if (jagexInterface.clientCode == 1337 || jagexInterface.clientCode == 1403) {
								LookupTable.gameScreenDrawX = drawX;
								StructType.gameScreenDrawY = drawY;
								DummyInputStream.gameScreenInterface = jagexInterface;
								StringNode.method1721(drawX, drawY, jagexInterface.width, jagexInterface.height, jagexInterface.clientCode == 1403);
								MasterIndexInfo.needInterfaceRedrawWrapper[redrawId] = true;
								if (HDToolkit.glEnabled) {
									GraphicsHD.clipRect(i_27_, i_25_, i_24_, i_23_);
								} else {
									GraphicsLD.clipRect(i_27_, i_25_, i_24_, i_23_);
								}
								continue;
							}
							if (jagexInterface.clientCode == 1338) {
								if (jagexInterface.calculatedSpriteVars()) {
									Class164.drawMinimapContents(jagexInterface, drawX, drawY, redrawId);
									if (!HDToolkit.glEnabled) {
										GraphicsLD.clipRect(i_27_, i_25_, i_24_, i_23_);
									} else {
										GraphicsHD.clipRect(i_27_, i_25_, i_24_, i_23_);
									}
									if ((AbstractGraphicsBuffer.mapbackState == 0 || AbstractGraphicsBuffer.mapbackState == 3) && !Class15.menuOpen && Class115.menuMouseX >= i_37_ && i_35_ <= Class120_Sub12_Sub21.menuMouseY && i_36_ > Class115.menuMouseX && Class120_Sub12_Sub21.menuMouseY < i_38_) {
										int mouseAtPixelX = Class115.menuMouseX - drawX;
										int mouseAtPixelY = Class120_Sub12_Sub21.menuMouseY - drawY;
										final int spriteStartX = jagexInterface.startOfSpriteLookupTable[mouseAtPixelY];
										if (spriteStartX <= mouseAtPixelX && jagexInterface.lengthOfSpriteLookupTable[mouseAtPixelY] + spriteStartX >= mouseAtPixelX) {
											mouseAtPixelX -= jagexInterface.width / 2;
											mouseAtPixelY -= jagexInterface.height / 2;
											final int rotation = (int) DummyOutputStream.cameraYaw & 0x7ff;
											int sinRot = Rasterizer.sinTable[rotation];
											int cosRot = Rasterizer.cosTable[rotation];
											final int offX = sinRot * mouseAtPixelY + mouseAtPixelX * cosRot >> 11;
											final int offY = cosRot * mouseAtPixelY - mouseAtPixelX * sinRot >> 11;
											final int mouseAtX = TileParticleQueue.selfPlayer.x + (offX - (64 * TileParticleQueue.selfPlayer.getSize())) + 64 >> 7;
											final int mouseAtY = TileParticleQueue.selfPlayer.z - (offY + (64 * TileParticleQueue.selfPlayer.getSize())) + 64 >> 7;
											if (Class88.spellSelected && (GroundTile.selectedSpellUseMask & 0x40) != 0) {
												final JagexInterface class189_51_ = JagexInterface.getComponent(AbstractMouseWheelHandler.selectedSpellInterfaceBitPacked, JagexSocket.selectedSpellComponextIndex);
												if (class189_51_ != null) {
													InvType.addMenuOption(Class101.selectedSpellPrefix, " ->", 1L, mouseAtX, mouseAtY, (short) 19, Class150.selectedSpellTargetCursor);
												} else {
													Node.deselectSpell();
												}
											} else {
												if (Buffer.gameId == 1) {
													InvType.addMenuOption(StringLibrary.faceHere, "", 1L, mouseAtX, mouseAtY, (short) 47, -1);
												}
												InvType.addMenuOption(StringLibrary.walkText, "", 1L, mouseAtX, mouseAtY, (short) 26, -1);
											}
										}
									}
								}
								continue;
							}
							if (jagexInterface.clientCode == 1339) {
								if (jagexInterface.calculatedSpriteVars()) {
									Decimator.drawCompassContents(jagexInterface, drawX, drawY, redrawId);
									if (HDToolkit.glEnabled) {
										GraphicsHD.clipRect(i_27_, i_25_, i_24_, i_23_);
									} else {
										GraphicsLD.clipRect(i_27_, i_25_, i_24_, i_23_);
									}
								}
								continue;
							}
							if (jagexInterface.clientCode == 1400) {
								Class82.drawWorldMapInterface(drawX, drawY, jagexInterface.width, jagexInterface.height);
								MasterIndexInfo.needInterfaceRedrawWrapper[redrawId] = true;
								Class120_Sub12_Sub33.needScreenRedraw[redrawId] = true;
								if (!HDToolkit.glEnabled) {
									GraphicsLD.clipRect(i_27_, i_25_, i_24_, i_23_);
								} else {
									GraphicsHD.clipRect(i_27_, i_25_, i_24_, i_23_);
								}
								continue;
							}
							if (jagexInterface.clientCode == 1401) {
								WallDecoration.method2473(drawX, drawY, jagexInterface.width, jagexInterface.height);
								MasterIndexInfo.needInterfaceRedrawWrapper[redrawId] = true;
								Class120_Sub12_Sub33.needScreenRedraw[redrawId] = true;
								if (!HDToolkit.glEnabled) {
									GraphicsLD.clipRect(i_27_, i_25_, i_24_, i_23_);
								} else {
									GraphicsHD.clipRect(i_27_, i_25_, i_24_, i_23_);
								}
								continue;
							}
							if (jagexInterface.clientCode == 1402) {
								if (!HDToolkit.glEnabled) {
									EmitterType.method699(drawX, drawY);
									MasterIndexInfo.needInterfaceRedrawWrapper[redrawId] = true;
									Class120_Sub12_Sub33.needScreenRedraw[redrawId] = true;
								}
								continue;
							}
							if (jagexInterface.clientCode == 1405) {
								if (HintIcon.showFps) {
									final int textX = drawX + jagexInterface.width;
									int textY = drawY + 15;
									Class120_Sub12_Sub20.plainFont.method1482("Fps:" + MapFunctionType.fps, textX, textY, 16776960, -1);
									final Runtime runtime = Runtime.getRuntime();
									textY += 15;
									final int memory = (int) ((runtime.totalMemory() - runtime.freeMemory()) / 1024L);
									int textColor = 16776960;
									if (memory > 65536) {
										textColor = 16711680;
									}
									Class120_Sub12_Sub20.plainFont.method1482("Mem:" + memory + "k", textX, textY, textColor, -1);
									textY += 15;
									if (HDToolkit.glEnabled) {
										textColor = 16776960;
										final int cardMemory = (MemoryManager.textureMemory + MemoryManager.geometryMemory + MemoryManager.memory2d) / 1024;
										if (cardMemory > 65536) {
											textColor = 16711680;
										}
										Class120_Sub12_Sub20.plainFont.method1482("Card:" + cardMemory + "k", textX, textY, textColor, -1);
										textY += 15;
									}
									textColor = 16776960;
									int i_57_ = 0;
									int i_58_ = 0;
									int totalGroups = 0;
									for (int i_60_ = 0; i_60_ < 29; i_60_++) {
										totalGroups += Class120_Sub12_Sub26.aClass53_Sub1Array3337[i_60_].getGroupLength();
										i_57_ += Class120_Sub12_Sub26.aClass53_Sub1Array3337[i_60_].method470();
										i_58_ += Class120_Sub12_Sub26.aClass53_Sub1Array3337[i_60_].method463();
									}
									final int i_61_ = i_58_ * 100 / totalGroups;
									final int i_62_ = i_57_ * 10000 / totalGroups;
									final String string = new StringBuilder("Cache:").append(Class120_Sub12_Sub37.method1395(i_62_, true, 2, 0)).append("% (").append(i_61_).append("%)").toString();
									ObjectCache.smallFont.method1482(string, textX, textY, textColor, -1);
									textY += 12;
									if (ParticleEngine.anInt2360 > 0) {
										ObjectCache.smallFont.method1482(new StringBuilder("Particles: ").append(ParticleEngine.runningParticleCount).append(" / ").append(ParticleEngine.anInt2360).toString(), textX, textY, textColor, -1);
									}
									textY += 12;
									MasterIndexInfo.needInterfaceRedrawWrapper[redrawId] = true;
									Class120_Sub12_Sub33.needScreenRedraw[redrawId] = true;
								}
								continue;
							}
							if (jagexInterface.clientCode == 1406) {
								Class9.worldMapInterfaceDrawX = drawX;
								Class90.worldMapInterfaceDrawY = drawY;
								Class69_Sub3_Sub1.worldMapInterface = jagexInterface;
								continue;
							}
						}
						if (!Class15.menuOpen) {
							if (jagexInterface.type == 0 && jagexInterface.aBoolean1960 && i_37_ <= Class115.menuMouseX && Class120_Sub12_Sub21.menuMouseY >= i_35_ && Class115.menuMouseX < i_36_ && i_38_ > Class120_Sub12_Sub21.menuMouseY && !Class120_Sub30_Sub1.qaOpTestEnabled) {
								Class120_Sub29.menuOptionsCode[0] = (short) 1006;
								Class120_Sub12_Sub33.menuOptionPrefix[0] = StringLibrary.cancel;
								Class120_Sub12_Sub29.menuOptionSuffix[0] = "";
								InterfaceChangeNode.menuOptionsCursorId[0] = Class192.selectedSpellCursor;
								WallDecoration.menuOptionCount = 1;
							}
							if (Class115.menuMouseX >= i_37_ && i_35_ <= Class120_Sub12_Sub21.menuMouseY && Class115.menuMouseX < i_36_ && i_38_ > Class120_Sub12_Sub21.menuMouseY) {
								Class120_Sub12_Sub9.method1244(jagexInterface, Class115.menuMouseX - drawX, Class120_Sub12_Sub21.menuMouseY - drawY);
							}
						}
						if (jagexInterface.type == 0) {
							if (!jagexInterface.newFormat && client.isHidden(jagexInterface) && jagexInterface != CursorType.mouseOverInterface) {
								continue;
							}
							if (!jagexInterface.newFormat) {
								if (-jagexInterface.height + jagexInterface.maxScrollVertical < jagexInterface.horizontalScrollPosition) {
									jagexInterface.horizontalScrollPosition = -jagexInterface.height + jagexInterface.maxScrollVertical;
								}
								if (jagexInterface.horizontalScrollPosition < 0) {
									jagexInterface.horizontalScrollPosition = 0;
								}
							}
							if (HDToolkit.glEnabled && jagexInterface.clientCode == 1407) {
								System.out.println("testa");
								Class34.method283(drawX, drawY, jagexInterface.width, jagexInterface.height);
							}
							method2008(class189s, drawX + -jagexInterface.verticalScrollPosition, jagexInterface.bitPacked, redrawId, i_38_, i_36_, i_35_, -jagexInterface.horizontalScrollPosition + drawY, i_37_);
							if (jagexInterface.components != null) {
								method2008(jagexInterface.components, -jagexInterface.verticalScrollPosition + drawX, jagexInterface.bitPacked, redrawId, i_38_, i_36_, i_35_, -jagexInterface.horizontalScrollPosition + drawY, i_37_);
							}
							final OverridedJInterface class120_sub26 = (OverridedJInterface) Class120_Sub12_Sub13.overridedInterfaces.get(jagexInterface.bitPacked);
							if (class120_sub26 != null) {
								if (class120_sub26.type == 0 && !Class15.menuOpen && Class115.menuMouseX >= i_37_ && Class120_Sub12_Sub21.menuMouseY >= i_35_ && i_36_ > Class115.menuMouseX && Class120_Sub12_Sub21.menuMouseY < i_38_ && !Class120_Sub30_Sub1.qaOpTestEnabled) {
									Class120_Sub29.menuOptionsCode[0] = (short) 1006;
									InterfaceChangeNode.menuOptionsCursorId[0] = Class192.selectedSpellCursor;
									Class120_Sub12_Sub33.menuOptionPrefix[0] = StringLibrary.cancel;
									Class120_Sub12_Sub29.menuOptionSuffix[0] = "";
									WallDecoration.menuOptionCount = 1;
								}
								Class43.method343(class120_sub26.interfaceId, i_35_, drawY, drawX, i_38_, i_37_, i_36_, redrawId);
							}
							if (HDToolkit.glEnabled && jagexInterface.clientCode == 1407) {
								Class34.method289();
								System.out.println("test");
								Class167.clearDepthBuffer = true;
							}
							if (HDToolkit.glEnabled) {
								GraphicsHD.clipRect(i_27_, i_25_, i_24_, i_23_);
							} else {
								GraphicsLD.clipRect(i_27_, i_25_, i_24_, i_23_);
								Rasterizer.calculateByBounds();
							}
						}
						if (Class9.needInterfaceRedraw[redrawId] || Class15.rectDebugType > 1) {
							if (jagexInterface.type == 0 && !jagexInterface.newFormat && jagexInterface.height < jagexInterface.maxScrollVertical) {
								PlayerAppearance.method2039(jagexInterface.height, jagexInterface.width + drawX, jagexInterface.maxScrollVertical, drawY, jagexInterface.horizontalScrollPosition);
							}
							if (jagexInterface.type != 1) {
								if (jagexInterface.type == 2) {
									int i_63_ = 0;
									for (int i_64_ = 0; jagexInterface.originalHeight > i_64_; i_64_++) {
										for (int i_65_ = 0; jagexInterface.originalWidth > i_65_; i_65_++) {
											int i_66_ = drawY + (32 + jagexInterface.objSpritePadY) * i_64_;
											int i_67_ = drawX + i_65_ * (32 - -jagexInterface.objSpritePadX);
											if (i_63_ < 20) {
												i_66_ += jagexInterface.spriteYs[i_63_];
												i_67_ += jagexInterface.spriteXs[i_63_];
											}
											if (jagexInterface.objIds[i_63_] > 0) {
												final int i_68_ = jagexInterface.objIds[i_63_] - 1;
												if (i_67_ - -32 > i_27_ && i_67_ < i_24_ && i_25_ < 32 + i_66_ && i_66_ < i_23_ || jagexInterface == Projectile.aClass189_2954 && Class5.anInt2154 == i_63_) {
													AbstractSprite class120_sub14_sub19;
													if (Light.objSelected != 1 || i_63_ != ParticleEmitter.selectedObjSlot || jagexInterface.bitPacked != PlainTile.selectedObjInterface) {
														class120_sub14_sub19 = Class187.getObjectSprite(null, jagexInterface.objAmounts[i_63_], 1, i_68_, 3153952, jagexInterface.drawObjCount);
													} else {
														class120_sub14_sub19 = Class187.getObjectSprite(null, jagexInterface.objAmounts[i_63_], 2, i_68_, 0, jagexInterface.drawObjCount);
													}
													if (Rasterizer.aBoolean974) {
														MasterIndexInfo.needInterfaceRedrawWrapper[redrawId] = true;
													}
													if (class120_sub14_sub19 != null) {
														if (jagexInterface == Projectile.aClass189_2954 && i_63_ == Class5.anInt2154) {
															int i_69_ = -client.anInt134 + Queue.lastMouseX;
															int i_70_ = -VarBit.anInt166 + ChunkAtmosphere.lastMouseY;
															if (i_69_ < 5 && i_69_ > -5) {
																i_69_ = 0;
															}
															if (i_70_ < 5 && i_70_ > -5) {
																i_70_ = 0;
															}
															if (JavaObject.anInt3915 < 5) {
																i_70_ = 0;
																i_69_ = 0;
															}
															class120_sub14_sub19.drawSpriteTransparency(i_69_ + i_67_, i_66_ - -i_70_, 128);
															if ((i_20_ ^ 0xffffffff) != 0) {
																final JagexInterface class189_71_ = class189s[0xffff & i_20_];
																int i_72_;
																int i_73_;
																if (!HDToolkit.glEnabled) {
																	i_72_ = GraphicsLD.endY;
																	i_73_ = GraphicsLD.startY;
																} else {
																	i_72_ = GraphicsHD.endY;
																	i_73_ = GraphicsHD.startY;
																}
																if (i_70_ + i_66_ < i_73_ && class189_71_.horizontalScrollPosition > 0) {
																	int i_74_ = Class120_Sub12_Sub22.redrawRate * (-i_66_ + i_73_ - i_70_) / 3;
																	if (10 * Class120_Sub12_Sub22.redrawRate < i_74_) {
																		i_74_ = Class120_Sub12_Sub22.redrawRate * 10;
																	}
																	if (class189_71_.horizontalScrollPosition < i_74_) {
																		i_74_ = class189_71_.horizontalScrollPosition;
																	}
																	VarBit.anInt166 += i_74_;
																	class189_71_.horizontalScrollPosition -= i_74_;
																	InterfaceClickMask.redrawInterface(class189_71_);
																}
																if (i_72_ < i_66_ - (-i_70_ + -32) && class189_71_.horizontalScrollPosition < class189_71_.maxScrollVertical - class189_71_.height) {
																	int i_75_ = (32 + i_66_ - (-i_70_ + i_72_)) * Class120_Sub12_Sub22.redrawRate / 3;
																	if (i_75_ > Class120_Sub12_Sub22.redrawRate * 10) {
																		i_75_ = 10 * Class120_Sub12_Sub22.redrawRate;
																	}
																	if (i_75_ > -class189_71_.horizontalScrollPosition + -class189_71_.height + class189_71_.maxScrollVertical) {
																		i_75_ = -class189_71_.horizontalScrollPosition + -class189_71_.height + class189_71_.maxScrollVertical;
																	}
																	class189_71_.horizontalScrollPosition += i_75_;
																	VarBit.anInt166 -= i_75_;
																	InterfaceClickMask.redrawInterface(class189_71_);
																}
															}
														} else if (jagexInterface == MagnetType.aClass189_256 && i_63_ == Huffman.anInt1204) {
															class120_sub14_sub19.drawSpriteTransparency(i_67_, i_66_, 128);
														} else {
															class120_sub14_sub19.drawReg(i_67_, i_66_);
														}
													} else {
														InterfaceClickMask.redrawInterface(jagexInterface);
													}
												}
											} else if (jagexInterface.spriteIDs != null && i_63_ < 20) {
												final AbstractSprite class120_sub14_sub19 = jagexInterface.constructInventorySprite(i_63_);
												if (class120_sub14_sub19 == null) {
													if (Class88.interfaceSpriteIsNull) {
														InterfaceClickMask.redrawInterface(jagexInterface);
													}
												} else {
													class120_sub14_sub19.drawReg(i_67_, i_66_);
												}
											}
											i_63_++;
										}
									}
								} else if (jagexInterface.type == 3) {
									int color;
									if (!Class120_Sub12_Sub35.isIntefaceEnabled(jagexInterface)) {
										color = jagexInterface.disabledColor;
										if (CursorType.mouseOverInterface == jagexInterface && jagexInterface.disabledMouseOverColor != 0) {
											color = jagexInterface.disabledMouseOverColor;
										}
									} else {
										color = jagexInterface.enabledColor;
										if (CursorType.mouseOverInterface == jagexInterface && jagexInterface.enabledMouseOverColor != 0) {
											color = jagexInterface.enabledMouseOverColor;
										}
									}
									if (alpha == 0) {
										if (!jagexInterface.filled) {
											if (!HDToolkit.glEnabled) {
												GraphicsLD.drawRect(drawX, drawY, jagexInterface.width, jagexInterface.height, color);
											} else {
												GraphicsHD.drawRect(drawX, drawY, jagexInterface.width, jagexInterface.height, color);
											}
										} else if (!HDToolkit.glEnabled) {
											GraphicsLD.fillRect(drawX, drawY, jagexInterface.width, jagexInterface.height, color);
										} else {
											GraphicsHD.fillRect(drawX, drawY, jagexInterface.width, jagexInterface.height, color);
										}
									} else if (jagexInterface.filled) {
										if (HDToolkit.glEnabled) {
											GraphicsHD.fillRectAlpha(drawX, drawY, jagexInterface.width, jagexInterface.height, color, 256 - (alpha & 0xff));
										} else {
											GraphicsLD.fillRectAlpha(drawX, drawY, jagexInterface.width, jagexInterface.height, color, 256 - (alpha & 0xff));
										}
									} else if (!HDToolkit.glEnabled) {
										GraphicsLD.drawRectAlpha(drawX, drawY, jagexInterface.width, jagexInterface.height, color, 256 - (alpha & 0xff));
									} else {
										GraphicsHD.drawRect(drawX, drawY, jagexInterface.width, jagexInterface.height, color, 256 - (alpha & 0xff));
									}
								} else if (jagexInterface.type == 4) {
									final AbstractFont class120_sub14_sub8 = jagexInterface.method2497(Class82.nameIconSprites);
									if (class120_sub14_sub8 == null) {
										if (Class88.interfaceSpriteIsNull) {
											InterfaceClickMask.redrawInterface(jagexInterface);
										}
									} else {
										String text = jagexInterface.disabledText;
										int color;
										if (!Class120_Sub12_Sub35.isIntefaceEnabled(jagexInterface)) {
											color = jagexInterface.disabledColor;
											if (jagexInterface == CursorType.mouseOverInterface && jagexInterface.disabledMouseOverColor != 0) {
												color = jagexInterface.disabledMouseOverColor;
											}
										} else {
											color = jagexInterface.enabledColor;
											if (jagexInterface == CursorType.mouseOverInterface && jagexInterface.enabledMouseOverColor != 0) {
												color = jagexInterface.enabledMouseOverColor;
											}
											if (jagexInterface.enabledText.length() > 0) {
												text = jagexInterface.enabledText;
											}
										}
										if (jagexInterface.newFormat && jagexInterface.objId != -1) {
											final ObjType objType = ObjType.list(jagexInterface.objId);
											text = objType.name;
											if (text == null) {
												text = "null";
											}
											if ((objType.stackable == 1 || jagexInterface.objCount != 1) && jagexInterface.objCount != -1) {
												text = new StringBuilder("<col=ff9040>").append(text).append("</col> x").append(Node.method1033(jagexInterface.objCount)).toString();
											}
										}
										if (Class156.aClass189_1454 == jagexInterface) {
											text = StringLibrary.aString626;
											color = jagexInterface.disabledColor;
										}
										if (!jagexInterface.newFormat) {
											text = DummyInputStream.method71(jagexInterface, text);
										}
										class120_sub14_sub8.method1462(text, drawX, drawY, jagexInterface.width, jagexInterface.height, color, !jagexInterface.shaded ? -1 : 0, jagexInterface.horizontalAlignment, jagexInterface.verticalAlignment, jagexInterface.verticalSpacing);
									}
								} else if (jagexInterface.type == 5) {
									if (!jagexInterface.newFormat) {
										final AbstractSprite class120_sub14_sub19 = jagexInterface.constructSpriteFromId(Class120_Sub12_Sub35.isIntefaceEnabled(jagexInterface));
										if (class120_sub14_sub19 == null) {
											if (Class88.interfaceSpriteIsNull) {
												InterfaceClickMask.redrawInterface(jagexInterface);
											}
										} else {
											class120_sub14_sub19.drawReg(drawX, drawY);
										}
									} else if (jagexInterface.anInt2088 < 0) {
										AbstractSprite abstractSprite;
										if (jagexInterface.objId == -1) {
											abstractSprite = jagexInterface.constructSpriteFromId(false);
										} else if (jagexInterface.aBoolean2097 && TileParticleQueue.selfPlayer.appearance != null) {
											abstractSprite = Class187.getObjectSprite(TileParticleQueue.selfPlayer.appearance, jagexInterface.objCount, jagexInterface.outline, jagexInterface.objId, jagexInterface.shadow, jagexInterface.drawObjCount);
										} else {
											abstractSprite = Class187.getObjectSprite(null, jagexInterface.objCount, jagexInterface.outline, jagexInterface.objId, jagexInterface.shadow, jagexInterface.drawObjCount);
										}
										if (abstractSprite != null) {
											final int spriteWidth = abstractSprite.trimWidth;
											final int spriteHeight = abstractSprite.trimHeight;
											if (jagexInterface.gridOriginal) {
												final int widthLoops = (jagexInterface.width + spriteWidth - 1) / spriteWidth;
												final int heightLoops = (jagexInterface.height + spriteHeight - 1) / spriteHeight;
												if (HDToolkit.glEnabled) {
													GraphicsHD.method591(drawX, drawY, drawX + jagexInterface.width, drawY + jagexInterface.height);
													final HDSprite hdSprite = (HDSprite) abstractSprite;
													final boolean widthIsPowerOfTwo = Class179.isPowerOfTwo(abstractSprite.width);
													final boolean heightIsPowerOfTwo = Class179.isPowerOfTwo(abstractSprite.height);
													if (widthIsPowerOfTwo && heightIsPowerOfTwo) {
														if (alpha != 0) {
															hdSprite.method1595(drawX, drawY, 256 - (alpha & 0xff), widthLoops, heightLoops);
														} else {
															hdSprite.method1599(drawX, drawY, widthLoops, heightLoops);
														}
													} else if (widthIsPowerOfTwo) {
														for (int heightId = 0; heightId < heightLoops; heightId++) {
															if (alpha != 0) {
																hdSprite.method1595(drawX, spriteHeight * heightId + drawY, 256 - (alpha & 0xff), widthLoops, 1);
															} else {
																hdSprite.method1599(drawX, spriteHeight * heightId + drawY, widthLoops, 1);
															}
														}
													} else if (heightIsPowerOfTwo) {
														for (int widthId = 0; widthId < widthLoops; widthId++) {
															if (alpha != 0) {
																hdSprite.method1595(drawX + spriteWidth * widthId, drawY, 256 - (alpha & 0xff), 1, heightLoops);
															} else {
																hdSprite.method1599(drawX + spriteWidth * widthId, drawY, 1, heightLoops);
															}
														}
													} else {
														for (int widthId = 0; widthId < widthLoops; widthId++) {
															for (int heightId = 0; heightId < heightLoops; heightId++) {
																if (alpha != 0) {
																	abstractSprite.drawSpriteTransparency(drawX + spriteWidth * widthId, drawY + spriteHeight * heightId, 256 - (alpha & 0xff));
																} else {
																	abstractSprite.drawReg(drawX + spriteWidth * widthId, drawY + spriteHeight * heightId);
																}
															}
														}
													}
													GraphicsHD.clipRect(i_27_, i_25_, i_24_, i_23_);
												} else {
													GraphicsLD.setBounds(drawX, drawY, drawX + jagexInterface.width, drawY + jagexInterface.height);
													for (int widthId = 0; widthId < widthLoops; widthId++) {
														for (int heightId = 0; heightId < heightLoops; heightId++) {
															if (jagexInterface.rotation != 0) {
																abstractSprite.method1590(drawY + heightId * spriteHeight + spriteHeight / 2, jagexInterface.rotation, drawX + widthId * spriteWidth + spriteWidth / 2, 4096);
															} else if (alpha == 0) {
																abstractSprite.drawReg(drawX + widthId * spriteWidth, drawY + heightId * spriteHeight);
															} else {
																abstractSprite.drawSpriteTransparency(drawX + widthId * spriteWidth, spriteHeight * heightId + drawY, 256 - (alpha & 0xff));
															}
														}
													}
													GraphicsLD.clipRect(i_27_, i_25_, i_24_, i_23_);
												}
											} else {
												final int i_89_ = jagexInterface.width * 4096 / spriteWidth;
												if (jagexInterface.rotation != 0) {
													abstractSprite.method1590(drawY + jagexInterface.height / 2, jagexInterface.rotation, jagexInterface.width / 2 + drawX, i_89_);
												} else if (alpha != 0) {
													abstractSprite.method1585(drawX, drawY, jagexInterface.width, jagexInterface.height, 256 - (alpha & 0xff));
												} else if (jagexInterface.width != spriteWidth || spriteHeight != jagexInterface.height) {
													abstractSprite.method1588(drawX, drawY, jagexInterface.width, jagexInterface.height);
												} else {
													abstractSprite.drawReg(drawX, drawY);
												}
											}
										} else if (Class88.interfaceSpriteIsNull) {
											InterfaceClickMask.redrawInterface(jagexInterface);
										}
									} else {
										final Class41 class41 = jagexInterface.method2489();
										if (!HDToolkit.glEnabled) {
											class41.method330(0, drawX, drawY, jagexInterface.width, jagexInterface.height, jagexInterface.anInt2078, jagexInterface.anInt2004, 0);
										} else {
											class41.method331(0, drawX, drawY, jagexInterface.width, jagexInterface.height, jagexInterface.anInt2078, jagexInterface.anInt2004, 0);
										}
									}
								} else if (jagexInterface.type == 6) {
									final boolean interfaceEnabled = Class120_Sub12_Sub35.isIntefaceEnabled(jagexInterface);
									AbstractModelRenderer class180_sub7 = null;
									int animationId;
									if (interfaceEnabled) {
										animationId = jagexInterface.enabledAnim;
									} else {
										animationId = jagexInterface.disabledAnim;
									}
									int i_91_ = 0;
									if (jagexInterface.objId != -1) {
										ObjType objType = ObjType.list(jagexInterface.objId);
										if (objType != null) {
											objType = objType.method2106(jagexInterface.objCount);
											final SeqType seqType = animationId != -1 ? SeqType.list(animationId) : null;
											if (jagexInterface.aBoolean2097 && TileParticleQueue.selfPlayer.appearance != null) {
												class180_sub7 = objType.method2105(jagexInterface.currentFrame, 1, jagexInterface.nextFrame, TileParticleQueue.selfPlayer.appearance, seqType, jagexInterface.frameDelay);
											} else {
												class180_sub7 = objType.method2105(jagexInterface.currentFrame, 1, jagexInterface.nextFrame, null, seqType, jagexInterface.frameDelay);
											}
											if (class180_sub7 == null) {
												InterfaceClickMask.redrawInterface(jagexInterface);
											} else {
												i_91_ = -class180_sub7.getMaxY() / 2;
											}
										}
									} else if (jagexInterface.modelTypeDisabled != 5) {
										if (animationId != -1) {
											final SeqType seqType = SeqType.list(animationId);
											class180_sub7 = jagexInterface.constructModel(seqType, TileParticleQueue.selfPlayer.appearance, jagexInterface.nextFrame, jagexInterface.currentFrame, jagexInterface.frameDelay, interfaceEnabled);
											if (class180_sub7 == null && Class88.interfaceSpriteIsNull) {
												InterfaceClickMask.redrawInterface(jagexInterface);
											}
										} else {
											class180_sub7 = jagexInterface.constructModel(null, TileParticleQueue.selfPlayer.appearance, -1, -1, 0, interfaceEnabled);
											if (class180_sub7 == null && Class88.interfaceSpriteIsNull) {
												InterfaceClickMask.redrawInterface(jagexInterface);
											}
										}
									} else if (jagexInterface.modelIdDisabled != -1) {
										int playerIndex = jagexInterface.modelIdDisabled & 0x7ff;
										if (Class167.selfPlayerIndex == playerIndex) {
											playerIndex = 2047;
										}
										final Player player = Class118.playersList[playerIndex];
										final SeqType seqType = animationId == -1 ? null : SeqType.list(animationId);
										if (player != null && (int) Varp.stringToLong(player.name) << 11 == (~0x7ff & jagexInterface.modelIdDisabled)) {
											class180_sub7 = player.appearance.method2040(null, 0, -1, -1, null, jagexInterface.currentFrame, false, 0, seqType, true, 0);
										}
									} else {
										class180_sub7 = Normal.dummyPlayerAppearance.method2040(null, -1, -1, -1, null, -1, false, 0, null, true, 0);
									}
									if (class180_sub7 != null) {
										int i_93_;
										if (jagexInterface.anInt2069 <= 0) {
											i_93_ = 256;
										} else {
											i_93_ = (jagexInterface.width << 8) / jagexInterface.anInt2069;
										}
										int i_94_;
										if (jagexInterface.anInt2007 <= 0) {
											i_94_ = 256;
										} else {
											i_94_ = (jagexInterface.height << 8) / jagexInterface.anInt2007;
										}
										int posX = (jagexInterface.translateX * i_93_ >> 8) + (jagexInterface.width / 2) + drawX;
										int posY = (jagexInterface.translateY * i_94_ >> 8) + (jagexInterface.height / 2) + drawY;
										if (!HDToolkit.glEnabled) {
											Rasterizer.method869(posX, posY);
											final int i_98_ = Rasterizer.sinTable[jagexInterface.rotateX] * jagexInterface.zoom >> 16;
											final int i_97_ = Rasterizer.cosTable[jagexInterface.rotateX] * jagexInterface.zoom >> 16;
											if (jagexInterface.newFormat) {
												if (jagexInterface.aBoolean2046) {
													((LDModelRenderer) class180_sub7).method2400(0, jagexInterface.rotateY, jagexInterface.rotateZ, jagexInterface.rotateX, jagexInterface.xOffset2d, i_98_ - -i_91_ - -jagexInterface.yOffset2d, i_97_ + jagexInterface.yOffset2d, jagexInterface.zoom);
												} else {
													class180_sub7.method2367(0, jagexInterface.rotateY, jagexInterface.rotateZ, jagexInterface.rotateX, jagexInterface.xOffset2d, i_91_ + i_98_ - -jagexInterface.yOffset2d, i_97_ - -jagexInterface.yOffset2d, -1L);
												}
											} else {
												class180_sub7.method2367(0, jagexInterface.rotateY, 0, jagexInterface.rotateX, 0, i_98_, i_97_, -1L);
											}
											Rasterizer.method868();
										} else {
											if (!jagexInterface.aBoolean2046) {
												HDToolkit.method513(posX, posY, i_93_, i_94_);
												HDToolkit.method535(jagexInterface.aShort2065, 1.5F * jagexInterface.aShort2093);
											} else {
												HDToolkit.method512(posX, posY, jagexInterface.zoom, jagexInterface.aShort2093, i_93_, i_94_);
											}
											HDToolkit.method532();
											HDToolkit.toggleDepthTest(true);
											HDToolkit.toggleFog(false);
											Class99.method822(FileSystemRequest.brightness);
											if (Class167.clearDepthBuffer) {
												GraphicsHD.clipRect();
												HDToolkit.clearDepthBuffer();
												GraphicsHD.clipRect(i_27_, i_25_, i_24_, i_23_);
												Class167.clearDepthBuffer = false;
											}
											if (jagexInterface.ignoreDepthMask) {
												HDToolkit.disableDepthMask();
											}
											final int i_99_ = Rasterizer.cosTable[jagexInterface.rotateX] * jagexInterface.zoom >> 16;
											final int i_100_ = Rasterizer.sinTable[jagexInterface.rotateX] * jagexInterface.zoom >> 16;
											if (jagexInterface.newFormat) {
												class180_sub7.method2367(0, jagexInterface.rotateY, jagexInterface.rotateZ, jagexInterface.rotateX, jagexInterface.xOffset2d, jagexInterface.yOffset2d + i_91_ + i_100_, i_99_ + jagexInterface.yOffset2d, -1L);
											} else {
												class180_sub7.method2367(0, jagexInterface.rotateY, 0, jagexInterface.rotateX, 0, i_100_, i_99_, -1L);
											}
											if (jagexInterface.ignoreDepthMask) {
												HDToolkit.enableDepthMask();
											}
										}
									}
								} else {
									if (jagexInterface.type == 7) {
										final AbstractFont class120_sub14_sub8 = jagexInterface.method2497(Class82.nameIconSprites);
										if (class120_sub14_sub8 == null) {
											if (Class88.interfaceSpriteIsNull) {
												InterfaceClickMask.redrawInterface(jagexInterface);
											}
											continue;
										}
										int i_101_ = 0;
										for (int i_102_ = 0; i_102_ < jagexInterface.originalHeight; i_102_++) {
											for (int i_103_ = 0; i_103_ < jagexInterface.originalWidth; i_103_++) {
												if (jagexInterface.objIds[i_101_] > 0) {
													final ObjType objType = ObjType.list(jagexInterface.objIds[i_101_] - 1);
													String string;
													if (objType.stackable != 1 && jagexInterface.objAmounts[i_101_] == 1) {
														string = new StringBuilder("<col=ff9040>").append(objType.name).append("</col>").toString();
													} else {
														string = new StringBuilder("<col=ff9040>").append(objType.name).append("</col> x").append(Node.method1033(jagexInterface.objAmounts[i_101_])).toString();
													}
													final int i_104_ = drawX + i_103_ * (jagexInterface.objSpritePadX + 115);
													final int i_105_ = drawY + i_102_ * (jagexInterface.objSpritePadY + 12);
													if (jagexInterface.horizontalAlignment == 0) {
														class120_sub14_sub8.method1466(string, i_104_, i_105_, jagexInterface.disabledColor, jagexInterface.shaded ? 0 : -1);
													} else if (jagexInterface.horizontalAlignment == 1) {
														class120_sub14_sub8.method1478(string, i_104_ + 57, i_105_, jagexInterface.disabledColor, jagexInterface.shaded ? 0 : -1);
													} else {
														class120_sub14_sub8.method1482(string, i_104_ + 114, i_105_, jagexInterface.disabledColor, jagexInterface.shaded ? 0 : -1);
													}
												}
												i_101_++;
											}
										}
									}
									if (jagexInterface.type == 8 && Class49.activeYellowBoxComponent == jagexInterface && ParticleNode.anInt1031 == Class120_Sub12_Sub21.anInt3291) {
										int i_106_ = 0;
										final AbstractFont class120_sub14_sub8 = Class120_Sub12_Sub20.plainFont;
										int i_107_ = 0;
										String string = jagexInterface.disabledText;
										string = DummyInputStream.method71(jagexInterface, string);
										while (string.length() > 0) {
											final int i_108_ = string.indexOf("<br>");
											String string_109_;
											if (i_108_ != -1) {
												string_109_ = string.substring(0, i_108_);
												string = string.substring(i_108_ + 4);
											} else {
												string_109_ = string;
												string = "";
											}
											final int i_110_ = class120_sub14_sub8.method1459(string_109_);
											if (i_110_ > i_106_) {
												i_106_ = i_110_;
											}
											i_107_ += 1 + class120_sub14_sub8.anInt3497;
										}
										i_107_ += 7;
										i_106_ += 6;
										int i_111_ = drawY + jagexInterface.height + 5;
										if (i_23_ < i_107_ + i_111_) {
											i_111_ = -i_107_ + i_23_;
										}
										int i_112_ = drawX + jagexInterface.width - (5 + i_106_);
										if (i_112_ < drawX + 5) {
											i_112_ = drawX + 5;
										}
										if (i_106_ + i_112_ > i_24_) {
											i_112_ = -i_106_ + i_24_;
										}
										if (HDToolkit.glEnabled) {
											GraphicsHD.fillRect(i_112_, i_111_, i_106_, i_107_, 16777120);
											GraphicsHD.drawRect(i_112_, i_111_, i_106_, i_107_, 0);
										} else {
											GraphicsLD.fillRect(i_112_, i_111_, i_106_, i_107_, 16777120);
											GraphicsLD.drawRect(i_112_, i_111_, i_106_, i_107_, 0);
										}
										int i_113_ = 2 + class120_sub14_sub8.anInt3497 + i_111_;
										string = jagexInterface.disabledText;
										string = DummyInputStream.method71(jagexInterface, string);
										while (string.length() > 0) {
											final int i_114_ = string.indexOf("<br>");
											String string_115_;
											if (i_114_ != -1) {
												string_115_ = string.substring(0, i_114_);
												string = string.substring(i_114_ + 4);
											} else {
												string_115_ = string;
												string = "";
											}
											class120_sub14_sub8.method1466(string_115_, 3 + i_112_, i_113_, 0, -1);
											i_113_ += 1 + class120_sub14_sub8.anInt3497;
										}
									}
									if (jagexInterface.type == 9) {
										int x1;
										int x2;
										int y1;
										int y2;
										if (jagexInterface.invertYAxis) {
											x1 = drawX;
											x2 = drawX + jagexInterface.width;
											y1 = drawY + jagexInterface.height;
											y2 = drawY;
										} else {
											x1 = drawX;
											x2 = drawX + jagexInterface.width;
											y1 = drawY;
											y2 = drawY + jagexInterface.height;
										}
										if (jagexInterface.lineWidth == 1) {
											if (HDToolkit.glEnabled) {
												GraphicsHD.drawLine(x1, y1, x2, y2, jagexInterface.disabledColor);
											} else {
												GraphicsLD.drawLine(x1, y1, x2, y2, jagexInterface.disabledColor);
											}
										} else if (HDToolkit.glEnabled) {
											GraphicsHD.drawLine(x1, y1, x2, y2, jagexInterface.disabledColor, jagexInterface.lineWidth);
										} else {
											GraphicsLD.drawLine(x1, y1, x2, y2, jagexInterface.disabledColor, jagexInterface.lineWidth);
										}
									}
								}
							}
						}
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

	final LDIndexedSprite constructSprite(final int rotation, final boolean flip) {
		LDIndexedSprite ldIndexedSprite = (LDIndexedSprite) spriteCache.get(rotation << 16 | this.spriteId | (flip ? 262144 : 0));
		if (ldIndexedSprite != null) {
			return ldIndexedSprite;
		}
		spriteJs5.groupExist(this.spriteId);
		ldIndexedSprite = Class164.constructLDIndexedSprite(spriteJs5, this.spriteId, 0);
		if (ldIndexedSprite != null) {
			//ldIndexedSprite.method914(Class158.mapSceneRedColorModifier, Class5.mapSceneGreenColorModifier, GameEntity.mapSceneBlueColorModifier);//TODO commented color random stuff
			ldIndexedSprite.trimWidth = ldIndexedSprite.width;
			ldIndexedSprite.trimHeight = ldIndexedSprite.height;
			if (flip) {
				ldIndexedSprite.flipVertical();
			}
			for (int id = 0; id < rotation; id++) {
				ldIndexedSprite.rotate90();
			}
			spriteCache.put(ldIndexedSprite, this.spriteId | rotation << 16 | (flip ? 262144 : 0));
		}
		return ldIndexedSprite;
	}

	static final void setup(final js5 js5, final js5 class50_0_) {
		configClient = class50_0_;
		spriteJs5 = js5;
		final int baseMod = (int) (Math.random() * 41.0) - 20;
		final int redMod = (int) (Math.random() * 21.0) - 10;
		final int greenMod = (int) (Math.random() * 21.0) - 10;
		final int blueMod = (int) (Math.random() * 21.0) - 10;
		//Class30.aClass50_233.getFileAmount(34); not sure if this is needed
		ModelParticleEmitter.mapSceneRedColorModifier = baseMod + redMod;
		Class5.mapSceneGreenColorModifier = baseMod + greenMod;
		GameEntity.mapSceneBlueColorModifier = baseMod + blueMod;
	}

	static final void clear() {
		recentUse.clear();
		spriteCache.clear();
	}

	static final MapSceneType list(final int id) {
		MapSceneType mapSceneType = (MapSceneType) recentUse.get(id);
		if (mapSceneType != null) {
			return mapSceneType;
		}
		final byte[] data = configClient.getFile(34, id);
		mapSceneType = new MapSceneType();
		if (data != null) {
			mapSceneType.decode(new Buffer(data));
		}
		recentUse.put(mapSceneType, id);
		return mapSceneType;
	}

	public MapSceneType() {
		/* empty */
	}

}
