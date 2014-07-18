/* Class120_Sub12_Sub19 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class120_Sub12_Sub19 extends Class120_Sub12 {
	private boolean aBoolean3277;
	static Buffer aClass120_Sub7_3278;
	private int anInt3279 = 4096;
	static int textCount = 0;
	static int anInt3281 = -1;
	static int currentDisplayMode = 0;

	static {
		aClass120_Sub7_3278 = new Buffer(new byte[5000]);
	}

	@Override
	final void method1180(final byte i, final Buffer class120_sub7, final int i_0_) {
		do {
			try {
				if (i != -43) {
					method1188(-125);
				}
				final int i_1_ = i_0_;
				if (i_1_ != 0) {
					if (i_1_ != 1) {
						break;
					}
				} else {
					anInt3279 = class120_sub7.getUShort();
					break;
				}
				aBoolean3277 = class120_sub7.getUByte() == 1;
			} catch (final RuntimeException runtimeexception) {
				throw EnumType.method1428(runtimeexception, new StringBuilder("no.M(").append(i).append(',').append(class120_sub7 != null ? "{...}" : "null").append(',').append(i_0_).append(')').toString());
			}
		} while (false);
	}

	@Override
	final int[][] method1188(final int i) {
		final int[][] is_3_ = this.aClass109_2559.method975(i);
		if (this.aClass109_2559.aBoolean1049) {
			final int[] is_4_ = method1192(Class120_Sub29.anInt2774 & -1 + i, 0);
			final int[] is_5_ = method1192(i, 0);
			final int[] is_6_ = method1192(1 + i & Class120_Sub29.anInt2774, 0);
			final int[] is_7_ = is_3_[0];
			final int[] is_8_ = is_3_[1];
			final int[] is_9_ = is_3_[2];
			for (int i_10_ = 0; Class120_Sub12_Sub7.anInt3178 > i_10_; i_10_++) {
				final int i_11_ = (is_6_[i_10_] + -is_4_[i_10_]) * anInt3279;
				final int i_12_ = anInt3279 * (is_5_[i_10_ + 1 & Class32.anInt259] - is_5_[i_10_ - 1 & Class32.anInt259]);
				final int i_13_ = i_11_ >> 12;
				final int i_14_ = i_12_ >> 12;
				final int i_15_ = i_13_ * i_13_ >> 12;
				final int i_16_ = i_14_ * i_14_ >> 12;
				final int i_17_ = (int) (Math.sqrt((i_15_ + i_16_ - -4096) / 4096.0F) * 4096.0);
				int i_18_;
				int i_19_;
				int i_20_;
				if (i_17_ == 0) {
					i_18_ = 0;
					i_19_ = 0;
					i_20_ = 0;
				} else {
					i_18_ = i_11_ / i_17_;
					i_19_ = 16777216 / i_17_;
					i_20_ = i_12_ / i_17_;
				}
				if (aBoolean3277) {
					i_20_ = 2048 + (i_20_ >> 1);
					i_18_ = 2048 - -(i_18_ >> 1);
					i_19_ = 2048 - -(i_19_ >> 1);
				}
				is_7_[i_10_] = i_20_;
				is_8_[i_10_] = i_18_;
				is_9_[i_10_] = i_19_;
			}
		}
		return is_3_;
	}

	public static void method1295(final boolean bool) {
		try {
			aClass120_Sub7_3278 = null;
			if (!bool) {
				anInt3281 = 79;
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("no.R(").append(bool).append(')').toString());
		}
	}

	public Class120_Sub12_Sub19() {
		super(1, false);
		aBoolean3277 = true;
	}
}
