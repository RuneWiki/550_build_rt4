/* Class124 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class OverlayType {
	boolean aBoolean1193 = true;
	int anInt1194;
	boolean aBoolean1195 = true;
	boolean aBoolean1196;
	int anInt1197;
	int anInt1198;
	int anInt1199;
	int anInt1200;
	static WorldMapFont aClass98_1201;
	int anInt1202;
	int textureId;
	static int overlayAmount;
	static js5 configClient;
	static ObjectCache recentUse = new ObjectCache(64);

	static final int method1874(final int i_1_) {
		if (i_1_ > 0) {
			return 1;
		}
		if (i_1_ < 0) {
			return -1;
		}
		return 0;
	}

	final void decode(final Buffer buffer, final int id) {
		for (;;) {
			final int code = buffer.getUByte();
			if (code == 0) {
				break;
			}
			decode(buffer, code, id);
		}
	}

	private final void decode(final Buffer buffer, final int code, final int id) {
		if (code == 1) {
			this.anInt1197 = Class120_Sub12_Sub1.method1200(buffer.getMedium());
		} else if (code == 2) {
			this.textureId = buffer.getUByte();
		} else if (code == 3) {
			this.textureId = buffer.getUShort();
			if (this.textureId == 65535) {
				this.textureId = -1;
			}
		} else if (code == 5) {
			this.aBoolean1195 = false;
		} else if (code == 7) {
			this.anInt1198 = Class120_Sub12_Sub1.method1200(buffer.getMedium());
		} else if (code == 8) {
			Class23.anInt137 = id;
		} else if (code == 9) {
			this.anInt1202 = buffer.getUShort();
		} else if (code == 10) {
			this.aBoolean1193 = false;
		} else if (code == 11) {
			this.anInt1194 = buffer.getUByte();
		} else if (code == 12) {
			this.aBoolean1196 = true;
		} else if (code == 13) {
			this.anInt1200 = buffer.getMedium();
		} else if (code == 14) {
			this.anInt1199 = buffer.getUByte();
		}
	}

	static final void setupOverlay(final js5 js5) {
		configClient = js5;
		overlayAmount = configClient.getFileAmount(4);
	}

	static final OverlayType list(final int id) {
		OverlayType overlayType = (OverlayType) recentUse.get(id);
		if (overlayType != null) {
			return overlayType;
		}
		final byte[] data = configClient.getFile(4, id);
		overlayType = new OverlayType();
		if (data != null) {
			overlayType.decode(new Buffer(data), id);
		}
		recentUse.put(overlayType, id);
		return overlayType;
	}

	public OverlayType() {
		this.anInt1194 = 8;
		this.anInt1198 = -1;
		this.anInt1197 = 0;
		this.anInt1200 = 1190717;
		this.anInt1199 = 16;
		this.aBoolean1196 = false;
		this.textureId = -1;
		this.anInt1202 = 128;
	}
}
