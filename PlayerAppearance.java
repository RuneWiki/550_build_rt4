/* Class144 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class PlayerAppearance {
	static int hintmapedgeId;
	private long aLong1365;
	private int anInt1366;
	static int anInt1367;
	static String aString1368 = "Allocated memory";
	static int frameHeight;
	int[] colors;
	boolean isFemale;
	static int anInt1372 = 0;
	static Class98 aClass98_1373;
	private long aLong1374;
	int npcId;
	private int[] anIntArray1376;
	private int[][] anIntArrayArray1377;

	public static void method2034(final int i) {
		try {
			aString1368 = null;
			aClass98_1373 = null;
			if (i != -22374) {
				method2034(-62);
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("qk.G(").append(i).append(')').toString());
		}
	}

	static final int method2035(int i, final byte i_0_, int i_1_) {
		int i_2_;
		try {
			if (i_1_ > i) {
				final int i_3_ = i;
				i = i_1_;
				i_1_ = i_3_;
			}
			if (i_0_ < 14) {
				method2035(84, (byte) -90, -27);
			}
			int i_4_;
			for (/**/; i_1_ != 0; i_1_ = i_4_) {
				i_4_ = i % i_1_;
				i = i_1_;
			}
			i_2_ = i;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("qk.B(").append(i).append(',').append(i_0_).append(',').append(i_1_).append(')').toString());
		}
		return i_2_;
	}

	final void method2036(final byte i, final int i_5_, final int i_6_) {
		try {
			final int i_7_ = Class120_Sub12_Sub3.anIntArray3148[i_5_];
			if (anIntArray1376[i_7_] != 0 && IdentityKit.list(i_6_) != null) {
				anIntArray1376[i_7_] = Class191.method2512(-2147483648, i_6_);
				if (i < -37) {
					method2038();
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("qk.L(").append(i).append(',').append(i_5_).append(',').append(i_6_).append(')').toString());
		}
	}

	final void method2037(final boolean bool) {
		this.isFemale = bool;
		method2038();
	}

	private final void method2038() {
		final long l = aLong1365;
		final long[] ls = SeekableFile.aLongArray2137;
		aLong1365 = -1L;
		aLong1365 = aLong1365 >>> 8 ^ ls[(int) (0xffL & (anInt1366 >> 8 ^ aLong1365))];
		aLong1365 = ls[(int) (0xffL & (aLong1365 ^ anInt1366))] ^ aLong1365 >>> 8;
		for (int i_8_ = 0; i_8_ < 12; i_8_++) {
			aLong1365 = aLong1365 >>> 8 ^ ls[(int) ((anIntArray1376[i_8_] >> 24 ^ aLong1365) & 0xffL)];
			aLong1365 = aLong1365 >>> 8 ^ ls[(int) ((anIntArray1376[i_8_] >> 16 ^ aLong1365) & 0xffL)];
			aLong1365 = ls[(int) (0xffL & (aLong1365 ^ anIntArray1376[i_8_] >> 8))] ^ aLong1365 >>> 8;
			aLong1365 = ls[(int) (0xffL & (aLong1365 ^ anIntArray1376[i_8_]))] ^ aLong1365 >>> 8;
		}
		for (int i_9_ = 0; i_9_ < 5; i_9_++) {
			aLong1365 = aLong1365 >>> 8 ^ ls[(int) (0xffL & (this.colors[i_9_] ^ aLong1365))];
		}
		aLong1365 = ls[(int) (0xffL & (aLong1365 ^ (!this.isFemale ? 0 : 1)))] ^ aLong1365 >>> 8;
		if (l != 0L && aLong1365 != l) {
			Class43.playerModelsCache.remove(l);
		}
	}

	static final void method2039(final int i, final byte i_10_, final int i_11_, final int i_12_, final int i_13_, final int i_14_) {
		try {
			int i_15_ = (-32 + i) * i / i_12_;
			Class118.aClass107Array1138[0].method910(i_11_, i_13_);
			if (i_15_ < 8) {
				i_15_ = 8;
			}
			Class118.aClass107Array1138[1].method910(i_11_, i + i_13_ - 16);
			final int i_16_ = i_14_ * (-32 + i - i_15_) / (-i + i_12_);
			if (!HDToolkit.glEnabled) {
				GraphicsLD.fillRect(i_11_, i_13_ - -16, 16, i + -32, Varp.anInt623);
				GraphicsLD.fillRect(i_11_, 16 + i_13_ - -i_16_, 16, i_15_, JagexSocket.anInt414);
				GraphicsLD.method2158(i_11_, i_16_ + i_13_ - -16, i_15_, Class39.anInt322);
				GraphicsLD.method2158(1 + i_11_, 16 + i_13_ + i_16_, i_15_, Class39.anInt322);
				GraphicsLD.method2160(i_11_, 16 + i_13_ - -i_16_, 16, Class39.anInt322);
				GraphicsLD.method2160(i_11_, 17 + i_13_ - -i_16_, 16, Class39.anInt322);
				GraphicsLD.method2158(15 + i_11_, i_16_ + i_13_ - -16, i_15_, Class120_Sub19.anInt2655);
				GraphicsLD.method2158(i_11_ - -14, i_16_ + 17 + i_13_, -1 + i_15_, Class120_Sub19.anInt2655);
				GraphicsLD.method2160(i_11_, i_15_ + i_16_ + 15 + i_13_, 16, Class120_Sub19.anInt2655);
				GraphicsLD.method2160(i_11_ + 1, i_16_ + i_13_ + 14 - -i_15_, 15, Class120_Sub19.anInt2655);
			} else {
				GraphicsHD.fillRect(i_11_, 16 + i_13_, 16, i - 32, Varp.anInt623);
				GraphicsHD.fillRect(i_11_, i_13_ - (-16 + -i_16_), 16, i_15_, JagexSocket.anInt414);
				GraphicsHD.method587(i_11_, i_16_ + 16 + i_13_, i_15_, Class39.anInt322);
				GraphicsHD.method587(1 + i_11_, 16 + i_13_ + i_16_, i_15_, Class39.anInt322);
				GraphicsHD.method598(i_11_, 16 + i_13_ - -i_16_, 16, Class39.anInt322);
				GraphicsHD.method598(i_11_, i_16_ + i_13_ + 17, 16, Class39.anInt322);
				GraphicsHD.method587(i_11_ - -15, i_13_ - (-16 + -i_16_), i_15_, Class120_Sub19.anInt2655);
				GraphicsHD.method587(14 + i_11_, 17 + i_13_ + i_16_, i_15_ - 1, Class120_Sub19.anInt2655);
				GraphicsHD.method598(i_11_, i_15_ + 15 + i_13_ + i_16_, 16, Class120_Sub19.anInt2655);
				GraphicsHD.method598(i_11_ + 1, i_15_ + 14 + i_13_ - -i_16_, 15, Class120_Sub19.anInt2655);
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("qk.D(").append(i).append(',').append(i_10_).append(',').append(i_11_).append(',').append(i_12_).append(',').append(i_13_).append(',').append(i_14_).append(')').toString());
		}
	}

	final AbstractModel method2040(final Class150[] class150s, final int i, final int i_17_, final int i_18_, final SeqType seqType, final int i_19_, final int i_20_, final boolean bool, final int i_21_, final SeqType class40_22_, final boolean bool_23_, final int i_24_) {
		AbstractModel class180_sub7;
		try {
			if (i_20_ != -7453) {
				method2040(null, 33, -35, -5, null, -13, -2, true, 67, null, true, -61);
			}
			if ((this.npcId ^ 0xffffffff) != 0) {
				return NpcType.list(this.npcId).method2212(i_19_, i_21_, -125, seqType, class40_22_, i_17_, class150s, i_18_, i, i_24_);
			}
			int[] is = anIntArray1376;
			long l = aLong1365;
			if (class40_22_ != null && (class40_22_.shieldDisplayed >= 0 || class40_22_.weaponDisplayed >= 0)) {
				is = new int[12];
				for (int i_25_ = 0; i_25_ < 12; i_25_++) {
					is[i_25_] = anIntArray1376[i_25_];
				}
				if (class40_22_.shieldDisplayed >= 0) {
					if ((class40_22_.shieldDisplayed ^ 0xffffffff) == -65536) {
						is[5] = 0;
						l ^= ~0xffffffffL;
					} else {
						is[5] = Class191.method2512(class40_22_.shieldDisplayed, 1073741824);
						l ^= (long) is[5] << 32;
					}
				}
				if (class40_22_.weaponDisplayed >= 0) {
					if (-65536 == (class40_22_.weaponDisplayed ^ 0xffffffff)) {
						l ^= 0xffffffffL;
						is[3] = 0;
					} else {
						is[3] = Class191.method2512(class40_22_.weaponDisplayed, 1073741824);
						l ^= is[3];
					}
				}
			}
			AbstractModel class180_sub7_26_ = (AbstractModel) Class43.playerModelsCache.get(l);
			if (class180_sub7_26_ == null) {
				boolean bool_27_ = false;
				for (int i_28_ = 0; i_28_ < 12; i_28_++) {
					final int i_29_ = is[i_28_];
					if ((i_29_ & 0x40000000) != 0) {
						if (!ObjType.list(i_29_ & 0x3fffffff).method2110((byte) 98, this.isFemale)) {
							bool_27_ = true;
						}
					} else if ((~0x7fffffff & i_29_) != 0 && !IdentityKit.list(i_29_ & 0x3fffffff).method1990((byte) -106)) {
						bool_27_ = true;
					}
				}
				if (bool_27_) {
					if (aLong1374 != -1L) {
						class180_sub7_26_ = (AbstractModel) Class43.playerModelsCache.get(aLong1374);
					}
					if (class180_sub7_26_ == null) {
						return null;
					}
				}
				if (class180_sub7_26_ == null) {
					final Class180_Sub2[] class180_sub2s = new Class180_Sub2[12];
					for (int i_30_ = 0; i_30_ < 12; i_30_++) {
						final int i_31_ = is[i_30_];
						if ((i_31_ & 0x40000000) != 0) {
							final Class180_Sub2 class180_sub2 = ObjType.list(i_31_ & 0x3fffffff).method2103(this.isFemale, false);
							if (class180_sub2 != null) {
								class180_sub2s[i_30_] = class180_sub2;
							}
						} else if ((~0x7fffffff & i_31_) != 0) {
							final Class180_Sub2 class180_sub2 = IdentityKit.list(0x3fffffff & i_31_).method1986((byte) 86);
							if (class180_sub2 != null) {
								class180_sub2s[i_30_] = class180_sub2;
							}
						}
					}
					Class29 class29 = null;
					if ((anInt1366 ^ 0xffffffff) != 0) {
						class29 = Class29.list(anInt1366);
					}
					if (class29 != null && class29.anIntArrayArray215 != null) {
						for (int i_32_ = 0; i_32_ < class29.anIntArrayArray215.length; i_32_++) {
							if (class29.anIntArrayArray215[i_32_] != null && class180_sub2s[i_32_] != null) {
								final int i_33_ = class29.anIntArrayArray215[i_32_][0];
								final int i_34_ = class29.anIntArrayArray215[i_32_][1];
								final int i_35_ = class29.anIntArrayArray215[i_32_][2];
								final int i_36_ = class29.anIntArrayArray215[i_32_][3];
								final int i_37_ = class29.anIntArrayArray215[i_32_][5];
								final int i_38_ = class29.anIntArrayArray215[i_32_][4];
								if (anIntArrayArray1377 == null) {
									anIntArrayArray1377 = new int[class29.anIntArrayArray215.length][];
								}
								if (anIntArrayArray1377[i_32_] == null) {
									final int[] is_39_ = anIntArrayArray1377[i_32_] = new int[15];
									if (i_36_ == 0 && i_38_ == 0 && i_37_ == 0) {
										is_39_[13] = -i_34_;
										is_39_[0] = is_39_[4] = is_39_[8] = 32768;
										is_39_[14] = -i_35_;
										is_39_[12] = -i_33_;
									} else {
										final int i_40_ = Rasterizer.cosineTable[i_36_] >> 1;
										final int i_41_ = Rasterizer.sineTable[i_36_] >> 1;
										final int i_42_ = Rasterizer.cosineTable[i_38_] >> 1;
										final int i_43_ = Rasterizer.sineTable[i_37_] >> 1;
										final int i_44_ = Rasterizer.sineTable[i_38_] >> 1;
										final int i_45_ = i_41_ * i_43_ - -16384 >> 15;
										final int i_46_ = Rasterizer.cosineTable[i_37_] >> 1;
										final int i_47_ = 16384 + i_46_ * i_41_ >> 15;
										is_39_[3] = 16384 + i_40_ * i_43_ >> 15;
										is_39_[1] = 16384 + -i_43_ * i_42_ - -(i_44_ * i_47_) >> 15;
										is_39_[8] = i_40_ * i_42_ - -16384 >> 15;
										is_39_[7] = 16384 + -i_43_ * -i_44_ - -(i_42_ * i_47_) >> 15;
										is_39_[6] = i_45_ * i_42_ + -i_44_ * i_46_ + 16384 >> 15;
										is_39_[4] = 16384 + i_40_ * i_46_ >> 15;
										is_39_[13] = 16384 + -i_35_ * is_39_[7] + is_39_[1] * -i_33_ - -(is_39_[4] * -i_34_) >> 15;
										is_39_[5] = -i_41_;
										is_39_[2] = i_40_ * i_44_ + 16384 >> 15;
										is_39_[0] = 16384 + i_42_ * i_46_ + i_44_ * i_45_ >> 15;
										is_39_[12] = is_39_[3] * -i_34_ + is_39_[0] * -i_33_ + -i_35_ * is_39_[6] + 16384 >> 15;
										is_39_[14] = 16384 + is_39_[8] * -i_35_ + -i_33_ * is_39_[2] + -i_34_ * is_39_[5] >> 15;
									}
									is_39_[10] = i_34_;
									is_39_[9] = i_33_;
									is_39_[11] = i_35_;
								}
								if (i_36_ != 0 || i_38_ != 0 || i_37_ != 0) {
									class180_sub2s[i_32_].method2293(i_36_, i_38_, i_37_);
								}
								if (i_33_ != 0 || i_34_ != 0 || i_35_ != 0) {
									class180_sub2s[i_32_].method2282(i_33_, i_34_, i_35_);
								}
							}
						}
					}
					final Class180_Sub2 class180_sub2 = new Class180_Sub2(class180_sub2s, class180_sub2s.length);
					for (int i_48_ = 0; i_48_ < 5; i_48_++) {
						if (Class159.aShortArrayArray1489[i_48_].length > this.colors[i_48_]) {
							class180_sub2.recolor(Class120_Sub12_Sub37.aShortArray3429[i_48_], Class159.aShortArrayArray1489[i_48_][this.colors[i_48_]]);
						}
						if (Class120_Sub30_Sub1.aShortArrayArray3668[i_48_].length > this.colors[i_48_]) {
							class180_sub2.recolor(SpotAnimType.aShortArray994[i_48_], Class120_Sub30_Sub1.aShortArrayArray3668[i_48_][this.colors[i_48_]]);
						}
					}
					class180_sub7_26_ = class180_sub2.method2300(64, 850, -30, -50, -30);
					if (HDToolkit.glEnabled) {
						((HDModel) class180_sub7_26_).method2432(false, false, true, true, false, false, true);
					}
					if (bool_23_) {
						Class43.playerModelsCache.put(class180_sub7_26_, l);
						aLong1374 = l;
					}
				}
			}
			boolean bool_49_ = false;
			boolean bool_50_ = false;
			boolean bool_51_ = false;
			boolean bool_52_ = false;
			final int i_53_ = class150s != null ? class150s.length : 0;
			for (int i_54_ = 0; i_53_ > i_54_; i_54_++) {
				if (class150s[i_54_] != null) {
					final SeqType class40_55_ = SeqType.list(class150s[i_54_].anInt1406);
					if (class40_55_.frames != null) {
						bool_49_ = true;
						GroundTile.aClass40Array2649[i_54_] = class40_55_;
						final int i_56_ = class150s[i_54_].anInt1413;
						final int i_57_ = class150s[i_54_].anInt1414;
						int i_58_ = class40_55_.frames[i_56_];
						Class120_Sub21.aClass120_Sub14_Sub18Array2667[i_54_] = FrameLoader.list(i_58_ >>> 16);
						i_58_ &= 0xffff;
						MapFunctionType.anIntArray664[i_54_] = i_58_;
						if (Class120_Sub21.aClass120_Sub14_Sub18Array2667[i_54_] != null) {
							bool_51_ |= Class120_Sub21.aClass120_Sub14_Sub18Array2667[i_54_].method1579(i_58_);
							bool_50_ |= Class120_Sub21.aClass120_Sub14_Sub18Array2667[i_54_].method1578(i_58_);
							bool_52_ |= class40_55_.aBoolean341;
						}
						if (!class40_55_.tween && !Class164.forceTween || i_57_ == -1 || class40_55_.frames.length <= i_57_) {
							Class120_Sub12_Sub26.anIntArray3325[i_54_] = 0;
							Class71.anIntArray627[i_54_] = 0;
							Class120_Sub15.aClass120_Sub14_Sub18Array2595[i_54_] = null;
							Class120_Sub14_Sub10.anIntArray3533[i_54_] = -1;
						} else {
							Class120_Sub12_Sub26.anIntArray3325[i_54_] = class40_55_.delays[i_56_];
							Class71.anIntArray627[i_54_] = class150s[i_54_].anInt1410;
							int i_59_ = class40_55_.frames[i_57_];
							Class120_Sub15.aClass120_Sub14_Sub18Array2595[i_54_] = FrameLoader.list(i_59_ >>> 16);
							i_59_ &= 0xffff;
							Class120_Sub14_Sub10.anIntArray3533[i_54_] = i_59_;
							if (Class120_Sub15.aClass120_Sub14_Sub18Array2595[i_54_] != null) {
								bool_51_ |= Class120_Sub15.aClass120_Sub14_Sub18Array2595[i_54_].method1579(i_59_);
								bool_50_ |= Class120_Sub15.aClass120_Sub14_Sub18Array2595[i_54_].method1578(i_59_);
							}
						}
					}
				}
			}
			if (!bool_49_ && class40_22_ == null && seqType == null) {
				if (bool) {
					return class180_sub7_26_.method2376(false, false, false);
				}
				return class180_sub7_26_;
			}
			int i_60_ = -1;
			int i_61_ = -1;
			FrameLoader class120_sub14_sub18 = null;
			int i_62_ = 0;
			FrameLoader class120_sub14_sub18_63_ = null;
			if (class40_22_ != null) {
				i_60_ = class40_22_.frames[i_19_];
				final int i_64_ = i_60_ >>> 16;
				i_60_ &= 0xffff;
				class120_sub14_sub18 = FrameLoader.list(i_64_);
				if (class120_sub14_sub18 != null) {
					bool_51_ |= class120_sub14_sub18.method1579(i_60_);
					bool_50_ |= class120_sub14_sub18.method1578(i_60_);
					bool_52_ |= class40_22_.aBoolean341;
				}
				if ((class40_22_.tween || Class164.forceTween) && i_17_ != -1 && i_17_ < class40_22_.frames.length) {
					i_61_ = class40_22_.frames[i_17_];
					final int i_65_ = i_61_ >>> 16;
					i_61_ &= 0xffff;
					i_62_ = class40_22_.delays[i_19_];
					if (i_65_ != i_64_) {
						class120_sub14_sub18_63_ = FrameLoader.list(i_61_ >>> 16);
					} else {
						class120_sub14_sub18_63_ = class120_sub14_sub18;
					}
					if (class120_sub14_sub18_63_ != null) {
						bool_51_ |= class120_sub14_sub18_63_.method1579(i_61_);
						bool_50_ |= class120_sub14_sub18_63_.method1578(i_61_);
					}
				}
			}
			int i_66_ = -1;
			int i_67_ = 0;
			int i_68_ = -1;
			FrameLoader class120_sub14_sub18_69_ = null;
			FrameLoader class120_sub14_sub18_70_ = null;
			if (seqType != null) {
				i_68_ = seqType.frames[i];
				final int i_71_ = i_68_ >>> 16;
				class120_sub14_sub18_70_ = FrameLoader.list(i_71_);
				i_68_ &= 0xffff;
				if (class120_sub14_sub18_70_ != null) {
					bool_51_ |= class120_sub14_sub18_70_.method1579(i_68_);
					bool_50_ |= class120_sub14_sub18_70_.method1578(i_68_);
					bool_52_ |= seqType.aBoolean341;
				}
				if ((seqType.tween || Class164.forceTween) && (i_18_ ^ 0xffffffff) != 0 && i_18_ < seqType.frames.length) {
					i_67_ = seqType.delays[i];
					i_66_ = seqType.frames[i_18_];
					final int i_72_ = i_66_ >>> 16;
					i_66_ &= 0xffff;
					if (i_72_ != i_71_) {
						class120_sub14_sub18_69_ = FrameLoader.list(i_66_ >>> 16);
					} else {
						class120_sub14_sub18_69_ = class120_sub14_sub18_70_;
					}
					if (class120_sub14_sub18_69_ != null) {
						bool_51_ |= class120_sub14_sub18_69_.method1579(i_66_);
						bool_50_ |= class120_sub14_sub18_69_.method1578(i_66_);
					}
				}
			}
			final AbstractModel class180_sub7_73_ = class180_sub7_26_.method2376(!bool_50_, !bool_51_, !bool_52_);
			int i_74_ = 0;
			int i_75_ = 1;
			while (i_53_ > i_74_) {
				if (Class120_Sub21.aClass120_Sub14_Sub18Array2667[i_74_] != null) {
					class180_sub7_73_.method2384(Class120_Sub21.aClass120_Sub14_Sub18Array2667[i_74_], MapFunctionType.anIntArray664[i_74_], Class120_Sub15.aClass120_Sub14_Sub18Array2595[i_74_], Class120_Sub14_Sub10.anIntArray3533[i_74_], -1 + Class71.anIntArray627[i_74_],
							Class120_Sub12_Sub26.anIntArray3325[i_74_], i_75_, GroundTile.aClass40Array2649[i_74_].aBoolean341, anIntArrayArray1377[i_74_]);
				}
				i_74_++;
				i_75_ <<= 1;
			}
			if (class120_sub14_sub18 != null && class120_sub14_sub18_70_ != null) {
				class180_sub7_73_.method2361(class120_sub14_sub18, i_60_, class120_sub14_sub18_63_, i_61_, -1 + i_24_, i_62_, class120_sub14_sub18_70_, i_68_, class120_sub14_sub18_69_, i_66_, -1 + i_21_, i_67_, class40_22_.aBooleanArray327, seqType.aBoolean341 | class40_22_.aBoolean341);
			} else if (class120_sub14_sub18 == null) {
				if (class120_sub14_sub18_70_ != null) {
					class180_sub7_73_.method2380(class120_sub14_sub18_70_, i_68_, class120_sub14_sub18_69_, i_66_, -1 + i_21_, i_67_, seqType.aBoolean341);
				}
			} else {
				class180_sub7_73_.method2380(class120_sub14_sub18, i_60_, class120_sub14_sub18_63_, i_61_, -1 + i_24_, i_62_, class40_22_.aBoolean341);
			}
			for (i_74_ = 0; i_74_ < i_53_; i_74_++) {
				Class120_Sub21.aClass120_Sub14_Sub18Array2667[i_74_] = null;
				Class120_Sub15.aClass120_Sub14_Sub18Array2595[i_74_] = null;
				GroundTile.aClass40Array2649[i_74_] = null;
			}
			class180_sub7 = class180_sub7_73_;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("qk.M(").append(class150s != null ? "{...}" : "null").append(',').append(i).append(',').append(i_17_).append(',').append(i_18_).append(',').append(seqType != null ? "{...}" : "null").append(',').append(i_19_)
					.append(',').append(i_20_).append(',').append(bool).append(',').append(i_21_).append(',').append(class40_22_ != null ? "{...}" : "null").append(',').append(bool_23_).append(',').append(i_24_).append(')').toString());
		}
		return class180_sub7;
	}

	final AbstractModel method2041(final int i, final SeqType seqType, final int i_76_, final int i_77_, final int i_78_, final int i_79_, final int i_80_, final int i_81_) {
		AbstractModel class180_sub7;
		try {
			final long l = (long) i_77_ << 32 | i_76_ << 16 | i_80_;
			AbstractModel class180_sub7_82_ = (AbstractModel) Class90.playerHeadModelsCache.get(l);
			if (class180_sub7_82_ == null) {
				int i_83_ = 0;
				final Class180_Sub2[] class180_sub2s = new Class180_Sub2[3];
				if (!IdentityKit.list(i_80_).method1993(-32390) || !IdentityKit.list(i_76_).method1993(i + -32384) || !IdentityKit.list(i_77_).method1993(i ^ 0x7e80)) {
					return null;
				}
				Class180_Sub2 class180_sub2 = IdentityKit.list(i_80_).method1985();
				if (class180_sub2 != null) {
					class180_sub2s[i_83_++] = class180_sub2;
				}
				class180_sub2 = IdentityKit.list(i_76_).method1985();
				if (class180_sub2 != null) {
					class180_sub2s[i_83_++] = class180_sub2;
				}
				class180_sub2 = IdentityKit.list(i_77_).method1985();
				if (class180_sub2 != null) {
					class180_sub2s[i_83_++] = class180_sub2;
				}
				class180_sub2 = new Class180_Sub2(class180_sub2s, i_83_);
				for (int i_84_ = 0; i_84_ < 5; i_84_++) {
					if (Class159.aShortArrayArray1489[i_84_].length > this.colors[i_84_]) {
						class180_sub2.recolor(Class120_Sub12_Sub37.aShortArray3429[i_84_], Class159.aShortArrayArray1489[i_84_][this.colors[i_84_]]);
					}
					if (Class120_Sub30_Sub1.aShortArrayArray3668[i_84_].length > this.colors[i_84_]) {
						class180_sub2.recolor(SpotAnimType.aShortArray994[i_84_], Class120_Sub30_Sub1.aShortArrayArray3668[i_84_][this.colors[i_84_]]);
					}
				}
				class180_sub7_82_ = class180_sub2.method2300(64, 768, -50, -10, -50);
				Class90.playerHeadModelsCache.put(class180_sub7_82_, l);
			}
			if (seqType != null) {
				class180_sub7_82_ = seqType.method323(false, i_79_, i_81_, class180_sub7_82_, i_78_);
			}
			if (i != -6) {
				return null;
			}
			class180_sub7 = class180_sub7_82_;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("qk.F(").append(i).append(',').append(seqType != null ? "{...}" : "null").append(',').append(i_76_).append(',').append(i_77_).append(',').append(i_78_).append(',').append(i_79_).append(',').append(i_80_)
					.append(',').append(i_81_).append(')').toString());
		}
		return class180_sub7;
	}

	final void method2042(final int i_85_, int[] is, final int i_86_, final int[] is_87_, final boolean bool) {
		if (anInt1366 != i_86_) {
			anInt1366 = i_86_;
			anIntArrayArray1377 = null;
		}
		if (is == null) {
			is = new int[12];
			for (int i_88_ = 0; i_88_ < 8; i_88_++) {
				for (int i_89_ = 0; Class7.anInt61 > i_89_; i_89_++) {
					final IdentityKit identityKit = IdentityKit.list(i_89_);
					if (identityKit != null && !identityKit.noInterface && ((bool ? Class120_Sub12_Sub27.anIntArray3349[i_88_] : ObjType.anIntArray1520[i_88_]) ^ 0xffffffff) == (identityKit.partId ^ 0xffffffff)) {
						is[Class120_Sub12_Sub3.anIntArray3148[i_88_]] = Class191.method2512(-2147483648, i_89_);
						break;
					}
				}
			}
		}
		anIntArray1376 = is;
		this.colors = is_87_;
		this.isFemale = bool;
		this.npcId = i_85_;
		method2038();
	}

	final int method2043() {
		if (this.npcId != -1) {
			return NpcType.list(this.npcId).id + 305419896;
		}
		return (anIntArray1376[8] << 10) + (this.colors[0] << 25) + (this.colors[4] << 20) + (anIntArray1376[0] << 15) + (anIntArray1376[11] << 5) - -anIntArray1376[1];
	}

	final AbstractModel method2044(final SeqType seqType, final int i, final int i_91_, final int i_92_) {
		if (this.npcId != -1) {
			return NpcType.list(this.npcId).method2210(i_91_, seqType, (byte) -12, i, i_92_);
		}
		AbstractModel class180_sub7_94_ = (AbstractModel) Class90.playerHeadModelsCache.get(aLong1365);
		if (class180_sub7_94_ == null) {
			boolean bool = false;
			for (int i_95_ = 0; i_95_ < 12; i_95_++) {
				final int i_96_ = anIntArray1376[i_95_];
				if ((i_96_ & 0x40000000) == 0) {
					if ((~0x7fffffff & i_96_) != 0 && !IdentityKit.list(i_96_ & 0x3fffffff).method1993(-32390)) {
						bool = true;
					}
				} else if (!ObjType.list(0x3fffffff & i_96_).method2116(this.isFemale, 0)) {
					bool = true;
				}
			}
			if (bool) {
				return null;
			}
			final Class180_Sub2[] class180_sub2s = new Class180_Sub2[12];
			int i_97_ = 0;
			for (int i_98_ = 0; i_98_ < 12; i_98_++) {
				final int i_99_ = anIntArray1376[i_98_];
				if ((0x40000000 & i_99_) != 0) {
					final Class180_Sub2 class180_sub2 = ObjType.list(i_99_ & 0x3fffffff).method2107(-20152, this.isFemale);
					if (class180_sub2 != null) {
						class180_sub2s[i_97_++] = class180_sub2;
					}
				} else if ((~0x7fffffff & i_99_) != 0) {
					final Class180_Sub2 class180_sub2 = IdentityKit.list(0x3fffffff & i_99_).method1985();
					if (class180_sub2 != null) {
						class180_sub2s[i_97_++] = class180_sub2;
					}
				}
			}
			final Class180_Sub2 class180_sub2 = new Class180_Sub2(class180_sub2s, i_97_);
			for (int i_100_ = 0; i_100_ < 5; i_100_++) {
				if (Class159.aShortArrayArray1489[i_100_].length > this.colors[i_100_]) {
					class180_sub2.recolor(Class120_Sub12_Sub37.aShortArray3429[i_100_], Class159.aShortArrayArray1489[i_100_][this.colors[i_100_]]);
				}
				if (this.colors[i_100_] < Class120_Sub30_Sub1.aShortArrayArray3668[i_100_].length) {
					class180_sub2.recolor(SpotAnimType.aShortArray994[i_100_], Class120_Sub30_Sub1.aShortArrayArray3668[i_100_][this.colors[i_100_]]);
				}
			}
			class180_sub7_94_ = class180_sub2.method2300(64, 768, -50, -10, -50);
			Class90.playerHeadModelsCache.put(class180_sub7_94_, aLong1365);
		}
		if (seqType != null) {
			class180_sub7_94_ = seqType.method323(false, i, i_91_, class180_sub7_94_, i_92_);
		}
		return class180_sub7_94_;
	}

	final void method2045(final int i, final byte i_101_, final int i_102_) {
		try {
			this.colors[i] = i_102_;
			if (i_101_ == -103) {
				method2038();
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("qk.E(").append(i).append(',').append(i_101_).append(',').append(i_102_).append(')').toString());
		}
	}

	public PlayerAppearance() {
		/* empty */
	}
}
