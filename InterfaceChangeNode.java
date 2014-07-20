/* Class120_Sub14_Sub7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class InterfaceChangeNode extends NodeSub {
	static int lastMousePress = 0;
	int anInt3484;
	static int[] anIntArray3485;
	int anInt3486;
	static long allocatingTime = 0L;
	static int[][] anIntArrayArray3488;
	static String clanName;
	static int anInt3490 = 0;
	static int[] menuOptionsCursorId;
	int anInt3492;
	String aString3493;

	static {
		anIntArrayArray3488 = new int[][] { new int[0], { 128, 0, 128, 128, 0, 128 }, { 0, 0, 128, 0, 128, 128, 64, 128 }, { 0, 128, 0, 0, 128, 0, 64, 128 }, { 0, 0, 64, 128, 0, 128 }, { 128, 128, 64, 128, 128, 0 }, { 64, 0, 128, 0, 128, 128, 64, 128 }, { 128, 0, 128, 128, 0, 128, 0, 64, 64, 0 },
				{ 0, 0, 64, 0, 0, 64 }, { 0, 0, 128, 0, 128, 128, 64, 96, 32, 64 }, { 0, 128, 0, 0, 32, 64, 64, 96, 128, 128 }, { 0, 128, 0, 0, 32, 32, 96, 32, 128, 0, 128, 128 } };
		clanName = null;
		menuOptionsCursorId = new int[500];
	}

	final int getType() {
		return (int) (this.uid >>> 32 & 0xffL);
	}

	final int getUid() {
		return (int) this.uid;
	}

	public static void method1451(final int i) {
		try {
			clanName = null;
			if (i <= 30) {
				method1451(106);
			}
			anIntArrayArray3488 = null;
			menuOptionsCursorId = null;
			anIntArray3485 = null;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("g.H(").append(i).append(')').toString());
		}
	}

	static final void build3dScreenMenu(final int i, final int i_2_, final int i_3_, final int i_4_, final int i_5_, final int i_7_) {
		if (Light.objSelected == 0) {
			final int i_8_ = IntegerNode.anInt2792;
			final int i_9_ = Class120_Sub12_Sub16.anInt3253;
			final int i_10_ = Class190.anInt2100;
			final int i_12_ = Class120_Sub30_Sub1.anInt3672;
			final int i_11_ = (i_9_ - i_8_) * (i_2_ - i_4_) / i_5_ + i_8_;
			final int i_13_ = i_10_ + (i_12_ - i_10_) * (i_7_ - i_3_) / i;
			if (!Class88.spellSelected || (0x40 & GroundTile.selectedSpellUseMask) == 0) {
				if (Buffer.gameId == 1) {
					InvType.addMenuOption(Class82.aString787, "", 0L, i_11_, i_13_, (short) 47, -1);
				}
				InvType.addMenuOption(Npc.aString3752, "", 0L, i_11_, i_13_, (short) 26, -1);
			} else {
				final JagexInterface jagexInterface = JagexInterface.getComponent(AbstractMouseWheelHandler.selectedSpellInterfaceBitPacked, JagexSocket.anInt420);
				if (jagexInterface == null) {
					Node.deselectSpell();
				} else {
					InvType.addMenuOption(Class101.aString963, " ->", 0L, i_11_, i_13_, (short) 19, Class150.selectedSpellTargetCursor);
				}
			}
		}
		long oldBitPacked = -1L;
		for (int action = 0; action < Class186.actionsLen; action++) {
			final long bitPacked = Class120_Sub12_Sub21.actions[action];
			final int x = (int) bitPacked & 0x7f;
			final int z = (int) bitPacked >> 7 & 0x7f;
			final int index = 0x7fffffff & (int) (bitPacked >>> 32);
			final int type = 0x3 & (int) bitPacked >> 29;
			if (oldBitPacked != bitPacked) {
				oldBitPacked = bitPacked;
				if (type == 2 && Class53_Sub1.bitPackedMatch(Class173.gameLevel, x, z, bitPacked)) {
					LocType locType = LocType.list(index);
					if (locType.childrenIDs != null) {
						locType = locType.handleVarp();
					}
					if (locType == null) {
						continue;
					}
					if (Light.objSelected == 1) {
						InvType.addMenuOption(AbstractGraphicsBuffer.aString1176, new StringBuilder(Class192.selectedObjName).append(" -> <col=00ffff>").append(locType.name).toString(), bitPacked, x, z, (short) 16, Class120_Sub12_Sub10.anInt3205);
					} else if (Class88.spellSelected) {
						final ParamType class120_sub14_sub11 = IdentityKit.selectedSpellParam == -1 ? null : ParamType.list(IdentityKit.selectedSpellParam);
						if ((0x4 & GroundTile.selectedSpellUseMask) != 0 && (class120_sub14_sub11 == null || locType.getIntegerParamValue(IdentityKit.selectedSpellParam, class120_sub14_sub11.defaultInt) != class120_sub14_sub11.defaultInt)) {
							InvType.addMenuOption(Class101.aString963, new StringBuilder(Light.aString369).append(" -> <col=00ffff>").append(locType.name).toString(), bitPacked, x, z, (short) 4, Class150.selectedSpellTargetCursor);
						}
					} else {
						String[] actions = locType.actions;
						if (MouseHandler.showNumbersOnActions) {
							actions = Class120_Sub12_Sub36.addNumbers(actions);
						}
						if (actions != null) {
							for (int actionId = 4; actionId >= 0; actionId--) {
								if (actions[actionId] != null) {
									short opcode = 0;
									if (actionId == 0) {
										opcode = (short) 41;
									}
									if (actionId == 1) {
										opcode = (short) 37;
									}
									if (actionId == 2) {
										opcode = (short) 32;
									}
									if (actionId == 3) {
										opcode = (short) 40;
									}
									if (actionId == 4) {
										opcode = (short) 1005;
									}
									int cursorId = -1;
									if (actionId == locType.cursor1op) {
										cursorId = locType.cursor1;
									}
									if (actionId == locType.cursor2op) {
										cursorId = locType.cursor2;
									}
									InvType.addMenuOption(actions[actionId], "<col=00ffff>" + locType.name, bitPacked, x, z, opcode, cursorId);
								}
							}
						}
						InvType.addMenuOption(Class11.aString81, "<col=00ffff>" + locType.name, locType.myId, x, z, (short) 1007, Class120_Sub12_Sub11.anInt3211);
					}
				}
				if (type == 1) {
					final Npc npc = Class120_Sub12_Sub11.npcList[index];
					if ((0x1 & npc.npcType.size) == 0 && (npc.x & 0x7f) == 0 && (npc.z & 0x7f) == 0 || (npc.npcType.size & 0x1) == 1 && (npc.x & 0x7f) == 64 && (0x7f & npc.z) == 64) {
						final int i_23_ = -((npc.npcType.size + -1) * 64) + npc.x;
						final int i_24_ = -(64 * npc.npcType.size) - (-64 - npc.z);
						for (int id = 0; id < Class148.localNpcCount; id++) {
							final Npc class180_sub5_sub2_26_ = Class120_Sub12_Sub11.npcList[Class120_Sub12_Sub36.localNpcIndices[id]];
							if (class180_sub5_sub2_26_ != null && !class180_sub5_sub2_26_.hasMenuAction && class180_sub5_sub2_26_ != npc && class180_sub5_sub2_26_.aBoolean2992) {
								final int i_27_ = class180_sub5_sub2_26_.x + -(64 * (class180_sub5_sub2_26_.npcType.size - 1));
								final int i_28_ = class180_sub5_sub2_26_.z - 64 * (class180_sub5_sub2_26_.npcType.size - 1);
								if (i_27_ >= i_23_ && class180_sub5_sub2_26_.npcType.size <= -(i_27_ - i_23_ >> 7) + npc.npcType.size && i_28_ >= i_24_ && npc.npcType.size - (-i_24_ + i_28_ >> 7) >= class180_sub5_sub2_26_.npcType.size) {
									FrameLoader.method1580(class180_sub5_sub2_26_.npcType, 106, z, Class120_Sub12_Sub36.localNpcIndices[id], x);
									class180_sub5_sub2_26_.hasMenuAction = true;
								}
							}
						}
						for (int i_29_ = 0; i_29_ < FileSystemWorker.localPlayerCount; i_29_++) {
							final Player class180_sub5_sub1 = Class118.playersList[Class112.playerIndices[i_29_]];
							if (class180_sub5_sub1 != null && !class180_sub5_sub1.hasMenuAction && class180_sub5_sub1.aBoolean2992) {
								final int i_30_ = class180_sub5_sub1.x - 64 * (-1 + class180_sub5_sub1.getSize());
								final int i_31_ = class180_sub5_sub1.z + -(64 * (class180_sub5_sub1.getSize() + -1));
								if (i_30_ >= i_23_ && class180_sub5_sub1.getSize() <= npc.npcType.size + -(-i_23_ + i_30_ >> 7) && i_24_ <= i_31_ && class180_sub5_sub1.getSize() <= npc.npcType.size - (i_31_ - i_24_ >> 7)) {
									IdentityKit.method1984(class180_sub5_sub1, z, Class112.playerIndices[i_29_], x);
									class180_sub5_sub1.hasMenuAction = true;
								}
							}
						}
					}
					if (npc.hasMenuAction) {
						continue;
					}
					FrameLoader.method1580(npc.npcType, 120, z, index, x);
					npc.hasMenuAction = true;
				}
				if (type == 0) {
					final Player class180_sub5_sub1 = Class118.playersList[index];
					if ((0x7f & class180_sub5_sub1.x) == 64 && (class180_sub5_sub1.z & 0x7f) == 64) {
						final int i_32_ = class180_sub5_sub1.x - (class180_sub5_sub1.getSize() - 1) * 64;
						final int i_33_ = class180_sub5_sub1.z + -((-1 + class180_sub5_sub1.getSize()) * 64);
						for (int i_34_ = 0; i_34_ < Class148.localNpcCount; i_34_++) {
							final Npc class180_sub5_sub2 = Class120_Sub12_Sub11.npcList[Class120_Sub12_Sub36.localNpcIndices[i_34_]];
							if (class180_sub5_sub2 != null && !class180_sub5_sub2.hasMenuAction && class180_sub5_sub2.aBoolean2992) {
								final int i_35_ = class180_sub5_sub2.x + -(64 * (-1 + class180_sub5_sub2.npcType.size));
								final int i_36_ = -(64 * (-1 + class180_sub5_sub2.npcType.size)) + class180_sub5_sub2.z;
								if (i_32_ <= i_35_ && class180_sub5_sub2.npcType.size <= class180_sub5_sub1.getSize() - (i_35_ - i_32_ >> 7) && i_33_ <= i_36_ && class180_sub5_sub2.npcType.size <= class180_sub5_sub1.getSize() + -(i_36_ + -i_33_ >> 7)) {
									FrameLoader.method1580(class180_sub5_sub2.npcType, 108, z, Class120_Sub12_Sub36.localNpcIndices[i_34_], x);
									class180_sub5_sub2.hasMenuAction = true;
								}
							}
						}
						for (int i_37_ = 0; FileSystemWorker.localPlayerCount > i_37_; i_37_++) {
							final Player class180_sub5_sub1_38_ = Class118.playersList[Class112.playerIndices[i_37_]];
							if (class180_sub5_sub1_38_ != null && !class180_sub5_sub1_38_.hasMenuAction && class180_sub5_sub1_38_ != class180_sub5_sub1 && class180_sub5_sub1_38_.aBoolean2992) {
								final int i_39_ = class180_sub5_sub1_38_.x - (class180_sub5_sub1_38_.getSize() + -1) * 64;
								final int i_40_ = class180_sub5_sub1_38_.z + 64 + -(64 * class180_sub5_sub1_38_.getSize());
								if (i_39_ >= i_32_ && class180_sub5_sub1_38_.getSize() <= -(-i_32_ + i_39_ >> 7) + class180_sub5_sub1.getSize() && i_33_ <= i_40_ && class180_sub5_sub1_38_.getSize() <= class180_sub5_sub1.getSize() - (i_40_ - i_33_ >> 7)) {
									IdentityKit.method1984(class180_sub5_sub1_38_, z, Class112.playerIndices[i_37_], x);
									class180_sub5_sub1_38_.hasMenuAction = true;
								}
							}
						}
					}
					if (class180_sub5_sub1.hasMenuAction) {
						continue;
					}
					IdentityKit.method1984(class180_sub5_sub1, z, index, x);
					class180_sub5_sub1.hasMenuAction = true;
				}
				if (type == 3) {
					final Deque deque = ClientScript.groundObjects[Class173.gameLevel][x][z];
					if (deque != null) {
						for (GroundObjectNode groundObjectNode = (GroundObjectNode) deque.getLast(); groundObjectNode != null; groundObjectNode = (GroundObjectNode) deque.getPrevious()) {
							final int objectId = groundObjectNode.aClass180_Sub1_3630.id;
							final ObjType objType = ObjType.list(objectId);
							if (Light.objSelected != 1) {
								if (Class88.spellSelected) {
									final ParamType class120_sub14_sub11 = (IdentityKit.selectedSpellParam ^ 0xffffffff) == 0 ? null : ParamType.list(IdentityKit.selectedSpellParam);
									if ((0x1 & GroundTile.selectedSpellUseMask) != 0 && (class120_sub14_sub11 == null || objType.getIntegerParamValue(class120_sub14_sub11.defaultInt, IdentityKit.selectedSpellParam) != class120_sub14_sub11.defaultInt)) {
										InvType.addMenuOption(Class101.aString963, new StringBuilder(Light.aString369).append(" -> <col=ff9040>").append(objType.name).toString(), objectId, x, z, (short) 48, Class150.selectedSpellTargetCursor);
									}
								} else {
									String[] strings = objType.options;
									if (MouseHandler.showNumbersOnActions) {
										strings = Class120_Sub12_Sub36.addNumbers(strings);
									}
									for (int i_42_ = 4; i_42_ >= 0; i_42_--) {
										if (strings != null && strings[i_42_] != null) {
											int i_43_ = -1;
											if (objType.cursor1op == i_42_) {
												i_43_ = objType.cursor1;
											}
											if (objType.cursor2op == i_42_) {
												i_43_ = objType.cursor2;
											}
											short i_44_ = 0;
											if (i_42_ == 0) {
												i_44_ = (short) 45;
											}
											if (i_42_ == 1) {
												i_44_ = (short) 46;
											}
											if (i_42_ == 2) {
												i_44_ = (short) 38;
											}
											if (i_42_ == 3) {
												i_44_ = (short) 6;
											}
											if (i_42_ == 4) {
												i_44_ = (short) 44;
											}
											InvType.addMenuOption(strings[i_42_], new StringBuilder("<col=ff9040>").append(objType.name).toString(), objectId, x, z, i_44_, i_43_);
										}
									}
									InvType.addMenuOption(Class11.aString81, new StringBuilder("<col=ff9040>").append(objType.name).toString(), objectId, x, z, (short) 1004, Class120_Sub12_Sub11.anInt3211);
								}
							} else {
								InvType.addMenuOption(AbstractGraphicsBuffer.aString1176, new StringBuilder(Class192.selectedObjName).append(" -> <col=ff9040>").append(objType.name).toString(), objectId, x, z, (short) 28, Class120_Sub12_Sub10.anInt3205);
							}
						}
					}
				}
			}
		}
	}

	final void method1453() {
		this.subUid = TimeUtil.getSafeTime() + 500L | this.subUid & ~0x7fffffffffffffffL;
		AbstractMouseWheelHandler.aClass177_114.insertLast(this);
	}

	final void method1454() {
		this.subUid |= ~0x7fffffffffffffffL;
		if (method1456() == 0L) {
			Class88.aClass177_831.insertLast(this);
		}
	}

	static final void method1455(final js5 js5, final Interface1 interface1, final js5 class50_45_) {
		Class24.aClass50_143 = class50_45_;
		IsaacCipher.aClass50_1011 = js5;
		Class120_Sub21.anInterface1_2668 = interface1;
		if (Class24.aClass50_143 != null) {
			Class32.anInt269 = Class24.aClass50_143.getFileAmount(1);
		}
		if (IsaacCipher.aClass50_1011 != null) {
			Class192.anInt2120 = IsaacCipher.aClass50_1011.getFileAmount(1);
		}
	}

	final long method1456() {
		return this.subUid & 0x7fffffffffffffffL;
	}

	static final void method761(final String string, final int i_5_) {
		final InterfaceChangeNode class120_sub14_sub7 = AbstractObject.putInterfaceChange(3, i_5_);
		class120_sub14_sub7.method1454();
		class120_sub14_sub7.aString3493 = string;
	}

	static final InterfaceChangeNode poll() {
		final InterfaceChangeNode class120_sub14_sub7_13_ = (InterfaceChangeNode) Class88.aClass177_831.peekFirst();
		if (class120_sub14_sub7_13_ != null) {
			class120_sub14_sub7_13_.unlink();
			class120_sub14_sub7_13_.unlinkSub();
			return class120_sub14_sub7_13_;
		}
		InterfaceChangeNode class120_sub14_sub7_14_;
		do {
			class120_sub14_sub7_14_ = (InterfaceChangeNode) AbstractMouseWheelHandler.aClass177_114.peekFirst();
			if (class120_sub14_sub7_14_ == null) {
				return null;
			}
			if ((class120_sub14_sub7_14_.method1456() ^ 0xffffffffffffffffL) < (TimeUtil.getSafeTime() ^ 0xffffffffffffffffL)) {
				return null;
			}
			class120_sub14_sub7_14_.unlink();
			class120_sub14_sub7_14_.unlinkSub();
		} while ((class120_sub14_sub7_14_.subUid & ~0x7fffffffffffffffL) == 0L);
		return class120_sub14_sub7_14_;
	}

	InterfaceChangeNode(final int i, final int i_46_) {
		this.uid = (long) i << 32 | i_46_;
	}

	static final LDIndexedSprite[] constructLDIndexedSprites(final js5 js5, final int i_48_) {
		if (!Class10.decodedSprites(js5, i_48_, 0)) {
			return null;
		}
		return AbstractRequest.constructLDIndexedSprites();
	}
}
