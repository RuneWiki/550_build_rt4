/* Class125 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class125 implements Interface1 {
	
	static Class57 aClass57_2147 = Class167.method2184(-59);
	static String[] aStringArray2148 = new String[5];
	static float aFloat2149;
	static int[][] anIntArrayArray2150;

	static final AbstractSprite[] constructTransparentSprites(final js5 js5, final int i_0_, final int i_1_) {
		if (!Class10.decodedSprites(js5, i_1_, i_0_)) {
			return null;
		}
		return Class90.constructTransparentSprites();
	}

	public Class125() {
		/* empty */
	}

	static final String method1879(final int i_2_) {
		return new StringBuilder(String.valueOf(0xff & i_2_ >> 24)).append(".").append(0xff & i_2_ >> 16).append(".").append(0xff & i_2_ >> 8).append(".").append(0xff & i_2_).toString();
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
			throw EnumType.method1428(runtimeexception, new StringBuilder("oi.A(").append(i).append(')').toString());
		}
	}

	@Override
	public final String method1(final long id, final int[] params, final int type) {
		if (type == 0) {
			final EnumType enumType = EnumType.list(params[0]);
			return enumType.getStringParamValue((int) id);
		}
		if (type == 1 || type == 10) {
			final ObjType objType = ObjType.list((int) id);
			return objType.name;
		}
		if (type == 6 || type == 7 || type == 11) {
			return EnumType.list(params[0]).getStringParamValue((int) id);
		}
		return null;
	}

	static final void method1881(final js5 js5, final int i) {
		try {
			Class101_Sub4.aClass50_2297 = js5;
			Buffer.anInt2471 = Class101_Sub4.aClass50_2297.getFileAmount(4);
			if (i < 26) {
				aClass57_2147 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("oi.D(").append(js5 != null ? "{...}" : "null").append(',').append(i).append(')').toString());
		}
	}
}
