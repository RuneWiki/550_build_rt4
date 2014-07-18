/* Class100 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class100 {
	Class108_Sub3 aClass108_Sub3_955 = new Class108_Sub3();
	static int[] intArguments;
	static Player selfPlayer;
	private Class108_Sub3 aClass108_Sub3_958;

	public static void method824(final byte i) {
		try {
			intArguments = null;
			if (i != 108) {
				selfPlayer = null;
			}
			selfPlayer = null;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("lb.F(").append(i).append(')').toString());
		}
	}

	static final void dropClient() {
		if (Class31.anInt244 > 0) {
			DummyInputStream.processLogout();
		} else {
			Light.aClass46_381 = AbstractTimer.worldConnection;
			AbstractTimer.worldConnection = null;
			Class120_Sub14_Sub1.setGameState(40);
		}
	}

	static final AbstractIndexedSprite[] constructIndexedSprites() {
		final AbstractIndexedSprite[] abstractIndexedSprites = new AbstractIndexedSprite[Class93.spriteAmount];
		for (int id = 0; id < Class93.spriteAmount; id++) {
			if (HDToolkit.glEnabled) {
				abstractIndexedSprites[id] = new HDIndexedSprite(Class31.spriteTrimWidth, SceneGroundObject.spriteTrimHeight, Class180_Sub4.spriteXOffsets[id], GroundTile.spriteYOffsets[id], Class120_Sub12_Sub11.spriteWidths[id], Class120_Sub12_Sub39.spriteHeights[id], Class145.spritePaletteIndicators[id], Class132_Sub1.spritePalette);
			} else {
				abstractIndexedSprites[id] = new LDIndexedSprite(Class31.spriteTrimWidth, SceneGroundObject.spriteTrimHeight, Class180_Sub4.spriteXOffsets[id], GroundTile.spriteYOffsets[id], Class120_Sub12_Sub11.spriteWidths[id], Class120_Sub12_Sub39.spriteHeights[id], Class145.spritePaletteIndicators[id], Class132_Sub1.spritePalette);
			}
		}
		Class53_Sub1.resetSpriteInfo();
		return abstractIndexedSprites;
	}

	final void method827(final int i) {
		try {
			for (;;) {
				final Class108_Sub3 class108_sub3 = this.aClass108_Sub3_955.aClass108_Sub3_2398;
				if (class108_sub3 == this.aClass108_Sub3_955) {
					break;
				}
				class108_sub3.method967(i + -25467);
			}
			aClass108_Sub3_958 = null;
			if (i != 25480) {
				dropClient();
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("lb.H(").append(i).append(')').toString());
		}
	}

	final Class108_Sub3 method828(final byte i) {
		Class108_Sub3 class108_sub3;
		try {
			if (i > -79) {
				method829(19, null, null, -77, -31);
			}
			final Class108_Sub3 class108_sub3_2_ = this.aClass108_Sub3_955.aClass108_Sub3_2398;
			if (class108_sub3_2_ == this.aClass108_Sub3_955) {
				aClass108_Sub3_958 = null;
				return null;
			}
			aClass108_Sub3_958 = class108_sub3_2_.aClass108_Sub3_2398;
			class108_sub3 = class108_sub3_2_;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("lb.D(").append(i).append(')').toString());
		}
		return class108_sub3;
	}

	static final void method829(final int i, final int[] is, final int[] is_3_, final int i_4_, final int i_5_) {
		try {
			if (i_4_ != 40) {
				method829(4, null, null, 107, -108);
			}
			if (i_5_ < i) {
				int i_6_ = i_5_;
				final int i_7_ = (i + i_5_) / 2;
				final int i_8_ = is_3_[i_7_];
				is_3_[i_7_] = is_3_[i];
				is_3_[i] = i_8_;
				final int i_9_ = is[i_7_];
				is[i_7_] = is[i];
				is[i] = i_9_;
				for (int i_10_ = i_5_; i > i_10_; i_10_++) {
					if (is_3_[i_10_] > (0x1 & i_10_) + i_8_) {
						final int i_11_ = is_3_[i_10_];
						is_3_[i_10_] = is_3_[i_6_];
						is_3_[i_6_] = i_11_;
						final int i_12_ = is[i_10_];
						is[i_10_] = is[i_6_];
						is[i_6_++] = i_12_;
					}
				}
				is_3_[i] = is_3_[i_6_];
				is_3_[i_6_] = i_8_;
				is[i] = is[i_6_];
				is[i_6_] = i_9_;
				method829(i_6_ + -1, is, is_3_, 40, i_5_);
				method829(i, is, is_3_, 40, i_6_ + 1);
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("lb.A(").append(i).append(',').append(is != null ? "{...}" : "null").append(',').append(is_3_ != null ? "{...}" : "null").append(',').append(i_4_).append(',').append(i_5_).append(')').toString());
		}
	}

	final void method830(final int i, final Class108_Sub3 class108_sub3) {
		try {
			if (class108_sub3.aClass108_Sub3_2399 != null) {
				class108_sub3.method967(13);
			}
			class108_sub3.aClass108_Sub3_2398 = this.aClass108_Sub3_955;
			class108_sub3.aClass108_Sub3_2399 = this.aClass108_Sub3_955.aClass108_Sub3_2399;
			if (i == -2260) {
				class108_sub3.aClass108_Sub3_2399.aClass108_Sub3_2398 = class108_sub3;
				class108_sub3.aClass108_Sub3_2398.aClass108_Sub3_2399 = class108_sub3;
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("lb.C(").append(i).append(',').append(class108_sub3 != null ? "{...}" : "null").append(')').toString());
		}
	}

	final Class108_Sub3 method831(final byte i) {
		Class108_Sub3 class108_sub3;
		try {
			final Class108_Sub3 class108_sub3_13_ = aClass108_Sub3_958;
			if (i != 38) {
				method829(-90, null, null, -91, -94);
			}
			if (this.aClass108_Sub3_955 == class108_sub3_13_) {
				aClass108_Sub3_958 = null;
				return null;
			}
			aClass108_Sub3_958 = class108_sub3_13_.aClass108_Sub3_2398;
			class108_sub3 = class108_sub3_13_;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("lb.E(").append(i).append(')').toString());
		}
		return class108_sub3;
	}

	public Class100() {
		this.aClass108_Sub3_955.aClass108_Sub3_2398 = this.aClass108_Sub3_955;
		this.aClass108_Sub3_955.aClass108_Sub3_2399 = this.aClass108_Sub3_955;
	}
}
