/* Class120_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class LongNode extends Node {
	static String aString2424 = "rating: ";
	long value;
	static volatile boolean canvasReplaceRecommended = false;
	static GrandExchangeObject[] grandExchangeObjects = new GrandExchangeObject[6];
	static String aString2428 = "Loading config - ";

	static final boolean method1055(final int i, final int i_0_, final boolean bool_1_, final int i_2_, final GroundTile[][][] class120_sub18s) {
		final byte i_4_ = bool_1_ ? (byte) 1 : (byte) (0xff & InterfaceChangeNode.anInt3490);
		if (Class9.aByteArrayArrayArray70[Class173.gameLevel][i_0_][i_2_] == i_4_) {
			return false;
		}
		if ((0x4 & Class114.tileSettings[Class173.gameLevel][i_0_][i_2_]) == 0) {
			return false;
		}
		int i_5_ = 0;
		Class150.anIntArray1412[i_5_] = i_0_;
		int i_6_ = 0;
		Class120_Sub12.anIntArray2565[i_5_++] = i_2_;
		Class9.aByteArrayArrayArray70[Class173.gameLevel][i_0_][i_2_] = i_4_;
		while (i_5_ != i_6_) {
			final int i_7_ = 0xffff & Class150.anIntArray1412[i_6_];
			final int i_8_ = 0xff & Class150.anIntArray1412[i_6_] >> 16;
			final int i_9_ = 0xff & Class150.anIntArray1412[i_6_] >> 24;
			final int i_10_ = 0xff & Class120_Sub12.anIntArray2565[i_6_] >> 16;
			boolean bool_11_ = false;
			int i_12_ = Class120_Sub12.anIntArray2565[i_6_] & 0xffff;
			boolean bool_13_ = false;
			i_6_ = i_6_ - -1 & 0xfff;
			if ((Class114.tileSettings[Class173.gameLevel][i_7_][i_12_] & 0x4) == 0) {
				bool_11_ = true;
			}
			while_127_: for (int i_14_ = Class173.gameLevel - -1; i_14_ <= 3; i_14_++) {
				if ((0x8 & Class114.tileSettings[i_14_][i_7_][i_12_]) == 0) {
					if (bool_11_ && class120_sub18s[i_14_][i_7_][i_12_] != null) {
						if (class120_sub18s[i_14_][i_7_][i_12_].aClass182_2628 != null) {
							final int i_15_ = Class120_Sub12_Sub18.method1294(26957, i_8_);
							if (class120_sub18s[i_14_][i_7_][i_12_].aClass182_2628.anInt1799 == i_15_ || i_15_ == class120_sub18s[i_14_][i_7_][i_12_].aClass182_2628.anInt1792) {
								continue;
							}
							if (i_9_ != 0) {
								final int i_16_ = Class120_Sub12_Sub18.method1294(26957, i_9_);
								if (i_16_ == class120_sub18s[i_14_][i_7_][i_12_].aClass182_2628.anInt1799 || class120_sub18s[i_14_][i_7_][i_12_].aClass182_2628.anInt1792 == i_16_) {
									continue;
								}
							}
							if (i_10_ != 0) {
								final int i_17_ = Class120_Sub12_Sub18.method1294(26957, i_10_);
								if (class120_sub18s[i_14_][i_7_][i_12_].aClass182_2628.anInt1799 == i_17_ || i_17_ == class120_sub18s[i_14_][i_7_][i_12_].aClass182_2628.anInt1792) {
									continue;
								}
							}
						}
						if (class120_sub18s[i_14_][i_7_][i_12_].aClass28Array2625 != null) {
							for (int i_18_ = 0; class120_sub18s[i_14_][i_7_][i_12_].anInt2638 > i_18_; i_18_++) {
								int i_19_ = (int) (0x3fL & class120_sub18s[i_14_][i_7_][i_12_].aClass28Array2625[i_18_].bitPacked >> 14);
								final int i_20_ = (int) (0x3L & class120_sub18s[i_14_][i_7_][i_12_].aClass28Array2625[i_18_].bitPacked >> 20);
								if (i_19_ == 21) {
									i_19_ = 19;
								}
								final int i_21_ = i_20_ << 6 | i_19_;
								if (i_8_ == i_21_ || i_9_ != 0 && i_21_ == i_9_ || i_10_ != 0 && i_10_ == i_21_) {
									continue while_127_;
								}
							}
						}
					}
					bool_13_ = true;
					final GroundTile class120_sub18 = class120_sub18s[i_14_][i_7_][i_12_];
					if (class120_sub18 != null && class120_sub18.anInt2638 > 0) {
						for (int i_22_ = 0; i_22_ < class120_sub18.anInt2638; i_22_++) {
							final Class28 class28 = class120_sub18.aClass28Array2625[i_22_];
							if (class28.anInt182 != class28.anInt180 || class28.anInt175 != class28.anInt184) {
								for (int i_23_ = class28.anInt180; class28.anInt182 >= i_23_; i_23_++) {
									for (int i_24_ = class28.anInt184; i_24_ <= class28.anInt175; i_24_++) {
										Class9.aByteArrayArrayArray70[i_14_][i_23_][i_24_] = i_4_;
									}
								}
							}
						}
					}
					Class9.aByteArrayArrayArray70[i_14_][i_7_][i_12_] = i_4_;
				}
			}
			if (bool_13_) {
				if (Class134.anIntArray1284[i] < OverridedJInterface.tileHeightMap[Class173.gameLevel + 1][i_7_][i_12_]) {
					Class134.anIntArray1284[i] = OverridedJInterface.tileHeightMap[Class173.gameLevel + 1][i_7_][i_12_];
				}
				final int i_25_ = i_7_ << 7;
				final int i_26_ = i_12_ << 7;
				if (Class54.anIntArray488[i] <= i_25_) {
					if (i_25_ > IntegerNode.anIntArray2787[i]) {
						IntegerNode.anIntArray2787[i] = i_25_;
					}
				} else {
					Class54.anIntArray488[i] = i_25_;
				}
				if (i_26_ >= StringNode.anIntArray2735[i]) {
					if (i_26_ > AnimatedLocation.anIntArray3075[i]) {
						AnimatedLocation.anIntArray3075[i] = i_26_;
					}
				} else {
					StringNode.anIntArray2735[i] = i_26_;
				}
			}
			if (!bool_11_) {
				if (i_7_ >= 1 && Class9.aByteArrayArrayArray70[Class173.gameLevel][i_7_ + -1][i_12_] != i_4_) {
					Class150.anIntArray1412[i_5_] = Class191.method2512(Class191.method2512(1179648, i_7_ - 1), -754974720);
					Class120_Sub12.anIntArray2565[i_5_] = Class191.method2512(1245184, i_12_);
					i_5_ = 0xfff & 1 + i_5_;
					Class9.aByteArrayArrayArray70[Class173.gameLevel][i_7_ + -1][i_12_] = i_4_;
				}
				if (++i_12_ < 104) {
					if (i_7_ - 1 >= 0 && i_4_ != Class9.aByteArrayArrayArray70[Class173.gameLevel][-1 + i_7_][i_12_] && (Class114.tileSettings[Class173.gameLevel][i_7_][i_12_] & 0x4) == 0 && (Class114.tileSettings[Class173.gameLevel][-1 + i_7_][i_12_ - 1] & 0x4) == 0) {
						Class150.anIntArray1412[i_5_] = Class191.method2512(1375731712, Class191.method2512(-1 + i_7_, 1179648));
						Class120_Sub12.anIntArray2565[i_5_] = Class191.method2512(i_12_, 1245184);
						Class9.aByteArrayArrayArray70[Class173.gameLevel][-1 + i_7_][i_12_] = i_4_;
						i_5_ = 0xfff & 1 + i_5_;
					}
					if (i_4_ != Class9.aByteArrayArrayArray70[Class173.gameLevel][i_7_][i_12_]) {
						Class150.anIntArray1412[i_5_] = Class191.method2512(Class191.method2512(i_7_, 5373952), 318767104);
						Class120_Sub12.anIntArray2565[i_5_] = Class191.method2512(i_12_, 5439488);
						Class9.aByteArrayArrayArray70[Class173.gameLevel][i_7_][i_12_] = i_4_;
						i_5_ = i_5_ - -1 & 0xfff;
					}
					if (1 + i_7_ < 104 && i_4_ != Class9.aByteArrayArrayArray70[Class173.gameLevel][1 + i_7_][i_12_] && (Class114.tileSettings[Class173.gameLevel][i_7_][i_12_] & 0x4) == 0 && (Class114.tileSettings[Class173.gameLevel][1 + i_7_][-1 + i_12_] & 0x4) == 0) {
						Class150.anIntArray1412[i_5_] = Class191.method2512(Class191.method2512(5373952, i_7_ + 1), -1845493760);
						Class120_Sub12.anIntArray2565[i_5_] = Class191.method2512(5439488, i_12_);
						Class9.aByteArrayArrayArray70[Class173.gameLevel][1 + i_7_][i_12_] = i_4_;
						i_5_ = i_5_ - -1 & 0xfff;
					}
				}
				i_12_--;
				if (i_7_ + 1 < 104 && Class9.aByteArrayArrayArray70[Class173.gameLevel][1 + i_7_][i_12_] != i_4_) {
					Class150.anIntArray1412[i_5_] = Class191.method2512(1392508928, Class191.method2512(1 + i_7_, 9568256));
					Class120_Sub12.anIntArray2565[i_5_] = Class191.method2512(i_12_, 9633792);
					i_5_ = 0xfff & 1 + i_5_;
					Class9.aByteArrayArrayArray70[Class173.gameLevel][i_7_ - -1][i_12_] = i_4_;
				}
				if (--i_12_ >= 0) {
					if (-1 + i_7_ >= 0 && Class9.aByteArrayArrayArray70[Class173.gameLevel][i_7_ - 1][i_12_] != i_4_ && (Class114.tileSettings[Class173.gameLevel][i_7_][i_12_] & 0x4) == 0 && (0x4 & Class114.tileSettings[Class173.gameLevel][i_7_ - 1][1 + i_12_]) == 0) {
						Class150.anIntArray1412[i_5_] = Class191.method2512(301989888, Class191.method2512(13762560, i_7_ - 1));
						Class120_Sub12.anIntArray2565[i_5_] = Class191.method2512(13828096, i_12_);
						i_5_ = 1 + i_5_ & 0xfff;
						Class9.aByteArrayArrayArray70[Class173.gameLevel][-1 + i_7_][i_12_] = i_4_;
					}
					if (i_4_ != Class9.aByteArrayArrayArray70[Class173.gameLevel][i_7_][i_12_]) {
						Class150.anIntArray1412[i_5_] = Class191.method2512(-1828716544, Class191.method2512(13762560, i_7_));
						Class120_Sub12.anIntArray2565[i_5_] = Class191.method2512(13828096, i_12_);
						i_5_ = 0xfff & i_5_ + 1;
						Class9.aByteArrayArrayArray70[Class173.gameLevel][i_7_][i_12_] = i_4_;
					}
					if (i_7_ - -1 < 104 && Class9.aByteArrayArrayArray70[Class173.gameLevel][i_7_ + 1][i_12_] != i_4_ && (Class114.tileSettings[Class173.gameLevel][i_7_][i_12_] & 0x4) == 0 && (Class114.tileSettings[Class173.gameLevel][1 + i_7_][i_12_ - -1] & 0x4) == 0) {
						Class150.anIntArray1412[i_5_] = Class191.method2512(-771751936, Class191.method2512(1 + i_7_, 9568256));
						Class120_Sub12.anIntArray2565[i_5_] = Class191.method2512(i_12_, 9633792);
						i_5_ = 0xfff & 1 + i_5_;
						Class9.aByteArrayArrayArray70[Class173.gameLevel][i_7_ + 1][i_12_] = i_4_;
					}
				}
			}
		}
		if (-1000000 != Class134.anIntArray1284[i]) {
			Class134.anIntArray1284[i] += 10;
			Class54.anIntArray488[i] -= 50;
			IntegerNode.anIntArray2787[i] += 50;
			AnimatedLocation.anIntArray3075[i] += 50;
			StringNode.anIntArray2735[i] -= 50;
		}
		return true;
	}

	static final void method1056(int i, int i_27_, int i_28_, final int i_29_, final int i_30_, int i_31_) {
		try {
			int i_32_ = -i_28_ + i;
			int i_33_ = -i_27_ + i_31_;
			if (i_33_ != 0) {
				if (i_32_ == 0) {
					GZIPDecompressor.method717(i_27_, false, i_31_, i_30_, i_28_);
					return;
				}
			} else {
				if (i_32_ != 0) {
					ParticleManager.method939(i_27_, i_30_, i, (byte) -75, i_28_);
				}
				return;
			}
			if (i_29_ < (i_33_ ^ 0xffffffff)) {
				i_33_ = -i_33_;
			}
			if (i_32_ < 0) {
				i_32_ = -i_32_;
			}
			final boolean bool = i_32_ > i_33_;
			if (bool) {
				final int i_34_ = i_27_;
				i_27_ = i_28_;
				i_28_ = i_34_;
				final int i_35_ = i_31_;
				i_31_ = i;
				i = i_35_;
			}
			if (i_31_ < i_27_) {
				final int i_36_ = i_27_;
				i_27_ = i_31_;
				final int i_37_ = i_28_;
				i_28_ = i;
				i = i_37_;
				i_31_ = i_36_;
			}
			int i_38_ = i_28_;
			final int i_39_ = i_31_ + -i_27_;
			int i_40_ = i + -i_28_;
			final int i_41_ = i > i_28_ ? 1 : -1;
			if (i_40_ < 0) {
				i_40_ = -i_40_;
			}
			int i_42_ = -(i_39_ >> 1);
			if (bool) {
				for (int i_43_ = i_27_; i_43_ <= i_31_; i_43_++) {
					i_42_ += i_40_;
					GameEntity.anIntArrayArray3009[i_43_][i_38_] = i_30_;
					if (i_42_ > 0) {
						i_38_ += i_41_;
						i_42_ -= i_39_;
					}
				}
			} else {
				for (int i_44_ = i_27_; i_44_ <= i_31_; i_44_++) {
					i_42_ += i_40_;
					GameEntity.anIntArrayArray3009[i_38_][i_44_] = i_30_;
					if (i_42_ > 0) {
						i_38_ += i_41_;
						i_42_ -= i_39_;
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("bg.D(").append(i).append(',').append(i_27_).append(',').append(i_28_).append(',').append(i_29_).append(',').append(i_30_).append(',').append(i_31_).append(')').toString());
		}
	}

	static final void method1057(final Buffer class120_sub7, final int i_45_) {
		if (Class10.aClass193_78 != null) {
			try {
				Class10.aClass193_78.seek(0L);
				Class10.aClass193_78.write(class120_sub7.buf, i_45_, 24);
			} catch (final Exception exception) {
				/* empty */
			}
		}
	}

	public static void method1058(final int i) {
		try {
			grandExchangeObjects = null;
			aString2424 = null;
			aString2428 = null;
			if (i != 1) {
				method1058(58);
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("bg.A(").append(i).append(')').toString());
		}
	}

	static final void method1059(final int i, final int i_46_, final int i_47_, final int i_48_, final int i_49_, final int i_50_, final int i_51_, final int i_52_, final int i_53_, final boolean bool) {
		try {
			if (i_53_ == i_49_ && i_47_ == i_52_ && i_50_ == i_51_ && i_46_ == i) {
				method1056(i, i_53_, i_47_, -1, i_48_, i_51_);
			} else {
				int i_54_ = i_53_;
				int i_55_ = i_47_;
				final int i_56_ = 3 * i_53_;
				final int i_57_ = 3 * i_47_;
				final int i_58_ = 3 * i_49_;
				final int i_59_ = i_50_ * 3;
				final int i_60_ = i_52_ * 3;
				final int i_61_ = 3 * i_46_;
				final int i_62_ = -i_53_ + i_58_ + i_51_ + -i_59_;
				final int i_63_ = i_60_ + -i_61_ + i - i_47_;
				final int i_64_ = -i_58_ + i_59_ + -i_58_ - -i_56_;
				final int i_65_ = -i_60_ + i_61_ + -i_60_ - -i_57_;
				final int i_66_ = -i_57_ + i_60_;
				final int i_67_ = -i_56_ + i_58_;
				for (int i_68_ = 128; i_68_ <= 4096; i_68_ += 128) {
					final int i_69_ = i_68_ * i_68_ >> 12;
					final int i_70_ = i_68_ * i_69_ >> 12;
					final int i_71_ = i_70_ * i_62_;
					final int i_72_ = i_69_ * i_64_;
					final int i_73_ = i_67_ * i_68_;
					final int i_74_ = i_65_ * i_69_;
					final int i_75_ = (i_73_ + i_72_ + i_71_ >> 12) + i_53_;
					final int i_76_ = i_63_ * i_70_;
					final int i_77_ = i_66_ * i_68_;
					final int i_78_ = (i_77_ + i_76_ + i_74_ >> 12) + i_47_;
					method1056(i_78_, i_54_, i_55_, -1, i_48_, i_75_);
					i_54_ = i_75_;
					i_55_ = i_78_;
				}
			}
			if (!bool) {
				method1058(34);
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("bg.C(").append(i).append(',').append(i_46_).append(',').append(i_47_).append(',').append(i_48_).append(',').append(i_49_).append(',').append(i_50_).append(',').append(i_51_).append(',').append(i_52_).append(',')
					.append(i_53_).append(',').append(bool).append(')').toString());
		}
	}

	public LongNode() {
		/* empty */
	}

	LongNode(final long l) {
		this.value = l;
	}

	static final byte method1060(final char c) {
		byte i_80_;
		if (c > '\0' && c < '\u0080' || c >= '\u00a0' && c <= '\u00ff') {
			i_80_ = (byte) c;
		} else if (c != '\u20ac') {
			if (c != '\u201a') {
				if (c != '\u0192') {
					if (c != '\u201e') {
						if (c == '\u2026') {
							i_80_ = (byte) -123;
						} else if (c == '\u2020') {
							i_80_ = (byte) -122;
						} else if (c != '\u2021') {
							if (c == '\u02c6') {
								i_80_ = (byte) -120;
							} else if (c == '\u2030') {
								i_80_ = (byte) -119;
							} else if (c != '\u0160') {
								if (c == '\u2039') {
									i_80_ = (byte) -117;
								} else if (c == '\u0152') {
									i_80_ = (byte) -116;
								} else if (c != '\u017d') {
									if (c != '\u2018') {
										if (c == '\u2019') {
											i_80_ = (byte) -110;
										} else if (c != '\u201c') {
											if (c != '\u201d') {
												if (c == '\u2022') {
													i_80_ = (byte) -107;
												} else if (c != '\u2013') {
													if (c == '\u2014') {
														i_80_ = (byte) -105;
													} else if (c == '\u02dc') {
														i_80_ = (byte) -104;
													} else if (c != '\u2122') {
														if (c != '\u0161') {
															if (c != '\u203a') {
																if (c != '\u0153') {
																	if (c != '\u017e') {
																		if (c == '\u0178') {
																			i_80_ = (byte) -97;
																		} else {
																			i_80_ = (byte) 63;
																		}
																	} else {
																		i_80_ = (byte) -98;
																	}
																} else {
																	i_80_ = (byte) -100;
																}
															} else {
																i_80_ = (byte) -101;
															}
														} else {
															i_80_ = (byte) -102;
														}
													} else {
														i_80_ = (byte) -103;
													}
												} else {
													i_80_ = (byte) -106;
												}
											} else {
												i_80_ = (byte) -108;
											}
										} else {
											i_80_ = (byte) -109;
										}
									} else {
										i_80_ = (byte) -111;
									}
								} else {
									i_80_ = (byte) -114;
								}
							} else {
								i_80_ = (byte) -118;
							}
						} else {
							i_80_ = (byte) -121;
						}
					} else {
						i_80_ = (byte) -124;
					}
				} else {
					i_80_ = (byte) -125;
				}
			} else {
				i_80_ = (byte) -126;
			}
		} else {
			i_80_ = (byte) -128;
		}
		return i_80_;
	}
}
