/* Class142 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class142 {
	static String aString1358 = "Loaded textures";
	boolean aBoolean1359 = false;
	int anInt1360;
	static int anInt1361;
	static JagexInterface aClass189_1362;
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
					this.anInt1360 = class120_sub7.getMedium();
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
				class120_sub7.putJagexString(string_15_);
				class120_sub7.putInt(is[1]);
				class120_sub7.putShort(Class120_Sub12_Sub33.affiliateId);
				class120_sub7.putByte(i);
				class120_sub7.putByte(i_11_);
				class120_sub7.putInt(is[2]);
				class120_sub7.putShort(i_12_);
				class120_sub7.putShort(i_10_);
				class120_sub7.putInt(is[3]);
				class120_sub7.encryptRsa(JagexSocket.aBigInteger415, KeyboardHandler.aBigInteger1505);
				final Buffer class120_sub7_17_ = new Buffer(350);
				class120_sub7_17_.putJagexString(string);
				final int i_18_ = 8 + -(Class69_Sub2_Sub1.method620(string) % 8);
				for (int i_19_ = 0; i_18_ > i_19_; i_19_++) {
					class120_sub7_17_.putByte((int) (Math.random() * 255.0));
				}
				class120_sub7_17_.method1129(false, is);
				Class120_Sub12_Sub11.outputStream.pos = 0;
				Class120_Sub12_Sub11.outputStream.putByte(22);
				Class120_Sub12_Sub11.outputStream.putShort(class120_sub7_17_.pos + class120_sub7.pos + 2);
				Class120_Sub12_Sub11.outputStream.putShort(550);
				Class120_Sub12_Sub11.outputStream.putBuffer(class120_sub7.buf, 0, class120_sub7.pos);
				Class120_Sub12_Sub11.outputStream.putBuffer(class120_sub7_17_.buf, 0, class120_sub7_17_.pos);
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

	static final void method2008(final int i, final int i_20_, final byte i_21_, final int i_22_, final JagexInterface[] class189s, final int i_23_, final int i_24_, final int i_25_, final int i_26_, final int i_27_) {
		if (!HDToolkit.glEnabled) {
			GraphicsLD.clipRect(i_27_, i_25_, i_24_, i_23_);
			Rasterizer.method874();
		} else {
			GraphicsHD.clipRect(i_27_, i_25_, i_24_, i_23_);
		}
		for (int i_28_ = 0; i_28_ < class189s.length; i_28_++) {
			final JagexInterface jagexInterface = class189s[i_28_];
			if (jagexInterface != null && (i_20_ == jagexInterface.parent || (i_20_ ^ 0xffffffff) == 1412584498 && jagexInterface == Class120_Sub12_Sub4.aClass189_3156)) {
				int i_29_;
				if (i_22_ == -1) {
					Class160.anIntArray1495[Class120_Sub1.anInt2414] = jagexInterface.x + i;
					Class120_Sub12_Sub38.anIntArray3441[Class120_Sub1.anInt2414] = i_26_ + jagexInterface.y;
					Class120_Sub16.anIntArray2608[Class120_Sub1.anInt2414] = jagexInterface.anInt1948;
					Class69_Sub3_Sub1.anIntArray3081[Class120_Sub1.anInt2414] = jagexInterface.anInt2059;
					i_29_ = Class120_Sub1.anInt2414++;
				} else {
					i_29_ = i_22_;
				}
				jagexInterface.anInt1968 = Class101_Sub2.loopCycle;
				jagexInterface.anInt2082 = i_29_;
				if (!jagexInterface.aBoolean2041 || !client.method59(jagexInterface)) {
					if (jagexInterface.clientCode > 0) {
						Class143_Sub1.method2032(jagexInterface, 27);
					}
					int i_30_ = jagexInterface.alpha;
					int i_31_ = jagexInterface.y + i_26_;
					int i_32_ = jagexInterface.x + i;
					if (Class120_Sub30_Sub1.aBoolean3673 && (client.getClickMask(jagexInterface).anInt2662 != 0 || jagexInterface.type == 0) && i_30_ > 127) {
						i_30_ = 127;
					}
					if (jagexInterface == Class120_Sub12_Sub4.aClass189_3156) {
						if (-1412584499 != i_20_ && !jagexInterface.aBoolean1939) {
							Class120_Sub12_Sub38.anInt3438 = i;
							Class111.anInt1065 = i_26_;
							Class107.aClass189Array1022 = class189s;
							continue;
						}
						if (!jagexInterface.aBoolean1939) {
							i_30_ = 128;
						}
						if (Class120_Sub11.aBoolean2551 && Class111.aBoolean1058) {
							int i_33_ = Class191.lastMouseY;
							int i_34_ = Queue.lastMouseX;
							i_33_ -= client.anInt2203;
							i_34_ -= AbstractGraphicsBuffer.anInt1173;
							if (Class120_Sub12_Sub35.anInt3413 > i_33_) {
								i_33_ = Class120_Sub12_Sub35.anInt3413;
							}
							if (i_34_ < Class120_Sub12_Sub7.anInt3183) {
								i_34_ = Class120_Sub12_Sub7.anInt3183;
							}
							if (i_33_ + jagexInterface.anInt2059 > Class120_Sub12_Sub35.anInt3413 - -Class26.aClass189_161.anInt2059) {
								i_33_ = Class120_Sub12_Sub35.anInt3413 - (-Class26.aClass189_161.anInt2059 - -jagexInterface.anInt2059);
							}
							if (Class26.aClass189_161.anInt1948 + Class120_Sub12_Sub7.anInt3183 < i_34_ + jagexInterface.anInt1948) {
								i_34_ = -jagexInterface.anInt1948 + Class26.aClass189_161.anInt1948 + Class120_Sub12_Sub7.anInt3183;
							}
							i_32_ = i_34_;
							i_31_ = i_33_;
						}
					}
					int i_35_;
					int i_36_;
					int i_37_;
					int i_38_;
					if (jagexInterface.type != 2) {
						i_35_ = i_25_ < i_31_ ? i_31_ : i_25_;
						i_37_ = i_32_ <= i_27_ ? i_27_ : i_32_;
						int i_39_ = i_32_ - -jagexInterface.anInt1948;
						int i_40_ = i_31_ - -jagexInterface.anInt2059;
						if (jagexInterface.type == 9) {
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
					if (!jagexInterface.aBoolean2041 || i_37_ < i_36_ && i_38_ > i_35_) {
						if (jagexInterface.clientCode != 0) {
							if (jagexInterface.clientCode == 1337 || jagexInterface.clientCode == 1403) {
								Class56.anInt497 = i_32_;
								DummyInputStream.aClass189_26 = jagexInterface;
								Class120_Sub14_Sub16.anInt3590 = i_31_;
								StringNode.method1721(0, i_32_, jagexInterface.anInt2059, jagexInterface.clientCode == 1403, jagexInterface.anInt1948, i_31_);
								Class52.aBooleanArray467[i_29_] = true;
								if (HDToolkit.glEnabled) {
									GraphicsHD.clipRect(i_27_, i_25_, i_24_, i_23_);
								} else {
									GraphicsLD.clipRect(i_27_, i_25_, i_24_, i_23_);
								}
								continue;
							}
							if (jagexInterface.clientCode == 1338) {
								if (jagexInterface.method2501(-1)) {
									Class164.method2145(i_32_, i_29_, jagexInterface, i_31_, 0);
									if (!HDToolkit.glEnabled) {
										GraphicsLD.clipRect(i_27_, i_25_, i_24_, i_23_);
									} else {
										GraphicsHD.clipRect(i_27_, i_25_, i_24_, i_23_);
									}
									if ((AbstractGraphicsBuffer.anInt1175 == 0 || AbstractGraphicsBuffer.anInt1175 == 3) && !Class15.menuOpen && Class115.anInt1110 >= i_37_ && i_35_ <= Class120_Sub12_Sub21.anInt3298 && i_36_ > Class115.anInt1110 && Class120_Sub12_Sub21.anInt3298 < i_38_) {
										int i_41_ = Class115.anInt1110 - i_32_;
										int i_42_ = Class120_Sub12_Sub21.anInt3298 - i_31_;
										final int i_43_ = jagexInterface.anIntArray2079[i_42_];
										if (i_43_ <= i_41_ && i_41_ <= jagexInterface.anIntArray1949[i_42_] + i_43_) {
											i_42_ -= jagexInterface.anInt2059 / 2;
											final int i_44_ = Class164.anInt1590 + (int) DummyOutputStream.aFloat28 & 0x7ff;
											int i_45_ = Rasterizer.sineTable[i_44_];
											i_41_ -= jagexInterface.anInt1948 / 2;
											i_45_ = i_45_ * (256 + Class154.anInt1442) >> 8;
											int i_46_ = Rasterizer.cosineTable[i_44_];
											i_46_ = (Class154.anInt1442 - -256) * i_46_ >> 8;
											final int i_47_ = i_45_ * i_42_ + (i_41_ * i_46_) >> 11;
											final int i_48_ = -(i_45_ * i_41_) + i_46_ * i_42_ >> 11;
											final int i_49_ = Class100.selfPlayer.x - -i_47_ - -64 - 64 * Class100.selfPlayer.getSize() >> 7;
											final int i_50_ = Class100.selfPlayer.z - (i_48_ - -(64 * Class100.selfPlayer.getSize())) - -64 >> 7;
											if (Class88.aBoolean828 && (0x40 & GroundTile.anInt2652) != 0) {
												final JagexInterface class189_51_ = Class120_Sub13.method1404(AbstractMouseWheelHandler.anInt119, JagexSocket.anInt420);
												if (class189_51_ != null) {
													Class120_Sub14_Sub6.addMenuOption(1L, i_49_, i_50_, " ->", Class101.aString963, (short) 19, Class150.anInt1417);
												} else {
													Node.method1029();
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
							if (jagexInterface.clientCode == 1339) {
								if (jagexInterface.method2501(-1)) {
									Decimator.method2224(jagexInterface, (byte) 12, i_31_, i_29_, i_32_);
									if (HDToolkit.glEnabled) {
										GraphicsHD.clipRect(i_27_, i_25_, i_24_, i_23_);
									} else {
										GraphicsLD.clipRect(i_27_, i_25_, i_24_, i_23_);
									}
								}
								continue;
							}
							if (jagexInterface.clientCode == 1400) {
								Class82.method711(jagexInterface.anInt2059, (byte) -114, i_31_, i_32_, jagexInterface.anInt1948);
								Class52.aBooleanArray467[i_29_] = true;
								Class120_Sub12_Sub33.aBooleanArray3391[i_29_] = true;
								if (!HDToolkit.glEnabled) {
									GraphicsLD.clipRect(i_27_, i_25_, i_24_, i_23_);
								} else {
									GraphicsHD.clipRect(i_27_, i_25_, i_24_, i_23_);
								}
								continue;
							}
							if (jagexInterface.clientCode == 1401) {
								Class186.method2473(jagexInterface.anInt2059, -18418, jagexInterface.anInt1948, i_32_, i_31_);
								Class52.aBooleanArray467[i_29_] = true;
								Class120_Sub12_Sub33.aBooleanArray3391[i_29_] = true;
								if (!HDToolkit.glEnabled) {
									GraphicsLD.clipRect(i_27_, i_25_, i_24_, i_23_);
								} else {
									GraphicsHD.clipRect(i_27_, i_25_, i_24_, i_23_);
								}
								continue;
							}
							if (jagexInterface.clientCode == 1402) {
								if (!HDToolkit.glEnabled) {
									Class80.method699(-1, i_31_, i_32_);
									Class52.aBooleanArray467[i_29_] = true;
									Class120_Sub12_Sub33.aBooleanArray3391[i_29_] = true;
								}
								continue;
							}
							if (jagexInterface.clientCode == 1405) {
								if (Class85.showFps) {
									final int i_52_ = i_32_ + jagexInterface.anInt1948;
									int i_53_ = i_31_ + 15;
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
									Cache.aClass120_Sub14_Sub8_121.method1482(string, i_52_, i_53_, i_55_, -1);
									i_53_ += 12;
									if (ParticleEngine.anInt2360 > 0) {
										Cache.aClass120_Sub14_Sub8_121.method1482(new StringBuilder("Particles: ").append(ParticleEngine.runningParticleCount).append(" / ").append(ParticleEngine.anInt2360).toString(), i_52_, i_53_, i_55_, -1);
									}
									i_53_ += 12;
									Class52.aBooleanArray467[i_29_] = true;
									Class120_Sub12_Sub33.aBooleanArray3391[i_29_] = true;
								}
								continue;
							}
							if (jagexInterface.clientCode == 1406) {
								Class9.anInt68 = i_32_;
								Class90.anInt847 = i_31_;
								Class69_Sub3_Sub1.aClass189_3080 = jagexInterface;
								continue;
							}
						}
						if (!Class15.menuOpen) {
							if (jagexInterface.type == 0 && jagexInterface.aBoolean1960 && i_37_ <= Class115.anInt1110 && Class120_Sub12_Sub21.anInt3298 >= i_35_ && Class115.anInt1110 < i_36_ && i_38_ > Class120_Sub12_Sub21.anInt3298 && !Class120_Sub30_Sub1.aBoolean3673) {
								Class120_Sub29.aShortArray2777[0] = (short) 1006;
								Class120_Sub12_Sub33.menuOptionName[0] = Class157.aString1462;
								Class120_Sub12_Sub29.aStringArray3369[0] = "";
								InterfaceChangeNode.menuOptionsCursorId[0] = Class192.anInt2123;
								Class186.menuOptionCount = 1;
							}
							if (Class115.anInt1110 >= i_37_ && i_35_ <= Class120_Sub12_Sub21.anInt3298 && Class115.anInt1110 < i_36_ && i_38_ > Class120_Sub12_Sub21.anInt3298) {
								Class120_Sub12_Sub9.method1244(jagexInterface, 88, -i_31_ + Class120_Sub12_Sub21.anInt3298, Class115.anInt1110 - i_32_);
							}
						}
						if (jagexInterface.type == 0) {
							if (!jagexInterface.aBoolean2041 && client.method59(jagexInterface) && jagexInterface != CursorType.aClass189_1243) {
								continue;
							}
							if (!jagexInterface.aBoolean2041) {
								if (-jagexInterface.anInt2059 + jagexInterface.maxScrollVertical < jagexInterface.horizontalScrollPosition) {
									jagexInterface.horizontalScrollPosition = -jagexInterface.anInt2059 + jagexInterface.maxScrollVertical;
								}
								if (jagexInterface.horizontalScrollPosition < 0) {
									jagexInterface.horizontalScrollPosition = 0;
								}
							}
							if (HDToolkit.glEnabled && jagexInterface.clientCode == 1407) {
								Class34.method283(i_32_, i_31_, jagexInterface.anInt1948, jagexInterface.anInt2059);
							}
							method2008(i_32_ + -jagexInterface.verticalScrollPosition, jagexInterface.bitPacked, (byte) -105, i_29_, class189s, i_38_, i_36_, i_35_, -jagexInterface.horizontalScrollPosition + i_31_, i_37_);
							if (jagexInterface.aClass189Array2072 != null) {
								method2008(-jagexInterface.verticalScrollPosition + i_32_, jagexInterface.bitPacked, (byte) -108, i_29_, jagexInterface.aClass189Array2072, i_38_, i_36_, i_35_, -jagexInterface.horizontalScrollPosition + i_31_, i_37_);
							}
							final OverridedJInterface class120_sub26 = (OverridedJInterface) Class120_Sub12_Sub13.overridedInterfaces.get(jagexInterface.bitPacked);
							if (class120_sub26 != null) {
								if (class120_sub26.type == 0 && !Class15.menuOpen && Class115.anInt1110 >= i_37_ && Class120_Sub12_Sub21.anInt3298 >= i_35_ && i_36_ > Class115.anInt1110 && Class120_Sub12_Sub21.anInt3298 < i_38_ && !Class120_Sub30_Sub1.aBoolean3673) {
									Class120_Sub29.aShortArray2777[0] = (short) 1006;
									InterfaceChangeNode.menuOptionsCursorId[0] = Class192.anInt2123;
									Class120_Sub12_Sub33.menuOptionName[0] = Class157.aString1462;
									Class120_Sub12_Sub29.aStringArray3369[0] = "";
									Class186.menuOptionCount = 1;
								}
								Class43.method343(class120_sub26.interfaceId, i_35_, i_31_, (byte) -81, i_32_, i_38_, i_37_, i_36_, i_29_);
							}
							if (HDToolkit.glEnabled && jagexInterface.clientCode == 1407) {
								Class34.method289();
								Class167.aBoolean1620 = true;
							}
							if (HDToolkit.glEnabled) {
								GraphicsHD.clipRect(i_27_, i_25_, i_24_, i_23_);
							} else {
								GraphicsLD.clipRect(i_27_, i_25_, i_24_, i_23_);
								Rasterizer.method874();
							}
						}
						if (Class9.aBooleanArray74[i_29_] || Class15.anInt96 > 1) {
							if (jagexInterface.type == 0 && !jagexInterface.aBoolean2041 && jagexInterface.anInt2059 < jagexInterface.maxScrollVertical) {
								PlayerAppearance.method2039(jagexInterface.anInt2059, (byte) 80, jagexInterface.anInt1948 + i_32_, jagexInterface.maxScrollVertical, i_31_, jagexInterface.horizontalScrollPosition);
							}
							if (jagexInterface.type != 1) {
								if (jagexInterface.type == 2) {
									int i_63_ = 0;
									for (int i_64_ = 0; jagexInterface.originalHeight > i_64_; i_64_++) {
										for (int i_65_ = 0; jagexInterface.originalWidth > i_65_; i_65_++) {
											int i_66_ = i_31_ + (32 + jagexInterface.objSpritePadY) * i_64_;
											int i_67_ = i_32_ + i_65_ * (32 - -jagexInterface.objSpritePadX);
											if (i_63_ < 20) {
												i_66_ += jagexInterface.spriteYs[i_63_];
												i_67_ += jagexInterface.spriteXs[i_63_];
											}
											if (jagexInterface.objAmounts[i_63_] > 0) {
												final int i_68_ = jagexInterface.objAmounts[i_63_] - 1;
												if (i_67_ - -32 > i_27_ && i_67_ < i_24_ && i_25_ < 32 + i_66_ && i_66_ < i_23_ || jagexInterface == Class180_Sub4.aClass189_2954 && Class5.anInt2154 == i_63_) {
													AbstractSprite class120_sub14_sub19;
													if (Light.objSelected != 1 || i_63_ != Class108_Sub1.selectedObjSlot || jagexInterface.bitPacked != Class141.selectedObjInterface) {
														class120_sub14_sub19 = Class187.method2477(jagexInterface.objIds[i_63_], 1, jagexInterface.aBoolean1956, (byte) -94, null, i_68_, 3153952);
													} else {
														class120_sub14_sub19 = Class187.method2477(jagexInterface.objIds[i_63_], 2, jagexInterface.aBoolean1956, (byte) -127, null, i_68_, 0);
													}
													if (Rasterizer.aBoolean974) {
														Class52.aBooleanArray467[i_29_] = true;
													}
													if (class120_sub14_sub19 != null) {
														if (jagexInterface == Class180_Sub4.aClass189_2954 && i_63_ == Class5.anInt2154) {
															int i_69_ = -Class23.anInt134 + Queue.lastMouseX;
															int i_70_ = -Class27.anInt166 + Class191.lastMouseY;
															if (i_69_ < 5 && i_69_ > -5) {
																i_69_ = 0;
															}
															if (i_70_ < 5 && i_70_ > -5) {
																i_70_ = 0;
															}
															if (JavaObject.anInt3915 < 5) {
																i_70_ = 0;
																i_69_ = 0;
															}
															class120_sub14_sub19.method1594(i_69_ + i_67_, i_66_ - -i_70_, 128);
															if ((i_20_ ^ 0xffffffff) != 0) {
																final JagexInterface class189_71_ = class189s[0xffff & i_20_];
																int i_72_;
																int i_73_;
																if (!HDToolkit.glEnabled) {
																	i_72_ = GraphicsLD.endY;
																	i_73_ = GraphicsLD.startY;
																} else {
																	i_72_ = GraphicsHD.endY;
																	i_73_ = GraphicsHD.startY;
																}
																if (i_70_ + i_66_ < i_73_ && class189_71_.horizontalScrollPosition > 0) {
																	int i_74_ = Class120_Sub12_Sub22.redrawRate * (-i_66_ + i_73_ - i_70_) / 3;
																	if (10 * Class120_Sub12_Sub22.redrawRate < i_74_) {
																		i_74_ = Class120_Sub12_Sub22.redrawRate * 10;
																	}
																	if (class189_71_.horizontalScrollPosition < i_74_) {
																		i_74_ = class189_71_.horizontalScrollPosition;
																	}
																	Class27.anInt166 += i_74_;
																	class189_71_.horizontalScrollPosition -= i_74_;
																	InterfaceClickMask.redrawInterface(class189_71_);
																}
																if (i_72_ < i_66_ - (-i_70_ + -32) && class189_71_.horizontalScrollPosition < class189_71_.maxScrollVertical - class189_71_.anInt2059) {
																	int i_75_ = (32 + i_66_ - (-i_70_ + i_72_)) * Class120_Sub12_Sub22.redrawRate / 3;
																	if (i_75_ > Class120_Sub12_Sub22.redrawRate * 10) {
																		i_75_ = 10 * Class120_Sub12_Sub22.redrawRate;
																	}
																	if (i_75_ > -class189_71_.horizontalScrollPosition + -class189_71_.anInt2059 + class189_71_.maxScrollVertical) {
																		i_75_ = -class189_71_.horizontalScrollPosition + -class189_71_.anInt2059 + class189_71_.maxScrollVertical;
																	}
																	class189_71_.horizontalScrollPosition += i_75_;
																	Class27.anInt166 -= i_75_;
																	InterfaceClickMask.redrawInterface(class189_71_);
																}
															}
														} else if (jagexInterface == Class32.aClass189_256 && i_63_ == Class126.anInt1204) {
															class120_sub14_sub19.method1594(i_67_, i_66_, 128);
														} else {
															class120_sub14_sub19.method1587(i_67_, i_66_);
														}
													} else {
														InterfaceClickMask.redrawInterface(jagexInterface);
													}
												}
											} else if (jagexInterface.spriteIDs != null && i_63_ < 20) {
												final AbstractSprite class120_sub14_sub19 = jagexInterface.method2487((byte) 121, i_63_);
												if (class120_sub14_sub19 == null) {
													if (Class88.aBoolean835) {
														InterfaceClickMask.redrawInterface(jagexInterface);
													}
												} else {
													class120_sub14_sub19.method1587(i_67_, i_66_);
												}
											}
											i_63_++;
										}
									}
								} else if (jagexInterface.type == 3) {
									int i_76_;
									if (!Class120_Sub12_Sub35.method1382(jagexInterface, (byte) -121)) {
										i_76_ = jagexInterface.disabledColor;
										if (CursorType.aClass189_1243 == jagexInterface && jagexInterface.disabledMouseOverColor != 0) {
											i_76_ = jagexInterface.disabledMouseOverColor;
										}
									} else {
										i_76_ = jagexInterface.enabledColor;
										if (CursorType.aClass189_1243 == jagexInterface && jagexInterface.enabledMouseOverColor != 0) {
											i_76_ = jagexInterface.enabledMouseOverColor;
										}
									}
									if (i_30_ == 0) {
										if (!jagexInterface.filled) {
											if (!HDToolkit.glEnabled) {
												GraphicsLD.drawRect(i_32_, i_31_, jagexInterface.anInt1948, jagexInterface.anInt2059, i_76_);
											} else {
												GraphicsHD.drawRect(i_32_, i_31_, jagexInterface.anInt1948, jagexInterface.anInt2059, i_76_);
											}
										} else if (!HDToolkit.glEnabled) {
											GraphicsLD.fillRect(i_32_, i_31_, jagexInterface.anInt1948, jagexInterface.anInt2059, i_76_);
										} else {
											GraphicsHD.fillRect(i_32_, i_31_, jagexInterface.anInt1948, jagexInterface.anInt2059, i_76_);
										}
									} else if (jagexInterface.filled) {
										if (HDToolkit.glEnabled) {
											GraphicsHD.fillRect(i_32_, i_31_, jagexInterface.anInt1948, jagexInterface.anInt2059, i_76_, 256 - (i_30_ & 0xff));
										} else {
											GraphicsLD.fillRect(i_32_, i_31_, jagexInterface.anInt1948, jagexInterface.anInt2059, i_76_, 256 - (0xff & i_30_));
										}
									} else if (!HDToolkit.glEnabled) {
										GraphicsLD.drawRect(i_32_, i_31_, jagexInterface.anInt1948, jagexInterface.anInt2059, i_76_, 256 - (0xff & i_30_));
									} else {
										GraphicsHD.drawRect(i_32_, i_31_, jagexInterface.anInt1948, jagexInterface.anInt2059, i_76_, 256 - (i_30_ & 0xff));
									}
								} else if (jagexInterface.type == 4) {
									final Class120_Sub14_Sub8 class120_sub14_sub8 = jagexInterface.method2497((byte) 54, Class82.aClass107Array785);
									if (class120_sub14_sub8 == null) {
										if (Class88.aBoolean835) {
											InterfaceClickMask.redrawInterface(jagexInterface);
										}
									} else {
										String string = jagexInterface.disabledText;
										int i_77_;
										if (!Class120_Sub12_Sub35.method1382(jagexInterface, (byte) -105)) {
											i_77_ = jagexInterface.disabledColor;
											if (jagexInterface == CursorType.aClass189_1243 && jagexInterface.disabledMouseOverColor != 0) {
												i_77_ = jagexInterface.disabledMouseOverColor;
											}
										} else {
											i_77_ = jagexInterface.enabledColor;
											if (jagexInterface == CursorType.aClass189_1243 && jagexInterface.enabledMouseOverColor != 0) {
												i_77_ = jagexInterface.enabledMouseOverColor;
											}
											if (jagexInterface.enabledText.length() > 0) {
												string = jagexInterface.enabledText;
											}
										}
										if (jagexInterface.aBoolean2041 && jagexInterface.anInt2030 != -1) {
											final ObjType objType = ObjType.list(jagexInterface.anInt2030);
											string = objType.name;
											if (string == null) {
												string = "null";
											}
											if ((objType.stackable == 1 || jagexInterface.anInt2075 != 1) && (jagexInterface.anInt2075 ^ 0xffffffff) != 0) {
												string = new StringBuilder("<col=ff9040>").append(string).append("</col> x").append(Node.method1033((byte) 126, jagexInterface.anInt2075)).toString();
											}
										}
										if (Class156.aClass189_1454 == jagexInterface) {
											string = Class71.aString626;
											i_77_ = jagexInterface.disabledColor;
										}
										if (!jagexInterface.aBoolean2041) {
											string = DummyInputStream.method71(jagexInterface, 2, string);
										}
										class120_sub14_sub8.method1462(string, i_32_, i_31_, jagexInterface.anInt1948, jagexInterface.anInt2059, i_77_, !jagexInterface.shaded ? -1 : 0, jagexInterface.horizontalAlignment, jagexInterface.verticalAlignment, jagexInterface.verticalSpacing);
									}
								} else if (jagexInterface.type == 5) {
									if (!jagexInterface.aBoolean2041) {
										final AbstractSprite class120_sub14_sub19 = jagexInterface.method2492(Class120_Sub12_Sub35.method1382(jagexInterface, (byte) -115));
										if (class120_sub14_sub19 == null) {
											if (Class88.aBoolean835) {
												InterfaceClickMask.redrawInterface(jagexInterface);
											}
										} else {
											class120_sub14_sub19.method1587(i_32_, i_31_);
										}
									} else if (jagexInterface.anInt2088 < 0) {
										AbstractSprite class120_sub14_sub19;
										if (jagexInterface.anInt2030 == -1) {
											class120_sub14_sub19 = jagexInterface.method2492(false);
										} else if (jagexInterface.aBoolean2097 && Class100.selfPlayer.appearance != null) {
											class120_sub14_sub19 = Class187.method2477(jagexInterface.anInt2075, jagexInterface.outline, jagexInterface.aBoolean1956, (byte) -63, Class100.selfPlayer.appearance, jagexInterface.anInt2030, jagexInterface.shadow);
										} else {
											class120_sub14_sub19 = Class187.method2477(jagexInterface.anInt2075, jagexInterface.outline, jagexInterface.aBoolean1956, (byte) -115, null, jagexInterface.anInt2030, jagexInterface.shadow);
										}
										if (class120_sub14_sub19 != null) {
											final int i_78_ = class120_sub14_sub19.trimWidth;
											final int i_79_ = class120_sub14_sub19.trimHeight;
											if (jagexInterface.aBoolean2001) {
												final int i_80_ = (i_78_ + -1 + jagexInterface.anInt1948) / i_78_;
												final int i_81_ = (jagexInterface.anInt2059 - (1 + -i_79_)) / i_79_;
												if (HDToolkit.glEnabled) {
													GraphicsHD.method591(i_32_, i_31_, i_32_ + jagexInterface.anInt1948, i_31_ - -jagexInterface.anInt2059);
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
													GraphicsHD.clipRect(i_27_, i_25_, i_24_, i_23_);
												} else {
													GraphicsLD.method2166(i_32_, i_31_, jagexInterface.anInt1948 + i_32_, i_31_ + jagexInterface.anInt2059);
													for (int i_87_ = 0; i_80_ > i_87_; i_87_++) {
														for (int i_88_ = 0; i_88_ < i_81_; i_88_++) {
															if (jagexInterface.rotation != 0) {
																class120_sub14_sub19.method1590(i_31_ - -(i_88_ * i_79_) + i_79_ / 2, (byte) -99, jagexInterface.rotation, i_87_ * i_78_ + i_32_ - -(i_78_ / 2), 4096);
															} else if (i_30_ == 0) {
																class120_sub14_sub19.method1587(i_32_ - -(i_87_ * i_78_), i_31_ + i_88_ * i_79_);
															} else {
																class120_sub14_sub19.method1594(i_87_ * i_78_ + i_32_, i_79_ * i_88_ + i_31_, 256 - (i_30_ & 0xff));
															}
														}
													}
													GraphicsLD.clipRect(i_27_, i_25_, i_24_, i_23_);
												}
											} else {
												final int i_89_ = jagexInterface.anInt1948 * 4096 / i_78_;
												if (jagexInterface.rotation != 0) {
													class120_sub14_sub19.method1590(i_31_ + jagexInterface.anInt2059 / 2, (byte) -99, jagexInterface.rotation, jagexInterface.anInt1948 / 2 + i_32_, i_89_);
												} else if (i_30_ != 0) {
													class120_sub14_sub19.method1585(i_32_, i_31_, jagexInterface.anInt1948, jagexInterface.anInt2059, -(i_30_ & 0xff) + 256);
												} else if (jagexInterface.anInt1948 != i_78_ || i_79_ != jagexInterface.anInt2059) {
													class120_sub14_sub19.method1588(i_32_, i_31_, jagexInterface.anInt1948, jagexInterface.anInt2059);
												} else {
													class120_sub14_sub19.method1587(i_32_, i_31_);
												}
											}
										} else if (Class88.aBoolean835) {
											InterfaceClickMask.redrawInterface(jagexInterface);
										}
									} else {
										final Class41 class41 = jagexInterface.method2489(0);
										if (!HDToolkit.glEnabled) {
											class41.method330(0, i_32_, i_31_, jagexInterface.anInt1948, jagexInterface.anInt2059, jagexInterface.anInt2078, jagexInterface.anInt2004, 0);
										} else {
											class41.method331(0, i_32_, i_31_, jagexInterface.anInt1948, jagexInterface.anInt2059, jagexInterface.anInt2078, jagexInterface.anInt2004, 0);
										}
									}
								} else if (jagexInterface.type == 6) {
									final boolean bool = Class120_Sub12_Sub35.method1382(jagexInterface, (byte) -90);
									Class180_Sub7 class180_sub7 = null;
									int i_90_;
									if (bool) {
										i_90_ = jagexInterface.enabledAnim;
									} else {
										i_90_ = jagexInterface.disabledAnim;
									}
									int i_91_ = 0;
									if (jagexInterface.anInt2030 != -1) {
										ObjType objType = ObjType.list(jagexInterface.anInt2030);
										if (objType != null) {
											objType = objType.method2106(jagexInterface.anInt2075);
											final SeqType seqType = i_90_ != -1 ? SeqType.list(i_90_) : null;
											if (jagexInterface.aBoolean2097 && Class100.selfPlayer.appearance != null) {
												class180_sub7 = objType.method2105(jagexInterface.currentFrame, 1, jagexInterface.nextFrame, Class100.selfPlayer.appearance, seqType, jagexInterface.frameDelay);
											} else {
												class180_sub7 = objType.method2105(jagexInterface.currentFrame, 1, jagexInterface.nextFrame, null, seqType, jagexInterface.frameDelay);
											}
											if (class180_sub7 == null) {
												InterfaceClickMask.redrawInterface(jagexInterface);
											} else {
												i_91_ = -class180_sub7.getMaxY() / 2;
											}
										}
									} else if (jagexInterface.modelTypeDisabled != 5) {
										if ((i_90_ ^ 0xffffffff) != 0) {
											final SeqType seqType = SeqType.list(i_90_);
											class180_sub7 = jagexInterface.method2486(seqType, Class100.selfPlayer.appearance, jagexInterface.nextFrame, jagexInterface.currentFrame, jagexInterface.frameDelay, bool);
											if (class180_sub7 == null && Class88.aBoolean835) {
												InterfaceClickMask.redrawInterface(jagexInterface);
											}
										} else {
											class180_sub7 = jagexInterface.method2486(null, Class100.selfPlayer.appearance, -1, -1, 0, bool);
											if (class180_sub7 == null && Class88.aBoolean835) {
												InterfaceClickMask.redrawInterface(jagexInterface);
											}
										}
									} else if ((jagexInterface.mediaIdDisabled ^ 0xffffffff) != 0) {
										int i_92_ = jagexInterface.mediaIdDisabled & 0x7ff;
										if (Class167.anInt1616 == i_92_) {
											i_92_ = 2047;
										}
										final Player class180_sub5_sub1 = Class118.playersList[i_92_];
										final SeqType seqType = (i_90_ ^ 0xffffffff) == 0 ? null : SeqType.list(i_90_);
										if (class180_sub5_sub1 != null && (int) Class70.stringToLong(class180_sub5_sub1.name) << 11 == (~0x7ff & jagexInterface.mediaIdDisabled)) {
											class180_sub7 = class180_sub5_sub1.appearance.method2040(null, 0, -1, -1, null, jagexInterface.currentFrame, -7453, false, 0, seqType, true, 0);
										}
									} else {
										class180_sub7 = Class26.aClass144_159.method2040(null, -1, -1, -1, null, -1, -7453, false, 0, null, true, 0);
									}
									if (class180_sub7 != null) {
										int i_93_;
										if (jagexInterface.anInt2069 <= 0) {
											i_93_ = 256;
										} else {
											i_93_ = (jagexInterface.anInt1948 << 8) / jagexInterface.anInt2069;
										}
										int i_94_;
										if (jagexInterface.anInt2007 <= 0) {
											i_94_ = 256;
										} else {
											i_94_ = (jagexInterface.anInt2059 << 8) / jagexInterface.anInt2007;
										}
										final int i_95_ = i_31_ - -(jagexInterface.anInt2059 / 2) - -(jagexInterface.translateY * i_94_ >> 8);
										final int i_96_ = (jagexInterface.translateX * i_93_ >> 8) + jagexInterface.anInt1948 / 2 + i_32_;
										if (!HDToolkit.glEnabled) {
											Rasterizer.method869(i_96_, i_95_);
											final int i_97_ = jagexInterface.zoom * Rasterizer.cosineTable[jagexInterface.rotateX] >> 16;
											final int i_98_ = Rasterizer.sineTable[jagexInterface.rotateX] * jagexInterface.zoom >> 16;
											if (jagexInterface.aBoolean2041) {
												if (jagexInterface.aBoolean2046) {
													((Class180_Sub7_Sub1) class180_sub7).method2400(0, jagexInterface.rotateY, jagexInterface.rotateZ, jagexInterface.rotateX, jagexInterface.anInt2076, i_98_ - -i_91_ - -jagexInterface.anInt1977, i_97_ + jagexInterface.anInt1977, jagexInterface.zoom);
												} else {
													class180_sub7.method2367(0, jagexInterface.rotateY, jagexInterface.rotateZ, jagexInterface.rotateX, jagexInterface.anInt2076, i_91_ + i_98_ - -jagexInterface.anInt1977, i_97_ - -jagexInterface.anInt1977, -1L);
												}
											} else {
												class180_sub7.method2367(0, jagexInterface.rotateY, 0, jagexInterface.rotateX, 0, i_98_, i_97_, -1L);
											}
											Rasterizer.method868();
										} else {
											if (!jagexInterface.aBoolean2046) {
												HDToolkit.method513(i_96_, i_95_, i_93_, i_94_);
												HDToolkit.method535(jagexInterface.aShort2065, 1.5F * jagexInterface.aShort2093);
											} else {
												HDToolkit.method512(i_96_, i_95_, jagexInterface.zoom, jagexInterface.aShort2093, i_93_, i_94_);
											}
											HDToolkit.method532();
											HDToolkit.method502(true);
											HDToolkit.method507(false);
											Class99.method822(Class120_Sub14_Sub14_Sub1.brightness, -78);
											if (Class167.aBoolean1620) {
												GraphicsHD.method597();
												HDToolkit.method517();
												GraphicsHD.clipRect(i_27_, i_25_, i_24_, i_23_);
												Class167.aBoolean1620 = false;
											}
											if (jagexInterface.aBoolean2003) {
												HDToolkit.method503();
											}
											final int i_99_ = Rasterizer.cosineTable[jagexInterface.rotateX] * jagexInterface.zoom >> 16;
											final int i_100_ = jagexInterface.zoom * Rasterizer.sineTable[jagexInterface.rotateX] >> 16;
											if (jagexInterface.aBoolean2041) {
												class180_sub7.method2367(0, jagexInterface.rotateY, jagexInterface.rotateZ, jagexInterface.rotateX, jagexInterface.anInt2076, jagexInterface.anInt1977 + i_91_ + i_100_, i_99_ + jagexInterface.anInt1977, -1L);
											} else {
												class180_sub7.method2367(0, jagexInterface.rotateY, 0, jagexInterface.rotateX, 0, i_100_, i_99_, -1L);
											}
											if (jagexInterface.aBoolean2003) {
												HDToolkit.method505();
											}
										}
									}
								} else {
									if (jagexInterface.type == 7) {
										final Class120_Sub14_Sub8 class120_sub14_sub8 = jagexInterface.method2497((byte) 54, Class82.aClass107Array785);
										if (class120_sub14_sub8 == null) {
											if (Class88.aBoolean835) {
												InterfaceClickMask.redrawInterface(jagexInterface);
											}
											continue;
										}
										int i_101_ = 0;
										for (int i_102_ = 0; i_102_ < jagexInterface.originalHeight; i_102_++) {
											for (int i_103_ = 0; jagexInterface.originalWidth > i_103_; i_103_++) {
												if (jagexInterface.objAmounts[i_101_] > 0) {
													final ObjType objType = ObjType.list(jagexInterface.objAmounts[i_101_] + -1);
													String string;
													if (objType.stackable != 1 && jagexInterface.objIds[i_101_] == 1) {
														string = new StringBuilder("<col=ff9040>").append(objType.name).append("</col>").toString();
													} else {
														string = new StringBuilder("<col=ff9040>").append(objType.name).append("</col> x").append(Node.method1033((byte) 126, jagexInterface.objIds[i_101_])).toString();
													}
													final int i_104_ = i_32_ + i_103_ * (115 + jagexInterface.objSpritePadX);
													final int i_105_ = (jagexInterface.objSpritePadY + 12) * i_102_ + i_31_;
													if (jagexInterface.horizontalAlignment == 0) {
														class120_sub14_sub8.method1466(string, i_104_, i_105_, jagexInterface.disabledColor, !jagexInterface.shaded ? -1 : 0);
													} else if (jagexInterface.horizontalAlignment == 1) {
														class120_sub14_sub8.method1478(string, i_104_ + 57, i_105_, jagexInterface.disabledColor, !jagexInterface.shaded ? -1 : 0);
													} else {
														class120_sub14_sub8.method1482(string, i_104_ + 114, i_105_, jagexInterface.disabledColor, !jagexInterface.shaded ? -1 : 0);
													}
												}
												i_101_++;
											}
										}
									}
									if (jagexInterface.type == 8 && Class49.aClass189_441 == jagexInterface && Class108.anInt1031 == Class120_Sub12_Sub21.anInt3291) {
										int i_106_ = 0;
										final Class120_Sub14_Sub8 class120_sub14_sub8 = Class120_Sub12_Sub20.aClass120_Sub14_Sub8_3286;
										int i_107_ = 0;
										String string = jagexInterface.disabledText;
										string = DummyInputStream.method71(jagexInterface, 2, string);
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
										int i_111_ = i_31_ + jagexInterface.anInt2059 + 5;
										if (i_23_ < i_107_ + i_111_) {
											i_111_ = -i_107_ + i_23_;
										}
										int i_112_ = i_32_ + jagexInterface.anInt1948 - (5 + i_106_);
										if (i_112_ < i_32_ + 5) {
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
										string = jagexInterface.disabledText;
										string = DummyInputStream.method71(jagexInterface, 2, string);
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
									if (jagexInterface.type == 9) {
										int i_116_;
										int i_117_;
										int i_118_;
										int i_119_;
										if (jagexInterface.aBoolean1989) {
											i_117_ = jagexInterface.anInt1948 + i_32_;
											i_116_ = i_32_;
											i_118_ = i_31_;
											i_119_ = jagexInterface.anInt2059 + i_31_;
										} else {
											i_116_ = i_32_;
											i_117_ = i_32_ + jagexInterface.anInt1948;
											i_118_ = i_31_ + jagexInterface.anInt2059;
											i_119_ = i_31_;
										}
										if (jagexInterface.thickness == 1) {
											if (HDToolkit.glEnabled) {
												GraphicsHD.method582(i_116_, i_119_, i_117_, i_118_, jagexInterface.disabledColor);
											} else {
												GraphicsLD.method2150(i_116_, i_119_, i_117_, i_118_, jagexInterface.disabledColor);
											}
										} else if (HDToolkit.glEnabled) {
											GraphicsHD.method586(i_116_, i_119_, i_117_, i_118_, jagexInterface.disabledColor, jagexInterface.thickness);
										} else {
											GraphicsLD.method2161(i_116_, i_119_, i_117_, i_118_, jagexInterface.disabledColor, jagexInterface.thickness);
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

	static final void method2009(final int i) {
		try {
			if (i != 255) {
				anInt1361 = 57;
			}
			SceneGroundObject.aClass21_2841.clear();
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
			Class107_Sub1 class107_sub1_122_ = (Class107_Sub1) Class132.aClass21_1255.get(i_121_ << 16 | this.anInt1363 | (!bool ? 0 : 262144));
			if (class107_sub1_122_ != null) {
				return class107_sub1_122_;
			}
			Class120_Sub14_Sub22.aClass50_3640.method429(this.anInt1363);
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
				Class132.aClass21_1255.put(class107_sub1_122_, this.anInt1363 | i_121_ << 16 | (!bool ? 0 : 262144));
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
