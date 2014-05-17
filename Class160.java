/* Class160 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class160 {
	int anInt1491;
	static volatile int currentMouseX = -1;
	static int anInt1493;
	static int anInt1494;
	static int[] anIntArray1495 = new int[100];
	private byte aByte1496;
	int anInt1497;
	int anInt1498;
	int anInt1499;
	int anInt1500;
	static int[] anIntArray1501;
	static String[] aStringArray1502;

	static {
		anInt1494 = 1;
		aStringArray1502 = new String[100];
	}

	final int method2097(final int i) {
		int i_0_;
		try {
			i_0_ = (0x8 & aByte1496) != 8 ? 0 : 1;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("t.B(").append(i).append(')').toString());
		}
		return i_0_;
	}

	public static void method2098(final int i) {
		try {
			aStringArray1502 = null;
			anIntArray1495 = null;
			if (i != 1) {
				method2099(null, true, -14, null);
			}
			anIntArray1501 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("t.C(").append(i).append(')').toString());
		}
	}

	static final void method2099(final Class50 class50, final boolean bool, final int i, final Class50 class50_1_) {
		try {
			Class140.aBoolean1340 = bool;
			Class190.aClass50_2099 = class50_1_;
			if (i == -9746) {
				Class28.aClass50_181 = class50;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("t.A(").append(class50 != null ? "{...}" : "null").append(',').append(bool).append(',').append(i).append(',').append(class50_1_ != null ? "{...}" : "null").append(')').toString());
		}
	}

	final int method2100(final int i) {
		int i_2_;
		try {
			if (i != -1) {
				return -125;
			}
			i_2_ = aByte1496 & 0x7;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("t.D(").append(i).append(')').toString());
		}
		return i_2_;
	}

	public Class160() {
		/* empty */
	}

	Class160(final Buffer class120_sub7) {
		aByte1496 = class120_sub7.getByte();
		this.anInt1500 = class120_sub7.getUShort();
		this.anInt1499 = class120_sub7.getInt();
		this.anInt1491 = class120_sub7.getInt();
		this.anInt1497 = class120_sub7.getInt();
		this.anInt1498 = class120_sub7.getInt();
	}
}
