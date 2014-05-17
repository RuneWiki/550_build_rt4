/* Class33 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class33 {
	static Cache aClass21_273 = new Cache(50);
	static Class120_Sub14_Sub8_Sub2 aClass120_Sub14_Sub8_Sub2_274;
	static Class50 aClass50_275;
	static String aString276 = "green:";
	static String[] aStringArray277 = new String[1000];
	static int anInt278 = 0;

	static final void method275(final byte i) {
		try {
			if (i == -5) {
				for (int i_0_ = 0; Class120_Sub12_Sub22.anInt3302 > i_0_; i_0_++) {
					final Class70 class70 = Class132_Sub1.method1933((byte) -128, i_0_);
					if (class70 != null && class70.anInt621 == 0) {
						Class30.anIntArray239[i_0_] = 0;
						Class2.permanentVariable[i_0_] = 0;
					}
				}
				Class69_Sub3_Sub1.aClass75_3079 = new Hashtable(16);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("df.C(").append(i).append(')').toString());
		}
	}

	static final void method276(final int i, final int i_1_) {
		try {
			final InterfaceChangeNode class120_sub14_sub7 = AbstractObject.putInterfaceChange(4, i_1_);
			if (i != 0) {
				aStringArray277 = null;
			}
			class120_sub14_sub7.method1453((byte) -104);
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("df.D(").append(i).append(',').append(i_1_).append(')').toString());
		}
	}

	static final String method277(final byte i, final JagexInterface jagexInterface) {
		String string;
		try {
			if (client.getClickMask(jagexInterface).method1685(1105924391) == 0) {
				return null;
			}
			if (jagexInterface.selectedActionName == null || jagexInterface.selectedActionName.trim().length() == 0) {
				if (Class120_Sub30_Sub1.aBoolean3673) {
					return "Hidden-use";
				}
				return null;
			}
			if (i <= 114) {
				return null;
			}
			string = jagexInterface.selectedActionName;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("df.B(").append(i).append(',').append(jagexInterface != null ? "{...}" : "null").append(')').toString());
		}
		return string;
	}

	public static void method278(final int i) {
		try {
			aClass21_273 = null;
			aString276 = null;
			aClass50_275 = null;
			if (i != 0) {
				aString276 = null;
			}
			aStringArray277 = null;
			aClass120_Sub14_Sub8_Sub2_274 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("df.A(").append(i).append(')').toString());
		}
	}
}
