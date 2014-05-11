/* Class120_Sub12_Sub30 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;

final class Class120_Sub12_Sub30 extends Class120_Sub12 {
	static AbstractSprite[] crossSprites;
	static String aString3371;
	static String aString3372;
	static Class50 aClass50_3373;
	static int[] anIntArray3374 = new int[200];
	static String aString3375;
	static int anInt3376;
	static int anInt3377;

	static {
		aString3371 = "Loading textures - ";
	}

	static final void method1358(final Buffer class120_sub7) {
		final byte[] is = new byte[24];
		if (Class10.aClass193_78 != null) {
			try {
				Class10.aClass193_78.seek(0L);
				Class10.aClass193_78.method2527(0, is);
				int i_0_;
				for (i_0_ = 0; i_0_ < 24 && is[i_0_] == 0; i_0_++) {
					/* empty */
				}
				if (i_0_ >= 24) {
					throw new IOException();
				}
			} catch (final Exception exception) {
				for (int i_1_ = 0; i_1_ < 24; i_1_++) {
					is[i_1_] = (byte) -1;
				}
			}
		}
		class120_sub7.putBuffer(is, 0, 24);
	}

	private final int method1359(final int i, final int i_2_, final int i_3_) {
		int i_4_;
		try {
			int i_5_ = i_3_ - -(57 * i);
			i_5_ = i_5_ << 1 ^ i_5_;
			if (i_2_ != -9228) {
				return 57;
			}
			i_4_ = 4096 + -((0x7fffffff & 1376312589 + i_5_ * (789221 + 15731 * i_5_ * i_5_)) / 262144);
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("se.R(").append(i).append(',').append(i_2_).append(',').append(i_3_).append(')').toString());
		}
		return i_4_;
	}

	static final void method1360(final int i, final int i_6_) {
		try {
			Class43.aClass21_367.method192((byte) 30, i_6_);
			if (i < -59) {
				Class90.aClass21_840.method192((byte) 108, i_6_);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("se.U(").append(i).append(',').append(i_6_).append(')').toString());
		}
	}

	@Override
	final int[] method1187(final int i, final int i_7_) {
		int[] is;
		try {
			final int[] is_8_ = this.aClass30_2563.method258(i_7_, i ^ ~0x69f);
			if (this.aClass30_2563.aBoolean238) {
				final int i_9_ = Class150.anIntArray1405[i_7_];
				for (int i_10_ = 0; i_10_ < Class120_Sub12_Sub7.anInt3178; i_10_++) {
					is_8_[i_10_] = method1359(i_9_, -9228, Class90.anIntArray849[i_10_]) % 4096;
				}
			}
			if (i != -1735) {
				method1362(true, null);
			}
			is = is_8_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("se.D(").append(i).append(',').append(i_7_).append(')').toString());
		}
		return is;
	}

	public static void method1361(final int i) {
		try {
			aString3372 = null;
			aString3375 = null;
			aClass50_3373 = null;
			anIntArray3374 = null;
			aString3371 = null;
			crossSprites = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("se.W(").append(i).append(')').toString());
		}
	}

	static final Class101_Sub4 method1362(final boolean bool, final Buffer class120_sub7) {
		Class101_Sub4 class101_sub4;
		try {
			if (!bool) {
				method1360(-25, 107);
			}
			class101_sub4 = new Class101_Sub4(class120_sub7.method1078(true), class120_sub7.method1078(bool), class120_sub7.method1078(true), class120_sub7.method1078(true), class120_sub7.method1078(true), class120_sub7.method1078(true), class120_sub7.method1078(bool),
					class120_sub7.method1078(true), class120_sub7.getTriByte(), class120_sub7.getUByte());
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("se.T(").append(bool).append(',').append(class120_sub7 != null ? "{...}" : "null").append(')').toString());
		}
		return class101_sub4;
	}

	public Class120_Sub12_Sub30() {
		super(0, true);
	}

	static final void method1363(final int i, final int i_11_, final int i_12_, final int i_13_, int i_14_, final int i_15_, final int i_16_, final int i_17_) {
		try {
			int i_18_ = i_16_ - 334;
			if (i_18_ >= 0) {
				if (i_18_ > 100) {
					i_18_ = 100;
				}
			} else {
				i_18_ = 0;
			}
			final int i_19_ = i_18_ * (-Class120_Sub12_Sub11.aShort3216 + Class61.aShort565) / 100 + Class120_Sub12_Sub11.aShort3216;
			i_14_ = i_14_ * i_19_ >> 8;
			final int i_20_ = 0x7ff & 2048 - i_11_;
			int i_21_ = 0;
			final int i_22_ = 2048 + -i_13_ & 0x7ff;
			int i_23_ = 0;
			int i_24_ = i_14_;
			if (i_22_ != 0) {
				final int i_25_ = Rasterizer.sineTable[i_22_];
				final int i_26_ = Rasterizer.cosineTable[i_22_];
				i_21_ = -i_24_ * i_25_ >> 16;
				i_24_ = i_24_ * i_26_ >> 16;
			}
			if (i_20_ != 0) {
				final int i_27_ = Rasterizer.cosineTable[i_20_];
				final int i_28_ = Rasterizer.sineTable[i_20_];
				i_23_ = i_24_ * i_28_ >> 16;
				i_24_ = i_24_ * i_27_ >> 16;
			}
			Class120_Sub14_Sub21.anInt3626 = i_15_ - i_24_;
			Class120_Sub12_Sub10.anInt3200 = i_12_ - i_21_;
			Class83.anInt792 = -i_23_ + i_17_;
			if (i != 57) {
				aString3372 = null;
			}
			Class180_Sub3.anInt2909 = i_11_;
			Class128.anInt1223 = i_13_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("se.V(").append(i).append(',').append(i_11_).append(',').append(i_12_).append(',').append(i_13_).append(',').append(i_14_).append(',').append(i_15_).append(',').append(i_16_).append(',').append(i_17_).append(')')
					.toString());
		}
	}
}
