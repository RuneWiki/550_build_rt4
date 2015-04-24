/* Class15 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class15 {
	static ObjectCache aClass21_95;
	static int rectDebugType = 0;
	static boolean menuOpen;
	static long aLong98;
	static LDFont objSmallFont;
	static byte[] aByteArray100;
	static int[] anIntArray101;

	static {
		aClass21_95 = new ObjectCache(4);
		menuOpen = false;
		aLong98 = 0L;
		aByteArray100 = new byte[32896];
		int i = 0;
		for (int i_0_ = 0; i_0_ < 256; i_0_++) {
			for (int i_1_ = 0; i_1_ <= i_0_; i_1_++) {
				aByteArray100[i++] = (byte) (int) (255.0 / Math.sqrt((i_0_ * i_0_ + i_1_ * i_1_ - -65535) / 65535.0F));
			}
		}
		anIntArray101 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };
	}

	static final void method145(final js5 js5) {
		Varp.aClass50_1517 = js5;
		Class120_Sub12_Sub22.anInt3302 = Varp.aClass50_1517.getFileAmount(16);
	}

}
