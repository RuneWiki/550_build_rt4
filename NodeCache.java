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
	static js5 aClass50_303;
	private final Hashtable hashtable;
	private int capacity;
	private final int defaultCapacity;

	static final void addMouse(final Component component) {
		component.addMouseListener(SpotAnimationNode.mouseHandler);
		component.addMouseMotionListener(SpotAnimationNode.mouseHandler);
		component.addFocusListener(SpotAnimationNode.mouseHandler);
	}

	static final void method297() {
		NpcType.recentUse.clear();
		NpcType.aClass21_80.clear();
		Projectile.aClass21_2931.clear();
	}

	public static void method298(final int i) {
		try {
			heldKeys = null;
			aClass50_303 = null;
			anIntArrayArray300 = null;
			if (i != -51) {
				method300(null, -82);
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("dj.C(").append(i).append(')').toString());
		}
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
			return new StringBuilder("<col=ffff00>").append(count).append("</col>").toString();
		}
		if (count < 10000000) {
			return new StringBuilder("<col=ffffff>").append(count / 1000).append(CursorType.aString1238).append("</col>").toString();
		}
		return new StringBuilder("<col=00ff80>").append(count / 1000000).append(EnumType.aString3455).append("</col>").toString();
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
