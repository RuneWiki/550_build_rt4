/* Class65 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class65 {
	static int flagY;
	static int pingTimer = 0;
	static int[][] cs2ArrayData = new int[5][5000];
	static DisplayModeInfo[] displayModes;
	static int loadAttempts;
	static js5 mapsJs5;

	static {
		flagY = 0;
		loadAttempts = 0;
	}
	
	static final void setHDTiles(final int level, final HDTile[] hdTiles) {
		Canvas_Sub1.activeHdTiles[level] = hdTiles;
	}
}
