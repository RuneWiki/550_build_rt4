/* Class164_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;

final class Class164_Sub2 extends Class164 {
	private final int anInt2830;
	private static Interface4 anInterface4_2831;

	@Override
	final void method2134(final int i) throws Exception {
		anInterface4_2831.method14(i, anInt2830);
	}

	@Override
	final void method2146() {
		anInterface4_2831.method13(anInt2830);
	}

	@Override
	final void method2141(final Component component) throws Exception {
		anInterface4_2831.method10(component, Class178.anInt1771, Class90.aBoolean846);
	}

	@Override
	final int method2137() {
		return anInterface4_2831.method11(anInt2830);
	}

	Class164_Sub2(final Signlink signlink, final int i) {
		anInterface4_2831 = signlink.method1966();
		anInt2830 = i;
	}

	@Override
	final void method2139() {
		anInterface4_2831.method12(anInt2830);
	}

	@Override
	final void method2140() {
		anInterface4_2831.method9(anInt2830, this.anIntArray1587);
	}
}
