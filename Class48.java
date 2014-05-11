/* Class48 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class48 {
	static Class167_Sub1[] aClass167_Sub1Array435;
	static int anInt436 = -2;
	static boolean aBoolean437 = false;

	static final boolean method400(final int i, final int i_0_, final int i_1_, final int i_2_, final int i_3_, final int i_4_, final int i_5_, final int i_6_) {
		if (i_0_ < i_1_ && i_0_ < i_2_ && i_0_ < i_3_) {
			return false;
		}
		if (i_0_ > i_1_ && i_0_ > i_2_ && i_0_ > i_3_) {
			return false;
		}
		if (i < i_4_ && i < i_5_ && i < i_6_) {
			return false;
		}
		if (i > i_4_ && i > i_5_ && i > i_6_) {
			return false;
		}
		final int i_7_ = (i_0_ - i_1_) * (i_5_ - i_4_) - (i - i_4_) * (i_2_ - i_1_);
		final int i_8_ = (i_0_ - i_3_) * (i_4_ - i_6_) - (i - i_6_) * (i_1_ - i_3_);
		final int i_9_ = (i_0_ - i_2_) * (i_6_ - i_5_) - (i - i_5_) * (i_3_ - i_2_);
		if (i_7_ * i_9_ > 0 && i_9_ * i_8_ > 0) {
			return true;
		}
		return false;
	}

	static final void method401(final int i, final int i_10_) {
		try {
			final InterfaceChangeNode class120_sub14_sub7 = Class120_Sub14_Sub3.putInterfaceChange(10, i);
			class120_sub14_sub7.method1453((byte) -104);
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("fc.E(").append(i).append(',').append(i_10_).append(')').toString());
		}
	}

	public static void method402(final byte i) {
		try {
			if (i >= -122) {
				method404((byte) -105, -52, 126, 125, 19);
			}
			aClass167_Sub1Array435 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("fc.D(").append(i).append(')').toString());
		}
	}

	static final int method403(final int i, final byte i_11_, final int i_12_) {
		int i_13_;
		try {
			final Class120_Sub17 class120_sub17 = (Class120_Sub17) Canvas_Sub1.aClass75_15.method659(i_12_, -119);
			if (class120_sub17 == null) {
				return 0;
			}
			if ((i ^ 0xffffffff) == 0) {
				return 0;
			}
			int i_14_ = 0;
			for (int i_15_ = 0; i_15_ < class120_sub17.anIntArray2619.length; i_15_++) {
				if (i == class120_sub17.anIntArray2618[i_15_]) {
					i_14_ += class120_sub17.anIntArray2619[i_15_];
				}
			}
			i_13_ = i_14_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("fc.G(").append(i).append(',').append(i_11_).append(',').append(i_12_).append(')').toString());
		}
		return i_13_;
	}

	static final void method404(final byte i, final int i_16_, final int i_17_, final int i_18_, final int i_19_) {
		try {
			if (Class111.anInt1061 != 0 && i_18_ != 0 && Class150.anInt1407 < 50 && i_17_ != -1) {
				Class120_Sub12_Sub16.anIntArray3255[Class150.anInt1407] = i_17_;
				Class184.anIntArray1834[Class150.anInt1407] = i_18_;
				Class81.anIntArray779[Class150.anInt1407] = i_16_;
				Class109.aClass6Array1047[Class150.anInt1407] = null;
				Class174.anIntArray1731[Class150.anInt1407] = 0;
				Class120_Sub14_Sub14_Sub1.anIntArray3926[Class150.anInt1407] = i_19_;
				Class150.anInt1407++;
			}
			if (i != -100) {
				method401(56, 78);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("fc.A(").append(i).append(',').append(i_16_).append(',').append(i_17_).append(',').append(i_18_).append(',').append(i_19_).append(')').toString());
		}
	}

	static final int method405(final byte i) {
		int i_20_;
		try {
			if (i < 59) {
				return 63;
			}
			i_20_ = Class43.aClass21_367.method184(false);
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("fc.C(").append(i).append(')').toString());
		}
		return i_20_;
	}

	static final void method406(final int i, final long l) {
		try {
			if ((l ^ 0xffffffffffffffffL) != -1L) {
				if (ProducingGraphicsBuffer.anInt2799 >= 100 && !Class120_Sub12_Sub21_Sub1.aBoolean3908 || ProducingGraphicsBuffer.anInt2799 >= 200) {
					Class120_Sub14_Sub14.method1540("", 0, Class120_Sub11.aString2550);
				} else {
					final String string = Class136.method1977(false, l);
					for (int i_21_ = 0; ProducingGraphicsBuffer.anInt2799 > i_21_; i_21_++) {
						if ((l ^ 0xffffffffffffffffL) == (AbstractSprite.aLongArray3617[i_21_] ^ 0xffffffffffffffffL)) {
							Class120_Sub14_Sub14.method1540("", 0, new StringBuilder(string).append(Class120_Sub12_Sub21_Sub1.aString3910).toString());
							return;
						}
					}
					for (int i_22_ = 0; i_22_ < Class120_Sub12_Sub26.anInt3335; i_22_++) {
						if ((l ^ 0xffffffffffffffffL) == (Class85.aLongArray806[i_22_] ^ 0xffffffffffffffffL)) {
							Class120_Sub14_Sub14.method1540("", 0, new StringBuilder(Class180_Sub1.aString2849).append(string).append(Class120_Sub13.aString2578).toString());
							return;
						}
					}
					if (string.equals(Class100.selfPlayer.aString3745)) {
						Class120_Sub14_Sub14.method1540("", 0, Class120_Sub14_Sub23.aString3655);
					} else {
						Class120_Sub16.aStringArray2599[ProducingGraphicsBuffer.anInt2799] = string;
						AbstractSprite.aLongArray3617[ProducingGraphicsBuffer.anInt2799] = l;
						Class120_Sub12_Sub16.anIntArray3252[ProducingGraphicsBuffer.anInt2799] = 0;
						Class79_Sub1.aStringArray2247[ProducingGraphicsBuffer.anInt2799] = "";
						Class120_Sub12_Sub30.anIntArray3374[ProducingGraphicsBuffer.anInt2799] = i;
						Class120_Sub12_Sub9.aBooleanArray3194[ProducingGraphicsBuffer.anInt2799] = false;
						ProducingGraphicsBuffer.anInt2799++;
						Class61.anInt563 = Class160.anInt1494;
						Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putPacket(26);
						Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putLong(l);
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("fc.B(").append(i).append(',').append(l).append(')').toString());
		}
	}
}
