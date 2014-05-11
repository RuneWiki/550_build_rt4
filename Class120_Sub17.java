/* Class120_Sub17 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class120_Sub17 extends Node {
	static int anInt2612 = 0;
	static int anInt2613;
	static String aString2614 = "glow3:";
	static int anInt2615 = 0;
	static int anInt2616;
	static int canvasRefreshCycle = 500;
	int[] anIntArray2618 = { -1 };
	int[] anIntArray2619 = new int[1];
	static Class29 aClass29_2620 = new Class29();
	static int anInt2621;

	static final Class189 method1665(final int i, final Class189 class189) {
		Class189 class189_0_;
		try {
			if (class189.anInt2029 != -1) {
				return Class74.method650(49, class189.anInt2029);
			}
			final int i_1_ = class189.anInt1999 >>> 16;
			final Class140 class140 = new Class140(Class120_Sub12_Sub13.aClass75_3234);
			for (Class120_Sub26 class120_sub26 = (Class120_Sub26) class140.method1994((byte) -128); class120_sub26 != null; class120_sub26 = (Class120_Sub26) class140.method1998((byte) 101)) {
				if (i_1_ == class120_sub26.anInt2745) {
					return Class74.method650(-114, (int) class120_sub26.uid);
				}
			}
			class189_0_ = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("nd.B(").append(i).append(',').append(class189 != null ? "{...}" : "null").append(')').toString());
		}
		return class189_0_;
	}

	public static void method1666(final byte i) {
		try {
			aString2614 = null;
			aClass29_2620 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("nd.A(").append(i).append(')').toString());
		}
	}

	public Class120_Sub17() {
		/* empty */
	}
}
