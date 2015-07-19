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

	static final void method1247(final int i, final int i_0_, final CollisionMap[] class25s, final byte[] data, final int i_1_, final int i_2_, final int i_3_, final int mapLevel, final boolean bool, final int i_6_) {
		final Buffer buffer = new Buffer(data);
		int locationId = -1;
		for (;;) {
			final int i_8_ = buffer.method1100();
			if (i_8_ == 0) {
				break;
			}
			locationId += i_8_;
			int coordsBitpacked = 0;
			for (;;) {
				final int i_10_ = buffer.getUSmart();
				if (i_10_ == 0) {
					break;
				}
				coordsBitpacked += i_10_ - 1;
				final int locationX = coordsBitpacked >> 6 & 0x3f;
				final int locationZ = 0x3f & coordsBitpacked;
				final int locationLevel = coordsBitpacked >> 12;
				final int renderBitpacked = buffer.getUByte();
				final int type = renderBitpacked >> 2;
				final int rotation = renderBitpacked & 0x3;
				if (locationLevel == mapLevel && locationX >= i_3_ && locationX < i_3_ + 8 && locationZ >= i_2_ && locationZ < i_2_ + 8) {
					final LocType locType = LocType.list(locationId);
					final int i_17_ = Class132.method1928(locType.sizeX, locationZ & 0x7, rotation, locationX & 0x7, i_1_, locType.sizeZ) + i_0_;
					final int i_18_ = AbstractRequest.method1539(0x7 & locationX, locType.sizeZ, locType.sizeX, i_1_, 0x7 & locationZ, rotation) + i_6_;
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
						Class93.spawnLocation(rotation - -i_1_ & 0x3, i, locationId, i, i_17_, bool, i_18_, collisionMap, !bool, type);
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
