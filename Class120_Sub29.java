/* Class120_Sub29 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class120_Sub29 extends Node {
	int anInt2764;
	int anInt2765;
	int anInt2766;
	int anInt2767;
	static int anInt2768;
	static int[] menuOptionsData3 = new int[500];
	static js5 aClass50_2770;
	int anInt2771;
	int anInt2772;
	int anInt2773;
	static int anInt2774;
	int anInt2775;
	int anInt2776;
	static short[] menuOptionsCode;
	int anInt2778;
	int anInt2779;
	int anInt2780;

	static {
		anInt2768 = 0;
		menuOptionsCode = new short[500];
	}

	static final void receiveRegionData(final boolean bool) {
		Class134.dynamicMapRegion = bool;
		if (Class134.dynamicMapRegion) {
			final int playerZ = Canvas_Sub1.inputStream.getULEShortA();
			final int baseZ = Canvas_Sub1.inputStream.getUShortA();
			final int baseX = Canvas_Sub1.inputStream.getULEShort();
			Canvas_Sub1.inputStream.startBitAccess();
			for (int i_7_ = 0; i_7_ < 4; i_7_++) {
				for (int i_8_ = 0; i_8_ < 13; i_8_++) {
					for (int i_9_ = 0; i_9_ < 13; i_9_++) {
						final int i_10_ = Canvas_Sub1.inputStream.getBitValue(1);
						if (i_10_ != 1) {
							Class120_Sub12_Sub36.anIntArrayArrayArray3420[i_7_][i_8_][i_9_] = -1;
						} else {
							Class120_Sub12_Sub36.anIntArrayArrayArray3420[i_7_][i_8_][i_9_] = Canvas_Sub1.inputStream.getBitValue(26);
						}
					}
				}
			}
			Canvas_Sub1.inputStream.endBitAccess();
			int i_11_ = (AbstractMouseWheelHandler.packetSize - Canvas_Sub1.inputStream.pos) / 16;
			Class125.anIntArrayArray2150 = new int[i_11_][4];
			for (int i_12_ = 0; i_11_ > i_12_; i_12_++) {
				for (int i_13_ = 0; i_13_ < 4; i_13_++) {
					Class125.anIntArrayArray2150[i_12_][i_13_] = Canvas_Sub1.inputStream.getInt2();
				}
			}
			final int playerX = Canvas_Sub1.inputStream.getUShort();
			final boolean bool_15_ = Projectile.method2318(Canvas_Sub1.inputStream.getUByteS());
			final int level = Canvas_Sub1.inputStream.getUByteA();
			client.underWaterLocationsMapFileIds = new int[i_11_];
			Class179.aByteArrayArray1777 = null;
			Class120_Sub12_Sub36.underWaterMapFileBuffers = new byte[i_11_][];
			Class120_Sub12_Sub36.regionBitPackeds = new int[i_11_];
			ProducingGraphicsBuffer.anIntArray2796 = null;
			Class111.underWaterMapFileIds = new int[i_11_];
			LookupTable.mapFileIds = new int[i_11_];
			Class101_Sub1.underWaterLocationsMapFileBuffers = new byte[i_11_][];
			Class134.locationMapFileBuffers = new byte[i_11_][];
			Class28.locationsMapFileIds = new int[i_11_];
			RuntimeException_Sub1.mapFileBuffers = new byte[i_11_][];
			i_11_ = 0;
			for (int i_17_ = 0; i_17_ < 4; i_17_++) {
				for (int i_18_ = 0; i_18_ < 13; i_18_++) {
					for (int i_19_ = 0; i_19_ < 13; i_19_++) {
						final int i_20_ = Class120_Sub12_Sub36.anIntArrayArrayArray3420[i_17_][i_18_][i_19_];
						if (i_20_ != -1) {
							final int i_21_ = 0x3ff & i_20_ >> 14;
							final int i_22_ = 0x7ff & i_20_ >> 3;
							int i_23_ = (i_21_ / 8 << 8) + i_22_ / 8;
							for (int i_24_ = 0; i_24_ < i_11_; i_24_++) {
								if (Class120_Sub12_Sub36.regionBitPackeds[i_24_] == i_23_) {
									i_23_ = -1;
									break;
								}
							}
							if (i_23_ != -1) {
								Class120_Sub12_Sub36.regionBitPackeds[i_11_] = i_23_;
								final int i_25_ = 0xff & i_23_ >> 8;
								final int i_26_ = 0xff & i_23_;
								LookupTable.mapFileIds[i_11_] = Class65.aClass50_597.getGroupId("m" + i_25_ + "_" + i_26_);
								Class28.locationsMapFileIds[i_11_] = Class65.aClass50_597.getGroupId("l" + i_25_ + "_" + i_26_);
								Class111.underWaterMapFileIds[i_11_] = Class65.aClass50_597.getGroupId("um" + i_25_ + "_" + i_26_);
								client.underWaterLocationsMapFileIds[i_11_] = Class65.aClass50_597.getGroupId("ul" + i_25_ + "_" + i_26_);
								i_11_++;
							}
						}
					}
				}
			}
			Class2.method76(baseX, baseZ, level, playerX, playerZ, false, bool_15_);
		} else {
			final boolean bool_27_ = Projectile.method2318(Canvas_Sub1.inputStream.getUByteS());
			final int i_28_ = Canvas_Sub1.inputStream.getUShort();
			int i_29_ = (-Canvas_Sub1.inputStream.pos + AbstractMouseWheelHandler.packetSize) / 16;
			Class125.anIntArrayArray2150 = new int[i_29_][4];
			for (int i_30_ = 0; i_30_ < i_29_; i_30_++) {
				for (int i_31_ = 0; i_31_ < 4; i_31_++) {
					Class125.anIntArrayArray2150[i_30_][i_31_] = Canvas_Sub1.inputStream.getLEInt();
				}
			}
			final int i_32_ = Canvas_Sub1.inputStream.getUByteC();
			final int i_33_ = Canvas_Sub1.inputStream.getUShortA();
			final int i_34_ = Canvas_Sub1.inputStream.getUShort();
			boolean bool_35_ = false;
			final int i_36_ = Canvas_Sub1.inputStream.getUShort();
			if ((i_36_ / 8 == 48 || i_36_ / 8 == 49) && i_28_ / 8 == 48) {
				bool_35_ = true;
			}
			Class111.underWaterMapFileIds = new int[i_29_];
			if (i_36_ / 8 == 48 && i_28_ / 8 == 148) {
				bool_35_ = true;
			}
			LookupTable.mapFileIds = new int[i_29_];
			RuntimeException_Sub1.mapFileBuffers = new byte[i_29_][];
			client.underWaterLocationsMapFileIds = new int[i_29_];
			Class28.locationsMapFileIds = new int[i_29_];
			Class179.aByteArrayArray1777 = null;
			Class120_Sub12_Sub36.underWaterMapFileBuffers = new byte[i_29_][];
			Class134.locationMapFileBuffers = new byte[i_29_][];
			ProducingGraphicsBuffer.anIntArray2796 = null;
			Class101_Sub1.underWaterLocationsMapFileBuffers = new byte[i_29_][];
			Class120_Sub12_Sub36.regionBitPackeds = new int[i_29_];
			i_29_ = 0;
			for (int i_37_ = (-6 + i_36_) / 8; (6 + i_36_) / 8 >= i_37_; i_37_++) {
				for (int i_38_ = (-6 + i_28_) / 8; (6 + i_28_) / 8 >= i_38_; i_38_++) {
					final int i_39_ = (i_37_ << 8) + i_38_;
					if (!bool_35_ || i_38_ != 49 && i_38_ != 149 && i_38_ != 147 && i_37_ != 50 && (i_37_ != 49 || i_38_ != 47)) {
						Class120_Sub12_Sub36.regionBitPackeds[i_29_] = i_39_;
						LookupTable.mapFileIds[i_29_] = Class65.aClass50_597.getGroupId("m" + i_37_ + "_" + i_38_);
						Class28.locationsMapFileIds[i_29_] = Class65.aClass50_597.getGroupId("l" + i_37_ + "_" + i_38_);
						Class111.underWaterMapFileIds[i_29_] = Class65.aClass50_597.getGroupId("um" + i_37_ + "_" + i_38_);
						client.underWaterLocationsMapFileIds[i_29_] = Class65.aClass50_597.getGroupId("ul" + i_37_ + "_" + i_38_);
					} else {
						Class120_Sub12_Sub36.regionBitPackeds[i_29_] = i_39_;
						LookupTable.mapFileIds[i_29_] = -1;
						Class28.locationsMapFileIds[i_29_] = -1;
						Class111.underWaterMapFileIds[i_29_] = -1;
						client.underWaterLocationsMapFileIds[i_29_] = -1;
					}
					i_29_++;
				}
			}
			Class2.method76(i_36_, i_28_, i_32_, i_33_, i_34_, false, bool_27_);
		}
	}

	static final void method1730(final int i) {
		final InterfaceChangeNode class120_sub14_sub7 = InterfaceChangeNode.putInterfaceChange(6, i);
		class120_sub14_sub7.method1453();
	}

	public Class120_Sub29() {
		/* empty */
	}
}
