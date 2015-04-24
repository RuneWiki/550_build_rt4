/* Class167 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class167 {
	int flag;
	int location;
	static int selfPlayerIndex = -1;
	int players;
	static ObjectCache aClass21_1618 = new ObjectCache(30);
	static boolean aBoolean1619 = true;
	static boolean clearDepthBuffer = false;

	final boolean method2183() {
		return (this.flag & 0x1) != 0;
	}

	static final Class57 method2184() {
		Class57 class57_1_;
		try {
			class57_1_ = (Class57) Class.forName("Class57_Sub1").newInstance();
		} catch (final Throwable throwable) {
			return null;
		}
		return class57_1_;
	}

	final boolean method2185() {
		return (this.flag & 0x8) != 0;
	}

	final boolean method2186() {
		return (this.flag & 0x2) != 0;
	}

	final boolean method2187() {
		return (this.flag & 0x4) != 0;
	}

	static final LDSprite constructLDSpriteAlpha() {
		final byte[] paletteIndicators = Class145.spritePaletteIndicators[0];
		final int pixelAmt = Class120_Sub12_Sub39.spriteHeights[0] * Class120_Sub12_Sub11.spriteWidths[0];
		LDSprite sprite;
		if (!PlainTile.spriteHasAlpha[0]) {
			final int[] pixels = new int[pixelAmt];
			for (int pixelId = 0; pixelId < pixelAmt; pixelId++) {
				pixels[pixelId] = Class132_Sub1.spritePalette[paletteIndicators[pixelId] & 0xff];
			}
			sprite = new LDSprite(Class31.spriteTrimWidth, SceneGroundObject.spriteTrimHeight, Projectile.spriteXOffsets[0], GroundTile.spriteYOffsets[0], Class120_Sub12_Sub11.spriteWidths[0], Class120_Sub12_Sub39.spriteHeights[0], pixels);
		} else {
			final int[] pixels = new int[pixelAmt];
			final byte[] alphas = Class120_Sub12.spriteAlphas[0];
			for (int pixelId = 0; pixelAmt > pixelId; pixelId++) {
				pixels[pixelId] = Class191.method2512((alphas[pixelId] & 0xff) << 24, Class132_Sub1.spritePalette[(paletteIndicators[pixelId] & 0xff)]);
			}
			sprite = new LDTransparentSprite(Class31.spriteTrimWidth, SceneGroundObject.spriteTrimHeight, Projectile.spriteXOffsets[0], GroundTile.spriteYOffsets[0], Class120_Sub12_Sub11.spriteWidths[0], Class120_Sub12_Sub39.spriteHeights[0], pixels);
		}
		Class53_Sub1.resetSpriteInfo();
		return sprite;
	}

	public Class167() {
		/* empty */
	}

	static final boolean method2190(final int id, int type) {
		if (type == 11) {
			type = 10;
		}
		final LocType locType = LocType.list(id);
		if (type >= 5 && type <= 8) {
			type = 4;
		}
		return locType.method2460(type);
	}

	static final AbstractSprite[] constructSprites(final js5 js5, final int i, final int i_12_) {
		if (!Class10.decodedSprites(js5, i, i_12_)) {
			return null;
		}
		return ParamType.constructSprites();
	}
}
