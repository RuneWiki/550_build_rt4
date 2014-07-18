/* Class111 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class111 {
	static String aString1056;
	static Class28[] aClass28Array1057;
	static boolean aBoolean1058;
	static int anInt1060 = 0;
	static int anInt1061 = 127;
	static String aString1062 = "glow1:";
	static int[] anIntArray1063;
	static js5 aClass50_1064;
	static int anInt1065;
	static String aString1066 = "cyan:";

	static {
		aString1056 = "Choose Option";
		aBoolean1058 = false;
	}

	static final void method981(int i, final int i_0_) {
		try {
			if (i > 256) {
				i = 256;
			}
			if (i > 10) {
				i = 10;
			}
			DummyOutputStream.anInt32 += i * 128;
			if (InterfaceChangeNode.anIntArray3485.length < DummyOutputStream.anInt32) {
				DummyOutputStream.anInt32 -= InterfaceChangeNode.anIntArray3485.length;
				final int i_2_ = (int) (Math.random() * 12.0);
				Class96.method787(-69, JagexSocket.aClass107_Sub1Array426[i_2_]);
			}
			int i_3_ = 0;
			final int i_4_ = 128 * i;
			final int i_5_ = 128 * (-i + 256);
			int i_6_ = 0;
			if (i_0_ != 824) {
				anInt1065 = 106;
			}
			for (/**/; i_6_ < i_5_; i_6_++) {
				int i_7_ = Light.anIntArray392[i_4_ + i_3_] - i * InterfaceChangeNode.anIntArray3485[DummyOutputStream.anInt32 + i_3_ & -1 + InterfaceChangeNode.anIntArray3485.length] / 6;
				if (i_7_ < 0) {
					i_7_ = 0;
				}
				Light.anIntArray392[i_3_++] = i_7_;
			}
			for (i_6_ = -i + 256; i_6_ < 256; i_6_++) {
				final int i_8_ = 128 * i_6_;
				for (int i_9_ = 0; i_9_ < 128; i_9_++) {
					final int i_10_ = (int) (Math.random() * 100.0);
					if (i_10_ < 50 && i_9_ > 10 && i_9_ < 118) {
						Light.anIntArray392[i_8_ + i_9_] = 255;
					} else {
						Light.anIntArray392[i_8_ + i_9_] = 0;
					}
				}
			}
			for (i_6_ = 0; i_6_ < -i + 256; i_6_++) {
				Class120_Sub15.anIntArray2597[i_6_] = Class120_Sub15.anIntArray2597[i_6_ - -i];
			}
			for (i_6_ = -i + 256; i_6_ < 256; i_6_++) {
				Class120_Sub15.anIntArray2597[i_6_] = (int) (16.0 * Math.sin(MouseRecorder.anInt852 / 14.0) + 14.0 * Math.sin(MouseRecorder.anInt852 / 15.0) + 12.0 * Math.sin(MouseRecorder.anInt852 / 16.0));
				MouseRecorder.anInt852++;
			}
			Class74.anInt667 += i;
			i_6_ = (i - -(0x1 & Class101_Sub2.loopCycle)) / 2;
			if (i_6_ > 0) {
				for (int i_11_ = 0; i_11_ < Class74.anInt667; i_11_++) {
					final int i_12_ = 2 + (int) (124.0 * Math.random());
					final int i_13_ = (int) (128.0 * Math.random()) - -128;
					Light.anIntArray392[(i_13_ << 7) + i_12_] = 192;
				}
				Class74.anInt667 = 0;
				for (int i_14_ = 0; i_14_ < 256; i_14_++) {
					int i_15_ = 0;
					final int i_16_ = 128 * i_14_;
					for (int i_17_ = -i_6_; i_17_ < 128; i_17_++) {
						if (i_17_ + i_6_ < 128) {
							i_15_ += Light.anIntArray392[i_6_ + i_17_ - -i_16_];
						}
						if (-1 + -i_6_ + i_17_ >= 0) {
							i_15_ -= Light.anIntArray392[i_16_ + i_17_ + -1 + -i_6_];
						}
						if (i_17_ >= 0) {
							Class160.anIntArray1501[i_17_ + i_16_] = i_15_ / (1 + 2 * i_6_);
						}
					}
				}
				for (int i_18_ = 0; i_18_ < 128; i_18_++) {
					int i_19_ = 0;
					for (int i_20_ = -i_6_; i_20_ < 256; i_20_++) {
						final int i_21_ = 128 * i_20_;
						if (i_20_ + i_6_ < 256) {
							i_19_ += Class160.anIntArray1501[i_21_ + i_18_ - -(128 * i_6_)];
						}
						if (i_20_ + -1 + -i_6_ >= 0) {
							i_19_ -= Class160.anIntArray1501[-128 - (128 * i_6_ - i_21_ - i_18_)];
						}
						if (i_20_ >= 0) {
							Light.anIntArray392[i_21_ + i_18_] = i_19_ / (2 * i_6_ - -1);
						}
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("mf.B(").append(i).append(',').append(i_0_).append(')').toString());
		}
	}

	static final int method982(final int i, final int i_22_, final String string) {
		int i_23_;
		try {
			if (i != -22511) {
				method982(100, -72, null);
			}
			i_23_ = CanvasWrapper.method65(string, i_22_, true);
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("mf.C(").append(i).append(',').append(i_22_).append(',').append(string != null ? "{...}" : "null").append(')').toString());
		}
		return i_23_;
	}

	public static void method983(final int i) {
		try {
			aClass28Array1057 = null;
			aString1056 = null;
			aString1066 = null;
			anIntArray1063 = null;
			aString1062 = null;
			aClass50_1064 = null;
			ParamType.configClient = null;
			if (i != 212098599) {
				aClass50_1064 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("mf.A(").append(i).append(')').toString());
		}
	}

	static final void method984(final GameEntity class180_sub5, final int i) {
		try {
			if (Class101_Sub2.loopCycle == class180_sub5.anInt2961 || class180_sub5.anInt3006 == -1 || class180_sub5.anInt2993 != 0 || class180_sub5.anInt3044 + 1 > SeqType.list(class180_sub5.anInt3006).cycles[class180_sub5.anInt2964]) {
				final int i_24_ = class180_sub5.anInt2961 - class180_sub5.anInt3035;
				final int i_25_ = Class101_Sub2.loopCycle - class180_sub5.anInt3035;
				final int i_26_ = 128 * class180_sub5.anInt2967 + 64 * class180_sub5.getSize();
				final int i_27_ = class180_sub5.anInt3034 * 128 - -(64 * class180_sub5.getSize());
				final int i_28_ = class180_sub5.anInt3015 * 128 + 64 * class180_sub5.getSize();
				final int i_29_ = 128 * class180_sub5.anInt3026 + class180_sub5.getSize() * 64;
				class180_sub5.z = ((-i_25_ + i_24_) * i_27_ + i_25_ * i_29_) / i_24_;
				class180_sub5.x = (i_26_ * (i_24_ - i_25_) - -(i_28_ * i_25_)) / i_24_;
			}
			if (class180_sub5.anInt3008 == 0) {
				class180_sub5.anInt3019 = 1024;
			}
			if (class180_sub5.anInt3008 == 1) {
				class180_sub5.anInt3019 = 1536;
			}
			if (class180_sub5.anInt3008 == 2) {
				class180_sub5.anInt3019 = 0;
			}
			class180_sub5.anInt3037 = i;
			if (class180_sub5.anInt3008 == 3) {
				class180_sub5.anInt3019 = 512;
			}
			class180_sub5.anInt3032 = class180_sub5.anInt3019;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("mf.D(").append(class180_sub5 != null ? "{...}" : "null").append(',').append(i).append(')').toString());
		}
	}
}
