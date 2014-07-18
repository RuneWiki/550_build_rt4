/* Class120_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class LabelGroup extends Node {
	int[] types;
	static SignlinkNode aClass185_2403;
	int length;
	int[] anIntArray2405;
	static Cache aClass21_2406;
	boolean[] aBooleanArray2407;
	int id;
	static int[] anIntArray2409 = new int[5];
	int[][] labels;
	static GroundTile[][][] groundTiles;
	static int[] anIntArray2412;
	static js5 aClass50_2413;
	static int screenRedrawPos;

	static {
		aClass21_2406 = new Cache(50);
		anIntArray2412 = new int[5];
		screenRedrawPos = 0;
	}

	static final void method1036(final int i, final int i_2_, final int i_3_, final int i_4_, final byte i_5_, final int i_6_, final int i_7_) {
		try {
			if (i_5_ != 84) {
				method1037();
			}
			if (Class32.anInt260 > -i + i_6_ || i + i_6_ > ParamType.anInt3544 || i_3_ - i < Class120_Sub30_Sub2.anInt3699 || IdentityKit.anInt1334 < i + i_3_) {
				Class45.method356(i, i_7_, i_6_, i_2_, i_5_ + -85, i_4_, i_3_);
			} else {
				AbstractMouseWheelHandler.method158(i_7_, i_2_, true, i, i_4_, i_6_, i_3_);
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("af.C(").append(i).append(',').append(i_2_).append(',').append(i_3_).append(',').append(i_4_).append(',').append(i_5_).append(',').append(i_6_).append(',').append(i_7_).append(')').toString());
		}
	}

	static final void method1037() {
		Class57.anInt504 = 0;
		Class86.loginStep = 1;
		Class120_Sub12_Sub5.errorPinging = false;
		Class121.anInt1153 = 0;
		Class150.anInt1408 = 0;
		Class120_Sub22.anInt2672 = -1;
		Class48.returnCode = -3;
	}

	public static void method1038(final int i) {
		try {
			if (i != 5) {
				anIntArray2412 = null;
			}
			aClass21_2406 = null;
			anIntArray2412 = null;
			anIntArray2409 = null;
			groundTiles = null;
			aClass185_2403 = null;
			aClass50_2413 = null;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("af.A(").append(i).append(')').toString());
		}
	}

	static final LDSprite[] constructLDSprites() {
		final LDSprite[] sprites = new LDSprite[Class93.spriteAmount];
		for (int i_9_ = 0; i_9_ < Class93.spriteAmount; i_9_++) {
			final int i_10_ = Class120_Sub12_Sub39.spriteHeights[i_9_] * Class120_Sub12_Sub11.spriteWidths[i_9_];
			final int[] is = new int[i_10_];
			final byte[] is_11_ = Class145.spritePaletteIndicators[i_9_];
			for (int i_12_ = 0; i_10_ > i_12_; i_12_++) {
				is[i_12_] = Class132_Sub1.spritePalette[Class120_Sub12_Sub3.method1207(255, is_11_[i_12_])];
			}
			sprites[i_9_] = new LDSprite(Class31.spriteTrimWidth, SceneGroundObject.spriteTrimHeight, Class180_Sub4.spriteXOffsets[i_9_], GroundTile.spriteYOffsets[i_9_], Class120_Sub12_Sub11.spriteWidths[i_9_], Class120_Sub12_Sub39.spriteHeights[i_9_], is);
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
