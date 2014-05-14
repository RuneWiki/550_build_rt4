/* Class120_Sub14_Sub3_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class JavaObject extends AbstractObject {
	static int anInt3913 = 0;
	static Hashtable clickMaskCache;
	static int anInt3915 = 0;
	static int[] anIntArray3916;
	private final Object value;

	static {
		clickMaskCache = new Hashtable(512);
	}

	public static void method1433(final int i) {
		try {
			if (i == 0) {
				clickMaskCache = null;
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
			if (class50.method429(Class120_Sub14_Sub16.anInt3589)) {
				i_1_++;
			}
			if (class50.method429(Class108_Sub1.anInt2328)) {
				i_1_++;
			}
			i_0_ = i_1_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ei.E(").append(class50 != null ? "{...}" : "null").append(',').append(i).append(')').toString());
		}
		return i_0_;
	}

	@Override
	final boolean isSoftReference() {
		return false;
	}

	@Override
	final Object get() {
		return value;
	}

	JavaObject(final Object object) {
		value = object;
	}

	static final void method1435(final int i) {
		try {
			InterfaceClickMask.redrawInterface(Class120_Sub12_Sub4.aClass189_3156);
			SceneGroundObject.anInt2843++;
			if (!Class151.aBoolean1419 || !Class111.aBoolean1058) {
				if (SceneGroundObject.anInt2843 > 1) {
					Class120_Sub12_Sub4.aClass189_3156 = null;
				}
			} else {
				int i_2_ = Queue.lastMouseX;
				i_2_ -= AbstractGraphicsBuffer.anInt1173;
				if (i_2_ < Class120_Sub12_Sub7.anInt3183) {
					i_2_ = Class120_Sub12_Sub7.anInt3183;
				}
				if (Class120_Sub12_Sub4.aClass189_3156.anInt1948 + i_2_ > Class26.aClass189_161.anInt1948 + Class120_Sub12_Sub7.anInt3183) {
					i_2_ = Class26.aClass189_161.anInt1948 + Class120_Sub12_Sub7.anInt3183 - Class120_Sub12_Sub4.aClass189_3156.anInt1948;
				}
				int i_3_ = Class191.lastMouseY;
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
				if (SceneGroundObject.anInt2843 > Class120_Sub12_Sub4.aClass189_3156.anInt2066 && (i_4_ > i_6_ || i_4_ < -i_6_ || i_5_ > i_6_ || i_5_ < -i_6_)) {
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
						if (Class69.anInt617 != 1 && !Class120_Sub14_Sub4.method1438(i ^ ~0x1, -1 + Class186.menuOptionCount) || Class186.menuOptionCount <= 2) {
							if (Class186.menuOptionCount > 0) {
								Class191.method2508((byte) -99);
							}
						} else {
							Class120_Sub12_Sub28.method1349((byte) 103);
						}
					} else {
						if (Class120_Sub12_Sub4.aClass189_3156.anObjectArray1947 != null) {
							final Class120_Sub10 class120_sub10 = new Class120_Sub10();
							class120_sub10.aClass189_2532 = LocType.aClass189_1818;
							class120_sub10.aClass189_2534 = Class120_Sub12_Sub4.aClass189_3156;
							class120_sub10.anInt2543 = i_7_;
							class120_sub10.anInt2540 = i_8_;
							class120_sub10.anObjectArray2537 = Class120_Sub12_Sub4.aClass189_3156.anObjectArray1947;
							Class88.method744(true, class120_sub10);
						}
						if (LocType.aClass189_1818 != null && client.method58(Class120_Sub12_Sub4.aClass189_3156) != null) {
							Class120_Sub12_Sub11.outputStream.putByteIsaac(0);
							Class120_Sub12_Sub11.outputStream.method1126((byte) 93, Class120_Sub12_Sub4.aClass189_3156.bitPacked);
							Class120_Sub12_Sub11.outputStream.putInt2(LocType.aClass189_1818.bitPacked);
							Class120_Sub12_Sub11.outputStream.method1116(-2076007248, LocType.aClass189_1818.anInt2083);
							Class120_Sub12_Sub11.outputStream.putLEShortA(Class120_Sub12_Sub4.aClass189_3156.anInt2083);
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
