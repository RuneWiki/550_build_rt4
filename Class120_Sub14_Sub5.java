/* Class120_Sub14_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class120_Sub14_Sub5 extends NodeSub {
	static boolean aBoolean3471 = true;
	boolean aBoolean3472 = false;
	int anInt3473 = -1;
	int anInt3474;
	int anInt3475;
	boolean aBoolean3476 = false;
	static byte[][][] aByteArrayArrayArray3477;
	int anInt3478;
	static int anInt3479 = 0;
	int anInt3480;
	int anInt3481;

	public static void method1439(final int i) {
		try {
			aByteArrayArrayArray3477 = null;
			if (i != -28811) {
				aBoolean3471 = false;
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("fg.D(").append(i).append(')').toString());
		}
	}

	static final void method1440(final int i, final int i_0_, final int i_1_, final boolean bool, final int i_2_, final int i_3_, final int i_4_, final int i_5_, final int i_7_, final int i_8_) {
		if (Class100.selfPlayer.getSize() == 2) {
			Class143.method2013(i_8_, i_2_, i_4_, i_5_, i, bool, i_3_, -1, i_0_, i_1_, i_7_);
		} else if (Class100.selfPlayer.getSize() > 2) {
			ParamType.method1518(i_5_, i_8_, i, i_2_, i_4_, 26109, i_7_, i_3_, i_1_, Class100.selfPlayer.getSize(), i_0_, bool);
		} else {
			Class93.method775(bool, i_4_, i_8_, i_7_, i_0_, i_3_, i_5_, i, i_1_, 82, i_2_);
		}
	}

	static final void method1441(final int i) {
		try {
			final int[] is = new int[Node.anInt1143];
			int i_9_ = 0;
			for (int i_10_ = 0; Node.anInt1143 > i_10_; i_10_++) {
				final ObjType objType = ObjType.list(i_10_);
				if (objType.anInt1546 >= 0 || objType.anInt1553 >= 0) {
					is[i_9_++] = i_10_;
				}
			}
			KeyboardHandler.anIntArray1506 = new int[i_9_];
			if (i > -117) {
				method1442((byte) -58, 109, -113, 39);
			}
			for (int i_11_ = 0; i_9_ > i_11_; i_11_++) {
				KeyboardHandler.anIntArray1506[i_11_] = is[i_11_];
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("fg.B(").append(i).append(')').toString());
		}
	}

	static final int method1442(final byte i, final int i_12_, int i_13_, final int i_14_) {
		int i_15_;
		try {
			if (i != -123) {
				anInt3479 = -28;
			}
			if (i_14_ <= 243) {
				if (i_14_ > 217) {
					i_13_ >>= 3;
				} else if (i_14_ > 192) {
					i_13_ >>= 2;
				} else if (i_14_ > 179) {
					i_13_ >>= 1;
				}
			} else {
				i_13_ >>= 4;
			}
			i_15_ = (i_14_ >> 1) + (i_13_ >> 5 << 7) + (i_12_ >> 2 << 10);
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("fg.C(").append(i).append(',').append(i_12_).append(',').append(i_13_).append(',').append(i_14_).append(')').toString());
		}
		return i_15_;
	}

	public Class120_Sub14_Sub5() {
		/* empty */
	}
}
