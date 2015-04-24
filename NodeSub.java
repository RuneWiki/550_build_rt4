/* Class120_Sub14 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

class NodeSub extends Node {
	NodeSub previousSub;
	static float[] aFloatArray2583;
	static short[] aShortArray2584 = new short[256];
	static String aString2585 = "Loaded config";
	long subUid;
	NodeSub nextSub;

	static {
		aFloatArray2583 = new float[4];
	}

	static final int getCrc(final byte[] buffer, final int off, final int len) {
		int crc = -1;
		for (int id = off; id < len; id++) {
			crc = DisplayModeInfo.crcTable[(crc ^ buffer[id]) & 0xff] ^ crc >>> 8;
		}
		crc ^= 0xffffffff;
		return crc;
	}

	final void unlinkSub() {
		if (this.previousSub != null) {
			this.previousSub.nextSub = this.nextSub;
			this.nextSub.previousSub = this.previousSub;
			this.previousSub = null;
			this.nextSub = null;
		}
	}

	final boolean hasPreviousSub() {
		if (this.previousSub == null) {
			return false;
		}
		return true;
	}

	static final void method1411(final int i) {
		final InterfaceChangeNode class120_sub14_sub7 = AbstractObject.putInterfaceChange(2, i);
		class120_sub14_sub7.method1453();
	}

	public NodeSub() {
		/* empty */
	}
}
