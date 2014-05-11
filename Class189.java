/* Class189 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class189 {
	Object[] anObjectArray1929;
	int anInt1930;
	Class189 aClass189_1931 = null;
	Object[] anObjectArray1932;
	InterfaceClickMask aClass120_Sub20_1933;
	String aString1934;
	int anInt1935 = 0;
	String aString1936;
	int anInt1937;
	int anInt1938;
	boolean aBoolean1939;
	boolean aBoolean1940;
	int cursorId;
	Object[] anObjectArray1942;
	boolean aBoolean1943;
	Object[] anObjectArray1944;
	int anInt1945;
	int anInt1946;
	Object[] anObjectArray1947;
	int anInt1948;
	int[] anIntArray1949;
	String aString1950 = "";
	Object[] anObjectArray1951;
	static Thread gameShellThread;
	Object[] anObjectArray1953;
	Object[] anObjectArray1954;
	byte[] aByteArray1955;
	boolean aBoolean1956;
	int[] anIntArray1957;
	boolean aBoolean1958;
	Object[] anObjectArray1959;
	boolean aBoolean1960;
	int anInt1961;
	int anInt1962;
	byte aByte1963;
	String aString1964;
	int anInt1965 = 0;
	int anInt1966;
	int anInt1967;
	int anInt1968;
	int anInt1969;
	int[][] anIntArrayArray1970;
	boolean aBoolean1971;
	int anInt1972;
	int[] anIntArray1973;
	int anInt1974;
	int anInt1975;
	Object[] anObjectArray1976;
	int anInt1977;
	int[] anIntArray1978;
	String aString1979;
	Object[] anObjectArray1980;
	int anInt1981;
	int anInt1982;
	int[] anIntArray1983;
	Object[] anObjectArray1984;
	int[] anIntArray1985;
	int[] anIntArray1986;
	private int anInt1987;
	int[] anIntArray1988;
	boolean aBoolean1989;
	int anInt1990;
	int[] anIntArray1991;
	int[] anIntArray1992;
	Object[] anObjectArray1993;
	String aString1994;
	int anInt1995;
	int anInt1996;
	int anInt1997;
	Object[] anObjectArray1998;
	int anInt1999;
	Object[] anObjectArray2000;
	boolean aBoolean2001;
	int anInt2002;
	boolean aBoolean2003;
	int anInt2004;
	int anInt2005;
	Object[] anObjectArray2006;
	int anInt2007;
	int anInt2008;
	int anInt2009;
	int anInt2010;
	int anInt2011;
	int anInt2012;
	Object[] anObjectArray2013;
	int anInt2014;
	int anInt2015;
	private int anInt2016;
	byte aByte2017;
	boolean aBoolean2018;
	boolean aBoolean2019;
	int anInt2020;
	int anInt2021;
	int[] anIntArray2022;
	int anInt2023;
	Object[] anObjectArray2024;
	int anInt2025;
	int anInt2026;
	static int anInt2027;
	int anInt2028;
	int anInt2029;
	int anInt2030;
	int anInt2031;
	Object[] anObjectArray2032;
	int anInt2033;
	Object[] anObjectArray2034;
	boolean aBoolean2035;
	Object[] anObjectArray2036;
	int anInt2037;
	int[] anIntArray2038;
	int[] anIntArray2039;
	boolean aBoolean2040;
	boolean aBoolean2041;
	static short[] aShortArray2042;
	int anInt2043;
	int anInt2044;
	boolean aBoolean2045;
	boolean aBoolean2046;
	int anInt2047;
	byte[] aByteArray2048;
	int anInt2049;
	Object[] anObjectArray2050;
	byte aByte2051;
	String[] aStringArray2052;
	static int anInt2053;
	Object[] anObjectArray2054;
	int anInt2055;
	String[] aStringArray2056;
	int anInt2057;
	Object[] anObjectArray2058;
	int anInt2059;
	int anInt2060;
	int anInt2061;
	Object[] anObjectArray2062;
	int[] anIntArray2063;
	int anInt2064;
	short aShort2065;
	int anInt2066;
	int anInt2067;
	static int anInt2068 = 0;
	int anInt2069;
	int anInt2070;
	int[] anIntArray2071;
	Class189[] aClass189Array2072;
	int anInt2073;
	Object[] anObjectArray2074;
	int anInt2075;
	int anInt2076;
	int anInt2077;
	int anInt2078;
	int[] anIntArray2079;
	Object[] anObjectArray2080;
	int anInt2081;
	int anInt2082;
	int anInt2083;
	Object[] anObjectArray2084;
	int anInt2085;
	Object[] anObjectArray2086;
	int anInt2087;
	int anInt2088;
	Object[] anObjectArray2089;
	int anInt2090;
	int anInt2091;
	byte aByte2092;
	short aShort2093;
	int anInt2094;
	String aString2095;
	int[] anIntArray2096;
	boolean aBoolean2097;
	int anInt2098;

	static {
		anInt2027 = 0;
		aShortArray2042 = new short[] { 43, 29, 60, 31, 22, 14, 24, 12 };
		anInt2053 = 0;
	}

	final void method2485(final String string, final int i, final int i_0_) {
		try {
			if (this.aStringArray2052 == null || i_0_ >= this.aStringArray2052.length) {
				final String[] strings = new String[1 + i_0_];
				if (this.aStringArray2052 != null) {
					for (int i_1_ = 0; this.aStringArray2052.length > i_1_; i_1_++) {
						strings[i_1_] = this.aStringArray2052[i_1_];
					}
				}
				this.aStringArray2052 = strings;
			}
			if (i > 52) {
				this.aStringArray2052[i_0_] = string;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("wf.O(").append(string != null ? "{...}" : "null").append(',').append(i).append(',').append(i_0_).append(')').toString());
		}
	}

	final Class180_Sub7 method2486(final Class40 class40, final PlayerAppearance playerAppearance, final int i, final byte i_2_, final int i_3_, final int i_4_, final boolean bool) {
		Class180_Sub7 class180_sub7;
		try {
			if (i_2_ != -83) {
				this.anInt2044 = 104;
			}
			int i_5_;
			int i_6_;
			if (!bool) {
				i_6_ = this.anInt2031;
				i_5_ = this.anInt1961;
			} else {
				i_5_ = anInt2016;
				i_6_ = anInt1987;
			}
			Class88.aBoolean835 = false;
			if (i_6_ == 0) {
				return null;
			}
			if (i_6_ == 1 && i_5_ == -1) {
				return null;
			}
			if (i_6_ == 1) {
				Class180_Sub7 class180_sub7_7_ = (Class180_Sub7) Class120_Sub1.aClass21_2406.method193(i_5_ + (i_6_ << 16), (byte) 92);
				if (class180_sub7_7_ == null) {
					final Class180_Sub2 class180_sub2 = Class180_Sub2.method2291(Class172.aClass50_1721, i_5_, 0);
					if (class180_sub2 == null) {
						Class88.aBoolean835 = true;
						return null;
					}
					class180_sub7_7_ = class180_sub2.method2300(64, 768, -50, -10, -50);
					Class120_Sub1.aClass21_2406.method185(-128, class180_sub7_7_, i_5_ + (i_6_ << 16));
				}
				if (class40 != null) {
					class180_sub7_7_ = class40.method323(false, i_4_, i, class180_sub7_7_, i_3_);
				}
				return class180_sub7_7_;
			}
			if (i_6_ == 2) {
				final Class180_Sub7 class180_sub7_8_ = NpcType.list(i_5_).method2210(i, class40, (byte) -128, i_4_, i_3_);
				if (class180_sub7_8_ == null) {
					Class88.aBoolean835 = true;
					return null;
				}
				return class180_sub7_8_;
			}
			if (i_6_ == 3) {
				if (playerAppearance == null) {
					return null;
				}
				final Class180_Sub7 class180_sub7_9_ = playerAppearance.method2044(i_4_, class40, i, (byte) 60, i_3_);
				if (class180_sub7_9_ == null) {
					Class88.aBoolean835 = true;
					return null;
				}
				return class180_sub7_9_;
			}
			if (i_6_ == 4) {
				final ObjType objType = ObjType.list(i_5_);
				final Class180_Sub7 class180_sub7_10_ = objType.method2105(i_3_, 10, -102, i, playerAppearance, class40, i_4_);
				if (class180_sub7_10_ == null) {
					Class88.aBoolean835 = true;
					return null;
				}
				return class180_sub7_10_;
			}
			if (i_6_ == 6) {
				final Class180_Sub7 class180_sub7_11_ = NpcType.list(i_5_).method2212(i_3_, 0, -95, null, class40, i, null, 0, 0, i_4_);
				if (class180_sub7_11_ == null) {
					Class88.aBoolean835 = true;
					return null;
				}
				return class180_sub7_11_;
			}
			if (i_6_ == 7) {
				if (playerAppearance == null) {
					return null;
				}
				final int i_12_ = this.anInt1961 & 0xffff;
				final int i_13_ = this.anInt1997;
				final int i_14_ = this.anInt1961 >>> 16;
				final Class180_Sub7 class180_sub7_15_ = playerAppearance.method2041(-6, class40, i_12_, i_13_, i_3_, i_4_, i_14_, i);
				if (class180_sub7_15_ == null) {
					Class88.aBoolean835 = true;
					return null;
				}
				return class180_sub7_15_;
			}
			class180_sub7 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception,
					new StringBuilder("wf.K(").append(class40 != null ? "{...}" : "null").append(',').append(playerAppearance != null ? "{...}" : "null").append(',').append(i).append(',').append(i_2_).append(',').append(i_3_).append(',').append(i_4_).append(',').append(bool).append(')').toString());
		}
		return class180_sub7;
	}

	final AbstractSprite method2487(final byte i, final int i_16_) {
		AbstractSprite class120_sub14_sub19;
		try {
			Class88.aBoolean835 = false;
			if (i_16_ < 0 || i_16_ >= this.anIntArray1957.length) {
				return null;
			}
			if (i <= 106) {
				method2499((byte) -16, 110, -113);
			}
			final int i_17_ = this.anIntArray1957[i_16_];
			if (i_17_ == -1) {
				return null;
			}
			AbstractSprite class120_sub14_sub19_18_ = (AbstractSprite) Class180_Sub6.aClass21_3071.method193(i_17_, (byte) 21);
			if (class120_sub14_sub19_18_ != null) {
				return class120_sub14_sub19_18_;
			}
			class120_sub14_sub19_18_ = Class80.method700(i_17_, 0, (byte) 124, Class89.aClass50_836);
			if (class120_sub14_sub19_18_ == null) {
				Class88.aBoolean835 = true;
			} else {
				Class180_Sub6.aClass21_3071.method185(-127, class120_sub14_sub19_18_, i_17_);
			}
			class120_sub14_sub19 = class120_sub14_sub19_18_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("wf.Q(").append(i).append(',').append(i_16_).append(')').toString());
		}
		return class120_sub14_sub19;
	}

	final void method2488(final int i, final int i_19_, final int i_20_) {
		try {
			if (this.anIntArray1992 == null || i >= this.anIntArray1992.length) {
				final int[] is = new int[1 + i];
				if (this.anIntArray1992 != null) {
					for (int i_21_ = 0; this.anIntArray1992.length > i_21_; i_21_++) {
						is[i_21_] = this.anIntArray1992[i_21_];
					}
					for (int i_22_ = this.anIntArray1992.length; i > i_22_; i_22_++) {
						is[i_22_] = -1;
					}
				}
				this.anIntArray1992 = is;
			}
			this.anIntArray1992[i] = i_19_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("wf.G(").append(i).append(',').append(i_19_).append(',').append(i_20_).append(')').toString());
		}
	}

	final Class41 method2489(final int i) {
		Class41 class41;
		try {
			if (i != 0) {
				return null;
			}
			class41 = (this.anInt2088 ^ 0xffffffff) != 0 ? Class132_Sub1.method1934(this.anInt2002, (byte) 126, this.anInt2094, this.anInt2088, this.anInt1966) : null;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("wf.R(").append(i).append(')').toString());
		}
		return class41;
	}

	static final void method2490(final int i, final int i_23_) {
		try {
			OutputStream_Sub1.aClass21_30.method192((byte) -92, i);
			if (i_23_ <= 7) {
				anInt2053 = -76;
			}
			Class120_Sub12_Sub27.aClass21_3342.method192((byte) 112, i);
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("wf.B(").append(i).append(',').append(i_23_).append(')').toString());
		}
	}

	final void method2491(final Buffer class120_sub7, final int i) {
		try {
			this.aBoolean2041 = false;
			this.anInt1995 = class120_sub7.getUByte();
			this.anInt1996 = class120_sub7.getUByte();
			if (i < 16) {
				this.aBoolean1943 = true;
			}
			this.anInt1975 = class120_sub7.getUShort();
			this.anInt2015 = class120_sub7.method1078(true);
			this.anInt2061 = class120_sub7.method1078(true);
			this.anInt2014 = class120_sub7.getUShort();
			this.anInt2060 = class120_sub7.getUShort();
			this.aByte2092 = (byte) 0;
			this.aByte2051 = (byte) 0;
			this.aByte2017 = (byte) 0;
			this.aByte1963 = (byte) 0;
			this.anInt1974 = class120_sub7.getUByte();
			this.anInt2029 = class120_sub7.getUShort();
			if (-65536 != (this.anInt2029 ^ 0xffffffff)) {
				this.anInt2029 = this.anInt2029 + (~0xffff & this.anInt1999);
			} else {
				this.anInt2029 = -1;
			}
			this.anInt2010 = class120_sub7.getUShort();
			if ((this.anInt2010 ^ 0xffffffff) == -65536) {
				this.anInt2010 = -1;
			}
			final int i_24_ = class120_sub7.getUByte();
			if (i_24_ > 0) {
				this.anIntArray2038 = new int[i_24_];
				this.anIntArray2071 = new int[i_24_];
				for (int i_25_ = 0; i_25_ < i_24_; i_25_++) {
					this.anIntArray2038[i_25_] = class120_sub7.getUByte();
					this.anIntArray2071[i_25_] = class120_sub7.getUShort();
				}
			}
			final int i_26_ = class120_sub7.getUByte();
			if (i_26_ > 0) {
				this.anIntArrayArray1970 = new int[i_26_][];
				for (int i_27_ = 0; i_27_ < i_26_; i_27_++) {
					final int i_28_ = class120_sub7.getUShort();
					this.anIntArrayArray1970[i_27_] = new int[i_28_];
					for (int i_29_ = 0; i_28_ > i_29_; i_29_++) {
						this.anIntArrayArray1970[i_27_][i_29_] = class120_sub7.getUShort();
						if (65535 == this.anIntArrayArray1970[i_27_][i_29_]) {
							this.anIntArrayArray1970[i_27_][i_29_] = -1;
						}
					}
				}
			}
			int i_30_ = 0;
			if (this.anInt1995 == 0) {
				this.anInt1937 = class120_sub7.getUShort();
				this.aBoolean2045 = class120_sub7.getUByte() == 1;
			}
			if (this.anInt1995 == 1) {
				class120_sub7.getUShort();
				class120_sub7.getUByte();
			}
			if (this.anInt1995 == 2) {
				this.aByte1963 = (byte) 3;
				this.aByte2092 = (byte) 3;
				this.anIntArray1983 = new int[this.anInt2060 * this.anInt2014];
				this.anIntArray1978 = new int[this.anInt2014 * this.anInt2060];
				final int i_31_ = class120_sub7.getUByte();
				final int i_32_ = class120_sub7.getUByte();
				if (i_31_ == 1) {
					i_30_ |= 0x10000000;
				}
				final int i_33_ = class120_sub7.getUByte();
				if (i_32_ == 1) {
					i_30_ |= 0x40000000;
				}
				final int i_34_ = class120_sub7.getUByte();
				if (i_33_ == 1) {
					i_30_ |= ~0x7fffffff;
				}
				if (i_34_ == 1) {
					i_30_ |= 0x20000000;
				}
				this.anInt2044 = class120_sub7.getUByte();
				this.anInt2077 = class120_sub7.getUByte();
				this.anIntArray1986 = new int[20];
				this.anIntArray1988 = new int[20];
				this.anIntArray1957 = new int[20];
				for (int i_35_ = 0; i_35_ < 20; i_35_++) {
					final int i_36_ = class120_sub7.getUByte();
					if (i_36_ == 1) {
						this.anIntArray1988[i_35_] = class120_sub7.method1078(true);
						this.anIntArray1986[i_35_] = class120_sub7.method1078(true);
						this.anIntArray1957[i_35_] = class120_sub7.getInt();
					} else {
						this.anIntArray1957[i_35_] = -1;
					}
				}
				this.aStringArray2056 = new String[5];
				for (int i_37_ = 0; i_37_ < 5; i_37_++) {
					final String string = class120_sub7.getJString();
					if (string.length() > 0) {
						this.aStringArray2056[i_37_] = string;
						i_30_ |= 1 << i_37_ + 23;
					}
				}
			}
			if (this.anInt1995 == 3) {
				this.aBoolean2019 = class120_sub7.getUByte() == 1;
			}
			if (this.anInt1995 == 4 || this.anInt1995 == 1) {
				this.anInt2011 = class120_sub7.getUByte();
				this.anInt2009 = class120_sub7.getUByte();
				this.anInt2057 = class120_sub7.getUByte();
				this.anInt2067 = class120_sub7.getUShort();
				if (-65536 == (this.anInt2067 ^ 0xffffffff)) {
					this.anInt2067 = -1;
				}
				this.aBoolean2040 = class120_sub7.getUByte() == 1;
			}
			if (this.anInt1995 == 4) {
				this.aString1950 = class120_sub7.getJString();
				this.aString1936 = class120_sub7.getJString();
			}
			if (this.anInt1995 == 1 || this.anInt1995 == 3 || this.anInt1995 == 4) {
				this.anInt2025 = class120_sub7.getInt();
			}
			if (this.anInt1995 == 3 || this.anInt1995 == 4) {
				this.anInt1972 = class120_sub7.getInt();
				this.anInt2081 = class120_sub7.getInt();
				this.anInt2087 = class120_sub7.getInt();
			}
			if (this.anInt1995 == 5) {
				this.anInt2055 = class120_sub7.getInt();
				this.anInt2012 = class120_sub7.getInt();
			}
			if (this.anInt1995 == 6) {
				this.anInt2031 = 1;
				this.anInt1961 = class120_sub7.getUShort();
				anInt1987 = 1;
				if ((this.anInt1961 ^ 0xffffffff) == -65536) {
					this.anInt1961 = -1;
				}
				anInt2016 = class120_sub7.getUShort();
				if (-65536 == (anInt2016 ^ 0xffffffff)) {
					anInt2016 = -1;
				}
				this.anInt1945 = class120_sub7.getUShort();
				if (this.anInt1945 == 65535) {
					this.anInt1945 = -1;
				}
				this.anInt1990 = class120_sub7.getUShort();
				if (65535 == this.anInt1990) {
					this.anInt1990 = -1;
				}
				this.anInt2005 = class120_sub7.getUShort();
				this.anInt2047 = class120_sub7.getUShort();
				this.anInt2091 = class120_sub7.getUShort();
			}
			if (this.anInt1995 == 7) {
				this.aByte2092 = (byte) 3;
				this.aByte1963 = (byte) 3;
				this.anIntArray1983 = new int[this.anInt2014 * this.anInt2060];
				this.anIntArray1978 = new int[this.anInt2060 * this.anInt2014];
				this.anInt2011 = class120_sub7.getUByte();
				this.anInt2067 = class120_sub7.getUShort();
				if (-65536 == (this.anInt2067 ^ 0xffffffff)) {
					this.anInt2067 = -1;
				}
				this.aBoolean2040 = class120_sub7.getUByte() == 1;
				this.anInt2025 = class120_sub7.getInt();
				this.anInt2044 = class120_sub7.method1078(true);
				this.anInt2077 = class120_sub7.method1078(true);
				final int i_38_ = class120_sub7.getUByte();
				if (i_38_ == 1) {
					i_30_ |= 0x40000000;
				}
				this.aStringArray2056 = new String[5];
				for (int i_39_ = 0; i_39_ < 5; i_39_++) {
					final String string = class120_sub7.getJString();
					if (string.length() > 0) {
						this.aStringArray2056[i_39_] = string;
						i_30_ |= 1 << i_39_ + 23;
					}
				}
			}
			if (this.anInt1995 == 8) {
				this.aString1950 = class120_sub7.getJString();
			}
			if (this.anInt1996 == 2 || this.anInt1995 == 2) {
				this.aString2095 = class120_sub7.getJString();
				this.aString1979 = class120_sub7.getJString();
				final int i_40_ = 0x3f & class120_sub7.getUShort();
				i_30_ |= i_40_ << 11;
			}
			if (this.anInt1996 == 1 || this.anInt1996 == 4 || this.anInt1996 == 5 || this.anInt1996 == 6) {
				this.aString1934 = class120_sub7.getJString();
				if (this.aString1934.length() == 0) {
					if (this.anInt1996 == 1) {
						this.aString1934 = Class120_Sub12_Sub28.aString3360;
					}
					if (this.anInt1996 == 4) {
						this.aString1934 = Class143.aString2183;
					}
					if (this.anInt1996 == 5) {
						this.aString1934 = Class143.aString2183;
					}
					if (this.anInt1996 == 6) {
						this.aString1934 = Class109.aString1046;
					}
				}
			}
			if (this.anInt1996 == 1 || this.anInt1996 == 4 || this.anInt1996 == 5) {
				i_30_ |= 0x400000;
			}
			if (this.anInt1996 == 6) {
				i_30_ |= 0x1;
			}
			this.aClass120_Sub20_1933 = new InterfaceClickMask(i_30_, -1);
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("wf.L(").append(class120_sub7 != null ? "{...}" : "null").append(',').append(i).append(')').toString());
		}
	}

	final AbstractSprite method2492(final boolean bool, final byte i) {
		AbstractSprite class120_sub14_sub19;
		try {
			Class88.aBoolean835 = false;
			int i_41_;
			if (!bool) {
				i_41_ = this.anInt2055;
			} else {
				i_41_ = this.anInt2012;
			}
			if (i_41_ == -1) {
				return null;
			}
			final long l = ((!this.aBoolean1958 ? 0L : 1L) << 39) + ((long) this.anInt2090 << 36) + i_41_ + ((this.aBoolean2018 ? 1L : 0L) << 35) - -((this.aBoolean1943 ? 1L : 0L) << 38) + ((long) this.anInt2026 << 40);
			AbstractSprite class120_sub14_sub19_42_ = (AbstractSprite) Class180_Sub6.aClass21_3071.method193(l, (byte) 34);
			if (class120_sub14_sub19_42_ != null) {
				return class120_sub14_sub19_42_;
			}
			LDSprite class120_sub14_sub19_sub2;
			if (!this.aBoolean2018) {
				class120_sub14_sub19_sub2 = Class120_Sub14_Sub13.method1534(Class89.aClass50_836, (byte) -49, i_41_, 0);
			} else {
				class120_sub14_sub19_sub2 = Class120_Sub12_Sub26.method1340(Class89.aClass50_836, i_41_, 0);
			}
			if (class120_sub14_sub19_sub2 == null) {
				Class88.aBoolean835 = true;
				return null;
			}
			if (this.aBoolean1943) {
				class120_sub14_sub19_sub2.method1608();
			}
			if (this.aBoolean1958) {
				class120_sub14_sub19_sub2.method1603();
			}
			if (this.anInt2090 > 0) {
				class120_sub14_sub19_sub2.method1616(this.anInt2090);
			}
			if (this.anInt2090 >= 1) {
				class120_sub14_sub19_sub2.method1613(1);
			}
			if (this.anInt2090 >= 2) {
				class120_sub14_sub19_sub2.method1613(16777215);
			}
			if (this.anInt2026 != 0) {
				class120_sub14_sub19_sub2.method1607(this.anInt2026);
			}
			if (HDToolkit.glEnabled) {
				if (!(class120_sub14_sub19_sub2 instanceof LDTransparentSprite)) {
					class120_sub14_sub19_42_ = new HDSprite(class120_sub14_sub19_sub2);
				} else {
					class120_sub14_sub19_42_ = new HDTransparentSprite(class120_sub14_sub19_sub2);
				}
			} else {
				class120_sub14_sub19_42_ = class120_sub14_sub19_sub2;
			}
			Class180_Sub6.aClass21_3071.method185(-125, class120_sub14_sub19_42_, l);
			if (i != -18) {
				method2487((byte) 42, 52);
			}
			class120_sub14_sub19 = class120_sub14_sub19_42_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("wf.C(").append(bool).append(',').append(i).append(')').toString());
		}
		return class120_sub14_sub19;
	}

	private final int[] method2493(final int i, final Buffer class120_sub7) {
		int[] is;
		try {
			final int i_43_ = class120_sub7.getUByte();
			if (i_43_ == 0) {
				return null;
			}
			if (i != -182) {
				this.aByteArray1955 = null;
			}
			final int[] is_44_ = new int[i_43_];
			for (int i_45_ = 0; i_45_ < i_43_; i_45_++) {
				is_44_[i_45_] = class120_sub7.getInt();
			}
			is = is_44_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("wf.F(").append(i).append(',').append(class120_sub7 != null ? "{...}" : "null").append(')').toString());
		}
		return is;
	}

	static final Class153 method2494(final byte i, final int i_46_) {
		Class153 class153;
		try {
			Class153 class153_47_ = (Class153) Class120_Sub12_Sub9.aClass21_3196.method193(i_46_, (byte) 123);
			if (class153_47_ != null) {
				return class153_47_;
			}
			final byte[] is = Class120_Sub12_Sub30.aClass50_3373.method442(30, (byte) 112, i_46_);
			class153_47_ = new Class153();
			if (is != null) {
				class153_47_.method2077((byte) 85, i_46_, new Buffer(is));
			}
			Class120_Sub12_Sub9.aClass21_3196.method185(i ^ 0x75, class153_47_, i_46_);
			if (i != -10) {
				return null;
			}
			class153 = class153_47_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("wf.A(").append(i).append(',').append(i_46_).append(')').toString());
		}
		return class153;
	}

	final void method2495(final int i, final Buffer class120_sub7) {
		try {
			this.aBoolean2041 = true;
			class120_sub7.pos++;
			this.anInt1995 = class120_sub7.getUByte();
			if ((0x80 & this.anInt1995) != 0) {
				this.anInt1995 &= 0x7f;
				class120_sub7.getJString();
			}
			this.anInt1975 = class120_sub7.getUShort();
			this.anInt2015 = class120_sub7.method1078(true);
			this.anInt2061 = class120_sub7.method1078(true);
			this.anInt2014 = class120_sub7.getUShort();
			this.anInt2060 = class120_sub7.getUShort();
			this.aByte1963 = class120_sub7.getByte();
			this.aByte2092 = class120_sub7.getByte();
			this.aByte2051 = class120_sub7.getByte();
			this.aByte2017 = class120_sub7.getByte();
			this.anInt2029 = class120_sub7.getUShort();
			if (this.anInt2029 == 65535) {
				this.anInt2029 = -1;
			} else {
				this.anInt2029 = (this.anInt1999 & ~0xffff) + this.anInt2029;
			}
			this.aBoolean2045 = class120_sub7.getUByte() == 1;
			if (this.anInt1995 == 0) {
				this.anInt1930 = class120_sub7.getUShort();
				this.anInt1937 = class120_sub7.getUShort();
				this.aBoolean1960 = class120_sub7.getUByte() == 1;
			}
			if (this.anInt1995 == 5) {
				this.anInt2055 = class120_sub7.getInt();
				this.anInt2070 = class120_sub7.getUShort();
				final int i_48_ = class120_sub7.getUByte();
				this.aBoolean2018 = (i_48_ & 0x2) != 0;
				this.aBoolean2001 = (0x1 & i_48_) != 0;
				this.anInt1974 = class120_sub7.getUByte();
				this.anInt2090 = class120_sub7.getUByte();
				this.anInt2026 = class120_sub7.getInt();
				this.aBoolean1943 = class120_sub7.getUByte() == 1;
				this.aBoolean1958 = class120_sub7.getUByte() == 1;
				this.anInt2025 = class120_sub7.getInt();
			}
			if (this.anInt1995 == 6) {
				this.anInt2031 = 1;
				this.anInt1961 = class120_sub7.getUShort();
				if (this.anInt1961 == 65535) {
					this.anInt1961 = -1;
				}
				this.anInt1981 = class120_sub7.method1078(true);
				this.anInt2008 = class120_sub7.method1078(true);
				this.anInt2047 = class120_sub7.getUShort();
				this.anInt2091 = class120_sub7.getUShort();
				this.anInt1935 = class120_sub7.getUShort();
				this.anInt2005 = class120_sub7.getUShort();
				this.anInt1945 = class120_sub7.getUShort();
				if ((this.anInt1945 ^ 0xffffffff) == -65536) {
					this.anInt1945 = -1;
				}
				this.aBoolean2046 = class120_sub7.getUByte() == 1;
				this.aShort2093 = (short) class120_sub7.getUShort();
				this.aShort2065 = (short) class120_sub7.getUShort();
				this.aBoolean2003 = class120_sub7.getUByte() == 1;
				if (this.aByte1963 != 0) {
					this.anInt2069 = class120_sub7.getUShort();
				}
				if (this.aByte2092 != 0) {
					this.anInt2007 = class120_sub7.getUShort();
				}
			}
			if (this.anInt1995 == 4) {
				this.anInt2067 = class120_sub7.getUShort();
				if (65535 == this.anInt2067) {
					this.anInt2067 = -1;
				}
				this.aString1950 = class120_sub7.getJString();
				this.anInt2057 = class120_sub7.getUByte();
				this.anInt2011 = class120_sub7.getUByte();
				this.anInt2009 = class120_sub7.getUByte();
				this.aBoolean2040 = class120_sub7.getUByte() == 1;
				this.anInt2025 = class120_sub7.getInt();
			}
			if (this.anInt1995 == 3) {
				this.anInt2025 = class120_sub7.getInt();
				this.aBoolean2019 = class120_sub7.getUByte() == 1;
				this.anInt1974 = class120_sub7.getUByte();
			}
			if (this.anInt1995 == 9) {
				this.anInt1967 = class120_sub7.getUByte();
				this.anInt2025 = class120_sub7.getInt();
				this.aBoolean1989 = class120_sub7.getUByte() == 1;
			}
			final int i_49_ = class120_sub7.getTriByte();
			int i_50_ = class120_sub7.getUByte();
			if (i_50_ != 0) {
				this.aByteArray2048 = new byte[10];
				this.anIntArray1985 = new int[10];
				this.aByteArray1955 = new byte[10];
				for (/**/; i_50_ != 0; i_50_ = class120_sub7.getUByte()) {
					final int i_51_ = -1 + (i_50_ >> 4);
					i_50_ = class120_sub7.getUByte() | i_50_ << 8;
					i_50_ &= 0xfff;
					if (i_50_ != 4095) {
						this.anIntArray1985[i_51_] = i_50_;
					} else {
						this.anIntArray1985[i_51_] = -1;
					}
					this.aByteArray2048[i_51_] = class120_sub7.getByte();
					this.aByteArray1955[i_51_] = class120_sub7.getByte();
				}
			}
			this.aString1964 = class120_sub7.getJString();
			final int i_52_ = class120_sub7.getUByte();
			final int i_53_ = i_52_ >> 4;
			final int i_54_ = 0xf & i_52_;
			if (i_54_ > 0) {
				this.aStringArray2052 = new String[i_54_];
				for (int i_55_ = 0; i_54_ > i_55_; i_55_++) {
					this.aStringArray2052[i_55_] = class120_sub7.getJString();
				}
			}
			if (i_53_ > 0) {
				final int i_56_ = class120_sub7.getUByte();
				this.anIntArray1992 = new int[i_56_ - -1];
				for (int i_57_ = 0; i_57_ < this.anIntArray1992.length; i_57_++) {
					this.anIntArray1992[i_57_] = -1;
				}
				this.anIntArray1992[i_56_] = class120_sub7.getUShort();
			}
			if (i_53_ > 1) {
				final int i_58_ = class120_sub7.getUByte();
				this.anIntArray1992[i_58_] = class120_sub7.getUShort();
			}
			this.aString1994 = class120_sub7.getJString();
			if (this.aString1994.equals("")) {
				this.aString1994 = null;
			}
			int i_59_ = -1;
			this.anInt1962 = class120_sub7.getUByte();
			this.anInt2066 = class120_sub7.getUByte();
			this.aBoolean1939 = class120_sub7.getUByte() == 1;
			this.aString2095 = class120_sub7.getJString();
			if (Class153.method2073(i_49_, 1841970955) != 0) {
				i_59_ = class120_sub7.getUShort();
				if (65535 == i_59_) {
					i_59_ = -1;
				}
				this.anInt2020 = class120_sub7.getUShort();
				if ((this.anInt2020 ^ 0xffffffff) == -65536) {
					this.anInt2020 = -1;
				}
				this.cursorId = class120_sub7.getUShort();
				if ((this.cursorId ^ 0xffffffff) == -65536) {
					this.cursorId = -1;
				}
			}
			this.aClass120_Sub20_1933 = new InterfaceClickMask(i_49_, i_59_);
			this.anObjectArray2034 = method2503(0, class120_sub7);
			this.anObjectArray2058 = method2503(i ^ i, class120_sub7);
			this.anObjectArray2074 = method2503(i ^ ~0x3920, class120_sub7);
			this.anObjectArray2000 = method2503(0, class120_sub7);
			this.anObjectArray1980 = method2503(0, class120_sub7);
			this.anObjectArray2050 = method2503(0, class120_sub7);
			this.anObjectArray1929 = method2503(0, class120_sub7);
			this.anObjectArray2054 = method2503(0, class120_sub7);
			this.anObjectArray1998 = method2503(0, class120_sub7);
			this.anObjectArray2006 = method2503(i + 14625, class120_sub7);
			this.anObjectArray1953 = method2503(0, class120_sub7);
			this.anObjectArray2080 = method2503(i ^ ~0x3920, class120_sub7);
			this.anObjectArray1993 = method2503(0, class120_sub7);
			this.anObjectArray2084 = method2503(0, class120_sub7);
			this.anObjectArray1951 = method2503(0, class120_sub7);
			this.anObjectArray1959 = method2503(0, class120_sub7);
			this.anObjectArray1947 = method2503(0, class120_sub7);
			this.anObjectArray2024 = method2503(0, class120_sub7);
			this.anObjectArray2062 = method2503(0, class120_sub7);
			this.anObjectArray2032 = method2503(0, class120_sub7);
			this.anIntArray2039 = method2493(-182, class120_sub7);
			this.anIntArray2063 = method2493(-182, class120_sub7);
			this.anIntArray2022 = method2493(i + 14443, class120_sub7);
			this.anIntArray2096 = method2493(i + 14443, class120_sub7);
			this.anIntArray1991 = method2493(-182, class120_sub7);
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("wf.N(").append(i).append(',').append(class120_sub7 != null ? "{...}" : "null").append(')').toString());
		}
	}

	final void method2496(final int i, final byte i_60_, final int i_61_) {
		try {
			int i_62_ = this.anIntArray1978[i];
			this.anIntArray1978[i] = this.anIntArray1978[i_61_];
			this.anIntArray1978[i_61_] = i_62_;
			if (i_60_ <= 53) {
				method2501(69);
			}
			i_62_ = this.anIntArray1983[i];
			this.anIntArray1983[i] = this.anIntArray1983[i_61_];
			this.anIntArray1983[i_61_] = i_62_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("wf.D(").append(i).append(',').append(i_60_).append(',').append(i_61_).append(')').toString());
		}
	}

	final Class120_Sub14_Sub8 method2497(final byte i, final Class107[] class107s) {
		Class120_Sub14_Sub8 class120_sub14_sub8;
		try {
			Class88.aBoolean835 = false;
			if ((this.anInt2067 ^ 0xffffffff) == 0) {
				return null;
			}
			if (i != 54) {
				return null;
			}
			Class120_Sub14_Sub8 class120_sub14_sub8_63_ = (Class120_Sub14_Sub8) Class120_Sub12_Sub2.aClass21_3143.method193(this.anInt2067, (byte) 63);
			if (class120_sub14_sub8_63_ != null) {
				return class120_sub14_sub8_63_;
			}
			class120_sub14_sub8_63_ = Class9.method117(Class89.aClass50_836, Class120_Sub12_Sub11.aClass50_3213, 18265, this.anInt2067, 0);
			if (class120_sub14_sub8_63_ == null) {
				Class88.aBoolean835 = true;
			} else {
				class120_sub14_sub8_63_.method1474(class107s, null);
				Class120_Sub12_Sub2.aClass21_3143.method185(-126, class120_sub14_sub8_63_, this.anInt2067);
			}
			class120_sub14_sub8 = class120_sub14_sub8_63_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("wf.M(").append(i).append(',').append(class107s != null ? "{...}" : "null").append(')').toString());
		}
		return class120_sub14_sub8;
	}

	public static void method2498(final int i) {
		try {
			aShortArray2042 = null;
			if (i > -54) {
				aShortArray2042 = null;
			}
			gameShellThread = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("wf.H(").append(i).append(')').toString());
		}
	}

	static final void method2499(final byte i, final int i_64_, final int i_65_) {
		try {
			Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putPacket(178);
			Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.method1115(255, i_64_);
			Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.method1086((byte) 21, i_65_);
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("wf.S(").append(i).append(',').append(i_64_).append(',').append(i_65_).append(')').toString());
		}
	}

	static final void method2500() {
		CursorType.anInt1237 = 0;
		while_176_: for (int i = 0; i < Class49.anInt438; i++) {
			final Class188 class188 = Class180.aClass188Array1782[i];
			if (Class61.anIntArray562 != null) {
				for (int i_66_ = 0; i_66_ < Class61.anIntArray562.length; i_66_++) {
					if (Class61.anIntArray562[i_66_] != -1000000 && (class188.anInt1920 <= Class61.anIntArray562[i_66_] || class188.anInt1928 <= Class61.anIntArray562[i_66_]) && (class188.anInt1913 <= Class180_Sub3.anIntArray2921[i_66_] || class188.anInt1924 <= Class180_Sub3.anIntArray2921[i_66_])
							&& (class188.anInt1913 >= Class31.anIntArray243[i_66_] || class188.anInt1924 >= Class31.anIntArray243[i_66_]) && (class188.anInt1911 <= IsaacCipher.anIntArray1015[i_66_] || class188.anInt1927 <= IsaacCipher.anIntArray1015[i_66_])
							&& (class188.anInt1911 >= Class89.anIntArray838[i_66_] || class188.anInt1927 >= Class89.anIntArray838[i_66_])) {
						continue while_176_;
					}
				}
			}
			if (class188.anInt1915 == 1) {
				final int i_67_ = class188.anInt1916 - Class120_Sub12_Sub26.anInt3332 + Class120_Sub14_Sub13.anInt3563;
				if (i_67_ >= 0 && i_67_ <= Class120_Sub14_Sub13.anInt3563 + Class120_Sub14_Sub13.anInt3563) {
					int i_68_ = class188.anInt1923 - Class112.anInt1080 + Class120_Sub14_Sub13.anInt3563;
					if (i_68_ < 0) {
						i_68_ = 0;
					}
					int i_69_ = class188.anInt1919 - Class112.anInt1080 + Class120_Sub14_Sub13.anInt3563;
					if (i_69_ > Class120_Sub14_Sub13.anInt3563 + Class120_Sub14_Sub13.anInt3563) {
						i_69_ = Class120_Sub14_Sub13.anInt3563 + Class120_Sub14_Sub13.anInt3563;
					}
					boolean bool = false;
					while_172_: do {
						do {
							if (i_68_ > i_69_) {
								break while_172_;
							}
						} while (!SpotAnimType.aBooleanArrayArray992[i_67_][i_68_++]);
						bool = true;
					} while (false);
					if (bool) {
						int i_70_ = DisplayModeInfo.anInt1713 - class188.anInt1913;
						if (i_70_ > 32) {
							class188.anInt1921 = 1;
						} else {
							if (i_70_ >= -32) {
								continue;
							}
							class188.anInt1921 = 2;
							i_70_ = -i_70_;
						}
						class188.anInt1914 = (class188.anInt1911 - Class145.anInt1381 << 8) / i_70_;
						class188.anInt1922 = (class188.anInt1927 - Class145.anInt1381 << 8) / i_70_;
						class188.anInt1918 = (class188.anInt1920 - PlayerAppearance.anInt1367 << 8) / i_70_;
						class188.anInt1917 = (class188.anInt1928 - PlayerAppearance.anInt1367 << 8) / i_70_;
						Class180_Sub6.aClass188Array3076[CursorType.anInt1237++] = class188;
					}
				}
			} else if (class188.anInt1915 == 2) {
				final int i_71_ = class188.anInt1923 - Class112.anInt1080 + Class120_Sub14_Sub13.anInt3563;
				if (i_71_ >= 0 && i_71_ <= Class120_Sub14_Sub13.anInt3563 + Class120_Sub14_Sub13.anInt3563) {
					int i_72_ = class188.anInt1916 - Class120_Sub12_Sub26.anInt3332 + Class120_Sub14_Sub13.anInt3563;
					if (i_72_ < 0) {
						i_72_ = 0;
					}
					int i_73_ = class188.anInt1910 - Class120_Sub12_Sub26.anInt3332 + Class120_Sub14_Sub13.anInt3563;
					if (i_73_ > Class120_Sub14_Sub13.anInt3563 + Class120_Sub14_Sub13.anInt3563) {
						i_73_ = Class120_Sub14_Sub13.anInt3563 + Class120_Sub14_Sub13.anInt3563;
					}
					boolean bool = false;
					while_173_: do {
						do {
							if (i_72_ > i_73_) {
								break while_173_;
							}
						} while (!SpotAnimType.aBooleanArrayArray992[i_72_++][i_71_]);
						bool = true;
					} while (false);
					if (bool) {
						int i_74_ = Class145.anInt1381 - class188.anInt1911;
						if (i_74_ > 32) {
							class188.anInt1921 = 3;
						} else {
							if (i_74_ >= -32) {
								continue;
							}
							class188.anInt1921 = 4;
							i_74_ = -i_74_;
						}
						class188.anInt1912 = (class188.anInt1913 - DisplayModeInfo.anInt1713 << 8) / i_74_;
						class188.anInt1926 = (class188.anInt1924 - DisplayModeInfo.anInt1713 << 8) / i_74_;
						class188.anInt1918 = (class188.anInt1920 - PlayerAppearance.anInt1367 << 8) / i_74_;
						class188.anInt1917 = (class188.anInt1928 - PlayerAppearance.anInt1367 << 8) / i_74_;
						Class180_Sub6.aClass188Array3076[CursorType.anInt1237++] = class188;
					}
				}
			} else if (class188.anInt1915 == 4) {
				final int i_75_ = class188.anInt1920 - PlayerAppearance.anInt1367;
				if (i_75_ > 128) {
					int i_76_ = class188.anInt1923 - Class112.anInt1080 + Class120_Sub14_Sub13.anInt3563;
					if (i_76_ < 0) {
						i_76_ = 0;
					}
					int i_77_ = class188.anInt1919 - Class112.anInt1080 + Class120_Sub14_Sub13.anInt3563;
					if (i_77_ > Class120_Sub14_Sub13.anInt3563 + Class120_Sub14_Sub13.anInt3563) {
						i_77_ = Class120_Sub14_Sub13.anInt3563 + Class120_Sub14_Sub13.anInt3563;
					}
					if (i_76_ <= i_77_) {
						int i_78_ = class188.anInt1916 - Class120_Sub12_Sub26.anInt3332 + Class120_Sub14_Sub13.anInt3563;
						if (i_78_ < 0) {
							i_78_ = 0;
						}
						int i_79_ = class188.anInt1910 - Class120_Sub12_Sub26.anInt3332 + Class120_Sub14_Sub13.anInt3563;
						if (i_79_ > Class120_Sub14_Sub13.anInt3563 + Class120_Sub14_Sub13.anInt3563) {
							i_79_ = Class120_Sub14_Sub13.anInt3563 + Class120_Sub14_Sub13.anInt3563;
						}
						boolean bool = false;
						while_174_: for (int i_80_ = i_78_; i_80_ <= i_79_; i_80_++) {
							for (int i_81_ = i_76_; i_81_ <= i_77_; i_81_++) {
								if (SpotAnimType.aBooleanArrayArray992[i_80_][i_81_]) {
									bool = true;
									break while_174_;
								}
							}
						}
						if (bool) {
							class188.anInt1921 = 5;
							class188.anInt1912 = (class188.anInt1913 - DisplayModeInfo.anInt1713 << 8) / i_75_;
							class188.anInt1926 = (class188.anInt1924 - DisplayModeInfo.anInt1713 << 8) / i_75_;
							class188.anInt1914 = (class188.anInt1911 - Class145.anInt1381 << 8) / i_75_;
							class188.anInt1922 = (class188.anInt1927 - Class145.anInt1381 << 8) / i_75_;
							Class180_Sub6.aClass188Array3076[CursorType.anInt1237++] = class188;
						}
					}
				}
			}
		}
	}

	final boolean method2501(final int i) {
		boolean bool;
		try {
			if (this.anIntArray2079 != null) {
				return true;
			}
			final Class107_Sub1 class107_sub1 = Class164.method2138(i + 33, 0, Class89.aClass50_836, this.anInt2055);
			if (class107_sub1 == null) {
				return false;
			}
			class107_sub1.method923();
			this.anIntArray1949 = new int[class107_sub1.anInt1030];
			this.anIntArray2079 = new int[class107_sub1.anInt1030];
			if (i != -1) {
				this.anIntArray1973 = null;
			}
			for (int i_82_ = 0; i_82_ < class107_sub1.anInt1030; i_82_++) {
				int i_83_ = 0;
				for (int i_84_ = 0; i_84_ < class107_sub1.anInt1026; i_84_++) {
					if (class107_sub1.aByteArray2306[i_84_ + i_82_ * class107_sub1.anInt1026] != 0) {
						i_83_ = i_84_;
						break;
					}
				}
				int i_85_ = class107_sub1.anInt1026;
				for (int i_86_ = i_83_; class107_sub1.anInt1026 > i_86_; i_86_++) {
					if (class107_sub1.aByteArray2306[class107_sub1.anInt1026 * i_82_ + i_86_] == 0) {
						i_85_ = i_86_;
						break;
					}
				}
				this.anIntArray2079[i_82_] = i_83_;
				this.anIntArray1949[i_82_] = i_85_ + -i_83_;
			}
			bool = true;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("wf.E(").append(i).append(')').toString());
		}
		return bool;
	}

	static final long method2502(final int i, final int i_87_, final int i_88_) {
		final Class120_Sub18 class120_sub18 = Class120_Sub1.aClass120_Sub18ArrayArrayArray2411[i][i_87_][i_88_];
		if (class120_sub18 == null || class120_sub18.aClass186_2639 == null) {
			return 0L;
		}
		return class120_sub18.aClass186_2639.aLong1904;
	}

	private final Object[] method2503(final int i, final Buffer class120_sub7) {
		Object[] objects;
		try {
			final int i_89_ = class120_sub7.getUByte();
			if (i_89_ == 0) {
				return null;
			}
			final Object[] objects_90_ = new Object[i_89_];
			for (int i_91_ = i; i_89_ > i_91_; i_91_++) {
				final int i_92_ = class120_sub7.getUByte();
				if (i_92_ != 0) {
					if (i_92_ == 1) {
						objects_90_[i_91_] = class120_sub7.getJString();
					}
				} else {
					objects_90_[i_91_] = new Integer(class120_sub7.getInt());
				}
			}
			this.aBoolean1940 = true;
			objects = objects_90_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("wf.P(").append(i).append(',').append(class120_sub7 != null ? "{...}" : "null").append(')').toString());
		}
		return objects;
	}

	public Class189() {
		this.cursorId = -1;
		this.aBoolean1971 = false;
		this.aBoolean1939 = false;
		this.aBoolean1940 = false;
		this.anInt1974 = 0;
		this.anInt1981 = 0;
		this.aString1934 = Class120_Sub12_Sub28.aString3360;
		this.anInt1962 = 0;
		this.aByte1963 = (byte) 0;
		this.anInt1930 = 0;
		this.anInt1999 = -1;
		this.aBoolean1989 = false;
		this.aBoolean2003 = false;
		this.anInt2011 = 0;
		this.aBoolean2018 = false;
		this.aString1936 = "";
		this.anInt1997 = -1;
		this.anInt2023 = 0;
		this.anInt1972 = 0;
		this.aString1979 = "";
		this.aBoolean2019 = false;
		this.anInt2025 = 0;
		this.anInt1948 = 0;
		this.anInt1938 = 0;
		this.anInt1990 = -1;
		this.anInt2015 = 0;
		this.aBoolean2045 = false;
		this.anInt2005 = 100;
		this.aBoolean2035 = false;
		this.anInt2007 = 0;
		this.aBoolean2046 = false;
		this.anInt1967 = 1;
		this.anInt2033 = 0;
		this.anInt2010 = -1;
		this.anInt2026 = 0;
		this.aBoolean2001 = false;
		this.anInt2047 = 0;
		this.anInt1969 = 0;
		this.aByte2017 = (byte) 0;
		this.anInt2059 = 0;
		this.anInt2028 = 0;
		this.anInt2020 = -1;
		this.anInt2030 = -1;
		this.anInt2066 = 0;
		this.aBoolean1956 = true;
		this.aShort2065 = (short) 3000;
		this.anInt2049 = -1;
		this.anInt2021 = 0;
		anInt1987 = 1;
		this.anInt2057 = 0;
		this.aBoolean2040 = false;
		this.anInt2043 = 0;
		this.anInt1975 = 0;
		this.anInt2044 = 0;
		this.anInt1946 = 0;
		this.anInt1937 = 0;
		this.anInt1996 = 0;
		this.anInt2029 = -1;
		this.aByte2051 = (byte) 0;
		this.anInt2014 = 0;
		this.anInt2009 = 0;
		this.anInt2012 = -1;
		this.anInt1945 = -1;
		this.anInt2077 = 0;
		this.anInt1982 = 1;
		anInt2016 = -1;
		this.anInt2075 = 0;
		this.anInt2067 = -1;
		this.aString1964 = "";
		this.anInt2064 = 0;
		this.aClass120_Sub20_1933 = Class110.aClass120_Sub20_1053;
		this.anInt2081 = 0;
		this.anInt2060 = 0;
		this.anInt2069 = 0;
		this.anInt2087 = 0;
		this.anInt2082 = -1;
		this.anInt2076 = 0;
		this.aBoolean2041 = false;
		this.aBoolean1960 = false;
		this.anInt2031 = 1;
		this.anInt2070 = 0;
		this.anInt1968 = -1;
		this.anInt1977 = 0;
		this.anInt2091 = 0;
		this.anInt2037 = 0;
		this.anInt2073 = 0;
		this.aShort2093 = (short) 0;
		this.aByte2092 = (byte) 0;
		this.anInt2055 = -1;
		this.anInt2083 = -1;
		this.anInt2061 = 0;
		this.anInt2090 = 0;
		this.aBoolean2097 = false;
		this.anInt2008 = 0;
		this.anInt2088 = -1;
		this.aString2095 = "";
		this.anInt2098 = 1;
		this.anInt2085 = 1;
	}
}
