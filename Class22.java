/* Class22 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class22 {
	Class120_Sub14_Sub10 aClass120_Sub14_Sub10_128;
	int anInt129;
	static Class127 aClass127_130;
	static Cache aClass21_131 = new Cache(64);
	static int anInt132;
	int[] anIntArray133;

	public static void method195(final int i) {
		try {
			aClass21_131 = null;
			if (i != -63361369) {
				method198(-8, -105, '\uffc0');
			}
			aClass127_130 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("cd.C(").append(i).append(')').toString());
		}
	}

	static final void method196(final float[][] fs, final int i, final byte i_0_, final int i_1_, final int i_2_, final int i_3_, final float[][] fs_4_, final int i_5_, final byte i_6_, final byte i_7_, final Class120_Sub9 class120_sub9, final boolean bool, final float[][] fs_8_, final int[][] is,
			final int i_9_, final int i_10_) {
		try {
			final int i_11_ = (i << 8) + 255;
			final int i_12_ = (i_5_ << 8) + 255;
			final int i_13_ = (i_3_ << 8) + 255;
			final int i_14_ = 255 + (i_2_ << 8);
			int[] is_15_ = null;
			final int[] is_16_ = Class120_Sub12_Sub4.anIntArrayArray3157[i_6_];
			final int[] is_17_ = new int[is_16_.length >> 1];
			for (int i_18_ = 0; is_17_.length > i_18_; i_18_++) {
				is_17_[i_18_] = Class120_Sub14_Sub22.method1634(fs_4_, is_16_[1 + i_18_ + i_18_], i_10_, is, fs_8_, null, class120_sub9, i_11_, i_9_, false, 0.0F, fs, i_7_, is_16_[i_18_ + i_18_], 75, i_14_, i_13_, i_12_);
			}
			while_9_: do {
				if (bool) {
					final byte i_19_ = i_6_;
					while_8_: do {
						while_7_: do {
							while_6_: do {
								while_5_: do {
									while_4_: do {
										while_3_: do {
											while_2_: do {
												while_1_: do {
													do {
														if (i_19_ != 1) {
															if (i_19_ != 2) {
																if (i_19_ != 3) {
																	if (i_19_ != 4) {
																		if (i_19_ != 5) {
																			if (i_19_ != 6) {
																				if (i_19_ != 7) {
																					if (i_19_ != 8) {
																						if (i_19_ != 9) {
																							if (i_19_ != 10) {
																								if (i_19_ == 11) {
																									break while_8_;
																								}
																								break while_9_;
																							}
																						} else {
																							break while_6_;
																						}
																						break while_7_;
																					}
																				} else {
																					break while_4_;
																				}
																				break while_5_;
																			}
																		} else {
																			break while_2_;
																		}
																		break while_3_;
																	}
																} else {
																	break;
																}
																break while_1_;
															}
														} else {
															is_15_ = new int[6];
															final int i_20_ = Class120_Sub14_Sub22.method1634(fs_4_, 128, i_10_, is, fs_8_, null, class120_sub9, i_11_, i_9_, true, 0.0F, fs, i_7_, 64, 98, i_14_, i_13_, i_12_);
															final int i_21_ = Class120_Sub14_Sub22.method1634(fs_4_, 64, i_10_, is, fs_8_, null, class120_sub9, i_11_, i_9_, true, 0.0F, fs, i_7_, 128, 81, i_14_, i_13_, i_12_);
															is_15_[2] = is_17_[2];
															is_15_[0] = i_21_;
															is_15_[5] = is_17_[2];
															is_15_[3] = i_20_;
															is_15_[1] = i_20_;
															is_15_[4] = is_17_[0];
															break while_9_;
														}
														final int i_22_ = Class120_Sub14_Sub22.method1634(fs_4_, 128, i_10_, is, fs_8_, null, class120_sub9, i_11_, i_9_, true, 0.0F, fs, i_7_, 128, 75, i_14_, i_13_, i_12_);
														is_15_ = new int[6];
														final int i_23_ = Class120_Sub14_Sub22.method1634(fs_4_, 0, i_10_, is, fs_8_, null, class120_sub9, i_11_, i_9_, true, 0.0F, fs, i_7_, 64, 126, i_14_, i_13_, i_12_);
														is_15_[1] = i_23_;
														is_15_[3] = i_22_;
														is_15_[4] = is_17_[1];
														is_15_[0] = is_17_[0];
														is_15_[2] = i_22_;
														is_15_[5] = is_17_[0];
														break while_9_;
													} while (false);
													is_15_ = new int[6];
													final int i_24_ = Class120_Sub14_Sub22.method1634(fs_4_, 128, i_10_, is, fs_8_, null, class120_sub9, i_11_, i_9_, true, 0.0F, fs, i_7_, 0, 87, i_14_, i_13_, i_12_);
													final int i_25_ = Class120_Sub14_Sub22.method1634(fs_4_, 0, i_10_, is, fs_8_, null, class120_sub9, i_11_, i_9_, true, 0.0F, fs, i_7_, 64, 38, i_14_, i_13_, i_12_);
													is_15_[1] = is_17_[1];
													is_15_[4] = i_25_;
													is_15_[0] = is_17_[2];
													is_15_[3] = i_24_;
													is_15_[2] = i_24_;
													is_15_[5] = is_17_[2];
													break while_9_;
												} while (false);
												is_15_ = new int[3];
												final int i_26_ = Class120_Sub14_Sub22.method1634(fs_4_, 128, i_10_, is, fs_8_, null, class120_sub9, i_11_, i_9_, true, 0.0F, fs, i_7_, 0, 67, i_14_, i_13_, i_12_);
												is_15_[0] = is_17_[3];
												is_15_[1] = i_26_;
												is_15_[2] = is_17_[0];
												break while_9_;
											} while (false);
											final int i_27_ = Class120_Sub14_Sub22.method1634(fs_4_, 128, i_10_, is, fs_8_, null, class120_sub9, i_11_, i_9_, true, 0.0F, fs, i_7_, 128, 102, i_14_, i_13_, i_12_);
											is_15_ = new int[3];
											is_15_[1] = i_27_;
											is_15_[0] = is_17_[2];
											is_15_[2] = is_17_[3];
											break while_9_;
										} while (false);
										is_15_ = new int[6];
										final int i_28_ = Class120_Sub14_Sub22.method1634(fs_4_, 0, i_10_, is, fs_8_, null, class120_sub9, i_11_, i_9_, true, 0.0F, fs, i_7_, 128, 126, i_14_, i_13_, i_12_);
										final int i_29_ = Class120_Sub14_Sub22.method1634(fs_4_, 128, i_10_, is, fs_8_, null, class120_sub9, i_11_, i_9_, true, 0.0F, fs, i_7_, 128, 108, i_14_, i_13_, i_12_);
										is_15_[1] = i_28_;
										is_15_[0] = is_17_[3];
										is_15_[4] = is_17_[0];
										is_15_[3] = i_29_;
										is_15_[2] = i_29_;
										is_15_[5] = is_17_[3];
										break while_9_;
									} while (false);
									is_15_ = new int[6];
									final int i_30_ = Class120_Sub14_Sub22.method1634(fs_4_, 128, i_10_, is, fs_8_, null, class120_sub9, i_11_, i_9_, true, 0.0F, fs, i_7_, 0, 80, i_14_, i_13_, i_12_);
									final int i_31_ = Class120_Sub14_Sub22.method1634(fs_4_, 0, i_10_, is, fs_8_, null, class120_sub9, i_11_, i_9_, true, 0.0F, fs, i_7_, 128, 59, i_14_, i_13_, i_12_);
									is_15_[2] = i_30_;
									is_15_[0] = is_17_[1];
									is_15_[3] = i_30_;
									is_15_[4] = is_17_[2];
									is_15_[1] = i_31_;
									is_15_[5] = is_17_[1];
									break while_9_;
								} while (false);
								is_15_ = new int[3];
								final int i_32_ = Class120_Sub14_Sub22.method1634(fs_4_, 0, i_10_, is, fs_8_, null, class120_sub9, i_11_, i_9_, true, 0.0F, fs, i_7_, 0, 126, i_14_, i_13_, i_12_);
								is_15_[0] = is_17_[3];
								is_15_[1] = i_32_;
								is_15_[2] = is_17_[4];
								break while_9_;
							} while (false);
							final int i_33_ = Class120_Sub14_Sub22.method1634(fs_4_, 64, i_10_, is, fs_8_, null, class120_sub9, i_11_, i_9_, true, 0.0F, fs, i_7_, 128, 117, i_14_, i_13_, i_12_);
							final int i_34_ = Class120_Sub14_Sub22.method1634(fs_4_, 32, i_10_, is, fs_8_, null, class120_sub9, i_11_, i_9_, true, 0.0F, fs, i_7_, 96, 51, i_14_, i_13_, i_12_);
							final int i_35_ = Class120_Sub14_Sub22.method1634(fs_4_, 0, i_10_, is, fs_8_, null, class120_sub9, i_11_, i_9_, true, 0.0F, fs, i_7_, 64, 68, i_14_, i_13_, i_12_);
							is_15_ = new int[15];
							is_15_[2] = is_17_[4];
							is_15_[0] = i_34_;
							is_15_[6] = i_34_;
							is_15_[4] = is_17_[4];
							is_15_[12] = i_34_;
							is_15_[14] = i_35_;
							is_15_[10] = is_17_[2];
							is_15_[1] = i_33_;
							is_15_[8] = is_17_[2];
							is_15_[9] = i_34_;
							is_15_[13] = is_17_[1];
							is_15_[3] = i_34_;
							is_15_[7] = is_17_[3];
							is_15_[11] = is_17_[1];
							is_15_[5] = is_17_[3];
							break while_9_;
						} while (false);
						is_15_ = new int[9];
						final int i_36_ = Class120_Sub14_Sub22.method1634(fs_4_, 128, i_10_, is, fs_8_, null, class120_sub9, i_11_, i_9_, true, 0.0F, fs, i_7_, 0, 22, i_14_, i_13_, i_12_);
						is_15_[0] = is_17_[2];
						is_15_[7] = i_36_;
						is_15_[4] = i_36_;
						is_15_[6] = is_17_[4];
						is_15_[8] = is_17_[0];
						is_15_[2] = is_17_[3];
						is_15_[1] = i_36_;
						is_15_[5] = is_17_[4];
						is_15_[3] = is_17_[3];
						break while_9_;
					} while (false);
					is_15_ = new int[12];
					final int i_37_ = Class120_Sub14_Sub22.method1634(fs_4_, 64, i_10_, is, fs_8_, null, class120_sub9, i_11_, i_9_, true, 0.0F, fs, i_7_, 0, 32, i_14_, i_13_, i_12_);
					final int i_38_ = Class120_Sub14_Sub22.method1634(fs_4_, 64, i_10_, is, fs_8_, null, class120_sub9, i_11_, i_9_, true, 0.0F, fs, i_7_, 128, 110, i_14_, i_13_, i_12_);
					is_15_[0] = is_17_[3];
					is_15_[11] = i_38_;
					is_15_[3] = is_17_[3];
					is_15_[7] = i_38_;
					is_15_[1] = i_37_;
					is_15_[10] = is_17_[1];
					is_15_[5] = i_37_;
					is_15_[8] = i_37_;
					is_15_[2] = is_17_[0];
					is_15_[9] = is_17_[2];
					is_15_[4] = is_17_[2];
					is_15_[6] = is_17_[2];
				}
			} while (false);
			class120_sub9.method1165(i_1_, i_9_, i_10_, is_17_, is_15_, false);
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, "cd.E(");
		}
	}

	static final int method197(final int i_40_, final int i_39_, final int i) {
		if (Class120_Sub26.anIntArrayArrayArray2741 == null) {
			return 0;
		}
		final int i_42_ = i_39_ >> 7;
		final int i_43_ = i >> 7;
		if (i_42_ < 0 || i_43_ < 0 || i_42_ > 103 || i_43_ > 103) {
			return 0;
		}
		int i_44_ = i_40_;
		if (i_44_ < 3 && (0x2 & Class114.aByteArrayArrayArray1095[1][i_42_][i_43_]) == 2) {
			i_44_++;
		}
		final int i_45_ = i & 0x7f;
		final int i_46_ = i_39_ & 0x7f;
		final int i_47_ = Class120_Sub26.anIntArrayArrayArray2741[i_44_][i_42_][i_43_] * (-i_46_ + 128) - -(i_46_ * Class120_Sub26.anIntArrayArrayArray2741[i_44_][i_42_ + 1][i_43_]) >> 7;
		final int i_48_ = Class120_Sub26.anIntArrayArrayArray2741[i_44_][i_42_ + 1][i_43_ - -1] * i_46_ + (128 - i_46_) * Class120_Sub26.anIntArrayArrayArray2741[i_44_][i_42_][1 + i_43_] >> 7;
		return i_48_ * i_45_ + i_47_ * (128 + -i_45_) >> 7;
	}

	static final char method198(final int i, final int i_49_, final char c) {
		char c_50_;
		try {
			if (c >= '\u00c0' && c <= '\u00ff') {
				if (c >= '\u00c0' && c <= '\u00c6') {
					return 'A';
				}
				if (c == '\u00c7') {
					return 'C';
				}
				if (c >= '\u00c8' && c <= '\u00cb') {
					return 'E';
				}
				if (c >= '\u00cc' && c <= '\u00cf') {
					return 'I';
				}
				if (c == '\u00d1' && i_49_ != 0) {
					return 'N';
				}
				if (c >= '\u00d2' && c <= '\u00d6') {
					return 'O';
				}
				if (c >= '\u00d9' && c <= '\u00dc') {
					return 'U';
				}
				if (c == '\u00dd') {
					return 'Y';
				}
				if (c == '\u00df') {
					return 's';
				}
				if (c >= '\u00e0' && c <= '\u00e6') {
					return 'a';
				}
				if (c == '\u00e7') {
					return 'c';
				}
				if (c >= '\u00e8' && c <= '\u00eb') {
					return 'e';
				}
				if (c >= '\u00ec' && c <= '\u00ef') {
					return 'i';
				}
				if (c == '\u00f1' && i_49_ != 0) {
					return 'n';
				}
				if (c >= '\u00f2' && c <= '\u00f6') {
					return 'o';
				}
				if (c >= '\u00f9' && c <= '\u00fc') {
					return 'u';
				}
				if (c == '\u00fd' || c == '\u00ff') {
					return 'y';
				}
			}
			if (c == '\u0152') {
				return 'O';
			}
			if (c == '\u0153') {
				return 'o';
			}
			if (c == '\u0178') {
				return 'Y';
			}
			c_50_ = c;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("cd.D(").append(i).append(',').append(i_49_).append(',').append(c).append(')').toString());
		}
		return c_50_;
	}

	static final void method199(final int i, final int i_51_, final boolean bool) {
		try {
			if (i != Class120_Sub12_Sub7.anInt3178) {
				Class90.anIntArray849 = new int[i];
				for (int i_52_ = 0; i > i_52_; i_52_++) {
					Class90.anIntArray849[i_52_] = (i_52_ << 12) / i;
				}
				Class32.anInt259 = i + -1;
				Class120_Sub12_Sub7.anInt3178 = i;
				Class120_Sub12_Sub26.anInt3331 = i * 32;
			}
			if (i_51_ != Class120_Sub12_Sub2.anInt3145) {
				if (i_51_ != Class120_Sub12_Sub7.anInt3178) {
					Class150.anIntArray1405 = new int[i_51_];
					for (int i_53_ = 0; i_53_ < i_51_; i_53_++) {
						Class150.anIntArray1405[i_53_] = (i_53_ << 12) / i_51_;
					}
				} else {
					Class150.anIntArray1405 = Class90.anIntArray849;
				}
				Class120_Sub29.anInt2774 = -1 + i_51_;
				Class120_Sub12_Sub2.anInt3145 = i_51_;
			}
			if (bool) {
				aClass127_130 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("cd.A(").append(i).append(',').append(i_51_).append(',').append(bool).append(')').toString());
		}
	}

	public Class22() {
		/* empty */
	}
}
