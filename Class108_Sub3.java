/* Class108_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Class108_Sub3 extends Class108 {
	static int anInt2395 = 1;
	static String aString2396 = "Mechscape is loading - please wait...";
	static boolean highDetailTextures;
	Class108_Sub3 aClass108_Sub3_2398;
	Class108_Sub3 aClass108_Sub3_2399;
	static js5 aClass50_2400;
	static int[][] anIntArrayArray2401 = { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

	static {
		highDetailTextures = true;
	}

	public static void method966(final int i) {
		try {
			anIntArrayArray2401 = null;
			aString2396 = null;
			aClass50_2400 = null;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("r.I(").append(i).append(')').toString());
		}
	}

	public Class108_Sub3() {
		/* empty */
	}

	final void method967(final int i) {
		try {
			if (i != 13) {
				aClass50_2400 = null;
			}
			if (this.aClass108_Sub3_2399 != null) {
				this.aClass108_Sub3_2399.aClass108_Sub3_2398 = this.aClass108_Sub3_2398;
				this.aClass108_Sub3_2398.aClass108_Sub3_2399 = this.aClass108_Sub3_2399;
				this.aClass108_Sub3_2398 = null;
				this.aClass108_Sub3_2399 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("r.J(").append(i).append(')').toString());
		}
	}
}
