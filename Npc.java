/* Class180_Sub5_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Npc extends GameEntity {
	static Hashtable playerAmbientSounds = new Hashtable(16);
	NpcType npcType;
	static String aString3752;
	static js5 aClass50_3753;
	static byte[][][] aByteArrayArrayArray3754;

	final void setNpcType(final NpcType npcType) {
		this.npcType = npcType;
		if (this.aClass108_Sub2_2988 != null) {
			this.aClass108_Sub2_2988.method947();
		}
	}

	@Override
	final boolean isVisible() {
		if (this.npcType == null) {
			return false;
		}
		return true;
	}

	@Override
	final void render(final int i, final int i_0_, final int i_1_, final int i_2_, final int i_3_, final int i_4_, final int i_5_, final int i_6_, final long l, final int i_7_, final ParticleEngine class108_sub2) {
		try {
			if (this.npcType != null) {
				final SeqType seqType = (this.anInt3006 ^ 0xffffffff) == 0 || this.anInt2993 != 0 ? null : SeqType.list(this.anInt3006);
				final SeqType class40_8_ = (this.anInt3004 ^ 0xffffffff) != 0 && (this.anInt3004 != method2336().anInt218 || seqType == null) ? SeqType.list(this.anInt3004) : null;
				AbstractModel class180_sub7 = this.npcType.method2212(this.anInt2964, this.anInt2998, -102, class40_8_, seqType, this.anInt3013, this.aClass150Array2972, this.anInt3021, this.anInt3046, this.anInt3044);
				if (class180_sub7 != null) {
					this.maxY = class180_sub7.getMaxY();
					NpcType npcType = this.npcType;
					if (npcType.childrenIDs != null) {
						npcType = npcType.handleVarp();
					}
					if (Class120_Sub6.characterShadowsOn && npcType.aBoolean1653) {
						final AbstractModel class180_sub7_9_ = Class32.method273(this.npcType.aShort1662, class40_8_ != null ? class40_8_ : seqType, i, this.npcType.size, this.npcType.aByte1699, class180_sub7, class40_8_ != null ? this.anInt3046 : this.anInt2964, this.y,
								this.z, this.aBoolean3002, this.npcType.aShort1683, this.npcType.aByte1694, this.x);
						if (HDToolkit.glEnabled) {
							final float f = HDToolkit.method534();
							final float f_10_ = HDToolkit.method526();
							HDToolkit.disableDepthMask();
							HDToolkit.method535(f, -150.0F + f_10_);
							class180_sub7_9_.render(0, i_0_, i_1_, i_2_, i_3_, i_4_, i_5_, i_6_, -1L, i_7_, this.aClass108_Sub2_2988);
							HDToolkit.enableDepthMask();
							HDToolkit.method535(f, f_10_);
						} else {
							class180_sub7_9_.render(0, i_0_, i_1_, i_2_, i_3_, i_4_, i_5_, i_6_, -1L, i_7_, this.aClass108_Sub2_2988);
						}
					}
					AbstractModel class180_sub7_11_ = null;
					method2327(0, class180_sub7);
					method2334(class180_sub7, i);
					if ((this.spotAnimId ^ 0xffffffff) != 0 && (this.spotAnimFrame ^ 0xffffffff) != 0) {
						final SpotAnimType spotAnimType = SpotAnimType.list(this.spotAnimId);
						class180_sub7_11_ = spotAnimType.constructModel(this.spotAnimNextFrame, this.anInt2963, this.spotAnimFrame);
						if (class180_sub7_11_ != null) {
							class180_sub7_11_.translate(0, -this.anInt2965, 0);
							if (spotAnimType.aBoolean989) {
								if (MouseHandler.anInt1140 != 0) {
									class180_sub7_11_.method2377(MouseHandler.anInt1140);
								}
								if (Class159.anInt1488 != 0) {
									class180_sub7_11_.method2362(Class159.anInt1488);
								}
								if (Class93.anInt867 != 0) {
									class180_sub7_11_.translate(0, Class93.anInt867, 0);
								}
							}
						}
					}
					if (!HDToolkit.glEnabled) {
						if (class180_sub7_11_ != null) {
							class180_sub7 = ((LDModel) class180_sub7).method2392(class180_sub7_11_);
						}
						method2337(class180_sub7, class180_sub7_11_);
						if (this.npcType.size == 1) {
							class180_sub7.haveActions = true;
						}
						class180_sub7.render(i, i_0_, i_1_, i_2_, i_3_, i_4_, i_5_, i_6_, l, i_7_, this.aClass108_Sub2_2988);
					} else {
						method2337(class180_sub7, class180_sub7_11_);
						if (this.npcType.size == 1) {
							class180_sub7.haveActions = true;
						}
						class180_sub7.render(i, i_0_, i_1_, i_2_, i_3_, i_4_, i_5_, i_6_, l, i_7_, this.aClass108_Sub2_2988);
						if (class180_sub7_11_ != null) {
							if (this.npcType.size == 1) {
								class180_sub7_11_.haveActions = true;
							}
							if (this.aClass108_Sub2_2988 != null) {
								final HDModel class180_sub7_sub2 = (HDModel) class180_sub7_11_;
								this.aClass108_Sub2_2988.method962(class180_sub7_sub2.aClass158Array3892, class180_sub7_sub2.aClass169Array3858, true, class180_sub7_sub2.anIntArray3878, class180_sub7_sub2.anIntArray3856, class180_sub7_sub2.anIntArray3845);
							}
							class180_sub7_11_.render(i, i_0_, i_1_, i_2_, i_3_, i_4_, i_5_, i_6_, l, i_7_, this.aClass108_Sub2_2988);
						}
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("p.T(").append(i).append(',').append(i_0_).append(',').append(i_1_).append(',').append(i_2_).append(',').append(i_3_).append(',').append(i_4_).append(',').append(i_5_).append(',').append(i_6_).append(',').append(l)
					.append(',').append(i_7_).append(',').append(class108_sub2 != null ? "{...}" : "null").append(')').toString());
		}
	}

	@Override
	final int getMaxY() {
		int i;
		try {
			i = this.maxY;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, "p.MA()");
		}
		return i;
	}

	@Override
	protected final void finalize() {
		try {
			if (this.aClass108_Sub2_2988 != null) {
				this.aClass108_Sub2_2988.method953();
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, "p.finalize()");
		}
	}

	@Override
	final void method2266(final int i, final int i_12_, final int i_13_, final int i_14_, final int i_15_) {
		try {
			if (this.npcType != null) {
				if (!this.aBoolean3007) {
					final SeqType seqType = this.anInt3006 != -1 && this.anInt2993 == 0 ? SeqType.list(this.anInt3006) : null;
					final SeqType class40_16_ = this.anInt3004 == -1 || this.anInt3004 == method2336().anInt218 && seqType != null ? null : SeqType.list(this.anInt3004);
					final AbstractModel class180_sub7 = this.npcType.method2212(this.anInt2964, this.anInt2998, -119, class40_16_, seqType, this.anInt3013, this.aClass150Array2972, this.anInt3021, this.anInt3046, this.anInt3044);
					if (class180_sub7 == null) {
						return;
					}
					method2337(class180_sub7, null);
				}
				if (this.aClass108_Sub2_2988 != null) {
					this.aClass108_Sub2_2988.method944(i, i_12_, i_14_, i_13_, i_15_);
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("p.BB(").append(i).append(',').append(i_12_).append(',').append(i_13_).append(',').append(i_14_).append(',').append(i_15_).append(')').toString());
		}
	}

	public static void method2347(final int i) {
		try {
			aString3752 = null;
			aClass50_3753 = null;
			playerAmbientSounds = null;
			if (i != 2980) {
				method2348(-78, -35, 3, -80);
			}
			aByteArrayArrayArray3754 = null;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("p.S(").append(i).append(')').toString());
		}
	}

	static final void method2348(int i, final int i_17_, final int i_18_, int i_19_) {
		CanvasWrapper.anInt20 = -1;
		Class120_Sub2.anInt2422 = -1;
		final float f = (float) WorldMapHandler.mapSizeY / (float) WorldMapHandler.mapSizeX;
		int i_21_ = i_17_;
		int i_22_ = i_18_;
		if (!(f < 1.0F)) {
			i_21_ = (int) (i_18_ / f);
		} else {
			i_22_ = (int) (i_17_ * f);
		}
		i -= (i_18_ - i_22_) / 2;
		i_19_ -= (-i_21_ + i_17_) / 2;
		ParticleManager.anInt2336 = WorldMapHandler.mapSizeX * i_19_ / i_21_;
		Class169.anInt1646 = WorldMapHandler.mapSizeY * i / i_22_;
		Class127.fixWorldMapBounds();
	}

	@Override
	final int method2325() {
		if (this.npcType.childrenIDs != null) {
			final NpcType npcType = this.npcType.handleVarp();
			if (npcType != null && npcType.anInt1692 != -1) {
				return npcType.anInt1692;
			}
		}
		return this.anInt2982;
	}

	static final boolean method2349(final int i, final int i_23_, final int i_24_, final byte[] is) {
		boolean bool;
		try {
			boolean bool_25_ = true;
			final Buffer class120_sub7 = new Buffer(is);
			int i_26_ = -1;
			for (;;) {
				final int i_27_ = class120_sub7.method1100();
				if (i_27_ == 0) {
					break;
				}
				i_26_ += i_27_;
				int i_28_ = 0;
				boolean bool_29_ = false;
				for (;;) {
					if (bool_29_) {
						final int i_30_ = class120_sub7.getUSmart();
						if (i_30_ == 0) {
							break;
						}
						class120_sub7.getUByte();
					} else {
						final int i_31_ = class120_sub7.getUSmart();
						if (i_31_ == 0) {
							break;
						}
						i_28_ += -1 + i_31_;
						final int i_32_ = (0xfcd & i_28_) >> 6;
						final int i_33_ = class120_sub7.getUByte() >> 2;
						final int i_34_ = i_24_ + i_32_;
						final int i_35_ = 0x3f & i_28_;
						final int i_36_ = i_23_ + i_35_;
						if (i_34_ > 0 && i_36_ > 0 && i_34_ < 103 && i_36_ < 103) {
							final LocType locType = LocType.list(i_26_);
							if (i_33_ != 22 || Hashtable.showGroundDecorations || locType.anInt1835 != 0 || locType.anInt1821 == 1 || locType.aBoolean1853) {
								bool_29_ = true;
								if (!locType.method2452(true)) {
									bool_25_ = false;
									Class181.anInt1791++;
								}
							}
						}
					}
				}
			}
			if (i != 0) {
				method2348(-102, -70, -69, 74);
			}
			bool = bool_25_;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("p.U(").append(i).append(',').append(i_23_).append(',').append(i_24_).append(',').append(is != null ? "{...}" : "null").append(')').toString());
		}
		return bool;
	}
}
