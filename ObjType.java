/* Class162 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class ObjType {
	int cursor2op = -1;
	private int resizey;
	private int manwearyoff;
	private int anInt1512;
	private int contrast;
	private int womanwearyoff;
	private byte[] recol_d_palette;
	private int manhead2;
	static Class50 aClass50_1517;
	private int modelId;
	int dummyitem = 0;
	static int[] anIntArray1520 = { 0, 1, 2, 3, 4, 5, 6, 14 };
	int zoom2d;
	Class75 params;
	private int ambient;
	int cursor2;
	boolean stockmarket;
	int zan2d;
	private int womanwearzoff;
	int xof2d;
	int anInt1529;
	int lentlink;
	private int resizez;
	String name;
	private short[] recol_d;
	private int anInt1534;
	private int anInt1535;
	static char aChar1536;
	int cursor1;
	int[] countco;
	private short[] retex_s;
	int stackable;
	int lenttemplate;
	private int manhead;
	private int manwearzoff;
	private short[] recol_s;
	int xan2d;
	int anInt1546;
	private int womanhead;
	private int manwearxoff;
	private int womanhead2;
	int cursor1op;
	static int anInt1551 = 0;
	int certtemplate;
	int anInt1553;
	String[] inventoryOptions;
	boolean members;
	private int womanwearxoff;
	private int resizex;
	int yan2d;
	private int anInt1559;
	private short[] retex_d;
	int yof2d;
	int team;
	int certlink;
	String[] options;
	int cost;
	int[] countobj;

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
			if (!bool && (manwearxoff != 0 || manwearyoff != 0 || manwearzoff != 0)) {
				class180_sub2_4_.method2282(manwearxoff, manwearyoff, manwearzoff);
			}
			if (bool && (womanwearxoff != 0 || womanwearyoff != 0 || womanwearzoff != 0)) {
				class180_sub2_4_.method2282(womanwearxoff, womanwearyoff, womanwearzoff);
			}
			if (recol_s != null) {
				for (int i_7_ = 0; i_7_ < recol_s.length; i_7_++) {
					class180_sub2_4_.method2307(recol_s[i_7_], recol_d[i_7_]);
				}
			}
			if (retex_s != null) {
				for (int i_8_ = 0; i_8_ < retex_s.length; i_8_++) {
					class180_sub2_4_.method2292(retex_s[i_8_], retex_d[i_8_]);
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
			this.cost = class162_9_.cost;
			recol_d_palette = class162_10_.recol_d_palette;
			recol_d = class162_10_.recol_d;
			retex_s = class162_10_.retex_s;
			this.yan2d = class162_10_.yan2d;
			this.xan2d = class162_10_.xan2d;
			this.xof2d = class162_10_.xof2d;
			recol_s = class162_10_.recol_s;
			if (i == 65536) {
				modelId = class162_10_.modelId;
				this.name = class162_9_.name;
				this.stackable = 1;
				this.zan2d = class162_10_.zan2d;
				this.members = class162_9_.members;
				this.yof2d = class162_10_.yof2d;
				this.zoom2d = class162_10_.zoom2d;
				retex_d = class162_10_.retex_d;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("td.B(").append(class162_9_ != null ? "{...}" : "null").append(',').append(class162_10_ != null ? "{...}" : "null").append(',').append(i).append(')').toString());
		}
	}

	final Class180_Sub7 method2105(final int i, final int i_11_, final int i_12_, final int i_13_, final PlayerAppearance playerAppearance, final Class40 class40, final int i_14_) {
		Class180_Sub7 class180_sub7;
		try {
			if (this.countobj != null && i_11_ > 1) {
				int i_15_ = -1;
				for (int i_16_ = 0; i_16_ < 10; i_16_++) {
					if (i_11_ >= this.countco[i_16_] && this.countco[i_16_] != 0) {
						i_15_ = this.countobj[i_16_];
					}
				}
				if ((i_15_ ^ 0xffffffff) != 0) {
					return ObjType.list(i_15_).method2105(i, 1, 53, i_13_, playerAppearance, class40, i_14_);
				}
			}
			Class180_Sub7 class180_sub7_17_ = (Class180_Sub7) Class33.aClass21_273.method193(this.anInt1529, (byte) 17);
			if (class180_sub7_17_ == null) {
				final Class180_Sub2 class180_sub2 = Class180_Sub2.method2291(Class111.aClass50_1064, modelId, 0);
				if (class180_sub2 == null) {
					return null;
				}
				if (recol_s != null) {
					for (int i_18_ = 0; recol_s.length > i_18_; i_18_++) {
						if (recol_d_palette == null || i_18_ >= recol_d_palette.length) {
							class180_sub2.method2307(recol_s[i_18_], recol_d[i_18_]);
						} else {
							class180_sub2.method2307(recol_s[i_18_], NodeSub.aShortArray2584[recol_d_palette[i_18_] & 0xff]);
						}
					}
				}
				if (retex_s != null) {
					for (int i_19_ = 0; i_19_ < retex_s.length; i_19_++) {
						class180_sub2.method2292(retex_s[i_19_], retex_d[i_19_]);
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
				class180_sub7_17_ = class180_sub2.method2300(64 - -ambient, contrast + 768, -50, -10, -50);
				if (resizex != 128 || resizey != 128 || resizez != 128) {
					class180_sub7_17_.method2369(resizex, resizey, resizez);
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
				manwearxoff = 115;
			}
			if (this.countobj != null && i > 1) {
				int i_22_ = -1;
				for (int i_23_ = 0; i_23_ < 10; i_23_++) {
					if (this.countco[i_23_] <= i && this.countco[i_23_] != 0) {
						i_22_ = this.countobj[i_23_];
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
			int i_24_ = manhead2;
			int i_25_ = manhead;
			if (bool) {
				i_25_ = womanhead;
				i_24_ = womanhead2;
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
			if (recol_s != null) {
				for (int i_28_ = 0; i_28_ < recol_s.length; i_28_++) {
					class180_sub2_26_.method2307(recol_s[i_28_], recol_d[i_28_]);
				}
			}
			if (retex_s != null) {
				for (int i_29_ = 0; i_29_ < retex_s.length; i_29_++) {
					class180_sub2_26_.method2292(retex_s[i_29_], retex_d[i_29_]);
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
			if (this.params == null) {
				return string;
			}
			if (i != 0) {
				method2119(-28);
			}
			final StringNode class120_sub25 = (StringNode) this.params.method659(i_37_, -122);
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
			manhead2 = class162_39_.manhead2;
			manhead = class162_39_.manhead;
			anInt1534 = class162_39_.anInt1534;
			anInt1535 = class162_39_.anInt1535;
			this.xof2d = class162_40_.xof2d;
			womanwearyoff = class162_39_.womanwearyoff;
			anInt1512 = class162_39_.anInt1512;
			this.params = class162_39_.params;
			recol_s = class162_39_.recol_s;
			this.zan2d = class162_40_.zan2d;
			womanhead2 = class162_39_.womanhead2;
			manwearyoff = class162_39_.manwearyoff;
			manwearzoff = class162_39_.manwearzoff;
			this.team = class162_39_.team;
			this.yan2d = class162_40_.yan2d;
			manwearxoff = class162_39_.manwearxoff;
			modelId = class162_40_.modelId;
			this.inventoryOptions = new String[5];
			this.members = class162_39_.members;
			recol_d = class162_39_.recol_d;
			womanwearzoff = class162_39_.womanwearzoff;
			this.yof2d = class162_40_.yof2d;
			retex_d = class162_39_.retex_d;
			this.xan2d = class162_40_.xan2d;
			this.anInt1546 = class162_39_.anInt1546;
			retex_s = class162_39_.retex_s;
			womanwearxoff = class162_39_.womanwearxoff;
			womanhead = class162_39_.womanhead;
			this.zoom2d = class162_40_.zoom2d;
			anInt1559 = class162_39_.anInt1559;
			this.options = class162_39_.options;
			this.name = class162_39_.name;
			this.cost = 0;
			recol_d_palette = class162_39_.recol_d_palette;
			if (class162_39_.inventoryOptions != null) {
				for (int i_41_ = 0; i_41_ < 4; i_41_++) {
					this.inventoryOptions[i_41_] = class162_39_.inventoryOptions[i_41_];
				}
			}
			this.inventoryOptions[4] = Class8.aString64;
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
			if (this.params == null) {
				return i_44_;
			}
			final Class120_Sub32 class120_sub32 = (Class120_Sub32) this.params.method659(i, i_43_ ^ 0x4c);
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
			int i_47_ = manhead;
			int i_48_ = manhead2;
			if (bool) {
				i_47_ = womanhead;
				i_48_ = womanhead2;
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
			final Class180_Sub2 class180_sub2 = Class180_Sub2.method2291(Class111.aClass50_1064, modelId, 0);
			if (class180_sub2 == null) {
				return null;
			}
			if (recol_s != null) {
				for (int i_50_ = 0; i_50_ < recol_s.length; i_50_++) {
					if (recol_d_palette != null && recol_d_palette.length > i_50_) {
						class180_sub2.method2307(recol_s[i_50_], NodeSub.aShortArray2584[0xff & recol_d_palette[i_50_]]);
					} else {
						class180_sub2.method2307(recol_s[i_50_], recol_d[i_50_]);
					}
				}
			}
			if (retex_s != null) {
				for (int i_51_ = 0; i_51_ < retex_s.length; i_51_++) {
					class180_sub2.method2292(retex_s[i_51_], retex_d[i_51_]);
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
			final Class180_Sub7_Sub1 class180_sub7_sub1_53_ = class180_sub2.method2298(ambient + 64, contrast + 768, -50, -10, -50);
			if (resizex != 128 || resizey != 128 || resizez != 128) {
				class180_sub7_sub1_53_.method2369(resizex, resizey, resizez);
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
				modelId = class120_sub7.getUShort();
			} else if (i != 2) {
				if (i == 4) {
					this.zoom2d = class120_sub7.getUShort();
				} else if (i == 5) {
					this.xan2d = class120_sub7.getUShort();
				} else if (i == 6) {
					this.yan2d = class120_sub7.getUShort();
				} else if (i != 7) {
					if (i == 8) {
						this.yof2d = class120_sub7.getUShort();
						if (this.yof2d > 32767) {
							this.yof2d -= 65536;
						}
					} else if (i != 11) {
						if (i == 12) {
							this.cost = class120_sub7.getInt();
						} else if (i == 16) {
							this.members = true;
						} else if (i == 23) {
							this.anInt1546 = class120_sub7.getUShort();
						} else if (i != 24) {
							if (i != 25) {
								if (i != 26) {
									if (i < 30 || i >= 35) {
										if (i >= 35 && i < 40) {
											this.inventoryOptions[i + -35] = class120_sub7.getJString();
										} else if (i != 40) {
											if (i == 41) {
												final int i_55_ = class120_sub7.getUByte();
												retex_d = new short[i_55_];
												retex_s = new short[i_55_];
												for (int i_56_ = 0; i_56_ < i_55_; i_56_++) {
													retex_s[i_56_] = (short) class120_sub7.getUShort();
													retex_d[i_56_] = (short) class120_sub7.getUShort();
												}
											} else if (i != 42) {
												if (i != 65) {
													if (i == 78) {
														anInt1535 = class120_sub7.getUShort();
													} else if (i != 79) {
														if (i == 90) {
															manhead = class120_sub7.getUShort();
														} else if (i == 91) {
															womanhead = class120_sub7.getUShort();
														} else if (i == 92) {
															manhead2 = class120_sub7.getUShort();
														} else if (i != 93) {
															if (i != 95) {
																if (i != 96) {
																	if (i != 97) {
																		if (i == 98) {
																			this.certtemplate = class120_sub7.getUShort();
																		} else if (i >= 100 && i < 110) {
																			if (this.countobj == null) {
																				this.countco = new int[10];
																				this.countobj = new int[10];
																			}
																			this.countobj[-100 + i] = class120_sub7.getUShort();
																			this.countco[-100 + i] = class120_sub7.getUShort();
																		} else if (i == 110) {
																			resizex = class120_sub7.getUShort();
																		} else if (i != 111) {
																			if (i != 112) {
																				if (i == 113) {
																					ambient = class120_sub7.getByte();
																				} else if (i != 114) {
																					if (i != 115) {
																						if (i != 121) {
																							if (i == 122) {
																								this.lenttemplate = class120_sub7.getUShort();
																							} else if (i == 125) {
																								manwearxoff = class120_sub7.getByte();
																								manwearyoff = class120_sub7.getByte();
																								manwearzoff = class120_sub7.getByte();
																							} else if (i == 126) {
																								womanwearxoff = class120_sub7.getByte();
																								womanwearyoff = class120_sub7.getByte();
																								womanwearzoff = class120_sub7.getByte();
																							} else if (i != 127) {
																								if (i == 128) {
																									this.cursor2op = class120_sub7.getUByte();
																									this.cursor2 = class120_sub7.getUShort();
																								} else if (i == 129) {
																									int cursor1iop = class120_sub7.getUByte();
																									int icursor1 = class120_sub7.getUShort();
																								} else if (i != 130) {
																									if (i == 249) {
																										final int i_57_ = class120_sub7.getUByte();
																										if (this.params == null) {
																											final int i_58_ = Class120_Sub12_Sub17.method1283(i_57_, (byte) -99);
																											this.params = new Class75(i_58_);
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
																											this.params.method655(node, 104, i_60_);
																										}
																									}
																								} else {
																									int cursor2iop = class120_sub7.getUByte();
																									int icursor2 = class120_sub7.getUShort();
																								}
																							} else {
																								this.cursor1op = class120_sub7.getUByte();
																								this.cursor1 = class120_sub7.getUShort();
																							}
																						} else {
																							this.lentlink = class120_sub7.getUShort();
																						}
																					} else {
																						this.team = class120_sub7.getUByte();
																					}
																				} else {
																					contrast = class120_sub7.getByte() * 5;
																				}
																			} else {
																				resizez = class120_sub7.getUShort();
																			}
																		} else {
																			resizey = class120_sub7.getUShort();
																		}
																	} else {
																		this.certlink = class120_sub7.getUShort();
																	}
																} else {
																	this.dummyitem = class120_sub7.getUByte();
																}
															} else {
																this.zan2d = class120_sub7.getUShort();
															}
														} else {
															womanhead2 = class120_sub7.getUShort();
														}
													} else {
														anInt1559 = class120_sub7.getUShort();
													}
												} else {
													this.stockmarket = true;
												}
											} else {
												final int i_61_ = class120_sub7.getUByte();
												recol_d_palette = new byte[i_61_];
												for (int i_62_ = 0; i_62_ < i_61_; i_62_++) {
													recol_d_palette[i_62_] = class120_sub7.getByte();
												}
											}
										} else {
											final int i_63_ = class120_sub7.getUByte();
											recol_s = new short[i_63_];
											recol_d = new short[i_63_];
											for (int i_64_ = 0; i_63_ > i_64_; i_64_++) {
												recol_s[i_64_] = (short) class120_sub7.getUShort();
												recol_d[i_64_] = (short) class120_sub7.getUShort();
											}
										}
									} else {
										this.options[-30 + i] = class120_sub7.getJString();
										if (this.options[i + -30].equalsIgnoreCase(Class120_Sub12_Sub15.aString3244)) {
											this.options[i + -30] = null;
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
						this.stackable = 1;
					}
				} else {
					this.xof2d = class120_sub7.getUShort();
					if (this.xof2d > 32767) {
						this.xof2d -= 65536;
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
		if ((class162_12_.certtemplate ^ 0xffffffff) != 0) {
			class162_12_.method2104(list(class162_12_.certlink), list(class162_12_.certtemplate), 65536);
		}
		if ((class162_12_.lenttemplate ^ 0xffffffff) != 0) {
			class162_12_.method2112(119, list(class162_12_.lentlink), list(class162_12_.lenttemplate));
		}
		if (!Class120_Sub14_Sub3.aBoolean3463 && class162_12_.members) {
			class162_12_.name = InputStream_Sub1.aString25;
			class162_12_.options = Class120_Sub12_Sub32.aStringArray3387;
			class162_12_.inventoryOptions = Class120_Sub12_Sub29.aStringArray3363;
			class162_12_.team = 0;
			class162_12_.stockmarket = false;
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
		manhead2 = -1;
		this.cursor1 = -1;
		anInt1512 = -1;
		ambient = 0;
		anInt1534 = -1;
		this.zoom2d = 2000;
		resizez = 128;
		resizey = 128;
		womanwearzoff = 0;
		manwearyoff = 0;
		this.stackable = 0;
		this.xof2d = 0;
		this.name = "null";
		contrast = 0;
		manhead = -1;
		womanhead = -1;
		womanhead2 = -1;
		this.xan2d = 0;
		this.anInt1553 = -1;
		this.lentlink = -1;
		anInt1535 = -1;
		this.lenttemplate = -1;
		this.certtemplate = -1;
		manwearxoff = 0;
		womanwearxoff = 0;
		manwearzoff = 0;
		this.stockmarket = false;
		this.certlink = -1;
		this.zan2d = 0;
		this.yan2d = 0;
		this.inventoryOptions = new String[] { null, null, null, null, Class101_Sub3.aString2285 };
		this.members = false;
		this.anInt1546 = -1;
		this.team = 0;
		this.yof2d = 0;
		this.cursor1op = -1;
		womanwearyoff = 0;
		resizex = 128;
		this.cursor2 = -1;
		this.cost = 1;
		this.options = new String[] { null, null, Class120_Sub14_Sub1.aString3449, null, null };
		anInt1559 = -1;
	}
}
