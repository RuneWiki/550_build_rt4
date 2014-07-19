/* Class120_Sub16 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class120_Sub16 extends Node {
	static String[] friendsName;
	static int menuDrawY;
	int anInt2601;
	int anInt2602 = 2147483647;
	int anInt2603;
	int anInt2604 = -2147483648;
	int anInt2605;
	int anInt2606;
	int anInt2607;
	static int[] screenRedrawWidhts = new int[100];
	int anInt2609;
	static int messageCount = 0;
	Class120_Sub14_Sub5 aClass120_Sub14_Sub5_2611;

	static {
		friendsName = new String[200];
	}

	public static void method1655(final boolean bool) {
		try {
			screenRedrawWidhts = null;
			friendsName = null;
			if (!bool) {
				method1659(-16, -103, 22);
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("nb.H(").append(bool).append(')').toString());
		}
	}

	final boolean method1656(final int i, final int i_0_, final int i_1_) {
		boolean bool;
		try {
			if (this.anInt2602 <= i && i <= this.anInt2605 && i_1_ >= this.anInt2603 && this.anInt2604 >= i_1_) {
				return true;
			}
			if (i_0_ >= -99) {
				method1659(-106, 125, -30);
			}
			if (i >= this.anInt2601 && i <= this.anInt2609 && this.anInt2606 <= i_1_ && i_1_ <= this.anInt2607) {
				return true;
			}
			bool = false;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("nb.E(").append(i).append(',').append(i_0_).append(',').append(i_1_).append(')').toString());
		}
		return bool;
	}

	static final void method1658() {
		Class73.recentUse.clear();
		Class82.aClass21_786.clear();
	}

	static final int method1659(final int i, final int i_2_, final int i_3_) {
		int i_4_;
		try {
			int i_5_ = SubScript.method2246(i_2_ + 91923, 0, i - -45365, 4) + -128 + (SubScript.method2246(37821 + i_2_, 0, i + 10294, 2) + -128 >> 1) + (SubScript.method2246(i_2_, 0, i, 1) + -128 >> 2);
			i_5_ = (int) (0.3 * i_5_) - -35;
			if (i_3_ >= -30) {
				method1655(false);
			}
			if (i_5_ < 10) {
				i_5_ = 10;
			} else if (i_5_ > 60) {
				i_5_ = 60;
			}
			i_4_ = i_5_;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("nb.D(").append(i).append(',').append(i_2_).append(',').append(i_3_).append(')').toString());
		}
		return i_4_;
	}

	static final void method1660(final String string, final int i, final String string_6_, final int i_7_, final String string_8_) {
		for (int i_10_ = 99; i_10_ > 0; i_10_--) {
			Class136.anIntArray1315[i_10_] = Class136.anIntArray1315[i_10_ - 1];
			Class76.aStringArray677[i_10_] = Class76.aStringArray677[i_10_ - 1];
			GrandExchangeObject.aStringArray1502[i_10_] = GrandExchangeObject.aStringArray1502[i_10_ - 1];
			Class120_Sub2.aStringArray2423[i_10_] = Class120_Sub2.aStringArray2423[i_10_ - 1];
			Class120_Sub12_Sub36.anIntArray3422[i_10_] = Class120_Sub12_Sub36.anIntArray3422[i_10_- 1];
		}
		Class136.anIntArray1315[0] = i_7_;
		Class76.aStringArray677[0] = string;
		GrandExchangeObject.aStringArray1502[0] = string_8_;
		Class120_Sub12_Sub36.anIntArray3422[0] = i;
		Class120_Sub2.aStringArray2423[0] = string_6_;
		Class166.anInt1612 = GrandExchangeObject.anInt1494;
		messageCount++;
	}

	static final int method1661(final int i, final int i_11_, char c) {
		int i_12_;
		try {
			if (i != 1762) {
				method1658();
			}
			int i_13_ = c << 4;
			if (Character.isUpperCase(c) || Character.isTitleCase(c)) {
				c = Character.toLowerCase(c);
				i_13_ = 1 + (c << 4);
			}
			if (c == 241 && i_11_ == 0) {
				i_13_ = 1762;
			}
			i_12_ = i_13_;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("nb.I(").append(i).append(',').append(i_11_).append(',').append(c).append(')').toString());
		}
		return i_12_;
	}

	static final void shiftOptions(final int i) {
		Class186.menuOptionCount--;
		if (Class186.menuOptionCount != i) {
			ArrayUtils.arrayCopy(Class120_Sub12_Sub33.menuOptionPrefix, i + 1, Class120_Sub12_Sub33.menuOptionPrefix, i, Class186.menuOptionCount - i);
			ArrayUtils.arrayCopy(Class120_Sub12_Sub29.menuOptionSufix, i + 1, Class120_Sub12_Sub29.menuOptionSufix, i, Class186.menuOptionCount - i);
			ArrayUtils.arrayCopy(InterfaceChangeNode.menuOptionsCursorId, i + 1, InterfaceChangeNode.menuOptionsCursorId, i, Class186.menuOptionCount - i);
			ArrayUtils.arrayCopy(Class120_Sub29.aShortArray2777, i + 1, Class120_Sub29.aShortArray2777, i, Class186.menuOptionCount - i);
			ArrayUtils.arrayCopy(Class120_Sub12.aLongArray2562, i + 1, Class120_Sub12.aLongArray2562, i, Class186.menuOptionCount - i);
			ArrayUtils.arrayCopy(Class120_Sub12_Sub7.anIntArray3182, i + 1, Class120_Sub12_Sub7.anIntArray3182, i, Class186.menuOptionCount - i);
			ArrayUtils.arrayCopy(Class120_Sub29.anIntArray2769, i + 1, Class120_Sub29.anIntArray2769, i, Class186.menuOptionCount - i);
		}
	}

	static final void method1663() {
		Class15.menuOpen = false;
		Class186.menuOptionCount = 0;
		Class23.packetType = -1;
		Class120_Sub12_Sub11.outputStream.pos = 0;
		Class114.anInt1093 = -1;
		Class73.anInt639 = -1;
		SeqType.anInt333 = -1;
		Class88.anInt827 = 0;
		Canvas_Sub1.inputStream.pos = 0;
		Class120_Sub22.systemUpdateCycle = 0;
		AbstractMouseWheelHandler.packetSize = 0;
		Class8.method111((byte) 0);
		for (int i_14_ = 0; i_14_ < Class118.playersList.length; i_14_++) {
			if (Class118.playersList[i_14_] != null) {
				Class118.playersList[i_14_].facingEntityIndex = -1;
			}
		}
		for (int i_15_ = 0; i_15_ < Class120_Sub12_Sub11.npcList.length; i_15_++) {
			if (Class120_Sub12_Sub11.npcList[i_15_] != null) {
				Class120_Sub12_Sub11.npcList[i_15_].facingEntityIndex = -1;
			}
		}
		Class28.method243(true);
		client.cameraType = 1;
		Class120_Sub14_Sub1.setGameState(30);
		for (int i_16_ = 0; i_16_ < 100; i_16_++) {
			Class52.needInterfaceRedrawWrapper[i_16_] = true;
		}
		ParamType.sendDisplayInfo();
	}

	static final void removeAmbientSoundNpc(final Npc npc) {
		for (AmbientSound class120_sub8 = (AmbientSound) Class120_Sub12_Sub10.npcAmbientSounds.getFront(); class120_sub8 != null; class120_sub8 = (AmbientSound) Class120_Sub12_Sub10.npcAmbientSounds.getNext()) {
			if (npc == class120_sub8.npc) {
				if (class120_sub8.aClass120_Sub30_Sub4_2488 != null) {
					Class120_Sub12_Sub22.aClass120_Sub30_Sub3_3299.method1783(class120_sub8.aClass120_Sub30_Sub4_2488);
					class120_sub8.aClass120_Sub30_Sub4_2488 = null;
				}
				class120_sub8.unlink();
				break;
			}
		}
	}

	Class120_Sub16(final Class120_Sub14_Sub5 class120_sub14_sub5) {
		this.anInt2603 = 2147483647;
		this.anInt2609 = -2147483648;
		this.anInt2607 = -2147483648;
		this.anInt2601 = 2147483647;
		this.anInt2605 = -2147483648;
		this.anInt2606 = 2147483647;
		this.aClass120_Sub14_Sub5_2611 = class120_sub14_sub5;
	}
}
