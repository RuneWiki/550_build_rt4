/* Class171 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class DisplayModeInfo {
	static int[] anIntArray1707 = new int[256];
	static String aString1708 = "Created gameworld";
	int height;
	int width;
	int refreshRate;
	int bitDepth;
	static int anInt1713;
	static int revision;
	static int anInt1715;

	static {
		for (int i = 0; i < 256; i++) {
			int i_0_ = i;
			for (int i_1_ = 0; i_1_ < 8; i_1_++) {
				if ((0x1 & i_0_) == 1) {
					i_0_ = i_0_ >>> 1 ^ ~0x12477cdf;
				} else {
					i_0_ >>>= 1;
				}
			}
			anIntArray1707[i] = i_0_;
		}
		anInt1715 = 0;
	}

	static final void method2213(final int i) {
		try {
			Class120_Sub12_Sub23.anInt3307 = 0;
			Class154.anInt1441 = 0;
			Class92.method767(-2);
			Class179.method2262(-16097);
			Class174.method2233((byte) -54);
			Class172.method2223(-12937);
			for (int i_2_ = 0; Class120_Sub12_Sub23.anInt3307 > i_2_; i_2_++) {
				final int i_3_ = Class43.anIntArray366[i_2_];
				if (Class101_Sub2.loopCycle != Class118.playersList[i_3_].anInt2985) {
					if (Class118.playersList[i_3_].anInt3735 > 0) {
						Class31.method267(15, Class118.playersList[i_3_]);
					}
					Class118.playersList[i_3_] = null;
				}
			}
			if (Canvas_Sub1.aClass120_Sub7_Sub1_16.pos != AbstractMouseWheelHandler.anInt118) {
				throw new RuntimeException(new StringBuilder("gpp1 pos:").append(Canvas_Sub1.aClass120_Sub7_Sub1_16.pos).append(" psize:").append(AbstractMouseWheelHandler.anInt118).toString());
			}
			for (int i_4_ = 0; Class83.localPlayerCount > i_4_; i_4_++) {
				if (Class118.playersList[Class112.playerIndices[i_4_]] == null) {
					throw new RuntimeException(new StringBuilder("gpp2 pos:").append(i_4_).append(" size:").append(Class83.localPlayerCount).toString());
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ub.A(").append(i).append(')').toString());
		}
	}

	static final void method2214(final boolean bool) {
		try {
			OutputStream_Sub1.aClass21_30.method186((byte) 86);
			Class120_Sub12_Sub27.aClass21_3342.method186((byte) 86);
			if (bool) {
				anInt1715 = 98;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ub.D(").append(bool).append(')').toString());
		}
	}

	static final String method2215(final int i, final byte[] is, final boolean bool, final int i_5_) {
		String string;
		try {
			final char[] cs = new char[i_5_];
			if (bool) {
				method2216(true);
			}
			int i_6_ = 0;
			for (int i_7_ = 0; i_5_ > i_7_; i_7_++) {
				int i_8_ = 0xff & is[i - -i_7_];
				if (i_8_ != 0) {
					if (i_8_ >= 128 && i_8_ < 160) {
						int i_9_ = Class120_Sub12_Sub32.aCharArray3385[-128 + i_8_];
						if (i_9_ == 0) {
							i_9_ = 63;
						}
						i_8_ = i_9_;
					}
					cs[i_6_++] = (char) i_8_;
				}
			}
			string = new String(cs, 0, i_6_);
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ub.B(").append(i).append(',').append(is != null ? "{...}" : "null").append(',').append(bool).append(',').append(i_5_).append(')').toString());
		}
		return string;
	}

	public DisplayModeInfo() {
		/* empty */
	}

	public static void method2216(final boolean bool) {
		try {
			anIntArray1707 = null;
			aString1708 = null;
			if (!bool) {
				method2214(false);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ub.C(").append(bool).append(')').toString());
		}
	}
}
