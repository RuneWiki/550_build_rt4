/* Class10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class10 {
	static SeekableFile randomFile;
	static js5 aClass50_79;

	static final void method119(final Buffer buffer, final boolean bool_0_, final boolean bool_1_, final int level, final int i_2_, final int i_3_, final int z, final int i_5_, final int zOff, final int xOff, final int x) {
		if (x >= 0 && x < 104 && z >= 0 && z < 104) {
			if (!bool_1_ && !bool_0_) {
				Class114.tileSettings[level][x][z] = (byte) 0;
			}
			for (;;) {
				final int opcode = buffer.getUByte();
				if (opcode == 0) {
					if (bool_1_) {
						SubInterface.activeTileHeightMap[0][x + xOff][z + zOff] = Class120_Sub12_Sub33.surfaceTileHeightMap[0][x + xOff][z + zOff];
					} else if (level != 0) {
						SubInterface.activeTileHeightMap[level][x + xOff][z + zOff] = SubInterface.activeTileHeightMap[level - 1][x + xOff][z + zOff] - 240;
					} else {
						SubInterface.activeTileHeightMap[0][x + xOff][z + zOff] = -Class120_Sub16.method1659(932731 + i_2_, i_3_ + 556238) * 8;
					}
					break;
				}
				if (opcode == 1) {
					int i_10_ = buffer.getUByte();
					if (!bool_1_) {
						if (i_10_ == 1) {
							i_10_ = 0;
						}
						if (level == 0) {
							SubInterface.activeTileHeightMap[0][x + xOff][z + zOff] = 8 * -i_10_;
						} else {
							SubInterface.activeTileHeightMap[level][x + xOff][z + zOff] = SubInterface.activeTileHeightMap[level - 1][xOff + x][zOff + z] - (i_10_ * 8);
						}
					} else {
						SubInterface.activeTileHeightMap[0][x + xOff][z + zOff] = 8 * i_10_ + Class120_Sub12_Sub33.surfaceTileHeightMap[0][xOff + x][zOff + z];
					}
					break;
				}
				if (opcode <= 49) {
					if (bool_0_) {
						buffer.getUByte();
					} else {
						Class99.tileOverlayIds[level][x][z] = buffer.getByte();
						MapFunctionNode.tileOverlayShapes[level][x][z] = (byte) ((opcode - 2) / 4);
						Class8.tileOverlayRotations[level][x][z] = (byte) ((opcode + (i_5_ - 2)) & 0x3);
					}
				} else if (opcode <= 81) {
					if (!bool_1_ && !bool_0_) {
						Class114.tileSettings[level][x][z] = (byte) (opcode - 49);
					}
				} else if (!bool_0_) {
					Class120_Sub4.tileUnderlayIds[level][x][z] = (byte) (opcode - 81);
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

	static final boolean decodedSprites(final js5 js5, final int group, final int file) {
		final byte[] data = js5.getFile(group, file);
		if (data == null) {
			return false;
		}
		Class140.decodeSprites(data);
		return true;
	}

	static final void method123() {
		if (Class120_Sub12_Sub3.aClass164_3150 != null) {
			Class120_Sub12_Sub3.aClass164_3150.method2136();
		}
		if (Class120_Sub12_Sub29.aClass164_3366 != null) {
			Class120_Sub12_Sub29.aClass164_3366.method2136();
		}
		FileSystemRequest.method1546(2, 22050, Class167.isStereo);
		Class120_Sub12_Sub3.aClass164_3150 = Class120_Sub12_Sub18.method1289(Node.canvas, 22050, NpcType.gameSignlink, 0);
		Class120_Sub12_Sub3.aClass164_3150.method2143(Class69_Sub1.aClass120_Sub30_Sub2_2230);
		Class120_Sub12_Sub29.aClass164_3366 = Class120_Sub12_Sub18.method1289(Node.canvas, 2048, NpcType.gameSignlink, 1);
		Class120_Sub12_Sub29.aClass164_3366.method2143(Class120_Sub12_Sub22.aClass120_Sub30_Sub3_3299);
	}
}
