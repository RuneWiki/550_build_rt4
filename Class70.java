/* Class70 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class70 {
	static short[] aShortArray620 = { -4160, -4163, -8256, -8259, 22461 };
	int anInt621 = 0;
	static float aFloat622;
	static int anInt623 = 2301979;

	static final void method632(final byte i, final Class189 class189, final int i_0_, final int i_1_, final int i_2_, final int i_3_, final int i_4_, final int i_5_) {
		try {
			if (Class136.aBoolean1317) {
				DisplayModeInfo.anInt1715 = 32;
			} else {
				DisplayModeInfo.anInt1715 = 0;
			}
			Class136.aBoolean1317 = false;
			if (InterfaceChangeNode.anInt3483 != 0) {
				if (i_1_ <= i_2_ && 16 + i_1_ > i_2_ && i_0_ >= i_4_ && i_0_ < i_4_ + 16) {
					class189.anInt2021 -= 4;
					InterfaceClickMask.redrawInterface(class189);
				} else if (i_1_ > i_2_ || 16 + i_1_ <= i_2_ || -16 + i_5_ + i_4_ > i_0_ || i_4_ + i_5_ <= i_0_) {
					if (-DisplayModeInfo.anInt1715 + i_1_ <= i_2_ && i_2_ < i_1_ - -16 - -DisplayModeInfo.anInt1715 && i_0_ >= 16 + i_4_ && i_0_ < -16 + i_5_ + i_4_) {
						int i_6_ = (-32 + i_5_) * i_5_ / i_3_;
						if (i_6_ < 8) {
							i_6_ = 8;
						}
						final int i_7_ = i_0_ - i_4_ - 16 - i_6_ / 2;
						final int i_8_ = -32 + i_5_ - i_6_;
						class189.anInt2021 = i_7_ * (i_3_ + -i_5_) / i_8_;
						InterfaceClickMask.redrawInterface(class189);
						Class136.aBoolean1317 = true;
					}
				} else {
					class189.anInt2021 += 4;
					InterfaceClickMask.redrawInterface(class189);
				}
			}
			if (Class66.anInt598 != 0) {
				final int i_9_ = class189.anInt1948;
				if (-i_9_ + i_1_ <= i_2_ && i_4_ <= i_0_ && i_2_ < i_1_ + 16 && i_0_ <= i_5_ + i_4_) {
					class189.anInt2021 += Class66.anInt598 * 45;
					InterfaceClickMask.redrawInterface(class189);
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("hi.C(").append(i).append(',').append(class189 != null ? "{...}" : "null").append(',').append(i_0_).append(',').append(i_1_).append(',').append(i_2_).append(',').append(i_3_).append(',').append(i_4_).append(',')
					.append(i_5_).append(')').toString());
		}
	}

	private final void method633(final Buffer class120_sub7, final byte i, final int i_10_) {
		try {
			if (i != 94) {
				aFloat622 = 1.1128678F;
			}
			if (i_10_ == 5) {
				this.anInt621 = class120_sub7.getUShort();
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("hi.E(").append(class120_sub7 != null ? "{...}" : "null").append(',').append(i).append(',').append(i_10_).append(')').toString());
		}
	}

	public static void method634(final boolean bool) {
		try {
			if (bool) {
				aShortArray620 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("hi.F(").append(bool).append(')').toString());
		}
	}

	static final void method635(final int i, final int i_11_, final int i_12_, final int i_13_, final byte i_14_, final int i_15_, final int i_16_, final int i_17_) {
		try {
			if (i == i_17_) {
				Class120_Sub1.method1036(i, i_13_, i_16_, i_11_, (byte) 84, i_12_, i_15_);
			} else {
				if (i_12_ + -i >= Class32.anInt260 && Class120_Sub14_Sub11.anInt3544 >= i + i_12_ && i_16_ + -i_17_ >= Class120_Sub30_Sub2.anInt3699 && i_17_ + i_16_ <= Class139.anInt1334) {
					Class120_Sub30_Sub1.method1743(i_14_ + -75, i_12_, i_15_, i_13_, i_16_, i, i_11_, i_17_);
				} else {
					Class159.method2095(i_11_, i_13_, i_12_, i_17_, i_16_, i_14_ + -10466, i, i_15_);
				}
				if (i_14_ != 75) {
					method635(-23, -127, -74, 66, (byte) -74, 10, 23, -35);
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("hi.A(").append(i).append(',').append(i_11_).append(',').append(i_12_).append(',').append(i_13_).append(',').append(i_14_).append(',').append(i_15_).append(',').append(i_16_).append(',').append(i_17_).append(')')
					.toString());
		}
	}

	static final long method636(final int i, final String string) {
		long l;
		try {
			long l_18_ = 0L;
			if (i >= -116) {
				return 71L;
			}
			final int i_19_ = string.length();
			for (int i_20_ = 0; i_20_ < i_19_; i_20_++) {
				l_18_ *= 37L;
				final int i_21_ = string.charAt(i_20_);
				if (i_21_ < 65 || i_21_ > 90) {
					if (i_21_ < 97 || i_21_ > 122) {
						if (i_21_ >= 48 && i_21_ <= 57) {
							l_18_ += 27 - -i_21_ + -48;
						}
					} else {
						l_18_ += 1 - (-i_21_ - -97);
					}
				} else {
					l_18_ += i_21_ + 1 - 65;
				}
				if (l_18_ >= 177917621779460413L) {
					break;
				}
			}
			for (/**/; -1L == (l_18_ % 37L ^ 0xffffffffffffffffL) && 0L != l_18_; l_18_ /= 37L) {
				/* empty */
			}
			l = l_18_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("hi.D(").append(i).append(',').append(string != null ? "{...}" : "null").append(')').toString());
		}
		return l;
	}

	public Class70() {
		/* empty */
	}

	final void method637(final Buffer class120_sub7, final int i) {
		try {
			for (;;) {
				final int i_22_ = class120_sub7.getUByte();
				if (i_22_ == 0) {
					break;
				}
				method633(class120_sub7, (byte) 94, i_22_);
			}
			if (i < 13) {
				method632((byte) 103, null, -1, 115, -22, -89, 77, -39);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("hi.B(").append(class120_sub7 != null ? "{...}" : "null").append(',').append(i).append(')').toString());
		}
	}
}
