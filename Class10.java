/* Class10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class10 {
	static SeekableFile aClass193_78;
	static js5 aClass50_79;

	static final void method119(final Buffer buffer, final boolean bool_0_, final boolean bool_1_, final int level, final int i_2_, final int i_3_, final int z, final int i_5_, final int i_6_, final int i_7_, final int x) {
		if (x >= 0 && x < 104 && z >= 0 && z < 104) {
			if (!bool_1_ && !bool_0_) {
				Class114.tileSettings[level][x][z] = (byte) 0;
			}
			for (;;) {
				final int i_9_ = buffer.getUByte();
				if (i_9_ == 0) {
					if (bool_1_) {
						OverridedJInterface.tileHeightMap[0][i_7_ + x][i_6_ + z] = Class120_Sub12_Sub33.anIntArrayArrayArray3388[0][x + i_7_][z + i_6_];
					} else if (level != 0) {
						OverridedJInterface.tileHeightMap[level][x + i_7_][i_6_ + z] = -240 + OverridedJInterface.tileHeightMap[level - 1][x + i_7_][z + i_6_];
					} else {
						OverridedJInterface.tileHeightMap[0][i_7_ + x][z + i_6_] = -Class120_Sub16.method1659(932731 + i_2_, i_3_ + 556238, -70) * 8;
					}
					break;
				}
				if (i_9_ == 1) {
					int i_10_ = buffer.getUByte();
					if (!bool_1_) {
						if (i_10_ == 1) {
							i_10_ = 0;
						}
						if (level == 0) {
							OverridedJInterface.tileHeightMap[0][i_7_ + x][z - -i_6_] = 8 * -i_10_;
						} else {
							OverridedJInterface.tileHeightMap[level][x + i_7_][i_6_ + z] = -(i_10_ * 8) + OverridedJInterface.tileHeightMap[-1 + level][i_7_ + x][i_6_ + z];
						}
					} else {
						OverridedJInterface.tileHeightMap[0][i_7_ + x][i_6_ + z] = 8 * i_10_ + Class120_Sub12_Sub33.anIntArrayArrayArray3388[0][i_7_ + x][i_6_ + z];
					}
					break;
				}
				if (i_9_ <= 49) {
					if (bool_0_) {
						buffer.getUByte();
					} else {
						Class99.aByteArrayArrayArray949[level][x][z] = buffer.getByte();
						Class120_Sub14_Sub5.aByteArrayArrayArray3477[level][x][z] = (byte) ((i_9_ - 2) / 4);
						Class8.aByteArrayArrayArray65[level][x][z] = (byte) Class120_Sub12_Sub3.method1207(3, i_5_ + -2 + i_9_);
					}
				} else if (i_9_ <= 81) {
					if (!bool_1_ && !bool_0_) {
						Class114.tileSettings[level][x][z] = (byte) (i_9_ - 49);
					}
				} else if (!bool_0_) {
					Class120_Sub4.aByteArrayArrayArray2441[level][x][z] = (byte) (i_9_ - 81);
				}
			}
		} else {
			for (;;) {
				final int i_11_ = buffer.getUByte();
				if (i_11_ == 0) {
					break;
				}
				if (i_11_ == 1) {
					buffer.getUByte();
					break;
				}
				if (i_11_ <= 49) {
					buffer.getUByte();
				}
			}
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
			throw EnumType.method1428(runtimeexception, new StringBuilder("an.E(").append(i).append(')').toString());
		}
	}

	static final boolean decodedSprites(final js5 js5, final int group, final int file) {
		final byte[] data = js5.getFile(group, file);
		if (data == null) {
			return false;
		}
		Class140.decodeSprites(data);
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
			FileSystemRequest.method1546(2, Class167.aBoolean1619, 22050, (byte) 115);
			Class120_Sub12_Sub3.aClass164_3150 = Class120_Sub12_Sub18.method1289(Node.canvas, (byte) -112, 22050, NpcType.gameSignlink, 0);
			if (i == 23529) {
				Class120_Sub12_Sub3.aClass164_3150.method2143(Class69_Sub1.aClass120_Sub30_Sub2_2230);
				Class120_Sub12_Sub29.aClass164_3366 = Class120_Sub12_Sub18.method1289(Node.canvas, (byte) -123, 2048, NpcType.gameSignlink, 1);
				Class120_Sub12_Sub29.aClass164_3366.method2143(Class120_Sub12_Sub22.aClass120_Sub30_Sub3_3299);
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("an.C(").append(i).append(')').toString());
		}
	}
}
