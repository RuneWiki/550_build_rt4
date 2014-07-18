/* Class89 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class89 {
	static js5 aClass50_836;
	static int anInt837;
	static int[] anIntArray838;

	static final void method746(final int i_0_, final int i) {
		final InterfaceChangeNode class120_sub14_sub7 = AbstractObject.putInterfaceChange(13, i_0_);
		class120_sub14_sub7.method1454();
		class120_sub14_sub7.anInt3484 = i;
	}

	public static void method747(final byte i) {
		try {
			if (i != 121) {
				method749(null, 'I', -75);
			}
			aClass50_836 = null;
			anIntArray838 = null;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("ji.A(").append(i).append(')').toString());
		}
	}

	static final StringBuffer method749(final StringBuffer stringbuffer, final char c, final int i) {
		final int i_5_ = stringbuffer.length();
		stringbuffer.setLength(i);
		for (int i_6_ = i_5_; i_6_ < i; i_6_++) {
			stringbuffer.setCharAt(i_6_, c);
		}
		return stringbuffer;
	}
}
