/* Class158 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class158 {
	static int anInt1475 = -1;
	int anInt1476;
	static boolean aBoolean1478 = true;
	static int anInt1479;
	Class80 aClass80_1480;
	static int anInt1481;
	static long aLong1482;
	static String aString1483 = "cyan:";
	int anInt1484;
	int anInt1485;

	static {
		aLong1482 = 0L;
	}

	static final void method2090(final int i, final int i_0_, final int i_1_, final int i_2_, final int i_3_, final int i_4_) {
		if (i < Class32.anInt260 || Class120_Sub14_Sub11.anInt3544 < i_4_ || i_1_ < Class120_Sub30_Sub2.anInt3699 || Class139.anInt1334 < i_3_) {
			if (i_2_ == 1) {
				AbstractGraphicsBuffer.method1844(i_4_, (byte) -83, i_3_, i_1_, i_0_, i);
			} else {
				Class120_Sub12_Sub28.method1347(i_4_, i_0_, i_2_, i, (byte) -9, i_1_, i_3_);
			}
		} else if (i_2_ == 1) {
			Class120_Sub12_Sub21.method1308(-1, i_0_, i, i_4_, i_1_, i_3_);
		} else {
			Class120_Sub12_Sub7.method1231(0, i_0_, i, i_3_, i_4_, i_2_, i_1_);
		}
	}

	public static void method2091(final int i) {
		try {
			if (i >= -47) {
				method2090(58, -57, -61, 71, -64, 3);
			}
			aString1483 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("sk.B(").append(i).append(')').toString());
		}
	}

	Class158(final int i, final int i_5_, final int i_6_, final int i_7_) {
		final Class80 class80 = Class120_Sub12_Sub31.method1365(0, i);
		this.anInt1476 = i_7_;
		this.anInt1484 = i_6_;
		this.anInt1485 = i_5_;
		if (!HDToolkit.glEnabled && (class80.anInt765 ^ 0xffffffff) != 0) {
			this.aClass80_1480 = Class120_Sub12_Sub31.method1365(0, class80.anInt765);
		} else {
			this.aClass80_1480 = class80;
		}
	}

	Class158(final Class80 class80, final int i, final int i_8_, final int i_9_) {
		this.anInt1485 = i;
		this.aClass80_1480 = class80;
		this.anInt1476 = i_9_;
		this.anInt1484 = i_8_;
	}
}
