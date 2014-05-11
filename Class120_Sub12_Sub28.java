/* Class120_Sub12_Sub28 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class120_Sub12_Sub28 extends Class120_Sub12 {
	private int anInt3355 = 10;
	private int anInt3356 = 2048;
	private int anInt3357 = 0;
	private int[] anIntArray3358;
	private int[] anIntArray3359;
	static String aString3360 = "Ok";
	static int anInt3361 = 0;

	static final void method1344(final Class25[] class25s, final byte i, final int[][][] is, final boolean bool) {
		try {
			int i_0_;
			if (!bool) {
				i_0_ = 4;
			} else {
				i_0_ = 1;
			}
			if (!bool) {
				for (int i_1_ = 0; i_1_ < 4; i_1_++) {
					for (int i_2_ = 0; i_2_ < 104; i_2_++) {
						for (int i_3_ = 0; i_3_ < 104; i_3_++) {
							if ((0x1 & Class114.aByteArrayArrayArray1095[i_1_][i_2_][i_3_]) == 1) {
								int i_4_ = i_1_;
								if ((0x2 & Class114.aByteArrayArrayArray1095[1][i_2_][i_3_]) == 2) {
									i_4_--;
								}
								if (i_4_ >= 0) {
									class25s[i_4_].method226(i_2_, i_3_, (byte) -90);
								}
							}
						}
					}
				}
				Class120_Sub12_Sub27.anInt3350 += -2 + (int) (Math.random() * 5.0);
				Class120_Sub14_Sub3_Sub1.anInt3918 += -2 + (int) (Math.random() * 5.0);
				if (Class120_Sub12_Sub27.anInt3350 < -8) {
					Class120_Sub12_Sub27.anInt3350 = -8;
				}
				if (Class120_Sub12_Sub27.anInt3350 > 8) {
					Class120_Sub12_Sub27.anInt3350 = 8;
				}
				if (Class120_Sub14_Sub3_Sub1.anInt3918 < -16) {
					Class120_Sub14_Sub3_Sub1.anInt3918 = -16;
				}
				if (Class120_Sub14_Sub3_Sub1.anInt3918 > 16) {
					Class120_Sub14_Sub3_Sub1.anInt3918 = 16;
				}
			}
			if (i == 71) {
				final int i_5_ = Class120_Sub12_Sub27.anInt3350 >> 2 << 10;
				final int[][] is_6_ = new int[104][104];
				final int i_7_ = Class120_Sub14_Sub3_Sub1.anInt3918 >> 1;
				final int[][] is_8_ = new int[104][104];
				for (int i_9_ = 0; i_0_ > i_9_; i_9_++) {
					final byte[][] is_10_ = Npc.aByteArrayArrayArray3754[i_9_];
					if (HDToolkit.glEnabled) {
						if (Class120_Sub12_Sub6.highLightingDetail) {
							for (int i_11_ = 1; i_11_ < 103; i_11_++) {
								for (int i_12_ = 1; i_12_ < 103; i_12_++) {
									final int i_14_ = (is_10_[i_12_][i_11_ + -1] >> 2) + (is_10_[i_12_ + 1][i_11_] >> 3) + (is_10_[-1 + i_12_][i_11_] >> 2) + (is_10_[i_12_][1 + i_11_] >> 3) + (is_10_[i_12_][i_11_] >> 1);
									is_8_[i_12_][i_11_] = -i_14_ + 74;
								}
							}
						} else {
							final int i_15_ = (int) Class117.aFloatArray1127[0];
							final int i_16_ = (int) Class117.aFloatArray1127[2];
							final int i_17_ = (int) Class117.aFloatArray1127[1];
							final int i_18_ = (int) Math.sqrt(i_16_ * i_16_ + i_17_ * i_17_ + i_15_ * i_15_);
							final int i_19_ = 1024 * i_18_ >> 8;
							for (int i_20_ = 1; i_20_ < 103; i_20_++) {
								for (int i_21_ = 1; i_21_ < 103; i_21_++) {
									int i_22_ = 96;
									final int i_23_ = -Class120_Sub26.anIntArrayArrayArray2741[i_9_][i_21_][i_20_ + -1] + Class120_Sub26.anIntArrayArrayArray2741[i_9_][i_21_][1 + i_20_];
									final int i_24_ = Class120_Sub26.anIntArrayArrayArray2741[i_9_][1 + i_21_][i_20_] + -Class120_Sub26.anIntArrayArrayArray2741[i_9_][-1 + i_21_][i_20_];
									final int i_25_ = (int) Math.sqrt(65536 + i_24_ * i_24_ - -(i_23_ * i_23_));
									final int i_26_ = -65536 / i_25_;
									final int i_27_ = (i_23_ << 8) / i_25_;
									final int i_28_ = (i_24_ << 8) / i_25_;
									i_22_ += (i_16_ * i_27_ + i_15_ * i_28_ - -(i_17_ * i_26_)) / i_19_;
									final int i_29_ = (is_10_[i_21_][i_20_] >> 1) + (is_10_[i_21_][i_20_ - -1] >> 3) + (is_10_[i_21_ + 1][i_20_] >> 3) + (is_10_[i_21_ + -1][i_20_] >> 2) + (is_10_[i_21_][i_20_ - 1] >> 2);
									is_8_[i_21_][i_20_] = -(int) (1.7F * i_29_) + i_22_;
								}
							}
						}
					} else {
						final int i_30_ = (int) Math.sqrt(5100.0);
						final int i_31_ = 768 * i_30_ >> 8;
						for (int i_32_ = 1; i_32_ < 103; i_32_++) {
							for (int i_33_ = 1; i_33_ < 103; i_33_++) {
								int i_34_ = 74;
								final int i_35_ = -Class120_Sub26.anIntArrayArrayArray2741[i_9_][i_33_][i_32_ - 1] + Class120_Sub26.anIntArrayArrayArray2741[i_9_][i_33_][i_32_ + 1];
								final int i_36_ = Class120_Sub26.anIntArrayArrayArray2741[i_9_][1 + i_33_][i_32_] - Class120_Sub26.anIntArrayArrayArray2741[i_9_][i_33_ + -1][i_32_];
								final int i_37_ = (int) Math.sqrt(65536 + i_36_ * i_36_ - -(i_35_ * i_35_));
								final int i_38_ = (i_36_ << 8) / i_37_;
								final int i_39_ = -65536 / i_37_;
								final int i_40_ = (i_35_ << 8) / i_37_;
								i_34_ += (-10 * i_39_ + -50 * i_38_ + -50 * i_40_) / i_31_;
								final int i_41_ = (is_10_[i_33_][-1 + i_32_] >> 2) + (is_10_[-1 + i_33_][i_32_] >> 2) + (is_10_[1 + i_33_][i_32_] >> 3) - (-(is_10_[i_33_][i_32_ + 1] >> 3) - (is_10_[i_33_][i_32_] >> 1));
								is_8_[i_33_][i_32_] = -i_41_ + i_34_;
							}
						}
					}
					for (int i_42_ = 0; i_42_ < 104; i_42_++) {
						StringNode.anIntArray2733[i_42_] = 0;
						PacketBuffer.anIntArray3120[i_42_] = 0;
						Class120_Sub12_Sub31.anIntArray3383[i_42_] = 0;
						Buffer.anIntArray2477[i_42_] = 0;
						Class120_Sub12_Sub34.anIntArray3409[i_42_] = 0;
					}
					for (int i_43_ = -5; i_43_ < 104; i_43_++) {
						for (int i_44_ = 0; i_44_ < 104; i_44_++) {
							final int i_45_ = 5 + i_43_;
							if (i_45_ < 104) {
								final int i_46_ = Class120_Sub4.aByteArrayArrayArray2441[i_9_][i_45_][i_44_] & 0xff;
								if (i_46_ > 0) {
									final Class128 class128 = MouseHandler.method1026(-1 + i_46_, true);
									StringNode.anIntArray2733[i_44_] += class128.anInt1218;
									PacketBuffer.anIntArray3120[i_44_] += class128.anInt1222;
									Class120_Sub12_Sub31.anIntArray3383[i_44_] += class128.anInt1229;
									Buffer.anIntArray2477[i_44_] += class128.anInt1226;
									Class120_Sub12_Sub34.anIntArray3409[i_44_]++;
								}
							}
							final int i_47_ = -5 + i_43_;
							if (i_47_ >= 0) {
								final int i_48_ = Class120_Sub4.aByteArrayArrayArray2441[i_9_][i_47_][i_44_] & 0xff;
								if (i_48_ > 0) {
									final Class128 class128 = MouseHandler.method1026(-1 + i_48_, true);
									StringNode.anIntArray2733[i_44_] -= class128.anInt1218;
									PacketBuffer.anIntArray3120[i_44_] -= class128.anInt1222;
									Class120_Sub12_Sub31.anIntArray3383[i_44_] -= class128.anInt1229;
									Buffer.anIntArray2477[i_44_] -= class128.anInt1226;
									Class120_Sub12_Sub34.anIntArray3409[i_44_]--;
								}
							}
						}
						if (i_43_ >= 0) {
							int i_49_ = 0;
							int i_50_ = 0;
							int i_51_ = 0;
							int i_52_ = 0;
							int i_53_ = 0;
							for (int i_54_ = -5; i_54_ < 104; i_54_++) {
								final int i_55_ = 5 + i_54_;
								if (i_55_ < 104) {
									i_51_ += Buffer.anIntArray2477[i_55_];
									i_52_ += Class120_Sub12_Sub34.anIntArray3409[i_55_];
									i_53_ += PacketBuffer.anIntArray3120[i_55_];
									i_49_ += StringNode.anIntArray2733[i_55_];
									i_50_ += Class120_Sub12_Sub31.anIntArray3383[i_55_];
								}
								final int i_56_ = i_54_ - 5;
								if (i_56_ >= 0) {
									i_51_ -= Buffer.anIntArray2477[i_56_];
									i_50_ -= Class120_Sub12_Sub31.anIntArray3383[i_56_];
									i_49_ -= StringNode.anIntArray2733[i_56_];
									i_52_ -= Class120_Sub12_Sub34.anIntArray3409[i_56_];
									i_53_ -= PacketBuffer.anIntArray3120[i_56_];
								}
								if (i_54_ >= 0 && i_52_ > 0) {
									is_6_[i_43_][i_54_] = Class120_Sub14_Sub5.method1442((byte) -123, i_49_ * 256 / i_51_, i_53_ / i_52_, i_50_ / i_52_);
								}
							}
						}
					}
					for (int i_57_ = 1; i_57_ < 103; i_57_++) {
						for (int i_58_ = 1; i_58_ < 103; i_58_++) {
							if (bool || Class143_Sub1.method2021() || (Class114.aByteArrayArrayArray1095[0][i_57_][i_58_] & 0x2) != 0 || (Class114.aByteArrayArrayArray1095[i_9_][i_57_][i_58_] & 0x10) == 0 && Class176.method2242(i_58_, i_9_, (byte) 122, i_57_) == Class120_Sub14_Sub4.anInt3469) {
								if (OutputStream_Sub1.anInt29 > i_9_) {
									OutputStream_Sub1.anInt29 = i_9_;
								}
								final int i_59_ = 0xff & Class120_Sub4.aByteArrayArrayArray2441[i_9_][i_57_][i_58_];
								final int i_60_ = 0xff & Class99.aByteArrayArrayArray949[i_9_][i_57_][i_58_];
								if (i_59_ > 0 || i_60_ > 0) {
									final int i_61_ = Class120_Sub26.anIntArrayArrayArray2741[i_9_][i_57_][i_58_];
									final int i_62_ = Class120_Sub26.anIntArrayArrayArray2741[i_9_][i_57_ + 1][i_58_];
									final int i_63_ = Class120_Sub26.anIntArrayArrayArray2741[i_9_][1 + i_57_][1 + i_58_];
									final int i_64_ = Class120_Sub26.anIntArrayArrayArray2741[i_9_][i_57_][i_58_ + 1];
									if (i_9_ > 0) {
										boolean bool_65_ = true;
										if (i_59_ == 0 && Class120_Sub14_Sub5.aByteArrayArrayArray3477[i_9_][i_57_][i_58_] != 0) {
											bool_65_ = false;
										}
										if (i_60_ > 0 && !Class118.method1025((byte) -128, i_60_ - 1).aBoolean1195) {
											bool_65_ = false;
										}
										if (bool_65_ && i_61_ == i_62_ && i_63_ == i_61_ && i_61_ == i_64_) {
											Class110.anIntArrayArrayArray1050[i_9_][i_57_][i_58_] = Class191.method2512(Class110.anIntArrayArrayArray1050[i_9_][i_57_][i_58_], 4);
										}
									}
									int i_66_;
									int i_67_;
									if (i_59_ <= 0) {
										i_66_ = -1;
										i_67_ = 0;
									} else {
										i_66_ = is_6_[i_57_][i_58_];
										int i_68_ = (0x7f & i_66_) - -i_7_;
										if (i_68_ < 0) {
											i_68_ = 0;
										} else if (i_68_ > 127) {
											i_68_ = 127;
										}
										final int i_69_ = (0xfc00 & i_66_ - -i_5_) + (i_66_ & 0x380) - -i_68_;
										i_67_ = Rasterizer.anIntArray969[Class178.method2256(true, i_69_, 96)];
									}
									final int i_70_ = is_8_[1 + i_57_][i_58_];
									final int i_71_ = is_8_[i_57_ + 1][i_58_ + 1];
									final int i_72_ = is_8_[i_57_][i_58_ + 1];
									final int i_73_ = is_8_[i_57_][i_58_];
									if (i_60_ == 0) {
										Class120_Sub12.method1191(i_9_, i_57_, i_58_, 0, 0, -1, i_61_, i_62_, i_63_, i_64_, Class178.method2256(true, i_66_, i_73_), Class178.method2256(true, i_66_, i_70_), Class178.method2256(true, i_66_, i_71_), Class178.method2256(true, i_66_, i_72_), 0, 0, 0, 0,
												i_67_, 0);
										if (HDToolkit.glEnabled && i_9_ > 0 && i_66_ != -1 && MouseHandler.method1026(-1 + i_59_, true).aBoolean1220) {
											Class47.method384(0, 0, true, false, i_57_, i_58_, i_61_ - Class120_Sub26.anIntArrayArrayArray2741[0][i_57_][i_58_], -Class120_Sub26.anIntArrayArrayArray2741[0][i_57_ + 1][i_58_] + i_62_, -Class120_Sub26.anIntArrayArrayArray2741[0][1 + i_57_][1 + i_58_]
													+ i_63_, -Class120_Sub26.anIntArrayArrayArray2741[0][i_57_][1 + i_58_] + i_64_);
										}
										if (HDToolkit.glEnabled && !bool && Class35.anIntArrayArray300 != null && i_9_ == 0) {
											while_130_: for (int i_74_ = i_57_ + -1; i_74_ <= i_57_ + 1; i_74_++) {
												for (int i_75_ = i_58_ + -1; i_58_ + 1 >= i_75_; i_75_++) {
													if ((i_74_ != i_57_ || i_58_ != i_75_) && i_74_ >= 0 && i_74_ < 104 && i_75_ >= 0 && i_75_ < 104) {
														final int i_76_ = Class99.aByteArrayArrayArray949[i_9_][i_74_][i_75_] & 0xff;
														if (i_76_ != 0) {
															final Class124 class124 = Class118.method1025((byte) -128, -1 + i_76_);
															if ((class124.anInt1203 ^ 0xffffffff) != 0 && Class120_Sub12_Sub29.method1355(Rasterizer.anInterface5_973.method18(class124.anInt1203, 255), (byte) -90)) {
																Class35.anIntArrayArray300[i_57_][i_58_] = (class124.anInt1199 << 24) + class124.anInt1200;
																break while_130_;
															}
														}
													}
												}
											}
										}
									} else {
										final int i_77_ = 1 + Class120_Sub14_Sub5.aByteArrayArrayArray3477[i_9_][i_57_][i_58_];
										final byte i_78_ = Class8.aByteArrayArrayArray65[i_9_][i_57_][i_58_];
										final Class124 class124 = Class118.method1025((byte) -127, -1 + i_60_);
										if (HDToolkit.glEnabled && !bool && Class35.anIntArrayArray300 != null && i_9_ == 0) {
											if ((class124.anInt1203 ^ 0xffffffff) == 0 || !Class120_Sub12_Sub29.method1355(Rasterizer.anInterface5_973.method18(class124.anInt1203, 255), (byte) -59)) {
												while_129_: for (int i_79_ = i_57_ - 1; i_79_ <= 1 + i_57_; i_79_++) {
													for (int i_80_ = -1 + i_58_; i_58_ - -1 >= i_80_; i_80_++) {
														if ((i_79_ != i_57_ || i_80_ != i_58_) && i_79_ >= 0 && i_79_ < 104 && i_80_ >= 0 && i_80_ < 104) {
															final int i_81_ = Class99.aByteArrayArrayArray949[i_9_][i_79_][i_80_] & 0xff;
															if (i_81_ != 0) {
																final Class124 class124_82_ = Class118.method1025((byte) -126, -1 + i_81_);
																if (class124_82_.anInt1203 != -1 && Class120_Sub12_Sub29.method1355(Rasterizer.anInterface5_973.method18(class124_82_.anInt1203, 255), (byte) -100)) {
																	Class35.anIntArrayArray300[i_57_][i_58_] = class124_82_.anInt1200 + (class124_82_.anInt1199 << 24);
																	break while_129_;
																}
															}
														}
													}
												}
											} else {
												Class35.anIntArrayArray300[i_57_][i_58_] = (class124.anInt1199 << 24) + class124.anInt1200;
											}
										}
										int i_83_ = class124.anInt1203;
										if (i_83_ >= 0 && !Rasterizer.anInterface5_973.method15(i_83_, i ^ 0x47)) {
											i_83_ = -1;
										}
										int i_84_;
										int i_85_;
										if (i_83_ >= 0) {
											i_85_ = -1;
											i_84_ = Rasterizer.anIntArray969[Class96.method789((byte) -77, Rasterizer.anInterface5_973.method20(i_83_, i ^ 0xffb8), 96)];
										} else if (class124.anInt1197 == -1) {
											i_84_ = 0;
											i_85_ = -2;
										} else {
											i_85_ = class124.anInt1197;
											int i_86_ = (0x7f & i_85_) + i_7_;
											if (i_86_ >= 0) {
												if (i_86_ > 127) {
													i_86_ = 127;
												}
											} else {
												i_86_ = 0;
											}
											final int i_87_ = i_86_ + (0xfc00 & i_85_ + i_5_) + (0x380 & i_85_);
											i_84_ = Rasterizer.anIntArray969[Class96.method789((byte) -77, i_87_, 96)];
										}
										if (class124.anInt1198 >= 0) {
											final int i_88_ = class124.anInt1198;
											int i_89_ = i_7_ + (0x7f & i_88_);
											if (i_89_ >= 0) {
												if (i_89_ > 127) {
													i_89_ = 127;
												}
											} else {
												i_89_ = 0;
											}
											final int i_90_ = (0xfc00 & i_88_ + i_5_) + (0x380 & i_88_) - -i_89_;
											i_84_ = Rasterizer.anIntArray969[Class96.method789((byte) -77, i_90_, 96)];
										}
										Class120_Sub12.method1191(i_9_, i_57_, i_58_, i_77_, i_78_, i_83_, i_61_, i_62_, i_63_, i_64_, Class178.method2256(true, i_66_, i_73_), Class178.method2256(true, i_66_, i_70_), Class178.method2256(true, i_66_, i_71_), Class178.method2256(true, i_66_, i_72_),
												Class96.method789((byte) -77, i_85_, i_73_), Class96.method789((byte) -77, i_85_, i_70_), Class96.method789((byte) -77, i_85_, i_71_), Class96.method789((byte) -77, i_85_, i_72_), i_67_, i_84_);
										if (HDToolkit.glEnabled && i_9_ > 0) {
											Class47.method384(i_77_, i_78_, i_85_ == -2 || !class124.aBoolean1193, i_66_ == -1 || !MouseHandler.method1026(-1 + i_59_, true).aBoolean1220, i_57_, i_58_, -Class120_Sub26.anIntArrayArrayArray2741[0][i_57_][i_58_] + i_61_, i_62_
													- Class120_Sub26.anIntArrayArrayArray2741[0][i_57_ - -1][i_58_], i_63_ + -Class120_Sub26.anIntArrayArrayArray2741[0][1 + i_57_][i_58_ + 1], i_64_ - Class120_Sub26.anIntArrayArrayArray2741[0][i_57_][i_58_ - -1]);
										}
									}
								}
							}
						}
					}
					if (HDToolkit.glEnabled) {
						final float[][] fs = new float[105][105];
						final float[][] fs_91_ = new float[105][105];
						final float[][] fs_92_ = new float[105][105];
						final int[][] is_93_ = Class120_Sub26.anIntArrayArrayArray2741[i_9_];
						for (int i_94_ = 1; i_94_ <= 103; i_94_++) {
							for (int i_95_ = 1; i_95_ <= 103; i_95_++) {
								final int i_96_ = -is_93_[i_95_][-1 + i_94_] + is_93_[i_95_][1 + i_94_];
								final int i_97_ = is_93_[i_95_ - -1][i_94_] - is_93_[-1 + i_95_][i_94_];
								final float f = (float) Math.sqrt(65536 + i_97_ * i_97_ + i_96_ * i_96_);
								fs[i_95_][i_94_] = i_97_ / f;
								fs_91_[i_95_][i_94_] = -256.0F / f;
								fs_92_[i_95_][i_94_] = i_96_ / f;
							}
						}
						if (bool) {
							final Class120_Sub9[] class120_sub9s = Class120_Sub12_Sub14.method1270(is, Class99.aByteArrayArrayArray949[i_9_], fs, Class35.anIntArrayArray300, is_6_, fs_91_, Class120_Sub14_Sub5.aByteArrayArrayArray3477[i_9_], is_8_, Class8.aByteArrayArrayArray65[i_9_], i_9_, fs_92_,
									Class120_Sub12_Sub33.anIntArrayArrayArray3388[0], Class114.aByteArrayArrayArray1095, Class120_Sub4.aByteArrayArrayArray2441[i_9_], false, Class120_Sub26.anIntArrayArrayArray2741[i_9_]);
							Class65.method578(i_9_, class120_sub9s);
						} else {
							final Class120_Sub9[] class120_sub9s = Class120_Sub12_Sub14.method1270(is, Class99.aByteArrayArrayArray949[i_9_], fs, null, is_6_, fs_91_, Class120_Sub14_Sub5.aByteArrayArrayArray3477[i_9_], is_8_, Class8.aByteArrayArrayArray65[i_9_], i_9_, fs_92_, null,
									Class114.aByteArrayArrayArray1095, Class120_Sub4.aByteArrayArrayArray2441[i_9_], false, Class120_Sub26.anIntArrayArrayArray2741[i_9_]);
							final Class120_Sub9[] class120_sub9s_98_ = Class132.method1930(Class114.aByteArrayArrayArray1095, (byte) -115, Class99.aByteArrayArrayArray949[i_9_], is_8_, fs, i_9_, Class120_Sub14_Sub5.aByteArrayArrayArray3477[i_9_], Class8.aByteArrayArrayArray65[i_9_],
									Class120_Sub26.anIntArrayArrayArray2741[i_9_], Class120_Sub4.aByteArrayArrayArray2441[i_9_], fs_91_, fs_92_);
							final Class120_Sub9[] class120_sub9s_99_ = new Class120_Sub9[class120_sub9s.length + class120_sub9s_98_.length];
							for (int i_100_ = 0; i_100_ < class120_sub9s.length; i_100_++) {
								class120_sub9s_99_[i_100_] = class120_sub9s[i_100_];
							}
							for (int i_101_ = 0; i_101_ < class120_sub9s_98_.length; i_101_++) {
								class120_sub9s_99_[i_101_ + class120_sub9s.length] = class120_sub9s_98_[i_101_];
							}
							Class65.method578(i_9_, class120_sub9s_99_);
							Class45.method368((byte) -99, Class8.aByteArrayArrayArray65[i_9_], LightManager.lightsPos, LightManager.lights, Class120_Sub26.anIntArrayArrayArray2741[i_9_], Class120_Sub4.aByteArrayArrayArray2441[i_9_], fs, Class99.aByteArrayArrayArray949[i_9_], fs_92_, fs_91_,
									i_9_, Class120_Sub14_Sub5.aByteArrayArrayArray3477[i_9_]);
						}
					}
					Class120_Sub4.aByteArrayArrayArray2441[i_9_] = null;
					Class99.aByteArrayArrayArray949[i_9_] = null;
					Class120_Sub14_Sub5.aByteArrayArrayArray3477[i_9_] = null;
					Class8.aByteArrayArrayArray65[i_9_] = null;
					Npc.aByteArrayArrayArray3754[i_9_] = null;
				}
				Class38.method314(-50, -10, -50);
				if (!bool) {
					for (int i_102_ = 0; i_102_ < 104; i_102_++) {
						for (int i_103_ = 0; i_103_ < 104; i_103_++) {
							if ((0x2 & Class114.aByteArrayArrayArray1095[1][i_102_][i_103_]) == 2) {
								Class127.method1893(i_102_, i_103_);
							}
						}
					}
					for (int i_104_ = 0; i_104_ < 4; i_104_++) {
						for (int i_105_ = 0; i_105_ <= 104; i_105_++) {
							for (int i_106_ = 0; i_106_ <= 104; i_106_++) {
								if ((0x1 & Class110.anIntArrayArrayArray1050[i_104_][i_106_][i_105_]) != 0) {
									int i_107_ = i_105_;
									int i_108_ = i_104_;
									int i_109_ = i_105_;
									for (/**/; i_107_ < 104; i_107_++) {
										if ((Class110.anIntArrayArrayArray1050[i_104_][i_106_][i_107_ + 1] & 0x1) == 0) {
											break;
										}
									}
									for (/**/; i_109_ > 0; i_109_--) {
										if ((0x1 & Class110.anIntArrayArrayArray1050[i_104_][i_106_][-1 + i_109_]) == 0) {
											break;
										}
									}
									while_131_: for (/**/; i_108_ > 0; i_108_--) {
										for (int i_110_ = i_109_; i_110_ <= i_107_; i_110_++) {
											if ((0x1 & Class110.anIntArrayArrayArray1050[-1 + i_108_][i_106_][i_110_]) == 0) {
												break while_131_;
											}
										}
									}
									int i_111_;
									while_132_: for (i_111_ = i_104_; i_111_ < 3; i_111_++) {
										for (int i_112_ = i_109_; i_112_ <= i_107_; i_112_++) {
											if ((0x1 & Class110.anIntArrayArrayArray1050[i_111_ - -1][i_106_][i_112_]) == 0) {
												break while_132_;
											}
										}
									}
									final int i_113_ = (1 + -i_109_ + i_107_) * (i_111_ - -1 - i_108_);
									if (i_113_ >= 8) {
										final int i_115_ = Class120_Sub26.anIntArrayArrayArray2741[i_111_][i_106_][i_109_] + -240;
										final int i_116_ = Class120_Sub26.anIntArrayArrayArray2741[i_108_][i_106_][i_109_];
										AbstractTimer.method734(1, 128 * i_106_, 128 * i_106_, i_109_ * 128, 128 + 128 * i_107_, i_115_, i_116_);
										for (int i_117_ = i_108_; i_111_ >= i_117_; i_117_++) {
											for (int i_118_ = i_109_; i_107_ >= i_118_; i_118_++) {
												Class110.anIntArrayArrayArray1050[i_117_][i_106_][i_118_] = Class120_Sub12_Sub3.method1207(Class110.anIntArrayArrayArray1050[i_117_][i_106_][i_118_], -2);
											}
										}
									}
								}
								if ((Class110.anIntArrayArrayArray1050[i_104_][i_106_][i_105_] & 0x2) != 0) {
									int i_119_;
									for (i_119_ = i_106_; i_119_ > 0 && (0x2 & Class110.anIntArrayArrayArray1050[i_104_][-1 + i_119_][i_105_]) != 0; i_119_--) {
										/* empty */
									}
									int i_120_;
									for (i_120_ = i_106_; i_120_ < 104 && (Class110.anIntArrayArrayArray1050[i_104_][i_120_ - -1][i_105_] & 0x2) != 0; i_120_++) {
										/* empty */
									}
									int i_121_ = i_104_;
									int i_122_ = i_104_;
									while_133_: for (/**/; i_121_ > 0; i_121_--) {
										for (int i_123_ = i_119_; i_120_ >= i_123_; i_123_++) {
											if ((Class110.anIntArrayArrayArray1050[-1 + i_121_][i_123_][i_105_] & 0x2) == 0) {
												break while_133_;
											}
										}
									}
									while_134_: for (/**/; i_122_ < 3; i_122_++) {
										for (int i_124_ = i_119_; i_124_ <= i_120_; i_124_++) {
											if ((0x2 & Class110.anIntArrayArrayArray1050[1 + i_122_][i_124_][i_105_]) == 0) {
												break while_134_;
											}
										}
									}
									final int i_125_ = (1 + i_122_ - i_121_) * (1 + i_120_ - i_119_);
									if (i_125_ >= 8) {
										final int i_127_ = Class120_Sub26.anIntArrayArrayArray2741[i_122_][i_119_][i_105_] + -240;
										final int i_128_ = Class120_Sub26.anIntArrayArrayArray2741[i_121_][i_119_][i_105_];
										AbstractTimer.method734(2, i_119_ * 128, 128 * i_120_ + 128, 128 * i_105_, 128 * i_105_, i_127_, i_128_);
										for (int i_129_ = i_121_; i_122_ >= i_129_; i_129_++) {
											for (int i_130_ = i_119_; i_120_ >= i_130_; i_130_++) {
												Class110.anIntArrayArrayArray1050[i_129_][i_130_][i_105_] = Class120_Sub12_Sub3.method1207(Class110.anIntArrayArrayArray1050[i_129_][i_130_][i_105_], -3);
											}
										}
									}
								}
								if ((Class110.anIntArrayArrayArray1050[i_104_][i_106_][i_105_] & 0x4) != 0) {
									int i_131_ = i_106_;
									int i_132_ = i_106_;
									int i_133_;
									for (i_133_ = i_105_; i_133_ > 0 && (0x4 & Class110.anIntArrayArrayArray1050[i_104_][i_106_][-1 + i_133_]) != 0; i_133_--) {
										/* empty */
									}
									int i_134_;
									for (i_134_ = i_105_; i_134_ < 104; i_134_++) {
										if ((Class110.anIntArrayArrayArray1050[i_104_][i_106_][1 + i_134_] & 0x4) == 0) {
											break;
										}
									}
									while_135_: for (/**/; i_131_ > 0; i_131_--) {
										for (int i_135_ = i_133_; i_135_ <= i_134_; i_135_++) {
											if ((Class110.anIntArrayArrayArray1050[i_104_][-1 + i_131_][i_135_] & 0x4) == 0) {
												break while_135_;
											}
										}
									}
									while_136_: for (/**/; i_132_ < 104; i_132_++) {
										for (int i_136_ = i_133_; i_134_ >= i_136_; i_136_++) {
											if ((Class110.anIntArrayArrayArray1050[i_104_][i_132_ - -1][i_136_] & 0x4) == 0) {
												break while_136_;
											}
										}
									}
									if ((1 + -i_133_ + i_134_) * (1 + i_132_ + -i_131_) >= 4) {
										final int i_137_ = Class120_Sub26.anIntArrayArrayArray2741[i_104_][i_131_][i_133_];
										AbstractTimer.method734(4, i_131_ * 128, 128 + i_132_ * 128, i_133_ * 128, 128 + 128 * i_134_, i_137_, i_137_);
										for (int i_138_ = i_131_; i_132_ >= i_138_; i_138_++) {
											for (int i_139_ = i_133_; i_139_ <= i_134_; i_139_++) {
												Class110.anIntArrayArrayArray1050[i_104_][i_138_][i_139_] = Class120_Sub12_Sub3.method1207(Class110.anIntArrayArrayArray1050[i_104_][i_138_][i_139_], -5);
											}
										}
									}
								}
							}
						}
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("rm.W(").append(class25s != null ? "{...}" : "null").append(',').append(i).append(',').append(is != null ? "{...}" : "null").append(',').append(bool).append(')').toString());
		}
	}

	static final void method1345(final String string, final int i, final byte i_140_) {
		try {
			final InterfaceChangeNode class120_sub14_sub7 = Class120_Sub14_Sub3.putInterfaceChange(2, i);
			class120_sub14_sub7.method1454((byte) -93);
			class120_sub14_sub7.aString3493 = string;
			if (i_140_ != 108) {
				method1347(29, -18, -113, -61, (byte) -52, -14, -88);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("rm.V(").append(string != null ? "{...}" : "null").append(',').append(i).append(',').append(i_140_).append(')').toString());
		}
	}

	static final void method1346(final Class107 class107, final int i, final Class189 class189, final byte i_141_, final int i_142_, final int i_143_, final int i_144_) {
		try {
			if (class107 != null) {
				final int i_145_ = Class164.anInt1590 + (int) OutputStream_Sub1.aFloat28 & 0x7ff;
				final int i_146_ = 10 + Math.max(class189.anInt1948 / 2, class189.anInt2059 / 2);
				if (i_141_ > -46) {
					method1348(-32);
				}
				final int i_147_ = i_143_ * i_143_ + i_142_ * i_142_;
				if (i_146_ * i_146_ >= i_147_) {
					int i_148_ = Rasterizer.sineTable[i_145_];
					i_148_ = 256 * i_148_ / (256 + Class154.anInt1442);
					int i_149_ = Rasterizer.cosineTable[i_145_];
					i_149_ = 256 * i_149_ / (Class154.anInt1442 - -256);
					final int i_150_ = i_149_ * i_142_ + i_143_ * i_148_ >> 16;
					final int i_151_ = -(i_142_ * i_148_) + i_143_ * i_149_ >> 16;
					if (HDToolkit.glEnabled) {
						((Class107_Sub2) class107).method928(-(class107.anInt1029 / 2) + i_150_ + class189.anInt1948 / 2 + i, class189.anInt2059 / 2 + i_144_ + -i_151_ - class107.anInt1028 / 2, (HDSprite) class189.method2492(false, (byte) -18));
					} else {
						((Class107_Sub1) class107).method924(i_150_ + i + class189.anInt1948 / 2 - class107.anInt1029 / 2, -i_151_ + i_144_ - (-(class189.anInt2059 / 2) - -(class107.anInt1028 / 2)), class189.anIntArray2079, class189.anIntArray1949);
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("rm.R(").append(class107 != null ? "{...}" : "null").append(',').append(i).append(',').append(class189 != null ? "{...}" : "null").append(',').append(i_141_).append(',').append(i_142_).append(',').append(i_143_)
					.append(',').append(i_144_).append(')').toString());
		}
	}

	static final void method1347(final int i, final int i_152_, final int i_153_, final int i_154_, final byte i_155_, final int i_156_, final int i_157_) {
		try {
			if (i_155_ == -9) {
				final int i_158_ = Class3.method83(Class120_Sub30_Sub2.anInt3699, i_156_, i_155_ + 10, Class139.anInt1334);
				final int i_159_ = Class3.method83(Class120_Sub30_Sub2.anInt3699, i_157_, 1, Class139.anInt1334);
				final int i_160_ = Class3.method83(Class32.anInt260, i_154_, 1, Class120_Sub14_Sub11.anInt3544);
				final int i_161_ = Class3.method83(Class32.anInt260, i, 1, Class120_Sub14_Sub11.anInt3544);
				final int i_162_ = Class3.method83(Class120_Sub30_Sub2.anInt3699, i_153_ + i_156_, 1, Class139.anInt1334);
				final int i_163_ = Class3.method83(Class120_Sub30_Sub2.anInt3699, i_157_ + -i_153_, 1, Class139.anInt1334);
				for (int i_164_ = i_158_; i_162_ > i_164_; i_164_++) {
					Class120_Sub8.method1160((byte) 115, GameEntity.anIntArrayArray3009[i_164_], i_152_, i_160_, i_161_);
				}
				for (int i_165_ = i_159_; i_165_ > i_163_; i_165_--) {
					Class120_Sub8.method1160((byte) 115, GameEntity.anIntArrayArray3009[i_165_], i_152_, i_160_, i_161_);
				}
				final int i_166_ = Class3.method83(Class32.anInt260, i_154_ - -i_153_, 1, Class120_Sub14_Sub11.anInt3544);
				final int i_167_ = Class3.method83(Class32.anInt260, i + -i_153_, 1, Class120_Sub14_Sub11.anInt3544);
				for (int i_168_ = i_162_; i_163_ >= i_168_; i_168_++) {
					final int[] is = GameEntity.anIntArrayArray3009[i_168_];
					Class120_Sub8.method1160((byte) 115, is, i_152_, i_160_, i_166_);
					Class120_Sub8.method1160((byte) 115, is, i_152_, i_167_, i_161_);
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("rm.T(").append(i).append(',').append(i_152_).append(',').append(i_153_).append(',').append(i_154_).append(',').append(i_155_).append(',').append(i_156_).append(',').append(i_157_).append(')').toString());
		}
	}

	public static void method1348(final int i) {
		try {
			if (i != -4000) {
				aString3360 = null;
			}
			aString3360 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("rm.AA(").append(i).append(')').toString());
		}
	}

	@Override
	final void method1180(final byte i, final Buffer class120_sub7, final int i_169_) {
		try {
			final int i_170_ = i_169_;
			while_137_: do {
				do {
					if (i_170_ != 0) {
						if (i_170_ != 1) {
							if (i_170_ == 2) {
								break;
							}
							break while_137_;
						}
					} else {
						anInt3355 = class120_sub7.getUByte();
						break while_137_;
					}
					anInt3356 = class120_sub7.getUShort();
					break while_137_;
				} while (false);
				anInt3357 = class120_sub7.getUByte();
			} while (false);
			if (i != -43) {
				anInt3361 = -7;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("rm.M(").append(i).append(',').append(class120_sub7 != null ? "{...}" : "null").append(',').append(i_169_).append(')').toString());
		}
	}

	static final void method1349(final byte i) {
		try {
			int i_171_ = Class120_Sub12_Sub22.aClass120_Sub14_Sub8_3303.method1459(Class111.aString1056);
			for (int i_172_ = 0; Class186.anInt1906 > i_172_; i_172_++) {
				final int i_173_ = Class120_Sub12_Sub22.aClass120_Sub14_Sub8_3303.method1459(Class121.method1838((byte) 98, i_172_));
				if (i_173_ > i_171_) {
					i_171_ = i_173_;
				}
			}
			if (i >= 57) {
				final int i_174_ = 21 + Class186.anInt1906 * 15;
				int i_175_ = Class120_Sub12_Sub21.anInt3298;
				i_171_ += 8;
				if (i_174_ + i_175_ > Class120_Sub12_Sub5.canvasHeight) {
					i_175_ = Class120_Sub12_Sub5.canvasHeight - i_174_;
				}
				if (i_175_ < 0) {
					i_175_ = 0;
				}
				int i_176_ = -(i_171_ / 2) + Class115.anInt1110;
				if (i_176_ + i_171_ > Class69_Sub1.canvasWidth) {
					i_176_ = -i_171_ + Class69_Sub1.canvasWidth;
				}
				if (i_176_ < 0) {
					i_176_ = 0;
				}
				if (FileSystem.anInt455 != 1) {
					if (Class50.anInt449 == Class115.anInt1110 && Class120_Sub12_Sub36.anInt3424 == Class120_Sub12_Sub21.anInt3298) {
						Class120_Sub14_Sub10.anInt3537 = (Class186.aBoolean1899 ? 26 : 22) + Class186.anInt1906 * 15;
						Class126.anInt1209 = i_176_;
						Class120_Sub24.anInt2724 = i_171_;
						FileSystem.anInt455 = 0;
						Class15.menuOpen = true;
						Class120_Sub16.anInt2600 = i_175_;
					} else {
						Class120_Sub14_Sub12.anInt3558 = Class50.anInt449;
						Class31.anInt250 = Class120_Sub12_Sub36.anInt3424;
						FileSystem.anInt455 = 1;
					}
				} else if (Class115.anInt1110 == Class120_Sub14_Sub12.anInt3558 && Class120_Sub12_Sub21.anInt3298 == Class31.anInt250) {
					FileSystem.anInt455 = 0;
					Class120_Sub16.anInt2600 = i_175_;
					Class120_Sub14_Sub10.anInt3537 = (Class186.aBoolean1899 ? 26 : 22) + 15 * Class186.anInt1906;
					Class15.menuOpen = true;
					Class120_Sub24.anInt2724 = i_171_;
					Class126.anInt1209 = i_176_;
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("rm.S(").append(i).append(')').toString());
		}
	}

	@Override
	final void method1193(final byte i) {
		try {
			method1350((byte) 78);
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("rm.O(").append(i).append(')').toString());
		}
	}

	private final void method1350(final byte i) {
		try {
			anIntArray3358 = new int[anInt3355 - -1];
			final int i_177_ = 4096 / anInt3355;
			anIntArray3359 = new int[anInt3355 - -1];
			final int i_178_ = i_177_ * anInt3356 >> 12;
			int i_179_ = 0;
			for (int i_180_ = 0; i_180_ < anInt3355; i_180_++) {
				anIntArray3358[i_180_] = i_179_;
				anIntArray3359[i_180_] = i_178_ + i_179_;
				i_179_ += i_177_;
			}
			anIntArray3358[anInt3355] = 4096;
			anIntArray3359[anInt3355] = anIntArray3359[0] + 4096;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("rm.U(").append(i).append(')').toString());
		}
	}

	public Class120_Sub12_Sub28() {
		super(0, true);
	}

	@Override
	final int[] method1187(final int i, final int i_181_) {
		int[] is;
		try {
			final int[] is_182_ = this.aClass30_2563.method258(i_181_, -76);
			if (i != -1735) {
				method1350((byte) 85);
			}
			if (this.aClass30_2563.aBoolean238) {
				final int i_183_ = Class150.anIntArray1405[i_181_];
				if (anInt3357 != 0) {
					for (int i_184_ = 0; Class120_Sub12_Sub7.anInt3178 > i_184_; i_184_++) {
						int i_185_ = 0;
						int i_186_ = 0;
						final int i_187_ = Class90.anIntArray849[i_184_];
						int i_188_ = anInt3357;
						while_138_: do {
							do {
								if (i_188_ != 1) {
									if (i_188_ != 2) {
										if (i_188_ == 3) {
											break;
										}
										break while_138_;
									}
								} else {
									i_185_ = i_187_;
									break while_138_;
								}
								i_185_ = 2048 - -(i_183_ - 4096 + i_187_ >> 1);
								break while_138_;
							} while (false);
							i_185_ = (i_187_ - i_183_ >> 1) + 2048;
						} while (false);
						for (i_188_ = 0; anInt3355 > i_188_; i_188_++) {
							if (anIntArray3358[i_188_] <= i_185_ && i_185_ < anIntArray3358[i_188_ + 1]) {
								if (i_185_ < anIntArray3359[i_188_]) {
									i_186_ = 4096;
								}
								break;
							}
						}
						is_182_[i_184_] = i_186_;
					}
				} else {
					int i_189_ = 0;
					for (int i_190_ = 0; anInt3355 > i_190_; i_190_++) {
						if (i_183_ >= anIntArray3358[i_190_] && i_183_ < anIntArray3358[1 + i_190_]) {
							if (i_183_ < anIntArray3359[i_190_]) {
								i_189_ = 4096;
							}
							break;
						}
					}
					Class4.method91(is_182_, 0, Class120_Sub12_Sub7.anInt3178, i_189_);
				}
			}
			is = is_182_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("rm.D(").append(i).append(',').append(i_181_).append(')').toString());
		}
		return is;
	}
}
