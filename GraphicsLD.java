/* Class165 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class GraphicsLD {
	static int startY = 0;
	static int[] anIntArray1604;
	static int[] anIntArray1605;
	static int height;
	static int startX;
	static int endX = 0;
	static int[] pixels;
	static int endY;
	static int width;

	static {
		startX = 0;
		endY = 0;
	}

	static final void method2150(int i, int i_0_, int i_1_, int i_2_, final int i_3_) {
		i_1_ -= i;
		i_2_ -= i_0_;
		if (i_2_ == 0) {
			if (i_1_ >= 0) {
				method2160(i, i_0_, i_1_ + 1, i_3_);
			} else {
				method2160(i + i_1_, i_0_, -i_1_ + 1, i_3_);
			}
		} else if (i_1_ == 0) {
			if (i_2_ >= 0) {
				method2158(i, i_0_, i_2_ + 1, i_3_);
			} else {
				method2158(i, i_0_ + i_2_, -i_2_ + 1, i_3_);
			}
		} else {
			if (i_1_ + i_2_ < 0) {
				i += i_1_;
				i_1_ = -i_1_;
				i_0_ += i_2_;
				i_2_ = -i_2_;
			}
			if (i_1_ > i_2_) {
				i_0_ <<= 16;
				i_0_ += 32768;
				i_2_ <<= 16;
				final int i_4_ = (int) Math.floor((double) i_2_ / (double) i_1_ + 0.5);
				i_1_ += i;
				if (i < startX) {
					i_0_ += i_4_ * (startX - i);
					i = startX;
				}
				if (i_1_ >= endX) {
					i_1_ = endX - 1;
				}
				for (/**/; i <= i_1_; i++) {
					final int i_5_ = i_0_ >> 16;
					if (i_5_ >= startY && i_5_ < endY) {
						pixels[i + i_5_ * width] = i_3_;
					}
					i_0_ += i_4_;
				}
			} else {
				i <<= 16;
				i += 32768;
				i_1_ <<= 16;
				final int i_6_ = (int) Math.floor((double) i_1_ / (double) i_2_ + 0.5);
				i_2_ += i_0_;
				if (i_0_ < startY) {
					i += i_6_ * (startY - i_0_);
					i_0_ = startY;
				}
				if (i_2_ >= endY) {
					i_2_ = endY - 1;
				}
				for (/**/; i_0_ <= i_2_; i_0_++) {
					final int i_7_ = i >> 16;
					if (i_7_ >= startX && i_7_ < endX) {
						pixels[i_7_ + i_0_ * width] = i_3_;
					}
					i += i_6_;
				}
			}
		}
	}

	static final void fillRect(int x, int y, int w, int h, final int color) {
		if (x < startX) {
			w -= startX - x;
			x = startX;
		}
		if (y < startY) {
			h -= startY - y;
			y = startY;
		}
		if (x + w > endX) {
			w = endX - x;
		}
		if (y + h > endY) {
			h = endY - y;
		}
		final int i_12_ = width - w;
		int i_13_ = x + y * width;
		for (int i_14_ = -h; i_14_ < 0; i_14_++) {
			for (int i_15_ = -w; i_15_ < 0; i_15_++) {
				pixels[i_13_++] = color;
			}
			i_13_ += i_12_;
		}
	}

	static final void method2152(final int x, int y, int size, final int color, final int alpha) {
		if (alpha != 0) {
			if (alpha == 256) {
				method2154(x, y, size, color);
			} else {
				if (size < 0) {
					size = -size;
				}
				final int i_20_ = 256 - alpha;
				final int i_21_ = (color >> 16 & 0xff) * alpha;
				final int i_22_ = (color >> 8 & 0xff) * alpha;
				final int i_23_ = (color & 0xff) * alpha;
				int i_24_ = y - size;
				if (i_24_ < startY) {
					i_24_ = startY;
				}
				int i_25_ = y + size + 1;
				if (i_25_ > endY) {
					i_25_ = endY;
				}
				int i_26_ = i_24_;
				final int i_27_ = size * size;
				int i_28_ = 0;
				int i_29_ = y - i_26_;
				int i_30_ = i_29_ * i_29_;
				int i_31_ = i_30_ - i_29_;
				if (y > i_25_) {
					y = i_25_;
				}
				while (i_26_ < y) {
					for (/**/; i_31_ <= i_27_ || i_30_ <= i_27_; i_31_ += i_28_++ + i_28_) {
						i_30_ += i_28_ + i_28_;
					}
					int i_32_ = x - i_28_ + 1;
					if (i_32_ < startX) {
						i_32_ = startX;
					}
					int i_33_ = x + i_28_;
					if (i_33_ > endX) {
						i_33_ = endX;
					}
					int i_34_ = i_32_ + i_26_ * width;
					for (int i_35_ = i_32_; i_35_ < i_33_; i_35_++) {
						final int i_36_ = (pixels[i_34_] >> 16 & 0xff) * i_20_;
						final int i_37_ = (pixels[i_34_] >> 8 & 0xff) * i_20_;
						final int i_38_ = (pixels[i_34_] & 0xff) * i_20_;
						final int i_39_ = (i_21_ + i_36_ >> 8 << 16) + (i_22_ + i_37_ >> 8 << 8) + (i_23_ + i_38_ >> 8);
						pixels[i_34_++] = i_39_;
					}
					i_26_++;
					i_30_ -= i_29_-- + i_29_;
					i_31_ -= i_29_ + i_29_;
				}
				i_28_ = size;
				i_29_ = -i_29_;
				i_31_ = i_29_ * i_29_ + i_27_;
				i_30_ = i_31_ - i_28_;
				i_31_ -= i_29_;
				while (i_26_ < i_25_) {
					for (/**/; i_31_ > i_27_ && i_30_ > i_27_; i_30_ -= i_28_ + i_28_) {
						i_31_ -= i_28_-- + i_28_;
					}
					int i_40_ = x - i_28_;
					if (i_40_ < startX) {
						i_40_ = startX;
					}
					int i_41_ = x + i_28_;
					if (i_41_ > endX - 1) {
						i_41_ = endX - 1;
					}
					int i_42_ = i_40_ + i_26_ * width;
					for (int i_43_ = i_40_; i_43_ <= i_41_; i_43_++) {
						final int i_44_ = (pixels[i_42_] >> 16 & 0xff) * i_20_;
						final int i_45_ = (pixels[i_42_] >> 8 & 0xff) * i_20_;
						final int i_46_ = (pixels[i_42_] & 0xff) * i_20_;
						final int i_47_ = (i_21_ + i_44_ >> 8 << 16) + (i_22_ + i_45_ >> 8 << 8) + (i_23_ + i_46_ >> 8);
						pixels[i_42_++] = i_47_;
					}
					i_26_++;
					i_31_ += i_29_ + i_29_;
					i_30_ += i_29_++ + i_29_;
				}
			}
		}
	}

	private static final void method2153(final int i, int i_48_, int i_49_, final int i_50_, final int i_51_, final int[] is, final int[] is_52_) {
		if (endY - startY != is.length) {
			throw new IllegalStateException();
		}
		if (i >= startX && i < endX) {
			if (i_48_ < startY) {
				i_49_ -= startY - i_48_;
				i_48_ = startY;
			}
			if (i_48_ + i_49_ > endY) {
				i_49_ = endY - i_48_;
			}
			final int i_53_ = 256 - i_51_;
			final int i_54_ = (i_50_ >> 16 & 0xff) * i_51_;
			final int i_55_ = (i_50_ >> 8 & 0xff) * i_51_;
			final int i_56_ = (i_50_ & 0xff) * i_51_;
			int i_57_ = i + i_48_ * width;
			for (int i_58_ = 0; i_58_ < i_49_; i_58_++) {
				final int i_59_ = i_48_ + i_58_ - startY;
				if (i - startX >= is[i_59_] && i - startX < is[i_59_] + is_52_[i_59_]) {
					final int i_60_ = (pixels[i_57_] >> 16 & 0xff) * i_53_;
					final int i_61_ = (pixels[i_57_] >> 8 & 0xff) * i_53_;
					final int i_62_ = (pixels[i_57_] & 0xff) * i_53_;
					final int i_63_ = (i_54_ + i_60_ >> 8 << 16) + (i_55_ + i_61_ >> 8 << 8) + (i_56_ + i_62_ >> 8);
					pixels[i_57_] = i_63_;
				}
				i_57_ += width;
			}
		}
	}

	private static final void method2154(final int x, int y, int size, final int color) {
		if (size == 0) {
			setPixel(x, y, color);
		} else {
			if (size < 0) {
				size = -size;
			}
			int i_67_ = y - size;
			if (i_67_ < startY) {
				i_67_ = startY;
			}
			int i_68_ = y + size + 1;
			if (i_68_ > endY) {
				i_68_ = endY;
			}
			int i_69_ = i_67_;
			final int i_70_ = size * size;
			int i_71_ = 0;
			int i_72_ = y - i_69_;
			int i_73_ = i_72_ * i_72_;
			int i_74_ = i_73_ - i_72_;
			if (y > i_68_) {
				y = i_68_;
			}
			while (i_69_ < y) {
				for (/**/; i_74_ <= i_70_ || i_73_ <= i_70_; i_74_ += i_71_++ + i_71_) {
					i_73_ += i_71_ + i_71_;
				}
				int i_75_ = x - i_71_ + 1;
				if (i_75_ < startX) {
					i_75_ = startX;
				}
				int i_76_ = x + i_71_;
				if (i_76_ > endX) {
					i_76_ = endX;
				}
				int i_77_ = i_75_ + i_69_ * width;
				for (int i_78_ = i_75_; i_78_ < i_76_; i_78_++) {
					pixels[i_77_++] = color;
				}
				i_69_++;
				i_73_ -= i_72_-- + i_72_;
				i_74_ -= i_72_ + i_72_;
			}
			i_71_ = size;
			i_72_ = i_69_ - y;
			i_74_ = i_72_ * i_72_ + i_70_;
			i_73_ = i_74_ - i_71_;
			i_74_ -= i_72_;
			while (i_69_ < i_68_) {
				for (/**/; i_74_ > i_70_ && i_73_ > i_70_; i_73_ -= i_71_ + i_71_) {
					i_74_ -= i_71_-- + i_71_;
				}
				int i_79_ = x - i_71_;
				if (i_79_ < startX) {
					i_79_ = startX;
				}
				int i_80_ = x + i_71_;
				if (i_80_ > endX - 1) {
					i_80_ = endX - 1;
				}
				int i_81_ = i_79_ + i_69_ * width;
				for (int i_82_ = i_79_; i_82_ <= i_80_; i_82_++) {
					pixels[i_81_++] = color;
				}
				i_69_++;
				i_74_ += i_72_ + i_72_;
				i_73_ += i_72_++ + i_72_;
			}
		}
	}

	static final void clipRect(int i, int i_83_, int i_84_, int i_85_) {
		if (i < 0) {
			i = 0;
		}
		if (i_83_ < 0) {
			i_83_ = 0;
		}
		if (i_84_ > width) {
			i_84_ = width;
		}
		if (i_85_ > height) {
			i_85_ = height;
		}
		startX = i;
		startY = i_83_;
		endX = i_84_;
		endY = i_85_;
		method2174();
	}

	static final void method2156(int x, int y, final int color, final int[] is, final int[] is_88_) {
		int step = x + y * width;
		for (y = 0; y < is.length; y++) {
			int pixel = step + is[y];
			for (x = -is_88_[y]; x < 0; x++) {
				pixels[pixel++] = color;
			}
			step += width;
		}
	}

	private static final void setPixel(final int x, final int y, final int color) {
		if (x >= startX && y >= startY && x < endX && y < endY) {
			pixels[x + y * width] = color;
		}
	}

	static final void method2158(final int i, int i_93_, int i_94_, final int i_95_) {
		if (i >= startX && i < endX) {
			if (i_93_ < startY) {
				i_94_ -= startY - i_93_;
				i_93_ = startY;
			}
			if (i_93_ + i_94_ > endY) {
				i_94_ = endY - i_93_;
			}
			int i_96_ = i + i_93_ * width;
			int i_97_ = 0;
			while (i_97_ < i_94_) {
				pixels[i_96_] = i_95_;
				i_97_++;
				i_96_ += width;
			}
		}
	}

	static final void fillRect(int i, int i_98_, int i_99_, int i_100_, int i_101_, final int i_102_) {
		if (i < startX) {
			i_99_ -= startX - i;
			i = startX;
		}
		if (i_98_ < startY) {
			i_100_ -= startY - i_98_;
			i_98_ = startY;
		}
		if (i + i_99_ > endX) {
			i_99_ = endX - i;
		}
		if (i_98_ + i_100_ > endY) {
			i_100_ = endY - i_98_;
		}
		i_101_ = ((i_101_ & 0xff00ff) * i_102_ >> 8 & 0xff00ff) + ((i_101_ & 0xff00) * i_102_ >> 8 & 0xff00);
		final int i_103_ = 256 - i_102_;
		final int i_104_ = width - i_99_;
		int i_105_ = i + i_98_ * width;
		for (int i_106_ = 0; i_106_ < i_100_; i_106_++) {
			for (int i_107_ = -i_99_; i_107_ < 0; i_107_++) {
				int i_108_ = pixels[i_105_];
				i_108_ = ((i_108_ & 0xff00ff) * i_103_ >> 8 & 0xff00ff) + ((i_108_ & 0xff00) * i_103_ >> 8 & 0xff00);
				pixels[i_105_++] = i_101_ + i_108_;
			}
			i_105_ += i_104_;
		}
	}

	static final void method2160(int i, final int i_109_, int i_110_, final int i_111_) {
		if (i_109_ >= startY && i_109_ < endY) {
			if (i < startX) {
				i_110_ -= startX - i;
				i = startX;
			}
			if (i + i_110_ > endX) {
				i_110_ = endX - i;
			}
			final int i_112_ = i + i_109_ * width;
			for (int i_113_ = 0; i_113_ < i_110_; i_113_++) {
				pixels[i_112_ + i_113_] = i_111_;
			}
		}
	}

	static final void method2161(int i, int i_114_, final int i_115_, final int i_116_, final int i_117_, final int i_118_) {
		final int i_119_ = i_115_ - i;
		final int i_120_ = i_116_ - i_114_;
		final int i_121_ = i_119_ >= 0 ? i_119_ : -i_119_;
		final int i_122_ = i_120_ >= 0 ? i_120_ : -i_120_;
		int i_123_ = i_121_;
		if (i_123_ < i_122_) {
			i_123_ = i_122_;
		}
		if (i_123_ != 0) {
			int i_124_ = (i_119_ << 16) / i_123_;
			int i_125_ = (i_120_ << 16) / i_123_;
			if (i_125_ <= i_124_) {
				i_124_ = -i_124_;
			} else {
				i_125_ = -i_125_;
			}
			final int i_126_ = i_118_ * i_125_ >> 17;
			final int i_127_ = i_118_ * i_125_ + 1 >> 17;
			final int i_128_ = i_118_ * i_124_ >> 17;
			final int i_129_ = i_118_ * i_124_ + 1 >> 17;
			i -= Rasterizer.method861();
			i_114_ -= Rasterizer.method859();
			final int i_130_ = i + i_126_;
			final int i_131_ = i - i_127_;
			final int i_132_ = i + i_119_ - i_127_;
			final int i_133_ = i + i_119_ + i_126_;
			final int i_134_ = i_114_ + i_128_;
			final int i_135_ = i_114_ - i_129_;
			final int i_136_ = i_114_ + i_120_ - i_129_;
			final int i_137_ = i_114_ + i_120_ + i_128_;
			Rasterizer.method855(i_130_, i_131_, i_132_);
			Rasterizer.method863(i_134_, i_135_, i_136_, i_130_, i_131_, i_132_, i_117_);
			Rasterizer.method855(i_130_, i_132_, i_133_);
			Rasterizer.method863(i_134_, i_136_, i_137_, i_130_, i_132_, i_133_, i_117_);
		}
	}

	private static final void method2162(final int i, int i_138_, int i_139_, final int i_140_, final int i_141_) {
		if (i >= startX && i < endX) {
			if (i_138_ < startY) {
				i_139_ -= startY - i_138_;
				i_138_ = startY;
			}
			if (i_138_ + i_139_ > endY) {
				i_139_ = endY - i_138_;
			}
			final int i_142_ = 256 - i_141_;
			final int i_143_ = (i_140_ >> 16 & 0xff) * i_141_;
			final int i_144_ = (i_140_ >> 8 & 0xff) * i_141_;
			final int i_145_ = (i_140_ & 0xff) * i_141_;
			int i_146_ = i + i_138_ * width;
			for (int i_147_ = 0; i_147_ < i_139_; i_147_++) {
				final int i_148_ = (pixels[i_146_] >> 16 & 0xff) * i_142_;
				final int i_149_ = (pixels[i_146_] >> 8 & 0xff) * i_142_;
				final int i_150_ = (pixels[i_146_] & 0xff) * i_142_;
				final int i_151_ = (i_143_ + i_148_ >> 8 << 16) + (i_144_ + i_149_ >> 8 << 8) + (i_145_ + i_150_ >> 8);
				pixels[i_146_] = i_151_;
				i_146_ += width;
			}
		}
	}

	public static void method2163() {
		pixels = null;
		anIntArray1604 = null;
		anIntArray1605 = null;
	}

	static final void method2164(final int[] is, final int[] is_152_) {
		if (is.length != endY - startY || is_152_.length != endY - startY) {
			throw new IllegalArgumentException();
		}
		anIntArray1604 = is;
		anIntArray1605 = is_152_;
	}

	static final void method2165(int i, int i_153_, int i_154_, int i_155_, final int i_156_, final int i_157_, final int[] is, final int[] is_158_) {
		if (endY - startY != is.length) {
			throw new IllegalStateException();
		}
		i_154_ -= i;
		i_155_ -= i_153_;
		if (i_155_ == 0) {
			if (i_154_ >= 0) {
				method2177(i, i_153_, i_154_, i_156_, i_157_, is, is_158_);
			} else {
				method2177(i + i_154_ + 1, i_153_, -i_154_, i_156_, i_157_, is, is_158_);
			}
		} else if (i_154_ == 0) {
			if (i_155_ >= 0) {
				method2153(i, i_153_, i_155_, i_156_, i_157_, is, is_158_);
			} else {
				method2153(i, i_153_ + i_155_ + 1, -i_155_, i_156_, i_157_, is, is_158_);
			}
		} else {
			boolean bool = false;
			if (i_154_ + i_155_ < 0) {
				i += i_154_;
				i_154_ = -i_154_;
				i_153_ += i_155_;
				i_155_ = -i_155_;
				bool = true;
			}
			final int i_159_ = 256 - i_157_;
			final int i_160_ = (i_156_ >> 16 & 0xff) * i_157_;
			final int i_161_ = (i_156_ >> 8 & 0xff) * i_157_;
			final int i_162_ = (i_156_ & 0xff) * i_157_;
			if (i_154_ > i_155_) {
				i_153_ <<= 16;
				i_153_ += 32768;
				i_155_ <<= 16;
				final int i_163_ = (int) Math.floor((double) i_155_ / (double) i_154_ + 0.5);
				i_154_ += i;
				if (bool) {
					i_153_ += i_163_;
					i++;
				}
				if (i < startX) {
					i_153_ += i_163_ * (startX - i);
					i = startX;
				}
				if (i_154_ >= endX) {
					i_154_ = endX - 1;
				}
				if (!bool) {
					i_154_--;
				}
				for (/**/; i <= i_154_; i++) {
					final int i_164_ = i_153_ >> 16;
					final int i_165_ = i_164_ - startY;
					if (i_164_ >= startY && i_164_ < endY && i - startX >= is[i_165_] && i - startX < is[i_165_] + is_158_[i_165_]) {
						final int i_166_ = i + i_164_ * width;
						final int i_167_ = (pixels[i_166_] >> 16 & 0xff) * i_159_;
						final int i_168_ = (pixels[i_166_] >> 8 & 0xff) * i_159_;
						final int i_169_ = (pixels[i_166_] & 0xff) * i_159_;
						final int i_170_ = (i_160_ + i_167_ >> 8 << 16) + (i_161_ + i_168_ >> 8 << 8) + (i_162_ + i_169_ >> 8);
						pixels[i_166_] = i_170_;
					}
					i_153_ += i_163_;
				}
			} else {
				i <<= 16;
				i += 32768;
				i_154_ <<= 16;
				final int i_171_ = (int) Math.floor((double) i_154_ / (double) i_155_ + 0.5);
				i_155_ += i_153_;
				if (bool) {
					i += i_171_;
					i_153_++;
				}
				if (i_153_ < startY) {
					i += i_171_ * (startY - i_153_);
					i_153_ = startY;
				}
				if (i_155_ >= endY) {
					i_155_ = endY - 1;
				}
				if (!bool) {
					i_155_--;
				}
				for (/**/; i_153_ <= i_155_; i_153_++) {
					final int i_172_ = i >> 16;
					final int i_173_ = i_153_ - startY;
					if (i_172_ >= startX && i_172_ < endX && i_172_ - startX >= is[i_173_] && i_172_ - startX < is[i_173_] + is_158_[i_173_]) {
						final int i_174_ = i_172_ + i_153_ * width;
						final int i_175_ = (pixels[i_174_] >> 16 & 0xff) * i_159_;
						final int i_176_ = (pixels[i_174_] >> 8 & 0xff) * i_159_;
						final int i_177_ = (pixels[i_174_] & 0xff) * i_159_;
						final int i_178_ = (i_160_ + i_175_ >> 8 << 16) + (i_161_ + i_176_ >> 8 << 8) + (i_162_ + i_177_ >> 8);
						pixels[i_174_] = i_178_;
					}
					i += i_171_;
				}
			}
		}
	}

	static final void method2166(final int i, final int i_179_, final int i_180_, final int i_181_) {
		if (startX < i) {
			startX = i;
		}
		if (startY < i_179_) {
			startY = i_179_;
		}
		if (endX > i_180_) {
			endX = i_180_;
		}
		if (endY > i_181_) {
			endY = i_181_;
		}
		method2174();
	}

	static final void drawRect(final int i, final int i_182_, final int i_183_, final int i_184_, final int i_185_, final int i_186_) {
		method2171(i, i_182_, i_183_, i_185_, i_186_);
		method2171(i, i_182_ + i_184_ - 1, i_183_, i_185_, i_186_);
		if (i_184_ >= 3) {
			method2162(i, i_182_ + 1, i_184_ - 2, i_185_, i_186_);
			method2162(i + i_183_ - 1, i_182_ + 1, i_184_ - 2, i_185_, i_186_);
		}
	}

	static final void drawRect(final int i, final int i_187_, final int i_188_, final int i_189_, final int i_190_) {
		method2160(i, i_187_, i_188_, i_190_);
		method2160(i, i_187_ + i_189_ - 1, i_188_, i_190_);
		method2158(i, i_187_, i_189_, i_190_);
		method2158(i + i_188_ - 1, i_187_, i_189_, i_190_);
	}

	static final void method2169(final int[] is) {
		is[0] = startX;
		is[1] = startY;
		is[2] = endX;
		is[3] = endY;
	}

	static final void init2dCanvas(final int[] is, final int i, final int i_191_) {
		pixels = is;
		width = i;
		height = i_191_;
		clipRect(0, 0, i, i_191_);
	}

	static final void method2171(int i, final int i_192_, int i_193_, final int i_194_, final int i_195_) {
		if (i_192_ >= startY && i_192_ < endY) {
			if (i < startX) {
				i_193_ -= startX - i;
				i = startX;
			}
			if (i + i_193_ > endX) {
				i_193_ = endX - i;
			}
			final int i_196_ = 256 - i_195_;
			final int i_197_ = (i_194_ >> 16 & 0xff) * i_195_;
			final int i_198_ = (i_194_ >> 8 & 0xff) * i_195_;
			final int i_199_ = (i_194_ & 0xff) * i_195_;
			int i_200_ = i + i_192_ * width;
			for (int i_201_ = 0; i_201_ < i_193_; i_201_++) {
				final int i_202_ = (pixels[i_200_] >> 16 & 0xff) * i_196_;
				final int i_203_ = (pixels[i_200_] >> 8 & 0xff) * i_196_;
				final int i_204_ = (pixels[i_200_] & 0xff) * i_196_;
				final int i_205_ = (i_197_ + i_202_ >> 8 << 16) + (i_198_ + i_203_ >> 8 << 8) + (i_199_ + i_204_ >> 8);
				pixels[i_200_++] = i_205_;
			}
		}
	}

	static final void method2172(final int[] is) {
		startX = is[0];
		startY = is[1];
		endX = is[2];
		endY = is[3];
		method2174();
	}

	static final void clearPixels() {
		int i = 0;
		int i_206_ = width * height - 7;
		while (i < i_206_) {
			pixels[i++] = 0;
			pixels[i++] = 0;
			pixels[i++] = 0;
			pixels[i++] = 0;
			pixels[i++] = 0;
			pixels[i++] = 0;
			pixels[i++] = 0;
			pixels[i++] = 0;
		}
		i_206_ += 7;
		while (i < i_206_) {
			pixels[i++] = 0;
		}
	}

	static final void method2174() {
		anIntArray1604 = null;
		anIntArray1605 = null;
	}

	static final void method2175() {
		startX = 0;
		startY = 0;
		endX = width;
		endY = height;
		method2174();
	}

	static final void method2176(int i, int i_207_, int i_208_, int i_209_, final int i_210_, final int i_211_) {
		i_208_ -= i;
		i_209_ -= i_207_;
		if (i_209_ == 0) {
			if (i_208_ >= 0) {
				method2171(i, i_207_, i_208_, i_210_, i_211_);
			} else {
				method2171(i + i_208_ + 1, i_207_, -i_208_, i_210_, i_211_);
			}
		} else if (i_208_ == 0) {
			if (i_209_ >= 0) {
				method2162(i, i_207_, i_209_, i_210_, i_211_);
			} else {
				method2162(i, i_207_ + i_209_ + 1, -i_209_, i_210_, i_211_);
			}
		} else {
			boolean bool = false;
			if (i_208_ + i_209_ < 0) {
				i += i_208_;
				i_208_ = -i_208_;
				i_207_ += i_209_;
				i_209_ = -i_209_;
				bool = true;
			}
			final int i_212_ = 256 - i_211_;
			final int i_213_ = (i_210_ >> 16 & 0xff) * i_211_;
			final int i_214_ = (i_210_ >> 8 & 0xff) * i_211_;
			final int i_215_ = (i_210_ & 0xff) * i_211_;
			if (i_208_ > i_209_) {
				i_207_ <<= 16;
				i_207_ += 32768;
				i_209_ <<= 16;
				final int i_216_ = (int) Math.floor((double) i_209_ / (double) i_208_ + 0.5);
				i_208_ += i;
				if (bool) {
					i_207_ += i_216_;
					i++;
				}
				if (i < startX) {
					i_207_ += i_216_ * (startX - i);
					i = startX;
				}
				if (i_208_ >= endX) {
					i_208_ = endX - 1;
				}
				if (!bool) {
					i_208_--;
				}
				for (/**/; i <= i_208_; i++) {
					final int i_217_ = i_207_ >> 16;
					if (i_217_ >= startY && i_217_ < endY) {
						final int i_218_ = i + i_217_ * width;
						final int i_219_ = (pixels[i_218_] >> 16 & 0xff) * i_212_;
						final int i_220_ = (pixels[i_218_] >> 8 & 0xff) * i_212_;
						final int i_221_ = (pixels[i_218_] & 0xff) * i_212_;
						final int i_222_ = (i_213_ + i_219_ >> 8 << 16) + (i_214_ + i_220_ >> 8 << 8) + (i_215_ + i_221_ >> 8);
						pixels[i_218_] = i_222_;
					}
					i_207_ += i_216_;
				}
			} else {
				i <<= 16;
				i += 32768;
				i_208_ <<= 16;
				final int i_223_ = (int) Math.floor((double) i_208_ / (double) i_209_ + 0.5);
				i_209_ += i_207_;
				if (bool) {
					i += i_223_;
					i_207_++;
				}
				if (i_207_ < startY) {
					i += i_223_ * (startY - i_207_);
					i_207_ = startY;
				}
				if (i_209_ >= endY) {
					i_209_ = endY - 1;
				}
				if (!bool) {
					i_209_--;
				}
				for (/**/; i_207_ <= i_209_; i_207_++) {
					final int i_224_ = i >> 16;
					if (i_224_ >= startX && i_224_ < endX) {
						final int i_225_ = i_224_ + i_207_ * width;
						final int i_226_ = (pixels[i_225_] >> 16 & 0xff) * i_212_;
						final int i_227_ = (pixels[i_225_] >> 8 & 0xff) * i_212_;
						final int i_228_ = (pixels[i_225_] & 0xff) * i_212_;
						final int i_229_ = (i_213_ + i_226_ >> 8 << 16) + (i_214_ + i_227_ >> 8 << 8) + (i_215_ + i_228_ >> 8);
						pixels[i_225_] = i_229_;
					}
					i += i_223_;
				}
			}
		}
	}

	private static final void method2177(int i, final int i_230_, int i_231_, final int i_232_, final int i_233_, final int[] is, final int[] is_234_) {
		if (endY - startY != is.length) {
			throw new IllegalStateException();
		}
		if (i_230_ >= startY && i_230_ < endY) {
			final int i_235_ = startX + is[i_230_ - startY];
			if (i < i_235_) {
				i_231_ -= i_235_ - i;
				i = i_235_;
			}
			final int i_236_ = startX + is[i_230_ - startY] + is_234_[i_230_ - startY];
			if (i + i_231_ > i_236_) {
				i_231_ = i_236_ - i;
			}
			final int i_237_ = 256 - i_233_;
			final int i_238_ = (i_232_ >> 16 & 0xff) * i_233_;
			final int i_239_ = (i_232_ >> 8 & 0xff) * i_233_;
			final int i_240_ = (i_232_ & 0xff) * i_233_;
			int i_241_ = i + i_230_ * width;
			for (int i_242_ = 0; i_242_ < i_231_; i_242_++) {
				final int i_243_ = (pixels[i_241_] >> 16 & 0xff) * i_237_;
				final int i_244_ = (pixels[i_241_] >> 8 & 0xff) * i_237_;
				final int i_245_ = (pixels[i_241_] & 0xff) * i_237_;
				final int i_246_ = (i_238_ + i_243_ >> 8 << 16) + (i_239_ + i_244_ >> 8 << 8) + (i_240_ + i_245_ >> 8);
				pixels[i_241_++] = i_246_;
			}
		}
	}
}
