/* Class79_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class79_Sub1 extends Class79 {
	static String[] aStringArray2243;
	static int anInt2244;
	static Class50 aClass50_2245;
	static int[] anIntArray2246 = new int[256];
	static String[] aStringArray2247;

	static {
		anInt2244 = 0;
		aStringArray2247 = new String[200];
	}

	static final void method693(final int i) {
		try {
			if (Class101_Sub3.aBoolean2291) {
				if (i != 256) {
					method693(127);
				}
				Class101_Sub3.aBoolean2291 = false;
				KeyboardHandler.aClass120_Sub14_Sub19_1508 = null;
				Class120_Sub12_Sub27.aClass107_3354 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("kn.A(").append(i).append(')').toString());
		}
	}

	public static void method694(final int i) {
		try {
			aStringArray2247 = null;
			if (i <= 79) {
				aClass50_2245 = null;
			}
			aClass50_2245 = null;
			anIntArray2246 = null;
			aStringArray2243 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("kn.D(").append(i).append(')').toString());
		}
	}

	static final void method695() {
		Class33.aClass21_273.clear();
	}

	static final long method696(final int i, final int i_0_, final int i_1_) {
		final GroundTile class120_sub18 = Class120_Sub1.groundTiles[i][i_0_][i_1_];
		if (class120_sub18 == null || class120_sub18.aClass36_2650 == null) {
			return 0L;
		}
		return class120_sub18.aClass36_2650.bitPacked;
	}
}
