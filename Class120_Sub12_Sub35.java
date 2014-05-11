/* Class120_Sub12_Sub35 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class120_Sub12_Sub35 extends Class120_Sub12 {
	static int anInt3410 = -2;
	static Class21 aClass21_3411;
	static int crossX = 0;
	static int anInt3413;
	static short[][] aShortArrayArray3414;

	static {
		aClass21_3411 = new Class21(64);
		anInt3413 = -1;
		aShortArrayArray3414 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 },
				{ 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 },
				{ 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };
	}

	@Override
	final int[] method1187(final int i, final int i_0_) {
		int[] is;
		try {
			final int[] is_1_ = this.aClass30_2563.method258(i_0_, -118);
			if (this.aClass30_2563.aBoolean238) {
				final int[][] is_2_ = method1179(0, i_0_, (byte) -51);
				final int[] is_3_ = is_2_[2];
				final int[] is_4_ = is_2_[1];
				final int[] is_5_ = is_2_[0];
				for (int i_6_ = 0; Class120_Sub12_Sub7.anInt3178 > i_6_; i_6_++) {
					is_1_[i_6_] = (is_4_[i_6_] + is_5_[i_6_] + is_3_[i_6_]) / 3;
				}
			}
			if (i != -1735) {
				method1381(null, (byte) 10);
			}
			is = is_1_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ti.D(").append(i).append(',').append(i_0_).append(')').toString());
		}
		return is;
	}

	static final void method1381(final Class50 class50, final byte i) {
		try {
			Class180_Sub6.aClass50_3056 = class50;
			if (i != -94) {
				anInt3413 = 34;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ti.S(").append(class50 != null ? "{...}" : "null").append(',').append(i).append(')').toString());
		}
	}

	static final boolean method1382(final Class189 class189, final byte i) {
		boolean bool;
		try {
			if (class189.anIntArray2038 == null) {
				return false;
			}
			if (i > -89) {
				anInt3410 = -79;
			}
			for (int i_7_ = 0; i_7_ < class189.anIntArray2038.length; i_7_++) {
				final int i_8_ = LocType.method2467(i_7_, (byte) -81, class189);
				final int i_9_ = class189.anIntArray2071[i_7_];
				if (class189.anIntArray2038[i_7_] != 2) {
					if (class189.anIntArray2038[i_7_] == 3) {
						if (i_8_ <= i_9_) {
							return false;
						}
					} else if (class189.anIntArray2038[i_7_] == 4) {
						if (i_8_ == i_9_) {
							return false;
						}
					} else if (i_9_ != i_8_) {
						return false;
					}
				} else if (i_8_ >= i_9_) {
					return false;
				}
			}
			bool = true;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ti.U(").append(class189 != null ? "{...}" : "null").append(',').append(i).append(')').toString());
		}
		return bool;
	}

	static final void method1383(final int i) {
		try {
			if (i != 725) {
				method1383(34);
			}
			Class86.aClass21_816.method186((byte) 86);
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ti.R(").append(i).append(')').toString());
		}
	}

	static final Class32 method1384(final int i, final int i_10_) {
		Class32 class32;
		try {
			Class32 class32_11_ = (Class32) Class180_Sub1.aClass21_2841.method193(i, (byte) 70);
			if (class32_11_ != null) {
				return class32_11_;
			}
			final byte[] is = Class49.aClass50_440.method442(1, (byte) 119, i);
			class32_11_ = new Class32();
			class32_11_.anInt258 = i;
			if (is != null) {
				class32_11_.method274(new Buffer(is), (byte) 88);
			}
			class32_11_.method271((byte) 43);
			if (i_10_ == class32_11_.anInt266 && Class120_Sub18.aClass75_2643.method659(i, i_10_ + -28) == null) {
				Class120_Sub18.aClass75_2643.method655(new Class120_Sub32(Class30.anInt236), 118, i);
				Class154.aClass32Array1437[Class30.anInt236++] = class32_11_;
			}
			Class180_Sub1.aClass21_2841.method185(-126, class32_11_, i);
			class32 = class32_11_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ti.T(").append(i).append(',').append(i_10_).append(')').toString());
		}
		return class32;
	}

	static final void method1385(final byte i) {
		try {
			if (!Class143_Sub1.method2021() && Class120_Sub14_Sub4.anInt3469 != Class173.gameLevel) {
				Class2.method76(false, 121, Class116.anInt1118, false, Class100.selfPlayer.anIntArray3040[0], Class100.selfPlayer.anIntArray2958[0], Class3.anInt53, Class173.gameLevel);
			} else {
				if (i >= -70) {
					method1385((byte) -86);
				}
				Class120_Sub12_Sub5.method1219((byte) -111);
				if (Class173.gameLevel != Class153.anInt1436) {
					Class57.method492(108);
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ti.V(").append(i).append(')').toString());
		}
	}

	public Class120_Sub12_Sub35() {
		super(1, true);
	}

	public static void method1386(final byte i) {
		try {
			aShortArrayArray3414 = null;
			aClass21_3411 = null;
			if (i != -39) {
				aClass21_3411 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ti.W(").append(i).append(')').toString());
		}
	}
}
