/* Class120_Sub12_Sub9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class120_Sub12_Sub9 extends Class120_Sub12 {
	private boolean aBoolean3192 = true;
	static int anInt3193;
	static boolean[] aBooleanArray3194 = new boolean[200];
	static int clickedMouseFunctionId = -1;
	private boolean aBoolean3197 = true;
	static int anInt3199 = 0;

	static final void method1244(final JagexInterface jagexInterface, final int x, final int y) {
		if (jagexInterface.actionType == 1) {
			InvType.addMenuOption(jagexInterface.tooltip, "", 0L, 0, jagexInterface.bitPacked, (short) 57, -1);
		}
		if (jagexInterface.actionType == 2 && !Class88.spellSelected) {
			final String string = Class33.getSpellPrefix(jagexInterface);
			if (string != null) {
				InvType.addMenuOption(string, new StringBuilder("<col=00ff00>").append(jagexInterface.spellNameoi).toString(), 0L, -1, jagexInterface.bitPacked, (short) 34, -1);
			}
		}
		if (jagexInterface.actionType == 3) {
			InvType.addMenuOption(Class5.aString2153, "", 0L, 0, jagexInterface.bitPacked, (short) 7, -1);
		}
		if (jagexInterface.actionType == 4) {
			InvType.addMenuOption(jagexInterface.tooltip, "", 0L, 0, jagexInterface.bitPacked, (short) 18, -1);
		}
		if (jagexInterface.actionType == 5) {
			InvType.addMenuOption(jagexInterface.tooltip, "", 0L, 0, jagexInterface.bitPacked, (short) 11, -1);
		}
		if (jagexInterface.actionType == 6 && Class156.aClass189_1454 == null) {
			InvType.addMenuOption(jagexInterface.tooltip, "", 0L, -1, jagexInterface.bitPacked, (short) 3, -1);
		}
		if (jagexInterface.type == 2) {
			int i_2_ = 0;
			for (int i_3_ = 0; jagexInterface.originalHeight > i_3_; i_3_++) {
				for (int i_4_ = 0; i_4_ < jagexInterface.originalWidth; i_4_++) {
					int i_5_ = i_4_ * (jagexInterface.objSpritePadX + 32);
					int i_6_ = i_3_ * (jagexInterface.objSpritePadY + 32);
					if (i_2_ < 20) {
						i_5_ += jagexInterface.spriteXs[i_2_];
						i_6_ += jagexInterface.spriteYs[i_2_];
					}
					if (x >= i_5_ && y >= i_6_ && i_5_ + 32 > x && y < 32 + i_6_) {
						ClanMember.anInt2572 = i_2_;
						StructType.aClass189_3588 = jagexInterface;
						if (jagexInterface.objIds[i_2_] > 0) {
							final InterfaceClickMask class120_sub20 = client.getClickMask(jagexInterface);
							final ObjType objType = ObjType.list(jagexInterface.objIds[i_2_] - 1);
							if (Light.objSelected != 1 || !class120_sub20.method1694()) {
								if (Class88.spellSelected && class120_sub20.method1694()) {
									final ParamType class120_sub14_sub11 = IdentityKit.selectedSpellParam == -1 ? null : ParamType.list(IdentityKit.selectedSpellParam);
									if ((0x10 & GroundTile.selectedSpellUseMask) != 0 && (class120_sub14_sub11 == null || objType.getIntegerParamValue(IdentityKit.selectedSpellParam, class120_sub14_sub11.defaultInt) != class120_sub14_sub11.defaultInt)) {
										InvType.addMenuOption(Class101.selectedSpellPrefix, new StringBuilder(Light.selectedSpellName).append(" -> <col=ff9040>").append(objType.name).toString(), objType.myId, i_2_, jagexInterface.bitPacked, (short) 50, Class150.selectedSpellTargetCursor);
									}
								} else {
									String[] options = objType.inventoryOptions;
									if (MouseHandler.showNumbersOnOptions) {
										options = Class120_Sub12_Sub36.addNumbers(options);
									}
									if (class120_sub20.method1694()) {
										for (int i_7_ = 4; i_7_ >= 3; i_7_--) {
											if (options != null && options[i_7_] != null) {
												short i_8_;
												if (i_7_ == 3) {
													i_8_ = (short) 10;
												} else {
													i_8_ = (short) 51;
												}
												InvType.addMenuOption(options[i_7_], new StringBuilder("<col=ff9040>").append(objType.name).toString(), objType.myId, i_2_, jagexInterface.bitPacked, i_8_, -1);
											}
										}
									}
									if (class120_sub20.method1687()) {
										InvType.addMenuOption(TextRepository.use, new StringBuilder("<col=ff9040>").append(objType.name).toString(), objType.myId, i_2_, jagexInterface.bitPacked, (short) 9, Class120_Sub12_Sub10.selectedObjectTargetCursor);
									}
									if (class120_sub20.method1694() && options != null) {
										for (int i_9_ = 2; i_9_ >= 0; i_9_--) {
											if (options[i_9_] != null) {
												short i_10_ = 0;
												if (i_9_ == 0) {
													i_10_ = (short) 58;
												}
												if (i_9_ == 1) {
													i_10_ = (short) 35;
												}
												if (i_9_ == 2) {
													i_10_ = (short) 17;
												}
												InvType.addMenuOption(options[i_9_], new StringBuilder("<col=ff9040>").append(objType.name).toString(), objType.myId, i_2_, jagexInterface.bitPacked, i_10_, -1);
											}
										}
									}
									options = jagexInterface.oiActions;
									if (MouseHandler.showNumbersOnOptions) {
										options = Class120_Sub12_Sub36.addNumbers(options);
									}
									if (options != null) {
										for (int i_11_ = 4; i_11_ >= 0; i_11_--) {
											if (options[i_11_] != null) {
												short i_12_ = 0;
												if (i_11_ == 0) {
													i_12_ = (short) 30;
												}
												if (i_11_ == 1) {
													i_12_ = (short) 20;
												}
												if (i_11_ == 2) {
													i_12_ = (short) 13;
												}
												if (i_11_ == 3) {
													i_12_ = (short) 2;
												}
												if (i_11_ == 4) {
													i_12_ = (short) 49;
												}
												InvType.addMenuOption(options[i_11_], new StringBuilder("<col=ff9040>").append(objType.name).toString(), objType.myId, i_2_, jagexInterface.bitPacked, i_12_, -1);
											}
										}
									}
									InvType.addMenuOption(TextRepository.examine, new StringBuilder("<col=ff9040>").append(objType.name).toString(), objType.myId, i_2_, jagexInterface.bitPacked, (short) 1001, Class120_Sub12_Sub11.anInt3211);
								}
							} else if (PlainTile.selectedObjInterface != jagexInterface.bitPacked || ParticleEmitter.selectedObjSlot != i_2_) {
								InvType.addMenuOption(TextRepository.use, new StringBuilder(Class192.selectedObjName).append(" -> <col=ff9040>").append(objType.name).toString(), objType.myId, i_2_, jagexInterface.bitPacked, (short) 15, -1);
							}
						}
					}
					i_2_++;
				}
			}
		}
		if (jagexInterface.newFormat) {
			if (Class88.spellSelected) {
				if (client.getClickMask(jagexInterface).method1692() && (0x20 & GroundTile.selectedSpellUseMask) != 0) {
					InvType.addMenuOption(Class101.selectedSpellPrefix, new StringBuilder(Light.selectedSpellName).append(" -> ").append(jagexInterface.spellNameni).toString(), 0L, jagexInterface.componentIndex, jagexInterface.bitPacked, (short) 1, Class150.selectedSpellTargetCursor);
				}
			} else {
				for (int i_13_ = 9; i_13_ >= 5; i_13_--) {
					final String string = JagexInterface.getActionNI(jagexInterface, i_13_);
					if (string != null) {
						InvType.addMenuOption(string, jagexInterface.spellNameni, 1 + i_13_, jagexInterface.componentIndex, jagexInterface.bitPacked, (short) 1009, JagexInterface.getCursor(jagexInterface, i_13_));
					}
				}
				final String string = Class33.getSpellPrefix(jagexInterface);
				if (string != null) {
					InvType.addMenuOption(string, jagexInterface.spellNameni, 0L, jagexInterface.componentIndex, jagexInterface.bitPacked, (short) 34, -1);
				}
				for (int i_14_ = 4; i_14_ >= 0; i_14_--) {
					final String string_15_ = JagexInterface.getActionNI(jagexInterface, i_14_);
					if (string_15_ != null) {
						InvType.addMenuOption(string_15_, jagexInterface.spellNameni, 1 + i_14_, jagexInterface.componentIndex, jagexInterface.bitPacked, (short) 23, JagexInterface.getCursor(jagexInterface, i_14_));
					}
				}
				if (client.getClickMask(jagexInterface).method1686()) {
					if (jagexInterface.actionSufix != null) {
						InvType.addMenuOption(jagexInterface.actionSufix, "", 0L, jagexInterface.componentIndex, jagexInterface.bitPacked, (short) 3, -1);
					} else {
						InvType.addMenuOption(TextRepository.continueString, "", 0L, jagexInterface.componentIndex, jagexInterface.bitPacked, (short) 3, -1);
					}
				}
			}
		}
	}

	@Override
	final int[] method1187(final int i_16_) {
		final int[] is_17_ = this.aClass30_2563.method258(i_16_);
		if (this.aClass30_2563.aBoolean238) {
			final int[] is_18_ = method1192(aBoolean3192 ? -i_16_ + Class120_Sub29.anInt2774 : i_16_, 0);
			if (!aBoolean3197) {
				ArrayUtils.arrayCopy(is_18_, 0, is_17_, 0, Class120_Sub12_Sub7.anInt3178);
			} else {
				for (int i_19_ = 0; Class120_Sub12_Sub7.anInt3178 > i_19_; i_19_++) {
					is_17_[i_19_] = is_18_[MagnetType.anInt259 - i_19_];
				}
			}
		}
		return is_17_;
	}

	@Override
	final void decode(final Buffer buffer, final int i_21_) {
		do {
			while_112_: do {
				do {
					if (i_21_ != 0) {
						if (i_21_ != 1) {
							if (i_21_ == 2) {
								break;
							}
							break while_112_;
						}
					} else {
						aBoolean3197 = buffer.getUByte() == 1;
						break while_112_;
					}
					aBoolean3192 = buffer.getUByte() == 1;
					break while_112_;
				} while (false);
				this.aBoolean2558 = buffer.getUByte() == 1;
			} while (false);
		} while (false);
	}

	static final void method1245(final GameEntity gameEntity, final int size) {
		if (Class101_Sub2.loopCycle < gameEntity.anInt3035) {
			Class166.method2180(gameEntity);
		} else if (gameEntity.anInt2961 < Class101_Sub2.loopCycle) {
			Class120_Sub12_Sub32.method1371(gameEntity);
		} else {
			Class111.method984(gameEntity);
		}
		if (gameEntity.x < 128 || gameEntity.z < 128 || gameEntity.x >= 13184 || gameEntity.z >= 13184) {
			gameEntity.anInt2961 = 0;
			gameEntity.anInt3035 = 0;
			gameEntity.spotAnimId = -1;
			gameEntity.animId = -1;
			gameEntity.x = gameEntity.walkQueueX[0] * 128 + (gameEntity.getSize() * 64);
			gameEntity.z = gameEntity.walkQueueZ[0] * 128 + (gameEntity.getSize() * 64);
			gameEntity.method2329();
		}
		if (TileParticleQueue.selfPlayer == gameEntity && (gameEntity.x < 1536 || gameEntity.z < 1536 || gameEntity.x >= 11776 || gameEntity.z >= 11776)) {
			gameEntity.spotAnimId = -1;
			gameEntity.anInt2961 = 0;
			gameEntity.anInt3035 = 0;
			gameEntity.animId = -1;
			gameEntity.x = gameEntity.walkQueueX[0] * 128 + (gameEntity.getSize() * 64);
			gameEntity.z = gameEntity.walkQueueZ[0] * 128 + (gameEntity.getSize() * 64);
			gameEntity.method2329();
		}
		ProducingGraphicsBuffer.method1850(gameEntity);
		GroundDecoration.animateEntity(gameEntity);
	}

	public Class120_Sub12_Sub9() {
		super(1, false);
	}

	@Override
	final int[][] method1188(final int i) {
		final int[][] is_24_ = this.aClass109_2559.method975(i);
		if (this.aClass109_2559.aBoolean1049) {
			final int[][] is_25_ = method1179(0, aBoolean3192 ? Class120_Sub29.anInt2774 + -i : i);
			final int[] is_26_ = is_25_[0];
			final int[] is_27_ = is_25_[1];
			final int[] is_28_ = is_24_[0];
			final int[] is_29_ = is_25_[2];
			final int[] is_30_ = is_24_[1];
			final int[] is_31_ = is_24_[2];
			if (aBoolean3197) {
				for (int i_32_ = 0; Class120_Sub12_Sub7.anInt3178 > i_32_; i_32_++) {
					is_28_[i_32_] = is_26_[MagnetType.anInt259 - i_32_];
					is_30_[i_32_] = is_27_[MagnetType.anInt259 + -i_32_];
					is_31_[i_32_] = is_29_[-i_32_ + MagnetType.anInt259];
				}
			} else {
				for (int i_33_ = 0; Class120_Sub12_Sub7.anInt3178 > i_33_; i_33_++) {
					is_28_[i_33_] = is_26_[i_33_];
					is_30_[i_33_] = is_27_[i_33_];
					is_31_[i_33_] = is_29_[i_33_];
				}
			}
		}
		return is_24_;
	}

}
