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
	MapFunctionNode mapFunctionNode;

	static {
		friendsName = new String[200];
	}

	public static void method1655() {
		screenRedrawWidhts = null;
		friendsName = null;
	}

	final boolean inBounds(final int mouseX, final int mouseY) {
		if (mouseX >= this.anInt2602 && mouseX <= this.anInt2605 && mouseY >= this.anInt2603 && mouseY <= this.anInt2604) {
			return true;
		}
		if (mouseX >= this.anInt2601 && mouseX <= this.anInt2609 && mouseY >= this.anInt2606 && mouseY <= this.anInt2607) {
			return true;
		}
		return false;
	}

	static final void clearMapFunctions() {
		MapFunctionType.recentUse.clear();
		MapFunctionType.spriteCache.clear();
	}

	static final int method1659(final int i, final int i_2_) {
		int i_5_ = SubScript.method2246(i_2_ + 91923, i - -45365, 4) + -128 + (SubScript.method2246(37821 + i_2_, i + 10294, 2) + -128 >> 1) + (SubScript.method2246(i_2_, i, 1) + -128 >> 2);
		i_5_ = (int) (0.3 * i_5_) - -35;
		if (i_5_ < 10) {
			i_5_ = 10;
		} else if (i_5_ > 60) {
			i_5_ = 60;
		}
		return i_5_;
	}

	static final void pushMessage(final String message, final String name, final String string_6_, final int type, final int quickChatId) {
		for (int id = 99; id > 0; id--) {
			Class136.anIntArray1315[id] = Class136.anIntArray1315[id - 1];
			Class76.aStringArray677[id] = Class76.aStringArray677[id - 1];
			GrandExchangeObject.aStringArray1502[id] = GrandExchangeObject.aStringArray1502[id - 1];
			Class120_Sub2.aStringArray2423[id] = Class120_Sub2.aStringArray2423[id - 1];
			Class120_Sub12_Sub36.anIntArray3422[id] = Class120_Sub12_Sub36.anIntArray3422[id- 1];
		}
		Class136.anIntArray1315[0] = type;
		Class76.aStringArray677[0] = name;
		GrandExchangeObject.aStringArray1502[0] = message;
		Class120_Sub12_Sub36.anIntArray3422[0] = quickChatId;
		Class120_Sub2.aStringArray2423[0] = string_6_;
		Class166.anInt1612 = GrandExchangeObject.anInt1494;
		messageCount++;
	}

	static final int method1661(final int language, char c) {
		int i_13_ = c << 4;
		if (Character.isUpperCase(c) || Character.isTitleCase(c)) {
			c = Character.toLowerCase(c);
			i_13_ = 1 + (c << 4);
		}
		if (c == 241 && language == 0) {
			i_13_ = 1762;
		}
		return i_13_;
	}

	static final void shiftOptions(final int i) {
		WallDecoration.menuOptionCount--;
		if (WallDecoration.menuOptionCount != i) {
			ArrayUtils.arrayCopy(Class120_Sub12_Sub33.menuOptionPrefix, i + 1, Class120_Sub12_Sub33.menuOptionPrefix, i, WallDecoration.menuOptionCount - i);
			ArrayUtils.arrayCopy(Class120_Sub12_Sub29.menuOptionSuffix, i + 1, Class120_Sub12_Sub29.menuOptionSuffix, i, WallDecoration.menuOptionCount - i);
			ArrayUtils.arrayCopy(InterfaceChangeNode.menuOptionsCursorId, i + 1, InterfaceChangeNode.menuOptionsCursorId, i, WallDecoration.menuOptionCount - i);
			ArrayUtils.arrayCopy(Class120_Sub29.menuOptionsCode, i + 1, Class120_Sub29.menuOptionsCode, i, WallDecoration.menuOptionCount - i);
			ArrayUtils.arrayCopy(Class120_Sub12.menuOptionsData1, i + 1, Class120_Sub12.menuOptionsData1, i, WallDecoration.menuOptionCount - i);
			ArrayUtils.arrayCopy(Class120_Sub12_Sub7.menuOptionsData2, i + 1, Class120_Sub12_Sub7.menuOptionsData2, i, WallDecoration.menuOptionCount - i);
			ArrayUtils.arrayCopy(Class120_Sub29.menuOptionsData3, i + 1, Class120_Sub29.menuOptionsData3, i, WallDecoration.menuOptionCount - i);
		}
	}

	static final void method1663() {
		Class15.menuOpen = false;
		WallDecoration.menuOptionCount = 0;
		Class23.packetType = -1;
		Class120_Sub12_Sub11.outputStream.pos = 0;
		Class114.anInt1093 = -1;
		MapFunctionType.anInt639 = -1;
		SeqType.anInt333 = -1;
		Class88.timoutCycle = 0;
		Canvas_Sub1.inputStream.pos = 0;
		Class120_Sub22.systemUpdateCycle = 0;
		AbstractMouseWheelHandler.packetSize = 0;
		Class8.resetMapback();
		for (int id = 0; id < Class118.playersList.length; id++) {
			if (Class118.playersList[id] != null) {
				Class118.playersList[id].facingEntityIndex = -1;
			}
		}
		for (int id = 0; id < Class120_Sub12_Sub11.npcList.length; id++) {
			if (Class120_Sub12_Sub11.npcList[id] != null) {
				Class120_Sub12_Sub11.npcList[id].facingEntityIndex = -1;
			}
		}
		ObjectContainer.objectContainerCache = new Hashtable(32);
		client.cameraType = 1;
		ProjectileNode.setGameState(30);
		for (int i_16_ = 0; i_16_ < 100; i_16_++) {
			MasterIndexInfo.needInterfaceRedrawWrapper[i_16_] = true;
		}
		ParamType.sendDisplayInfo();
	}

	static final void removeAmbientSoundNpc(final Npc npc) {
		for (AmbientSound ambientSound = (AmbientSound) Class120_Sub12_Sub10.npcAmbientSounds.getFront(); ambientSound != null; ambientSound = (AmbientSound) Class120_Sub12_Sub10.npcAmbientSounds.getNext()) {
			if (npc == ambientSound.npc) {
				if (ambientSound.aClass120_Sub30_Sub4_2488 != null) {
					Class120_Sub12_Sub22.aClass120_Sub30_Sub3_3299.method1783(ambientSound.aClass120_Sub30_Sub4_2488);
					ambientSound.aClass120_Sub30_Sub4_2488 = null;
				}
				ambientSound.unlink();
				break;
			}
		}
	}

	Class120_Sub16(final MapFunctionNode class120_sub14_sub5) {
		this.anInt2603 = 2147483647;
		this.anInt2609 = -2147483648;
		this.anInt2607 = -2147483648;
		this.anInt2601 = 2147483647;
		this.anInt2605 = -2147483648;
		this.anInt2606 = 2147483647;
		this.mapFunctionNode = class120_sub14_sub5;
	}
}
