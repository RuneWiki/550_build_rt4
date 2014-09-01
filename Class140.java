/* Class140 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class140 {
	static int loadingStage = 0;
	private int anInt1339 = 0;
	static boolean npcMemberClient;
	static int[] anIntArray1341 = { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0, 2, 0, 0, 1, 0 };
	private final Hashtable aClass75_1342;
	static int anInt1343 = 0;
	private Node aClass120_1344;
	static int anInt1345;

	final Node method1994() {
		return method1998();
	}

	static final void method1995(final int i) {
		if (Class120_Sub12_Sub25.anInt3312 == 0) {
			Class30.aClass120_Sub30_Sub2_234.method1748(i);
		} else {
			Js5Request.anInt3940 = i;
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
		Class145.spritePaletteIndicators = new byte[Class93.spriteAmount][];
		Class120_Sub12_Sub39.spriteHeights = new int[Class93.spriteAmount];
		GroundTile.spriteYOffsets = new int[Class93.spriteAmount];
		buffer.pos = data.length - 7 - (8 * Class93.spriteAmount);
		Class31.spriteTrimWidth = buffer.getUShort();
		SceneGroundObject.spriteTrimHeight = buffer.getUShort();
		final int paletteSize = (0xff & buffer.getUByte()) + 1;
		for (int i_3_ = 0; i_3_ < Class93.spriteAmount; i_3_++) {
			Projectile.spriteXOffsets[i_3_] = buffer.getUShort();
		}
		for (int i_4_ = 0; i_4_ < Class93.spriteAmount; i_4_++) {
			GroundTile.spriteYOffsets[i_4_] = buffer.getUShort();
		}
		for (int i_5_ = 0; i_5_ < Class93.spriteAmount; i_5_++) {
			Class120_Sub12_Sub11.spriteWidths[i_5_] = buffer.getUShort();
		}
		for (int i_6_ = 0; i_6_ < Class93.spriteAmount; i_6_++) {
			Class120_Sub12_Sub39.spriteHeights[i_6_] = buffer.getUShort();
		}
		buffer.pos = data.length - 7 - (paletteSize - 1) * 3 - (Class93.spriteAmount * 8);
		Class132_Sub1.spritePalette = new int[paletteSize];
		for (int id = 1; paletteSize > id; id++) {
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
			Class145.spritePaletteIndicators[spriteId] = paletteIndicators;
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

	static final void putVarp(final int id, final int value) {
		Class2.permanentVariable[id] = value;
		LongNode longNode = (LongNode) Class69_Sub3_Sub1.aClass75_3079.get(id);
		if (longNode == null) {
			longNode = new LongNode(TimeUtil.getSafeTime() + 500L);
			Class69_Sub3_Sub1.aClass75_3079.put(longNode, id);
		} else {
			longNode.value = TimeUtil.getSafeTime() + 500L;
		}
	}

	final Node method1998() {
		if (anInt1339 > 0 && aClass75_1342.table[-1 + anInt1339] != aClass120_1344) {
			final Node class120_23_ = aClass120_1344;
			aClass120_1344 = class120_23_.next;
			return class120_23_;
		}
		while (anInt1339 < aClass75_1342.capacity) {
			final Node class120_24_ = aClass75_1342.table[anInt1339++].next;
			if (aClass75_1342.table[anInt1339 + -1] != class120_24_) {
				aClass120_1344 = class120_24_.next;
				return class120_24_;
			}
		}
		return null;
	}

	public static void method1999(final byte i) {
		try {
			anIntArray1341 = null;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("qe.C(").append(i).append(')').toString());
		}
	}

	Class140(final Hashtable hashtable) {
		aClass75_1342 = hashtable;
	}

	static final void updateWorldPlayers(final Buffer buffer) {
		for (int world = 0; world < Class57.worldLen2; world++) {
			final int worldId = buffer.getUSmart();
			int playerAmount = buffer.getUShort();
			if (playerAmount == 65535) {
				playerAmount = -1;
			}
			if (Class48.worldList[worldId] != null) {
				Class48.worldList[worldId].players = playerAmount;
			}
		}
	}
}
