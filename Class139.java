/* Class139 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import javax.media.opengl.GL;

final class Class139 {
	private short[] aShortArray1327;
	private short[] aShortArray1328;
	private short[] aShortArray1329;
	static int anInt1330;
	boolean aBoolean1331 = false;
	private short[] aShortArray1332;
	private int[] anIntArray1333;
	static int anInt1334 = 100;
	private final int[] anIntArray1335 = { -1, -1, -1, -1, -1 };
	int anInt1336 = -1;
	static Class191[][] aClass191ArrayArray1337;

	public static void method1983(final int i) {
		try {
			aClass191ArrayArray1337 = null;
			if (i != 0) {
				method1984(null, -107, -88, -101);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("qa.A(").append(i).append(')').toString());
		}
	}

	static final void method1984(final Player class180_sub5_sub1, final int i_0_, final int i_1_, final int i_2_) {
		if (Class100.selfPlayer != class180_sub5_sub1 && Class186.menuOptionCount < 400) {
			String string;
			if (class180_sub5_sub1.anInt3737 == 0) {
				boolean bool = true;
				if ((Class100.selfPlayer.anInt3738 ^ 0xffffffff) != 0 && (class180_sub5_sub1.anInt3738 ^ 0xffffffff) != 0) {
					final int i_3_ = class180_sub5_sub1.anInt3747 >= Class100.selfPlayer.anInt3747 ? class180_sub5_sub1.anInt3747 : Class100.selfPlayer.anInt3747;
					final int i_4_ = Class100.selfPlayer.anInt3738 >= class180_sub5_sub1.anInt3738 ? class180_sub5_sub1.anInt3738 : Class100.selfPlayer.anInt3738;
					final int i_5_ = 10 * i_3_ / 100 + 5 - -i_4_;
					int i_6_ = -class180_sub5_sub1.anInt3747 + Class100.selfPlayer.anInt3747;
					if (i_6_ < 0) {
						i_6_ = -i_6_;
					}
					if (i_5_ < i_6_) {
						bool = false;
					}
				}
				final String string_7_ = Buffer.gameId != 1 ? Class120_Sub12_Sub21_Sub1.aString3911 : Class120_Sub3.aString2424;
				if (class180_sub5_sub1.anInt3733 <= class180_sub5_sub1.anInt3747) {
					string = new StringBuilder(class180_sub5_sub1.getTitledName()).append(!bool ? "<col=ffffff>" : Class81.method704(Class100.selfPlayer.anInt3747, (byte) -109, class180_sub5_sub1.anInt3747)).append(" (").append(string_7_).append(class180_sub5_sub1.anInt3747).append(")").toString();
				} else {
					string = new StringBuilder(class180_sub5_sub1.getTitledName()).append(bool ? Class81.method704(Class100.selfPlayer.anInt3747, (byte) -109, class180_sub5_sub1.anInt3747) : "<col=ffffff>").append(" (").append(string_7_).append(class180_sub5_sub1.anInt3747).append("+").append(-class180_sub5_sub1.anInt3747 + class180_sub5_sub1.anInt3733).append(")").toString();
				}
			} else {
				string = new StringBuilder(class180_sub5_sub1.getTitledName()).append(" (").append(Class174.aString1733).append(class180_sub5_sub1.anInt3737).append(")").toString();
			}
			if (Light.objSelected == 1) {
				Class120_Sub14_Sub6.addMenuOption(i_1_, i_2_, i_0_, new StringBuilder(Class192.selectedObjName).append(" -> <col=ffffff>").append(string).toString(), AbstractGraphicsBuffer.aString1176, (short) 21, Class120_Sub12_Sub10.anInt3205);
			} else if (Class88.aBoolean828) {
				if ((0x8 & GroundTile.anInt2652) != 0) {
						Class120_Sub14_Sub6.addMenuOption(i_1_, i_2_, i_0_, new StringBuilder(Light.aString369).append(" -> <col=ffffff>").append(string).toString(), Class101.aString963, (short) 5, Class150.anInt1417);
					}
				} else {
					for (int i_8_ = 7; i_8_ >= 0; i_8_--) {
						if (Buffer.playerOptions[i_8_] != null) {
							short i_9_ = 0;
							if (Buffer.gameId == 0 && Buffer.playerOptions[i_8_].equalsIgnoreCase(Class65.aString591)) {
								if (Class100.selfPlayer.anInt3747 < class180_sub5_sub1.anInt3747) {
									i_9_ = (short) 2000;
								}
								if (Class100.selfPlayer.anInt3744 != 0 && class180_sub5_sub1.anInt3744 != 0) {
									if (class180_sub5_sub1.anInt3744 == Class100.selfPlayer.anInt3744) {
										i_9_ = (short) 2000;
									} else {
										i_9_ = (short) 0;
									}
								}
							} else if (Class120_Sub10.playerOptionsOnTop[i_8_]) {
								i_9_ = (short) 2000;
							}
							short i_10_ = JagexInterface.aShortArray2042[i_8_];
							i_10_ += i_9_;
							Class120_Sub14_Sub6.addMenuOption(i_1_, i_2_, i_0_, new StringBuilder("<col=ffffff>").append(string).toString(), Buffer.playerOptions[i_8_], i_10_, Class120_Sub14_Sub14.playerOptionsIcon[i_8_]);
						}
					}
				}
				for (int i_11_ = 0; Class186.menuOptionCount > i_11_; i_11_++) {
					if (Class120_Sub29.aShortArray2777[i_11_] == 26) {
						Class120_Sub12_Sub29.aStringArray3369[i_11_] = new StringBuilder("<col=ffffff>").append(string).toString();
						break;
					}
				}
			}
	}

	final Class180_Sub2 method1985() {
		final Class180_Sub2[] class180_sub2s = new Class180_Sub2[5];
		int i_12_ = 0;
		for (int i_13_ = 0; i_13_ < 5; i_13_++) {
			if ((anIntArray1335[i_13_] ^ 0xffffffff) != 0) {
				class180_sub2s[i_12_++] = Class180_Sub2.method2291(SceneGroundObject.aClass50_2839, anIntArray1335[i_13_], 0);
			}
		}
		final Class180_Sub2 class180_sub2_14_ = new Class180_Sub2(class180_sub2s, i_12_);
		if (aShortArray1327 != null) {
			for (int i_15_ = 0; aShortArray1327.length > i_15_; i_15_++) {
				class180_sub2_14_.method2307(aShortArray1327[i_15_], aShortArray1328[i_15_]);
			}
		}
		if (aShortArray1329 != null) {
			for (int i_16_ = 0; i_16_ < aShortArray1329.length; i_16_++) {
				class180_sub2_14_.method2292(aShortArray1329[i_16_], aShortArray1332[i_16_]);
			}
		}
		return class180_sub2_14_;
	}

	final Class180_Sub2 method1986(final byte i) {
		Class180_Sub2 class180_sub2;
		try {
			if (anIntArray1333 == null) {
				return null;
			}
			final Class180_Sub2[] class180_sub2s = new Class180_Sub2[anIntArray1333.length];
			if (i < 85) {
				method1987(-112, null, true);
			}
			for (int i_17_ = 0; anIntArray1333.length > i_17_; i_17_++) {
				class180_sub2s[i_17_] = Class180_Sub2.method2291(SceneGroundObject.aClass50_2839, anIntArray1333[i_17_], 0);
			}
			Class180_Sub2 class180_sub2_18_;
			if (class180_sub2s.length != 1) {
				class180_sub2_18_ = new Class180_Sub2(class180_sub2s, class180_sub2s.length);
			} else {
				class180_sub2_18_ = class180_sub2s[0];
			}
			if (aShortArray1327 != null) {
				for (int i_19_ = 0; aShortArray1327.length > i_19_; i_19_++) {
					class180_sub2_18_.method2307(aShortArray1327[i_19_], aShortArray1328[i_19_]);
				}
			}
			if (aShortArray1329 != null) {
				for (int i_20_ = 0; aShortArray1329.length > i_20_; i_20_++) {
					class180_sub2_18_.method2292(aShortArray1329[i_20_], aShortArray1332[i_20_]);
				}
			}
			class180_sub2 = class180_sub2_18_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("qa.B(").append(i).append(')').toString());
		}
		return class180_sub2;
	}

	private final void method1987(final int i, final Buffer class120_sub7, final boolean bool) {
		try {
			if (!bool) {
				method1989(null, false);
			}
			if (i != 1) {
				if (i == 2) {
					final int i_21_ = class120_sub7.getUByte();
					anIntArray1333 = new int[i_21_];
					for (int i_22_ = 0; i_22_ < i_21_; i_22_++) {
						anIntArray1333[i_22_] = class120_sub7.getUShort();
					}
				} else if (i != 3) {
					if (i == 40) {
						final int i_23_ = class120_sub7.getUByte();
						aShortArray1328 = new short[i_23_];
						aShortArray1327 = new short[i_23_];
						for (int i_24_ = 0; i_23_ > i_24_; i_24_++) {
							aShortArray1327[i_24_] = (short) class120_sub7.getUShort();
							aShortArray1328[i_24_] = (short) class120_sub7.getUShort();
						}
					} else if (i != 41) {
						if (i >= 60 && i < 70) {
							anIntArray1335[i - 60] = class120_sub7.getUShort();
						}
					} else {
						final int i_25_ = class120_sub7.getUByte();
						aShortArray1332 = new short[i_25_];
						aShortArray1329 = new short[i_25_];
						for (int i_26_ = 0; i_26_ < i_25_; i_26_++) {
							aShortArray1329[i_26_] = (short) class120_sub7.getUShort();
							aShortArray1332[i_26_] = (short) class120_sub7.getUShort();
						}
					}
				} else {
					this.aBoolean1331 = true;
				}
			} else {
				this.anInt1336 = class120_sub7.getUByte();
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("qa.J(").append(i).append(',').append(class120_sub7 != null ? "{...}" : "null").append(',').append(bool).append(')').toString());
		}
	}

	static final byte[] method1988(final int i, final boolean bool, final Object object) {
		try {
			if (i != 19138) {
				return null;
			}
			if (object == null) {
				return null;
			}
			if (object instanceof byte[]) {
				final byte[] is = (byte[]) object;
				if (bool) {
					return ObjectPile.method2448(is, -98);
				}
				return is;
			}
			if (object instanceof Class66) {
				final Class66 class66 = (Class66) object;
				return class66.method580(-9747);
			}
			throw new IllegalArgumentException();
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("qa.C(").append(i).append(',').append(bool).append(',').append(object != null ? "{...}" : "null").append(')').toString());
		}
	}

	static final void method1989(final GroundTile class120_sub18, boolean bool) {
		AbstractTimer.aClass105_824.addLast(class120_sub18);
		for (;;) {
			final GroundTile class120_sub18_27_ = (GroundTile) AbstractTimer.aClass105_824.removeFront();
			if (class120_sub18_27_ == null) {
				break;
			}
			if (class120_sub18_27_.aBoolean2624) {
				final int i = class120_sub18_27_.anInt2632;
				final int i_28_ = class120_sub18_27_.anInt2629;
				final int i_29_ = class120_sub18_27_.anInt2636;
				final int i_30_ = class120_sub18_27_.anInt2642;
				final GroundTile[][] class120_sub18s = Class120_Sub1.groundTiles[i_29_];
				float f = 0.0F;
				if (HDToolkit.glEnabled) {
					if (Class24.anIntArrayArrayArray140 == OverridedJInterface.anIntArrayArrayArray2741) {
						final int i_31_ = Class35.anIntArrayArray300[i][i_28_];
						final int i_32_ = i_31_ & 0xffffff;
						if (i_32_ != Class120_Sub12_Sub19.anInt3281) {
							Class120_Sub12_Sub19.anInt3281 = i_32_;
							Class69.method614(i_32_, 65535);
							Class117.method1011(Class29.method251(125));
						}
						final int i_33_ = i_31_ >>> 24 << 3;
						if (i_33_ != Class120_Sub14_Sub18.anInt3612) {
							Class120_Sub14_Sub18.anInt3612 = i_33_;
							Canvas_Sub1.method64(3, i_33_);
						}
						final int i_34_ = Class120_Sub12_Sub33.anIntArrayArrayArray3388[0][i][i_28_] + Class120_Sub12_Sub33.anIntArrayArrayArray3388[0][i + 1][i_28_] + Class120_Sub12_Sub33.anIntArrayArrayArray3388[0][i][i_28_ + 1] + Class120_Sub12_Sub33.anIntArrayArrayArray3388[0][i + 1][i_28_ + 1] >> 2;
						Class120_Sub14_Sub13.method1532(3, -i_34_);
						f = 201.5F;
						HDToolkit.method527(f);
					} else {
						f = 201.5F - 50.0F * (i_30_ + 1);
						HDToolkit.method527(f);
					}
				}
				if (class120_sub18_27_.aBoolean2647) {
					if (bool) {
						if (i_29_ > 0) {
							final GroundTile class120_sub18_35_ = Class120_Sub1.groundTiles[i_29_ - 1][i][i_28_];
							if (class120_sub18_35_ != null && class120_sub18_35_.aBoolean2624) {
								continue;
							}
						}
						if (i <= Class120_Sub12_Sub26.anInt3332 && i > Class160.anInt1493) {
							final GroundTile class120_sub18_36_ = class120_sub18s[i - 1][i_28_];
							if (class120_sub18_36_ != null && class120_sub18_36_.aBoolean2624 && (class120_sub18_36_.aBoolean2647 || (class120_sub18_27_.anInt2635 & 0x1) == 0)) {
								continue;
							}
						}
						if (i >= Class120_Sub12_Sub26.anInt3332 && i < Class53.anInt487 - 1) {
							final GroundTile class120_sub18_37_ = class120_sub18s[i + 1][i_28_];
							if (class120_sub18_37_ != null && class120_sub18_37_.aBoolean2624 && (class120_sub18_37_.aBoolean2647 || (class120_sub18_27_.anInt2635 & 0x4) == 0)) {
								continue;
							}
						}
						if (i_28_ <= Class112.anInt1080 && i_28_ > Class31.anInt248) {
							final GroundTile class120_sub18_38_ = class120_sub18s[i][i_28_ - 1];
							if (class120_sub18_38_ != null && class120_sub18_38_.aBoolean2624 && (class120_sub18_38_.aBoolean2647 || (class120_sub18_27_.anInt2635 & 0x8) == 0)) {
								continue;
							}
						}
						if (i_28_ >= Class112.anInt1080 && i_28_ < Class45.anInt396 - 1) {
							final GroundTile class120_sub18_39_ = class120_sub18s[i][i_28_ + 1];
							if (class120_sub18_39_ != null && class120_sub18_39_.aBoolean2624 && (class120_sub18_39_.aBoolean2647 || (class120_sub18_27_.anInt2635 & 0x2) == 0)) {
								continue;
							}
						}
					} else {
						bool = true;
					}
					class120_sub18_27_.aBoolean2647 = false;
					if (class120_sub18_27_.aClass120_Sub18_2644 != null) {
						final GroundTile class120_sub18_40_ = class120_sub18_27_.aClass120_Sub18_2644;
						if (HDToolkit.glEnabled) {
							HDToolkit.method527(201.5F - 50.0F * (class120_sub18_40_.anInt2642 + 1));
						}
						if (class120_sub18_40_.aClass141_2626 != null) {
							if (!Class69_Sub1.method618(0, i, i_28_)) {
								Class132_Sub2.method1942(class120_sub18_40_.aClass141_2626, 0, Class69_Sub2.anInt2239, Class120_Sub17.anInt2616, Class120_Sub12_Sub30.anInt3377, Class73.anInt637, i, i_28_, false);
							} else {
								Class132_Sub2.method1942(class120_sub18_40_.aClass141_2626, 0, Class69_Sub2.anInt2239, Class120_Sub17.anInt2616, Class120_Sub12_Sub30.anInt3377, Class73.anInt637, i, i_28_, true);
							}
						} else if (class120_sub18_40_.aClass168_2640 != null) {
							if (!Class69_Sub1.method618(0, i, i_28_)) {
								Class157.method2088(class120_sub18_40_.aClass168_2640, Class69_Sub2.anInt2239, Class120_Sub17.anInt2616, Class120_Sub12_Sub30.anInt3377, Class73.anInt637, i, i_28_, false);
							} else {
								Class157.method2088(class120_sub18_40_.aClass168_2640, Class69_Sub2.anInt2239, Class120_Sub17.anInt2616, Class120_Sub12_Sub30.anInt3377, Class73.anInt637, i, i_28_, true);
							}
						}
						final Class182 class182 = class120_sub18_40_.aClass182_2628;
						if (class182 != null) {
							if (HDToolkit.glEnabled) {
								if ((class182.anInt1799 & class120_sub18_27_.anInt2646) != 0) {
									LightManager.method1866(class182.anInt1799, DisplayModeInfo.anInt1713, PlayerAppearance.anInt1367, Class145.anInt1381, i_30_, i, i_28_);
								} else {
									LightManager.method1861(DisplayModeInfo.anInt1713, PlayerAppearance.anInt1367, Class145.anInt1381, i_29_, i, i_28_);
								}
							}
							class182.aClass180_1800.method2265(0, Class69_Sub2.anInt2239, Class120_Sub17.anInt2616, Class120_Sub12_Sub30.anInt3377, Class73.anInt637, class182.anInt1797 - DisplayModeInfo.anInt1713, class182.anInt1801 - PlayerAppearance.anInt1367, class182.anInt1795 - Class145.anInt1381,
									class182.bitPacked, i_29_, null);
						}
						for (int i_41_ = 0; i_41_ < class120_sub18_40_.anInt2638; i_41_++) {
							final Class28 class28 = class120_sub18_40_.aClass28Array2625[i_41_];
							if (class28 != null) {
								if (HDToolkit.glEnabled) {
									LightManager.method1861(DisplayModeInfo.anInt1713, PlayerAppearance.anInt1367, Class145.anInt1381, i_29_, i, i_28_);
								}
								class28.aClass180_174.method2265(class28.anInt172, Class69_Sub2.anInt2239, Class120_Sub17.anInt2616, Class120_Sub12_Sub30.anInt3377, Class73.anInt637, class28.anInt178 - DisplayModeInfo.anInt1713, class28.anInt179 - PlayerAppearance.anInt1367, class28.anInt185 - Class145.anInt1381,
										class28.bitPacked, i_29_, null);
							}
						}
						if (HDToolkit.glEnabled) {
							HDToolkit.method527(f);
						}
					}
					boolean bool_42_ = false;
					if (class120_sub18_27_.aClass141_2626 != null) {
						if (!Class69_Sub1.method618(i_30_, i, i_28_)) {
							bool_42_ = true;
							if (class120_sub18_27_.aClass141_2626.anInt1351 != 12345678 || Class120_Sub12_Sub7.aBoolean3181 && i_29_ <= Class180_Sub4.anInt2933) {
								Class132_Sub2.method1942(class120_sub18_27_.aClass141_2626, i_30_, Class69_Sub2.anInt2239, Class120_Sub17.anInt2616, Class120_Sub12_Sub30.anInt3377, Class73.anInt637, i, i_28_, false);
							}
						} else {
							Class132_Sub2.method1942(class120_sub18_27_.aClass141_2626, i_30_, Class69_Sub2.anInt2239, Class120_Sub17.anInt2616, Class120_Sub12_Sub30.anInt3377, Class73.anInt637, i, i_28_, true);
						}
					} else if (class120_sub18_27_.aClass168_2640 != null) {
						if (!Class69_Sub1.method618(i_30_, i, i_28_)) {
							bool_42_ = true;
							Class157.method2088(class120_sub18_27_.aClass168_2640, Class69_Sub2.anInt2239, Class120_Sub17.anInt2616, Class120_Sub12_Sub30.anInt3377, Class73.anInt637, i, i_28_, false);
						} else {
							Class157.method2088(class120_sub18_27_.aClass168_2640, Class69_Sub2.anInt2239, Class120_Sub17.anInt2616, Class120_Sub12_Sub30.anInt3377, Class73.anInt637, i, i_28_, true);
						}
					}
					if (bool_42_) {
						final Class36 class36 = class120_sub18_27_.aClass36_2650;
						if (class36 != null && (class36.bitPacked & 0x80000000L) != 0L) {
							if (HDToolkit.glEnabled && class36.aBoolean314) {
								HDToolkit.method527(f + 50.0F - 1.5F);
							}
							if (HDToolkit.glEnabled) {
								LightManager.method1861(DisplayModeInfo.anInt1713, PlayerAppearance.anInt1367, Class145.anInt1381, i_29_, i, i_28_);
							}
							class36.aClass180_309.method2265(0, Class69_Sub2.anInt2239, Class120_Sub17.anInt2616, Class120_Sub12_Sub30.anInt3377, Class73.anInt637, class36.anInt311 - DisplayModeInfo.anInt1713, class36.anInt312 - PlayerAppearance.anInt1367, class36.anInt310 - Class145.anInt1381, class36.bitPacked,
									i_29_, null);
							if (HDToolkit.glEnabled && class36.aBoolean314) {
								HDToolkit.method527(f);
							}
						}
					}
					int i_43_ = 0;
					int i_44_ = 0;
					final Class182 class182 = class120_sub18_27_.aClass182_2628;
					final Class186 class186 = class120_sub18_27_.aClass186_2639;
					if (class182 != null || class186 != null) {
						if (Class120_Sub12_Sub26.anInt3332 == i) {
							i_43_++;
						} else if (Class120_Sub12_Sub26.anInt3332 < i) {
							i_43_ += 2;
						}
						if (Class112.anInt1080 == i_28_) {
							i_43_ += 3;
						} else if (Class112.anInt1080 > i_28_) {
							i_43_ += 6;
						}
						i_44_ = Class120_Sub15.anIntArray2591[i_43_];
						class120_sub18_27_.anInt2646 = FileSystem.anIntArray453[i_43_];
					}
					if (class182 != null) {
						if ((class182.anInt1799 & IntegerNode.anIntArray2791[i_43_]) != 0) {
							if (class182.anInt1799 == 16) {
								class120_sub18_27_.anInt2633 = 3;
								class120_sub18_27_.anInt2637 = Class157.anIntArray1461[i_43_];
								class120_sub18_27_.anInt2648 = 3 - class120_sub18_27_.anInt2637;
							} else if (class182.anInt1799 == 32) {
								class120_sub18_27_.anInt2633 = 6;
								class120_sub18_27_.anInt2637 = Class120_Sub12_Sub12.anIntArray3220[i_43_];
								class120_sub18_27_.anInt2648 = 6 - class120_sub18_27_.anInt2637;
							} else if (class182.anInt1799 == 64) {
								class120_sub18_27_.anInt2633 = 12;
								class120_sub18_27_.anInt2637 = Class121.anIntArray1152[i_43_];
								class120_sub18_27_.anInt2648 = 12 - class120_sub18_27_.anInt2637;
							} else {
								class120_sub18_27_.anInt2633 = 9;
								class120_sub18_27_.anInt2637 = Class2.anIntArray51[i_43_];
								class120_sub18_27_.anInt2648 = 9 - class120_sub18_27_.anInt2637;
							}
						} else {
							class120_sub18_27_.anInt2633 = 0;
						}
						if ((class182.anInt1799 & i_44_) != 0 && !GameEntity.method2335(i_30_, i, i_28_, class182.anInt1799)) {
							if (HDToolkit.glEnabled) {
								LightManager.method1861(DisplayModeInfo.anInt1713, PlayerAppearance.anInt1367, Class145.anInt1381, i_29_, i, i_28_);
							}
							class182.aClass180_1800.method2265(0, Class69_Sub2.anInt2239, Class120_Sub17.anInt2616, Class120_Sub12_Sub30.anInt3377, Class73.anInt637, class182.anInt1797 - DisplayModeInfo.anInt1713, class182.anInt1801 - PlayerAppearance.anInt1367, class182.anInt1795 - Class145.anInt1381,
									class182.bitPacked, i_29_, null);
						}
						if ((class182.anInt1792 & i_44_) != 0 && !GameEntity.method2335(i_30_, i, i_28_, class182.anInt1792)) {
							if (HDToolkit.glEnabled) {
								LightManager.method1861(DisplayModeInfo.anInt1713, PlayerAppearance.anInt1367, Class145.anInt1381, i_29_, i, i_28_);
							}
							class182.aClass180_1796.method2265(0, Class69_Sub2.anInt2239, Class120_Sub17.anInt2616, Class120_Sub12_Sub30.anInt3377, Class73.anInt637, class182.anInt1797 - DisplayModeInfo.anInt1713, class182.anInt1801 - PlayerAppearance.anInt1367, class182.anInt1795 - Class145.anInt1381,
									class182.bitPacked, i_29_, null);
						}
					}
					if (class186 != null && !Class45.method363(i_30_, i, i_28_, class186.aClass180_1901.getMaxY())) {
						if (HDToolkit.glEnabled) {
							HDToolkit.method527(f - 0.5F);
						}
						if ((class186.anInt1895 & i_44_) != 0) {
							if (HDToolkit.glEnabled) {
								LightManager.method1861(DisplayModeInfo.anInt1713, PlayerAppearance.anInt1367, Class145.anInt1381, i_29_, i, i_28_);
							}
							class186.aClass180_1901.method2265(0, Class69_Sub2.anInt2239, Class120_Sub17.anInt2616, Class120_Sub12_Sub30.anInt3377, Class73.anInt637, class186.anInt1893 - DisplayModeInfo.anInt1713 + class186.anInt1905, class186.anInt1894 - PlayerAppearance.anInt1367, class186.anInt1891
									- Class145.anInt1381 + class186.anInt1892, class186.bitPacked, i_29_, null);
						} else if (class186.anInt1895 == 256) {
							final int i_45_ = class186.anInt1893 - DisplayModeInfo.anInt1713;
							final int i_46_ = class186.anInt1894 - PlayerAppearance.anInt1367;
							final int i_47_ = class186.anInt1891 - Class145.anInt1381;
							final int i_48_ = class186.anInt1896;
							int i_49_;
							if (i_48_ == 1 || i_48_ == 2) {
								i_49_ = -i_45_;
							} else {
								i_49_ = i_45_;
							}
							int i_50_;
							if (i_48_ == 2 || i_48_ == 3) {
								i_50_ = -i_47_;
							} else {
								i_50_ = i_47_;
							}
							if (i_50_ < i_49_) {
								if (HDToolkit.glEnabled) {
									LightManager.method1861(DisplayModeInfo.anInt1713, PlayerAppearance.anInt1367, Class145.anInt1381, i_29_, i, i_28_);
								}
								class186.aClass180_1901.method2265(0, Class69_Sub2.anInt2239, Class120_Sub17.anInt2616, Class120_Sub12_Sub30.anInt3377, Class73.anInt637, i_45_ + class186.anInt1905, i_46_, i_47_ + class186.anInt1892, class186.bitPacked, i_29_, null);
							} else if (class186.aClass180_1898 != null) {
								if (HDToolkit.glEnabled) {
									LightManager.method1861(DisplayModeInfo.anInt1713, PlayerAppearance.anInt1367, Class145.anInt1381, i_29_, i, i_28_);
								}
								class186.aClass180_1898.method2265(0, Class69_Sub2.anInt2239, Class120_Sub17.anInt2616, Class120_Sub12_Sub30.anInt3377, Class73.anInt637, i_45_, i_46_, i_47_, class186.bitPacked, i_29_, null);
							}
						}
						if (HDToolkit.glEnabled) {
							HDToolkit.method527(f);
						}
					}
					if (bool_42_) {
						final Class36 class36 = class120_sub18_27_.aClass36_2650;
						if (class36 != null && (class36.bitPacked & 0x80000000L) == 0L) {
							if (HDToolkit.glEnabled && class36.aBoolean314) {
								HDToolkit.method527(f + 50.0F - 1.5F);
							}
							if (HDToolkit.glEnabled) {
								LightManager.method1861(DisplayModeInfo.anInt1713, PlayerAppearance.anInt1367, Class145.anInt1381, i_29_, i, i_28_);
							}
							class36.aClass180_309.method2265(0, Class69_Sub2.anInt2239, Class120_Sub17.anInt2616, Class120_Sub12_Sub30.anInt3377, Class73.anInt637, class36.anInt311 - DisplayModeInfo.anInt1713, class36.anInt312 - PlayerAppearance.anInt1367, class36.anInt310 - Class145.anInt1381, class36.bitPacked,
									i_29_, null);
							if (HDToolkit.glEnabled && class36.aBoolean314) {
								HDToolkit.method527(f);
							}
						}
						final ObjectPile objectPile = class120_sub18_27_.objectPile;
						if (objectPile != null && objectPile.yLocationModifier == 0) {
							if (HDToolkit.glEnabled) {
								LightManager.method1861(DisplayModeInfo.anInt1713, PlayerAppearance.anInt1367, Class145.anInt1381, i_29_, i, i_28_);
							}
							if (objectPile.secondItemModel != null) {
								objectPile.secondItemModel.method2265(0, Class69_Sub2.anInt2239, Class120_Sub17.anInt2616, Class120_Sub12_Sub30.anInt3377, Class73.anInt637, objectPile.renderX - DisplayModeInfo.anInt1713, objectPile.renderY - PlayerAppearance.anInt1367, objectPile.renderZ - Class145.anInt1381,
										objectPile.bitPacked, i_29_, null);
							}
							if (objectPile.thirdItemModel != null) {
								objectPile.thirdItemModel.method2265(0, Class69_Sub2.anInt2239, Class120_Sub17.anInt2616, Class120_Sub12_Sub30.anInt3377, Class73.anInt637, objectPile.renderX - DisplayModeInfo.anInt1713, objectPile.renderY - PlayerAppearance.anInt1367, objectPile.renderZ - Class145.anInt1381,
										objectPile.bitPacked, i_29_, null);
							}
							if (objectPile.mainItemModel != null) {
								objectPile.mainItemModel.method2265(0, Class69_Sub2.anInt2239, Class120_Sub17.anInt2616, Class120_Sub12_Sub30.anInt3377, Class73.anInt637, objectPile.renderX - DisplayModeInfo.anInt1713, objectPile.renderY - PlayerAppearance.anInt1367, objectPile.renderZ - Class145.anInt1381,
										objectPile.bitPacked, i_29_, null);
							}
						}
					}
					final int i_51_ = class120_sub18_27_.anInt2635;
					if (i_51_ != 0) {
						if (i < Class120_Sub12_Sub26.anInt3332 && (i_51_ & 0x4) != 0) {
							final GroundTile class120_sub18_52_ = class120_sub18s[i + 1][i_28_];
							if (class120_sub18_52_ != null && class120_sub18_52_.aBoolean2624) {
								AbstractTimer.aClass105_824.addLast(class120_sub18_52_);
							}
						}
						if (i_28_ < Class112.anInt1080 && (i_51_ & 0x2) != 0) {
							final GroundTile class120_sub18_53_ = class120_sub18s[i][i_28_ + 1];
							if (class120_sub18_53_ != null && class120_sub18_53_.aBoolean2624) {
								AbstractTimer.aClass105_824.addLast(class120_sub18_53_);
							}
						}
						if (i > Class120_Sub12_Sub26.anInt3332 && (i_51_ & 0x1) != 0) {
							final GroundTile class120_sub18_54_ = class120_sub18s[i - 1][i_28_];
							if (class120_sub18_54_ != null && class120_sub18_54_.aBoolean2624) {
								AbstractTimer.aClass105_824.addLast(class120_sub18_54_);
							}
						}
						if (i_28_ > Class112.anInt1080 && (i_51_ & 0x8) != 0) {
							final GroundTile class120_sub18_55_ = class120_sub18s[i][i_28_ - 1];
							if (class120_sub18_55_ != null && class120_sub18_55_.aBoolean2624) {
								AbstractTimer.aClass105_824.addLast(class120_sub18_55_);
							}
						}
					}
				}
				if (class120_sub18_27_.anInt2633 != 0) {
					boolean bool_56_ = true;
					for (int i_57_ = 0; i_57_ < class120_sub18_27_.anInt2638; i_57_++) {
						if (class120_sub18_27_.aClass28Array2625[i_57_].anInt173 != Class120_Sub12_Sub9.anInt3193 && (class120_sub18_27_.anIntArray2641[i_57_] & class120_sub18_27_.anInt2633) == class120_sub18_27_.anInt2637) {
							bool_56_ = false;
							break;
						}
					}
					if (bool_56_) {
						final Class182 class182 = class120_sub18_27_.aClass182_2628;
						if (!GameEntity.method2335(i_30_, i, i_28_, class182.anInt1799)) {
							do {
								if (HDToolkit.glEnabled) {
									if ((class182.bitPacked & 0xfc000L) == 16384L) {
										int i_58_ = class182.anInt1797 - DisplayModeInfo.anInt1713;
										int i_59_ = class182.anInt1795 - Class145.anInt1381;
										final int i_60_ = (int) (class182.bitPacked >> 20 & 0x3L);
										if (i_60_ == 0) {
											i_58_ -= 64;
											i_59_ += 64;
											if (i_59_ < i_58_ && i > 0 && i_28_ < Class120_Sub12_Sub38.anInt3440 - 1) {
												LightManager.method1861(DisplayModeInfo.anInt1713, PlayerAppearance.anInt1367, Class145.anInt1381, i_29_, i - 1, i_28_ + 1);
												break;
											}
										} else if (i_60_ == 1) {
											i_58_ += 64;
											i_59_ += 64;
											if (i_59_ < -i_58_ && i < Class186.anInt1900 - 1 && i_28_ < Class120_Sub12_Sub38.anInt3440 - 1) {
												LightManager.method1861(DisplayModeInfo.anInt1713, PlayerAppearance.anInt1367, Class145.anInt1381, i_29_, i + 1, i_28_ + 1);
												break;
											}
										} else if (i_60_ == 2) {
											i_58_ += 64;
											i_59_ -= 64;
											if (i_59_ > i_58_ && i < Class186.anInt1900 - 1 && i_28_ > 0) {
												LightManager.method1861(DisplayModeInfo.anInt1713, PlayerAppearance.anInt1367, Class145.anInt1381, i_29_, i + 1, i_28_ - 1);
												break;
											}
										} else if (i_60_ == 3) {
											i_58_ -= 64;
											i_59_ -= 64;
											if (i_59_ > -i_58_ && i > 0 && i_28_ > 0) {
												LightManager.method1861(DisplayModeInfo.anInt1713, PlayerAppearance.anInt1367, Class145.anInt1381, i_29_, i - 1, i_28_ - 1);
												break;
											}
										}
									}
									LightManager.method1861(DisplayModeInfo.anInt1713, PlayerAppearance.anInt1367, Class145.anInt1381, i_29_, i, i_28_);
								}
							} while (false);
							class182.aClass180_1800.method2265(0, Class69_Sub2.anInt2239, Class120_Sub17.anInt2616, Class120_Sub12_Sub30.anInt3377, Class73.anInt637, class182.anInt1797 - DisplayModeInfo.anInt1713, class182.anInt1801 - PlayerAppearance.anInt1367, class182.anInt1795 - Class145.anInt1381,
									class182.bitPacked, i_29_, null);
						}
						class120_sub18_27_.anInt2633 = 0;
					}
				}
				if (class120_sub18_27_.aBoolean2631) {
					try {
						final int i_61_ = class120_sub18_27_.anInt2638;
						class120_sub18_27_.aBoolean2631 = false;
						int i_62_ = 0;
						while_84_: for (int i_63_ = 0; i_63_ < i_61_; i_63_++) {
							final Class28 class28 = class120_sub18_27_.aClass28Array2625[i_63_];
							if (class28.anInt173 != Class120_Sub12_Sub9.anInt3193) {
								for (int i_64_ = class28.anInt180; i_64_ <= class28.anInt182; i_64_++) {
									for (int i_65_ = class28.anInt184; i_65_ <= class28.anInt175; i_65_++) {
										final GroundTile class120_sub18_66_ = class120_sub18s[i_64_][i_65_];
										if (class120_sub18_66_.aBoolean2647) {
											class120_sub18_27_.aBoolean2631 = true;
											continue while_84_;
										}
										if (class120_sub18_66_.anInt2633 != 0) {
											int i_67_ = 0;
											if (i_64_ > class28.anInt180) {
												i_67_++;
											}
											if (i_64_ < class28.anInt182) {
												i_67_ += 4;
											}
											if (i_65_ > class28.anInt184) {
												i_67_ += 8;
											}
											if (i_65_ < class28.anInt175) {
												i_67_ += 2;
											}
											if ((i_67_ & class120_sub18_66_.anInt2633) == class120_sub18_27_.anInt2648) {
												class120_sub18_27_.aBoolean2631 = true;
												continue while_84_;
											}
										}
									}
								}
								Class39.aClass28Array323[i_62_++] = class28;
								int i_68_ = Class120_Sub12_Sub26.anInt3332 - class28.anInt180;
								final int i_69_ = class28.anInt182 - Class120_Sub12_Sub26.anInt3332;
								if (i_69_ > i_68_) {
									i_68_ = i_69_;
								}
								final int i_70_ = Class112.anInt1080 - class28.anInt184;
								final int i_71_ = class28.anInt175 - Class112.anInt1080;
								if (i_71_ > i_70_) {
									class28.anInt171 = i_68_ + i_71_;
								} else {
									class28.anInt171 = i_68_ + i_70_;
								}
							}
						}
						while (i_62_ > 0) {
							int i_72_ = -50;
							int i_73_ = -1;
							for (int i_74_ = 0; i_74_ < i_62_; i_74_++) {
								final Class28 class28 = Class39.aClass28Array323[i_74_];
								if (class28.anInt173 != Class120_Sub12_Sub9.anInt3193) {
									if (class28.anInt171 > i_72_) {
										i_72_ = class28.anInt171;
										i_73_ = i_74_;
									} else if (class28.anInt171 == i_72_) {
										final int i_75_ = class28.anInt178 - DisplayModeInfo.anInt1713;
										final int i_76_ = class28.anInt185 - Class145.anInt1381;
										final int i_77_ = Class39.aClass28Array323[i_73_].anInt178 - DisplayModeInfo.anInt1713;
										final int i_78_ = Class39.aClass28Array323[i_73_].anInt185 - Class145.anInt1381;
										if (i_75_ * i_75_ + i_76_ * i_76_ > i_77_ * i_77_ + i_78_ * i_78_) {
											i_73_ = i_74_;
										}
									}
								}
							}
							if (i_73_ == -1) {
								break;
							}
							final Class28 class28 = Class39.aClass28Array323[i_73_];
							class28.anInt173 = Class120_Sub12_Sub9.anInt3193;
							if (!Class85.method723(i_30_, class28.anInt180, class28.anInt182, class28.anInt184, class28.anInt175, class28.aClass180_174.getMaxY())) {
								if (HDToolkit.glEnabled) {
									if ((class28.bitPacked & 0xfc000L) == 147456L) {
										LightManager.method1861(DisplayModeInfo.anInt1713, PlayerAppearance.anInt1367, Class145.anInt1381, i_29_, i, i_28_);
										final int i_79_ = class28.anInt178 - DisplayModeInfo.anInt1713;
										final int i_80_ = class28.anInt185 - Class145.anInt1381;
										final int i_81_ = (int) (class28.bitPacked >> 20 & 0x3L);
										if (i_81_ == 1 || i_81_ == 3) {
											if (i_80_ > -i_79_) {
												LightManager.method1864(i_29_, i, i_28_ - 1, i - 1, i_28_);
											} else {
												LightManager.method1864(i_29_, i, i_28_ + 1, i + 1, i_28_);
											}
										} else if (i_80_ > i_79_) {
											LightManager.method1864(i_29_, i, i_28_ - 1, i + 1, i_28_);
										} else {
											LightManager.method1864(i_29_, i, i_28_ + 1, i - 1, i_28_);
										}
									} else {
										LightManager.method1862(DisplayModeInfo.anInt1713, PlayerAppearance.anInt1367, Class145.anInt1381, i_29_, class28.anInt180, class28.anInt184, class28.anInt182, class28.anInt175);
									}
								}
								class28.aClass180_174.method2265(class28.anInt172, Class69_Sub2.anInt2239, Class120_Sub17.anInt2616, Class120_Sub12_Sub30.anInt3377, Class73.anInt637, class28.anInt178 - DisplayModeInfo.anInt1713, class28.anInt179 - PlayerAppearance.anInt1367, class28.anInt185 - Class145.anInt1381,
										class28.bitPacked, i_29_, null);
							}
							for (int i_82_ = class28.anInt180; i_82_ <= class28.anInt182; i_82_++) {
								for (int i_83_ = class28.anInt184; i_83_ <= class28.anInt175; i_83_++) {
									final GroundTile class120_sub18_84_ = class120_sub18s[i_82_][i_83_];
									if (class120_sub18_84_.anInt2633 != 0) {
										AbstractTimer.aClass105_824.addLast(class120_sub18_84_);
									} else if ((i_82_ != i || i_83_ != i_28_) && class120_sub18_84_.aBoolean2624) {
										AbstractTimer.aClass105_824.addLast(class120_sub18_84_);
									}
								}
							}
						}
						if (class120_sub18_27_.aBoolean2631) {
							continue;
						}
					} catch (final Exception exception) {
						class120_sub18_27_.aBoolean2631 = false;
					}
				}
				if (class120_sub18_27_.aClass100_2645 != null) {
					if (HDToolkit.glEnabled) {
						final GL gl = HDToolkit.gl;
						HDToolkit.method527(f);
						ParticleEngine.method956(DisplayModeInfo.anInt1713, PlayerAppearance.anInt1367, Class145.anInt1381);
						final int i_85_ = class120_sub18_27_.anInt2632 * 128 + 64 - DisplayModeInfo.anInt1713;
						final int i_86_ = OverridedJInterface.anIntArrayArrayArray2741[i_29_][class120_sub18_27_.anInt2632][class120_sub18_27_.anInt2629] - PlayerAppearance.anInt1367;
						final int i_87_ = class120_sub18_27_.anInt2629 * 128 + 64 - Class145.anInt1381;
						int i_88_;
						if (i_29_ < 3) {
							i_88_ = OverridedJInterface.anIntArrayArrayArray2741[i_29_][class120_sub18_27_.anInt2632][class120_sub18_27_.anInt2629] - OverridedJInterface.anIntArrayArrayArray2741[i_29_ + 1][class120_sub18_27_.anInt2632][class120_sub18_27_.anInt2629];
						} else {
							i_88_ = 1024;
						}
						final int i_89_ = i_87_ * Class73.anInt637 - i_85_ * Class120_Sub12_Sub30.anInt3377 >> 16;
						final int i_90_ = i_86_ * Class69_Sub2.anInt2239 + i_89_ * Class120_Sub17.anInt2616 >> 16;
						final int i_91_ = i_90_ + (91 * Class120_Sub17.anInt2616 + 0 * Class69_Sub2.anInt2239 >> 16);
						int i_92_ = i_90_ + (-91 * Class120_Sub17.anInt2616 - i_88_ * Class69_Sub2.anInt2239 >> 16);
						if (i_92_ < i_91_ - 1597) {
							i_92_ = i_91_ - 1597;
						}
						final int i_93_ = i_91_ - i_92_ + 2;
						Class108_Sub3_Sub1 class108_sub3_sub1 = null;
						Class108_Sub1 class108_sub1 = null;
						int i_94_ = -1;
						Class108_Sub3_Sub1 class108_sub3_sub1_95_ = (Class108_Sub3_Sub1) class120_sub18_27_.aClass100_2645.method828((byte) -85);
						for (/**/; true; class108_sub3_sub1_95_ = (Class108_Sub3_Sub1) class120_sub18_27_.aClass100_2645.method831((byte) 38)) {
							if (class108_sub3_sub1_95_ != null) {
								if (class108_sub3_sub1_95_.aClass108_Sub1_3099 == null || class108_sub3_sub1_95_.aClass108_Sub1_3099.aClass108_Sub2_2340.aBoolean2356) {
									class108_sub3_sub1_95_.unlink();
									continue;
								}
								if ((byte) (int) (class108_sub3_sub1_95_.aClass108_Sub1_3099.aClass108_Sub2_2340.aLong2359 & 0xffL) != class120_sub18_27_.aByte2623) {
									class120_sub18_27_.aClass100_2645 = null;
									break;
								}
								if (class108_sub3_sub1 == null) {
									class108_sub3_sub1 = class108_sub3_sub1_95_;
									class108_sub1 = class108_sub3_sub1_95_.aClass108_Sub1_3099;
									i_94_ = class108_sub1.aClass80_2323.anInt721;
									continue;
								}
							}
							if (class108_sub3_sub1 != null && (class108_sub3_sub1_95_ == null || class108_sub3_sub1_95_.aClass108_Sub1_3099 != class108_sub1 || class108_sub3_sub1_95_.aClass108_Sub1_3099.aClass80_2323.anInt721 != i_94_)) {
								for (int i_96_ = 0; i_96_ < i_93_; i_96_++) {
									ParticleEngine.anIntArray2389[i_96_] = 0;
								}
								for (int i_97_ = 0; i_97_ < 32; i_97_++) {
									ParticleEngine.anIntArray2390[i_97_] = 0;
								}
								ParticleEngine.anInt2380 = 0;
								for (Class108_Sub3_Sub1 class108_sub3_sub1_98_ = class108_sub3_sub1; class108_sub3_sub1_98_ != class108_sub3_sub1_95_; class108_sub3_sub1_98_ = (Class108_Sub3_Sub1) class108_sub3_sub1_98_.aClass108_Sub3_2398) {
									if (class108_sub3_sub1_98_.aClass108_Sub1_3099 != null) {
										final int i_99_ = (class108_sub3_sub1_98_.anInt3087 >> 12) - DisplayModeInfo.anInt1713;
										final int i_100_ = (class108_sub3_sub1_98_.anInt3088 >> 12) - PlayerAppearance.anInt1367;
										int i_101_ = (class108_sub3_sub1_98_.anInt3090 >> 12) - Class145.anInt1381;
										i_101_ = i_101_ * Class73.anInt637 - i_99_ * Class120_Sub12_Sub30.anInt3377 >> 16;
										i_101_ = (i_100_ * Class69_Sub2.anInt2239 + i_101_ * Class120_Sub17.anInt2616 >> 16) - i_92_;
										if (ParticleEngine.anIntArray2389[i_101_] < 32) {
											ParticleEngine.aShortArrayArray2378[i_101_][ParticleEngine.anIntArray2389[i_101_]++] = class108_sub3_sub1_98_.aShort3094;
										} else {
											if (ParticleEngine.anIntArray2389[i_101_] == 32) {
												if (ParticleEngine.anInt2380 == 32) {
													if (ParticleEngine.aBoolean2362) {
														System.out.println("Overflowed world-based radix sort");
													}
													break;
												}
												ParticleEngine.anIntArray2389[i_101_] += 1 + ParticleEngine.anInt2380++;
											}
											final int i_102_ = ParticleEngine.anIntArray2390[ParticleEngine.anIntArray2389[i_101_] - 32 - 1];
											if (i_102_ < 768) {
												ParticleEngine.aShortArrayArray2387[ParticleEngine.anIntArray2389[i_101_] - 32 - 1][ParticleEngine.anIntArray2390[ParticleEngine.anIntArray2389[i_101_] - 32 - 1]++] = class108_sub3_sub1_98_.aShort3094;
											}
										}
									}
									if (class108_sub3_sub1_98_.aClass108_Sub3_2398 == class120_sub18_27_.aClass100_2645.aClass108_Sub3_955) {
										break;
									}
								}
								boolean bool_103_ = false;
								if (ParticleEngine.aBoolean2347 && class108_sub1.aClass80_2323.anInt724 != -1) {
									Rasterizer.anInterface5_973.method25(64, class108_sub1.aClass80_2323.anInt724);
									bool_103_ = true;
								} else {
									HDToolkit.method514(-1);
								}
								float f_104_ = i_94_ * ParticleEngine.aFloat2393;
								if (f_104_ > 64.0F) {
									f_104_ = 64.0F;
								}
								gl.glPointSize(f_104_);
								class108_sub1.aClass108_Sub2_2340.method950(gl, i_93_, bool_103_, class108_sub1.aClass80_2323.aBoolean750);
								if (class108_sub3_sub1_95_ != null) {
									class108_sub3_sub1 = class108_sub3_sub1_95_;
									class108_sub1 = class108_sub3_sub1_95_.aClass108_Sub1_3099;
									i_94_ = class108_sub3_sub1_95_.aClass108_Sub1_3099.aClass80_2323.anInt721;
								}
							}
							if (class108_sub3_sub1_95_ == null) {
								break;
							}
						}
						ParticleEngine.method957();
					} else {
						final int i_105_ = ParticleEngine.anInt2364 + Rasterizer.anInt967;
						final int i_106_ = ParticleEngine.anInt2358 + Rasterizer.anInt970;
						final Class108_Sub3 class108_sub3 = class120_sub18_27_.aClass100_2645.aClass108_Sub3_955;
						for (Class108_Sub3 class108_sub3_107_ = class108_sub3.aClass108_Sub3_2398; class108_sub3_107_ != class108_sub3; class108_sub3_107_ = class108_sub3_107_.aClass108_Sub3_2398) {
							final Class108_Sub3_Sub1 class108_sub3_sub1 = (Class108_Sub3_Sub1) class108_sub3_107_;
							if (class108_sub3_sub1.aClass108_Sub1_3099 != null && !class108_sub3_sub1.aClass108_Sub1_3099.aClass108_Sub2_2340.aBoolean2356) {
								if ((byte) (int) (class108_sub3_sub1.aClass108_Sub1_3099.aClass108_Sub2_2340.aLong2359 & 0xffL) != class120_sub18_27_.aByte2623) {
									class120_sub18_27_.aClass100_2645 = null;
									break;
								}
								int i_108_ = (class108_sub3_sub1.anInt3087 >> 12) - DisplayModeInfo.anInt1713;
								int i_109_ = (class108_sub3_sub1.anInt3088 >> 12) - PlayerAppearance.anInt1367;
								int i_110_ = (class108_sub3_sub1.anInt3090 >> 12) - Class145.anInt1381;
								int i_111_ = i_110_ * Class120_Sub12_Sub30.anInt3377 + i_108_ * Class73.anInt637 >> 16;
								i_110_ = i_110_ * Class73.anInt637 - i_108_ * Class120_Sub12_Sub30.anInt3377 >> 16;
								i_108_ = i_111_;
								i_111_ = i_109_ * Class120_Sub17.anInt2616 - i_110_ * Class69_Sub2.anInt2239 >> 16;
								i_110_ = i_109_ * Class69_Sub2.anInt2239 + i_110_ * Class120_Sub17.anInt2616 >> 16;
								i_109_ = i_111_;
								if (i_110_ >= 50) {
									final int i_112_ = i_105_ + (i_108_ << 9) / i_110_;
									final int i_113_ = i_106_ + (i_109_ << 9) / i_110_;
									int i_114_ = i_110_ * 400;
									if (i_114_ == 0) {
										i_114_ = 1;
									}
									GraphicsLD.method2152(i_112_, i_113_, (class108_sub3_sub1.aClass108_Sub1_3099.aClass80_2323.anInt721 << 16) / i_114_, class108_sub3_sub1.anInt3091, class108_sub3_sub1.anInt3091 >> 24 & 0xff);
								}
							}
						}
					}
				}
				if (class120_sub18_27_.aBoolean2624 && class120_sub18_27_.anInt2633 == 0) {
					if (i <= Class120_Sub12_Sub26.anInt3332 && i > Class160.anInt1493) {
						final GroundTile class120_sub18_115_ = class120_sub18s[i - 1][i_28_];
						if (class120_sub18_115_ != null && class120_sub18_115_.aBoolean2624) {
							continue;
						}
					}
					if (i >= Class120_Sub12_Sub26.anInt3332 && i < Class53.anInt487 - 1) {
						final GroundTile class120_sub18_116_ = class120_sub18s[i + 1][i_28_];
						if (class120_sub18_116_ != null && class120_sub18_116_.aBoolean2624) {
							continue;
						}
					}
					if (i_28_ <= Class112.anInt1080 && i_28_ > Class31.anInt248) {
						final GroundTile class120_sub18_117_ = class120_sub18s[i][i_28_ - 1];
						if (class120_sub18_117_ != null && class120_sub18_117_.aBoolean2624) {
							continue;
						}
					}
					if (i_28_ >= Class112.anInt1080 && i_28_ < Class45.anInt396 - 1) {
						final GroundTile class120_sub18_118_ = class120_sub18s[i][i_28_ + 1];
						if (class120_sub18_118_ != null && class120_sub18_118_.aBoolean2624) {
							continue;
						}
					}
					class120_sub18_27_.aBoolean2624 = false;
					Class120_Sub17.anInt2615--;
					final ObjectPile objectPile = class120_sub18_27_.objectPile;
					if (objectPile != null && objectPile.yLocationModifier != 0) {
						if (HDToolkit.glEnabled) {
							LightManager.method1861(DisplayModeInfo.anInt1713, PlayerAppearance.anInt1367, Class145.anInt1381, i_29_, i, i_28_);
						}
						if (objectPile.secondItemModel != null) {
							objectPile.secondItemModel.method2265(0, Class69_Sub2.anInt2239, Class120_Sub17.anInt2616, Class120_Sub12_Sub30.anInt3377, Class73.anInt637, objectPile.renderX - DisplayModeInfo.anInt1713, objectPile.renderY - PlayerAppearance.anInt1367 - objectPile.yLocationModifier, objectPile.renderZ
									- Class145.anInt1381, objectPile.bitPacked, i_29_, null);
						}
						if (objectPile.thirdItemModel != null) {
							objectPile.thirdItemModel.method2265(0, Class69_Sub2.anInt2239, Class120_Sub17.anInt2616, Class120_Sub12_Sub30.anInt3377, Class73.anInt637, objectPile.renderX - DisplayModeInfo.anInt1713, objectPile.renderY - PlayerAppearance.anInt1367 - objectPile.yLocationModifier, objectPile.renderZ
									- Class145.anInt1381, objectPile.bitPacked, i_29_, null);
						}
						if (objectPile.mainItemModel != null) {
							objectPile.mainItemModel.method2265(0, Class69_Sub2.anInt2239, Class120_Sub17.anInt2616, Class120_Sub12_Sub30.anInt3377, Class73.anInt637, objectPile.renderX - DisplayModeInfo.anInt1713, objectPile.renderY - PlayerAppearance.anInt1367 - objectPile.yLocationModifier, objectPile.renderZ
									- Class145.anInt1381, objectPile.bitPacked, i_29_, null);
						}
					}
					if (class120_sub18_27_.anInt2646 != 0) {
						final Class186 class186 = class120_sub18_27_.aClass186_2639;
						if (class186 != null && !Class45.method363(i_30_, i, i_28_, class186.aClass180_1901.getMaxY())) {
							if ((class186.anInt1895 & class120_sub18_27_.anInt2646) != 0) {
								if (HDToolkit.glEnabled) {
									LightManager.method1861(DisplayModeInfo.anInt1713, PlayerAppearance.anInt1367, Class145.anInt1381, i_29_, i, i_28_);
								}
								class186.aClass180_1901.method2265(0, Class69_Sub2.anInt2239, Class120_Sub17.anInt2616, Class120_Sub12_Sub30.anInt3377, Class73.anInt637, class186.anInt1893 - DisplayModeInfo.anInt1713 + class186.anInt1905, class186.anInt1894 - PlayerAppearance.anInt1367, class186.anInt1891
										- Class145.anInt1381 + class186.anInt1892, class186.bitPacked, i_29_, null);
							} else if (class186.anInt1895 == 256) {
								final int i_119_ = class186.anInt1893 - DisplayModeInfo.anInt1713;
								final int i_120_ = class186.anInt1894 - PlayerAppearance.anInt1367;
								final int i_121_ = class186.anInt1891 - Class145.anInt1381;
								final int i_122_ = class186.anInt1896;
								int i_123_;
								if (i_122_ == 1 || i_122_ == 2) {
									i_123_ = -i_119_;
								} else {
									i_123_ = i_119_;
								}
								int i_124_;
								if (i_122_ == 2 || i_122_ == 3) {
									i_124_ = -i_121_;
								} else {
									i_124_ = i_121_;
								}
								if (i_124_ >= i_123_) {
									if (HDToolkit.glEnabled) {
										LightManager.method1861(DisplayModeInfo.anInt1713, PlayerAppearance.anInt1367, Class145.anInt1381, i_29_, i, i_28_);
									}
									class186.aClass180_1901.method2265(0, Class69_Sub2.anInt2239, Class120_Sub17.anInt2616, Class120_Sub12_Sub30.anInt3377, Class73.anInt637, i_119_ + class186.anInt1905, i_120_, i_121_ + class186.anInt1892, class186.bitPacked, i_29_, null);
								} else if (class186.aClass180_1898 != null) {
									if (HDToolkit.glEnabled) {
										LightManager.method1861(DisplayModeInfo.anInt1713, PlayerAppearance.anInt1367, Class145.anInt1381, i_29_, i, i_28_);
									}
									class186.aClass180_1898.method2265(0, Class69_Sub2.anInt2239, Class120_Sub17.anInt2616, Class120_Sub12_Sub30.anInt3377, Class73.anInt637, i_119_, i_120_, i_121_, class186.bitPacked, i_29_, null);
								}
							}
						}
						final Class182 class182 = class120_sub18_27_.aClass182_2628;
						if (class182 != null) {
							if ((class182.anInt1792 & class120_sub18_27_.anInt2646) != 0 && !GameEntity.method2335(i_30_, i, i_28_, class182.anInt1792)) {
								if (HDToolkit.glEnabled) {
									LightManager.method1866(class182.anInt1792, DisplayModeInfo.anInt1713, PlayerAppearance.anInt1367, Class145.anInt1381, i_30_, i, i_28_);
								}
								class182.aClass180_1796.method2265(0, Class69_Sub2.anInt2239, Class120_Sub17.anInt2616, Class120_Sub12_Sub30.anInt3377, Class73.anInt637, class182.anInt1797 - DisplayModeInfo.anInt1713, class182.anInt1801 - PlayerAppearance.anInt1367, class182.anInt1795 - Class145.anInt1381,
										class182.bitPacked, i_29_, null);
							}
							if ((class182.anInt1799 & class120_sub18_27_.anInt2646) != 0 && !GameEntity.method2335(i_30_, i, i_28_, class182.anInt1799)) {
								if (HDToolkit.glEnabled) {
									LightManager.method1866(class182.anInt1799, DisplayModeInfo.anInt1713, PlayerAppearance.anInt1367, Class145.anInt1381, i_30_, i, i_28_);
								}
								class182.aClass180_1800.method2265(0, Class69_Sub2.anInt2239, Class120_Sub17.anInt2616, Class120_Sub12_Sub30.anInt3377, Class73.anInt637, class182.anInt1797 - DisplayModeInfo.anInt1713, class182.anInt1801 - PlayerAppearance.anInt1367, class182.anInt1795 - Class145.anInt1381,
										class182.bitPacked, i_29_, null);
							}
						}
					}
					if (i_29_ < Class142.anInt1361 - 1) {
						final GroundTile class120_sub18_125_ = Class120_Sub1.groundTiles[i_29_ + 1][i][i_28_];
						if (class120_sub18_125_ != null && class120_sub18_125_.aBoolean2624) {
							AbstractTimer.aClass105_824.addLast(class120_sub18_125_);
						}
					}
					if (i < Class120_Sub12_Sub26.anInt3332) {
						final GroundTile class120_sub18_126_ = class120_sub18s[i + 1][i_28_];
						if (class120_sub18_126_ != null && class120_sub18_126_.aBoolean2624) {
							AbstractTimer.aClass105_824.addLast(class120_sub18_126_);
						}
					}
					if (i_28_ < Class112.anInt1080) {
						final GroundTile class120_sub18_127_ = class120_sub18s[i][i_28_ + 1];
						if (class120_sub18_127_ != null && class120_sub18_127_.aBoolean2624) {
							AbstractTimer.aClass105_824.addLast(class120_sub18_127_);
						}
					}
					if (i > Class120_Sub12_Sub26.anInt3332) {
						final GroundTile class120_sub18_128_ = class120_sub18s[i - 1][i_28_];
						if (class120_sub18_128_ != null && class120_sub18_128_.aBoolean2624) {
							AbstractTimer.aClass105_824.addLast(class120_sub18_128_);
						}
					}
					if (i_28_ > Class112.anInt1080) {
						final GroundTile class120_sub18_129_ = class120_sub18s[i][i_28_ - 1];
						if (class120_sub18_129_ != null && class120_sub18_129_.aBoolean2624) {
							AbstractTimer.aClass105_824.addLast(class120_sub18_129_);
						}
					}
				}
			}
		}
	}

	final boolean method1990(final byte i) {
		boolean bool;
		try {
			if (anIntArray1333 == null) {
				return true;
			}
			boolean bool_130_ = true;
			if (i >= -102) {
				method1989(null, false);
			}
			for (int i_131_ = 0; i_131_ < anIntArray1333.length; i_131_++) {
				if (!SceneGroundObject.aClass50_2839.method440(anIntArray1333[i_131_], true, 0)) {
					bool_130_ = false;
				}
			}
			bool = bool_130_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("qa.H(").append(i).append(')').toString());
		}
		return bool;
	}

	static final void method1991(final JagexInterface[] class189s, final byte i, final int i_132_) {
		try {
			for (final JagexInterface class1892 : class189s) {
				final JagexInterface jagexInterface = class1892;
				if (jagexInterface != null && jagexInterface.anInt2029 == i_132_ && (!jagexInterface.aBoolean2041 || !client.method59(jagexInterface))) {
					if (jagexInterface.type == 0) {
						if (!jagexInterface.aBoolean2041 && client.method59(jagexInterface) && CursorType.aClass189_1243 != jagexInterface) {
							continue;
						}
						method1991(class189s, (byte) -23, jagexInterface.bitPacked);
						if (jagexInterface.aClass189Array2072 != null) {
							method1991(jagexInterface.aClass189Array2072, (byte) -23, jagexInterface.bitPacked);
						}
						final OverridedJInterface class120_sub26 = (OverridedJInterface) Class120_Sub12_Sub13.overridedInterfaces.get(jagexInterface.bitPacked);
						if (class120_sub26 != null) {
							AbstractGraphicsBuffer.method1846(-22845, class120_sub26.interfaceId);
						}
					}
					if (jagexInterface.type == 6) {
						if ((jagexInterface.anInt1945 ^ 0xffffffff) != 0 || (jagexInterface.anInt1990 ^ 0xffffffff) != 0) {
							final boolean bool = Class120_Sub12_Sub35.method1382(jagexInterface, (byte) -122);
							int i_134_;
							if (bool) {
								i_134_ = jagexInterface.anInt1990;
							} else {
								i_134_ = jagexInterface.anInt1945;
							}
							if ((i_134_ ^ 0xffffffff) != 0) {
								final Class40 class40 = Class120_Sub30_Sub2.method1763(i_134_, i + 149);
								if (class40 != null) {
									jagexInterface.anInt1965 += Class120_Sub12_Sub22.anInt3301;
									while (class40.anIntArray338[jagexInterface.anInt1946] < jagexInterface.anInt1965) {
										jagexInterface.anInt1965 -= class40.anIntArray338[jagexInterface.anInt1946];
										jagexInterface.anInt1946++;
										if (jagexInterface.anInt1946 >= class40.anIntArray342.length) {
											jagexInterface.anInt1946 -= class40.anInt346;
											if (jagexInterface.anInt1946 < 0 || class40.anIntArray342.length <= jagexInterface.anInt1946) {
												jagexInterface.anInt1946 = 0;
											}
										}
										jagexInterface.anInt2098 = jagexInterface.anInt1946 + 1;
										if (class40.anIntArray342.length <= jagexInterface.anInt2098) {
											jagexInterface.anInt2098 -= class40.anInt346;
											if (jagexInterface.anInt2098 < 0 || class40.anIntArray342.length <= jagexInterface.anInt2098) {
												jagexInterface.anInt2098 = -1;
											}
										}
										InterfaceClickMask.redrawInterface(jagexInterface);
									}
								}
							}
						}
						if (jagexInterface.anInt1969 != 0 && !jagexInterface.aBoolean2041) {
							int i_135_ = jagexInterface.anInt1969 >> 16;
							i_135_ *= Class120_Sub12_Sub22.anInt3301;
							int i_136_ = jagexInterface.anInt1969 << 16 >> 16;
							jagexInterface.anInt2047 = i_135_ + jagexInterface.anInt2047 & 0x7ff;
							i_136_ *= Class120_Sub12_Sub22.anInt3301;
							jagexInterface.anInt2091 = i_136_ + jagexInterface.anInt2091 & 0x7ff;
							InterfaceClickMask.redrawInterface(jagexInterface);
						}
					}
				}
			}
			if (i != -23) {
				method1989(null, false);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("qa.D(").append(class189s != null ? "{...}" : "null").append(',').append(i).append(',').append(i_132_).append(')').toString());
		}
	}

	final void method1992(final boolean bool, final Buffer class120_sub7) {
		do {
			try {
				for (;;) {
					final int i = class120_sub7.getUByte();
					if (i == 0) {
						break;
					}
					method1987(i, class120_sub7, true);
				}
				if (!bool) {
					break;
				}
			} catch (final RuntimeException runtimeexception) {
				throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("qa.E(").append(bool).append(',').append(class120_sub7 != null ? "{...}" : "null").append(')').toString());
			}
		} while (false);
	}

	final boolean method1993(final int i) {
		boolean bool;
		try {
			if (i != -32390) {
				method1988(-50, false, null);
			}
			boolean bool_137_ = true;
			for (int i_138_ = 0; i_138_ < 5; i_138_++) {
				if (anIntArray1335[i_138_] != -1 && !SceneGroundObject.aClass50_2839.method440(anIntArray1335[i_138_], true, 0)) {
					bool_137_ = false;
				}
			}
			bool = bool_137_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("qa.K(").append(i).append(')').toString());
		}
		return bool;
	}

	static final Class139 list(final int i_5_) {
		Class139 class139_6_ = (Class139) Class120_Sub12_Sub37.aClass21_3427.get(i_5_);
		if (class139_6_ != null) {
			return class139_6_;
		}
		final byte[] is = Class147.aClass50_1394.getFile(3, i_5_);
		class139_6_ = new Class139();
		if (is != null) {
			class139_6_.method1992(true, new Buffer(is));
		}
		Class120_Sub12_Sub37.aClass21_3427.put(class139_6_, i_5_);
		return class139_6_;
	}

	public Class139() {
		/* empty */
	}
}
