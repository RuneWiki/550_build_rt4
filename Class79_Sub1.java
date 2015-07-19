/* Class79_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class79_Sub1 {
	static String[] stringArguments;
	static int anInt2244;
	static js5 animsBasesJs5;
	static int[] anIntArray2246 = new int[256];
	static String[] friendsSideText;

	static {
		anInt2244 = 0;
		friendsSideText = new String[200];
	}

	static final void resetTitleScreen() {
		if (Class101_Sub3.titleScreenSpritesDrawn) {
			Class101_Sub3.titleScreenSpritesDrawn = false;
			KeyboardHandler.titlebgSprite = null;
			Class120_Sub12_Sub27.logoSprite = null;
		}
	}

	static final long getGroundDecorationUid(final int x, final int z, final int level) {
		final GroundTile groundTile = LabelGroup.activeGroundTiles[level][x][z];
		if (groundTile == null || groundTile.groundDecoration == null) {
			return 0L;
		}
		return groundTile.groundDecoration.bitPackedUid;
	}
}
