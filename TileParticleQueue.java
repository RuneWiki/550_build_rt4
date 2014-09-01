/* Class100 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class TileParticleQueue {
	ParticleNodeSub head = new ParticleNodeSub();
	static int[] intArguments;
	static Player selfPlayer;
	private ParticleNodeSub current;

	public static void method824() {
		intArguments = null;
		selfPlayer = null;
	}

	static final void dropClient() {
		if (Class31.anInt244 > 0) {
			DummyInputStream.processLogout();
		} else {
			Light.aClass46_381 = AbstractTimer.worldConnection;
			AbstractTimer.worldConnection = null;
			ProjectileNode.setGameState(40);
		}
	}

	static final AbstractIndexedSprite[] constructIndexedSprites() {
		final AbstractIndexedSprite[] abstractIndexedSprites = new AbstractIndexedSprite[Class93.spriteAmount];
		for (int id = 0; id < Class93.spriteAmount; id++) {
			if (HDToolkit.glEnabled) {
				abstractIndexedSprites[id] = new HDIndexedSprite(Class31.spriteTrimWidth, SceneGroundObject.spriteTrimHeight, Projectile.spriteXOffsets[id], GroundTile.spriteYOffsets[id], Class120_Sub12_Sub11.spriteWidths[id], Class120_Sub12_Sub39.spriteHeights[id], Class145.spritePaletteIndicators[id], Class132_Sub1.spritePalette);
			} else {
				abstractIndexedSprites[id] = new LDIndexedSprite(Class31.spriteTrimWidth, SceneGroundObject.spriteTrimHeight, Projectile.spriteXOffsets[id], GroundTile.spriteYOffsets[id], Class120_Sub12_Sub11.spriteWidths[id], Class120_Sub12_Sub39.spriteHeights[id], Class145.spritePaletteIndicators[id], Class132_Sub1.spritePalette);
			}
		}
		Class53_Sub1.resetSpriteInfo();
		return abstractIndexedSprites;
	}

	final void clear() {
		for (;;) {
			final ParticleNodeSub class108_sub3 = this.head.nextSub;
			if (class108_sub3 == this.head) {
				break;
			}
			class108_sub3.unlinkSub();
		}
		current = null;
	}

	final ParticleNodeSub peekFirst() {
		final ParticleNodeSub class108_sub3_2_ = this.head.nextSub;
		if (class108_sub3_2_ == this.head) {
			current = null;
			return null;
		}
		current = class108_sub3_2_.nextSub;
		return class108_sub3_2_;
	}

	static final void method829(final int i, final int[] is, final int[] is_3_, final int i_5_) {
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
			method829(i_6_ + -1, is, is_3_, i_5_);
			method829(i, is, is_3_, i_6_ + 1);
		}
	}

	final void insertLast(final ParticleNodeSub class108_sub3) {
		if (class108_sub3.previousSub != null) {
			class108_sub3.unlinkSub();
		}
		class108_sub3.nextSub = this.head;
		class108_sub3.previousSub = this.head.previousSub;
		class108_sub3.previousSub.nextSub = class108_sub3;
		class108_sub3.nextSub.previousSub = class108_sub3;
	}

	final ParticleNodeSub peekNext() {
		final ParticleNodeSub class108_sub3_13_ = current;
		if (this.head == class108_sub3_13_) {
			current = null;
			return null;
		}
		current = class108_sub3_13_.nextSub;
		return class108_sub3_13_;
	}

	public TileParticleQueue() {
		this.head.nextSub = this.head;
		this.head.previousSub = this.head;
	}
}
