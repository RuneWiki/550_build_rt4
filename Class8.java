/* Class8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class8 {
	static String aString64 = "Discard";
	static byte[][][] aByteArrayArrayArray65;

	static final void constructFonts(final js5 spriteJs5, final js5 fontJs5) {
		ObjectCache.smallFont = Class9.constructAbstractFont(spriteJs5, fontJs5, Class32.p11fullId, 0);
		if (HDToolkit.glEnabled) {
			Class33.smallFont2 = Class93.constructLDFont(spriteJs5, fontJs5, Class32.p11fullId, 0);
		} else {
			Class33.smallFont2 = (LDFont) ObjectCache.smallFont;
		}
		Class120_Sub12_Sub20.plainFont = Class9.constructAbstractFont(spriteJs5, fontJs5, Class191.p12fullId, 0);
		Class120_Sub12_Sub22.boldFont = Class9.constructAbstractFont(spriteJs5, fontJs5, Class110.b12fullId, 0);
	}

	static final int getCharCount(final String string, final char wantedChar) {
		int count = 0;
		for (int id = 0; id < string.length(); id++) {
			if (string.charAt(id) == wantedChar) {
				count++;
			}
		}
		return count;
	}

	static final void resetMapback() {
		AbstractGraphicsBuffer.mapbackState = 0;
		client.flagCounter = 0;
		Class65.flagY = 0;
		Class120_Sub12_Sub26.flagX = 0;
		SceneGroundObject.packetSetFlagPosition = false;
	}

}
