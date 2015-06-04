/* InputStream_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.InputStream;

final class DummyInputStream extends InputStream {
	static boolean focus;
	static int[] anIntArray24;
	static JagexInterface gameScreenInterface;

	static {
		anIntArray24 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2, 1, 1, 1, 4, 1 };
		gameScreenInterface = null;
	}

	static final int getLanguageId(final String lang) {
		for (int id = 0; id < Buffer.languageArray.length; id++) {
			if (Buffer.languageArray[id].equalsIgnoreCase(lang)) {
				return id;
			}
		}
		return -1;
	}

	static final void processLogout() {
		if (AbstractTimer.worldConnection != null) {
			AbstractTimer.worldConnection.close();
			AbstractTimer.worldConnection = null;
		}
		Class110.method976();
		Class173.method2225();
		for (int i = 0; i < 4; i++) {
			WallLocation.collisionMaps[i].resetFlags();
		}
		Class120_Sub30_Sub1.method1739();
		System.gc();
		Class120_Sub12_Sub6.method1230(2);
		Class157.anInt1466 = -1;
		Class120_Sub12_Sub15.aBoolean3247 = false;
		AnimatedLocation.clearAmbientSounds(true);
		LightType.currentBaseZ = 0;
		Class116.anInt1118 = 0;
		Class3.anInt53 = 0;
		Class134.dynamicMapRegion = false;
		GameEntity.currentBaseX = 0;
		for (int i = 0; i < Class187.hintIcons.length; i++) {
			Class187.hintIcons[i] = null;
		}
		Class148.localNpcCount = 0;
		FileSystemWorker.localPlayerCount = 0;
		for (int i = 0; i < 2048; i++) {
			Class118.playersList[i] = null;
			StringNode.playerAppearanceBuffers[i] = null;
		}
		for (int i = 0; (i ^ 0xffffffff) > -32769; i++) {
			Class120_Sub12_Sub11.npcList[i] = null;
		}
		for (int i = 0; i < 4; i++) {
			for (int i_1_ = 0; i_1_ < 104; i_1_++) {
				for (int i_2_ = 0; i_2_ < 104; i_2_++) {
					ClientScript.groundObjects[i][i_1_][i_2_] = null;
				}
			}
		}
		SpotAnimType.resetCamera();
		OverlayFrequencyNode.packetCounter = 0;
		Varp.reset();
		EnumType.method1421(true);
		try {
			JSHelper.call(NpcType.gameSignlink.gameApplet, "loggedout");
		} catch (final Throwable throwable) {
		}
	}

	@Override
	public final int read() {
		PacketBuffer.sleepWrapper(30000L);
		return -1;
	}

	static final String method71(final JagexInterface jagexInterface, String string) {
		if (string.indexOf("%") != -1) {
			for (;;) {
				final int i_4_ = string.indexOf("%1");
				if (i_4_ == -1) {
					break;
				}
				string = new StringBuilder(string.substring(0, i_4_)).append(MapFunctionType.amountToString(LocType.method2467(jagexInterface, 0))).append(string.substring(2 + i_4_)).toString();
			}
			for (;;) {
				final int i_5_ = string.indexOf("%2");
				if (i_5_ == -1) {
					break;
				}
				string = new StringBuilder(string.substring(0, i_5_)).append(MapFunctionType.amountToString(LocType.method2467(jagexInterface, 1))).append(string.substring(i_5_ + 2)).toString();
			}
			for (;;) {
				final int i_6_ = string.indexOf("%3");
				if (i_6_ == -1) {
					break;
				}
				string = new StringBuilder(string.substring(0, i_6_)).append(MapFunctionType.amountToString(LocType.method2467(jagexInterface, 2))).append(string.substring(i_6_ + 2)).toString();
			}
			for (;;) {
				final int i_7_ = string.indexOf("%4");
				if (i_7_ == -1) {
					break;
				}
				string = new StringBuilder(string.substring(0, i_7_)).append(MapFunctionType.amountToString(LocType.method2467(jagexInterface, 3))).append(string.substring(i_7_ + 2)).toString();
			}
			for (;;) {
				final int i_8_ = string.indexOf("%5");
				if (i_8_ == -1) {
					break;
				}
				string = new StringBuilder(string.substring(0, i_8_)).append(MapFunctionType.amountToString(LocType.method2467(jagexInterface, 4))).append(string.substring(2 + i_8_)).toString();
			}
			for (;;) {
				final int i_9_ = string.indexOf("%dns");
				if (i_9_ == -1) {
					break;
				}
				String string_10_ = "";
				if (LabelGroup.hostNameNode != null) {
					if (LabelGroup.hostNameNode.value != null) {
						string_10_ = (String) LabelGroup.hostNameNode.value;
					} else {
						string_10_ = Class125.method1879(LabelGroup.hostNameNode.integerData);
					}
				}
				string = new StringBuilder(string.substring(0, i_9_)).append(string_10_).append(string.substring(i_9_ + 4)).toString();
			}
		}
		return string;
	}
}
