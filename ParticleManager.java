/* Class108_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class ParticleManager extends ParticleNode {
	private int anInt2314;
	int anInt2315;
	private int anInt2316;
	private int anInt2317;
	int anInt2318;
	static int selectedObjSlot;
	static int anInt2320 = 0;
	int anInt2321;
	Class158 aClass158_2322;
	Class80 aClass80_2323;
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
	ParticleEngine aClass108_Sub2_2340;
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
			Class186.hdrEnabled = bool;
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

	static final int method936(final int i, final int i_3_, final int i_4_) {
		int i_5_;
		try {
			int i_6_ = i + i_4_ * 57;
			if (i_3_ != 25528) {
				return 27;
			}
			i_6_ = i_6_ << 13 ^ i_6_;
			final int i_7_ = 1376312589 + (789221 + i_6_ * i_6_ * 15731) * i_6_ & 0x7fffffff;
			i_5_ = (i_7_ & 0x7fd13c7) >> 19;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("bi.J(").append(i).append(',').append(i_3_).append(',').append(i_4_).append(')').toString());
		}
		return i_5_;
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

	static final void method939(final int i, final int i_9_, final int i_10_, final byte i_11_, final int i_12_) {
		try {
			if (i_11_ <= -20) {
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
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("bi.F(").append(i).append(',').append(i_9_).append(',').append(i_10_).append(',').append(i_11_).append(',').append(i_12_).append(')').toString());
		}
	}

	final void method940(final int i, final int i_15_, boolean bool, final int i_16_, final long l) {
		if (!this.aBoolean2339) {
			if (ParticleEngine.particleSetting >= this.aClass80_2323.anInt746) {
				if (OverridedJInterface.anIntArray2743[ParticleEngine.particleSetting] >= ParticleEngine.anInt2351) {
					if (anInt2341 != anInt2342 || anInt2342 != anInt2325 || anInt2332 != anInt2326 || anInt2332 != anInt2316 || anInt2338 != anInt2317 || anInt2344 != anInt2317) {
						if ((this.aClass80_2323.anInt772 ^ 0xffffffff) != 0) {
							int i_18_ = (int) (l + -aLong2330);
							if (this.aClass80_2323.aBoolean760 || i_18_ <= this.aClass80_2323.anInt772) {
								i_18_ %= this.aClass80_2323.anInt772;
							} else {
								bool = false;
							}
							if (!this.aClass80_2323.aBoolean718 && this.aClass80_2323.anInt755 > i_18_) {
								bool = false;
							}
							if (this.aClass80_2323.aBoolean718 && i_18_ >= this.aClass80_2323.anInt755) {
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
			anInt2334 += (int) ((this.aClass80_2323.anInt768 + (this.aClass80_2323.anInt734 - this.aClass80_2323.anInt768) * Math.random()) * i);
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
					anInt2314 = 32767 * anInt2314 / i_26_;
					anInt2327 = anInt2327 * 32767 / i_26_;
					anInt2335 = anInt2335 * 32767 / i_26_;
					if (this.aClass80_2323.aShort753 <= 0 && this.aClass80_2323.aShort763 <= 0) {
						if (this.aClass108_Sub2_2340.anInt2377 != 0) {
							final int i_27_ = anInt2335 * i_15_ - -(anInt2314 * i_16_) >> 16;
							anInt2335 = i_16_ * anInt2335 + -(anInt2314 * i_15_) >> 16;
							anInt2314 = i_27_;
						}
					} else {
						int i_28_ = (int) (Math.atan2(anInt2335, anInt2314) * 2047.0 / 6.283185307179586);
						final int i_29_ = (int) (Math.atan2(anInt2327, Math.sqrt(anInt2335 * anInt2335 + anInt2314 * anInt2314)) * 2047.0 / 6.283185307179586);
						anInt2343 = -this.aClass80_2323.aShort744 + this.aClass80_2323.aShort753;
						anInt2324 = -this.aClass80_2323.aShort759 + this.aClass80_2323.aShort763;
						anInt2345 = this.aClass80_2323.aShort759 + (i_29_ + -(anInt2324 / 2));
						i_28_ -= this.aClass108_Sub2_2340.anInt2377;
						anInt2331 = -(anInt2343 / 2) + this.aClass80_2323.aShort744 + i_28_;
					}
					this.aBoolean2329 = false;
				}
				for (int i_30_ = 0; i_19_ > i_30_; i_30_++) {
					int i_31_;
					int i_32_;
					int i_33_;
					if (this.aClass80_2323.aShort753 <= 0 && this.aClass80_2323.aShort763 <= 0) {
						i_33_ = anInt2327;
						i_31_ = anInt2314;
						i_32_ = anInt2335;
					} else {
						int i_34_ = (int) (Math.random() * anInt2343) + anInt2331;
						int i_35_ = (int) (Math.random() * anInt2324) + anInt2345;
						i_35_ &= 0x3ff;
						i_34_ &= 0x7ff;
						final int i_36_ = Rasterizer.sineTable[i_35_] >> 1;
						final int i_37_ = Rasterizer.cosineTable[i_34_] >> 1;
						i_31_ = i_37_ * i_36_ >> 15;
						final int i_38_ = Rasterizer.sineTable[i_34_] >> 1;
						i_32_ = i_38_ * i_36_ >> 15;
						final int i_39_ = Rasterizer.cosineTable[i_35_] >> 1;
						i_33_ = -1 * i_39_;
					}
					final int i_40_ = (int) (255.0 * Math.random());
					final int i_41_ = (int) (Math.random() * 255.0);
					final int i_42_ = i_40_ * (-i_41_ + 255) >> 8;
					final int i_43_ = -i_41_ + 255 - i_42_;
					int i_44_ = i_43_ * anInt2344 + i_42_ * anInt2317 + anInt2338 * i_41_ >> 8;
					final int i_45_ = i_43_ * anInt2316 + anInt2332 * i_42_ + anInt2326 * i_41_ >> 8;
					int i_46_ = i_41_ * anInt2341 - -(i_42_ * anInt2342) + i_43_ * anInt2325 >> 8;
					if (this.aClass108_Sub2_2340.anInt2377 != 0) {
						final int i_47_ = i_15_ * i_44_ + i_46_ * i_16_ >> 16;
						i_44_ = -(i_46_ * i_15_) + i_16_ * i_44_ >> 16;
						i_46_ = i_47_;
					}
					final int i_48_ = (int) (Math.random() * (-this.aClass80_2323.anInt739 + this.aClass80_2323.anInt776)) + this.aClass80_2323.anInt739;
					final int i_49_ = (int) ((-this.aClass80_2323.anInt756 + this.aClass80_2323.anInt738) * Math.random()) + this.aClass80_2323.anInt756;
					int i_50_;
					if (!this.aClass80_2323.aBoolean736) {
						i_50_ = (int) (Math.random() * this.aClass80_2323.anInt774 + this.aClass80_2323.anInt723) << 24 | (int) (Math.random() * this.aClass80_2323.anInt722 + this.aClass80_2323.anInt758) | (int) (this.aClass80_2323.anInt767 * Math.random() + this.aClass80_2323.anInt725) << 8 | (int) (this.aClass80_2323.anInt737 + Math.random() * this.aClass80_2323.anInt719) << 16;
					} else {
						final double d = Math.random();
						i_50_ = (int) (this.aClass80_2323.anInt774 * d + this.aClass80_2323.anInt723) << 24 | (int) (this.aClass80_2323.anInt737 + d * this.aClass80_2323.anInt719) << 16 | (int) (d * this.aClass80_2323.anInt767 + this.aClass80_2323.anInt725) << 8 | (int) (this.aClass80_2323.anInt722 * d + this.aClass80_2323.anInt758);
					}
					if (ParticleEngine.anInt2354 == ParticleEngine.anInt2353) {
						new Particle(this, this.aClass108_Sub2_2340.anInt2379 - -i_46_, this.aClass108_Sub2_2340.anInt2372 - -i_45_, this.aClass108_Sub2_2340.anInt2368 + i_44_, i_31_, i_33_, i_32_, i_48_, i_49_, i_50_);
					} else {
						final Particle class108_sub3_sub1 = ParticleEngine.aClass108_Sub3_Sub1Array2350[ParticleEngine.anInt2353];
						ParticleEngine.anInt2353 = 0x3ff & ParticleEngine.anInt2353 - -1;
						class108_sub3_sub1.method971(this, this.aClass108_Sub2_2340.anInt2379 - -i_46_, this.aClass108_Sub2_2340.anInt2372 + i_45_, i_44_ + this.aClass108_Sub2_2340.anInt2368, i_31_, i_33_, i_32_, i_48_, i_49_, i_50_);
					}
				}
			}
		}
		this.anInt2333 = 0;
		for (Particle class108_sub3_sub1 = (Particle) this.aClass174_2337.peekFirst(); class108_sub3_sub1 != null; class108_sub3_sub1 = (Particle) this.aClass174_2337.peekNext()) {
			class108_sub3_sub1.method968(l, i);
			this.anInt2333++;
		}
		ParticleEngine.anInt2360 += this.anInt2333;
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
					Class61.anInt563 = GrandExchangeObject.anInt1494;
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
		final int i_62_ = this.aClass108_Sub2_2340.anInt2372 + (anInt2326 - -anInt2332 + anInt2316) / 3;
		final int i_63_ = this.aClass108_Sub2_2340.anInt2379 + (anInt2342 + anInt2341 - -anInt2325) / 3;
		final int i_64_ = (anInt2344 + anInt2317 + anInt2338) / 3 - -this.aClass108_Sub2_2340.anInt2368;
		if (this.anInt2315 != i_63_ || i_62_ != this.anInt2318 || i_64_ != this.anInt2321) {
			this.anInt2321 = i_64_;
			this.aBoolean2329 = true;
			this.anInt2318 = i_62_;
			this.anInt2315 = i_63_;
		}
	}

	ParticleManager(final Class158 class158, final ParticleEngine class108_sub2, final long l) {
		this.aBoolean2329 = true;
		this.aClass158_2322 = class158;
		this.aClass108_Sub2_2340 = class108_sub2;
		this.aClass174_2337 = new Class174();
		this.aClass80_2323 = this.aClass158_2322.aClass80_1480;
		aLong2330 = l;
		anInt2334 += Math.random() * 64.0;
	}
}
