/* Class184 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class LocType {
	private short[] aShortArray1815;
	private int anInt1816;
	private int[] anIntArray1817;
	static Class189 aClass189_1818 = null;
	int anInt1819;
	private byte aByte1820;
	int anInt1821;
	boolean aBoolean1822;
	boolean aBoolean1823;
	private int anInt1824;
	int cursor1op = -1;
	int anInt1826;
	int anInt1827;
	private short[] aShortArray1828;
	private int[] anIntArray1829;
	private boolean aBoolean1830;
	int anInt1831;
	int anInt1832;
	int anInt1833;
	static int[] anIntArray1834 = new int[50];
	int anInt1835;
	int anInt1836;
	private short[] aShortArray1837;
	private int anInt1838;
	int anInt1839;
	int anInt1840;
	int anInt1841;
	int cursor2;
	private int anInt1843;
	boolean aBoolean1844;
	int anInt1845;
	private int anInt1846;
	int cursor2op;
	String name;
	String[] actions;
	private int[] anIntArray1850;
	boolean aBoolean1851;
	int[] childrenIDs;
	boolean aBoolean1853;
	private int anInt1854;
	private int anInt1855;
	private int anInt1856;
	int anInt1857;
	boolean aBoolean1858;
	private int anInt1859;
	private short[] aShortArray1860;
	static int modeWhat = 0;
	boolean aBoolean1862;
	boolean aBoolean1863;
	boolean aBoolean1864;
	private Class75 aClass75_1865;
	int anInt1866;
	private short aShort1867;
	private boolean aBoolean1868;
	int anInt1869;
	int[] anIntArray1870;
	private byte[] aByteArray1871;
	boolean aBoolean1872;
	private int anInt1873;
	int cursor1;
	private int anInt1875;
	boolean aBoolean1876;
	int myId;
	boolean aBoolean1878;
	int anInt1879;
	boolean aBoolean1880;
	int[] anIntArray1881;

	static final void method2450(final int i) {
		try {
			Class173.aClass120_Sub14_Sub19_1725 = null;
			Class120_Sub14_Sub18.aClass120_Sub14_Sub19_3611 = null;
			RuntimeException_Sub1.aClass120_Sub14_Sub19_2144 = null;
			Class157.aClass120_Sub14_Sub19_1472 = null;
			Class120_Sub12_Sub10.aClass120_Sub14_Sub19_3202 = null;
			if (i != 0) {
				method2458();
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("vh.N(").append(i).append(')').toString());
		}
	}

	static final void method2451(final byte i) {
		try {
			Class120_Sub12_Sub37.aClass21_3427.method186((byte) 86);
			if (i != 22) {
				method2451((byte) 92);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("vh.L(").append(i).append(')').toString());
		}
	}

	final boolean method2452(final boolean bool) {
		boolean bool_0_;
		try {
			if (anIntArray1850 == null) {
				return true;
			}
			boolean bool_1_ = bool;
			int[] is;
			final int i = (is = anIntArray1850).length;
			for (int i_2_ = 0; i_2_ < i; i_2_++) {
				final int i_3_ = is[i_2_];
				bool_1_ &= Class120_Sub12_Sub36.aClass50_3418.method440(0xffff & i_3_, true, 0);
			}
			bool_0_ = bool_1_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("vh.F(").append(bool).append(')').toString());
		}
		return bool_0_;
	}

	final Class88 method2453(final int i, final boolean bool, final int i_4_, final int i_5_, final int[][] is, final int[][] is_6_, final boolean bool_7_, final int i_8_, final int i_9_, final int i_10_, final Class107_Sub1 class107_sub1) {
		Class88 class88;
		try {
			if (i_10_ > -112) {
				method2450(62);
			}
			if (!HDToolkit.glEnabled) {
				long l;
				if (anIntArray1817 == null) {
					l = i_8_ + (this.myId << 10);
				} else {
					l = (this.myId << 10) - (-(i_4_ << 3) - i_8_);
				}
				boolean bool_11_;
				if (!bool || !aBoolean1830) {
					bool_11_ = false;
				} else {
					l |= ~0x7fffffffffffffffL;
					bool_11_ = true;
				}
				Class180 class180 = (Class180) Class167.aClass21_1618.method193(l, (byte) 71);
				if (class180 == null) {
					final Class180_Sub2 class180_sub2 = method2455(i_8_, (byte) -46, i_4_);
					if (class180_sub2 == null) {
						Class82.aClass88_783.aClass180_826 = null;
						return Class82.aClass88_783;
					}
					class180_sub2.method2299();
					if (i_4_ == 10 && i_8_ > 3) {
						class180_sub2.method2279(256);
					}
					if (!bool_11_) {
						class180 = new Class180_Sub7_Sub1(class180_sub2, 64 - -anInt1843, anInt1824 * 5 + 768, -50, -10, -50);
					} else {
						class180_sub2.aShort2894 = (short) (anInt1843 + 64);
						class180_sub2.aShort2866 = (short) (5 * anInt1824 + 768);
						class180 = class180_sub2;
						class180_sub2.method2303();
					}
					Class167.aClass21_1618.method185(-126, class180, l);
				}
				if (bool_11_) {
					class180 = ((Class180_Sub2) class180).method2288();
				}
				if (aByte1820 != 0) {
					if (class180 instanceof Class180_Sub7_Sub1) {
						class180 = ((Class180_Sub7_Sub1) class180).method2399(aByte1820, aShort1867, is, is_6_, i, i_5_, i_9_, true);
					} else if (class180 instanceof Class180_Sub2) {
						class180 = ((Class180_Sub2) class180).method2305(aByte1820, aShort1867, is, is_6_, i, i_5_, i_9_, true, false);
					}
				}
				Class82.aClass88_783.aClass180_826 = class180;
				return Class82.aClass88_783;
			}
			long l;
			if (anIntArray1817 != null) {
				l = i_8_ + (this.myId << 10) + (i_4_ << 3);
			} else {
				l = (this.myId << 10) + i_8_;
			}
			Class88 class88_12_ = (Class88) Class167.aClass21_1618.method193(l, (byte) 63);
			Class180_Sub7_Sub2 class180_sub7_sub2;
			Class107_Sub1 class107_sub1_13_;
			if (class88_12_ != null) {
				class180_sub7_sub2 = (Class180_Sub7_Sub2) class88_12_.aClass180_826;
				class107_sub1_13_ = class88_12_.aClass107_Sub1_830;
			} else {
				class180_sub7_sub2 = method2459(i_4_, false, i_8_, false);
				if (class180_sub7_sub2 == null) {
					Class82.aClass88_783.aClass180_826 = null;
					Class82.aClass88_783.aClass107_Sub1_830 = null;
					return Class82.aClass88_783;
				}
				if (i_4_ == 10 && i_8_ > 3) {
					class180_sub7_sub2.method2360(256);
				}
				if (!bool_7_) {
					class107_sub1_13_ = null;
				} else {
					class107_sub1_13_ = class180_sub7_sub2.method2414(class107_sub1);
				}
				class88_12_ = new Class88();
				class88_12_.aClass180_826 = class180_sub7_sub2;
				class88_12_.aClass107_Sub1_830 = class107_sub1_13_;
				Class167.aClass21_1618.method185(-127, class88_12_, l);
			}
			final boolean bool_14_ = bool & aBoolean1830;
			final Class180_Sub7_Sub2 class180_sub7_sub2_15_ = class180_sub7_sub2.method2412(aByte1820 != 3, aByte1820 == 0, true, true, true, true, !bool_14_, true, true, true, true);
			if (aByte1820 != 0) {
				class180_sub7_sub2_15_.method2419(aByte1820, aShort1867, class180_sub7_sub2, is, is_6_, i, i_5_, i_9_);
			}
			class180_sub7_sub2_15_.method2432(this.anInt1835 == 0 && !this.aBoolean1863, true, true, true, this.anInt1835 == 0, true, false);
			class180_sub7_sub2_15_.aBoolean3880 = bool_14_;
			Class82.aClass88_783.aClass180_826 = class180_sub7_sub2_15_;
			Class82.aClass88_783.aClass107_Sub1_830 = class107_sub1_13_;
			class88 = Class82.aClass88_783;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("vh.Q(").append(i).append(',').append(bool).append(',').append(i_4_).append(',').append(i_5_).append(',').append(is != null ? "{...}" : "null").append(',').append(is_6_ != null ? "{...}" : "null").append(',')
					.append(bool_7_).append(',').append(i_8_).append(',').append(i_9_).append(',').append(i_10_).append(',').append(class107_sub1 != null ? "{...}" : "null").append(')').toString());
		}
		return class88;
	}

	final int method2454(final byte i, final int i_16_, final int i_17_) {
		int i_18_;
		try {
			if (i != 75) {
				method2454((byte) 89, 55, 121);
			}
			if (aClass75_1865 == null) {
				return i_16_;
			}
			final Class120_Sub32 class120_sub32 = (Class120_Sub32) aClass75_1865.method659(i_17_, i + -192);
			if (class120_sub32 == null) {
				return i_16_;
			}
			i_18_ = class120_sub32.anInt2790;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("vh.K(").append(i).append(',').append(i_16_).append(',').append(i_17_).append(')').toString());
		}
		return i_18_;
	}

	private final Class180_Sub2 method2455(int i, final byte i_19_, final int i_20_) {
		Class180_Sub2 class180_sub2;
		try {
			Class180_Sub2 class180_sub2_21_ = null;
			boolean bool = aBoolean1868;
			if (i_20_ == 2 && i > 3) {
				bool = !bool;
			}
			if (anIntArray1817 == null) {
				if (i_20_ != 10) {
					return null;
				}
				if (anIntArray1850 == null) {
					return null;
				}
				final int i_22_ = anIntArray1850.length;
				for (int i_23_ = 0; i_23_ < i_22_; i_23_++) {
					int i_24_ = anIntArray1850[i_23_];
					if (bool) {
						i_24_ += 65536;
					}
					class180_sub2_21_ = (Class180_Sub2) InterfaceClickMask.aClass21_2663.method193(i_24_, (byte) 100);
					if (class180_sub2_21_ == null) {
						class180_sub2_21_ = Class180_Sub2.method2291(Class120_Sub12_Sub36.aClass50_3418, i_24_ & 0xffff, 0);
						if (class180_sub2_21_ == null) {
							return null;
						}
						if (bool) {
							class180_sub2_21_.method2287();
						}
						InterfaceClickMask.aClass21_2663.method185(-126, class180_sub2_21_, i_24_);
					}
					if (i_22_ > 1) {
						Class120_Sub14_Sub14.aClass180_Sub2Array3574[i_23_] = class180_sub2_21_;
					}
				}
				if (i_22_ > 1) {
					class180_sub2_21_ = new Class180_Sub2(Class120_Sub14_Sub14.aClass180_Sub2Array3574, i_22_);
				}
			} else {
				int i_25_ = -1;
				for (int i_26_ = 0; i_26_ < anIntArray1817.length; i_26_++) {
					if (i_20_ == anIntArray1817[i_26_]) {
						i_25_ = i_26_;
						break;
					}
				}
				if (i_25_ == -1) {
					return null;
				}
				int i_27_ = anIntArray1850[i_25_];
				if (bool) {
					i_27_ += 65536;
				}
				class180_sub2_21_ = (Class180_Sub2) InterfaceClickMask.aClass21_2663.method193(i_27_, (byte) -90);
				if (class180_sub2_21_ == null) {
					class180_sub2_21_ = Class180_Sub2.method2291(Class120_Sub12_Sub36.aClass50_3418, i_27_ & 0xffff, 0);
					if (class180_sub2_21_ == null) {
						return null;
					}
					if (bool) {
						class180_sub2_21_.method2287();
					}
					InterfaceClickMask.aClass21_2663.method185(-126, class180_sub2_21_, i_27_);
				}
			}
			boolean bool_28_;
			if (anInt1856 == 128 && anInt1875 == 128 && anInt1873 == 128) {
				bool_28_ = false;
			} else {
				bool_28_ = true;
			}
			boolean bool_29_;
			if (anInt1838 == 0 && anInt1855 == 0 && anInt1859 == 0) {
				bool_29_ = false;
			} else {
				bool_29_ = true;
			}
			final Class180_Sub2 class180_sub2_30_ = new Class180_Sub2(class180_sub2_21_, i == 0 && !bool_28_ && !bool_29_, aShortArray1860 == null, aShortArray1837 == null, true);
			if (i_20_ == 4 && i > 3) {
				class180_sub2_30_.method2279(256);
				class180_sub2_30_.method2282(45, 0, -45);
			}
			i &= 0x3;
			if (i == 1) {
				class180_sub2_30_.method2281();
			} else if (i != 2) {
				if (i == 3) {
					class180_sub2_30_.method2286();
				}
			} else {
				class180_sub2_30_.method2284();
			}
			if (aShortArray1860 != null) {
				for (int i_31_ = 0; i_31_ < aShortArray1860.length; i_31_++) {
					if (aByteArray1871 == null || aByteArray1871.length <= i_31_) {
						class180_sub2_30_.method2307(aShortArray1860[i_31_], aShortArray1815[i_31_]);
					} else {
						class180_sub2_30_.method2307(aShortArray1860[i_31_], Class127.aShortArray1214[aByteArray1871[i_31_] & 0xff]);
					}
				}
			}
			if (aShortArray1837 != null) {
				for (int i_32_ = 0; aShortArray1837.length > i_32_; i_32_++) {
					class180_sub2_30_.method2292(aShortArray1837[i_32_], aShortArray1828[i_32_]);
				}
			}
			if (bool_28_) {
				class180_sub2_30_.method2306(anInt1856, anInt1875, anInt1873);
			}
			if (bool_29_) {
				class180_sub2_30_.method2282(anInt1838, anInt1855, anInt1859);
			}
			class180_sub2 = class180_sub2_30_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("vh.A(").append(i).append(',').append(i_19_).append(',').append(i_20_).append(')').toString());
		}
		return class180_sub2;
	}

	final LocType handleVarp() {
		int i_34_ = -1;
		if (anInt1854 != -1) {
			i_34_ = Class173.method2226((byte) -118, anInt1854);
		} else if (anInt1846 != -1) {
			i_34_ = Class2.permanentVariable[anInt1846];
		}
		if (i_34_ < 0 || this.childrenIDs.length + -1 <= i_34_ || this.childrenIDs[i_34_] == -1) {
			final int i_35_ = this.childrenIDs[-1 + this.childrenIDs.length];
			if (i_35_ == -1) {
				return null;
			}
			return LocType.list(i_35_);
		}
		return LocType.list(this.childrenIDs[i_34_]);
	}

	final void method2457(final int i, final Buffer class120_sub7) {
		try {
			for (;;) {
				final int i_36_ = class120_sub7.getUByte();
				if (i_36_ == 0) {
					break;
				}
				method2464(i_36_, -14007, class120_sub7);
			}
			if (i != -1) {
				this.anInt1840 = -55;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("vh.J(").append(i).append(',').append(class120_sub7 != null ? "{...}" : "null").append(')').toString());
		}
	}

	static final void method2458() {
		if (Class109.gameState == 10 && HDToolkit.glEnabled) {
			Class120_Sub14_Sub1.setGameState(28);
		}
		if (Class109.gameState == 30) {
			Class120_Sub14_Sub1.setGameState(25);
		}
	}

	private final Class180_Sub7_Sub2 method2459(final int i, final boolean bool, int i_37_, final boolean bool_38_) {
		Class180_Sub7_Sub2 class180_sub7_sub2;
		try {
			final int i_39_ = 64 + anInt1843;
			final int i_40_ = 768 + anInt1824 * 5;
			Class180_Sub7_Sub2 class180_sub7_sub2_41_;
			if (anIntArray1817 == null) {
				if (i != 10) {
					return null;
				}
				if (anIntArray1850 == null) {
					return null;
				}
				final int i_42_ = anIntArray1850.length;
				if (i_42_ == 0) {
					return null;
				}
				long l = 0L;
				for (int i_43_ = 0; i_42_ > i_43_; i_43_++) {
					l = 67783L * l + anIntArray1850[i_43_];
				}
				if (bool) {
					l ^= 0xffffffffffffffffL;
				}
				class180_sub7_sub2_41_ = (Class180_Sub7_Sub2) InterfaceClickMask.aClass21_2663.method193(l, (byte) -101);
				if (class180_sub7_sub2_41_ == null) {
					Class180_Sub2 class180_sub2 = null;
					for (int i_44_ = 0; i_42_ > i_44_; i_44_++) {
						class180_sub2 = Class180_Sub2.method2291(Class120_Sub12_Sub36.aClass50_3418, 0xffff & anIntArray1850[i_44_], 0);
						if (class180_sub2 == null) {
							return null;
						}
						if (i_42_ > 1) {
							Class120_Sub14_Sub14.aClass180_Sub2Array3574[i_44_] = class180_sub2;
						}
					}
					if (i_42_ > 1) {
						class180_sub2 = new Class180_Sub2(Class120_Sub14_Sub14.aClass180_Sub2Array3574, i_42_);
					}
					class180_sub7_sub2_41_ = new Class180_Sub7_Sub2(class180_sub2, i_39_, i_40_, bool);
					InterfaceClickMask.aClass21_2663.method185(-125, class180_sub7_sub2_41_, l);
				}
			} else {
				int i_45_ = -1;
				for (int i_46_ = 0; anIntArray1817.length > i_46_; i_46_++) {
					if (anIntArray1817[i_46_] == i) {
						i_45_ = i_46_;
						break;
					}
				}
				if (i_45_ == -1) {
					return null;
				}
				int i_47_ = anIntArray1850[i_45_];
				if (bool) {
					i_47_ += 65536;
				}
				class180_sub7_sub2_41_ = (Class180_Sub7_Sub2) InterfaceClickMask.aClass21_2663.method193(i_47_, (byte) -123);
				if (class180_sub7_sub2_41_ == null) {
					final Class180_Sub2 class180_sub2 = Class180_Sub2.method2291(Class120_Sub12_Sub36.aClass50_3418, 0xffff & i_47_, 0);
					if (class180_sub2 == null) {
						return null;
					}
					class180_sub7_sub2_41_ = new Class180_Sub7_Sub2(class180_sub2, i_39_, i_40_, bool);
					InterfaceClickMask.aClass21_2663.method185(-127, class180_sub7_sub2_41_, i_47_);
				}
			}
			boolean bool_48_ = aBoolean1868;
			final boolean bool_49_ = anInt1875 == 128 && anInt1855 == 0;
			if (i == 2 && i_37_ > 3) {
				bool_48_ = !bool_48_;
			}
			final boolean bool_50_ = i_37_ == 0 && anInt1856 == 128 && anInt1873 == 128 && anInt1838 == 0 && anInt1859 == 0 && !bool_48_;
			final Class180_Sub7_Sub2 class180_sub7_sub2_51_ = class180_sub7_sub2_41_.method2412(bool_50_, bool_49_, aShortArray1860 == null, true, class180_sub7_sub2_41_.method2407() == i_39_, i_37_ == 0 && !bool_48_, true, class180_sub7_sub2_41_.method2429() == i_40_, true, !bool_48_,
					aShortArray1837 == null);
			if (bool_38_) {
				method2470(null, -89, -43);
			}
			if (bool_48_) {
				class180_sub7_sub2_51_.method2410();
			}
			if (i == 4 && i_37_ > 3) {
				class180_sub7_sub2_51_.method2417(256);
				class180_sub7_sub2_51_.method2368(45, 0, -45);
			}
			i_37_ &= 0x3;
			if (i_37_ == 1) {
				class180_sub7_sub2_51_.method2422();
			} else if (i_37_ == 2) {
				class180_sub7_sub2_51_.method2409();
			} else if (i_37_ == 3) {
				class180_sub7_sub2_51_.method2408();
			}
			if (aShortArray1860 != null) {
				for (int i_52_ = 0; aShortArray1860.length > i_52_; i_52_++) {
					class180_sub7_sub2_51_.method2427(aShortArray1860[i_52_], aShortArray1815[i_52_]);
				}
			}
			if (aShortArray1837 != null) {
				for (int i_53_ = 0; aShortArray1837.length > i_53_; i_53_++) {
					class180_sub7_sub2_51_.method2405(aShortArray1837[i_53_], aShortArray1828[i_53_]);
				}
			}
			if (anInt1856 != 128 || anInt1875 != 128 || anInt1873 != 128) {
				class180_sub7_sub2_51_.method2369(anInt1856, anInt1875, anInt1873);
			}
			if (anInt1838 != 0 || anInt1855 != 0 || anInt1859 != 0) {
				class180_sub7_sub2_51_.method2368(anInt1838, anInt1855, anInt1859);
			}
			if (i_39_ != class180_sub7_sub2_51_.method2407()) {
				class180_sub7_sub2_51_.method2415(i_39_);
			}
			if (class180_sub7_sub2_51_.method2429() != i_40_) {
				class180_sub7_sub2_51_.method2421(i_40_);
			}
			class180_sub7_sub2 = class180_sub7_sub2_51_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("vh.E(").append(i).append(',').append(bool).append(',').append(i_37_).append(',').append(bool_38_).append(')').toString());
		}
		return class180_sub7_sub2;
	}

	final boolean method2460(final int i, final int i_54_) {
		boolean bool;
		try {
			if (i_54_ != 23428) {
				return true;
			}
			if (anIntArray1817 != null) {
				for (int i_55_ = 0; i_55_ < anIntArray1817.length; i_55_++) {
					if (anIntArray1817[i_55_] == i) {
						return Class120_Sub12_Sub36.aClass50_3418.method440(0xffff & anIntArray1850[i_55_], true, 0);
					}
				}
				return true;
			}
			if (anIntArray1850 == null) {
				return true;
			}
			if (i != 10) {
				return true;
			}
			boolean bool_56_ = true;
			for (final int element : anIntArray1850) {
				bool_56_ &= Class120_Sub12_Sub36.aClass50_3418.method440(element & 0xffff, true, 0);
			}
			bool = bool_56_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("vh.U(").append(i).append(',').append(i_54_).append(')').toString());
		}
		return bool;
	}

	final Class88 method2461(final int i, final int[][] is, final int i_58_, final int i_59_, final int i_60_, final int i_61_, final boolean bool, final int i_62_, final int i_63_, final int i_64_, final int[][] is_65_, final Class40 class40, final Class107_Sub1 class107_sub1, final int i_66_) {
		Class88 class88;
		try {
			if (i_59_ != 26643) {
				method2460(16, 89);
			}
			if (HDToolkit.glEnabled) {
				long l;
				if (anIntArray1817 == null) {
					l = (this.myId << 10) + i_62_;
				} else {
					l = i_62_ + (i_63_ << 3) + (this.myId << 10);
				}
				Class180_Sub7_Sub2 class180_sub7_sub2 = (Class180_Sub7_Sub2) Class116.aClass21_1117.method193(l, (byte) 84);
				if (class180_sub7_sub2 == null) {
					class180_sub7_sub2 = method2459(i_63_, true, i_62_, false);
					if (class180_sub7_sub2 == null) {
						return null;
					}
					class180_sub7_sub2.method2426();
					class180_sub7_sub2.method2432(false, false, false, true, false, false, true);
					Class116.aClass21_1117.method185(-127, class180_sub7_sub2, l);
				}
				Class180_Sub7_Sub2 class180_sub7_sub2_67_ = class180_sub7_sub2;
				boolean bool_68_ = false;
				if (class40 != null) {
					class180_sub7_sub2_67_ = (Class180_Sub7_Sub2) class40.method320(false, i_66_, i_58_, class180_sub7_sub2_67_, i_62_, i_64_);
					bool_68_ = true;
				}
				if (i_63_ == 10 && i_62_ > 3) {
					if (!bool_68_) {
						bool_68_ = true;
						class180_sub7_sub2_67_ = (Class180_Sub7_Sub2) class180_sub7_sub2_67_.method2378(true, true, true);
					}
					class180_sub7_sub2_67_.method2360(256);
				}
				if (!bool) {
					Class82.aClass88_783.aClass107_Sub1_830 = null;
				} else {
					Class82.aClass88_783.aClass107_Sub1_830 = class180_sub7_sub2_67_.method2414(class107_sub1);
				}
				if (aByte1820 != 0) {
					if (!bool_68_) {
						bool_68_ = true;
						class180_sub7_sub2_67_ = (Class180_Sub7_Sub2) class180_sub7_sub2_67_.method2378(true, true, true);
					}
					class180_sub7_sub2_67_.method2419(aByte1820, aShort1867, class180_sub7_sub2_67_, is, is_65_, i, i_61_, i_60_);
				}
				Class82.aClass88_783.aClass180_826 = class180_sub7_sub2_67_;
				return Class82.aClass88_783;
			}
			long l;
			if (anIntArray1817 != null) {
				l = i_62_ + (i_63_ << 3) + (this.myId << 10);
			} else {
				l = (this.myId << 10) + i_62_;
			}
			Class180_Sub7_Sub1 class180_sub7_sub1 = (Class180_Sub7_Sub1) Class116.aClass21_1117.method193(l, (byte) 99);
			if (class180_sub7_sub1 == null) {
				final Class180_Sub2 class180_sub2 = method2455(i_62_, (byte) -87, i_63_);
				if (class180_sub2 == null) {
					return null;
				}
				class180_sub7_sub1 = new Class180_Sub7_Sub1(class180_sub2, anInt1843 + 64, 5 * anInt1824 + 768, -50, -10, -50);
				Class116.aClass21_1117.method185(-127, class180_sub7_sub1, l);
			}
			boolean bool_69_ = false;
			if (class40 != null) {
				bool_69_ = true;
				class180_sub7_sub1 = (Class180_Sub7_Sub1) class40.method327(i_66_, i_64_, -1725374704, i_58_, i_62_, class180_sub7_sub1);
			}
			if (i_63_ == 10 && i_62_ > 3) {
				if (!bool_69_) {
					class180_sub7_sub1 = (Class180_Sub7_Sub1) class180_sub7_sub1.method2378(true, true, true);
					bool_69_ = true;
				}
				class180_sub7_sub1.method2360(256);
			}
			if (aByte1820 != 0) {
				if (!bool_69_) {
					bool_69_ = true;
					class180_sub7_sub1 = (Class180_Sub7_Sub1) class180_sub7_sub1.method2378(true, true, true);
				}
				class180_sub7_sub1 = class180_sub7_sub1.method2399(aByte1820, aShort1867, is, is_65_, i, i_61_, i_60_, false);
			}
			Class82.aClass88_783.aClass180_826 = class180_sub7_sub1;
			class88 = Class82.aClass88_783;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("vh.P(").append(i).append(',').append(is != null ? "{...}" : "null").append(',').append(i_58_).append(',').append(i_59_).append(',').append(i_60_).append(',').append(i_61_).append(',').append(bool).append(',')
					.append(i_62_).append(',').append(i_63_).append(',').append(i_64_).append(',').append(is_65_ != null ? "{...}" : "null").append(',').append(class40 != null ? "{...}" : "null").append(',').append(class107_sub1 != null ? "{...}" : "null").append(',').append(i_66_).append(')')
					.toString());
		}
		return class88;
	}

	public static void method2462(final int i) {
		try {
			anIntArray1834 = null;
			if (i != 20259) {
				modeWhat = -11;
			}
			aClass189_1818 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("vh.S(").append(i).append(')').toString());
		}
	}

	final int method2463(final int i) {
		int i_70_;
		try {
			if (i != -1) {
				this.childrenIDs = null;
			}
			if (this.anIntArray1881 != null) {
				int i_71_ = (int) (anInt1816 * Math.random());
				int i_72_;
				for (i_72_ = 0; anIntArray1829[i_72_] <= i_71_; i_72_++) {
					i_71_ -= anIntArray1829[i_72_];
				}
				return this.anIntArray1881[i_72_];
			}
			i_70_ = -1;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("vh.O(").append(i).append(')').toString());
		}
		return i_70_;
	}

	private final void method2464(final int i, final int i_73_, final Buffer class120_sub7) {
		try {
			if (i != 1) {
				if (i == 2) {
					this.name = class120_sub7.getJString();
				} else if (i != 5) {
					if (i != 14) {
						if (i != 15) {
							if (i == 17) {
								this.anInt1821 = 0;
								this.aBoolean1844 = false;
							} else if (i == 18) {
								this.aBoolean1844 = false;
							} else if (i == 19) {
								this.anInt1835 = class120_sub7.getUByte();
							} else if (i == 21) {
								aByte1820 = (byte) 1;
							} else if (i != 22) {
								if (i == 23) {
									this.anInt1866 = 1;
								} else if (i == 24) {
									this.anInt1836 = class120_sub7.getUShort();
									if (this.anInt1836 == 65535) {
										this.anInt1836 = -1;
									}
								} else if (i != 27) {
									if (i != 28) {
										if (i != 29) {
											if (i == 39) {
												anInt1824 = 5 * class120_sub7.getByte();
											} else if (i >= 30 && i < 35) {
												this.actions[-30 + i] = class120_sub7.getJString();
												if (this.actions[i + -30].equalsIgnoreCase(Class120_Sub12_Sub15.aString3244)) {
													this.actions[i - 30] = null;
												}
											} else if (i != 40) {
												if (i != 41) {
													if (i == 42) {
														final int i_74_ = class120_sub7.getUByte();
														aByteArray1871 = new byte[i_74_];
														for (int i_75_ = 0; i_75_ < i_74_; i_75_++) {
															aByteArray1871[i_75_] = class120_sub7.getByte();
														}
													} else if (i == 62) {
														aBoolean1868 = true;
													} else if (i != 64) {
														if (i != 65) {
															if (i != 66) {
																if (i != 67) {
																	if (i == 69) {
																		this.anInt1857 = class120_sub7.getUByte();
																	} else if (i != 70) {
																		if (i != 71) {
																			if (i == 72) {
																				anInt1859 = class120_sub7.method1078(true);
																			} else if (i == 73) {
																				this.aBoolean1853 = true;
																			} else if (i != 74) {
																				if (i == 75) {
																					this.anInt1831 = class120_sub7.getUByte();
																				} else if (i != 77 && i != 92) {
																					if (i != 78) {
																						if (i == 79) {
																							this.anInt1879 = class120_sub7.getUShort();
																							this.anInt1845 = class120_sub7.getUShort();
																							this.anInt1832 = class120_sub7.getUByte();
																							final int i_76_ = class120_sub7.getUByte();
																							this.anIntArray1870 = new int[i_76_];
																							for (int i_77_ = 0; i_77_ < i_76_; i_77_++) {
																								this.anIntArray1870[i_77_] = class120_sub7.getUShort();
																							}
																						} else if (i == 81) {
																							aByte1820 = (byte) 2;
																							aShort1867 = (short) (256 * class120_sub7.getUByte());
																						} else if (i != 82) {
																							if (i != 88) {
																								if (i != 89) {
																									if (i == 90) {
																										this.aBoolean1822 = true;
																									} else if (i == 91) {
																										this.aBoolean1851 = true;
																									} else if (i == 93) {
																										aByte1820 = (byte) 3;
																										aShort1867 = (short) class120_sub7.getUShort();
																									} else if (i == 94) {
																										aByte1820 = (byte) 4;
																									} else if (i != 95) {
																										if (i != 96) {
																											if (i == 97) {
																												this.aBoolean1862 = true;
																											} else if (i != 98) {
																												if (i != 99) {
																													if (i == 100) {
																														this.cursor2op = class120_sub7.getUByte();
																														this.cursor2 = class120_sub7.getUShort();
																													} else if (i != 101) {
																														if (i != 102) {
																															if (i == 103) {
																																this.anInt1866 = 0;
																															} else if (i == 104) {
																																this.anInt1839 = class120_sub7.getUByte();
																															} else if (i == 105) {
																																this.aBoolean1872 = true;
																															} else if (i == 106) {
																																final int i_78_ = class120_sub7.getUByte();
																																anIntArray1829 = new int[i_78_];
																																this.anIntArray1881 = new int[i_78_];
																																for (int i_79_ = 0; i_78_ > i_79_; i_79_++) {
																																	this.anIntArray1881[i_79_] = class120_sub7.getUShort();
																																	final int i_80_ = class120_sub7.getUByte();
																																	anIntArray1829[i_79_] = i_80_;
																																	anInt1816 += i_80_;
																																}
																															} else if (i == 107) {
																																this.anInt1840 = class120_sub7.getUShort();
																															} else if (i >= 150 && i < 155) {
																																this.actions[-150 + i] = class120_sub7.getJString();
																																if (!Class69_Sub2.aBoolean2234 || this.actions[-150 + i].equalsIgnoreCase(Class120_Sub12_Sub15.aString3244)) {
																																	this.actions[i - 150] = null;
																																}
																															} else if (i == 249) {
																																final int i_81_ = class120_sub7.getUByte();
																																if (aClass75_1865 == null) {
																																	final int i_82_ = Class120_Sub12_Sub17.method1283(i_81_, (byte) -11);
																																	aClass75_1865 = new Class75(i_82_);
																																}
																																for (int i_83_ = 0; i_81_ > i_83_; i_83_++) {
																																	final boolean bool = class120_sub7.getUByte() == 1;
																																	final int i_84_ = class120_sub7.getTriByte();
																																	Node node;
																																	if (bool) {
																																		node = new StringNode(class120_sub7.getJString());
																																	} else {
																																		node = new Class120_Sub32(class120_sub7.getInt());
																																	}
																																	aClass75_1865.method655(node, 83, i_84_);
																																}
																															}
																														} else {
																															this.anInt1826 = class120_sub7.getUShort();
																														}
																													} else {
																														this.anInt1869 = class120_sub7.getUByte();
																													}
																												} else {
																													this.cursor1op = class120_sub7.getUByte();
																													this.cursor1 = class120_sub7.getUShort();
																												}
																											} else {
																												this.aBoolean1863 = true;
																											}
																										} else {
																											this.aBoolean1878 = true;
																										}
																									} else {
																										aByte1820 = (byte) 5;
																									}
																								} else {
																									this.aBoolean1864 = false;
																								}
																							} else {
																								this.aBoolean1823 = false;
																							}
																						} else {
																							this.aBoolean1876 = true;
																						}
																					} else {
																						this.anInt1833 = class120_sub7.getUShort();
																						this.anInt1832 = class120_sub7.getUByte();
																					}
																				} else {
																					int i_85_ = -1;
																					anInt1854 = class120_sub7.getUShort();
																					if (anInt1854 == 65535) {
																						anInt1854 = -1;
																					}
																					anInt1846 = class120_sub7.getUShort();
																					if (-65536 == (anInt1846 ^ 0xffffffff)) {
																						anInt1846 = -1;
																					}
																					if (i == 92) {
																						i_85_ = class120_sub7.getUShort();
																						if (-65536 == (i_85_ ^ 0xffffffff)) {
																							i_85_ = -1;
																						}
																					}
																					final int i_86_ = class120_sub7.getUByte();
																					this.childrenIDs = new int[2 + i_86_];
																					for (int i_87_ = 0; i_86_ >= i_87_; i_87_++) {
																						this.childrenIDs[i_87_] = class120_sub7.getUShort();
																						if (-65536 == (this.childrenIDs[i_87_] ^ 0xffffffff)) {
																							this.childrenIDs[i_87_] = -1;
																						}
																					}
																					this.childrenIDs[i_86_ - -1] = i_85_;
																				}
																			} else {
																				this.aBoolean1880 = true;
																			}
																		} else {
																			anInt1855 = class120_sub7.method1078(true);
																		}
																	} else {
																		anInt1838 = class120_sub7.method1078(true);
																	}
																} else {
																	anInt1873 = class120_sub7.getUShort();
																}
															} else {
																anInt1875 = class120_sub7.getUShort();
															}
														} else {
															anInt1856 = class120_sub7.getUShort();
														}
													} else {
														this.aBoolean1858 = false;
													}
												} else {
													final int i_88_ = class120_sub7.getUByte();
													aShortArray1828 = new short[i_88_];
													aShortArray1837 = new short[i_88_];
													for (int i_89_ = 0; i_89_ < i_88_; i_89_++) {
														aShortArray1837[i_89_] = (short) class120_sub7.getUShort();
														aShortArray1828[i_89_] = (short) class120_sub7.getUShort();
													}
												}
											} else {
												final int i_90_ = class120_sub7.getUByte();
												aShortArray1860 = new short[i_90_];
												aShortArray1815 = new short[i_90_];
												for (int i_91_ = 0; i_91_ < i_90_; i_91_++) {
													aShortArray1860[i_91_] = (short) class120_sub7.getUShort();
													aShortArray1815[i_91_] = (short) class120_sub7.getUShort();
												}
											}
										} else {
											anInt1843 = class120_sub7.getByte();
										}
									} else {
										this.anInt1819 = class120_sub7.getUByte();
									}
								} else {
									this.anInt1821 = 1;
								}
							} else {
								aBoolean1830 = true;
							}
						} else {
							this.anInt1827 = class120_sub7.getUByte();
						}
					} else {
						this.anInt1841 = class120_sub7.getUByte();
					}
				} else {
					final int i_92_ = class120_sub7.getUByte();
					if (i_92_ > 0) {
						if (anIntArray1850 == null || Class120_Sub12_Sub26.aBoolean3326) {
							anIntArray1817 = null;
							anIntArray1850 = new int[i_92_];
							for (int i_93_ = 0; i_93_ < i_92_; i_93_++) {
								anIntArray1850[i_93_] = class120_sub7.getUShort();
							}
						} else {
							class120_sub7.pos += i_92_ * 2;
						}
					}
				}
			} else {
				final int i_94_ = class120_sub7.getUByte();
				if (i_94_ > 0) {
					if (anIntArray1850 != null && !Class120_Sub12_Sub26.aBoolean3326) {
						class120_sub7.pos += 3 * i_94_;
					} else {
						anIntArray1850 = new int[i_94_];
						anIntArray1817 = new int[i_94_];
						for (int i_95_ = 0; i_95_ < i_94_; i_95_++) {
							anIntArray1850[i_95_] = class120_sub7.getUShort();
							anIntArray1817[i_95_] = class120_sub7.getUByte();
						}
					}
				}
			}
			if (i_73_ != -14007) {
				this.aBoolean1872 = true;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("vh.I(").append(i).append(',').append(i_73_).append(',').append(class120_sub7 != null ? "{...}" : "null").append(')').toString());
		}
	}

	static final void method2465(final byte i, final boolean bool) {
		try {
			if (Class9.aByteArrayArrayArray70 == null) {
				Class9.aByteArrayArrayArray70 = new byte[4][104][104];
			}
			for (int i_96_ = 0; i_96_ < 4; i_96_++) {
				for (int i_97_ = 0; i_97_ < 104; i_97_++) {
					for (int i_98_ = 0; i_98_ < 104; i_98_++) {
						Class9.aByteArrayArrayArray70[i_96_][i_97_][i_98_] = i;
					}
				}
			}
			if (!bool) {
				anIntArray1834 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("vh.H(").append(i).append(',').append(bool).append(')').toString());
		}
	}

	final boolean method2466(final int i) {
		boolean bool;
		try {
			if (this.childrenIDs == null) {
				if (this.anInt1833 == -1 && this.anIntArray1870 == null) {
					return false;
				}
				return true;
			}
			for (final int element : this.childrenIDs) {
				if ((element ^ 0xffffffff) != 0) {
					final LocType class184_100_ = LocType.list(element);
					if (class184_100_.anInt1833 != -1 || class184_100_.anIntArray1870 != null) {
						return true;
					}
				}
			}
			bool = false;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("vh.C(").append(i).append(')').toString());
		}
		return bool;
	}

	static final int method2467(final int i, final byte i_101_, final Class189 class189) {
		int i_102_;
		try {
			if (class189.anIntArrayArray1970 == null || i >= class189.anIntArrayArray1970.length) {
				return -2;
			}
			try {
				if (i_101_ >= -11) {
					modeWhat = -7;
				}
				final int[] is = class189.anIntArrayArray1970[i];
				int i_103_ = 0;
				int i_104_ = 0;
				int i_105_ = 0;
				for (;;) {
					int i_106_ = 0;
					final int i_107_ = is[i_103_++];
					int i_108_ = 0;
					if (i_107_ == 0) {
						return i_104_;
					}
					if (i_107_ == 1) {
						i_108_ = Class180.anIntArray1783[is[i_103_++]];
					}
					if (i_107_ == 15) {
						i_106_ = 1;
					}
					if (i_107_ == 16) {
						i_106_ = 2;
					}
					if (i_107_ == 17) {
						i_106_ = 3;
					}
					if (i_107_ == 2) {
						i_108_ = Class172.anIntArray1720[is[i_103_++]];
					}
					if (i_107_ == 3) {
						i_108_ = Class120_Sub12_Sub38.anIntArray3439[is[i_103_++]];
					}
					if (i_107_ == 4) {
						int i_109_ = is[i_103_++] << 16;
						i_109_ += is[i_103_++];
						final Class189 class189_110_ = Class74.method650(68, i_109_);
						final int i_111_ = is[i_103_++];
						if ((i_111_ ^ 0xffffffff) != 0 && (!ObjType.list(i_111_).members || Class120_Sub12_Sub37.aBoolean3432)) {
							for (int i_112_ = 0; class189_110_.anIntArray1978.length > i_112_; i_112_++) {
								if (class189_110_.anIntArray1978[i_112_] == i_111_ + 1) {
									i_108_ += class189_110_.anIntArray1983[i_112_];
								}
							}
						}
					}
					if (i_107_ == 5) {
						i_108_ = Class2.permanentVariable[is[i_103_++]];
					}
					if (i_107_ == 6) {
						i_108_ = Class55.anIntArray492[Class172.anIntArray1720[is[i_103_++]] - 1];
					}
					if (i_107_ == 7) {
						i_108_ = Class2.permanentVariable[is[i_103_++]] * 100 / 46875;
					}
					if (i_107_ == 8) {
						i_108_ = Class100.selfPlayer.anInt3747;
					}
					if (i_107_ == 9) {
						for (int i_113_ = 0; i_113_ < 25; i_113_++) {
							if (Class173.aBooleanArray1723[i_113_]) {
								i_108_ += Class172.anIntArray1720[i_113_];
							}
						}
					}
					if (i_107_ == 10) {
						int i_114_ = is[i_103_++] << 16;
						i_114_ += is[i_103_++];
						final Class189 class189_115_ = Class74.method650(55, i_114_);
						final int i_116_ = is[i_103_++];
						if ((i_116_ ^ 0xffffffff) != 0 && (!ObjType.list(i_116_).members || Class120_Sub12_Sub37.aBoolean3432)) {
							for (int i_117_ = 0; class189_115_.anIntArray1978.length > i_117_; i_117_++) {
								if (1 + i_116_ == class189_115_.anIntArray1978[i_117_]) {
									i_108_ = 999999999;
									break;
								}
							}
						}
					}
					if (i_107_ == 11) {
						i_108_ = Class69_Sub2.anInt2240;
					}
					if (i_107_ == 12) {
						i_108_ = Class56.anInt498;
					}
					if (i_107_ == 13) {
						final int i_118_ = Class2.permanentVariable[is[i_103_++]];
						final int i_119_ = is[i_103_++];
						i_108_ = (1 << i_119_ & i_118_) == 0 ? 0 : 1;
					}
					if (i_107_ == 14) {
						final int i_120_ = is[i_103_++];
						i_108_ = Class173.method2226((byte) -126, i_120_);
					}
					if (i_107_ == 18) {
						i_108_ = GameEntity.currentBaseX + (Class100.selfPlayer.x >> 7);
					}
					if (i_107_ == 19) {
						i_108_ = (Class100.selfPlayer.z >> 7) - -Class181.currentBaseZ;
					}
					if (i_107_ == 20) {
						i_108_ = is[i_103_++];
					}
					if (i_106_ == 0) {
						if (i_105_ == 0) {
							i_104_ += i_108_;
						}
						if (i_105_ == 1) {
							i_104_ -= i_108_;
						}
						if (i_105_ == 2 && i_108_ != 0) {
							i_104_ /= i_108_;
						}
						if (i_105_ == 3) {
							i_104_ *= i_108_;
						}
						i_105_ = 0;
					} else {
						i_105_ = i_106_;
					}
				}
			} catch (final Exception exception) {
				i_102_ = -1;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("vh.M(").append(i).append(',').append(i_101_).append(',').append(class189 != null ? "{...}" : "null").append(')').toString());
		}
		return i_102_;
	}

	final boolean method2468(final byte i, final int i_121_) {
		boolean bool;
		try {
			if (i != 54) {
				return true;
			}
			if (i_121_ == -1) {
				return false;
			}
			if (i_121_ == this.anInt1836) {
				return true;
			}
			if (this.anIntArray1881 != null) {
				for (final int element : this.anIntArray1881) {
					if (i_121_ == element) {
						return true;
					}
				}
			}
			bool = false;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("vh.D(").append(i).append(',').append(i_121_).append(')').toString());
		}
		return bool;
	}

	final void method2469(final int i) {
		try {
			if ((this.anInt1835 ^ 0xffffffff) == 0) {
				this.anInt1835 = 0;
				if (anIntArray1850 != null && (anIntArray1817 == null || anIntArray1817[0] == 10)) {
					this.anInt1835 = 1;
				}
				for (int i_123_ = 0; i_123_ < 5; i_123_++) {
					if (this.actions[i_123_] != null) {
						this.anInt1835 = 1;
						break;
					}
				}
			}
			if (this.anInt1831 == -1) {
				this.anInt1831 = this.anInt1821 == 0 ? 0 : 1;
			}
			if (i < 122) {
				anInt1855 = 118;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("vh.G(").append(i).append(')').toString());
		}
	}

	final String method2470(final String string, final int i, final int i_124_) {
		String string_125_;
		try {
			if (aClass75_1865 == null) {
				return string;
			}
			if (i_124_ != -108) {
				return null;
			}
			final StringNode class120_sub25 = (StringNode) aClass75_1865.method659(i, i_124_ + 118);
			if (class120_sub25 == null) {
				return string;
			}
			string_125_ = class120_sub25.value;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("vh.B(").append(string != null ? "{...}" : "null").append(',').append(i).append(',').append(i_124_).append(')').toString());
		}
		return string_125_;
	}

	static final LocType list(final int id) {
		LocType class184_1_ = (LocType) Class56.aClass21_494.method193(id, (byte) -124);
		if (class184_1_ != null) {
			return class184_1_;
		}
		final byte[] is = Class120_Sub6.aClass50_2450.method442(Class53_Sub1.method465(114, id), (byte) 120, Class120_Sub18.method1667(true, id));
		class184_1_ = new LocType();
		class184_1_.myId = id;
		if (is != null) {
			class184_1_.method2457(-1, new Buffer(is));
		}
		class184_1_.method2469(125);
		if (!Class69_Sub2.aBoolean2234 && class184_1_.aBoolean1851) {
			class184_1_.actions = null;
		}
		if (class184_1_.aBoolean1880) {
			class184_1_.anInt1821 = 0;
			class184_1_.aBoolean1844 = false;
		}
		Class56.aClass21_494.method185(-126, class184_1_, id);
		return class184_1_;
	}

	public LocType() {
		anInt1824 = 0;
		aByte1820 = (byte) 0;
		this.aBoolean1823 = true;
		this.anInt1819 = 16;
		this.anInt1832 = 0;
		this.anInt1827 = 1;
		this.anInt1845 = 0;
		this.aBoolean1851 = false;
		this.anInt1857 = 0;
		this.cursor2op = -1;
		this.actions = new String[5];
		this.anInt1841 = 1;
		this.anInt1831 = -1;
		anInt1838 = 0;
		aBoolean1830 = false;
		anInt1816 = 0;
		this.anInt1821 = 2;
		anInt1854 = -1;
		this.aBoolean1858 = true;
		this.cursor2 = -1;
		this.aBoolean1844 = true;
		this.aBoolean1862 = false;
		this.anInt1840 = -1;
		anInt1855 = 0;
		aShort1867 = (short) -1;
		this.aBoolean1864 = true;
		this.name = "null";
		anIntArray1829 = null;
		this.aBoolean1822 = false;
		this.anInt1836 = -1;
		this.anInt1866 = -1;
		this.anInt1833 = -1;
		this.anInt1839 = 255;
		this.aBoolean1872 = false;
		this.anInt1869 = 0;
		this.cursor1 = -1;
		this.anInt1835 = -1;
		aBoolean1868 = false;
		this.anInt1826 = -1;
		anInt1846 = -1;
		anInt1873 = 128;
		anInt1843 = 0;
		anInt1859 = 0;
		anInt1875 = 128;
		this.aBoolean1878 = false;
		anInt1856 = 128;
		this.aBoolean1863 = false;
		this.anInt1879 = 0;
		this.aBoolean1876 = false;
		this.aBoolean1853 = false;
		this.aBoolean1880 = false;
		this.anIntArray1881 = null;
	}
}
