/* Class120_Sub5_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class120_Sub5_Sub1 extends Class120_Sub5 {
	byte[] output;
	int loopBegin;
	int anInt3116;
	boolean aBoolean3117;
	int loopEnd;

	final Class120_Sub5_Sub1 method1067(final Decimator decimator) {
		this.output = decimator.method2220(this.output);
		this.anInt3116 = decimator.method2217(this.anInt3116);
		if (this.loopBegin == this.loopEnd) {
			this.loopBegin = this.loopEnd = decimator.method2218(this.loopBegin);
		} else {
			this.loopBegin = decimator.method2218(this.loopBegin);
			this.loopEnd = decimator.method2218(this.loopEnd);
			if (this.loopBegin == this.loopEnd) {
				this.loopBegin--;
			}
		}
		return this;
	}

	Class120_Sub5_Sub1(final int i, final byte[] is, final int i_0_, final int i_1_) {
		this.anInt3116 = i;
		this.output = is;
		this.loopBegin = i_0_;
		this.loopEnd = i_1_;
	}

	Class120_Sub5_Sub1(final int i, final byte[] is, final int i_2_, final int i_3_, final boolean bool) {
		this.anInt3116 = i;
		this.output = is;
		this.loopBegin = i_2_;
		this.loopEnd = i_3_;
		this.aBoolean3117 = bool;
	}
}
