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

	public static void method747() {
		aClass50_836 = null;
		anIntArray838 = null;
	}

	static final StringBuffer increaseStringBufferLength(final StringBuffer stringbuffer, final char fillChar, final int newLength) {
		final int oldLength = stringbuffer.length();
		stringbuffer.setLength(newLength);
		for (int index = oldLength; index < newLength; index++) {
			stringbuffer.setCharAt(index, fillChar);
		}
		return stringbuffer;
	}
}
