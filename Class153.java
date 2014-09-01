/* Class153 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class153 {
	int anInt1427;
	int anInt1428;
	int anInt1429;
	boolean aBoolean1430;
	int anInt1431;
	int anInt1432 = 16777215;
	static js5 aClass50_1433;
	int anInt1434;
	int anInt1435 = 8;
	static js5 aClass50_3373;
	static ObjectCache recentUse = new ObjectCache(16);
	static int anInt1436 = -1;

	static final AbstractIndexedSprite constructAbstractIndexedSprite(final js5 js5, final int groupId) {
		if (!ObjType.decodedSprites(js5, groupId)) {
			return null;
		}
		return Class11.constructAbstractIndexedSprite();
	}

	static final void method2070() {
		Class120_Sub14_Sub13.method1532(0, 0);
	}

	public static void method2071() {
		aClass50_1433 = null;
	}

	static final Class186 method2072(final int x, final int z, final int level) {
		final GroundTile class120_sub18 = LabelGroup.groundTiles[level][x][z];
		if (class120_sub18 == null) {
			return null;
		}
		final Class186 class186 = class120_sub18.aClass186_2639;
		class120_sub18.aClass186_2639 = null;
		return class186;
	}

	static final int method2073(final int i) {
		return i >> 11 & 0x7f;
	}

	private final void decode(final Buffer buffer, final int code) {
		if (code == 1) {
			this.anInt1435 = buffer.getUShort();
		} else if (code == 2) {
			this.aBoolean1430 = true;
		} else if (code == 3) {
			this.anInt1427 = buffer.getShort();
			this.anInt1428 = buffer.getShort();
			this.anInt1431 = buffer.getShort();
		} else if (code == 4) {
			this.anInt1434 = buffer.getUByte();
		} else if (code == 5) {
			this.anInt1429 = buffer.getUShort();
		} else if (code == 6) {
			this.anInt1432 = buffer.getMedium();
		}
	}

	static final void method2076(final int i) {
		if (Class120_Sub14_Sub23.anIntArray3654 == null || Class120_Sub14_Sub23.anIntArray3654.length < i) {
			Class120_Sub14_Sub23.anIntArray3654 = new int[i];
		}
	}

	final void decode(final Buffer buffer) {
		for (;;) {
			final int code = buffer.getUByte();
			if (code == 0) {
				break;
			}
			decode(buffer, code);
		}
	}

	static final Class153 list(final int id) {
		Class153 class153 = (Class153) recentUse.get(id);
		if (class153 != null) {
			return class153;
		}
		final byte[] data = aClass50_3373.getFile(30, id);//Has 0 files in 550 cache
		class153 = new Class153();
		if (data != null) {
			class153.decode(new Buffer(data));
		}
		recentUse.put(class153, id);
		return class153;
	}

	public Class153() {
		/* empty */
	}
}
