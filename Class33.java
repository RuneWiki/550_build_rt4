/* Class33 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class33 {
	static ObjectCache aClass21_273 = new ObjectCache(50);
	static Class120_Sub14_Sub8_Sub2 aClass120_Sub14_Sub8_Sub2_274;
	static js5 aClass50_275;
	static String aString276 = "green:";
	static String[] stringStack = new String[1000];
	static int anInt278 = 0;

	static final void resetVarp() {
		for (int i_0_ = 0; Class120_Sub12_Sub22.anInt3302 > i_0_; i_0_++) {
			final Varp varp = Varp.list(i_0_);
			if (varp != null && varp.setting == 0) {
				Class30.anIntArray239[i_0_] = 0;
				Class2.permanentVariable[i_0_] = 0;
			}
		}
		Class69_Sub3_Sub1.aClass75_3079 = new Hashtable(16);
	}

	static final void method276(final int i_1_) {
		final InterfaceChangeNode class120_sub14_sub7 = AbstractObject.putInterfaceChange(4, i_1_);
		class120_sub14_sub7.method1453();
	}

	static final String method277(final JagexInterface jagexInterface) {
		if (client.getClickMask(jagexInterface).method1685() == 0) {
			return null;
		}
		if (jagexInterface.selectedActionName == null || jagexInterface.selectedActionName.trim().length() == 0) {
			if (Class120_Sub30_Sub1.aBoolean3673) {
				return "Hidden-use";
			}
			return null;
		}
		return jagexInterface.selectedActionName;
	}

	public static void method278(final int i) {
		try {
			aClass21_273 = null;
			aString276 = null;
			aClass50_275 = null;
			if (i != 0) {
				aString276 = null;
			}
			stringStack = null;
			aClass120_Sub14_Sub8_Sub2_274 = null;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("df.A(").append(i).append(')').toString());
		}
	}
}
