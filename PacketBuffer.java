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
			if (millis == 0L % 10L) {
				NpcType.sleep(millis - 1L);
				NpcType.sleep(1L);
			} else {
				NpcType.sleep(millis);
			}
		}
	}

	static final void method1143(final int i, final byte i_0_) {
		try {
			Class96.anInt919 = 3;
			Class120_Sub12_Sub9.anInt3195 = i;
			if (i_0_ <= -86) {
				Class136.anInt1321 = 100;
				Class127.anInt1215 = -1;
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("wa.KC(").append(i).append(',').append(i_0_).append(')').toString());
		}
	}

	final void startBitAccess() {
		bitOffset = 8 * this.pos;
	}

	static final void method1145(final Buffer class120_sub7, final int i) {
		try {
			if (-class120_sub7.pos + class120_sub7.buf.length >= 1) {
				final int i_1_ = class120_sub7.getUByte();
				if (i_1_ >= 0 && i_1_ <= 11) {
					int i_2_;
					if (i_1_ != 11) {
						if (i_1_ == 10) {
							i_2_ = 32;
						} else if (i_1_ == 9) {
							i_2_ = 31;
						} else if (i_1_ == 8) {
							i_2_ = 30;
						} else if (i_1_ == 7) {
							i_2_ = 29;
						} else if (i_1_ == 6) {
							i_2_ = 28;
						} else if (i_1_ == 5) {
							i_2_ = 28;
						} else if (i_1_ != 4) {
							if (i_1_ == 3) {
								i_2_ = 23;
							} else if (i_1_ != 2) {
								if (i_1_ == 1) {
									i_2_ = 23;
								} else {
									i_2_ = 19;
								}
							} else {
								i_2_ = 22;
							}
						} else {
							i_2_ = 24;
						}
					} else {
						i_2_ = 33;
					}
					if (i_2_ <= class120_sub7.buf.length - class120_sub7.pos) {
						FileSystemRequest.brightness = class120_sub7.getUByte();
						if (FileSystemRequest.brightness < 1) {
							FileSystemRequest.brightness = 1;
						} else if (FileSystemRequest.brightness > 4) {
							FileSystemRequest.brightness = 4;
						}
						GameShell.method32(class120_sub7.getUByte() == 1);
						Class120_Sub12.aBoolean2564 = class120_sub7.getUByte() == 1;
						Hashtable.showGroundDecorations = class120_sub7.getUByte() == 1;
						ParticleNodeSub.highDetailTextures = class120_sub7.getUByte() == 1;
						Class120_Sub12_Sub10.manyIdleAnimations = class120_sub7.getUByte() == 1;
						Class191.flickeringEffectsOn = class120_sub7.getUByte() == 1;
						Class120_Sub30_Sub1.manyGroundTextures = class120_sub7.getUByte() == 1;
						Class120_Sub6.characterShadowsOn = class120_sub7.getUByte() == 1;
						Class74.sceneryShadowsType = class120_sub7.getUByte();
						if (Class74.sceneryShadowsType > 2) {
							Class74.sceneryShadowsType = 2;
						}
						if (i_1_ < 2) {
							Class120_Sub12_Sub6.highLightingDetail = class120_sub7.getUByte() == 1;
							class120_sub7.getUByte();
						} else {
							Class120_Sub12_Sub6.highLightingDetail = class120_sub7.getUByte() == 1;
						}
						highWaterDetail = class120_sub7.getUByte() == 1;
						Decimator.fogEnabled = class120_sub7.getUByte() == 1;
						AbstractMouseWheelHandler.antiAliasingSamplesWrapper = class120_sub7.getUByte();
						if (AbstractMouseWheelHandler.antiAliasingSamplesWrapper > 2) {
							AbstractMouseWheelHandler.antiAliasingSamplesWrapper = 2;
						}
						Class36.antiAliasingSamples = AbstractMouseWheelHandler.antiAliasingSamplesWrapper;
						Class167.aBoolean1619 = class120_sub7.getUByte() == 1;
						Class111.anInt1061 = class120_sub7.getUByte();
						if (Class111.anInt1061 > 127) {
							Class111.anInt1061 = 127;
						}
						RuntimeException_Sub1.anInt2142 = class120_sub7.getUByte();
						CursorType.anInt1242 = class120_sub7.getUByte();
						if (CursorType.anInt1242 > 127) {
							CursorType.anInt1242 = 127;
						}
						if (i_1_ >= 1) {
							Class120_Sub12_Sub18.lastFullscreenWidth = class120_sub7.getUShort();
							Class120_Sub12_Sub12.lastFullscreenHeight = class120_sub7.getUShort();
						}
						if (i_1_ >= 3 && i_1_ < 6) {
							class120_sub7.getUByte();
						}
						if (i_1_ >= 4) {
							int i_3_ = class120_sub7.getUByte();
							if (Class120_Sub14_Sub13.maxMemory < 96) {
								i_3_ = 0;
							}
							ParticleEngine.setParticles(i_3_);
						}
						if (i_1_ >= 5) {
							Class120_Sub19.anInt2657 = class120_sub7.getInt();
						}
						if (i_1_ >= 6) {
							Class120_Sub12_Sub19.currentDisplayMode = class120_sub7.getUByte();
						}
						if (i_1_ >= 7) {
							InterfaceClickMask.safeModeEnabled = class120_sub7.getUByte() == 1;
						}
						if (i != 2245) {
							method1145(null, -85);
						}
						if (i_1_ >= 8) {
							Class134.aBoolean1277 = class120_sub7.getUByte() == 1;
						}
						if (i_1_ >= 9) {
							Class140.anInt1343 = class120_sub7.getUByte();
						}
						if (i_1_ >= 10) {
							Class186.hdrEnabled = class120_sub7.getUByte() != 0;
						}
						if (i_1_ >= 11) {
							Class38.cursorsEnabled = class120_sub7.getUByte() != 0;
						}
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("wa.NC(").append(class120_sub7 != null ? "{...}" : "null").append(',').append(i).append(')').toString());
		}
	}

	final void endBitAccess() {
		this.pos = (7 + bitOffset) / 8;
	}

	static final void method1147() {
		if (Class84.anIntArray800 == null || FileSystemWorker.anIntArray789 == null) {
			FileSystemWorker.anIntArray789 = new int[256];
			Class84.anIntArray800 = new int[256];
			for (int i_4_ = 0; i_4_ < 256; i_4_++) {
				final double d = i_4_ / 255.0 * 6.283185307179586;
				Class84.anIntArray800[i_4_] = (int) (Math.sin(d) * 4096.0);
				FileSystemWorker.anIntArray789[i_4_] = (int) (Math.cos(d) * 4096.0);
			}
		}
	}

	final int getUByteIsaac() {
		return 0xff & this.buf[this.pos++] - isaacCipher.method903();
	}

	final void getBytesIsaac(final byte[] buf, final int off, final int len) {
		for (int id = 0; id < len; id++) {
			buf[id + off] = (byte) (this.buf[this.pos++] - isaacCipher.method903());
		}
	}

	public static void method1150(final byte i) {
		try {
			anIntArray3120 = null;
			if (i < 59) {
				highWaterDetail = true;
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("wa.JC(").append(i).append(')').toString());
		}
	}

	final void putByteIsaac(final int i_8_) {
		this.buf[this.pos++] = (byte) (isaacCipher.method903() + i_8_);
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
