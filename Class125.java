/* Class125 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class125 implements Interface1 {
	
	static Class57 aClass57_2147 = Class167.method2184(-59);
	static String[] aStringArray2148 = new String[5];
	static float aFloat2149;
	static int[][] anIntArrayArray2150;

	static final AbstractSprite[] method1878(final Class50 class50, final byte i, final int i_0_, final int i_1_) {
		AbstractSprite[] class120_sub14_sub19s;
		try {
			if (i != 110) {
				method1878(null, (byte) 67, 36, -96);
			}
			if (!Class10.method121(class50, i_1_, i_0_)) {
				return null;
			}
			class120_sub14_sub19s = Class90.constructSprites();
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("oi.E(").append(class50 != null ? "{...}" : "null").append(',').append(i).append(',').append(i_0_).append(',').append(i_1_).append(')').toString());
		}
		return class120_sub14_sub19s;
	}

	public Class125() {
		/* empty */
	}

	static final String method1879(final byte i, final int i_2_) {
		String string;
		try {
			if (i != 39) {
				return null;
			}
			string = new StringBuilder(String.valueOf(0xff & i_2_ >> 24)).append(".").append(0xff & i_2_ >> 16).append(".").append(0xff & i_2_ >> 8).append(".").append(0xff & i_2_).toString();
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("oi.C(").append(i).append(',').append(i_2_).append(')').toString());
		}
		return string;
	}

	public static void method1880(final byte i) {
		try {
			if (i <= 106) {
				aStringArray2148 = null;
			}
			aStringArray2148 = null;
			anIntArrayArray2150 = null;
			aClass57_2147 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("oi.A(").append(i).append(')').toString());
		}
	}

	@Override
	public final String method1(final long l, final int[] is, final int i_3_) {
		if (i_3_ == 0) {
			final Class120_Sub14_Sub2 class120_sub14_sub2 = Class90.method751(is[0]);
			return class120_sub14_sub2.method1422((int) l);
		}
		if (i_3_ == 1 || i_3_ == 10) {
			final ObjType objType = ObjType.list((int) l);
			return objType.name;
		}
		if (i_3_ == 6 || i_3_ == 7 || i_3_ == 11) {
			return Class90.method751(is[0]).method1422((int) l);
		}
		return null;
	}

	static final void method1881(final Class50 class50, final int i) {
		try {
			Class101_Sub4.aClass50_2297 = class50;
			Buffer.anInt2471 = Class101_Sub4.aClass50_2297.getFileAmount(4);
			if (i < 26) {
				aClass57_2147 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("oi.D(").append(class50 != null ? "{...}" : "null").append(',').append(i).append(')').toString());
		}
	}
}
