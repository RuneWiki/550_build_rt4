/* Class120_Sub14_Sub21 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class GroundObjectNode extends NodeSub {
	static int renderZ;
	static volatile int currentMouseClick;
	static int anInt3628;
	static int[] anIntArray3629 = { -1, -1, 1, 1 };
	SceneGroundObject aClass180_Sub1_3630;
	static int[] anIntArray3631;

	public static void method1626(int i) {
		try {
			anIntArray3629 = null;
			if (i != 7581)
				method1627(26, -114, 79, -74, -123, -65, -64, -86);
			anIntArray3631 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, "w.C(" + i + ')');
		}
	}

	GroundObjectNode(SceneGroundObject class180_sub1) {
		aClass180_Sub1_3630 = class180_sub1;
	}

	static final void method1627(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_) {
		try {
			if (i_5_ != 4194303)
				method1626(58);
			if (i >= Class32.anInt260 && i_4_ <= Class120_Sub14_Sub11.anInt3544 && Class120_Sub30_Sub2.anInt3699 <= i_6_ && (i_3_ ^ 0xffffffff) >= (Class139.anInt1334 ^ 0xffffffff))
				Class120_Sub2.method1045(i_0_, i_4_, i_6_, i, i_3_, (byte) -57, i_1_, i_2_);
			else
				Class92.method768(i_3_, i_2_, i_1_, i_0_, i, (byte) 105, i_4_, i_6_);
		} catch (RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, ("w.B(" + i + ',' + i_0_ + ',' + i_1_ + ',' + i_2_ + ',' + i_3_ + ',' + i_4_ + ',' + i_5_ + ',' + i_6_ + ')'));
		}
	}

	static final void method1628() {
		Class120_Sub12_Sub11.outputStream.putByteIsaac(156);
		Class120_Sub12_Sub11.outputStream.putShort(Class120_Sub14_Sub20.interfaceCounter);
	}

	static {
		currentMouseClick = 0;
		anIntArray3631 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, 2147483647, -1 };
	}
}
