/* Class120_Sub14_Sub19_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class LDSprite extends AbstractSprite {
	
	int[] pixels;

	@Override
	void drawSpriteTransparency(int x, int y, final int transparency) {
		x += this.offsetX;
		y += this.offsetY;
		int destPixelId = x + y * GraphicsLD.width;
		int srcPixelId = 0;
		int spriteHeight = this.height;
		int spriteWidth = this.width;
		int destPixelStep = GraphicsLD.width - spriteWidth;
		int srcPixelStep = 0;
		if (y < GraphicsLD.startY) {
			final int outOfBoundsY = GraphicsLD.startY - y;
			spriteHeight -= outOfBoundsY;
			y = GraphicsLD.startY;
			srcPixelId += outOfBoundsY * spriteWidth;
			destPixelId += outOfBoundsY * GraphicsLD.width;
		}
		if (y + spriteHeight > GraphicsLD.endY) {
			spriteHeight -= y + spriteHeight - GraphicsLD.endY;
		}
		if (x < GraphicsLD.startX) {
			final int outOfBoundsX = GraphicsLD.startX - x;
			spriteWidth -= outOfBoundsX;
			x = GraphicsLD.startX;
			srcPixelId += outOfBoundsX;
			destPixelId += outOfBoundsX;
			srcPixelStep += outOfBoundsX;
			destPixelStep += outOfBoundsX;
		}
		if (x + spriteWidth > GraphicsLD.endX) {
			final int outOfBoundsX = x + spriteWidth - GraphicsLD.endX;
			spriteWidth -= outOfBoundsX;
			srcPixelStep += outOfBoundsX;
			destPixelStep += outOfBoundsX;
		}
		if (spriteWidth > 0 && spriteHeight > 0) {
			plotPixels(GraphicsLD.pixels, this.pixels, 0, srcPixelId, destPixelId, spriteWidth, spriteHeight, destPixelStep, srcPixelStep, transparency);
		}
	}
	
	private static final void plotPixels(final int[] destPixels, final int[] srcPixels, int srcPixel, int srcPixelId, int destPixelId, final int width, final int height, final int destPixelStep, final int srcPixelStep, final int transparency) {
		final int transDelta = 256 - transparency;
		for (int y = -height; y < 0; y++) {
			for (int x = -width; x < 0; x++) {
				srcPixel = srcPixels[srcPixelId++];
				if (srcPixel != 0) {
					final int destPixel = destPixels[destPixelId];
					destPixels[destPixelId++] = ((srcPixel & 0xff00ff) * transparency + (destPixel & 0xff00ff) * transDelta & ~0xff00ff) + ((srcPixel & 0xff00) * transparency + (destPixel & 0xff00) * transDelta & 0xff0000) >> 8;
				} else {
					destPixelId++;
				}
			}
			destPixelId += destPixelStep;
			srcPixelId += srcPixelStep;
		}
	}

	void method1604(int x, int y, int width, final int height, final int spriteCenterX, final int spriteCenterY, final int rotation, int zoom, final int[] is, final int[] is_21_) {
		try {
			final int negCenterX = -width / 2;
			final int negCenterY = -height / 2;
			int sinRot = (int) (Math.sin(rotation / 326.11) * 65536.0);
			int cosRot = (int) (Math.cos(rotation / 326.11) * 65536.0);
			sinRot = sinRot * zoom >> 8;
			cosRot = cosRot * zoom >> 8;
			int i_26_ = (spriteCenterX << 16) + negCenterY * sinRot + negCenterX * cosRot;
			int i_27_ = (spriteCenterY << 16) + negCenterY * cosRot - negCenterX * sinRot;
			int i_28_ = x + y * GraphicsLD.width;
			for (y = 0; y < height; y++) {
				final int i_29_ = is[y];
				int i_30_ = i_28_ + i_29_;
				int i_31_ = i_26_ + cosRot * i_29_;
				int i_32_ = i_27_ - sinRot * i_29_;
				for (x = -is_21_[y]; x < 0; x++) {
					final int i_33_ = this.pixels[(i_31_ >> 16) + (i_32_ >> 16) * this.width];
					if (i_33_ != 0) {
						GraphicsLD.pixels[i_30_++] = i_33_;
					} else {
						i_30_++;
					}
					i_31_ += cosRot;
					i_32_ -= sinRot;
				}
				i_26_ += sinRot;
				i_27_ += cosRot;
				i_28_ += GraphicsLD.width;
			}
		} catch (final Exception exception) {
			/* empty */
		}
	}

	@Override
	void method1588(int i, int i_34_, int i_35_, int i_36_) {
		if (i_35_ > 0 && i_36_ > 0) {
			final int i_37_ = this.width;
			final int i_38_ = this.height;
			int i_39_ = 0;
			int i_40_ = 0;
			final int i_41_ = this.trimWidth;
			final int i_42_ = this.trimHeight;
			final int i_43_ = (i_41_ << 16) / i_35_;
			final int i_44_ = (i_42_ << 16) / i_36_;
			if (this.offsetX > 0) {
				final int i_45_ = ((this.offsetX << 16) + i_43_ - 1) / i_43_;
				i += i_45_;
				i_39_ += i_45_ * i_43_ - (this.offsetX << 16);
			}
			if (this.offsetY > 0) {
				final int i_46_ = ((this.offsetY << 16) + i_44_ - 1) / i_44_;
				i_34_ += i_46_;
				i_40_ += i_46_ * i_44_ - (this.offsetY << 16);
			}
			if (i_37_ < i_41_) {
				i_35_ = ((i_37_ << 16) - i_39_ + i_43_ - 1) / i_43_;
			}
			if (i_38_ < i_42_) {
				i_36_ = ((i_38_ << 16) - i_40_ + i_44_ - 1) / i_44_;
			}
			int i_47_ = i + i_34_ * GraphicsLD.width;
			int i_48_ = GraphicsLD.width - i_35_;
			if (i_34_ + i_36_ > GraphicsLD.endY) {
				i_36_ -= i_34_ + i_36_ - GraphicsLD.endY;
			}
			if (i_34_ < GraphicsLD.startY) {
				final int i_49_ = GraphicsLD.startY - i_34_;
				i_36_ -= i_49_;
				i_47_ += i_49_ * GraphicsLD.width;
				i_40_ += i_44_ * i_49_;
			}
			if (i + i_35_ > GraphicsLD.endX) {
				final int i_50_ = i + i_35_ - GraphicsLD.endX;
				i_35_ -= i_50_;
				i_48_ += i_50_;
			}
			if (i < GraphicsLD.startX) {
				final int i_51_ = GraphicsLD.startX - i;
				i_35_ -= i_51_;
				i_47_ += i_51_;
				i_39_ += i_43_ * i_51_;
				i_48_ += i_51_;
			}
			method1611(GraphicsLD.pixels, this.pixels, 0, i_39_, i_40_, i_47_, i_48_, i_35_, i_36_, i_43_, i_44_, i_37_);
		}
	}

	LDSprite(final int trimWidth, final int trimHeight, final int offsetX, final int offsetY, final int width, final int height, final int[] pixels) {
		this.trimWidth = trimWidth;
		this.trimHeight = trimHeight;
		this.offsetX = offsetX;
		this.offsetY = offsetY;
		this.width = width;
		this.height = height;
		this.pixels = pixels;
	}

	final void shadow(final int color) {
		for (int y = this.height - 1; y > 0; y--) {
			final int pixelPos = y * this.width;
			for (int x = this.width - 1; x > 0; x--) {
				if (this.pixels[x + pixelPos] == 0 && this.pixels[x + pixelPos - 1 - this.width] != 0) {
					this.pixels[x + pixelPos] = color;
				}
			}
		}
	}
	
	final void flipHorizontal() {
		final int[] pixels = this.pixels;
		for (int y = this.height - 1; y >= 0; y--) {
			int pixelId = y * this.width;
			for (int pixelIdNext = (y + 1) * this.width; pixelId < pixelIdNext; pixelId++) {
				pixelIdNext--;
				final int oldPixel = pixels[pixelId];
				pixels[pixelId] = pixels[pixelIdNext];
				pixels[pixelIdNext] = oldPixel;
			}
		}
		this.offsetX = this.trimWidth - this.width - this.offsetX;
	}

	final void flipVertical() {
		final int[] pixels = this.pixels;
		for (int y = (this.height >> 1) - 1; y >= 0; y--) {
			int pixelId = y * this.width;
			int pixelIdNext = (this.height - y - 1) * this.width;
			for (int widthLoop = -this.width; widthLoop < 0; widthLoop++) {
				final int oldPixel = pixels[pixelId];
				pixels[pixelId] = pixels[pixelIdNext];
				pixels[pixelIdNext] = oldPixel;
				pixelId++;
				pixelIdNext++;
			}
		}
		this.offsetY = this.trimHeight - this.height - this.offsetY;
	}

	int[] method1609() {
		final int[] pixels = new int[this.trimWidth * this.trimHeight];
		for (int y = 0; y < this.height; y++) {
			int srcPixelPos = y * this.width;
			int destPixelPos = this.offsetX + (y + this.offsetY) * this.trimWidth;
			for (int x = 0; x < this.width; x++) {
				final int pixel = this.pixels[srcPixelPos++];
				pixels[destPixelPos++] = pixel != 0 ? ~0xffffff | pixel : 0;
			}
		}
		return pixels;
	}

	final void method1610(int i, int i_99_, final int[] is, final int[] is_100_) {
		if (GraphicsLD.endY - GraphicsLD.startY != is.length) {
			throw new IllegalStateException();
		}
		i += this.offsetX;
		i_99_ += this.offsetY;
		int i_101_ = 0;
		int i_102_ = this.height;
		int i_103_ = this.width;
		int i_104_ = GraphicsLD.width - i_103_;
		int i_105_ = 0;
		int i_106_ = i + i_99_ * GraphicsLD.width;
		if (i_99_ < GraphicsLD.startY) {
			final int i_107_ = GraphicsLD.startY - i_99_;
			i_102_ -= i_107_;
			i_99_ = GraphicsLD.startY;
			i_101_ += i_107_ * i_103_;
			i_106_ += i_107_ * GraphicsLD.width;
		}
		if (i_99_ + i_102_ > GraphicsLD.endY) {
			i_102_ -= i_99_ + i_102_ - GraphicsLD.endY;
		}
		if (i < GraphicsLD.startX) {
			final int i_108_ = GraphicsLD.startX - i;
			i_103_ -= i_108_;
			i = GraphicsLD.startX;
			i_101_ += i_108_;
			i_106_ += i_108_;
			i_105_ += i_108_;
			i_104_ += i_108_;
		}
		if (i + i_103_ > GraphicsLD.endX) {
			final int i_109_ = i + i_103_ - GraphicsLD.endX;
			i_103_ -= i_109_;
			i_105_ += i_109_;
			i_104_ += i_109_;
		}
		if (i_103_ > 0 && i_102_ > 0) {
			final int i_110_ = i - GraphicsLD.startX;
			final int i_111_ = i_99_ - GraphicsLD.startY;
			int i_112_ = i_111_;
			for (/**/; i_112_ < i_111_ + i_102_; i_112_++) {
				final int i_113_ = is[i_112_];
				int i_114_ = is_100_[i_112_];
				int i_115_ = i_103_;
				if (i_110_ > i_113_) {
					final int i_116_ = i_110_ - i_113_;
					if (i_116_ >= i_114_) {
						i_101_ += i_103_ + i_105_;
						i_106_ += i_103_ + i_104_;
						continue;
					}
					i_114_ -= i_116_;
				} else {
					final int i_117_ = i_113_ - i_110_;
					if (i_117_ >= i_103_) {
						i_101_ += i_103_ + i_105_;
						i_106_ += i_103_ + i_104_;
						continue;
					}
					i_101_ += i_117_;
					i_115_ -= i_117_;
					i_106_ += i_117_;
				}
				int i_118_ = 0;
				if (i_115_ < i_114_) {
					i_114_ = i_115_;
				} else {
					i_118_ = i_115_ - i_114_;
				}
				for (int i_119_ = -i_114_; i_119_ < 0; i_119_++) {
					final int i_120_ = this.pixels[i_101_++];
					if (i_120_ != 0) {
						GraphicsLD.pixels[i_106_++] = i_120_;
					} else {
						i_106_++;
					}
				}
				i_101_ += i_118_ + i_105_;
				i_106_ += i_118_ + i_104_;
			}
		}
	}

	private static final void method1611(final int[] is, final int[] is_121_, int i, int i_122_, int i_123_, int i_124_, final int i_125_, final int i_126_, final int i_127_, final int i_128_, final int i_129_, final int i_130_) {
		final int i_131_ = i_122_;
		for (int i_132_ = -i_127_; i_132_ < 0; i_132_++) {
			final int i_133_ = (i_123_ >> 16) * i_130_;
			for (int i_134_ = -i_126_; i_134_ < 0; i_134_++) {
				i = is_121_[(i_122_ >> 16) + i_133_];
				if (i != 0) {
					is[i_124_++] = i;
				} else {
					i_124_++;
				}
				i_122_ += i_128_;
			}
			i_123_ += i_129_;
			i_122_ = i_131_;
			i_124_ += i_125_;
		}
	}

	void method1612(int x, int y, final int width, final int height, final int xOff, final int yOff, final double rotation, final int zoom) {
		try {
			final int centerX = width / 2;
			final int centerY = height / 2;
			int rotSin = (int) (Math.sin(rotation) * 65536.0);
			int rotCos = (int) (Math.cos(rotation) * 65536.0);
			rotSin = rotSin * zoom >> 8;
			rotCos = rotCos * zoom >> 8;
			int posX = (xOff << 16) - centerY * rotSin - centerX * rotCos;
			int posY = (yOff << 16) - centerY * rotCos + centerX * rotSin;
			int pixelId = x + y * GraphicsLD.width;
			for (y = 0; y < height; y++) {
				int destPixelId = pixelId;
				int srcX = posX;
				int srcY = posY;
				for (x = 0; x < width; x++) {
					final int pixel = this.pixels[(srcX >> 16) + (srcY >> 16) * this.width];
					if (pixel != 0) {
						GraphicsLD.pixels[destPixelId++] = pixel;
					} else {
						destPixelId++;
					}
					srcX += rotCos;
					srcY -= rotSin;
				}
				posX += rotSin;
				posY += rotCos;
				pixelId += GraphicsLD.width;
			}
		} catch (final Exception exception) {
			/* empty */
		}
	}
	
	void method1606(int x, int y, final int width, final int height, final int xOff, final int yOff, final int rotation, final int zoom, final int[] yOffs, final int[] xOffs) {
		try {
			final int centerX = width / 2;
			final int centerY = height / 2;
			int rotSin = (int) (Math.sin(rotation / 326.11) * 65536.0);
			int rotCos = (int) (Math.cos(rotation / 326.11) * 65536.0);
			rotSin = rotSin * zoom >> 8;
			rotCos = rotCos * zoom >> 8;
			int posX = (xOff << 16) - centerY * rotSin - centerX * rotCos;
			int posY = (yOff << 16) - centerY * rotCos + centerX * rotSin;
			int pixelId = x + y * GraphicsLD.width;
			for (y = 0; y < height; y++) {
				final int spriteYPos = yOffs[y];
				int destPixelId = pixelId + spriteYPos;
				int srcX = posX + rotCos * spriteYPos;
				int srcY = posY - rotSin * spriteYPos;
				for (x = 0; x < xOffs[y]; x++) {
					GraphicsLD.pixels[destPixelId++] = this.pixels[(srcX >> 16) + (srcY >> 16) * this.width];
					srcX += rotCos;
					srcY -= rotSin;
				}
				posX += rotSin;
				posY += rotCos;
				pixelId += GraphicsLD.width;
			}
		} catch (final Exception exception) {
			/* empty */
		}
	}

	@Override
	void method1589(int i, int i_152_, final int i_153_, final int i_154_, final int i_155_, final int i_156_) {
		if (i_156_ != 0) {
			i -= this.offsetX << 4;
			i_152_ -= this.offsetY << 4;
			final double d = (i_155_ & 0xffff) * 9.587379924285257E-5;
			final int i_157_ = (int) Math.floor(Math.sin(d) * i_156_ + 0.5);
			final int i_158_ = (int) Math.floor(Math.cos(d) * i_156_ + 0.5);
			final int i_159_ = -i * i_158_ + -i_152_ * i_157_;
			final int i_160_ = --i * i_157_ + -i_152_ * i_158_;
			final int i_161_ = ((this.width << 4) - i) * i_158_ + -i_152_ * i_157_;
			final int i_162_ = -((this.width << 4) - i) * i_157_ + -i_152_ * i_158_;
			final int i_163_ = -i * i_158_ + ((this.height << 4) - i_152_) * i_157_;
			final int i_164_ = --i * i_157_ + ((this.height << 4) - i_152_) * i_158_;
			final int i_165_ = ((this.width << 4) - i) * i_158_ + ((this.height << 4) - i_152_) * i_157_;
			final int i_166_ = -((this.width << 4) - i) * i_157_ + ((this.height << 4) - i_152_) * i_158_;
			int i_167_;
			int i_168_;
			if (i_159_ < i_161_) {
				i_167_ = i_159_;
				i_168_ = i_161_;
			} else {
				i_167_ = i_161_;
				i_168_ = i_159_;
			}
			if (i_163_ < i_167_) {
				i_167_ = i_163_;
			}
			if (i_165_ < i_167_) {
				i_167_ = i_165_;
			}
			if (i_163_ > i_168_) {
				i_168_ = i_163_;
			}
			if (i_165_ > i_168_) {
				i_168_ = i_165_;
			}
			int i_169_;
			int i_170_;
			if (i_160_ < i_162_) {
				i_169_ = i_160_;
				i_170_ = i_162_;
			} else {
				i_169_ = i_162_;
				i_170_ = i_160_;
			}
			if (i_164_ < i_169_) {
				i_169_ = i_164_;
			}
			if (i_166_ < i_169_) {
				i_169_ = i_166_;
			}
			if (i_164_ > i_170_) {
				i_170_ = i_164_;
			}
			if (i_166_ > i_170_) {
				i_170_ = i_166_;
			}
			i_167_ >>= 12;
			i_168_ = i_168_ + 4095 >> 12;
			i_169_ >>= 12;
			i_170_ = i_170_ + 4095 >> 12;
			i_167_ += i_153_;
			i_168_ += i_153_;
			i_169_ += i_154_;
			i_170_ += i_154_;
			i_167_ >>= 4;
			i_168_ = i_168_ + 15 >> 4;
			i_169_ >>= 4;
			i_170_ = i_170_ + 15 >> 4;
			if (i_167_ < GraphicsLD.startX) {
				i_167_ = GraphicsLD.startX;
			}
			if (i_168_ > GraphicsLD.endX) {
				i_168_ = GraphicsLD.endX;
			}
			if (i_169_ < GraphicsLD.startY) {
				i_169_ = GraphicsLD.startY;
			}
			if (i_170_ > GraphicsLD.endY) {
				i_170_ = GraphicsLD.endY;
			}
			i_168_ = i_167_ - i_168_;
			if (i_168_ < 0) {
				i_170_ = i_169_ - i_170_;
				if (i_170_ < 0) {
					int i_171_ = i_169_ * GraphicsLD.width + i_167_;
					final double d_172_ = 1.6777216E7 / i_156_;
					final int i_173_ = (int) Math.floor(Math.sin(d) * d_172_ + 0.5);
					final int i_174_ = (int) Math.floor(Math.cos(d) * d_172_ + 0.5);
					final int i_175_ = (i_167_ << 4) + 8 - i_153_;
					final int i_176_ = (i_169_ << 4) + 8 - i_154_;
					int i_177_ = (i << 8) - (i_176_ * i_173_ >> 4);
					int i_178_ = (i_152_ << 8) + (i_176_ * i_174_ >> 4);
					if (i_174_ == 0) {
						if (i_173_ == 0) {
							int i_179_ = i_170_;
							while (i_179_ < 0) {
								int i_180_ = i_171_;
								final int i_181_ = i_177_;
								final int i_182_ = i_178_;
								int i_183_ = i_168_;
								if (i_181_ >= 0 && i_182_ >= 0 && i_181_ - (this.width << 12) < 0 && i_182_ - (this.height << 12) < 0) {
									for (/**/; i_183_ < 0; i_183_++) {
										final int i_184_ = this.pixels[(i_182_ >> 12) * this.width + (i_181_ >> 12)];
										if (i_184_ != 0) {
											GraphicsLD.pixels[i_180_++] = i_184_;
										} else {
											i_180_++;
										}
									}
								}
								i_179_++;
								i_171_ += GraphicsLD.width;
							}
						} else if (i_173_ < 0) {
							int i_185_ = i_170_;
							while (i_185_ < 0) {
								int i_186_ = i_171_;
								final int i_187_ = i_177_;
								int i_188_ = i_178_ + (i_175_ * i_173_ >> 4);
								int i_189_ = i_168_;
								if (i_187_ >= 0 && i_187_ - (this.width << 12) < 0) {
									int i_190_;
									if ((i_190_ = i_188_ - (this.height << 12)) >= 0) {
										i_190_ = (i_173_ - i_190_) / i_173_;
										i_189_ += i_190_;
										i_188_ += i_173_ * i_190_;
										i_186_ += i_190_;
									}
									if ((i_190_ = (i_188_ - i_173_) / i_173_) > i_189_) {
										i_189_ = i_190_;
									}
									for (/**/; i_189_ < 0; i_189_++) {
										final int i_191_ = this.pixels[(i_188_ >> 12) * this.width + (i_187_ >> 12)];
										if (i_191_ != 0) {
											GraphicsLD.pixels[i_186_++] = i_191_;
										} else {
											i_186_++;
										}
										i_188_ += i_173_;
									}
								}
								i_185_++;
								i_177_ -= i_173_;
								i_171_ += GraphicsLD.width;
							}
						} else {
							int i_192_ = i_170_;
							while (i_192_ < 0) {
								int i_193_ = i_171_;
								final int i_194_ = i_177_;
								int i_195_ = i_178_ + (i_175_ * i_173_ >> 4);
								int i_196_ = i_168_;
								if (i_194_ >= 0 && i_194_ - (this.width << 12) < 0) {
									if (i_195_ < 0) {
										final int i_197_ = (i_173_ - 1 - i_195_) / i_173_;
										i_196_ += i_197_;
										i_195_ += i_173_ * i_197_;
										i_193_ += i_197_;
									}
									int i_198_;
									if ((i_198_ = (1 + i_195_ - (this.height << 12) - i_173_) / i_173_) > i_196_) {
										i_196_ = i_198_;
									}
									for (/**/; i_196_ < 0; i_196_++) {
										final int i_199_ = this.pixels[(i_195_ >> 12) * this.width + (i_194_ >> 12)];
										if (i_199_ != 0) {
											GraphicsLD.pixels[i_193_++] = i_199_;
										} else {
											i_193_++;
										}
										i_195_ += i_173_;
									}
								}
								i_192_++;
								i_177_ -= i_173_;
								i_171_ += GraphicsLD.width;
							}
						}
					} else if (i_174_ < 0) {
						if (i_173_ == 0) {
							int i_200_ = i_170_;
							while (i_200_ < 0) {
								int i_201_ = i_171_;
								int i_202_ = i_177_ + (i_175_ * i_174_ >> 4);
								final int i_203_ = i_178_;
								int i_204_ = i_168_;
								if (i_203_ >= 0 && i_203_ - (this.height << 12) < 0) {
									int i_205_;
									if ((i_205_ = i_202_ - (this.width << 12)) >= 0) {
										i_205_ = (i_174_ - i_205_) / i_174_;
										i_204_ += i_205_;
										i_202_ += i_174_ * i_205_;
										i_201_ += i_205_;
									}
									if ((i_205_ = (i_202_ - i_174_) / i_174_) > i_204_) {
										i_204_ = i_205_;
									}
									for (/**/; i_204_ < 0; i_204_++) {
										final int i_206_ = this.pixels[(i_203_ >> 12) * this.width + (i_202_ >> 12)];
										if (i_206_ != 0) {
											GraphicsLD.pixels[i_201_++] = i_206_;
										} else {
											i_201_++;
										}
										i_202_ += i_174_;
									}
								}
								i_200_++;
								i_178_ += i_174_;
								i_171_ += GraphicsLD.width;
							}
						} else if (i_173_ < 0) {
							int i_207_ = i_170_;
							while (i_207_ < 0) {
								int i_208_ = i_171_;
								int i_209_ = i_177_ + (i_175_ * i_174_ >> 4);
								int i_210_ = i_178_ + (i_175_ * i_173_ >> 4);
								int i_211_ = i_168_;
								int i_212_;
								if ((i_212_ = i_209_ - (this.width << 12)) >= 0) {
									i_212_ = (i_174_ - i_212_) / i_174_;
									i_211_ += i_212_;
									i_209_ += i_174_ * i_212_;
									i_210_ += i_173_ * i_212_;
									i_208_ += i_212_;
								}
								if ((i_212_ = (i_209_ - i_174_) / i_174_) > i_211_) {
									i_211_ = i_212_;
								}
								if ((i_212_ = i_210_ - (this.height << 12)) >= 0) {
									i_212_ = (i_173_ - i_212_) / i_173_;
									i_211_ += i_212_;
									i_209_ += i_174_ * i_212_;
									i_210_ += i_173_ * i_212_;
									i_208_ += i_212_;
								}
								if ((i_212_ = (i_210_ - i_173_) / i_173_) > i_211_) {
									i_211_ = i_212_;
								}
								for (/**/; i_211_ < 0; i_211_++) {
									final int i_213_ = this.pixels[(i_210_ >> 12) * this.width + (i_209_ >> 12)];
									if (i_213_ != 0) {
										GraphicsLD.pixels[i_208_++] = i_213_;
									} else {
										i_208_++;
									}
									i_209_ += i_174_;
									i_210_ += i_173_;
								}
								i_207_++;
								i_177_ -= i_173_;
								i_178_ += i_174_;
								i_171_ += GraphicsLD.width;
							}
						} else {
							int i_214_ = i_170_;
							while (i_214_ < 0) {
								int i_215_ = i_171_;
								int i_216_ = i_177_ + (i_175_ * i_174_ >> 4);
								int i_217_ = i_178_ + (i_175_ * i_173_ >> 4);
								int i_218_ = i_168_;
								int i_219_;
								if ((i_219_ = i_216_ - (this.width << 12)) >= 0) {
									i_219_ = (i_174_ - i_219_) / i_174_;
									i_218_ += i_219_;
									i_216_ += i_174_ * i_219_;
									i_217_ += i_173_ * i_219_;
									i_215_ += i_219_;
								}
								if ((i_219_ = (i_216_ - i_174_) / i_174_) > i_218_) {
									i_218_ = i_219_;
								}
								if (i_217_ < 0) {
									i_219_ = (i_173_ - 1 - i_217_) / i_173_;
									i_218_ += i_219_;
									i_216_ += i_174_ * i_219_;
									i_217_ += i_173_ * i_219_;
									i_215_ += i_219_;
								}
								if ((i_219_ = (1 + i_217_ - (this.height << 12) - i_173_) / i_173_) > i_218_) {
									i_218_ = i_219_;
								}
								for (/**/; i_218_ < 0; i_218_++) {
									final int i_220_ = this.pixels[(i_217_ >> 12) * this.width + (i_216_ >> 12)];
									if (i_220_ != 0) {
										GraphicsLD.pixels[i_215_++] = i_220_;
									} else {
										i_215_++;
									}
									i_216_ += i_174_;
									i_217_ += i_173_;
								}
								i_214_++;
								i_177_ -= i_173_;
								i_178_ += i_174_;
								i_171_ += GraphicsLD.width;
							}
						}
					} else if (i_173_ == 0) {
						int i_221_ = i_170_;
						while (i_221_ < 0) {
							int i_222_ = i_171_;
							int i_223_ = i_177_ + (i_175_ * i_174_ >> 4);
							final int i_224_ = i_178_;
							int i_225_ = i_168_;
							if (i_224_ >= 0 && i_224_ - (this.height << 12) < 0) {
								if (i_223_ < 0) {
									final int i_226_ = (i_174_ - 1 - i_223_) / i_174_;
									i_225_ += i_226_;
									i_223_ += i_174_ * i_226_;
									i_222_ += i_226_;
								}
								int i_227_;
								if ((i_227_ = (1 + i_223_ - (this.width << 12) - i_174_) / i_174_) > i_225_) {
									i_225_ = i_227_;
								}
								for (/**/; i_225_ < 0; i_225_++) {
									final int i_228_ = this.pixels[(i_224_ >> 12) * this.width + (i_223_ >> 12)];
									if (i_228_ != 0) {
										GraphicsLD.pixels[i_222_++] = i_228_;
									} else {
										i_222_++;
									}
									i_223_ += i_174_;
								}
							}
							i_221_++;
							i_178_ += i_174_;
							i_171_ += GraphicsLD.width;
						}
					} else if (i_173_ < 0) {
						int i_229_ = i_170_;
						while (i_229_ < 0) {
							int i_230_ = i_171_;
							int i_231_ = i_177_ + (i_175_ * i_174_ >> 4);
							int i_232_ = i_178_ + (i_175_ * i_173_ >> 4);
							int i_233_ = i_168_;
							if (i_231_ < 0) {
								final int i_234_ = (i_174_ - 1 - i_231_) / i_174_;
								i_233_ += i_234_;
								i_231_ += i_174_ * i_234_;
								i_232_ += i_173_ * i_234_;
								i_230_ += i_234_;
							}
							int i_235_;
							if ((i_235_ = (1 + i_231_ - (this.width << 12) - i_174_) / i_174_) > i_233_) {
								i_233_ = i_235_;
							}
							if ((i_235_ = i_232_ - (this.height << 12)) >= 0) {
								i_235_ = (i_173_ - i_235_) / i_173_;
								i_233_ += i_235_;
								i_231_ += i_174_ * i_235_;
								i_232_ += i_173_ * i_235_;
								i_230_ += i_235_;
							}
							if ((i_235_ = (i_232_ - i_173_) / i_173_) > i_233_) {
								i_233_ = i_235_;
							}
							for (/**/; i_233_ < 0; i_233_++) {
								final int i_236_ = this.pixels[(i_232_ >> 12) * this.width + (i_231_ >> 12)];
								if (i_236_ != 0) {
									GraphicsLD.pixels[i_230_++] = i_236_;
								} else {
									i_230_++;
								}
								i_231_ += i_174_;
								i_232_ += i_173_;
							}
							i_229_++;
							i_177_ -= i_173_;
							i_178_ += i_174_;
							i_171_ += GraphicsLD.width;
						}
					} else {
						int i_237_ = i_170_;
						while (i_237_ < 0) {
							int i_238_ = i_171_;
							int i_239_ = i_177_ + (i_175_ * i_174_ >> 4);
							int i_240_ = i_178_ + (i_175_ * i_173_ >> 4);
							int i_241_ = i_168_;
							if (i_239_ < 0) {
								final int i_242_ = (i_174_ - 1 - i_239_) / i_174_;
								i_241_ += i_242_;
								i_239_ += i_174_ * i_242_;
								i_240_ += i_173_ * i_242_;
								i_238_ += i_242_;
							}
							int i_243_;
							if ((i_243_ = (1 + i_239_ - (this.width << 12) - i_174_) / i_174_) > i_241_) {
								i_241_ = i_243_;
							}
							if (i_240_ < 0) {
								i_243_ = (i_173_ - 1 - i_240_) / i_173_;
								i_241_ += i_243_;
								i_239_ += i_174_ * i_243_;
								i_240_ += i_173_ * i_243_;
								i_238_ += i_243_;
							}
							if ((i_243_ = (1 + i_240_ - (this.height << 12) - i_173_) / i_173_) > i_241_) {
								i_241_ = i_243_;
							}
							for (/**/; i_241_ < 0; i_241_++) {
								final int i_244_ = this.pixels[(i_240_ >> 12) * this.width + (i_239_ >> 12)];
								if (i_244_ != 0) {
									GraphicsLD.pixels[i_238_++] = i_244_;
								} else {
									i_238_++;
								}
								i_239_ += i_174_;
								i_240_ += i_173_;
							}
							i_237_++;
							i_177_ -= i_173_;
							i_178_ += i_174_;
							i_171_ += GraphicsLD.width;
						}
					}
				}
			}
		}
	}

	final void outline(final int color) {
		final int[] pixels = new int[this.width * this.height];
		int pixelPos = 0;
		for (int y = 0; y < this.height; y++) {
			for (int x = 0; x < this.width; x++) {
				int pixel = this.pixels[pixelPos];
				if (pixel == 0) {
					if (x > 0 && this.pixels[pixelPos - 1] != 0) {
						pixel = color;
					} else if (y > 0 && this.pixels[pixelPos - this.width] != 0) {
						pixel = color;
					} else if (x < this.width - 1 && this.pixels[pixelPos + 1] != 0) {
						pixel = color;
					} else if (y < this.height - 1 && this.pixels[pixelPos + this.width] != 0) {
						pixel = color;
					}
				}
				pixels[pixelPos++] = pixel;
			}
		}
		this.pixels = pixels;
	}

	private static final void method1614(final int[] is, final int[] is_249_, int i, int i_250_, int i_251_, int i_252_, final int i_253_, final int i_254_, final int i_255_) {
		final int i_256_ = -(i_252_ >> 2);
		i_252_ = -(i_252_ & 0x3);
		for (int i_257_ = -i_253_; i_257_ < 0; i_257_++) {
			for (int i_258_ = i_256_; i_258_ < 0; i_258_++) {
				i = is_249_[i_250_--];
				if (i != 0) {
					is[i_251_++] = i;
				} else {
					i_251_++;
				}
				i = is_249_[i_250_--];
				if (i != 0) {
					is[i_251_++] = i;
				} else {
					i_251_++;
				}
				i = is_249_[i_250_--];
				if (i != 0) {
					is[i_251_++] = i;
				} else {
					i_251_++;
				}
				i = is_249_[i_250_--];
				if (i != 0) {
					is[i_251_++] = i;
				} else {
					i_251_++;
				}
			}
			for (int i_259_ = i_252_; i_259_ < 0; i_259_++) {
				i = is_249_[i_250_--];
				if (i != 0) {
					is[i_251_++] = i;
				} else {
					i_251_++;
				}
			}
			i_251_ += i_254_;
			i_250_ += i_255_;
		}
	}

	final void method1615() {
		if (this.width != this.trimWidth || this.height != this.trimHeight) {
			final int[] is = new int[this.trimWidth * this.trimHeight];
			for (int i = 0; i < this.height; i++) {
				for (int i_260_ = 0; i_260_ < this.width; i_260_++) {
					is[(i + this.offsetY) * this.trimWidth + i_260_ + this.offsetX] = this.pixels[i * this.width + i_260_];
				}
			}
			this.pixels = is;
			this.width = this.trimWidth;
			this.height = this.trimHeight;
			this.offsetX = 0;
			this.offsetY = 0;
		}
	}

	final void method1616(final int i) {
		if (this.width != this.trimWidth || this.height != this.trimHeight) {
			int i_261_ = i;
			if (i_261_ > this.offsetX) {
				i_261_ = this.offsetX;
			}
			int i_262_ = i;
			if (i_262_ + this.offsetX + this.width > this.trimWidth) {
				i_262_ = this.trimWidth - this.offsetX - this.width;
			}
			int i_263_ = i;
			if (i_263_ > this.offsetY) {
				i_263_ = this.offsetY;
			}
			int i_264_ = i;
			if (i_264_ + this.offsetY + this.height > this.trimHeight) {
				i_264_ = this.trimHeight - this.offsetY - this.height;
			}
			final int i_265_ = this.width + i_261_ + i_262_;
			final int i_266_ = this.height + i_263_ + i_264_;
			final int[] is = new int[i_265_ * i_266_];
			for (int i_267_ = 0; i_267_ < this.height; i_267_++) {
				for (int i_268_ = 0; i_268_ < this.width; i_268_++) {
					is[(i_267_ + i_263_) * i_265_ + i_268_ + i_261_] = this.pixels[i_267_ * this.width + i_268_];
				}
			}
			this.pixels = is;
			this.width = i_265_;
			this.height = i_266_;
			this.offsetX -= i_261_;
			this.offsetY -= i_263_;
		}
	}

	@Override
	void method1591(int i, int i_269_) {
		i += this.offsetX;
		i_269_ += this.offsetY;
		int i_270_ = i + i_269_ * GraphicsLD.width;
		int i_271_ = 0;
		int i_272_ = this.height;
		int i_273_ = this.width;
		int i_274_ = GraphicsLD.width - i_273_;
		int i_275_ = 0;
		if (i_269_ < GraphicsLD.startY) {
			final int i_276_ = GraphicsLD.startY - i_269_;
			i_272_ -= i_276_;
			i_269_ = GraphicsLD.startY;
			i_271_ += i_276_ * i_273_;
			i_270_ += i_276_ * GraphicsLD.width;
		}
		if (i_269_ + i_272_ > GraphicsLD.endY) {
			i_272_ -= i_269_ + i_272_ - GraphicsLD.endY;
		}
		if (i < GraphicsLD.startX) {
			final int i_277_ = GraphicsLD.startX - i;
			i_273_ -= i_277_;
			i = GraphicsLD.startX;
			i_271_ += i_277_;
			i_270_ += i_277_;
			i_275_ += i_277_;
			i_274_ += i_277_;
		}
		if (i + i_273_ > GraphicsLD.endX) {
			final int i_278_ = i + i_273_ - GraphicsLD.endX;
			i_273_ -= i_278_;
			i_275_ += i_278_;
			i_274_ += i_278_;
		}
		if (i_273_ > 0 && i_272_ > 0) {
			method1619(GraphicsLD.pixels, this.pixels, i_271_, i_270_, i_273_, i_272_, i_274_, i_275_);
		}
	}

	@Override
	void drawReg(int x, int y) {
		x += this.offsetX;
		y += this.offsetY;
		int destPixelId = x + y * GraphicsLD.width;
		int srcPixelId = 0;
		int spriteHeight = this.height;
		int spriteWidth = this.width;
		int destPixelStep = GraphicsLD.width - spriteWidth;
		int srcPixelStep = 0;
		if (y < GraphicsLD.startY) {
			final int outOfBoundsY = GraphicsLD.startY - y;
			spriteHeight -= outOfBoundsY;
			y = GraphicsLD.startY;
			srcPixelId += outOfBoundsY * spriteWidth;
			destPixelId += outOfBoundsY * GraphicsLD.width;
		}
		if (y + spriteHeight > GraphicsLD.endY) {
			spriteHeight -= y + spriteHeight - GraphicsLD.endY;
		}
		if (x < GraphicsLD.startX) {
			final int outOfBoundsX = GraphicsLD.startX - x;
			spriteWidth -= outOfBoundsX;
			x = GraphicsLD.startX;
			srcPixelId += outOfBoundsX;
			destPixelId += outOfBoundsX;
			srcPixelStep += outOfBoundsX;
			destPixelStep += outOfBoundsX;
		}
		if (x + spriteWidth > GraphicsLD.endX) {
			final int outOfBoundsX = x + spriteWidth - GraphicsLD.endX;
			spriteWidth -= outOfBoundsX;
			srcPixelStep += outOfBoundsX;
			destPixelStep += outOfBoundsX;
		}
		if (spriteWidth > 0 && spriteHeight > 0) {
			plotPixels(GraphicsLD.pixels, this.pixels, 0, srcPixelId, destPixelId, spriteWidth, spriteHeight, destPixelStep, srcPixelStep);
		}
	}

	@Override
	void method1585(int i, int i_289_, int i_290_, int i_291_, final int i_292_) {
		if (i_290_ > 0 && i_291_ > 0) {
			final int i_293_ = this.width;
			final int i_294_ = this.height;
			int i_295_ = 0;
			int i_296_ = 0;
			final int i_297_ = this.trimWidth;
			final int i_298_ = this.trimHeight;
			final int i_299_ = (i_297_ << 16) / i_290_;
			final int i_300_ = (i_298_ << 16) / i_291_;
			if (this.offsetX > 0) {
				final int i_301_ = ((this.offsetX << 16) + i_299_ - 1) / i_299_;
				i += i_301_;
				i_295_ += i_301_ * i_299_ - (this.offsetX << 16);
			}
			if (this.offsetY > 0) {
				final int i_302_ = ((this.offsetY << 16) + i_300_ - 1) / i_300_;
				i_289_ += i_302_;
				i_296_ += i_302_ * i_300_ - (this.offsetY << 16);
			}
			if (i_293_ < i_297_) {
				i_290_ = ((i_293_ << 16) - i_295_ + i_299_ - 1) / i_299_;
			}
			if (i_294_ < i_298_) {
				i_291_ = ((i_294_ << 16) - i_296_ + i_300_ - 1) / i_300_;
			}
			int i_303_ = i + i_289_ * GraphicsLD.width;
			int i_304_ = GraphicsLD.width - i_290_;
			if (i_289_ + i_291_ > GraphicsLD.endY) {
				i_291_ -= i_289_ + i_291_ - GraphicsLD.endY;
			}
			if (i_289_ < GraphicsLD.startY) {
				final int i_305_ = GraphicsLD.startY - i_289_;
				i_291_ -= i_305_;
				i_303_ += i_305_ * GraphicsLD.width;
				i_296_ += i_300_ * i_305_;
			}
			if (i + i_290_ > GraphicsLD.endX) {
				final int i_306_ = i + i_290_ - GraphicsLD.endX;
				i_290_ -= i_306_;
				i_304_ += i_306_;
			}
			if (i < GraphicsLD.startX) {
				final int i_307_ = GraphicsLD.startX - i;
				i_290_ -= i_307_;
				i_303_ += i_307_;
				i_295_ += i_299_ * i_307_;
				i_304_ += i_307_;
			}
			method1620(GraphicsLD.pixels, this.pixels, 0, i_295_, i_296_, i_303_, i_304_, i_290_, i_291_, i_299_, i_300_, i_293_, i_292_);
		}
	}

	@Override
	void method1592(int x, int y) {
		x += this.trimWidth - this.width - this.offsetX;
		y += this.offsetY;
		int i_309_ = x + y * GraphicsLD.width;
		int i_310_ = this.width - 1;
		int i_311_ = this.height;
		int i_312_ = this.width;
		int i_313_ = GraphicsLD.width - i_312_;
		int i_314_ = i_312_ + i_312_;
		if (y < GraphicsLD.startY) {
			final int i_315_ = GraphicsLD.startY - y;
			i_311_ -= i_315_;
			y = GraphicsLD.startY;
			i_310_ += i_315_ * i_312_;
			i_309_ += i_315_ * GraphicsLD.width;
		}
		if (y + i_311_ > GraphicsLD.endY) {
			i_311_ -= y + i_311_ - GraphicsLD.endY;
		}
		if (x < GraphicsLD.startX) {
			final int i_316_ = GraphicsLD.startX - x;
			i_312_ -= i_316_;
			x = GraphicsLD.startX;
			i_310_ -= i_316_;
			i_309_ += i_316_;
			i_314_ -= i_316_;
			i_313_ += i_316_;
		}
		if (x + i_312_ > GraphicsLD.endX) {
			final int i_317_ = x + i_312_ - GraphicsLD.endX;
			i_312_ -= i_317_;
			i_314_ -= i_317_;
			i_313_ += i_317_;
		}
		if (i_312_ > 0 && i_311_ > 0) {
			method1614(GraphicsLD.pixels, this.pixels, 0, i_310_, i_309_, i_312_, i_311_, i_313_, i_314_);
		}
	}

	final void init2dCanvas() {
		GraphicsLD.init2dCanvas(this.pixels, this.width, this.height);
	}

	LDSprite(final int i, final int i_318_) {
		this.pixels = new int[i * i_318_];
		this.width = this.trimWidth = i;
		this.height = this.trimHeight = i_318_;
		this.offsetX = this.offsetY = 0;
	}

	private static final void plotPixels(final int[] destPixels, final int[] srcPixels, int color, int srcPixelId, int destPixelId, int spriteWidth, final int spriteHeight, final int destPixelStep, final int srcPixelStep) {
		final int widthLoops = -(spriteWidth >> 2);
		spriteWidth = -(spriteWidth & 0x3);
		for (int heightLoop = -spriteHeight; heightLoop < 0; heightLoop++) {
			for (int widthLoop = widthLoops; widthLoop < 0; widthLoop++) {
				color = srcPixels[srcPixelId++];
				if (color != 0) {
					destPixels[destPixelId++] = color;
				} else {
					destPixelId++;
				}
				color = srcPixels[srcPixelId++];
				if (color != 0) {
					destPixels[destPixelId++] = color;
				} else {
					destPixelId++;
				}
				color = srcPixels[srcPixelId++];
				if (color != 0) {
					destPixels[destPixelId++] = color;
				} else {
					destPixelId++;
				}
				color = srcPixels[srcPixelId++];
				if (color != 0) {
					destPixels[destPixelId++] = color;
				} else {
					destPixelId++;
				}
			}
			for (int widthLoop = spriteWidth; widthLoop < 0; widthLoop++) {
				color = srcPixels[srcPixelId++];
				if (color != 0) {
					destPixels[destPixelId++] = color;
				} else {
					destPixelId++;
				}
			}
			destPixelId += destPixelStep;
			srcPixelId += srcPixelStep;
		}
	}

	private static final void method1619(final int[] is, final int[] is_330_, int i, int i_331_, final int i_332_, final int i_333_, final int i_334_, final int i_335_) {
		for (int i_336_ = -i_333_; i_336_ < 0; i_336_++) {
			int i_337_ = i_331_ + i_332_ - 3;
			while (i_331_ < i_337_) {
				is[i_331_++] = is_330_[i++];
				is[i_331_++] = is_330_[i++];
				is[i_331_++] = is_330_[i++];
				is[i_331_++] = is_330_[i++];
			}
			i_337_ += 3;
			while (i_331_ < i_337_) {
				is[i_331_++] = is_330_[i++];
			}
			i_331_ += i_334_;
			i += i_335_;
		}
	}

	private static final void method1620(final int[] is, final int[] is_338_, int i, int i_339_, int i_340_, int i_341_, final int i_342_, final int i_343_, final int i_344_, final int i_345_, final int i_346_, final int i_347_, final int i_348_) {
		final int i_349_ = 256 - i_348_;
		final int i_350_ = i_339_;
		for (int i_351_ = -i_344_; i_351_ < 0; i_351_++) {
			final int i_352_ = (i_340_ >> 16) * i_347_;
			for (int i_353_ = -i_343_; i_353_ < 0; i_353_++) {
				i = is_338_[(i_339_ >> 16) + i_352_];
				if (i != 0) {
					final int i_354_ = is[i_341_];
					is[i_341_++] = ((i & 0xff00ff) * i_348_ + (i_354_ & 0xff00ff) * i_349_ & ~0xff00ff) + ((i & 0xff00) * i_348_ + (i_354_ & 0xff00) * i_349_ & 0xff0000) >> 8;
				} else {
					i_341_++;
				}
				i_339_ += i_345_;
			}
			i_340_ += i_346_;
			i_339_ = i_350_;
			i_341_ += i_342_;
		}
	}
}
