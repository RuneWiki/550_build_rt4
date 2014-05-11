/* Class57 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class57 {
	static Class50 aClass50_499;
	static int anInt500 = 0;
	static Class84 aClass84_501;
	static int anInt502;
	static boolean[] aBooleanArray503;
	static int anInt504 = 0;

	static {
		aClass84_501 = new Class84();
	}

	public static void method491(final int i) {
		try {
			if (i >= -14) {
				anInt500 = 96;
			}
			aClass84_501 = null;
			aClass50_499 = null;
			aBooleanArray503 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("gh.D(").append(i).append(')').toString());
		}
	}

	static final void method492(final int i) {
		try {
			final int i_0_ = Class24.method207();
			if (i_0_ != 0) {
				if (i_0_ != 1) {
					LocType.method2465((byte) (-4 + InterfaceChangeNode.anInt3490 & 0xff), true);
					IsaacCipher.method905(16448, 2);
				} else {
					LocType.method2465((byte) 0, true);
					IsaacCipher.method905(16448, 512);
					if (Class114.aByteArrayArrayArray1095 != null) {
						Class120_Sub14_Sub6.method1447(false);
					}
				}
			} else {
				Class9.aByteArrayArrayArray70 = null;
				IsaacCipher.method905(16448, 0);
			}
			Class153.anInt1436 = Class173.gameLevel;
			if (i <= 93) {
				aBooleanArray503 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("gh.C(").append(i).append(')').toString());
		}
	}

	abstract Class120_Sub14_Sub3 method493(int i, Class120_Sub14_Sub3 class120_sub14_sub3);

	static final void method494(final int i, final int i_1_) {
		Class120_Sub30_Sub2.anInt3688 = Class139.aClass191ArrayArray1337[i][i_1_].anInt2110;
		Queue.anInt1768 = Class139.aClass191ArrayArray1337[i][i_1_].anInt2112;
		ProducingGraphicsBuffer.anInt2798 = Class139.aClass191ArrayArray1337[i][i_1_].anInt2107;
		Class117.method1014(Class120_Sub30_Sub2.anInt3688, Queue.anInt1768, ProducingGraphicsBuffer.anInt2798);
	}

	static final void method495(final int i, final Object[] objects, final int i_3_, final int i_4_, final int[] is) {
		try {
			if (i > i_3_) {
				final int i_5_ = (i_3_ + i) / 2;
				int i_6_ = i_3_;
				final int i_7_ = is[i_5_];
				is[i_5_] = is[i];
				is[i] = i_7_;
				final Object object = objects[i_5_];
				objects[i_5_] = objects[i];
				objects[i] = object;
				for (int i_8_ = i_3_; i_8_ < i; i_8_++) {
					if (i_7_ - -(i_8_ & 0x1) > is[i_8_]) {
						final int i_9_ = is[i_8_];
						is[i_8_] = is[i_6_];
						is[i_6_] = i_9_;
						final Object object_10_ = objects[i_8_];
						objects[i_8_] = objects[i_6_];
						objects[i_6_++] = object_10_;
					}
				}
				is[i] = is[i_6_];
				is[i_6_] = i_7_;
				objects[i] = objects[i_6_];
				objects[i_6_] = object;
				method495(i_6_ - 1, objects, i_3_, -102, is);
				method495(i, objects, 1 + i_6_, -47, is);
			}
			if (i_4_ >= -42) {
				anInt502 = -2;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("gh.E(").append(i).append(',').append(objects != null ? "{...}" : "null").append(',').append(i_3_).append(',').append(i_4_).append(',').append(is != null ? "{...}" : "null").append(')').toString());
		}
	}
}
