/* Class120_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class LabelGroup extends Node {
	int[] types;
	static SignlinkNode hostNameNode;
	int length;
	int[] anIntArray2405;
	boolean[] aBooleanArray2407;
	int id;
	static int[] anIntArray2409 = new int[5];
	int[][] labels;
	static GroundTile[][][] activeGroundTiles;
	static int[] anIntArray2412;
	static int screenRedrawPos;

	static {
		anIntArray2412 = new int[5];
		screenRedrawPos = 0;
	}

	static final void method1036(final int i, final int i_2_, final int i_3_, final int i_4_, final int i_6_, final int i_7_) {
		if (MagnetType.anInt260 > -i + i_6_ || i + i_6_ > ParamType.anInt3544 || i_3_ - i < Class120_Sub30_Sub2.anInt3699 || Identikit.anInt1334 < i + i_3_) {
			Js5Worker.method356(i, i_7_, i_6_, i_2_, i_4_, i_3_);
		} else {
			AbstractMouseWheelHandler.method158(i_7_, i_2_, i, i_4_, i_6_, i_3_);
		}
	}

	static final void method1037() {
		Class57.delayAfterWorldChange = 0;
		Class86.loginStep = 1;
		Class120_Sub12_Sub5.errorPinging = false;
		client.anInt1153 = 0;
		Class150.anInt1408 = 0;
		Class120_Sub22.anInt2672 = -1;
		Class48.returnCode = -3;
	}

	static final LDSprite[] constructLDSprites() {
		final LDSprite[] sprites = new LDSprite[Class93.spriteAmount];
		for (int spriteId = 0; spriteId < Class93.spriteAmount; spriteId++) {
			final int pixelLen = Class120_Sub12_Sub39.spriteHeights[spriteId] * Class120_Sub12_Sub11.spriteWidths[spriteId];
			final int[] pixels = new int[pixelLen];
			final byte[] paletteIndicators = SkyboxType.spritePaletteIndicators[spriteId];
			for (int id = 0; id < pixelLen; id++) {
				pixels[id] = Class132_Sub1.spritePalette[paletteIndicators[id] & 0xff];
			}
			sprites[spriteId] = new LDSprite(Class31.spriteTrimWidth, SceneGroundObject.spriteTrimHeight, Projectile.spriteXOffsets[spriteId], GroundTile.spriteYOffsets[spriteId], Class120_Sub12_Sub11.spriteWidths[spriteId], Class120_Sub12_Sub39.spriteHeights[spriteId], pixels);
		}
		Class53_Sub1.resetSpriteInfo();
		return sprites;
	}

	LabelGroup(final int i, final byte[] data) {
		this.id = i;
		final Buffer buffer = new Buffer(data);
		this.length = buffer.getUByte();
		this.types = new int[this.length];
		this.anIntArray2405 = new int[this.length];
		this.aBooleanArray2407 = new boolean[this.length];
		this.labels = new int[this.length][];
		for (int i_13_ = 0; i_13_ < this.length; i_13_++) {
			this.types[i_13_] = buffer.getUByte();
		}
		for (int i_14_ = 0; i_14_ < this.length; i_14_++) {
			this.aBooleanArray2407[i_14_] = buffer.getUByte() == 1;
		}
		for (int i_15_ = 0; i_15_ < this.length; i_15_++) {
			this.anIntArray2405[i_15_] = buffer.getUShort();
		}
		for (int i_16_ = 0; i_16_ < this.length; i_16_++) {
			this.labels[i_16_] = new int[buffer.getUByte()];
		}
		for (int i_17_ = 0; i_17_ < this.length; i_17_++) {
			for (int i_18_ = 0; i_18_ < this.labels[i_17_].length; i_18_++) {
				this.labels[i_17_][i_18_] = buffer.getUByte();
			}
		}
	}
}
