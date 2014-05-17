/* client - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import java.io.IOException;
import java.net.Socket;
import java.util.GregorianCalendar;

public final class client extends GameShell {
	static int anInt2199;
	static int cameraType;
	static byte aByte2201;
	static boolean shutdown = false;
	static int anInt2203 = 0;

	static {
		aByte2201 = (byte) 0;
	}

	private final void method50(final int i) {
		try {
			for (ObjType.anInt1551 = i; Class120_Sub12_Sub13.method1265((byte) -66) && ObjType.anInt1551 < 128; ObjType.anInt1551++) {
				Class134.anIntArray1285[ObjType.anInt1551] = Class35.anInt301;
				Class120_Sub19.anIntArray2658[ObjType.anInt1551] = ObjType.aChar1536;
			}
			Class120_Sub12_Sub22.redrawRate++;
			if (Class69.rootInterfaceId != -1) {
				Class120_Sub6.method1074(Class69.rootInterfaceId, Class69_Sub1.canvasWidth, 0, 0, 0, 0, Class120_Sub12_Sub5.canvasHeight);
			}
			Class160.anInt1494++;
			if (HDToolkit.glEnabled) {
				int i_1_ = 0;
				while_37_: for (/**/; -32769 < (i_1_ ^ 0xffffffff); i_1_++) {
					final Npc class180_sub5_sub2 = Class120_Sub12_Sub11.npcList[i_1_];
					if (class180_sub5_sub2 != null) {
						final byte i_2_ = class180_sub5_sub2.npcType.aByte1700;
						if ((0x2 & i_2_) > 0 && class180_sub5_sub2.anInt2960 == 0 && Math.random() * 1000.0 < 10.0) {
							final int i_3_ = (int) Math.round(-1.0 + 2.0 * Math.random());
							final int i_4_ = (int) Math.round(-1.0 + 2.0 * Math.random());
							if (i_3_ != 0 || i_4_ != 0) {
								class180_sub5_sub2.aByteArray2973[0] = (byte) 1;
								class180_sub5_sub2.anIntArray2958[0] = i_3_ + (class180_sub5_sub2.x >> 7);
								class180_sub5_sub2.anIntArray3040[0] = (class180_sub5_sub2.z >> 7) - -i_4_;
								Class182.aClass25Array1802[Class173.gameLevel].method214(0, class180_sub5_sub2.z >> 7, class180_sub5_sub2.getSize(), 3, false, class180_sub5_sub2.x >> 7, class180_sub5_sub2.getSize(), false);
								if (class180_sub5_sub2.anIntArray2958[0] >= 0 && class180_sub5_sub2.anIntArray2958[0] <= -class180_sub5_sub2.getSize() + 104 && class180_sub5_sub2.anIntArray3040[0] >= 0
										&& class180_sub5_sub2.anIntArray3040[0] <= 104 - class180_sub5_sub2.getSize()
										&& Class182.aClass25Array1802[Class173.gameLevel].method221(65536, class180_sub5_sub2.anIntArray3040[0], class180_sub5_sub2.z >> 7, class180_sub5_sub2.anIntArray2958[0], class180_sub5_sub2.x >> 7)) {
									if (class180_sub5_sub2.getSize() > 1) {
										for (int i_5_ = class180_sub5_sub2.anIntArray2958[0]; i_5_ < class180_sub5_sub2.anIntArray2958[0] - -class180_sub5_sub2.getSize(); i_5_++) {
											for (int i_6_ = class180_sub5_sub2.anIntArray3040[0]; class180_sub5_sub2.anIntArray3040[0] - -class180_sub5_sub2.getSize() > i_6_; i_6_++) {
												if ((Class182.aClass25Array1802[Class173.gameLevel].anIntArrayArray152[i_5_][i_6_] & 0x2401ff) != 0) {
													continue while_37_;
												}
											}
										}
									}
									class180_sub5_sub2.anInt2960 = 1;
								}
							}
						}
						Class120_Sub12_Sub32.method1371(class180_sub5_sub2, (byte) -49);
						ProducingGraphicsBuffer.method1850(123, class180_sub5_sub2);
						Class36.method307(-25431, class180_sub5_sub2);
						Class182.aClass25Array1802[Class173.gameLevel].method213(false, false, class180_sub5_sub2.getSize(), class180_sub5_sub2.getSize(), class180_sub5_sub2.z >> 7, -32566, class180_sub5_sub2.x >> 7);
					}
				}
			}
			if (HDToolkit.glEnabled || Buffer.gameId != 0) {
				if (Class86.loginStep == 0 && Class154.anInt1440 == 0) {
					if (cameraType == 2) {
						Class120_Sub12_Sub16.method1279();
					} else {
						Class120_Sub14_Sub6.method1445();
					}
					if (Class83.renderX >> 7 < 14 || Class83.renderX >> 7 >= 90 || GroundObjectNode.renderZ >> 7 < 14 || GroundObjectNode.renderZ >> 7 >= 90) {
						Class128.method1900(0);
					}
				}
			} else {
				Class120_Sub6.method1073(-4760);
			}
			for (;;) {
				final Class120_Sub10 class120_sub10 = (Class120_Sub10) Class120_Sub4.aClass105_2435.removeFront();
				if (class120_sub10 == null) {
					break;
				}
				final JagexInterface jagexInterface = class120_sub10.aClass189_2534;
				if (jagexInterface.anInt2083 >= 0) {
					final JagexInterface class189_7_ = Class74.getJagexInterface(jagexInterface.parent);
					if (class189_7_ == null || class189_7_.aClass189Array2072 == null || jagexInterface.anInt2083 >= class189_7_.aClass189Array2072.length || class189_7_.aClass189Array2072[jagexInterface.anInt2083] != jagexInterface) {
						continue;
					}
				}
				Class88.method744(true, class120_sub10);
			}
			for (;;) {
				final Class120_Sub10 class120_sub10 = (Class120_Sub10) FileSystem.aClass105_456.removeFront();
				if (class120_sub10 == null) {
					break;
				}
				final JagexInterface jagexInterface = class120_sub10.aClass189_2534;
				if (jagexInterface.anInt2083 >= 0) {
					final JagexInterface class189_8_ = Class74.getJagexInterface(jagexInterface.parent);
					if (class189_8_ == null || class189_8_.aClass189Array2072 == null || jagexInterface.anInt2083 >= class189_8_.aClass189Array2072.length || class189_8_.aClass189Array2072[jagexInterface.anInt2083] != jagexInterface) {
						continue;
					}
				}
				Class88.method744(true, class120_sub10);
			}
			for (;;) {
				final Class120_Sub10 class120_sub10 = (Class120_Sub10) Class88.aClass105_829.removeFront();
				if (class120_sub10 == null) {
					break;
				}
				final JagexInterface jagexInterface = class120_sub10.aClass189_2534;
				if (jagexInterface.anInt2083 >= 0) {
					final JagexInterface class189_9_ = Class74.getJagexInterface(jagexInterface.parent);
					if (class189_9_ == null || class189_9_.aClass189Array2072 == null || class189_9_.aClass189Array2072.length <= jagexInterface.anInt2083 || class189_9_.aClass189Array2072[jagexInterface.anInt2083] != jagexInterface) {
						continue;
					}
				}
				Class88.method744(true, class120_sub10);
			}
			if (Class120_Sub12_Sub4.aClass189_3156 != null) {
				JavaObject.method1435(-2);
			}
			if (Class3.aClass185_56 != null && Class3.aClass185_56.status == 1) {
				if (Class3.aClass185_56.value != null) {
					Class188.method2482(WorldInfo.aString1421, Class99.aBoolean950);
				}
				Class3.aClass185_56 = null;
				Class99.aBoolean950 = false;
				WorldInfo.aString1421 = null;
			}
			if (Class101_Sub2.loopCycle % 1500 == 0) {
				Class120_Sub12_Sub14.tbrefresh();
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("client.B(").append(i).append(')').toString());
		}
	}

	private final void method51(final boolean bool, final int i) {
		try {
			Class178.aClass45_1772.anInt411 = i;
			Class120_Sub12_Sub11.aClass46_3215 = null;
			Class178.aClass45_1772.anInt410++;
			Class120_Sub12_Sub33.anInt3406 = 0;
			if (!bool) {
				shutdown = true;
			}
			GroundTile.aClass185_2630 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("client.K(").append(bool).append(',').append(i).append(')').toString());
		}
	}

	static final void leaveClanChat() {
		Class120_Sub12_Sub11.outputStream.putByteIsaac(218);
		Class120_Sub12_Sub11.outputStream.putLong(0L);
	}

	private final void method53(final int i) {
		try {
			if (!InterfaceClickMask.safeModeEnabled) {
				while (Class120_Sub12_Sub13.method1265((byte) -66)) {
					if (ObjType.aChar1536 == 's' || ObjType.aChar1536 == 'S') {
						InterfaceClickMask.safeModeEnabled = true;
					}
				}
			}
			if (Class140.anInt1338 == 0) {
				final Runtime runtime = Runtime.getRuntime();
				final int i_10_ = (int) ((runtime.totalMemory() - runtime.freeMemory()) / 1024L);
				final long l = TimeUtil.getSafeTime();
				if (InterfaceChangeNode.aLong3487 == 0L) {
					InterfaceChangeNode.aLong3487 = l;
				}
				if (i_10_ > 16384 && -InterfaceChangeNode.aLong3487 + l < 5000L) {
					if (1000L < -Class61.aLong567 + l) {
						System.gc();
						Class61.aLong567 = l;
					}
					OverridedJInterface.anInt2747 = 5;
					Class134.aString1283 = Class91.aString853;
				} else {
					OverridedJInterface.anInt2747 = 5;
					Class134.aString1283 = PlayerAppearance.aString1368;
					Class140.anInt1338 = 10;
				}
			} else if (Class140.anInt1338 == 10) {
				for (int i_11_ = 0; i_11_ < 4; i_11_++) {
					Class182.aClass25Array1802[i_11_] = new Class25(104, 104);
				}
				Class140.anInt1338 = 30;
				Class134.aString1283 = DisplayModeInfo.aString1708;
				OverridedJInterface.anInt2747 = 10;
			} else if (i == 0) {
				if (Class140.anInt1338 == 30) {
					if (Class120_Sub14_Sub2.aClass112_3460 == null) {
						Class120_Sub14_Sub2.aClass112_3460 = new Class112(Class178.aClass45_1772, Class38.aClass83_319);
					}
					if (!Class120_Sub14_Sub2.aClass112_3460.method986((byte) 70)) {
						OverridedJInterface.anInt2747 = 12;
						Class134.aString1283 = Class191.aString2105;
					} else {
						Class120_Sub8.aClass50_2479 = Class126.method1884(true, (byte) -93, false, 0, true);
						Class79_Sub1.aClass50_2245 = Class126.method1884(true, (byte) -112, false, 1, true);
						Class45.aClass50_397 = Class126.method1884(false, (byte) -127, true, 2, true);
						Class33.aClass50_275 = Class126.method1884(true, (byte) -119, false, 3, true);
						Class159.aClass50_1490 = Class126.method1884(true, (byte) -106, false, 4, true);
						Class65.aClass50_597 = Class126.method1884(true, (byte) -78, true, 5, true);
						Class120_Sub12_Sub36.aClass50_3419 = Class126.method1884(true, (byte) -45, true, 6, false);
						Class120_Sub12_Sub17.aClass50_3258 = Class126.method1884(true, (byte) -100, false, 7, true);
						Class7.aClass50_63 = Class126.method1884(true, (byte) -99, false, 8, true);
						Class35.aClass50_303 = Class126.method1884(true, (byte) -115, false, 9, true);
						Class108_Sub3.aClass50_2400 = Class126.method1884(true, (byte) -65, false, 10, true);
						Class120_Sub10.aClass50_2544 = Class126.method1884(true, (byte) -52, false, 11, true);
						IsaacCipher.aClass50_1019 = Class126.method1884(true, (byte) -118, false, 12, true);
						Class120_Sub13.aClass50_2576 = Class126.method1884(true, (byte) -55, false, 13, true);
						Class132.aClass50_1251 = Class126.method1884(true, (byte) -65, false, 14, false);
						Class120_Sub22.aClass50_2679 = Class126.method1884(true, (byte) -72, false, 15, true);
						Class114.aClass50_1097 = Class126.method1884(true, (byte) -93, false, 16, true);
						Class169.aClass50_1649 = Class126.method1884(true, (byte) -64, false, 17, true);
						Class120_Sub12_Sub29.aClass50_3367 = Class126.method1884(true, (byte) -116, false, 18, true);
						Class127.aClass50_1213 = Class126.method1884(true, (byte) -104, false, 19, true);
						Class2.aClass50_50 = Class126.method1884(true, (byte) -123, false, 20, true);
						Class120_Sub2.aClass50_2415 = Class126.method1884(true, (byte) -116, false, 21, true);
						Class20.aClass50_2169 = Class126.method1884(true, (byte) -79, false, 22, true);
						Class120_Sub12_Sub24.aClass50_3309 = Class126.method1884(true, (byte) -128, true, 23, true);
						Class153.aClass50_1433 = Class126.method1884(true, (byte) -80, false, 24, true);
						AbstractMouseWheelHandler.aClass50_115 = Class126.method1884(true, (byte) -58, false, 25, true);
						Class120_Sub12_Sub15.aClass50_3242 = Class126.method1884(true, (byte) -92, true, 26, true);
						Class187.aClass50_1907 = Class126.method1884(true, (byte) -119, false, 27, true);
						Npc.aClass50_3753 = Class126.method1884(true, (byte) -56, true, 28, true);
						OverridedJInterface.anInt2747 = 15;
						Class134.aString1283 = Class11.aString82;
						Class140.anInt1338 = 40;
					}
				} else if (Class140.anInt1338 == 40) {
					int i_12_ = 0;
					for (int i_13_ = 0; i_13_ < 29; i_13_++) {
						i_12_ += Class120_Sub12_Sub26.aClass53_Sub1Array3337[i_13_].method467((byte) 86) * Class29.anIntArray199[i_13_] / 100;
					}
					if (i_12_ != 100) {
						OverridedJInterface.anInt2747 = 20;
						if (i_12_ != 0) {
							Class134.aString1283 = new StringBuilder(Class120_Sub12_Sub27.aString3338).append(i_12_).append("%").toString();
						}
					} else {
						Class134.aString1283 = Class120_Sub15.aString2594;
						OverridedJInterface.anInt2747 = 20;
						Class108.method931(Class7.aClass50_63, 108);
						Class132_Sub2.method1941(-2232, Class7.aClass50_63);
						Class112.method990(Class7.aClass50_63, 0);
						Class140.anInt1338 = 41;
					}
				} else if (Class140.anInt1338 == 41) {
					if (!Npc.aClass50_3753.method430(true)) {
						Class134.aString1283 = new StringBuilder(Class120_Sub11.aString2554).append(Npc.aClass50_3753.method415(-116)).append("%").toString();
						OverridedJInterface.anInt2747 = 25;
					} else {
						method55(Npc.aClass50_3753.method413(1, true));
						Class140.anInt1338 = 45;
						Class134.aString1283 = Class120_Sub12_Sub1.aString3137;
						OverridedJInterface.anInt2747 = 25;
					}
				} else if (Class140.anInt1338 == 45) {
					Class120_Sub14_Sub14_Sub1.method1546(2, Class167.aBoolean1619, 22050, (byte) -122);
					Class69_Sub1.aClass120_Sub30_Sub2_2230 = new Class120_Sub30_Sub2();
					Class69_Sub1.aClass120_Sub30_Sub2_2230.method1774(128, (byte) -84, 9);
					Class120_Sub12_Sub3.aClass164_3150 = Class120_Sub12_Sub18.method1289(Node.canvas, (byte) -125, 22050, NpcType.gameSignlink, 0);
					Class120_Sub12_Sub3.aClass164_3150.method2143(Class69_Sub1.aClass120_Sub30_Sub2_2230, 8);
					Class120_Sub12_Sub39.method1400(Class69_Sub1.aClass120_Sub30_Sub2_2230, Class120_Sub22.aClass50_2679, Class132.aClass50_1251, false, Class159.aClass50_1490);
					Class120_Sub12_Sub29.aClass164_3366 = Class120_Sub12_Sub18.method1289(Node.canvas, (byte) -126, 2048, NpcType.gameSignlink, 1);
					Class120_Sub12_Sub22.aClass120_Sub30_Sub3_3299 = new Class120_Sub30_Sub3();
					Class120_Sub12_Sub29.aClass164_3366.method2143(Class120_Sub12_Sub22.aClass120_Sub30_Sub3_3299, i + 8);
					ObjectPile.aClass172_1809 = new Decimator(22050, Class178.anInt1771);
					AbstractSprite.anInt3620 = Class120_Sub12_Sub36.aClass50_3419.method432(false, "scape main");
					Class134.aString1283 = Class107.aString1025;
					Class140.anInt1338 = 50;
					OverridedJInterface.anInt2747 = 30;
				} else if (Class140.anInt1338 == 50) {
					final int i_14_ = Class143_Sub1.method2029(Class120_Sub13.aClass50_2576, Class7.aClass50_63, -23185);
					final int i_15_ = Class56.method488(23421);
					if (i_14_ < i_15_) {
						OverridedJInterface.anInt2747 = 35;
						Class134.aString1283 = new StringBuilder(InterfaceClickMask.aString2660).append(100 * i_14_ / i_15_).append("%").toString();
					} else {
						Class134.aString1283 = Class121.aString1155;
						Class140.anInt1338 = 60;
						OverridedJInterface.anInt2747 = 35;
					}
				} else if (Class140.anInt1338 == 60) {
					final int i_16_ = JavaObject.method1434(Class7.aClass50_63, 0);
					final int i_17_ = Class20.method176(false);
					if (i_17_ > i_16_) {
						OverridedJInterface.anInt2747 = 40;
						Class134.aString1283 = new StringBuilder(Class29.aString217).append(i_16_ * 100 / i_17_).append("%").toString();
					} else {
						Class140.anInt1338 = 65;
						OverridedJInterface.anInt2747 = 40;
						Class134.aString1283 = CursorType.aString1239;
					}
				} else if (Class140.anInt1338 == 65) {
					Class8.method109(Class7.aClass50_63, Class120_Sub13.aClass50_2576, (byte) 116);
					Class134.aString1283 = Class120_Sub11.aString2552;
					OverridedJInterface.anInt2747 = 45;
					Class120_Sub14_Sub1.setGameState(5);
					Class140.anInt1338 = 70;
				} else if (Class140.anInt1338 == 70) {
					Class45.aClass50_397.method430(true);
					int i_18_ = 0;
					i_18_ += Class45.aClass50_397.method415(-111);
					Class114.aClass50_1097.method430(true);
					i_18_ += Class114.aClass50_1097.method415(i ^ ~0x78);
					Class169.aClass50_1649.method430(true);
					i_18_ += Class169.aClass50_1649.method415(-118);
					Class120_Sub12_Sub29.aClass50_3367.method430(true);
					i_18_ += Class120_Sub12_Sub29.aClass50_3367.method415(-110);
					Class127.aClass50_1213.method430(true);
					i_18_ += Class127.aClass50_1213.method415(-124);
					Class2.aClass50_50.method430(true);
					i_18_ += Class2.aClass50_50.method415(-122);
					Class120_Sub2.aClass50_2415.method430(true);
					i_18_ += Class120_Sub2.aClass50_2415.method415(-113);
					Class20.aClass50_2169.method430(true);
					i_18_ += Class20.aClass50_2169.method415(-114);
					Class153.aClass50_1433.method430(true);
					i_18_ += Class153.aClass50_1433.method415(-112);
					AbstractMouseWheelHandler.aClass50_115.method430(true);
					i_18_ += AbstractMouseWheelHandler.aClass50_115.method415(-117);
					Class187.aClass50_1907.method430(true);
					i_18_ += Class187.aClass50_1907.method415(-123);
					if (i_18_ < 1100) {
						OverridedJInterface.anInt2747 = 50;
						Class134.aString1283 = new StringBuilder(Class120_Sub3.aString2428).append(i_18_ / 11).append("%").toString();
					} else {
						Class120_Sub14_Sub1.method1414(Class45.aClass50_397, 40);
						Class125.method1881(Class45.aClass50_397, 76);
						SceneGraphNode.method2274(Class45.aClass50_397, 2);
						Class186.method2472(-12879, Class120_Sub12_Sub17.aClass50_3258, Class45.aClass50_397);
						Class166.method2178(i ^ 0x43, Class114.aClass50_1097, true, Class120_Sub12_Sub17.aClass50_3258);
						Class160.method2099(Class120_Sub12_Sub17.aClass50_3258, true, -9746, Class120_Sub12_Sub29.aClass50_3367);
						Player.method2340(Class127.aClass50_1213, Class33.aClass120_Sub14_Sub8_Sub2_274, true, Class120_Sub12_Sub17.aClass50_3258);
						Class76.method665((byte) -69, Class45.aClass50_397);
						Class191.method2509(Class2.aClass50_50, Class79_Sub1.aClass50_2245, Class120_Sub8.aClass50_2479, 31779);
						Class153.method2075((byte) -46, Class45.aClass50_397);
						Class120_Sub12_Sub13.method1266(-1, Class120_Sub2.aClass50_2415, Class120_Sub12_Sub17.aClass50_3258);
						Class120_Sub12_Sub35.method1381(Class20.aClass50_2169, (byte) -94);
						Class15.method145(Class45.aClass50_397, 1024);
						Class191.method2511(Class7.aClass50_63, 5, Class120_Sub13.aClass50_2576, Class33.aClass50_275, Class120_Sub12_Sub17.aClass50_3258);
						Class86.method731(-91, Class45.aClass50_397);
						Class120_Sub11.method1177(-12014, Class169.aClass50_1649);
						InterfaceChangeNode.method1455(AbstractMouseWheelHandler.aClass50_115, new Class125(), Class153.aClass50_1433);
						Class120_Sub12_Sub10.method1249(Class153.aClass50_1433, -26193, AbstractMouseWheelHandler.aClass50_115);
						Class54.method483(Class45.aClass50_397, (byte) -102);
						Class120_Sub12_Sub17.method1287(Class45.aClass50_397, (byte) 117);
						Class120_Sub12_Sub2.method1203(2, Class45.aClass50_397);
						Cache.method189(Class45.aClass50_397, i + 0, Class7.aClass50_63);
						Class3.method79(-8, Class7.aClass50_63, Class45.aClass50_397);
						Class120_Sub21.method1698((byte) -11, Class45.aClass50_397, Class7.aClass50_63);
						OverridedJInterface.anInt2747 = 50;
						Class134.aString1283 = NodeSub.aString2585;
						Class120_Sub14_Sub5.method1441(-123);
						Class140.anInt1338 = 80;
					}
				} else if (Class140.anInt1338 == 80) {
					final int i_19_ = Class120_Sub12_Sub4.method1216(Class7.aClass50_63, -89);
					final int i_20_ = Class45.method358(125);
					if (i_19_ < i_20_) {
						Class134.aString1283 = new StringBuilder(Class120_Sub14_Sub24.aString3665).append(100 * i_19_ / i_20_).append("%").toString();
						OverridedJInterface.anInt2747 = 60;
					} else {
						GameShell.method34(Class7.aClass50_63, (byte) 64);
						Class134.aString1283 = Class120_Sub24.aString2726;
						OverridedJInterface.anInt2747 = 60;
						Class140.anInt1338 = 90;
					}
				} else if (Class140.anInt1338 == 90) {
					if (!Class120_Sub12_Sub15.aClass50_3242.method430(true)) {
						Class134.aString1283 = new StringBuilder(Class120_Sub12_Sub30.aString3371).append(Class120_Sub12_Sub15.aClass50_3242.method415(-112)).append("%").toString();
						OverridedJInterface.anInt2747 = 70;
					} else {
						final Class143_Sub1 class143_sub1 = new Class143_Sub1(Class35.aClass50_303, Class120_Sub12_Sub15.aClass50_3242, Class7.aClass50_63, 20, !Class108_Sub3.highDetailTextures);
						Rasterizer.method864(class143_sub1);
						if (Class120_Sub14_Sub14_Sub1.brightness == 1) {
							Rasterizer.method852(0.9F);
						}
						if (Class120_Sub14_Sub14_Sub1.brightness == 2) {
							Rasterizer.method852(0.8F);
						}
						if (Class120_Sub14_Sub14_Sub1.brightness == 3) {
							Rasterizer.method852(0.7F);
						}
						if (Class120_Sub14_Sub14_Sub1.brightness == 4) {
							Rasterizer.method852(0.6F);
						}
						OverridedJInterface.anInt2747 = 70;
						Class134.aString1283 = Class142.aString1358;
						Class140.anInt1338 = 100;
					}
				} else if (Class140.anInt1338 == 100) {
					if (Class20.method181(0, Class7.aClass50_63)) {
						Class140.anInt1338 = 110;
					}
				} else if (Class140.anInt1338 == 110) {
					Class110.aClass91_1055 = new Class91();
					NpcType.gameSignlink.startThread(Class110.aClass91_1055, 10);
					OverridedJInterface.anInt2747 = 75;
					Class134.aString1283 = Class109.aString1038;
					Class140.anInt1338 = 120;
				} else if (Class140.anInt1338 == 120) {
					if (!Class108_Sub3.aClass50_2400.method410("huffman", (byte) -99, "")) {
						Class134.aString1283 = new StringBuilder(Class45.aString398).append("0%").toString();
						OverridedJInterface.anInt2747 = 80;
					} else {
						final Class126 class126 = new Class126(Class108_Sub3.aClass50_2400.method428(95, "", "huffman"));
						Class84.method720(-96, class126);
						Class134.aString1283 = SceneGroundObject.aString2847;
						OverridedJInterface.anInt2747 = 80;
						Class140.anInt1338 = 130;
					}
				} else if (Class140.anInt1338 == 130) {
					if (!Class33.aClass50_275.method430(true)) {
						Class134.aString1283 = new StringBuilder(IntegerNode.aString2788).append(3 * Class33.aClass50_275.method415(-107) / 4).append("%").toString();
						OverridedJInterface.anInt2747 = 85;
					} else if (!IsaacCipher.aClass50_1019.method430(true)) {
						Class134.aString1283 = new StringBuilder(IntegerNode.aString2788).append(IsaacCipher.aClass50_1019.method415(-107) / 10 + 75).append("%").toString();
						OverridedJInterface.anInt2747 = 85;
					} else if (!Class120_Sub13.aClass50_2576.method430(true)) {
						Class134.aString1283 = new StringBuilder(IntegerNode.aString2788).append(Class120_Sub13.aClass50_2576.method415(-110) / 20 + 85).append("%").toString();
						OverridedJInterface.anInt2747 = 85;
					} else if (!Class120_Sub12_Sub24.aClass50_3309.method435("details", 2)) {
						Class134.aString1283 = new StringBuilder(IntegerNode.aString2788).append(90 - -(Class120_Sub12_Sub24.aClass50_3309.method412("details", (byte) -11) / 10)).append("%").toString();
						OverridedJInterface.anInt2747 = 85;
					} else {
						Class79.method675(Class120_Sub12_Sub24.aClass50_3309);
						ParticleEngine.method945(Class187.aClass50_1907);
						Class41.method334(Class120_Sub12_Sub17.aClass50_3258);
						Class140.anInt1338 = 135;
						OverridedJInterface.anInt2747 = 95;
						Class134.aString1283 = Class84.aString799;
					}
				} else if (Class140.anInt1338 == 135) {
					final int i_21_ = Class96.method788(-44);
					if ((i_21_ ^ 0xffffffff) == 0) {
						Class134.aString1283 = Class114.aString1098;
						OverridedJInterface.anInt2747 = 95;
					} else if (i_21_ == 7 || i_21_ == 9) {
						error("worldlistfull");
						Class120_Sub14_Sub1.setGameState(1000);
					} else if (!Class159.aBoolean1487) {
						error(new StringBuilder("worldlistio_").append(i_21_).toString());
						Class120_Sub14_Sub1.setGameState(1000);
					} else {
						OverridedJInterface.anInt2747 = 96;
						Class140.anInt1338 = 140;
						Class134.aString1283 = Class120_Sub6.aString2444;
					}
				} else if (Class140.anInt1338 == 140) {
					GameShell.loginscreenId = Class33.aClass50_275.method432(false, "loginscreen");
					Class65.aClass50_597.method426(false, true, (byte) -20);
					Class120_Sub12_Sub36.aClass50_3419.method426(true, true, (byte) -20);
					Class7.aClass50_63.method426(true, true, (byte) -20);
					Class120_Sub13.aClass50_2576.method426(true, true, (byte) -20);
					Class108_Sub3.aClass50_2400.method426(true, true, (byte) -20);
					Class33.aClass50_275.method426(true, true, (byte) -20);
					Class193.aBoolean2138 = true;
					Class140.anInt1338 = 150;
					Class134.aString1283 = Class45.aString400;
					OverridedJInterface.anInt2747 = 97;
				} else if (Class140.anInt1338 == 150) {
					Class78.method674();
					if (InterfaceClickMask.safeModeEnabled) {
						Class120_Sub12_Sub19.currentDisplayMode = 0;
						AbstractMouseWheelHandler.anInt117 = 0;
						Class36.antiAliasingSamples = 0;
						Class140.anInt1343 = 0;
					}
					InterfaceClickMask.safeModeEnabled = true;
					Class120_Sub6.savePreferences(NpcType.gameSignlink);
					AbstractSprite.method1593(false, Class120_Sub12_Sub19.currentDisplayMode, -1, -1);
					OverridedJInterface.anInt2747 = 100;
					Class134.aString1283 = World.aString2837;
					Class140.anInt1338 = 160;
				} else if (Class140.anInt1338 == 160) {
					Class120_Sub14_Sub2.method1421(true);
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("client.G(").append(i).append(')').toString());
		}
	}

	@Override
	final void method39(final byte i) {
		try {
			if (HDToolkit.glEnabled) {
				HDToolkit.method519();
			}
			if (Class120_Sub14_Sub10.fullscreenFrame != null) {
				Class150.revertFrame(NpcType.gameSignlink, Class120_Sub14_Sub10.fullscreenFrame);
				Class120_Sub14_Sub10.fullscreenFrame = null;
			}
			if (Class110.aClass91_1055 != null) {
				Class110.aClass91_1055.aBoolean858 = false;
			}
			Class110.aClass91_1055 = null;
			if (AbstractTimer.worldConnection != null) {
				AbstractTimer.worldConnection.close();
				AbstractTimer.worldConnection = null;
			}
			Class26.removeKeyboard(Node.canvas);
			Class35.removeMouse(Node.canvas);
			if (Class120_Sub12_Sub31.mouseWheelHandler != null) {
				Class120_Sub12_Sub31.mouseWheelHandler.removeListener(Node.canvas);
			}
			Class26.method235(false);
			Class193.method2518(-128);
			if (i != 32) {
				method58(null);
			}
			Class120_Sub12_Sub31.mouseWheelHandler = null;
			if (Class120_Sub12_Sub3.aClass164_3150 != null) {
				Class120_Sub12_Sub3.aClass164_3150.method2136(14680);
			}
			if (Class120_Sub12_Sub29.aClass164_3366 != null) {
				Class120_Sub12_Sub29.aClass164_3366.method2136(14680);
			}
			Class178.aClass45_1772.method364(-105);
			Class38.aClass83_319.a(true);
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("client.E(").append(i).append(')').toString());
		}
	}

	static final InterfaceClickMask getClickMask(final JagexInterface jagexInterface) {
		final InterfaceClickMask class120_sub20 = (InterfaceClickMask) JavaObject.clickMaskCache.get(((long) jagexInterface.bitPacked << 32) + jagexInterface.anInt2083);
		return class120_sub20 != null ? class120_sub20 : jagexInterface.clickMask;
	}

	@Override
	final void mainInit() {
		Class120_Sub10.method1168(false);
		Class38.aClass83_319 = new Class83();
		Class178.aClass45_1772 = new Class45();
		if (LocType.modeWhat != 0) {
			Class120_Sub12_Sub25.aByteArrayArray3318 = new byte[50][];
		}
		Class120_Sub14_Sub18.method1577(NpcType.gameSignlink, -7134);
		if (Class107.modeWhere == 0) {
			Class120_Sub12_Sub30.aString3372 = getCodeBase().getHost();
			Hashtable.anInt675 = 43594;
			ObjectPile.anInt1808 = 443;
		} else if (Class107.modeWhere == 1) {
			Class120_Sub12_Sub30.aString3372 = getCodeBase().getHost();
			ObjectPile.anInt1808 = Class136.defaultWorldId + 50000;
			Hashtable.anInt675 = Class136.defaultWorldId + 40000;
		} else if (Class107.modeWhere == 2) {
			Class120_Sub12_Sub30.aString3372 = "127.0.0.1";
			ObjectPile.anInt1808 = Class136.defaultWorldId + 50000;
			Hashtable.anInt675 = Class136.defaultWorldId + 40000;
		}
		Class120_Sub14_Sub22.aShortArray3639 = Class127.aShortArray1214 = Class69_Sub3_Sub1.aShortArray3085 = NodeSub.aShortArray2584 = new short[256];
		if (Signlink.anInt1310 == 3 && Class107.modeWhere != 2) {
			Class157.worldId = Class136.defaultWorldId;
		}
		if (Buffer.gameId != 1) {
			Class159.aShortArrayArray1489 = Class120_Sub12_Sub35.aShortArrayArray3414;
			Class120_Sub12_Sub37.aShortArray3429 = ObjectPile.aShortArray1804;
			Class120_Sub30_Sub1.aShortArrayArray3668 = Class176.aShortArrayArray1764;
			SpotAnimType.aShortArray994 = Class5.aShortArray2152;
		} else {
			Class120_Sub30_Sub1.aShortArrayArray3668 = Class128.aShortArrayArray1221;
			Class120_Sub12_Sub37.aShortArray3429 = Class120_Sub11.aShortArray2556;
			SpotAnimType.aShortArray994 = Class70.aShortArray620;
			Class117.anInt1126 = 16777215;
			Class117.anInt1128 = 0;
			Class120_Sub14_Sub4.aBoolean3470 = true;
			Class159.aShortArrayArray1489 = Class118.aShortArrayArray1136;
		}
		Class71.anInt625 = Hashtable.anInt675;
		GameEntity.anInt3045 = ObjectPile.anInt1808;
		Class120_Sub12_Sub30.aString3375 = Class120_Sub12_Sub30.aString3372;
		Class116.anInt1115 = Hashtable.anInt675;
		Class158.anInt1479 = Class116.anInt1115;
		Class120_Sub12_Sub8.synchronizeKeys();
		Class82.addKeyboard(Node.canvas);
		Class35.addMouse(Node.canvas);
		Class120_Sub12_Sub31.mouseWheelHandler = Class120_Sub12_Sub2.constructMouseWheelHandler();
		if (Class120_Sub12_Sub31.mouseWheelHandler != null) {
			Class120_Sub12_Sub31.mouseWheelHandler.addListener(Node.canvas);
		}
		Class120_Sub12_Sub20.anInt3284 = Signlink.anInt1310;
		try {
			if (NpcType.gameSignlink.aClass95_1295 != null) {
				Class73.aClass193_663 = new Class193(NpcType.gameSignlink.aClass95_1295, 5200, 0);
				for (int i_22_ = 0; i_22_ < 29; i_22_++) {
					Class120_Sub13.aClass193Array2581[i_22_] = new Class193(NpcType.gameSignlink.aClass95Array1307[i_22_], 6000, 0);
				}
				Class86.aClass193_822 = new Class193(NpcType.gameSignlink.aClass95_1304, 6000, 0);
				Class120_Sub12_Sub5.aClass51_3164 = new FileSystem(255, Class73.aClass193_663, Class86.aClass193_822, 500000);
				Class10.aClass193_78 = new Class193(NpcType.gameSignlink.aClass95_1296, 24, 0);
				NpcType.gameSignlink.aClass95_1304 = null;
				NpcType.gameSignlink.aClass95Array1307 = null;
				NpcType.gameSignlink.aClass95_1295 = null;
				NpcType.gameSignlink.aClass95_1296 = null;
			}
		} catch (final IOException ioexception) {
			Class10.aClass193_78 = null;
			Class86.aClass193_822 = null;
			Class120_Sub12_Sub5.aClass51_3164 = null;
			Class73.aClass193_663 = null;
		}
		if (Class107.modeWhere != 0) {
			Class85.showFps = true;
		}
		if (Buffer.gameId == 0) {
			Class120_Sub14_Sub15.aString3585 = Class120_Sub12_Sub18.aString3272;
		} else if (Buffer.gameId == 1) {
			Class120_Sub14_Sub15.aString3585 = Class108_Sub3.aString2396;
		}
	}

	private final void method55(final byte[] is) {
		final Buffer class120_sub7 = new Buffer(is);
		for (;;) {
			final int i_23_ = class120_sub7.getUByte();
			if (i_23_ == 0) {
				break;
			}
			if (i_23_ == 1) {
				final int[] is_24_ = World.anIntArray2835 = new int[6];
				is_24_[0] = class120_sub7.getUShort();
				is_24_[1] = class120_sub7.getUShort();
				is_24_[2] = class120_sub7.getUShort();
				is_24_[3] = class120_sub7.getUShort();
				is_24_[4] = class120_sub7.getUShort();
				is_24_[5] = class120_sub7.getUShort();
			}
		}
	}

	private final void method56(final byte i) {
		do {
			try {
				final boolean bool = Class178.aClass45_1772.method371(-27018);
				if (!bool) {
					method57((byte) 55);
				}
				if (i >= -19) {
					break;
				}
			} catch (final RuntimeException runtimeexception) {
				throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("client.J(").append(i).append(')').toString());
			}
		} while (false);
	}

	private final void method57(final byte i) {
		do {
			try {
				if (Class178.aClass45_1772.anInt410 > Class116.anInt1113) {
					Buffer.anInt2473 = (-50 + 50 * Class178.aClass45_1772.anInt410) * 5;
					if (Buffer.anInt2473 > 3000) {
						Buffer.anInt2473 = 3000;
					}
					if (Class158.anInt1479 != Class71.anInt625) {
						Class158.anInt1479 = Class71.anInt625;
					} else {
						Class158.anInt1479 = GameEntity.anInt3045;
					}
					if (Class178.aClass45_1772.anInt410 >= 2 && Class178.aClass45_1772.anInt411 == 6) {
						error("js5connect_outofdate");
						Class109.gameState = 1000;
						break;
					}
					if (Class178.aClass45_1772.anInt410 >= 4 && Class178.aClass45_1772.anInt411 == -1) {
						error("js5crc");
						Class109.gameState = 1000;
						break;
					}
					if (Class178.aClass45_1772.anInt410 >= 4 && (Class109.gameState == 0 || Class109.gameState == 5)) {
						if (Class178.aClass45_1772.anInt411 == 7 || Class178.aClass45_1772.anInt411 == 9) {
							error("js5connect_full");
						} else if (Class178.aClass45_1772.anInt411 <= 0) {
							error("js5io");
						} else {
							error("js5connect");
						}
						Class109.gameState = 1000;
						break;
					}
				}
				Class116.anInt1113 = Class178.aClass45_1772.anInt410;
				if (Buffer.anInt2473 > 0) {
					Buffer.anInt2473--;
				} else {
					try {
						if (Class120_Sub12_Sub33.anInt3406 == 0) {
							GroundTile.aClass185_2630 = NpcType.gameSignlink.openConnection(Class120_Sub12_Sub30.aString3375, Class158.anInt1479);
							Class120_Sub12_Sub33.anInt3406++;
						}
						if (Class120_Sub12_Sub33.anInt3406 == 1) {
							if (GroundTile.aClass185_2630.status == 2) {
								method51(true, 1000);
								break;
							}
							if (GroundTile.aClass185_2630.status == 1) {
								Class120_Sub12_Sub33.anInt3406++;
							}
						}
						if (i != 55) {
							cameraType = -95;
						}
						if (Class120_Sub12_Sub33.anInt3406 == 2) {
							Class120_Sub12_Sub11.aClass46_3215 = new JagexSocket((Socket) GroundTile.aClass185_2630.value, NpcType.gameSignlink);
							final Buffer class120_sub7 = new Buffer(5);
							class120_sub7.putByte(15);
							class120_sub7.putInt(550);
							Class120_Sub12_Sub11.aClass46_3215.put(class120_sub7.buf, 0, 5);
							Class120_Sub12_Sub33.anInt3406++;
							Class120_Sub12_Sub4.aLong3158 = TimeUtil.getSafeTime();
						}
						if (Class120_Sub12_Sub33.anInt3406 == 3) {
							if (Class109.gameState != 0 && Class109.gameState != 5 && Class120_Sub12_Sub11.aClass46_3215.getAvailable() <= 0) {
								if ((-Class120_Sub12_Sub4.aLong3158 + TimeUtil.getSafeTime() ^ 0xffffffffffffffffL) < -30001L) {
									method51(true, 1001);
									break;
								}
							} else {
								final int i_25_ = Class120_Sub12_Sub11.aClass46_3215.read();
								if (i_25_ != 0) {
									method51(true, i_25_);
									break;
								}
								Class120_Sub12_Sub33.anInt3406++;
							}
						}
						if (Class120_Sub12_Sub33.anInt3406 == 4) {
							final boolean bool = Class109.gameState == 5 || Class109.gameState == 10 || Class109.gameState == 28;
							Class178.aClass45_1772.method361(101, Class120_Sub12_Sub11.aClass46_3215, !bool);
							GroundTile.aClass185_2630 = null;
							Class120_Sub12_Sub33.anInt3406 = 0;
							Class120_Sub12_Sub11.aClass46_3215 = null;
						}
					} catch (final IOException ioexception) {
						method51(true, 1002);
						break;
					}
				}
				break;
			} catch (final RuntimeException runtimeexception) {
				throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("client.N(").append(i).append(')').toString());
			}
		} while (false);
	}

	static final JagexInterface method58(JagexInterface jagexInterface) {
		final int i = getClickMask(jagexInterface).method1683((byte) 45);
		if (i == 0) {
			return null;
		}
		for (int i_26_ = 0; i_26_ < i; i_26_++) {
			jagexInterface = Class74.getJagexInterface(jagexInterface.parent);
			if (jagexInterface == null) {
				return null;
			}
		}
		return jagexInterface;
	}

	@Override
	final void method40(final byte i) {
		try {
			ParticleEngine.method951();
			Class32.method269(-20507);
			Class80.method697(-1);
			Class79.method681();
			Class120_Sub14_Sub22.method1637(false);
			Class137.method1981((byte) -97);
			GameShell.method35(43);
			HDToolkit.method516();
			AbstractTimer.method736(-66);
			AbstractGraphicsBuffer.method1848(84167136);
			Class91.method762((byte) -59);
			Class85.method726(255);
			Buffer.method1076((byte) 124);
			JagexSocket.method372(14420);
			Class45.method359(-29587);
			Class83.a(31425);
			Class112.method988((byte) -58);
			Class53_Sub1.method468((byte) -82);
			Class193.method2523((byte) 35);
			FileSystem.method445(255);
			Cache.method188(114);
			Npc.method2347(2980);
			PacketBuffer.method1150((byte) 95);
			Class25.method217(4624);
			JagexInterface.method2498(-107);
			DisplayModeInfo.method2216(true);
			AbstractSprite.method1586(16);
			AbstractMouseWheelHandler.method157(11170);
			Class120_Sub13.method1406(-31470);
			Class160.method2098(1);
			Class120_Sub30_Sub2.method1776(16990);
			Decimator.method2222(false);
			PlayerAppearance.method2034(-22374);
			SeqType.method329(1);
			GameEntity.method2331(-70);
			GroundTile.method1672(14888);
			Class120_Sub24.method1718((byte) -76);
			NpcType.method2200(true);
			OverridedJInterface.method1723(-11);
			InterfaceClickMask.method1684(1023);
			Class173.method2229((byte) 59);
			Node.method1030(71);
			IsaacCipher.method902(2);
			Class65.method577((byte) 77);
			Class120_Sub14_Sub18.method1582((byte) -49);
			Class150.method2062(-23191);
			Class10.method120((byte) 116);
			Class55.method484(-7103);
			Class38.method312(-1);
			Class174.method2232(0);
			Class9.method118(104);
			Class158.method2091(-78);
			Class169.method2198(true);
			RuntimeException_Sub1.method2529(-16553);
			Class71.method638((byte) -103);
			Class34.method287();
			Class39.method318(-66);
			Class116.method1010((byte) 104);
			Class120_Sub14_Sub14_Sub1.method1543(-70);
			Class120_Sub14_Sub14_Sub2.method1549(-127);
			Class93.method773(1);
			Class86.method732(false);
			LocType.method2462(20259);
			Class156.method2086(-2366);
			Class117.method1019();
			Class136.method1979(64);
			Class180_Sub2.method2289();
			Class88.method745(true);
			Class180_Sub7_Sub2.method2406();
			ObjType.method2119(2);
			Class180_Sub7_Sub1.method2394();
			KeyboardHandler.method2101(-123);
			Class148.method2059(1);
			Class90.method750((byte) 54);
			Class113.method997();
			Class37.method310();
			Class82.method714((byte) -78);
			Canvas_Sub1.method61((byte) 25);
			Class179.method2259(27440);
			Class107.method909(true);
			Class120_Sub14_Sub8.method1479();
			Class111.method983(212098599);
			Class120_Sub6.method1072(false);
			Class62.method565();
			Class120_Sub30_Sub1.method1742(1970740129);
			Class120_Sub22.method1703(-104);
			Class79_Sub1.method694(81);
			Class120_Sub14_Sub5.method1439(-28811);
			Class98.method814();
			Class127.method1894((byte) -128);
			Class73.method649((byte) -41);
			Class53.method456((byte) 126);
			Class52.method454(true);
			Class120_Sub14_Sub14.method1536(false);
			Class74.method651(false);
			GraphicsLD.method2163();
			Class178.method2258((byte) -106);
			Class84.method719((byte) 91);
			Class120_Sub14_Sub11.method1513(-1);
			NodeSub.method1409(88);
			Class35.method298(-51);
			Class124.method1876((byte) 16);
			Class54.method481(126);
			Class128.method1902((byte) -110);
			Class139.method1983(0);
			Class120_Sub14_Sub16.method1560(50);
			Class81.method703(26683);
			Class154.method2080(-2322);
			Class29.method256((byte) -63);
			SpotAnimType.method878(0);
			Class70.method634(true);
			Class41.method332();
			Class120_Sub14_Sub2.method1424(0);
			Class120_Sub14_Sub10.method1509(true);
			Class125.method1880((byte) 124);
			Class120_Sub14_Sub23.method1641(32768);
			Class145.method2049(-5868);
			Class97.method805();
			Class153.method2071((byte) 56);
			Class181.method2438(0);
			Light.method352((byte) -93);
			CursorType.method1915(-23239);
			Class142.method2012(0);
			Class143_Sub1.method2031((byte) 65);
			Class143.method2017((byte) -10);
			Class114.method1003((byte) -104);
			Class120_Sub14_Sub13.method1527(51);
			Class120_Sub14_Sub17.method1574();
			Class120_Sub14_Sub15.method1555(-104);
			Rasterizer.method872();
			Class2.method78((byte) -54);
			Class15.method146(-128);
			Class166.method2179((byte) 12);
			World.method2192(-33);
			Class92.method765((byte) -118);
			WorldInfo.method2068(false);
			Class78.method669();
			Class191.method2507((byte) -64);
			Class120_Sub14_Sub9.method1493();
			Class187.method2476((byte) 80);
			Class23.method203(5);
			Class176.method2245((byte) -128);
			Class22.method195(-63361369);
			Class120_Sub10.method1169((byte) -111);
			Class120_Sub14_Sub12.method1523(37);
			SceneGraphNode.method2270((byte) -54);
			Class120_Sub9.method1164();
			Class28.method245(8856);
			Class182.method2442((byte) 20);
			Class186.method2474(10262);
			Class36.method308(30900);
			ObjectPile.method2449((byte) -91);
			Class141.method2002(0);
			Class168.method2197();
			Class120_Sub1.method1038(5);
			Class43.method344((byte) 93);
			Class118.method1023(-80);
			Class1.method75();
			LightManager.method1868();
			Class47.method390();
			Class94.method779();
			Class48.method402((byte) -123);
			Class61.method554((byte) 73);
			Class49.method407(0);
			Class12.method132();
			GraphicsHD.method593();
			Class163.method2128();
			Class120_Sub2.method1044(17616);
			Class3.method80(1);
			Class192.method2516((byte) 111);
			if (i >= 85) {
				Class120_Sub3.method1058(1);
				InterfaceChangeNode.method1451(120);
				Class120_Sub17.method1666((byte) 78);
				Class120_Sub8.method1157(0);
				Class110.method977((byte) -97);
				Class175.method2239();
				Class11.method129(34);
				Class190.method2505(true);
				Class89.method747((byte) 121);
				Class100.method824((byte) 108);
				Class180_Sub4.method2321(13);
				Class180_Sub3.method2316(-89);
				Class147.method2056(-23477);
				SceneGroundObject.method2277(28072);
				Class120_Sub29.method1729(8);
				Class180_Sub6.method2351(-1);
				Class140.method1999((byte) 127);
				Class120_Sub14_Sub24.method1646(0);
				Class108_Sub3.method966(-61);
				IntegerNode.method1832(0);
				Class59.method543();
				Class120_Sub4.method1065((byte) 43);
				CanvasWrapper.method67((byte) -124);
				Class7.method105(128);
				ProducingGraphicsBuffer.method1852(-1);
				Class26.method231((byte) 84);
				Class159.method2093(30000);
				Class56.method490(-124);
				Class19.method172();
				Class96.method790(12345678);
				JavaObject.method1433(0);
				Class57.method491(-18);
				Class120_Sub11.method1175((byte) -58);
				Class157.method2089(118);
				Class164_Sub2.method2149();
				Class146.method2051();
				StringNode.method1719(58);
				Class121.method1836(115);
				Class76.method664(100);
				Class134.method1950(-9077);
				Class60.method551();
				Class14.method144();
				Class20.method183((byte) -27);
				Class5.method100(-22938);
				Class131.method1921();
				Class31.method266(false);
				Class120_Sub23.method1713();
				Class16.method151();
				Class120_Sub21.method1696(26213);
				Class120_Sub12_Sub12.method1260((byte) -128);
				Class132.method1929(0);
				Class120_Sub12.method1178(-126);
				Class109.method974(126);
				Class30.method260(125);
				Class99.method823(-3237);
				Class120_Sub12_Sub24.method1327((byte) -84);
				Class120_Sub12_Sub21.method1310(1);
				Class120_Sub12_Sub8.method1238(23086);
				Class167.method2188((byte) 122);
				Class132_Sub1.method1935(2061936524);
				Class24.method206((byte) -102);
				Class68.method602();
				Class120_Sub28.method1724(0);
				Class8.method112((byte) -64);
				Class33.method278(0);
				Class120_Sub12_Sub11.method1252(-129);
				Class120_Sub12_Sub23.method1324(-1);
				Class120_Sub12_Sub7.method1235(false);
				Class120_Sub12_Sub33.method1375((byte) 89);
				Class120_Sub12_Sub38.method1396(1);
				Class120_Sub12_Sub4.method1212(128);
				Class120_Sub12_Sub32.method1374((byte) -26);
				Class120_Sub12_Sub20.method1300(-108);
				Class120_Sub12_Sub9.method1246(23665);
				Class120_Sub12_Sub39.method1401(115);
				Class120_Sub12_Sub3.method1205(0);
				Class120_Sub12_Sub37.method1393(false);
				Class120_Sub12_Sub30.method1361(108);
				Class120_Sub12_Sub16.method1280(-6473);
				Class120_Sub12_Sub27.method1343(55);
				Class120_Sub12_Sub25.method1330(0);
				Class120_Sub12_Sub17.method1286(12288);
				Class120_Sub12_Sub21_Sub1.method1314((byte) 113);
				Class120_Sub12_Sub22.method1320((byte) -98);
				Class120_Sub12_Sub15.method1274(false);
				Class120_Sub12_Sub10.method1248((byte) -14);
				Class120_Sub12_Sub34.method1378(8);
				Class120_Sub12_Sub36.method1388((byte) 27);
				Class120_Sub12_Sub35.method1386((byte) -39);
				Class120_Sub12_Sub2.method1204(18253);
				Class120_Sub12_Sub18.method1292((byte) -98);
				Class120_Sub12_Sub28.method1348(-4000);
				Class120_Sub12_Sub1.method1197(true);
				Class120_Sub12_Sub14.method1273(1);
				Class120_Sub12_Sub29.method1353(true);
				Class120_Sub12_Sub6.method1228(0);
				Class120_Sub12_Sub5.method1221(-23112);
				Class120_Sub12_Sub19.method1295(true);
				Class120_Sub12_Sub31.method1366(1);
				Class120_Sub12_Sub26.method1338(-9465);
				Class120_Sub12_Sub13.method1267(-1);
				Class69_Sub3.method624((byte) 56);
				Class69.method615(0);
				Class69_Sub3_Sub1.method629(-95);
				Class69_Sub1.method617((byte) -96);
				Class69_Sub2_Sub1.method621(-4112);
				Class69_Sub2.method619(0);
				GroundObjectNode.method1626(7581);
				Class120_Sub14_Sub1.method1412(0);
				Class120_Sub14_Sub4.method1436(55);
				DummyInputStream.method70(false);
				DummyOutputStream.method74(-109);
				Class120_Sub16.method1655(true);
				Class120_Sub15.method1653(-3909);
				Class120_Sub19.method1674(6530);
				Class101.method838(19442);
				Class101_Sub2.method845(-1739218740);
				Class101_Sub4.method850((byte) -34);
				Class101_Sub3.method847(-1);
				Class101_Sub1.method839((byte) 116);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("client.L(").append(i).append(')').toString());
		}
	}

	@Override
	public final void init() {
		if (checkHost()) {
			Class136.defaultWorldId = Integer.parseInt(getParameter("worldid"));
			Class107.modeWhere = Integer.parseInt(getParameter("modewhere"));
			if (Class107.modeWhere < 0 || Class107.modeWhere > 1) {
				Class107.modeWhere = 0;
			}
			LocType.modeWhat = Integer.parseInt(getParameter("modewhat"));
			if (LocType.modeWhat < 0 || LocType.modeWhat > 2) {
				LocType.modeWhat = 0;
			}
			final String string = getParameter("advertsuppressed");
			if (string != null && string.equals("1")) {
				Class31.advertSuppressed = true;
			} else {
				Class31.advertSuppressed = false;
			}
			try {
				Class9.language = Integer.parseInt(getParameter("lang"));
			} catch (final Exception exception) {
				Class9.language = 0;
			}
			Class120_Sub12_Sub11.translateStrings(Class9.language);
			final String string_27_ = getParameter("objecttag");
			if (string_27_ == null || !string_27_.equals("1")) {
				Class110.objectTagEnabled = false;
			} else {
				Class110.objectTagEnabled = true;
			}
			final String string_28_ = getParameter("js");
			if (string_28_ != null && string_28_.equals("1")) {
				Class48.jsEnabled = true;
			} else {
				Class48.jsEnabled = false;
			}
			final String string_29_ = getParameter("game");
			if (string_29_ != null && string_29_.equals("1")) {
				Buffer.gameId = 1;
			} else {
				Buffer.gameId = 0;
			}
			try {
				Class120_Sub12_Sub33.affiliateId = Integer.parseInt(getParameter("affid"));
			} catch (final Exception exception) {
				Class120_Sub12_Sub33.affiliateId = 0;
			}
			Class120_Sub12_Sub25.settings = getParameter("settings");
			if (Class120_Sub12_Sub25.settings == null) {
				Class120_Sub12_Sub25.settings = "";
			}
			final String string_30_ = getParameter("country");
			if (string_30_ != null) {
				try {
					Node.countryId = Integer.parseInt(string_30_);
				} catch (final Exception exception) {
					Node.countryId = 0;
				}
			}
			final String string_31_ = getParameter("haveie6");
			if (string_31_ != null && string_31_.equals("1")) {
				FileSystem.haveInternetExplorer6 = true;
			} else {
				FileSystem.haveInternetExplorer6 = false;
			}
			Class179.aClient1776 = this;
			startApplet(1550, LocType.modeWhat + 32, 503, 765);
		}
	}

	public static final void main(final String[] strings) {
		try {
			if (strings.length != 4) {
				Class43.method345("argument count");
			}
			Class136.defaultWorldId = Integer.parseInt(strings[0]);
			Class107.modeWhere = 2;
			if (strings[1].equals("live")) {
				LocType.modeWhat = 0;
			} else if (strings[1].equals("rc")) {
				LocType.modeWhat = 1;
			} else if (strings[1].equals("wip")) {
				LocType.modeWhat = 2;
			} else {
				Class43.method345("modewhat");
			}
			Class31.advertSuppressed = false;
			Class9.language = DummyInputStream.getLanguageId(strings[2]);
			if (Class9.language != 0) {
				if (strings[2].equals("english")) {
					Class9.language = 0;
				} else if (strings[2].equals("german")) {
					Class9.language = 1;
				} else {
					Class43.method345("language");
				}
			}
			Class120_Sub12_Sub11.translateStrings(Class9.language);
			Class48.jsEnabled = false;
			Class110.objectTagEnabled = false;
			if (strings[3].equals("game0")) {
				Buffer.gameId = 0;
			} else if (strings[3].equals("game1")) {
				Buffer.gameId = 1;
			} else {
				Class43.method345("game");
			}
			Class120_Sub12_Sub25.settings = "";
			FileSystem.haveInternetExplorer6 = false;
			Node.countryId = 0;
			Class120_Sub12_Sub33.affiliateId = 0;
			final client var_client = new client();
			Class179.aClient1776 = var_client;
			var_client.startApplication(Buffer.gameId != 1 ? "runescape" : "mechscape", 32 + LocType.modeWhat, 550, 29, 768, 1024);
			Class112.frame.setLocation(40, 40);
		} catch (final Exception exception) {
			Class180_Sub3.method2312(exception, null);
		}
	}

	static final boolean method59(final JagexInterface jagexInterface) {
		if (Class120_Sub30_Sub1.aBoolean3673) {
			if (getClickMask(jagexInterface).anInt2662 != 0) {
				return false;
			}
			if (jagexInterface.type == 0) {
				return false;
			}
		}
		return jagexInterface.hidden;
	}

	@Override
	final void mainRedraw() {
		if (Class109.gameState != 1000) {
			final long l = Class29.method255(30542) / 1000000L - Class20.aLong2173;
			Class20.aLong2173 = Class29.method255(30542) / 1000000L;
			final boolean bool = Class120_Sub12_Sub5.method1220((byte) 127);
			if (bool && Class120_Sub12_Sub15.aBoolean3247 && Class120_Sub12_Sub3.aClass164_3150 != null) {
				Class120_Sub12_Sub3.aClass164_3150.method2144((byte) -42);
			}
			if ((Class109.gameState == 30 || Class109.gameState == 10) && (Class120_Sub3.canvasReplaceRecommended || Class15.aLong98 != 0L && (Class15.aLong98 ^ 0xffffffffffffffffL) > (TimeUtil.getSafeTime() ^ 0xffffffffffffffffL))) {
				AbstractSprite.method1593(Class120_Sub3.canvasReplaceRecommended, Class120_Sub12_Sub4.getDisplayMode(), Class120_Sub12_Sub18.lastFullscreenWidth, Class120_Sub12_Sub12.lastFullscreenHeight);
			}
			if (Class120_Sub14_Sub10.fullscreenFrame == null) {
				Container container;
				if (Class120_Sub14_Sub10.fullscreenFrame != null) {
					container = Class120_Sub14_Sub10.fullscreenFrame;
				} else if (Class112.frame == null) {
					container = NpcType.gameSignlink.gameApplet;
				} else {
					container = Class112.frame;
				}
				int i_32_ = container.getSize().width;
				int i_33_ = container.getSize().height;
				if (Class112.frame == container) {
					final Insets insets = Class112.frame.getInsets();
					i_32_ -= insets.left - -insets.right;
					i_33_ -= insets.bottom + insets.top;
				}
				if (Class120_Sub12_Sub7.frameWidth != i_32_ || PlayerAppearance.frameHeight != i_33_) {
					if (!Signlink.osName.startsWith("mac")) {
						Class120_Sub10.method1168(false);
					} else {
						Class120_Sub12_Sub7.frameWidth = i_32_;
						PlayerAppearance.frameHeight = i_33_;
					}
					Class15.aLong98 = TimeUtil.getSafeTime() + 500L;
				}
			}
			if (Class120_Sub14_Sub10.fullscreenFrame != null && !DummyInputStream.focus && (Class109.gameState == 30 || Class109.gameState == 10)) {
				AbstractSprite.method1593(false, Class120_Sub12_Sub19.currentDisplayMode, -1, -1);
			}
			boolean bool_34_ = false;
			if (Class120_Sub12_Sub26.fullRedraw) {
				bool_34_ = true;
				Class120_Sub12_Sub26.fullRedraw = false;
			}
			if (bool_34_) {
				Class120_Sub12_Sub22.method1322();
			}
			if (HDToolkit.glEnabled) {
				for (int i_35_ = 0; i_35_ < 100; i_35_++) {
					Class52.aBooleanArray467[i_35_] = true;
				}
			}
			if (Class109.gameState != 0) {
				if (Class109.gameState == 5) {
					Class128.method1909(false, Class120_Sub12_Sub22.boldFont, false);
				} else if (Class109.gameState != 10) {
					if (Class109.gameState != 25 && Class109.gameState != 28) {
						if (Class109.gameState != 30) {
							if (Class109.gameState == 40) {
								Class120_Sub12_Sub21_Sub1.drawTextOnScreen(new StringBuilder(Class116.aString1116).append("<br>").append(Class24.aString142).toString(), false);
							}
						} else {
							Decimator.method2219(l);
						}
					} else if (Class120_Sub12_Sub28.anInt3361 == 1) {
						if (Class66.anInt599 > Class145.anInt1379) {
							Class145.anInt1379 = Class66.anInt599;
						}
						final int i_36_ = (Class145.anInt1379 + -Class66.anInt599) * 50 / Class145.anInt1379;
						Class120_Sub12_Sub21_Sub1.drawTextOnScreen(new StringBuilder(Class120_Sub30_Sub2.aString3679).append("<br>(").append(i_36_).append("%)").toString(), false);
					} else if (Class120_Sub12_Sub28.anInt3361 == 2) {
						if (Class181.anInt1791 > Class120_Sub12_Sub37.anInt3431) {
							Class120_Sub12_Sub37.anInt3431 = Class181.anInt1791;
						}
						final int i_37_ = 50 * (Class120_Sub12_Sub37.anInt3431 + -Class181.anInt1791) / Class120_Sub12_Sub37.anInt3431 + 50;
						Class120_Sub12_Sub21_Sub1.drawTextOnScreen(new StringBuilder(Class120_Sub30_Sub2.aString3679).append("<br>(").append(i_37_).append("%)").toString(), false);
					} else {
						Class120_Sub12_Sub21_Sub1.drawTextOnScreen(Class120_Sub30_Sub2.aString3679, false);
					}
				} else {
					SceneGroundObject.method2276(7878);
				}
			} else {
				Class11.method126(null, bool_34_, false, OverridedJInterface.anInt2747, Class134.aString1283);
			}
			if (!HDToolkit.glEnabled || Class109.gameState == 0) {
				if (Class109.gameState != 30 && Class109.gameState != 10 || Class15.anInt96 != 0 || bool_34_) {
					if (Class109.gameState != 0) {
						try {
							final Graphics graphics = Node.canvas.getGraphics();
							Class120_Sub13.fullscreenGraphics.drawImage(graphics, 0, 0);
							for (int i_38_ = 0; Class120_Sub1.anInt2414 > i_38_; i_38_++) {
								Class120_Sub12_Sub33.aBooleanArray3391[i_38_] = false;
							}
						} catch (final Exception exception) {
							Node.canvas.repaint();
						}
					}
				} else {
					try {
						final Graphics graphics = Node.canvas.getGraphics();
						for (int i_39_ = 0; i_39_ < Class120_Sub1.anInt2414; i_39_++) {
							if (Class120_Sub12_Sub33.aBooleanArray3391[i_39_]) {
								Class120_Sub13.fullscreenGraphics.drawClippedImage(graphics, Class69_Sub3_Sub1.anIntArray3081[i_39_], Class120_Sub16.anIntArray2608[i_39_], Class120_Sub12_Sub38.anIntArray3441[i_39_], Class160.anIntArray1495[i_39_]);
								Class120_Sub12_Sub33.aBooleanArray3391[i_39_] = false;
							}
						}
					} catch (final Exception exception) {
						Node.canvas.repaint();
					}
				}
			} else {
				HDToolkit.method536();
				for (int i_40_ = 0; Class120_Sub1.anInt2414 > i_40_; i_40_++) {
					Class120_Sub12_Sub33.aBooleanArray3391[i_40_] = false;
				}
			}
			if (Class193.aBoolean2138) {
				Class120_Sub14_Sub16.method1562((byte) 23);
			}
			if (InterfaceClickMask.safeModeEnabled && Class109.gameState == 10 && Class69.rootInterfaceId != -1) {
				InterfaceClickMask.safeModeEnabled = false;
				Class120_Sub6.savePreferences(NpcType.gameSignlink);
			}
		}
	}

	@Override
	final void mainLoop() {
		if (Class109.gameState != 1000) {
			Class101_Sub2.loopCycle++;
			if (Class101_Sub2.loopCycle % 1000 == 1) {
				final GregorianCalendar gregoriancalendar = new GregorianCalendar();
				Class52.anInt478 = 600 * gregoriancalendar.get(11) - -(10 * gregoriancalendar.get(12)) + gregoriancalendar.get(13) / 6;
				Class136.aRandom1319.setSeed(Class52.anInt478);
			}
			method56((byte) -107);
			if (Class120_Sub14_Sub2.aClass112_3460 != null) {//js5
				Class120_Sub14_Sub2.aClass112_3460.method985(true);
			}
			Class142.method2005(123);
			Class120_Sub2.method1050();
			Class141.method2001(-25078);
			Class26.handleMouse();
			if (HDToolkit.glEnabled) {
				Class113.method998();
			}
			if (Class120_Sub12_Sub31.mouseWheelHandler != null) {
				final int i = Class120_Sub12_Sub31.mouseWheelHandler.getRotation();
				Class66.anInt598 = i;
			}
			if (Class109.gameState == 0) {
				method53(0);
				Class69.method613((byte) 53);
			} else if (Class109.gameState == 5) {
				method53(0);
				Class69.method613((byte) 53);
			} else if (Class109.gameState == 25 || Class109.gameState == 28) {
				Class164.method2135(-6);
			}
			if (Class109.gameState == 10) {
				method50(0);
				Class69_Sub3_Sub1.method631((byte) -126);
				JagexSocket.method374(22773);
				Class120_Sub12_Sub25.handleLogin();
			} else if (Class109.gameState == 30) {
				Class120_Sub21.method1700(-79);
			} else if (Class109.gameState == 40) {
				Class120_Sub12_Sub25.handleLogin();
				if (Class48.returnCode != -3) {
					if (Class48.returnCode != 15) {
						if (Class48.returnCode != 2) {
							DummyInputStream.processLogout();
						}
					} else {
						Class120_Sub16.method1663(0);
					}
				}
			}
		}
	}

	static final void method60(final JagexInterface[] class189s, final int i, final int i_41_, final int i_42_, final int i_43_, final int i_44_, final int i_45_, final int i_46_) {
		for (int i_47_ = 0; i_47_ < class189s.length; i_47_++) {
			final JagexInterface jagexInterface = class189s[i_47_];
			if (jagexInterface != null && jagexInterface.parent == i && (!jagexInterface.aBoolean2041 || jagexInterface.type == 0 || jagexInterface.aBoolean1940 || getClickMask(jagexInterface).anInt2662 != 0 || jagexInterface == Class26.aClass189_161 || jagexInterface.clientCode == 1338) && (!jagexInterface.aBoolean2041 || !method59(jagexInterface))) {
				final int i_48_ = jagexInterface.x + i_45_;
				final int i_49_ = jagexInterface.y + i_46_;
				int i_50_;
				int i_51_;
				int i_52_;
				int i_53_;
				if (jagexInterface.type == 2) {
					i_50_ = i_41_;
					i_51_ = i_42_;
					i_52_ = i_43_;
					i_53_ = i_44_;
				} else {
					int i_54_ = i_48_ + jagexInterface.anInt1948;
					int i_55_ = i_49_ + jagexInterface.anInt2059;
					if (jagexInterface.type == 9) {
						i_54_++;
						i_55_++;
					}
					i_50_ = i_48_ > i_41_ ? i_48_ : i_41_;
					i_51_ = i_49_ > i_42_ ? i_49_ : i_42_;
					i_52_ = i_54_ < i_43_ ? i_54_ : i_43_;
					i_53_ = i_55_ < i_44_ ? i_55_ : i_44_;
				}
				if (jagexInterface == Class120_Sub12_Sub4.aClass189_3156) {
					WorldInfo.aBoolean1419 = true;
					Class120_Sub12_Sub17.anInt3264 = i_48_;
					Class9.anInt77 = i_49_;
				}
				if (!jagexInterface.aBoolean2041 || i_50_ < i_52_ && i_51_ < i_53_) {
					if (jagexInterface.type == 0) {
						if (!jagexInterface.aBoolean2041 && method59(jagexInterface) && CursorType.aClass189_1243 != jagexInterface) {
							continue;
						}
						if (jagexInterface.aBoolean1960 && Queue.lastMouseX >= i_50_ && Class191.lastMouseY >= i_51_ && Queue.lastMouseX < i_52_ && Class191.lastMouseY < i_53_) {
							for (Class120_Sub10 class120_sub10 = (Class120_Sub10) Class88.aClass105_829.getFront(); class120_sub10 != null; class120_sub10 = (Class120_Sub10) Class88.aClass105_829.getNext()) {
								if (class120_sub10.aBoolean2536) {
									class120_sub10.unlink();
									class120_sub10.aClass189_2534.aBoolean2035 = false;
								}
							}
							if (SceneGroundObject.anInt2843 == 0) {
								Class120_Sub12_Sub4.aClass189_3156 = null;
								Class26.aClass189_161 = null;
							}
							Class120_Sub14_Sub2.anInt3450 = 0;
							Class80.aBoolean742 = false;
						}
					}
					if (jagexInterface.aBoolean2041) {
						boolean bool;
						if (Queue.lastMouseX >= i_50_ && Class191.lastMouseY >= i_51_ && Queue.lastMouseX < i_52_ && Class191.lastMouseY < i_53_) {
							bool = true;
						} else {
							bool = false;
						}
						boolean bool_56_ = false;
						if (InterfaceChangeNode.lastMousePress == 1 && bool) {
							bool_56_ = true;
						}
						boolean bool_57_ = false;
						if (Class156.lastMouseClick == 1 && Class50.lastClickX >= i_50_ && Class120_Sub12_Sub36.lastClickY >= i_51_ && Class50.lastClickX < i_52_ && Class120_Sub12_Sub36.lastClickY < i_53_) {
							bool_57_ = true;
						}
						if (jagexInterface.aByteArray2048 != null) {
							for (int i_58_ = 0; i_58_ < jagexInterface.aByteArray2048.length; i_58_++) {
								if (!Class35.aBooleanArray299[jagexInterface.aByteArray2048[i_58_]]) {
									if (jagexInterface.anIntArray1973 != null) {
										jagexInterface.anIntArray1973[i_58_] = 0;
									}
								} else if (jagexInterface.anIntArray1973 == null || Class101_Sub2.loopCycle >= jagexInterface.anIntArray1973[i_58_]) {
									final byte i_59_ = jagexInterface.aByteArray1955[i_58_];
									if (i_59_ == 0 || ((i_59_ & 0x8) == 0 || !Class35.aBooleanArray299[86] && !Class35.aBooleanArray299[82] && !Class35.aBooleanArray299[81]) && ((i_59_ & 0x2) == 0 || Class35.aBooleanArray299[86]) && ((i_59_ & 0x1) == 0 || Class35.aBooleanArray299[82])
											&& ((i_59_ & 0x4) == 0 || Class35.aBooleanArray299[81])) {
										Class120_Sub14_Sub22.method1629(jagexInterface.bitPacked, -1, i_58_ + 1, -97, "");
										final int i_60_ = jagexInterface.anIntArray1985[i_58_];
										if (jagexInterface.anIntArray1973 == null) {
											jagexInterface.anIntArray1973 = new int[jagexInterface.aByteArray2048.length];
										}
										if (i_60_ != 0) {
											jagexInterface.anIntArray1973[i_58_] = Class101_Sub2.loopCycle + i_60_;
										} else {
											jagexInterface.anIntArray1973[i_58_] = 2147483647;
										}
									}
								}
							}
						}
						if (bool_57_) {
							Class120_Sub12_Sub8.method1241(jagexInterface, Class50.lastClickX - i_48_, Class120_Sub12_Sub36.lastClickY - i_49_, (byte) 50);
						}
						if (Class120_Sub12_Sub4.aClass189_3156 != null && Class120_Sub12_Sub4.aClass189_3156 != jagexInterface && bool && getClickMask(jagexInterface).method1677((byte) 84)) {
							LocType.aClass189_1818 = jagexInterface;
						}
						if (jagexInterface == Class26.aClass189_161) {
							Class111.aBoolean1058 = true;
							Class120_Sub12_Sub7.anInt3183 = i_48_;
							Class120_Sub12_Sub35.anInt3413 = i_49_;
						}
						if (jagexInterface.aBoolean1940 || jagexInterface.clientCode != 0) {
							if (bool && Class66.anInt598 != 0 && jagexInterface.anObjectArray2024 != null) {
								final Class120_Sub10 class120_sub10 = new Class120_Sub10();
								class120_sub10.aBoolean2536 = true;
								class120_sub10.aClass189_2534 = jagexInterface;
								class120_sub10.anInt2540 = Class66.anInt598;
								class120_sub10.anObjectArray2537 = jagexInterface.anObjectArray2024;
								Class88.aClass105_829.addLast(class120_sub10);
							}
							if (Class120_Sub12_Sub4.aClass189_3156 != null || Class180_Sub4.aClass189_2954 != null || Class15.menuOpen || jagexInterface.clientCode != 1400 && Class120_Sub14_Sub2.anInt3450 > 0) {
								bool_57_ = false;
								bool_56_ = false;
								bool = false;
							}
							if (jagexInterface.clientCode != 0) {
								if (jagexInterface.clientCode == 1337) {
									DummyInputStream.aClass189_26 = jagexInterface;
									continue;
								}
								if (jagexInterface.clientCode == 1338) {
									if (bool_57_) {
										FileSystem.anInt457 = Class50.lastClickX - i_48_;
										Class53_Sub1.anInt2219 = Class120_Sub12_Sub36.lastClickY - i_49_;
									}
									continue;
								}
								if (jagexInterface.clientCode == 1400) {
									Class142.aClass189_1362 = jagexInterface;
									if (bool) {
										Class80.aBoolean742 = true;
									}
									if (bool_57_) {
										final int i_61_ = (int) ((Class50.lastClickX - i_48_ - jagexInterface.anInt1948 / 2) * 2.0 / Class79.aFloat696);
										final int i_62_ = (int) ((Class120_Sub12_Sub36.lastClickY - i_49_ - jagexInterface.anInt2059 / 2) * 2.0 / Class79.aFloat696);
										final int i_63_ = Class108_Sub1.anInt2336 + i_61_;
										final int i_64_ = Class169.anInt1646 + i_62_;
										final int i_65_ = i_63_ + Class79.anInt695;
										final int i_66_ = Class79.anInt692 - 1 - i_64_ + Class79.anInt694;
										final Class120_Sub14_Sub22 class120_sub14_sub22 = Class108_Sub1.method938(257238413);
										if (class120_sub14_sub22 != null) {
											final int[] is = new int[3];
											class120_sub14_sub22.method1635(i_65_, i_66_, (byte) -127, is);
											if (is != null) {
												if (Class35.aBooleanArray299[82] && Class86.anInt821 > 0) {
													Class108.method930((byte) -120, is[1], is[2], is[0]);
													Class90.method758(0);
													continue;
												}
												Class120_Sub12_Sub11.outputStream.putByteIsaac(251);
												Class120_Sub12_Sub11.outputStream.putInt1(is[0] << 28 | is[1] << 14 | is[2]);
											}
											Class120_Sub14_Sub2.anInt3450 = 1;
											Class30.aBoolean226 = false;
											AbstractGraphicsBuffer.anInt1173 = Queue.lastMouseX;
											anInt2203 = Class191.lastMouseY;
										}
									} else if (bool_56_ && Class120_Sub14_Sub2.anInt3450 > 0) {
										if (Class120_Sub14_Sub2.anInt3450 == 1 && (AbstractGraphicsBuffer.anInt1173 != Queue.lastMouseX || anInt2203 != Class191.lastMouseY)) {
											Class120_Sub2.anInt2421 = Class108_Sub1.anInt2336;
											Class120_Sub14_Sub2.anInt3456 = Class169.anInt1646;
											Class120_Sub14_Sub2.anInt3450 = 2;
										}
										if (Class120_Sub14_Sub2.anInt3450 == 2) {
											Class30.aBoolean226 = true;
											Class27.method236(false, Class120_Sub2.anInt2421 + (int) ((AbstractGraphicsBuffer.anInt1173 - Queue.lastMouseX) * 2.0 / Class79.aFloat698));
											Class179.method2260(false, Class120_Sub14_Sub2.anInt3456 + (int) ((anInt2203 - Class191.lastMouseY) * 2.0 / Class79.aFloat698));
										}
									} else {
										if (Class120_Sub14_Sub2.anInt3450 > 0 && !Class30.aBoolean226) {
											if ((Class69.anInt617 == 1 || Class120_Sub14_Sub4.method1438(0, Class186.menuOptionCount - 1)) && Class186.menuOptionCount > 2) {
												Class120_Sub12_Sub28.determineMenuSize();
											} else if (Class186.menuOptionCount > 0) {
												Class191.method2508((byte) 77);
											}
										}
										Class120_Sub14_Sub2.anInt3450 = 0;
									}
									continue;
								}
								if (jagexInterface.clientCode == 1401) {
									if (bool_56_) {
										Npc.method2348(Class191.lastMouseY - i_49_, jagexInterface.anInt1948, jagexInterface.anInt2059, Queue.lastMouseX - i_48_, (byte) -80);
									}
									continue;
								}
								if (jagexInterface.clientCode == 1402) {
									if (!HDToolkit.glEnabled) {
										InterfaceClickMask.redrawInterface(jagexInterface);
									}
									continue;
								}
							}
							if (!jagexInterface.aBoolean1971 && bool_57_) {
								jagexInterface.aBoolean1971 = true;
								if (jagexInterface.anObjectArray2080 != null) {
									final Class120_Sub10 class120_sub10 = new Class120_Sub10();
									class120_sub10.aBoolean2536 = true;
									class120_sub10.aClass189_2534 = jagexInterface;
									class120_sub10.anInt2543 = Class50.lastClickX - i_48_;
									class120_sub10.anInt2540 = Class120_Sub12_Sub36.lastClickY - i_49_;
									class120_sub10.anObjectArray2537 = jagexInterface.anObjectArray2080;
									Class88.aClass105_829.addLast(class120_sub10);
								}
							}
							if (jagexInterface.aBoolean1971 && bool_56_ && jagexInterface.anObjectArray1993 != null) {
								final Class120_Sub10 class120_sub10 = new Class120_Sub10();
								class120_sub10.aBoolean2536 = true;
								class120_sub10.aClass189_2534 = jagexInterface;
								class120_sub10.anInt2543 = Queue.lastMouseX - i_48_;
								class120_sub10.anInt2540 = Class191.lastMouseY - i_49_;
								class120_sub10.anObjectArray2537 = jagexInterface.anObjectArray1993;
								Class88.aClass105_829.addLast(class120_sub10);
							}
							if (jagexInterface.aBoolean1971 && !bool_56_) {
								jagexInterface.aBoolean1971 = false;
								if (jagexInterface.anObjectArray2084 != null) {
									final Class120_Sub10 class120_sub10 = new Class120_Sub10();
									class120_sub10.aBoolean2536 = true;
									class120_sub10.aClass189_2534 = jagexInterface;
									class120_sub10.anInt2543 = Queue.lastMouseX - i_48_;
									class120_sub10.anInt2540 = Class191.lastMouseY - i_49_;
									class120_sub10.anObjectArray2537 = jagexInterface.anObjectArray2084;
									FileSystem.aClass105_456.addLast(class120_sub10);
								}
							}
							if (bool_56_ && jagexInterface.anObjectArray1951 != null) {
								final Class120_Sub10 class120_sub10 = new Class120_Sub10();
								class120_sub10.aBoolean2536 = true;
								class120_sub10.aClass189_2534 = jagexInterface;
								class120_sub10.anInt2543 = Queue.lastMouseX - i_48_;
								class120_sub10.anInt2540 = Class191.lastMouseY - i_49_;
								class120_sub10.anObjectArray2537 = jagexInterface.anObjectArray1951;
								Class88.aClass105_829.addLast(class120_sub10);
							}
							if (!jagexInterface.aBoolean2035 && bool) {
								jagexInterface.aBoolean2035 = true;
								if (jagexInterface.anObjectArray2058 != null) {
									final Class120_Sub10 class120_sub10 = new Class120_Sub10();
									class120_sub10.aBoolean2536 = true;
									class120_sub10.aClass189_2534 = jagexInterface;
									class120_sub10.anInt2543 = Queue.lastMouseX - i_48_;
									class120_sub10.anInt2540 = Class191.lastMouseY - i_49_;
									class120_sub10.anObjectArray2537 = jagexInterface.anObjectArray2058;
									Class88.aClass105_829.addLast(class120_sub10);
								}
							}
							if (jagexInterface.aBoolean2035 && bool && jagexInterface.anObjectArray1953 != null) {
								final Class120_Sub10 class120_sub10 = new Class120_Sub10();
								class120_sub10.aBoolean2536 = true;
								class120_sub10.aClass189_2534 = jagexInterface;
								class120_sub10.anInt2543 = Queue.lastMouseX - i_48_;
								class120_sub10.anInt2540 = Class191.lastMouseY - i_49_;
								class120_sub10.anObjectArray2537 = jagexInterface.anObjectArray1953;
								Class88.aClass105_829.addLast(class120_sub10);
							}
							if (jagexInterface.aBoolean2035 && !bool) {
								jagexInterface.aBoolean2035 = false;
								if (jagexInterface.anObjectArray2074 != null) {
									final Class120_Sub10 class120_sub10 = new Class120_Sub10();
									class120_sub10.aBoolean2536 = true;
									class120_sub10.aClass189_2534 = jagexInterface;
									class120_sub10.anInt2543 = Queue.lastMouseX - i_48_;
									class120_sub10.anInt2540 = Class191.lastMouseY - i_49_;
									class120_sub10.anObjectArray2537 = jagexInterface.anObjectArray2074;
									FileSystem.aClass105_456.addLast(class120_sub10);
								}
							}
							if (jagexInterface.anObjectArray1998 != null) {
								final Class120_Sub10 class120_sub10 = new Class120_Sub10();
								class120_sub10.aClass189_2534 = jagexInterface;
								class120_sub10.anObjectArray2537 = jagexInterface.anObjectArray1998;
								Class120_Sub4.aClass105_2435.addLast(class120_sub10);
							}
							if (jagexInterface.anObjectArray2062 != null && Class120_Sub12_Sub23.anInt3308 > jagexInterface.anInt2033) {
								if (jagexInterface.anIntArray2096 == null || Class120_Sub12_Sub23.anInt3308 - jagexInterface.anInt2033 > 32) {
									final Class120_Sub10 class120_sub10 = new Class120_Sub10();
									class120_sub10.aClass189_2534 = jagexInterface;
									class120_sub10.anObjectArray2537 = jagexInterface.anObjectArray2062;
									Class88.aClass105_829.addLast(class120_sub10);
								} else {
									while_38_: for (int i_67_ = jagexInterface.anInt2033; i_67_ < Class120_Sub12_Sub23.anInt3308; i_67_++) {
										final int i_68_ = Class101_Sub4.anIntArray2296[i_67_ & 0x1f];
										for (int i_69_ = 0; i_69_ < jagexInterface.anIntArray2096.length; i_69_++) {
											if (jagexInterface.anIntArray2096[i_69_] == i_68_) {
												final Class120_Sub10 class120_sub10 = new Class120_Sub10();
												class120_sub10.aClass189_2534 = jagexInterface;
												class120_sub10.anObjectArray2537 = jagexInterface.anObjectArray2062;
												Class88.aClass105_829.addLast(class120_sub10);
												break while_38_;
											}
										}
									}
								}
								jagexInterface.anInt2033 = Class120_Sub12_Sub23.anInt3308;
							}
							if (jagexInterface.anObjectArray2032 != null && Class112.anInt1077 > jagexInterface.anInt2064) {
								if (jagexInterface.anIntArray1991 == null || Class112.anInt1077 - jagexInterface.anInt2064 > 32) {
									final Class120_Sub10 class120_sub10 = new Class120_Sub10();
									class120_sub10.aClass189_2534 = jagexInterface;
									class120_sub10.anObjectArray2537 = jagexInterface.anObjectArray2032;
									Class88.aClass105_829.addLast(class120_sub10);
								} else {
									while_39_: for (int i_70_ = jagexInterface.anInt2064; i_70_ < Class112.anInt1077; i_70_++) {
										final int i_71_ = Class101_Sub4.anIntArray2304[i_70_ & 0x1f];
										for (int i_72_ = 0; i_72_ < jagexInterface.anIntArray1991.length; i_72_++) {
											if (jagexInterface.anIntArray1991[i_72_] == i_71_) {
												final Class120_Sub10 class120_sub10 = new Class120_Sub10();
												class120_sub10.aClass189_2534 = jagexInterface;
												class120_sub10.anObjectArray2537 = jagexInterface.anObjectArray2032;
												Class88.aClass105_829.addLast(class120_sub10);
												break while_39_;
											}
										}
									}
								}
								jagexInterface.anInt2064 = Class112.anInt1077;
							}
							if (jagexInterface.anObjectArray2050 != null && Class27.anInt165 > jagexInterface.anInt2028) {
								if (jagexInterface.anIntArray2039 == null || Class27.anInt165 - jagexInterface.anInt2028 > 32) {
									final Class120_Sub10 class120_sub10 = new Class120_Sub10();
									class120_sub10.aClass189_2534 = jagexInterface;
									class120_sub10.anObjectArray2537 = jagexInterface.anObjectArray2050;
									Class88.aClass105_829.addLast(class120_sub10);
								} else {
									while_40_: for (int i_73_ = jagexInterface.anInt2028; i_73_ < Class27.anInt165; i_73_++) {
										final int i_74_ = Class88.anIntArray833[i_73_ & 0x1f];
										for (int i_75_ = 0; i_75_ < jagexInterface.anIntArray2039.length; i_75_++) {
											if (jagexInterface.anIntArray2039[i_75_] == i_74_) {
												final Class120_Sub10 class120_sub10 = new Class120_Sub10();
												class120_sub10.aClass189_2534 = jagexInterface;
												class120_sub10.anObjectArray2537 = jagexInterface.anObjectArray2050;
												Class88.aClass105_829.addLast(class120_sub10);
												break while_40_;
											}
										}
									}
								}
								jagexInterface.anInt2028 = Class27.anInt165;
							}
							if (jagexInterface.anObjectArray1929 != null && Class33.anInt278 > jagexInterface.anInt2037) {
								if (jagexInterface.anIntArray2063 == null || Class33.anInt278 - jagexInterface.anInt2037 > 32) {
									final Class120_Sub10 class120_sub10 = new Class120_Sub10();
									class120_sub10.aClass189_2534 = jagexInterface;
									class120_sub10.anObjectArray2537 = jagexInterface.anObjectArray1929;
									Class88.aClass105_829.addLast(class120_sub10);
								} else {
									while_41_: for (int i_76_ = jagexInterface.anInt2037; i_76_ < Class33.anInt278; i_76_++) {
										final int i_77_ = Class120_Sub12_Sub21_Sub1.anIntArray3912[i_76_ & 0x1f];
										for (int i_78_ = 0; i_78_ < jagexInterface.anIntArray2063.length; i_78_++) {
											if (jagexInterface.anIntArray2063[i_78_] == i_77_) {
												final Class120_Sub10 class120_sub10 = new Class120_Sub10();
												class120_sub10.aClass189_2534 = jagexInterface;
												class120_sub10.anObjectArray2537 = jagexInterface.anObjectArray1929;
												Class88.aClass105_829.addLast(class120_sub10);
												break while_41_;
											}
										}
									}
								}
								jagexInterface.anInt2037 = Class33.anInt278;
							}
							if (jagexInterface.anObjectArray2054 != null && Class120_Sub21.anInt2670 > jagexInterface.anInt2043) {
								if (jagexInterface.anIntArray2022 == null || Class120_Sub21.anInt2670 - jagexInterface.anInt2043 > 32) {
									final Class120_Sub10 class120_sub10 = new Class120_Sub10();
									class120_sub10.aClass189_2534 = jagexInterface;
									class120_sub10.anObjectArray2537 = jagexInterface.anObjectArray2054;
									Class88.aClass105_829.addLast(class120_sub10);
								} else {
									while_42_: for (int i_79_ = jagexInterface.anInt2043; i_79_ < Class120_Sub21.anInt2670; i_79_++) {
										final int i_80_ = Class120_Sub12_Sub18.anIntArray3274[i_79_ & 0x1f];
										for (int i_81_ = 0; i_81_ < jagexInterface.anIntArray2022.length; i_81_++) {
											if (jagexInterface.anIntArray2022[i_81_] == i_80_) {
												final Class120_Sub10 class120_sub10 = new Class120_Sub10();
												class120_sub10.aClass189_2534 = jagexInterface;
												class120_sub10.anObjectArray2537 = jagexInterface.anObjectArray2054;
												Class88.aClass105_829.addLast(class120_sub10);
												break while_42_;
											}
										}
									}
								}
								jagexInterface.anInt2043 = Class120_Sub21.anInt2670;
							}
							if (Class166.anInt1612 > jagexInterface.anInt2049 && jagexInterface.anObjectArray1944 != null) {
								final Class120_Sub10 class120_sub10 = new Class120_Sub10();
								class120_sub10.aClass189_2534 = jagexInterface;
								class120_sub10.anObjectArray2537 = jagexInterface.anObjectArray1944;
								Class88.aClass105_829.addLast(class120_sub10);
							}
							if (Class61.anInt563 > jagexInterface.anInt2049 && jagexInterface.anObjectArray1976 != null) {
								final Class120_Sub10 class120_sub10 = new Class120_Sub10();
								class120_sub10.aClass189_2534 = jagexInterface;
								class120_sub10.anObjectArray2537 = jagexInterface.anObjectArray1976;
								Class88.aClass105_829.addLast(class120_sub10);
							}
							if (Class120_Sub12_Sub12.anInt3217 > jagexInterface.anInt2049 && jagexInterface.anObjectArray2036 != null) {
								final Class120_Sub10 class120_sub10 = new Class120_Sub10();
								class120_sub10.aClass189_2534 = jagexInterface;
								class120_sub10.anObjectArray2537 = jagexInterface.anObjectArray2036;
								Class88.aClass105_829.addLast(class120_sub10);
							}
							if (Class120_Sub29.anInt2768 > jagexInterface.anInt2049 && jagexInterface.anObjectArray1984 != null) {
								final Class120_Sub10 class120_sub10 = new Class120_Sub10();
								class120_sub10.aClass189_2534 = jagexInterface;
								class120_sub10.anObjectArray2537 = jagexInterface.anObjectArray1984;
								Class88.aClass105_829.addLast(class120_sub10);
							}
							if (Class120_Sub2.anInt2419 > jagexInterface.anInt2049 && jagexInterface.anObjectArray2086 != null) {
								final Class120_Sub10 class120_sub10 = new Class120_Sub10();
								class120_sub10.aClass189_2534 = jagexInterface;
								class120_sub10.anObjectArray2537 = jagexInterface.anObjectArray2086;
								Class88.aClass105_829.addLast(class120_sub10);
							}
							jagexInterface.anInt2049 = Class160.anInt1494;
							if (jagexInterface.anObjectArray1954 != null) {
								for (int i_82_ = 0; i_82_ < ObjType.anInt1551; i_82_++) {
									final Class120_Sub10 class120_sub10 = new Class120_Sub10();
									class120_sub10.aClass189_2534 = jagexInterface;
									class120_sub10.anInt2533 = Class134.anIntArray1285[i_82_];
									class120_sub10.anInt2535 = Class120_Sub19.anIntArray2658[i_82_];
									class120_sub10.anObjectArray2537 = jagexInterface.anObjectArray1954;
									Class88.aClass105_829.addLast(class120_sub10);
								}
							}
							if (Class24.aBoolean139 && jagexInterface.anObjectArray1942 != null) {
								final Class120_Sub10 class120_sub10 = new Class120_Sub10();
								class120_sub10.aClass189_2534 = jagexInterface;
								class120_sub10.anObjectArray2537 = jagexInterface.anObjectArray1942;
								Class88.aClass105_829.addLast(class120_sub10);
							}
						}
					}
					if (!jagexInterface.aBoolean2041 && Class120_Sub12_Sub4.aClass189_3156 == null && Class180_Sub4.aClass189_2954 == null && !Class15.menuOpen) {
						if ((jagexInterface.mouseOverId >= 0 || jagexInterface.disabledMouseOverColor != 0) && Queue.lastMouseX >= i_50_ && Class191.lastMouseY >= i_51_ && Queue.lastMouseX < i_52_ && Class191.lastMouseY < i_53_) {
							if (jagexInterface.mouseOverId >= 0) {
								CursorType.aClass189_1243 = class189s[jagexInterface.mouseOverId];
							} else {
								CursorType.aClass189_1243 = jagexInterface;
							}
						}
						if (jagexInterface.type == 8 && Queue.lastMouseX >= i_50_ && Class191.lastMouseY >= i_51_ && Queue.lastMouseX < i_52_ && Class191.lastMouseY < i_53_) {
							Class49.aClass189_441 = jagexInterface;
						}
						if (jagexInterface.maxScrollVertical > jagexInterface.anInt2059) {
							Class70.method632((byte) 19, jagexInterface, Class191.lastMouseY, i_48_ + jagexInterface.anInt1948, Queue.lastMouseX, jagexInterface.maxScrollVertical, i_49_, jagexInterface.anInt2059);
						}
					}
					if (jagexInterface.type == 0) {
						method60(class189s, jagexInterface.bitPacked, i_50_, i_51_, i_52_, i_53_, i_48_ - jagexInterface.verticalScrollPosition, i_49_ - jagexInterface.horizontalScrollPosition);
						if (jagexInterface.aClass189Array2072 != null) {
							method60(jagexInterface.aClass189Array2072, jagexInterface.bitPacked, i_50_, i_51_, i_52_, i_53_, i_48_ - jagexInterface.verticalScrollPosition, i_49_ - jagexInterface.horizontalScrollPosition);
						}
						final OverridedJInterface class120_sub26 = (OverridedJInterface) Class120_Sub12_Sub13.overridedInterfaces.get(jagexInterface.bitPacked);
						if (class120_sub26 != null) {
							Class120_Sub6.method1074(class120_sub26.interfaceId, i_52_, i_48_, i_51_, i_49_, i_50_, i_53_);
						}
					}
				}
			}
		}
	}
}
