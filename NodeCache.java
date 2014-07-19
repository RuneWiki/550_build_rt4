/* Class35 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;

final class NodeCache {
	private NodeSub emptySub = new NodeSub();
	static boolean[] aBooleanArray299 = new boolean[112];
	static int[][] anIntArrayArray300;
	static int anInt301;
	private final Queue recent = new Queue();
	static js5 aClass50_303;
	private final Hashtable hashtable;
	private int capacity;
	private final int defaultCapacity;

	static final void addMouse(final Component component) {
		component.addMouseListener(Class120_Sub14_Sub4.mouseHandler);
		component.addMouseMotionListener(Class120_Sub14_Sub4.mouseHandler);
		component.addFocusListener(Class120_Sub14_Sub4.mouseHandler);
	}

	static final void method297() {
		NpcType.recentUse.clear();
		Class11.aClass21_80.clear();
		Projectile.aClass21_2931.clear();
	}

	public static void method298(final int i) {
		try {
			aBooleanArray299 = null;
			aClass50_303 = null;
			anIntArrayArray300 = null;
			if (i != -51) {
				method300(-82, null, -71);
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("dj.C(").append(i).append(')').toString());
		}
	}

	final Node getFirst() {
		return hashtable.getFirst();
	}

	static final Class120_Sub22 method300(final int i, final js5 js5, final int i_0_) {
		Class120_Sub22 class120_sub22;
		try {
			if (i_0_ != 112) {
				method300(81, null, -127);
			}
			final byte[] is = js5.getFileSmart(i);
			if (is == null) {
				return null;
			}
			class120_sub22 = new Class120_Sub22(is);
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("dj.F(").append(i).append(',').append(js5 != null ? "{...}" : "null").append(',').append(i_0_).append(')').toString());
		}
		return class120_sub22;
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
		component.removeMouseListener(Class120_Sub14_Sub4.mouseHandler);
		component.removeMouseMotionListener(Class120_Sub14_Sub4.mouseHandler);
		component.removeFocusListener(Class120_Sub14_Sub4.mouseHandler);
		Class42.currentMousePress = 0;
	}

	static final String method305(final int i, final int i_3_) {
		if (i_3_ < 100000) {
			return new StringBuilder("<col=ffff00>").append(i_3_).append("</col>").toString();
		}
		if (i_3_ < 10000000) {
			return new StringBuilder("<col=ffffff>").append(i_3_ / 1000).append(CursorType.aString1238).append("</col>").toString();
		}
		return new StringBuilder("<col=00ff80>").append(i_3_ / 1000000).append(EnumType.aString3455).append("</col>").toString();
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
