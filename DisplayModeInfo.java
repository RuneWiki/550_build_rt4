/* Class171 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class DisplayModeInfo {
	static int[] crcTable = new int[256];
	static String aString1708 = "Created gameworld";
	int height;
	int width;
	int refreshRate;
	int bitDepth;
	static int anInt1713;
	static int revision;
	static int anInt1715;

	static {
		for (int i = 0; i < 256; i++) {
			int i_0_ = i;
			for (int i_1_ = 0; i_1_ < 8; i_1_++) {
				if ((0x1 & i_0_) == 1) {
					i_0_ = i_0_ >>> 1 ^ ~0x12477cdf;
				} else {
					i_0_ >>>= 1;
				}
			}
			crcTable[i] = i_0_;
		}
		anInt1715 = 0;
	}

	static final void method2213() {
		Class120_Sub12_Sub23.anInt3307 = 0;
		Class154.anInt1441 = 0;
		Class92.method767();
		Class179.method2262();
		Class174.method2233();
		Decimator.method2223();
		for (int id = 0; id < Class120_Sub12_Sub23.anInt3307; id++) {
			final int index = Class43.anIntArray366[id];
			if (Class101_Sub2.loopCycle != Class118.playersList[index].lastUpdateCycle) {
				if (Class118.playersList[index].ambientSoundHearDistance > 0) {
					Class31.removePlayerAmbientSound(Class118.playersList[index]);
				}
				Class118.playersList[index] = null;
			}
		}
		if (Canvas_Sub1.inputStream.pos != AbstractMouseWheelHandler.packetSize) {
			throw new RuntimeException("gpp1 pos:" + Canvas_Sub1.inputStream.pos + " psize:" + AbstractMouseWheelHandler.packetSize);
		}
		for (int index = 0; index < FileSystemWorker.localPlayerCount; index++) {
			if (Class118.playersList[Class112.playerIndices[index]] == null) {
				throw new RuntimeException("gpp2 pos:" + index + " size:" + FileSystemWorker.localPlayerCount);
			}
		}
	}

	static final void method2214() {
		CursorType.recentUse.clear();
		CursorType.spriteCache.clear();
	}

	static final String bufferToString(final byte[] buf, final int off, final int len) {
		final char[] charSequence = new char[len];
		int charAmount = 0;
		for (int id = 0; id < len; id++) {
			int c = buf[off + id] & 0xff;
			if (c != 0) {
				if (c >= 128 && c < 160) {
					int i_9_ = Class120_Sub12_Sub32.aCharArray3385[c - 128];
					if (i_9_ == 0) {
						i_9_ = 63;
					}
					c = i_9_;
				}
				charSequence[charAmount++] = (char) c;
			}
		}
		return new String(charSequence, 0, charAmount);
	}

	public DisplayModeInfo() {
		/* empty */
	}
}
