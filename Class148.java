/* Class148 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class148 {
	static int localNpcCount = 0;
	static WorldInfo[] worldsInfo;

	static final void method2057(final String[] strings, final int i, final short[] is, final int i_0_) {
		if (i > i_0_) {
			final int i_1_ = (i_0_ - -i) / 2;
			int i_2_ = i_0_;
			final String string = strings[i_1_];
			strings[i_1_] = strings[i];
			strings[i] = string;
			final short i_3_ = is[i_1_];
			is[i_1_] = is[i];
			is[i] = i_3_;
			for (int i_4_ = i_0_; i > i_4_; i_4_++) {
				if (string == null || strings[i_4_] != null && strings[i_4_].compareTo(string) < (0x1 & i_4_)) {
					final String string_5_ = strings[i_4_];
					strings[i_4_] = strings[i_2_];
					strings[i_2_] = string_5_;
					final short i_6_ = is[i_4_];
					is[i_4_] = is[i_2_];
					is[i_2_++] = i_6_;
				}
			}
			strings[i] = strings[i_2_];
			strings[i_2_] = string;
			is[i] = is[i_2_];
			is[i_2_] = i_3_;
			method2057(strings, i_2_ - 1, is, i_0_);
			method2057(strings, i, is, i_2_ + 1);
		}
	}

	public static void method2059() {
		worldsInfo = null;
	}

	static final int encodeText(final Buffer buffer, final String string) {
		final int i_8_ = buffer.pos;
		final byte[] is = Class120_Sub6.method1075(string);
		buffer.putSmart(is.length);
		buffer.pos += Class39.huffman.method1885(buffer.pos, buffer.buf, is, 0, is.length);
		return buffer.pos - i_8_;
	}
}
