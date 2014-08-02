/* Class120_Sub30_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class120_Sub30_Sub4 extends Class120_Sub30 {
	private int anInt3715;
	private int anInt3716;
	private int anInt3717;
	private int anInt3718;
	private int anInt3719;
	private int anInt3720;
	private final boolean aBoolean3721;
	private int anInt3722;
	private int anInt3723;
	private int anInt3724;
	private int anInt3725;
	private int anInt3726;
	private final int anInt3727;
	private final int anInt3728;
	private int anInt3729;

	final synchronized void method1788(int i, final int i_0_, final int i_1_) {
		if (i == 0) {
			method1822(i_0_, i_1_);
		} else {
			final int i_2_ = method1810(i_0_, i_1_);
			final int i_3_ = method1791(i_0_, i_1_);
			if (anInt3725 == i_2_ && anInt3718 == i_3_) {
				anInt3726 = 0;
			} else {
				int i_4_ = i_0_ - anInt3716;
				if (anInt3716 - i_0_ > i_4_) {
					i_4_ = anInt3716 - i_0_;
				}
				if (i_2_ - anInt3725 > i_4_) {
					i_4_ = i_2_ - anInt3725;
				}
				if (anInt3725 - i_2_ > i_4_) {
					i_4_ = anInt3725 - i_2_;
				}
				if (i_3_ - anInt3718 > i_4_) {
					i_4_ = i_3_ - anInt3718;
				}
				if (anInt3718 - i_3_ > i_4_) {
					i_4_ = anInt3718 - i_3_;
				}
				if (i > i_4_) {
					i = i_4_;
				}
				anInt3726 = i;
				anInt3722 = i_0_;
				anInt3724 = i_1_;
				anInt3717 = (i_0_ - anInt3716) / i;
				anInt3723 = (i_2_ - anInt3725) / i;
				anInt3719 = (i_3_ - anInt3718) / i;
			}
		}
	}

	final synchronized void method1789(final int i) {
		if (anInt3715 < 0) {
			anInt3715 = -i;
		} else {
			anInt3715 = i;
		}
	}

	@Override
	final int method1733() {
		int i = anInt3716 * 3 >> 6;
		i = (i ^ i >> 31) + (i >>> 31);
		if (anInt3729 == 0) {
			i -= i * anInt3720 / (((Class120_Sub5_Sub1) this.aClass120_Sub5_2782).aByteArray3114.length << 8);
		} else if (anInt3729 >= 0) {
			i -= i * anInt3727 / ((Class120_Sub5_Sub1) this.aClass120_Sub5_2782).aByteArray3114.length;
		}
		return i > 255 ? 255 : i;
	}

	private final void method1790() {
		if (anInt3726 != 0) {
			if (anInt3722 == -2147483648) {
				anInt3722 = 0;
			}
			anInt3726 = 0;
			method1807();
		}
	}

	private static final int method1791(final int i, final int i_5_) {
		return i_5_ < 0 ? -i : (int) (i * Math.sqrt(i_5_ * 1.220703125E-4) + 0.5);
	}

	private static final int method1792(int i, int i_6_, final byte[] is, final int[] is_7_, int i_8_, int i_9_, final int i_10_, final int i_11_, int i_12_, final int i_13_, final int i_14_, final Class120_Sub30_Sub4 class120_sub30_sub4, final int i_15_, final int i_16_) {
		if (i_15_ == 0 || (i_12_ = i_9_ + (i_14_ + 256 - i_8_ + i_15_) / i_15_) > i_13_) {
			i_12_ = i_13_;
		}
		i_9_ <<= 1;
		i_12_ <<= 1;
		while (i_9_ < i_12_) {
			i_6_ = i_8_ >> 8;
			i = is[i_6_ - 1];
			i = (i << 8) + (is[i_6_] - i) * (i_8_ & 0xff);
			is_7_[i_9_++] += i * i_10_ >> 6;
			is_7_[i_9_++] += i * i_11_ >> 6;
			i_8_ += i_15_;
		}
		if (i_15_ == 0 || (i_12_ = (i_9_ >> 1) + (i_14_ - i_8_ + i_15_) / i_15_) > i_13_) {
			i_12_ = i_13_;
		}
		i_12_ <<= 1;
		i_6_ = i_16_;
		while (i_9_ < i_12_) {
			i = (i_6_ << 8) + (is[i_8_ >> 8] - i_6_) * (i_8_ & 0xff);
			is_7_[i_9_++] += i * i_10_ >> 6;
			is_7_[i_9_++] += i * i_11_ >> 6;
			i_8_ += i_15_;
		}
		class120_sub30_sub4.anInt3720 = i_8_;
		return i_9_ >> 1;
	}

	private static final int method1793(int i, int i_17_, final byte[] is, final int[] is_18_, int i_19_, int i_20_, final int i_21_, final int i_22_, int i_23_, final int i_24_, final int i_25_, final Class120_Sub30_Sub4 class120_sub30_sub4, final int i_26_, final int i_27_) {
		if (i_26_ == 0 || (i_23_ = i_20_ + (i_25_ - i_19_ + i_26_ - 257) / i_26_) > i_24_) {
			i_23_ = i_24_;
		}
		i_20_ <<= 1;
		i_23_ <<= 1;
		while (i_20_ < i_23_) {
			i_17_ = i_19_ >> 8;
			i = is[i_17_];
			i = (i << 8) + (is[i_17_ + 1] - i) * (i_19_ & 0xff);
			is_18_[i_20_++] += i * i_21_ >> 6;
			is_18_[i_20_++] += i * i_22_ >> 6;
			i_19_ += i_26_;
		}
		if (i_26_ == 0 || (i_23_ = (i_20_ >> 1) + (i_25_ - i_19_ + i_26_ - 1) / i_26_) > i_24_) {
			i_23_ = i_24_;
		}
		i_23_ <<= 1;
		i_17_ = i_27_;
		while (i_20_ < i_23_) {
			i = is[i_19_ >> 8];
			i = (i << 8) + (i_17_ - i) * (i_19_ & 0xff);
			is_18_[i_20_++] += i * i_21_ >> 6;
			is_18_[i_20_++] += i * i_22_ >> 6;
			i_19_ += i_26_;
		}
		class120_sub30_sub4.anInt3720 = i_19_;
		return i_20_ >> 1;
	}

	private final int method1794(final int[] is, int i, final int i_28_, final int i_29_, final int i_30_) {
		while (anInt3726 > 0) {
			int i_31_ = i + anInt3726;
			if (i_31_ > i_29_) {
				i_31_ = i_29_;
			}
			anInt3726 += i;
			if (anInt3715 == -256 && (anInt3720 & 0xff) == 0) {
				if (Class90.aBoolean846) {
					i = method1812(0, ((Class120_Sub5_Sub1) this.aClass120_Sub5_2782).aByteArray3114, is, anInt3720, i, anInt3725, anInt3718, anInt3723, anInt3719, 0, i_31_, i_28_, this);
				} else {
					i = method1825(((Class120_Sub5_Sub1) this.aClass120_Sub5_2782).aByteArray3114, is, anInt3720, i, anInt3716, anInt3717, 0, i_31_, i_28_, this);
				}
			} else if (Class90.aBoolean846) {
				i = method1806(0, 0, ((Class120_Sub5_Sub1) this.aClass120_Sub5_2782).aByteArray3114, is, anInt3720, i, anInt3725, anInt3718, anInt3723, anInt3719, 0, i_31_, i_28_, this, anInt3715, i_30_);
			} else {
				i = method1826(0, 0, ((Class120_Sub5_Sub1) this.aClass120_Sub5_2782).aByteArray3114, is, anInt3720, i, anInt3716, anInt3717, 0, i_31_, i_28_, this, anInt3715, i_30_);
			}
			anInt3726 -= i;
			if (anInt3726 != 0) {
				return i;
			}
			if (method1803()) {
				return i_29_;
			}
		}
		if (anInt3715 == -256 && (anInt3720 & 0xff) == 0) {
			if (Class90.aBoolean846) {
				return method1823(0, ((Class120_Sub5_Sub1) this.aClass120_Sub5_2782).aByteArray3114, is, anInt3720, i, anInt3725, anInt3718, 0, i_29_, i_28_, this);
			}
			return method1816(((Class120_Sub5_Sub1) this.aClass120_Sub5_2782).aByteArray3114, is, anInt3720, i, anInt3716, 0, i_29_, i_28_, this);
		}
		if (Class90.aBoolean846) {
			return method1792(0, 0, ((Class120_Sub5_Sub1) this.aClass120_Sub5_2782).aByteArray3114, is, anInt3720, i, anInt3725, anInt3718, 0, i_29_, i_28_, this, anInt3715, i_30_);
		}
		return method1827(0, 0, ((Class120_Sub5_Sub1) this.aClass120_Sub5_2782).aByteArray3114, is, anInt3720, i, anInt3716, 0, i_29_, i_28_, this, anInt3715, i_30_);
	}

	final synchronized void method1795(final int i) {
		anInt3729 = i;
	}

	final synchronized void method1796(int i) {
		if (i == 0) {
			method1818(0);
			unlink();
		} else if (anInt3725 == 0 && anInt3718 == 0) {
			anInt3726 = 0;
			anInt3722 = 0;
			anInt3716 = 0;
			unlink();
		} else {
			int i_32_ = -anInt3716;
			if (anInt3716 > i_32_) {
				i_32_ = anInt3716;
			}
			if (-anInt3725 > i_32_) {
				i_32_ = -anInt3725;
			}
			if (anInt3725 > i_32_) {
				i_32_ = anInt3725;
			}
			if (-anInt3718 > i_32_) {
				i_32_ = -anInt3718;
			}
			if (anInt3718 > i_32_) {
				i_32_ = anInt3718;
			}
			if (i > i_32_) {
				i = i_32_;
			}
			anInt3726 = i;
			anInt3722 = -2147483648;
			anInt3717 = -anInt3716 / i;
			anInt3723 = -anInt3725 / i;
			anInt3719 = -anInt3718 / i;
		}
	}

	private static final int method1797(final byte[] is, final int[] is_33_, int i, int i_34_, int i_35_, int i_36_, final int i_37_, int i_38_, final Class120_Sub30_Sub4 class120_sub30_sub4) {
		i >>= 8;
		i_38_ >>= 8;
		i_35_ <<= 2;
		if ((i_36_ = i_34_ + i_38_ - i) > i_37_) {
			i_36_ = i_37_;
		}
		i_36_ -= 3;
		while (i_34_ < i_36_) {
			is_33_[i_34_++] += is[i++] * i_35_;
			is_33_[i_34_++] += is[i++] * i_35_;
			is_33_[i_34_++] += is[i++] * i_35_;
			is_33_[i_34_++] += is[i++] * i_35_;
		}
		i_36_ += 3;
		while (i_34_ < i_36_) {
			is_33_[i_34_++] += is[i++] * i_35_;
		}
		class120_sub30_sub4.anInt3720 = i << 8;
		return i_34_;
	}

	@Override
	final synchronized void method1731(int i) {
		if (anInt3726 > 0) {
			if (i >= anInt3726) {
				if (anInt3722 == -2147483648) {
					anInt3722 = 0;
					anInt3716 = anInt3725 = anInt3718 = 0;
					unlink();
					i = anInt3726;
				}
				anInt3726 = 0;
				method1807();
			} else {
				anInt3716 += anInt3717 * i;
				anInt3725 += anInt3723 * i;
				anInt3718 += anInt3719 * i;
				anInt3726 -= i;
			}
		}
		final Class120_Sub5_Sub1 class120_sub5_sub1 = (Class120_Sub5_Sub1) this.aClass120_Sub5_2782;
		final int i_39_ = anInt3727 << 8;
		final int i_40_ = anInt3728 << 8;
		final int i_41_ = class120_sub5_sub1.aByteArray3114.length << 8;
		final int i_42_ = i_40_ - i_39_;
		if (i_42_ <= 0) {
			anInt3729 = 0;
		}
		if (anInt3720 < 0) {
			if (anInt3715 > 0) {
				anInt3720 = 0;
			} else {
				method1790();
				unlink();
				return;
			}
		}
		if (anInt3720 >= i_41_) {
			if (anInt3715 < 0) {
				anInt3720 = i_41_ - 1;
			} else {
				method1790();
				unlink();
				return;
			}
		}
		anInt3720 += anInt3715 * i;
		if (anInt3729 < 0) {
			if (aBoolean3721) {
				if (anInt3715 < 0) {
					if (anInt3720 >= i_39_) {
						return;
					}
					anInt3720 = i_39_ + i_39_ - 1 - anInt3720;
					anInt3715 = -anInt3715;
				}
				while (anInt3720 >= i_40_) {
					anInt3720 = i_40_ + i_40_ - 1 - anInt3720;
					anInt3715 = -anInt3715;
					if (anInt3720 >= i_39_) {
						break;
					}
					anInt3720 = i_39_ + i_39_ - 1 - anInt3720;
					anInt3715 = -anInt3715;
				}
			} else if (anInt3715 < 0) {
				if (anInt3720 < i_39_) {
					anInt3720 = i_40_ - 1 - (i_40_ - 1 - anInt3720) % i_42_;
				}
			} else if (anInt3720 >= i_40_) {
				anInt3720 = i_39_ + (anInt3720 - i_39_) % i_42_;
			}
		} else {
			do {
				if (anInt3729 > 0) {
					if (aBoolean3721) {
						if (anInt3715 < 0) {
							if (anInt3720 >= i_39_) {
								return;
							}
							anInt3720 = i_39_ + i_39_ - 1 - anInt3720;
							anInt3715 = -anInt3715;
							if (--anInt3729 == 0) {
								break;
							}
						}
						do {
							if (anInt3720 < i_40_) {
								return;
							}
							anInt3720 = i_40_ + i_40_ - 1 - anInt3720;
							anInt3715 = -anInt3715;
							if (--anInt3729 == 0) {
								break;
							}
							if (anInt3720 >= i_39_) {
								return;
							}
							anInt3720 = i_39_ + i_39_ - 1 - anInt3720;
							anInt3715 = -anInt3715;
						} while (--anInt3729 != 0);
					} else {
						if (anInt3715 < 0) {
							if (anInt3720 < i_39_) {
								final int i_43_ = (i_40_ - 1 - anInt3720) / i_42_;
								if (i_43_ >= anInt3729) {
									anInt3720 += i_42_ * anInt3729;
									anInt3729 = 0;
									break;
								}
								anInt3720 += i_42_ * i_43_;
								anInt3729 -= i_43_;
							}
						} else if (anInt3720 >= i_40_) {
							final int i_44_ = (anInt3720 - i_39_) / i_42_;
							if (i_44_ >= anInt3729) {
								anInt3720 -= i_42_ * anInt3729;
								anInt3729 = 0;
								break;
							}
							anInt3720 -= i_42_ * i_44_;
							anInt3729 -= i_44_;
						}
						return;
					}
				}
			} while (false);
			if (anInt3715 < 0) {
				if (anInt3720 < 0) {
					anInt3720 = -1;
					method1790();
					unlink();
				}
			} else if (anInt3720 >= i_41_) {
				anInt3720 = i_41_;
				method1790();
				unlink();
			}
		}
	}

	private static final int method1798(int i, final byte[] is, final int[] is_45_, int i_46_, int i_47_, int i_48_, int i_49_, int i_50_, int i_51_, int i_52_, final int i_53_, int i_54_, final Class120_Sub30_Sub4 class120_sub30_sub4) {
		i_46_ >>= 8;
		i_54_ >>= 8;
		i_48_ <<= 2;
		i_49_ <<= 2;
		i_50_ <<= 2;
		i_51_ <<= 2;
		if ((i_52_ = i_47_ + i_54_ - i_46_) > i_53_) {
			i_52_ = i_53_;
		}
		class120_sub30_sub4.anInt3716 += class120_sub30_sub4.anInt3717 * (i_52_ - i_47_);
		i_47_ <<= 1;
		i_52_ <<= 1;
		i_52_ -= 6;
		while (i_47_ < i_52_) {
			i = is[i_46_++];
			is_45_[i_47_++] += i * i_48_;
			i_48_ += i_50_;
			is_45_[i_47_++] += i * i_49_;
			i_49_ += i_51_;
			i = is[i_46_++];
			is_45_[i_47_++] += i * i_48_;
			i_48_ += i_50_;
			is_45_[i_47_++] += i * i_49_;
			i_49_ += i_51_;
			i = is[i_46_++];
			is_45_[i_47_++] += i * i_48_;
			i_48_ += i_50_;
			is_45_[i_47_++] += i * i_49_;
			i_49_ += i_51_;
			i = is[i_46_++];
			is_45_[i_47_++] += i * i_48_;
			i_48_ += i_50_;
			is_45_[i_47_++] += i * i_49_;
			i_49_ += i_51_;
		}
		i_52_ += 6;
		while (i_47_ < i_52_) {
			i = is[i_46_++];
			is_45_[i_47_++] += i * i_48_;
			i_48_ += i_50_;
			is_45_[i_47_++] += i * i_49_;
			i_49_ += i_51_;
		}
		class120_sub30_sub4.anInt3725 = i_48_ >> 2;
		class120_sub30_sub4.anInt3718 = i_49_ >> 2;
		class120_sub30_sub4.anInt3720 = i_46_ << 8;
		return i_47_ >> 1;
	}

	private static final int method1799(int i, int i_55_, final byte[] is, final int[] is_56_, int i_57_, int i_58_, int i_59_, final int i_60_, int i_61_, final int i_62_, final int i_63_, final Class120_Sub30_Sub4 class120_sub30_sub4, final int i_64_, final int i_65_) {
		class120_sub30_sub4.anInt3725 -= class120_sub30_sub4.anInt3723 * i_58_;
		class120_sub30_sub4.anInt3718 -= class120_sub30_sub4.anInt3719 * i_58_;
		if (i_64_ == 0 || (i_61_ = i_58_ + (i_63_ - i_57_ + i_64_ - 257) / i_64_) > i_62_) {
			i_61_ = i_62_;
		}
		while (i_58_ < i_61_) {
			i_55_ = i_57_ >> 8;
			i = is[i_55_];
			is_56_[i_58_++] += ((i << 8) + (is[i_55_ + 1] - i) * (i_57_ & 0xff)) * i_59_ >> 6;
			i_59_ += i_60_;
			i_57_ += i_64_;
		}
		if (i_64_ == 0 || (i_61_ = i_58_ + (i_63_ - i_57_ + i_64_ - 1) / i_64_) > i_62_) {
			i_61_ = i_62_;
		}
		i_55_ = i_65_;
		while (i_58_ < i_61_) {
			i = is[i_57_ >> 8];
			is_56_[i_58_++] += ((i << 8) + (i_55_ - i) * (i_57_ & 0xff)) * i_59_ >> 6;
			i_59_ += i_60_;
			i_57_ += i_64_;
		}
		class120_sub30_sub4.anInt3725 += class120_sub30_sub4.anInt3723 * i_58_;
		class120_sub30_sub4.anInt3718 += class120_sub30_sub4.anInt3719 * i_58_;
		class120_sub30_sub4.anInt3716 = i_59_;
		class120_sub30_sub4.anInt3720 = i_57_;
		return i_58_;
	}

	final synchronized void method1800(final boolean bool) {
		anInt3715 = (anInt3715 ^ anInt3715 >> 31) + (anInt3715 >>> 31);
		if (bool) {
			anInt3715 = -anInt3715;
		}
	}

	final boolean method1801() {
		if (anInt3720 >= 0 && anInt3720 < ((Class120_Sub5_Sub1) this.aClass120_Sub5_2782).aByteArray3114.length << 8) {
			return false;
		}
		return true;
	}

	private static final int method1802(int i, int i_66_, final byte[] is, final int[] is_67_, int i_68_, int i_69_, int i_70_, int i_71_, final int i_72_, final int i_73_, int i_74_, final int i_75_, final int i_76_, final Class120_Sub30_Sub4 class120_sub30_sub4, final int i_77_, final int i_78_) {
		class120_sub30_sub4.anInt3716 -= class120_sub30_sub4.anInt3717 * i_69_;
		if (i_77_ == 0 || (i_74_ = i_69_ + (i_76_ - i_68_ + i_77_ - 257) / i_77_) > i_75_) {
			i_74_ = i_75_;
		}
		i_69_ <<= 1;
		i_74_ <<= 1;
		while (i_69_ < i_74_) {
			i_66_ = i_68_ >> 8;
			i = is[i_66_];
			i = (i << 8) + (is[i_66_ + 1] - i) * (i_68_ & 0xff);
			is_67_[i_69_++] += i * i_70_ >> 6;
			i_70_ += i_72_;
			is_67_[i_69_++] += i * i_71_ >> 6;
			i_71_ += i_73_;
			i_68_ += i_77_;
		}
		if (i_77_ == 0 || (i_74_ = (i_69_ >> 1) + (i_76_ - i_68_ + i_77_ - 1) / i_77_) > i_75_) {
			i_74_ = i_75_;
		}
		i_74_ <<= 1;
		i_66_ = i_78_;
		while (i_69_ < i_74_) {
			i = is[i_68_ >> 8];
			i = (i << 8) + (i_66_ - i) * (i_68_ & 0xff);
			is_67_[i_69_++] += i * i_70_ >> 6;
			i_70_ += i_72_;
			is_67_[i_69_++] += i * i_71_ >> 6;
			i_71_ += i_73_;
			i_68_ += i_77_;
		}
		i_69_ >>= 1;
		class120_sub30_sub4.anInt3716 += class120_sub30_sub4.anInt3717 * i_69_;
		class120_sub30_sub4.anInt3725 = i_70_;
		class120_sub30_sub4.anInt3718 = i_71_;
		class120_sub30_sub4.anInt3720 = i_68_;
		return i_69_;
	}

	@Override
	final Class120_Sub30 method1735() {
		return null;
	}

	private final boolean method1803() {
		int i = anInt3722;
		int i_79_;
		int i_80_;
		if (i == -2147483648) {
			i = i_79_ = i_80_ = 0;
		} else {
			i_79_ = method1810(i, anInt3724);
			i_80_ = method1791(i, anInt3724);
		}
		if (anInt3716 != i || anInt3725 != i_79_ || anInt3718 != i_80_) {
			if (anInt3716 < i) {
				anInt3717 = 1;
				anInt3726 = i - anInt3716;
			} else if (anInt3716 > i) {
				anInt3717 = -1;
				anInt3726 = anInt3716 - i;
			} else {
				anInt3717 = 0;
			}
			if (anInt3725 < i_79_) {
				anInt3723 = 1;
				if (anInt3726 == 0 || anInt3726 > i_79_ - anInt3725) {
					anInt3726 = i_79_ - anInt3725;
				}
			} else if (anInt3725 > i_79_) {
				anInt3723 = -1;
				if (anInt3726 == 0 || anInt3726 > anInt3725 - i_79_) {
					anInt3726 = anInt3725 - i_79_;
				}
			} else {
				anInt3723 = 0;
			}
			if (anInt3718 < i_80_) {
				anInt3719 = 1;
				if (anInt3726 == 0 || anInt3726 > i_80_ - anInt3718) {
					anInt3726 = i_80_ - anInt3718;
				}
			} else if (anInt3718 > i_80_) {
				anInt3719 = -1;
				if (anInt3726 == 0 || anInt3726 > anInt3718 - i_80_) {
					anInt3726 = anInt3718 - i_80_;
				}
			} else {
				anInt3719 = 0;
			}
			return false;
		}
		if (anInt3722 == -2147483648) {
			anInt3722 = 0;
			anInt3716 = anInt3725 = anInt3718 = 0;
			unlink();
			return true;
		}
		method1807();
		return false;
	}

	final synchronized int method1804() {
		return anInt3715 < 0 ? -anInt3715 : anInt3715;
	}

	final synchronized void method1805(int i) {
		final int i_81_ = ((Class120_Sub5_Sub1) this.aClass120_Sub5_2782).aByteArray3114.length << 8;
		if (i < -1) {
			i = -1;
		}
		if (i > i_81_) {
			i = i_81_;
		}
		anInt3720 = i;
	}

	private static final int method1806(int i, int i_82_, final byte[] is, final int[] is_83_, int i_84_, int i_85_, int i_86_, int i_87_, final int i_88_, final int i_89_, int i_90_, final int i_91_, final int i_92_, final Class120_Sub30_Sub4 class120_sub30_sub4, final int i_93_, final int i_94_) {
		class120_sub30_sub4.anInt3716 -= class120_sub30_sub4.anInt3717 * i_85_;
		if (i_93_ == 0 || (i_90_ = i_85_ + (i_92_ + 256 - i_84_ + i_93_) / i_93_) > i_91_) {
			i_90_ = i_91_;
		}
		i_85_ <<= 1;
		i_90_ <<= 1;
		while (i_85_ < i_90_) {
			i_82_ = i_84_ >> 8;
			i = is[i_82_ - 1];
			i = (i << 8) + (is[i_82_] - i) * (i_84_ & 0xff);
			is_83_[i_85_++] += i * i_86_ >> 6;
			i_86_ += i_88_;
			is_83_[i_85_++] += i * i_87_ >> 6;
			i_87_ += i_89_;
			i_84_ += i_93_;
		}
		if (i_93_ == 0 || (i_90_ = (i_85_ >> 1) + (i_92_ - i_84_ + i_93_) / i_93_) > i_91_) {
			i_90_ = i_91_;
		}
		i_90_ <<= 1;
		i_82_ = i_94_;
		while (i_85_ < i_90_) {
			i = (i_82_ << 8) + (is[i_84_ >> 8] - i_82_) * (i_84_ & 0xff);
			is_83_[i_85_++] += i * i_86_ >> 6;
			i_86_ += i_88_;
			is_83_[i_85_++] += i * i_87_ >> 6;
			i_87_ += i_89_;
			i_84_ += i_93_;
		}
		i_85_ >>= 1;
		class120_sub30_sub4.anInt3716 += class120_sub30_sub4.anInt3717 * i_85_;
		class120_sub30_sub4.anInt3725 = i_86_;
		class120_sub30_sub4.anInt3718 = i_87_;
		class120_sub30_sub4.anInt3720 = i_84_;
		return i_85_;
	}

	private final void method1807() {
		anInt3716 = anInt3722;
		anInt3725 = method1810(anInt3722, anInt3724);
		anInt3718 = method1791(anInt3722, anInt3724);
	}

	final boolean method1808() {
		if (anInt3726 != 0) {
			return true;
		}
		return false;
	}

	private static final int method1809(int i, int i_95_, final byte[] is, final int[] is_96_, int i_97_, int i_98_, final int i_99_, int i_100_, final int i_101_, final int i_102_, final Class120_Sub30_Sub4 class120_sub30_sub4, final int i_103_, final int i_104_) {
		if (i_103_ == 0 || (i_100_ = i_98_ + (i_102_ - i_97_ + i_103_ - 257) / i_103_) > i_101_) {
			i_100_ = i_101_;
		}
		while (i_98_ < i_100_) {
			i_95_ = i_97_ >> 8;
			i = is[i_95_];
			is_96_[i_98_++] += ((i << 8) + (is[i_95_ + 1] - i) * (i_97_ & 0xff)) * i_99_ >> 6;
			i_97_ += i_103_;
		}
		if (i_103_ == 0 || (i_100_ = i_98_ + (i_102_ - i_97_ + i_103_ - 1) / i_103_) > i_101_) {
			i_100_ = i_101_;
		}
		i_95_ = i_104_;
		while (i_98_ < i_100_) {
			i = is[i_97_ >> 8];
			is_96_[i_98_++] += ((i << 8) + (i_95_ - i) * (i_97_ & 0xff)) * i_99_ >> 6;
			i_97_ += i_103_;
		}
		class120_sub30_sub4.anInt3720 = i_97_;
		return i_98_;
	}

	private static final int method1810(final int i, final int i_105_) {
		return i_105_ < 0 ? i : (int) (i * Math.sqrt((16384 - i_105_) * 1.220703125E-4) + 0.5);
	}

	private static final int method1811(int i, final byte[] is, final int[] is_106_, int i_107_, int i_108_, int i_109_, int i_110_, int i_111_, final int i_112_, int i_113_, final Class120_Sub30_Sub4 class120_sub30_sub4) {
		i_107_ >>= 8;
		i_113_ >>= 8;
		i_109_ <<= 2;
		i_110_ <<= 2;
		if ((i_111_ = i_108_ + i_113_ - i_107_) > i_112_) {
			i_111_ = i_112_;
		}
		i_108_ <<= 1;
		i_111_ <<= 1;
		i_111_ -= 6;
		while (i_108_ < i_111_) {
			i = is[i_107_++];
			is_106_[i_108_++] += i * i_109_;
			is_106_[i_108_++] += i * i_110_;
			i = is[i_107_++];
			is_106_[i_108_++] += i * i_109_;
			is_106_[i_108_++] += i * i_110_;
			i = is[i_107_++];
			is_106_[i_108_++] += i * i_109_;
			is_106_[i_108_++] += i * i_110_;
			i = is[i_107_++];
			is_106_[i_108_++] += i * i_109_;
			is_106_[i_108_++] += i * i_110_;
		}
		i_111_ += 6;
		while (i_108_ < i_111_) {
			i = is[i_107_++];
			is_106_[i_108_++] += i * i_109_;
			is_106_[i_108_++] += i * i_110_;
		}
		class120_sub30_sub4.anInt3720 = i_107_ << 8;
		return i_108_ >> 1;
	}

	private static final int method1812(int i, final byte[] is, final int[] is_114_, int i_115_, int i_116_, int i_117_, int i_118_, int i_119_, int i_120_, int i_121_, final int i_122_, int i_123_, final Class120_Sub30_Sub4 class120_sub30_sub4) {
		i_115_ >>= 8;
		i_123_ >>= 8;
		i_117_ <<= 2;
		i_118_ <<= 2;
		i_119_ <<= 2;
		i_120_ <<= 2;
		if ((i_121_ = i_116_ + i_115_ - (i_123_ - 1)) > i_122_) {
			i_121_ = i_122_;
		}
		class120_sub30_sub4.anInt3716 += class120_sub30_sub4.anInt3717 * (i_121_ - i_116_);
		i_116_ <<= 1;
		i_121_ <<= 1;
		i_121_ -= 6;
		while (i_116_ < i_121_) {
			i = is[i_115_--];
			is_114_[i_116_++] += i * i_117_;
			i_117_ += i_119_;
			is_114_[i_116_++] += i * i_118_;
			i_118_ += i_120_;
			i = is[i_115_--];
			is_114_[i_116_++] += i * i_117_;
			i_117_ += i_119_;
			is_114_[i_116_++] += i * i_118_;
			i_118_ += i_120_;
			i = is[i_115_--];
			is_114_[i_116_++] += i * i_117_;
			i_117_ += i_119_;
			is_114_[i_116_++] += i * i_118_;
			i_118_ += i_120_;
			i = is[i_115_--];
			is_114_[i_116_++] += i * i_117_;
			i_117_ += i_119_;
			is_114_[i_116_++] += i * i_118_;
			i_118_ += i_120_;
		}
		i_121_ += 6;
		while (i_116_ < i_121_) {
			i = is[i_115_--];
			is_114_[i_116_++] += i * i_117_;
			i_117_ += i_119_;
			is_114_[i_116_++] += i * i_118_;
			i_118_ += i_120_;
		}
		class120_sub30_sub4.anInt3725 = i_117_ >> 2;
		class120_sub30_sub4.anInt3718 = i_118_ >> 2;
		class120_sub30_sub4.anInt3720 = i_115_ << 8;
		return i_116_ >> 1;
	}

	final synchronized void setVolume(final int i) {
		method1822(i << 6, method1824());
	}

	private static final int method1814(final byte[] is, final int[] is_124_, int i, int i_125_, int i_126_, int i_127_, int i_128_, final int i_129_, int i_130_, final Class120_Sub30_Sub4 class120_sub30_sub4) {
		i >>= 8;
		i_130_ >>= 8;
		i_126_ <<= 2;
		i_127_ <<= 2;
		if ((i_128_ = i_125_ + i_130_ - i) > i_129_) {
			i_128_ = i_129_;
		}
		class120_sub30_sub4.anInt3725 += class120_sub30_sub4.anInt3723 * (i_128_ - i_125_);
		class120_sub30_sub4.anInt3718 += class120_sub30_sub4.anInt3719 * (i_128_ - i_125_);
		i_128_ -= 3;
		while (i_125_ < i_128_) {
			is_124_[i_125_++] += is[i++] * i_126_;
			i_126_ += i_127_;
			is_124_[i_125_++] += is[i++] * i_126_;
			i_126_ += i_127_;
			is_124_[i_125_++] += is[i++] * i_126_;
			i_126_ += i_127_;
			is_124_[i_125_++] += is[i++] * i_126_;
			i_126_ += i_127_;
		}
		i_128_ += 3;
		while (i_125_ < i_128_) {
			is_124_[i_125_++] += is[i++] * i_126_;
			i_126_ += i_127_;
		}
		class120_sub30_sub4.anInt3716 = i_126_ >> 2;
		class120_sub30_sub4.anInt3720 = i << 8;
		return i_125_;
	}

	final synchronized void method1815(final int i, final int i_131_) {
		method1788(i, i_131_, method1824());
	}

	private static final int method1816(final byte[] is, final int[] is_132_, int i, int i_133_, int i_134_, int i_135_, final int i_136_, int i_137_, final Class120_Sub30_Sub4 class120_sub30_sub4) {
		i >>= 8;
		i_137_ >>= 8;
		i_134_ <<= 2;
		if ((i_135_ = i_133_ + i - (i_137_ - 1)) > i_136_) {
			i_135_ = i_136_;
		}
		i_135_ -= 3;
		while (i_133_ < i_135_) {
			is_132_[i_133_++] += is[i--] * i_134_;
			is_132_[i_133_++] += is[i--] * i_134_;
			is_132_[i_133_++] += is[i--] * i_134_;
			is_132_[i_133_++] += is[i--] * i_134_;
		}
		i_135_ += 3;
		while (i_133_ < i_135_) {
			is_132_[i_133_++] += is[i--] * i_134_;
		}
		class120_sub30_sub4.anInt3720 = i << 8;
		return i_133_;
	}

	final synchronized int method1817() {
		return anInt3722 == -2147483648 ? 0 : anInt3722;
	}

	private final synchronized void method1818(final int i) {
		method1822(i, method1824());
	}

	private final int method1819(final int[] is, int i, final int i_138_, final int i_139_, final int i_140_) {
		while (anInt3726 > 0) {
			int i_141_ = i + anInt3726;
			if (i_141_ > i_139_) {
				i_141_ = i_139_;
			}
			anInt3726 += i;
			if (anInt3715 == 256 && (anInt3720 & 0xff) == 0) {
				if (Class90.aBoolean846) {
					i = method1798(0, ((Class120_Sub5_Sub1) this.aClass120_Sub5_2782).aByteArray3114, is, anInt3720, i, anInt3725, anInt3718, anInt3723, anInt3719, 0, i_141_, i_138_, this);
				} else {
					i = method1814(((Class120_Sub5_Sub1) this.aClass120_Sub5_2782).aByteArray3114, is, anInt3720, i, anInt3716, anInt3717, 0, i_141_, i_138_, this);
				}
			} else if (Class90.aBoolean846) {
				i = method1802(0, 0, ((Class120_Sub5_Sub1) this.aClass120_Sub5_2782).aByteArray3114, is, anInt3720, i, anInt3725, anInt3718, anInt3723, anInt3719, 0, i_141_, i_138_, this, anInt3715, i_140_);
			} else {
				i = method1799(0, 0, ((Class120_Sub5_Sub1) this.aClass120_Sub5_2782).aByteArray3114, is, anInt3720, i, anInt3716, anInt3717, 0, i_141_, i_138_, this, anInt3715, i_140_);
			}
			anInt3726 -= i;
			if (anInt3726 != 0) {
				return i;
			}
			if (method1803()) {
				return i_139_;
			}
		}
		if (anInt3715 == 256 && (anInt3720 & 0xff) == 0) {
			if (Class90.aBoolean846) {
				return method1811(0, ((Class120_Sub5_Sub1) this.aClass120_Sub5_2782).aByteArray3114, is, anInt3720, i, anInt3725, anInt3718, 0, i_139_, i_138_, this);
			}
			return method1797(((Class120_Sub5_Sub1) this.aClass120_Sub5_2782).aByteArray3114, is, anInt3720, i, anInt3716, 0, i_139_, i_138_, this);
		}
		if (Class90.aBoolean846) {
			return method1793(0, 0, ((Class120_Sub5_Sub1) this.aClass120_Sub5_2782).aByteArray3114, is, anInt3720, i, anInt3725, anInt3718, 0, i_139_, i_138_, this, anInt3715, i_140_);
		}
		return method1809(0, 0, ((Class120_Sub5_Sub1) this.aClass120_Sub5_2782).aByteArray3114, is, anInt3720, i, anInt3716, 0, i_139_, i_138_, this, anInt3715, i_140_);
	}

	static final Class120_Sub30_Sub4 method1820(final Class120_Sub5_Sub1 class120_sub5_sub1, final int i, final int i_142_, final int i_143_) {
		if (class120_sub5_sub1.aByteArray3114 == null || class120_sub5_sub1.aByteArray3114.length == 0) {
			return null;
		}
		return new Class120_Sub30_Sub4(class120_sub5_sub1, i, i_142_, i_143_);
	}

	static final Class120_Sub30_Sub4 method1821(final Class120_Sub5_Sub1 class120_sub5_sub1, final int i, final int i_144_) {
		if (class120_sub5_sub1.aByteArray3114 == null || class120_sub5_sub1.aByteArray3114.length == 0) {
			return null;
		}
		return new Class120_Sub30_Sub4(class120_sub5_sub1, (int) (class120_sub5_sub1.anInt3116 * 256L * i / (100 * Class178.anInt1771)), i_144_ << 6);
	}

	private final synchronized void method1822(final int i, final int i_145_) {
		anInt3722 = i;
		anInt3724 = i_145_;
		anInt3726 = 0;
		method1807();
	}

	private static final int method1823(int i, final byte[] is, final int[] is_146_, int i_147_, int i_148_, int i_149_, int i_150_, int i_151_, final int i_152_, int i_153_, final Class120_Sub30_Sub4 class120_sub30_sub4) {
		i_147_ >>= 8;
		i_153_ >>= 8;
		i_149_ <<= 2;
		i_150_ <<= 2;
		if ((i_151_ = i_148_ + i_147_ - (i_153_ - 1)) > i_152_) {
			i_151_ = i_152_;
		}
		i_148_ <<= 1;
		i_151_ <<= 1;
		i_151_ -= 6;
		while (i_148_ < i_151_) {
			i = is[i_147_--];
			is_146_[i_148_++] += i * i_149_;
			is_146_[i_148_++] += i * i_150_;
			i = is[i_147_--];
			is_146_[i_148_++] += i * i_149_;
			is_146_[i_148_++] += i * i_150_;
			i = is[i_147_--];
			is_146_[i_148_++] += i * i_149_;
			is_146_[i_148_++] += i * i_150_;
			i = is[i_147_--];
			is_146_[i_148_++] += i * i_149_;
			is_146_[i_148_++] += i * i_150_;
		}
		i_151_ += 6;
		while (i_148_ < i_151_) {
			i = is[i_147_--];
			is_146_[i_148_++] += i * i_149_;
			is_146_[i_148_++] += i * i_150_;
		}
		class120_sub30_sub4.anInt3720 = i_147_ << 8;
		return i_148_ >> 1;
	}

	@Override
	final Class120_Sub30 method1736() {
		return null;
	}

	final synchronized int method1824() {
		return anInt3724 < 0 ? -1 : anInt3724;
	}

	@Override
	final synchronized void method1734(final int[] is, final int i, int i_154_) {
		if (anInt3722 == 0 && anInt3726 == 0) {
			method1731(i_154_);
		} else {
			final Class120_Sub5_Sub1 class120_sub5_sub1 = (Class120_Sub5_Sub1) this.aClass120_Sub5_2782;
			final int i_155_ = anInt3727 << 8;
			final int i_156_ = anInt3728 << 8;
			final int i_157_ = class120_sub5_sub1.aByteArray3114.length << 8;
			final int i_158_ = i_156_ - i_155_;
			if (i_158_ <= 0) {
				anInt3729 = 0;
			}
			int i_159_ = i;
			i_154_ += i;
			if (anInt3720 < 0) {
				if (anInt3715 > 0) {
					anInt3720 = 0;
				} else {
					method1790();
					unlink();
					return;
				}
			}
			if (anInt3720 >= i_157_) {
				if (anInt3715 < 0) {
					anInt3720 = i_157_ - 1;
				} else {
					method1790();
					unlink();
					return;
				}
			}
			if (anInt3729 < 0) {
				if (aBoolean3721) {
					if (anInt3715 < 0) {
						i_159_ = method1794(is, i_159_, i_155_, i_154_, class120_sub5_sub1.aByteArray3114[anInt3727]);
						if (anInt3720 >= i_155_) {
							return;
						}
						anInt3720 = i_155_ + i_155_ - 1 - anInt3720;
						anInt3715 = -anInt3715;
					}
					for (;;) {
						i_159_ = method1819(is, i_159_, i_156_, i_154_, class120_sub5_sub1.aByteArray3114[anInt3728 - 1]);
						if (anInt3720 < i_156_) {
							break;
						}
						anInt3720 = i_156_ + i_156_ - 1 - anInt3720;
						anInt3715 = -anInt3715;
						i_159_ = method1794(is, i_159_, i_155_, i_154_, class120_sub5_sub1.aByteArray3114[anInt3727]);
						if (anInt3720 >= i_155_) {
							break;
						}
						anInt3720 = i_155_ + i_155_ - 1 - anInt3720;
						anInt3715 = -anInt3715;
					}
				} else if (anInt3715 < 0) {
					for (;;) {
						i_159_ = method1794(is, i_159_, i_155_, i_154_, class120_sub5_sub1.aByteArray3114[anInt3728 - 1]);
						if (anInt3720 >= i_155_) {
							break;
						}
						anInt3720 = i_156_ - 1 - (i_156_ - 1 - anInt3720) % i_158_;
					}
				} else {
					for (;;) {
						i_159_ = method1819(is, i_159_, i_156_, i_154_, class120_sub5_sub1.aByteArray3114[anInt3727]);
						if (anInt3720 < i_156_) {
							break;
						}
						anInt3720 = i_155_ + (anInt3720 - i_155_) % i_158_;
					}
				}
			} else {
				do {
					if (anInt3729 > 0) {
						if (aBoolean3721) {
							if (anInt3715 < 0) {
								i_159_ = method1794(is, i_159_, i_155_, i_154_, class120_sub5_sub1.aByteArray3114[anInt3727]);
								if (anInt3720 >= i_155_) {
									return;
								}
								anInt3720 = i_155_ + i_155_ - 1 - anInt3720;
								anInt3715 = -anInt3715;
								if (--anInt3729 == 0) {
									break;
								}
							}
							do {
								i_159_ = method1819(is, i_159_, i_156_, i_154_, class120_sub5_sub1.aByteArray3114[anInt3728 - 1]);
								if (anInt3720 < i_156_) {
									return;
								}
								anInt3720 = i_156_ + i_156_ - 1 - anInt3720;
								anInt3715 = -anInt3715;
								if (--anInt3729 == 0) {
									break;
								}
								i_159_ = method1794(is, i_159_, i_155_, i_154_, class120_sub5_sub1.aByteArray3114[anInt3727]);
								if (anInt3720 >= i_155_) {
									return;
								}
								anInt3720 = i_155_ + i_155_ - 1 - anInt3720;
								anInt3715 = -anInt3715;
							} while (--anInt3729 != 0);
						} else if (anInt3715 < 0) {
							for (;;) {
								i_159_ = method1794(is, i_159_, i_155_, i_154_, class120_sub5_sub1.aByteArray3114[anInt3728 - 1]);
								if (anInt3720 >= i_155_) {
									return;
								}
								final int i_160_ = (i_156_ - 1 - anInt3720) / i_158_;
								if (i_160_ >= anInt3729) {
									anInt3720 += i_158_ * anInt3729;
									anInt3729 = 0;
									break;
								}
								anInt3720 += i_158_ * i_160_;
								anInt3729 -= i_160_;
							}
						} else {
							for (;;) {
								i_159_ = method1819(is, i_159_, i_156_, i_154_, class120_sub5_sub1.aByteArray3114[anInt3727]);
								if (anInt3720 < i_156_) {
									return;
								}
								final int i_161_ = (anInt3720 - i_155_) / i_158_;
								if (i_161_ >= anInt3729) {
									anInt3720 -= i_158_ * anInt3729;
									anInt3729 = 0;
									break;
								}
								anInt3720 -= i_158_ * i_161_;
								anInt3729 -= i_161_;
							}
						}
					}
				} while (false);
				if (anInt3715 < 0) {
					method1794(is, i_159_, 0, i_154_, 0);
					if (anInt3720 < 0) {
						anInt3720 = -1;
						method1790();
						unlink();
					}
				} else {
					method1819(is, i_159_, i_157_, i_154_, 0);
					if (anInt3720 >= i_157_) {
						anInt3720 = i_157_;
						method1790();
						unlink();
					}
				}
			}
		}
	}

	@Override
	final int method1732() {
		if (anInt3722 == 0 && anInt3726 == 0) {
			return 0;
		}
		return 1;
	}

	private Class120_Sub30_Sub4(final Class120_Sub5_Sub1 class120_sub5_sub1, final int i, final int i_162_) {
		this.aClass120_Sub5_2782 = class120_sub5_sub1;
		anInt3727 = class120_sub5_sub1.anInt3115;
		anInt3728 = class120_sub5_sub1.anInt3118;
		aBoolean3721 = class120_sub5_sub1.aBoolean3117;
		anInt3715 = i;
		anInt3722 = i_162_;
		anInt3724 = 8192;
		anInt3720 = 0;
		method1807();
	}

	private static final int method1825(final byte[] is, final int[] is_163_, int i, int i_164_, int i_165_, int i_166_, int i_167_, final int i_168_, int i_169_, final Class120_Sub30_Sub4 class120_sub30_sub4) {
		i >>= 8;
		i_169_ >>= 8;
		i_165_ <<= 2;
		i_166_ <<= 2;
		if ((i_167_ = i_164_ + i - (i_169_ - 1)) > i_168_) {
			i_167_ = i_168_;
		}
		class120_sub30_sub4.anInt3725 += class120_sub30_sub4.anInt3723 * (i_167_ - i_164_);
		class120_sub30_sub4.anInt3718 += class120_sub30_sub4.anInt3719 * (i_167_ - i_164_);
		i_167_ -= 3;
		while (i_164_ < i_167_) {
			is_163_[i_164_++] += is[i--] * i_165_;
			i_165_ += i_166_;
			is_163_[i_164_++] += is[i--] * i_165_;
			i_165_ += i_166_;
			is_163_[i_164_++] += is[i--] * i_165_;
			i_165_ += i_166_;
			is_163_[i_164_++] += is[i--] * i_165_;
			i_165_ += i_166_;
		}
		i_167_ += 3;
		while (i_164_ < i_167_) {
			is_163_[i_164_++] += is[i--] * i_165_;
			i_165_ += i_166_;
		}
		class120_sub30_sub4.anInt3716 = i_165_ >> 2;
		class120_sub30_sub4.anInt3720 = i << 8;
		return i_164_;
	}

	private static final int method1826(int i, int i_170_, final byte[] is, final int[] is_171_, int i_172_, int i_173_, int i_174_, final int i_175_, int i_176_, final int i_177_, final int i_178_, final Class120_Sub30_Sub4 class120_sub30_sub4, final int i_179_, final int i_180_) {
		class120_sub30_sub4.anInt3725 -= class120_sub30_sub4.anInt3723 * i_173_;
		class120_sub30_sub4.anInt3718 -= class120_sub30_sub4.anInt3719 * i_173_;
		if (i_179_ == 0 || (i_176_ = i_173_ + (i_178_ + 256 - i_172_ + i_179_) / i_179_) > i_177_) {
			i_176_ = i_177_;
		}
		while (i_173_ < i_176_) {
			i_170_ = i_172_ >> 8;
			i = is[i_170_ - 1];
			is_171_[i_173_++] += ((i << 8) + (is[i_170_] - i) * (i_172_ & 0xff)) * i_174_ >> 6;
			i_174_ += i_175_;
			i_172_ += i_179_;
		}
		if (i_179_ == 0 || (i_176_ = i_173_ + (i_178_ - i_172_ + i_179_) / i_179_) > i_177_) {
			i_176_ = i_177_;
		}
		i = i_180_;
		i_170_ = i_179_;
		while (i_173_ < i_176_) {
			is_171_[i_173_++] += ((i << 8) + (is[i_172_ >> 8] - i) * (i_172_ & 0xff)) * i_174_ >> 6;
			i_174_ += i_175_;
			i_172_ += i_170_;
		}
		class120_sub30_sub4.anInt3725 += class120_sub30_sub4.anInt3723 * i_173_;
		class120_sub30_sub4.anInt3718 += class120_sub30_sub4.anInt3719 * i_173_;
		class120_sub30_sub4.anInt3716 = i_174_;
		class120_sub30_sub4.anInt3720 = i_172_;
		return i_173_;
	}

	private static final int method1827(int i, int i_181_, final byte[] is, final int[] is_182_, int i_183_, int i_184_, final int i_185_, int i_186_, final int i_187_, final int i_188_, final Class120_Sub30_Sub4 class120_sub30_sub4, final int i_189_, final int i_190_) {
		if (i_189_ == 0 || (i_186_ = i_184_ + (i_188_ + 256 - i_183_ + i_189_) / i_189_) > i_187_) {
			i_186_ = i_187_;
		}
		while (i_184_ < i_186_) {
			i_181_ = i_183_ >> 8;
			i = is[i_181_ - 1];
			is_182_[i_184_++] += ((i << 8) + (is[i_181_] - i) * (i_183_ & 0xff)) * i_185_ >> 6;
			i_183_ += i_189_;
		}
		if (i_189_ == 0 || (i_186_ = i_184_ + (i_188_ - i_183_ + i_189_) / i_189_) > i_187_) {
			i_186_ = i_187_;
		}
		i = i_190_;
		i_181_ = i_189_;
		while (i_184_ < i_186_) {
			is_182_[i_184_++] += ((i << 8) + (is[i_183_ >> 8] - i) * (i_183_ & 0xff)) * i_185_ >> 6;
			i_183_ += i_181_;
		}
		class120_sub30_sub4.anInt3720 = i_183_;
		return i_184_;
	}

	private Class120_Sub30_Sub4(final Class120_Sub5_Sub1 class120_sub5_sub1, final int i, final int i_191_, final int i_192_) {
		this.aClass120_Sub5_2782 = class120_sub5_sub1;
		anInt3727 = class120_sub5_sub1.anInt3115;
		anInt3728 = class120_sub5_sub1.anInt3118;
		aBoolean3721 = class120_sub5_sub1.aBoolean3117;
		anInt3715 = i;
		anInt3722 = i_191_;
		anInt3724 = i_192_;
		anInt3720 = 0;
		method1807();
	}
}
