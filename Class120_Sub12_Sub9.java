/* Class120_Sub12_Sub9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class120_Sub12_Sub9 extends Class120_Sub12 {
	private boolean aBoolean3192 = true;
	static int anInt3193;
	static boolean[] aBooleanArray3194 = new boolean[200];
	static int clickedMouseFunctionId = -1;
	private boolean aBoolean3197 = true;
	static int playerModTrial = 0;

	static final void method1244(final JagexInterface jagexInterface, final int x, final int y) {
		if (jagexInterface.buttonType == 1) {
			InvType.addMenuOption(jagexInterface.tooltip, "", 0L, 0, jagexInterface.bitPacked, (short) 57, -1);
		}
		if (jagexInterface.buttonType == 2 && !Class88.spellSelected) {
			final String string = Class33.getSpellPrefix(jagexInterface);
			if (string != null) {
				InvType.addMenuOption(string, "<col=00ff00>" + jagexInterface.spellNameoi, 0L, -1, jagexInterface.bitPacked, (short) 34, -1);
			}
		}
		if (jagexInterface.buttonType == 3) {
			InvType.addMenuOption(StringLibrary.aString2153, "", 0L, 0, jagexInterface.bitPacked, (short) 7, -1);
		}
		if (jagexInterface.buttonType == 4) {
			InvType.addMenuOption(jagexInterface.tooltip, "", 0L, 0, jagexInterface.bitPacked, (short) 18, -1);
		}
		if (jagexInterface.buttonType == 5) {
			InvType.addMenuOption(jagexInterface.tooltip, "", 0L, 0, jagexInterface.bitPacked, (short) 11, -1);
		}
		if (jagexInterface.buttonType == 6 && Class156.dialogInterface == null) {
			InvType.addMenuOption(jagexInterface.tooltip, "", 0L, -1, jagexInterface.bitPacked, (short) 3, -1);
		}
		if (jagexInterface.type == 2) {
			int objIndex = 0;
			for (int h = 0; h < jagexInterface.originalHeight; h++) {
				for (int w = 0; w < jagexInterface.originalWidth; w++) {
					int objX = w * (jagexInterface.objSpritePadX + 32);
					int objY = h * (jagexInterface.objSpritePadY + 32);
					if (objIndex < 20) {
						objX += jagexInterface.spriteXs[objIndex];
						objY += jagexInterface.spriteYs[objIndex];
					}
					if (x >= objX && y >= objY && x < objX + 32 && y < objY + 32) {
						ClanMember.mouseOverInventoryObjectIndex = objIndex;
						StructType.mouseOverInventoryInterface = jagexInterface;
						if (jagexInterface.objIds[objIndex] > 0) {
							final InterfaceClickMask clickMask = client.getClickMask(jagexInterface);
							final ObjType objType = ObjType.list(jagexInterface.objIds[objIndex] - 1);
							if (Light.objSelected != 1 || !clickMask.hasObjectOptions()) {
								if (Class88.spellSelected && clickMask.hasObjectOptions()) {
									final ParamType paramType = Identikit.selectedSpellParam == -1 ? null : ParamType.list(Identikit.selectedSpellParam);
									if ((GroundTile.selectedSpellUseMask & 0x10) != 0 && (paramType == null || objType.getIntegerParamValue(Identikit.selectedSpellParam, paramType.defaultInt) != paramType.defaultInt)) {
										InvType.addMenuOption(Class101.selectedSpellPrefix, new StringBuilder(Light.selectedSpellName).append(" -> <col=ff9040>").append(objType.name).toString(), objType.myId, objIndex, jagexInterface.bitPacked, (short) 50, Class150.selectedSpellTargetCursor);
									}
								} else {
									String[] inventoryOptions = objType.inventoryOptions;
									if (MouseHandler.showNumbersOnOptions) {
										inventoryOptions = Class120_Sub12_Sub36.addNumbers(inventoryOptions);
									}
									if (clickMask.hasObjectOptions() && inventoryOptions != null) {
										for (int id = 4; id >= 3; id--) {
											if (inventoryOptions[id] != null) {
												short code;
												if (id == 3) {
													code = (short) 10;
												} else {
													code = (short) 51;
												}
												InvType.addMenuOption(inventoryOptions[id], "<col=ff9040>" + objType.name, objType.myId, objIndex, jagexInterface.bitPacked, code, -1);
											}
										}
									}
									if (clickMask.canUseObject()) {
										InvType.addMenuOption(StringLibrary.use, "<col=ff9040>" + objType.name, objType.myId, objIndex, jagexInterface.bitPacked, (short) 9, Class120_Sub12_Sub10.selectedObjectTargetCursor);
									}
									if (clickMask.hasObjectOptions() && inventoryOptions != null) {
										for (int id = 2; id >= 0; id--) {
											if (inventoryOptions[id] != null) {
												short code = 0;
												if (id == 0) {
													code = (short) 58;
												}
												if (id == 1) {
													code = (short) 35;
												}
												if (id == 2) {
													code = (short) 17;
												}
												InvType.addMenuOption(inventoryOptions[id], "<col=ff9040>" + objType.name, objType.myId, objIndex, jagexInterface.bitPacked, code, -1);
											}
										}
									}
									inventoryOptions = jagexInterface.if1Options;
									if (MouseHandler.showNumbersOnOptions) {
										inventoryOptions = Class120_Sub12_Sub36.addNumbers(inventoryOptions);
									}
									if (inventoryOptions != null) {
										for (int id = 4; id >= 0; id--) {
											if (inventoryOptions[id] != null) {
												short code = 0;
												if (id == 0) {
													code = (short) 30;
												}
												if (id == 1) {
													code = (short) 20;
												}
												if (id == 2) {
													code = (short) 13;
												}
												if (id == 3) {
													code = (short) 2;
												}
												if (id == 4) {
													code = (short) 49;
												}
												InvType.addMenuOption(inventoryOptions[id], "<col=ff9040>" + objType.name, objType.myId, objIndex, jagexInterface.bitPacked, code, -1);
											}
										}
									}
									InvType.addMenuOption(StringLibrary.examine, "<col=ff9040>" + objType.name, objType.myId, objIndex, jagexInterface.bitPacked, (short) 1001, Class120_Sub12_Sub11.examineOptionCursor);
								}
							} else if (PlainTile.selectedObjInterface != jagexInterface.bitPacked || ParticleEmitter.selectedObjSlot != objIndex) {
								InvType.addMenuOption(StringLibrary.use, Class192.selectedObjName + " -> <col=ff9040>" + objType.name, objType.myId, objIndex, jagexInterface.bitPacked, (short) 15, -1);
							}
						}
					}
					objIndex++;
				}
			}
		}
		if (jagexInterface.if3Format) {
			if (Class88.spellSelected) {
				if (client.getClickMask(jagexInterface).canUseSpellOnComponent() && (GroundTile.selectedSpellUseMask & 0x20) != 0) {
					InvType.addMenuOption(Class101.selectedSpellPrefix, new StringBuilder(Light.selectedSpellName).append(" -> ").append(jagexInterface.optionBase).toString(), 0L, jagexInterface.componentIndex, jagexInterface.bitPacked, (short) 1, Class150.selectedSpellTargetCursor);
				}
			} else {
				for (int i_13_ = 9; i_13_ >= 5; i_13_--) {
					final String string = JagexInterface.getActionNI(jagexInterface, i_13_);
					if (string != null) {
						InvType.addMenuOption(string, jagexInterface.optionBase, 1 + i_13_, jagexInterface.componentIndex, jagexInterface.bitPacked, (short) 1009, JagexInterface.getActionCursor(jagexInterface, i_13_));
					}
				}
				final String string = Class33.getSpellPrefix(jagexInterface);
				if (string != null) {
					InvType.addMenuOption(string, jagexInterface.optionBase, 0L, jagexInterface.componentIndex, jagexInterface.bitPacked, (short) 34, -1);
				}
				for (int i_14_ = 4; i_14_ >= 0; i_14_--) {
					final String string_15_ = JagexInterface.getActionNI(jagexInterface, i_14_);
					if (string_15_ != null) {
						InvType.addMenuOption(string_15_, jagexInterface.optionBase, 1 + i_14_, jagexInterface.componentIndex, jagexInterface.bitPacked, (short) 23, JagexInterface.getActionCursor(jagexInterface, i_14_));
					}
				}
				if (client.getClickMask(jagexInterface).isPauseButton()) {
					if (jagexInterface.pauseText != null) {
						InvType.addMenuOption(jagexInterface.pauseText, "", 0L, jagexInterface.componentIndex, jagexInterface.bitPacked, (short) 3, -1);
					} else {
						InvType.addMenuOption(StringLibrary.continueString, "", 0L, jagexInterface.componentIndex, jagexInterface.bitPacked, (short) 3, -1);
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
		if (Class101_Sub2.clientClock < gameEntity.anInt3035) {
			Class166.method2180(gameEntity);
		} else if (gameEntity.anInt2961 < Class101_Sub2.clientClock) {
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
