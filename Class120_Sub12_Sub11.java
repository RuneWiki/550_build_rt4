/* Class120_Sub12_Sub11 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class120_Sub12_Sub11 extends Class120_Sub12 {
	static int[] spriteWidths;
	private int anInt3207;
	private int anInt3208;
	static PacketBuffer outputStream;
	private int anInt3210;
	static int anInt3211 = -1;
	static Npc[] npcList;
	static Class50 aClass50_3213;
	static int anInt3214;
	static JagexSocket aClass46_3215;
	static short aShort3216;

	static {
		outputStream = new PacketBuffer(5000);
		anInt3214 = 0;
		npcList = new Npc[32768];
		aShort3216 = (short) 256;
	}

	private Class120_Sub12_Sub11(final int i) {
		super(0, false);
		method1251(-3, i);
	}

	@Override
	final void method1180(final byte i, final Buffer class120_sub7, final int i_0_) {
		try {
			if (i == -43) {
				final int i_1_ = i_0_;
				if (i_1_ == 0) {
					method1251(i ^ 0x28, class120_sub7.getTriByte());
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("hk.M(").append(i).append(',').append(class120_sub7 != null ? "{...}" : "null").append(',').append(i_0_).append(')').toString());
		}
	}

	static final void method1250(final int i, final boolean bool, final int i_2_) {
		try {
			if (!bool) {
				npcList = null;
			}
			final InterfaceChangeNode class120_sub14_sub7 = AbstractObject.putInterfaceChange(6, i_2_);
			class120_sub14_sub7.method1454((byte) -99);
			class120_sub14_sub7.anInt3484 = i;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("hk.W(").append(i).append(',').append(bool).append(',').append(i_2_).append(')').toString());
		}
	}

	public Class120_Sub12_Sub11() {
		this(0);
	}

	@Override
	final int[][] method1188(final int i, final int i_3_) {
		int[][] is;
		try {
			if (i_3_ != -29869) {
				anInt3211 = 64;
			}
			final int[][] is_4_ = this.aClass109_2559.method975(i, -127);
			if (this.aClass109_2559.aBoolean1049) {
				final int[] is_5_ = is_4_[1];
				final int[] is_6_ = is_4_[0];
				final int[] is_7_ = is_4_[2];
				for (int i_8_ = 0; Class120_Sub12_Sub7.anInt3178 > i_8_; i_8_++) {
					is_6_[i_8_] = anInt3210;
					is_5_[i_8_] = anInt3208;
					is_7_[i_8_] = anInt3207;
				}
			}
			is = is_4_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("hk.K(").append(i).append(',').append(i_3_).append(')').toString());
		}
		return is;
	}

	private final void method1251(final int i, final int i_9_) {
		try {
			anInt3208 = (i_9_ & 0xff00) >> 4;
			anInt3210 = 0xff0 & i_9_ >> 12;
			anInt3207 = 0xff0 & i_9_ << 4;
			if (i != -3) {
				npcList = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("hk.R(").append(i).append(',').append(i_9_).append(')').toString());
		}
	}

	public static void method1252(final int i) {
		try {
			npcList = null;
			outputStream = null;
			aClass46_3215 = null;
			aClass50_3213 = null;
			spriteWidths = null;
			if (i != -129) {
				translateStrings(-27);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("hk.S(").append(i).append(')').toString());
		}
	}

	static final void translateStrings(final int langId) {
		if (langId != 0) {
			if (langId == 1) {
				Class143.translateToGermany();
			} else if (langId == 2) {
				Class120_Sub8.translateToFrench();
			} else {
				Class173.translateToSpanish();
			}
		}
	}

	static final Class167_Sub1 method1254(final int i) {
		Class167_Sub1 class167_sub1;
		try {
			if (i != 6) {
				npcList = null;
			}
			if (Class86.aClass167_Sub1Array817.length > Class108_Sub3.anInt2395) {
				return Class86.aClass167_Sub1Array817[Class108_Sub3.anInt2395++];
			}
			class167_sub1 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("hk.T(").append(i).append(')').toString());
		}
		return class167_sub1;
	}

	static final void method1255(final Light light, final int[] is, final float[][] fs, final int i, final int i_10_, final Class133 class133, final float[][] fs_11_, final int i_12_, final float[][] fs_13_, final int i_14_, final int[][] is_15_) {
		try {
			final int[] is_16_ = new int[is.length / 2];
			if (i_12_ != 1) {
				method1250(-43, false, -91);
			}
			for (int i_17_ = 0; is_16_.length > i_17_; i_17_++) {
				int i_18_ = is[i_17_ + i_17_];
				int i_19_ = is[1 + i_17_ + i_17_];
				if (i_14_ == 1) {
					final int i_20_ = i_18_;
					i_18_ = i_19_;
					i_19_ = -i_20_ + 128;
				} else if (i_14_ == 2) {
					i_18_ = -i_18_ + 128;
					i_19_ = 128 + -i_19_;
				} else if (i_14_ == 3) {
					final int i_21_ = i_18_;
					i_18_ = 128 + -i_19_;
					i_19_ = i_21_;
				}
				float f;
				float f_22_;
				float f_23_;
				if (i_18_ != 0 || i_19_ != 0) {
					if (i_18_ == 128 && i_19_ == 0) {
						f = fs_11_[1 + i_10_][i];
						f_23_ = fs[1 + i_10_][i];
						f_22_ = fs_13_[1 + i_10_][i];
					} else if (i_18_ != 128 || i_19_ != 128) {
						if (i_18_ != 0 || i_19_ != 128) {
							f_22_ = fs_13_[i_10_][i];
							final float f_24_ = i_18_ / 128.0F;
							f_23_ = fs[i_10_][i];
							f_23_ += (-f_23_ + fs[i_10_ - -1][i]) * f_24_;
							f_22_ += f_24_ * (-f_22_ + fs_13_[1 + i_10_][i]);
							f = fs_11_[i_10_][i];
							float f_25_ = fs[i_10_][i - -1];
							f += (fs_11_[i_10_ + 1][i] - f) * f_24_;
							final float f_26_ = i_19_ / 128.0F;
							float f_27_ = fs_13_[i_10_][1 + i];
							float f_28_ = fs_11_[i_10_][i - -1];
							f_28_ += (-f_28_ + fs_11_[1 + i_10_][1 + i]) * f_24_;
							f += (f_28_ - f) * f_26_;
							f_27_ += (-f_27_ + fs_13_[1 + i_10_][1 + i]) * f_24_;
							f_25_ += f_24_ * (-f_25_ + fs[1 + i_10_][1 + i]);
							f_23_ += f_26_ * (-f_23_ + f_25_);
							f_22_ += (f_27_ - f_22_) * f_26_;
						} else {
							f_22_ = fs_13_[i_10_][i + 1];
							f = fs_11_[i_10_][1 + i];
							f_23_ = fs[i_10_][i + 1];
						}
					} else {
						f = fs_11_[1 + i_10_][1 + i];
						f_23_ = fs[1 + i_10_][1 + i];
						f_22_ = fs_13_[1 + i_10_][1 + i];
					}
				} else {
					f = fs_11_[i_10_][i];
					f_22_ = fs_13_[i_10_][i];
					f_23_ = fs[i_10_][i];
				}
				final int i_29_ = i_18_ + (i_10_ << 7);
				final int i_30_ = (i << 7) + i_19_;
				final int i_31_ = Class11.method130(i_18_, i_10_, i_19_, is_15_, i, 13);
				is_16_[i_17_] = class133.method1948(light, i_29_, i_31_, i_30_, f, f_22_, f_23_);
			}
			class133.method1944(is_16_);
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("hk.U(").append(light != null ? "{...}" : "null").append(',').append(is != null ? "{...}" : "null").append(',').append(fs != null ? "{...}" : "null").append(',').append(i).append(',').append(i_10_).append(',')
					.append(class133 != null ? "{...}" : "null").append(',').append(fs_11_ != null ? "{...}" : "null").append(',').append(i_12_).append(',').append(fs_13_ != null ? "{...}" : "null").append(',').append(i_14_).append(',').append(is_15_ != null ? "{...}" : "null").append(')')
					.toString());
		}
	}
}
