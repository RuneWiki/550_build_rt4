/* Class120_Sub5_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class120_Sub5_Sub1 extends Class120_Sub5 {
	byte[] aByteArray3114;
	int anInt3115;
	int anInt3116;
	boolean aBoolean3117;
	int anInt3118;

	final Class120_Sub5_Sub1 method1067(final Decimator decimator) {
		this.aByteArray3114 = decimator.method2220(this.aByteArray3114);
		this.anInt3116 = decimator.method2217(this.anInt3116, (byte) -127);
		if (this.anInt3115 == this.anInt3118) {
			this.anInt3115 = this.anInt3118 = decimator.method2218(-125, this.anInt3115);
		} else {
			this.anInt3115 = decimator.method2218(-126, this.anInt3115);
			this.anInt3118 = decimator.method2218(-125, this.anInt3118);
			if (this.anInt3115 == this.anInt3118) {
				this.anInt3115--;
			}
		}
		return this;
	}

	Class120_Sub5_Sub1(final int i, final byte[] is, final int i_0_, final int i_1_) {
		this.anInt3116 = i;
		this.aByteArray3114 = is;
		this.anInt3115 = i_0_;
		this.anInt3118 = i_1_;
	}

	Class120_Sub5_Sub1(final int i, final byte[] is, final int i_2_, final int i_3_, final boolean bool) {
		this.anInt3116 = i;
		this.aByteArray3114 = is;
		this.anInt3115 = i_2_;
		this.anInt3118 = i_3_;
		this.aBoolean3117 = bool;
	}
}
