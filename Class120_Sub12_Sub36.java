/* Class120_Sub12_Sub36 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class120_Sub12_Sub36 extends Class120_Sub12 {
	static int[] localNpcIndices;
	static int[] anIntArray3416;
	static int[] anIntArray3417;
	static Class50 aClass50_3418;
	static Class50 aClass50_3419;
	static int[][][] anIntArrayArrayArray3420;
	static byte[][] aByteArrayArray3421;
	static int[] anIntArray3422;
	static int anInt3423 = 0;
	static int anInt3424;

	static {
		localNpcIndices = new int[1024];
		anIntArray3422 = new int[100];
		anInt3424 = 0;
		anIntArray3416 = new int[128];
	}

	static final void method1387(final byte i) {
		try {
			Class120_Sub12_Sub35.aClass21_3411.method190(false);
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("uc.U(").append(i).append(')').toString());
		}
	}

	public static void method1388(final byte i) {
		try {
			aClass50_3419 = null;
			aByteArrayArray3421 = null;
			anIntArray3416 = null;
			if (i != 27) {
				method1387((byte) -96);
			}
			anIntArray3417 = null;
			anIntArray3422 = null;
			localNpcIndices = null;
			anIntArrayArrayArray3420 = null;
			aClass50_3418 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("uc.S(").append(i).append(')').toString());
		}
	}

	public Class120_Sub12_Sub36() {
		super(1, false);
	}

	@Override
	final int[][] method1188(final int i, final int i_0_) {
		int[][] is;
		try {
			final int[][] is_1_ = this.aClass109_2559.method975(i, -108);
			if (this.aClass109_2559.aBoolean1049) {
				final int[] is_2_ = is_1_[0];
				final int[] is_3_ = is_1_[1];
				final int[] is_4_ = is_1_[2];
				for (int i_5_ = 0; Class120_Sub12_Sub7.anInt3178 > i_5_; i_5_++) {
					method1392((byte) -51, i, i_5_);
					final int[][] is_6_ = method1179(0, Class151.anInt1420, (byte) -51);
					is_2_[i_5_] = is_6_[0][Class120_Sub12_Sub14.anInt3240];
					is_3_[i_5_] = is_6_[1][Class120_Sub12_Sub14.anInt3240];
					is_4_[i_5_] = is_6_[2][Class120_Sub12_Sub14.anInt3240];
				}
			}
			if (i_0_ != -29869) {
				return null;
			}
			is = is_1_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("uc.K(").append(i).append(',').append(i_0_).append(')').toString());
		}
		return is;
	}

	static final void method1389(final int i) {
		try {
			for (int i_7_ = i; Class154.anInt1441 > i_7_; i_7_++) {
				final int i_8_ = Class169.anIntArray1648[i_7_];
				final Npc class180_sub5_sub2 = Class120_Sub12_Sub11.npcList[i_8_];
				int i_9_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getUByte();
				if ((i_9_ & 0x1) != 0) {
					i_9_ += Canvas_Sub1.aClass120_Sub7_Sub1_16.getUByte() << 8;
				}
				if ((i_9_ & 0x40) != 0) {
					final int i_10_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getUByteC();
					final int i_11_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getUByteS();
					class180_sub5_sub2.method2326(Class101_Sub2.loopCycle, 0, i_11_, i_10_);
					class180_sub5_sub2.anInt2989 = 300 + Class101_Sub2.loopCycle;
					class180_sub5_sub2.anInt3024 = Canvas_Sub1.aClass120_Sub7_Sub1_16.getUByteC();
				}
				if ((i_9_ & 0x100) != 0) {
					final int i_12_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getUByteA();
					final int[] is = new int[i_12_];
					final int[] is_13_ = new int[i_12_];
					final int[] is_14_ = new int[i_12_];
					for (int i_15_ = 0; i_12_ > i_15_; i_15_++) {
						int i_16_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getULEShort();
						if ((i_16_ ^ 0xffffffff) == -65536) {
							i_16_ = -1;
						}
						is_14_[i_15_] = i_16_;
						is[i_15_] = Canvas_Sub1.aClass120_Sub7_Sub1_16.getUByteC();
						is_13_[i_15_] = Canvas_Sub1.aClass120_Sub7_Sub1_16.getULEShortA();
					}
					Class120_Sub12_Sub4.method1213(is_14_, class180_sub5_sub2, is_13_, 0, is);
				}
				if ((i_9_ & 0x10) != 0) {
					final int i_17_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getUByteA();
					final int i_18_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getUByteS();
					class180_sub5_sub2.method2326(Class101_Sub2.loopCycle, 0, i_18_, i_17_);
				}
				if ((i_9_ & 0x2) != 0) {
					if (class180_sub5_sub2.npcType.method2204(0)) {
						Class120_Sub16.method1664((byte) 111, class180_sub5_sub2);
					}
					class180_sub5_sub2.method2346((byte) 94, NpcType.list(Canvas_Sub1.aClass120_Sub7_Sub1_16.getUShortA()));
					class180_sub5_sub2.method2338(23751, class180_sub5_sub2.npcType.size);
					class180_sub5_sub2.anInt3010 = class180_sub5_sub2.npcType.anInt1672;
					class180_sub5_sub2.anInt2982 = class180_sub5_sub2.npcType.anInt1692;
					if (class180_sub5_sub2.npcType.method2204(0)) {
						Class7.method106(i ^ 0x80, null, class180_sub5_sub2.anIntArray2958[0], class180_sub5_sub2, class180_sub5_sub2.anIntArray3040[0], null, 0, Class173.gameLevel);
					}
				}
				if ((i_9_ & 0x200) != 0) {
					class180_sub5_sub2.anInt3016 = Canvas_Sub1.aClass120_Sub7_Sub1_16.getULEShortA();
					class180_sub5_sub2.anInt3003 = Canvas_Sub1.aClass120_Sub7_Sub1_16.getUShort();
				}
				if ((i_9_ & 0x20) != 0) {
					int i_19_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getUShort();
					if ((i_19_ ^ 0xffffffff) == -65536) {
						i_19_ = -1;
					}
					final int i_20_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getUByteS();
					Class23.method204(i_19_, class180_sub5_sub2, (byte) -118, i_20_);
				}
				if ((i_9_ & 0x4) != 0) {
					int i_21_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getUShortA();
					final int i_22_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getInt();
					boolean bool = true;
					if (i_21_ == 65535) {
						i_21_ = -1;
					}
					if (i_21_ != -1 && class180_sub5_sub2.spotAnimId != -1 && Class120_Sub30_Sub2.method1763(SpotAnimType.list(i_21_).anInt991, 119).anInt348 < Class120_Sub30_Sub2.method1763(SpotAnimType.list(class180_sub5_sub2.spotAnimId).anInt991, i + 120).anInt348) {
						bool = false;
					}
					if (bool) {
						class180_sub5_sub2.anInt2963 = 0;
						class180_sub5_sub2.spotAnimFrameId = 0;
						class180_sub5_sub2.anInt2971 = 1;
						class180_sub5_sub2.anInt2979 = (0xffff & i_22_) + Class101_Sub2.loopCycle;
						if (class180_sub5_sub2.anInt2979 > Class101_Sub2.loopCycle) {
							class180_sub5_sub2.spotAnimFrameId = -1;
						}
						class180_sub5_sub2.anInt2965 = i_22_ >> 16;
						class180_sub5_sub2.spotAnimId = i_21_;
						if (class180_sub5_sub2.spotAnimId != -1 && Class101_Sub2.loopCycle == class180_sub5_sub2.anInt2979) {
							final int i_23_ = SpotAnimType.list(class180_sub5_sub2.spotAnimId).anInt991;
							if (i_23_ != -1) {
								final Class40 class40 = Class120_Sub30_Sub2.method1763(i_23_, 120);
								if (class40 != null && class40.anIntArray342 != null) {
									Class120_Sub12_Sub23.method1323(class40, class180_sub5_sub2.z, class180_sub5_sub2.x, 0, false, false);
								}
							}
						}
					}
				}
				if ((i_9_ & 0x8) != 0) {
					class180_sub5_sub2.anInt2981 = Canvas_Sub1.aClass120_Sub7_Sub1_16.getULEShort();
					if (-65536 == (class180_sub5_sub2.anInt2981 ^ 0xffffffff)) {
						class180_sub5_sub2.anInt2981 = -1;
					}
				}
				if ((i_9_ & 0x80) != 0) {
					class180_sub5_sub2.aString2975 = Canvas_Sub1.aClass120_Sub7_Sub1_16.getJString();
					class180_sub5_sub2.anInt3025 = 100;
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("uc.V(").append(i).append(')').toString());
		}
	}

	static final int method1390(final boolean bool, final int i) {
		int i_24_;
		try {
			if (!bool) {
				anIntArray3417 = null;
			}
			i_24_ = 0x7f & i;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("uc.W(").append(bool).append(',').append(i).append(')').toString());
		}
		return i_24_;
	}

	static final String[] addNumbers(final String[] strings) {
		final String[] strings_26_ = new String[5];
		for (int i_27_ = 0; i_27_ < 5; i_27_++) {
			strings_26_[i_27_] = new StringBuilder(String.valueOf(i_27_)).append(": ").toString();
			if (strings != null && strings[i_27_] != null) {
				strings_26_[i_27_] = new StringBuilder(strings_26_[i_27_]).append(strings[i_27_]).toString();
			}
		}
		return strings_26_;
	}

	@Override
	final void method1180(final byte i, final Buffer class120_sub7, final int i_28_) {
		try {
			if (i != -43) {
				method1187(-47, -15);
			}
			if (i_28_ == 0) {
				this.aBoolean2558 = class120_sub7.getUByte() == 1;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("uc.M(").append(i).append(',').append(class120_sub7 != null ? "{...}" : "null").append(',').append(i_28_).append(')').toString());
		}
	}

	private final void method1392(final byte i, final int i_29_, final int i_30_) {
		try {
			final int i_31_ = Class90.anIntArray849[i_30_];
			final int i_32_ = Class150.anIntArray1405[i_29_];
			final float f = (float) Math.atan2(-2048 + i_31_, i_32_ - 2048);
			if (-3.141592653589793 <= f && -2.356194490192345 >= f) {
				Class120_Sub12_Sub14.anInt3240 = i_30_;
				Class151.anInt1420 = i_29_;
			} else if (-1.5707963267948966 >= f && f >= -2.356194490192345) {
				Class151.anInt1420 = i_30_;
				Class120_Sub12_Sub14.anInt3240 = i_29_;
			} else if (!(-0.7853981633974483 >= f) || !(f >= -1.5707963267948966)) {
				if (0.0F >= f && f >= -0.7853981633974483) {
					Class151.anInt1420 = Class120_Sub12_Sub2.anInt3145 - i_29_;
					Class120_Sub12_Sub14.anInt3240 = i_30_;
				} else if (!(f >= 0.0F) || !(f <= 0.7853981633974483)) {
					if (!(f >= 0.7853981633974483) || !(f <= 1.5707963267948966)) {
						if (f >= 1.5707963267948966 && f <= 2.356194490192345) {
							Class120_Sub12_Sub14.anInt3240 = i_29_;
							Class151.anInt1420 = Class120_Sub12_Sub2.anInt3145 + -i_30_;
						} else if (2.356194490192345 <= f && 3.141592653589793 >= f) {
							Class151.anInt1420 = i_29_;
							Class120_Sub12_Sub14.anInt3240 = -i_30_ + Class120_Sub12_Sub7.anInt3178;
						}
					} else {
						Class120_Sub12_Sub14.anInt3240 = -i_29_ + Class120_Sub12_Sub7.anInt3178;
						Class151.anInt1420 = Class120_Sub12_Sub2.anInt3145 - i_30_;
					}
				} else {
					Class120_Sub12_Sub14.anInt3240 = Class120_Sub12_Sub7.anInt3178 + -i_30_;
					Class151.anInt1420 = Class120_Sub12_Sub2.anInt3145 + -i_29_;
				}
			} else {
				Class120_Sub12_Sub14.anInt3240 = Class120_Sub12_Sub7.anInt3178 - i_29_;
				Class151.anInt1420 = i_30_;
			}
			Class120_Sub12_Sub14.anInt3240 &= Class32.anInt259;
			if (i == -51) {
				Class151.anInt1420 &= Class120_Sub29.anInt2774;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("uc.T(").append(i).append(',').append(i_29_).append(',').append(i_30_).append(')').toString());
		}
	}

	@Override
	final int[] method1187(final int i, final int i_33_) {
		int[] is;
		try {
			if (i != -1735) {
				anIntArrayArrayArray3420 = null;
			}
			final int[] is_34_ = this.aClass30_2563.method258(i_33_, i ^ ~0x692);
			if (this.aClass30_2563.aBoolean238) {
				for (int i_35_ = 0; Class120_Sub12_Sub7.anInt3178 > i_35_; i_35_++) {
					method1392((byte) -51, i_33_, i_35_);
					final int[] is_36_ = method1192(-7764, Class151.anInt1420, 0);
					is_34_[i_35_] = is_36_[Class120_Sub12_Sub14.anInt3240];
				}
			}
			is = is_34_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("uc.D(").append(i).append(',').append(i_33_).append(')').toString());
		}
		return is;
	}
}
