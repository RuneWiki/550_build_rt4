/* Class120_Sub14_Sub3_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class120_Sub14_Sub3_Sub1 extends Class120_Sub14_Sub3 {
	static int anInt3913 = 0;
	static Class75 aClass75_3914;
	static int anInt3915 = 0;
	static int[] anIntArray3916;
	private final Object anObject3917;
	static int anInt3918;

	static {
		aClass75_3914 = new Class75(512);
		anInt3918 = -16 + (int) (33.0 * Math.random());
	}

	public static void method1433(final int i) {
		try {
			if (i == 0) {
				aClass75_3914 = null;
				anIntArray3916 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ei.F(").append(i).append(')').toString());
		}
	}

	static final int method1434(final Class50 class50, final int i) {
		int i_0_;
		try {
			int i_1_ = i;
			if (class50.method429(Class120_Sub14_Sub16.anInt3589, 100)) {
				i_1_++;
			}
			if (class50.method429(Class108_Sub1.anInt2328, i ^ 0x3c)) {
				i_1_++;
			}
			i_0_ = i_1_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ei.E(").append(class50 != null ? "{...}" : "null").append(',').append(i).append(')').toString());
		}
		return i_0_;
	}

	@Override
	final boolean method1430(final int i) {
		boolean bool;
		try {
			if (i != -1249071392) {
				return true;
			}
			bool = false;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ei.C(").append(i).append(')').toString());
		}
		return bool;
	}

	@Override
	final Object method1429(final boolean bool) {
		Object object;
		try {
			if (bool) {
				method1435(-89);
			}
			object = anObject3917;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ei.A(").append(bool).append(')').toString());
		}
		return object;
	}

	Class120_Sub14_Sub3_Sub1(final Object object) {
		anObject3917 = object;
	}

	static final void method1435(final int i) {
		try {
			InterfaceClickMask.redrawInterface(Class120_Sub12_Sub4.aClass189_3156);
			Class180_Sub1.anInt2843++;
			if (!Class151.aBoolean1419 || !Class111.aBoolean1058) {
				if (Class180_Sub1.anInt2843 > 1) {
					Class120_Sub12_Sub4.aClass189_3156 = null;
				}
			} else {
				int i_2_ = Queue.anInt1767;
				i_2_ -= AbstractGraphicsBuffer.anInt1173;
				if (i_2_ < Class120_Sub12_Sub7.anInt3183) {
					i_2_ = Class120_Sub12_Sub7.anInt3183;
				}
				if (Class120_Sub12_Sub4.aClass189_3156.anInt1948 + i_2_ > Class26.aClass189_161.anInt1948 + Class120_Sub12_Sub7.anInt3183) {
					i_2_ = Class26.aClass189_161.anInt1948 + Class120_Sub12_Sub7.anInt3183 - Class120_Sub12_Sub4.aClass189_3156.anInt1948;
				}
				int i_3_ = Class191.anInt2113;
				i_3_ -= client.anInt2203;
				if (Class120_Sub12_Sub35.anInt3413 > i_3_) {
					i_3_ = Class120_Sub12_Sub35.anInt3413;
				}
				final int i_4_ = i_2_ + -Class120_Sub12_Sub17.anInt3264;
				if (Class120_Sub12_Sub4.aClass189_3156.anInt2059 + i_3_ > Class120_Sub12_Sub35.anInt3413 - -Class26.aClass189_161.anInt2059) {
					i_3_ = Class120_Sub12_Sub35.anInt3413 - -Class26.aClass189_161.anInt2059 + -Class120_Sub12_Sub4.aClass189_3156.anInt2059;
				}
				final int i_5_ = i_3_ - Class9.anInt77;
				final int i_6_ = Class120_Sub12_Sub4.aClass189_3156.anInt1962;
				if (Class180_Sub1.anInt2843 > Class120_Sub12_Sub4.aClass189_3156.anInt2066 && (i_4_ > i_6_ || i_4_ < -i_6_ || i_5_ > i_6_ || i_5_ < -i_6_)) {
					Class120_Sub11.aBoolean2551 = true;
				}
				final int i_7_ = Class26.aClass189_161.anInt2023 + i_2_ - Class120_Sub12_Sub7.anInt3183;
				final int i_8_ = -Class120_Sub12_Sub35.anInt3413 + i_3_ - -Class26.aClass189_161.anInt2021;
				if (Class120_Sub12_Sub4.aClass189_3156.anObjectArray1959 != null && Class120_Sub11.aBoolean2551) {
					final Class120_Sub10 class120_sub10 = new Class120_Sub10();
					class120_sub10.anInt2540 = i_8_;
					class120_sub10.aClass189_2534 = Class120_Sub12_Sub4.aClass189_3156;
					class120_sub10.anInt2543 = i_7_;
					class120_sub10.anObjectArray2537 = Class120_Sub12_Sub4.aClass189_3156.anObjectArray1959;
					Class88.method744(true, class120_sub10);
				}
				if (InterfaceChangeNode.anInt3483 == 0) {
					if (!Class120_Sub11.aBoolean2551) {
						if (Class69.anInt617 != 1 && !Class120_Sub14_Sub4.method1438(i ^ ~0x1, -1 + Class186.anInt1906) || Class186.anInt1906 <= 2) {
							if (Class186.anInt1906 > 0) {
								Class191.method2508((byte) -99);
							}
						} else {
							Class120_Sub12_Sub28.method1349((byte) 103);
						}
					} else {
						if (Class120_Sub12_Sub4.aClass189_3156.anObjectArray1947 != null) {
							final Class120_Sub10 class120_sub10 = new Class120_Sub10();
							class120_sub10.aClass189_2532 = Class184.aClass189_1818;
							class120_sub10.aClass189_2534 = Class120_Sub12_Sub4.aClass189_3156;
							class120_sub10.anInt2543 = i_7_;
							class120_sub10.anInt2540 = i_8_;
							class120_sub10.anObjectArray2537 = Class120_Sub12_Sub4.aClass189_3156.anObjectArray1947;
							Class88.method744(true, class120_sub10);
						}
						if (Class184.aClass189_1818 != null && client.method58(Class120_Sub12_Sub4.aClass189_3156) != null) {
							Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putPacket(0);
							Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.method1126((byte) 93, Class120_Sub12_Sub4.aClass189_3156.anInt1999);
							Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.method1086((byte) 21, Class184.aClass189_1818.anInt1999);
							Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.method1116(-2076007248, Class184.aClass189_1818.anInt2083);
							Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putLEShortA(Class120_Sub12_Sub4.aClass189_3156.anInt2083);
						}
					}
					Class120_Sub12_Sub4.aClass189_3156 = null;
				}
				if (i != -2) {
					anInt3913 = 24;
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ei.G(").append(i).append(')').toString());
		}
	}
}
