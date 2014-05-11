/* RuntimeException_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class RuntimeException_Sub1 extends RuntimeException {
	static byte[][] aByteArrayArray2140;
	String aString2141;
	static int anInt2142 = 255;
	static short aShort2143 = 1;
	static AbstractSprite aClass120_Sub14_Sub19_2144;
	static Class120_Sub14_Sub9 aClass120_Sub14_Sub9_2145;
	Throwable aThrowable2146;

	static final Class120_Sub26 method2528(final int i, final int i_0_, final byte i_1_, final int i_2_) {
		Class120_Sub26 class120_sub26;
		try {
			final Class120_Sub26 class120_sub26_3_ = new Class120_Sub26();
			class120_sub26_3_.anInt2744 = i_0_;
			class120_sub26_3_.anInt2745 = i;
			Class120_Sub12_Sub13.aClass75_3234.method655(class120_sub26_3_, 91, i_2_);
			Class120_Sub14_Sub1.method1413(-117, i);
			final Class189 class189 = Class74.method650(-119, i_2_);
			if (class189 != null) {
				InterfaceClickMask.redrawInterface(class189);
			}
			if (Class156.aClass189_1454 != null) {
				InterfaceClickMask.redrawInterface(Class156.aClass189_1454);
				Class156.aClass189_1454 = null;
			}
			final int i_4_ = Class186.anInt1906;
			for (int i_5_ = 0; i_4_ > i_5_; i_5_++) {
				if (Class150.method2064(116, Class120_Sub29.aShortArray2777[i_5_])) {
					Class120_Sub16.method1662(false, i_5_);
				}
			}
			if (Class186.anInt1906 == 1) {
				Class15.menuOpen = false;
				Class120_Sub12_Sub1.method1195(Class120_Sub24.anInt2724, Class120_Sub14_Sub10.anInt3537, Class126.anInt1209, Class120_Sub16.anInt2600);
			} else {
				Class120_Sub12_Sub1.method1195(Class120_Sub24.anInt2724, Class120_Sub14_Sub10.anInt3537, Class126.anInt1209, Class120_Sub16.anInt2600);
				int i_6_ = Class120_Sub12_Sub22.aClass120_Sub14_Sub8_3303.method1459(Class111.aString1056);
				for (int i_7_ = 0; Class186.anInt1906 > i_7_; i_7_++) {
					final int i_8_ = Class120_Sub12_Sub22.aClass120_Sub14_Sub8_3303.method1459(Class121.method1838((byte) 87, i_7_));
					if (i_6_ < i_8_) {
						i_6_ = i_8_;
					}
				}
				Class120_Sub14_Sub10.anInt3537 = (Class186.aBoolean1899 ? 26 : 22) + Class186.anInt1906 * 15;
				Class120_Sub24.anInt2724 = 8 + i_6_;
			}
			if (class189 != null) {
				ProducingGraphicsBuffer.method1854(false, false, class189);
			}
			Class46.method376(true, i);
			if (Class69.anInt616 != -1) {
				InterfaceClickMask.method1689(Class69.anInt616, 1, (byte) 78);
			}
			class120_sub26 = class120_sub26_3_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("bk.A(").append(i).append(',').append(i_0_).append(',').append(i_1_).append(',').append(i_2_).append(')').toString());
		}
		return class120_sub26;
	}

	public static void method2529(final int i) {
		aClass120_Sub14_Sub9_2145 = null;
		aByteArrayArray2140 = null;
		aClass120_Sub14_Sub19_2144 = null;
		if (i != -16553) {
			method2528(2, 79, (byte) -38, 61);
		}
	}

	static final void method2530(final int i, final int i_9_, final int i_10_, final int i_11_, final Class180 class180, final Class180 class180_12_, final int i_13_, final int i_14_, final long l) {
		if (class180 != null || class180_12_ != null) {
			final Class182 class182 = new Class182();
			class182.aLong1794 = l;
			class182.anInt1797 = i_9_ * 128 + 64;
			class182.anInt1795 = i_10_ * 128 + 64;
			class182.anInt1801 = i_11_;
			class182.aClass180_1800 = class180;
			class182.aClass180_1796 = class180_12_;
			class182.anInt1799 = i_13_;
			class182.anInt1792 = i_14_;
			for (int i_15_ = i; i_15_ >= 0; i_15_--) {
				if (Class120_Sub1.aClass120_Sub18ArrayArrayArray2411[i_15_][i_9_][i_10_] == null) {
					Class120_Sub1.aClass120_Sub18ArrayArrayArray2411[i_15_][i_9_][i_10_] = new Class120_Sub18(i_15_, i_9_, i_10_);
				}
			}
			Class120_Sub1.aClass120_Sub18ArrayArrayArray2411[i][i_9_][i_10_].aClass182_2628 = class182;
		}
	}

	RuntimeException_Sub1(final Throwable throwable, final String string) {
		this.aString2141 = string;
		this.aThrowable2146 = throwable;
	}
}
