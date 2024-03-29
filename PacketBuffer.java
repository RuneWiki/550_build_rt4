/* Class120_Sub7_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class PacketBuffer extends Buffer {
	private IsaacCipher isaacCipher;
	static int[] anIntArray3120;
	private int bitOffset;
	static boolean highWaterDetail = true;

	PacketBuffer(final int i) {
		super(i);
	}

	final void initIsaac(final int[] is) {
		isaacCipher = new IsaacCipher(is);
	}

	static final void sleepWrapper(final long millis) {
		if (millis > 0L) {
			if (millis % 10L == 0L) {
				NpcType.sleep(millis - 1L);
				NpcType.sleep(1L);
			} else {
				NpcType.sleep(millis);
			}
		}
	}

	static final void method1143(final int i) {
		Class96.clickedMouseFunctionBlinksLeft = 3;
		Class120_Sub12_Sub9.clickedMouseFunctionId = i;
		Class136.clickedMouseFunctionCycle = 100;
		Class127.anInt1215 = -1;
	}

	final void startBitAccess() {
		bitOffset = 8 * this.pos;
	}

	static final void decodePreferences(final Buffer buffer) {
		if (buffer.buf.length - buffer.pos >= 1) {
			final int fileVersion = buffer.getUByte();
			if (fileVersion >= 0 && fileVersion <= 11) {
				int fileSizeInBytes;
				if (fileVersion == 11) {
					fileSizeInBytes = 33;
				} else if (fileVersion == 10) {
					fileSizeInBytes = 32;
				} else if (fileVersion == 9) {
					fileSizeInBytes = 31;
				} else if (fileVersion == 8) {
					fileSizeInBytes = 30;
				} else if (fileVersion == 7) {
					fileSizeInBytes = 29;
				} else if (fileVersion == 6) {
					fileSizeInBytes = 28;
				} else if (fileVersion == 5) {
					fileSizeInBytes = 28;
				} else if (fileVersion == 4) {
					fileSizeInBytes = 24;
				} else if (fileVersion == 3) {
					fileSizeInBytes = 23;
				} else if (fileVersion == 2) {
					fileSizeInBytes = 22;
				} else if (fileVersion == 1) {
					fileSizeInBytes = 23;
				} else {
					fileSizeInBytes = 19;
				}
				if (buffer.buf.length - buffer.pos >= fileSizeInBytes) {
					FileSystemRequest.brightness = buffer.getUByte();
					if (FileSystemRequest.brightness < 1) {
						FileSystemRequest.brightness = 1;
					} else if (FileSystemRequest.brightness > 4) {
						FileSystemRequest.brightness = 4;
					}
					GameShell.setAllVisibleLevels(buffer.getUByte() == 1);
					Class120_Sub12.removeRoofsSelectively = buffer.getUByte() == 1;
					Hashtable.showGroundDecorations = buffer.getUByte() == 1;
					ParticleNodeSub.highDetailTextures = buffer.getUByte() == 1;
					Class120_Sub12_Sub10.manyIdleAnimations = buffer.getUByte() == 1;
					ChunkAtmosphere.flickeringEffectsOn = buffer.getUByte() == 1;
					Class120_Sub30_Sub1.manyGroundTextures = buffer.getUByte() == 1;
					Class120_Sub6.characterShadowsOn = buffer.getUByte() == 1;
					Class74.sceneryShadowsType = buffer.getUByte();
					if (Class74.sceneryShadowsType > 2) {
						Class74.sceneryShadowsType = 2;
					}
					if (fileVersion < 2) {
						Class120_Sub12_Sub6.highLightingDetail = buffer.getUByte() == 1;
						buffer.getUByte();
					} else {
						Class120_Sub12_Sub6.highLightingDetail = buffer.getUByte() == 1;
					}
					highWaterDetail = buffer.getUByte() == 1;
					Decimator.fogEnabled = buffer.getUByte() == 1;
					AbstractMouseWheelHandler.antiAliasingDefault = buffer.getUByte();
					if (AbstractMouseWheelHandler.antiAliasingDefault > 2) {
						AbstractMouseWheelHandler.antiAliasingDefault = 2;
					}
					GroundDecoration.antiAliasingSamples = AbstractMouseWheelHandler.antiAliasingDefault;
					Class167.isStereo = buffer.getUByte() == 1;
					Class111.soundEffectVolume = buffer.getUByte();
					if (Class111.soundEffectVolume > 127) {
						Class111.soundEffectVolume = 127;
					}
					RuntimeException_Sub1.musicVolume = buffer.getUByte();
					CursorType.ambientSoundsVolume = buffer.getUByte();
					if (CursorType.ambientSoundsVolume > 127) {
						CursorType.ambientSoundsVolume = 127;
					}
					if (fileVersion >= 1) {
						Class120_Sub12_Sub18.lastFullscreenWidth = buffer.getUShort();
						Class120_Sub12_Sub12.lastFullscreenHeight = buffer.getUShort();
					}
					if (fileVersion >= 3 && fileVersion < 6) {
						buffer.getUByte();
					}
					if (fileVersion >= 4) {
						int particles = buffer.getUByte();
						if (Class120_Sub14_Sub13.maxMemory < 96) {
							particles = 0;
						}
						ParticleEngine.setParticles(particles);
					}
					if (fileVersion >= 5) {
						Class120_Sub19.lastWorldId = buffer.getInt();
					}
					if (fileVersion >= 6) {
						Class120_Sub12_Sub19.lastUsedDisplayMode = buffer.getUByte();
					}
					if (fileVersion >= 7) {
						InterfaceClickMask.safeModeEnabled = buffer.getUByte() == 1;
					}
					if (fileVersion >= 8) {
						Class134.updateCameraFromCs2 = buffer.getUByte() == 1;
					}
					if (fileVersion >= 9) {
						Class140.buildArea = buffer.getUByte();
					}
					if (fileVersion >= 10) {
						WallDecoration.hdrEnabled = buffer.getUByte() != 0;
					}
					if (fileVersion >= 11) {
						Class38.cursorsEnabled = buffer.getUByte() != 0;
					}
				}
			}
		}
	}

	final void endBitAccess() {
		this.pos = (7 + bitOffset) / 8;
	}

	static final void method1147() {
		if (GZIPDecompressor.anIntArray800 == null || FileSystemWorker.anIntArray789 == null) {
			FileSystemWorker.anIntArray789 = new int[256];
			GZIPDecompressor.anIntArray800 = new int[256];
			for (int i_4_ = 0; i_4_ < 256; i_4_++) {
				final double d = i_4_ / 255.0 * 6.283185307179586;
				GZIPDecompressor.anIntArray800[i_4_] = (int) (Math.sin(d) * 4096.0);
				FileSystemWorker.anIntArray789[i_4_] = (int) (Math.cos(d) * 4096.0);
			}
		}
	}

	final int getUByteIsaac() {
		return 0xff & this.buf[this.pos++] - isaacCipher.val();
	}

	final void getBytesIsaac(final byte[] buf, final int off, final int len) {
		for (int id = 0; id < len; id++) {
			buf[id + off] = (byte) (this.buf[this.pos++] - isaacCipher.val());
		}
	}

	final void putByteIsaac(final int i_8_) {
		this.buf[this.pos++] = (byte) (isaacCipher.val() + i_8_);
	}

	final int getBitsLeft(final int i) {
		return 8 * i - bitOffset;
	}

	final int getBitValue(int bit) {
		int byteOff = 8 - (bitOffset & 7);
		int bitOff = bitOffset >> 3;
		bitOffset += bit;
		int value = 0;
		for (/**/; bit > byteOff; byteOff = 8) {
			value += (this.buf[bitOff++] & GroundObjectNode.bitMasks[byteOff]) << -byteOff + bit;
			bit -= byteOff;
		}
		if (byteOff != bit) {
			value += this.buf[bitOff] >> -bit + byteOff & GroundObjectNode.bitMasks[bit];
		} else {
			value += GroundObjectNode.bitMasks[byteOff] & this.buf[bitOff];
		}
		return value;
	}
}
