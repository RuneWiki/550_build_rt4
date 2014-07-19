/* Class120_Sub12_Sub31 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class120_Sub12_Sub31 extends Class120_Sub12 {
	static ObjectCache aClass21_3378;
	private int anInt3379 = 4096;
	static int anInt3380;
	static AbstractMouseWheelHandler mouseWheelHandler;
	static int anInt3382 = 0;
	static int[] anIntArray3383;
	static int anInt3384;

	static {
		anInt3380 = 0;
		aClass21_3378 = new ObjectCache(64);
	}

	static final void method1364(final boolean bool, final int i) {
		try {
			if (bool) {
				method1366(-33);
			}
			if (Class173.anInt1724 == i && i != 0) {
				final ShaderInterface shaderInterface = Class157.shaders[i];
				shaderInterface.method5(Class101_Sub1.anInt2275);
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("sh.U(").append(bool).append(',').append(i).append(')').toString());
		}
	}

	@Override
	final int[] method1187(final int i_0_) {
		final int[] is_1_ = this.aClass30_2563.method258(i_0_);
		if (this.aClass30_2563.aBoolean238) {
			final int[] is_2_ = method1192(-1 + i_0_ & Class120_Sub29.anInt2774, 0);
			final int[] is_3_ = method1192(i_0_, 0);
			final int[] is_4_ = method1192(1 + i_0_ & Class120_Sub29.anInt2774, 0);
			for (int i_5_ = 0; i_5_ < Class120_Sub12_Sub7.anInt3178; i_5_++) {
				final int i_6_ = anInt3379 * (-is_2_[i_5_] + is_4_[i_5_]);
				final int i_7_ = anInt3379 * (-is_3_[Class32.anInt259 & -1 + i_5_] + is_3_[Class32.anInt259 & 1 + i_5_]);
				final int i_8_ = i_7_ >> 12;
				final int i_9_ = i_6_ >> 12;
				final int i_10_ = i_9_ * i_9_ >> 12;
				final int i_11_ = i_8_ * i_8_ >> 12;
				final int i_12_ = (int) (Math.sqrt((4096 + i_10_ + i_11_) / 4096.0F) * 4096.0);
				final int i_13_ = i_12_ == 0 ? 0 : 16777216 / i_12_;
				is_1_[i_5_] = 4096 + -i_13_;
			}
		}
		return is_1_;
	}

	public Class120_Sub12_Sub31() {
		super(1, true);
	}

	static final Class80 method1365(final int i, final int i_14_) {
		Class80 class80;
		try {
			Class80 class80_15_ = (Class80) Class120_Sub12_Sub16.aClass21_3251.get(i_14_);
			if (class80_15_ != null) {
				return class80_15_;
			}
			final byte[] is = Class69.aClass50_619.getFile(i, i_14_);
			class80_15_ = new Class80();
			if (is != null) {
				class80_15_.method698(new Buffer(is), (byte) 63);
			}
			class80_15_.method702((byte) -87);
			Class120_Sub12_Sub16.aClass21_3251.put(class80_15_, i_14_);
			class80 = class80_15_;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("sh.S(").append(i).append(',').append(i_14_).append(')').toString());
		}
		return class80;
	}

	public static void method1366(final int i) {
		try {
			anIntArray3383 = null;
			mouseWheelHandler = null;
			if (i == 1) {
				aClass21_3378 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("sh.V(").append(i).append(')').toString());
		}
	}

	static final int method1368(final JagexInterface jagexInterface, final int i) {
		if (!client.getClickMask(jagexInterface).method1678(i) && jagexInterface.anObjectArray2006 == null) {
			return -1;
		}
		return jagexInterface.cursors == null || jagexInterface.cursors.length <= i ? -1 : jagexInterface.cursors[i];
	}

	@Override
	final void decode(final Buffer buffer, final int i_20_) {
		if (i_20_ == 0) {
			anInt3379 = buffer.getUShort();
		}
	}
}
