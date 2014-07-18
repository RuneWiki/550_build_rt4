/* Class66 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class66 {
	static int mouseWheelRotation = 0;
	static int anInt599 = 0;
	static float aFloat600;

	static final void method579(final int i, final byte i_0_) {
		try {
			InterfaceListener.aClass21_2542.method192(i);
			if (i_0_ != -23) {
				aFloat600 = 0.5809334F;
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("hc.A(").append(i).append(',').append(i_0_).append(')').toString());
		}
	}

	abstract byte[] method580(int i);

	abstract void method581(int i, byte[] is);
}
