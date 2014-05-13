/* Class92 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class92 {
	static LDSprite aClass120_Sub14_Sub19_Sub2_862;
	static Class98 aClass98_863;
	static int anInt864;
	static boolean[][] aBooleanArrayArray865 = { new boolean[0], { true, false, true }, { true, false, false, true }, { false, false, true, true }, { true, true, false }, { false, true, true }, { true, false, false, true }, { false, false, false, true, true }, { false, true, true },
			{ true, false, true, true, true }, { false, true, true, true, true }, { false, true, true, true, true, false } };

	public static void method765(final byte i) {
		try {
			aClass98_863 = null;
			aBooleanArrayArray865 = null;
			aClass120_Sub14_Sub19_Sub2_862 = null;
			if (i >= -107) {
				Class73.list(5);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("k.E(").append(i).append(')').toString());
		}
	}

	static final int method766(final int i, final int i_0_, final int i_1_, int i_2_) {
		int i_3_;
		try {
			i_2_ &= i_0_;
			if (i_2_ == 0) {
				return i;
			}
			if (i_2_ == 1) {
				return -i_1_ + 1023;
			}
			if (i_2_ == 2) {
				return -i + 1023;
			}
			i_3_ = i_1_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("k.A(").append(i).append(',').append(i_0_).append(',').append(i_1_).append(',').append(i_2_).append(')').toString());
		}
		return i_3_;
	}

	static final void method767(final int i) {
		try {
			Canvas_Sub1.aClass120_Sub7_Sub1_16.method1144(i);
			final int i_4_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getBitValue(1);
			if (i_4_ != 0) {
				final int i_5_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getBitValue(2);
				if (i_5_ == 0) {
					Class169.anIntArray1648[Class154.anInt1441++] = 2047;
				} else if (i_5_ == 1) {
					final int i_6_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getBitValue(3);
					Class100.selfPlayer.method2330(i_6_, i + -24890, 1);
					final int i_7_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getBitValue(1);
					if (i_7_ == 1) {
						Class169.anIntArray1648[Class154.anInt1441++] = 2047;
					}
				} else if (i_5_ == 2) {
					if (Canvas_Sub1.aClass120_Sub7_Sub1_16.getBitValue(1) == 1) {
						final int i_8_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getBitValue(3);
						Class100.selfPlayer.method2330(i_8_, -24892, 2);
						final int i_9_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getBitValue(3);
						Class100.selfPlayer.method2330(i_9_, -24892, 2);
					} else {
						final int i_10_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getBitValue(3);
						Class100.selfPlayer.method2330(i_10_, -24892, 0);
					}
					final int i_11_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getBitValue(1);
					if (i_11_ == 1) {
						Class169.anIntArray1648[Class154.anInt1441++] = 2047;
					}
				} else if (i_5_ == 3) {
					final int i_12_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getBitValue(7);
					final int i_13_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getBitValue(1);
					final int i_14_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getBitValue(1);
					if (i_14_ == 1) {
						Class169.anIntArray1648[Class154.anInt1441++] = 2047;
					}
					Class173.gameLevel = Canvas_Sub1.aClass120_Sub7_Sub1_16.getBitValue(2);
					final int i_15_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getBitValue(7);
					Class100.selfPlayer.method2343(i_12_, i_13_ == 1, i_15_);
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("k.C(").append(i).append(')').toString());
		}
	}

	static final void method768(final int i, final int i_16_, final int i_17_, final int i_18_, final int i_19_, final byte i_20_, final int i_21_, final int i_22_) {
		try {
			final int i_23_ = Class3.method83(Class120_Sub30_Sub2.anInt3699, i_22_, 1, Class139.anInt1334);
			if (i_20_ < 60) {
				anInt864 = -63;
			}
			final int i_24_ = Class3.method83(Class120_Sub30_Sub2.anInt3699, i, 1, Class139.anInt1334);
			final int i_25_ = Class3.method83(Class32.anInt260, i_19_, 1, Class120_Sub14_Sub11.anInt3544);
			final int i_26_ = Class3.method83(Class32.anInt260, i_21_, 1, Class120_Sub14_Sub11.anInt3544);
			final int i_27_ = Class3.method83(Class120_Sub30_Sub2.anInt3699, i_22_ - -i_16_, 1, Class139.anInt1334);
			final int i_28_ = Class3.method83(Class120_Sub30_Sub2.anInt3699, -i_16_ + i, 1, Class139.anInt1334);
			for (int i_29_ = i_23_; i_29_ < i_27_; i_29_++) {
				Class120_Sub8.method1160((byte) 115, GameEntity.anIntArrayArray3009[i_29_], i_18_, i_25_, i_26_);
			}
			for (int i_30_ = i_24_; i_30_ > i_28_; i_30_--) {
				Class120_Sub8.method1160((byte) 115, GameEntity.anIntArrayArray3009[i_30_], i_18_, i_25_, i_26_);
			}
			final int i_31_ = Class3.method83(Class32.anInt260, i_19_ - -i_16_, 1, Class120_Sub14_Sub11.anInt3544);
			final int i_32_ = Class3.method83(Class32.anInt260, -i_16_ + i_21_, 1, Class120_Sub14_Sub11.anInt3544);
			for (int i_33_ = i_27_; i_28_ >= i_33_; i_33_++) {
				final int[] is = GameEntity.anIntArrayArray3009[i_33_];
				Class120_Sub8.method1160((byte) 115, is, i_18_, i_25_, i_31_);
				Class120_Sub8.method1160((byte) 115, is, i_17_, i_31_, i_32_);
				Class120_Sub8.method1160((byte) 115, is, i_18_, i_32_, i_26_);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("k.B(").append(i).append(',').append(i_16_).append(',').append(i_17_).append(',').append(i_18_).append(',').append(i_19_).append(',').append(i_20_).append(',').append(i_21_).append(',').append(i_22_).append(')')
					.toString());
		}
	}
}
