/* Class120_Sub19 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class120_Sub19 extends Node {
	static String aString2653 = "M";
	int anInt2654;
	static int anInt2655 = 3353893;
	int anInt2656;
	static int anInt2657;
	static int[] anIntArray2658 = new int[128];

	static {
		anInt2657 = 0;
	}

	static final void method1673(final Class120_Sub14_Sub5 class120_sub14_sub5, final int i, final int i_0_, final int i_1_, final boolean bool, final int i_2_, final Class120_Sub16 class120_sub16, final Class73 class73) {
		try {
			Class98 class98 = null;
			if (i_2_ == 0) {
				if (class73.anInt634 != 0) {
					if (class73.anInt634 == 1) {
						if (3.0 == Class79.aFloat696) {
							class98 = Class112.aClass98_1070;
						}
						if (4.0 == Class79.aFloat696) {
							class98 = Class110.aClass98_1052;
						}
						if (Class79.aFloat696 == 6.0) {
							class98 = Class120_Sub14_Sub14_Sub1.aClass98_3929;
						}
						if (Class79.aFloat696 >= 8.0) {
							class98 = Class167_Sub1.aClass98_2833;
						}
					} else if (class73.anInt634 == 2) {
						if (3.0 == Class79.aFloat696) {
							class98 = Class120_Sub14_Sub14_Sub1.aClass98_3929;
						}
						if (Class79.aFloat696 == 4.0) {
							class98 = Class167_Sub1.aClass98_2833;
						}
						if (Class79.aFloat696 == 6.0) {
							class98 = Class124.aClass98_1201;
						}
						if (Class79.aFloat696 >= 8.0) {
							class98 = Class120_Sub26.aClass98_2739;
						}
					}
				} else {
					if (3.0 == Class79.aFloat696) {
						class98 = PlayerAppearance.aClass98_1373;
					}
					if (Class79.aFloat696 == 4.0) {
						class98 = Class92.aClass98_863;
					}
					if (6.0 == Class79.aFloat696) {
						class98 = Class112.aClass98_1070;
					}
					if (Class79.aFloat696 >= 8.0) {
						class98 = Class110.aClass98_1052;
					}
				}
				if (class98 != null) {
					int i_3_ = class73.anInt655;
					if (class120_sub14_sub5.aBoolean3472 && (class73.anInt656 ^ 0xffffffff) != 0) {
						i_3_ = class73.anInt656;
					}
					final int i_4_ = Class21.aClass120_Sub14_Sub8_121.method1486(class73.aString649, null, Class125.aStringArray2148);
					int i_5_ = class120_sub14_sub5.anInt3475;
					if (!bool) {
						i_5_ -= i_0_ - (-((-1 + i_4_) * class98.method817()) + -(class98.method813() / 2));
					} else {
						i_5_ -= class98.method813() * i_4_ / 2;
					}
					final int i_6_ = i_5_ + -class98.method813();
					i_5_ += class98.method813() / 2;
					int i_7_ = 0;
					for (int i_8_ = 0; i_8_ < i_4_; i_8_++) {
						String string = Class125.aStringArray2148[i_8_];
						if (-1 + i_4_ > i_8_) {
							string = string.substring(0, string.length() - 4);
						}
						final int i_9_ = class98.method811(string);
						if (i_7_ < i_9_) {
							i_7_ = i_9_;
						}
					}
					class120_sub16.anInt2601 = class120_sub14_sub5.anInt3478 + -(i_7_ / 2) - -i;
					class120_sub16.anInt2609 = i + class120_sub14_sub5.anInt3478 + i_7_ / 2;
					class120_sub16.anInt2606 = i_6_ + i_1_;
					class120_sub16.anInt2607 = i_1_ + i_6_ + class98.method817() * i_4_;
					final int i_10_ = 2 + i_6_;
					final int i_11_ = -(i_7_ / 2) + class120_sub14_sub5.anInt3478 + -5;
					if (class73.anInt640 != 0) {
						GraphicsLD.method2159(i_11_, i_10_, i_7_ - -10, 1 + i_6_ - -(i_4_ * class98.method817()) - i_10_, class73.anInt640, class73.anInt640 >>> 24);
					}
					if (class73.anInt648 != 0) {
						GraphicsLD.drawRect(i_11_, i_10_, 10 + i_7_, -i_10_ + class98.method817() * i_4_ + i_6_ + 1, class73.anInt648, class73.anInt648 >>> 24);
					}
					for (int i_12_ = 0; i_12_ < i_4_; i_12_++) {
						String string = Class125.aStringArray2148[i_12_];
						if (i_4_ - 1 > i_12_) {
							string = string.substring(0, -4 + string.length());
						}
						final int i_13_ = class98.method811(string);
						if (i_7_ < i_13_) {
							i_7_ = i_13_;
						}
						class98.method815(string, class120_sub14_sub5.anInt3478, i_5_, i_3_, true);
						i_5_ += class98.method817();
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception,
					new StringBuilder("ol.C(").append(class120_sub14_sub5 != null ? "{...}" : "null").append(',').append(i).append(',').append(i_0_).append(',').append(i_1_).append(',').append(bool).append(',').append(i_2_).append(',').append(class120_sub16 != null ? "{...}" : "null").append(',')
							.append(class73 != null ? "{...}" : "null").append(')').toString());
		}
	}

	public static void method1674(final int i) {
		try {
			aString2653 = null;
			anIntArray2658 = null;
			if (i != 6530) {
				anInt2657 = -121;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ol.D(").append(i).append(')').toString());
		}
	}

	static final void method1675(final Class120_Sub26 class120_sub26, final boolean bool) {
		final int i_14_ = (int) class120_sub26.uid;
		final int i_15_ = class120_sub26.anInt2745;
		class120_sub26.unlink();
		if (bool) {
			Class120_Sub12_Sub32.method1372(-1, i_15_);
		}
		Class120_Sub15.method1651((byte) 42, i_15_);
		final Class189 class189 = Class74.method650(-116, i_14_);
		if (class189 != null) {
			InterfaceClickMask.redrawInterface(class189);
		}
		final int i_16_ = Class186.anInt1906;
		for (int i_17_ = 0; i_17_ < i_16_; i_17_++) {
			if (Class150.method2064(96, Class120_Sub29.aShortArray2777[i_17_])) {
				Class120_Sub16.method1662(false, i_17_);
			}
		}
		if (Class186.anInt1906 != 1) {
			Class120_Sub12_Sub1.method1195(Class120_Sub24.anInt2724, Class120_Sub14_Sub10.anInt3537, Class126.anInt1209, Class120_Sub16.anInt2600);
			int i_18_ = Class120_Sub12_Sub22.aClass120_Sub14_Sub8_3303.method1459(Class111.aString1056);
			for (int i_19_ = 0; Class186.anInt1906 > i_19_; i_19_++) {
				final int i_20_ = Class120_Sub12_Sub22.aClass120_Sub14_Sub8_3303.method1459(Class121.method1838((byte) 122, i_19_));
				if (i_20_ > i_18_) {
					i_18_ = i_20_;
				}
			}
			Class120_Sub14_Sub10.anInt3537 = (!Class186.aBoolean1899 ? 22 : 26) + 15 * Class186.anInt1906;
			Class120_Sub24.anInt2724 = 8 + i_18_;
		} else {
			Class15.menuOpen = false;
			Class120_Sub12_Sub1.method1195(Class120_Sub24.anInt2724, Class120_Sub14_Sub10.anInt3537, Class126.anInt1209, Class120_Sub16.anInt2600);
		}
		if ((Class69.anInt616 ^ 0xffffffff) != 0) {
			InterfaceClickMask.method1689(Class69.anInt616, 1, (byte) 87);
		}
	}

	Class120_Sub19(final int i, final int i_21_) {
		this.anInt2656 = i;
		this.anInt2654 = i_21_;
	}

	static final Class120_Sub14_Sub12 method1676(final byte i, final byte[] is) {
		Class120_Sub14_Sub12 class120_sub14_sub12;
		try {
			final Class120_Sub14_Sub12 class120_sub14_sub12_22_ = new Class120_Sub14_Sub12();
			final Buffer class120_sub7 = new Buffer(is);
			class120_sub7.pos = class120_sub7.buf.length + -2;
			final int i_23_ = class120_sub7.getUShort();
			final int i_24_ = -12 + class120_sub7.buf.length + -2 - i_23_;
			class120_sub7.pos = i_24_;
			final int i_25_ = class120_sub7.getInt();
			class120_sub14_sub12_22_.anInt3557 = class120_sub7.getUShort();
			class120_sub14_sub12_22_.anInt3555 = class120_sub7.getUShort();
			class120_sub14_sub12_22_.anInt3553 = class120_sub7.getUShort();
			class120_sub14_sub12_22_.anInt3547 = class120_sub7.getUShort();
			final int i_26_ = class120_sub7.getUByte();
			if (i_26_ > 0) {
				class120_sub14_sub12_22_.aClass75Array3552 = new Class75[i_26_];
				for (int i_27_ = 0; i_26_ > i_27_; i_27_++) {
					int i_28_ = class120_sub7.getUShort();
					final Class75 class75 = new Class75(Class120_Sub12_Sub17.method1283(i_28_, (byte) 119));
					class120_sub14_sub12_22_.aClass75Array3552[i_27_] = class75;
					while (i_28_-- > 0) {
						final int i_29_ = class120_sub7.getInt();
						final int i_30_ = class120_sub7.getInt();
						class75.method655(new Class120_Sub32(i_30_), 124, i_29_);
					}
				}
			}
			if (i != 63) {
				return null;
			}
			int i_31_ = 0;
			class120_sub7.pos = 0;
			class120_sub14_sub12_22_.aString3554 = class120_sub7.method1127((byte) -7);
			class120_sub14_sub12_22_.aStringArray3551 = new String[i_25_];
			class120_sub14_sub12_22_.anIntArray3550 = new int[i_25_];
			class120_sub14_sub12_22_.anIntArray3548 = new int[i_25_];
			while (class120_sub7.pos < i_24_) {
				final int i_32_ = class120_sub7.getUShort();
				if (i_32_ == 3) {
					class120_sub14_sub12_22_.aStringArray3551[i_31_] = class120_sub7.getJString().intern();
				} else if (i_32_ >= 100 || i_32_ == 21 || i_32_ == 38 || i_32_ == 39) {
					class120_sub14_sub12_22_.anIntArray3548[i_31_] = class120_sub7.getUByte();
				} else {
					class120_sub14_sub12_22_.anIntArray3548[i_31_] = class120_sub7.getInt();
				}
				class120_sub14_sub12_22_.anIntArray3550[i_31_++] = i_32_;
			}
			class120_sub14_sub12 = class120_sub14_sub12_22_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ol.B(").append(i).append(',').append(is != null ? "{...}" : "null").append(')').toString());
		}
		return class120_sub14_sub12;
	}
}
