/* Class184 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class LocType {
	private short[] aShortArray1815;
	private int anInt1816;
	private int[] anIntArray1817;
	static JagexInterface aClass189_1818 = null;
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
	boolean members;
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
	private Hashtable params;
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
	static ObjectCache recentUse = new ObjectCache(64);

	static final void resetSpriteMenu() {
		Class173.aClass120_Sub14_Sub19_1725 = null;
		FrameLoader.aClass120_Sub14_Sub19_3611 = null;
		RuntimeException_Sub1.aClass120_Sub14_Sub19_2144 = null;
		Class157.aClass120_Sub14_Sub19_1472 = null;
		Class120_Sub12_Sub10.aClass120_Sub14_Sub19_3202 = null;
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
				bool_1_ &= Class120_Sub12_Sub36.aClass50_3418.fileExists(0xffff & i_3_, 0);
			}
			bool_0_ = bool_1_;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("vh.F(").append(bool).append(')').toString());
		}
		return bool_0_;
	}

	final Class88 method2453(final int i, final boolean bool, final int i_4_, final int i_5_, final int[][] is, final int[][] is_6_, final boolean bool_7_, final int i_8_, final int i_9_, final int i_10_, final LDIndexedSprite class107_sub1) {
		Class88 class88;
		try {
			if (i_10_ > -112) {
				resetSpriteMenu();
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
				SceneGraphNode sceneGraphNode = (SceneGraphNode) Class167.aClass21_1618.get(l);
				if (sceneGraphNode == null) {
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
						sceneGraphNode = new Class180_Sub7_Sub1(class180_sub2, 64 - -anInt1843, anInt1824 * 5 + 768, -50, -10, -50);
					} else {
						class180_sub2.aShort2894 = (short) (anInt1843 + 64);
						class180_sub2.aShort2866 = (short) (5 * anInt1824 + 768);
						sceneGraphNode = class180_sub2;
						class180_sub2.method2303();
					}
					Class167.aClass21_1618.put(sceneGraphNode, l);
				}
				if (bool_11_) {
					sceneGraphNode = ((Class180_Sub2) sceneGraphNode).method2288();
				}
				if (aByte1820 != 0) {
					if (sceneGraphNode instanceof Class180_Sub7_Sub1) {
						sceneGraphNode = ((Class180_Sub7_Sub1) sceneGraphNode).method2399(aByte1820, aShort1867, is, is_6_, i, i_5_, i_9_, true);
					} else if (sceneGraphNode instanceof Class180_Sub2) {
						sceneGraphNode = ((Class180_Sub2) sceneGraphNode).method2305(aByte1820, aShort1867, is, is_6_, i, i_5_, i_9_, true, false);
					}
				}
				Class82.aClass88_783.aClass180_826 = sceneGraphNode;
				return Class82.aClass88_783;
			}
			long l;
			if (anIntArray1817 != null) {
				l = i_8_ + (this.myId << 10) + (i_4_ << 3);
			} else {
				l = (this.myId << 10) + i_8_;
			}
			Class88 class88_12_ = (Class88) Class167.aClass21_1618.get(l);
			Class180_Sub7_Sub2 class180_sub7_sub2;
			LDIndexedSprite class107_sub1_13_;
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
				Class167.aClass21_1618.put(class88_12_, l);
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
			throw EnumType.method1428(runtimeexception, new StringBuilder("vh.Q(").append(i).append(',').append(bool).append(',').append(i_4_).append(',').append(i_5_).append(',').append(is != null ? "{...}" : "null").append(',').append(is_6_ != null ? "{...}" : "null").append(',')
					.append(bool_7_).append(',').append(i_8_).append(',').append(i_9_).append(',').append(i_10_).append(',').append(class107_sub1 != null ? "{...}" : "null").append(')').toString());
		}
		return class88;
	}

	final int getIntegerParamValue(final int param, final int defaultInt) {
		if (params == null) {
			return defaultInt;
		}
		final IntegerNode integerNode = (IntegerNode) params.get(param);
		if (integerNode == null) {
			return defaultInt;
		}
		return integerNode.value;
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
					class180_sub2_21_ = (Class180_Sub2) InterfaceClickMask.aClass21_2663.get(i_24_);
					if (class180_sub2_21_ == null) {
						class180_sub2_21_ = Class180_Sub2.method2291(Class120_Sub12_Sub36.aClass50_3418, i_24_ & 0xffff, 0);
						if (class180_sub2_21_ == null) {
							return null;
						}
						if (bool) {
							class180_sub2_21_.method2287();
						}
						InterfaceClickMask.aClass21_2663.put(class180_sub2_21_, i_24_);
					}
					if (i_22_ > 1) {
						AbstractRequest.aClass180_Sub2Array3574[i_23_] = class180_sub2_21_;
					}
				}
				if (i_22_ > 1) {
					class180_sub2_21_ = new Class180_Sub2(AbstractRequest.aClass180_Sub2Array3574, i_22_);
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
				class180_sub2_21_ = (Class180_Sub2) InterfaceClickMask.aClass21_2663.get(i_27_);
				if (class180_sub2_21_ == null) {
					class180_sub2_21_ = Class180_Sub2.method2291(Class120_Sub12_Sub36.aClass50_3418, i_27_ & 0xffff, 0);
					if (class180_sub2_21_ == null) {
						return null;
					}
					if (bool) {
						class180_sub2_21_.method2287();
					}
					InterfaceClickMask.aClass21_2663.put(class180_sub2_21_, i_27_);
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
						class180_sub2_30_.recolor(aShortArray1860[i_31_], aShortArray1815[i_31_]);
					} else {
						class180_sub2_30_.recolor(aShortArray1860[i_31_], Class127.aShortArray1214[aByteArray1871[i_31_] & 0xff]);
					}
				}
			}
			if (aShortArray1837 != null) {
				for (int i_32_ = 0; aShortArray1837.length > i_32_; i_32_++) {
					class180_sub2_30_.retexture(aShortArray1837[i_32_], aShortArray1828[i_32_]);
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
			throw EnumType.method1428(runtimeexception, new StringBuilder("vh.A(").append(i).append(',').append(i_19_).append(',').append(i_20_).append(')').toString());
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

	final void decode(final Buffer buffer) {
		for (;;) {
			final int code = buffer.getUByte();
			if (code == 0) {
				break;
			}
			decode(buffer, code);
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
				class180_sub7_sub2_41_ = (Class180_Sub7_Sub2) InterfaceClickMask.aClass21_2663.get(l);
				if (class180_sub7_sub2_41_ == null) {
					Class180_Sub2 class180_sub2 = null;
					for (int i_44_ = 0; i_42_ > i_44_; i_44_++) {
						class180_sub2 = Class180_Sub2.method2291(Class120_Sub12_Sub36.aClass50_3418, 0xffff & anIntArray1850[i_44_], 0);
						if (class180_sub2 == null) {
							return null;
						}
						if (i_42_ > 1) {
							AbstractRequest.aClass180_Sub2Array3574[i_44_] = class180_sub2;
						}
					}
					if (i_42_ > 1) {
						class180_sub2 = new Class180_Sub2(AbstractRequest.aClass180_Sub2Array3574, i_42_);
					}
					class180_sub7_sub2_41_ = new Class180_Sub7_Sub2(class180_sub2, i_39_, i_40_, bool);
					InterfaceClickMask.aClass21_2663.put(class180_sub7_sub2_41_, l);
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
				class180_sub7_sub2_41_ = (Class180_Sub7_Sub2) InterfaceClickMask.aClass21_2663.get(i_47_);
				if (class180_sub7_sub2_41_ == null) {
					final Class180_Sub2 class180_sub2 = Class180_Sub2.method2291(Class120_Sub12_Sub36.aClass50_3418, 0xffff & i_47_, 0);
					if (class180_sub2 == null) {
						return null;
					}
					class180_sub7_sub2_41_ = new Class180_Sub7_Sub2(class180_sub2, i_39_, i_40_, bool);
					InterfaceClickMask.aClass21_2663.put(class180_sub7_sub2_41_, i_47_);
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
				getStringParamValue(-89, null);
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
			throw EnumType.method1428(runtimeexception, new StringBuilder("vh.E(").append(i).append(',').append(bool).append(',').append(i_37_).append(',').append(bool_38_).append(')').toString());
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
						return Class120_Sub12_Sub36.aClass50_3418.fileExists(0xffff & anIntArray1850[i_55_], 0);
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
				bool_56_ &= Class120_Sub12_Sub36.aClass50_3418.fileExists(element & 0xffff, 0);
			}
			bool = bool_56_;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("vh.U(").append(i).append(',').append(i_54_).append(')').toString());
		}
		return bool;
	}

	final Class88 method2461(final int i, final int[][] is, final int i_58_, final int i_59_, final int i_60_, final int i_61_, final boolean bool, final int i_62_, final int i_63_, final int i_64_, final int[][] is_65_, final SeqType seqType, final LDIndexedSprite class107_sub1, final int i_66_) {
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
				Class180_Sub7_Sub2 class180_sub7_sub2 = (Class180_Sub7_Sub2) Class116.aClass21_1117.get(l);
				if (class180_sub7_sub2 == null) {
					class180_sub7_sub2 = method2459(i_63_, true, i_62_, false);
					if (class180_sub7_sub2 == null) {
						return null;
					}
					class180_sub7_sub2.method2426();
					class180_sub7_sub2.method2432(false, false, false, true, false, false, true);
					Class116.aClass21_1117.put(class180_sub7_sub2, l);
				}
				Class180_Sub7_Sub2 class180_sub7_sub2_67_ = class180_sub7_sub2;
				boolean bool_68_ = false;
				if (seqType != null) {
					class180_sub7_sub2_67_ = (Class180_Sub7_Sub2) seqType.method320(false, i_66_, i_58_, class180_sub7_sub2_67_, i_62_, i_64_);
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
			Class180_Sub7_Sub1 class180_sub7_sub1 = (Class180_Sub7_Sub1) Class116.aClass21_1117.get(l);
			if (class180_sub7_sub1 == null) {
				final Class180_Sub2 class180_sub2 = method2455(i_62_, (byte) -87, i_63_);
				if (class180_sub2 == null) {
					return null;
				}
				class180_sub7_sub1 = new Class180_Sub7_Sub1(class180_sub2, anInt1843 + 64, 5 * anInt1824 + 768, -50, -10, -50);
				Class116.aClass21_1117.put(class180_sub7_sub1, l);
			}
			boolean bool_69_ = false;
			if (seqType != null) {
				bool_69_ = true;
				class180_sub7_sub1 = (Class180_Sub7_Sub1) seqType.method327(i_66_, i_64_, -1725374704, i_58_, i_62_, class180_sub7_sub1);
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
			throw EnumType.method1428(runtimeexception, new StringBuilder("vh.P(").append(i).append(',').append(is != null ? "{...}" : "null").append(',').append(i_58_).append(',').append(i_59_).append(',').append(i_60_).append(',').append(i_61_).append(',').append(bool).append(',')
					.append(i_62_).append(',').append(i_63_).append(',').append(i_64_).append(',').append(is_65_ != null ? "{...}" : "null").append(',').append(seqType != null ? "{...}" : "null").append(',').append(class107_sub1 != null ? "{...}" : "null").append(',').append(i_66_).append(')')
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
			throw EnumType.method1428(runtimeexception, new StringBuilder("vh.S(").append(i).append(')').toString());
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
			throw EnumType.method1428(runtimeexception, new StringBuilder("vh.O(").append(i).append(')').toString());
		}
		return i_70_;
	}

	private final void decode(final Buffer buffer, final int code) {
			if (code != 1) {
				if (code == 2) {
					this.name = buffer.getJString();
				} else if (code != 5) {
					if (code != 14) {
						if (code != 15) {
							if (code == 17) {
								this.anInt1821 = 0;
								this.aBoolean1844 = false;
							} else if (code == 18) {
								this.aBoolean1844 = false;
							} else if (code == 19) {
								this.anInt1835 = buffer.getUByte();
							} else if (code == 21) {
								aByte1820 = (byte) 1;
							} else if (code != 22) {
								if (code == 23) {
									this.anInt1866 = 1;
								} else if (code == 24) {
									this.anInt1836 = buffer.getUShort();
									if (this.anInt1836 == 65535) {
										this.anInt1836 = -1;
									}
								} else if (code != 27) {
									if (code != 28) {
										if (code != 29) {
											if (code == 39) {
												anInt1824 = 5 * buffer.getByte();
											} else if (code >= 30 && code < 35) {
												this.actions[-30 + code] = buffer.getJString();
												if (this.actions[code + -30].equalsIgnoreCase(Class120_Sub12_Sub15.aString3244)) {
													this.actions[code - 30] = null;
												}
											} else if (code != 40) {
												if (code != 41) {
													if (code == 42) {
														final int i_74_ = buffer.getUByte();
														aByteArray1871 = new byte[i_74_];
														for (int i_75_ = 0; i_75_ < i_74_; i_75_++) {
															aByteArray1871[i_75_] = buffer.getByte();
														}
													} else if (code == 62) {
														aBoolean1868 = true;
													} else if (code != 64) {
														if (code != 65) {
															if (code != 66) {
																if (code != 67) {
																	if (code == 69) {
																		this.anInt1857 = buffer.getUByte();
																	} else if (code != 70) {
																		if (code != 71) {
																			if (code == 72) {
																				anInt1859 = buffer.getShort();
																			} else if (code == 73) {
																				this.aBoolean1853 = true;
																			} else if (code != 74) {
																				if (code == 75) {
																					this.anInt1831 = buffer.getUByte();
																				} else if (code != 77 && code != 92) {
																					if (code != 78) {
																						if (code == 79) {
																							this.anInt1879 = buffer.getUShort();
																							this.anInt1845 = buffer.getUShort();
																							this.anInt1832 = buffer.getUByte();
																							final int i_76_ = buffer.getUByte();
																							this.anIntArray1870 = new int[i_76_];
																							for (int i_77_ = 0; i_77_ < i_76_; i_77_++) {
																								this.anIntArray1870[i_77_] = buffer.getUShort();
																							}
																						} else if (code == 81) {
																							aByte1820 = (byte) 2;
																							aShort1867 = (short) (256 * buffer.getUByte());
																						} else if (code != 82) {
																							if (code != 88) {
																								if (code != 89) {
																									if (code == 90) {
																										this.aBoolean1822 = true;
																									} else if (code == 91) {
																										this.members = true;
																									} else if (code == 93) {
																										aByte1820 = (byte) 3;
																										aShort1867 = (short) buffer.getUShort();
																									} else if (code == 94) {
																										aByte1820 = (byte) 4;
																									} else if (code != 95) {
																										if (code != 96) {
																											if (code == 97) {
																												this.aBoolean1862 = true;
																											} else if (code != 98) {
																												if (code != 99) {
																													if (code == 100) {
																														this.cursor2op = buffer.getUByte();
																														this.cursor2 = buffer.getUShort();
																													} else if (code != 101) {
																														if (code != 102) {
																															if (code == 103) {
																																this.anInt1866 = 0;
																															} else if (code == 104) {
																																this.anInt1839 = buffer.getUByte();
																															} else if (code == 105) {
																																this.aBoolean1872 = true;
																															} else if (code == 106) {
																																final int i_78_ = buffer.getUByte();
																																anIntArray1829 = new int[i_78_];
																																this.anIntArray1881 = new int[i_78_];
																																for (int i_79_ = 0; i_78_ > i_79_; i_79_++) {
																																	this.anIntArray1881[i_79_] = buffer.getUShort();
																																	final int i_80_ = buffer.getUByte();
																																	anIntArray1829[i_79_] = i_80_;
																																	anInt1816 += i_80_;
																																}
																															} else if (code == 107) {
																																this.anInt1840 = buffer.getUShort();
																															} else if (code >= 150 && code < 155) {
																																this.actions[-150 + code] = buffer.getJString();
																																if (!Class69_Sub2.aBoolean2234 || this.actions[-150 + code].equalsIgnoreCase(Class120_Sub12_Sub15.aString3244)) {
																																	this.actions[code - 150] = null;
																																}
																															} else if (code == 249) {
																																final int i_81_ = buffer.getUByte();
																																if (params == null) {
																																	final int i_82_ = Class120_Sub12_Sub17.method1283(i_81_);
																																	params = new Hashtable(i_82_);
																																}
																																for (int i_83_ = 0; i_81_ > i_83_; i_83_++) {
																																	final boolean bool = buffer.getUByte() == 1;
																																	final int i_84_ = buffer.getMedium();
																																	Node node;
																																	if (bool) {
																																		node = new StringNode(buffer.getJString());
																																	} else {
																																		node = new IntegerNode(buffer.getInt());
																																	}
																																	params.put(node, i_84_);
																																}
																															}
																														} else {
																															this.anInt1826 = buffer.getUShort();
																														}
																													} else {
																														this.anInt1869 = buffer.getUByte();
																													}
																												} else {
																													this.cursor1op = buffer.getUByte();
																													this.cursor1 = buffer.getUShort();
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
																						this.anInt1833 = buffer.getUShort();
																						this.anInt1832 = buffer.getUByte();
																					}
																				} else {
																					int i_85_ = -1;
																					anInt1854 = buffer.getUShort();
																					if (anInt1854 == 65535) {
																						anInt1854 = -1;
																					}
																					anInt1846 = buffer.getUShort();
																					if (-65536 == (anInt1846 ^ 0xffffffff)) {
																						anInt1846 = -1;
																					}
																					if (code == 92) {
																						i_85_ = buffer.getUShort();
																						if (-65536 == (i_85_ ^ 0xffffffff)) {
																							i_85_ = -1;
																						}
																					}
																					final int i_86_ = buffer.getUByte();
																					this.childrenIDs = new int[2 + i_86_];
																					for (int i_87_ = 0; i_86_ >= i_87_; i_87_++) {
																						this.childrenIDs[i_87_] = buffer.getUShort();
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
																			anInt1855 = buffer.getShort();
																		}
																	} else {
																		anInt1838 = buffer.getShort();
																	}
																} else {
																	anInt1873 = buffer.getUShort();
																}
															} else {
																anInt1875 = buffer.getUShort();
															}
														} else {
															anInt1856 = buffer.getUShort();
														}
													} else {
														this.aBoolean1858 = false;
													}
												} else {
													final int i_88_ = buffer.getUByte();
													aShortArray1828 = new short[i_88_];
													aShortArray1837 = new short[i_88_];
													for (int i_89_ = 0; i_89_ < i_88_; i_89_++) {
														aShortArray1837[i_89_] = (short) buffer.getUShort();
														aShortArray1828[i_89_] = (short) buffer.getUShort();
													}
												}
											} else {
												final int i_90_ = buffer.getUByte();
												aShortArray1860 = new short[i_90_];
												aShortArray1815 = new short[i_90_];
												for (int i_91_ = 0; i_91_ < i_90_; i_91_++) {
													aShortArray1860[i_91_] = (short) buffer.getUShort();
													aShortArray1815[i_91_] = (short) buffer.getUShort();
												}
											}
										} else {
											anInt1843 = buffer.getByte();
										}
									} else {
										this.anInt1819 = buffer.getUByte();
									}
								} else {
									this.anInt1821 = 1;
								}
							} else {
								aBoolean1830 = true;
							}
						} else {
							this.anInt1827 = buffer.getUByte();
						}
					} else {
						this.anInt1841 = buffer.getUByte();
					}
				} else {
					final int i_92_ = buffer.getUByte();
					if (i_92_ > 0) {
						if (anIntArray1850 == null || Class120_Sub12_Sub26.aBoolean3326) {
							anIntArray1817 = null;
							anIntArray1850 = new int[i_92_];
							for (int i_93_ = 0; i_93_ < i_92_; i_93_++) {
								anIntArray1850[i_93_] = buffer.getUShort();
							}
						} else {
							buffer.pos += i_92_ * 2;
						}
					}
				}
			} else {
				final int i_94_ = buffer.getUByte();
				if (i_94_ > 0) {
					if (anIntArray1850 != null && !Class120_Sub12_Sub26.aBoolean3326) {
						buffer.pos += 3 * i_94_;
					} else {
						anIntArray1850 = new int[i_94_];
						anIntArray1817 = new int[i_94_];
						for (int i_95_ = 0; i_95_ < i_94_; i_95_++) {
							anIntArray1850[i_95_] = buffer.getUShort();
							anIntArray1817[i_95_] = buffer.getUByte();
						}
					}
				}
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
			throw EnumType.method1428(runtimeexception, new StringBuilder("vh.H(").append(i).append(',').append(bool).append(')').toString());
		}
	}

	final boolean method2466(final int i) {
		if (this.childrenIDs == null) {
			if (this.anInt1833 == -1 && this.anIntArray1870 == null) {
				return false;
			}
			return true;
		}
		for (final int element : this.childrenIDs) {
			if (element != -1) {
				final LocType class184_100_ = LocType.list(element);
				if (class184_100_.anInt1833 != -1 || class184_100_.anIntArray1870 != null) {
					return true;
				}
			}
		}
		return false;
	}

	static final int method2467(final JagexInterface jagexInterface, final int i) {
		if (jagexInterface.cs1opcodes == null || i >= jagexInterface.cs1opcodes.length) {
			return -2;
		}
		try {
			final int[] is = jagexInterface.cs1opcodes[i];
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
					i_108_ = SceneGraphNode.skillsLevel[is[i_103_++]];
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
					i_108_ = Decimator.skillsBaseLevel[is[i_103_++]];
				}
				if (i_107_ == 3) {
					i_108_ = Class120_Sub12_Sub38.skillsXp[is[i_103_++]];
				}
				if (i_107_ == 4) {
					int i_109_ = is[i_103_++] << 16;
					i_109_ += is[i_103_++];
					final JagexInterface class189_110_ = Class74.getJagexInterface(i_109_);
					final int i_111_ = is[i_103_++];
					if ((i_111_ ^ 0xffffffff) != 0 && (!ObjType.list(i_111_).members || Class120_Sub12_Sub37.membersClient)) {
						for (int i_112_ = 0; class189_110_.objIds.length > i_112_; i_112_++) {
							if (class189_110_.objIds[i_112_] == i_111_ + 1) {
								i_108_ += class189_110_.objAmounts[i_112_];
							}
						}
					}
				}
				if (i_107_ == 5) {
					i_108_ = Class2.permanentVariable[is[i_103_++]];
				}
				if (i_107_ == 6) {
					i_108_ = Class55.skillsXpForLevel[Decimator.skillsBaseLevel[is[i_103_++]] - 1];
				}
				if (i_107_ == 7) {
					i_108_ = Class2.permanentVariable[is[i_103_++]] * 100 / 46875;
				}
				if (i_107_ == 8) {
					i_108_ = Class100.selfPlayer.combatLevel;
				}
				if (i_107_ == 9) {
					for (int i_113_ = 0; i_113_ < 25; i_113_++) {
						if (Class173.aBooleanArray1723[i_113_]) {
							i_108_ += Decimator.skillsBaseLevel[i_113_];
						}
					}
				}
				if (i_107_ == 10) {
					int i_114_ = is[i_103_++] << 16;
					i_114_ += is[i_103_++];
					final JagexInterface class189_115_ = Class74.getJagexInterface(i_114_);
					final int i_116_ = is[i_103_++];
					if ((i_116_ ^ 0xffffffff) != 0 && (!ObjType.list(i_116_).members || Class120_Sub12_Sub37.membersClient)) {
						for (int i_117_ = 0; class189_115_.objIds.length > i_117_; i_117_++) {
							if (1 + i_116_ == class189_115_.objIds[i_117_]) {
								i_108_ = 999999999;
								break;
							}
						}
					}
				}
				if (i_107_ == 11) {
					i_108_ = Class69_Sub2.energy;
				}
				if (i_107_ == 12) {
					i_108_ = LookupTable.weight;
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
			return -1;
		}
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
			throw EnumType.method1428(runtimeexception, new StringBuilder("vh.D(").append(i).append(',').append(i_121_).append(')').toString());
		}
		return bool;
	}

	final void postDecode() {
		if (this.anInt1835 == -1) {
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
	}

	final String getStringParamValue(final int param, final String defaultString) {
		if (params == null) {
			return defaultString;
		}
		final StringNode stringNode = (StringNode) params.get(param);
		if (stringNode == null) {
			return defaultString;
		}
		return stringNode.value;
	}

	static final LocType list(final int id) {
		LocType locType = (LocType) recentUse.get(id);
		if (locType != null) {
			return locType;
		}
		final byte[] data = Class120_Sub6.aClass50_2450.getFile(Class53_Sub1.method465(114, id), GroundTile.method1667(true, id));
		locType = new LocType();
		locType.myId = id;
		if (data != null) {
			locType.decode(new Buffer(data));
		}
		locType.postDecode();
		if (!Class69_Sub2.aBoolean2234 && locType.members) {
			locType.actions = null;
		}
		if (locType.aBoolean1880) {
			locType.anInt1821 = 0;
			locType.aBoolean1844 = false;
		}
		recentUse.put(locType, id);
		return locType;
	}

	public LocType() {
		anInt1824 = 0;
		aByte1820 = (byte) 0;
		this.aBoolean1823 = true;
		this.anInt1819 = 16;
		this.anInt1832 = 0;
		this.anInt1827 = 1;
		this.anInt1845 = 0;
		this.members = false;
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
