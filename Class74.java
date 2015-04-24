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
		final int interfaceId = bitPacked >> 16;
		final int componentId = bitPacked & 0xffff;
		if (Node.interfaceCache[interfaceId] == null || Node.interfaceCache[interfaceId][componentId] == null) {
			final boolean loaded = js5.loadInterface(interfaceId);
			if (!loaded) {
				return null;
			}
		}
		return Node.interfaceCache[interfaceId][componentId];
	}

}
