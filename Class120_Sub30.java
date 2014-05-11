/* Class120_Sub30 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class120_Sub30 extends Node {
	int anInt2781;
	Class120_Sub5 aClass120_Sub5_2782;
	Class120_Sub30 aClass120_Sub30_2783;
	volatile boolean aBoolean2784 = true;

	abstract void method1731(int i);

	abstract int method1732();

	int method1733() {
		return 255;
	}

	abstract void method1734(int[] is, int i, int i_0_);

	abstract Class120_Sub30 method1735();

	abstract Class120_Sub30 method1736();

	final void method1737(final int[] is, final int i, final int i_1_) {
		if (this.aBoolean2784) {
			method1734(is, i, i_1_);
		} else {
			method1731(i_1_);
		}
	}

	public Class120_Sub30() {
		/* empty */
	}
}
