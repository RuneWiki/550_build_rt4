/* Class120_Sub12_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class120_Sub12_Sub3 extends Class120_Sub12 {
	static int anInt3147;
	static int[] anIntArray3148 = { 8, 11, 4, 6, 9, 7, 10, 0 };
	private int anInt3149 = 4096;
	static Class164 aClass164_3150;
	static int anInt3151;
	private int anInt3152 = 4096;
	private int anInt3153 = 4096;

	public static void method1205(final int i) {
		try {
			if (i != 0) {
				method1208(59, (byte) -94);
			}
			aClass164_3150 = null;
			anIntArray3148 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ca.W(").append(i).append(')').toString());
		}
	}

	static final Class120_Sub14_Sub5 method1206(final byte i) {
		Class120_Sub14_Sub5 class120_sub14_sub5;
		try {
			if (Class79.aClass177_690 == null) {
				return null;
			}
			Class22.aClass127_130.method1896(-16646, Class79.aClass177_690);
			final Class120_Sub14_Sub5 class120_sub14_sub5_0_ = (Class120_Sub14_Sub5) Class22.aClass127_130.method1895((byte) -79);
			final Class73 class73 = Class92.method769(true, class120_sub14_sub5_0_.anInt3473);
			if (class73 != null && class73.aBoolean659 && class73.method647(-1)) {
				return class120_sub14_sub5_0_;
			}
			class120_sub14_sub5 = Class112.method992(2048);
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ca.U(").append(i).append(')').toString());
		}
		return class120_sub14_sub5;
	}

	static int method1207(final int i, final int i_1_) {
		int i_2_;
		try {
			i_2_ = i & i_1_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ca.R(").append(i).append(',').append(i_1_).append(')').toString());
		}
		return i_2_;
	}

	@Override
	final void method1180(final byte i, final Buffer class120_sub7, final int i_3_) {
		while_125_: do {
			try {
				if (i != -43) {
					method1206((byte) -4);
				}
				final int i_4_ = i_3_;
				do {
					if (i_4_ != 0) {
						if (i_4_ != 1) {
							if (i_4_ == 2) {
								break;
							}
							break while_125_;
						}
					} else {
						anInt3152 = class120_sub7.getUShort();
						break while_125_;
					}
					anInt3149 = class120_sub7.getUShort();
					break while_125_;
				} while (false);
				anInt3153 = class120_sub7.getUShort();
			} catch (final RuntimeException runtimeexception) {
				throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ca.M(").append(i).append(',').append(class120_sub7 != null ? "{...}" : "null").append(',').append(i_3_).append(')').toString());
			}
		} while (false);
	}

	public Class120_Sub12_Sub3() {
		super(1, false);
	}

	static final Class181 method1208(final int i, final byte i_5_) {
		Class181 class181;
		try {
			Class181 class181_6_ = (Class181) Class120_Sub12_Sub35.aClass21_3411.method193(i, (byte) -121);
			if (class181_6_ != null) {
				return class181_6_;
			}
			if (i_5_ >= -46) {
				return null;
			}
			final byte[] is = Class101.aClass50_966.method442(31, (byte) 120, i);
			class181_6_ = new Class181();
			if (is != null) {
				class181_6_.method2441(true, new Buffer(is), i);
			}
			Class120_Sub12_Sub35.aClass21_3411.method185(-127, class181_6_, i);
			class181 = class181_6_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ca.S(").append(i).append(',').append(i_5_).append(')').toString());
		}
		return class181;
	}

	static final Class107[] method1209(final Class50 class50, final int i, final int i_7_, final int i_8_) {
		Class107[] class107s;
		try {
			if (!Class10.method121(class50, i, i_8_)) {
				return null;
			}
			class107s = Class100.method826(0);
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ca.V(").append(class50 != null ? "{...}" : "null").append(',').append(i).append(',').append(i_7_).append(',').append(i_8_).append(')').toString());
		}
		return class107s;
	}

	@Override
	final int[][] method1188(final int i, final int i_9_) {
		int[][] is;
		try {
			if (i_9_ != -29869) {
				return null;
			}
			final int[][] is_10_ = this.aClass109_2559.method975(i, -62);
			if (this.aClass109_2559.aBoolean1049) {
				final int[][] is_11_ = method1179(0, i, (byte) -51);
				final int[] is_12_ = is_11_[1];
				final int[] is_13_ = is_11_[0];
				final int[] is_14_ = is_10_[0];
				final int[] is_15_ = is_10_[1];
				final int[] is_16_ = is_11_[2];
				final int[] is_17_ = is_10_[2];
				for (int i_18_ = 0; Class120_Sub12_Sub7.anInt3178 > i_18_; i_18_++) {
					final int i_19_ = is_13_[i_18_];
					final int i_20_ = is_16_[i_18_];
					final int i_21_ = is_12_[i_18_];
					if (i_20_ == i_19_ && i_20_ == i_21_) {
						is_14_[i_18_] = anInt3152 * i_19_ >> 12;
						is_15_[i_18_] = i_20_ * anInt3149 >> 12;
						is_17_[i_18_] = anInt3153 * i_21_ >> 12;
					} else {
						is_14_[i_18_] = anInt3152;
						is_15_[i_18_] = anInt3149;
						is_17_[i_18_] = anInt3153;
					}
				}
			}
			is = is_10_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ca.K(").append(i).append(',').append(i_9_).append(')').toString());
		}
		return is;
	}

	static final int method1210(final int i, int i_22_) {
		int i_23_;
		try {
			if (i != -31511) {
				anInt3147 = -1;
			}
			i_22_ = ((i_22_ & ~0x55555554) >>> 1) + (0x55555555 & i_22_);
			i_22_ = (0x33333333 & i_22_) - -(~0x4ccccccc & i_22_ >>> 2);
			i_22_ = 0xf0f0f0f & (i_22_ >>> 4) + i_22_;
			i_22_ += i_22_ >>> 8;
			i_22_ += i_22_ >>> 16;
			i_23_ = i_22_ & 0xff;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ca.T(").append(i).append(',').append(i_22_).append(')').toString());
		}
		return i_23_;
	}
}
