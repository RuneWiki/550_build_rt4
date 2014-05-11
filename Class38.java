/* Class38 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class38 {
	static Class83 aClass83_319;
	static boolean cursorsEnabled = true;

	public static void method312(final int i) {
		try {
			aClass83_319 = null;
			if (i != -1) {
				cursorsEnabled = true;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ee.B(").append(i).append(')').toString());
		}
	}

	static final void method313(final int i, final int i_0_, final int i_1_, final int i_2_) {
		try {
			if (i_1_ != 1012) {
				if (i_1_ != 1002) {
					if (i_1_ == 1008) {
						Class112.method989(12, i_0_, -30073, i_2_);
					} else if (i_1_ != 1003) {
						if (i_1_ == 1011) {
							Class112.method989(14, i_0_, i ^ ~0x7692, i_2_);
						}
					} else {
						Class112.method989(13, i_0_, -30073, i_2_);
					}
				} else {
					Class112.method989(11, i_0_, i ^ ~0x7692, i_2_);
				}
			} else {
				Class112.method989(10, i_0_, -30073, i_2_);
			}
			if (i != 1002) {
				cursorsEnabled = false;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ee.D(").append(i).append(',').append(i_0_).append(',').append(i_1_).append(',').append(i_2_).append(')').toString());
		}
	}

	static final void method314(final int i, final int i_3_, final int i_4_) {
		for (int i_5_ = 0; i_5_ < Class142.anInt1361; i_5_++) {
			for (int i_6_ = 0; i_6_ < Class186.anInt1900; i_6_++) {
				for (int i_7_ = 0; i_7_ < Class120_Sub12_Sub38.anInt3440; i_7_++) {
					final Class120_Sub18 class120_sub18 = Class120_Sub1.aClass120_Sub18ArrayArrayArray2411[i_5_][i_6_][i_7_];
					if (class120_sub18 != null) {
						final Class182 class182 = class120_sub18.aClass182_2628;
						if (class182 != null && class182.aClass180_1800.method2268()) {
							Class120_Sub10.method1170(class182.aClass180_1800, i_5_, i_6_, i_7_, 1, 1);
							if (class182.aClass180_1796 != null && class182.aClass180_1796.method2268()) {
								Class120_Sub10.method1170(class182.aClass180_1796, i_5_, i_6_, i_7_, 1, 1);
								class182.aClass180_1800.method2267(class182.aClass180_1796, 0, 0, 0, false);
								class182.aClass180_1796 = class182.aClass180_1796.method2269(i, i_3_, i_4_);
							}
							class182.aClass180_1800 = class182.aClass180_1800.method2269(i, i_3_, i_4_);
						}
						for (int i_8_ = 0; i_8_ < class120_sub18.anInt2638; i_8_++) {
							final Class28 class28 = class120_sub18.aClass28Array2625[i_8_];
							if (class28 != null && class28.aClass180_174.method2268()) {
								Class120_Sub10.method1170(class28.aClass180_174, i_5_, i_6_, i_7_, class28.anInt182 - class28.anInt180 + 1, class28.anInt175 - class28.anInt184 + 1);
								class28.aClass180_174 = class28.aClass180_174.method2269(i, i_3_, i_4_);
							}
						}
						final Class36 class36 = class120_sub18.aClass36_2650;
						if (class36 != null && class36.aClass180_309.method2268()) {
							Class120_Sub18.method1668(class36.aClass180_309, i_5_, i_6_, i_7_);
							class36.aClass180_309 = class36.aClass180_309.method2269(i, i_3_, i_4_);
						}
					}
				}
			}
		}
	}

	static final boolean method315(final int i, final int i_9_) {
		boolean bool;
		try {
			if (i != 10) {
				method315(-33, -34);
			}
			if (Class120_Sub14_Sub10.aClass120_Sub14_Sub19_Sub2_3532 == null) {
				if (!HDToolkit.glEnabled && Class134.aClass120_Sub14_Sub19_1276 != null) {
					Class120_Sub14_Sub10.aClass120_Sub14_Sub19_Sub2_3532 = (LDSprite) Class134.aClass120_Sub14_Sub19_1276;
				} else {
					Class120_Sub14_Sub10.aClass120_Sub14_Sub19_Sub2_3532 = new LDSprite(512, 512);
				}
				final int[] is = Class120_Sub14_Sub10.aClass120_Sub14_Sub19_Sub2_3532.pixels;
				final int i_12_ = is.length;
				for (int i_13_ = 0; i_13_ < i_12_; i_13_++) {
					is[i_13_] = 1;
				}
				for (int i_14_ = 1; i_14_ < 103; i_14_++) {
					int i_15_ = (0 + -i_14_ + 103) * 512 * 4 + 24628;
					for (int i_16_ = 1; i_16_ < 103; i_16_++) {
						if ((0x18 & Class114.aByteArrayArrayArray1095[i_9_][i_16_][i_14_]) == 0) {
							Class120_Sub12_Sub6.method1229(is, i_15_, 512, i_9_, i_16_, i_14_);
						}
						if (i_9_ < 3 && (Class114.aByteArrayArrayArray1095[i_9_ + 1][i_16_][i_14_] & 0x8) != 0) {
							Class120_Sub12_Sub6.method1229(is, i_15_, 512, 1 + i_9_, i_16_, i_14_);
						}
						i_15_ += 4;
					}
				}
				Class120_Sub24.anInt2718 = 0;
				for (int i_17_ = 0; i_17_ < 104; i_17_++) {
					for (int i_18_ = 0; i_18_ < 104; i_18_++) {
						long l = Class79_Sub1.method696(i_9_, i_17_ + 0, 0 + i_18_);
						if (-1L == (l ^ 0xffffffffffffffffL)) {
							l = Class120_Sub11.method1173(i_9_, 0 + i_17_, i_18_ + 0);
						}
						if (0L == l) {
							l = Class114.method1005(i_9_, i_17_ + 0, 0 + i_18_);
						}
						if (0L == l) {
							l = Class189.method2502(i_9_, i_17_ - 0, i_18_ + 0);
						}
						if ((l ^ 0xffffffffffffffffL) != -1L) {
							final LocType locType = LocType.list(0x7fffffff & (int) (l >>> 32));
							if (!locType.aBoolean1851 || Class120_Sub12_Sub37.aBoolean3432) {
								int i_19_ = locType.anInt1840;
								if (locType.childrenIDs != null) {
									for (int i_20_ = 0; i_20_ < locType.childrenIDs.length; i_20_++) {
										if ((locType.childrenIDs[i_20_] ^ 0xffffffff) != 0) {
											final LocType class184_21_ = LocType.list(locType.childrenIDs[i_20_]);
											if (class184_21_.anInt1840 >= 0) {
												i_19_ = class184_21_.anInt1840;
											}
										}
									}
								}
								if (i_19_ >= 0) {
									boolean bool_22_ = false;
									final Class73 class73 = Class92.method769(true, i_19_);
									int i_23_ = 0 + i_17_;
									int i_24_ = i_18_ - 0;
									if (class73 != null && class73.aBoolean642) {
										bool_22_ = true;
									}
									if (bool_22_) {
										final int[][] is_25_ = Class182.aClass25Array1802[i_9_].anIntArrayArray152;
										for (int i_26_ = 0; i_26_ < 10; i_26_++) {
											final int i_27_ = (int) (Math.random() * 4.0);
											if (i_27_ == 0 && i_23_ > 0 && i_23_ > -3 + i_17_ && (is_25_[i_23_ + -1][i_24_] & 0x2c0108) == 0) {
												i_23_--;
											}
											if (i_27_ == 1 && i_23_ < 103 && i_23_ < i_17_ - -3 && (is_25_[1 + i_23_][i_24_] & 0x2c0180) == 0) {
												i_23_++;
											}
											if (i_27_ == 2 && i_24_ > 0 && i_18_ - 3 < i_24_ && (0x2c0102 & is_25_[i_23_][-1 + i_24_]) == 0) {
												i_24_--;
											}
											if (i_27_ == 3 && i_24_ < 103 && 3 + i_18_ > i_24_ && (is_25_[i_23_][1 + i_24_] & 0x2c0120) == 0) {
												i_24_++;
											}
										}
									}
									Class7.anIntArray62[Class120_Sub24.anInt2718] = locType.myId;
									Class73.anIntArray661[Class120_Sub24.anInt2718] = i_23_ + 0;
									Class69_Sub2.anIntArray2235[Class120_Sub24.anInt2718] = 0 + i_24_;
									Class120_Sub24.anInt2718++;
								}
							}
						}
					}
				}
			}
			Class120_Sub14_Sub10.aClass120_Sub14_Sub19_Sub2_3532.method1617();
			final int i_28_ = -10 - (-238 + -(int) (20.0 * Math.random())) + (228 + (int) (20.0 * Math.random()) << 8) + (-10 + (int) (20.0 * Math.random()) + 238 << 16);
			final int i_29_ = -10 + (int) (Math.random() * 20.0) + 238 << 16;
			for (int i_30_ = 1; i_30_ < 103; i_30_++) {
				for (int i_31_ = 1; i_31_ < 103; i_31_++) {
					if ((Class114.aByteArrayArrayArray1095[i_9_][i_31_ - 0][0 + i_30_] & 0x18) == 0 && !Class190.method2504(i_28_, i_9_, 0, 0, i_29_, true, i_30_, i_31_)) {
						if (HDToolkit.glEnabled) {
							GraphicsLD.pixels = null;
						} else {
							Class120_Sub13.fullscreenGraphics.init2dCanvas();
						}
						return false;
					}
					if (i_9_ < 3 && (Class114.aByteArrayArrayArray1095[i_9_ - -1][i_31_ + 0][0 + i_30_] & 0x8) != 0 && !Class190.method2504(i_28_, 1 + i_9_, 0, 0, i_29_, true, i_30_, i_31_)) {
						if (HDToolkit.glEnabled) {
							GraphicsLD.pixels = null;
						} else {
							Class120_Sub13.fullscreenGraphics.init2dCanvas();
						}
						return false;
					}
				}
			}
			if (HDToolkit.glEnabled) {
				final int[] is = Class120_Sub14_Sub10.aClass120_Sub14_Sub19_Sub2_3532.pixels;
				final int i_32_ = is.length;
				for (int i_33_ = 0; i_33_ < i_32_; i_33_++) {
					if (is[i_33_] == 0) {
						is[i_33_] = 1;
					}
				}
				Class134.aClass120_Sub14_Sub19_1276 = new HDSprite(Class120_Sub14_Sub10.aClass120_Sub14_Sub19_Sub2_3532);
			} else {
				Class134.aClass120_Sub14_Sub19_1276 = Class120_Sub14_Sub10.aClass120_Sub14_Sub19_Sub2_3532;
			}
			if (HDToolkit.glEnabled) {
				GraphicsLD.pixels = null;
			} else {
				Class120_Sub13.fullscreenGraphics.init2dCanvas();
			}
			Class120_Sub14_Sub10.aClass120_Sub14_Sub19_Sub2_3532 = null;
			bool = true;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ee.A(").append(i).append(',').append(i_9_).append(')').toString());
		}
		return bool;
	}

	static final void method316(final int i) {
		try {
			if (i != 2883872) {
				method312(-20);
			}
			Class180_Sub4.aClass21_2931.method186((byte) 86);
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ee.C(").append(i).append(')').toString());
		}
	}

	static final void method317(final int i, final int i_34_, final int i_35_, final int i_36_, final int i_37_, final int i_38_, final byte i_39_, final int i_40_, final int i_41_, final int i_42_) {
		try {
			Class120_Sub24 class120_sub24 = null;
			for (Class120_Sub24 class120_sub24_43_ = (Class120_Sub24) Class120_Sub4.aClass105_2439.getFront(); class120_sub24_43_ != null; class120_sub24_43_ = (Class120_Sub24) Class120_Sub4.aClass105_2439.getNext()) {
				if (i_34_ == class120_sub24_43_.anInt2722 && i_36_ == class120_sub24_43_.anInt2731 && class120_sub24_43_.anInt2725 == i_38_ && i_41_ == class120_sub24_43_.anInt2721) {
					class120_sub24 = class120_sub24_43_;
					break;
				}
			}
			if (class120_sub24 == null) {
				class120_sub24 = new Class120_Sub24();
				class120_sub24.anInt2725 = i_38_;
				class120_sub24.anInt2722 = i_34_;
				class120_sub24.anInt2721 = i_41_;
				class120_sub24.anInt2731 = i_36_;
				Class53.method457(class120_sub24, (byte) -112);
				Class120_Sub4.aClass105_2439.addLast(class120_sub24);
			}
			class120_sub24.anInt2732 = i_42_;
			class120_sub24.anInt2719 = i;
			class120_sub24.anInt2720 = i_37_;
			class120_sub24.anInt2717 = i_35_;
			class120_sub24.anInt2727 = i_40_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ee.E(").append(i).append(',').append(i_34_).append(',').append(i_35_).append(',').append(i_36_).append(',').append(i_37_).append(',').append(i_38_).append(',').append(i_39_).append(',').append(i_40_).append(',')
					.append(i_41_).append(',').append(i_42_).append(')').toString());
		}
	}
}
