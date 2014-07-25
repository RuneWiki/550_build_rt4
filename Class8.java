/* Class8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class8 {
	static String aString64 = "Discard";
	static byte[][][] aByteArrayArrayArray65;

	static final void constructFonts(final js5 js5, final js5 class50_0_) {
		ObjectCache.smallFont = Class9.method117(js5, class50_0_, 18265, Class32.p11fullId, 0);
		if (HDToolkit.glEnabled) {
			Class33.aClass120_Sub14_Sub8_Sub2_274 = Class93.method772(0, class50_0_, Class32.p11fullId, js5, 1);
		} else {
			Class33.aClass120_Sub14_Sub8_Sub2_274 = (Class120_Sub14_Sub8_Sub2) ObjectCache.smallFont;
		}
		Class120_Sub12_Sub20.plainFont = Class9.method117(js5, class50_0_, 18265, Class191.p12fullId, 0);
		Class120_Sub12_Sub22.boldFont = Class9.method117(js5, class50_0_, 18265, Class110.b12fullId, 0);
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

	static final void method111(final byte i) {
		try {
			AbstractGraphicsBuffer.anInt1175 = 0;
			client.aByte2201 = i;
			Class65.flagY = 0;
			Class120_Sub12_Sub26.flagX = 0;
			SceneGroundObject.packetSetFlagPosition = false;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("aj.C(").append(i).append(')').toString());
		}
	}

	public static void method112(final byte i) {
		try {
			if (i >= -28) {
				aString64 = null;
			}
			aString64 = null;
			aByteArrayArrayArray65 = null;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("aj.B(").append(i).append(')').toString());
		}
	}
}
