/* Class109 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class109 {
	private Class105 aClass105_1036;
	static int[] anIntArray1037;
	static String aString1038 = "Loaded input handler";
	private Class120_Sub15[] aClass120_Sub15Array1039;
	private final int anInt1040;
	private int anInt1041;
	static int anInt1042;
	private int[][][] anIntArrayArrayArray1043;
	static int gameState = 0;
	private int anInt1045 = -1;
	static String aString1046;
	static Class6[] aClass6Array1047 = new Class6[50];
	private final int anInt1048;
	boolean aBoolean1049;

	static {
		anIntArray1037 = new int[] { 1, 0, -1, 0 };
		aString1046 = "Continue";
	}

	final void method972(final byte i) {
		try {
			if (i < -47) {
				for (int i_0_ = 0; anInt1048 > i_0_; i_0_++) {
					anIntArrayArrayArray1043[i_0_][0] = null;
					anIntArrayArrayArray1043[i_0_][1] = null;
					anIntArrayArrayArray1043[i_0_][2] = null;
					anIntArrayArrayArray1043[i_0_] = null;
				}
				anIntArrayArrayArray1043 = null;
				aClass120_Sub15Array1039 = null;
				aClass105_1036.method889(1986850152);
				aClass105_1036 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("md.A(").append(i).append(')').toString());
		}
	}

	final int[][][] method973(final int i) {
		int[][][] is;
		try {
			if (anInt1048 != anInt1040) {
				throw new RuntimeException("Can only retrieve a full image cache");
			}
			for (int i_1_ = i; anInt1048 > i_1_; i_1_++) {
				aClass120_Sub15Array1039[i_1_] = Class132_Sub1.aClass120_Sub15_2805;
			}
			is = anIntArrayArrayArray1043;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("md.B(").append(i).append(')').toString());
		}
		return is;
	}

	public static void method974(final int i) {
		try {
			aClass6Array1047 = null;
			anIntArray1037 = null;
			aString1046 = null;
			aString1038 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("md.C(").append(i).append(')').toString());
		}
	}

	final int[][] method975(final int i, final int i_2_) {
		int[][] is;
		try {
			if (i_2_ >= -45) {
				return null;
			}
			if (anInt1040 != anInt1048) {
				if (anInt1048 != 1) {
					Class120_Sub15 class120_sub15 = aClass120_Sub15Array1039[i];
					if (class120_sub15 == null) {
						this.aBoolean1049 = true;
						if (anInt1048 <= anInt1041) {
							final Class120_Sub15 class120_sub15_3_ = (Class120_Sub15) aClass105_1036.method896((byte) 116);
							class120_sub15 = new Class120_Sub15(i, class120_sub15_3_.anInt2592);
							aClass120_Sub15Array1039[class120_sub15_3_.anInt2593] = null;
							class120_sub15_3_.unlink();
						} else {
							class120_sub15 = new Class120_Sub15(i, anInt1041);
							anInt1041++;
						}
						aClass120_Sub15Array1039[i] = class120_sub15;
					} else {
						this.aBoolean1049 = false;
					}
					aClass105_1036.method890(class120_sub15, (byte) -110);
					return anIntArrayArrayArray1043[class120_sub15.anInt2592];
				}
				this.aBoolean1049 = i != anInt1045;
				anInt1045 = i;
				return anIntArrayArrayArray1043[0];
			}
			this.aBoolean1049 = aClass120_Sub15Array1039[i] == null;
			aClass120_Sub15Array1039[i] = Class132_Sub1.aClass120_Sub15_2805;
			is = anIntArrayArrayArray1043[i];
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("md.D(").append(i).append(',').append(i_2_).append(')').toString());
		}
		return is;
	}

	Class109(final int i, final int i_4_, final int i_5_) {
		anInt1041 = 0;
		aClass105_1036 = new Class105();
		this.aBoolean1049 = false;
		anInt1048 = i;
		anInt1040 = i_4_;
		aClass120_Sub15Array1039 = new Class120_Sub15[anInt1040];
		anIntArrayArrayArray1043 = new int[anInt1048][3][i_5_];
	}
}
