/* Class126 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Huffman {
	static int anInt1204 = 0;
	private final int[] anIntArray1205;
	private final byte[] aByteArray1206;
	static boolean aBoolean1207 = false;
	static int menuDrawX;
	private int[] anIntArray1210;

	static final boolean method1882(final int i, final int i_0_, final boolean bool, final String string) {
		boolean bool_1_;
		try {
			if (i < 2 || i > 36) {
				throw new IllegalArgumentException(new StringBuilder("Invalid radix:").append(i).toString());
			}
			boolean bool_2_ = false;
			boolean bool_3_ = false;
			if (i_0_ != 55) {
				method1884(24, true, false, false);
			}
			final int i_4_ = string.length();
			int i_5_ = 0;
			for (int i_6_ = 0; i_4_ > i_6_; i_6_++) {
				int i_7_ = string.charAt(i_6_);
				if (i_6_ == 0) {
					if (i_7_ == 45) {
						bool_2_ = true;
						continue;
					}
					if (i_7_ == 43 && bool) {
						continue;
					}
				}
				if (i_7_ >= 48 && i_7_ <= 57) {
					i_7_ -= 48;
				} else if (i_7_ >= 65 && i_7_ <= 90) {
					i_7_ -= 55;
				} else if (i_7_ >= 97 && i_7_ <= 122) {
					i_7_ -= 87;
				} else {
					return false;
				}
				if (i_7_ >= i) {
					return false;
				}
				if (bool_2_) {
					i_7_ = -i_7_;
				}
				final int i_8_ = i_7_ + i * i_5_;
				if (i_8_ / i != i_5_) {
					return false;
				}
				bool_3_ = true;
				i_5_ = i_8_;
			}
			bool_1_ = bool_3_;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("oj.C(").append(i).append(',').append(i_0_).append(',').append(bool).append(',').append(string != null ? "{...}" : "null").append(')').toString());
		}
		return bool_1_;
	}

	static final byte[] method1883(final int i, final byte[] is) {
		byte[] is_9_;
		try {
			if (is == null) {
				return null;
			}
			final byte[] is_10_ = new byte[is.length];
			if (i != 64) {
				aBoolean1207 = true;
			}
			ArrayUtils.arrayCopy(is, 0, is_10_, 0, is.length);
			is_9_ = is_10_;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("oj.A(").append(i).append(',').append(is != null ? "{...}" : "null").append(')').toString());
		}
		return is_9_;
	}

	static final js5 method1884(final int i_12_, final boolean bool, final boolean bool_11_, final boolean bool_13_) {
		FileSystem fileSystem = null;
		if (Class73.aClass193_663 != null) {
			fileSystem = new FileSystem(i_12_, Class73.aClass193_663, ClanMember.aClass193Array2581[i_12_], 1000000);
		}
		Class120_Sub12_Sub26.aClass53_Sub1Array3337[i_12_] = EnumType.aClass112_3460.method993(Class120_Sub12_Sub5.aClass51_3164, fileSystem, i_12_);
		if (bool_13_) {
			Class120_Sub12_Sub26.aClass53_Sub1Array3337[i_12_].method471();
		}
		return new js5(Class120_Sub12_Sub26.aClass53_Sub1Array3337[i_12_], bool_11_, bool);
	}

	final int method1885(final int i, int i_14_, final int i_15_, final byte[] is, final byte[] is_16_, int i_17_) {
		int i_18_;
		try {
			i_17_ += i_14_;
			int i_19_ = 0;
			int i_20_ = i << 3;
			for (/**/; i_14_ < i_17_; i_14_++) {
				final int i_21_ = 0xff & is_16_[i_14_];
				final int i_22_ = anIntArray1205[i_21_];
				final int i_23_ = aByteArray1206[i_21_];
				if (i_23_ == 0) {
					throw new RuntimeException(new StringBuilder("No codeword for data value ").append(i_21_).toString());
				}
				int i_24_ = i_20_ >> 3;
				int i_25_ = 0x7 & i_20_;
				i_20_ += i_23_;
				i_19_ &= -i_25_ >> 31;
				final int i_26_ = i_24_ + (i_23_ + i_25_ - 1 >> 3);
				i_25_ += 24;
				is[i_24_] = (byte) (i_19_ = Class191.method2512(i_19_, i_22_ >>> i_25_));
				if (i_26_ > i_24_) {
					i_24_++;
					i_25_ -= 8;
					is[i_24_] = (byte) (i_19_ = i_22_ >>> i_25_);
					if (i_26_ > i_24_) {
						i_24_++;
						i_25_ -= 8;
						is[i_24_] = (byte) (i_19_ = i_22_ >>> i_25_);
						if (i_26_ > i_24_) {
							i_24_++;
							i_25_ -= 8;
							is[i_24_] = (byte) (i_19_ = i_22_ >>> i_25_);
							if (i_24_ < i_26_) {
								i_25_ -= 8;
								i_24_++;
								is[i_24_] = (byte) (i_19_ = i_22_ << -i_25_);
							}
						}
					}
				}
			}
			i_18_ = -i + (7 + i_20_ >> 3);
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("oj.B(").append(i).append(',').append(i_14_).append(',').append(i_15_).append(',').append(is != null ? "{...}" : "null").append(',').append(is_16_ != null ? "{...}" : "null").append(',').append(i_17_).append(')')
					.toString());
		}
		return i_18_;
	}

	final int method1886(int i, final int i_27_, final int i_28_, final byte[] is, final byte[] is_29_, int i_30_) {
		int i_31_;
		try {
			if (i_30_ == 0) {
				return 0;
			}
			i_30_ += i;
			int i_32_ = 0;
			int i_33_ = i_27_;
			for (;;) {
				final byte i_34_ = is[i_33_];
				if (i_34_ < 0) {
					i_32_ = anIntArray1210[i_32_];
				} else {
					i_32_++;
				}
				int i_35_;
				if (((i_35_ = anIntArray1210[i_32_]) ^ 0xffffffff) > -1) {
					is_29_[i++] = (byte) (i_35_ ^ 0xffffffff);
					if (i >= i_30_) {
						break;
					}
					i_32_ = 0;
				}
				if ((0x40 & i_34_) == 0) {
					i_32_++;
				} else {
					i_32_ = anIntArray1210[i_32_];
				}
				if (((i_35_ = anIntArray1210[i_32_]) ^ 0xffffffff) > -1) {
					is_29_[i++] = (byte) (i_35_ ^ 0xffffffff);
					if (i >= i_30_) {
						break;
					}
					i_32_ = 0;
				}
				if ((i_34_ & 0x20) == 0) {
					i_32_++;
				} else {
					i_32_ = anIntArray1210[i_32_];
				}
				if ((i_35_ = anIntArray1210[i_32_]) < 0) {
					is_29_[i++] = (byte) (i_35_ ^ 0xffffffff);
					if (i_30_ <= i) {
						break;
					}
					i_32_ = 0;
				}
				if ((0x10 & i_34_) == 0) {
					i_32_++;
				} else {
					i_32_ = anIntArray1210[i_32_];
				}
				if ((i_35_ = anIntArray1210[i_32_]) < 0) {
					is_29_[i++] = (byte) (i_35_ ^ 0xffffffff);
					if (i_30_ <= i) {
						break;
					}
					i_32_ = 0;
				}
				if ((0x8 & i_34_) != 0) {
					i_32_ = anIntArray1210[i_32_];
				} else {
					i_32_++;
				}
				if ((i_35_ = anIntArray1210[i_32_]) < 0) {
					is_29_[i++] = (byte) (i_35_ ^ 0xffffffff);
					if (i_30_ <= i) {
						break;
					}
					i_32_ = 0;
				}
				if ((0x4 & i_34_) != 0) {
					i_32_ = anIntArray1210[i_32_];
				} else {
					i_32_++;
				}
				if ((i_35_ = anIntArray1210[i_32_]) < 0) {
					is_29_[i++] = (byte) (i_35_ ^ 0xffffffff);
					if (i_30_ <= i) {
						break;
					}
					i_32_ = 0;
				}
				if ((i_34_ & 0x2) == 0) {
					i_32_++;
				} else {
					i_32_ = anIntArray1210[i_32_];
				}
				if ((i_35_ = anIntArray1210[i_32_]) < 0) {
					is_29_[i++] = (byte) (i_35_ ^ 0xffffffff);
					if (i_30_ <= i) {
						break;
					}
					i_32_ = 0;
				}
				if ((0x1 & i_34_) != 0) {
					i_32_ = anIntArray1210[i_32_];
				} else {
					i_32_++;
				}
				if ((i_35_ = anIntArray1210[i_32_]) < 0) {
					is_29_[i++] = (byte) (i_35_ ^ 0xffffffff);
					if (i_30_ <= i) {
						break;
					}
					i_32_ = 0;
				}
				i_33_++;
			}
			i_31_ = i_33_ - -1 + -i_27_;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("oj.F(").append(i).append(',').append(i_27_).append(',').append(i_28_).append(',').append(is != null ? "{...}" : "null").append(',').append(is_29_ != null ? "{...}" : "null").append(',').append(i_30_).append(')')
					.toString());
		}
		return i_31_;
	}

	static final int[][] method1887(final int i, final int i_36_, final int i_37_, final int i_38_, final int i_39_, final int i_40_, final float f, final int i_41_, final boolean bool) {
		int[][] is;
		try {
			final int[][] is_42_ = new int[i][i_39_];
			final Class120_Sub12_Sub12 class120_sub12_sub12 = new Class120_Sub12_Sub12();
			class120_sub12_sub12.anInt3225 = i_37_;
			class120_sub12_sub12.anInt3229 = i_41_;
			class120_sub12_sub12.anInt3228 = i_40_;
			class120_sub12_sub12.anInt3221 = (int) (f * 4096.0F);
			class120_sub12_sub12.aBoolean3226 = bool;
			class120_sub12_sub12.postDecode();
			Class22.method199(i_39_, i, false);
			for (int i_43_ = 0; i_43_ < i; i_43_++) {
				class120_sub12_sub12.method1261(is_42_[i_43_], i_43_, -126);
			}
			is = is_42_;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("oj.D(").append(i).append(',').append(i_36_).append(',').append(i_37_).append(',').append(i_38_).append(',').append(i_39_).append(',').append(i_40_).append(',').append(f).append(',').append(i_41_).append(',')
					.append(bool).append(')').toString());
		}
		return is;
	}

	Huffman(final byte[] is) {
		final int i = is.length;
		aByteArray1206 = is;
		anIntArray1210 = new int[8];
		int i_44_ = 0;
		final int[] is_45_ = new int[33];
		anIntArray1205 = new int[i];
		for (int i_46_ = 0; i > i_46_; i_46_++) {
			final int i_47_ = is[i_46_];
			if (i_47_ != 0) {
				final int i_48_ = 1 << 32 - i_47_;
				final int i_49_ = is_45_[i_47_];
				anIntArray1205[i_46_] = i_49_;
				int i_50_;
				if ((i_48_ & i_49_) != 0) {
					i_50_ = is_45_[-1 + i_47_];
				} else {
					for (int i_51_ = i_47_ + -1; i_51_ >= 1; i_51_--) {
						final int i_52_ = is_45_[i_51_];
						if (i_49_ != i_52_) {
							break;
						}
						final int i_53_ = 1 << 32 - i_51_;
						if ((i_52_ & i_53_) != 0) {
							is_45_[i_51_] = is_45_[i_51_ - 1];
							break;
						}
						is_45_[i_51_] = Class191.method2512(i_53_, i_52_);
					}
					i_50_ = i_49_ | i_48_;
				}
				is_45_[i_47_] = i_50_;
				for (int i_54_ = i_47_ + 1; i_54_ <= 32; i_54_++) {
					if (i_49_ == is_45_[i_54_]) {
						is_45_[i_54_] = i_50_;
					}
				}
				int i_55_ = 0;
				for (int i_56_ = 0; i_56_ < i_47_; i_56_++) {
					int i_57_ = -2147483648 >>> i_56_;
					if ((i_57_ & i_49_) == 0) {
						i_55_++;
					} else {
						if (anIntArray1210[i_55_] == 0) {
							anIntArray1210[i_55_] = i_44_;
						}
						i_55_ = anIntArray1210[i_55_];
					}
					i_57_ >>>= 1;
					if (anIntArray1210.length <= i_55_) {
						final int[] is_58_ = new int[2 * anIntArray1210.length];
						for (int i_59_ = 0; i_59_ < anIntArray1210.length; i_59_++) {
							is_58_[i_59_] = anIntArray1210[i_59_];
						}
						anIntArray1210 = is_58_;
					}
				}
				if (i_44_ <= i_55_) {
					i_44_ = 1 + i_55_;
				}
				anIntArray1210[i_55_] = i_46_ ^ 0xffffffff;
			}
		}
	}
}
