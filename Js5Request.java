/* Class120_Sub14_Sub14_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Js5Request extends AbstractRequest {
	int bufferPos;
	byte bufferOff;
	Buffer buffer;
	static int anInt3940;
	static Class120_Sub31 aClass120_Sub31_3941;

	static final void method1547(final JagexInterface jagexInterface, final int mapFunctionId, final int interfaceX, final int interfaceY, final int mapFunctionX, final int mapFunctionY) {
		final MapFunctionType mapFunctionType = MapFunctionType.list(mapFunctionId);
		if (mapFunctionType != null && mapFunctionType.aBoolean633 && mapFunctionType.method647()) {
			if (mapFunctionType.anIntArray638 != null) {
				final int[] is = new int[mapFunctionType.anIntArray638.length];
				for (int i_5_ = 0; i_5_ < is.length / 2; i_5_++) {
					final int i_6_ = (int) DummyOutputStream.aFloat28 - -Class164.anInt1590 & 0x7ff;
					int i_7_ = Rasterizer.cosineTable[i_6_];
					i_7_ = 256 * i_7_ / (Class154.anInt1442 + 256);
					int i_8_ = Rasterizer.sineTable[i_6_];
					i_8_ = 256 * i_8_ / (Class154.anInt1442 + 256);
					is[i_5_ * 2] = interfaceX + jagexInterface.width / 2 - -((mapFunctionY - -(mapFunctionType.anIntArray638[1 + 2 * i_5_] * 4)) * i_8_ + i_7_ * (mapFunctionX - -(mapFunctionType.anIntArray638[2 * i_5_] * 4)) >> 16);
					is[i_5_ * 2 + 1] = interfaceY - (-(jagexInterface.height / 2) - -(-(i_8_ * (mapFunctionX + 4 * mapFunctionType.anIntArray638[i_5_ * 2])) + i_7_ * (mapFunctionY + 4 * mapFunctionType.anIntArray638[i_5_ * 2 + 1]) >> 16));
				}
				if (HDToolkit.glEnabled) {
					Class68.method608(is, mapFunctionType.anInt651, mapFunctionType.anInt651 >>> 24, jagexInterface.anIntArray2079, jagexInterface.anIntArray1949);
				} else {
					Class59.method544(is, mapFunctionType.anInt651, mapFunctionType.anInt651 >>> 24, jagexInterface.anIntArray2079, jagexInterface.anIntArray1949);
				}
				for (int i_9_ = 0; -1 + is.length / 2 > i_9_; i_9_++) {
					if (!HDToolkit.glEnabled) {
						GraphicsLD.method2165(is[2 * i_9_], is[i_9_ * 2 + 1], is[2 + i_9_ * 2], is[2 * i_9_ + 3], mapFunctionType.anInt630, mapFunctionType.anInt630 >>> 24, jagexInterface.anIntArray2079, jagexInterface.anIntArray1949);
					} else {
						GraphicsHD.method588(is[2 * i_9_], is[2 * i_9_ + 1], is[(1 + i_9_) * 2], is[1 + 2 * i_9_ + 2], mapFunctionType.anInt630, mapFunctionType.anInt630 >>> 24, (HDSprite) jagexInterface.method2492(false));
					}
				}
				if (!HDToolkit.glEnabled) {
					GraphicsLD.method2165(is[is.length - 2], is[-1 + is.length], is[0], is[1], mapFunctionType.anInt630, mapFunctionType.anInt630 >>> 24, jagexInterface.anIntArray2079, jagexInterface.anIntArray1949);
				} else {
					GraphicsHD.method588(is[is.length - 2], is[-1 + is.length], is[0], is[1], mapFunctionType.anInt630, mapFunctionType.anInt630 >>> 24, (HDSprite) jagexInterface.method2492(false));
				}
			}
			AbstractIndexedSprite abstractIndexedSprite = null;
			if (mapFunctionType.unfocusedSpriteId != -1) {
				abstractIndexedSprite = mapFunctionType.consturctSprite(false, false);
				if (abstractIndexedSprite != null) {
					Class120_Sub12_Sub28.method1346(abstractIndexedSprite, jagexInterface, interfaceX, mapFunctionX, mapFunctionY, interfaceY);
				}
			}
			if (mapFunctionType.headerText != null) {
				int i_10_ = 0;
				AbstractFont class120_sub14_sub8 = ObjectCache.smallFont;
				if (mapFunctionType.fontType == 1) {
					class120_sub14_sub8 = Class120_Sub12_Sub20.plainFont;
				}
				if (mapFunctionType.fontType == 2) {
					class120_sub14_sub8 = Class120_Sub12_Sub22.boldFont;
				}
				if (abstractIndexedSprite != null) {
					i_10_ = abstractIndexedSprite.height;
				}
				Class101_Sub1.method843(mapFunctionType.headerText, mapFunctionType.unfocusedFontColor, interfaceY, mapFunctionY, interfaceX, mapFunctionX, i_10_, class120_sub14_sub8, jagexInterface);
			}
		}
	}

	public static void method1549(final int i) {
		try {
			MapSceneType.recentUse = null;
			aClass120_Sub31_3941 = null;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("ul.I(").append(i).append(')').toString());
		}
	}

	static final void method1550() {
		JavaObject.anIntArray3916 = Class3.method86(8, 4, 35, 0.4F, 2048, 8, true);
	}

	static final void method1552(final int i, final int i_15_, final int i_16_, final int i_18_, final boolean bool, final boolean bool_17_) {
		if (i_18_ < i_16_) {
			final int i_20_ = (i_16_ + i_18_) / 2;
			int i_21_ = i_18_;
			final World class167_sub1 = Class86.worlds[i_20_];
			Class86.worlds[i_20_] = Class86.worlds[i_16_];
			Class86.worlds[i_16_] = class167_sub1;
			for (int i_22_ = i_18_; i_16_ > i_22_; i_22_++) {
				if (Class120_Sub12_Sub7.method1233(i_15_, bool, class167_sub1, bool_17_, Class86.worlds[i_22_], i, true) <= 0) {
					final World class167_sub1_23_ = Class86.worlds[i_22_];
					Class86.worlds[i_22_] = Class86.worlds[i_21_];
					Class86.worlds[i_21_++] = class167_sub1_23_;
				}
			}
			Class86.worlds[i_16_] = Class86.worlds[i_21_];
			Class86.worlds[i_21_] = class167_sub1;
			method1552(i, i_15_, i_21_ - 1, i_18_, bool, bool_17_);
			method1552(i, i_15_, i_16_, i_21_ - -1, bool, bool_17_);
		}
	}

	@Override
	final int getCompletion() {
		if (this.buffer == null) {
			return 0;
		}
		return this.buffer.pos * 100 / (this.buffer.buf.length - this.bufferOff);
	}

	static final int method1553(final int i, final World class167_sub1, final int i_25_, final World class167_sub1_26_, final boolean bool) {
		int i_27_;
		try {
			if (i_25_ == 1) {
				int i_28_ = class167_sub1_26_.players;
				int i_29_ = class167_sub1.players;
				if (!bool) {
					if ((i_29_ ^ 0xffffffff) == 0) {
						i_29_ = 2001;
					}
					if (i_28_ == -1) {
						i_28_ = 2001;
					}
				}
				return i_28_ + -i_29_;
			}
			if (i_25_ == 2) {
				return Class120_Sub12_Sub21_Sub1.method1313(class167_sub1.getWorldInfo().region, Class9.language, class167_sub1_26_.getWorldInfo().region);
			}
			if (i_25_ == 3) {
				if (class167_sub1_26_.activity.equals("-")) {
					if (class167_sub1.activity.equals("-")) {
						return 0;
					}
					return bool ? -1 : 1;
				}
				if (class167_sub1.activity.equals("-")) {
					return bool ? 1 : -1;
				}
				return Class120_Sub12_Sub21_Sub1.method1313(class167_sub1.activity, Class9.language, class167_sub1_26_.activity);
			}
			if (i_25_ == 4) {
				return class167_sub1_26_.method2185((byte) -123) ? class167_sub1.method2185((byte) -126) ? 0 : 1 : class167_sub1.method2185((byte) -127) ? -1 : 0;
			}
			if (i_25_ == 5) {
				return class167_sub1_26_.method2186((byte) 84) ? class167_sub1.method2186((byte) 98) ? 0 : 1 : !class167_sub1.method2186((byte) 126) ? 0 : -1;
			}
			if (i_25_ == 6) {
				return class167_sub1_26_.method2187(i ^ ~0x4120) ? class167_sub1.method2187(1082) ? 0 : 1 : !class167_sub1.method2187(i ^ ~0x4120) ? 0 : -1;
			}
			if (i_25_ == 7) {
				return !class167_sub1_26_.method2183(i ^ 0x482b) ? !class167_sub1.method2183(-3378) ? 0 : -1 : class167_sub1.method2183(i ^ 0x482b) ? 0 : 1;
			}
			if (i != -17691) {
				return 12;
			}
			i_27_ = -class167_sub1.worldId + class167_sub1_26_.worldId;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("ul.D(").append(i).append(',').append(class167_sub1 != null ? "{...}" : "null").append(',').append(i_25_).append(',').append(class167_sub1_26_ != null ? "{...}" : "null").append(',').append(bool).append(')')
					.toString());
		}
		return i_27_;
	}

	@Override
	final byte[] getBuffer() {
		if (this.aBoolean3576 || this.buffer.buf.length - this.bufferOff > this.buffer.pos) {
			throw new RuntimeException();
		}
		return this.buffer.buf;
	}
}
