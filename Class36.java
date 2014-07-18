/* Class36 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class36 {
	static int antiAliasingSamples = 0;
	long bitPacked;
	SceneGraphNode aClass180_309;
	int anInt310;
	int anInt311;
	int anInt312;
	static String aString313 = "Loading...";
	boolean aBoolean314 = false;

	static final void method307(final int i, final GameEntity class180_sub5) {
		try {
			class180_sub5.aBoolean3002 = false;
			if ((class180_sub5.anInt3004 ^ 0xffffffff) != 0) {
				final SeqType seqType = SeqType.list(class180_sub5.anInt3004);
				if (seqType == null || seqType.frames == null) {
					class180_sub5.anInt3004 = -1;
				} else {
					class180_sub5.anInt2998++;
					if (class180_sub5.anInt3046 < seqType.frames.length && seqType.cycles[class180_sub5.anInt3046] < class180_sub5.anInt2998) {
						class180_sub5.anInt3021++;
						class180_sub5.anInt2998 = 1;
						class180_sub5.anInt3046++;
						Class120_Sub12_Sub23.method1323(seqType, class180_sub5.z, class180_sub5.x, class180_sub5.anInt3046, class180_sub5 == Class100.selfPlayer);
					}
					if (class180_sub5.anInt3046 >= seqType.frames.length) {
						class180_sub5.anInt2998 = 0;
						class180_sub5.anInt3046 = 0;
						Class120_Sub12_Sub23.method1323(seqType, class180_sub5.z, class180_sub5.x, class180_sub5.anInt3046, Class100.selfPlayer == class180_sub5);
					}
					class180_sub5.anInt3021 = 1 + class180_sub5.anInt3046;
					if (class180_sub5.anInt3021 >= seqType.frames.length) {
						class180_sub5.anInt3021 = 0;
					}
				}
			}
			do {
				if (class180_sub5.spotAnimId != -1 && Class101_Sub2.loopCycle >= class180_sub5.anInt2979) {
					final SpotAnimType spotAnimType = SpotAnimType.list(class180_sub5.spotAnimId);
					final int i_0_ = spotAnimType.animationId;
					if ((i_0_ ^ 0xffffffff) == 0) {
						class180_sub5.spotAnimId = -1;
					} else {
						final SeqType seqType = SeqType.list(i_0_);
						if (spotAnimType.aBoolean998) {
							if (seqType.anInt343 == 3) {
								if (class180_sub5.anInt3031 > 0 && class180_sub5.anInt3035 <= Class101_Sub2.loopCycle && Class101_Sub2.loopCycle > class180_sub5.anInt2961) {
									class180_sub5.spotAnimId = -1;
									break;
								}
							} else if (seqType.anInt343 == 1 && class180_sub5.anInt3031 > 0 && class180_sub5.anInt3035 <= Class101_Sub2.loopCycle && class180_sub5.anInt2961 < Class101_Sub2.loopCycle) {
								class180_sub5.anInt2979 = Class101_Sub2.loopCycle + 1;
								break;
							}
						}
						if (seqType == null || seqType.frames == null) {
							class180_sub5.spotAnimId = -1;
						} else {
							if (class180_sub5.spotAnimFrameId < 0) {
								class180_sub5.spotAnimFrameId = 0;
								Class120_Sub12_Sub23.method1323(seqType, class180_sub5.z, class180_sub5.x, 0, class180_sub5 == Class100.selfPlayer);
							}
							class180_sub5.anInt2963++;
							if (seqType.frames.length > class180_sub5.spotAnimFrameId && seqType.cycles[class180_sub5.spotAnimFrameId] < class180_sub5.anInt2963) {
								class180_sub5.anInt2963 = 1;
								class180_sub5.spotAnimFrameId++;
								Class120_Sub12_Sub23.method1323(seqType, class180_sub5.z, class180_sub5.x, class180_sub5.spotAnimFrameId, Class100.selfPlayer == class180_sub5);
							}
							if (class180_sub5.spotAnimFrameId >= seqType.frames.length) {
								if (!spotAnimType.aBoolean998) {
									class180_sub5.spotAnimId = -1;
								} else {
									class180_sub5.anInt2984++;
									class180_sub5.spotAnimFrameId -= seqType.padding;
									if (seqType.anInt339 > class180_sub5.anInt2984) {
										if (class180_sub5.spotAnimFrameId >= 0 && seqType.frames.length > class180_sub5.spotAnimFrameId) {
											Class120_Sub12_Sub23.method1323(seqType, class180_sub5.z, class180_sub5.x, class180_sub5.spotAnimFrameId, Class100.selfPlayer == class180_sub5);
										} else {
											class180_sub5.spotAnimId = -1;
										}
									} else {
										class180_sub5.spotAnimId = -1;
									}
								}
							}
							class180_sub5.anInt2971 = class180_sub5.spotAnimFrameId - -1;
							if (class180_sub5.anInt2971 >= seqType.frames.length) {
								if (!spotAnimType.aBoolean998) {
									class180_sub5.anInt2971 = -1;
								} else {
									class180_sub5.anInt2971 -= seqType.padding;
									if (seqType.anInt339 <= 1 + class180_sub5.anInt2984) {
										class180_sub5.anInt2971 = -1;
									} else if (class180_sub5.anInt2971 < 0 || class180_sub5.anInt2971 >= seqType.frames.length) {
										class180_sub5.anInt2971 = -1;
									}
								}
							}
						}
					}
				}
			} while (false);
			if ((class180_sub5.anInt3006 ^ 0xffffffff) != 0 && class180_sub5.anInt2993 <= 1) {
				final SeqType seqType = SeqType.list(class180_sub5.anInt3006);
				if (seqType.anInt343 != 3) {
					if (seqType.anInt343 == 1 && class180_sub5.anInt3031 > 0 && Class101_Sub2.loopCycle >= class180_sub5.anInt3035 && Class101_Sub2.loopCycle > class180_sub5.anInt2961) {
						class180_sub5.anInt2993 = 2;
					}
				} else if (class180_sub5.anInt3031 > 0 && Class101_Sub2.loopCycle >= class180_sub5.anInt3035 && class180_sub5.anInt2961 < Class101_Sub2.loopCycle) {
					class180_sub5.anInt3006 = -1;
				}
			}
			if ((class180_sub5.anInt3006 ^ 0xffffffff) != 0 && class180_sub5.anInt2993 == 0) {
				final SeqType seqType = SeqType.list(class180_sub5.anInt3006);
				if (seqType != null && seqType.frames != null) {
					class180_sub5.anInt3044++;
					if (seqType.frames.length > class180_sub5.anInt2964 && class180_sub5.anInt3044 > seqType.cycles[class180_sub5.anInt2964]) {
						class180_sub5.anInt2964++;
						class180_sub5.anInt3044 = 1;
						Class120_Sub12_Sub23.method1323(seqType, class180_sub5.z, class180_sub5.x, class180_sub5.anInt2964, class180_sub5 == Class100.selfPlayer);
					}
					if (class180_sub5.anInt2964 >= seqType.frames.length) {
						class180_sub5.anInt2999++;
						class180_sub5.anInt2964 -= seqType.padding;
						if (seqType.anInt339 > class180_sub5.anInt2999) {
							if (class180_sub5.anInt2964 < 0 || class180_sub5.anInt2964 >= seqType.frames.length) {
								class180_sub5.anInt3006 = -1;
							} else {
								Class120_Sub12_Sub23.method1323(seqType, class180_sub5.z, class180_sub5.x, class180_sub5.anInt2964, class180_sub5 == Class100.selfPlayer);
							}
						} else {
							class180_sub5.anInt3006 = -1;
						}
					}
					class180_sub5.anInt3013 = 1 + class180_sub5.anInt2964;
					if (class180_sub5.anInt3013 >= seqType.frames.length) {
						class180_sub5.anInt3013 -= seqType.padding;
						if (1 + class180_sub5.anInt2999 < seqType.anInt339) {
							if (class180_sub5.anInt3013 < 0 || class180_sub5.anInt3013 >= seqType.frames.length) {
								class180_sub5.anInt3013 = -1;
							}
						} else {
							class180_sub5.anInt3013 = -1;
						}
					}
					class180_sub5.aBoolean3002 = seqType.aBoolean344;
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
						final SeqType seqType = SeqType.list(class150.anInt1406);
						if (seqType == null || seqType.frames == null) {
							class180_sub5.aClass150Array2972[i_1_] = null;
						} else {
							class150.anInt1410++;
							if (seqType.frames.length > class150.anInt1413 && seqType.cycles[class150.anInt1413] < class150.anInt1410) {
								class150.anInt1410 = 1;
								class150.anInt1413++;
								Class120_Sub12_Sub23.method1323(seqType, class180_sub5.z, class180_sub5.x, class150.anInt1413, class180_sub5 == Class100.selfPlayer);
							}
							if (class150.anInt1413 >= seqType.frames.length) {
								class150.anInt1413 -= seqType.padding;
								class150.anInt1416++;
								if (seqType.anInt339 > class150.anInt1416) {
									if (class150.anInt1413 >= 0 && seqType.frames.length > class150.anInt1413) {
										Class120_Sub12_Sub23.method1323(seqType, class180_sub5.z, class180_sub5.x, class150.anInt1413, class180_sub5 == Class100.selfPlayer);
									} else {
										class180_sub5.aClass150Array2972[i_1_] = null;
									}
								} else {
									class180_sub5.aClass150Array2972[i_1_] = null;
								}
							}
							class150.anInt1414 = class150.anInt1413 + 1;
							if (seqType.frames.length <= class150.anInt1414) {
								class150.anInt1414 -= seqType.padding;
								if (class150.anInt1416 - -1 >= seqType.anInt339) {
									class150.anInt1414 = -1;
								} else if (class150.anInt1414 < 0 || class150.anInt1414 >= seqType.frames.length) {
									class150.anInt1414 = -1;
								}
							}
						}
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("dm.C(").append(i).append(',').append(class180_sub5 != null ? "{...}" : "null").append(')').toString());
		}
	}

	public static void method308(final int i) {
		try {
			aString313 = null;
			if (i != 30900) {
				method309(-10);
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("dm.B(").append(i).append(')').toString());
		}
	}

	static final void method309(final int i) {
		try {
			if (i != -14865) {
				method308(-76);
			}
			Class159.aClass21_1486.clear();
			Class120_Sub6.aClass21_2443.clear();
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("dm.A(").append(i).append(')').toString());
		}
	}

	public Class36() {
		/* empty */
	}
}
