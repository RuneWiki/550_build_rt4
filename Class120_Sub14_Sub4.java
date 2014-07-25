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
			throw EnumType.method1428(runtimeexception, new StringBuilder("ed.C(").append(i).append(')').toString());
		}
	}

	static final boolean method1437(final int i, final long l, final int i_1_) {
		final int i_2_ = (0x35960c & (int) l) >> 20;
		final int i_3_ = 0x1f & (int) l >> 14;
		final int i_4_ = 0x7fffffff & (int) (l >>> 32);
		if (i_3_ == 10 || i_3_ == 11 || i_3_ == 22) {
			final LocType locType = LocType.list(i_4_);
			int i_5_ = locType.anInt1857;
			int i_6_;
			int i_7_;
			if (i_2_ != 0 && i_2_ != 2) {
				i_7_ = locType.sizeZ;
				i_6_ = locType.sizeX;
			} else {
				i_6_ = locType.sizeZ;
				i_7_ = locType.sizeX;
			}
			if (i_2_ != 0) {
				i_5_ = (i_5_ << i_2_ & 0xf) + (i_5_ >> 4 + -i_2_);
			}
			Class120_Sub14_Sub5.setFlagPosition(TileParticleQueue.selfPlayer.walkQueueX[0], 0, i_5_, true, i_7_, i, TileParticleQueue.selfPlayer.walkQueueZ[0], 0, i_6_, i_1_);
		} else {
			Class120_Sub14_Sub5.setFlagPosition(TileParticleQueue.selfPlayer.walkQueueX[0], i_2_, 0, true, 0, i, TileParticleQueue.selfPlayer.walkQueueZ[0], 1 + i_3_, 0, i_1_);
		}
		return true;
	}

	Class120_Sub14_Sub4(final Class180_Sub3 class180_sub3) {
		this.aClass180_Sub3_3467 = class180_sub3;
	}

	static final boolean method1438(final int i_8_) {
		if (i_8_ < 0) {
			return false;
		}
		int i_9_ = Class120_Sub29.aShortArray2777[i_8_];
		if (i_9_ >= 2000) {
			i_9_ -= 2000;
		}
		if (i_9_ == 1009) {
			return true;
		}
		return false;
	}
}
