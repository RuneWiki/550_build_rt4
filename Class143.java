/* Class143 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Class143 implements Interface3 {
	private final js5 aClass50_2184;
	static volatile long lastCanvasReplace = 0L;
	private final Class114[] aClass114Array2186;
	private final js5 aClass50_2187;
	private final NodeCache aClass35_2189 = new NodeCache(256);

	@Override
	public final int[] method6(final int i, final float f, final int i_0_, final int i_1_, final boolean bool) {
		return method2016(i_0_).method1533(f, aClass114Array2186[i_0_].aBoolean1107, aClass50_2187, this, i, bool, i_1_);
	}

	static final void method2013(final int i, final int i_3_, final int i_4_, final int i_5_, final int i_6_, final boolean bool, final int i_7_, final int i_9_, final int i_10_, final int i_11_) {
		for (int i_12_ = 0; i_12_ < 104; i_12_++) {
			for (int i_13_ = 0; i_13_ < 104; i_13_++) {
				Class179.anIntArrayArray1774[i_12_][i_13_] = 0;
				Class120_Sub2.anIntArrayArray2416[i_12_][i_13_] = 99999999;
			}
		}
		int i_14_ = i_4_;
		Class179.anIntArrayArray1774[i_6_][i_4_] = 99;
		Class120_Sub2.anIntArrayArray2416[i_6_][i_4_] = 0;
		int i_15_ = i_6_;
		int i_16_ = 0;
		int i_17_ = 0;
		boolean bool_18_ = false;
		Class150.anIntArray1412[i_17_] = i_6_;
		Class120_Sub12.anIntArray2565[i_17_++] = i_4_;
		final int[][] is = WallLocation.collisionMaps[Class173.gameLevel].collisionFlags;
		while (i_17_ != i_16_) {
			i_15_ = Class150.anIntArray1412[i_16_];
			i_14_ = Class120_Sub12.anIntArray2565[i_16_];
			i_16_ = 0xfff & i_16_ + 1;
			if (i == i_15_ && i_14_ == i_7_) {
				bool_18_ = true;
				break;
			}
			if (i_5_ != 0) {
				if ((i_5_ < 5 || i_5_ == 10) && WallLocation.collisionMaps[Class173.gameLevel].method220(i_7_, i_9_, i_14_, i_15_, i, 2, i_5_ + -1)) {
					bool_18_ = true;
					break;
				}
				if (i_5_ < 10 && WallLocation.collisionMaps[Class173.gameLevel].method223(i, i_15_, i_7_, i_14_, i_5_ - 1, i_9_, 2)) {
					bool_18_ = true;
					break;
				}
			}
			if (i_3_ != 0 && i_11_ != 0 && WallLocation.collisionMaps[Class173.gameLevel].method216(i_14_, -1, i_10_, 2, i_7_, i, i_11_, i_3_, i_15_)) {
				bool_18_ = true;
				break;
			}
			final int i_19_ = 1 + Class120_Sub2.anIntArrayArray2416[i_15_][i_14_];
			if (i_15_ > 0 && Class179.anIntArrayArray1774[i_15_ - 1][i_14_] == 0 && (is[i_15_ + -1][i_14_] & 0x2c010e) == 0 && (0x2c0138 & is[i_15_ - 1][i_14_ - -1]) == 0) {
				Class150.anIntArray1412[i_17_] = i_15_ - 1;
				Class120_Sub12.anIntArray2565[i_17_] = i_14_;
				Class179.anIntArrayArray1774[i_15_ - 1][i_14_] = 2;
				Class120_Sub2.anIntArrayArray2416[i_15_ - 1][i_14_] = i_19_;
				i_17_ = 0xfff & 1 + i_17_;
			}
			if (i_15_ < 102 && Class179.anIntArrayArray1774[1 + i_15_][i_14_] == 0 && (is[2 + i_15_][i_14_] & 0x2c0183) == 0 && (is[i_15_ - -2][1 + i_14_] & 0x2c01e0) == 0) {
				Class150.anIntArray1412[i_17_] = i_15_ - -1;
				Class120_Sub12.anIntArray2565[i_17_] = i_14_;
				Class179.anIntArrayArray1774[i_15_ + 1][i_14_] = 8;
				i_17_ = 0xfff & 1 + i_17_;
				Class120_Sub2.anIntArrayArray2416[i_15_ - -1][i_14_] = i_19_;
			}
			if (i_14_ > 0 && Class179.anIntArrayArray1774[i_15_][-1 + i_14_] == 0 && (0x2c010e & is[i_15_][-1 + i_14_]) == 0 && (0x2c0183 & is[i_15_ - -1][-1 + i_14_]) == 0) {
				Class150.anIntArray1412[i_17_] = i_15_;
				Class120_Sub12.anIntArray2565[i_17_] = -1 + i_14_;
				Class179.anIntArrayArray1774[i_15_][-1 + i_14_] = 1;
				i_17_ = i_17_ - -1 & 0xfff;
				Class120_Sub2.anIntArrayArray2416[i_15_][i_14_ - 1] = i_19_;
			}
			if (i_14_ < 102 && Class179.anIntArrayArray1774[i_15_][i_14_ + 1] == 0 && (is[i_15_][i_14_ + 2] & 0x2c0138) == 0 && (is[1 + i_15_][2 + i_14_] & 0x2c01e0) == 0) {
				Class150.anIntArray1412[i_17_] = i_15_;
				Class120_Sub12.anIntArray2565[i_17_] = 1 + i_14_;
				i_17_ = 0xfff & i_17_ + 1;
				Class179.anIntArrayArray1774[i_15_][i_14_ + 1] = 4;
				Class120_Sub2.anIntArrayArray2416[i_15_][i_14_ + 1] = i_19_;
			}
			if (i_15_ > 0 && i_14_ > 0 && Class179.anIntArrayArray1774[-1 + i_15_][i_14_ + -1] == 0 && (0x2c013e & is[-1 + i_15_][i_14_]) == 0 && (is[-1 + i_15_][-1 + i_14_] & 0x2c010e) == 0 && (is[i_15_][-1 + i_14_] & 0x2c018f) == 0) {
				Class150.anIntArray1412[i_17_] = -1 + i_15_;
				Class120_Sub12.anIntArray2565[i_17_] = i_14_ + -1;
				i_17_ = 0xfff & i_17_ - -1;
				Class179.anIntArrayArray1774[i_15_ - 1][-1 + i_14_] = 3;
				Class120_Sub2.anIntArrayArray2416[-1 + i_15_][i_14_ + -1] = i_19_;
			}
			if (i_15_ < 102 && i_14_ > 0 && Class179.anIntArrayArray1774[i_15_ + 1][-1 + i_14_] == 0 && (0x2c018f & is[1 + i_15_][i_14_ - 1]) == 0 && (0x2c0183 & is[i_15_ - -2][i_14_ - 1]) == 0 && (is[2 + i_15_][i_14_] & 0x2c01e3) == 0) {
				Class150.anIntArray1412[i_17_] = 1 + i_15_;
				Class120_Sub12.anIntArray2565[i_17_] = -1 + i_14_;
				i_17_ = 1 + i_17_ & 0xfff;
				Class179.anIntArrayArray1774[1 + i_15_][-1 + i_14_] = 9;
				Class120_Sub2.anIntArrayArray2416[i_15_ + 1][i_14_ - 1] = i_19_;
			}
			if (i_15_ > 0 && i_14_ < 102 && Class179.anIntArrayArray1774[-1 + i_15_][i_14_ + 1] == 0 && (0x2c013e & is[i_15_ - 1][1 + i_14_]) == 0 && (0x2c0138 & is[-1 + i_15_][i_14_ - -2]) == 0 && (0x2c01f8 & is[i_15_][i_14_ + 2]) == 0) {
				Class150.anIntArray1412[i_17_] = -1 + i_15_;
				Class120_Sub12.anIntArray2565[i_17_] = i_14_ + 1;
				i_17_ = 0xfff & 1 + i_17_;
				Class179.anIntArrayArray1774[-1 + i_15_][i_14_ - -1] = 6;
				Class120_Sub2.anIntArrayArray2416[-1 + i_15_][i_14_ - -1] = i_19_;
			}
			if (i_15_ < 102 && i_14_ < 102 && Class179.anIntArrayArray1774[1 + i_15_][i_14_ + 1] == 0 && (0x2c01f8 & is[1 + i_15_][2 + i_14_]) == 0 && (is[2 + i_15_][i_14_ + 2] & 0x2c01e0) == 0 && (0x2c01e3 & is[i_15_ - -2][i_14_ + 1]) == 0) {
				Class150.anIntArray1412[i_17_] = 1 + i_15_;
				Class120_Sub12.anIntArray2565[i_17_] = i_14_ + 1;
				i_17_ = 0xfff & i_17_ - -1;
				Class179.anIntArrayArray1774[1 + i_15_][i_14_ + 1] = 12;
				Class120_Sub2.anIntArrayArray2416[1 + i_15_][i_14_ + 1] = i_19_;
			}
		}
		if (!bool_18_) {
			if (!bool) {
				return;
			}
			int i_20_ = 1000;
			int i_21_ = 100;
			for (int i_23_ = i - 10; i_23_ <= 10 + i; i_23_++) {
				for (int i_24_ = -10 + i_7_; i_7_ + 10 >= i_24_; i_24_++) {
					if (i_23_ >= 0 && i_24_ >= 0 && i_23_ < 104 && i_24_ < 104 && Class120_Sub2.anIntArrayArray2416[i_23_][i_24_] < 100) {
						int i_25_ = 0;
						int i_26_ = 0;
						if (i <= i_23_) {
							if (i_3_ + i + -1 < i_23_) {
								i_25_ = i_23_ - (i_3_ + i - 1);
							}
						} else {
							i_25_ = i + -i_23_;
						}
						if (i_24_ >= i_7_) {
							if (i_24_ > i_11_ + i_7_ + -1) {
								i_26_ = i_24_ + 1 + -i_11_ + -i_7_;
							}
						} else {
							i_26_ = i_7_ + -i_24_;
						}
						final int i_27_ = i_25_ * i_25_ + i_26_ * i_26_;
						if (i_20_ > i_27_ || i_27_ == i_20_ && i_21_ > Class120_Sub2.anIntArrayArray2416[i_23_][i_24_]) {
							i_21_ = Class120_Sub2.anIntArrayArray2416[i_23_][i_24_];
							i_14_ = i_24_;
							i_15_ = i_23_;
							i_20_ = i_27_;
						}
					}
				}
			}
			if (i_20_ == 1000 || i_6_ == i_15_ && i_4_ == i_14_) {
				return;
			}
		}
		SceneGroundObject.packetSetFlagPosition = false;
		Class120_Sub12_Sub26.flagX = i_15_;
		Class65.flagY = i_14_;
	}

	static final void setParams(final String params) {
		Class120_Sub12_Sub25.params = params;
		if (NpcType.gameSignlink.gameApplet != null) {
			try {
				final String cookiePrefix = NpcType.gameSignlink.gameApplet.getParameter("cookieprefix");
				final String cookieHost = NpcType.gameSignlink.gameApplet.getParameter("cookiehost");
				String string_30_ = cookiePrefix + "settings=" + params + "; version=1; path=/; domain=" + cookieHost;
				if (params.length() == 0) {
					string_30_ = string_30_ + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
				} else {
					string_30_ = string_30_ + "; Expires=" + (MagnetType.formatDate(94608000000L + TimeUtil.getSafeTime())) + "; Max-Age=" + 94608000L;
				}
				JSHelper.eval("document.cookie=\"" + string_30_ + "\"", NpcType.gameSignlink.gameApplet);
			} catch (final Throwable throwable) {
				/* empty */
			}
		}
	}

	Class120_Sub14_Sub13 method2016(final int i) {
		final NodeSub class120_sub14 = aClass35_2189.get(i);
		if (class120_sub14 != null) {
			return (Class120_Sub14_Sub13) class120_sub14;
		}
		final byte[] is = aClass50_2184.getFileSmart(i);
		if (is == null) {
			return null;
		}
		final Class120_Sub14_Sub13 class120_sub14_sub13_31_ = new Class120_Sub14_Sub13(new Buffer(is));
		aClass35_2189.put(class120_sub14_sub13_31_, i);
		return class120_sub14_sub13_31_;
	}

	@Override
	public final boolean method7(final int i) {
		final Class120_Sub14_Sub13 class120_sub14_sub13 = method2016(i);
		return class120_sub14_sub13 != null && class120_sub14_sub13.method1529(this, aClass50_2187);
	}

	@Override
	public final Class114 method8(final int i) {
		return aClass114Array2186[i];
	}

	static final boolean method2019(final char c) {
		if (c > 0 && c < 128 || c >= 160 && c <= 255) {
			return true;
		}
		if (c != 0) {
			final char[] cs = Class120_Sub12_Sub32.aCharArray3385;
			for (int i_34_ = 0; i_34_ < cs.length; i_34_++) {
				final int i_35_ = cs[i_34_];
				if (c == i_35_) {
					return true;
				}
			}
		}
		return false;
	}

	Class143(final js5 js5, final js5 class50_36_, final js5 class50_37_) {
		aClass50_2184 = class50_36_;
		aClass50_2187 = class50_37_;
		final Buffer class120_sub7 = new Buffer(js5.getFile(0, 0));
		final int i = class120_sub7.getUShort();
		aClass114Array2186 = new Class114[i];
		for (int i_38_ = 0; i > i_38_; i_38_++) {
			if (class120_sub7.getUByte() == 1) {
				aClass114Array2186[i_38_] = new Class114();
			}
		}
		for (int i_39_ = 0; i > i_39_; i_39_++) {
			if (aClass114Array2186[i_39_] != null) {
				aClass114Array2186[i_39_].aBoolean1108 = class120_sub7.getUByte() == 0;
			}
		}
		for (int i_40_ = 0; i_40_ < i; i_40_++) {
			if (aClass114Array2186[i_40_] != null) {
				aClass114Array2186[i_40_].aBoolean1101 = class120_sub7.getUByte() == 1;
			}
		}
		for (int i_41_ = 0; i > i_41_; i_41_++) {
			if (aClass114Array2186[i_41_] != null) {
				aClass114Array2186[i_41_].aBoolean1100 = class120_sub7.getUByte() == 1;
			}
		}
		for (int i_42_ = 0; i > i_42_; i_42_++) {
			if (aClass114Array2186[i_42_] != null) {
				aClass114Array2186[i_42_].aBoolean1096 = class120_sub7.getUByte() == 1;
			}
		}
		for (int i_43_ = 0; i > i_43_; i_43_++) {
			if (aClass114Array2186[i_43_] != null) {
				aClass114Array2186[i_43_].aByte1105 = class120_sub7.getByte();
			}
		}
		for (int i_44_ = 0; i_44_ < i; i_44_++) {
			if (aClass114Array2186[i_44_] != null) {
				aClass114Array2186[i_44_].aByte1102 = class120_sub7.getByte();
			}
		}
		for (int i_45_ = 0; i > i_45_; i_45_++) {
			if (aClass114Array2186[i_45_] != null) {
				aClass114Array2186[i_45_].aByte1103 = class120_sub7.getByte();
			}
		}
		for (int i_46_ = 0; i > i_46_; i_46_++) {
			if (aClass114Array2186[i_46_] != null) {
				aClass114Array2186[i_46_].aByte1104 = class120_sub7.getByte();
			}
		}
		for (int i_47_ = 0; i_47_ < i; i_47_++) {
			if (aClass114Array2186[i_47_] != null) {
				aClass114Array2186[i_47_].aShort1106 = (short) class120_sub7.getUShort();
			}
		}
		if (class120_sub7.pos < class120_sub7.buf.length) {
			for (int i_48_ = 0; i_48_ < i; i_48_++) {
				if (aClass114Array2186[i_48_] != null) {
					class120_sub7.getByte();
				}
			}
			for (int i_49_ = 0; i_49_ < i; i_49_++) {
				if (aClass114Array2186[i_49_] != null) {
					class120_sub7.getByte();
				}
			}
			for (int i_50_ = 0; i_50_ < i; i_50_++) {
				if (aClass114Array2186[i_50_] != null) {
					class120_sub7.getUByte();
				}
			}
			for (int i_51_ = 0; i_51_ < i; i_51_++) {
				if (aClass114Array2186[i_51_] != null) {
					aClass114Array2186[i_51_].aBoolean1107 = class120_sub7.getUByte() == 1;
				}
			}
			for (int i_52_ = 0; i_52_ < i; i_52_++) {
				if (aClass114Array2186[i_52_] != null) {
					class120_sub7.getByte();
				}
			}
			for (int i_53_ = 0; i_53_ < i; i_53_++) {
				if (aClass114Array2186[i_53_] != null) {
					class120_sub7.getUByte();
				}
			}
			for (int i_54_ = 0; i_54_ < i; i_54_++) {
				if (aClass114Array2186[i_54_] != null) {
					class120_sub7.getUByte();
				}
			}
			for (int i_55_ = 0; i_55_ < i; i_55_++) {
				if (aClass114Array2186[i_55_] != null) {
					class120_sub7.getUByte();
				}
			}
		}
	}
}
