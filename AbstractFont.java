/* Class120_Sub14_Sub8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

abstract class AbstractFont extends NodeSub {
	private int anInt3494;
	int[] spriteHeights;
	private int[] xOffsets;
	int yOff = 0;
	private byte[] aByteArray3498;
	private AbstractIndexedSprite[] nameIcons;
	private static StringBuffer aStringBuffer3500 = new StringBuffer(100);
	private int[] nameIconsHeight;
	private int[] yOffsets;
	private int[] charWidths;
	int[] spriteWidths;
	private static int oldTransparency;
	private static int transparency = 256;
	private static int textColor;
	private static int shadowColor;
	private static int oldTextColor;
	private static int oldShadowColor;
	private static int anInt3511 = 0;
	private int anInt3512;
	private static int strikethroughColor;
	private static int underlineColor;
	private static int anInt3515;
	private static String[] aStringArray3516;

	static {
		oldTransparency = 256;
		textColor = 0;
		anInt3515 = 0;
		oldShadowColor = -1;
		underlineColor = -1;
		strikethroughColor = -1;
		aStringArray3516 = new String[100];
		shadowColor = -1;
		oldTextColor = 0;
	}

	private final void method1458(final byte[] is) {
		charWidths = new int[256];
		if (is.length == 257) {
			for (int i = 0; i < charWidths.length; i++) {
				charWidths[i] = is[i] & 0xff;
			}
			this.yOff = is[256] & 0xff;
		} else {
			int i = 0;
			for (int i_0_ = 0; i_0_ < 256; i_0_++) {
				charWidths[i_0_] = is[i++] & 0xff;
			}
			final int[] is_1_ = new int[256];
			final int[] is_2_ = new int[256];
			for (int i_3_ = 0; i_3_ < 256; i_3_++) {
				is_1_[i_3_] = is[i++] & 0xff;
			}
			for (int i_4_ = 0; i_4_ < 256; i_4_++) {
				is_2_[i_4_] = is[i++] & 0xff;
			}
			final byte[][] is_5_ = new byte[256][];
			for (int i_6_ = 0; i_6_ < 256; i_6_++) {
				is_5_[i_6_] = new byte[is_1_[i_6_]];
				byte i_7_ = 0;
				for (int i_8_ = 0; i_8_ < is_5_[i_6_].length; i_8_++) {
					i_7_ += is[i++];
					is_5_[i_6_][i_8_] = i_7_;
				}
			}
			final byte[][] is_9_ = new byte[256][];
			for (int i_10_ = 0; i_10_ < 256; i_10_++) {
				is_9_[i_10_] = new byte[is_1_[i_10_]];
				byte i_11_ = 0;
				for (int i_12_ = 0; i_12_ < is_9_[i_10_].length; i_12_++) {
					i_11_ += is[i++];
					is_9_[i_10_][i_12_] = i_11_;
				}
			}
			aByteArray3498 = new byte[65536];
			for (int i_13_ = 0; i_13_ < 256; i_13_++) {
				if (i_13_ != 32 && i_13_ != 160) {
					for (int i_14_ = 0; i_14_ < 256; i_14_++) {
						if (i_14_ != 32 && i_14_ != 160) {
							aByteArray3498[(i_13_ << 8) + i_14_] = (byte) method1477(is_5_, is_9_, is_2_, charWidths, is_1_, i_13_, i_14_);
						}
					}
				}
			}
			this.yOff = is_2_[32] + is_1_[32];
		}
	}

	final int method1459(final String string) {
		if (string == null) {
			return 0;
		}
		int i = -1;
		int i_15_ = 0;
		int i_16_ = 0;
		final int i_17_ = string.length();
		for (int i_18_ = 0; i_18_ < i_17_; i_18_++) {
			char c = string.charAt(i_18_);
			if (c == '<') {
				i = i_18_;
			} else {
				if (c == '>' && i != -1) {
					final String string_19_ = string.substring(i + 1, i_18_).toLowerCase();
					i = -1;
					if (string_19_.equals("lt")) {//Less than
						c = '<';
					} else if (string_19_.equals("gt")) {//Greater than
						c = '>';
					} else if (string_19_.equals("nbsp")) {//No-break space
						c = '\u00a0';
					} else if (string_19_.equals("shy")) {//Soft hyphen
						c = '\u00ad';
					} else if (string_19_.equals("times")) {//Multiplication sign - x
						c = '\u00d7';
					} else if (string_19_.equals("euro")) {//Euro
						c = '\u20ac';
					} else if (string_19_.equals("copy")) {//Copyright sign
						c = '\u00a9';
					} else if (string_19_.equals("reg")) {//Registered sign
						c = '\u00ae';
					} else {
						if (string_19_.startsWith("img=")) {
							try {
								final int i_20_ = Class31.stringToBase10(string_19_.substring(4));
								i_16_ += nameIcons[i_20_].trimWidth;
								i_15_ = 0;
							} catch (final Exception exception) {
								/* empty */
							}
						}
						continue;
					}
				}
				if (i == -1) {
					final int i_21_ = (char) (LongNode.method1060(c) & 0xff);
					i_16_ += charWidths[i_21_];
					if (aByteArray3498 != null && i_15_ != 0) {
						i_16_ += aByteArray3498[(i_15_ << 8) + i_21_];
					}
					i_15_ = i_21_;
				}
			}
		}
		return i_16_;
	}

	abstract void drawChar(int i, int i_22_, int i_23_, int i_24_, int i_25_, int i_26_, boolean bool);

	private final void method1461(final String text, int x, int y) {
		y -= this.yOff;
		int effectStartIndex = -1;
		int i_29_ = 0;
		for (int charIndex = 0; charIndex < text.length(); charIndex++) {
			char c = text.charAt(charIndex);
			if (c == '<') {
				effectStartIndex = charIndex;
			} else {
				if (c == '>' && effectStartIndex != -1) {
					final String effect = text.substring(effectStartIndex + 1, charIndex).toLowerCase();
					effectStartIndex = -1;
					if (effect.equals("lt")) {
						c = '<';
					} else if (effect.equals("gt")) {
						c = '>';
					} else if (effect.equals("nbsp")) {
						c = '\u00a0';
					} else if (effect.equals("shy")) {
						c = '\u00ad';
					} else if (effect.equals("times")) {
						c = '\u00d7';
					} else if (effect.equals("euro")) {
						c = '\u20ac';
					} else if (effect.equals("copy")) {
						c = '\u00a9';
					} else if (effect.equals("reg")) {
						c = '\u00ae';
					} else {
						if (effect.startsWith("img=")) {
							try {
								final int id = Class31.stringToBase10(effect.substring(4));
								final AbstractIndexedSprite nameIcon = nameIcons[id];
								final int i_34_ = nameIconsHeight != null ? nameIconsHeight[id] : nameIcon.trimHeight;
								if (transparency == 256) {
									nameIcon.drawReg(x, y + this.yOff - i_34_);
								} else {
									nameIcon.method911(x, y + this.yOff - i_34_, transparency);
								}
								x += nameIcon.trimWidth;
								i_29_ = 0;
							} catch (final Exception exception) {
								/* empty */
							}
						} else {
							setEffectsFromText(effect);
						}
						continue;
					}
				}
				if (effectStartIndex == -1) {
					final int charId = (char) (LongNode.method1060(c) & 0xff);
					if (aByteArray3498 != null && i_29_ != 0) {
						x += aByteArray3498[(i_29_ << 8) + charId];
					}
					final int charWidth = this.spriteWidths[charId];
					final int charHeight = this.spriteHeights[charId];
					if (charId != 32) {
						if (transparency == 256) {
							if (shadowColor != -1) {
								drawChar(charId, x + xOffsets[charId] + 1, y + yOffsets[charId] + 1, charWidth, charHeight, shadowColor, true);
							}
							drawChar(charId, x + xOffsets[charId], y + yOffsets[charId], charWidth, charHeight, textColor, false);
						} else {
							if (shadowColor != -1) {
								drawTransparentChar(charId, x + xOffsets[charId] + 1, y + yOffsets[charId] + 1, charWidth, charHeight, shadowColor, transparency, true);
							}
							drawTransparentChar(charId, x + xOffsets[charId], y + yOffsets[charId], charWidth, charHeight, textColor, transparency, false);
						}
					} else if (anInt3515 > 0) {
						anInt3511 += anInt3515;
						x += anInt3511 >> 8;
						anInt3511 &= 0xff;
					}
					final int i_38_ = charWidths[charId];
					if (strikethroughColor != -1) {
						if (HDToolkit.glEnabled) {
							GraphicsHD.drawHorizontalLine(x, y + (int) (this.yOff * 0.7), i_38_, strikethroughColor);
						} else {
							GraphicsLD.drawHorizontalLine(x, y + (int) (this.yOff * 0.7), i_38_, strikethroughColor);
						}
					}
					if (underlineColor != -1) {
						if (HDToolkit.glEnabled) {
							GraphicsHD.drawHorizontalLine(x, y + this.yOff + 1, i_38_, underlineColor);
						} else {
							GraphicsLD.drawHorizontalLine(x, y + this.yOff + 1, i_38_, underlineColor);
						}
					}
					x += i_38_;
					i_29_ = charId;
				}
			}
		}
	}

	final int drawInterfaceText(final String text, final int x, final int y, final int width, final int height, final int textColor, final int shadowColor, final int horizontalAlignment, final int verticalAlignment, final int verticalSpacing) {
		return drawInterfaceText(text, x, y, width, height, textColor, shadowColor, 256, horizontalAlignment, verticalAlignment, verticalSpacing);
	}

	final void method1463(final String string, final int i, final int i_47_, final int i_48_, final int i_49_, final int i_50_) {
		if (string != null) {
			setColors(i_48_, i_49_);
			final int i_51_ = string.length();
			final int[] is = new int[i_51_];
			final int[] is_52_ = new int[i_51_];
			for (int i_53_ = 0; i_53_ < i_51_; i_53_++) {
				is[i_53_] = (int) (Math.sin(i_53_ / 5.0 + i_50_ / 5.0) * 5.0);
				is_52_[i_53_] = (int) (Math.sin(i_53_ / 3.0 + i_50_ / 5.0) * 5.0);
			}
			method1475(string, i - method1459(string) / 2, i_47_, is, is_52_);
		}
	}

	private final void method1464(final String string, final int width) {
		int spaceCount = 0;
		boolean effectStart = false;
		for (int charIndex = 0; charIndex < string.length(); charIndex++) {
			final char c = string.charAt(charIndex);
			if (c == '<') {
				effectStart = true;
			} else if (c == '>') {
				effectStart = false;
			} else if (!effectStart && c == ' ') {
				spaceCount++;
			}
		}
		if (spaceCount > 0) {
			anInt3515 = (width - method1459(string) << 8) / spaceCount;
		}
	}

	private final void setColors(final int text, final int shadow) {
		strikethroughColor = -1;
		underlineColor = -1;
		shadowColor = oldShadowColor = shadow;
		textColor = oldTextColor = text;
		transparency = oldTransparency = 256;
		anInt3515 = 0;
		anInt3511 = 0;
	}

	final void method1466(final String text, final int x, final int y, final int textColor, final int shadowColor) {
		if (text != null) {
			setColors(textColor, shadowColor);
			method1461(text, x, y);
		}
	}

	final int drawInterfaceText(final String text, final int x, final int y, final int width, final int height, final int textColor, final int shadowColor, final int transparency, final int horizontalAlignment, int verticalAlignment, int verticalSpacing) {
		if (text == null) {
			return 0;
		}
		setFontEffects(textColor, shadowColor, transparency);
		if (verticalSpacing == 0) {
			verticalSpacing = this.yOff;
		}
		int[] is = { width };
		if (height < anInt3494 + anInt3512 + verticalSpacing && height < verticalSpacing + verticalSpacing) {
			is = null;
		}
		final int lineCount = method1486(text, is, aStringArray3516);
		if (verticalAlignment == 3 && lineCount == 1) {
			verticalAlignment = 1;
		}
		int textY;
		if (verticalAlignment == 0) {
			textY = y + anInt3494;
		} else if (verticalAlignment == 1) {
			textY = y + anInt3494 + (height - anInt3494 - anInt3512 - (lineCount - 1) * verticalSpacing) / 2;
		} else if (verticalAlignment == 2) {
			textY = y + height - anInt3512 - (lineCount - 1) * verticalSpacing;
		} else {
			int i_72_ = (height - anInt3494 - anInt3512 - (lineCount - 1) * verticalSpacing) / (lineCount + 1);
			if (i_72_ < 0) {
				i_72_ = 0;
			}
			textY = y + anInt3494 + i_72_;
			verticalSpacing += i_72_;
		}
		for (int lineId = 0; lineId < lineCount; lineId++) {
			if (horizontalAlignment == 0) {
				method1461(aStringArray3516[lineId], x, textY);
			} else if (horizontalAlignment == 1) {
				method1461(aStringArray3516[lineId], x + (width - method1459(aStringArray3516[lineId])) / 2, textY);
			} else if (horizontalAlignment == 2) {
				method1461(aStringArray3516[lineId], x + width - method1459(aStringArray3516[lineId]), textY);
			} else if (lineId == lineCount - 1) {
				method1461(aStringArray3516[lineId], x, textY);
			} else {
				method1464(aStringArray3516[lineId], width);
				method1461(aStringArray3516[lineId], x, textY);
				anInt3515 = 0;
			}
			textY += verticalSpacing;
		}
		return lineCount;
	}

	final int paragraphWidth(final String string, final int i) {
		final int i_74_ = method1486(string, new int[] { i }, aStringArray3516);
		int i_75_ = 0;
		for (int i_76_ = 0; i_76_ < i_74_; i_76_++) {
			final int i_77_ = method1459(aStringArray3516[i_76_]);
			if (i_75_ < i_77_) {
				i_75_ = i_77_;
			}
		}
		return i_75_;
	}

	final void method1469(final String string, final int i, final int i_78_, final int i_79_, final int i_80_, final int i_81_) {
		if (string != null) {
			setColors(i_79_, i_80_);
			final int i_82_ = string.length();
			final int[] is = new int[i_82_];
			for (int i_83_ = 0; i_83_ < i_82_; i_83_++) {
				is[i_83_] = (int) (Math.sin(i_83_ / 2.0 + i_81_ / 5.0) * 5.0);
			}
			method1475(string, i - method1459(string) / 2, i_78_, null, is);
		}
	}

	final int method1470(final String string, final int i, final int i_84_, final int i_85_, final int i_86_, final Random random, final int i_87_) {
		if (string == null) {
			return 0;
		}
		random.setSeed(i_87_);
		setFontEffects(i_85_, i_86_, 192 + (random.nextInt() & 0x1f));
		final int i_88_ = string.length();
		final int[] is = new int[i_88_];
		int i_89_ = 0;
		for (int i_90_ = 0; i_90_ < i_88_; i_90_++) {
			is[i_90_] = i_89_;
			if ((random.nextInt() & 0x3) == 0) {
				i_89_++;
			}
		}
		method1475(string, i, i_84_, is, null);
		return i_89_;
	}

	abstract void drawTransparentChar(int i, int i_91_, int i_92_, int i_93_, int i_94_, int i_95_, int i_96_, boolean bool);

	static final String removeTags(final String string) {
		final int i = string.length();
		int i_97_ = 0;
		for (int i_98_ = 0; i_98_ < i; i_98_++) {
			final char c = string.charAt(i_98_);
			if (c == '<' || c == '>') {
				i_97_ += 3;
			}
		}
		final StringBuffer stringbuffer = new StringBuffer(i + i_97_);
		for (int i_99_ = 0; i_99_ < i; i_99_++) {
			final char c = string.charAt(i_99_);
			if (c == '<') {
				stringbuffer.append("<lt>");
			} else if (c == '>') {
				stringbuffer.append("<gt>");
			} else {
				stringbuffer.append(c);
			}
		}
		return stringbuffer.toString();
	}

	final void method1473(final String string, final int i, final int i_100_, final int i_101_, final int i_102_, final int i_103_, final int i_104_) {
		if (string != null) {
			setColors(i_101_, i_102_);
			double d = 7.0 - i_104_ / 8.0;
			if (d < 0.0) {
				d = 0.0;
			}
			final int i_105_ = string.length();
			final int[] is = new int[i_105_];
			for (int i_106_ = 0; i_106_ < i_105_; i_106_++) {
				is[i_106_] = (int) (Math.sin(i_106_ / 1.5 + i_103_ / 1.0) * d);
			}
			method1475(string, i - method1459(string) / 2, i_100_, null, is);
		}
	}

	final void setNameIcons(final AbstractIndexedSprite[] class107s, final int[] is) {
		if (is != null && is.length != class107s.length) {
			throw new IllegalArgumentException();
		}
		nameIcons = class107s;
		nameIconsHeight = is;
	}

	private final void method1475(final String string, int i, int i_107_, final int[] is, final int[] is_108_) {
		i_107_ -= this.yOff;
		int i_109_ = -1;
		int i_110_ = 0;
		int i_111_ = 0;
		final int i_112_ = string.length();
		for (int i_113_ = 0; i_113_ < i_112_; i_113_++) {
			char c = string.charAt(i_113_);
			if (c == '<') {
				i_109_ = i_113_;
			} else {
				if (c == '>' && i_109_ != -1) {
					final String string_114_ = string.substring(i_109_ + 1, i_113_).toLowerCase();
					i_109_ = -1;
					if (string_114_.equals("lt")) {
						c = '<';
					} else if (string_114_.equals("gt")) {
						c = '>';
					} else if (string_114_.equals("nbsp")) {
						c = '\u00a0';
					} else if (string_114_.equals("shy")) {
						c = '\u00ad';
					} else if (string_114_.equals("times")) {
						c = '\u00d7';
					} else if (string_114_.equals("euro")) {
						c = '\u20ac';
					} else if (string_114_.equals("copy")) {
						c = '\u00a9';
					} else if (string_114_.equals("reg")) {
						c = '\u00ae';
					} else {
						if (string_114_.startsWith("img=")) {
							try {
								int i_115_;
								if (is != null) {
									i_115_ = is[i_111_];
								} else {
									i_115_ = 0;
								}
								int i_116_;
								if (is_108_ != null) {
									i_116_ = is_108_[i_111_];
								} else {
									i_116_ = 0;
								}
								i_111_++;
								final int i_117_ = Class31.stringToBase10(string_114_.substring(4));
								final AbstractIndexedSprite abstractIndexedSprite = nameIcons[i_117_];
								final int i_118_ = nameIconsHeight != null ? nameIconsHeight[i_117_] : abstractIndexedSprite.trimHeight;
								if (transparency == 256) {
									abstractIndexedSprite.drawReg(i + i_115_, i_107_ + this.yOff - i_118_ + i_116_);
								} else {
									abstractIndexedSprite.method911(i + i_115_, i_107_ + this.yOff - i_118_ + i_116_, transparency);
								}
								i += abstractIndexedSprite.trimWidth;
								i_110_ = 0;
							} catch (final Exception exception) {
								/* empty */
							}
						} else {
							setEffectsFromText(string_114_);
						}
						continue;
					}
				}
				if (i_109_ == -1) {
					final int i_119_ = (char) (LongNode.method1060(c) & 0xff);
					if (aByteArray3498 != null && i_110_ != 0) {
						i += aByteArray3498[(i_110_ << 8) + i_119_];
					}
					final int i_120_ = this.spriteWidths[i_119_];
					final int i_121_ = this.spriteHeights[i_119_];
					int i_122_;
					if (is != null) {
						i_122_ = is[i_111_];
					} else {
						i_122_ = 0;
					}
					int i_123_;
					if (is_108_ != null) {
						i_123_ = is_108_[i_111_];
					} else {
						i_123_ = 0;
					}
					i_111_++;
					if (i_119_ != 32) {
						if (transparency == 256) {
							if (shadowColor != -1) {
								drawChar(i_119_, i + xOffsets[i_119_] + 1 + i_122_, i_107_ + yOffsets[i_119_] + 1 + i_123_, i_120_, i_121_, shadowColor, true);
							}
							drawChar(i_119_, i + xOffsets[i_119_] + i_122_, i_107_ + yOffsets[i_119_] + i_123_, i_120_, i_121_, textColor, false);
						} else {
							if (shadowColor != -1) {
								drawTransparentChar(i_119_, i + xOffsets[i_119_] + 1 + i_122_, i_107_ + yOffsets[i_119_] + 1 + i_123_, i_120_, i_121_, shadowColor, transparency, true);
							}
							drawTransparentChar(i_119_, i + xOffsets[i_119_] + i_122_, i_107_ + yOffsets[i_119_] + i_123_, i_120_, i_121_, textColor, transparency, false);
						}
					} else if (anInt3515 > 0) {
						anInt3511 += anInt3515;
						i += anInt3511 >> 8;
						anInt3511 &= 0xff;
					}
					final int i_124_ = charWidths[i_119_];
					if (strikethroughColor != -1) {
						if (HDToolkit.glEnabled) {
							GraphicsHD.drawHorizontalLine(i, i_107_ + (int) (this.yOff * 0.7), i_124_, strikethroughColor);
						} else {
							GraphicsLD.drawHorizontalLine(i, i_107_ + (int) (this.yOff * 0.7), i_124_, strikethroughColor);
						}
					}
					if (underlineColor != -1) {
						if (HDToolkit.glEnabled) {
							GraphicsHD.drawHorizontalLine(i, i_107_ + this.yOff, i_124_, underlineColor);
						} else {
							GraphicsLD.drawHorizontalLine(i, i_107_ + this.yOff, i_124_, underlineColor);
						}
					}
					i += i_124_;
					i_110_ = i_119_;
				}
			}
		}
	}

	final int method1476(final String string, final int i, final int i_125_, final int i_126_, final int i_127_, final int i_128_, final int i_129_, final int i_130_, final int i_131_, final Random random, final int i_132_, final int[] is) {
		if (string == null) {
			return 0;
		}
		random.setSeed(i_132_);
		setFontEffects(i_128_, i_129_, 192 + (random.nextInt() & 0x1f));
		final int i_133_ = string.length();
		final int[] is_134_ = new int[i_133_];
		int i_135_ = 0;
		for (int i_136_ = 0; i_136_ < i_133_; i_136_++) {
			is_134_[i_136_] = i_135_;
			if ((random.nextInt() & 0x3) == 0) {
				i_135_++;
			}
		}
		int i_137_ = i;
		int i_138_ = i_125_ + anInt3494;
		int i_139_ = -1;
		if (i_131_ == 1) {
			i_138_ += (i_127_ - anInt3494 - anInt3512) / 2;
		} else if (i_131_ == 2) {
			i_138_ = i_125_ + i_127_ - anInt3512;
		}
		if (i_130_ == 1) {
			i_139_ = method1459(string) + i_135_;
			i_137_ += (i_126_ - i_139_) / 2;
		} else if (i_130_ == 2) {
			i_139_ = method1459(string) + i_135_;
			i_137_ += i_126_ - i_139_;
		}
		method1475(string, i_137_, i_138_, is_134_, null);
		if (is != null) {
			if (i_139_ == -1) {
				i_139_ = method1459(string) + i_135_;
			}
			is[0] = i_137_;
			is[1] = i_138_ - anInt3494;
			is[2] = i_139_;
			is[3] = anInt3494 + anInt3512;
		}
		return i_135_;
	}

	private static final int method1477(final byte[][] is, final byte[][] is_140_, final int[] is_141_, final int[] is_142_, final int[] is_143_, final int i, final int i_144_) {
		final int i_145_ = is_141_[i];
		final int i_146_ = i_145_ + is_143_[i];
		final int i_147_ = is_141_[i_144_];
		final int i_148_ = i_147_ + is_143_[i_144_];
		int i_149_ = i_145_;
		if (i_147_ > i_145_) {
			i_149_ = i_147_;
		}
		int i_150_ = i_146_;
		if (i_148_ < i_146_) {
			i_150_ = i_148_;
		}
		int i_151_ = is_142_[i];
		if (is_142_[i_144_] < i_151_) {
			i_151_ = is_142_[i_144_];
		}
		final byte[] is_152_ = is_140_[i];
		final byte[] is_153_ = is[i_144_];
		int i_154_ = i_149_ - i_145_;
		int i_155_ = i_149_ - i_147_;
		for (int i_156_ = i_149_; i_156_ < i_150_; i_156_++) {
			final int i_157_ = is_152_[i_154_++] + is_153_[i_155_++];
			if (i_157_ < i_151_) {
				i_151_ = i_157_;
			}
		}
		return -i_151_;
	}

	final void method1478(final String text, final int x, final int y, final int color, final int shadow) {
		if (text != null) {
			setColors(color, shadow);
			method1461(text, x - method1459(text) / 2, y);
		}
	}

	final int method1480(final String string, final int i, int i_161_) {
		if (i_161_ == 0) {
			i_161_ = this.yOff;
		}
		final int i_162_ = method1486(string, new int[] { i }, aStringArray3516);
		final int i_163_ = (i_162_ - 1) * i_161_;
		return anInt3494 + i_163_ + anInt3512;
	}

	final int paragraphHeight(final String string, final int i) {
		return method1486(string, new int[] { i }, aStringArray3516);
	}

	final void method1482(final String string, final int i, final int i_164_, final int i_165_, final int i_166_) {
		if (string != null) {
			setColors(i_165_, i_166_);
			method1461(string, i - method1459(string), i_164_);
		}
	}

	private final void setFontEffects(final int col, final int shad, final int trans) {
		strikethroughColor = -1;
		underlineColor = -1;
		shadowColor = oldShadowColor = shad;
		textColor = oldTextColor = col;
		transparency = oldTransparency = trans;
		anInt3515 = 0;
		anInt3511 = 0;
	}

	private final int method1484(final char c) {
		return charWidths[LongNode.method1060(c) & 0xff];
	}

	AbstractFont(final byte[] data, final int[] xOffs, final int[] yOffs, final int[] widths, final int[] heights) {
		xOffsets = xOffs;
		yOffsets = yOffs;
		this.spriteWidths = widths;
		this.spriteHeights = heights;
		method1458(data);
		int i = 2147483647;
		int i_173_ = -2147483648;
		for (int i_174_ = 0; i_174_ < 256; i_174_++) {
			if (yOffsets[i_174_] < i && this.spriteHeights[i_174_] != 0) {
				i = yOffsets[i_174_];
			}
			if (yOffsets[i_174_] + this.spriteHeights[i_174_] > i_173_) {
				i_173_ = yOffsets[i_174_] + this.spriteHeights[i_174_];
			}
		}
		anInt3494 = this.yOff - i;
		anInt3512 = i_173_ - this.yOff;
	}

	private final void setEffectsFromText(final String string) {
		try {
			if (string.startsWith("col=")) {
				textColor = Class111.stringToIntRadix(string.substring(4), 16);
			} else if (string.equals("/col")) {
				textColor = oldTextColor;
			} else if (string.startsWith("trans=")) {
				transparency = Class31.stringToBase10(string.substring(6));
			} else if (string.equals("/trans")) {
				transparency = oldTransparency;
			} else if (string.startsWith("str=")) {
				strikethroughColor = Class111.stringToIntRadix(string.substring(4), 16);
			} else if (string.equals("str")) {
				strikethroughColor = 8388608;
			} else if (string.equals("/str")) {
				strikethroughColor = -1;
			} else if (string.startsWith("u=")) {
				underlineColor = Class111.stringToIntRadix(string.substring(2), 16);
			} else if (string.equals("u")) {
				underlineColor = 0;
			} else if (string.equals("/u")) {
				underlineColor = -1;
			} else if (string.startsWith("shad=")) {
				shadowColor = Class111.stringToIntRadix(string.substring(5), 16);
			} else if (string.equals("shad")) {
				shadowColor = 0;
			} else if (string.equals("/shad")) {
				shadowColor = oldShadowColor;
			} else if (string.equals("br")) {
				setFontEffects(oldTextColor, oldShadowColor, oldTransparency);
			}
		} catch (final Exception exception) {
			/* empty */
		}
	}

	AbstractFont(final byte[] is) {
		method1458(is);
	}

	final int method1486(final String string, final int[] is, final String[] strings) {
		if (string == null) {
			return 0;
		}
		Class89.increaseStringBufferLength(aStringBuffer3500, ' ', 0);
		int width = 0;
		int i_175_ = 0;
		int i_176_ = -1;
		int i_177_ = 0;
		int i_178_ = 0;
		int effectStartIndex = -1;
		int i_180_ = 0;
		int stringsPos = 0;
		final int length = string.length();
		for (int id = 0; id < length; id++) {
			char character = string.charAt(id);
			if (character == 60) {//<
				effectStartIndex = id;
			} else {
				if (character == 62 && effectStartIndex != -1) {//>
					final String effect = string.substring(effectStartIndex + 1, id).toLowerCase();
					effectStartIndex = -1;
					aStringBuffer3500.append('<');
					aStringBuffer3500.append(effect);
					aStringBuffer3500.append('>');
					if (effect.equals("br")) {
						strings[stringsPos] = aStringBuffer3500.toString().substring(i_175_, aStringBuffer3500.length());
						stringsPos++;
						i_175_ = aStringBuffer3500.length();
						width = 0;
						i_176_ = -1;
						i_180_ = 0;
					} else if (effect.equals("lt")) {
						width += method1484('<');
						if (aByteArray3498 != null && i_180_ != 0) {
							width += aByteArray3498[(i_180_ << 8) + 60];
						}
						i_180_ = 60;
					} else if (effect.equals("gt")) {
						width += method1484('>');
						if (aByteArray3498 != null && i_180_ != 0) {
							width += aByteArray3498[(i_180_ << 8) + 62];
						}
						i_180_ = 62;
					} else if (effect.equals("nbsp")) {
						width += method1484('\u00a0');
						if (aByteArray3498 != null && i_180_ != 0) {
							width += aByteArray3498[(i_180_ << 8) + 160];
						}
						i_180_ = 160;
					} else if (effect.equals("shy")) {
						width += method1484('\u00ad');
						if (aByteArray3498 != null && i_180_ != 0) {
							width += aByteArray3498[(i_180_ << 8) + 173];
						}
						i_180_ = 173;
					} else if (effect.equals("times")) {
						width += method1484('\u00d7');
						if (aByteArray3498 != null && i_180_ != 0) {
							width += aByteArray3498[(i_180_ << 8) + 215];
						}
						i_180_ = 215;
					} else if (effect.equals("euro")) {
						width += method1484('\u20ac');
						if (aByteArray3498 != null && i_180_ != 0) {
							width += aByteArray3498[(i_180_ << 8) + 128];
						}
						i_180_ = 8364;
					} else if (effect.equals("copy")) {
						width += method1484('\u00a9');
						if (aByteArray3498 != null && i_180_ != 0) {
							width += aByteArray3498[(i_180_ << 8) + 169];
						}
						i_180_ = 169;
					} else if (effect.equals("reg")) {
						width += method1484('\u00ae');
						if (aByteArray3498 != null && i_180_ != 0) {
							width += aByteArray3498[(i_180_ << 8) + 174];
						}
						i_180_ = 174;
					} else if (effect.startsWith("img=")) {
						try {
							final int nameIconid = Class31.stringToBase10(effect.substring(4));
							width += nameIcons[nameIconid].trimWidth;
							i_180_ = 0;
						} catch (final Exception exception) {
							/* empty */
						}
					}
					character = '\0';
				}
				if (effectStartIndex == -1) {
					if (character != 0) {
						aStringBuffer3500.append(character);
						character = (char) (LongNode.method1060(character) & 0xff);
						width += charWidths[character];
						if (aByteArray3498 != null && i_180_ != 0) {
							width += aByteArray3498[(i_180_ << 8) + character];
						}
						i_180_ = character;
					}
					if (character == 32) {//Space
						i_176_ = aStringBuffer3500.length();
						i_177_ = width;
						i_178_ = 1;
					}
					if (is != null && width > is[stringsPos < is.length ? stringsPos : is.length - 1] && i_176_ >= 0) {
						strings[stringsPos] = aStringBuffer3500.toString().substring(i_175_, i_176_ - i_178_);
						stringsPos++;
						i_175_ = i_176_;
						i_176_ = -1;
						width -= i_177_;
						i_180_ = 0;
					}
					if (character == 45) {//-
						i_176_ = aStringBuffer3500.length();
						i_177_ = width;
						i_178_ = 0;
					}
				}
			}
		}
		if (aStringBuffer3500.length() > i_175_) {
			strings[stringsPos] = aStringBuffer3500.toString().substring(i_175_, aStringBuffer3500.length());
			stringsPos++;
		}
		return stringsPos;
	}
}
