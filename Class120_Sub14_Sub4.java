/* Class120_Sub14_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class120_Sub14_Sub4 extends NodeSub {
	static boolean aBoolean3464 = false;
	static MouseHandler mouseHandler;
	static int anInt3466 = 0;
	Class180_Sub3 aClass180_Sub3_3467;
	static boolean[] aBooleanArray3468;
	static int anInt3469;
	static boolean aBoolean3470;

	static {
		mouseHandler = new MouseHandler();
		aBooleanArray3468 = new boolean[100];
		anInt3469 = 0;
		aBoolean3470 = false;
	}

	public static void method1436(final int i) {
		try {
			aBooleanArray3468 = null;
			mouseHandler = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ed.C(").append(i).append(')').toString());
		}
	}

	static final boolean method1437(final int i, final long l, final int i_0_, final int i_1_) {
		boolean bool;
		try {
			final int i_2_ = (0x35960c & (int) l) >> 20;
			if (i_0_ != 0) {
				return true;
			}
			final int i_3_ = 0x1f & (int) l >> 14;
			final int i_4_ = 0x7fffffff & (int) (l >>> 32);
			if (i_3_ == 10 || i_3_ == 11 || i_3_ == 22) {
				final Class184 class184 = Class120_Sub1.method1035(i_4_, 0);
				int i_5_ = class184.anInt1857;
				int i_6_;
				int i_7_;
				if (i_2_ != 0 && i_2_ != 2) {
					i_7_ = class184.anInt1827;
					i_6_ = class184.anInt1841;
				} else {
					i_6_ = class184.anInt1827;
					i_7_ = class184.anInt1841;
				}
				if (i_2_ != 0) {
					i_5_ = (i_5_ << i_2_ & 0xf) + (i_5_ >> 4 + -i_2_);
				}
				Class120_Sub14_Sub5.method1440(Class100.selfPlayer.anIntArray2958[0], 0, i_5_, true, i_7_, i, Class100.selfPlayer.anIntArray3040[0], 0, (byte) -101, i_6_, i_1_);
			} else {
				Class120_Sub14_Sub5.method1440(Class100.selfPlayer.anIntArray2958[0], i_2_, 0, true, 0, i, Class100.selfPlayer.anIntArray3040[0], 1 + i_3_, (byte) -111, 0, i_1_);
			}
			bool = true;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ed.A(").append(i).append(',').append(l).append(',').append(i_0_).append(',').append(i_1_).append(')').toString());
		}
		return bool;
	}

	Class120_Sub14_Sub4(final Class180_Sub3 class180_sub3) {
		this.aClass180_Sub3_3467 = class180_sub3;
	}

	static final boolean method1438(final int i, final int i_8_) {
		boolean bool;
		try {
			if (i_8_ < i) {
				return false;
			}
			int i_9_ = Class120_Sub29.aShortArray2777[i_8_];
			if (i_9_ >= 2000) {
				i_9_ -= 2000;
			}
			if (i_9_ == 1009) {
				return true;
			}
			bool = false;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ed.B(").append(i).append(',').append(i_8_).append(')').toString());
		}
		return bool;
	}
}
