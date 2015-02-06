/* Class120_Sub14_Sub24 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.zip.CRC32;

final class Class120_Sub14_Sub24 extends NodeSub {
	int anInt3656;
	int anInt3657;
	static CRC32 aCRC32_3658 = new CRC32();
	Class169 aClass169_3659;
	int anInt3660;
	int anInt3661;
	int anInt3662;
	int anInt3663;
	int anInt3664;
	static String aString3665;
	static int anInt3666 = 0;
	int anInt3667;

	static {
		aString3665 = "Loading sprites - ";
	}

	public static void method1646() {
		aString3665 = null;
		aCRC32_3658 = null;
	}

	static final void method1647(final int i_0_, final int i_1_) {
		final InterfaceChangeNode class120_sub14_sub7 = AbstractObject.putInterfaceChange(5, i_0_);
		class120_sub14_sub7.method1454();
		class120_sub14_sub7.anInt3484 = i_1_;
	}

	static final void updateEntityText() {
		for (int id = -1; id < FileSystemWorker.localPlayerCount; id++) {
			int index;
			if (id == -1) {
				index = 2047;
			} else {
				index = Class112.playerIndices[id];
			}
			final Player player = Class118.playersList[index];
			if (player != null && player.textCycle > 0) {
				player.textCycle--;
				if (player.textCycle == 0) {
					player.textSpoken = null;
				}
			}
		}
		for (int id = 0; id < Class148.localNpcCount; id++) {
			final int index = Class120_Sub12_Sub36.localNpcIndices[id];
			final Npc npc = Class120_Sub12_Sub11.npcList[index];
			if (npc != null && npc.textCycle > 0) {
				npc.textCycle--;
				if (npc.textCycle == 0) {
					npc.textSpoken = null;
				}
			}
		}
	}

	static final void addGroundDecoration(final SceneGraphNode sceneGraphNode, final int x, final int y, final int z, final int level, final long bitPackedUid, final boolean bool) {
		if (sceneGraphNode != null) {
			final GroundDecoration groundDecoration = new GroundDecoration();
			groundDecoration.sceneGraphNode = sceneGraphNode;
			groundDecoration.renderX = x * 128 + 64;
			groundDecoration.renderZ = z * 128 + 64;
			groundDecoration.renderY = y;
			groundDecoration.bitPackedUid = bitPackedUid;
			groundDecoration.aBoolean314 = bool;
			if (LabelGroup.groundTiles[level][x][z] == null) {
				LabelGroup.groundTiles[level][x][z] = new GroundTile(level, x, z);
			}
			LabelGroup.groundTiles[level][x][z].groundDecoration = groundDecoration;
		}
	}

	final void method1650(final int i_11_, final int i_12_, final int i_13_) {
		this.anInt3663 = i_11_;
		this.anInt3656 = i_13_;
		this.anInt3657 = i_12_;
	}

	Class120_Sub14_Sub24(final Class169 class169, final ParticleEngine class108_sub2) {
		this.aClass169_3659 = class169;
	}
}
