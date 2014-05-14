/* Class120_Sub12_Sub7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class120_Sub12_Sub7 extends Class120_Sub12 {
	static Deque aClass105_3177;
	static int anInt3178;
	static int crossIndex = 0;
	static int anInt3180;
	static boolean aBoolean3181 = false;
	static int[] anIntArray3182 = new int[500];
	static int anInt3183 = -1;
	static int anInt3184;
	static int frameWidth;

	static {
		aClass105_3177 = new Deque();
		anInt3184 = 0;
	}

	static final void method1231(final int i, final int i_0_, final int i_1_, final int i_2_, final int i_3_, final int i_4_, final int i_5_) {
		try {
			if (i != 0) {
				aClass105_3177 = null;
			}
			final int i_6_ = i_4_ + i_5_;
			final int i_7_ = i_2_ - i_4_;
			final int i_8_ = i_4_ + i_1_;
			for (int i_9_ = i_5_; i_9_ < i_6_; i_9_++) {
				Class120_Sub8.method1160((byte) 115, GameEntity.anIntArrayArray3009[i_9_], i_0_, i_1_, i_3_);
			}
			for (int i_10_ = i_2_; i_7_ < i_10_; i_10_--) {
				Class120_Sub8.method1160((byte) 115, GameEntity.anIntArrayArray3009[i_10_], i_0_, i_1_, i_3_);
			}
			final int i_11_ = i_3_ - i_4_;
			for (int i_12_ = i_6_; i_7_ >= i_12_; i_12_++) {
				final int[] is = GameEntity.anIntArrayArray3009[i_12_];
				Class120_Sub8.method1160((byte) 115, is, i_0_, i_1_, i_8_);
				Class120_Sub8.method1160((byte) 115, is, i_0_, i_11_, i_3_);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("fa.T(").append(i).append(',').append(i_0_).append(',').append(i_1_).append(',').append(i_2_).append(',').append(i_3_).append(',').append(i_4_).append(',').append(i_5_).append(')').toString());
		}
	}

	static final int method1232(final String string, final int i) {
		int i_13_;
		try {
			if (string == null) {
				return -1;
			}
			for (int i_14_ = 0; i_14_ < ProducingGraphicsBuffer.anInt2799; i_14_++) {
				if (string.equalsIgnoreCase(Class120_Sub16.aStringArray2599[i_14_])) {
					return i_14_;
				}
			}
			i_13_ = -1;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("fa.S(").append(string != null ? "{...}" : "null").append(',').append(i).append(')').toString());
		}
		return i_13_;
	}

	public Class120_Sub12_Sub7() {
		super(0, true);
	}

	@Override
	final int[] method1187(final int i, final int i_15_) {
		int[] is;
		try {
			if (i != -1735) {
				return null;
			}
			final int[] is_16_ = this.aClass30_2563.method258(i_15_, -96);
			if (this.aClass30_2563.aBoolean238) {
				ArrayUtils.fillArray(is_16_, 0, anInt3178, Class150.anIntArray1405[i_15_]);
			}
			is = is_16_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("fa.D(").append(i).append(',').append(i_15_).append(')').toString());
		}
		return is;
	}

	static final int method1233(final int i, final boolean bool, final Class167_Sub1 class167_sub1, final boolean bool_17_, final Class167_Sub1 class167_sub1_18_, final int i_19_, final boolean bool_20_) {
		int i_21_;
		try {
			if (!bool_20_) {
				anInt3184 = 93;
			}
			final int i_22_ = Class120_Sub14_Sub14_Sub2.method1553(-17691, class167_sub1, i, class167_sub1_18_, bool);
			if (i_22_ != 0) {
				if (!bool) {
					return i_22_;
				}
				return -i_22_;
			}
			if ((i_19_ ^ 0xffffffff) == 0) {
				return 0;
			}
			final int i_23_ = Class120_Sub14_Sub14_Sub2.method1553(-17691, class167_sub1, i_19_, class167_sub1_18_, bool_17_);
			if (!bool_17_) {
				return i_23_;
			}
			i_21_ = -i_23_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("fa.U(").append(i).append(',').append(bool).append(',').append(class167_sub1 != null ? "{...}" : "null").append(',').append(bool_17_).append(',').append(class167_sub1_18_ != null ? "{...}" : "null").append(',')
					.append(i_19_).append(',').append(bool_20_).append(')').toString());
		}
		return i_21_;
	}

	static final void method1234(final byte i) {
		try {
			Class141.aClass21_1350.clearSoftReference();
			if (i != 59) {
				method1235(false);
			}
			Class182.aClass21_1798.clearSoftReference();
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("fa.R(").append(i).append(')').toString());
		}
	}

	public static void method1235(final boolean bool) {
		try {
			anIntArray3182 = null;
			aClass105_3177 = null;
			if (bool) {
				method1234((byte) -11);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("fa.V(").append(bool).append(')').toString());
		}
	}
}
