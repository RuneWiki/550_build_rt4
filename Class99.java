/* Class99 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class99 {
	static byte[][][] tileOverlayIds;
	static boolean openUrlNewTab;
	static int anInt951;
	static boolean openwinjsEnabled;
	static int anInt954;

	static final WallLocation removeWallLocation(final int x, final int z, final int level) {
		final GroundTile groundTile = SeqFrameBase.activeGroundTiles[level][x][z];
		if (groundTile == null) {
			return null;
		}
		final WallLocation wallLocation = groundTile.wallLocation;
		groundTile.wallLocation = null;
		return wallLocation;
	}

	static final void method822(final int i) {
		AtmosphereManager.setLightParams(AtmosphereManager.defaultLightColorRgb, (i * 0.1F + 0.7F) * 1.1523438F, 0.69921875F, 0.69921875F);
		AtmosphereManager.setLightPosition(-50.0F, -60.0F, -50.0F);
		AtmosphereManager.setFogParams(AtmosphereManager.defaulFogColorRgb, 0, false);
		AtmosphereManager.applyLightPosition();
	}

}
