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

	static final void drawLine(int x1, int y1, int x2, int y2, final int color) {
		x2 -= x1;
		y2 -= y1;
		if (y2 == 0) {
			if (x2 >= 0) {
				drawHorizontalLine(x1, y1, x2 + 1, color);
			} else {
				drawHorizontalLine(x1 + x2, y1, 1 - x2, color);
			}
		} else if (x2 == 0) {
			if (y2 >= 0) {
				drawVerticalLine(x1, y1, y2 + 1, color);
			} else {
				drawVerticalLine(x1, y1 + y2, 1 - y2, color);
			}
		} else {
			if (x2 + y2 < 0) {
				x1 += x2;
				x2 = -x2;
				y1 += y2;
				y2 = -y2;
			}
			if (x2 > y2) {
				y1 <<= 16;
				y1 += 32768;
				y2 <<= 16;
				final int i_4_ = (int) Math.floor((double) y2 / (double) x2 + 0.5);
				x2 += x1;
				if (x1 < startX) {
					y1 += i_4_ * (startX - x1);
					x1 = startX;
				}
				if (x2 >= endX) {
					x2 = endX - 1;
				}
				for (/**/; x1 <= x2; x1++) {
					final int i_5_ = y1 >> 16;
					if (i_5_ >= startY && i_5_ < endY) {
						pixels[x1 + i_5_ * width] = color;
					}
					y1 += i_4_;
				}
			} else {
				x1 <<= 16;
				x1 += 32768;
				x2 <<= 16;
				final int i_6_ = (int) Math.floor((double) x2 / (double) y2 + 0.5);
				y2 += y1;
				if (y1 < startY) {
					x1 += i_6_ * (startY - y1);
					y1 = startY;
				}
				if (y2 >= endY) {
					y2 = endY - 1;
				}
				for (/**/; y1 <= y2; y1++) {
					final int i_7_ = x1 >> 16;
					if (i_7_ >= startX && i_7_ < endX) {
						pixels[i_7_ + y1 * width] = color;
					}
					x1 += i_6_;
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

	static final void drawAlphaCircle(final int x, int y, int size, final int color, final int alpha) {
		if (alpha != 0) {
			if (alpha == 256) {
				drawCircle(x, y, size, color);
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

	private static final void drawCircle(final int x, int y, int size, final int color) {
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

	static final void clipRect(int x1, int y1, int x2, int y2) {
		if (x1 < 0) {
			x1 = 0;
		}
		if (y1 < 0) {
			y1 = 0;
		}
		if (x2 > width) {
			x2 = width;
		}
		if (y2 > height) {
			y2 = height;
		}
		startX = x1;
		startY = y1;
		endX = x2;
		endY = y2;
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

	static final void drawVerticalLine(final int i, int i_93_, int i_94_, final int i_95_) {
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

	static final void fillRect(int x, int y, int w, int h, int color, final int alpha) {
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
		color = ((color & 0xff00ff) * alpha >> 8 & 0xff00ff) + ((color & 0xff00) * alpha >> 8 & 0xff00);
		final int i_103_ = 256 - alpha;
		final int i_104_ = width - w;
		int i_105_ = x + y * width;
		for (int i_106_ = 0; i_106_ < h; i_106_++) {
			for (int i_107_ = -w; i_107_ < 0; i_107_++) {
				int i_108_ = pixels[i_105_];
				i_108_ = ((i_108_ & 0xff00ff) * i_103_ >> 8 & 0xff00ff) + ((i_108_ & 0xff00) * i_103_ >> 8 & 0xff00);
				pixels[i_105_++] = color + i_108_;
			}
			i_105_ += i_104_;
		}
	}

	static final void drawHorizontalLine(int x, final int y, int length, final int color) {
		if (y >= startY && y < endY) {
			if (x < startX) {
				length -= startX - x;
				x = startX;
			}
			if (x + length > endX) {
				length = endX - x;
			}
			final int pixelId = x + y * width;
			for (int id = 0; id < length; id++) {
				pixels[pixelId + id] = color;
			}
		}
	}

	static final void drawLine(int x1, int y1, final int x2, final int y2, final int color, final int lineWidth) {
		final int i_119_ = x2 - x1;
		final int i_120_ = y2 - y1;
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
			final int i_126_ = lineWidth * i_125_ >> 17;
			final int i_127_ = lineWidth * i_125_ + 1 >> 17;
			final int i_128_ = lineWidth * i_124_ >> 17;
			final int i_129_ = lineWidth * i_124_ + 1 >> 17;
			x1 -= Rasterizer.method861();
			y1 -= Rasterizer.method859();
			final int i_130_ = x1 + i_126_;
			final int i_131_ = x1 - i_127_;
			final int i_132_ = x1 + i_119_ - i_127_;
			final int i_133_ = x1 + i_119_ + i_126_;
			final int i_134_ = y1 + i_128_;
			final int i_135_ = y1 - i_129_;
			final int i_136_ = y1 + i_120_ - i_129_;
			final int i_137_ = y1 + i_120_ + i_128_;
			Rasterizer.method855(i_130_, i_131_, i_132_);
			Rasterizer.method863(i_134_, i_135_, i_136_, i_130_, i_131_, i_132_, color);
			Rasterizer.method855(i_130_, i_132_, i_133_);
			Rasterizer.method863(i_134_, i_136_, i_137_, i_130_, i_132_, i_133_, color);
		}
	}

	private static final void drawVerticalLineAlpha(final int x, int y, int length, final int color, final int alpha) {
		if (x >= startX && x < endX) {
			if (y < startY) {
				length -= startY - y;
				y = startY;
			}
			if (y + length > endY) {
				length = endY - y;
			}
			final int i_142_ = 256 - alpha;
			final int i_143_ = (color >> 16 & 0xff) * alpha;
			final int i_144_ = (color >> 8 & 0xff) * alpha;
			final int i_145_ = (color & 0xff) * alpha;
			int i_146_ = x + y * width;
			for (int i_147_ = 0; i_147_ < length; i_147_++) {
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

	static final void method2166(final int x1, final int y1, final int x2, final int y2) {
		if (startX < x1) {
			startX = x1;
		}
		if (startY < y1) {
			startY = y1;
		}
		if (endX > x2) {
			endX = x2;
		}
		if (endY > y2) {
			endY = y2;
		}
		method2174();
	}

	static final void drawRectAlpha(final int x, final int y, final int w, final int h, final int color, final int alpha) {
		drawHorizontalLineAlpha(x, y, w, color, alpha);
		drawHorizontalLineAlpha(x, y + h - 1, w, color, alpha);
		if (h >= 3) {
			drawVerticalLineAlpha(x, y + 1, h - 2, color, alpha);
			drawVerticalLineAlpha(x + w - 1, y + 1, h - 2, color, alpha);
		}
	}

	static final void drawRect(final int x, final int y, final int w, final int h, final int color) {
		drawHorizontalLine(x, y, w, color);
		drawHorizontalLine(x, y + h - 1, w, color);
		drawVerticalLine(x, y, h, color);
		drawVerticalLine(x + w - 1, y, h, color);
	}

	static final void copyBounds(final int[] bounds) {
		bounds[0] = startX;
		bounds[1] = startY;
		bounds[2] = endX;
		bounds[3] = endY;
	}

	static final void init2dCanvas(final int[] pixs, final int w, final int h) {
		pixels = pixs;
		width = w;
		height = h;
		clipRect(0, 0, w, h);
	}

	static final void drawHorizontalLineAlpha(int x, final int y, int length, final int color, final int alpha) {
		if (y >= startY && y < endY) {
			if (x < startX) {
				length -= startX - x;
				x = startX;
			}
			if (x + length > endX) {
				length = endX - x;
			}
			final int i_196_ = 256 - alpha;
			final int i_197_ = (color >> 16 & 0xff) * alpha;
			final int i_198_ = (color >> 8 & 0xff) * alpha;
			final int i_199_ = (color & 0xff) * alpha;
			int i_200_ = x + y * width;
			for (int i_201_ = 0; i_201_ < length; i_201_++) {
				final int i_202_ = (pixels[i_200_] >> 16 & 0xff) * i_196_;
				final int i_203_ = (pixels[i_200_] >> 8 & 0xff) * i_196_;
				final int i_204_ = (pixels[i_200_] & 0xff) * i_196_;
				final int i_205_ = (i_197_ + i_202_ >> 8 << 16) + (i_198_ + i_203_ >> 8 << 8) + (i_199_ + i_204_ >> 8);
				pixels[i_200_++] = i_205_;
			}
		}
	}

	static final void setBounds(final int[] bounds) {
		startX = bounds[0];
		startY = bounds[1];
		endX = bounds[2];
		endY = bounds[3];
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

	static final void drawLineAlpha(int x1, int y1, int x2, int y2, final int color, final int alpha) {
		x2 -= x1;
		y2 -= y1;
		if (y2 == 0) {
			if (x2 >= 0) {
				drawHorizontalLineAlpha(x1, y1, x2, color, alpha);
			} else {
				drawHorizontalLineAlpha(x1 + x2 + 1, y1, -x2, color, alpha);
			}
		} else if (x2 == 0) {
			if (y2 >= 0) {
				drawVerticalLineAlpha(x1, y1, y2, color, alpha);
			} else {
				drawVerticalLineAlpha(x1, y1 + y2 + 1, -y2, color, alpha);
			}
		} else {
			boolean bool = false;
			if (x2 + y2 < 0) {
				x1 += x2;
				x2 = -x2;
				y1 += y2;
				y2 = -y2;
				bool = true;
			}
			final int i_212_ = 256 - alpha;
			final int i_213_ = (color >> 16 & 0xff) * alpha;
			final int i_214_ = (color >> 8 & 0xff) * alpha;
			final int i_215_ = (color & 0xff) * alpha;
			if (x2 > y2) {
				y1 <<= 16;
				y1 += 32768;
				y2 <<= 16;
				final int i_216_ = (int) Math.floor((double) y2 / (double) x2 + 0.5);
				x2 += x1;
				if (bool) {
					y1 += i_216_;
					x1++;
				}
				if (x1 < startX) {
					y1 += i_216_ * (startX - x1);
					x1 = startX;
				}
				if (x2 >= endX) {
					x2 = endX - 1;
				}
				if (!bool) {
					x2--;
				}
				for (/**/; x1 <= x2; x1++) {
					final int i_217_ = y1 >> 16;
					if (i_217_ >= startY && i_217_ < endY) {
						final int i_218_ = x1 + i_217_ * width;
						final int i_219_ = (pixels[i_218_] >> 16 & 0xff) * i_212_;
						final int i_220_ = (pixels[i_218_] >> 8 & 0xff) * i_212_;
						final int i_221_ = (pixels[i_218_] & 0xff) * i_212_;
						final int i_222_ = (i_213_ + i_219_ >> 8 << 16) + (i_214_ + i_220_ >> 8 << 8) + (i_215_ + i_221_ >> 8);
						pixels[i_218_] = i_222_;
					}
					y1 += i_216_;
				}
			} else {
				x1 <<= 16;
				x1 += 32768;
				x2 <<= 16;
				final int i_223_ = (int) Math.floor((double) x2 / (double) y2 + 0.5);
				y2 += y1;
				if (bool) {
					x1 += i_223_;
					y1++;
				}
				if (y1 < startY) {
					x1 += i_223_ * (startY - y1);
					y1 = startY;
				}
				if (y2 >= endY) {
					y2 = endY - 1;
				}
				if (!bool) {
					y2--;
				}
				for (/**/; y1 <= y2; y1++) {
					final int i_224_ = x1 >> 16;
					if (i_224_ >= startX && i_224_ < endX) {
						final int i_225_ = i_224_ + y1 * width;
						final int i_226_ = (pixels[i_225_] >> 16 & 0xff) * i_212_;
						final int i_227_ = (pixels[i_225_] >> 8 & 0xff) * i_212_;
						final int i_228_ = (pixels[i_225_] & 0xff) * i_212_;
						final int i_229_ = (i_213_ + i_226_ >> 8 << 16) + (i_214_ + i_227_ >> 8 << 8) + (i_215_ + i_228_ >> 8);
						pixels[i_225_] = i_229_;
					}
					x1 += i_223_;
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
