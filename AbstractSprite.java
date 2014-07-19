/* Class120_Sub14_Sub19 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class AbstractSprite extends NodeSub {
	int trimWidth;
	int offsetY;
	int offsetX;
	int height;
	static long[] friendsNameAsLong;
	int width;
	static int anInt3619 = -1;
	static int anInt3620;
	int trimHeight;
	static boolean aBoolean3622;

	static {
		friendsNameAsLong = new long[200];
		aBoolean3622 = false;
	}

	abstract void method1585(int i, int i_0_, int i_1_, int i_2_, int i_3_);

	public static void method1586(final int i) {
		try {
			friendsNameAsLong = null;
			if (i != 16) {
				method1586(52);
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("uj.MA(").append(i).append(')').toString());
		}
	}

	abstract void method1587(int i, int i_4_);

	abstract void method1588(int i, int i_5_, int i_6_, int i_7_);

	abstract void method1589(int i, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_);

	final void method1590(int i, final byte i_13_, final int i_14_, int i_15_, final int i_16_) {
		try {
			final int i_17_ = this.trimWidth << 3;
			i_15_ = (i_17_ & 0xf) + (i_15_ << 4);
			final int i_18_ = this.trimHeight << 3;
			i = (i_18_ & 0xf) + (i << 4);
			if (i_13_ != -99) {
				this.trimWidth = -99;
			}
			method1589(i_17_, i_18_, i_15_, i, i_14_, i_16_);
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("uj.OA(").append(i).append(',').append(i_13_).append(',').append(i_14_).append(',').append(i_15_).append(',').append(i_16_).append(')').toString());
		}
	}

	abstract void method1591(int i, int i_19_);

	abstract void method1592(int i, int i_20_);

	public AbstractSprite() {
		/* empty */
	}

	static final void method1593(boolean bool, final int i_21_, final int i_22_, final int i_23_) {
		boolean bool_24_ = false;
		Class15.aLong98 = 0L;
		final int i_25_ = Class120_Sub12_Sub4.getDisplayMode();
		if (i_25_ > 0 == i_21_ <= 0) {
			bool_24_ = true;
		}
		if (i_21_ == 3 || i_25_ == 3) {
			bool = true;
		}
		if (Signlink.osName.startsWith("mac") && i_21_ > 0) {
			bool = true;
		}
		if (bool && i_21_ > 0) {
			bool_24_ = true;
		}
		AbstractIndexedSprite.method908(i_22_, i_25_, bool, i_23_, i_21_, bool_24_);
	}

	abstract void method1594(int i, int i_26_, int i_27_);
}
