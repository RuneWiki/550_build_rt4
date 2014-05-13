/* Class120_Sub14_Sub16 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import javax.media.opengl.GL;

final class Class120_Sub14_Sub16 extends NodeSub {
	private Hashtable aClass75_3587;
	static JagexInterface aClass189_3588;
	static int anInt3589 = -1;
	static int anInt3590 = -1;

	public static void method1560(final int i) {
		try {
			aClass189_3588 = null;
			if (i < 45) {
				method1562((byte) -20);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ro.G(").append(i).append(')').toString());
		}
	}

	static final void method1561(final int i, final int i_0_, final int i_1_, final byte[][][] is, final int i_2_, final byte i_3_, final int i_4_, final int i_5_) {
		Class120_Sub12_Sub9.anInt3193++;
		Class120_Sub17.anInt2615 = 0;
		final int i_6_ = i_4_ - 16;
		final int i_7_ = i_4_ + 16;
		final int i_8_ = i_5_ - 16;
		final int i_9_ = i_5_ + 16;
		for (int i_10_ = Class190.anInt2101; i_10_ < Class142.anInt1361; i_10_++) {
			final GroundTile[][] class120_sub18s = Class120_Sub1.groundTiles[i_10_];
			for (int i_11_ = Class160.anInt1493; i_11_ < Class53.anInt487; i_11_++) {
				for (int i_12_ = Class31.anInt248; i_12_ < Class45.anInt396; i_12_++) {
					final GroundTile class120_sub18 = class120_sub18s[i_11_][i_12_];
					if (class120_sub18 != null) {
						if (!SpotAnimType.aBooleanArrayArray992[i_11_ - Class120_Sub12_Sub26.anInt3332 + Class120_Sub14_Sub13.anInt3563][i_12_ - Class112.anInt1080 + Class120_Sub14_Sub13.anInt3563] || is != null && i_10_ >= i_2_ && is[i_10_][i_11_][i_12_] == i_3_) {
							class120_sub18.aBoolean2647 = false;
							class120_sub18.aBoolean2624 = false;
							class120_sub18.anInt2633 = 0;
							if (i_11_ >= i_6_ && i_11_ <= i_7_ && i_12_ >= i_8_ && i_12_ <= i_9_) {
								if (class120_sub18.aClass182_2628 != null) {
									final Class182 class182 = class120_sub18.aClass182_2628;
									class182.aClass180_1800.method2266(0, i_10_, class182.anInt1801, class182.anInt1797, class182.anInt1795);
									if (class182.aClass180_1796 != null) {
										class182.aClass180_1796.method2266(0, i_10_, class182.anInt1801, class182.anInt1797, class182.anInt1795);
									}
								}
								if (class120_sub18.aClass186_2639 != null) {
									final Class186 class186 = class120_sub18.aClass186_2639;
									class186.aClass180_1901.method2266(class186.anInt1896, i_10_, class186.anInt1894, class186.anInt1893, class186.anInt1891);
									if (class186.aClass180_1898 != null) {
										class186.aClass180_1898.method2266(class186.anInt1896, i_10_, class186.anInt1894, class186.anInt1893, class186.anInt1891);
									}
								}
								if (class120_sub18.aClass36_2650 != null) {
									final Class36 class36 = class120_sub18.aClass36_2650;
									class36.aClass180_309.method2266(0, i_10_, class36.anInt312, class36.anInt311, class36.anInt310);
								}
								if (class120_sub18.aClass28Array2625 != null) {
									for (int i_13_ = 0; i_13_ < class120_sub18.anInt2638; i_13_++) {
										final Class28 class28 = class120_sub18.aClass28Array2625[i_13_];
										class28.aClass180_174.method2266(class28.anInt172, i_10_, class28.anInt179, class28.anInt178, class28.anInt185);
									}
								}
							}
						} else {
							class120_sub18.aBoolean2647 = true;
							class120_sub18.aBoolean2624 = true;
							if (class120_sub18.anInt2638 > 0) {
								class120_sub18.aBoolean2631 = true;
							} else {
								class120_sub18.aBoolean2631 = false;
							}
							Class120_Sub17.anInt2615++;
						}
					}
				}
			}
		}
		final boolean bool = Class120_Sub26.anIntArrayArrayArray2741 == Class24.anIntArrayArrayArray140;
		if (HDToolkit.glEnabled) {
			final GL gl = HDToolkit.gl;
			gl.glPushMatrix();
			gl.glTranslatef(-i, -i_0_, -i_1_);
			if (bool) {
				Class120_Sub12_Sub25.method1331();
				Class120_Sub14_Sub13.method1532(3, -1);
				Class120_Sub14_Sub11.aBoolean3545 = true;
				WaterShader.method165();
				Class120_Sub12_Sub19.anInt3281 = -1;
				Class120_Sub14_Sub18.anInt3612 = -1;
				for (int i_14_ = 0; i_14_ < Canvas_Sub1.aClass120_Sub9ArrayArray17[0].length; i_14_++) {
					final Class120_Sub9 class120_sub9 = Canvas_Sub1.aClass120_Sub9ArrayArray17[0][i_14_];
					final float f = 251.5F - (class120_sub9.aBoolean2516 ? 1.0F : 0.5F);
					if (class120_sub9.anInt2505 != Class120_Sub12_Sub19.anInt3281) {
						Class120_Sub12_Sub19.anInt3281 = class120_sub9.anInt2505;
						Class69.method614(class120_sub9.anInt2505, 65535);
						Class117.method1011(Class29.method251(72));
					}
					class120_sub9.method1162(Class120_Sub1.groundTiles, f, false);
				}
				WaterShader.method163();
			} else {
				for (int i_15_ = Class190.anInt2101; i_15_ < Class142.anInt1361; i_15_++) {
					for (int i_16_ = 0; i_16_ < Canvas_Sub1.aClass120_Sub9ArrayArray17[i_15_].length; i_16_++) {
						final Class120_Sub9 class120_sub9 = Canvas_Sub1.aClass120_Sub9ArrayArray17[i_15_][i_16_];
						final float f = 201.5F - 50.0F * i_15_ - (class120_sub9.aBoolean2516 ? 1.0F : 0.5F);
						if (class120_sub9.anInt2520 != -1 && Class120_Sub12_Sub29.method1355(Rasterizer.anInterface5_973.method18(class120_sub9.anInt2520, 255), (byte) -106) && PacketBuffer.highWaterDetail) {
							Class69.method614(class120_sub9.anInt2505, 65535);
						}
						class120_sub9.method1162(Class120_Sub1.groundTiles, f, false);
					}
					if (i_15_ == 0 && Class74.sceneryShadowsType > 0) {
						HDToolkit.method527(101.5F);
						Class47.method392(Class120_Sub12_Sub26.anInt3332, Class112.anInt1080, Class120_Sub14_Sub13.anInt3563, i_0_, SpotAnimType.aBooleanArrayArray992, Class120_Sub26.anIntArrayArrayArray2741[0]);
					}
				}
				LightManager.method1863(Class120_Sub12_Sub26.anInt3332, Class112.anInt1080, Class120_Sub1.groundTiles);
			}
			gl.glPopMatrix();
		}
		for (int i_17_ = Class190.anInt2101; i_17_ < Class142.anInt1361; i_17_++) {
			final GroundTile[][] class120_sub18s = Class120_Sub1.groundTiles[i_17_];
			for (int i_18_ = -Class120_Sub14_Sub13.anInt3563; i_18_ <= 0; i_18_++) {
				final int i_19_ = Class120_Sub12_Sub26.anInt3332 + i_18_;
				final int i_20_ = Class120_Sub12_Sub26.anInt3332 - i_18_;
				if (i_19_ >= Class160.anInt1493 || i_20_ < Class53.anInt487) {
					for (int i_21_ = -Class120_Sub14_Sub13.anInt3563; i_21_ <= 0; i_21_++) {
						final int i_22_ = Class112.anInt1080 + i_21_;
						final int i_23_ = Class112.anInt1080 - i_21_;
						if (i_19_ >= Class160.anInt1493) {
							if (i_22_ >= Class31.anInt248) {
								final GroundTile class120_sub18 = class120_sub18s[i_19_][i_22_];
								if (class120_sub18 != null && class120_sub18.aBoolean2647) {
									Class139.method1989(class120_sub18, true);
								}
							}
							if (i_23_ < Class45.anInt396) {
								final GroundTile class120_sub18 = class120_sub18s[i_19_][i_23_];
								if (class120_sub18 != null && class120_sub18.aBoolean2647) {
									Class139.method1989(class120_sub18, true);
								}
							}
						}
						if (i_20_ < Class53.anInt487) {
							if (i_22_ >= Class31.anInt248) {
								final GroundTile class120_sub18 = class120_sub18s[i_20_][i_22_];
								if (class120_sub18 != null && class120_sub18.aBoolean2647) {
									Class139.method1989(class120_sub18, true);
								}
							}
							if (i_23_ < Class45.anInt396) {
								final GroundTile class120_sub18 = class120_sub18s[i_20_][i_23_];
								if (class120_sub18 != null && class120_sub18.aBoolean2647) {
									Class139.method1989(class120_sub18, true);
								}
							}
						}
						if (Class120_Sub17.anInt2615 == 0) {
							if (!bool) {
								Class120_Sub12_Sub7.aBoolean3181 = false;
							}
							return;
						}
					}
				}
			}
		}
		for (int i_24_ = Class190.anInt2101; i_24_ < Class142.anInt1361; i_24_++) {
			final GroundTile[][] class120_sub18s = Class120_Sub1.groundTiles[i_24_];
			for (int i_25_ = -Class120_Sub14_Sub13.anInt3563; i_25_ <= 0; i_25_++) {
				final int i_26_ = Class120_Sub12_Sub26.anInt3332 + i_25_;
				final int i_27_ = Class120_Sub12_Sub26.anInt3332 - i_25_;
				if (i_26_ >= Class160.anInt1493 || i_27_ < Class53.anInt487) {
					for (int i_28_ = -Class120_Sub14_Sub13.anInt3563; i_28_ <= 0; i_28_++) {
						final int i_29_ = Class112.anInt1080 + i_28_;
						final int i_30_ = Class112.anInt1080 - i_28_;
						if (i_26_ >= Class160.anInt1493) {
							if (i_29_ >= Class31.anInt248) {
								final GroundTile class120_sub18 = class120_sub18s[i_26_][i_29_];
								if (class120_sub18 != null && class120_sub18.aBoolean2647) {
									Class139.method1989(class120_sub18, false);
								}
							}
							if (i_30_ < Class45.anInt396) {
								final GroundTile class120_sub18 = class120_sub18s[i_26_][i_30_];
								if (class120_sub18 != null && class120_sub18.aBoolean2647) {
									Class139.method1989(class120_sub18, false);
								}
							}
						}
						if (i_27_ < Class53.anInt487) {
							if (i_29_ >= Class31.anInt248) {
								final GroundTile class120_sub18 = class120_sub18s[i_27_][i_29_];
								if (class120_sub18 != null && class120_sub18.aBoolean2647) {
									Class139.method1989(class120_sub18, false);
								}
							}
							if (i_30_ < Class45.anInt396) {
								final GroundTile class120_sub18 = class120_sub18s[i_27_][i_30_];
								if (class120_sub18 != null && class120_sub18.aBoolean2647) {
									Class139.method1989(class120_sub18, false);
								}
							}
						}
						if (Class120_Sub17.anInt2615 == 0) {
							if (!bool) {
								Class120_Sub12_Sub7.aBoolean3181 = false;
							}
							return;
						}
					}
				}
			}
		}
		Class120_Sub12_Sub7.aBoolean3181 = false;
	}

	static final void method1562(final byte i) {
		try {
			Class66.method579(5, (byte) -23);
			Class101_Sub2.method844(5, true);
			Class91.method764(5, 3);
			InterfaceClickMask.method1690(23, 5);
			Class180_Sub3.method2314(5, 3);
			Class81.method706(5, -128);
			Class157.method2087(5, (byte) -86);
			Class101_Sub1.method840(i ^ 0x15, 5);
			SceneGroundObject.method2278(5, (byte) -123);
			OutputStream_Sub1.method73((byte) 125, 5);
			InterfaceClickMask.method1680((byte) 126, 5);
			Class26.method232((byte) 114, 5);
			Class188.method2480(true, 5);
			Class120_Sub12_Sub25.method1329(5, -79);
			Class166.method2181(5, i + 55);
			Class43.method341(5, i ^ ~0x17);
			JagexInterface.method2490(5, 69);
			Class120_Sub12_Sub30.method1360(-99, 5);
			if (i != 23) {
				anInt3590 = -94;
			}
			Class101_Sub4.method851(false, 50);
			Class159.method2094(2260, 5);
			Class124.method1873(i + -24, 5);
			Class120_Sub12_Sub2.aClass21_3144.method192(5);
			Class15.aClass21_95.method192(5);
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ro.H(").append(i).append(')').toString());
		}
	}

	private final void method1563(final Buffer class120_sub7, final byte i, final int i_31_) {
		try {
			if (i_31_ == 249) {
				final int i_32_ = class120_sub7.getUByte();
				if (aClass75_3587 == null) {
					final int i_33_ = Class120_Sub12_Sub17.method1283(i_32_, (byte) -44);
					aClass75_3587 = new Hashtable(i_33_);
				}
				for (int i_34_ = 0; i_32_ > i_34_; i_34_++) {
					final boolean bool = class120_sub7.getUByte() == 1;
					final int i_35_ = class120_sub7.getTriByte();
					Node node;
					if (bool) {
						node = new StringNode(class120_sub7.getJString());
					} else {
						node = new IntegerNode(class120_sub7.getInt());
					}
					aClass75_3587.put(node, i_35_);
				}
			}
			if (i < 122) {
				anInt3589 = 3;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ro.A(").append(class120_sub7 != null ? "{...}" : "null").append(',').append(i).append(',').append(i_31_).append(')').toString());
		}
	}

	final int method1564(final int i, final int i_36_, final int i_37_) {
		int i_38_;
		try {
			if (aClass75_3587 == null) {
				return i;
			}
			final IntegerNode class120_sub32 = (IntegerNode) aClass75_3587.get(i_36_);
			if (i_37_ != -16959) {
				return -123;
			}
			if (class120_sub32 == null) {
				return i;
			}
			i_38_ = class120_sub32.value;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ro.C(").append(i).append(',').append(i_36_).append(',').append(i_37_).append(')').toString());
		}
		return i_38_;
	}

	public Class120_Sub14_Sub16() {
		/* empty */
	}

	final void method1565(final Buffer class120_sub7, final int i) {
		try {
			for (;;) {
				final int i_39_ = class120_sub7.getUByte();
				if (i_39_ == 0) {
					break;
				}
				method1563(class120_sub7, (byte) 127, i_39_);
			}
			if (i != 0) {
				method1563(null, (byte) -85, 16);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ro.E(").append(class120_sub7 != null ? "{...}" : "null").append(',').append(i).append(')').toString());
		}
	}

	static final int method1566(final int i, int i_40_, final int i_41_, final byte i_42_) {
		int i_43_;
		try {
			i_40_ &= 0x3;
			if (i_40_ == 0) {
				return i;
			}
			if (i_42_ != 24) {
				aClass189_3588 = null;
			}
			if (i_40_ == 1) {
				return i_41_;
			}
			if (i_40_ == 2) {
				return -i + 1023;
			}
			i_43_ = 1023 + -i_41_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ro.B(").append(i).append(',').append(i_40_).append(',').append(i_41_).append(',').append(i_42_).append(')').toString());
		}
		return i_43_;
	}

	static final void method1567(final boolean bool, final byte i) {
		try {
			if (i != -15) {
				method1560(41);
			}
			Class120_Sub12_Sub34.anIntArray3409 = new int[104];
			OutputStream_Sub1.anInt29 = 99;
			int i_44_;
			if (bool) {
				i_44_ = 1;
			} else {
				i_44_ = 4;
			}
			Buffer.anIntArray2477 = new int[104];
			Class99.aByteArrayArrayArray949 = new byte[i_44_][104][104];
			Class8.aByteArrayArrayArray65 = new byte[i_44_][104][104];
			StringNode.anIntArray2733 = new int[104];
			Npc.aByteArrayArrayArray3754 = new byte[i_44_][105][105];
			Class120_Sub12_Sub31.anIntArray3383 = new int[104];
			Class120_Sub4.aByteArrayArrayArray2441 = new byte[i_44_][104][104];
			Class110.anIntArrayArrayArray1050 = new int[i_44_][105][105];
			Class120_Sub14_Sub5.aByteArrayArrayArray3477 = new byte[i_44_][104][104];
			PacketBuffer.anIntArray3120 = new int[104];
			CanvasWrapper.anIntArray21 = new int[5];
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ro.F(").append(bool).append(',').append(i).append(')').toString());
		}
	}

	final String method1568(final String string, final int i, final byte i_45_) {
		String string_46_;
		try {
			if (i_45_ >= -105) {
				aClass189_3588 = null;
			}
			if (aClass75_3587 == null) {
				return string;
			}
			final StringNode class120_sub25 = (StringNode) aClass75_3587.get(i);
			if (class120_sub25 == null) {
				return string;
			}
			string_46_ = class120_sub25.value;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ro.D(").append(string != null ? "{...}" : "null").append(',').append(i).append(',').append(i_45_).append(')').toString());
		}
		return string_46_;
	}
}
