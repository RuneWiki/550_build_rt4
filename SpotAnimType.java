/* Class103 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class SpotAnimType {
	private int ambient = 0;
	static int anInt986;
	static int[] anIntArray987 = { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };
	private int contrast;
	boolean aBoolean989;
	private int scaleX;
	int animationId = -1;
	static boolean[][] aBooleanArrayArray992;
	private short[] recolorModified;
	static short[] aShortArray994;
	private int modelId;
	private int rotation;
	int myId;
	boolean aBoolean998;
	private int scaleY;
	private short[] retextureOriginal;
	private short[] retextureModified;
	private short[] recolorOriginal;
	static ObjectCache recentUse = new ObjectCache(64);

	static final boolean method875(final int i, final String string) {
		boolean bool;
		try {
			if (string == null) {
				return false;
			}
			for (int i_0_ = 0; ProducingGraphicsBuffer.friendCount > i_0_; i_0_++) {
				if (string.equalsIgnoreCase(Class120_Sub16.friendsName[i_0_])) {
					return true;
				}
			}
			if (string.equalsIgnoreCase(TileParticleQueue.selfPlayer.name)) {
				return true;
			}
			bool = false;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("li.C(").append(i).append(',').append(string != null ? "{...}" : "null").append(')').toString());
		}
		return bool;
	}

	static final void method876(final byte i) {
		try {
			if (i > 96) {
				for (int i_1_ = 0; i_1_ < 5; i_1_++) {
					Class120_Sub12_Sub12.aBooleanArray3223[i_1_] = false;
				}
				AbstractGraphicsBuffer.anInt1157 = -1;
				Class120_Sub12_Sub31.anInt3384 = 0;
				Class101_Sub1.anInt2272 = 0;
				Class120_Sub12_Sub15.anInt3248 = -1;
				client.cameraType = 1;
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("li.D(").append(i).append(')').toString());
		}
	}

	private final void decode(final Buffer buffer, final int configCode) {
		if (configCode == 1) {
			modelId = buffer.getUShort();
		} else if (configCode == 2) {
			this.animationId = buffer.getUShort();
		} else if (configCode == 4) {
			scaleX = buffer.getUShort();
		} else if (configCode == 5) {
			scaleY = buffer.getUShort();
		} else if (configCode == 6) {
			rotation = buffer.getUShort();
		} else if (configCode == 7) {
			ambient = buffer.getUByte();
		} else if (configCode == 8) {
			contrast = buffer.getUByte();
		} else if (configCode == 9) {
			this.aBoolean989 = true;
		} else if (configCode == 10) {
			this.aBoolean998 = true;
		} else if (configCode == 40) {
			final int i_3_ = buffer.getUByte();
			recolorModified = new short[i_3_];
			recolorOriginal = new short[i_3_];
			for (int i_4_ = 0; i_3_ > i_4_; i_4_++) {
				recolorOriginal[i_4_] = (short) buffer.getUShort();
				recolorModified[i_4_] = (short) buffer.getUShort();
			}
		} else if (configCode == 41) {
			final int i_5_ = buffer.getUByte();
			retextureOriginal = new short[i_5_];
			retextureModified = new short[i_5_];
			for (int i_6_ = 0; i_6_ < i_5_; i_6_++) {
				retextureOriginal[i_6_] = (short) buffer.getUShort();
				retextureModified[i_6_] = (short) buffer.getUShort();
			}
		}
	}

	public static void method878(final int i) {
		try {
			anIntArray987 = null;
			aShortArray994 = null;
			if (i == 0) {
				aBooleanArrayArray992 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("li.E(").append(i).append(')').toString());
		}
	}

	static final int[] method879(final int[] is, final int i) {
		int[] is_7_;
		try {
			if (is == null) {
				return null;
			}
			if (i > -102) {
				return null;
			}
			final int[] is_8_ = new int[is.length];
			ArrayUtils.arrayCopy(is, 0, is_8_, 0, is.length);
			is_7_ = is_8_;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("li.F(").append(is != null ? "{...}" : "null").append(',').append(i).append(')').toString());
		}
		return is_7_;
	}

	static final void method880(final int i) {
		try {
			if (HDToolkit.glEnabled) {
				if (i < 114) {
					aBooleanArrayArray992 = null;
				}
				if (!Class93.aBoolean870) {
					final GroundTile[][][] class120_sub18s = LabelGroup.groundTiles;
					GroundTile[][][] class120_sub18s_10_;
					final int i_9_ = (class120_sub18s_10_ = class120_sub18s).length;
					for (int i_11_ = 0; i_11_ < i_9_; i_11_++) {
						final GroundTile[][] class120_sub18s_12_ = class120_sub18s_10_[i_11_];
						for (final GroundTile[] element : class120_sub18s_12_) {
							for (int i_14_ = 0; element.length > i_14_; i_14_++) {
								final GroundTile class120_sub18 = element[i_14_];
								if (class120_sub18 != null) {
									if (class120_sub18.aClass36_2650 != null && class120_sub18.aClass36_2650.aClass180_309 instanceof Class180_Sub7_Sub2) {
										final Class180_Sub7_Sub2 class180_sub7_sub2 = (Class180_Sub7_Sub2) class120_sub18.aClass36_2650.aClass180_309;
										if (0L == (~0x7fffffffffffffffL & class120_sub18.aClass36_2650.bitPacked)) {
											class180_sub7_sub2.method2432(false, true, true, true, false, true, true);
										} else {
											class180_sub7_sub2.method2432(true, true, true, true, true, true, true);
										}
									}
									if (class120_sub18.aClass186_2639 != null) {
										if (class120_sub18.aClass186_2639.aClass180_1901 instanceof Class180_Sub7_Sub2) {
											final Class180_Sub7_Sub2 class180_sub7_sub2 = (Class180_Sub7_Sub2) class120_sub18.aClass186_2639.aClass180_1901;
											if ((class120_sub18.aClass186_2639.bitPacked & ~0x7fffffffffffffffL) != 0L) {
												class180_sub7_sub2.method2432(true, true, true, true, true, true, true);
											} else {
												class180_sub7_sub2.method2432(false, true, true, true, false, true, true);
											}
										}
										if (class120_sub18.aClass186_2639.aClass180_1898 instanceof Class180_Sub7_Sub2) {
											final Class180_Sub7_Sub2 class180_sub7_sub2 = (Class180_Sub7_Sub2) class120_sub18.aClass186_2639.aClass180_1898;
											if (0L == (~0x7fffffffffffffffL & class120_sub18.aClass186_2639.bitPacked)) {
												class180_sub7_sub2.method2432(false, true, true, true, false, true, true);
											} else {
												class180_sub7_sub2.method2432(true, true, true, true, true, true, true);
											}
										}
									}
									if (class120_sub18.aClass182_2628 != null) {
										if (class120_sub18.aClass182_2628.aClass180_1800 instanceof Class180_Sub7_Sub2) {
											final Class180_Sub7_Sub2 class180_sub7_sub2 = (Class180_Sub7_Sub2) class120_sub18.aClass182_2628.aClass180_1800;
											if ((~0x7fffffffffffffffL & class120_sub18.aClass182_2628.bitPacked) == 0L) {
												class180_sub7_sub2.method2432(false, true, true, true, false, true, true);
											} else {
												class180_sub7_sub2.method2432(true, true, true, true, true, true, true);
											}
										}
										if (class120_sub18.aClass182_2628.aClass180_1796 instanceof Class180_Sub7_Sub2) {
											final Class180_Sub7_Sub2 class180_sub7_sub2 = (Class180_Sub7_Sub2) class120_sub18.aClass182_2628.aClass180_1796;
											if (-1L != (class120_sub18.aClass182_2628.bitPacked & ~0x7fffffffffffffffL ^ 0xffffffffffffffffL)) {
												class180_sub7_sub2.method2432(true, true, true, true, true, true, true);
											} else {
												class180_sub7_sub2.method2432(false, true, true, true, false, true, true);
											}
										}
									}
									for (int i_15_ = 0; class120_sub18.anInt2638 > i_15_; i_15_++) {
										if (class120_sub18.aClass28Array2625[i_15_].aClass180_174 instanceof Class180_Sub7_Sub2) {
											final Class180_Sub7_Sub2 class180_sub7_sub2 = (Class180_Sub7_Sub2) class120_sub18.aClass28Array2625[i_15_].aClass180_174;
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
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("li.G(").append(i).append(')').toString());
		}
	}

	final void decode(final Buffer buffer) {
		for (;;) {
			final int configCode = buffer.getUByte();
			if (configCode == 0) {
				break;
			}
			decode(buffer, configCode);
		}
	}

	final Class180_Sub7 method882(final int i, final int i_16_, final int i_17_, final byte i_18_) {
		Class180_Sub7 class180_sub7;
		try {
			Class180_Sub7 class180_sub7_19_ = (Class180_Sub7) Class182.aClass21_1798.get(this.myId);
			if (class180_sub7_19_ == null) {
				final Class180_Sub2 class180_sub2 = Class180_Sub2.method2291(Class90.aClass50_843, modelId, 0);
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
				class180_sub7_19_ = class180_sub2.method2300(ambient + 64, 850 + contrast, -30, -50, -30);
				Class182.aClass21_1798.put(class180_sub7_19_, this.myId);
			}
			Class180_Sub7 class180_sub7_22_;
			if ((this.animationId ^ 0xffffffff) == 0 || (i_17_ ^ 0xffffffff) == 0) {
				class180_sub7_22_ = class180_sub7_19_.method2381(true, true, true);
			} else {
				class180_sub7_22_ = SeqType.list(this.animationId).method324(98, i_17_, i_16_, class180_sub7_19_, i);
			}
			if (scaleX != 128 || scaleY != 128) {
				class180_sub7_22_.method2369(scaleX, scaleY, scaleX);
			}
			if (rotation != 0) {
				if (rotation == 90) {
					class180_sub7_22_.method2365();
				}
				if (rotation == 180) {
					class180_sub7_22_.method2373();
				}
				if (rotation == 270) {
					class180_sub7_22_.method2372();
				}
			}
			if (i_18_ != 14) {
				method879(null, -17);
			}
			class180_sub7 = class180_sub7_22_;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("li.B(").append(i).append(',').append(i_16_).append(',').append(i_17_).append(',').append(i_18_).append(')').toString());
		}
		return class180_sub7;
	}

	static final SpotAnimType list(final int id) {
		SpotAnimType class103_19_ = (SpotAnimType) recentUse.get(id);
		if (class103_19_ != null) {
			return class103_19_;
		}
		final byte[] is = Class154.aClass50_1443.getFile(Class127.method1897(id, 101), Class76.method663(id, (byte) -67));
		class103_19_ = new SpotAnimType();
		class103_19_.myId = id;
		if (is != null) {
			class103_19_.decode(new Buffer(is));
		}
		recentUse.put(class103_19_, id);
		return class103_19_;
	}

	public SpotAnimType() {
		this.aBoolean989 = false;
		scaleX = 128;
		scaleY = 128;
		rotation = 0;
		this.aBoolean998 = false;
		contrast = 0;
	}
}
