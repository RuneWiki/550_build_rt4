/* Class120_Sub18 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class GroundTile extends Node {
	byte particleCycle;
	boolean aBoolean2624;
	Class28[] aClass28Array2625 = new Class28[5];
	PlainTile plainTile;
	static int worldMapLookAtY;
	WallLocation wallLocation;
	int anInt2629;
	static SignlinkNode js5ConnectionNode;
	boolean aBoolean2631;
	int anInt2632;
	int anInt2633;
	ObjectPile objectPile;
	int anInt2635;
	int anInt2636;
	int anInt2637;
	int anInt2638;
	WallDecoration wallDecoration;
	ShapedTile shapedTile;
	int[] anIntArray2641 = new int[5];
	int anInt2642;
	static Hashtable globalMagnets = new Hashtable(16);
	GroundTile aClass120_Sub18_2644;
	TileParticleQueue tileParticle;
	int anInt2646;
	boolean aBoolean2647;
	int anInt2648;
	static SeqType[] aClass40Array2649 = new SeqType[14];
	GroundDecoration groundDecoration;
	static int[] spriteYOffsets;
	static int selectedSpellUseMask;

	GroundTile(final int i, final int i_1_, final int i_2_) {
		this.anInt2635 = 0;
		this.anInt2642 = this.anInt2636 = i;
		this.anInt2632 = i_1_;
		this.anInt2629 = i_2_;
	}

	static final void method1668(final SceneGraphNode sceneGraphNode, final int i, final int i_3_, final int i_4_) {
		if (i_3_ < WallDecoration.anInt1900) {
			final GroundTile class120_sub18 = LabelGroup.activeGroundTiles[i][i_3_ + 1][i_4_];
			if (class120_sub18 != null && class120_sub18.groundDecoration != null && class120_sub18.groundDecoration.sceneGraphNode.method2268()) {
				sceneGraphNode.method2267(class120_sub18.groundDecoration.sceneGraphNode, 128, 0, 0, true);
			}
		}
		if (i_4_ < WallDecoration.anInt1900) {
			final GroundTile class120_sub18 = LabelGroup.activeGroundTiles[i][i_3_][i_4_ + 1];
			if (class120_sub18 != null && class120_sub18.groundDecoration != null && class120_sub18.groundDecoration.sceneGraphNode.method2268()) {
				sceneGraphNode.method2267(class120_sub18.groundDecoration.sceneGraphNode, 0, 0, 128, true);
			}
		}
		if (i_3_ < WallDecoration.anInt1900 && i_4_ < Class120_Sub12_Sub38.anInt3440) {
			final GroundTile class120_sub18 = LabelGroup.activeGroundTiles[i][i_3_ + 1][i_4_ + 1];
			if (class120_sub18 != null && class120_sub18.groundDecoration != null && class120_sub18.groundDecoration.sceneGraphNode.method2268()) {
				sceneGraphNode.method2267(class120_sub18.groundDecoration.sceneGraphNode, 128, 0, 128, true);
			}
		}
		if (i_3_ < WallDecoration.anInt1900 && i_4_ > 0) {
			final GroundTile class120_sub18 = LabelGroup.activeGroundTiles[i][i_3_ + 1][i_4_ - 1];
			if (class120_sub18 != null && class120_sub18.groundDecoration != null && class120_sub18.groundDecoration.sceneGraphNode.method2268()) {
				sceneGraphNode.method2267(class120_sub18.groundDecoration.sceneGraphNode, 128, 0, -128, true);
			}
		}
	}

	static final int method1670(final int i) {
		final int i_10_ = (i * i >> 12) * i >> 12;
		final int i_11_ = -61440 + i * 6;
		final int i_12_ = (i * i_11_ >> 12) + 40960;
		return i_10_ * i_12_ >> 12;
	}

}
