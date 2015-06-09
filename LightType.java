/* Class181 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class LightType {
	static NodeCache aClass35_1784 = new NodeCache(16);
	static int currentBaseZ;
	int anInt1786;
	int anInt1787 = 2048;
	int anInt1788;
	int anInt1789 = 2048;
	static js5 configClient;
	static ObjectCache recentUse = new ObjectCache(64);
	static int[] anIntArray1790 = new int[5];
	static int locationModelMissingCount = 0;

	static final String method2439() {
		String host = "www";
		if (AbstractIndexedSprite.modeWhere != 0) {
			host = "www-wtqa";
		}
		String settings = "";
		if (Class120_Sub12_Sub25.params != null) {
			settings = new StringBuilder("/p=").append(Class120_Sub12_Sub25.params).toString();
		}
		return "http://" + host + ".runescape.com/l=" + Class9.language + "/a=" + Class120_Sub12_Sub33.affiliateId + settings + "/";
	}

	private final void decode(final Buffer buffer, final int code) {
		if (code == 1) {
			this.anInt1788 = buffer.getUByte();
		}
		if (code == 2) {
			this.anInt1787 = buffer.getUShort();
		}
		if (code == 3) {
			this.anInt1789 = buffer.getUShort();
		}
		if (code == 4) {
			this.anInt1786 = buffer.getShort();
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
		configClient = js5;
	}

	static final LightType list(final int id) {
		LightType lightType = (LightType) recentUse.get(id);
		if (lightType != null) {
			return lightType;
		}
		final byte[] data = configClient.getFile(31, id);
		lightType = new LightType();
		if (data != null) {
			lightType.decode(new Buffer(data));
		}
		recentUse.put(lightType, id);
		return lightType;
	}

	public LightType() {
		this.anInt1786 = 0;
		this.anInt1788 = 0;
	}
}
