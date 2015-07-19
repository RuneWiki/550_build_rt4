/* Class35 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;

final class NodeCache {
	private NodeSub emptySub = new NodeSub();
	static boolean[] heldKeys = new boolean[112];
	static int[][] anIntArrayArray300;
	static int anInt301;
	private final Queue recent = new Queue();
	static js5 texturesJs5;
	private final Hashtable hashtable;
	private int capacity;
	private final int defaultCapacity;

	static final void addMouse(final Component component) {
		component.addMouseListener(SpotAnimationNode.mouseHandler);
		component.addMouseMotionListener(SpotAnimationNode.mouseHandler);
		component.addFocusListener(SpotAnimationNode.mouseHandler);
	}

	static final void clearNpcCache() {
		NpcType.recentUse.clear();
		NpcType.aClass21_80.clear();
		Projectile.aClass21_2931.clear();
	}

	final Node getFirst() {
		return hashtable.getFirst();
	}

	static final Class120_Sub22 method300(final js5 js5, final int i) {
		final byte[] is = js5.getFileSmart(i);
		if (is == null) {
			return null;
		}
		return new Class120_Sub22(is);
	}

	final void put(final NodeSub nodeSub, final long uid) {
		if (capacity == 0) {
			NodeSub firstSub = recent.removeFirst();
			firstSub.unlink();
			firstSub.unlinkSub();
			if (emptySub == firstSub) {
				firstSub = recent.removeFirst();
				firstSub.unlink();
				firstSub.unlinkSub();
			}
		} else {
			capacity--;
		}
		hashtable.put(nodeSub, uid);
		recent.insertLast(nodeSub);
	}

	final NodeSub get(final long uid) {
		final NodeSub nodeSub = (NodeSub) hashtable.get(uid);
		if (nodeSub != null) {
			recent.insertLast(nodeSub);
		}
		return nodeSub;
	}

	final Node getNext() {
		return hashtable.getNext();
	}

	static final void removeMouse(final Component component) {
		component.removeMouseListener(SpotAnimationNode.mouseHandler);
		component.removeMouseMotionListener(SpotAnimationNode.mouseHandler);
		component.removeFocusListener(SpotAnimationNode.mouseHandler);
		Class42.currentMousePress = 0;
	}

	static final String formatObjCount(final int count) {
		if (count < 100000) {
			return "<col=ffff00>" + count + "</col>";
		}
		if (count < 10000000) {
			return "<col=ffffff>" + (count / 1000) + StringLibrary.aString1238 + "</col>";
		}
		return "<col=00ff80>" + (count / 1000000) + StringLibrary.aString3455 + "</col>";
	}

	final void clear() {
		recent.clear();
		hashtable.clear();
		emptySub = new NodeSub();
		capacity = defaultCapacity;
	}

	NodeCache(final int cap) {
		capacity = cap;
		defaultCapacity = cap;
		int size;
		for (size = 1; size + size < cap; size += size) {
			/* empty */
		}
		hashtable = new Hashtable(size);
	}
}
