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

	static final void drawHintIconOnMinimap(final JagexInterface jagexInterface, final int maxDist, final int interfaceX, final int targetY, final int interfaceY, final int targetX, final int iconType) {
		final int dist = targetX * targetX + targetY * targetY;
		if (dist <= maxDist) {
			int maxInterfaceDist = Math.min(jagexInterface.width / 2, jagexInterface.height / 2);
			if (dist > maxInterfaceDist * maxInterfaceDist) {
				maxInterfaceDist -= 10;
				final int rot = (int) DummyOutputStream.aFloat28 & 0x7ff;
				int rotSin = Rasterizer.sinTable[rot];
				int rotCos = Rasterizer.cosTable[rot];
				final int rotX = targetY * rotCos - targetX * rotSin >> 16;
				final int rotY = targetX * rotCos + targetY * rotSin >> 16;
				final double theta = Math.atan2(rotY, rotX);
				final int posX = (int) (maxInterfaceDist * Math.sin(theta));
				final int posY = (int) (maxInterfaceDist * Math.cos(theta));
				if (!HDToolkit.glEnabled) {
					((LDSprite) Class69_Sub2.aClass120_Sub14_Sub19Array2237[iconType]).method1612(interfaceX + posX + jagexInterface.width / 2 - 10, interfaceY - posY + jagexInterface.height / 2 - 10, 20, 20, 15, 15, theta, 256);
				} else {
					((HDSprite) Class69_Sub2.aClass120_Sub14_Sub19Array2237[iconType]).method1601(240, 240, (interfaceX + posX + jagexInterface.width / 2) * 16, (interfaceY - posY + jagexInterface.height / 2) * 16, (int) (theta * 10430.378), 4096);
				}
			} else {
				Class23.drawSpriteOnMinimap(jagexInterface, interfaceX, interfaceY, targetX, targetY, Class120_Sub12_Sub5.aClass120_Sub14_Sub19Array3167[iconType]);
			}
		}
	}

	public Class145() {
		/* empty */
	}
}
