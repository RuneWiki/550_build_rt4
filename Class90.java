/* Class90 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Calendar;
import java.util.TimeZone;

final class Class90 {
	private js5 aClass50_839;
	static ObjectCache playerHeadModelsCache = new ObjectCache(5);
	private final js5 aClass50_841;
	private final Hashtable aClass75_842 = new Hashtable(256);
	static js5 aClass50_843;
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
				constructTransparentSprites();
			}
			aClass82_850 = null;
			aCalendar844 = null;
			playerHeadModelsCache = null;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("jk.I(").append(i).append(')').toString());
		}
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
			throw EnumType.method1428(runtimeexception, new StringBuilder("jk.E(").append(i).append(',').append(is != null ? "{...}" : "null").append(',').append(i_2_).append(',').append(i_3_).append(')').toString());
		}
		return class120_sub5_sub1;
	}

	final Class120_Sub5_Sub1 method753(final int[] is, final int i, final int i_6_) {
		try {
			if (aClass50_839.method421() == 1) {
				return method754(i_6_, -111, 0, is);
			}
			if (aClass50_839.getFileAmount(i_6_) == 1) {
				return method754(0, 73, i_6_, is);
			}
			throw new RuntimeException();
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("jk.B(").append(is != null ? "{...}" : "null").append(',').append(i).append(',').append(i_6_).append(')').toString());
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
			throw EnumType.method1428(runtimeexception, new StringBuilder("jk.H(").append(i).append(',').append(i_7_).append(',').append(i_8_).append(',').append(is != null ? "{...}" : "null").append(')').toString());
		}
		return class120_sub5_sub1;
	}

	static final void method755(final int i, final int i_11_, final String string) {
		try {
			Class120_Sub12_Sub11.outputStream.putByteIsaac(i);
			Class120_Sub12_Sub11.outputStream.putLong(Varp.stringToLong(string));
			Class120_Sub12_Sub11.outputStream.putByteC(i_11_);
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("jk.J(").append(i).append(',').append(i_11_).append(',').append(string != null ? "{...}" : "null").append(')').toString());
		}
	}

	final Class120_Sub5_Sub1 method756(final int i, final int[] is, final int i_12_) {
		try {
			if (aClass50_841.method421() == 1) {
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
			throw EnumType.method1428(runtimeexception, new StringBuilder("jk.G(").append(i).append(',').append(is != null ? "{...}" : "null").append(',').append(i_12_).append(')').toString());
		}
	}

	static final void redrawOldFormatOverridedInterfaces() {
		for (OverridedJInterface overridedInterface = (OverridedJInterface) Class120_Sub12_Sub13.overridedInterfaces.getFirst(); overridedInterface != null; overridedInterface = (OverridedJInterface) Class120_Sub12_Sub13.overridedInterfaces.getNext()) {
			final int interfaceId = overridedInterface.interfaceId;
			if (js5.loadInterface(interfaceId)) {
				boolean newFormat = true;
				final JagexInterface[] cache = Node.interfaceCache[interfaceId];
				for (int id = 0; id < cache.length; id++) {
					final JagexInterface jagexInterface = cache[id];
					if (jagexInterface != null) {
						newFormat = jagexInterface.newFormat;
						break;
					}
				}
				if (!newFormat) {
					final int uid = (int) overridedInterface.uid;
					final JagexInterface jagexInterface = Class74.getJagexInterface(uid);
					if (jagexInterface != null) {
						InterfaceClickMask.redrawInterface(jagexInterface);
					}
				}
			}
		}
	}

	static final void removeOverridedInterfaces() {
		Class120_Sub12_Sub11.outputStream.putByteIsaac(189);
		for (OverridedJInterface class120_sub26 = (OverridedJInterface) Class120_Sub12_Sub13.overridedInterfaces.getFirst(); class120_sub26 != null; class120_sub26 = (OverridedJInterface) Class120_Sub12_Sub13.overridedInterfaces.getNext()) {
			if (class120_sub26.type == 0) {
				Class120_Sub19.removeOverridedInterface(class120_sub26, true);
			}
		}
		if (Class156.aClass189_1454 != null) {
			InterfaceClickMask.redrawInterface(Class156.aClass189_1454);
			Class156.aClass189_1454 = null;
		}
	}

	static final AbstractSprite[] constructTransparentSprites() {
		final AbstractSprite[] sprites = new AbstractSprite[Class93.spriteAmount];
		for (int spriteId = 0; spriteId < Class93.spriteAmount; spriteId++) {
			final int pixelAmt = Class120_Sub12_Sub11.spriteWidths[spriteId] * Class120_Sub12_Sub39.spriteHeights[spriteId];
			final byte[] paletteIndicators = Class145.spritePaletteIndicators[spriteId];
			if (!PlainTile.spriteHasAlpha[spriteId]) {
				final int[] pixels = new int[pixelAmt];
				for (int pixelId = 0; pixelId < pixelAmt; pixelId++) {
					pixels[pixelId] = Class132_Sub1.spritePalette[paletteIndicators[pixelId] & 0xff];
				}
				if (!HDToolkit.glEnabled) {
					sprites[spriteId] = new LDSprite(Class31.spriteTrimWidth, SceneGroundObject.spriteTrimHeight, Projectile.spriteXOffsets[spriteId], GroundTile.spriteYOffsets[spriteId], Class120_Sub12_Sub11.spriteWidths[spriteId], Class120_Sub12_Sub39.spriteHeights[spriteId], pixels);
				} else {
					sprites[spriteId] = new HDSprite(Class31.spriteTrimWidth, SceneGroundObject.spriteTrimHeight, Projectile.spriteXOffsets[spriteId], GroundTile.spriteYOffsets[spriteId], Class120_Sub12_Sub11.spriteWidths[spriteId], Class120_Sub12_Sub39.spriteHeights[spriteId], pixels);
				}
			} else {
				final byte[] alphas = Class120_Sub12.spriteAlphas[spriteId];
				final int[] pixels = new int[pixelAmt];
				for (int pixelId = 0; pixelId < pixelAmt; pixelId++) {
					pixels[pixelId] = Class191.method2512(Class132_Sub1.spritePalette[paletteIndicators[pixelId] & 0xff], Class120_Sub12_Sub3.method1207(-16777216, alphas[pixelId] << 24));
				}
				if (HDToolkit.glEnabled) {
					sprites[spriteId] = new HDTransparentSprite(Class31.spriteTrimWidth, SceneGroundObject.spriteTrimHeight, Projectile.spriteXOffsets[spriteId], GroundTile.spriteYOffsets[spriteId], Class120_Sub12_Sub11.spriteWidths[spriteId], Class120_Sub12_Sub39.spriteHeights[spriteId], pixels);
				} else {
					sprites[spriteId] = new LDTransparentSprite(Class31.spriteTrimWidth, SceneGroundObject.spriteTrimHeight, Projectile.spriteXOffsets[spriteId], GroundTile.spriteYOffsets[spriteId], Class120_Sub12_Sub11.spriteWidths[spriteId], Class120_Sub12_Sub39.spriteHeights[spriteId], pixels);
				}
			}
		}
		Class53_Sub1.resetSpriteInfo();
		return sprites;
	}

	Class90(final js5 js5, final js5 class50_26_) {
		aClass50_839 = class50_26_;
		aClass50_841 = js5;
	}
}
