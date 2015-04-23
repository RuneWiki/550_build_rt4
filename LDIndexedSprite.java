/* Class107_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class LDIndexedSprite extends AbstractIndexedSprite {
	int[] palette;
	byte[] paletteIndicators;

	@Override
	final void method911(int i, int i_0_, final int i_1_) {
		i += this.xOffset;
		i_0_ += this.yOffset;
		int i_2_ = i + i_0_ * GraphicsLD.width;
		int i_3_ = 0;
		int i_4_ = this.height;
		int i_5_ = this.width;
		int i_6_ = GraphicsLD.width - i_5_;
		int i_7_ = 0;
		if (i_0_ < GraphicsLD.startY) {
			final int i_8_ = GraphicsLD.startY - i_0_;
			i_4_ -= i_8_;
			i_0_ = GraphicsLD.startY;
			i_3_ += i_8_ * i_5_;
			i_2_ += i_8_ * GraphicsLD.width;
		}
		if (i_0_ + i_4_ > GraphicsLD.endY) {
			i_4_ -= i_0_ + i_4_ - GraphicsLD.endY;
		}
		if (i < GraphicsLD.startX) {
			final int i_9_ = GraphicsLD.startX - i;
			i_5_ -= i_9_;
			i = GraphicsLD.startX;
			i_3_ += i_9_;
			i_2_ += i_9_;
			i_7_ += i_9_;
			i_6_ += i_9_;
		}
		if (i + i_5_ > GraphicsLD.endX) {
			final int i_10_ = i + i_5_ - GraphicsLD.endX;
			i_5_ -= i_10_;
			i_7_ += i_10_;
			i_6_ += i_10_;
		}
		if (i_5_ > 0 && i_4_ > 0) {
			method922(GraphicsLD.pixels, this.paletteIndicators, this.palette, i_3_, i_2_, i_5_, i_4_, i_6_, i_7_, i_1_);
		}
	}

	final void method912() {
		int i = 0;
		int i_11_ = this.paletteIndicators.length - 7;
		while (i < i_11_) {
			this.paletteIndicators[i++] = (byte) 0;
			this.paletteIndicators[i++] = (byte) 0;
			this.paletteIndicators[i++] = (byte) 0;
			this.paletteIndicators[i++] = (byte) 0;
			this.paletteIndicators[i++] = (byte) 0;
			this.paletteIndicators[i++] = (byte) 0;
			this.paletteIndicators[i++] = (byte) 0;
			this.paletteIndicators[i++] = (byte) 0;
		}
		i_11_ += 7;
		while (i < i_11_) {
			this.paletteIndicators[i++] = (byte) 0;
		}
	}

	private static final void method913(final int[] is, final byte[] is_12_, final int[] is_13_, int i, int i_14_, int i_15_, int i_16_, final int i_17_, final int i_18_, final int i_19_) {
		final int i_20_ = -(i_16_ >> 2);
		i_16_ = -(i_16_ & 0x3);
		for (int i_21_ = -i_17_; i_21_ < 0; i_21_++) {
			for (int i_22_ = i_20_; i_22_ < 0; i_22_++) {
				i = is_12_[i_14_++];
				if (i != 0) {
					is[i_15_++] = is_13_[i & 0xff];
				} else {
					i_15_++;
				}
				i = is_12_[i_14_++];
				if (i != 0) {
					is[i_15_++] = is_13_[i & 0xff];
				} else {
					i_15_++;
				}
				i = is_12_[i_14_++];
				if (i != 0) {
					is[i_15_++] = is_13_[i & 0xff];
				} else {
					i_15_++;
				}
				i = is_12_[i_14_++];
				if (i != 0) {
					is[i_15_++] = is_13_[i & 0xff];
				} else {
					i_15_++;
				}
			}
			for (int i_23_ = i_16_; i_23_ < 0; i_23_++) {
				i = is_12_[i_14_++];
				if (i != 0) {
					is[i_15_++] = is_13_[i & 0xff];
				} else {
					i_15_++;
				}
			}
			i_15_ += i_18_;
			i_14_ += i_19_;
		}
	}

	final void method914(final int redMod, final int greenMod, final int blueMod) {
		for (int i_26_ = 0; i_26_ < this.palette.length; i_26_++) {
			int i_27_ = this.palette[i_26_] >> 16 & 0xff;
			i_27_ += redMod;
			if (i_27_ < 0) {
				i_27_ = 0;
			} else if (i_27_ > 255) {
				i_27_ = 255;
			}
			int i_28_ = this.palette[i_26_] >> 8 & 0xff;
			i_28_ += greenMod;
			if (i_28_ < 0) {
				i_28_ = 0;
			} else if (i_28_ > 255) {
				i_28_ = 255;
			}
			int i_29_ = this.palette[i_26_] & 0xff;
			i_29_ += blueMod;
			if (i_29_ < 0) {
				i_29_ = 0;
			} else if (i_29_ > 255) {
				i_29_ = 255;
			}
			this.palette[i_26_] = (i_27_ << 16) + (i_28_ << 8) + i_29_;
		}
	}

	final void flipVertical() {
		final byte[] is = new byte[this.width * this.height];
		int i = 0;
		for (int i_30_ = this.height - 1; i_30_ >= 0; i_30_--) {
			for (int i_31_ = 0; i_31_ < this.width; i_31_++) {
				is[i++] = this.paletteIndicators[i_31_ + i_30_ * this.width];
			}
		}
		this.paletteIndicators = is;
		this.yOffset = this.trimHeight - this.height - this.yOffset;
	}

	final void rotate90() {
		final byte[] is = new byte[this.width * this.height];
		int i = 0;
		for (int i_32_ = 0; i_32_ < this.width; i_32_++) {
			for (int i_33_ = this.height - 1; i_33_ >= 0; i_33_--) {
				is[i++] = this.paletteIndicators[i_32_ + i_33_ * this.width];
			}
		}
		this.paletteIndicators = is;
		int i_34_ = this.yOffset;
		this.yOffset = this.xOffset;
		this.xOffset = this.trimHeight - this.height - i_34_;
		i_34_ = this.height;
		this.height = this.width;
		this.width = i_34_;
		i_34_ = this.trimHeight;
		this.trimHeight = this.trimWidth;
		this.trimWidth = i_34_;
	}

	final void method917(int i, int i_35_, final int i_36_, final int i_37_, final int i_38_, final int i_39_) {
		if (i_39_ != 0) {
			i -= this.xOffset << 4;
			i_35_ -= this.yOffset << 4;
			final double d = (i_38_ & 0xffff) * 9.587379924285257E-5;
			final int i_40_ = (int) Math.floor(Math.sin(d) * i_39_ + 0.5);
			final int i_41_ = (int) Math.floor(Math.cos(d) * i_39_ + 0.5);
			final int i_42_ = -i * i_41_ + -i_35_ * i_40_;
			final int i_43_ = --i * i_40_ + -i_35_ * i_41_;
			final int i_44_ = ((this.width << 4) - i) * i_41_ + -i_35_ * i_40_;
			final int i_45_ = -((this.width << 4) - i) * i_40_ + -i_35_ * i_41_;
			final int i_46_ = -i * i_41_ + ((this.height << 4) - i_35_) * i_40_;
			final int i_47_ = --i * i_40_ + ((this.height << 4) - i_35_) * i_41_;
			final int i_48_ = ((this.width << 4) - i) * i_41_ + ((this.height << 4) - i_35_) * i_40_;
			final int i_49_ = -((this.width << 4) - i) * i_40_ + ((this.height << 4) - i_35_) * i_41_;
			int i_50_;
			int i_51_;
			if (i_42_ < i_44_) {
				i_50_ = i_42_;
				i_51_ = i_44_;
			} else {
				i_50_ = i_44_;
				i_51_ = i_42_;
			}
			if (i_46_ < i_50_) {
				i_50_ = i_46_;
			}
			if (i_48_ < i_50_) {
				i_50_ = i_48_;
			}
			if (i_46_ > i_51_) {
				i_51_ = i_46_;
			}
			if (i_48_ > i_51_) {
				i_51_ = i_48_;
			}
			int i_52_;
			int i_53_;
			if (i_43_ < i_45_) {
				i_52_ = i_43_;
				i_53_ = i_45_;
			} else {
				i_52_ = i_45_;
				i_53_ = i_43_;
			}
			if (i_47_ < i_52_) {
				i_52_ = i_47_;
			}
			if (i_49_ < i_52_) {
				i_52_ = i_49_;
			}
			if (i_47_ > i_53_) {
				i_53_ = i_47_;
			}
			if (i_49_ > i_53_) {
				i_53_ = i_49_;
			}
			i_50_ >>= 12;
			i_51_ = i_51_ + 4095 >> 12;
			i_52_ >>= 12;
			i_53_ = i_53_ + 4095 >> 12;
			i_50_ += i_36_;
			i_51_ += i_36_;
			i_52_ += i_37_;
			i_53_ += i_37_;
			i_50_ >>= 4;
			i_51_ = i_51_ + 15 >> 4;
			i_52_ >>= 4;
			i_53_ = i_53_ + 15 >> 4;
			if (i_50_ < GraphicsLD.startX) {
				i_50_ = GraphicsLD.startX;
			}
			if (i_51_ > GraphicsLD.endX) {
				i_51_ = GraphicsLD.endX;
			}
			if (i_52_ < GraphicsLD.startY) {
				i_52_ = GraphicsLD.startY;
			}
			if (i_53_ > GraphicsLD.endY) {
				i_53_ = GraphicsLD.endY;
			}
			i_51_ = i_50_ - i_51_;
			if (i_51_ < 0) {
				i_53_ = i_52_ - i_53_;
				if (i_53_ < 0) {
					int i_54_ = i_52_ * GraphicsLD.width + i_50_;
					final double d_55_ = 1.6777216E7 / i_39_;
					final int i_56_ = (int) Math.floor(Math.sin(d) * d_55_ + 0.5);
					final int i_57_ = (int) Math.floor(Math.cos(d) * d_55_ + 0.5);
					final int i_58_ = (i_50_ << 4) + 8 - i_36_;
					final int i_59_ = (i_52_ << 4) + 8 - i_37_;
					int i_60_ = (i << 8) - (i_59_ * i_56_ >> 4);
					int i_61_ = (i_35_ << 8) + (i_59_ * i_57_ >> 4);
					if (i_57_ == 0) {
						if (i_56_ == 0) {
							int i_62_ = i_53_;
							while (i_62_ < 0) {
								int i_63_ = i_54_;
								final int i_64_ = i_60_;
								final int i_65_ = i_61_;
								int i_66_ = i_51_;
								if (i_64_ >= 0 && i_65_ >= 0 && i_64_ - (this.width << 12) < 0 && i_65_ - (this.height << 12) < 0) {
									for (/**/; i_66_ < 0; i_66_++) {
										final int i_67_ = this.palette[this.paletteIndicators[(i_65_ >> 12) * this.width + (i_64_ >> 12)]];
										if (i_67_ != 0) {
											GraphicsLD.pixels[i_63_++] = i_67_;
										} else {
											i_63_++;
										}
									}
								}
								i_62_++;
								i_54_ += GraphicsLD.width;
							}
						} else if (i_56_ < 0) {
							int i_68_ = i_53_;
							while (i_68_ < 0) {
								int i_69_ = i_54_;
								final int i_70_ = i_60_;
								int i_71_ = i_61_ + (i_58_ * i_56_ >> 4);
								int i_72_ = i_51_;
								if (i_70_ >= 0 && i_70_ - (this.width << 12) < 0) {
									int i_73_;
									if ((i_73_ = i_71_ - (this.height << 12)) >= 0) {
										i_73_ = (i_56_ - i_73_) / i_56_;
										i_72_ += i_73_;
										i_71_ += i_56_ * i_73_;
										i_69_ += i_73_;
									}
									if ((i_73_ = (i_71_ - i_56_) / i_56_) > i_72_) {
										i_72_ = i_73_;
									}
									for (/**/; i_72_ < 0; i_72_++) {
										final int i_74_ = this.palette[this.paletteIndicators[(i_71_ >> 12) * this.width + (i_70_ >> 12)]];
										if (i_74_ != 0) {
											GraphicsLD.pixels[i_69_++] = i_74_;
										} else {
											i_69_++;
										}
										i_71_ += i_56_;
									}
								}
								i_68_++;
								i_60_ -= i_56_;
								i_54_ += GraphicsLD.width;
							}
						} else {
							int i_75_ = i_53_;
							while (i_75_ < 0) {
								int i_76_ = i_54_;
								final int i_77_ = i_60_;
								int i_78_ = i_61_ + (i_58_ * i_56_ >> 4);
								int i_79_ = i_51_;
								if (i_77_ >= 0 && i_77_ - (this.width << 12) < 0) {
									if (i_78_ < 0) {
										final int i_80_ = (i_56_ - 1 - i_78_) / i_56_;
										i_79_ += i_80_;
										i_78_ += i_56_ * i_80_;
										i_76_ += i_80_;
									}
									int i_81_;
									if ((i_81_ = (1 + i_78_ - (this.height << 12) - i_56_) / i_56_) > i_79_) {
										i_79_ = i_81_;
									}
									for (/**/; i_79_ < 0; i_79_++) {
										final int i_82_ = this.palette[this.paletteIndicators[(i_78_ >> 12) * this.width + (i_77_ >> 12)]];
										if (i_82_ != 0) {
											GraphicsLD.pixels[i_76_++] = i_82_;
										} else {
											i_76_++;
										}
										i_78_ += i_56_;
									}
								}
								i_75_++;
								i_60_ -= i_56_;
								i_54_ += GraphicsLD.width;
							}
						}
					} else if (i_57_ < 0) {
						if (i_56_ == 0) {
							int i_83_ = i_53_;
							while (i_83_ < 0) {
								int i_84_ = i_54_;
								int i_85_ = i_60_ + (i_58_ * i_57_ >> 4);
								final int i_86_ = i_61_;
								int i_87_ = i_51_;
								if (i_86_ >= 0 && i_86_ - (this.height << 12) < 0) {
									int i_88_;
									if ((i_88_ = i_85_ - (this.width << 12)) >= 0) {
										i_88_ = (i_57_ - i_88_) / i_57_;
										i_87_ += i_88_;
										i_85_ += i_57_ * i_88_;
										i_84_ += i_88_;
									}
									if ((i_88_ = (i_85_ - i_57_) / i_57_) > i_87_) {
										i_87_ = i_88_;
									}
									for (/**/; i_87_ < 0; i_87_++) {
										final int i_89_ = this.palette[this.paletteIndicators[(i_86_ >> 12) * this.width + (i_85_ >> 12)]];
										if (i_89_ != 0) {
											GraphicsLD.pixels[i_84_++] = i_89_;
										} else {
											i_84_++;
										}
										i_85_ += i_57_;
									}
								}
								i_83_++;
								i_61_ += i_57_;
								i_54_ += GraphicsLD.width;
							}
						} else if (i_56_ < 0) {
							int i_90_ = i_53_;
							while (i_90_ < 0) {
								int i_91_ = i_54_;
								int i_92_ = i_60_ + (i_58_ * i_57_ >> 4);
								int i_93_ = i_61_ + (i_58_ * i_56_ >> 4);
								int i_94_ = i_51_;
								int i_95_;
								if ((i_95_ = i_92_ - (this.width << 12)) >= 0) {
									i_95_ = (i_57_ - i_95_) / i_57_;
									i_94_ += i_95_;
									i_92_ += i_57_ * i_95_;
									i_93_ += i_56_ * i_95_;
									i_91_ += i_95_;
								}
								if ((i_95_ = (i_92_ - i_57_) / i_57_) > i_94_) {
									i_94_ = i_95_;
								}
								if ((i_95_ = i_93_ - (this.height << 12)) >= 0) {
									i_95_ = (i_56_ - i_95_) / i_56_;
									i_94_ += i_95_;
									i_92_ += i_57_ * i_95_;
									i_93_ += i_56_ * i_95_;
									i_91_ += i_95_;
								}
								if ((i_95_ = (i_93_ - i_56_) / i_56_) > i_94_) {
									i_94_ = i_95_;
								}
								for (/**/; i_94_ < 0; i_94_++) {
									final int i_96_ = this.palette[this.paletteIndicators[(i_93_ >> 12) * this.width + (i_92_ >> 12)]];
									if (i_96_ != 0) {
										GraphicsLD.pixels[i_91_++] = i_96_;
									} else {
										i_91_++;
									}
									i_92_ += i_57_;
									i_93_ += i_56_;
								}
								i_90_++;
								i_60_ -= i_56_;
								i_61_ += i_57_;
								i_54_ += GraphicsLD.width;
							}
						} else {
							int i_97_ = i_53_;
							while (i_97_ < 0) {
								int i_98_ = i_54_;
								int i_99_ = i_60_ + (i_58_ * i_57_ >> 4);
								int i_100_ = i_61_ + (i_58_ * i_56_ >> 4);
								int i_101_ = i_51_;
								int i_102_;
								if ((i_102_ = i_99_ - (this.width << 12)) >= 0) {
									i_102_ = (i_57_ - i_102_) / i_57_;
									i_101_ += i_102_;
									i_99_ += i_57_ * i_102_;
									i_100_ += i_56_ * i_102_;
									i_98_ += i_102_;
								}
								if ((i_102_ = (i_99_ - i_57_) / i_57_) > i_101_) {
									i_101_ = i_102_;
								}
								if (i_100_ < 0) {
									i_102_ = (i_56_ - 1 - i_100_) / i_56_;
									i_101_ += i_102_;
									i_99_ += i_57_ * i_102_;
									i_100_ += i_56_ * i_102_;
									i_98_ += i_102_;
								}
								if ((i_102_ = (1 + i_100_ - (this.height << 12) - i_56_) / i_56_) > i_101_) {
									i_101_ = i_102_;
								}
								for (/**/; i_101_ < 0; i_101_++) {
									final int i_103_ = this.palette[this.paletteIndicators[(i_100_ >> 12) * this.width + (i_99_ >> 12)]];
									if (i_103_ != 0) {
										GraphicsLD.pixels[i_98_++] = i_103_;
									} else {
										i_98_++;
									}
									i_99_ += i_57_;
									i_100_ += i_56_;
								}
								i_97_++;
								i_60_ -= i_56_;
								i_61_ += i_57_;
								i_54_ += GraphicsLD.width;
							}
						}
					} else if (i_56_ == 0) {
						int i_104_ = i_53_;
						while (i_104_ < 0) {
							int i_105_ = i_54_;
							int i_106_ = i_60_ + (i_58_ * i_57_ >> 4);
							final int i_107_ = i_61_;
							int i_108_ = i_51_;
							if (i_107_ >= 0 && i_107_ - (this.height << 12) < 0) {
								if (i_106_ < 0) {
									final int i_109_ = (i_57_ - 1 - i_106_) / i_57_;
									i_108_ += i_109_;
									i_106_ += i_57_ * i_109_;
									i_105_ += i_109_;
								}
								int i_110_;
								if ((i_110_ = (1 + i_106_ - (this.width << 12) - i_57_) / i_57_) > i_108_) {
									i_108_ = i_110_;
								}
								for (/**/; i_108_ < 0; i_108_++) {
									final int i_111_ = this.palette[this.paletteIndicators[(i_107_ >> 12) * this.width + (i_106_ >> 12)]];
									if (i_111_ != 0) {
										GraphicsLD.pixels[i_105_++] = i_111_;
									} else {
										i_105_++;
									}
									i_106_ += i_57_;
								}
							}
							i_104_++;
							i_61_ += i_57_;
							i_54_ += GraphicsLD.width;
						}
					} else if (i_56_ < 0) {
						int i_112_ = i_53_;
						while (i_112_ < 0) {
							int i_113_ = i_54_;
							int i_114_ = i_60_ + (i_58_ * i_57_ >> 4);
							int i_115_ = i_61_ + (i_58_ * i_56_ >> 4);
							int i_116_ = i_51_;
							if (i_114_ < 0) {
								final int i_117_ = (i_57_ - 1 - i_114_) / i_57_;
								i_116_ += i_117_;
								i_114_ += i_57_ * i_117_;
								i_115_ += i_56_ * i_117_;
								i_113_ += i_117_;
							}
							int i_118_;
							if ((i_118_ = (1 + i_114_ - (this.width << 12) - i_57_) / i_57_) > i_116_) {
								i_116_ = i_118_;
							}
							if ((i_118_ = i_115_ - (this.height << 12)) >= 0) {
								i_118_ = (i_56_ - i_118_) / i_56_;
								i_116_ += i_118_;
								i_114_ += i_57_ * i_118_;
								i_115_ += i_56_ * i_118_;
								i_113_ += i_118_;
							}
							if ((i_118_ = (i_115_ - i_56_) / i_56_) > i_116_) {
								i_116_ = i_118_;
							}
							for (/**/; i_116_ < 0; i_116_++) {
								final int i_119_ = this.palette[this.paletteIndicators[(i_115_ >> 12) * this.width + (i_114_ >> 12)]];
								if (i_119_ != 0) {
									GraphicsLD.pixels[i_113_++] = i_119_;
								} else {
									i_113_++;
								}
								i_114_ += i_57_;
								i_115_ += i_56_;
							}
							i_112_++;
							i_60_ -= i_56_;
							i_61_ += i_57_;
							i_54_ += GraphicsLD.width;
						}
					} else {
						int i_120_ = i_53_;
						while (i_120_ < 0) {
							int i_121_ = i_54_;
							int i_122_ = i_60_ + (i_58_ * i_57_ >> 4);
							int i_123_ = i_61_ + (i_58_ * i_56_ >> 4);
							int i_124_ = i_51_;
							if (i_122_ < 0) {
								final int i_125_ = (i_57_ - 1 - i_122_) / i_57_;
								i_124_ += i_125_;
								i_122_ += i_57_ * i_125_;
								i_123_ += i_56_ * i_125_;
								i_121_ += i_125_;
							}
							int i_126_;
							if ((i_126_ = (1 + i_122_ - (this.width << 12) - i_57_) / i_57_) > i_124_) {
								i_124_ = i_126_;
							}
							if (i_123_ < 0) {
								i_126_ = (i_56_ - 1 - i_123_) / i_56_;
								i_124_ += i_126_;
								i_122_ += i_57_ * i_126_;
								i_123_ += i_56_ * i_126_;
								i_121_ += i_126_;
							}
							if ((i_126_ = (1 + i_123_ - (this.height << 12) - i_56_) / i_56_) > i_124_) {
								i_124_ = i_126_;
							}
							for (/**/; i_124_ < 0; i_124_++) {
								final int i_127_ = this.palette[this.paletteIndicators[(i_123_ >> 12) * this.width + (i_122_ >> 12)]];
								if (i_127_ != 0) {
									GraphicsLD.pixels[i_121_++] = i_127_;
								} else {
									i_121_++;
								}
								i_122_ += i_57_;
								i_123_ += i_56_;
							}
							i_120_++;
							i_60_ -= i_56_;
							i_61_ += i_57_;
							i_54_ += GraphicsLD.width;
						}
					}
				}
			}
		}
	}

	final void method918(int x, int y, int i_129_, int i_130_) {
		final int i_131_ = this.width;
		final int i_132_ = this.height;
		int i_133_ = 0;
		int i_134_ = 0;
		final int i_135_ = this.trimWidth;
		final int i_136_ = this.trimHeight;
		final int i_137_ = (i_135_ << 16) / i_129_;
		final int i_138_ = (i_136_ << 16) / i_130_;
		if (this.xOffset > 0) {
			final int i_139_ = ((this.xOffset << 16) + i_137_ - 1) / i_137_;
			x += i_139_;
			i_133_ += i_139_ * i_137_ - (this.xOffset << 16);
		}
		if (this.yOffset > 0) {
			final int i_140_ = ((this.yOffset << 16) + i_138_ - 1) / i_138_;
			y += i_140_;
			i_134_ += i_140_ * i_138_ - (this.yOffset << 16);
		}
		if (i_131_ < i_135_) {
			i_129_ = ((i_131_ << 16) - i_133_ + i_137_ - 1) / i_137_;
		}
		if (i_132_ < i_136_) {
			i_130_ = ((i_132_ << 16) - i_134_ + i_138_ - 1) / i_138_;
		}
		int i_141_ = x + y * GraphicsLD.width;
		int i_142_ = GraphicsLD.width - i_129_;
		if (y + i_130_ > GraphicsLD.endY) {
			i_130_ -= y + i_130_ - GraphicsLD.endY;
		}
		if (y < GraphicsLD.startY) {
			final int i_143_ = GraphicsLD.startY - y;
			i_130_ -= i_143_;
			i_141_ += i_143_ * GraphicsLD.width;
			i_134_ += i_138_ * i_143_;
		}
		if (x + i_129_ > GraphicsLD.endX) {
			final int i_144_ = x + i_129_ - GraphicsLD.endX;
			i_129_ -= i_144_;
			i_142_ += i_144_;
		}
		if (x < GraphicsLD.startX) {
			final int i_145_ = GraphicsLD.startX - x;
			i_129_ -= i_145_;
			i_141_ += i_145_;
			i_133_ += i_137_ * i_145_;
			i_142_ += i_145_;
		}
		method920(GraphicsLD.pixels, this.paletteIndicators, this.palette, i_133_, i_134_, i_141_, i_142_, i_129_, i_130_, i_137_, i_138_, i_131_);
	}

	final void method919(int i, int i_146_, int i_147_, int i_148_, final int i_149_) {
		final int i_150_ = this.width;
		final int i_151_ = this.height;
		int i_152_ = 0;
		int i_153_ = 0;
		final int i_154_ = this.trimWidth;
		final int i_155_ = this.trimHeight;
		final int i_156_ = (i_154_ << 16) / i_147_;
		final int i_157_ = (i_155_ << 16) / i_148_;
		if (this.xOffset > 0) {
			final int i_158_ = ((this.xOffset << 16) + i_156_ - 1) / i_156_;
			i += i_158_;
			i_152_ += i_158_ * i_156_ - (this.xOffset << 16);
		}
		if (this.yOffset > 0) {
			final int i_159_ = ((this.yOffset << 16) + i_157_ - 1) / i_157_;
			i_146_ += i_159_;
			i_153_ += i_159_ * i_157_ - (this.yOffset << 16);
		}
		if (i_150_ < i_154_) {
			i_147_ = ((i_150_ << 16) - i_152_ + i_156_ - 1) / i_156_;
		}
		if (i_151_ < i_155_) {
			i_148_ = ((i_151_ << 16) - i_153_ + i_157_ - 1) / i_157_;
		}
		int i_160_ = i + i_146_ * GraphicsLD.width;
		int i_161_ = GraphicsLD.width - i_147_;
		if (i_146_ + i_148_ > GraphicsLD.endY) {
			i_148_ -= i_146_ + i_148_ - GraphicsLD.endY;
		}
		if (i_146_ < GraphicsLD.startY) {
			final int i_162_ = GraphicsLD.startY - i_146_;
			i_148_ -= i_162_;
			i_160_ += i_162_ * GraphicsLD.width;
			i_153_ += i_157_ * i_162_;
		}
		if (i + i_147_ > GraphicsLD.endX) {
			final int i_163_ = i + i_147_ - GraphicsLD.endX;
			i_147_ -= i_163_;
			i_161_ += i_163_;
		}
		if (i < GraphicsLD.startX) {
			final int i_164_ = GraphicsLD.startX - i;
			i_147_ -= i_164_;
			i_160_ += i_164_;
			i_152_ += i_156_ * i_164_;
			i_161_ += i_164_;
		}
		method921(GraphicsLD.pixels, this.paletteIndicators, this.palette, i_152_, i_153_, i_160_, i_161_, i_147_, i_148_, i_156_, i_157_, i_150_, i_149_);
	}

	private static final void method920(final int[] dest, final byte[] indicators, final int[] palette, int i, int i_167_, int i_168_, final int i_169_, final int i_170_, final int i_171_, final int i_172_, final int i_173_, final int i_174_) {
		final int i_175_ = i;
		for (int i_176_ = -i_171_; i_176_ < 0; i_176_++) {
			final int i_177_ = (i_167_ >> 16) * i_174_;
			for (int i_178_ = -i_170_; i_178_ < 0; i_178_++) {
				final int i_179_ = indicators[(i >> 16) + i_177_];
				if (i_179_ != 0) {
					dest[i_168_++] = palette[i_179_ & 0xff];
				} else {
					i_168_++;
				}
				i += i_172_;
			}
			i_167_ += i_173_;
			i = i_175_;
			i_168_ += i_169_;
		}
	}

	LDIndexedSprite(final int i, final int i_180_, final int i_181_, final int i_182_, final int i_183_, final int i_184_, final byte[] is, final int[] is_185_) {
		this.trimWidth = i;
		this.trimHeight = i_180_;
		this.xOffset = i_181_;
		this.yOffset = i_182_;
		this.width = i_183_;
		this.height = i_184_;
		this.paletteIndicators = is;
		this.palette = is_185_;
	}

	private static final void method921(final int[] is, final byte[] is_186_, final int[] is_187_, int i, int i_188_, int i_189_, final int i_190_, final int i_191_, final int i_192_, final int i_193_, final int i_194_, final int i_195_, final int i_196_) {
		final int i_197_ = i;
		final int i_198_ = i_196_ >> 16 & 0xff;
		final int i_199_ = i_196_ >> 8 & 0xff;
		final int i_200_ = i_196_ & 0xff;
		for (int i_201_ = -i_192_; i_201_ < 0; i_201_++) {
			final int i_202_ = (i_188_ >> 16) * i_195_;
			for (int i_203_ = -i_191_; i_203_ < 0; i_203_++) {
				int i_204_ = is_186_[(i >> 16) + i_202_];
				if (i_204_ != 0) {
					i_204_ = is_187_[i_204_ & 0xff];
					final int i_205_ = i_204_ >> 16 & 0xff;
					final int i_206_ = i_204_ >> 8 & 0xff;
					final int i_207_ = i_204_ & 0xff;
					is[i_189_++] = (i_205_ * i_198_ >> 8 << 16) + (i_206_ * i_199_ >> 8 << 8) + (i_207_ * i_200_ >> 8);
				} else {
					i_189_++;
				}
				i += i_193_;
			}
			i_188_ += i_194_;
			i = i_197_;
			i_189_ += i_190_;
		}
	}

	private static final void method922(final int[] is, final byte[] is_208_, final int[] is_209_, int i, int i_210_, final int i_211_, final int i_212_, final int i_213_, final int i_214_, final int i_215_) {
		final int i_216_ = 256 - i_215_;
		for (int i_217_ = -i_212_; i_217_ < 0; i_217_++) {
			for (int i_218_ = -i_211_; i_218_ < 0; i_218_++) {
				int i_219_ = is_208_[i++];
				if (i_219_ != 0) {
					i_219_ = is_209_[i_219_ & 0xff];
					final int i_220_ = is[i_210_];
					is[i_210_++] = ((i_219_ & 0xff00ff) * i_215_ + (i_220_ & 0xff00ff) * i_216_ & ~0xff00ff) + ((i_219_ & 0xff00) * i_215_ + (i_220_ & 0xff00) * i_216_ & 0xff0000) >> 8;
				} else {
					i_210_++;
				}
			}
			i_210_ += i_213_;
			i += i_214_;
		}
	}

	LDIndexedSprite(final int i, final int i_221_, final int i_222_) {
		this.trimWidth = this.width = i;
		this.trimHeight = this.height = i_221_;
		this.xOffset = this.yOffset = 0;
		this.paletteIndicators = new byte[i * i_221_];
		this.palette = new int[i_222_];
	}

	@Override
	final void method910(int i, int i_223_) {
		i += this.xOffset;
		i_223_ += this.yOffset;
		int i_224_ = i + i_223_ * GraphicsLD.width;
		int i_225_ = 0;
		int i_226_ = this.height;
		int i_227_ = this.width;
		int i_228_ = GraphicsLD.width - i_227_;
		int i_229_ = 0;
		if (i_223_ < GraphicsLD.startY) {
			final int i_230_ = GraphicsLD.startY - i_223_;
			i_226_ -= i_230_;
			i_223_ = GraphicsLD.startY;
			i_225_ += i_230_ * i_227_;
			i_224_ += i_230_ * GraphicsLD.width;
		}
		if (i_223_ + i_226_ > GraphicsLD.endY) {
			i_226_ -= i_223_ + i_226_ - GraphicsLD.endY;
		}
		if (i < GraphicsLD.startX) {
			final int i_231_ = GraphicsLD.startX - i;
			i_227_ -= i_231_;
			i = GraphicsLD.startX;
			i_225_ += i_231_;
			i_224_ += i_231_;
			i_229_ += i_231_;
			i_228_ += i_231_;
		}
		if (i + i_227_ > GraphicsLD.endX) {
			final int i_232_ = i + i_227_ - GraphicsLD.endX;
			i_227_ -= i_232_;
			i_229_ += i_232_;
			i_228_ += i_232_;
		}
		if (i_227_ > 0 && i_226_ > 0) {
			method913(GraphicsLD.pixels, this.paletteIndicators, this.palette, 0, i_225_, i_224_, i_227_, i_226_, i_228_, i_229_);
		}
	}

	final void method923() {
		if (this.width != this.trimWidth || this.height != this.trimHeight) {
			final byte[] is = new byte[this.trimWidth * this.trimHeight];
			int i = 0;
			for (int i_233_ = 0; i_233_ < this.height; i_233_++) {
				for (int i_234_ = 0; i_234_ < this.width; i_234_++) {
					is[i_234_ + this.xOffset + (i_233_ + this.yOffset) * this.trimWidth] = this.paletteIndicators[i++];
				}
			}
			this.paletteIndicators = is;
			this.width = this.trimWidth;
			this.height = this.trimHeight;
			this.xOffset = 0;
			this.yOffset = 0;
		}
	}

	final void method924(int i, int i_235_, final int[] is, final int[] is_236_) {
		if (GraphicsLD.endY - GraphicsLD.startY != is.length) {
			throw new IllegalStateException();
		}
		i += this.xOffset;
		i_235_ += this.yOffset;
		int i_237_ = 0;
		int i_238_ = this.height;
		int i_239_ = this.width;
		int i_240_ = GraphicsLD.width - i_239_;
		int i_241_ = 0;
		int i_242_ = i + i_235_ * GraphicsLD.width;
		if (i_235_ < GraphicsLD.startY) {
			final int i_243_ = GraphicsLD.startY - i_235_;
			i_238_ -= i_243_;
			i_235_ = GraphicsLD.startY;
			i_237_ += i_243_ * i_239_;
			i_242_ += i_243_ * GraphicsLD.width;
		}
		if (i_235_ + i_238_ > GraphicsLD.endY) {
			i_238_ -= i_235_ + i_238_ - GraphicsLD.endY;
		}
		if (i < GraphicsLD.startX) {
			final int i_244_ = GraphicsLD.startX - i;
			i_239_ -= i_244_;
			i = GraphicsLD.startX;
			i_237_ += i_244_;
			i_242_ += i_244_;
			i_241_ += i_244_;
			i_240_ += i_244_;
		}
		if (i + i_239_ > GraphicsLD.endX) {
			final int i_245_ = i + i_239_ - GraphicsLD.endX;
			i_239_ -= i_245_;
			i_241_ += i_245_;
			i_240_ += i_245_;
		}
		if (i_239_ > 0 && i_238_ > 0) {
			final int i_246_ = i - GraphicsLD.startX;
			final int i_247_ = i_235_ - GraphicsLD.startY;
			int i_248_ = i_247_;
			for (/**/; i_248_ < i_247_ + i_238_; i_248_++) {
				final int i_249_ = is[i_248_];
				int i_250_ = is_236_[i_248_];
				int i_251_ = i_239_;
				if (i_246_ > i_249_) {
					final int i_252_ = i_246_ - i_249_;
					if (i_252_ >= i_250_) {
						i_237_ += i_239_ + i_241_;
						i_242_ += i_239_ + i_240_;
						continue;
					}
					i_250_ -= i_252_;
				} else {
					final int i_253_ = i_249_ - i_246_;
					if (i_253_ >= i_239_) {
						i_237_ += i_239_ + i_241_;
						i_242_ += i_239_ + i_240_;
						continue;
					}
					i_237_ += i_253_;
					i_251_ -= i_253_;
					i_242_ += i_253_;
				}
				int i_254_ = 0;
				if (i_251_ < i_250_) {
					i_250_ = i_251_;
				} else {
					i_254_ = i_251_ - i_250_;
				}
				for (int i_255_ = -i_250_; i_255_ < 0; i_255_++) {
					final int i_256_ = this.palette[this.paletteIndicators[i_237_++]];
					if (i_256_ != 0) {
						GraphicsLD.pixels[i_242_++] = i_256_;
					} else {
						i_242_++;
					}
				}
				i_237_ += i_254_ + i_241_;
				i_242_ += i_254_ + i_240_;
			}
		}
	}
}
