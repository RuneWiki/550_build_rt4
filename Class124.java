/* Class124 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class124 {
	boolean aBoolean1193 = true;
	int anInt1194;
	boolean aBoolean1195 = true;
	boolean aBoolean1196;
	int anInt1197;
	int anInt1198;
	int anInt1199;
	int anInt1200;
	static Class98 aClass98_1201;
	int anInt1202;
	int anInt1203;

	static final void method1873(final int i, final int i_0_) {
		try {
			Class154.aClass21_1438.method192(i_0_);
			if (i != -1) {
				method1876((byte) 36);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("oh.B(").append(i).append(',').append(i_0_).append(')').toString());
		}
	}

	static final int method1874(final int i, final int i_1_) {
		int i_2_;
		try {
			if (i_1_ > 0) {
				return 1;
			}
			if (i < (i_1_ ^ 0xffffffff)) {
				return -1;
			}
			i_2_ = 0;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("oh.E(").append(i).append(',').append(i_1_).append(')').toString());
		}
		return i_2_;
	}

	final void method1875(final int i, final Buffer class120_sub7, final int i_3_) {
		try {
			if (i_3_ != -1) {
				this.aBoolean1195 = false;
			}
			for (;;) {
				final int i_4_ = class120_sub7.getUByte();
				if (i_4_ == 0) {
					break;
				}
				method1877(i_4_, -119, i, class120_sub7);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("oh.D(").append(i).append(',').append(class120_sub7 != null ? "{...}" : "null").append(',').append(i_3_).append(')').toString());
		}
	}

	public static void method1876(final byte i) {
		try {
			if (i != 16) {
				method1874(10, -62);
			}
			aClass98_1201 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("oh.C(").append(i).append(')').toString());
		}
	}

	private final void method1877(final int i, final int i_5_, final int i_6_, final Buffer class120_sub7) {
		try {
			if (i == 1) {
				this.anInt1197 = Class120_Sub12_Sub1.method1200(class120_sub7.getMedium(), 1624671788);
			} else if (i != 2) {
				if (i != 3) {
					if (i != 5) {
						if (i != 7) {
							if (i == 8) {
								Class23.anInt137 = i_6_;
							} else if (i == 9) {
								this.anInt1202 = class120_sub7.getUShort();
							} else if (i != 10) {
								if (i == 11) {
									this.anInt1194 = class120_sub7.getUByte();
								} else if (i != 12) {
									if (i != 13) {
										if (i == 14) {
											this.anInt1199 = class120_sub7.getUByte();
										}
									} else {
										this.anInt1200 = class120_sub7.getMedium();
									}
								} else {
									this.aBoolean1196 = true;
								}
							} else {
								this.aBoolean1193 = false;
							}
						} else {
							this.anInt1198 = Class120_Sub12_Sub1.method1200(class120_sub7.getMedium(), 1624671788);
						}
					} else {
						this.aBoolean1195 = false;
					}
				} else {
					this.anInt1203 = class120_sub7.getUShort();
					if ((this.anInt1203 ^ 0xffffffff) == -65536) {
						this.anInt1203 = -1;
					}
				}
			} else {
				this.anInt1203 = class120_sub7.getUByte();
			}
			if (i_5_ > -51) {
				this.anInt1197 = -48;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("oh.A(").append(i).append(',').append(i_5_).append(',').append(i_6_).append(',').append(class120_sub7 != null ? "{...}" : "null").append(')').toString());
		}
	}

	public Class124() {
		this.anInt1194 = 8;
		this.anInt1198 = -1;
		this.anInt1197 = 0;
		this.anInt1200 = 1190717;
		this.anInt1199 = 16;
		this.aBoolean1196 = false;
		this.anInt1203 = -1;
		this.anInt1202 = 128;
	}
}
