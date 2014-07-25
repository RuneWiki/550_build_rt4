/* Class120_Sub12_Sub35 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class120_Sub12_Sub35 extends Class120_Sub12 {
	static int anInt3410 = -2;
	static ObjectCache aClass21_3411;
	static int crossX = 0;
	static int anInt3413;
	static short[][] aShortArrayArray3414;

	static {
		aClass21_3411 = new ObjectCache(64);
		anInt3413 = -1;
		aShortArrayArray3414 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 },
				{ 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 },
				{ 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };
	}

	@Override
	final int[] method1187(final int i_0_) {
		final int[] is_1_ = this.aClass30_2563.method258(i_0_);
		if (this.aClass30_2563.aBoolean238) {
			final int[][] is_2_ = method1179(0, i_0_, (byte) -51);
			final int[] is_3_ = is_2_[2];
			final int[] is_4_ = is_2_[1];
			final int[] is_5_ = is_2_[0];
			for (int i_6_ = 0; Class120_Sub12_Sub7.anInt3178 > i_6_; i_6_++) {
				is_1_[i_6_] = (is_4_[i_6_] + is_5_[i_6_] + is_3_[i_6_]) / 3;
			}
		}
		return is_1_;
	}

	static final void method1381(final js5 js5, final byte i) {
		try {
			VarBit.aClass50_3056 = js5;
			if (i != -94) {
				anInt3413 = 34;
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("ti.S(").append(js5 != null ? "{...}" : "null").append(',').append(i).append(')').toString());
		}
	}

	static final boolean method1382(final JagexInterface jagexInterface, final byte i) {
		boolean bool;
		try {
			if (jagexInterface.requiredValues == null) {
				return false;
			}
			if (i > -89) {
				anInt3410 = -79;
			}
			for (int i_7_ = 0; i_7_ < jagexInterface.requiredValues.length; i_7_++) {
				final int i_8_ = LocType.method2467(jagexInterface, i_7_);
				final int i_9_ = jagexInterface.valueCompareType[i_7_];
				if (jagexInterface.requiredValues[i_7_] != 2) {
					if (jagexInterface.requiredValues[i_7_] == 3) {
						if (i_8_ <= i_9_) {
							return false;
						}
					} else if (jagexInterface.requiredValues[i_7_] == 4) {
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
			throw EnumType.method1428(runtimeexception, new StringBuilder("ti.U(").append(jagexInterface != null ? "{...}" : "null").append(',').append(i).append(')').toString());
		}
		return bool;
	}

	static final Class32 method1384(final int i, final int i_10_) {
		Class32 class32;
		try {
			Class32 class32_11_ = (Class32) SceneGroundObject.aClass21_2841.get(i);
			if (class32_11_ != null) {
				return class32_11_;
			}
			final byte[] is = Class49.aClass50_440.getFile(1, i);
			class32_11_ = new Class32();
			class32_11_.anInt258 = i;
			if (is != null) {
				class32_11_.method274(new Buffer(is), (byte) 88);
			}
			class32_11_.method271((byte) 43);
			if (i_10_ == class32_11_.anInt266 && GroundTile.aClass75_2643.get(i) == null) {
				GroundTile.aClass75_2643.put(new IntegerNode(Class30.anInt236), i);
				Class154.aClass32Array1437[Class30.anInt236++] = class32_11_;
			}
			SceneGroundObject.aClass21_2841.put(class32_11_, i);
			class32 = class32_11_;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("ti.T(").append(i).append(',').append(i_10_).append(')').toString());
		}
		return class32;
	}

	static final void method1385() {
		if (!Class143_Sub1.method2021() && Class120_Sub14_Sub4.anInt3469 != Class173.gameLevel) {
			Class2.method76(false, Class116.anInt1118, false, TileParticleQueue.selfPlayer.walkQueueZ[0], TileParticleQueue.selfPlayer.walkQueueX[0], Class3.anInt53, Class173.gameLevel);
		} else {
			Class120_Sub12_Sub5.method1219();
			if (Class173.gameLevel != Class153.anInt1436) {
				Class57.method492();
			}
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
			throw EnumType.method1428(runtimeexception, new StringBuilder("ti.W(").append(i).append(')').toString());
		}
	}
}
