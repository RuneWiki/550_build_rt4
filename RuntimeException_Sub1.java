/* RuntimeException_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class RuntimeException_Sub1 extends RuntimeException {
	static byte[][] mapFilesBuffer;
	String aString2141;
	static int anInt2142 = 255;
	static short aShort2143 = 1;
	static AbstractSprite aClass120_Sub14_Sub19_2144;
	static Class120_Sub14_Sub9 aClass120_Sub14_Sub9_2145;
	Throwable aThrowable2146;

	static final OverridedJInterface overrideInterface(final int interfaceId, final int type, final int bitPacked) {
		final OverridedJInterface overridedInterface = new OverridedJInterface();
		overridedInterface.type = type;
		overridedInterface.interfaceId = interfaceId;
		Class120_Sub12_Sub13.overridedInterfaces.put(overridedInterface, bitPacked);
		ProjectileNode.stopInterfaceAnimation(interfaceId);
		final JagexInterface jagexInterface = Class74.getJagexInterface(bitPacked);
		if (jagexInterface != null) {
			InterfaceClickMask.redrawInterface(jagexInterface);
		}
		if (Class156.dialogInterface != null) {
			InterfaceClickMask.redrawInterface(Class156.dialogInterface);
			Class156.dialogInterface = null;
		}
		for (int id = 0; id < WallDecoration.menuOptionCount; id++) {
			if (Class150.method2064(Class120_Sub29.menuOptionsCode[id])) {
				Class120_Sub16.shiftOptions(id);
			}
		}
		if (WallDecoration.menuOptionCount == 1) {
			Class15.menuOpen = false;
			Class120_Sub12_Sub1.redrawScreen(Huffman.menuDrawX, Class120_Sub16.menuDrawY, Class120_Sub24.menuWidth, QuickChatMessageType.menuHeight);
		} else {
			Class120_Sub12_Sub1.redrawScreen(Huffman.menuDrawX, Class120_Sub16.menuDrawY, Class120_Sub24.menuWidth, QuickChatMessageType.menuHeight);
			int stringWidth = Class120_Sub12_Sub22.boldFont.method1459(StringLibrary.chooseOption);
			for (int id = 0; id < WallDecoration.menuOptionCount; id++) {
				final int optionWidth = Class120_Sub12_Sub22.boldFont.method1459(client.getMenuOptionText(id));
				if (stringWidth < optionWidth) {
					stringWidth = optionWidth;
				}
			}
			QuickChatMessageType.menuHeight = (WallDecoration.usingSpriteMenu ? 26 : 22) + WallDecoration.menuOptionCount * 15;
			Class120_Sub24.menuWidth = 8 + stringWidth;
		}
		if (jagexInterface != null) {
			ProducingGraphicsBuffer.method1854(jagexInterface, false);
		}
		JagexSocket.executeOnloadScript(interfaceId);
		if (Class69.rootInterfaceId != -1) {
			InterfaceClickMask.method1689(1, Class69.rootInterfaceId);
		}
		return overridedInterface;
	}

	static final void addWallLocation(final int level, final int x, final int z, final int y, final SceneGraphNode sceneGraphNode, final SceneGraphNode class180_12_, final int i_13_, final int i_14_, final long bitPackedUid) {
		if (sceneGraphNode != null || class180_12_ != null) {
			final WallLocation wallLocation = new WallLocation();
			wallLocation.bitPackedUid = bitPackedUid;
			wallLocation.renderX = x * 128 + 64;
			wallLocation.renderZ = z * 128 + 64;
			wallLocation.renderY = y;
			wallLocation.aClass180_1800 = sceneGraphNode;
			wallLocation.aClass180_1796 = class180_12_;
			wallLocation.anInt1799 = i_13_;
			wallLocation.anInt1792 = i_14_;
			for (int lowerLevel = level; lowerLevel >= 0; lowerLevel--) {
				if (LabelGroup.activeGroundTiles[lowerLevel][x][z] == null) {
					LabelGroup.activeGroundTiles[lowerLevel][x][z] = new GroundTile(lowerLevel, x, z);
				}
			}
			LabelGroup.activeGroundTiles[level][x][z].wallLocation = wallLocation;
		}
	}

	RuntimeException_Sub1(final Throwable throwable, final String string) {
		this.aString2141 = string;
		this.aThrowable2146 = throwable;
	}
}
