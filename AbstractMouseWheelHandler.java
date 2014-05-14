/* Class17 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;

abstract class AbstractMouseWheelHandler {
	static Queue aClass177_114;
	static Class50 aClass50_115;
	static int anInt116 = -1;
	static int anInt117 = 0;
	static int packetSize;
	static int anInt119;

	static {
		aClass177_114 = new Queue();
		packetSize = 0;
	}

	abstract void removeListener(Component component);

	public static void method157(final int i) {
		try {
			aClass50_115 = null;
			if (i == 11170) {
				aClass177_114 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("bh.F(").append(i).append(')').toString());
		}
	}

	static final void method158(final int i, final int i_0_, final boolean bool, final int i_1_, final int i_2_, final int i_3_, final int i_4_) {
		try {
			Class153.method2076(i_1_, (byte) -14);
			int i_5_ = 0;
			int i_6_ = -i_1_;
			int i_7_ = i_1_ - i;
			int i_8_ = i_1_;
			int i_9_ = -1;
			int i_10_ = -1;
			final int[] is = GameEntity.anIntArrayArray3009[i_4_];
			if (i_7_ < 0) {
				i_7_ = 0;
			}
			int i_11_ = i_7_;
			final int i_12_ = i_3_ + -i_7_;
			if (!bool) {
				packetSize = -62;
			}
			Class120_Sub8.method1160((byte) 115, is, i_0_, -i_1_ + i_3_, i_12_);
			final int i_13_ = i_7_ + i_3_;
			int i_14_ = -i_7_;
			Class120_Sub8.method1160((byte) 115, is, i_2_, i_12_, i_13_);
			Class120_Sub8.method1160((byte) 115, is, i_0_, i_13_, i_3_ + i_1_);
			while (i_8_ > i_5_) {
				i_10_ += 2;
				i_6_ += i_10_;
				i_9_ += 2;
				i_14_ += i_9_;
				if (i_14_ >= 0 && i_11_ >= 1) {
					Class120_Sub14_Sub23.anIntArray3654[i_11_] = i_5_;
					i_11_--;
					i_14_ -= i_11_ << 1;
				}
				i_5_++;
				if (i_6_ >= 0) {
					if (--i_8_ >= i_7_) {
						final int[] is_15_ = GameEntity.anIntArrayArray3009[i_4_ + i_8_];
						final int i_16_ = i_3_ - -i_5_;
						final int[] is_17_ = GameEntity.anIntArrayArray3009[-i_8_ + i_4_];
						final int i_18_ = -i_5_ + i_3_;
						Class120_Sub8.method1160((byte) 115, is_15_, i_0_, i_18_, i_16_);
						Class120_Sub8.method1160((byte) 115, is_17_, i_0_, i_18_, i_16_);
					} else {
						final int[] is_19_ = GameEntity.anIntArrayArray3009[i_8_ + i_4_];
						final int i_20_ = Class120_Sub14_Sub23.anIntArray3654[i_8_];
						final int[] is_21_ = GameEntity.anIntArrayArray3009[-i_8_ + i_4_];
						final int i_22_ = i_5_ + i_3_;
						final int i_23_ = i_3_ - i_20_;
						final int i_24_ = i_20_ + i_3_;
						final int i_25_ = -i_5_ + i_3_;
						Class120_Sub8.method1160((byte) 115, is_19_, i_0_, i_25_, i_23_);
						Class120_Sub8.method1160((byte) 115, is_19_, i_2_, i_23_, i_24_);
						Class120_Sub8.method1160((byte) 115, is_19_, i_0_, i_24_, i_22_);
						Class120_Sub8.method1160((byte) 115, is_21_, i_0_, i_25_, i_23_);
						Class120_Sub8.method1160((byte) 115, is_21_, i_2_, i_23_, i_24_);
						Class120_Sub8.method1160((byte) 115, is_21_, i_0_, i_24_, i_22_);
					}
					i_6_ -= i_8_ << 1;
				}
				final int[] is_26_ = GameEntity.anIntArrayArray3009[i_4_ - -i_5_];
				final int[] is_27_ = GameEntity.anIntArrayArray3009[-i_5_ + i_4_];
				final int i_28_ = i_8_ + i_3_;
				final int i_29_ = -i_8_ + i_3_;
				if (i_7_ <= i_5_) {
					Class120_Sub8.method1160((byte) 115, is_26_, i_0_, i_29_, i_28_);
					Class120_Sub8.method1160((byte) 115, is_27_, i_0_, i_29_, i_28_);
				} else {
					final int i_30_ = i_5_ > i_11_ ? Class120_Sub14_Sub23.anIntArray3654[i_5_] : i_11_;
					final int i_31_ = i_30_ + i_3_;
					final int i_32_ = i_3_ - i_30_;
					Class120_Sub8.method1160((byte) 115, is_26_, i_0_, i_29_, i_32_);
					Class120_Sub8.method1160((byte) 115, is_26_, i_2_, i_32_, i_31_);
					Class120_Sub8.method1160((byte) 115, is_26_, i_0_, i_31_, i_28_);
					Class120_Sub8.method1160((byte) 115, is_27_, i_0_, i_29_, i_32_);
					Class120_Sub8.method1160((byte) 115, is_27_, i_2_, i_32_, i_31_);
					Class120_Sub8.method1160((byte) 115, is_27_, i_0_, i_31_, i_28_);
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("bh.E(").append(i).append(',').append(i_0_).append(',').append(bool).append(',').append(i_1_).append(',').append(i_2_).append(',').append(i_3_).append(',').append(i_4_).append(')').toString());
		}
	}

	static final Class120_Sub12 method159(final int i, final int i_33_) {
		Class120_Sub12 class120_sub12;
		try {
			final int i_34_ = i_33_;
			while_82_: do {
				while_81_: do {
					while_80_: do {
						while_79_: do {
							while_78_: do {
								while_77_: do {
									while_76_: do {
										while_75_: do {
											while_74_: do {
												while_73_: do {
													while_72_: do {
														while_71_: do {
															while_70_: do {
																while_69_: do {
																	while_68_: do {
																		while_67_: do {
																			while_66_: do {
																				while_65_: do {
																					while_64_: do {
																						while_63_: do {
																							while_62_: do {
																								while_61_: do {
																									while_60_: do {
																										while_59_: do {
																											while_58_: do {
																												while_57_: do {
																													while_56_: do {
																														while_55_: do {
																															while_54_: do {
																																while_53_: do {
																																	while_52_: do {
																																		while_51_: do {
																																			while_50_: do {
																																				while_49_: do {
																																					while_48_: do {
																																						while_47_: do {
																																							while_46_: do {
																																								while_45_: do {
																																									do {
																																										if (i_34_ != 0) {
																																											if (i_34_ != 1) {
																																												if (i_34_ != 2) {
																																													if (i_34_ != 3) {
																																														if (i_34_ != 4) {
																																															if (i_34_ != 5) {
																																																if (i_34_ != 6) {
																																																	if (i_34_ != 7) {
																																																		if (i_34_ != 8) {
																																																			if (i_34_ != 9) {
																																																				if (i_34_ != 10) {
																																																					if (i_34_ != 11) {
																																																						if (i_34_ != 12) {
																																																							if (i_34_ != 13) {
																																																								if (i_34_ != 14) {
																																																									if (i_34_ != 15) {
																																																										if (i_34_ != 16) {
																																																											if (i_34_ != 17) {
																																																												if (i_34_ != 18) {
																																																													if (i_34_ != 19) {
																																																														if (i_34_ != 20) {
																																																															if (i_34_ != 21) {
																																																																if (i_34_ != 22) {
																																																																	if (i_34_ != 23) {
																																																																		if (i_34_ != 24) {
																																																																			if (i_34_ != 25) {
																																																																				if (i_34_ != 26) {
																																																																					if (i_34_ != 27) {
																																																																						if (i_34_ != 28) {
																																																																							if (i_34_ != 29) {
																																																																								if (i_34_ != 30) {
																																																																									if (i_34_ != 31) {
																																																																										if (i_34_ != 32) {
																																																																											if (i_34_ != 33) {
																																																																												if (i_34_ != 34) {
																																																																													if (i_34_ != 35) {
																																																																														if (i_34_ != 36) {
																																																																															if (i_34_ != 37) {
																																																																																if (i_34_ != 38) {
																																																																																	if (i_34_ != 39) {
																																																																																		break while_82_;
																																																																																	}
																																																																																} else {
																																																																																	break while_80_;
																																																																																}
																																																																																break while_81_;
																																																																															}
																																																																														} else {
																																																																															break while_78_;
																																																																														}
																																																																														break while_79_;
																																																																													}
																																																																												} else {
																																																																													break while_76_;
																																																																												}
																																																																												break while_77_;
																																																																											}
																																																																										} else {
																																																																											break while_74_;
																																																																										}
																																																																										break while_75_;
																																																																									}
																																																																								} else {
																																																																									break while_72_;
																																																																								}
																																																																								break while_73_;
																																																																							}
																																																																						} else {
																																																																							break while_70_;
																																																																						}
																																																																						break while_71_;
																																																																					}
																																																																				} else {
																																																																					break while_68_;
																																																																				}
																																																																				break while_69_;
																																																																			}
																																																																		} else {
																																																																			break while_66_;
																																																																		}
																																																																		break while_67_;
																																																																	}
																																																																} else {
																																																																	break while_64_;
																																																																}
																																																																break while_65_;
																																																															}
																																																														} else {
																																																															break while_62_;
																																																														}
																																																														break while_63_;
																																																													}
																																																												} else {
																																																													break while_60_;
																																																												}
																																																												break while_61_;
																																																											}
																																																										} else {
																																																											break while_58_;
																																																										}
																																																										break while_59_;
																																																									}
																																																								} else {
																																																									break while_56_;
																																																								}
																																																								break while_57_;
																																																							}
																																																						} else {
																																																							break while_54_;
																																																						}
																																																						break while_55_;
																																																					}
																																																				} else {
																																																					break while_52_;
																																																				}
																																																				break while_53_;
																																																			}
																																																		} else {
																																																			break while_50_;
																																																		}
																																																		break while_51_;
																																																	}
																																																} else {
																																																	break while_48_;
																																																}
																																																break while_49_;
																																															}
																																														} else {
																																															break while_46_;
																																														}
																																														break while_47_;
																																													}
																																												} else {
																																													break;
																																												}
																																												break while_45_;
																																											}
																																										} else {
																																											return new Class120_Sub12_Sub24();
																																										}
																																										return new Class120_Sub12_Sub11();
																																									} while (false);
																																									return new Class120_Sub12_Sub23();
																																								} while (false);
																																								return new Class120_Sub12_Sub7();
																																							} while (false);
																																							return new Class120_Sub12_Sub33();
																																						} while (false);
																																						return new Class120_Sub12_Sub38();
																																					} while (false);
																																					return new Class120_Sub12_Sub4();
																																				} while (false);
																																				return new Class120_Sub12_Sub32();
																																			} while (false);
																																			return new Class120_Sub12_Sub20();
																																		} while (false);
																																		return new Class120_Sub12_Sub9();
																																	} while (false);
																																	return new Class120_Sub12_Sub39();
																																} while (false);
																																return new Class120_Sub12_Sub3();
																															} while (false);
																															return new Class120_Sub12_Sub37();
																														} while (false);
																														return new Class120_Sub12_Sub30();
																													} while (false);
																													return new Class120_Sub12_Sub16();
																												} while (false);
																												return new Class120_Sub12_Sub27();
																											} while (false);
																											return new Class120_Sub12_Sub25();
																										} while (false);
																										return new Class120_Sub12_Sub17();
																									} while (false);
																									return new Class120_Sub12_Sub21_Sub1();
																								} while (false);
																								return new Class120_Sub12_Sub22();
																							} while (false);
																							return new Class120_Sub12_Sub15();
																						} while (false);
																						return new Class120_Sub12_Sub10();
																					} while (false);
																					return new Class120_Sub12_Sub34();
																				} while (false);
																				return new Class120_Sub12_Sub36();
																			} while (false);
																			return new Class120_Sub12_Sub35();
																		} while (false);
																		return new Class120_Sub12_Sub2();
																	} while (false);
																	return new Class120_Sub12_Sub18();
																} while (false);
																return new Class120_Sub12_Sub28();
															} while (false);
															return new Class120_Sub12_Sub1();
														} while (false);
														return new Class120_Sub12_Sub14();
													} while (false);
													return new Class120_Sub12_Sub29();
												} while (false);
												return new Class120_Sub12_Sub6();
											} while (false);
											return new Class120_Sub12_Sub5();
										} while (false);
										return new Class120_Sub12_Sub19();
									} while (false);
									return new Class120_Sub12_Sub12();
								} while (false);
								return new Class120_Sub12_Sub31();
							} while (false);
							return new Class120_Sub12_Sub8();
						} while (false);
						return new Class120_Sub12_Sub26();
					} while (false);
					return new Class120_Sub12_Sub13();
				} while (false);
				return new Class120_Sub12_Sub21();
			} while (false);
			if (i != 9) {
				return null;
			}
			class120_sub12 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("bh.G(").append(i).append(',').append(i_33_).append(')').toString());
		}
		return class120_sub12;
	}

	public AbstractMouseWheelHandler() {
		/* empty */
	}

	static final void method160() {
		Class43.playerModelsCache.clear();
		Class90.playerHeadModelsCache.clear();
	}

	abstract int getRotation();

	abstract void addListener(Component component);
}
