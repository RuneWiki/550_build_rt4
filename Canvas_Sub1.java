/* Canvas_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Canvas_Sub1 {
	static PacketBuffer inputStream = new PacketBuffer(5000);
	static Class120_Sub9[][] aClass120_Sub9ArrayArray17;

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

	static final void method64(final int i_5_) {
		Class69_Sub2.anInt2233 = i_5_;
		Class120_Sub12_Sub31.method1364(3);
		Class120_Sub12_Sub31.method1364(4);
	}
}
