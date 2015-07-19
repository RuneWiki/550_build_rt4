/* Class33 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class33 {
	static ObjectCache aClass21_273 = new ObjectCache(50);
	static LDFont smallFont2;//used for objs
	static js5 interfaceJs5;
	static String[] stringStack = new String[1000];
	static int anInt278 = 0;

	static final void method276(final int i_1_) {
		final InterfaceChangeNode class120_sub14_sub7 = InterfaceChangeNode.putInterfaceChange(4, i_1_);
		class120_sub14_sub7.method1453();
	}

	static final String getSpellPrefix(final JagexInterface jagexInterface) {
		if (client.getClickMask(jagexInterface).method1685() == 0) {
			return null;
		}
		if (jagexInterface.spellPrefix == null || jagexInterface.spellPrefix.trim().length() == 0) {
			if (Class120_Sub30_Sub1.qaOpTestEnabled) {
				return "Hidden-use";
			}
			return null;
		}
		return jagexInterface.spellPrefix;
	}

}
