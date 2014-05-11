/* Class55 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class55 {
	static int[] anIntArray492 = new int[99];
	static int[] anIntArray493;

	static {
		int i = 0;
		for (int i_0_ = 0; i_0_ < 99; i_0_++) {
			final int i_1_ = 1 + i_0_;
			final int i_2_ = (int) (Math.pow(2.0, i_1_ / 7.0) * 300.0 + i_1_);
			i += i_2_;
			anIntArray492[i_0_] = i / 4;
		}
		anIntArray493 = new int[] { 1, -1, -1, 1 };
	}

	public static void method484(final int i) {
		try {
			anIntArray493 = null;
			anIntArray492 = null;
			if (i != -7103) {
				method484(-15);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ge.B(").append(i).append(')').toString());
		}
	}

	static final Class120_Sub14_Sub22 method485(final int i, final int i_3_, final Buffer class120_sub7) {
		Class120_Sub14_Sub22 class120_sub14_sub22;
		try {
			if (i_3_ != 2951) {
				return null;
			}
			final Class120_Sub14_Sub22 class120_sub14_sub22_4_ = new Class120_Sub14_Sub22(i, class120_sub7.getJString(), class120_sub7.getJString(), class120_sub7.getInt(), class120_sub7.getInt(), class120_sub7.getUByte() == 1,
					class120_sub7.getUByte());
			final int i_5_ = class120_sub7.getUByte();
			for (int i_6_ = 0; i_5_ > i_6_; i_6_++) {
				class120_sub14_sub22_4_.aClass105_3641.method895((byte) -92, new Class120_Sub4(class120_sub7.getUByte(), class120_sub7.getUByte(), class120_sub7.getUShort(), class120_sub7.getUShort(), class120_sub7.getUShort(),
						class120_sub7.getUShort(), class120_sub7.getUShort(), class120_sub7.getUShort(), class120_sub7.getUShort(), class120_sub7.getUShort()));
			}
			class120_sub14_sub22_4_.method1636(12800);
			class120_sub14_sub22 = class120_sub14_sub22_4_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ge.A(").append(i).append(',').append(i_3_).append(',').append(class120_sub7 != null ? "{...}" : "null").append(')').toString());
		}
		return class120_sub14_sub22;
	}
}
