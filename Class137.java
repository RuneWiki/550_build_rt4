/* Class137 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class137 {
	int[] anIntArray1322;
	static int anInt1323 = 0;
	Class120_Sub14_Sub5[] aClass120_Sub14_Sub5Array1324;
	int anInt1325;
	static PacketBuffer aClass120_Sub7_Sub1_1326 = new PacketBuffer(5000);

	static final void method1980(final boolean bool, final JagexInterface[] class189s, final int i) {
		try {
			JagexInterface[] class189s_1_;
			final int i_0_ = (class189s_1_ = class189s).length;
			for (int i_2_ = 0; i_2_ < i_0_; i_2_++) {
				final JagexInterface jagexInterface = class189s_1_[i_2_];
				if (jagexInterface != null) {
					if (jagexInterface.type == 0) {
						if (jagexInterface.aClass189Array2072 != null) {
							method1980(bool, jagexInterface.aClass189Array2072, i);
						}
						final OverridedJInterface class120_sub26 = (OverridedJInterface) Class120_Sub12_Sub13.overridedInterfaces.get(jagexInterface.bitPacked);
						if (class120_sub26 != null) {
							InterfaceClickMask.method1689(i, class120_sub26.interfaceId);
						}
					}
					if (i == 0 && jagexInterface.anObjectArray2013 != null) {
						final Class120_Sub10 class120_sub10 = new Class120_Sub10();
						class120_sub10.aClass189_2534 = jagexInterface;
						class120_sub10.anObjectArray2537 = jagexInterface.anObjectArray2013;
						Class88.method744(true, class120_sub10);
					}
					if (i == 1 && jagexInterface.anObjectArray1932 != null) {
						if (jagexInterface.anInt2083 >= 0) {
							final JagexInterface class189_3_ = Class74.getJagexInterface(jagexInterface.bitPacked);
							if (class189_3_ == null || class189_3_.aClass189Array2072 == null || class189_3_.aClass189Array2072.length <= jagexInterface.anInt2083 || jagexInterface != class189_3_.aClass189Array2072[jagexInterface.anInt2083]) {
								continue;
							}
						}
						final Class120_Sub10 class120_sub10 = new Class120_Sub10();
						class120_sub10.anObjectArray2537 = jagexInterface.anObjectArray1932;
						class120_sub10.aClass189_2534 = jagexInterface;
						Class88.method744(true, class120_sub10);
					}
				}
			}
			if (!bool) {
				anInt1323 = -109;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("po.B(").append(bool).append(',').append(class189s != null ? "{...}" : "null").append(',').append(i).append(')').toString());
		}
	}

	public static void method1981(final byte i) {
		try {
			aClass120_Sub7_Sub1_1326 = null;
			if (i != -97) {
				aClass120_Sub7_Sub1_1326 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("po.A(").append(i).append(')').toString());
		}
	}

	static final void method1982(final byte i, final int i_4_, final int i_5_, final int i_6_, int i_7_, int i_8_, final int i_9_, final int i_10_) {
		try {
			if (i_7_ < 128 || i_8_ < 128 || i_7_ > 13056 || i_8_ > 13056) {
				Class120_Sub12_Sub38.anInt3434 = -1;
				Class120_Sub15.anInt2588 = -1;
			} else {
				int i_11_ = -i_5_ + Class22.method197(Class173.gameLevel, i_7_, i_8_);
				i_7_ -= Class83.renderX;
				i_11_ -= Class120_Sub12_Sub10.renderY;
				i_8_ -= GroundObjectNode.renderZ;
				final int i_12_ = Rasterizer.sineTable[Class128.renderPitch];
				final int i_13_ = Rasterizer.cosineTable[Class128.renderPitch];
				final int i_14_ = Rasterizer.sineTable[Class180_Sub3.renderYaw];
				final int i_15_ = Rasterizer.cosineTable[Class180_Sub3.renderYaw];
				int i_16_ = i_8_ * i_14_ + i_7_ * i_15_ >> 16;
				i_8_ = i_8_ * i_15_ - i_14_ * i_7_ >> 16;
				i_7_ = i_16_;
				i_16_ = -(i_8_ * i_12_) + i_13_ * i_11_ >> 16;
				i_8_ = i_12_ * i_11_ + i_8_ * i_13_ >> 16;
				i_11_ = i_16_;
				if (i_8_ < 50) {
					Class120_Sub15.anInt2588 = -1;
					Class120_Sub12_Sub38.anInt3434 = -1;
				} else if (HDToolkit.glEnabled) {
					final int i_17_ = i_6_ * 512 >> 8;
					Class120_Sub12_Sub38.anInt3434 = i_10_ + i_17_ * i_7_ / i_8_;
					final int i_18_ = i_9_ * 512 >> 8;
					Class120_Sub15.anInt2588 = i_4_ - -(i_18_ * i_11_ / i_8_);
				} else {
					Class120_Sub12_Sub38.anInt3434 = i_10_ - -((i_7_ << 9) / i_8_);
					Class120_Sub15.anInt2588 = i_4_ + (i_11_ << 9) / i_8_;
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("po.C(").append(i).append(',').append(i_4_).append(',').append(i_5_).append(',').append(i_6_).append(',').append(i_7_).append(',').append(i_8_).append(',').append(i_9_).append(',').append(i_10_).append(')')
					.toString());
		}
	}

	Class137(final int i) {
		this.anInt1325 = i;
		this.anIntArray1322 = new int[this.anInt1325];
		this.aClass120_Sub14_Sub5Array1324 = new Class120_Sub14_Sub5[this.anInt1325];
	}
}
