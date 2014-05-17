/* Class120_Sub12_Sub29 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;

final class Class120_Sub12_Sub29 extends Class120_Sub12 {
	static int anInt3362 = 0;
	static String[] aStringArray3363 = null;
	private int anInt3364;
	private int anInt3365 = 2048;
	static Class164 aClass164_3366;
	static Class50 aClass50_3367;
	private int anInt3368;
	static String[] aStringArray3369 = new String[500];

	static final void method1351(final int i) {
		try {
			Class120_Sub14_Sub11.aClass21_3541.clearSoftReference();
			if (i > -7) {
				method1355(93, (byte) -60);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("sc.R(").append(i).append(')').toString());
		}
	}

	public Class120_Sub12_Sub29() {
		super(1, false);
		anInt3364 = 1024;
		anInt3368 = 3072;
	}

	@Override
	final int[] method1187(final int i, final int i_0_) {
		int[] is;
		try {
			final int[] is_1_ = this.aClass30_2563.method258(i_0_, -127);
			if (this.aClass30_2563.aBoolean238) {
				final int[] is_2_ = method1192(i + -6029, i_0_, 0);
				for (int i_3_ = 0; Class120_Sub12_Sub7.anInt3178 > i_3_; i_3_++) {
					is_1_[i_3_] = anInt3364 + (is_2_[i_3_] * anInt3365 >> 12);
				}
			}
			if (i != -1735) {
				anInt3365 = 38;
			}
			is = is_1_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("sc.D(").append(i).append(',').append(i_0_).append(')').toString());
		}
		return is;
	}

	static final void ping(final boolean forceSend) {
		Class120_Sub2.method1050();
		if (Class109.gameState == 30 || Class109.gameState == 25) {
			Class65.pingTimer++;
			if (Class65.pingTimer >= 50 || forceSend) {
				Class65.pingTimer = 0;
				if (!Class120_Sub12_Sub5.errorPinging && AbstractTimer.worldConnection != null) {
					Class120_Sub12_Sub11.outputStream.putByteIsaac(137);
					try {
						AbstractTimer.worldConnection.put(Class120_Sub12_Sub11.outputStream.buf, 0, Class120_Sub12_Sub11.outputStream.pos);
						Class120_Sub12_Sub11.outputStream.pos = 0;
					} catch (final IOException ioexception) {
						Class120_Sub12_Sub5.errorPinging = true;
					}
				}
				Class120_Sub2.method1050();
			}
		}
	}

	public static void method1353(final boolean bool) {
		try {
			aStringArray3369 = null;
			if (!bool) {
				method1351(19);
			}
			aClass50_3367 = null;
			aClass164_3366 = null;
			aStringArray3363 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("sc.AA(").append(bool).append(')').toString());
		}
	}

	@Override
	final int[][] method1188(final int i, final int i_4_) {
		int[][] is;
		try {
			if (i_4_ != -29869) {
				anInt3365 = -127;
			}
			final int[][] is_5_ = this.aClass109_2559.method975(i, -127);
			if (this.aClass109_2559.aBoolean1049) {
				final int[][] is_6_ = method1179(0, i, (byte) -51);
				final int[] is_7_ = is_6_[0];
				final int[] is_8_ = is_6_[1];
				final int[] is_9_ = is_5_[0];
				final int[] is_10_ = is_5_[2];
				final int[] is_11_ = is_5_[1];
				final int[] is_12_ = is_6_[2];
				for (int i_13_ = 0; i_13_ < Class120_Sub12_Sub7.anInt3178; i_13_++) {
					is_9_[i_13_] = (anInt3365 * is_7_[i_13_] >> 12) + anInt3364;
					is_11_[i_13_] = anInt3364 + (is_8_[i_13_] * anInt3365 >> 12);
					is_10_[i_13_] = anInt3364 - -(anInt3365 * is_12_[i_13_] >> 12);
				}
			}
			is = is_5_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("sc.K(").append(i).append(',').append(i_4_).append(')').toString());
		}
		return is;
	}

	static final char method1354(final char c, final boolean bool) {
		char c_14_;
		try {
			if (c == '\u00c6') {
				return 'E';
			}
			if (c == '\u00e6') {
				return 'e';
			}
			if (bool) {
				aStringArray3369 = null;
			}
			if (c == '\u00df') {
				return 's';
			}
			if (c == '\u0152') {
				return 'E';
			}
			if (c == '\u0153') {
				return 'e';
			}
			c_14_ = '\0';
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("sc.T(").append(c).append(',').append(bool).append(')').toString());
		}
		return c_14_;
	}

	@Override
	final void method1193(final byte i) {
		try {
			anInt3365 = -anInt3364 + anInt3368;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("sc.O(").append(i).append(')').toString());
		}
	}

	static final boolean method1355(final int i, final byte i_15_) {
		boolean bool;
		try {
			if (i_15_ > -47) {
				aClass50_3367 = null;
			}
			bool = i == 4 || i == 8;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("sc.V(").append(i).append(',').append(i_15_).append(')').toString());
		}
		return bool;
	}

	static final Class101_Sub3 method1356(final Buffer class120_sub7, final int i) {
		Class101_Sub3 class101_sub3;
		try {
			if (i != 0) {
				aClass164_3366 = null;
			}
			class101_sub3 = new Class101_Sub3(class120_sub7.getShort(), class120_sub7.getShort(), class120_sub7.getShort(), class120_sub7.getShort(), class120_sub7.getMedium(), class120_sub7.getMedium(), class120_sub7.getUByte());
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("sc.S(").append(class120_sub7 != null ? "{...}" : "null").append(',').append(i).append(')').toString());
		}
		return class101_sub3;
	}

	@Override
	final void method1180(final byte i, final Buffer class120_sub7, final int i_16_) {
		try {
			final int i_17_ = i_16_;
			while_128_: do {
				do {
					if (i_17_ != 0) {
						if (i_17_ != 1) {
							if (i_17_ == 2) {
								break;
							}
							break while_128_;
						}
					} else {
						anInt3364 = class120_sub7.getUShort();
						break while_128_;
					}
					anInt3368 = class120_sub7.getUShort();
					break while_128_;
				} while (false);
				this.aBoolean2558 = class120_sub7.getUByte() == 1;
			} while (false);
			if (i != -43) {
				method1356(null, 121);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("sc.M(").append(i).append(',').append(class120_sub7 != null ? "{...}" : "null").append(',').append(i_16_).append(')').toString());
		}
	}

	static final Class101_Sub2 method1357(final Buffer class120_sub7, final int i) {
		Class101_Sub2 class101_sub2;
		try {
			class101_sub2 = new Class101_Sub2(class120_sub7.getShort(), class120_sub7.getShort(), class120_sub7.getShort(), class120_sub7.getShort(), class120_sub7.getMedium(), class120_sub7.getUByte());
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("sc.U(").append(class120_sub7 != null ? "{...}" : "null").append(',').append(i).append(')').toString());
		}
		return class101_sub2;
	}
}
