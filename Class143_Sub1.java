/* Class143_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class143_Sub1 extends Class143 implements Interface5 {
	private int anInt2190;
	private boolean aBoolean2191 = false;
	static String aString2192 = "Your ignore list is full. Max of 100 users.";
	private Class35 aClass35_2193;
	private final Class50 aClass50_2194;
	static int[][][] anIntArrayArrayArray2195 = new int[2][][];
	private Class50 aClass50_2196;
	static int anInt2197;
	private Class35 aClass35_2198;

	static final boolean method2021() {
		if (HDToolkit.glEnabled) {
			return true;
		}
		return Class61.aBoolean566;
	}

	final void method2022(final boolean bool, final int i) {
		aBoolean2191 = bool;
		method2025(-126);
	}

	@Override
	public final int method24(final int i, final boolean bool) {
		int i_1_;
		try {
			if (bool) {
				return -41;
			}
			i_1_ = method8(i, (byte) -17).aByte1102 & 0xff;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("c.I(").append(i).append(',').append(bool).append(')').toString());
		}
		return i_1_;
	}

	@Override
	public final boolean method16(final int i, final byte i_2_) {
		boolean bool;
		try {
			if (i_2_ != 26) {
				return true;
			}
			bool = method8(i, (byte) 126).aBoolean1096;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("c.V(").append(i).append(',').append(i_2_).append(')').toString());
		}
		return bool;
	}

	final void method2023(final int i, final int i_3_) {
		try {
			if (i_3_ > -2) {
				anInt2190 = -23;
			}
			for (Class120_Sub14_Sub17 class120_sub14_sub17 = (Class120_Sub14_Sub17) aClass35_2198.method299(40); class120_sub14_sub17 != null; class120_sub14_sub17 = (Class120_Sub14_Sub17) aClass35_2198.method303(-91)) {
				if (class120_sub14_sub17.aBoolean3604) {
					class120_sub14_sub17.method1573(i);
					class120_sub14_sub17.aBoolean3604 = false;
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("c.N(").append(i).append(',').append(i_3_).append(')').toString());
		}
	}

	@Override
	public final boolean method15(final int i, final int i_4_) {
		boolean bool;
		try {
			if (i_4_ != 0) {
				return true;
			}
			bool = !method8(i, (byte) 124).aBoolean1108;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("c.CA(").append(i).append(',').append(i_4_).append(')').toString());
		}
		return bool;
	}

	@Override
	public final int method29(final int i, final int i_5_) {
		int i_6_;
		try {
			i_6_ = method8(i, (byte) -77).aByte1104 & 0xff;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("c.T(").append(i).append(',').append(i_5_).append(')').toString());
		}
		return i_6_;
	}

	@Override
	public final int[] method23(final int i, final byte i_7_) {
		int[] is;
		try {
			final Class120_Sub14_Sub17 class120_sub14_sub17 = method2024(i, 25248);
			if (class120_sub14_sub17 == null) {
				return null;
			}
			is = class120_sub14_sub17.method1570(this, aClass50_2196, aBoolean2191 || method8(i, (byte) 108).aBoolean1100);
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("c.E(").append(i).append(',').append(i_7_).append(')').toString());
		}
		return is;
	}

	private final Class120_Sub14_Sub17 method2024(final int i, final int i_8_) {
		Class120_Sub14_Sub17 class120_sub14_sub17;
		try {
			if (i_8_ != 25248) {
				return null;
			}
			Class120_Sub14_Sub17 class120_sub14_sub17_9_ = (Class120_Sub14_Sub17) aClass35_2198.method302(17301, i);
			if (class120_sub14_sub17_9_ != null) {
				return class120_sub14_sub17_9_;
			}
			final byte[] is = aClass50_2194.method442(i, (byte) 127, 0);
			if (is == null) {
				return null;
			}
			class120_sub14_sub17_9_ = new Class120_Sub14_Sub17(new Buffer(is));
			aClass35_2198.method301(i, 45, class120_sub14_sub17_9_);
			class120_sub14_sub17 = class120_sub14_sub17_9_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("c.G(").append(i).append(',').append(i_8_).append(')').toString());
		}
		return class120_sub14_sub17;
	}

	@Override
	public final LDSprite method26(final boolean bool, final float f, final boolean bool_10_, final int i, final int i_11_) {
		LDTransparentSprite class120_sub14_sub19_sub2_sub1;
		try {
			final Class120_Sub14_Sub17 class120_sub14_sub17 = method2024(i_11_, 25248);
			if (class120_sub14_sub17 == null || !class120_sub14_sub17.method1575(this, aClass50_2196)) {
				return null;
			}
			if (bool_10_) {
				return null;
			}
			if (!bool) {
				return class120_sub14_sub17.aClass120_Sub14_Sub13_3602.method1525(f, -37, i, this, aClass50_2196, i, false);
			}
			class120_sub14_sub19_sub2_sub1 = class120_sub14_sub17.aClass120_Sub14_Sub13_3602.method1530(i, this, aClass50_2196, -127, f, i, false);
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("c.J(").append(bool).append(',').append(f).append(',').append(bool_10_).append(',').append(i).append(',').append(i_11_).append(')').toString());
		}
		return class120_sub14_sub19_sub2_sub1;
	}

	@Override
	public final boolean method27(final int i, final int i_12_) {
		boolean bool;
		try {
			if (aBoolean2191 || method8(i_12_, (byte) -77).aBoolean1100) {
				return true;
			}
			if (i != 0) {
				aString2192 = null;
			}
			bool = false;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("c.R(").append(i).append(',').append(i_12_).append(')').toString());
		}
		return bool;
	}

	final void method2025(final int i) {
		try {
			aClass35_2198.method306((byte) 123);
			if (aClass35_2193 != null) {
				aClass35_2193.method306((byte) 120);
			}
			Class120_Sub14_Sub17.anIntArray3596 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("c.AA(").append(i).append(')').toString());
		}
	}

	static final Object method2026(final byte[] is, final boolean bool, final int i) {
		byte[] is_13_;
		try {
			if (is == null) {
				return null;
			}
			do {
				if (is.length > i && !Class120_Sub8.aBoolean2484) {
					Class66 class66;
					try {
						final Class66 class66_14_ = (Class66) Class.forName("Class66_Sub1").newInstance();
						class66_14_.method581(0, is);
						class66 = class66_14_;
					} catch (final Throwable throwable) {
						Class120_Sub8.aBoolean2484 = true;
						break;
					}
					return class66;
				}
			} while (false);
			if (!bool) {
				return is;
			}
			is_13_ = Class183.method2448(is, 112);
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("c.F(").append(is != null ? "{...}" : "null").append(',').append(bool).append(',').append(i).append(')').toString());
		}
		return is_13_;
	}

	@Override
	public final int method20(final int i, final int i_15_) {
		int i_16_;
		try {
			if (i_15_ != 65535) {
				return -126;
			}
			i_16_ = method8(i, (byte) 118).aShort1106 & 0xffff;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("c.HA(").append(i).append(',').append(i_15_).append(')').toString());
		}
		return i_16_;
	}

	@Override
	public final boolean method22(final int i, final boolean bool) {
		boolean bool_17_;
		try {
			if (!bool) {
				anIntArrayArrayArray2195 = null;
			}
			final Class120_Sub14_Sub17 class120_sub14_sub17 = method2024(i, 25248);
			if (class120_sub14_sub17 == null) {
				return false;
			}
			bool_17_ = class120_sub14_sub17.method1575(this, aClass50_2196);
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("c.H(").append(i).append(',').append(bool).append(')').toString());
		}
		return bool_17_;
	}

	static final void method2027(final int i, final int i_18_, final int i_19_, final int i_20_, final int i_21_, final int i_22_, final int i_23_) {
		try {
			final Class85[] class85s = Class187.aClass85Array1909;
			if (i_18_ != -8967) {
				anIntArrayArrayArray2195 = null;
			}
			Class85[] class85s_25_;
			final int i_24_ = (class85s_25_ = class85s).length;
			for (int i_26_ = 0; i_26_ < i_24_; i_26_++) {
				final Class85 class85 = class85s_25_[i_26_];
				if (class85 != null && class85.anInt809 == 2) {
					Class137.method1982((byte) 51, i_20_ >> 1, 2 * class85.anInt814, i_21_, (class85.anInt804 + -GameEntity.currentBaseX << 7) + class85.anInt812, class85.anInt815 + (-Class181.currentBaseZ + class85.anInt813 << 7), i_19_, i_22_ >> 1);
					if ((Class120_Sub12_Sub38.anInt3434 ^ 0xffffffff) < 0 && Class101_Sub2.loopCycle % 20 < 10) {
						Class180_Sub6.aClass120_Sub14_Sub19Array3073[class85.anInt805].method1587(-12 + i_23_ + Class120_Sub12_Sub38.anInt3434, Class120_Sub15.anInt2588 + i - 28);
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("c.S(").append(i).append(',').append(i_18_).append(',').append(i_19_).append(',').append(i_20_).append(',').append(i_21_).append(',').append(i_22_).append(',').append(i_23_).append(')').toString());
		}
	}

	final void method2028(final int i, final byte i_27_) {
		try {
			if (i_27_ == -111) {
				anInt2190 = i;
				aClass35_2198 = new Class35(anInt2190);
				if (!HDToolkit.glEnabled) {
					aClass35_2193 = null;
				} else {
					aClass35_2193 = new Class35(anInt2190);
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("c.M(").append(i).append(',').append(i_27_).append(')').toString());
		}
	}

	@Override
	public final boolean method17(final int i, final int i_28_) {
		boolean bool;
		try {
			if (i != -1) {
				aBoolean2191 = true;
			}
			bool = method8(i_28_, (byte) 115).aBoolean1101;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("c.Q(").append(i).append(',').append(i_28_).append(')').toString());
		}
		return bool;
	}

	Class143_Sub1(final Class50 class50, final Class50 class50_29_, final Class50 class50_30_, final int i, final boolean bool) {
		super(class50_29_, class50, class50_30_);
		anInt2190 = 50;
		anInt2190 = i;
		aClass50_2196 = class50_30_;
		aClass50_2194 = class50;
		aBoolean2191 = bool;
		aClass35_2198 = new Class35(anInt2190);
		if (!HDToolkit.glEnabled) {
			aClass35_2193 = null;
		} else {
			aClass35_2193 = new Class35(anInt2190);
		}
	}

	@Override
	public final void method28(final byte i, final int i_31_, final int i_32_) {
		try {
			Class120_Sub14_Sub13.method1532(method8(i_32_, (byte) -37).aByte1103 & 0xff, 0xff & method8(i_32_, (byte) 117).aByte1104, -107);
			if (i >= -86) {
				method29(51, 122);
			}
			boolean bool = false;
			final Class120_Sub14_Sub17 class120_sub14_sub17 = method2024(i_32_, 25248);
			if (class120_sub14_sub17 != null) {
				bool = class120_sub14_sub17.method1576(this, aClass50_2196, i_31_);
			}
			if (!bool) {
				final Class120_Sub14_Sub15 class120_sub14_sub15 = method2030(-926489461, i_32_);
				class120_sub14_sub15.method1559(1);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("c.K(").append(i).append(',').append(i_31_).append(',').append(i_32_).append(')').toString());
		}
	}

	@Override
	public final int method21(final byte i, final int i_33_) {
		int i_34_;
		try {
			if (i != -119) {
				return -42;
			}
			i_34_ = method8(i_33_, (byte) 113).aByte1105 & 0xff;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("c.BA(").append(i).append(',').append(i_33_).append(')').toString());
		}
		return i_34_;
	}

	static final int method2029(final Class50 class50, final Class50 class50_35_, final int i) {
		int i_36_;
		try {
			int i_37_ = 0;
			if (class50_35_.method429(Class32.anInt270, 105)) {
				i_37_++;
			}
			if (class50_35_.method429(Class191.anInt2115, 122)) {
				i_37_++;
			}
			if (class50_35_.method429(Class110.anInt1051, 117)) {
				i_37_++;
			}
			if (class50.method429(Class32.anInt270, 68)) {
				i_37_++;
			}
			if (class50.method429(Class191.anInt2115, i + 23291)) {
				i_37_++;
			}
			if (i != -23185) {
				return -119;
			}
			if (class50.method429(Class110.anInt1051, i + 23247)) {
				i_37_++;
			}
			i_36_ = i_37_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("c.P(").append(class50 != null ? "{...}" : "null").append(',').append(class50_35_ != null ? "{...}" : "null").append(',').append(i).append(')').toString());
		}
		return i_36_;
	}

	@Override
	final Class120_Sub14_Sub13 method2016(final int i, final boolean bool) {
		Class120_Sub14_Sub13 class120_sub14_sub13;
		try {
			if (!bool) {
				return null;
			}
			final Class120_Sub14_Sub17 class120_sub14_sub17 = method2024(i, 25248);
			class120_sub14_sub13 = class120_sub14_sub17 == null ? null : class120_sub14_sub17.aClass120_Sub14_Sub13_3602;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("c.O(").append(i).append(',').append(bool).append(')').toString());
		}
		return class120_sub14_sub13;
	}

	private final Class120_Sub14_Sub15 method2030(final int i, final int i_38_) {
		Class120_Sub14_Sub15 class120_sub14_sub15;
		try {
			Class120_Sub14_Sub15 class120_sub14_sub15_39_ = (Class120_Sub14_Sub15) aClass35_2193.method302(17301, i_38_);
			if (class120_sub14_sub15_39_ != null) {
				return class120_sub14_sub15_39_;
			}
			class120_sub14_sub15_39_ = new Class120_Sub14_Sub15(method8(i_38_, (byte) -69).aShort1106 & 0xffff);
			aClass35_2193.method301(i_38_, 103, class120_sub14_sub15_39_);
			if (i != -926489461) {
				return null;
			}
			class120_sub14_sub15 = class120_sub14_sub15_39_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("c.W(").append(i).append(',').append(i_38_).append(')').toString());
		}
		return class120_sub14_sub15;
	}

	@Override
	public final void method25(final int i, final int i_40_) {
		try {
			method28((byte) -101, aBoolean2191 || method8(i_40_, (byte) 106).aBoolean1100 ? 64 : 128, i_40_);
			if (i != 64) {
				aClass50_2196 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("c.U(").append(i).append(',').append(i_40_).append(')').toString());
		}
	}

	public static void method2031(final byte i) {
		try {
			anIntArrayArrayArray2195 = null;
			aString2192 = null;
			if (i < 61) {
				anInt2197 = -77;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("c.D(").append(i).append(')').toString());
		}
	}

	@Override
	public final int[] method19(final float f, final int i, final int i_41_) {
		int[] is;
		try {
			final Class120_Sub14_Sub17 class120_sub14_sub17 = method2024(i_41_, 25248);
			if (i != 274092135) {
				aClass50_2196 = null;
			}
			if (class120_sub14_sub17 == null) {
				return null;
			}
			class120_sub14_sub17.aBoolean3604 = true;
			is = class120_sub14_sub17.method1572(this, aClass50_2196, f, aBoolean2191 || method8(i_41_, (byte) 110).aBoolean1100);
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("c.L(").append(f).append(',').append(i).append(',').append(i_41_).append(')').toString());
		}
		return is;
	}

	@Override
	public final int method18(final int i, final int i_42_) {
		int i_43_;
		try {
			if (i_42_ != 255) {
				aString2192 = null;
			}
			i_43_ = method8(i, (byte) -40).aByte1103 & 0xff;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("c.GA(").append(i).append(',').append(i_42_).append(')').toString());
		}
		return i_43_;
	}

	static final void method2032(final Class189 class189, final int i) {
		try {
			final int i_44_ = class189.anInt1975;
			if (i_44_ == 324) {
				if ((Class120_Sub12_Sub15.anInt3241 ^ 0xffffffff) == 0) {
					Class169.anInt1643 = class189.anInt2012;
					Class120_Sub12_Sub15.anInt3241 = class189.anInt2055;
				}
				if (!Class26.aClass144_159.aBoolean1371) {
					class189.anInt2055 = Class169.anInt1643;
				} else {
					class189.anInt2055 = Class120_Sub12_Sub15.anInt3241;
				}
			} else {
				if (i <= 21) {
					anInt2197 = -61;
				}
				if (i_44_ == 325) {
					if (Class120_Sub12_Sub15.anInt3241 == -1) {
						Class120_Sub12_Sub15.anInt3241 = class189.anInt2055;
						Class169.anInt1643 = class189.anInt2012;
					}
					if (!Class26.aClass144_159.aBoolean1371) {
						class189.anInt2055 = Class120_Sub12_Sub15.anInt3241;
					} else {
						class189.anInt2055 = Class169.anInt1643;
					}
				} else if (i_44_ == 327) {
					class189.anInt2047 = 150;
					class189.anInt2091 = (int) (Math.sin(Class101_Sub2.loopCycle / 40.0) * 256.0) & 0x7ff;
					class189.anInt1961 = -1;
					class189.anInt2031 = 5;
				} else if (i_44_ == 328) {
					if (Class100.selfPlayer.aString3745 == null) {
						class189.anInt1961 = 0;
					} else {
						class189.anInt2047 = 150;
						class189.anInt2091 = 0x7ff & (int) (256.0 * Math.sin(Class101_Sub2.loopCycle / 40.0));
						class189.anInt2031 = 5;
						class189.anInt1961 = 2047 + ((int) Class70.method636(-121, Class100.selfPlayer.aString3745) << 11);
						class189.anInt1946 = Class100.selfPlayer.anInt3046;
						class189.anInt1945 = Class100.selfPlayer.anInt3004;
						class189.anInt2098 = Class100.selfPlayer.anInt3021;
						class189.anInt1965 = 0;
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("c.FA(").append(class189 != null ? "{...}" : "null").append(',').append(i).append(')').toString());
		}
	}
}
