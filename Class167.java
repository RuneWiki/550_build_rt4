/* Class167 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class167 {
	int anInt1614;
	int anInt1615;
	static int anInt1616 = -1;
	int anInt1617;
	static Class21 aClass21_1618 = new Class21(30);
	static boolean aBoolean1619 = true;
	static boolean aBoolean1620 = false;

	final boolean method2183(final int i) {
		boolean bool;
		try {
			if (i != -3378) {
				aBoolean1619 = true;
			}
			bool = (0x1 & this.anInt1614) != 0;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("tn.C(").append(i).append(')').toString());
		}
		return bool;
	}

	static final Class57 method2184(final int i) {
		Class57 class57;
		do {
			Class57 class57_0_;
			try {
				Class57 class57_1_;
				try {
					if (i > -5) {
						return null;
					}
					class57_1_ = (Class57) Class.forName("Class57_Sub1").newInstance();
				} catch (final Throwable throwable) {
					class57 = null;
					break;
				}
				class57_0_ = class57_1_;
			} catch (final RuntimeException runtimeexception) {
				throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("tn.E(").append(i).append(')').toString());
			}
			return class57_0_;
		} while (false);
		return class57;
	}

	final boolean method2185(final byte i) {
		boolean bool;
		try {
			if (i > -120) {
				return false;
			}
			bool = (this.anInt1614 & 0x8) != 0;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("tn.I(").append(i).append(')').toString());
		}
		return bool;
	}

	final boolean method2186(final byte i) {
		boolean bool;
		try {
			if (i <= 64) {
				return true;
			}
			bool = (0x2 & this.anInt1614) != 0;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("tn.B(").append(i).append(')').toString());
		}
		return bool;
	}

	final boolean method2187(final int i) {
		boolean bool;
		try {
			if (i != 1082) {
				method2185((byte) -113);
			}
			bool = (this.anInt1614 & 0x4) != 0;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("tn.D(").append(i).append(')').toString());
		}
		return bool;
	}

	public static void method2188(final byte i) {
		try {
			if (i != 122) {
				constructLDSprite();
			}
			aClass21_1618 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("tn.A(").append(i).append(')').toString());
		}
	}

	static final LDSprite constructLDSprite() {
		final byte[] paletteIndicators = Class145.spritePaletteIndicators[0];
		final int pixelAmt = Class120_Sub12_Sub39.spriteHeights[0] * Class120_Sub12_Sub11.spriteWidths[0];
		LDSprite sprite;
		if (!Class141.spriteHasAlpha[0]) {
			final int[] pixels = new int[pixelAmt];
			for (int pixelId = 0; pixelId < pixelAmt; pixelId++) {
				pixels[pixelId] = Class132_Sub1.spritePalette[paletteIndicators[pixelId] & 0xff];
			}
			sprite = new LDSprite(Class31.spriteTrimWidth, Class180_Sub1.spriteTrimHeight, Class180_Sub4.spriteXOffsets[0], Class120_Sub18.spriteYOffsets[0], Class120_Sub12_Sub11.spriteWidths[0], Class120_Sub12_Sub39.spriteHeights[0], pixels);
		} else {
			final int[] pixels = new int[pixelAmt];
			final byte[] alphas = Class120_Sub12.spriteAlphas[0];
			for (int pixelId = 0; pixelAmt > pixelId; pixelId++) {
				pixels[pixelId] = Class191.method2512((alphas[pixelId] & 0xff) << 24, Class132_Sub1.spritePalette[(paletteIndicators[pixelId] & 0xff)]);
			}
			sprite = new LDTransparentSprite(Class31.spriteTrimWidth, Class180_Sub1.spriteTrimHeight, Class180_Sub4.spriteXOffsets[0], Class120_Sub18.spriteYOffsets[0], Class120_Sub12_Sub11.spriteWidths[0], Class120_Sub12_Sub39.spriteHeights[0], pixels);
		}
		Class53_Sub1.resetSpriteInfo();
		return sprite;
	}

	public Class167() {
		/* empty */
	}

	static final boolean method2190(final int i, int i_9_, final int i_10_) {
		boolean bool;
		try {
			if (i_9_ == 11) {
				i_9_ = 10;
			}
			final LocType locType = LocType.list(i);
			if (i_9_ >= 5 && i_9_ <= 8) {
				i_9_ = 4;
			}
			bool = locType.method2460(i_9_, 23428);
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("tn.H(").append(i).append(',').append(i_9_).append(',').append(i_10_).append(')').toString());
		}
		return bool;
	}

	static final AbstractSprite[] method2191(final int i, final Class50 class50, final int i_11_, final int i_12_) {
		AbstractSprite[] class120_sub14_sub19s;
		try {
			if (i_11_ != 8693) {
				aBoolean1620 = true;
			}
			if (!Class10.method121(class50, i, i_12_)) {
				return null;
			}
			class120_sub14_sub19s = Class120_Sub14_Sub11.method1520((byte) -46);
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("tn.G(").append(i).append(',').append(class50 != null ? "{...}" : "null").append(',').append(i_11_).append(',').append(i_12_).append(')').toString());
		}
		return class120_sub14_sub19s;
	}
}
