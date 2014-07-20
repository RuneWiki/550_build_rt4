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

	final void method1590(int i, final int i_14_, int i_15_, final int i_16_) {
		final int i_17_ = this.trimWidth << 3;
		i_15_ = (i_17_ & 0xf) + (i_15_ << 4);
		final int i_18_ = this.trimHeight << 3;
		i = (i_18_ & 0xf) + (i << 4);
		method1589(i_17_, i_18_, i_15_, i, i_14_, i_16_);
	}

	abstract void method1591(int i, int i_19_);

	abstract void method1592(int i, int i_20_);

	public AbstractSprite() {
		/* empty */
	}

	static final void method1593(final int newDisplayMode, final int width, final int height, boolean canvasReplaceRecommended) {
		boolean bool_24_ = false;
		Class15.aLong98 = 0L;
		final int currentDisplayMode = Class120_Sub12_Sub4.getDisplayMode();
		System.out.println("currentDisplayMode is "+currentDisplayMode+", wanted "+newDisplayMode);
		if (currentDisplayMode > 0 == newDisplayMode <= 0) {
			bool_24_ = true;
		}
		if (newDisplayMode == 3 || currentDisplayMode == 3) {
			canvasReplaceRecommended = true;
		}
		if (Signlink.osName.startsWith("mac") && newDisplayMode > 0) {
			canvasReplaceRecommended = true;
		}
		if (canvasReplaceRecommended && newDisplayMode > 0) {
			bool_24_ = true;
		}
		AbstractIndexedSprite.method908(newDisplayMode, width, height, currentDisplayMode, canvasReplaceRecommended, bool_24_);
	}

	abstract void method1594(int i, int i_26_, int i_27_);
}
