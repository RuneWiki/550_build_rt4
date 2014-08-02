/* Class141 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class PlainTile {
	int anInt1346;
	int anInt1347;
	int anInt1348;
	int anInt1349;
	int anInt1351;
	boolean aBoolean1352 = true;
	int anInt1353;
	static boolean[] spriteHasAlpha;
	static int selectedObjInterface;
	static int anInt1356;
	static int anInt1357 = 0;

	static final void method2001(final int i) {
		synchronized (Class169.keyboardHandler) {
			anInt1357 = Class120_Sub12_Sub36.anInt3423;
			Class120_Sub14_Sub15.anInt3582++;
			if (AnimatedLocation.anInt3074 >= 0) {
				while (AnimatedLocation.anInt3074 != Class111.anInt1060) {
					final int i_0_ = Class120_Sub12_Sub36.anIntArray3416[Class111.anInt1060];
					Class111.anInt1060 = Class111.anInt1060 - -1 & 0x7f;
					if (i_0_ >= 0) {
						NodeCache.aBooleanArray299[i_0_] = true;
					} else {
						NodeCache.aBooleanArray299[i_0_ ^ 0xffffffff] = false;
					}
				}
			} else {
				for (int i_1_ = 0; i_1_ < 112; i_1_++) {
					NodeCache.aBooleanArray299[i_1_] = false;
				}
				AnimatedLocation.anInt3074 = Class111.anInt1060;
			}
			Class120_Sub12_Sub36.anInt3423 = Class120_Sub28.anInt2762;
		}
	}

	public static void method2002(final int i) {
		try {
			SpotAnimType.recentUse = null;
			spriteHasAlpha = null;
			if (i != 0) {
				anInt1357 = 119;
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("qf.C(").append(i).append(')').toString());
		}
	}

	PlainTile(final int i, final int i_2_, final int i_3_, final int i_4_, final int i_5_, final int i_6_, final boolean bool) {
		this.anInt1353 = i_4_;
		this.anInt1349 = i;
		this.anInt1348 = i_5_;
		this.anInt1346 = i_6_;
		this.anInt1351 = i_3_;
		this.aBoolean1352 = bool;
		this.anInt1347 = i_2_;
	}

	static final Class120_Sub12 method2003(final Buffer buffer) {
		buffer.getUByte();
		final int i_7_ = buffer.getUByte();
		final Class120_Sub12 class120_sub12_8_ = AbstractMouseWheelHandler.method159(i_7_);
		class120_sub12_8_.anInt2570 = buffer.getUByte();
		final int codeLength = buffer.getUByte();
		for (int loop = 0; loop < codeLength; loop++) {
			final int code = buffer.getUByte();
			class120_sub12_8_.decode(buffer, code);
		}
		class120_sub12_8_.postDecode();
		return class120_sub12_8_;
	}
}
