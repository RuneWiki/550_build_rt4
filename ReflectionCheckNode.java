/* Class120_Sub28 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class ReflectionCheckNode extends Node {
	byte[][][] methodsArgumentData;
	static int anInt2751 = 0;
	int[] fieldsValue;
	int count;
	static ClanMember[] clanMembers;
	SignlinkNode[] fieldsInformationNode;
	int[] checkTypes;
	int uid;
	static int leftMargin;
	static String[] aStringArray2759 = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
	SignlinkNode[] methodsInformationNode;
	static int[] anIntArray2761;
	static int anInt2762;
	int[] errorTypes;

	static {
		leftMargin = 0;
		anInt2762 = 0;
		anIntArray2761 = new int[14];
	}

	static final void refreshLocationNpcAmbientSounds() {
		for (AmbientSound ambientSound = (AmbientSound) Class101_Sub1.locationAmbientSounds.getFront(); ambientSound != null; ambientSound = (AmbientSound) Class101_Sub1.locationAmbientSounds.getNext()) {
			if (ambientSound.hasVarp) {
				ambientSound.refresh();
			}
		}
		for (AmbientSound ambientSound = (AmbientSound) Class120_Sub12_Sub10.npcAmbientSounds.getFront(); ambientSound != null; ambientSound = (AmbientSound) Class120_Sub12_Sub10.npcAmbientSounds.getNext()) {
			if (ambientSound.hasVarp) {
				ambientSound.refresh();
			}
		}
	}

	public ReflectionCheckNode() {
		/* empty */
	}
}
