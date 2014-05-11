/* Class101_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class101_Sub3 extends Class101 {
	static String aString2285 = "Drop";
	static Class50 aClass50_2286;
	private final int anInt2287;
	private final int anInt2288;
	private int anInt2289;
	static LDSprite aClass120_Sub14_Sub19_Sub2_2290;
	static boolean aBoolean2291;
	private final int anInt2292;

	public static void method847(final int i) {
		try {
			aClass50_2286 = null;
			if (i == -1) {
				aClass120_Sub14_Sub19_Sub2_2290 = null;
				aString2285 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("gg.I(").append(i).append(')').toString());
		}
	}

	@Override
	final void method833(final int i, final int i_0_, final byte i_1_) {
		try {
			final int i_2_ = anInt2287 * i >> 12;
			final int i_3_ = i_0_ * anInt2289 >> 12;
			final int i_4_ = anInt2288 * i >> 12;
			final int i_5_ = anInt2292 * i_0_ >> 12;
			if (i_1_ >= -108) {
				method833(-60, -28, (byte) 83);
			}
			GroundObject.method1627(i_2_, this.anInt964, this.anInt960, this.anInt959, i_5_, i_4_, 4194303, i_3_);
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("gg.A(").append(i).append(',').append(i_0_).append(',').append(i_1_).append(')').toString());
		}
	}

	@Override
	final void method837(final int i, final int i_6_) {
		final int i_7_ = i * anInt2287 >> 12;
		final int i_8_ = anInt2288 * i >> 12;
		final int i_9_ = anInt2289 * i_6_ >> 12;
		final int i_10_ = i_6_ * anInt2292 >> 12;
		Class158.method2090(i_7_, this.anInt964, i_9_, this.anInt959, i_10_, i_8_);
	}

	static final void method848(final int i) {
		try {
			int i_11_ = -1;
			if (i == 2047) {
				for (/**/; Class83.localPlayerCount > i_11_; i_11_++) {
					int i_12_;
					if ((i_11_ ^ 0xffffffff) == 0) {
						i_12_ = 2047;
					} else {
						i_12_ = Class112.playerIndices[i_11_];
					}
					final Player class180_sub5_sub1 = Class118.playersList[i_12_];
					if (class180_sub5_sub1 != null) {
						Class120_Sub12_Sub9.method1245(-29399, class180_sub5_sub1.getSize(), class180_sub5_sub1);
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("gg.H(").append(i).append(')').toString());
		}
	}

	Class101_Sub3(final int i, final int i_13_, final int i_14_, final int i_15_, final int i_16_, final int i_17_, final int i_18_) {
		super(i_16_, i_17_, i_18_);
		anInt2288 = i_14_;
		anInt2292 = i_15_;
		anInt2287 = i;
		anInt2289 = i_13_;
	}

	@Override
	final void method834(final int i, final int i_19_, final int i_20_) {
		try {
			final int i_21_ = i_19_ * anInt2287 >> 12;
			final int i_22_ = i_19_ * anInt2288 >> 12;
			if (i != 1380163464) {
				anInt2289 = 25;
			}
			final int i_23_ = i_20_ * anInt2289 >> 12;
			final int i_24_ = anInt2292 * i_20_ >> 12;
			Class120_Sub12_Sub22.method1321(i_21_, i_24_, i_22_, i + -1380161011, i_23_, this.anInt960);
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("gg.B(").append(i).append(',').append(i_19_).append(',').append(i_20_).append(')').toString());
		}
	}
}
