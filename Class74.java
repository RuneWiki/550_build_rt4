/* Class74 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class74 {
	static String aString666;
	static int anInt667 = 0;
	static int sceneryShadowsType;

	static {
		aString666 = "";
		sceneryShadowsType = 2;
	}

	static final Class189 method650(final int i, final int i_0_) {
		Class189 class189;
		try {
			final int i_1_ = i_0_ >> 16;
			final int i_2_ = 0xffff & i_0_;
			if (Node.aClass189ArrayArray1150[i_1_] == null || Node.aClass189ArrayArray1150[i_1_][i_2_] == null) {
				final boolean bool = Class50.method434(-93, i_1_);
				if (!bool) {
					return null;
				}
			}
			class189 = Node.aClass189ArrayArray1150[i_1_][i_2_];
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("i.A(").append(i).append(',').append(i_0_).append(')').toString());
		}
		return class189;
	}

	public static void method651(final boolean bool) {
		try {
			aString666 = null;
			if (bool) {
				aString666 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("i.D(").append(bool).append(')').toString());
		}
	}

	static final Class120_Sub14_Sub11 method652(final int i, final byte i_3_) {
		Class120_Sub14_Sub11 class120_sub14_sub11;
		try {
			if (i_3_ > -31) {
				aString666 = null;
			}
			Class120_Sub14_Sub11 class120_sub14_sub11_4_ = (Class120_Sub14_Sub11) AbstractGraphicsBuffer.aClass35_1160.method302(17301, i);
			if (class120_sub14_sub11_4_ != null) {
				return class120_sub14_sub11_4_;
			}
			final byte[] is = Class111.aClass50_1059.method442(11, (byte) 114, i);
			class120_sub14_sub11_4_ = new Class120_Sub14_Sub11();
			if (is != null) {
				class120_sub14_sub11_4_.method1512(new Buffer(is), 121);
			}
			AbstractGraphicsBuffer.aClass35_1160.method301(i, 88, class120_sub14_sub11_4_);
			class120_sub14_sub11 = class120_sub14_sub11_4_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("i.B(").append(i).append(',').append(i_3_).append(')').toString());
		}
		return class120_sub14_sub11;
	}

	static final Class139 method653(final int i, final int i_5_) {
		Class139 class139;
		try {
			Class139 class139_6_ = (Class139) Class120_Sub12_Sub37.aClass21_3427.method193(i_5_, (byte) -118);
			if (class139_6_ != null) {
				return class139_6_;
			}
			if (i != -27169) {
				aString666 = null;
			}
			final byte[] is = Class147.aClass50_1394.method442(3, (byte) 118, i_5_);
			class139_6_ = new Class139();
			if (is != null) {
				class139_6_.method1992(true, new Buffer(is));
			}
			Class120_Sub12_Sub37.aClass21_3427.method185(-128, class139_6_, i_5_);
			class139 = class139_6_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("i.C(").append(i).append(',').append(i_5_).append(')').toString());
		}
		return class139;
	}
}
