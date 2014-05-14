/* Class193 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.EOFException;
import java.io.File;
import java.io.IOException;

final class Class193 {
	private byte[] aByteArray2125;
	private final byte[] aByteArray2126;
	private long aLong2127;
	private long aLong2128;
	private int anInt2129 = 0;
	private long aLong2130;
	private final FileOnDisk aClass95_2132;
	private long aLong2133 = -1L;
	private int anInt2134;
	private long aLong2135;
	private long aLong2136;
	static long[] aLongArray2137 = new long[256];
	static boolean aBoolean2138;
	static float aFloat2139;

	static {
		for (int i = 0; i < 256; i++) {
			long l = i;
			for (int i_0_ = 0; i_0_ < 8; i_0_++) {
				if ((l & 0x1L) == 1L) {
					l = ~0x3693a86a2878f0bdL ^ l >>> 1;
				} else {
					l >>>= 1;
				}
			}
			aLongArray2137[i] = l;
		}
		aBoolean2138 = false;
	}

	static final void method2518(final int i) {
		try {
			if (Class120_Sub14_Sub4.mouseHandler != null) {
				synchronized (Class120_Sub14_Sub4.mouseHandler) {
					Class120_Sub14_Sub4.mouseHandler = null;
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("wl.D(").append(i).append(')').toString());
		}
	}

	final void method2519(int i, final byte[] is, int i_1_, final byte i_2_) throws IOException {
		try {
			try {
				if ((aLong2128 ^ 0xffffffffffffffffL) > (i_1_ + aLong2136 ^ 0xffffffffffffffffL)) {
					aLong2128 = aLong2136 - -(long) i_1_;
				}
				if (i_2_ != 42) {
					method2518(-18);
				}
				if (-1L != aLong2133 && (aLong2136 < aLong2133 || (aLong2136 ^ 0xffffffffffffffffL) < (aLong2133 - -(long) anInt2129 ^ 0xffffffffffffffffL))) {
					method2524(-1);
				}
				if ((aLong2133 ^ 0xffffffffffffffffL) != 0L && (aLong2133 + aByteArray2125.length ^ 0xffffffffffffffffL) > (i_1_ + aLong2136 ^ 0xffffffffffffffffL)) {
					final int i_3_ = (int) (aByteArray2125.length + -aLong2136 + aLong2133);
					i_1_ -= i_3_;
					ArrayUtils.arrayCopy(is, i, aByteArray2125, (int) (-aLong2133 + aLong2136), i_3_);
					i += i_3_;
					aLong2136 += i_3_;
					anInt2129 = aByteArray2125.length;
					method2524(i_2_ ^ ~0x2a);
				}
				if (i_1_ > aByteArray2125.length) {
					long l = -1L;
					long l_4_ = -1L;
					if ((aLong2136 ^ 0xffffffffffffffffL) != (aLong2135 ^ 0xffffffffffffffffL)) {
						aClass95_2132.seek(aLong2136);
						aLong2135 = aLong2136;
					}
					aClass95_2132.write(is, i, i_1_);
					if ((aLong2136 ^ 0xffffffffffffffffL) <= (aLong2130 ^ 0xffffffffffffffffL) && aLong2130 - -(long) anInt2134 > aLong2136) {
						l_4_ = aLong2136;
					} else if (aLong2136 <= aLong2130 && (i_1_ + aLong2136 ^ 0xffffffffffffffffL) < (aLong2130 ^ 0xffffffffffffffffL)) {
						l_4_ = aLong2130;
					}
					aLong2135 += i_1_;
					if (i_1_ + aLong2136 > aLong2130 && i_1_ + aLong2136 <= anInt2134 + aLong2130) {
						l = i_1_ + aLong2136;
					} else if ((aLong2136 ^ 0xffffffffffffffffL) > (anInt2134 + aLong2130 ^ 0xffffffffffffffffL) && aLong2130 + anInt2134 <= i_1_ + aLong2136) {
						l = aLong2130 - -(long) anInt2134;
					}
					if (aLong2135 > aLong2127) {
						aLong2127 = aLong2135;
					}
					if (-1L < l_4_ && (l ^ 0xffffffffffffffffL) < (l_4_ ^ 0xffffffffffffffffL)) {
						final int i_5_ = (int) (l + -l_4_);
						ArrayUtils.arrayCopy(is, (int) (-aLong2136 + i - -l_4_), aByteArray2126, (int) (l_4_ + -aLong2130), i_5_);
					}
					aLong2136 += i_1_;
				} else if (i_1_ > 0) {
					if (0L == (aLong2133 ^ 0xffffffffffffffffL)) {
						aLong2133 = aLong2136;
					}
					ArrayUtils.arrayCopy(is, i, aByteArray2125, (int) (aLong2136 + -aLong2133), i_1_);
					aLong2136 += i_1_;
					if ((anInt2129 ^ 0xffffffffffffffffL) > (aLong2136 + -aLong2133 ^ 0xffffffffffffffffL)) {
						anInt2129 = (int) (-aLong2133 + aLong2136);
					}
				}
			} catch (final IOException ioexception) {
				aLong2135 = -1L;
				throw ioexception;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("wl.B(").append(i).append(',').append(is != null ? "{...}" : "null").append(',').append(i_1_).append(',').append(i_2_).append(')').toString());
		}
	}

	private final void method2520(final int i) throws IOException {
		try {
			anInt2134 = 0;
			if (aLong2135 != aLong2136) {
				aClass95_2132.seek(aLong2136);
				aLong2135 = aLong2136;
			}
			aLong2130 = aLong2136;
			if (i != 8) {
				aLongArray2137 = null;
			}
			int i_6_;
			for (/**/; anInt2134 < aByteArray2126.length; anInt2134 += i_6_) {
				int i_7_ = -anInt2134 + aByteArray2126.length;
				if ((i_7_ ^ 0xffffffff) < -200000001) {
					i_7_ = 200000000;
				}
				i_6_ = aClass95_2132.read(aByteArray2126, anInt2134, i_7_);
				if (i_6_ == -1) {
					break;
				}
				aLong2135 += i_6_;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("wl.G(").append(i).append(')').toString());
		}
	}

	final long method2521(final byte i) {
		long l;
		try {
			if (i >= -22) {
				aByteArray2125 = null;
			}
			l = aLong2128;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("wl.E(").append(i).append(')').toString());
		}
		return l;
	}

	final void seek(final long l) throws IOException {
		if (-1L < (l ^ 0xffffffffffffffffL)) {
			throw new IOException(new StringBuilder("Invalid seek to ").append(l).append(" in file ").append(method2526((byte) 119)).toString());
		}
		aLong2136 = l;
	}

	public static void method2523(final byte i) {
		try {
			aLongArray2137 = null;
			if (i != 35) {
				method2518(74);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("wl.I(").append(i).append(')').toString());
		}
	}

	private final void method2524(final int i) throws IOException {
		do {
			try {
				if (0L != (aLong2133 ^ 0xffffffffffffffffL)) {
					if ((aLong2133 ^ 0xffffffffffffffffL) != (aLong2135 ^ 0xffffffffffffffffL)) {
						aClass95_2132.seek(aLong2133);
						aLong2135 = aLong2133;
					}
					aClass95_2132.write(aByteArray2125, 0, anInt2129);
					aLong2135 += anInt2129;
					if (aLong2135 > aLong2127) {
						aLong2127 = aLong2135;
					}
					long l = -1L;
					if (anInt2129 + aLong2133 > aLong2130 && aLong2133 + anInt2129 <= anInt2134 + aLong2130) {
						l = aLong2133 - -(long) anInt2129;
					} else if (aLong2133 < aLong2130 + anInt2134 && (aLong2130 + anInt2134 ^ 0xffffffffffffffffL) >= (aLong2133 + anInt2129 ^ 0xffffffffffffffffL)) {
						l = anInt2134 + aLong2130;
					}
					long l_8_ = -1L;
					if ((aLong2130 ^ 0xffffffffffffffffL) >= (aLong2133 ^ 0xffffffffffffffffL) && (aLong2133 ^ 0xffffffffffffffffL) > (anInt2134 + aLong2130 ^ 0xffffffffffffffffL)) {
						l_8_ = aLong2133;
					} else if ((aLong2133 ^ 0xffffffffffffffffL) >= (aLong2130 ^ 0xffffffffffffffffL) && (aLong2130 ^ 0xffffffffffffffffL) > (aLong2133 + anInt2129 ^ 0xffffffffffffffffL)) {
						l_8_ = aLong2130;
					}
					if (0L > (l_8_ ^ 0xffffffffffffffffL) && l_8_ < l) {
						final int i_9_ = (int) (-l_8_ + l);
						ArrayUtils.arrayCopy(aByteArray2125, (int) (l_8_ + -aLong2133), aByteArray2126, (int) (l_8_ - aLong2130), i_9_);
					}
					aLong2133 = -1L;
					anInt2129 = 0;
				}
				if (i != -1) {
					break;
				}
			} catch (final RuntimeException runtimeexception) {
				throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("wl.C(").append(i).append(')').toString());
			}
		} while (false);
	}

	final void method2525(final int i, final byte[] is, int i_10_, int i_11_) throws IOException {
		try {
			try {
				if (is.length < i_11_ + i_10_) {
					throw new ArrayIndexOutOfBoundsException(i_10_ - (-i_11_ + is.length));
				}
				if (0L != (aLong2133 ^ 0xffffffffffffffffL) && aLong2136 >= aLong2133 && aLong2133 + anInt2129 >= i_11_ + aLong2136) {
					ArrayUtils.arrayCopy(aByteArray2125, (int) (-aLong2133 + aLong2136), is, i_10_, i_11_);
					aLong2136 += i_11_;
					return;
				}
				final int i_12_ = i_11_;
				final int i_13_ = i_10_;
				final long l = aLong2136;
				if (aLong2130 <= aLong2136 && aLong2130 - -(long) anInt2134 > aLong2136) {
					int i_14_ = (int) (anInt2134 - -aLong2130 - aLong2136);
					if (i_14_ > i_11_) {
						i_14_ = i_11_;
					}
					ArrayUtils.arrayCopy(aByteArray2126, (int) (-aLong2130 + aLong2136), is, i_10_, i_14_);
					i_11_ -= i_14_;
					aLong2136 += i_14_;
					i_10_ += i_14_;
				}
				if (aByteArray2126.length < i_11_) {
					aClass95_2132.seek(aLong2136);
					aLong2135 = aLong2136;
					while (i_11_ > 0) {
						final int i_15_ = aClass95_2132.read(is, i_10_, i_11_);
						if ((i_15_ ^ 0xffffffff) == 0) {
							break;
						}
						aLong2135 += i_15_;
						i_11_ -= i_15_;
						i_10_ += i_15_;
						aLong2136 += i_15_;
					}
				} else if (i_11_ > 0) {
					int i_16_ = i_11_;
					method2520(8);
					if (anInt2134 < i_16_) {
						i_16_ = anInt2134;
					}
					i_11_ -= i_16_;
					ArrayUtils.arrayCopy(aByteArray2126, 0, is, i_10_, i_16_);
					aLong2136 += i_16_;
					i_10_ += i_16_;
				}
				if ((aLong2133 ^ 0xffffffffffffffffL) != 0L) {
					if ((aLong2136 ^ 0xffffffffffffffffL) > (aLong2133 ^ 0xffffffffffffffffL) && i_11_ > 0) {
						int i_17_ = i_10_ - -(int) (-aLong2136 + aLong2133);
						if (i_17_ > i_11_ + i_10_) {
							i_17_ = i_11_ + i_10_;
						}
						while (i_17_ > i_10_) {
							is[i_10_++] = (byte) 0;
							aLong2136++;
							i_11_--;
						}
					}
					long l_18_ = -1L;
					long l_19_ = -1L;
					if ((l ^ 0xffffffffffffffffL) < (aLong2133 ^ 0xffffffffffffffffL) || (aLong2133 ^ 0xffffffffffffffffL) <= (l + i_12_ ^ 0xffffffffffffffffL)) {
						if (l >= aLong2133 && anInt2129 + aLong2133 > l) {
							l_19_ = l;
						}
					} else {
						l_19_ = aLong2133;
					}
					if (anInt2129 + aLong2133 > l && (aLong2133 - -(long) anInt2129 ^ 0xffffffffffffffffL) >= (i_12_ + l ^ 0xffffffffffffffffL)) {
						l_18_ = anInt2129 + aLong2133;
					} else if (aLong2133 < i_12_ + l && (i_12_ + l ^ 0xffffffffffffffffL) >= (anInt2129 + aLong2133 ^ 0xffffffffffffffffL)) {
						l_18_ = i_12_ + l;
					}
					if ((l_19_ ^ 0xffffffffffffffffL) < 0L && l_18_ > l_19_) {
						final int i_20_ = (int) (l_18_ - l_19_);
						ArrayUtils.arrayCopy(aByteArray2125, (int) (-aLong2133 + l_19_), is, (int) (-l + l_19_) + i_13_, i_20_);
						if (l_18_ > aLong2136) {
							i_11_ -= -aLong2136 + l_18_;
							aLong2136 = l_18_;
						}
					}
				}
			} catch (final IOException ioexception) {
				aLong2135 = -1L;
				throw ioexception;
			}
			if (i < i_11_) {
				throw new EOFException();
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("wl.A(").append(i).append(',').append(is != null ? "{...}" : "null").append(',').append(i_10_).append(',').append(i_11_).append(')').toString());
		}
	}

	private final File method2526(final byte i) {
		File file;
		try {
			if (i <= 16) {
				method2521((byte) 41);
			}
			file = aClass95_2132.getFile();
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("wl.F(").append(i).append(')').toString());
		}
		return file;
	}

	final void method2527(final int i, final byte[] is) throws IOException {
		try {
			method2525(i + i, is, 0, is.length);
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("wl.J(").append(i).append(',').append(is != null ? "{...}" : "null").append(')').toString());
		}
	}

	Class193(final FileOnDisk fileOnDisk, final int i, final int i_21_) throws IOException {
		aLong2130 = -1L;
		aClass95_2132 = fileOnDisk;
		aLong2128 = aLong2127 = fileOnDisk.getLength();
		aByteArray2126 = new byte[i];
		aLong2136 = 0L;
		aByteArray2125 = new byte[i_21_];
	}
}
