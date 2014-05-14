/* Class10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class10 {
	static Class193 aClass193_78;
	static Class50 aClass50_79;

	static final void method119(final Buffer class120_sub7, final boolean bool, final boolean bool_0_, final boolean bool_1_, final int i, final int i_2_, final int i_3_, final int i_4_, final int i_5_, final int i_6_, final int i_7_, final int i_8_) {
		try {
			if (i_8_ >= 0 && i_8_ < 104 && i_4_ >= 0 && i_4_ < 104) {
				if (!bool_1_ && !bool_0_) {
					Class114.tileSettings[i][i_8_][i_4_] = (byte) 0;
				}
				for (;;) {
					final int i_9_ = class120_sub7.getUByte();
					if (i_9_ == 0) {
						if (bool_1_) {
							OverridedJInterface.anIntArrayArrayArray2741[0][i_7_ + i_8_][i_6_ + i_4_] = Class120_Sub12_Sub33.anIntArrayArrayArray3388[0][i_7_ + i_8_][i_6_ + i_4_];
						} else if (i != 0) {
							OverridedJInterface.anIntArrayArrayArray2741[i][i_8_ + i_7_][i_6_ + i_4_] = -240 + OverridedJInterface.anIntArrayArrayArray2741[i - 1][i_8_ - -i_7_][i_4_ - -i_6_];
						} else {
							OverridedJInterface.anIntArrayArrayArray2741[0][i_7_ + i_8_][i_4_ + i_6_] = -Class120_Sub16.method1659(932731 + i_2_, i_3_ + 556238, -70) * 8;
						}
						break;
					}
					if (i_9_ == 1) {
						int i_10_ = class120_sub7.getUByte();
						if (!bool_1_) {
							if (i_10_ == 1) {
								i_10_ = 0;
							}
							if (i == 0) {
								OverridedJInterface.anIntArrayArrayArray2741[0][i_7_ + i_8_][i_4_ - -i_6_] = 8 * -i_10_;
							} else {
								OverridedJInterface.anIntArrayArrayArray2741[i][i_8_ + i_7_][i_6_ + i_4_] = -(i_10_ * 8) + OverridedJInterface.anIntArrayArrayArray2741[-1 + i][i_7_ + i_8_][i_6_ + i_4_];
							}
						} else {
							OverridedJInterface.anIntArrayArrayArray2741[0][i_7_ + i_8_][i_6_ + i_4_] = 8 * i_10_ + Class120_Sub12_Sub33.anIntArrayArrayArray3388[0][i_7_ + i_8_][i_6_ + i_4_];
						}
						break;
					}
					if (i_9_ <= 49) {
						if (bool_0_) {
							class120_sub7.getUByte();
						} else {
							Class99.aByteArrayArrayArray949[i][i_8_][i_4_] = class120_sub7.getByte();
							Class120_Sub14_Sub5.aByteArrayArrayArray3477[i][i_8_][i_4_] = (byte) ((i_9_ + -2) / 4);
							Class8.aByteArrayArrayArray65[i][i_8_][i_4_] = (byte) Class120_Sub12_Sub3.method1207(3, i_5_ + -2 + i_9_);
						}
					} else if (i_9_ <= 81) {
						if (!bool_1_ && !bool_0_) {
							Class114.tileSettings[i][i_8_][i_4_] = (byte) (i_9_ - 49);
						}
					} else if (!bool_0_) {
						Class120_Sub4.aByteArrayArrayArray2441[i][i_8_][i_4_] = (byte) (i_9_ + -81);
					}
				}
			} else {
				for (;;) {
					final int i_11_ = class120_sub7.getUByte();
					if (i_11_ == 0) {
						break;
					}
					if (i_11_ == 1) {
						class120_sub7.getUByte();
						break;
					}
					if (i_11_ <= 49) {
						class120_sub7.getUByte();
					}
				}
			}
			if (bool) {
				method120((byte) -95);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, "an.B(");
		}
	}

	public static void method120(final byte i) {
		try {
			if (i != 116) {
				method123(-79);
			}
			aClass193_78 = null;
			aClass50_79 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("an.E(").append(i).append(')').toString());
		}
	}

	static final boolean method121(final Class50 class50, final int i_12_, final int i_13_) {
		final byte[] is = class50.getFile(i_12_, i_13_);
		if (is == null) {
			return false;
		}
		Class140.decodeSprites(is);
		return true;
	}

	static final void method122() {
		Class180_Sub3.aClass21_2906.clear();
	}

	static final void method123(final int i) {
		try {
			if (Class120_Sub12_Sub3.aClass164_3150 != null) {
				Class120_Sub12_Sub3.aClass164_3150.method2136(i ^ 0x62b1);
			}
			if (Class120_Sub12_Sub29.aClass164_3366 != null) {
				Class120_Sub12_Sub29.aClass164_3366.method2136(14680);
			}
			Class120_Sub14_Sub14_Sub1.method1546(2, Class167.aBoolean1619, 22050, (byte) 115);
			Class120_Sub12_Sub3.aClass164_3150 = Class120_Sub12_Sub18.method1289(Node.canvas, (byte) -112, 22050, NpcType.gameSignlink, 0);
			if (i == 23529) {
				Class120_Sub12_Sub3.aClass164_3150.method2143(Class69_Sub1.aClass120_Sub30_Sub2_2230, i ^ 0x5be1);
				Class120_Sub12_Sub29.aClass164_3366 = Class120_Sub12_Sub18.method1289(Node.canvas, (byte) -123, 2048, NpcType.gameSignlink, 1);
				Class120_Sub12_Sub29.aClass164_3366.method2143(Class120_Sub12_Sub22.aClass120_Sub30_Sub3_3299, i ^ 0x5be1);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("an.C(").append(i).append(')').toString());
		}
	}
}
