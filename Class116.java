/* Class116 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class116 {
	static int anInt1113 = 0;
	static AbstractSprite aClass120_Sub14_Sub19_1114;
	static int anInt1115;
	static String aString1116 = "Connection lost.";
	static Class21 aClass21_1117 = new Class21(50);
	static int anInt1118;
	static int[][] anIntArrayArray1119 = { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 },
			{ 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 },
			{ 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

	static final void method1009(final byte i) {
		try {
			if (!(Class79.aFloat696 < Class79.aFloat698)) {
				if (Class79.aFloat696 > Class79.aFloat698) {
					Class79.aFloat696 -= Class79.aFloat696 / 30.0;
					if (Class79.aFloat696 < Class79.aFloat698) {
						Class79.aFloat696 = Class79.aFloat698;
					}
					Class127.method1889((byte) 65);
				}
			} else {
				Class79.aFloat696 += Class79.aFloat696 / 30.0;
				if (Class79.aFloat698 < Class79.aFloat696) {
					Class79.aFloat696 = Class79.aFloat698;
				}
				Class127.method1889((byte) 65);
			}
			if ((CanvasWrapper.anInt20 ^ 0xffffffff) != 0 && Class120_Sub2.anInt2422 != -1) {
				int i_0_ = -Class169.anInt1646 + Class120_Sub2.anInt2422;
				int i_1_ = -Class108_Sub1.anInt2336 + CanvasWrapper.anInt20;
				if (i_0_ < 2 || i_0_ > 2) {
					i_0_ >>= 4;
				}
				Class169.anInt1646 -= -i_0_;
				if (i_1_ < 2 || i_1_ > 2) {
					i_1_ >>= 4;
				}
				if (i_1_ == 0 && i_0_ == 0) {
					Class120_Sub2.anInt2422 = -1;
					CanvasWrapper.anInt20 = -1;
				}
				Class108_Sub1.anInt2336 += i_1_;
				Class127.method1889((byte) 84);
			}
			if (Class96.anInt919 > 0) {
				Class136.anInt1321--;
				if (Class136.anInt1321 == 0) {
					Class96.anInt919--;
					Class136.anInt1321 = 100;
				}
			} else {
				Class127.anInt1215 = -1;
				Class120_Sub12_Sub9.anInt3195 = -1;
			}
			if (Class80.aBoolean742 && Class73.aClass105_653 != null) {
				for (Class120_Sub16 class120_sub16 = (Class120_Sub16) Class73.aClass105_653.method893(1253231568); class120_sub16 != null; class120_sub16 = (Class120_Sub16) Class73.aClass105_653.method899(9)) {
					final Class73 class73 = Class92.method769(true, class120_sub16.aClass120_Sub14_Sub5_2611.anInt3473);
					if (Class120_Sub14_Sub2.anInt3450 != 0 || !class120_sub16.method1656(Queue.anInt1767, -108, Class191.anInt2113)) {
						if (class120_sub16.aClass120_Sub14_Sub5_2611.aBoolean3472) {
							class120_sub16.aClass120_Sub14_Sub5_2611.aBoolean3472 = false;
							Class112.method989(16, class120_sub16.aClass120_Sub14_Sub5_2611.anInt3473, -30073, class73.anInt652);
						}
					} else {
						if (!class120_sub16.aClass120_Sub14_Sub5_2611.aBoolean3472) {
							class120_sub16.aClass120_Sub14_Sub5_2611.aBoolean3472 = true;
							Class112.method989(15, class120_sub16.aClass120_Sub14_Sub5_2611.anInt3473, -30073, class73.anInt652);
						}
						if (class120_sub16.aClass120_Sub14_Sub5_2611.aBoolean3472) {
							Class112.method989(17, class120_sub16.aClass120_Sub14_Sub5_2611.anInt3473, -30073, class73.anInt652);
						}
					}
				}
			}
			if (i > -89) {
				method1010((byte) -62);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("mm.A(").append(i).append(')').toString());
		}
	}

	public static void method1010(final byte i) {
		try {
			aClass21_1117 = null;
			anIntArrayArray1119 = null;
			aString1116 = null;
			aClass120_Sub14_Sub19_1114 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("mm.B(").append(i).append(')').toString());
		}
	}
}
