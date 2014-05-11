/* Class142 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class142 {
	static String aString1358 = "Loaded textures";
	boolean aBoolean1359 = false;
	int anInt1360;
	static int anInt1361;
	static Class189 aClass189_1362;
	int anInt1363;

	static final void method2004(final int i, int i_0_, final int i_1_) {
		try {
			final Class27 class27 = Class43.method339(i_1_, -9609);
			final int i_2_ = class27.anInt164;
			final int i_3_ = class27.anInt168;
			final int i_4_ = class27.anInt169;
			if (i != 1006) {
				method2007(false, 6, false, -60, null, 13, -119, (byte) 48, 12L, false, null);
			}
			int i_5_ = Class120_Sub14_Sub15.anIntArray3580[i_4_ - i_3_];
			if (i_0_ < 0 || i_0_ > i_5_) {
				i_0_ = 0;
			}
			i_5_ <<= i_3_;
			Class120_Sub14_Sub14_Sub1.method1544(i_2_, (byte) -68, i_0_ << i_3_ & i_5_ | (i_5_ ^ 0xffffffff) & Class30.anIntArray239[i_2_]);
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("qg.B(").append(i).append(',').append(i_0_).append(',').append(i_1_).append(')').toString());
		}
	}

	static final void method2005(final int i) {
		do {
			try {
				try {
					if (Class120_Sub12_Sub25.anInt3312 == 1) {
						int i_6_ = Class30.aClass120_Sub30_Sub2_234.method1757(false);
						if (i_6_ > 0 && Class30.aClass120_Sub30_Sub2_234.method1766((byte) 70)) {
							i_6_ -= Class69.anInt614;
							if (i_6_ < 0) {
								i_6_ = 0;
							}
							Class30.aClass120_Sub30_Sub2_234.method1748(128, i_6_);
						} else {
							Class30.aClass120_Sub30_Sub2_234.method1770(21229);
							Class30.aClass120_Sub30_Sub2_234.method1753((byte) 99);
							if (Class52.aClass50_476 != null) {
								Class120_Sub12_Sub25.anInt3312 = 2;
							} else {
								Class120_Sub12_Sub25.anInt3312 = 0;
							}
							Class120_Sub14_Sub14_Sub2.aClass120_Sub31_3941 = null;
							Class26.aClass90_163 = null;
						}
					}
				} catch (final Exception exception) {
					exception.printStackTrace();
					Class30.aClass120_Sub30_Sub2_234.method1770(21229);
					Class120_Sub14_Sub14_Sub2.aClass120_Sub31_3941 = null;
					Class52.aClass50_476 = null;
					Class26.aClass90_163 = null;
					Class120_Sub12_Sub25.anInt3312 = 0;
					break;
				}
				break;
			} catch (final RuntimeException runtimeexception) {
				throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("qg.I(").append(i).append(')').toString());
			}
		} while (false);
	}

	private final void method2006(final int i, final Buffer class120_sub7, final int i_7_, final int i_8_) {
		do {
			try {
				if (i_8_ == 1) {
					this.anInt1363 = class120_sub7.getUShort();
				} else if (i_8_ == 2) {
					this.anInt1360 = class120_sub7.getTriByte();
				} else if (i_8_ == 3) {
					this.aBoolean1359 = true;
				} else if (i_8_ == 4) {
					this.anInt1363 = -1;
				}
				if (i > -115) {
					break;
				}
			} catch (final RuntimeException runtimeexception) {
				throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("qg.D(").append(i).append(',').append(class120_sub7 != null ? "{...}" : "null").append(',').append(i_7_).append(',').append(i_8_).append(')').toString());
			}
		} while (false);
	}

	static final void method2007(final boolean bool, final int i, final boolean bool_9_, final int i_10_, final String string, final int i_11_, final int i_12_, final byte i_13_, final long l, final boolean bool_14_, final String string_15_) {
		try {
			if (i_13_ > 115) {
				final int[] is = new int[4];
				for (int i_16_ = 0; i_16_ < 3; i_16_++) {
					is[i_16_] = (int) (Math.random() * 9.9999999E7);
				}
				final Buffer class120_sub7 = new Buffer(128);
				class120_sub7.putByte(10);
				class120_sub7.putShort((bool_9_ ? 1 : 0) | (bool_14_ ? 2 : 0) | (bool ? 4 : 0));
				class120_sub7.putLong(l);
				class120_sub7.putInt(is[0]);
				class120_sub7.putJString(string_15_);
				class120_sub7.putInt(is[1]);
				class120_sub7.putShort(Class120_Sub12_Sub33.affiliateId);
				class120_sub7.putByte(i);
				class120_sub7.putByte(i_11_);
				class120_sub7.putInt(is[2]);
				class120_sub7.putShort(i_12_);
				class120_sub7.putShort(i_10_);
				class120_sub7.putInt(is[3]);
				class120_sub7.encryptRsa(Class46.aBigInteger415, KeyboardHandler.aBigInteger1505);
				final Buffer class120_sub7_17_ = new Buffer(350);
				class120_sub7_17_.putJString(string);
				final int i_18_ = 8 + -(Class69_Sub2_Sub1.method620(string) % 8);
				for (int i_19_ = 0; i_18_ > i_19_; i_19_++) {
					class120_sub7_17_.putByte((int) (Math.random() * 255.0));
				}
				class120_sub7_17_.method1129(false, is);
				Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.pos = 0;
				Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putByte(22);
				Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putShort(class120_sub7_17_.pos + class120_sub7.pos + 2);
				Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putShort(550);
				Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putBuffer(class120_sub7.buf, 0, class120_sub7.pos);
				Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putBuffer(class120_sub7_17_.buf, 0, class120_sub7_17_.pos);
				Class120_Sub12_Sub35.anInt3410 = -3;
				Class120_Sub14_Sub4.anInt3466 = 0;
				Class107.anInt1027 = 0;
				Class154.anInt1440 = 1;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("qg.A(").append(bool).append(',').append(i).append(',').append(bool_9_).append(',').append(i_10_).append(',').append(string != null ? "{...}" : "null").append(',').append(i_11_).append(',').append(i_12_)
					.append(',').append(i_13_).append(',').append(l).append(',').append(bool_14_).append(',').append(string_15_ != null ? "{...}" : "null").append(')').toString());
		}
	}

	static final void method2008(final int i, final int i_20_, final byte i_21_, final int i_22_, final Class189[] class189s, final int i_23_, final int i_24_, final int i_25_, final int i_26_, final int i_27_) {
		try {
			if (!HDToolkit.glEnabled) {
				GraphicsLD.method2155(i_27_, i_25_, i_24_, i_23_);
				Rasterizer.method874();
			} else {
				GraphicsHD.method592(i_27_, i_25_, i_24_, i_23_);
			}
			int i_28_ = 0;
			if (i_21_ < -100) {
				for (/**/; i_28_ < class189s.length; i_28_++) {
					final Class189 class189 = class189s[i_28_];
					if (class189 != null && (i_20_ == class189.anInt2029 || (i_20_ ^ 0xffffffff) == 1412584498 && class189 == Class120_Sub12_Sub4.aClass189_3156)) {
						int i_29_;
						if ((i_22_ ^ 0xffffffff) == 0) {
							Class160.anIntArray1495[Class120_Sub1.anInt2414] = class189.anInt2073 + i;
							Class120_Sub12_Sub38.anIntArray3441[Class120_Sub1.anInt2414] = i_26_ + class189.anInt1938;
							Class120_Sub16.anIntArray2608[Class120_Sub1.anInt2414] = class189.anInt1948;
							Class69_Sub3_Sub1.anIntArray3081[Class120_Sub1.anInt2414] = class189.anInt2059;
							i_29_ = Class120_Sub1.anInt2414++;
						} else {
							i_29_ = i_22_;
						}
						class189.anInt1968 = Class101_Sub2.loopCycle;
						class189.anInt2082 = i_29_;
						if (!class189.aBoolean2041 || !client.method59(class189)) {
							if (class189.anInt1975 > 0) {
								Class143_Sub1.method2032(class189, 27);
							}
							int i_30_ = class189.anInt1974;
							int i_31_ = class189.anInt1938 + i_26_;
							int i_32_ = class189.anInt2073 - -i;
							if (Class120_Sub30_Sub1.aBoolean3673 && (client.method54(class189).anInt2662 != 0 || class189.anInt1995 == 0) && i_30_ > 127) {
								i_30_ = 127;
							}
							if (class189 == Class120_Sub12_Sub4.aClass189_3156) {
								if (-1412584499 != i_20_ && !class189.aBoolean1939) {
									Class120_Sub12_Sub38.anInt3438 = i;
									Class111.anInt1065 = i_26_;
									Class107.aClass189Array1022 = class189s;
									continue;
								}
								if (!class189.aBoolean1939) {
									i_30_ = 128;
								}
								if (Class120_Sub11.aBoolean2551 && Class111.aBoolean1058) {
									int i_33_ = Class191.anInt2113;
									int i_34_ = Queue.anInt1767;
									i_33_ -= client.anInt2203;
									i_34_ -= AbstractGraphicsBuffer.anInt1173;
									if (Class120_Sub12_Sub35.anInt3413 > i_33_) {
										i_33_ = Class120_Sub12_Sub35.anInt3413;
									}
									if (i_34_ < Class120_Sub12_Sub7.anInt3183) {
										i_34_ = Class120_Sub12_Sub7.anInt3183;
									}
									if (i_33_ + class189.anInt2059 > Class120_Sub12_Sub35.anInt3413 - -Class26.aClass189_161.anInt2059) {
										i_33_ = Class120_Sub12_Sub35.anInt3413 - (-Class26.aClass189_161.anInt2059 - -class189.anInt2059);
									}
									if (Class26.aClass189_161.anInt1948 + Class120_Sub12_Sub7.anInt3183 < i_34_ + class189.anInt1948) {
										i_34_ = -class189.anInt1948 + Class26.aClass189_161.anInt1948 + Class120_Sub12_Sub7.anInt3183;
									}
									i_32_ = i_34_;
									i_31_ = i_33_;
								}
							}
							int i_35_;
							int i_36_;
							int i_37_;
							int i_38_;
							if (class189.anInt1995 != 2) {
								i_35_ = i_25_ < i_31_ ? i_31_ : i_25_;
								i_37_ = i_32_ <= i_27_ ? i_27_ : i_32_;
								int i_39_ = i_32_ - -class189.anInt1948;
								int i_40_ = i_31_ - -class189.anInt2059;
								if (class189.anInt1995 == 9) {
									i_39_++;
									i_40_++;
								}
								i_38_ = i_40_ >= i_23_ ? i_23_ : i_40_;
								i_36_ = i_39_ >= i_24_ ? i_24_ : i_39_;
							} else {
								i_35_ = i_25_;
								i_36_ = i_24_;
								i_37_ = i_27_;
								i_38_ = i_23_;
							}
							if (!class189.aBoolean2041 || i_37_ < i_36_ && i_38_ > i_35_) {
								if (class189.anInt1975 != 0) {
									if (class189.anInt1975 == 1337 || class189.anInt1975 == 1403) {
										Class56.anInt497 = i_32_;
										InputStream_Sub1.aClass189_26 = class189;
										Class120_Sub14_Sub16.anInt3590 = i_31_;
										StringNode.method1721(0, i_32_, class189.anInt2059, class189.anInt1975 == 1403, class189.anInt1948, i_31_);
										Class52.aBooleanArray467[i_29_] = true;
										if (HDToolkit.glEnabled) {
											GraphicsHD.method592(i_27_, i_25_, i_24_, i_23_);
										} else {
											GraphicsLD.method2155(i_27_, i_25_, i_24_, i_23_);
										}
										continue;
									}
									if (class189.anInt1975 == 1338) {
										if (class189.method2501(-1)) {
											Class164.method2145(i_32_, i_29_, class189, i_31_, 0);
											if (!HDToolkit.glEnabled) {
												GraphicsLD.method2155(i_27_, i_25_, i_24_, i_23_);
											} else {
												GraphicsHD.method592(i_27_, i_25_, i_24_, i_23_);
											}
											if ((AbstractGraphicsBuffer.anInt1175 == 0 || AbstractGraphicsBuffer.anInt1175 == 3) && !Class15.menuOpen && Class115.anInt1110 >= i_37_ && i_35_ <= Class120_Sub12_Sub21.anInt3298 && i_36_ > Class115.anInt1110 && Class120_Sub12_Sub21.anInt3298 < i_38_) {
												int i_41_ = Class115.anInt1110 + -i_32_;
												int i_42_ = -i_31_ + Class120_Sub12_Sub21.anInt3298;
												final int i_43_ = class189.anIntArray2079[i_42_];
												if (i_43_ <= i_41_ && i_41_ <= class189.anIntArray1949[i_42_] + i_43_) {
													i_42_ -= class189.anInt2059 / 2;
													final int i_44_ = Class164.anInt1590 + (int) OutputStream_Sub1.aFloat28 & 0x7ff;
													int i_45_ = Rasterizer.sineTable[i_44_];
													i_41_ -= class189.anInt1948 / 2;
													i_45_ = i_45_ * (256 + Class154.anInt1442) >> 8;
													int i_46_ = Rasterizer.cosineTable[i_44_];
													i_46_ = (Class154.anInt1442 - -256) * i_46_ >> 8;
													final int i_47_ = i_45_ * i_42_ - -(i_41_ * i_46_) >> 11;
													final int i_48_ = -(i_45_ * i_41_) + i_46_ * i_42_ >> 11;
													final int i_49_ = Class100.selfPlayer.x - -i_47_ - -64 - 64 * Class100.selfPlayer.getSize() >> 7;
													final int i_50_ = Class100.selfPlayer.z - (i_48_ - -(64 * Class100.selfPlayer.getSize())) - -64 >> 7;
													if (Class88.aBoolean828 && (0x40 & Class120_Sub18.anInt2652) != 0) {
														final Class189 class189_51_ = Class120_Sub13.method1404(AbstractMouseWheelHandler.anInt119, (byte) 82, Class46.anInt420);
														if (class189_51_ != null) {
															Class120_Sub14_Sub6.addMenuOption(1L, i_49_, i_50_, " ->", Class101.aString963, (short) 19, Class150.anInt1417);
														} else {
															Node.method1029((byte) 126);
														}
													} else {
														if (Buffer.gameId == 1) {
															Class120_Sub14_Sub6.addMenuOption(1L, i_49_, i_50_, "", Class82.aString787, (short) 47, -1);
														}
														Class120_Sub14_Sub6.addMenuOption(1L, i_49_, i_50_, "", Npc.aString3752, (short) 26, -1);
													}
												}
											}
										}
										continue;
									}
									if (class189.anInt1975 == 1339) {
										if (class189.method2501(-1)) {
											Class172.method2224(class189, (byte) 12, i_31_, i_29_, i_32_);
											if (HDToolkit.glEnabled) {
												GraphicsHD.method592(i_27_, i_25_, i_24_, i_23_);
											} else {
												GraphicsLD.method2155(i_27_, i_25_, i_24_, i_23_);
											}
										}
										continue;
									}
									if (class189.anInt1975 == 1400) {
										Class82.method711(class189.anInt2059, (byte) -114, i_31_, i_32_, class189.anInt1948);
										Class52.aBooleanArray467[i_29_] = true;
										Class120_Sub12_Sub33.aBooleanArray3391[i_29_] = true;
										if (!HDToolkit.glEnabled) {
											GraphicsLD.method2155(i_27_, i_25_, i_24_, i_23_);
										} else {
											GraphicsHD.method592(i_27_, i_25_, i_24_, i_23_);
										}
										continue;
									}
									if (class189.anInt1975 == 1401) {
										Class186.method2473(class189.anInt2059, -18418, class189.anInt1948, i_32_, i_31_);
										Class52.aBooleanArray467[i_29_] = true;
										Class120_Sub12_Sub33.aBooleanArray3391[i_29_] = true;
										if (!HDToolkit.glEnabled) {
											GraphicsLD.method2155(i_27_, i_25_, i_24_, i_23_);
										} else {
											GraphicsHD.method592(i_27_, i_25_, i_24_, i_23_);
										}
										continue;
									}
									if (class189.anInt1975 == 1402) {
										if (!HDToolkit.glEnabled) {
											Class80.method699(-1, i_31_, i_32_);
											Class52.aBooleanArray467[i_29_] = true;
											Class120_Sub12_Sub33.aBooleanArray3391[i_29_] = true;
										}
										continue;
									}
									if (class189.anInt1975 == 1405) {
										if (Class85.showFps) {
											final int i_52_ = i_32_ - -class189.anInt1948;
											int i_53_ = i_31_ - -15;
											Class120_Sub12_Sub20.aClass120_Sub14_Sub8_3286.method1482(new StringBuilder("Fps:").append(Class73.fps).toString(), i_52_, i_53_, 16776960, -1);
											final Runtime runtime = Runtime.getRuntime();
											i_53_ += 15;
											final int i_54_ = (int) ((runtime.totalMemory() - runtime.freeMemory()) / 1024L);
											int i_55_ = 16776960;
											if (65536 < i_54_) {
												i_55_ = 16711680;
											}
											Class120_Sub12_Sub20.aClass120_Sub14_Sub8_3286.method1482(new StringBuilder("Mem:").append(i_54_).append("k").toString(), i_52_, i_53_, i_55_, -1);
											i_53_ += 15;
											if (HDToolkit.glEnabled) {
												i_55_ = 16776960;
												final int i_56_ = (Class113.anInt1081 + Class113.anInt1082 + Class113.anInt1086) / 1024;
												if (i_56_ > 65536) {
													i_55_ = 16711680;
												}
												Class120_Sub12_Sub20.aClass120_Sub14_Sub8_3286.method1482(new StringBuilder("Card:").append(i_56_).append("k").toString(), i_52_, i_53_, i_55_, -1);
												i_53_ += 15;
											}
											i_55_ = 16776960;
											int i_57_ = 0;
											int i_58_ = 0;
											int i_59_ = 0;
											for (int i_60_ = 0; i_60_ < 29; i_60_++) {
												i_59_ += Class120_Sub12_Sub26.aClass53_Sub1Array3337[i_60_].method474(0);
												i_57_ += Class120_Sub12_Sub26.aClass53_Sub1Array3337[i_60_].method470(true);
												i_58_ += Class120_Sub12_Sub26.aClass53_Sub1Array3337[i_60_].method463(1);
											}
											final int i_61_ = i_58_ * 100 / i_59_;
											final int i_62_ = i_57_ * 10000 / i_59_;
											final String string = new StringBuilder("Cache:").append(Class120_Sub12_Sub37.method1395(i_62_, true, -116, 2, 0)).append("% (").append(i_61_).append("%)").toString();
											Class21.aClass120_Sub14_Sub8_121.method1482(string, i_52_, i_53_, i_55_, -1);
											i_53_ += 12;
											if (ParticleEngine.anInt2360 > 0) {
												Class21.aClass120_Sub14_Sub8_121.method1482(new StringBuilder("Particles: ").append(ParticleEngine.runningParticleCount).append(" / ").append(ParticleEngine.anInt2360).toString(), i_52_, i_53_, i_55_, -1);
											}
											i_53_ += 12;
											Class52.aBooleanArray467[i_29_] = true;
											Class120_Sub12_Sub33.aBooleanArray3391[i_29_] = true;
										}
										continue;
									}
									if (class189.anInt1975 == 1406) {
										Class9.anInt68 = i_32_;
										Class90.anInt847 = i_31_;
										Class69_Sub3_Sub1.aClass189_3080 = class189;
										continue;
									}
								}
								if (!Class15.menuOpen) {
									if (class189.anInt1995 == 0 && class189.aBoolean1960 && i_37_ <= Class115.anInt1110 && Class120_Sub12_Sub21.anInt3298 >= i_35_ && Class115.anInt1110 < i_36_ && i_38_ > Class120_Sub12_Sub21.anInt3298 && !Class120_Sub30_Sub1.aBoolean3673) {
										Class120_Sub29.aShortArray2777[0] = (short) 1006;
										Class120_Sub12_Sub33.aStringArray3394[0] = Class157.aString1462;
										Class120_Sub12_Sub29.aStringArray3369[0] = "";
										InterfaceChangeNode.menuOptionsCursorId[0] = Class192.anInt2123;
										Class186.anInt1906 = 1;
									}
									if (Class115.anInt1110 >= i_37_ && i_35_ <= Class120_Sub12_Sub21.anInt3298 && Class115.anInt1110 < i_36_ && i_38_ > Class120_Sub12_Sub21.anInt3298) {
										Class120_Sub12_Sub9.method1244(class189, 88, -i_31_ + Class120_Sub12_Sub21.anInt3298, Class115.anInt1110 - i_32_);
									}
								}
								if (class189.anInt1995 == 0) {
									if (!class189.aBoolean2041 && client.method59(class189) && class189 != CursorType.aClass189_1243) {
										continue;
									}
									if (!class189.aBoolean2041) {
										if (-class189.anInt2059 + class189.anInt1937 < class189.anInt2021) {
											class189.anInt2021 = -class189.anInt2059 + class189.anInt1937;
										}
										if (class189.anInt2021 < 0) {
											class189.anInt2021 = 0;
										}
									}
									if (HDToolkit.glEnabled && class189.anInt1975 == 1407) {
										Class34.method283(i_32_, i_31_, class189.anInt1948, class189.anInt2059);
									}
									method2008(i_32_ + -class189.anInt2023, class189.anInt1999, (byte) -105, i_29_, class189s, i_38_, i_36_, i_35_, -class189.anInt2021 + i_31_, i_37_);
									if (class189.aClass189Array2072 != null) {
										method2008(-class189.anInt2023 + i_32_, class189.anInt1999, (byte) -108, i_29_, class189.aClass189Array2072, i_38_, i_36_, i_35_, -class189.anInt2021 + i_31_, i_37_);
									}
									final Class120_Sub26 class120_sub26 = (Class120_Sub26) Class120_Sub12_Sub13.aClass75_3234.method659(class189.anInt1999, -121);
									if (class120_sub26 != null) {
										if (class120_sub26.anInt2744 == 0 && !Class15.menuOpen && Class115.anInt1110 >= i_37_ && Class120_Sub12_Sub21.anInt3298 >= i_35_ && i_36_ > Class115.anInt1110 && Class120_Sub12_Sub21.anInt3298 < i_38_ && !Class120_Sub30_Sub1.aBoolean3673) {
											Class120_Sub29.aShortArray2777[0] = (short) 1006;
											InterfaceChangeNode.menuOptionsCursorId[0] = Class192.anInt2123;
											Class120_Sub12_Sub33.aStringArray3394[0] = Class157.aString1462;
											Class120_Sub12_Sub29.aStringArray3369[0] = "";
											Class186.anInt1906 = 1;
										}
										Class43.method343(class120_sub26.anInt2745, i_35_, i_31_, (byte) -81, i_32_, i_38_, i_37_, i_36_, i_29_);
									}
									if (HDToolkit.glEnabled && class189.anInt1975 == 1407) {
										Class34.method289();
										Class167.aBoolean1620 = true;
									}
									if (HDToolkit.glEnabled) {
										GraphicsHD.method592(i_27_, i_25_, i_24_, i_23_);
									} else {
										GraphicsLD.method2155(i_27_, i_25_, i_24_, i_23_);
										Rasterizer.method874();
									}
								}
								if (Class9.aBooleanArray74[i_29_] || Class15.anInt96 > 1) {
									if (class189.anInt1995 == 0 && !class189.aBoolean2041 && class189.anInt2059 < class189.anInt1937) {
										PlayerAppearance.method2039(class189.anInt2059, (byte) 80, class189.anInt1948 + i_32_, class189.anInt1937, i_31_, class189.anInt2021);
									}
									if (class189.anInt1995 != 1) {
										if (class189.anInt1995 == 2) {
											int i_63_ = 0;
											for (int i_64_ = 0; class189.anInt2060 > i_64_; i_64_++) {
												for (int i_65_ = 0; class189.anInt2014 > i_65_; i_65_++) {
													int i_66_ = i_31_ + (32 + class189.anInt2077) * i_64_;
													int i_67_ = i_32_ + i_65_ * (32 - -class189.anInt2044);
													if (i_63_ < 20) {
														i_66_ += class189.anIntArray1986[i_63_];
														i_67_ += class189.anIntArray1988[i_63_];
													}
													if (class189.anIntArray1978[i_63_] > 0) {
														final int i_68_ = class189.anIntArray1978[i_63_] - 1;
														if (i_67_ - -32 > i_27_ && i_67_ < i_24_ && i_25_ < 32 + i_66_ && i_66_ < i_23_ || class189 == Class180_Sub4.aClass189_2954 && Class5.anInt2154 == i_63_) {
															AbstractSprite class120_sub14_sub19;
															if (Light.anInt393 != 1 || i_63_ != Class108_Sub1.anInt2319 || class189.anInt1999 != Class141.anInt1355) {
																class120_sub14_sub19 = Class187.method2477(class189.anIntArray1983[i_63_], 1, class189.aBoolean1956, (byte) -94, null, i_68_, 3153952);
															} else {
																class120_sub14_sub19 = Class187.method2477(class189.anIntArray1983[i_63_], 2, class189.aBoolean1956, (byte) -127, null, i_68_, 0);
															}
															if (Rasterizer.aBoolean974) {
																Class52.aBooleanArray467[i_29_] = true;
															}
															if (class120_sub14_sub19 != null) {
																if (class189 == Class180_Sub4.aClass189_2954 && i_63_ == Class5.anInt2154) {
																	int i_69_ = -Class23.anInt134 + Queue.anInt1767;
																	int i_70_ = -Class27.anInt166 + Class191.anInt2113;
																	if (i_69_ < 5 && i_69_ > -5) {
																		i_69_ = 0;
																	}
																	if (i_70_ < 5 && i_70_ > -5) {
																		i_70_ = 0;
																	}
																	if (Class120_Sub14_Sub3_Sub1.anInt3915 < 5) {
																		i_70_ = 0;
																		i_69_ = 0;
																	}
																	class120_sub14_sub19.method1594(i_69_ + i_67_, i_66_ - -i_70_, 128);
																	if ((i_20_ ^ 0xffffffff) != 0) {
																		final Class189 class189_71_ = class189s[0xffff & i_20_];
																		int i_72_;
																		int i_73_;
																		if (!HDToolkit.glEnabled) {
																			i_72_ = GraphicsLD.endY;
																			i_73_ = GraphicsLD.startY;
																		} else {
																			i_72_ = GraphicsHD.anInt601;
																			i_73_ = GraphicsHD.anInt605;
																		}
																		if (i_70_ + i_66_ < i_73_ && class189_71_.anInt2021 > 0) {
																			int i_74_ = Class120_Sub12_Sub22.anInt3301 * (-i_66_ + i_73_ - i_70_) / 3;
																			if (10 * Class120_Sub12_Sub22.anInt3301 < i_74_) {
																				i_74_ = Class120_Sub12_Sub22.anInt3301 * 10;
																			}
																			if (class189_71_.anInt2021 < i_74_) {
																				i_74_ = class189_71_.anInt2021;
																			}
																			Class27.anInt166 += i_74_;
																			class189_71_.anInt2021 -= i_74_;
																			InterfaceClickMask.redrawInterface(class189_71_);
																		}
																		if (i_72_ < i_66_ - (-i_70_ + -32) && class189_71_.anInt2021 < class189_71_.anInt1937 - class189_71_.anInt2059) {
																			int i_75_ = (32 + i_66_ - (-i_70_ + i_72_)) * Class120_Sub12_Sub22.anInt3301 / 3;
																			if (i_75_ > Class120_Sub12_Sub22.anInt3301 * 10) {
																				i_75_ = 10 * Class120_Sub12_Sub22.anInt3301;
																			}
																			if (i_75_ > -class189_71_.anInt2021 + -class189_71_.anInt2059 + class189_71_.anInt1937) {
																				i_75_ = -class189_71_.anInt2021 + -class189_71_.anInt2059 + class189_71_.anInt1937;
																			}
																			class189_71_.anInt2021 += i_75_;
																			Class27.anInt166 -= i_75_;
																			InterfaceClickMask.redrawInterface(class189_71_);
																		}
																	}
																} else if (class189 == Class32.aClass189_256 && i_63_ == Class126.anInt1204) {
																	class120_sub14_sub19.method1594(i_67_, i_66_, 128);
																} else {
																	class120_sub14_sub19.method1587(i_67_, i_66_);
																}
															} else {
																InterfaceClickMask.redrawInterface(class189);
															}
														}
													} else if (class189.anIntArray1957 != null && i_63_ < 20) {
														final AbstractSprite class120_sub14_sub19 = class189.method2487((byte) 121, i_63_);
														if (class120_sub14_sub19 == null) {
															if (Class88.aBoolean835) {
																InterfaceClickMask.redrawInterface(class189);
															}
														} else {
															class120_sub14_sub19.method1587(i_67_, i_66_);
														}
													}
													i_63_++;
												}
											}
										} else if (class189.anInt1995 == 3) {
											int i_76_;
											if (!Class120_Sub12_Sub35.method1382(class189, (byte) -121)) {
												i_76_ = class189.anInt2025;
												if (CursorType.aClass189_1243 == class189 && class189.anInt2081 != 0) {
													i_76_ = class189.anInt2081;
												}
											} else {
												i_76_ = class189.anInt1972;
												if (CursorType.aClass189_1243 == class189 && class189.anInt2087 != 0) {
													i_76_ = class189.anInt2087;
												}
											}
											if (i_30_ == 0) {
												if (!class189.aBoolean2019) {
													if (!HDToolkit.glEnabled) {
														GraphicsLD.drawRect(i_32_, i_31_, class189.anInt1948, class189.anInt2059, i_76_);
													} else {
														GraphicsHD.drawRect(i_32_, i_31_, class189.anInt1948, class189.anInt2059, i_76_);
													}
												} else if (!HDToolkit.glEnabled) {
													GraphicsLD.fillRect(i_32_, i_31_, class189.anInt1948, class189.anInt2059, i_76_);
												} else {
													GraphicsHD.fillRect(i_32_, i_31_, class189.anInt1948, class189.anInt2059, i_76_);
												}
											} else if (class189.aBoolean2019) {
												if (HDToolkit.glEnabled) {
													GraphicsHD.method590(i_32_, i_31_, class189.anInt1948, class189.anInt2059, i_76_, -(i_30_ & 0xff) + 256);
												} else {
													GraphicsLD.method2159(i_32_, i_31_, class189.anInt1948, class189.anInt2059, i_76_, 256 - (0xff & i_30_));
												}
											} else if (!HDToolkit.glEnabled) {
												GraphicsLD.drawRect(i_32_, i_31_, class189.anInt1948, class189.anInt2059, i_76_, -(0xff & i_30_) + 256);
											} else {
												GraphicsHD.method583(i_32_, i_31_, class189.anInt1948, class189.anInt2059, i_76_, 256 - (i_30_ & 0xff));
											}
										} else if (class189.anInt1995 == 4) {
											final Class120_Sub14_Sub8 class120_sub14_sub8 = class189.method2497((byte) 54, Class82.aClass107Array785);
											if (class120_sub14_sub8 == null) {
												if (Class88.aBoolean835) {
													InterfaceClickMask.redrawInterface(class189);
												}
											} else {
												String string = class189.aString1950;
												int i_77_;
												if (!Class120_Sub12_Sub35.method1382(class189, (byte) -105)) {
													i_77_ = class189.anInt2025;
													if (class189 == CursorType.aClass189_1243 && class189.anInt2081 != 0) {
														i_77_ = class189.anInt2081;
													}
												} else {
													i_77_ = class189.anInt1972;
													if (class189 == CursorType.aClass189_1243 && class189.anInt2087 != 0) {
														i_77_ = class189.anInt2087;
													}
													if (class189.aString1936.length() > 0) {
														string = class189.aString1936;
													}
												}
												if (class189.aBoolean2041 && class189.anInt2030 != -1) {
													final ObjType objType = ObjType.list(class189.anInt2030);
													string = objType.name;
													if (string == null) {
														string = "null";
													}
													if ((objType.anInt1540 == 1 || class189.anInt2075 != 1) && (class189.anInt2075 ^ 0xffffffff) != 0) {
														string = new StringBuilder("<col=ff9040>").append(string).append("</col> x").append(Node.method1033((byte) 126, class189.anInt2075)).toString();
													}
												}
												if (Class156.aClass189_1454 == class189) {
													string = Class71.aString626;
													i_77_ = class189.anInt2025;
												}
												if (!class189.aBoolean2041) {
													string = InputStream_Sub1.method71(class189, 2, string);
												}
												class120_sub14_sub8.method1462(string, i_32_, i_31_, class189.anInt1948, class189.anInt2059, i_77_, !class189.aBoolean2040 ? -1 : 0, class189.anInt2011, class189.anInt2009, class189.anInt2057);
											}
										} else if (class189.anInt1995 == 5) {
											if (!class189.aBoolean2041) {
												final AbstractSprite class120_sub14_sub19 = class189.method2492(Class120_Sub12_Sub35.method1382(class189, (byte) -115), (byte) -18);
												if (class120_sub14_sub19 == null) {
													if (Class88.aBoolean835) {
														InterfaceClickMask.redrawInterface(class189);
													}
												} else {
													class120_sub14_sub19.method1587(i_32_, i_31_);
												}
											} else if (class189.anInt2088 < 0) {
												AbstractSprite class120_sub14_sub19;
												if (class189.anInt2030 == -1) {
													class120_sub14_sub19 = class189.method2492(false, (byte) -18);
												} else if (class189.aBoolean2097 && Class100.selfPlayer.appearance != null) {
													class120_sub14_sub19 = Class187.method2477(class189.anInt2075, class189.anInt2090, class189.aBoolean1956, (byte) -63, Class100.selfPlayer.appearance, class189.anInt2030, class189.anInt2026);
												} else {
													class120_sub14_sub19 = Class187.method2477(class189.anInt2075, class189.anInt2090, class189.aBoolean1956, (byte) -115, null, class189.anInt2030, class189.anInt2026);
												}
												if (class120_sub14_sub19 != null) {
													final int i_78_ = class120_sub14_sub19.trimWidth;
													final int i_79_ = class120_sub14_sub19.trimHeight;
													if (class189.aBoolean2001) {
														final int i_80_ = (i_78_ + -1 + class189.anInt1948) / i_78_;
														final int i_81_ = (class189.anInt2059 - (1 + -i_79_)) / i_79_;
														if (HDToolkit.glEnabled) {
															GraphicsHD.method591(i_32_, i_31_, i_32_ + class189.anInt1948, i_31_ - -class189.anInt2059);
															final boolean bool = Class179.method2264((byte) 91, class120_sub14_sub19.width);
															final HDSprite class120_sub14_sub19_sub1 = (HDSprite) class120_sub14_sub19;
															final boolean bool_82_ = Class179.method2264((byte) 96, class120_sub14_sub19.height);
															if (bool && bool_82_) {
																if (i_30_ != 0) {
																	class120_sub14_sub19_sub1.method1595(i_32_, i_31_, 256 - (0xff & i_30_), i_80_, i_81_);
																} else {
																	class120_sub14_sub19_sub1.method1599(i_32_, i_31_, i_80_, i_81_);
																}
															} else if (!bool) {
																if (!bool_82_) {
																	for (int i_83_ = 0; i_80_ > i_83_; i_83_++) {
																		for (int i_84_ = 0; i_81_ > i_84_; i_84_++) {
																			if (i_30_ != 0) {
																				class120_sub14_sub19.method1594(i_83_ * i_78_ + i_32_, i_84_ * i_79_ + i_31_, -(0xff & i_30_) + 256);
																			} else {
																				class120_sub14_sub19.method1587(i_78_ * i_83_ + i_32_, i_84_ * i_79_ + i_31_);
																			}
																		}
																	}
																} else {
																	for (int i_85_ = 0; i_80_ > i_85_; i_85_++) {
																		if (i_30_ == 0) {
																			class120_sub14_sub19_sub1.method1599(i_32_ - -(i_85_ * i_78_), i_31_, 1, i_81_);
																		} else {
																			class120_sub14_sub19_sub1.method1595(i_32_ + i_85_ * i_78_, i_31_, -(i_30_ & 0xff) + 256, 1, i_81_);
																		}
																	}
																}
															} else {
																for (int i_86_ = 0; i_81_ > i_86_; i_86_++) {
																	if (i_30_ == 0) {
																		class120_sub14_sub19_sub1.method1599(i_32_, i_86_ * i_79_ + i_31_, i_80_, 1);
																	} else {
																		class120_sub14_sub19_sub1.method1595(i_32_, i_79_ * i_86_ + i_31_, 256 + -(0xff & i_30_), i_80_, 1);
																	}
																}
															}
															GraphicsHD.method592(i_27_, i_25_, i_24_, i_23_);
														} else {
															GraphicsLD.method2166(i_32_, i_31_, class189.anInt1948 + i_32_, i_31_ + class189.anInt2059);
															for (int i_87_ = 0; i_80_ > i_87_; i_87_++) {
																for (int i_88_ = 0; i_88_ < i_81_; i_88_++) {
																	if (class189.anInt2070 != 0) {
																		class120_sub14_sub19.method1590(i_31_ - -(i_88_ * i_79_) + i_79_ / 2, (byte) -99, class189.anInt2070, i_87_ * i_78_ + i_32_ - -(i_78_ / 2), 4096);
																	} else if (i_30_ == 0) {
																		class120_sub14_sub19.method1587(i_32_ - -(i_87_ * i_78_), i_31_ + i_88_ * i_79_);
																	} else {
																		class120_sub14_sub19.method1594(i_87_ * i_78_ + i_32_, i_79_ * i_88_ + i_31_, 256 - (i_30_ & 0xff));
																	}
																}
															}
															GraphicsLD.method2155(i_27_, i_25_, i_24_, i_23_);
														}
													} else {
														final int i_89_ = class189.anInt1948 * 4096 / i_78_;
														if (class189.anInt2070 != 0) {
															class120_sub14_sub19.method1590(i_31_ + class189.anInt2059 / 2, (byte) -99, class189.anInt2070, class189.anInt1948 / 2 + i_32_, i_89_);
														} else if (i_30_ != 0) {
															class120_sub14_sub19.method1585(i_32_, i_31_, class189.anInt1948, class189.anInt2059, -(i_30_ & 0xff) + 256);
														} else if (class189.anInt1948 != i_78_ || i_79_ != class189.anInt2059) {
															class120_sub14_sub19.method1588(i_32_, i_31_, class189.anInt1948, class189.anInt2059);
														} else {
															class120_sub14_sub19.method1587(i_32_, i_31_);
														}
													}
												} else if (Class88.aBoolean835) {
													InterfaceClickMask.redrawInterface(class189);
												}
											} else {
												final Class41 class41 = class189.method2489(0);
												if (!HDToolkit.glEnabled) {
													class41.method330(0, i_32_, i_31_, class189.anInt1948, class189.anInt2059, class189.anInt2078, class189.anInt2004, 0);
												} else {
													class41.method331(0, i_32_, i_31_, class189.anInt1948, class189.anInt2059, class189.anInt2078, class189.anInt2004, 0);
												}
											}
										} else if (class189.anInt1995 == 6) {
											final boolean bool = Class120_Sub12_Sub35.method1382(class189, (byte) -90);
											Class180_Sub7 class180_sub7 = null;
											int i_90_;
											if (bool) {
												i_90_ = class189.anInt1990;
											} else {
												i_90_ = class189.anInt1945;
											}
											int i_91_ = 0;
											if ((class189.anInt2030 ^ 0xffffffff) != 0) {
												ObjType objType = ObjType.list(class189.anInt2030);
												if (objType != null) {
													objType = objType.method2106(true, class189.anInt2075);
													final Class40 class40 = i_90_ != -1 ? Class120_Sub30_Sub2.method1763(i_90_, 126) : null;
													if (class189.aBoolean2097 && Class100.selfPlayer.appearance != null) {
														class180_sub7 = objType.method2105(class189.anInt1946, 1, -115, class189.anInt2098, Class100.selfPlayer.appearance, class40, class189.anInt1965);
													} else {
														class180_sub7 = objType.method2105(class189.anInt1946, 1, -78, class189.anInt2098, null, class40, class189.anInt1965);
													}
													if (class180_sub7 == null) {
														InterfaceClickMask.redrawInterface(class189);
													} else {
														i_91_ = -class180_sub7.getMaxY() / 2;
													}
												}
											} else if (class189.anInt2031 != 5) {
												if ((i_90_ ^ 0xffffffff) != 0) {
													final Class40 class40 = Class120_Sub30_Sub2.method1763(i_90_, 122);
													class180_sub7 = class189.method2486(class40, Class100.selfPlayer.appearance, class189.anInt2098, (byte) -83, class189.anInt1946, class189.anInt1965, bool);
													if (class180_sub7 == null && Class88.aBoolean835) {
														InterfaceClickMask.redrawInterface(class189);
													}
												} else {
													class180_sub7 = class189.method2486(null, Class100.selfPlayer.appearance, -1, (byte) -83, -1, 0, bool);
													if (class180_sub7 == null && Class88.aBoolean835) {
														InterfaceClickMask.redrawInterface(class189);
													}
												}
											} else if ((class189.anInt1961 ^ 0xffffffff) != 0) {
												int i_92_ = class189.anInt1961 & 0x7ff;
												if (Class167.anInt1616 == i_92_) {
													i_92_ = 2047;
												}
												final Player class180_sub5_sub1 = Class118.playersList[i_92_];
												final Class40 class40 = (i_90_ ^ 0xffffffff) == 0 ? null : Class120_Sub30_Sub2.method1763(i_90_, 123);
												if (class180_sub5_sub1 != null && (int) Class70.method636(-121, class180_sub5_sub1.aString3745) << 11 == (~0x7ff & class189.anInt1961)) {
													class180_sub7 = class180_sub5_sub1.appearance.method2040(null, 0, -1, -1, null, class189.anInt1946, -7453, false, 0, class40, true, 0);
												}
											} else {
												class180_sub7 = Class26.aClass144_159.method2040(null, -1, -1, -1, null, -1, -7453, false, 0, null, true, 0);
											}
											if (class180_sub7 != null) {
												int i_93_;
												if (class189.anInt2069 <= 0) {
													i_93_ = 256;
												} else {
													i_93_ = (class189.anInt1948 << 8) / class189.anInt2069;
												}
												int i_94_;
												if (class189.anInt2007 <= 0) {
													i_94_ = 256;
												} else {
													i_94_ = (class189.anInt2059 << 8) / class189.anInt2007;
												}
												final int i_95_ = i_31_ - -(class189.anInt2059 / 2) - -(class189.anInt2008 * i_94_ >> 8);
												final int i_96_ = (class189.anInt1981 * i_93_ >> 8) + class189.anInt1948 / 2 + i_32_;
												if (!HDToolkit.glEnabled) {
													Rasterizer.method869(i_96_, i_95_);
													final int i_97_ = class189.anInt2005 * Rasterizer.cosineTable[class189.anInt2047] >> 16;
													final int i_98_ = Rasterizer.sineTable[class189.anInt2047] * class189.anInt2005 >> 16;
													if (class189.aBoolean2041) {
														if (class189.aBoolean2046) {
															((Class180_Sub7_Sub1) class180_sub7).method2400(0, class189.anInt2091, class189.anInt1935, class189.anInt2047, class189.anInt2076, i_98_ - -i_91_ - -class189.anInt1977, i_97_ + class189.anInt1977, class189.anInt2005);
														} else {
															class180_sub7.method2367(0, class189.anInt2091, class189.anInt1935, class189.anInt2047, class189.anInt2076, i_91_ + i_98_ - -class189.anInt1977, i_97_ - -class189.anInt1977, -1L);
														}
													} else {
														class180_sub7.method2367(0, class189.anInt2091, 0, class189.anInt2047, 0, i_98_, i_97_, -1L);
													}
													Rasterizer.method868();
												} else {
													if (!class189.aBoolean2046) {
														HDToolkit.method513(i_96_, i_95_, i_93_, i_94_);
														HDToolkit.method535(class189.aShort2065, 1.5F * class189.aShort2093);
													} else {
														HDToolkit.method512(i_96_, i_95_, class189.anInt2005, class189.aShort2093, i_93_, i_94_);
													}
													HDToolkit.method532();
													HDToolkit.method502(true);
													HDToolkit.method507(false);
													Class99.method822(Class120_Sub14_Sub14_Sub1.brightness, -78);
													if (Class167.aBoolean1620) {
														GraphicsHD.method597();
														HDToolkit.method517();
														GraphicsHD.method592(i_27_, i_25_, i_24_, i_23_);
														Class167.aBoolean1620 = false;
													}
													if (class189.aBoolean2003) {
														HDToolkit.method503();
													}
													final int i_99_ = Rasterizer.cosineTable[class189.anInt2047] * class189.anInt2005 >> 16;
													final int i_100_ = class189.anInt2005 * Rasterizer.sineTable[class189.anInt2047] >> 16;
													if (class189.aBoolean2041) {
														class180_sub7.method2367(0, class189.anInt2091, class189.anInt1935, class189.anInt2047, class189.anInt2076, class189.anInt1977 + i_91_ + i_100_, i_99_ + class189.anInt1977, -1L);
													} else {
														class180_sub7.method2367(0, class189.anInt2091, 0, class189.anInt2047, 0, i_100_, i_99_, -1L);
													}
													if (class189.aBoolean2003) {
														HDToolkit.method505();
													}
												}
											}
										} else {
											if (class189.anInt1995 == 7) {
												final Class120_Sub14_Sub8 class120_sub14_sub8 = class189.method2497((byte) 54, Class82.aClass107Array785);
												if (class120_sub14_sub8 == null) {
													if (Class88.aBoolean835) {
														InterfaceClickMask.redrawInterface(class189);
													}
													continue;
												}
												int i_101_ = 0;
												for (int i_102_ = 0; i_102_ < class189.anInt2060; i_102_++) {
													for (int i_103_ = 0; class189.anInt2014 > i_103_; i_103_++) {
														if (class189.anIntArray1978[i_101_] > 0) {
															final ObjType objType = ObjType.list(class189.anIntArray1978[i_101_] + -1);
															String string;
															if (objType.anInt1540 != 1 && class189.anIntArray1983[i_101_] == 1) {
																string = new StringBuilder("<col=ff9040>").append(objType.name).append("</col>").toString();
															} else {
																string = new StringBuilder("<col=ff9040>").append(objType.name).append("</col> x").append(Node.method1033((byte) 126, class189.anIntArray1983[i_101_])).toString();
															}
															final int i_104_ = i_32_ + i_103_ * (115 + class189.anInt2044);
															final int i_105_ = (class189.anInt2077 + 12) * i_102_ + i_31_;
															if (class189.anInt2011 == 0) {
																class120_sub14_sub8.method1466(string, i_104_, i_105_, class189.anInt2025, !class189.aBoolean2040 ? -1 : 0);
															} else if (class189.anInt2011 == 1) {
																class120_sub14_sub8.method1478(string, i_104_ + 57, i_105_, class189.anInt2025, !class189.aBoolean2040 ? -1 : 0);
															} else {
																class120_sub14_sub8.method1482(string, i_104_ + 114, i_105_, class189.anInt2025, !class189.aBoolean2040 ? -1 : 0);
															}
														}
														i_101_++;
													}
												}
											}
											if (class189.anInt1995 == 8 && Class49.aClass189_441 == class189 && Class108.anInt1031 == Class120_Sub12_Sub21.anInt3291) {
												int i_106_ = 0;
												final Class120_Sub14_Sub8 class120_sub14_sub8 = Class120_Sub12_Sub20.aClass120_Sub14_Sub8_3286;
												int i_107_ = 0;
												String string = class189.aString1950;
												string = InputStream_Sub1.method71(class189, 2, string);
												while (string.length() > 0) {
													final int i_108_ = string.indexOf("<br>");
													String string_109_;
													if ((i_108_ ^ 0xffffffff) != 0) {
														string_109_ = string.substring(0, i_108_);
														string = string.substring(i_108_ - -4);
													} else {
														string_109_ = string;
														string = "";
													}
													final int i_110_ = class120_sub14_sub8.method1459(string_109_);
													if (i_110_ > i_106_) {
														i_106_ = i_110_;
													}
													i_107_ += 1 + class120_sub14_sub8.anInt3497;
												}
												i_107_ += 7;
												i_106_ += 6;
												int i_111_ = i_31_ + class189.anInt2059 + 5;
												if (i_23_ < i_107_ + i_111_) {
													i_111_ = -i_107_ + i_23_;
												}
												int i_112_ = i_32_ + class189.anInt1948 - (5 + i_106_);
												if (i_112_ < i_32_ - -5) {
													i_112_ = i_32_ + 5;
												}
												if (i_106_ + i_112_ > i_24_) {
													i_112_ = -i_106_ + i_24_;
												}
												if (HDToolkit.glEnabled) {
													GraphicsHD.fillRect(i_112_, i_111_, i_106_, i_107_, 16777120);
													GraphicsHD.drawRect(i_112_, i_111_, i_106_, i_107_, 0);
												} else {
													GraphicsLD.fillRect(i_112_, i_111_, i_106_, i_107_, 16777120);
													GraphicsLD.drawRect(i_112_, i_111_, i_106_, i_107_, 0);
												}
												int i_113_ = 2 + class120_sub14_sub8.anInt3497 + i_111_;
												string = class189.aString1950;
												string = InputStream_Sub1.method71(class189, 2, string);
												while (string.length() > 0) {
													final int i_114_ = string.indexOf("<br>");
													String string_115_;
													if ((i_114_ ^ 0xffffffff) != 0) {
														string_115_ = string.substring(0, i_114_);
														string = string.substring(i_114_ + 4);
													} else {
														string_115_ = string;
														string = "";
													}
													class120_sub14_sub8.method1466(string_115_, 3 + i_112_, i_113_, 0, -1);
													i_113_ += 1 + class120_sub14_sub8.anInt3497;
												}
											}
											if (class189.anInt1995 == 9) {
												int i_116_;
												int i_117_;
												int i_118_;
												int i_119_;
												if (class189.aBoolean1989) {
													i_117_ = class189.anInt1948 + i_32_;
													i_116_ = i_32_;
													i_118_ = i_31_;
													i_119_ = class189.anInt2059 + i_31_;
												} else {
													i_116_ = i_32_;
													i_117_ = i_32_ + class189.anInt1948;
													i_118_ = i_31_ + class189.anInt2059;
													i_119_ = i_31_;
												}
												if (class189.anInt1967 == 1) {
													if (HDToolkit.glEnabled) {
														GraphicsHD.method582(i_116_, i_119_, i_117_, i_118_, class189.anInt2025);
													} else {
														GraphicsLD.method2150(i_116_, i_119_, i_117_, i_118_, class189.anInt2025);
													}
												} else if (HDToolkit.glEnabled) {
													GraphicsHD.method586(i_116_, i_119_, i_117_, i_118_, class189.anInt2025, class189.anInt1967);
												} else {
													GraphicsLD.method2161(i_116_, i_119_, i_117_, i_118_, class189.anInt2025, class189.anInt1967);
												}
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
			throw Class120_Sub14_Sub2.method1428(runtimeexception,
					new StringBuilder("qg.F(").append(i).append(',').append(i_20_).append(',').append(i_21_).append(',').append(i_22_).append(',').append(class189s != null ? "{...}" : "null").append(',').append(i_23_).append(',').append(i_24_).append(',').append(i_25_).append(',').append(i_26_)
							.append(',').append(i_27_).append(')').toString());
		}
	}

	static final void method2009(final int i) {
		try {
			if (i != 255) {
				anInt1361 = 57;
			}
			Class180_Sub1.aClass21_2841.method186((byte) 86);
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("qg.G(").append(i).append(')').toString());
		}
	}

	final void method2010(final int i, final boolean bool, final Buffer class120_sub7) {
		try {
			for (;;) {
				final int i_120_ = class120_sub7.getUByte();
				if (i_120_ == 0) {
					break;
				}
				method2006(-126, class120_sub7, i, i_120_);
			}
			if (bool) {
				this.aBoolean1359 = true;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("qg.H(").append(i).append(',').append(bool).append(',').append(class120_sub7 != null ? "{...}" : "null").append(')').toString());
		}
	}

	final Class107_Sub1 method2011(final int i, final boolean bool, final int i_121_) {
		Class107_Sub1 class107_sub1;
		try {
			Class107_Sub1 class107_sub1_122_ = (Class107_Sub1) Class132.aClass21_1255.method193(i_121_ << 16 | this.anInt1363 | (!bool ? 0 : 262144), (byte) -85);
			if (class107_sub1_122_ != null) {
				return class107_sub1_122_;
			}
			Class120_Sub14_Sub22.aClass50_3640.method429(this.anInt1363, 79);
			class107_sub1_122_ = Class164.method2138(i ^ ~0x20, 0, Class120_Sub14_Sub22.aClass50_3640, this.anInt1363);
			if (class107_sub1_122_ != null) {
				class107_sub1_122_.method914(Class158.anInt1481, Class5.anInt2157, GameEntity.anInt2957);
				class107_sub1_122_.anInt1029 = class107_sub1_122_.anInt1026;
				class107_sub1_122_.anInt1028 = class107_sub1_122_.anInt1030;
				if (bool) {
					class107_sub1_122_.method915();
				}
				for (int i_123_ = 0; i_123_ < i_121_; i_123_++) {
					class107_sub1_122_.method916();
				}
				Class132.aClass21_1255.method185(-125, class107_sub1_122_, this.anInt1363 | i_121_ << 16 | (!bool ? 0 : 262144));
			}
			if (i != -1) {
				return null;
			}
			class107_sub1 = class107_sub1_122_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("qg.C(").append(i).append(',').append(bool).append(',').append(i_121_).append(')').toString());
		}
		return class107_sub1;
	}

	public Class142() {
		/* empty */
	}

	public static void method2012(final int i) {
		try {
			aClass189_1362 = null;
			aString1358 = null;
			if (i != 0) {
				aClass189_1362 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("qg.E(").append(i).append(')').toString());
		}
	}
}
