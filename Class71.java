/* Class71 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class71 {
	static String aString624 = "wave:";
	static int anInt625;
	static String aString626 = "Please wait...";
	static int[] anIntArray627 = new int[14];

	public static void method638(final byte i) {
		try {
			aString624 = null;
			if (i > -1) {
				method639(false, null);
			}
			anIntArray627 = null;
			aString626 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("hj.A(").append(i).append(')').toString());
		}
	}

	static final byte[] method639(final boolean bool, final byte[] is) {
		byte[] is_0_;
		try {
			final Buffer class120_sub7 = new Buffer(is);
			final int i = class120_sub7.getUByte();
			final int i_1_ = class120_sub7.getInt();
			if (!bool) {
				anInt625 = -85;
			}
			if (i_1_ < 0 || Class189.anInt2068 != 0 && Class189.anInt2068 < i_1_) {
				throw new RuntimeException();
			}
			if (i == 0) {
				final byte[] is_2_ = new byte[i_1_];
				class120_sub7.getBuffer(is_2_, 0, i_1_);
				return is_2_;
			}
			final int i_3_ = class120_sub7.getInt();
			if (i_3_ < 0 || i_3_ >= 200000000 || Class189.anInt2068 != 0 && Class189.anInt2068 < i_3_) {
				return new byte[100];
			//if (i_3_ < 0 || Class189.anInt2068 != 0 && Class189.anInt2068 < i_3_) {
			//	throw new RuntimeException();
			}
			final byte[] is_4_ = new byte[i_3_];
			if (i != 1) {
				Class57.aClass84_501.method721(class120_sub7, (byte) -100, is_4_);
			} else {
				Class19.method170(is_4_, i_3_, is, i_1_, 9);
			}
			is_0_ = is_4_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("hj.B(").append(bool).append(',').append(is != null ? "{...}" : "null").append(')').toString());
		}
		return is_0_;
	}
}
