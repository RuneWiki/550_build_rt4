/* Class120_Sub14_Sub16 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import javax.media.opengl.GL;

final class StructType extends NodeSub {
	private Hashtable params;
	static NodeCache recentUse = new NodeCache(64);
	static JagexInterface aClass189_3588;
	static int titlebgId = -1;
	static int anInt3590 = -1;

	public static void method1560(final int i) {
		try {
			aClass189_3588 = null;
			if (i < 45) {
				method1562();
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("ro.G(").append(i).append(')').toString());
		}
	}

	static final void method1561(final int i, final int i_0_, final int i_1_, final byte[][][] is, final int i_2_, final byte i_3_, final int i_4_, final int i_5_) {
		Class120_Sub12_Sub9.anInt3193++;
		ObjectContainer.anInt2615 = 0;
		final int i_6_ = i_4_ - 16;
		final int i_7_ = i_4_ + 16;
		final int i_8_ = i_5_ - 16;
		final int i_9_ = i_5_ + 16;
		for (int i_10_ = Class190.anInt2101; i_10_ < Class142.anInt1361; i_10_++) {
			final GroundTile[][] class120_sub18s = LabelGroup.groundTiles[i_10_];
			for (int i_11_ = GrandExchangeObject.anInt1493; i_11_ < Class53.anInt487; i_11_++) {
				for (int i_12_ = Class31.anInt248; i_12_ < Js5Worker.anInt396; i_12_++) {
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
							ObjectContainer.anInt2615++;
						}
					}
				}
			}
		}
		final boolean bool = OverridedJInterface.tileHeightMap == Class24.anIntArrayArrayArray140;
		if (HDToolkit.glEnabled) {
			final GL gl = HDToolkit.gl;
			gl.glPushMatrix();
			gl.glTranslatef(-i, -i_0_, -i_1_);
			if (bool) {
				Class120_Sub12_Sub25.method1331();
				Class120_Sub14_Sub13.method1532(3, -1);
				ParamType.aBoolean3545 = true;
				WaterShader.method165();
				Class120_Sub12_Sub19.anInt3281 = -1;
				FrameLoader.anInt3612 = -1;
				for (int i_14_ = 0; i_14_ < Canvas_Sub1.aClass120_Sub9ArrayArray17[0].length; i_14_++) {
					final Class120_Sub9 class120_sub9 = Canvas_Sub1.aClass120_Sub9ArrayArray17[0][i_14_];
					final float f = 251.5F - (class120_sub9.aBoolean2516 ? 1.0F : 0.5F);
					if (class120_sub9.anInt2505 != Class120_Sub12_Sub19.anInt3281) {
						Class120_Sub12_Sub19.anInt3281 = class120_sub9.anInt2505;
						Class69.method614(class120_sub9.anInt2505, 65535);
						Class117.method1011(Class29.method251(72));
					}
					class120_sub9.method1162(LabelGroup.groundTiles, f, false);
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
						class120_sub9.method1162(LabelGroup.groundTiles, f, false);
					}
					if (i_15_ == 0 && Class74.sceneryShadowsType > 0) {
						HDToolkit.method527(101.5F);
						Class47.method392(Class120_Sub12_Sub26.anInt3332, Class112.anInt1080, Class120_Sub14_Sub13.anInt3563, i_0_, SpotAnimType.aBooleanArrayArray992, OverridedJInterface.tileHeightMap[0]);
					}
				}
				LightManager.method1863(Class120_Sub12_Sub26.anInt3332, Class112.anInt1080, LabelGroup.groundTiles);
			}
			gl.glPopMatrix();
		}
		for (int i_17_ = Class190.anInt2101; i_17_ < Class142.anInt1361; i_17_++) {
			final GroundTile[][] class120_sub18s = LabelGroup.groundTiles[i_17_];
			for (int i_18_ = -Class120_Sub14_Sub13.anInt3563; i_18_ <= 0; i_18_++) {
				final int i_19_ = Class120_Sub12_Sub26.anInt3332 + i_18_;
				final int i_20_ = Class120_Sub12_Sub26.anInt3332 - i_18_;
				if (i_19_ >= GrandExchangeObject.anInt1493 || i_20_ < Class53.anInt487) {
					for (int i_21_ = -Class120_Sub14_Sub13.anInt3563; i_21_ <= 0; i_21_++) {
						final int i_22_ = Class112.anInt1080 + i_21_;
						final int i_23_ = Class112.anInt1080 - i_21_;
						if (i_19_ >= GrandExchangeObject.anInt1493) {
							if (i_22_ >= Class31.anInt248) {
								final GroundTile class120_sub18 = class120_sub18s[i_19_][i_22_];
								if (class120_sub18 != null && class120_sub18.aBoolean2647) {
									IdentityKit.method1989(class120_sub18, true);
								}
							}
							if (i_23_ < Js5Worker.anInt396) {
								final GroundTile class120_sub18 = class120_sub18s[i_19_][i_23_];
								if (class120_sub18 != null && class120_sub18.aBoolean2647) {
									IdentityKit.method1989(class120_sub18, true);
								}
							}
						}
						if (i_20_ < Class53.anInt487) {
							if (i_22_ >= Class31.anInt248) {
								final GroundTile class120_sub18 = class120_sub18s[i_20_][i_22_];
								if (class120_sub18 != null && class120_sub18.aBoolean2647) {
									IdentityKit.method1989(class120_sub18, true);
								}
							}
							if (i_23_ < Js5Worker.anInt396) {
								final GroundTile class120_sub18 = class120_sub18s[i_20_][i_23_];
								if (class120_sub18 != null && class120_sub18.aBoolean2647) {
									IdentityKit.method1989(class120_sub18, true);
								}
							}
						}
						if (ObjectContainer.anInt2615 == 0) {
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
			final GroundTile[][] class120_sub18s = LabelGroup.groundTiles[i_24_];
			for (int i_25_ = -Class120_Sub14_Sub13.anInt3563; i_25_ <= 0; i_25_++) {
				final int i_26_ = Class120_Sub12_Sub26.anInt3332 + i_25_;
				final int i_27_ = Class120_Sub12_Sub26.anInt3332 - i_25_;
				if (i_26_ >= GrandExchangeObject.anInt1493 || i_27_ < Class53.anInt487) {
					for (int i_28_ = -Class120_Sub14_Sub13.anInt3563; i_28_ <= 0; i_28_++) {
						final int i_29_ = Class112.anInt1080 + i_28_;
						final int i_30_ = Class112.anInt1080 - i_28_;
						if (i_26_ >= GrandExchangeObject.anInt1493) {
							if (i_29_ >= Class31.anInt248) {
								final GroundTile class120_sub18 = class120_sub18s[i_26_][i_29_];
								if (class120_sub18 != null && class120_sub18.aBoolean2647) {
									IdentityKit.method1989(class120_sub18, false);
								}
							}
							if (i_30_ < Js5Worker.anInt396) {
								final GroundTile class120_sub18 = class120_sub18s[i_26_][i_30_];
								if (class120_sub18 != null && class120_sub18.aBoolean2647) {
									IdentityKit.method1989(class120_sub18, false);
								}
							}
						}
						if (i_27_ < Class53.anInt487) {
							if (i_29_ >= Class31.anInt248) {
								final GroundTile class120_sub18 = class120_sub18s[i_27_][i_29_];
								if (class120_sub18 != null && class120_sub18.aBoolean2647) {
									IdentityKit.method1989(class120_sub18, false);
								}
							}
							if (i_30_ < Js5Worker.anInt396) {
								final GroundTile class120_sub18 = class120_sub18s[i_27_][i_30_];
								if (class120_sub18 != null && class120_sub18.aBoolean2647) {
									IdentityKit.method1989(class120_sub18, false);
								}
							}
						}
						if (ObjectContainer.anInt2615 == 0) {
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

	static final void method1562() {
		InterfaceListener.aClass21_2542.method192(5);
		OverlayType.recentUse.method192(5);
		IdentityKit.recentUse.method192(5);
		LocType.recentUse.method192(5);
		InterfaceClickMask.aClass21_2663.method192(5);
		Class167.aClass21_1618.method192(5);
		Class116.aClass21_1117.method192(5);
		NpcType.recentUse.method192(5);
		Class11.aClass21_80.method192(5);
		Projectile.aClass21_2931.method192(5);
		Canvas_Sub1.aClass21_14.method192(5);
		Class33.aClass21_273.method192(5);
		Class180_Sub3.aClass21_2906.method192(5);
		KeyboardHandler.aClass21_1504.method192(5);
		SceneGraphNode.aClass21_1781.method192(5);
		SpotAnimType.recentUse.method192(5);
		Class182.aClass21_1798.method192(5);
		VarBit.recentUse.method192(5);
		Varp.recentUse.method192(5);
		Class120_Sub12_Sub31.aClass21_3378.method192(5);
		Js5Request.aClass21_3937.method192(5);
		Class132.aClass21_1255.method192(5);
		Class73.recentUse.method192(5);
		Class82.aClass21_786.method192(5);
		Class159.aClass21_1486.method192(5);
		Class120_Sub6.aClass21_2443.method192(5);
		Class120_Sub12_Sub9.aClass21_3196.method192(5);
		Class120_Sub12_Sub35.aClass21_3411.method192(5);
		CursorType.recentUse.method192(5);
		CursorType.spriteCache.method192(5);
		Class43.playerModelsCache.method192(5);
		Class90.playerHeadModelsCache.method192(5);		
		Class180_Sub6.aClass21_3071.method192(50);
		LabelGroup.aClass21_2406.method192(50);
		Class120_Sub12_Sub2.aClass21_3143.method192(50);
		Class120_Sub14_Sub13.aClass21_3564.method192(5);
		Class154.aClass21_1438.method192(5);
		Class120_Sub12_Sub2.aClass21_3144.method192(5);
		Class15.aClass21_95.method192(5);
	}

	private final void decode(final Buffer buffer, final int code) {
		if (code == 249) {
			final int i_32_ = buffer.getUByte();
			if (params == null) {
				final int i_33_ = Class120_Sub12_Sub17.method1283(i_32_);
				params = new Hashtable(i_33_);
			}
			for (int i_34_ = 0; i_32_ > i_34_; i_34_++) {
				final boolean bool = buffer.getUByte() == 1;
				final int i_35_ = buffer.getMedium();
				Node node;
				if (bool) {
					node = new StringNode(buffer.getJString());
				} else {
					node = new IntegerNode(buffer.getInt());
				}
				params.put(node, i_35_);
			}
		}
	}

	final int getIntegerParamValue(final int param, final int defaultInteger) {
		if (params == null) {
			return defaultInteger;
		}
		final IntegerNode integerNode = (IntegerNode) params.get(param);
		if (integerNode == null) {
			return defaultInteger;
		}
		return integerNode.value;
	}

	public StructType() {
		/* empty */
	}

	final void decode(final Buffer buffer) {
		for (;;) {
			final int code = buffer.getUByte();
			if (code == 0) {
				break;
			}
			decode(buffer, code);
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
			throw EnumType.method1428(runtimeexception, new StringBuilder("ro.B(").append(i).append(',').append(i_40_).append(',').append(i_41_).append(',').append(i_42_).append(')').toString());
		}
		return i_43_;
	}

	static final void method1567(final boolean bool, final byte i) {
		try {
			if (i != -15) {
				method1560(41);
			}
			Class120_Sub12_Sub34.anIntArray3409 = new int[104];
			DummyOutputStream.anInt29 = 99;
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
			throw EnumType.method1428(runtimeexception, new StringBuilder("ro.F(").append(bool).append(',').append(i).append(')').toString());
		}
	}

	final String getStringParamValue(final int param, final String defaultString) {
		if (params == null) {
			return defaultString;
		}
		final StringNode stringNode = (StringNode) params.get(param);
		if (stringNode == null) {
			return defaultString;
		}
		return stringNode.value;
	}

	static final StructType list(final int id) {
		StructType structType = (StructType) recentUse.get(id);
		if (structType != null) {
			return structType;
		}
		final byte[] data = SeqType.aClass50_331.getFile(26, id);
		structType = new StructType();
		if (data != null) {
			structType.decode(new Buffer(data));
		}
		recentUse.put(structType, id);
		return structType;
	}
}
