/* Class120_Sub14_Sub16 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import javax.media.opengl.GL;

final class StructType extends NodeSub {
	private Hashtable params;
	static js5 configClient;
	static NodeCache recentUse = new NodeCache(64);
	static JagexInterface aClass189_3588;
	static int titlebgId = -1;
	static int gameScreenDrawY = -1;

	static final void method1561(final int i, final int i_0_, final int i_1_, final byte[][][] is, final int i_2_, final byte i_3_, final int i_4_, final int i_5_) {
		Class120_Sub12_Sub9.anInt3193++;
		ObjectContainer.anInt2615 = 0;
		final int i_6_ = i_4_ - 16;
		final int i_7_ = i_4_ + 16;
		final int i_8_ = i_5_ - 16;
		final int i_9_ = i_5_ + 16;
		for (int i_10_ = Class190.anInt2101; i_10_ < MapSceneType.activeGroundTileLength; i_10_++) {
			final GroundTile[][] class120_sub18s = LabelGroup.activeGroundTiles[i_10_];
			for (int i_11_ = GrandExchangeObject.anInt1493; i_11_ < Class53.anInt487; i_11_++) {
				for (int i_12_ = Class31.anInt248; i_12_ < Js5Worker.anInt396; i_12_++) {
					final GroundTile class120_sub18 = class120_sub18s[i_11_][i_12_];
					if (class120_sub18 != null) {
						if (!SpotAnimType.aBooleanArrayArray992[i_11_ - Class120_Sub12_Sub26.anInt3332 + Class120_Sub14_Sub13.anInt3563][i_12_ - Class112.anInt1080 + Class120_Sub14_Sub13.anInt3563] || is != null && i_10_ >= i_2_ && is[i_10_][i_11_][i_12_] == i_3_) {
							class120_sub18.aBoolean2647 = false;
							class120_sub18.aBoolean2624 = false;
							class120_sub18.anInt2633 = 0;
							if (i_11_ >= i_6_ && i_11_ <= i_7_ && i_12_ >= i_8_ && i_12_ <= i_9_) {
								if (class120_sub18.wallLocation != null) {
									final WallLocation class182 = class120_sub18.wallLocation;
									class182.aClass180_1800.method2266(0, i_10_, class182.renderX, class182.renderY, class182.renderZ);
									if (class182.aClass180_1796 != null) {
										class182.aClass180_1796.method2266(0, i_10_, class182.renderX, class182.renderY, class182.renderZ);
									}
								}
								if (class120_sub18.wallDecoration != null) {
									final WallDecoration class186 = class120_sub18.wallDecoration;
									class186.aClass180_1901.method2266(class186.anInt1896, i_10_, class186.renderX, class186.renderY, class186.renderZ);
									if (class186.aClass180_1898 != null) {
										class186.aClass180_1898.method2266(class186.anInt1896, i_10_, class186.renderX, class186.renderY, class186.renderZ);
									}
								}
								if (class120_sub18.groundDecoration != null) {
									final GroundDecoration class36 = class120_sub18.groundDecoration;
									class36.sceneGraphNode.method2266(0, i_10_, class36.renderX, class36.renderY, class36.renderZ);
								}
								if (class120_sub18.aClass28Array2625 != null) {
									for (int i_13_ = 0; i_13_ < class120_sub18.anInt2638; i_13_++) {
										final Class28 class28 = class120_sub18.aClass28Array2625[i_13_];
										class28.aClass180_174.method2266(class28.anInt172, i_10_, class28.anInt178, class28.anInt179, class28.anInt185);
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
		final boolean bool = OverridedJInterface.activeTileHeightMap == Class24.underWaterTileHeightMap;
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
				FrameGroup.anInt3612 = -1;
				for (int i_14_ = 0; i_14_ < Canvas_Sub1.activeHdTiles[0].length; i_14_++) {
					final HDTile class120_sub9 = Canvas_Sub1.activeHdTiles[0][i_14_];
					final float f = 251.5F - (class120_sub9.blend ? 1.0F : 0.5F);
					if (class120_sub9.anInt2505 != Class120_Sub12_Sub19.anInt3281) {
						Class120_Sub12_Sub19.anInt3281 = class120_sub9.anInt2505;
						Class69.method614(class120_sub9.anInt2505);
						AtmosphereManager.setFogColor(EntityRenderData.method251());
					}
					class120_sub9.method1162(LabelGroup.activeGroundTiles, f, false);
				}
				WaterShader.method163();
			} else {
				for (int i_15_ = Class190.anInt2101; i_15_ < MapSceneType.activeGroundTileLength; i_15_++) {
					for (int i_16_ = 0; i_16_ < Canvas_Sub1.activeHdTiles[i_15_].length; i_16_++) {
						final HDTile class120_sub9 = Canvas_Sub1.activeHdTiles[i_15_][i_16_];
						final float f = 201.5F - 50.0F * i_15_ - (class120_sub9.blend ? 1.0F : 0.5F);
						if (class120_sub9.textureId != -1 && Class120_Sub12_Sub29.method1355(Rasterizer.anInterface5_973.method18(class120_sub9.textureId)) && PacketBuffer.highWaterDetail) {
							Class69.method614(class120_sub9.anInt2505);
						}
						class120_sub9.method1162(LabelGroup.activeGroundTiles, f, false);
					}
					if (i_15_ == 0 && Class74.sceneryShadowsType > 0) {
						HDToolkit.method527(101.5F);
						ShadowManager.drawShadows(Class120_Sub12_Sub26.anInt3332, Class112.anInt1080, Class120_Sub14_Sub13.anInt3563, i_0_, SpotAnimType.aBooleanArrayArray992, OverridedJInterface.activeTileHeightMap[0]);
					}
				}
				LightManager.method1863(Class120_Sub12_Sub26.anInt3332, Class112.anInt1080, LabelGroup.activeGroundTiles);
			}
			gl.glPopMatrix();
		}
		for (int i_17_ = Class190.anInt2101; i_17_ < MapSceneType.activeGroundTileLength; i_17_++) {
			final GroundTile[][] class120_sub18s = LabelGroup.activeGroundTiles[i_17_];
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
									Identikit.method1989(class120_sub18, true);
								}
							}
							if (i_23_ < Js5Worker.anInt396) {
								final GroundTile class120_sub18 = class120_sub18s[i_19_][i_23_];
								if (class120_sub18 != null && class120_sub18.aBoolean2647) {
									Identikit.method1989(class120_sub18, true);
								}
							}
						}
						if (i_20_ < Class53.anInt487) {
							if (i_22_ >= Class31.anInt248) {
								final GroundTile class120_sub18 = class120_sub18s[i_20_][i_22_];
								if (class120_sub18 != null && class120_sub18.aBoolean2647) {
									Identikit.method1989(class120_sub18, true);
								}
							}
							if (i_23_ < Js5Worker.anInt396) {
								final GroundTile class120_sub18 = class120_sub18s[i_20_][i_23_];
								if (class120_sub18 != null && class120_sub18.aBoolean2647) {
									Identikit.method1989(class120_sub18, true);
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
		for (int i_24_ = Class190.anInt2101; i_24_ < MapSceneType.activeGroundTileLength; i_24_++) {
			final GroundTile[][] class120_sub18s = LabelGroup.activeGroundTiles[i_24_];
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
									Identikit.method1989(class120_sub18, false);
								}
							}
							if (i_30_ < Js5Worker.anInt396) {
								final GroundTile class120_sub18 = class120_sub18s[i_26_][i_30_];
								if (class120_sub18 != null && class120_sub18.aBoolean2647) {
									Identikit.method1989(class120_sub18, false);
								}
							}
						}
						if (i_27_ < Class53.anInt487) {
							if (i_29_ >= Class31.anInt248) {
								final GroundTile class120_sub18 = class120_sub18s[i_27_][i_29_];
								if (class120_sub18 != null && class120_sub18.aBoolean2647) {
									Identikit.method1989(class120_sub18, false);
								}
							}
							if (i_30_ < Js5Worker.anInt396) {
								final GroundTile class120_sub18 = class120_sub18s[i_27_][i_30_];
								if (class120_sub18 != null && class120_sub18.aBoolean2647) {
									Identikit.method1989(class120_sub18, false);
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
		OverlayType.recentUse.method192(5);
		UnderlayType.recentUse.method192(5);
		Identikit.recentUse.method192(5);
		LocType.recentUse.method192(5);
		LocType.aClass21_2663.method192(5);
		LocType.aClass21_1618.method192(5);
		LocType.aClass21_1117.method192(5);
		NpcType.recentUse.method192(5);
		NpcType.aClass21_80.method192(5);
		Projectile.aClass21_2931.method192(5);
		ObjType.recentUse.method192(5);
		Class33.aClass21_273.method192(5);
		SpotAnimation.objectSpriteCache.method192(5);
		SeqType.recentUse.method192(5);
		FrameGroup.recentUse.method192(5);
		SpotAnimType.recentUse.method192(5);
		SpotAnimType.modelCache.method192(5);
		VarBit.recentUse.method192(5);
		Varp.recentUse.method192(5);
		EntityRenderData.recentUse.method192(5);
		MapSceneType.recentUse.method192(5);
		MapSceneType.spriteCache.method192(5);
		MapFunctionType.recentUse.method192(5);
		MapFunctionType.spriteCache.method192(5);
		Class145.aClass21_1486.method192(5);
		Class120_Sub6.aClass21_2443.method192(5);
		Class153.recentUse.method192(5);
		LightType.recentUse.method192(5);
		CursorType.recentUse.method192(5);
		CursorType.graphicCache.method192(5);
		Class43.playerModelsCache.method192(5);
		Class90.playerHeadModelsCache.method192(5);		
		JagexInterface.spriteCache.method192(50);
		JagexInterface.modelCache.method192(50);
		JagexInterface.fontCache.method192(50);
		Class120_Sub14_Sub13.aClass21_3564.method192(5);
		Class154.shadowModelCache.method192(5);
		Class120_Sub12_Sub2.aClass21_3144.method192(5);
		LDFont.fontCache.method192(5);
	}

	private final void decode(final Buffer buffer, final int code) {
		if (code == 249) {
			final int paramsSize = buffer.getUByte();
			if (params == null) {
				final int i_33_ = Class120_Sub12_Sub17.getFarestBitValue(paramsSize);
				params = new Hashtable(i_33_);
			}
			for (int paramId = 0; paramId < paramsSize; paramId++) {
				final boolean isString = buffer.getUByte() == 1;
				final int paramUid = buffer.getMedium();
				Node node;
				if (isString) {
					node = new StringNode(buffer.getJagexString());
				} else {
					node = new IntegerNode(buffer.getInt());
				}
				params.put(node, paramUid);
			}
		}
	}

	final int getIntegerParamValue(final int param, final int defaultInt) {
		if (params == null) {
			return defaultInt;
		}
		final IntegerNode integerNode = (IntegerNode) params.get(param);
		if (integerNode == null) {
			return defaultInt;
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

	static final int method1566(final int x, final int z, int rot) {
		rot &= 0x3;
		if (rot == 0) {
			return x;
		}
		if (rot == 1) {
			return z;
		}
		if (rot == 2) {
			return 1023 - x;
		}
		return 1023 - z;
	}

	static final void method1567(final boolean underwater) {
		Class120_Sub12_Sub34.anIntArray3409 = new int[104];
		DummyOutputStream.anInt29 = 99;
		int levelAmount;
		if (underwater) {
			levelAmount = 1;
		} else {
			levelAmount = 4;
		}
		Buffer.anIntArray2477 = new int[104];
		Class99.tileOverlayIds = new byte[levelAmount][104][104];
		Class8.tileOverlayRotations = new byte[levelAmount][104][104];
		StringNode.anIntArray2733 = new int[104];
		Npc.aByteArrayArrayArray3754 = new byte[levelAmount][105][105];
		Class120_Sub12_Sub31.anIntArray3383 = new int[104];
		Class120_Sub4.tileUnderlayIds = new byte[levelAmount][104][104];
		Class110.tileOccludeFlags = new int[levelAmount][105][105];
		MapFunctionNode.tileOverlayShapes = new byte[levelAmount][104][104];
		PacketBuffer.anIntArray3120 = new int[104];
		CanvasWrapper.anIntArray21 = new int[5];
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
		final byte[] data = configClient.getFile(26, id);
		structType = new StructType();
		if (data != null) {
			structType.decode(new Buffer(data));
		}
		recentUse.put(structType, id);
		return structType;
	}
}
