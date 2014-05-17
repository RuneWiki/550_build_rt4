/* Class187 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class187 {
	static Class50 aClass50_1907;
	static int anInt1908;
	static Class85[] aClass85Array1909 = new Class85[8];

	static {
		anInt1908 = 0;
	}

	static final Class101_Sub1 method2475(final Buffer class120_sub7, final boolean bool) {
		Class101_Sub1 class101_sub1;
		try {
			if (!bool) {
				aClass50_1907 = null;
			}
			class101_sub1 = new Class101_Sub1(class120_sub7.getShort(), class120_sub7.getShort(), class120_sub7.getShort(), class120_sub7.getShort(), class120_sub7.getMedium(), class120_sub7.getMedium(), class120_sub7.getUByte());
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("wc.B(").append(class120_sub7 != null ? "{...}" : "null").append(',').append(bool).append(')').toString());
		}
		return class101_sub1;
	}

	public static void method2476(final byte i) {
		try {
			aClass50_1907 = null;
			aClass85Array1909 = null;
			if (i != 80) {
				method2478(false);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("wc.E(").append(i).append(')').toString());
		}
	}

	static final AbstractSprite method2477(final int i, final int i_0_, final boolean bool, final byte i_1_, final PlayerAppearance playerAppearance, final int i_2_, final int i_3_) {
		AbstractSprite class120_sub14_sub19;
		try {
			final int i_4_ = i;
			final int i_5_ = (!bool ? 0 : 65536) + i_2_ - -(i_0_ << 17) - -(i_3_ << 19);
			final long l = 3147483667L * i_4_ - -(3849834839L * i_5_);
			AbstractSprite class120_sub14_sub19_6_ = (AbstractSprite) Class180_Sub3.aClass21_2906.get(l);
			if (class120_sub14_sub19_6_ != null) {
				return class120_sub14_sub19_6_;
			}
			Rasterizer.aBoolean974 = false;
			class120_sub14_sub19_6_ = Class120_Sub12_Sub6.method1224(i_0_, bool, i, false, playerAppearance, -98, i_3_, i_2_, false);
			if (class120_sub14_sub19_6_ != null && !Rasterizer.aBoolean974) {
				Class180_Sub3.aClass21_2906.put(class120_sub14_sub19_6_, l);
			}
			class120_sub14_sub19 = class120_sub14_sub19_6_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("wc.D(").append(i).append(',').append(i_0_).append(',').append(bool).append(',').append(i_1_).append(',').append(playerAppearance != null ? "{...}" : "null").append(',').append(i_2_).append(',').append(i_3_).append(')')
					.toString());
		}
		return class120_sub14_sub19;
	}

	static final void method2478(final boolean bool) {
		try {
			if (Class139.aClass191ArrayArray1337 != null) {
				final Class191 class191 = new Class191();
				for (int i = 0; i < 13; i++) {
					for (int i_7_ = 0; i_7_ < 13; i_7_++) {
						Class139.aClass191ArrayArray1337[i][i_7_] = class191;
					}
				}
			}
			if (bool) {
				aClass50_1907 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("wc.C(").append(bool).append(')').toString());
		}
	}

	static final void method2479(final int i, final int i_8_) {
		try {
			final InterfaceChangeNode class120_sub14_sub7 = AbstractObject.putInterfaceChange(i_8_, i);
			class120_sub14_sub7.method1453((byte) -104);
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("wc.A(").append(i).append(',').append(i_8_).append(')').toString());
		}
	}
}
