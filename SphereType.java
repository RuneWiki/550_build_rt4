/* Class153 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class SphereType {
	int x;
	int y;
	int mediaId;
	boolean fixedSize;
	int z;
	int glowColor = 16777215;
	static js5 aClass50_1433;
	int type;//0 - flat texture, 1 - 3d 17 points polygon with texture, 2 - model
	int size = 8;
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

	static final WallDecoration removeWallDecoration(final int x, final int z, final int level) {
		final GroundTile groundTile = LabelGroup.activeGroundTiles[level][x][z];
		if (groundTile == null) {
			return null;
		}
		final WallDecoration wallDecoration = groundTile.wallDecoration;
		groundTile.wallDecoration = null;
		return wallDecoration;
	}

	static final int method2073(final int i) {
		return i >> 11 & 0x7f;
	}

	private final void decode(final Buffer buffer, final int code) {
		if (code == 1) {
			this.size = buffer.getUShort();
		} else if (code == 2) {
			this.fixedSize = true;
		} else if (code == 3) {
			this.x = buffer.getShort();
			this.y = buffer.getShort();
			this.z = buffer.getShort();
		} else if (code == 4) {
			this.type = buffer.getUByte();
		} else if (code == 5) {
			this.mediaId = buffer.getUShort();
		} else if (code == 6) {
			this.glowColor = buffer.getMedium();
		}
	}

	static final void method2076(final int i) {
		if (QuickChatCategoryType.anIntArray3654 == null || QuickChatCategoryType.anIntArray3654.length < i) {
			QuickChatCategoryType.anIntArray3654 = new int[i];
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

	static final void setup(final js5 js5) {
		aClass50_3373 = js5;
	}

	static final SphereType list(final int id) {
		SphereType sphereType = (SphereType) recentUse.get(id);
		if (sphereType != null) {
			return sphereType;
		}
		final byte[] data = aClass50_3373.getFile(30, id);//Has 0 files in 550 cache
		sphereType = new SphereType();
		if (data != null) {
			sphereType.decode(new Buffer(data));
		}
		recentUse.put(sphereType, id);
		return sphereType;
	}

	public SphereType() {
		/* empty */
	}
}
