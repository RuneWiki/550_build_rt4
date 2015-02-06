/* Class99 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class99 {
	static byte[][][] aByteArrayArrayArray949;
	static boolean aBoolean950;
	static int anInt951;
	static String aString952 = "wave2:";
	static boolean openwinjsEnabled;
	static int anInt954;

	static final Class182 method821(final int x, final int z, final int level) {
		final GroundTile class120_sub18 = LabelGroup.groundTiles[level][x][z];
		if (class120_sub18 == null) {
			return null;
		}
		final Class182 class182 = class120_sub18.aClass182_2628;
		class120_sub18.aClass182_2628 = null;
		return class182;
	}

	static final void method822(final int i) {
		AtmosphereManager.setLightParams(AtmosphereManager.defaultScreenColorRgb, (i * 0.1F + 0.7F) * 1.1523438F, 0.69921875F, 0.69921875F);
		AtmosphereManager.setLightPosition(-50.0F, -60.0F, -50.0F);
		AtmosphereManager.setFogValues(AtmosphereManager.defaulFogColorRgb, 0, false);
		AtmosphereManager.applyLightPosition();
	}

	public static void method823() {
		aByteArrayArrayArray949 = null;
		aString952 = null;
	}
}
