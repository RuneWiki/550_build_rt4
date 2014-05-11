/* Class120_Sub11 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class120_Sub11 extends Node {
	static int anInt2549 = 0;
	static String aString2550;
	static boolean aBoolean2551;
	static String aString2552;
	static String aString2553 = " more options";
	static String aString2554;
	byte[] aByteArray2555;
	static short[] aShortArray2556 = { 960, 957, -21568, -21571, 22464 };

	static {
		aString2552 = "Opened title screen";
		aString2550 = "Your friend list is full. Max of 100 for free users, and 200 for members.";
		aBoolean2551 = false;
		aString2554 = "Loading defaults - ";
	}

	static final long method1173(final int i, final int i_0_, final int i_1_) {
		final Class120_Sub18 class120_sub18 = Class120_Sub1.aClass120_Sub18ArrayArrayArray2411[i][i_0_][i_1_];
		if (class120_sub18 == null) {
			return 0L;
		}
		for (int i_2_ = 0; i_2_ < class120_sub18.anInt2638; i_2_++) {
			final Class28 class28 = class120_sub18.aClass28Array2625[i_2_];
			if ((class28.aLong186 >> 29 & 0x3L) == 2L && class28.anInt180 == i_0_ && class28.anInt184 == i_1_) {
				return class28.aLong186;
			}
		}
		return 0L;
	}

	static final Class120_Sub14_Sub23 method1174(final int i, final int i_3_) {
		Class120_Sub14_Sub23 class120_sub14_sub23;
		try {
			Class120_Sub14_Sub23 class120_sub14_sub23_4_ = (Class120_Sub14_Sub23) Class96.aClass35_901.method302(17301, i);
			if (class120_sub14_sub23_4_ != null) {
				return class120_sub14_sub23_4_;
			}
			byte[] is;
			if (i >= 32768) {
				is = Class101_Sub2.aClass50_2277.method442(0, (byte) 112, 0x7fff & i);
			} else {
				is = Class156.aClass50_1456.method442(0, (byte) 116, i);
			}
			class120_sub14_sub23_4_ = new Class120_Sub14_Sub23();
			if (i_3_ != 29898) {
				method1175((byte) -99);
			}
			if (is != null) {
				class120_sub14_sub23_4_.method1638((byte) -19, new Buffer(is));
			}
			if (-32769 >= (i ^ 0xffffffff)) {
				class120_sub14_sub23_4_.method1644(32768);
			}
			Class96.aClass35_901.method301(i, 124, class120_sub14_sub23_4_);
			class120_sub14_sub23 = class120_sub14_sub23_4_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("j.A(").append(i).append(',').append(i_3_).append(')').toString());
		}
		return class120_sub14_sub23;
	}

	public static void method1175(final byte i) {
		try {
			aString2550 = null;
			if (i == -58) {
				aString2553 = null;
				aShortArray2556 = null;
				aString2554 = null;
				aString2552 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("j.E(").append(i).append(')').toString());
		}
	}

	static final void method1176(final int i, final int i_5_, final int i_6_, final int i_7_, final int i_8_) {
		try {
			for (Class120_Sub8 class120_sub8 = (Class120_Sub8) Class101_Sub1.aClass105_2266.getFront(); class120_sub8 != null; class120_sub8 = (Class120_Sub8) Class101_Sub1.aClass105_2266.getNext()) {
				Class30.method259(false, i, i_7_, i_8_, class120_sub8, i_6_);
			}
			Class120_Sub8 class120_sub8 = (Class120_Sub8) Class120_Sub12_Sub10.aClass105_3201.getFront();
			if (i_5_ > 72) {
				for (/**/; class120_sub8 != null; class120_sub8 = (Class120_Sub8) Class120_Sub12_Sub10.aClass105_3201.getNext()) {
					int i_9_ = 1;
					final Class29 class29 = class120_sub8.aClass180_Sub5_Sub2_2492.method2336((byte) 124);
					if (class120_sub8.aClass180_Sub5_Sub2_2492.anInt3004 == class29.anInt218) {
						i_9_ = 0;
					} else if (class120_sub8.aClass180_Sub5_Sub2_2492.anInt3004 == class29.anInt190 || class120_sub8.aClass180_Sub5_Sub2_2492.anInt3004 == class29.anInt188 || class120_sub8.aClass180_Sub5_Sub2_2492.anInt3004 == class29.anInt216
							|| class120_sub8.aClass180_Sub5_Sub2_2492.anInt3004 == class29.anInt223) {
						i_9_ = 2;
					} else if (class120_sub8.aClass180_Sub5_Sub2_2492.anInt3004 == class29.anInt212 || class120_sub8.aClass180_Sub5_Sub2_2492.anInt3004 == class29.anInt192 || class120_sub8.aClass180_Sub5_Sub2_2492.anInt3004 == class29.anInt219
							|| class29.anInt210 == class120_sub8.aClass180_Sub5_Sub2_2492.anInt3004) {
						i_9_ = 3;
					}
					if (i_9_ != class120_sub8.anInt2480) {
						final int i_10_ = Class20.method178((byte) -54, class120_sub8.aClass180_Sub5_Sub2_2492);
						if (class120_sub8.anInt2485 != i_10_) {
							if (class120_sub8.aClass120_Sub30_Sub4_2488 != null) {
								Class120_Sub12_Sub22.aClass120_Sub30_Sub3_3299.method1783(class120_sub8.aClass120_Sub30_Sub4_2488);
								class120_sub8.aClass120_Sub30_Sub4_2488 = null;
							}
							class120_sub8.anInt2485 = i_10_;
						}
						class120_sub8.anInt2480 = i_9_;
					}
					class120_sub8.anInt2494 = class120_sub8.aClass180_Sub5_Sub2_2492.x;
					class120_sub8.anInt2487 = class120_sub8.aClass180_Sub5_Sub2_2492.x - -(64 * class120_sub8.aClass180_Sub5_Sub2_2492.getSize());
					class120_sub8.anInt2483 = class120_sub8.aClass180_Sub5_Sub2_2492.z;
					class120_sub8.anInt2481 = class120_sub8.aClass180_Sub5_Sub2_2492.z - -(64 * class120_sub8.aClass180_Sub5_Sub2_2492.getSize());
					Class30.method259(false, i, i_7_, i_8_, class120_sub8, i_6_);
				}
				for (class120_sub8 = (Class120_Sub8) Npc.aClass75_3750.method657(13292); class120_sub8 != null; class120_sub8 = (Class120_Sub8) Npc.aClass75_3750.method658((byte) -94)) {
					int i_11_ = 1;
					final Class29 class29 = class120_sub8.aClass180_Sub5_Sub1_2495.method2336((byte) -77);
					if (class29.anInt218 != class120_sub8.aClass180_Sub5_Sub1_2495.anInt3004) {
						if (class29.anInt190 != class120_sub8.aClass180_Sub5_Sub1_2495.anInt3004 && class29.anInt188 != class120_sub8.aClass180_Sub5_Sub1_2495.anInt3004 && class120_sub8.aClass180_Sub5_Sub1_2495.anInt3004 != class29.anInt216
								&& class120_sub8.aClass180_Sub5_Sub1_2495.anInt3004 != class29.anInt223) {
							if (class120_sub8.aClass180_Sub5_Sub1_2495.anInt3004 == class29.anInt212 || class120_sub8.aClass180_Sub5_Sub1_2495.anInt3004 == class29.anInt192 || class120_sub8.aClass180_Sub5_Sub1_2495.anInt3004 == class29.anInt219
									|| class120_sub8.aClass180_Sub5_Sub1_2495.anInt3004 == class29.anInt210) {
								i_11_ = 3;
							}
						} else {
							i_11_ = 2;
						}
					} else {
						i_11_ = 0;
					}
					if (class120_sub8.anInt2480 != i_11_) {
						final int i_12_ = Class20.method179(class120_sub8.aClass180_Sub5_Sub1_2495, (byte) -106);
						if (class120_sub8.anInt2485 != i_12_) {
							if (class120_sub8.aClass120_Sub30_Sub4_2488 != null) {
								Class120_Sub12_Sub22.aClass120_Sub30_Sub3_3299.method1783(class120_sub8.aClass120_Sub30_Sub4_2488);
								class120_sub8.aClass120_Sub30_Sub4_2488 = null;
							}
							class120_sub8.anInt2485 = i_12_;
						}
						class120_sub8.anInt2480 = i_11_;
					}
					class120_sub8.anInt2494 = class120_sub8.aClass180_Sub5_Sub1_2495.x;
					class120_sub8.anInt2487 = class120_sub8.aClass180_Sub5_Sub1_2495.x + 64 * class120_sub8.aClass180_Sub5_Sub1_2495.getSize();
					class120_sub8.anInt2483 = class120_sub8.aClass180_Sub5_Sub1_2495.z;
					class120_sub8.anInt2481 = class120_sub8.aClass180_Sub5_Sub1_2495.z - -(class120_sub8.aClass180_Sub5_Sub1_2495.getSize() * 64);
					Class30.method259(false, i, i_7_, i_8_, class120_sub8, i_6_);
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("j.C(").append(i).append(',').append(i_5_).append(',').append(i_6_).append(',').append(i_7_).append(',').append(i_8_).append(')').toString());
		}
	}

	static final void method1177(final int i, final Class50 class50) {
		try {
			Class24.aClass50_145 = class50;
			if (i != -12014) {
				aShortArray2556 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("j.B(").append(i).append(',').append(class50 != null ? "{...}" : "null").append(')').toString());
		}
	}

	Class120_Sub11(final byte[] is) {
		this.aByteArray2555 = is;
	}
}
