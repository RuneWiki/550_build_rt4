/* Class120_Sub14_Sub11 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class ParamType extends NodeSub {
	static int anInt3538;
	String defaultString;
	static JagexInterface aClass189_3540;
	int defaultInt;
	private char identifier;
	static js5 configClient;
	static NodeCache recentUse;
	static int anInt3544 = 100;
	static boolean aBoolean3545;

	static {
		aBoolean3545 = false;
	}

	final void decode(final Buffer buffer) {
		for (;;) {
			final int configCode = buffer.getUByte();
			if (configCode == 0) {
				break;
			}
			decode(buffer, configCode);
		}
	}

	public static void method1513(final int i) {
		try {
			if (i == -1) {
				aClass189_3540 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("jc.A(").append(i).append(')').toString());
		}
	}

	static final void method1514(final int i_1_) {
		final InterfaceChangeNode class120_sub14_sub7 = AbstractObject.putInterfaceChange(8, i_1_);
		class120_sub14_sub7.method1453();
	}

	final boolean isString() {
		return identifier == 's';
	}

	static final boolean method1516(final char c, final boolean bool) {
		boolean bool_2_;
		try {
			if (!bool) {
				method1516('G', true);
			}
			bool_2_ = c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z';
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("jc.H(").append(c).append(',').append(bool).append(')').toString());
		}
		return bool_2_;
	}

	static final int method1517(final byte i) {
		int i_3_;
		try {
			if (Class79.aFloat698 == 3.0) {
				return 37;
			}
			if (i > -118) {
				constructSprites();
			}
			if (4.0 == Class79.aFloat698) {
				return 50;
			}
			if (6.0 == Class79.aFloat698) {
				return 75;
			}
			if (8.0 == Class79.aFloat698) {
				return 100;
			}
			i_3_ = 200;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("jc.B(").append(i).append(')').toString());
		}
		return i_3_;
	}

	static final void method1518(final int i, final int i_4_, final int i_5_, final int i_6_, final int i_7_, final int i_8_, final int i_9_, final int i_10_, final int i_11_, final int i_12_, final int i_13_, final boolean bool) {
		try {
			for (int i_14_ = 0; i_14_ < 104; i_14_++) {
				for (int i_15_ = 0; i_15_ < 104; i_15_++) {
					Class179.anIntArrayArray1774[i_14_][i_15_] = 0;
					Class120_Sub2.anIntArrayArray2416[i_14_][i_15_] = 99999999;
				}
			}
			if (i_8_ == 26109) {
				Class179.anIntArrayArray1774[i_5_][i_7_] = 99;
				Class120_Sub2.anIntArrayArray2416[i_5_][i_7_] = 0;
				int i_16_ = i_5_;
				int i_17_ = i_7_;
				int i_18_ = 0;
				Class150.anIntArray1412[i_18_] = i_5_;
				Class120_Sub12.anIntArray2565[i_18_++] = i_7_;
				int i_19_ = 0;
				boolean bool_20_ = false;
				final int[][] is = Class182.collisionMaps[Class173.gameLevel].anIntArrayArray152;
				while_92_: while (i_19_ != i_18_) {
					i_17_ = Class120_Sub12.anIntArray2565[i_19_];
					i_16_ = Class150.anIntArray1412[i_19_];
					i_19_ = 0xfff & 1 + i_19_;
					if (i_16_ == i_4_ && i_17_ == i_10_) {
						bool_20_ = true;
						break;
					}
					if (i != 0) {
						if (i >= 5 && i != 10 || !Class182.collisionMaps[Class173.gameLevel].method220(i_10_, i_13_, i_17_, i_16_, (byte) -43, i_4_, i_12_, -1 + i)) {
							if (i < 10 && Class182.collisionMaps[Class173.gameLevel].method223(i_4_, i_16_, i_10_, i_8_ ^ 0x61fd, i_17_, -1 + i, i_13_, i_12_)) {
								bool_20_ = true;
								break;
							}
						} else {
							bool_20_ = true;
							break;
						}
					}
					if (i_6_ != 0 && i_9_ != 0 && Class182.collisionMaps[Class173.gameLevel].method216(i_17_, i_8_ ^ ~0x65fd, i_11_, i_12_, i_10_, i_4_, i_9_, i_6_, i_16_)) {
						bool_20_ = true;
						break;
					}
					final int i_21_ = 1 + Class120_Sub2.anIntArrayArray2416[i_16_][i_17_];
					while_85_: do {
						if (i_16_ > 0 && Class179.anIntArrayArray1774[-1 + i_16_][i_17_] == 0 && (0x2c010e & is[-1 + i_16_][i_17_]) == 0 && (0x2c0138 & is[-1 + i_16_][-1 + i_12_ + i_17_]) == 0) {
							for (int i_22_ = 1; -1 + i_12_ > i_22_; i_22_++) {
								if ((is[i_16_ + -1][i_22_ + i_17_] & 0x2c013e) != 0) {
									break while_85_;
								}
							}
							Class150.anIntArray1412[i_18_] = i_16_ + -1;
							Class120_Sub12.anIntArray2565[i_18_] = i_17_;
							Class179.anIntArrayArray1774[-1 + i_16_][i_17_] = 2;
							Class120_Sub2.anIntArrayArray2416[-1 + i_16_][i_17_] = i_21_;
							i_18_ = 0xfff & 1 + i_18_;
						}
					} while (false);
					while_86_: do {
						if (i_16_ < 102 && Class179.anIntArrayArray1774[i_16_ - -1][i_17_] == 0 && (0x2c0183 & is[i_16_ + i_12_][i_17_]) == 0 && (is[i_16_ - -i_12_][i_17_ - (-i_12_ - -1)] & 0x2c01e0) == 0) {
							for (int i_23_ = 1; -1 + i_12_ > i_23_; i_23_++) {
								if ((is[i_12_ + i_16_][i_17_ - -i_23_] & 0x2c01e3) != 0) {
									break while_86_;
								}
							}
							Class150.anIntArray1412[i_18_] = 1 + i_16_;
							Class120_Sub12.anIntArray2565[i_18_] = i_17_;
							i_18_ = i_18_ + 1 & 0xfff;
							Class179.anIntArrayArray1774[i_16_ + 1][i_17_] = 8;
							Class120_Sub2.anIntArrayArray2416[i_16_ + 1][i_17_] = i_21_;
						}
					} while (false);
					while_87_: do {
						if (i_17_ > 0 && Class179.anIntArrayArray1774[i_16_][i_17_ - 1] == 0 && (is[i_16_][i_17_ - 1] & 0x2c010e) == 0 && (0x2c0183 & is[i_12_ + i_16_ + -1][i_17_ - 1]) == 0) {
							for (int i_24_ = 1; i_24_ < i_12_ - 1; i_24_++) {
								if ((0x2c018f & is[i_24_ + i_16_][i_17_ + -1]) != 0) {
									break while_87_;
								}
							}
							Class150.anIntArray1412[i_18_] = i_16_;
							Class120_Sub12.anIntArray2565[i_18_] = i_17_ - 1;
							Class179.anIntArrayArray1774[i_16_][i_17_ + -1] = 1;
							i_18_ = 0xfff & 1 + i_18_;
							Class120_Sub2.anIntArrayArray2416[i_16_][-1 + i_17_] = i_21_;
						}
					} while (false);
					while_88_: do {
						if (i_17_ < 102 && Class179.anIntArrayArray1774[i_16_][i_17_ + 1] == 0 && (is[i_16_][i_17_ - -i_12_] & 0x2c0138) == 0 && (0x2c01e0 & is[-1 + i_16_ - -i_12_][i_12_ + i_17_]) == 0) {
							for (int i_25_ = 1; i_25_ < -1 + i_12_; i_25_++) {
								if ((0x2c01f8 & is[i_16_ - -i_25_][i_12_ + i_17_]) != 0) {
									break while_88_;
								}
							}
							Class150.anIntArray1412[i_18_] = i_16_;
							Class120_Sub12.anIntArray2565[i_18_] = 1 + i_17_;
							Class179.anIntArrayArray1774[i_16_][i_17_ - -1] = 4;
							Class120_Sub2.anIntArrayArray2416[i_16_][1 + i_17_] = i_21_;
							i_18_ = 1 + i_18_ & 0xfff;
						}
					} while (false);
					while_89_: do {
						if (i_16_ > 0 && i_17_ > 0 && Class179.anIntArrayArray1774[i_16_ - 1][i_17_ - 1] == 0 && (0x2c010e & is[-1 + i_16_][i_17_ + -1]) == 0) {
							for (int i_26_ = 1; i_12_ > i_26_; i_26_++) {
								if ((0x2c013e & is[i_16_ + -1][-1 + i_17_ + i_26_]) != 0 || (0x2c018f & is[i_26_ + -1 + i_16_][i_17_ - 1]) != 0) {
									break while_89_;
								}
							}
							Class150.anIntArray1412[i_18_] = -1 + i_16_;
							Class120_Sub12.anIntArray2565[i_18_] = -1 + i_17_;
							Class179.anIntArrayArray1774[-1 + i_16_][i_17_ + -1] = 3;
							i_18_ = 1 + i_18_ & 0xfff;
							Class120_Sub2.anIntArrayArray2416[-1 + i_16_][i_17_ - 1] = i_21_;
						}
					} while (false);
					while_90_: do {
						if (i_16_ < 102 && i_17_ > 0 && Class179.anIntArrayArray1774[1 + i_16_][i_17_ + -1] == 0 && (is[i_16_ - -i_12_][i_17_ - 1] & 0x2c0183) == 0) {
							for (int i_27_ = 1; i_12_ > i_27_; i_27_++) {
								if ((0x2c01e3 & is[i_16_ + i_12_][i_17_ + -1 - -i_27_]) != 0 || (0x2c018f & is[i_27_ + i_16_][-1 + i_17_]) != 0) {
									break while_90_;
								}
							}
							Class150.anIntArray1412[i_18_] = i_16_ - -1;
							Class120_Sub12.anIntArray2565[i_18_] = -1 + i_17_;
							i_18_ = 1 + i_18_ & 0xfff;
							Class179.anIntArrayArray1774[i_16_ - -1][i_17_ + -1] = 9;
							Class120_Sub2.anIntArrayArray2416[1 + i_16_][i_17_ - 1] = i_21_;
						}
					} while (false);
					while_91_: do {
						if (i_16_ > 0 && i_17_ < 102 && Class179.anIntArrayArray1774[i_16_ + -1][1 + i_17_] == 0 && (0x2c0138 & is[i_16_ - 1][i_12_ + i_17_]) == 0) {
							for (int i_28_ = 1; i_12_ > i_28_; i_28_++) {
								if ((is[i_16_ - 1][i_17_ + i_28_] & 0x2c013e) != 0 || (is[-1 + i_16_ + i_28_][i_17_ - -i_12_] & 0x2c01f8) != 0) {
									break while_91_;
								}
							}
							Class150.anIntArray1412[i_18_] = -1 + i_16_;
							Class120_Sub12.anIntArray2565[i_18_] = 1 + i_17_;
							Class179.anIntArrayArray1774[i_16_ + -1][1 + i_17_] = 6;
							i_18_ = 1 + i_18_ & 0xfff;
							Class120_Sub2.anIntArrayArray2416[-1 + i_16_][1 + i_17_] = i_21_;
						}
					} while (false);
					if (i_16_ < 102 && i_17_ < 102 && Class179.anIntArrayArray1774[i_16_ + 1][1 + i_17_] == 0 && (0x2c01e0 & is[i_12_ + i_16_][i_12_ + i_17_]) == 0) {
						for (int i_29_ = 1; i_29_ < i_12_; i_29_++) {
							if ((0x2c01f8 & is[i_16_ - -i_29_][i_12_ + i_17_]) != 0 || (is[i_16_ + i_12_][i_17_ + i_29_] & 0x2c01e3) != 0) {
								continue while_92_;
							}
						}
						Class150.anIntArray1412[i_18_] = i_16_ - -1;
						Class120_Sub12.anIntArray2565[i_18_] = 1 + i_17_;
						Class179.anIntArrayArray1774[i_16_ - -1][1 + i_17_] = 12;
						i_18_ = 0xfff & i_18_ - -1;
						Class120_Sub2.anIntArrayArray2416[1 + i_16_][1 + i_17_] = i_21_;
					}
				}
				if (!bool_20_) {
					if (!bool) {
						return;
					}
					int i_30_ = 1000;
					int i_31_ = 100;
					for (int i_33_ = -10 + i_4_; 10 + i_4_ >= i_33_; i_33_++) {
						for (int i_34_ = -10 + i_10_; i_34_ <= i_10_ + 10; i_34_++) {
							if (i_33_ >= 0 && i_34_ >= 0 && i_33_ < 104 && i_34_ < 104 && Class120_Sub2.anIntArrayArray2416[i_33_][i_34_] < 100) {
								int i_35_ = 0;
								if (i_4_ > i_33_) {
									i_35_ = i_4_ + -i_33_;
								} else if (-1 + i_6_ + i_4_ < i_33_) {
									i_35_ = 1 - i_4_ - (i_6_ - i_33_);
								}
								int i_36_ = 0;
								if (i_34_ >= i_10_) {
									if (i_34_ > i_10_ - -i_9_ - 1) {
										i_36_ = 1 - i_10_ + -i_9_ + i_34_;
									}
								} else {
									i_36_ = i_10_ + -i_34_;
								}
								final int i_37_ = i_35_ * i_35_ + i_36_ * i_36_;
								if (i_37_ < i_30_ || i_37_ == i_30_ && i_31_ > Class120_Sub2.anIntArrayArray2416[i_33_][i_34_]) {
									i_16_ = i_33_;
									i_30_ = i_37_;
									i_17_ = i_34_;
									i_31_ = Class120_Sub2.anIntArrayArray2416[i_33_][i_34_];
								}
							}
						}
					}
					if (i_30_ == 1000 || i_5_ == i_16_ && i_7_ == i_17_) {
						return;
					}
				}
				SceneGroundObject.packetSetFlagPosition = false;
				Class65.flagY = i_17_;
				Class120_Sub12_Sub26.flagX = i_16_;
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception,
					new StringBuilder("jc.K(").append(i).append(',').append(i_4_).append(',').append(i_5_).append(',').append(i_6_).append(',').append(i_7_).append(',').append(i_8_).append(',').append(i_9_).append(',').append(i_10_).append(',').append(i_11_).append(',').append(i_12_).append(',')
							.append(i_13_).append(',').append(bool).append(')').toString());
		}
	}

	public ParamType() {
		/* empty */
	}

	private final void decode(final Buffer buffer, final int configCode) {
		if (configCode == 1) {
			identifier = Class120_Sub12_Sub24.method1328(buffer.getByte());
		} else if (configCode == 2) {
			this.defaultInt = buffer.getInt();
		} else if (configCode == 5) {
			this.defaultString = buffer.getJString();
		}
	}

	static final ParamType list(final int i) {
		ParamType param = (ParamType) recentUse.get(i);
		if (param != null) {
			return param;
		}
		final byte[] is = configClient.getFile(11, i);
		param = new ParamType();
		if (is != null) {
			param.decode(new Buffer(is));
		}
		recentUse.put(param, i);
		return param;
	}

	static final AbstractSprite[] constructSprites() {
		final AbstractSprite[] abstractSprites = new AbstractSprite[Class93.spriteAmount];
		for (int i_39_ = 0; i_39_ < Class93.spriteAmount; i_39_++) {
			final byte[] paletteIndicators = Class145.spritePaletteIndicators[i_39_];
			final int pixelAmt = Class120_Sub12_Sub11.spriteWidths[i_39_] * Class120_Sub12_Sub39.spriteHeights[i_39_];
			final int[] pixels = new int[pixelAmt];
			for (int i_42_ = 0; i_42_ < pixelAmt; i_42_++) {
				pixels[i_42_] = Class132_Sub1.spritePalette[Class120_Sub12_Sub3.method1207(255, paletteIndicators[i_42_])];
			}
			if (!HDToolkit.glEnabled) {
				abstractSprites[i_39_] = new LDSprite(Class31.spriteTrimWidth, SceneGroundObject.spriteTrimHeight, Projectile.spriteXOffsets[i_39_], GroundTile.spriteYOffsets[i_39_], Class120_Sub12_Sub11.spriteWidths[i_39_], Class120_Sub12_Sub39.spriteHeights[i_39_], pixels);
			} else {
				abstractSprites[i_39_] = new HDSprite(Class31.spriteTrimWidth, SceneGroundObject.spriteTrimHeight, Projectile.spriteXOffsets[i_39_], GroundTile.spriteYOffsets[i_39_], Class120_Sub12_Sub11.spriteWidths[i_39_], Class120_Sub12_Sub39.spriteHeights[i_39_], pixels);
			}
		}
		Class53_Sub1.resetSpriteInfo();
		return abstractSprites;
	}

	static final void sendDisplayInfo() {
		Class120_Sub12_Sub11.outputStream.putByteIsaac(86);
		Class120_Sub12_Sub11.outputStream.putByte(Class120_Sub12_Sub4.getDisplayMode());
		Class120_Sub12_Sub11.outputStream.putShort(Class69_Sub1.canvasWidth);
		Class120_Sub12_Sub11.outputStream.putShort(Class120_Sub12_Sub5.canvasHeight);
		Class120_Sub12_Sub11.outputStream.putByte(Class36.antiAliasingSamples);
	}
}
