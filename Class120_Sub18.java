/* Class120_Sub18 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class120_Sub18 extends Node {
	static String aString2622 = "flash1:";
	byte aByte2623;
	boolean aBoolean2624;
	Class28[] aClass28Array2625 = new Class28[5];
	Class141 aClass141_2626;
	static int anInt2627;
	Class182 aClass182_2628;
	int anInt2629;
	static SignlinkNode aClass185_2630;
	boolean aBoolean2631;
	int anInt2632;
	int anInt2633;
	Class183 aClass183_2634;
	int anInt2635;
	int anInt2636;
	int anInt2637;
	int anInt2638;
	Class186 aClass186_2639;
	Class168 aClass168_2640;
	int[] anIntArray2641 = new int[5];
	int anInt2642;
	static Class75 aClass75_2643;
	Class120_Sub18 aClass120_Sub18_2644;
	Class100 aClass100_2645;
	int anInt2646;
	boolean aBoolean2647;
	int anInt2648;
	static Class40[] aClass40Array2649 = new Class40[14];
	Class36 aClass36_2650;
	static int[] spriteYOffsets;
	static int anInt2652;

	static {
		aClass75_2643 = new Class75(16);
	}

	static final int method1667(final boolean bool, final int i) {
		int i_0_;
		try {
			if (!bool) {
				return -12;
			}
			i_0_ = 0xff & i;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("nh.F(").append(bool).append(',').append(i).append(')').toString());
		}
		return i_0_;
	}

	Class120_Sub18(final int i, final int i_1_, final int i_2_) {
		this.anInt2635 = 0;
		this.anInt2642 = this.anInt2636 = i;
		this.anInt2632 = i_1_;
		this.anInt2629 = i_2_;
	}

	static final void method1668(final Class180 class180, final int i, final int i_3_, final int i_4_) {
		if (i_3_ < Class186.anInt1900) {
			final Class120_Sub18 class120_sub18 = Class120_Sub1.aClass120_Sub18ArrayArrayArray2411[i][i_3_ + 1][i_4_];
			if (class120_sub18 != null && class120_sub18.aClass36_2650 != null && class120_sub18.aClass36_2650.aClass180_309.method2268()) {
				class180.method2267(class120_sub18.aClass36_2650.aClass180_309, 128, 0, 0, true);
			}
		}
		if (i_4_ < Class186.anInt1900) {
			final Class120_Sub18 class120_sub18 = Class120_Sub1.aClass120_Sub18ArrayArrayArray2411[i][i_3_][i_4_ + 1];
			if (class120_sub18 != null && class120_sub18.aClass36_2650 != null && class120_sub18.aClass36_2650.aClass180_309.method2268()) {
				class180.method2267(class120_sub18.aClass36_2650.aClass180_309, 0, 0, 128, true);
			}
		}
		if (i_3_ < Class186.anInt1900 && i_4_ < Class120_Sub12_Sub38.anInt3440) {
			final Class120_Sub18 class120_sub18 = Class120_Sub1.aClass120_Sub18ArrayArrayArray2411[i][i_3_ + 1][i_4_ + 1];
			if (class120_sub18 != null && class120_sub18.aClass36_2650 != null && class120_sub18.aClass36_2650.aClass180_309.method2268()) {
				class180.method2267(class120_sub18.aClass36_2650.aClass180_309, 128, 0, 128, true);
			}
		}
		if (i_3_ < Class186.anInt1900 && i_4_ > 0) {
			final Class120_Sub18 class120_sub18 = Class120_Sub1.aClass120_Sub18ArrayArrayArray2411[i][i_3_ + 1][i_4_ - 1];
			if (class120_sub18 != null && class120_sub18.aClass36_2650 != null && class120_sub18.aClass36_2650.aClass180_309.method2268()) {
				class180.method2267(class120_sub18.aClass36_2650.aClass180_309, 128, 0, -128, true);
			}
		}
	}

	static final void method1669(final int i, final String string, final String string_5_, final String string_6_, final int i_7_) {
		try {
			Class120_Sub16.method1660(string, i_7_, string_5_, i, string_6_, 0);
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("nh.C(").append(i).append(',').append(string != null ? "{...}" : "null").append(',').append(string_5_ != null ? "{...}" : "null").append(',').append(string_6_ != null ? "{...}" : "null").append(',').append(i_7_)
					.append(')').toString());
		}
	}

	static final int method1670(final int i, final int i_8_) {
		int i_9_;
		try {
			final int i_10_ = (i * i >> 12) * i >> 12;
			if (i_8_ != 14005) {
				method1667(false, 7);
			}
			final int i_11_ = -61440 + i * 6;
			final int i_12_ = (i * i_11_ >> 12) + 40960;
			i_9_ = i_10_ * i_12_ >> 12;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("nh.E(").append(i).append(',').append(i_8_).append(')').toString());
		}
		return i_9_;
	}

	public static void method1672(final int i) {
		try {
			spriteYOffsets = null;
			aClass75_2643 = null;
			aClass185_2630 = null;
			aString2622 = null;
			if (i != 14888) {
				aClass40Array2649 = null;
			}
			aClass40Array2649 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("nh.A(").append(i).append(')').toString());
		}
	}
}
