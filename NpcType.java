/* Class170 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class NpcType {
	byte aByte1652;
	boolean aBoolean1653;
	private short[] aShortArray1654;
	int anInt1655 = -1;
	boolean aBoolean1656;
	int anInt1657;
	int anInt1658;
	private int[][] anIntArrayArray1659;
	static int anInt1660;
	private Hashtable aClass75_1661;
	short aShort1662;
	private int varbitId;
	int headIcon;
	private int anInt1665;
	int anInt1666;
	private short[] aShortArray1667;
	int anInt1668;
	private int[] anIntArray1669;
	private int[][] anIntArrayArray1670;
	boolean aBoolean1671;
	int anInt1672;
	int anInt1673;
	int anInt1674;
	private int anInt1675;
	int anInt1676;
	int anInt1677;
	private int[] anIntArray1678;
	int[] childrenIDs;
	private short[] aShortArray1680;
	int anInt1681;
	int anInt1682;
	short aShort1683;
	private int anInt1684;
	static String aString1685 = "flash3:";
	int id;
	static Signlink gameSignlink;
	boolean aBoolean1688;
	private short[] aShortArray1689;
	int anInt1690;
	int iconHeight;
	int anInt1692;
	int size;
	byte aByte1694;
	int anInt1695;
	private int anInt1696;
	private int varpId;
	int anInt1698;
	byte aByte1699;
	byte aByte1700;
	boolean aBoolean1701;
	static int anInt1702 = 0;
	String[] aStringArray1703;
	private byte[] aByteArray1704;
	String aString1705;
	boolean aBoolean1706;
	static js5 aClass50_2099;
	static ObjectCache recentUse = new ObjectCache(64);

	final boolean method2199() {
		if (this.childrenIDs == null) {
			return true;
		}
		int i_0_ = -1;
		if (varbitId != -1) {
			i_0_ = Class173.method2226((byte) -128, varbitId);
		} else if (varpId != -1) {
			i_0_ = Class2.permanentVariable[varpId];
		}
		if (i_0_ < 0 || i_0_ >= this.childrenIDs.length - 1 || this.childrenIDs[i_0_] == -1) {
			final int i_1_ = this.childrenIDs[this.childrenIDs.length - 1];
			if (i_1_ == -1) {
				return false;
			}
			return true;
		}
		return true;
	}

	public static void method2200() {
		aString1685 = null;
		aClass50_2099 = null;
		gameSignlink = null;
		recentUse = null;
	}

	static final int method2201(final int i, int i_2_, int i_3_) {
		int i_4_;
		try {
			if (i != 6) {
				return -34;
			}
			int i_5_ = 1;
			while (i_2_ > 1) {
				if ((0x1 & i_2_) != 0) {
					i_5_ *= i_3_;
				}
				i_2_ >>= 1;
				i_3_ *= i_3_;
			}
			if (i_2_ == 1) {
				return i_3_ * i_5_;
			}
			i_4_ = i_5_;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("ua.B(").append(i).append(',').append(i_2_).append(',').append(i_3_).append(')').toString());
		}
		return i_4_;
	}

	final String method2202(final int i, final int i_6_, final String string) {
		String string_7_;
		try {
			if (i != -1575770623) {
				this.aString1705 = null;
			}
			if (aClass75_1661 == null) {
				return string;
			}
			final StringNode class120_sub25 = (StringNode) aClass75_1661.get(i_6_);
			if (class120_sub25 == null) {
				return string;
			}
			string_7_ = class120_sub25.value;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("ua.I(").append(i).append(',').append(i_6_).append(',').append(string != null ? "{...}" : "null").append(')').toString());
		}
		return string_7_;
	}

	private final void method2203(final Buffer class120_sub7, final byte i, final int i_8_) {
		try {
			if (i <= 17) {
				method2199();
			}
			if (i_8_ == 1) {
				final int i_9_ = class120_sub7.getUByte();
				anIntArray1678 = new int[i_9_];
				for (int i_10_ = 0; i_10_ < i_9_; i_10_++) {
					anIntArray1678[i_10_] = class120_sub7.getUShort();
					if (anIntArray1678[i_10_] == 65535) {
						anIntArray1678[i_10_] = -1;
					}
				}
			} else if (i_8_ == 2) {
				this.aString1705 = class120_sub7.getJString();
			} else if (i_8_ == 12) {
				this.size = class120_sub7.getUByte();
			} else if (i_8_ >= 30 && i_8_ < 35) {
				this.aStringArray1703[-30 + i_8_] = class120_sub7.getJString();
				if (this.aStringArray1703[-30 + i_8_].equalsIgnoreCase(Class120_Sub12_Sub15.aString3244)) {
					this.aStringArray1703[-30 + i_8_] = null;
				}
			} else if (i_8_ == 40) {
				final int i_11_ = class120_sub7.getUByte();
				aShortArray1654 = new short[i_11_];
				aShortArray1689 = new short[i_11_];
				for (int i_12_ = 0; i_12_ < i_11_; i_12_++) {
					aShortArray1654[i_12_] = (short) class120_sub7.getUShort();
					aShortArray1689[i_12_] = (short) class120_sub7.getUShort();
				}
			} else if (i_8_ != 41) {
				if (i_8_ != 42) {
					if (i_8_ != 60) {
						if (i_8_ != 93) {
							if (i_8_ == 95) {
								this.anInt1674 = class120_sub7.getUShort();
							} else if (i_8_ == 97) {
								anInt1675 = class120_sub7.getUShort();
							} else if (i_8_ != 98) {
								if (i_8_ != 99) {
									if (i_8_ != 100) {
										if (i_8_ == 101) {
											anInt1665 = 5 * class120_sub7.getByte();
										} else if (i_8_ == 102) {
											this.headIcon = class120_sub7.getUShort();
										} else if (i_8_ != 103) {
											if (i_8_ == 106 || i_8_ == 118) {
												varbitId = class120_sub7.getUShort();
												int i_13_ = -1;
												if (-65536 == (varbitId ^ 0xffffffff)) {
													varbitId = -1;
												}
												varpId = class120_sub7.getUShort();
												if (varpId == 65535) {
													varpId = -1;
												}
												if (i_8_ == 118) {
													i_13_ = class120_sub7.getUShort();
													if (i_13_ == 65535) {
														i_13_ = -1;
													}
												}
												final int i_14_ = class120_sub7.getUByte();
												this.childrenIDs = new int[i_14_ - -2];
												for (int i_15_ = 0; i_15_ <= i_14_; i_15_++) {
													this.childrenIDs[i_15_] = class120_sub7.getUShort();
													if (65535 == this.childrenIDs[i_15_]) {
														this.childrenIDs[i_15_] = -1;
													}
												}
												this.childrenIDs[1 + i_14_] = i_13_;
											} else if (i_8_ != 107) {
												if (i_8_ != 109) {
													if (i_8_ != 111) {
														if (i_8_ == 113) {
															this.aShort1683 = (short) class120_sub7.getUShort();
															this.aShort1662 = (short) class120_sub7.getUShort();
														} else if (i_8_ == 114) {
															this.aByte1694 = class120_sub7.getByte();
															this.aByte1699 = class120_sub7.getByte();
														} else if (i_8_ == 115) {
															class120_sub7.getUByte();
															class120_sub7.getUByte();
														} else if (i_8_ != 119) {
															if (i_8_ != 121) {
																if (i_8_ != 122) {
																	if (i_8_ != 123) {
																		if (i_8_ != 125) {
																			if (i_8_ == 127) {
																				this.anInt1692 = class120_sub7.getUShort();
																			} else if (i_8_ != 128) {
																				if (i_8_ == 134) {
																					this.anInt1681 = class120_sub7.getUShort();
																					if (this.anInt1681 == 65535) {
																						this.anInt1681 = -1;
																					}
																					this.anInt1657 = class120_sub7.getUShort();
																					if (this.anInt1657 == 65535) {
																						this.anInt1657 = -1;
																					}
																					this.anInt1682 = class120_sub7.getUShort();
																					if (this.anInt1682 == 65535) {
																						this.anInt1682 = -1;
																					}
																					this.anInt1676 = class120_sub7.getUShort();
																					if (this.anInt1676 == 65535) {
																						this.anInt1676 = -1;
																					}
																					this.anInt1677 = class120_sub7.getUByte();
																				} else if (i_8_ != 135) {
																					if (i_8_ != 136) {
																						if (i_8_ != 137) {
																							if (i_8_ == 140) {
																								this.anInt1658 = class120_sub7.getUByte();
																							} else if (i_8_ != 141) {
																								if (i_8_ == 142) {
																									this.anInt1698 = class120_sub7.getUShort();
																								} else if (i_8_ >= 150 && i_8_ < 155) {
																									this.aStringArray1703[-150 + i_8_] = class120_sub7.getJString();
																									if (!Class140.aBoolean1340 || this.aStringArray1703[i_8_ + -150].equalsIgnoreCase(Class120_Sub12_Sub15.aString3244)) {
																										this.aStringArray1703[i_8_ - 150] = null;
																									}
																								} else if (i_8_ == 249) {
																									final int i_16_ = class120_sub7.getUByte();
																									if (aClass75_1661 == null) {
																										final int i_17_ = Class120_Sub12_Sub17.method1283(i_16_);
																										aClass75_1661 = new Hashtable(i_17_);
																									}
																									for (int i_18_ = 0; i_18_ < i_16_; i_18_++) {
																										final boolean bool = class120_sub7.getUByte() == 1;
																										final int i_19_ = class120_sub7.getMedium();
																										Node node;
																										if (bool) {
																											node = new StringNode(class120_sub7.getJString());
																										} else {
																											node = new IntegerNode(class120_sub7.getInt());
																										}
																										aClass75_1661.put(node, i_19_);
																									}
																								}
																							} else {
																								this.aBoolean1656 = true;
																							}
																						} else {
																							this.anInt1668 = class120_sub7.getUShort();
																						}
																					} else {
																						this.anInt1655 = class120_sub7.getUByte();
																						this.anInt1690 = class120_sub7.getUShort();
																					}
																				} else {
																					this.anInt1673 = class120_sub7.getUByte();
																					this.anInt1695 = class120_sub7.getUShort();
																				}
																			} else {
																				class120_sub7.getUByte();
																			}
																		} else {
																			this.aByte1652 = class120_sub7.getByte();
																		}
																	} else {
																		this.iconHeight = class120_sub7.getUShort();
																	}
																} else {
																	this.anInt1666 = class120_sub7.getUShort();
																}
															} else {
																anIntArrayArray1670 = new int[anIntArray1678.length][];
																final int i_20_ = class120_sub7.getUByte();
																for (int i_21_ = 0; i_21_ < i_20_; i_21_++) {
																	final int i_22_ = class120_sub7.getUByte();
																	final int[] is = anIntArrayArray1670[i_22_] = new int[3];
																	is[0] = class120_sub7.getByte();
																	is[1] = class120_sub7.getByte();
																	is[2] = class120_sub7.getByte();
																}
															}
														} else {
															this.aByte1700 = class120_sub7.getByte();
														}
													} else {
														this.aBoolean1653 = false;
													}
												} else {
													this.aBoolean1701 = false;
												}
											} else {
												this.aBoolean1688 = false;
											}
										} else {
											this.anInt1672 = class120_sub7.getUShort();
										}
									} else {
										anInt1684 = class120_sub7.getByte();
									}
								} else {
									this.aBoolean1706 = true;
								}
							} else {
								anInt1696 = class120_sub7.getUShort();
							}
						} else {
							this.aBoolean1671 = false;
						}
					} else {
						final int i_23_ = class120_sub7.getUByte();
						anIntArray1669 = new int[i_23_];
						for (int i_24_ = 0; i_23_ > i_24_; i_24_++) {
							anIntArray1669[i_24_] = class120_sub7.getUShort();
						}
					}
				} else {
					final int i_25_ = class120_sub7.getUByte();
					aByteArray1704 = new byte[i_25_];
					for (int i_26_ = 0; i_26_ < i_25_; i_26_++) {
						aByteArray1704[i_26_] = class120_sub7.getByte();
					}
				}
			} else {
				final int i_27_ = class120_sub7.getUByte();
				aShortArray1680 = new short[i_27_];
				aShortArray1667 = new short[i_27_];
				for (int i_28_ = 0; i_28_ < i_27_; i_28_++) {
					aShortArray1680[i_28_] = (short) class120_sub7.getUShort();
					aShortArray1667[i_28_] = (short) class120_sub7.getUShort();
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("ua.J(").append(class120_sub7 != null ? "{...}" : "null").append(',').append(i).append(',').append(i_8_).append(')').toString());
		}
	}

	final boolean hasAmbientSound() {
		if (this.childrenIDs == null) {
			if (this.anInt1681 == -1 && this.anInt1682 == -1 && this.anInt1676 == -1) {
				return false;
			}
			return true;
		}
		for (int id = 0; id < this.childrenIDs.length; id++) {
			if (this.childrenIDs[id] != -1) {
				final NpcType npcType = NpcType.list(this.childrenIDs[id]);
				if (npcType.anInt1681 != -1 || npcType.anInt1682 != -1 || npcType.anInt1676 != -1) {
					return true;
				}
			}
		}
		return false;
	}

	final int method2206(final int i, final int i_31_, final int i_32_) {
		int i_33_;
		try {
			if (i != -9059) {
				return 93;
			}
			if (aClass75_1661 == null) {
				return i_31_;
			}
			final IntegerNode class120_sub32 = (IntegerNode) aClass75_1661.get(i_32_);
			if (class120_sub32 == null) {
				return i_31_;
			}
			i_33_ = class120_sub32.value;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("ua.M(").append(i).append(',').append(i_31_).append(',').append(i_32_).append(')').toString());
		}
		return i_33_;
	}

	final void method2207(final Buffer class120_sub7, final byte i) {
		try {
			if (i >= -83) {
				method2201(8, 120, -27);
			}
			for (;;) {
				final int i_34_ = class120_sub7.getUByte();
				if (i_34_ == 0) {
					break;
				}
				method2203(class120_sub7, (byte) 63, i_34_);
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("ua.F(").append(class120_sub7 != null ? "{...}" : "null").append(',').append(i).append(')').toString());
		}
	}

	static final void method2208(final js5 js5) {
		Class49.aClass50_440 = js5;
	}

	final NpcType handleVarp() {
		int value = -1;
		if (varbitId != -1) {
			value = Class173.method2226((byte) -112, varbitId);
		} else if (varpId != -1) {
			value = Class2.permanentVariable[varpId];
		}
		if (value < 0 || value >= -1 + this.childrenIDs.length || this.childrenIDs[value] == -1) {
			final int i_37_ = this.childrenIDs[this.childrenIDs.length - 1];
			if (i_37_ == -1) {
				return null;
			}
			return NpcType.list(i_37_);
		}
		return NpcType.list(this.childrenIDs[value]);
	}

	final Class180_Sub7 method2210(final int i, final SeqType seqType, final byte i_38_, final int i_39_, final int i_40_) {
		Class180_Sub7 class180_sub7;
		try {
			if (this.childrenIDs != null) {
				final NpcType class170_41_ = handleVarp();
				if (class170_41_ == null) {
					return null;
				}
				return class170_41_.method2210(i, seqType, (byte) -128, i_39_, i_40_);
			}
			if (anIntArray1669 == null) {
				return null;
			}
			Class180_Sub7 class180_sub7_42_ = (Class180_Sub7) Projectile.aClass21_2931.get(this.id);
			if (class180_sub7_42_ == null) {
				boolean bool = false;
				for (int i_43_ = 0; anIntArray1669.length > i_43_; i_43_++) {
					if (!Class28.aClass50_181.fileExists(anIntArray1669[i_43_], 0)) {
						bool = true;
					}
				}
				if (bool) {
					return null;
				}
				final Class180_Sub2[] class180_sub2s = new Class180_Sub2[anIntArray1669.length];
				for (int i_44_ = 0; i_44_ < anIntArray1669.length; i_44_++) {
					class180_sub2s[i_44_] = Class180_Sub2.method2291(Class28.aClass50_181, anIntArray1669[i_44_], 0);
				}
				Class180_Sub2 class180_sub2;
				if (class180_sub2s.length != 1) {
					class180_sub2 = new Class180_Sub2(class180_sub2s, class180_sub2s.length);
				} else {
					class180_sub2 = class180_sub2s[0];
				}
				if (aShortArray1654 != null) {
					for (int i_45_ = 0; aShortArray1654.length > i_45_; i_45_++) {
						if (aByteArray1704 != null && aByteArray1704.length > i_45_) {
							class180_sub2.recolor(aShortArray1654[i_45_], Class69_Sub3_Sub1.aShortArray3085[aByteArray1704[i_45_] & 0xff]);
						} else {
							class180_sub2.recolor(aShortArray1654[i_45_], aShortArray1689[i_45_]);
						}
					}
				}
				if (aShortArray1680 != null) {
					for (int i_46_ = 0; i_46_ < aShortArray1680.length; i_46_++) {
						class180_sub2.retexture(aShortArray1680[i_46_], aShortArray1667[i_46_]);
					}
				}
				class180_sub7_42_ = class180_sub2.method2300(64, 768, -50, -10, -50);
				Projectile.aClass21_2931.put(class180_sub7_42_, this.id);
			}
			if (seqType != null) {
				class180_sub7_42_ = seqType.method323(false, i_39_, i, class180_sub7_42_, i_40_);
			}
			class180_sub7 = class180_sub7_42_;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("ua.H(").append(i).append(',').append(seqType != null ? "{...}" : "null").append(',').append(i_38_).append(',').append(i_39_).append(',').append(i_40_).append(')').toString());
		}
		return class180_sub7;
	}

	static final void sleep(final long millis) {
		try {
			Thread.sleep(millis);
		} catch (final InterruptedException interruptedexception) {
			/* empty */
		}
	}

	final Class180_Sub7 method2212(final int i, final int i_47_, final int i_48_, final SeqType seqType, final SeqType class40_49_, final int i_50_, final Class150[] class150s, final int i_51_, final int i_52_, final int i_53_) {
		Class180_Sub7 class180_sub7;
		try {
			if (this.childrenIDs != null) {
				final NpcType class170_54_ = handleVarp();
				if (class170_54_ == null) {
					return null;
				}
				return class170_54_.method2212(i, i_47_, -104, seqType, class40_49_, i_50_, class150s, i_51_, i_52_, i_53_);
			}
			Class180_Sub7 class180_sub7_55_ = (Class180_Sub7) Class11.aClass21_80.get(this.id);
			if (class180_sub7_55_ == null) {
				boolean bool = false;
				for (int i_56_ = 0; i_56_ < anIntArray1678.length; i_56_++) {
					if (anIntArray1678[i_56_] != -1 && !Class28.aClass50_181.fileExists(anIntArray1678[i_56_], 0)) {
						bool = true;
					}
				}
				if (bool) {
					return null;
				}
				final Class180_Sub2[] class180_sub2s = new Class180_Sub2[anIntArray1678.length];
				for (int i_57_ = 0; i_57_ < anIntArray1678.length; i_57_++) {
					if (anIntArray1678[i_57_] != -1) {
						class180_sub2s[i_57_] = Class180_Sub2.method2291(Class28.aClass50_181, anIntArray1678[i_57_], 0);
						if (anIntArrayArray1670 != null && anIntArrayArray1670[i_57_] != null && class180_sub2s[i_57_] != null) {
							class180_sub2s[i_57_].method2282(anIntArrayArray1670[i_57_][0], anIntArrayArray1670[i_57_][1], anIntArrayArray1670[i_57_][2]);
						}
					}
				}
				Class29 class29 = null;
				if (this.anInt1692 != -1) {
					class29 = Class29.list(this.anInt1692);
				}
				if (class29 != null && class29.anIntArrayArray215 != null) {
					for (int i_58_ = 0; class29.anIntArrayArray215.length > i_58_; i_58_++) {
						if (class29.anIntArrayArray215[i_58_] != null && i_58_ < class180_sub2s.length && class180_sub2s[i_58_] != null) {
							final int i_59_ = class29.anIntArrayArray215[i_58_][0];
							final int i_60_ = class29.anIntArrayArray215[i_58_][3];
							final int i_61_ = class29.anIntArrayArray215[i_58_][2];
							final int i_62_ = class29.anIntArrayArray215[i_58_][1];
							final int i_63_ = class29.anIntArrayArray215[i_58_][4];
							final int i_64_ = class29.anIntArrayArray215[i_58_][5];
							if (anIntArrayArray1659 == null) {
								anIntArrayArray1659 = new int[class29.anIntArrayArray215.length][];
							}
							if (anIntArrayArray1659[i_58_] == null) {
								final int[] is = anIntArrayArray1659[i_58_] = new int[15];
								if (i_60_ != 0 || i_63_ != 0 || i_64_ != 0) {
									final int i_65_ = Rasterizer.cosineTable[i_60_] >> 1;
									final int i_66_ = Rasterizer.sineTable[i_60_] >> 1;
									final int i_67_ = Rasterizer.cosineTable[i_63_] >> 1;
									final int i_68_ = Rasterizer.sineTable[i_63_] >> 1;
									final int i_69_ = Rasterizer.cosineTable[i_64_] >> 1;
									final int i_70_ = Rasterizer.sineTable[i_64_] >> 1;
									final int i_71_ = 16384 + i_69_ * i_66_ >> 15;
									is[8] = i_67_ * i_65_ - -16384 >> 15;
									is[5] = -i_66_;
									is[1] = 16384 + i_68_ * i_71_ + -i_70_ * i_67_ >> 15;
									is[4] = i_65_ * i_69_ - -16384 >> 15;
									final int i_72_ = i_70_ * i_66_ - -16384 >> 15;
									is[6] = 16384 + i_69_ * -i_68_ - -(i_67_ * i_72_) >> 15;
									is[3] = i_70_ * i_65_ + 16384 >> 15;
									is[2] = i_65_ * i_68_ - -16384 >> 15;
									is[0] = i_72_ * i_68_ + i_69_ * i_67_ - -16384 >> 15;
									is[7] = 16384 + -i_70_ * -i_68_ + i_71_ * i_67_ >> 15;
									is[12] = is[6] * -i_61_ + is[0] * -i_59_ - (-(-i_62_ * is[3]) - 16384) >> 15;
									is[13] = -i_62_ * is[4] + is[1] * -i_59_ - (-(is[7] * -i_61_) + -16384) >> 15;
									is[14] = 16384 + is[8] * -i_61_ + -i_59_ * is[2] + -i_62_ * is[5] >> 15;
								} else {
									is[13] = -i_62_;
									is[0] = is[4] = is[8] = 32768;
									is[12] = -i_59_;
									is[14] = -i_61_;
								}
								is[10] = i_62_;
								is[11] = i_61_;
								is[9] = i_59_;
							}
							if (i_60_ != 0 || i_63_ != 0 || i_64_ != 0) {
								class180_sub2s[i_58_].method2293(i_60_, i_63_, i_64_);
							}
							if (i_59_ != 0 || i_62_ != 0 || i_61_ != 0) {
								class180_sub2s[i_58_].method2282(i_59_, i_62_, i_61_);
							}
						}
					}
				}
				Class180_Sub2 class180_sub2;
				if (class180_sub2s.length == 1) {
					class180_sub2 = class180_sub2s[0];
				} else {
					class180_sub2 = new Class180_Sub2(class180_sub2s, class180_sub2s.length);
				}
				if (aShortArray1654 != null) {
					for (int i_73_ = 0; aShortArray1654.length > i_73_; i_73_++) {
						if (aByteArray1704 == null || i_73_ >= aByteArray1704.length) {
							class180_sub2.recolor(aShortArray1654[i_73_], aShortArray1689[i_73_]);
						} else {
							class180_sub2.recolor(aShortArray1654[i_73_], Class69_Sub3_Sub1.aShortArray3085[aByteArray1704[i_73_] & 0xff]);
						}
					}
				}
				if (aShortArray1680 != null) {
					for (int i_74_ = 0; i_74_ < aShortArray1680.length; i_74_++) {
						class180_sub2.retexture(aShortArray1680[i_74_], aShortArray1667[i_74_]);
					}
				}
				class180_sub7_55_ = class180_sub2.method2300(anInt1684 + 64, anInt1665 + 850, -30, -50, -30);
				if (HDToolkit.glEnabled) {
					((Class180_Sub7_Sub2) class180_sub7_55_).method2432(false, false, false, true, false, false, true);
				}
				Class11.aClass21_80.put(class180_sub7_55_, this.id);
			}
			boolean bool = false;
			boolean bool_75_ = false;
			boolean bool_76_ = false;
			boolean bool_77_ = false;
			final int i_78_ = class150s != null ? class150s.length : 0;
			for (int i_79_ = 0; i_79_ < i_78_; i_79_++) {
				if (class150s[i_79_] != null) {
					final SeqType class40_80_ = SeqType.list(class150s[i_79_].anInt1406);
					if (class40_80_.frames != null) {
						FileSystem.aClass40Array458[i_79_] = class40_80_;
						bool = true;
						final int i_81_ = class150s[i_79_].anInt1413;
						final int i_82_ = class150s[i_79_].anInt1414;
						int i_83_ = class40_80_.frames[i_81_];
						EnumType.aClass120_Sub14_Sub18Array3453[i_79_] = FrameLoader.list(i_83_ >>> 16);
						i_83_ &= 0xffff;
						Class180_Sub3.anIntArray2918[i_79_] = i_83_;
						if (EnumType.aClass120_Sub14_Sub18Array3453[i_79_] != null) {
							bool_76_ |= EnumType.aClass120_Sub14_Sub18Array3453[i_79_].method1579(3, i_83_);
							bool_75_ |= EnumType.aClass120_Sub14_Sub18Array3453[i_79_].method1578((byte) -39, i_83_);
							bool_77_ |= class40_80_.aBoolean341;
						}
						if ((class40_80_.tween || Class164.forceTween) && (i_82_ ^ 0xffffffff) != 0 && i_82_ < class40_80_.frames.length) {
							Class120_Sub28.anIntArray2761[i_79_] = class40_80_.delays[i_81_];
							ObjectCache.anIntArray124[i_79_] = class150s[i_79_].anInt1410;
							int i_84_ = class40_80_.frames[i_82_];
							DummyOutputStream.aClass120_Sub14_Sub18Array31[i_79_] = FrameLoader.list(i_84_ >>> 16);
							i_84_ &= 0xffff;
							Class120_Sub12.anIntArray2567[i_79_] = i_84_;
							if (DummyOutputStream.aClass120_Sub14_Sub18Array31[i_79_] != null) {
								bool_76_ |= DummyOutputStream.aClass120_Sub14_Sub18Array31[i_79_].method1579(3, i_84_);
								bool_75_ |= DummyOutputStream.aClass120_Sub14_Sub18Array31[i_79_].method1578((byte) -39, i_84_);
							}
						} else {
							Class120_Sub28.anIntArray2761[i_79_] = 0;
							ObjectCache.anIntArray124[i_79_] = 0;
							DummyOutputStream.aClass120_Sub14_Sub18Array31[i_79_] = null;
							Class120_Sub12.anIntArray2567[i_79_] = -1;
						}
					}
				}
			}
			if (!bool && class40_49_ == null && seqType == null) {
				final Class180_Sub7 class180_sub7_85_ = class180_sub7_55_.method2376(true, true, true);
				if (anInt1675 != 128 || anInt1696 != 128) {
					class180_sub7_85_.method2369(anInt1675, anInt1696, anInt1675);
				}
				return class180_sub7_85_;
			}
			int i_86_ = -1;
			int i_87_ = -1;
			FrameLoader class120_sub14_sub18 = null;
			FrameLoader class120_sub14_sub18_88_ = null;
			int i_89_ = 0;
			if (class40_49_ != null) {
				i_87_ = class40_49_.frames[i];
				final int i_90_ = i_87_ >>> 16;
				class120_sub14_sub18 = FrameLoader.list(i_90_);
				i_87_ &= 0xffff;
				if (class120_sub14_sub18 != null) {
					bool_76_ |= class120_sub14_sub18.method1579(3, i_87_);
					bool_75_ |= class120_sub14_sub18.method1578((byte) -39, i_87_);
					bool_77_ |= class40_49_.aBoolean341;
				}
				if ((class40_49_.tween || Class164.forceTween) && i_50_ != -1 && i_50_ < class40_49_.frames.length) {
					i_86_ = class40_49_.frames[i_50_];
					i_89_ = class40_49_.delays[i];
					final int i_91_ = i_86_ >>> 16;
					i_86_ &= 0xffff;
					if (i_91_ != i_90_) {
						class120_sub14_sub18_88_ = FrameLoader.list(i_86_ >>> 16);
					} else {
						class120_sub14_sub18_88_ = class120_sub14_sub18;
					}
					if (class120_sub14_sub18_88_ != null) {
						bool_76_ |= class120_sub14_sub18_88_.method1579(3, i_86_);
						bool_75_ |= class120_sub14_sub18_88_.method1578((byte) -39, i_86_);
					}
				}
			}
			int i_92_ = -1;
			int i_93_ = -1;
			int i_94_ = 0;
			FrameLoader class120_sub14_sub18_95_ = null;
			FrameLoader class120_sub14_sub18_96_ = null;
			if (seqType != null) {
				i_93_ = seqType.frames[i_52_];
				final int i_97_ = i_93_ >>> 16;
				i_93_ &= 0xffff;
				class120_sub14_sub18_95_ = FrameLoader.list(i_97_);
				if (class120_sub14_sub18_95_ != null) {
					bool_76_ |= class120_sub14_sub18_95_.method1579(3, i_93_);
					bool_75_ |= class120_sub14_sub18_95_.method1578((byte) -39, i_93_);
					bool_77_ |= seqType.aBoolean341;
				}
				if ((seqType.tween || Class164.forceTween) && i_51_ != -1 && i_51_ < seqType.frames.length) {
					i_94_ = seqType.delays[i_52_];
					i_92_ = seqType.frames[i_51_];
					final int i_98_ = i_92_ >>> 16;
					i_92_ &= 0xffff;
					if (i_98_ == i_97_) {
						class120_sub14_sub18_96_ = class120_sub14_sub18_95_;
					} else {
						class120_sub14_sub18_96_ = FrameLoader.list(i_92_ >>> 16);
					}
					if (class120_sub14_sub18_96_ != null) {
						bool_76_ |= class120_sub14_sub18_96_.method1579(3, i_92_);
						bool_75_ |= class120_sub14_sub18_96_.method1578((byte) -39, i_92_);
					}
				}
			}
			final Class180_Sub7 class180_sub7_99_ = class180_sub7_55_.method2376(!bool_75_, !bool_76_, !bool_77_);
			int i_100_ = 1;
			if (i_48_ > -91) {
				return null;
			}
			for (int i_101_ = 0; i_101_ < i_78_; i_101_++) {
				if (EnumType.aClass120_Sub14_Sub18Array3453[i_101_] != null) {
					class180_sub7_99_.method2384(EnumType.aClass120_Sub14_Sub18Array3453[i_101_], Class180_Sub3.anIntArray2918[i_101_], DummyOutputStream.aClass120_Sub14_Sub18Array31[i_101_], Class120_Sub12.anIntArray2567[i_101_], ObjectCache.anIntArray124[i_101_] - 1,
							Class120_Sub28.anIntArray2761[i_101_], i_100_, FileSystem.aClass40Array458[i_101_].aBoolean341, anIntArrayArray1659[i_101_]);
				}
				i_100_ <<= 1;
			}
			if (class120_sub14_sub18 == null || class120_sub14_sub18_95_ == null) {
				if (class120_sub14_sub18 != null) {
					class180_sub7_99_.method2380(class120_sub14_sub18, i_87_, class120_sub14_sub18_88_, i_86_, i_53_ + -1, i_89_, class40_49_.aBoolean341);
				} else if (class120_sub14_sub18_95_ != null) {
					class180_sub7_99_.method2380(class120_sub14_sub18_95_, i_93_, class120_sub14_sub18_96_, i_92_, -1 + i_47_, i_94_, seqType.aBoolean341);
				}
			} else {
				class180_sub7_99_.method2361(class120_sub14_sub18, i_87_, class120_sub14_sub18_88_, i_86_, i_53_ + -1, i_89_, class120_sub14_sub18_95_, i_93_, class120_sub14_sub18_96_, i_92_, -1 + i_47_, i_94_, class40_49_.aBooleanArray327, class40_49_.aBoolean341 | seqType.aBoolean341);
			}
			for (int i_102_ = 0; i_102_ < i_78_; i_102_++) {
				EnumType.aClass120_Sub14_Sub18Array3453[i_102_] = null;
				DummyOutputStream.aClass120_Sub14_Sub18Array31[i_102_] = null;
				FileSystem.aClass40Array458[i_102_] = null;
			}
			if (anInt1675 != 128 || anInt1696 != 128) {
				class180_sub7_99_.method2369(anInt1675, anInt1696, anInt1675);
			}
			class180_sub7 = class180_sub7_99_;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("ua.D(").append(i).append(',').append(i_47_).append(',').append(i_48_).append(',').append(seqType != null ? "{...}" : "null").append(',').append(class40_49_ != null ? "{...}" : "null").append(',').append(i_50_)
					.append(',').append(class150s != null ? "{...}" : "null").append(',').append(i_51_).append(',').append(i_52_).append(',').append(i_53_).append(')').toString());
		}
		return class180_sub7;
	}

	static final NpcType list(final int id) {
		NpcType npcType = (NpcType) recentUse.get(id);
		if (npcType != null) {
			return npcType;
		}
		final byte[] is = NpcType.aClass50_2099.getFile(id >>> 7, id  & 0x7f);
		npcType = new NpcType();
		npcType.id = id;
		if (is != null) {
			npcType.method2207(new Buffer(is), (byte) -92);
		}
		recentUse.put(npcType, id);
		return npcType;
	}

	public NpcType() {
		this.aBoolean1653 = true;
		this.anInt1657 = -1;
		this.anInt1681 = -1;
		this.headIcon = -1;
		this.anInt1682 = -1;
		this.aShort1683 = (short) 0;
		this.anInt1668 = -1;
		this.anInt1674 = -1;
		this.anInt1673 = -1;
		this.anInt1677 = 0;
		this.anInt1672 = 32;
		this.aBoolean1688 = true;
		this.aByte1652 = (byte) 7;
		anInt1684 = 0;
		this.anInt1666 = -1;
		anInt1675 = 128;
		this.aShort1662 = (short) 0;
		this.size = 1;
		varpId = -1;
		varbitId = -1;
		this.aByte1699 = (byte) -16;
		this.anInt1658 = 255;
		anInt1696 = 128;
		this.anInt1698 = -1;
		this.aBoolean1701 = true;
		this.anInt1692 = -1;
		this.aByte1700 = (byte) 0;
		this.aBoolean1671 = true;
		this.anInt1676 = -1;
		this.anInt1690 = -1;
		anInt1665 = 0;
		this.aStringArray1703 = new String[5];
		this.aByte1694 = (byte) -96;
		this.anInt1695 = -1;
		this.aBoolean1656 = false;
		this.aString1705 = "null";
		this.iconHeight = -1;
		this.aBoolean1706 = false;
	}
}
