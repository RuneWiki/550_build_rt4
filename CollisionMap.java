/* Class25 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class CollisionMap {
	private final int height;
	private int xOffset;
	private int zOffset;
	static int anInt151;
	int[][] collisionFlags;
	static int[] anIntArray153 = { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };
	private int width;

	private final void method210(final int x, final int z, final int flag) {
		this.collisionFlags[x][z] = Class120_Sub12_Sub3.method1207(this.collisionFlags[x][z], flag ^ 0xffffffff);
	}

	static final void method211(final int i, final int i_2_, final int i_3_, final int i_4_) {
		AmbientSound.fillArray(GameEntity.anIntArrayArray3009[i], i_4_, -i_3_ + i_2_, i_3_ + i_2_);
		int i_5_ = 0;
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
	}

	final void method212(int x, int z) {
		x -= xOffset;
		z -= zOffset;
		this.collisionFlags[x][z] |= 40000;
	}

	final void method213(int x, int z, final int i, final int i_18_, final boolean bool, final boolean bool_17_) {
		x -= xOffset;
		z -= zOffset;
		int i_22_ = 256;
		if (bool) {
			i_22_ |= 0x20000;
		}
		if (bool_17_) {
			i_22_ |= 0x40000000;
		}
		for (int i_23_ = x; i_23_ < x + i_18_; i_23_++) {
			if (i_23_ >= 0 && width > i_23_) {
				for (int i_24_ = z; i_24_ < z + i; i_24_++) {
					if (i_24_ >= 0 && height > i_24_) {
						addFlag(i_23_, i_24_, i_22_);
					}
				}
			}
		}
	}

	final void method214(final int rotation, int z, int i_26_, int x, int i_29_, final boolean bool, final boolean bool_30_) {
		x -= xOffset;
		z -= zOffset;
		if (rotation == 1 || rotation == 3) {
			final int i_31_ = i_29_;
			i_29_ = i_26_;
			i_26_ = i_31_;
		}
		int i_32_ = 256;
		if (bool) {
			i_32_ |= 0x20000;
		}
		if (bool_30_) {
			i_32_ |= 0x40000000;
		}
		for (int i_33_ = x; i_33_ < x + i_29_; i_33_++) {
			if (i_33_ >= 0 && width > i_33_) {
				for (int i_34_ = z; i_26_ + z > i_34_; i_34_++) {
					if (i_34_ >= 0 && height > i_34_) {
						method210(i_33_, i_34_, i_32_);
					}
				}
			}
		}
	}

	final void method215(final int i, int i_35_, final int i_36_, int i_39_, final boolean bool, final boolean bool_37_) {
		i_35_ -= xOffset;
		i_39_ -= zOffset;
		if (i_36_ == 0) {
			if (i == 0) {
				method210(i_35_, i_39_, 128);
				method210(-1 + i_35_, i_39_, 8);
			}
			if (i == 1) {
				method210(i_35_, i_39_, 2);
				method210(i_35_, i_39_ - -1, 32);
			}
			if (i == 2) {
				method210(i_35_, i_39_, 8);
				method210(i_35_ - -1, i_39_, 128);
			}
			if (i == 3) {
				method210(i_35_, i_39_, 32);
				method210(i_35_, i_39_ + -1, 2);
			}
		}
		if (i_36_ == 1 || i_36_ == 3) {
			if (i == 0) {
				method210(i_35_, i_39_, 1);
				method210(-1 + i_35_, 1 + i_39_, 16);
			}
			if (i == 1) {
				method210(i_35_, i_39_, 4);
				method210(1 + i_35_, 1 + i_39_, 64);
			}
			if (i == 2) {
				method210(i_35_, i_39_, 16);
				method210(i_35_ + 1, -1 + i_39_, 1);
			}
			if (i == 3) {
				method210(i_35_, i_39_, 64);
				method210(-1 + i_35_, -1 + i_39_, 4);
			}
		}
		if (i_36_ == 2) {
			if (i == 0) {
				method210(i_35_, i_39_, 130);
				method210(i_35_ + -1, i_39_, 8);
				method210(i_35_, 1 + i_39_, 32);
			}
			if (i == 1) {
				method210(i_35_, i_39_, 10);
				method210(i_35_, 1 + i_39_, 32);
				method210(1 + i_35_, i_39_, 128);
			}
			if (i == 2) {
				method210(i_35_, i_39_, 40);
				method210(1 + i_35_, i_39_, 128);
				method210(i_35_, i_39_ + -1, 2);
			}
			if (i == 3) {
				method210(i_35_, i_39_, 160);
				method210(i_35_, i_39_ + -1, 2);
				method210(-1 + i_35_, i_39_, 8);
			}
		}
		if (bool_37_) {
			if (i_36_ == 0) {
				if (i == 0) {
					method210(i_35_, i_39_, 65536);
					method210(i_35_ - 1, i_39_, 4096);
				}
				if (i == 1) {
					method210(i_35_, i_39_, 1024);
					method210(i_35_, 1 + i_39_, 16384);
				}
				if (i == 2) {
					method210(i_35_, i_39_, 4096);
					method210(i_35_ - -1, i_39_, 65536);
				}
				if (i == 3) {
					method210(i_35_, i_39_, 16384);
					method210(i_35_, i_39_ - 1, 1024);
				}
			}
			if (i_36_ == 1 || i_36_ == 3) {
				if (i == 0) {
					method210(i_35_, i_39_, 512);
					method210(-1 + i_35_, 1 + i_39_, 8192);
				}
				if (i == 1) {
					method210(i_35_, i_39_, 2048);
					method210(i_35_ - -1, i_39_ - -1, 32768);
				}
				if (i == 2) {
					method210(i_35_, i_39_, 8192);
					method210(i_35_ + 1, -1 + i_39_, 512);
				}
				if (i == 3) {
					method210(i_35_, i_39_, 32768);
					method210(i_35_ - 1, i_39_ + -1, 2048);
				}
			}
			if (i_36_ == 2) {
				if (i == 0) {
					method210(i_35_, i_39_, 66560);
					method210(-1 + i_35_, i_39_, 4096);
					method210(i_35_, i_39_ - -1, 16384);
				}
				if (i == 1) {
					method210(i_35_, i_39_, 5120);
					method210(i_35_, 1 + i_39_, 16384);
					method210(1 + i_35_, i_39_, 65536);
				}
				if (i == 2) {
					method210(i_35_, i_39_, 20480);
					method210(i_35_ - -1, i_39_, 65536);
					method210(i_35_, i_39_ + -1, 1024);
				}
				if (i == 3) {
					method210(i_35_, i_39_, 81920);
					method210(i_35_, -1 + i_39_, 1024);
					method210(-1 + i_35_, i_39_, 4096);
				}
			}
		}
		if (bool) {
			if (i_36_ == 0) {
				if (i == 0) {
					method210(i_35_, i_39_, 536870912);
					method210(-1 + i_35_, i_39_, 33554432);
				}
				if (i == 1) {
					method210(i_35_, i_39_, 8388608);
					method210(i_35_, i_39_ + 1, 134217728);
				}
				if (i == 2) {
					method210(i_35_, i_39_, 33554432);
					method210(1 + i_35_, i_39_, 536870912);
				}
				if (i == 3) {
					method210(i_35_, i_39_, 134217728);
					method210(i_35_, i_39_ - 1, 8388608);
				}
			}
			if (i_36_ == 1 || i_36_ == 3) {
				if (i == 0) {
					method210(i_35_, i_39_, 4194304);
					method210(-1 + i_35_, 1 + i_39_, 67108864);
				}
				if (i == 1) {
					method210(i_35_, i_39_, 16777216);
					method210(1 + i_35_, i_39_ - -1, 268435456);
				}
				if (i == 2) {
					method210(i_35_, i_39_, 67108864);
					method210(1 + i_35_, -1 + i_39_, 4194304);
				}
				if (i == 3) {
					method210(i_35_, i_39_, 268435456);
					method210(-1 + i_35_, i_39_ - 1, 16777216);
				}
			}
			if (i_36_ == 2) {
				if (i == 0) {
					method210(i_35_, i_39_, 545259520);
					method210(i_35_ + -1, i_39_, 33554432);
					method210(i_35_, 1 + i_39_, 134217728);
				}
				if (i == 1) {
					method210(i_35_, i_39_, 41943040);
					method210(i_35_, 1 + i_39_, 134217728);
					method210(1 + i_35_, i_39_, 536870912);
				}
				if (i == 2) {
					method210(i_35_, i_39_, 167772160);
					method210(i_35_ + 1, i_39_, 536870912);
					method210(i_35_, i_39_ - 1, 8388608);
				}
				if (i == 3) {
					method210(i_35_, i_39_, 671088640);
					method210(i_35_, i_39_ - 1, 8388608);
					method210(i_35_ + -1, i_39_, 33554432);
				}
			}
		}
	}

	final boolean method216(final int i, final int i_40_, final int i_41_, final int i_42_, final int i_43_, final int i_44_, final int i_45_, final int i_46_, final int i_47_) {
		if (i_42_ > 1) {
			if (WallLocation.method2443(i, i_44_, i_45_, i_42_, i_43_, i_46_, i_47_, i_42_)) {
				return true;
			}
			return method224(i_45_, i_42_, i_47_, i_46_, i_42_, i, i_44_, i_41_, i_43_);
		}
		final int i_48_ = -1 + i_43_ + i_45_;
		final int i_49_ = i_44_ + i_46_ + -1;
		if (i_47_ >= i_44_ && i_49_ >= i_47_ && i_43_ <= i && i <= i_48_) {
			return true;
		}
		if (i_44_ + i_40_ == i_47_ && i_43_ <= i && i <= i_48_ && (0x8 & this.collisionFlags[-xOffset + i_47_][i + -zOffset]) == 0 && (0x8 & i_41_) == 0) {
			return true;
		}
		if (i_47_ == 1 + i_49_ && i >= i_43_ && i <= i_48_ && (0x80 & this.collisionFlags[i_47_ + -xOffset][i + -zOffset]) == 0 && (i_41_ & 0x2) == 0) {
			return true;
		}
		if (-1 + i_43_ == i && i_44_ <= i_47_ && i_47_ <= i_49_ && (0x2 & this.collisionFlags[-xOffset + i_47_][i + -zOffset]) == 0 && (i_41_ & 0x4) == 0) {
			return true;
		}
		if (i == i_48_ + 1 && i_47_ >= i_44_ && i_47_ <= i_49_ && (this.collisionFlags[i_47_ - xOffset][-zOffset + i] & 0x20) == 0 && (0x1 & i_41_) == 0) {
			return true;
		}
		return false;
	}

	static final void method218(final int i_50_, final long[] ls, final int i_51_, final int[] is) {
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
			method218(i_53_ - 1, ls, i_51_, is);
			method218(i_50_, ls, i_53_ - -1, is);
		}
	}

	final void method219(int x, int z, final boolean bool, final boolean bool_59_, final int i_61_, final int i_62_) {
		x -= xOffset;
		z -= zOffset;
		if (i_61_ == 0) {
			if (i_62_ == 0) {
				addFlag(x, z, 128);
				addFlag(x - 1, z, 8);
			}
			if (i_62_ == 1) {
				addFlag(x, z, 2);
				addFlag(x, z + 1, 32);
			}
			if (i_62_ == 2) {
				addFlag(x, z, 8);
				addFlag(x + 1, z, 128);
			}
			if (i_62_ == 3) {
				addFlag(x, z, 32);
				addFlag(x, -1 + z, 2);
			}
		}
		if (i_61_ == 1 || i_61_ == 3) {
			if (i_62_ == 0) {
				addFlag(x, z, 1);
				addFlag(-1 + x, z - -1, 16);
			}
			if (i_62_ == 1) {
				addFlag(x, z, 4);
				addFlag(x - -1, z - -1, 64);
			}
			if (i_62_ == 2) {
				addFlag(x, z, 16);
				addFlag(1 + x, z + -1, 1);
			}
			if (i_62_ == 3) {
				addFlag(x, z, 64);
				addFlag(-1 + x, z + -1, 4);
			}
		}
		if (i_61_ == 2) {
			if (i_62_ == 0) {
				addFlag(x, z, 130);
				addFlag(x - 1, z, 8);
				addFlag(x, 1 + z, 32);
			}
			if (i_62_ == 1) {
				addFlag(x, z, 10);
				addFlag(x, 1 + z, 32);
				addFlag(x + 1, z, 128);
			}
			if (i_62_ == 2) {
				addFlag(x, z, 40);
				addFlag(x + 1, z, 128);
				addFlag(x, z + -1, 2);
			}
			if (i_62_ == 3) {
				addFlag(x, z, 160);
				addFlag(x, -1 + z, 2);
				addFlag(x + -1, z, 8);
			}
		}
		if (bool) {
			if (i_61_ == 0) {
				if (i_62_ == 0) {
					addFlag(x, z, 65536);
					addFlag(-1 + x, z, 4096);
				}
				if (i_62_ == 1) {
					addFlag(x, z, 1024);
					addFlag(x, z - -1, 16384);
				}
				if (i_62_ == 2) {
					addFlag(x, z, 4096);
					addFlag(x + 1, z, 65536);
				}
				if (i_62_ == 3) {
					addFlag(x, z, 16384);
					addFlag(x, -1 + z, 1024);
				}
			}
			if (i_61_ == 1 || i_61_ == 3) {
				if (i_62_ == 0) {
					addFlag(x, z, 512);
					addFlag(-1 + x, 1 + z, 8192);
				}
				if (i_62_ == 1) {
					addFlag(x, z, 2048);
					addFlag(x - -1, z - -1, 32768);
				}
				if (i_62_ == 2) {
					addFlag(x, z, 8192);
					addFlag(x - -1, -1 + z, 512);
				}
				if (i_62_ == 3) {
					addFlag(x, z, 32768);
					addFlag(-1 + x, z - 1, 2048);
				}
			}
			if (i_61_ == 2) {
				if (i_62_ == 0) {
					addFlag(x, z, 66560);
					addFlag(x + -1, z, 4096);
					addFlag(x, z - -1, 16384);
				}
				if (i_62_ == 1) {
					addFlag(x, z, 5120);
					addFlag(x, 1 + z, 16384);
					addFlag(1 + x, z, 65536);
				}
				if (i_62_ == 2) {
					addFlag(x, z, 20480);
					addFlag(1 + x, z, 65536);
					addFlag(x, -1 + z, 1024);
				}
				if (i_62_ == 3) {
					addFlag(x, z, 81920);
					addFlag(x, z - 1, 1024);
					addFlag(-1 + x, z, 4096);
				}
			}
		}
		if (bool_59_) {
			if (i_61_ == 0) {
				if (i_62_ == 0) {
					addFlag(x, z, 536870912);
					addFlag(-1 + x, z, 33554432);
				}
				if (i_62_ == 1) {
					addFlag(x, z, 8388608);
					addFlag(x, 1 + z, 134217728);
				}
				if (i_62_ == 2) {
					addFlag(x, z, 33554432);
					addFlag(1 + x, z, 536870912);
				}
				if (i_62_ == 3) {
					addFlag(x, z, 134217728);
					addFlag(x, -1 + z, 8388608);
				}
			}
			if (i_61_ == 1 || i_61_ == 3) {
				if (i_62_ == 0) {
					addFlag(x, z, 4194304);
					addFlag(-1 + x, 1 + z, 67108864);
				}
				if (i_62_ == 1) {
					addFlag(x, z, 16777216);
					addFlag(x - -1, 1 + z, 268435456);
				}
				if (i_62_ == 2) {
					addFlag(x, z, 67108864);
					addFlag(x + 1, -1 + z, 4194304);
				}
				if (i_62_ == 3) {
					addFlag(x, z, 268435456);
					addFlag(x + -1, z + -1, 16777216);
				}
			}
			if (i_61_ == 2) {
				if (i_62_ == 0) {
					addFlag(x, z, 545259520);
					addFlag(x - 1, z, 33554432);
					addFlag(x, 1 + z, 134217728);
				}
				if (i_62_ == 1) {
					addFlag(x, z, 41943040);
					addFlag(x, 1 + z, 134217728);
					addFlag(x - -1, z, 536870912);
				}
				if (i_62_ == 2) {
					addFlag(x, z, 167772160);
					addFlag(x + 1, z, 536870912);
					addFlag(x, -1 + z, 8388608);
				}
				if (i_62_ == 3) {
					addFlag(x, z, 671088640);
					addFlag(x, z + -1, 8388608);
					addFlag(-1 + x, z, 33554432);
				}
			}
		}
	}

	final boolean method220(int i, final int i_63_, int i_64_, int i_65_, int i_67_, final int i_68_, final int i_69_) {
		if (i_68_ == 1) {
			if (i_67_ == i_65_ && i == i_64_) {
				return true;
			}
		} else if (i_65_ <= i_67_ && i_67_ <= i_65_ + i_68_ - 1 && i >= i && i <= i_68_ + i - 1) {
			return true;
		}
		i -= zOffset;
		i_67_ -= xOffset;
		i_64_ -= zOffset;
		i_65_ -= xOffset;
		if (i_68_ != 1) {
			final int i_70_ = i_65_ - (-i_68_ - -1);
			final int i_71_ = i_68_ + i_64_ - 1;
			if (i_69_ == 0) {
				if (i_63_ == 0) {
					if (i_67_ - i_68_ == i_65_ && i_64_ <= i && i_71_ >= i) {
						return true;
					}
					if (i_67_ >= i_65_ && i_67_ <= i_70_ && i - -1 == i_64_ && (this.collisionFlags[i_67_][i_64_] & 0x2c0120) == 0) {
						return true;
					}
					if (i_67_ >= i_65_ && i_67_ <= i_70_ && -i_68_ + i == i_64_ && (this.collisionFlags[i_67_][i_71_] & 0x2c0102) == 0) {
						return true;
					}
				} else if (i_63_ != 1) {
					if (i_63_ != 2) {
						if (i_63_ == 3) {
							if (i_65_ <= i_67_ && i_70_ >= i_67_ && i_64_ == -i_68_ + i) {
								return true;
							}
							if (i_65_ == -i_68_ + i_67_ && i_64_ <= i && i_71_ >= i && (0x2c0108 & this.collisionFlags[i_70_][i]) == 0) {
								return true;
							}
							if (i_67_ - -1 == i_65_ && i_64_ <= i && i_71_ >= i && (0x2c0180 & this.collisionFlags[i_65_][i]) == 0) {
								return true;
							}
						}
					} else {
						if (i_65_ == 1 + i_67_ && i_64_ <= i && i_71_ >= i) {
							return true;
						}
						if (i_67_ >= i_65_ && i_67_ <= i_70_ && i_64_ == i - -1 && (0x2c0120 & this.collisionFlags[i_67_][i_64_]) == 0) {
							return true;
						}
						if (i_67_ >= i_65_ && i_67_ <= i_70_ && i_64_ == i - i_68_ && (this.collisionFlags[i_67_][i_71_] & 0x2c0102) == 0) {
							return true;
						}
					}
				} else {
					if (i_65_ <= i_67_ && i_67_ <= i_70_ && 1 + i == i_64_) {
						return true;
					}
					if (-i_68_ + i_67_ == i_65_ && i_64_ <= i && i <= i_71_ && (0x2c0108 & this.collisionFlags[i_70_][i]) == 0) {
						return true;
					}
					if (i_67_ + 1 == i_65_ && i_64_ <= i && i <= i_71_ && (this.collisionFlags[i_65_][i] & 0x2c0180) == 0) {
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
								if (i_67_ >= i_65_ && i_67_ <= i_70_ && 1 + i == i_64_ && (0x2c0120 & this.collisionFlags[i_67_][i_64_]) == 0) {
									return true;
								}
								if (1 + i_67_ == i_65_ && i_64_ <= i && i <= i_71_ && (this.collisionFlags[i_65_][i] & 0x2c0180) == 0) {
									return true;
								}
								if (i_67_ >= i_65_ && i_70_ >= i_67_ && i_64_ == -i_68_ + i) {
									return true;
								}
							}
						} else {
							if (i_65_ == i_67_ + -i_68_ && i_64_ <= i && i_71_ >= i && (0x2c0108 & this.collisionFlags[i_70_][i]) == 0) {
								return true;
							}
							if (i_65_ <= i_67_ && i_67_ <= i_70_ && 1 + i == i_64_ && (this.collisionFlags[i_67_][i_64_] & 0x2c0120) == 0) {
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
						if (i_65_ == -i_68_ + i_67_ && i >= i_64_ && i <= i_71_ && (this.collisionFlags[i_70_][i] & 0x2c0108) == 0) {
							return true;
						}
						if (i_65_ <= i_67_ && i_67_ <= i_70_ && 1 + i == i_64_) {
							return true;
						}
						if (i_65_ == i_67_ - -1 && i_64_ <= i && i <= i_71_) {
							return true;
						}
						if (i_65_ <= i_67_ && i_70_ >= i_67_ && i_64_ == -i_68_ + i && (this.collisionFlags[i_67_][i_71_] & 0x2c0102) == 0) {
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
					if (i_65_ == i_67_ + 1 && i >= i_64_ && i_71_ >= i && (this.collisionFlags[i_65_][i] & 0x2c0180) == 0) {
						return true;
					}
					if (i_65_ <= i_67_ && i_70_ >= i_67_ && i_64_ == -i_68_ + i && (this.collisionFlags[i_67_][i_71_] & 0x2c0102) == 0) {
						return true;
					}
				}
			}
			if (i_69_ == 9) {
				if (i_67_ >= i_65_ && i_70_ >= i_67_ && i - -1 == i_64_ && (this.collisionFlags[i_67_][i_64_] & 0x2c0120) == 0) {
					return true;
				}
				if (i_65_ <= i_67_ && i_70_ >= i_67_ && -i_68_ + i == i_64_ && (this.collisionFlags[i_67_][i_71_] & 0x2c0102) == 0) {
					return true;
				}
				if (i_67_ + -i_68_ == i_65_ && i >= i_64_ && i <= i_71_ && (this.collisionFlags[i_70_][i] & 0x2c0108) == 0) {
					return true;
				}
				if (i_67_ + 1 == i_65_ && i >= i_64_ && i <= i_71_ && (0x2c0180 & this.collisionFlags[i_65_][i]) == 0) {
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
						if (i_65_ == i_67_ + -1 && i == i_64_ && (this.collisionFlags[i_65_][i_64_] & 0x2c0108) == 0) {
							return true;
						}
						if (i_65_ == 1 + i_67_ && i == i_64_ && (this.collisionFlags[i_65_][i_64_] & 0x2c0180) == 0) {
							return true;
						}
					} else if (i_63_ != 2) {
						if (i_63_ == 3) {
							if (i_67_ == i_65_ && -1 + i == i_64_) {
								return true;
							}
							if (i_65_ == -1 + i_67_ && i == i_64_ && (0x2c0108 & this.collisionFlags[i_65_][i_64_]) == 0) {
								return true;
							}
							if (i_67_ + 1 == i_65_ && i == i_64_ && (0x2c0180 & this.collisionFlags[i_65_][i_64_]) == 0) {
								return true;
							}
						}
					} else {
						if (i_65_ == i_67_ + 1 && i_64_ == i) {
							return true;
						}
						if (i_67_ == i_65_ && i_64_ == i - -1 && (this.collisionFlags[i_65_][i_64_] & 0x2c0120) == 0) {
							return true;
						}
						if (i_67_ == i_65_ && -1 + i == i_64_ && (this.collisionFlags[i_65_][i_64_] & 0x2c0102) == 0) {
							return true;
						}
					}
				} else {
					if (i_65_ == i_67_ + -1 && i_64_ == i) {
						return true;
					}
					if (i_67_ == i_65_ && i_64_ == i + 1 && (this.collisionFlags[i_65_][i_64_] & 0x2c0120) == 0) {
						return true;
					}
					if (i_67_ == i_65_ && i_64_ == i + -1 && (this.collisionFlags[i_65_][i_64_] & 0x2c0102) == 0) {
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
					if (i_65_ == i_67_ + 1 && i == i_64_ && (0x2c0180 & this.collisionFlags[i_65_][i_64_]) == 0) {
						return true;
					}
					if (i_65_ == i_67_ && i_64_ == i + -1 && (this.collisionFlags[i_65_][i_64_] & 0x2c0102) == 0) {
						return true;
					}
				} else if (i_63_ != 1) {
					if (i_63_ == 2) {
						if (-1 + i_67_ == i_65_ && i == i_64_ && (this.collisionFlags[i_65_][i_64_] & 0x2c0108) == 0) {
							return true;
						}
						if (i_65_ == i_67_ && 1 + i == i_64_ && (0x2c0120 & this.collisionFlags[i_65_][i_64_]) == 0) {
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
						if (i_67_ == i_65_ && i_64_ == 1 + i && (this.collisionFlags[i_65_][i_64_] & 0x2c0120) == 0) {
							return true;
						}
						if (i_65_ == i_67_ - -1 && i_64_ == i && (0x2c0180 & this.collisionFlags[i_65_][i_64_]) == 0) {
							return true;
						}
						if (i_65_ == i_67_ && i_64_ == i - 1) {
							return true;
						}
					}
				} else {
					if (i_67_ + -1 == i_65_ && i == i_64_ && (0x2c0108 & this.collisionFlags[i_65_][i_64_]) == 0) {
						return true;
					}
					if (i_65_ == i_67_ && i_64_ == 1 + i) {
						return true;
					}
					if (i_67_ + 1 == i_65_ && i == i_64_) {
						return true;
					}
					if (i_67_ == i_65_ && i + -1 == i_64_ && (0x2c0102 & this.collisionFlags[i_65_][i_64_]) == 0) {
						return true;
					}
				}
			}
			if (i_69_ == 9) {
				if (i_65_ == i_67_ && 1 + i == i_64_ && (0x20 & this.collisionFlags[i_65_][i_64_]) == 0) {
					return true;
				}
				if (i_67_ == i_65_ && -1 + i == i_64_ && (this.collisionFlags[i_65_][i_64_] & 0x2) == 0) {
					return true;
				}
				if (-1 + i_67_ == i_65_ && i_64_ == i && (this.collisionFlags[i_65_][i_64_] & 0x8) == 0) {
					return true;
				}
				if (i_65_ == i_67_ - -1 && i_64_ == i && (0x80 & this.collisionFlags[i_65_][i_64_]) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	final boolean method221(int i_72_, int i_73_, int i_74_, int i_75_) {
		if (i_74_ == i_75_ && i_73_ == i_72_) {
			return true;
		}
		i_72_ -= zOffset;
		i_74_ -= xOffset;
		if (i_74_ < 0 || width <= i_74_ || i_72_ < 0 || height <= i_72_) {
			return false;
		}
		i_75_ -= xOffset;
		i_73_ -= zOffset;
		if (i_75_ < 0 || i_75_ >= width || i_73_ < 0 || height <= i_73_) {
			return false;
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
						if ((this.collisionFlags[i_75_][i_73_] & 0x2c0108) != 0) {
							return false;
						}
						i_75_++;
					} else if (i_75_ > i_74_) {
						if ((this.collisionFlags[i_75_][i_73_] & 0x2c0180) == 0) {
							i_75_--;
						} else {
							return false;
						}
					}
					i_78_ += i_79_;
					if (-65537 >= (i_78_ ^ 0xffffffff)) {
						i_78_ -= 65536;
						if (i_72_ > i_73_) {
							if ((this.collisionFlags[i_75_][i_73_] & 0x2c0102) == 0) {
								i_73_++;
							} else {
								return false;
							}
						} else if (i_73_ > i_72_) {
							if ((0x2c0120 & this.collisionFlags[i_75_][i_73_]) != 0) {
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
							if ((0x2c0120 & this.collisionFlags[i_75_][i_73_]) == 0) {
								i_73_--;
							} else {
								return false;
							}
						}
					} else if ((0x2c0102 & this.collisionFlags[i_75_][i_73_]) == 0) {
						i_73_++;
					} else {
						return false;
					}
					i_81_ += i_80_;
					if (65536 <= i_81_) {
						i_81_ -= 65536;
						if (i_74_ > i_75_) {
							if ((this.collisionFlags[i_75_][i_73_] & 0x2c0108) != 0) {
								return false;
							}
							i_75_++;
						} else if (i_75_ > i_74_) {
							if ((this.collisionFlags[i_75_][i_73_] & 0x2c0180) != 0) {
								break;
							}
							i_75_--;
						}
					}
				}
				return false;
			}
		} while (false);
		if ((0x240100 & this.collisionFlags[i_74_][i_72_]) != 0) {
			return false;
		}
		return true;
	}

	static final void decodeObjectMap(final boolean underwater, final byte[] data, final int baseZ, final int baseX, final CollisionMap[] collisionMaps) {
		final Buffer buffer = new Buffer(data);
		int locationId = -1;
		for (;;) {
			final int val1 = buffer.method1100();
			if (val1 == 0) {
				break;
			}
			locationId += val1;
			int positionInfo = 0;
			for (;;) {
				final int val2 = buffer.getUSmart();
				if (val2 == 0) {
					break;
				}
				positionInfo += val2 - 1;
				final int x = 0x3f & positionInfo >> 6;
				final int z = 0x3f & positionInfo;
				final int level = positionInfo >> 12;
				final int renderInfo = buffer.getUByte();
				final int rotation = renderInfo & 0x3;
				final int type = renderInfo >> 2;
				final int posX = x + baseX;
				final int posZ = z + baseZ;
				if (posX > 0 && posZ > 0 && posX < 103 && posZ < 103) {
					CollisionMap collisionMap = null;
					if (!underwater) {
						int transformedLevel = level;
						if ((0x2 & Class114.tileSettings[1][posX][posZ]) == 2) {
							transformedLevel--;
						}
						if (transformedLevel >= 0) {
							collisionMap = collisionMaps[transformedLevel];
						}
					}
					Class93.spawnLocation(rotation, level, locationId, level, posX, underwater, posZ, collisionMap, !underwater, type);
				}
			}
		}
	}

	final boolean method223(int i, int i_97_, int i_98_, int i_100_, final int i_101_, int i_102_, final int i_103_) {
		if (i_103_ != 1) {
			if (i_97_ <= i && i <= -1 + i_97_ - -i_103_ && i_98_ <= i_98_ && -1 + i_103_ + i_98_ >= i_98_) {
				return true;
			}
		} else if (i_97_ == i && i_98_ == i_100_) {
			return true;
		}
		i_100_ -= zOffset;
		i_97_ -= xOffset;
		i -= xOffset;
		i_98_ -= zOffset;
		if (i_103_ != 1) {
			final int i_104_ = i_97_ - -i_103_ - 1;
			final int i_105_ = i_100_ + i_103_ - 1;
			if (i_101_ == 6 || i_101_ == 7) {
				if (i_101_ == 7) {
					i_102_ = 2 + i_102_ & 0x3;
				}
				if (i_102_ == 0) {
					if (i_97_ == i - -1 && i_98_ >= i_100_ && i_98_ <= i_105_ && (0x80 & this.collisionFlags[i_97_][i_98_]) == 0) {
						return true;
					}
					if (i >= i_97_ && i_104_ >= i && i_100_ == i_98_ + -i_103_ && (0x2 & this.collisionFlags[i][i_105_]) == 0) {
						return true;
					}
				} else if (i_102_ == 1) {
					if (i_97_ == i + -i_103_ && i_98_ >= i_100_ && i_98_ <= i_105_ && (this.collisionFlags[i_104_][i_98_] & 0x8) == 0) {
						return true;
					}
					if (i_97_ <= i && i_104_ >= i && i_100_ == i_98_ + -i_103_ && (this.collisionFlags[i][i_105_] & 0x2) == 0) {
						return true;
					}
				} else if (i_102_ != 2) {
					if (i_102_ == 3) {
						if (i_97_ == 1 + i && i_98_ >= i_100_ && i_105_ >= i_98_ && (this.collisionFlags[i_97_][i_98_] & 0x80) == 0) {
							return true;
						}
						if (i >= i_97_ && i_104_ >= i && i_98_ - -1 == i_100_ && (0x20 & this.collisionFlags[i][i_100_]) == 0) {
							return true;
						}
					}
				} else {
					if (i_97_ == -i_103_ + i && i_100_ <= i_98_ && i_98_ <= i_105_ && (0x8 & this.collisionFlags[i_104_][i_98_]) == 0) {
						return true;
					}
					if (i >= i_97_ && i <= i_104_ && i_100_ == 1 + i_98_ && (0x20 & this.collisionFlags[i][i_100_]) == 0) {
						return true;
					}
				}
			}
			if (i_101_ == 8) {
				if (i_97_ <= i && i <= i_104_ && 1 + i_98_ == i_100_ && (this.collisionFlags[i][i_100_] & 0x20) == 0) {
					return true;
				}
				if (i_97_ <= i && i <= i_104_ && -i_103_ + i_98_ == i_100_ && (0x2 & this.collisionFlags[i][i_105_]) == 0) {
					return true;
				}
				if (-i_103_ + i == i_97_ && i_98_ >= i_100_ && i_98_ <= i_105_ && (this.collisionFlags[i_104_][i_98_] & 0x8) == 0) {
					return true;
				}
				if (i + 1 == i_97_ && i_98_ >= i_100_ && i_105_ >= i_98_ && (0x80 & this.collisionFlags[i_97_][i_98_]) == 0) {
					return true;
				}
			}
		} else {
			if (i_101_ == 6 || i_101_ == 7) {
				if (i_101_ == 7) {
					i_102_ = 0x3 & 2 + i_102_;
				}
				if (i_102_ == 0) {
					if (i - -1 == i_97_ && i_98_ == i_100_ && (0x80 & this.collisionFlags[i_97_][i_100_]) == 0) {
						return true;
					}
					if (i == i_97_ && i_98_ - 1 == i_100_ && (0x2 & this.collisionFlags[i_97_][i_100_]) == 0) {
						return true;
					}
				} else if (i_102_ != 1) {
					if (i_102_ != 2) {
						if (i_102_ == 3) {
							if (1 + i == i_97_ && i_98_ == i_100_ && (this.collisionFlags[i_97_][i_100_] & 0x80) == 0) {
								return true;
							}
							if (i_97_ == i && i_100_ == 1 + i_98_ && (this.collisionFlags[i_97_][i_100_] & 0x20) == 0) {
								return true;
							}
						}
					} else {
						if (i - 1 == i_97_ && i_98_ == i_100_ && (0x8 & this.collisionFlags[i_97_][i_100_]) == 0) {
							return true;
						}
						if (i == i_97_ && i_100_ == i_98_ - -1 && (0x20 & this.collisionFlags[i_97_][i_100_]) == 0) {
							return true;
						}
					}
				} else {
					if (-1 + i == i_97_ && i_100_ == i_98_ && (0x8 & this.collisionFlags[i_97_][i_100_]) == 0) {
						return true;
					}
					if (i_97_ == i && i_100_ == i_98_ + -1 && (this.collisionFlags[i_97_][i_100_] & 0x2) == 0) {
						return true;
					}
				}
			}
			if (i_101_ == 8) {
				if (i == i_97_ && i_100_ == 1 + i_98_ && (this.collisionFlags[i_97_][i_100_] & 0x20) == 0) {
					return true;
				}
				if (i_97_ == i && i_98_ - 1 == i_100_ && (0x2 & this.collisionFlags[i_97_][i_100_]) == 0) {
					return true;
				}
				if (i + -1 == i_97_ && i_98_ == i_100_ && (0x8 & this.collisionFlags[i_97_][i_100_]) == 0) {
					return true;
				}
				if (i_97_ == 1 + i && i_100_ == i_98_ && (this.collisionFlags[i_97_][i_100_] & 0x80) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	private final boolean method224(final int i, final int i_106_, final int i_107_, final int i_108_, final int i_110_, final int i_111_, final int i_112_, final int i_113_, final int i_114_) {
		final int i_115_ = i_110_ + i_107_;
		final int i_116_ = i_112_ + i_108_;
		final int i_117_ = i_106_ + i_111_;
		final int i_118_ = i_114_ + i;
		if (i_116_ == i_107_ && (0x2 & i_113_) == 0) {
			int i_119_ = i_111_ <= i_114_ ? i_114_ : i_111_;
			for (final int i_120_ = i_118_ <= i_117_ ? i_118_ : i_117_; i_120_ > i_119_; i_119_++) {
				if ((0x8 & this.collisionFlags[-xOffset + i_116_ + -1][-zOffset + i_119_]) == 0) {
					return true;
				}
			}
		} else if (i_115_ != i_112_ || (i_113_ & 0x8) != 0) {
			if (i_118_ == i_111_ && (0x1 & i_113_) == 0) {
				int i_121_ = i_107_ > i_112_ ? i_107_ : i_112_;
				for (final int i_122_ = i_116_ <= i_115_ ? i_116_ : i_115_; i_122_ > i_121_; i_121_++) {
					if ((0x2 & this.collisionFlags[-xOffset + i_121_][-1 + i_118_ - zOffset]) == 0) {
						return true;
					}
				}
			} else if (i_117_ == i_114_ && (i_113_ & 0x4) == 0) {
				final int i_123_ = i_116_ > i_115_ ? i_115_ : i_116_;
				for (int i_124_ = i_107_ <= i_112_ ? i_112_ : i_107_; i_124_ < i_123_; i_124_++) {
					if ((this.collisionFlags[-xOffset + i_124_][-zOffset + i_114_] & 0x20) == 0) {
						return true;
					}
				}
			}
		} else {
			int i_125_ = i_111_ > i_114_ ? i_111_ : i_114_;
			for (final int i_126_ = i_117_ >= i_118_ ? i_118_ : i_117_; i_126_ > i_125_; i_125_++) {
				if ((this.collisionFlags[-xOffset + i_112_][i_125_ + -zOffset] & 0x80) == 0) {
					return true;
				}
			}
		}
		return false;
	}

	final void resetFlags() {
		for (int x = 0; x < width; x++) {
			for (int y = 0; y < height; y++) {
				if (x != 0 && y != 0 && width - 5 > x && y < height - 5) {
					this.collisionFlags[x][y] = 0x200000;
				} else {
					this.collisionFlags[x][y] = 0xffffff;
				}
			}
		}
	}

	final void addRangableFlag(int x, int z) {
		x -= xOffset;
		z -= zOffset;
		this.collisionFlags[x][z] |= 0x200000;
	}

	private final void addFlag(final int x, final int z, final int flag) {
		this.collisionFlags[x][z] |= flag;
	}

	final void method228(int x, int z) {
		x -= xOffset;
		z -= zOffset;
		this.collisionFlags[x][z] = Class120_Sub12_Sub3.method1207(this.collisionFlags[x][z], -262145);
	}

	CollisionMap(final int w, final int h) {
		width = w;
		height = h;
		zOffset = 0;
		xOffset = 0;
		collisionFlags = new int[width][height];
		resetFlags();
	}
}
