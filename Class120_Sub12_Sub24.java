/* Class120_Sub12_Sub24 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class120_Sub12_Sub24 extends Class120_Sub12 {
	static js5 aClass50_3309;
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
	final void decode(final Buffer buffer, final int i_1_) {
		if (i_1_ == 0) {
			anInt3310 = (buffer.getUByte() << 12) / 255;
		}
	}

	public static void method1327(final byte i) {
		try {
			aClass50_3309 = null;
			if (i > -78) {
				aClass50_3309 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("qb.R(").append(i).append(')').toString());
		}
	}

	static final char method1328(final byte i) {
		int i_2_ = i & 0xff;
		if (i_2_ == 0) {
			throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(i_2_, 16) + " provided");
		}
		if (i_2_ >= 128 && i_2_ < 160) {
			int i_3_ = Class120_Sub12_Sub32.aCharArray3385[i_2_ - 128];
			if (i_3_ == 0) {
				i_3_ = 63;
			}
			i_2_ = i_3_;
		}
		return (char) i_2_;
	}

	@Override
	final int[] method1187(final int i_4_) {
		final int[] is_5_ = this.aClass30_2563.method258(i_4_);
		if (this.aClass30_2563.aBoolean238) {
			ArrayUtils.fillArray(is_5_, 0, Class120_Sub12_Sub7.anInt3178, anInt3310);
		}
		return is_5_;
	}
}
