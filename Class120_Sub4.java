/* Class120_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class120_Sub4 extends Node {
	int anInt2429;
	private final int anInt2430;
	int anInt2431;
	int anInt2432;
	private final int anInt2433;
	private final int anInt2434;
	static Deque aClass105_2435 = new Deque();
	private final int anInt2436;
	private final int anInt2437;
	int anInt2438;
	static Deque aClass105_2439 = new Deque();
	private final int anInt2440;
	static byte[][][] aByteArrayArrayArray2441;

	final boolean method1061(final int i_0_, final int i_1_, final int i_2_) {
		if (anInt2430 != i_2_ || i_0_ < anInt2433 || i_0_ > anInt2440 || i_1_ < anInt2437 || anInt2436 < i_1_) {
			return false;
		}
		return true;
	}

	final boolean method1062(final int i, final int i_3_) {
		if (i >= this.anInt2438 && i <= this.anInt2431 && i_3_ >= this.anInt2429 && i_3_ <= this.anInt2432) {
			return true;
		}
		return false;
	}

	final boolean method1063(final int i, final int i_6_) {
		if (anInt2433 <= i_6_ && i_6_ <= anInt2440 && anInt2437 <= i && i <= anInt2436) {
			return true;
		}
		return false;
	}

	final void method1064(final int i, final int i_7_, final int[] is) {
		is[0] = anInt2434;
		is[2] = -anInt2437 - -this.anInt2429 + i;
		is[1] = -anInt2433 + this.anInt2438 + i_7_;
	}

	public static void method1065() {
		aClass105_2435 = null;
		aByteArrayArrayArray2441 = null;
		aClass105_2439 = null;
	}

	final void method1066(final int i, final int i_9_, final int[] is) {
		is[1] = i_9_ - -anInt2433 + -this.anInt2438;
		is[0] = anInt2430;
		is[2] = anInt2437 + -this.anInt2429 + i;
	}

	Class120_Sub4(final int i, final int i_11_, final int i_12_, final int i_13_, final int i_14_, final int i_15_, final int i_16_, final int i_17_, final int i_18_, final int i_19_) {
		this.anInt2438 = i_16_;
		anInt2433 = i_12_;
		anInt2434 = i_11_;
		anInt2437 = i_13_;
		anInt2436 = i_15_;
		anInt2440 = i_14_;
		anInt2430 = i;
		this.anInt2432 = i_19_;
		this.anInt2429 = i_17_;
		this.anInt2431 = i_18_;
	}
}
