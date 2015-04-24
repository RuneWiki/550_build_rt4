/* Class120_Sub15 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class120_Sub15 extends Node {
	static int screenY;
	static int[] anIntArray2591 = { 19, 55, 38, 155, 255, 110, 137, 205, 76 };
	int anInt2592;
	int anInt2593;
	static FrameLoader[] aClass120_Sub14_Sub18Array2595 = new FrameLoader[14];
	static float[] aFloatArray2596;
	static int[] anIntArray2597;
	static float aFloat2598;

	static {
		anIntArray2597 = new int[256];
		aFloatArray2596 = new float[] { 0.073F, 0.169F, 0.24F, 1.0F };
		aFloat2598 = 0.0F;
		screenY = -1;
	}

	static final void clearClickMasks(final int id) {
		for (Node node = JavaObject.clickMaskCache.getFirst(); node != null; node = JavaObject.clickMaskCache.getNext()) {
			if ((0xffffL & node.uid >> 48) == id) {
				node.unlink();
			}
		}
	}

	static final void method1654(final int i, final js5 js5, final int i_3_, final int i_5_, final int i_6_, final boolean bool) {
		Class69.anInt614 = i_3_;
		Class120_Sub14_Sub23.anInt3649 = i_6_;
		MasterIndexInfo.aClass50_476 = js5;
		StringNode.aBoolean2734 = bool;
		SeqType.anInt349 = i;
		Js5Request.anInt3940 = i_5_;
		Class120_Sub12_Sub25.anInt3312 = 1;
	}

	Class120_Sub15(final int i, final int i_7_) {
		this.anInt2593 = i;
		this.anInt2592 = i_7_;
	}
}
