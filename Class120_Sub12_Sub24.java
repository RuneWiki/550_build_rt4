/* Class120_Sub12_Sub24 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class120_Sub12_Sub24 extends Class120_Sub12 {
	static Class50 aClass50_3309;
	private int anInt3310 = 4096;
	static int anInt3311;

	Class120_Sub12_Sub24(final int i) {
		super(0, true);
		anInt3310 = i;
	}

	public Class120_Sub12_Sub24() {
		this(4096);
	}

	@Override
	final void method1180(final byte i, final Buffer class120_sub7, final int i_0_) {
		try {
			final int i_1_ = i_0_;
			if (i_1_ == 0) {
				anInt3310 = (class120_sub7.getUByte() << 12) / 255;
			}
			if (i != -43) {
				method1187(69, 27);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("qb.M(").append(i).append(',').append(class120_sub7 != null ? "{...}" : "null").append(',').append(i_0_).append(')').toString());
		}
	}

	public static void method1327(final byte i) {
		try {
			aClass50_3309 = null;
			if (i > -78) {
				aClass50_3309 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("qb.R(").append(i).append(')').toString());
		}
	}

	static final char method1328(final boolean bool, final byte i) {
		char c;
		try {
			int i_2_ = 0xff & i;
			if (i_2_ == 0) {
				throw new IllegalArgumentException(new StringBuilder("Non cp1252 character 0x").append(Integer.toString(i_2_, 16)).append(" provided").toString());
			}
			if (bool) {
				method1328(false, (byte) 36);
			}
			if (i_2_ >= 128 && i_2_ < 160) {
				int i_3_ = Class120_Sub12_Sub32.aCharArray3385[-128 + i_2_];
				if (i_3_ == 0) {
					i_3_ = 63;
				}
				i_2_ = i_3_;
			}
			c = (char) i_2_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("qb.S(").append(bool).append(',').append(i).append(')').toString());
		}
		return c;
	}

	@Override
	final int[] method1187(final int i, final int i_4_) {
		int[] is;
		try {
			if (i != -1735) {
				anInt3310 = 67;
			}
			final int[] is_5_ = this.aClass30_2563.method258(i_4_, 117);
			if (this.aClass30_2563.aBoolean238) {
				Class4.method91(is_5_, 0, Class120_Sub12_Sub7.anInt3178, anInt3310);
			}
			is = is_5_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("qb.D(").append(i).append(',').append(i_4_).append(')').toString());
		}
		return is;
	}
}
