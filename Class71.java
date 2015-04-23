/* Class71 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class71 {
	static int anInt625;
	static int[] anIntArray627 = new int[14];

	public static void method638() {
		TextRepository.aString624 = null;
		anIntArray627 = null;
		TextRepository.aString626 = null;
	}

	static final byte[] unpack(final byte[] is) {
		final Buffer class120_sub7 = new Buffer(is);
		final int i = class120_sub7.getUByte();
		final int i_1_ = class120_sub7.getInt();
		if (i_1_ < 0 || JagexInterface.anInt2068 != 0 && JagexInterface.anInt2068 < i_1_) {
			throw new RuntimeException();
		}
		if (i == 0) {
			final byte[] is_2_ = new byte[i_1_];
			class120_sub7.getBuffer(is_2_, 0, i_1_);
			return is_2_;
		}
		final int i_3_ = class120_sub7.getInt();
		if (i_3_ < 0 || i_3_ >= 200000000 || JagexInterface.anInt2068 != 0 && JagexInterface.anInt2068 < i_3_) {
			return new byte[100];
			// if (i_3_ < 0 || Class189.anInt2068 != 0 && Class189.anInt2068 <
			// i_3_) {
			// throw new RuntimeException();
		}
		final byte[] is_4_ = new byte[i_3_];
		if (i != 1) {
			Class57.gzipDecompressor.decompress(class120_sub7, is_4_);
		} else {
			Class19.method170(is_4_, i_3_, is, i_1_, 9);
		}
		return is_4_;
	}
}
