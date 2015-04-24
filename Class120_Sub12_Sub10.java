/* Class120_Sub12_Sub10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class120_Sub12_Sub10 extends Class120_Sub12 {
	static int renderY;
	static Deque npcAmbientSounds = new Deque();
	static AbstractSprite aClass120_Sub14_Sub19_3202;
	static boolean manyIdleAnimations = true;
	static Class120_Sub14_Sub9 aClass120_Sub14_Sub9_3204;
	static int selectedObjectTargetCursor = -1;

	static final void method1247(final int i, final int i_0_, final CollisionMap[] class25s, final byte[] is, final int i_1_, final int i_2_, final int i_3_, final int i_4_, final boolean bool, final int i_6_) {
		final Buffer class120_sub7 = new Buffer(is);
		int i_7_ = -1;
		for (;;) {
			final int i_8_ = class120_sub7.method1100();
			if (i_8_ == 0) {
				break;
			}
			i_7_ += i_8_;
			int i_9_ = 0;
			for (;;) {
				final int i_10_ = class120_sub7.getUSmart();
				if (i_10_ == 0) {
					break;
				}
				i_9_ += -1 + i_10_;
				final int i_11_ = i_9_ >> 6 & 0x3f;
				final int i_12_ = 0x3f & i_9_;
				final int i_13_ = i_9_ >> 12;
				final int i_14_ = class120_sub7.getUByte();
				final int i_15_ = i_14_ >> 2;
				final int i_16_ = i_14_ & 0x3;
				if (i_13_ == i_4_ && i_3_ <= i_11_ && 8 + i_3_ > i_11_ && i_2_ <= i_12_ && i_2_ - -8 > i_12_) {
					final LocType locType = LocType.list(i_7_);
					final int i_17_ = Class132.method1928(locType.sizeX, i_12_ & 0x7, i_16_, i_11_ & 0x7, i_1_, -2, locType.sizeZ) + i_0_;
					final int i_18_ = i_6_ - -AbstractRequest.method1539(0x7 & i_11_, locType.sizeZ, locType.sizeX, i_1_, 0x7 & i_12_, i_16_);
					if (i_17_ > 0 && i_18_ > 0 && i_17_ < 103 && i_18_ < 103) {
						CollisionMap collisionMap = null;
						if (!bool) {
							int i_19_ = i;
							if ((Class114.tileSettings[1][i_17_][i_18_] & 0x2) == 2) {
								i_19_--;
							}
							if (i_19_ >= 0) {
								collisionMap = class25s[i_19_];
							}
						}
						Class93.spawnLocation(i_16_ - -i_1_ & 0x3, i, i_7_, i, i_17_, bool, i_18_, collisionMap, !bool, i_15_);
					}
				}
			}
		}
	}

	@Override
	final int[] method1187(final int i_20_) {
		final int[] is_21_ = this.aClass30_2563.method258(i_20_);
		if (this.aClass30_2563.aBoolean238) {
			final int[] is_22_ = method1192(i_20_, 0);
			final int[] is_23_ = method1192(i_20_, 1);
			final int[] is_24_ = method1192(i_20_, 2);
			for (int i_25_ = 0; i_25_ < Class120_Sub12_Sub7.anInt3178; i_25_++) {
				final int i_26_ = is_24_[i_25_];
				if (i_26_ != 4096) {
					if (i_26_ == 0) {
						is_21_[i_25_] = is_23_[i_25_];
					} else {
						is_21_[i_25_] = i_26_ * is_22_[i_25_] - -(is_23_[i_25_] * (-i_26_ + 4096)) >> 12;
					}
				} else {
					is_21_[i_25_] = is_22_[i_25_];
				}
			}
		}
		return is_21_;
	}

	static final void method1249(final js5 js5, final js5 class50_27_) {
		Class101_Sub2.aClass50_2277 = class50_27_;
		Class156.aClass50_1456 = js5;
	}

	@Override
	final void decode(final Buffer buffer, final int i_28_) {
		if (i_28_ == 0) {
			this.aBoolean2558 = buffer.getUByte() == 1;
		}
	}

	@Override
	final int[][] method1188(final int i) {
		final int[][] is_30_ = this.aClass109_2559.method975(i);
		if (this.aClass109_2559.aBoolean1049) {
			final int[] is_31_ = method1192(i, 2);
			final int[][] is_32_ = method1179(0, i);
			final int[][] is_33_ = method1179(1, i);
			final int[] is_34_ = is_30_[0];
			final int[] is_35_ = is_30_[1];
			final int[] is_36_ = is_30_[2];
			final int[] is_37_ = is_32_[1];
			final int[] is_38_ = is_32_[0];
			final int[] is_39_ = is_33_[1];
			final int[] is_40_ = is_33_[0];
			final int[] is_41_ = is_32_[2];
			final int[] is_42_ = is_33_[2];
			for (int i_43_ = 0; Class120_Sub12_Sub7.anInt3178 > i_43_; i_43_++) {
				final int i_44_ = is_31_[i_43_];
				if (i_44_ == 4096) {
					is_34_[i_43_] = is_38_[i_43_];
					is_35_[i_43_] = is_37_[i_43_];
					is_36_[i_43_] = is_41_[i_43_];
				} else if (i_44_ == 0) {
					is_34_[i_43_] = is_40_[i_43_];
					is_35_[i_43_] = is_39_[i_43_];
					is_36_[i_43_] = is_42_[i_43_];
				} else {
					final int i_45_ = -i_44_ + 4096;
					is_34_[i_43_] = is_40_[i_43_] * i_45_ + is_38_[i_43_] * i_44_ >> 12;
					is_35_[i_43_] = is_39_[i_43_] * i_45_ + i_44_ * is_37_[i_43_] >> 12;
					is_36_[i_43_] = is_41_[i_43_] * i_44_ - -(i_45_ * is_42_[i_43_]) >> 12;
				}
			}
		}
		return is_30_;
	}

	public Class120_Sub12_Sub10() {
		super(3, false);
	}
}
