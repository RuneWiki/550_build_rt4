/* Class120_Sub12_Sub15 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class120_Sub12_Sub15 extends Class120_Sub12 {
	static int anInt3241 = -1;
	static Class50 aClass50_3242;
	static int anInt3243 = -1;
	static String aString3244 = "Hidden";
	static long[] aLongArray3245;
	private int anInt3246 = 4;
	static boolean aBoolean3247 = false;
	static int anInt3248 = -1;
	private int anInt3249 = 4;

	static {
		aLongArray3245 = new long[100];
	}

	public static void method1274(final boolean bool) {
		try {
			aString3244 = null;
			if (bool) {
				method1275(null, (byte) 83, null);
			}
			aClass50_3242 = null;
			aLongArray3245 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("la.R(").append(bool).append(')').toString());
		}
	}

	static final void method1275(final NodeSub class120_sub14, final byte i, final NodeSub class120_sub14_0_) {
		try {
			if (class120_sub14_0_.previousSub != null) {
				class120_sub14_0_.unlinkSub();
			}
			class120_sub14_0_.nextSub = class120_sub14.nextSub;
			class120_sub14_0_.previousSub = class120_sub14;
			class120_sub14_0_.previousSub.nextSub = class120_sub14_0_;
			class120_sub14_0_.nextSub.previousSub = class120_sub14_0_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("la.T(").append(class120_sub14 != null ? "{...}" : "null").append(',').append(i).append(',').append(class120_sub14_0_ != null ? "{...}" : "null").append(')').toString());
		}
	}

	static final void method1276(final boolean bool, final byte i) {
		try {
			if (!bool == AbstractObject.aBoolean3463) {
				AbstractObject.aBoolean3463 = bool;
				Class120_Sub12_Sub18.method1291(256);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("la.S(").append(bool).append(',').append(i).append(')').toString());
		}
	}

	@Override
	final void method1180(final byte i, final Buffer class120_sub7, final int i_1_) {
		try {
			final int i_2_ = i_1_;
			do {
				if (i_2_ != 0) {
					if (i_2_ != 1) {
						break;
					}
				} else {
					anInt3246 = class120_sub7.getUByte();
					break;
				}
				anInt3249 = class120_sub7.getUByte();
			} while (false);
			if (i != -43) {
				method1276(true, (byte) -63);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("la.M(").append(i).append(',').append(class120_sub7 != null ? "{...}" : "null").append(',').append(i_1_).append(')').toString());
		}
	}

	public Class120_Sub12_Sub15() {
		super(1, false);
	}

	@Override
	final int[] method1187(final int i, final int i_3_) {
		int[] is;
		try {
			if (i != -1735) {
				aLongArray3245 = null;
			}
			final int[] is_4_ = this.aClass30_2563.method258(i_3_, i ^ ~0x6ae);
			if (this.aClass30_2563.aBoolean238) {
				final int i_5_ = Class120_Sub12_Sub7.anInt3178 / anInt3246;
				final int i_6_ = Class120_Sub12_Sub2.anInt3145 / anInt3249;
				int[] is_7_;
				if (i_6_ > 0) {
					final int i_8_ = i_3_ % i_6_;
					is_7_ = method1192(-7764, Class120_Sub12_Sub2.anInt3145 * i_8_ / i_6_, 0);
				} else {
					is_7_ = method1192(-7764, 0, 0);
				}
				for (int i_9_ = 0; Class120_Sub12_Sub7.anInt3178 > i_9_; i_9_++) {
					if (i_5_ > 0) {
						final int i_10_ = i_9_ % i_5_;
						is_4_[i_9_] = is_7_[i_10_ * Class120_Sub12_Sub7.anInt3178 / i_5_];
					} else {
						is_4_[i_9_] = is_7_[0];
					}
				}
			}
			is = is_4_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("la.D(").append(i).append(',').append(i_3_).append(')').toString());
		}
		return is;
	}

	@Override
	final int[][] method1188(final int i, final int i_11_) {
		int[][] is;
		try {
			if (i_11_ != -29869) {
				method1275(null, (byte) 34, null);
			}
			final int[][] is_12_ = this.aClass109_2559.method975(i, -117);
			if (this.aClass109_2559.aBoolean1049) {
				final int i_13_ = Class120_Sub12_Sub7.anInt3178 / anInt3246;
				final int i_14_ = Class120_Sub12_Sub2.anInt3145 / anInt3249;
				int[][] is_15_;
				if (i_14_ > 0) {
					final int i_16_ = i % i_14_;
					is_15_ = method1179(0, i_16_ * Class120_Sub12_Sub2.anInt3145 / i_14_, (byte) -51);
				} else {
					is_15_ = method1179(0, 0, (byte) -51);
				}
				final int[] is_17_ = is_15_[0];
				final int[] is_18_ = is_15_[1];
				final int[] is_19_ = is_15_[2];
				final int[] is_20_ = is_12_[0];
				final int[] is_21_ = is_12_[1];
				final int[] is_22_ = is_12_[2];
				for (int i_23_ = 0; i_23_ < Class120_Sub12_Sub7.anInt3178; i_23_++) {
					int i_24_;
					if (i_13_ <= 0) {
						i_24_ = 0;
					} else {
						final int i_25_ = i_23_ % i_13_;
						i_24_ = Class120_Sub12_Sub7.anInt3178 * i_25_ / i_13_;
					}
					is_20_[i_23_] = is_17_[i_24_];
					is_21_[i_23_] = is_18_[i_24_];
					is_22_[i_23_] = is_19_[i_24_];
				}
			}
			is = is_12_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("la.K(").append(i).append(',').append(i_11_).append(')').toString());
		}
		return is;
	}
}
