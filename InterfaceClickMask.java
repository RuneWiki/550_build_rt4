/* Class120_Sub20 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class InterfaceClickMask extends Node {
	static boolean safeModeEnabled = false;
	static String aString2660 = "Loading fonts - ";
	int anInt2661;
	int anInt2662;
	static Class21 aClass21_2663 = new Class21(500);

	final boolean method1677(final byte i) {
		boolean bool;
		try {
			bool = (0x1 & this.anInt2662 >> 21) != 0;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("on.E(").append(i).append(')').toString());
		}
		return bool;
	}

	final boolean method1678(final int i, final int i_0_) {
		boolean bool;
		try {
			if (i_0_ <= 24) {
				method1677((byte) 72);
			}
			bool = (0x1 & this.anInt2662 >> i - -1) != 0;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("on.G(").append(i).append(',').append(i_0_).append(')').toString());
		}
		return bool;
	}

	static final void method1679(final Node node, final byte i, final Node class120_1_) {
		try {
			if (i < -78) {
				if (class120_1_.previous != null) {
					class120_1_.unlink();
				}
				class120_1_.next = node;
				class120_1_.previous = node.previous;
				class120_1_.previous.next = class120_1_;
				class120_1_.next.previous = class120_1_;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("on.B(").append(node != null ? "{...}" : "null").append(',').append(i).append(',').append(class120_1_ != null ? "{...}" : "null").append(')').toString());
		}
	}

	static final void method1680(final byte i, final int i_2_) {
		try {
			Class120_Sub12_Sub31.aClass21_3378.method192((byte) 35, i_2_);
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("on.M(").append(i).append(',').append(i_2_).append(')').toString());
		}
	}

	final boolean method1681(final int i) {
		boolean bool;
		try {
			if (i != -9617) {
				method1689(-102, 76, (byte) -19);
			}
			bool = (this.anInt2662 & 0x107da4ce) >> 28 != 0;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("on.Q(").append(i).append(')').toString());
		}
		return bool;
	}

	static final void redrawInterface(final Class189 class189) {
		if (class189.anInt1968 == Class84.anInt796) {
			Class52.aBooleanArray467[class189.anInt2082] = true;
		}
	}

	final int method1683(final byte i) {
		int i_3_;
		try {
			if (i != 45) {
				return -14;
			}
			i_3_ = 0x7 & this.anInt2662 >> 18;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("on.D(").append(i).append(')').toString());
		}
		return i_3_;
	}

	public static void method1684(final int i) {
		try {
			aClass21_2663 = null;
			if (i == 1023) {
				aString2660 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("on.N(").append(i).append(')').toString());
		}
	}

	final int method1685(final int i) {
		int i_4_;
		try {
			if (i != 1105924391) {
				return -75;
			}
			i_4_ = Class153.method2073(this.anInt2662, i ^ 0x2c212e2c);
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("on.P(").append(i).append(')').toString());
		}
		return i_4_;
	}

	final boolean method1686(final byte i) {
		boolean bool;
		try {
			if (i != -101) {
				return false;
			}
			bool = (this.anInt2662 & 0x1) != 0;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("on.H(").append(i).append(')').toString());
		}
		return bool;
	}

	final boolean method1687(final int i) {
		boolean bool;
		try {
			if (i <= 103) {
				return false;
			}
			bool = (0x1 & this.anInt2662 >> 31) != 0;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("on.F(").append(i).append(')').toString());
		}
		return bool;
	}

	static final int method1688(final int i, final int i_5_) {
		int i_6_;
		try {
			final double d = (0xff & i_5_ >> 16) / 256.0;
			final double d_7_ = ((0xff65 & i_5_) >> 8) / 256.0;
			double d_8_ = d;
			if (d_7_ < d_8_) {
				d_8_ = d_7_;
			}
			final double d_9_ = (0xff & i_5_) / 256.0;
			double d_10_ = d;
			if (d_8_ > d_9_) {
				d_8_ = d_9_;
			}
			if (d_10_ < d_7_) {
				d_10_ = d_7_;
			}
			if (d_9_ > d_10_) {
				d_10_ = d_9_;
			}
			double d_11_ = 0.0;
			final double d_12_ = (d_8_ + d_10_) / 2.0;
			double d_13_ = 0.0;
			int i_14_ = (int) (d_12_ * 256.0);
			if (i_14_ >= 0) {
				if (i_14_ > 255) {
					i_14_ = 255;
				}
			} else {
				i_14_ = 0;
			}
			if (d_10_ != d_8_) {
				if (d != d_10_) {
					if (d_7_ == d_10_) {
						d_11_ = 2.0 + (d_9_ - d) / (-d_8_ + d_10_);
					} else if (d_9_ == d_10_) {
						d_11_ = 4.0 + (-d_7_ + d) / (-d_8_ + d_10_);
					}
				} else {
					d_11_ = (-d_9_ + d_7_) / (-d_8_ + d_10_);
				}
				if (0.5 > d_12_) {
					d_13_ = (d_10_ - d_8_) / (d_8_ + d_10_);
				}
				if (0.5 <= d_12_) {
					d_13_ = (-d_8_ + d_10_) / (2.0 - d_10_ - d_8_);
				}
			}
			int i_15_ = (int) (256.0 * d_13_);
			if (i < 72) {
				return 101;
			}
			if (i_15_ < 0) {
				i_15_ = 0;
			} else if (i_15_ > 255) {
				i_15_ = 255;
			}
			d_11_ /= 6.0;
			final int i_16_ = (int) (256.0 * d_11_);
			if (i_14_ <= 243) {
				if (i_14_ <= 217) {
					if (i_14_ <= 192) {
						if (i_14_ > 179) {
							i_15_ >>= 1;
						}
					} else {
						i_15_ >>= 2;
					}
				} else {
					i_15_ >>= 3;
				}
			} else {
				i_15_ >>= 4;
			}
			i_6_ = (i_14_ >> 1) + (i_15_ >> 5 << 7) + (i_16_ >> 2 << 10);
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("on.L(").append(i).append(',').append(i_5_).append(')').toString());
		}
		return i_6_;
	}

	static final void method1689(final int i, final int i_17_, final byte i_18_) {
		try {
			if (i_18_ >= 48 && Class50.method434(-49, i)) {
				Class137.method1980(true, Node.aClass189ArrayArray1150[i], i_17_);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("on.I(").append(i).append(',').append(i_17_).append(',').append(i_18_).append(')').toString());
		}
	}

	static final void method1690(final int i, final int i_19_) {
		try {
			Class56.aClass21_494.method192((byte) -84, i_19_);
			aClass21_2663.method192((byte) 89, i_19_);
			Class167.aClass21_1618.method192((byte) 63, i_19_);
			Class116.aClass21_1117.method192((byte) -82, i_19_);
			if (i != 23) {
				method1680((byte) 59, 102);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("on.O(").append(i).append(',').append(i_19_).append(')').toString());
		}
	}

	final boolean method1691(final int i) {
		boolean bool;
		try {
			if (i >= -12) {
				safeModeEnabled = false;
			}
			bool = (this.anInt2662 >> 29 & 0x1) != 0;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("on.R(").append(i).append(')').toString());
		}
		return bool;
	}

	final boolean method1692(final boolean bool) {
		boolean bool_20_;
		try {
			if (bool) {
				return false;
			}
			bool_20_ = (0x1 & this.anInt2662 >> 22) != 0;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("on.K(").append(bool).append(')').toString());
		}
		return bool_20_;
	}

	static final void method1693(final int i) {
		try {
			if (i != -15681) {
				redrawInterface(null);
			}
			Class120_Sub14_Sub14_Sub2.aClass21_3937.method186((byte) 86);
			Class132.aClass21_1255.method186((byte) 86);
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("on.A(").append(i).append(')').toString());
		}
	}

	final boolean method1694(final int i) {
		boolean bool;
		try {
			if (i != 500) {
				method1691(-126);
			}
			bool = (0x4b87f889 & this.anInt2662) >> 30 != 0;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("on.J(").append(i).append(')').toString());
		}
		return bool;
	}

	InterfaceClickMask(final int i, final int i_21_) {
		this.anInt2662 = i;
		this.anInt2661 = i_21_;
	}
}
