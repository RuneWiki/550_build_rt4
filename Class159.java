/* Class159 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class159 {
	static boolean worldsLoaded = false;
	static int anInt1488 = 0;
	static short[][] aShortArrayArray1489;
	static js5 aClass50_1490;

	static final synchronized byte[] method2092(final int i, final int i_0_) {
		byte[] is;
		try {
			if (i_0_ == 100 && JavaObject.anInt3913 > 0) {
				final byte[] is_1_ = Class101_Sub2.aByteArrayArray2278[--JavaObject.anInt3913];
				Class101_Sub2.aByteArrayArray2278[JavaObject.anInt3913] = null;
				return is_1_;
			}
			if (i < 88) {
				method2093(-126);
			}
			if (i_0_ == 5000 && Class118.anInt1133 > 0) {
				final byte[] is_2_ = Class134.aByteArrayArray1279[--Class118.anInt1133];
				Class134.aByteArrayArray1279[Class118.anInt1133] = null;
				return is_2_;
			}
			if (i_0_ == 30000 && Class120_Sub12_Sub6.anInt3173 > 0) {
				final byte[] is_3_ = Class43.aByteArrayArray365[--Class120_Sub12_Sub6.anInt3173];
				Class43.aByteArrayArray365[Class120_Sub12_Sub6.anInt3173] = null;
				return is_3_;
			}
			is = new byte[i_0_];
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("sm.A(").append(i).append(',').append(i_0_).append(')').toString());
		}
		return is;
	}

	public static void method2093(final int i) {
		try {
			aShortArrayArray1489 = null;
			aClass50_1490 = null;
			if (i == 30000) {
				Class145.aClass21_1486 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("sm.B(").append(i).append(')').toString());
		}
	}

	static final void method2095(final int i, final int i_5_, final int i_6_, final int i_7_, final int i_8_, final int i_10_, final int i_11_) {
		int i_12_ = 0;
		final int i_13_ = i_7_ - i_11_;
		int i_14_ = i_7_;
		int i_15_ = 0;
		final int i_16_ = -i_11_ + i_10_;
		final int i_17_ = i_10_ * i_10_;
		final int i_18_ = i_7_ * i_7_;
		final int i_19_ = i_16_ * i_16_;
		final int i_20_ = i_18_ << 1;
		final int i_21_ = i_13_ * i_13_;
		final int i_22_ = i_17_ << 1;
		final int i_23_ = i_21_ << 1;
		final int i_24_ = i_19_ << 1;
		final int i_25_ = i_7_ << 1;
		final int i_26_ = i_13_ << 1;
		int i_27_ = i_20_ + (1 + -i_25_) * i_17_;
		int i_28_ = -((i_25_ + -1) * i_22_) + i_18_;
		int i_29_ = i_19_ * (1 + -i_26_) + i_23_;
		final int i_30_ = i_17_ << 2;
		int i_31_ = -(i_24_ * (-1 + i_26_)) + i_21_;
		final int i_32_ = i_18_ << 2;
		final int i_33_ = i_19_ << 2;
		final int i_34_ = i_21_ << 2;
		int i_35_ = i_20_ * 3;
		int i_36_ = i_23_ * 3;
		int i_37_ = i_22_ * (i_25_ + -3);
		int i_38_ = i_32_;
		int i_39_ = (-3 + i_26_) * i_24_;
		int i_40_ = i_30_ * (i_7_ + -1);
		int i_41_ = i_34_;
		int i_42_ = (-1 + i_13_) * i_33_;
		if (i_8_ >= Class120_Sub30_Sub2.anInt3699 && IdentityKit.anInt1334 >= i_8_) {
			final int[] is = GameEntity.anIntArrayArray3009[i_8_];
			final int i_43_ = Class3.method83(Class32.anInt260, -i_10_ + i_6_, ParamType.anInt3544);
			final int i_44_ = Class3.method83(Class32.anInt260, i_6_ + i_10_, ParamType.anInt3544);
			final int i_45_ = Class3.method83(Class32.anInt260, i_6_ - i_16_, ParamType.anInt3544);
			final int i_46_ = Class3.method83(Class32.anInt260, i_6_ + i_16_, ParamType.anInt3544);
			AmbientSound.fillArray(is, i_5_, i_43_, i_45_);
			AmbientSound.fillArray(is, i, i_45_, i_46_);
			AmbientSound.fillArray(is, i_5_, i_46_, i_44_);
		}
		while (i_14_ > 0) {
			if (i_27_ < 0) {
				while (i_27_ < 0) {
					i_27_ += i_35_;
					i_12_++;
					i_35_ += i_32_;
					i_28_ += i_38_;
					i_38_ += i_32_;
				}
			}
			if (i_28_ < 0) {
				i_12_++;
				i_27_ += i_35_;
				i_35_ += i_32_;
				i_28_ += i_38_;
				i_38_ += i_32_;
			}
			final boolean bool = i_13_ >= i_14_;
			i_28_ += -i_37_;
			i_14_--;
			if (bool) {
				if (i_29_ < 0) {
					while (i_29_ < 0) {
						i_29_ += i_36_;
						i_31_ += i_41_;
						i_36_ += i_34_;
						i_41_ += i_34_;
						i_15_++;
					}
				}
				if (i_31_ < 0) {
					i_29_ += i_36_;
					i_36_ += i_34_;
					i_31_ += i_41_;
					i_41_ += i_34_;
					i_15_++;
				}
				i_31_ += -i_39_;
				i_39_ -= i_33_;
				i_29_ += -i_42_;
				i_42_ -= i_33_;
			}
			i_27_ += -i_40_;
			final int i_47_ = i_14_ + i_8_;
			final int i_48_ = i_8_ - i_14_;
			i_40_ -= i_30_;
			i_37_ -= i_30_;
			if (i_47_ >= Class120_Sub30_Sub2.anInt3699 && IdentityKit.anInt1334 >= i_48_) {
				final int i_49_ = Class3.method83(Class32.anInt260, i_12_ + i_6_, ParamType.anInt3544);
				final int i_50_ = Class3.method83(Class32.anInt260, i_6_ + -i_12_, ParamType.anInt3544);
				if (bool) {
					final int i_51_ = Class3.method83(Class32.anInt260, i_6_ - -i_15_, ParamType.anInt3544);
					final int i_52_ = Class3.method83(Class32.anInt260, -i_15_ + i_6_, ParamType.anInt3544);
					if (Class120_Sub30_Sub2.anInt3699 <= i_48_) {
						final int[] is = GameEntity.anIntArrayArray3009[i_48_];
						AmbientSound.fillArray(is, i_5_, i_50_, i_52_);
						AmbientSound.fillArray(is, i, i_52_, i_51_);
						AmbientSound.fillArray(is, i_5_, i_51_, i_49_);
					}
					if (IdentityKit.anInt1334 >= i_47_) {
						final int[] is = GameEntity.anIntArrayArray3009[i_47_];
						AmbientSound.fillArray(is, i_5_, i_50_, i_52_);
						AmbientSound.fillArray(is, i, i_52_, i_51_);
						AmbientSound.fillArray(is, i_5_, i_51_, i_49_);
					}
				} else {
					if (i_48_ >= Class120_Sub30_Sub2.anInt3699) {
						AmbientSound.fillArray(GameEntity.anIntArrayArray3009[i_48_], i_5_, i_50_, i_49_);
					}
					if (IdentityKit.anInt1334 >= i_47_) {
						AmbientSound.fillArray(GameEntity.anIntArrayArray3009[i_47_], i_5_, i_50_, i_49_);
					}
				}
			}
		}
	}

	static final void method2096(final int i, final int i_53_, final boolean bool, final int i_54_, final int i_55_) {
		try {
			if (bool) {
				method2092(-15, -78);
			}
			if (-i + i_55_ < Class32.anInt260 || ParamType.anInt3544 < i_55_ + i || -i + i_54_ < Class120_Sub30_Sub2.anInt3699 || i_54_ + i > IdentityKit.anInt1334) {
				Class120_Sub12_Sub23.method1325(i_54_, i_55_, i, i_53_, -127);
			} else {
				CollisionMap.method211(i_54_, i_55_, i, i_53_);
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("sm.D(").append(i).append(',').append(i_53_).append(',').append(bool).append(',').append(i_54_).append(',').append(i_55_).append(')').toString());
		}
	}
}
