/* Class140 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class140 {
	static int loadingStage = 0;
	private int current = 0;
	static int[] anIntArray1341 = { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0, 2, 0, 0, 1, 0 };
	private final Hashtable hashtable;
	static int buildArea = 0;
	private Node lastIterated;
	static int anInt1345;

	final Node next() {
		return getNext();
	}

	static final void method1995(final int i) {
		if (Class120_Sub12_Sub25.anInt3312 == 0) {
			Class30.aClass120_Sub30_Sub2_234.method1748(i);
		} else {
			Js5Request.activeMusicVolume = i;
		}
	}

	static final void decodeSprites(final byte[] data) {
		final Buffer buffer = new Buffer(data);
		buffer.pos = data.length - 2;
		Class93.spriteAmount = buffer.getUShort();
		PlainTile.spriteHasAlpha = new boolean[Class93.spriteAmount];
		Class120_Sub12.spriteAlphas = new byte[Class93.spriteAmount][];
		Projectile.spriteXOffsets = new int[Class93.spriteAmount];
		Class120_Sub12_Sub11.spriteWidths = new int[Class93.spriteAmount];
		SkyboxType.spritePaletteIndicators = new byte[Class93.spriteAmount][];
		Class120_Sub12_Sub39.spriteHeights = new int[Class93.spriteAmount];
		GroundTile.spriteYOffsets = new int[Class93.spriteAmount];
		buffer.pos = data.length - 7 - (8 * Class93.spriteAmount);
		Class31.spriteTrimWidth = buffer.getUShort();
		SceneGroundObject.spriteTrimHeight = buffer.getUShort();
		final int paletteSize = (0xff & buffer.getUByte()) + 1;
		for (int id = 0; id < Class93.spriteAmount; id++) {
			Projectile.spriteXOffsets[id] = buffer.getUShort();
		}
		for (int id = 0; id < Class93.spriteAmount; id++) {
			GroundTile.spriteYOffsets[id] = buffer.getUShort();
		}
		for (int id = 0; id < Class93.spriteAmount; id++) {
			Class120_Sub12_Sub11.spriteWidths[id] = buffer.getUShort();
		}
		for (int id = 0; id < Class93.spriteAmount; id++) {
			Class120_Sub12_Sub39.spriteHeights[id] = buffer.getUShort();
		}
		buffer.pos = data.length - 7 - (paletteSize - 1) * 3 - (Class93.spriteAmount * 8);
		Class132_Sub1.spritePalette = new int[paletteSize];
		for (int id = 1; id < paletteSize; id++) {
			Class132_Sub1.spritePalette[id] = buffer.getMedium();
			if (Class132_Sub1.spritePalette[id] == 0) {
				Class132_Sub1.spritePalette[id] = 1;
			}
		}
		buffer.pos = 0;
		for (int spriteId = 0; spriteId < Class93.spriteAmount; spriteId++) {
			final int width = Class120_Sub12_Sub11.spriteWidths[spriteId];
			final int height = Class120_Sub12_Sub39.spriteHeights[spriteId];
			final int pixelAmount = height * width;
			final byte[] paletteIndicators = new byte[pixelAmount];
			SkyboxType.spritePaletteIndicators[spriteId] = paletteIndicators;
			final byte[] alphas = new byte[pixelAmount];
			boolean hasAlpha = false;
			Class120_Sub12.spriteAlphas[spriteId] = alphas;
			final int imageType = buffer.getUByte();
			if ((0x1 & imageType) == 0) {
				for (int pixelId = 0; pixelId < pixelAmount; pixelId++) {
					paletteIndicators[pixelId] = buffer.getByte();
				}
				if ((0x2 & imageType) != 0) {
					for (int alphaId = 0; alphaId < pixelAmount; alphaId++) {
						final byte alpha = alphas[alphaId] = buffer.getByte();
						hasAlpha = hasAlpha | alpha != -1;
					}
				}
			} else {
				for (int x = 0; x < width; x++) {
					for (int y = 0; y < height; y++) {
						paletteIndicators[x + (width * y)] = buffer.getByte();
					}
				}
				if ((0x2 & imageType) != 0) {
					for (int x = 0; x < width; x++) {
						for (int y = 0; y < height; y++) {
							final byte alpha = alphas[x + y * width] = buffer.getByte();
							hasAlpha = hasAlpha | alpha != -1;
						}
					}
				}
			}
			PlainTile.spriteHasAlpha[spriteId] = hasAlpha;
		}
	}

	final Node getNext() {
		if (current > 0 && hashtable.table[current - 1] != lastIterated) {
			final Node lastNode = lastIterated;
			lastIterated = lastNode.next;
			return lastNode;
		}
		while (current < hashtable.capacity) {
			final Node nextNode = hashtable.table[current++].next;
			if (nextNode != hashtable.table[current - 1]) {
				lastIterated = nextNode.next;
				return nextNode;
			}
		}
		return null;
	}

	Class140(final Hashtable hashtable) {
		this.hashtable = hashtable;
	}

	static final void decodeWorldPlayers(final Buffer buffer) {
		for (int world = 0; world < Class57.worldLen2; world++) {
			final int worldId = buffer.getUSmart();
			int playerAmount = buffer.getUShort();
			if (playerAmount == 0xffff) {
				playerAmount = -1;
			}
			if (Class48.worldList[worldId] != null) {
				Class48.worldList[worldId].players = playerAmount;
			}
		}
	}
}
