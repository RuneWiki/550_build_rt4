/* Class11 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

final class Class11 {
	static final void method124(double d) {
		if (AbstractGraphicsBuffer.aDouble1172 != d) {
			for (int i_0_ = 0; i_0_ < 256; i_0_++) {
				final int i_1_ = (int) (255.0 * Math.pow(i_0_ / 255.0, d));
				Class79_Sub1.anIntArray2246[i_0_] = i_1_ > 255 ? 255 : i_1_;
			}
			AbstractGraphicsBuffer.aDouble1172 = d;
		}
	}

	static final void drawLoadingText(Color color, final boolean fillBg, final int fill, final String text) {
		try {
			final Graphics graphics = Node.canvas.getGraphics();
			if (Class23.loadingFont == null) {
				Class23.loadingFont = new Font("Helvetica", 1, 13);
				WaterfallShader.loadingFontMetrics = Node.canvas.getFontMetrics(Class23.loadingFont);
			}
			if (fillBg) {
				graphics.setColor(Color.black);
				graphics.fillRect(0, 0, Class69_Sub1.canvasWidth, Class120_Sub12_Sub5.canvasHeight);
			}
			if (color == null) {
				color = new Color(140, 17, 17);
			}
			try {
				if (Class132_Sub1.loadingTextImage == null) {
					Class132_Sub1.loadingTextImage = Node.canvas.createImage(304, 34);
				}
				final Graphics imageGraphics = Class132_Sub1.loadingTextImage.getGraphics();
				imageGraphics.setColor(color);
				imageGraphics.drawRect(0, 0, 303, 33);
				imageGraphics.fillRect(2, 2, 3 * fill, 30);
				imageGraphics.setColor(Color.black);
				imageGraphics.drawRect(1, 1, 301, 31);
				imageGraphics.fillRect(2 + fill * 3, 2, 300 - (3 * fill), 30);
				imageGraphics.setFont(Class23.loadingFont);
				imageGraphics.setColor(Color.white);
				imageGraphics.drawString(text, (304 - WaterfallShader.loadingFontMetrics.stringWidth(text)) / 2, 22);
				graphics.drawImage(Class132_Sub1.loadingTextImage, Class69_Sub1.canvasWidth / 2 - 152, Class120_Sub12_Sub5.canvasHeight / 2 - 18, null);
			} catch (final Exception exception) {
				final int x = Class69_Sub1.canvasWidth / 2 - 152;
				final int y = Class120_Sub12_Sub5.canvasHeight / 2 - 18;
				graphics.setColor(color);
				graphics.drawRect(x, y, 303, 33);
				graphics.fillRect(x + 2, y + 2, 3 * fill, 30);
				graphics.setColor(Color.black);
				graphics.drawRect(1 + x, y + 1, 301, 31);
				graphics.fillRect(fill * 3 + 2 + x, y + 2, 300 - (fill * 3), 30);
				graphics.setFont(Class23.loadingFont);
				graphics.setColor(Color.white);
				graphics.drawString(text, x + ((-WaterfallShader.loadingFontMetrics.stringWidth(text) + 304) / 2), 22 + y);
			}
			if (Class120_Sub14_Sub15.gameLoadingText != null) {
				graphics.setFont(Class23.loadingFont);
				graphics.setColor(Color.white);
				graphics.drawString(Class120_Sub14_Sub15.gameLoadingText, Class69_Sub1.canvasWidth / 2 - WaterfallShader.loadingFontMetrics.stringWidth(Class120_Sub14_Sub15.gameLoadingText) / 2, Class120_Sub12_Sub5.canvasHeight / 2 - 26);
			}
		} catch (final Exception exception) {
			Node.canvas.repaint();
		}
	}

	static final void addWallDecoration(final int level, final int x, final int z, final int y, final SceneGraphNode sceneGraphNode, final SceneGraphNode class180_9_, final int i_10_, final int i_11_, final int i_12_, final int i_13_, final long bitPackedUid) {
		if (sceneGraphNode != null) {
			final WallDecoration wallDecoration = new WallDecoration();
			wallDecoration.bitPacked = bitPackedUid;
			wallDecoration.renderX = x * 128 + 64;
			wallDecoration.renderZ = z * 128 + 64;
			wallDecoration.renderY = y;
			wallDecoration.aClass180_1901 = sceneGraphNode;
			wallDecoration.aClass180_1898 = class180_9_;
			wallDecoration.anInt1895 = i_10_;
			wallDecoration.anInt1896 = i_11_;
			wallDecoration.anInt1905 = i_12_;
			wallDecoration.anInt1892 = i_13_;
			for (int lowerLevel = level; lowerLevel >= 0; lowerLevel--) {
				if (LabelGroup.groundTiles[lowerLevel][x][z] == null) {
					LabelGroup.groundTiles[lowerLevel][x][z] = new GroundTile(lowerLevel, x, z);
				}
			}
			LabelGroup.groundTiles[level][x][z].wallDecoration = wallDecoration;
		}
	}

	static final AbstractIndexedSprite constructAbstractIndexedSprite() {
		AbstractIndexedSprite indexedSprite;
		if (HDToolkit.glEnabled) {
			indexedSprite = new HDIndexedSprite(Class31.spriteTrimWidth, SceneGroundObject.spriteTrimHeight, Projectile.spriteXOffsets[0], GroundTile.spriteYOffsets[0], Class120_Sub12_Sub11.spriteWidths[0], Class120_Sub12_Sub39.spriteHeights[0], Class145.spritePaletteIndicators[0], Class132_Sub1.spritePalette);
		} else {
			indexedSprite = new LDIndexedSprite(Class31.spriteTrimWidth, SceneGroundObject.spriteTrimHeight, Projectile.spriteXOffsets[0], GroundTile.spriteYOffsets[0], Class120_Sub12_Sub11.spriteWidths[0], Class120_Sub12_Sub39.spriteHeights[0], Class145.spritePaletteIndicators[0], Class132_Sub1.spritePalette);
		}
		Class53_Sub1.resetSpriteInfo();
		return indexedSprite;
	}

	public static void method129() {
		TextRepository.examine = null;
		NpcType.aClass21_80 = null;
		TextRepository.connectedToUpdateServer = null;
	}

	static final int method130(final int i, final int i_16_, final int i_17_, final int[][] is, final int i_18_) {
		final int i_21_ = i * is[i_16_ - -1][i_18_] + is[i_16_][i_18_] * (128 - i) >> 7;
		final int i_22_ = is[i_16_][1 + i_18_] * (-i + 128) + i * is[i_16_ + 1][1 + i_18_] >> 7;
		return i_21_ * (128 - i_17_) + i_22_ * i_17_ >> 7;
	}
}
