/* Class120_Sub14_Sub14 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class AbstractRequest extends NodeSub {
	boolean aBoolean3573;
	static Class180_Sub2[] aClass180_Sub2Array3574 = new Class180_Sub2[4];
	static String aString3575 = "purple:";
	volatile boolean aBoolean3576 = true;
	boolean aBoolean3577;
	static int[] playerOptionsIcon = new int[8];

	abstract byte[] getBuffer();

	public static void method1536(final boolean bool) {
		try {
			playerOptionsIcon = null;
			if (bool) {
				method1542(true);
			}
			aClass180_Sub2Array3574 = null;
			aString3575 = null;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("ng.O(").append(bool).append(')').toString());
		}
	}

	abstract int getCompletion();

	private static final int[] method1538(final int i, final CollisionMap[] class25s, final byte[] is, final int i_0_, final int i_1_, final int i_2_, final int i_3_, final int i_4_, final int i_5_, final boolean bool, final int i_6_) {
		int[] is_7_;
		try {
			final int i_8_ = 8 * (i_6_ & 0x7);
			final int i_9_ = (0x7 & i_1_) * 8;
			if (!bool) {
				for (int i_10_ = 0; i_10_ < 8; i_10_++) {
					for (int i_11_ = 0; i_11_ < 8; i_11_++) {
						final int i_12_ = Queue.method2253(i_11_ & 0x7, i_3_, i_10_ & 0x7) + i_0_;
						final int i_13_ = i_2_ + Deque.method897(i_3_, 0x7 & i_10_, 0x7 & i_11_);
						if (i_12_ > 0 && i_12_ < 103 && i_13_ > 0 && i_13_ < 103) {
							class25s[i_5_].collisionFlags[i_12_][i_13_] = Class120_Sub12_Sub3.method1207(class25s[i_5_].collisionFlags[i_12_][i_13_], -2097153);
						}
					}
				}
			}
			if (i_4_ < 3) {
				aClass180_Sub2Array3574 = null;
			}
			final Buffer class120_sub7 = new Buffer(is);
			int i_14_;
			if (bool) {
				i_14_ = 1;
			} else {
				i_14_ = 4;
			}
			final int i_15_ = i_1_ << 3 & ~0x3f;
			int i_16_ = 0;
			final int i_17_ = (~0x7 & i_6_) << 3;
			int i_18_ = 0;
			if (i_3_ == 1) {
				i_18_ = 1;
			} else if (i_3_ == 2) {
				i_16_ = 1;
				i_18_ = 1;
			} else if (i_3_ == 3) {
				i_16_ = 1;
			}
			for (int i_19_ = 0; i_19_ < i_14_; i_19_++) {
				for (int i_20_ = 0; i_20_ < 64; i_20_++) {
					for (int i_21_ = 0; i_21_ < 64; i_21_++) {
						if (i_19_ == i && i_20_ >= i_9_ && 8 + i_9_ >= i_20_ && i_21_ >= i_8_ && i_21_ <= i_8_ + 8) {
							if (i_9_ - -8 != i_20_ && 8 + i_8_ != i_21_) {
								final int i_22_ = Queue.method2253(0x7 & i_21_, i_3_, i_20_ & 0x7) + i_0_;
								final int i_23_ = Deque.method897(i_3_, i_20_ & 0x7, 0x7 & i_21_) + i_2_;
								Class10.method119(class120_sub7, false, bool, i_5_, i_15_ + i_20_, i_21_ + i_17_, i_23_, i_3_, i_18_, i_16_, i_22_);
								if (i_20_ == 63 || i_21_ == 63) {
									final int i_24_ = i_20_ != 63 ? i_20_ : 64;
									final int i_25_ = i_21_ == 63 ? 64 : i_21_;
									int i_26_;
									int i_27_;
									if (i_3_ == 0) {
										i_27_ = i_2_ + i_25_ + -i_8_;
										i_26_ = i_0_ - (-i_24_ + i_9_);
									} else if (i_3_ != 1) {
										if (i_3_ == 2) {
											i_26_ = i_0_ - (-8 - (i_9_ + -i_24_));
											i_27_ = 8 + i_2_ + i_8_ + -i_25_;
										} else {
											i_27_ = i_2_ + i_24_ - i_9_;
											i_26_ = 8 + i_0_ + i_8_ + -i_25_;
										}
									} else {
										i_26_ = i_25_ + -i_8_ + i_0_;
										i_27_ = i_2_ - (-8 + i_24_) + i_9_;
									}
									if (i_26_ >= 0 && i_26_ < 104 && i_27_ >= 0 && i_27_ < 104) {
										OverridedJInterface.tileHeightMap[i_5_][i_26_][i_27_] = OverridedJInterface.tileHeightMap[i_5_][i_22_ + i_16_][i_23_ + i_18_];
									}
								}
							} else {
								int i_28_;
								int i_29_;
								if (i_3_ == 0) {
									i_28_ = i_20_ - (i_9_ - i_0_);
									i_29_ = i_2_ + i_21_ + -i_8_;
								} else if (i_3_ != 1) {
									if (i_3_ == 2) {
										i_28_ = 8 + i_0_ - (i_20_ + -i_9_);
										i_29_ = i_2_ - (-8 + -i_8_ + i_21_);
									} else {
										i_28_ = i_8_ + -i_21_ + i_0_ + 8;
										i_29_ = i_2_ - (i_9_ + -i_20_);
									}
								} else {
									i_29_ = i_9_ + -i_20_ + i_2_ - -8;
									i_28_ = i_0_ - (-i_21_ + i_8_);
								}
								Class10.method119(class120_sub7, true, bool, i_5_, i_15_ - -i_20_, i_17_ + i_21_, i_29_, 0, 0, 0, i_28_);
							}
						} else {
							Class10.method119(class120_sub7, false, bool, 0, 0, 0, -1, 0, 0, 0, -1);
						}
					}
				}
			}
			boolean bool_30_ = false;
			while (class120_sub7.buf.length > class120_sub7.pos) {
				final int i_32_ = class120_sub7.getUByte();
				if (i_32_ == 128) {
					bool_30_ = true;
					CanvasWrapper.anIntArray21[0] = class120_sub7.getUShort();
					CanvasWrapper.anIntArray21[1] = class120_sub7.getShort();
					CanvasWrapper.anIntArray21[2] = class120_sub7.getShort();
					CanvasWrapper.anIntArray21[3] = class120_sub7.getShort();
					CanvasWrapper.anIntArray21[4] = class120_sub7.getUShort();
				} else if (i_32_ == 129) {
					for (int i_33_ = 0; i_33_ < 4; i_33_++) {
						final byte i_34_ = class120_sub7.getByte();
						if (i_34_ == 0) {
							if (i_33_ <= i) {
								int i_35_ = i_0_ - -7;
								int i_36_ = i_0_;
								if (i_36_ >= 0) {
									if (i_36_ >= 104) {
										i_36_ = 104;
									}
								} else {
									i_36_ = 0;
								}
								int i_37_ = i_2_;
								if (i_37_ >= 0) {
									if (i_37_ >= 104) {
										i_37_ = 104;
									}
								} else {
									i_37_ = 0;
								}
								int i_38_ = i_2_ - -7;
								if (i_38_ < 0) {
									i_38_ = 0;
								} else if (i_38_ >= 104) {
									i_38_ = 104;
								}
								if (i_35_ < 0) {
									i_35_ = 0;
								} else if (i_35_ >= 104) {
									i_35_ = 104;
								}
								for (/**/; i_35_ > i_36_; i_36_++) {
									for (/**/; i_37_ < i_38_; i_37_++) {
										Class114.aByteArrayArrayArray1094[i_5_][i_36_][i_37_] = (byte) 0;
									}
								}
							}
						} else if (i_34_ == 1) {
							for (int i_39_ = 0; i_39_ < 64; i_39_ += 4) {
								for (int i_40_ = 0; i_40_ < 64; i_40_ += 4) {
									final byte i_41_ = class120_sub7.getByte();
									if (i_33_ <= i) {
										for (int i_42_ = i_39_; i_42_ < 4 + i_39_; i_42_++) {
											for (int i_43_ = i_40_; i_43_ < 4 + i_40_; i_43_++) {
												if (i_42_ >= i_9_ && 8 + i_9_ > i_42_ && i_8_ <= i_43_ && i_8_ < 8 + i_8_) {
													final int i_44_ = i_0_ + Queue.method2253(i_43_ & 0x7, i_3_, i_42_ & 0x7);
													final int i_45_ = Deque.method897(i_3_, 0x7 & i_42_, 0x7 & i_43_) + i_2_;
													if (i_44_ >= 0 && i_44_ < 104 && i_45_ >= 0 && i_45_ < 104) {
														Class114.aByteArrayArrayArray1094[i_5_][i_44_][i_45_] = i_41_;
													}
												}
											}
										}
									}
								}
							}
						} else if (i_34_ == 2) {
							continue;
						}
					}
				} else {
					class120_sub7.pos--;
					break;
				}
			}
			if (HDToolkit.glEnabled && !bool) {
				Class191 class191 = null;
				while (class120_sub7.buf.length > class120_sub7.pos) {
					final int i_46_ = class120_sub7.getUByte();
					if (i_46_ == 0) {
						class191 = new Class191(class120_sub7);
					} else if (i_46_ != 1) {
						if (i_46_ == 2) {
							if (class191 == null) {
								class191 = new Class191();
							}
							class191.method2510(class120_sub7, -27409);
						} else {
							throw new IllegalStateException();
						}
					} else {
						final int i_47_ = class120_sub7.getUByte();
						if (i_47_ > 0) {
							for (int i_48_ = 0; i_47_ > i_48_; i_48_++) {
								final Light light = new Light(class120_sub7);
								if (light.anInt376 == 31) {
									final Class181 class181 = Class120_Sub12_Sub3.method1208(class120_sub7.getUShort(), (byte) -107);
									light.method347(class181.anInt1789, class181.anInt1786, class181.anInt1788, class181.anInt1787);
								}
								int i_49_ = light.x >> 7;
								int i_50_ = light.z >> 7;
								if (light.anInt384 == i && i_49_ >= i_9_ && 8 + i_9_ > i_49_ && i_8_ <= i_50_ && 8 + i_8_ > i_50_) {
									final int i_51_ = (i_0_ << 7) - -StructType.method1566(0x3ff & light.x, i_3_, 0x3ff & light.z, (byte) 24);
									final int i_52_ = (i_2_ << 7) + Class92.method766(light.z & 0x3ff, 3, 0x3ff & light.x, i_3_);
									light.x = i_51_;
									light.z = i_52_;
									i_50_ = light.z >> 7;
									i_49_ = light.x >> 7;
									if (i_49_ >= 0 && i_50_ >= 0 && i_49_ < 104 && i_50_ < 104) {
										light.aBoolean385 = (0x2 & Class114.tileSettings[1][i_49_][i_50_]) != 0;
										light.y = -light.y + OverridedJInterface.tileHeightMap[light.anInt384][i_49_][i_50_];
										LightManager.addLight(light);
									}
								}
							}
						}
					}
				}
				if (class191 == null) {
					class191 = new Class191();
				}
				IdentityKit.aClass191ArrayArray1337[i_0_ >> 3][i_2_ >> 3] = class191;
			}
			final int i_53_ = i_2_ - -7;
			final int i_54_ = 7 + i_0_;
			for (int i_55_ = i_0_; i_55_ < i_54_; i_55_++) {
				for (int i_56_ = i_2_; i_56_ < i_53_; i_56_++) {
					Class114.aByteArrayArrayArray1094[i_5_][i_55_][i_56_] = (byte) 0;
				}
			}
			is_7_ = !bool_30_ ? null : CanvasWrapper.anIntArray21;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("ng.J(").append(i).append(',').append(class25s != null ? "{...}" : "null").append(',').append(is != null ? "{...}" : "null").append(',').append(i_0_).append(',').append(i_1_).append(',').append(i_2_).append(',')
					.append(i_3_).append(',').append(i_4_).append(',').append(i_5_).append(',').append(bool).append(',').append(i_6_).append(')').toString());
		}
		return is_7_;
	}

	static final int method1539(final int i_57_, int i_58_, int i_59_, int i_60_, final int i_61_, final int i_62_) {
		if ((i_62_ & 0x1) == 1) {
			final int i_64_ = i_59_;
			i_59_ = i_58_;
			i_58_ = i_64_;
		}
		i_60_ &= 0x3;
		if (i_60_ == 0) {
			return i_61_;
		}
		if (i_60_ == 1) {
			return 1 + -i_59_ + 7 + -i_57_;
		}
		if (i_60_ == 2) {
			return 7 + -i_61_ - -1 - i_58_;
		}
		return i_57_;
	}

	static final void method1540(final String string, final int i, final String string_65_) {
		Class120_Sub16.method1660(string, -1, null, i, string_65_);
	}

	static final LDIndexedSprite[] constructLDIndexedSprites() {
		final LDIndexedSprite[] indexedSprites = new LDIndexedSprite[Class93.spriteAmount];
		for (int id = 0; id < Class93.spriteAmount; id++) {
			indexedSprites[id] = new LDIndexedSprite(Class31.spriteTrimWidth, SceneGroundObject.spriteTrimHeight, Projectile.spriteXOffsets[id], GroundTile.spriteYOffsets[id], Class120_Sub12_Sub11.spriteWidths[id], Class120_Sub12_Sub39.spriteHeights[id], Class145.spritePaletteIndicators[id], Class132_Sub1.spritePalette);
		}
		Class53_Sub1.resetSpriteInfo();
		return indexedSprites;
	}

	static final void method1542(final boolean bool) {
		int[] is = null;
		int i;
		byte[][] is_69_;
		if (HDToolkit.glEnabled && bool) {
			i = 1;
			is_69_ = Class120_Sub12_Sub36.aByteArrayArray3421;
		} else {
			i = 4;
			is_69_ = RuntimeException_Sub1.aByteArrayArray2140;
		}
		for (int i_70_ = 0; i_70_ < i; i_70_++) {
			Class120_Sub2.method1050();
			for (int i_71_ = 0; i_71_ < 13; i_71_++) {
				for (int i_72_ = 0; i_72_ < 13; i_72_++) {
					boolean bool_73_ = false;
					final int i_74_ = Class120_Sub12_Sub36.anIntArrayArrayArray3420[i_70_][i_71_][i_72_];
					if ((i_74_ ^ 0xffffffff) != 0) {
						final int i_75_ = i_74_ >> 24 & 0x3;
						if (!bool || i_75_ == 0) {
							final int i_76_ = (0x6 & i_74_) >> 1;
							final int i_77_ = (0xffdef6 & i_74_) >> 14;
							final int i_78_ = (0x3fff & i_74_) >> 3;
							final int i_79_ = i_78_ / 8 + (i_77_ / 8 << 8);
							for (int i_80_ = 0; Class120_Sub12_Sub36.anIntArray3417.length > i_80_; i_80_++) {
								if (Class120_Sub12_Sub36.anIntArray3417[i_80_] == i_79_ && is_69_[i_80_] != null) {
									bool_73_ = true;
									final int[] is_81_ = method1538(i_75_, Class182.collisionMaps, is_69_[i_80_], i_71_ * 8, i_77_, 8 * i_72_, i_76_, 24, i_70_, bool, i_78_);
									if (is == null && is_81_ != null) {
										is = is_81_;
									}
									break;
								}
							}
						}
					}
					if (!bool_73_) {
						Class120_Sub14_Sub15.method1556(i_71_ * 8, i_70_, 8, i_72_ * 8, 8);
					}
				}
			}
		}
		if (is != null) {
			PlainTile.anInt1356 = is[3];
			ModelParticle.anInt1475 = is[0];
			Class143_Sub1.anInt2197 = is[2];
			Class132.anInt1257 = is[4];
			Class120_Sub12.anInt2560 = is[1];
		} else {
			ModelParticle.anInt1475 = -1;
		}
	}

	public AbstractRequest() {
		/* empty */
	}
}
