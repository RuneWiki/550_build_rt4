/* Class74 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class74 {
	static String aString666;
	static int anInt667 = 0;
	static int sceneryShadowsType;

	static {
		aString666 = "";
		sceneryShadowsType = 2;
	}

	static final JagexInterface getJagexInterface(final int i_0_) {
		final int i_1_ = i_0_ >> 16;
		final int i_2_ = i_0_ & 0xffff;
		if (Node.interfaceCache[i_1_] == null || Node.interfaceCache[i_1_][i_2_] == null) {
			final boolean bool = Class50.loadInterface(i_1_);
			if (!bool) {
				return null;
			}
		}
		return Node.interfaceCache[i_1_][i_2_];
	}

	public static void method651(final boolean bool) {
		try {
			aString666 = null;
			if (bool) {
				aString666 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("i.D(").append(bool).append(')').toString());
		}
	}
}
