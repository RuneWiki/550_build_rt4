/* Class120_Sub14_Sub23 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class120_Sub14_Sub23 extends NodeSub {
	int[] anIntArray3648;
	static int anInt3649;
	String aString3650;
	int[] anIntArray3651;
	char[] aCharArray3652;
	char[] aCharArray3653;
	static int[] anIntArray3654;
	static String aString3655 = "You can't add yourself to your own friend list.";

	final void method1638(final byte i, final Buffer class120_sub7) {
		do {
			try {
				for (;;) {
					final int i_0_ = class120_sub7.getUByte();
					if (i_0_ == 0) {
						break;
					}
					method1645(-1, class120_sub7, i_0_);
				}
				if (i != -19) {
					break;
				}
			} catch (final RuntimeException runtimeexception) {
				throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("wh.G(").append(i).append(',').append(class120_sub7 != null ? "{...}" : "null").append(')').toString());
			}
		} while (false);
	}

	static final void method1639(final int i, final int i_1_, final int i_2_, final int i_3_, final boolean bool, final int i_4_, final int i_5_) {
		try {
			Class134.anInt1280 = i_5_;
			Class99.anInt951 = i_1_;
			Class120_Sub17.anInt2621 = i_2_;
			if (i_4_ != 0) {
				method1639(6, 117, 100, 73, true, 14, -115);
			}
			SpotAnimType.anInt986 = i_3_;
			NpcType.anInt1660 = i;
			if (bool && Class120_Sub17.anInt2621 >= 100) {
				Class83.anInt792 = 128 * Class99.anInt951 + 64;
				Class120_Sub14_Sub21.anInt3626 = 64 + 128 * Class134.anInt1280;
				Class120_Sub12_Sub10.anInt3200 = Class22.method197(Class120_Sub14_Sub21.anInt3626, true, Class83.anInt792, Class173.anInt1729) - SpotAnimType.anInt986;
			}
			client.anInt2200 = 2;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("wh.B(").append(i).append(',').append(i_1_).append(',').append(i_2_).append(',').append(i_3_).append(',').append(bool).append(',').append(i_4_).append(',').append(i_5_).append(')').toString());
		}
	}

	final int method1640(final char c, final int i) {
		int i_6_;
		try {
			if (i != -1) {
				method1644(-128);
			}
			if (this.anIntArray3648 == null) {
				return -1;
			}
			for (int i_7_ = 0; this.anIntArray3648.length > i_7_; i_7_++) {
				if (this.aCharArray3653[i_7_] == c) {
					return this.anIntArray3648[i_7_];
				}
			}
			i_6_ = -1;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("wh.C(").append(c).append(',').append(i).append(')').toString());
		}
		return i_6_;
	}

	public static void method1641(final int i) {
		try {
			if (i == 32768) {
				aString3655 = null;
				anIntArray3654 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("wh.D(").append(i).append(')').toString());
		}
	}

	static final Class29 method1642(final int i, final int i_8_) {
		Class29 class29;
		try {
			Class29 class29_9_ = (Class29) Class120_Sub12_Sub31.aClass21_3378.method193(i_8_, (byte) -96);
			if (class29_9_ != null) {
				return class29_9_;
			}
			if (i != -16596) {
				return null;
			}
			final byte[] is = CanvasWrapper.aClass50_18.method442(32, (byte) 116, i_8_);
			class29_9_ = new Class29();
			if (is != null) {
				class29_9_.method248(new Buffer(is), (byte) 70);
			}
			class29_9_.method253(63);
			Class120_Sub12_Sub31.aClass21_3378.method185(-127, class29_9_, i_8_);
			class29 = class29_9_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("wh.H(").append(i).append(',').append(i_8_).append(')').toString());
		}
		return class29;
	}

	final int method1643(final char c, final int i) {
		int i_10_;
		try {
			if (this.anIntArray3651 == null) {
				return -1;
			}
			for (int i_11_ = 0; this.anIntArray3651.length > i_11_; i_11_++) {
				if (this.aCharArray3652[i_11_] == c) {
					return this.anIntArray3651[i_11_];
				}
			}
			i_10_ = -1;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("wh.F(").append(c).append(',').append(i).append(')').toString());
		}
		return i_10_;
	}

	final void method1644(final int i) {
		try {
			if (this.anIntArray3648 != null) {
				for (int i_12_ = 0; i_12_ < this.anIntArray3648.length; i_12_++) {
					this.anIntArray3648[i_12_] = Class191.method2512(this.anIntArray3648[i_12_], 32768);
				}
			}
			if (i == 32768 && this.anIntArray3651 != null) {
				for (int i_13_ = 0; i_13_ < this.anIntArray3651.length; i_13_++) {
					this.anIntArray3651[i_13_] = Class191.method2512(this.anIntArray3651[i_13_], 32768);
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("wh.A(").append(i).append(')').toString());
		}
	}

	public Class120_Sub14_Sub23() {
		/* empty */
	}

	private final void method1645(final int i, final Buffer class120_sub7, final int i_14_) {
		try {
			if (i != -1) {
				method1638((byte) -73, null);
			}
			if (i_14_ == 1) {
				this.aString3650 = class120_sub7.getJString();
			} else if (i_14_ != 2) {
				if (i_14_ == 3) {
					final int i_15_ = class120_sub7.getUByte();
					this.aCharArray3653 = new char[i_15_];
					this.anIntArray3648 = new int[i_15_];
					for (int i_16_ = 0; i_16_ < i_15_; i_16_++) {
						this.anIntArray3648[i_16_] = class120_sub7.getUShort();
						final byte i_17_ = class120_sub7.getByte();
						this.aCharArray3653[i_16_] = i_17_ != 0 ? Class120_Sub12_Sub24.method1328(false, i_17_) : '\0';
					}
				}
			} else {
				final int i_18_ = class120_sub7.getUByte();
				this.anIntArray3651 = new int[i_18_];
				this.aCharArray3652 = new char[i_18_];
				for (int i_19_ = 0; i_18_ > i_19_; i_19_++) {
					this.anIntArray3651[i_19_] = class120_sub7.getUShort();
					final byte i_20_ = class120_sub7.getByte();
					this.aCharArray3652[i_19_] = i_20_ != 0 ? Class120_Sub12_Sub24.method1328(false, i_20_) : '\0';
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("wh.E(").append(i).append(',').append(class120_sub7 != null ? "{...}" : "null").append(',').append(i_14_).append(')').toString());
		}
	}
}
