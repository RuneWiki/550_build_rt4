/* Class43 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class43 {
	static boolean usingJavaAbove5;
	static byte[][] aByteArrayArray365;
	static int[] anIntArray366 = new int[1000];
	static Cache aClass21_367;
	static int anInt368;

	static {
		aByteArrayArray365 = new byte[50][];
		usingJavaAbove5 = false;
		aClass21_367 = new Cache(260);
	}

	static final void method338(final int i, final int i_0_, final int i_1_) {
		try {
			Class120_Sub12_Sub14.aClass21_3238 = new Cache(i);
			Class82.aClass21_786 = new Cache(i_0_);
			if (i_1_ > -35) {
				method344((byte) -118);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("el.I(").append(i).append(',').append(i_0_).append(',').append(i_1_).append(')').toString());
		}
	}

	static final Class27 method339(final int i, final int i_2_) {
		Class27 class27;
		try {
			Class27 class27_3_ = (Class27) Class120_Sub14_Sub11.aClass21_3541.get(i);
			if (class27_3_ != null) {
				return class27_3_;
			}
			if (i_2_ != -9609) {
				method343(73, 82, 7, (byte) 75, 41, 6, 111, 24, -14);
			}
			final byte[] is = Class180_Sub6.aClass50_3056.getFile(Class101_Sub1.method841(i_2_ ^ ~0x25ab, i), Class120_Sub29.method1728(i, i_2_ ^ 0x25ca));
			class27_3_ = new Class27();
			if (is != null) {
				class27_3_.method237(new Buffer(is), (byte) 58);
			}
			Class120_Sub14_Sub11.aClass21_3541.put(class27_3_, i);
			class27 = class27_3_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("el.G(").append(i).append(',').append(i_2_).append(')').toString());
		}
		return class27;
	}

	static final void method340(final int i) {
		try {
			if (i < -57) {
				Class120_Sub14_Sub13.aClass21_3564.clearSoftReference();
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("el.F(").append(i).append(')').toString());
		}
	}

	static final void method341(final int i, final int i_4_) {
		try {
			if (i_4_ != -1) {
				method340(-128);
			}
			Class120_Sub12_Sub35.aClass21_3411.method192(i);
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("el.E(").append(i).append(',').append(i_4_).append(')').toString());
		}
	}

	static final void method342(final int i) {
		try {
			if (i == -6086) {
				Node.interfaceCache = new JagexInterface[Class101_Sub4.interfaceJs5.method421(-34)][];
				Class57.interfaceLoaded = new boolean[Class101_Sub4.interfaceJs5.method421(i ^ 0x17fa)];
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("el.D(").append(i).append(')').toString());
		}
	}

	static final void method343(final int i, final int i_5_, final int i_6_, final byte i_7_, final int i_8_, final int i_9_, final int i_10_, final int i_11_, final int i_12_) {
		try {
			if (i_7_ > -72) {
				usingJavaAbove5 = false;
			}
			if (!Class50.loadInterface(i)) {
				if (i_12_ != -1) {
					Class52.aBooleanArray467[i_12_] = true;
				} else {
					for (int i_13_ = 0; i_13_ < 100; i_13_++) {
						Class52.aBooleanArray467[i_13_] = true;
					}
				}
			} else {
				Class142.method2008(i_8_, -1, (byte) -119, i_12_, Node.interfaceCache[i], i_9_, i_11_, i_5_, i_6_, i_10_);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("el.B(").append(i).append(',').append(i_5_).append(',').append(i_6_).append(',').append(i_7_).append(',').append(i_8_).append(',').append(i_9_).append(',').append(i_10_).append(',').append(i_11_).append(',')
					.append(i_12_).append(')').toString());
		}
	}

	public static void method344(final byte i) {
		try {
			aClass21_367 = null;
			aByteArrayArray365 = null;
			if (i == 93) {
				anIntArray366 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("el.H(").append(i).append(')').toString());
		}
	}

	static final void method345(final String string) {
		System.out.println("Bad " + string + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
		System.exit(1);
	}

	static final void method346(final int i, final Buffer class120_sub7) {
		try {
			final int i_14_ = class120_sub7.getUSmart();
			Class148.aClass151Array1400 = new Class151[i_14_];
			for (int i_15_ = 0; i_15_ < i_14_; i_15_++) {
				Class148.aClass151Array1400[i_15_] = new Class151();
				Class148.aClass151Array1400[i_15_].anInt1418 = class120_sub7.getUSmart();
				Class148.aClass151Array1400[i_15_].aString1422 = class120_sub7.method1135(6072);
			}
			Class120_Sub26.anInt2738 = class120_sub7.getUSmart();
			if (i == -31081) {
				Class120_Sub14_Sub2.anInt3454 = class120_sub7.getUSmart();
				Class57.anInt502 = class120_sub7.getUSmart();
				Class48.aClass167_Sub1Array435 = new Class167_Sub1[Class120_Sub14_Sub2.anInt3454 - Class120_Sub26.anInt2738 + 1];
				for (int i_16_ = 0; i_16_ < Class57.anInt502; i_16_++) {
					final int i_17_ = class120_sub7.getUSmart();
					final Class167_Sub1 class167_sub1 = Class48.aClass167_Sub1Array435[i_17_] = new Class167_Sub1();
					class167_sub1.anInt1615 = class120_sub7.getUByte();
					class167_sub1.anInt1614 = class120_sub7.getInt();
					class167_sub1.anInt2838 = Class120_Sub26.anInt2738 + i_17_;
					class167_sub1.aString2834 = class120_sub7.method1135(6072);
					class167_sub1.aString2836 = class120_sub7.method1135(i + 37153);
				}
				Class96.anInt900 = class120_sub7.getInt();
				Class159.aBoolean1487 = true;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("el.C(").append(i).append(',').append(class120_sub7 != null ? "{...}" : "null").append(')').toString());
		}
	}
}
