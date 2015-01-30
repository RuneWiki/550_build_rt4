/* Class42 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class42 {
	static volatile int currentMousePress;
	static boolean aBoolean363 = false;

	static {
		currentMousePress = 0;
	}

	static final void method336() {
		final int i_0_ = Class179.aByteArrayArray1777.length;
		for (int i_1_ = 0; i_1_ < i_0_; i_1_++) {
			if (Class179.aByteArrayArray1777[i_1_] != null) {
				int i_2_ = -1;
				for (int i_3_ = 0; i_3_ < Class120_Sub12_Sub29.anInt3362; i_3_++) {
					if (Class120_Sub12_Sub8.anIntArray3190[i_3_] == Class120_Sub12_Sub36.anIntArray3417[i_1_]) {
						i_2_ = i_3_;
						break;
					}
				}
				if ((i_2_ ^ 0xffffffff) == 0) {
					Class120_Sub12_Sub8.anIntArray3190[Class120_Sub12_Sub29.anInt3362] = Class120_Sub12_Sub36.anIntArray3417[i_1_];
					i_2_ = Class120_Sub12_Sub29.anInt3362++;
				}
				final Buffer class120_sub7 = new Buffer(Class179.aByteArrayArray1777[i_1_]);
				int i_4_ = 0;
				while (Class179.aByteArrayArray1777[i_1_].length > class120_sub7.pos && i_4_ < 511 && Class148.localNpcCount < 1023) {
					final int index = i_4_++ << 6 | i_2_;
					final int positionBitpacked = class120_sub7.getUShort();
					final int level = positionBitpacked >> 14;
					final int x = (positionBitpacked >> 7) & 0x3f;
					final int z = 0x3f & positionBitpacked;
					final int i_9_ = (Class120_Sub12_Sub36.anIntArray3417[i_1_] >> 8) * 64 - GameEntity.currentBaseX + x;
					final int i_11_ = (Class120_Sub12_Sub36.anIntArray3417[i_1_] & 0xff) * 64 - Class181.currentBaseZ + z;
					int npcId = class120_sub7.getUShort();
					final NpcType npcType = NpcType.list(npcId);
					if (Class120_Sub12_Sub11.npcList[index] == null && (npcType.aByte1700 & 0x1) > 0 && SpotAnimationNode.anInt3469 == level && i_9_ >= 0 && npcType.size + i_9_ < 104 && i_11_ >= 0 && i_11_ + npcType.size < 104) {
						Class120_Sub12_Sub11.npcList[index] = new Npc();
						final Npc class180_sub5_sub2 = Class120_Sub12_Sub11.npcList[index];
						Class120_Sub12_Sub36.localNpcIndices[Class148.localNpcCount++] = index;
						class180_sub5_sub2.lastUpdateCycle = Class101_Sub2.loopCycle;
						class180_sub5_sub2.setNpcType(npcType);
						class180_sub5_sub2.setSize(class180_sub5_sub2.npcType.size);
						class180_sub5_sub2.anInt3019 = class180_sub5_sub2.anInt3032 = Class15.anIntArray101[class180_sub5_sub2.npcType.aByte1652];
						class180_sub5_sub2.anInt3010 = class180_sub5_sub2.npcType.anInt1672;
						if (class180_sub5_sub2.anInt3010 == 0) {
							class180_sub5_sub2.anInt3032 = 0;
						}
						class180_sub5_sub2.anInt2982 = class180_sub5_sub2.npcType.anInt1692;
						class180_sub5_sub2.method2323(i_9_, i_11_, class180_sub5_sub2.getSize(), true);
					}
				}
			}
		}
	}

	static final AbstractSprite constructAbstractSprite() {
		final int pixelLen = Class120_Sub12_Sub39.spriteHeights[0] * Class120_Sub12_Sub11.spriteWidths[0];
		final byte[] indicators = Class145.spritePaletteIndicators[0];
		final int[] pixels = new int[pixelLen];
		for (int id = 0; id < pixelLen; id++) {
			pixels[id] = Class132_Sub1.spritePalette[indicators[id] & 0xff];
		}
		AbstractSprite abstractSprite;
		if (HDToolkit.glEnabled) {
			abstractSprite = new HDSprite(Class31.spriteTrimWidth, SceneGroundObject.spriteTrimHeight, Projectile.spriteXOffsets[0], GroundTile.spriteYOffsets[0], Class120_Sub12_Sub11.spriteWidths[0], Class120_Sub12_Sub39.spriteHeights[0], pixels);
		} else {
			abstractSprite = new LDSprite(Class31.spriteTrimWidth, SceneGroundObject.spriteTrimHeight, Projectile.spriteXOffsets[0], GroundTile.spriteYOffsets[0], Class120_Sub12_Sub11.spriteWidths[0], Class120_Sub12_Sub39.spriteHeights[0], pixels);
		}
		Class53_Sub1.resetSpriteInfo();
		return abstractSprite;
	}
}
