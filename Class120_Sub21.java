/* Class120_Sub21 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;

final class Class120_Sub21 extends Node {
	static int hintheadiconsId;
	String aString2666;
	static FrameLoader[] aClass120_Sub14_Sub18Array2667;
	static Interface1 anInterface1_2668 = null;
	static int skillTriggersPos;

	static {
		aClass120_Sub14_Sub18Array2667 = new FrameLoader[14];
		skillTriggersPos = 0;
	}

	static final void method1695(final int i, final int i_0_, final int i_1_, final int i_2_) {
		final InterfaceChangeNode class120_sub14_sub7 = AbstractObject.putInterfaceChange(4, i_1_);
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
		if (Class120_Sub22.systemUpdateCycle > 1) {
			Class120_Sub22.systemUpdateCycle--;
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
				OverridedJInterface.processReflectionChecks(Class120_Sub12_Sub11.outputStream);
				synchronized (Class110.mouseRecorder.lock) {
					if (Class127.recordMouseMovements) {
						if (Class156.lastMouseClick != 0 || Class110.mouseRecorder.cacheIndex >= 40) {
							Class120_Sub12_Sub11.outputStream.putByteIsaac(199);
							Class120_Sub12_Sub11.outputStream.putByte(0);
							int i_6_ = 0;
							final int i_7_ = Class120_Sub12_Sub11.outputStream.pos;
							for (int i_8_ = 0; i_8_ < Class110.mouseRecorder.cacheIndex && Class120_Sub12_Sub11.outputStream.pos - i_7_ < 240; i_8_++) {
								i_6_++;
								int i_9_ = Class110.mouseRecorder.mouseXCache[i_8_];
								int i_10_ = Class110.mouseRecorder.mouseYCache[i_8_];
								if (i_10_ >= 0) {
									if ((i_10_ ^ 0xffffffff) < -65535) {
										i_10_ = 65534;
									}
								} else {
									i_10_ = 0;
								}
								boolean bool = false;
								if (i_9_ >= 0) {
									if ((i_9_ ^ 0xffffffff) < -65535) {
										i_9_ = 65534;
									}
								} else {
									i_9_ = 0;
								}
								if ((Class110.mouseRecorder.mouseYCache[i_8_] ^ 0xffffffff) == 0 && (Class110.mouseRecorder.mouseXCache[i_8_] ^ 0xffffffff) == 0) {
									bool = true;
									i_9_ = -1;
									i_10_ = -1;
								}
								if (Class120_Sub11.anInt2549 == i_9_ && i_10_ == Class120_Sub12_Sub31.anInt3380) {
									if (Class120_Sub12_Sub11.anInt3214 < 2047) {
										Class120_Sub12_Sub11.anInt3214++;
									}
								} else {
									int i_11_ = -Class120_Sub12_Sub31.anInt3380 + i_10_;
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
									Class110.mouseRecorder.mouseXCache[i_13_] = Class110.mouseRecorder.mouseXCache[i_6_ + i_13_];
									Class110.mouseRecorder.mouseYCache[i_13_] = Class110.mouseRecorder.mouseYCache[i_6_ + i_13_];
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
					int i_14_ = Class120_Sub12_Sub36.lastClickY;
					if (i_14_ < 0) {
						i_14_ = 0;
					} else if (-65536 > (i_14_ ^ 0xffffffff)) {
						i_14_ = 65535;
					}
					long l = (Class120_Sub12_Sub2.lastClickTime - EnumType.aLong3462) / 50L;
					if ((l ^ 0xffffffffffffffffL) < -32768L) {
						l = 32767L;
					}
					EnumType.aLong3462 = Class120_Sub12_Sub2.lastClickTime;
					int i_15_ = js5.lastClickX;
					if (i_15_ >= 0) {
						if (65535 < i_15_) {
							i_15_ = 65535;
						}
					} else {
						i_15_ = 0;
					}
					int i_16_ = 0;
					if (Class156.lastMouseClick == 2) {
						i_16_ = 1;
					}
					Class120_Sub12_Sub11.outputStream.putByteIsaac(200);
					Class120_Sub12_Sub11.outputStream.putInt1(i_14_ << 16 | i_15_);
					final int i_17_ = (int) l;
					Class120_Sub12_Sub11.outputStream.putShortA(i_16_ << 15 | i_17_);
				}
				if (NpcType.anInt1702 > 0) {
					NpcType.anInt1702--;
				}
				if (Class118.aBoolean1134 && NpcType.anInt1702 <= 0) {
					Class118.aBoolean1134 = false;
					NpcType.anInt1702 = 20;
					Class120_Sub12_Sub11.outputStream.putByteIsaac(140);
					Class120_Sub12_Sub11.outputStream.putLEShort((int) Class120_Sub12_Sub21.aFloat3293);
					Class120_Sub12_Sub11.outputStream.putLEShortA((int) DummyOutputStream.aFloat28);
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
				if (!MapFunctionNode.aBoolean3471) {
					Class120_Sub12_Sub11.outputStream.putByteIsaac(120);
					Class120_Sub12_Sub11.outputStream.putInt(Class120_Sub12_Sub18.method1288());
					MapFunctionNode.aBoolean3471 = true;
				}
				if (!Class188.aBoolean1925) {
					Class120_Sub15.aFloat2598 /= 2.0F;
				} else {
					Class188.aBoolean1925 = false;
				}
				if (!Class154.aBoolean1439) {
					Class120_Sub12_Sub4.aFloat3154 /= 2.0F;
				} else {
					Class154.aBoolean1439 = false;
				}
				Class120_Sub12_Sub35.method1385();
				if (Class109.gameState == 30) {
					Class120_Sub12.method1185();
					Class120_Sub12_Sub21_Sub1.method1315();
					Class120_Sub12_Sub21.method1306();
					Class88.timoutCycle++;
					if (Class88.timoutCycle > 750) {
						TileParticleQueue.dropClient();
					} else {
						Class101_Sub3.method848();
						Class3.method82();
						ParticleMagnet.updateEntityText();
						for (int i_18_ = Class31.method263(true); i_18_ != -1; i_18_ = Class31.method263(false)) {
							Class120_Sub14_Sub15.postVarpChange(i_18_);
							Class88.anIntArray833[Class120_Sub12_Sub3.method1207(VarBit.anInt165++, 31)] = i_18_;
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
								if (jagexInterface.disabledAnim != interfaceChangeNode.anInt3484 || (interfaceChangeNode.anInt3484 ^ 0xffffffff) == 0) {
									jagexInterface.currentFrame = 0;
									jagexInterface.disabledAnim = interfaceChangeNode.anInt3484;
									jagexInterface.nextFrame = 1;
									jagexInterface.frameDelay = 0;
									InterfaceClickMask.redrawInterface(jagexInterface);
								}
							} else if (type == 6) {
								final JagexInterface jagexInterface = Class74.getJagexInterface(uid);
								final int i_25_ = interfaceChangeNode.anInt3484;
								final int i_26_ = 0x1f & i_25_ >> 5;
								final int i_27_ = (0x7e28 & i_25_) >> 10;
								final int i_28_ = 0x1f & i_25_;
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
								if (jagexInterface.rotateX != interfaceChangeNode.anInt3484 || interfaceChangeNode.anInt3492 != jagexInterface.rotateY || interfaceChangeNode.anInt3486 != jagexInterface.zoom) {
									jagexInterface.rotateY = interfaceChangeNode.anInt3492;
									jagexInterface.zoom = interfaceChangeNode.anInt3486;
									if (jagexInterface.objId != -1) {
										if (jagexInterface.anInt2069 > 0) {
											jagexInterface.zoom = 32 * jagexInterface.zoom / jagexInterface.anInt2069;
										} else if (jagexInterface.originalWidth > 0) {
											jagexInterface.zoom = jagexInterface.zoom * 32 / jagexInterface.originalWidth;
										}
									}
									jagexInterface.rotateX = interfaceChangeNode.anInt3484;
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
								if (jagexInterface.xOffset2d != interfaceChangeNode.anInt3484 || interfaceChangeNode.anInt3492 != jagexInterface.yOffset2d || jagexInterface.rotateZ != interfaceChangeNode.anInt3486) {
									jagexInterface.yOffset2d = interfaceChangeNode.anInt3492;
									jagexInterface.xOffset2d = interfaceChangeNode.anInt3484;
									jagexInterface.rotateZ = interfaceChangeNode.anInt3486;
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
						if (MagnetType.aClass189_256 != null) {
							Class69_Sub2.anInt2236++;
							if (Class69_Sub2.anInt2236 >= 15) {
								InterfaceClickMask.redrawInterface(MagnetType.aClass189_256);
								MagnetType.aClass189_256 = null;
							}
						}
						if (Projectile.aClass189_2954 != null) {
							InterfaceClickMask.redrawInterface(Projectile.aClass189_2954);
							if (5 + Class23.anInt134 < Queue.lastMouseX || Queue.lastMouseX < Class23.anInt134 + -5 || Class191.lastMouseY > 5 + VarBit.anInt166 || Class191.lastMouseY < -5 + VarBit.anInt166) {
								Huffman.aBoolean1207 = true;
							}
							JavaObject.anInt3915++;
							if (InterfaceChangeNode.lastMousePress == 0) {
								if (Huffman.aBoolean1207 && JavaObject.anInt3915 >= 5) {
									if (Projectile.aClass189_2954 == StructType.aClass189_3588 && ClanMember.anInt2572 != Class5.anInt2154) {
										final JagexInterface jagexInterface = Projectile.aClass189_2954;
										int inserting = 0;
										if (JagexInterface.inserting == 1 && jagexInterface.clientCode == 206) {
											inserting = 1;
										}
										if (jagexInterface.objIds[ClanMember.anInt2572] <= 0) {
											inserting = 0;
										}
										if (client.getClickMask(jagexInterface).method1691()) {
											final int i_31_ = ClanMember.anInt2572;
											final int i_32_ = Class5.anInt2154;
											jagexInterface.objIds[i_31_] = jagexInterface.objIds[i_32_];
											jagexInterface.objAmounts[i_31_] = jagexInterface.objAmounts[i_32_];
											jagexInterface.objIds[i_32_] = -1;
											jagexInterface.objAmounts[i_32_] = 0;
										} else if (inserting == 1) {
											int i_33_ = Class5.anInt2154;
											final int i_34_ = ClanMember.anInt2572;
											while (i_34_ != i_33_) {
												if (i_34_ < i_33_) {
													jagexInterface.swapObj(i_33_, i_33_ - 1);
													i_33_--;
												} else if (i_33_ < i_34_) {
													jagexInterface.swapObj(i_33_, 1 + i_33_);
													i_33_++;
												}
											}
										} else {
											jagexInterface.swapObj(Class5.anInt2154, ClanMember.anInt2572);
										}
										Class120_Sub12_Sub11.outputStream.putByteIsaac(6);
										Class120_Sub12_Sub11.outputStream.putLEShortA(ClanMember.anInt2572);
										Class120_Sub12_Sub11.outputStream.putByteS(inserting);
										Class120_Sub12_Sub11.outputStream.putInt2(Projectile.aClass189_2954.bitPacked);
										Class120_Sub12_Sub11.outputStream.putLEShort(Class5.anInt2154);
									}
								} else if (Class69.mouseButtons != 1 && !SpotAnimationNode.method1438(WallDecoration.menuOptionCount + -1) || WallDecoration.menuOptionCount <= 2) {
									if (WallDecoration.menuOptionCount > 0) {
										Class191.method2508();
									}
								} else {
									Class120_Sub12_Sub28.determineMenuSize();
								}
								Class69_Sub2.anInt2236 = 10;
								Projectile.aClass189_2954 = null;
								Class156.lastMouseClick = 0;
							}
						}
						Class111.aBoolean1058 = false;
						LocType.draggedOnComponent = null;
						final JagexInterface jagexInterface = CursorType.aClass189_1243;
						CursorType.aClass189_1243 = null;
						final JagexInterface class189_35_ = Class49.aClass189_441;
						Class49.aClass189_441 = null;
						WorldInfo.aBoolean1419 = false;
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
							final InterfaceListener class120_sub10 = (InterfaceListener) Class120_Sub4.aClass105_2435.removeFront();
							if (class120_sub10 == null) {
								break;
							}
							final JagexInterface class189_36_ = class120_sub10.jagexInterface;
							if (class189_36_.componentIndex >= 0) {
								final JagexInterface class189_37_ = Class74.getJagexInterface(class189_36_.parent);
								if (class189_37_ == null || class189_37_.components == null || class189_37_.components.length <= class189_36_.componentIndex || class189_37_.components[class189_36_.componentIndex] != class189_36_) {
									continue;
								}
							}
							Class88.method744(class120_sub10);
						}
						for (;;) {
							final InterfaceListener class120_sub10 = (InterfaceListener) FileSystem.aClass105_456.removeFront();
							if (class120_sub10 == null) {
								break;
							}
							final JagexInterface class189_38_ = class120_sub10.jagexInterface;
							if (class189_38_.componentIndex >= 0) {
								final JagexInterface class189_39_ = Class74.getJagexInterface(class189_38_.parent);
								if (class189_39_ == null || class189_39_.components == null || class189_39_.components.length <= class189_38_.componentIndex || class189_38_ != class189_39_.components[class189_38_.componentIndex]) {
									continue;
								}
							}
							Class88.method744(class120_sub10);
						}
						for (;;) {
							final InterfaceListener class120_sub10 = (InterfaceListener) Class88.aClass105_829.removeFront();
							if (class120_sub10 == null) {
								break;
							}
							final JagexInterface class189_40_ = class120_sub10.jagexInterface;
							if (class189_40_.componentIndex >= 0) {
								final JagexInterface class189_41_ = Class74.getJagexInterface(class189_40_.parent);
								if (class189_41_ == null || class189_41_.components == null || class189_40_.componentIndex >= class189_41_.components.length || class189_41_.components[class189_40_.componentIndex] != class189_40_) {
									continue;
								}
							}
							Class88.method744(class120_sub10);
						}
						if (MapSceneType.worldMapInterface == null) {
							EnumType.anInt3450 = 0;
						}
						if (Class120_Sub12_Sub4.draggedComponent != null) {
							JavaObject.method1435();
						}
						if (Class86.staffLevel > 0 && NodeCache.heldKeys[82] && NodeCache.heldKeys[81] && AbstractBuffer.mouseWheelRotation != 0) {
							int i_42_ = Class173.gameLevel - AbstractBuffer.mouseWheelRotation;
							if (i_42_ < 0) {
								i_42_ = 0;
							} else if (i_42_ > 3) {
								i_42_ = 3;
							}
							ParticleNode.tele(TileParticleQueue.selfPlayer.walkQueueX[0] + GameEntity.currentBaseX, Class181.currentBaseZ + TileParticleQueue.selfPlayer.walkQueueZ[0], i_42_);
						}
						if (Class86.staffLevel <= 0 || !NodeCache.heldKeys[82] || !NodeCache.heldKeys[81]) {
							if (MapFunctionNode.anInt3479 != 2) {
								if (Class120_Sub12_Sub33.anInt3401 != 2) {
									if (ObjectCache.anInt122 != -1 && MapFunctionNode.anInt3479 == 0 && Class120_Sub12_Sub33.anInt3401 == 0) {
										final int i_43_ = (ObjectCache.anInt122 << 1) + -TileParticleQueue.selfPlayer.getSize() + 1 >> 1;
										final int i_44_ = (WaterfallShader.anInt2174 << 1) - TileParticleQueue.selfPlayer.getSize() + 1 >> 1;
										Class53_Sub1.method464(0, i_43_, i_44_);
										Class120_Sub12_Sub35.crossX = js5.lastClickX;
										IsaacCipher.crossY = Class120_Sub12_Sub36.lastClickY;
										Class120_Sub14_Sub22.crossState = 1;
										Class120_Sub12_Sub7.crossIndex = 0;
										MapFunctionNode.setFlagPosition(TileParticleQueue.selfPlayer.walkQueueX[0], 0, 0, true, 0, i_44_, TileParticleQueue.selfPlayer.walkQueueZ[0], 0, 0, i_43_);
									}
								} else {
									if (ObjectCache.anInt122 != -1) {
										Class120_Sub12_Sub11.outputStream.putByteIsaac(85);
										Class120_Sub12_Sub11.outputStream.putLEShortA(GameEntity.currentBaseX + ObjectCache.anInt122);
										Class120_Sub12_Sub11.outputStream.putLEShort(Class181.currentBaseZ + WaterfallShader.anInt2174);
										Class120_Sub14_Sub22.crossState = 1;
										Class120_Sub12_Sub7.crossIndex = 0;
										IsaacCipher.crossY = Class120_Sub12_Sub36.lastClickY;
										Class120_Sub12_Sub35.crossX = js5.lastClickX;
									}
									Class120_Sub12_Sub33.anInt3401 = 0;
								}
							} else {
								if (ObjectCache.anInt122 != -1) {
									Class120_Sub12_Sub11.outputStream.putByteIsaac(204);
									Class120_Sub12_Sub11.outputStream.putShortA(WaterfallShader.anInt2174 + Class181.currentBaseZ);
									Class120_Sub12_Sub11.outputStream.putShortA(JagexSocket.selectedSpellComponextIndex);
									Class120_Sub12_Sub11.outputStream.putInt2(AbstractMouseWheelHandler.selectedSpellInterfaceBitPacked);
									Class120_Sub12_Sub11.outputStream.putLEShort(ObjectCache.anInt122 + GameEntity.currentBaseX);
									Class120_Sub12_Sub35.crossX = js5.lastClickX;
									Class120_Sub14_Sub22.crossState = 1;
									Class120_Sub12_Sub7.crossIndex = 0;
									IsaacCipher.crossY = Class120_Sub12_Sub36.lastClickY;
								}
								MapFunctionNode.anInt3479 = 0;
							}
						} else {
							if (ObjectCache.anInt122 != -1) {
								ParticleNode.tele(ObjectCache.anInt122 + GameEntity.currentBaseX, WaterfallShader.anInt2174 + Class181.currentBaseZ, Class173.gameLevel);
							}
							MapFunctionNode.anInt3479 = Class120_Sub12_Sub33.anInt3401 = 0;
						}
						ObjectCache.anInt122 = -1;
						CursorType.method1918();
						if (jagexInterface != CursorType.aClass189_1243) {
							if (jagexInterface != null) {
								InterfaceClickMask.redrawInterface(jagexInterface);
							}
							if (CursorType.aClass189_1243 != null) {
								InterfaceClickMask.redrawInterface(CursorType.aClass189_1243);
							}
						}
						if (class189_35_ != Class49.aClass189_441 && Class120_Sub12_Sub21.anInt3291 == ParticleNode.anInt1031) {
							if (class189_35_ != null) {
								InterfaceClickMask.redrawInterface(class189_35_);
							}
							if (Class49.aClass189_441 != null) {
								InterfaceClickMask.redrawInterface(Class49.aClass189_441);
							}
						}
						if (Class49.aClass189_441 != null) {
							if (ParticleNode.anInt1031 < Class120_Sub12_Sub21.anInt3291) {
								ParticleNode.anInt1031++;
								if (Class120_Sub12_Sub21.anInt3291 == ParticleNode.anInt1031) {
									InterfaceClickMask.redrawInterface(Class49.aClass189_441);
								}
							}
						} else if (ParticleNode.anInt1031 > 0) {
							ParticleNode.anInt1031--;
						}
						for (int i_45_ = 0; i_45_ < 5; i_45_++) {
							LabelGroup.anIntArray2412[i_45_]++;
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
						if (Class30.packetCounterUpdated) {
							GroundObjectNode.sendInterfaceCounter();
							Class30.packetCounterUpdated = false;
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
