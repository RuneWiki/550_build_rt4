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

	static final void method2257(final boolean bool) {
		if (bool) {
			LabelGroup.groundTiles = Class120_Sub12_Sub38.aClass120_Sub18ArrayArrayArray3437;
			OverridedJInterface.tileHeightMap = Class24.anIntArrayArrayArray140;
			Canvas_Sub1.aClass120_Sub9ArrayArray17 = IntegerNode.aClass120_Sub9ArrayArray2789;
		} else {
			LabelGroup.groundTiles = Class86.aClass120_Sub18ArrayArrayArray820;
			OverridedJInterface.tileHeightMap = Class120_Sub12_Sub33.anIntArrayArrayArray3388;
			Canvas_Sub1.aClass120_Sub9ArrayArray17 = SceneGroundObject.aClass120_Sub9ArrayArray2844;
		}
		MapSceneType.anInt1361 = LabelGroup.groundTiles.length;
	}

}
