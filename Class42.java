/* Class42 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class42 {
	static volatile int currentMousePress;
	static boolean aBoolean363 = false;

	static {
		currentMousePress = 0;
	}

	static final void decodeNpcFiles() {
		for (int id = 0; id < Class179.npcSpawnsFilesBuffer.length; id++) {
			if (Class179.npcSpawnsFilesBuffer[id] != null) {
				int fileIndex = -1;
				for (int cacheId = 0; cacheId < Class120_Sub12_Sub29.npcSpawnsRegionPos; cacheId++) {
					if (Class120_Sub12_Sub8.npcSpawnsRegionBitPacked[cacheId] == Class120_Sub12_Sub36.regionBitPackeds[id]) {
						fileIndex = cacheId;
						break;
					}
				}
				if (fileIndex == -1) {
					Class120_Sub12_Sub8.npcSpawnsRegionBitPacked[Class120_Sub12_Sub29.npcSpawnsRegionPos] = Class120_Sub12_Sub36.regionBitPackeds[id];
					fileIndex = Class120_Sub12_Sub29.npcSpawnsRegionPos++;
				}
				final Buffer buffer = new Buffer(Class179.npcSpawnsFilesBuffer[id]);
				int npcCount = 0;
				while (Class179.npcSpawnsFilesBuffer[id].length > buffer.pos && npcCount < 511 && Class148.localNpcCount < 1023) {
					final int index = npcCount++ << 6 | fileIndex;
					final int positionBitpacked = buffer.getUShort();
					final int level = positionBitpacked >> 14;
					final int x = (positionBitpacked >> 7) & 0x3f;
					final int z = positionBitpacked & 0x3f;
					final int npcX = (Class120_Sub12_Sub36.regionBitPackeds[id] >> 8) * 64 - GameEntity.currentBaseX + x;
					final int npcZ = (Class120_Sub12_Sub36.regionBitPackeds[id] & 0xff) * 64 - LightType.currentBaseZ + z;
					int npcId = buffer.getUShort();
					final NpcType npcType = NpcType.list(npcId);
					if (Class120_Sub12_Sub11.npcList[index] == null && (npcType.loginScreenProperties & 0x1) > 0 && SpotAnimationNode.visibleLevel == level && npcX >= 0 && npcType.size + npcX < 104 && npcZ >= 0 && npcZ + npcType.size < 104) {
						Class120_Sub12_Sub11.npcList[index] = new Npc();
						final Npc npc = Class120_Sub12_Sub11.npcList[index];
						Class120_Sub12_Sub36.npcIndices[Class148.localNpcCount++] = index;
						npc.lastUpdateCycle = Class101_Sub2.loopCycle;
						npc.setNpcType(npcType);
						npc.setSize(npc.npcType.size);
						npc.newFaceDegrees = npc.faceDegrees = Class15.anIntArray101[npc.npcType.spawnDirection];
						npc.anInt3010 = npc.npcType.anInt1672;
						if (npc.anInt3010 == 0) {
							npc.faceDegrees = 0;
						}
						npc.entityRenderDataId = npc.npcType.renderDataId;
						npc.setPos(npcX, npcZ, npc.getSize(), true);
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
