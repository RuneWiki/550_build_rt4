/* Class19 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class19 {
	private static Class96 aClass96_120 = new Class96();

	private static final void method167(final Class96 class96) {
		class96.anInt902 = 0;
		for (int i = 0; i < 256; i++) {
			if (class96.aBooleanArray893[i]) {
				class96.aByteArray913[class96.anInt902] = (byte) i;
				class96.anInt902++;
			}
		}
	}

	private static final byte method168(final Class96 class96) {
		return (byte) method169(8, class96);
	}

	private static final int method169(final int i, final Class96 class96) {
		int i_0_;
		for (;;) {
			if (class96.anInt918 >= i) {
				final int i_1_ = class96.anInt887 >> class96.anInt918 - i & (1 << i) - 1;
				class96.anInt918 -= i;
				i_0_ = i_1_;
				break;
			}
			class96.anInt887 = class96.anInt887 << 8 | class96.aByteArray884[class96.anInt907] & 0xff;
			class96.anInt918 += 8;
			class96.anInt907++;
			class96.anInt905++;
			if (class96.anInt905 != 0) {
				/* empty */
			}
		}
		return i_0_;
	}

	static final int method170(final byte[] is, int i, final byte[] is_2_, final int i_3_, final int i_4_) {
		synchronized (aClass96_120) {
			aClass96_120.aByteArray884 = is_2_;
			aClass96_120.anInt907 = i_4_;
			aClass96_120.aByteArray903 = is;
			aClass96_120.anInt917 = 0;
			aClass96_120.anInt906 = i;
			aClass96_120.anInt918 = 0;
			aClass96_120.anInt887 = 0;
			aClass96_120.anInt905 = 0;
			aClass96_120.anInt885 = 0;
			method173(aClass96_120);
			i -= aClass96_120.anInt906;
			aClass96_120.aByteArray884 = null;
			aClass96_120.aByteArray903 = null;
			final int i_5_ = i;
			final int i_6_ = i_5_;
			return i_6_;
		}
	}

	private static final byte method171(final Class96 class96) {
		return (byte) method169(1, class96);
	}

	public static void method172() {
		aClass96_120 = null;
	}

	private static final void method173(final Class96 class96) {
		int i = 0;
		int[] is = null;
		int[] is_7_ = null;
		int[] is_8_ = null;
		class96.anInt898 = 1;
		if (Class120_Sub12_Sub14.anIntArray3239 == null) {
			Class120_Sub12_Sub14.anIntArray3239 = new int[class96.anInt898 * 100000];
		}
		boolean bool = true;
		while (bool) {
			byte i_9_ = method168(class96);
			if (i_9_ == 23) {
				break;
			}
			i_9_ = method168(class96);
			i_9_ = method168(class96);
			i_9_ = method168(class96);
			i_9_ = method168(class96);
			i_9_ = method168(class96);
			i_9_ = method168(class96);
			i_9_ = method168(class96);
			i_9_ = method168(class96);
			i_9_ = method168(class96);
			i_9_ = method171(class96);
			class96.anInt892 = 0;
			int i_10_ = method168(class96);
			class96.anInt892 = class96.anInt892 << 8 | i_10_ & 0xff;
			i_10_ = method168(class96);
			class96.anInt892 = class96.anInt892 << 8 | i_10_ & 0xff;
			i_10_ = method168(class96);
			class96.anInt892 = class96.anInt892 << 8 | i_10_ & 0xff;
			for (int i_11_ = 0; i_11_ < 16; i_11_++) {
				i_9_ = method171(class96);
				if (i_9_ == 1) {
					class96.aBooleanArray891[i_11_] = true;
				} else {
					class96.aBooleanArray891[i_11_] = false;
				}
			}
			for (int i_12_ = 0; i_12_ < 256; i_12_++) {
				class96.aBooleanArray893[i_12_] = false;
			}
			for (int i_13_ = 0; i_13_ < 16; i_13_++) {
				if (class96.aBooleanArray891[i_13_]) {
					for (int i_14_ = 0; i_14_ < 16; i_14_++) {
						i_9_ = method171(class96);
						if (i_9_ == 1) {
							class96.aBooleanArray893[i_13_ * 16 + i_14_] = true;
						}
					}
				}
			}
			method167(class96);
			final int i_15_ = class96.anInt902 + 2;
			final int i_16_ = method169(3, class96);
			final int i_17_ = method169(15, class96);
			for (int i_18_ = 0; i_18_ < i_17_; i_18_++) {
				int i_19_ = 0;
				for (;;) {
					i_9_ = method171(class96);
					if (i_9_ == 0) {
						break;
					}
					i_19_++;
				}
				class96.aByteArray886[i_18_] = (byte) i_19_;
			}
			final byte[] is_20_ = new byte[6];
			for (byte i_21_ = 0; i_21_ < i_16_; i_21_++) {
				is_20_[i_21_] = i_21_;
			}
			for (int i_22_ = 0; i_22_ < i_17_; i_22_++) {
				byte i_23_ = class96.aByteArray886[i_22_];
				final byte i_24_ = is_20_[i_23_];
				for (/**/; i_23_ > 0; i_23_--) {
					is_20_[i_23_] = is_20_[i_23_ - 1];
				}
				is_20_[0] = i_24_;
				class96.aByteArray914[i_22_] = i_24_;
			}
			for (int i_25_ = 0; i_25_ < i_16_; i_25_++) {
				int i_26_ = method169(5, class96);
				for (int i_27_ = 0; i_27_ < i_15_; i_27_++) {
					for (;;) {
						i_9_ = method171(class96);
						if (i_9_ == 0) {
							break;
						}
						i_9_ = method171(class96);
						if (i_9_ == 0) {
							i_26_++;
						} else {
							i_26_--;
						}
					}
					class96.aByteArrayArray894[i_25_][i_27_] = (byte) i_26_;
				}
			}
			for (int i_28_ = 0; i_28_ < i_16_; i_28_++) {
				int i_29_ = 32;
				byte i_30_ = 0;
				for (int i_31_ = 0; i_31_ < i_15_; i_31_++) {
					if (class96.aByteArrayArray894[i_28_][i_31_] > i_30_) {
						i_30_ = class96.aByteArrayArray894[i_28_][i_31_];
					}
					if (class96.aByteArrayArray894[i_28_][i_31_] < i_29_) {
						i_29_ = class96.aByteArrayArray894[i_28_][i_31_];
					}
				}
				method175(class96.anIntArrayArray909[i_28_], class96.anIntArrayArray904[i_28_], class96.anIntArrayArray910[i_28_], class96.aByteArrayArray894[i_28_], i_29_, i_30_, i_15_);
				class96.anIntArray896[i_28_] = i_29_;
			}
			final int i_32_ = class96.anInt902 + 1;
			int i_33_ = -1;
			int i_34_ = 0;
			for (int i_35_ = 0; i_35_ <= 255; i_35_++) {
				class96.anIntArray911[i_35_] = 0;
			}
			int i_36_ = 4095;
			for (int i_37_ = 15; i_37_ >= 0; i_37_--) {
				for (int i_38_ = 15; i_38_ >= 0; i_38_--) {
					class96.aByteArray889[i_36_] = (byte) (i_37_ * 16 + i_38_);
					i_36_--;
				}
				class96.anIntArray888[i_37_] = i_36_ + 1;
			}
			int i_39_ = 0;
			if (i_34_ == 0) {
				i_33_++;
				i_34_ = 50;
				final byte i_40_ = class96.aByteArray914[i_33_];
				i = class96.anIntArray896[i_40_];
				is = class96.anIntArrayArray909[i_40_];
				is_8_ = class96.anIntArrayArray910[i_40_];
				is_7_ = class96.anIntArrayArray904[i_40_];
			}
			i_34_--;
			int i_41_ = i;
			int i_42_;
			int i_43_;
			for (i_43_ = method169(i_41_, class96); i_43_ > is[i_41_]; i_43_ = i_43_ << 1 | i_42_) {
				i_41_++;
				i_42_ = method171(class96);
			}
			int i_44_ = is_8_[i_43_ - is_7_[i_41_]];
			while (i_44_ != i_32_) {
				if (i_44_ == 0 || i_44_ == 1) {
					int i_45_ = -1;
					int i_46_ = 1;
					do {
						if (i_44_ == 0) {
							i_45_ += 1 * i_46_;
						} else if (i_44_ == 1) {
							i_45_ += 2 * i_46_;
						}
						i_46_ *= 2;
						if (i_34_ == 0) {
							i_33_++;
							i_34_ = 50;
							final byte i_47_ = class96.aByteArray914[i_33_];
							i = class96.anIntArray896[i_47_];
							is = class96.anIntArrayArray909[i_47_];
							is_8_ = class96.anIntArrayArray910[i_47_];
							is_7_ = class96.anIntArrayArray904[i_47_];
						}
						i_34_--;
						i_41_ = i;
						for (i_43_ = method169(i_41_, class96); i_43_ > is[i_41_]; i_43_ = i_43_ << 1 | i_42_) {
							i_41_++;
							i_42_ = method171(class96);
						}
						i_44_ = is_8_[i_43_ - is_7_[i_41_]];
					} while (i_44_ == 0 || i_44_ == 1);
					i_45_++;
					i_10_ = class96.aByteArray913[class96.aByteArray889[class96.anIntArray888[0]] & 0xff];
					class96.anIntArray911[i_10_ & 0xff] += i_45_;
					for (/**/; i_45_ > 0; i_45_--) {
						Class120_Sub12_Sub14.anIntArray3239[i_39_] = i_10_ & 0xff;
						i_39_++;
					}
				} else {
					int i_48_ = i_44_ - 1;
					if (i_48_ < 16) {
						final int i_49_ = class96.anIntArray888[0];
						i_9_ = class96.aByteArray889[i_49_ + i_48_];
						for (/**/; i_48_ > 3; i_48_ -= 4) {
							final int i_50_ = i_49_ + i_48_;
							class96.aByteArray889[i_50_] = class96.aByteArray889[i_50_ - 1];
							class96.aByteArray889[i_50_ - 1] = class96.aByteArray889[i_50_ - 2];
							class96.aByteArray889[i_50_ - 2] = class96.aByteArray889[i_50_ - 3];
							class96.aByteArray889[i_50_ - 3] = class96.aByteArray889[i_50_ - 4];
						}
						for (/**/; i_48_ > 0; i_48_--) {
							class96.aByteArray889[i_49_ + i_48_] = class96.aByteArray889[i_49_ + i_48_ - 1];
						}
						class96.aByteArray889[i_49_] = i_9_;
					} else {
						int i_51_ = i_48_ / 16;
						final int i_52_ = i_48_ % 16;
						int i_53_ = class96.anIntArray888[i_51_] + i_52_;
						i_9_ = class96.aByteArray889[i_53_];
						for (/**/; i_53_ > class96.anIntArray888[i_51_]; i_53_--) {
							class96.aByteArray889[i_53_] = class96.aByteArray889[i_53_ - 1];
						}
						class96.anIntArray888[i_51_]++;
						for (/**/; i_51_ > 0; i_51_--) {
							class96.anIntArray888[i_51_]--;
							class96.aByteArray889[class96.anIntArray888[i_51_]] = class96.aByteArray889[class96.anIntArray888[i_51_ - 1] + 16 - 1];
						}
						class96.anIntArray888[0]--;
						class96.aByteArray889[class96.anIntArray888[0]] = i_9_;
						if (class96.anIntArray888[0] == 0) {
							i_36_ = 4095;
							for (int i_54_ = 15; i_54_ >= 0; i_54_--) {
								for (int i_55_ = 15; i_55_ >= 0; i_55_--) {
									class96.aByteArray889[i_36_] = class96.aByteArray889[class96.anIntArray888[i_54_] + i_55_];
									i_36_--;
								}
								class96.anIntArray888[i_54_] = i_36_ + 1;
							}
						}
					}
					class96.anIntArray911[class96.aByteArray913[i_9_ & 0xff] & 0xff]++;
					Class120_Sub12_Sub14.anIntArray3239[i_39_] = class96.aByteArray913[i_9_ & 0xff] & 0xff;
					i_39_++;
					if (i_34_ == 0) {
						i_33_++;
						i_34_ = 50;
						final byte i_56_ = class96.aByteArray914[i_33_];
						i = class96.anIntArray896[i_56_];
						is = class96.anIntArrayArray909[i_56_];
						is_8_ = class96.anIntArrayArray910[i_56_];
						is_7_ = class96.anIntArrayArray904[i_56_];
					}
					i_34_--;
					i_41_ = i;
					for (i_43_ = method169(i_41_, class96); i_43_ > is[i_41_]; i_43_ = i_43_ << 1 | i_42_) {
						i_41_++;
						i_42_ = method171(class96);
					}
					i_44_ = is_8_[i_43_ - is_7_[i_41_]];
				}
			}
			class96.anInt895 = 0;
			class96.aByte908 = (byte) 0;
			class96.anIntArray890[0] = 0;
			for (int i_57_ = 1; i_57_ <= 256; i_57_++) {
				class96.anIntArray890[i_57_] = class96.anIntArray911[i_57_ - 1];
			}
			for (int i_58_ = 1; i_58_ <= 256; i_58_++) {
				class96.anIntArray890[i_58_] += class96.anIntArray890[i_58_ - 1];
			}
			for (int i_59_ = 0; i_59_ < i_39_; i_59_++) {
				i_10_ = (byte) (Class120_Sub12_Sub14.anIntArray3239[i_59_] & 0xff);
				Class120_Sub12_Sub14.anIntArray3239[class96.anIntArray890[i_10_ & 0xff]] |= i_59_ << 8;
				class96.anIntArray890[i_10_ & 0xff]++;
			}
			class96.anInt897 = Class120_Sub12_Sub14.anIntArray3239[class96.anInt892] >> 8;
			class96.anInt912 = 0;
			class96.anInt897 = Class120_Sub12_Sub14.anIntArray3239[class96.anInt897];
			class96.anInt899 = (byte) (class96.anInt897 & 0xff);
			class96.anInt897 >>= 8;
			class96.anInt912++;
			class96.anInt916 = i_39_;
			method174(class96);
			if (class96.anInt912 == class96.anInt916 + 1 && class96.anInt895 == 0) {
				bool = true;
			} else {
				bool = false;
			}
		}
	}

	private static final void method174(final Class96 class96) {
		byte i = class96.aByte908;
		int i_60_ = class96.anInt895;
		int i_61_ = class96.anInt912;
		int i_62_ = class96.anInt899;
		final int[] is = Class120_Sub12_Sub14.anIntArray3239;
		int i_63_ = class96.anInt897;
		final byte[] is_64_ = class96.aByteArray903;
		int i_65_ = class96.anInt917;
		int i_66_ = class96.anInt906;
		final int i_67_ = i_66_;
		final int i_68_ = class96.anInt916 + 1;
		while_0_: for (;;) {
			if (i_60_ > 0) {
				for (;;) {
					if (i_66_ == 0) {
						break while_0_;
					}
					if (i_60_ == 1) {
						break;
					}
					is_64_[i_65_] = i;
					i_60_--;
					i_65_++;
					i_66_--;
				}
				if (i_66_ == 0) {
					i_60_ = 1;
					break;
				}
				is_64_[i_65_] = i;
				i_65_++;
				i_66_--;
			}
			boolean bool = true;
			while (bool) {
				bool = false;
				if (i_61_ == i_68_) {
					i_60_ = 0;
					break while_0_;
				}
				i = (byte) i_62_;
				i_63_ = is[i_63_];
				final int i_69_ = (byte) (i_63_ & 0xff);
				i_63_ >>= 8;
				i_61_++;
				if (i_69_ != i_62_) {
					i_62_ = i_69_;
					if (i_66_ == 0) {
						i_60_ = 1;
						break while_0_;
					}
					is_64_[i_65_] = i;
					i_65_++;
					i_66_--;
					bool = true;
				} else if (i_61_ == i_68_) {
					if (i_66_ == 0) {
						i_60_ = 1;
						break while_0_;
					}
					is_64_[i_65_] = i;
					i_65_++;
					i_66_--;
					bool = true;
				}
			}
			i_60_ = 2;
			i_63_ = is[i_63_];
			int i_70_ = (byte) (i_63_ & 0xff);
			i_63_ >>= 8;
			if (++i_61_ != i_68_) {
				if (i_70_ != i_62_) {
					i_62_ = i_70_;
				} else {
					i_60_ = 3;
					i_63_ = is[i_63_];
					i_70_ = (byte) (i_63_ & 0xff);
					i_63_ >>= 8;
					if (++i_61_ != i_68_) {
						if (i_70_ != i_62_) {
							i_62_ = i_70_;
						} else {
							i_63_ = is[i_63_];
							i_70_ = (byte) (i_63_ & 0xff);
							i_63_ >>= 8;
							i_61_++;
							i_60_ = (i_70_ & 0xff) + 4;
							i_63_ = is[i_63_];
							i_62_ = (byte) (i_63_ & 0xff);
							i_63_ >>= 8;
							i_61_++;
						}
					}
				}
			}
		}
		class96.anInt885 += i_67_ - i_66_;
		if (class96.anInt885 != 0) {
			/* empty */
		}
		class96.aByte908 = i;
		class96.anInt895 = i_60_;
		class96.anInt912 = i_61_;
		class96.anInt899 = i_62_;
		Class120_Sub12_Sub14.anIntArray3239 = is;
		class96.anInt897 = i_63_;
		class96.aByteArray903 = is_64_;
		class96.anInt917 = i_65_;
		class96.anInt906 = i_66_;
	}

	private static final void method175(final int[] is, final int[] is_72_, final int[] is_73_, final byte[] is_74_, final int i, final int i_75_, final int i_76_) {
		int i_77_ = 0;
		for (int i_78_ = i; i_78_ <= i_75_; i_78_++) {
			for (int i_79_ = 0; i_79_ < i_76_; i_79_++) {
				if (is_74_[i_79_] == i_78_) {
					is_73_[i_77_] = i_79_;
					i_77_++;
				}
			}
		}
		for (int i_80_ = 0; i_80_ < 23; i_80_++) {
			is_72_[i_80_] = 0;
		}
		for (int i_81_ = 0; i_81_ < i_76_; i_81_++) {
			is_72_[is_74_[i_81_] + 1]++;
		}
		for (int i_82_ = 1; i_82_ < 23; i_82_++) {
			is_72_[i_82_] += is_72_[i_82_ - 1];
		}
		for (int i_83_ = 0; i_83_ < 23; i_83_++) {
			is[i_83_] = 0;
		}
		int i_84_ = 0;
		for (int i_85_ = i; i_85_ <= i_75_; i_85_++) {
			i_84_ += is_72_[i_85_ + 1] - is_72_[i_85_];
			is[i_85_] = i_84_ - 1;
			i_84_ <<= 1;
		}
		for (int i_86_ = i + 1; i_86_ <= i_75_; i_86_++) {
			is_72_[i_86_] = (is[i_86_ - 1] + 1 << 1) - is_72_[i_86_];
		}
	}
}
