/* Class190 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class190 {
	static int anInt2100;
	static int anInt2101 = 0;

	static final boolean pushMinimapPixels(final int x, final int z, final int level, final int xOff, final int zOff, final int whiteColor, final int redColor) {
		long bitPacked = Class114.getWallLocationUid(x + xOff, z + zOff, level);
		if (bitPacked != 0L) {
			final int rotation = (int) (bitPacked >> 20) & 0x3;
			final int type = (int) (bitPacked >> 14) & 0x1f;
			final int locId = (int) (bitPacked >>> 32) & 0x7fffffff;
			final LocType locType = LocType.list(locId);
			if (locType.mapSceneId == -1) {
				int color = whiteColor;
				final int[] pixels = GraphicsLD.pixels;
				final int pixelPos = 24624 - (-(x * 4) + -((52736 + -(z * 512)) * 4));
				if (bitPacked > 0L) {
					color = redColor;
				}
				if (type == 0 || type == 2) {
					if (rotation == 0) {
						pixels[pixelPos] = color;
						pixels[pixelPos + 512] = color;
						pixels[pixelPos + 1024] = color;
						pixels[pixelPos + 1536] = color;
					} else if (rotation == 1) {
						pixels[pixelPos] = color;
						pixels[pixelPos + 1] = color;
						pixels[pixelPos + 2] = color;
						pixels[pixelPos + 3] = color;
					} else if (rotation == 2) {
						pixels[pixelPos + 3] = color;
						pixels[pixelPos + 3 + 512] = color;
						pixels[pixelPos + 3 + 1024] = color;
						pixels[pixelPos + 3 + 1536] = color;
					} else if (rotation == 3) {
						pixels[pixelPos + 1536] = color;
						pixels[pixelPos + 1536 + 1] = color;
						pixels[pixelPos + 1536 + 2] = color;
						pixels[pixelPos + 1536 + 3] = color;
					}
				}
				if (type == 3) {
					if (rotation == 0) {
						pixels[pixelPos] = color;
					} else if (rotation == 1) {
						pixels[pixelPos + 3] = color;
					} else if (rotation == 2) {
						pixels[pixelPos + 1536 + 3] = color;
					} else if (rotation == 3) {
						pixels[pixelPos + 1536] = color;
					}
				}
				if (type == 2) {
					if (rotation == 3) {
						pixels[pixelPos] = color;
						pixels[pixelPos + 512] = color;
						pixels[pixelPos + 1024] = color;
						pixels[pixelPos + 1536] = color;
					} else if (rotation == 0) {
						pixels[pixelPos] = color;
						pixels[pixelPos + 1] = color;
						pixels[pixelPos + 2] = color;
						pixels[pixelPos + 3] = color;
					} else if (rotation == 1) {
						pixels[pixelPos + 3] = color;
						pixels[pixelPos + 3 + 512] = color;
						pixels[pixelPos + 3 + 1024] = color;
						pixels[pixelPos + 3 + 1536] = color;
					} else if (rotation == 2) {
						pixels[pixelPos + 1536] = color;
						pixels[pixelPos + 1536 + 1] = color;
						pixels[pixelPos + 1536 + 2] = color;
						pixels[pixelPos + 1536 + 3] = color;
					}
				}
			} else if (!FrameLoader.drawMapSceneOnMinimap(locType, x, z, xOff, zOff, rotation)) {
				return false;
			}
		}
		bitPacked = Class120_Sub11.method1173(x + xOff, z + zOff, level);
		if (bitPacked != 0L) {
			final int rotation = (int) (bitPacked >> 20) & 0x3;
			final int type = (int) (bitPacked >> 14) & 0x1f;
			final int locId = (int) (bitPacked >>> 32) & 0x7fffffff;
			final LocType locType = LocType.list(locId);
			if (locType.mapSceneId == -1) {
				if (type == 9) {
					int color = 15658734;
					final int[] pixels = GraphicsLD.pixels;
					if (bitPacked > 0L) {
						color = 15597568;
					}
					final int pixelPos = x * 4 + 24624 - -((52736 + -(512 * z)) * 4);
					if (rotation == 0 || rotation == 2) {
						pixels[pixelPos + 1536] = color;
						pixels[pixelPos + 1024 + 1] = color;
						pixels[pixelPos + 512 + 2] = color;
						pixels[pixelPos + 3] = color;
					} else {
						pixels[pixelPos] = color;
						pixels[pixelPos + 512 + 1] = color;
						pixels[pixelPos + 1024 + 2] = color;
						pixels[pixelPos + 1536 + 3] = color;
					}
				}
			} else if (!FrameLoader.drawMapSceneOnMinimap(locType, x, z, xOff, zOff, rotation)) {
				return false;
			}
		}
		bitPacked = Class79_Sub1.getGroundDecorationUid(x + xOff, z + zOff, level);
		if (0L != bitPacked) {
			final int rotation = (int) (bitPacked >> 20) & 0x3;
			final int locId = (int) (bitPacked >>> 32) & 0x7fffffff;
			final LocType locType = LocType.list(locId);
			if (locType.mapSceneId != -1 && !FrameLoader.drawMapSceneOnMinimap(locType, x, z, xOff, zOff, rotation)) {
				return false;
			}
		}
		return true;
	}

	static final void setFps(final int fps) {
		Class120_Sub12_Sub1.sleepModifier2 = 1000 / fps;
	}
}
