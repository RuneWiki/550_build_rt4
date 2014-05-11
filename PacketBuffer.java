/* Class120_Sub7_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class PacketBuffer extends Buffer {
	private IsaacCipher aClass106_3119;
	static int[] anIntArray3120;
	private int anInt3121;
	static int anInt3122;
	static boolean highWaterDetail = true;

	PacketBuffer(final int i) {
		super(i);
	}

	final void method1141(final int[] is, final int i) {
		try {
			if (i == -1) {
				aClass106_3119 = new IsaacCipher(is);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("wa.FC(").append(is != null ? "{...}" : "null").append(',').append(i).append(')').toString());
		}
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
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("wa.KC(").append(i).append(',').append(i_0_).append(')').toString());
		}
	}

	final void method1144(final int i) {
		try {
			if (i != -2) {
				putPacket(-35);
			}
			anInt3121 = 8 * this.pos;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("wa.PC(").append(i).append(')').toString());
		}
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
						Class120_Sub14_Sub14_Sub1.brightness = class120_sub7.getUByte();
						if (Class120_Sub14_Sub14_Sub1.brightness < 1) {
							Class120_Sub14_Sub14_Sub1.brightness = 1;
						} else if (Class120_Sub14_Sub14_Sub1.brightness > 4) {
							Class120_Sub14_Sub14_Sub1.brightness = 4;
						}
						GameShell.method32(class120_sub7.getUByte() == 1);
						Class120_Sub12.aBoolean2564 = class120_sub7.getUByte() == 1;
						Class75.showGroundDecorations = class120_sub7.getUByte() == 1;
						Class108_Sub3.highDetailTextures = class120_sub7.getUByte() == 1;
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
						Class172.fogEnabled = class120_sub7.getUByte() == 1;
						AbstractMouseWheelHandler.anInt117 = class120_sub7.getUByte();
						if (AbstractMouseWheelHandler.anInt117 > 2) {
							AbstractMouseWheelHandler.anInt117 = 2;
						}
						Class36.antiAliasingSamples = AbstractMouseWheelHandler.anInt117;
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
							ParticleEngine.method952(i_3_);
						}
						if (i_1_ >= 5) {
							Class120_Sub19.anInt2657 = class120_sub7.getInt();
						}
						if (i_1_ >= 6) {
							Class120_Sub12_Sub19.anInt3282 = class120_sub7.getUByte();
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
							Class186.aBoolean1902 = class120_sub7.getUByte() != 0;
						}
						if (i_1_ >= 11) {
							Class38.cursorsEnabled = class120_sub7.getUByte() != 0;
						}
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("wa.NC(").append(class120_sub7 != null ? "{...}" : "null").append(',').append(i).append(')').toString());
		}
	}

	final void method1146() {
		this.pos = (7 + anInt3121) / 8;
	}

	static final void method1147(final byte i) {
		try {
			if (Class84.anIntArray800 == null || Class83.anIntArray789 == null) {
				Class83.anIntArray789 = new int[256];
				Class84.anIntArray800 = new int[256];
				for (int i_4_ = 0; i_4_ < 256; i_4_++) {
					final double d = i_4_ / 255.0 * 6.283185307179586;
					Class84.anIntArray800[i_4_] = (int) (Math.sin(d) * 4096.0);
					Class83.anIntArray789[i_4_] = (int) (4096.0 * Math.cos(d));
				}
			}
			if (i != -29) {
				highWaterDetail = false;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("wa.EC(").append(i).append(')').toString());
		}
	}

	final int method1148(final boolean bool) {
		int i;
		try {
			if (bool) {
				return -109;
			}
			i = 0xff & this.buf[this.pos++] - aClass106_3119.method903();
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("wa.MC(").append(bool).append(')').toString());
		}
		return i;
	}

	final void method1149(final int i, final byte[] is, final int i_5_, final int i_6_) {
		try {
			int i_7_ = 0;
			if (i != 1) {
				method1151(-123);
			}
			for (/**/; i_7_ < i_5_; i_7_++) {
				is[i_7_ - -i_6_] = (byte) (this.buf[this.pos++] + -aClass106_3119.method903());
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("wa.IC(").append(i).append(',').append(is != null ? "{...}" : "null").append(',').append(i_5_).append(',').append(i_6_).append(')').toString());
		}
	}

	public static void method1150(final byte i) {
		try {
			anIntArray3120 = null;
			if (i < 59) {
				highWaterDetail = true;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("wa.JC(").append(i).append(')').toString());
		}
	}

	static final void method1151(final int i) {
		try {
			if (i == 32) {
				Class120_Sub12_Sub9.aClass21_3196.method186((byte) 86);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("wa.CC(").append(i).append(')').toString());
		}
	}

	final void putPacket(final int i_8_) {
		this.buf[this.pos++] = (byte) (aClass106_3119.method903() + i_8_);
	}

	final int method1153(final int i, final int i_9_) {
		int i_10_;
		try {
			if (i_9_ != 8) {
				return 112;
			}
			i_10_ = 8 * i - anInt3121;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("wa.DC(").append(i).append(',').append(i_9_).append(')').toString());
		}
		return i_10_;
	}

	final int getBitValue(int i) {
		int i_13_ = 8 + -(anInt3121 & 7);
		int i_14_ = anInt3121 >> 3;
		anInt3121 += i;
		int i_15_ = 0;
		for (/**/; i > i_13_; i_13_ = 8) {
			i_15_ += (this.buf[i_14_++] & Class120_Sub14_Sub21.anIntArray3631[i_13_]) << -i_13_ + i;
			i -= i_13_;
		}
		if (i_13_ != i) {
			i_15_ += this.buf[i_14_] >> -i + i_13_ & Class120_Sub14_Sub21.anIntArray3631[i];
		} else {
			i_15_ += Class120_Sub14_Sub21.anIntArray3631[i_13_] & this.buf[i_14_];
		}
		return i_15_;
	}
}
