/* Class120_Sub7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.math.BigInteger;

class Buffer extends Node {
	static String[] playerOptions;
	byte[] buf;
	int pos;
	static int anInt2471;
	static int gameId;
	static int anInt2473 = 0;
	static int anInt2474;
	static int subScriptAmount;
	static String[] languageArray;
	static int[] anIntArray2477;

	static {
		gameId = 0;
		playerOptions = new String[8];
		subScriptAmount = 0;
		languageArray = new String[] { "en", "de", "fr", "pt" };
	}

	public static void method1076(final byte i) {
		try {
			anIntArray2477 = null;
			languageArray = null;
			playerOptions = null;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("fd.I(").append(i).append(')').toString());
		}
	}

	final void putJagexString(final String string) {
		final int i_0_ = string.indexOf('\0');
		if (i_0_ >= 0) {
			throw new IllegalArgumentException("NUL character at " + i_0_ + " - cannot pjstr");
		}
		this.pos += FileSystemWorker.a(this.buf, string, string.length(), this.pos, 0);
		this.buf[this.pos++] = (byte) 0;
	}

	final int getShort() {//getshort
		this.pos += 2;
		int i_1_ = (0xff00 & this.buf[this.pos - 2] << 8) + (0xff & this.buf[this.pos - 1]);
		if (i_1_ > 32767) {
			i_1_ -= 65536;
		}
		return i_1_;
	}

	final void method1079(final int i, final int i_2_) {
		try {
			if (i_2_ >= 0 && i_2_ < 128) {
				putByte(i_2_);
			} else if (i_2_ >= 0 && -32769 < (i_2_ ^ 0xffffffff)) {
				putShort(32768 - -i_2_);
			} else if (i == -32769) {
				throw new IllegalArgumentException();
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("fd.TB(").append(i).append(',').append(i_2_).append(')').toString());
		}
	}

	final void putByteC(final int i) {
		this.buf[this.pos++] = (byte) (-i);
	}

	final int getUSmart() {
		final int i_5_ = 0xff & this.buf[this.pos];
		if (i_5_ >= 128) {
			return getUShort() - 32768;
		}
		return getUByte();
	}

	final void method1082(final int i, final int i_6_) {
		try {
			if (i_6_ < 98) {
				anIntArray2477 = null;
			}
			if ((~0x7f & i) != 0) {
				if ((~0x3fff & i) != 0) {
					if ((i & ~0x1fffff) != 0) {
						if ((~0xfffffff & i) != 0) {
							putByte(i >>> 28 | 0x80);
						}
						putByte(0x80 | i >>> 21);
					}
					putByte(0x80 | i >>> 14);
				}
				putByte(i >>> 7 | 0x80);
			}
			putByte(0x7f & i);
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("fd.EA(").append(i).append(',').append(i_6_).append(')').toString());
		}
	}

	final void putByte(final int i) {
		this.buf[this.pos++] = (byte) i;
	}

	final void putLong(final long l) {
		this.buf[this.pos++] = (byte) (int) (l >> 56);
		this.buf[this.pos++] = (byte) (int) (l >> 48);
		this.buf[this.pos++] = (byte) (int) (l >> 40);
		this.buf[this.pos++] = (byte) (int) (l >> 32);
		this.buf[this.pos++] = (byte) (int) (l >> 24);
		this.buf[this.pos++] = (byte) (int) (l >> 16);
		this.buf[this.pos++] = (byte) (int) (l >> 8);
		this.buf[this.pos++] = (byte) (int) l;
	}

	final int getInt1() {
		this.pos += 4;
		return ((this.buf[-1 + this.pos] & 0xff) << 16) + (~0xffffff & this.buf[this.pos + -2] << 24) - -(this.buf[-4 + this.pos] << 8 & 0xff00) + (0xff & this.buf[-3 + this.pos]);
	}

	final void putInt2(final int i_9_) {
		this.buf[this.pos++] = (byte) (i_9_ >> 16);
		this.buf[this.pos++] = (byte) (i_9_ >> 24);
		this.buf[this.pos++] = (byte) i_9_;
		this.buf[this.pos++] = (byte) (i_9_ >> 8);
	}

	final int method1087(final boolean bool) {
		int i;
		try {
			if (!bool) {
				subScriptAmount = -16;
			}
			this.pos += 2;
			int i_10_ = ((this.buf[this.pos - 1] & 0xff) << 8) + (0xff & this.buf[this.pos + -2]);
			if (i_10_ > 32767) {
				i_10_ -= 65536;
			}
			i = i_10_;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("fd.OA(").append(bool).append(')').toString());
		}
		return i;
	}

	final void putByteS(final int i_11_) {
		this.buf[this.pos++] = (byte) (128 - i_11_);
	}

	final int getInt2() {
		this.pos += 4;
		return (this.buf[this.pos - 2] & 0xff) + ((0xff & this.buf[-4 + this.pos]) << 16) + (~0xffffff & this.buf[-3 + this.pos] << 24) + (0xff00 & this.buf[this.pos + -1] << 8);
	}

	final int getULEShortA() {
		this.pos += 2;
		return ((0xff & this.buf[this.pos - 1]) << 8) - -(0xff & this.buf[-2 + this.pos] - 128);
	}

	final int getUByteC() {
		return -this.buf[this.pos++] & 0xff;
	}

	final int method1092(final byte i) {
		int i_15_;
		try {
			this.pos += 3;
			if (i > -119) {
				return -21;
			}
			i_15_ = (this.buf[-2 + this.pos] << 16 & 0xff0000) + ((this.buf[this.pos + -3] & 0xff) << 8) + (this.buf[-1 + this.pos] & 0xff);
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("fd.F(").append(i).append(')').toString());
		}
		return i_15_;
	}

	final void putInt1(final int i_16_) {
		this.buf[this.pos++] = (byte) (i_16_ >> 8);
		this.buf[this.pos++] = (byte) i_16_;
		this.buf[this.pos++] = (byte) (i_16_ >> 24);
		this.buf[this.pos++] = (byte) (i_16_ >> 16);
	}

	static final void method1094(final int i, final int i_17_, final int i_18_, final int i_19_, final LocType locType, final byte i_20_, final int i_21_, final int i_22_, final int i_23_) {
		try {
			final int i_24_ = 0x3 & i_18_;
			int i_25_;
			int i_26_;
			if (i_24_ != 1 && i_24_ != 3) {
				i_25_ = locType.anInt1841;
				i_26_ = locType.anInt1827;
			} else {
				i_25_ = locType.anInt1827;
				i_26_ = locType.anInt1841;
			}
			int i_27_;
			int i_28_;
			if (i_25_ + i <= 104) {
				i_28_ = (i_25_ >> 1) + i;
				i_27_ = i + (i_25_ - -1 >> 1);
			} else {
				i_27_ = i - -1;
				i_28_ = i;
			}
			int i_29_;
			int i_30_;
			if (i_22_ - -i_26_ <= 104) {
				i_30_ = (i_26_ >> 1) + i_22_;
				i_29_ = (1 + i_26_ >> 1) + i_22_;
			} else {
				i_29_ = 1 + i_22_;
				i_30_ = i_22_;
			}
			final int i_31_ = (i_26_ << 6) + (i_22_ << 7);
			final int[][] is = OverridedJInterface.tileHeightMap[i_19_];
			final int i_32_ = (i << 7) - -(i_25_ << 6);
			final int i_33_ = is[i_28_][i_29_] + is[i_27_][i_30_] + is[i_28_][i_30_] - -is[i_27_][i_29_] >> 2;
			int i_34_ = 0;
			if (i_20_ != 93) {
				anInt2474 = 36;
			}
			if (i_19_ != 0) {
				final int[][] is_35_ = OverridedJInterface.tileHeightMap[0];
				i_34_ = -(is_35_[i_28_][i_29_] + is_35_[i_28_][i_30_] - (-is_35_[i_27_][i_30_] + -is_35_[i_27_][i_29_]) >> 2) + i_33_;
			}
			int[][] is_36_ = null;
			if (i_19_ < 3) {
				is_36_ = OverridedJInterface.tileHeightMap[i_19_ - -1];
			}
			final Class88 class88 = locType.method2453(i_32_, false, i_23_, i_33_, is, is_36_, true, i_18_, i_31_, i_20_ ^ ~0x2d, null);
			Class47.method387(class88.aClass107_Sub1_830, -i_17_ + i_32_, i_34_, i_31_ - i_21_);
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception,
					new StringBuilder("fd.R(").append(i).append(',').append(i_17_).append(',').append(i_18_).append(',').append(i_19_).append(',').append(locType != null ? "{...}" : "null").append(',').append(i_20_).append(',').append(i_21_).append(',').append(i_22_).append(',').append(i_23_)
							.append(')').toString());
		}
	}

	final String getJString() {
		final int i_37_ = this.pos;
		while (this.buf[this.pos++] != 0) {
			/* empty */
		}
		return DisplayModeInfo.method2215(this.buf, i_37_, -1 + -i_37_ + this.pos);
	}

	final void putBuffer(final byte[] is, final int i, final int i_38_) {
		for (int i_40_ = i; i_40_ < i_38_ + i; i_40_++) {
			this.buf[this.pos++] = is[i_40_];
		}
	}

	final int getInt() {
		this.pos += 4;
		return (0xff & this.buf[-1 + this.pos]) + (~0xffffff & this.buf[this.pos - 4] << 24) - -(this.buf[this.pos - 3] << 16 & 0xff0000) - -((0xff & this.buf[this.pos - 2]) << 8);
	}

	final long method1098(int i_42_) {
		if (--i_42_ < 0 || i_42_ > 7) {
			throw new IllegalArgumentException();
		}
		long l_43_ = 0L;
		for (int i_44_ = i_42_ * 8; i_44_ >= 0; i_44_ -= 8) {
			l_43_ |= (0xffL & this.buf[this.pos++]) << i_44_;
		}
		return l_43_;
	}

	final int getSmart() {
		final int i_46_ = this.buf[this.pos] & 0xff;
		if (i_46_ >= 128) {
			return getUShort() - 49152;
		}
		return getUByte() - 64;
	}

	final int method1100() {
		int i_48_ = 0;
		int i_49_;
		for (i_49_ = getUSmart(); i_49_ == 32767; i_49_ = getUSmart()) {
			i_48_ += 32767;
		}
		i_48_ += i_49_;
		return i_48_;
	}

	final void putLEInt(final int i_87_) {
		this.buf[this.pos++] = (byte) i_87_;
		this.buf[this.pos++] = (byte) (i_87_ >> 8);
		this.buf[this.pos++] = (byte) (i_87_ >> 16);
		this.buf[this.pos++] = (byte) (i_87_ >> 24);
	}

	final void getBytesA(final byte[] buffer, final int off, final int len) {
		for (int id = off; id < len + off; id++) {
			buffer[id] = (byte) (this.buf[this.pos++] - 128);
		}
	}

	final boolean compareCrc() {
		this.pos -= 4;
		final int one = NodeSub.getCrc(this.buf, 0, this.pos);
		final int second = getInt();
		if (one == second) {
			return true;
		}
		return false;
	}

	final void putMedium(final int i_55_) {
		this.buf[this.pos++] = (byte) (i_55_ >> 16);
		this.buf[this.pos++] = (byte) (i_55_ >> 8);
		this.buf[this.pos++] = (byte) i_55_;
	}

	final void method1105(final byte i, final int i_56_) {
		try {
			if (i != 43) {
				getLong();
			}
			this.buf[this.pos++] = (byte) i_56_;
			this.buf[this.pos++] = (byte) (i_56_ >> 8);
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("fd.GA(").append(i).append(',').append(i_56_).append(')').toString());
		}
	}

	final void putFloatAsInt(final float f) {
		final int i = Float.floatToRawIntBits(f);
		this.buf[this.pos++] = (byte) (i >> 24);
		this.buf[this.pos++] = (byte) (i >> 16);
		this.buf[this.pos++] = (byte) (i >> 8);
		this.buf[this.pos++] = (byte) i;
	}

	final int getUByteS() {
		return 128 - this.buf[this.pos++] & 0xff;
	}

	final void method1108(final long l, final boolean bool, int i) {
		try {
			i--;
			if (!bool) {
				anInt2473 = 25;
			}
			if (i < 0 || i > 7) {
				throw new IllegalArgumentException();
			}
			for (int i_58_ = 8 * i; i_58_ >= 0; i_58_ -= 8) {
				this.buf[this.pos++] = (byte) (int) (l >> i_58_);
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("fd.Q(").append(l).append(',').append(bool).append(',').append(i).append(')').toString());
		}
	}

	final void method1109(final int[] is, final int i, final boolean bool, final int i_59_) {
		try {
			final int i_60_ = (i_59_ - i) / 8;
			final int i_61_ = this.pos;
			this.pos = i;
			if (!bool) {
				gameId = -65;
			}
			for (int i_62_ = 0; i_62_ < i_60_; i_62_++) {
				int i_63_ = getInt();
				int i_64_ = getInt();
				int i_65_ = -957401312;
				int i_67_ = 32;
				while ((i_67_-- ^ 0xffffffff) < -1) {
					i_64_ -= (i_63_ << 4 ^ i_63_ >>> 5) - -i_63_ ^ is[(i_65_ & 0x1927) >>> 11] + i_65_;
					i_65_ -= -1640531527;
					i_63_ -= (i_64_ << 4 ^ i_64_ >>> 5) + i_64_ ^ i_65_ + is[i_65_ & 0x3];
				}
				this.pos -= 8;
				putInt(i_63_);
				putInt(i_64_);
			}
			this.pos = i_61_;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("fd.CB(").append(is != null ? "{...}" : "null").append(',').append(i).append(',').append(bool).append(',').append(i_59_).append(')').toString());
		}
	}

	final byte getByteS() {
		return (byte) (128 - this.buf[this.pos++]);
	}

	final int method1111(final boolean bool) {
		int i;
		try {
			int i_69_ = this.buf[this.pos++];
			if (bool) {
				return 46;
			}
			int i_70_ = 0;
			for (/**/; i_69_ < 0; i_69_ = this.buf[this.pos++]) {
				i_70_ = (i_69_ & 0x7f | i_70_) << 7;
			}
			i = i_70_ | i_69_;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("fd.QA(").append(bool).append(')').toString());
		}
		return i;
	}

	final void method1112(final int i, final int i_71_) {
		try {
			if (i_71_ == -29605) {
				this.buf[-4 + -i + this.pos] = (byte) (i >> 24);
				this.buf[-3 + -i + this.pos] = (byte) (i >> 16);
				this.buf[this.pos - i - 2] = (byte) (i >> 8);
				this.buf[-i + this.pos + -1] = (byte) i;
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("fd.QB(").append(i).append(',').append(i_71_).append(')').toString());
		}
	}

	final void putByteA(final int i) {
		this.buf[this.pos++] = (byte) (i + 128);
	}

	final void getBuffer(final byte[] is, final int i_73_, final int i_74_) {
		for (int i_75_ = i_73_; i_74_ + i_73_ > i_75_; i_75_++) {
			is[i_75_] = this.buf[this.pos++];
		}
	}

	final void putLEShort(final int i_76_) {
		this.buf[this.pos++] = (byte) i_76_;
		this.buf[this.pos++] = (byte) (i_76_ >> 8);
	}

	final void putShortA(final int i_77_) {
		this.buf[this.pos++] = (byte) (i_77_ >> 8);
		this.buf[this.pos++] = (byte) (i_77_ + 128);
	}

	final byte getByteC() {
		return (byte) (-this.buf[this.pos++]);
	}

	final int getUShort() {
		this.pos += 2;
		return (0xff & this.buf[this.pos - 1]) + ((this.buf[this.pos - 2] & 0xff) << 8);
	}

	Buffer(final int i) {
		this.buf = Class159.method2092(126, i);
		this.pos = 0;
	}

	final void putInt(final int i) {
		this.buf[this.pos++] = (byte) (i >> 24);
		this.buf[this.pos++] = (byte) (i >> 16);
		this.buf[this.pos++] = (byte) (i >> 8);
		this.buf[this.pos++] = (byte) i;
	}

	final int getMedium() {
		this.pos += 3;
		return (0xff & this.buf[this.pos - 1]) + (this.buf[this.pos - 3] << 16 & 0xff0000) + ((this.buf[this.pos - 2] & 0xff) << 8);
	}

	static final void method1121(final int i) {
		try {
			if (i == -3 && Class86.loginStep == 5) {
				Class86.loginStep = 6;
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("fd.NB(").append(i).append(')').toString());
		}
	}

	final int getLEInt() {
		this.pos += 4;
		return (this.buf[this.pos + -4] & 0xff) + ((this.buf[this.pos + -1] & 0xff) << 24) - -((0xff & this.buf[-2 + this.pos]) << 16) + ((0xff & this.buf[-3 + this.pos]) << 8);
	}

	final int putCrc(final int off) {
		final int crc = NodeSub.getCrc(this.buf, off, this.pos);
		putInt(crc);
		return crc;
	}

	final long getLong() {
		final long l_84_ = 0xffffffffL & getInt();
		final long l_85_ = 0xffffffffL & getInt();
		return (l_84_ << 32) + l_85_;
	}

	final int getUByteA() {
		return this.buf[this.pos++] - 128 & 0xff;
	}

	final String getFastJString() {
		if (this.buf[this.pos] == 0) {
			this.pos++;
			return null;
		}
		return getJString();
	}

	final int getShortA() {
		this.pos += 2;
		int i_89_ = (-128 + this.buf[this.pos - 1] & 0xff) + ((0xff & this.buf[this.pos - 2]) << 8);
		if (i_89_ > 32767) {
			i_89_ -= 65536;
		}
		return i_89_;
	}

	Buffer(final byte[] is) {
		this.buf = is;
		this.pos = 0;
	}

	final void method1129(final boolean bool, final int[] is) {
		try {
			final int i = this.pos / 8;
			this.pos = 0;
			for (int i_90_ = 0; i > i_90_; i_90_++) {
				int i_91_ = getInt();
				int i_92_ = getInt();
				int i_93_ = 0;
				int i_95_ = 32;
				while ((i_95_-- ^ 0xffffffff) < -1) {
					i_91_ += i_92_ + (i_92_ << 4 ^ i_92_ >>> 5) ^ i_93_ - -is[i_93_ & 0x3];
					i_93_ += -1640531527;
					i_92_ += i_93_ - -is[~0x50bffffc & i_93_ >>> 11] ^ (i_91_ >>> 5 ^ i_91_ << 4) + i_91_;
				}
				this.pos -= 8;
				putInt(i_91_);
				putInt(i_92_);
			}
			if (bool) {
				getFastJString();
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("fd.KA(").append(bool).append(',').append(is != null ? "{...}" : "null").append(')').toString());
		}
	}

	final void encryptRsa(final BigInteger biginteger, final BigInteger biginteger_96_) {
		/*final int i_97_ = this.anInt2470;
		this.anInt2470 = 0;
		final byte[] is = new byte[i_97_];
		getBuffer(is, 0, i_97_);
		final BigInteger biginteger_98_ = new BigInteger(is);
		final BigInteger biginteger_99_ = biginteger_98_.modPow(biginteger_96_, biginteger);
		final byte[] is_100_ = biginteger_99_.toByteArray();
		this.anInt2470 = 0;
		putByte(is_100_.length);
		putBuffer(is_100_, 0, is_100_.length);*/
	}

	final int getUByte() {
		return this.buf[this.pos++] & 0xff;
	}

	final int getUShortA() {
		this.pos += 2;
		return ((this.buf[-2 + this.pos] & 0xff) << 8) - -(0xff & this.buf[this.pos + -1] - 128);
	}

	final void putShort(final int i_103_) {
		this.buf[this.pos++] = (byte) (i_103_ >> 8);
		this.buf[this.pos++] = (byte) i_103_;
	}

	final void putFloatAsLEInt(final float f) {
		final int i_104_ = Float.floatToRawIntBits(f);
		this.buf[this.pos++] = (byte) i_104_;
		this.buf[this.pos++] = (byte) (i_104_ >> 8);
		this.buf[this.pos++] = (byte) (i_104_ >> 16);
		this.buf[this.pos++] = (byte) (i_104_ >> 24);
	}

	final String getJagexString() {
		final byte i_105_ = this.buf[this.pos++];
		if (i_105_ != 0) {
			throw new IllegalStateException("Bad version number in gjstr2");
		}
		final int i_106_ = this.pos;
		while (this.buf[this.pos++] != 0) {
			/* empty */
		}
		return DisplayModeInfo.method2215(this.buf, i_106_, -1 + this.pos + -i_106_);
	}

	final void method1136(final int i, final int i_107_, final byte[] is, final int i_108_) {
		try {
			if (i == -21764) {
				for (int i_109_ = i_107_ + i_108_ + -1; i_108_ <= i_109_; i_109_--) {
					is[i_109_] = this.buf[this.pos++];
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("fd.S(").append(i).append(',').append(i_107_).append(',').append(is != null ? "{...}" : "null").append(',').append(i_108_).append(')').toString());
		}
	}

	final int getULEShort() {
		this.pos += 2;
		return ((0xff & this.buf[-1 + this.pos]) << 8) + (0xff & this.buf[this.pos + -2]);
	}

	final void putLEShortA(final int i) {
		this.buf[this.pos++] = (byte) (128 + i);
		this.buf[this.pos++] = (byte) (i >> 8);
	}

	final byte getByte() {
		return this.buf[this.pos++];
	}

	final void putSizedByte(final int i_113_) {
		this.buf[this.pos - i_113_ - 1] = (byte) i_113_;
	}
}
