/* Class120_Sub17 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class ObjectContainer extends Node {
	static int anInt2612 = 0;
	static int anInt2615 = 0;
	static int renderPitchCos;
	static int canvasRefreshCycle = 500;
	int[] objectIds = { -1 };
	int[] objectCounts = new int[1];
	static Hashtable objectContainerCache = new Hashtable(32);
	static BasType defaultBasType = new BasType();
	static int anInt2621;

	public ObjectContainer() {
		/* empty */
	}

	static final int getCount(final int type, final int objId) {
		final ObjectContainer objectContainer = (ObjectContainer) objectContainerCache.get(type);
		if (objectContainer == null) {
			return 0;
		}
		if (objId == -1) {
			return 0;
		}
		int amount = 0;
		for (int id = 0; id < objectContainer.objectCounts.length; id++) {
			if (objId == objectContainer.objectIds[id]) {
				amount += objectContainer.objectCounts[id];
			}
		}
		return amount;
	}

	static final int getIndexCount(final int type, final int index) {
		final ObjectContainer objectContainer = (ObjectContainer) objectContainerCache.get(type);
		if (objectContainer == null) {
			return 0;
		}
		if (index < 0 || index >= objectContainer.objectCounts.length) {
			return 0;
		}
		return objectContainer.objectCounts[index];
	}

	static final int getId(final int type, final int index) {
		final ObjectContainer objectContainer = (ObjectContainer) objectContainerCache.get(type);
		if (objectContainer == null) {
			return -1;
		}
		if (index < 0 || index >= objectContainer.objectIds.length) {
			return -1;
		}
		return objectContainer.objectIds[index];
	}

	static final void addObject(final int objId, final int objCount, final int index, final int type) {
		ObjectContainer objectContainer = (ObjectContainer) objectContainerCache.get(type);
		if (objectContainer == null) {
			objectContainer = new ObjectContainer();
			objectContainerCache.put(objectContainer, type);
		}
		if (objectContainer.objectIds.length <= index) {
			final int[] ids = new int[index + 1];
			final int[] counts = new int[index + 1];
			for (int id = 0; id < objectContainer.objectIds.length; id++) {
				ids[id] = objectContainer.objectIds[id];
				counts[id] = objectContainer.objectCounts[id];
			}
			for (int id = objectContainer.objectIds.length; id < index; id++) {
				ids[id] = -1;
				counts[id] = 0;
			}
			objectContainer.objectCounts = counts;
			objectContainer.objectIds = ids;
		}
		objectContainer.objectIds[index] = objId;
		objectContainer.objectCounts[index] = objCount;
	}

	static final void remove(final int type) {
		final ObjectContainer objectContainer = (ObjectContainer) objectContainerCache.get(type);
		if (objectContainer != null) {
			objectContainer.unlink();
		}
	}

	static final void reset(final int type) {
		final ObjectContainer objectContainer = (ObjectContainer) objectContainerCache.get(type);
		if (objectContainer != null) {
			for (int id = 0; id < objectContainer.objectIds.length; id++) {
				objectContainer.objectIds[id] = -1;
				objectContainer.objectCounts[id] = 0;
			}
		}
	}

	static final int getFreeSpaces(final int type) {
		if (type < 0) {
			return 0;
		}
		final ObjectContainer objectContainer = (ObjectContainer) objectContainerCache.get(type);
		if (objectContainer == null) {
			return InvType.list(type).size;
		}
		int freeSpaces = 0;
		for (int id = 0; id < objectContainer.objectIds.length; id++) {
			if (objectContainer.objectIds[id] == -1) {
				freeSpaces++;
			}
		}
		freeSpaces += InvType.list(type).size - objectContainer.objectIds.length;
		return freeSpaces;
	}

	static final int getTotalParam(final int paramId, final int type, final boolean multiplyByCount) {
		final ObjectContainer objectContainer = (ObjectContainer) objectContainerCache.get(type);
		if (objectContainer == null) {
			return 0;
		}
		int value = 0;
		for (int id = 0; id < objectContainer.objectIds.length; id++) {
			if (objectContainer.objectIds[id] >= 0 && Node.objCount > objectContainer.objectIds[id]) {
				final ObjType objType = ObjType.list(objectContainer.objectIds[id]);
				if (objType.params != null) {
					final IntegerNode integerNode = (IntegerNode) objType.params.get(paramId);
					if (integerNode != null) {
						if (multiplyByCount) {
							value += integerNode.value * objectContainer.objectCounts[id];
						} else {
							value += integerNode.value;
						}
					}
				}
			}
		}
		return value;
	}
}
