/* Class31 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class31 {
	static int anInt240;
	static Class50 aClass50_241;
	static int anInt242;
	static int[] anIntArray243;
	static int anInt244 = 0;
	static GameShell gameApplet = null;
	static Class107_Sub1 aClass107_Sub1_246;
	static int spriteTrimWidth;
	static int anInt248;
	static boolean advertSuppressed = false;
	static int anInt250 = 0;

	static {
		aClass107_Sub1_246 = null;
	}

	static final void method262(final int i) {
		try {
			if (i < -114) {
				while (Canvas_Sub1.aClass120_Sub7_Sub1_16.method1153(AbstractMouseWheelHandler.anInt118, 8) >= 27) {
					final int i_0_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getBitValue(15);
					if (i_0_ == 32767) {
						break;
					}
					boolean bool = false;
					if (Class120_Sub12_Sub11.npcList[i_0_] == null) {
						bool = true;
						Class120_Sub12_Sub11.npcList[i_0_] = new Npc();
					}
					final Npc class180_sub5_sub2 = Class120_Sub12_Sub11.npcList[i_0_];
					Class120_Sub12_Sub36.localNpcIndices[Class148.localNpcCount++] = i_0_;
					class180_sub5_sub2.anInt2985 = Class101_Sub2.loopCycle;
					if (class180_sub5_sub2.npcType != null && class180_sub5_sub2.npcType.method2204(0)) {
						Class120_Sub16.method1664((byte) 64, class180_sub5_sub2);
					}
					int i_1_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getBitValue(5);
					if (i_1_ > 15) {
						i_1_ -= 32;
					}
					final int i_2_ = Class15.anIntArray101[Canvas_Sub1.aClass120_Sub7_Sub1_16.getBitValue(3)];
					if (bool) {
						class180_sub5_sub2.anInt3019 = class180_sub5_sub2.anInt3032 = i_2_;
					}
					int i_3_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getBitValue(5);
					class180_sub5_sub2.method2346((byte) 90, NpcType.list(Canvas_Sub1.aClass120_Sub7_Sub1_16.getBitValue(14)));
					final int i_4_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getBitValue(1);
					if (i_3_ > 15) {
						i_3_ -= 32;
					}
					if (i_4_ == 1) {
						Class169.anIntArray1648[Class154.anInt1441++] = i_0_;
					}
					final int i_5_ = Canvas_Sub1.aClass120_Sub7_Sub1_16.getBitValue(1);
					class180_sub5_sub2.method2338(23751, class180_sub5_sub2.npcType.size);
					class180_sub5_sub2.anInt2982 = class180_sub5_sub2.npcType.anInt1692;
					class180_sub5_sub2.anInt3010 = class180_sub5_sub2.npcType.anInt1672;
					if (class180_sub5_sub2.anInt3010 == 0) {
						class180_sub5_sub2.anInt3032 = 0;
					}
					class180_sub5_sub2.method2323((byte) 124, Class100.selfPlayer.anIntArray3040[0] - -i_1_, class180_sub5_sub2.getSize(), i_3_ + Class100.selfPlayer.anIntArray2958[0], i_5_ == 1);
					if (class180_sub5_sub2.npcType.method2204(0)) {
						Class7.method106(128, null, class180_sub5_sub2.anIntArray2958[0], class180_sub5_sub2, class180_sub5_sub2.anIntArray3040[0], null, 0, Class173.gameLevel);
					}
				}
				Canvas_Sub1.aClass120_Sub7_Sub1_16.method1146();
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("db.D(").append(i).append(')').toString());
		}
	}

	static final int method263(final int i, final boolean bool) {
		int i_6_;
		try {
			if (i != 2061) {
				return 58;
			}
			final long l = TimeUtil.getSafeTime();
			for (Class120_Sub3 class120_sub3 = bool ? (Class120_Sub3) Class69_Sub3_Sub1.aClass75_3079.method657(i + 11231) : (Class120_Sub3) Class69_Sub3_Sub1.aClass75_3079.method658((byte) -67); class120_sub3 != null; class120_sub3 = (Class120_Sub3) Class69_Sub3_Sub1.aClass75_3079
					.method658((byte) -105)) {
				if (l > (0x3fffffffffffffffL & class120_sub3.aLong2425)) {
					if ((class120_sub3.aLong2425 & 0x4000000000000000L ^ 0xffffffffffffffffL) == -1L) {
						class120_sub3.unlink();
					} else {
						final int i_7_ = (int) class120_sub3.uid;
						Class2.permanentVariable[i_7_] = Class30.anIntArray239[i_7_];
						class120_sub3.unlink();
						return i_7_;
					}
				}
			}
			i_6_ = -1;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("db.C(").append(i).append(',').append(bool).append(')').toString());
		}
		return i_6_;
	}

	static final void method264(final int i, final int i_8_, final int i_9_, final int i_10_, final int i_11_, final int i_12_, final int i_13_, final int i_14_) {
		try {
			if (i == -1 && i_13_ >= 1 && i_10_ >= 1 && i_13_ <= 102 && i_10_ <= 102) {
				if (!Class143_Sub1.method2021() && (0x2 & Class114.aByteArrayArrayArray1095[0][i_13_][i_10_]) == 0) {
					int i_15_ = i_8_;
					if ((0x8 & Class114.aByteArrayArrayArray1095[i_8_][i_13_][i_10_]) != 0) {
						i_15_ = 0;
					}
					if (i_15_ != Class120_Sub14_Sub4.anInt3469) {
						return;
					}
				}
				int i_16_ = i_8_;
				if (i_16_ < 3 && (Class114.aByteArrayArrayArray1095[1][i_13_][i_10_] & 0x2) == 2) {
					i_16_++;
				}
				Class88.method743((byte) -116, i_8_, i_16_, i_10_, Class182.aClass25Array1802[i_8_], i_11_, i_13_);
				if (i_12_ >= 0) {
					final boolean bool = Class75.showGroundDecorations;
					Class75.showGroundDecorations = true;
					Class93.method771(i_9_, i_8_, i_12_, i_16_, i_13_, 4, false, i_10_, Class182.aClass25Array1802[i_8_], false, i_14_);
					Class75.showGroundDecorations = bool;
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("db.E(").append(i).append(',').append(i_8_).append(',').append(i_9_).append(',').append(i_10_).append(',').append(i_11_).append(',').append(i_12_).append(',').append(i_13_).append(',').append(i_14_).append(')')
					.toString());
		}
	}

	static final int method265(final boolean bool, final String string) {
		int i;
		try {
			if (!bool) {
				return 47;
			}
			i = CanvasWrapper.method65(10, string, 92, true);
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("db.B(").append(bool).append(',').append(string != null ? "{...}" : "null").append(')').toString());
		}
		return i;
	}

	public static void method266(final boolean bool) {
		try {
			aClass50_241 = null;
			aClass107_Sub1_246 = null;
			anIntArray243 = null;
			if (bool) {
				method265(true, null);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("db.A(").append(bool).append(')').toString());
		}
	}

	static final void method267(final int i, final Player class180_sub5_sub1) {
		try {
			if (i != 15) {
				advertSuppressed = false;
			}
			final Class120_Sub8 class120_sub8 = (Class120_Sub8) Npc.aClass75_3750.method659(Class70.method636(i + -138, class180_sub5_sub1.aString3745), -128);
			if (class120_sub8 != null) {
				if (class120_sub8.aClass120_Sub30_Sub4_2488 != null) {
					Class120_Sub12_Sub22.aClass120_Sub30_Sub3_3299.method1783(class120_sub8.aClass120_Sub30_Sub4_2488);
					class120_sub8.aClass120_Sub30_Sub4_2488 = null;
				}
				class120_sub8.unlink();
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("db.F(").append(i).append(',').append(class180_sub5_sub1 != null ? "{...}" : "null").append(')').toString());
		}
	}
}
