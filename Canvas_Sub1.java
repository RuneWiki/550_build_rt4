/* Canvas_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Canvas_Sub1 {
	static Cache aClass21_14 = new Cache(64);
	static Hashtable aClass75_15 = new Hashtable(32);
	static PacketBuffer inputStream = new PacketBuffer(5000);
	static Class120_Sub9[][] aClass120_Sub9ArrayArray17;

	public static void method61(final byte i) {
		try {
			inputStream = null;
			aClass21_14 = null;
			aClass120_Sub9ArrayArray17 = null;
			aClass75_15 = null;
			if (i != 25) {
				aClass21_14 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("nj.C(").append(i).append(')').toString());
		}
	}

	static final int method62(final int i, final int i_0_, final int i_1_) {
		int i_2_;
		try {
			if (i_0_ != 20244) {
				showVideoAd();
			}
			final int i_3_ = i_1_ >>> 31;
			i_2_ = (i_3_ + i_1_) / i + -i_3_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("nj.B(").append(i).append(',').append(i_0_).append(',').append(i_1_).append(')').toString());
		}
		return i_2_;
	}

	static final boolean showVideoAd() {
		if (Class48.jsEnabled) {
			boolean bool_4_ = false;
			try {
				Class77.method666(NpcType.gameSignlink.gameApplet, "showVideoAd");
				bool_4_ = true;
			} catch (final Throwable throwable) {
				/* empty */
			}
			return bool_4_;
		}
		return false;
	}

	static final void method64(final int i, final int i_5_) {
		try {
			Class69_Sub2.anInt2233 = i_5_;
			Class120_Sub12_Sub31.method1364(false, i);
			Class120_Sub12_Sub31.method1364(false, 4);
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("nj.A(").append(i).append(',').append(i_5_).append(')').toString());
		}
	}
}
