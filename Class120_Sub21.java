/* Class120_Sub21 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;

final class Class120_Sub21 extends Node {
	static int hintheadiconsId;
	String aString2666;
	static FrameGroup[] aClass120_Sub14_Sub18Array2667 = new FrameGroup[14];
	static Interface1 anInterface1_2668 = null;

	static final void method1695(final int i, final int i_0_, final int i_1_, final int i_2_) {
		final InterfaceChangeNode class120_sub14_sub7 = InterfaceChangeNode.putInterfaceChange(4, i_1_);
		class120_sub14_sub7.method1454();
		class120_sub14_sub7.anInt3484 = i;
		class120_sub14_sub7.anInt3492 = i_2_;
		class120_sub14_sub7.anInt3486 = i_0_;
	}

	static final boolean isValidStringBase10(final String string) {
		return Huffman.isValidStringRadix(string, 10, true);
	}

	static final void joinClanChat(final long value) {
		if (value != 0L) {
			Class120_Sub12_Sub11.outputStream.putByteIsaac(218);
			Class120_Sub12_Sub11.outputStream.putLong(value);
		}
	}

	static final void method1700() {
		if (Class120_Sub22.rebootTimer > 1) {
			Class120_Sub22.rebootTimer--;
			Class120_Sub2.anInt2419 = GrandExchangeObject.anInt1494;
		}
		if (Class31.logoutCycle > 0) {
			Class31.logoutCycle--;
		}
		if (Class120_Sub12_Sub5.errorPinging) {
			Class120_Sub12_Sub5.errorPinging = false;
			TileParticleQueue.dropClient();
		} else {
			for (int id = 0; id < 100 && WallLocation.method2445(); id++) {
				/* empty */
			}
			if (Class109.gameState == 30) {
				SubInterface.processReflectionChecks(Class120_Sub12_Sub11.outputStream);
				synchronized (Class110.mouseRecorder.lock) {
					if (Class127.recordMouseMovements) {
						if (Class156.lastMouseClick != 0 || Class110.mouseRecorder.cacheIndex >= 40) {
							Class120_Sub12_Sub11.outputStream.putByteIsaac(199);
							Class120_Sub12_Sub11.outputStream.putByte(0);
							int i_6_ = 0;
							final int i_7_ = Class120_Sub12_Sub11.outputStream.pos;
							for (int i_8_ = 0; i_8_ < Class110.mouseRecorder.cacheIndex && Class120_Sub12_Sub11.outputStream.pos - i_7_ < 240; i_8_++) {
								i_6_++;
								int i_9_ = Class110.mouseRecorder.mouseCacheX[i_8_];
								int i_10_ = Class110.mouseRecorder.mouseCacheY[i_8_];
								if (i_10_ < 0) {
									i_10_ = 0;
								} else if (i_10_ > 65534) {
									i_10_ = 65534;
								}
								boolean bool = false;
								if (i_9_ < 0) {
									i_9_ = 0;
								} else if (i_9_ > 65534) {
									i_9_ = 65534;
								}
								if (Class110.mouseRecorder.mouseCacheY[i_8_] == -1 && Class110.mouseRecorder.mouseCacheX[i_8_] == -1) {
									bool = true;
									i_9_ = -1;
									i_10_ = -1;
								}
								if (Class120_Sub11.anInt2549 == i_9_ && i_10_ == Class120_Sub12_Sub31.anInt3380) {
									if (Class120_Sub12_Sub11.anInt3214 < 2047) {
										Class120_Sub12_Sub11.anInt3214++;
									}
								} else {
									int i_11_ = i_10_ - Class120_Sub12_Sub31.anInt3380;
									Class120_Sub12_Sub31.anInt3380 = i_10_;
									int i_12_ = i_9_ - Class120_Sub11.anInt2549;
									Class120_Sub11.anInt2549 = i_9_;
									if (Class120_Sub12_Sub11.anInt3214 < 8 && i_12_ >= -32 && i_12_ <= 31 && i_11_ >= -32 && i_11_ <= 31) {
										i_12_ += 32;
										i_11_ += 32;
										Class120_Sub12_Sub11.outputStream.putShort((Class120_Sub12_Sub11.anInt3214 << 12) - (-(i_12_ << 6) - i_11_));
										Class120_Sub12_Sub11.anInt3214 = 0;
									} else if (Class120_Sub12_Sub11.anInt3214 < 32 && i_12_ >= -128 && i_12_ <= 127 && i_11_ >= -128 && i_11_ <= 127) {
										Class120_Sub12_Sub11.outputStream.putByte(128 + Class120_Sub12_Sub11.anInt3214);
										i_11_ += 128;
										i_12_ += 128;
										Class120_Sub12_Sub11.outputStream.putShort((i_12_ << 8) - -i_11_);
										Class120_Sub12_Sub11.anInt3214 = 0;
									} else if (Class120_Sub12_Sub11.anInt3214 < 32) {
										Class120_Sub12_Sub11.outputStream.putByte(Class120_Sub12_Sub11.anInt3214 + 192);
										if (!bool) {
											Class120_Sub12_Sub11.outputStream.putInt(i_9_ | i_10_ << 16);
										} else {
											Class120_Sub12_Sub11.outputStream.putInt(-2147483648);
										}
										Class120_Sub12_Sub11.anInt3214 = 0;
									} else {
										Class120_Sub12_Sub11.outputStream.putShort(Class120_Sub12_Sub11.anInt3214 + 57344);
										if (!bool) {
											Class120_Sub12_Sub11.outputStream.putInt(i_9_ | i_10_ << 16);
										} else {
											Class120_Sub12_Sub11.outputStream.putInt(-2147483648);
										}
										Class120_Sub12_Sub11.anInt3214 = 0;
									}
								}
							}
							Class120_Sub12_Sub11.outputStream.putByteAt(Class120_Sub12_Sub11.outputStream.pos - i_7_);
							if (i_6_ < Class110.mouseRecorder.cacheIndex) {
								Class110.mouseRecorder.cacheIndex -= i_6_;
								for (int i_13_ = 0; Class110.mouseRecorder.cacheIndex > i_13_; i_13_++) {
									Class110.mouseRecorder.mouseCacheX[i_13_] = Class110.mouseRecorder.mouseCacheX[i_6_ + i_13_];
									Class110.mouseRecorder.mouseCacheY[i_13_] = Class110.mouseRecorder.mouseCacheY[i_6_ + i_13_];
								}
							} else {
								Class110.mouseRecorder.cacheIndex = 0;
							}
						}
					} else {
						Class110.mouseRecorder.cacheIndex = 0;
					}
				}
				if (Class156.lastMouseClick != 0) {
					int clickX = js5.lastClickX;
					if (clickX < 0) {
						clickX = 0;
					} else if (clickX > 65535) {
						clickX = 65535;
					}
					int clickY = Class120_Sub12_Sub36.lastClickY;
					if (clickY < 0) {
						clickY = 0;
					} else if (clickY > 65535) {
						clickY = 65535;
					}
					long clickDelta = (Class120_Sub12_Sub2.lastClickTime - EnumType.lastClickPacketSendTime) / 50L;
					if (clickDelta > 32767L) {
						clickDelta = 32767L;
					}
					EnumType.lastClickPacketSendTime = Class120_Sub12_Sub2.lastClickTime;
					int mouseButton = 0;
					if (Class156.lastMouseClick == 2) {
						mouseButton = 1;
					}
					Class120_Sub12_Sub11.outputStream.putByteIsaac(200);
					Class120_Sub12_Sub11.outputStream.putInt1(clickY << 16 | clickX);
					final int timeAsInt = (int) clickDelta;
					Class120_Sub12_Sub11.outputStream.putShortA(mouseButton << 15 | timeAsInt);
				}
				if (NpcType.cameraPacketCycle > 0) {
					NpcType.cameraPacketCycle--;
				}
				if (Class118.sendCameraPacket && NpcType.cameraPacketCycle <= 0) {
					Class118.sendCameraPacket = false;
					NpcType.cameraPacketCycle = 20;
					Class120_Sub12_Sub11.outputStream.putByteIsaac(140);
					Class120_Sub12_Sub11.outputStream.putLEShort((int) Class120_Sub12_Sub21.cameraPitch);
					Class120_Sub12_Sub11.outputStream.putLEShortA((int) DummyOutputStream.cameraYaw);
				}
				if (DummyInputStream.focus && !Class179.aBoolean1779) {
					Class179.aBoolean1779 = true;
					Class120_Sub12_Sub11.outputStream.putByteIsaac(248);
					Class120_Sub12_Sub11.outputStream.putByte(1);
				}
				if (!DummyInputStream.focus && Class179.aBoolean1779) {
					Class179.aBoolean1779 = false;
					Class120_Sub12_Sub11.outputStream.putByteIsaac(248);
					Class120_Sub12_Sub11.outputStream.putByte(0);
				}
				if (!MapFunctionNode.serverUpdatedPreferences) {
					Class120_Sub12_Sub11.outputStream.putByteIsaac(120);
					Class120_Sub12_Sub11.outputStream.putInt(Class120_Sub12_Sub18.getGameSettingsBitpacked());
					MapFunctionNode.serverUpdatedPreferences = true;
				}
				if (!Class188.aBoolean1925) {
					Class120_Sub15.cameraYawWrapper /= 2.0F;
				} else {
					Class188.aBoolean1925 = false;
				}
				if (!Class154.aBoolean1439) {
					Class120_Sub12_Sub4.cameraPitchWrapper /= 2.0F;
				} else {
					Class154.aBoolean1439 = false;
				}
				Class120_Sub12_Sub35.method1385();
				if (Class109.gameState == 30) {
					Class120_Sub12.processCustomLocations();
					Class120_Sub12_Sub21_Sub1.method1315();
					Class120_Sub12_Sub21.processSoundEffects();
					Class88.timoutCycle++;
					if (Class88.timoutCycle > 750) {
						TileParticleQueue.dropClient();
					} else {
						Class101_Sub3.method848();
						Class3.method82();
						ParticleMagnet.updateEntityOverheadText();
						for (int varpId = Varp.synchVarps(true); varpId != -1; varpId = Varp.synchVarps(false)) {
							Class120_Sub14_Sub15.postVarpChange(varpId);
							Class88.varpTriggers[Class120_Sub12_Sub3.method1207(VarBit.varpTriggersPos++, 31)] = varpId;
						}
						for (InterfaceChangeNode interfaceChangeNode = InterfaceChangeNode.poll(); interfaceChangeNode != null; interfaceChangeNode = InterfaceChangeNode.poll()) {
							final int type = interfaceChangeNode.getType();
							final int uid = interfaceChangeNode.getUid();
							if (type == 1) {
								Class120_Sub12_Sub25.anIntArray3320[uid] = interfaceChangeNode.anInt3484;
								Class101_Sub4.anIntArray2296[Class120_Sub12_Sub3.method1207(Class120_Sub12_Sub23.anInt3308++, 31)] = uid;
							} else if (type == 2) {
								Class120_Sub2.aStringArray2420[uid] = interfaceChangeNode.aString3493;
								Class101_Sub4.anIntArray2304[Class120_Sub12_Sub3.method1207(31, Class112.anInt1077++)] = uid;
							} else if (type == 3) {
								final JagexInterface jagexInterface = Class74.getJagexInterface(uid);
								if (!interfaceChangeNode.aString3493.equals(jagexInterface.disabledText)) {
									jagexInterface.disabledText = interfaceChangeNode.aString3493;
									InterfaceClickMask.redrawInterface(jagexInterface);
								}
							} else if (type == 4) {
								final JagexInterface jagexInterface = Class74.getJagexInterface(uid);
								final int i_21_ = interfaceChangeNode.anInt3484;
								final int i_22_ = interfaceChangeNode.anInt3492;
								final int i_23_ = interfaceChangeNode.anInt3486;
								if (jagexInterface.modelTypeDisabled != i_21_ || i_22_ != jagexInterface.modelIdDisabled || jagexInterface.anInt1997 != i_23_) {
									jagexInterface.modelIdDisabled = i_22_;
									jagexInterface.anInt1997 = i_23_;
									jagexInterface.modelTypeDisabled = i_21_;
									InterfaceClickMask.redrawInterface(jagexInterface);
								}
							} else if (type == 5) {
								final JagexInterface jagexInterface = Class74.getJagexInterface(uid);
								if (jagexInterface.disabledAnimId != interfaceChangeNode.anInt3484 || interfaceChangeNode.anInt3484 == -1) {
									jagexInterface.currentFrame = 0;
									jagexInterface.disabledAnimId = interfaceChangeNode.anInt3484;
									jagexInterface.nextFrame = 1;
									jagexInterface.frameDelay = 0;
									InterfaceClickMask.redrawInterface(jagexInterface);
								}
							} else if (type == 6) {
								final JagexInterface jagexInterface = Class74.getJagexInterface(uid);
								final int i_25_ = interfaceChangeNode.anInt3484;
								final int i_26_ = i_25_ >> 5 & 0x1f;
								final int i_27_ = i_25_ >> 10 & 0x1f;
								final int i_28_ = i_25_ & 0x1f;
								final int i_29_ = (i_28_ << 3) + (i_27_ << 19) + (i_26_ << 11);
								if (jagexInterface.disabledColor != i_29_) {
									jagexInterface.disabledColor = i_29_;
									InterfaceClickMask.redrawInterface(jagexInterface);
								}
							} else if (type == 7) {
								final JagexInterface jagexInterface = Class74.getJagexInterface(uid);
								final boolean bool = interfaceChangeNode.anInt3484 == 1;
								if (jagexInterface.hidden != bool) {
									jagexInterface.hidden = bool;
									InterfaceClickMask.redrawInterface(jagexInterface);
								}
							} else if (type == 8) {
								final JagexInterface jagexInterface = Class74.getJagexInterface(uid);
								if (jagexInterface.angleX != interfaceChangeNode.anInt3484 || interfaceChangeNode.anInt3492 != jagexInterface.angleY || interfaceChangeNode.anInt3486 != jagexInterface.zoom) {
									jagexInterface.angleY = interfaceChangeNode.anInt3492;
									jagexInterface.zoom = interfaceChangeNode.anInt3486;
									if (jagexInterface.objId != -1) {
										if (jagexInterface.anInt2069 > 0) {
											jagexInterface.zoom = jagexInterface.zoom * 32 / jagexInterface.anInt2069;
										} else if (jagexInterface.originalWidth > 0) {
											jagexInterface.zoom = jagexInterface.zoom * 32 / jagexInterface.originalWidth;
										}
									}
									jagexInterface.angleX = interfaceChangeNode.anInt3484;
									InterfaceClickMask.redrawInterface(jagexInterface);
								}
							} else if (type == 9) {
								final JagexInterface jagexInterface = Class74.getJagexInterface(uid);
								if (jagexInterface.objId != interfaceChangeNode.anInt3484 || jagexInterface.objCount != interfaceChangeNode.anInt3492) {
									jagexInterface.objCount = interfaceChangeNode.anInt3492;
									jagexInterface.objId = interfaceChangeNode.anInt3484;
									InterfaceClickMask.redrawInterface(jagexInterface);
								}
							} else if (type == 10) {
								final JagexInterface jagexInterface = Class74.getJagexInterface(uid);
								if (jagexInterface.xOffset2d != interfaceChangeNode.anInt3484 || interfaceChangeNode.anInt3492 != jagexInterface.yOffset2d || jagexInterface.angleZ != interfaceChangeNode.anInt3486) {
									jagexInterface.yOffset2d = interfaceChangeNode.anInt3492;
									jagexInterface.xOffset2d = interfaceChangeNode.anInt3484;
									jagexInterface.angleZ = interfaceChangeNode.anInt3486;
									InterfaceClickMask.redrawInterface(jagexInterface);
								}
							} else if (type == 11) {
								final JagexInterface jagexInterface = Class74.getJagexInterface(uid);
								jagexInterface.x = jagexInterface.originalX = interfaceChangeNode.anInt3484;
								jagexInterface.y = jagexInterface.originalY = interfaceChangeNode.anInt3492;
								jagexInterface.dynamicXValue = (byte) 0;
								jagexInterface.dynamicYValue = (byte) 0;
								InterfaceClickMask.redrawInterface(jagexInterface);
							} else if (type == 12) {
								final JagexInterface jagexInterface = Class74.getJagexInterface(uid);
								int i_24_ = interfaceChangeNode.anInt3484;
								if (jagexInterface != null && jagexInterface.type == 0) {
									if (i_24_ > jagexInterface.maxScrollVertical - jagexInterface.height) {
										i_24_ = jagexInterface.maxScrollVertical - jagexInterface.height;
									}
									if (i_24_ < 0) {
										i_24_ = 0;
									}
									if (jagexInterface.horizontalScrollPosition != i_24_) {
										jagexInterface.horizontalScrollPosition = i_24_;
										InterfaceClickMask.redrawInterface(jagexInterface);
									}
								}
							}
							if (type == 13) {
								final JagexInterface jagexInterface = Class74.getJagexInterface(uid);
								jagexInterface.rotateSpeed = interfaceChangeNode.anInt3484;
							}
						}
						if (Class120_Sub14_Sub22.crossState != 0) {
							Class120_Sub12_Sub7.crossIndex += 20;
							if (Class120_Sub12_Sub7.crossIndex >= 400) {
								Class120_Sub14_Sub22.crossState = 0;
							}
						}
						Class120_Sub12_Sub22.redrawRate++;
						if (MagnetType.pressedInventoryComponent != null) {
							Class69_Sub2.anInt2236++;
							if (Class69_Sub2.anInt2236 >= 15) {
								InterfaceClickMask.redrawInterface(MagnetType.pressedInventoryComponent);
								MagnetType.pressedInventoryComponent = null;
							}
						}
						if (Projectile.clickedInventoryComponent != null) {
							//System.out.println("hello");
							InterfaceClickMask.redrawInterface(Projectile.clickedInventoryComponent);
							if (Queue.lastMouseX > client.clickedInventoryComponentX + 5 || Queue.lastMouseX < client.clickedInventoryComponentX - 5 || ChunkAtmosphere.lastMouseY > VarBit.clickedInventoryComponentY + 5 || ChunkAtmosphere.lastMouseY < VarBit.clickedInventoryComponentY - 5) {
								Huffman.draggingClickedInventoryObject = true;
							}
							JavaObject.clickedInventoryComponentCycle++;
							if (InterfaceChangeNode.lastMousePress == 0) {
								if (Huffman.draggingClickedInventoryObject && JavaObject.clickedInventoryComponentCycle >= 5) {
									if (Projectile.clickedInventoryComponent == StructType.mouseOverInventoryInterface && ClanMember.mouseOverInventoryObjectIndex != Class5.clickedInventoryIndex) {
										final JagexInterface jagexInterface = Projectile.clickedInventoryComponent;
										int inserting = 0;
										if (JagexInterface.inserting == 1 && jagexInterface.clientCode == 206) {
											inserting = 1;
										}
										if (jagexInterface.objIds[ClanMember.mouseOverInventoryObjectIndex] <= 0) {
											inserting = 0;
										}
										if (client.getClickMask(jagexInterface).draggingReplacesObject()) {//Replace
											final int newIndex = ClanMember.mouseOverInventoryObjectIndex;
											final int currentIndex = Class5.clickedInventoryIndex;
											jagexInterface.objIds[newIndex] = jagexInterface.objIds[currentIndex];
											jagexInterface.objAmounts[newIndex] = jagexInterface.objAmounts[currentIndex];
											jagexInterface.objIds[currentIndex] = -1;
											jagexInterface.objAmounts[currentIndex] = 0;
										} else if (inserting == 1) {
											int currentIndex = Class5.clickedInventoryIndex;
											final int newIndex = ClanMember.mouseOverInventoryObjectIndex;
											while (newIndex != currentIndex) {
												if (newIndex < currentIndex) {
													jagexInterface.swapObj(currentIndex, currentIndex - 1);
													currentIndex--;
												} else if (currentIndex < newIndex) {
													jagexInterface.swapObj(currentIndex, currentIndex + 1);
													currentIndex++;
												}
											}
										} else {
											jagexInterface.swapObj(Class5.clickedInventoryIndex, ClanMember.mouseOverInventoryObjectIndex);
										}
										Class120_Sub12_Sub11.outputStream.putByteIsaac(6);
										Class120_Sub12_Sub11.outputStream.putLEShortA(ClanMember.mouseOverInventoryObjectIndex);
										Class120_Sub12_Sub11.outputStream.putByteS(inserting);
										Class120_Sub12_Sub11.outputStream.putInt2(Projectile.clickedInventoryComponent.bitPacked);
										Class120_Sub12_Sub11.outputStream.putLEShort(Class5.clickedInventoryIndex);
									}
								} else if (Class69.oneMouseButton != 1 && !SpotAnimationNode.method1438(WallDecoration.menuOptionCount + -1) || WallDecoration.menuOptionCount <= 2) {
									if (WallDecoration.menuOptionCount > 0) {
										ChunkAtmosphere.method2508();
									}
								} else {
									Class120_Sub12_Sub28.openMenu();
								}
								Class69_Sub2.anInt2236 = 10;
								Projectile.clickedInventoryComponent = null;
								Class156.lastMouseClick = 0;
							}
						}
						Class111.aBoolean1058 = false;
						LocType.draggedOnComponent = null;
						final JagexInterface oldMouseOverInterface = CursorType.mouseOverInterface;
						CursorType.mouseOverInterface = null;
						final JagexInterface class189_35_ = Class49.activeYellowBoxComponent;
						Class49.activeYellowBoxComponent = null;
						WorldInfo.draggingComponent = false;
						for (ObjType.anInt1551 = 0; Class120_Sub12_Sub13.method1265() && ObjType.anInt1551 < 128; ObjType.anInt1551++) {
							Class134.anIntArray1285[ObjType.anInt1551] = NodeCache.anInt301;
							Class120_Sub19.anIntArray2658[ObjType.anInt1551] = ObjType.aChar1536;
						}
						MapSceneType.worldMapInterface = null;
						if (Class69.rootInterfaceId != -1) {
							Class120_Sub6.method1074(Class69.rootInterfaceId, Class69_Sub1.canvasWidth, 0, 0, 0, 0, Class120_Sub12_Sub5.canvasHeight);
						}
						GrandExchangeObject.anInt1494++;
						if (MapSceneType.worldMapInterface != null) {
							Class116.handleWorldMapLogic();
						}
						for (;;) {
							final InterfaceListener interfaceListener = (InterfaceListener) Class120_Sub4.topPriorityInterfaceScripts.removeFront();
							if (interfaceListener == null) {
								break;
							}
							final JagexInterface listenerJagexInterface = interfaceListener.jagexInterface;
							if (listenerJagexInterface.componentIndex >= 0) {
								final JagexInterface parentInterface = Class74.getJagexInterface(listenerJagexInterface.layer);
								if (parentInterface == null || parentInterface.components == null || parentInterface.components.length <= listenerJagexInterface.componentIndex || parentInterface.components[listenerJagexInterface.componentIndex] != listenerJagexInterface) {
									continue;
								}
							}
							Class88.executeScript(interfaceListener);
						}
						for (;;) {
							final InterfaceListener interfaceListener = (InterfaceListener) FileSystem.mediumPriorityInterfaceScripts.removeFront();
							if (interfaceListener == null) {
								break;
							}
							final JagexInterface listenerJagexInterface = interfaceListener.jagexInterface;
							if (listenerJagexInterface.componentIndex >= 0) {
								final JagexInterface parentInterface = Class74.getJagexInterface(listenerJagexInterface.layer);
								if (parentInterface == null || parentInterface.components == null || parentInterface.components.length <= listenerJagexInterface.componentIndex || listenerJagexInterface != parentInterface.components[listenerJagexInterface.componentIndex]) {
									continue;
								}
							}
							Class88.executeScript(interfaceListener);
						}
						for (;;) {
							final InterfaceListener interfaceListener = (InterfaceListener) Class88.lowPriorityInterfaceScripts.removeFront();
							if (interfaceListener == null) {
								break;
							}
							final JagexInterface listenerJagexInterface = interfaceListener.jagexInterface;
							if (listenerJagexInterface.componentIndex >= 0) {
								final JagexInterface parentInterface = Class74.getJagexInterface(listenerJagexInterface.layer);
								if (parentInterface == null || parentInterface.components == null || listenerJagexInterface.componentIndex >= parentInterface.components.length || parentInterface.components[listenerJagexInterface.componentIndex] != listenerJagexInterface) {
									continue;
								}
							}
							Class88.executeScript(interfaceListener);
						}
						if (MapSceneType.worldMapInterface == null) {
							EnumType.anInt3450 = 0;
						}
						if (Class120_Sub12_Sub4.draggedComponent != null) {
							JavaObject.updateDraggedComponent();
						}
						if (Class86.staffLevel > 0 && NodeCache.heldKeys[82] && NodeCache.heldKeys[81] && AbstractBuffer.mouseWheelRotation != 0) {
							int newLevel = Class173.gameLevel - AbstractBuffer.mouseWheelRotation;
							if (newLevel < 0) {
								newLevel = 0;
							} else if (newLevel > 3) {
								newLevel = 3;
							}
							ParticleNode.tele(TileParticleQueue.selfPlayer.walkQueueX[0] + GameEntity.currentBaseX, LightType.currentBaseZ + TileParticleQueue.selfPlayer.walkQueueZ[0], newLevel);
						}
						if (Class86.staffLevel <= 0 || !NodeCache.heldKeys[82] || !NodeCache.heldKeys[81]) {
							if (MapFunctionNode.anInt3479 != 2) {
								if (Class120_Sub12_Sub33.anInt3401 != 2) {
									if (ObjectCache.clickedTileX != -1 && MapFunctionNode.anInt3479 == 0 && Class120_Sub12_Sub33.anInt3401 == 0) {
										final int i_43_ = (ObjectCache.clickedTileX << 1) - TileParticleQueue.selfPlayer.getSize() + 1 >> 1;
										final int i_44_ = (WaterfallShader.clickedTileZ << 1) - TileParticleQueue.selfPlayer.getSize() + 1 >> 1;
										Class53_Sub1.method464(0, i_43_, i_44_);
										Class120_Sub12_Sub35.crossX = js5.lastClickX;
										IsaacCipher.crossY = Class120_Sub12_Sub36.lastClickY;
										Class120_Sub14_Sub22.crossState = 1;
										Class120_Sub12_Sub7.crossIndex = 0;
										MapFunctionNode.setFlagPosition(TileParticleQueue.selfPlayer.walkQueueX[0], 0, 0, true, 0, i_44_, TileParticleQueue.selfPlayer.walkQueueZ[0], 0, 0, i_43_);
									}
								} else {
									if (ObjectCache.clickedTileX != -1) {
										Class120_Sub12_Sub11.outputStream.putByteIsaac(85);
										Class120_Sub12_Sub11.outputStream.putLEShortA(GameEntity.currentBaseX + ObjectCache.clickedTileX);
										Class120_Sub12_Sub11.outputStream.putLEShort(LightType.currentBaseZ + WaterfallShader.clickedTileZ);
										Class120_Sub14_Sub22.crossState = 1;
										Class120_Sub12_Sub7.crossIndex = 0;
										IsaacCipher.crossY = Class120_Sub12_Sub36.lastClickY;
										Class120_Sub12_Sub35.crossX = js5.lastClickX;
									}
									Class120_Sub12_Sub33.anInt3401 = 0;
								}
							} else {
								if (ObjectCache.clickedTileX != -1) {
									Class120_Sub12_Sub11.outputStream.putByteIsaac(204);
									Class120_Sub12_Sub11.outputStream.putShortA(WaterfallShader.clickedTileZ + LightType.currentBaseZ);
									Class120_Sub12_Sub11.outputStream.putShortA(JagexSocket.selectedSpellComponextIndex);
									Class120_Sub12_Sub11.outputStream.putInt2(AbstractMouseWheelHandler.selectedSpellInterfaceBitPacked);
									Class120_Sub12_Sub11.outputStream.putLEShort(ObjectCache.clickedTileX + GameEntity.currentBaseX);
									Class120_Sub12_Sub35.crossX = js5.lastClickX;
									Class120_Sub14_Sub22.crossState = 1;
									Class120_Sub12_Sub7.crossIndex = 0;
									IsaacCipher.crossY = Class120_Sub12_Sub36.lastClickY;
								}
								MapFunctionNode.anInt3479 = 0;
							}
						} else {
							if (ObjectCache.clickedTileX != -1) {
								ParticleNode.tele(ObjectCache.clickedTileX + GameEntity.currentBaseX, WaterfallShader.clickedTileZ + LightType.currentBaseZ, Class173.gameLevel);
							}
							MapFunctionNode.anInt3479 = Class120_Sub12_Sub33.anInt3401 = 0;
						}
						ObjectCache.clickedTileX = -1;
						CursorType.method1918();
						if (oldMouseOverInterface != CursorType.mouseOverInterface) {
							if (oldMouseOverInterface != null) {
								InterfaceClickMask.redrawInterface(oldMouseOverInterface);
							}
							if (CursorType.mouseOverInterface != null) {
								InterfaceClickMask.redrawInterface(CursorType.mouseOverInterface);
							}
						}
						if (class189_35_ != Class49.activeYellowBoxComponent && Class120_Sub12_Sub21.anInt3291 == ParticleNode.anInt1031) {
							if (class189_35_ != null) {
								InterfaceClickMask.redrawInterface(class189_35_);
							}
							if (Class49.activeYellowBoxComponent != null) {
								InterfaceClickMask.redrawInterface(Class49.activeYellowBoxComponent);
							}
						}
						if (Class49.activeYellowBoxComponent != null) {
							if (ParticleNode.anInt1031 < Class120_Sub12_Sub21.anInt3291) {
								ParticleNode.anInt1031++;
								if (Class120_Sub12_Sub21.anInt3291 == ParticleNode.anInt1031) {
									InterfaceClickMask.redrawInterface(Class49.activeYellowBoxComponent);
								}
							}
						} else if (ParticleNode.anInt1031 > 0) {
							ParticleNode.anInt1031--;
						}
						for (int id = 0; id < 5; id++) {
							SeqFrameBase.anIntArray2412[id]++;
						}
						final int mouseIdle = WallLocation.getMouseIdleCycle();
						final int keyboardIdle = Class69_Sub2_Sub1.getKeyboardIdleCycle();
						if (mouseIdle > 15000 && keyboardIdle > 15000) {
							Class31.logoutCycle = 250;
							Class120_Sub12_Sub39.setMouseIdleCycle(14500);
							Class120_Sub12_Sub11.outputStream.putByteIsaac(91);
						}
						if (Class3.openUrlRequest != null && Class3.openUrlRequest.status == 1) {
							if (Class3.openUrlRequest.value != null) {
								Class188.openUrl(WorldInfo.openUrl, Class99.openUrlNewTab);
							}
							WorldInfo.openUrl = null;
							Class3.openUrlRequest = null;
							Class99.openUrlNewTab = false;
						}
						Class65.pingTimer++;
						if (Class65.pingTimer > 50) {
							Class120_Sub12_Sub11.outputStream.putByteIsaac(137);
						}
						if (Class30.transmitNewId) {
							GroundObjectNode.transmitVerifyId();
							Class30.transmitNewId = false;
						}
						try {
							if (AbstractTimer.worldConnection != null && Class120_Sub12_Sub11.outputStream.pos > 0) {
								AbstractTimer.worldConnection.put(Class120_Sub12_Sub11.outputStream.buf, 0, Class120_Sub12_Sub11.outputStream.pos);
								Class120_Sub12_Sub11.outputStream.pos = 0;
								Class65.pingTimer = 0;
							}
						} catch (final IOException ioexception) {
							TileParticleQueue.dropClient();
						}
					}
				}
			}
		}
	}

	public Class120_Sub21() {
		/* empty */
	}

	Class120_Sub21(final String string, final int i) {
		this.aString2666 = string;
	}
}
