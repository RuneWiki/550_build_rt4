/* Canvas_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Canvas_Sub1 {
	static ObjectCache aClass21_14 = new ObjectCache(64);
	static PacketBuffer inputStream = new PacketBuffer(5000);
	static Class120_Sub9[][] aClass120_Sub9ArrayArray17;

	public static void method61(final byte i) {
		try {
			inputStream = null;
			aClass21_14 = null;
			aClass120_Sub9ArrayArray17 = null;
			ObjectContainer.objectContainerCache = null;
			if (i != 25) {
				aClass21_14 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("nj.C(").append(i).append(')').toString());
		}
	}

	static final int method62(final int i, final int i_1_) {
		final int i_3_ = i_1_ >>> 31;
		return (i_3_ + i_1_) / i - i_3_;
	}

	static final boolean showVideoAd() {
		if (Class48.jsEnabled) {
			boolean adCalled = false;
			try {
				JSHelper.call(NpcType.gameSignlink.gameApplet, "showVideoAd");
				adCalled = true;
			} catch (final Throwable throwable) {
				/* empty */
			}
			return adCalled;
		}
		return false;
	}

	static final void method64(final int i, final int i_5_) {
		try {
			Class69_Sub2.anInt2233 = i_5_;
			Class120_Sub12_Sub31.method1364(false, i);
			Class120_Sub12_Sub31.method1364(false, 4);
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("nj.A(").append(i).append(',').append(i_5_).append(')').toString());
		}
	}
}
