/* Class140 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class140 {
	static int anInt1338 = 0;
	private int anInt1339 = 0;
	static boolean aBoolean1340;
	static int[] anIntArray1341 = { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0, 2, 0, 0, 1, 0 };
	private final Class75 aClass75_1342;
	static int anInt1343 = 0;
	private Node aClass120_1344;
	static int anInt1345;

	final Node method1994(final byte i) {
		Node node;
		try {
			anInt1339 = 0;
			if (i > -127) {
				method1995(104, -127);
			}
			node = method1998((byte) 101);
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("qe.A(").append(i).append(')').toString());
		}
		return node;
	}

	static final void method1995(final int i, final int i_0_) {
		try {
			if ((Class120_Sub12_Sub25.anInt3312 ^ 0xffffffff) == i_0_) {
				Class30.aClass120_Sub30_Sub2_234.method1748(i_0_ ^ ~0x80, i);
			} else {
				Class120_Sub14_Sub14_Sub2.anInt3940 = i;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("qe.G(").append(i).append(',').append(i_0_).append(')').toString());
		}
	}

	static final void decodeSprites(final byte[] data) {
		final Buffer buffer = new Buffer(data);
		buffer.pos = data.length - 2;
		Class93.spriteAmount = buffer.getUShort();
		Class141.spriteHasAlpha = new boolean[Class93.spriteAmount];
		Class120_Sub12.spriteAlphas = new byte[Class93.spriteAmount][];
		Class180_Sub4.spriteXOffsets = new int[Class93.spriteAmount];
		Class120_Sub12_Sub11.spriteWidths = new int[Class93.spriteAmount];
		Class145.spritePaletteIndicators = new byte[Class93.spriteAmount][];
		Class120_Sub12_Sub39.spriteHeights = new int[Class93.spriteAmount];
		Class120_Sub18.spriteYOffsets = new int[Class93.spriteAmount];
		buffer.pos = data.length - 7 - (8 * Class93.spriteAmount);
		Class31.spriteTrimWidth = buffer.getUShort();
		Class180_Sub1.spriteTrimHeight = buffer.getUShort();
		final int paletteSize = (0xff & buffer.getUByte()) + 1;
		for (int i_3_ = 0; i_3_ < Class93.spriteAmount; i_3_++) {
			Class180_Sub4.spriteXOffsets[i_3_] = buffer.getUShort();
		}
		for (int i_4_ = 0; i_4_ < Class93.spriteAmount; i_4_++) {
			Class120_Sub18.spriteYOffsets[i_4_] = buffer.getUShort();
		}
		for (int i_5_ = 0; i_5_ < Class93.spriteAmount; i_5_++) {
			Class120_Sub12_Sub11.spriteWidths[i_5_] = buffer.getUShort();
		}
		for (int i_6_ = 0; i_6_ < Class93.spriteAmount; i_6_++) {
			Class120_Sub12_Sub39.spriteHeights[i_6_] = buffer.getUShort();
		}
		buffer.pos = data.length - 7 - (paletteSize - 1) * 3 - (Class93.spriteAmount * 8);
		Class132_Sub1.spritePalette = new int[paletteSize];
		for (int id = 1; paletteSize > id; id++) {
			Class132_Sub1.spritePalette[id] = buffer.getTriByte();
			if (Class132_Sub1.spritePalette[id] == 0) {
				Class132_Sub1.spritePalette[id] = 1;
			}
		}
		buffer.pos = 0;
		for (int spriteId = 0; spriteId < Class93.spriteAmount; spriteId++) {
			final int width = Class120_Sub12_Sub11.spriteWidths[spriteId];
			final int height = Class120_Sub12_Sub39.spriteHeights[spriteId];
			final int pixelAmount = height * width;
			final byte[] paletteIndicators = new byte[pixelAmount];
			Class145.spritePaletteIndicators[spriteId] = paletteIndicators;
			final byte[] alphas = new byte[pixelAmount];
			boolean hasAlpha = false;
			Class120_Sub12.spriteAlphas[spriteId] = alphas;
			final int imageType = buffer.getUByte();
			if ((0x1 & imageType) == 0) {
				for (int pixelId = 0; pixelId < pixelAmount; pixelId++) {
					paletteIndicators[pixelId] = buffer.getByte();
				}
				if ((0x2 & imageType) != 0) {
					for (int alphaId = 0; alphaId < pixelAmount; alphaId++) {
						final byte alpha = alphas[alphaId] = buffer.getByte();
						hasAlpha = hasAlpha | alpha != -1;
					}
				}
			} else {
				for (int x = 0; x < width; x++) {
					for (int y = 0; y < height; y++) {
						paletteIndicators[x + (width * y)] = buffer.getByte();
					}
				}
				if ((0x2 & imageType) != 0) {
					for (int x = 0; x < width; x++) {
						for (int y = 0; y < height; y++) {
							final byte alpha = alphas[x + y * width] = buffer.getByte();
							hasAlpha = hasAlpha | alpha != -1;
						}
					}
				}
			}
			Class141.spriteHasAlpha[spriteId] = hasAlpha;
		}
	}

	static final void method1997(final boolean bool, final int i, final int i_22_) {
		try {
			if (bool) {
				method2000(92, null);
			}
			Class2.permanentVariable[i] = i_22_;
			Class120_Sub3 class120_sub3 = (Class120_Sub3) Class69_Sub3_Sub1.aClass75_3079.method659(i, 118);
			if (class120_sub3 == null) {
				class120_sub3 = new Class120_Sub3(TimeUtil.getSafeTime() - -500L);
				Class69_Sub3_Sub1.aClass75_3079.method655(class120_sub3, 97, i);
			} else {
				class120_sub3.aLong2425 = 500L + TimeUtil.getSafeTime();
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("qe.E(").append(bool).append(',').append(i).append(',').append(i_22_).append(')').toString());
		}
	}

	final Node method1998(final byte i) {
		Node node;
		try {
			if (anInt1339 > 0 && aClass75_1342.aClass120Array672[-1 + anInt1339] != aClass120_1344) {
				final Node class120_23_ = aClass120_1344;
				aClass120_1344 = class120_23_.next;
				return class120_23_;
			}
			while (anInt1339 < aClass75_1342.anInt673) {
				final Node class120_24_ = aClass75_1342.aClass120Array672[anInt1339++].next;
				if (aClass75_1342.aClass120Array672[anInt1339 + -1] != class120_24_) {
					aClass120_1344 = class120_24_.next;
					return class120_24_;
				}
			}
			if (i != 101) {
				aBoolean1340 = true;
			}
			node = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("qe.F(").append(i).append(')').toString());
		}
		return node;
	}

	public static void method1999(final byte i) {
		try {
			anIntArray1341 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("qe.C(").append(i).append(')').toString());
		}
	}

	Class140(final Class75 class75) {
		aClass75_1342 = class75;
	}

	static final void method2000(final int i, final Buffer class120_sub7) {
		try {
			for (int i_25_ = i; Class57.anInt502 > i_25_; i_25_++) {
				final int i_26_ = class120_sub7.method1081((byte) 98);
				int i_27_ = class120_sub7.getUShort();
				if (65535 == i_27_) {
					i_27_ = -1;
				}
				if (Class48.aClass167_Sub1Array435[i_26_] != null) {
					Class48.aClass167_Sub1Array435[i_26_].anInt1617 = i_27_;
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("qe.D(").append(i).append(',').append(class120_sub7 != null ? "{...}" : "null").append(')').toString());
		}
	}
}
