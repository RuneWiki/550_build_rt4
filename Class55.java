/* Class55 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class55 {
	static int[] skillsXpForLevel = new int[99];
	static int[] anIntArray493;

	static {
		int i = 0;
		for (int i_0_ = 0; i_0_ < 99; i_0_++) {
			final int i_1_ = 1 + i_0_;
			final int i_2_ = (int) (Math.pow(2.0, i_1_ / 7.0) * 300.0 + i_1_);
			i += i_2_;
			skillsXpForLevel[i_0_] = i / 4;
		}
		anIntArray493 = new int[] { 1, -1, -1, 1 };
	}

	static final Class120_Sub14_Sub22 method485(final Buffer buffer, final int i) {
		final Class120_Sub14_Sub22 class120_sub14_sub22_4_ = new Class120_Sub14_Sub22(i, buffer.getJagexString(), buffer.getJagexString(), buffer.getInt(), buffer.getInt(), buffer.getUByte() == 1, buffer.getUByte());
		final int i_5_ = buffer.getUByte();
		for (int i_6_ = 0; i_5_ > i_6_; i_6_++) {
			class120_sub14_sub22_4_.aClass105_3641.addLast(new Class120_Sub4(buffer.getUByte(), buffer.getUByte(), buffer.getUShort(), buffer.getUShort(), buffer.getUShort(), buffer.getUShort(), buffer.getUShort(), buffer.getUShort(), buffer.getUShort(), buffer.getUShort()));
		}
		class120_sub14_sub22_4_.method1636();
		return class120_sub14_sub22_4_;
	}
}
