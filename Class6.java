/* Class6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class6 {
	private int anInt57;
	private int anInt58;
	private final Class175[] aClass175Array59;

	private final byte[] method101() {
		int i = 0;
		for (int i_0_ = 0; i_0_ < 10; i_0_++) {
			if (aClass175Array59[i_0_] != null && aClass175Array59[i_0_].anInt1739 + aClass175Array59[i_0_].anInt1745 > i) {
				i = aClass175Array59[i_0_].anInt1739 + aClass175Array59[i_0_].anInt1745;
			}
		}
		if (i == 0) {
			return new byte[0];
		}
		final int i_1_ = 22050 * i / 1000;
		final byte[] is = new byte[i_1_];
		for (int i_2_ = 0; i_2_ < 10; i_2_++) {
			if (aClass175Array59[i_2_] != null) {
				final int i_3_ = aClass175Array59[i_2_].anInt1739 * 22050 / 1000;
				final int i_4_ = aClass175Array59[i_2_].anInt1745 * 22050 / 1000;
				final int[] is_5_ = aClass175Array59[i_2_].method2240(i_3_, aClass175Array59[i_2_].anInt1739);
				for (int i_6_ = 0; i_6_ < i_3_; i_6_++) {
					int i_7_ = is[i_6_ + i_4_] + (is_5_[i_6_] >> 8);
					if ((i_7_ + 128 & ~0xff) != 0) {
						i_7_ = i_7_ >> 31 ^ 0x7f;
					}
					is[i_6_ + i_4_] = (byte) i_7_;
				}
			}
		}
		return is;
	}

	final int method102() {
		int i = 9999999;
		for (int i_8_ = 0; i_8_ < 10; i_8_++) {
			if (aClass175Array59[i_8_] != null && aClass175Array59[i_8_].anInt1745 / 20 < i) {
				i = aClass175Array59[i_8_].anInt1745 / 20;
			}
		}
		if (anInt58 < anInt57 && anInt58 / 20 < i) {
			i = anInt58 / 20;
		}
		if (i == 9999999 || i == 0) {
			return 0;
		}
		for (int i_9_ = 0; i_9_ < 10; i_9_++) {
			if (aClass175Array59[i_9_] != null) {
				aClass175Array59[i_9_].anInt1745 -= i * 20;
			}
		}
		if (anInt58 < anInt57) {
			anInt58 -= i * 20;
			anInt57 -= i * 20;
		}
		return i;
	}

	static final Class6 method103(final Class50 class50, final int i, final int i_10_) {
		final byte[] is = class50.method442(i, (byte) 119, i_10_);
		if (is == null) {
			return null;
		}
		return new Class6(new Buffer(is));
	}

	final Class120_Sub5_Sub1 method104() {
		final byte[] is = method101();
		return new Class120_Sub5_Sub1(22050, is, 22050 * anInt58 / 1000, 22050 * anInt57 / 1000);
	}

	private Class6(final Buffer class120_sub7) {
		aClass175Array59 = new Class175[10];
		for (int i = 0; i < 10; i++) {
			final int i_11_ = class120_sub7.getUByte();
			if (i_11_ != 0) {
				class120_sub7.pos--;
				aClass175Array59[i] = new Class175();
				aClass175Array59[i].method2238(class120_sub7);
			}
		}
		anInt58 = class120_sub7.getUShort();
		anInt57 = class120_sub7.getUShort();
	}

	private Class6() {
		aClass175Array59 = new Class175[10];
	}
}
