/* Class108 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class Class108 {
	static int anInt1031 = 0;
	Class108 next;
	Class108 previous;
	static float aFloat1034;
	static int anInt1035;

	final void unlink() {
		if (this.previous != null) {
			this.previous.next = this.next;
			this.next.previous = this.previous;
			this.previous = null;
			this.next = null;
		}
	}

	static final void method930(final byte i, final int i_0_, final int i_1_, final int i_2_) {
		try {
			final String string = new StringBuilder("::tele ").append(i_2_).append(",").append(i_0_ >> 6).append(",").append(i_1_ >> 6).append(",").append(i_0_ & 0x3f).append(",").append(i_1_ & 0x3f).toString();
			if (i != -120) {
				method932(true, -59, -54, -1, -83);
			}
			System.out.println(string);
			Class120_Sub12_Sub20.method1301((byte) 95, string);
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("mb.B(").append(i).append(',').append(i_0_).append(',').append(i_1_).append(',').append(i_2_).append(')').toString());
		}
	}

	static final void method931(final Class50 class50, final int i) {
		try {
			Class32.anInt270 = class50.method432(false, "p11_full");
			Class191.anInt2115 = class50.method432(false, "p12_full");
			Class110.anInt1051 = class50.method432(false, "b12_full");
			Class120_Sub8.anInt2490 = class50.method432(false, "hitmarks");
			Class120_Sub12_Sub25.anInt3315 = class50.method432(false, "hitbar_default");
			Class120_Sub14_Sub15.anInt3583 = class50.method432(false, "headicons_pk");
			Class52.anInt477 = class50.method432(false, "headicons_prayer");
			Class120_Sub21.anInt2664 = class50.method432(false, "hint_headicons");
			Class173.anInt1727 = class50.method432(false, "hint_mapmarkers");
			if (i <= 55) {
				method931(null, -106);
			}
			Class169.anInt1644 = class50.method432(false, "mapflag");
			Class132_Sub2.anInt2823 = class50.method432(false, "cross");
			Class73.anInt665 = class50.method432(false, "mapdots");
			Class134.anInt1278 = class50.method432(false, "scrollbar");
			Class81.anInt778 = class50.method432(false, "name_icons");
			Class120_Sub12_Sub7.anInt3180 = class50.method432(false, "floorshadows");
			Class9.anInt71 = class50.method432(false, "compass");
			PlayerAppearance.anInt1364 = class50.method432(false, "hint_mapedge");
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("mb.D(").append(class50 != null ? "{...}" : "null").append(',').append(i).append(')').toString());
		}
	}

	static final void method932(final boolean bool, final int i, final int i_3_, final int i_4_, final int i_5_) {
		try {
			Class120_Sub30_Sub1.method1739(false, (byte) -93);
			Class46.aBoolean423 = bool;
			Class120_Sub12_Sub33.anInt3407 = i_3_;
			if (i_5_ != 27712) {
				method932(false, -77, -74, -1, -82);
			}
			Class86.anInt818 = i;
			Class79.method684(i_4_);
			Class86.aClass75_823 = new Class75(8);
			Class81.aClass75_777 = new Class75(8);
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("mb.C(").append(bool).append(',').append(i).append(',').append(i_3_).append(',').append(i_4_).append(',').append(i_5_).append(')').toString());
		}
	}

	public Class108() {
		/* empty */
	}
}
