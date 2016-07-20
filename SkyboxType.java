/* Class145 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class SkyboxType {
	static int sleepModifier1 = 1;
	static int anInt1379 = 1;
	int anInt1380 = -1;
	static int renderZ;
	static int renderYawWrapper;
	int[] sphereIds;
	int textureId = -1;
	static js5 aClass50_678;
	static ObjectCache aClass21_1486 = new ObjectCache(16);
	static byte[][] spritePaletteIndicators;

	private final void decode(final Buffer buffer, final int code) {
		if (code == 1) {
			this.textureId = buffer.getUShort();
		} else if (code == 2) {
			this.sphereIds = new int[buffer.getUByte()];
			for (int id = 0; id < this.sphereIds.length; id++) {
				this.sphereIds[id] = buffer.getUShort();
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

	static final void setup(final js5 js5) {
		aClass50_678 = js5;
	}

	static final SkyboxType list(final int id) {
		SkyboxType skyboxType = (SkyboxType) aClass21_1486.get(id);
		if (skyboxType != null) {
			return skyboxType;
		}
		final byte[] data = aClass50_678.getFile(29, id);//Has 0 files in 550 cache
		skyboxType = new SkyboxType();
		if (data != null) {
			skyboxType.decode(new Buffer(data));
		}
		aClass21_1486.put(skyboxType, id);
		return skyboxType;
	}

	static final void drawHintIconOnMinimap(final JagexInterface jagexInterface, final int maxDist, final int interfaceX, final int targetY, final int interfaceY, final int targetX, final int iconType) {
		final int dist = targetX * targetX + targetY * targetY;
		if (dist <= maxDist) {
			int maxInterfaceDist = Math.min(jagexInterface.width / 2, jagexInterface.height / 2);
			if (dist > maxInterfaceDist * maxInterfaceDist) {
				maxInterfaceDist -= 10;
				final int rot = (int) DummyOutputStream.cameraYaw & 0x7ff;
				int rotSin = Rasterizer.sinTable[rot];
				int rotCos = Rasterizer.cosTable[rot];
				final int rotX = targetY * rotCos - targetX * rotSin >> 16;
				final int rotY = targetX * rotCos + targetY * rotSin >> 16;
				final double theta = Math.atan2(rotY, rotX);
				final int posX = (int) (maxInterfaceDist * Math.sin(theta));
				final int posY = (int) (maxInterfaceDist * Math.cos(theta));
				if (!HDToolkit.glEnabled) {
					((LDSprite) Class69_Sub2.hintMapEdgeSprites[iconType]).method1612(interfaceX + posX + jagexInterface.width / 2 - 10, interfaceY - posY + jagexInterface.height / 2 - 10, 20, 20, 15, 15, theta, 256);
				} else {
					((HDSprite) Class69_Sub2.hintMapEdgeSprites[iconType]).method1601(240, 240, (interfaceX + posX + jagexInterface.width / 2) * 16, (interfaceY - posY + jagexInterface.height / 2) * 16, (int) (theta * 10430.378), 4096);
				}
			} else {
				client.drawSpriteOnMinimap(jagexInterface, interfaceX, interfaceY, targetX, targetY, Class120_Sub12_Sub5.hintMapMarkerSprites[iconType]);
			}
		}
	}

	public SkyboxType() {
		/* empty */
	}
}
