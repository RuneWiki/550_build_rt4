/* Class120_Sub20 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class InterfaceClickMask extends Node {
	static boolean safeModeEnabled = false;
	static String aString2660 = "Loading fonts - ";
	int paramId;
	int optionMask;
	static ObjectCache aClass21_2663 = new ObjectCache(500);

	final boolean method1677(final byte i) {
		boolean bool;
		try {
			bool = (0x1 & this.optionMask >> 21) != 0;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("on.E(").append(i).append(')').toString());
		}
		return bool;
	}

	final boolean method1678(final int i) {
		return (0x1 & this.optionMask >> i + 1) != 0;
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
			throw EnumType.method1428(runtimeexception, new StringBuilder("on.B(").append(node != null ? "{...}" : "null").append(',').append(i).append(',').append(class120_1_ != null ? "{...}" : "null").append(')').toString());
		}
	}

	final boolean method1681(final int i) {
		boolean bool;
		try {
			if (i != -9617) {
				method1689(76, -102);
			}
			bool = (this.optionMask & 0x107da4ce) >> 28 != 0;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("on.Q(").append(i).append(')').toString());
		}
		return bool;
	}

	static final void redrawInterface(final JagexInterface jagexInterface) {
		if (jagexInterface.redrawCycle == Class84.anInt796) {
			Class52.needInterfaceRedrawWrapper[jagexInterface.redrawId] = true;
		}
	}

	final int method1683() {
		return 0x7 & this.optionMask >> 18;
	}

	public static void method1684() {
		aClass21_2663 = null;
		aString2660 = null;
	}

	final int method1685(final int i) {
		return Class153.method2073(this.optionMask);
	}

	final boolean method1686(final byte i) {
		boolean bool;
		try {
			if (i != -101) {
				return false;
			}
			bool = (this.optionMask & 0x1) != 0;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("on.H(").append(i).append(')').toString());
		}
		return bool;
	}

	final boolean method1687(final int i) {
		boolean bool;
		try {
			if (i <= 103) {
				return false;
			}
			bool = (0x1 & this.optionMask >> 31) != 0;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("on.F(").append(i).append(')').toString());
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
			throw EnumType.method1428(runtimeexception, new StringBuilder("on.L(").append(i).append(',').append(i_5_).append(')').toString());
		}
		return i_6_;
	}

	static final void method1689(final int i_17_, final int i) {
		if (js5.loadInterface(i)) {
			Class137.method1980(Node.interfaceCache[i], i_17_);
		}
	}

	final boolean method1691() {
		return (this.optionMask >> 29 & 0x1) != 0;
	}

	final boolean method1692(final boolean bool) {
		boolean bool_20_;
		try {
			if (bool) {
				return false;
			}
			bool_20_ = (0x1 & this.optionMask >> 22) != 0;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("on.K(").append(bool).append(')').toString());
		}
		return bool_20_;
	}

	static final void method1693() {
		Class120_Sub14_Sub14_Sub2.aClass21_3937.clear();
		Class132.aClass21_1255.clear();
	}

	final boolean method1694(final int i) {
		boolean bool;
		try {
			if (i != 500) {
				method1691();
			}
			bool = (0x4b87f889 & this.optionMask) >> 30 != 0;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("on.J(").append(i).append(')').toString());
		}
		return bool;
	}

	InterfaceClickMask(final int i, final int i_21_) {
		this.optionMask = i;
		this.paramId = i_21_;
	}
}
