/* Class178 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class178 {
	static int anInt1771;
	static Js5Worker js5Worker;

	static final int method2256(final int i, int i_0_) {
		if (i == -1) {
			return 12345678;
		}
		i_0_ = (i & 0x7f) * i_0_ >> 7;
		if (i_0_ >= 2) {
			if (i_0_ > 126) {
				i_0_ = 126;
			}
		} else {
			i_0_ = 2;
		}
		return i_0_ + (i & 0xff80);
	}

	static final void setRenderTiles(final boolean underWater) {
		if (underWater) {
			SeqFrameBase.activeGroundTiles = Class120_Sub12_Sub38.underWaterGroundTiles;
			SubInterface.activeTileHeightMap = Class24.underWaterTileHeightMap;
			Canvas_Sub1.activeHdTiles = IntegerNode.underWaterHdTiles;
		} else {
			SeqFrameBase.activeGroundTiles = Class86.surfaceGroundTiles;
			SubInterface.activeTileHeightMap = Class120_Sub12_Sub33.surfaceTileHeightMap;
			Canvas_Sub1.activeHdTiles = SceneGroundObject.surfaceHdTiles;
		}
		MapSceneType.activeGroundTileLength = SeqFrameBase.activeGroundTiles.length;
	}

}
