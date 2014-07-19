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
	private int modelId;
	int dummyitem = 0;
	static int[] anIntArray1520 = { 0, 1, 2, 3, 4, 5, 6, 14 };
	int zoom2d;
	Hashtable params;
	private int ambient;
	int cursor2;
	boolean stockmarket;
	int zan2d;
	private int womanwearzoff;
	int xof2d;
	int myId;
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

	final void decode(final Buffer buffer) {
		for (;;) {
			final int i_0_ = buffer.getUByte();
			if (i_0_ == 0) {
				break;
			}
			decode(buffer, i_0_);
		}
	}

	final Class180_Sub2 method2103(final boolean bool, final boolean bool_1_) {
		Class180_Sub2 class180_sub2;
		try {
			int i = this.anInt1546;
			int i_2_ = anInt1512;
			if (bool_1_) {
				method2105(-24, -30, 118, null, null, -125);
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
					class180_sub2_4_.recolor(recol_s[i_7_], recol_d[i_7_]);
				}
			}
			if (retex_s != null) {
				for (int i_8_ = 0; i_8_ < retex_s.length; i_8_++) {
					class180_sub2_4_.retexture(retex_s[i_8_], retex_d[i_8_]);
				}
			}
			class180_sub2 = class180_sub2_4_;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("td.Q(").append(bool).append(',').append(bool_1_).append(')').toString());
		}
		return class180_sub2;
	}

	final void genCert(final ObjType class162_9_, final ObjType class162_10_) {
		this.cost = class162_9_.cost;
		recol_d_palette = class162_10_.recol_d_palette;
		recol_d = class162_10_.recol_d;
		retex_s = class162_10_.retex_s;
		this.yan2d = class162_10_.yan2d;
		this.xan2d = class162_10_.xan2d;
		this.xof2d = class162_10_.xof2d;
		recol_s = class162_10_.recol_s;
		modelId = class162_10_.modelId;
		this.name = class162_9_.name;
		this.stackable = 1;
		this.zan2d = class162_10_.zan2d;
		this.members = class162_9_.members;
		this.yof2d = class162_10_.yof2d;
		this.zoom2d = class162_10_.zoom2d;
		retex_d = class162_10_.retex_d;
	}

	final Class180_Sub7 method2105(final int i, final int i_11_, final int i_13_, final PlayerAppearance playerAppearance, final SeqType seqType, final int i_14_) {
		if (this.countobj != null && i_11_ > 1) {
			int i_15_ = -1;
			for (int i_16_ = 0; i_16_ < 10; i_16_++) {
				if (i_11_ >= this.countco[i_16_] && this.countco[i_16_] != 0) {
					i_15_ = this.countobj[i_16_];
				}
			}
			if ((i_15_ ^ 0xffffffff) != 0) {
				return ObjType.list(i_15_).method2105(i, 1, i_13_, playerAppearance, seqType, i_14_);
			}
		}
		Class180_Sub7 class180_sub7_17_ = (Class180_Sub7) Class33.aClass21_273.get(this.myId);
		if (class180_sub7_17_ == null) {
			final Class180_Sub2 class180_sub2 = Class180_Sub2.method2291(Class111.aClass50_1064, modelId, 0);
			if (class180_sub2 == null) {
				return null;
			}
			if (recol_s != null) {
				for (int i_18_ = 0; recol_s.length > i_18_; i_18_++) {
					if (recol_d_palette == null || i_18_ >= recol_d_palette.length) {
						class180_sub2.recolor(recol_s[i_18_], recol_d[i_18_]);
					} else {
						class180_sub2.recolor(recol_s[i_18_], NodeSub.aShortArray2584[recol_d_palette[i_18_] & 0xff]);
					}
				}
			}
			if (retex_s != null) {
				for (int i_19_ = 0; i_19_ < retex_s.length; i_19_++) {
					class180_sub2.retexture(retex_s[i_19_], retex_d[i_19_]);
				}
			}
			if (playerAppearance != null) {
				for (int i_20_ = 0; i_20_ < 5; i_20_++) {
					if (playerAppearance.anIntArray1370[i_20_] < Class159.aShortArrayArray1489[i_20_].length) {
						class180_sub2.recolor(Class120_Sub12_Sub37.aShortArray3429[i_20_], Class159.aShortArrayArray1489[i_20_][playerAppearance.anIntArray1370[i_20_]]);
					}
					if (playerAppearance.anIntArray1370[i_20_] < Class120_Sub30_Sub1.aShortArrayArray3668[i_20_].length) {
						class180_sub2.recolor(SpotAnimType.aShortArray994[i_20_], Class120_Sub30_Sub1.aShortArrayArray3668[i_20_][playerAppearance.anIntArray1370[i_20_]]);
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
			Class33.aClass21_273.put(class180_sub7_17_, this.myId);
		}
		if (seqType != null) {
			class180_sub7_17_ = seqType.method323(false, i_14_, i_13_, class180_sub7_17_, i);
		}
		return class180_sub7_17_;
	}

	final ObjType method2106(final int i) {
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
		return this;
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
					class180_sub2_26_.recolor(recol_s[i_28_], recol_d[i_28_]);
				}
			}
			if (retex_s != null) {
				for (int i_29_ = 0; i_29_ < retex_s.length; i_29_++) {
					class180_sub2_26_.retexture(retex_s[i_29_], retex_d[i_29_]);
				}
			}
			class180_sub2 = class180_sub2_26_;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("td.C(").append(i).append(',').append(bool).append(')').toString());
		}
		return class180_sub2;
	}

	static final Class186 method2108(final int i, final int i_30_, final int i_31_) {
		final GroundTile class120_sub18 = LabelGroup.groundTiles[i][i_30_][i_31_];
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
			throw EnumType.method1428(runtimeexception, new StringBuilder("td.F(").append(i).append(',').append(bool).append(')').toString());
		}
		return bool_32_;
	}

	final String getStringParam(final String string, final int i_37_) {
		if (this.params == null) {
			return string;
		}
		final StringNode class120_sub25 = (StringNode) this.params.get(i_37_);
		if (class120_sub25 == null) {
			return string;
		}
		return class120_sub25.value;
	}

	final void genLent(final ObjType class162_39_, final ObjType class162_40_) {
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
	}

	static final boolean decodedSprites(final js5 js5, final int groupId) {
		final byte[] data = js5.getFileSmart(groupId);
		if (data == null) {
			return false;
		}
		Class140.decodeSprites(data);
		return true;
	}

	static final void method2114(final boolean bool) {
		if (!Class69_Sub2.aBoolean2234 == bool) {
			Class69_Sub2.aBoolean2234 = bool;
			Class120_Sub12_Sub25.method1334();
		}
	}

	final int getIntegerParamValue(final int defaultInt, final int param) {
		if (this.params == null) {
			return defaultInt;
		}
		final IntegerNode node = (IntegerNode) this.params.get(param);
		if (node == null) {
			return defaultInt;
		}
		return node.value;
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
			throw EnumType.method1428(runtimeexception, new StringBuilder("td.M(").append(bool).append(',').append(i).append(')').toString());
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
						class180_sub2.recolor(recol_s[i_50_], NodeSub.aShortArray2584[0xff & recol_d_palette[i_50_]]);
					} else {
						class180_sub2.recolor(recol_s[i_50_], recol_d[i_50_]);
					}
				}
			}
			if (retex_s != null) {
				for (int i_51_ = 0; i_51_ < retex_s.length; i_51_++) {
					class180_sub2.retexture(retex_s[i_51_], retex_d[i_51_]);
				}
			}
			if (playerAppearance != null) {
				for (int i_52_ = 0; i_52_ < 5; i_52_++) {
					if (Class159.aShortArrayArray1489[i_52_].length > playerAppearance.anIntArray1370[i_52_]) {
						class180_sub2.recolor(Class120_Sub12_Sub37.aShortArray3429[i_52_], Class159.aShortArrayArray1489[i_52_][playerAppearance.anIntArray1370[i_52_]]);
					}
					if (Class120_Sub30_Sub1.aShortArrayArray3668[i_52_].length > playerAppearance.anIntArray1370[i_52_]) {
						class180_sub2.recolor(SpotAnimType.aShortArray994[i_52_], Class120_Sub30_Sub1.aShortArrayArray3668[i_52_][playerAppearance.anIntArray1370[i_52_]]);
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
			throw EnumType.method1428(runtimeexception, new StringBuilder("td.I(").append(playerAppearance != null ? "{...}" : "null").append(',').append(i).append(')').toString());
		}
		return class180_sub7_sub1;
	}

	private final void decode(final Buffer buffer, final int configCode) {
		if (configCode == 1) {
			modelId = buffer.getUShort();
		} else if (configCode != 2) {
			if (configCode == 4) {
				this.zoom2d = buffer.getUShort();
			} else if (configCode == 5) {
				this.xan2d = buffer.getUShort();
			} else if (configCode == 6) {
				this.yan2d = buffer.getUShort();
			} else if (configCode != 7) {
				if (configCode == 8) {
					this.yof2d = buffer.getUShort();
					if (this.yof2d > 32767) {
						this.yof2d -= 65536;
					}
				} else if (configCode != 11) {
					if (configCode == 12) {
						this.cost = buffer.getInt();
					} else if (configCode == 16) {
						this.members = true;
					} else if (configCode == 23) {
						this.anInt1546 = buffer.getUShort();
					} else if (configCode != 24) {
						if (configCode != 25) {
							if (configCode != 26) {
								if (configCode < 30 || configCode >= 35) {
									if (configCode >= 35 && configCode < 40) {
										this.inventoryOptions[configCode + -35] = buffer.getJString();
									} else if (configCode != 40) {
										if (configCode == 41) {
											final int i_55_ = buffer.getUByte();
											retex_d = new short[i_55_];
											retex_s = new short[i_55_];
											for (int i_56_ = 0; i_56_ < i_55_; i_56_++) {
												retex_s[i_56_] = (short) buffer.getUShort();
												retex_d[i_56_] = (short) buffer.getUShort();
											}
										} else if (configCode != 42) {
											if (configCode != 65) {
												if (configCode == 78) {
													anInt1535 = buffer.getUShort();
												} else if (configCode != 79) {
													if (configCode == 90) {
														manhead = buffer.getUShort();
													} else if (configCode == 91) {
														womanhead = buffer.getUShort();
													} else if (configCode == 92) {
														manhead2 = buffer.getUShort();
													} else if (configCode != 93) {
														if (configCode != 95) {
															if (configCode != 96) {
																if (configCode != 97) {
																	if (configCode == 98) {
																		this.certtemplate = buffer.getUShort();
																	} else if (configCode >= 100 && configCode < 110) {
																		if (this.countobj == null) {
																			this.countco = new int[10];
																			this.countobj = new int[10];
																		}
																		this.countobj[-100 + configCode] = buffer.getUShort();
																		this.countco[-100 + configCode] = buffer.getUShort();
																	} else if (configCode == 110) {
																		resizex = buffer.getUShort();
																	} else if (configCode != 111) {
																		if (configCode != 112) {
																			if (configCode == 113) {
																				ambient = buffer.getByte();
																			} else if (configCode != 114) {
																				if (configCode != 115) {
																					if (configCode != 121) {
																						if (configCode == 122) {
																							this.lenttemplate = buffer.getUShort();
																						} else if (configCode == 125) {
																							manwearxoff = buffer.getByte();
																							manwearyoff = buffer.getByte();
																							manwearzoff = buffer.getByte();
																						} else if (configCode == 126) {
																							womanwearxoff = buffer.getByte();
																							womanwearyoff = buffer.getByte();
																							womanwearzoff = buffer.getByte();
																						} else if (configCode != 127) {
																							if (configCode == 128) {
																								this.cursor2op = buffer.getUByte();
																								this.cursor2 = buffer.getUShort();
																							} else if (configCode == 129) {
																								int cursor1iop = buffer.getUByte();
																								int icursor1 = buffer.getUShort();
																							} else if (configCode != 130) {
																								if (configCode == 249) {
																									final int i_57_ = buffer.getUByte();
																									if (this.params == null) {
																										final int i_58_ = Class120_Sub12_Sub17.method1283(i_57_);
																										this.params = new Hashtable(i_58_);
																									}
																									for (int i_59_ = 0; i_59_ < i_57_; i_59_++) {
																										final boolean bool = buffer.getUByte() == 1;
																										final int i_60_ = buffer.getMedium();
																										Node node;
																										if (!bool) {
																											node = new IntegerNode(buffer.getInt());
																										} else {
																											node = new StringNode(buffer.getJString());
																										}
																										this.params.put(node, i_60_);
																									}
																								}
																							} else {
																								int cursor2iop = buffer.getUByte();
																								int icursor2 = buffer.getUShort();
																							}
																						} else {
																							this.cursor1op = buffer.getUByte();
																							this.cursor1 = buffer.getUShort();
																						}
																					} else {
																						this.lentlink = buffer.getUShort();
																					}
																				} else {
																					this.team = buffer.getUByte();
																				}
																			} else {
																				contrast = buffer.getByte() * 5;
																			}
																		} else {
																			resizez = buffer.getUShort();
																		}
																	} else {
																		resizey = buffer.getUShort();
																	}
																} else {
																	this.certlink = buffer.getUShort();
																}
															} else {
																this.dummyitem = buffer.getUByte();
															}
														} else {
															this.zan2d = buffer.getUShort();
														}
													} else {
														womanhead2 = buffer.getUShort();
													}
												} else {
													anInt1559 = buffer.getUShort();
												}
											} else {
												this.stockmarket = true;
											}
										} else {
											final int i_61_ = buffer.getUByte();
											recol_d_palette = new byte[i_61_];
											for (int i_62_ = 0; i_62_ < i_61_; i_62_++) {
												recol_d_palette[i_62_] = buffer.getByte();
											}
										}
									} else {
										final int i_63_ = buffer.getUByte();
										recol_s = new short[i_63_];
										recol_d = new short[i_63_];
										for (int i_64_ = 0; i_63_ > i_64_; i_64_++) {
											recol_s[i_64_] = (short) buffer.getUShort();
											recol_d[i_64_] = (short) buffer.getUShort();
										}
									}
								} else {
									this.options[-30 + configCode] = buffer.getJString();
									if (this.options[configCode + -30].equalsIgnoreCase(Class120_Sub12_Sub15.aString3244)) {
										this.options[configCode + -30] = null;
									}
								}
							} else {
								anInt1534 = buffer.getUShort();
							}
						} else {
							this.anInt1553 = buffer.getUShort();
						}
					} else {
						anInt1512 = buffer.getUShort();
					}
				} else {
					this.stackable = 1;
				}
			} else {
				this.xof2d = buffer.getUShort();
				if (this.xof2d > 32767) {
					this.xof2d -= 65536;
				}
			}
		} else {
			this.name = buffer.getJString();
		}
	}

	static final ObjType list(final int i) {
		ObjType class162_12_ = (ObjType) Canvas_Sub1.aClass21_14.get(i);
		if (class162_12_ != null) {
			return class162_12_;
		}
		final byte[] is = Class120_Sub12_Sub23.aClass50_3305.getFile(Class20.method177(i), Class120_Sub12_Sub33.method1377(i));
		class162_12_ = new ObjType();
		class162_12_.myId = i;
		if (is != null) {
			class162_12_.decode(new Buffer(is));
		}
		class162_12_.method2109(104);
		if (class162_12_.certtemplate != -1) {
			class162_12_.genCert(list(class162_12_.certlink), list(class162_12_.certtemplate));
		}
		if (class162_12_.lenttemplate != -1) {
			class162_12_.genLent(list(class162_12_.lentlink), list(class162_12_.lenttemplate));
		}
		if (!AbstractObject.aBoolean3463 && class162_12_.members) {
			class162_12_.name = DummyInputStream.aString25;
			class162_12_.options = Class120_Sub12_Sub32.aStringArray3387;
			class162_12_.inventoryOptions = Class120_Sub12_Sub29.aStringArray3363;
			class162_12_.team = 0;
			class162_12_.stockmarket = false;
		}
		Canvas_Sub1.aClass21_14.put(class162_12_, i);
		return class162_12_;
	}

	public static void method2119(final int i) {
		try {
			anIntArray1520 = null;
			if (i != 2) {
				anInt1551 = -2;
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("td.E(").append(i).append(')').toString());
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
