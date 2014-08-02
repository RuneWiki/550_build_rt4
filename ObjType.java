/* Class162 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class ObjType {
	int cursor2op = -1;
	private int resizeY;
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
	private int resizeZ;
	String name;
	private short[] recol_d;
	private int anInt1534;
	private int anInt1535;
	static char aChar1536;
	int cursor1;
	int[] countcounts;
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
	private int resizeX;
	int yan2d;
	private int anInt1559;
	private short[] retex_d;
	int yof2d;
	int team;
	int certlink;
	String[] options;
	int cost;
	int[] countobj;
	static ObjectCache recentUse = new ObjectCache(64);

	final void decode(final Buffer buffer) {
		for (;;) {
			final int code = buffer.getUByte();
			if (code == 0) {
				break;
			}
			decode(buffer, code);
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

	final AbstractModel method2105(final int i, final int i_11_, final int i_13_, final PlayerAppearance playerAppearance, final SeqType seqType, final int i_14_) {
		if (this.countobj != null && i_11_ > 1) {
			int i_15_ = -1;
			for (int i_16_ = 0; i_16_ < 10; i_16_++) {
				if (i_11_ >= this.countcounts[i_16_] && this.countcounts[i_16_] != 0) {
					i_15_ = this.countobj[i_16_];
				}
			}
			if ((i_15_ ^ 0xffffffff) != 0) {
				return ObjType.list(i_15_).method2105(i, 1, i_13_, playerAppearance, seqType, i_14_);
			}
		}
		AbstractModel class180_sub7_17_ = (AbstractModel) Class33.aClass21_273.get(this.myId);
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
					if (playerAppearance.colors[i_20_] < Class159.aShortArrayArray1489[i_20_].length) {
						class180_sub2.recolor(Class120_Sub12_Sub37.aShortArray3429[i_20_], Class159.aShortArrayArray1489[i_20_][playerAppearance.colors[i_20_]]);
					}
					if (playerAppearance.colors[i_20_] < Class120_Sub30_Sub1.aShortArrayArray3668[i_20_].length) {
						class180_sub2.recolor(SpotAnimType.aShortArray994[i_20_], Class120_Sub30_Sub1.aShortArrayArray3668[i_20_][playerAppearance.colors[i_20_]]);
					}
				}
			}
			class180_sub7_17_ = class180_sub2.method2300(64 - -ambient, contrast + 768, -50, -10, -50);
			if (resizeX != 128 || resizeY != 128 || resizeZ != 128) {
				class180_sub7_17_.resize(resizeX, resizeY, resizeZ);
			}
			class180_sub7_17_.haveActions = true;
			if (HDToolkit.glEnabled) {
				((HDModel) class180_sub7_17_).method2432(false, false, false, true, false, false, true);
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
				if (this.countcounts[i_23_] <= i && this.countcounts[i_23_] != 0) {
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

	final void postDecode() {
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
			if (!Class111.aClass50_1064.fileExists(i_35_, 0)) {
				bool_36_ = false;
			}
			if ((i_33_ ^ 0xffffffff) != 0 && !Class111.aClass50_1064.fileExists(i_33_, 0)) {
				bool_36_ = false;
			}
			if ((i_34_ ^ 0xffffffff) != 0 && !Class111.aClass50_1064.fileExists(i_34_, 0)) {
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
			if (!Class111.aClass50_1064.fileExists(i_47_, i)) {
				bool_49_ = false;
			}
			if (i_48_ != -1 && !Class111.aClass50_1064.fileExists(i_48_, 0)) {
				bool_49_ = false;
			}
			bool_46_ = bool_49_;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("td.M(").append(bool).append(',').append(i).append(')').toString());
		}
		return bool_46_;
	}

	final LDModel method2117(final PlayerAppearance playerAppearance) {
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
				if (Class159.aShortArrayArray1489[i_52_].length > playerAppearance.colors[i_52_]) {
					class180_sub2.recolor(Class120_Sub12_Sub37.aShortArray3429[i_52_], Class159.aShortArrayArray1489[i_52_][playerAppearance.colors[i_52_]]);
				}
				if (Class120_Sub30_Sub1.aShortArrayArray3668[i_52_].length > playerAppearance.colors[i_52_]) {
					class180_sub2.recolor(SpotAnimType.aShortArray994[i_52_], Class120_Sub30_Sub1.aShortArrayArray3668[i_52_][playerAppearance.colors[i_52_]]);
				}
			}
		}
		final LDModel class180_sub7_sub1_53_ = class180_sub2.method2298(ambient + 64, contrast + 768, -50, -10, -50);
		if (resizeX != 128 || resizeY != 128 || resizeZ != 128) {
			class180_sub7_sub1_53_.resize(resizeX, resizeY, resizeZ);
		}
		return class180_sub7_sub1_53_;
	}

	private final void decode(final Buffer buffer, final int code) {
		if (code == 1) {
			modelId = buffer.getUShort();
		} else if (code == 2) {
			this.name = buffer.getJagexString();
		} else if (code == 4) {
				this.zoom2d = buffer.getUShort();
			} else if (code == 5) {
				this.xan2d = buffer.getUShort();
			} else if (code == 6) {
				this.yan2d = buffer.getUShort();
			} else if (code != 7) {
				if (code == 8) {
					this.yof2d = buffer.getUShort();
					if (this.yof2d > 32767) {
						this.yof2d -= 65536;
					}
				} else if (code != 11) {
					if (code == 12) {
						this.cost = buffer.getInt();
					} else if (code == 16) {
						this.members = true;
					} else if (code == 23) {
						this.anInt1546 = buffer.getUShort();
					} else if (code != 24) {
						if (code != 25) {
							if (code != 26) {
								if (code < 30 || code >= 35) {
									if (code >= 35 && code < 40) {
										this.inventoryOptions[code + -35] = buffer.getJagexString();
									} else if (code != 40) {
										if (code == 41) {
											final int i_55_ = buffer.getUByte();
											retex_d = new short[i_55_];
											retex_s = new short[i_55_];
											for (int i_56_ = 0; i_56_ < i_55_; i_56_++) {
												retex_s[i_56_] = (short) buffer.getUShort();
												retex_d[i_56_] = (short) buffer.getUShort();
											}
										} else if (code != 42) {
											if (code != 65) {
												if (code == 78) {
													anInt1535 = buffer.getUShort();
												} else if (code != 79) {
													if (code == 90) {
														manhead = buffer.getUShort();
													} else if (code == 91) {
														womanhead = buffer.getUShort();
													} else if (code == 92) {
														manhead2 = buffer.getUShort();
													} else if (code != 93) {
														if (code != 95) {
															if (code != 96) {
																if (code != 97) {
																	if (code == 98) {
																		this.certtemplate = buffer.getUShort();
																	} else if (code >= 100 && code < 110) {
																		if (this.countobj == null) {
																			this.countcounts = new int[10];
																			this.countobj = new int[10];
																		}
																		this.countobj[-100 + code] = buffer.getUShort();
																		this.countcounts[-100 + code] = buffer.getUShort();
																	} else if (code == 110) {
																		resizeX = buffer.getUShort();
																	} else if (code != 111) {
																		if (code != 112) {
																			if (code == 113) {
																				ambient = buffer.getByte();
																			} else if (code != 114) {
																				if (code != 115) {
																					if (code != 121) {
																						if (code == 122) {
																							this.lenttemplate = buffer.getUShort();
																						} else if (code == 125) {
																							manwearxoff = buffer.getByte();
																							manwearyoff = buffer.getByte();
																							manwearzoff = buffer.getByte();
																						} else if (code == 126) {
																							womanwearxoff = buffer.getByte();
																							womanwearyoff = buffer.getByte();
																							womanwearzoff = buffer.getByte();
																						} else if (code != 127) {
																							if (code == 128) {
																								this.cursor2op = buffer.getUByte();
																								this.cursor2 = buffer.getUShort();
																							} else if (code == 129) {
																								int cursor1iop = buffer.getUByte();
																								int icursor1 = buffer.getUShort();
																							} else if (code != 130) {
																								if (code == 249) {
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
																											node = new StringNode(buffer.getJagexString());
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
																			resizeZ = buffer.getUShort();
																		}
																	} else {
																		resizeY = buffer.getUShort();
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
									this.options[-30 + code] = buffer.getJagexString();
									if (this.options[code + -30].equalsIgnoreCase(Class120_Sub12_Sub15.aString3244)) {
										this.options[code + -30] = null;
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
	}

	static final void setMembersClient2(final boolean bool) {
		if (AbstractObject.objMemberClient != bool) {
			AbstractObject.objMemberClient = bool;
			Class120_Sub12_Sub18.method1291();
		}
	}

	static final ObjType list(final int id) {
		ObjType objType = (ObjType) recentUse.get(id);
		if (objType != null) {
			return objType;
		}
		final byte[] data = Class120_Sub12_Sub23.aClass50_3305.getFile(id >>> 8, id & 0xff);
		objType = new ObjType();
		objType.myId = id;
		if (data != null) {
			objType.decode(new Buffer(data));
		}
		objType.postDecode();
		if (objType.certtemplate != -1) {
			objType.genCert(list(objType.certlink), list(objType.certtemplate));
		}
		if (objType.lenttemplate != -1) {
			objType.genLent(list(objType.lentlink), list(objType.lenttemplate));
		}
		if (!AbstractObject.objMemberClient && objType.members) {
			objType.name = DummyInputStream.aString25;
			objType.options = Class120_Sub12_Sub32.aStringArray3387;
			objType.inventoryOptions = Class120_Sub12_Sub29.aStringArray3363;
			objType.team = 0;
			objType.stockmarket = false;
		}
		recentUse.put(objType, id);
		return objType;
	}

	public static void method2119() {
		anIntArray1520 = null;
		recentUse = null;
	}

	public ObjType() {
		manhead2 = -1;
		this.cursor1 = -1;
		anInt1512 = -1;
		ambient = 0;
		anInt1534 = -1;
		this.zoom2d = 2000;
		resizeZ = 128;
		resizeY = 128;
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
		resizeX = 128;
		this.cursor2 = -1;
		this.cost = 1;
		this.options = new String[] { null, null, Class120_Sub14_Sub1.aString3449, null, null };
		anInt1559 = -1;
	}
}
