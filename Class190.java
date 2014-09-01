/* Class190 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class190 {
	static int anInt2100;
	static int anInt2101 = 0;

	static final boolean method2504(final int x, final int z, final int level, final int xOff, final int zOff, final int whiteColor, final int redColor) {
		long bitPacked = Class114.method1005(x + xOff, z + zOff, level);
		if (bitPacked != 0L) {
			final int rotation = 0x3 & (int) bitPacked >> 20;
			final int type = ((int) bitPacked & 0x7e0cc) >> 14;
			final int locId = 0x7fffffff & (int) (bitPacked >>> 32);
			final LocType locType = LocType.list(locId);
			if (locType.mapSceneId == -1) {
				int colors = whiteColor;
				final int[] pixels = GraphicsLD.pixels;
				final int pixelPos = 24624 - (-(x * 4) + -((52736 + -(z * 512)) * 4));
				if (bitPacked > 0L) {
					colors = redColor;
				}
				if (type == 0 || type == 2) {
					if (rotation == 0) {
						pixels[pixelPos] = colors;
						pixels[pixelPos + 512] = colors;
						pixels[pixelPos + 1024] = colors;
						pixels[pixelPos + 1536] = colors;
					} else if (rotation == 1) {
						pixels[pixelPos] = colors;
						pixels[pixelPos + 1] = colors;
						pixels[pixelPos + 2] = colors;
						pixels[pixelPos + 3] = colors;
					} else if (rotation == 2) {
						pixels[pixelPos + 3] = colors;
						pixels[pixelPos + 3 + 512] = colors;
						pixels[pixelPos + 3 + 1024] = colors;
						pixels[pixelPos + 3 + 1536] = colors;
					} else if (rotation == 3) {
						pixels[pixelPos + 1536] = colors;
						pixels[pixelPos + 1536 + 1] = colors;
						pixels[pixelPos + 1536 + 2] = colors;
						pixels[pixelPos + 1536 + 3] = colors;
					}
				}
				if (type == 3) {
					if (rotation == 0) {
						pixels[pixelPos] = colors;
					} else if (rotation == 1) {
						pixels[pixelPos + 3] = colors;
					} else if (rotation == 2) {
						pixels[pixelPos + 1536 + 3] = colors;
					} else if (rotation == 3) {
						pixels[pixelPos + 1536] = colors;
					}
				}
				if (type == 2) {
					if (rotation == 3) {
						pixels[pixelPos] = colors;
						pixels[pixelPos + 512] = colors;
						pixels[pixelPos + 1024] = colors;
						pixels[pixelPos + 1536] = colors;
					} else if (rotation == 0) {
						pixels[pixelPos] = colors;
						pixels[pixelPos + 1] = colors;
						pixels[pixelPos + 2] = colors;
						pixels[pixelPos + 3] = colors;
					} else if (rotation == 1) {
						pixels[pixelPos + 3] = colors;
						pixels[pixelPos + 3 + 512] = colors;
						pixels[pixelPos + 3 + 1024] = colors;
						pixels[pixelPos + 3 + 1536] = colors;
					} else if (rotation == 2) {
						pixels[pixelPos + 1536] = colors;
						pixels[pixelPos + 1536 + 1] = colors;
						pixels[pixelPos + 1536 + 2] = colors;
						pixels[pixelPos + 1536 + 3] = colors;
					}
				}
			} else if (!FrameLoader.method1583(xOff, z, locType, 4, x, zOff, rotation)) {
				return false;
			}
		}
		bitPacked = Class120_Sub11.method1173(x + xOff, z + zOff, level);
		if (bitPacked != 0L) {
			final int rotation = ((int) bitPacked & 0x35e805) >> 20;
			final int locId = 0x7fffffff & (int) (bitPacked >>> 32);
			final int type = ((int) bitPacked & 0x7da9b) >> 14;
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
						pixels[pixelPos + 1024 +  1] = color;
						pixels[pixelPos + 512 + 2] = color;
						pixels[pixelPos + 3] = color;
					} else {
						pixels[pixelPos] = color;
						pixels[pixelPos + 512 + 1] = color;
						pixels[pixelPos + 1024 + 2] = color;
						pixels[pixelPos + 1536 + 3] = color;
					}
				}
			} else if (!FrameLoader.method1583(xOff, z, locType, 4, x, zOff, rotation)) {
				return false;
			}
		}
		bitPacked = Class79_Sub1.method696(x + xOff, z + zOff, level);
		if (0L != bitPacked) {
			final int locId = (int) (bitPacked >>> 32) & 0x7fffffff;
			final int rotation = (0x389bda & (int) bitPacked) >> 20;
			final LocType locType = LocType.list(locId);
			if (locType.mapSceneId != -1 && !FrameLoader.method1583(xOff, z, locType, 4, x, zOff, rotation)) {
				return false;
			}
		}
		return true;
	}

	static final void method2506(final int i) {
		Class120_Sub12_Sub1.sleepModifier2 = 1000 / i;
	}
}
