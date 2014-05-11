/* Class120_Sub12_Sub39 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class120_Sub12_Sub39 extends Class120_Sub12 {
	static int[] spriteHeights;
	private int[][] anIntArrayArray3443;
	static float aFloat3444;
	private final int[] anIntArray3445 = new int[257];

	private final void method1398(final int i, final byte i_0_) {
		while_104_: do {
			try {
				if (i != 0) {
					final int i_1_ = i;
					while_103_: do {
						while_102_: do {
							while_101_: do {
								while_100_: do {
									do {
										if (i_1_ != 1) {
											if (i_1_ != 2) {
												if (i_1_ != 3) {
													if (i_1_ != 4) {
														if (i_1_ != 5) {
															if (i_1_ != 6) {
																break while_103_;
															}
														} else {
															break while_101_;
														}
														break while_102_;
													}
												} else {
													break;
												}
												break while_100_;
											}
										} else {
											anIntArrayArray3443 = new int[2][4];
											anIntArrayArray3443[0][0] = 0;
											anIntArrayArray3443[0][3] = 0;
											anIntArrayArray3443[0][1] = 0;
											anIntArrayArray3443[1][0] = 4096;
											anIntArrayArray3443[0][2] = 0;
											anIntArrayArray3443[1][2] = 4096;
											anIntArrayArray3443[1][1] = 4096;
											anIntArrayArray3443[1][3] = 4096;
											break while_104_;
										}
										anIntArrayArray3443 = new int[8][4];
										anIntArrayArray3443[0][0] = 0;
										anIntArrayArray3443[0][1] = 2650;
										anIntArrayArray3443[0][2] = 2602;
										anIntArrayArray3443[1][0] = 2867;
										anIntArrayArray3443[2][0] = 3072;
										anIntArrayArray3443[1][2] = 1799;
										anIntArrayArray3443[1][1] = 2313;
										anIntArrayArray3443[2][2] = 1734;
										anIntArrayArray3443[3][2] = 1220;
										anIntArrayArray3443[4][2] = 963;
										anIntArrayArray3443[0][3] = 2361;
										anIntArrayArray3443[5][2] = 2152;
										anIntArrayArray3443[3][0] = 3276;
										anIntArrayArray3443[2][1] = 2618;
										anIntArrayArray3443[6][2] = 1060;
										anIntArrayArray3443[4][0] = 3481;
										anIntArrayArray3443[1][3] = 1558;
										anIntArrayArray3443[7][2] = 1413;
										anIntArrayArray3443[5][0] = 3686;
										anIntArrayArray3443[6][0] = 3891;
										anIntArrayArray3443[7][0] = 4096;
										anIntArrayArray3443[3][1] = 2296;
										anIntArrayArray3443[2][3] = 1413;
										anIntArrayArray3443[3][3] = 947;
										anIntArrayArray3443[4][1] = 2072;
										anIntArrayArray3443[5][1] = 2730;
										anIntArrayArray3443[6][1] = 2232;
										anIntArrayArray3443[7][1] = 1686;
										anIntArrayArray3443[4][3] = 722;
										anIntArrayArray3443[5][3] = 1766;
										anIntArrayArray3443[6][3] = 915;
										anIntArrayArray3443[7][3] = 1140;
										break while_104_;
									} while (false);
									anIntArrayArray3443 = new int[7][4];
									anIntArrayArray3443[0][3] = 4096;
									anIntArrayArray3443[0][2] = 0;
									anIntArrayArray3443[1][3] = 4096;
									anIntArrayArray3443[2][3] = 0;
									anIntArrayArray3443[0][0] = 0;
									anIntArrayArray3443[3][3] = 0;
									anIntArrayArray3443[4][3] = 0;
									anIntArrayArray3443[1][2] = 4096;
									anIntArrayArray3443[2][2] = 4096;
									anIntArrayArray3443[5][3] = 4096;
									anIntArrayArray3443[3][2] = 4096;
									anIntArrayArray3443[0][1] = 0;
									anIntArrayArray3443[1][0] = 663;
									anIntArrayArray3443[1][1] = 0;
									anIntArrayArray3443[6][3] = 4096;
									anIntArrayArray3443[2][1] = 0;
									anIntArrayArray3443[4][2] = 0;
									anIntArrayArray3443[5][2] = 0;
									anIntArrayArray3443[2][0] = 1363;
									anIntArrayArray3443[3][0] = 2048;
									anIntArrayArray3443[3][1] = 4096;
									anIntArrayArray3443[4][0] = 2727;
									anIntArrayArray3443[6][2] = 0;
									anIntArrayArray3443[4][1] = 4096;
									anIntArrayArray3443[5][0] = 3411;
									anIntArrayArray3443[6][0] = 4096;
									anIntArrayArray3443[5][1] = 4096;
									anIntArrayArray3443[6][1] = 0;
									break while_104_;
								} while (false);
								anIntArrayArray3443 = new int[6][4];
								anIntArrayArray3443[0][0] = 0;
								anIntArrayArray3443[0][1] = 0;
								anIntArrayArray3443[0][2] = 0;
								anIntArrayArray3443[1][2] = 0;
								anIntArrayArray3443[0][3] = 0;
								anIntArrayArray3443[1][0] = 1843;
								anIntArrayArray3443[1][1] = 0;
								anIntArrayArray3443[2][0] = 2457;
								anIntArrayArray3443[1][3] = 1493;
								anIntArrayArray3443[2][1] = 0;
								anIntArrayArray3443[3][1] = 0;
								anIntArrayArray3443[2][2] = 0;
								anIntArrayArray3443[3][2] = 1124;
								anIntArrayArray3443[3][0] = 2781;
								anIntArrayArray3443[2][3] = 2939;
								anIntArrayArray3443[3][3] = 3565;
								anIntArrayArray3443[4][0] = 3481;
								anIntArrayArray3443[5][0] = 4096;
								anIntArrayArray3443[4][3] = 4031;
								anIntArrayArray3443[4][2] = 3084;
								anIntArrayArray3443[4][1] = 546;
								anIntArrayArray3443[5][2] = 4096;
								anIntArrayArray3443[5][3] = 4096;
								anIntArrayArray3443[5][1] = 4096;
								break while_104_;
							} while (false);
							anIntArrayArray3443 = new int[16][4];
							anIntArrayArray3443[0][2] = 192;
							anIntArrayArray3443[0][1] = 80;
							anIntArrayArray3443[0][3] = 321;
							anIntArrayArray3443[0][0] = 0;
							anIntArrayArray3443[1][2] = 449;
							anIntArrayArray3443[1][1] = 321;
							anIntArrayArray3443[2][1] = 578;
							anIntArrayArray3443[1][3] = 562;
							anIntArrayArray3443[2][2] = 690;
							anIntArrayArray3443[2][3] = 803;
							anIntArrayArray3443[3][3] = 1140;
							anIntArrayArray3443[3][1] = 947;
							anIntArrayArray3443[3][2] = 995;
							anIntArrayArray3443[1][0] = 155;
							anIntArrayArray3443[2][0] = 389;
							anIntArrayArray3443[3][0] = 671;
							anIntArrayArray3443[4][2] = 1397;
							anIntArrayArray3443[5][2] = 1429;
							anIntArrayArray3443[4][0] = 897;
							anIntArrayArray3443[4][3] = 1509;
							anIntArrayArray3443[6][2] = 1461;
							anIntArrayArray3443[5][3] = 1413;
							anIntArrayArray3443[4][1] = 1285;
							anIntArrayArray3443[6][3] = 1333;
							anIntArrayArray3443[5][0] = 1175;
							anIntArrayArray3443[7][3] = 1702;
							anIntArrayArray3443[8][3] = 2056;
							anIntArrayArray3443[6][0] = 1368;
							anIntArrayArray3443[9][3] = 2666;
							anIntArrayArray3443[10][3] = 3276;
							anIntArrayArray3443[5][1] = 1525;
							anIntArrayArray3443[7][0] = 1507;
							anIntArrayArray3443[7][2] = 1525;
							anIntArrayArray3443[6][1] = 1734;
							anIntArrayArray3443[11][3] = 3228;
							anIntArrayArray3443[8][0] = 1736;
							anIntArrayArray3443[9][0] = 2088;
							anIntArrayArray3443[7][1] = 1413;
							anIntArrayArray3443[8][2] = 1590;
							anIntArrayArray3443[9][2] = 2056;
							anIntArrayArray3443[8][1] = 1108;
							anIntArrayArray3443[10][0] = 2355;
							anIntArrayArray3443[9][1] = 1766;
							anIntArrayArray3443[11][0] = 2691;
							anIntArrayArray3443[10][1] = 2409;
							anIntArrayArray3443[12][0] = 3031;
							anIntArrayArray3443[13][0] = 3522;
							anIntArrayArray3443[10][2] = 2586;
							anIntArrayArray3443[11][1] = 3116;
							anIntArrayArray3443[11][2] = 3148;
							anIntArrayArray3443[12][3] = 3196;
							anIntArrayArray3443[14][0] = 3727;
							anIntArrayArray3443[15][0] = 4096;
							anIntArrayArray3443[12][2] = 3710;
							anIntArrayArray3443[13][3] = 3019;
							anIntArrayArray3443[13][2] = 3421;
							anIntArrayArray3443[12][1] = 3806;
							anIntArrayArray3443[14][3] = 3228;
							anIntArrayArray3443[15][3] = 2746;
							anIntArrayArray3443[13][1] = 3437;
							anIntArrayArray3443[14][1] = 3116;
							anIntArrayArray3443[15][1] = 2377;
							anIntArrayArray3443[14][2] = 3148;
							anIntArrayArray3443[15][2] = 2505;
							break while_104_;
						} while (false);
						anIntArrayArray3443 = new int[4][4];
						anIntArrayArray3443[0][3] = 0;
						anIntArrayArray3443[0][1] = 0;
						anIntArrayArray3443[1][3] = 0;
						anIntArrayArray3443[0][2] = 4096;
						anIntArrayArray3443[1][2] = 4096;
						anIntArrayArray3443[2][3] = 0;
						anIntArrayArray3443[2][2] = 4096;
						anIntArrayArray3443[0][0] = 2048;
						anIntArrayArray3443[3][3] = 0;
						anIntArrayArray3443[1][1] = 4096;
						anIntArrayArray3443[3][2] = 0;
						anIntArrayArray3443[1][0] = 2867;
						anIntArrayArray3443[2][1] = 4096;
						anIntArrayArray3443[3][1] = 4096;
						anIntArrayArray3443[2][0] = 3276;
						anIntArrayArray3443[3][0] = 4096;
						break while_104_;
					} while (false);
					throw new RuntimeException("Invalid gradient preset");
				}
			} catch (final RuntimeException runtimeexception) {
				throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("vm.R(").append(i).append(',').append(i_0_).append(')').toString());
			}
		} while (false);
	}

	private final void method1399(final int i) {
		try {
			final int i_2_ = anIntArrayArray3443.length;
			if (i >= 33 && i_2_ > 0) {
				for (int i_3_ = 0; i_3_ < 257; i_3_++) {
					int i_4_ = 0;
					final int i_5_ = i_3_ << 4;
					for (int i_6_ = 0; i_2_ > i_6_ && i_5_ >= anIntArrayArray3443[i_6_][0]; i_6_++) {
						i_4_++;
					}
					int i_7_;
					int i_8_;
					int i_9_;
					if (i_2_ <= i_4_) {
						final int[] is = anIntArrayArray3443[-1 + i_2_];
						i_9_ = is[3];
						i_8_ = is[1];
						i_7_ = is[2];
					} else {
						final int[] is = anIntArrayArray3443[i_4_];
						if (i_4_ <= 0) {
							i_7_ = is[2];
							i_8_ = is[1];
							i_9_ = is[3];
						} else {
							final int[] is_10_ = anIntArrayArray3443[i_4_ + -1];
							final int i_11_ = (-is_10_[0] + i_5_ << 12) / (is[0] - is_10_[0]);
							final int i_12_ = -i_11_ + 4096;
							i_7_ = i_11_ * is[2] + is_10_[2] * i_12_ >> 12;
							i_8_ = is[1] * i_11_ + i_12_ * is_10_[1] >> 12;
							i_9_ = is[3] * i_11_ - -(is_10_[3] * i_12_) >> 12;
						}
					}
					i_7_ >>= 4;
					if (i_7_ < 0) {
						i_7_ = 0;
					} else if (i_7_ > 255) {
						i_7_ = 255;
					}
					i_9_ >>= 4;
					i_8_ >>= 4;
					if (i_8_ >= 0) {
						if (i_8_ > 255) {
							i_8_ = 255;
						}
					} else {
						i_8_ = 0;
					}
					if (i_9_ >= 0) {
						if (i_9_ > 255) {
							i_9_ = 255;
						}
					} else {
						i_9_ = 0;
					}
					anIntArray3445[i_3_] = Class191.method2512(i_9_, Class191.method2512(i_7_ << 8, i_8_ << 16));
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("vm.U(").append(i).append(')').toString());
		}
	}

	static final boolean method1400(final Class120_Sub30_Sub2 class120_sub30_sub2, final Class50 class50, final Class50 class50_13_, final boolean bool, final Class50 class50_14_) {
		boolean bool_15_;
		try {
			Class30.aClass120_Sub30_Sub2_234 = class120_sub30_sub2;
			if (bool) {
				method1401(41);
			}
			Class57.aClass50_499 = class50;
			Class120_Sub29.aClass50_2770 = class50_14_;
			Class52.aClass50_469 = class50_13_;
			bool_15_ = true;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("vm.S(").append(class120_sub30_sub2 != null ? "{...}" : "null").append(',').append(class50 != null ? "{...}" : "null").append(',').append(class50_13_ != null ? "{...}" : "null").append(',').append(bool).append(',')
					.append(class50_14_ != null ? "{...}" : "null").append(')').toString());
		}
		return bool_15_;
	}

	@Override
	final void method1193(final byte i) {
		try {
			if (anIntArrayArray3443 == null) {
				method1398(1, (byte) -68);
			}
			method1399(43);
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("vm.O(").append(i).append(')').toString());
		}
	}

	public static void method1401(final int i) {
		try {
			if (i < 108) {
				method1400(null, null, null, true, null);
			}
			spriteHeights = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("vm.V(").append(i).append(')').toString());
		}
	}

	@Override
	final void method1180(final byte i, final Buffer class120_sub7, final int i_16_) {
		try {
			if (i == -43 && i_16_ == 0) {
				final int i_17_ = class120_sub7.getUByte();
				if (i_17_ != 0) {
					method1398(i_17_, (byte) 121);
				} else {
					anIntArrayArray3443 = new int[class120_sub7.getUByte()][4];
					for (int i_18_ = 0; anIntArrayArray3443.length > i_18_; i_18_++) {
						anIntArrayArray3443[i_18_][0] = class120_sub7.getUShort();
						anIntArrayArray3443[i_18_][1] = class120_sub7.getUByte() << 4;
						anIntArrayArray3443[i_18_][2] = class120_sub7.getUByte() << 4;
						anIntArrayArray3443[i_18_][3] = class120_sub7.getUByte() << 4;
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("vm.M(").append(i).append(',').append(class120_sub7 != null ? "{...}" : "null").append(',').append(i_16_).append(')').toString());
		}
	}

	static final void method1402(final int i, final int i_19_) {
		try {
			if (i != 3) {
				spriteHeights = null;
			}
			synchronized (Class120_Sub14_Sub4.mouseHandler) {
				Class136.anInt1320 = i_19_;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("vm.T(").append(i).append(',').append(i_19_).append(')').toString());
		}
	}

	public Class120_Sub12_Sub39() {
		super(1, false);
	}

	@Override
	final int[][] method1188(final int i, final int i_20_) {
		int[][] is;
		try {
			if (i_20_ != -29869) {
				method1399(118);
			}
			final int[][] is_21_ = this.aClass109_2559.method975(i, i_20_ ^ 0x74fa);
			if (this.aClass109_2559.aBoolean1049) {
				final int[] is_22_ = method1192(-7764, i, 0);
				final int[] is_23_ = is_21_[1];
				final int[] is_24_ = is_21_[2];
				final int[] is_25_ = is_21_[0];
				for (int i_26_ = 0; Class120_Sub12_Sub7.anInt3178 > i_26_; i_26_++) {
					int i_27_ = is_22_[i_26_] >> 4;
					if (i_27_ < 0) {
						i_27_ = 0;
					}
					if (i_27_ > 256) {
						i_27_ = 256;
					}
					i_27_ = anIntArray3445[i_27_];
					is_25_[i_26_] = Class120_Sub12_Sub3.method1207(16711680, i_27_) >> 12;
					is_23_[i_26_] = Class120_Sub12_Sub3.method1207(i_27_, 65280) >> 4;
					is_24_[i_26_] = Class120_Sub12_Sub3.method1207(i_27_ << 4, 4080);
				}
			}
			is = is_21_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("vm.K(").append(i).append(',').append(i_20_).append(')').toString());
		}
		return is;
	}
}
