/* Class101_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class101_Sub2 extends Class101 {
	static byte[][] aByteArrayArray2278 = new byte[1000][];
	static AbstractTimer gameShellTimer;
	private int anInt2280;
	private final int anInt2281;
	private final int anInt2282;
	static int loopCycle = 0;
	private final int anInt2284;

	@Override
	final void method834(final int i_0_, final int i_1_) {
	}

	@Override
	final void method837(final int i, final int i_2_) {
		final int i_3_ = i * anInt2282 >> 12;
		final int i_4_ = anInt2284 * i >> 12;
		final int i_5_ = anInt2281 * i_2_ >> 12;
		final int i_6_ = anInt2280 * i_2_ >> 12;
		Class120_Sub12_Sub32.method1369(i_6_, i_5_, this.anInt964, i_3_, i_4_);
	}

	@Override
	final void method833(final int i, final int i_7_) {
	}

	Class101_Sub2(final int i, final int i_9_, final int i_10_, final int i_11_, final int i_12_, final int i_13_) {
		super(-1, i_12_, i_13_);
		anInt2284 = i_10_;
		anInt2280 = i_9_;
		anInt2282 = i;
		anInt2281 = i_11_;
	}

	static final void method846(final boolean activateResizeListener) {
		Class120_Sub12_Sub12.method1258(Class69.rootInterfaceId, Class69_Sub1.canvasWidth, Class120_Sub12_Sub5.canvasHeight, activateResizeListener);
	}
}
