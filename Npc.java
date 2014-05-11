/* Class180_Sub5_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Npc extends GameEntity {
	static Class75 aClass75_3750 = new Class75(16);
	NpcType npcType;
	static String aString3752;
	static Class50 aClass50_3753;
	static byte[][][] aByteArrayArrayArray3754;

	final void method2346(final byte i, final NpcType npcType) {
		try {
			this.npcType = npcType;
			if (this.aClass108_Sub2_2988 != null) {
				this.aClass108_Sub2_2988.method947();
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("p.Q(").append(i).append(',').append(npcType != null ? "{...}" : "null").append(')').toString());
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
	final void method2265(final int i, final int i_0_, final int i_1_, final int i_2_, final int i_3_, final int i_4_, final int i_5_, final int i_6_, final long l, final int i_7_, final ParticleEngine class108_sub2) {
		try {
			if (this.npcType != null) {
				final Class40 class40 = (this.anInt3006 ^ 0xffffffff) == 0 || this.anInt2993 != 0 ? null : Class120_Sub30_Sub2.method1763(this.anInt3006, 127);
				final Class40 class40_8_ = (this.anInt3004 ^ 0xffffffff) != 0 && (this.anInt3004 != method2336((byte) 96).anInt218 || class40 == null) ? Class120_Sub30_Sub2.method1763(this.anInt3004, 118) : null;
				Class180_Sub7 class180_sub7 = this.npcType.method2212(this.anInt2964, this.anInt2998, -102, class40_8_, class40, this.anInt3013, this.aClass150Array2972, this.anInt3021, this.anInt3046, this.anInt3044);
				if (class180_sub7 != null) {
					this.anInt3018 = class180_sub7.getMaxY();
					NpcType npcType = this.npcType;
					if (npcType.childrenIDs != null) {
						npcType = npcType.handleVarp();
					}
					if (Class120_Sub6.characterShadowsOn && npcType.aBoolean1653) {
						final Class180_Sub7 class180_sub7_9_ = Class32.method273(this.npcType.aShort1662, 2, class40_8_ != null ? class40_8_ : class40, i, this.npcType.size, this.npcType.aByte1699, class180_sub7, class40_8_ != null ? this.anInt3046 : this.anInt2964,
								this.anInt3005, this.z, this.aBoolean3002, this.npcType.aShort1683, this.npcType.aByte1694, this.x);
						if (HDToolkit.glEnabled) {
							final float f = HDToolkit.method534();
							final float f_10_ = HDToolkit.method526();
							HDToolkit.method503();
							HDToolkit.method535(f, -150.0F + f_10_);
							class180_sub7_9_.method2265(0, i_0_, i_1_, i_2_, i_3_, i_4_, i_5_, i_6_, -1L, i_7_, this.aClass108_Sub2_2988);
							HDToolkit.method505();
							HDToolkit.method535(f, f_10_);
						} else {
							class180_sub7_9_.method2265(0, i_0_, i_1_, i_2_, i_3_, i_4_, i_5_, i_6_, -1L, i_7_, this.aClass108_Sub2_2988);
						}
					}
					Class180_Sub7 class180_sub7_11_ = null;
					method2327(0, class180_sub7);
					method2334(class180_sub7, i, 0);
					if ((this.spotAnimId ^ 0xffffffff) != 0 && (this.spotAnimFrameId ^ 0xffffffff) != 0) {
						final SpotAnimType spotAnimType = SpotAnimType.list(this.spotAnimId);
						class180_sub7_11_ = spotAnimType.method882(this.anInt2971, this.anInt2963, this.spotAnimFrameId, (byte) 14);
						if (class180_sub7_11_ != null) {
							class180_sub7_11_.method2368(0, -this.anInt2965, 0);
							if (spotAnimType.aBoolean989) {
								if (MouseHandler.anInt1140 != 0) {
									class180_sub7_11_.method2377(MouseHandler.anInt1140);
								}
								if (Class159.anInt1488 != 0) {
									class180_sub7_11_.method2362(Class159.anInt1488);
								}
								if (Class93.anInt867 != 0) {
									class180_sub7_11_.method2368(0, Class93.anInt867, 0);
								}
							}
						}
					}
					if (!HDToolkit.glEnabled) {
						if (class180_sub7_11_ != null) {
							class180_sub7 = ((Class180_Sub7_Sub1) class180_sub7).method2392(class180_sub7_11_);
						}
						method2337(class180_sub7, class180_sub7_11_);
						if (this.npcType.size == 1) {
							class180_sub7.haveActions = true;
						}
						class180_sub7.method2265(i, i_0_, i_1_, i_2_, i_3_, i_4_, i_5_, i_6_, l, i_7_, this.aClass108_Sub2_2988);
					} else {
						method2337(class180_sub7, class180_sub7_11_);
						if (this.npcType.size == 1) {
							class180_sub7.haveActions = true;
						}
						class180_sub7.method2265(i, i_0_, i_1_, i_2_, i_3_, i_4_, i_5_, i_6_, l, i_7_, this.aClass108_Sub2_2988);
						if (class180_sub7_11_ != null) {
							if (this.npcType.size == 1) {
								class180_sub7_11_.haveActions = true;
							}
							if (this.aClass108_Sub2_2988 != null) {
								final Class180_Sub7_Sub2 class180_sub7_sub2 = (Class180_Sub7_Sub2) class180_sub7_11_;
								this.aClass108_Sub2_2988.method962(class180_sub7_sub2.aClass158Array3892, class180_sub7_sub2.aClass169Array3858, true, class180_sub7_sub2.anIntArray3878, class180_sub7_sub2.anIntArray3856, class180_sub7_sub2.anIntArray3845);
							}
							class180_sub7_11_.method2265(i, i_0_, i_1_, i_2_, i_3_, i_4_, i_5_, i_6_, l, i_7_, this.aClass108_Sub2_2988);
						}
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("p.T(").append(i).append(',').append(i_0_).append(',').append(i_1_).append(',').append(i_2_).append(',').append(i_3_).append(',').append(i_4_).append(',').append(i_5_).append(',').append(i_6_).append(',').append(l)
					.append(',').append(i_7_).append(',').append(class108_sub2 != null ? "{...}" : "null").append(')').toString());
		}
	}

	@Override
	final int getMaxY() {
		int i;
		try {
			i = this.anInt3018;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, "p.MA()");
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
			throw Class120_Sub14_Sub2.method1428(runtimeexception, "p.finalize()");
		}
	}

	@Override
	final void method2266(final int i, final int i_12_, final int i_13_, final int i_14_, final int i_15_) {
		try {
			if (this.npcType != null) {
				if (!this.aBoolean3007) {
					final Class40 class40 = this.anInt3006 != -1 && this.anInt2993 == 0 ? Class120_Sub30_Sub2.method1763(this.anInt3006, 123) : null;
					final Class40 class40_16_ = this.anInt3004 == -1 || this.anInt3004 == method2336((byte) 63).anInt218 && class40 != null ? null : Class120_Sub30_Sub2.method1763(this.anInt3004, 118);
					final Class180_Sub7 class180_sub7 = this.npcType.method2212(this.anInt2964, this.anInt2998, -119, class40_16_, class40, this.anInt3013, this.aClass150Array2972, this.anInt3021, this.anInt3046, this.anInt3044);
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
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("p.BB(").append(i).append(',').append(i_12_).append(',').append(i_13_).append(',').append(i_14_).append(',').append(i_15_).append(')').toString());
		}
	}

	public static void method2347(final int i) {
		try {
			aString3752 = null;
			aClass50_3753 = null;
			aClass75_3750 = null;
			if (i != 2980) {
				method2348(-78, -35, 3, -80, (byte) -86);
			}
			aByteArrayArrayArray3754 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("p.S(").append(i).append(')').toString());
		}
	}

	static final void method2348(int i, final int i_17_, final int i_18_, int i_19_, final byte i_20_) {
		try {
			CanvasWrapper.anInt20 = -1;
			final float f = (float) Class79.anInt692 / (float) Class79.anInt700;
			Class120_Sub2.anInt2422 = -1;
			int i_21_ = i_17_;
			int i_22_ = i_18_;
			if (!(f < 1.0F)) {
				i_21_ = (int) (i_18_ / f);
			} else {
				i_22_ = (int) (i_17_ * f);
			}
			i -= (i_18_ - i_22_) / 2;
			i_19_ -= (-i_21_ + i_17_) / 2;
			Class108_Sub1.anInt2336 = Class79.anInt700 * i_19_ / i_21_;
			Class169.anInt1646 = Class79.anInt692 * i / i_22_;
			if (i_20_ != -80) {
				aByteArrayArrayArray3754 = null;
			}
			Class127.method1889((byte) -103);
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("p.R(").append(i).append(',').append(i_17_).append(',').append(i_18_).append(',').append(i_19_).append(',').append(i_20_).append(')').toString());
		}
	}

	@Override
	final int method2325(final boolean bool) {
		int i;
		try {
			if (bool) {
				aClass75_3750 = null;
			}
			if (this.npcType.childrenIDs != null) {
				final NpcType npcType = this.npcType.handleVarp();
				if (npcType != null && (npcType.anInt1692 ^ 0xffffffff) != 0) {
					return npcType.anInt1692;
				}
			}
			i = this.anInt2982;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("p.I(").append(bool).append(')').toString());
		}
		return i;
	}

	static final boolean method2349(final int i, final int i_23_, final int i_24_, final byte[] is) {
		boolean bool;
		try {
			boolean bool_25_ = true;
			final Buffer class120_sub7 = new Buffer(is);
			int i_26_ = -1;
			for (;;) {
				final int i_27_ = class120_sub7.method1100(120);
				if (i_27_ == 0) {
					break;
				}
				i_26_ += i_27_;
				int i_28_ = 0;
				boolean bool_29_ = false;
				for (;;) {
					if (bool_29_) {
						final int i_30_ = class120_sub7.method1081((byte) 98);
						if (i_30_ == 0) {
							break;
						}
						class120_sub7.getUByte();
					} else {
						final int i_31_ = class120_sub7.method1081((byte) 98);
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
							if (i_33_ != 22 || Class75.showGroundDecorations || locType.anInt1835 != 0 || locType.anInt1821 == 1 || locType.aBoolean1853) {
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
				method2348(-102, -70, -69, 74, (byte) -47);
			}
			bool = bool_25_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("p.U(").append(i).append(',').append(i_23_).append(',').append(i_24_).append(',').append(is != null ? "{...}" : "null").append(')').toString());
		}
		return bool;
	}
}
