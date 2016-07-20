/* Class120_Sub14_Sub14_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class FileSystemRequest extends AbstractRequest {
	static int[] soundEffectVolumes;
	int type;
	static Deque projectileDeque;
	static WorldMapFont aClass98_3929;
	static AbstractSprite[] prayerIconSprites;
	byte[] buffer;
	static short aShort3932 = 32767;
	static int[][] entityCountOnTile;
	static int brightness;
	FileSystem fileSystem;

	static {
		soundEffectVolumes = new int[50];
		brightness = 3;
		projectileDeque = new Deque();
	}

	@Override
	final int getCompletion() {
		if (this.aBoolean3576) {
			return 0;
		}
		return 100;
	}

	static final void renderNpcs(final int renderSize, final boolean bool_3_, final boolean bool_4_) {
		for (int id = 0; id < Class148.localNpcCount; id++) {
			final Npc npc = Class120_Sub12_Sub11.npcList[Class120_Sub12_Sub36.npcIndices[id]];
			if (npc != null && npc.isVisible() && npc.npcType.method2199()) {
				final int npcSize = npc.getSize();
				if (bool_4_) {
					if (!npc.npcType.biggestRenderPriority) {
						continue;
					}
				} else if (!npc.npcType.aBoolean1656 == bool_3_ || renderSize != 0 && renderSize != npcSize) {
					continue;
				}
				if (npcSize != 1) {
					if (((npcSize & 0x1) != 0 || (npc.x & 0x7f) == 0 && (npc.z & 0x7f) == 0) && ((npcSize & 0x1) != 1 || (npc.x & 0x7f) == 64 && (npc.z & 0x7f) == 64)) {
						int startRenderX = npc.x - npcSize * 64 >> 7;
						int startRenderZ = npc.z - npcSize * 64 >> 7;
						int endRenderX = npc.getSize() + startRenderX;
						int endRenderZ = npc.getSize() + startRenderZ;
						if (startRenderX < 0) {
							startRenderX = 0;
						}
						if (endRenderX > 104) {
							endRenderX = 104;
						}
						if (startRenderZ < 0) {
							startRenderZ = 0;
						}
						if (endRenderZ > 104) {
							endRenderZ = 104;
						}
						for (int x = startRenderX; x < endRenderX; x++) {
							for (int z = startRenderZ; z < endRenderZ; z++) {
								entityCountOnTile[x][z]++;
							}
						}
					}
				} else if ((npc.x & 0x7f) == 64 && (npc.z & 0x7f) == 64) {
					final int renderX = npc.x >> 7;
					final int renderZ = npc.z >> 7;
					if (renderX >= 0 && renderX < 104 && renderZ >= 0 && renderZ < 104) {
						entityCountOnTile[renderX][renderZ]++;
					}
				}
			}
		}
		for (int id = 0; id < Class148.localNpcCount; id++) {
			final Npc npc = Class120_Sub12_Sub11.npcList[Class120_Sub12_Sub36.npcIndices[id]];
			long uid = 0x20000000L | (long) Class120_Sub12_Sub36.npcIndices[id] << 32;
			if (npc != null && npc.isVisible() && npc.npcType.method2199()) {
				final int npcSize = npc.getSize();
				if (bool_4_) {
					if (!npc.npcType.biggestRenderPriority) {
						continue;
					}
				} else if (bool_3_ != npc.npcType.aBoolean1656 || renderSize != 0 && renderSize != npcSize) {
					continue;
				}
				npc.needToRender = true;
				if (npcSize == 1) {
					if ((npc.x & 0x7f) == 64 && (npc.z & 0x7f) == 64) {
						final int renderX = npc.x >> 7;
						final int renderZ = npc.z >> 7;
						if (renderX < 0 || renderX >= 104 || renderZ < 0 || renderZ >= 104) {
							continue;
						}
						if (entityCountOnTile[renderX][renderZ] > 1) {
							entityCountOnTile[renderX][renderZ]--;
							continue;
						}
					}
				} else if ((npcSize & 0x1) == 0 && (npc.x & 0x7f) == 0 && (npc.z & 0x7f) == 0 || (npcSize & 0x1) == 1 && (npc.x & 0x7f) == 64 && (npc.z & 0x7f) == 64) {
					int startRenderX = npc.x - npcSize * 64 >> 7;
					int startRenderZ = npc.z - npcSize * 64 >> 7;
					int endRenderX = npcSize + startRenderX;
					int endRenderZ = npcSize + startRenderZ;
					if (startRenderX < 0) {
						startRenderX = 0;
					}
					if (endRenderX > 104) {
						endRenderX = 104;
					}
					if (startRenderZ < 0) {
						startRenderZ = 0;
					}
					if (endRenderZ > 104) {
						endRenderZ = 104;
					}
					boolean hasEntityOnTop = true;
					for (int x = startRenderX; x < endRenderX; x++) {
						for (int z = startRenderZ; z < endRenderZ; z++) {
							if (entityCountOnTile[x][z] <= 1) {
								hasEntityOnTop = false;
								break;
							}
						}
					}
					if (hasEntityOnTop) {
						for (int x = startRenderX; x < endRenderX; x++) {
							for (int z = startRenderZ; z < endRenderZ; z++) {
								entityCountOnTile[x][z]--;
							}
						}
						continue;
					}
				}
				if (!npc.npcType.canRightClick) {
					uid |= ~0x7fffffffffffffffL;
				}
				npc.needToRender = false;
				npc.y = Class22.getTileHeight(npc.x, npc.z, Class173.gameLevel);
				Class120_Sub12_Sub5.method1218(Class173.gameLevel, npc.x, npc.z, npc.y, 60 + npcSize * 64 + -64, npc, npc.faceDegrees, uid, npc.aBoolean3002);
			}
		}
	}

	static final void method1546(final int i, final int i_28_, final boolean bool) {
		if (i_28_ < 8000 || i_28_ > 48000) {
			throw new IllegalArgumentException();
		}
		Class120_Sub14_Sub13.anInt3569 = i;
		Class90.aBoolean846 = bool;
		Class178.anInt1771 = i_28_;
	}

	public FileSystemRequest() {
		/* empty */
	}

	@Override
	final byte[] getBuffer() {
		if (this.aBoolean3576) {
			throw new RuntimeException();
		}
		return this.buffer;
	}
}
