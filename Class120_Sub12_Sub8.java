/* Class120_Sub12_Sub8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class120_Sub12_Sub8 extends Class120_Sub12 {
	private int anInt3186;
	static int[] anIntArray3187 = new int[128];
	private int anInt3188;
	private int[] anIntArray3189;
	static int[] anIntArray3190 = new int[64];
	private int anInt3191 = -1;

	public Class120_Sub12_Sub8() {
		super(0, false);
	}

	static final short[] method1236(final short[] is, final byte i) {
		short[] is_0_;
		try {
			if (is == null) {
				return null;
			}
			final short[] is_1_ = new short[is.length];
			ArrayUtils.arrayCopy(is, 0, is_1_, 0, is.length);
			is_0_ = is_1_;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("fi.S(").append(is != null ? "{...}" : "null").append(',').append(i).append(')').toString());
		}
		return is_0_;
	}

	public static void method1238(final int i) {
		try {
			anIntArray3187 = null;
			if (i == 23086) {
				anIntArray3190 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("fi.V(").append(i).append(')').toString());
		}
	}

	@Override
	final int[][] method1188(final int i) {
		final int[][] is_5_ = this.aClass109_2559.method975(i);
		if (this.aClass109_2559.aBoolean1049 && method1239(187)) {
			int i_6_ = anInt3186 * (Class120_Sub12_Sub2.anInt3145 != anInt3188 ? i * anInt3188 / Class120_Sub12_Sub2.anInt3145 : i);
			final int[] is_7_ = is_5_[0];
			final int[] is_8_ = is_5_[2];
			final int[] is_9_ = is_5_[1];
			if (anInt3186 == Class120_Sub12_Sub7.anInt3178) {
				for (int i_10_ = 0; Class120_Sub12_Sub7.anInt3178 > i_10_; i_10_++) {
					final int i_11_ = anIntArray3189[i_6_++];
					is_8_[i_10_] = Class120_Sub12_Sub3.method1207(i_11_ << 4, 4080);
					is_9_[i_10_] = Class120_Sub12_Sub3.method1207(65280, i_11_) >> 4;
					is_7_[i_10_] = Class120_Sub12_Sub3.method1207(i_11_, 16711680) >> 12;
				}
			} else {
				for (int i_12_ = 0; Class120_Sub12_Sub7.anInt3178 > i_12_; i_12_++) {
					final int i_13_ = anInt3186 * i_12_ / Class120_Sub12_Sub7.anInt3178;
					final int i_14_ = anIntArray3189[i_13_ + i_6_];
					is_8_[i_12_] = Class120_Sub12_Sub3.method1207(i_14_, 255) << 4;
					is_9_[i_12_] = Class120_Sub12_Sub3.method1207(i_14_, 65280) >> 4;
					is_7_[i_12_] = Class120_Sub12_Sub3.method1207(i_14_ >> 12, 4080);
				}
			}
		}
		return is_5_;
	}

	private final boolean method1239(final int i) {
		boolean bool;
		try {
			if (i != 187) {
				return true;
			}
			if (anIntArray3189 != null) {
				return true;
			}
			if (anInt3191 >= 0) {
				final int i_15_ = Class120_Sub12_Sub2.anInt3145;
				final int i_16_ = Class120_Sub12_Sub7.anInt3178;
				final int i_17_ = CanvasWrapper.anInterface3_19.method8(anInt3191).aBoolean1100 ? 64 : 128;
				anIntArray3189 = CanvasWrapper.anInterface3_19.method6(i_17_, 1.0F, anInt3191, i_17_, false);
				anInt3188 = i_17_;
				anInt3186 = i_17_;
				Class22.method199(i_16_, i_15_, false);
				if (anIntArray3189 != null) {
					return true;
				}
				return false;
			}
			bool = false;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("fi.U(").append(i).append(')').toString());
		}
		return bool;
	}

	static final void method1241(final JagexInterface jagexInterface, final int i, final int i_20_) {
		if (Class120_Sub12_Sub4.aClass189_3156 == null && !Class15.menuOpen && jagexInterface != null && method1243(jagexInterface, 26) != null) {
			Class120_Sub12_Sub4.aClass189_3156 = jagexInterface;
			Class26.aClass189_161 = method1243(jagexInterface, 26);
			Class120_Sub11.aBoolean2551 = false;
			SceneGroundObject.anInt2843 = 0;
			AbstractGraphicsBuffer.anInt1173 = i;
			client.anInt2203 = i_20_;
		}
	}

	@Override
	final void decode(final Buffer buffer, final int i_22_) {
		if (i_22_ == 0) {
			anInt3191 = buffer.getUShort();
		}
	}

	@Override
	final void method1189() {
		super.method1189();
		anIntArray3189 = null;
	}

	@Override
	final int method1184() {
		return anInt3191;
	}

	static final void synchronizeKeyCodes() {
		if (Signlink.javaVendor.toLowerCase().indexOf("microsoft") != -1) {
			Class120_Sub12_Sub23.keyCodes[188] = 71;
			Class120_Sub12_Sub23.keyCodes[223] = 28;
			Class120_Sub12_Sub23.keyCodes[219] = 42;
			Class120_Sub12_Sub23.keyCodes[192] = 58;
			Class120_Sub12_Sub23.keyCodes[221] = 43;
			Class120_Sub12_Sub23.keyCodes[190] = 72;
			Class120_Sub12_Sub23.keyCodes[189] = 26;
			Class120_Sub12_Sub23.keyCodes[222] = 59;
			Class120_Sub12_Sub23.keyCodes[186] = 57;
			Class120_Sub12_Sub23.keyCodes[220] = 74;
			Class120_Sub12_Sub23.keyCodes[187] = 27;
			Class120_Sub12_Sub23.keyCodes[191] = 73;
		} else {
			Class120_Sub12_Sub23.keyCodes[61] = 27;
			Class120_Sub12_Sub23.keyCodes[46] = 72;
			if (Signlink.traversalKeyMethod == null) {
				Class120_Sub12_Sub23.keyCodes[192] = 58;
				Class120_Sub12_Sub23.keyCodes[222] = 59;
			} else {
				Class120_Sub12_Sub23.keyCodes[520] = 59;
				Class120_Sub12_Sub23.keyCodes[192] = 28;
				Class120_Sub12_Sub23.keyCodes[222] = 58;
			}
			Class120_Sub12_Sub23.keyCodes[92] = 74;
			Class120_Sub12_Sub23.keyCodes[91] = 42;
			Class120_Sub12_Sub23.keyCodes[93] = 43;
			Class120_Sub12_Sub23.keyCodes[45] = 26;
			Class120_Sub12_Sub23.keyCodes[44] = 71;
			Class120_Sub12_Sub23.keyCodes[47] = 73;
			Class120_Sub12_Sub23.keyCodes[59] = 57;
		}
	}

	private static final JagexInterface method1243(final JagexInterface jagexInterface, final int i) {
		JagexInterface class189_24_;
		try {
			JagexInterface class189_25_ = client.method58(jagexInterface);
			if (i != 26) {
				anIntArray3187 = null;
			}
			if (class189_25_ == null) {
				class189_25_ = jagexInterface.aClass189_1931;
			}
			class189_24_ = class189_25_;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("fi.AA(").append(jagexInterface != null ? "{...}" : "null").append(',').append(i).append(')').toString());
		}
		return class189_24_;
	}
}
