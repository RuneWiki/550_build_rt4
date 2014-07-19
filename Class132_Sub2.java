/* Class132_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Class132_Sub2 extends Class132 {
	private int anInt2818;
	private int anInt2819;
	private byte[] aByteArray2820;
	static float aFloat2821;
	private int[] anIntArray2822 = new int[this.anInt1256];
	static int crossId;

	@Override
	final void method1927(final int i, final int i_0_, final byte i_1_) {
		try {
			anInt2818 += i_0_ * anIntArray2822[i] >> 12;
			if (i_1_ >= -17) {
				method1942(null, 60, 96, -23, -83, 95, -53, 52, true);
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("rn.F(").append(i).append(',').append(i_0_).append(',').append(i_1_).append(')').toString());
		}
	}

	@Override
	final void method1922(final byte i) {
		try {
			anInt2818 = Math.abs(anInt2818);
			if (anInt2818 >= 4096) {
				anInt2818 = 4095;
			}
			method1938(anInt2819++, (byte) (anInt2818 >> 4));
			anInt2818 = 0;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("rn.E(").append(i).append(')').toString());
		}
	}

	static final void method1937(final byte i) {
		do {
			try {
				Class134.aClass120_Sub14_Sub19_1276 = null;
				Class120_Sub12_Sub15.anInt3243 = -1;
				if (i < 51) {
					break;
				}
			} catch (final RuntimeException runtimeexception) {
				throw EnumType.method1428(runtimeexception, new StringBuilder("rn.G(").append(i).append(')').toString());
			}
		} while (false);
	}

	void method1938(final int i, final byte i_2_) {
		try {
			aByteArray2820[anInt2819++] = (byte) (127 + Class120_Sub12_Sub3.method1207(i_2_ >> 1, 127));
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("rn.A(").append(i).append(',').append(i_2_).append(')').toString());
		}
	}

	static final void method1939(final long[] ls, final byte i, final int i_3_, final int i_4_, final Object[] objects) {
		try {
			if (i_4_ < i_3_) {
				final int i_5_ = (i_3_ + i_4_) / 2;
				int i_6_ = i_4_;
				final long l = ls[i_5_];
				ls[i_5_] = ls[i_3_];
				ls[i_3_] = l;
				final Object object = objects[i_5_];
				objects[i_5_] = objects[i_3_];
				objects[i_3_] = object;
				for (int i_7_ = i_4_; i_3_ > i_7_; i_7_++) {
					if ((ls[i_7_] ^ 0xffffffffffffffffL) > ((0x1 & i_7_) + l ^ 0xffffffffffffffffL)) {
						final long l_8_ = ls[i_7_];
						ls[i_7_] = ls[i_6_];
						ls[i_6_] = l_8_;
						final Object object_9_ = objects[i_7_];
						objects[i_7_] = objects[i_6_];
						objects[i_6_++] = object_9_;
					}
				}
				ls[i_3_] = ls[i_6_];
				ls[i_6_] = l;
				objects[i_3_] = objects[i_6_];
				objects[i_6_] = object;
				method1939(ls, (byte) -50, i_6_ - 1, i_4_, objects);
				method1939(ls, (byte) -71, i_3_, 1 + i_6_, objects);
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("rn.H(").append(ls != null ? "{...}" : "null").append(',').append(i).append(',').append(i_3_).append(',').append(i_4_).append(',').append(objects != null ? "{...}" : "null").append(')').toString());
		}
	}

	@Override
	final void method1925(final int i) {
		try {
			anInt2819 = 0;
			if (i != 255) {
				anIntArray2822 = null;
			}
			anInt2818 = 0;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("rn.I(").append(i).append(')').toString());
		}
	}

	static final void getTitleSpriteIds(final js5 js5) {
		StructType.titlebgId = js5.method432("titlebg");
		Class108_Sub1.logoId = js5.method432("logo");
	}

	static final void method1942(final PlainTile plainTile, final int i, final int i_10_, final int i_11_, final int i_12_, final int i_13_, final int i_14_, final int i_15_, final boolean bool) {
		int i_17_;
		int i_16_ = i_17_ = (i_14_ << 7) - DisplayModeInfo.anInt1713;
		int i_19_;
		int i_18_ = i_19_ = (i_15_ << 7) - Class145.anInt1381;
		int i_21_;
		int i_20_ = i_21_ = i_16_ + 128;
		int i_23_;
		int i_22_ = i_23_ = i_18_ + 128;
		int i_24_ = OverridedJInterface.anIntArrayArrayArray2741[i][i_14_][i_15_] - PlayerAppearance.anInt1367;
		int i_25_ = OverridedJInterface.anIntArrayArrayArray2741[i][i_14_ + 1][i_15_] - PlayerAppearance.anInt1367;
		int i_26_ = OverridedJInterface.anIntArrayArrayArray2741[i][i_14_ + 1][i_15_ + 1] - PlayerAppearance.anInt1367;
		int i_27_ = OverridedJInterface.anIntArrayArrayArray2741[i][i_14_][i_15_ + 1] - PlayerAppearance.anInt1367;
		int i_28_ = i_18_ * i_12_ + i_16_ * i_13_ >> 16;
		i_18_ = i_18_ * i_13_ - i_16_ * i_12_ >> 16;
		i_16_ = i_28_;
		i_28_ = i_24_ * i_11_ - i_18_ * i_10_ >> 16;
		i_18_ = i_24_ * i_10_ + i_18_ * i_11_ >> 16;
		i_24_ = i_28_;
		if (i_18_ >= 50) {
			i_28_ = i_19_ * i_12_ + i_20_ * i_13_ >> 16;
			i_19_ = i_19_ * i_13_ - i_20_ * i_12_ >> 16;
			i_20_ = i_28_;
			i_28_ = i_25_ * i_11_ - i_19_ * i_10_ >> 16;
			i_19_ = i_25_ * i_10_ + i_19_ * i_11_ >> 16;
			i_25_ = i_28_;
			if (i_19_ >= 50) {
				i_28_ = i_22_ * i_12_ + i_21_ * i_13_ >> 16;
				i_22_ = i_22_ * i_13_ - i_21_ * i_12_ >> 16;
				i_21_ = i_28_;
				i_28_ = i_26_ * i_11_ - i_22_ * i_10_ >> 16;
				i_22_ = i_26_ * i_10_ + i_22_ * i_11_ >> 16;
				i_26_ = i_28_;
				if (i_22_ >= 50) {
					i_28_ = i_23_ * i_12_ + i_17_ * i_13_ >> 16;
					i_23_ = i_23_ * i_13_ - i_17_ * i_12_ >> 16;
					i_17_ = i_28_;
					i_28_ = i_27_ * i_11_ - i_23_ * i_10_ >> 16;
					i_23_ = i_27_ * i_10_ + i_23_ * i_11_ >> 16;
					i_27_ = i_28_;
					if (i_23_ >= 50) {
						final int i_29_ = Rasterizer.anInt967 + (i_16_ << 9) / i_18_;
						final int i_30_ = Rasterizer.anInt970 + (i_24_ << 9) / i_18_;
						final int i_31_ = Rasterizer.anInt967 + (i_20_ << 9) / i_19_;
						final int i_32_ = Rasterizer.anInt970 + (i_25_ << 9) / i_19_;
						final int i_33_ = Rasterizer.anInt967 + (i_21_ << 9) / i_22_;
						final int i_34_ = Rasterizer.anInt970 + (i_26_ << 9) / i_22_;
						final int i_35_ = Rasterizer.anInt967 + (i_17_ << 9) / i_23_;
						final int i_36_ = Rasterizer.anInt970 + (i_27_ << 9) / i_23_;
						Rasterizer.alpha = 0;
						if ((i_33_ - i_35_) * (i_32_ - i_36_) - (i_34_ - i_36_) * (i_31_ - i_35_) > 0) {
							if (Class120_Sub12_Sub7.aBoolean3181 && Class48.method400(Class108_Sub1.anInt2320 + Rasterizer.anInt967, Class187.anInt1908 + Rasterizer.anInt970, i_34_, i_36_, i_32_, i_33_, i_35_, i_31_)) {
								ObjectCache.anInt122 = i_14_;
								Class20.anInt2174 = i_15_;
							}
							if (!HDToolkit.glEnabled && !bool) {
								Rasterizer.aBoolean972 = false;
								if (i_33_ < 0 || i_35_ < 0 || i_31_ < 0 || i_33_ > Rasterizer.anInt983 || i_35_ > Rasterizer.anInt983 || i_31_ > Rasterizer.anInt983) {
									Rasterizer.aBoolean972 = true;
								}
								if (plainTile.anInt1348 == -1) {
									if (plainTile.anInt1351 != 12345678) {
										Rasterizer.method856(i_34_, i_36_, i_32_, i_33_, i_35_, i_31_, plainTile.anInt1351, plainTile.anInt1353, plainTile.anInt1347);
									}
								} else if (Class120_Sub30_Sub1.manyGroundTextures) {
									if (plainTile.aBoolean1352) {
										Rasterizer.method871(i_34_, i_36_, i_32_, i_33_, i_35_, i_31_, plainTile.anInt1351, plainTile.anInt1353, plainTile.anInt1347, i_16_, i_20_, i_17_, i_24_, i_25_, i_27_, i_18_, i_19_, i_23_, plainTile.anInt1348);
									} else {
										Rasterizer.method871(i_34_, i_36_, i_32_, i_33_, i_35_, i_31_, plainTile.anInt1351, plainTile.anInt1353, plainTile.anInt1347, i_21_, i_17_, i_20_, i_26_, i_27_, i_25_, i_22_, i_23_, i_19_, plainTile.anInt1348);
									}
								} else {
									final int i_37_ = Rasterizer.anInterface5_973.method20(plainTile.anInt1348, 65535);
									Rasterizer.method856(i_34_, i_36_, i_32_, i_33_, i_35_, i_31_, Class108_Sub1.method935(i_37_, plainTile.anInt1351), Class108_Sub1.method935(i_37_, plainTile.anInt1353), Class108_Sub1.method935(i_37_, plainTile.anInt1347));
								}
							}
						}
						if ((i_29_ - i_31_) * (i_36_ - i_32_) - (i_30_ - i_32_) * (i_35_ - i_31_) > 0) {
							if (Class120_Sub12_Sub7.aBoolean3181 && Class48.method400(Class108_Sub1.anInt2320 + Rasterizer.anInt967, Class187.anInt1908 + Rasterizer.anInt970, i_30_, i_32_, i_36_, i_29_, i_31_, i_35_)) {
								ObjectCache.anInt122 = i_14_;
								Class20.anInt2174 = i_15_;
							}
							if (!HDToolkit.glEnabled && !bool) {
								Rasterizer.aBoolean972 = false;
								if (i_29_ < 0 || i_31_ < 0 || i_35_ < 0 || i_29_ > Rasterizer.anInt983 || i_31_ > Rasterizer.anInt983 || i_35_ > Rasterizer.anInt983) {
									Rasterizer.aBoolean972 = true;
								}
								if (plainTile.anInt1348 == -1) {
									if (plainTile.anInt1349 != 12345678) {
										Rasterizer.method856(i_30_, i_32_, i_36_, i_29_, i_31_, i_35_, plainTile.anInt1349, plainTile.anInt1347, plainTile.anInt1353);
									}
								} else if (Class120_Sub30_Sub1.manyGroundTextures) {
									Rasterizer.method871(i_30_, i_32_, i_36_, i_29_, i_31_, i_35_, plainTile.anInt1349, plainTile.anInt1347, plainTile.anInt1353, i_16_, i_20_, i_17_, i_24_, i_25_, i_27_, i_18_, i_19_, i_23_, plainTile.anInt1348);
								} else {
									final int i_38_ = Rasterizer.anInterface5_973.method20(plainTile.anInt1348, 65535);
									Rasterizer.method856(i_30_, i_32_, i_36_, i_29_, i_31_, i_35_, Class108_Sub1.method935(i_38_, plainTile.anInt1349), Class108_Sub1.method935(i_38_, plainTile.anInt1347), Class108_Sub1.method935(i_38_, plainTile.anInt1353));
								}
							}
						}
					}
				}
			}
		}
	}

	Class132_Sub2(final int i, final int i_39_, final int i_40_, final int i_41_, final int i_42_, final float f) {
		super(i, i_39_, i_40_, i_41_, i_42_);
		for (int i_43_ = 0; i_43_ < this.anInt1256; i_43_++) {
			anIntArray2822[i_43_] = (short) (int) (4096.0 * Math.pow(f, i_43_));
		}
	}
}
