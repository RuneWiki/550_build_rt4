/* Class187 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class187 {
	static js5 aClass50_1907;
	static int anInt1908;
	static HintIcon[] hintIcons = new HintIcon[8];

	static {
		anInt1908 = 0;
	}

	static final Class101_Sub1 method2475(final Buffer buffer) {
		return new Class101_Sub1(buffer.getShort(), buffer.getShort(), buffer.getShort(), buffer.getShort(), buffer.getMedium(), buffer.getMedium(), buffer.getUByte());
	}

	static final AbstractSprite method2477(final PlayerAppearance playerAppearance, final int i, final int i_0_, final int i_2_, final int i_3_, final boolean bool) {
		final int i_4_ = i;
		final int i_5_ = (bool ? 65536 : 0) + i_2_ + (i_0_ << 17) + (i_3_ << 19);
		final long l = 3147483667L * i_4_ + 3849834839L * i_5_;
		AbstractSprite cachedSprite = (AbstractSprite) SpotAnimation.aClass21_2906.get(l);
		if (cachedSprite != null) {
			return cachedSprite;
		}
		Rasterizer.aBoolean974 = false;
		cachedSprite = Class120_Sub12_Sub6.method1224(playerAppearance, i_0_, i, i_3_, i_2_, bool, false, false);
		if (cachedSprite != null && !Rasterizer.aBoolean974) {
			SpotAnimation.aClass21_2906.put(cachedSprite, l);
		}
		return cachedSprite;
	}

	static final void method2478() {
		if (IdentityKit.aClass191ArrayArray1337 != null) {
			final Class191 class191 = new Class191();
			for (int i = 0; i < 13; i++) {
				for (int i_7_ = 0; i_7_ < 13; i_7_++) {
					IdentityKit.aClass191ArrayArray1337[i][i_7_] = class191;
				}
			}
		}
	}

	static final void method2479(final int i) {
		final InterfaceChangeNode class120_sub14_sub7 = AbstractObject.putInterfaceChange(3, i);
		class120_sub14_sub7.method1453();
	}
}
