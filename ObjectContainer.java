/* Class120_Sub17 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class ObjectContainer extends Node {
	static int anInt2612 = 0;
	static String aString2614 = "glow3:";
	static int anInt2615 = 0;
	static int anInt2616;
	static int canvasRefreshCycle = 500;
	int[] objectIds = { -1 };
	int[] objectCounts = new int[1];
	static Hashtable objectContainerCache = new Hashtable(32);
	static Class29 aClass29_2620 = new Class29();
	static int anInt2621;

	static final JagexInterface method1665(final JagexInterface jagexInterface) {
		if (jagexInterface.parent != -1) {
			return Class74.getJagexInterface(jagexInterface.parent);
		}
		final int id = jagexInterface.bitPacked >>> 16;
		final Class140 class140 = new Class140(Class120_Sub12_Sub13.overridedInterfaces);
		for (OverridedJInterface overridedJInterface = (OverridedJInterface) class140.method1994(); overridedJInterface != null; overridedJInterface = (OverridedJInterface) class140.method1998()) {
			if (id == overridedJInterface.interfaceId) {
				return Class74.getJagexInterface((int) overridedJInterface.uid);
			}
		}
		return null;
	}

	public static void method1666(final byte i) {
		try {
			aString2614 = null;
			aClass29_2620 = null;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("nd.A(").append(i).append(')').toString());
		}
	}

	public ObjectContainer() {
		/* empty */
	}

	static final int getCount(final int type, final int id) {
		final ObjectContainer container = (ObjectContainer) objectContainerCache.get(type);
		if (container == null) {
			return 0;
		}
		if (id == -1) {
			return 0;
		}
		int amount = 0;
		for (int i_15_ = 0; i_15_ < container.objectCounts.length; i_15_++) {
			if (id == container.objectIds[i_15_]) {
				amount += container.objectCounts[i_15_];
			}
		}
		return amount;
	}

	static final int getIndexCount(final int type, final int index) {
		final ObjectContainer container = (ObjectContainer) objectContainerCache.get(type);
		if (container == null) {
			return 0;
		}
		if (index < 0 || index >= container.objectCounts.length) {
			return 0;
		}
		return container.objectCounts[index];
	}

	static final int getId(final int type, final int index) {
		final ObjectContainer container = (ObjectContainer) objectContainerCache.get(type);
		if (container == null) {
			return -1;
		}
		if (index < 0 || index >= container.objectIds.length) {
			return -1;
		}
		return container.objectIds[index];
	}

	static final void addObject(final int type, final int index, final int id, final int count) {
		ObjectContainer container = (ObjectContainer) objectContainerCache.get(type);
		if (container == null) {
			container = new ObjectContainer();
			objectContainerCache.put(container, type);
		}
		if (container.objectIds.length <= index) {
			final int[] is = new int[index + 1];
			final int[] is_5_ = new int[index + 1];
			for (int i_6_ = 0; container.objectIds.length > i_6_; i_6_++) {
				is[i_6_] = container.objectIds[i_6_];
				is_5_[i_6_] = container.objectCounts[i_6_];
			}
			for (int i_7_ = container.objectIds.length; i_7_ < index; i_7_++) {
				is[i_7_] = -1;
				is_5_[i_7_] = 0;
			}
			container.objectCounts = is_5_;
			container.objectIds = is;
		}
		container.objectIds[index] = id;
		container.objectCounts[index] = count;
	}

	static final void remove(final int type) {
		final ObjectContainer container = (ObjectContainer) objectContainerCache.get(type);
		if (container != null) {
			container.unlink();
		}
	}
}
