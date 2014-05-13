/* InputStream_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.InputStream;

final class InputStream_Sub1 extends InputStream {
	static boolean focus;
	static int[] anIntArray24;
	static String aString25 = "Members object";
	static JagexInterface aClass189_26;

	static {
		anIntArray24 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2, 1, 1, 1, 4, 1 };
		aClass189_26 = null;
	}

	static final int getLanguageId(final String lang) {
		for (int i_0_ = 0; Buffer.languageArray.length > i_0_; i_0_++) {
			if (Buffer.languageArray[i_0_].equalsIgnoreCase(lang)) {
				return i_0_;
			}
		}
		return -1;
	}

	static final void logout() {
		if (AbstractTimer.worldConnection != null) {
			AbstractTimer.worldConnection.method377();
			AbstractTimer.worldConnection = null;
		}
		Class110.method976(-7603);
		Class173.method2225();
		for (int i = 0; i < 4; i++) {
			Class182.aClass25Array1802[i].method225(11736);
		}
		Class120_Sub30_Sub1.method1739(false, (byte) -93);
		System.gc();
		Class120_Sub12_Sub6.method1230(5, 2);
		Class157.anInt1466 = -1;
		Class120_Sub12_Sub15.aBoolean3247 = false;
		Class180_Sub6.method2355(true, 14713);
		Class181.currentBaseZ = 0;
		Class116.anInt1118 = 0;
		Class3.anInt53 = 0;
		Class134.aBoolean1282 = false;
		GameEntity.currentBaseX = 0;
		for (int i = 0; i < Class187.aClass85Array1909.length; i++) {
			Class187.aClass85Array1909[i] = null;
		}
		Class148.localNpcCount = 0;
		Class83.localPlayerCount = 0;
		for (int i = 0; i < 2048; i++) {
			Class118.playersList[i] = null;
			StringNode.aClass120_Sub7Array2737[i] = null;
		}
		for (int i = 0; (i ^ 0xffffffff) > -32769; i++) {
			Class120_Sub12_Sub11.npcList[i] = null;
		}
		for (int i = 0; i < 4; i++) {
			for (int i_1_ = 0; i_1_ < 104; i_1_++) {
				for (int i_2_ = 0; i_2_ < 104; i_2_++) {
					Class120_Sub14_Sub12.groundObjects[i][i_1_][i_2_] = null;
				}
			}
		}
		SpotAnimType.method876((byte) 120);
		Class120_Sub14_Sub20.interfaceCounter = 0;
		Class33.method275((byte) -5);
		Class120_Sub14_Sub2.method1421(true);
		try {
			Class77.method666(NpcType.gameSignlink.gameApplet, "loggedout");
		} catch (final Throwable throwable) {
		}
	}

	@Override
	public final int read() {
		int i;
		try {
			PacketBuffer.sleepWrapper(30000L);
			i = -1;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, "ia.read()");
		}
		return i;
	}

	public static void method70(final boolean bool) {
		try {
			aClass189_26 = null;
			if (!bool) {
				anIntArray24 = null;
				aString25 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ia.B(").append(bool).append(')').toString());
		}
	}

	static final String method71(final JagexInterface jagexInterface, final int i, String string) {
		String string_3_;
		try {
			if (i != 2) {
				return null;
			}
			if (string.indexOf("%") != -1) {
				for (;;) {
					final int i_4_ = string.indexOf("%1");
					if ((i_4_ ^ 0xffffffff) == 0) {
						break;
					}
					string = new StringBuilder(string.substring(0, i_4_)).append(Class73.method644(LocType.method2467(0, (byte) -31, jagexInterface), 999999999)).append(string.substring(2 + i_4_)).toString();
				}
				for (;;) {
					final int i_5_ = string.indexOf("%2");
					if ((i_5_ ^ 0xffffffff) == 0) {
						break;
					}
					string = new StringBuilder(string.substring(0, i_5_)).append(Class73.method644(LocType.method2467(1, (byte) -86, jagexInterface), 999999999)).append(string.substring(i_5_ + 2)).toString();
				}
				for (;;) {
					final int i_6_ = string.indexOf("%3");
					if (i_6_ == -1) {
						break;
					}
					string = new StringBuilder(string.substring(0, i_6_)).append(Class73.method644(LocType.method2467(2, (byte) -37, jagexInterface), i ^ 0x3b9ac9fd)).append(string.substring(i_6_ + 2)).toString();
				}
				for (;;) {
					final int i_7_ = string.indexOf("%4");
					if ((i_7_ ^ 0xffffffff) == 0) {
						break;
					}
					string = new StringBuilder(string.substring(0, i_7_)).append(Class73.method644(LocType.method2467(3, (byte) -59, jagexInterface), 999999999)).append(string.substring(i_7_ + 2)).toString();
				}
				for (;;) {
					final int i_8_ = string.indexOf("%5");
					if (i_8_ == -1) {
						break;
					}
					string = new StringBuilder(string.substring(0, i_8_)).append(Class73.method644(LocType.method2467(4, (byte) -107, jagexInterface), 999999999)).append(string.substring(2 + i_8_)).toString();
				}
				for (;;) {
					final int i_9_ = string.indexOf("%dns");
					if ((i_9_ ^ 0xffffffff) == 0) {
						break;
					}
					String string_10_ = "";
					if (Class120_Sub1.aClass185_2403 != null) {
						if (Class120_Sub1.aClass185_2403.value != null) {
							string_10_ = (String) Class120_Sub1.aClass185_2403.value;
						} else {
							string_10_ = Class125.method1879((byte) 39, Class120_Sub1.aClass185_2403.integerData);
						}
					}
					string = new StringBuilder(string.substring(0, i_9_)).append(string_10_).append(string.substring(i_9_ + 4)).toString();
				}
			}
			string_3_ = string;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ia.C(").append(jagexInterface != null ? "{...}" : "null").append(',').append(i).append(',').append(string != null ? "{...}" : "null").append(')').toString());
		}
		return string_3_;
	}
}
