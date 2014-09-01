/* client - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import java.io.IOException;
import java.net.Socket;
import java.util.Arrays;
import java.util.GregorianCalendar;

public final class client extends GameShell {
	static int anInt2199;
	static int cameraType;
	static byte flagCounter;
	static boolean shutdown = false;
	static int anInt2203 = 0;

	static {
		flagCounter = (byte) 0;
	}

	private final void method50() {
		for (ObjType.anInt1551 = 0; Class120_Sub12_Sub13.method1265() && ObjType.anInt1551 < 128; ObjType.anInt1551++) {
			Class134.anIntArray1285[ObjType.anInt1551] = NodeCache.anInt301;
			Class120_Sub19.anIntArray2658[ObjType.anInt1551] = ObjType.aChar1536;
		}
		Class120_Sub12_Sub22.redrawRate++;
		if (Class69.rootInterfaceId != -1) {
			Class120_Sub6.method1074(Class69.rootInterfaceId, Class69_Sub1.canvasWidth, 0, 0, 0, 0, Class120_Sub12_Sub5.canvasHeight);
		}
		GrandExchangeObject.anInt1494++;
		if (HDToolkit.glEnabled) {
			while_37_: for (int index = 0; index < 32768; index++) {
				final Npc npc = Class120_Sub12_Sub11.npcList[index];
				if (npc != null) {
					final byte i_2_ = npc.npcType.aByte1700;
					if ((0x2 & i_2_) > 0 && npc.anInt2960 == 0 && Math.random() * 1000.0 < 10.0) {
						final int i_3_ = (int) Math.round(-1.0 + 2.0 * Math.random());
						final int i_4_ = (int) Math.round(-1.0 + 2.0 * Math.random());
						if (i_3_ != 0 || i_4_ != 0) {
							npc.aByteArray2973[0] = (byte) 1;
							npc.walkQueueX[0] = (npc.x >> 7) + i_3_;
							npc.walkQueueZ[0] = (npc.z >> 7) + i_4_;
							Class182.collisionMaps[Class173.gameLevel].method214(0, npc.z >> 7, npc.getSize(), npc.x >> 7, npc.getSize(), false, false);
							if (npc.walkQueueX[0] >= 0 && npc.walkQueueX[0] <= 104 - npc.getSize() && npc.walkQueueZ[0] >= 0 && npc.walkQueueZ[0] <= 104 - npc.getSize() && Class182.collisionMaps[Class173.gameLevel].method221(npc.walkQueueZ[0], npc.z >> 7, npc.walkQueueX[0], npc.x >> 7)) {
								if (npc.getSize() > 1) {
									for (int i_5_ = npc.walkQueueX[0]; i_5_ < npc.walkQueueX[0] + npc.getSize(); i_5_++) {
										for (int i_6_ = npc.walkQueueZ[0]; npc.walkQueueZ[0] + npc.getSize() > i_6_; i_6_++) {
											if ((Class182.collisionMaps[Class173.gameLevel].collisionFlags[i_5_][i_6_] & 0x2401ff) != 0) {
												continue while_37_;
											}
										}
									}
								}
								npc.anInt2960 = 1;
							}
						}
					}
					Class120_Sub12_Sub32.method1371(npc);
					ProducingGraphicsBuffer.method1850(npc);
					Class36.method307(npc);
					Class182.collisionMaps[Class173.gameLevel].method213(npc.x >> 7, npc.z >> 7, npc.getSize(), npc.getSize(), false, false);
				}
			}
		}
		if (HDToolkit.glEnabled || Buffer.gameId != 0) {
			if (Class86.loginStep == 0 && Class154.anInt1440 == 0) {
				if (cameraType == 2) {
					Class120_Sub12_Sub16.method1279();
				} else {
					InvType.method1445();
				}
				if (FileSystemWorker.renderX >> 7 < 14 || FileSystemWorker.renderX >> 7 >= 90 || GroundObjectNode.renderZ >> 7 < 14 || GroundObjectNode.renderZ >> 7 >= 90) {
					UnderlayType.method1900();
				}
			}
		} else {
			FileSystem.anInt459++;
		}
		for (;;) {
			final InterfaceListener class120_sub10 = (InterfaceListener) Class120_Sub4.aClass105_2435.removeFront();
			if (class120_sub10 == null) {
				break;
			}
			final JagexInterface jagexInterface = class120_sub10.aClass189_2534;
			if (jagexInterface.componentIndex >= 0) {
				final JagexInterface class189_7_ = Class74.getJagexInterface(jagexInterface.parent);
				if (class189_7_ == null || class189_7_.components == null || jagexInterface.componentIndex >= class189_7_.components.length || class189_7_.components[jagexInterface.componentIndex] != jagexInterface) {
					continue;
				}
			}
			Class88.method744(class120_sub10);
		}
		for (;;) {
			final InterfaceListener class120_sub10 = (InterfaceListener) FileSystem.aClass105_456.removeFront();
			if (class120_sub10 == null) {
				break;
			}
			final JagexInterface jagexInterface = class120_sub10.aClass189_2534;
			if (jagexInterface.componentIndex >= 0) {
				final JagexInterface class189_8_ = Class74.getJagexInterface(jagexInterface.parent);
				if (class189_8_ == null || class189_8_.components == null || jagexInterface.componentIndex >= class189_8_.components.length || class189_8_.components[jagexInterface.componentIndex] != jagexInterface) {
					continue;
				}
			}
			Class88.method744(class120_sub10);
		}
		for (;;) {
			final InterfaceListener class120_sub10 = (InterfaceListener) Class88.aClass105_829.removeFront();
			if (class120_sub10 == null) {
				break;
			}
			final JagexInterface jagexInterface = class120_sub10.aClass189_2534;
			if (jagexInterface.componentIndex >= 0) {
				final JagexInterface class189_9_ = Class74.getJagexInterface(jagexInterface.parent);
				if (class189_9_ == null || class189_9_.components == null || class189_9_.components.length <= jagexInterface.componentIndex || class189_9_.components[jagexInterface.componentIndex] != jagexInterface) {
					continue;
				}
			}
			Class88.method744(class120_sub10);
		}
		if (Class120_Sub12_Sub4.aClass189_3156 != null) {
			JavaObject.method1435();
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
	}

	private final void js5Error(final int type) {
		Class178.js5Worker.errorType = type;
		Class120_Sub12_Sub11.js5Connection = null;
		Class178.js5Worker.errorCount++;
		Class120_Sub12_Sub33.js5Stage = 0;
		GroundTile.js5ConnectionNode = null;
	}

	static final void leaveClanChat() {
		Class120_Sub12_Sub11.outputStream.putByteIsaac(218);
		Class120_Sub12_Sub11.outputStream.putLong(0L);
	}

	private final void load() {
		if (!InterfaceClickMask.safeModeEnabled) {
			while (Class120_Sub12_Sub13.method1265()) {
				if (ObjType.aChar1536 == 's' || ObjType.aChar1536 == 'S') {
					InterfaceClickMask.safeModeEnabled = true;
				}
			}
		}
		if (Class140.loadingStage == 0) {
			final Runtime runtime = Runtime.getRuntime();
			final int mem = (int) ((runtime.totalMemory() - runtime.freeMemory()) / 1024L);
			final long time = TimeUtil.getSafeTime();
			if (InterfaceChangeNode.allocatingTime == 0L) {
				InterfaceChangeNode.allocatingTime = time;
			}
			if (mem > 16384 && time - InterfaceChangeNode.allocatingTime < 5000L) {
				if (time - Class61.allocateGcTime > 1000L) {
					System.gc();
					Class61.allocateGcTime = time;
				}
				OverridedJInterface.loadingBarPercent = 5;
				Class134.loadingText = MouseRecorder.aString853;
			} else {
				OverridedJInterface.loadingBarPercent = 5;
				Class134.loadingText = PlayerAppearance.aString1368;
				Class140.loadingStage = 10;
			}
		} else if (Class140.loadingStage == 10) {
			for (int level = 0; level < 4; level++) {
				Class182.collisionMaps[level] = new CollisionMap(104, 104);
			}
			Class140.loadingStage = 30;
			Class134.loadingText = DisplayModeInfo.aString1708;
			OverridedJInterface.loadingBarPercent = 10;
		} else if (Class140.loadingStage == 30) {
			if (EnumType.aClass112_3460 == null) {
				EnumType.aClass112_3460 = new Class112(Class178.js5Worker, Class38.fileSystemWorker);
			}
			if (!EnumType.aClass112_3460.method986()) {
				OverridedJInterface.loadingBarPercent = 12;
				Class134.loadingText = Class191.aString2105;
			} else {
				AmbientSound.aClass50_2479 = Huffman.method1884(0, true, false, true);
				Class79_Sub1.aClass50_2245 = Huffman.method1884(1, true, false, true);
				Js5Worker.aClass50_397 = Huffman.method1884(2, false, true, true);
				Class33.aClass50_275 = Huffman.method1884(3, true, false, true);
				Class159.aClass50_1490 = Huffman.method1884(4, true, false, true);
				Class65.aClass50_597 = Huffman.method1884(5, true, true, true);
				Class120_Sub12_Sub36.aClass50_3419 = Huffman.method1884(6, true, true, false);
				Class120_Sub12_Sub17.aClass50_3258 = Huffman.method1884(7, true, false, true);
				Class7.aClass50_63 = Huffman.method1884(8, true, false, true);
				NodeCache.aClass50_303 = Huffman.method1884(9, true, false, true);
				ParticleNodeSub.aClass50_2400 = Huffman.method1884(10, true, false, true);
				InterfaceListener.aClass50_2544 = Huffman.method1884(11, true, false, true);
				IsaacCipher.aClass50_1019 = Huffman.method1884(12, true, false, true);
				ClanMember.aClass50_2576 = Huffman.method1884(13, true, false, true);
				Class132.aClass50_1251 = Huffman.method1884(14, true, false, false);
				Class120_Sub22.aClass50_2679 = Huffman.method1884(15, true, false, true);
				Class114.aClass50_1097 = Huffman.method1884(16, true, false, true);
				Class169.aClass50_1649 = Huffman.method1884(17, true, false, true);
				Class120_Sub12_Sub29.aClass50_3367 = Huffman.method1884(18, true, false, true);
				Class127.aClass50_1213 = Huffman.method1884(19, true, false, true);
				Class2.aClass50_50 = Huffman.method1884(20, true, false, true);
				Class120_Sub2.aClass50_2415 = Huffman.method1884(21, true, false, true);
				WaterfallShader.aClass50_2169 = Huffman.method1884(22, true, false, true);
				Class120_Sub12_Sub24.aClass50_3309 = Huffman.method1884(23, true, true, true);
				Class153.aClass50_1433 = Huffman.method1884(24, true, false, true);
				AbstractMouseWheelHandler.aClass50_115 = Huffman.method1884(25, true, false, true);
				Class120_Sub12_Sub15.aClass50_3242 = Huffman.method1884(26, true, true, true);
				Class187.aClass50_1907 = Huffman.method1884(27, true, false, true);
				Npc.aClass50_3753 = Huffman.method1884(28, true, true, true);
				OverridedJInterface.loadingBarPercent = 15;
				Class134.loadingText = Class11.aString82;
				Class140.loadingStage = 40;
			}
		} else if (Class140.loadingStage == 40) {
			int i_12_ = 0;
			for (int i_13_ = 0; i_13_ < 29; i_13_++) {
				i_12_ += Class120_Sub12_Sub26.aClass53_Sub1Array3337[i_13_].getCompletion() * Class29.anIntArray199[i_13_] / 100;
			}
			if (i_12_ != 100) {
				OverridedJInterface.loadingBarPercent = 20;
				if (i_12_ != 0) {
					Class134.loadingText = new StringBuilder(Class120_Sub12_Sub27.aString3338).append(i_12_).append("%").toString();
				}
			} else {
				Class134.loadingText = Class120_Sub15.aString2594;
				OverridedJInterface.loadingBarPercent = 20;
				ParticleNode.getSpriteIds(Class7.aClass50_63);
				Class132_Sub2.getTitleSpriteIds(Class7.aClass50_63);
				Class112.getRunesSpriteId(Class7.aClass50_63);
				Class140.loadingStage = 41;
			}
		} else if (Class140.loadingStage == 41) {
			if (!Npc.aClass50_3753.method430()) {
				Class134.loadingText = new StringBuilder(Class120_Sub11.aString2554).append(Npc.aClass50_3753.method415()).append("%").toString();
				OverridedJInterface.loadingBarPercent = 25;
			} else {
				decodeDefaults(Npc.aClass50_3753.getFileSmart(1));
				Class140.loadingStage = 45;
				Class134.loadingText = Class120_Sub12_Sub1.aString3137;
				OverridedJInterface.loadingBarPercent = 25;
			}
		} else if (Class140.loadingStage == 45) {
			FileSystemRequest.method1546(2, 22050, Class167.aBoolean1619);
			Class69_Sub1.aClass120_Sub30_Sub2_2230 = new Class120_Sub30_Sub2();
			Class69_Sub1.aClass120_Sub30_Sub2_2230.method1774(128, (byte) -84, 9);
			Class120_Sub12_Sub3.aClass164_3150 = Class120_Sub12_Sub18.method1289(Node.canvas, 22050, NpcType.gameSignlink, 0);
			Class120_Sub12_Sub3.aClass164_3150.method2143(Class69_Sub1.aClass120_Sub30_Sub2_2230);
			Class120_Sub12_Sub39.method1400(Class69_Sub1.aClass120_Sub30_Sub2_2230, Class120_Sub22.aClass50_2679, Class132.aClass50_1251, false, Class159.aClass50_1490);
			Class120_Sub12_Sub29.aClass164_3366 = Class120_Sub12_Sub18.method1289(Node.canvas, 2048, NpcType.gameSignlink, 1);
			Class120_Sub12_Sub22.aClass120_Sub30_Sub3_3299 = new Class120_Sub30_Sub3();
			Class120_Sub12_Sub29.aClass164_3366.method2143(Class120_Sub12_Sub22.aClass120_Sub30_Sub3_3299);
			ObjectPile.aClass172_1809 = new Decimator(22050, Class178.anInt1771);
			AbstractSprite.anInt3620 = Class120_Sub12_Sub36.aClass50_3419.getGroupId("scape main");
			Class134.loadingText = AbstractIndexedSprite.aString1025;
			Class140.loadingStage = 50;
			OverridedJInterface.loadingBarPercent = 30;
		} else if (Class140.loadingStage == 50) {
			final int i_14_ = Class143_Sub1.method2029(ClanMember.aClass50_2576, Class7.aClass50_63);
			final int i_15_ = LookupTable.method488();
			if (i_14_ < i_15_) {
				OverridedJInterface.loadingBarPercent = 35;
				Class134.loadingText = new StringBuilder(InterfaceClickMask.aString2660).append(100 * i_14_ / i_15_).append("%").toString();
			} else {
				Class134.loadingText = Class121.aString1155;
				Class140.loadingStage = 60;
				OverridedJInterface.loadingBarPercent = 35;
			}
		} else if (Class140.loadingStage == 60) {
			final int i_16_ = JavaObject.method1434(Class7.aClass50_63);
			final int i_17_ = 2;
			if (i_17_ > i_16_) {
				OverridedJInterface.loadingBarPercent = 40;
				Class134.loadingText = new StringBuilder(Class29.aString217).append(i_16_ * 100 / i_17_).append("%").toString();
			} else {
				Class140.loadingStage = 65;
				OverridedJInterface.loadingBarPercent = 40;
				Class134.loadingText = CursorType.aString1239;
			}
		} else if (Class140.loadingStage == 65) {
			Class8.constructFonts(Class7.aClass50_63, ClanMember.aClass50_2576);
			Class134.loadingText = Class120_Sub11.aString2552;
			OverridedJInterface.loadingBarPercent = 45;
			ProjectileNode.setGameState(5);
			Class140.loadingStage = 70;
		} else if (Class140.loadingStage == 70) {
			Js5Worker.aClass50_397.method430();
			int i_18_ = 0;
			i_18_ += Js5Worker.aClass50_397.method415();
			Class114.aClass50_1097.method430();
			i_18_ += Class114.aClass50_1097.method415();
			Class169.aClass50_1649.method430();
			i_18_ += Class169.aClass50_1649.method415();
			Class120_Sub12_Sub29.aClass50_3367.method430();
			i_18_ += Class120_Sub12_Sub29.aClass50_3367.method415();
			Class127.aClass50_1213.method430();
			i_18_ += Class127.aClass50_1213.method415();
			Class2.aClass50_50.method430();
			i_18_ += Class2.aClass50_50.method415();
			Class120_Sub2.aClass50_2415.method430();
			i_18_ += Class120_Sub2.aClass50_2415.method415();
			WaterfallShader.aClass50_2169.method430();
			i_18_ += WaterfallShader.aClass50_2169.method415();
			Class153.aClass50_1433.method430();
			i_18_ += Class153.aClass50_1433.method415();
			AbstractMouseWheelHandler.aClass50_115.method430();
			i_18_ += AbstractMouseWheelHandler.aClass50_115.method415();
			Class187.aClass50_1907.method430();
			i_18_ += Class187.aClass50_1907.method415();
			if (i_18_ < 1100) {
				OverridedJInterface.loadingBarPercent = 50;
				Class134.loadingText = new StringBuilder(LongNode.aString2428).append(i_18_ / 11).append("%").toString();
			} else {
				ParamType.configClient = Js5Worker.aClass50_397;
				OverlayType.setupOverlay(Js5Worker.aClass50_397);
				UnderlayType.configClient = Js5Worker.aClass50_397;
				Class186.method2472(Class120_Sub12_Sub17.aClass50_3258, Js5Worker.aClass50_397);
				Class166.method2178(Class114.aClass50_1097, true, Class120_Sub12_Sub17.aClass50_3258);
				GrandExchangeObject.method2099(Class120_Sub12_Sub17.aClass50_3258, Class120_Sub12_Sub29.aClass50_3367, true);
				Player.method2340(Class127.aClass50_1213, Class33.smallFont2, true, Class120_Sub12_Sub17.aClass50_3258);
				StructType.configClient = Js5Worker.aClass50_397;
				Class191.method2509(Class2.aClass50_50, Class79_Sub1.aClass50_2245, AmbientSound.aClass50_2479, 31779);
				CanvasWrapper.aClass50_18 = Js5Worker.aClass50_397;
				Class120_Sub12_Sub13.method1266(-1, Class120_Sub2.aClass50_2415, Class120_Sub12_Sub17.aClass50_3258);
				Class120_Sub12_Sub35.method1381(WaterfallShader.aClass50_2169, (byte) -94);
				Class15.method145(Js5Worker.aClass50_397, 1024);
				Class191.method2511(Class7.aClass50_63, 5, ClanMember.aClass50_2576, Class33.aClass50_275, Class120_Sub12_Sub17.aClass50_3258);
				Class86.method731(Js5Worker.aClass50_397);
				Class120_Sub11.method1177(-12014, Class169.aClass50_1649);
				InterfaceChangeNode.method1455(AbstractMouseWheelHandler.aClass50_115, new Class125(), Class153.aClass50_1433);
				Class120_Sub12_Sub10.method1249(Class153.aClass50_1433, AbstractMouseWheelHandler.aClass50_115);
				Class54.method483(Js5Worker.aClass50_397, (byte) -102);
				Class120_Sub12_Sub17.method1287(Js5Worker.aClass50_397, (byte) 117);
				Class120_Sub12_Sub2.method1203(2, Js5Worker.aClass50_397);
				ObjectCache.method189(Js5Worker.aClass50_397, Class7.aClass50_63);
				Class3.method79(Class7.aClass50_63, Js5Worker.aClass50_397);
				Class120_Sub21.method1698((byte) -11, Js5Worker.aClass50_397, Class7.aClass50_63);
				OverridedJInterface.loadingBarPercent = 50;
				Class134.loadingText = NodeSub.aString2585;
				MapFunctionNode.method1441();
				Class140.loadingStage = 80;
			}
		} else if (Class140.loadingStage == 80) {
			final int i_19_ = Class120_Sub12_Sub4.method1216(Class7.aClass50_63);
			final int i_20_ = 14;
			if (i_19_ < i_20_) {
				Class134.loadingText = new StringBuilder(Class120_Sub14_Sub24.aString3665).append(100 * i_19_ / i_20_).append("%").toString();
				OverridedJInterface.loadingBarPercent = 60;
			} else {
				GameShell.constructSprites(Class7.aClass50_63);
				Class134.loadingText = Class120_Sub24.aString2726;
				OverridedJInterface.loadingBarPercent = 60;
				Class140.loadingStage = 90;
			}
		} else if (Class140.loadingStage == 90) {
			if (!Class120_Sub12_Sub15.aClass50_3242.method430()) {
				Class134.loadingText = new StringBuilder(Class120_Sub12_Sub30.aString3371).append(Class120_Sub12_Sub15.aClass50_3242.method415()).append("%").toString();
				OverridedJInterface.loadingBarPercent = 70;
			} else {
				final Class143_Sub1 class143_sub1 = new Class143_Sub1(NodeCache.aClass50_303, Class120_Sub12_Sub15.aClass50_3242, Class7.aClass50_63, 20, !ParticleNodeSub.highDetailTextures);
				Rasterizer.method864(class143_sub1);
				if (FileSystemRequest.brightness == 1) {
					Rasterizer.method852(0.9F);
				}
				if (FileSystemRequest.brightness == 2) {
					Rasterizer.method852(0.8F);
				}
				if (FileSystemRequest.brightness == 3) {
					Rasterizer.method852(0.7F);
				}
				if (FileSystemRequest.brightness == 4) {
					Rasterizer.method852(0.6F);
				}
				OverridedJInterface.loadingBarPercent = 70;
				Class134.loadingText = MapSceneType.aString1358;
				Class140.loadingStage = 100;
			}
		} else if (Class140.loadingStage == 100) {
			if (WaterfallShader.runeSpritesCached(Class7.aClass50_63)) {
				Class140.loadingStage = 110;
			}
		} else if (Class140.loadingStage == 110) {
			Class110.mouseRecorder = new MouseRecorder();
			NpcType.gameSignlink.startThread(Class110.mouseRecorder, 10);
			OverridedJInterface.loadingBarPercent = 75;
			Class134.loadingText = Class109.aString1038;
			Class140.loadingStage = 120;
		} else if (Class140.loadingStage == 120) {
			if (!ParticleNodeSub.aClass50_2400.method410("huffman", "")) {
				Class134.loadingText = new StringBuilder(Js5Worker.aString398).append("0%").toString();
				OverridedJInterface.loadingBarPercent = 80;
			} else {
				final Huffman huffman = new Huffman(ParticleNodeSub.aClass50_2400.method428("", "huffman"));
				GZIPDecompressor.setHuffman(huffman);
				Class134.loadingText = SceneGroundObject.aString2847;
				OverridedJInterface.loadingBarPercent = 80;
				Class140.loadingStage = 130;
			}
		} else if (Class140.loadingStage == 130) {
			if (!Class33.aClass50_275.method430()) {
				Class134.loadingText = new StringBuilder(IntegerNode.aString2788).append(3 * Class33.aClass50_275.method415() / 4).append("%").toString();
				OverridedJInterface.loadingBarPercent = 85;
			} else if (!IsaacCipher.aClass50_1019.method430()) {
				Class134.loadingText = new StringBuilder(IntegerNode.aString2788).append(IsaacCipher.aClass50_1019.method415() / 10 + 75).append("%").toString();
				OverridedJInterface.loadingBarPercent = 85;
			} else if (!ClanMember.aClass50_2576.method430()) {
				Class134.loadingText = new StringBuilder(IntegerNode.aString2788).append(ClanMember.aClass50_2576.method415() / 20 + 85).append("%").toString();
				OverridedJInterface.loadingBarPercent = 85;
			} else if (!Class120_Sub12_Sub24.aClass50_3309.allFilesComplete("details")) {
				Class134.loadingText = new StringBuilder(IntegerNode.aString2788).append(90 - -(Class120_Sub12_Sub24.aClass50_3309.getCompletion("details") / 10)).append("%").toString();
				OverridedJInterface.loadingBarPercent = 85;
			} else {
				WorldMapHandler.method675(Class120_Sub12_Sub24.aClass50_3309);
				ParticleEngine.method945(Class187.aClass50_1907);
				Class41.method334(Class120_Sub12_Sub17.aClass50_3258);
				Class140.loadingStage = 135;
				OverridedJInterface.loadingBarPercent = 95;
				Class134.loadingText = GZIPDecompressor.aString799;
			}
		} else if (Class140.loadingStage == 135) {
			final int i_21_ = Class96.method788();
			if (i_21_ == -1) {
				Class134.loadingText = Class114.aString1098;
				OverridedJInterface.loadingBarPercent = 95;
			} else if (i_21_ == 7 || i_21_ == 9) {
				error("worldlistfull");
				ProjectileNode.setGameState(1000);
			} else if (!Class159.worldsLoaded) {
				error("worldlistio_" + i_21_);
				ProjectileNode.setGameState(1000);
			} else {
				OverridedJInterface.loadingBarPercent = 96;
				Class140.loadingStage = 140;
				Class134.loadingText = Class120_Sub6.aString2444;
			}
		} else if (Class140.loadingStage == 140) {
			GameShell.loginscreenId = Class33.aClass50_275.getGroupId("loginscreen");
			Class65.aClass50_597.method426(false, true);
			Class120_Sub12_Sub36.aClass50_3419.method426(true, true);
			Class7.aClass50_63.method426(true, true);
			ClanMember.aClass50_2576.method426(true, true);
			ParticleNodeSub.aClass50_2400.method426(true, true);
			Class33.aClass50_275.method426(true, true);
			SeekableFile.aBoolean2138 = true;
			Class140.loadingStage = 150;
			Class134.loadingText = Js5Worker.aString400;
			OverridedJInterface.loadingBarPercent = 97;
		} else if (Class140.loadingStage == 150) {
			Class78.method674();
			if (InterfaceClickMask.safeModeEnabled) {
				Class120_Sub12_Sub19.currentDisplayMode = 0;
				AbstractMouseWheelHandler.antiAliasingSamplesWrapper = 0;
				Class36.antiAliasingSamples = 0;
				Class140.anInt1343 = 0;
			}
			InterfaceClickMask.safeModeEnabled = true;
			Class120_Sub6.savePreferences(NpcType.gameSignlink);
			AbstractSprite.changeDisplayMode(Class120_Sub12_Sub19.currentDisplayMode, -1, -1, false);
			OverridedJInterface.loadingBarPercent = 100;
			Class134.loadingText = World.aString2837;
			Class140.loadingStage = 160;
		} else if (Class140.loadingStage == 160) {
			EnumType.method1421(true);
		}
	}

	@Override
	final void method39() {
		if (HDToolkit.glEnabled) {
			HDToolkit.method519();
		}
		if (Class120_Sub14_Sub10.fullscreenFrame != null) {
			Class150.revertFrame(NpcType.gameSignlink, Class120_Sub14_Sub10.fullscreenFrame);
			Class120_Sub14_Sub10.fullscreenFrame = null;
		}
		if (Class110.mouseRecorder != null) {
			Class110.mouseRecorder.running = false;
		}
		Class110.mouseRecorder = null;
		if (AbstractTimer.worldConnection != null) {
			AbstractTimer.worldConnection.close();
			AbstractTimer.worldConnection = null;
		}
		Class26.removeKeyboard(Node.canvas);
		NodeCache.removeMouse(Node.canvas);
		if (Class120_Sub12_Sub31.mouseWheelHandler != null) {
			Class120_Sub12_Sub31.mouseWheelHandler.removeListener(Node.canvas);
		}
		Class26.removeKeyboardHandler();
		SeekableFile.removeMouseHandler();
		Class120_Sub12_Sub31.mouseWheelHandler = null;
		if (Class120_Sub12_Sub3.aClass164_3150 != null) {
			Class120_Sub12_Sub3.aClass164_3150.method2136();
		}
		if (Class120_Sub12_Sub29.aClass164_3366 != null) {
			Class120_Sub12_Sub29.aClass164_3366.method2136();
		}
		Class178.js5Worker.closeConnection();
		Class38.fileSystemWorker.stop();
	}

	static final InterfaceClickMask getClickMask(final JagexInterface jagexInterface) {
		final InterfaceClickMask class120_sub20 = (InterfaceClickMask) JavaObject.clickMaskCache.get(((long) jagexInterface.bitPacked << 32) + jagexInterface.componentIndex);
		return class120_sub20 != null ? class120_sub20 : jagexInterface.clickMask;
	}

	@Override
	final void mainInit() {
		InterfaceListener.updateCanvasPosition();
		Class38.fileSystemWorker = new FileSystemWorker();
		Class178.js5Worker = new Js5Worker();
		if (LocType.modeWhat != 0) {
			Class120_Sub12_Sub25.aByteArrayArray3318 = new byte[50][];
		}
		FrameLoader.method1577(NpcType.gameSignlink);
		if (AbstractIndexedSprite.modeWhere == 0) {
			Class120_Sub12_Sub30.aString3372 = getCodeBase().getHost();
			Hashtable.anInt675 = 43594;
			ObjectPile.anInt1808 = 43594;// 443;
		} else if (AbstractIndexedSprite.modeWhere == 1) {
			Class120_Sub12_Sub30.aString3372 = getCodeBase().getHost();
			ObjectPile.anInt1808 = Class136.defaultWorldId + 50000;
			Hashtable.anInt675 = Class136.defaultWorldId + 40000;
		} else if (AbstractIndexedSprite.modeWhere == 2) {
			Class120_Sub12_Sub30.aString3372 = "127.0.0.1";
			ObjectPile.anInt1808 = Class136.defaultWorldId + 50000;
			Hashtable.anInt675 = Class136.defaultWorldId + 40000;
		}
		Class120_Sub14_Sub22.aShortArray3639 = Class127.aShortArray1214 = Class69_Sub3_Sub1.aShortArray3085 = NodeSub.aShortArray2584 = new short[256];
		if (Signlink.anInt1310 == 3 && AbstractIndexedSprite.modeWhere != 2) {
			Class157.worldId = Class136.defaultWorldId;
		}
		if (Buffer.gameId != 1) {
			Class159.aShortArrayArray1489 = Class120_Sub12_Sub35.aShortArrayArray3414;
			Class120_Sub12_Sub37.aShortArray3429 = ObjectPile.aShortArray1804;
			Class120_Sub30_Sub1.aShortArrayArray3668 = SubScript.aShortArrayArray1764;
			SpotAnimType.aShortArray994 = Class5.aShortArray2152;
		} else {
			Class159.aShortArrayArray1489 = Class118.aShortArrayArray1136;
			Class120_Sub12_Sub37.aShortArray3429 = Class120_Sub11.aShortArray2556;
			Class120_Sub30_Sub1.aShortArrayArray3668 = UnderlayType.aShortArrayArray1221;
			SpotAnimType.aShortArray994 = Varp.aShortArray620;
			AtmosphereManager.defaultScreenColorRgb = 16777215;
			AtmosphereManager.defaulFogColorRgb = 0;
			Class120_Sub14_Sub4.aBoolean3470 = true;
		}
		Class71.anInt625 = Hashtable.anInt675;
		GameEntity.anInt3045 = ObjectPile.anInt1808;
		Class120_Sub12_Sub30.aString3375 = Class120_Sub12_Sub30.aString3372;
		Class116.anInt1115 = Hashtable.anInt675;
		Class158.anInt1479 = Class116.anInt1115;
		Class120_Sub12_Sub8.synchronizeKeyCodes();
		Class82.addKeyboard(Node.canvas);
		NodeCache.addMouse(Node.canvas);
		Class120_Sub12_Sub31.mouseWheelHandler = Class120_Sub12_Sub2.constructMouseWheelHandler();
		if (Class120_Sub12_Sub31.mouseWheelHandler != null) {
			Class120_Sub12_Sub31.mouseWheelHandler.addListener(Node.canvas);
		}
		Class120_Sub12_Sub20.anInt3284 = Signlink.anInt1310;
		try {
			if (NpcType.gameSignlink.cacheDatFile != null) {
				MapFunctionType.aClass193_663 = new SeekableFile(NpcType.gameSignlink.cacheDatFile, 5200, 0);
				for (int i_22_ = 0; i_22_ < 29; i_22_++) {
					ClanMember.aClass193Array2581[i_22_] = new SeekableFile(NpcType.gameSignlink.cacheIndexFiles[i_22_], 6000, 0);
				}
				Class86.aClass193_822 = new SeekableFile(NpcType.gameSignlink.masterIndexFile, 6000, 0);
				Class120_Sub12_Sub5.masterIndexFileSystem = new FileSystem(255, MapFunctionType.aClass193_663, Class86.aClass193_822, 500000);
				Class10.aClass193_78 = new SeekableFile(NpcType.gameSignlink.randomFile, 24, 0);
				NpcType.gameSignlink.masterIndexFile = null;
				NpcType.gameSignlink.cacheIndexFiles = null;
				NpcType.gameSignlink.cacheDatFile = null;
				NpcType.gameSignlink.randomFile = null;
			}
		} catch (final IOException ioexception) {
			Class10.aClass193_78 = null;
			Class86.aClass193_822 = null;
			Class120_Sub12_Sub5.masterIndexFileSystem = null;
			MapFunctionType.aClass193_663 = null;
		}
		if (AbstractIndexedSprite.modeWhere != 0) {
			HintIcon.showFps = true;
		}
		if (Buffer.gameId == 0) {
			Class120_Sub14_Sub15.gameLoadingText = Class120_Sub12_Sub18.aString3272;
		} else if (Buffer.gameId == 1) {
			Class120_Sub14_Sub15.gameLoadingText = ParticleNodeSub.aString2396;
		}
	}

	private final void decodeDefaults(final byte[] data) {
		final Buffer buffer = new Buffer(data);
		for (;;) {
			final int code = buffer.getUByte();
			if (code == 0) {
				break;
			}
			if (code == 1) {
				final int[] is_24_ = World.anIntArray2835 = new int[6];
				is_24_[0] = buffer.getUShort();
				is_24_[1] = buffer.getUShort();
				is_24_[2] = buffer.getUShort();
				is_24_[3] = buffer.getUShort();
				is_24_[4] = buffer.getUShort();
				is_24_[5] = buffer.getUShort();
			}
		}
	}

	private final void method56() {
		final boolean bool = Class178.js5Worker.process();
		if (!bool) {
			js5Connect();
		}
	}

	private final void js5Connect() {
		if (Class178.js5Worker.errorCount > Class116.anInt1113) {
			Buffer.anInt2473 = (-50 + 50 * Class178.js5Worker.errorCount) * 5;
			if (Buffer.anInt2473 > 3000) {
				Buffer.anInt2473 = 3000;
			}
			if (Class158.anInt1479 != Class71.anInt625) {
				Class158.anInt1479 = Class71.anInt625;
			} else {
				Class158.anInt1479 = GameEntity.anInt3045;
			}
			if (Class178.js5Worker.errorCount >= 2 && Class178.js5Worker.errorType == 6) {
				error("js5connect_outofdate");
				Class109.gameState = 1000;
				return;
			}
			if (Class178.js5Worker.errorCount >= 4 && Class178.js5Worker.errorType == -1) {
				error("js5crc");
				Class109.gameState = 1000;
				return;
			}
			if (Class178.js5Worker.errorCount >= 4 && (Class109.gameState == 0 || Class109.gameState == 5)) {
				if (Class178.js5Worker.errorType == 7 || Class178.js5Worker.errorType == 9) {
					error("js5connect_full");
				} else if (Class178.js5Worker.errorType <= 0) {
					error("js5io");
				} else {
					error("js5connect");
				}
				Class109.gameState = 1000;
				return;
			}
		}
		Class116.anInt1113 = Class178.js5Worker.errorCount;
		if (Buffer.anInt2473 > 0) {
			Buffer.anInt2473--;
		} else {
			try {
				if (Class120_Sub12_Sub33.js5Stage == 0) {
					GroundTile.js5ConnectionNode = NpcType.gameSignlink.openConnection(Class120_Sub12_Sub30.aString3375, Class158.anInt1479);
					Class120_Sub12_Sub33.js5Stage++;
				}
				if (Class120_Sub12_Sub33.js5Stage == 1) {
					if (GroundTile.js5ConnectionNode.status == 2) {
						js5Error(1000);
						return;
					}
					if (GroundTile.js5ConnectionNode.status == 1) {
						Class120_Sub12_Sub33.js5Stage++;
					}
				}
				if (Class120_Sub12_Sub33.js5Stage == 2) {
					Class120_Sub12_Sub11.js5Connection = new JagexSocket((Socket) GroundTile.js5ConnectionNode.value, NpcType.gameSignlink);
					final Buffer buffer = new Buffer(5);
					buffer.putByte(15);
					buffer.putInt(550);
					Class120_Sub12_Sub11.js5Connection.put(buffer.buf, 0, 5);
					Class120_Sub12_Sub33.js5Stage++;
					Class120_Sub12_Sub4.lastJs5ConnectionTime = TimeUtil.getSafeTime();
				}
				if (Class120_Sub12_Sub33.js5Stage == 3) {
					if (Class109.gameState != 0 && Class109.gameState != 5 && Class120_Sub12_Sub11.js5Connection.getAvailable() <= 0) {
						if ((TimeUtil.getSafeTime() - Class120_Sub12_Sub4.lastJs5ConnectionTime) > 30000L) {
							js5Error(1001);
							return;
						}
					} else {
						final int response = Class120_Sub12_Sub11.js5Connection.read();
						if (response != 0) {
							js5Error(response);
							return;
						}
						Class120_Sub12_Sub33.js5Stage++;
					}
				}
				if (Class120_Sub12_Sub33.js5Stage == 4) {
					final boolean bool = Class109.gameState == 5 || Class109.gameState == 10 || Class109.gameState == 28;
					Class178.js5Worker.method361(Class120_Sub12_Sub11.js5Connection, !bool);
					GroundTile.js5ConnectionNode = null;
					Class120_Sub12_Sub33.js5Stage = 0;
					Class120_Sub12_Sub11.js5Connection = null;
				}
			} catch (final IOException ioexception) {
				js5Error(1002);
			}
		}
	}

	static final JagexInterface method58(JagexInterface jagexInterface) {
		final int i = getClickMask(jagexInterface).method1683();
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
	final void method40() {
		ParticleEngine.method951();
		Class32.method269(-20507);
		Class80.method697(-1);
		WorldMapHandler.method681();
		Class120_Sub14_Sub22.method1637();
		Class137.method1981((byte) -97);
		GameShell.method35();
		HDToolkit.method516();
		AbstractTimer.method736(-66);
		AbstractGraphicsBuffer.method1848(84167136);
		MouseRecorder.method762((byte) -59);
		HintIcon.method726(255);
		Buffer.method1076();
		JagexSocket.method372(14420);
		Js5Worker.method359(-29587);
		FileSystemWorker.a();
		Class112.method988();
		Class53_Sub1.aString2213 = null;
		Class53_Sub1.worldConnectionNode = null;
		Class53_Sub1.aString2206 = null;
		SeekableFile.method2523((byte) 35);
		FileSystem.method445(255);
		ObjectCache.method188(114);
		Npc.method2347(2980);
		PacketBuffer.method1150((byte) 95);
		CollisionMap.method217();
		JagexInterface.method2498(-107);
		DisplayModeInfo.method2216(true);
		AbstractSprite.method1586(16);
		AbstractMouseWheelHandler.method157(11170);
		ClanMember.method1406(-31470);
		GrandExchangeObject.method2098(1);
		Class120_Sub30_Sub2.method1776(16990);
		Decimator.method2222(false);
		PlayerAppearance.method2034(-22374);
		SeqType.method329();
		GameEntity.method2331();
		GroundTile.method1672(14888);
		Class120_Sub24.method1718((byte) -76);
		NpcType.method2200();
		OverridedJInterface.method1723(-11);
		InterfaceClickMask.method1684();
		Class173.method2229((byte) 59);
		Node.method1030(71);
		IsaacCipher.method902(2);
		Class65.method577((byte) 77);
		FrameLoader.method1582((byte) -49);
		Class150.method2062();
		Class10.method120();
		Class55.method484(-7103);
		Class38.method312();
		Class174.method2232(0);
		Class9.method118();
		Class158.method2091(-78);
		Class169.method2198(true);
		RuntimeException_Sub1.method2529(-16553);
		Class71.method638();
		Class34.method287();
		Class39.method318(-66);
		Class116.method1010((byte) 104);
		FileSystemRequest.method1543(-70);
		Js5Request.method1549(-127);
		Class93.method773(1);
		Class86.method732(false);
		LocType.method2462(20259);
		Class156.method2086(-2366);
		AtmosphereManager.method1019();
		Class136.method1979(64);
		Class180_Sub2.method2289();
		Class88.method745(true);
		HDModel.method2406();
		ObjType.method2119();
		LDModel.method2394();
		KeyboardHandler.anIntArray1503 = null;
		KeyboardHandler.anIntArray1506 = null;
		KeyboardHandler.aBigInteger1505 = null;
		KeyboardHandler.titlebgSprite = null;
		SeqType.recentUse = null;
		Class148.method2059(1);
		Class90.method750();
		MemoryManager.method997();
		Class37.method310();
		Class82.method714((byte) -78);
		Canvas_Sub1.method61();
		Class179.method2259(27440);
		AbstractIndexedSprite.method909(true);
		AbstractFont.method1479();
		Class111.method983(212098599);
		Class120_Sub6.method1072(false);
		Class62.method565();
		Class120_Sub30_Sub1.method1742(1970740129);
		Class120_Sub22.method1703(-104);
		Class79_Sub1.method694();
		MapFunctionNode.method1439();
		WorldMapFont.method814();
		Class127.method1894((byte) -128);
		MapFunctionType.method649();
		Class53.method456((byte) 126);
		MasterIndexInfo.method454();
		AbstractRequest.method1536(false);
		Class74.method651();
		GraphicsLD.method2163();
		Class178.method2258((byte) -106);
		GZIPDecompressor.method719();
		ParamType.method1513(-1);
		NodeSub.method1409(88);
		NodeCache.method298(-51);
		OverlayType.aClass98_1201 = null;
		Class54.method481(126);
		UnderlayType.method1902((byte) -110);
		IdentityKit.aClass191ArrayArray1337 = null;
		StructType.method1560(50);
		Class81.method703();
		SpotAnimType.aClass50_1443 = null;
		Class154.aClass21_1438 = null;
		Class154.aClass32Array1437 = null;
		Class29.method256();
		SpotAnimType.method878();
		Varp.method634(true);
		Class41.method332();
		EnumType.method1424(0);
		Class120_Sub14_Sub10.method1509(true);
		Class125.method1880((byte) 124);
		Class120_Sub14_Sub23.method1641(32768);
		Class145.spritePaletteIndicators = null;
		Class97.method805();
		Class153.method2071();
		Class181.method2438(0);
		Light.method352();
		CursorType.method1915();
		MapSceneType.method2012();
		Class143_Sub1.anIntArrayArrayArray2195 = null;
		Class143_Sub1.aString2192 = null;
		Class143.method2017((byte) -10);
		Class114.method1003();
		Class120_Sub14_Sub13.method1527(51);
		Class120_Sub14_Sub17.method1574();
		Class120_Sub14_Sub15.method1555();
		Rasterizer.method872();
		Class2.method78((byte) -54);
		Class15.method146(-128);
		InvType.method2179();
		World.method2192(-33);
		Class92.method765((byte) -118);
		WorldInfo.method2068(false);
		Class78.method669();
		Class191.method2507((byte) -64);
		Class120_Sub14_Sub9.method1493();
		Class187.method2476((byte) 80);
		Class23.method203(5);
		SubScript.method2245((byte) -128);
		Class22.method195(-63361369);
		InterfaceListener.method1169((byte) -111);
		ClientScript.method1523(37);
		SceneGraphNode.method2270();
		Class120_Sub9.method1164();
		Class28.method245(8856);
		Class182.method2442();
		Class186.method2474(10262);
		Class36.method308(30900);
		ObjectPile.method2449();
		PlainTile.method2002(0);
		ShapedTile.method2197();
		LabelGroup.method1038();
		Class43.method344((byte) 93);
		Class118.method1023(-80);
		SeqFrame.method75();
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
		LongNode.method1058(1);
		InterfaceChangeNode.method1451(120);
		ObjectContainer.method1666();
		AmbientSound.method1157(0);
		Class110.method977((byte) -97);
		Class175.method2239();
		Class11.method129(34);
		Class89.method747();
		TileParticleQueue.method824();
		Projectile.method2321(13);
		SpotAnimation.method2316();
		Class147.aString1397 = null;
		Class147.aString1398 = null;
		IdentityKit.configClient = null;
		Class147.anIntArray1396 = null;
		SceneGroundObject.method2277();
		Class120_Sub29.method1729(8);
		AnimatedLocation.method2351(-1);
		VarBit.resetLol();
		Class140.method1999((byte) 127);
		Class120_Sub14_Sub24.method1646(0);
		ParticleNodeSub.method966(-61);
		IntegerNode.method1832(0);
		Class59.method543();
		Class120_Sub4.method1065((byte) 43);
		CanvasWrapper.method67();
		Class7.method105(128);
		ProducingGraphicsBuffer.method1852(-1);
		Class26.method231((byte) 84);
		Class159.method2093(30000);
		LookupTable.method490();
		Class19.method172();
		Class96.method790();
		JavaObject.method1433(0);
		Class57.method491(-18);
		Class120_Sub11.method1175((byte) -58);
		Class157.method2089(118);
		Class164_Sub2.method2149();
		Class146.method2051();
		StringNode.method1719(58);
		Class121.method1836();
		Class76.method664();
		Class134.method1950(-9077);
		LavaShader.method551();
		Class14.method144();
		WaterfallShader.aClass50_2169 = null;
		WaterfallShader.loadingFontMetrics = null;
		Class5.aString2153 = null;
		Class5.aShortArray2152 = null;
		Class131.method1921();
		Class31.method266(false);
		Class120_Sub23.method1713();
		Class16.method151();
		Class120_Sub21.method1696(26213);
		Class120_Sub12_Sub12.method1260((byte) -128);
		Class132.method1929(0);
		Class120_Sub12.aString2566 = null;
		Class120_Sub12.aLongArray2562 = null;
		Class120_Sub12.anIntArray2567 = null;
		Class120_Sub12.spriteAlphas = null;
		Class120_Sub12.anIntArray2565 = null;
		Class109.method974(126);
		Class30.method260(125);
		Class99.method823();
		Class120_Sub12_Sub24.method1327((byte) -84);
		Class120_Sub12_Sub21.method1310(1);
		Class120_Sub12_Sub8.method1238(23086);
		Class167.method2188((byte) 122);
		Class132_Sub1.method1935(2061936524);
		Class24.method206((byte) -102);
		Class68.method602();
		ReflectionCheckNode.method1724();
		Class8.method112();
		Class33.method278(0);
		Class120_Sub12_Sub11.method1252(-129);
		Class120_Sub12_Sub23.method1324(-1);
		Class120_Sub12_Sub7.method1235(false);
		Class120_Sub12_Sub33.method1375();
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
		Class120_Sub12_Sub36.method1388();
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
		Class69_Sub3_Sub1.aClass75_3079 = null;
		Class69_Sub3_Sub1.aShortArray3085 = null;
		Class69_Sub3_Sub1.aClass189_3080 = null;
		Class69_Sub3_Sub1.screenRedrawHeights = null;
		Class69_Sub3_Sub1.anIntArray3082 = null;
		Class69_Sub1.method617((byte) -96);
		Class69_Sub2_Sub1.aString3078 = null;
		Class69_Sub2.method619(0);
		GroundObjectNode.method1626(7581);
		ProjectileNode.aString3449 = null;
		Class120_Sub14_Sub4.method1436(55);
		DummyInputStream.method70(false);
		DummyOutputStream.method74(-109);
		Class120_Sub16.method1655(true);
		Class120_Sub15.method1653(-3909);
		Class120_Sub19.method1674(6530);
		Class101.aClass50_966 = null;
		Class101.aString963 = null;
		Class101_Sub2.method845(-1739218740);
		Class101_Sub4.method850((byte) -34);
		Class101_Sub3.method847(-1);
		Class101_Sub1.method839((byte) 116);
	}

	@Override
	public final void init() {
		if (checkHost()) {
			Class136.defaultWorldId = Integer.parseInt(getParameter("worldid"));
			AbstractIndexedSprite.modeWhere = Integer.parseInt(getParameter("modewhere"));
			if (AbstractIndexedSprite.modeWhere < 0 || AbstractIndexedSprite.modeWhere > 1) {
				AbstractIndexedSprite.modeWhere = 0;
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

	/*
	 * public static final void main(final String[] strings) { try { if
	 * (strings.length != 4) { Class43.method345("argument count"); }
	 * Class136.defaultWorldId = Integer.parseInt(strings[0]);
	 * Class107.modeWhere = 2; if (strings[1].equals("live")) { LocType.modeWhat
	 * = 0; } else if (strings[1].equals("rc")) { LocType.modeWhat = 1; } else
	 * if (strings[1].equals("wip")) { LocType.modeWhat = 2; } else {
	 * Class43.method345("modewhat"); } Class31.advertSuppressed = false;
	 * Class9.language = DummyInputStream.getLanguageId(strings[2]); if
	 * (Class9.language != 0) { if (strings[2].equals("english")) {
	 * Class9.language = 0; } else if (strings[2].equals("german")) {
	 * Class9.language = 1; } else { Class43.method345("language"); } }
	 * Class120_Sub12_Sub11.translateStrings(Class9.language); Class48.jsEnabled
	 * = false; Class110.objectTagEnabled = false; if
	 * (strings[3].equals("game0")) { Buffer.gameId = 0; } else if
	 * (strings[3].equals("game1")) { Buffer.gameId = 1; } else {
	 * Class43.method345("game"); } Class120_Sub12_Sub25.settings = "";
	 * FileSystem.haveInternetExplorer6 = false; Node.countryId = 0;
	 * Class120_Sub12_Sub33.affiliateId = 0; final client var_client = new
	 * client(); Class179.aClient1776 = var_client;
	 * var_client.startApplication(Buffer.gameId != 1 ? "runescape" :
	 * "mechscape", 32 + LocType.modeWhat, 550, 29, 768, 1024);
	 * Class112.frame.setLocation(40, 40); } catch (final Exception exception) {
	 * Class180_Sub3.method2312(exception, null); } }
	 */

	static final boolean isHidden(final JagexInterface jagexInterface) {
		if (Class120_Sub30_Sub1.aBoolean3673) {
			if (getClickMask(jagexInterface).optionMask != 0) {
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
			final long l = Class29.method255() / 1000000L - WaterfallShader.aLong2173;
			WaterfallShader.aLong2173 = Class29.method255() / 1000000L;
			final boolean bool = Class120_Sub12_Sub5.method1220((byte) 127);
			if (bool && Class120_Sub12_Sub15.aBoolean3247 && Class120_Sub12_Sub3.aClass164_3150 != null) {
				Class120_Sub12_Sub3.aClass164_3150.method2144((byte) -42);
			}
			if ((Class109.gameState == 30 || Class109.gameState == 10) && (LongNode.canvasReplaceRecommended || Class15.aLong98 != 0L && (Class15.aLong98 ^ 0xffffffffffffffffL) > (TimeUtil.getSafeTime() ^ 0xffffffffffffffffL))) {
				AbstractSprite.changeDisplayMode(Class120_Sub12_Sub4.getDisplayMode(), Class120_Sub12_Sub18.lastFullscreenWidth, Class120_Sub12_Sub12.lastFullscreenHeight, LongNode.canvasReplaceRecommended);
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
				int frameWidth = container.getSize().width;
				int frameHeight = container.getSize().height;
				if (Class112.frame == container) {
					final Insets insets = Class112.frame.getInsets();
					frameWidth -= insets.left + insets.right;
					frameHeight -= insets.bottom + insets.top;
				}
				if (Class120_Sub12_Sub7.frameWidth != frameWidth || PlayerAppearance.frameHeight != frameHeight) {
					if (!Signlink.osName.startsWith("mac")) {
						InterfaceListener.updateCanvasPosition();
					} else {
						Class120_Sub12_Sub7.frameWidth = frameWidth;
						PlayerAppearance.frameHeight = frameHeight;
					}
					Class15.aLong98 = TimeUtil.getSafeTime() + 500L;
				}
			}
			if (Class120_Sub14_Sub10.fullscreenFrame != null && !DummyInputStream.focus && (Class109.gameState == 30 || Class109.gameState == 10)) {
				AbstractSprite.changeDisplayMode(Class120_Sub12_Sub19.currentDisplayMode, -1, -1, false);
			}
			boolean needFullRedraw = false;
			if (Class120_Sub12_Sub26.fullRedraw) {
				needFullRedraw = true;
				Class120_Sub12_Sub26.fullRedraw = false;
			}
			if (needFullRedraw) {
				Class120_Sub12_Sub22.method1322();
			}
			if (HDToolkit.glEnabled) {
				for (int id = 0; id < 100; id++) {
					MasterIndexInfo.needInterfaceRedrawWrapper[id] = true;
				}
			}
			if (Class109.gameState != 0) {
				if (Class109.gameState == 5) {
					UnderlayType.method1909(Class120_Sub12_Sub22.boldFont, false);
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
						if (AbstractBuffer.anInt599 > Class145.anInt1379) {
							Class145.anInt1379 = AbstractBuffer.anInt599;
						}
						final int i_36_ = (Class145.anInt1379 + -AbstractBuffer.anInt599) * 50 / Class145.anInt1379;
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
					SceneGroundObject.method2276();
				}
			} else {
				Class11.drawLoadingText(null, needFullRedraw, OverridedJInterface.loadingBarPercent, Class134.loadingText);
			}
			if (!HDToolkit.glEnabled || Class109.gameState == 0) {
				if (Class109.gameState != 30 && Class109.gameState != 10 || Class15.rectDebugType != 0 || needFullRedraw) {
					if (Class109.gameState != 0) {
						try {
							final Graphics graphics = Node.canvas.getGraphics();
							ClanMember.fullscreenGraphics.drawImage(graphics, 0, 0);
							for (int i_38_ = 0; LabelGroup.screenRedrawPos > i_38_; i_38_++) {
								Class120_Sub12_Sub33.needScreenRedraw[i_38_] = false;
							}
						} catch (final Exception exception) {
							Node.canvas.repaint();
						}
					}
				} else {
					try {
						final Graphics graphics = Node.canvas.getGraphics();
						for (int i_39_ = 0; i_39_ < LabelGroup.screenRedrawPos; i_39_++) {
							if (Class120_Sub12_Sub33.needScreenRedraw[i_39_]) {
								ClanMember.fullscreenGraphics.drawClippedImage(graphics, GrandExchangeObject.screenRedrawXs[i_39_], Class120_Sub12_Sub38.screenRedrawYs[i_39_], Class120_Sub16.screenRedrawWidhts[i_39_], Class69_Sub3_Sub1.screenRedrawHeights[i_39_]);
								Class120_Sub12_Sub33.needScreenRedraw[i_39_] = false;
							}
						}
					} catch (final Exception exception) {
						Node.canvas.repaint();
					}
				}
			} else {
				HDToolkit.method536();
				for (int i_40_ = 0; i_40_ < LabelGroup.screenRedrawPos; i_40_++) {
					Class120_Sub12_Sub33.needScreenRedraw[i_40_] = false;
				}
			}
			if (SeekableFile.aBoolean2138) {
				StructType.method1562();
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
				MasterIndexInfo.anInt478 = 600 * gregoriancalendar.get(11) - -(10 * gregoriancalendar.get(12)) + gregoriancalendar.get(13) / 6;
				Class136.aRandom1319.setSeed(MasterIndexInfo.anInt478);
			}
			method56();
			if (EnumType.aClass112_3460 != null) {// js5
				EnumType.aClass112_3460.method985();
			}
			MapSceneType.method2005();
			Class120_Sub2.method1050();
			PlainTile.method2001();
			Class26.handleMouse();
			if (HDToolkit.glEnabled) {
				MemoryManager.process();
			}
			if (Class120_Sub12_Sub31.mouseWheelHandler != null) {
				AbstractBuffer.mouseWheelRotation = Class120_Sub12_Sub31.mouseWheelHandler.getRotation();
			}
			if (Class109.gameState == 0) {
				load();
				Class69.method613();
			} else if (Class109.gameState == 5) {
				load();
				Class69.method613();
			} else if (Class109.gameState == 25 || Class109.gameState == 28) {
				Class164.rebuildMap();
			}
			if (Class109.gameState == 10) {
				method50();
				Class69_Sub3_Sub1.method631();
				JagexSocket.method374();
				Class120_Sub12_Sub25.handleLogin();
			} else if (Class109.gameState == 30) {
				Class120_Sub21.method1700();
			} else if (Class109.gameState == 40) {
				Class120_Sub12_Sub25.handleLogin();
				if (Class48.returnCode != -3) {
					if (Class48.returnCode != 15) {
						if (Class48.returnCode != 2) {
							DummyInputStream.processLogout();
						}
					} else {
						Class120_Sub16.method1663();
					}
				}
			}
		}
	}

	static final void method60(final JagexInterface[] childs, final int parent, final int i_41_, final int i_42_, final int i_43_, final int i_44_, final int xOff, final int yOff) {
		for (int childId = 0; childId < childs.length; childId++) {
			final JagexInterface jagexInterface = childs[childId];
			if (jagexInterface != null && jagexInterface.parent == parent && (!jagexInterface.newFormat || jagexInterface.type == 0 || jagexInterface.aBoolean1940 || getClickMask(jagexInterface).optionMask != 0 || jagexInterface == Class26.aClass189_161 || jagexInterface.clientCode == 1338) && (!jagexInterface.newFormat || !isHidden(jagexInterface))) {
				final int i_48_ = jagexInterface.x + xOff;
				final int i_49_ = jagexInterface.y + yOff;
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
					int i_54_ = i_48_ + jagexInterface.width;
					int i_55_ = i_49_ + jagexInterface.height;
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
				if (!jagexInterface.newFormat || i_50_ < i_52_ && i_51_ < i_53_) {
					if (jagexInterface.type == 0) {
						if (!jagexInterface.newFormat && isHidden(jagexInterface) && CursorType.aClass189_1243 != jagexInterface) {
							continue;
						}
						if (jagexInterface.aBoolean1960 && Queue.lastMouseX >= i_50_ && Class191.lastMouseY >= i_51_ && Queue.lastMouseX < i_52_ && Class191.lastMouseY < i_53_) {
							for (InterfaceListener class120_sub10 = (InterfaceListener) Class88.aClass105_829.getFront(); class120_sub10 != null; class120_sub10 = (InterfaceListener) Class88.aClass105_829.getNext()) {
								if (class120_sub10.aBoolean2536) {
									class120_sub10.unlink();
									class120_sub10.aClass189_2534.aBoolean2035 = false;
								}
							}
							if (SceneGroundObject.anInt2843 == 0) {
								Class120_Sub12_Sub4.aClass189_3156 = null;
								Class26.aClass189_161 = null;
							}
							EnumType.anInt3450 = 0;
							Class80.mouseInsideWorldMap = false;
						}
					}
					if (jagexInterface.newFormat) {
						boolean mouseOver;
						if (Queue.lastMouseX >= i_50_ && Class191.lastMouseY >= i_51_ && Queue.lastMouseX < i_52_ && Class191.lastMouseY < i_53_) {
							mouseOver = true;
						} else {
							mouseOver = false;
						}
						boolean bool_56_ = false;
						if (InterfaceChangeNode.lastMousePress == 1 && mouseOver) {
							bool_56_ = true;
						}
						boolean bool_57_ = false;
						if (Class156.lastMouseClick == 1 && js5.lastClickX >= i_50_ && Class120_Sub12_Sub36.lastClickY >= i_51_ && js5.lastClickX < i_52_ && Class120_Sub12_Sub36.lastClickY < i_53_) {
							bool_57_ = true;
						}
						if (jagexInterface.aByteArray2048 != null) {
							for (int i_58_ = 0; i_58_ < jagexInterface.aByteArray2048.length; i_58_++) {
								if (!NodeCache.heldKeys[jagexInterface.aByteArray2048[i_58_]]) {
									if (jagexInterface.anIntArray1973 != null) {
										jagexInterface.anIntArray1973[i_58_] = 0;
									}
								} else if (jagexInterface.anIntArray1973 == null || Class101_Sub2.loopCycle >= jagexInterface.anIntArray1973[i_58_]) {
									final byte i_59_ = jagexInterface.aByteArray1955[i_58_];
									if (i_59_ == 0 || ((i_59_ & 0x8) == 0 || !NodeCache.heldKeys[86] && !NodeCache.heldKeys[82] && !NodeCache.heldKeys[81]) && ((i_59_ & 0x2) == 0 || NodeCache.heldKeys[86]) && ((i_59_ & 0x1) == 0 || NodeCache.heldKeys[82]) && ((i_59_ & 0x4) == 0 || NodeCache.heldKeys[81])) {
										Class120_Sub14_Sub22.method1629(jagexInterface.bitPacked, -1, i_58_ + 1, "");
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
							Class120_Sub12_Sub8.method1241(jagexInterface, js5.lastClickX - i_48_, Class120_Sub12_Sub36.lastClickY - i_49_);
						}
						if (Class120_Sub12_Sub4.aClass189_3156 != null && Class120_Sub12_Sub4.aClass189_3156 != jagexInterface && mouseOver && getClickMask(jagexInterface).method1677()) {
							LocType.aClass189_1818 = jagexInterface;
						}
						if (jagexInterface == Class26.aClass189_161) {
							Class111.aBoolean1058 = true;
							Class120_Sub12_Sub7.anInt3183 = i_48_;
							Class120_Sub12_Sub35.anInt3413 = i_49_;
						}
						if (jagexInterface.aBoolean1940 || jagexInterface.clientCode != 0) {
							if (mouseOver && AbstractBuffer.mouseWheelRotation != 0 && jagexInterface.mouseWheelListener != null) {
								final InterfaceListener class120_sub10 = new InterfaceListener();
								class120_sub10.aBoolean2536 = true;
								class120_sub10.aClass189_2534 = jagexInterface;
								class120_sub10.anInt2540 = AbstractBuffer.mouseWheelRotation;
								class120_sub10.objectData = jagexInterface.mouseWheelListener;
								Class88.aClass105_829.addLast(class120_sub10);
							}
							if (Class120_Sub12_Sub4.aClass189_3156 != null || Projectile.aClass189_2954 != null || Class15.menuOpen || jagexInterface.clientCode != 1400 && EnumType.anInt3450 > 0) {
								bool_57_ = false;
								bool_56_ = false;
								mouseOver = false;
							}
							if (jagexInterface.clientCode != 0) {
								if (jagexInterface.clientCode == 1337) {
									DummyInputStream.aClass189_26 = jagexInterface;
									continue;
								}
								if (jagexInterface.clientCode == 1338) {
									if (bool_57_) {
										FileSystem.anInt457 = js5.lastClickX - i_48_;
										Class53_Sub1.anInt2219 = Class120_Sub12_Sub36.lastClickY - i_49_;
									}
									continue;
								}
								if (jagexInterface.clientCode == 1400) {
									MapSceneType.worldMapInterface = jagexInterface;
									if (mouseOver) {
										Class80.mouseInsideWorldMap = true;
									}
									if (bool_57_) {
										final int i_61_ = (int) ((js5.lastClickX - i_48_ - jagexInterface.width / 2) * 2.0 / WorldMapHandler.currentZoom);
										final int i_62_ = (int) ((Class120_Sub12_Sub36.lastClickY - i_49_ - jagexInterface.height / 2) * 2.0 / WorldMapHandler.currentZoom);
										final int i_63_ = ParticleManager.anInt2336 + i_61_;
										final int i_64_ = Class169.anInt1646 + i_62_;
										final int i_65_ = i_63_ + WorldMapHandler.anInt695;
										final int i_66_ = WorldMapHandler.mapSizeY - 1 - i_64_ + WorldMapHandler.anInt694;
										final Class120_Sub14_Sub22 class120_sub14_sub22 = ParticleManager.method938();
										if (class120_sub14_sub22 != null) {
											final int[] is = new int[3];
											class120_sub14_sub22.method1635(i_65_, i_66_, is);
											if (is != null) {
												if (NodeCache.heldKeys[82] && Class86.staffLevel > 0) {
													ParticleNode.tele(is[1], is[2], is[0]);
													Class90.removeOverridedInterfaces();
													continue;
												}
												Class120_Sub12_Sub11.outputStream.putByteIsaac(251);
												Class120_Sub12_Sub11.outputStream.putInt1(is[0] << 28 | is[1] << 14 | is[2]);
											}
											EnumType.anInt3450 = 1;
											Class30.aBoolean226 = false;
											AbstractGraphicsBuffer.anInt1173 = Queue.lastMouseX;
											anInt2203 = Class191.lastMouseY;
										}
									} else if (bool_56_ && EnumType.anInt3450 > 0) {
										if (EnumType.anInt3450 == 1 && (AbstractGraphicsBuffer.anInt1173 != Queue.lastMouseX || anInt2203 != Class191.lastMouseY)) {
											Class120_Sub2.anInt2421 = ParticleManager.anInt2336;
											EnumType.anInt3456 = Class169.anInt1646;
											EnumType.anInt3450 = 2;
										}
										if (EnumType.anInt3450 == 2) {
											Class30.aBoolean226 = true;
											VarBit.method236(false, Class120_Sub2.anInt2421 + (int) ((AbstractGraphicsBuffer.anInt1173 - Queue.lastMouseX) * 2.0 / WorldMapHandler.wantedZoom));
											Class179.method2260(EnumType.anInt3456 + (int) ((anInt2203 - Class191.lastMouseY) * 2.0 / WorldMapHandler.wantedZoom));
										}
									} else {
										if (EnumType.anInt3450 > 0 && !Class30.aBoolean226) {
											if ((Class69.mouseButtons == 1 || Class120_Sub14_Sub4.method1438(Class186.menuOptionCount - 1)) && Class186.menuOptionCount > 2) {
												Class120_Sub12_Sub28.determineMenuSize();
											} else if (Class186.menuOptionCount > 0) {
												Class191.method2508();
											}
										}
										EnumType.anInt3450 = 0;
									}
									continue;
								}
								if (jagexInterface.clientCode == 1401) {
									if (bool_56_) {
										Npc.method2348(Class191.lastMouseY - i_49_, jagexInterface.width, jagexInterface.height, Queue.lastMouseX - i_48_);
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
								if (jagexInterface.mouseClickFocusListener != null) {
									final InterfaceListener class120_sub10 = new InterfaceListener();
									class120_sub10.aBoolean2536 = true;
									class120_sub10.aClass189_2534 = jagexInterface;
									class120_sub10.anInt2543 = js5.lastClickX - i_48_;
									class120_sub10.anInt2540 = Class120_Sub12_Sub36.lastClickY - i_49_;
									class120_sub10.objectData = jagexInterface.mouseClickFocusListener;
									Class88.aClass105_829.addLast(class120_sub10);
								}
							}
							if (jagexInterface.aBoolean1971 && bool_56_ && jagexInterface.anObjectArray1993 != null) {
								final InterfaceListener class120_sub10 = new InterfaceListener();
								class120_sub10.aBoolean2536 = true;
								class120_sub10.aClass189_2534 = jagexInterface;
								class120_sub10.anInt2543 = Queue.lastMouseX - i_48_;
								class120_sub10.anInt2540 = Class191.lastMouseY - i_49_;
								class120_sub10.objectData = jagexInterface.anObjectArray1993;
								Class88.aClass105_829.addLast(class120_sub10);
							}
							if (jagexInterface.aBoolean1971 && !bool_56_) {
								jagexInterface.aBoolean1971 = false;
								if (jagexInterface.mouseClickUnfocusListener != null) {
									final InterfaceListener class120_sub10 = new InterfaceListener();
									class120_sub10.aBoolean2536 = true;
									class120_sub10.aClass189_2534 = jagexInterface;
									class120_sub10.anInt2543 = Queue.lastMouseX - i_48_;
									class120_sub10.anInt2540 = Class191.lastMouseY - i_49_;
									class120_sub10.objectData = jagexInterface.mouseClickUnfocusListener;
									FileSystem.aClass105_456.addLast(class120_sub10);
								}
							}
							if (bool_56_ && jagexInterface.mouseDraggedListener != null) {
								final InterfaceListener class120_sub10 = new InterfaceListener();
								class120_sub10.aBoolean2536 = true;
								class120_sub10.aClass189_2534 = jagexInterface;
								class120_sub10.anInt2543 = Queue.lastMouseX - i_48_;
								class120_sub10.anInt2540 = Class191.lastMouseY - i_49_;
								class120_sub10.objectData = jagexInterface.mouseDraggedListener;
								Class88.aClass105_829.addLast(class120_sub10);
							}
							if (!jagexInterface.aBoolean2035 && mouseOver) {
								jagexInterface.aBoolean2035 = true;
								if (jagexInterface.mouseFocusListener != null) {
									final InterfaceListener class120_sub10 = new InterfaceListener();
									class120_sub10.aBoolean2536 = true;
									class120_sub10.aClass189_2534 = jagexInterface;
									class120_sub10.anInt2543 = Queue.lastMouseX - i_48_;
									class120_sub10.anInt2540 = Class191.lastMouseY - i_49_;
									class120_sub10.objectData = jagexInterface.mouseFocusListener;
									Class88.aClass105_829.addLast(class120_sub10);
								}
							}
							if (jagexInterface.aBoolean2035 && mouseOver && jagexInterface.anObjectArray1953 != null) {
								final InterfaceListener class120_sub10 = new InterfaceListener();
								class120_sub10.aBoolean2536 = true;
								class120_sub10.aClass189_2534 = jagexInterface;
								class120_sub10.anInt2543 = Queue.lastMouseX - i_48_;
								class120_sub10.anInt2540 = Class191.lastMouseY - i_49_;
								class120_sub10.objectData = jagexInterface.anObjectArray1953;
								Class88.aClass105_829.addLast(class120_sub10);
							}
							if (jagexInterface.aBoolean2035 && !mouseOver) {
								jagexInterface.aBoolean2035 = false;
								if (jagexInterface.mouseUnfocusListener != null) {
									final InterfaceListener class120_sub10 = new InterfaceListener();
									class120_sub10.aBoolean2536 = true;
									class120_sub10.aClass189_2534 = jagexInterface;
									class120_sub10.anInt2543 = Queue.lastMouseX - i_48_;
									class120_sub10.anInt2540 = Class191.lastMouseY - i_49_;
									class120_sub10.objectData = jagexInterface.mouseUnfocusListener;
									FileSystem.aClass105_456.addLast(class120_sub10);
								}
							}
							if (jagexInterface.anObjectArray1998 != null) {
								final InterfaceListener class120_sub10 = new InterfaceListener();
								class120_sub10.aClass189_2534 = jagexInterface;
								class120_sub10.objectData = jagexInterface.anObjectArray1998;
								Class120_Sub4.aClass105_2435.addLast(class120_sub10);
							}
							if (jagexInterface.anObjectArray2062 != null && Class120_Sub12_Sub23.anInt3308 > jagexInterface.anInt2033) {
								if (jagexInterface.integerScriptsValuesTriggers == null || Class120_Sub12_Sub23.anInt3308 - jagexInterface.anInt2033 > 32) {
									final InterfaceListener class120_sub10 = new InterfaceListener();
									class120_sub10.aClass189_2534 = jagexInterface;
									class120_sub10.objectData = jagexInterface.anObjectArray2062;
									Class88.aClass105_829.addLast(class120_sub10);
								} else {
									while_38_: for (int i_67_ = jagexInterface.anInt2033; i_67_ < Class120_Sub12_Sub23.anInt3308; i_67_++) {
										final int i_68_ = Class101_Sub4.anIntArray2296[i_67_ & 0x1f];
										for (int i_69_ = 0; i_69_ < jagexInterface.integerScriptsValuesTriggers.length; i_69_++) {
											if (jagexInterface.integerScriptsValuesTriggers[i_69_] == i_68_) {
												final InterfaceListener class120_sub10 = new InterfaceListener();
												class120_sub10.aClass189_2534 = jagexInterface;
												class120_sub10.objectData = jagexInterface.anObjectArray2062;
												Class88.aClass105_829.addLast(class120_sub10);
												break while_38_;
											}
										}
									}
								}
								jagexInterface.anInt2033 = Class120_Sub12_Sub23.anInt3308;
							}
							if (jagexInterface.anObjectArray2032 != null && Class112.anInt1077 > jagexInterface.anInt2064) {
								if (jagexInterface.stringScriptValuesTriggers == null || Class112.anInt1077 - jagexInterface.anInt2064 > 32) {
									final InterfaceListener class120_sub10 = new InterfaceListener();
									class120_sub10.aClass189_2534 = jagexInterface;
									class120_sub10.objectData = jagexInterface.anObjectArray2032;
									Class88.aClass105_829.addLast(class120_sub10);
								} else {
									while_39_: for (int i_70_ = jagexInterface.anInt2064; i_70_ < Class112.anInt1077; i_70_++) {
										final int i_71_ = Class101_Sub4.anIntArray2304[i_70_ & 0x1f];
										for (int i_72_ = 0; i_72_ < jagexInterface.stringScriptValuesTriggers.length; i_72_++) {
											if (jagexInterface.stringScriptValuesTriggers[i_72_] == i_71_) {
												final InterfaceListener class120_sub10 = new InterfaceListener();
												class120_sub10.aClass189_2534 = jagexInterface;
												class120_sub10.objectData = jagexInterface.anObjectArray2032;
												Class88.aClass105_829.addLast(class120_sub10);
												break while_39_;
											}
										}
									}
								}
								jagexInterface.anInt2064 = Class112.anInt1077;
							}
							if (jagexInterface.anObjectArray2050 != null && VarBit.anInt165 > jagexInterface.anInt2028) {
								if (jagexInterface.varpListenerTriggers == null || VarBit.anInt165 - jagexInterface.anInt2028 > 32) {
									final InterfaceListener class120_sub10 = new InterfaceListener();
									class120_sub10.aClass189_2534 = jagexInterface;
									class120_sub10.objectData = jagexInterface.anObjectArray2050;
									Class88.aClass105_829.addLast(class120_sub10);
								} else {
									while_40_: for (int i_73_ = jagexInterface.anInt2028; i_73_ < VarBit.anInt165; i_73_++) {
										final int i_74_ = Class88.anIntArray833[i_73_ & 0x1f];
										for (int i_75_ = 0; i_75_ < jagexInterface.varpListenerTriggers.length; i_75_++) {
											if (jagexInterface.varpListenerTriggers[i_75_] == i_74_) {
												final InterfaceListener class120_sub10 = new InterfaceListener();
												class120_sub10.aClass189_2534 = jagexInterface;
												class120_sub10.objectData = jagexInterface.anObjectArray2050;
												Class88.aClass105_829.addLast(class120_sub10);
												break while_40_;
											}
										}
									}
								}
								jagexInterface.anInt2028 = VarBit.anInt165;
							}
							if (jagexInterface.anObjectArray1929 != null && Class33.anInt278 > jagexInterface.anInt2037) {
								if (jagexInterface.inventoryListenerTriggers == null || Class33.anInt278 - jagexInterface.anInt2037 > 32) {
									final InterfaceListener class120_sub10 = new InterfaceListener();
									class120_sub10.aClass189_2534 = jagexInterface;
									class120_sub10.objectData = jagexInterface.anObjectArray1929;
									Class88.aClass105_829.addLast(class120_sub10);
								} else {
									while_41_: for (int i_76_ = jagexInterface.anInt2037; i_76_ < Class33.anInt278; i_76_++) {
										final int i_77_ = Class120_Sub12_Sub21_Sub1.anIntArray3912[i_76_ & 0x1f];
										for (int i_78_ = 0; i_78_ < jagexInterface.inventoryListenerTriggers.length; i_78_++) {
											if (jagexInterface.inventoryListenerTriggers[i_78_] == i_77_) {
												final InterfaceListener class120_sub10 = new InterfaceListener();
												class120_sub10.aClass189_2534 = jagexInterface;
												class120_sub10.objectData = jagexInterface.anObjectArray1929;
												Class88.aClass105_829.addLast(class120_sub10);
												break while_41_;
											}
										}
									}
								}
								jagexInterface.anInt2037 = Class33.anInt278;
							}
							if (jagexInterface.skillUpdateListener != null && Class120_Sub21.skillTriggersPos > jagexInterface.lastSkillTriggersPos) {
								if (jagexInterface.skillListernerTriggers == null || Class120_Sub21.skillTriggersPos - jagexInterface.lastSkillTriggersPos > 32) {
									final InterfaceListener class120_sub10 = new InterfaceListener();
									class120_sub10.aClass189_2534 = jagexInterface;
									class120_sub10.objectData = jagexInterface.skillUpdateListener;
									Class88.aClass105_829.addLast(class120_sub10);
								} else {
									while_42_: for (int i_79_ = jagexInterface.lastSkillTriggersPos; i_79_ < Class120_Sub21.skillTriggersPos; i_79_++) {
										final int i_80_ = Class120_Sub12_Sub18.skillTriggers[i_79_ & 0x1f];
										for (int i_81_ = 0; i_81_ < jagexInterface.skillListernerTriggers.length; i_81_++) {
											if (jagexInterface.skillListernerTriggers[i_81_] == i_80_) {
												final InterfaceListener class120_sub10 = new InterfaceListener();
												class120_sub10.aClass189_2534 = jagexInterface;
												class120_sub10.objectData = jagexInterface.skillUpdateListener;
												Class88.aClass105_829.addLast(class120_sub10);
												break while_42_;
											}
										}
									}
								}
								jagexInterface.lastSkillTriggersPos = Class120_Sub21.skillTriggersPos;
							}
							if (Class166.anInt1612 > jagexInterface.anInt2049 && jagexInterface.anObjectArray1944 != null) {
								final InterfaceListener class120_sub10 = new InterfaceListener();
								class120_sub10.aClass189_2534 = jagexInterface;
								class120_sub10.objectData = jagexInterface.anObjectArray1944;
								Class88.aClass105_829.addLast(class120_sub10);
							}
							if (Class61.anInt563 > jagexInterface.anInt2049 && jagexInterface.privateChatUpdateListener != null) {
								final InterfaceListener class120_sub10 = new InterfaceListener();
								class120_sub10.aClass189_2534 = jagexInterface;
								class120_sub10.objectData = jagexInterface.privateChatUpdateListener;
								Class88.aClass105_829.addLast(class120_sub10);
							}
							if (Class120_Sub12_Sub12.anInt3217 > jagexInterface.anInt2049 && jagexInterface.anObjectArray2036 != null) {
								final InterfaceListener class120_sub10 = new InterfaceListener();
								class120_sub10.aClass189_2534 = jagexInterface;
								class120_sub10.objectData = jagexInterface.anObjectArray2036;
								Class88.aClass105_829.addLast(class120_sub10);
							}
							if (Class120_Sub29.anInt2768 > jagexInterface.anInt2049 && jagexInterface.anObjectArray1984 != null) {
								final InterfaceListener class120_sub10 = new InterfaceListener();
								class120_sub10.aClass189_2534 = jagexInterface;
								class120_sub10.objectData = jagexInterface.anObjectArray1984;
								Class88.aClass105_829.addLast(class120_sub10);
							}
							if (Class120_Sub2.anInt2419 > jagexInterface.anInt2049 && jagexInterface.anObjectArray2086 != null) {
								final InterfaceListener class120_sub10 = new InterfaceListener();
								class120_sub10.aClass189_2534 = jagexInterface;
								class120_sub10.objectData = jagexInterface.anObjectArray2086;
								Class88.aClass105_829.addLast(class120_sub10);
							}
							jagexInterface.anInt2049 = GrandExchangeObject.anInt1494;
							if (jagexInterface.keyPressedListener != null) {
								for (int i_82_ = 0; i_82_ < ObjType.anInt1551; i_82_++) {
									final InterfaceListener class120_sub10 = new InterfaceListener();
									class120_sub10.aClass189_2534 = jagexInterface;
									class120_sub10.anInt2533 = Class134.anIntArray1285[i_82_];
									class120_sub10.anInt2535 = Class120_Sub19.anIntArray2658[i_82_];
									class120_sub10.objectData = jagexInterface.keyPressedListener;
									Class88.aClass105_829.addLast(class120_sub10);
								}
							}
							if (Class24.aBoolean139 && jagexInterface.anObjectArray1942 != null) {
								final InterfaceListener class120_sub10 = new InterfaceListener();
								class120_sub10.aClass189_2534 = jagexInterface;
								class120_sub10.objectData = jagexInterface.anObjectArray1942;
								Class88.aClass105_829.addLast(class120_sub10);
							}
						}
					}
					if (!jagexInterface.newFormat && Class120_Sub12_Sub4.aClass189_3156 == null && Projectile.aClass189_2954 == null && !Class15.menuOpen) {
						if ((jagexInterface.mouseOverId >= 0 || jagexInterface.disabledMouseOverColor != 0) && Queue.lastMouseX >= i_50_ && Class191.lastMouseY >= i_51_ && Queue.lastMouseX < i_52_ && Class191.lastMouseY < i_53_) {
							if (jagexInterface.mouseOverId >= 0) {
								CursorType.aClass189_1243 = childs[jagexInterface.mouseOverId];
							} else {
								CursorType.aClass189_1243 = jagexInterface;
							}
						}
						if (jagexInterface.type == 8 && Queue.lastMouseX >= i_50_ && Class191.lastMouseY >= i_51_ && Queue.lastMouseX < i_52_ && Class191.lastMouseY < i_53_) {
							Class49.aClass189_441 = jagexInterface;
						}
						if (jagexInterface.maxScrollVertical > jagexInterface.height) {
							Varp.handleScrollbar(jagexInterface, Class191.lastMouseY, i_48_ + jagexInterface.width, Queue.lastMouseX, jagexInterface.maxScrollVertical, i_49_, jagexInterface.height);
						}
					}
					if (jagexInterface.type == 0) {
						method60(childs, jagexInterface.bitPacked, i_50_, i_51_, i_52_, i_53_, i_48_ - jagexInterface.verticalScrollPosition, i_49_ - jagexInterface.horizontalScrollPosition);
						if (jagexInterface.components != null) {
							method60(jagexInterface.components, jagexInterface.bitPacked, i_50_, i_51_, i_52_, i_53_, i_48_ - jagexInterface.verticalScrollPosition, i_49_ - jagexInterface.horizontalScrollPosition);
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
