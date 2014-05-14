/* Class101_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class101_Sub2 extends Class101 {
	static int anInt2276 = 0;
	static Class50 aClass50_2277;
	static byte[][] aByteArrayArray2278 = new byte[1000][];
	static AbstractTimer gameShellTimer;
	private int anInt2280;
	private final int anInt2281;
	private final int anInt2282;
	static int loopCycle = 0;
	private final int anInt2284;

	static final void method844(final int i, final boolean bool) {
		try {
			if (bool) {
				Class22.aClass21_131.method192(i);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("de.J(").append(i).append(',').append(bool).append(')').toString());
		}
	}

	public static void method845(final int i) {
		try {
			aByteArrayArray2278 = null;
			aClass50_2277 = null;
			if (i != -1739218740) {
				method846((byte) 89, false);
			}
			gameShellTimer = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("de.H(").append(i).append(')').toString());
		}
	}

	@Override
	final void method834(final int i, final int i_0_, final int i_1_) {
		try {
			if (i != 1380163464) {
				anInt2280 = 42;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("de.B(").append(i).append(',').append(i_0_).append(',').append(i_1_).append(')').toString());
		}
	}

	@Override
	final void method837(final int i, final int i_2_) {
		final int i_3_ = i * anInt2282 >> 12;
		final int i_4_ = anInt2284 * i >> 12;
		final int i_5_ = anInt2281 * i_2_ >> 12;
		final int i_6_ = anInt2280 * i_2_ >> 12;
		Class120_Sub12_Sub32.method1369(i_6_, i_5_, this.anInt964, 118, i_3_, i_4_);
	}

	@Override
	final void method833(final int i, final int i_7_, final byte i_8_) {
		try {
			if (i_8_ > -108) {
				method833(-89, -122, (byte) 27);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("de.A(").append(i).append(',').append(i_7_).append(',').append(i_8_).append(')').toString());
		}
	}

	Class101_Sub2(final int i, final int i_9_, final int i_10_, final int i_11_, final int i_12_, final int i_13_) {
		super(-1, i_12_, i_13_);
		anInt2284 = i_10_;
		anInt2280 = i_9_;
		anInt2282 = i;
		anInt2281 = i_11_;
	}

	static final void method846(final byte i, final boolean bool) {
		try {
			if (i <= 30) {
				loopCycle = 17;
			}
			Class120_Sub12_Sub12.method1258(bool, -6090, Class69_Sub1.canvasWidth, Class69.rootInterfaceId, Class120_Sub12_Sub5.canvasHeight);
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("de.I(").append(i).append(',').append(bool).append(')').toString());
		}
	}
}
