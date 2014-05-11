/* Class132_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class132_Sub1_Sub1 extends Class132_Sub1 {
	private byte[] aByteArray3730;

	final byte[] method1936(final int i, final int i_0_, final int i_1_) {
		aByteArray3730 = new byte[i * i_0_ * i_1_ * 2];
		method1923(i, (byte) 103, i_0_, i_1_);
		return aByteArray3730;
	}

	@Override
	final void method1932(final int i, final byte i_2_) {
		int i_3_ = i * 2;
		final int i_4_ = i_2_ & 0xff;
		aByteArray3730[i_3_++] = (byte) (3 * i_4_ >> 5);
		aByteArray3730[i_3_] = (byte) (i_4_ >> 2);
	}

	public Class132_Sub1_Sub1() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}
}
