/* Class181 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class181 {
	static NodeCache aClass35_1784 = new NodeCache(16);
	static int currentBaseZ;
	int anInt1786;
	int anInt1787 = 2048;
	int anInt1788;
	int anInt1789 = 2048;
	static int[] anIntArray1790 = new int[5];
	static int anInt1791 = 0;

	public static void method2438(final int i) {
		try {
			aClass35_1784 = null;
			if (i != 0) {
				anIntArray1790 = null;
			}
			anIntArray1790 = null;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("vd.A(").append(i).append(')').toString());
		}
	}

	static final String method2439() {
		String host = "www";
		if (AbstractIndexedSprite.modeWhere != 0) {
			host = "www-wtqa";
		}
		String settings = "";
		if (Class120_Sub12_Sub25.settings != null) {
			settings = new StringBuilder("/p=").append(Class120_Sub12_Sub25.settings).toString();
		}
		return "http://" + host + ".runescape.com/l=" + Class9.language + "/a=" + Class120_Sub12_Sub33.affiliateId + settings + "/";
	}

	private final void method2440(final int i, final int i_2_, final Buffer class120_sub7, final byte i_3_) {
		try {
			if (i_2_ != 1) {
				if (i_2_ == 2) {
					this.anInt1787 = class120_sub7.getUShort();
				} else if (i_2_ != 3) {
					if (i_2_ == 4) {
						this.anInt1786 = class120_sub7.getShort();
					}
				} else {
					this.anInt1789 = class120_sub7.getUShort();
				}
			} else {
				this.anInt1788 = class120_sub7.getUByte();
			}
			if (i_3_ != -12) {
				this.anInt1788 = 63;
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("vd.C(").append(i).append(',').append(i_2_).append(',').append(class120_sub7 != null ? "{...}" : "null").append(',').append(i_3_).append(')').toString());
		}
	}

	final void method2441(final boolean bool, final Buffer class120_sub7, final int i) {
		try {
			for (;;) {
				final int i_4_ = class120_sub7.getUByte();
				if (i_4_ == 0) {
					break;
				}
				method2440(i, i_4_, class120_sub7, (byte) -12);
			}
			if (!bool) {
				method2438(-34);
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("vd.D(").append(bool).append(',').append(class120_sub7 != null ? "{...}" : "null").append(',').append(i).append(')').toString());
		}
	}

	public Class181() {
		this.anInt1786 = 0;
		this.anInt1788 = 0;
	}
}
