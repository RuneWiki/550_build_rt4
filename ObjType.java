/* Class162 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class ObjType {
	int anInt1509 = -1;
	private int anInt1510;
	private int anInt1511;
	private int anInt1512;
	private int anInt1513;
	private int anInt1514;
	private byte[] aByteArray1515;
	private int anInt1516;
	static Class50 aClass50_1517;
	private int anInt1518;
	int anInt1519 = 0;
	static int[] anIntArray1520 = { 0, 1, 2, 3, 4, 5, 6, 14 };
	int anInt1521;
	Class75 aClass75_1522;
	private int anInt1523;
	int anInt1524;
	boolean aBoolean1525;
	int anInt1526;
	private int anInt1527;
	int anInt1528;
	int anInt1529;
	int anInt1530;
	private int anInt1531;
	String name;
	private short[] aShortArray1533;
	private int anInt1534;
	private int anInt1535;
	static char aChar1536;
	int anInt1537;
	int[] anIntArray1538;
	private short[] aShortArray1539;
	int anInt1540;
	int anInt1541;
	private int anInt1542;
	private int anInt1543;
	private short[] aShortArray1544;
	int anInt1545;
	int anInt1546;
	private int anInt1547;
	private int anInt1548;
	private int anInt1549;
	int anInt1550;
	static int anInt1551 = 0;
	int anInt1552;
	int anInt1553;
	String[] aStringArray1554;
	boolean aBoolean1555;
	private int anInt1556;
	private int anInt1557;
	int anInt1558;
	private int anInt1559;
	private short[] aShortArray1560;
	int anInt1561;
	int anInt1562;
	int anInt1563;
	String[] aStringArray1564;
	int anInt1565;
	int[] anIntArray1566;

	final void method2102(final Buffer class120_sub7, final byte i) {
		try {
			for (;;) {
				final int i_0_ = class120_sub7.getUByte();
				if (i_0_ == 0) {
					break;
				}
				method2118(i_0_, 42, class120_sub7);
			}
			if (i < 33) {
				method2111(119, null, -21);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("td.O(").append(class120_sub7 != null ? "{...}" : "null").append(',').append(i).append(')').toString());
		}
	}

	final Class180_Sub2 method2103(final boolean bool, final boolean bool_1_) {
		Class180_Sub2 class180_sub2;
		try {
			int i = this.anInt1546;
			int i_2_ = anInt1512;
			if (bool_1_) {
				method2105(-24, -30, 16, 118, null, null, -125);
			}
			int i_3_ = anInt1535;
			if (bool) {
				i_2_ = anInt1534;
				i = this.anInt1553;
				i_3_ = anInt1559;
			}
			if ((i ^ 0xffffffff) == 0) {
				return null;
			}
			Class180_Sub2 class180_sub2_4_ = Class180_Sub2.method2291(Class111.aClass50_1064, i, 0);
			if (i_2_ != -1) {
				final Class180_Sub2 class180_sub2_5_ = Class180_Sub2.method2291(Class111.aClass50_1064, i_2_, 0);
				if (i_3_ == -1) {
					final Class180_Sub2[] class180_sub2s = { class180_sub2_4_, class180_sub2_5_ };
					class180_sub2_4_ = new Class180_Sub2(class180_sub2s, 2);
				} else {
					final Class180_Sub2 class180_sub2_6_ = Class180_Sub2.method2291(Class111.aClass50_1064, i_3_, 0);
					final Class180_Sub2[] class180_sub2s = { class180_sub2_4_, class180_sub2_5_, class180_sub2_6_ };
					class180_sub2_4_ = new Class180_Sub2(class180_sub2s, 3);
				}
			}
			if (!bool && (anInt1548 != 0 || anInt1511 != 0 || anInt1543 != 0)) {
				class180_sub2_4_.method2282(anInt1548, anInt1511, anInt1543);
			}
			if (bool && (anInt1556 != 0 || anInt1514 != 0 || anInt1527 != 0)) {
				class180_sub2_4_.method2282(anInt1556, anInt1514, anInt1527);
			}
			if (aShortArray1544 != null) {
				for (int i_7_ = 0; i_7_ < aShortArray1544.length; i_7_++) {
					class180_sub2_4_.method2307(aShortArray1544[i_7_], aShortArray1533[i_7_]);
				}
			}
			if (aShortArray1539 != null) {
				for (int i_8_ = 0; i_8_ < aShortArray1539.length; i_8_++) {
					class180_sub2_4_.method2292(aShortArray1539[i_8_], aShortArray1560[i_8_]);
				}
			}
			class180_sub2 = class180_sub2_4_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("td.Q(").append(bool).append(',').append(bool_1_).append(')').toString());
		}
		return class180_sub2;
	}

	final void method2104(final ObjType class162_9_, final ObjType class162_10_, final int i) {
		try {
			this.anInt1565 = class162_9_.anInt1565;
			aByteArray1515 = class162_10_.aByteArray1515;
			aShortArray1533 = class162_10_.aShortArray1533;
			aShortArray1539 = class162_10_.aShortArray1539;
			this.anInt1558 = class162_10_.anInt1558;
			this.anInt1545 = class162_10_.anInt1545;
			this.anInt1528 = class162_10_.anInt1528;
			aShortArray1544 = class162_10_.aShortArray1544;
			if (i == 65536) {
				anInt1518 = class162_10_.anInt1518;
				this.name = class162_9_.name;
				this.anInt1540 = 1;
				this.anInt1526 = class162_10_.anInt1526;
				this.aBoolean1555 = class162_9_.aBoolean1555;
				this.anInt1561 = class162_10_.anInt1561;
				this.anInt1521 = class162_10_.anInt1521;
				aShortArray1560 = class162_10_.aShortArray1560;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("td.B(").append(class162_9_ != null ? "{...}" : "null").append(',').append(class162_10_ != null ? "{...}" : "null").append(',').append(i).append(')').toString());
		}
	}

	final Class180_Sub7 method2105(final int i, final int i_11_, final int i_12_, final int i_13_, final PlayerAppearance playerAppearance, final Class40 class40, final int i_14_) {
		Class180_Sub7 class180_sub7;
		try {
			if (this.anIntArray1566 != null && i_11_ > 1) {
				int i_15_ = -1;
				for (int i_16_ = 0; i_16_ < 10; i_16_++) {
					if (i_11_ >= this.anIntArray1538[i_16_] && this.anIntArray1538[i_16_] != 0) {
						i_15_ = this.anIntArray1566[i_16_];
					}
				}
				if ((i_15_ ^ 0xffffffff) != 0) {
					return ObjType.list(i_15_).method2105(i, 1, 53, i_13_, playerAppearance, class40, i_14_);
				}
			}
			Class180_Sub7 class180_sub7_17_ = (Class180_Sub7) Class33.aClass21_273.method193(this.anInt1529, (byte) 17);
			if (class180_sub7_17_ == null) {
				final Class180_Sub2 class180_sub2 = Class180_Sub2.method2291(Class111.aClass50_1064, anInt1518, 0);
				if (class180_sub2 == null) {
					return null;
				}
				if (aShortArray1544 != null) {
					for (int i_18_ = 0; aShortArray1544.length > i_18_; i_18_++) {
						if (aByteArray1515 == null || i_18_ >= aByteArray1515.length) {
							class180_sub2.method2307(aShortArray1544[i_18_], aShortArray1533[i_18_]);
						} else {
							class180_sub2.method2307(aShortArray1544[i_18_], NodeSub.aShortArray2584[aByteArray1515[i_18_] & 0xff]);
						}
					}
				}
				if (aShortArray1539 != null) {
					for (int i_19_ = 0; i_19_ < aShortArray1539.length; i_19_++) {
						class180_sub2.method2292(aShortArray1539[i_19_], aShortArray1560[i_19_]);
					}
				}
				if (playerAppearance != null) {
					for (int i_20_ = 0; i_20_ < 5; i_20_++) {
						if (playerAppearance.anIntArray1370[i_20_] < Class159.aShortArrayArray1489[i_20_].length) {
							class180_sub2.method2307(Class120_Sub12_Sub37.aShortArray3429[i_20_], Class159.aShortArrayArray1489[i_20_][playerAppearance.anIntArray1370[i_20_]]);
						}
						if (playerAppearance.anIntArray1370[i_20_] < Class120_Sub30_Sub1.aShortArrayArray3668[i_20_].length) {
							class180_sub2.method2307(SpotAnimType.aShortArray994[i_20_], Class120_Sub30_Sub1.aShortArrayArray3668[i_20_][playerAppearance.anIntArray1370[i_20_]]);
						}
					}
				}
				class180_sub7_17_ = class180_sub2.method2300(64 - -anInt1523, anInt1513 + 768, -50, -10, -50);
				if (anInt1557 != 128 || anInt1510 != 128 || anInt1531 != 128) {
					class180_sub7_17_.method2369(anInt1557, anInt1510, anInt1531);
				}
				class180_sub7_17_.haveActions = true;
				if (HDToolkit.glEnabled) {
					((Class180_Sub7_Sub2) class180_sub7_17_).method2432(false, false, false, true, false, false, true);
				}
				Class33.aClass21_273.method185(-128, class180_sub7_17_, this.anInt1529);
			}
			if (class40 != null) {
				class180_sub7_17_ = class40.method323(false, i_14_, i_13_, class180_sub7_17_, i);
			}
			class180_sub7 = class180_sub7_17_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("td.G(").append(i).append(',').append(i_11_).append(',').append(i_12_).append(',').append(i_13_).append(',').append(playerAppearance != null ? "{...}" : "null").append(',').append(class40 != null ? "{...}" : "null")
					.append(',').append(i_14_).append(')').toString());
		}
		return class180_sub7;
	}

	final ObjType method2106(final boolean bool, final int i) {
		ObjType class162_21_;
		try {
			if (!bool) {
				anInt1548 = 115;
			}
			if (this.anIntArray1566 != null && i > 1) {
				int i_22_ = -1;
				for (int i_23_ = 0; i_23_ < 10; i_23_++) {
					if (this.anIntArray1538[i_23_] <= i && this.anIntArray1538[i_23_] != 0) {
						i_22_ = this.anIntArray1566[i_23_];
					}
				}
				if (i_22_ != -1) {
					return ObjType.list(i_22_);
				}
			}
			class162_21_ = this;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("td.J(").append(bool).append(',').append(i).append(')').toString());
		}
		return class162_21_;
	}

	final Class180_Sub2 method2107(final int i, final boolean bool) {
		Class180_Sub2 class180_sub2;
		try {
			if (i != -20152) {
				return null;
			}
			int i_24_ = anInt1516;
			int i_25_ = anInt1542;
			if (bool) {
				i_25_ = anInt1547;
				i_24_ = anInt1549;
			}
			if ((i_25_ ^ 0xffffffff) == 0) {
				return null;
			}
			Class180_Sub2 class180_sub2_26_ = Class180_Sub2.method2291(Class111.aClass50_1064, i_25_, 0);
			if ((i_24_ ^ 0xffffffff) != 0) {
				final Class180_Sub2 class180_sub2_27_ = Class180_Sub2.method2291(Class111.aClass50_1064, i_24_, 0);
				final Class180_Sub2[] class180_sub2s = { class180_sub2_26_, class180_sub2_27_ };
				class180_sub2_26_ = new Class180_Sub2(class180_sub2s, 2);
			}
			if (aShortArray1544 != null) {
				for (int i_28_ = 0; i_28_ < aShortArray1544.length; i_28_++) {
					class180_sub2_26_.method2307(aShortArray1544[i_28_], aShortArray1533[i_28_]);
				}
			}
			if (aShortArray1539 != null) {
				for (int i_29_ = 0; i_29_ < aShortArray1539.length; i_29_++) {
					class180_sub2_26_.method2292(aShortArray1539[i_29_], aShortArray1560[i_29_]);
				}
			}
			class180_sub2 = class180_sub2_26_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("td.C(").append(i).append(',').append(bool).append(')').toString());
		}
		return class180_sub2;
	}

	static final Class186 method2108(final int i, final int i_30_, final int i_31_) {
		final Class120_Sub18 class120_sub18 = Class120_Sub1.aClass120_Sub18ArrayArrayArray2411[i][i_30_][i_31_];
		if (class120_sub18 == null) {
			return null;
		}
		return class120_sub18.aClass186_2639;
	}

	final void method2109(final int i) {
		/* empty */
	}

	final boolean method2110(final byte i, final boolean bool) {
		boolean bool_32_;
		try {
			if (i < 71) {
				return false;
			}
			int i_33_ = anInt1512;
			int i_34_ = anInt1535;
			int i_35_ = this.anInt1546;
			if (bool) {
				i_34_ = anInt1559;
				i_33_ = anInt1534;
				i_35_ = this.anInt1553;
			}
			if ((i_35_ ^ 0xffffffff) == 0) {
				return true;
			}
			boolean bool_36_ = true;
			if (!Class111.aClass50_1064.method440(i_35_, true, 0)) {
				bool_36_ = false;
			}
			if ((i_33_ ^ 0xffffffff) != 0 && !Class111.aClass50_1064.method440(i_33_, true, 0)) {
				bool_36_ = false;
			}
			if ((i_34_ ^ 0xffffffff) != 0 && !Class111.aClass50_1064.method440(i_34_, true, 0)) {
				bool_36_ = false;
			}
			bool_32_ = bool_36_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("td.F(").append(i).append(',').append(bool).append(')').toString());
		}
		return bool_32_;
	}

	final String method2111(final int i, final String string, final int i_37_) {
		String string_38_;
		try {
			if (this.aClass75_1522 == null) {
				return string;
			}
			if (i != 0) {
				method2119(-28);
			}
			final StringNode class120_sub25 = (StringNode) this.aClass75_1522.method659(i_37_, -122);
			if (class120_sub25 == null) {
				return string;
			}
			string_38_ = class120_sub25.value;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("td.H(").append(i).append(',').append(string != null ? "{...}" : "null").append(',').append(i_37_).append(')').toString());
		}
		return string_38_;
	}

	final void method2112(final int i, final ObjType class162_39_, final ObjType class162_40_) {
		try {
			this.anInt1553 = class162_39_.anInt1553;
			anInt1516 = class162_39_.anInt1516;
			anInt1542 = class162_39_.anInt1542;
			anInt1534 = class162_39_.anInt1534;
			anInt1535 = class162_39_.anInt1535;
			this.anInt1528 = class162_40_.anInt1528;
			anInt1514 = class162_39_.anInt1514;
			anInt1512 = class162_39_.anInt1512;
			this.aClass75_1522 = class162_39_.aClass75_1522;
			aShortArray1544 = class162_39_.aShortArray1544;
			this.anInt1526 = class162_40_.anInt1526;
			anInt1549 = class162_39_.anInt1549;
			anInt1511 = class162_39_.anInt1511;
			anInt1543 = class162_39_.anInt1543;
			this.anInt1562 = class162_39_.anInt1562;
			this.anInt1558 = class162_40_.anInt1558;
			anInt1548 = class162_39_.anInt1548;
			anInt1518 = class162_40_.anInt1518;
			this.aStringArray1554 = new String[5];
			this.aBoolean1555 = class162_39_.aBoolean1555;
			aShortArray1533 = class162_39_.aShortArray1533;
			anInt1527 = class162_39_.anInt1527;
			this.anInt1561 = class162_40_.anInt1561;
			aShortArray1560 = class162_39_.aShortArray1560;
			this.anInt1545 = class162_40_.anInt1545;
			this.anInt1546 = class162_39_.anInt1546;
			aShortArray1539 = class162_39_.aShortArray1539;
			anInt1556 = class162_39_.anInt1556;
			anInt1547 = class162_39_.anInt1547;
			this.anInt1521 = class162_40_.anInt1521;
			anInt1559 = class162_39_.anInt1559;
			this.aStringArray1564 = class162_39_.aStringArray1564;
			this.name = class162_39_.name;
			this.anInt1565 = 0;
			aByteArray1515 = class162_39_.aByteArray1515;
			if (class162_39_.aStringArray1554 != null) {
				for (int i_41_ = 0; i_41_ < 4; i_41_++) {
					this.aStringArray1554[i_41_] = class162_39_.aStringArray1554[i_41_];
				}
			}
			this.aStringArray1554[4] = Class8.aString64;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("td.N(").append(i).append(',').append(class162_39_ != null ? "{...}" : "null").append(',').append(class162_40_ != null ? "{...}" : "null").append(')').toString());
		}
	}

	static final boolean method2113(final Class50 class50, final int i, final int i_42_) {
		boolean bool;
		try {
			if (i != -5) {
				return true;
			}
			final byte[] is = class50.method413(i_42_, true);
			if (is == null) {
				return false;
			}
			Class140.decodeSprites(is);
			bool = true;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("td.R(").append(class50 != null ? "{...}" : "null").append(',').append(i).append(',').append(i_42_).append(')').toString());
		}
		return bool;
	}

	static final void method2114(final boolean bool, final int i) {
		try {
			if (!Class69_Sub2.aBoolean2234 == bool) {
				if (i != -10) {
					method2113(null, 65, 1);
				}
				Class69_Sub2.aBoolean2234 = bool;
				Class120_Sub12_Sub25.method1334(-111);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("td.A(").append(bool).append(',').append(i).append(')').toString());
		}
	}

	final int method2115(final int i, final int i_43_, final int i_44_) {
		int i_45_;
		try {
			if (i_43_ != 0) {
				method2110((byte) -52, true);
			}
			if (this.aClass75_1522 == null) {
				return i_44_;
			}
			final Class120_Sub32 class120_sub32 = (Class120_Sub32) this.aClass75_1522.method659(i, i_43_ ^ 0x4c);
			if (class120_sub32 == null) {
				return i_44_;
			}
			i_45_ = class120_sub32.anInt2790;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("td.L(").append(i).append(',').append(i_43_).append(',').append(i_44_).append(')').toString());
		}
		return i_45_;
	}

	final boolean method2116(final boolean bool, final int i) {
		boolean bool_46_;
		try {
			int i_47_ = anInt1542;
			int i_48_ = anInt1516;
			if (bool) {
				i_47_ = anInt1547;
				i_48_ = anInt1549;
			}
			if (i_47_ == -1) {
				return true;
			}
			boolean bool_49_ = true;
			if (!Class111.aClass50_1064.method440(i_47_, true, i)) {
				bool_49_ = false;
			}
			if (i_48_ != -1 && !Class111.aClass50_1064.method440(i_48_, true, 0)) {
				bool_49_ = false;
			}
			bool_46_ = bool_49_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("td.M(").append(bool).append(',').append(i).append(')').toString());
		}
		return bool_46_;
	}

	final Class180_Sub7_Sub1 method2117(final PlayerAppearance playerAppearance, final int i) {
		Class180_Sub7_Sub1 class180_sub7_sub1;
		try {
			final Class180_Sub2 class180_sub2 = Class180_Sub2.method2291(Class111.aClass50_1064, anInt1518, 0);
			if (class180_sub2 == null) {
				return null;
			}
			if (aShortArray1544 != null) {
				for (int i_50_ = 0; i_50_ < aShortArray1544.length; i_50_++) {
					if (aByteArray1515 != null && aByteArray1515.length > i_50_) {
						class180_sub2.method2307(aShortArray1544[i_50_], NodeSub.aShortArray2584[0xff & aByteArray1515[i_50_]]);
					} else {
						class180_sub2.method2307(aShortArray1544[i_50_], aShortArray1533[i_50_]);
					}
				}
			}
			if (aShortArray1539 != null) {
				for (int i_51_ = 0; i_51_ < aShortArray1539.length; i_51_++) {
					class180_sub2.method2292(aShortArray1539[i_51_], aShortArray1560[i_51_]);
				}
			}
			if (playerAppearance != null) {
				for (int i_52_ = 0; i_52_ < 5; i_52_++) {
					if (Class159.aShortArrayArray1489[i_52_].length > playerAppearance.anIntArray1370[i_52_]) {
						class180_sub2.method2307(Class120_Sub12_Sub37.aShortArray3429[i_52_], Class159.aShortArrayArray1489[i_52_][playerAppearance.anIntArray1370[i_52_]]);
					}
					if (Class120_Sub30_Sub1.aShortArrayArray3668[i_52_].length > playerAppearance.anIntArray1370[i_52_]) {
						class180_sub2.method2307(SpotAnimType.aShortArray994[i_52_], Class120_Sub30_Sub1.aShortArrayArray3668[i_52_][playerAppearance.anIntArray1370[i_52_]]);
					}
				}
			}
			final Class180_Sub7_Sub1 class180_sub7_sub1_53_ = class180_sub2.method2298(anInt1523 + 64, anInt1513 + 768, -50, -10, -50);
			if (anInt1557 != 128 || anInt1510 != 128 || anInt1531 != 128) {
				class180_sub7_sub1_53_.method2369(anInt1557, anInt1510, anInt1531);
			}
			if (i != 23) {
				return null;
			}
			class180_sub7_sub1 = class180_sub7_sub1_53_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("td.I(").append(playerAppearance != null ? "{...}" : "null").append(',').append(i).append(')').toString());
		}
		return class180_sub7_sub1;
	}

	private final void method2118(final int i, final int i_54_, final Buffer class120_sub7) {
		try {
			if (i == 1) {
				anInt1518 = class120_sub7.getUShort();
			} else if (i != 2) {
				if (i == 4) {
					this.anInt1521 = class120_sub7.getUShort();
				} else if (i == 5) {
					this.anInt1545 = class120_sub7.getUShort();
				} else if (i == 6) {
					this.anInt1558 = class120_sub7.getUShort();
				} else if (i != 7) {
					if (i == 8) {
						this.anInt1561 = class120_sub7.getUShort();
						if (this.anInt1561 > 32767) {
							this.anInt1561 -= 65536;
						}
					} else if (i != 11) {
						if (i == 12) {
							this.anInt1565 = class120_sub7.getInt();
						} else if (i == 16) {
							this.aBoolean1555 = true;
						} else if (i == 23) {
							this.anInt1546 = class120_sub7.getUShort();
						} else if (i != 24) {
							if (i != 25) {
								if (i != 26) {
									if (i < 30 || i >= 35) {
										if (i >= 35 && i < 40) {
											this.aStringArray1554[i + -35] = class120_sub7.getJString();
										} else if (i != 40) {
											if (i == 41) {
												final int i_55_ = class120_sub7.getUByte();
												aShortArray1560 = new short[i_55_];
												aShortArray1539 = new short[i_55_];
												for (int i_56_ = 0; i_56_ < i_55_; i_56_++) {
													aShortArray1539[i_56_] = (short) class120_sub7.getUShort();
													aShortArray1560[i_56_] = (short) class120_sub7.getUShort();
												}
											} else if (i != 42) {
												if (i != 65) {
													if (i == 78) {
														anInt1535 = class120_sub7.getUShort();
													} else if (i != 79) {
														if (i == 90) {
															anInt1542 = class120_sub7.getUShort();
														} else if (i == 91) {
															anInt1547 = class120_sub7.getUShort();
														} else if (i == 92) {
															anInt1516 = class120_sub7.getUShort();
														} else if (i != 93) {
															if (i != 95) {
																if (i != 96) {
																	if (i != 97) {
																		if (i == 98) {
																			this.anInt1552 = class120_sub7.getUShort();
																		} else if (i >= 100 && i < 110) {
																			if (this.anIntArray1566 == null) {
																				this.anIntArray1538 = new int[10];
																				this.anIntArray1566 = new int[10];
																			}
																			this.anIntArray1566[-100 + i] = class120_sub7.getUShort();
																			this.anIntArray1538[-100 + i] = class120_sub7.getUShort();
																		} else if (i == 110) {
																			anInt1557 = class120_sub7.getUShort();
																		} else if (i != 111) {
																			if (i != 112) {
																				if (i == 113) {
																					anInt1523 = class120_sub7.getByte();
																				} else if (i != 114) {
																					if (i != 115) {
																						if (i != 121) {
																							if (i == 122) {
																								this.anInt1541 = class120_sub7.getUShort();
																							} else if (i == 125) {
																								anInt1548 = class120_sub7.getByte();
																								anInt1511 = class120_sub7.getByte();
																								anInt1543 = class120_sub7.getByte();
																							} else if (i == 126) {
																								anInt1556 = class120_sub7.getByte();
																								anInt1514 = class120_sub7.getByte();
																								anInt1527 = class120_sub7.getByte();
																							} else if (i != 127) {
																								if (i == 128) {
																									this.anInt1509 = class120_sub7.getUByte();
																									this.anInt1524 = class120_sub7.getUShort();
																								} else if (i == 129) {
																									class120_sub7.getUByte();
																									class120_sub7.getUShort();
																								} else if (i != 130) {
																									if (i == 249) {
																										final int i_57_ = class120_sub7.getUByte();
																										if (this.aClass75_1522 == null) {
																											final int i_58_ = Class120_Sub12_Sub17.method1283(i_57_, (byte) -99);
																											this.aClass75_1522 = new Class75(i_58_);
																										}
																										for (int i_59_ = 0; i_59_ < i_57_; i_59_++) {
																											final boolean bool = class120_sub7.getUByte() == 1;
																											final int i_60_ = class120_sub7.getTriByte();
																											Node node;
																											if (!bool) {
																												node = new Class120_Sub32(class120_sub7.getInt());
																											} else {
																												node = new StringNode(class120_sub7.getJString());
																											}
																											this.aClass75_1522.method655(node, 104, i_60_);
																										}
																									}
																								} else {
																									class120_sub7.getUByte();
																									class120_sub7.getUShort();
																								}
																							} else {
																								this.anInt1550 = class120_sub7.getUByte();
																								this.anInt1537 = class120_sub7.getUShort();
																							}
																						} else {
																							this.anInt1530 = class120_sub7.getUShort();
																						}
																					} else {
																						this.anInt1562 = class120_sub7.getUByte();
																					}
																				} else {
																					anInt1513 = class120_sub7.getByte() * 5;
																				}
																			} else {
																				anInt1531 = class120_sub7.getUShort();
																			}
																		} else {
																			anInt1510 = class120_sub7.getUShort();
																		}
																	} else {
																		this.anInt1563 = class120_sub7.getUShort();
																	}
																} else {
																	this.anInt1519 = class120_sub7.getUByte();
																}
															} else {
																this.anInt1526 = class120_sub7.getUShort();
															}
														} else {
															anInt1549 = class120_sub7.getUShort();
														}
													} else {
														anInt1559 = class120_sub7.getUShort();
													}
												} else {
													this.aBoolean1525 = true;
												}
											} else {
												final int i_61_ = class120_sub7.getUByte();
												aByteArray1515 = new byte[i_61_];
												for (int i_62_ = 0; i_62_ < i_61_; i_62_++) {
													aByteArray1515[i_62_] = class120_sub7.getByte();
												}
											}
										} else {
											final int i_63_ = class120_sub7.getUByte();
											aShortArray1544 = new short[i_63_];
											aShortArray1533 = new short[i_63_];
											for (int i_64_ = 0; i_63_ > i_64_; i_64_++) {
												aShortArray1544[i_64_] = (short) class120_sub7.getUShort();
												aShortArray1533[i_64_] = (short) class120_sub7.getUShort();
											}
										}
									} else {
										this.aStringArray1564[-30 + i] = class120_sub7.getJString();
										if (this.aStringArray1564[i + -30].equalsIgnoreCase(Class120_Sub12_Sub15.aString3244)) {
											this.aStringArray1564[i + -30] = null;
										}
									}
								} else {
									anInt1534 = class120_sub7.getUShort();
								}
							} else {
								this.anInt1553 = class120_sub7.getUShort();
							}
						} else {
							anInt1512 = class120_sub7.getUShort();
						}
					} else {
						this.anInt1540 = 1;
					}
				} else {
					this.anInt1528 = class120_sub7.getUShort();
					if (this.anInt1528 > 32767) {
						this.anInt1528 -= 65536;
					}
				}
			} else {
				this.name = class120_sub7.getJString();
			}
			if (i_54_ < 37) {
				anInt1551 = 121;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("td.D(").append(i).append(',').append(i_54_).append(',').append(class120_sub7 != null ? "{...}" : "null").append(')').toString());
		}
	}

	static final ObjType list(final int i) {
		ObjType class162_12_ = (ObjType) Canvas_Sub1.aClass21_14.method193(i, (byte) 24);
		if (class162_12_ != null) {
			return class162_12_;
		}
		final byte[] is = Class120_Sub12_Sub23.aClass50_3305.method442(Class20.method177(522353736, i), (byte) 122, Class120_Sub12_Sub33.method1377(123, i));
		class162_12_ = new ObjType();
		class162_12_.anInt1529 = i;
		if (is != null) {
			class162_12_.method2102(new Buffer(is), (byte) 121);
		}
		class162_12_.method2109(104);
		if ((class162_12_.anInt1552 ^ 0xffffffff) != 0) {
			class162_12_.method2104(list(class162_12_.anInt1563), list(class162_12_.anInt1552), 65536);
		}
		if ((class162_12_.anInt1541 ^ 0xffffffff) != 0) {
			class162_12_.method2112(119, list(class162_12_.anInt1530), list(class162_12_.anInt1541));
		}
		if (!Class120_Sub14_Sub3.aBoolean3463 && class162_12_.aBoolean1555) {
			class162_12_.name = InputStream_Sub1.aString25;
			class162_12_.aStringArray1564 = Class120_Sub12_Sub32.aStringArray3387;
			class162_12_.aStringArray1554 = Class120_Sub12_Sub29.aStringArray3363;
			class162_12_.anInt1562 = 0;
			class162_12_.aBoolean1525 = false;
		}
		Canvas_Sub1.aClass21_14.method185(-126, class162_12_, i);
		return class162_12_;
	}

	public static void method2119(final int i) {
		try {
			anIntArray1520 = null;
			aClass50_1517 = null;
			if (i != 2) {
				anInt1551 = -2;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("td.E(").append(i).append(')').toString());
		}
	}

	public ObjType() {
		anInt1516 = -1;
		this.anInt1537 = -1;
		anInt1512 = -1;
		anInt1523 = 0;
		anInt1534 = -1;
		this.anInt1521 = 2000;
		anInt1531 = 128;
		anInt1510 = 128;
		anInt1527 = 0;
		anInt1511 = 0;
		this.anInt1540 = 0;
		this.anInt1528 = 0;
		this.name = "null";
		anInt1513 = 0;
		anInt1542 = -1;
		anInt1547 = -1;
		anInt1549 = -1;
		this.anInt1545 = 0;
		this.anInt1553 = -1;
		this.anInt1530 = -1;
		anInt1535 = -1;
		this.anInt1541 = -1;
		this.anInt1552 = -1;
		anInt1548 = 0;
		anInt1556 = 0;
		anInt1543 = 0;
		this.aBoolean1525 = false;
		this.anInt1563 = -1;
		this.anInt1526 = 0;
		this.anInt1558 = 0;
		this.aStringArray1554 = new String[] { null, null, null, null, Class101_Sub3.aString2285 };
		this.aBoolean1555 = false;
		this.anInt1546 = -1;
		this.anInt1562 = 0;
		this.anInt1561 = 0;
		this.anInt1550 = -1;
		anInt1514 = 0;
		anInt1557 = 128;
		this.anInt1524 = -1;
		this.anInt1565 = 1;
		this.aStringArray1564 = new String[] { null, null, Class120_Sub14_Sub1.aString3449, null, null };
		anInt1559 = -1;
	}
}
