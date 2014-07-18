/* Class11 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

final class Class11 {
	static Cache aClass21_80 = new Cache(50);
	static String aString81 = "Examine";
	static String aString82 = "Connected to update server";

	static final void method124(final double d, final byte i) {
		try {
			if (i != -78) {
				aClass21_80 = null;
			}
			if (AbstractGraphicsBuffer.aDouble1172 != d) {
				for (int i_0_ = 0; i_0_ < 256; i_0_++) {
					final int i_1_ = (int) (255.0 * Math.pow(i_0_ / 255.0, d));
					Class79_Sub1.anIntArray2246[i_0_] = i_1_ > 255 ? 255 : i_1_;
				}
				AbstractGraphicsBuffer.aDouble1172 = d;
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("ao.A(").append(d).append(',').append(i).append(')').toString());
		}
	}

	static final void method125(final byte i) {
		try {
			if (i != 113) {
				aString82 = null;
			}
			Class120_Sub12_Sub16.aClass21_3251.clear();
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("ao.B(").append(i).append(')').toString());
		}
	}

	static final void drawLoadingText(Color color, final boolean fillBg, final int fill, final String text) {
		try {
			final Graphics graphics = Node.canvas.getGraphics();
			if (Class23.aFont135 == null) {
				Class23.aFont135 = new Font("Helvetica", 1, 13);
				Class20.aFontMetrics2171 = Node.canvas.getFontMetrics(Class23.aFont135);
			}
			if (fillBg) {
				graphics.setColor(Color.black);
				graphics.fillRect(0, 0, Class69_Sub1.canvasWidth, Class120_Sub12_Sub5.canvasHeight);
			}
			if (color == null) {
				color = new Color(140, 17, 17);
			}
			try {
				if (Class132_Sub1.anImage2809 == null) {
					Class132_Sub1.anImage2809 = Node.canvas.createImage(304, 34);
				}
				final Graphics graphics_3_ = Class132_Sub1.anImage2809.getGraphics();
				graphics_3_.setColor(color);
				graphics_3_.drawRect(0, 0, 303, 33);
				graphics_3_.fillRect(2, 2, 3 * fill, 30);
				graphics_3_.setColor(Color.black);
				graphics_3_.drawRect(1, 1, 301, 31);
				graphics_3_.fillRect(2 + fill * 3, 2, -(3 * fill) + 300, 30);
				graphics_3_.setFont(Class23.aFont135);
				graphics_3_.setColor(Color.white);
				graphics_3_.drawString(text, (304 + -Class20.aFontMetrics2171.stringWidth(text)) / 2, 22);
				graphics.drawImage(Class132_Sub1.anImage2809, Class69_Sub1.canvasWidth / 2 - 152, -18 + Class120_Sub12_Sub5.canvasHeight / 2, null);
			} catch (final Exception exception) {
				final int i_4_ = Class69_Sub1.canvasWidth / 2 - 152;
				final int i_5_ = -18 + Class120_Sub12_Sub5.canvasHeight / 2;
				graphics.setColor(color);
				graphics.drawRect(i_4_, i_5_, 303, 33);
				graphics.fillRect(i_4_ + 2, i_5_ + 2, 3 * fill, 30);
				graphics.setColor(Color.black);
				graphics.drawRect(1 + i_4_, i_5_ + 1, 301, 31);
				graphics.fillRect(fill * 3 + 2 + i_4_, i_5_ - -2, -(fill * 3) + 300, 30);
				graphics.setFont(Class23.aFont135);
				graphics.setColor(Color.white);
				graphics.drawString(text, i_4_ - -((-Class20.aFontMetrics2171.stringWidth(text) + 304) / 2), 22 + i_5_);
			}
			if (Class120_Sub14_Sub15.gameLoadingText != null) {
				graphics.setFont(Class23.aFont135);
				graphics.setColor(Color.white);
				graphics.drawString(Class120_Sub14_Sub15.gameLoadingText, Class69_Sub1.canvasWidth / 2 - Class20.aFontMetrics2171.stringWidth(Class120_Sub14_Sub15.gameLoadingText) / 2, -26 + Class120_Sub12_Sub5.canvasHeight / 2);
			}
		} catch (final Exception exception) {
			Node.canvas.repaint();
		}
	}

	static final void method127(final int i, final int i_6_, final int i_7_, final int i_8_, final SceneGraphNode sceneGraphNode, final SceneGraphNode class180_9_, final int i_10_, final int i_11_, final int i_12_, final int i_13_, final long l) {
		if (sceneGraphNode != null) {
			final Class186 class186 = new Class186();
			class186.bitPacked = l;
			class186.anInt1893 = i_6_ * 128 + 64;
			class186.anInt1891 = i_7_ * 128 + 64;
			class186.anInt1894 = i_8_;
			class186.aClass180_1901 = sceneGraphNode;
			class186.aClass180_1898 = class180_9_;
			class186.anInt1895 = i_10_;
			class186.anInt1896 = i_11_;
			class186.anInt1905 = i_12_;
			class186.anInt1892 = i_13_;
			for (int i_14_ = i; i_14_ >= 0; i_14_--) {
				if (LabelGroup.groundTiles[i_14_][i_6_][i_7_] == null) {
					LabelGroup.groundTiles[i_14_][i_6_][i_7_] = new GroundTile(i_14_, i_6_, i_7_);
				}
			}
			LabelGroup.groundTiles[i][i_6_][i_7_].aClass186_2639 = class186;
		}
	}

	static final AbstractIndexedSprite createIndexedSprite() {
		AbstractIndexedSprite indexedSprite;
		if (HDToolkit.glEnabled) {
			indexedSprite = new HDIndexedSprite(Class31.spriteTrimWidth, SceneGroundObject.spriteTrimHeight, Class180_Sub4.spriteXOffsets[0], GroundTile.spriteYOffsets[0], Class120_Sub12_Sub11.spriteWidths[0], Class120_Sub12_Sub39.spriteHeights[0], Class145.spritePaletteIndicators[0], Class132_Sub1.spritePalette);
		} else {
			indexedSprite = new LDIndexedSprite(Class31.spriteTrimWidth, SceneGroundObject.spriteTrimHeight, Class180_Sub4.spriteXOffsets[0], GroundTile.spriteYOffsets[0], Class120_Sub12_Sub11.spriteWidths[0], Class120_Sub12_Sub39.spriteHeights[0], Class145.spritePaletteIndicators[0], Class132_Sub1.spritePalette);
		}
		Class53_Sub1.resetSpriteInfo();
		return indexedSprite;
	}

	public static void method129(final int i) {
		try {
			aString81 = null;
			aClass21_80 = null;
			aString82 = null;
			if (i != 34) {
				aString82 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("ao.D(").append(i).append(')').toString());
		}
	}

	static final int method130(final int i, final int i_16_, final int i_17_, final int[][] is, final int i_18_, final int i_19_) {
		int i_20_;
		try {
			if (i_19_ != 13) {
				aString82 = null;
			}
			final int i_21_ = i * is[i_16_ - -1][i_18_] + is[i_16_][i_18_] * (128 - i) >> 7;
			final int i_22_ = is[i_16_][1 + i_18_] * (-i + 128) + i * is[i_16_ + 1][1 + i_18_] >> 7;
			i_20_ = i_21_ * (128 - i_17_) + i_22_ * i_17_ >> 7;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("ao.G(").append(i).append(',').append(i_16_).append(',').append(i_17_).append(',').append(is != null ? "{...}" : "null").append(',').append(i_18_).append(',').append(i_19_).append(')').toString());
		}
		return i_20_;
	}
}
