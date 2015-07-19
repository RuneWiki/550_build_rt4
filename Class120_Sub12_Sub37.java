/* Class120_Sub12_Sub37 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class120_Sub12_Sub37 extends Class120_Sub12 {
	static int[] anIntArray3425 = new int[5];
	private int anInt3426;
	private int anInt3428 = 0;
	static short[] aShortArray3429;
	static short[] searchResults;
	static int anInt3431 = 1;
	static boolean membersClient = false;
	private int anInt3433;

	@Override
	final int[] method1187(final int i_0_) {
		final int[] is_1_ = this.aClass30_2563.method258(i_0_);
		if (this.aClass30_2563.aBoolean238) {
			final int i_2_ = Class150.anIntArray1405[i_0_];
			final int i_3_ = -2048 + i_2_ >> 1;
			for (int i_4_ = 0; Class120_Sub12_Sub7.anInt3178 > i_4_; i_4_++) {
				final int i_5_ = Class90.anIntArray849[i_4_];
				final int i_6_ = -2048 + i_5_ >> 1;
				int i_7_;
				if (anInt3428 != 0) {
					final int i_8_ = i_3_ * i_3_ + i_6_ * i_6_ >> 12;
					i_7_ = (int) (4096.0 * Math.sqrt(i_8_ / 4096.0F));
					i_7_ = (int) (anInt3426 * i_7_ * Math.PI);
				} else {
					i_7_ = (i_5_ + -i_2_) * anInt3426;
				}
				i_7_ -= ~0xfff & i_7_;
				if (anInt3433 == 0) {
					i_7_ = GZIPDecompressor.anIntArray800[0xff & i_7_ >> 4] - -4096 >> 1;
				} else if (anInt3433 == 2) {
					i_7_ -= 2048;
					if (i_7_ < 0) {
						i_7_ = -i_7_;
					}
					i_7_ = -i_7_ + 2048 << 1;
				}
				is_1_[i_4_] = i_7_;
			}
		}
		return is_1_;
	}

	@Override
	final void postDecode() {
		PacketBuffer.method1147();
	}

	@Override
	final void decode(final Buffer buffer, final int i_10_) {
		while_165_: do {
			do {
				if (i_10_ != 0) {
					if (i_10_ != 1) {
						if (i_10_ == 3) {
							break;
						}
						break while_165_;
					}
				} else {
					anInt3428 = buffer.getUByte();
					break while_165_;
				}
				anInt3433 = buffer.getUByte();
				break while_165_;
			} while (false);
			anInt3426 = buffer.getUByte();
		} while (false);
	}

	static final void method1394(final int i_11_, final int i_12_, final int i_13_, final int i_14_) {
		final InterfaceChangeNode class120_sub14_sub7 = InterfaceChangeNode.putInterfaceChange(10, i_14_);
		class120_sub14_sub7.method1454();
		class120_sub14_sub7.anInt3492 = i_11_;
		class120_sub14_sub7.anInt3486 = i_12_;
		class120_sub14_sub7.anInt3484 = i_13_;
	}

	static final String method1395(long l, final boolean bool, final int i_15_, final int i_16_) {
		char c = ',';
		char c_17_ = '.';
		boolean bool_18_ = false;
		if (i_16_ == 0) {
			c_17_ = ',';
			c = '.';
		}
		if (i_16_ == 2) {
			c_17_ = '\u00a0';
		}
		if (-1L < (l ^ 0xffffffffffffffffL)) {
			bool_18_ = true;
			l = -l;
		}
		final StringBuffer stringbuffer = new StringBuffer(26);
		if (i_15_ > 0) {
			for (int i_19_ = 0; i_19_ < i_15_; i_19_++) {
				final int i_20_ = (int) l;
				l /= 10L;
				stringbuffer.append((char) (i_20_ + 48 - (int) l * 10));
			}
			stringbuffer.append(c);
		}
		int i_21_ = 0;
		for (;;) {
			final int i_22_ = (int) l;
			l /= 10L;
			stringbuffer.append((char) (-(10 * (int) l) + i_22_ + 48));
			if (-1L == (l ^ 0xffffffffffffffffL)) {
				break;
			}
			if (bool && ++i_21_ % 3 == 0) {
				stringbuffer.append(c_17_);
			}
		}
		if (bool_18_) {
			stringbuffer.append('-');
		}
		return stringbuffer.reverse().toString();
	}

	public Class120_Sub12_Sub37() {
		super(0, true);
		anInt3426 = 1;
		anInt3433 = 0;
	}
}
