/* Class169 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class169 {
	static int anInt1643 = -1;
	static int mapflagId;
	static KeyboardHandler keyboardHandler = new KeyboardHandler();
	static int anInt1646;
	int anInt1647;
	static int[] anIntArray1648 = new int[2048];
	static js5 aClass50_1649;
	Class32 aClass32_1650;
	static short aShort1651 = 256;

	public static void method2198(final boolean bool) {
		try {
			keyboardHandler = null;
			aClass50_1649 = null;
			anIntArray1648 = null;
			if (!bool) {
				method2198(false);
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("u.A(").append(bool).append(')').toString());
		}
	}

	Class169(final int i, final int i_0_) {
		this.aClass32_1650 = Class32.list(i);
		this.anInt1647 = i_0_;
	}

	Class169(final Class32 class32, final int i) {
		this.anInt1647 = i;
		this.aClass32_1650 = class32;
	}
}
