/* Class74 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class74 {
	static String loginName;
	static int anInt667 = 0;
	static int sceneryShadowsType;

	static {
		loginName = "";
		sceneryShadowsType = 2;
	}

	static final JagexInterface getJagexInterface(final int bitPacked) {
		final int parent = bitPacked >> 16;
		final int child = bitPacked & 0xffff;
		if (Node.interfaceCache[parent] == null || Node.interfaceCache[parent][child] == null) {
			final boolean loaded = js5.loadInterface(parent);
			if (!loaded) {
				return null;
			}
		}
		return Node.interfaceCache[parent][child];
	}

	public static void method651() {
		loginName = null;
	}
}
