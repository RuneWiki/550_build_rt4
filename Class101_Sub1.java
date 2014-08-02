/* Class101_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class101_Sub1 extends Class101 {
	static Deque locationAmbientSounds = new Deque();
	private int anInt2267;
	private final int anInt2268;
	private final int anInt2269;
	private final int anInt2270;
	static byte[][] aByteArrayArray2271;
	static int anInt2272;
	static Class22 aClass22_2273;
	static AbstractSprite[] aClass120_Sub14_Sub19Array2274;
	static int anInt2275 = 0;

	@Override
	final void method833(final int i, final int i_0_, final byte i_1_) {
		try {
			final int i_2_ = i * anInt2269 >> 12;
			if (i_1_ <= -108) {
				final int i_3_ = anInt2270 * i >> 12;
				final int i_4_ = i_0_ * anInt2267 >> 12;
				final int i_5_ = i_0_ * anInt2268 >> 12;
				Varp.method635(i_3_, this.anInt960, i_2_, this.anInt964, (byte) 75, this.anInt959, i_5_, i_4_);
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("am.A(").append(i).append(',').append(i_0_).append(',').append(i_1_).append(')').toString());
		}
	}

	public static void method839(final byte i) {
		try {
			if (i >= 3) {
				locationAmbientSounds = null;
				aClass120_Sub14_Sub19Array2274 = null;
				aClass22_2273 = null;
				aByteArrayArray2271 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("am.L(").append(i).append(')').toString());
		}
	}

	static final int method841(final int i_7_) {
		return i_7_ >>> 10;
	}

	static final void method842(final Deque deque, final int i, final int i_9_, final int i_10_) {
		try {
			MapFunctionType.aClass105_653.clear();
			if (i_9_ != 5938) {
				aClass22_2273 = null;
			}
			if (!Class120_Sub12_Sub27.aBoolean3348) {
				for (Class120_Sub14_Sub5 class120_sub14_sub5 = (Class120_Sub14_Sub5) deque.getFront(); class120_sub14_sub5 != null; class120_sub14_sub5 = (Class120_Sub14_Sub5) deque.getNext()) {
					final MapFunctionType class73 = MapFunctionType.list(class120_sub14_sub5.anInt3473);
					if (Class9.method116(class73, -1)) {
						SceneGraphNode.method2271(class120_sub14_sub5, class73, i, i_10_);
						if (class120_sub14_sub5.aBoolean3476) {
							SubScript.method2244(class120_sub14_sub5, class73);
						}
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("am.I(").append(deque != null ? "{...}" : "null").append(',').append(i).append(',').append(i_9_).append(',').append(i_10_).append(')').toString());
		}
	}

	@Override
	final void method834(final int i, final int i_11_, final int i_12_) {
		try {
			final int i_13_ = anInt2269 * i_11_ >> 12;
			final int i_14_ = anInt2270 * i_11_ >> 12;
			final int i_15_ = anInt2267 * i_12_ >> 12;
			final int i_16_ = anInt2268 * i_12_ >> 12;
			if (i != 1380163464) {
				anInt2267 = 89;
			}
			OverlayType.method1901(i_15_, i_13_, this.anInt960, i_16_, true, i_14_);
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("am.B(").append(i).append(',').append(i_11_).append(',').append(i_12_).append(')').toString());
		}
	}

	Class101_Sub1(final int i, final int i_17_, final int i_18_, final int i_19_, final int i_20_, final int i_21_, final int i_22_) {
		super(i_20_, i_21_, i_22_);
		anInt2269 = i;
		anInt2270 = i_18_;
		anInt2268 = i_17_;
		anInt2267 = i_19_;
	}

	static final void method843(final int i, final String string, final int i_23_, final int i_24_, final int i_25_, final int i_26_, final int i_27_, final int i_28_, final Class120_Sub14_Sub8 class120_sub14_sub8, final JagexInterface jagexInterface) {
		try {
			final int i_29_ = i_27_ * i_27_ - -(i_25_ * i_25_);
			final int i_30_ = (int) DummyOutputStream.aFloat28 + Class164.anInt1590 & 0x7ff;
			final int i_31_ = Math.max(jagexInterface.width / 2, jagexInterface.height / 2) - -10;
			if (i_31_ * i_31_ >= i_29_) {
				int i_32_ = Rasterizer.cosineTable[i_30_];
				i_32_ = i_32_ * 256 / (256 + Class154.anInt1442);
				int i_33_ = Rasterizer.sineTable[i_30_];
				i_33_ = i_33_ * 256 / (Class154.anInt1442 + 256);
				int i_34_ = i_33_ * i_25_ - -(i_32_ * i_27_) >> 16;
				final int i_35_ = class120_sub14_sub8.method1468(string, 100);
				final int i_36_ = class120_sub14_sub8.method1480(string, 100, 0);
				final int i_37_ = -(i_33_ * i_27_) + i_25_ * i_32_ >> 16;
				if (i_23_ != 27497) {
					method842(null, -86, -41, -86);
				}
				i_34_ -= i_35_ / 2;
				if (-jagexInterface.width <= i_34_ && i_34_ <= jagexInterface.width && -jagexInterface.height <= i_37_ && i_37_ <= jagexInterface.height) {
					if (HDToolkit.glEnabled) {
						GraphicsHD.method595((HDSprite) jagexInterface.method2492(false));
					} else {
						GraphicsLD.method2164(jagexInterface.anIntArray2079, jagexInterface.anIntArray1949);
					}
					class120_sub14_sub8.method1467(string, i_34_ - (-i_26_ + -(jagexInterface.width / 2)), i_24_ + jagexInterface.height / 2 + -i_37_ + -i_28_ + -i_36_, i_35_, 50, i, 0, 256, 1, 0, 0);
					if (!HDToolkit.glEnabled) {
						GraphicsLD.method2174();
					} else {
						GraphicsHD.method601();
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("am.K(").append(i).append(',').append(string != null ? "{...}" : "null").append(',').append(i_23_).append(',').append(i_24_).append(',').append(i_25_).append(',').append(i_26_).append(',').append(i_27_).append(',')
					.append(i_28_).append(',').append(class120_sub14_sub8 != null ? "{...}" : "null").append(',').append(jagexInterface != null ? "{...}" : "null").append(')').toString());
		}
	}

	@Override
	final void method837(final int i, final int i_38_) {
	}
}
