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
			if (Class180_Sub6.anInt3074 >= 0) {
				while (Class180_Sub6.anInt3074 != Class111.anInt1060) {
					final int i_0_ = Class120_Sub12_Sub36.anIntArray3416[Class111.anInt1060];
					Class111.anInt1060 = Class111.anInt1060 - -1 & 0x7f;
					if (i_0_ >= 0) {
						Class35.aBooleanArray299[i_0_] = true;
					} else {
						Class35.aBooleanArray299[i_0_ ^ 0xffffffff] = false;
					}
				}
			} else {
				for (int i_1_ = 0; i_1_ < 112; i_1_++) {
					Class35.aBooleanArray299[i_1_] = false;
				}
				Class180_Sub6.anInt3074 = Class111.anInt1060;
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

	static final Class120_Sub12 method2003(final Buffer class120_sub7, final int i) {
		Class120_Sub12 class120_sub12;
		try {
			class120_sub7.getUByte();
			final int i_7_ = class120_sub7.getUByte();
			final Class120_Sub12 class120_sub12_8_ = AbstractMouseWheelHandler.method159(9, i_7_);
			class120_sub12_8_.anInt2570 = class120_sub7.getUByte();
			final int i_9_ = class120_sub7.getUByte();
			for (int i_10_ = 0; i_10_ < i_9_; i_10_++) {
				final int i_11_ = class120_sub7.getUByte();
				class120_sub12_8_.method1180((byte) -43, class120_sub7, i_11_);
			}
			if (i != 18120) {
				anInt1356 = -77;
			}
			class120_sub12_8_.method1193((byte) 91);
			class120_sub12 = class120_sub12_8_;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("qf.A(").append(class120_sub7 != null ? "{...}" : "null").append(',').append(i).append(')').toString());
		}
		return class120_sub12;
	}
}
