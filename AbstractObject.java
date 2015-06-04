/* Class120_Sub14_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class AbstractObject extends NodeSub {

	abstract Object get();

	abstract boolean isSoftReference();

	static final int getCrc(final byte[] buffer, final int len) {
		return NodeSub.getCrc(buffer, 0, len);
	}
}
