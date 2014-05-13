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

	static final int getCrc(final byte[] is, final int i_1_, final int i) {
		int i_3_ = -1;
		for (int i_4_ = i_1_; i_4_ < i; i_4_++) {
			i_3_ = DisplayModeInfo.anIntArray1707[(i_3_ ^ is[i_4_]) & 0xff] ^ i_3_ >>> 8;
		}
		i_3_ ^= 0xffffffff;
		return i_3_;
	}

	final void unlinkSub() {
		if (this.previousSub != null) {
			this.previousSub.nextSub = this.nextSub;
			this.nextSub.previousSub = this.previousSub;
			this.previousSub = null;
			this.nextSub = null;
		}
	}

	public static void method1409(final int i) {
		try {
			aShortArray2584 = null;
			aFloatArray2583 = null;
			aString2585 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("lh.HA(").append(i).append(')').toString());
		}
	}

	final boolean hasPreviousSub() {
		if (this.previousSub == null) {
			return false;
		}
		return true;
	}

	static final void method1411(final int i, final boolean bool) {
		try {
			if (bool) {
				aString2585 = null;
			}
			final InterfaceChangeNode class120_sub14_sub7 = AbstractObject.putInterfaceChange(2, i);
			class120_sub14_sub7.method1453((byte) -104);
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("lh.IA(").append(i).append(',').append(bool).append(')').toString());
		}
	}

	public NodeSub() {
		/* empty */
	}
}
