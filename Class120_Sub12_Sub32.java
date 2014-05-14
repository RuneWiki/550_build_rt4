/* Class120_Sub12_Sub32 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class120_Sub12_Sub32 extends Class120_Sub12 {
	static char[] aCharArray3385 = { '\u20ac', '\0', '\u201a', '\u0192', '\u201e', '\u2026', '\u2020', '\u2021', '\u02c6', '\u2030', '\u0160', '\u2039', '\u0152', '\0', '\u017d', '\0', '\0', '\u2018', '\u2019', '\u201c', '\u201d', '\u2022', '\u2013', '\u2014', '\u02dc', '\u2122', '\u0161',
			'\u203a', '\u0153', '\0', '\u017e', '\u0178' };
	private int anInt3386 = 6;
	static String[] aStringArray3387 = null;

	@Override
	final void method1180(final byte i, final Buffer class120_sub7, final int i_0_) {
		do {
			try {
				if (i == -43) {
					final int i_1_ = i_0_;
					if (i_1_ != 0) {
						if (i_1_ != 1) {
							break;
						}
					} else {
						anInt3386 = class120_sub7.getUByte();
						break;
					}
					this.aBoolean2558 = class120_sub7.getUByte() == 1;
				}
			} catch (final RuntimeException runtimeexception) {
				throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("sl.M(").append(i).append(',').append(class120_sub7 != null ? "{...}" : "null").append(',').append(i_0_).append(')').toString());
			}
		} while (false);
	}

	static final void method1369(final int i, final int i_2_, final int i_3_, final int i_4_, final int i_5_, final int i_6_) {
		try {
			final int i_7_ = i_6_ + -i_5_;
			final int i_8_ = i_2_ + -i;
			if (i_7_ == 0) {
				if (i_8_ != 0) {
					Class82.method713(i_5_, i, i_2_, i_3_, false);
				}
			} else if (i_8_ == 0) {
				Class40.method321(true, i_5_, i_6_, i_3_, i);
			} else {
				final int i_9_ = (i_8_ << 12) / i_7_;
				final int i_10_ = -(i_5_ * i_9_ >> 12) + i;
				int i_11_;
				int i_12_;
				if (i_5_ >= Class32.anInt260) {
					if (Class120_Sub14_Sub11.anInt3544 >= i_5_) {
						i_12_ = i_5_;
						i_11_ = i;
					} else {
						i_12_ = Class120_Sub14_Sub11.anInt3544;
						i_11_ = (Class120_Sub14_Sub11.anInt3544 * i_9_ >> 12) + i_10_;
					}
				} else {
					i_11_ = i_10_ - -(Class32.anInt260 * i_9_ >> 12);
					i_12_ = Class32.anInt260;
				}
				int i_13_;
				int i_14_;
				if (i_6_ >= Class32.anInt260) {
					if (i_6_ <= Class120_Sub14_Sub11.anInt3544) {
						i_13_ = i_6_;
						i_14_ = i_2_;
					} else {
						i_13_ = Class120_Sub14_Sub11.anInt3544;
						i_14_ = (i_9_ * Class120_Sub14_Sub11.anInt3544 >> 12) + i_10_;
					}
				} else {
					i_13_ = Class32.anInt260;
					i_14_ = i_10_ + (Class32.anInt260 * i_9_ >> 12);
				}
				if (Class120_Sub30_Sub2.anInt3699 > i_14_) {
					i_13_ = (Class120_Sub30_Sub2.anInt3699 + -i_10_ << 12) / i_9_;
					i_14_ = Class120_Sub30_Sub2.anInt3699;
				} else if (Class139.anInt1334 < i_14_) {
					i_13_ = (Class139.anInt1334 + -i_10_ << 12) / i_9_;
					i_14_ = Class139.anInt1334;
				}
				if (Class120_Sub30_Sub2.anInt3699 <= i_11_) {
					if (i_11_ > Class139.anInt1334) {
						i_11_ = Class139.anInt1334;
						i_12_ = (-i_10_ + Class139.anInt1334 << 12) / i_9_;
					}
				} else {
					i_12_ = (-i_10_ + Class120_Sub30_Sub2.anInt3699 << 12) / i_9_;
					i_11_ = Class120_Sub30_Sub2.anInt3699;
				}
				Class120_Sub3.method1056(i_14_, i_12_, i_11_, -1, i_3_, i_13_);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("sl.W(").append(i).append(',').append(i_2_).append(',').append(i_3_).append(',').append(i_4_).append(',').append(i_5_).append(',').append(i_6_).append(')').toString());
		}
	}

	static final void method1370(final int[] is, final Player class180_sub5_sub1, final int i, final int[] is_15_, final int[] is_16_) {
		try {
			for (int i_17_ = 0; is_16_.length > i_17_; i_17_++) {
				final int i_18_ = is_16_[i_17_];
				final int i_19_ = is_15_[i_17_];
				int i_20_ = is[i_17_];
				for (int i_21_ = 0; i_20_ != 0 && i_21_ < class180_sub5_sub1.aClass150Array2972.length; i_21_++) {
					if ((0x1 & i_20_) != 0) {
						if (i_18_ != -1) {
							final Class40 class40 = Class120_Sub30_Sub2.method1763(i_18_, 118);
							Class150 class150 = class180_sub5_sub1.aClass150Array2972[i_21_];
							final int i_22_ = class40.anInt337;
							if (class150 != null) {
								if (class150.anInt1406 != i_18_) {
									if (class40.anInt348 >= Class120_Sub30_Sub2.method1763(class150.anInt1406, 123).anInt348) {
										class150 = class180_sub5_sub1.aClass150Array2972[i_21_] = null;
									}
								} else if (i_22_ == 0) {
									class150 = class180_sub5_sub1.aClass150Array2972[i_21_] = null;
								} else if (i_22_ == 1) {
									class150.anInt1413 = 0;
									class150.anInt1414 = 1;
									class150.anInt1410 = 0;
									class150.anInt1416 = 0;
									class150.anInt1411 = i_19_;
									Class120_Sub12_Sub23.method1323(class40, class180_sub5_sub1.z, class180_sub5_sub1.x, 0, Class100.selfPlayer == class180_sub5_sub1, false);
								} else if (i_22_ == 2) {
									class150.anInt1416 = 0;
								}
							}
							if (class150 == null) {
								class150 = class180_sub5_sub1.aClass150Array2972[i_21_] = new Class150();
								class150.anInt1406 = i_18_;
								class150.anInt1410 = 0;
								class150.anInt1416 = 0;
								class150.anInt1411 = i_19_;
								class150.anInt1414 = 1;
								class150.anInt1413 = 0;
								Class120_Sub12_Sub23.method1323(class40, class180_sub5_sub1.z, class180_sub5_sub1.x, 0, class180_sub5_sub1 == Class100.selfPlayer, false);
							}
						} else {
							class180_sub5_sub1.aClass150Array2972[i_21_] = null;
						}
					}
					i_20_ >>>= 1;
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception,
					new StringBuilder("sl.S(").append(is != null ? "{...}" : "null").append(',').append(class180_sub5_sub1 != null ? "{...}" : "null").append(',').append(i).append(',').append(is_15_ != null ? "{...}" : "null").append(',').append(is_16_ != null ? "{...}" : "null").append(')')
							.toString());
		}
	}

	public Class120_Sub12_Sub32() {
		super(2, false);
	}

	static final void method1371(final GameEntity class180_sub5, final byte i) {
		try {
			final Class29 class29 = class180_sub5.method2336((byte) 126);
			class180_sub5.anInt3004 = class29.anInt218;
			if (i != -49) {
				method1371(null, (byte) -72);
			}
			if (class180_sub5.anInt2960 == 0) {
				class180_sub5.anInt3037 = 0;
			} else {
				if (class180_sub5.anInt3006 != -1 && class180_sub5.anInt2993 == 0) {
					final Class40 class40 = Class120_Sub30_Sub2.method1763(class180_sub5.anInt3006, 125);
					if (class180_sub5.anInt3031 > 0 && class40.anInt343 == 0) {
						class180_sub5.anInt3037++;
						return;
					}
					if (class180_sub5.anInt3031 <= 0 && class40.anInt336 == 0) {
						class180_sub5.anInt3037++;
						return;
					}
				}
				if ((class180_sub5.spotAnimId ^ 0xffffffff) != 0 && Class101_Sub2.loopCycle >= class180_sub5.anInt2979) {
					final SpotAnimType spotAnimType = SpotAnimType.list(class180_sub5.spotAnimId);
					if (spotAnimType.aBoolean998 && (spotAnimType.anInt991 ^ 0xffffffff) != 0) {
						final Class40 class40 = Class120_Sub30_Sub2.method1763(spotAnimType.anInt991, i ^ ~0x4b);
						if (class180_sub5.anInt3031 > 0 && class40.anInt343 == 0) {
							class180_sub5.anInt3037++;
							return;
						}
						if (class180_sub5.anInt3031 <= 0 && class40.anInt336 == 0) {
							class180_sub5.anInt3037++;
							return;
						}
					}
				}
				final int i_23_ = class180_sub5.x;
				final int i_24_ = class180_sub5.z;
				final int i_25_ = 128 * class180_sub5.anIntArray2958[-1 + class180_sub5.anInt2960] - -(class180_sub5.getSize() * 64);
				final int i_26_ = class180_sub5.anIntArray3040[class180_sub5.anInt2960 + -1] * 128 - -(64 * class180_sub5.getSize());
				if (-i_23_ + i_25_ > 256 || -i_23_ + i_25_ < -256 || i_26_ + -i_24_ > 256 || -i_24_ + i_26_ < -256) {
					class180_sub5.z = i_26_;
					class180_sub5.x = i_25_;
				} else {
					if (i_25_ <= i_23_) {
						if (i_23_ <= i_25_) {
							if (i_26_ > i_24_) {
								class180_sub5.anInt3019 = 1024;
							} else if (i_24_ > i_26_) {
								class180_sub5.anInt3019 = 0;
							}
						} else if (i_24_ >= i_26_) {
							if (i_26_ >= i_24_) {
								class180_sub5.anInt3019 = 512;
							} else {
								class180_sub5.anInt3019 = 256;
							}
						} else {
							class180_sub5.anInt3019 = 768;
						}
					} else if (i_24_ >= i_26_) {
						if (i_24_ > i_26_) {
							class180_sub5.anInt3019 = 1792;
						} else {
							class180_sub5.anInt3019 = 1536;
						}
					} else {
						class180_sub5.anInt3019 = 1280;
					}
					int i_27_ = class29.anInt187;
					int i_28_ = 0x7ff & class180_sub5.anInt3019 + -class180_sub5.anInt3032;
					if (i_28_ > 1024) {
						i_28_ -= 2048;
					}
					if (i_28_ >= -256 && i_28_ <= 256) {
						i_27_ = class29.anInt205;
					} else if (i_28_ < 256 || i_28_ >= 768) {
						if (i_28_ >= -768 && i_28_ <= -256) {
							i_27_ = class29.anInt213;
						}
					} else {
						i_27_ = class29.anInt200;
					}
					if (i_27_ == -1) {
						i_27_ = class29.anInt205;
					}
					class180_sub5.anInt3004 = i_27_;
					int i_29_ = 4;
					boolean bool = true;
					if (class180_sub5 instanceof Npc) {
						bool = ((Npc) class180_sub5).npcType.aBoolean1701;
					}
					int i_30_ = 1;
					if (bool) {
						if (class180_sub5.anInt3032 != class180_sub5.anInt3019 && (class180_sub5.anInt2981 ^ 0xffffffff) == 0 && class180_sub5.anInt3010 != 0) {
							i_29_ = 2;
						}
						if (class180_sub5.anInt2960 > 2) {
							i_29_ = 6;
						}
						if (class180_sub5.anInt2960 > 3) {
							i_29_ = 8;
						}
						if (class180_sub5.anInt3037 > 0 && class180_sub5.anInt2960 > 1) {
							i_29_ = 8;
							class180_sub5.anInt3037--;
						}
					} else {
						if (class180_sub5.anInt2960 > 1) {
							i_29_ = 6;
						}
						if (class180_sub5.anInt2960 > 2) {
							i_29_ = 8;
						}
						if (class180_sub5.anInt3037 > 0 && class180_sub5.anInt2960 > 1) {
							class180_sub5.anInt3037--;
							i_29_ = 8;
						}
					}
					if (class180_sub5.aByteArray2973[-1 + class180_sub5.anInt2960] == 2) {
						i_30_ = 2;
						i_29_ <<= 1;
					} else if (class180_sub5.aByteArray2973[class180_sub5.anInt2960 + -1] == 0) {
						i_29_ >>= 1;
						i_30_ = 0;
					}
					if (i_29_ < 8 || (class29.anInt190 ^ 0xffffffff) == 0) {
						if (class29.anInt212 != -1 && i_30_ == 0) {
							if (class29.anInt187 == class180_sub5.anInt3004 && (class29.anInt192 ^ 0xffffffff) != 0) {
								class180_sub5.anInt3004 = class29.anInt192;
							} else if (class180_sub5.anInt3004 != class29.anInt213 || (class29.anInt210 ^ 0xffffffff) == 0) {
								if (class29.anInt200 == class180_sub5.anInt3004 && class29.anInt219 != -1) {
									class180_sub5.anInt3004 = class29.anInt219;
								} else {
									class180_sub5.anInt3004 = class29.anInt212;
								}
							} else {
								class180_sub5.anInt3004 = class29.anInt210;
							}
						}
					} else if (class180_sub5.anInt3004 == class29.anInt187 && (class29.anInt188 ^ 0xffffffff) != 0) {
						class180_sub5.anInt3004 = class29.anInt188;
					} else if (class29.anInt213 != class180_sub5.anInt3004 || (class29.anInt223 ^ 0xffffffff) == 0) {
						if (class29.anInt200 == class180_sub5.anInt3004 && (class29.anInt216 ^ 0xffffffff) != 0) {
							class180_sub5.anInt3004 = class29.anInt216;
						} else {
							class180_sub5.anInt3004 = class29.anInt190;
						}
					} else {
						class180_sub5.anInt3004 = class29.anInt223;
					}
					if ((class29.anInt201 ^ 0xffffffff) != 0) {
						i_29_ <<= 7;
						if (class180_sub5.anInt2960 == 1) {
							final int i_31_ = class180_sub5.anInt2996 * class180_sub5.anInt2996;
							final int i_32_ = (i_26_ >= class180_sub5.z ? i_26_ + -class180_sub5.z : class180_sub5.z - i_26_) << 7;
							final int i_33_ = (i_25_ < class180_sub5.x ? -i_25_ + class180_sub5.x : -class180_sub5.x + i_25_) << 7;
							final int i_34_ = i_32_ >= i_33_ ? i_32_ : i_33_;
							final int i_35_ = class29.anInt201 * 2 * i_34_;
							if (i_35_ >= i_31_) {
								if (i_31_ / 2 > i_34_) {
									class180_sub5.anInt2996 -= class29.anInt201;
									if (class180_sub5.anInt2996 < 0) {
										class180_sub5.anInt2996 = 0;
									}
								} else if (class180_sub5.anInt2996 < i_29_) {
									class180_sub5.anInt2996 += class29.anInt201;
									if (i_29_ < class180_sub5.anInt2996) {
										class180_sub5.anInt2996 = i_29_;
									}
								}
							} else {
								class180_sub5.anInt2996 /= 2;
							}
						} else if (class180_sub5.anInt2996 >= i_29_) {
							if (class180_sub5.anInt2996 > 0) {
								class180_sub5.anInt2996 -= class29.anInt201;
								if (class180_sub5.anInt2996 < 0) {
									class180_sub5.anInt2996 = 0;
								}
							}
						} else {
							class180_sub5.anInt2996 += class29.anInt201;
							if (i_29_ < class180_sub5.anInt2996) {
								class180_sub5.anInt2996 = i_29_;
							}
						}
						i_29_ = class180_sub5.anInt2996 >> 7;
						if (i_29_ < 1) {
							i_29_ = 1;
						}
					}
					if (i_26_ > i_24_) {
						class180_sub5.z += i_29_;
						if (i_26_ < class180_sub5.z) {
							class180_sub5.z = i_26_;
						}
					} else if (i_24_ > i_26_) {
						class180_sub5.z -= i_29_;
						if (i_26_ > class180_sub5.z) {
							class180_sub5.z = i_26_;
						}
					}
					if (i_23_ >= i_25_) {
						if (i_23_ > i_25_) {
							class180_sub5.x -= i_29_;
							if (class180_sub5.x < i_25_) {
								class180_sub5.x = i_25_;
							}
						}
					} else {
						class180_sub5.x += i_29_;
						if (class180_sub5.x > i_25_) {
							class180_sub5.x = i_25_;
						}
					}
					if (class180_sub5.x == i_25_ && class180_sub5.z == i_26_) {
						class180_sub5.anInt2960--;
						if (class180_sub5.anInt3031 > 0) {
							class180_sub5.anInt3031--;
						}
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("sl.T(").append(class180_sub5 != null ? "{...}" : "null").append(',').append(i).append(')').toString());
		}
	}

	static final void uncacheJInterface(final int group) {
		if (group != -1 && Class57.interfaceLoaded[group]) {
			Class101_Sub4.interfaceJs5.clearFiles(group);
			if (Node.interfaceCache[group] != null) {
				boolean discard = true;
				for (int file = 0; file < Node.interfaceCache[group].length; file++) {
					if (Node.interfaceCache[group][file] != null) {
						if (Node.interfaceCache[group][file].type == 2) {
							discard = false;
						} else {
							Node.interfaceCache[group][file] = null;
						}
					}
				}
				if (discard) {
					Node.interfaceCache[group] = null;
				}
				Class57.interfaceLoaded[group] = false;
			}
		}
	}

	static final void method1373(final int i, final int i_38_) {
		try {
			if (i_38_ != 881) {
				aStringArray3387 = null;
			}
			final InterfaceChangeNode class120_sub14_sub7 = AbstractObject.putInterfaceChange(7, i);
			class120_sub14_sub7.method1453((byte) -104);
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("sl.R(").append(i).append(',').append(i_38_).append(')').toString());
		}
	}

	public static void method1374(final byte i) {
		try {
			aStringArray3387 = null;
			aCharArray3385 = null;
			if (i != -26) {
				aCharArray3385 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("sl.U(").append(i).append(')').toString());
		}
	}

	@Override
	final int[] method1187(final int i, final int i_39_) {
		int[] is;
		try {
			final int[] is_40_ = this.aClass30_2563.method258(i_39_, 119);
			while_154_: do {
				if (this.aClass30_2563.aBoolean238) {
					final int[] is_41_ = method1192(-7764, i_39_, 0);
					final int[] is_42_ = method1192(-7764, i_39_, 1);
					int i_43_ = anInt3386;
					while_153_: do {
						while_152_: do {
							while_151_: do {
								while_150_: do {
									while_149_: do {
										while_148_: do {
											while_147_: do {
												while_146_: do {
													while_145_: do {
														do {
															if (i_43_ != 1) {
																if (i_43_ != 2) {
																	if (i_43_ != 3) {
																		if (i_43_ != 4) {
																			if (i_43_ != 5) {
																				if (i_43_ != 6) {
																					if (i_43_ != 7) {
																						if (i_43_ != 8) {
																							if (i_43_ != 9) {
																								if (i_43_ != 10) {
																									if (i_43_ != 11) {
																										if (i_43_ != 12) {
																											break while_154_;
																										}
																									} else {
																										break while_152_;
																									}
																									break while_153_;
																								}
																							} else {
																								break while_150_;
																							}
																							break while_151_;
																						}
																					} else {
																						break while_148_;
																					}
																					break while_149_;
																				}
																			} else {
																				break while_146_;
																			}
																			break while_147_;
																		}
																	} else {
																		break;
																	}
																	break while_145_;
																}
															} else {
																for (i_43_ = 0; i_43_ < Class120_Sub12_Sub7.anInt3178; i_43_++) {
																	is_40_[i_43_] = is_42_[i_43_] + is_41_[i_43_];
																}
																break while_154_;
															}
															for (i_43_ = 0; Class120_Sub12_Sub7.anInt3178 > i_43_; i_43_++) {
																is_40_[i_43_] = is_41_[i_43_] + -is_42_[i_43_];
															}
															break while_154_;
														} while (false);
														for (i_43_ = 0; Class120_Sub12_Sub7.anInt3178 > i_43_; i_43_++) {
															is_40_[i_43_] = is_41_[i_43_] * is_42_[i_43_] >> 12;
														}
														break while_154_;
													} while (false);
													for (i_43_ = 0; i_43_ < Class120_Sub12_Sub7.anInt3178; i_43_++) {
														final int i_44_ = is_42_[i_43_];
														is_40_[i_43_] = i_44_ != 0 ? (is_41_[i_43_] << 12) / i_44_ : 4096;
													}
													break while_154_;
												} while (false);
												for (i_43_ = 0; i_43_ < Class120_Sub12_Sub7.anInt3178; i_43_++) {
													is_40_[i_43_] = 4096 + -((-is_41_[i_43_] + 4096) * (-is_42_[i_43_] + 4096) >> 12);
												}
												break while_154_;
											} while (false);
											for (i_43_ = 0; Class120_Sub12_Sub7.anInt3178 > i_43_; i_43_++) {
												final int i_45_ = is_42_[i_43_];
												is_40_[i_43_] = i_45_ >= 2048 ? 4096 - ((4096 + -i_45_) * (4096 - is_41_[i_43_]) >> 11) : i_45_ * is_41_[i_43_] >> 11;
											}
											break while_154_;
										} while (false);
										for (i_43_ = 0; i_43_ < Class120_Sub12_Sub7.anInt3178; i_43_++) {
											final int i_46_ = is_41_[i_43_];
											is_40_[i_43_] = i_46_ != 4096 ? (is_42_[i_43_] << 12) / (-i_46_ + 4096) : 4096;
										}
										break while_154_;
									} while (false);
									for (i_43_ = 0; Class120_Sub12_Sub7.anInt3178 > i_43_; i_43_++) {
										final int i_47_ = is_41_[i_43_];
										is_40_[i_43_] = i_47_ != 0 ? 4096 - (4096 - is_42_[i_43_] << 12) / i_47_ : 0;
									}
									break while_154_;
								} while (false);
								for (i_43_ = 0; i_43_ < Class120_Sub12_Sub7.anInt3178; i_43_++) {
									final int i_48_ = is_41_[i_43_];
									final int i_49_ = is_42_[i_43_];
									is_40_[i_43_] = i_48_ < i_49_ ? i_48_ : i_49_;
								}
								break while_154_;
							} while (false);
							for (i_43_ = 0; i_43_ < Class120_Sub12_Sub7.anInt3178; i_43_++) {
								final int i_50_ = is_41_[i_43_];
								final int i_51_ = is_42_[i_43_];
								is_40_[i_43_] = i_50_ <= i_51_ ? i_51_ : i_50_;
							}
							break while_154_;
						} while (false);
						for (i_43_ = 0; i_43_ < Class120_Sub12_Sub7.anInt3178; i_43_++) {
							final int i_52_ = is_42_[i_43_];
							final int i_53_ = is_41_[i_43_];
							is_40_[i_43_] = i_52_ < i_53_ ? i_53_ + -i_52_ : i_52_ + -i_53_;
						}
						break while_154_;
					} while (false);
					for (i_43_ = 0; i_43_ < Class120_Sub12_Sub7.anInt3178; i_43_++) {
						final int i_54_ = is_41_[i_43_];
						final int i_55_ = is_42_[i_43_];
						is_40_[i_43_] = -(i_55_ * i_54_ >> 11) + i_54_ - -i_55_;
					}
				}
			} while (false);
			if (i != -1735) {
				anInt3386 = -126;
			}
			is = is_40_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("sl.D(").append(i).append(',').append(i_39_).append(')').toString());
		}
		return is;
	}

	@Override
	final int[][] method1188(final int i, final int i_56_) {
		int[][] is;
		try {
			if (i_56_ != -29869) {
				return null;
			}
			final int[][] is_57_ = this.aClass109_2559.method975(i, -103);
			while_164_: do {
				if (this.aClass109_2559.aBoolean1049) {
					final int[][] is_58_ = method1179(0, i, (byte) -51);
					final int[][] is_59_ = method1179(1, i, (byte) -51);
					final int[] is_60_ = is_57_[0];
					final int[] is_61_ = is_57_[1];
					final int[] is_62_ = is_58_[0];
					final int[] is_63_ = is_57_[2];
					final int[] is_64_ = is_58_[1];
					final int[] is_65_ = is_59_[2];
					final int[] is_66_ = is_58_[2];
					final int[] is_67_ = is_59_[1];
					final int[] is_68_ = is_59_[0];
					int i_69_ = anInt3386;
					while_163_: do {
						while_162_: do {
							while_161_: do {
								while_160_: do {
									while_159_: do {
										while_158_: do {
											while_157_: do {
												while_156_: do {
													while_155_: do {
														do {
															if (i_69_ != 1) {
																if (i_69_ != 2) {
																	if (i_69_ != 3) {
																		if (i_69_ != 4) {
																			if (i_69_ != 5) {
																				if (i_69_ != 6) {
																					if (i_69_ != 7) {
																						if (i_69_ != 8) {
																							if (i_69_ != 9) {
																								if (i_69_ != 10) {
																									if (i_69_ != 11) {
																										if (i_69_ != 12) {
																											break while_164_;
																										}
																									} else {
																										break while_162_;
																									}
																									break while_163_;
																								}
																							} else {
																								break while_160_;
																							}
																							break while_161_;
																						}
																					} else {
																						break while_158_;
																					}
																					break while_159_;
																				}
																			} else {
																				break while_156_;
																			}
																			break while_157_;
																		}
																	} else {
																		break;
																	}
																	break while_155_;
																}
															} else {
																for (i_69_ = 0; Class120_Sub12_Sub7.anInt3178 > i_69_; i_69_++) {
																	is_60_[i_69_] = is_62_[i_69_] - -is_68_[i_69_];
																	is_61_[i_69_] = is_64_[i_69_] + is_67_[i_69_];
																	is_63_[i_69_] = is_66_[i_69_] + is_65_[i_69_];
																}
																break while_164_;
															}
															for (i_69_ = 0; Class120_Sub12_Sub7.anInt3178 > i_69_; i_69_++) {
																is_60_[i_69_] = -is_68_[i_69_] + is_62_[i_69_];
																is_61_[i_69_] = is_64_[i_69_] - is_67_[i_69_];
																is_63_[i_69_] = is_66_[i_69_] + -is_65_[i_69_];
															}
															break while_164_;
														} while (false);
														for (i_69_ = 0; Class120_Sub12_Sub7.anInt3178 > i_69_; i_69_++) {
															is_60_[i_69_] = is_62_[i_69_] * is_68_[i_69_] >> 12;
															is_61_[i_69_] = is_67_[i_69_] * is_64_[i_69_] >> 12;
															is_63_[i_69_] = is_65_[i_69_] * is_66_[i_69_] >> 12;
														}
														break while_164_;
													} while (false);
													for (i_69_ = 0; i_69_ < Class120_Sub12_Sub7.anInt3178; i_69_++) {
														final int i_70_ = is_67_[i_69_];
														final int i_71_ = is_68_[i_69_];
														final int i_72_ = is_65_[i_69_];
														is_60_[i_69_] = i_71_ != 0 ? (is_62_[i_69_] << 12) / i_71_ : 4096;
														is_61_[i_69_] = i_70_ == 0 ? 4096 : (is_64_[i_69_] << 12) / i_70_;
														is_63_[i_69_] = i_72_ == 0 ? 4096 : (is_66_[i_69_] << 12) / i_72_;
													}
													break while_164_;
												} while (false);
												for (i_69_ = 0; Class120_Sub12_Sub7.anInt3178 > i_69_; i_69_++) {
													is_60_[i_69_] = 4096 - ((4096 + -is_62_[i_69_]) * (4096 - is_68_[i_69_]) >> 12);
													is_61_[i_69_] = 4096 + -((-is_64_[i_69_] + 4096) * (4096 + -is_67_[i_69_]) >> 12);
													is_63_[i_69_] = 4096 + -((-is_66_[i_69_] + 4096) * (4096 - is_65_[i_69_]) >> 12);
												}
												break while_164_;
											} while (false);
											for (i_69_ = 0; Class120_Sub12_Sub7.anInt3178 > i_69_; i_69_++) {
												final int i_73_ = is_67_[i_69_];
												final int i_74_ = is_68_[i_69_];
												final int i_75_ = is_65_[i_69_];
												is_60_[i_69_] = i_74_ >= 2048 ? 4096 + -((4096 - is_62_[i_69_]) * (-i_74_ + 4096) >> 11) : i_74_ * is_62_[i_69_] >> 11;
												is_61_[i_69_] = i_73_ >= 2048 ? 4096 - ((4096 + -is_64_[i_69_]) * (-i_73_ + 4096) >> 11) : is_64_[i_69_] * i_73_ >> 11;
												is_63_[i_69_] = i_75_ >= 2048 ? 4096 + -((4096 - is_66_[i_69_]) * (-i_75_ + 4096) >> 11) : is_66_[i_69_] * i_75_ >> 11;
											}
											break while_164_;
										} while (false);
										for (i_69_ = 0; i_69_ < Class120_Sub12_Sub7.anInt3178; i_69_++) {
											final int i_76_ = is_66_[i_69_];
											final int i_77_ = is_64_[i_69_];
											final int i_78_ = is_62_[i_69_];
											is_60_[i_69_] = i_78_ == 4096 ? 4096 : (is_68_[i_69_] << 12) / (-i_78_ + 4096);
											is_61_[i_69_] = i_77_ == 4096 ? 4096 : (is_67_[i_69_] << 12) / (-i_77_ + 4096);
											is_63_[i_69_] = i_76_ != 4096 ? (is_65_[i_69_] << 12) / (4096 + -i_76_) : 4096;
										}
										break while_164_;
									} while (false);
									for (i_69_ = 0; i_69_ < Class120_Sub12_Sub7.anInt3178; i_69_++) {
										final int i_79_ = is_64_[i_69_];
										final int i_80_ = is_66_[i_69_];
										final int i_81_ = is_62_[i_69_];
										is_60_[i_69_] = i_81_ == 0 ? 0 : 4096 - (-is_68_[i_69_] + 4096 << 12) / i_81_;
										is_61_[i_69_] = i_79_ == 0 ? 0 : 4096 + -((-is_67_[i_69_] + 4096 << 12) / i_79_);
										is_63_[i_69_] = i_80_ == 0 ? 0 : -((4096 + -is_65_[i_69_] << 12) / i_80_) + 4096;
									}
									break while_164_;
								} while (false);
								for (i_69_ = 0; Class120_Sub12_Sub7.anInt3178 > i_69_; i_69_++) {
									final int i_82_ = is_66_[i_69_];
									final int i_83_ = is_65_[i_69_];
									final int i_84_ = is_67_[i_69_];
									final int i_85_ = is_68_[i_69_];
									final int i_86_ = is_62_[i_69_];
									final int i_87_ = is_64_[i_69_];
									is_60_[i_69_] = i_86_ >= i_85_ ? i_85_ : i_86_;
									is_61_[i_69_] = i_87_ < i_84_ ? i_87_ : i_84_;
									is_63_[i_69_] = i_83_ <= i_82_ ? i_83_ : i_82_;
								}
								break while_164_;
							} while (false);
							for (i_69_ = 0; Class120_Sub12_Sub7.anInt3178 > i_69_; i_69_++) {
								final int i_88_ = is_62_[i_69_];
								final int i_89_ = is_66_[i_69_];
								final int i_90_ = is_65_[i_69_];
								final int i_91_ = is_68_[i_69_];
								final int i_92_ = is_67_[i_69_];
								final int i_93_ = is_64_[i_69_];
								is_60_[i_69_] = i_88_ > i_91_ ? i_88_ : i_91_;
								is_61_[i_69_] = i_93_ > i_92_ ? i_93_ : i_92_;
								is_63_[i_69_] = i_89_ > i_90_ ? i_89_ : i_90_;
							}
							break while_164_;
						} while (false);
						for (i_69_ = 0; Class120_Sub12_Sub7.anInt3178 > i_69_; i_69_++) {
							final int i_94_ = is_68_[i_69_];
							final int i_95_ = is_67_[i_69_];
							final int i_96_ = is_66_[i_69_];
							final int i_97_ = is_65_[i_69_];
							final int i_98_ = is_62_[i_69_];
							final int i_99_ = is_64_[i_69_];
							is_60_[i_69_] = i_98_ <= i_94_ ? i_94_ - i_98_ : -i_94_ + i_98_;
							is_61_[i_69_] = i_99_ <= i_95_ ? -i_99_ + i_95_ : -i_95_ + i_99_;
							is_63_[i_69_] = i_96_ <= i_97_ ? i_97_ + -i_96_ : -i_97_ + i_96_;
						}
						break while_164_;
					} while (false);
					for (i_69_ = 0; i_69_ < Class120_Sub12_Sub7.anInt3178; i_69_++) {
						final int i_100_ = is_64_[i_69_];
						final int i_101_ = is_66_[i_69_];
						final int i_102_ = is_68_[i_69_];
						final int i_103_ = is_65_[i_69_];
						final int i_104_ = is_62_[i_69_];
						final int i_105_ = is_67_[i_69_];
						is_60_[i_69_] = -(i_102_ * i_104_ >> 11) + i_102_ + i_104_;
						is_61_[i_69_] = i_105_ + i_100_ + -(i_100_ * i_105_ >> 11);
						is_63_[i_69_] = -(i_103_ * i_101_ >> 11) + i_101_ + i_103_;
					}
				}
			} while (false);
			is = is_57_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("sl.K(").append(i).append(',').append(i_56_).append(')').toString());
		}
		return is;
	}
}
