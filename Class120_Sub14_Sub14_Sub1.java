/* Class120_Sub14_Sub14_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class120_Sub14_Sub14_Sub1 extends Class120_Sub14_Sub14 {
	static int[] anIntArray3926;
	int anInt3927;
	static Deque aClass105_3928;
	static Class98 aClass98_3929;
	static AbstractSprite[] prayerIconSprites;
	byte[] aByteArray3931;
	static short aShort3932 = 32767;
	static int[][] anIntArrayArray3933;
	static int brightness;
	FileSystem aClass51_3935;

	static {
		anIntArray3926 = new int[50];
		brightness = 3;
		aClass105_3928 = new Deque();
	}

	public static void method1543(final int i) {
		try {
			anIntArrayArray3933 = null;
			aClass98_3929 = null;
			if (i <= -23) {
				prayerIconSprites = null;
				aClass105_3928 = null;
				anIntArray3926 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("al.B(").append(i).append(')').toString());
		}
	}

	static final void method1544(final int id, final int value) {
		Class30.anIntArray239[id] = value;
		Class120_Sub3 class120_sub3 = (Class120_Sub3) Class69_Sub3_Sub1.aClass75_3079.get(id);
		if (class120_sub3 == null) {
			class120_sub3 = new Class120_Sub3(4611686018427387905L);
			Class69_Sub3_Sub1.aClass75_3079.put(class120_sub3, id);
		} else if (-4611686018427387906L != (class120_sub3.aLong2425 ^ 0xffffffffffffffffL)) {
			class120_sub3.aLong2425 = TimeUtil.getSafeTime() + 500L | 0x4000000000000000L;
		}
	}

	@Override
	final int method1537(final int i) {
		int i_2_;
		try {
			if (this.aBoolean3576) {
				return 0;
			}
			i_2_ = 100;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("al.G(").append(i).append(')').toString());
		}
		return i_2_;
	}

	static final void method1545(final int i, final boolean bool_3_, final boolean bool_4_) {
		for (int i_5_ = 0; i_5_ < Class148.localNpcCount; i_5_++) {
			final Npc class180_sub5_sub2 = Class120_Sub12_Sub11.npcList[Class120_Sub12_Sub36.localNpcIndices[i_5_]];
			if (class180_sub5_sub2 != null && class180_sub5_sub2.isVisible() && class180_sub5_sub2.npcType.method2199()) {
				final int size = class180_sub5_sub2.getSize();
				if (bool_4_) {
					if (!class180_sub5_sub2.npcType.aBoolean1706) {
						continue;
					}
				} else if (!class180_sub5_sub2.npcType.aBoolean1656 == bool_3_ || i != 0 && i != size) {
					continue;
				}
				if (size != 1) {
					if (((0x1 & size) != 0 || (0x7f & class180_sub5_sub2.x) == 0 && (class180_sub5_sub2.z & 0x7f) == 0) && ((size & 0x1) != 1 || (0x7f & class180_sub5_sub2.x) == 64 && (class180_sub5_sub2.z & 0x7f) == 64)) {
						int i_7_ = class180_sub5_sub2.x - 64 * size >> 7;
						int i_8_ = class180_sub5_sub2.z - size * 64 >> 7;
						int i_9_ = class180_sub5_sub2.getSize() + i_7_;
						if (i_9_ > 104) {
							i_9_ = 104;
						}
						if (i_7_ < 0) {
							i_7_ = 0;
						}
						int i_10_ = i_8_ - -class180_sub5_sub2.getSize();
						if (i_10_ > 104) {
							i_10_ = 104;
						}
						if (i_8_ < 0) {
							i_8_ = 0;
						}
						for (int i_11_ = i_7_; i_11_ < i_9_; i_11_++) {
							for (int i_12_ = i_8_; i_12_ < i_10_; i_12_++) {
								anIntArrayArray3933[i_11_][i_12_]++;
							}
						}
					}
				} else if ((0x7f & class180_sub5_sub2.x) == 64 && (class180_sub5_sub2.z & 0x7f) == 64) {
					final int i_13_ = class180_sub5_sub2.z >> 7;
					final int i_14_ = class180_sub5_sub2.x >> 7;
					if (i_14_ >= 0 && i_14_ < 104 && i_13_ >= 0 && i_13_ < 104) {
						anIntArrayArray3933[i_14_][i_13_]++;
					}
				}
			}
		}
		for (int i_15_ = 0; i_15_ < Class148.localNpcCount; i_15_++) {
			final Npc class180_sub5_sub2 = Class120_Sub12_Sub11.npcList[Class120_Sub12_Sub36.localNpcIndices[i_15_]];
			long l = 0x20000000L | (long) Class120_Sub12_Sub36.localNpcIndices[i_15_] << 32;
			if (class180_sub5_sub2 != null && class180_sub5_sub2.isVisible() && class180_sub5_sub2.npcType.method2199()) {
				final int i_16_ = class180_sub5_sub2.getSize();
				if (bool_4_) {
					if (!class180_sub5_sub2.npcType.aBoolean1706) {
						continue;
					}
				} else if (bool_3_ != class180_sub5_sub2.npcType.aBoolean1656 || i != 0 && i != i_16_) {
					continue;
				}
				class180_sub5_sub2.aBoolean2992 = true;
				if (i_16_ == 1) {
					if ((0x7f & class180_sub5_sub2.x) == 64 && (class180_sub5_sub2.z & 0x7f) == 64) {
						final int i_17_ = class180_sub5_sub2.x >> 7;
						final int i_18_ = class180_sub5_sub2.z >> 7;
						if (i_17_ < 0 || i_17_ >= 104 || i_18_ < 0 || i_18_ >= 104) {
							continue;
						}
						if (anIntArrayArray3933[i_17_][i_18_] > 1) {
							anIntArrayArray3933[i_17_][i_18_]--;
							continue;
						}
					}
				} else if ((0x1 & i_16_) == 0 && (0x7f & class180_sub5_sub2.x) == 0 && (class180_sub5_sub2.z & 0x7f) == 0 || (i_16_ & 0x1) == 1 && (class180_sub5_sub2.x & 0x7f) == 64 && (0x7f & class180_sub5_sub2.z) == 64) {
					int i_19_ = class180_sub5_sub2.x - 64 * i_16_ >> 7;
					int i_20_ = -(64 * i_16_) + class180_sub5_sub2.z >> 7;
					int i_21_ = i_16_ + i_19_;
					int i_22_ = i_16_ + i_20_;
					if (i_22_ > 104) {
						i_22_ = 104;
					}
					if (i_19_ < 0) {
						i_19_ = 0;
					}
					if (i_20_ < 0) {
						i_20_ = 0;
					}
					boolean bool_23_ = true;
					if (i_21_ > 104) {
						i_21_ = 104;
					}
					for (int i_24_ = i_19_; i_21_ > i_24_; i_24_++) {
						for (int i_25_ = i_20_; i_25_ < i_22_; i_25_++) {
							if (anIntArrayArray3933[i_24_][i_25_] <= 1) {
								bool_23_ = false;
								break;
							}
						}
					}
					if (bool_23_) {
						for (int i_26_ = i_19_; i_26_ < i_21_; i_26_++) {
							for (int i_27_ = i_20_; i_27_ < i_22_; i_27_++) {
								anIntArrayArray3933[i_26_][i_27_]--;
							}
						}
						continue;
					}
				}
				if (!class180_sub5_sub2.npcType.aBoolean1688) {
					l |= ~0x7fffffffffffffffL;
				}
				class180_sub5_sub2.aBoolean2992 = false;
				class180_sub5_sub2.anInt3005 = Class22.getTileHeight(Class173.gameLevel, class180_sub5_sub2.x, class180_sub5_sub2.z);
				Class120_Sub12_Sub5.method1218(Class173.gameLevel, class180_sub5_sub2.x, class180_sub5_sub2.z, class180_sub5_sub2.anInt3005, 60 + i_16_ * 64 + -64, class180_sub5_sub2, class180_sub5_sub2.anInt3032, l, class180_sub5_sub2.aBoolean3002);
			}
		}
	}

	static final void method1546(final int i, final boolean bool, final int i_28_, final byte i_29_) {
		try {
			if (i_28_ < 8000 || -48001 > (i_28_ ^ 0xffffffff)) {
				throw new IllegalArgumentException();
			}
			Class120_Sub14_Sub13.anInt3569 = i;
			Class90.aBoolean846 = bool;
			Class178.anInt1771 = i_28_;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("al.A(").append(i).append(',').append(bool).append(',').append(i_28_).append(',').append(i_29_).append(')').toString());
		}
	}

	public Class120_Sub14_Sub14_Sub1() {
		/* empty */
	}

	@Override
	final byte[] method1535(final byte i) {
		byte[] is;
		try {
			if (i != -90) {
				return null;
			}
			if (this.aBoolean3576) {
				throw new RuntimeException();
			}
			is = this.aByteArray3931;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("al.C(").append(i).append(')').toString());
		}
		return is;
	}
}
