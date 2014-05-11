/* Class154 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class154 {
	static Class32[] aClass32Array1437 = new Class32[8];
	static Class21 aClass21_1438;
	static boolean aBoolean1439 = false;
	static int anInt1440;
	static int anInt1441;
	static int anInt1442;
	static Class50 aClass50_1443;

	static {
		aClass21_1438 = new Class21(32);
		anInt1441 = 0;
		anInt1440 = 0;
		anInt1442 = 0;
	}

	static final void method2078(final boolean bool, final long l, final byte i) {
		do {
			try {
				if (0L != l) {
					if (Class120_Sub12_Sub26.anInt3335 >= 100) {
						Class120_Sub14_Sub14.method1540("", 0, Class143_Sub1.aString2192);
					} else {
						final String string = Class136.method1977(false, l);
						for (int i_0_ = 0; Class120_Sub12_Sub26.anInt3335 > i_0_; i_0_++) {
							if (Class85.aLongArray806[i_0_] == l) {
								Class120_Sub14_Sub14.method1540("", 0, new StringBuilder(string).append(Class69_Sub2_Sub1.aString3078).toString());
								return;
							}
						}
						for (int i_1_ = 0; i_1_ < ProducingGraphicsBuffer.anInt2799; i_1_++) {
							if ((AbstractSprite.aLongArray3617[i_1_] ^ 0xffffffffffffffffL) == (l ^ 0xffffffffffffffffL)) {
								Class120_Sub14_Sub14.method1540("", 0, new StringBuilder(Class120_Sub12_Sub25.aString3319).append(string).append(Class54.aString489).toString());
								return;
							}
						}
						if (string.equals(Class100.selfPlayer.aString3745)) {
							Class120_Sub14_Sub14.method1540("", 0, Class112.aString1079);
						} else {
							Class85.aLongArray806[Class120_Sub12_Sub26.anInt3335] = l;
							Class84.aStringArray801[Class120_Sub12_Sub26.anInt3335] = Class143.method2018(117, l);
							Class120_Sub14_Sub4.aBooleanArray3468[Class120_Sub12_Sub26.anInt3335++] = bool;
							Class61.anInt563 = Class160.anInt1494;
							Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putPacket(197);
							Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putLong(l);
							if (i <= 33) {
								break;
							}
						}
					}
				}
			} catch (final RuntimeException runtimeexception) {
				throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("sd.A(").append(bool).append(',').append(l).append(',').append(i).append(')').toString());
			}
		} while (false);
	}

	static final void method2079(int i, final boolean bool, final boolean bool_2_, int i_3_, int i_4_, int i_5_) {
		try {
			if (i_5_ < 1) {
				i_5_ = 1;
			}
			if (i_3_ < 1) {
				i_3_ = 1;
			}
			if (HDToolkit.glEnabled) {
				int i_6_ = i_3_ + -334;
				if (i_6_ < 0) {
					i_6_ = 0;
				} else if (i_6_ > 100) {
					i_6_ = 100;
				}
				int i_7_ = Class169.aShort1651 + (Class120_Sub14_Sub13.aShort3570 + -Class169.aShort1651) * i_6_ / 100;
				if (Class120_Sub12_Sub16.aShort3250 <= i_7_) {
					if (i_7_ > Class120_Sub14_Sub14_Sub1.aShort3932) {
						i_7_ = Class120_Sub14_Sub14_Sub1.aShort3932;
					}
				} else {
					i_7_ = Class120_Sub12_Sub16.aShort3250;
				}
				int i_8_ = 512 * i_3_ * i_7_ / (i_5_ * 334);
				if (i_8_ < RuntimeException_Sub1.aShort2143) {
					i_8_ = RuntimeException_Sub1.aShort2143;
					i_7_ = i_5_ * i_8_ * 334 / (512 * i_3_);
					if (i_7_ > Class120_Sub14_Sub14_Sub1.aShort3932) {
						i_7_ = Class120_Sub14_Sub14_Sub1.aShort3932;
						final int i_9_ = i_3_ * i_7_ * 512 / (334 * i_8_);
						final int i_10_ = (-i_9_ + i_5_) / 2;
						if (bool) {
							GraphicsHD.method597();
							GraphicsHD.fillRect(i_4_, i, i_10_, i_3_, 0);
							GraphicsHD.fillRect(i_4_ - -i_5_ - i_10_, i, i_10_, i_3_, 0);
						}
						i_5_ -= i_10_ * 2;
						i_4_ += i_10_;
					}
				} else if (i_8_ > GameShell.aShort2) {
					i_8_ = GameShell.aShort2;
					i_7_ = i_8_ * i_5_ * 334 / (i_3_ * 512);
					if (i_7_ < Class120_Sub12_Sub16.aShort3250) {
						i_7_ = Class120_Sub12_Sub16.aShort3250;
						final int i_11_ = 334 * i_5_ * i_8_ / (512 * i_7_);
						final int i_12_ = (i_3_ - i_11_) / 2;
						if (bool) {
							GraphicsHD.method597();
							GraphicsHD.fillRect(i_4_, i, i_5_, i_12_, 0);
							GraphicsHD.fillRect(i_4_, -i_12_ + i - -i_3_, i_5_, i_12_, 0);
						}
						i_3_ -= i_12_ * 2;
						i += i_12_;
					}
				}
				Class179.anInt1775 = i_3_ * i_7_ / 334;
			}
			Class120_Sub28.anInt2751 = i;
			Class120_Sub17.anInt2612 = i_4_;
			Class120_Sub12_Sub27.anInt3339 = (short) i_5_;
			if (!bool_2_) {
				Light.anInt391 = (short) i_3_;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("sd.B(").append(i).append(',').append(bool).append(',').append(bool_2_).append(',').append(i_3_).append(',').append(i_4_).append(',').append(i_5_).append(')').toString());
		}
	}

	public static void method2080(final int i) {
		try {
			if (i != -2322) {
				anInt1440 = -110;
			}
			aClass50_1443 = null;
			aClass21_1438 = null;
			aClass32Array1437 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("sd.C(").append(i).append(')').toString());
		}
	}
}
