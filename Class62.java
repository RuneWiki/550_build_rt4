/* Class62 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class62 {
	private final Buffer aClass120_Sub7_569;
	private static byte[] aByteArray570 = { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
			1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
	int anInt571;
	int[] anIntArray572;
	private long aLong573;
	private int[] anIntArray574;
	private int[] anIntArray575;
	private int anInt576;
	private int[] anIntArray577;

	final long method555(final int i) {
		return aLong573 + (long) i * (long) anInt576;
	}

	final void method556() {
		aClass120_Sub7_569.buf = null;
		anIntArray577 = null;
		anIntArray574 = null;
		this.anIntArray572 = null;
		anIntArray575 = null;
	}

	final void method557(final int i) {
		final int i_0_ = aClass120_Sub7_569.method1111();
		this.anIntArray572[i] += i_0_;
	}

	final void method558() {
		aClass120_Sub7_569.pos = -1;
	}

	final void method559(final byte[] is) {
		aClass120_Sub7_569.buf = is;
		aClass120_Sub7_569.pos = 10;
		final int i = aClass120_Sub7_569.getUShort();
		this.anInt571 = aClass120_Sub7_569.getUShort();
		anInt576 = 500000;
		anIntArray577 = new int[i];
		int i_1_ = 0;
		while (i_1_ < i) {
			final int i_2_ = aClass120_Sub7_569.getInt();
			final int i_3_ = aClass120_Sub7_569.getInt();
			if (i_2_ == 1297379947) {
				anIntArray577[i_1_] = aClass120_Sub7_569.pos;
				i_1_++;
			}
			aClass120_Sub7_569.pos += i_3_;
		}
		aLong573 = 0L;
		anIntArray574 = new int[i];
		for (i_1_ = 0; i_1_ < i; i_1_++) {
			anIntArray574[i_1_] = anIntArray577[i_1_];
		}
		this.anIntArray572 = new int[i];
		anIntArray575 = new int[i];
	}

	final void method560(final long l) {
		aLong573 = l;
		final int i = anIntArray574.length;
		for (int i_4_ = 0; i_4_ < i; i_4_++) {
			this.anIntArray572[i_4_] = 0;
			anIntArray575[i_4_] = 0;
			aClass120_Sub7_569.pos = anIntArray577[i_4_];
			method557(i_4_);
			anIntArray574[i_4_] = aClass120_Sub7_569.pos;
		}
	}

	final void method561(final int i) {
		aClass120_Sub7_569.pos = anIntArray574[i];
	}

	final boolean method562() {
		if (aClass120_Sub7_569.buf != null) {
			return true;
		}
		return false;
	}

	final boolean method563() {
		final int i = anIntArray574.length;
		for (int i_5_ = 0; i_5_ < i; i_5_++) {
			if (anIntArray574[i_5_] >= 0) {
				return false;
			}
		}
		return true;
	}

	final int method564() {
		final int i = anIntArray574.length;
		int i_6_ = -1;
		int i_7_ = 2147483647;
		for (int i_8_ = 0; i_8_ < i; i_8_++) {
			if (anIntArray574[i_8_] >= 0 && this.anIntArray572[i_8_] < i_7_) {
				i_6_ = i_8_;
				i_7_ = this.anIntArray572[i_8_];
			}
		}
		return i_6_;
	}

	public static void method565() {
		aByteArray570 = null;
	}

	final int method566() {
		return anIntArray574.length;
	}

	private final int method567(final int i) {
		int i_9_ = aClass120_Sub7_569.buf[aClass120_Sub7_569.pos];
		if (i_9_ < 0) {
			i_9_ &= 0xff;
			anIntArray575[i] = i_9_;
			aClass120_Sub7_569.pos++;
		} else {
			i_9_ = anIntArray575[i];
		}
		if (i_9_ == 240 || i_9_ == 247) {
			final int i_10_ = aClass120_Sub7_569.method1111();
			if (i_9_ == 247 && i_10_ > 0) {
				final int i_11_ = aClass120_Sub7_569.buf[aClass120_Sub7_569.pos] & 0xff;
				if (i_11_ >= 241 && i_11_ <= 243 || i_11_ == 246 || i_11_ == 248 || i_11_ >= 250 && i_11_ <= 252 || i_11_ == 254) {
					aClass120_Sub7_569.pos++;
					anIntArray575[i] = i_11_;
					return method570(i, i_11_);
				}
			}
			aClass120_Sub7_569.pos += i_10_;
			return 0;
		}
		return method570(i, i_9_);
	}

	final void method568(final int i) {
		anIntArray574[i] = aClass120_Sub7_569.pos;
	}

	final int method569(final int i) {
		final int i_12_ = method567(i);
		return i_12_;
	}

	private final int method570(final int i, final int i_13_) {
		if (i_13_ == 255) {
			final int i_14_ = aClass120_Sub7_569.getUByte();
			int i_15_ = aClass120_Sub7_569.method1111();
			if (i_14_ == 47) {
				aClass120_Sub7_569.pos += i_15_;
				return 1;
			}
			if (i_14_ == 81) {
				final int i_16_ = aClass120_Sub7_569.getMedium();
				i_15_ -= 3;
				final int i_17_ = this.anIntArray572[i];
				aLong573 += (long) i_17_ * (long) (anInt576 - i_16_);
				anInt576 = i_16_;
				aClass120_Sub7_569.pos += i_15_;
				return 2;
			}
			aClass120_Sub7_569.pos += i_15_;
			return 3;
		}
		final byte i_18_ = aByteArray570[i_13_ - 128];
		int i_19_ = i_13_;
		if (i_18_ >= 1) {
			i_19_ |= aClass120_Sub7_569.getUByte() << 8;
		}
		if (i_18_ >= 2) {
			i_19_ |= aClass120_Sub7_569.getUByte() << 16;
		}
		return i_19_;
	}

	public Class62() {
		aClass120_Sub7_569 = new Buffer(null);
	}

	Class62(final byte[] is) {
		aClass120_Sub7_569 = new Buffer(null);
		method559(is);
	}
}
