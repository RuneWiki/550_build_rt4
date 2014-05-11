/* Class87 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;

abstract class AbstractTimer {
	static Deque aClass105_824 = new Deque();
	static Class46 aClass46_825;

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
		Class180.aClass188Array1782[Class49.anInt438++] = class188;
	}

	static final int method735(final int i, final int i_8_, final int i_9_) {
		int i_10_;
		try {
			final Class120_Sub17 class120_sub17 = (Class120_Sub17) Canvas_Sub1.aClass75_15.method659(i_9_, 16);
			if (class120_sub17 == null) {
				return 0;
			}
			if (i_8_ < i || class120_sub17.anIntArray2619.length <= i_8_) {
				return 0;
			}
			i_10_ = class120_sub17.anIntArray2619[i_8_];
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("jf.A(").append(i).append(',').append(i_8_).append(',').append(i_9_).append(')').toString());
		}
		return i_10_;
	}

	public static void method736(final int i) {
		try {
			aClass46_825 = null;
			aClass105_824 = null;
			if (i >= -22) {
				method736(-120);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("jf.B(").append(i).append(')').toString());
		}
	}

	static final boolean method737(final int i) throws IOException {
		boolean bool;
		try {
			if (aClass46_825 == null) {
				return false;
			}
			int i_11_ = aClass46_825.method375((byte) -47);
			if (i_11_ == 0) {
				return false;
			}
			if (Class23.anInt138 == -1) {
				aClass46_825.method373(0, Canvas_Sub1.aClass120_Sub7_Sub1_16.buf, 1, (byte) 60);
				Canvas_Sub1.aClass120_Sub7_Sub1_16.pos = 0;
				i_11_--;
				Class23.anInt138 = Canvas_Sub1.aClass120_Sub7_Sub1_16.method1148(false);
				AbstractMouseWheelHandler.anInt118 = Class93.anIntArray866[Class23.anInt138];
			}
			if (AbstractMouseWheelHandler.anInt118 == -1) {
				if (i_11_ <= 0) {
					return false;
				}
				i_11_--;
				aClass46_825.method373(0, Canvas_Sub1.aClass120_Sub7_Sub1_16.buf, 1, (byte) 114);
				AbstractMouseWheelHandler.anInt118 = 0xff & Canvas_Sub1.aClass120_Sub7_Sub1_16.buf[0];
			}
			if (AbstractMouseWheelHandler.anInt118 == -2) {
				if (i_11_ > 1) {
					i_11_ -= 2;
					aClass46_825.method373(0, Canvas_Sub1.aClass120_Sub7_Sub1_16.buf, 2, (byte) 66);
					Canvas_Sub1.aClass120_Sub7_Sub1_16.pos = 0;
					AbstractMouseWheelHandler.anInt118 = Canvas_Sub1.aClass120_Sub7_Sub1_16.getUShort();
				} else {
					return false;
				}
			}
			if (AbstractMouseWheelHandler.anInt118 > i_11_) {
				return false;
			}
			Canvas_Sub1.aClass120_Sub7_Sub1_16.pos = 0;
			aClass46_825.method373(i, Canvas_Sub1.aClass120_Sub7_Sub1_16.buf, AbstractMouseWheelHandler.anInt118, (byte) 21);
			Class40.anInt333 = Class73.anInt639;
			Class73.anInt639 = Class114.anInt1093;
			Class88.anInt827 = 0;
			Class114.anInt1093 = Class23.anInt138;
			if (Class23.anInt138 == 163) {
				for (int i_12_ = 0; i_12_ < Class2.permanentVariable.length; i_12_++) {
					if (Class2.permanentVariable[i_12_] != Class30.anIntArray239[i_12_]) {
						Class2.permanentVariable[i_12_] = Class30.anIntArray239[i_12_];
						Class120_Sub14_Sub15.method1554((byte) -61, i_12_);
						Class88.anIntArray833[Class120_Sub12_Sub3.method1207(31, Class27.anInt165++)] = i_12_;
					}
				}
				Class23.anInt138 = -1;
				return true;
			}
			if (Class23.anInt138 == 34) {
				final int i_13_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getInt();
				int i_14_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getUShort();
				Class189 class189;
				if (i_13_ >= 0) {
					class189 = Class74.method650(123, i_13_);
				} else {
					class189 = null;
				}
				if ((i_13_ ^ 0xffffffff) > 69999) {
					i_14_ += 32768;
				}
				while (Canvas_Sub1.aClass120_Sub7_Sub1_16.pos < AbstractMouseWheelHandler.anInt118) {
					int i_15_ = 0;
					final int i_16_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.method1081((byte) 98);
					final int i_17_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getUShort();
					if (i_17_ != 0) {
						i_15_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getUByte();
						if (i_15_ == 255) {
							i_15_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getInt();
						}
					}
					if (class189 != null && i_16_ >= 0 && class189.anIntArray1978.length > i_16_) {
						class189.anIntArray1978[i_16_] = i_17_;
						class189.anIntArray1983[i_16_] = i_15_;
					}
					MouseHandler.method1027(i + 14378, i_14_, i_16_, -1 + i_17_, i_15_);
				}
				if (class189 != null) {
					InterfaceClickMask.redrawInterface(class189);
				}
				Class90.method757((byte) -91);
				Class120_Sub12_Sub21_Sub1.anIntArray3912[Class120_Sub12_Sub3.method1207(31, Class33.anInt278++)] = Class120_Sub12_Sub3.method1207(32767, i_14_);
				Class23.anInt138 = -1;
				return true;
			}
			if (Class23.anInt138 == 53) {
				Class28.anInt176 = Canvas_Sub1.aClass120_Sub7_Sub1_16.getUByteS();
				Class32.anInt254 = Canvas_Sub1.aClass120_Sub7_Sub1_16.getUByteA();
				while (AbstractMouseWheelHandler.anInt118 > Canvas_Sub1.aClass120_Sub7_Sub1_16.pos) {
					Class23.anInt138 = Canvas_Sub1.aClass120_Sub7_Sub1_16.getUByte();
					Class191.method2513((byte) 127);
				}
				Class23.anInt138 = -1;
				return true;
			}
			if (Class23.anInt138 == 192) {
				InputStream_Sub1.logout();
				Class23.anInt138 = -1;
				return false;
			}
			if (Class23.anInt138 == 176) {
				final int i_18_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getUShort();
				final int i_19_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getULEShortA();
				final byte i_20_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getByteC();
				if (Class69_Sub3_Sub1.updateInterfaceCounter(i_18_)) {
					Class20.method180(i_19_, i_20_, 60);
				}
				Class23.anInt138 = -1;
				return true;
			}
			if (Class23.anInt138 == 4) {
				Class183.anInt1805 = Canvas_Sub1.aClass120_Sub7_Sub1_16.getUByte();
				Class61.anInt563 = Class160.anInt1494;
				Class23.anInt138 = -1;
				return true;
			}
			if (Class23.anInt138 == 35) {
				final int i_21_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getUByteC();
				final int i_22_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getULEShortA();
				final int i_23_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getLEInt();
				final int i_24_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getULEShort();
				if (Class69_Sub3_Sub1.updateInterfaceCounter(i_22_)) {
					final Class120_Sub26 class120_sub26 = (Class120_Sub26) Class120_Sub12_Sub13.aClass75_3234.method659(i_23_, 116);
					if (class120_sub26 != null) {
						Class120_Sub19.method1675(class120_sub26, i_24_ != class120_sub26.anInt2745);
					}
					RuntimeException_Sub1.method2528(i_24_, i_21_, (byte) 117, i_23_);
				}
				Class23.anInt138 = -1;
				return true;
			}
			if (Class23.anInt138 == 59) {
				final String string = Canvas_Sub1.aClass120_Sub7_Sub1_16.getJString();
				if (!string.endsWith(":tradereq:")) {
					if (!string.endsWith(":chalreq:")) {
						if (string.endsWith(":assistreq:")) {
							final String string_25_ = string.substring(0, string.indexOf(":"));
							final long l = Class70.method636(-127, string_25_);
							boolean bool_26_ = false;
							for (int i_27_ = 0; Class120_Sub12_Sub26.anInt3335 > i_27_; i_27_++) {
								if (l == Class85.aLongArray806[i_27_]) {
									bool_26_ = true;
									break;
								}
							}
							if (!bool_26_ && Class69_Sub3.isInTutIsland == 0) {
								Class120_Sub14_Sub14.method1540(string_25_, 10, "");
							}
						} else if (!string.endsWith(":clan:")) {
							if (!string.endsWith(":trade:")) {
								if (string.endsWith(":assist:")) {
									final String string_28_ = string.substring(0, string.indexOf(":assist:"));
									if (Class69_Sub3.isInTutIsland == 0) {
										Class120_Sub14_Sub14.method1540("", 13, string_28_);
									}
								} else if (!string.endsWith(":duelstake:")) {
									if (!string.endsWith(":duelfriend:")) {
										if (!string.endsWith(":clanreq:")) {
											if (string.endsWith(":allyreq:")) {
												final String string_29_ = string.substring(0, string.indexOf(":"));
												final long l = Class70.method636(i ^ ~0x77, string_29_);
												boolean bool_30_ = false;
												for (int i_31_ = 0; i_31_ < Class120_Sub12_Sub26.anInt3335; i_31_++) {
													if (l == Class85.aLongArray806[i_31_]) {
														bool_30_ = true;
														break;
													}
												}
												if (!bool_30_ && Class69_Sub3.isInTutIsland == 0) {
													final String string_32_ = string.substring(1 + string.indexOf(":"), string.length() - 9);
													Class120_Sub14_Sub14.method1540(string_29_, 21, string_32_);
												}
											} else if (!string.endsWith(":spam:")) {
												Class120_Sub14_Sub14.method1540("", 0, string);
											} else {
												final String string_33_ = string.substring(0, -6 + string.length());
												if (Class69_Sub3.isInTutIsland == 0) {
													Class120_Sub14_Sub14.method1540("", 22, string_33_);
												}
											}
										} else {
											final String string_34_ = string.substring(0, string.indexOf(":"));
											final long l = Class70.method636(-118, string_34_);
											boolean bool_35_ = false;
											for (int i_36_ = 0; Class120_Sub12_Sub26.anInt3335 > i_36_; i_36_++) {
												if ((l ^ 0xffffffffffffffffL) == (Class85.aLongArray806[i_36_] ^ 0xffffffffffffffffL)) {
													bool_35_ = true;
													break;
												}
											}
											if (!bool_35_ && Class69_Sub3.isInTutIsland == 0) {
												Class120_Sub14_Sub14.method1540(string_34_, 16, "");
											}
										}
									} else {
										final String string_37_ = string.substring(0, string.indexOf(":"));
										boolean bool_38_ = false;
										final long l = Class70.method636(-120, string_37_);
										for (int i_39_ = 0; i_39_ < Class120_Sub12_Sub26.anInt3335; i_39_++) {
											if ((l ^ 0xffffffffffffffffL) == (Class85.aLongArray806[i_39_] ^ 0xffffffffffffffffL)) {
												bool_38_ = true;
												break;
											}
										}
										if (!bool_38_ && Class69_Sub3.isInTutIsland == 0) {
											Class120_Sub14_Sub14.method1540(string_37_, 15, "");
										}
									}
								} else {
									final String string_40_ = string.substring(0, string.indexOf(":"));
									final long l = Class70.method636(i + -123, string_40_);
									boolean bool_41_ = false;
									for (int i_42_ = 0; i_42_ < Class120_Sub12_Sub26.anInt3335; i_42_++) {
										if ((Class85.aLongArray806[i_42_] ^ 0xffffffffffffffffL) == (l ^ 0xffffffffffffffffL)) {
											bool_41_ = true;
											break;
										}
									}
									if (!bool_41_ && Class69_Sub3.isInTutIsland == 0) {
										Class120_Sub14_Sub14.method1540(string_40_, 14, "");
									}
								}
							} else {
								final String string_43_ = string.substring(0, string.indexOf(":trade:"));
								if (Class69_Sub3.isInTutIsland == 0) {
									Class120_Sub14_Sub14.method1540("", 12, string_43_);
								}
							}
						} else {
							final String string_44_ = string.substring(0, string.indexOf(":clan:"));
							Class120_Sub14_Sub14.method1540("", 11, string_44_);
						}
					} else {
						final String string_45_ = string.substring(0, string.indexOf(":"));
						boolean bool_46_ = false;
						final long l = Class70.method636(i + -126, string_45_);
						for (int i_47_ = 0; Class120_Sub12_Sub26.anInt3335 > i_47_; i_47_++) {
							if ((Class85.aLongArray806[i_47_] ^ 0xffffffffffffffffL) == (l ^ 0xffffffffffffffffL)) {
								bool_46_ = true;
								break;
							}
						}
						if (!bool_46_ && Class69_Sub3.isInTutIsland == 0) {
							final String string_48_ = string.substring(1 + string.indexOf(":"), -9 + string.length());
							Class120_Sub14_Sub14.method1540(string_45_, 8, string_48_);
						}
					}
				} else {
					final String string_49_ = string.substring(0, string.indexOf(":"));
					boolean bool_50_ = false;
					final long l = Class70.method636(-123, string_49_);
					for (int i_51_ = 0; Class120_Sub12_Sub26.anInt3335 > i_51_; i_51_++) {
						if ((Class85.aLongArray806[i_51_] ^ 0xffffffffffffffffL) == (l ^ 0xffffffffffffffffL)) {
							bool_50_ = true;
							break;
						}
					}
					if (!bool_50_ && Class69_Sub3.isInTutIsland == 0) {
						Class120_Sub14_Sub14.method1540(string_49_, 4, Class61.aString568);
					}
				}
				Class23.anInt138 = -1;
				return true;
			}
			if (Class23.anInt138 == 162) {
				final int i_52_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getInt();
				final int i_53_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getInt();
				int i_54_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getUShort();
				int i_55_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getULEShortA();
				if (i_54_ == 65535) {
					i_54_ = -1;
				}
				if (65535 == i_55_) {
					i_55_ = -1;
				}
				final int i_56_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getULEShortA();
				if (Class69_Sub3_Sub1.updateInterfaceCounter(i_56_)) {
					for (int i_57_ = i_55_; i_54_ >= i_57_; i_57_++) {
						final long l = ((long) i_53_ << 32) + (long) i_57_;
						final InterfaceClickMask class120_sub20 = (InterfaceClickMask) Class120_Sub14_Sub3_Sub1.aClass75_3914.method659(l, 89);
						InterfaceClickMask class120_sub20_58_;
						if (class120_sub20 == null) {
							if ((i_57_ ^ 0xffffffff) == 0) {
								class120_sub20_58_ = new InterfaceClickMask(i_52_, Class74.method650(-104, i_53_).aClass120_Sub20_1933.anInt2661);
							} else {
								class120_sub20_58_ = new InterfaceClickMask(i_52_, -1);
							}
						} else {
							class120_sub20_58_ = new InterfaceClickMask(i_52_, class120_sub20.anInt2661);
							class120_sub20.unlink();
						}
						Class120_Sub14_Sub3_Sub1.aClass75_3914.method655(class120_sub20_58_, i + 94, l);
					}
				}
				Class23.anInt138 = -1;
				return true;
			}
			if (Class23.anInt138 == 1) {
				final int i_59_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getULEShort();
				final String string = Canvas_Sub1.aClass120_Sub7_Sub1_16.getJString();
				final int i_60_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getInt1();
				if (Class69_Sub3_Sub1.updateInterfaceCounter(i_59_)) {
					InterfaceChangeNode.method761(string, i_60_);
				}
				Class23.anInt138 = -1;
				return true;
			}
			if (Class23.anInt138 == 11) {
				final int i_61_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getULEShort();
				final int i_62_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.method1089(775571361);
				final int i_63_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getUShortA();
				if (Class69_Sub3_Sub1.updateInterfaceCounter(i_61_)) {
					Class120_Sub12_Sub11.method1250(i_63_, true, i_62_);
				}
				Class23.anInt138 = -1;
				return true;
			}
			if (Class23.anInt138 == 148) {
				final int i_64_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getUShort();
				final int i_65_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getLEInt();
				final int i_66_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getUShort();
				if (Class69_Sub3_Sub1.updateInterfaceCounter(i_66_)) {
					Class20.method180(i_64_, i_65_, 82);
				}
				Class23.anInt138 = -1;
				return true;
			}
			if (Class23.anInt138 == 95) {
				Class90.method757((byte) 38);
				Class56.anInt498 = Canvas_Sub1.aClass120_Sub7_Sub1_16.method1078(true);
				Class120_Sub2.anInt2419 = Class160.anInt1494;
				Class23.anInt138 = -1;
				return true;
			}
			if (Class23.anInt138 == 164) {
				Class90.method757((byte) 40);
				final int i_67_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getUByte();
				final int i_68_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getInt1();
				final int i_69_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getUByte();
				Class120_Sub12_Sub38.anIntArray3439[i_69_] = i_68_;
				Class180.anIntArray1783[i_69_] = i_67_;
				Class172.anIntArray1720[i_69_] = 1;
				for (int i_70_ = 0; i_70_ < 98; i_70_++) {
					if (i_68_ >= Class55.anIntArray492[i_70_]) {
						Class172.anIntArray1720[i_69_] = i_70_ - -2;
					}
				}
				Class120_Sub12_Sub18.anIntArray3274[Class120_Sub12_Sub3.method1207(31, Class120_Sub21.anInt2670++)] = i_69_;
				Class23.anInt138 = -1;
				return true;
			}
			if (Class23.anInt138 == 8) {
				Class90.method757((byte) 76);
				Class69_Sub2.anInt2240 = Canvas_Sub1.aClass120_Sub7_Sub1_16.getUByte();
				Class120_Sub2.anInt2419 = Class160.anInt1494;
				Class23.anInt138 = -1;
				return true;
			}
			if (Class23.anInt138 == 86) {
				Class143.setSettings(Canvas_Sub1.aClass120_Sub7_Sub1_16.getJString());
				Class23.anInt138 = -1;
				return true;
			}
			if (Class23.anInt138 == 87) {
				final int i_71_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getULEShortA();
				int i_72_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getUShort();
				if (-65536 == (i_72_ ^ 0xffffffff)) {
					i_72_ = -1;
				}
				final int i_73_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getLEInt();
				if (Class69_Sub3_Sub1.updateInterfaceCounter(i_71_)) {
					Class120_Sub21.method1695(1, -1, i_73_, i_72_, (byte) 66);
				}
				Class23.anInt138 = -1;
				return true;
			}
			if (Class23.anInt138 == 49) {
				Class120_Sub29.receiveRegionData(false);
				Class23.anInt138 = -1;
				return true;
			}
			if (Class23.anInt138 == 138) {
				final int i_74_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getULEShortA();
				final int i_75_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.method1089(775571361);
				Class142.method2004(1006, i_75_, i_74_);
				Class23.anInt138 = -1;
				return true;
			}
			if (Class23.anInt138 == 96) {
				if ((Class69.anInt616 ^ 0xffffffff) != 0) {
					InterfaceClickMask.method1689(Class69.anInt616, 0, (byte) 104);
				}
				Class23.anInt138 = -1;
				return true;
			}
			if (Class23.anInt138 == 97) {
				Class28.anInt176 = Canvas_Sub1.aClass120_Sub7_Sub1_16.getUByteS();
				Class32.anInt254 = Canvas_Sub1.aClass120_Sub7_Sub1_16.getUByteA();
				Class23.anInt138 = -1;
				return true;
			}
			if (Class23.anInt138 == 25) {//TODO player update
				DisplayModeInfo.method2213(113);
				Class23.anInt138 = -1;
				return true;
			}
			if (Class23.anInt138 == 126) {
				String string = Canvas_Sub1.aClass120_Sub7_Sub1_16.getJString();
				final int i_76_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getUByteC();
				int i_77_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getULEShort();
				final int i_78_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getUByteS();
				if (i_77_ == 65535) {
					i_77_ = -1;
				}
				if (i_78_ >= 1 && i_78_ <= 8) {
					if (string.equalsIgnoreCase("null")) {
						string = null;
					}
					Buffer.playerOptions[i_78_ - 1] = string;
					Class120_Sub14_Sub14.playerOptionsIcon[i_78_ - 1] = i_77_;
					Class120_Sub10.playerOptionsOnTop[i_78_ - 1] = i_76_ == 0;
				}
				Class23.anInt138 = -1;
				return true;
			}
			if (Class23.anInt138 == 55) {
				AbstractGraphicsBuffer.anInt1175 = Canvas_Sub1.aClass120_Sub7_Sub1_16.getUByte();
				Class23.anInt138 = -1;
				return true;
			}
			if (Class23.anInt138 == 31) {
				final int i_79_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getInt();
				final int i_80_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getUShort();
				final int i_81_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getUShortA();
				int i_82_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getUShort();
				int i_83_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getUShort();
				if ((i_82_ ^ 0xffffffff) == -65536) {
					i_82_ = -1;
				}
				if (i_83_ == 65535) {
					i_83_ = -1;
				}
				if (Class69_Sub3_Sub1.updateInterfaceCounter(i_81_)) {
					for (int i_84_ = i_83_; i_82_ >= i_84_; i_84_++) {
						final long l = ((long) i_79_ << 32) + i_84_;
						final InterfaceClickMask class120_sub20 = (InterfaceClickMask) Class120_Sub14_Sub3_Sub1.aClass75_3914.method659(l, -120);
						InterfaceClickMask class120_sub20_85_;
						if (class120_sub20 == null) {
							if (i_84_ == -1) {
								class120_sub20_85_ = new InterfaceClickMask(Class74.method650(61, i_79_).aClass120_Sub20_1933.anInt2662, i_80_);
							} else {
								class120_sub20_85_ = new InterfaceClickMask(0, i_80_);
							}
						} else {
							class120_sub20_85_ = new InterfaceClickMask(class120_sub20.anInt2662, i_80_);
							class120_sub20.unlink();
						}
						Class120_Sub14_Sub3_Sub1.aClass75_3914.method655(class120_sub20_85_, 91, l);
					}
				}
				Class23.anInt138 = -1;
				return true;
			}
			if (Class23.anInt138 == 174) {
				long l = Canvas_Sub1.aClass120_Sub7_Sub1_16.method1124((byte) 114);
				final int i_86_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getUShort();
				boolean bool_87_ = false;
				if (-1L != (~0x7fffffffffffffffL & l ^ 0xffffffffffffffffL)) {
					bool_87_ = true;
				}
				final byte i_88_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getByte();
				if (!bool_87_) {
					final String string = Canvas_Sub1.aClass120_Sub7_Sub1_16.getJString();
					final Class120_Sub13 class120_sub13 = new Class120_Sub13();
					class120_sub13.uid = l;
					class120_sub13.aString2580 = Class174.method2234(i + 0, class120_sub13.uid);
					class120_sub13.aByte2575 = i_88_;
					class120_sub13.anInt2571 = i_86_;
					class120_sub13.aString2579 = string;
					int i_89_;
					for (i_89_ = Class120_Sub14_Sub13.anInt3572 + -1; i_89_ >= 0; i_89_--) {
						final int i_90_ = Class120_Sub28.aClass120_Sub13Array2754[i_89_].aString2580.compareTo(class120_sub13.aString2580);
						if (i_90_ == 0) {
							Class120_Sub28.aClass120_Sub13Array2754[i_89_].anInt2571 = i_86_;
							Class120_Sub28.aClass120_Sub13Array2754[i_89_].aByte2575 = i_88_;
							Class120_Sub28.aClass120_Sub13Array2754[i_89_].aString2579 = string;
							Class120_Sub12_Sub12.anInt3217 = Class160.anInt1494;
							if ((Class20.aLong2168 ^ 0xffffffffffffffffL) == (l ^ 0xffffffffffffffffL)) {
								MouseHandler.aByte1141 = i_88_;
							}
							Class23.anInt138 = -1;
							return true;
						}
						if (i_90_ < 0) {
							break;
						}
					}
					if (Class120_Sub14_Sub13.anInt3572 >= Class120_Sub28.aClass120_Sub13Array2754.length) {
						Class23.anInt138 = -1;
						return true;
					}
					for (int i_91_ = -1 + Class120_Sub14_Sub13.anInt3572; i_89_ < i_91_; i_91_--) {
						Class120_Sub28.aClass120_Sub13Array2754[i_91_ - -1] = Class120_Sub28.aClass120_Sub13Array2754[i_91_];
					}
					if (Class120_Sub14_Sub13.anInt3572 == 0) {
						Class120_Sub28.aClass120_Sub13Array2754 = new Class120_Sub13[100];
					}
					Class120_Sub28.aClass120_Sub13Array2754[i_89_ - -1] = class120_sub13;
					if (l == Class20.aLong2168) {
						MouseHandler.aByte1141 = i_88_;
					}
					Class120_Sub14_Sub13.anInt3572++;
				} else {
					if (Class120_Sub14_Sub13.anInt3572 == 0) {
						Class23.anInt138 = -1;
						return true;
					}
					l &= 0x7fffffffffffffffL;
					int i_92_;
					for (i_92_ = 0; Class120_Sub14_Sub13.anInt3572 > i_92_ && ((Class120_Sub28.aClass120_Sub13Array2754[i_92_].uid ^ 0xffffffffffffffffL) != (l ^ 0xffffffffffffffffL) || i_86_ != Class120_Sub28.aClass120_Sub13Array2754[i_92_].anInt2571); i_92_++) {
						/* empty */
					}
					if (i_92_ < Class120_Sub14_Sub13.anInt3572) {
						for (/**/; i_92_ < Class120_Sub14_Sub13.anInt3572 + -1; i_92_++) {
							Class120_Sub28.aClass120_Sub13Array2754[i_92_] = Class120_Sub28.aClass120_Sub13Array2754[i_92_ + 1];
						}
						Class120_Sub14_Sub13.anInt3572--;
						Class120_Sub28.aClass120_Sub13Array2754[Class120_Sub14_Sub13.anInt3572] = null;
					}
				}
				Class120_Sub12_Sub12.anInt3217 = Class160.anInt1494;
				Class23.anInt138 = -1;
				return true;
			}
			if (Class23.anInt138 == 104) {
				final long l = Canvas_Sub1.aClass120_Sub7_Sub1_16.method1124((byte) 114);
				final String string = Class120_Sub14_Sub8.method1472(Class120_Sub22.method1705(false, Class7.method107(32767, Canvas_Sub1.aClass120_Sub7_Sub1_16)));
				Class120_Sub14_Sub14.method1540(Class136.method1977(false, l), 6, string);
				Class23.anInt138 = -1;
				return true;
			}
			if (Class23.anInt138 == 253) {
				final int i_93_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getUShort();
				final String string = Canvas_Sub1.aClass120_Sub7_Sub1_16.getJString();
				final Object[] objects = new Object[string.length() + 1];
				for (int i_94_ = string.length() + -1; i_94_ >= 0; i_94_--) {
					if (string.charAt(i_94_) == 's') {
						objects[i_94_ + 1] = Canvas_Sub1.aClass120_Sub7_Sub1_16.getJString();
					} else {
						objects[i_94_ + 1] = new Integer(Canvas_Sub1.aClass120_Sub7_Sub1_16.getInt());
					}
				}
				objects[0] = new Integer(Canvas_Sub1.aClass120_Sub7_Sub1_16.getInt());
				if (Class69_Sub3_Sub1.updateInterfaceCounter(i_93_)) {
					final Class120_Sub10 class120_sub10 = new Class120_Sub10();
					class120_sub10.anObjectArray2537 = objects;
					Class88.method744(true, class120_sub10);
				}
				Class23.anInt138 = -1;
				return true;
			}
			if (Class23.anInt138 == 63) {
				int i_95_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getULEShort();
				final int i_96_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getUByteS();
				if ((i_95_ ^ 0xffffffff) == -65536) {
					i_95_ = -1;
				}
				final int i_97_ = i_96_ >> 2;
				final int i_98_ = Class25.anIntArray153[i_97_];
				final int i_99_ = i_96_ & 0x3;
				final int i_100_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getInt();
				final int i_101_ = (i_100_ & 0x3bd1748b) >> 28;
				int i_102_ = (i_100_ & 0xfffe0e8) >> 14;
				int i_103_ = 0x3fff & i_100_;
				i_103_ -= Class181.currentBaseZ;
				i_102_ -= GameEntity.currentBaseX;
				ProducingGraphicsBuffer.method1853(i_95_, i_102_, (byte) -105, i_101_, i_103_, i_98_, i_99_, i_97_);
				Class23.anInt138 = -1;
				return true;
			}
			if (Class23.anInt138 == 30) {
				if (Class120_Sub14_Sub10.fullscreenFrame != null) {
					AbstractSprite.method1593(false, Class120_Sub12_Sub19.anInt3282, -1, -1);
				}
				final byte[] is = new byte[AbstractMouseWheelHandler.anInt118];
				Canvas_Sub1.aClass120_Sub7_Sub1_16.method1149(1, is, AbstractMouseWheelHandler.anInt118, 0);
				final String string = DisplayModeInfo.method2215(0, is, false, AbstractMouseWheelHandler.anInt118);
				if (Class112.frame != null || Signlink.anInt1310 != 3 && Signlink.aString1305.startsWith("win") && !FileSystem.haveInternetExplorer6) {
					Class151.aString1421 = string;
					Class99.aBoolean950 = true;
					Class3.aClass185_56 = NpcType.gameSignlink.method1953(string, (byte) -88);
				} else {
					Class188.method2482(i ^ 0x72, string, true);
				}
				Class23.anInt138 = -1;
				return true;
			}
			if (Class23.anInt138 == 147) {
				Class32.anInt254 = Canvas_Sub1.aClass120_Sub7_Sub1_16.getUByte();
				Class28.anInt176 = Canvas_Sub1.aClass120_Sub7_Sub1_16.getUByteA();
				for (int i_104_ = Class32.anInt254; i_104_ < Class32.anInt254 + 8; i_104_++) {
					for (int i_105_ = Class28.anInt176; i_105_ < 8 + Class28.anInt176; i_105_++) {
						if (Class120_Sub14_Sub12.groundObjects[Class173.gameLevel][i_104_][i_105_] != null) {
							Class120_Sub14_Sub12.groundObjects[Class173.gameLevel][i_104_][i_105_] = null;
							Class5.method97(i_104_, i_105_, -14327);
						}
					}
				}
				for (Class120_Sub24 class120_sub24 = (Class120_Sub24) Class120_Sub4.aClass105_2439.getFront(); class120_sub24 != null; class120_sub24 = (Class120_Sub24) Class120_Sub4.aClass105_2439.getNext()) {
					if (Class32.anInt254 <= class120_sub24.anInt2731 && class120_sub24.anInt2731 < 8 + Class32.anInt254 && Class28.anInt176 <= class120_sub24.anInt2725 && 8 + Class28.anInt176 > class120_sub24.anInt2725 && Class173.gameLevel == class120_sub24.anInt2722) {
						class120_sub24.anInt2720 = 0;
					}
				}
				Class23.anInt138 = -1;
				return true;
			}
			if (Class23.anInt138 == 10) {
				final int i_106_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getInt1();
				final int i_107_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getUShortA();
				Class120_Sub14_Sub14_Sub1.method1544(i_107_, (byte) -68, i_106_);
				Class23.anInt138 = -1;
				return true;
			}
			if (Class23.anInt138 == 100) {
				int i_108_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getUShort();
				if ((i_108_ ^ 0xffffffff) == -65536) {
					i_108_ = -1;
				}
				final int i_109_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getUByteA();
				Class183.method2447((byte) 82, i_109_, i_108_);
				Class23.anInt138 = -1;
				return true;
			}
			if (Class23.anInt138 == 206) {
				final int i_110_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getUByte();
				int i_111_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getULEShortA();
				if (i_111_ == 65535) {
					i_111_ = -1;
				}
				final int i_112_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.method1092((byte) -128);
				Class101.method832(-1, i_110_, i_112_, i_111_);
				Class23.anInt138 = -1;
				return true;
			}
			if (Class23.anInt138 == 54) {
				if (AbstractMouseWheelHandler.anInt118 == 0) {
					Npc.aString3752 = Class120_Sub12_Sub1.aString3132;
				} else {
					Npc.aString3752 = Canvas_Sub1.aClass120_Sub7_Sub1_16.getJString();
				}
				Class23.anInt138 = -1;
				return true;
			}
			if (Class23.anInt138 == 33) {
				final int i_113_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getUByte();
				final int i_114_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getUByte();
				final byte i_115_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getByte();
				if (client.aByte2201 != i_115_) {
					Class23.anInt138 = -1;
					return true;
				}
				Class23.anInt138 = -1;
				if (i_113_ != 255) {
					Class180_Sub1.aBoolean2848 = true;
					Class65.anInt592 = i_114_;
					Class120_Sub12_Sub26.anInt3327 = i_113_;
				} else {
					Class180_Sub1.aBoolean2848 = false;
					Class120_Sub12_Sub26.anInt3327 = 0;
					Class65.anInt592 = 0;
				}
				return true;
			}
			if (Class23.anInt138 == 183) {
				final int i_116_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getInt();
				int i_117_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getULEShortA();
				if (i_117_ == 65535) {
					i_117_ = -1;
				}
				final int i_118_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getUShortA();
				final int i_119_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getInt();
				if (Class69_Sub3_Sub1.updateInterfaceCounter(i_118_)) {
					final Class189 class189 = Class74.method650(69, i_116_);
					if (class189.aBoolean2041) {
						Class120_Sub12_Sub27.method1342(i_119_, i_116_, i + -128, i_117_);
						final ObjType objType = ObjType.list(i_117_);
						Class40.method325(objType.yan2d, objType.zoom2d, objType.xan2d, i_116_, (byte) 92);
						Class120_Sub12_Sub37.method1394((byte) -48, objType.yof2d, objType.zan2d, objType.xof2d, i_116_);
					} else {
						if (i_117_ == -1) {
							class189.anInt2031 = 0;
							Class23.anInt138 = -1;
							return true;
						}
						final ObjType objType = ObjType.list(i_117_);
						class189.anInt2091 = objType.yan2d;
						class189.anInt2031 = 4;
						class189.anInt1961 = i_117_;
						class189.anInt2047 = objType.xan2d;
						class189.anInt2005 = objType.zoom2d * 100 / i_119_;
						InterfaceClickMask.redrawInterface(class189);
					}
				}
				Class23.anInt138 = -1;
				return true;
			}
			if (Class23.anInt138 == 65) {
				final int i_120_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.method1089(775571361);
				final int i_121_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getULEShortA();
				final int i_122_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.method1128(i ^ ~0x6e);
				final int i_123_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.method1087(true);
				if (Class69_Sub3_Sub1.updateInterfaceCounter(i_121_)) {
					Class29.method254((byte) -96, i_120_, i_122_, i_123_);
				}
				Class23.anInt138 = -1;
				return true;
			}
			if (Class23.anInt138 == 152) {
				final int i_124_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getULEShortA();
				final int i_125_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getULEShortA();
				final int i_126_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getUShortA();
				final int i_127_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getLEInt();
				if (Class69_Sub3_Sub1.updateInterfaceCounter(i_124_)) {
					Class89.method746(i_126_ + (i_125_ << 16), i_127_, (byte) -56);
				}
				Class23.anInt138 = -1;
				return true;
			}
			if (Class23.anInt138 == 44) {
				boolean bool_128_ = false;
				final long l = Canvas_Sub1.aClass120_Sub7_Sub1_16.method1124((byte) 114);
				final long l_129_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getUShort();
				final long l_130_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getTriByte();
				final long l_131_ = (l_129_ << 32) + l_130_;
				final int i_132_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getUByte();
				while_214_: do {
					for (int i_133_ = 0; i_133_ < 100; i_133_++) {
						if ((Class120_Sub12_Sub15.aLongArray3245[i_133_] ^ 0xffffffffffffffffL) == (l_131_ ^ 0xffffffffffffffffL)) {
							bool_128_ = true;
							break while_214_;
						}
					}
					if (i_132_ <= 1) {
						if (Class27.aBoolean167 && !Class128.aBoolean1228 || Class120_Sub14_Sub4.aBoolean3464) {
							bool_128_ = true;
						} else {
							for (int i_134_ = 0; Class120_Sub12_Sub26.anInt3335 > i_134_; i_134_++) {
								if (l == Class85.aLongArray806[i_134_]) {
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
					final String string = Class120_Sub14_Sub8.method1472(Class120_Sub22.method1705(false, Class7.method107(i + 32767, Canvas_Sub1.aClass120_Sub7_Sub1_16)));
					if (i_132_ == 2 || i_132_ == 3) {
						Class120_Sub14_Sub14.method1540(new StringBuilder("<img=1>").append(Class136.method1977(false, l)).toString(), 7, string);
					} else if (i_132_ != 1) {
						Class120_Sub14_Sub14.method1540(Class136.method1977(false, l), 3, string);
					} else {
						Class120_Sub14_Sub14.method1540(new StringBuilder("<img=0>").append(Class136.method1977(false, l)).toString(), 7, string);
					}
				}
				Class23.anInt138 = -1;
				return true;
			}
			if (Class23.anInt138 == 89) {
				final int i_135_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getULEShort();
				final int i_136_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getInt();
				final int i_137_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getLEInt();
				if (Class69_Sub3_Sub1.updateInterfaceCounter(i_135_)) {
					final Class120_Sub26 class120_sub26 = (Class120_Sub26) Class120_Sub12_Sub13.aClass75_3234.method659(i_136_, -124);
					final Class120_Sub26 class120_sub26_138_ = (Class120_Sub26) Class120_Sub12_Sub13.aClass75_3234.method659(i_137_, -128);
					if (class120_sub26_138_ != null) {
						Class120_Sub19.method1675(class120_sub26_138_, class120_sub26 == null || class120_sub26_138_.anInt2745 != class120_sub26.anInt2745);
					}
					if (class120_sub26 != null) {
						class120_sub26.unlink();
						Class120_Sub12_Sub13.aClass75_3234.method655(class120_sub26, 96, i_137_);
					}
					Class189 class189 = Class74.method650(49, i_136_);
					if (class189 != null) {
						InterfaceClickMask.redrawInterface(class189);
					}
					class189 = Class74.method650(43, i_137_);
					if (class189 != null) {
						InterfaceClickMask.redrawInterface(class189);
						ProducingGraphicsBuffer.method1854(true, false, class189);
					}
					if ((Class69.anInt616 ^ 0xffffffff) != 0) {
						InterfaceClickMask.method1689(Class69.anInt616, 1, (byte) 104);
					}
				}
				Class23.anInt138 = -1;
				return true;
			}
			if (Class23.anInt138 == 246) {
				final long l = Canvas_Sub1.aClass120_Sub7_Sub1_16.method1124((byte) 114);
				Canvas_Sub1.aClass120_Sub7_Sub1_16.getByte();
				final long l_139_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.method1124((byte) 114);
				final long l_140_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getUShort();
				final long l_141_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getTriByte();
				final long l_142_ = (l_140_ << 32) - -l_141_;
				final int i_143_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getUByte();
				boolean bool_144_ = false;
				while_215_: do {
					for (int i_145_ = 0; i_145_ < 100; i_145_++) {
						if (Class120_Sub12_Sub15.aLongArray3245[i_145_] == l_142_) {
							bool_144_ = true;
							break while_215_;
						}
					}
					if (i_143_ <= 1) {
						if (Class27.aBoolean167 && !Class128.aBoolean1228 || Class120_Sub14_Sub4.aBoolean3464) {
							bool_144_ = true;
						} else {
							for (int i_146_ = 0; i_146_ < Class120_Sub12_Sub26.anInt3335; i_146_++) {
								if (l == Class85.aLongArray806[i_146_]) {
									bool_144_ = true;
									break;
								}
							}
						}
					}
				} while (false);
				if (!bool_144_ && Class69_Sub3.isInTutIsland == 0) {
					Class120_Sub12_Sub15.aLongArray3245[Class24.anInt147] = l_142_;
					Class24.anInt147 = (1 + Class24.anInt147) % 100;
					final String string = Class120_Sub14_Sub8.method1472(Class120_Sub22.method1705(false, Class7.method107(32767, Canvas_Sub1.aClass120_Sub7_Sub1_16)));
					if (i_143_ != 2 && i_143_ != 3) {
						if (i_143_ == 1) {
							Class120_Sub18.method1669(9, new StringBuilder("<img=0>").append(Class136.method1977(false, l)).toString(), Class136.method1977(false, l_139_), string, i ^ 0xffffffff);
						} else {
							Class120_Sub18.method1669(9, Class136.method1977(false, l), Class136.method1977(false, l_139_), string, i + -1);
						}
					} else {
						Class120_Sub18.method1669(9, new StringBuilder("<img=1>").append(Class136.method1977(false, l)).toString(), Class136.method1977(false, l_139_), string, -1);
					}
				}
				Class23.anInt138 = -1;
				return true;
			}
			if (Class23.anInt138 == 90) {
				final int i_147_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getULEShortA();
				final int i_148_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getUShortA();
				final int i_149_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getUShortA();
				final int i_150_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getULEShort();
				final int i_151_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getLEInt();
				if (Class69_Sub3_Sub1.updateInterfaceCounter(i_149_)) {
					Class40.method325(i_148_, i_147_, i_150_, i_151_, (byte) 92);
				}
				Class23.anInt138 = -1;
				return true;
			}
			if (Class23.anInt138 == 130) {
				final int i_152_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getUByteA();
				final int i_153_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getUByteC();
				final int i_154_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getUByte();
				Class173.gameLevel = i_154_ >> 1;
				Class100.selfPlayer.method2343(i_152_, (i_154_ & 0x1) == 1, i_153_);
				Class23.anInt138 = -1;
				return true;
			}
			if (Class23.anInt138 == 172) {
				final int i_155_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getLEInt();
				final int i_156_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.method1078(true);
				final int i_157_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getULEShortA();
				if (Class69_Sub3_Sub1.updateInterfaceCounter(i_157_)) {
					Class120_Sub14_Sub24.method1647(i + 5, i_155_, i_156_);
				}
				Class23.anInt138 = -1;
				return true;
			}
			if (Class23.anInt138 == 103) {
				final int i_158_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getInt();
				Class120_Sub1.aClass185_2403 = NpcType.gameSignlink.method1952((byte) -73, i_158_);
				Class23.anInt138 = -1;
				return true;
			}
			if (Class23.anInt138 == 242) {
				final int i_159_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getUByte();
				final int i_160_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getULEShort();
				if (Class69_Sub3_Sub1.updateInterfaceCounter(i_160_)) {
					Class134.anInt1281 = i_159_;
				}
				Class23.anInt138 = -1;
				return true;
			}
			if (Class23.anInt138 == 2) {
				Class120_Sub12_Sub12.anInt3217 = Class160.anInt1494;
				final long l = Canvas_Sub1.aClass120_Sub7_Sub1_16.method1124((byte) 114);
				if (l == 0L) {
					InterfaceChangeNode.aString3489 = null;
					Class120_Sub14_Sub13.anInt3572 = 0;
					Class150.aString1415 = null;
					Class23.anInt138 = -1;
					Class120_Sub28.aClass120_Sub13Array2754 = null;
					return true;
				}
				final long l_161_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.method1124((byte) 114);
				InterfaceChangeNode.aString3489 = Class174.method2234(0, l_161_);
				Class150.aString1415 = Class174.method2234(0, l);
				Class112.aByte1078 = Canvas_Sub1.aClass120_Sub7_Sub1_16.getByte();
				final int i_162_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getUByte();
				if (i_162_ == 255) {
					Class23.anInt138 = -1;
					return true;
				}
				Class120_Sub14_Sub13.anInt3572 = i_162_;
				final Class120_Sub13[] class120_sub13s = new Class120_Sub13[100];
				for (int i_163_ = 0; Class120_Sub14_Sub13.anInt3572 > i_163_; i_163_++) {
					class120_sub13s[i_163_] = new Class120_Sub13();
					class120_sub13s[i_163_].uid = Canvas_Sub1.aClass120_Sub7_Sub1_16.method1124((byte) 114);
					class120_sub13s[i_163_].aString2580 = Class174.method2234(i + 0, class120_sub13s[i_163_].uid);
					class120_sub13s[i_163_].anInt2571 = Canvas_Sub1.aClass120_Sub7_Sub1_16.getUShort();
					class120_sub13s[i_163_].aByte2575 = Canvas_Sub1.aClass120_Sub7_Sub1_16.getByte();
					class120_sub13s[i_163_].aString2579 = Canvas_Sub1.aClass120_Sub7_Sub1_16.getJString();
					if (Class20.aLong2168 == class120_sub13s[i_163_].uid) {
						MouseHandler.aByte1141 = class120_sub13s[i_163_].aByte2575;
					}
				}
				boolean bool_164_ = false;
				int i_165_ = Class120_Sub14_Sub13.anInt3572;
				while (i_165_ > 0) {
					i_165_--;
					bool_164_ = true;
					for (int i_166_ = 0; i_166_ < i_165_; i_166_++) {
						if (class120_sub13s[i_166_].aString2580.compareTo(class120_sub13s[1 + i_166_].aString2580) > 0) {
							final Class120_Sub13 class120_sub13 = class120_sub13s[i_166_];
							class120_sub13s[i_166_] = class120_sub13s[i_166_ + 1];
							class120_sub13s[i_166_ - -1] = class120_sub13;
							bool_164_ = false;
						}
					}
					if (bool_164_) {
						break;
					}
				}
				Class23.anInt138 = -1;
				Class120_Sub28.aClass120_Sub13Array2754 = class120_sub13s;
				return true;
			}
			if (Class23.anInt138 == 173) {
				Class120_Sub12.method1182(NpcType.gameSignlink, AbstractMouseWheelHandler.anInt118, (byte) -120, Canvas_Sub1.aClass120_Sub7_Sub1_16);
				Class23.anInt138 = -1;
				return true;
			}
			if (Class23.anInt138 == 115 || Class23.anInt138 == 111 || Class23.anInt138 == 17 || Class23.anInt138 == 144 || Class23.anInt138 == 114 || Class23.anInt138 == 133 || Class23.anInt138 == 47 || Class23.anInt138 == 158 || Class23.anInt138 == 105 || Class23.anInt138 == 120
					|| Class23.anInt138 == 60 || Class23.anInt138 == 179 || Class23.anInt138 == 232 || Class23.anInt138 == 131) {
				Class191.method2513((byte) 93);
				Class23.anInt138 = -1;
				return true;
			}
			if (Class23.anInt138 == 113) {
				final int i_167_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getUShort();
				final int i_168_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.method1089(i + 775571361);
				final int i_169_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getULEShortA();
				final int i_170_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getULEShortA();
				final int i_171_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getULEShortA();
				if (Class69_Sub3_Sub1.updateInterfaceCounter(i_170_)) {
					Class120_Sub21.method1695(7, i_167_, i_168_, i_169_ << 16 | i_171_, (byte) 66);
				}
				Class23.anInt138 = -1;
				return true;
			}
			if (Class23.anInt138 == 182) {
				long l = Canvas_Sub1.aClass120_Sub7_Sub1_16.method1124((byte) 114);
				final int i_172_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getUShort();
				final int i_173_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getUByte();
				boolean bool_174_ = true;
				if (0L > l) {
					bool_174_ = false;
					l &= 0x7fffffffffffffffL;
				}
				String string = "";
				if (i_172_ > 0) {
					string = Canvas_Sub1.aClass120_Sub7_Sub1_16.getJString();
				}
				String string_175_ = Class136.method1977(false, l);
				for (int i_176_ = 0; ProducingGraphicsBuffer.anInt2799 > i_176_; i_176_++) {
					if ((AbstractSprite.aLongArray3617[i_176_] ^ 0xffffffffffffffffL) == (l ^ 0xffffffffffffffffL)) {
						if (i_172_ != Class120_Sub12_Sub16.anIntArray3252[i_176_]) {
							Class120_Sub12_Sub16.anIntArray3252[i_176_] = i_172_;
							if (i_172_ > 0) {
								Class120_Sub14_Sub14.method1540("", 5, new StringBuilder(string_175_).append(Class120_Sub21.aString2669).toString());
							}
							if (i_172_ == 0) {
								Class120_Sub14_Sub14.method1540("", 5, new StringBuilder(string_175_).append(Class132.aString1250).toString());
							}
						}
						Class79_Sub1.aStringArray2247[i_176_] = string;
						Class120_Sub12_Sub30.anIntArray3374[i_176_] = i_173_;
						Class120_Sub12_Sub9.aBooleanArray3194[i_176_] = bool_174_;
						string_175_ = null;
						break;
					}
				}
				if (string_175_ != null && ProducingGraphicsBuffer.anInt2799 < 200) {
					AbstractSprite.aLongArray3617[ProducingGraphicsBuffer.anInt2799] = l;
					Class120_Sub16.aStringArray2599[ProducingGraphicsBuffer.anInt2799] = string_175_;
					Class120_Sub12_Sub16.anIntArray3252[ProducingGraphicsBuffer.anInt2799] = i_172_;
					Class79_Sub1.aStringArray2247[ProducingGraphicsBuffer.anInt2799] = string;
					Class120_Sub12_Sub30.anIntArray3374[ProducingGraphicsBuffer.anInt2799] = i_173_;
					Class120_Sub12_Sub9.aBooleanArray3194[ProducingGraphicsBuffer.anInt2799] = bool_174_;
					ProducingGraphicsBuffer.anInt2799++;
				}
				boolean bool_177_ = false;
				Class61.anInt563 = Class160.anInt1494;
				int i_178_ = ProducingGraphicsBuffer.anInt2799;
				while (i_178_ > 0) {
					bool_177_ = true;
					i_178_--;
					for (int i_179_ = 0; i_178_ > i_179_; i_179_++) {
						if (Class120_Sub12_Sub16.anIntArray3252[i_179_] != Class157.anInt1469 && Class157.anInt1469 == Class120_Sub12_Sub16.anIntArray3252[1 + i_179_] || Class120_Sub12_Sub16.anIntArray3252[i_179_] == 0 && Class120_Sub12_Sub16.anIntArray3252[i_179_ + 1] != 0) {
							bool_177_ = false;
							final int i_180_ = Class120_Sub12_Sub16.anIntArray3252[i_179_];
							Class120_Sub12_Sub16.anIntArray3252[i_179_] = Class120_Sub12_Sub16.anIntArray3252[i_179_ + 1];
							Class120_Sub12_Sub16.anIntArray3252[1 + i_179_] = i_180_;
							final String string_181_ = Class79_Sub1.aStringArray2247[i_179_];
							Class79_Sub1.aStringArray2247[i_179_] = Class79_Sub1.aStringArray2247[1 + i_179_];
							Class79_Sub1.aStringArray2247[i_179_ - -1] = string_181_;
							final String string_182_ = Class120_Sub16.aStringArray2599[i_179_];
							Class120_Sub16.aStringArray2599[i_179_] = Class120_Sub16.aStringArray2599[1 + i_179_];
							Class120_Sub16.aStringArray2599[1 + i_179_] = string_182_;
							final long l_183_ = AbstractSprite.aLongArray3617[i_179_];
							AbstractSprite.aLongArray3617[i_179_] = AbstractSprite.aLongArray3617[1 + i_179_];
							AbstractSprite.aLongArray3617[1 + i_179_] = l_183_;
							final int i_184_ = Class120_Sub12_Sub30.anIntArray3374[i_179_];
							Class120_Sub12_Sub30.anIntArray3374[i_179_] = Class120_Sub12_Sub30.anIntArray3374[1 + i_179_];
							Class120_Sub12_Sub30.anIntArray3374[i_179_ - -1] = i_184_;
							final boolean bool_185_ = Class120_Sub12_Sub9.aBooleanArray3194[i_179_];
							Class120_Sub12_Sub9.aBooleanArray3194[i_179_] = Class120_Sub12_Sub9.aBooleanArray3194[i_179_ + 1];
							Class120_Sub12_Sub9.aBooleanArray3194[i_179_ + 1] = bool_185_;
						}
					}
					if (bool_177_) {
						break;
					}
				}
				Class23.anInt138 = -1;
				return true;
			}
			if (Class23.anInt138 == 225) {
				final int i_186_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getUShort();
				final int i_187_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getULEShortA();
				final int i_188_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getUByteS();
				if (Class69_Sub3_Sub1.updateInterfaceCounter(i_187_)) {
					if (i_188_ == 2) {
						Class54.method480(-62);
					}
					Class69.anInt616 = i_186_;
					Class120_Sub14_Sub1.method1413(-5, i_186_);
					Class101_Sub2.method846((byte) 83, false);
					Class46.method376(true, Class69.anInt616);
					for (int i_189_ = 0; i_189_ < 100; i_189_++) {
						Class52.aBooleanArray467[i_189_] = true;
					}
				}
				Class23.anInt138 = -1;
				return true;
			}
			if (Class23.anInt138 == 156) {
				final int i_190_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getUShort();
				if (Class69_Sub3_Sub1.updateInterfaceCounter(i_190_)) {
					Class3.method85(true);
				}
				Class23.anInt138 = -1;
				return true;
			}
			if (Class23.anInt138 == 229) {
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
				Class23.anInt138 = -1;
				return true;
			}
			if (Class23.anInt138 == 78) {
				Class33.method275((byte) -5);
				Class90.method757((byte) 46);
				Class23.anInt138 = -1;
				Class27.anInt165 += 32;
				return true;
			}
			if (Class23.anInt138 == 177) {
				final int i_193_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getUByte();
				final int i_194_ = i_193_ >> 5;
				final int i_195_ = 0x1f & i_193_;
				if (i_195_ == 0) {
					Class187.aClass85Array1909[i_194_] = null;
					Class23.anInt138 = -1;
					return true;
				}
				final Class85 class85 = new Class85();
				class85.anInt809 = i_195_;
				class85.anInt805 = Canvas_Sub1.aClass120_Sub7_Sub1_16.getUByte();
				if (class85.anInt805 >= 0 && class85.anInt805 < Class180_Sub6.aClass120_Sub14_Sub19Array3073.length) {
					if (class85.anInt809 == 1 || class85.anInt809 == 10) {
						class85.anInt808 = Canvas_Sub1.aClass120_Sub7_Sub1_16.getUShort();
						Canvas_Sub1.aClass120_Sub7_Sub1_16.pos += 5;
					} else if (class85.anInt809 >= 2 && class85.anInt809 <= 6) {
						if (class85.anInt809 == 2) {
							class85.anInt812 = 64;
							class85.anInt815 = 64;
						}
						if (class85.anInt809 == 3) {
							class85.anInt815 = 64;
							class85.anInt812 = 0;
						}
						if (class85.anInt809 == 4) {
							class85.anInt812 = 128;
							class85.anInt815 = 64;
						}
						if (class85.anInt809 == 5) {
							class85.anInt812 = 64;
							class85.anInt815 = 0;
						}
						if (class85.anInt809 == 6) {
							class85.anInt815 = 128;
							class85.anInt812 = 64;
						}
						class85.anInt809 = 2;
						class85.anInt804 = Canvas_Sub1.aClass120_Sub7_Sub1_16.getUShort();
						class85.anInt813 = Canvas_Sub1.aClass120_Sub7_Sub1_16.getUShort();
						class85.anInt814 = Canvas_Sub1.aClass120_Sub7_Sub1_16.getUByte();
						class85.anInt810 = Canvas_Sub1.aClass120_Sub7_Sub1_16.getUShort();
					}
					class85.anInt811 = Canvas_Sub1.aClass120_Sub7_Sub1_16.getUShort();
					if (class85.anInt811 == 65535) {
						class85.anInt811 = -1;
					}
					Class187.aClass85Array1909[i_194_] = class85;
				}
				Class23.anInt138 = -1;
				return true;
			}
			if (Class23.anInt138 == 136) {//TODO npc update
				Class186.method2471(-114);
				Class23.anInt138 = -1;
				return true;
			}
			if (Class23.anInt138 == 155) {
				Class120_Sub29.receiveRegionData(true);
				Class23.anInt138 = -1;
				return true;
			}
			if (Class23.anInt138 == 75) {
				final int i_196_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getULEShortA();
				final String string = Canvas_Sub1.aClass120_Sub7_Sub1_16.getJString();
				final int i_197_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getULEShortA();
				if (Class69_Sub3_Sub1.updateInterfaceCounter(i_196_)) {
					Class120_Sub12_Sub28.method1345(string, i_197_, (byte) 108);
				}
				Class23.anInt138 = -1;
				return true;
			}
			if (Class23.anInt138 == 137) {
				final int i_198_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getULEShort();
				final int i_199_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getUByte();
				Class142.method2004(1006, i_199_, i_198_);
				Class23.anInt138 = -1;
				return true;
			}
			if (Class23.anInt138 == 72) {
				Class120_Sub22.anInt2675 = Canvas_Sub1.aClass120_Sub7_Sub1_16.getULEShort() * 30;
				Class120_Sub2.anInt2419 = Class160.anInt1494;
				Class23.anInt138 = -1;
				return true;
			}
			if (Class23.anInt138 == 26) {
				final int i_200_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getInt1();
				final Class189 class189 = Class74.method650(i ^ ~0x64, i_200_);
				for (int i_201_ = 0; class189.anIntArray1978.length > i_201_; i_201_++) {
					class189.anIntArray1978[i_201_] = -1;
					class189.anIntArray1978[i_201_] = 0;
				}
				InterfaceClickMask.redrawInterface(class189);
				Class23.anInt138 = -1;
				return true;
			}
			if (Class23.anInt138 == 99) {
				final long l = Canvas_Sub1.aClass120_Sub7_Sub1_16.method1124((byte) 114);
				Canvas_Sub1.aClass120_Sub7_Sub1_16.getByte();
				final long l_202_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.method1124((byte) 114);
				final long l_203_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getUShort();
				final long l_204_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getTriByte();
				final long l_205_ = (l_203_ << 32) - -l_204_;
				final int i_206_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getUByte();
				final int i_207_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getUShort();
				boolean bool_208_ = false;
				while_216_: do {
					for (int i_209_ = 0; i_209_ < 100; i_209_++) {
						if ((Class120_Sub12_Sub15.aLongArray3245[i_209_] ^ 0xffffffffffffffffL) == (l_205_ ^ 0xffffffffffffffffL)) {
							bool_208_ = true;
							break while_216_;
						}
					}
					if (i_206_ <= 1) {
						for (int i_210_ = 0; i_210_ < Class120_Sub12_Sub26.anInt3335; i_210_++) {
							if ((l ^ 0xffffffffffffffffL) == (Class85.aLongArray806[i_210_] ^ 0xffffffffffffffffL)) {
								bool_208_ = true;
								break;
							}
						}
					}
				} while (false);
				if (!bool_208_ && Class69_Sub3.isInTutIsland == 0) {
					Class120_Sub12_Sub15.aLongArray3245[Class24.anInt147] = l_205_;
					Class24.anInt147 = (Class24.anInt147 - -1) % 100;
					final String string = Class121.method1837(i_207_, true).method1506(Canvas_Sub1.aClass120_Sub7_Sub1_16);
					if (i_206_ == 2 || i_206_ == 3) {
						Class120_Sub16.method1660(new StringBuilder("<img=1>").append(Class136.method1977(false, l)).toString(), i_207_, Class136.method1977(false, l_202_), 20, string, 0);
					} else if (i_206_ != 1) {
						Class120_Sub16.method1660(Class136.method1977(false, l), i_207_, Class136.method1977(false, l_202_), 20, string, i);
					} else {
						Class120_Sub16.method1660(new StringBuilder("<img=0>").append(Class136.method1977(false, l)).toString(), i_207_, Class136.method1977(false, l_202_), 20, string, 0);
					}
				}
				Class23.anInt138 = -1;
				return true;
			}
			if (Class23.anInt138 == 237) {
				int i_211_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getULEShort();
				final int i_212_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getUShortA();
				final int i_213_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getULEShort();
				final int i_214_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getInt1();
				if (i_214_ >> 30 != 0) {
					final int i_215_ = i_214_ >> 28 & 0x3;
					int i_216_ = -GameEntity.currentBaseX + (i_214_ >> 14 & 0x3fff);
					int i_217_ = -Class181.currentBaseZ + (0x3fff & i_214_);
					if (i_216_ >= 0 && i_217_ >= 0 && i_216_ < 104 && i_217_ < 104) {
						i_217_ = 64 + i_217_ * 128;
						i_216_ = 64 + 128 * i_216_;
						final Class180_Sub3 class180_sub3 = new Class180_Sub3(i_211_, i_215_, i_216_, i_217_, -i_213_ + Class22.method197(i_217_, true, i_216_, i_215_), i_212_, Class101_Sub2.loopCycle);
						Class120_Sub12_Sub7.aClass105_3177.addLast(new Class120_Sub14_Sub4(class180_sub3));
					}
				} else if (i_214_ >> 29 == 0) {
					if (i_214_ >> 28 != 0) {
						final int i_218_ = 0xffff & i_214_;
						Player class180_sub5_sub1;
						if (Class167.anInt1616 == i_218_) {
							class180_sub5_sub1 = Class100.selfPlayer;
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
									if ((spotAnimType.anInt991 ^ 0xffffffff) != 0 && (class103_220_.anInt991 ^ 0xffffffff) != 0) {
										final Class40 class40 = Class120_Sub30_Sub2.method1763(spotAnimType.anInt991, 127);
										final Class40 class40_221_ = Class120_Sub30_Sub2.method1763(class103_220_.anInt991, 120);
										if (class40.anInt348 < class40_221_.anInt348) {
											bool_219_ = false;
										}
									}
								} else {
									final SpotAnimType spotAnimType = SpotAnimType.list(i_211_);
									if (spotAnimType.aBoolean998 && (spotAnimType.anInt991 ^ 0xffffffff) != 0) {
										final Class40 class40 = Class120_Sub30_Sub2.method1763(spotAnimType.anInt991, 119);
										final int i_222_ = class40.anInt337;
										if (i_222_ == 1) {
											class180_sub5_sub1.spotAnimFrameId = 0;
											class180_sub5_sub1.anInt2963 = 0;
											class180_sub5_sub1.anInt2971 = 1;
											bool_219_ = false;
											class180_sub5_sub1.anInt2979 = i_212_ + Class101_Sub2.loopCycle;
											class180_sub5_sub1.anInt2984 = 0;
											Class120_Sub12_Sub23.method1323(class40, class180_sub5_sub1.z, class180_sub5_sub1.x, class180_sub5_sub1.spotAnimFrameId, false, false);
										} else if (i_222_ == 2) {
											class180_sub5_sub1.anInt2999 = 0;
											bool_219_ = false;
										}
									}
								}
							}
							if (bool_219_) {
								class180_sub5_sub1.anInt2963 = 0;
								class180_sub5_sub1.anInt2971 = 1;
								class180_sub5_sub1.anInt2979 = Class101_Sub2.loopCycle + i_212_;
								class180_sub5_sub1.anInt2965 = i_213_;
								class180_sub5_sub1.spotAnimFrameId = 0;
								class180_sub5_sub1.spotAnimId = i_211_;
								if (class180_sub5_sub1.anInt2979 > Class101_Sub2.loopCycle) {
									class180_sub5_sub1.spotAnimFrameId = -1;
								}
								if (-65536 == (class180_sub5_sub1.spotAnimId ^ 0xffffffff)) {
									class180_sub5_sub1.spotAnimId = -1;
								}
								if ((class180_sub5_sub1.spotAnimId ^ 0xffffffff) != 0 && class180_sub5_sub1.anInt2979 == Class101_Sub2.loopCycle) {
									final int i_223_ = SpotAnimType.list(class180_sub5_sub1.spotAnimId).anInt991;
									if ((i_223_ ^ 0xffffffff) != 0) {
										final Class40 class40 = Class120_Sub30_Sub2.method1763(i_223_, 121);
										if (class40 != null && class40.anIntArray342 != null) {
											Class120_Sub12_Sub23.method1323(class40, class180_sub5_sub1.z, class180_sub5_sub1.x, 0, class180_sub5_sub1 == Class100.selfPlayer, false);
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
								if (spotAnimType.aBoolean998 && spotAnimType.anInt991 != -1) {
									final Class40 class40 = Class120_Sub30_Sub2.method1763(spotAnimType.anInt991, i ^ 0x7a);
									final int i_226_ = class40.anInt337;
									if (i_226_ == 1) {
										bool_225_ = false;
										class180_sub5_sub2.anInt2979 = Class101_Sub2.loopCycle + i_212_;
										class180_sub5_sub2.spotAnimFrameId = 0;
										class180_sub5_sub2.anInt2971 = 1;
										class180_sub5_sub2.anInt2963 = 0;
										class180_sub5_sub2.anInt2984 = 0;
										Class120_Sub12_Sub23.method1323(class40, class180_sub5_sub2.z, class180_sub5_sub2.x, class180_sub5_sub2.spotAnimFrameId, false, false);
									} else if (i_226_ == 2) {
										class180_sub5_sub2.anInt2999 = 0;
										bool_225_ = false;
									}
								}
							} else {
								final SpotAnimType spotAnimType = SpotAnimType.list(i_211_);
								final SpotAnimType class103_227_ = SpotAnimType.list(class180_sub5_sub2.spotAnimId);
								if ((spotAnimType.anInt991 ^ 0xffffffff) != 0 && class103_227_.anInt991 != -1) {
									final Class40 class40 = Class120_Sub30_Sub2.method1763(spotAnimType.anInt991, i ^ 0x7e);
									final Class40 class40_228_ = Class120_Sub30_Sub2.method1763(class103_227_.anInt991, 118);
									if (class40.anInt348 < class40_228_.anInt348) {
										bool_225_ = false;
									}
								}
							}
						}
						if (bool_225_) {
							class180_sub5_sub2.spotAnimId = i_211_;
							class180_sub5_sub2.spotAnimFrameId = 0;
							class180_sub5_sub2.anInt2971 = 1;
							class180_sub5_sub2.anInt2965 = i_213_;
							class180_sub5_sub2.anInt2963 = 0;
							class180_sub5_sub2.anInt2979 = i_212_ + Class101_Sub2.loopCycle;
							if (class180_sub5_sub2.anInt2979 > Class101_Sub2.loopCycle) {
								class180_sub5_sub2.spotAnimFrameId = -1;
							}
							if (class180_sub5_sub2.spotAnimId != -1 && Class101_Sub2.loopCycle == class180_sub5_sub2.anInt2979) {
								final int i_229_ = SpotAnimType.list(class180_sub5_sub2.spotAnimId).anInt991;
								if (i_229_ != -1) {
									final Class40 class40 = Class120_Sub30_Sub2.method1763(i_229_, 120);
									if (class40 != null && class40.anIntArray342 != null) {
										Class120_Sub12_Sub23.method1323(class40, class180_sub5_sub2.z, class180_sub5_sub2.x, 0, false, false);
									}
								}
							}
						}
					}
				}
				Class23.anInt138 = -1;
				return true;
			}
			if (Class23.anInt138 == 151) {
				final int i_230_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getUShort();
				final int i_231_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getUByte();
				final int i_232_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getUByte();
				final int i_233_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getUShort();
				final int i_234_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getUByte();
				final int i_235_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getUByte();
				if (Class69_Sub3_Sub1.updateInterfaceCounter(i_230_)) {
					Class120_Sub14_Sub23.method1639(i_234_, i_231_, i_235_, i_233_, true, 0, i_232_);
				}
				Class23.anInt138 = -1;
				return true;
			}
			if (Class23.anInt138 == 116) {
				final int i_236_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getUShortA();
				final int i_237_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getUShortA();
				final String string = Canvas_Sub1.aClass120_Sub7_Sub1_16.getJString();
				if (Class69_Sub3_Sub1.updateInterfaceCounter(i_237_)) {
					Class120_Sub12_Sub28.method1345(string, i_236_, (byte) 108);
				}
				Class23.anInt138 = -1;
				return true;
			}
			if (Class23.anInt138 == 222) {
				final long l = Canvas_Sub1.aClass120_Sub7_Sub1_16.method1124((byte) 114);
				final long l_238_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getUShort();
				final long l_239_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getTriByte();
				final int i_240_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getUByte();
				final int i_241_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getUShort();
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
						for (int i_245_ = 0; i_245_ < Class120_Sub12_Sub26.anInt3335; i_245_++) {
							if ((Class85.aLongArray806[i_245_] ^ 0xffffffffffffffffL) == (l ^ 0xffffffffffffffffL)) {
								bool_242_ = true;
								break;
							}
						}
					}
				} while (false);
				if (!bool_242_ && Class69_Sub3.isInTutIsland == 0) {
					Class120_Sub12_Sub15.aLongArray3245[Class24.anInt147] = l_243_;
					Class24.anInt147 = (Class24.anInt147 + 1) % 100;
					final String string = Class121.method1837(i_241_, true).method1506(Canvas_Sub1.aClass120_Sub7_Sub1_16);
					if (i_240_ == 2) {
						Class120_Sub16.method1660(new StringBuilder("<img=1>").append(Class136.method1977(false, l)).toString(), i_241_, null, 18, string, 0);
					} else if (i_240_ == 1) {
						Class120_Sub16.method1660(new StringBuilder("<img=0>").append(Class136.method1977(false, l)).toString(), i_241_, null, 18, string, 0);
					} else {
						Class120_Sub16.method1660(Class136.method1977(false, l), i_241_, null, 18, string, i + 0);
					}
				}
				Class23.anInt138 = -1;
				return true;
			}
			if (Class23.anInt138 == 46) {
				final int i_246_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getUShort();
				final int i_247_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getUByte();
				final int i_248_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getUByte();
				final int i_249_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getUByte();
				final int i_250_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getUByte();
				final int i_251_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getUShort();
				if (Class69_Sub3_Sub1.updateInterfaceCounter(i_246_)) {
					Class120_Sub12_Sub12.aBooleanArray3223[i_247_] = true;
					Class120_Sub12_Sub37.anIntArray3425[i_247_] = i_248_;
					Class181.anIntArray1790[i_247_] = i_249_;
					Class120_Sub1.anIntArray2409[i_247_] = i_250_;
					Class120_Sub1.anIntArray2412[i_247_] = i_251_;
				}
				Class23.anInt138 = -1;
				return true;
			}
			if (Class23.anInt138 == 153) {
				int i_252_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getUShort();
				if (65535 == i_252_) {
					i_252_ = -1;
				}
				final int i_253_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getUByte();
				final int i_254_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getUShort();
				final int i_255_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getUByte();
				Class48.method404((byte) -100, i_254_, i_252_, i_253_, i_255_);
				Class23.anInt138 = -1;
				return true;
			}
			if (Class23.anInt138 == 135) {
				final int i_256_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getUShort();
				final int i_257_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getInt();
				if (Class69_Sub3_Sub1.updateInterfaceCounter(i_256_)) {
					final Class120_Sub26 class120_sub26 = (Class120_Sub26) Class120_Sub12_Sub13.aClass75_3234.method659(i_257_, i + -25);
					if (class120_sub26 != null) {
						Class120_Sub19.method1675(class120_sub26, true);
					}
					if (Class156.aClass189_1454 != null) {
						InterfaceClickMask.redrawInterface(Class156.aClass189_1454);
						Class156.aClass189_1454 = null;
					}
				}
				Class23.anInt138 = -1;
				return true;
			}
			if (Class23.anInt138 == 40) {
				final int i_258_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getLEInt();
				final int i_259_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getULEShort();
				final int i_260_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getUByte();
				if (Class69_Sub3_Sub1.updateInterfaceCounter(i_259_)) {
					Class164.method2132(i_258_, i_260_, true);
				}
				Class23.anInt138 = -1;
				return true;
			}
			if (Class23.anInt138 == 23) {
				Class69_Sub3_Sub1.anInt3084 = Canvas_Sub1.aClass120_Sub7_Sub1_16.getUByte();
				Class120_Sub12_Sub31.anInt3382 = Canvas_Sub1.aClass120_Sub7_Sub1_16.getUByte();
				KeyboardHandler.anInt1507 = Canvas_Sub1.aClass120_Sub7_Sub1_16.getUByte();
				Class23.anInt138 = -1;
				return true;
			}
			if (Class23.anInt138 == 168) {
				final int i_261_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getUShort();
				Class86.method730(255, i_261_);
				Class120_Sub12_Sub21_Sub1.anIntArray3912[Class120_Sub12_Sub3.method1207(31, Class33.anInt278++)] = Class120_Sub12_Sub3.method1207(32767, i_261_);
				Class23.anInt138 = -1;
				return true;
			}
			if (Class23.anInt138 == 52) {
				final int i_262_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getUShort();
				if (Class69_Sub3_Sub1.updateInterfaceCounter(i_262_)) {
					SpotAnimType.method876((byte) 107);
				}
				Class23.anInt138 = -1;
				return true;
			}
			if (Class23.anInt138 == 38) {
				final byte i_263_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getByte();
				final int i_264_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getULEShort();
				Class120_Sub14_Sub14_Sub1.method1544(i_264_, (byte) -68, i_263_);
				Class23.anInt138 = -1;
				return true;
			}
			if (Class23.anInt138 == 194) {
				final int i_265_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getInt();
				int i_266_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getUShort();
				if (69999 < (i_265_ ^ 0xffffffff)) {
					i_266_ += 32768;
				}
				Class189 class189;
				if (i_265_ < 0) {
					class189 = null;
				} else {
					class189 = Class74.method650(i + -104, i_265_);
				}
				if (class189 != null) {
					for (int i_267_ = 0; class189.anIntArray1978.length > i_267_; i_267_++) {
						class189.anIntArray1978[i_267_] = 0;
						class189.anIntArray1983[i_267_] = 0;
					}
				}
				Class179.method2263(114, i_266_);
				final int i_268_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getUShort();
				for (int i_269_ = 0; i_269_ < i_268_; i_269_++) {
					final int i_270_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getUShort();
					int i_271_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getUByteC();
					if (i_271_ == 255) {
						i_271_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getInt();
					}
					if (class189 != null && i_269_ < class189.anIntArray1978.length) {
						class189.anIntArray1978[i_269_] = i_270_;
						class189.anIntArray1983[i_269_] = i_271_;
					}
					MouseHandler.method1027(14378, i_266_, i_269_, i_270_ - 1, i_271_);
				}
				if (class189 != null) {
					InterfaceClickMask.redrawInterface(class189);
				}
				Class90.method757((byte) -116);
				Class120_Sub12_Sub21_Sub1.anIntArray3912[Class120_Sub12_Sub3.method1207(31, Class33.anInt278++)] = Class120_Sub12_Sub3.method1207(i_266_, 32767);
				Class23.anInt138 = -1;
				return true;
			}
			if (Class23.anInt138 == 150) {
				final int i_272_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getUShort();
				final int i_273_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getUShortA();
				final int i_274_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getUByteC();
				final Npc class180_sub5_sub2 = Class120_Sub12_Sub11.npcList[i_273_];
				if (class180_sub5_sub2 != null) {
					Class23.method204(i_272_, class180_sub5_sub2, (byte) -118, i_274_);
				}
				Class23.anInt138 = -1;
				return true;
			}
			if (Class23.anInt138 == 93) {
				final int i_275_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getUShort();
				final int i_276_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getUByte();
				final int i_277_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getUByte();
				final int i_278_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getUShort();
				final int i_279_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getUByte();
				final int i_280_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getUByte();
				if (Class69_Sub3_Sub1.updateInterfaceCounter(i_275_)) {
					Class120_Sub12_Sub16.method1278(26379, i_278_, i_279_, i_276_, i_277_, i_280_);
				}
				Class23.anInt138 = -1;
				return true;
			}
			if (Class23.anInt138 == 166) {
				Canvas_Sub1.aClass120_Sub7_Sub1_16.pos += 28;
				if (Canvas_Sub1.aClass120_Sub7_Sub1_16.compareCrc()) {
					Class120_Sub3.method1057(Canvas_Sub1.aClass120_Sub7_Sub1_16, -28 + Canvas_Sub1.aClass120_Sub7_Sub1_16.pos);
				}
				Class23.anInt138 = -1;
				return true;
			}
			if (Class23.anInt138 == 42) {
				final int i_281_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getULEShortA();
				final int i_282_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getUShortA();
				final int i_283_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getULEShortA();
				if (Class69_Sub3_Sub1.updateInterfaceCounter(i_281_)) {
					Class120_Sub8.method1158(i_283_, (byte) 125, i_282_);
				}
				Class23.anInt138 = -1;
				return true;
			}
			if (Class23.anInt138 == 18) {
				int i_284_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getULEShort();
				if (65535 == i_284_) {
					i_284_ = -1;
				}
				final int i_285_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getUShort();
				final int i_286_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getInt();
				if (Class69_Sub3_Sub1.updateInterfaceCounter(i_285_)) {
					Class120_Sub21.method1695(2, -1, i_286_, i_284_, (byte) 66);
				}
				Class23.anInt138 = -1;
				return true;
			}
			if (Class23.anInt138 == 43) {
				Class120_Sub12_Sub26.anInt3335 = AbstractMouseWheelHandler.anInt118 / 8;
				for (int i_287_ = 0; Class120_Sub12_Sub26.anInt3335 > i_287_; i_287_++) {
					Class85.aLongArray806[i_287_] = Canvas_Sub1.aClass120_Sub7_Sub1_16.method1124((byte) 114);
					Class84.aStringArray801[i_287_] = Class143.method2018(Class120_Sub12_Sub38.method1397(i, 93), Class85.aLongArray806[i_287_]);
					Class120_Sub14_Sub4.aBooleanArray3468[i_287_] = false;
				}
				Class23.anInt138 = -1;
				Class61.anInt563 = Class160.anInt1494;
				return true;
			}
			if (Class23.anInt138 == 221) {
				final long l = Canvas_Sub1.aClass120_Sub7_Sub1_16.method1124((byte) 114);
				final int i_288_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getUShort();
				final String string = Class121.method1837(i_288_, true).method1506(Canvas_Sub1.aClass120_Sub7_Sub1_16);
				Class120_Sub16.method1660(Class136.method1977(false, l), i_288_, null, 19, string, 0);
				Class23.anInt138 = -1;
				return true;
			}
			if (Class23.anInt138 == 199) {
				final int i_289_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getInt1();
				final int i_290_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getUShort();
				if (Class69_Sub3_Sub1.updateInterfaceCounter(i_290_)) {
					int i_291_ = 0;
					if (Class100.selfPlayer.appearance != null) {
						i_291_ = Class100.selfPlayer.appearance.method2043((byte) 99);
					}
					Class120_Sub21.method1695(3, -1, i_289_, i_291_, (byte) 66);
				}
				Class23.anInt138 = -1;
				return true;
			}
			if (Class23.anInt138 == 243) {
				final int i_292_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getUShort();
				final int i_293_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getInt1();
				final int i_294_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getULEShortA();
				if (Class69_Sub3_Sub1.updateInterfaceCounter(i_294_)) {
					Class29.method250(i_293_, i_292_, 6703);
				}
				Class23.anInt138 = -1;
				return true;
			}
			if (Class23.anInt138 == 19) {
				final int i_295_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getUByte();
				if (Canvas_Sub1.aClass120_Sub7_Sub1_16.getUByte() != 0) {
					final PacketBuffer class120_sub7_sub1 = Canvas_Sub1.aClass120_Sub7_Sub1_16;
					class120_sub7_sub1.pos = ((Buffer) class120_sub7_sub1).pos - 1;
					Class120_Sub3.aClass160Array2427[i_295_] = new Class160(Canvas_Sub1.aClass120_Sub7_Sub1_16);
				} else {
					Class120_Sub3.aClass160Array2427[i_295_] = new Class160();
				}
				Class23.anInt138 = -1;
				Class120_Sub29.anInt2768 = Class160.anInt1494;
				return true;
			}
			Class180_Sub3.method2312(null, new StringBuilder("T1 - ").append(Class23.anInt138).append(",").append(Class73.anInt639).append(",").append(Class40.anInt333).append(" - ").append(AbstractMouseWheelHandler.anInt118).toString());
			InputStream_Sub1.logout();
			bool = true;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("jf.E(").append(i).append(')').toString());
		}
		return bool;
	}

	abstract void method738(int i);

	public AbstractTimer() {
		/* empty */
	}

	abstract long method739(int i);
}
