/* Class120_Sub12_Sub13 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

final class Class120_Sub12_Sub13 extends Class120_Sub12 {
	private int anInt3230;
	private int anInt3231 = 0;
	private int anInt3232;
	static int anInt3233;
	static Hashtable aClass75_3234 = new Hashtable(8);
	private int anInt3235;
	private int anInt3236;

	static final void method1263(final int i) {
		try {
			Class120_Sub14_Sub14_Sub2.aClass21_3937.clearSoftReference();
			if (i != 14834) {
				method1265((byte) -20);
			}
			Class132.aClass21_1255.clearSoftReference();
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("kl.S(").append(i).append(')').toString());
		}
	}

	static final void method1264() {
		for (int i = 0; i < Class120_Sub14_Sub12.anInt3556; i++) {
			final Class28 class28 = Class111.aClass28Array1057[i];
			Class120_Sub14_Sub10.method1499(class28);
			Class111.aClass28Array1057[i] = null;
		}
		Class120_Sub14_Sub12.anInt3556 = 0;
	}

	public Class120_Sub12_Sub13() {
		super(0, true);
		anInt3230 = 0;
		anInt3232 = 2000;
		anInt3235 = 4096;
		anInt3236 = 16;
	}

	@Override
	final void method1193(final byte i) {
		try {
			PacketBuffer.method1147((byte) -29);
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("kl.O(").append(i).append(')').toString());
		}
	}

	static final boolean method1265(final byte i) {
		try {
			if (i != -66) {
				method1266(-81, null, null);
			}
			synchronized (Class169.keyboardHandler) {
				if (Class120_Sub12_Sub36.anInt3423 == Class141.anInt1357) {
					return false;
				}
				Class35.anInt301 = Class120_Sub12_Sub8.anIntArray3187[Class141.anInt1357];
				ObjType.aChar1536 = Class134.aCharArray1286[Class141.anInt1357];
				Class141.anInt1357 = Class141.anInt1357 + 1 & 0x7f;
				return true;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("kl.R(").append(i).append(')').toString());
		}
	}

	@Override
	final void method1180(final byte i, final Buffer class120_sub7, final int i_0_) {
		try {
			final int i_1_ = i_0_;
			while_203_: do {
				while_202_: do {
					while_201_: do {
						do {
							if (i_1_ != 0) {
								if (i_1_ != 1) {
									if (i_1_ != 2) {
										if (i_1_ != 3) {
											if (i_1_ == 4) {
												break while_202_;
											}
											break while_203_;
										}
									} else {
										break;
									}
									break while_201_;
								}
							} else {
								anInt3231 = class120_sub7.getUByte();
								break while_203_;
							}
							anInt3232 = class120_sub7.getUShort();
							break while_203_;
						} while (false);
						anInt3236 = class120_sub7.getUByte();
						break while_203_;
					} while (false);
					anInt3230 = class120_sub7.getUShort();
					break while_203_;
				} while (false);
				anInt3235 = class120_sub7.getUShort();
			} while (false);
			if (i != -43) {
				anInt3233 = 36;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("kl.M(").append(i).append(',').append(class120_sub7 != null ? "{...}" : "null").append(',').append(i_0_).append(')').toString());
		}
	}

	static final void method1266(final int i, final Class50 class50, final Class50 class50_2_) {
		try {
			Class154.aClass50_1443 = class50;
			Class90.aClass50_843 = class50_2_;
			if (i != -1) {
				method1265((byte) -86);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("kl.V(").append(i).append(',').append(class50 != null ? "{...}" : "null").append(',').append(class50_2_ != null ? "{...}" : "null").append(')').toString());
		}
	}

	public static void method1267(final int i) {
		try {
			aClass75_3234 = null;
			if (i != -1) {
				anInt3233 = -5;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("kl.T(").append(i).append(')').toString());
		}
	}

	@Override
	final int[] method1187(final int i, final int i_3_) {
		int[] is;
		try {
			final int[] is_4_ = this.aClass30_2563.method258(i_3_, -67);
			if (this.aClass30_2563.aBoolean238) {
				final int i_5_ = anInt3235 >> 1;
				final int[][] is_6_ = this.aClass30_2563.method257(-1);
				final Random random = new Random(anInt3231);
				for (int i_7_ = 0; anInt3232 > i_7_; i_7_++) {
					int i_8_ = anInt3235 > 0 ? anInt3230 - (-Class28.method244(random, anInt3235, -85) - -i_5_) : anInt3230;
					i_8_ = (i_8_ & 0xffd) >> 4;
					int i_9_ = Class28.method244(random, Class120_Sub12_Sub7.anInt3178, i + 1765);
					int i_10_ = Class28.method244(random, Class120_Sub12_Sub2.anInt3145, 114);
					int i_11_ = i_9_ + (Class83.anIntArray789[i_8_] * anInt3236 >> 12);
					int i_12_ = i_10_ + (Class84.anIntArray800[i_8_] * anInt3236 >> 12);
					int i_13_ = -i_10_ + i_12_;
					int i_14_ = i_11_ + -i_9_;
					if (i_14_ != 0 || i_13_ != 0) {
						if (i_13_ < 0) {
							i_13_ = -i_13_;
						}
						if (i_14_ < 0) {
							i_14_ = -i_14_;
						}
						final boolean bool = i_13_ > i_14_;
						if (bool) {
							final int i_15_ = i_11_;
							final int i_16_ = i_9_;
							i_9_ = i_10_;
							i_11_ = i_12_;
							i_10_ = i_16_;
							i_12_ = i_15_;
						}
						if (i_9_ > i_11_) {
							final int i_17_ = i_9_;
							i_9_ = i_11_;
							final int i_18_ = i_10_;
							i_11_ = i_17_;
							i_10_ = i_12_;
							i_12_ = i_18_;
						}
						int i_19_ = i_10_;
						final int i_20_ = i_11_ - i_9_;
						int i_21_ = -i_20_ / 2;
						int i_22_ = i_12_ + -i_10_;
						final int i_23_ = -(Class28.method244(random, 4096, 34) >> 2) + 1024;
						if (i_22_ < 0) {
							i_22_ = -i_22_;
						}
						final int i_24_ = 2048 / i_20_;
						final int i_25_ = i_12_ <= i_10_ ? -1 : 1;
						for (int i_26_ = i_9_; i_26_ < i_11_; i_26_++) {
							i_21_ += i_22_;
							final int i_27_ = 1024 + i_23_ + (i_26_ - i_9_) * i_24_;
							final int i_28_ = i_19_ & Class120_Sub29.anInt2774;
							final int i_29_ = Class32.anInt259 & i_26_;
							if (i_21_ > 0) {
								i_21_ = -i_20_ + i_21_;
								i_19_ = i_25_ + i_19_;
							}
							if (bool) {
								is_6_[i_28_][i_29_] = i_27_;
							} else {
								is_6_[i_29_][i_28_] = i_27_;
							}
						}
					}
				}
			}
			if (i != -1735) {
				aClass75_3234 = null;
			}
			is = is_4_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("kl.D(").append(i).append(',').append(i_3_).append(')').toString());
		}
		return is;
	}
}
