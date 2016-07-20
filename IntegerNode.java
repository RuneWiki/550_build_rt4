/* Class120_Sub32 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class IntegerNode extends Node {
	static int[] anIntArray2787;
	static HDTile[][] underWaterHdTiles;
	int value;
	static int[] anIntArray2791 = { 160, 192, 80, 96, 0, 144, 80, 48, 160 };
	static long killtime;

	static {
		anIntArray2787 = new int[2];
		killtime = 0L;
	}

	static final boolean handleClientCode(final JagexInterface jagexInterface) {
		if (jagexInterface.clientCode == 205) {
			Class31.logoutCycle = 250;
			return true;
		}
		return false;
	}

	public IntegerNode() {
		/* empty */
	}

	IntegerNode(final int i) {
		this.value = i;
	}
}
