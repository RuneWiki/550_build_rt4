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

	public static void method1724(final int i) {
		try {
			aStringArray2759 = null;
			clanMembers = null;
			if (i != 0) {
				method1724(19);
			}
			anIntArray2761 = null;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("sj.A(").append(i).append(')').toString());
		}
	}

	static final void method1725(final boolean bool) {
		try {
			for (AmbientSound class120_sub8 = (AmbientSound) Class101_Sub1.locationAmbientSounds.getFront(); class120_sub8 != null; class120_sub8 = (AmbientSound) Class101_Sub1.locationAmbientSounds.getNext()) {
				if (class120_sub8.aBoolean2491) {
					class120_sub8.method1156();
				}
			}
			if (bool) {
				aStringArray2759 = null;
			}
			for (AmbientSound class120_sub8 = (AmbientSound) Class120_Sub12_Sub10.npcAmbientSounds.getFront(); class120_sub8 != null; class120_sub8 = (AmbientSound) Class120_Sub12_Sub10.npcAmbientSounds.getNext()) {
				if (class120_sub8.aBoolean2491) {
					class120_sub8.method1156();
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("sj.B(").append(bool).append(')').toString());
		}
	}

	public Class120_Sub28() {
		/* empty */
	}
}
