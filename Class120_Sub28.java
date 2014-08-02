/* Class120_Sub28 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class120_Sub28 extends Node {
	byte[][][] aByteArrayArrayArray2750;
	static int anInt2751 = 0;
	int[] anIntArray2752;
	int anInt2753;
	static ClanMember[] clanMembers;
	SignlinkNode[] aClass185Array2755;
	int[] anIntArray2756;
	int anInt2757;
	static int leftMargin;
	static String[] aStringArray2759 = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
	SignlinkNode[] aClass185Array2760;
	static int[] anIntArray2761;
	static int anInt2762;
	int[] anIntArray2763;

	static {
		leftMargin = 0;
		anInt2762 = 0;
		anIntArray2761 = new int[14];
	}

	public static void method1724() {
		aStringArray2759 = null;
		clanMembers = null;
		anIntArray2761 = null;
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

	public Class120_Sub28() {
		/* empty */
	}
}
