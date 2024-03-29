/* Class126 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Huffman {
	static int pressedInventoryIndex = 0;
	private final int[] anIntArray1205;
	private final byte[] aByteArray1206;
	static boolean draggingClickedInventoryObject = false;
	static int menuDrawX;
	private int[] anIntArray1210;

	static final boolean isValidStringRadix(final String string, final int radix, final boolean bool) {
		if (radix < 2 || radix > 36) {
			throw new IllegalArgumentException("Invalid radix:" + radix);
		}
		boolean bool_2_ = false;
		boolean bool_3_ = false;
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
			if (i_7_ >= radix) {
				return false;
			}
			if (bool_2_) {
				i_7_ = -i_7_;
			}
			final int i_8_ = i_7_ + radix * i_5_;
			if (i_8_ / radix != i_5_) {
				return false;
			}
			bool_3_ = true;
			i_5_ = i_8_;
		}
		return bool_3_;
	}

	static final js5 method1884(final int indexId, final boolean bool, final boolean bool_11_, final boolean bool_13_) {
		FileSystem fileSystem = null;
		if (MapFunctionType.aClass193_663 != null) {
			fileSystem = new FileSystem(indexId, MapFunctionType.aClass193_663, ClanMember.aClass193Array2581[indexId], 1000000);
		}
		Class120_Sub12_Sub26.aClass53_Sub1Array3337[indexId] = EnumType.aClass112_3460.method993(Class120_Sub12_Sub5.masterIndexFileSystem, fileSystem, indexId);
		if (bool_13_) {
			Class120_Sub12_Sub26.aClass53_Sub1Array3337[indexId].method471();
		}
		return new js5(Class120_Sub12_Sub26.aClass53_Sub1Array3337[indexId], bool_11_, bool);
	}

	final int method1885(final int outOff, final byte[] outBuffer, final byte[] srcBuffer, int srcOff, int srcLength) {
		srcLength += srcOff;
		int i_19_ = 0;
		int i_20_ = outOff << 3;
		for (/**/; srcOff < srcLength; srcOff++) {
			final int i_21_ = 0xff & srcBuffer[srcOff];
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
			outBuffer[i_24_] = (byte) (i_19_ = ChunkAtmosphere.method2512(i_19_, i_22_ >>> i_25_));
			if (i_26_ > i_24_) {
				i_24_++;
				i_25_ -= 8;
				outBuffer[i_24_] = (byte) (i_19_ = i_22_ >>> i_25_);
				if (i_26_ > i_24_) {
					i_24_++;
					i_25_ -= 8;
					outBuffer[i_24_] = (byte) (i_19_ = i_22_ >>> i_25_);
					if (i_26_ > i_24_) {
						i_24_++;
						i_25_ -= 8;
						outBuffer[i_24_] = (byte) (i_19_ = i_22_ >>> i_25_);
						if (i_24_ < i_26_) {
							i_25_ -= 8;
							i_24_++;
							outBuffer[i_24_] = (byte) (i_19_ = i_22_ << -i_25_);
						}
					}
				}
			}
		}
		return -outOff + (7 + i_20_ >> 3);
	}

	final int method1886(final byte[] outputBuffer, int outputBufferPos, final byte[] inputBuffer, final int inputBufferPos, int len) {
		if (len == 0) {
			return 0;
		}
		len += outputBufferPos;
		int i_32_ = 0;
		int i_33_ = inputBufferPos;
		for (;;) {
			final byte i_34_ = inputBuffer[i_33_];
			if (i_34_ < 0) {
				i_32_ = anIntArray1210[i_32_];
			} else {
				i_32_++;
			}
			int i_35_;
			if (((i_35_ = anIntArray1210[i_32_]) ^ 0xffffffff) > -1) {
				outputBuffer[outputBufferPos++] = (byte) (i_35_ ^ 0xffffffff);
				if (outputBufferPos >= len) {
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
				outputBuffer[outputBufferPos++] = (byte) (i_35_ ^ 0xffffffff);
				if (outputBufferPos >= len) {
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
				outputBuffer[outputBufferPos++] = (byte) (i_35_ ^ 0xffffffff);
				if (len <= outputBufferPos) {
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
				outputBuffer[outputBufferPos++] = (byte) (i_35_ ^ 0xffffffff);
				if (len <= outputBufferPos) {
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
				outputBuffer[outputBufferPos++] = (byte) (i_35_ ^ 0xffffffff);
				if (len <= outputBufferPos) {
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
				outputBuffer[outputBufferPos++] = (byte) (i_35_ ^ 0xffffffff);
				if (len <= outputBufferPos) {
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
				outputBuffer[outputBufferPos++] = (byte) (i_35_ ^ 0xffffffff);
				if (len <= outputBufferPos) {
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
				outputBuffer[outputBufferPos++] = (byte) (i_35_ ^ 0xffffffff);
				if (len <= outputBufferPos) {
					break;
				}
				i_32_ = 0;
			}
			i_33_++;
		}
		return i_33_ - -1 + -inputBufferPos;
	}

	static final int[][] method1887(final int i, final int i_37_, final int i_38_, final int i_39_, final int i_40_, final float f, final int i_41_, final boolean bool) {
		final int[][] is_42_ = new int[i][i_39_];
		final Class120_Sub12_Sub12 class120_sub12_sub12 = new Class120_Sub12_Sub12();
		class120_sub12_sub12.anInt3225 = i_37_;
		class120_sub12_sub12.anInt3229 = i_41_;
		class120_sub12_sub12.anInt3228 = i_40_;
		class120_sub12_sub12.anInt3221 = (int) (f * 4096.0F);
		class120_sub12_sub12.aBoolean3226 = bool;
		class120_sub12_sub12.postDecode();
		Class22.method199(i_39_, i);
		for (int i_43_ = 0; i_43_ < i; i_43_++) {
			class120_sub12_sub12.method1261(is_42_[i_43_], i_43_);
		}
		return is_42_;
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
						is_45_[i_51_] = i_53_ | i_52_;
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
