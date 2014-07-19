/* Class176 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class SubScript {
	ClientScript origClientScript;
	String[] stringArguments;
	int opcodeIndex = -1;
	static short[][] aShortArrayArray1764 = { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 },
			{ 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };
	int[] intArguments;
	static String aString1766 = "flash2:";

	static final int method2242(final int i, final int i_0_, final byte i_1_, final int i_2_) {
		int i_3_;
		try {
			if ((0x8 & Class114.tileSettings[i_0_][i_2_][i]) != 0) {
				return 0;
			}
			if (i_0_ > 0 && (0x2 & Class114.tileSettings[1][i_2_][i]) != 0) {
				return -1 + i_0_;
			}
			i_3_ = i_0_;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("ui.A(").append(i).append(',').append(i_0_).append(',').append(i_1_).append(',').append(i_2_).append(')').toString());
		}
		return i_3_;
	}

	static final String method2243() {
		String string_4_;
		if (Light.objSelected == 1 && Class186.menuOptionCount < 2) {
			string_4_ = new StringBuilder(AbstractGraphicsBuffer.aString1176).append(Class29.aString196).append(Class192.selectedObjName).append(" ->").toString();
		} else if (Class88.spellSelected && Class186.menuOptionCount < 2) {
			string_4_ = new StringBuilder(Class101.aString963).append(Class29.aString196).append(Light.aString369).append(" ->").toString();
		} else if (!Class120_Sub14_Sub4.aBoolean3470 || !NodeCache.aBooleanArray299[81] || Class186.menuOptionCount <= 2) {
			string_4_ = Class121.getMenuOptionName(-1 + Class186.menuOptionCount);
		} else {
			string_4_ = Class121.getMenuOptionName(Class186.menuOptionCount + -2);
		}
		if (Class186.menuOptionCount > 2) {
			string_4_ = new StringBuilder(string_4_).append("<col=ffffff> / ").append(-2 + Class186.menuOptionCount).append(Class120_Sub11.aString2553).toString();
		}
		return string_4_;
	}

	static final void method2244(final Class120_Sub14_Sub5 class120_sub14_sub5, final Class73 class73) {
		final LDIndexedSprite class107_sub1 = class73.constructSprite();
		if (class107_sub1 != null) {
			int i_5_ = class107_sub1.width;
			if (class107_sub1.height > class107_sub1.width) {
				i_5_ = class107_sub1.height;
			}
			int i_6_ = class120_sub14_sub5.anInt3478;
			int i_7_ = class120_sub14_sub5.anInt3475;
			int i_8_ = 0;
			int i_9_ = 0;
			int i_10_ = 0;
			if (class73.aString649 != null) {
				i_8_ = ObjectCache.smallFont.method1486(class73.aString649, null, Class125.aStringArray2148);
				for (int i_11_ = 0; i_11_ < i_8_; i_11_++) {
					String string = Class125.aStringArray2148[i_11_];
					if (i_8_ - 1 > i_11_) {
						string = string.substring(0, -4 + string.length());
					}
					final int i_12_ = Class112.aClass98_1070.method811(string);
					if (i_9_ < i_12_) {
						i_9_ = i_12_;
					}
				}
				i_10_ = (i_8_ + -1) * Class112.aClass98_1070.method817() + Class112.aClass98_1070.method813() / 2;
			}
			int i_13_ = class120_sub14_sub5.anInt3478;
			if (Class79.anInt708 + i_5_ <= i_6_) {
				if (-i_5_ + Class79.anInt709 < i_6_) {
					i_13_ = -5 + -i_5_ + Class79.anInt709 - i_5_ / 2 - i_9_ / 2;
					i_6_ = Class79.anInt709 - i_5_;
				}
			} else {
				i_6_ = i_5_ + Class79.anInt708;
				i_13_ = 5 + i_9_ / 2 + i_5_ / 2 + Class79.anInt708 - -i_5_;
			}
			int i_14_ = class120_sub14_sub5.anInt3475 - i_10_ / 2;
			if (i_7_ >= i_5_ + Class79.anInt705) {
				if (-i_5_ + Class79.anInt712 < i_7_) {
					i_14_ = -i_5_ + Class79.anInt712 - (i_5_ / 2 + i_10_);
					i_7_ = Class79.anInt712 - i_5_;
				}
			} else {
				i_7_ = Class79.anInt705 + i_5_;
				i_14_ = i_5_ / 2 + i_5_ + Class79.anInt705 - -Class112.aClass98_1070.method817();
			}
			int i_15_ = -2;
			int i_16_ = -2;
			i_5_ >>= 1;
			int i_17_ = -2;
			final int i_18_ = (int) (Math.atan2(i_6_ - class120_sub14_sub5.anInt3478, -class120_sub14_sub5.anInt3475 + i_7_) / 3.141592653589793 * 32767.0) & 0xffff;
			int i_19_ = -2;
			class107_sub1.method917(class107_sub1.trimWidth << 3, class107_sub1.trimHeight << 3, i_5_ + (i_6_ << 4), i_5_ + (i_7_ << 4), i_18_, 4096);
			if (class73.aString649 != null) {
				i_16_ = i_14_ - Class112.aClass98_1070.method813() - 3;
				i_15_ = i_13_ + -(i_9_ / 2) - 5;
				i_19_ = i_8_ * Class112.aClass98_1070.method817() + i_16_;
				i_17_ = i_9_ + i_15_ + 10;
				if (class73.anInt640 != 0) {
					GraphicsLD.fillRect(i_15_, i_16_, -i_15_ + i_17_, -i_16_ + i_19_, class73.anInt640, class73.anInt640 >>> 24);
				}
				if (class73.anInt648 != 0) {
					GraphicsLD.drawRect(i_15_, i_16_, -i_15_ + i_17_, -i_16_ + i_19_, class73.anInt648, class73.anInt648 >>> 24);
				}
				for (int i_20_ = 0; i_8_ > i_20_; i_20_++) {
					String string = Class125.aStringArray2148[i_20_];
					if (i_20_ < i_8_ - 1) {
						string = string.substring(0, -4 + string.length());
					}
					Class112.aClass98_1070.method815(string, i_13_, i_14_, class73.anInt655, true);
					i_14_ += Class112.aClass98_1070.method817();
				}
			}
			if (Queue.lastMouseX > -i_5_ + i_6_ && i_6_ - -i_5_ > Queue.lastMouseX && Class191.lastMouseY > -i_5_ + i_7_ && Class191.lastMouseY < i_7_ - -i_5_ || Queue.lastMouseX > i_15_ && i_17_ > Queue.lastMouseX && i_16_ < Class191.lastMouseY && Class191.lastMouseY < i_19_) {
				if (class73.aStringArray646[4] != null) {
					InvType.addMenuOption(class73.aStringArray646[4], class73.aString645, class120_sub14_sub5.anInt3473, 0, 0, (short) 1011, -1);
				}
				if (class73.aStringArray646[3] != null) {
					InvType.addMenuOption(class73.aStringArray646[3], class73.aString645, class120_sub14_sub5.anInt3473, 0, 0, (short) 1003, -1);
				}
				if (class73.aStringArray646[2] != null) {
					InvType.addMenuOption(class73.aStringArray646[2], class73.aString645, class120_sub14_sub5.anInt3473, 0, 0, (short) 1008, -1);
				}
				if (class73.aStringArray646[1] != null) {
					InvType.addMenuOption(class73.aStringArray646[1], class73.aString645, class120_sub14_sub5.anInt3473, 0, 0, (short) 1002, -1);
				}
				if (class73.aStringArray646[0] != null) {
					InvType.addMenuOption(class73.aStringArray646[0], class73.aString645, class120_sub14_sub5.anInt3473, 0, 0, (short) 1012, -1);
				}
			}
		}
	}

	public SubScript() {
		/* empty */
	}

	public static void method2245(final byte i) {
		try {
			aShortArrayArray1764 = null;
			aString1766 = null;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("ui.E(").append(i).append(')').toString());
		}
	}

	static final int method2246(final int i, final int i_21_, final int i_22_, final int i_23_) {
		int i_24_;
		try {
			final int i_25_ = i_22_ / i_23_;
			if (i_21_ != 0) {
				method2244(null, null);
			}
			final int i_26_ = i_23_ + -1 & i_22_;
			final int i_27_ = i / i_23_;
			final int i_28_ = i_23_ + -1 & i;
			final int i_29_ = InterfaceListener.method1172((byte) -75, i_27_, i_25_);
			final int i_30_ = InterfaceListener.method1172((byte) -67, i_27_, 1 + i_25_);
			final int i_31_ = InterfaceListener.method1172((byte) -71, i_27_ + 1, i_25_);
			final int i_32_ = InterfaceListener.method1172((byte) -72, 1 + i_27_, i_25_ + 1);
			final int i_33_ = Class24.method208(i_23_, i_30_, i_29_, i_26_, true);
			final int i_34_ = Class24.method208(i_23_, i_32_, i_31_, i_26_, true);
			i_24_ = Class24.method208(i_23_, i_34_, i_33_, i_28_, true);
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("ui.B(").append(i).append(',').append(i_21_).append(',').append(i_22_).append(',').append(i_23_).append(')').toString());
		}
		return i_24_;
	}
}
