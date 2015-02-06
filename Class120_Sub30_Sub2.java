/* Class120_Sub30_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class120_Sub30_Sub2 extends Class120_Sub30 {
	private final int[] anIntArray3677 = new int[16];
	int[] anIntArray3678;
	static String aString3679 = "Loading - please wait.";
	private final int[] anIntArray3680;
	private final int[] anIntArray3681;
	private final int[] anIntArray3682;
	int[] anIntArray3683;
	private final int[] anIntArray3684;
	private final Class120_Sub6[][] aClass120_Sub6ArrayArray3685 = new Class120_Sub6[16][128];
	private int anInt3686;
	private int[] anIntArray3687;
	static int anInt3688;
	private final int[] anIntArray3689;
	private final int[] anIntArray3690;
	private int[] anIntArray3691;
	int[] anIntArray3692;
	private int[] anIntArray3693;
	private final int[] anIntArray3694;
	private final Hashtable aClass75_3695;
	private final int[] anIntArray3696;
	private int[] anIntArray3697;
	private final int anInt3698;
	static int anInt3699 = 0;
	private final Class120_Sub6[][] aClass120_Sub6ArrayArray3700;
	private Class62 aClass62_3701;
	private long aLong3702;
	private long aLong3703;
	private int anInt3704;
	private boolean aBoolean3705;
	private int anInt3706;
	private final Class120_Sub30_Sub1 aClass120_Sub30_Sub1_3707;
	private Class120_Sub31 aClass120_Sub31_3708;
	private int anInt3709;
	private boolean aBoolean3710;

	private final void method1744(final int i, final int i_0_, final int i_1_) {
		try {
			anIntArray3690[i] = i_0_;
			anIntArray3680[i] = Class120_Sub12_Sub3.method1207(i_0_, -128);
			if (i_1_ == -16257) {
				method1762(-1148, i, i_0_);
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("ld.S(").append(i).append(',').append(i_0_).append(',').append(i_1_).append(')').toString());
		}
	}

	private final int method1745(final Class120_Sub6 class120_sub6, final int i) {
		int i_2_;
		try {
			if (anIntArray3697[class120_sub6.anInt2465] == 0) {
				return 0;
			}
			int i_3_ = 4096 + anIntArray3684[class120_sub6.anInt2465] * anIntArray3694[class120_sub6.anInt2465] >> 13;
			i_3_ = i_3_ * i_3_ + 16384 >> 15;
			final Class157 class157 = class120_sub6.aClass157_2462;
			i_3_ = i_3_ * class120_sub6.anInt2457 + 16384 >> 15;
			i_3_ = anInt3686 * i_3_ - -128 >> 8;
			i_3_ = 128 + i_3_ * anIntArray3697[class120_sub6.anInt2465] >> 8;
			if (class157.anInt1463 > 0) {
				i_3_ = (int) (i_3_ * Math.pow(0.5, class120_sub6.anInt2467 * 1.953125E-5 * class157.anInt1463) + 0.5);
			}
			if (class157.aByteArray1471 != null) {
				int i_4_ = class157.aByteArray1471[class120_sub6.anInt2463 - -1];
				final int i_5_ = class120_sub6.anInt2454;
				if (class120_sub6.anInt2463 < -2 + class157.aByteArray1471.length) {
					final int i_6_ = class157.aByteArray1471[class120_sub6.anInt2463] << 8 & 0xff00;
					final int i_7_ = (0xff & class157.aByteArray1471[2 + class120_sub6.anInt2463]) << 8;
					i_4_ += (-i_6_ + i_5_) * (-i_4_ + class157.aByteArray1471[3 + class120_sub6.anInt2463]) / (-i_6_ + i_7_);
				}
				i_3_ = i_4_ * i_3_ - -32 >> 6;
			}
			if (class120_sub6.anInt2453 > 0 && class157.aByteArray1468 != null) {
				final int i_8_ = class120_sub6.anInt2453;
				int i_9_ = class157.aByteArray1468[class120_sub6.anInt2464 - -1];
				if (class120_sub6.anInt2464 < class157.aByteArray1468.length + -2) {
					final int i_10_ = 0xff00 & class157.aByteArray1468[class120_sub6.anInt2464] << 8;
					final int i_11_ = (0xff & class157.aByteArray1468[2 + class120_sub6.anInt2464]) << 8;
					i_9_ += (-i_9_ + class157.aByteArray1468[class120_sub6.anInt2464 - -3]) * (-i_10_ + i_8_) / (i_11_ - i_10_);
				}
				i_3_ = 32 + i_9_ * i_3_ >> 6;
			}
			if (i != 2) {
				return 80;
			}
			i_2_ = i_3_;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("ld.R(").append(class120_sub6 != null ? "{...}" : "null").append(',').append(i).append(')').toString());
		}
		return i_2_;
	}

	private final void method1746(final int i, final int i_12_, final int i_13_) {
		try {
			if (i != -2) {
				method1736();
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("ld.HA(").append(i).append(',').append(i_12_).append(',').append(i_13_).append(')').toString());
		}
	}

	private final synchronized void method1747(final int i, final int i_14_, final int i_15_) {
		do {
			try {
				if (i < 0) {
					for (int i_16_ = 0; i_16_ < 16; i_16_++) {
						anIntArray3697[i_16_] = i_14_;
					}
				} else {
					anIntArray3697[i] = i_14_;
				}
				if (i_15_ > -113) {
					break;
				}
			} catch (final RuntimeException runtimeexception) {
				throw EnumType.method1428(runtimeexception, new StringBuilder("ld.PA(").append(i).append(',').append(i_14_).append(',').append(i_15_).append(')').toString());
			}
		} while (false);
	}

	final synchronized void method1748(final int i_17_) {
		anInt3686 = i_17_;
	}

	private final int method1749(final Class120_Sub6 class120_sub6, final int i) {
		int i_18_;
		try {
			if (i != 16384) {
				aClass62_3701 = null;
			}
			final int i_19_ = anIntArray3689[class120_sub6.anInt2465];
			if (i_19_ >= 8192) {
				return -((-i_19_ + 16384) * (-class120_sub6.anInt2456 + 128) + 32 >> 6) + 16384;
			}
			i_18_ = 32 + i_19_ * class120_sub6.anInt2456 >> 6;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("ld.FA(").append(class120_sub6 != null ? "{...}" : "null").append(',').append(i).append(')').toString());
		}
		return i_18_;
	}

	private final void method1750(final byte i, final int i_20_) {
		try {
			if ((0x4 & this.anIntArray3692[i_20_]) != 0) {
				for (Class120_Sub6 class120_sub6 = (Class120_Sub6) aClass120_Sub30_Sub1_3707.aClass105_3669.getFront(); class120_sub6 != null; class120_sub6 = (Class120_Sub6) aClass120_Sub30_Sub1_3707.aClass105_3669.getNext()) {
					if (class120_sub6.anInt2465 == i_20_) {
						class120_sub6.anInt2458 = 0;
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("ld.H(").append(i).append(',').append(i_20_).append(')').toString());
		}
	}

	private final void method1751(final int i, final byte i_21_) {
		try {
			if (i_21_ != -117) {
				method1756(99, 40, 70);
			}
			if ((this.anIntArray3692[i] & 0x2) != 0) {
				for (Class120_Sub6 class120_sub6 = (Class120_Sub6) aClass120_Sub30_Sub1_3707.aClass105_3669.getFront(); class120_sub6 != null; class120_sub6 = (Class120_Sub6) aClass120_Sub30_Sub1_3707.aClass105_3669.getNext()) {
					if (i == class120_sub6.anInt2465 && aClass120_Sub6ArrayArray3700[i][class120_sub6.anInt2460] == null && class120_sub6.anInt2453 < 0) {
						class120_sub6.anInt2453 = 0;
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("ld.C(").append(i).append(',').append(i_21_).append(')').toString());
		}
	}

	private final synchronized void method1752(final boolean bool, final int i, final Class120_Sub31 class120_sub31, final boolean bool_22_) {
		try {
			method1779(bool_22_);
			aClass62_3701.method559(class120_sub31.aByteArray2785);
			aLong3702 = 0L;
			aBoolean3705 = bool;
			final int i_23_ = aClass62_3701.method566();
			for (int i_24_ = i; i_24_ < i_23_; i_24_++) {
				aClass62_3701.method561(i_24_);
				aClass62_3701.method557(i_24_);
				aClass62_3701.method568(i_24_);
			}
			anInt3704 = aClass62_3701.method564();
			anInt3706 = aClass62_3701.anIntArray572[anInt3704];
			aLong3703 = aClass62_3701.method555(anInt3706);
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("ld.V(").append(bool).append(',').append(i).append(',').append(class120_sub31 != null ? "{...}" : "null").append(',').append(bool_22_).append(')').toString());
		}
	}

	final synchronized void method1753() {
		for (Class120_Sub22 class120_sub22 = (Class120_Sub22) aClass75_3695.getFirst(); class120_sub22 != null; class120_sub22 = (Class120_Sub22) aClass75_3695.getNext()) {
			class120_sub22.unlink();
		}
	}

	@Override
	final synchronized void method1731(int i) {
		try {
			if (aClass62_3701.method562()) {
				final int i_25_ = aClass62_3701.anInt571 * anInt3698 / Class178.anInt1771;
				do {
					final long l = aLong3702 + (long) i * (long) i_25_;
					if (-l + aLong3703 >= 0L) {
						aLong3702 = l;
						break;
					}
					final int i_26_ = (int) ((-aLong3702 + aLong3703 - -(long) i_25_ - 1L) / i_25_);
					aLong3702 += (long) i_26_ * (long) i_25_;
					i -= i_26_;
					aClass120_Sub30_Sub1_3707.method1731(i_26_);
					method1767((byte) 14);
				} while (aClass62_3701.method562());
			}
			aClass120_Sub30_Sub1_3707.method1731(i);
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("ld.E(").append(i).append(')').toString());
		}
	}

	private final void method1754(final int i, final boolean bool, final int i_27_, final int i_28_) {
		try {
			method1755(-199, 64, i_28_, i_27_);
			if ((this.anIntArray3692[i_27_] & 0x2) != 0) {
				for (Class120_Sub6 class120_sub6 = (Class120_Sub6) aClass120_Sub30_Sub1_3707.aClass105_3669.getLast(); class120_sub6 != null; class120_sub6 = (Class120_Sub6) aClass120_Sub30_Sub1_3707.aClass105_3669.getPrevious()) {
					if (class120_sub6.anInt2465 == i_27_ && class120_sub6.anInt2453 < 0) {
						aClass120_Sub6ArrayArray3700[i_27_][class120_sub6.anInt2460] = null;
						aClass120_Sub6ArrayArray3700[i_27_][i_28_] = class120_sub6;
						final int i_29_ = (class120_sub6.anInt2461 * class120_sub6.anInt2451 >> 12) + class120_sub6.anInt2455;
						class120_sub6.anInt2461 = 4096;
						class120_sub6.anInt2455 += i_28_ + -class120_sub6.anInt2460 << 8;
						class120_sub6.anInt2451 = -class120_sub6.anInt2455 + i_29_;
						class120_sub6.anInt2460 = i_28_;
						return;
					}
				}
			}
			final Class120_Sub22 class120_sub22 = (Class120_Sub22) aClass75_3695.get(anIntArray3691[i_27_]);
			if (class120_sub22 != null) {
				final Class120_Sub5_Sub1 class120_sub5_sub1 = class120_sub22.aClass120_Sub5_Sub1Array2673[i_28_];
				if (class120_sub5_sub1 != null) {
					final Class120_Sub6 class120_sub6 = new Class120_Sub6();
					class120_sub6.aClass120_Sub5_Sub1_2447 = class120_sub5_sub1;
					class120_sub6.aClass120_Sub22_2459 = class120_sub22;
					if (!bool) {
						anIntArray3691 = null;
					}
					class120_sub6.anInt2465 = i_27_;
					class120_sub6.aClass157_2462 = class120_sub22.aClass157Array2676[i_28_];
					class120_sub6.anInt2445 = class120_sub22.aByteArray2671[i_28_];
					class120_sub6.anInt2460 = i_28_;
					class120_sub6.anInt2457 = 1024 + class120_sub22.aByteArray2681[i_28_] * i * (i * class120_sub22.anInt2674) >> 11;
					class120_sub6.anInt2456 = class120_sub22.aByteArray2677[i_28_] & 0xff;
					class120_sub6.anInt2455 = -(class120_sub22.aShortArray2680[i_28_] & 0x7fff) + (i_28_ << 8);
					class120_sub6.anInt2463 = 0;
					class120_sub6.anInt2464 = 0;
					class120_sub6.anInt2454 = 0;
					class120_sub6.anInt2453 = -1;
					class120_sub6.anInt2467 = 0;
					if (this.anIntArray3683[i_27_] != 0) {
						class120_sub6.aClass120_Sub30_Sub4_2446 = Class120_Sub30_Sub4.method1820(class120_sub5_sub1, method1772(1, class120_sub6), 0, method1749(class120_sub6, 16384));
						method1771(class120_sub6, (byte) 92, class120_sub22.aShortArray2680[i_28_] < 0);
					} else {
						class120_sub6.aClass120_Sub30_Sub4_2446 = Class120_Sub30_Sub4.method1820(class120_sub5_sub1, method1772(1, class120_sub6), method1745(class120_sub6, 2), method1749(class120_sub6, 16384));
					}
					if (class120_sub22.aShortArray2680[i_28_] < 0) {
						class120_sub6.aClass120_Sub30_Sub4_2446.method1795(-1);
					}
					if (class120_sub6.anInt2445 >= 0) {
						final Class120_Sub6 class120_sub6_30_ = aClass120_Sub6ArrayArray3685[i_27_][class120_sub6.anInt2445];
						if (class120_sub6_30_ != null && class120_sub6_30_.anInt2453 < 0) {
							aClass120_Sub6ArrayArray3700[i_27_][class120_sub6_30_.anInt2460] = null;
							class120_sub6_30_.anInt2453 = 0;
						}
						aClass120_Sub6ArrayArray3685[i_27_][class120_sub6.anInt2445] = class120_sub6;
					}
					aClass120_Sub30_Sub1_3707.aClass105_3669.addLast(class120_sub6);
					aClass120_Sub6ArrayArray3700[i_27_][i_28_] = class120_sub6;
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("ld.OA(").append(i).append(',').append(bool).append(',').append(i_27_).append(',').append(i_28_).append(')').toString());
		}
	}

	private final void method1755(final int i, final int i_31_, final int i_32_, final int i_33_) {
		try {
			final Class120_Sub6 class120_sub6 = aClass120_Sub6ArrayArray3700[i_33_][i_32_];
			if (class120_sub6 != null) {
				aClass120_Sub6ArrayArray3700[i_33_][i_32_] = null;
				if (i != -199) {
					aString3679 = null;
				}
				if ((0x2 & this.anIntArray3692[i_33_]) != 0) {
					for (Class120_Sub6 class120_sub6_34_ = (Class120_Sub6) aClass120_Sub30_Sub1_3707.aClass105_3669.getFront(); class120_sub6_34_ != null; class120_sub6_34_ = (Class120_Sub6) aClass120_Sub30_Sub1_3707.aClass105_3669.getNext()) {
						if (class120_sub6_34_.anInt2465 == class120_sub6.anInt2465 && class120_sub6_34_.anInt2453 < 0 && class120_sub6 != class120_sub6_34_) {
							class120_sub6.anInt2453 = 0;
							break;
						}
					}
				} else {
					class120_sub6.anInt2453 = 0;
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("ld.MA(").append(i).append(',').append(i_31_).append(',').append(i_32_).append(',').append(i_33_).append(')').toString());
		}
	}

	private final void method1756(final int i, final int i_35_, final int i_36_) {
		try {
			if (i >= -18) {
				anInt3699 = -68;
			}
			anIntArray3677[i_36_] = i_35_;
			this.anIntArray3678[i_36_] = (int) (Math.pow(2.0, i_35_ * 5.4931640625E-4) * 2097152.0 + 0.5);
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("ld.Q(").append(i).append(',').append(i_35_).append(',').append(i_36_).append(')').toString());
		}
	}

	final int method1757() {
		return anInt3686;
	}

	private final void method1758(final byte i, final int i_37_) {
		try {
			Class120_Sub6 class120_sub6 = (Class120_Sub6) aClass120_Sub30_Sub1_3707.aClass105_3669.getFront();
			if (i < 80) {
				anInt3686 = -3;
			}
			for (/**/; class120_sub6 != null; class120_sub6 = (Class120_Sub6) aClass120_Sub30_Sub1_3707.aClass105_3669.getNext()) {
				if (i_37_ < 0 || i_37_ == class120_sub6.anInt2465) {
					if (class120_sub6.aClass120_Sub30_Sub4_2446 != null) {
						class120_sub6.aClass120_Sub30_Sub4_2446.method1796(Class178.anInt1771 / 100);
						if (class120_sub6.aClass120_Sub30_Sub4_2446.method1808()) {
							aClass120_Sub30_Sub1_3707.aClass120_Sub30_Sub3_3675.method1787(class120_sub6.aClass120_Sub30_Sub4_2446);
						}
						class120_sub6.method1071(338);
					}
					if (class120_sub6.anInt2453 < 0) {
						aClass120_Sub6ArrayArray3700[class120_sub6.anInt2465][class120_sub6.anInt2460] = null;
					}
					class120_sub6.unlink();
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("ld.A(").append(i).append(',').append(i_37_).append(')').toString());
		}
	}

	private final void method1759(final boolean bool, final int i, final int i_38_, final int i_39_) {
		try {
			if (bool) {
				anIntArray3697 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("ld.L(").append(bool).append(',').append(i).append(',').append(i_38_).append(',').append(i_39_).append(')').toString());
		}
	}

	final boolean method1760(final int i, final Class120_Sub6 class120_sub6) {
		boolean bool;
		try {
			if (i <= 35) {
				anInt3699 = -17;
			}
			if (class120_sub6.aClass120_Sub30_Sub4_2446 == null) {
				if (class120_sub6.anInt2453 >= 0) {
					class120_sub6.unlink();
					if (class120_sub6.anInt2445 > 0 && class120_sub6 == aClass120_Sub6ArrayArray3685[class120_sub6.anInt2465][class120_sub6.anInt2445]) {
						aClass120_Sub6ArrayArray3685[class120_sub6.anInt2465][class120_sub6.anInt2445] = null;
					}
				}
				return true;
			}
			bool = false;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("ld.DA(").append(i).append(',').append(class120_sub6 != null ? "{...}" : "null").append(')').toString());
		}
		return bool;
	}

	private final void method1761(final int i, final boolean bool) {
		try {
			int i_40_ = 0xf0 & i;
			if (i_40_ == 128) {
				final int i_41_ = i >> 8 & 0x7f;
				final int i_42_ = 0x7f & i >> 16;
				final int i_43_ = 0xf & i;
				method1755(-199, i_42_, i_41_, i_43_);
			} else if (i_40_ == 144) {
				final int i_44_ = 0x7f & i >> 16;
				final int i_45_ = 0x7f & i >> 8;
				final int i_46_ = i & 0xf;
				if (i_44_ > 0) {
					method1754(i_44_, true, i_46_, i_45_);
				} else {
					method1755(-199, 64, i_45_, i_46_);
				}
			} else if (i_40_ == 160) {
				final int i_47_ = 0xf & i;
				final int i_48_ = 0x7f & i >> 8;
				final int i_49_ = (i & 0x7fbd7b) >> 16;
				method1759(false, i_49_, i_47_, i_48_);
			} else {
				if (!bool) {
					method1769(-110, (byte) 61);
				}
				if (i_40_ == 176) {
					final int i_50_ = (i & 0x7f10) >> 8;
					final int i_51_ = 0xf & i;
					final int i_52_ = (0x7f41bb & i) >> 16;
					if (i_50_ == 0) {
						anIntArray3680[i_51_] = Class120_Sub12_Sub3.method1207(-2080769, anIntArray3680[i_51_]) + (i_52_ << 14);
					}
					if (i_50_ == 32) {
						anIntArray3680[i_51_] = (i_52_ << 7) + Class120_Sub12_Sub3.method1207(anIntArray3680[i_51_], -16257);
					}
					if (i_50_ == 1) {
						anIntArray3687[i_51_] = (i_52_ << 7) + Class120_Sub12_Sub3.method1207(anIntArray3687[i_51_], -16257);
					}
					if (i_50_ == 33) {
						anIntArray3687[i_51_] = Class120_Sub12_Sub3.method1207(-128, anIntArray3687[i_51_]) + i_52_;
					}
					if (i_50_ == 5) {
						anIntArray3681[i_51_] = (i_52_ << 7) + Class120_Sub12_Sub3.method1207(anIntArray3681[i_51_], -16257);
					}
					if (i_50_ == 37) {
						anIntArray3681[i_51_] = i_52_ + Class120_Sub12_Sub3.method1207(-128, anIntArray3681[i_51_]);
					}
					if (i_50_ == 7) {
						anIntArray3694[i_51_] = Class120_Sub12_Sub3.method1207(anIntArray3694[i_51_], -16257) - -(i_52_ << 7);
					}
					if (i_50_ == 39) {
						anIntArray3694[i_51_] = i_52_ + Class120_Sub12_Sub3.method1207(anIntArray3694[i_51_], -128);
					}
					if (i_50_ == 10) {
						anIntArray3689[i_51_] = Class120_Sub12_Sub3.method1207(-16257, anIntArray3689[i_51_]) - -(i_52_ << 7);
					}
					if (i_50_ == 42) {
						anIntArray3689[i_51_] = Class120_Sub12_Sub3.method1207(anIntArray3689[i_51_], -128) + i_52_;
					}
					if (i_50_ == 11) {
						anIntArray3684[i_51_] = (i_52_ << 7) + Class120_Sub12_Sub3.method1207(anIntArray3684[i_51_], -16257);
					}
					if (i_50_ == 43) {
						anIntArray3684[i_51_] = Class120_Sub12_Sub3.method1207(anIntArray3684[i_51_], -128) + i_52_;
					}
					if (i_50_ == 64) {
						if (i_52_ < 64) {
							this.anIntArray3692[i_51_] = Class120_Sub12_Sub3.method1207(this.anIntArray3692[i_51_], -2);
						} else {
							this.anIntArray3692[i_51_] = Class191.method2512(this.anIntArray3692[i_51_], 1);
						}
					}
					if (i_50_ == 65) {
						if (i_52_ < 64) {
							method1751(i_51_, (byte) -117);
							this.anIntArray3692[i_51_] = Class120_Sub12_Sub3.method1207(this.anIntArray3692[i_51_], -3);
						} else {
							this.anIntArray3692[i_51_] = Class191.method2512(this.anIntArray3692[i_51_], 2);
						}
					}
					if (i_50_ == 99) {
						anIntArray3693[i_51_] = Class120_Sub12_Sub3.method1207(127, anIntArray3693[i_51_]) + (i_52_ << 7);
					}
					if (i_50_ == 98) {
						anIntArray3693[i_51_] = Class120_Sub12_Sub3.method1207(16256, anIntArray3693[i_51_]) - -i_52_;
					}
					if (i_50_ == 101) {
						anIntArray3693[i_51_] = (i_52_ << 7) + 16384 + Class120_Sub12_Sub3.method1207(127, anIntArray3693[i_51_]);
					}
					if (i_50_ == 100) {
						anIntArray3693[i_51_] = 16384 + Class120_Sub12_Sub3.method1207(anIntArray3693[i_51_], 16256) - -i_52_;
					}
					if (i_50_ == 120) {
						method1758((byte) 117, i_51_);
					}
					if (i_50_ == 121) {
						method1769(i_51_, (byte) 75);
					}
					if (i_50_ == 123) {
						method1764(-82, i_51_);
					}
					if (i_50_ == 6) {
						final int i_53_ = anIntArray3693[i_51_];
						if (i_53_ == 16384) {
							anIntArray3682[i_51_] = (i_52_ << 7) + Class120_Sub12_Sub3.method1207(-16257, anIntArray3682[i_51_]);
						}
					}
					if (i_50_ == 38) {
						final int i_54_ = anIntArray3693[i_51_];
						if (i_54_ == 16384) {
							anIntArray3682[i_51_] = Class120_Sub12_Sub3.method1207(anIntArray3682[i_51_], -128) + i_52_;
						}
					}
					if (i_50_ == 16) {
						this.anIntArray3683[i_51_] = Class120_Sub12_Sub3.method1207(-16257, this.anIntArray3683[i_51_]) - -(i_52_ << 7);
					}
					if (i_50_ == 48) {
						this.anIntArray3683[i_51_] = i_52_ + Class120_Sub12_Sub3.method1207(this.anIntArray3683[i_51_], -128);
					}
					if (i_50_ == 81) {
						if (i_52_ < 64) {
							method1750((byte) 93, i_51_);
							this.anIntArray3692[i_51_] = Class120_Sub12_Sub3.method1207(this.anIntArray3692[i_51_], -5);
						} else {
							this.anIntArray3692[i_51_] = Class191.method2512(this.anIntArray3692[i_51_], 4);
						}
					}
					if (i_50_ == 17) {
						method1756(-47, (i_52_ << 7) + (anIntArray3677[i_51_] & ~0x3f80), i_51_);
					}
					if (i_50_ == 49) {
						method1756(-71, (~0x7f & anIntArray3677[i_51_]) + i_52_, i_51_);
					}
				} else if (i_40_ == 192) {
					final int i_55_ = 0xf & i;
					final int i_56_ = i >> 8 & 0x7f;
					method1762(-1148, i_55_, i_56_ + anIntArray3680[i_55_]);
				} else if (i_40_ == 208) {
					final int i_57_ = 0xf & i;
					final int i_58_ = (i & 0x7f00) >> 8;
					method1746(-2, i_57_, i_58_);
				} else if (i_40_ == 224) {
					final int i_59_ = (i >> 9 & 0x3f80) - -((i & 0x7f2f) >> 8);
					final int i_60_ = 0xf & i;
					method1765(i_59_, (byte) -46, i_60_);
				} else {
					i_40_ = 0xff & i;
					if (i_40_ == 255) {
						method1768(0, true);
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("ld.N(").append(i).append(',').append(bool).append(')').toString());
		}
	}

	private final void method1762(final int i, final int i_61_, final int i_62_) {
		try {
			if (i != -1148) {
				aLong3702 = 12L;
			}
			if (anIntArray3691[i_61_] != i_62_) {
				anIntArray3691[i_61_] = i_62_;
				for (int i_63_ = 0; i_63_ < 128; i_63_++) {
					aClass120_Sub6ArrayArray3685[i_61_][i_63_] = null;
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("ld.RA(").append(i).append(',').append(i_61_).append(',').append(i_62_).append(')').toString());
		}
	}

	private final void method1764(final int i, final int i_66_) {
		try {
			for (Class120_Sub6 class120_sub6 = (Class120_Sub6) aClass120_Sub30_Sub1_3707.aClass105_3669.getFront(); class120_sub6 != null; class120_sub6 = (Class120_Sub6) aClass120_Sub30_Sub1_3707.aClass105_3669.getNext()) {
				if ((i_66_ < 0 || class120_sub6.anInt2465 == i_66_) && class120_sub6.anInt2453 < 0) {
					aClass120_Sub6ArrayArray3700[class120_sub6.anInt2465][class120_sub6.anInt2460] = null;
					class120_sub6.anInt2453 = 0;
				}
			}
			if (i != -82) {
				anIntArray3693 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("ld.EA(").append(i).append(',').append(i_66_).append(')').toString());
		}
	}

	private final void method1765(final int i, final byte i_67_, final int i_68_) {
		try {
			anIntArray3696[i_68_] = i;
			if (i_67_ > -33) {
				aClass62_3701 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("ld.KA(").append(i).append(',').append(i_67_).append(',').append(i_68_).append(')').toString());
		}
	}

	final synchronized boolean method1766() {
		return aClass62_3701.method562();
	}

	@Override
	final synchronized void method1734(final int[] is, int i, int i_69_) {
		try {
			if (aClass62_3701.method562()) {
				final int i_70_ = anInt3698 * aClass62_3701.anInt571 / Class178.anInt1771;
				do {
					final long l = (long) i_70_ * (long) i_69_ + aLong3702;
					if ((-l + aLong3703 ^ 0xffffffffffffffffL) <= -1L) {
						aLong3702 = l;
						break;
					}
					final int i_71_ = (int) ((-1L + i_70_ + -aLong3702 + aLong3703) / i_70_);
					i_69_ -= i_71_;
					aLong3702 += (long) i_70_ * (long) i_71_;
					aClass120_Sub30_Sub1_3707.method1734(is, i, i_71_);
					i += i_71_;
					method1767((byte) 14);
				} while (aClass62_3701.method562());
			}
			aClass120_Sub30_Sub1_3707.method1734(is, i, i_69_);
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("ld.D(").append(is != null ? "{...}" : "null").append(',').append(i).append(',').append(i_69_).append(')').toString());
		}
	}

	@Override
	final synchronized int method1732() {
		int i;
		try {
			i = 0;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, "ld.F()");
		}
		return i;
	}

	private final void method1767(final byte i) {
		try {
			int i_72_ = anInt3704;
			int i_73_ = anInt3706;
			long l = aLong3703;
			if (aClass120_Sub31_3708 != null && anInt3709 == i_73_) {
				method1752(aBoolean3705, 0, aClass120_Sub31_3708, aBoolean3710);
				method1767((byte) 14);
			} else {
				if (i != 14) {
					anIntArray3693 = null;
				}
				while (i_73_ == anInt3706) {
					while (i_73_ == aClass62_3701.anIntArray572[i_72_]) {
						aClass62_3701.method561(i_72_);
						final int i_74_ = aClass62_3701.method569(i_72_);
						if (i_74_ == 1) {
							aClass62_3701.method558();
							aClass62_3701.method568(i_72_);
							if (aClass62_3701.method563()) {
								if (aClass120_Sub31_3708 != null) {
									method1773(aBoolean3705, aClass120_Sub31_3708, (byte) 119);
									method1767((byte) 14);
									return;
								}
								if (aBoolean3705 && i_73_ != 0) {
									aClass62_3701.method560(l);
								} else {
									method1768(0, true);
									aClass62_3701.method556();
									return;
								}
							}
							break;
						}
						if ((0x80 & i_74_) != 0) {
							method1761(i_74_, true);
						}
						aClass62_3701.method557(i_72_);
						aClass62_3701.method568(i_72_);
					}
					i_72_ = aClass62_3701.method564();
					i_73_ = aClass62_3701.anIntArray572[i_72_];
					l = aClass62_3701.method555(i_73_);
				}
				aLong3703 = l;
				anInt3706 = i_73_;
				anInt3704 = i_72_;
				if (aClass120_Sub31_3708 != null && anInt3709 < i_73_) {
					anInt3704 = -1;
					anInt3706 = anInt3709;
					aLong3703 = aClass62_3701.method555(anInt3706);
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("ld.J(").append(i).append(')').toString());
		}
	}

	private final void method1768(final int i, final boolean bool) {
		try {
			if (bool) {
				method1758((byte) 98, -1);
			} else {
				method1764(-82, -1);
			}
			method1769(-1, (byte) -86);
			for (int i_75_ = i; i_75_ < 16; i_75_++) {
				anIntArray3691[i_75_] = anIntArray3690[i_75_];
			}
			for (int i_76_ = 0; i_76_ < 16; i_76_++) {
				anIntArray3680[i_76_] = Class120_Sub12_Sub3.method1207(-128, anIntArray3690[i_76_]);
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("ld.QA(").append(i).append(',').append(bool).append(')').toString());
		}
	}

	@Override
	final synchronized Class120_Sub30 method1735() {
		Class120_Sub30 class120_sub30;
		try {
			class120_sub30 = null;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, "ld.O()");
		}
		return class120_sub30;
	}

	private final void method1769(int i, final byte i_77_) {
		try {
			if (i < 0) {
				for (i = 0; i < 16; i++) {
					method1769(i, (byte) -88);
				}
			} else {
				anIntArray3694[i] = 12800;
				anIntArray3689[i] = 8192;
				anIntArray3684[i] = 16383;
				anIntArray3696[i] = 8192;
				anIntArray3687[i] = 0;
				anIntArray3681[i] = 8192;
				method1751(i, (byte) -117);
				method1750((byte) 98, i);
				this.anIntArray3692[i] = 0;
				anIntArray3693[i] = 32767;
				anIntArray3682[i] = 256;
				this.anIntArray3683[i] = 0;
				method1756(-21, 8192, i);
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("ld.IA(").append(i).append(',').append(i_77_).append(')').toString());
		}
	}

	final synchronized void method1770() {
		method1779(true);
	}

	final void method1771(final Class120_Sub6 class120_sub6, final byte i, final boolean bool) {
		try {
			int i_78_ = class120_sub6.aClass120_Sub5_Sub1_2447.aByteArray3114.length;
			int i_79_;
			if (bool && class120_sub6.aClass120_Sub5_Sub1_2447.aBoolean3117) {
				final int i_80_ = i_78_ + i_78_ - class120_sub6.aClass120_Sub5_Sub1_2447.anInt3115;
				i_79_ = (int) ((long) i_80_ * (long) this.anIntArray3683[class120_sub6.anInt2465] >> 6);
				i_78_ <<= 8;
				if (i_78_ <= i_79_) {
					class120_sub6.aClass120_Sub30_Sub4_2446.method1800(true);
					i_79_ = i_78_ + i_78_ - (1 + i_79_);
				}
			} else {
				i_79_ = (int) ((long) i_78_ * (long) this.anIntArray3683[class120_sub6.anInt2465] >> 6);
			}
			class120_sub6.aClass120_Sub30_Sub4_2446.method1805(i_79_);
			if (i < 55) {
				method1744(85, -53, -35);
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("ld.K(").append(class120_sub6 != null ? "{...}" : "null").append(',').append(i).append(',').append(bool).append(')').toString());
		}
	}

	@Override
	final synchronized Class120_Sub30 method1736() {
		Class120_Sub30_Sub1 class120_sub30_sub1;
		try {
			class120_sub30_sub1 = aClass120_Sub30_Sub1_3707;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, "ld.P()");
		}
		return class120_sub30_sub1;
	}

	private final int method1772(final int i, final Class120_Sub6 class120_sub6) {
		int i_81_;
		try {
			int i_82_ = class120_sub6.anInt2455 + (class120_sub6.anInt2461 * class120_sub6.anInt2451 >> 12);
			final Class157 class157 = class120_sub6.aClass157_2462;
			i_82_ += anIntArray3682[class120_sub6.anInt2465] * (-8192 + anIntArray3696[class120_sub6.anInt2465]) >> 12;
			if (class157.anInt1470 > 0 && (class157.anInt1460 > 0 || anIntArray3687[class120_sub6.anInt2465] > 0)) {
				int i_83_ = class157.anInt1460 << 2;
				final int i_84_ = class157.anInt1467 << 1;
				if (class120_sub6.anInt2452 < i_84_) {
					i_83_ = i_83_ * class120_sub6.anInt2452 / i_84_;
				}
				i_83_ += anIntArray3687[class120_sub6.anInt2465] >> 7;
				final double d = Math.sin(0.01227184630308513 * (0x1ff & class120_sub6.anInt2449));
				i_82_ += (int) (d * i_83_);
			}
			if (i != 1) {
				this.anIntArray3678 = null;
			}
			final int i_85_ = (int) (0.5 + 256 * class120_sub6.aClass120_Sub5_Sub1_2447.anInt3116 * Math.pow(2.0, 3.255208333333333E-4 * i_82_) / Class178.anInt1771);
			i_81_ = i_85_ < 1 ? 1 : i_85_;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("ld.I(").append(i).append(',').append(class120_sub6 != null ? "{...}" : "null").append(')').toString());
		}
		return i_81_;
	}

	final synchronized void method1773(final boolean bool, final Class120_Sub31 class120_sub31, final byte i) {
		try {
			method1752(bool, 0, class120_sub31, true);
			if (i != 119) {
				method1749(null, 124);
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("ld.SA(").append(bool).append(',').append(class120_sub31 != null ? "{...}" : "null").append(',').append(i).append(')').toString());
		}
	}

	final synchronized void method1774(final int i, final byte i_86_, final int i_87_) {
		try {
			method1744(i_87_, i, -16257);
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("ld.B(").append(i).append(',').append(i_86_).append(',').append(i_87_).append(')').toString());
		}
	}

	final boolean method1775(final Class120_Sub6 class120_sub6, final int i, final int i_88_, final int i_89_, final int[] is) {
		boolean bool;
		try {
			class120_sub6.anInt2466 = Class178.anInt1771 / 100;
			if (class120_sub6.anInt2453 >= 0 && (class120_sub6.aClass120_Sub30_Sub4_2446 == null || class120_sub6.aClass120_Sub30_Sub4_2446.method1801())) {
				class120_sub6.method1071(338);
				class120_sub6.unlink();
				if (class120_sub6.anInt2445 > 0 && aClass120_Sub6ArrayArray3685[class120_sub6.anInt2465][class120_sub6.anInt2445] == class120_sub6) {
					aClass120_Sub6ArrayArray3685[class120_sub6.anInt2465][class120_sub6.anInt2445] = null;
				}
				return true;
			}
			int i_90_ = class120_sub6.anInt2461;
			boolean bool_91_ = false;
			if (i_90_ > 0) {
				i_90_ -= (int) (Math.pow(2.0, 4.921259842519685E-4 * anIntArray3681[class120_sub6.anInt2465]) * 16.0 + 0.5);
				if (i_90_ < 0) {
					i_90_ = 0;
				}
				class120_sub6.anInt2461 = i_90_;
			}
			class120_sub6.aClass120_Sub30_Sub4_2446.method1789(method1772(1, class120_sub6));
			final double d = 5.086263020833333E-6 * ((class120_sub6.anInt2460 - 60 << 8) - -(class120_sub6.anInt2451 * class120_sub6.anInt2461 >> 12));
			final Class157 class157 = class120_sub6.aClass157_2462;
			class120_sub6.anInt2452++;
			class120_sub6.anInt2449 += class157.anInt1470;
			if (class157.anInt1463 > 0) {
				if (class157.anInt1459 > 0) {
					class120_sub6.anInt2467 += (int) (Math.pow(2.0, class157.anInt1459 * d) * 128.0 + 0.5);
				} else {
					class120_sub6.anInt2467 += 128;
				}
				if (819200 <= class157.anInt1463 * class120_sub6.anInt2467) {
					bool_91_ = true;
				}
			}
			if (class157.aByteArray1471 != null) {
				if (class157.anInt1464 > 0) {
					class120_sub6.anInt2454 += (int) (128.0 * Math.pow(2.0, class157.anInt1464 * d) + 0.5);
				} else {
					class120_sub6.anInt2454 += 128;
				}
				for (/**/; class157.aByteArray1471.length + -2 > class120_sub6.anInt2463 && (class157.aByteArray1471[class120_sub6.anInt2463 + 2] & 0xff) << 8 < class120_sub6.anInt2454; class120_sub6.anInt2463 += 2) {
					/* empty */
				}
				if (class157.aByteArray1471.length + -2 == class120_sub6.anInt2463 && class157.aByteArray1471[class120_sub6.anInt2463 + 1] == 0) {
					bool_91_ = true;
				}
			}
			if (class120_sub6.anInt2453 >= 0 && class157.aByteArray1468 != null && (this.anIntArray3692[class120_sub6.anInt2465] & 0x1) == 0 && (class120_sub6.anInt2445 < 0 || aClass120_Sub6ArrayArray3685[class120_sub6.anInt2465][class120_sub6.anInt2445] != class120_sub6)) {
				if (class157.anInt1473 <= 0) {
					class120_sub6.anInt2453 += 128;
				} else {
					class120_sub6.anInt2453 += (int) (128.0 * Math.pow(2.0, d * class157.anInt1473) + 0.5);
				}
				for (/**/; class157.aByteArray1468.length - 2 > class120_sub6.anInt2464 && class120_sub6.anInt2453 > (class157.aByteArray1468[class120_sub6.anInt2464 - -2] << 8 & 0xff00); class120_sub6.anInt2464 += 2) {
					/* empty */
				}
				if (class157.aByteArray1468.length + -2 == class120_sub6.anInt2464) {
					bool_91_ = true;
				}
			}
			if (bool_91_) {
				class120_sub6.aClass120_Sub30_Sub4_2446.method1796(class120_sub6.anInt2466);
				if (is == null) {
					class120_sub6.aClass120_Sub30_Sub4_2446.method1731(i_88_);
				} else {
					class120_sub6.aClass120_Sub30_Sub4_2446.method1734(is, i, i_88_);
				}
				if (class120_sub6.aClass120_Sub30_Sub4_2446.method1808()) {
					aClass120_Sub30_Sub1_3707.aClass120_Sub30_Sub3_3675.method1787(class120_sub6.aClass120_Sub30_Sub4_2446);
				}
				class120_sub6.method1071(338);
				if (class120_sub6.anInt2453 >= 0) {
					class120_sub6.unlink();
					if (class120_sub6.anInt2445 > 0 && aClass120_Sub6ArrayArray3685[class120_sub6.anInt2465][class120_sub6.anInt2445] == class120_sub6) {
						aClass120_Sub6ArrayArray3685[class120_sub6.anInt2465][class120_sub6.anInt2445] = null;
					}
				}
				return true;
			}
			class120_sub6.aClass120_Sub30_Sub4_2446.method1788(class120_sub6.anInt2466, method1745(class120_sub6, 2), method1749(class120_sub6, 16384));
			bool = false;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("ld.CA(").append(class120_sub6 != null ? "{...}" : "null").append(',').append(i).append(',').append(i_88_).append(',').append(i_89_).append(',').append(is != null ? "{...}" : "null").append(')').toString());
		}
		return bool;
	}

	public static void method1776(final int i) {
		try {
			if (i == 16990) {
				aString3679 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("ld.JA(").append(i).append(')').toString());
		}
	}

	static final void method1777(final js5 js5) {
		Class69.aClass50_619 = js5;
	}

	final synchronized void method1778() {
		for (Class120_Sub22 class120_sub22 = (Class120_Sub22) aClass75_3695.getFirst(); class120_sub22 != null; class120_sub22 = (Class120_Sub22) aClass75_3695.getNext()) {
			class120_sub22.method1706(true);
		}
	}

	private final synchronized void method1779(final boolean bool) {
		aClass62_3701.method556();
		aClass120_Sub31_3708 = null;
		method1768(0, bool);
	}

	final synchronized boolean method1780(final int i, final Class120_Sub31 class120_sub31, final js5 js5, final Class90 class90) {
		class120_sub31.method1828();
		boolean bool_93_ = true;
		int[] is = null;
		if (i > 0) {
			is = new int[] { i };
		}
		for (Class120_Sub11 class120_sub11 = (Class120_Sub11) class120_sub31.aClass75_2786.getFirst(); class120_sub11 != null; class120_sub11 = (Class120_Sub11) class120_sub31.aClass75_2786.getNext()) {
			final int i_94_ = (int) class120_sub11.uid;
			Class120_Sub22 class120_sub22 = (Class120_Sub22) aClass75_3695.get(i_94_);
			if (class120_sub22 == null) {
				class120_sub22 = NodeCache.method300(js5, i_94_);
				if (class120_sub22 == null) {
					bool_93_ = false;
					continue;
				}
				aClass75_3695.put(class120_sub22, i_94_);
			}
			if (!class120_sub22.method1702(class90, is, class120_sub11.aByteArray2555)) {
				bool_93_ = false;
			}
		}
		if (bool_93_) {
			class120_sub31.method1829();
		}
		return bool_93_;
	}

	public Class120_Sub30_Sub2() {
		anIntArray3681 = new int[16];
		anIntArray3682 = new int[16];
		anIntArray3693 = new int[16];
		anIntArray3690 = new int[16];
		this.anIntArray3683 = new int[16];
		anIntArray3691 = new int[16];
		this.anIntArray3678 = new int[16];
		anIntArray3684 = new int[16];
		anIntArray3694 = new int[16];
		anIntArray3689 = new int[16];
		this.anIntArray3692 = new int[16];
		anInt3686 = 256;
		anIntArray3680 = new int[16];
		anIntArray3697 = new int[16];
		anInt3698 = 1000000;
		anIntArray3687 = new int[16];
		anIntArray3696 = new int[16];
		aClass120_Sub6ArrayArray3700 = new Class120_Sub6[16][128];
		aClass62_3701 = new Class62();
		aClass120_Sub30_Sub1_3707 = new Class120_Sub30_Sub1(this);
		aClass75_3695 = new Hashtable(128);
		method1747(-1, 256, -128);
		method1768(0, true);
	}
}
