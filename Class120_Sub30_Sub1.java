/* Class120_Sub30_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class120_Sub30_Sub1 extends Class120_Sub30 {
	static short[][] aShortArrayArray3668;
	Deque aClass105_3669 = new Deque();
	private final Class120_Sub30_Sub2 aClass120_Sub30_Sub2_3670;
	static int anInt3671 = 2;
	static int anInt3672;
	static boolean aBoolean3673;
	static float aFloat3674;
	Class120_Sub30_Sub3 aClass120_Sub30_Sub3_3675 = new Class120_Sub30_Sub3();
	static boolean manyGroundTextures = true;

	static {
		aBoolean3673 = false;
	}

	static final void method1738(final int i, final Player class180_sub5_sub1) {
		try {
			final Class120_Sub8 class120_sub8 = (Class120_Sub8) Npc.aClass75_3750.get(Class70.stringToLong(class180_sub5_sub1.name));
			if (class120_sub8 != null) {
				class120_sub8.method1156(-77);
			} else {
				Class7.method106(128, null, class180_sub5_sub1.anIntArray2958[0], null, class180_sub5_sub1.anIntArray3040[0], class180_sub5_sub1, 0, Class173.gameLevel);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("bn.I(").append(i).append(',').append(class180_sub5_sub1 != null ? "{...}" : "null").append(')').toString());
		}
	}

	static final void method1739(final boolean bool, final byte i) {
		try {
			Class90.anInt848 = 0;
			Class73.aClass105_653 = null;
			Class79.aByteArrayArrayArray707 = null;
			if (!bool || Class79.aClass120_Sub14_Sub22_691 == null) {
				Class85.anInt802 = -1;
			} else {
				Class85.anInt802 = Class79.aClass120_Sub14_Sub22_691.anInt3634;
			}
			Class142.aClass189_1362 = null;
			Class79.anIntArray715 = null;
			Class79.anIntArrayArrayArray702 = null;
			Class79.aByteArrayArrayArray703 = null;
			Class79.aByteArrayArrayArray711 = null;
			Class79.anIntArrayArrayArray713 = null;
			Class79.aByteArrayArrayArray706 = null;
			if (i == -93) {
				Class79.aByteArrayArrayArray710 = null;
				Class79.aClass120_Sub14_Sub22_691 = null;
				Class79.aClass177_690.clear();
				Class112.aClass98_1070 = null;
				OverridedJInterface.aClass98_2739 = null;
				Class120_Sub14_Sub14_Sub1.aClass98_3929 = null;
				Class124.aClass98_1201 = null;
				PlayerAppearance.aClass98_1373 = null;
				Class116.aClass120_Sub14_Sub19_1114 = null;
				CanvasWrapper.anInt20 = -1;
				Class79.aClass137_693 = null;
				Class167_Sub1.aClass98_2833 = null;
				Class101_Sub3.aClass120_Sub14_Sub19_Sub2_2290 = null;
				Class110.aClass98_1052 = null;
				Class92.aClass98_863 = null;
				Class120_Sub2.anInt2422 = -1;
				Class120_Sub16.method1658(i ^ 0x3a);
				Class22.aClass127_130 = null;
				Class86.aClass75_823 = null;
				Class81.aClass75_777 = null;
				Class43.method338(128, 64, -61);
				Class52.method453(64, (byte) 119);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("bn.C(").append(bool).append(',').append(i).append(')').toString());
		}
	}

	@Override
	final void method1731(final int i) {
		try {
			this.aClass120_Sub30_Sub3_3675.method1731(i);
			Class120_Sub6 class120_sub6 = (Class120_Sub6) this.aClass105_3669.getFront();
			while_211_: for (/**/; class120_sub6 != null; class120_sub6 = (Class120_Sub6) this.aClass105_3669.getNext()) {
				if (!aClass120_Sub30_Sub2_3670.method1760(37, class120_sub6)) {
					int i_0_ = i;
					while_209_: do {
						do {
							if (class120_sub6.anInt2466 >= i_0_) {
								break while_209_;
							}
							method1741(-1, class120_sub6.anInt2466, class120_sub6);
							i_0_ -= class120_sub6.anInt2466;
						} while (!aClass120_Sub30_Sub2_3670.method1775(class120_sub6, 0, i_0_, -109, null));
						continue while_211_;
					} while (false);
					method1741(-1, i_0_, class120_sub6);
					class120_sub6.anInt2466 -= i_0_;
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("bn.E(").append(i).append(')').toString());
		}
	}

	private final void method1740(int i, final Class120_Sub6 class120_sub6, int i_1_, final int[] is, final int i_2_, final byte i_3_) {
		try {
			if ((aClass120_Sub30_Sub2_3670.anIntArray3692[class120_sub6.anInt2465] & 0x4) != 0 && class120_sub6.anInt2453 < 0) {
				final int i_4_ = aClass120_Sub30_Sub2_3670.anIntArray3678[class120_sub6.anInt2465] / Class178.anInt1771;
				for (;;) {
					final int i_5_ = (-class120_sub6.anInt2458 + 1048575 - -i_4_) / i_4_;
					if (i < i_5_) {
						break;
					}
					class120_sub6.aClass120_Sub30_Sub4_2446.method1734(is, i_1_, i_5_);
					i_1_ += i_5_;
					final int i_6_ = 262144 / i_4_;
					final Class120_Sub30_Sub4 class120_sub30_sub4 = class120_sub6.aClass120_Sub30_Sub4_2446;
					int i_7_ = Class178.anInt1771 / 100;
					i -= i_5_;
					if (i_7_ > i_6_) {
						i_7_ = i_6_;
					}
					class120_sub6.anInt2458 += i_4_ * i_5_ - 1048576;
					if (aClass120_Sub30_Sub2_3670.anIntArray3683[class120_sub6.anInt2465] != 0) {
						class120_sub6.aClass120_Sub30_Sub4_2446 = Class120_Sub30_Sub4.method1820(class120_sub6.aClass120_Sub5_Sub1_2447, class120_sub30_sub4.method1804(), 0, class120_sub30_sub4.method1824());
						aClass120_Sub30_Sub2_3670.method1771(class120_sub6, (byte) 70, class120_sub6.aClass120_Sub22_2459.aShortArray2680[class120_sub6.anInt2460] < 0);
						class120_sub6.aClass120_Sub30_Sub4_2446.method1815(i_7_, class120_sub30_sub4.method1817());
					} else {
						class120_sub6.aClass120_Sub30_Sub4_2446 = Class120_Sub30_Sub4.method1820(class120_sub6.aClass120_Sub5_Sub1_2447, class120_sub30_sub4.method1804(), class120_sub30_sub4.method1817(), class120_sub30_sub4.method1824());
					}
					if (class120_sub6.aClass120_Sub22_2459.aShortArray2680[class120_sub6.anInt2460] < 0) {
						class120_sub6.aClass120_Sub30_Sub4_2446.method1795(-1);
					}
					class120_sub30_sub4.method1796(i_7_);
					class120_sub30_sub4.method1734(is, i_1_, i_2_ + -i_1_);
					if (class120_sub30_sub4.method1808()) {
						this.aClass120_Sub30_Sub3_3675.method1787(class120_sub30_sub4);
					}
				}
				class120_sub6.anInt2458 += i_4_ * i;
			}
			if (i_3_ < 50) {
				manyGroundTextures = false;
			}
			class120_sub6.aClass120_Sub30_Sub4_2446.method1734(is, i_1_, i);
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception,
					new StringBuilder("bn.G(").append(i).append(',').append(class120_sub6 != null ? "{...}" : "null").append(',').append(i_1_).append(',').append(is != null ? "{...}" : "null").append(',').append(i_2_).append(',').append(i_3_).append(')').toString());
		}
	}

	@Override
	final Class120_Sub30 method1736() {
		Class120_Sub30 class120_sub30;
		try {
			final Class120_Sub6 class120_sub6 = (Class120_Sub6) this.aClass105_3669.getFront();
			if (class120_sub6 == null) {
				return null;
			}
			if (class120_sub6.aClass120_Sub30_Sub4_2446 != null) {
				return class120_sub6.aClass120_Sub30_Sub4_2446;
			}
			class120_sub30 = method1735();
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, "bn.P()");
		}
		return class120_sub30;
	}

	@Override
	final Class120_Sub30 method1735() {
		Class120_Sub30_Sub4 class120_sub30_sub4;
		try {
			Class120_Sub6 class120_sub6;
			do {
				class120_sub6 = (Class120_Sub6) this.aClass105_3669.getNext();
				if (class120_sub6 == null) {
					return null;
				}
			} while (class120_sub6.aClass120_Sub30_Sub4_2446 == null);
			class120_sub30_sub4 = class120_sub6.aClass120_Sub30_Sub4_2446;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, "bn.O()");
		}
		return class120_sub30_sub4;
	}

	@Override
	final void method1734(final int[] is, final int i, final int i_8_) {
		try {
			this.aClass120_Sub30_Sub3_3675.method1734(is, i, i_8_);
			Class120_Sub6 class120_sub6 = (Class120_Sub6) this.aClass105_3669.getFront();
			while_213_: for (/**/; class120_sub6 != null; class120_sub6 = (Class120_Sub6) this.aClass105_3669.getNext()) {
				if (!aClass120_Sub30_Sub2_3670.method1760(102, class120_sub6)) {
					int i_9_ = i;
					int i_10_ = i_8_;
					while (class120_sub6.anInt2466 < i_10_) {
						method1740(class120_sub6.anInt2466, class120_sub6, i_9_, is, i_9_ - -i_10_, (byte) 72);
						i_10_ -= class120_sub6.anInt2466;
						i_9_ += class120_sub6.anInt2466;
						if (aClass120_Sub30_Sub2_3670.method1775(class120_sub6, i_9_, i_10_, -45, is)) {
							continue while_213_;
						}
					}
					method1740(i_10_, class120_sub6, i_9_, is, i_10_ + i_9_, (byte) 127);
					class120_sub6.anInt2466 -= i_10_;
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("bn.D(").append(is != null ? "{...}" : "null").append(',').append(i).append(',').append(i_8_).append(')').toString());
		}
	}

	private final void method1741(final int i, int i_11_, final Class120_Sub6 class120_sub6) {
		try {
			if (i != (0x4 & aClass120_Sub30_Sub2_3670.anIntArray3692[class120_sub6.anInt2465] ^ 0xffffffff) && class120_sub6.anInt2453 < 0) {
				final int i_12_ = aClass120_Sub30_Sub2_3670.anIntArray3678[class120_sub6.anInt2465] / Class178.anInt1771;
				final int i_13_ = (-class120_sub6.anInt2458 + i_12_ + 1048575) / i_12_;
				class120_sub6.anInt2458 = 0xfffff & i_12_ * i_11_ + class120_sub6.anInt2458;
				if (i_11_ >= i_13_) {
					if (aClass120_Sub30_Sub2_3670.anIntArray3683[class120_sub6.anInt2465] != 0) {
						class120_sub6.aClass120_Sub30_Sub4_2446 = Class120_Sub30_Sub4.method1820(class120_sub6.aClass120_Sub5_Sub1_2447, class120_sub6.aClass120_Sub30_Sub4_2446.method1804(), 0, class120_sub6.aClass120_Sub30_Sub4_2446.method1824());
						aClass120_Sub30_Sub2_3670.method1771(class120_sub6, (byte) 93, class120_sub6.aClass120_Sub22_2459.aShortArray2680[class120_sub6.anInt2460] < 0);
					} else {
						class120_sub6.aClass120_Sub30_Sub4_2446 = Class120_Sub30_Sub4.method1820(class120_sub6.aClass120_Sub5_Sub1_2447, class120_sub6.aClass120_Sub30_Sub4_2446.method1804(), class120_sub6.aClass120_Sub30_Sub4_2446.method1817(), class120_sub6.aClass120_Sub30_Sub4_2446.method1824());
					}
					if (class120_sub6.aClass120_Sub22_2459.aShortArray2680[class120_sub6.anInt2460] < 0) {
						class120_sub6.aClass120_Sub30_Sub4_2446.method1795(-1);
					}
					i_11_ = class120_sub6.anInt2458 / i_12_;
				}
			}
			class120_sub6.aClass120_Sub30_Sub4_2446.method1731(i_11_);
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("bn.B(").append(i).append(',').append(i_11_).append(',').append(class120_sub6 != null ? "{...}" : "null").append(')').toString());
		}
	}

	public static void method1742(final int i) {
		try {
			if (i != 1970740129) {
				method1739(false, (byte) 82);
			}
			aShortArrayArray3668 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("bn.A(").append(i).append(')').toString());
		}
	}

	@Override
	final int method1732() {
		int i;
		try {
			i = 0;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, "bn.F()");
		}
		return i;
	}

	static final void method1743(final int i, final int i_14_, final int i_15_, final int i_16_, final int i_17_, final int i_18_, final int i_19_, final int i_20_) {
		try {
			int i_21_ = 0;
			int i_22_ = i_20_;
			final int i_23_ = i_18_ + -i_15_;
			int i_24_ = i;
			final int i_25_ = -i_15_ + i_20_;
			final int i_26_ = i_18_ * i_18_;
			final int i_27_ = i_20_ * i_20_;
			final int i_28_ = i_23_ * i_23_;
			final int i_29_ = i_25_ * i_25_;
			final int i_30_ = i_27_ << 1;
			final int i_31_ = i_29_ << 1;
			final int i_32_ = i_26_ << 1;
			final int i_33_ = i_28_ << 1;
			final int i_34_ = i_20_ << 1;
			final int i_35_ = i_25_ << 1;
			int i_36_ = i_26_ * (-i_34_ + 1) - -i_30_;
			int i_37_ = -(i_32_ * (i_34_ + -1)) + i_27_;
			int i_38_ = i_31_ + (1 + -i_35_) * i_28_;
			int i_39_ = -(i_33_ * (-1 + i_35_)) + i_29_;
			final int i_40_ = i_26_ << 2;
			final int i_41_ = i_27_ << 2;
			final int i_42_ = i_29_ << 2;
			final int i_43_ = i_28_ << 2;
			int i_44_ = i_30_ * 3;
			int i_45_ = i_32_ * (-3 + i_34_);
			int i_46_ = 3 * i_31_;
			int i_47_ = i_41_;
			int i_48_ = (i_35_ + -3) * i_33_;
			int i_49_ = i_42_;
			int i_50_ = (i_20_ - 1) * i_40_;
			int i_51_ = i_43_ * (-1 + i_25_);
			final int[] is = GameEntity.anIntArrayArray3009[i_17_];
			Class120_Sub8.method1160((byte) 115, is, i_16_, i_14_ - i_18_, -i_23_ + i_14_);
			Class120_Sub8.method1160((byte) 115, is, i_19_, -i_23_ + i_14_, i_23_ + i_14_);
			Class120_Sub8.method1160((byte) 115, is, i_16_, i_23_ + i_14_, i_14_ - -i_18_);
			while (i_22_ > 0) {
				if (i_36_ < 0) {
					while (i_36_ < 0) {
						i_36_ += i_44_;
						i_44_ += i_41_;
						i_21_++;
						i_37_ += i_47_;
						i_47_ += i_41_;
					}
				}
				if (i_37_ < 0) {
					i_36_ += i_44_;
					i_37_ += i_47_;
					i_44_ += i_41_;
					i_21_++;
					i_47_ += i_41_;
				}
				i_36_ += -i_50_;
				final int i_52_ = -i_21_ + i_14_;
				final boolean bool = i_25_ >= i_22_;
				final int i_53_ = i_14_ - -i_21_;
				i_50_ -= i_40_;
				i_22_--;
				i_37_ += -i_45_;
				final int i_54_ = i_22_ + i_17_;
				i_45_ -= i_40_;
				if (bool) {
					if (i_38_ < 0) {
						while (i_38_ < 0) {
							i_24_++;
							i_39_ += i_49_;
							i_38_ += i_46_;
							i_49_ += i_42_;
							i_46_ += i_42_;
						}
					}
					if (i_39_ < 0) {
						i_38_ += i_46_;
						i_46_ += i_42_;
						i_24_++;
						i_39_ += i_49_;
						i_49_ += i_42_;
					}
					i_39_ += -i_48_;
					i_38_ += -i_51_;
					i_51_ -= i_43_;
					i_48_ -= i_43_;
				}
				final int i_55_ = i_17_ - i_22_;
				if (bool) {
					final int i_56_ = i_14_ - i_24_;
					Class120_Sub8.method1160((byte) 115, GameEntity.anIntArrayArray3009[i_55_], i_16_, i_52_, i_56_);
					final int i_57_ = i_14_ - -i_24_;
					Class120_Sub8.method1160((byte) 115, GameEntity.anIntArrayArray3009[i_55_], i_19_, i_56_, i_57_);
					Class120_Sub8.method1160((byte) 115, GameEntity.anIntArrayArray3009[i_55_], i_16_, i_57_, i_53_);
					Class120_Sub8.method1160((byte) 115, GameEntity.anIntArrayArray3009[i_54_], i_16_, i_52_, i_56_);
					Class120_Sub8.method1160((byte) 115, GameEntity.anIntArrayArray3009[i_54_], i_19_, i_56_, i_57_);
					Class120_Sub8.method1160((byte) 115, GameEntity.anIntArrayArray3009[i_54_], i_16_, i_57_, i_53_);
				} else {
					Class120_Sub8.method1160((byte) 115, GameEntity.anIntArrayArray3009[i_55_], i_16_, i_52_, i_53_);
					Class120_Sub8.method1160((byte) 115, GameEntity.anIntArrayArray3009[i_54_], i_16_, i_52_, i_53_);
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("bn.H(").append(i).append(',').append(i_14_).append(',').append(i_15_).append(',').append(i_16_).append(',').append(i_17_).append(',').append(i_18_).append(',').append(i_19_).append(',').append(i_20_).append(')')
					.toString());
		}
	}

	Class120_Sub30_Sub1(final Class120_Sub30_Sub2 class120_sub30_sub2) {
		aClass120_Sub30_Sub2_3670 = class120_sub30_sub2;
	}
}
