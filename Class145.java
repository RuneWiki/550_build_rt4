/* Class145 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class145 {
	static int sleepModifier1 = 1;
	static int anInt1379 = 1;
	int anInt1380 = -1;
	static int anInt1381;
	static int renderYawWrapper;
	int[] anIntArray1383;
	int anInt1384 = -1;
	static js5 aClass50_678;
	static ObjectCache aClass21_1486 = new ObjectCache(16);
	static byte[][] spritePaletteIndicators;

	private final void decode(final Buffer buffer, final int code) {
		if (code == 1) {
			this.anInt1384 = buffer.getUShort();
		} else if (code == 2) {
			this.anIntArray1383 = new int[buffer.getUByte()];
			for (int i_2_ = 0; i_2_ < this.anIntArray1383.length; i_2_++) {
				this.anIntArray1383[i_2_] = buffer.getUShort();
			}
		} else if (code == 3) {
			this.anInt1380 = buffer.getUByte();
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

	static final Class145 list(final int id) {
		Class145 class145 = (Class145) aClass21_1486.get(id);
		if (class145 != null) {
			return class145;
		}
		final byte[] data = aClass50_678.getFile(29, id);//Has 0 files in 550 cache
		class145 = new Class145();
		if (data != null) {
			class145.decode(new Buffer(data));
		}
		aClass21_1486.put(class145, id);
		return class145;
	}

	static final void method2048(final JagexInterface jagexInterface, final int maxDist, final int interfaceX, final int playerY, final int interfaceY, final int playerX, final int iconType) {
		final int dist = playerX * playerX + playerY * playerY;
		if (dist <= maxDist) {
			int i_12_ = Math.min(jagexInterface.width / 2, jagexInterface.height / 2);
			if (dist > i_12_ * i_12_) {
				i_12_ -= 10;
				final int i_13_ = Class164.minimapRandomRotation + (int) DummyOutputStream.aFloat28 & 0x7ff;
				int i_14_ = Rasterizer.cosineTable[i_13_];
				i_14_ = 256 * i_14_ / (Class154.minimapRandomZoom + 256);
				int i_15_ = Rasterizer.sineTable[i_13_];
				i_15_ = i_15_ * 256 / (Class154.minimapRandomZoom + 256);
				final int i_16_ = i_14_ * playerY + -(playerX * i_15_) >> 16;
				final int i_17_ = playerX * i_14_ + i_15_ * playerY >> 16;
				final double d = Math.atan2(i_17_, i_16_);
				final int i_18_ = (int) (i_12_ * Math.sin(d));
				final int i_19_ = (int) (i_12_ * Math.cos(d));
				if (!HDToolkit.glEnabled) {
					((LDSprite) Class69_Sub2.aClass120_Sub14_Sub19Array2237[iconType]).method1612(-10 + interfaceX + jagexInterface.width / 2 + i_18_, -i_19_ + jagexInterface.height / 2 + interfaceY + -10, 20, 20, 15, 15, d, 256);
				} else {
					((HDSprite) Class69_Sub2.aClass120_Sub14_Sub19Array2237[iconType]).method1601(240, 240, (interfaceX - -(jagexInterface.width / 2) + i_18_) * 16, (-i_19_ + interfaceY + jagexInterface.height / 2) * 16, (int) (d * 10430.378), 4096);
				}
			} else {
				Class23.method200(interfaceX, jagexInterface, interfaceY, playerX, playerY, Class120_Sub12_Sub5.aClass120_Sub14_Sub19Array3167[iconType]);
			}
		}
	}

	public Class145() {
		/* empty */
	}
}
