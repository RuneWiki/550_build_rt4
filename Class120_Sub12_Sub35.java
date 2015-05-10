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
			final int[][] is_2_ = method1179(0, i_0_);
			final int[] is_3_ = is_2_[2];
			final int[] is_4_ = is_2_[1];
			final int[] is_5_ = is_2_[0];
			for (int i_6_ = 0; Class120_Sub12_Sub7.anInt3178 > i_6_; i_6_++) {
				is_1_[i_6_] = (is_4_[i_6_] + is_5_[i_6_] + is_3_[i_6_]) / 3;
			}
		}
		return is_1_;
	}

	static final void method1381(final js5 js5) {
		VarBit.aClass50_3056 = js5;
	}

	static final boolean isIntefaceEnabled(final JagexInterface jagexInterface) {
		if (jagexInterface.valueCompareType == null) {
			return false;
		}
		for (int id = 0; id < jagexInterface.valueCompareType.length; id++) {
			final int value = LocType.method2467(jagexInterface, id);
			final int requiredValue = jagexInterface.requiredValues[id];
			if (jagexInterface.valueCompareType[id] != 2) {
				if (jagexInterface.valueCompareType[id] == 3) {
					if (value <= requiredValue) {
						return false;
					}
				} else if (jagexInterface.valueCompareType[id] == 4) {
					if (value == requiredValue) {
						return false;
					}
				} else if (requiredValue != value) {
					return false;
				}
			} else if (value >= requiredValue) {
				return false;
			}
		}
		return true;
	}

	static final void method1385() {
		if (!Class143_Sub1.method2021() && SpotAnimationNode.anInt3469 != Class173.gameLevel) {
			Class2.method76(Class116.anInt1118, Class3.anInt53, Class173.gameLevel, TileParticleQueue.selfPlayer.walkQueueX[0], TileParticleQueue.selfPlayer.walkQueueZ[0], false, false);
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

}
