/* Class36 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class36 {
	static int antiAliasingSamples = 0;
	long aLong308;
	Class180 aClass180_309;
	int anInt310;
	int anInt311;
	int anInt312;
	static String aString313 = "Loading...";
	boolean aBoolean314 = false;

	static final void method307(final int i, final GameEntity class180_sub5) {
		try {
			class180_sub5.aBoolean3002 = false;
			if ((class180_sub5.anInt3004 ^ 0xffffffff) != 0) {
				final Class40 class40 = Class120_Sub30_Sub2.method1763(class180_sub5.anInt3004, 124);
				if (class40 == null || class40.anIntArray342 == null) {
					class180_sub5.anInt3004 = -1;
				} else {
					class180_sub5.anInt2998++;
					if (class180_sub5.anInt3046 < class40.anIntArray342.length && class40.anIntArray338[class180_sub5.anInt3046] < class180_sub5.anInt2998) {
						class180_sub5.anInt3021++;
						class180_sub5.anInt2998 = 1;
						class180_sub5.anInt3046++;
						Class120_Sub12_Sub23.method1323(class40, class180_sub5.z, class180_sub5.x, class180_sub5.anInt3046, class180_sub5 == Class100.selfPlayer, false);
					}
					if (class180_sub5.anInt3046 >= class40.anIntArray342.length) {
						class180_sub5.anInt2998 = 0;
						class180_sub5.anInt3046 = 0;
						Class120_Sub12_Sub23.method1323(class40, class180_sub5.z, class180_sub5.x, class180_sub5.anInt3046, Class100.selfPlayer == class180_sub5, false);
					}
					class180_sub5.anInt3021 = 1 + class180_sub5.anInt3046;
					if (class180_sub5.anInt3021 >= class40.anIntArray342.length) {
						class180_sub5.anInt3021 = 0;
					}
				}
			}
			do {
				if (class180_sub5.spotAnimId != -1 && Class101_Sub2.loopCycle >= class180_sub5.anInt2979) {
					final SpotAnimType spotAnimType = SpotAnimType.list(class180_sub5.spotAnimId);
					final int i_0_ = spotAnimType.anInt991;
					if ((i_0_ ^ 0xffffffff) == 0) {
						class180_sub5.spotAnimId = -1;
					} else {
						final Class40 class40 = Class120_Sub30_Sub2.method1763(i_0_, 120);
						if (spotAnimType.aBoolean998) {
							if (class40.anInt343 == 3) {
								if (class180_sub5.anInt3031 > 0 && class180_sub5.anInt3035 <= Class101_Sub2.loopCycle && Class101_Sub2.loopCycle > class180_sub5.anInt2961) {
									class180_sub5.spotAnimId = -1;
									break;
								}
							} else if (class40.anInt343 == 1 && class180_sub5.anInt3031 > 0 && class180_sub5.anInt3035 <= Class101_Sub2.loopCycle && class180_sub5.anInt2961 < Class101_Sub2.loopCycle) {
								class180_sub5.anInt2979 = Class101_Sub2.loopCycle + 1;
								break;
							}
						}
						if (class40 == null || class40.anIntArray342 == null) {
							class180_sub5.spotAnimId = -1;
						} else {
							if (class180_sub5.spotAnimFrameId < 0) {
								class180_sub5.spotAnimFrameId = 0;
								Class120_Sub12_Sub23.method1323(class40, class180_sub5.z, class180_sub5.x, 0, class180_sub5 == Class100.selfPlayer, false);
							}
							class180_sub5.anInt2963++;
							if (class40.anIntArray342.length > class180_sub5.spotAnimFrameId && class40.anIntArray338[class180_sub5.spotAnimFrameId] < class180_sub5.anInt2963) {
								class180_sub5.anInt2963 = 1;
								class180_sub5.spotAnimFrameId++;
								Class120_Sub12_Sub23.method1323(class40, class180_sub5.z, class180_sub5.x, class180_sub5.spotAnimFrameId, Class100.selfPlayer == class180_sub5, false);
							}
							if (class180_sub5.spotAnimFrameId >= class40.anIntArray342.length) {
								if (!spotAnimType.aBoolean998) {
									class180_sub5.spotAnimId = -1;
								} else {
									class180_sub5.anInt2984++;
									class180_sub5.spotAnimFrameId -= class40.anInt346;
									if (class40.anInt339 > class180_sub5.anInt2984) {
										if (class180_sub5.spotAnimFrameId >= 0 && class40.anIntArray342.length > class180_sub5.spotAnimFrameId) {
											Class120_Sub12_Sub23.method1323(class40, class180_sub5.z, class180_sub5.x, class180_sub5.spotAnimFrameId, Class100.selfPlayer == class180_sub5, false);
										} else {
											class180_sub5.spotAnimId = -1;
										}
									} else {
										class180_sub5.spotAnimId = -1;
									}
								}
							}
							class180_sub5.anInt2971 = class180_sub5.spotAnimFrameId - -1;
							if (class180_sub5.anInt2971 >= class40.anIntArray342.length) {
								if (!spotAnimType.aBoolean998) {
									class180_sub5.anInt2971 = -1;
								} else {
									class180_sub5.anInt2971 -= class40.anInt346;
									if (class40.anInt339 <= 1 + class180_sub5.anInt2984) {
										class180_sub5.anInt2971 = -1;
									} else if (class180_sub5.anInt2971 < 0 || class180_sub5.anInt2971 >= class40.anIntArray342.length) {
										class180_sub5.anInt2971 = -1;
									}
								}
							}
						}
					}
				}
			} while (false);
			if ((class180_sub5.anInt3006 ^ 0xffffffff) != 0 && class180_sub5.anInt2993 <= 1) {
				final Class40 class40 = Class120_Sub30_Sub2.method1763(class180_sub5.anInt3006, 123);
				if (class40.anInt343 != 3) {
					if (class40.anInt343 == 1 && class180_sub5.anInt3031 > 0 && Class101_Sub2.loopCycle >= class180_sub5.anInt3035 && Class101_Sub2.loopCycle > class180_sub5.anInt2961) {
						class180_sub5.anInt2993 = 2;
					}
				} else if (class180_sub5.anInt3031 > 0 && Class101_Sub2.loopCycle >= class180_sub5.anInt3035 && class180_sub5.anInt2961 < Class101_Sub2.loopCycle) {
					class180_sub5.anInt3006 = -1;
				}
			}
			if ((class180_sub5.anInt3006 ^ 0xffffffff) != 0 && class180_sub5.anInt2993 == 0) {
				final Class40 class40 = Class120_Sub30_Sub2.method1763(class180_sub5.anInt3006, 127);
				if (class40 != null && class40.anIntArray342 != null) {
					class180_sub5.anInt3044++;
					if (class40.anIntArray342.length > class180_sub5.anInt2964 && class180_sub5.anInt3044 > class40.anIntArray338[class180_sub5.anInt2964]) {
						class180_sub5.anInt2964++;
						class180_sub5.anInt3044 = 1;
						Class120_Sub12_Sub23.method1323(class40, class180_sub5.z, class180_sub5.x, class180_sub5.anInt2964, class180_sub5 == Class100.selfPlayer, false);
					}
					if (class180_sub5.anInt2964 >= class40.anIntArray342.length) {
						class180_sub5.anInt2999++;
						class180_sub5.anInt2964 -= class40.anInt346;
						if (class40.anInt339 > class180_sub5.anInt2999) {
							if (class180_sub5.anInt2964 < 0 || class180_sub5.anInt2964 >= class40.anIntArray342.length) {
								class180_sub5.anInt3006 = -1;
							} else {
								Class120_Sub12_Sub23.method1323(class40, class180_sub5.z, class180_sub5.x, class180_sub5.anInt2964, class180_sub5 == Class100.selfPlayer, false);
							}
						} else {
							class180_sub5.anInt3006 = -1;
						}
					}
					class180_sub5.anInt3013 = 1 + class180_sub5.anInt2964;
					if (class180_sub5.anInt3013 >= class40.anIntArray342.length) {
						class180_sub5.anInt3013 -= class40.anInt346;
						if (1 + class180_sub5.anInt2999 < class40.anInt339) {
							if (class180_sub5.anInt3013 < 0 || class180_sub5.anInt3013 >= class40.anIntArray342.length) {
								class180_sub5.anInt3013 = -1;
							}
						} else {
							class180_sub5.anInt3013 = -1;
						}
					}
					class180_sub5.aBoolean3002 = class40.aBoolean344;
				} else {
					class180_sub5.anInt3006 = -1;
				}
			}
			if (class180_sub5.anInt2993 > 0) {
				class180_sub5.anInt2993--;
			}
			if (i != -25431) {
				method309(99);
			}
			for (int i_1_ = 0; i_1_ < class180_sub5.aClass150Array2972.length; i_1_++) {
				final Class150 class150 = class180_sub5.aClass150Array2972[i_1_];
				if (class150 != null) {
					if (class150.anInt1411 > 0) {
						class150.anInt1411--;
					} else {
						final Class40 class40 = Class120_Sub30_Sub2.method1763(class150.anInt1406, 123);
						if (class40 == null || class40.anIntArray342 == null) {
							class180_sub5.aClass150Array2972[i_1_] = null;
						} else {
							class150.anInt1410++;
							if (class40.anIntArray342.length > class150.anInt1413 && class40.anIntArray338[class150.anInt1413] < class150.anInt1410) {
								class150.anInt1410 = 1;
								class150.anInt1413++;
								Class120_Sub12_Sub23.method1323(class40, class180_sub5.z, class180_sub5.x, class150.anInt1413, class180_sub5 == Class100.selfPlayer, false);
							}
							if (class150.anInt1413 >= class40.anIntArray342.length) {
								class150.anInt1413 -= class40.anInt346;
								class150.anInt1416++;
								if (class40.anInt339 > class150.anInt1416) {
									if (class150.anInt1413 >= 0 && class40.anIntArray342.length > class150.anInt1413) {
										Class120_Sub12_Sub23.method1323(class40, class180_sub5.z, class180_sub5.x, class150.anInt1413, class180_sub5 == Class100.selfPlayer, false);
									} else {
										class180_sub5.aClass150Array2972[i_1_] = null;
									}
								} else {
									class180_sub5.aClass150Array2972[i_1_] = null;
								}
							}
							class150.anInt1414 = class150.anInt1413 + 1;
							if (class40.anIntArray342.length <= class150.anInt1414) {
								class150.anInt1414 -= class40.anInt346;
								if (class150.anInt1416 - -1 >= class40.anInt339) {
									class150.anInt1414 = -1;
								} else if (class150.anInt1414 < 0 || class150.anInt1414 >= class40.anIntArray342.length) {
									class150.anInt1414 = -1;
								}
							}
						}
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("dm.C(").append(i).append(',').append(class180_sub5 != null ? "{...}" : "null").append(')').toString());
		}
	}

	public static void method308(final int i) {
		try {
			aString313 = null;
			if (i != 30900) {
				method309(-10);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("dm.B(").append(i).append(')').toString());
		}
	}

	static final void method309(final int i) {
		try {
			if (i != -14865) {
				method308(-76);
			}
			Class159.aClass21_1486.method186((byte) 86);
			Class120_Sub6.aClass21_2443.method186((byte) 86);
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("dm.A(").append(i).append(')').toString());
		}
	}

	public Class36() {
		/* empty */
	}
}
