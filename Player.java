/* Class180_Sub5_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Player extends GameEntity {
	int anInt3732;
	int anInt3733 = 0;
	int anInt3734;
	int anInt3735;
	int anInt3736;
	int anInt3737 = 0;
	int anInt3738;
	int anInt3739;
	int anInt3740;
	private byte aByte3741;
	int anInt3742;
	boolean playerLimitReached;
	int anInt3744;
	String aString3745;
	int anInt3746;
	int anInt3747;
	static int anInt3748 = 0;
	PlayerAppearance appearance;

	final void method2339(final Buffer class120_sub7, final byte i) {
		try {
			class120_sub7.pos = 0;
			if (i != 71) {
				this.anInt3735 = 41;
			}
			int i_0_ = -1;
			final int i_1_ = class120_sub7.getUByte();
			final boolean bool = (0x4 & i_1_) != 0;
			final int i_2_ = i_1_ & 0x1;
			final int i_3_ = super.getSize();
			method2338(i + 23680, 1 + ((0x3e & i_1_) >> 3));
			aByte3741 = (byte) (i_1_ >> 6 & 0x3);
			final int[] is = new int[12];
			this.x += (getSize() - i_3_) * 64;
			this.z += (getSize() - i_3_) * 64;
			this.anInt3732 = class120_sub7.getByte();
			this.anInt3746 = class120_sub7.getByte();
			this.anInt3744 = 0;
			for (int i_4_ = 0; i_4_ < 12; i_4_++) {
				final int i_5_ = class120_sub7.getUByte();
				if (i_5_ == 0) {
					is[i_4_] = 0;
				} else {
					final int i_6_ = class120_sub7.getUByte();
					int i_7_ = (i_5_ << 8) - -i_6_;
					if (i_4_ == 0 && 65535 == i_7_) {
						i_0_ = class120_sub7.getUShort();
						this.anInt3744 = class120_sub7.getUByte();
						break;
					}
					if (-32769 >= (i_7_ ^ 0xffffffff)) {
						i_7_ = KeyboardHandler.anIntArray1506[i_7_ - 32768];
						is[i_4_] = Class191.method2512(1073741824, i_7_);
						final int i_8_ = ObjType.list(i_7_).team;
						if (i_8_ != 0) {
							this.anInt3744 = i_8_;
						}
					} else {
						is[i_4_] = Class191.method2512(-2147483648, i_7_ - 256);
					}
				}
			}
			final int[] is_9_ = new int[5];
			for (int i_10_ = 0; i_10_ < 5; i_10_++) {
				int i_11_ = class120_sub7.getUByte();
				if (i_11_ < 0 || Class159.aShortArrayArray1489[i_10_].length <= i_11_) {
					i_11_ = 0;
				}
				is_9_[i_10_] = i_11_;
			}
			this.anInt2982 = class120_sub7.getUShort();
			final long l = class120_sub7.method1124((byte) 114);
			this.aString3745 = Class136.method1977(false, l);
			this.anInt3747 = class120_sub7.getUByte();
			if (!bool) {
				this.anInt3737 = 0;
				this.anInt3733 = class120_sub7.getUByte();
				this.anInt3738 = class120_sub7.getUByte();
				if (this.anInt3738 == 255) {
					this.anInt3738 = -1;
				}
			} else {
				this.anInt3737 = class120_sub7.getUShort();
				this.anInt3733 = this.anInt3747;
				this.anInt3738 = -1;
			}
			final int i_12_ = this.anInt3735;
			this.anInt3735 = class120_sub7.getUByte();
			if (this.anInt3735 != 0) {
				final int i_13_ = this.anInt3736;
				final int i_14_ = this.anInt3740;
				final int i_15_ = this.anInt3734;
				final int i_16_ = this.anInt3742;
				final int i_17_ = this.anInt3739;
				this.anInt3740 = class120_sub7.getUShort();
				this.anInt3736 = class120_sub7.getUShort();
				this.anInt3734 = class120_sub7.getUShort();
				this.anInt3742 = class120_sub7.getUShort();
				this.anInt3739 = class120_sub7.getUByte();
				if (this.anInt3735 != i_12_ || i_14_ != this.anInt3740 || i_13_ != this.anInt3736 || this.anInt3734 != i_15_ || this.anInt3742 != i_16_ || this.anInt3739 != i_17_) {
					Class120_Sub30_Sub1.method1738(-86, this);
				}
			} else {
				Class31.method267(15, this);
			}
			if (this.appearance == null) {
				this.appearance = new PlayerAppearance();
			}
			final int i_18_ = this.appearance.npcId;
			this.appearance.method2042(i + -71, i_0_, is, this.anInt2982, is_9_, i_2_ == 1);
			if (i_0_ != i_18_) {
				this.x = this.anIntArray2958[0] * 128 - -(64 * getSize());
				this.z = 128 * this.anIntArray3040[0] + 64 * getSize();
			}
			if (this.aClass108_Sub2_2988 != null) {
				this.aClass108_Sub2_2988.method947();
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("f.R(").append(class120_sub7 != null ? "{...}" : "null").append(',').append(i).append(')').toString());
		}
	}

	@Override
	final int getMaxY() {
		int i;
		try {
			i = this.anInt3018;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, "f.MA()");
		}
		return i;
	}

	@Override
	final void method2266(final int i, final int i_19_, final int i_20_, final int i_21_, final int i_22_) {
		try {
			if (!this.aBoolean3007) {
				if (this.appearance == null) {
					return;
				}
				final Class40 class40 = this.anInt3006 == -1 || this.anInt2993 != 0 ? null : Class120_Sub30_Sub2.method1763(this.anInt3006, 120);
				final Class40 class40_23_ = (this.anInt3004 ^ 0xffffffff) != 0 && !this.playerLimitReached && (this.anInt3004 != method2336((byte) 112).anInt218 || class40 == null) ? Class120_Sub30_Sub2.method1763(this.anInt3004, 126) : null;
				final Class180_Sub7 class180_sub7 = this.appearance.method2040(this.aClass150Array2972, this.anInt3046, this.anInt3013, this.anInt3021, class40_23_, this.anInt2964, -7453, false, this.anInt2998, class40, false, this.anInt3044);
				if (class180_sub7 == null) {
					return;
				}
				method2337(class180_sub7, null);
			}
			if (this.aClass108_Sub2_2988 != null) {
				this.aClass108_Sub2_2988.method944(i, i_19_, i_21_, i_20_, i_22_);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("f.BB(").append(i).append(',').append(i_19_).append(',').append(i_20_).append(',').append(i_21_).append(',').append(i_22_).append(')').toString());
		}
	}

	static final void method2340(final Class50 class50, final Class120_Sub14_Sub8_Sub2 class120_sub14_sub8_sub2, final int i, final boolean bool, final Class50 class50_24_) {
		try {
			Class111.aClass50_1064 = class50_24_;
			Class120_Sub12_Sub23.aClass50_3305 = class50;
			Class120_Sub14_Sub3.aBoolean3463 = bool;
			final int i_25_ = Class120_Sub12_Sub23.aClass50_3305.method421(-99) - 1;
			if (i != -8659) {
				method2340(null, null, 100, false, null);
			}
			Node.anInt1143 = 256 * i_25_ + Class120_Sub12_Sub23.aClass50_3305.method441(i_25_, 1);
			Class15.aClass120_Sub14_Sub8_Sub2_99 = class120_sub14_sub8_sub2;
			Class120_Sub12_Sub29.aStringArray3363 = new String[] { null, null, null, null, Class101_Sub3.aString2285 };
			Class120_Sub12_Sub32.aStringArray3387 = new String[] { null, null, Class120_Sub14_Sub1.aString3449, null, null };
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception,
					new StringBuilder("f.U(").append(class50 != null ? "{...}" : "null").append(',').append(class120_sub14_sub8_sub2 != null ? "{...}" : "null").append(',').append(i).append(',').append(bool).append(',').append(class50_24_ != null ? "{...}" : "null").append(')').toString());
		}
	}

	@Override
	final int method2325(final boolean bool) {
		int i;
		try {
			if (bool) {
				method2266(-87, -38, 15, 11, -116);
			}
			i = this.anInt2982;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("f.I(").append(bool).append(')').toString());
		}
		return i;
	}

	static final void method2341(final int i) {
		try {
			if (i != -31352) {
				method2345(0, 111, (byte) -128);
			}
			Class43.aClass21_367.method190(false);
			Class90.aClass21_840.method190(false);
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("f.V(").append(i).append(')').toString());
		}
	}

	@Override
	final void method2265(final int i, final int i_26_, final int i_27_, final int i_28_, final int i_29_, final int i_30_, final int i_31_, final int i_32_, final long l, final int i_33_, final ParticleEngine class108_sub2) {
		try {
			if (this.appearance != null) {
				final Class40 class40 = this.anInt3006 != -1 && this.anInt2993 == 0 ? Class120_Sub30_Sub2.method1763(this.anInt3006, 122) : null;
				final Class29 class29 = method2336((byte) -109);
				final boolean bool = class29.anInt204 != 0 || class29.anInt206 != 0 || class29.anInt208 != 0 || class29.anInt209 != 0;
				final Class40 class40_34_ = (this.anInt3004 ^ 0xffffffff) != 0 && !this.playerLimitReached && (this.anInt3004 != method2336((byte) -115).anInt218 || class40 == null) ? Class120_Sub30_Sub2.method1763(this.anInt3004, 121) : null;
				Class180_Sub7 class180_sub7 = this.appearance.method2040(this.aClass150Array2972, this.anInt3046, this.anInt3013, this.anInt3021, class40_34_, this.anInt2964, -7453, bool, this.anInt2998, class40, true, this.anInt3044);
				final int i_35_ = Class48.method405((byte) 100);
				if (HDToolkit.glEnabled && Class120_Sub14_Sub13.maxMemory < 96 && i_35_ > 50) {
					SpotAnimType.method880(127);
				}
				if (LocType.modeWhat != 0 && i_35_ < 50) {
					int i_36_;
					for (i_36_ = 50 - i_35_; Class120_Sub14_Sub20.anInt3624 < i_36_; Class120_Sub14_Sub20.anInt3624++) {
						Class120_Sub12_Sub25.aByteArrayArray3318[Class120_Sub14_Sub20.anInt3624] = new byte[102400];
					}
					while (i_36_ < Class120_Sub14_Sub20.anInt3624) {
						Class120_Sub14_Sub20.anInt3624--;
						Class120_Sub12_Sub25.aByteArrayArray3318[Class120_Sub14_Sub20.anInt3624] = null;
					}
				}
				if (class180_sub7 != null) {
					this.anInt3018 = class180_sub7.getMaxY();
					if (Class120_Sub6.characterShadowsOn && (this.appearance.npcId == -1 || NpcType.list(this.appearance.npcId).aBoolean1653)) {
						final Class180_Sub7 class180_sub7_37_ = Class32.method273(0, 2, class40_34_ == null ? class40 : class40_34_, i, 1, 240, class180_sub7, class40_34_ != null ? this.anInt3046 : this.anInt2964, this.anInt3005, this.z, this.aBoolean3002, 0, 160, this.x);
						if (!HDToolkit.glEnabled) {
							class180_sub7_37_.method2265(0, i_26_, i_27_, i_28_, i_29_, i_30_, i_31_, i_32_, -1L, i_33_, null);
						} else {
							final float f = HDToolkit.method534();
							final float f_38_ = HDToolkit.method526();
							HDToolkit.method503();
							HDToolkit.method535(f, f_38_ - 150.0F);
							class180_sub7_37_.method2265(0, i_26_, i_27_, i_28_, i_29_, i_30_, i_31_, i_32_, -1L, i_33_, null);
							HDToolkit.method505();
							HDToolkit.method535(f, f_38_);
						}
					}
					if (this == Class100.selfPlayer) {
						for (int i_39_ = Class187.aClass85Array1909.length - 1; i_39_ >= 0; i_39_--) {
							final Class85 class85 = Class187.aClass85Array1909[i_39_];
							if (class85 != null && class85.anInt811 != -1) {
								if (class85.anInt809 == 1 && class85.anInt808 >= 0 && class85.anInt808 < Class120_Sub12_Sub11.npcList.length) {
									final Npc class180_sub5_sub2 = Class120_Sub12_Sub11.npcList[class85.anInt808];
									if (class180_sub5_sub2 != null) {
										final int i_40_ = -(Class100.selfPlayer.x / 32) + class180_sub5_sub2.x / 32;
										final int i_41_ = class180_sub5_sub2.z / 32 - Class100.selfPlayer.z / 32;
										method2344(i_28_, i_41_, null, i_27_, i_33_, i_26_, i, i_30_, i_40_, i_31_, class85.anInt811, (byte) -96, i_29_, 360000, class180_sub7, i_32_);
									}
								}
								if (class85.anInt809 == 2) {
									final int i_42_ = 2 + 4 * (class85.anInt804 - GameEntity.currentBaseX) - (Class100.selfPlayer.x / 32);
									final int i_43_ = 2 + 4 * (class85.anInt813 - Class181.currentBaseZ) - (Class100.selfPlayer.z / 32);
									int i_44_ = class85.anInt810 * 4;
									i_44_ *= i_44_;
									method2344(i_28_, i_43_, null, i_27_, i_33_, i_26_, i, i_30_, i_42_, i_31_, class85.anInt811, (byte) -109, i_29_, i_44_, class180_sub7, i_32_);
								}
								if (class85.anInt809 == 10 && class85.anInt808 >= 0 && Class118.playersList.length > class85.anInt808) {
									final Player class180_sub5_sub1_45_ = Class118.playersList[class85.anInt808];
									if (class180_sub5_sub1_45_ != null) {
										final int i_46_ = class180_sub5_sub1_45_.x / 32 - (Class100.selfPlayer.x / 32);
										final int i_47_ = class180_sub5_sub1_45_.z / 32 - (Class100.selfPlayer.z / 32);
										method2344(i_28_, i_47_, null, i_27_, i_33_, i_26_, i, i_30_, i_46_, i_31_, class85.anInt811, (byte) -115, i_29_, 360000, class180_sub7, i_32_);
									}
								}
							}
						}
					}
					method2327(0, class180_sub7);
					Class180_Sub7 class180_sub7_48_ = null;
					method2334(class180_sub7, i, 0);
					if (!this.playerLimitReached && this.spotAnimId != -1 && this.spotAnimFrameId != -1) {
						final SpotAnimType spotAnimType = SpotAnimType.list(this.spotAnimId);
						class180_sub7_48_ = spotAnimType.method882(this.anInt2971, this.anInt2963, this.spotAnimFrameId, (byte) 14);
						if (class180_sub7_48_ != null) {
							class180_sub7_48_.method2368(0, -this.anInt2965, 0);
							if (spotAnimType.aBoolean989) {
								if (MouseHandler.anInt1140 != 0) {
									class180_sub7_48_.method2377(MouseHandler.anInt1140);
								}
								if (Class159.anInt1488 != 0) {
									class180_sub7_48_.method2362(Class159.anInt1488);
								}
								if (Class93.anInt867 != 0) {
									class180_sub7_48_.method2368(0, Class93.anInt867, 0);
								}
							}
						}
					}
					Class180_Sub7 class180_sub7_49_ = null;
					if (!this.playerLimitReached && this.anObject3047 != null) {
						if (this.anInt3012 <= Class101_Sub2.loopCycle) {
							this.anObject3047 = null;
						}
						if (this.anInt3042 <= Class101_Sub2.loopCycle && Class101_Sub2.loopCycle < this.anInt3012) {
							if (!(this.anObject3047 instanceof Class180_Sub6)) {
								class180_sub7_49_ = (Class180_Sub7) this.anObject3047;
							} else {
								class180_sub7_49_ = (Class180_Sub7) ((Class180_Sub6) this.anObject3047).method2357(-80);
							}
							class180_sub7_49_.method2368(this.anInt3033 + -this.x, this.anInt2970 + -this.anInt3005, -this.z + this.anInt3028);
							if (this.anInt3019 == 512) {
								class180_sub7_49_.method2372();
							} else if (this.anInt3019 == 1024) {
								class180_sub7_49_.method2373();
							} else if (this.anInt3019 == 1536) {
								class180_sub7_49_.method2365();
							}
						}
					}
					if (!HDToolkit.glEnabled) {
						if (class180_sub7_48_ != null) {
							class180_sub7 = ((Class180_Sub7_Sub1) class180_sub7).method2392(class180_sub7_48_);
						}
						if (class180_sub7_49_ != null) {
							class180_sub7 = ((Class180_Sub7_Sub1) class180_sub7).method2392(class180_sub7_49_);
						}
						method2337(class180_sub7, class180_sub7_48_);
						class180_sub7.haveActions = true;
						class180_sub7.method2265(i, i_26_, i_27_, i_28_, i_29_, i_30_, i_31_, i_32_, l, i_33_, this.aClass108_Sub2_2988);
					} else {
						method2337(class180_sub7, class180_sub7_48_);
						class180_sub7.haveActions = true;
						class180_sub7.method2265(i, i_26_, i_27_, i_28_, i_29_, i_30_, i_31_, i_32_, l, i_33_, this.aClass108_Sub2_2988);
						if (class180_sub7_48_ != null) {
							if (this.aClass108_Sub2_2988 != null) {
								final Class180_Sub7_Sub2 class180_sub7_sub2 = (Class180_Sub7_Sub2) class180_sub7_48_;
								this.aClass108_Sub2_2988.method962(class180_sub7_sub2.aClass158Array3892, class180_sub7_sub2.aClass169Array3858, true, class180_sub7_sub2.anIntArray3878, class180_sub7_sub2.anIntArray3856, class180_sub7_sub2.anIntArray3845);
							}
							class180_sub7_48_.haveActions = true;
							class180_sub7_48_.method2265(i, i_26_, i_27_, i_28_, i_29_, i_30_, i_31_, i_32_, l, i_33_, this.aClass108_Sub2_2988);
						}
					}
					if (class180_sub7_49_ != null) {
						if (this.anInt3019 != 512) {
							if (this.anInt3019 == 1024) {
								class180_sub7_49_.method2373();
							} else if (this.anInt3019 == 1536) {
								class180_sub7_49_.method2372();
							}
						} else {
							class180_sub7_49_.method2365();
						}
						class180_sub7_49_.method2368(this.x - this.anInt3033, this.anInt3005 - this.anInt2970, -this.anInt3028 + this.z);
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("f.T(").append(i).append(',').append(i_26_).append(',').append(i_27_).append(',').append(i_28_).append(',').append(i_29_).append(',').append(i_30_).append(',').append(i_31_).append(',').append(i_32_).append(',')
					.append(l).append(',').append(i_33_).append(',').append(class108_sub2 != null ? "{...}" : "null").append(')').toString());
		}
	}

	@Override
	final boolean isVisible() {
		if (this.appearance == null) {
			return false;
		}
		return true;
	}

	final String method2342(final byte i) {
		String string;
		try {
			if (i != -122) {
				anInt3748 = 43;
			}
			String string_50_ = this.aString3745;
			if (Class182.aStringArray1793 != null) {
				string_50_ = new StringBuilder(Class182.aStringArray1793[aByte3741]).append(string_50_).toString();
			}
			if (Class53.aStringArray486 != null) {
				string_50_ = new StringBuilder(string_50_).append(Class53.aStringArray486[aByte3741]).toString();
			}
			string = string_50_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("f.W(").append(i).append(')').toString());
		}
		return string;
	}

	@Override
	final int getSize() {
		if (this.appearance != null && this.appearance.npcId != -1) {
			return NpcType.list(this.appearance.npcId).size;
		}
		return super.getSize();
	}

	@Override
	protected final void finalize() {
		try {
			if (this.aClass108_Sub2_2988 != null) {
				this.aClass108_Sub2_2988.method953();
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, "f.finalize()");
		}
	}

	final void method2343(final int i, final boolean bool, final int i_53_) {
		super.method2323((byte) 87, i, getSize(), i_53_, bool);
	}

	private final void method2344(final int i, final int i_54_, final ParticleEngine class108_sub2, final int i_55_, final int i_56_, final int i_57_, final int i_58_, final int i_59_, final int i_60_, final int i_61_, final int i_62_, final byte i_63_, final int i_64_, final int i_65_,
			final Class180_Sub7 class180_sub7, final int i_66_) {
		try {
			if (i_63_ <= -78) {
				final int i_67_ = i_60_ * i_60_ + i_54_ * i_54_;
				if (i_67_ >= 16 && i_67_ <= i_65_) {
					final int i_68_ = (int) (Math.atan2(i_60_, i_54_) * 325.949) & 0x7ff;
					final Class180_Sub7 class180_sub7_69_ = Class120_Sub12_Sub22.method1319(i_68_, class180_sub7, this.z, i_62_, (byte) -128, this.anInt3005, this.x);
					if (class180_sub7_69_ != null) {
						if (HDToolkit.glEnabled) {
							final float f = HDToolkit.method534();
							final float f_70_ = HDToolkit.method526();
							HDToolkit.method503();
							HDToolkit.method535(f, f_70_ - 150.0F);
							class180_sub7_69_.method2265(0, i_57_, i_55_, i, i_64_, i_59_, i_61_, i_66_, -1L, i_56_, class108_sub2);
							HDToolkit.method505();
							HDToolkit.method535(f, f_70_);
						} else {
							class180_sub7_69_.method2265(0, i_57_, i_55_, i, i_64_, i_59_, i_61_, i_66_, -1L, i_56_, class108_sub2);
						}
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, "f.S(");
		}
	}

	static final boolean method2345(final int i, final int i_71_, final byte i_72_) {
		boolean bool;
		try {
			if (!Class15.menuOpen) {
				return false;
			}
			final int i_73_ = i >> 16;
			final int i_74_ = 0xffff & i;
			if (Node.aClass189ArrayArray1150[i_73_] == null || Node.aClass189ArrayArray1150[i_73_][i_74_] == null) {
				return false;
			}
			final Class189 class189 = Node.aClass189ArrayArray1150[i_73_][i_74_];
			if (i_71_ != -1 || class189.anInt1995 != 0) {
				for (int i_75_ = 0; i_75_ < Class186.anInt1906; i_75_++) {
					if (Class120_Sub12_Sub7.anIntArray3182[i_75_] == i_71_ && class189.anInt1999 == Class120_Sub29.anIntArray2769[i_75_]
							&& (Class120_Sub29.aShortArray2777[i_75_] == 1 || Class120_Sub29.aShortArray2777[i_75_] == 1009 || Class120_Sub29.aShortArray2777[i_75_] == 34 || Class120_Sub29.aShortArray2777[i_75_] == 23 || Class120_Sub29.aShortArray2777[i_75_] == 3)) {
						return true;
					}
				}
			} else {
				for (int i_76_ = 0; i_76_ < Class186.anInt1906; i_76_++) {
					if (Class120_Sub29.aShortArray2777[i_76_] == 1 || Class120_Sub29.aShortArray2777[i_76_] == 1009 || Class120_Sub29.aShortArray2777[i_76_] == 34 || Class120_Sub29.aShortArray2777[i_76_] == 23 || Class120_Sub29.aShortArray2777[i_76_] == 3) {
						for (Class189 class189_77_ = Class74.method650(49, Class120_Sub29.anIntArray2769[i_76_]); class189_77_ != null; class189_77_ = Class120_Sub17.method1665(89, class189_77_)) {
							if (class189_77_.anInt1999 == class189.anInt1999) {
								return true;
							}
						}
					}
				}
			}
			if (i_72_ <= 103) {
				anInt3748 = 126;
			}
			bool = false;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("f.Q(").append(i).append(',').append(i_71_).append(',').append(i_72_).append(')').toString());
		}
		return bool;
	}

	Player() {
		this.anInt3734 = -1;
		this.anInt3735 = 0;
		this.anInt3738 = -1;
		this.anInt3732 = -1;
		this.anInt3739 = 255;
		this.anInt3736 = -1;
		this.anInt3744 = 0;
		aByte3741 = (byte) 0;
		this.anInt3742 = -1;
		this.anInt3740 = -1;
		this.playerLimitReached = false;
		this.anInt3747 = 0;
		this.anInt3746 = -1;
	}
}
