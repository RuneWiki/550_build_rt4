/* Class120_Sub14_Sub15 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;

import javax.media.opengl.GL;

final class Class120_Sub14_Sub15 extends NodeSub {
	private int anInt3579 = 0;
	static int[] anIntArray3580 = new int[32];
	private int anInt3581 = -1;
	static volatile int anInt3582;
	static int anInt3583;
	static Class105 aClass105_3584;
	static String aString3585;
	private final int anInt3586;

	static {
		int i = 2;
		for (int i_0_ = 0; i_0_ < 32; i_0_++) {
			anIntArray3580[i_0_] = i + -1;
			i += i;
		}
		anInt3582 = 0;
		aString3585 = null;
		aClass105_3584 = new Class105();
	}

	static final void method1554(final byte i, final int i_1_) {
		try {
			Class90.method757((byte) -83);
			Class120_Sub28.method1725(false);
			final int i_2_ = Class132_Sub1.method1933((byte) -110, i_1_).anInt621;
			if (i_2_ != 0) {
				final int i_3_ = Class2.permanentVariable[i_1_];
				if (i_2_ == 9) {
					Class189.anInt2027 = i_3_;
				}
				if (i_2_ == 5) {
					Class69.anInt617 = i_3_;
				}
				if (i_2_ == 6) {
					Player.anInt3748 = i_3_;
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("qd.B(").append(i).append(',').append(i_1_).append(')').toString());
		}
	}

	public static void method1555(final int i) {
		try {
			if (i < -21) {
				aString3585 = null;
				aClass105_3584 = null;
				anIntArray3580 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("qd.F(").append(i).append(')').toString());
		}
	}

	static final void method1556(final int i, final int i_4_, final int i_5_, final int i_6_, final int i_7_, final int i_8_) {
		try {
			for (int i_9_ = i_6_; i_6_ - -i_7_ >= i_9_; i_9_++) {
				for (int i_10_ = i; i_10_ <= i - -i_5_; i_10_++) {
					if (i_10_ >= 0 && i_10_ < 104 && i_9_ >= 0 && i_9_ < 104) {
						Npc.aByteArrayArrayArray3754[i_4_][i_10_][i_9_] = (byte) 127;
					}
				}
			}
			for (int i_11_ = i_6_; i_7_ + i_6_ > i_11_; i_11_++) {
				for (int i_12_ = i; i_12_ < i_5_ + i; i_12_++) {
					if (i_12_ >= 0 && i_12_ < 104 && i_11_ >= 0 && i_11_ < 104) {
						Class120_Sub26.anIntArrayArrayArray2741[i_4_][i_12_][i_11_] = i_4_ > 0 ? Class120_Sub26.anIntArrayArrayArray2741[i_4_ + -1][i_12_][i_11_] : 0;
					}
				}
			}
			if ((i ^ 0xffffffff) < i_8_ && i < 104) {
				for (int i_13_ = 1 + i_6_; i_13_ < i_6_ - -i_7_; i_13_++) {
					if (i_13_ >= 0 && i_13_ < 104) {
						Class120_Sub26.anIntArrayArrayArray2741[i_4_][i][i_13_] = Class120_Sub26.anIntArrayArrayArray2741[i_4_][-1 + i][i_13_];
					}
				}
			}
			if (i_6_ > 0 && i_6_ < 104) {
				for (int i_14_ = i + 1; i - -i_5_ > i_14_; i_14_++) {
					if (i_14_ >= 0 && i_14_ < 104) {
						Class120_Sub26.anIntArrayArrayArray2741[i_4_][i_14_][i_6_] = Class120_Sub26.anIntArrayArrayArray2741[i_4_][i_14_][i_6_ - 1];
					}
				}
			}
			if (i >= 0 && i_6_ >= 0 && i < 104 && i_6_ < 104) {
				if (i_4_ != 0) {
					if (i <= 0 || Class120_Sub26.anIntArrayArrayArray2741[-1 + i_4_][-1 + i][i_6_] == Class120_Sub26.anIntArrayArrayArray2741[i_4_][i - 1][i_6_]) {
						if (i_6_ > 0 && Class120_Sub26.anIntArrayArrayArray2741[i_4_ + -1][i][i_6_ + -1] != Class120_Sub26.anIntArrayArrayArray2741[i_4_][i][i_6_ + -1]) {
							Class120_Sub26.anIntArrayArrayArray2741[i_4_][i][i_6_] = Class120_Sub26.anIntArrayArrayArray2741[i_4_][i][i_6_ - 1];
						} else if (i > 0 && i_6_ > 0 && Class120_Sub26.anIntArrayArrayArray2741[-1 + i_4_][-1 + i][-1 + i_6_] != Class120_Sub26.anIntArrayArrayArray2741[i_4_][-1 + i][i_6_ - 1]) {
							Class120_Sub26.anIntArrayArrayArray2741[i_4_][i][i_6_] = Class120_Sub26.anIntArrayArrayArray2741[i_4_][-1 + i][i_6_ - 1];
						}
					} else {
						Class120_Sub26.anIntArrayArrayArray2741[i_4_][i][i_6_] = Class120_Sub26.anIntArrayArrayArray2741[i_4_][i + -1][i_6_];
					}
				} else if (i > 0 && Class120_Sub26.anIntArrayArrayArray2741[i_4_][i - 1][i_6_] != 0) {
					Class120_Sub26.anIntArrayArrayArray2741[i_4_][i][i_6_] = Class120_Sub26.anIntArrayArrayArray2741[i_4_][i - 1][i_6_];
				} else if (i_6_ <= 0 || Class120_Sub26.anIntArrayArrayArray2741[i_4_][i][i_6_ - 1] == 0) {
					if (i > 0 && i_6_ > 0 && Class120_Sub26.anIntArrayArrayArray2741[i_4_][-1 + i][-1 + i_6_] != 0) {
						Class120_Sub26.anIntArrayArrayArray2741[i_4_][i][i_6_] = Class120_Sub26.anIntArrayArrayArray2741[i_4_][-1 + i][i_6_ + -1];
					}
				} else {
					Class120_Sub26.anIntArrayArrayArray2741[i_4_][i][i_6_] = Class120_Sub26.anIntArrayArrayArray2741[i_4_][i][-1 + i_6_];
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("qd.D(").append(i).append(',').append(i_4_).append(',').append(i_5_).append(',').append(i_6_).append(',').append(i_7_).append(',').append(i_8_).append(')').toString());
		}
	}

	static final String method1557(final boolean bool, final int i, final Buffer class120_sub7) {
		String string;
		do {
			String string_15_;
			try {
				String string_16_;
				try {
					if (!bool) {
						anInt3583 = -42;
					}
					int i_17_ = class120_sub7.method1081((byte) 98);
					if (i < i_17_) {
						i_17_ = i;
					}
					final byte[] is = new byte[i_17_];
					class120_sub7.pos += Class39.aClass126_321.method1886(0, class120_sub7.pos, 125, class120_sub7.buf, is, i_17_);
					final String string_18_ = DisplayModeInfo.method2215(0, is, false, i_17_);
					string_16_ = string_18_;
				} catch (final Exception exception) {
					string = "Cabbage";
					break;
				}
				string_15_ = string_16_;
			} catch (final RuntimeException runtimeexception) {
				throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("qd.A(").append(bool).append(',').append(i).append(',').append(class120_sub7 != null ? "{...}" : "null").append(')').toString());
			}
			return string_15_;
		} while (false);
		return string;
	}

	@Override
	protected final void finalize() throws Throwable {
		try {
			if (anInt3581 != -1) {
				Class113.method999(anInt3581, anInt3579, anInt3586);
				anInt3579 = 0;
				anInt3581 = -1;
			}
			super.finalize();
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, "qd.finalize()");
		}
	}

	static final int method1558(final int i, final int i_19_, final int i_20_) {
		int i_21_;
		try {
			final int i_22_ = i >> 31 & i_20_ + i_19_;
			i_21_ = i_22_ + (i + (i >>> 31)) % i_20_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("qd.C(").append(i).append(',').append(i_19_).append(',').append(i_20_).append(')').toString());
		}
		return i_21_;
	}

	final void method1559(final int i) {
		try {
			final int i_23_ = Class49.method408((byte) 117);
			if ((i_23_ & i) == 0) {
				HDToolkit.method514(anInt3581);
			}
			if ((i_23_ & 0x2) == 0) {
				HDToolkit.method511(0);
			}
			if ((i_23_ & 0x4) == 0) {
				HDToolkit.method521(0);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("qd.E(").append(i).append(')').toString());
		}
	}

	Class120_Sub14_Sub15(final int i) {
		final GL gl = HDToolkit.gl;
		final int[] is = new int[1];
		gl.glGenTextures(1, is, 0);
		anInt3581 = is[0];
		anInt3586 = Class113.anInt1083;
		HDToolkit.method514(anInt3581);
		final int i_24_ = Rasterizer.anIntArray969[i];
		final byte[] is_25_ = { (byte) (i_24_ >> 16), (byte) (i_24_ >> 8), (byte) i_24_, -1 };
		final ByteBuffer bytebuffer = ByteBuffer.wrap(is_25_);
		gl.glTexImage2D(3553, 0, 6408, 1, 1, 0, 6408, 5121, bytebuffer);
		gl.glTexParameteri(3553, 10241, 9729);
		gl.glTexParameteri(3553, 10240, 9729);
		Class113.anInt1081 += bytebuffer.limit() - anInt3579;
		anInt3579 = bytebuffer.limit();
	}
}
