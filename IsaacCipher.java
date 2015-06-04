/* Class106 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class IsaacCipher {
	private int count;
	private int c;
	static int crossY = 0;
	private int b;
	static int[] anIntArray1015;
	private int a;
	private final int[] rsl;
	private final int[] mem;
	static js5 aClass50_1019;

	static final void drawTitleScreenSprites(final js5 js5) {
		if (!Class101_Sub3.titleScreenSpritesDrawn) {
			if (!HDToolkit.glEnabled) {
				GraphicsLD.clearPixels();
			} else {
				GraphicsHD.clearPixels();
			}
			KeyboardHandler.titlebgSprite = Normal.constructAbstractSprite(js5, StructType.titlebgId);
			final int canvasHeight = Class120_Sub12_Sub5.canvasHeight;
			final int x = 956 * canvasHeight / 503;
			KeyboardHandler.titlebgSprite.method1588((Class69_Sub1.canvasWidth - x) / 2, 0, x, canvasHeight);
			Class120_Sub12_Sub27.logoSprite = Class153.constructAbstractIndexedSprite(js5, ParticleEmitter.logoId);
			Class120_Sub12_Sub27.logoSprite.drawReg(Class69_Sub1.canvasWidth / 2 - (Class120_Sub12_Sub27.logoSprite.width / 2), 18);
			Class101_Sub3.titleScreenSpritesDrawn = true;
		}
	}

	private final void init() {
		int b;
		int c;
		int d;
		int e;
		int f;
		int g;
		int h;
		int a = b = c = d = e = f = g = h = -1640531527;
		for (int id = 0; id < 4; id++) {
			a ^= b << 11;
			d += a;
			b += c;
			b ^= c >>> 2;
			c += d;
			c ^= d << 8;
			e += b;
			d += e;
			d ^= e >>> 16;
			g += d;
			f += c;
			e += f;
			e ^= f << 10;
			f += g;
			f ^= g >>> 4;
			h += e;
			g += h;
			a += f;
			g ^= h << 8;
			b += g;
			h += a;
			h ^= a >>> 9;
			a += b;
			c += h;
		}
		for (int id = 0; id < 256; id += 8) {
			a += rsl[id];
			b += rsl[id + 1];
			c += rsl[id + 2];
			d += rsl[id + 3];
			e += rsl[id + 4];
			f += rsl[id + 5];
			g += rsl[id + 6];
			h += rsl[id + 7];
			a ^= b << 11;
			b += c;
			b ^= c >>> 2;
			e += b;
			d += a;
			c += d;
			c ^= d << 8;
			f += c;
			d += e;
			d ^= e >>> 16;
			g += d;
			e += f;
			e ^= f << 10;
			h += e;
			f += g;
			f ^= g >>> 4;
			g += h;
			g ^= h << 8;
			a += f;
			h += a;
			h ^= a >>> 9;
			b += g;
			a += b;
			c += h;
			mem[id] = a;
			mem[id + 1] = b;
			mem[id + 2] = c;
			mem[id + 3] = d;
			mem[id + 4] = e;
			mem[id + 5] = f;
			mem[id + 6] = g;
			mem[id + 7] = h;
		}
		for (int id = 0; id < 256; id += 8) {
			a += mem[id];
			b += mem[id + 1];
			c += mem[id + 2];
			d += mem[id + 3];
			e += mem[id + 4];
			f += mem[id + 5];
			g += mem[id + 6];
			h += mem[id + 7];
			a ^= b << 11;
			d += a;
			b += c;
			b ^= c >>> 2;
			e += b;
			c += d;
			c ^= d << 8;
			d += e;
			d ^= e >>> 16;
			f += c;
			e += f;
			g += d;
			e ^= f << 10;
			h += e;
			f += g;
			f ^= g >>> 4;
			a += f;
			g += h;
			g ^= h << 8;
			b += g;
			h += a;
			h ^= a >>> 9;
			c += h;
			a += b;
			mem[id] = a;
			mem[id + 1] = b;
			mem[id + 2] = c;
			mem[id + 3] = d;
			mem[id + 4] = e;
			mem[id + 5] = f;
			mem[id + 6] = g;
			mem[id + 7] = h;
		}
		isaac();
		count = 256;
	}

	final int val() {
		if (count-- == 0) {
			isaac();
			count = 255;
		}
		return 0;//rsl[count];
	}

	IsaacCipher(final int[] seed) {
		mem = new int[256];
		rsl = new int[256];
		for (int id = 0; id < seed.length; id++) {
			rsl[id] = seed[id];
		}
		init();
	}

	static final LDSprite constructLDSprite(final js5 js5, final int groupId) {
		if (!ObjType.decodedSprites(js5, groupId)) {
			return null;
		}
		return HintIcon.constructLDSprite();
	}

	static final void method905(final int i_13_) {
		Class54.anIntArray488 = new int[i_13_];
		StringNode.anIntArray2735 = new int[i_13_];
		Class134.anIntArray1284 = new int[i_13_];
		IntegerNode.anIntArray2787 = new int[i_13_];
		AnimatedLocation.anIntArray3075 = new int[i_13_];
	}

	private final void isaac() {
		b += ++c;
		for (int id = 0; id < 256; id++) {
			final int x = mem[id];
			if ((id & 0x3) == 0) {
				a ^= a << 13;
			} else if ((id & 0x3) == 1) {
				a ^= a >>> 6;
			} else if ((id & 0x3) == 2) {
				a ^= a << 2;
			} else if ((id & 0x3) == 3) {
				a ^= a >>> 16;
			}
			a += mem[id + 128 & 0xff];
			int i_16_;
			mem[id] = i_16_ = mem[(x & 0x3fc) >> 2] + a + b;
			rsl[id] = b = mem[(i_16_ >> 8 >> 2) & 0xff] + x;
		}
	}

	static final long toHash(final String string) {
		long hash = 0L;
		for (int charId = 0; charId < string.length(); charId++) {
			hash = string.charAt(charId) + (hash << 5) - hash;
		}
		return hash;
	}
}
