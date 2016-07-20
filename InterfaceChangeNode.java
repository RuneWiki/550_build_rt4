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

	static final void build3dScreenMenu(final int interfaceX, final int interfaceY, final int interfaceWidth, final int interfaceHeight, final int mouseX, final int mouseY) {
		if (Light.objSelected == 0) {
			final int left = Rasterizer.viewportLeft;
			final int right = Rasterizer.viewportRight;
			final int top = Rasterizer.viewportTop;
			final int bottom = Rasterizer.viewportBottom;
			final int mouseOffFromCenterX = left + (right - left) * (mouseX - interfaceX) / interfaceWidth;
			final int mouseOffFromCenterY = top + (bottom - top) * (mouseY - interfaceY) / interfaceHeight;
			if (Class88.spellSelected && (GroundTile.selectedSpellUseMask & 0x40) != 0) {
				final JagexInterface jagexInterface = JagexInterface.getComponent(AbstractMouseWheelHandler.selectedSpellInterfaceBitPacked, JagexSocket.selectedSpellComponextIndex);
				if (jagexInterface == null) {
					Node.targetLeave();
				} else {
					InvType.addMenuOption(Class101.selectedSpellPrefix, " ->", 0L, mouseOffFromCenterX, mouseOffFromCenterY, (short) 19, Class150.selectedSpellTargetCursor);
				}
			} else {
				if (Buffer.gameId == 1) {
					InvType.addMenuOption(StringLibrary.faceHere, "", 0L, mouseOffFromCenterX, mouseOffFromCenterY, (short) 47, -1);
				}
				InvType.addMenuOption(StringLibrary.walkText, "", 0L, mouseOffFromCenterX, mouseOffFromCenterY, (short) 26, -1);
			}
		}
		long oldBitPacked = -1L;
		for (int action = 0; action < AbstractModelRenderer.actionsLen; action++) {
			final long bitPacked = Class120_Sub12_Sub21.actions[action];
			final int x = (int) bitPacked & 0x7f;
			final int z = (int) bitPacked >> 7 & 0x7f;
			final int index = 0x7fffffff & (int) (bitPacked >>> 32);
			final int type = 0x3 & (int) bitPacked >> 29;
			if (oldBitPacked != bitPacked) {
				oldBitPacked = bitPacked;
				if (type == 2 && Class53_Sub1.bitPackedMatch(x, z, Class173.gameLevel, bitPacked)) {
					LocType locType = LocType.list(index);
					if (locType.transmogrificationIds != null) {
						locType = locType.handleVarp();
					}
					if (locType == null) {
						continue;
					}
					if (Light.objSelected == 1) {
						InvType.addMenuOption(StringLibrary.use, Class192.selectedObjName + " -> <col=00ffff>" + locType.name, bitPacked, x, z, (short) 16, Class120_Sub12_Sub10.selectedObjectTargetCursor);
					} else if (Class88.spellSelected) {
						final ParamType paramType = Identikit.selectedSpellParam != -1 ? ParamType.list(Identikit.selectedSpellParam) : null;
						if ((GroundTile.selectedSpellUseMask & 0x4) != 0 && (paramType == null || locType.getIntegerParamValue(Identikit.selectedSpellParam, paramType.defaultInt) != paramType.defaultInt)) {
							InvType.addMenuOption(Class101.selectedSpellPrefix, Light.selectedSpellName + " -> <col=00ffff>" + locType.name, bitPacked, x, z, (short) 4, Class150.selectedSpellTargetCursor);
						}
					} else {
						String[] options = locType.options;
						if (MouseHandler.showNumbersOnOptions) {
							options = Class120_Sub12_Sub36.addNumbers(options);
						}
						if (options != null) {
							for (int optionId = 4; optionId >= 0; optionId--) {
								if (options[optionId] != null) {
									short code = 0;
									if (optionId == 0) {
										code = (short) 41;
									}
									if (optionId == 1) {
										code = (short) 37;
									}
									if (optionId == 2) {
										code = (short) 32;
									}
									if (optionId == 3) {
										code = (short) 40;
									}
									if (optionId == 4) {
										code = (short) 1005;
									}
									int cursorId = -1;
									if (optionId == locType.cursor1op) {
										cursorId = locType.cursor1;
									}
									if (optionId == locType.cursor2op) {
										cursorId = locType.cursor2;
									}
									InvType.addMenuOption(options[optionId], "<col=00ffff>" + locType.name, bitPacked, x, z, code, cursorId);
								}
							}
						}
						InvType.addMenuOption(StringLibrary.examine, "<col=00ffff>" + locType.name, locType.myId, x, z, (short) 1007, Class120_Sub12_Sub11.examineOptionCursor);
					}
				}
				if (type == 1) {
					final Npc npc = Class120_Sub12_Sub11.npcList[index];
					if ((npc.npcType.size & 0x1) == 0 && (npc.x & 0x7f) == 0 && (npc.z & 0x7f) == 0 || (npc.npcType.size & 0x1) == 1 && (npc.x & 0x7f) == 64 && (npc.z & 0x7f) == 64) {
						final int npcX = npc.x - (npc.npcType.size - 1) * 64;
						final int npcZ = npc.z - (npc.npcType.size - 1) * 64;
						for (int id = 0; id < Class148.localNpcCount; id++) {
							final Npc onTopNpc = Class120_Sub12_Sub11.npcList[Class120_Sub12_Sub36.npcIndices[id]];
							if (onTopNpc != null && !onTopNpc.hasMenuAction && onTopNpc != npc && onTopNpc.needToRender) {
								final int onTopNpcX = onTopNpc.x - (onTopNpc.npcType.size - 1) * 64;
								final int onTopNpcZ = onTopNpc.z - (onTopNpc.npcType.size - 1) * 64;
								if (npcX <= onTopNpcX && npc.npcType.size - (onTopNpcX - npcX >> 7) >= onTopNpc.npcType.size && npcZ <= onTopNpcZ && npc.npcType.size - (onTopNpcZ - npcZ >> 7) >= onTopNpc.npcType.size) {
									FrameGroup.buildNpcMenu(onTopNpc.npcType, x, z, Class120_Sub12_Sub36.npcIndices[id]);
									onTopNpc.hasMenuAction = true;
								}
							}
						}
						for (int id = 0; id < FileSystemWorker.localPlayerCount; id++) {
							final Player onTopPlayer = Class118.playersList[Class112.playerIndices[id]];
							if (onTopPlayer != null && !onTopPlayer.hasMenuAction && onTopPlayer.needToRender) {
								final int onTopPlayerX = onTopPlayer.x - (onTopPlayer.getSize() - 1) * 64;
								final int onTopPlayerZ = onTopPlayer.z - (onTopPlayer.getSize() - 1) * 64;
								if (npcX <= onTopPlayerX && npc.npcType.size - (onTopPlayerX - npcX >> 7) >= onTopPlayer.getSize() && npcZ <= onTopPlayerZ && npc.npcType.size - (onTopPlayerZ - npcZ >> 7) >= onTopPlayer.getSize()) {
									Identikit.buildPlayerMenu(onTopPlayer, x, z, Class112.playerIndices[id]);
									onTopPlayer.hasMenuAction = true;
								}
							}
						}
					}
					if (npc.hasMenuAction) {
						continue;
					}
					FrameGroup.buildNpcMenu(npc.npcType, x, z, index);
					npc.hasMenuAction = true;
				}
				if (type == 0) {
					final Player player = Class118.playersList[index];
					if ((player.x & 0x7f) == 64 && (player.z & 0x7f) == 64) {
						final int playerX = player.x - (player.getSize() - 1) * 64;
						final int playerZ = player.z - (player.getSize() - 1) * 64;
						for (int id = 0; id < Class148.localNpcCount; id++) {
							final Npc onTopNpc = Class120_Sub12_Sub11.npcList[Class120_Sub12_Sub36.npcIndices[id]];
							if (onTopNpc != null && !onTopNpc.hasMenuAction && onTopNpc.needToRender) {
								final int onTopNpcX = onTopNpc.x - (onTopNpc.npcType.size - 1) * 64;
								final int onTopNpcZ = onTopNpc.z - (onTopNpc.npcType.size - 1) * 64;
								if (playerX <= onTopNpcX && player.getSize() - (onTopNpcX - playerX >> 7) >= onTopNpc.npcType.size && playerZ <= onTopNpcZ && player.getSize() - (onTopNpcZ - playerZ >> 7) >= onTopNpc.npcType.size) {
									FrameGroup.buildNpcMenu(onTopNpc.npcType, x, z, Class120_Sub12_Sub36.npcIndices[id]);
									onTopNpc.hasMenuAction = true;
								}
							}
						}
						for (int id = 0; id < FileSystemWorker.localPlayerCount; id++) {
							final Player onTopPlayer = Class118.playersList[Class112.playerIndices[id]];
							if (onTopPlayer != null && !onTopPlayer.hasMenuAction && onTopPlayer != player && onTopPlayer.needToRender) {
								final int onTopPlayerX = onTopPlayer.x - (onTopPlayer.getSize() - 1) * 64;
								final int onTopPlayerZ = onTopPlayer.z - (onTopPlayer.getSize() - 1) * 64;
								if (playerX <= onTopPlayerX && player.getSize() - (onTopPlayerX - playerX >> 7) >= onTopPlayer.getSize() && playerZ <= onTopPlayerZ && player.getSize() - (onTopPlayerZ - playerZ >> 7) >= onTopPlayer.getSize()) {
									Identikit.buildPlayerMenu(onTopPlayer, x, z, Class112.playerIndices[id]);
									onTopPlayer.hasMenuAction = true;
								}
							}
						}
					}
					if (player.hasMenuAction) {
						continue;
					}
					Identikit.buildPlayerMenu(player, x, z, index);
					player.hasMenuAction = true;
				}
				if (type == 3) {
					final Deque deque = ClientScript.groundObjects[Class173.gameLevel][x][z];
					if (deque != null) {
						for (GroundObjectNode groundObjectNode = (GroundObjectNode) deque.getLast(); groundObjectNode != null; groundObjectNode = (GroundObjectNode) deque.getPrevious()) {
							final int objectId = groundObjectNode.sceneGroundObject.id;
							final ObjType objType = ObjType.list(objectId);
							if (Light.objSelected != 1) {
								if (Class88.spellSelected) {
									final ParamType paramType = Identikit.selectedSpellParam != -1 ? ParamType.list(Identikit.selectedSpellParam) : null;
									if ((GroundTile.selectedSpellUseMask & 0x1) != 0 && (paramType == null || objType.getIntegerParamValue(Identikit.selectedSpellParam, paramType.defaultInt) != paramType.defaultInt)) {
										InvType.addMenuOption(Class101.selectedSpellPrefix, Light.selectedSpellName + " -> <col=ff9040>" + objType.name, objectId, x, z, (short) 48, Class150.selectedSpellTargetCursor);
									}
								} else {
									String[] options = objType.options;
									if (MouseHandler.showNumbersOnOptions) {
										options = Class120_Sub12_Sub36.addNumbers(options);
									}
									for (int optionId = 4; optionId >= 0; optionId--) {
										if (options != null && options[optionId] != null) {
											short code = 0;
											if (optionId == 0) {
												code = (short) 45;
											}
											if (optionId == 1) {
												code = (short) 46;
											}
											if (optionId == 2) {
												code = (short) 38;
											}
											if (optionId == 3) {
												code = (short) 6;
											}
											if (optionId == 4) {
												code = (short) 44;
											}
											int cursorId = -1;
											if (objType.cursor1op == optionId) {
												cursorId = objType.cursor1;
											}
											if (objType.cursor2op == optionId) {
												cursorId = objType.cursor2;
											}
											InvType.addMenuOption(options[optionId], "<col=ff9040>" + objType.name, objectId, x, z, code, cursorId);
										}
									}
									InvType.addMenuOption(StringLibrary.examine, "<col=ff9040>" + objType.name, objectId, x, z, (short) 1004, Class120_Sub12_Sub11.examineOptionCursor);
								}
							} else {
								InvType.addMenuOption(StringLibrary.use, Class192.selectedObjName + " -> <col=ff9040>" + objType.name, objectId, x, z, (short) 28, Class120_Sub12_Sub10.selectedObjectTargetCursor);
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

	final long method1456() {
		return this.subUid & 0x7fffffffffffffffL;
	}

	static final InterfaceChangeNode putInterfaceChange(final int type, final int uid) {
		InterfaceChangeNode interfaceChangeNode = (InterfaceChangeNode) QuickChatMessageType.interfaceChangeCache.get((long) type << 32 | uid);
		if (interfaceChangeNode == null) {
			interfaceChangeNode = new InterfaceChangeNode(type, uid);
			QuickChatMessageType.interfaceChangeCache.put(interfaceChangeNode, interfaceChangeNode.uid);
		}
		return interfaceChangeNode;
	}

	static final void method761(final String string, final int i_5_) {
		final InterfaceChangeNode class120_sub14_sub7 = InterfaceChangeNode.putInterfaceChange(3, i_5_);
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

	InterfaceChangeNode(final int type, final int uid) {
		this.uid = (long) type << 32 | uid;
	}

	static final LDIndexedSprite[] constructLDIndexedSprites(final js5 js5, final int i_48_) {
		if (!Class10.decodedSprites(js5, i_48_, 0)) {
			return null;
		}
		return AbstractRequest.constructLDIndexedSprites();
	}
}
