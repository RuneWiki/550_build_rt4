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

	public static void method736(final int i) {
		try {
			worldConnection = null;
			aClass105_824 = null;
			if (i >= -22) {
				method736(-120);
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("jf.B(").append(i).append(')').toString());
		}
	}

	static final boolean method737() throws IOException {
		if (worldConnection == null) {
			return false;
		}
		int available = worldConnection.getAvailable();
		if (available == 0) {
			return false;
		}
		if (Class23.packetType == -1) {
			worldConnection.read(Canvas_Sub1.inputStream.buf, 0, 1);
			Canvas_Sub1.inputStream.pos = 0;
			available--;
			Class23.packetType = Canvas_Sub1.inputStream.getUByteIsaac();
			AbstractMouseWheelHandler.packetSize = Class93.packetSizes[Class23.packetType];
		}
		if (AbstractMouseWheelHandler.packetSize == -1) {
			if (available <= 0) {
				return false;
			}
			available--;
			worldConnection.read(Canvas_Sub1.inputStream.buf, 0, 1);
			AbstractMouseWheelHandler.packetSize = 0xff & Canvas_Sub1.inputStream.buf[0];
		}
		if (AbstractMouseWheelHandler.packetSize == -2) {
			if (available > 1) {
				available -= 2;
				worldConnection.read(Canvas_Sub1.inputStream.buf, 0, 2);
				Canvas_Sub1.inputStream.pos = 0;
				AbstractMouseWheelHandler.packetSize = Canvas_Sub1.inputStream.getUShort();
			} else {
				return false;
			}
		}
		if (AbstractMouseWheelHandler.packetSize > available) {
			return false;
		}
		Canvas_Sub1.inputStream.pos = 0;
		worldConnection.read(Canvas_Sub1.inputStream.buf, 0, AbstractMouseWheelHandler.packetSize);
		SeqType.anInt333 = MapFunctionType.anInt639;
		MapFunctionType.anInt639 = Class114.anInt1093;
		Class88.anInt827 = 0;
		Class114.anInt1093 = Class23.packetType;
		if (Class23.packetType == 163) {
			for (int i_12_ = 0; i_12_ < Class2.permanentVariable.length; i_12_++) {
				if (Class2.permanentVariable[i_12_] != Class30.anIntArray239[i_12_]) {
					Class2.permanentVariable[i_12_] = Class30.anIntArray239[i_12_];
					Class120_Sub14_Sub15.method1554(i_12_);
					Class88.anIntArray833[Class120_Sub12_Sub3.method1207(31, VarBit.anInt165++)] = i_12_;
				}
			}
			Class23.packetType = -1;
			return true;
		}
		if (Class23.packetType == 34) {
			final int i_13_ = Canvas_Sub1.inputStream.getInt();
			int objType = Canvas_Sub1.inputStream.getUShort();
			JagexInterface jagexInterface;
			if (i_13_ >= 0) {
				jagexInterface = Class74.getJagexInterface(i_13_);
			} else {
				jagexInterface = null;
			}
			if ((i_13_ ^ 0xffffffff) > 69999) {
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
				ObjectContainer.addObject(objType, objSlot, objId - 1, objAmt);
			}
			if (jagexInterface != null) {
				InterfaceClickMask.redrawInterface(jagexInterface);
			}
			Class90.redrawOldFormatOverridedInterfaces();
			Class120_Sub12_Sub21_Sub1.anIntArray3912[Class120_Sub12_Sub3.method1207(31, Class33.anInt278++)] = Class120_Sub12_Sub3.method1207(32767, objType);
			Class23.packetType = -1;
			return true;
		}
		if (Class23.packetType == 53) {
			Class28.anInt176 = Canvas_Sub1.inputStream.getUByteS();
			Class32.anInt254 = Canvas_Sub1.inputStream.getUByteA();
			while (AbstractMouseWheelHandler.packetSize > Canvas_Sub1.inputStream.pos) {
				Class23.packetType = Canvas_Sub1.inputStream.getUByte();
				Class191.method2513();
			}
			Class23.packetType = -1;
			return true;
		}
		if (Class23.packetType == 192) {
			DummyInputStream.processLogout();
			Class23.packetType = -1;
			return false;
		}
		if (Class23.packetType == 176) {
			final int i_18_ = Canvas_Sub1.inputStream.getUShort();
			final int i_19_ = Canvas_Sub1.inputStream.getULEShortA();
			final byte i_20_ = Canvas_Sub1.inputStream.getByteC();
			if (Class69_Sub3_Sub1.updatePacketCounter(i_18_)) {
				Class20.method180(i_19_, i_20_);
			}
			Class23.packetType = -1;
			return true;
		}
		if (Class23.packetType == 4) {
			ObjectPile.friendsServerStatus = Canvas_Sub1.inputStream.getUByte();
			Class61.anInt563 = GrandExchangeObject.anInt1494;
			Class23.packetType = -1;
			return true;
		}
		if (Class23.packetType == 35) {
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
			Class23.packetType = -1;
			return true;
		}
		if (Class23.packetType == 59) {
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
							AbstractRequest.method1540(string_25_, 10, "");
						}
					} else if (!string.endsWith(":clan:")) {
						if (!string.endsWith(":trade:")) {
							if (string.endsWith(":assist:")) {
								final String string_28_ = string.substring(0, string.indexOf(":assist:"));
								if (Class69_Sub3.isInTutIsland == 0) {
									AbstractRequest.method1540("", 13, string_28_);
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
												AbstractRequest.method1540(string_29_, 21, string_32_);
											}
										} else if (!string.endsWith(":spam:")) {
											AbstractRequest.method1540("", 0, string);
										} else {
											final String string_33_ = string.substring(0, -6 + string.length());
											if (Class69_Sub3.isInTutIsland == 0) {
												AbstractRequest.method1540("", 22, string_33_);
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
											AbstractRequest.method1540(string_34_, 16, "");
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
										AbstractRequest.method1540(string_37_, 15, "");
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
									AbstractRequest.method1540(string_40_, 14, "");
								}
							}
						} else {
							final String string_43_ = string.substring(0, string.indexOf(":trade:"));
							if (Class69_Sub3.isInTutIsland == 0) {
								AbstractRequest.method1540("", 12, string_43_);
							}
						}
					} else {
						final String string_44_ = string.substring(0, string.indexOf(":clan:"));
						AbstractRequest.method1540("", 11, string_44_);
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
						AbstractRequest.method1540(string_45_, 8, string_48_);
					}
				}
			} else {
				final String string_49_ = string.substring(0, string.indexOf(":"));
				boolean bool_50_ = false;
				final long l = Varp.stringToLong(string_49_);
				for (int i_51_ = 0; Class120_Sub12_Sub26.ignoreCount > i_51_; i_51_++) {
					if ((HintIcon.ignoreNamesAsLong[i_51_] ^ 0xffffffffffffffffL) == (l ^ 0xffffffffffffffffL)) {
						bool_50_ = true;
						break;
					}
				}
				if (!bool_50_ && Class69_Sub3.isInTutIsland == 0) {
					AbstractRequest.method1540(string_49_, 4, Class61.aString568);
				}
			}
			Class23.packetType = -1;
			return true;
		}
		if (Class23.packetType == 162) {
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
			Class23.packetType = -1;
			return true;
		}
		if (Class23.packetType == 1) {
			final int i_59_ = Canvas_Sub1.inputStream.getULEShort();
			final String string = Canvas_Sub1.inputStream.getJagexString();
			final int i_60_ = Canvas_Sub1.inputStream.getInt1();
			if (Class69_Sub3_Sub1.updatePacketCounter(i_59_)) {
				InterfaceChangeNode.method761(string, i_60_);
			}
			Class23.packetType = -1;
			return true;
		}
		if (Class23.packetType == 11) {
			final int i_61_ = Canvas_Sub1.inputStream.getULEShort();
			final int i_62_ = Canvas_Sub1.inputStream.getInt2();
			final int i_63_ = Canvas_Sub1.inputStream.getUShortA();
			if (Class69_Sub3_Sub1.updatePacketCounter(i_61_)) {
				Class120_Sub12_Sub11.method1250(i_63_, i_62_);
			}
			Class23.packetType = -1;
			return true;
		}
		if (Class23.packetType == 148) {
			final int i_64_ = Canvas_Sub1.inputStream.getUShort();
			final int i_65_ = Canvas_Sub1.inputStream.getLEInt();
			final int i_66_ = Canvas_Sub1.inputStream.getUShort();
			if (Class69_Sub3_Sub1.updatePacketCounter(i_66_)) {
				Class20.method180(i_64_, i_65_);
			}
			Class23.packetType = -1;
			return true;
		}
		if (Class23.packetType == 95) {
			Class90.redrawOldFormatOverridedInterfaces();
			LookupTable.weight = Canvas_Sub1.inputStream.getShort();
			Class120_Sub2.anInt2419 = GrandExchangeObject.anInt1494;
			Class23.packetType = -1;
			return true;
		}
		if (Class23.packetType == 164) {
			Class90.redrawOldFormatOverridedInterfaces();
			final int i_67_ = Canvas_Sub1.inputStream.getUByte();
			final int i_68_ = Canvas_Sub1.inputStream.getInt1();
			final int i_69_ = Canvas_Sub1.inputStream.getUByte();
			Class120_Sub12_Sub38.skillsXp[i_69_] = i_68_;
			SceneGraphNode.skillsLevel[i_69_] = i_67_;
			Decimator.skillsBaseLevel[i_69_] = 1;
			for (int i_70_ = 0; i_70_ < 98; i_70_++) {
				if (i_68_ >= Class55.skillsXpForLevel[i_70_]) {
					Decimator.skillsBaseLevel[i_69_] = i_70_ + 2;
				}
			}
			Class120_Sub12_Sub18.skillTriggers[Class120_Sub12_Sub3.method1207(31, Class120_Sub21.skillTriggersPos++)] = i_69_;
			Class23.packetType = -1;
			return true;
		}
		if (Class23.packetType == 8) {
			Class90.redrawOldFormatOverridedInterfaces();
			Class69_Sub2.energy = Canvas_Sub1.inputStream.getUByte();
			Class120_Sub2.anInt2419 = GrandExchangeObject.anInt1494;
			Class23.packetType = -1;
			return true;
		}
		if (Class23.packetType == 86) {
			Class143.setSettings(Canvas_Sub1.inputStream.getJagexString());
			Class23.packetType = -1;
			return true;
		}
		if (Class23.packetType == 87) {
			final int i_71_ = Canvas_Sub1.inputStream.getULEShortA();
			int i_72_ = Canvas_Sub1.inputStream.getUShort();
			if (i_72_ == 65535) {
				i_72_ = -1;
			}
			final int i_73_ = Canvas_Sub1.inputStream.getLEInt();
			if (Class69_Sub3_Sub1.updatePacketCounter(i_71_)) {
				Class120_Sub21.method1695(1, -1, i_73_, i_72_);
			}
			Class23.packetType = -1;
			return true;
		}
		if (Class23.packetType == 49) {
			Class120_Sub29.receiveRegionData(false);
			Class23.packetType = -1;
			return true;
		}
		if (Class23.packetType == 138) {
			final int i_74_ = Canvas_Sub1.inputStream.getULEShortA();
			final int i_75_ = Canvas_Sub1.inputStream.getInt2();
			Class142.method2004(i_75_, i_74_);
			Class23.packetType = -1;
			return true;
		}
		if (Class23.packetType == 96) {
			if (Class69.rootInterfaceId != -1) {
				InterfaceClickMask.method1689(0, Class69.rootInterfaceId);
			}
			Class23.packetType = -1;
			return true;
		}
		if (Class23.packetType == 97) {
			Class28.anInt176 = Canvas_Sub1.inputStream.getUByteS();
			Class32.anInt254 = Canvas_Sub1.inputStream.getUByteA();
			Class23.packetType = -1;
			return true;
		}
		if (Class23.packetType == 25) {// TODO player update
			DisplayModeInfo.method2213();
			Class23.packetType = -1;
			return true;
		}
		if (Class23.packetType == 126) {
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
			Class23.packetType = -1;
			return true;
		}
		if (Class23.packetType == 55) {
			AbstractGraphicsBuffer.anInt1175 = Canvas_Sub1.inputStream.getUByte();
			Class23.packetType = -1;
			return true;
		}
		if (Class23.packetType == 31) {
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
			Class23.packetType = -1;
			return true;
		}
		if (Class23.packetType == 174) {
			long nameAsLong = Canvas_Sub1.inputStream.getLong();
			final int world = Canvas_Sub1.inputStream.getUShort();
			boolean bool_87_ = false;
			if (-1L != (~0x7fffffffffffffffL & nameAsLong ^ 0xffffffffffffffffL)) {
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
					final int compareResponce = Class120_Sub28.clanMembers[memberIndex].name.compareTo(clanMember.name);
					if (compareResponce == 0) {
						Class120_Sub28.clanMembers[memberIndex].world = world;
						Class120_Sub28.clanMembers[memberIndex].rank = rank;
						Class120_Sub28.clanMembers[memberIndex].sideText = sideText;
						Class120_Sub12_Sub12.anInt3217 = GrandExchangeObject.anInt1494;
						if (Class20.selfNameAsLong == nameAsLong) {
							MouseHandler.selfClanRank = rank;
						}
						Class23.packetType = -1;
						return true;
					}
					if (compareResponce < 0) {
						break;
					}
				}
				if (Class120_Sub14_Sub13.clanMembersAmount >= Class120_Sub28.clanMembers.length) {
					Class23.packetType = -1;
					return true;
				}
				for (int i_91_ = Class120_Sub14_Sub13.clanMembersAmount - 1; memberIndex < i_91_; i_91_--) {
					Class120_Sub28.clanMembers[i_91_ + 1] = Class120_Sub28.clanMembers[i_91_];
				}
				if (Class120_Sub14_Sub13.clanMembersAmount == 0) {
					Class120_Sub28.clanMembers = new ClanMember[100];
				}
				Class120_Sub28.clanMembers[memberIndex + 1] = clanMember;
				if (nameAsLong == Class20.selfNameAsLong) {
					MouseHandler.selfClanRank = rank;
				}
				Class120_Sub14_Sub13.clanMembersAmount++;
			} else {
				if (Class120_Sub14_Sub13.clanMembersAmount == 0) {
					Class23.packetType = -1;
					return true;
				}
				nameAsLong &= 0x7fffffffffffffffL;
				int i_92_;
				for (i_92_ = 0; Class120_Sub14_Sub13.clanMembersAmount > i_92_ && ((Class120_Sub28.clanMembers[i_92_].uid ^ 0xffffffffffffffffL) != (nameAsLong ^ 0xffffffffffffffffL) || world != Class120_Sub28.clanMembers[i_92_].world); i_92_++) {
					/* empty */
				}
				if (i_92_ < Class120_Sub14_Sub13.clanMembersAmount) {
					for (/**/; i_92_ < Class120_Sub14_Sub13.clanMembersAmount - 1; i_92_++) {
						Class120_Sub28.clanMembers[i_92_] = Class120_Sub28.clanMembers[i_92_ + 1];
					}
					Class120_Sub14_Sub13.clanMembersAmount--;
					Class120_Sub28.clanMembers[Class120_Sub14_Sub13.clanMembersAmount] = null;
				}
			}
			Class120_Sub12_Sub12.anInt3217 = GrandExchangeObject.anInt1494;
			Class23.packetType = -1;
			return true;
		}
		if (Class23.packetType == 104) {
			final long l = Canvas_Sub1.inputStream.getLong();
			final String string = Class120_Sub14_Sub8.method1472(Class120_Sub22.method1705(Class7.decodeText(Canvas_Sub1.inputStream)));
			AbstractRequest.method1540(Class136.longToString(l), 6, string);
			Class23.packetType = -1;
			return true;
		}
		if (Class23.packetType == 253) {
			final int i_93_ = Canvas_Sub1.inputStream.getUShort();
			final String string = Canvas_Sub1.inputStream.getJagexString();
			final Object[] objects = new Object[string.length() + 1];
			for (int i_94_ = string.length() + -1; i_94_ >= 0; i_94_--) {
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
				Class88.method744(class120_sub10);
			}
			Class23.packetType = -1;
			return true;
		}
		if (Class23.packetType == 63) {
			int i_95_ = Canvas_Sub1.inputStream.getULEShort();
			final int i_96_ = Canvas_Sub1.inputStream.getUByteS();
			if ((i_95_ ^ 0xffffffff) == -65536) {
				i_95_ = -1;
			}
			final int i_97_ = i_96_ >> 2;
			final int i_98_ = CollisionMap.anIntArray153[i_97_];
			final int i_99_ = i_96_ & 0x3;
			final int i_100_ = Canvas_Sub1.inputStream.getInt();
			final int i_101_ = (i_100_ & 0x3bd1748b) >> 28;
			int i_102_ = (i_100_ & 0xfffe0e8) >> 14;
			int i_103_ = 0x3fff & i_100_;
			i_103_ -= Class181.currentBaseZ;
			i_102_ -= GameEntity.currentBaseX;
			ProducingGraphicsBuffer.method1853(i_95_, i_102_, (byte) -105, i_101_, i_103_, i_98_, i_99_, i_97_);
			Class23.packetType = -1;
			return true;
		}
		if (Class23.packetType == 30) {
			if (Class120_Sub14_Sub10.fullscreenFrame != null) {
				AbstractSprite.method1593(Class120_Sub12_Sub19.currentDisplayMode, -1, -1, false);
			}
			final byte[] is = new byte[AbstractMouseWheelHandler.packetSize];
			Canvas_Sub1.inputStream.getBytesIsaac(is, 0, AbstractMouseWheelHandler.packetSize);
			final String string = DisplayModeInfo.method2215(is, 0, AbstractMouseWheelHandler.packetSize);
			System.out.println(string);
			if (Class112.frame != null || Signlink.anInt1310 != 3 && Signlink.osName.startsWith("win") && !FileSystem.haveInternetExplorer6) {
				WorldInfo.aString1421 = string;
				Class99.aBoolean950 = true;
				Class3.aClass185_56 = NpcType.gameSignlink.method1953(string, (byte) -88);
			} else {
				Class188.method2482(string, true);
			}
			Class23.packetType = -1;
			return true;
		}
		if (Class23.packetType == 147) {
			Class32.anInt254 = Canvas_Sub1.inputStream.getUByte();
			Class28.anInt176 = Canvas_Sub1.inputStream.getUByteA();
			for (int i_104_ = Class32.anInt254; i_104_ < Class32.anInt254 + 8; i_104_++) {
				for (int i_105_ = Class28.anInt176; i_105_ < 8 + Class28.anInt176; i_105_++) {
					if (ClientScript.groundObjects[Class173.gameLevel][i_104_][i_105_] != null) {
						ClientScript.groundObjects[Class173.gameLevel][i_104_][i_105_] = null;
						Class5.spawnGroundObject(i_104_, i_105_);
					}
				}
			}
			for (Class120_Sub24 class120_sub24 = (Class120_Sub24) Class120_Sub4.aClass105_2439.getFront(); class120_sub24 != null; class120_sub24 = (Class120_Sub24) Class120_Sub4.aClass105_2439.getNext()) {
				if (Class32.anInt254 <= class120_sub24.anInt2731 && class120_sub24.anInt2731 < 8 + Class32.anInt254 && Class28.anInt176 <= class120_sub24.anInt2725 && 8 + Class28.anInt176 > class120_sub24.anInt2725 && Class173.gameLevel == class120_sub24.anInt2722) {
					class120_sub24.anInt2720 = 0;
				}
			}
			Class23.packetType = -1;
			return true;
		}
		if (Class23.packetType == 10) {
			final int i_106_ = Canvas_Sub1.inputStream.getInt1();
			final int i_107_ = Canvas_Sub1.inputStream.getUShortA();
			FileSystemRequest.method1544(i_107_, i_106_);
			Class23.packetType = -1;
			return true;
		}
		if (Class23.packetType == 100) {
			int i_108_ = Canvas_Sub1.inputStream.getUShort();
			if ((i_108_ ^ 0xffffffff) == -65536) {
				i_108_ = -1;
			}
			final int i_109_ = Canvas_Sub1.inputStream.getUByteA();
			ObjectPile.method2447(i_109_, i_108_);
			Class23.packetType = -1;
			return true;
		}
		if (Class23.packetType == 206) {
			final int i_110_ = Canvas_Sub1.inputStream.getUByte();
			int i_111_ = Canvas_Sub1.inputStream.getULEShortA();
			if (i_111_ == 65535) {
				i_111_ = -1;
			}
			final int i_112_ = Canvas_Sub1.inputStream.method1092();
			Class101.method832(-1, i_110_, i_112_, i_111_);
			Class23.packetType = -1;
			return true;
		}
		if (Class23.packetType == 54) {
			if (AbstractMouseWheelHandler.packetSize == 0) {
				Npc.aString3752 = Class120_Sub12_Sub1.aString3132;
			} else {
				Npc.aString3752 = Canvas_Sub1.inputStream.getJagexString();
			}
			Class23.packetType = -1;
			return true;
		}
		if (Class23.packetType == 33) {
			final int i_113_ = Canvas_Sub1.inputStream.getUByte();
			final int i_114_ = Canvas_Sub1.inputStream.getUByte();
			final byte i_115_ = Canvas_Sub1.inputStream.getByte();
			if (client.aByte2201 != i_115_) {
				Class23.packetType = -1;
				return true;
			}
			Class23.packetType = -1;
			if (i_113_ != 255) {
				SceneGroundObject.packetSetFlagPosition = true;
				Class65.flagY = i_114_;
				Class120_Sub12_Sub26.flagX = i_113_;
			} else {
				SceneGroundObject.packetSetFlagPosition = false;
				Class120_Sub12_Sub26.flagX = 0;
				Class65.flagY = 0;
			}
			return true;
		}
		if (Class23.packetType == 183) {
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
					Class120_Sub12_Sub37.method1394((byte) -48, objType.yof2d, objType.zan2d, objType.xof2d, i_116_);
				} else {
					if (i_117_ == -1) {
						jagexInterface.modelTypeDisabled = 0;
						Class23.packetType = -1;
						return true;
					}
					final ObjType objType = ObjType.list(i_117_);
					jagexInterface.rotateY = objType.yan2d;
					jagexInterface.modelTypeDisabled = 4;
					jagexInterface.mediaIdDisabled = i_117_;
					jagexInterface.rotateX = objType.xan2d;
					jagexInterface.zoom = objType.zoom2d * 100 / i_119_;
					InterfaceClickMask.redrawInterface(jagexInterface);
				}
			}
			Class23.packetType = -1;
			return true;
		}
		if (Class23.packetType == 65) {
			final int i_120_ = Canvas_Sub1.inputStream.getInt2();
			final int i_121_ = Canvas_Sub1.inputStream.getULEShortA();
			final int i_122_ = Canvas_Sub1.inputStream.getShortA();
			final int i_123_ = Canvas_Sub1.inputStream.getLEShort();
			if (Class69_Sub3_Sub1.updatePacketCounter(i_121_)) {
				Class29.method254(i_120_, i_122_, i_123_);
			}
			Class23.packetType = -1;
			return true;
		}
		if (Class23.packetType == 152) {
			final int i_124_ = Canvas_Sub1.inputStream.getULEShortA();
			final int i_125_ = Canvas_Sub1.inputStream.getULEShortA();
			final int i_126_ = Canvas_Sub1.inputStream.getUShortA();
			final int i_127_ = Canvas_Sub1.inputStream.getLEInt();
			if (Class69_Sub3_Sub1.updatePacketCounter(i_124_)) {
				Class89.method746(i_127_, i_126_ + (i_125_ << 16));
			}
			Class23.packetType = -1;
			return true;
		}
		if (Class23.packetType == 44) {
			boolean bool_128_ = false;
			final long l = Canvas_Sub1.inputStream.getLong();
			final long l_129_ = Canvas_Sub1.inputStream.getUShort();
			final long l_130_ = Canvas_Sub1.inputStream.getMedium();
			final long l_131_ = (l_129_ << 32) + l_130_;
			final int i_132_ = Canvas_Sub1.inputStream.getUByte();
			while_214_: do {
				for (int i_133_ = 0; i_133_ < 100; i_133_++) {
					if ((Class120_Sub12_Sub15.aLongArray3245[i_133_] ^ 0xffffffffffffffffL) == (l_131_ ^ 0xffffffffffffffffL)) {
						bool_128_ = true;
						break while_214_;
					}
				}
				if (i_132_ <= 1) {
					if (VarBit.aBoolean167 && !OverlayType.aBoolean1228 || Class120_Sub14_Sub4.aBoolean3464) {
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
				Class24.anInt147 = (Class24.anInt147 - -1) % 100;
				final String string = Class120_Sub14_Sub8.method1472(Class120_Sub22.method1705(Class7.decodeText(Canvas_Sub1.inputStream)));
				if (i_132_ == 2 || i_132_ == 3) {
					AbstractRequest.method1540(new StringBuilder("<img=1>").append(Class136.longToString(l)).toString(), 7, string);
				} else if (i_132_ != 1) {
					AbstractRequest.method1540(Class136.longToString(l), 3, string);
				} else {
					AbstractRequest.method1540(new StringBuilder("<img=0>").append(Class136.longToString(l)).toString(), 7, string);
				}
			}
			Class23.packetType = -1;
			return true;
		}
		if (Class23.packetType == 89) {
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
			Class23.packetType = -1;
			return true;
		}
		if (Class23.packetType == 246) {
			final long l = Canvas_Sub1.inputStream.getLong();
			Canvas_Sub1.inputStream.getByte();
			final long l_139_ = Canvas_Sub1.inputStream.getLong();
			final long l_140_ = Canvas_Sub1.inputStream.getUShort();
			final long l_141_ = Canvas_Sub1.inputStream.getMedium();
			final long l_142_ = (l_140_ << 32) - -l_141_;
			final int i_143_ = Canvas_Sub1.inputStream.getUByte();
			boolean bool_144_ = false;
			while_215_: do {
				for (int i_145_ = 0; i_145_ < 100; i_145_++) {
					if (Class120_Sub12_Sub15.aLongArray3245[i_145_] == l_142_) {
						bool_144_ = true;
						break while_215_;
					}
				}
				if (i_143_ <= 1) {
					if (VarBit.aBoolean167 && !OverlayType.aBoolean1228 || Class120_Sub14_Sub4.aBoolean3464) {
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
			} while (false);
			if (!bool_144_ && Class69_Sub3.isInTutIsland == 0) {
				Class120_Sub12_Sub15.aLongArray3245[Class24.anInt147] = l_142_;
				Class24.anInt147 = (Class24.anInt147 + 1) % 100;
				final String message = Class120_Sub14_Sub8.method1472(Class120_Sub22.method1705(Class7.decodeText(Canvas_Sub1.inputStream)));
				if (i_143_ != 2 && i_143_ != 3) {
					if (i_143_ == 1) {
						GroundTile.method1669(9, new StringBuilder("<img=0>").append(Class136.longToString(l)).toString(), Class136.longToString(l_139_), message, -1);
					} else {
						GroundTile.method1669(9, Class136.longToString(l), Class136.longToString(l_139_), message, -1);
					}
				} else {
					GroundTile.method1669(9, new StringBuilder("<img=1>").append(Class136.longToString(l)).toString(), Class136.longToString(l_139_), message, -1);
				}
			}
			Class23.packetType = -1;
			return true;
		}
		if (Class23.packetType == 90) {
			final int i_147_ = Canvas_Sub1.inputStream.getULEShortA();
			final int i_148_ = Canvas_Sub1.inputStream.getUShortA();
			final int i_149_ = Canvas_Sub1.inputStream.getUShortA();
			final int i_150_ = Canvas_Sub1.inputStream.getULEShort();
			final int i_151_ = Canvas_Sub1.inputStream.getLEInt();
			if (Class69_Sub3_Sub1.updatePacketCounter(i_149_)) {
				SeqType.method325(i_148_, i_147_, i_150_, i_151_);
			}
			Class23.packetType = -1;
			return true;
		}
		if (Class23.packetType == 130) {
			final int i_152_ = Canvas_Sub1.inputStream.getUByteA();
			final int i_153_ = Canvas_Sub1.inputStream.getUByteC();
			final int i_154_ = Canvas_Sub1.inputStream.getUByte();
			Class173.gameLevel = i_154_ >> 1;
			TileParticleQueue.selfPlayer.method2343(i_153_, i_152_, (i_154_ & 0x1) == 1);
			Class23.packetType = -1;
			return true;
		}
		if (Class23.packetType == 172) {
			final int i_155_ = Canvas_Sub1.inputStream.getLEInt();
			final int i_156_ = Canvas_Sub1.inputStream.getShort();
			final int i_157_ = Canvas_Sub1.inputStream.getULEShortA();
			if (Class69_Sub3_Sub1.updatePacketCounter(i_157_)) {
				Class120_Sub14_Sub24.method1647(i_155_, i_156_);
			}
			Class23.packetType = -1;
			return true;
		}
		if (Class23.packetType == 103) {
			final int i_158_ = Canvas_Sub1.inputStream.getInt();
			LabelGroup.aClass185_2403 = NpcType.gameSignlink.method1952((byte) -73, i_158_);
			Class23.packetType = -1;
			return true;
		}
		if (Class23.packetType == 242) {
			final int i_159_ = Canvas_Sub1.inputStream.getUByte();
			final int i_160_ = Canvas_Sub1.inputStream.getULEShort();
			if (Class69_Sub3_Sub1.updatePacketCounter(i_160_)) {
				Class134.entityRenderPriority = i_159_;
			}
			Class23.packetType = -1;
			return true;
		}
		if (Class23.packetType == 2) {
			Class120_Sub12_Sub12.anInt3217 = GrandExchangeObject.anInt1494;
			final long clanOwnerAsLong = Canvas_Sub1.inputStream.getLong();
			if (clanOwnerAsLong == 0L) {
				InterfaceChangeNode.clanName = null;
				Class120_Sub14_Sub13.clanMembersAmount = 0;
				Class150.clanOwner = null;
				Class23.packetType = -1;
				Class120_Sub28.clanMembers = null;
				return true;
			}
			final long clanNameAsLong = Canvas_Sub1.inputStream.getLong();
			InterfaceChangeNode.clanName = Class174.longToString(clanNameAsLong);
			Class150.clanOwner = Class174.longToString(clanOwnerAsLong);
			Class112.kickRights = Canvas_Sub1.inputStream.getByte();
			final int userAmount = Canvas_Sub1.inputStream.getUByte();
			if (userAmount == 255) {
				Class23.packetType = -1;
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
				if (Class20.selfNameAsLong == clanMembers[id].uid) {
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
			Class23.packetType = -1;
			Class120_Sub28.clanMembers = clanMembers;
			return true;
		}
		if (Class23.packetType == 173) {
			Class120_Sub12.method1182(NpcType.gameSignlink, AbstractMouseWheelHandler.packetSize, (byte) -120, Canvas_Sub1.inputStream);
			Class23.packetType = -1;
			return true;
		}
		if (Class23.packetType == 115 || Class23.packetType == 111 || Class23.packetType == 17 || Class23.packetType == 144 || Class23.packetType == 114 || Class23.packetType == 133 || Class23.packetType == 47 || Class23.packetType == 158 || Class23.packetType == 105 || Class23.packetType == 120 || Class23.packetType == 60 || Class23.packetType == 179 || Class23.packetType == 232 || Class23.packetType == 131) {
			Class191.method2513();
			Class23.packetType = -1;
			return true;
		}
		if (Class23.packetType == 113) {
			final int i_167_ = Canvas_Sub1.inputStream.getUShort();
			final int i_168_ = Canvas_Sub1.inputStream.getInt2();
			final int i_169_ = Canvas_Sub1.inputStream.getULEShortA();
			final int i_170_ = Canvas_Sub1.inputStream.getULEShortA();
			final int i_171_ = Canvas_Sub1.inputStream.getULEShortA();
			if (Class69_Sub3_Sub1.updatePacketCounter(i_170_)) {
				Class120_Sub21.method1695(7, i_167_, i_168_, i_169_ << 16 | i_171_);
			}
			Class23.packetType = -1;
			return true;
		}
		if (Class23.packetType == 182) {
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
							AbstractRequest.method1540("", 5, new StringBuilder(name).append(Class120_Sub21.aString2669).toString());
						}
						if (world == 0) {
							AbstractRequest.method1540("", 5, new StringBuilder(name).append(Class132.aString1250).toString());
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
			Class61.anInt563 = GrandExchangeObject.anInt1494;
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
			Class23.packetType = -1;
			return true;
		}
		if (Class23.packetType == 225) {
			final int i_186_ = Canvas_Sub1.inputStream.getUShort();
			final int i_187_ = Canvas_Sub1.inputStream.getULEShortA();
			final int i_188_ = Canvas_Sub1.inputStream.getUByteS();
			if (Class69_Sub3_Sub1.updatePacketCounter(i_187_)) {
				if (i_188_ == 2) {
					Class54.method480();
				}
				Class69.rootInterfaceId = i_186_;
				Class120_Sub14_Sub1.stopInterfaceAnimation(i_186_);
				Class101_Sub2.method846(false);
				JagexSocket.executeOnloadScript(Class69.rootInterfaceId);
				for (int id = 0; id < 100; id++) {
					MasterIndexInfo.needInterfaceRedrawWrapper[id] = true;
				}
			}
			Class23.packetType = -1;
			return true;
		}
		if (Class23.packetType == 156) {
			final int i_190_ = Canvas_Sub1.inputStream.getUShort();
			if (Class69_Sub3_Sub1.updatePacketCounter(i_190_)) {
				Class3.smoothCamera();
			}
			Class23.packetType = -1;
			return true;
		}
		if (Class23.packetType == 229) {
			for (int i_191_ = 0; Class118.playersList.length > i_191_; i_191_++) {
				if (Class118.playersList[i_191_] != null) {
					Class118.playersList[i_191_].anInt3006 = -1;
				}
			}
			for (int i_192_ = 0; i_192_ < Class120_Sub12_Sub11.npcList.length; i_192_++) {
				if (Class120_Sub12_Sub11.npcList[i_192_] != null) {
					Class120_Sub12_Sub11.npcList[i_192_].anInt3006 = -1;
				}
			}
			Class23.packetType = -1;
			return true;
		}
		if (Class23.packetType == 78) {
			Class33.resetVarp();
			Class90.redrawOldFormatOverridedInterfaces();
			Class23.packetType = -1;
			VarBit.anInt165 += 32;
			return true;
		}
		if (Class23.packetType == 177) {
			final int bitPacked = Canvas_Sub1.inputStream.getUByte();
			final int index = bitPacked >> 5;
			final int targetType = 0x1f & bitPacked;
			if (targetType == 0) {
				Class187.hintIcons[index] = null;
				Class23.packetType = -1;
				return true;
			}
			final HintIcon hintIcon = new HintIcon();
			hintIcon.targetType = targetType;
			hintIcon.iconType = Canvas_Sub1.inputStream.getUByte();
			if (hintIcon.iconType >= 0 && hintIcon.iconType < AnimatedLocation.aClass120_Sub14_Sub19Array3073.length) {
				if (hintIcon.targetType == 1 || hintIcon.targetType == 10) {
					hintIcon.targetIndex = Canvas_Sub1.inputStream.getUShort();
					Canvas_Sub1.inputStream.pos += 5;
				} else if (hintIcon.targetType >= 2 && hintIcon.targetType <= 6) {
					if (hintIcon.targetType == 2) {
						hintIcon.anInt812 = 64;
						hintIcon.anInt815 = 64;
					}
					if (hintIcon.targetType == 3) {
						hintIcon.anInt815 = 64;
						hintIcon.anInt812 = 0;
					}
					if (hintIcon.targetType == 4) {
						hintIcon.anInt812 = 128;
						hintIcon.anInt815 = 64;
					}
					if (hintIcon.targetType == 5) {
						hintIcon.anInt812 = 64;
						hintIcon.anInt815 = 0;
					}
					if (hintIcon.targetType == 6) {
						hintIcon.anInt815 = 128;
						hintIcon.anInt812 = 64;
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
			Class23.packetType = -1;
			return true;
		}
		if (Class23.packetType == 136) {// TODO npc update
			Class186.method2471();
			Class23.packetType = -1;
			return true;
		}
		if (Class23.packetType == 155) {
			Class120_Sub29.receiveRegionData(true);
			Class23.packetType = -1;
			return true;
		}
		if (Class23.packetType == 75) {
			final int i_196_ = Canvas_Sub1.inputStream.getULEShortA();
			final String string = Canvas_Sub1.inputStream.getJagexString();
			final int i_197_ = Canvas_Sub1.inputStream.getULEShortA();
			if (Class69_Sub3_Sub1.updatePacketCounter(i_196_)) {
				Class120_Sub12_Sub28.method1345(string, i_197_, (byte) 108);
			}
			Class23.packetType = -1;
			return true;
		}
		if (Class23.packetType == 137) {
			final int i_198_ = Canvas_Sub1.inputStream.getULEShort();
			final int i_199_ = Canvas_Sub1.inputStream.getUByte();
			Class142.method2004(i_199_, i_198_);
			Class23.packetType = -1;
			return true;
		}
		if (Class23.packetType == 72) {
			Class120_Sub22.systemUpdateCycle = Canvas_Sub1.inputStream.getULEShort() * 30;
			Class120_Sub2.anInt2419 = GrandExchangeObject.anInt1494;
			Class23.packetType = -1;
			return true;
		}
		if (Class23.packetType == 26) {
			final int i_200_ = Canvas_Sub1.inputStream.getInt1();
			final JagexInterface jagexInterface = Class74.getJagexInterface(i_200_);
			for (int i_201_ = 0; jagexInterface.objIds.length > i_201_; i_201_++) {
				jagexInterface.objIds[i_201_] = -1;
				jagexInterface.objIds[i_201_] = 0;
			}
			InterfaceClickMask.redrawInterface(jagexInterface);
			Class23.packetType = -1;
			return true;
		}
		if (Class23.packetType == 99) {
			final long l = Canvas_Sub1.inputStream.getLong();
			Canvas_Sub1.inputStream.getByte();
			final long l_202_ = Canvas_Sub1.inputStream.getLong();
			final long l_203_ = Canvas_Sub1.inputStream.getUShort();
			final long l_204_ = Canvas_Sub1.inputStream.getMedium();
			final long l_205_ = (l_203_ << 32) + l_204_;
			final int i_206_ = Canvas_Sub1.inputStream.getUByte();
			final int i_207_ = Canvas_Sub1.inputStream.getUShort();
			boolean bool_208_ = false;
			while_216_: do {
				for (int i_209_ = 0; i_209_ < 100; i_209_++) {
					if ((Class120_Sub12_Sub15.aLongArray3245[i_209_] ^ 0xffffffffffffffffL) == (l_205_ ^ 0xffffffffffffffffL)) {
						bool_208_ = true;
						break while_216_;
					}
				}
				if (i_206_ <= 1) {
					for (int i_210_ = 0; i_210_ < Class120_Sub12_Sub26.ignoreCount; i_210_++) {
						if ((l ^ 0xffffffffffffffffL) == (HintIcon.ignoreNamesAsLong[i_210_] ^ 0xffffffffffffffffL)) {
							bool_208_ = true;
							break;
						}
					}
				}
			} while (false);
			if (!bool_208_ && Class69_Sub3.isInTutIsland == 0) {
				Class120_Sub12_Sub15.aLongArray3245[Class24.anInt147] = l_205_;
				Class24.anInt147 = (Class24.anInt147 - -1) % 100;
				final String string = Class120_Sub14_Sub10.list(i_207_).method1506(Canvas_Sub1.inputStream);
				if (i_206_ == 2 || i_206_ == 3) {
					Class120_Sub16.method1660(new StringBuilder("<img=1>").append(Class136.longToString(l)).toString(), i_207_, Class136.longToString(l_202_), 20, string);
				} else if (i_206_ != 1) {
					Class120_Sub16.method1660(Class136.longToString(l), i_207_, Class136.longToString(l_202_), 20, string);
				} else {
					Class120_Sub16.method1660(new StringBuilder("<img=0>").append(Class136.longToString(l)).toString(), i_207_, Class136.longToString(l_202_), 20, string);
				}
			}
			Class23.packetType = -1;
			return true;
		}
		if (Class23.packetType == 237) {
			int i_211_ = Canvas_Sub1.inputStream.getULEShort();
			final int i_212_ = Canvas_Sub1.inputStream.getUShortA();
			final int i_213_ = Canvas_Sub1.inputStream.getULEShort();
			final int i_214_ = Canvas_Sub1.inputStream.getInt1();
			if (i_214_ >> 30 != 0) {
				final int i_215_ = i_214_ >> 28 & 0x3;
				int i_216_ = (i_214_ >> 14 & 0x3fff) - GameEntity.currentBaseX;
				int i_217_ = (0x3fff & i_214_) - Class181.currentBaseZ;
				if (i_216_ >= 0 && i_217_ >= 0 && i_216_ < 104 && i_217_ < 104) {
					i_217_ = 64 + i_217_ * 128;
					i_216_ = 64 + 128 * i_216_;
					final SpotAnimation class180_sub3 = new SpotAnimation(i_211_, i_215_, i_216_, i_217_, -i_213_ + Class22.getTileHeight(i_215_, i_216_, i_217_), i_212_, Class101_Sub2.loopCycle);
					Class120_Sub12_Sub7.aClass105_3177.addLast(new Class120_Sub14_Sub4(class180_sub3));
				}
			} else if (i_214_ >> 29 == 0) {
				if (i_214_ >> 28 != 0) {
					final int i_218_ = 0xffff & i_214_;
					Player class180_sub5_sub1;
					if (Class167.anInt1616 == i_218_) {
						class180_sub5_sub1 = TileParticleQueue.selfPlayer;
					} else {
						class180_sub5_sub1 = Class118.playersList[i_218_];
					}
					if (class180_sub5_sub1 != null) {
						if (i_211_ == 65535) {
							i_211_ = -1;
						}
						boolean bool_219_ = true;
						if ((i_211_ ^ 0xffffffff) != 0 && class180_sub5_sub1.spotAnimId != -1) {
							if (i_211_ != class180_sub5_sub1.spotAnimId) {
								final SpotAnimType spotAnimType = SpotAnimType.list(i_211_);
								final SpotAnimType class103_220_ = SpotAnimType.list(class180_sub5_sub1.spotAnimId);
								if ((spotAnimType.animationId ^ 0xffffffff) != 0 && (class103_220_.animationId ^ 0xffffffff) != 0) {
									final SeqType seqType = SeqType.list(spotAnimType.animationId);
									final SeqType class40_221_ = SeqType.list(class103_220_.animationId);
									if (seqType.priority < class40_221_.priority) {
										bool_219_ = false;
									}
								}
							} else {
								final SpotAnimType spotAnimType = SpotAnimType.list(i_211_);
								if (spotAnimType.aBoolean998 && (spotAnimType.animationId ^ 0xffffffff) != 0) {
									final SeqType seqType = SeqType.list(spotAnimType.animationId);
									final int i_222_ = seqType.resetInPlay;
									if (i_222_ == 1) {
										class180_sub5_sub1.spotAnimFrame = 0;
										class180_sub5_sub1.anInt2963 = 0;
										class180_sub5_sub1.spotAnimNextFrame = 1;
										bool_219_ = false;
										class180_sub5_sub1.anInt2979 = i_212_ + Class101_Sub2.loopCycle;
										class180_sub5_sub1.anInt2984 = 0;
										Class120_Sub12_Sub23.method1323(seqType, class180_sub5_sub1.x, class180_sub5_sub1.z, class180_sub5_sub1.spotAnimFrame, false);
									} else if (i_222_ == 2) {
										class180_sub5_sub1.anInt2999 = 0;
										bool_219_ = false;
									}
								}
							}
						}
						if (bool_219_) {
							class180_sub5_sub1.anInt2963 = 0;
							class180_sub5_sub1.spotAnimNextFrame = 1;
							class180_sub5_sub1.anInt2979 = Class101_Sub2.loopCycle + i_212_;
							class180_sub5_sub1.anInt2965 = i_213_;
							class180_sub5_sub1.spotAnimFrame = 0;
							class180_sub5_sub1.spotAnimId = i_211_;
							if (class180_sub5_sub1.anInt2979 > Class101_Sub2.loopCycle) {
								class180_sub5_sub1.spotAnimFrame = -1;
							}
							if (-65536 == (class180_sub5_sub1.spotAnimId ^ 0xffffffff)) {
								class180_sub5_sub1.spotAnimId = -1;
							}
							if ((class180_sub5_sub1.spotAnimId ^ 0xffffffff) != 0 && class180_sub5_sub1.anInt2979 == Class101_Sub2.loopCycle) {
								final int i_223_ = SpotAnimType.list(class180_sub5_sub1.spotAnimId).animationId;
								if ((i_223_ ^ 0xffffffff) != 0) {
									final SeqType seqType = SeqType.list(i_223_);
									if (seqType != null && seqType.frames != null) {
										Class120_Sub12_Sub23.method1323(seqType, class180_sub5_sub1.x, class180_sub5_sub1.z, 0, class180_sub5_sub1 == TileParticleQueue.selfPlayer);
									}
								}
							}
						}
					}
				}
			} else {
				final int i_224_ = i_214_ & 0xffff;
				final Npc class180_sub5_sub2 = Class120_Sub12_Sub11.npcList[i_224_];
				if (class180_sub5_sub2 != null) {
					if ((i_211_ ^ 0xffffffff) == -65536) {
						i_211_ = -1;
					}
					boolean bool_225_ = true;
					if ((i_211_ ^ 0xffffffff) != 0 && (class180_sub5_sub2.spotAnimId ^ 0xffffffff) != 0) {
						if (i_211_ == class180_sub5_sub2.spotAnimId) {
							final SpotAnimType spotAnimType = SpotAnimType.list(i_211_);
							if (spotAnimType.aBoolean998 && spotAnimType.animationId != -1) {
								final SeqType seqType = SeqType.list(spotAnimType.animationId);
								final int i_226_ = seqType.resetInPlay;
								if (i_226_ == 1) {
									bool_225_ = false;
									class180_sub5_sub2.anInt2979 = Class101_Sub2.loopCycle + i_212_;
									class180_sub5_sub2.spotAnimFrame = 0;
									class180_sub5_sub2.spotAnimNextFrame = 1;
									class180_sub5_sub2.anInt2963 = 0;
									class180_sub5_sub2.anInt2984 = 0;
									Class120_Sub12_Sub23.method1323(seqType, class180_sub5_sub2.x, class180_sub5_sub2.z, class180_sub5_sub2.spotAnimFrame, false);
								} else if (i_226_ == 2) {
									class180_sub5_sub2.anInt2999 = 0;
									bool_225_ = false;
								}
							}
						} else {
							final SpotAnimType spotAnimType = SpotAnimType.list(i_211_);
							final SpotAnimType class103_227_ = SpotAnimType.list(class180_sub5_sub2.spotAnimId);
							if (spotAnimType.animationId != -1 && class103_227_.animationId != -1) {
								final SeqType seqType = SeqType.list(spotAnimType.animationId);
								final SeqType class40_228_ = SeqType.list(class103_227_.animationId);
								if (seqType.priority < class40_228_.priority) {
									bool_225_ = false;
								}
							}
						}
					}
					if (bool_225_) {
						class180_sub5_sub2.spotAnimId = i_211_;
						class180_sub5_sub2.spotAnimFrame = 0;
						class180_sub5_sub2.spotAnimNextFrame = 1;
						class180_sub5_sub2.anInt2965 = i_213_;
						class180_sub5_sub2.anInt2963 = 0;
						class180_sub5_sub2.anInt2979 = i_212_ + Class101_Sub2.loopCycle;
						if (class180_sub5_sub2.anInt2979 > Class101_Sub2.loopCycle) {
							class180_sub5_sub2.spotAnimFrame = -1;
						}
						if (class180_sub5_sub2.spotAnimId != -1 && Class101_Sub2.loopCycle == class180_sub5_sub2.anInt2979) {
							final int i_229_ = SpotAnimType.list(class180_sub5_sub2.spotAnimId).animationId;
							if (i_229_ != -1) {
								final SeqType seqType = SeqType.list(i_229_);
								if (seqType != null && seqType.frames != null) {
									Class120_Sub12_Sub23.method1323(seqType, class180_sub5_sub2.x, class180_sub5_sub2.z, 0, false);
								}
							}
						}
					}
				}
			}
			Class23.packetType = -1;
			return true;
		}
		if (Class23.packetType == 151) {
			final int i_230_ = Canvas_Sub1.inputStream.getUShort();
			final int i_231_ = Canvas_Sub1.inputStream.getUByte();
			final int i_232_ = Canvas_Sub1.inputStream.getUByte();
			final int i_233_ = Canvas_Sub1.inputStream.getUShort();
			final int i_234_ = Canvas_Sub1.inputStream.getUByte();
			final int i_235_ = Canvas_Sub1.inputStream.getUByte();
			if (Class69_Sub3_Sub1.updatePacketCounter(i_230_)) {
				Class120_Sub14_Sub23.method1639(i_234_, i_231_, i_235_, i_233_, true, 0, i_232_);
			}
			Class23.packetType = -1;
			return true;
		}
		if (Class23.packetType == 116) {
			final int i_236_ = Canvas_Sub1.inputStream.getUShortA();
			final int i_237_ = Canvas_Sub1.inputStream.getUShortA();
			final String string = Canvas_Sub1.inputStream.getJagexString();
			if (Class69_Sub3_Sub1.updatePacketCounter(i_237_)) {
				Class120_Sub12_Sub28.method1345(string, i_236_, (byte) 108);
			}
			Class23.packetType = -1;
			return true;
		}
		if (Class23.packetType == 222) {
			final long l = Canvas_Sub1.inputStream.getLong();
			final long l_238_ = Canvas_Sub1.inputStream.getUShort();
			final long l_239_ = Canvas_Sub1.inputStream.getMedium();
			final int i_240_ = Canvas_Sub1.inputStream.getUByte();
			final int i_241_ = Canvas_Sub1.inputStream.getUShort();
			boolean bool_242_ = false;
			final long l_243_ = (l_238_ << 32) + l_239_;
			while_217_: do {
				for (int i_244_ = 0; i_244_ < 100; i_244_++) {
					if ((l_243_ ^ 0xffffffffffffffffL) == (Class120_Sub12_Sub15.aLongArray3245[i_244_] ^ 0xffffffffffffffffL)) {
						bool_242_ = true;
						break while_217_;
					}
				}
				if (i_240_ <= 1) {
					for (int i_245_ = 0; i_245_ < Class120_Sub12_Sub26.ignoreCount; i_245_++) {
						if ((HintIcon.ignoreNamesAsLong[i_245_] ^ 0xffffffffffffffffL) == (l ^ 0xffffffffffffffffL)) {
							bool_242_ = true;
							break;
						}
					}
				}
			} while (false);
			if (!bool_242_ && Class69_Sub3.isInTutIsland == 0) {
				Class120_Sub12_Sub15.aLongArray3245[Class24.anInt147] = l_243_;
				Class24.anInt147 = (Class24.anInt147 + 1) % 100;
				final String string = Class120_Sub14_Sub10.list(i_241_).method1506(Canvas_Sub1.inputStream);
				if (i_240_ == 2) {
					Class120_Sub16.method1660(new StringBuilder("<img=1>").append(Class136.longToString(l)).toString(), i_241_, null, 18, string);
				} else if (i_240_ == 1) {
					Class120_Sub16.method1660(new StringBuilder("<img=0>").append(Class136.longToString(l)).toString(), i_241_, null, 18, string);
				} else {
					Class120_Sub16.method1660(Class136.longToString(l), i_241_, null, 18, string);
				}
			}
			Class23.packetType = -1;
			return true;
		}
		if (Class23.packetType == 46) {
			final int i_246_ = Canvas_Sub1.inputStream.getUShort();
			final int i_247_ = Canvas_Sub1.inputStream.getUByte();
			final int i_248_ = Canvas_Sub1.inputStream.getUByte();
			final int i_249_ = Canvas_Sub1.inputStream.getUByte();
			final int i_250_ = Canvas_Sub1.inputStream.getUByte();
			final int i_251_ = Canvas_Sub1.inputStream.getUShort();
			if (Class69_Sub3_Sub1.updatePacketCounter(i_246_)) {
				Class120_Sub12_Sub12.aBooleanArray3223[i_247_] = true;
				Class120_Sub12_Sub37.anIntArray3425[i_247_] = i_248_;
				Class181.anIntArray1790[i_247_] = i_249_;
				LabelGroup.anIntArray2409[i_247_] = i_250_;
				LabelGroup.anIntArray2412[i_247_] = i_251_;
			}
			Class23.packetType = -1;
			return true;
		}
		if (Class23.packetType == 153) {
			int i_252_ = Canvas_Sub1.inputStream.getUShort();
			if (65535 == i_252_) {
				i_252_ = -1;
			}
			final int i_253_ = Canvas_Sub1.inputStream.getUByte();
			final int i_254_ = Canvas_Sub1.inputStream.getUShort();
			final int i_255_ = Canvas_Sub1.inputStream.getUByte();
			Class48.method404(i_254_, i_252_, i_253_, i_255_);
			Class23.packetType = -1;
			return true;
		}
		if (Class23.packetType == 135) {
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
			Class23.packetType = -1;
			return true;
		}
		if (Class23.packetType == 40) {
			final int i_258_ = Canvas_Sub1.inputStream.getLEInt();
			final int i_259_ = Canvas_Sub1.inputStream.getULEShort();
			final int i_260_ = Canvas_Sub1.inputStream.getUByte();
			if (Class69_Sub3_Sub1.updatePacketCounter(i_259_)) {
				Class164.method2132(i_258_, i_260_, true);
			}
			Class23.packetType = -1;
			return true;
		}
		if (Class23.packetType == 23) {
			Class69_Sub3_Sub1.anInt3084 = Canvas_Sub1.inputStream.getUByte();
			Class120_Sub12_Sub31.anInt3382 = Canvas_Sub1.inputStream.getUByte();
			KeyboardHandler.anInt1507 = Canvas_Sub1.inputStream.getUByte();
			Class23.packetType = -1;
			return true;
		}
		if (Class23.packetType == 168) {
			final int i_261_ = Canvas_Sub1.inputStream.getUShort();
			ObjectContainer.remove(i_261_);
			Class120_Sub12_Sub21_Sub1.anIntArray3912[Class120_Sub12_Sub3.method1207(31, Class33.anInt278++)] = Class120_Sub12_Sub3.method1207(32767, i_261_);
			Class23.packetType = -1;
			return true;
		}
		if (Class23.packetType == 52) {
			final int i_262_ = Canvas_Sub1.inputStream.getUShort();
			if (Class69_Sub3_Sub1.updatePacketCounter(i_262_)) {
				SpotAnimType.method876((byte) 107);
			}
			Class23.packetType = -1;
			return true;
		}
		if (Class23.packetType == 38) {
			final byte i_263_ = Canvas_Sub1.inputStream.getByte();
			final int i_264_ = Canvas_Sub1.inputStream.getULEShort();
			FileSystemRequest.method1544(i_264_, i_263_);
			Class23.packetType = -1;
			return true;
		}
		if (Class23.packetType == 194) {
			final int i_265_ = Canvas_Sub1.inputStream.getInt();
			int i_266_ = Canvas_Sub1.inputStream.getUShort();
			if (69999 < (i_265_ ^ 0xffffffff)) {
				i_266_ += 32768;
			}
			JagexInterface jagexInterface;
			if (i_265_ < 0) {
				jagexInterface = null;
			} else {
				jagexInterface = Class74.getJagexInterface(i_265_);
			}
			if (jagexInterface != null) {
				for (int i_267_ = 0; jagexInterface.objIds.length > i_267_; i_267_++) {
					jagexInterface.objIds[i_267_] = 0;
					jagexInterface.objAmounts[i_267_] = 0;
				}
			}
			Class179.method2263(i_266_);
			final int i_268_ = Canvas_Sub1.inputStream.getUShort();
			for (int i_269_ = 0; i_269_ < i_268_; i_269_++) {
				final int i_270_ = Canvas_Sub1.inputStream.getUShort();
				int i_271_ = Canvas_Sub1.inputStream.getUByteC();
				if (i_271_ == 255) {
					i_271_ = Canvas_Sub1.inputStream.getInt();
				}
				if (jagexInterface != null && i_269_ < jagexInterface.objIds.length) {
					jagexInterface.objIds[i_269_] = i_270_;
					jagexInterface.objAmounts[i_269_] = i_271_;
				}
				ObjectContainer.addObject(i_266_, i_269_, i_270_ - 1, i_271_);
			}
			if (jagexInterface != null) {
				InterfaceClickMask.redrawInterface(jagexInterface);
			}
			Class90.redrawOldFormatOverridedInterfaces();
			Class120_Sub12_Sub21_Sub1.anIntArray3912[Class120_Sub12_Sub3.method1207(31, Class33.anInt278++)] = Class120_Sub12_Sub3.method1207(i_266_, 32767);
			Class23.packetType = -1;
			return true;
		}
		if (Class23.packetType == 150) {
			final int i_272_ = Canvas_Sub1.inputStream.getUShort();
			final int i_273_ = Canvas_Sub1.inputStream.getUShortA();
			final int i_274_ = Canvas_Sub1.inputStream.getUByteC();
			final Npc class180_sub5_sub2 = Class120_Sub12_Sub11.npcList[i_273_];
			if (class180_sub5_sub2 != null) {
				Class23.method204(class180_sub5_sub2, i_272_, i_274_);
			}
			Class23.packetType = -1;
			return true;
		}
		if (Class23.packetType == 93) {
			final int i_275_ = Canvas_Sub1.inputStream.getUShort();
			final int i_276_ = Canvas_Sub1.inputStream.getUByte();
			final int i_277_ = Canvas_Sub1.inputStream.getUByte();
			final int i_278_ = Canvas_Sub1.inputStream.getUShort();
			final int i_279_ = Canvas_Sub1.inputStream.getUByte();
			final int i_280_ = Canvas_Sub1.inputStream.getUByte();
			if (Class69_Sub3_Sub1.updatePacketCounter(i_275_)) {
				Class120_Sub12_Sub16.method1278(26379, i_278_, i_279_, i_276_, i_277_, i_280_);
			}
			Class23.packetType = -1;
			return true;
		}
		if (Class23.packetType == 166) {
			Canvas_Sub1.inputStream.pos += 28;
			if (Canvas_Sub1.inputStream.compareCrc()) {
				Class120_Sub3.method1057(Canvas_Sub1.inputStream, Canvas_Sub1.inputStream.pos - 28);
			}
			Class23.packetType = -1;
			return true;
		}
		if (Class23.packetType == 42) {
			final int i_281_ = Canvas_Sub1.inputStream.getULEShortA();
			final int i_282_ = Canvas_Sub1.inputStream.getUShortA();
			final int i_283_ = Canvas_Sub1.inputStream.getULEShortA();
			if (Class69_Sub3_Sub1.updatePacketCounter(i_281_)) {
				AmbientSound.method1158(i_283_, i_282_);
			}
			Class23.packetType = -1;
			return true;
		}
		if (Class23.packetType == 18) {
			int i_284_ = Canvas_Sub1.inputStream.getULEShort();
			if (65535 == i_284_) {
				i_284_ = -1;
			}
			final int i_285_ = Canvas_Sub1.inputStream.getUShort();
			final int i_286_ = Canvas_Sub1.inputStream.getInt();
			if (Class69_Sub3_Sub1.updatePacketCounter(i_285_)) {
				Class120_Sub21.method1695(2, -1, i_286_, i_284_);
			}
			Class23.packetType = -1;
			return true;
		}
		if (Class23.packetType == 43) {
			Class120_Sub12_Sub26.ignoreCount = AbstractMouseWheelHandler.packetSize / 8;
			for (int id = 0; id < Class120_Sub12_Sub26.ignoreCount; id++) {
				HintIcon.ignoreNamesAsLong[id] = Canvas_Sub1.inputStream.getLong();
				GZIPDecompressor.ignoreNames[id] = Class174.longToString(HintIcon.ignoreNamesAsLong[id]);
				Class120_Sub14_Sub4.aBooleanArray3468[id] = false;
			}
			Class23.packetType = -1;
			Class61.anInt563 = GrandExchangeObject.anInt1494;
			return true;
		}
		if (Class23.packetType == 221) {
			final long l = Canvas_Sub1.inputStream.getLong();
			final int i_288_ = Canvas_Sub1.inputStream.getUShort();
			final String string = Class120_Sub14_Sub10.list(i_288_).method1506(Canvas_Sub1.inputStream);
			Class120_Sub16.method1660(Class136.longToString(l), i_288_, null, 19, string);
			Class23.packetType = -1;
			return true;
		}
		if (Class23.packetType == 199) {
			final int i_289_ = Canvas_Sub1.inputStream.getInt1();
			final int i_290_ = Canvas_Sub1.inputStream.getUShort();
			if (Class69_Sub3_Sub1.updatePacketCounter(i_290_)) {
				int i_291_ = 0;
				if (TileParticleQueue.selfPlayer.appearance != null) {
					i_291_ = TileParticleQueue.selfPlayer.appearance.method2043();
				}
				Class120_Sub21.method1695(3, -1, i_289_, i_291_);
			}
			Class23.packetType = -1;
			return true;
		}
		if (Class23.packetType == 243) {
			final int i_292_ = Canvas_Sub1.inputStream.getUShort();
			final int i_293_ = Canvas_Sub1.inputStream.getInt1();
			final int i_294_ = Canvas_Sub1.inputStream.getULEShortA();
			if (Class69_Sub3_Sub1.updatePacketCounter(i_294_)) {
				Class29.method250(i_293_, i_292_);
			}
			Class23.packetType = -1;
			return true;
		}
		if (Class23.packetType == 19) {
			final int index = Canvas_Sub1.inputStream.getUByte();
			if (Canvas_Sub1.inputStream.getUByte() != 0) {
				final PacketBuffer packetBuffer = Canvas_Sub1.inputStream;
				packetBuffer.pos = ((Buffer) packetBuffer).pos - 1;
				Class120_Sub3.grandExchangeObjects[index] = new GrandExchangeObject(Canvas_Sub1.inputStream);
			} else {
				Class120_Sub3.grandExchangeObjects[index] = new GrandExchangeObject();
			}
			Class23.packetType = -1;
			Class120_Sub29.anInt2768 = GrandExchangeObject.anInt1494;
			return true;
		}
		SpotAnimation.method2312(null, new StringBuilder("T1 - ").append(Class23.packetType).append(",").append(MapFunctionType.anInt639).append(",").append(SeqType.anInt333).append(" - ").append(AbstractMouseWheelHandler.packetSize).toString());
		DummyInputStream.processLogout();
		return true;
	}

	abstract void method738(int i);

	public AbstractTimer() {
		/* empty */
	}

	abstract long method739(int i);
}
