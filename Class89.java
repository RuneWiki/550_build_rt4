/* Class89 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class89 {
	static Class50 aClass50_836;
	static int anInt837;
	static int[] anIntArray838;

	static final void method746(final int i, final int i_0_, final byte i_1_) {
		try {
			final InterfaceChangeNode class120_sub14_sub7 = Class120_Sub14_Sub3.putInterfaceChange(13, i_0_);
			class120_sub14_sub7.method1454((byte) -106);
			class120_sub14_sub7.anInt3484 = i;
			if (i_1_ != -56) {
				aClass50_836 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ji.D(").append(i).append(',').append(i_0_).append(',').append(i_1_).append(')').toString());
		}
	}

	public static void method747(final byte i) {
		try {
			if (i != 121) {
				method749('I', null, -75, false);
			}
			aClass50_836 = null;
			anIntArray838 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ji.A(").append(i).append(')').toString());
		}
	}

	static final float[] method748(final int i, final float[] fs) {
		float[] fs_2_;
		try {
			if (fs == null) {
				return null;
			}
			if (i != -5899) {
				method746(49, 92, (byte) -101);
			}
			final float[] fs_3_ = new float[fs.length];
			Class4.method93(fs, 0, fs_3_, 0, fs.length);
			fs_2_ = fs_3_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ji.C(").append(i).append(',').append(fs != null ? "{...}" : "null").append(')').toString());
		}
		return fs_2_;
	}

	static final StringBuffer method749(final char c, final StringBuffer stringbuffer, final int i, final boolean bool) {
		StringBuffer stringbuffer_4_;
		try {
			if (!bool) {
				aClass50_836 = null;
			}
			final int i_5_ = stringbuffer.length();
			stringbuffer.setLength(i);
			for (int i_6_ = i_5_; i_6_ < i; i_6_++) {
				stringbuffer.setCharAt(i_6_, c);
			}
			stringbuffer_4_ = stringbuffer;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ji.B(").append(c).append(',').append(stringbuffer != null ? "{...}" : "null").append(',').append(i).append(',').append(bool).append(')').toString());
		}
		return stringbuffer_4_;
	}
}
