/* Class87 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;

abstract class AbstractTimer {
	static Deque aClass105_824 = new Deque();
	static JagexSocket worldConnection;

	abstract int sleep(int i, int i_1_);

	static final void method734(final int i, final int i_2_, final int i_3_, final int i_4_, final int i_5_, final int i_6_, final int i_7_) {
		final Class188 class188 = new Class188();
		class188.anInt1916 = i_2_ / 128;
		class188.anInt1910 = i_3_ / 128;
		class188.anInt1923 = i_4_ / 128;
		class188.anInt1919 = i_5_ / 128;
		class188.anInt1915 = i;
		class188.anInt1913 = i_2_;
		class188.anInt1924 = i_3_;
		class188.anInt1911 = i_4_;
		class188.anInt1927 = i_5_;
		class188.anInt1920 = i_6_;
		class188.anInt1928 = i_7_;
		SceneGraphNode.aClass188Array1782[Class49.anInt438++] = class188;
	}

	static final boolean method737() throws IOException {
		if (worldConnection == null) {
			return false;
		}
		int availableBytes = worldConnection.getAvailable();
		if (availableBytes == 0) {
			return false;
		}
		if (client.packetType == -1) {
			worldConnection.read(Canvas_Sub1.inputStream.buf, 0, 1);
			Canvas_Sub1.inputStream.pos = 0;
			availableBytes--;
			client.packetType = Canvas_Sub1.inputStream.getUByteIsaac();
			AbstractMouseWheelHandler.packetSize = Class93.packetSizes[client.packetType];
		}
		if (AbstractMouseWheelHandler.packetSize == -1) {
			if (availableBytes <= 0) {
				return false;
			}
			availableBytes--;
			worldConnection.read(Canvas_Sub1.inputStream.buf, 0, 1);
			AbstractMouseWheelHandler.packetSize = 0xff & Canvas_Sub1.inputStream.buf[0];
		}
		if (AbstractMouseWheelHandler.packetSize == -2) {
			if (availableBytes > 1) {
				availableBytes -= 2;
				worldConnection.read(Canvas_Sub1.inputStream.buf, 0, 2);
				Canvas_Sub1.inputStream.pos = 0;
				AbstractMouseWheelHandler.packetSize = Canvas_Sub1.inputStream.getUShort();
			} else {
				return false;
			}
		}
		if (AbstractMouseWheelHandler.packetSize > availableBytes) {
			return false;
		}
		Canvas_Sub1.inputStream.pos = 0;
		worldConnection.read(Canvas_Sub1.inputStream.buf, 0, AbstractMouseWheelHandler.packetSize);
		SeqType.fourthPacketType = MapFunctionType.thirdPacketType;
		MapFunctionType.thirdPacketType = Class114.previousPacketType;
		Class114.previousPacketType = client.packetType;
		Class88.timoutCycle = 0;
		if (client.packetType == 163) {
			for (int id = 0; id < Class2.permanentVariable.length; id++) {
				if (Class2.permanentVariable[id] != Class30.anIntArray239[id]) {
					Class2.permanentVariable[id] = Class30.anIntArray239[id];
					Class120_Sub14_Sub15.postVarpChange(id);
					Class88.anIntArray833[Class120_Sub12_Sub3.method1207(31, VarBit.anInt165++)] = id;
				}
			}
			client.packetType = -1;
			return true;
		}
		if (client.packetType == 34) {
			final int bitPacked = Canvas_Sub1.inputStream.getInt();
			int objType = Canvas_Sub1.inputStream.getUShort();
			JagexInterface jagexInterface;
			if (bitPacked >= 0) {
				jagexInterface = Class74.getJagexInterface(bitPacked);
			} else {
				jagexInterface = null;
			}
			if ((bitPacked ^ 0xffffffff) > 69999) {
				objType += 32768;
			}
			while (Canvas_Sub1.inputStream.pos < AbstractMouseWheelHandler.packetSize) {
				int objAmt = 0;
				final int objSlot = Canvas_Sub1.inputStream.getUSmart();
				final int objId = Canvas_Sub1.inputStream.getUShort();
				if (objId != 0) {
					objAmt = Canvas_Sub1.inputStream.getUByte();
					if (objAmt == 255) {
						objAmt = Canvas_Sub1.inputStream.getInt();
					}
				}
				if (jagexInterface != null && objSlot >= 0 && jagexInterface.objIds.length > objSlot) {
					jagexInterface.objIds[objSlot] = objId;
					jagexInterface.objAmounts[objSlot] = objAmt;
				}
				ObjectContainer.addObject(objId - 1, objAmt, objSlot, objType);
			}
			if (jagexInterface != null) {
				InterfaceClickMask.redrawInterface(jagexInterface);
			}
			Class90.redrawOldFormatOverridedInterfaces();
			Class120_Sub12_Sub21_Sub1.anIntArray3912[Class120_Sub12_Sub3.method1207(31, Class33.anInt278++)] = Class120_Sub12_Sub3.method1207(32767, objType);
			client.packetType = -1;
			return true;
		}
		if (client.packetType == 53) {
			Class28.anInt176 = Canvas_Sub1.inputStream.getUByteS();
			MagnetType.anInt254 = Canvas_Sub1.inputStream.getUByteA();
			while (AbstractMouseWheelHandler.packetSize > Canvas_Sub1.inputStream.pos) {
				client.packetType = Canvas_Sub1.inputStream.getUByte();
				ChunkAtmosphere.method2513();
			}
			client.packetType = -1;
			return true;
		}
		if (client.packetType == 192) {
			DummyInputStream.processLogout();
			client.packetType = -1;
			return false;
		}
		if (client.packetType == 176) {
			final int i_18_ = Canvas_Sub1.inputStream.getUShort();
			final int i_19_ = Canvas_Sub1.inputStream.getULEShortA();
			final byte i_20_ = Canvas_Sub1.inputStream.getByteC();
			if (Class69_Sub3_Sub1.updatePacketCounter(i_18_)) {
				WaterfallShader.method180(i_19_, i_20_);
			}
			client.packetType = -1;
			return true;
		}
		if (client.packetType == 4) {
			ObjectPile.friendsServerStatus = Canvas_Sub1.inputStream.getUByte();
			client.anInt563 = GrandExchangeObject.anInt1494;
			client.packetType = -1;
			return true;
		}
		if (client.packetType == 35) {
			final int i_21_ = Canvas_Sub1.inputStream.getUByteC();
			final int i_22_ = Canvas_Sub1.inputStream.getULEShortA();
			final int i_23_ = Canvas_Sub1.inputStream.getLEInt();
			final int i_24_ = Canvas_Sub1.inputStream.getULEShort();
			if (Class69_Sub3_Sub1.updatePacketCounter(i_22_)) {
				final OverridedJInterface class120_sub26 = (OverridedJInterface) Class120_Sub12_Sub13.overridedInterfaces.get(i_23_);
				if (class120_sub26 != null) {
					Class120_Sub19.removeOverridedInterface(class120_sub26, i_24_ != class120_sub26.interfaceId);
				}
				RuntimeException_Sub1.overrideInterface(i_24_, i_21_, i_23_);
			}
			client.packetType = -1;
			return true;
		}
		if (client.packetType == 59) {
			final String string = Canvas_Sub1.inputStream.getJagexString();
			if (!string.endsWith(":tradereq:")) {
				if (!string.endsWith(":chalreq:")) {
					if (string.endsWith(":assistreq:")) {
						final String string_25_ = string.substring(0, string.indexOf(":"));
						final long l = Varp.stringToLong(string_25_);
						boolean bool_26_ = false;
						for (int i_27_ = 0; Class120_Sub12_Sub26.ignoreCount > i_27_; i_27_++) {
							if (l == HintIcon.ignoreNamesAsLong[i_27_]) {
								bool_26_ = true;
								break;
							}
						}
						if (!bool_26_ && Class69_Sub3.isInTutIsland == 0) {
							AbstractRequest.pushMessage("", string_25_, 10);
						}
					} else if (!string.endsWith(":clan:")) {
						if (!string.endsWith(":trade:")) {
							if (string.endsWith(":assist:")) {
								final String string_28_ = string.substring(0, string.indexOf(":assist:"));
								if (Class69_Sub3.isInTutIsland == 0) {
									AbstractRequest.pushMessage(string_28_, "", 13);
								}
							} else if (!string.endsWith(":duelstake:")) {
								if (!string.endsWith(":duelfriend:")) {
									if (!string.endsWith(":clanreq:")) {
										if (string.endsWith(":allyreq:")) {
											final String string_29_ = string.substring(0, string.indexOf(":"));
											final long l = Varp.stringToLong(string_29_);
											boolean bool_30_ = false;
											for (int i_31_ = 0; i_31_ < Class120_Sub12_Sub26.ignoreCount; i_31_++) {
												if (l == HintIcon.ignoreNamesAsLong[i_31_]) {
													bool_30_ = true;
													break;
												}
											}
											if (!bool_30_ && Class69_Sub3.isInTutIsland == 0) {
												final String string_32_ = string.substring(1 + string.indexOf(":"), string.length() - 9);
												AbstractRequest.pushMessage(string_32_, string_29_, 21);
											}
										} else if (!string.endsWith(":spam:")) {
											AbstractRequest.pushMessage(string, "", 0);
										} else {
											final String string_33_ = string.substring(0, -6 + string.length());
											if (Class69_Sub3.isInTutIsland == 0) {
												AbstractRequest.pushMessage(string_33_, "", 22);
											}
										}
									} else {
										final String string_34_ = string.substring(0, string.indexOf(":"));
										final long l = Varp.stringToLong(string_34_);
										boolean bool_35_ = false;
										for (int i_36_ = 0; Class120_Sub12_Sub26.ignoreCount > i_36_; i_36_++) {
											if (l == HintIcon.ignoreNamesAsLong[i_36_]) {
												bool_35_ = true;
												break;
											}
										}
										if (!bool_35_ && Class69_Sub3.isInTutIsland == 0) {
											AbstractRequest.pushMessage("", string_34_, 16);
										}
									}
								} else {
									final String string_37_ = string.substring(0, string.indexOf(":"));
									boolean bool_38_ = false;
									final long l = Varp.stringToLong(string_37_);
									for (int i_39_ = 0; i_39_ < Class120_Sub12_Sub26.ignoreCount; i_39_++) {
										if (l == HintIcon.ignoreNamesAsLong[i_39_]) {
											bool_38_ = true;
											break;
										}
									}
									if (!bool_38_ && Class69_Sub3.isInTutIsland == 0) {
										AbstractRequest.pushMessage("", string_37_, 15);
									}
								}
							} else {
								final String string_40_ = string.substring(0, string.indexOf(":"));
								final long l = Varp.stringToLong(string_40_);
								boolean bool_41_ = false;
								for (int i_42_ = 0; i_42_ < Class120_Sub12_Sub26.ignoreCount; i_42_++) {
									if (HintIcon.ignoreNamesAsLong[i_42_] == l) {
										bool_41_ = true;
										break;
									}
								}
								if (!bool_41_ && Class69_Sub3.isInTutIsland == 0) {
									AbstractRequest.pushMessage("", string_40_, 14);
								}
							}
						} else {
							final String string_43_ = string.substring(0, string.indexOf(":trade:"));
							if (Class69_Sub3.isInTutIsland == 0) {
								AbstractRequest.pushMessage(string_43_, "", 12);
							}
						}
					} else {
						final String string_44_ = string.substring(0, string.indexOf(":clan:"));
						AbstractRequest.pushMessage(string_44_, "", 11);
					}
				} else {
					final String string_45_ = string.substring(0, string.indexOf(":"));
					boolean bool_46_ = false;
					final long l = Varp.stringToLong(string_45_);
					for (int i_47_ = 0; Class120_Sub12_Sub26.ignoreCount > i_47_; i_47_++) {
						if (HintIcon.ignoreNamesAsLong[i_47_] == l) {
							bool_46_ = true;
							break;
						}
					}
					if (!bool_46_ && Class69_Sub3.isInTutIsland == 0) {
						final String string_48_ = string.substring(1 + string.indexOf(":"), -9 + string.length());
						AbstractRequest.pushMessage(string_48_, string_45_, 8);
					}
				}
			} else {
				final String string_49_ = string.substring(0, string.indexOf(":"));
				boolean bool_50_ = false;
				final long l = Varp.stringToLong(string_49_);
				for (int i_51_ = 0; i_51_ < Class120_Sub12_Sub26.ignoreCount; i_51_++) {
					if (HintIcon.ignoreNamesAsLong[i_51_] == l) {
						bool_50_ = true;
						break;
					}
				}
				if (!bool_50_ && Class69_Sub3.isInTutIsland == 0) {
					AbstractRequest.pushMessage(StringLibrary.aString568, string_49_, 4);
				}
			}
			client.packetType = -1;
			return true;
		}
		if (client.packetType == 162) {
			final int maskBitPacked = Canvas_Sub1.inputStream.getInt();
			final int interfaceBitPacked = Canvas_Sub1.inputStream.getInt();
			int end = Canvas_Sub1.inputStream.getUShort();
			int start = Canvas_Sub1.inputStream.getULEShortA();
			if (end == 65535) {
				end = -1;
			}
			if (start == 65535) {
				start = -1;
			}
			final int counter = Canvas_Sub1.inputStream.getULEShortA();
			if (Class69_Sub3_Sub1.updatePacketCounter(counter)) {
				for (int id = start; id <= end; id++) {
					final long uid = ((long) interfaceBitPacked << 32) + (long) id;
					final InterfaceClickMask existingMask = (InterfaceClickMask) JavaObject.clickMaskCache.get(uid);
					InterfaceClickMask mask;
					if (existingMask == null) {
						if (id == -1) {
							mask = new InterfaceClickMask(maskBitPacked, Class74.getJagexInterface(interfaceBitPacked).clickMask.paramId);
						} else {
							mask = new InterfaceClickMask(maskBitPacked, -1);
						}
					} else {
						mask = new InterfaceClickMask(maskBitPacked, existingMask.paramId);
						existingMask.unlink();
					}
					JavaObject.clickMaskCache.put(mask, uid);
				}
			}
			client.packetType = -1;
			return true;
		}
		if (client.packetType == 1) {
			final int i_59_ = Canvas_Sub1.inputStream.getULEShort();
			final String string = Canvas_Sub1.inputStream.getJagexString();
			final int i_60_ = Canvas_Sub1.inputStream.getInt1();
			if (Class69_Sub3_Sub1.updatePacketCounter(i_59_)) {
				InterfaceChangeNode.method761(string, i_60_);
			}
			client.packetType = -1;
			return true;
		}
		if (client.packetType == 11) {
			final int i_61_ = Canvas_Sub1.inputStream.getULEShort();
			final int i_62_ = Canvas_Sub1.inputStream.getInt2();
			final int i_63_ = Canvas_Sub1.inputStream.getUShortA();
			if (Class69_Sub3_Sub1.updatePacketCounter(i_61_)) {
				Class120_Sub12_Sub11.method1250(i_63_, i_62_);
			}
			client.packetType = -1;
			return true;
		}
		if (client.packetType == 148) {
			final int i_64_ = Canvas_Sub1.inputStream.getUShort();
			final int i_65_ = Canvas_Sub1.inputStream.getLEInt();
			final int i_66_ = Canvas_Sub1.inputStream.getUShort();
			if (Class69_Sub3_Sub1.updatePacketCounter(i_66_)) {
				WaterfallShader.method180(i_64_, i_65_);
			}
			client.packetType = -1;
			return true;
		}
		if (client.packetType == 95) {
			Class90.redrawOldFormatOverridedInterfaces();
			LookupTable.weight = Canvas_Sub1.inputStream.getShort();
			Class120_Sub2.anInt2419 = GrandExchangeObject.anInt1494;
			client.packetType = -1;
			return true;
		}
		if (client.packetType == 164) {
			Class90.redrawOldFormatOverridedInterfaces();
			final int level = Canvas_Sub1.inputStream.getUByte();
			final int xp = Canvas_Sub1.inputStream.getInt1();
			final int skill = Canvas_Sub1.inputStream.getUByte();
			Class120_Sub12_Sub38.skillsXp[skill] = xp;
			SceneGraphNode.skillsLevel[skill] = level;
			Decimator.skillsBaseLevel[skill] = 1;
			for (int id = 0; id < 98; id++) {
				if (xp >= Class55.skillsXpForLevel[id]) {
					Decimator.skillsBaseLevel[skill] = id + 2;
				}
			}
			Class120_Sub12_Sub18.skillTriggers[Class120_Sub12_Sub3.method1207(31, Class120_Sub21.skillTriggersPos++)] = skill;
			client.packetType = -1;
			return true;
		}
		if (client.packetType == 8) {
			Class90.redrawOldFormatOverridedInterfaces();
			Class69_Sub2.energy = Canvas_Sub1.inputStream.getUByte();
			Class120_Sub2.anInt2419 = GrandExchangeObject.anInt1494;
			client.packetType = -1;
			return true;
		}
		if (client.packetType == 86) {
			Class143.setParams(Canvas_Sub1.inputStream.getJagexString());
			client.packetType = -1;
			return true;
		}
		if (client.packetType == 87) {
			final int i_71_ = Canvas_Sub1.inputStream.getULEShortA();
			int i_72_ = Canvas_Sub1.inputStream.getUShort();
			if (i_72_ == 65535) {
				i_72_ = -1;
			}
			final int i_73_ = Canvas_Sub1.inputStream.getLEInt();
			if (Class69_Sub3_Sub1.updatePacketCounter(i_71_)) {
				Class120_Sub21.method1695(1, -1, i_73_, i_72_);
			}
			client.packetType = -1;
			return true;
		}
		if (client.packetType == 49) {
			Class120_Sub29.receiveRegionData(false);
			client.packetType = -1;
			return true;
		}
		if (client.packetType == 138) {
			final int i_74_ = Canvas_Sub1.inputStream.getULEShortA();
			final int i_75_ = Canvas_Sub1.inputStream.getInt2();
			MapSceneType.method2004(i_75_, i_74_);
			client.packetType = -1;
			return true;
		}
		if (client.packetType == 96) {
			if (Class69.rootInterfaceId != -1) {
				InterfaceClickMask.method1689(0, Class69.rootInterfaceId);
			}
			client.packetType = -1;
			return true;
		}
		if (client.packetType == 97) {
			Class28.anInt176 = Canvas_Sub1.inputStream.getUByteS();
			MagnetType.anInt254 = Canvas_Sub1.inputStream.getUByteA();
			client.packetType = -1;
			return true;
		}
		if (client.packetType == 25) {// TODO player update
			DisplayModeInfo.method2213();
			client.packetType = -1;
			return true;
		}
		if (client.packetType == 126) {
			String option = Canvas_Sub1.inputStream.getJagexString();
			final int top = Canvas_Sub1.inputStream.getUByteC();
			int icon = Canvas_Sub1.inputStream.getULEShort();
			final int index = Canvas_Sub1.inputStream.getUByteS();
			if (icon == 65535) {
				icon = -1;
			}
			if (index >= 1 && index <= 8) {
				if (option.equalsIgnoreCase("null")) {
					option = null;
				}
				Buffer.playerOptions[index - 1] = option;
				AbstractRequest.playerOptionsIcon[index - 1] = icon;
				InterfaceListener.playerOptionsOnTop[index - 1] = top == 0;
			}
			client.packetType = -1;
			return true;
		}
		if (client.packetType == 55) {
			AbstractGraphicsBuffer.mapbackState = Canvas_Sub1.inputStream.getUByte();
			client.packetType = -1;
			return true;
		}
		if (client.packetType == 31) {
			final int interfaceBitPacked = Canvas_Sub1.inputStream.getInt();
			final int paramId = Canvas_Sub1.inputStream.getUShort();
			final int counter = Canvas_Sub1.inputStream.getUShortA();
			int end = Canvas_Sub1.inputStream.getUShort();
			int start = Canvas_Sub1.inputStream.getUShort();
			if (end == 65535) {
				end = -1;
			}
			if (start == 65535) {
				start = -1;
			}
			if (Class69_Sub3_Sub1.updatePacketCounter(counter)) {
				for (int id = start; id <= end; id++) {
					final long l = ((long) interfaceBitPacked << 32) + id;
					final InterfaceClickMask cachedInterfaceClickMask = (InterfaceClickMask) JavaObject.clickMaskCache.get(l);
					InterfaceClickMask interfaceClickMask;
					if (cachedInterfaceClickMask == null) {
						if (id == -1) {
							interfaceClickMask = new InterfaceClickMask(Class74.getJagexInterface(interfaceBitPacked).clickMask.optionMask, paramId);
						} else {
							interfaceClickMask = new InterfaceClickMask(0, paramId);
						}
					} else {
						interfaceClickMask = new InterfaceClickMask(cachedInterfaceClickMask.optionMask, paramId);
						cachedInterfaceClickMask.unlink();
					}
					JavaObject.clickMaskCache.put(interfaceClickMask, l);
				}
			}
			client.packetType = -1;
			return true;
		}
		if (client.packetType == 174) {
			long nameAsLong = Canvas_Sub1.inputStream.getLong();
			final int world = Canvas_Sub1.inputStream.getUShort();
			boolean bool_87_ = false;
			if ((nameAsLong & ~0x7fffffffffffffffL) != 0) {
				bool_87_ = true;
			}
			final byte rank = Canvas_Sub1.inputStream.getByte();
			if (!bool_87_) {
				final String sideText = Canvas_Sub1.inputStream.getJagexString();
				final ClanMember clanMember = new ClanMember();
				clanMember.uid = nameAsLong;
				clanMember.name = Class174.longToString(clanMember.uid);
				clanMember.rank = rank;
				clanMember.world = world;
				clanMember.sideText = sideText;
				int memberIndex;
				for (memberIndex = Class120_Sub14_Sub13.clanMembersAmount - 1; memberIndex >= 0; memberIndex--) {
					final int compareResponce = ReflectionCheckNode.clanMembers[memberIndex].name.compareTo(clanMember.name);
					if (compareResponce == 0) {
						ReflectionCheckNode.clanMembers[memberIndex].world = world;
						ReflectionCheckNode.clanMembers[memberIndex].rank = rank;
						ReflectionCheckNode.clanMembers[memberIndex].sideText = sideText;
						Class120_Sub12_Sub12.anInt3217 = GrandExchangeObject.anInt1494;
						if (WaterfallShader.selfNameAsLong == nameAsLong) {
							MouseHandler.selfClanRank = rank;
						}
						client.packetType = -1;
						return true;
					}
					if (compareResponce < 0) {
						break;
					}
				}
				if (Class120_Sub14_Sub13.clanMembersAmount >= ReflectionCheckNode.clanMembers.length) {
					client.packetType = -1;
					return true;
				}
				for (int i_91_ = Class120_Sub14_Sub13.clanMembersAmount - 1; memberIndex < i_91_; i_91_--) {
					ReflectionCheckNode.clanMembers[i_91_ + 1] = ReflectionCheckNode.clanMembers[i_91_];
				}
				if (Class120_Sub14_Sub13.clanMembersAmount == 0) {
					ReflectionCheckNode.clanMembers = new ClanMember[100];
				}
				ReflectionCheckNode.clanMembers[memberIndex + 1] = clanMember;
				if (nameAsLong == WaterfallShader.selfNameAsLong) {
					MouseHandler.selfClanRank = rank;
				}
				Class120_Sub14_Sub13.clanMembersAmount++;
			} else {
				if (Class120_Sub14_Sub13.clanMembersAmount == 0) {
					client.packetType = -1;
					return true;
				}
				nameAsLong &= 0x7fffffffffffffffL;
				int i_92_;
				for (i_92_ = 0; Class120_Sub14_Sub13.clanMembersAmount > i_92_ && ((ReflectionCheckNode.clanMembers[i_92_].uid ^ 0xffffffffffffffffL) != (nameAsLong ^ 0xffffffffffffffffL) || world != ReflectionCheckNode.clanMembers[i_92_].world); i_92_++) {
					/* empty */
				}
				if (i_92_ < Class120_Sub14_Sub13.clanMembersAmount) {
					for (/**/; i_92_ < Class120_Sub14_Sub13.clanMembersAmount - 1; i_92_++) {
						ReflectionCheckNode.clanMembers[i_92_] = ReflectionCheckNode.clanMembers[i_92_ + 1];
					}
					Class120_Sub14_Sub13.clanMembersAmount--;
					ReflectionCheckNode.clanMembers[Class120_Sub14_Sub13.clanMembersAmount] = null;
				}
			}
			Class120_Sub12_Sub12.anInt3217 = GrandExchangeObject.anInt1494;
			client.packetType = -1;
			return true;
		}
		if (client.packetType == 104) {
			final long l = Canvas_Sub1.inputStream.getLong();
			final String string = AbstractFont.method1472(Class120_Sub22.method1705(client.decodeText(Canvas_Sub1.inputStream)));
			AbstractRequest.pushMessage(string, Class136.longToString(l), 6);
			client.packetType = -1;
			return true;
		}
		if (client.packetType == 253) {
			final int i_93_ = Canvas_Sub1.inputStream.getUShort();
			final String string = Canvas_Sub1.inputStream.getJagexString();
			final Object[] objects = new Object[string.length() + 1];
			for (int i_94_ = string.length() - 1; i_94_ >= 0; i_94_--) {
				if (string.charAt(i_94_) == 's') {
					objects[i_94_ + 1] = Canvas_Sub1.inputStream.getJagexString();
				} else {
					objects[i_94_ + 1] = new Integer(Canvas_Sub1.inputStream.getInt());
				}
			}
			objects[0] = new Integer(Canvas_Sub1.inputStream.getInt());
			if (Class69_Sub3_Sub1.updatePacketCounter(i_93_)) {
				final InterfaceListener class120_sub10 = new InterfaceListener();
				class120_sub10.objectData = objects;
				Class88.executeScript(class120_sub10);
			}
			client.packetType = -1;
			return true;
		}
		if (client.packetType == 63) {
			int i_95_ = Canvas_Sub1.inputStream.getULEShort();
			final int i_96_ = Canvas_Sub1.inputStream.getUByteS();
			if (i_95_ == 65535) {
				i_95_ = -1;
			}
			final int i_97_ = i_96_ >> 2;
			final int i_98_ = CollisionMap.anIntArray153[i_97_];
			final int i_99_ = i_96_ & 0x3;
			final int i_100_ = Canvas_Sub1.inputStream.getInt();
			final int i_101_ = (i_100_ & 0x3bd1748b) >> 28;
			int i_102_ = (i_100_ & 0xfffe0e8) >> 14;
			int i_103_ = 0x3fff & i_100_;
			i_103_ -= LightType.currentBaseZ;
			i_102_ -= GameEntity.currentBaseX;
			ProducingGraphicsBuffer.method1853(i_95_, i_102_, i_101_, i_103_, i_98_, i_99_, i_97_);
			client.packetType = -1;
			return true;
		}
		if (client.packetType == 30) {
			if (QuickChatMessageType.fullscreenFrame != null) {
				AbstractSprite.changeDisplayMode(Class120_Sub12_Sub19.currentDisplayMode, -1, -1, false);
			}
			final byte[] buffer = new byte[AbstractMouseWheelHandler.packetSize];
			Canvas_Sub1.inputStream.getBytesIsaac(buffer, 0, AbstractMouseWheelHandler.packetSize);
			final String url = DisplayModeInfo.bufferToString(buffer, 0, AbstractMouseWheelHandler.packetSize);
			if (Class112.frame != null || Signlink.clientType != 3 && Signlink.osName.startsWith("win") && !FileSystem.haveInternetExplorer6) {
				WorldInfo.openUrl = url;
				Class99.openUrlNewTab = true;
				Class3.openUrlRequest = NpcType.gameSignlink.requestUrl(url);
			} else {
				Class188.openUrl(url, true);
			}
			client.packetType = -1;
			return true;
		}
		if (client.packetType == 147) {
			MagnetType.anInt254 = Canvas_Sub1.inputStream.getUByte();
			Class28.anInt176 = Canvas_Sub1.inputStream.getUByteA();
			for (int x = MagnetType.anInt254; x < MagnetType.anInt254 + 8; x++) {
				for (int z = Class28.anInt176; z < 8 + Class28.anInt176; z++) {
					if (ClientScript.groundObjects[Class173.gameLevel][x][z] != null) {
						ClientScript.groundObjects[Class173.gameLevel][x][z] = null;
						Class5.spawnGroundObject(x, z);
					}
				}
			}
			for (Class120_Sub24 class120_sub24 = (Class120_Sub24) Class120_Sub4.aClass105_2439.getFront(); class120_sub24 != null; class120_sub24 = (Class120_Sub24) Class120_Sub4.aClass105_2439.getNext()) {
				if (MagnetType.anInt254 <= class120_sub24.anInt2731 && class120_sub24.anInt2731 < 8 + MagnetType.anInt254 && Class28.anInt176 <= class120_sub24.anInt2725 && 8 + Class28.anInt176 > class120_sub24.anInt2725 && Class173.gameLevel == class120_sub24.anInt2722) {
					class120_sub24.anInt2720 = 0;
				}
			}
			client.packetType = -1;
			return true;
		}
		if (client.packetType == 10) {
			final int i_106_ = Canvas_Sub1.inputStream.getInt1();
			final int i_107_ = Canvas_Sub1.inputStream.getUShortA();
			FileSystemRequest.method1544(i_107_, i_106_);
			client.packetType = -1;
			return true;
		}
		if (client.packetType == 100) {
			int i_108_ = Canvas_Sub1.inputStream.getUShort();
			if (i_108_ == 65535) {
				i_108_ = -1;
			}
			final int i_109_ = Canvas_Sub1.inputStream.getUByteA();
			ObjectPile.method2447(i_109_, i_108_);
			client.packetType = -1;
			return true;
		}
		if (client.packetType == 206) {
			final int i_110_ = Canvas_Sub1.inputStream.getUByte();
			int i_111_ = Canvas_Sub1.inputStream.getULEShortA();
			if (i_111_ == 65535) {
				i_111_ = -1;
			}
			final int i_112_ = Canvas_Sub1.inputStream.method1092();
			Class101.method832(i_110_, i_112_, i_111_);
			client.packetType = -1;
			return true;
		}
		if (client.packetType == 54) {
			if (AbstractMouseWheelHandler.packetSize == 0) {
				StringLibrary.walkText = Class120_Sub12_Sub1.aString3132;
			} else {
				StringLibrary.walkText = Canvas_Sub1.inputStream.getJagexString();
			}
			client.packetType = -1;
			return true;
		}
		if (client.packetType == 33) {
			final int i_113_ = Canvas_Sub1.inputStream.getUByte();
			final int i_114_ = Canvas_Sub1.inputStream.getUByte();
			final byte i_115_ = Canvas_Sub1.inputStream.getByte();
			if (client.flagCounter != i_115_) {
				client.packetType = -1;
				return true;
			}
			if (i_113_ != 255) {
				SceneGroundObject.packetSetFlagPosition = true;
				Class65.flagY = i_114_;
				Class120_Sub12_Sub26.flagX = i_113_;
			} else {
				SceneGroundObject.packetSetFlagPosition = false;
				Class120_Sub12_Sub26.flagX = 0;
				Class65.flagY = 0;
			}
			client.packetType = -1;
			return true;
		}
		if (client.packetType == 183) {
			final int i_116_ = Canvas_Sub1.inputStream.getInt();
			int i_117_ = Canvas_Sub1.inputStream.getULEShortA();
			if (i_117_ == 65535) {
				i_117_ = -1;
			}
			final int i_118_ = Canvas_Sub1.inputStream.getUShortA();
			final int i_119_ = Canvas_Sub1.inputStream.getInt();
			if (Class69_Sub3_Sub1.updatePacketCounter(i_118_)) {
				final JagexInterface jagexInterface = Class74.getJagexInterface(i_116_);
				if (jagexInterface.newFormat) {
					Class120_Sub12_Sub27.method1342(i_119_, i_116_, i_117_);
					final ObjType objType = ObjType.list(i_117_);
					SeqType.method325(objType.yan2d, objType.zoom2d, objType.xan2d, i_116_);
					Class120_Sub12_Sub37.method1394(objType.yof2d, objType.zan2d, objType.xof2d, i_116_);
				} else {
					if (i_117_ == -1) {
						jagexInterface.modelTypeDisabled = 0;
						client.packetType = -1;
						return true;
					}
					final ObjType objType = ObjType.list(i_117_);
					jagexInterface.rotateY = objType.yan2d;
					jagexInterface.modelTypeDisabled = 4;
					jagexInterface.modelIdDisabled = i_117_;
					jagexInterface.rotateX = objType.xan2d;
					jagexInterface.zoom = objType.zoom2d * 100 / i_119_;
					InterfaceClickMask.redrawInterface(jagexInterface);
				}
			}
			client.packetType = -1;
			return true;
		}
		if (client.packetType == 65) {
			final int i_120_ = Canvas_Sub1.inputStream.getInt2();
			final int i_121_ = Canvas_Sub1.inputStream.getULEShortA();
			final int i_122_ = Canvas_Sub1.inputStream.getShortA();
			final int i_123_ = Canvas_Sub1.inputStream.getLEShort();
			if (Class69_Sub3_Sub1.updatePacketCounter(i_121_)) {
				EntityRenderData.method254(i_120_, i_122_, i_123_);
			}
			client.packetType = -1;
			return true;
		}
		if (client.packetType == 152) {
			final int i_124_ = Canvas_Sub1.inputStream.getULEShortA();
			final int i_125_ = Canvas_Sub1.inputStream.getULEShortA();
			final int i_126_ = Canvas_Sub1.inputStream.getUShortA();
			final int i_127_ = Canvas_Sub1.inputStream.getLEInt();
			if (Class69_Sub3_Sub1.updatePacketCounter(i_124_)) {
				Class89.method746(i_127_, i_126_ + (i_125_ << 16));
			}
			client.packetType = -1;
			return true;
		}
		if (client.packetType == 44) {
			boolean bool_128_ = false;
			final long l = Canvas_Sub1.inputStream.getLong();
			final long l_129_ = Canvas_Sub1.inputStream.getUShort();
			final long l_130_ = Canvas_Sub1.inputStream.getMedium();
			final long l_131_ = (l_129_ << 32) + l_130_;
			final int i_132_ = Canvas_Sub1.inputStream.getUByte();
			while_214_: do {
				for (int i_133_ = 0; i_133_ < 100; i_133_++) {
					if (Class120_Sub12_Sub15.aLongArray3245[i_133_] == l_131_) {
						bool_128_ = true;
						break while_214_;
					}
				}
				if (i_132_ <= 1) {
					if (VarBit.aBoolean167 && !UnderlayType.aBoolean1228 || SpotAnimationNode.aBoolean3464) {
						bool_128_ = true;
					} else {
						for (int i_134_ = 0; Class120_Sub12_Sub26.ignoreCount > i_134_; i_134_++) {
							if (l == HintIcon.ignoreNamesAsLong[i_134_]) {
								bool_128_ = true;
								break;
							}
						}
					}
				}
			} while (false);
			if (!bool_128_ && Class69_Sub3.isInTutIsland == 0) {
				Class120_Sub12_Sub15.aLongArray3245[Class24.anInt147] = l_131_;
				Class24.anInt147 = (Class24.anInt147 + 1) % 100;
				final String string = AbstractFont.method1472(Class120_Sub22.method1705(client.decodeText(Canvas_Sub1.inputStream)));
				if (i_132_ == 2 || i_132_ == 3) {
					AbstractRequest.pushMessage(string, new StringBuilder("<img=1>").append(Class136.longToString(l)).toString(), 7);
				} else if (i_132_ == 1) {
					AbstractRequest.pushMessage(string, new StringBuilder("<img=0>").append(Class136.longToString(l)).toString(), 7);
				} else {
					AbstractRequest.pushMessage(string, Class136.longToString(l), 3);
				}
			}
			client.packetType = -1;
			return true;
		}
		if (client.packetType == 89) {
			final int i_135_ = Canvas_Sub1.inputStream.getULEShort();
			final int i_136_ = Canvas_Sub1.inputStream.getInt();
			final int i_137_ = Canvas_Sub1.inputStream.getLEInt();
			if (Class69_Sub3_Sub1.updatePacketCounter(i_135_)) {
				final OverridedJInterface class120_sub26 = (OverridedJInterface) Class120_Sub12_Sub13.overridedInterfaces.get(i_136_);
				final OverridedJInterface class120_sub26_138_ = (OverridedJInterface) Class120_Sub12_Sub13.overridedInterfaces.get(i_137_);
				if (class120_sub26_138_ != null) {
					Class120_Sub19.removeOverridedInterface(class120_sub26_138_, class120_sub26 == null || class120_sub26_138_.interfaceId != class120_sub26.interfaceId);
				}
				if (class120_sub26 != null) {
					class120_sub26.unlink();
					Class120_Sub12_Sub13.overridedInterfaces.put(class120_sub26, i_137_);
				}
				JagexInterface jagexInterface = Class74.getJagexInterface(i_136_);
				if (jagexInterface != null) {
					InterfaceClickMask.redrawInterface(jagexInterface);
				}
				jagexInterface = Class74.getJagexInterface(i_137_);
				if (jagexInterface != null) {
					InterfaceClickMask.redrawInterface(jagexInterface);
					ProducingGraphicsBuffer.method1854(jagexInterface, true);
				}
				if (Class69.rootInterfaceId != -1) {
					InterfaceClickMask.method1689(1, Class69.rootInterfaceId);
				}
			}
			client.packetType = -1;
			return true;
		}
		if (client.packetType == 246) {
			final long l = Canvas_Sub1.inputStream.getLong();
			Canvas_Sub1.inputStream.getByte();
			final long l_139_ = Canvas_Sub1.inputStream.getLong();
			final long l_140_ = Canvas_Sub1.inputStream.getUShort();
			final long l_141_ = Canvas_Sub1.inputStream.getMedium();
			final long l_142_ = (l_140_ << 32) + l_141_;
			final int i_143_ = Canvas_Sub1.inputStream.getUByte();
			boolean bool_144_ = false;
			for (int i_145_ = 0; i_145_ < 100; i_145_++) {
				if (l_142_ == Class120_Sub12_Sub15.aLongArray3245[i_145_]) {
					bool_144_ = true;
					break;
				}
			}
			if (i_143_ <= 1) {
				if (VarBit.aBoolean167 && !UnderlayType.aBoolean1228 || SpotAnimationNode.aBoolean3464) {
					bool_144_ = true;
				} else {
					for (int i_146_ = 0; i_146_ < Class120_Sub12_Sub26.ignoreCount; i_146_++) {
						if (l == HintIcon.ignoreNamesAsLong[i_146_]) {
							bool_144_ = true;
							break;
						}
					}
				}
			}
			if (!bool_144_ && Class69_Sub3.isInTutIsland == 0) {
				Class120_Sub12_Sub15.aLongArray3245[Class24.anInt147] = l_142_;
				Class24.anInt147 = (Class24.anInt147 + 1) % 100;
				final String message = AbstractFont.method1472(Class120_Sub22.method1705(client.decodeText(Canvas_Sub1.inputStream)));
				if (i_143_ == 2 || i_143_ == 3) {
					Class120_Sub16.pushMessage(message, new StringBuilder("<img=1>").append(Class136.longToString(l)).toString(), Class136.longToString(l_139_), 9, -1);
				} else if (i_143_ == 1) {
					Class120_Sub16.pushMessage(message, new StringBuilder("<img=0>").append(Class136.longToString(l)).toString(), Class136.longToString(l_139_), 9, -1);
				} else {
					Class120_Sub16.pushMessage(message, Class136.longToString(l), Class136.longToString(l_139_), 9, -1);
				}
			}
			client.packetType = -1;
			return true;
		}
		if (client.packetType == 90) {
			final int i_147_ = Canvas_Sub1.inputStream.getULEShortA();
			final int i_148_ = Canvas_Sub1.inputStream.getUShortA();
			final int i_149_ = Canvas_Sub1.inputStream.getUShortA();
			final int i_150_ = Canvas_Sub1.inputStream.getULEShort();
			final int i_151_ = Canvas_Sub1.inputStream.getLEInt();
			if (Class69_Sub3_Sub1.updatePacketCounter(i_149_)) {
				SeqType.method325(i_148_, i_147_, i_150_, i_151_);
			}
			client.packetType = -1;
			return true;
		}
		if (client.packetType == 130) {
			final int z = Canvas_Sub1.inputStream.getUByteA();
			final int x = Canvas_Sub1.inputStream.getUByteC();
			final int stuff = Canvas_Sub1.inputStream.getUByte();
			Class173.gameLevel = stuff >> 1;
			TileParticleQueue.selfPlayer.setPos(x, z, (stuff & 0x1) == 1);
			client.packetType = -1;
			return true;
		}
		if (client.packetType == 172) {
			final int i_155_ = Canvas_Sub1.inputStream.getLEInt();
			final int i_156_ = Canvas_Sub1.inputStream.getShort();
			final int i_157_ = Canvas_Sub1.inputStream.getULEShortA();
			if (Class69_Sub3_Sub1.updatePacketCounter(i_157_)) {
				ParticleMagnet.method1647(i_155_, i_156_);
			}
			client.packetType = -1;
			return true;
		}
		if (client.packetType == 103) {
			final int host = Canvas_Sub1.inputStream.getInt();
			LabelGroup.hostNameNode = NpcType.gameSignlink.grabHostName(host);
			client.packetType = -1;
			return true;
		}
		if (client.packetType == 242) {
			final int i_159_ = Canvas_Sub1.inputStream.getUByte();
			final int i_160_ = Canvas_Sub1.inputStream.getULEShort();
			if (Class69_Sub3_Sub1.updatePacketCounter(i_160_)) {
				Class134.entityRenderPriority = i_159_;
			}
			client.packetType = -1;
			return true;
		}
		if (client.packetType == 2) {
			Class120_Sub12_Sub12.anInt3217 = GrandExchangeObject.anInt1494;
			final long clanOwnerAsLong = Canvas_Sub1.inputStream.getLong();
			if (clanOwnerAsLong == 0L) {
				InterfaceChangeNode.clanName = null;
				Class120_Sub14_Sub13.clanMembersAmount = 0;
				Class150.clanOwner = null;
				client.packetType = -1;
				ReflectionCheckNode.clanMembers = null;
				return true;
			}
			final long clanNameAsLong = Canvas_Sub1.inputStream.getLong();
			InterfaceChangeNode.clanName = Class174.longToString(clanNameAsLong);
			Class150.clanOwner = Class174.longToString(clanOwnerAsLong);
			Class112.kickRights = Canvas_Sub1.inputStream.getByte();
			final int userAmount = Canvas_Sub1.inputStream.getUByte();
			if (userAmount == 255) {
				client.packetType = -1;
				return true;
			}
			Class120_Sub14_Sub13.clanMembersAmount = userAmount;
			final ClanMember[] clanMembers = new ClanMember[100];
			for (int id = 0; id < Class120_Sub14_Sub13.clanMembersAmount; id++) {
				clanMembers[id] = new ClanMember();
				clanMembers[id].uid = Canvas_Sub1.inputStream.getLong();
				clanMembers[id].name = Class174.longToString(clanMembers[id].uid);
				clanMembers[id].world = Canvas_Sub1.inputStream.getUShort();
				clanMembers[id].rank = Canvas_Sub1.inputStream.getByte();
				clanMembers[id].sideText = Canvas_Sub1.inputStream.getJagexString();
				if (WaterfallShader.selfNameAsLong == clanMembers[id].uid) {
					MouseHandler.selfClanRank = clanMembers[id].rank;
				}
			}
			boolean bool_164_ = false;
			int i_165_ = Class120_Sub14_Sub13.clanMembersAmount;
			while (i_165_ > 0) {
				i_165_--;
				bool_164_ = true;
				for (int i_166_ = 0; i_166_ < i_165_; i_166_++) {
					if (clanMembers[i_166_].name.compareTo(clanMembers[1 + i_166_].name) > 0) {
						final ClanMember class120_sub13 = clanMembers[i_166_];
						clanMembers[i_166_] = clanMembers[i_166_ + 1];
						clanMembers[i_166_ + 1] = class120_sub13;
						bool_164_ = false;
					}
				}
				if (bool_164_) {
					break;
				}
			}
			client.packetType = -1;
			ReflectionCheckNode.clanMembers = clanMembers;
			return true;
		}
		if (client.packetType == 173) {
			Class120_Sub12.readReflectionCheckPacket(NpcType.gameSignlink, Canvas_Sub1.inputStream);
			client.packetType = -1;
			return true;
		}
		if (client.packetType == 115 || client.packetType == 111 || client.packetType == 17 || client.packetType == 144 || client.packetType == 114 || client.packetType == 133 || client.packetType == 47 || client.packetType == 158 || client.packetType == 105 || client.packetType == 120 || client.packetType == 60 || client.packetType == 179 || client.packetType == 232 || client.packetType == 131) {
			ChunkAtmosphere.method2513();
			client.packetType = -1;
			return true;
		}
		if (client.packetType == 113) {
			final int i_167_ = Canvas_Sub1.inputStream.getUShort();
			final int i_168_ = Canvas_Sub1.inputStream.getInt2();
			final int i_169_ = Canvas_Sub1.inputStream.getULEShortA();
			final int i_170_ = Canvas_Sub1.inputStream.getULEShortA();
			final int i_171_ = Canvas_Sub1.inputStream.getULEShortA();
			if (Class69_Sub3_Sub1.updatePacketCounter(i_170_)) {
				Class120_Sub21.method1695(7, i_167_, i_168_, i_169_ << 16 | i_171_);
			}
			client.packetType = -1;
			return true;
		}
		if (client.packetType == 182) {
			long nameAsLong = Canvas_Sub1.inputStream.getLong();
			final int world = Canvas_Sub1.inputStream.getUShort();
			final int rank = Canvas_Sub1.inputStream.getUByte();
			boolean bool_174_ = true;
			if (nameAsLong < 0L) {
				bool_174_ = false;
				nameAsLong &= 0x7fffffffffffffffL;
			}
			String sideText = "";
			if (world > 0) {
				sideText = Canvas_Sub1.inputStream.getJagexString();
			}
			String name = Class136.longToString(nameAsLong);
			for (int id = 0; id < ProducingGraphicsBuffer.friendCount; id++) {
				if (AbstractSprite.friendsNameAsLong[id] == nameAsLong) {
					if (world != Class120_Sub12_Sub16.friendsWorld[id]) {
						Class120_Sub12_Sub16.friendsWorld[id] = world;
						if (world > 0) {
							AbstractRequest.pushMessage(name + StringLibrary.aString2669, "", 5);
						}
						if (world == 0) {
							AbstractRequest.pushMessage(name + StringLibrary.aString1250, "", 5);
						}
					}
					Class79_Sub1.friendsSideText[id] = sideText;
					Class120_Sub12_Sub30.friendsRank[id] = rank;
					Class120_Sub12_Sub9.aBooleanArray3194[id] = bool_174_;
					name = null;
					break;
				}
			}
			if (name != null && ProducingGraphicsBuffer.friendCount < 200) {
				AbstractSprite.friendsNameAsLong[ProducingGraphicsBuffer.friendCount] = nameAsLong;
				Class120_Sub16.friendsName[ProducingGraphicsBuffer.friendCount] = name;
				Class120_Sub12_Sub16.friendsWorld[ProducingGraphicsBuffer.friendCount] = world;
				Class79_Sub1.friendsSideText[ProducingGraphicsBuffer.friendCount] = sideText;
				Class120_Sub12_Sub30.friendsRank[ProducingGraphicsBuffer.friendCount] = rank;
				Class120_Sub12_Sub9.aBooleanArray3194[ProducingGraphicsBuffer.friendCount] = bool_174_;
				ProducingGraphicsBuffer.friendCount++;
			}
			boolean bool_177_ = false;
			client.anInt563 = GrandExchangeObject.anInt1494;
			int i_178_ = ProducingGraphicsBuffer.friendCount;
			while (i_178_ > 0) {
				bool_177_ = true;
				i_178_--;
				for (int i_179_ = 0; i_178_ > i_179_; i_179_++) {
					if (Class120_Sub12_Sub16.friendsWorld[i_179_] != Class157.worldId && Class157.worldId == Class120_Sub12_Sub16.friendsWorld[1 + i_179_] || Class120_Sub12_Sub16.friendsWorld[i_179_] == 0 && Class120_Sub12_Sub16.friendsWorld[i_179_ + 1] != 0) {
						bool_177_ = false;
						final int i_180_ = Class120_Sub12_Sub16.friendsWorld[i_179_];
						Class120_Sub12_Sub16.friendsWorld[i_179_] = Class120_Sub12_Sub16.friendsWorld[i_179_ + 1];
						Class120_Sub12_Sub16.friendsWorld[1 + i_179_] = i_180_;
						final String string_181_ = Class79_Sub1.friendsSideText[i_179_];
						Class79_Sub1.friendsSideText[i_179_] = Class79_Sub1.friendsSideText[1 + i_179_];
						Class79_Sub1.friendsSideText[i_179_ + 1] = string_181_;
						final String string_182_ = Class120_Sub16.friendsName[i_179_];
						Class120_Sub16.friendsName[i_179_] = Class120_Sub16.friendsName[1 + i_179_];
						Class120_Sub16.friendsName[1 + i_179_] = string_182_;
						final long l_183_ = AbstractSprite.friendsNameAsLong[i_179_];
						AbstractSprite.friendsNameAsLong[i_179_] = AbstractSprite.friendsNameAsLong[1 + i_179_];
						AbstractSprite.friendsNameAsLong[1 + i_179_] = l_183_;
						final int i_184_ = Class120_Sub12_Sub30.friendsRank[i_179_];
						Class120_Sub12_Sub30.friendsRank[i_179_] = Class120_Sub12_Sub30.friendsRank[1 + i_179_];
						Class120_Sub12_Sub30.friendsRank[i_179_ + 1] = i_184_;
						final boolean bool_185_ = Class120_Sub12_Sub9.aBooleanArray3194[i_179_];
						Class120_Sub12_Sub9.aBooleanArray3194[i_179_] = Class120_Sub12_Sub9.aBooleanArray3194[i_179_ + 1];
						Class120_Sub12_Sub9.aBooleanArray3194[i_179_ + 1] = bool_185_;
					}
				}
				if (bool_177_) {
					break;
				}
			}
			client.packetType = -1;
			return true;
		}
		if (client.packetType == 225) {
			final int i_186_ = Canvas_Sub1.inputStream.getUShort();
			final int i_187_ = Canvas_Sub1.inputStream.getULEShortA();
			final int i_188_ = Canvas_Sub1.inputStream.getUByteS();
			if (Class69_Sub3_Sub1.updatePacketCounter(i_187_)) {
				if (i_188_ == 2) {
					Class54.method480();
				}
				Class69.rootInterfaceId = i_186_;
				ProjectileNode.stopInterfaceAnimation(i_186_);
				Class101_Sub2.method846(false);
				JagexSocket.executeOnloadScript(Class69.rootInterfaceId);
				for (int id = 0; id < 100; id++) {
					MasterIndexInfo.needInterfaceRedrawWrapper[id] = true;
				}
			}
			client.packetType = -1;
			return true;
		}
		if (client.packetType == 156) {
			final int i_190_ = Canvas_Sub1.inputStream.getUShort();
			if (Class69_Sub3_Sub1.updatePacketCounter(i_190_)) {
				Class3.smoothCamera();
			}
			client.packetType = -1;
			return true;
		}
		if (client.packetType == 229) {
			for (int index = 0; index < Class118.playersList.length; index++) {
				if (Class118.playersList[index] != null) {
					Class118.playersList[index].animId = -1;
				}
			}
			for (int index = 0; index < Class120_Sub12_Sub11.npcList.length; index++) {
				if (Class120_Sub12_Sub11.npcList[index] != null) {
					Class120_Sub12_Sub11.npcList[index].animId = -1;
				}
			}
			client.packetType = -1;
			return true;
		}
		if (client.packetType == 78) {
			Varp.reset();
			Class90.redrawOldFormatOverridedInterfaces();
			client.packetType = -1;
			VarBit.anInt165 += 32;
			return true;
		}
		if (client.packetType == 177) {
			final int bitPacked = Canvas_Sub1.inputStream.getUByte();
			final int index = bitPacked >> 5;
			final int targetType = bitPacked & 0x1f;
			if (targetType == 0) {
				Class187.hintIcons[index] = null;
				client.packetType = -1;
				return true;
			}
			final HintIcon hintIcon = new HintIcon();
			hintIcon.targetType = targetType;
			hintIcon.iconType = Canvas_Sub1.inputStream.getUByte();
			if (hintIcon.iconType >= 0 && hintIcon.iconType < AnimatedLocation.hintHeadIconsSprites.length) {
				if (hintIcon.targetType == 1 || hintIcon.targetType == 10) {
					hintIcon.targetIndex = Canvas_Sub1.inputStream.getUShort();
					Canvas_Sub1.inputStream.pos += 5;
				} else if (hintIcon.targetType >= 2 && hintIcon.targetType <= 6) {
					if (hintIcon.targetType == 2) {
						hintIcon.offX = 64;
						hintIcon.offY = 64;
					}
					if (hintIcon.targetType == 3) {
						hintIcon.offX = 0;
						hintIcon.offY = 64;
					}
					if (hintIcon.targetType == 4) {
						hintIcon.offX = 128;
						hintIcon.offY = 64;
					}
					if (hintIcon.targetType == 5) {
						hintIcon.offX = 64;
						hintIcon.offY = 0;
					}
					if (hintIcon.targetType == 6) {
						hintIcon.offX = 64;
						hintIcon.offY = 128;
					}
					hintIcon.targetType = 2;
					hintIcon.x = Canvas_Sub1.inputStream.getUShort();
					hintIcon.z = Canvas_Sub1.inputStream.getUShort();
					hintIcon.y = Canvas_Sub1.inputStream.getUByte();
					hintIcon.showDistance = Canvas_Sub1.inputStream.getUShort();
				}
				hintIcon.modelId = Canvas_Sub1.inputStream.getUShort();
				if (hintIcon.modelId == 65535) {
					hintIcon.modelId = -1;
				}
				Class187.hintIcons[index] = hintIcon;
			}
			client.packetType = -1;
			return true;
		}
		if (client.packetType == 136) {// TODO npc update
			WallDecoration.method2471();
			client.packetType = -1;
			return true;
		}
		if (client.packetType == 155) {
			Class120_Sub29.receiveRegionData(true);
			client.packetType = -1;
			return true;
		}
		if (client.packetType == 75) {
			final int i_196_ = Canvas_Sub1.inputStream.getULEShortA();
			final String string = Canvas_Sub1.inputStream.getJagexString();
			final int i_197_ = Canvas_Sub1.inputStream.getULEShortA();
			if (Class69_Sub3_Sub1.updatePacketCounter(i_196_)) {
				Class120_Sub12_Sub28.method1345(string, i_197_);
			}
			client.packetType = -1;
			return true;
		}
		if (client.packetType == 137) {
			final int i_198_ = Canvas_Sub1.inputStream.getULEShort();
			final int i_199_ = Canvas_Sub1.inputStream.getUByte();
			MapSceneType.method2004(i_199_, i_198_);
			client.packetType = -1;
			return true;
		}
		if (client.packetType == 72) {
			Class120_Sub22.systemUpdateCycle = Canvas_Sub1.inputStream.getULEShort() * 30;
			Class120_Sub2.anInt2419 = GrandExchangeObject.anInt1494;
			client.packetType = -1;
			return true;
		}
		if (client.packetType == 26) {
			final int bitPacked = Canvas_Sub1.inputStream.getInt1();
			final JagexInterface jagexInterface = Class74.getJagexInterface(bitPacked);
			for (int id = 0; id < jagexInterface.objIds.length; id++) {
				jagexInterface.objIds[id] = -1;
				jagexInterface.objIds[id] = 0;
			}
			InterfaceClickMask.redrawInterface(jagexInterface);
			client.packetType = -1;
			return true;
		}
		if (client.packetType == 99) {
			final long l = Canvas_Sub1.inputStream.getLong();
			Canvas_Sub1.inputStream.getByte();
			final long l_202_ = Canvas_Sub1.inputStream.getLong();
			final long l_203_ = Canvas_Sub1.inputStream.getUShort();
			final long l_204_ = Canvas_Sub1.inputStream.getMedium();
			final long l_205_ = (l_203_ << 32) + l_204_;
			final int i_206_ = Canvas_Sub1.inputStream.getUByte();
			final int i_207_ = Canvas_Sub1.inputStream.getUShort();
			boolean bool_208_ = false;
			for (int i_209_ = 0; i_209_ < 100; i_209_++) {
				if (l_205_ == Class120_Sub12_Sub15.aLongArray3245[i_209_]) {
					bool_208_ = true;
					break;
				}
			}
			if (i_206_ <= 1) {
				for (int i_210_ = 0; i_210_ < Class120_Sub12_Sub26.ignoreCount; i_210_++) {
					if (l == HintIcon.ignoreNamesAsLong[i_210_]) {
						bool_208_ = true;
						break;
					}
				}
			}
			if (!bool_208_ && Class69_Sub3.isInTutIsland == 0) {
				Class120_Sub12_Sub15.aLongArray3245[Class24.anInt147] = l_205_;
				Class24.anInt147 = (Class24.anInt147 + 1) % 100;
				final String string = QuickChatMessageType.list(i_207_).method1506(Canvas_Sub1.inputStream);
				if (i_206_ == 2 || i_206_ == 3) {
					Class120_Sub16.pushMessage(string, new StringBuilder("<img=1>").append(Class136.longToString(l)).toString(), Class136.longToString(l_202_), 20, i_207_);
				} else if (i_206_ == 1) {
					Class120_Sub16.pushMessage(string, new StringBuilder("<img=0>").append(Class136.longToString(l)).toString(), Class136.longToString(l_202_), 20, i_207_);
				} else {
					Class120_Sub16.pushMessage(string, Class136.longToString(l), Class136.longToString(l_202_), 20, i_207_);
				}
			}
			client.packetType = -1;
			return true;
		}
		if (client.packetType == 237) {
			int id = Canvas_Sub1.inputStream.getULEShort();
			final int delay = Canvas_Sub1.inputStream.getUShortA();
			final int y = Canvas_Sub1.inputStream.getULEShort();
			final int locationBitPacked = Canvas_Sub1.inputStream.getInt1();
			if (locationBitPacked >> 30 != 0) {
				final int level = locationBitPacked >> 28 & 0x3;
				int x = (locationBitPacked >> 14 & 0x3fff) - GameEntity.currentBaseX;
				int z = (locationBitPacked & 0x3fff) - LightType.currentBaseZ;
				if (x >= 0 && z >= 0 && x < 104 && z < 104) {
					x = 64 + 128 * x;
					z = 64 + z * 128;
					final SpotAnimation spotAnimation = new SpotAnimation(id, level, x, z, Class22.getTileHeight(x, z, level) - y, delay, Class101_Sub2.loopCycle);
					Class120_Sub12_Sub7.spotAnimationDeque.addLast(new SpotAnimationNode(spotAnimation));
				}
			} else if (locationBitPacked >> 29 != 0) {
				final int npcIndex = locationBitPacked & 0xffff;
				final Npc npc = Class120_Sub12_Sub11.npcList[npcIndex];
				if (npc != null) {
					if (id == 0xffff) {
						id = -1;
					}
					boolean execute = true;
					if (id != -1 && npc.spotAnimId != -1) {
						if (id != npc.spotAnimId) {
							final SpotAnimType newSpotAnimType = SpotAnimType.list(id);
							final SpotAnimType currentSpotAnimType = SpotAnimType.list(npc.spotAnimId);
							if (newSpotAnimType.animationId != -1 && currentSpotAnimType.animationId != -1) {
								final SeqType newSeqType = SeqType.list(newSpotAnimType.animationId);
								final SeqType currentSeqType = SeqType.list(currentSpotAnimType.animationId);
								if (newSeqType.priority < currentSeqType.priority) {
									execute = false;
								}
							}
						} else {
							final SpotAnimType spotAnimType = SpotAnimType.list(id);
							if (spotAnimType.aBoolean998 && spotAnimType.animationId != -1) {
								final SeqType seqType = SeqType.list(spotAnimType.animationId);
								final int resetInPlay = seqType.resetInPlay;
								if (resetInPlay == 1) {
									npc.spotAnimDelay = Class101_Sub2.loopCycle + delay;
									npc.spotAnimFrame = 0;
									npc.spotAnimNextFrame = 1;
									npc.spotAnimFrameDelay = 0;
									npc.spotAnimCyclesElapsed = 0;
									execute = false;
									Class120_Sub12_Sub23.method1323(seqType, npc.x, npc.z, npc.spotAnimFrame, false);
								} else if (resetInPlay == 2) {
									npc.animCyclesElapsed = 0;
									execute = false;
								}
							}
						}
					}
					if (execute) {
						npc.spotAnimId = id;
						npc.spotAnimFrame = 0;
						npc.spotAnimNextFrame = 1;
						npc.spotAnimHeight = y;
						npc.spotAnimFrameDelay = 0;
						npc.spotAnimDelay = delay + Class101_Sub2.loopCycle;
						if (npc.spotAnimDelay > Class101_Sub2.loopCycle) {
							npc.spotAnimFrame = -1;
						}
						if (npc.spotAnimId != -1 && Class101_Sub2.loopCycle == npc.spotAnimDelay) {
							final int animationId = SpotAnimType.list(npc.spotAnimId).animationId;
							if (animationId != -1) {
								final SeqType seqType = SeqType.list(animationId);
								if (seqType != null && seqType.frames != null) {
									Class120_Sub12_Sub23.method1323(seqType, npc.x, npc.z, 0, false);
								}
							}
						}
					}
				}
			} else if (locationBitPacked >> 28 != 0) {
				final int playerIndex = locationBitPacked & 0xffff;
				Player player;
				if (playerIndex == Class167.selfPlayerIndex) {
					player = TileParticleQueue.selfPlayer;
				} else {
					player = Class118.playersList[playerIndex];
				}
				if (player != null) {
					if (id == 0xffff) {
						id = -1;
					}
					boolean execute = true;
					if (id != -1 && player.spotAnimId != -1) {
						if (id != player.spotAnimId) {
							final SpotAnimType newSpotAnimType = SpotAnimType.list(id);
							final SpotAnimType currentSpotAnimType = SpotAnimType.list(player.spotAnimId);
							if (newSpotAnimType.animationId != -1 && currentSpotAnimType.animationId != -1) {
								final SeqType newSeqType = SeqType.list(newSpotAnimType.animationId);
								final SeqType currentSeqType = SeqType.list(currentSpotAnimType.animationId);
								if (newSeqType.priority < currentSeqType.priority) {
									execute = false;
								}
							}
						} else {
							final SpotAnimType spotAnimType = SpotAnimType.list(id);
							if (spotAnimType.aBoolean998 && spotAnimType.animationId != -1) {
								final SeqType seqType = SeqType.list(spotAnimType.animationId);
								final int resetInPlay = seqType.resetInPlay;
								if (resetInPlay == 1) {
									player.spotAnimFrame = 0;
									player.spotAnimFrameDelay = 0;
									player.spotAnimNextFrame = 1;
									player.spotAnimDelay = delay + Class101_Sub2.loopCycle;
									player.spotAnimCyclesElapsed = 0;
									execute = false;
									Class120_Sub12_Sub23.method1323(seqType, player.x, player.z, player.spotAnimFrame, false);
								} else if (resetInPlay == 2) {
									player.animCyclesElapsed = 0;
									execute = false;
								}
							}
						}
					}
					if (execute) {
						player.spotAnimFrameDelay = 0;
						player.spotAnimNextFrame = 1;
						player.spotAnimDelay = Class101_Sub2.loopCycle + delay;
						player.spotAnimHeight = y;
						player.spotAnimFrame = 0;
						player.spotAnimId = id;
						if (player.spotAnimDelay > Class101_Sub2.loopCycle) {
							player.spotAnimFrame = -1;
						}
						if (player.spotAnimId == 0xffff) {
							player.spotAnimId = -1;
						}
						if (player.spotAnimId != -1 && player.spotAnimDelay == Class101_Sub2.loopCycle) {
							final int animationId = SpotAnimType.list(player.spotAnimId).animationId;
							if (animationId != -1) {
								final SeqType seqType = SeqType.list(animationId);
								if (seqType != null && seqType.frames != null) {
									Class120_Sub12_Sub23.method1323(seqType, player.x, player.z, 0, player == TileParticleQueue.selfPlayer);
								}
							}
						}
					}
				}
			}
			client.packetType = -1;
			return true;
		}
		if (client.packetType == 151) {
			final int i_230_ = Canvas_Sub1.inputStream.getUShort();
			final int i_231_ = Canvas_Sub1.inputStream.getUByte();
			final int i_232_ = Canvas_Sub1.inputStream.getUByte();
			final int i_233_ = Canvas_Sub1.inputStream.getUShort();
			final int i_234_ = Canvas_Sub1.inputStream.getUByte();
			final int i_235_ = Canvas_Sub1.inputStream.getUByte();
			if (Class69_Sub3_Sub1.updatePacketCounter(i_230_)) {
				QuickChatCategoryType.method1639(i_234_, i_231_, i_235_, i_233_, true, i_232_);
			}
			client.packetType = -1;
			return true;
		}
		if (client.packetType == 116) {
			final int i_236_ = Canvas_Sub1.inputStream.getUShortA();
			final int i_237_ = Canvas_Sub1.inputStream.getUShortA();
			final String string = Canvas_Sub1.inputStream.getJagexString();
			if (Class69_Sub3_Sub1.updatePacketCounter(i_237_)) {
				Class120_Sub12_Sub28.method1345(string, i_236_);
			}
			client.packetType = -1;
			return true;
		}
		if (client.packetType == 222) {
			final long l = Canvas_Sub1.inputStream.getLong();
			final long l_238_ = Canvas_Sub1.inputStream.getUShort();
			final long l_239_ = Canvas_Sub1.inputStream.getMedium();
			final int i_240_ = Canvas_Sub1.inputStream.getUByte();
			final int i_241_ = Canvas_Sub1.inputStream.getUShort();
			boolean bool_242_ = false;
			final long l_243_ = (l_238_ << 32) + l_239_;
			while_217_: do {
				for (int i_244_ = 0; i_244_ < 100; i_244_++) {
					if (l_243_ == Class120_Sub12_Sub15.aLongArray3245[i_244_]) {
						bool_242_ = true;
						break while_217_;
					}
				}
				if (i_240_ <= 1) {
					for (int i_245_ = 0; i_245_ < Class120_Sub12_Sub26.ignoreCount; i_245_++) {
						if (HintIcon.ignoreNamesAsLong[i_245_] == l) {
							bool_242_ = true;
							break;
						}
					}
				}
			} while (false);
			if (!bool_242_ && Class69_Sub3.isInTutIsland == 0) {
				Class120_Sub12_Sub15.aLongArray3245[Class24.anInt147] = l_243_;
				Class24.anInt147 = (Class24.anInt147 + 1) % 100;
				final String message = QuickChatMessageType.list(i_241_).method1506(Canvas_Sub1.inputStream);
				if (i_240_ == 2) {
					Class120_Sub16.pushMessage(message, new StringBuilder("<img=1>").append(Class136.longToString(l)).toString(), null, 18, i_241_);
				} else if (i_240_ == 1) {
					Class120_Sub16.pushMessage(message, new StringBuilder("<img=0>").append(Class136.longToString(l)).toString(), null, 18, i_241_);
				} else {
					Class120_Sub16.pushMessage(message, Class136.longToString(l), null, 18, i_241_);
				}
			}
			client.packetType = -1;
			return true;
		}
		if (client.packetType == 46) {
			final int i_246_ = Canvas_Sub1.inputStream.getUShort();
			final int i_247_ = Canvas_Sub1.inputStream.getUByte();
			final int i_248_ = Canvas_Sub1.inputStream.getUByte();
			final int i_249_ = Canvas_Sub1.inputStream.getUByte();
			final int i_250_ = Canvas_Sub1.inputStream.getUByte();
			final int i_251_ = Canvas_Sub1.inputStream.getUShort();
			if (Class69_Sub3_Sub1.updatePacketCounter(i_246_)) {
				Class120_Sub12_Sub12.aBooleanArray3223[i_247_] = true;
				Class120_Sub12_Sub37.anIntArray3425[i_247_] = i_248_;
				LightType.anIntArray1790[i_247_] = i_249_;
				LabelGroup.anIntArray2409[i_247_] = i_250_;
				LabelGroup.anIntArray2412[i_247_] = i_251_;
			}
			client.packetType = -1;
			return true;
		}
		if (client.packetType == 153) {
			int i_252_ = Canvas_Sub1.inputStream.getUShort();
			if (i_252_ == 65535) {
				i_252_ = -1;
			}
			final int i_253_ = Canvas_Sub1.inputStream.getUByte();
			final int i_254_ = Canvas_Sub1.inputStream.getUShort();
			final int i_255_ = Canvas_Sub1.inputStream.getUByte();
			Class48.method404(i_252_, i_254_, i_253_, i_255_);
			client.packetType = -1;
			return true;
		}
		if (client.packetType == 135) {
			final int counter = Canvas_Sub1.inputStream.getUShort();
			final int bitPacked = Canvas_Sub1.inputStream.getInt();
			if (Class69_Sub3_Sub1.updatePacketCounter(counter)) {
				final OverridedJInterface overridedInterface = (OverridedJInterface) Class120_Sub12_Sub13.overridedInterfaces.get(bitPacked);
				if (overridedInterface != null) {
					Class120_Sub19.removeOverridedInterface(overridedInterface, true);
				}
				if (Class156.aClass189_1454 != null) {
					InterfaceClickMask.redrawInterface(Class156.aClass189_1454);
					Class156.aClass189_1454 = null;
				}
			}
			client.packetType = -1;
			return true;
		}
		if (client.packetType == 40) {
			final int i_258_ = Canvas_Sub1.inputStream.getLEInt();
			final int i_259_ = Canvas_Sub1.inputStream.getULEShort();
			final int i_260_ = Canvas_Sub1.inputStream.getUByte();
			if (Class69_Sub3_Sub1.updatePacketCounter(i_259_)) {
				Class164.method2132(i_258_, i_260_);
			}
			client.packetType = -1;
			return true;
		}
		if (client.packetType == 23) {
			Class69_Sub3_Sub1.publicChatSetting = Canvas_Sub1.inputStream.getUByte();
			Class120_Sub12_Sub31.privateChatSetting = Canvas_Sub1.inputStream.getUByte();
			KeyboardHandler.tradeChatSetting = Canvas_Sub1.inputStream.getUByte();
			client.packetType = -1;
			return true;
		}
		if (client.packetType == 168) {
			final int i_261_ = Canvas_Sub1.inputStream.getUShort();
			ObjectContainer.remove(i_261_);
			Class120_Sub12_Sub21_Sub1.anIntArray3912[Class120_Sub12_Sub3.method1207(31, Class33.anInt278++)] = Class120_Sub12_Sub3.method1207(32767, i_261_);
			client.packetType = -1;
			return true;
		}
		if (client.packetType == 52) {
			final int i_262_ = Canvas_Sub1.inputStream.getUShort();
			if (Class69_Sub3_Sub1.updatePacketCounter(i_262_)) {
				SpotAnimType.resetCamera();
			}
			client.packetType = -1;
			return true;
		}
		if (client.packetType == 38) {
			final byte i_263_ = Canvas_Sub1.inputStream.getByte();
			final int i_264_ = Canvas_Sub1.inputStream.getULEShort();
			FileSystemRequest.method1544(i_264_, i_263_);
			client.packetType = -1;
			return true;
		}
		if (client.packetType == 194) {
			final int interfaceBitPacked = Canvas_Sub1.inputStream.getInt();
			int objType = Canvas_Sub1.inputStream.getUShort();
			if (69999 < (interfaceBitPacked ^ 0xffffffff)) {
				objType += 32768;
			}
			JagexInterface jagexInterface;
			if (interfaceBitPacked < 0) {
				jagexInterface = null;
			} else {
				jagexInterface = Class74.getJagexInterface(interfaceBitPacked);
			}
			if (jagexInterface != null) {
				for (int id = 0; id < jagexInterface.objIds.length; id++) {
					jagexInterface.objIds[id] = 0;
					jagexInterface.objAmounts[id] = 0;
				}
			}
			ObjectContainer.reset(objType);
			final int len = Canvas_Sub1.inputStream.getUShort();
			for (int id = 0; id < len; id++) {
				final int objId = Canvas_Sub1.inputStream.getUShort();
				int objAmount = Canvas_Sub1.inputStream.getUByteC();
				if (objAmount == 255) {
					objAmount = Canvas_Sub1.inputStream.getInt();
				}
				if (jagexInterface != null && id < jagexInterface.objIds.length) {
					jagexInterface.objIds[id] = objId;
					jagexInterface.objAmounts[id] = objAmount;
				}
				ObjectContainer.addObject(objId - 1, objAmount, id, objType);
			}
			if (jagexInterface != null) {
				InterfaceClickMask.redrawInterface(jagexInterface);
			}
			Class90.redrawOldFormatOverridedInterfaces();
			Class120_Sub12_Sub21_Sub1.anIntArray3912[Class120_Sub12_Sub3.method1207(31, Class33.anInt278++)] = Class120_Sub12_Sub3.method1207(objType, 32767);
			client.packetType = -1;
			return true;
		}
		if (client.packetType == 150) {
			final int animId = Canvas_Sub1.inputStream.getUShort();
			final int index = Canvas_Sub1.inputStream.getUShortA();
			final int delay = Canvas_Sub1.inputStream.getUByteC();
			final Npc npc = Class120_Sub12_Sub11.npcList[index];
			if (npc != null) {
				Npc.playAnimation(npc, animId, delay);
			}
			client.packetType = -1;
			return true;
		}
		if (client.packetType == 93) {
			final int i_275_ = Canvas_Sub1.inputStream.getUShort();
			final int i_276_ = Canvas_Sub1.inputStream.getUByte();
			final int i_277_ = Canvas_Sub1.inputStream.getUByte();
			final int i_278_ = Canvas_Sub1.inputStream.getUShort();
			final int i_279_ = Canvas_Sub1.inputStream.getUByte();
			final int i_280_ = Canvas_Sub1.inputStream.getUByte();
			if (Class69_Sub3_Sub1.updatePacketCounter(i_275_)) {
				Class120_Sub12_Sub16.method1278(i_278_, i_279_, i_276_, i_277_, i_280_);
			}
			client.packetType = -1;
			return true;
		}
		if (client.packetType == 166) {
			Canvas_Sub1.inputStream.pos += 28;
			if (Canvas_Sub1.inputStream.compareCrc()) {
				LongNode.randomFileWrite(Canvas_Sub1.inputStream, Canvas_Sub1.inputStream.pos - 28);
			}
			client.packetType = -1;
			return true;
		}
		if (client.packetType == 42) {
			final int i_281_ = Canvas_Sub1.inputStream.getULEShortA();
			final int i_282_ = Canvas_Sub1.inputStream.getUShortA();
			final int i_283_ = Canvas_Sub1.inputStream.getULEShortA();
			if (Class69_Sub3_Sub1.updatePacketCounter(i_281_)) {
				AmbientSound.setCameraRotation(i_283_, i_282_);
			}
			client.packetType = -1;
			return true;
		}
		if (client.packetType == 18) {
			int i_284_ = Canvas_Sub1.inputStream.getULEShort();
			if (i_284_ == 65535) {
				i_284_ = -1;
			}
			final int i_285_ = Canvas_Sub1.inputStream.getUShort();
			final int i_286_ = Canvas_Sub1.inputStream.getInt();
			if (Class69_Sub3_Sub1.updatePacketCounter(i_285_)) {
				Class120_Sub21.method1695(2, -1, i_286_, i_284_);
			}
			client.packetType = -1;
			return true;
		}
		if (client.packetType == 43) {
			Class120_Sub12_Sub26.ignoreCount = AbstractMouseWheelHandler.packetSize / 8;
			for (int id = 0; id < Class120_Sub12_Sub26.ignoreCount; id++) {
				HintIcon.ignoreNamesAsLong[id] = Canvas_Sub1.inputStream.getLong();
				GZIPDecompressor.ignoreNames[id] = Class174.longToString(HintIcon.ignoreNamesAsLong[id]);
				SpotAnimationNode.aBooleanArray3468[id] = false;
			}
			client.packetType = -1;
			client.anInt563 = GrandExchangeObject.anInt1494;
			return true;
		}
		if (client.packetType == 221) {
			final long l = Canvas_Sub1.inputStream.getLong();
			final int i_288_ = Canvas_Sub1.inputStream.getUShort();
			final String string = QuickChatMessageType.list(i_288_).method1506(Canvas_Sub1.inputStream);
			Class120_Sub16.pushMessage(string, Class136.longToString(l), null, 19, i_288_);
			client.packetType = -1;
			return true;
		}
		if (client.packetType == 199) {
			final int i_289_ = Canvas_Sub1.inputStream.getInt1();
			final int i_290_ = Canvas_Sub1.inputStream.getUShort();
			if (Class69_Sub3_Sub1.updatePacketCounter(i_290_)) {
				int i_291_ = 0;
				if (TileParticleQueue.selfPlayer.appearance != null) {
					i_291_ = TileParticleQueue.selfPlayer.appearance.method2043();
				}
				Class120_Sub21.method1695(3, -1, i_289_, i_291_);
			}
			client.packetType = -1;
			return true;
		}
		if (client.packetType == 243) {
			final int i_292_ = Canvas_Sub1.inputStream.getUShort();
			final int i_293_ = Canvas_Sub1.inputStream.getInt1();
			final int i_294_ = Canvas_Sub1.inputStream.getULEShortA();
			if (Class69_Sub3_Sub1.updatePacketCounter(i_294_)) {
				EntityRenderData.method250(i_293_, i_292_);
			}
			client.packetType = -1;
			return true;
		}
		if (client.packetType == 19) {
			final int index = Canvas_Sub1.inputStream.getUByte();
			if (Canvas_Sub1.inputStream.getUByte() != 0) {
				final PacketBuffer packetBuffer = Canvas_Sub1.inputStream;
				packetBuffer.pos = ((Buffer) packetBuffer).pos - 1;
				LongNode.grandExchangeObjects[index] = new GrandExchangeObject(Canvas_Sub1.inputStream);
			} else {
				LongNode.grandExchangeObjects[index] = new GrandExchangeObject();
			}
			client.packetType = -1;
			Class120_Sub29.anInt2768 = GrandExchangeObject.anInt1494;
			return true;
		}
		SpotAnimation.method2312(null, new StringBuilder("T1 - ").append(client.packetType).append(",").append(MapFunctionType.thirdPacketType).append(",").append(SeqType.fourthPacketType).append(" - ").append(AbstractMouseWheelHandler.packetSize).toString());
		DummyInputStream.processLogout();
		return true;
	}

	abstract void method738();

	public AbstractTimer() {
		/* empty */
	}

	abstract long method739();
}
