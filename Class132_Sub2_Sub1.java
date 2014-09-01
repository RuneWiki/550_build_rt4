/* Class132_Sub2_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class132_Sub2_Sub1 extends Class132_Sub2 {
	private byte[] aByteArray3731;

	final byte[] method1943(final int i, final int i_0_, final int i_1_) {
		aByteArray3731 = new byte[i * i_0_ * i_1_ * 2];
		method1923(i, i_0_, i_1_);
		return aByteArray3731;
	}

	@Override
	final void method1938(final int i, byte i_2_) {
		int i_3_ = i * 2;
		i_2_ = (byte) (127 + ((i_2_ & 0xff) >> 1));
		aByteArray3731[i_3_++] = i_2_;
		aByteArray3731[i_3_] = i_2_;
	}

	public Class132_Sub2_Sub1() {
		super(12, 5, 16, 2, 2, 0.45F);
	}
}
