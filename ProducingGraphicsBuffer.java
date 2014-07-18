/* Class122_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Shape;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;

final class ProducingGraphicsBuffer extends AbstractGraphicsBuffer implements ImageProducer, ImageObserver {
	static int[] anIntArray2796;
	private ColorModel colorModel;
	static int anInt2798;
	static int anInt2799 = 0;
	private ImageConsumer imageConsumer;
	static int[] intStack = new int[1000];

	@Override
	public final synchronized void addConsumer(final ImageConsumer imageconsumer) {
		imageConsumer = imageconsumer;
		imageconsumer.setDimensions(this.width, this.height);
		imageconsumer.setProperties(null);
		imageconsumer.setColorModel(colorModel);
		imageconsumer.setHints(14);
	}

	@Override
	public final void requestTopDownLeftRightResend(final ImageConsumer imageconsumer) {
		/* empty */
	}

	@Override
	final void drawClippedImage(final Graphics graphics, final int height, final int width, final int y, final int x) {
		setPixels(x, y, width, height);
		final Shape shape = graphics.getClip();
		graphics.clipRect(x, y, width, height);
		graphics.drawImage(this.image, 0, 0, this);
		graphics.setClip(shape);
	}

	private final synchronized void setPixels() {
		if (imageConsumer != null) {
			imageConsumer.setPixels(0, 0, this.width, this.height, colorModel, this.pixels, 0, this.width);
			imageConsumer.imageComplete(2);
		}
	}

	static final void method1850(final int i, final GameEntity class180_sub5) {
		try {
			if (class180_sub5.anInt3010 != 0) {
				final Class29 class29 = class180_sub5.method2336();
				if ((class180_sub5.anInt2981 ^ 0xffffffff) != 0 && 32768 > class180_sub5.anInt2981) {
					final Npc class180_sub5_sub2 = Class120_Sub12_Sub11.npcList[class180_sub5.anInt2981];
					if (class180_sub5_sub2 != null) {
						final int i_3_ = class180_sub5.x + -class180_sub5_sub2.x;
						final int i_4_ = class180_sub5.z + -class180_sub5_sub2.z;
						if (i_3_ != 0 || i_4_ != 0) {
							class180_sub5.anInt3019 = 0x7ff & (int) (Math.atan2(i_3_, i_4_) * 325.949);
						}
					}
				}
				if (i <= 119) {
					intStack = null;
				}
				if (32768 <= class180_sub5.anInt2981) {
					int i_5_ = -32768 + class180_sub5.anInt2981;
					if (i_5_ == Class167.anInt1616) {
						i_5_ = 2047;
					}
					final Player class180_sub5_sub1 = Class118.playersList[i_5_];
					if (class180_sub5_sub1 != null) {
						final int i_6_ = -class180_sub5_sub1.x + class180_sub5.x;
						final int i_7_ = -class180_sub5_sub1.z + class180_sub5.z;
						if (i_6_ != 0 || i_7_ != 0) {
							class180_sub5.anInt3019 = (int) (Math.atan2(i_6_, i_7_) * 325.949) & 0x7ff;
						}
					}
				}
				if ((class180_sub5.anInt3016 != 0 || class180_sub5.anInt3003 != 0) && (class180_sub5.anInt2960 == 0 || class180_sub5.anInt3037 > 0)) {
					final int i_8_ = -((class180_sub5.anInt3003 - (Class181.currentBaseZ + Class181.currentBaseZ)) * 64) + class180_sub5.z;
					final int i_9_ = class180_sub5.x - (-GameEntity.currentBaseX + class180_sub5.anInt3016 - GameEntity.currentBaseX) * 64;
					if (i_9_ != 0 || i_8_ != 0) {
						class180_sub5.anInt3019 = (int) (Math.atan2(i_9_, i_8_) * 325.949) & 0x7ff;
					}
					class180_sub5.anInt3016 = 0;
					class180_sub5.anInt3003 = 0;
				}
				final int i_10_ = 0x7ff & -class180_sub5.anInt3032 + class180_sub5.anInt3019;
				if (i_10_ != 0) {
					if (class29.anInt189 != 0) {
						class180_sub5.anInt3004 = -1;
						final int i_11_ = class180_sub5.anInt3019 << 5;
						if (class180_sub5.anInt2983 != i_11_) {
							class180_sub5.anInt3030 = 0;
							class180_sub5.anInt2983 = i_11_;
							final int i_12_ = 0xffff & -class180_sub5.anInt2987 + i_11_;
							final int i_13_ = class180_sub5.anInt3022 * class180_sub5.anInt3022 / (2 * class29.anInt189);
							if (class180_sub5.anInt3022 <= 0 || i_13_ > i_12_ || i_12_ - i_13_ >= 32768) {
								if (class180_sub5.anInt3022 >= 0 || i_13_ > -i_12_ + 65536 || -32769 >= (-i_12_ + 65536 - i_13_ ^ 0xffffffff)) {
									class180_sub5.aBoolean2997 = false;
								} else {
									class180_sub5.anInt2990 = (65536 - i_12_) / 2;
									class180_sub5.aBoolean2997 = true;
									int i_14_ = class29.anInt220 * class29.anInt220 / (class29.anInt189 * 2);
									if (i_14_ > 32767) {
										i_14_ = 32767;
									}
									if (class180_sub5.anInt2990 > i_14_) {
										class180_sub5.anInt2990 = -i_14_ + 65536 + -i_12_;
									}
								}
							} else {
								class180_sub5.aBoolean2997 = true;
								class180_sub5.anInt2990 = i_12_ / 2;
								int i_15_ = class29.anInt220 * class29.anInt220 / (class29.anInt189 * 2);
								if (i_15_ > 32767) {
									i_15_ = 32767;
								}
								if (class180_sub5.anInt2990 > i_15_) {
									class180_sub5.anInt2990 = i_12_ - i_15_;
								}
							}
						}
						if (class180_sub5.anInt3022 == 0) {
							final int i_16_ = -class180_sub5.anInt2987 + class180_sub5.anInt2983 & 0xffff;
							if (i_16_ < class29.anInt189) {
								class180_sub5.anInt2987 = class180_sub5.anInt2983;
							} else {
								class180_sub5.anInt3030 = 0;
								class180_sub5.aBoolean2997 = true;
								int i_17_ = class29.anInt220 * class29.anInt220 / (2 * class29.anInt189);
								if (i_17_ > 32767) {
									i_17_ = 32767;
								}
								if (i_16_ >= 32768) {
									class180_sub5.anInt2990 = (-i_16_ + 65536) / 2;
									if (i_17_ < class180_sub5.anInt2990) {
										class180_sub5.anInt2990 = -i_16_ + 65536 - i_17_;
									}
									class180_sub5.anInt3022 = -class29.anInt189;
								} else {
									class180_sub5.anInt2990 = i_16_ / 2;
									class180_sub5.anInt3022 = class29.anInt189;
									if (class180_sub5.anInt2990 > i_17_) {
										class180_sub5.anInt2990 = -i_17_ + i_16_;
									}
								}
							}
						} else if (class180_sub5.anInt3022 > 0) {
							if (class180_sub5.anInt3030 >= class180_sub5.anInt2990) {
								class180_sub5.aBoolean2997 = false;
							}
							if (class180_sub5.aBoolean2997) {
								if (class180_sub5.anInt3022 < class29.anInt220) {
									class180_sub5.anInt3022 += class29.anInt189;
								}
							} else {
								class180_sub5.anInt3022 -= class29.anInt189;
								if (class180_sub5.anInt3022 < 0) {
									class180_sub5.anInt3022 = 0;
								}
							}
						} else {
							if (class180_sub5.anInt3030 >= class180_sub5.anInt2990) {
								class180_sub5.aBoolean2997 = false;
							}
							if (class180_sub5.aBoolean2997) {
								if (-class29.anInt220 < class180_sub5.anInt3022) {
									class180_sub5.anInt3022 -= class29.anInt189;
								}
							} else {
								class180_sub5.anInt3022 += class29.anInt189;
								if (class180_sub5.anInt3022 > 0) {
									class180_sub5.anInt3022 = 0;
								}
							}
						}
						class180_sub5.anInt2987 += class180_sub5.anInt3022;
						class180_sub5.anInt2987 &= 0xffff;
						class180_sub5.anInt3032 = class180_sub5.anInt2987 >> 5;
						if (class180_sub5.anInt3022 <= 0) {
							class180_sub5.anInt3030 -= class180_sub5.anInt3022;
						} else {
							class180_sub5.anInt3030 += class180_sub5.anInt3022;
						}
						if (class180_sub5.anInt3022 < 0) {
							if (class180_sub5.anInt2960 > 0) {
								if (class180_sub5.aByteArray2973[class180_sub5.anInt2960 - 1] == 2) {
									if (class29.anInt194 != -1) {
										class180_sub5.anInt3004 = class29.anInt194;
									} else if ((class29.anInt190 ^ 0xffffffff) != 0) {
										class180_sub5.anInt3004 = class29.anInt190;
									}
								} else if (class180_sub5.aByteArray2973[class180_sub5.anInt2960 - 1] == 0) {
									if ((class29.anInt203 ^ 0xffffffff) == 0) {
										if (class29.anInt212 != -1) {
											class180_sub5.anInt3004 = class29.anInt212;
										}
									} else {
										class180_sub5.anInt3004 = class29.anInt203;
									}
								}
							}
							if ((class180_sub5.anInt3004 ^ 0xffffffff) == 0) {
								if (class29.anInt202 == -1) {
									if ((class29.anInt193 ^ 0xffffffff) != 0) {
										class180_sub5.anInt3004 = class29.anInt193;
									}
								} else {
									class180_sub5.anInt3004 = class29.anInt202;
								}
							}
						} else {
							if (class180_sub5.anInt2960 > 0) {
								if (class180_sub5.aByteArray2973[class180_sub5.anInt2960 - 1] == 2) {
									if ((class29.anInt211 ^ 0xffffffff) == 0) {
										if (class29.anInt190 != -1) {
											class180_sub5.anInt3004 = class29.anInt190;
										}
									} else {
										class180_sub5.anInt3004 = class29.anInt211;
									}
								} else if (class180_sub5.aByteArray2973[class180_sub5.anInt2960 - 1] == 0) {
									if (class29.anInt198 != -1) {
										class180_sub5.anInt3004 = class29.anInt198;
									} else if (class29.anInt212 != -1) {
										class180_sub5.anInt3004 = class29.anInt212;
									}
								}
							}
							if ((class180_sub5.anInt3004 ^ 0xffffffff) == 0) {
								if ((class29.anInt222 ^ 0xffffffff) == 0) {
									if ((class29.anInt191 ^ 0xffffffff) != 0) {
										class180_sub5.anInt3004 = class29.anInt191;
									}
								} else {
									class180_sub5.anInt3004 = class29.anInt222;
								}
							}
						}
						if (class180_sub5.anInt3004 == -1) {
							class180_sub5.anInt3004 = class29.anInt205;
						}
					} else {
						class180_sub5.anInt3017++;
						if (i_10_ <= 1024) {
							class180_sub5.anInt3032 += class180_sub5.anInt3010;
							boolean bool = true;
							if (class180_sub5.anInt3010 > i_10_ || i_10_ > -class180_sub5.anInt3010 + 2048) {
								bool = false;
								class180_sub5.anInt3032 = class180_sub5.anInt3019;
							}
							if (class180_sub5.anInt3017 > 25 || bool) {
								class180_sub5.anInt3004 = class29.anInt205;
								if (class180_sub5.anInt2960 > 0) {
									if (class180_sub5.aByteArray2973[-1 + class180_sub5.anInt2960] == 2) {
										if ((class29.anInt211 ^ 0xffffffff) != 0) {
											class180_sub5.anInt3004 = class29.anInt211;
										} else if (class29.anInt190 != -1) {
											class180_sub5.anInt3004 = class29.anInt190;
										}
									} else if (class180_sub5.aByteArray2973[class180_sub5.anInt2960 - 1] != 0) {
										if ((class29.anInt222 ^ 0xffffffff) != 0) {
											class180_sub5.anInt3004 = class29.anInt222;
										}
									} else if (class29.anInt198 == -1) {
										if (class29.anInt212 != -1) {
											class180_sub5.anInt3004 = class29.anInt212;
										}
									} else {
										class180_sub5.anInt3004 = class29.anInt198;
									}
								} else if ((class29.anInt191 ^ 0xffffffff) != 0) {
									class180_sub5.anInt3004 = class29.anInt191;
								}
							}
						} else {
							class180_sub5.anInt3032 -= class180_sub5.anInt3010;
							boolean bool = true;
							if (i_10_ < class180_sub5.anInt3010 || -class180_sub5.anInt3010 + 2048 < i_10_) {
								bool = false;
								class180_sub5.anInt3032 = class180_sub5.anInt3019;
							}
							if (class180_sub5.anInt3017 > 25 || bool) {
								class180_sub5.anInt3004 = class29.anInt205;
								if (class180_sub5.anInt2960 <= 0) {
									if (class29.anInt193 != -1) {
										class180_sub5.anInt3004 = class29.anInt193;
									}
								} else if (class180_sub5.aByteArray2973[class180_sub5.anInt2960 - 1] == 2) {
									if ((class29.anInt194 ^ 0xffffffff) != 0) {
										class180_sub5.anInt3004 = class29.anInt194;
									} else if ((class29.anInt190 ^ 0xffffffff) != 0) {
										class180_sub5.anInt3004 = class29.anInt190;
									}
								} else if (class180_sub5.aByteArray2973[class180_sub5.anInt2960 - 1] != 0) {
									if (class29.anInt202 != -1) {
										class180_sub5.anInt3004 = class29.anInt202;
									}
								} else if ((class29.anInt203 ^ 0xffffffff) != 0) {
									class180_sub5.anInt3004 = class29.anInt203;
								} else if ((class29.anInt212 ^ 0xffffffff) != 0) {
									class180_sub5.anInt3004 = class29.anInt212;
								}
							}
						}
						class180_sub5.anInt3032 &= 0x7ff;
					}
				} else {
					class180_sub5.anInt3022 = 0;
					class180_sub5.anInt3017 = 0;
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("tm.N(").append(i).append(',').append(class180_sub5 != null ? "{...}" : "null").append(')').toString());
		}
	}

	static final int[] method1851(final boolean bool, final CollisionMap[] class25s, final int i, final int i_18_, final int i_19_, final int i_20_, final int i_21_, final byte[] is) {
		int[] is_22_;
		try {
			int i_23_;
			if (!bool) {
				i_23_ = 4;
			} else {
				i_23_ = 1;
			}
			if (!bool) {
				for (int i_24_ = 0; i_24_ < 4; i_24_++) {
					for (int i_25_ = 0; i_25_ < 64; i_25_++) {
						for (int i_26_ = 0; i_26_ < 64; i_26_++) {
							if (i_20_ + i_25_ > 0 && i_25_ + i_20_ < 103 && i_19_ + i_26_ > 0 && i_26_ + i_19_ < 103) {
								class25s[i_24_].anIntArrayArray152[i_25_ + i_20_][i_19_ - -i_26_] = Class120_Sub12_Sub3.method1207(class25s[i_24_].anIntArrayArray152[i_25_ + i_20_][i_19_ - -i_26_], -2097153);
							}
						}
					}
				}
			}
			final int i_27_ = i_21_ + i_20_;
			final Buffer class120_sub7 = new Buffer(is);
			final int i_28_ = i_18_ + i_19_;
			int i_29_ = 0;
			if (i != -24017) {
				return null;
			}
			for (/**/; i_23_ > i_29_; i_29_++) {
				for (int i_30_ = 0; i_30_ < 64; i_30_++) {
					for (int i_31_ = 0; i_31_ < 64; i_31_++) {
						Class10.method119(class120_sub7, false, bool, i_29_, i_27_ + i_30_, i_31_ + i_28_, i_31_ + i_19_, 0, 0, 0, i_20_ + i_30_);
					}
				}
			}
			boolean bool_32_ = false;
			boolean bool_33_ = false;
			while (class120_sub7.buf.length > class120_sub7.pos) {
				final int i_34_ = class120_sub7.getUByte();
				if (i_34_ != 128) {
					if (i_34_ != 129) {
						class120_sub7.pos--;
						break;
					}
					for (int i_35_ = 0; i_35_ < 4; i_35_++) {
						final byte i_36_ = class120_sub7.getByte();
						if (i_36_ == 0) {
							int i_37_ = i_20_ + 64;
							if (i_37_ < 0) {
								i_37_ = 0;
							} else if (i_37_ >= 104) {
								i_37_ = 104;
							}
							int i_38_ = i_20_;
							int i_39_ = i_19_;
							if (i_39_ < 0) {
								i_39_ = 0;
							} else if (i_39_ >= 104) {
								i_39_ = 104;
							}
							int i_40_ = 64 + i_19_;
							if (i_38_ >= 0) {
								if (i_38_ >= 104) {
									i_38_ = 104;
								}
							} else {
								i_38_ = 0;
							}
							if (i_40_ >= 0) {
								if (i_40_ >= 104) {
									i_40_ = 104;
								}
							} else {
								i_40_ = 0;
							}
							for (/**/; i_37_ > i_38_; i_38_++) {
								for (/**/; i_39_ < i_40_; i_39_++) {
									Class114.aByteArrayArrayArray1094[i_35_][i_38_][i_39_] = (byte) 0;
								}
							}
						} else if (i_36_ == 1) {
							for (int i_41_ = 0; i_41_ < 64; i_41_ += 4) {
								for (int i_42_ = 0; i_42_ < 64; i_42_ += 4) {
									final byte i_43_ = class120_sub7.getByte();
									for (int i_44_ = i_41_ + i_20_; i_41_ - (-i_20_ - 4) > i_44_; i_44_++) {
										for (int i_45_ = i_19_ + i_42_; 4 + i_42_ + i_19_ > i_45_; i_45_++) {
											if (i_44_ >= 0 && i_44_ < 104 && i_45_ >= 0 && i_45_ < 104) {
												Class114.aByteArrayArrayArray1094[i_35_][i_44_][i_45_] = i_43_;
											}
										}
									}
								}
							}
						} else if (i_36_ == 2 && i_35_ > 0) {
							int i_46_ = 64 + i_20_;
							if (i_46_ >= 0) {
								if (i_46_ >= 104) {
									i_46_ = 104;
								}
							} else {
								i_46_ = 0;
							}
							int i_47_ = i_19_;
							if (i_47_ < 0) {
								i_47_ = 0;
							} else if (i_47_ >= 104) {
								i_47_ = 104;
							}
							int i_48_ = i_20_;
							int i_49_ = 64 + i_19_;
							if (i_48_ >= 0) {
								if (i_48_ >= 104) {
									i_48_ = 104;
								}
							} else {
								i_48_ = 0;
							}
							if (i_49_ >= 0) {
								if (i_49_ >= 104) {
									i_49_ = 104;
								}
							} else {
								i_49_ = 0;
							}
							for (/**/; i_46_ > i_48_; i_48_++) {
								for (/**/; i_49_ > i_47_; i_47_++) {
									Class114.aByteArrayArrayArray1094[i_35_][i_48_][i_47_] = Class114.aByteArrayArrayArray1094[i_35_ + -1][i_48_][i_47_];
								}
							}
						}
					}
					bool_33_ = true;
				} else {
					bool_32_ = true;
					CanvasWrapper.anIntArray21[0] = class120_sub7.getUShort();
					CanvasWrapper.anIntArray21[1] = class120_sub7.getShort();
					CanvasWrapper.anIntArray21[2] = class120_sub7.getShort();
					CanvasWrapper.anIntArray21[3] = class120_sub7.getShort();
					CanvasWrapper.anIntArray21[4] = class120_sub7.getUShort();
				}
			}
			if (HDToolkit.glEnabled && !bool) {
				Class191 class191 = null;
				while (class120_sub7.pos < class120_sub7.buf.length) {
					final int i_50_ = class120_sub7.getUByte();
					if (i_50_ == 0) {
						class191 = new Class191(class120_sub7);
					} else if (i_50_ != 1) {
						if (i_50_ == 2) {
							if (class191 == null) {
								class191 = new Class191();
							}
							class191.method2510(class120_sub7, -27409);
						} else {
							throw new IllegalStateException();
						}
					} else {
						final int i_51_ = class120_sub7.getUByte();
						if (i_51_ > 0) {
							for (int i_52_ = 0; i_52_ < i_51_; i_52_++) {
								final Light light = new Light(class120_sub7);
								if (light.anInt376 == 31) {
									final Class181 class181 = Class120_Sub12_Sub3.method1208(class120_sub7.getUShort(), (byte) -72);
									light.method347(class181.anInt1789, 1056, class181.anInt1786, class181.anInt1788, class181.anInt1787);
								}
								light.anInt395 += i_20_ << 7;
								light.anInt373 += i_19_ << 7;
								final int i_53_ = light.anInt395 >> 7;
								final int i_54_ = light.anInt373 >> 7;
								if (i_53_ >= 0 && i_54_ >= 0 && i_53_ < 104 && i_54_ < 104) {
									light.aBoolean385 = (Class114.tileSettings[1][i_53_][i_54_] & 0x2) != 0;
									light.anInt375 = OverridedJInterface.anIntArrayArrayArray2741[light.anInt384][i_53_][i_54_] - light.anInt375;
									LightManager.method1860(light);
								}
							}
						}
					}
				}
				if (class191 == null) {
					class191 = new Class191();
				}
				for (int i_55_ = 0; i_55_ < 8; i_55_++) {
					for (int i_56_ = 0; i_56_ < 8; i_56_++) {
						final int i_57_ = (i_20_ >> 3) - -i_55_;
						final int i_58_ = (i_19_ >> 3) + i_56_;
						if (i_57_ >= 0 && i_57_ < 13 && i_58_ >= 0 && i_58_ < 13) {
							IdentityKit.aClass191ArrayArray1337[i_57_][i_58_] = class191;
						}
					}
				}
			}
			if (!bool_33_) {
				for (int i_59_ = 0; i_59_ < 4; i_59_++) {
					for (int i_60_ = 0; i_60_ < 16; i_60_++) {
						for (int i_61_ = 0; i_61_ < 16; i_61_++) {
							final int i_62_ = (i_19_ >> 2) - -i_61_;
							final int i_63_ = (i_20_ >> 2) + i_60_;
							if (i_63_ >= 0 && i_63_ < 26 && i_62_ >= 0 && i_62_ < 26) {
								Class114.aByteArrayArrayArray1094[i_59_][i_63_][i_62_] = (byte) 0;
							}
						}
					}
				}
			}
			is_22_ = !bool_32_ ? null : CanvasWrapper.anIntArray21;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("tm.O(").append(bool).append(',').append(class25s != null ? "{...}" : "null").append(',').append(i).append(',').append(i_18_).append(',').append(i_19_).append(',').append(i_20_).append(',').append(i_21_).append(',').append(is != null ? "{...}" : "null").append(')').toString());
		}
		return is_22_;
	}

	@Override
	final void drawImage(final Graphics graphics, final int x, final int y) {
		setPixels();
		graphics.drawImage(this.image, x, y, this);
	}

	public static void method1852(final int i) {
		try {
			anIntArray2796 = null;
			intStack = null;
			if (i != -1) {
				method1853(-97, 89, (byte) -55, -120, 58, -53, -53, -56);
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("tm.L(").append(i).append(')').toString());
		}
	}

	static final void method1853(final int i, final int i_66_, final byte i_67_, final int i_68_, final int i_69_, final int i_70_, final int i_71_, int i_72_) {
		try {
			if (i_66_ >= 0 && i_69_ >= 0 && i_66_ < 103 && i_69_ < 103) {
				if (i_70_ == 0) {
					final Class182 class182 = Deque.method894(i_68_, i_66_, i_69_);
					if (class182 != null) {
						final int i_73_ = (int) (class182.bitPacked >>> 32) & 0x7fffffff;
						if (i_72_ == 2) {
							class182.aClass180_1800 = new Class180_Sub6(i_73_, 2, 4 + i_71_, i_68_, i_66_, i_69_, i, false, class182.aClass180_1800);
							class182.aClass180_1796 = new Class180_Sub6(i_73_, 2, 1 + i_71_ & 0x3, i_68_, i_66_, i_69_, i, false, class182.aClass180_1796);
						} else {
							class182.aClass180_1800 = new Class180_Sub6(i_73_, i_72_, i_71_, i_68_, i_66_, i_69_, i, false, class182.aClass180_1800);
						}
					}
				}
				if (i_70_ == 1) {
					final Class186 class186 = ObjType.method2108(i_68_, i_66_, i_69_);
					if (class186 != null) {
						final int i_74_ = 0x7fffffff & (int) (class186.bitPacked >>> 32);
						if (i_72_ != 4 && i_72_ != 5) {
							if (i_72_ != 6) {
								if (i_72_ == 7) {
									class186.aClass180_1901 = new Class180_Sub6(i_74_, 4, (0x3 & i_71_ - -2) - -4, i_68_, i_66_, i_69_, i, false, class186.aClass180_1901);
								} else if (i_72_ == 8) {
									class186.aClass180_1901 = new Class180_Sub6(i_74_, 4, 4 + i_71_, i_68_, i_66_, i_69_, i, false, class186.aClass180_1901);
									class186.aClass180_1898 = new Class180_Sub6(i_74_, 4, (i_71_ - -2 & 0x3) + 4, i_68_, i_66_, i_69_, i, false, class186.aClass180_1898);
								}
							} else {
								class186.aClass180_1901 = new Class180_Sub6(i_74_, 4, 4 + i_71_, i_68_, i_66_, i_69_, i, false, class186.aClass180_1901);
							}
						} else {
							class186.aClass180_1901 = new Class180_Sub6(i_74_, 4, i_71_, i_68_, i_66_, i_69_, i, false, class186.aClass180_1901);
						}
					}
				}
				if (i_70_ == 2) {
					if (i_72_ == 11) {
						i_72_ = 10;
					}
					final Class28 class28 = Class180_Sub3.method2315(i_68_, i_66_, i_69_);
					if (class28 != null) {
						class28.aClass180_174 = new Class180_Sub6((int) (class28.bitPacked >>> 32) & 0x7fffffff, i_72_, i_71_, i_68_, i_66_, i_69_, i, false, class28.aClass180_174);
					}
				}
				if (i_70_ == 3) {
					final Class36 class36 = Class23.method202(i_68_, i_66_, i_69_);
					if (class36 != null) {
						class36.aClass180_309 = new Class180_Sub6(0x7fffffff & (int) (class36.bitPacked >>> 32), 22, i_71_, i_68_, i_66_, i_69_, i, false, class36.aClass180_309);
					}
				}
			}
			if (i_67_ > -16) {
				method1852(91);
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("tm.P(").append(i).append(',').append(i_66_).append(',').append(i_67_).append(',').append(i_68_).append(',').append(i_69_).append(',').append(i_70_).append(',').append(i_71_).append(',').append(i_72_).append(')').toString());
		}
	}

	static final void method1854(final boolean bool, final boolean bool_75_, final JagexInterface jagexInterface) {
		try {
			final int i = jagexInterface.maxScrollHorizontal == 0 ? jagexInterface.width : jagexInterface.maxScrollHorizontal;
			final int i_76_ = jagexInterface.maxScrollVertical == 0 ? jagexInterface.height : jagexInterface.maxScrollVertical;
			WorldInfo.method2065(Node.interfaceCache[jagexInterface.bitPacked >> 16], bool, i, jagexInterface.bitPacked, i_76_, -120);
			if (!bool_75_) {
				if (jagexInterface.components != null) {
					WorldInfo.method2065(jagexInterface.components, bool, i, jagexInterface.bitPacked, i_76_, -106);
				}
				final OverridedJInterface class120_sub26 = (OverridedJInterface) Class120_Sub12_Sub13.overridedInterfaces.get(jagexInterface.bitPacked);
				if (class120_sub26 != null) {
					Class120_Sub12_Sub12.method1258(bool, -6090, i, class120_sub26.interfaceId, i_76_);
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("tm.K(").append(bool).append(',').append(bool_75_).append(',').append(jagexInterface != null ? "{...}" : "null").append(')').toString());
		}
	}

	@Override
	public final boolean imageUpdate(final Image image, final int i, final int i_77_, final int i_78_, final int i_79_, final int i_80_) {
		return true;
	}

	@Override
	public final void startProduction(final ImageConsumer imageconsumer) {
		addConsumer(imageconsumer);
	}

	public ProducingGraphicsBuffer() {
		/* empty */
	}

	private final synchronized void setPixels(final int x, final int y, final int width, final int height) {
		if (imageConsumer != null) {
			imageConsumer.setPixels(x, y, width, height, colorModel, this.pixels, this.width * y + x, this.width);
			imageConsumer.imageComplete(2);
		}
	}

	@Override
	public final synchronized boolean isConsumer(final ImageConsumer imageconsumer) {
		return imageConsumer == imageconsumer;
	}

	@Override
	public final synchronized void removeConsumer(final ImageConsumer imageconsumer) {
		if (imageConsumer == imageconsumer) {
			imageConsumer = null;
		}
	}

	@Override
	final void init(final Component component, final int width, final int height) {
		this.width = width;
		this.height = height;
		this.pixels = new int[1 + width * height];
		colorModel = new DirectColorModel(32, 16711680, 65280, 255);
		this.image = component.createImage(this);
		setPixels();
		component.prepareImage(this.image, this);
		setPixels();
		component.prepareImage(this.image, this);
		setPixels();
		component.prepareImage(this.image, this);
		init2dCanvas();
	}
}
