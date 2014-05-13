/* Class90 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Calendar;
import java.util.TimeZone;

final class Class90 {
	private Class50 aClass50_839;
	static Cache aClass21_840 = new Cache(5);
	private final Class50 aClass50_841;
	private final Hashtable aClass75_842 = new Hashtable(256);
	static Class50 aClass50_843;
	static Calendar aCalendar844;
	static boolean aBoolean845 = false;
	static boolean aBoolean846;
	static int anInt847;
	static int anInt848;
	static int[] anIntArray849;
	static Class82 aClass82_850;
	private final Hashtable aClass75_851 = new Hashtable(256);

	static {
		aCalendar844 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
		anInt847 = -1;
		anInt848 = 0;
	}

	public static void method750(final byte i) {
		try {
			anIntArray849 = null;
			aClass50_843 = null;
			if (i != 54) {
				constructSprites();
			}
			aClass82_850 = null;
			aCalendar844 = null;
			aClass21_840 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("jk.I(").append(i).append(')').toString());
		}
	}

	static final Class120_Sub14_Sub2 method751(final int i_0_) {
		Class120_Sub14_Sub2 class120_sub14_sub2_1_ = (Class120_Sub14_Sub2) Class54.aClass35_491.method302(17301, i_0_);
		if (class120_sub14_sub2_1_ != null) {
			return class120_sub14_sub2_1_;
		}
		final byte[] is = Class24.aClass50_145.getFile(Class65.method576(i_0_, (byte) 70), Class120_Sub6.method1070(-123, i_0_));
		class120_sub14_sub2_1_ = new Class120_Sub14_Sub2();
		if (is != null) {
			class120_sub14_sub2_1_.method1425(false, new Buffer(is));
		}
		Class54.aClass35_491.method301(i_0_, 103, class120_sub14_sub2_1_);
		return class120_sub14_sub2_1_;
	}

	private final Class120_Sub5_Sub1 method752(final int i, final int[] is, final int i_2_, final int i_3_) {
		Class120_Sub5_Sub1 class120_sub5_sub1;
		try {
			if (i_3_ != -1656949328) {
				aClass50_839 = null;
			}
			int i_4_ = i_2_ ^ (i >>> 12 | (0x30000fff & i) << 4);
			i_4_ |= i << 16;
			final long l = i_4_;
			Class120_Sub5_Sub1 class120_sub5_sub1_5_ = (Class120_Sub5_Sub1) aClass75_851.get(l);
			if (class120_sub5_sub1_5_ != null) {
				return class120_sub5_sub1_5_;
			}
			if (is != null && is[0] <= 0) {
				return null;
			}
			final Class6 class6 = Class6.method103(aClass50_841, i, i_2_);
			if (class6 == null) {
				return null;
			}
			class120_sub5_sub1_5_ = class6.method104();
			aClass75_851.put(class120_sub5_sub1_5_, l);
			if (is != null) {
				is[0] -= class120_sub5_sub1_5_.aByteArray3114.length;
			}
			class120_sub5_sub1 = class120_sub5_sub1_5_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("jk.E(").append(i).append(',').append(is != null ? "{...}" : "null").append(',').append(i_2_).append(',').append(i_3_).append(')').toString());
		}
		return class120_sub5_sub1;
	}

	final Class120_Sub5_Sub1 method753(final int[] is, final int i, final int i_6_) {
		try {
			if (aClass50_839.method421(-61) == 1) {
				return method754(i_6_, -111, 0, is);
			}
			if (aClass50_839.getFileAmount(i_6_) == 1) {
				return method754(0, 73, i_6_, is);
			}
			throw new RuntimeException();
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("jk.B(").append(is != null ? "{...}" : "null").append(',').append(i).append(',').append(i_6_).append(')').toString());
		}
	}

	private final Class120_Sub5_Sub1 method754(final int i, final int i_7_, final int i_8_, final int[] is) {
		Class120_Sub5_Sub1 class120_sub5_sub1;
		try {
			int i_9_ = i ^ ((i_8_ & 0x60000fff) << 4 | i_8_ >>> 12);
			i_9_ |= i_8_ << 16;
			final long l = 0x100000000L ^ i_9_;
			Class120_Sub5_Sub1 class120_sub5_sub1_10_ = (Class120_Sub5_Sub1) aClass75_851.get(l);
			if (class120_sub5_sub1_10_ != null) {
				return class120_sub5_sub1_10_;
			}
			if (is != null && is[0] <= 0) {
				return null;
			}
			Class120_Sub23 class120_sub23 = (Class120_Sub23) aClass75_842.get(l);
			if (class120_sub23 == null) {
				class120_sub23 = Class120_Sub23.method1716(aClass50_839, i_8_, i);
				if (class120_sub23 == null) {
					return null;
				}
				aClass75_842.put(class120_sub23, l);
			}
			class120_sub5_sub1_10_ = class120_sub23.method1715(is);
			if (class120_sub5_sub1_10_ == null) {
				return null;
			}
			class120_sub23.unlink();
			aClass75_851.put(class120_sub5_sub1_10_, l);
			class120_sub5_sub1 = class120_sub5_sub1_10_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("jk.H(").append(i).append(',').append(i_7_).append(',').append(i_8_).append(',').append(is != null ? "{...}" : "null").append(')').toString());
		}
		return class120_sub5_sub1;
	}

	static final void method755(final int i, final int i_11_, final String string) {
		try {
			Class120_Sub12_Sub11.outputStream.putByteIsaac(i);
			Class120_Sub12_Sub11.outputStream.putLong(Class70.stringToLong(string));
			Class120_Sub12_Sub11.outputStream.method1080(i_11_, (byte) 10);
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("jk.J(").append(i).append(',').append(i_11_).append(',').append(string != null ? "{...}" : "null").append(')').toString());
		}
	}

	final Class120_Sub5_Sub1 method756(final int i, final int[] is, final int i_12_) {
		try {
			if (aClass50_841.method421(-78) == 1) {
				return method752(0, is, i_12_, -1656949328);
			}
			if (aClass50_841.getFileAmount(i_12_) == 1) {
				return method752(i_12_, is, 0, -1656949328);
			}
			if (i != 3414) {
				method750((byte) -78);
			}
			throw new RuntimeException();
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("jk.G(").append(i).append(',').append(is != null ? "{...}" : "null").append(',').append(i_12_).append(')').toString());
		}
	}

	static final void method757(final byte i) {
		try {
			for (Class120_Sub26 class120_sub26 = (Class120_Sub26) Class120_Sub12_Sub13.aClass75_3234.getFirst(); class120_sub26 != null; class120_sub26 = (Class120_Sub26) Class120_Sub12_Sub13.aClass75_3234.getNext()) {
				final int i_13_ = class120_sub26.anInt2745;
				if (Class50.loadInterface(i_13_)) {
					boolean bool = true;
					final JagexInterface[] class189s = Node.interfaceCache[i_13_];
					JagexInterface[] class189s_15_;
					final int i_14_ = (class189s_15_ = class189s).length;
					for (int i_16_ = 0; i_16_ < i_14_; i_16_++) {
						final JagexInterface jagexInterface = class189s_15_[i_16_];
						if (jagexInterface != null) {
							bool = jagexInterface.aBoolean2041;
							break;
						}
					}
					if (!bool) {
						final int i_17_ = (int) class120_sub26.uid;
						final JagexInterface jagexInterface = Class74.getJagexInterface(i_17_);
						if (jagexInterface != null) {
							InterfaceClickMask.redrawInterface(jagexInterface);
						}
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("jk.D(").append(i).append(')').toString());
		}
	}

	static final void method758(final int i) {
		do {
			try {
				Class120_Sub12_Sub11.outputStream.putByteIsaac(189);
				for (Class120_Sub26 class120_sub26 = (Class120_Sub26) Class120_Sub12_Sub13.aClass75_3234.getFirst(); class120_sub26 != null; class120_sub26 = (Class120_Sub26) Class120_Sub12_Sub13.aClass75_3234.getNext()) {
					if (class120_sub26.anInt2744 == 0) {
						Class120_Sub19.method1675(class120_sub26, true);
					}
				}
				if (Class156.aClass189_1454 != null) {
					InterfaceClickMask.redrawInterface(Class156.aClass189_1454);
					Class156.aClass189_1454 = null;
				}
				if (i != 0) {
					break;
				}
			} catch (final RuntimeException runtimeexception) {
				throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("jk.C(").append(i).append(')').toString());
			}
		} while (false);
	}

	static final AbstractSprite[] constructSprites() {
		final AbstractSprite[] sprites = new AbstractSprite[Class93.spriteAmount];
		for (int spriteId = 0; spriteId < Class93.spriteAmount; spriteId++) {
			final int pixelAmt = Class120_Sub12_Sub11.spriteWidths[spriteId] * Class120_Sub12_Sub39.spriteHeights[spriteId];
			final byte[] paletteIndicators = Class145.spritePaletteIndicators[spriteId];
			if (!Class141.spriteHasAlpha[spriteId]) {
				final int[] pixels = new int[pixelAmt];
				for (int pixelId = 0; pixelId < pixelAmt; pixelId++) {
					pixels[pixelId] = Class132_Sub1.spritePalette[paletteIndicators[pixelId] & 0xff];
				}
				if (!HDToolkit.glEnabled) {
					sprites[spriteId] = new LDSprite(Class31.spriteTrimWidth, SceneGroundObject.spriteTrimHeight, Class180_Sub4.spriteXOffsets[spriteId], GroundTile.spriteYOffsets[spriteId], Class120_Sub12_Sub11.spriteWidths[spriteId], Class120_Sub12_Sub39.spriteHeights[spriteId], pixels);
				} else {
					sprites[spriteId] = new HDSprite(Class31.spriteTrimWidth, SceneGroundObject.spriteTrimHeight, Class180_Sub4.spriteXOffsets[spriteId], GroundTile.spriteYOffsets[spriteId], Class120_Sub12_Sub11.spriteWidths[spriteId], Class120_Sub12_Sub39.spriteHeights[spriteId], pixels);
				}
			} else {
				final byte[] alphas = Class120_Sub12.spriteAlphas[spriteId];
				final int[] pixels = new int[pixelAmt];
				for (int pixelId = 0; pixelId < pixelAmt; pixelId++) {
					pixels[pixelId] = Class191.method2512(Class132_Sub1.spritePalette[paletteIndicators[pixelId] & 0xff], Class120_Sub12_Sub3.method1207(-16777216, alphas[pixelId] << 24));
				}
				if (HDToolkit.glEnabled) {
					sprites[spriteId] = new HDTransparentSprite(Class31.spriteTrimWidth, SceneGroundObject.spriteTrimHeight, Class180_Sub4.spriteXOffsets[spriteId], GroundTile.spriteYOffsets[spriteId], Class120_Sub12_Sub11.spriteWidths[spriteId], Class120_Sub12_Sub39.spriteHeights[spriteId], pixels);
				} else {
					sprites[spriteId] = new LDTransparentSprite(Class31.spriteTrimWidth, SceneGroundObject.spriteTrimHeight, Class180_Sub4.spriteXOffsets[spriteId], GroundTile.spriteYOffsets[spriteId], Class120_Sub12_Sub11.spriteWidths[spriteId], Class120_Sub12_Sub39.spriteHeights[spriteId], pixels);
				}
			}
		}
		Class53_Sub1.resetSpriteInfo();
		return sprites;
	}

	Class90(final Class50 class50, final Class50 class50_26_) {
		aClass50_839 = class50_26_;
		aClass50_841 = class50;
	}
}
