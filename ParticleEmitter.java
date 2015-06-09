/* Class108_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class ParticleEmitter extends ParticleNode {
	private int anInt2314;
	int centerX;
	private int anInt2316;
	private int anInt2317;
	int centerY;
	static int selectedObjSlot;
	static int anInt2320 = 0;
	int centerZ;
	ModelParticleEmitter aClass158_2322;
	EmitterType emitterType;
	private int anInt2324;
	private int anInt2325;
	private int anInt2326;
	private int anInt2327;
	static int logoId = -1;
	boolean aBoolean2329;
	private final long aLong2330;
	private int anInt2331;
	private int anInt2332;
	int anInt2333;
	private int anInt2334 = 0;
	private int anInt2335;
	static int anInt2336;
	Class174 aClass174_2337;
	private int anInt2338;
	boolean aBoolean2339 = false;
	ParticleEngine particleEngine;
	private int anInt2341;
	private int anInt2342;
	private int anInt2343;
	private int anInt2344;
	private int anInt2345;

	static final boolean setHdr(boolean bool) {
		final boolean bool_1_ = Class34.method290();
		if (bool != bool_1_) {
			if (!bool) {
				Class34.method282();
			} else if (!Class34.method288() || !Class34.method286() || !Class34.method280()) {
				bool = false;
			}
			WallDecoration.hdrEnabled = bool;
			Class120_Sub6.savePreferences(NpcType.gameSignlink);
			if (!bool_1_ == bool) {
				((Class143_Sub1) Rasterizer.anInterface5_973).method2025();
				return true;
			}
			return false;
		}
		return true;
	}

	static final int method935(final int i, int i_2_) {
		i_2_ = i_2_ * (i & 0x7f) >> 7;
		if (i_2_ < 2) {
			i_2_ = 2;
		} else if (i_2_ > 126) {
			i_2_ = 126;
		}
		return (i & 0xff80) + i_2_;
	}

	static final int method936(final int i, final int i_4_) {
		int i_6_ = i + i_4_ * 57;
		i_6_ = i_6_ << 13 ^ i_6_;
		final int i_7_ = 1376312589 + (789221 + i_6_ * i_6_ * 15731) * i_6_ & 0x7fffffff;
		return (i_7_ & 0x7fd13c7) >> 19;
	}

	static final AbstractFont constructAbstractFont(final byte[] data) {
		if (data == null) {
			return null;
		}
		AbstractFont abstractFont;
		if (HDToolkit.glEnabled) {
			abstractFont = new HDFont(data, Projectile.spriteXOffsets, GroundTile.spriteYOffsets, Class120_Sub12_Sub11.spriteWidths, Class120_Sub12_Sub39.spriteHeights, Class145.spritePaletteIndicators);
		} else {
			abstractFont = new LDFont(data, Projectile.spriteXOffsets, GroundTile.spriteYOffsets, Class120_Sub12_Sub11.spriteWidths, Class120_Sub12_Sub39.spriteHeights, Class145.spritePaletteIndicators);
		}
		Class53_Sub1.resetSpriteInfo();
		return abstractFont;
	}

	static final Class120_Sub14_Sub22 method938() {
		return WorldMapHandler.aClass120_Sub14_Sub22_691;
	}

	static final void method939(final int i, final int i_9_, final int i_10_, final int i_12_) {
		if (i_10_ >= i_12_) {
			for (int i_13_ = i_12_; i_13_ < i_10_; i_13_++) {
				GameEntity.anIntArrayArray3009[i_13_][i] = i_9_;
			}
		} else {
			for (int i_14_ = i_10_; i_14_ < i_12_; i_14_++) {
				GameEntity.anIntArrayArray3009[i_14_][i] = i_9_;
			}
		}
	}

	final void method940(final int i, final int i_15_, boolean bool, final int i_16_, final long l) {
		if (!this.aBoolean2339) {
			if (ParticleEngine.particleSetting >= this.emitterType.minSetting) {
				if (OverridedJInterface.maxParticleCount[ParticleEngine.particleSetting] >= ParticleEngine.particleCount) {
					if (anInt2341 != anInt2342 || anInt2342 != anInt2325 || anInt2332 != anInt2326 || anInt2332 != anInt2316 || anInt2338 != anInt2317 || anInt2344 != anInt2317) {
						if (this.emitterType.lifetime != -1) {
							int i_18_ = (int) (l - aLong2330);
							if (this.emitterType.periodic || i_18_ <= this.emitterType.lifetime) {
								i_18_ %= this.emitterType.lifetime;
							} else {
								bool = false;
							}
							if (!this.emitterType.activeFirst && this.emitterType.ageMark > i_18_) {
								bool = false;
							}
							if (this.emitterType.activeFirst && i_18_ >= this.emitterType.ageMark) {
								bool = false;
							}
						}
					} else {
						bool = false;
					}
				} else {
					bool = false;
				}
			} else {
				bool = false;
			}
		} else {
			bool = false;
		}
		if (bool) {
			anInt2334 += (int) ((this.emitterType.minParticleRate + (this.emitterType.maxParticleRate - this.emitterType.minParticleRate) * Math.random()) * i);
			if (anInt2334 > 63) {
				final int i_19_ = anInt2334 >> 6;
				anInt2334 &= 0x3f;
				if (this.aBoolean2329) {
					final int i_20_ = -anInt2341 + anInt2342;
					final int i_21_ = anInt2332 - anInt2326;
					final int i_22_ = anInt2325 + -anInt2341;
					final int i_23_ = anInt2316 + -anInt2326;
					final int i_24_ = anInt2317 - anInt2338;
					anInt2335 = i_23_ * i_20_ - i_22_ * i_21_;
					final int i_25_ = anInt2344 - anInt2338;
					anInt2327 = -(i_20_ * i_25_) + i_24_ * i_22_;
					for (anInt2314 = i_21_ * i_25_ - i_23_ * i_24_; anInt2314 > 32767 || anInt2327 > 32767 || anInt2335 > 32767 || anInt2314 < -32767 || anInt2327 < -32767 || anInt2335 < -32767; anInt2314 >>= 1) {
						anInt2327 >>= 1;
						anInt2335 >>= 1;
					}
					int i_26_ = (int) Math.sqrt(anInt2335 * anInt2335 + anInt2327 * anInt2327 + anInt2314 * anInt2314);
					if (i_26_ <= 0) {
						i_26_ = 1;
					}
					anInt2314 = anInt2314 * 32767 / i_26_;
					anInt2327 = anInt2327 * 32767 / i_26_;
					anInt2335 = anInt2335 * 32767 / i_26_;
					if (this.emitterType.maxAngleH <= 0 && this.emitterType.maxAngleV <= 0) {
						if (this.particleEngine.anInt2377 != 0) {
							final int i_27_ = anInt2335 * i_15_ - -(anInt2314 * i_16_) >> 16;
							anInt2335 = i_16_ * anInt2335 + -(anInt2314 * i_15_) >> 16;
							anInt2314 = i_27_;
						}
					} else {
						int i_28_ = (int) (Math.atan2(anInt2335, anInt2314) * 2047.0 / 6.283185307179586);
						final int i_29_ = (int) (Math.atan2(anInt2327, Math.sqrt(anInt2335 * anInt2335 + anInt2314 * anInt2314)) * 2047.0 / 6.283185307179586);
						anInt2343 = this.emitterType.maxAngleH - this.emitterType.minAngleH;
						anInt2324 = this.emitterType.maxAngleV - this.emitterType.minAngleV;
						anInt2345 = this.emitterType.minAngleV + (i_29_ + -(anInt2324 / 2));
						anInt2331 = -(anInt2343 / 2) + this.emitterType.minAngleH + i_28_;
						i_28_ -= this.particleEngine.anInt2377;
					}
					this.aBoolean2329 = false;
				}
				for (int i_30_ = 0; i_19_ > i_30_; i_30_++) {
					int i_31_;
					int i_32_;
					int i_33_;
					if (this.emitterType.maxAngleH <= 0 && this.emitterType.maxAngleV <= 0) {
						i_33_ = anInt2327;
						i_31_ = anInt2314;
						i_32_ = anInt2335;
					} else {
						int i_34_ = (int) (Math.random() * anInt2343) + anInt2331;
						int i_35_ = (int) (Math.random() * anInt2324) + anInt2345;
						i_35_ &= 0x3ff;
						i_34_ &= 0x7ff;
						final int i_36_ = Rasterizer.sinTable[i_35_] >> 1;
						final int i_37_ = Rasterizer.cosTable[i_34_] >> 1;
						i_31_ = i_37_ * i_36_ >> 15;
						final int i_38_ = Rasterizer.sinTable[i_34_] >> 1;
						i_32_ = i_38_ * i_36_ >> 15;
						final int i_39_ = Rasterizer.cosTable[i_35_] >> 1;
						i_33_ = -1 * i_39_;
					}
					final int i_40_ = (int) (255.0 * Math.random());
					final int i_41_ = (int) (Math.random() * 255.0);
					final int i_42_ = i_40_ * (-i_41_ + 255) >> 8;
					final int i_43_ = -i_41_ + 255 - i_42_;
					int i_44_ = i_43_ * anInt2344 + i_42_ * anInt2317 + anInt2338 * i_41_ >> 8;
					final int i_45_ = i_43_ * anInt2316 + anInt2332 * i_42_ + anInt2326 * i_41_ >> 8;
					int i_46_ = i_41_ * anInt2341 - -(i_42_ * anInt2342) + i_43_ * anInt2325 >> 8;
					if (this.particleEngine.anInt2377 != 0) {
						final int i_47_ = i_15_ * i_44_ + i_46_ * i_16_ >> 16;
						i_44_ = -(i_46_ * i_15_) + i_16_ * i_44_ >> 16;
						i_46_ = i_47_;
					}
					final int i_48_ = (int) (Math.random() * (-this.emitterType.minSpeed + this.emitterType.maxSpeed)) + this.emitterType.minSpeed;
					final int i_49_ = (int) ((-this.emitterType.minLifetime + this.emitterType.maxLifetime) * Math.random()) + this.emitterType.minLifetime;
					int i_50_;
					if (!this.emitterType.uniformColorVariance) {
						i_50_ = (int) (Math.random() * this.emitterType.startAlphaVariance + this.emitterType.minStartAlpha) << 24 | (int) (Math.random() * this.emitterType.startBlueVariance + this.emitterType.minStartBlue) | (int) (this.emitterType.startGreenVariance * Math.random() + this.emitterType.minStartGreen) << 8 | (int) (this.emitterType.minStartRed + Math.random() * this.emitterType.startRedVariance) << 16;
					} else {
						final double d = Math.random();
						i_50_ = (int) (this.emitterType.startAlphaVariance * d + this.emitterType.minStartAlpha) << 24 | (int) (this.emitterType.minStartRed + d * this.emitterType.startRedVariance) << 16 | (int) (d * this.emitterType.startGreenVariance + this.emitterType.minStartGreen) << 8 | (int) (this.emitterType.startBlueVariance * d + this.emitterType.minStartBlue);
					}
					if (ParticleEngine.anInt2354 == ParticleEngine.anInt2353) {
						new Particle(this, this.particleEngine.anInt2379 - -i_46_, this.particleEngine.anInt2372 - -i_45_, this.particleEngine.anInt2368 + i_44_, i_31_, i_33_, i_32_, i_48_, i_49_, i_50_);
					} else {
						final Particle class108_sub3_sub1 = ParticleEngine.aClass108_Sub3_Sub1Array2350[ParticleEngine.anInt2353];
						ParticleEngine.anInt2353 = 0x3ff & ParticleEngine.anInt2353 - -1;
						class108_sub3_sub1.method971(this, this.particleEngine.anInt2379 - -i_46_, this.particleEngine.anInt2372 + i_45_, i_44_ + this.particleEngine.anInt2368, i_31_, i_33_, i_32_, i_48_, i_49_, i_50_);
					}
				}
			}
		}
		this.anInt2333 = 0;
		for (Particle class108_sub3_sub1 = (Particle) this.aClass174_2337.peekFirst(); class108_sub3_sub1 != null; class108_sub3_sub1 = (Particle) this.aClass174_2337.peekNext()) {
			class108_sub3_sub1.update(l, i);
			this.anInt2333++;
		}
		ParticleEngine.particleCountWrapper += this.anInt2333;
	}

	static final void removeFriend(final long nameAsLong) {
		if (0L != nameAsLong) {
			for (int friendId = 0; friendId < ProducingGraphicsBuffer.friendCount; friendId++) {
				if (AbstractSprite.friendsNameAsLong[friendId] == nameAsLong) {
					ProducingGraphicsBuffer.friendCount--;
					for (int nextFriendId = friendId; nextFriendId < ProducingGraphicsBuffer.friendCount; nextFriendId++) {
						Class120_Sub16.friendsName[nextFriendId] = Class120_Sub16.friendsName[nextFriendId + 1];
						Class120_Sub12_Sub16.friendsWorld[nextFriendId] = Class120_Sub12_Sub16.friendsWorld[nextFriendId + 1];
						Class79_Sub1.friendsSideText[nextFriendId] = Class79_Sub1.friendsSideText[nextFriendId + 1];
						AbstractSprite.friendsNameAsLong[nextFriendId] = AbstractSprite.friendsNameAsLong[nextFriendId + 1];
						Class120_Sub12_Sub30.friendsRank[nextFriendId] = Class120_Sub12_Sub30.friendsRank[nextFriendId + 1];
						Class120_Sub12_Sub9.aBooleanArray3194[nextFriendId] = Class120_Sub12_Sub9.aBooleanArray3194[nextFriendId + 1];
					}
					client.anInt563 = GrandExchangeObject.anInt1494;
					Class120_Sub12_Sub11.outputStream.putByteIsaac(172);
					Class120_Sub12_Sub11.outputStream.putLong(nameAsLong);
					break;
				}
			}
		}
	}

	final void method942(final int i, final int i_53_, final int i_54_, final int i_55_, final int i_56_, final int i_57_, final int i_58_, final int i_59_, final int i_60_, final int i_61_) {
		anInt2344 = i_61_;
		anInt2332 = i_56_;
		anInt2341 = i_54_;
		anInt2338 = i_60_;
		anInt2317 = i_59_;
		anInt2325 = i;
		anInt2342 = i_58_;
		anInt2316 = i_55_;
		anInt2326 = i_53_;
		final int i_62_ = this.particleEngine.anInt2372 + (anInt2326 + anInt2332 + anInt2316) / 3;
		final int i_63_ = this.particleEngine.anInt2379 + (anInt2342 + anInt2341 + anInt2325) / 3;
		final int i_64_ = (anInt2344 + anInt2317 + anInt2338) / 3 - -this.particleEngine.anInt2368;
		if (this.centerX != i_63_ || i_62_ != this.centerY || i_64_ != this.centerZ) {
			this.centerZ = i_64_;
			this.aBoolean2329 = true;
			this.centerY = i_62_;
			this.centerX = i_63_;
		}
	}

	ParticleEmitter(final ModelParticleEmitter class158, final ParticleEngine class108_sub2, final long l) {
		this.aBoolean2329 = true;
		this.aClass158_2322 = class158;
		this.particleEngine = class108_sub2;
		this.aClass174_2337 = new Class174();
		this.emitterType = this.aClass158_2322.emitterType;
		aLong2330 = l;
		anInt2334 += Math.random() * 64.0;
	}
}
