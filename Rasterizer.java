/* Class102 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Rasterizer {
	static int anInt967;
	static float aFloat968;
	static int[] palette = new int[65536];
	static int anInt970;
	static boolean aBoolean971;
	static boolean aBoolean972;
	static Interface5 anInterface5_973;
	static boolean aBoolean974;
	static int alpha = 0;
	private static boolean aBoolean976;
	private static int[] anIntArray977;
	private static int endY;
	private static int[] coordinateYLookup;
	static int[] cosTable;
	private static boolean aBoolean981;
	static int[] sinTable;
	static int anInt983;
	static int[] anIntArray984;

	static {
		aBoolean972 = false;
		aBoolean974 = false;
		aBoolean971 = true;
		aFloat968 = 1.0F;
		anIntArray977 = new int[512];
		aBoolean981 = false;
		cosTable = new int[2048];
		aBoolean976 = false;
		coordinateYLookup = new int[1024];
		anIntArray984 = new int[2048];
		sinTable = new int[2048];
		for (int i = 1; i < 512; i++) {
			anIntArray977[i] = 32768 / i;
		}
		for (int i = 1; i < 2048; i++) {
			anIntArray984[i] = 65536 / i;
		}
		for (int i = 0; i < 2048; i++) {
			sinTable[i] = (int) (65536.0 * Math.sin(i * 0.0030679615));
			cosTable[i] = (int) (65536.0 * Math.cos(i * 0.0030679615));
		}
	}

	static final void method852(final float f) {
		method854(f);
		method858(0, 512);
	}

	private static final int method853(final int i, int i_0_) {
		i_0_ = i_0_ * (i & 0x7f) >> 7;
		if (i_0_ < 2) {
			i_0_ = 2;
		} else if (i_0_ > 126) {
			i_0_ = 126;
		}
		return (i & 0xff80) + i_0_;
	}

	private static final void method854(final float f) {
		aFloat968 = f;
		aFloat968 += Math.random() * 0.03 - 0.015;
	}

	static final void method855(final int i, final int i_1_, final int i_2_) {
		aBoolean972 = i < 0 || i > anInt983 || i_1_ < 0 || i_1_ > anInt983 || i_2_ < 0 || i_2_ > anInt983;
	}

	static final void method856(int i, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_) {
		final int i_11_ = i_6_ - i_5_;
		final int i_12_ = i_3_ - i;
		final int i_13_ = i_7_ - i_5_;
		final int i_14_ = i_4_ - i;
		final int i_15_ = i_9_ - i_8_;
		final int i_16_ = i_10_ - i_8_;
		int i_17_;
		if (i_4_ != i_3_) {
			i_17_ = (i_7_ - i_6_ << 16) / (i_4_ - i_3_);
		} else {
			i_17_ = 0;
		}
		int i_18_;
		if (i_3_ != i) {
			i_18_ = (i_11_ << 16) / i_12_;
		} else {
			i_18_ = 0;
		}
		int i_19_;
		if (i_4_ != i) {
			i_19_ = (i_13_ << 16) / i_14_;
		} else {
			i_19_ = 0;
		}
		final int i_20_ = i_11_ * i_14_ - i_13_ * i_12_;
		if (i_20_ != 0) {
			final int i_21_ = (i_15_ * i_14_ - i_16_ * i_12_ << 8) / i_20_;
			final int i_22_ = (i_16_ * i_11_ - i_15_ * i_13_ << 8) / i_20_;
			if (i <= i_3_ && i <= i_4_) {
				if (i < endY) {
					if (i_3_ > endY) {
						i_3_ = endY;
					}
					if (i_4_ > endY) {
						i_4_ = endY;
					}
					i_8_ = (i_8_ << 8) - i_21_ * i_5_ + i_21_;
					if (i_3_ < i_4_) {
						i_7_ = i_5_ <<= 16;
						if (i < 0) {
							i_7_ -= i_19_ * i;
							i_5_ -= i_18_ * i;
							i_8_ -= i_22_ * i;
							i = 0;
						}
						i_6_ <<= 16;
						if (i_3_ < 0) {
							i_6_ -= i_17_ * i_3_;
							i_3_ = 0;
						}
						if (i != i_3_ && i_19_ < i_18_ || i == i_3_ && i_19_ > i_17_) {
							i_4_ -= i_3_;
							i_3_ -= i;
							i = coordinateYLookup[i];
							while (--i_3_ >= 0) {
								method867(GraphicsLD.pixels, i, 0, 0, i_7_ >> 16, i_5_ >> 16, i_8_, i_21_);
								i_7_ += i_19_;
								i_5_ += i_18_;
								i_8_ += i_22_;
								i += GraphicsLD.width;
							}
							while (--i_4_ >= 0) {
								method867(GraphicsLD.pixels, i, 0, 0, i_7_ >> 16, i_6_ >> 16, i_8_, i_21_);
								i_7_ += i_19_;
								i_6_ += i_17_;
								i_8_ += i_22_;
								i += GraphicsLD.width;
							}
						} else {
							i_4_ -= i_3_;
							i_3_ -= i;
							i = coordinateYLookup[i];
							while (--i_3_ >= 0) {
								method867(GraphicsLD.pixels, i, 0, 0, i_5_ >> 16, i_7_ >> 16, i_8_, i_21_);
								i_7_ += i_19_;
								i_5_ += i_18_;
								i_8_ += i_22_;
								i += GraphicsLD.width;
							}
							while (--i_4_ >= 0) {
								method867(GraphicsLD.pixels, i, 0, 0, i_6_ >> 16, i_7_ >> 16, i_8_, i_21_);
								i_7_ += i_19_;
								i_6_ += i_17_;
								i_8_ += i_22_;
								i += GraphicsLD.width;
							}
						}
					} else {
						i_6_ = i_5_ <<= 16;
						if (i < 0) {
							i_6_ -= i_19_ * i;
							i_5_ -= i_18_ * i;
							i_8_ -= i_22_ * i;
							i = 0;
						}
						i_7_ <<= 16;
						if (i_4_ < 0) {
							i_7_ -= i_17_ * i_4_;
							i_4_ = 0;
						}
						if (i != i_4_ && i_19_ < i_18_ || i == i_4_ && i_17_ > i_18_) {
							i_3_ -= i_4_;
							i_4_ -= i;
							i = coordinateYLookup[i];
							while (--i_4_ >= 0) {
								method867(GraphicsLD.pixels, i, 0, 0, i_6_ >> 16, i_5_ >> 16, i_8_, i_21_);
								i_6_ += i_19_;
								i_5_ += i_18_;
								i_8_ += i_22_;
								i += GraphicsLD.width;
							}
							while (--i_3_ >= 0) {
								method867(GraphicsLD.pixels, i, 0, 0, i_7_ >> 16, i_5_ >> 16, i_8_, i_21_);
								i_7_ += i_17_;
								i_5_ += i_18_;
								i_8_ += i_22_;
								i += GraphicsLD.width;
							}
						} else {
							i_3_ -= i_4_;
							i_4_ -= i;
							i = coordinateYLookup[i];
							while (--i_4_ >= 0) {
								method867(GraphicsLD.pixels, i, 0, 0, i_5_ >> 16, i_6_ >> 16, i_8_, i_21_);
								i_6_ += i_19_;
								i_5_ += i_18_;
								i_8_ += i_22_;
								i += GraphicsLD.width;
							}
							while (--i_3_ >= 0) {
								method867(GraphicsLD.pixels, i, 0, 0, i_5_ >> 16, i_7_ >> 16, i_8_, i_21_);
								i_7_ += i_17_;
								i_5_ += i_18_;
								i_8_ += i_22_;
								i += GraphicsLD.width;
							}
						}
					}
				}
			} else if (i_3_ <= i_4_) {
				if (i_3_ < endY) {
					if (i_4_ > endY) {
						i_4_ = endY;
					}
					if (i > endY) {
						i = endY;
					}
					i_9_ = (i_9_ << 8) - i_21_ * i_6_ + i_21_;
					if (i_4_ < i) {
						i_5_ = i_6_ <<= 16;
						if (i_3_ < 0) {
							i_5_ -= i_18_ * i_3_;
							i_6_ -= i_17_ * i_3_;
							i_9_ -= i_22_ * i_3_;
							i_3_ = 0;
						}
						i_7_ <<= 16;
						if (i_4_ < 0) {
							i_7_ -= i_19_ * i_4_;
							i_4_ = 0;
						}
						if (i_3_ != i_4_ && i_18_ < i_17_ || i_3_ == i_4_ && i_18_ > i_19_) {
							i -= i_4_;
							i_4_ -= i_3_;
							i_3_ = coordinateYLookup[i_3_];
							while (--i_4_ >= 0) {
								method867(GraphicsLD.pixels, i_3_, 0, 0, i_5_ >> 16, i_6_ >> 16, i_9_, i_21_);
								i_5_ += i_18_;
								i_6_ += i_17_;
								i_9_ += i_22_;
								i_3_ += GraphicsLD.width;
							}
							while (--i >= 0) {
								method867(GraphicsLD.pixels, i_3_, 0, 0, i_5_ >> 16, i_7_ >> 16, i_9_, i_21_);
								i_5_ += i_18_;
								i_7_ += i_19_;
								i_9_ += i_22_;
								i_3_ += GraphicsLD.width;
							}
						} else {
							i -= i_4_;
							i_4_ -= i_3_;
							i_3_ = coordinateYLookup[i_3_];
							while (--i_4_ >= 0) {
								method867(GraphicsLD.pixels, i_3_, 0, 0, i_6_ >> 16, i_5_ >> 16, i_9_, i_21_);
								i_5_ += i_18_;
								i_6_ += i_17_;
								i_9_ += i_22_;
								i_3_ += GraphicsLD.width;
							}
							while (--i >= 0) {
								method867(GraphicsLD.pixels, i_3_, 0, 0, i_7_ >> 16, i_5_ >> 16, i_9_, i_21_);
								i_5_ += i_18_;
								i_7_ += i_19_;
								i_9_ += i_22_;
								i_3_ += GraphicsLD.width;
							}
						}
					} else {
						i_7_ = i_6_ <<= 16;
						if (i_3_ < 0) {
							i_7_ -= i_18_ * i_3_;
							i_6_ -= i_17_ * i_3_;
							i_9_ -= i_22_ * i_3_;
							i_3_ = 0;
						}
						i_5_ <<= 16;
						if (i < 0) {
							i_5_ -= i_19_ * i;
							i = 0;
						}
						if (i_18_ < i_17_) {
							i_4_ -= i;
							i -= i_3_;
							i_3_ = coordinateYLookup[i_3_];
							while (--i >= 0) {
								method867(GraphicsLD.pixels, i_3_, 0, 0, i_7_ >> 16, i_6_ >> 16, i_9_, i_21_);
								i_7_ += i_18_;
								i_6_ += i_17_;
								i_9_ += i_22_;
								i_3_ += GraphicsLD.width;
							}
							while (--i_4_ >= 0) {
								method867(GraphicsLD.pixels, i_3_, 0, 0, i_5_ >> 16, i_6_ >> 16, i_9_, i_21_);
								i_5_ += i_19_;
								i_6_ += i_17_;
								i_9_ += i_22_;
								i_3_ += GraphicsLD.width;
							}
						} else {
							i_4_ -= i;
							i -= i_3_;
							i_3_ = coordinateYLookup[i_3_];
							while (--i >= 0) {
								method867(GraphicsLD.pixels, i_3_, 0, 0, i_6_ >> 16, i_7_ >> 16, i_9_, i_21_);
								i_7_ += i_18_;
								i_6_ += i_17_;
								i_9_ += i_22_;
								i_3_ += GraphicsLD.width;
							}
							while (--i_4_ >= 0) {
								method867(GraphicsLD.pixels, i_3_, 0, 0, i_6_ >> 16, i_5_ >> 16, i_9_, i_21_);
								i_5_ += i_19_;
								i_6_ += i_17_;
								i_9_ += i_22_;
								i_3_ += GraphicsLD.width;
							}
						}
					}
				}
			} else if (i_4_ < endY) {
				if (i > endY) {
					i = endY;
				}
				if (i_3_ > endY) {
					i_3_ = endY;
				}
				i_10_ = (i_10_ << 8) - i_21_ * i_7_ + i_21_;
				if (i < i_3_) {
					i_6_ = i_7_ <<= 16;
					if (i_4_ < 0) {
						i_6_ -= i_17_ * i_4_;
						i_7_ -= i_19_ * i_4_;
						i_10_ -= i_22_ * i_4_;
						i_4_ = 0;
					}
					i_5_ <<= 16;
					if (i < 0) {
						i_5_ -= i_18_ * i;
						i = 0;
					}
					if (i_17_ < i_19_) {
						i_3_ -= i;
						i -= i_4_;
						i_4_ = coordinateYLookup[i_4_];
						while (--i >= 0) {
							method867(GraphicsLD.pixels, i_4_, 0, 0, i_6_ >> 16, i_7_ >> 16, i_10_, i_21_);
							i_6_ += i_17_;
							i_7_ += i_19_;
							i_10_ += i_22_;
							i_4_ += GraphicsLD.width;
						}
						while (--i_3_ >= 0) {
							method867(GraphicsLD.pixels, i_4_, 0, 0, i_6_ >> 16, i_5_ >> 16, i_10_, i_21_);
							i_6_ += i_17_;
							i_5_ += i_18_;
							i_10_ += i_22_;
							i_4_ += GraphicsLD.width;
						}
					} else {
						i_3_ -= i;
						i -= i_4_;
						i_4_ = coordinateYLookup[i_4_];
						while (--i >= 0) {
							method867(GraphicsLD.pixels, i_4_, 0, 0, i_7_ >> 16, i_6_ >> 16, i_10_, i_21_);
							i_6_ += i_17_;
							i_7_ += i_19_;
							i_10_ += i_22_;
							i_4_ += GraphicsLD.width;
						}
						while (--i_3_ >= 0) {
							method867(GraphicsLD.pixels, i_4_, 0, 0, i_5_ >> 16, i_6_ >> 16, i_10_, i_21_);
							i_6_ += i_17_;
							i_5_ += i_18_;
							i_10_ += i_22_;
							i_4_ += GraphicsLD.width;
						}
					}
				} else {
					i_5_ = i_7_ <<= 16;
					if (i_4_ < 0) {
						i_5_ -= i_17_ * i_4_;
						i_7_ -= i_19_ * i_4_;
						i_10_ -= i_22_ * i_4_;
						i_4_ = 0;
					}
					i_6_ <<= 16;
					if (i_3_ < 0) {
						i_6_ -= i_18_ * i_3_;
						i_3_ = 0;
					}
					if (i_17_ < i_19_) {
						i -= i_3_;
						i_3_ -= i_4_;
						i_4_ = coordinateYLookup[i_4_];
						while (--i_3_ >= 0) {
							method867(GraphicsLD.pixels, i_4_, 0, 0, i_5_ >> 16, i_7_ >> 16, i_10_, i_21_);
							i_5_ += i_17_;
							i_7_ += i_19_;
							i_10_ += i_22_;
							i_4_ += GraphicsLD.width;
						}
						while (--i >= 0) {
							method867(GraphicsLD.pixels, i_4_, 0, 0, i_6_ >> 16, i_7_ >> 16, i_10_, i_21_);
							i_6_ += i_18_;
							i_7_ += i_19_;
							i_10_ += i_22_;
							i_4_ += GraphicsLD.width;
						}
					} else {
						i -= i_3_;
						i_3_ -= i_4_;
						i_4_ = coordinateYLookup[i_4_];
						while (--i_3_ >= 0) {
							method867(GraphicsLD.pixels, i_4_, 0, 0, i_7_ >> 16, i_5_ >> 16, i_10_, i_21_);
							i_5_ += i_17_;
							i_7_ += i_19_;
							i_10_ += i_22_;
							i_4_ += GraphicsLD.width;
						}
						while (--i >= 0) {
							method867(GraphicsLD.pixels, i_4_, 0, 0, i_7_ >> 16, i_6_ >> 16, i_10_, i_21_);
							i_6_ += i_18_;
							i_7_ += i_19_;
							i_10_ += i_22_;
							i_4_ += GraphicsLD.width;
						}
					}
				}
			}
		}
	}

	private static final void method857(final int[] is, int i, int i_23_, int i_24_, int i_25_, int i_26_) {
		if (aBoolean972) {
			if (i_26_ > anInt983) {
				i_26_ = anInt983;
			}
			if (i_25_ < 0) {
				i_25_ = 0;
			}
		}
		if (i_25_ < i_26_) {
			i += i_25_;
			i_24_ = i_26_ - i_25_ >> 2;
			if (alpha == 0) {
				while (--i_24_ >= 0) {
					is[i++] = i_23_;
					is[i++] = i_23_;
					is[i++] = i_23_;
					is[i++] = i_23_;
				}
				i_24_ = i_26_ - i_25_ & 0x3;
				while (--i_24_ >= 0) {
					is[i++] = i_23_;
				}
			} else if (alpha == 254) {
				while (--i_24_ >= 0) {
					is[i++] = is[i];
					is[i++] = is[i];
					is[i++] = is[i];
					is[i++] = is[i];
				}
				i_24_ = i_26_ - i_25_ & 0x3;
				while (--i_24_ >= 0) {
					is[i++] = is[i];
				}
			} else {
				final int i_27_ = alpha;
				final int i_28_ = 256 - alpha;
				i_23_ = ((i_23_ & 0xff00ff) * i_28_ >> 8 & 0xff00ff) + ((i_23_ & 0xff00) * i_28_ >> 8 & 0xff00);
				while (--i_24_ >= 0) {
					int i_29_ = is[i];
					is[i++] = i_23_ + ((i_29_ & 0xff00ff) * i_27_ >> 8 & 0xff00ff) + ((i_29_ & 0xff00) * i_27_ >> 8 & 0xff00);
					i_29_ = is[i];
					is[i++] = i_23_ + ((i_29_ & 0xff00ff) * i_27_ >> 8 & 0xff00ff) + ((i_29_ & 0xff00) * i_27_ >> 8 & 0xff00);
					i_29_ = is[i];
					is[i++] = i_23_ + ((i_29_ & 0xff00ff) * i_27_ >> 8 & 0xff00ff) + ((i_29_ & 0xff00) * i_27_ >> 8 & 0xff00);
					i_29_ = is[i];
					is[i++] = i_23_ + ((i_29_ & 0xff00ff) * i_27_ >> 8 & 0xff00ff) + ((i_29_ & 0xff00) * i_27_ >> 8 & 0xff00);
				}
				i_24_ = i_26_ - i_25_ & 0x3;
				while (--i_24_ >= 0) {
					final int i_30_ = is[i];
					is[i++] = i_23_ + ((i_30_ & 0xff00ff) * i_27_ >> 8 & 0xff00ff) + ((i_30_ & 0xff00) * i_27_ >> 8 & 0xff00);
				}
			}
		}
	}

	private static final void method858(final int i, final int i_31_) {
		int i_32_ = i * 128;
		for (int i_33_ = i; i_33_ < i_31_; i_33_++) {
			final double d = (i_33_ >> 3) / 64.0 + 0.0078125;
			final double d_34_ = (i_33_ & 0x7) / 8.0 + 0.0625;
			for (int i_35_ = 0; i_35_ < 128; i_35_++) {
				final double d_36_ = i_35_ / 128.0;
				double d_37_ = d_36_;
				double d_38_ = d_36_;
				double d_39_ = d_36_;
				if (d_34_ != 0.0) {
					double d_40_;
					if (d_36_ < 0.5) {
						d_40_ = d_36_ * (1.0 + d_34_);
					} else {
						d_40_ = d_36_ + d_34_ - d_36_ * d_34_;
					}
					final double d_41_ = 2.0 * d_36_ - d_40_;
					double d_42_ = d + 0.3333333333333333;
					if (d_42_ > 1.0) {
						d_42_--;
					}
					final double d_43_ = d;
					double d_44_ = d - 0.3333333333333333;
					if (d_44_ < 0.0) {
						d_44_++;
					}
					if (6.0 * d_42_ < 1.0) {
						d_37_ = d_41_ + (d_40_ - d_41_) * 6.0 * d_42_;
					} else if (2.0 * d_42_ < 1.0) {
						d_37_ = d_40_;
					} else if (3.0 * d_42_ < 2.0) {
						d_37_ = d_41_ + (d_40_ - d_41_) * (0.6666666666666666 - d_42_) * 6.0;
					} else {
						d_37_ = d_41_;
					}
					if (6.0 * d_43_ < 1.0) {
						d_38_ = d_41_ + (d_40_ - d_41_) * 6.0 * d_43_;
					} else if (2.0 * d_43_ < 1.0) {
						d_38_ = d_40_;
					} else if (3.0 * d_43_ < 2.0) {
						d_38_ = d_41_ + (d_40_ - d_41_) * (0.6666666666666666 - d_43_) * 6.0;
					} else {
						d_38_ = d_41_;
					}
					if (6.0 * d_44_ < 1.0) {
						d_39_ = d_41_ + (d_40_ - d_41_) * 6.0 * d_44_;
					} else if (2.0 * d_44_ < 1.0) {
						d_39_ = d_40_;
					} else if (3.0 * d_44_ < 2.0) {
						d_39_ = d_41_ + (d_40_ - d_41_) * (0.6666666666666666 - d_44_) * 6.0;
					} else {
						d_39_ = d_41_;
					}
				}
				d_37_ = Math.pow(d_37_, aFloat968);
				d_38_ = Math.pow(d_38_, aFloat968);
				d_39_ = Math.pow(d_39_, aFloat968);
				final int i_45_ = (int) (d_37_ * 256.0);
				final int i_46_ = (int) (d_38_ * 256.0);
				final int i_47_ = (int) (d_39_ * 256.0);
				int i_48_ = (i_45_ << 16) + (i_46_ << 8) + i_47_;
				if (i_48_ == 0) {
					i_48_ = 1;
				}
				palette[i_32_++] = i_48_;
			}
		}
	}

	static final int method859() {
		return coordinateYLookup[0] / GraphicsLD.width;
	}

	private static final void calculateYLookupArray(final int i, final int i_49_, final int i_50_, final int i_51_) {
		anInt983 = i_50_ - i;
		endY = i_51_ - i_49_;
		method868();
		if (coordinateYLookup.length < endY) {
			coordinateYLookup = new int[Class120_Sub12_Sub17.getFarestBitValue(endY)];
		}
		int i_52_ = i_49_ * GraphicsLD.width + i;
		for (int i_53_ = 0; i_53_ < endY; i_53_++) {
			coordinateYLookup[i_53_] = i_52_;
			i_52_ += GraphicsLD.width;
		}
	}

	static final int method861() {
		return coordinateYLookup[0] % GraphicsLD.width;
	}

	static final void method862(int i, int i_54_, int i_55_, int i_56_, int i_57_, int i_58_, int i_59_, int i_60_, int i_61_, final int i_62_, int i_63_, int i_64_, final int i_65_, int i_66_, int i_67_, final int i_68_, int i_69_, int i_70_, final int i_71_) {
		final int[] is = anInterface5_973.method19(aFloat968, i_71_);
		if (is == null || alpha > 10) {
			final int i_72_ = anInterface5_973.method20(i_71_);
			aBoolean974 = true;
			method856(i, i_54_, i_55_, i_56_, i_57_, i_58_, method853(i_72_, i_59_), method853(i_72_, i_60_), method853(i_72_, i_61_));
		} else {
			aBoolean981 = anInterface5_973.method27(i_71_);
			aBoolean976 = anInterface5_973.method17(i_71_);
			final int i_73_ = i_57_ - i_56_;
			final int i_74_ = i_54_ - i;
			final int i_75_ = i_58_ - i_56_;
			final int i_76_ = i_55_ - i;
			final int i_77_ = i_60_ - i_59_;
			final int i_78_ = i_61_ - i_59_;
			int i_79_ = 0;
			if (i_54_ != i) {
				i_79_ = (i_57_ - i_56_ << 16) / (i_54_ - i);
			}
			int i_80_ = 0;
			if (i_55_ != i_54_) {
				i_80_ = (i_58_ - i_57_ << 16) / (i_55_ - i_54_);
			}
			int i_81_ = 0;
			if (i_55_ != i) {
				i_81_ = (i_56_ - i_58_ << 16) / (i - i_55_);
			}
			final int i_82_ = i_73_ * i_76_ - i_75_ * i_74_;
			if (i_82_ != 0) {
				final int i_83_ = (i_77_ * i_76_ - i_78_ * i_74_ << 9) / i_82_;
				final int i_84_ = (i_78_ * i_73_ - i_77_ * i_75_ << 9) / i_82_;
				i_63_ = i_62_ - i_63_;
				i_66_ = i_65_ - i_66_;
				i_69_ = i_68_ - i_69_;
				i_64_ -= i_62_;
				i_67_ -= i_65_;
				i_70_ -= i_68_;
				int i_85_ = i_64_ * i_65_ - i_67_ * i_62_ << 14;
				final int i_86_ = i_67_ * i_68_ - i_70_ * i_65_ << 8;
				final int i_87_ = i_70_ * i_62_ - i_64_ * i_68_ << 5;
				int i_88_ = i_63_ * i_65_ - i_66_ * i_62_ << 14;
				final int i_89_ = i_66_ * i_68_ - i_69_ * i_65_ << 8;
				final int i_90_ = i_69_ * i_62_ - i_63_ * i_68_ << 5;
				int i_91_ = i_66_ * i_64_ - i_63_ * i_67_ << 14;
				final int i_92_ = i_69_ * i_67_ - i_66_ * i_70_ << 8;
				final int i_93_ = i_63_ * i_70_ - i_69_ * i_64_ << 5;
				if (i <= i_54_ && i <= i_55_) {
					if (i < endY) {
						if (i_54_ > endY) {
							i_54_ = endY;
						}
						if (i_55_ > endY) {
							i_55_ = endY;
						}
						i_59_ = (i_59_ << 9) - i_83_ * i_56_ + i_83_;
						if (i_54_ < i_55_) {
							i_58_ = i_56_ <<= 16;
							if (i < 0) {
								i_58_ -= i_81_ * i;
								i_56_ -= i_79_ * i;
								i_59_ -= i_84_ * i;
								i = 0;
							}
							i_57_ <<= 16;
							if (i_54_ < 0) {
								i_57_ -= i_80_ * i_54_;
								i_54_ = 0;
							}
							final int i_94_ = i - anInt970;
							i_85_ += i_87_ * i_94_;
							i_88_ += i_90_ * i_94_;
							i_91_ += i_93_ * i_94_;
							if (i != i_54_ && i_81_ < i_79_ || i == i_54_ && i_81_ > i_80_) {
								i_55_ -= i_54_;
								i_54_ -= i;
								i = coordinateYLookup[i];
								while (--i_54_ >= 0) {
									method870(GraphicsLD.pixels, is, 0, 0, i, i_58_ >> 16, i_56_ >> 16, i_59_, i_83_, i_85_, i_88_, i_91_, i_86_, i_89_, i_92_);
									i_58_ += i_81_;
									i_56_ += i_79_;
									i_59_ += i_84_;
									i += GraphicsLD.width;
									i_85_ += i_87_;
									i_88_ += i_90_;
									i_91_ += i_93_;
								}
								while (--i_55_ >= 0) {
									method870(GraphicsLD.pixels, is, 0, 0, i, i_58_ >> 16, i_57_ >> 16, i_59_, i_83_, i_85_, i_88_, i_91_, i_86_, i_89_, i_92_);
									i_58_ += i_81_;
									i_57_ += i_80_;
									i_59_ += i_84_;
									i += GraphicsLD.width;
									i_85_ += i_87_;
									i_88_ += i_90_;
									i_91_ += i_93_;
								}
							} else {
								i_55_ -= i_54_;
								i_54_ -= i;
								i = coordinateYLookup[i];
								while (--i_54_ >= 0) {
									method870(GraphicsLD.pixels, is, 0, 0, i, i_56_ >> 16, i_58_ >> 16, i_59_, i_83_, i_85_, i_88_, i_91_, i_86_, i_89_, i_92_);
									i_58_ += i_81_;
									i_56_ += i_79_;
									i_59_ += i_84_;
									i += GraphicsLD.width;
									i_85_ += i_87_;
									i_88_ += i_90_;
									i_91_ += i_93_;
								}
								while (--i_55_ >= 0) {
									method870(GraphicsLD.pixels, is, 0, 0, i, i_57_ >> 16, i_58_ >> 16, i_59_, i_83_, i_85_, i_88_, i_91_, i_86_, i_89_, i_92_);
									i_58_ += i_81_;
									i_57_ += i_80_;
									i_59_ += i_84_;
									i += GraphicsLD.width;
									i_85_ += i_87_;
									i_88_ += i_90_;
									i_91_ += i_93_;
								}
							}
						} else {
							i_57_ = i_56_ <<= 16;
							if (i < 0) {
								i_57_ -= i_81_ * i;
								i_56_ -= i_79_ * i;
								i_59_ -= i_84_ * i;
								i = 0;
							}
							i_58_ <<= 16;
							if (i_55_ < 0) {
								i_58_ -= i_80_ * i_55_;
								i_55_ = 0;
							}
							final int i_95_ = i - anInt970;
							i_85_ += i_87_ * i_95_;
							i_88_ += i_90_ * i_95_;
							i_91_ += i_93_ * i_95_;
							if (i != i_55_ && i_81_ < i_79_ || i == i_55_ && i_80_ > i_79_) {
								i_54_ -= i_55_;
								i_55_ -= i;
								i = coordinateYLookup[i];
								while (--i_55_ >= 0) {
									method870(GraphicsLD.pixels, is, 0, 0, i, i_57_ >> 16, i_56_ >> 16, i_59_, i_83_, i_85_, i_88_, i_91_, i_86_, i_89_, i_92_);
									i_57_ += i_81_;
									i_56_ += i_79_;
									i_59_ += i_84_;
									i += GraphicsLD.width;
									i_85_ += i_87_;
									i_88_ += i_90_;
									i_91_ += i_93_;
								}
								while (--i_54_ >= 0) {
									method870(GraphicsLD.pixels, is, 0, 0, i, i_58_ >> 16, i_56_ >> 16, i_59_, i_83_, i_85_, i_88_, i_91_, i_86_, i_89_, i_92_);
									i_58_ += i_80_;
									i_56_ += i_79_;
									i_59_ += i_84_;
									i += GraphicsLD.width;
									i_85_ += i_87_;
									i_88_ += i_90_;
									i_91_ += i_93_;
								}
							} else {
								i_54_ -= i_55_;
								i_55_ -= i;
								i = coordinateYLookup[i];
								while (--i_55_ >= 0) {
									method870(GraphicsLD.pixels, is, 0, 0, i, i_56_ >> 16, i_57_ >> 16, i_59_, i_83_, i_85_, i_88_, i_91_, i_86_, i_89_, i_92_);
									i_57_ += i_81_;
									i_56_ += i_79_;
									i_59_ += i_84_;
									i += GraphicsLD.width;
									i_85_ += i_87_;
									i_88_ += i_90_;
									i_91_ += i_93_;
								}
								while (--i_54_ >= 0) {
									method870(GraphicsLD.pixels, is, 0, 0, i, i_56_ >> 16, i_58_ >> 16, i_59_, i_83_, i_85_, i_88_, i_91_, i_86_, i_89_, i_92_);
									i_58_ += i_80_;
									i_56_ += i_79_;
									i_59_ += i_84_;
									i += GraphicsLD.width;
									i_85_ += i_87_;
									i_88_ += i_90_;
									i_91_ += i_93_;
								}
							}
						}
					}
				} else if (i_54_ <= i_55_) {
					if (i_54_ < endY) {
						if (i_55_ > endY) {
							i_55_ = endY;
						}
						if (i > endY) {
							i = endY;
						}
						i_60_ = (i_60_ << 9) - i_83_ * i_57_ + i_83_;
						if (i_55_ < i) {
							i_56_ = i_57_ <<= 16;
							if (i_54_ < 0) {
								i_56_ -= i_79_ * i_54_;
								i_57_ -= i_80_ * i_54_;
								i_60_ -= i_84_ * i_54_;
								i_54_ = 0;
							}
							i_58_ <<= 16;
							if (i_55_ < 0) {
								i_58_ -= i_81_ * i_55_;
								i_55_ = 0;
							}
							final int i_96_ = i_54_ - anInt970;
							i_85_ += i_87_ * i_96_;
							i_88_ += i_90_ * i_96_;
							i_91_ += i_93_ * i_96_;
							if (i_54_ != i_55_ && i_79_ < i_80_ || i_54_ == i_55_ && i_79_ > i_81_) {
								i -= i_55_;
								i_55_ -= i_54_;
								i_54_ = coordinateYLookup[i_54_];
								while (--i_55_ >= 0) {
									method870(GraphicsLD.pixels, is, 0, 0, i_54_, i_56_ >> 16, i_57_ >> 16, i_60_, i_83_, i_85_, i_88_, i_91_, i_86_, i_89_, i_92_);
									i_56_ += i_79_;
									i_57_ += i_80_;
									i_60_ += i_84_;
									i_54_ += GraphicsLD.width;
									i_85_ += i_87_;
									i_88_ += i_90_;
									i_91_ += i_93_;
								}
								while (--i >= 0) {
									method870(GraphicsLD.pixels, is, 0, 0, i_54_, i_56_ >> 16, i_58_ >> 16, i_60_, i_83_, i_85_, i_88_, i_91_, i_86_, i_89_, i_92_);
									i_56_ += i_79_;
									i_58_ += i_81_;
									i_60_ += i_84_;
									i_54_ += GraphicsLD.width;
									i_85_ += i_87_;
									i_88_ += i_90_;
									i_91_ += i_93_;
								}
							} else {
								i -= i_55_;
								i_55_ -= i_54_;
								i_54_ = coordinateYLookup[i_54_];
								while (--i_55_ >= 0) {
									method870(GraphicsLD.pixels, is, 0, 0, i_54_, i_57_ >> 16, i_56_ >> 16, i_60_, i_83_, i_85_, i_88_, i_91_, i_86_, i_89_, i_92_);
									i_56_ += i_79_;
									i_57_ += i_80_;
									i_60_ += i_84_;
									i_54_ += GraphicsLD.width;
									i_85_ += i_87_;
									i_88_ += i_90_;
									i_91_ += i_93_;
								}
								while (--i >= 0) {
									method870(GraphicsLD.pixels, is, 0, 0, i_54_, i_58_ >> 16, i_56_ >> 16, i_60_, i_83_, i_85_, i_88_, i_91_, i_86_, i_89_, i_92_);
									i_56_ += i_79_;
									i_58_ += i_81_;
									i_60_ += i_84_;
									i_54_ += GraphicsLD.width;
									i_85_ += i_87_;
									i_88_ += i_90_;
									i_91_ += i_93_;
								}
							}
						} else {
							i_58_ = i_57_ <<= 16;
							if (i_54_ < 0) {
								i_58_ -= i_79_ * i_54_;
								i_57_ -= i_80_ * i_54_;
								i_60_ -= i_84_ * i_54_;
								i_54_ = 0;
							}
							i_56_ <<= 16;
							if (i < 0) {
								i_56_ -= i_81_ * i;
								i = 0;
							}
							final int i_97_ = i_54_ - anInt970;
							i_85_ += i_87_ * i_97_;
							i_88_ += i_90_ * i_97_;
							i_91_ += i_93_ * i_97_;
							if (i_79_ < i_80_) {
								i_55_ -= i;
								i -= i_54_;
								i_54_ = coordinateYLookup[i_54_];
								while (--i >= 0) {
									method870(GraphicsLD.pixels, is, 0, 0, i_54_, i_58_ >> 16, i_57_ >> 16, i_60_, i_83_, i_85_, i_88_, i_91_, i_86_, i_89_, i_92_);
									i_58_ += i_79_;
									i_57_ += i_80_;
									i_60_ += i_84_;
									i_54_ += GraphicsLD.width;
									i_85_ += i_87_;
									i_88_ += i_90_;
									i_91_ += i_93_;
								}
								while (--i_55_ >= 0) {
									method870(GraphicsLD.pixels, is, 0, 0, i_54_, i_56_ >> 16, i_57_ >> 16, i_60_, i_83_, i_85_, i_88_, i_91_, i_86_, i_89_, i_92_);
									i_56_ += i_81_;
									i_57_ += i_80_;
									i_60_ += i_84_;
									i_54_ += GraphicsLD.width;
									i_85_ += i_87_;
									i_88_ += i_90_;
									i_91_ += i_93_;
								}
							} else {
								i_55_ -= i;
								i -= i_54_;
								i_54_ = coordinateYLookup[i_54_];
								while (--i >= 0) {
									method870(GraphicsLD.pixels, is, 0, 0, i_54_, i_57_ >> 16, i_58_ >> 16, i_60_, i_83_, i_85_, i_88_, i_91_, i_86_, i_89_, i_92_);
									i_58_ += i_79_;
									i_57_ += i_80_;
									i_60_ += i_84_;
									i_54_ += GraphicsLD.width;
									i_85_ += i_87_;
									i_88_ += i_90_;
									i_91_ += i_93_;
								}
								while (--i_55_ >= 0) {
									method870(GraphicsLD.pixels, is, 0, 0, i_54_, i_57_ >> 16, i_56_ >> 16, i_60_, i_83_, i_85_, i_88_, i_91_, i_86_, i_89_, i_92_);
									i_56_ += i_81_;
									i_57_ += i_80_;
									i_60_ += i_84_;
									i_54_ += GraphicsLD.width;
									i_85_ += i_87_;
									i_88_ += i_90_;
									i_91_ += i_93_;
								}
							}
						}
					}
				} else if (i_55_ < endY) {
					if (i > endY) {
						i = endY;
					}
					if (i_54_ > endY) {
						i_54_ = endY;
					}
					i_61_ = (i_61_ << 9) - i_83_ * i_58_ + i_83_;
					if (i < i_54_) {
						i_57_ = i_58_ <<= 16;
						if (i_55_ < 0) {
							i_57_ -= i_80_ * i_55_;
							i_58_ -= i_81_ * i_55_;
							i_61_ -= i_84_ * i_55_;
							i_55_ = 0;
						}
						i_56_ <<= 16;
						if (i < 0) {
							i_56_ -= i_79_ * i;
							i = 0;
						}
						final int i_98_ = i_55_ - anInt970;
						i_85_ += i_87_ * i_98_;
						i_88_ += i_90_ * i_98_;
						i_91_ += i_93_ * i_98_;
						if (i_80_ < i_81_) {
							i_54_ -= i;
							i -= i_55_;
							i_55_ = coordinateYLookup[i_55_];
							while (--i >= 0) {
								method870(GraphicsLD.pixels, is, 0, 0, i_55_, i_57_ >> 16, i_58_ >> 16, i_61_, i_83_, i_85_, i_88_, i_91_, i_86_, i_89_, i_92_);
								i_57_ += i_80_;
								i_58_ += i_81_;
								i_61_ += i_84_;
								i_55_ += GraphicsLD.width;
								i_85_ += i_87_;
								i_88_ += i_90_;
								i_91_ += i_93_;
							}
							while (--i_54_ >= 0) {
								method870(GraphicsLD.pixels, is, 0, 0, i_55_, i_57_ >> 16, i_56_ >> 16, i_61_, i_83_, i_85_, i_88_, i_91_, i_86_, i_89_, i_92_);
								i_57_ += i_80_;
								i_56_ += i_79_;
								i_61_ += i_84_;
								i_55_ += GraphicsLD.width;
								i_85_ += i_87_;
								i_88_ += i_90_;
								i_91_ += i_93_;
							}
						} else {
							i_54_ -= i;
							i -= i_55_;
							i_55_ = coordinateYLookup[i_55_];
							while (--i >= 0) {
								method870(GraphicsLD.pixels, is, 0, 0, i_55_, i_58_ >> 16, i_57_ >> 16, i_61_, i_83_, i_85_, i_88_, i_91_, i_86_, i_89_, i_92_);
								i_57_ += i_80_;
								i_58_ += i_81_;
								i_61_ += i_84_;
								i_55_ += GraphicsLD.width;
								i_85_ += i_87_;
								i_88_ += i_90_;
								i_91_ += i_93_;
							}
							while (--i_54_ >= 0) {
								method870(GraphicsLD.pixels, is, 0, 0, i_55_, i_56_ >> 16, i_57_ >> 16, i_61_, i_83_, i_85_, i_88_, i_91_, i_86_, i_89_, i_92_);
								i_57_ += i_80_;
								i_56_ += i_79_;
								i_61_ += i_84_;
								i_55_ += GraphicsLD.width;
								i_85_ += i_87_;
								i_88_ += i_90_;
								i_91_ += i_93_;
							}
						}
					} else {
						i_56_ = i_58_ <<= 16;
						if (i_55_ < 0) {
							i_56_ -= i_80_ * i_55_;
							i_58_ -= i_81_ * i_55_;
							i_61_ -= i_84_ * i_55_;
							i_55_ = 0;
						}
						i_57_ <<= 16;
						if (i_54_ < 0) {
							i_57_ -= i_79_ * i_54_;
							i_54_ = 0;
						}
						final int i_99_ = i_55_ - anInt970;
						i_85_ += i_87_ * i_99_;
						i_88_ += i_90_ * i_99_;
						i_91_ += i_93_ * i_99_;
						if (i_80_ < i_81_) {
							i -= i_54_;
							i_54_ -= i_55_;
							i_55_ = coordinateYLookup[i_55_];
							while (--i_54_ >= 0) {
								method870(GraphicsLD.pixels, is, 0, 0, i_55_, i_56_ >> 16, i_58_ >> 16, i_61_, i_83_, i_85_, i_88_, i_91_, i_86_, i_89_, i_92_);
								i_56_ += i_80_;
								i_58_ += i_81_;
								i_61_ += i_84_;
								i_55_ += GraphicsLD.width;
								i_85_ += i_87_;
								i_88_ += i_90_;
								i_91_ += i_93_;
							}
							while (--i >= 0) {
								method870(GraphicsLD.pixels, is, 0, 0, i_55_, i_57_ >> 16, i_58_ >> 16, i_61_, i_83_, i_85_, i_88_, i_91_, i_86_, i_89_, i_92_);
								i_57_ += i_79_;
								i_58_ += i_81_;
								i_61_ += i_84_;
								i_55_ += GraphicsLD.width;
								i_85_ += i_87_;
								i_88_ += i_90_;
								i_91_ += i_93_;
							}
						} else {
							i -= i_54_;
							i_54_ -= i_55_;
							i_55_ = coordinateYLookup[i_55_];
							while (--i_54_ >= 0) {
								method870(GraphicsLD.pixels, is, 0, 0, i_55_, i_58_ >> 16, i_56_ >> 16, i_61_, i_83_, i_85_, i_88_, i_91_, i_86_, i_89_, i_92_);
								i_56_ += i_80_;
								i_58_ += i_81_;
								i_61_ += i_84_;
								i_55_ += GraphicsLD.width;
								i_85_ += i_87_;
								i_88_ += i_90_;
								i_91_ += i_93_;
							}
							while (--i >= 0) {
								method870(GraphicsLD.pixels, is, 0, 0, i_55_, i_58_ >> 16, i_57_ >> 16, i_61_, i_83_, i_85_, i_88_, i_91_, i_86_, i_89_, i_92_);
								i_57_ += i_79_;
								i_58_ += i_81_;
								i_61_ += i_84_;
								i_55_ += GraphicsLD.width;
								i_85_ += i_87_;
								i_88_ += i_90_;
								i_91_ += i_93_;
							}
						}
					}
				}
			}
		}
	}

	static final void method863(int i, int i_100_, int i_101_, int i_102_, int i_103_, int i_104_, final int i_105_) {
		int i_106_ = 0;
		if (i_100_ != i) {
			i_106_ = (i_103_ - i_102_ << 16) / (i_100_ - i);
		}
		int i_107_ = 0;
		if (i_101_ != i_100_) {
			i_107_ = (i_104_ - i_103_ << 16) / (i_101_ - i_100_);
		}
		int i_108_ = 0;
		if (i_101_ != i) {
			i_108_ = (i_102_ - i_104_ << 16) / (i - i_101_);
		}
		if (i <= i_100_ && i <= i_101_) {
			if (i < endY) {
				if (i_100_ > endY) {
					i_100_ = endY;
				}
				if (i_101_ > endY) {
					i_101_ = endY;
				}
				if (i_100_ < i_101_) {
					i_104_ = i_102_ <<= 16;
					if (i < 0) {
						i_104_ -= i_108_ * i;
						i_102_ -= i_106_ * i;
						i = 0;
					}
					i_103_ <<= 16;
					if (i_100_ < 0) {
						i_103_ -= i_107_ * i_100_;
						i_100_ = 0;
					}
					if (i != i_100_ && i_108_ < i_106_ || i == i_100_ && i_108_ > i_107_) {
						i_101_ -= i_100_;
						i_100_ -= i;
						i = coordinateYLookup[i];
						while (--i_100_ >= 0) {
							method857(GraphicsLD.pixels, i, i_105_, 0, i_104_ >> 16, i_102_ >> 16);
							i_104_ += i_108_;
							i_102_ += i_106_;
							i += GraphicsLD.width;
						}
						while (--i_101_ >= 0) {
							method857(GraphicsLD.pixels, i, i_105_, 0, i_104_ >> 16, i_103_ >> 16);
							i_104_ += i_108_;
							i_103_ += i_107_;
							i += GraphicsLD.width;
						}
					} else {
						i_101_ -= i_100_;
						i_100_ -= i;
						i = coordinateYLookup[i];
						while (--i_100_ >= 0) {
							method857(GraphicsLD.pixels, i, i_105_, 0, i_102_ >> 16, i_104_ >> 16);
							i_104_ += i_108_;
							i_102_ += i_106_;
							i += GraphicsLD.width;
						}
						while (--i_101_ >= 0) {
							method857(GraphicsLD.pixels, i, i_105_, 0, i_103_ >> 16, i_104_ >> 16);
							i_104_ += i_108_;
							i_103_ += i_107_;
							i += GraphicsLD.width;
						}
					}
				} else {
					i_103_ = i_102_ <<= 16;
					if (i < 0) {
						i_103_ -= i_108_ * i;
						i_102_ -= i_106_ * i;
						i = 0;
					}
					i_104_ <<= 16;
					if (i_101_ < 0) {
						i_104_ -= i_107_ * i_101_;
						i_101_ = 0;
					}
					if (i != i_101_ && i_108_ < i_106_ || i == i_101_ && i_107_ > i_106_) {
						i_100_ -= i_101_;
						i_101_ -= i;
						i = coordinateYLookup[i];
						while (--i_101_ >= 0) {
							method857(GraphicsLD.pixels, i, i_105_, 0, i_103_ >> 16, i_102_ >> 16);
							i_103_ += i_108_;
							i_102_ += i_106_;
							i += GraphicsLD.width;
						}
						while (--i_100_ >= 0) {
							method857(GraphicsLD.pixels, i, i_105_, 0, i_104_ >> 16, i_102_ >> 16);
							i_104_ += i_107_;
							i_102_ += i_106_;
							i += GraphicsLD.width;
						}
					} else {
						i_100_ -= i_101_;
						i_101_ -= i;
						i = coordinateYLookup[i];
						while (--i_101_ >= 0) {
							method857(GraphicsLD.pixels, i, i_105_, 0, i_102_ >> 16, i_103_ >> 16);
							i_103_ += i_108_;
							i_102_ += i_106_;
							i += GraphicsLD.width;
						}
						while (--i_100_ >= 0) {
							method857(GraphicsLD.pixels, i, i_105_, 0, i_102_ >> 16, i_104_ >> 16);
							i_104_ += i_107_;
							i_102_ += i_106_;
							i += GraphicsLD.width;
						}
					}
				}
			}
		} else if (i_100_ <= i_101_) {
			if (i_100_ < endY) {
				if (i_101_ > endY) {
					i_101_ = endY;
				}
				if (i > endY) {
					i = endY;
				}
				if (i_101_ < i) {
					i_102_ = i_103_ <<= 16;
					if (i_100_ < 0) {
						i_102_ -= i_106_ * i_100_;
						i_103_ -= i_107_ * i_100_;
						i_100_ = 0;
					}
					i_104_ <<= 16;
					if (i_101_ < 0) {
						i_104_ -= i_108_ * i_101_;
						i_101_ = 0;
					}
					if (i_100_ != i_101_ && i_106_ < i_107_ || i_100_ == i_101_ && i_106_ > i_108_) {
						i -= i_101_;
						i_101_ -= i_100_;
						i_100_ = coordinateYLookup[i_100_];
						while (--i_101_ >= 0) {
							method857(GraphicsLD.pixels, i_100_, i_105_, 0, i_102_ >> 16, i_103_ >> 16);
							i_102_ += i_106_;
							i_103_ += i_107_;
							i_100_ += GraphicsLD.width;
						}
						while (--i >= 0) {
							method857(GraphicsLD.pixels, i_100_, i_105_, 0, i_102_ >> 16, i_104_ >> 16);
							i_102_ += i_106_;
							i_104_ += i_108_;
							i_100_ += GraphicsLD.width;
						}
					} else {
						i -= i_101_;
						i_101_ -= i_100_;
						i_100_ = coordinateYLookup[i_100_];
						while (--i_101_ >= 0) {
							method857(GraphicsLD.pixels, i_100_, i_105_, 0, i_103_ >> 16, i_102_ >> 16);
							i_102_ += i_106_;
							i_103_ += i_107_;
							i_100_ += GraphicsLD.width;
						}
						while (--i >= 0) {
							method857(GraphicsLD.pixels, i_100_, i_105_, 0, i_104_ >> 16, i_102_ >> 16);
							i_102_ += i_106_;
							i_104_ += i_108_;
							i_100_ += GraphicsLD.width;
						}
					}
				} else {
					i_104_ = i_103_ <<= 16;
					if (i_100_ < 0) {
						i_104_ -= i_106_ * i_100_;
						i_103_ -= i_107_ * i_100_;
						i_100_ = 0;
					}
					i_102_ <<= 16;
					if (i < 0) {
						i_102_ -= i_108_ * i;
						i = 0;
					}
					if (i_106_ < i_107_) {
						i_101_ -= i;
						i -= i_100_;
						i_100_ = coordinateYLookup[i_100_];
						while (--i >= 0) {
							method857(GraphicsLD.pixels, i_100_, i_105_, 0, i_104_ >> 16, i_103_ >> 16);
							i_104_ += i_106_;
							i_103_ += i_107_;
							i_100_ += GraphicsLD.width;
						}
						while (--i_101_ >= 0) {
							method857(GraphicsLD.pixels, i_100_, i_105_, 0, i_102_ >> 16, i_103_ >> 16);
							i_102_ += i_108_;
							i_103_ += i_107_;
							i_100_ += GraphicsLD.width;
						}
					} else {
						i_101_ -= i;
						i -= i_100_;
						i_100_ = coordinateYLookup[i_100_];
						while (--i >= 0) {
							method857(GraphicsLD.pixels, i_100_, i_105_, 0, i_103_ >> 16, i_104_ >> 16);
							i_104_ += i_106_;
							i_103_ += i_107_;
							i_100_ += GraphicsLD.width;
						}
						while (--i_101_ >= 0) {
							method857(GraphicsLD.pixels, i_100_, i_105_, 0, i_103_ >> 16, i_102_ >> 16);
							i_102_ += i_108_;
							i_103_ += i_107_;
							i_100_ += GraphicsLD.width;
						}
					}
				}
			}
		} else if (i_101_ < endY) {
			if (i > endY) {
				i = endY;
			}
			if (i_100_ > endY) {
				i_100_ = endY;
			}
			if (i < i_100_) {
				i_103_ = i_104_ <<= 16;
				if (i_101_ < 0) {
					i_103_ -= i_107_ * i_101_;
					i_104_ -= i_108_ * i_101_;
					i_101_ = 0;
				}
				i_102_ <<= 16;
				if (i < 0) {
					i_102_ -= i_106_ * i;
					i = 0;
				}
				if (i_107_ < i_108_) {
					i_100_ -= i;
					i -= i_101_;
					i_101_ = coordinateYLookup[i_101_];
					while (--i >= 0) {
						method857(GraphicsLD.pixels, i_101_, i_105_, 0, i_103_ >> 16, i_104_ >> 16);
						i_103_ += i_107_;
						i_104_ += i_108_;
						i_101_ += GraphicsLD.width;
					}
					while (--i_100_ >= 0) {
						method857(GraphicsLD.pixels, i_101_, i_105_, 0, i_103_ >> 16, i_102_ >> 16);
						i_103_ += i_107_;
						i_102_ += i_106_;
						i_101_ += GraphicsLD.width;
					}
				} else {
					i_100_ -= i;
					i -= i_101_;
					i_101_ = coordinateYLookup[i_101_];
					while (--i >= 0) {
						method857(GraphicsLD.pixels, i_101_, i_105_, 0, i_104_ >> 16, i_103_ >> 16);
						i_103_ += i_107_;
						i_104_ += i_108_;
						i_101_ += GraphicsLD.width;
					}
					while (--i_100_ >= 0) {
						method857(GraphicsLD.pixels, i_101_, i_105_, 0, i_102_ >> 16, i_103_ >> 16);
						i_103_ += i_107_;
						i_102_ += i_106_;
						i_101_ += GraphicsLD.width;
					}
				}
			} else {
				i_102_ = i_104_ <<= 16;
				if (i_101_ < 0) {
					i_102_ -= i_107_ * i_101_;
					i_104_ -= i_108_ * i_101_;
					i_101_ = 0;
				}
				i_103_ <<= 16;
				if (i_100_ < 0) {
					i_103_ -= i_106_ * i_100_;
					i_100_ = 0;
				}
				if (i_107_ < i_108_) {
					i -= i_100_;
					i_100_ -= i_101_;
					i_101_ = coordinateYLookup[i_101_];
					while (--i_100_ >= 0) {
						method857(GraphicsLD.pixels, i_101_, i_105_, 0, i_102_ >> 16, i_104_ >> 16);
						i_102_ += i_107_;
						i_104_ += i_108_;
						i_101_ += GraphicsLD.width;
					}
					while (--i >= 0) {
						method857(GraphicsLD.pixels, i_101_, i_105_, 0, i_103_ >> 16, i_104_ >> 16);
						i_103_ += i_106_;
						i_104_ += i_108_;
						i_101_ += GraphicsLD.width;
					}
				} else {
					i -= i_100_;
					i_100_ -= i_101_;
					i_101_ = coordinateYLookup[i_101_];
					while (--i_100_ >= 0) {
						method857(GraphicsLD.pixels, i_101_, i_105_, 0, i_104_ >> 16, i_102_ >> 16);
						i_102_ += i_107_;
						i_104_ += i_108_;
						i_101_ += GraphicsLD.width;
					}
					while (--i >= 0) {
						method857(GraphicsLD.pixels, i_101_, i_105_, 0, i_104_ >> 16, i_103_ >> 16);
						i_103_ += i_106_;
						i_104_ += i_108_;
						i_101_ += GraphicsLD.width;
					}
				}
			}
		}
	}

	static final void method864(final Interface5 interface5) {
		anInterface5_973 = interface5;
	}

	static final void method865(final byte[] is, int i, int i_109_, int i_110_, int i_111_, int i_112_, int i_113_, final int i_114_) {
		int i_115_ = 0;
		if (i_109_ != i) {
			i_115_ = (i_112_ - i_111_ << 16) / (i_109_ - i);
		}
		int i_116_ = 0;
		if (i_110_ != i_109_) {
			i_116_ = (i_113_ - i_112_ << 16) / (i_110_ - i_109_);
		}
		int i_117_ = 0;
		if (i_110_ != i) {
			i_117_ = (i_111_ - i_113_ << 16) / (i - i_110_);
		}
		if (i <= i_109_ && i <= i_110_) {
			if (i_109_ < i_110_) {
				i_113_ = i_111_ <<= 16;
				if (i < 0) {
					i_113_ -= i_117_ * i;
					i_111_ -= i_115_ * i;
					i = 0;
				}
				i_112_ <<= 16;
				if (i_109_ < 0) {
					i_112_ -= i_116_ * i_109_;
					i_109_ = 0;
				}
				if (i != i_109_ && i_117_ < i_115_ || i == i_109_ && i_117_ > i_116_) {
					i_110_ -= i_109_;
					i_109_ -= i;
					i *= i_114_;
					while (--i_109_ >= 0) {
						method866(is, i, 0, i_113_ >> 16, i_111_ >> 16);
						i_113_ += i_117_;
						i_111_ += i_115_;
						i += i_114_;
					}
					while (--i_110_ >= 0) {
						method866(is, i, 0, i_113_ >> 16, i_112_ >> 16);
						i_113_ += i_117_;
						i_112_ += i_116_;
						i += i_114_;
					}
				} else {
					i_110_ -= i_109_;
					i_109_ -= i;
					i *= i_114_;
					while (--i_109_ >= 0) {
						method866(is, i, 0, i_111_ >> 16, i_113_ >> 16);
						i_113_ += i_117_;
						i_111_ += i_115_;
						i += i_114_;
					}
					while (--i_110_ >= 0) {
						method866(is, i, 0, i_112_ >> 16, i_113_ >> 16);
						i_113_ += i_117_;
						i_112_ += i_116_;
						i += i_114_;
					}
				}
			} else {
				i_112_ = i_111_ <<= 16;
				if (i < 0) {
					i_112_ -= i_117_ * i;
					i_111_ -= i_115_ * i;
					i = 0;
				}
				i_113_ <<= 16;
				if (i_110_ < 0) {
					i_113_ -= i_116_ * i_110_;
					i_110_ = 0;
				}
				if (i != i_110_ && i_117_ < i_115_ || i == i_110_ && i_116_ > i_115_) {
					i_109_ -= i_110_;
					i_110_ -= i;
					i *= i_114_;
					while (--i_110_ >= 0) {
						method866(is, i, 0, i_112_ >> 16, i_111_ >> 16);
						i_112_ += i_117_;
						i_111_ += i_115_;
						i += i_114_;
					}
					while (--i_109_ >= 0) {
						method866(is, i, 0, i_113_ >> 16, i_111_ >> 16);
						i_113_ += i_116_;
						i_111_ += i_115_;
						i += i_114_;
					}
				} else {
					i_109_ -= i_110_;
					i_110_ -= i;
					i *= i_114_;
					while (--i_110_ >= 0) {
						method866(is, i, 0, i_111_ >> 16, i_112_ >> 16);
						i_112_ += i_117_;
						i_111_ += i_115_;
						i += i_114_;
					}
					while (--i_109_ >= 0) {
						method866(is, i, 0, i_111_ >> 16, i_113_ >> 16);
						i_113_ += i_116_;
						i_111_ += i_115_;
						i += i_114_;
					}
				}
			}
		} else if (i_109_ <= i_110_) {
			if (i_110_ < i) {
				i_111_ = i_112_ <<= 16;
				if (i_109_ < 0) {
					i_111_ -= i_115_ * i_109_;
					i_112_ -= i_116_ * i_109_;
					i_109_ = 0;
				}
				i_113_ <<= 16;
				if (i_110_ < 0) {
					i_113_ -= i_117_ * i_110_;
					i_110_ = 0;
				}
				if (i_109_ != i_110_ && i_115_ < i_116_ || i_109_ == i_110_ && i_115_ > i_117_) {
					i -= i_110_;
					i_110_ -= i_109_;
					i_109_ *= i_114_;
					while (--i_110_ >= 0) {
						method866(is, i_109_, 0, i_111_ >> 16, i_112_ >> 16);
						i_111_ += i_115_;
						i_112_ += i_116_;
						i_109_ += i_114_;
					}
					while (--i >= 0) {
						method866(is, i_109_, 0, i_111_ >> 16, i_113_ >> 16);
						i_111_ += i_115_;
						i_113_ += i_117_;
						i_109_ += i_114_;
					}
				} else {
					i -= i_110_;
					i_110_ -= i_109_;
					i_109_ *= i_114_;
					while (--i_110_ >= 0) {
						method866(is, i_109_, 0, i_112_ >> 16, i_111_ >> 16);
						i_111_ += i_115_;
						i_112_ += i_116_;
						i_109_ += i_114_;
					}
					while (--i >= 0) {
						method866(is, i_109_, 0, i_113_ >> 16, i_111_ >> 16);
						i_111_ += i_115_;
						i_113_ += i_117_;
						i_109_ += i_114_;
					}
				}
			} else {
				i_113_ = i_112_ <<= 16;
				if (i_109_ < 0) {
					i_113_ -= i_115_ * i_109_;
					i_112_ -= i_116_ * i_109_;
					i_109_ = 0;
				}
				i_111_ <<= 16;
				if (i < 0) {
					i_111_ -= i_117_ * i;
					i = 0;
				}
				if (i_115_ < i_116_) {
					i_110_ -= i;
					i -= i_109_;
					i_109_ *= i_114_;
					while (--i >= 0) {
						method866(is, i_109_, 0, i_113_ >> 16, i_112_ >> 16);
						i_113_ += i_115_;
						i_112_ += i_116_;
						i_109_ += i_114_;
					}
					while (--i_110_ >= 0) {
						method866(is, i_109_, 0, i_111_ >> 16, i_112_ >> 16);
						i_111_ += i_117_;
						i_112_ += i_116_;
						i_109_ += i_114_;
					}
				} else {
					i_110_ -= i;
					i -= i_109_;
					i_109_ *= i_114_;
					while (--i >= 0) {
						method866(is, i_109_, 0, i_112_ >> 16, i_113_ >> 16);
						i_113_ += i_115_;
						i_112_ += i_116_;
						i_109_ += i_114_;
					}
					while (--i_110_ >= 0) {
						method866(is, i_109_, 0, i_112_ >> 16, i_111_ >> 16);
						i_111_ += i_117_;
						i_112_ += i_116_;
						i_109_ += i_114_;
					}
				}
			}
		} else if (i < i_109_) {
			i_112_ = i_113_ <<= 16;
			if (i_110_ < 0) {
				i_112_ -= i_116_ * i_110_;
				i_113_ -= i_117_ * i_110_;
				i_110_ = 0;
			}
			i_111_ <<= 16;
			if (i < 0) {
				i_111_ -= i_115_ * i;
				i = 0;
			}
			if (i_116_ < i_117_) {
				i_109_ -= i;
				i -= i_110_;
				i_110_ *= i_114_;
				while (--i >= 0) {
					method866(is, i_110_, 0, i_112_ >> 16, i_113_ >> 16);
					i_112_ += i_116_;
					i_113_ += i_117_;
					i_110_ += i_114_;
				}
				while (--i_109_ >= 0) {
					method866(is, i_110_, 0, i_112_ >> 16, i_111_ >> 16);
					i_112_ += i_116_;
					i_111_ += i_115_;
					i_110_ += i_114_;
				}
			} else {
				i_109_ -= i;
				i -= i_110_;
				i_110_ *= i_114_;
				while (--i >= 0) {
					method866(is, i_110_, 0, i_113_ >> 16, i_112_ >> 16);
					i_112_ += i_116_;
					i_113_ += i_117_;
					i_110_ += i_114_;
				}
				while (--i_109_ >= 0) {
					method866(is, i_110_, 0, i_111_ >> 16, i_112_ >> 16);
					i_112_ += i_116_;
					i_111_ += i_115_;
					i_110_ += i_114_;
				}
			}
		} else {
			i_111_ = i_113_ <<= 16;
			if (i_110_ < 0) {
				i_111_ -= i_116_ * i_110_;
				i_113_ -= i_117_ * i_110_;
				i_110_ = 0;
			}
			i_112_ <<= 16;
			if (i_109_ < 0) {
				i_112_ -= i_115_ * i_109_;
				i_109_ = 0;
			}
			if (i_116_ < i_117_) {
				i -= i_109_;
				i_109_ -= i_110_;
				i_110_ *= i_114_;
				while (--i_109_ >= 0) {
					method866(is, i_110_, 0, i_111_ >> 16, i_113_ >> 16);
					i_111_ += i_116_;
					i_113_ += i_117_;
					i_110_ += i_114_;
				}
				while (--i >= 0) {
					method866(is, i_110_, 0, i_112_ >> 16, i_113_ >> 16);
					i_112_ += i_115_;
					i_113_ += i_117_;
					i_110_ += i_114_;
				}
			} else {
				i -= i_109_;
				i_109_ -= i_110_;
				i_110_ *= i_114_;
				while (--i_109_ >= 0) {
					method866(is, i_110_, 0, i_113_ >> 16, i_111_ >> 16);
					i_111_ += i_116_;
					i_113_ += i_117_;
					i_110_ += i_114_;
				}
				while (--i >= 0) {
					method866(is, i_110_, 0, i_113_ >> 16, i_112_ >> 16);
					i_112_ += i_115_;
					i_113_ += i_117_;
					i_110_ += i_114_;
				}
			}
		}
	}

	private static final void method866(final byte[] is, int i, int i_118_, final int i_119_, final int i_120_) {
		if (i_119_ < i_120_) {
			i += i_119_;
			i_118_ = i_120_ - i_119_ >> 2;
			while (--i_118_ >= 0) {
				is[i++] = (byte) 1;
				is[i++] = (byte) 1;
				is[i++] = (byte) 1;
				is[i++] = (byte) 1;
			}
			i_118_ = i_120_ - i_119_ & 0x3;
			while (--i_118_ >= 0) {
				is[i++] = (byte) 1;
			}
		}
	}

	private static final void method867(final int[] is, int i, int i_121_, int i_122_, int i_123_, int i_124_, int i_125_, int i_126_) {
		if (aBoolean972) {
			if (i_124_ > anInt983) {
				i_124_ = anInt983;
			}
			if (i_123_ < 0) {
				i_123_ = 0;
			}
		}
		if (i_123_ < i_124_) {
			i += i_123_;
			i_125_ += i_126_ * i_123_;
			if (aBoolean971) {
				i_122_ = i_124_ - i_123_ >> 2;
				i_126_ <<= 2;
				if (alpha == 0) {
					if (i_122_ > 0) {
						do {
							i_121_ = palette[i_125_ >> 8];
							i_125_ += i_126_;
							is[i++] = i_121_;
							is[i++] = i_121_;
							is[i++] = i_121_;
							is[i++] = i_121_;
						} while (--i_122_ > 0);
					}
					i_122_ = i_124_ - i_123_ & 0x3;
					if (i_122_ > 0) {
						i_121_ = palette[i_125_ >> 8];
						do {
							is[i++] = i_121_;
						} while (--i_122_ > 0);
					}
				} else {
					final int i_127_ = alpha;
					final int i_128_ = 256 - alpha;
					if (i_122_ > 0) {
						do {
							i_121_ = palette[i_125_ >> 8];
							i_125_ += i_126_;
							i_121_ = ((i_121_ & 0xff00ff) * i_128_ >> 8 & 0xff00ff) + ((i_121_ & 0xff00) * i_128_ >> 8 & 0xff00);
							int i_129_ = is[i];
							is[i++] = i_121_ + ((i_129_ & 0xff00ff) * i_127_ >> 8 & 0xff00ff) + ((i_129_ & 0xff00) * i_127_ >> 8 & 0xff00);
							i_129_ = is[i];
							is[i++] = i_121_ + ((i_129_ & 0xff00ff) * i_127_ >> 8 & 0xff00ff) + ((i_129_ & 0xff00) * i_127_ >> 8 & 0xff00);
							i_129_ = is[i];
							is[i++] = i_121_ + ((i_129_ & 0xff00ff) * i_127_ >> 8 & 0xff00ff) + ((i_129_ & 0xff00) * i_127_ >> 8 & 0xff00);
							i_129_ = is[i];
							is[i++] = i_121_ + ((i_129_ & 0xff00ff) * i_127_ >> 8 & 0xff00ff) + ((i_129_ & 0xff00) * i_127_ >> 8 & 0xff00);
						} while (--i_122_ > 0);
					}
					i_122_ = i_124_ - i_123_ & 0x3;
					if (i_122_ > 0) {
						i_121_ = palette[i_125_ >> 8];
						i_121_ = ((i_121_ & 0xff00ff) * i_128_ >> 8 & 0xff00ff) + ((i_121_ & 0xff00) * i_128_ >> 8 & 0xff00);
						do {
							final int i_130_ = is[i];
							is[i++] = i_121_ + ((i_130_ & 0xff00ff) * i_127_ >> 8 & 0xff00ff) + ((i_130_ & 0xff00) * i_127_ >> 8 & 0xff00);
						} while (--i_122_ > 0);
					}
				}
			} else {
				i_122_ = i_124_ - i_123_;
				if (alpha == 0) {
					do {
						is[i++] = palette[i_125_ >> 8];
						i_125_ += i_126_;
					} while (--i_122_ > 0);
				} else {
					final int i_131_ = alpha;
					final int i_132_ = 256 - alpha;
					do {
						i_121_ = palette[i_125_ >> 8];
						i_125_ += i_126_;
						i_121_ = ((i_121_ & 0xff00ff) * i_132_ >> 8 & 0xff00ff) + ((i_121_ & 0xff00) * i_132_ >> 8 & 0xff00);
						final int i_133_ = is[i];
						is[i++] = i_121_ + ((i_133_ & 0xff00ff) * i_131_ >> 8 & 0xff00ff) + ((i_133_ & 0xff00) * i_131_ >> 8 & 0xff00);
					} while (--i_122_ > 0);
				}
			}
		}
	}

	static final void method868() {
		anInt967 = anInt983 / 2;
		anInt970 = endY / 2;
		IntegerNode.anInt2792 = -anInt967;
		Class120_Sub12_Sub16.anInt3253 = anInt983 - anInt967;
		Class190.anInt2100 = -anInt970;
		Class120_Sub30_Sub1.anInt3672 = endY - anInt970;
	}

	static final void method869(final int i, final int i_134_) {
		final int i_135_ = coordinateYLookup[0];
		final int i_136_ = i_135_ / GraphicsLD.width;
		final int i_137_ = i_135_ - i_136_ * GraphicsLD.width;
		anInt967 = i - i_137_;
		anInt970 = i_134_ - i_136_;
		IntegerNode.anInt2792 = -anInt967;
		Class120_Sub12_Sub16.anInt3253 = anInt983 - anInt967;
		Class190.anInt2100 = -anInt970;
		Class120_Sub30_Sub1.anInt3672 = endY - anInt970;
	}

	private static final void method870(final int[] is, final int[] is_138_, int i, int i_139_, int i_140_, int i_141_, int i_142_, int i_143_, int i_144_, int i_145_, int i_146_, int i_147_, final int i_148_, final int i_149_, final int i_150_) {
		if (aBoolean972) {
			if (i_142_ > anInt983) {
				i_142_ = anInt983;
			}
			if (i_141_ < 0) {
				i_141_ = 0;
			}
		}
		if (i_141_ < i_142_) {
			i_140_ += i_141_;
			i_143_ += i_144_ * i_141_;
			int i_151_ = i_142_ - i_141_;
			if (aBoolean981) {
				final int i_152_ = i_141_ - anInt967;
				i_145_ += (i_148_ >> 3) * i_152_;
				i_146_ += (i_149_ >> 3) * i_152_;
				i_147_ += (i_150_ >> 3) * i_152_;
				int i_153_ = i_147_ >> 12;
				int i_154_;
				int i_155_;
				if (i_153_ != 0) {
					i_154_ = i_145_ / i_153_;
					i_155_ = i_146_ / i_153_;
				} else {
					i_154_ = 0;
					i_155_ = 0;
				}
				i_145_ += i_148_;
				i_146_ += i_149_;
				i_147_ += i_150_;
				i_153_ = i_147_ >> 12;
				int i_156_;
				int i_157_;
				if (i_153_ != 0) {
					i_156_ = i_145_ / i_153_;
					i_157_ = i_146_ / i_153_;
				} else {
					i_156_ = 0;
					i_157_ = 0;
				}
				i = (i_154_ << 20) + i_155_;
				int i_158_ = (i_156_ - i_154_ >> 3 << 20) + (i_157_ - i_155_ >> 3);
				i_151_ >>= 3;
				i_144_ <<= 3;
				int i_159_ = i_143_ >> 8;
				if (aBoolean976) {
					if (i_151_ > 0) {
						do {
							i_139_ = is_138_[(i & 0xfc0) + (i >>> 26)];
							is[i_140_++] = ((i_139_ & 0xff00ff) * i_159_ & ~0xff00ff) + ((i_139_ & 0xff00) * i_159_ & 0xff0000) >> 8;
							i += i_158_;
							i_139_ = is_138_[(i & 0xfc0) + (i >>> 26)];
							is[i_140_++] = ((i_139_ & 0xff00ff) * i_159_ & ~0xff00ff) + ((i_139_ & 0xff00) * i_159_ & 0xff0000) >> 8;
							i += i_158_;
							i_139_ = is_138_[(i & 0xfc0) + (i >>> 26)];
							is[i_140_++] = ((i_139_ & 0xff00ff) * i_159_ & ~0xff00ff) + ((i_139_ & 0xff00) * i_159_ & 0xff0000) >> 8;
							i += i_158_;
							i_139_ = is_138_[(i & 0xfc0) + (i >>> 26)];
							is[i_140_++] = ((i_139_ & 0xff00ff) * i_159_ & ~0xff00ff) + ((i_139_ & 0xff00) * i_159_ & 0xff0000) >> 8;
							i += i_158_;
							i_139_ = is_138_[(i & 0xfc0) + (i >>> 26)];
							is[i_140_++] = ((i_139_ & 0xff00ff) * i_159_ & ~0xff00ff) + ((i_139_ & 0xff00) * i_159_ & 0xff0000) >> 8;
							i += i_158_;
							i_139_ = is_138_[(i & 0xfc0) + (i >>> 26)];
							is[i_140_++] = ((i_139_ & 0xff00ff) * i_159_ & ~0xff00ff) + ((i_139_ & 0xff00) * i_159_ & 0xff0000) >> 8;
							i += i_158_;
							i_139_ = is_138_[(i & 0xfc0) + (i >>> 26)];
							is[i_140_++] = ((i_139_ & 0xff00ff) * i_159_ & ~0xff00ff) + ((i_139_ & 0xff00) * i_159_ & 0xff0000) >> 8;
							i += i_158_;
							i_139_ = is_138_[(i & 0xfc0) + (i >>> 26)];
							is[i_140_++] = ((i_139_ & 0xff00ff) * i_159_ & ~0xff00ff) + ((i_139_ & 0xff00) * i_159_ & 0xff0000) >> 8;
							i += i_158_;
							i_154_ = i_156_;
							i_155_ = i_157_;
							i_145_ += i_148_;
							i_146_ += i_149_;
							i_147_ += i_150_;
							i_153_ = i_147_ >> 12;
							if (i_153_ != 0) {
								i_156_ = i_145_ / i_153_;
								i_157_ = i_146_ / i_153_;
							} else {
								i_156_ = 0;
								i_157_ = 0;
							}
							i = (i_154_ << 20) + i_155_;
							i_158_ = (i_156_ - i_154_ >> 3 << 20) + (i_157_ - i_155_ >> 3);
							i_143_ += i_144_;
							i_159_ = i_143_ >> 8;
						} while (--i_151_ > 0);
					}
					i_151_ = i_142_ - i_141_ & 0x7;
					if (i_151_ > 0) {
						do {
							i_139_ = is_138_[(i & 0xfc0) + (i >>> 26)];
							is[i_140_++] = ((i_139_ & 0xff00ff) * i_159_ & ~0xff00ff) + ((i_139_ & 0xff00) * i_159_ & 0xff0000) >> 8;
							i += i_158_;
						} while (--i_151_ > 0);
					}
				} else {
					if (i_151_ > 0) {
						do {
							if ((i_139_ = is_138_[(i & 0xfc0) + (i >>> 26)]) != 0) {
								is[i_140_] = ((i_139_ & 0xff00ff) * i_159_ & ~0xff00ff) + ((i_139_ & 0xff00) * i_159_ & 0xff0000) >> 8;
							}
							i_140_++;
							i += i_158_;
							if ((i_139_ = is_138_[(i & 0xfc0) + (i >>> 26)]) != 0) {
								is[i_140_] = ((i_139_ & 0xff00ff) * i_159_ & ~0xff00ff) + ((i_139_ & 0xff00) * i_159_ & 0xff0000) >> 8;
							}
							i_140_++;
							i += i_158_;
							if ((i_139_ = is_138_[(i & 0xfc0) + (i >>> 26)]) != 0) {
								is[i_140_] = ((i_139_ & 0xff00ff) * i_159_ & ~0xff00ff) + ((i_139_ & 0xff00) * i_159_ & 0xff0000) >> 8;
							}
							i_140_++;
							i += i_158_;
							if ((i_139_ = is_138_[(i & 0xfc0) + (i >>> 26)]) != 0) {
								is[i_140_] = ((i_139_ & 0xff00ff) * i_159_ & ~0xff00ff) + ((i_139_ & 0xff00) * i_159_ & 0xff0000) >> 8;
							}
							i_140_++;
							i += i_158_;
							if ((i_139_ = is_138_[(i & 0xfc0) + (i >>> 26)]) != 0) {
								is[i_140_] = ((i_139_ & 0xff00ff) * i_159_ & ~0xff00ff) + ((i_139_ & 0xff00) * i_159_ & 0xff0000) >> 8;
							}
							i_140_++;
							i += i_158_;
							if ((i_139_ = is_138_[(i & 0xfc0) + (i >>> 26)]) != 0) {
								is[i_140_] = ((i_139_ & 0xff00ff) * i_159_ & ~0xff00ff) + ((i_139_ & 0xff00) * i_159_ & 0xff0000) >> 8;
							}
							i_140_++;
							i += i_158_;
							if ((i_139_ = is_138_[(i & 0xfc0) + (i >>> 26)]) != 0) {
								is[i_140_] = ((i_139_ & 0xff00ff) * i_159_ & ~0xff00ff) + ((i_139_ & 0xff00) * i_159_ & 0xff0000) >> 8;
							}
							i_140_++;
							i += i_158_;
							if ((i_139_ = is_138_[(i & 0xfc0) + (i >>> 26)]) != 0) {
								is[i_140_] = ((i_139_ & 0xff00ff) * i_159_ & ~0xff00ff) + ((i_139_ & 0xff00) * i_159_ & 0xff0000) >> 8;
							}
							i_140_++;
							i += i_158_;
							i_154_ = i_156_;
							i_155_ = i_157_;
							i_145_ += i_148_;
							i_146_ += i_149_;
							i_147_ += i_150_;
							i_153_ = i_147_ >> 12;
							if (i_153_ != 0) {
								i_156_ = i_145_ / i_153_;
								i_157_ = i_146_ / i_153_;
							} else {
								i_156_ = 0;
								i_157_ = 0;
							}
							i = (i_154_ << 20) + i_155_;
							i_158_ = (i_156_ - i_154_ >> 3 << 20) + (i_157_ - i_155_ >> 3);
							i_143_ += i_144_;
							i_159_ = i_143_ >> 8;
						} while (--i_151_ > 0);
					}
					i_151_ = i_142_ - i_141_ & 0x7;
					if (i_151_ > 0) {
						do {
							if ((i_139_ = is_138_[(i & 0xfc0) + (i >>> 26)]) != 0) {
								is[i_140_] = ((i_139_ & 0xff00ff) * i_159_ & ~0xff00ff) + ((i_139_ & 0xff00) * i_159_ & 0xff0000) >> 8;
							}
							i_140_++;
							i += i_158_;
						} while (--i_151_ > 0);
					}
				}
			} else {
				final int i_160_ = i_141_ - anInt967;
				i_145_ += (i_148_ >> 3) * i_160_;
				i_146_ += (i_149_ >> 3) * i_160_;
				i_147_ += (i_150_ >> 3) * i_160_;
				int i_161_ = i_147_ >> 14;
				int i_162_;
				int i_163_;
				if (i_161_ != 0) {
					i_162_ = i_145_ / i_161_;
					i_163_ = i_146_ / i_161_;
				} else {
					i_162_ = 0;
					i_163_ = 0;
				}
				i_145_ += i_148_;
				i_146_ += i_149_;
				i_147_ += i_150_;
				i_161_ = i_147_ >> 14;
				int i_164_;
				int i_165_;
				if (i_161_ != 0) {
					i_164_ = i_145_ / i_161_;
					i_165_ = i_146_ / i_161_;
				} else {
					i_164_ = 0;
					i_165_ = 0;
				}
				i = (i_162_ << 18) + i_163_;
				int i_166_ = (i_164_ - i_162_ >> 3 << 18) + (i_165_ - i_163_ >> 3);
				i_151_ >>= 3;
				i_144_ <<= 3;
				int i_167_ = i_143_ >> 8;
				if (aBoolean976) {
					if (i_151_ > 0) {
						do {
							i_139_ = is_138_[(i & 0x3f80) + (i >>> 25)];
							is[i_140_++] = ((i_139_ & 0xff00ff) * i_167_ & ~0xff00ff) + ((i_139_ & 0xff00) * i_167_ & 0xff0000) >> 8;
							i += i_166_;
							i_139_ = is_138_[(i & 0x3f80) + (i >>> 25)];
							is[i_140_++] = ((i_139_ & 0xff00ff) * i_167_ & ~0xff00ff) + ((i_139_ & 0xff00) * i_167_ & 0xff0000) >> 8;
							i += i_166_;
							i_139_ = is_138_[(i & 0x3f80) + (i >>> 25)];
							is[i_140_++] = ((i_139_ & 0xff00ff) * i_167_ & ~0xff00ff) + ((i_139_ & 0xff00) * i_167_ & 0xff0000) >> 8;
							i += i_166_;
							i_139_ = is_138_[(i & 0x3f80) + (i >>> 25)];
							is[i_140_++] = ((i_139_ & 0xff00ff) * i_167_ & ~0xff00ff) + ((i_139_ & 0xff00) * i_167_ & 0xff0000) >> 8;
							i += i_166_;
							i_139_ = is_138_[(i & 0x3f80) + (i >>> 25)];
							is[i_140_++] = ((i_139_ & 0xff00ff) * i_167_ & ~0xff00ff) + ((i_139_ & 0xff00) * i_167_ & 0xff0000) >> 8;
							i += i_166_;
							i_139_ = is_138_[(i & 0x3f80) + (i >>> 25)];
							is[i_140_++] = ((i_139_ & 0xff00ff) * i_167_ & ~0xff00ff) + ((i_139_ & 0xff00) * i_167_ & 0xff0000) >> 8;
							i += i_166_;
							i_139_ = is_138_[(i & 0x3f80) + (i >>> 25)];
							is[i_140_++] = ((i_139_ & 0xff00ff) * i_167_ & ~0xff00ff) + ((i_139_ & 0xff00) * i_167_ & 0xff0000) >> 8;
							i += i_166_;
							i_139_ = is_138_[(i & 0x3f80) + (i >>> 25)];
							is[i_140_++] = ((i_139_ & 0xff00ff) * i_167_ & ~0xff00ff) + ((i_139_ & 0xff00) * i_167_ & 0xff0000) >> 8;
							i += i_166_;
							i_162_ = i_164_;
							i_163_ = i_165_;
							i_145_ += i_148_;
							i_146_ += i_149_;
							i_147_ += i_150_;
							i_161_ = i_147_ >> 14;
							if (i_161_ != 0) {
								i_164_ = i_145_ / i_161_;
								i_165_ = i_146_ / i_161_;
							} else {
								i_164_ = 0;
								i_165_ = 0;
							}
							i = (i_162_ << 18) + i_163_;
							i_166_ = (i_164_ - i_162_ >> 3 << 18) + (i_165_ - i_163_ >> 3);
							i_143_ += i_144_;
							i_167_ = i_143_ >> 8;
						} while (--i_151_ > 0);
					}
					i_151_ = i_142_ - i_141_ & 0x7;
					if (i_151_ > 0) {
						do {
							i_139_ = is_138_[(i & 0x3f80) + (i >>> 25)];
							is[i_140_++] = ((i_139_ & 0xff00ff) * i_167_ & ~0xff00ff) + ((i_139_ & 0xff00) * i_167_ & 0xff0000) >> 8;
							i += i_166_;
						} while (--i_151_ > 0);
					}
				} else {
					if (i_151_ > 0) {
						do {
							if ((i_139_ = is_138_[(i & 0x3f80) + (i >>> 25)]) != 0) {
								is[i_140_] = ((i_139_ & 0xff00ff) * i_167_ & ~0xff00ff) + ((i_139_ & 0xff00) * i_167_ & 0xff0000) >> 8;
							}
							i_140_++;
							i += i_166_;
							if ((i_139_ = is_138_[(i & 0x3f80) + (i >>> 25)]) != 0) {
								is[i_140_] = ((i_139_ & 0xff00ff) * i_167_ & ~0xff00ff) + ((i_139_ & 0xff00) * i_167_ & 0xff0000) >> 8;
							}
							i_140_++;
							i += i_166_;
							if ((i_139_ = is_138_[(i & 0x3f80) + (i >>> 25)]) != 0) {
								is[i_140_] = ((i_139_ & 0xff00ff) * i_167_ & ~0xff00ff) + ((i_139_ & 0xff00) * i_167_ & 0xff0000) >> 8;
							}
							i_140_++;
							i += i_166_;
							if ((i_139_ = is_138_[(i & 0x3f80) + (i >>> 25)]) != 0) {
								is[i_140_] = ((i_139_ & 0xff00ff) * i_167_ & ~0xff00ff) + ((i_139_ & 0xff00) * i_167_ & 0xff0000) >> 8;
							}
							i_140_++;
							i += i_166_;
							if ((i_139_ = is_138_[(i & 0x3f80) + (i >>> 25)]) != 0) {
								is[i_140_] = ((i_139_ & 0xff00ff) * i_167_ & ~0xff00ff) + ((i_139_ & 0xff00) * i_167_ & 0xff0000) >> 8;
							}
							i_140_++;
							i += i_166_;
							if ((i_139_ = is_138_[(i & 0x3f80) + (i >>> 25)]) != 0) {
								is[i_140_] = ((i_139_ & 0xff00ff) * i_167_ & ~0xff00ff) + ((i_139_ & 0xff00) * i_167_ & 0xff0000) >> 8;
							}
							i_140_++;
							i += i_166_;
							if ((i_139_ = is_138_[(i & 0x3f80) + (i >>> 25)]) != 0) {
								is[i_140_] = ((i_139_ & 0xff00ff) * i_167_ & ~0xff00ff) + ((i_139_ & 0xff00) * i_167_ & 0xff0000) >> 8;
							}
							i_140_++;
							i += i_166_;
							if ((i_139_ = is_138_[(i & 0x3f80) + (i >>> 25)]) != 0) {
								is[i_140_] = ((i_139_ & 0xff00ff) * i_167_ & ~0xff00ff) + ((i_139_ & 0xff00) * i_167_ & 0xff0000) >> 8;
							}
							i_140_++;
							i += i_166_;
							i_162_ = i_164_;
							i_163_ = i_165_;
							i_145_ += i_148_;
							i_146_ += i_149_;
							i_147_ += i_150_;
							i_161_ = i_147_ >> 14;
							if (i_161_ != 0) {
								i_164_ = i_145_ / i_161_;
								i_165_ = i_146_ / i_161_;
							} else {
								i_164_ = 0;
								i_165_ = 0;
							}
							i = (i_162_ << 18) + i_163_;
							i_166_ = (i_164_ - i_162_ >> 3 << 18) + (i_165_ - i_163_ >> 3);
							i_143_ += i_144_;
							i_167_ = i_143_ >> 8;
						} while (--i_151_ > 0);
					}
					i_151_ = i_142_ - i_141_ & 0x7;
					if (i_151_ > 0) {
						do {
							if ((i_139_ = is_138_[(i & 0x3f80) + (i >>> 25)]) != 0) {
								is[i_140_] = ((i_139_ & 0xff00ff) * i_167_ & ~0xff00ff) + ((i_139_ & 0xff00) * i_167_ & 0xff0000) >> 8;
							}
							i_140_++;
							i += i_166_;
						} while (--i_151_ > 0);
					}
				}
			}
		}
	}

	static final void method871(int i, int i_168_, int i_169_, int i_170_, int i_171_, int i_172_, int i_173_, int i_174_, int i_175_, final int i_176_, int i_177_, int i_178_, final int i_179_, int i_180_, int i_181_, final int i_182_, int i_183_, int i_184_, final int i_185_) {
		final int[] is = anInterface5_973.method19(aFloat968, i_185_);
		if (is == null) {
			final int i_186_ = anInterface5_973.method20(i_185_);
			method856(i, i_168_, i_169_, i_170_, i_171_, i_172_, method853(i_186_, i_173_), method853(i_186_, i_174_), method853(i_186_, i_175_));
		} else {
			aBoolean981 = anInterface5_973.method27(i_185_);
			aBoolean976 = anInterface5_973.method17(i_185_);
			final int i_187_ = i_171_ - i_170_;
			final int i_188_ = i_168_ - i;
			final int i_189_ = i_172_ - i_170_;
			final int i_190_ = i_169_ - i;
			final int i_191_ = i_174_ - i_173_;
			final int i_192_ = i_175_ - i_173_;
			int i_193_ = 0;
			if (i_168_ != i) {
				i_193_ = (i_171_ - i_170_ << 16) / (i_168_ - i);
			}
			int i_194_ = 0;
			if (i_169_ != i_168_) {
				i_194_ = (i_172_ - i_171_ << 16) / (i_169_ - i_168_);
			}
			int i_195_ = 0;
			if (i_169_ != i) {
				i_195_ = (i_170_ - i_172_ << 16) / (i - i_169_);
			}
			final int i_196_ = i_187_ * i_190_ - i_189_ * i_188_;
			if (i_196_ != 0) {
				final int i_197_ = (i_191_ * i_190_ - i_192_ * i_188_ << 9) / i_196_;
				final int i_198_ = (i_192_ * i_187_ - i_191_ * i_189_ << 9) / i_196_;
				i_177_ = i_176_ - i_177_;
				i_180_ = i_179_ - i_180_;
				i_183_ = i_182_ - i_183_;
				i_178_ -= i_176_;
				i_181_ -= i_179_;
				i_184_ -= i_182_;
				int i_199_ = i_178_ * i_179_ - i_181_ * i_176_ << 14;
				final int i_200_ = i_181_ * i_182_ - i_184_ * i_179_ << 5;
				final int i_201_ = i_184_ * i_176_ - i_178_ * i_182_ << 5;
				int i_202_ = i_177_ * i_179_ - i_180_ * i_176_ << 14;
				final int i_203_ = i_180_ * i_182_ - i_183_ * i_179_ << 5;
				final int i_204_ = i_183_ * i_176_ - i_177_ * i_182_ << 5;
				int i_205_ = i_180_ * i_178_ - i_177_ * i_181_ << 14;
				final int i_206_ = i_183_ * i_181_ - i_180_ * i_184_ << 5;
				final int i_207_ = i_177_ * i_184_ - i_183_ * i_178_ << 5;
				if (i <= i_168_ && i <= i_169_) {
					if (i < endY) {
						if (i_168_ > endY) {
							i_168_ = endY;
						}
						if (i_169_ > endY) {
							i_169_ = endY;
						}
						i_173_ = (i_173_ << 9) - i_197_ * i_170_ + i_197_;
						if (i_168_ < i_169_) {
							i_172_ = i_170_ <<= 16;
							if (i < 0) {
								i_172_ -= i_195_ * i;
								i_170_ -= i_193_ * i;
								i_173_ -= i_198_ * i;
								i = 0;
							}
							i_171_ <<= 16;
							if (i_168_ < 0) {
								i_171_ -= i_194_ * i_168_;
								i_168_ = 0;
							}
							final int i_208_ = i - anInt970;
							i_199_ += i_201_ * i_208_;
							i_202_ += i_204_ * i_208_;
							i_205_ += i_207_ * i_208_;
							if (i != i_168_ && i_195_ < i_193_ || i == i_168_ && i_195_ > i_194_) {
								i_169_ -= i_168_;
								i_168_ -= i;
								i = coordinateYLookup[i];
								while (--i_168_ >= 0) {
									method873(GraphicsLD.pixels, is, 0, 0, i, i_172_ >> 16, i_170_ >> 16, i_173_, i_197_, i_199_, i_202_, i_205_, i_200_, i_203_, i_206_);
									i_172_ += i_195_;
									i_170_ += i_193_;
									i_173_ += i_198_;
									i += GraphicsLD.width;
									i_199_ += i_201_;
									i_202_ += i_204_;
									i_205_ += i_207_;
								}
								while (--i_169_ >= 0) {
									method873(GraphicsLD.pixels, is, 0, 0, i, i_172_ >> 16, i_171_ >> 16, i_173_, i_197_, i_199_, i_202_, i_205_, i_200_, i_203_, i_206_);
									i_172_ += i_195_;
									i_171_ += i_194_;
									i_173_ += i_198_;
									i += GraphicsLD.width;
									i_199_ += i_201_;
									i_202_ += i_204_;
									i_205_ += i_207_;
								}
							} else {
								i_169_ -= i_168_;
								i_168_ -= i;
								i = coordinateYLookup[i];
								while (--i_168_ >= 0) {
									method873(GraphicsLD.pixels, is, 0, 0, i, i_170_ >> 16, i_172_ >> 16, i_173_, i_197_, i_199_, i_202_, i_205_, i_200_, i_203_, i_206_);
									i_172_ += i_195_;
									i_170_ += i_193_;
									i_173_ += i_198_;
									i += GraphicsLD.width;
									i_199_ += i_201_;
									i_202_ += i_204_;
									i_205_ += i_207_;
								}
								while (--i_169_ >= 0) {
									method873(GraphicsLD.pixels, is, 0, 0, i, i_171_ >> 16, i_172_ >> 16, i_173_, i_197_, i_199_, i_202_, i_205_, i_200_, i_203_, i_206_);
									i_172_ += i_195_;
									i_171_ += i_194_;
									i_173_ += i_198_;
									i += GraphicsLD.width;
									i_199_ += i_201_;
									i_202_ += i_204_;
									i_205_ += i_207_;
								}
							}
						} else {
							i_171_ = i_170_ <<= 16;
							if (i < 0) {
								i_171_ -= i_195_ * i;
								i_170_ -= i_193_ * i;
								i_173_ -= i_198_ * i;
								i = 0;
							}
							i_172_ <<= 16;
							if (i_169_ < 0) {
								i_172_ -= i_194_ * i_169_;
								i_169_ = 0;
							}
							final int i_209_ = i - anInt970;
							i_199_ += i_201_ * i_209_;
							i_202_ += i_204_ * i_209_;
							i_205_ += i_207_ * i_209_;
							if (i != i_169_ && i_195_ < i_193_ || i == i_169_ && i_194_ > i_193_) {
								i_168_ -= i_169_;
								i_169_ -= i;
								i = coordinateYLookup[i];
								while (--i_169_ >= 0) {
									method873(GraphicsLD.pixels, is, 0, 0, i, i_171_ >> 16, i_170_ >> 16, i_173_, i_197_, i_199_, i_202_, i_205_, i_200_, i_203_, i_206_);
									i_171_ += i_195_;
									i_170_ += i_193_;
									i_173_ += i_198_;
									i += GraphicsLD.width;
									i_199_ += i_201_;
									i_202_ += i_204_;
									i_205_ += i_207_;
								}
								while (--i_168_ >= 0) {
									method873(GraphicsLD.pixels, is, 0, 0, i, i_172_ >> 16, i_170_ >> 16, i_173_, i_197_, i_199_, i_202_, i_205_, i_200_, i_203_, i_206_);
									i_172_ += i_194_;
									i_170_ += i_193_;
									i_173_ += i_198_;
									i += GraphicsLD.width;
									i_199_ += i_201_;
									i_202_ += i_204_;
									i_205_ += i_207_;
								}
							} else {
								i_168_ -= i_169_;
								i_169_ -= i;
								i = coordinateYLookup[i];
								while (--i_169_ >= 0) {
									method873(GraphicsLD.pixels, is, 0, 0, i, i_170_ >> 16, i_171_ >> 16, i_173_, i_197_, i_199_, i_202_, i_205_, i_200_, i_203_, i_206_);
									i_171_ += i_195_;
									i_170_ += i_193_;
									i_173_ += i_198_;
									i += GraphicsLD.width;
									i_199_ += i_201_;
									i_202_ += i_204_;
									i_205_ += i_207_;
								}
								while (--i_168_ >= 0) {
									method873(GraphicsLD.pixels, is, 0, 0, i, i_170_ >> 16, i_172_ >> 16, i_173_, i_197_, i_199_, i_202_, i_205_, i_200_, i_203_, i_206_);
									i_172_ += i_194_;
									i_170_ += i_193_;
									i_173_ += i_198_;
									i += GraphicsLD.width;
									i_199_ += i_201_;
									i_202_ += i_204_;
									i_205_ += i_207_;
								}
							}
						}
					}
				} else if (i_168_ <= i_169_) {
					if (i_168_ < endY) {
						if (i_169_ > endY) {
							i_169_ = endY;
						}
						if (i > endY) {
							i = endY;
						}
						i_174_ = (i_174_ << 9) - i_197_ * i_171_ + i_197_;
						if (i_169_ < i) {
							i_170_ = i_171_ <<= 16;
							if (i_168_ < 0) {
								i_170_ -= i_193_ * i_168_;
								i_171_ -= i_194_ * i_168_;
								i_174_ -= i_198_ * i_168_;
								i_168_ = 0;
							}
							i_172_ <<= 16;
							if (i_169_ < 0) {
								i_172_ -= i_195_ * i_169_;
								i_169_ = 0;
							}
							final int i_210_ = i_168_ - anInt970;
							i_199_ += i_201_ * i_210_;
							i_202_ += i_204_ * i_210_;
							i_205_ += i_207_ * i_210_;
							if (i_168_ != i_169_ && i_193_ < i_194_ || i_168_ == i_169_ && i_193_ > i_195_) {
								i -= i_169_;
								i_169_ -= i_168_;
								i_168_ = coordinateYLookup[i_168_];
								while (--i_169_ >= 0) {
									method873(GraphicsLD.pixels, is, 0, 0, i_168_, i_170_ >> 16, i_171_ >> 16, i_174_, i_197_, i_199_, i_202_, i_205_, i_200_, i_203_, i_206_);
									i_170_ += i_193_;
									i_171_ += i_194_;
									i_174_ += i_198_;
									i_168_ += GraphicsLD.width;
									i_199_ += i_201_;
									i_202_ += i_204_;
									i_205_ += i_207_;
								}
								while (--i >= 0) {
									method873(GraphicsLD.pixels, is, 0, 0, i_168_, i_170_ >> 16, i_172_ >> 16, i_174_, i_197_, i_199_, i_202_, i_205_, i_200_, i_203_, i_206_);
									i_170_ += i_193_;
									i_172_ += i_195_;
									i_174_ += i_198_;
									i_168_ += GraphicsLD.width;
									i_199_ += i_201_;
									i_202_ += i_204_;
									i_205_ += i_207_;
								}
							} else {
								i -= i_169_;
								i_169_ -= i_168_;
								i_168_ = coordinateYLookup[i_168_];
								while (--i_169_ >= 0) {
									method873(GraphicsLD.pixels, is, 0, 0, i_168_, i_171_ >> 16, i_170_ >> 16, i_174_, i_197_, i_199_, i_202_, i_205_, i_200_, i_203_, i_206_);
									i_170_ += i_193_;
									i_171_ += i_194_;
									i_174_ += i_198_;
									i_168_ += GraphicsLD.width;
									i_199_ += i_201_;
									i_202_ += i_204_;
									i_205_ += i_207_;
								}
								while (--i >= 0) {
									method873(GraphicsLD.pixels, is, 0, 0, i_168_, i_172_ >> 16, i_170_ >> 16, i_174_, i_197_, i_199_, i_202_, i_205_, i_200_, i_203_, i_206_);
									i_170_ += i_193_;
									i_172_ += i_195_;
									i_174_ += i_198_;
									i_168_ += GraphicsLD.width;
									i_199_ += i_201_;
									i_202_ += i_204_;
									i_205_ += i_207_;
								}
							}
						} else {
							i_172_ = i_171_ <<= 16;
							if (i_168_ < 0) {
								i_172_ -= i_193_ * i_168_;
								i_171_ -= i_194_ * i_168_;
								i_174_ -= i_198_ * i_168_;
								i_168_ = 0;
							}
							i_170_ <<= 16;
							if (i < 0) {
								i_170_ -= i_195_ * i;
								i = 0;
							}
							final int i_211_ = i_168_ - anInt970;
							i_199_ += i_201_ * i_211_;
							i_202_ += i_204_ * i_211_;
							i_205_ += i_207_ * i_211_;
							if (i_193_ < i_194_) {
								i_169_ -= i;
								i -= i_168_;
								i_168_ = coordinateYLookup[i_168_];
								while (--i >= 0) {
									method873(GraphicsLD.pixels, is, 0, 0, i_168_, i_172_ >> 16, i_171_ >> 16, i_174_, i_197_, i_199_, i_202_, i_205_, i_200_, i_203_, i_206_);
									i_172_ += i_193_;
									i_171_ += i_194_;
									i_174_ += i_198_;
									i_168_ += GraphicsLD.width;
									i_199_ += i_201_;
									i_202_ += i_204_;
									i_205_ += i_207_;
								}
								while (--i_169_ >= 0) {
									method873(GraphicsLD.pixels, is, 0, 0, i_168_, i_170_ >> 16, i_171_ >> 16, i_174_, i_197_, i_199_, i_202_, i_205_, i_200_, i_203_, i_206_);
									i_170_ += i_195_;
									i_171_ += i_194_;
									i_174_ += i_198_;
									i_168_ += GraphicsLD.width;
									i_199_ += i_201_;
									i_202_ += i_204_;
									i_205_ += i_207_;
								}
							} else {
								i_169_ -= i;
								i -= i_168_;
								i_168_ = coordinateYLookup[i_168_];
								while (--i >= 0) {
									method873(GraphicsLD.pixels, is, 0, 0, i_168_, i_171_ >> 16, i_172_ >> 16, i_174_, i_197_, i_199_, i_202_, i_205_, i_200_, i_203_, i_206_);
									i_172_ += i_193_;
									i_171_ += i_194_;
									i_174_ += i_198_;
									i_168_ += GraphicsLD.width;
									i_199_ += i_201_;
									i_202_ += i_204_;
									i_205_ += i_207_;
								}
								while (--i_169_ >= 0) {
									method873(GraphicsLD.pixels, is, 0, 0, i_168_, i_171_ >> 16, i_170_ >> 16, i_174_, i_197_, i_199_, i_202_, i_205_, i_200_, i_203_, i_206_);
									i_170_ += i_195_;
									i_171_ += i_194_;
									i_174_ += i_198_;
									i_168_ += GraphicsLD.width;
									i_199_ += i_201_;
									i_202_ += i_204_;
									i_205_ += i_207_;
								}
							}
						}
					}
				} else if (i_169_ < endY) {
					if (i > endY) {
						i = endY;
					}
					if (i_168_ > endY) {
						i_168_ = endY;
					}
					i_175_ = (i_175_ << 9) - i_197_ * i_172_ + i_197_;
					if (i < i_168_) {
						i_171_ = i_172_ <<= 16;
						if (i_169_ < 0) {
							i_171_ -= i_194_ * i_169_;
							i_172_ -= i_195_ * i_169_;
							i_175_ -= i_198_ * i_169_;
							i_169_ = 0;
						}
						i_170_ <<= 16;
						if (i < 0) {
							i_170_ -= i_193_ * i;
							i = 0;
						}
						final int i_212_ = i_169_ - anInt970;
						i_199_ += i_201_ * i_212_;
						i_202_ += i_204_ * i_212_;
						i_205_ += i_207_ * i_212_;
						if (i_194_ < i_195_) {
							i_168_ -= i;
							i -= i_169_;
							i_169_ = coordinateYLookup[i_169_];
							while (--i >= 0) {
								method873(GraphicsLD.pixels, is, 0, 0, i_169_, i_171_ >> 16, i_172_ >> 16, i_175_, i_197_, i_199_, i_202_, i_205_, i_200_, i_203_, i_206_);
								i_171_ += i_194_;
								i_172_ += i_195_;
								i_175_ += i_198_;
								i_169_ += GraphicsLD.width;
								i_199_ += i_201_;
								i_202_ += i_204_;
								i_205_ += i_207_;
							}
							while (--i_168_ >= 0) {
								method873(GraphicsLD.pixels, is, 0, 0, i_169_, i_171_ >> 16, i_170_ >> 16, i_175_, i_197_, i_199_, i_202_, i_205_, i_200_, i_203_, i_206_);
								i_171_ += i_194_;
								i_170_ += i_193_;
								i_175_ += i_198_;
								i_169_ += GraphicsLD.width;
								i_199_ += i_201_;
								i_202_ += i_204_;
								i_205_ += i_207_;
							}
						} else {
							i_168_ -= i;
							i -= i_169_;
							i_169_ = coordinateYLookup[i_169_];
							while (--i >= 0) {
								method873(GraphicsLD.pixels, is, 0, 0, i_169_, i_172_ >> 16, i_171_ >> 16, i_175_, i_197_, i_199_, i_202_, i_205_, i_200_, i_203_, i_206_);
								i_171_ += i_194_;
								i_172_ += i_195_;
								i_175_ += i_198_;
								i_169_ += GraphicsLD.width;
								i_199_ += i_201_;
								i_202_ += i_204_;
								i_205_ += i_207_;
							}
							while (--i_168_ >= 0) {
								method873(GraphicsLD.pixels, is, 0, 0, i_169_, i_170_ >> 16, i_171_ >> 16, i_175_, i_197_, i_199_, i_202_, i_205_, i_200_, i_203_, i_206_);
								i_171_ += i_194_;
								i_170_ += i_193_;
								i_175_ += i_198_;
								i_169_ += GraphicsLD.width;
								i_199_ += i_201_;
								i_202_ += i_204_;
								i_205_ += i_207_;
							}
						}
					} else {
						i_170_ = i_172_ <<= 16;
						if (i_169_ < 0) {
							i_170_ -= i_194_ * i_169_;
							i_172_ -= i_195_ * i_169_;
							i_175_ -= i_198_ * i_169_;
							i_169_ = 0;
						}
						i_171_ <<= 16;
						if (i_168_ < 0) {
							i_171_ -= i_193_ * i_168_;
							i_168_ = 0;
						}
						final int i_213_ = i_169_ - anInt970;
						i_199_ += i_201_ * i_213_;
						i_202_ += i_204_ * i_213_;
						i_205_ += i_207_ * i_213_;
						if (i_194_ < i_195_) {
							i -= i_168_;
							i_168_ -= i_169_;
							i_169_ = coordinateYLookup[i_169_];
							while (--i_168_ >= 0) {
								method873(GraphicsLD.pixels, is, 0, 0, i_169_, i_170_ >> 16, i_172_ >> 16, i_175_, i_197_, i_199_, i_202_, i_205_, i_200_, i_203_, i_206_);
								i_170_ += i_194_;
								i_172_ += i_195_;
								i_175_ += i_198_;
								i_169_ += GraphicsLD.width;
								i_199_ += i_201_;
								i_202_ += i_204_;
								i_205_ += i_207_;
							}
							while (--i >= 0) {
								method873(GraphicsLD.pixels, is, 0, 0, i_169_, i_171_ >> 16, i_172_ >> 16, i_175_, i_197_, i_199_, i_202_, i_205_, i_200_, i_203_, i_206_);
								i_171_ += i_193_;
								i_172_ += i_195_;
								i_175_ += i_198_;
								i_169_ += GraphicsLD.width;
								i_199_ += i_201_;
								i_202_ += i_204_;
								i_205_ += i_207_;
							}
						} else {
							i -= i_168_;
							i_168_ -= i_169_;
							i_169_ = coordinateYLookup[i_169_];
							while (--i_168_ >= 0) {
								method873(GraphicsLD.pixels, is, 0, 0, i_169_, i_172_ >> 16, i_170_ >> 16, i_175_, i_197_, i_199_, i_202_, i_205_, i_200_, i_203_, i_206_);
								i_170_ += i_194_;
								i_172_ += i_195_;
								i_175_ += i_198_;
								i_169_ += GraphicsLD.width;
								i_199_ += i_201_;
								i_202_ += i_204_;
								i_205_ += i_207_;
							}
							while (--i >= 0) {
								method873(GraphicsLD.pixels, is, 0, 0, i_169_, i_172_ >> 16, i_171_ >> 16, i_175_, i_197_, i_199_, i_202_, i_205_, i_200_, i_203_, i_206_);
								i_171_ += i_193_;
								i_172_ += i_195_;
								i_175_ += i_198_;
								i_169_ += GraphicsLD.width;
								i_199_ += i_201_;
								i_202_ += i_204_;
								i_205_ += i_207_;
							}
						}
					}
				}
			}
		}
	}

	private static final void method873(final int[] is, final int[] is_214_, int i, int i_215_, int i_216_, int i_217_, int i_218_, int i_219_, int i_220_, int i_221_, int i_222_, int i_223_, final int i_224_, final int i_225_, final int i_226_) {
		if (aBoolean972) {
			if (i_218_ > anInt983) {
				i_218_ = anInt983;
			}
			if (i_217_ < 0) {
				i_217_ = 0;
			}
		}
		if (i_217_ < i_218_) {
			i_216_ += i_217_;
			i_219_ += i_220_ * i_217_;
			int i_227_ = i_218_ - i_217_;
			if (aBoolean981) {
				final int i_228_ = i_217_ - anInt967;
				i_221_ += i_224_ * i_228_;
				i_222_ += i_225_ * i_228_;
				i_223_ += i_226_ * i_228_;
				int i_229_ = i_223_ >> 12;
				int i_230_;
				int i_231_;
				if (i_229_ != 0) {
					i_230_ = i_221_ / i_229_;
					i_231_ = i_222_ / i_229_;
				} else {
					i_230_ = 0;
					i_231_ = 0;
				}
				i_221_ += i_224_ * i_227_;
				i_222_ += i_225_ * i_227_;
				i_223_ += i_226_ * i_227_;
				i_229_ = i_223_ >> 12;
				int i_232_;
				int i_233_;
				if (i_229_ != 0) {
					i_232_ = i_221_ / i_229_;
					i_233_ = i_222_ / i_229_;
				} else {
					i_232_ = 0;
					i_233_ = 0;
				}
				i = (i_230_ << 20) + i_231_;
				final int i_234_ = ((i_232_ - i_230_) / i_227_ << 20) + (i_233_ - i_231_) / i_227_;
				i_227_ >>= 3;
				i_220_ <<= 3;
				int i_235_ = i_219_ >> 8;
				if (aBoolean976) {
					if (i_227_ > 0) {
						do {
							i_215_ = is_214_[(i & 0xfc0) + (i >>> 26)];
							is[i_216_++] = ((i_215_ & 0xff00ff) * i_235_ & ~0xff00ff) + ((i_215_ & 0xff00) * i_235_ & 0xff0000) >> 8;
							i += i_234_;
							i_215_ = is_214_[(i & 0xfc0) + (i >>> 26)];
							is[i_216_++] = ((i_215_ & 0xff00ff) * i_235_ & ~0xff00ff) + ((i_215_ & 0xff00) * i_235_ & 0xff0000) >> 8;
							i += i_234_;
							i_215_ = is_214_[(i & 0xfc0) + (i >>> 26)];
							is[i_216_++] = ((i_215_ & 0xff00ff) * i_235_ & ~0xff00ff) + ((i_215_ & 0xff00) * i_235_ & 0xff0000) >> 8;
							i += i_234_;
							i_215_ = is_214_[(i & 0xfc0) + (i >>> 26)];
							is[i_216_++] = ((i_215_ & 0xff00ff) * i_235_ & ~0xff00ff) + ((i_215_ & 0xff00) * i_235_ & 0xff0000) >> 8;
							i += i_234_;
							i_215_ = is_214_[(i & 0xfc0) + (i >>> 26)];
							is[i_216_++] = ((i_215_ & 0xff00ff) * i_235_ & ~0xff00ff) + ((i_215_ & 0xff00) * i_235_ & 0xff0000) >> 8;
							i += i_234_;
							i_215_ = is_214_[(i & 0xfc0) + (i >>> 26)];
							is[i_216_++] = ((i_215_ & 0xff00ff) * i_235_ & ~0xff00ff) + ((i_215_ & 0xff00) * i_235_ & 0xff0000) >> 8;
							i += i_234_;
							i_215_ = is_214_[(i & 0xfc0) + (i >>> 26)];
							is[i_216_++] = ((i_215_ & 0xff00ff) * i_235_ & ~0xff00ff) + ((i_215_ & 0xff00) * i_235_ & 0xff0000) >> 8;
							i += i_234_;
							i_215_ = is_214_[(i & 0xfc0) + (i >>> 26)];
							is[i_216_++] = ((i_215_ & 0xff00ff) * i_235_ & ~0xff00ff) + ((i_215_ & 0xff00) * i_235_ & 0xff0000) >> 8;
							i += i_234_;
							i_219_ += i_220_;
							i_235_ = i_219_ >> 8;
						} while (--i_227_ > 0);
					}
					i_227_ = i_218_ - i_217_ & 0x7;
					if (i_227_ > 0) {
						do {
							i_215_ = is_214_[(i & 0xfc0) + (i >>> 26)];
							is[i_216_++] = ((i_215_ & 0xff00ff) * i_235_ & ~0xff00ff) + ((i_215_ & 0xff00) * i_235_ & 0xff0000) >> 8;
							i += i_234_;
						} while (--i_227_ > 0);
					}
				} else {
					if (i_227_ > 0) {
						do {
							if ((i_215_ = is_214_[(i & 0xfc0) + (i >>> 26)]) != 0) {
								is[i_216_] = ((i_215_ & 0xff00ff) * i_235_ & ~0xff00ff) + ((i_215_ & 0xff00) * i_235_ & 0xff0000) >> 8;
							}
							i_216_++;
							i += i_234_;
							if ((i_215_ = is_214_[(i & 0xfc0) + (i >>> 26)]) != 0) {
								is[i_216_] = ((i_215_ & 0xff00ff) * i_235_ & ~0xff00ff) + ((i_215_ & 0xff00) * i_235_ & 0xff0000) >> 8;
							}
							i_216_++;
							i += i_234_;
							if ((i_215_ = is_214_[(i & 0xfc0) + (i >>> 26)]) != 0) {
								is[i_216_] = ((i_215_ & 0xff00ff) * i_235_ & ~0xff00ff) + ((i_215_ & 0xff00) * i_235_ & 0xff0000) >> 8;
							}
							i_216_++;
							i += i_234_;
							if ((i_215_ = is_214_[(i & 0xfc0) + (i >>> 26)]) != 0) {
								is[i_216_] = ((i_215_ & 0xff00ff) * i_235_ & ~0xff00ff) + ((i_215_ & 0xff00) * i_235_ & 0xff0000) >> 8;
							}
							i_216_++;
							i += i_234_;
							if ((i_215_ = is_214_[(i & 0xfc0) + (i >>> 26)]) != 0) {
								is[i_216_] = ((i_215_ & 0xff00ff) * i_235_ & ~0xff00ff) + ((i_215_ & 0xff00) * i_235_ & 0xff0000) >> 8;
							}
							i_216_++;
							i += i_234_;
							if ((i_215_ = is_214_[(i & 0xfc0) + (i >>> 26)]) != 0) {
								is[i_216_] = ((i_215_ & 0xff00ff) * i_235_ & ~0xff00ff) + ((i_215_ & 0xff00) * i_235_ & 0xff0000) >> 8;
							}
							i_216_++;
							i += i_234_;
							if ((i_215_ = is_214_[(i & 0xfc0) + (i >>> 26)]) != 0) {
								is[i_216_] = ((i_215_ & 0xff00ff) * i_235_ & ~0xff00ff) + ((i_215_ & 0xff00) * i_235_ & 0xff0000) >> 8;
							}
							i_216_++;
							i += i_234_;
							if ((i_215_ = is_214_[(i & 0xfc0) + (i >>> 26)]) != 0) {
								is[i_216_] = ((i_215_ & 0xff00ff) * i_235_ & ~0xff00ff) + ((i_215_ & 0xff00) * i_235_ & 0xff0000) >> 8;
							}
							i_216_++;
							i += i_234_;
							i_219_ += i_220_;
							i_235_ = i_219_ >> 8;
						} while (--i_227_ > 0);
					}
					i_227_ = i_218_ - i_217_ & 0x7;
					if (i_227_ > 0) {
						do {
							if ((i_215_ = is_214_[(i & 0xfc0) + (i >>> 26)]) != 0) {
								is[i_216_] = ((i_215_ & 0xff00ff) * i_235_ & ~0xff00ff) + ((i_215_ & 0xff00) * i_235_ & 0xff0000) >> 8;
							}
							i_216_++;
							i += i_234_;
						} while (--i_227_ > 0);
					}
				}
			} else {
				final int i_236_ = i_217_ - anInt967;
				i_221_ += i_224_ * i_236_;
				i_222_ += i_225_ * i_236_;
				i_223_ += i_226_ * i_236_;
				int i_237_ = i_223_ >> 14;
				int i_238_;
				int i_239_;
				if (i_237_ != 0) {
					i_238_ = i_221_ / i_237_;
					i_239_ = i_222_ / i_237_;
				} else {
					i_238_ = 0;
					i_239_ = 0;
				}
				i_221_ += i_224_ * i_227_;
				i_222_ += i_225_ * i_227_;
				i_223_ += i_226_ * i_227_;
				i_237_ = i_223_ >> 14;
				int i_240_;
				int i_241_;
				if (i_237_ != 0) {
					i_240_ = i_221_ / i_237_;
					i_241_ = i_222_ / i_237_;
				} else {
					i_240_ = 0;
					i_241_ = 0;
				}
				i = (i_238_ << 18) + i_239_;
				final int i_242_ = ((i_240_ - i_238_) / i_227_ << 18) + (i_241_ - i_239_) / i_227_;
				i_227_ >>= 3;
				i_220_ <<= 3;
				int i_243_ = i_219_ >> 8;
				if (aBoolean976) {
					if (i_227_ > 0) {
						do {
							i_215_ = is_214_[(i & 0x3f80) + (i >>> 25)];
							is[i_216_++] = ((i_215_ & 0xff00ff) * i_243_ & ~0xff00ff) + ((i_215_ & 0xff00) * i_243_ & 0xff0000) >> 8;
							i += i_242_;
							i_215_ = is_214_[(i & 0x3f80) + (i >>> 25)];
							is[i_216_++] = ((i_215_ & 0xff00ff) * i_243_ & ~0xff00ff) + ((i_215_ & 0xff00) * i_243_ & 0xff0000) >> 8;
							i += i_242_;
							i_215_ = is_214_[(i & 0x3f80) + (i >>> 25)];
							is[i_216_++] = ((i_215_ & 0xff00ff) * i_243_ & ~0xff00ff) + ((i_215_ & 0xff00) * i_243_ & 0xff0000) >> 8;
							i += i_242_;
							i_215_ = is_214_[(i & 0x3f80) + (i >>> 25)];
							is[i_216_++] = ((i_215_ & 0xff00ff) * i_243_ & ~0xff00ff) + ((i_215_ & 0xff00) * i_243_ & 0xff0000) >> 8;
							i += i_242_;
							i_215_ = is_214_[(i & 0x3f80) + (i >>> 25)];
							is[i_216_++] = ((i_215_ & 0xff00ff) * i_243_ & ~0xff00ff) + ((i_215_ & 0xff00) * i_243_ & 0xff0000) >> 8;
							i += i_242_;
							i_215_ = is_214_[(i & 0x3f80) + (i >>> 25)];
							is[i_216_++] = ((i_215_ & 0xff00ff) * i_243_ & ~0xff00ff) + ((i_215_ & 0xff00) * i_243_ & 0xff0000) >> 8;
							i += i_242_;
							i_215_ = is_214_[(i & 0x3f80) + (i >>> 25)];
							is[i_216_++] = ((i_215_ & 0xff00ff) * i_243_ & ~0xff00ff) + ((i_215_ & 0xff00) * i_243_ & 0xff0000) >> 8;
							i += i_242_;
							i_215_ = is_214_[(i & 0x3f80) + (i >>> 25)];
							is[i_216_++] = ((i_215_ & 0xff00ff) * i_243_ & ~0xff00ff) + ((i_215_ & 0xff00) * i_243_ & 0xff0000) >> 8;
							i += i_242_;
							i_219_ += i_220_;
							i_243_ = i_219_ >> 8;
						} while (--i_227_ > 0);
					}
					i_227_ = i_218_ - i_217_ & 0x7;
					if (i_227_ > 0) {
						do {
							i_215_ = is_214_[(i & 0x3f80) + (i >>> 25)];
							is[i_216_++] = ((i_215_ & 0xff00ff) * i_243_ & ~0xff00ff) + ((i_215_ & 0xff00) * i_243_ & 0xff0000) >> 8;
							i += i_242_;
						} while (--i_227_ > 0);
					}
				} else {
					if (i_227_ > 0) {
						do {
							if ((i_215_ = is_214_[(i & 0x3f80) + (i >>> 25)]) != 0) {
								is[i_216_] = ((i_215_ & 0xff00ff) * i_243_ & ~0xff00ff) + ((i_215_ & 0xff00) * i_243_ & 0xff0000) >> 8;
							}
							i_216_++;
							i += i_242_;
							if ((i_215_ = is_214_[(i & 0x3f80) + (i >>> 25)]) != 0) {
								is[i_216_] = ((i_215_ & 0xff00ff) * i_243_ & ~0xff00ff) + ((i_215_ & 0xff00) * i_243_ & 0xff0000) >> 8;
							}
							i_216_++;
							i += i_242_;
							if ((i_215_ = is_214_[(i & 0x3f80) + (i >>> 25)]) != 0) {
								is[i_216_] = ((i_215_ & 0xff00ff) * i_243_ & ~0xff00ff) + ((i_215_ & 0xff00) * i_243_ & 0xff0000) >> 8;
							}
							i_216_++;
							i += i_242_;
							if ((i_215_ = is_214_[(i & 0x3f80) + (i >>> 25)]) != 0) {
								is[i_216_] = ((i_215_ & 0xff00ff) * i_243_ & ~0xff00ff) + ((i_215_ & 0xff00) * i_243_ & 0xff0000) >> 8;
							}
							i_216_++;
							i += i_242_;
							if ((i_215_ = is_214_[(i & 0x3f80) + (i >>> 25)]) != 0) {
								is[i_216_] = ((i_215_ & 0xff00ff) * i_243_ & ~0xff00ff) + ((i_215_ & 0xff00) * i_243_ & 0xff0000) >> 8;
							}
							i_216_++;
							i += i_242_;
							if ((i_215_ = is_214_[(i & 0x3f80) + (i >>> 25)]) != 0) {
								is[i_216_] = ((i_215_ & 0xff00ff) * i_243_ & ~0xff00ff) + ((i_215_ & 0xff00) * i_243_ & 0xff0000) >> 8;
							}
							i_216_++;
							i += i_242_;
							if ((i_215_ = is_214_[(i & 0x3f80) + (i >>> 25)]) != 0) {
								is[i_216_] = ((i_215_ & 0xff00ff) * i_243_ & ~0xff00ff) + ((i_215_ & 0xff00) * i_243_ & 0xff0000) >> 8;
							}
							i_216_++;
							i += i_242_;
							if ((i_215_ = is_214_[(i & 0x3f80) + (i >>> 25)]) != 0) {
								is[i_216_] = ((i_215_ & 0xff00ff) * i_243_ & ~0xff00ff) + ((i_215_ & 0xff00) * i_243_ & 0xff0000) >> 8;
							}
							i_216_++;
							i += i_242_;
							i_219_ += i_220_;
							i_243_ = i_219_ >> 8;
						} while (--i_227_ > 0);
					}
					i_227_ = i_218_ - i_217_ & 0x7;
					if (i_227_ > 0) {
						do {
							if ((i_215_ = is_214_[(i & 0x3f80) + (i >>> 25)]) != 0) {
								is[i_216_] = ((i_215_ & 0xff00ff) * i_243_ & ~0xff00ff) + ((i_215_ & 0xff00) * i_243_ & 0xff0000) >> 8;
							}
							i_216_++;
							i += i_242_;
						} while (--i_227_ > 0);
					}
				}
			}
		}
	}

	static final void calculateByBounds() {
		calculateYLookupArray(GraphicsLD.startX, GraphicsLD.startY, GraphicsLD.endX, GraphicsLD.endY);
	}
}
