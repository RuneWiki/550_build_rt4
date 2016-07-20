/* Class53 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class53 {
	static int[] anIntArray485 = { 1, 2, 4, 8 };
	static String[] suffixTitles;
	static int maxTileX;

	static final void gatherOriginalLocationInfo(final CustomLocation customLocation) {
		long bitPacked = 0L;
		int rotation = 0;
		int type = 0;
		int id = -1;
		if (customLocation.clientType == 0) {
			bitPacked = Class114.getWallLocationUid(customLocation.x, customLocation.z, customLocation.level);
		}
		if (customLocation.clientType == 1) {
			bitPacked = JagexInterface.getWallDecorationUid(customLocation.x, customLocation.z, customLocation.level);
		}
		if (customLocation.clientType == 2) {
			bitPacked = Class120_Sub11.method1173(customLocation.x, customLocation.z, customLocation.level);
		}
		if (customLocation.clientType == 3) {
			bitPacked = Class79_Sub1.getGroundDecorationUid(customLocation.x, customLocation.z, customLocation.level);
		}
		if (bitPacked != 0L) {
			rotation = (int) bitPacked >> 20 & 0x3;
			type = (0x7fc95 & (int) bitPacked) >> 14;
			id = (int) (bitPacked >>> 32) & 0x7fffffff;
		}
		customLocation.originalLocRotation = rotation;
		customLocation.originalLocType = type;
		customLocation.originalLocId = id;
	}

	abstract int getCompletion(int i);

	abstract void method459(int id);

	abstract byte[] method460(int i_5_);

	static final LDFont constructLDFont(final byte[] data) {
		if (data == null) {
			return null;
		}
		final LDFont ldFont = new LDFont(data, Projectile.spriteXOffsets, GroundTile.spriteYOffsets, Class120_Sub12_Sub11.spriteWidths, Class120_Sub12_Sub39.spriteHeights, SkyboxType.spritePaletteIndicators);
		Class53_Sub1.resetSpriteInfo();
		return ldFont;
	}

	public Class53() {
		/* empty */
	}

	abstract MasterIndexInfo method462();
}
