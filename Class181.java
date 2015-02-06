/* Class181 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class181 {
	static NodeCache aClass35_1784 = new NodeCache(16);
	static int currentBaseZ;
	int anInt1786;
	int anInt1787 = 2048;
	int anInt1788;
	int anInt1789 = 2048;
	static int[] anIntArray1790 = new int[5];
	static int anInt1791 = 0;

	public static void method2438() {
		aClass35_1784 = null;
		anIntArray1790 = null;
	}

	static final String method2439() {
		String host = "www";
		if (AbstractIndexedSprite.modeWhere != 0) {
			host = "www-wtqa";
		}
		String settings = "";
		if (Class120_Sub12_Sub25.settings != null) {
			settings = new StringBuilder("/p=").append(Class120_Sub12_Sub25.settings).toString();
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

	static final Class181 list(final int id) {
		Class181 class181 = (Class181) Class120_Sub12_Sub35.aClass21_3411.get(id);
		if (class181 != null) {
			return class181;
		}
		final byte[] is = Class101.aClass50_966.getFile(31, id);
		class181 = new Class181();
		if (is != null) {
			class181.decode(new Buffer(is));
		}
		Class120_Sub12_Sub35.aClass21_3411.put(class181, id);
		return class181;
	}

	public Class181() {
		this.anInt1786 = 0;
		this.anInt1788 = 0;
	}
}
