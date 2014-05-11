/* Class30 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class30 {
	static int[] anIntArray224;
	private final int anInt225;
	static boolean aBoolean226 = false;
	private Class120_Sub19[] aClass120_Sub19Array227;
	private int anInt228 = 0;
	static boolean interfaceCounterUpdated;
	private int[][] anIntArrayArray230;
	static int anInt231;
	private final int anInt232;
	static Class50 aClass50_233;
	static Class120_Sub30_Sub2 aClass120_Sub30_Sub2_234;
	private int anInt235 = -1;
	static int anInt236;
	private Class105 aClass105_237 = new Class105();
	boolean aBoolean238 = false;
	static int[] anIntArray239;

	static {
		anIntArray224 = new int[4096];
		for (int i = 0; i < 4096; i++) {
			anIntArray224[i] = Class120_Sub18.method1670(i, 14005);
		}
		interfaceCounterUpdated = false;
		anInt236 = 0;
		anInt231 = 1;
		anIntArray239 = new int[2500];
	}

	final int[][] method257(final int i) {
		int[][] is;
		try {
			if (anInt225 != anInt232) {
				throw new RuntimeException("Can only retrieve a full image cache");
			}
			if (i != -1) {
				method259(true, -5, 125, 45, null, -90);
			}
			for (int i_0_ = 0; i_0_ < anInt225; i_0_++) {
				aClass120_Sub19Array227[i_0_] = OutputStream_Sub1.aClass120_Sub19_27;
			}
			is = anIntArrayArray230;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("da.D(").append(i).append(')').toString());
		}
		return is;
	}

	final int[] method258(final int i, final int i_1_) {
		int[] is;
		try {
			if (anInt225 != anInt232) {
				if (anInt225 != 1) {
					Class120_Sub19 class120_sub19 = aClass120_Sub19Array227[i];
					if (class120_sub19 == null) {
						this.aBoolean238 = true;
						if (anInt225 > anInt228) {
							class120_sub19 = new Class120_Sub19(i, anInt228);
							anInt228++;
						} else {
							final Class120_Sub19 class120_sub19_2_ = (Class120_Sub19) aClass105_237.method896((byte) 113);
							class120_sub19 = new Class120_Sub19(i, class120_sub19_2_.anInt2654);
							aClass120_Sub19Array227[class120_sub19_2_.anInt2656] = null;
							class120_sub19_2_.unlink();
						}
						aClass120_Sub19Array227[i] = class120_sub19;
					} else {
						this.aBoolean238 = false;
					}
					aClass105_237.method890(class120_sub19, (byte) -98);
					return anIntArrayArray230[class120_sub19.anInt2654];
				}
				this.aBoolean238 = i != anInt235;
				anInt235 = i;
				return anIntArrayArray230[0];
			}
			this.aBoolean238 = aClass120_Sub19Array227[i] == null;
			aClass120_Sub19Array227[i] = OutputStream_Sub1.aClass120_Sub19_27;
			is = anIntArrayArray230[i];
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("da.E(").append(i).append(',').append(i_1_).append(')').toString());
		}
		return is;
	}

	static final void method259(final boolean bool, final int i, final int i_3_, final int i_4_, final Class120_Sub8 class120_sub8, final int i_5_) {
		try {
			if (class120_sub8.anInt2485 != -1 || class120_sub8.anIntArray2482 != null) {
				int i_6_ = 0;
				final int i_7_ = class120_sub8.anInt2499 * CursorType.anInt1242 >> 8;
				if (i_3_ > class120_sub8.anInt2487) {
					i_6_ += -class120_sub8.anInt2487 + i_3_;
				} else if (class120_sub8.anInt2494 > i_3_) {
					i_6_ += -i_3_ + class120_sub8.anInt2494;
				}
				if (i_5_ > class120_sub8.anInt2481) {
					i_6_ += i_5_ + -class120_sub8.anInt2481;
				} else if (class120_sub8.anInt2483 > i_5_) {
					i_6_ += class120_sub8.anInt2483 + -i_5_;
				}
				if (class120_sub8.anInt2493 == 0 || class120_sub8.anInt2493 < -64 + i_6_ || CursorType.anInt1242 == 0 || class120_sub8.anInt2498 != i) {
					if (class120_sub8.aClass120_Sub30_Sub4_2488 != null) {
						Class120_Sub12_Sub22.aClass120_Sub30_Sub3_3299.method1783(class120_sub8.aClass120_Sub30_Sub4_2488);
						class120_sub8.aClass120_Sub30_Sub4_2488 = null;
					}
					if (class120_sub8.aClass120_Sub30_Sub4_2478 != null) {
						Class120_Sub12_Sub22.aClass120_Sub30_Sub3_3299.method1783(class120_sub8.aClass120_Sub30_Sub4_2478);
						class120_sub8.aClass120_Sub30_Sub4_2478 = null;
					}
				} else if (!bool) {
					i_6_ -= 64;
					if (i_6_ < 0) {
						i_6_ = 0;
					}
					final int i_8_ = (-i_6_ + class120_sub8.anInt2493) * i_7_ / class120_sub8.anInt2493;
					if (class120_sub8.aClass120_Sub30_Sub4_2488 != null) {
						class120_sub8.aClass120_Sub30_Sub4_2488.method1813(i_8_);
					} else if (class120_sub8.anInt2485 >= 0) {
						final Class6 class6 = Class6.method103(Class159.aClass50_1490, class120_sub8.anInt2485, 0);
						if (class6 != null) {
							final Class120_Sub5_Sub1 class120_sub5_sub1 = class6.method104().method1067(Class183.aClass172_1809);
							final Class120_Sub30_Sub4 class120_sub30_sub4 = Class120_Sub30_Sub4.method1821(class120_sub5_sub1, 100, i_8_);
							class120_sub30_sub4.method1795(-1);
							Class120_Sub12_Sub22.aClass120_Sub30_Sub3_3299.method1787(class120_sub30_sub4);
							class120_sub8.aClass120_Sub30_Sub4_2488 = class120_sub30_sub4;
						}
					}
					if (class120_sub8.aClass120_Sub30_Sub4_2478 == null) {
						if (class120_sub8.anIntArray2482 != null && ((class120_sub8.anInt2496 -= i_4_) ^ 0xffffffff) >= -1) {
							final int i_9_ = (int) (class120_sub8.anIntArray2482.length * Math.random());
							final Class6 class6 = Class6.method103(Class159.aClass50_1490, class120_sub8.anIntArray2482[i_9_], 0);
							if (class6 != null) {
								final Class120_Sub5_Sub1 class120_sub5_sub1 = class6.method104().method1067(Class183.aClass172_1809);
								final Class120_Sub30_Sub4 class120_sub30_sub4 = Class120_Sub30_Sub4.method1821(class120_sub5_sub1, 100, i_8_);
								class120_sub30_sub4.method1795(0);
								Class120_Sub12_Sub22.aClass120_Sub30_Sub3_3299.method1787(class120_sub30_sub4);
								class120_sub8.anInt2496 = (int) (Math.random() * (-class120_sub8.anInt2489 + class120_sub8.anInt2486)) + class120_sub8.anInt2489;
								class120_sub8.aClass120_Sub30_Sub4_2478 = class120_sub30_sub4;
							}
						}
					} else {
						class120_sub8.aClass120_Sub30_Sub4_2478.method1813(i_8_);
						if (!class120_sub8.aClass120_Sub30_Sub4_2478.hasPrevious()) {
							class120_sub8.aClass120_Sub30_Sub4_2478 = null;
						}
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("da.C(").append(bool).append(',').append(i).append(',').append(i_3_).append(',').append(i_4_).append(',').append(class120_sub8 != null ? "{...}" : "null").append(',').append(i_5_).append(')').toString());
		}
	}

	public static void method260(final int i) {
		try {
			aClass120_Sub30_Sub2_234 = null;
			aClass50_233 = null;
			anIntArray224 = null;
			anIntArray239 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("da.B(").append(i).append(')').toString());
		}
	}

	final void method261(final byte i) {
		try {
			for (int i_10_ = 0; i_10_ < anInt225; i_10_++) {
				anIntArrayArray230[i_10_] = null;
			}
			if (i != -49) {
				method261((byte) 102);
			}
			anIntArrayArray230 = null;
			aClass120_Sub19Array227 = null;
			aClass105_237.method889(1986850152);
			aClass105_237 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("da.A(").append(i).append(')').toString());
		}
	}

	Class30(final int i, final int i_11_, final int i_12_) {
		anInt232 = i_11_;
		aClass120_Sub19Array227 = new Class120_Sub19[anInt232];
		anInt225 = i;
		anIntArrayArray230 = new int[anInt225][i_12_];
	}
}
