/* Class120_Sub14_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class AbstractObject extends NodeSub {
	static boolean objMemberClient;

	abstract Object get();

	abstract boolean isSoftReference();

	static final int getCrc(final byte[] buffer, final int len) {
		return NodeSub.getCrc(buffer, 0, len);
	}

	static final InterfaceChangeNode putInterfaceChange(final int type, final int uid) {
		InterfaceChangeNode interfaceChangeNode = (InterfaceChangeNode) Class120_Sub14_Sub10.interfaceChangeCache.get((long) type << 32 | uid);
		if (interfaceChangeNode == null) {
			interfaceChangeNode = new InterfaceChangeNode(type, uid);
			Class120_Sub14_Sub10.interfaceChangeCache.put(interfaceChangeNode, interfaceChangeNode.uid);
		}
		return interfaceChangeNode;
	}
}
