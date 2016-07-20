/* Class120_Sub14_Sub21 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class GroundObjectNode extends NodeSub {
	static int renderZ;
	static volatile int currentMouseClick;
	static int worldMapPointerHeight;
	static int[] anIntArray3629 = { -1, -1, 1, 1 };
	SceneGroundObject sceneGroundObject;
	static int[] bitMasks;

	GroundObjectNode(SceneGroundObject groundObject) {
		sceneGroundObject = groundObject;
	}

	static final void method1627(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_6_) {
		if (i >= MagnetType.anInt260 && i_4_ <= ParamType.anInt3544 && Class120_Sub30_Sub2.anInt3699 <= i_6_ && (i_3_ ^ 0xffffffff) >= (Identikit.anInt1334 ^ 0xffffffff))
			Class120_Sub2.method1045(i_0_, i_4_, i_6_, i, i_3_, i_1_, i_2_);
		else
			Class92.method768(i_3_, i_2_, i_1_, i_0_, i, i_4_, i_6_);
	}

	static final void transmitVerifyId() {
		Class120_Sub12_Sub11.outputStream.putByteIsaac(156);
		Class120_Sub12_Sub11.outputStream.putShort(OverlayFrequencyNode.triggerId);
	}

	static {
		currentMouseClick = 0;
		bitMasks = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, 2147483647, -1 };
	}
}
