/* Class100 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class100 {
	Class108_Sub3 aClass108_Sub3_955 = new Class108_Sub3();
	static int[] anIntArray956;
	static Player selfPlayer;
	private Class108_Sub3 aClass108_Sub3_958;

	public static void method824(final byte i) {
		try {
			anIntArray956 = null;
			if (i != 108) {
				selfPlayer = null;
			}
			selfPlayer = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("lb.F(").append(i).append(')').toString());
		}
	}

	static final void method825(final byte i) {
		try {
			if (i < -4) {
				if (Class31.anInt244 > 0) {
					InputStream_Sub1.logout();
				} else {
					Light.aClass46_381 = AbstractTimer.aClass46_825;
					AbstractTimer.aClass46_825 = null;
					Class120_Sub14_Sub1.setGameState(40);
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("lb.G(").append(i).append(')').toString());
		}
	}

	static final Class107[] method826(final int i) {
		Class107[] class107s;
		try {
			final Class107[] class107s_0_ = new Class107[Class93.spriteAmount];
			for (int i_1_ = i; Class93.spriteAmount > i_1_; i_1_++) {
				if (HDToolkit.glEnabled) {
					class107s_0_[i_1_] = new Class107_Sub2(Class31.spriteTrimWidth, Class180_Sub1.spriteTrimHeight, Class180_Sub4.spriteXOffsets[i_1_], Class120_Sub18.spriteYOffsets[i_1_], Class120_Sub12_Sub11.spriteWidths[i_1_], Class120_Sub12_Sub39.spriteHeights[i_1_], Class145.spritePaletteIndicators[i_1_],
							Class132_Sub1.spritePalette);
				} else {
					class107s_0_[i_1_] = new Class107_Sub1(Class31.spriteTrimWidth, Class180_Sub1.spriteTrimHeight, Class180_Sub4.spriteXOffsets[i_1_], Class120_Sub18.spriteYOffsets[i_1_], Class120_Sub12_Sub11.spriteWidths[i_1_], Class120_Sub12_Sub39.spriteHeights[i_1_], Class145.spritePaletteIndicators[i_1_],
							Class132_Sub1.spritePalette);
				}
			}
			Class53_Sub1.resetSpriteInfo();
			class107s = class107s_0_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("lb.B(").append(i).append(')').toString());
		}
		return class107s;
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
				method825((byte) -65);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("lb.H(").append(i).append(')').toString());
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
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("lb.D(").append(i).append(')').toString());
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
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("lb.A(").append(i).append(',').append(is != null ? "{...}" : "null").append(',').append(is_3_ != null ? "{...}" : "null").append(',').append(i_4_).append(',').append(i_5_).append(')').toString());
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
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("lb.C(").append(i).append(',').append(class108_sub3 != null ? "{...}" : "null").append(')').toString());
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
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("lb.E(").append(i).append(')').toString());
		}
		return class108_sub3;
	}

	public Class100() {
		this.aClass108_Sub3_955.aClass108_Sub3_2398 = this.aClass108_Sub3_955;
		this.aClass108_Sub3_955.aClass108_Sub3_2399 = this.aClass108_Sub3_955;
	}
}
