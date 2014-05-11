/* Class120_Sub14_Sub19_Sub2_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class LDTransparentSprite extends LDSprite {
	@Override
	final void method1591(int i, int i_0_) {
		i += this.offsetX;
		i_0_ += this.offsetY;
		int i_1_ = i + i_0_ * GraphicsLD.width;
		int i_2_ = 0;
		int i_3_ = this.height;
		int i_4_ = this.width;
		int i_5_ = GraphicsLD.width - i_4_;
		int i_6_ = 0;
		if (i_0_ < GraphicsLD.startY) {
			final int i_7_ = GraphicsLD.startY - i_0_;
			i_3_ -= i_7_;
			i_0_ = GraphicsLD.startY;
			i_2_ += i_7_ * i_4_;
			i_1_ += i_7_ * GraphicsLD.width;
		}
		if (i_0_ + i_3_ > GraphicsLD.endY) {
			i_3_ -= i_0_ + i_3_ - GraphicsLD.endY;
		}
		if (i < GraphicsLD.startX) {
			final int i_8_ = GraphicsLD.startX - i;
			i_4_ -= i_8_;
			i = GraphicsLD.startX;
			i_2_ += i_8_;
			i_1_ += i_8_;
			i_6_ += i_8_;
			i_5_ += i_8_;
		}
		if (i + i_4_ > GraphicsLD.endX) {
			final int i_9_ = i + i_4_ - GraphicsLD.endX;
			i_4_ -= i_9_;
			i_6_ += i_9_;
			i_5_ += i_9_;
		}
		if (i_4_ > 0 && i_3_ > 0) {
			method1621(GraphicsLD.pixels, this.pixels, 0, i_2_, i_1_, i_4_, i_3_, i_5_, i_6_);
		}
	}

	@Override
	final void method1606(int i, int i_10_, final int i_11_, final int i_12_, final int i_13_, final int i_14_, final int i_15_, final int i_16_, final int[] is, final int[] is_17_) {
		try {
			final int i_18_ = -i_11_ / 2;
			final int i_19_ = -i_12_ / 2;
			int i_20_ = (int) (Math.sin(i_15_ / 326.11) * 65536.0);
			int i_21_ = (int) (Math.cos(i_15_ / 326.11) * 65536.0);
			i_20_ = i_20_ * i_16_ >> 8;
			i_21_ = i_21_ * i_16_ >> 8;
			int i_22_ = (i_13_ << 16) + i_19_ * i_20_ + i_18_ * i_21_;
			int i_23_ = (i_14_ << 16) + i_19_ * i_21_ - i_18_ * i_20_;
			int i_24_ = i + i_10_ * GraphicsLD.width;
			for (i_10_ = 0; i_10_ < i_12_; i_10_++) {
				final int i_25_ = is[i_10_];
				int i_26_ = i_24_ + i_25_;
				int i_27_ = i_22_ + i_21_ * i_25_;
				int i_28_ = i_23_ - i_20_ * i_25_;
				for (i = -is_17_[i_10_]; i < 0; i++) {
					final int i_29_ = this.pixels[(i_27_ >> 16) + (i_28_ >> 16) * this.width];
					final int i_30_ = GraphicsLD.pixels[i_26_];
					final int i_31_ = i_29_ >>> 24;
					final int i_32_ = 256 - i_31_;
					GraphicsLD.pixels[i_26_++] = ((i_29_ & 0xff00ff) * i_31_ + (i_30_ & 0xff00ff) * i_32_ & ~0xff00ff) + ((i_29_ & 0xff00) * i_31_ + (i_30_ & 0xff00) * i_32_ & 0xff0000) >>> 8;
					i_27_ += i_21_;
					i_28_ -= i_20_;
				}
				i_22_ += i_20_;
				i_23_ += i_21_;
				i_24_ += GraphicsLD.width;
			}
		} catch (final Exception exception) {
			/* empty */
		}
	}

	LDTransparentSprite(final int i, final int i_33_) {
		super(i, i_33_);
	}

	@Override
	final void method1594(int i, int i_34_, final int i_35_) {
		i += this.offsetX;
		i_34_ += this.offsetY;
		int i_36_ = i + i_34_ * GraphicsLD.width;
		int i_37_ = 0;
		int i_38_ = this.height;
		int i_39_ = this.width;
		int i_40_ = GraphicsLD.width - i_39_;
		int i_41_ = 0;
		if (i_34_ < GraphicsLD.startY) {
			final int i_42_ = GraphicsLD.startY - i_34_;
			i_38_ -= i_42_;
			i_34_ = GraphicsLD.startY;
			i_37_ += i_42_ * i_39_;
			i_36_ += i_42_ * GraphicsLD.width;
		}
		if (i_34_ + i_38_ > GraphicsLD.endY) {
			i_38_ -= i_34_ + i_38_ - GraphicsLD.endY;
		}
		if (i < GraphicsLD.startX) {
			final int i_43_ = GraphicsLD.startX - i;
			i_39_ -= i_43_;
			i = GraphicsLD.startX;
			i_37_ += i_43_;
			i_36_ += i_43_;
			i_41_ += i_43_;
			i_40_ += i_43_;
		}
		if (i + i_39_ > GraphicsLD.endX) {
			final int i_44_ = i + i_39_ - GraphicsLD.endX;
			i_39_ -= i_44_;
			i_41_ += i_44_;
			i_40_ += i_44_;
		}
		if (i_39_ > 0 && i_38_ > 0) {
			method1625(GraphicsLD.pixels, this.pixels, 0, i_37_, i_36_, i_39_, i_38_, i_40_, i_41_, i_35_);
		}
	}

	@Override
	final void method1585(int i, int i_45_, int i_46_, int i_47_, final int i_48_) {
		if (i_46_ > 0 && i_47_ > 0) {
			final int i_49_ = this.width;
			final int i_50_ = this.height;
			int i_51_ = 0;
			int i_52_ = 0;
			final int i_53_ = this.trimWidth;
			final int i_54_ = this.trimHeight;
			final int i_55_ = (i_53_ << 16) / i_46_;
			final int i_56_ = (i_54_ << 16) / i_47_;
			if (this.offsetX > 0) {
				final int i_57_ = ((this.offsetX << 16) + i_55_ - 1) / i_55_;
				i += i_57_;
				i_51_ += i_57_ * i_55_ - (this.offsetX << 16);
			}
			if (this.offsetY > 0) {
				final int i_58_ = ((this.offsetY << 16) + i_56_ - 1) / i_56_;
				i_45_ += i_58_;
				i_52_ += i_58_ * i_56_ - (this.offsetY << 16);
			}
			if (i_49_ < i_53_) {
				i_46_ = ((i_49_ << 16) - i_51_ + i_55_ - 1) / i_55_;
			}
			if (i_50_ < i_54_) {
				i_47_ = ((i_50_ << 16) - i_52_ + i_56_ - 1) / i_56_;
			}
			int i_59_ = i + i_45_ * GraphicsLD.width;
			int i_60_ = GraphicsLD.width - i_46_;
			if (i_45_ + i_47_ > GraphicsLD.endY) {
				i_47_ -= i_45_ + i_47_ - GraphicsLD.endY;
			}
			if (i_45_ < GraphicsLD.startY) {
				final int i_61_ = GraphicsLD.startY - i_45_;
				i_47_ -= i_61_;
				i_59_ += i_61_ * GraphicsLD.width;
				i_52_ += i_56_ * i_61_;
			}
			if (i + i_46_ > GraphicsLD.endX) {
				final int i_62_ = i + i_46_ - GraphicsLD.endX;
				i_46_ -= i_62_;
				i_60_ += i_62_;
			}
			if (i < GraphicsLD.startX) {
				final int i_63_ = GraphicsLD.startX - i;
				i_46_ -= i_63_;
				i_59_ += i_63_;
				i_51_ += i_55_ * i_63_;
				i_60_ += i_63_;
			}
			method1624(GraphicsLD.pixels, this.pixels, 0, i_51_, i_52_, i_59_, i_60_, i_46_, i_47_, i_55_, i_56_, i_49_, i_48_);
		}
	}

	@Override
	final void method1589(int i, int i_64_, final int i_65_, final int i_66_, final int i_67_, final int i_68_) {
		if (i_68_ != 0) {
			i -= this.offsetX << 4;
			i_64_ -= this.offsetY << 4;
			final double d = (i_67_ & 0xffff) * 9.587379924285257E-5;
			final int i_69_ = (int) Math.floor(Math.sin(d) * i_68_ + 0.5);
			final int i_70_ = (int) Math.floor(Math.cos(d) * i_68_ + 0.5);
			final int i_71_ = -i * i_70_ + -i_64_ * i_69_;
			final int i_72_ = --i * i_69_ + -i_64_ * i_70_;
			final int i_73_ = ((this.width << 4) - i) * i_70_ + -i_64_ * i_69_;
			final int i_74_ = -((this.width << 4) - i) * i_69_ + -i_64_ * i_70_;
			final int i_75_ = -i * i_70_ + ((this.height << 4) - i_64_) * i_69_;
			final int i_76_ = --i * i_69_ + ((this.height << 4) - i_64_) * i_70_;
			final int i_77_ = ((this.width << 4) - i) * i_70_ + ((this.height << 4) - i_64_) * i_69_;
			final int i_78_ = -((this.width << 4) - i) * i_69_ + ((this.height << 4) - i_64_) * i_70_;
			int i_79_;
			int i_80_;
			if (i_71_ < i_73_) {
				i_79_ = i_71_;
				i_80_ = i_73_;
			} else {
				i_79_ = i_73_;
				i_80_ = i_71_;
			}
			if (i_75_ < i_79_) {
				i_79_ = i_75_;
			}
			if (i_77_ < i_79_) {
				i_79_ = i_77_;
			}
			if (i_75_ > i_80_) {
				i_80_ = i_75_;
			}
			if (i_77_ > i_80_) {
				i_80_ = i_77_;
			}
			int i_81_;
			int i_82_;
			if (i_72_ < i_74_) {
				i_81_ = i_72_;
				i_82_ = i_74_;
			} else {
				i_81_ = i_74_;
				i_82_ = i_72_;
			}
			if (i_76_ < i_81_) {
				i_81_ = i_76_;
			}
			if (i_78_ < i_81_) {
				i_81_ = i_78_;
			}
			if (i_76_ > i_82_) {
				i_82_ = i_76_;
			}
			if (i_78_ > i_82_) {
				i_82_ = i_78_;
			}
			i_79_ >>= 12;
			i_80_ = i_80_ + 4095 >> 12;
			i_81_ >>= 12;
			i_82_ = i_82_ + 4095 >> 12;
			i_79_ += i_65_;
			i_80_ += i_65_;
			i_81_ += i_66_;
			i_82_ += i_66_;
			i_79_ >>= 4;
			i_80_ = i_80_ + 15 >> 4;
			i_81_ >>= 4;
			i_82_ = i_82_ + 15 >> 4;
			if (i_79_ < GraphicsLD.startX) {
				i_79_ = GraphicsLD.startX;
			}
			if (i_80_ > GraphicsLD.endX) {
				i_80_ = GraphicsLD.endX;
			}
			if (i_81_ < GraphicsLD.startY) {
				i_81_ = GraphicsLD.startY;
			}
			if (i_82_ > GraphicsLD.endY) {
				i_82_ = GraphicsLD.endY;
			}
			i_80_ = i_79_ - i_80_;
			if (i_80_ < 0) {
				i_82_ = i_81_ - i_82_;
				if (i_82_ < 0) {
					int i_83_ = i_81_ * GraphicsLD.width + i_79_;
					final double d_84_ = 1.6777216E7 / i_68_;
					final int i_85_ = (int) Math.floor(Math.sin(d) * d_84_ + 0.5);
					final int i_86_ = (int) Math.floor(Math.cos(d) * d_84_ + 0.5);
					final int i_87_ = (i_79_ << 4) + 8 - i_65_;
					final int i_88_ = (i_81_ << 4) + 8 - i_66_;
					int i_89_ = (i << 8) - (i_88_ * i_85_ >> 4);
					int i_90_ = (i_64_ << 8) + (i_88_ * i_86_ >> 4);
					if (i_86_ == 0) {
						if (i_85_ == 0) {
							int i_91_ = i_82_;
							while (i_91_ < 0) {
								int i_92_ = i_83_;
								final int i_93_ = i_89_;
								final int i_94_ = i_90_;
								int i_95_ = i_80_;
								if (i_93_ >= 0 && i_94_ >= 0 && i_93_ - (this.width << 12) < 0 && i_94_ - (this.height << 12) < 0) {
									for (/**/; i_95_ < 0; i_95_++) {
										final int i_96_ = this.pixels[(i_94_ >> 12) * this.width + (i_93_ >> 12)];
										final int i_97_ = GraphicsLD.pixels[i_92_];
										final int i_98_ = i_96_ >>> 24;
										final int i_99_ = 256 - i_98_;
										GraphicsLD.pixels[i_92_++] = ((i_96_ & 0xff00ff) * i_98_ + (i_97_ & 0xff00ff) * i_99_ & ~0xff00ff) + ((i_96_ & 0xff00) * i_98_ + (i_97_ & 0xff00) * i_99_ & 0xff0000) >>> 8;
									}
								}
								i_91_++;
								i_83_ += GraphicsLD.width;
							}
						} else if (i_85_ < 0) {
							int i_100_ = i_82_;
							while (i_100_ < 0) {
								int i_101_ = i_83_;
								final int i_102_ = i_89_;
								int i_103_ = i_90_ + (i_87_ * i_85_ >> 4);
								int i_104_ = i_80_;
								if (i_102_ >= 0 && i_102_ - (this.width << 12) < 0) {
									int i_105_;
									if ((i_105_ = i_103_ - (this.height << 12)) >= 0) {
										i_105_ = (i_85_ - i_105_) / i_85_;
										i_104_ += i_105_;
										i_103_ += i_85_ * i_105_;
										i_101_ += i_105_;
									}
									if ((i_105_ = (i_103_ - i_85_) / i_85_) > i_104_) {
										i_104_ = i_105_;
									}
									for (/**/; i_104_ < 0; i_104_++) {
										final int i_106_ = this.pixels[(i_103_ >> 12) * this.width + (i_102_ >> 12)];
										final int i_107_ = GraphicsLD.pixels[i_101_];
										final int i_108_ = i_106_ >>> 24;
										final int i_109_ = 256 - i_108_;
										GraphicsLD.pixels[i_101_++] = ((i_106_ & 0xff00ff) * i_108_ + (i_107_ & 0xff00ff) * i_109_ & ~0xff00ff) + ((i_106_ & 0xff00) * i_108_ + (i_107_ & 0xff00) * i_109_ & 0xff0000) >>> 8;
										i_103_ += i_85_;
									}
								}
								i_100_++;
								i_89_ -= i_85_;
								i_83_ += GraphicsLD.width;
							}
						} else {
							int i_110_ = i_82_;
							while (i_110_ < 0) {
								int i_111_ = i_83_;
								final int i_112_ = i_89_;
								int i_113_ = i_90_ + (i_87_ * i_85_ >> 4);
								int i_114_ = i_80_;
								if (i_112_ >= 0 && i_112_ - (this.width << 12) < 0) {
									if (i_113_ < 0) {
										final int i_115_ = (i_85_ - 1 - i_113_) / i_85_;
										i_114_ += i_115_;
										i_113_ += i_85_ * i_115_;
										i_111_ += i_115_;
									}
									int i_116_;
									if ((i_116_ = (1 + i_113_ - (this.height << 12) - i_85_) / i_85_) > i_114_) {
										i_114_ = i_116_;
									}
									for (/**/; i_114_ < 0; i_114_++) {
										final int i_117_ = this.pixels[(i_113_ >> 12) * this.width + (i_112_ >> 12)];
										final int i_118_ = GraphicsLD.pixels[i_111_];
										final int i_119_ = i_117_ >>> 24;
										final int i_120_ = 256 - i_119_;
										GraphicsLD.pixels[i_111_++] = ((i_117_ & 0xff00ff) * i_119_ + (i_118_ & 0xff00ff) * i_120_ & ~0xff00ff) + ((i_117_ & 0xff00) * i_119_ + (i_118_ & 0xff00) * i_120_ & 0xff0000) >>> 8;
										i_113_ += i_85_;
									}
								}
								i_110_++;
								i_89_ -= i_85_;
								i_83_ += GraphicsLD.width;
							}
						}
					} else if (i_86_ < 0) {
						if (i_85_ == 0) {
							int i_121_ = i_82_;
							while (i_121_ < 0) {
								int i_122_ = i_83_;
								int i_123_ = i_89_ + (i_87_ * i_86_ >> 4);
								final int i_124_ = i_90_;
								int i_125_ = i_80_;
								if (i_124_ >= 0 && i_124_ - (this.height << 12) < 0) {
									int i_126_;
									if ((i_126_ = i_123_ - (this.width << 12)) >= 0) {
										i_126_ = (i_86_ - i_126_) / i_86_;
										i_125_ += i_126_;
										i_123_ += i_86_ * i_126_;
										i_122_ += i_126_;
									}
									if ((i_126_ = (i_123_ - i_86_) / i_86_) > i_125_) {
										i_125_ = i_126_;
									}
									for (/**/; i_125_ < 0; i_125_++) {
										final int i_127_ = this.pixels[(i_124_ >> 12) * this.width + (i_123_ >> 12)];
										final int i_128_ = GraphicsLD.pixels[i_122_];
										final int i_129_ = i_127_ >>> 24;
										final int i_130_ = 256 - i_129_;
										GraphicsLD.pixels[i_122_++] = ((i_127_ & 0xff00ff) * i_129_ + (i_128_ & 0xff00ff) * i_130_ & ~0xff00ff) + ((i_127_ & 0xff00) * i_129_ + (i_128_ & 0xff00) * i_130_ & 0xff0000) >>> 8;
										i_123_ += i_86_;
									}
								}
								i_121_++;
								i_90_ += i_86_;
								i_83_ += GraphicsLD.width;
							}
						} else if (i_85_ < 0) {
							int i_131_ = i_82_;
							while (i_131_ < 0) {
								int i_132_ = i_83_;
								int i_133_ = i_89_ + (i_87_ * i_86_ >> 4);
								int i_134_ = i_90_ + (i_87_ * i_85_ >> 4);
								int i_135_ = i_80_;
								int i_136_;
								if ((i_136_ = i_133_ - (this.width << 12)) >= 0) {
									i_136_ = (i_86_ - i_136_) / i_86_;
									i_135_ += i_136_;
									i_133_ += i_86_ * i_136_;
									i_134_ += i_85_ * i_136_;
									i_132_ += i_136_;
								}
								if ((i_136_ = (i_133_ - i_86_) / i_86_) > i_135_) {
									i_135_ = i_136_;
								}
								if ((i_136_ = i_134_ - (this.height << 12)) >= 0) {
									i_136_ = (i_85_ - i_136_) / i_85_;
									i_135_ += i_136_;
									i_133_ += i_86_ * i_136_;
									i_134_ += i_85_ * i_136_;
									i_132_ += i_136_;
								}
								if ((i_136_ = (i_134_ - i_85_) / i_85_) > i_135_) {
									i_135_ = i_136_;
								}
								for (/**/; i_135_ < 0; i_135_++) {
									final int i_137_ = this.pixels[(i_134_ >> 12) * this.width + (i_133_ >> 12)];
									final int i_138_ = GraphicsLD.pixels[i_132_];
									final int i_139_ = i_137_ >>> 24;
									final int i_140_ = 256 - i_139_;
									GraphicsLD.pixels[i_132_++] = ((i_137_ & 0xff00ff) * i_139_ + (i_138_ & 0xff00ff) * i_140_ & ~0xff00ff) + ((i_137_ & 0xff00) * i_139_ + (i_138_ & 0xff00) * i_140_ & 0xff0000) >>> 8;
									i_133_ += i_86_;
									i_134_ += i_85_;
								}
								i_131_++;
								i_89_ -= i_85_;
								i_90_ += i_86_;
								i_83_ += GraphicsLD.width;
							}
						} else {
							int i_141_ = i_82_;
							while (i_141_ < 0) {
								int i_142_ = i_83_;
								int i_143_ = i_89_ + (i_87_ * i_86_ >> 4);
								int i_144_ = i_90_ + (i_87_ * i_85_ >> 4);
								int i_145_ = i_80_;
								int i_146_;
								if ((i_146_ = i_143_ - (this.width << 12)) >= 0) {
									i_146_ = (i_86_ - i_146_) / i_86_;
									i_145_ += i_146_;
									i_143_ += i_86_ * i_146_;
									i_144_ += i_85_ * i_146_;
									i_142_ += i_146_;
								}
								if ((i_146_ = (i_143_ - i_86_) / i_86_) > i_145_) {
									i_145_ = i_146_;
								}
								if (i_144_ < 0) {
									i_146_ = (i_85_ - 1 - i_144_) / i_85_;
									i_145_ += i_146_;
									i_143_ += i_86_ * i_146_;
									i_144_ += i_85_ * i_146_;
									i_142_ += i_146_;
								}
								if ((i_146_ = (1 + i_144_ - (this.height << 12) - i_85_) / i_85_) > i_145_) {
									i_145_ = i_146_;
								}
								for (/**/; i_145_ < 0; i_145_++) {
									final int i_147_ = this.pixels[(i_144_ >> 12) * this.width + (i_143_ >> 12)];
									final int i_148_ = GraphicsLD.pixels[i_142_];
									final int i_149_ = i_147_ >>> 24;
									final int i_150_ = 256 - i_149_;
									GraphicsLD.pixels[i_142_++] = ((i_147_ & 0xff00ff) * i_149_ + (i_148_ & 0xff00ff) * i_150_ & ~0xff00ff) + ((i_147_ & 0xff00) * i_149_ + (i_148_ & 0xff00) * i_150_ & 0xff0000) >>> 8;
									i_143_ += i_86_;
									i_144_ += i_85_;
								}
								i_141_++;
								i_89_ -= i_85_;
								i_90_ += i_86_;
								i_83_ += GraphicsLD.width;
							}
						}
					} else if (i_85_ == 0) {
						int i_151_ = i_82_;
						while (i_151_ < 0) {
							int i_152_ = i_83_;
							int i_153_ = i_89_ + (i_87_ * i_86_ >> 4);
							final int i_154_ = i_90_;
							int i_155_ = i_80_;
							if (i_154_ >= 0 && i_154_ - (this.height << 12) < 0) {
								if (i_153_ < 0) {
									final int i_156_ = (i_86_ - 1 - i_153_) / i_86_;
									i_155_ += i_156_;
									i_153_ += i_86_ * i_156_;
									i_152_ += i_156_;
								}
								int i_157_;
								if ((i_157_ = (1 + i_153_ - (this.width << 12) - i_86_) / i_86_) > i_155_) {
									i_155_ = i_157_;
								}
								for (/**/; i_155_ < 0; i_155_++) {
									final int i_158_ = this.pixels[(i_154_ >> 12) * this.width + (i_153_ >> 12)];
									final int i_159_ = GraphicsLD.pixels[i_152_];
									final int i_160_ = i_158_ >>> 24;
									final int i_161_ = 256 - i_160_;
									GraphicsLD.pixels[i_152_++] = ((i_158_ & 0xff00ff) * i_160_ + (i_159_ & 0xff00ff) * i_161_ & ~0xff00ff) + ((i_158_ & 0xff00) * i_160_ + (i_159_ & 0xff00) * i_161_ & 0xff0000) >>> 8;
									i_153_ += i_86_;
								}
							}
							i_151_++;
							i_90_ += i_86_;
							i_83_ += GraphicsLD.width;
						}
					} else if (i_85_ < 0) {
						int i_162_ = i_82_;
						while (i_162_ < 0) {
							int i_163_ = i_83_;
							int i_164_ = i_89_ + (i_87_ * i_86_ >> 4);
							int i_165_ = i_90_ + (i_87_ * i_85_ >> 4);
							int i_166_ = i_80_;
							if (i_164_ < 0) {
								final int i_167_ = (i_86_ - 1 - i_164_) / i_86_;
								i_166_ += i_167_;
								i_164_ += i_86_ * i_167_;
								i_165_ += i_85_ * i_167_;
								i_163_ += i_167_;
							}
							int i_168_;
							if ((i_168_ = (1 + i_164_ - (this.width << 12) - i_86_) / i_86_) > i_166_) {
								i_166_ = i_168_;
							}
							if ((i_168_ = i_165_ - (this.height << 12)) >= 0) {
								i_168_ = (i_85_ - i_168_) / i_85_;
								i_166_ += i_168_;
								i_164_ += i_86_ * i_168_;
								i_165_ += i_85_ * i_168_;
								i_163_ += i_168_;
							}
							if ((i_168_ = (i_165_ - i_85_) / i_85_) > i_166_) {
								i_166_ = i_168_;
							}
							for (/**/; i_166_ < 0; i_166_++) {
								final int i_169_ = this.pixels[(i_165_ >> 12) * this.width + (i_164_ >> 12)];
								final int i_170_ = GraphicsLD.pixels[i_163_];
								final int i_171_ = i_169_ >>> 24;
								final int i_172_ = 256 - i_171_;
								GraphicsLD.pixels[i_163_++] = ((i_169_ & 0xff00ff) * i_171_ + (i_170_ & 0xff00ff) * i_172_ & ~0xff00ff) + ((i_169_ & 0xff00) * i_171_ + (i_170_ & 0xff00) * i_172_ & 0xff0000) >>> 8;
								i_164_ += i_86_;
								i_165_ += i_85_;
							}
							i_162_++;
							i_89_ -= i_85_;
							i_90_ += i_86_;
							i_83_ += GraphicsLD.width;
						}
					} else {
						int i_173_ = i_82_;
						while (i_173_ < 0) {
							int i_174_ = i_83_;
							int i_175_ = i_89_ + (i_87_ * i_86_ >> 4);
							int i_176_ = i_90_ + (i_87_ * i_85_ >> 4);
							int i_177_ = i_80_;
							if (i_175_ < 0) {
								final int i_178_ = (i_86_ - 1 - i_175_) / i_86_;
								i_177_ += i_178_;
								i_175_ += i_86_ * i_178_;
								i_176_ += i_85_ * i_178_;
								i_174_ += i_178_;
							}
							int i_179_;
							if ((i_179_ = (1 + i_175_ - (this.width << 12) - i_86_) / i_86_) > i_177_) {
								i_177_ = i_179_;
							}
							if (i_176_ < 0) {
								i_179_ = (i_85_ - 1 - i_176_) / i_85_;
								i_177_ += i_179_;
								i_175_ += i_86_ * i_179_;
								i_176_ += i_85_ * i_179_;
								i_174_ += i_179_;
							}
							if ((i_179_ = (1 + i_176_ - (this.height << 12) - i_85_) / i_85_) > i_177_) {
								i_177_ = i_179_;
							}
							for (/**/; i_177_ < 0; i_177_++) {
								final int i_180_ = this.pixels[(i_176_ >> 12) * this.width + (i_175_ >> 12)];
								final int i_181_ = GraphicsLD.pixels[i_174_];
								final int i_182_ = i_180_ >>> 24;
								final int i_183_ = 256 - i_182_;
								GraphicsLD.pixels[i_174_++] = ((i_180_ & 0xff00ff) * i_182_ + (i_181_ & 0xff00ff) * i_183_ & ~0xff00ff) + ((i_180_ & 0xff00) * i_182_ + (i_181_ & 0xff00) * i_183_ & 0xff0000) >>> 8;
								i_175_ += i_86_;
								i_176_ += i_85_;
							}
							i_173_++;
							i_89_ -= i_85_;
							i_90_ += i_86_;
							i_83_ += GraphicsLD.width;
						}
					}
				}
			}
		}
	}

	@Override
	final void method1604(int i, int i_184_, final int i_185_, final int i_186_, final int i_187_, final int i_188_, final int i_189_, final int i_190_, final int[] is, final int[] is_191_) {
		try {
			final int i_192_ = -i_185_ / 2;
			final int i_193_ = -i_186_ / 2;
			int i_194_ = (int) (Math.sin(i_189_ / 326.11) * 65536.0);
			int i_195_ = (int) (Math.cos(i_189_ / 326.11) * 65536.0);
			i_194_ = i_194_ * i_190_ >> 8;
			i_195_ = i_195_ * i_190_ >> 8;
			int i_196_ = (i_187_ << 16) + i_193_ * i_194_ + i_192_ * i_195_;
			int i_197_ = (i_188_ << 16) + i_193_ * i_195_ - i_192_ * i_194_;
			int i_198_ = i + i_184_ * GraphicsLD.width;
			for (i_184_ = 0; i_184_ < i_186_; i_184_++) {
				final int i_199_ = is[i_184_];
				int i_200_ = i_198_ + i_199_;
				int i_201_ = i_196_ + i_195_ * i_199_;
				int i_202_ = i_197_ - i_194_ * i_199_;
				for (i = -is_191_[i_184_]; i < 0; i++) {
					final int i_203_ = this.pixels[(i_201_ >> 16) + (i_202_ >> 16) * this.width];
					final int i_204_ = GraphicsLD.pixels[i_200_];
					final int i_205_ = i_203_ >>> 24;
					final int i_206_ = 256 - i_205_;
					GraphicsLD.pixels[i_200_++] = ((i_203_ & 0xff00ff) * i_205_ + (i_204_ & 0xff00ff) * i_206_ & ~0xff00ff) + ((i_203_ & 0xff00) * i_205_ + (i_204_ & 0xff00) * i_206_ & 0xff0000) >>> 8;
					i_201_ += i_195_;
					i_202_ -= i_194_;
				}
				i_196_ += i_194_;
				i_197_ += i_195_;
				i_198_ += GraphicsLD.width;
			}
		} catch (final Exception exception) {
			/* empty */
		}
	}

	@Override
	final int[] method1609() {
		return this.pixels;
	}

	private static final void method1621(final int[] is, final int[] is_207_, int i, int i_208_, int i_209_, final int i_210_, final int i_211_, final int i_212_, final int i_213_) {
		final int i_214_ = -i_210_;
		for (int i_215_ = -i_211_; i_215_ < 0; i_215_++) {
			for (int i_216_ = i_214_; i_216_ < 0; i_216_++) {
				i = is_207_[i_208_++];
				final int i_217_ = i >>> 24;
				if (i_217_ != 0) {
					final int i_218_ = 256 - i_217_;
					final int i_219_ = is[i_209_];
					is[i_209_++] = ((i & 0xff00ff) * i_217_ + (i_219_ & 0xff00ff) * i_218_ & ~0xff00ff) + ((i & 0xff00) * i_217_ + (i_219_ & 0xff00) * i_218_ & 0xff0000) >>> 8;
				} else {
					i_209_++;
				}
			}
			i_209_ += i_212_;
			i_208_ += i_213_;
		}
	}

	@Override
	final void method1588(int i, int i_220_, int i_221_, int i_222_) {
		if (i_221_ > 0 && i_222_ > 0) {
			final int i_223_ = this.width;
			final int i_224_ = this.height;
			int i_225_ = 0;
			int i_226_ = 0;
			final int i_227_ = this.trimWidth;
			final int i_228_ = this.trimHeight;
			final int i_229_ = (i_227_ << 16) / i_221_;
			final int i_230_ = (i_228_ << 16) / i_222_;
			if (this.offsetX > 0) {
				final int i_231_ = ((this.offsetX << 16) + i_229_ - 1) / i_229_;
				i += i_231_;
				i_225_ += i_231_ * i_229_ - (this.offsetX << 16);
			}
			if (this.offsetY > 0) {
				final int i_232_ = ((this.offsetY << 16) + i_230_ - 1) / i_230_;
				i_220_ += i_232_;
				i_226_ += i_232_ * i_230_ - (this.offsetY << 16);
			}
			if (i_223_ < i_227_) {
				i_221_ = ((i_223_ << 16) - i_225_ + i_229_ - 1) / i_229_;
			}
			if (i_224_ < i_228_) {
				i_222_ = ((i_224_ << 16) - i_226_ + i_230_ - 1) / i_230_;
			}
			int i_233_ = i + i_220_ * GraphicsLD.width;
			int i_234_ = GraphicsLD.width - i_221_;
			if (i_220_ + i_222_ > GraphicsLD.endY) {
				i_222_ -= i_220_ + i_222_ - GraphicsLD.endY;
			}
			if (i_220_ < GraphicsLD.startY) {
				final int i_235_ = GraphicsLD.startY - i_220_;
				i_222_ -= i_235_;
				i_233_ += i_235_ * GraphicsLD.width;
				i_226_ += i_230_ * i_235_;
			}
			if (i + i_221_ > GraphicsLD.endX) {
				final int i_236_ = i + i_221_ - GraphicsLD.endX;
				i_221_ -= i_236_;
				i_234_ += i_236_;
			}
			if (i < GraphicsLD.startX) {
				final int i_237_ = GraphicsLD.startX - i;
				i_221_ -= i_237_;
				i_233_ += i_237_;
				i_225_ += i_229_ * i_237_;
				i_234_ += i_237_;
			}
			method1623(GraphicsLD.pixels, this.pixels, 0, i_225_, i_226_, i_233_, i_234_, i_221_, i_222_, i_229_, i_230_, i_223_);
		}
	}

	LDTransparentSprite(final int i, final int i_238_, final int i_239_, final int i_240_, final int i_241_, final int i_242_, final int[] is) {
		super(i, i_238_, i_239_, i_240_, i_241_, i_242_, is);
	}

	private static final void method1622(final int[] is, final int[] is_243_, int i, int i_244_, int i_245_, final int i_246_, final int i_247_, final int i_248_, final int i_249_) {
		final int i_250_ = -i_246_;
		for (int i_251_ = -i_247_; i_251_ < 0; i_251_++) {
			for (int i_252_ = i_250_; i_252_ < 0; i_252_++) {
				i = is_243_[i_244_--];
				final int i_253_ = i >>> 24;
				if (i_253_ != 0) {
					final int i_254_ = 256 - i_253_;
					final int i_255_ = is[i_245_];
					is[i_245_++] = ((i & 0xff00ff) * i_253_ + (i_255_ & 0xff00ff) * i_254_ & ~0xff00ff) + ((i & 0xff00) * i_253_ + (i_255_ & 0xff00) * i_254_ & 0xff0000) >>> 8;
				} else {
					i_245_++;
				}
			}
			i_245_ += i_248_;
			i_244_ += i_249_;
		}
	}

	@Override
	final void method1612(int i, int i_256_, final int i_257_, final int i_258_, final int i_259_, final int i_260_, final double d, final int i_261_) {
		try {
			final int i_262_ = -i_257_ / 2;
			final int i_263_ = -i_258_ / 2;
			int i_264_ = (int) (Math.sin(d) * 65536.0);
			int i_265_ = (int) (Math.cos(d) * 65536.0);
			i_264_ = i_264_ * i_261_ >> 8;
			i_265_ = i_265_ * i_261_ >> 8;
			int i_266_ = (i_259_ << 16) + i_263_ * i_264_ + i_262_ * i_265_;
			int i_267_ = (i_260_ << 16) + i_263_ * i_265_ - i_262_ * i_264_;
			int i_268_ = i + i_256_ * GraphicsLD.width;
			for (i_256_ = 0; i_256_ < i_258_; i_256_++) {
				int i_269_ = i_268_;
				int i_270_ = i_266_;
				int i_271_ = i_267_;
				for (i = -i_257_; i < 0; i++) {
					final int i_272_ = this.pixels[(i_270_ >> 16) + (i_271_ >> 16) * this.width];
					final int i_273_ = GraphicsLD.pixels[i_269_];
					final int i_274_ = i_272_ >>> 24;
					final int i_275_ = 256 - i_274_;
					GraphicsLD.pixels[i_269_++] = ((i_272_ & 0xff00ff) * i_274_ + (i_273_ & 0xff00ff) * i_275_ & ~0xff00ff) + ((i_272_ & 0xff00) * i_274_ + (i_273_ & 0xff00) * i_275_ & 0xff0000) >>> 8;
					i_270_ += i_265_;
					i_271_ -= i_264_;
				}
				i_266_ += i_264_;
				i_267_ += i_265_;
				i_268_ += GraphicsLD.width;
			}
		} catch (final Exception exception) {
			/* empty */
		}
	}

	private static final void method1623(final int[] is, final int[] is_276_, int i, int i_277_, int i_278_, int i_279_, final int i_280_, final int i_281_, final int i_282_, final int i_283_, final int i_284_, final int i_285_) {
		final int i_286_ = i_277_;
		for (int i_287_ = -i_282_; i_287_ < 0; i_287_++) {
			final int i_288_ = (i_278_ >> 16) * i_285_;
			for (int i_289_ = -i_281_; i_289_ < 0; i_289_++) {
				i = is_276_[(i_277_ >> 16) + i_288_];
				final int i_290_ = i >>> 24;
				if (i_290_ != 0) {
					final int i_291_ = 256 - i_290_;
					final int i_292_ = is[i_279_];
					is[i_279_++] = ((i & 0xff00ff) * i_290_ + (i_292_ & 0xff00ff) * i_291_ & ~0xff00ff) + ((i & 0xff00) * i_290_ + (i_292_ & 0xff00) * i_291_ & 0xff0000) >>> 8;
				} else {
					i_279_++;
				}
				i_277_ += i_283_;
			}
			i_278_ += i_284_;
			i_277_ = i_286_;
			i_279_ += i_280_;
		}
	}

	@Override
	final void method1592(int i, int i_293_) {
		i += this.trimWidth - this.width - this.offsetX;
		i_293_ += this.offsetY;
		int i_294_ = i + i_293_ * GraphicsLD.width;
		int i_295_ = this.width - 1;
		int i_296_ = this.height;
		int i_297_ = this.width;
		int i_298_ = GraphicsLD.width - i_297_;
		int i_299_ = i_297_ + i_297_;
		if (i_293_ < GraphicsLD.startY) {
			final int i_300_ = GraphicsLD.startY - i_293_;
			i_296_ -= i_300_;
			i_293_ = GraphicsLD.startY;
			i_295_ += i_300_ * i_297_;
			i_294_ += i_300_ * GraphicsLD.width;
		}
		if (i_293_ + i_296_ > GraphicsLD.endY) {
			i_296_ -= i_293_ + i_296_ - GraphicsLD.endY;
		}
		if (i < GraphicsLD.startX) {
			final int i_301_ = GraphicsLD.startX - i;
			i_297_ -= i_301_;
			i = GraphicsLD.startX;
			i_295_ -= i_301_;
			i_294_ += i_301_;
			i_299_ -= i_301_;
			i_298_ += i_301_;
		}
		if (i + i_297_ > GraphicsLD.endX) {
			final int i_302_ = i + i_297_ - GraphicsLD.endX;
			i_297_ -= i_302_;
			i_299_ -= i_302_;
			i_298_ += i_302_;
		}
		if (i_297_ > 0 && i_296_ > 0) {
			method1622(GraphicsLD.pixels, this.pixels, 0, i_295_, i_294_, i_297_, i_296_, i_298_, i_299_);
		}
	}

	private static final void method1624(final int[] is, final int[] is_303_, final int i, int i_304_, int i_305_, int i_306_, final int i_307_, final int i_308_, final int i_309_, final int i_310_, final int i_311_, final int i_312_, final int i_313_) {
		final int i_314_ = i_304_;
		for (int i_315_ = -i_309_; i_315_ < 0; i_315_++) {
			final int i_316_ = (i_305_ >> 16) * i_312_;
			for (int i_317_ = -i_308_; i_317_ < 0; i_317_++) {
				final int i_318_ = is_303_[(i_304_ >> 16) + i_316_];
				final int i_319_ = is[i_306_];
				final int i_320_ = (i_318_ >>> 24) * i_313_ >> 8;
				final int i_321_ = 256 - i_320_;
				is[i_306_++] = ((i_318_ & 0xff00ff) * i_320_ + (i_319_ & 0xff00ff) * i_321_ & ~0xff00ff) + ((i_318_ & 0xff00) * i_320_ + (i_319_ & 0xff00) * i_321_ & 0xff0000) >>> 8;
				i_304_ += i_310_;
			}
			i_305_ += i_311_;
			i_304_ = i_314_;
			i_306_ += i_307_;
		}
	}

	private static final void method1625(final int[] is, final int[] is_322_, final int i, int i_323_, int i_324_, final int i_325_, final int i_326_, final int i_327_, final int i_328_, final int i_329_) {
		for (int i_330_ = -i_326_; i_330_ < 0; i_330_++) {
			for (int i_331_ = -i_325_; i_331_ < 0; i_331_++) {
				final int i_332_ = (is_322_[i_323_] >>> 24) * i_329_ >> 8;
				final int i_333_ = 256 - i_332_;
				final int i_334_ = is_322_[i_323_++];
				final int i_335_ = is[i_324_];
				is[i_324_++] = ((i_334_ & 0xff00ff) * i_332_ + (i_335_ & 0xff00ff) * i_333_ & ~0xff00ff) + ((i_334_ & 0xff00) * i_332_ + (i_335_ & 0xff00) * i_333_ & 0xff0000) >>> 8;
			}
			i_324_ += i_327_;
			i_323_ += i_328_;
		}
	}

	@Override
	final void method1587(int i, int i_336_) {
		i += this.offsetX;
		i_336_ += this.offsetY;
		int i_337_ = i + i_336_ * GraphicsLD.width;
		int i_338_ = 0;
		int i_339_ = this.height;
		int i_340_ = this.width;
		int i_341_ = GraphicsLD.width - i_340_;
		int i_342_ = 0;
		if (i_336_ < GraphicsLD.startY) {
			final int i_343_ = GraphicsLD.startY - i_336_;
			i_339_ -= i_343_;
			i_336_ = GraphicsLD.startY;
			i_338_ += i_343_ * i_340_;
			i_337_ += i_343_ * GraphicsLD.width;
		}
		if (i_336_ + i_339_ > GraphicsLD.endY) {
			i_339_ -= i_336_ + i_339_ - GraphicsLD.endY;
		}
		if (i < GraphicsLD.startX) {
			final int i_344_ = GraphicsLD.startX - i;
			i_340_ -= i_344_;
			i = GraphicsLD.startX;
			i_338_ += i_344_;
			i_337_ += i_344_;
			i_342_ += i_344_;
			i_341_ += i_344_;
		}
		if (i + i_340_ > GraphicsLD.endX) {
			final int i_345_ = i + i_340_ - GraphicsLD.endX;
			i_340_ -= i_345_;
			i_342_ += i_345_;
			i_341_ += i_345_;
		}
		if (i_340_ > 0 && i_339_ > 0) {
			method1621(GraphicsLD.pixels, this.pixels, 0, i_338_, i_337_, i_340_, i_339_, i_341_, i_342_);
		}
	}
}
