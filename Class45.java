/* Class45 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;

final class Class45 {
	static int anInt396;
	static Class50 aClass50_397;
	static String aString398 = "Loading wordpack - ";
	static String[] aStringArray399;
	static String aString400 = "Starting 3d Library";
	private final Queue aClass177_401 = new Queue();
	private final Queue aClass177_402 = new Queue();
	private final Queue aClass177_403 = new Queue();
	private Queue aClass177_404 = new Queue();
	private int anInt405;
	private final Buffer aClass120_Sub7_406 = new Buffer(4);
	private long aLong407;
	private Class46 aClass46_408;
	private Buffer aClass120_Sub7_409;
	volatile int anInt410 = 0;
	volatile int anInt411 = 0;
	private byte aByte412 = 0;
	private Class120_Sub14_Sub14_Sub2 aClass120_Sub14_Sub14_Sub2_413;

	private final int method354(final int i) {
		int i_0_;
		try {
			i_0_ = aClass177_403.getAmount() - -aClass177_404.getAmount();
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("en.B(").append(i).append(')').toString());
		}
		return i_0_;
	}

	final void method355(final int i) {
		do {
			try {
				if (aClass46_408 != null) {
					try {
						aClass120_Sub7_406.pos = 0;
						aClass120_Sub7_406.putByte(7);
						aClass120_Sub7_406.method1104((byte) 9, 0);
						aClass46_408.method381(i, aClass120_Sub7_406.buf, 4, 30000);
					} catch (final IOException ioexception) {
						try {
							aClass46_408.method377(-19055);
						} catch (final Exception exception) {
							/* empty */
						}
						aClass46_408 = null;
						this.anInt410++;
						this.anInt411 = -2;
						break;
					}
				}
				break;
			} catch (final RuntimeException runtimeexception) {
				throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("en.L(").append(i).append(')').toString());
			}
		} while (false);
	}

	static final void method356(final int i, final int i_1_, final int i_2_, final int i_3_, final int i_4_, final int i_5_, final int i_6_) {
		try {
			Class153.method2076(i, (byte) -14);
			int i_7_ = i + -i_1_;
			int i_8_ = i;
			int i_9_ = 0;
			int i_10_ = -i;
			if (i_7_ < 0) {
				i_7_ = 0;
			}
			int i_11_ = i_7_;
			if (Class120_Sub30_Sub2.anInt3699 <= i_6_ && i_6_ <= Class139.anInt1334) {
				final int[] is = GameEntity.anIntArrayArray3009[i_6_];
				final int i_12_ = Class3.method83(Class32.anInt260, i_2_ - i, 1, Class120_Sub14_Sub11.anInt3544);
				final int i_13_ = Class3.method83(Class32.anInt260, i + i_2_, 1, Class120_Sub14_Sub11.anInt3544);
				final int i_14_ = Class3.method83(Class32.anInt260, -i_7_ + i_2_, i_4_ ^ ~0x1, Class120_Sub14_Sub11.anInt3544);
				final int i_15_ = Class3.method83(Class32.anInt260, i_2_ + i_7_, i_4_ ^ ~0x1, Class120_Sub14_Sub11.anInt3544);
				Class120_Sub8.method1160((byte) 115, is, i_3_, i_12_, i_14_);
				Class120_Sub8.method1160((byte) 115, is, i_5_, i_14_, i_15_);
				Class120_Sub8.method1160((byte) 115, is, i_3_, i_15_, i_13_);
			}
			int i_16_ = -i_7_;
			int i_17_ = -1;
			int i_18_ = i_4_;
			while (i_9_ < i_8_) {
				i_17_ += 2;
				i_16_ += i_17_;
				i_18_ += 2;
				if (i_16_ >= 0 && i_11_ >= 1) {
					i_11_--;
					i_16_ -= i_11_ << 1;
					Class120_Sub14_Sub23.anIntArray3654[i_11_] = i_9_;
				}
				i_9_++;
				i_10_ += i_18_;
				if (i_10_ >= 0) {
					i_8_--;
					i_10_ -= i_8_ << 1;
					final int i_19_ = i_6_ + -i_8_;
					final int i_20_ = i_6_ - -i_8_;
					if (Class120_Sub30_Sub2.anInt3699 <= i_20_ && i_19_ <= Class139.anInt1334) {
						if (i_8_ >= i_7_) {
							final int i_21_ = Class3.method83(Class32.anInt260, i_2_ - -i_9_, 1, Class120_Sub14_Sub11.anInt3544);
							final int i_22_ = Class3.method83(Class32.anInt260, i_2_ - i_9_, 1, Class120_Sub14_Sub11.anInt3544);
							if (Class139.anInt1334 >= i_20_) {
								Class120_Sub8.method1160((byte) 115, GameEntity.anIntArrayArray3009[i_20_], i_3_, i_22_, i_21_);
							}
							if (i_19_ >= Class120_Sub30_Sub2.anInt3699) {
								Class120_Sub8.method1160((byte) 115, GameEntity.anIntArrayArray3009[i_19_], i_3_, i_22_, i_21_);
							}
						} else {
							final int i_23_ = Class120_Sub14_Sub23.anIntArray3654[i_8_];
							final int i_24_ = Class3.method83(Class32.anInt260, i_2_ - -i_9_, i_4_ ^ ~0x1, Class120_Sub14_Sub11.anInt3544);
							final int i_25_ = Class3.method83(Class32.anInt260, i_2_ - i_9_, 1, Class120_Sub14_Sub11.anInt3544);
							final int i_26_ = Class3.method83(Class32.anInt260, i_2_ - -i_23_, 1, Class120_Sub14_Sub11.anInt3544);
							final int i_27_ = Class3.method83(Class32.anInt260, i_2_ - i_23_, 1, Class120_Sub14_Sub11.anInt3544);
							if (Class139.anInt1334 >= i_20_) {
								final int[] is = GameEntity.anIntArrayArray3009[i_20_];
								Class120_Sub8.method1160((byte) 115, is, i_3_, i_25_, i_27_);
								Class120_Sub8.method1160((byte) 115, is, i_5_, i_27_, i_26_);
								Class120_Sub8.method1160((byte) 115, is, i_3_, i_26_, i_24_);
							}
							if (Class120_Sub30_Sub2.anInt3699 <= i_19_) {
								final int[] is = GameEntity.anIntArrayArray3009[i_19_];
								Class120_Sub8.method1160((byte) 115, is, i_3_, i_25_, i_27_);
								Class120_Sub8.method1160((byte) 115, is, i_5_, i_27_, i_26_);
								Class120_Sub8.method1160((byte) 115, is, i_3_, i_26_, i_24_);
							}
						}
					}
				}
				final int i_28_ = i_6_ + i_9_;
				final int i_29_ = i_6_ + -i_9_;
				if (Class120_Sub30_Sub2.anInt3699 <= i_28_ && Class139.anInt1334 >= i_29_) {
					int i_30_ = i_8_ + i_2_;
					int i_31_ = -i_8_ + i_2_;
					if (i_30_ >= Class32.anInt260 && Class120_Sub14_Sub11.anInt3544 >= i_31_) {
						i_30_ = Class3.method83(Class32.anInt260, i_30_, 1, Class120_Sub14_Sub11.anInt3544);
						i_31_ = Class3.method83(Class32.anInt260, i_31_, 1, Class120_Sub14_Sub11.anInt3544);
						if (i_9_ >= i_7_) {
							if (Class139.anInt1334 >= i_28_) {
								Class120_Sub8.method1160((byte) 115, GameEntity.anIntArrayArray3009[i_28_], i_3_, i_31_, i_30_);
							}
							if (Class120_Sub30_Sub2.anInt3699 <= i_29_) {
								Class120_Sub8.method1160((byte) 115, GameEntity.anIntArrayArray3009[i_29_], i_3_, i_31_, i_30_);
							}
						} else {
							final int i_32_ = i_11_ >= i_9_ ? i_11_ : Class120_Sub14_Sub23.anIntArray3654[i_9_];
							final int i_33_ = Class3.method83(Class32.anInt260, i_2_ - -i_32_, 1, Class120_Sub14_Sub11.anInt3544);
							final int i_34_ = Class3.method83(Class32.anInt260, i_2_ - i_32_, 1, Class120_Sub14_Sub11.anInt3544);
							if (Class139.anInt1334 >= i_28_) {
								final int[] is = GameEntity.anIntArrayArray3009[i_28_];
								Class120_Sub8.method1160((byte) 115, is, i_3_, i_31_, i_34_);
								Class120_Sub8.method1160((byte) 115, is, i_5_, i_34_, i_33_);
								Class120_Sub8.method1160((byte) 115, is, i_3_, i_33_, i_30_);
							}
							if (Class120_Sub30_Sub2.anInt3699 <= i_29_) {
								final int[] is = GameEntity.anIntArrayArray3009[i_29_];
								Class120_Sub8.method1160((byte) 115, is, i_3_, i_31_, i_34_);
								Class120_Sub8.method1160((byte) 115, is, i_5_, i_34_, i_33_);
								Class120_Sub8.method1160((byte) 115, is, i_3_, i_33_, i_30_);
							}
						}
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("en.R(").append(i).append(',').append(i_1_).append(',').append(i_2_).append(',').append(i_3_).append(',').append(i_4_).append(',').append(i_5_).append(',').append(i_6_).append(')').toString());
		}
	}

	final boolean method357() {
		return method366(false) >= 20;
	}

	static final int method358(final int i) {
		int i_35_;
		try {
			if (i < 113) {
				method368((byte) -67, null, -45, null, null, null, null, null, null, null, 115, null);
			}
			i_35_ = 14;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("en.G(").append(i).append(')').toString());
		}
		return i_35_;
	}

	public static void method359(final int i) {
		try {
			aString400 = null;
			aString398 = null;
			if (i == -29587) {
				aStringArray399 = null;
				aClass50_397 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("en.C(").append(i).append(')').toString());
		}
	}

	final void method360(final byte i) {
		try {
			if (i > -71) {
				aClass46_408 = null;
			}
			if (aClass46_408 != null) {
				aClass46_408.method378((byte) 52);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("en.P(").append(i).append(')').toString());
		}
	}

	final void method361(final int i, final Class46 class46, final boolean bool) {
		try {
			if (aClass46_408 != null) {
				try {
					aClass46_408.method377(-19055);
				} catch (final Exception exception) {
					/* empty */
				}
				aClass46_408 = null;
			}
			aClass46_408 = class46;
			method370((byte) 22);
			method367((byte) 122, bool);
			aClass120_Sub14_Sub14_Sub2_413 = null;
			aClass120_Sub7_409.pos = 0;
			for (;;) {
				final Class120_Sub14_Sub14_Sub2 class120_sub14_sub14_sub2 = (Class120_Sub14_Sub14_Sub2) aClass177_402.removeFirst();
				if (class120_sub14_sub14_sub2 == null) {
					break;
				}
				aClass177_401.insertLast(class120_sub14_sub14_sub2);
			}
			for (;;) {
				final Class120_Sub14_Sub14_Sub2 class120_sub14_sub14_sub2 = (Class120_Sub14_Sub14_Sub2) aClass177_404.removeFirst();
				if (class120_sub14_sub14_sub2 == null) {
					break;
				}
				aClass177_403.insertLast(class120_sub14_sub14_sub2);
			}
			if (aByte412 != 0) {
				try {
					aClass120_Sub7_406.pos = 0;
					aClass120_Sub7_406.putByte(4);
					aClass120_Sub7_406.putByte(aByte412);
					aClass120_Sub7_406.putShort(0);
					aClass46_408.method381(0, aClass120_Sub7_406.buf, 4, 30000);
				} catch (final IOException ioexception) {
					try {
						aClass46_408.method377(-19055);
					} catch (final Exception exception) {
						/* empty */
					}
					aClass46_408 = null;
					this.anInt410++;
					this.anInt411 = -2;
				}
			}
			anInt405 = 0;
			aLong407 = TimeUtil.getSafeTime();
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("en.H(").append(i).append(',').append(class46 != null ? "{...}" : "null").append(',').append(bool).append(')').toString());
		}
	}

	final Class120_Sub14_Sub14_Sub2 method362(final byte i, final int i_36_, final boolean bool, final int i_37_, final int i_38_) {
		Class120_Sub14_Sub14_Sub2 class120_sub14_sub14_sub2;
		try {
			if (i_37_ != -24559) {
				return null;
			}
			final long l = i_38_ + (i_36_ << 16);
			final Class120_Sub14_Sub14_Sub2 class120_sub14_sub14_sub2_39_ = new Class120_Sub14_Sub14_Sub2();
			class120_sub14_sub14_sub2_39_.aByte3938 = i;
			class120_sub14_sub14_sub2_39_.aBoolean3573 = bool;
			class120_sub14_sub14_sub2_39_.subUid = l;
			if (!bool) {
				if (method354(93) >= 20) {
					throw new RuntimeException();
				}
				aClass177_403.insertLast(class120_sub14_sub14_sub2_39_);
			} else {
				if (method366(false) >= 20) {
					throw new RuntimeException();
				}
				aClass177_401.insertLast(class120_sub14_sub14_sub2_39_);
			}
			class120_sub14_sub14_sub2 = class120_sub14_sub14_sub2_39_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("en.O(").append(i).append(',').append(i_36_).append(',').append(bool).append(',').append(i_37_).append(',').append(i_38_).append(')').toString());
		}
		return class120_sub14_sub14_sub2;
	}

	static final boolean method363(final int i, final int i_40_, final int i_41_, final int i_42_) {
		if (!Class69_Sub1.method618(i, i_40_, i_41_)) {
			return false;
		}
		final int i_43_ = i_40_ << 7;
		final int i_44_ = i_41_ << 7;
		if (Class120_Sub12_Sub34.method1380(i_43_ + 1, Class120_Sub26.anIntArrayArrayArray2741[i][i_40_][i_41_] + i_42_, i_44_ + 1) && Class120_Sub12_Sub34.method1380(i_43_ + 128 - 1, Class120_Sub26.anIntArrayArrayArray2741[i][i_40_ + 1][i_41_] + i_42_, i_44_ + 1)
				&& Class120_Sub12_Sub34.method1380(i_43_ + 128 - 1, Class120_Sub26.anIntArrayArrayArray2741[i][i_40_ + 1][i_41_ + 1] + i_42_, i_44_ + 128 - 1) && Class120_Sub12_Sub34.method1380(i_43_ + 1, Class120_Sub26.anIntArrayArrayArray2741[i][i_40_][i_41_ + 1] + i_42_, i_44_ + 128 - 1)) {
			return true;
		}
		return false;
	}

	final void method364(final int i) {
		try {
			if (i > -83) {
				aClass120_Sub7_409 = null;
			}
			if (aClass46_408 != null) {
				aClass46_408.method377(-19055);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("en.A(").append(i).append(')').toString());
		}
	}

	final void method365(final int i) {
		try {
			try {
				aClass46_408.method377(-19055);
			} catch (final Exception exception) {
				/* empty */
			}
			aClass46_408 = null;
			if (i == -30223) {
				aByte412 = (byte) (int) (1.0 + Math.random() * 255.0);
				this.anInt411 = -1;
				this.anInt410++;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("en.J(").append(i).append(')').toString());
		}
	}

	final int method366(final boolean bool) {
		int i;
		try {
			if (bool) {
				return 123;
			}
			i = aClass177_401.getAmount() - -aClass177_402.getAmount();
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("en.F(").append(bool).append(')').toString());
		}
		return i;
	}

	final void method367(final byte i, final boolean bool) {
		do {
			try {
				if (aClass46_408 != null) {
					try {
						aClass120_Sub7_406.pos = 0;
						if (i < 116) {
							aClass120_Sub7_409 = null;
						}
						aClass120_Sub7_406.putByte(bool ? 2 : 3);
						aClass120_Sub7_406.method1104((byte) 9, 0);
						aClass46_408.method381(0, aClass120_Sub7_406.buf, 4, 30000);
					} catch (final IOException ioexception) {
						try {
							aClass46_408.method377(-19055);
						} catch (final Exception exception) {
							/* empty */
						}
						this.anInt410++;
						aClass46_408 = null;
						this.anInt411 = -2;
						break;
					}
				}
				break;
			} catch (final RuntimeException runtimeexception) {
				throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("en.D(").append(i).append(',').append(bool).append(')').toString());
			}
		} while (false);
	}

	static final void method368(final byte i, final byte[][] is, final int i_45_, final Light[] class44s, final int[][] is_46_, final byte[][] is_47_, final float[][] fs, final byte[][] is_48_, final float[][] fs_49_, final float[][] fs_50_, final int i_51_, final byte[][] is_52_) {
		try {
			if (i == -99) {
				for (int i_53_ = 0; i_53_ < i_45_; i_53_++) {
					final Light light = class44s[i_53_];
					if (light.anInt384 == i_51_) {
						final Class133 class133 = new Class133();
						int i_54_ = -light.anInt370 + (light.anInt373 >> 7);
						int i_55_ = 0;
						if (i_54_ < 0) {
							i_55_ -= i_54_;
							i_54_ = 0;
						}
						int i_56_ = light.anInt370 + (light.anInt373 >> 7);
						if (i_56_ > 103) {
							i_56_ = 103;
						}
						final int i_57_ = (light.anInt395 >> 7) + -light.anInt370;
						for (int i_58_ = i_54_; i_58_ <= i_56_; i_58_++) {
							final int i_59_ = light.aShortArray372[i_55_];
							int i_60_ = (i_59_ >> 8) + i_57_;
							int i_61_ = (0xff & i_59_) + i_60_ + -1;
							if (i_60_ < 0) {
								i_60_ = 0;
							}
							if (i_61_ > 103) {
								i_61_ = 103;
							}
							for (int i_62_ = i_60_; i_61_ >= i_62_; i_62_++) {
								final int i_63_ = 0xff & is_47_[i_62_][i_58_];
								final int i_64_ = is_48_[i_62_][i_58_] & 0xff;
								boolean bool = false;
								if (i_63_ == 0) {
									if (i_64_ == 0) {
										continue;
									}
									final Class124 class124 = Class118.method1025((byte) -127, i_64_ - 1);
									if (class124.anInt1197 == -1) {
										continue;
									}
									if (is_52_[i_62_][i_58_] != 0) {
										final int[] is_65_ = Class120_Sub12_Sub4.anIntArrayArray3157[is_52_[i_62_][i_58_]];
										class133.anInt1262 += -6 + (is_65_.length >> 1) * 3;
										class133.anInt1260 += is_65_.length >> 1;
										continue;
									}
								} else if (i_64_ != 0) {
									final Class124 class124 = Class118.method1025((byte) -128, -1 + i_64_);
									if ((class124.anInt1197 ^ 0xffffffff) != 0) {
										final byte i_66_ = is_52_[i_62_][i_58_];
										if (i_66_ != 0) {
											bool = true;
										}
									} else {
										final byte i_67_ = is_52_[i_62_][i_58_];
										if (i_67_ != 0) {
											final int[] is_68_ = InterfaceChangeNode.anIntArrayArray3488[i_67_];
											class133.anInt1262 += -6 + 3 * (is_68_.length >> 1);
											class133.anInt1260 += is_68_.length >> 1;
										}
										continue;
									}
								}
								final Class28 class28 = Class180_Sub3.method2315(i_51_, i_62_, i_58_);
								if (class28 != null) {
									final int i_69_ = (int) (class28.aLong186 >> 14) & 0x3f;
									if (i_69_ == 9) {
										int[] is_70_ = null;
										final int i_71_ = 0x3 & (int) (class28.aLong186 >> 20);
										if ((i_71_ & 0x1) == 0) {
											boolean bool_72_ = i_62_ + -1 >= i_60_;
											if (!bool_72_ && i_56_ >= 1 + i_58_) {
												final int i_73_ = light.aShortArray372[i_55_ - -1];
												final int i_74_ = i_57_ + (i_73_ >> 8);
												final int i_75_ = (0xff & i_73_) + i_74_;
												bool_72_ = i_62_ > i_74_ && i_75_ > i_62_;
											}
											boolean bool_76_ = i_61_ >= 1 + i_62_;
											if (!bool_76_ && i_58_ - 1 >= i_54_) {
												final int i_77_ = light.aShortArray372[-1 + i_55_];
												final int i_78_ = i_57_ - -(i_77_ >> 8);
												final int i_79_ = i_78_ + (0xff & i_77_);
												bool_76_ = i_78_ < i_62_ && i_62_ < i_79_;
											}
											if (bool_72_ && bool_76_) {
												is_70_ = Class120_Sub12_Sub4.anIntArrayArray3157[0];
											} else if (!bool_72_) {
												if (bool_76_) {
													is_70_ = Class120_Sub12_Sub4.anIntArrayArray3157[1];
												}
											} else {
												is_70_ = Class120_Sub12_Sub4.anIntArrayArray3157[1];
											}
										} else {
											boolean bool_80_ = i_60_ <= i_62_ + -1;
											if (!bool_80_ && i_54_ <= -1 + i_58_) {
												final int i_81_ = light.aShortArray372[-1 + i_55_];
												final int i_82_ = (i_81_ >> 8) + i_57_;
												final int i_83_ = i_82_ + (i_81_ & 0xff);
												bool_80_ = i_62_ > i_82_ && i_83_ > i_62_;
											}
											boolean bool_84_ = i_62_ + 1 <= i_61_;
											if (!bool_84_ && i_56_ >= i_58_ + 1) {
												final int i_85_ = light.aShortArray372[1 + i_55_];
												final int i_86_ = (i_85_ >> 8) + i_57_;
												final int i_87_ = (i_85_ & 0xff) + i_86_;
												bool_84_ = i_86_ < i_62_ && i_62_ < i_87_;
											}
											if (bool_80_ && bool_84_) {
												is_70_ = Class120_Sub12_Sub4.anIntArrayArray3157[0];
											} else if (bool_80_) {
												is_70_ = Class120_Sub12_Sub4.anIntArrayArray3157[1];
											} else if (bool_84_) {
												is_70_ = Class120_Sub12_Sub4.anIntArrayArray3157[1];
											}
										}
										if (is_70_ != null) {
											class133.anInt1262 += (-2 + (is_70_.length >> 1)) * 3;
											class133.anInt1260 += is_70_.length >> 1;
										}
										continue;
									}
								}
								if (!bool) {
									final int[] is_88_ = Class120_Sub12_Sub4.anIntArrayArray3157[0];
									class133.anInt1262 += 3 * (-2 + (is_88_.length >> 1));
									class133.anInt1260 += is_88_.length >> 1;
								} else {
									final int[] is_89_ = Class120_Sub12_Sub4.anIntArrayArray3157[is_52_[i_62_][i_58_]];
									final int[] is_90_ = InterfaceChangeNode.anIntArrayArray3488[is_52_[i_62_][i_58_]];
									class133.anInt1262 += (-2 + (is_89_.length >> 1)) * 3;
									class133.anInt1262 += 3 * (-2 + (is_90_.length >> 1));
									class133.anInt1260 += is_89_.length >> 1;
									class133.anInt1260 += is_90_.length >> 1;
								}
							}
							i_55_++;
						}
						class133.method1945();
						i_55_ = 0;
						if ((light.anInt373 >> 7) + -light.anInt370 < 0) {
							i_55_ -= -light.anInt370 + (light.anInt373 >> 7);
						}
						for (int i_91_ = i_54_; i_56_ >= i_91_; i_91_++) {
							final int i_92_ = light.aShortArray372[i_55_];
							int i_93_ = i_57_ - -(i_92_ >> 8);
							int i_94_ = (0xff & i_92_) + i_93_ - 1;
							if (i_93_ < 0) {
								i_93_ = 0;
							}
							if (i_94_ > 103) {
								i_94_ = 103;
							}
							for (int i_95_ = i_93_; i_94_ >= i_95_; i_95_++) {
								byte i_96_ = is[i_95_][i_91_];
								final int i_97_ = 0xff & is_47_[i_95_][i_91_];
								final int i_98_ = 0xff & is_48_[i_95_][i_91_];
								boolean bool = false;
								if (i_97_ == 0) {
									if (i_98_ == 0) {
										continue;
									}
									final Class124 class124 = Class118.method1025((byte) -128, i_98_ - 1);
									if (class124.anInt1197 == -1) {
										continue;
									}
									if (is_52_[i_95_][i_91_] != 0) {
										Class120_Sub12_Sub11.method1255(light, Class120_Sub12_Sub4.anIntArrayArray3157[is_52_[i_95_][i_91_]], fs_49_, i_91_, i_95_, class133, fs, 1, fs_50_, is[i_95_][i_91_], is_46_);
										continue;
									}
								} else if (i_98_ != 0) {
									final Class124 class124 = Class118.method1025((byte) -126, -1 + i_98_);
									if ((class124.anInt1197 ^ 0xffffffff) == 0) {
										Class120_Sub12_Sub11.method1255(light, InterfaceChangeNode.anIntArrayArray3488[is_52_[i_95_][i_91_]], fs_49_, i_91_, i_95_, class133, fs, 1, fs_50_, is[i_95_][i_91_], is_46_);
										continue;
									}
									final byte i_99_ = is_52_[i_95_][i_91_];
									if (i_99_ != 0) {
										bool = true;
									}
								}
								final Class28 class28 = Class180_Sub3.method2315(i_51_, i_95_, i_91_);
								if (class28 != null) {
									final int i_100_ = 0x3f & (int) (class28.aLong186 >> 14);
									if (i_100_ == 9) {
										int[] is_101_ = null;
										final int i_102_ = (int) (class28.aLong186 >> 20) & 0x3;
										if ((0x1 & i_102_) == 0) {
											boolean bool_103_ = i_93_ <= i_95_ + -1;
											boolean bool_104_ = 1 + i_95_ <= i_94_;
											if (!bool_103_ && i_56_ >= i_91_ - -1) {
												final int i_105_ = light.aShortArray372[i_55_ + 1];
												final int i_106_ = (i_105_ >> 8) + i_57_;
												final int i_107_ = (0xff & i_105_) + i_106_;
												bool_103_ = i_106_ < i_95_ && i_95_ < i_107_;
											}
											if (!bool_104_ && -1 + i_91_ >= i_54_) {
												final int i_108_ = light.aShortArray372[i_55_ - 1];
												final int i_109_ = i_57_ - -(i_108_ >> 8);
												final int i_110_ = (0xff & i_108_) + i_109_;
												bool_104_ = i_109_ < i_95_ && i_95_ < i_110_;
											}
											if (!bool_103_ || !bool_104_) {
												if (!bool_103_) {
													if (bool_104_) {
														is_101_ = Class120_Sub12_Sub4.anIntArrayArray3157[1];
														i_96_ = (byte) 3;
													}
												} else {
													is_101_ = Class120_Sub12_Sub4.anIntArrayArray3157[1];
													i_96_ = (byte) 1;
												}
											} else {
												is_101_ = Class120_Sub12_Sub4.anIntArrayArray3157[0];
											}
										} else {
											boolean bool_111_ = i_95_ + -1 >= i_93_;
											boolean bool_112_ = i_94_ >= i_95_ + 1;
											if (!bool_111_ && i_91_ + -1 >= i_54_) {
												final int i_113_ = light.aShortArray372[-1 + i_55_];
												final int i_114_ = i_57_ + (i_113_ >> 8);
												final int i_115_ = i_114_ + (i_113_ & 0xff);
												bool_111_ = i_114_ < i_95_ && i_95_ < i_115_;
											}
											if (!bool_112_ && i_56_ >= i_91_ - -1) {
												final int i_116_ = light.aShortArray372[i_55_ - -1];
												final int i_117_ = i_57_ - -(i_116_ >> 8);
												final int i_118_ = (0xff & i_116_) + i_117_;
												bool_112_ = i_95_ > i_117_ && i_95_ < i_118_;
											}
											if (!bool_111_ || !bool_112_) {
												if (!bool_111_) {
													if (bool_112_) {
														is_101_ = Class120_Sub12_Sub4.anIntArrayArray3157[1];
														i_96_ = (byte) 2;
													}
												} else {
													is_101_ = Class120_Sub12_Sub4.anIntArrayArray3157[1];
													i_96_ = (byte) 0;
												}
											} else {
												is_101_ = Class120_Sub12_Sub4.anIntArrayArray3157[0];
											}
										}
										if (is_101_ != null) {
											Class120_Sub12_Sub11.method1255(light, is_101_, fs_49_, i_91_, i_95_, class133, fs, 1, fs_50_, i_96_, is_46_);
										}
										continue;
									}
								}
								if (!bool) {
									Class120_Sub12_Sub11.method1255(light, Class120_Sub12_Sub4.anIntArrayArray3157[0], fs_49_, i_91_, i_95_, class133, fs, 1, fs_50_, i_96_, is_46_);
								} else {
									Class120_Sub12_Sub11.method1255(light, InterfaceChangeNode.anIntArrayArray3488[is_52_[i_95_][i_91_]], fs_49_, i_91_, i_95_, class133, fs, i ^ ~0x63, fs_50_, is[i_95_][i_91_], is_46_);
									Class120_Sub12_Sub11.method1255(light, Class120_Sub12_Sub4.anIntArrayArray3157[is_52_[i_95_][i_91_]], fs_49_, i_91_, i_95_, class133, fs, i ^ ~0x63, fs_50_, is[i_95_][i_91_], is_46_);
								}
							}
							i_55_++;
						}
						if (class133.anInt1267 > 0 && class133.anInt1271 > 0) {
							class133.method1947();
							light.aClass133_380 = class133;
						}
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(
					runtimeexception,
					new StringBuilder("en.K(").append(i).append(',').append(is != null ? "{...}" : "null").append(',').append(i_45_).append(',').append(class44s != null ? "{...}" : "null").append(',').append(is_46_ != null ? "{...}" : "null").append(',').append(is_47_ != null ? "{...}" : "null")
							.append(',').append(fs != null ? "{...}" : "null").append(',').append(is_48_ != null ? "{...}" : "null").append(',').append(fs_49_ != null ? "{...}" : "null").append(',').append(fs_50_ != null ? "{...}" : "null").append(',').append(i_51_).append(',')
							.append(is_52_ != null ? "{...}" : "null").append(')').toString());
		}
	}

	final boolean method369(final boolean bool) {
		boolean bool_119_;
		try {
			if (!bool) {
				aClass177_404 = null;
			}
			bool_119_ = method354(-66) >= 20;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("en.E(").append(bool).append(')').toString());
		}
		return bool_119_;
	}

	private final void method370(final byte i) {
		do {
			try {
				if (aClass46_408 != null) {
					try {
						aClass120_Sub7_406.pos = 0;
						aClass120_Sub7_406.putByte(6);
						if (i > 3) {
							aClass120_Sub7_406.method1104((byte) 9, 3);
							aClass46_408.method381(0, aClass120_Sub7_406.buf, 4, 30000);
						}
					} catch (final IOException ioexception) {
						try {
							aClass46_408.method377(-19055);
						} catch (final Exception exception) {
							/* empty */
						}
						aClass46_408 = null;
						this.anInt411 = -2;
						this.anInt410++;
						break;
					}
				}
				break;
			} catch (final RuntimeException runtimeexception) {
				throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("en.Q(").append(i).append(')').toString());
			}
		} while (false);
	}

	final boolean method371(final int i) {
		boolean bool;
		try {
			if (aClass46_408 != null) {
				final long l = TimeUtil.getSafeTime();
				int i_120_ = (int) (-aLong407 + l);
				aLong407 = l;
				if (i_120_ > 200) {
					i_120_ = 200;
				}
				anInt405 += i_120_;
				if (anInt405 > 30000) {
					try {
						aClass46_408.method377(-19055);
					} catch (final Exception exception) {
						/* empty */
					}
					aClass46_408 = null;
				}
			}
			if (aClass46_408 == null) {
				if (method366(false) != 0 || method354(i ^ ~0x69d0) != 0) {
					return false;
				}
				return true;
			}
			boolean bool_121_;
			try {
				aClass46_408.method380((byte) -120);
				for (Class120_Sub14_Sub14_Sub2 class120_sub14_sub14_sub2 = (Class120_Sub14_Sub14_Sub2) aClass177_401.peekFirst(); class120_sub14_sub14_sub2 != null; class120_sub14_sub14_sub2 = (Class120_Sub14_Sub14_Sub2) aClass177_401.peekNext()) {
					aClass120_Sub7_406.pos = 0;
					aClass120_Sub7_406.putByte(1);
					aClass120_Sub7_406.method1104((byte) 9, (int) class120_sub14_sub14_sub2.subUid);
					aClass46_408.method381(0, aClass120_Sub7_406.buf, 4, i ^ ~0x1cb9);
					aClass177_402.insertLast(class120_sub14_sub14_sub2);
				}
				if (i != -27018) {
					aLong407 = -62L;
				}
				for (Class120_Sub14_Sub14_Sub2 class120_sub14_sub14_sub2 = (Class120_Sub14_Sub14_Sub2) aClass177_403.peekFirst(); class120_sub14_sub14_sub2 != null; class120_sub14_sub14_sub2 = (Class120_Sub14_Sub14_Sub2) aClass177_403.peekNext()) {
					aClass120_Sub7_406.pos = 0;
					aClass120_Sub7_406.putByte(0);
					aClass120_Sub7_406.method1104((byte) 9, (int) class120_sub14_sub14_sub2.subUid);
					aClass46_408.method381(0, aClass120_Sub7_406.buf, 4, 30000);
					aClass177_404.insertLast(class120_sub14_sub14_sub2);
				}
				for (int i_122_ = 0; i_122_ < 100; i_122_++) {
					final int i_123_ = aClass46_408.method375((byte) -68);
					if (i_123_ < 0) {
						throw new IOException();
					}
					if (i_123_ == 0) {
						break;
					}
					int i_124_ = 0;
					if (aClass120_Sub14_Sub14_Sub2_413 != null) {
						if (aClass120_Sub14_Sub14_Sub2_413.anInt3936 == 0) {
							i_124_ = 1;
						}
					} else {
						i_124_ = 8;
					}
					anInt405 = 0;
					if (i_124_ <= 0) {
						int i_125_ = 512 + -aClass120_Sub14_Sub14_Sub2_413.anInt3936;
						final int i_126_ = -aClass120_Sub14_Sub14_Sub2_413.aByte3938 + aClass120_Sub14_Sub14_Sub2_413.aClass120_Sub7_3939.buf.length;
						if (-aClass120_Sub14_Sub14_Sub2_413.aClass120_Sub7_3939.pos + i_126_ < i_125_) {
							i_125_ = -aClass120_Sub14_Sub14_Sub2_413.aClass120_Sub7_3939.pos + i_126_;
						}
						if (i_123_ < i_125_) {
							i_125_ = i_123_;
						}
						aClass46_408.method373(aClass120_Sub14_Sub14_Sub2_413.aClass120_Sub7_3939.pos, aClass120_Sub14_Sub14_Sub2_413.aClass120_Sub7_3939.buf, i_125_, (byte) 86);
						if (aByte412 != 0) {
							for (int i_127_ = 0; i_127_ < i_125_; i_127_++) {
								aClass120_Sub14_Sub14_Sub2_413.aClass120_Sub7_3939.buf[i_127_ + aClass120_Sub14_Sub14_Sub2_413.aClass120_Sub7_3939.pos] = (byte) Class120_Sub12_Sub38.method1397(aClass120_Sub14_Sub14_Sub2_413.aClass120_Sub7_3939.buf[i_127_
										+ aClass120_Sub14_Sub14_Sub2_413.aClass120_Sub7_3939.pos], aByte412);
							}
						}
						aClass120_Sub14_Sub14_Sub2_413.aClass120_Sub7_3939.pos += i_125_;
						aClass120_Sub14_Sub14_Sub2_413.anInt3936 += i_125_;
						if (i_126_ == aClass120_Sub14_Sub14_Sub2_413.aClass120_Sub7_3939.pos) {
							aClass120_Sub14_Sub14_Sub2_413.unlinkSub();
							aClass120_Sub14_Sub14_Sub2_413.aBoolean3576 = false;
							aClass120_Sub14_Sub14_Sub2_413 = null;
						} else if (aClass120_Sub14_Sub14_Sub2_413.anInt3936 == 512) {
							aClass120_Sub14_Sub14_Sub2_413.anInt3936 = 0;
						}
					} else {
						int i_128_ = -aClass120_Sub7_409.pos + i_124_;
						if (i_128_ > i_123_) {
							i_128_ = i_123_;
						}
						aClass46_408.method373(aClass120_Sub7_409.pos, aClass120_Sub7_409.buf, i_128_, (byte) 108);
						if (aByte412 != 0) {
							for (int i_129_ = 0; i_128_ > i_129_; i_129_++) {
								aClass120_Sub7_409.buf[aClass120_Sub7_409.pos - -i_129_] = (byte) Class120_Sub12_Sub38.method1397(aClass120_Sub7_409.buf[aClass120_Sub7_409.pos + i_129_], aByte412);
							}
						}
						aClass120_Sub7_409.pos += i_128_;
						if (i_124_ <= aClass120_Sub7_409.pos) {
							if (aClass120_Sub14_Sub14_Sub2_413 == null) {
								aClass120_Sub7_409.pos = 0;
								final int i_130_ = aClass120_Sub7_409.getUByte();
								final int i_131_ = aClass120_Sub7_409.getUShort();
								final int i_132_ = aClass120_Sub7_409.getUByte();
								final int i_133_ = 0x7f & i_132_;
								final boolean bool_134_ = (i_132_ & 0x80) != 0;
								final int i_135_ = aClass120_Sub7_409.getInt();
								final long l = i_131_ + (i_130_ << 16);
								Class120_Sub14_Sub14_Sub2 class120_sub14_sub14_sub2;
								if (bool_134_) {
									for (class120_sub14_sub14_sub2 = (Class120_Sub14_Sub14_Sub2) aClass177_404.peekFirst(); class120_sub14_sub14_sub2 != null; class120_sub14_sub14_sub2 = (Class120_Sub14_Sub14_Sub2) aClass177_404.peekNext()) {
										if ((class120_sub14_sub14_sub2.subUid ^ 0xffffffffffffffffL) == (l ^ 0xffffffffffffffffL)) {
											break;
										}
									}
								} else {
									for (class120_sub14_sub14_sub2 = (Class120_Sub14_Sub14_Sub2) aClass177_402.peekFirst(); class120_sub14_sub14_sub2 != null && l != class120_sub14_sub14_sub2.subUid; class120_sub14_sub14_sub2 = (Class120_Sub14_Sub14_Sub2) aClass177_402.peekNext()) {
										/* empty */
									}
								}
								if (class120_sub14_sub14_sub2 == null) {
									throw new IOException();
								}
								aClass120_Sub14_Sub14_Sub2_413 = class120_sub14_sub14_sub2;
								final int i_136_ = i_133_ != 0 ? 9 : 5;
								aClass120_Sub14_Sub14_Sub2_413.aClass120_Sub7_3939 = new Buffer(aClass120_Sub14_Sub14_Sub2_413.aByte3938 + i_135_ + i_136_);
								aClass120_Sub14_Sub14_Sub2_413.aClass120_Sub7_3939.putByte(i_133_);
								aClass120_Sub14_Sub14_Sub2_413.aClass120_Sub7_3939.putInt(i_135_);
								aClass120_Sub14_Sub14_Sub2_413.anInt3936 = 8;
								aClass120_Sub7_409.pos = 0;
							} else if (aClass120_Sub14_Sub14_Sub2_413.anInt3936 == 0) {
								if ((aClass120_Sub7_409.buf[0] ^ 0xffffffff) == 0) {
									aClass120_Sub7_409.pos = 0;
									aClass120_Sub14_Sub14_Sub2_413.anInt3936 = 1;
								} else {
									aClass120_Sub14_Sub14_Sub2_413 = null;
								}
							} else {
								throw new IOException();
							}
						}
					}
				}
				bool_121_ = true;
			} catch (final IOException ioexception) {
				try {
					aClass46_408.method377(-19055);
				} catch (final Exception exception) {
					/* empty */
				}
				aClass46_408 = null;
				this.anInt410++;
				this.anInt411 = -2;
				if (method366(false) == 0 && method354(i ^ 0x69a2) == 0) {
					return true;
				}
				return false;
			}
			bool = bool_121_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("en.I(").append(i).append(')').toString());
		}
		return bool;
	}

	public Class45() {
		aClass120_Sub7_409 = new Buffer(8);
	}
}
