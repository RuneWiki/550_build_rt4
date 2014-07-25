/* Class120_Sub12_Sub23 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class120_Sub12_Sub23 extends Class120_Sub12 {
	static int[] anIntArray3304;
	static js5 aClass50_3305;
	static float aFloat3306;
	static int anInt3307 = 0;
	static int anInt3308;

	static {
		anIntArray3304 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1,
				-1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1,
				-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
				-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
				-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
				-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
				-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
				-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };
		anInt3308 = 0;
	}

	static final void method1323(final SeqType seqType, final int x, final int z, final int i_1_, final boolean bool) {
		if (Class150.anInt1407 < 50 && seqType != null && seqType.anIntArrayArray347 != null && seqType.anIntArrayArray347.length > i_1_ && seqType.anIntArrayArray347[i_1_] != null) {
			final int i_3_ = seqType.anIntArrayArray347[i_1_][0];
			int i_4_ = i_3_ >> 8;
			final int i_5_ = (0xe4 & i_3_) >> 5;
			final int i_6_ = i_3_ & 0x1f;
			if (seqType.anIntArrayArray347[i_1_].length > 1) {
				final int i_7_ = (int) (seqType.anIntArrayArray347[i_1_].length * Math.random());
				if (i_7_ > 0) {
					i_4_ = seqType.anIntArrayArray347[i_1_][i_7_];
				}
			}
			if (i_6_ == 0) {
				if (bool) {
					Class48.method404(0, i_4_, i_5_, 255);
				}
			} else if (CursorType.anInt1242 != 0) {
				Class120_Sub12_Sub16.anIntArray3255[Class150.anInt1407] = i_4_;
				LocType.anIntArray1834[Class150.anInt1407] = i_5_;
				Class81.anIntArray779[Class150.anInt1407] = 0;
				Class109.aClass6Array1047[Class150.anInt1407] = null;
				FileSystemRequest.anIntArray3926[Class150.anInt1407] = 255;
				final int i_8_ = (z - 64) / 128;
				final int i_9_ = (x - 64) / 128;
				Class174.anIntArray1731[Class150.anInt1407] = i_6_ + (i_8_ << 8) + (i_9_ << 16);
				Class150.anInt1407++;
			}
		}
	}

	@Override
	final int[] method1187(final int i_10_) {
		return Class90.anIntArray849;
	}

	public static void method1324(final int i) {
		try {
			aClass50_3305 = null;
			anIntArray3304 = null;
			if (i != -1) {
				anInt3307 = 95;
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("pk.U(").append(i).append(')').toString());
		}
	}

	static final void method1325(final int i, final int i_11_, final int i_12_, final int i_13_, final int i_14_) {
		try {
			int i_15_ = 0;
			if (i_14_ >= -120) {
				anInt3308 = 35;
			}
			int i_16_ = i_12_;
			int i_17_ = -1;
			int i_18_ = -i_12_;
			final int i_19_ = Class3.method83(Class32.anInt260, i_12_ + i_11_, 1, ParamType.anInt3544);
			final int i_20_ = Class3.method83(Class32.anInt260, i_11_ - i_12_, 1, ParamType.anInt3544);
			AmbientSound.fillArray(GameEntity.anIntArrayArray3009[i], i_13_, i_20_, i_19_);
			while (i_16_ > i_15_) {
				i_17_ += 2;
				i_18_ += i_17_;
				if (i_18_ > 0) {
					i_16_--;
					i_18_ -= i_16_ << 1;
					final int i_21_ = -i_16_ + i;
					final int i_22_ = i_16_ + i;
					if (i_22_ >= Class120_Sub30_Sub2.anInt3699 && i_21_ <= IdentityKit.anInt1334) {
						final int i_23_ = Class3.method83(Class32.anInt260, i_11_ + i_15_, 1, ParamType.anInt3544);
						final int i_24_ = Class3.method83(Class32.anInt260, i_11_ - i_15_, 1, ParamType.anInt3544);
						if (IdentityKit.anInt1334 >= i_22_) {
							AmbientSound.fillArray(GameEntity.anIntArrayArray3009[i_22_], i_13_, i_24_, i_23_);
						}
						if (Class120_Sub30_Sub2.anInt3699 <= i_21_) {
							AmbientSound.fillArray(GameEntity.anIntArrayArray3009[i_21_], i_13_, i_24_, i_23_);
						}
					}
				}
				i_15_++;
				final int i_25_ = i - i_15_;
				final int i_26_ = i + i_15_;
				if (Class120_Sub30_Sub2.anInt3699 <= i_26_ && i_25_ <= IdentityKit.anInt1334) {
					final int i_27_ = Class3.method83(Class32.anInt260, i_11_ - -i_16_, 1, ParamType.anInt3544);
					final int i_28_ = Class3.method83(Class32.anInt260, i_11_ - i_16_, 1, ParamType.anInt3544);
					if (i_26_ <= IdentityKit.anInt1334) {
						AmbientSound.fillArray(GameEntity.anIntArrayArray3009[i_26_], i_13_, i_28_, i_27_);
					}
					if (Class120_Sub30_Sub2.anInt3699 <= i_25_) {
						AmbientSound.fillArray(GameEntity.anIntArrayArray3009[i_25_], i_13_, i_28_, i_27_);
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("pk.R(").append(i).append(',').append(i_11_).append(',').append(i_12_).append(',').append(i_13_).append(',').append(i_14_).append(')').toString());
		}
	}

	static final String method1326(final String string) {
		String returnString = Class136.longToString(Varp.stringToLong(string));
		if (returnString == null) {
			returnString = "";
		}
		return returnString;
	}

	public Class120_Sub12_Sub23() {
		super(0, true);
	}
}
