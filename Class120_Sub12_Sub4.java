/* Class120_Sub12_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class120_Sub12_Sub4 extends Class120_Sub12 {
	static float aFloat3154;
	private int anInt3155 = 0;
	static JagexInterface draggedComponent;
	static int[][] anIntArrayArray3157 = { { 0, 128, 0, 0, 128, 0, 128, 128 }, { 0, 128, 0, 0, 128, 0 }, { 0, 0, 64, 128, 0, 128 }, { 128, 128, 64, 128, 128, 0 }, { 0, 0, 128, 0, 128, 128, 64, 128 }, { 0, 128, 0, 0, 128, 0, 64, 128 }, { 64, 128, 0, 128, 0, 0, 64, 0 }, { 0, 0, 64, 0, 0, 64 },
			{ 128, 0, 128, 128, 0, 128, 0, 64, 64, 0 }, { 0, 128, 0, 0, 32, 64, 64, 96, 128, 128 }, { 0, 0, 128, 0, 128, 128, 64, 96, 32, 64 }, { 0, 0, 128, 0, 96, 32, 32, 32 } };
	static long lastJs5ConnectionTime;
	private int anInt3159 = 4096;

	static {
		aFloat3154 = 0.0F;
		draggedComponent = null;
	}

	public Class120_Sub12_Sub4() {
		super(1, false);
	}

	static final void method1211(final boolean bool, final int i_0_, final boolean bool_1_, final int i_2_) {
		Js5Request.method1552(i_2_, i_0_, Class86.worlds.length - 1, 0, bool, bool_1_);
	}

	static final void method1213(final Npc npc, final int[] is, final int[] is_3_, final int[] is_4_) {
		for (int i_5_ = 0; i_5_ < is.length; i_5_++) {
			final int i_6_ = is[i_5_];
			int i_7_ = is_3_[i_5_];
			final int i_8_ = is_4_[i_5_];
			for (int i_9_ = 0; i_7_ != 0 && i_9_ < npc.aClass150Array2972.length; i_7_ >>>= 1) {
				if ((0x1 & i_7_) != 0) {
					if (i_6_ != -1) {
						final SeqType seqType = SeqType.list(i_6_);
						final int i_10_ = seqType.resetInPlay;
						Class150 class150 = npc.aClass150Array2972[i_9_];
						if (class150 != null) {
							if (class150.seqId == i_6_) {
								if (i_10_ != 0) {
									if (i_10_ == 1) {
										class150.cyclesElapsed = 0;
										class150.nextFrameId = 1;
										class150.frameDelay = 0;
										class150.delay = i_8_;
										class150.frameId = 0;
										Class120_Sub12_Sub23.method1323(seqType, npc.x, npc.z, 0, false);
									} else if (i_10_ == 2) {
										class150.cyclesElapsed = 0;
									}
								} else {
									class150 = npc.aClass150Array2972[i_9_] = null;
								}
							} else if (seqType.priority >= SeqType.list(class150.seqId).priority) {
								class150 = npc.aClass150Array2972[i_9_] = null;
							}
						}
						if (class150 == null) {
							class150 = npc.aClass150Array2972[i_9_] = new Class150();
							class150.seqId = i_6_;
							class150.frameId = 0;
							class150.frameDelay = 0;
							class150.nextFrameId = 1;
							class150.cyclesElapsed = 0;
							class150.delay = i_8_;
							Class120_Sub12_Sub23.method1323(seqType, npc.x, npc.z, 0, false);
						}
					} else {
						npc.aClass150Array2972[i_9_] = null;
					}
				}
				i_9_++;
			}
		}
	}

	static final int getDisplayMode() {
		if (Class120_Sub14_Sub10.fullscreenFrame != null) {
			return 3;
		}
		if (HDToolkit.glEnabled && MouseRecorder.frameResizable) {
			return 2;
		}
		if (HDToolkit.glEnabled && !MouseRecorder.frameResizable) {
			return 1;
		}
		return 0;
	}

	static final int method1216(final js5 js5) {
		int i_13_ = 0;
		if (js5.method429(AmbientSound.hitmarksId)) {
			i_13_++;
		}
		if (js5.method429(Class120_Sub12_Sub25.hitbardefaultId)) {
			i_13_++;
		}
		if (js5.method429(Class120_Sub14_Sub15.headiconspkId)) {
			i_13_++;
		}
		if (js5.method429(MasterIndexInfo.headiconsprayerId)) {
			i_13_++;
		}
		if (js5.method429(Class120_Sub21.hintheadiconsId)) {
			i_13_++;
		}
		if (js5.method429(Class173.hintmapmarkersId)) {
			i_13_++;
		}
		if (js5.method429(Class169.mapflagId)) {
			i_13_++;
		}
		if (js5.method429(Class132_Sub2.crossId)) {
			i_13_++;
		}
		if (js5.method429(MapFunctionType.mapdotsId)) {
			i_13_++;
		}
		if (js5.method429(Class134.scrollbarId)) {
			i_13_++;
		}
		if (js5.method429(Class81.nameiconsId)) {
			i_13_++;
		}
		if (js5.method429(Class120_Sub12_Sub7.floorshadowsId)) {
			i_13_++;
		}
		if (js5.method429(Class9.compassId)) {
			i_13_++;
		}
		if (js5.method429(PlayerAppearance.hintmapedgeId)) {
			i_13_++;
		}
		return i_13_;
	}

	@Override
	final void decode(final Buffer buffer, final int i_15_) {
		while_119_: do {
			do {
				if (i_15_ != 0) {
					if (i_15_ != 1) {
						if (i_15_ == 2) {
							break;
						}
						break while_119_;
					}
				} else {
					anInt3155 = buffer.getUShort();
					break while_119_;
				}
				anInt3159 = buffer.getUShort();
				break while_119_;
			} while (false);
			this.aBoolean2558 = buffer.getUByte() == 1;
		} while (false);
	}

	@Override
	final int[] method1187(final int i_16_) {
		final int[] is_17_ = this.aClass30_2563.method258(i_16_);
		if (this.aClass30_2563.aBoolean238) {
			final int[] is_18_ = method1192(i_16_, 0);
			for (int i_19_ = 0; i_19_ < Class120_Sub12_Sub7.anInt3178; i_19_++) {
				final int i_20_ = is_18_[i_19_];
				if (anInt3155 <= i_20_) {
					if (i_20_ > anInt3159) {
						is_17_[i_19_] = anInt3159;
					} else {
						is_17_[i_19_] = i_20_;
					}
				} else {
					is_17_[i_19_] = anInt3155;
				}
			}
		}
		return is_17_;
	}

	@Override
	final int[][] method1188(final int i) {
		final int[][] is_22_ = this.aClass109_2559.method975(i);
		if (this.aClass109_2559.aBoolean1049) {
			final int[][] is_23_ = method1179(0, i);
			final int[] is_24_ = is_23_[0];
			final int[] is_25_ = is_23_[1];
			final int[] is_26_ = is_22_[0];
			final int[] is_27_ = is_23_[2];
			final int[] is_28_ = is_22_[1];
			final int[] is_29_ = is_22_[2];
			for (int i_30_ = 0; i_30_ < Class120_Sub12_Sub7.anInt3178; i_30_++) {
				final int i_31_ = is_25_[i_30_];
				final int i_32_ = is_24_[i_30_];
				final int i_33_ = is_27_[i_30_];
				if (i_32_ >= anInt3155) {
					if (i_32_ <= anInt3159) {
						is_26_[i_30_] = i_32_;
					} else {
						is_26_[i_30_] = anInt3159;
					}
				} else {
					is_26_[i_30_] = anInt3155;
				}
				if (anInt3155 > i_31_) {
					is_28_[i_30_] = anInt3155;
				} else if (anInt3159 < i_31_) {
					is_28_[i_30_] = anInt3159;
				} else {
					is_28_[i_30_] = i_31_;
				}
				if (anInt3155 > i_33_) {
					is_29_[i_30_] = anInt3155;
				} else if (i_33_ <= anInt3159) {
					is_29_[i_30_] = i_33_;
				} else {
					is_29_[i_30_] = anInt3159;
				}
			}
		}
		return is_22_;
	}
}
