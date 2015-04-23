/* Class120_Sub14_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class ProjectileNode extends NodeSub {
	Projectile projectile;
	static int selectedObjId;
	
	static final void stopInterfaceAnimation(final int id) {
		if (js5.loadInterface(id)) {
			final JagexInterface[] class189s = Node.interfaceCache[id];
			for (final JagexInterface class1892 : class189s) {
				final JagexInterface jagexInterface = class1892;
				if (jagexInterface != null) {
					jagexInterface.nextFrame = 1;
					jagexInterface.currentFrame = 0;
					jagexInterface.frameDelay = 0;
				}
			}
		}
	}

	static final void sortArray(final int[] is, final Object[] objects) {
		Class57.sortArray(is.length - 1, objects, 0, is);
	}

	static final void setGameState(final int state) {
		if (state != Class109.gameState) {
			if (Class109.gameState == 0) {
				Class132_Sub1.loadingTextImage = null;
				Class23.loadingFont = null;
				WaterfallShader.loadingFontMetrics = null;
			}
			final boolean bool = state == 5 || state == 10 || state == 28;
			if (state == 40) {
				LabelGroup.method1037();
			}
			if (state != 40 && Light.aClass46_381 != null) {
				Light.aClass46_381.close();
				Light.aClass46_381 = null;
			}
			if (state == 25 || state == 28) {
				Class120_Sub12_Sub28.anInt3361 = 0;
				Class120_Sub12_Sub37.anInt3431 = 1;
				AbstractBuffer.anInt599 = 0;
				Class145.anInt1379 = 1;
				Class181.anInt1791 = 0;
				Class120_Sub30_Sub1.method1739();
			}
			if (state == 25 || state == 10) {
				Class120_Sub12_Sub14.tbrefresh();
			}
			if (state != 5) {
				Class79_Sub1.resetTitleScreen();
			} else {
				IsaacCipher.drawTitleScreenSprites(Class7.aClass50_63);
			}
			final boolean bool_3_ = Class109.gameState == 5 || Class109.gameState == 10 || Class109.gameState == 28;
			if (bool_3_ == !bool) {
				if (!bool) {
					Class120_Sub12_Sub6.method1230(2);
					Class178.js5Worker.method367(true);
				} else {
					Class157.anInt1466 = AbstractSprite.anInt3620;
					if (RuntimeException_Sub1.anInt2142 != 0) {
						Class120_Sub15.method1654(0, Class120_Sub12_Sub36.aClass50_3419, 2, 255, AbstractSprite.anInt3620, false);
					} else {
						Class120_Sub12_Sub6.method1230(2);
					}
					Class178.js5Worker.method367(false);
				}
			}
			if (HDToolkit.glEnabled && (state == 25 || state == 28 || state == 40)) {
				HDToolkit.method522();
			}
			Class109.gameState = state;
		}
	}

	ProjectileNode(final Projectile projectile) {
		this.projectile = projectile;
	}
}
