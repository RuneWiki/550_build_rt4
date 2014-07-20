/* Class193 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.EOFException;
import java.io.File;
import java.io.IOException;

final class SeekableFile {
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
	private long position;
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

	static final void removeMouseHandler() {
		if (Class120_Sub14_Sub4.mouseHandler != null) {
			synchronized (Class120_Sub14_Sub4.mouseHandler) {
				Class120_Sub14_Sub4.mouseHandler = null;
			}
		}
	}

	final void write(final byte[] is, int i, int i_1_) throws IOException {
		try {
			if ((aLong2128 ^ 0xffffffffffffffffL) > (i_1_ + position ^ 0xffffffffffffffffL)) {
				aLong2128 = position - -(long) i_1_;
			}
			if (-1L != aLong2133 && (position < aLong2133 || (position ^ 0xffffffffffffffffL) < (aLong2133 - -(long) anInt2129 ^ 0xffffffffffffffffL))) {
				method2524();
			}
			if ((aLong2133 ^ 0xffffffffffffffffL) != 0L && (aLong2133 + aByteArray2125.length ^ 0xffffffffffffffffL) > (i_1_ + position ^ 0xffffffffffffffffL)) {
				final int i_3_ = (int) (aByteArray2125.length + -position + aLong2133);
				i_1_ -= i_3_;
				ArrayUtils.arrayCopy(is, i, aByteArray2125, (int) (-aLong2133 + position), i_3_);
				i += i_3_;
				position += i_3_;
				anInt2129 = aByteArray2125.length;
				method2524();
			}
			if (i_1_ > aByteArray2125.length) {
				long l = -1L;
				long l_4_ = -1L;
				if ((position ^ 0xffffffffffffffffL) != (aLong2135 ^ 0xffffffffffffffffL)) {
					aClass95_2132.seek(position);
					aLong2135 = position;
				}
				aClass95_2132.write(is, i, i_1_);
				if ((position ^ 0xffffffffffffffffL) <= (aLong2130 ^ 0xffffffffffffffffL) && aLong2130 - -(long) anInt2134 > position) {
					l_4_ = position;
				} else if (position <= aLong2130 && (i_1_ + position ^ 0xffffffffffffffffL) < (aLong2130 ^ 0xffffffffffffffffL)) {
					l_4_ = aLong2130;
				}
				aLong2135 += i_1_;
				if (i_1_ + position > aLong2130 && i_1_ + position <= anInt2134 + aLong2130) {
					l = i_1_ + position;
				} else if ((position ^ 0xffffffffffffffffL) > (anInt2134 + aLong2130 ^ 0xffffffffffffffffL) && aLong2130 + anInt2134 <= i_1_ + position) {
					l = aLong2130 - -(long) anInt2134;
				}
				if (aLong2135 > aLong2127) {
					aLong2127 = aLong2135;
				}
				if (-1L < l_4_ && (l ^ 0xffffffffffffffffL) < (l_4_ ^ 0xffffffffffffffffL)) {
					final int i_5_ = (int) (l + -l_4_);
					ArrayUtils.arrayCopy(is, (int) (-position + i - -l_4_), aByteArray2126, (int) (l_4_ + -aLong2130), i_5_);
				}
				position += i_1_;
			} else if (i_1_ > 0) {
				if (0L == (aLong2133 ^ 0xffffffffffffffffL)) {
					aLong2133 = position;
				}
				ArrayUtils.arrayCopy(is, i, aByteArray2125, (int) (position + -aLong2133), i_1_);
				position += i_1_;
				if ((anInt2129 ^ 0xffffffffffffffffL) > (position + -aLong2133 ^ 0xffffffffffffffffL)) {
					anInt2129 = (int) (-aLong2133 + position);
				}
			}
		} catch (final IOException ioexception) {
			aLong2135 = -1L;
			throw ioexception;
		}
	}

	private final void method2520(final int i) throws IOException {
		try {
			anInt2134 = 0;
			if (aLong2135 != position) {
				aClass95_2132.seek(position);
				aLong2135 = position;
			}
			aLong2130 = position;
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
			throw EnumType.method1428(runtimeexception, new StringBuilder("wl.G(").append(i).append(')').toString());
		}
	}

	final long length() {
		return aLong2128;
	}

	final void seek(final long pos) throws IOException {
		if (-1L < (pos ^ 0xffffffffffffffffL)) {
			throw new IOException(new StringBuilder("Invalid seek to ").append(pos).append(" in file ").append(getFile()).toString());
		}
		position = pos;
	}

	public static void method2523(final byte i) {
		try {
			aLongArray2137 = null;
			if (i != 35) {
				removeMouseHandler();
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("wl.I(").append(i).append(')').toString());
		}
	}

	private final void method2524() throws IOException {
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
	}

	final void read(final byte[] buf, int off, int len) throws IOException {
		try {
			if (buf.length < len + off) {
				throw new ArrayIndexOutOfBoundsException(off - (-len + buf.length));
			}
			if (0L != (aLong2133 ^ 0xffffffffffffffffL) && position >= aLong2133 && aLong2133 + anInt2129 >= len + position) {
				ArrayUtils.arrayCopy(aByteArray2125, (int) (-aLong2133 + position), buf, off, len);
				position += len;
				return;
			}
			final int i_12_ = len;
			final int i_13_ = off;
			final long l = position;
			if (aLong2130 <= position && aLong2130 - -(long) anInt2134 > position) {
				int i_14_ = (int) (anInt2134 - -aLong2130 - position);
				if (i_14_ > len) {
					i_14_ = len;
				}
				ArrayUtils.arrayCopy(aByteArray2126, (int) (-aLong2130 + position), buf, off, i_14_);
				len -= i_14_;
				position += i_14_;
				off += i_14_;
			}
			if (aByteArray2126.length < len) {
				aClass95_2132.seek(position);
				aLong2135 = position;
				while (len > 0) {
					final int i_15_ = aClass95_2132.read(buf, off, len);
					if ((i_15_ ^ 0xffffffff) == 0) {
						break;
					}
					aLong2135 += i_15_;
					len -= i_15_;
					off += i_15_;
					position += i_15_;
				}
			} else if (len > 0) {
				int i_16_ = len;
				method2520(8);
				if (anInt2134 < i_16_) {
					i_16_ = anInt2134;
				}
				len -= i_16_;
				ArrayUtils.arrayCopy(aByteArray2126, 0, buf, off, i_16_);
				position += i_16_;
				off += i_16_;
			}
			if ((aLong2133 ^ 0xffffffffffffffffL) != 0L) {
				if ((position ^ 0xffffffffffffffffL) > (aLong2133 ^ 0xffffffffffffffffL) && len > 0) {
					int i_17_ = off - -(int) (-position + aLong2133);
					if (i_17_ > len + off) {
						i_17_ = len + off;
					}
					while (i_17_ > off) {
						buf[off++] = (byte) 0;
						position++;
						len--;
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
					ArrayUtils.arrayCopy(aByteArray2125, (int) (-aLong2133 + l_19_), buf, (int) (-l + l_19_) + i_13_, i_20_);
					if (l_18_ > position) {
						len -= -position + l_18_;
						position = l_18_;
					}
				}
			}
		} catch (final IOException ioexception) {
			aLong2135 = -1L;
			throw ioexception;
		}
		if (len > 0) {
			throw new EOFException();
		}
	}

	private final File getFile() {
		return aClass95_2132.getFile();
	}

	final void read(final byte[] buf) throws IOException {
		read(buf, 0, buf.length);
	}

	SeekableFile(final FileOnDisk fileOnDisk, final int i, final int i_21_) throws IOException {
		aLong2130 = -1L;
		aClass95_2132 = fileOnDisk;
		aLong2128 = aLong2127 = fileOnDisk.getLength();
		aByteArray2126 = new byte[i];
		position = 0L;
		aByteArray2125 = new byte[i_21_];
	}
}
