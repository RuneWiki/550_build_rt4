/* Class25 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class CollisionMap {
	private final int anInt148;
	private int anInt149;
	private int anInt150;
	static int anInt151;
	int[][] anIntArrayArray152;
	static int[] anIntArray153 = { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };
	private int anInt154;

	private final void method210(final boolean bool, final int i, final int i_0_, final int i_1_) {
		try {
			if (!bool) {
				anIntArray153 = null;
			}
			this.anIntArrayArray152[i][i_0_] = Class120_Sub12_Sub3.method1207(this.anIntArrayArray152[i][i_0_], i_1_ ^ 0xffffffff);
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("ch.K(").append(bool).append(',').append(i).append(',').append(i_0_).append(',').append(i_1_).append(')').toString());
		}
	}

	static final void method211(final int i, final boolean bool, final int i_2_, final int i_3_, final int i_4_) {
		try {
			AmbientSound.fillArray(GameEntity.anIntArrayArray3009[i], i_4_, -i_3_ + i_2_, i_3_ + i_2_);
			int i_5_ = 0;
			if (bool) {
				method222(true, null, -35, 71, -41, null);
			}
			int i_6_ = i_3_;
			int i_7_ = -i_3_;
			int i_8_ = -1;
			while (i_6_ > i_5_) {
				i_8_ += 2;
				i_5_++;
				i_7_ += i_8_;
				if (i_7_ >= 0) {
					i_6_--;
					i_7_ -= i_6_ << 1;
					final int[] is = GameEntity.anIntArrayArray3009[i - i_6_];
					final int[] is_9_ = GameEntity.anIntArrayArray3009[i - -i_6_];
					final int i_10_ = i_2_ - i_5_;
					final int i_11_ = i_2_ + i_5_;
					AmbientSound.fillArray(is_9_, i_4_, i_10_, i_11_);
					AmbientSound.fillArray(is, i_4_, i_10_, i_11_);
				}
				final int i_12_ = i_2_ - -i_6_;
				final int i_13_ = -i_6_ + i_2_;
				final int[] is = GameEntity.anIntArrayArray3009[i + i_5_];
				final int[] is_14_ = GameEntity.anIntArrayArray3009[i - i_5_];
				AmbientSound.fillArray(is, i_4_, i_13_, i_12_);
				AmbientSound.fillArray(is_14_, i_4_, i_13_, i_12_);
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("ch.S(").append(i).append(',').append(bool).append(',').append(i_2_).append(',').append(i_3_).append(',').append(i_4_).append(')').toString());
		}
	}

	final void method212(int i, final int i_15_, int i_16_) {
		try {
			i -= anInt150;
			i_16_ -= anInt149;
			this.anIntArrayArray152[i_16_][i] = Class191.method2512(this.anIntArrayArray152[i_16_][i], 262144);
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("ch.E(").append(i).append(',').append(i_15_).append(',').append(i_16_).append(')').toString());
		}
	}

	final void method213(final boolean bool, final boolean bool_17_, final int i, final int i_18_, int i_19_, final int i_20_, int i_21_) {
		try {
			i_19_ -= anInt150;
			int i_22_ = 256;
			i_21_ -= anInt149;
			if (bool) {
				i_22_ |= 0x20000;
			}
			if (bool_17_) {
				i_22_ |= 0x40000000;
			}
			for (int i_23_ = i_21_; i_23_ < i_21_ - -i_18_; i_23_++) {
				if (i_23_ >= 0 && anInt154 > i_23_) {
					for (int i_24_ = i_19_; i_19_ + i > i_24_; i_24_++) {
						if (i_24_ >= 0 && anInt148 > i_24_) {
							method227(i_22_, i_24_, i_23_, -1);
						}
					}
				}
			}
			if (i_20_ != -32566) {
				method226(0, -98, (byte) 113);
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("ch.C(").append(bool).append(',').append(bool_17_).append(',').append(i).append(',').append(i_18_).append(',').append(i_19_).append(',').append(i_20_).append(',').append(i_21_).append(')').toString());
		}
	}

	final void method214(final int i, int i_25_, int i_26_, final int i_27_, final boolean bool, int i_28_, int i_29_, final boolean bool_30_) {
		try {
			i_25_ -= anInt150;
			if (i_27_ == 3) {
				if (i == 1 || i == 3) {
					final int i_31_ = i_29_;
					i_29_ = i_26_;
					i_26_ = i_31_;
				}
				i_28_ -= anInt149;
				int i_32_ = 256;
				if (bool) {
					i_32_ |= 0x20000;
				}
				if (bool_30_) {
					i_32_ |= 0x40000000;
				}
				for (int i_33_ = i_28_; i_33_ < i_28_ + i_29_; i_33_++) {
					if (i_33_ >= 0 && anInt154 > i_33_) {
						for (int i_34_ = i_25_; i_26_ + i_25_ > i_34_; i_34_++) {
							if (i_34_ >= 0 && anInt148 > i_34_) {
								method210(true, i_33_, i_34_, i_32_);
							}
						}
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("ch.B(").append(i).append(',').append(i_25_).append(',').append(i_26_).append(',').append(i_27_).append(',').append(bool).append(',').append(i_28_).append(',').append(i_29_).append(',').append(bool_30_).append(')')
					.toString());
		}
	}

	final void method215(final int i, final boolean bool, int i_35_, final int i_36_, final boolean bool_37_, final int i_38_, int i_39_) {
		try {
			i_35_ -= anInt149;
			i_39_ -= anInt150;
			if (i_38_ < 120) {
				this.anIntArrayArray152 = null;
			}
			if (i_36_ == 0) {
				if (i == 0) {
					method210(true, i_35_, i_39_, 128);
					method210(true, -1 + i_35_, i_39_, 8);
				}
				if (i == 1) {
					method210(true, i_35_, i_39_, 2);
					method210(true, i_35_, i_39_ - -1, 32);
				}
				if (i == 2) {
					method210(true, i_35_, i_39_, 8);
					method210(true, i_35_ - -1, i_39_, 128);
				}
				if (i == 3) {
					method210(true, i_35_, i_39_, 32);
					method210(true, i_35_, i_39_ + -1, 2);
				}
			}
			if (i_36_ == 1 || i_36_ == 3) {
				if (i == 0) {
					method210(true, i_35_, i_39_, 1);
					method210(true, -1 + i_35_, 1 + i_39_, 16);
				}
				if (i == 1) {
					method210(true, i_35_, i_39_, 4);
					method210(true, 1 + i_35_, 1 + i_39_, 64);
				}
				if (i == 2) {
					method210(true, i_35_, i_39_, 16);
					method210(true, i_35_ + 1, -1 + i_39_, 1);
				}
				if (i == 3) {
					method210(true, i_35_, i_39_, 64);
					method210(true, -1 + i_35_, -1 + i_39_, 4);
				}
			}
			if (i_36_ == 2) {
				if (i == 0) {
					method210(true, i_35_, i_39_, 130);
					method210(true, i_35_ + -1, i_39_, 8);
					method210(true, i_35_, 1 + i_39_, 32);
				}
				if (i == 1) {
					method210(true, i_35_, i_39_, 10);
					method210(true, i_35_, 1 + i_39_, 32);
					method210(true, 1 + i_35_, i_39_, 128);
				}
				if (i == 2) {
					method210(true, i_35_, i_39_, 40);
					method210(true, 1 + i_35_, i_39_, 128);
					method210(true, i_35_, i_39_ + -1, 2);
				}
				if (i == 3) {
					method210(true, i_35_, i_39_, 160);
					method210(true, i_35_, i_39_ + -1, 2);
					method210(true, -1 + i_35_, i_39_, 8);
				}
			}
			if (bool_37_) {
				if (i_36_ == 0) {
					if (i == 0) {
						method210(true, i_35_, i_39_, 65536);
						method210(true, i_35_ - 1, i_39_, 4096);
					}
					if (i == 1) {
						method210(true, i_35_, i_39_, 1024);
						method210(true, i_35_, 1 + i_39_, 16384);
					}
					if (i == 2) {
						method210(true, i_35_, i_39_, 4096);
						method210(true, i_35_ - -1, i_39_, 65536);
					}
					if (i == 3) {
						method210(true, i_35_, i_39_, 16384);
						method210(true, i_35_, i_39_ - 1, 1024);
					}
				}
				if (i_36_ == 1 || i_36_ == 3) {
					if (i == 0) {
						method210(true, i_35_, i_39_, 512);
						method210(true, -1 + i_35_, 1 + i_39_, 8192);
					}
					if (i == 1) {
						method210(true, i_35_, i_39_, 2048);
						method210(true, i_35_ - -1, i_39_ - -1, 32768);
					}
					if (i == 2) {
						method210(true, i_35_, i_39_, 8192);
						method210(true, i_35_ + 1, -1 + i_39_, 512);
					}
					if (i == 3) {
						method210(true, i_35_, i_39_, 32768);
						method210(true, i_35_ - 1, i_39_ + -1, 2048);
					}
				}
				if (i_36_ == 2) {
					if (i == 0) {
						method210(true, i_35_, i_39_, 66560);
						method210(true, -1 + i_35_, i_39_, 4096);
						method210(true, i_35_, i_39_ - -1, 16384);
					}
					if (i == 1) {
						method210(true, i_35_, i_39_, 5120);
						method210(true, i_35_, 1 + i_39_, 16384);
						method210(true, 1 + i_35_, i_39_, 65536);
					}
					if (i == 2) {
						method210(true, i_35_, i_39_, 20480);
						method210(true, i_35_ - -1, i_39_, 65536);
						method210(true, i_35_, i_39_ + -1, 1024);
					}
					if (i == 3) {
						method210(true, i_35_, i_39_, 81920);
						method210(true, i_35_, -1 + i_39_, 1024);
						method210(true, -1 + i_35_, i_39_, 4096);
					}
				}
			}
			if (bool) {
				if (i_36_ == 0) {
					if (i == 0) {
						method210(true, i_35_, i_39_, 536870912);
						method210(true, -1 + i_35_, i_39_, 33554432);
					}
					if (i == 1) {
						method210(true, i_35_, i_39_, 8388608);
						method210(true, i_35_, i_39_ + 1, 134217728);
					}
					if (i == 2) {
						method210(true, i_35_, i_39_, 33554432);
						method210(true, 1 + i_35_, i_39_, 536870912);
					}
					if (i == 3) {
						method210(true, i_35_, i_39_, 134217728);
						method210(true, i_35_, i_39_ - 1, 8388608);
					}
				}
				if (i_36_ == 1 || i_36_ == 3) {
					if (i == 0) {
						method210(true, i_35_, i_39_, 4194304);
						method210(true, -1 + i_35_, 1 + i_39_, 67108864);
					}
					if (i == 1) {
						method210(true, i_35_, i_39_, 16777216);
						method210(true, 1 + i_35_, i_39_ - -1, 268435456);
					}
					if (i == 2) {
						method210(true, i_35_, i_39_, 67108864);
						method210(true, 1 + i_35_, -1 + i_39_, 4194304);
					}
					if (i == 3) {
						method210(true, i_35_, i_39_, 268435456);
						method210(true, -1 + i_35_, i_39_ - 1, 16777216);
					}
				}
				if (i_36_ == 2) {
					if (i == 0) {
						method210(true, i_35_, i_39_, 545259520);
						method210(true, i_35_ + -1, i_39_, 33554432);
						method210(true, i_35_, 1 + i_39_, 134217728);
					}
					if (i == 1) {
						method210(true, i_35_, i_39_, 41943040);
						method210(true, i_35_, 1 + i_39_, 134217728);
						method210(true, 1 + i_35_, i_39_, 536870912);
					}
					if (i == 2) {
						method210(true, i_35_, i_39_, 167772160);
						method210(true, i_35_ + 1, i_39_, 536870912);
						method210(true, i_35_, i_39_ - 1, 8388608);
					}
					if (i == 3) {
						method210(true, i_35_, i_39_, 671088640);
						method210(true, i_35_, i_39_ - 1, 8388608);
						method210(true, i_35_ + -1, i_39_, 33554432);
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("ch.Q(").append(i).append(',').append(bool).append(',').append(i_35_).append(',').append(i_36_).append(',').append(bool_37_).append(',').append(i_38_).append(',').append(i_39_).append(')').toString());
		}
	}

	final boolean method216(final int i, final int i_40_, final int i_41_, final int i_42_, final int i_43_, final int i_44_, final int i_45_, final int i_46_, final int i_47_) {
		boolean bool;
		try {
			if (i_42_ > 1) {
				if (Class182.method2443(i, i_44_, i_45_, i_42_, i_43_, i_46_, -111, i_47_, i_42_)) {
					return true;
				}
				return method224(i_45_, i_42_, i_47_, i_46_, -107, i_42_, i, i_44_, i_41_, i_43_);
			}
			final int i_48_ = -1 + i_43_ + i_45_;
			final int i_49_ = i_44_ + i_46_ + -1;
			if (i_47_ >= i_44_ && i_49_ >= i_47_ && i_43_ <= i && i <= i_48_) {
				return true;
			}
			if (i_44_ + i_40_ == i_47_ && i_43_ <= i && i <= i_48_ && (0x8 & this.anIntArrayArray152[-anInt149 + i_47_][i + -anInt150]) == 0 && (0x8 & i_41_) == 0) {
				return true;
			}
			if (i_47_ == 1 + i_49_ && i >= i_43_ && i <= i_48_ && (0x80 & this.anIntArrayArray152[i_47_ + -anInt149][i + -anInt150]) == 0 && (i_41_ & 0x2) == 0) {
				return true;
			}
			if (-1 + i_43_ == i && i_44_ <= i_47_ && i_47_ <= i_49_ && (0x2 & this.anIntArrayArray152[-anInt149 + i_47_][i + -anInt150]) == 0 && (i_41_ & 0x4) == 0) {
				return true;
			}
			if (i == i_48_ + 1 && i_47_ >= i_44_ && i_47_ <= i_49_ && (this.anIntArrayArray152[i_47_ - anInt149][-anInt150 + i] & 0x20) == 0 && (0x1 & i_41_) == 0) {
				return true;
			}
			bool = false;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("ch.L(").append(i).append(',').append(i_40_).append(',').append(i_41_).append(',').append(i_42_).append(',').append(i_43_).append(',').append(i_44_).append(',').append(i_45_).append(',').append(i_46_).append(',')
					.append(i_47_).append(')').toString());
		}
		return bool;
	}

	public static void method217(final int i) {
		try {
			if (i != 4624) {
				method218(-61, -128, null, -26, null);
			}
			anIntArray153 = null;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("ch.I(").append(i).append(')').toString());
		}
	}

	static final void method218(final int i, final int i_50_, final long[] ls, final int i_51_, final int[] is) {
		try {
			if (i_50_ > i_51_) {
				final int i_52_ = (i_50_ + i_51_) / 2;
				int i_53_ = i_51_;
				final long l = ls[i_52_];
				ls[i_52_] = ls[i_50_];
				ls[i_50_] = l;
				final int i_54_ = is[i_52_];
				is[i_52_] = is[i_50_];
				is[i_50_] = i_54_;
				for (int i_55_ = i_51_; i_55_ < i_50_; i_55_++) {
					if ((ls[i_55_] ^ 0xffffffffffffffffL) > ((i_55_ & 0x1) + l ^ 0xffffffffffffffffL)) {
						final long l_56_ = ls[i_55_];
						ls[i_55_] = ls[i_53_];
						ls[i_53_] = l_56_;
						final int i_57_ = is[i_55_];
						is[i_55_] = is[i_53_];
						is[i_53_++] = i_57_;
					}
				}
				ls[i_50_] = ls[i_53_];
				ls[i_53_] = l;
				is[i_50_] = is[i_53_];
				is[i_53_] = i_54_;
				method218(i + 0, i_53_ - 1, ls, i_51_, is);
				method218(1, i_50_, ls, i_53_ - -1, is);
			}
			if (i != 1) {
				anInt151 = -111;
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("ch.P(").append(i).append(',').append(i_50_).append(',').append(ls != null ? "{...}" : "null").append(',').append(i_51_).append(',').append(is != null ? "{...}" : "null").append(')').toString());
		}
	}

	final void method219(int i, final int i_58_, final boolean bool, final boolean bool_59_, int i_60_, final int i_61_, final int i_62_) {
		try {
			if (i_58_ != -21665) {
				anIntArray153 = null;
			}
			i -= anInt150;
			i_60_ -= anInt149;
			if (i_61_ == 0) {
				if (i_62_ == 0) {
					method227(128, i, i_60_, i_58_ + 21664);
					method227(8, i, -1 + i_60_, -1);
				}
				if (i_62_ == 1) {
					method227(2, i, i_60_, -1);
					method227(32, i - -1, i_60_, -1);
				}
				if (i_62_ == 2) {
					method227(8, i, i_60_, -1);
					method227(128, i, i_60_ - -1, i_58_ + 21664);
				}
				if (i_62_ == 3) {
					method227(32, i, i_60_, -1);
					method227(2, -1 + i, i_60_, -1);
				}
			}
			if (i_61_ == 1 || i_61_ == 3) {
				if (i_62_ == 0) {
					method227(1, i, i_60_, -1);
					method227(16, i - -1, -1 + i_60_, -1);
				}
				if (i_62_ == 1) {
					method227(4, i, i_60_, -1);
					method227(64, i - -1, i_60_ - -1, i_58_ ^ 0x54a0);
				}
				if (i_62_ == 2) {
					method227(16, i, i_60_, i_58_ + 21664);
					method227(1, i + -1, 1 + i_60_, -1);
				}
				if (i_62_ == 3) {
					method227(64, i, i_60_, -1);
					method227(4, i + -1, -1 + i_60_, -1);
				}
			}
			if (i_61_ == 2) {
				if (i_62_ == 0) {
					method227(130, i, i_60_, i_58_ + 21664);
					method227(8, i, i_60_ - 1, -1);
					method227(32, 1 + i, i_60_, -1);
				}
				if (i_62_ == 1) {
					method227(10, i, i_60_, i_58_ ^ 0x54a0);
					method227(32, 1 + i, i_60_, -1);
					method227(128, i, i_60_ + 1, i_58_ ^ 0x54a0);
				}
				if (i_62_ == 2) {
					method227(40, i, i_60_, -1);
					method227(128, i, i_60_ + 1, -1);
					method227(2, i + -1, i_60_, -1);
				}
				if (i_62_ == 3) {
					method227(160, i, i_60_, -1);
					method227(2, -1 + i, i_60_, -1);
					method227(8, i, i_60_ + -1, -1);
				}
			}
			if (bool) {
				if (i_61_ == 0) {
					if (i_62_ == 0) {
						method227(65536, i, i_60_, -1);
						method227(4096, i, -1 + i_60_, -1);
					}
					if (i_62_ == 1) {
						method227(1024, i, i_60_, -1);
						method227(16384, i - -1, i_60_, -1);
					}
					if (i_62_ == 2) {
						method227(4096, i, i_60_, -1);
						method227(65536, i, i_60_ + 1, -1);
					}
					if (i_62_ == 3) {
						method227(16384, i, i_60_, -1);
						method227(1024, -1 + i, i_60_, -1);
					}
				}
				if (i_61_ == 1 || i_61_ == 3) {
					if (i_62_ == 0) {
						method227(512, i, i_60_, -1);
						method227(8192, 1 + i, -1 + i_60_, i_58_ ^ 0x54a0);
					}
					if (i_62_ == 1) {
						method227(2048, i, i_60_, -1);
						method227(32768, i - -1, i_60_ - -1, -1);
					}
					if (i_62_ == 2) {
						method227(8192, i, i_60_, -1);
						method227(512, -1 + i, i_60_ - -1, -1);
					}
					if (i_62_ == 3) {
						method227(32768, i, i_60_, -1);
						method227(2048, i - 1, -1 + i_60_, -1);
					}
				}
				if (i_61_ == 2) {
					if (i_62_ == 0) {
						method227(66560, i, i_60_, i_58_ ^ 0x54a0);
						method227(4096, i, i_60_ + -1, -1);
						method227(16384, i - -1, i_60_, -1);
					}
					if (i_62_ == 1) {
						method227(5120, i, i_60_, -1);
						method227(16384, 1 + i, i_60_, -1);
						method227(65536, i, 1 + i_60_, i_58_ ^ 0x54a0);
					}
					if (i_62_ == 2) {
						method227(20480, i, i_60_, -1);
						method227(65536, i, 1 + i_60_, i_58_ ^ 0x54a0);
						method227(1024, -1 + i, i_60_, i_58_ + 21664);
					}
					if (i_62_ == 3) {
						method227(81920, i, i_60_, -1);
						method227(1024, i - 1, i_60_, -1);
						method227(4096, i, -1 + i_60_, -1);
					}
				}
			}
			if (bool_59_) {
				if (i_61_ == 0) {
					if (i_62_ == 0) {
						method227(536870912, i, i_60_, -1);
						method227(33554432, i, -1 + i_60_, -1);
					}
					if (i_62_ == 1) {
						method227(8388608, i, i_60_, -1);
						method227(134217728, 1 + i, i_60_, i_58_ ^ 0x54a0);
					}
					if (i_62_ == 2) {
						method227(33554432, i, i_60_, i_58_ ^ 0x54a0);
						method227(536870912, i, 1 + i_60_, -1);
					}
					if (i_62_ == 3) {
						method227(134217728, i, i_60_, -1);
						method227(8388608, -1 + i, i_60_, i_58_ ^ 0x54a0);
					}
				}
				if (i_61_ == 1 || i_61_ == 3) {
					if (i_62_ == 0) {
						method227(4194304, i, i_60_, -1);
						method227(67108864, 1 + i, -1 + i_60_, -1);
					}
					if (i_62_ == 1) {
						method227(16777216, i, i_60_, -1);
						method227(268435456, 1 + i, i_60_ - -1, -1);
					}
					if (i_62_ == 2) {
						method227(67108864, i, i_60_, -1);
						method227(4194304, -1 + i, i_60_ + 1, -1);
					}
					if (i_62_ == 3) {
						method227(268435456, i, i_60_, -1);
						method227(16777216, i + -1, i_60_ + -1, i_58_ + 21664);
					}
				}
				if (i_61_ == 2) {
					if (i_62_ == 0) {
						method227(545259520, i, i_60_, -1);
						method227(33554432, i, i_60_ - 1, i_58_ + 21664);
						method227(134217728, 1 + i, i_60_, -1);
					}
					if (i_62_ == 1) {
						method227(41943040, i, i_60_, -1);
						method227(134217728, 1 + i, i_60_, i_58_ ^ 0x54a0);
						method227(536870912, i, i_60_ - -1, i_58_ + 21664);
					}
					if (i_62_ == 2) {
						method227(167772160, i, i_60_, -1);
						method227(536870912, i, i_60_ + 1, -1);
						method227(8388608, -1 + i, i_60_, i_58_ + 21664);
					}
					if (i_62_ == 3) {
						method227(671088640, i, i_60_, i_58_ ^ 0x54a0);
						method227(8388608, i + -1, i_60_, -1);
						method227(33554432, i, -1 + i_60_, i_58_ ^ 0x54a0);
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("ch.R(").append(i).append(',').append(i_58_).append(',').append(bool).append(',').append(bool_59_).append(',').append(i_60_).append(',').append(i_61_).append(',').append(i_62_).append(')').toString());
		}
	}

	final boolean method220(int i, final int i_63_, int i_64_, int i_65_, final byte i_66_, int i_67_, final int i_68_, final int i_69_) {
		boolean bool;
		try {
			if (i_66_ > -19) {
				method215(-67, false, 86, 30, false, 33, -107);
			}
			if (i_68_ == 1) {
				if (i_67_ == i_65_ && i == i_64_) {
					return true;
				}
			} else if (i_65_ <= i_67_ && i_67_ <= i_65_ + i_68_ - 1 && i >= i && i <= i_68_ + i - 1) {
				return true;
			}
			i -= anInt150;
			i_67_ -= anInt149;
			i_64_ -= anInt150;
			i_65_ -= anInt149;
			if (i_68_ != 1) {
				final int i_70_ = i_65_ - (-i_68_ - -1);
				final int i_71_ = i_68_ + i_64_ - 1;
				if (i_69_ == 0) {
					if (i_63_ == 0) {
						if (i_67_ - i_68_ == i_65_ && i_64_ <= i && i_71_ >= i) {
							return true;
						}
						if (i_67_ >= i_65_ && i_67_ <= i_70_ && i - -1 == i_64_ && (this.anIntArrayArray152[i_67_][i_64_] & 0x2c0120) == 0) {
							return true;
						}
						if (i_67_ >= i_65_ && i_67_ <= i_70_ && -i_68_ + i == i_64_ && (this.anIntArrayArray152[i_67_][i_71_] & 0x2c0102) == 0) {
							return true;
						}
					} else if (i_63_ != 1) {
						if (i_63_ != 2) {
							if (i_63_ == 3) {
								if (i_65_ <= i_67_ && i_70_ >= i_67_ && i_64_ == -i_68_ + i) {
									return true;
								}
								if (i_65_ == -i_68_ + i_67_ && i_64_ <= i && i_71_ >= i && (0x2c0108 & this.anIntArrayArray152[i_70_][i]) == 0) {
									return true;
								}
								if (i_67_ - -1 == i_65_ && i_64_ <= i && i_71_ >= i && (0x2c0180 & this.anIntArrayArray152[i_65_][i]) == 0) {
									return true;
								}
							}
						} else {
							if (i_65_ == 1 + i_67_ && i_64_ <= i && i_71_ >= i) {
								return true;
							}
							if (i_67_ >= i_65_ && i_67_ <= i_70_ && i_64_ == i - -1 && (0x2c0120 & this.anIntArrayArray152[i_67_][i_64_]) == 0) {
								return true;
							}
							if (i_67_ >= i_65_ && i_67_ <= i_70_ && i_64_ == i - i_68_ && (this.anIntArrayArray152[i_67_][i_71_] & 0x2c0102) == 0) {
								return true;
							}
						}
					} else {
						if (i_65_ <= i_67_ && i_67_ <= i_70_ && 1 + i == i_64_) {
							return true;
						}
						if (-i_68_ + i_67_ == i_65_ && i_64_ <= i && i <= i_71_ && (0x2c0108 & this.anIntArrayArray152[i_70_][i]) == 0) {
							return true;
						}
						if (i_67_ + 1 == i_65_ && i_64_ <= i && i <= i_71_ && (this.anIntArrayArray152[i_65_][i] & 0x2c0180) == 0) {
							return true;
						}
					}
				}
				if (i_69_ == 2) {
					if (i_63_ != 0) {
						if (i_63_ != 1) {
							if (i_63_ != 2) {
								if (i_63_ == 3) {
									if (i_65_ == -i_68_ + i_67_ && i >= i_64_ && i <= i_71_) {
										return true;
									}
									if (i_67_ >= i_65_ && i_67_ <= i_70_ && 1 + i == i_64_ && (0x2c0120 & this.anIntArrayArray152[i_67_][i_64_]) == 0) {
										return true;
									}
									if (1 + i_67_ == i_65_ && i_64_ <= i && i <= i_71_ && (this.anIntArrayArray152[i_65_][i] & 0x2c0180) == 0) {
										return true;
									}
									if (i_67_ >= i_65_ && i_70_ >= i_67_ && i_64_ == -i_68_ + i) {
										return true;
									}
								}
							} else {
								if (i_65_ == i_67_ + -i_68_ && i_64_ <= i && i_71_ >= i && (0x2c0108 & this.anIntArrayArray152[i_70_][i]) == 0) {
									return true;
								}
								if (i_65_ <= i_67_ && i_67_ <= i_70_ && 1 + i == i_64_ && (this.anIntArrayArray152[i_67_][i_64_] & 0x2c0120) == 0) {
									return true;
								}
								if (i_65_ == i_67_ - -1 && i >= i_64_ && i_71_ >= i) {
									return true;
								}
								if (i_67_ >= i_65_ && i_70_ >= i_67_ && i_64_ == -i_68_ + i) {
									return true;
								}
							}
						} else {
							if (i_65_ == -i_68_ + i_67_ && i >= i_64_ && i <= i_71_ && (this.anIntArrayArray152[i_70_][i] & 0x2c0108) == 0) {
								return true;
							}
							if (i_65_ <= i_67_ && i_67_ <= i_70_ && 1 + i == i_64_) {
								return true;
							}
							if (i_65_ == i_67_ - -1 && i_64_ <= i && i <= i_71_) {
								return true;
							}
							if (i_65_ <= i_67_ && i_70_ >= i_67_ && i_64_ == -i_68_ + i && (this.anIntArrayArray152[i_67_][i_71_] & 0x2c0102) == 0) {
								return true;
							}
						}
					} else {
						if (-i_68_ + i_67_ == i_65_ && i >= i_64_ && i_71_ >= i) {
							return true;
						}
						if (i_67_ >= i_65_ && i_70_ >= i_67_ && i + 1 == i_64_) {
							return true;
						}
						if (i_65_ == i_67_ + 1 && i >= i_64_ && i_71_ >= i && (this.anIntArrayArray152[i_65_][i] & 0x2c0180) == 0) {
							return true;
						}
						if (i_65_ <= i_67_ && i_70_ >= i_67_ && i_64_ == -i_68_ + i && (this.anIntArrayArray152[i_67_][i_71_] & 0x2c0102) == 0) {
							return true;
						}
					}
				}
				if (i_69_ == 9) {
					if (i_67_ >= i_65_ && i_70_ >= i_67_ && i - -1 == i_64_ && (this.anIntArrayArray152[i_67_][i_64_] & 0x2c0120) == 0) {
						return true;
					}
					if (i_65_ <= i_67_ && i_70_ >= i_67_ && -i_68_ + i == i_64_ && (this.anIntArrayArray152[i_67_][i_71_] & 0x2c0102) == 0) {
						return true;
					}
					if (i_67_ + -i_68_ == i_65_ && i >= i_64_ && i <= i_71_ && (this.anIntArrayArray152[i_70_][i] & 0x2c0108) == 0) {
						return true;
					}
					if (i_67_ + 1 == i_65_ && i >= i_64_ && i <= i_71_ && (0x2c0180 & this.anIntArrayArray152[i_65_][i]) == 0) {
						return true;
					}
				}
			} else {
				if (i_69_ == 0) {
					if (i_63_ != 0) {
						if (i_63_ == 1) {
							if (i_67_ == i_65_ && i_64_ == 1 + i) {
								return true;
							}
							if (i_65_ == i_67_ + -1 && i == i_64_ && (this.anIntArrayArray152[i_65_][i_64_] & 0x2c0108) == 0) {
								return true;
							}
							if (i_65_ == 1 + i_67_ && i == i_64_ && (this.anIntArrayArray152[i_65_][i_64_] & 0x2c0180) == 0) {
								return true;
							}
						} else if (i_63_ != 2) {
							if (i_63_ == 3) {
								if (i_67_ == i_65_ && -1 + i == i_64_) {
									return true;
								}
								if (i_65_ == -1 + i_67_ && i == i_64_ && (0x2c0108 & this.anIntArrayArray152[i_65_][i_64_]) == 0) {
									return true;
								}
								if (i_67_ + 1 == i_65_ && i == i_64_ && (0x2c0180 & this.anIntArrayArray152[i_65_][i_64_]) == 0) {
									return true;
								}
							}
						} else {
							if (i_65_ == i_67_ + 1 && i_64_ == i) {
								return true;
							}
							if (i_67_ == i_65_ && i_64_ == i - -1 && (this.anIntArrayArray152[i_65_][i_64_] & 0x2c0120) == 0) {
								return true;
							}
							if (i_67_ == i_65_ && -1 + i == i_64_ && (this.anIntArrayArray152[i_65_][i_64_] & 0x2c0102) == 0) {
								return true;
							}
						}
					} else {
						if (i_65_ == i_67_ + -1 && i_64_ == i) {
							return true;
						}
						if (i_67_ == i_65_ && i_64_ == i + 1 && (this.anIntArrayArray152[i_65_][i_64_] & 0x2c0120) == 0) {
							return true;
						}
						if (i_67_ == i_65_ && i_64_ == i + -1 && (this.anIntArrayArray152[i_65_][i_64_] & 0x2c0102) == 0) {
							return true;
						}
					}
				}
				if (i_69_ == 2) {
					if (i_63_ == 0) {
						if (i_65_ == -1 + i_67_ && i == i_64_) {
							return true;
						}
						if (i_65_ == i_67_ && i_64_ == i + 1) {
							return true;
						}
						if (i_65_ == i_67_ + 1 && i == i_64_ && (0x2c0180 & this.anIntArrayArray152[i_65_][i_64_]) == 0) {
							return true;
						}
						if (i_65_ == i_67_ && i_64_ == i + -1 && (this.anIntArrayArray152[i_65_][i_64_] & 0x2c0102) == 0) {
							return true;
						}
					} else if (i_63_ != 1) {
						if (i_63_ == 2) {
							if (-1 + i_67_ == i_65_ && i == i_64_ && (this.anIntArrayArray152[i_65_][i_64_] & 0x2c0108) == 0) {
								return true;
							}
							if (i_65_ == i_67_ && 1 + i == i_64_ && (0x2c0120 & this.anIntArrayArray152[i_65_][i_64_]) == 0) {
								return true;
							}
							if (1 + i_67_ == i_65_ && i == i_64_) {
								return true;
							}
							if (i_67_ == i_65_ && i_64_ == i + -1) {
								return true;
							}
						} else if (i_63_ == 3) {
							if (i_67_ + -1 == i_65_ && i == i_64_) {
								return true;
							}
							if (i_67_ == i_65_ && i_64_ == 1 + i && (this.anIntArrayArray152[i_65_][i_64_] & 0x2c0120) == 0) {
								return true;
							}
							if (i_65_ == i_67_ - -1 && i_64_ == i && (0x2c0180 & this.anIntArrayArray152[i_65_][i_64_]) == 0) {
								return true;
							}
							if (i_65_ == i_67_ && i_64_ == i - 1) {
								return true;
							}
						}
					} else {
						if (i_67_ + -1 == i_65_ && i == i_64_ && (0x2c0108 & this.anIntArrayArray152[i_65_][i_64_]) == 0) {
							return true;
						}
						if (i_65_ == i_67_ && i_64_ == 1 + i) {
							return true;
						}
						if (i_67_ + 1 == i_65_ && i == i_64_) {
							return true;
						}
						if (i_67_ == i_65_ && i + -1 == i_64_ && (0x2c0102 & this.anIntArrayArray152[i_65_][i_64_]) == 0) {
							return true;
						}
					}
				}
				if (i_69_ == 9) {
					if (i_65_ == i_67_ && 1 + i == i_64_ && (0x20 & this.anIntArrayArray152[i_65_][i_64_]) == 0) {
						return true;
					}
					if (i_67_ == i_65_ && -1 + i == i_64_ && (this.anIntArrayArray152[i_65_][i_64_] & 0x2) == 0) {
						return true;
					}
					if (-1 + i_67_ == i_65_ && i_64_ == i && (this.anIntArrayArray152[i_65_][i_64_] & 0x8) == 0) {
						return true;
					}
					if (i_65_ == i_67_ - -1 && i_64_ == i && (0x80 & this.anIntArrayArray152[i_65_][i_64_]) == 0) {
						return true;
					}
				}
			}
			bool = false;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("ch.F(").append(i).append(',').append(i_63_).append(',').append(i_64_).append(',').append(i_65_).append(',').append(i_66_).append(',').append(i_67_).append(',').append(i_68_).append(',').append(i_69_).append(')')
					.toString());
		}
		return bool;
	}

	final boolean method221(final int i, int i_72_, int i_73_, int i_74_, int i_75_) {
		boolean bool;
		try {
			if (i_74_ == i_75_ && i_73_ == i_72_) {
				return true;
			}
			i_72_ -= anInt150;
			i_74_ -= anInt149;
			if (i_74_ < 0 || anInt154 <= i_74_ || i_72_ < 0 || anInt148 <= i_72_) {
				return false;
			}
			i_75_ -= anInt149;
			i_73_ -= anInt150;
			if (i_75_ < 0 || i_75_ >= anInt154 || i_73_ < 0 || anInt148 <= i_73_) {
				return false;
			}
			if (i != 65536) {
				return true;
			}
			int i_76_;
			if (i_72_ > i_73_) {
				i_76_ = i_72_ - i_73_;
			} else {
				i_76_ = -i_72_ + i_73_;
			}
			int i_77_;
			if (i_74_ <= i_75_) {
				i_77_ = -i_74_ + i_75_;
			} else {
				i_77_ = i_74_ + -i_75_;
			}
			while_10_: do {
				if (i_77_ > i_76_) {
					int i_78_ = 32768;
					final int i_79_ = 65536 * i_76_ / i_77_;
					while (i_74_ != i_75_) {
						if (i_74_ > i_75_) {
							if ((this.anIntArrayArray152[i_75_][i_73_] & 0x2c0108) != 0) {
								return false;
							}
							i_75_++;
						} else if (i_75_ > i_74_) {
							if ((this.anIntArrayArray152[i_75_][i_73_] & 0x2c0180) == 0) {
								i_75_--;
							} else {
								return false;
							}
						}
						i_78_ += i_79_;
						if (-65537 >= (i_78_ ^ 0xffffffff)) {
							i_78_ -= 65536;
							if (i_72_ > i_73_) {
								if ((this.anIntArrayArray152[i_75_][i_73_] & 0x2c0102) == 0) {
									i_73_++;
								} else {
									return false;
								}
							} else if (i_73_ > i_72_) {
								if ((0x2c0120 & this.anIntArrayArray152[i_75_][i_73_]) != 0) {
									return false;
								}
								i_73_--;
							}
						}
					}
				} else {
					final int i_80_ = 65536 * i_77_ / i_76_;
					int i_81_ = 32768;
					for (;;) {
						if (i_72_ == i_73_) {
							break while_10_;
						}
						if (i_72_ <= i_73_) {
							if (i_72_ < i_73_) {
								if ((0x2c0120 & this.anIntArrayArray152[i_75_][i_73_]) == 0) {
									i_73_--;
								} else {
									return false;
								}
							}
						} else if ((0x2c0102 & this.anIntArrayArray152[i_75_][i_73_]) == 0) {
							i_73_++;
						} else {
							return false;
						}
						i_81_ += i_80_;
						if (65536 <= i_81_) {
							i_81_ -= 65536;
							if (i_74_ > i_75_) {
								if ((this.anIntArrayArray152[i_75_][i_73_] & 0x2c0108) != 0) {
									return false;
								}
								i_75_++;
							} else if (i_75_ > i_74_) {
								if ((this.anIntArrayArray152[i_75_][i_73_] & 0x2c0180) != 0) {
									break;
								}
								i_75_--;
							}
						}
					}
					return false;
				}
			} while (false);
			if ((0x240100 & this.anIntArrayArray152[i_74_][i_72_]) != 0) {
				return false;
			}
			bool = true;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("ch.G(").append(i).append(',').append(i_72_).append(',').append(i_73_).append(',').append(i_74_).append(',').append(i_75_).append(')').toString());
		}
		return bool;
	}

	static final void method222(final boolean bool, final byte[] is, final int i, final int i_82_, final int i_83_, final CollisionMap[] class25s) {
		try {
			final Buffer class120_sub7 = new Buffer(is);
			int i_84_ = -1;
			for (;;) {
				final int i_85_ = class120_sub7.method1100(126);
				if (i_85_ == 0) {
					break;
				}
				i_84_ += i_85_;
				int i_86_ = 0;
				for (;;) {
					final int i_87_ = class120_sub7.getUSmart();
					if (i_87_ == 0) {
						break;
					}
					i_86_ += -1 + i_87_;
					final int i_88_ = 0x3f & i_86_;
					final int i_89_ = 0x3f & i_86_ >> 6;
					final int i_90_ = class120_sub7.getUByte();
					final int i_91_ = i_90_ & 0x3;
					final int i_92_ = i_90_ >> 2;
					final int i_93_ = i_89_ - -i_83_;
					final int i_94_ = i_88_ - -i_82_;
					final int i_95_ = i_86_ >> 12;
					if (i_93_ > 0 && i_94_ > 0 && i_93_ < 103 && i_94_ < 103) {
						CollisionMap collisionMap = null;
						if (!bool) {
							int i_96_ = i_95_;
							if ((0x2 & Class114.tileSettings[1][i_93_][i_94_]) == 2) {
								i_96_--;
							}
							if (i_96_ >= 0) {
								collisionMap = class25s[i_96_];
							}
						}
						Class93.method771(i_91_, i_95_, i_84_, i_95_, i_93_, 4, bool, i_94_, collisionMap, !bool, i_92_);
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("ch.N(").append(bool).append(',').append(is != null ? "{...}" : "null").append(',').append(i).append(',').append(i_82_).append(',').append(i_83_).append(',').append(class25s != null ? "{...}" : "null").append(')')
					.toString());
		}
	}

	final boolean method223(int i, int i_97_, int i_98_, final int i_99_, int i_100_, final int i_101_, int i_102_, final int i_103_) {
		boolean bool;
		try {
			if (i_99_ != 1024) {
				this.anIntArrayArray152 = null;
			}
			if (i_103_ != 1) {
				if (i_97_ <= i && i <= -1 + i_97_ - -i_103_ && i_98_ <= i_98_ && -1 + i_103_ + i_98_ >= i_98_) {
					return true;
				}
			} else if (i_97_ == i && i_98_ == i_100_) {
				return true;
			}
			i_100_ -= anInt150;
			i_97_ -= anInt149;
			i -= anInt149;
			i_98_ -= anInt150;
			if (i_103_ != 1) {
				final int i_104_ = i_97_ - -i_103_ - 1;
				final int i_105_ = i_100_ + i_103_ - 1;
				if (i_101_ == 6 || i_101_ == 7) {
					if (i_101_ == 7) {
						i_102_ = 2 + i_102_ & 0x3;
					}
					if (i_102_ == 0) {
						if (i_97_ == i - -1 && i_98_ >= i_100_ && i_98_ <= i_105_ && (0x80 & this.anIntArrayArray152[i_97_][i_98_]) == 0) {
							return true;
						}
						if (i >= i_97_ && i_104_ >= i && i_100_ == i_98_ + -i_103_ && (0x2 & this.anIntArrayArray152[i][i_105_]) == 0) {
							return true;
						}
					} else if (i_102_ == 1) {
						if (i_97_ == i + -i_103_ && i_98_ >= i_100_ && i_98_ <= i_105_ && (this.anIntArrayArray152[i_104_][i_98_] & 0x8) == 0) {
							return true;
						}
						if (i_97_ <= i && i_104_ >= i && i_100_ == i_98_ + -i_103_ && (this.anIntArrayArray152[i][i_105_] & 0x2) == 0) {
							return true;
						}
					} else if (i_102_ != 2) {
						if (i_102_ == 3) {
							if (i_97_ == 1 + i && i_98_ >= i_100_ && i_105_ >= i_98_ && (this.anIntArrayArray152[i_97_][i_98_] & 0x80) == 0) {
								return true;
							}
							if (i >= i_97_ && i_104_ >= i && i_98_ - -1 == i_100_ && (0x20 & this.anIntArrayArray152[i][i_100_]) == 0) {
								return true;
							}
						}
					} else {
						if (i_97_ == -i_103_ + i && i_100_ <= i_98_ && i_98_ <= i_105_ && (0x8 & this.anIntArrayArray152[i_104_][i_98_]) == 0) {
							return true;
						}
						if (i >= i_97_ && i <= i_104_ && i_100_ == 1 + i_98_ && (0x20 & this.anIntArrayArray152[i][i_100_]) == 0) {
							return true;
						}
					}
				}
				if (i_101_ == 8) {
					if (i_97_ <= i && i <= i_104_ && 1 + i_98_ == i_100_ && (this.anIntArrayArray152[i][i_100_] & 0x20) == 0) {
						return true;
					}
					if (i_97_ <= i && i <= i_104_ && -i_103_ + i_98_ == i_100_ && (0x2 & this.anIntArrayArray152[i][i_105_]) == 0) {
						return true;
					}
					if (-i_103_ + i == i_97_ && i_98_ >= i_100_ && i_98_ <= i_105_ && (this.anIntArrayArray152[i_104_][i_98_] & 0x8) == 0) {
						return true;
					}
					if (i + 1 == i_97_ && i_98_ >= i_100_ && i_105_ >= i_98_ && (0x80 & this.anIntArrayArray152[i_97_][i_98_]) == 0) {
						return true;
					}
				}
			} else {
				if (i_101_ == 6 || i_101_ == 7) {
					if (i_101_ == 7) {
						i_102_ = 0x3 & 2 + i_102_;
					}
					if (i_102_ == 0) {
						if (i - -1 == i_97_ && i_98_ == i_100_ && (0x80 & this.anIntArrayArray152[i_97_][i_100_]) == 0) {
							return true;
						}
						if (i == i_97_ && i_98_ - 1 == i_100_ && (0x2 & this.anIntArrayArray152[i_97_][i_100_]) == 0) {
							return true;
						}
					} else if (i_102_ != 1) {
						if (i_102_ != 2) {
							if (i_102_ == 3) {
								if (1 + i == i_97_ && i_98_ == i_100_ && (this.anIntArrayArray152[i_97_][i_100_] & 0x80) == 0) {
									return true;
								}
								if (i_97_ == i && i_100_ == 1 + i_98_ && (this.anIntArrayArray152[i_97_][i_100_] & 0x20) == 0) {
									return true;
								}
							}
						} else {
							if (i - 1 == i_97_ && i_98_ == i_100_ && (0x8 & this.anIntArrayArray152[i_97_][i_100_]) == 0) {
								return true;
							}
							if (i == i_97_ && i_100_ == i_98_ - -1 && (0x20 & this.anIntArrayArray152[i_97_][i_100_]) == 0) {
								return true;
							}
						}
					} else {
						if (-1 + i == i_97_ && i_100_ == i_98_ && (0x8 & this.anIntArrayArray152[i_97_][i_100_]) == 0) {
							return true;
						}
						if (i_97_ == i && i_100_ == i_98_ + -1 && (this.anIntArrayArray152[i_97_][i_100_] & 0x2) == 0) {
							return true;
						}
					}
				}
				if (i_101_ == 8) {
					if (i == i_97_ && i_100_ == 1 + i_98_ && (this.anIntArrayArray152[i_97_][i_100_] & 0x20) == 0) {
						return true;
					}
					if (i_97_ == i && i_98_ - 1 == i_100_ && (0x2 & this.anIntArrayArray152[i_97_][i_100_]) == 0) {
						return true;
					}
					if (i + -1 == i_97_ && i_98_ == i_100_ && (0x8 & this.anIntArrayArray152[i_97_][i_100_]) == 0) {
						return true;
					}
					if (i_97_ == 1 + i && i_100_ == i_98_ && (this.anIntArrayArray152[i_97_][i_100_] & 0x80) == 0) {
						return true;
					}
				}
			}
			bool = false;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception,
					new StringBuilder("ch.D(").append(i).append(',').append(i_97_).append(',').append(i_98_).append(',').append(i_99_).append(',').append(i_100_).append(',').append(i_101_).append(',').append(i_102_).append(',').append(i_103_).append(')').toString());
		}
		return bool;
	}

	private final boolean method224(final int i, final int i_106_, final int i_107_, final int i_108_, final int i_109_, final int i_110_, final int i_111_, final int i_112_, final int i_113_, final int i_114_) {
		boolean bool;
		try {
			final int i_115_ = i_110_ + i_107_;
			final int i_116_ = i_112_ + i_108_;
			final int i_117_ = i_106_ + i_111_;
			final int i_118_ = i_114_ - -i;
			if (i_116_ == i_107_ && (0x2 & i_113_) == 0) {
				int i_119_ = i_111_ <= i_114_ ? i_114_ : i_111_;
				for (final int i_120_ = i_118_ <= i_117_ ? i_118_ : i_117_; i_120_ > i_119_; i_119_++) {
					if ((0x8 & this.anIntArrayArray152[-anInt149 + i_116_ + -1][-anInt150 + i_119_]) == 0) {
						return true;
					}
				}
			} else if (i_115_ != i_112_ || (i_113_ & 0x8) != 0) {
				if (i_118_ == i_111_ && (0x1 & i_113_) == 0) {
					int i_121_ = i_107_ > i_112_ ? i_107_ : i_112_;
					for (final int i_122_ = i_116_ <= i_115_ ? i_116_ : i_115_; i_122_ > i_121_; i_121_++) {
						if ((0x2 & this.anIntArrayArray152[-anInt149 + i_121_][-1 + i_118_ - anInt150]) == 0) {
							return true;
						}
					}
				} else if (i_117_ == i_114_ && (i_113_ & 0x4) == 0) {
					final int i_123_ = i_116_ > i_115_ ? i_115_ : i_116_;
					for (int i_124_ = i_107_ <= i_112_ ? i_112_ : i_107_; i_124_ < i_123_; i_124_++) {
						if ((this.anIntArrayArray152[-anInt149 + i_124_][-anInt150 + i_114_] & 0x20) == 0) {
							return true;
						}
					}
				}
			} else {
				int i_125_ = i_111_ > i_114_ ? i_111_ : i_114_;
				for (final int i_126_ = i_117_ >= i_118_ ? i_118_ : i_117_; i_126_ > i_125_; i_125_++) {
					if ((this.anIntArrayArray152[-anInt149 + i_112_][i_125_ + -anInt150] & 0x80) == 0) {
						return true;
					}
				}
			}
			bool = false;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("ch.H(").append(i).append(',').append(i_106_).append(',').append(i_107_).append(',').append(i_108_).append(',').append(i_109_).append(',').append(i_110_).append(',').append(i_111_).append(',').append(i_112_)
					.append(',').append(i_113_).append(',').append(i_114_).append(')').toString());
		}
		return bool;
	}

	final void method225(final int i) {
		try {
			if (i == 11736) {
				for (int i_127_ = 0; i_127_ < anInt154; i_127_++) {
					for (int i_128_ = 0; anInt148 > i_128_; i_128_++) {
						if (i_127_ != 0 && i_128_ != 0 && anInt154 + -5 > i_127_ && i_128_ < -5 + anInt148) {
							this.anIntArrayArray152[i_127_][i_128_] = 2097152;
						} else {
							this.anIntArrayArray152[i_127_][i_128_] = 16777215;
						}
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("ch.M(").append(i).append(')').toString());
		}
	}

	final void method226(int i, int i_129_, final byte i_130_) {
		try {
			i -= anInt149;
			if (i_130_ >= -70) {
				anInt149 = -103;
			}
			i_129_ -= anInt150;
			this.anIntArrayArray152[i][i_129_] = Class191.method2512(this.anIntArrayArray152[i][i_129_], 2097152);
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("ch.A(").append(i).append(',').append(i_129_).append(',').append(i_130_).append(')').toString());
		}
	}

	private final void method227(final int i, final int i_131_, final int i_132_, final int i_133_) {
		try {
			this.anIntArrayArray152[i_132_][i_131_] = Class191.method2512(this.anIntArrayArray152[i_132_][i_131_], i);
			if (i_133_ != -1) {
				anInt154 = 78;
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("ch.O(").append(i).append(',').append(i_131_).append(',').append(i_132_).append(',').append(i_133_).append(')').toString());
		}
	}

	final void method228(final int i, int i_134_, int i_135_) {
		try {
			i_135_ -= anInt150;
			i_134_ -= anInt149;
			this.anIntArrayArray152[i_134_][i_135_] = Class120_Sub12_Sub3.method1207(this.anIntArrayArray152[i_134_][i_135_], -262145);
			if (i <= 0) {
				anInt150 = 118;
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("ch.J(").append(i).append(',').append(i_134_).append(',').append(i_135_).append(')').toString());
		}
	}

	CollisionMap(final int i, final int i_136_) {
		anInt154 = i;
		anInt150 = 0;
		anInt149 = 0;
		anInt148 = i_136_;
		this.anIntArrayArray152 = new int[anInt154][anInt148];
		method225(11736);
	}
}
