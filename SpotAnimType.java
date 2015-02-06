/* Class103 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class SpotAnimType {
	private int ambient = 0;
	static int anInt986;
	static int[] anIntArray987 = { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };
	private int contrast;
	boolean aBoolean989;
	private int resizeX;
	int animationId = -1;
	static boolean[][] aBooleanArrayArray992;
	private short[] recolorModified;
	static short[] aShortArray994;
	private int modelId;
	private int rotation;
	int myId;
	boolean aBoolean998;
	private int resizeY;
	private short[] retextureOriginal;
	private short[] retextureModified;
	private short[] recolorOriginal;
	static js5 aClass50_1443;
	static ObjectCache modelCache = new ObjectCache(30);
	static ObjectCache recentUse = new ObjectCache(64);

	static final boolean isFriendOrSelf(final String name) {
		if (name == null) {
			return false;
		}
		for (int id = 0; id < ProducingGraphicsBuffer.friendCount; id++) {
			if (name.equalsIgnoreCase(Class120_Sub16.friendsName[id])) {
				return true;
			}
		}
		if (name.equalsIgnoreCase(TileParticleQueue.selfPlayer.name)) {
			return true;
		}
		return false;
	}

	static final void method876() {
		for (int i_1_ = 0; i_1_ < 5; i_1_++) {
			Class120_Sub12_Sub12.aBooleanArray3223[i_1_] = false;
		}
		AbstractGraphicsBuffer.anInt1157 = -1;
		Class120_Sub12_Sub31.anInt3384 = 0;
		Class101_Sub1.anInt2272 = 0;
		Class120_Sub12_Sub15.anInt3248 = -1;
		client.cameraType = 1;
	}

	private final void decode(final Buffer buffer, final int code) {
		if (code == 1) {
			modelId = buffer.getUShort();
		} else if (code == 2) {
			this.animationId = buffer.getUShort();
		} else if (code == 4) {
			resizeX = buffer.getUShort();
		} else if (code == 5) {
			resizeY = buffer.getUShort();
		} else if (code == 6) {
			rotation = buffer.getUShort();
		} else if (code == 7) {
			ambient = buffer.getUByte();
		} else if (code == 8) {
			contrast = buffer.getUByte();
		} else if (code == 9) {
			this.aBoolean989 = true;
		} else if (code == 10) {
			this.aBoolean998 = true;
		} else if (code == 40) {
			final int len = buffer.getUByte();
			recolorOriginal = new short[len];
			recolorModified = new short[len];
			for (int id = 0; id < len; id++) {
				recolorOriginal[id] = (short) buffer.getUShort();
				recolorModified[id] = (short) buffer.getUShort();
			}
		} else if (code == 41) {
			final int len = buffer.getUByte();
			retextureOriginal = new short[len];
			retextureModified = new short[len];
			for (int id = 0; id < len; id++) {
				retextureOriginal[id] = (short) buffer.getUShort();
				retextureModified[id] = (short) buffer.getUShort();
			}
		}
	}

	public static void method878() {
		modelCache = null;
		anIntArray987 = null;
		aShortArray994 = null;
		aBooleanArrayArray992 = null;
	}

	static final int[] arrayCopy(final int[] is) {
		if (is == null) {
			return null;
		}
		final int[] is_8_ = new int[is.length];
		ArrayUtils.arrayCopy(is, 0, is_8_, 0, is.length);
		return is_8_;
	}

	static final void method880() {
		if (HDToolkit.glEnabled) {
			if (!Class93.aBoolean870) {
				final GroundTile[][][] class120_sub18s = LabelGroup.groundTiles;
				for (int i_11_ = 0; i_11_ < class120_sub18s.length; i_11_++) {
					final GroundTile[][] class120_sub18s_12_ = class120_sub18s[i_11_];
					for (final GroundTile[] element : class120_sub18s_12_) {
						for (int i_14_ = 0; element.length > i_14_; i_14_++) {
							final GroundTile class120_sub18 = element[i_14_];
							if (class120_sub18 != null) {
								if (class120_sub18.groundDecoration != null && class120_sub18.groundDecoration.sceneGraphNode instanceof HDModelRenderer) {
									final HDModelRenderer class180_sub7_sub2 = (HDModelRenderer) class120_sub18.groundDecoration.sceneGraphNode;
									if (0L == (~0x7fffffffffffffffL & class120_sub18.groundDecoration.bitPackedUid)) {
										class180_sub7_sub2.method2432(false, true, true, true, false, true, true);
									} else {
										class180_sub7_sub2.method2432(true, true, true, true, true, true, true);
									}
								}
								if (class120_sub18.aClass186_2639 != null) {
									if (class120_sub18.aClass186_2639.aClass180_1901 instanceof HDModelRenderer) {
										final HDModelRenderer class180_sub7_sub2 = (HDModelRenderer) class120_sub18.aClass186_2639.aClass180_1901;
										if ((class120_sub18.aClass186_2639.bitPacked & ~0x7fffffffffffffffL) != 0L) {
											class180_sub7_sub2.method2432(true, true, true, true, true, true, true);
										} else {
											class180_sub7_sub2.method2432(false, true, true, true, false, true, true);
										}
									}
									if (class120_sub18.aClass186_2639.aClass180_1898 instanceof HDModelRenderer) {
										final HDModelRenderer class180_sub7_sub2 = (HDModelRenderer) class120_sub18.aClass186_2639.aClass180_1898;
										if (0L == (~0x7fffffffffffffffL & class120_sub18.aClass186_2639.bitPacked)) {
											class180_sub7_sub2.method2432(false, true, true, true, false, true, true);
										} else {
											class180_sub7_sub2.method2432(true, true, true, true, true, true, true);
										}
									}
								}
								if (class120_sub18.aClass182_2628 != null) {
									if (class120_sub18.aClass182_2628.aClass180_1800 instanceof HDModelRenderer) {
										final HDModelRenderer class180_sub7_sub2 = (HDModelRenderer) class120_sub18.aClass182_2628.aClass180_1800;
										if ((~0x7fffffffffffffffL & class120_sub18.aClass182_2628.bitPacked) == 0L) {
											class180_sub7_sub2.method2432(false, true, true, true, false, true, true);
										} else {
											class180_sub7_sub2.method2432(true, true, true, true, true, true, true);
										}
									}
									if (class120_sub18.aClass182_2628.aClass180_1796 instanceof HDModelRenderer) {
										final HDModelRenderer class180_sub7_sub2 = (HDModelRenderer) class120_sub18.aClass182_2628.aClass180_1796;
										if (-1L != (class120_sub18.aClass182_2628.bitPacked & ~0x7fffffffffffffffL ^ 0xffffffffffffffffL)) {
											class180_sub7_sub2.method2432(true, true, true, true, true, true, true);
										} else {
											class180_sub7_sub2.method2432(false, true, true, true, false, true, true);
										}
									}
								}
								for (int i_15_ = 0; class120_sub18.anInt2638 > i_15_; i_15_++) {
									if (class120_sub18.aClass28Array2625[i_15_].aClass180_174 instanceof HDModelRenderer) {
										final HDModelRenderer class180_sub7_sub2 = (HDModelRenderer) class120_sub18.aClass28Array2625[i_15_].aClass180_174;
										if (0L == (~0x7fffffffffffffffL & class120_sub18.aClass28Array2625[i_15_].bitPacked)) {
											class180_sub7_sub2.method2432(false, true, true, true, false, true, true);
										} else {
											class180_sub7_sub2.method2432(true, true, true, true, true, true, true);
										}
									}
								}
							}
						}
					}
				}
				Class93.aBoolean870 = true;
			}
		}
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

	final AbstractModelRenderer constructModel(final int nextFrame, final int delay, final int frame) {
		AbstractModelRenderer cachedModel = (AbstractModelRenderer) modelCache.get(this.myId);
		if (cachedModel == null) {
			final Model class180_sub2 = Model.get(Class90.aClass50_843, modelId, 0);
			if (class180_sub2 == null) {
				return null;
			}
			if (recolorOriginal != null) {
				for (int i_20_ = 0; i_20_ < recolorOriginal.length; i_20_++) {
					class180_sub2.recolor(recolorOriginal[i_20_], recolorModified[i_20_]);
				}
			}
			if (retextureOriginal != null) {
				for (int i_21_ = 0; retextureOriginal.length > i_21_; i_21_++) {
					class180_sub2.retexture(retextureOriginal[i_21_], retextureModified[i_21_]);
				}
			}
			cachedModel = class180_sub2.toRenderer(ambient + 64, 850 + contrast, -30, -50, -30);
			modelCache.put(cachedModel, this.myId);
		}
		AbstractModelRenderer transformedModel;
		if (this.animationId == -1 || frame == -1) {
			transformedModel = cachedModel.method2381(true, true, true);
		} else {
			transformedModel = SeqType.list(this.animationId).method324(cachedModel, frame, delay, nextFrame);
		}
		if (resizeX != 128 || resizeY != 128) {
			transformedModel.resize(resizeX, resizeY, resizeX);
		}
		if (rotation != 0) {
			if (rotation == 90) {
				transformedModel.rotate90();
			}
			if (rotation == 180) {
				transformedModel.rotate180();
			}
			if (rotation == 270) {
				transformedModel.rotate270();
			}
		}
		return transformedModel;
	}

	static final SpotAnimType list(final int id) {
		SpotAnimType spotAnimType = (SpotAnimType) recentUse.get(id);
		if (spotAnimType != null) {
			return spotAnimType;
		}
		final byte[] data = SpotAnimType.aClass50_1443.getFile(id >>> 8, id & 0xff);
		spotAnimType = new SpotAnimType();
		spotAnimType.myId = id;
		if (data != null) {
			spotAnimType.decode(new Buffer(data));
		}
		recentUse.put(spotAnimType, id);
		return spotAnimType;
	}

	public SpotAnimType() {
		this.aBoolean989 = false;
		resizeX = 128;
		resizeY = 128;
		rotation = 0;
		this.aBoolean998 = false;
		contrast = 0;
	}
}
