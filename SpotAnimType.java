/* Class103 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class SpotAnimType {
	private int anInt985 = 0;
	static int anInt986;
	static int[] anIntArray987 = { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };
	private int anInt988;
	boolean aBoolean989;
	private int anInt990;
	int anInt991 = -1;
	static boolean[][] aBooleanArrayArray992;
	private short[] aShortArray993;
	static short[] aShortArray994;
	private int anInt995;
	private int anInt996;
	int anInt997;
	boolean aBoolean998;
	private int anInt999;
	private short[] aShortArray1000;
	private short[] aShortArray1001;
	private short[] aShortArray1002;

	static final boolean method875(final int i, final String string) {
		boolean bool;
		try {
			if (string == null) {
				return false;
			}
			for (int i_0_ = 0; ProducingGraphicsBuffer.anInt2799 > i_0_; i_0_++) {
				if (string.equalsIgnoreCase(Class120_Sub16.aStringArray2599[i_0_])) {
					return true;
				}
			}
			if (string.equalsIgnoreCase(Class100.selfPlayer.aString3745)) {
				return true;
			}
			bool = false;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("li.C(").append(i).append(',').append(string != null ? "{...}" : "null").append(')').toString());
		}
		return bool;
	}

	static final void method876(final byte i) {
		try {
			if (i > 96) {
				for (int i_1_ = 0; i_1_ < 5; i_1_++) {
					Class120_Sub12_Sub12.aBooleanArray3223[i_1_] = false;
				}
				AbstractGraphicsBuffer.anInt1157 = -1;
				Class120_Sub12_Sub31.anInt3384 = 0;
				Class101_Sub1.anInt2272 = 0;
				Class120_Sub12_Sub15.anInt3248 = -1;
				client.anInt2200 = 1;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("li.D(").append(i).append(')').toString());
		}
	}

	private final void method877(final int i, final int i_2_, final Buffer class120_sub7) {
		try {
			if (i_2_ < 102) {
				method880(-113);
			}
			if (i == 1) {
				anInt995 = class120_sub7.getUShort();
			} else if (i == 2) {
				this.anInt991 = class120_sub7.getUShort();
			} else if (i == 4) {
				anInt990 = class120_sub7.getUShort();
			} else if (i != 5) {
				if (i != 6) {
					if (i == 7) {
						anInt985 = class120_sub7.getUByte();
					} else if (i == 8) {
						anInt988 = class120_sub7.getUByte();
					} else if (i != 9) {
						if (i != 10) {
							if (i == 40) {
								final int i_3_ = class120_sub7.getUByte();
								aShortArray993 = new short[i_3_];
								aShortArray1002 = new short[i_3_];
								for (int i_4_ = 0; i_3_ > i_4_; i_4_++) {
									aShortArray1002[i_4_] = (short) class120_sub7.getUShort();
									aShortArray993[i_4_] = (short) class120_sub7.getUShort();
								}
							} else if (i == 41) {
								final int i_5_ = class120_sub7.getUByte();
								aShortArray1000 = new short[i_5_];
								aShortArray1001 = new short[i_5_];
								for (int i_6_ = 0; i_6_ < i_5_; i_6_++) {
									aShortArray1000[i_6_] = (short) class120_sub7.getUShort();
									aShortArray1001[i_6_] = (short) class120_sub7.getUShort();
								}
							}
						} else {
							this.aBoolean998 = true;
						}
					} else {
						this.aBoolean989 = true;
					}
				} else {
					anInt996 = class120_sub7.getUShort();
				}
			} else {
				anInt999 = class120_sub7.getUShort();
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("li.A(").append(i).append(',').append(i_2_).append(',').append(class120_sub7 != null ? "{...}" : "null").append(')').toString());
		}
	}

	public static void method878(final int i) {
		try {
			anIntArray987 = null;
			aShortArray994 = null;
			if (i == 0) {
				aBooleanArrayArray992 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("li.E(").append(i).append(')').toString());
		}
	}

	static final int[] method879(final int[] is, final int i) {
		int[] is_7_;
		try {
			if (is == null) {
				return null;
			}
			if (i > -102) {
				return null;
			}
			final int[] is_8_ = new int[is.length];
			Class4.method90(is, 0, is_8_, 0, is.length);
			is_7_ = is_8_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("li.F(").append(is != null ? "{...}" : "null").append(',').append(i).append(')').toString());
		}
		return is_7_;
	}

	static final void method880(final int i) {
		try {
			if (HDToolkit.glEnabled) {
				if (i < 114) {
					aBooleanArrayArray992 = null;
				}
				if (!Class93.aBoolean870) {
					final Class120_Sub18[][][] class120_sub18s = Class120_Sub1.aClass120_Sub18ArrayArrayArray2411;
					Class120_Sub18[][][] class120_sub18s_10_;
					final int i_9_ = (class120_sub18s_10_ = class120_sub18s).length;
					for (int i_11_ = 0; i_11_ < i_9_; i_11_++) {
						final Class120_Sub18[][] class120_sub18s_12_ = class120_sub18s_10_[i_11_];
						for (final Class120_Sub18[] element : class120_sub18s_12_) {
							for (int i_14_ = 0; element.length > i_14_; i_14_++) {
								final Class120_Sub18 class120_sub18 = element[i_14_];
								if (class120_sub18 != null) {
									if (class120_sub18.aClass36_2650 != null && class120_sub18.aClass36_2650.aClass180_309 instanceof Class180_Sub7_Sub2) {
										final Class180_Sub7_Sub2 class180_sub7_sub2 = (Class180_Sub7_Sub2) class120_sub18.aClass36_2650.aClass180_309;
										if (0L == (~0x7fffffffffffffffL & class120_sub18.aClass36_2650.aLong308)) {
											class180_sub7_sub2.method2432(false, true, true, true, false, true, true);
										} else {
											class180_sub7_sub2.method2432(true, true, true, true, true, true, true);
										}
									}
									if (class120_sub18.aClass186_2639 != null) {
										if (class120_sub18.aClass186_2639.aClass180_1901 instanceof Class180_Sub7_Sub2) {
											final Class180_Sub7_Sub2 class180_sub7_sub2 = (Class180_Sub7_Sub2) class120_sub18.aClass186_2639.aClass180_1901;
											if ((class120_sub18.aClass186_2639.aLong1904 & ~0x7fffffffffffffffL) != 0L) {
												class180_sub7_sub2.method2432(true, true, true, true, true, true, true);
											} else {
												class180_sub7_sub2.method2432(false, true, true, true, false, true, true);
											}
										}
										if (class120_sub18.aClass186_2639.aClass180_1898 instanceof Class180_Sub7_Sub2) {
											final Class180_Sub7_Sub2 class180_sub7_sub2 = (Class180_Sub7_Sub2) class120_sub18.aClass186_2639.aClass180_1898;
											if (0L == (~0x7fffffffffffffffL & class120_sub18.aClass186_2639.aLong1904)) {
												class180_sub7_sub2.method2432(false, true, true, true, false, true, true);
											} else {
												class180_sub7_sub2.method2432(true, true, true, true, true, true, true);
											}
										}
									}
									if (class120_sub18.aClass182_2628 != null) {
										if (class120_sub18.aClass182_2628.aClass180_1800 instanceof Class180_Sub7_Sub2) {
											final Class180_Sub7_Sub2 class180_sub7_sub2 = (Class180_Sub7_Sub2) class120_sub18.aClass182_2628.aClass180_1800;
											if ((~0x7fffffffffffffffL & class120_sub18.aClass182_2628.aLong1794) == 0L) {
												class180_sub7_sub2.method2432(false, true, true, true, false, true, true);
											} else {
												class180_sub7_sub2.method2432(true, true, true, true, true, true, true);
											}
										}
										if (class120_sub18.aClass182_2628.aClass180_1796 instanceof Class180_Sub7_Sub2) {
											final Class180_Sub7_Sub2 class180_sub7_sub2 = (Class180_Sub7_Sub2) class120_sub18.aClass182_2628.aClass180_1796;
											if (-1L != (class120_sub18.aClass182_2628.aLong1794 & ~0x7fffffffffffffffL ^ 0xffffffffffffffffL)) {
												class180_sub7_sub2.method2432(true, true, true, true, true, true, true);
											} else {
												class180_sub7_sub2.method2432(false, true, true, true, false, true, true);
											}
										}
									}
									for (int i_15_ = 0; class120_sub18.anInt2638 > i_15_; i_15_++) {
										if (class120_sub18.aClass28Array2625[i_15_].aClass180_174 instanceof Class180_Sub7_Sub2) {
											final Class180_Sub7_Sub2 class180_sub7_sub2 = (Class180_Sub7_Sub2) class120_sub18.aClass28Array2625[i_15_].aClass180_174;
											if (0L == (~0x7fffffffffffffffL & class120_sub18.aClass28Array2625[i_15_].aLong186)) {
												class180_sub7_sub2.method2432(false, true, true, true, false, true, true);
											} else {
												class180_sub7_sub2.method2432(true, true, true, true, true, true, true);
											}
										}
									}
								}
							}
						}
					}
					Class93.aBoolean870 = true;
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("li.G(").append(i).append(')').toString());
		}
	}

	final void method881(final Buffer class120_sub7, final boolean bool) {
		try {
			for (;;) {
				final int i = class120_sub7.getUByte();
				if (i == 0) {
					break;
				}
				method877(i, 114, class120_sub7);
			}
			if (bool) {
				anInt988 = 122;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("li.H(").append(class120_sub7 != null ? "{...}" : "null").append(',').append(bool).append(')').toString());
		}
	}

	final Class180_Sub7 method882(final int i, final int i_16_, final int i_17_, final byte i_18_) {
		Class180_Sub7 class180_sub7;
		try {
			Class180_Sub7 class180_sub7_19_ = (Class180_Sub7) Class182.aClass21_1798.method193(this.anInt997, (byte) -97);
			if (class180_sub7_19_ == null) {
				final Class180_Sub2 class180_sub2 = Class180_Sub2.method2291(Class90.aClass50_843, anInt995, 0);
				if (class180_sub2 == null) {
					return null;
				}
				if (aShortArray1002 != null) {
					for (int i_20_ = 0; i_20_ < aShortArray1002.length; i_20_++) {
						class180_sub2.method2307(aShortArray1002[i_20_], aShortArray993[i_20_]);
					}
				}
				if (aShortArray1000 != null) {
					for (int i_21_ = 0; aShortArray1000.length > i_21_; i_21_++) {
						class180_sub2.method2292(aShortArray1000[i_21_], aShortArray1001[i_21_]);
					}
				}
				class180_sub7_19_ = class180_sub2.method2300(anInt985 + 64, 850 + anInt988, -30, -50, -30);
				Class182.aClass21_1798.method185(-127, class180_sub7_19_, this.anInt997);
			}
			Class180_Sub7 class180_sub7_22_;
			if ((this.anInt991 ^ 0xffffffff) == 0 || (i_17_ ^ 0xffffffff) == 0) {
				class180_sub7_22_ = class180_sub7_19_.method2381(true, true, true);
			} else {
				class180_sub7_22_ = Class120_Sub30_Sub2.method1763(this.anInt991, i_18_ ^ 0x72).method324(98, i_17_, i_16_, class180_sub7_19_, i);
			}
			if (anInt990 != 128 || anInt999 != 128) {
				class180_sub7_22_.method2369(anInt990, anInt999, anInt990);
			}
			if (anInt996 != 0) {
				if (anInt996 == 90) {
					class180_sub7_22_.method2365();
				}
				if (anInt996 == 180) {
					class180_sub7_22_.method2373();
				}
				if (anInt996 == 270) {
					class180_sub7_22_.method2372();
				}
			}
			if (i_18_ != 14) {
				method879(null, -17);
			}
			class180_sub7 = class180_sub7_22_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("li.B(").append(i).append(',').append(i_16_).append(',').append(i_17_).append(',').append(i_18_).append(')').toString());
		}
		return class180_sub7;
	}

	static final SpotAnimType list(final int i_18_) {
		SpotAnimType class103_19_ = (SpotAnimType) Class141.aClass21_1350.method193(i_18_, (byte) 99);
		if (class103_19_ != null) {
			return class103_19_;
		}
		final byte[] is = Class154.aClass50_1443.method442(Class127.method1897(i_18_, 101), (byte) 123, Class76.method663(i_18_, (byte) -67));
		class103_19_ = new SpotAnimType();
		class103_19_.anInt997 = i_18_;
		if (is != null) {
			class103_19_.method881(new Buffer(is), false);
		}
		Class141.aClass21_1350.method185(-128, class103_19_, i_18_);
		return class103_19_;
	}

	public SpotAnimType() {
		this.aBoolean989 = false;
		anInt990 = 128;
		anInt999 = 128;
		anInt996 = 0;
		this.aBoolean998 = false;
		anInt988 = 0;
	}
}
