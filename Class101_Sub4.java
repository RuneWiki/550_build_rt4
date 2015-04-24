/* Class101_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class101_Sub4 extends Class101 {
	private final int anInt2293;
	private final int anInt2294;
	private final int anInt2295;
	static int[] anIntArray2296 = new int[32];
	private final int anInt2298;
	private int anInt2299;
	private final int anInt2300;
	static js5 interfaceJs5;
	private final int anInt2302;
	private final int anInt2303;
	static int[] anIntArray2304 = new int[32];

	static final String method849(final long id, final int type, final int[] params) {
		if (Class120_Sub21.anInterface1_2668 != null) {
			final String string_1_ = Class120_Sub21.anInterface1_2668.method1(id, params, type);
			if (string_1_ != null) {
				return string_1_;
			}
		}
		return Long.toString(id);
	}

	@Override
	final void method837(final int i, final int i_2_) {
		final int i_3_ = i * anInt2298 >> 12;
		final int i_4_ = anInt2293 * i >> 12;
		final int i_5_ = i_2_ * anInt2303 >> 12;
		final int i_6_ = i * anInt2299 >> 12;
		final int i_7_ = anInt2302 * i_2_ >> 12;
		final int i_8_ = i_2_ * anInt2295 >> 12;
		final int i_9_ = i_2_ * anInt2294 >> 12;
		final int i_10_ = anInt2300 * i >> 12;
		Class120_Sub12.method1186(i_4_, i_5_, this.anInt964, i_6_, i_10_, i_7_, i_9_, i_8_, i_3_);
	}

	@Override
	final void method834(final int i_11_, final int i_12_) {
	}

	Class101_Sub4(final int i, final int i_13_, final int i_14_, final int i_15_, final int i_16_, final int i_17_, final int i_18_, final int i_19_, final int i_20_, final int i_21_) {
		super(-1, i_20_, i_21_);
		anInt2303 = i_15_;
		anInt2298 = i;
		anInt2302 = i_13_;
		anInt2293 = i_14_;
		anInt2299 = i_16_;
		anInt2295 = i_17_;
		anInt2300 = i_18_;
		anInt2294 = i_19_;
	}

	@Override
	final void method833(final int i, final int i_22_) {
	}
}
