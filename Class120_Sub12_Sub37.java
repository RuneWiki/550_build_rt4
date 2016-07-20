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

	static final String valueToBase10String(long value, final boolean appendSeperators, final int decimalPoints, final int language) {
		char decimalSeperator = ',';
		char thousandSeperator = '.';
		boolean negative = false;
		if (language == 0) {
			thousandSeperator = ',';
			decimalSeperator = '.';
		}
		if (language == 2) {
			thousandSeperator = '\u00a0';
		}
		if (value < 0L) {
			negative = true;
			value = -value;
		}
		final StringBuffer stringBuffer = new StringBuffer(26);
		if (decimalPoints > 0) {
			for (int id = 0; id < decimalPoints; id++) {
				final int intValue = (int) value;
				value /= 10L;
				stringBuffer.append((char) (intValue + 48 - (int) value * 10));
			}
			stringBuffer.append(decimalSeperator);
		}
		int charPos = 0;
		for (;;) {
			final int intValue = (int) value;
			value /= 10L;
			stringBuffer.append((char) (intValue + 48 - (int) value * 10));
			if (value == 0L) {
				break;
			}
			if (appendSeperators && ++charPos % 3 == 0) {
				stringBuffer.append(thousandSeperator);
			}
		}
		if (negative) {
			stringBuffer.append('-');
		}
		return stringBuffer.reverse().toString();
	}

	public Class120_Sub12_Sub37() {
		super(0, true);
		anInt3426 = 1;
		anInt3433 = 0;
	}
}
