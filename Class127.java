/* Class127 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class127 {
	static boolean aBoolean1211;
	private Queue aClass177_1212;
	static js5 aClass50_1213;
	static short[] aShortArray1214 = new short[256];
	static int anInt1215;
	private NodeSub aClass120_Sub14_1216;
	static String aString1217;

	static {
		aBoolean1211 = false;
		anInt1215 = -1;
		aString1217 = "flash3:";
	}

	static final int method1888(final int i, final byte i_0_, final int i_1_, final boolean bool) {
		int i_2_;
		try {
			final ObjectContainer class120_sub17 = (ObjectContainer) ObjectContainer.objectContainerCache.get(i_1_);
			if (class120_sub17 == null) {
				return 0;
			}
			int i_3_ = 0;
			if (i_0_ > -22) {
				return -22;
			}
			for (int i_4_ = 0; class120_sub17.objectIds.length > i_4_; i_4_++) {
				if (class120_sub17.objectIds[i_4_] >= 0 && Node.anInt1143 > class120_sub17.objectIds[i_4_]) {
					final ObjType objType = ObjType.list(class120_sub17.objectIds[i_4_]);
					if (objType.params != null) {
						final IntegerNode class120_sub32 = (IntegerNode) objType.params.get(i);
						if (class120_sub32 != null) {
							if (!bool) {
								i_3_ += class120_sub32.value;
							} else {
								i_3_ += class120_sub32.value * class120_sub17.objectCounts[i_4_];
							}
						}
					}
				}
			}
			i_2_ = i_3_;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("om.E(").append(i).append(',').append(i_0_).append(',').append(i_1_).append(',').append(bool).append(')').toString());
		}
		return i_2_;
	}

	static final void method1889(final byte i) {
		try {
			if (Class108_Sub1.anInt2336 < 0) {
				Class108_Sub1.anInt2336 = 0;
				CanvasWrapper.anInt20 = -1;
				Class120_Sub2.anInt2422 = -1;
			}
			if (Class108_Sub1.anInt2336 > Class79.anInt700) {
				Class108_Sub1.anInt2336 = Class79.anInt700;
				Class120_Sub2.anInt2422 = -1;
				CanvasWrapper.anInt20 = -1;
			}
			if (Class169.anInt1646 < 0) {
				CanvasWrapper.anInt20 = -1;
				Class169.anInt1646 = 0;
				Class120_Sub2.anInt2422 = -1;
			}
			if (Class79.anInt692 < Class169.anInt1646) {
				Class120_Sub2.anInt2422 = -1;
				CanvasWrapper.anInt20 = -1;
				Class169.anInt1646 = Class79.anInt692;
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("om.G(").append(i).append(')').toString());
		}
	}

	final NodeSub method1890(final int i) {
		NodeSub class120_sub14;
		try {
			final NodeSub class120_sub14_5_ = aClass120_Sub14_1216;
			if (class120_sub14_5_ == aClass177_1212.head) {
				aClass120_Sub14_1216 = null;
				return null;
			}
			aClass120_Sub14_1216 = class120_sub14_5_.nextSub;
			if (i != 20389) {
				aShortArray1214 = null;
			}
			class120_sub14 = class120_sub14_5_;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("om.D(").append(i).append(')').toString());
		}
		return class120_sub14;
	}

	static final void method1891(final int i, final int i_6_, final int i_7_, final int i_8_, final boolean bool, final js5 js5) {
		try {
			SeqType.anInt349 = i_7_;
			Js5Request.anInt3940 = i;
			Class69.anInt614 = 10000;
			Class120_Sub14_Sub23.anInt3649 = i_8_;
			MasterIndexInfo.aClass50_476 = js5;
			if (i_6_ == -20329) {
				StringNode.aBoolean2734 = bool;
				Class120_Sub12_Sub25.anInt3312 = 1;
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("om.C(").append(i).append(',').append(i_6_).append(',').append(i_7_).append(',').append(i_8_).append(',').append(bool).append(',').append(js5 != null ? "{...}" : "null").append(')').toString());
		}
	}

	static final void method1892() {
		if (Class120_Sub12_Sub21.aFloat3293 < 128.0F) {
			Class120_Sub12_Sub21.aFloat3293 = 128.0F;
		}
		final int i_9_ = Class69_Sub3_Sub1.playerRenderX >> 7;
		if (383.0F < Class120_Sub12_Sub21.aFloat3293) {
			Class120_Sub12_Sub21.aFloat3293 = 383.0F;
		}
		for (/**/; 2048.0F <= DummyOutputStream.aFloat28; DummyOutputStream.aFloat28 -= 2048.0F) {
			/* empty */
		}
		final int i_10_ = InterfaceListener.playerRenderZ >> 7;
		int i_11_ = 0;
		for (/**/; DummyOutputStream.aFloat28 < 0.0F; DummyOutputStream.aFloat28 += 2048.0F) {
			/* empty */
		}
		final int i_12_ = Class22.getTileHeight(Class173.gameLevel, Class69_Sub3_Sub1.playerRenderX, InterfaceListener.playerRenderZ);
		if (i_9_ > 3 && i_10_ > 3 && i_9_ < 100 && i_10_ < 100) {
			for (int i_13_ = i_9_ + -4; i_9_ + 4 >= i_13_; i_13_++) {
				for (int i_14_ = i_10_ + -4; 4 + i_10_ >= i_14_; i_14_++) {
					int i_15_ = Class173.gameLevel;
					if (i_15_ < 3 && (Class114.tileSettings[1][i_13_][i_14_] & 0x2) == 2) {
						i_15_++;
					}
					final int i_16_ = i_12_ - (OverridedJInterface.anIntArrayArrayArray2741[i_15_][i_13_][i_14_] - 8 * (Class114.aByteArrayArrayArray1094[i_15_][i_13_][i_14_] & 0xff));
					if (i_16_ > i_11_) {
						i_11_ = i_16_;
					}
				}
			}
		}
		int i_17_ = 192 * i_11_;
		if ((i_17_ ^ 0xffffffff) < -98049) {
			i_17_ = 98048;
		}
		if (-32769 < (i_17_ ^ 0xffffffff)) {
			i_17_ = 32768;
		}
		if (i_17_ > Class26.anInt162) {
			Class26.anInt162 += (i_17_ + -Class26.anInt162) / 24;
		} else if (Class26.anInt162 > i_17_) {
			Class26.anInt162 += (i_17_ + -Class26.anInt162) / 80;
		}
	}

	static final void method1893(final int i, final int i_18_) {
		final GroundTile class120_sub18 = LabelGroup.groundTiles[0][i][i_18_];
		for (int i_19_ = 0; i_19_ < 3; i_19_++) {
			final GroundTile class120_sub18_20_ = LabelGroup.groundTiles[i_19_][i][i_18_] = LabelGroup.groundTiles[i_19_ + 1][i][i_18_];
			if (class120_sub18_20_ != null) {
				class120_sub18_20_.anInt2636--;
				for (int i_21_ = 0; i_21_ < class120_sub18_20_.anInt2638; i_21_++) {
					final Class28 class28 = class120_sub18_20_.aClass28Array2625[i_21_];
					if ((class28.bitPacked >> 29 & 0x3L) == 2L && class28.anInt180 == i && class28.anInt184 == i_18_) {
						class28.anInt177--;
					}
				}
			}
		}
		if (LabelGroup.groundTiles[0][i][i_18_] == null) {
			LabelGroup.groundTiles[0][i][i_18_] = new GroundTile(0, i, i_18_);
		}
		LabelGroup.groundTiles[0][i][i_18_].aClass120_Sub18_2644 = class120_sub18;
		LabelGroup.groundTiles[3][i][i_18_] = null;
	}

	public static void method1894(final byte i) {
		try {
			aShortArray1214 = null;
			if (i <= -127) {
				aClass50_1213 = null;
				aString1217 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("om.K(").append(i).append(')').toString());
		}
	}

	final NodeSub method1895(final byte i) {
		NodeSub class120_sub14;
		try {
			final NodeSub class120_sub14_22_ = aClass177_1212.head.nextSub;
			if (aClass177_1212.head == class120_sub14_22_) {
				aClass120_Sub14_1216 = null;
				return null;
			}
			aClass120_Sub14_1216 = class120_sub14_22_.nextSub;
			if (i != -79) {
				aBoolean1211 = false;
			}
			class120_sub14 = class120_sub14_22_;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("om.J(").append(i).append(')').toString());
		}
		return class120_sub14;
	}

	final void method1896(final int i, final Queue queue) {
		try {
			if (i == -16646) {
				aClass177_1212 = queue;
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("om.I(").append(i).append(',').append(queue != null ? "{...}" : "null").append(')').toString());
		}
	}

	static final int method1897(final int i, final int i_23_) {
		int i_24_;
		try {
			if (i_23_ <= 28) {
				method1893(18, 65);
			}
			i_24_ = i >>> 8;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("om.A(").append(i).append(',').append(i_23_).append(')').toString());
		}
		return i_24_;
	}

	public Class127() {
		/* empty */
	}
}
