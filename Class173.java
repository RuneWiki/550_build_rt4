/* Class173 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class173 {
	static boolean[] aBooleanArray1723;
	static int anInt1724;
	static AbstractSprite aClass120_Sub14_Sub19_1725;
	static int worldMapPointerWidth;
	static int hintmapmarkersId;
	static int gameLevel;
	static int[] anIntArray1730;

	static {
		aBooleanArray1723 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };
		anIntArray1730 = new int[4];
		anInt1724 = 0;
	}

	static final void method2225() {
		if (Class86.surfaceGroundTiles != null) {
			for (int i = 0; i < Class86.surfaceGroundTiles.length; i++) {
				for (int i_0_ = 0; i_0_ < WallDecoration.anInt1900; i_0_++) {
					for (int i_1_ = 0; i_1_ < Class120_Sub12_Sub38.anInt3440; i_1_++) {
						Class86.surfaceGroundTiles[i][i_0_][i_1_] = null;
					}
				}
			}
		}
		SceneGroundObject.surfaceHdTiles = null;
		if (Class120_Sub12_Sub38.underWaterGroundTiles != null) {
			for (int i = 0; i < Class120_Sub12_Sub38.underWaterGroundTiles.length; i++) {
				for (int i_2_ = 0; i_2_ < WallDecoration.anInt1900; i_2_++) {
					for (int i_3_ = 0; i_3_ < Class120_Sub12_Sub38.anInt3440; i_3_++) {
						Class120_Sub12_Sub38.underWaterGroundTiles[i][i_2_][i_3_] = null;
					}
				}
			}
		}
		IntegerNode.underWaterHdTiles = null;
		Class49.anInt438 = 0;
		if (SceneGraphNode.aClass188Array1782 != null) {
			for (int i = 0; i < Class49.anInt438; i++) {
				SceneGraphNode.aClass188Array1782[i] = null;
			}
		}
		if (Class111.aClass28Array1057 != null) {
			for (int i = 0; i < ClientScript.anInt3556; i++) {
				Class111.aClass28Array1057[i] = null;
			}
			ClientScript.anInt3556 = 0;
		}
		if (client.aClass28Array323 != null) {
			for (int i = 0; i < client.aClass28Array323.length; i++) {
				client.aClass28Array323[i] = null;
			}
		}
	}

}
