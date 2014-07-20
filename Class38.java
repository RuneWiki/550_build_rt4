/* Class38 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class38 {
	static FileSystemWorker fileSystemWorker;
	static boolean cursorsEnabled = true;

	public static void method312() {
		fileSystemWorker = null;
	}

	static final void method313(final int i_0_, final int i_1_, final int i_2_) {
		if (i_1_ != 1012) {
			if (i_1_ != 1002) {
				if (i_1_ == 1008) {
					Class112.method989(12, i_0_, i_2_);
				} else if (i_1_ != 1003) {
					if (i_1_ == 1011) {
						Class112.method989(14, i_0_, i_2_);
					}
				} else {
					Class112.method989(13, i_0_, i_2_);
				}
			} else {
				Class112.method989(11, i_0_, i_2_);
			}
		} else {
			Class112.method989(10, i_0_, i_2_);
		}
	}

	static final void method314(final int i, final int i_3_, final int i_4_) {
		for (int i_5_ = 0; i_5_ < Class142.anInt1361; i_5_++) {
			for (int i_6_ = 0; i_6_ < Class186.anInt1900; i_6_++) {
				for (int i_7_ = 0; i_7_ < Class120_Sub12_Sub38.anInt3440; i_7_++) {
					final GroundTile class120_sub18 = LabelGroup.groundTiles[i_5_][i_6_][i_7_];
					if (class120_sub18 != null) {
						final Class182 class182 = class120_sub18.aClass182_2628;
						if (class182 != null && class182.aClass180_1800.method2268()) {
							InterfaceListener.method1170(class182.aClass180_1800, i_5_, i_6_, i_7_, 1, 1);
							if (class182.aClass180_1796 != null && class182.aClass180_1796.method2268()) {
								InterfaceListener.method1170(class182.aClass180_1796, i_5_, i_6_, i_7_, 1, 1);
								class182.aClass180_1800.method2267(class182.aClass180_1796, 0, 0, 0, false);
								class182.aClass180_1796 = class182.aClass180_1796.method2269(i, i_3_, i_4_);
							}
							class182.aClass180_1800 = class182.aClass180_1800.method2269(i, i_3_, i_4_);
						}
						for (int i_8_ = 0; i_8_ < class120_sub18.anInt2638; i_8_++) {
							final Class28 class28 = class120_sub18.aClass28Array2625[i_8_];
							if (class28 != null && class28.aClass180_174.method2268()) {
								InterfaceListener.method1170(class28.aClass180_174, i_5_, i_6_, i_7_, class28.anInt182 - class28.anInt180 + 1, class28.anInt175 - class28.anInt184 + 1);
								class28.aClass180_174 = class28.aClass180_174.method2269(i, i_3_, i_4_);
							}
						}
						final Class36 class36 = class120_sub18.aClass36_2650;
						if (class36 != null && class36.aClass180_309.method2268()) {
							GroundTile.method1668(class36.aClass180_309, i_5_, i_6_, i_7_);
							class36.aClass180_309 = class36.aClass180_309.method2269(i, i_3_, i_4_);
						}
					}
				}
			}
		}
	}

	static final boolean method315(final int level) {
		if (Class120_Sub14_Sub10.landScapeAsSprite == null) {
			if (!HDToolkit.glEnabled && Class134.aClass120_Sub14_Sub19_1276 != null) {
				Class120_Sub14_Sub10.landScapeAsSprite = (LDSprite) Class134.aClass120_Sub14_Sub19_1276;
			} else {
				Class120_Sub14_Sub10.landScapeAsSprite = new LDSprite(512, 512);
			}
			final int[] is = Class120_Sub14_Sub10.landScapeAsSprite.pixels;
			final int i_12_ = is.length;
			for (int i_13_ = 0; i_13_ < i_12_; i_13_++) {
				is[i_13_] = 1;
			}
			for (int i_14_ = 1; i_14_ < 103; i_14_++) {
				int i_15_ = (103 - i_14_) * 512 * 4 + 24628;
				for (int i_16_ = 1; i_16_ < 103; i_16_++) {
					if ((0x18 & Class114.tileSettings[level][i_16_][i_14_]) == 0) {
						Class120_Sub12_Sub6.method1229(is, i_15_, 512, level, i_16_, i_14_);
					}
					if (level < 3 && (Class114.tileSettings[level + 1][i_16_][i_14_] & 0x8) != 0) {
						Class120_Sub12_Sub6.method1229(is, i_15_, 512, 1 + level, i_16_, i_14_);
					}
					i_15_ += 4;
				}
			}
			Class120_Sub24.anInt2718 = 0;
			for (int i_17_ = 0; i_17_ < 104; i_17_++) {
				for (int i_18_ = 0; i_18_ < 104; i_18_++) {
					long bitPacked = Class79_Sub1.method696(level, i_17_ + 0, 0 + i_18_);
					if (bitPacked == 0L) {
						bitPacked = Class120_Sub11.method1173(level, 0 + i_17_, i_18_ + 0);
					}
					if (bitPacked == 0L) {
						bitPacked = Class114.method1005(level, i_17_ + 0, 0 + i_18_);
					}
					if (bitPacked == 0L) {
						bitPacked = JagexInterface.method2502(level, i_17_ - 0, i_18_ + 0);
					}
					if (bitPacked != 0L) {
						final LocType locType = LocType.list(0x7fffffff & (int) (bitPacked >>> 32));
						if (!locType.members || Class120_Sub12_Sub37.membersClient) {
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
								final Class73 class73 = Class73.list(i_19_);
								int i_23_ = 0 + i_17_;
								int i_24_ = i_18_ - 0;
								if (class73 != null && class73.randomizePosition) {
									bool_22_ = true;
								}
								if (bool_22_) {
									final int[][] is_25_ = Class182.collisionMaps[level].collisionFlags;
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
		Class120_Sub14_Sub10.landScapeAsSprite.method1617();
		final int whiteColor = 0xffffff;//-10 - (-238 + -(int) (20.0 * Math.random())) + (228 + (int) (20.0 * Math.random()) << 8) + (-10 + (int) (20.0 * Math.random()) + 238 << 16);
		final int redColor = 0xff0000;//-10 + (int) (Math.random() * 20.0) + 238 << 16;
		for (int i_30_ = 1; i_30_ < 103; i_30_++) {
			for (int i_31_ = 1; i_31_ < 103; i_31_++) {
				if ((Class114.tileSettings[level][i_31_ - 0][0 + i_30_] & 0x18) == 0 && !Class190.method2504(whiteColor, level, 0, 0, redColor, i_30_, i_31_)) {
					if (HDToolkit.glEnabled) {
						GraphicsLD.pixels = null;
					} else {
						ClanMember.fullscreenGraphics.init2dCanvas();
					}
					return false;
				}
				if (level < 3 && (Class114.tileSettings[level - -1][i_31_ + 0][0 + i_30_] & 0x8) != 0 && !Class190.method2504(whiteColor, 1 + level, 0, 0, redColor, i_30_, i_31_)) {
					if (HDToolkit.glEnabled) {
						GraphicsLD.pixels = null;
					} else {
						ClanMember.fullscreenGraphics.init2dCanvas();
					}
					return false;
				}
			}
		}
		if (HDToolkit.glEnabled) {
			final int[] is = Class120_Sub14_Sub10.landScapeAsSprite.pixels;
			final int i_32_ = is.length;
			for (int i_33_ = 0; i_33_ < i_32_; i_33_++) {
				if (is[i_33_] == 0) {
					is[i_33_] = 1;
				}
			}
			Class134.aClass120_Sub14_Sub19_1276 = new HDSprite(Class120_Sub14_Sub10.landScapeAsSprite);
		} else {
			Class134.aClass120_Sub14_Sub19_1276 = Class120_Sub14_Sub10.landScapeAsSprite;
		}
		if (HDToolkit.glEnabled) {
			GraphicsLD.pixels = null;
		} else {
			ClanMember.fullscreenGraphics.init2dCanvas();
		}
		Class120_Sub14_Sub10.landScapeAsSprite = null;
		return true;
	}

	static final void method316(final int i) {
		try {
			if (i != 2883872) {
				method312();
			}
			Projectile.aClass21_2931.clear();
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("ee.C(").append(i).append(')').toString());
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
			throw EnumType.method1428(runtimeexception, new StringBuilder("ee.E(").append(i).append(',').append(i_34_).append(',').append(i_35_).append(',').append(i_36_).append(',').append(i_37_).append(',').append(i_38_).append(',').append(i_39_).append(',').append(i_40_).append(',')
					.append(i_41_).append(',').append(i_42_).append(')').toString());
		}
	}
}
