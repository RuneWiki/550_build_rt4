/* Class148 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class148 {
	static int localNpcCount = 0;
	static Class151[] aClass151Array1400;

	static final void method2057(final String[] strings, final boolean bool, final int i, final short[] is, final int i_0_) {
		try {
			if (!bool) {
				method2060(null, null, 116);
			}
			if (i > i_0_) {
				final int i_1_ = (i_0_ - -i) / 2;
				int i_2_ = i_0_;
				final String string = strings[i_1_];
				strings[i_1_] = strings[i];
				strings[i] = string;
				final short i_3_ = is[i_1_];
				is[i_1_] = is[i];
				is[i] = i_3_;
				for (int i_4_ = i_0_; i > i_4_; i_4_++) {
					if (string == null || strings[i_4_] != null && strings[i_4_].compareTo(string) < (0x1 & i_4_)) {
						final String string_5_ = strings[i_4_];
						strings[i_4_] = strings[i_2_];
						strings[i_2_] = string_5_;
						final short i_6_ = is[i_4_];
						is[i_4_] = is[i_2_];
						is[i_2_++] = i_6_;
					}
				}
				strings[i] = strings[i_2_];
				strings[i_2_] = string;
				is[i] = is[i_2_];
				is[i_2_] = i_3_;
				method2057(strings, true, -1 + i_2_, is, i_0_);
				method2057(strings, true, i, is, i_2_ + 1);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("rc.E(").append(strings != null ? "{...}" : "null").append(',').append(bool).append(',').append(i).append(',').append(is != null ? "{...}" : "null").append(',').append(i_0_).append(')').toString());
		}
	}

	static final void method2058(final int i) {
		try {
			if (i == 1) {
				Class120_Sub12_Sub35.aClass21_3411.method186((byte) 86);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("rc.A(").append(i).append(')').toString());
		}
	}

	public static void method2059(final int i) {
		try {
			if (i != 1) {
				method2059(113);
			}
			aClass151Array1400 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("rc.B(").append(i).append(')').toString());
		}
	}

	static final int method2060(final Buffer class120_sub7, final String string, final int i) {
		int i_7_;
		try {
			final int i_8_ = class120_sub7.pos;
			final byte[] is = Class120_Sub6.method1075(string, 23668);
			class120_sub7.method1079(-32769, is.length);
			if (i != -32696) {
				aClass151Array1400 = null;
			}
			class120_sub7.pos += Class39.aClass126_321.method1885(class120_sub7.pos, 0, 19, class120_sub7.buf, is, is.length);
			i_7_ = class120_sub7.pos - i_8_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("rc.D(").append(class120_sub7 != null ? "{...}" : "null").append(',').append(string != null ? "{...}" : "null").append(',').append(i).append(')').toString());
		}
		return i_7_;
	}

	static final Class120_Sub14_Sub8_Sub2 method2061(final int i, final int i_9_) {
		Class120_Sub14_Sub8_Sub2 class120_sub14_sub8_sub2;
		try {
			Class120_Sub14_Sub8_Sub2 class120_sub14_sub8_sub2_10_ = (Class120_Sub14_Sub8_Sub2) Class15.aClass21_95.method193(i_9_, (byte) 76);
			if (class120_sub14_sub8_sub2_10_ != null) {
				return class120_sub14_sub8_sub2_10_;
			}
			final byte[] is = Class120_Sub13.aClass50_2576.method442(i_9_, (byte) 115, 0);
			class120_sub14_sub8_sub2_10_ = new Class120_Sub14_Sub8_Sub2(is);
			class120_sub14_sub8_sub2_10_.method1474(Class82.aClass107Array785, null);
			Class15.aClass21_95.method185(-125, class120_sub14_sub8_sub2_10_, i_9_);
			class120_sub14_sub8_sub2 = class120_sub14_sub8_sub2_10_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("rc.C(").append(i).append(',').append(i_9_).append(')').toString());
		}
		return class120_sub14_sub8_sub2;
	}
}
