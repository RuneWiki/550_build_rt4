/* client - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Insets;
import java.io.IOException;
import java.net.Socket;
import java.util.GregorianCalendar;

public final class client extends GameShell {
	static int anInt2199;
	static int cameraType;
	static byte flagCounter;
	static boolean shutdown = false;
	static int clickedComponentY = 0;
	static int[] anIntArray1152 = { 0, 4, 4, 8, 0, 0, 8, 0, 0 };
	static int anInt1153 = 0;
	static int anInt1154;
	static int[] anIntArray1396 = { 0, -1, 0, 1 };
	static float aFloat1395;
	static Huffman huffman;
	static int anInt322 = 7759444;
	static Class28[] aClass28Array323;
	static byte[] worldListData;
	static long allocateGcTime = 0L;
	static boolean allVisibleLevels = true;
	static short aShort565 = (short) 320;
	static int anInt563 = 0;
	static int[] anIntArray562;
	static int clickedInventoryComponentX = 0;
	static Font loadingFont;
	static int packetType = 0;
	static int anInt137 = 0;
	static int[] underWaterLocationsMapFileIds;
	static int[] torchesFlamesPalette;
	static String[] chatMessageNames = new String[100];
	static int[] mapFunctionLocIds = new int[1000];
	static js5 spritesJs5;

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
					final byte prop = npc.npcType.loginScreenProperties;
					if ((prop & 0x2) > 0 && npc.walkQueuePos == 0 && Math.random() * 1000.0 < 10.0) {
						final int offX = (int) Math.round(-1.0 + 2.0 * Math.random());
						final int offZ = (int) Math.round(-1.0 + 2.0 * Math.random());
						if (offX != 0 || offZ != 0) {
							npc.walkQueueType[0] = (byte) 1;
							npc.walkQueueX[0] = (npc.x >> 7) + offX;
							npc.walkQueueZ[0] = (npc.z >> 7) + offZ;
							WallLocation.collisionMaps[Class173.gameLevel].method214(npc.x >> 7, npc.z >> 7, npc.getSize(), npc.getSize(), 0, false, false);
							if (npc.walkQueueX[0] >= 0 && npc.walkQueueX[0] <= 104 - npc.getSize() && npc.walkQueueZ[0] >= 0 && npc.walkQueueZ[0] <= 104 - npc.getSize() && WallLocation.collisionMaps[Class173.gameLevel].method221(npc.walkQueueZ[0], npc.z >> 7, npc.walkQueueX[0], npc.x >> 7)) {
								if (npc.getSize() > 1) {
									for (int i_5_ = npc.walkQueueX[0]; i_5_ < npc.walkQueueX[0] + npc.getSize(); i_5_++) {
										for (int i_6_ = npc.walkQueueZ[0]; npc.walkQueueZ[0] + npc.getSize() > i_6_; i_6_++) {
											if ((WallLocation.collisionMaps[Class173.gameLevel].collisionFlags[i_5_][i_6_] & 0x2401ff) != 0) {
												continue while_37_;
											}
										}
									}
								}
								npc.walkQueuePos = 1;
							}
						}
					}
					Class120_Sub12_Sub32.method1371(npc);
					ProducingGraphicsBuffer.method1850(npc);
					GroundDecoration.animateEntity(npc);
					WallLocation.collisionMaps[Class173.gameLevel].method213(npc.x >> 7, npc.z >> 7, npc.getSize(), npc.getSize(), false, false);
				}
			}
		}
		if (HDToolkit.glEnabled || Buffer.gameId != 0) {
			if (Class86.loginStep == 0 && Class154.accountCreationStep == 0) {
				if (cameraType == 2) {
					Class120_Sub12_Sub16.updateLockedCamera();
				} else {
					InvType.updateLoginScreenCamera();
				}
				if (FileSystemWorker.renderX >> 7 < 14 || FileSystemWorker.renderX >> 7 >= 90 || GroundObjectNode.renderZ >> 7 < 14 || GroundObjectNode.renderZ >> 7 >= 90) {
					UnderlayType.setupLoadingScreenRegion();
				}
			}
		} else {
			FileSystem.anInt459++;
		}
		for (;;) {
			final InterfaceListener interfaceListener = (InterfaceListener) Class120_Sub4.topPriorityInterfaceScripts.removeFront();
			if (interfaceListener == null) {
				break;
			}
			final JagexInterface jagexInterface = interfaceListener.jagexInterface;
			if (jagexInterface.componentIndex >= 0) {
				final JagexInterface parentInterface = Class74.getJagexInterface(jagexInterface.parent);
				if (parentInterface == null || parentInterface.components == null || jagexInterface.componentIndex >= parentInterface.components.length || parentInterface.components[jagexInterface.componentIndex] != jagexInterface) {
					continue;
				}
			}
			Class88.executeScript(interfaceListener);
		}
		for (;;) {
			final InterfaceListener interfaceListener = (InterfaceListener) FileSystem.mediumPriorityInterfaceScripts.removeFront();
			if (interfaceListener == null) {
				break;
			}
			final JagexInterface jagexInterface = interfaceListener.jagexInterface;
			if (jagexInterface.componentIndex >= 0) {
				final JagexInterface parentInterface = Class74.getJagexInterface(jagexInterface.parent);
				if (parentInterface == null || parentInterface.components == null || jagexInterface.componentIndex >= parentInterface.components.length || parentInterface.components[jagexInterface.componentIndex] != jagexInterface) {
					continue;
				}
			}
			Class88.executeScript(interfaceListener);
		}
		for (;;) {
			final InterfaceListener interfaceListener = (InterfaceListener) Class88.lowPriorityInterfaceScripts.removeFront();
			if (interfaceListener == null) {
				break;
			}
			final JagexInterface jagexInterface = interfaceListener.jagexInterface;
			if (jagexInterface.componentIndex >= 0) {
				final JagexInterface parentInterface = Class74.getJagexInterface(jagexInterface.parent);
				if (parentInterface == null || parentInterface.components == null || parentInterface.components.length <= jagexInterface.componentIndex || parentInterface.components[jagexInterface.componentIndex] != jagexInterface) {
					continue;
				}
			}
			Class88.executeScript(interfaceListener);
		}
		if (Class120_Sub12_Sub4.draggedComponent != null) {
			JavaObject.updateDraggedComponent();
		}
		if (Class3.openUrlRequest != null && Class3.openUrlRequest.status == 1) {
			if (Class3.openUrlRequest.value != null) {
				Class188.openUrl(WorldInfo.openUrl, Class99.openUrlNewTab);
			}
			Class3.openUrlRequest = null;
			Class99.openUrlNewTab = false;
			WorldInfo.openUrl = null;
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
				if (time - client.allocateGcTime > 1000L) {
					System.gc();
					client.allocateGcTime = time;
				}
				OverridedJInterface.loadingBarPercent = 5;
				Class134.loadingText = StringLibrary.aString853;
			} else {
				OverridedJInterface.loadingBarPercent = 5;
				Class134.loadingText = PlayerAppearance.aString1368;
				Class140.loadingStage = 10;
			}
		} else if (Class140.loadingStage == 10) {
			for (int level = 0; level < 4; level++) {
				WallLocation.collisionMaps[level] = new CollisionMap(104, 104);
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
				Class134.loadingText = StringLibrary.aString2105;
			} else {
				AmbientSound.animsJs5 = Huffman.method1884(0, true, false, true);
				Class79_Sub1.animsBasesJs5 = Huffman.method1884(1, true, false, true);
				Js5Worker.configJs5 = Huffman.method1884(2, false, true, true);
				Class33.interfaceJs5 = Huffman.method1884(3, true, false, true);
				Class159.aClass50_1490 = Huffman.method1884(4, true, false, true);
				Class65.mapsJs5 = Huffman.method1884(5, true, true, true);
				Class120_Sub12_Sub36.musicJs5 = Huffman.method1884(6, true, true, false);
				Class120_Sub12_Sub17.modelsJs5 = Huffman.method1884(7, true, false, true);
				client.spritesJs5 = Huffman.method1884(8, true, false, true);
				NodeCache.texturesJs5 = Huffman.method1884(9, true, false, true);
				ParticleNodeSub.binaryJs5 = Huffman.method1884(10, true, false, true);
				InterfaceListener.aClass50_2544 = Huffman.method1884(11, true, false, true);
				IsaacCipher.scriptsJs5 = Huffman.method1884(12, true, false, true);
				ClanMember.fontMetricsJs5 = Huffman.method1884(13, true, false, true);
				Class132.vorbisJs5 = Huffman.method1884(14, true, false, false);
				Class120_Sub22.aClass50_2679 = Huffman.method1884(15, true, false, true);
				Class114.locationsJs5 = Huffman.method1884(16, true, false, true);
				ModelParticleMagnet.enumsJs5 = Huffman.method1884(17, true, false, true);
				Class120_Sub12_Sub29.aClass50_3367 = Huffman.method1884(18, true, false, true);
				Class127.aClass50_1213 = Huffman.method1884(19, true, false, true);
				Class2.aClass50_50 = Huffman.method1884(20, true, false, true);
				Class120_Sub2.aClass50_2415 = Huffman.method1884(21, true, false, true);
				WaterfallShader.aClass50_2169 = Huffman.method1884(22, true, false, true);
				Class120_Sub12_Sub24.aClass50_3309 = Huffman.method1884(23, true, true, true);
				SphereType.aClass50_1433 = Huffman.method1884(24, true, false, true);
				AbstractMouseWheelHandler.aClass50_115 = Huffman.method1884(25, true, false, true);
				Class120_Sub12_Sub15.aClass50_3242 = Huffman.method1884(26, true, true, true);
				Class187.aClass50_1907 = Huffman.method1884(27, true, false, true);
				Npc.aClass50_3753 = Huffman.method1884(28, true, true, true);
				OverridedJInterface.loadingBarPercent = 15;
				Class134.loadingText = StringLibrary.connectedToUpdateServer;
				Class140.loadingStage = 40;
			}
		} else if (Class140.loadingStage == 40) {
			int i_12_ = 0;
			for (int i_13_ = 0; i_13_ < 29; i_13_++) {
				i_12_ += Class120_Sub12_Sub26.aClass53_Sub1Array3337[i_13_].getCompletion() * EntityRenderData.anIntArray199[i_13_] / 100;
			}
			if (i_12_ != 100) {
				OverridedJInterface.loadingBarPercent = 20;
				if (i_12_ != 0) {
					Class134.loadingText = StringLibrary.aString3338 + i_12_ + "%";
				}
			} else {
				Class134.loadingText = StringLibrary.aString2594;
				OverridedJInterface.loadingBarPercent = 20;
				ParticleNode.getSpriteIds(client.spritesJs5);
				Class132_Sub2.getTitleSpriteIds(client.spritesJs5);
				Class112.getRunesSpriteId(client.spritesJs5);
				Class140.loadingStage = 41;
			}
		} else if (Class140.loadingStage == 41) {
			if (!Npc.aClass50_3753.method430()) {
				Class134.loadingText = StringLibrary.aString2554 + Npc.aClass50_3753.method415() + "%";
				OverridedJInterface.loadingBarPercent = 25;
			} else {
				decodeDefaults(Npc.aClass50_3753.getFileSmart(1));
				Class140.loadingStage = 45;
				Class134.loadingText = StringLibrary.aString3137;
				OverridedJInterface.loadingBarPercent = 25;
			}
		} else if (Class140.loadingStage == 45) {
			FileSystemRequest.method1546(2, 22050, Class167.aBoolean1619);
			Class69_Sub1.aClass120_Sub30_Sub2_2230 = new Class120_Sub30_Sub2();
			Class69_Sub1.aClass120_Sub30_Sub2_2230.method1774(128, 9);
			Class120_Sub12_Sub3.aClass164_3150 = Class120_Sub12_Sub18.method1289(Node.canvas, 22050, NpcType.gameSignlink, 0);
			Class120_Sub12_Sub3.aClass164_3150.method2143(Class69_Sub1.aClass120_Sub30_Sub2_2230);
			Class120_Sub12_Sub39.method1400(Class69_Sub1.aClass120_Sub30_Sub2_2230, Class120_Sub22.aClass50_2679, Class132.vorbisJs5, false, Class159.aClass50_1490);
			Class120_Sub12_Sub29.aClass164_3366 = Class120_Sub12_Sub18.method1289(Node.canvas, 2048, NpcType.gameSignlink, 1);
			Class120_Sub12_Sub22.aClass120_Sub30_Sub3_3299 = new Class120_Sub30_Sub3();
			Class120_Sub12_Sub29.aClass164_3366.method2143(Class120_Sub12_Sub22.aClass120_Sub30_Sub3_3299);
			ObjectPile.aClass172_1809 = new Decimator(22050, Class178.anInt1771);
			AbstractSprite.anInt3620 = Class120_Sub12_Sub36.musicJs5.getGroupId("scape main");
			Class134.loadingText = StringLibrary.aString1025;
			Class140.loadingStage = 50;
			OverridedJInterface.loadingBarPercent = 30;
		} else if (Class140.loadingStage == 50) {
			final int i_14_ = Class143_Sub1.fontCachedCount(ClanMember.fontMetricsJs5, client.spritesJs5);
			final int i_15_ = LookupTable.method488();
			if (i_14_ < i_15_) {
				OverridedJInterface.loadingBarPercent = 35;
				Class134.loadingText = StringLibrary.aString2660 + (100 * i_14_ / i_15_) + "%";
			} else {
				Class134.loadingText = StringLibrary.aString1155;
				Class140.loadingStage = 60;
				OverridedJInterface.loadingBarPercent = 35;
			}
		} else if (Class140.loadingStage == 60) {
			final int i_16_ = JavaObject.titleSpriteCachedCount(client.spritesJs5);
			final int i_17_ = 2;
			if (i_17_ > i_16_) {
				OverridedJInterface.loadingBarPercent = 40;
				Class134.loadingText = StringLibrary.aString217 + (i_16_ * 100 / i_17_) + "%";
			} else {
				Class140.loadingStage = 65;
				OverridedJInterface.loadingBarPercent = 40;
				Class134.loadingText = StringLibrary.aString1239;
			}
		} else if (Class140.loadingStage == 65) {
			Class8.constructFonts(client.spritesJs5, ClanMember.fontMetricsJs5);
			Class134.loadingText = StringLibrary.aString2552;
			OverridedJInterface.loadingBarPercent = 45;
			ProjectileNode.setGameState(5);
			Class140.loadingStage = 70;
		} else if (Class140.loadingStage == 70) {
			Js5Worker.configJs5.method430();
			int count = 11;
			int i_18_ = 0;
			i_18_ += Js5Worker.configJs5.method415();
			Class114.locationsJs5.method430();
			i_18_ += Class114.locationsJs5.method415();
			ModelParticleMagnet.enumsJs5.method430();
			i_18_ += ModelParticleMagnet.enumsJs5.method415();
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
			SphereType.aClass50_1433.method430();
			i_18_ += SphereType.aClass50_1433.method415();
			AbstractMouseWheelHandler.aClass50_115.method430();
			i_18_ += AbstractMouseWheelHandler.aClass50_115.method415();
			Class187.aClass50_1907.method430();
			i_18_ += Class187.aClass50_1907.method415();
			if (i_18_ < count * 100) {
				OverridedJInterface.loadingBarPercent = 50;
				Class134.loadingText = StringLibrary.loadingConfig + (i_18_ / count) + "%";
			} else {
				ParamType.configClient = Js5Worker.configJs5;
				OverlayType.setup(Js5Worker.configJs5);
				UnderlayType.configClient = Js5Worker.configJs5;
				Identikit.init(Class120_Sub12_Sub17.modelsJs5, Js5Worker.configJs5);
				LocType.setup(Class114.locationsJs5, true, Class120_Sub12_Sub17.modelsJs5);
				NpcType.setupNpcTypeVariables(Class120_Sub12_Sub17.modelsJs5, Class120_Sub12_Sub29.aClass50_3367, true);
				Player.method2340(Class127.aClass50_1213, Class33.smallFont2, true, Class120_Sub12_Sub17.modelsJs5);
				StructType.configClient = Js5Worker.configJs5;
				ChunkAtmosphere.method2509(Class2.aClass50_50, Class79_Sub1.animsBasesJs5, AmbientSound.animsJs5);
				EntityRenderData.setup(Js5Worker.configJs5);
				SpotAnimType.setup(Class120_Sub2.aClass50_2415, Class120_Sub12_Sub17.modelsJs5);
				VarBit.setup(WaterfallShader.aClass50_2169);
				Varp.setup(Js5Worker.configJs5);
				JagexInterface.setup(client.spritesJs5, ClanMember.fontMetricsJs5, Class33.interfaceJs5, Class120_Sub12_Sub17.modelsJs5);
				InvType.setup(Js5Worker.configJs5);
				EnumType.setup(ModelParticleMagnet.enumsJs5);
				QuickChatMessageType.setup(AbstractMouseWheelHandler.aClass50_115, new Class125(), SphereType.aClass50_1433);
				QuickChatCategoryType.setup(SphereType.aClass50_1433, AbstractMouseWheelHandler.aClass50_115);
				SkyboxType.setup(Js5Worker.configJs5);
				SphereType.setup(Js5Worker.configJs5);
				LightType.setup(Js5Worker.configJs5);
				CursorType.setup(Js5Worker.configJs5, client.spritesJs5);
				MapSceneType.setup(client.spritesJs5, Js5Worker.configJs5);
				Class31.aClass50_241 = Js5Worker.configJs5;
				Class88.aClass50_834 = client.spritesJs5;
				OverridedJInterface.loadingBarPercent = 50;
				Class134.loadingText = StringLibrary.aString2585;
				MapFunctionNode.calculateEquipmentLookupTable();
				Class140.loadingStage = 80;
			}
		} else if (Class140.loadingStage == 80) {
			final int i_19_ = Class120_Sub12_Sub4.method1216(client.spritesJs5);
			final int i_20_ = 14;
			if (i_19_ < i_20_) {
				Class134.loadingText = StringLibrary.aString3665 + (100 * i_19_ / i_20_) + "%";
				OverridedJInterface.loadingBarPercent = 60;
			} else {
				GameShell.constructSprites(client.spritesJs5);
				Class134.loadingText = StringLibrary.aString2726;
				OverridedJInterface.loadingBarPercent = 60;
				Class140.loadingStage = 90;
			}
		} else if (Class140.loadingStage == 90) {
			if (!Class120_Sub12_Sub15.aClass50_3242.method430()) {
				Class134.loadingText = StringLibrary.aString3371 + Class120_Sub12_Sub15.aClass50_3242.method415() + "%";
				OverridedJInterface.loadingBarPercent = 70;
			} else {
				final Class143_Sub1 class143_sub1 = new Class143_Sub1(NodeCache.texturesJs5, Class120_Sub12_Sub15.aClass50_3242, client.spritesJs5, 20, !ParticleNodeSub.highDetailTextures);
				Rasterizer.method864(class143_sub1);
				if (FileSystemRequest.brightness == 1) {
					Rasterizer.setBrightness(0.9F);
				}
				if (FileSystemRequest.brightness == 2) {
					Rasterizer.setBrightness(0.8F);
				}
				if (FileSystemRequest.brightness == 3) {
					Rasterizer.setBrightness(0.7F);
				}
				if (FileSystemRequest.brightness == 4) {
					Rasterizer.setBrightness(0.6F);
				}
				OverridedJInterface.loadingBarPercent = 70;
				Class134.loadingText = JagexInterface.aString1358;
				Class140.loadingStage = 100;
			}
		} else if (Class140.loadingStage == 100) {
			if (WaterfallShader.runeSpritesCached(client.spritesJs5)) {
				Class140.loadingStage = 110;
			}
		} else if (Class140.loadingStage == 110) {
			Class110.mouseRecorder = new MouseRecorder();
			NpcType.gameSignlink.startThread(Class110.mouseRecorder, 10);
			OverridedJInterface.loadingBarPercent = 75;
			Class134.loadingText = StringLibrary.aString1038;
			Class140.loadingStage = 120;
		} else if (Class140.loadingStage == 120) {
			if (!ParticleNodeSub.binaryJs5.method410("huffman", "")) {
				Class134.loadingText = StringLibrary.aString398 + "0%";
				OverridedJInterface.loadingBarPercent = 80;
			} else {
				final Huffman huffman = new Huffman(ParticleNodeSub.binaryJs5.method428("", "huffman"));
				GZIPDecompressor.setHuffman(huffman);
				Class134.loadingText = StringLibrary.aString2847;
				OverridedJInterface.loadingBarPercent = 80;
				Class140.loadingStage = 130;
			}
		} else if (Class140.loadingStage == 130) {
			if (!Class33.interfaceJs5.method430()) {
				Class134.loadingText = StringLibrary.aString2788 + (Class33.interfaceJs5.method415() * 3 / 4) + "%";
				OverridedJInterface.loadingBarPercent = 85;
			} else if (!IsaacCipher.scriptsJs5.method430()) {
				Class134.loadingText = StringLibrary.aString2788 + (IsaacCipher.scriptsJs5.method415() / 10 + 75) + "%";
				OverridedJInterface.loadingBarPercent = 85;
			} else if (!ClanMember.fontMetricsJs5.method430()) {
				Class134.loadingText = StringLibrary.aString2788 + (ClanMember.fontMetricsJs5.method415() / 20 + 85) + "%";
				OverridedJInterface.loadingBarPercent = 85;
			} else if (!Class120_Sub12_Sub24.aClass50_3309.allFilesComplete("details")) {
				Class134.loadingText = StringLibrary.aString2788 + (Class120_Sub12_Sub24.aClass50_3309.getCompletion("details") / 10 + 90) + "%";
				OverridedJInterface.loadingBarPercent = 85;
			} else {
				WorldMapHandler.method675(Class120_Sub12_Sub24.aClass50_3309);
				ParticleEngine.method945(Class187.aClass50_1907);
				Sphere.method334(Class120_Sub12_Sub17.modelsJs5);
				Class140.loadingStage = 135;
				OverridedJInterface.loadingBarPercent = 95;
				Class134.loadingText = StringLibrary.aString799;
			}
		} else if (Class140.loadingStage == 135) {
			final int i_21_ = Class96.method788();
			if (i_21_ == -1) {
				Class134.loadingText = StringLibrary.aString1098;
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
				Class134.loadingText = StringLibrary.aString2444;
			}
		} else if (Class140.loadingStage == 140) {
			GameShell.loginscreenId = Class33.interfaceJs5.getGroupId("loginscreen");
			Class65.mapsJs5.method426(false, true);
			Class120_Sub12_Sub36.musicJs5.method426(true, true);
			client.spritesJs5.method426(true, true);
			ClanMember.fontMetricsJs5.method426(true, true);
			ParticleNodeSub.binaryJs5.method426(true, true);
			Class33.interfaceJs5.method426(true, true);
			SeekableFile.aBoolean2138 = true;
			Class140.loadingStage = 150;
			Class134.loadingText = StringLibrary.aString400;
			OverridedJInterface.loadingBarPercent = 97;
		} else if (Class140.loadingStage == 150) {
			Class78.method674();
			if (InterfaceClickMask.safeModeEnabled) {
				Class120_Sub12_Sub19.currentDisplayMode = 0;
				AbstractMouseWheelHandler.antiAliasingSamplesWrapper = 0;
				GroundDecoration.antiAliasingSamples = 0;
				Class140.anInt1343 = 0;
			}
			InterfaceClickMask.safeModeEnabled = true;
			Class120_Sub6.savePreferences(NpcType.gameSignlink);
			AbstractSprite.changeDisplayMode(Class120_Sub12_Sub19.currentDisplayMode, -1, -1, false);
			OverridedJInterface.loadingBarPercent = 100;
			Class134.loadingText = StringLibrary.aString2837;
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
		if (QuickChatMessageType.fullscreenFrame != null) {
			Class150.revertFrame(NpcType.gameSignlink, QuickChatMessageType.fullscreenFrame);
			QuickChatMessageType.fullscreenFrame = null;
		}
		if (Class110.mouseRecorder != null) {
			Class110.mouseRecorder.running = false;
		}
		Class110.mouseRecorder = null;
		if (AbstractTimer.worldConnection != null) {
			AbstractTimer.worldConnection.close();
			AbstractTimer.worldConnection = null;
		}
		Normal.removeKeyboard(Node.canvas);
		NodeCache.removeMouse(Node.canvas);
		if (Class120_Sub12_Sub31.mouseWheelHandler != null) {
			Class120_Sub12_Sub31.mouseWheelHandler.removeListener(Node.canvas);
		}
		Normal.removeKeyboardHandler();
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
		final InterfaceClickMask interfaceClickMask = (InterfaceClickMask) JavaObject.clickMaskCache.get(((long) jagexInterface.bitPacked << 32) + jagexInterface.componentIndex);
		return interfaceClickMask != null ? interfaceClickMask : jagexInterface.clickMask;
	}

	@Override
	final void mainInit() {
		InterfaceListener.updateCanvasPosition();
		Class38.fileSystemWorker = new FileSystemWorker();
		Class178.js5Worker = new Js5Worker();
		if (LocType.modeWhat != 0) {
			Class120_Sub12_Sub25.aByteArrayArray3318 = new byte[50][];
		}
		FrameGroup.loadPreferencesFile(NpcType.gameSignlink);
		if (AbstractIndexedSprite.modeWhere == 0) {
			Class120_Sub12_Sub30.worldListIpAddress = getCodeBase().getHost();
			Hashtable.anInt675 = 43594;
			ObjectPile.anInt1808 = 43594;// 443;
		} else if (AbstractIndexedSprite.modeWhere == 1) {
			Class120_Sub12_Sub30.worldListIpAddress = getCodeBase().getHost();
			ObjectPile.anInt1808 = Class136.defaultWorldId + 50000;
			Hashtable.anInt675 = Class136.defaultWorldId + 40000;
		} else if (AbstractIndexedSprite.modeWhere == 2) {
			Class120_Sub12_Sub30.worldListIpAddress = "127.0.0.1";
			ObjectPile.anInt1808 = 43594; //Class136.defaultWorldId + 50000;
			Hashtable.anInt675 = 43594; //Class136.defaultWorldId + 40000;
		}
		Class120_Sub14_Sub22.aShortArray3639 = Class127.aShortArray1214 = Class69_Sub3_Sub1.aShortArray3085 = NodeSub.aShortArray2584 = new short[256];
		if (Signlink.clientType == 3 && AbstractIndexedSprite.modeWhere != 2) {
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
			SpotAnimationNode.shiftClickEnabled = true;
		}
		Class71.anInt625 = Hashtable.anInt675;
		GameEntity.anInt3045 = ObjectPile.anInt1808;
		Class120_Sub12_Sub30.worldIpAddress = Class120_Sub12_Sub30.worldListIpAddress;
		Class116.worldListPort = Hashtable.anInt675;
		ModelParticleEmitter.worldPort = Class116.worldListPort;
		Class120_Sub12_Sub8.synchronizeKeyCodes();
		Class82.addKeyboard(Node.canvas);
		NodeCache.addMouse(Node.canvas);
		Class120_Sub12_Sub31.mouseWheelHandler = Class120_Sub12_Sub2.constructMouseWheelHandler();
		if (Class120_Sub12_Sub31.mouseWheelHandler != null) {
			Class120_Sub12_Sub31.mouseWheelHandler.addListener(Node.canvas);
		}
		Class120_Sub12_Sub20.anInt3284 = Signlink.clientType;
		try {
			if (NpcType.gameSignlink.cacheDatFile != null) {
				MapFunctionType.aClass193_663 = new SeekableFile(NpcType.gameSignlink.cacheDatFile, 5200, 0);
				for (int id = 0; id < 29; id++) {
					ClanMember.aClass193Array2581[id] = new SeekableFile(NpcType.gameSignlink.cacheIndexFiles[id], 6000, 0);
				}
				Class86.aClass193_822 = new SeekableFile(NpcType.gameSignlink.masterIndexFile, 6000, 0);
				Class120_Sub12_Sub5.masterIndexFileSystem = new FileSystem(255, MapFunctionType.aClass193_663, Class86.aClass193_822, 500000);
				Class10.randomFile = new SeekableFile(NpcType.gameSignlink.randomFile, 24, 0);
				NpcType.gameSignlink.masterIndexFile = null;
				NpcType.gameSignlink.cacheIndexFiles = null;
				NpcType.gameSignlink.cacheDatFile = null;
				NpcType.gameSignlink.randomFile = null;
			}
		} catch (final IOException ioexception) {
			Class10.randomFile = null;
			Class86.aClass193_822 = null;
			Class120_Sub12_Sub5.masterIndexFileSystem = null;
			MapFunctionType.aClass193_663 = null;
		}
		if (AbstractIndexedSprite.modeWhere != 0) {
			HintIcon.showFps = true;
		}
		if (Buffer.gameId == 0) {
			Class120_Sub14_Sub15.gameLoadingText = StringLibrary.runescapeIsLoadingPleaseWait;
		} else if (Buffer.gameId == 1) {
			Class120_Sub14_Sub15.gameLoadingText = StringLibrary.mechscapeIsLoadingPleaseWait;
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

	private final void processJs5() {
		final boolean connected = Class178.js5Worker.process();
		if (!connected) {
			js5Connect();
		}
	}

	private final void js5Connect() {
		if (Class178.js5Worker.errorCount > Class116.anInt1113) {
			Buffer.anInt2473 = (-50 + 50 * Class178.js5Worker.errorCount) * 5;
			if (Buffer.anInt2473 > 3000) {
				Buffer.anInt2473 = 3000;
			}
			if (ModelParticleEmitter.worldPort != Class71.anInt625) {
				ModelParticleEmitter.worldPort = Class71.anInt625;
			} else {
				ModelParticleEmitter.worldPort = GameEntity.anInt3045;
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
					GroundTile.js5ConnectionNode = NpcType.gameSignlink.openConnection(Class120_Sub12_Sub30.worldIpAddress, ModelParticleEmitter.worldPort);
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
			Class120_Sub12_Sub25.params = getParameter("settings");
			if (Class120_Sub12_Sub25.params == null) {
				Class120_Sub12_Sub25.params = "";
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
			Class179.clientInstance = this;
			startApplet(550, LocType.modeWhat + 32, 503, 765);
		}
	}

	public static final void main(final String[] strings) {
		try {
			if (strings.length != 4) {
				Class43.method345("argument count");
			}
			Class136.defaultWorldId = Integer.parseInt(strings[0]);
			AbstractIndexedSprite.modeWhere = 2;
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
			Class120_Sub12_Sub25.params = "";
			FileSystem.haveInternetExplorer6 = false;
			Node.countryId = 0;
			Class120_Sub12_Sub33.affiliateId = 0;
			final client var_client = new client();
			Class179.clientInstance = var_client;
			var_client.startApplication(Buffer.gameId != 1 ? "runescape" : "mechscape", 32 + LocType.modeWhat, 550, 29, 768, 503);
			Class112.frame.setLocation(40, 40);
		} catch (final Exception exception) {
			SpotAnimation.method2312(exception, null);
		}
	}
	  
	static final boolean isHidden(final JagexInterface jagexInterface) {
		if (Class120_Sub30_Sub1.qaOpTestEnabled) {
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
			final long l = EntityRenderData.method255() / 1000000L - WaterfallShader.aLong2173;
			WaterfallShader.aLong2173 = EntityRenderData.method255() / 1000000L;
			final boolean bool = Class120_Sub12_Sub5.method1220();
			if (bool && Class120_Sub12_Sub15.aBoolean3247 && Class120_Sub12_Sub3.aClass164_3150 != null) {
				Class120_Sub12_Sub3.aClass164_3150.method2144();
			}
			if ((Class109.gameState == 30 || Class109.gameState == 10) && (LongNode.canvasReplaceRecommended || Class15.frameSizeRevertTime != 0L && Class15.frameSizeRevertTime < TimeUtil.getSafeTime())) {
				AbstractSprite.changeDisplayMode(Class120_Sub12_Sub4.getDisplayMode(), Class120_Sub12_Sub18.lastFullscreenWidth, Class120_Sub12_Sub12.lastFullscreenHeight, LongNode.canvasReplaceRecommended);
			}
			if (QuickChatMessageType.fullscreenFrame == null) {
				Container container;
				/*if (Class120_Sub14_Sub10.fullscreenFrame != null) {//Not needed since we already checking if fullscreen is null.
					container = Class120_Sub14_Sub10.fullscreenFrame;
				} else */
				if (Class112.frame != null) {
					container = Class112.frame;
				} else {
					container = NpcType.gameSignlink.gameApplet;
				}
				int frameWidth = container.getSize().width;
				int frameHeight = container.getSize().height;
				if (container == Class112.frame) {
					final Insets insets = Class112.frame.getInsets();
					frameWidth -= insets.left + insets.right;
					frameHeight -= insets.bottom + insets.top;
				}
				if (Class120_Sub12_Sub7.frameWidth != frameWidth || PlayerAppearance.frameHeight != frameHeight) {
					if (Signlink.osName.startsWith("mac")) {
						Class120_Sub12_Sub7.frameWidth = frameWidth;
						PlayerAppearance.frameHeight = frameHeight;
					} else {
						InterfaceListener.updateCanvasPosition();
					}
					Class15.frameSizeRevertTime = TimeUtil.getSafeTime() + 500L;
				}
			}
			if (QuickChatMessageType.fullscreenFrame != null && !DummyInputStream.focus && (Class109.gameState == 30 || Class109.gameState == 10)) {
				AbstractSprite.changeDisplayMode(Class120_Sub12_Sub19.currentDisplayMode, -1, -1, false);
			}
			boolean needFullRedraw = false;
			if (Class120_Sub12_Sub26.fullRedraw) {
				Class120_Sub12_Sub26.fullRedraw = false;
				needFullRedraw = true;
			}
			if (needFullRedraw) {
				Class120_Sub12_Sub22.redrawMargins();
			}
			if (HDToolkit.glEnabled) {
				for (int id = 0; id < 100; id++) {
					MasterIndexInfo.needInterfaceRedrawWrapper[id] = true;
				}
			}
			if (Class109.gameState != 0) {
				if (Class109.gameState == 5) {
					UnderlayType.drawTitleScreen(Class120_Sub12_Sub22.boldFont, false);
				} else if (Class109.gameState != 10) {
					if (Class109.gameState != 25 && Class109.gameState != 28) {
						if (Class109.gameState != 30) {
							if (Class109.gameState == 40) {
								Class120_Sub12_Sub21_Sub1.drawTextOnScreen(StringLibrary.aString1116 + "<br>" + StringLibrary.aString142, false);
							}
						} else {
							Decimator.method2219(l);
						}
					} else if (Class120_Sub12_Sub28.loadingScreenState == 1) {
						if (SkyboxType.anInt1379 < AbstractBuffer.mapFilesMissingCount) {
							SkyboxType.anInt1379 = AbstractBuffer.mapFilesMissingCount;
						}
						final int loadingPercent = (SkyboxType.anInt1379 - AbstractBuffer.mapFilesMissingCount) * 50 / SkyboxType.anInt1379;
						Class120_Sub12_Sub21_Sub1.drawTextOnScreen(StringLibrary.loadingPleaseWait + "<br>(" + loadingPercent + "%)", false);
					} else if (Class120_Sub12_Sub28.loadingScreenState == 2) {
						if (Class120_Sub12_Sub37.anInt3431 < LightType.locationModelMissingCount) {
							Class120_Sub12_Sub37.anInt3431 = LightType.locationModelMissingCount;
						}
						final int loadingPercent = 50 * (Class120_Sub12_Sub37.anInt3431 - LightType.locationModelMissingCount) / Class120_Sub12_Sub37.anInt3431 + 50;
						Class120_Sub12_Sub21_Sub1.drawTextOnScreen(StringLibrary.loadingPleaseWait + "<br>(" + loadingPercent + "%)", false);
					} else {
						Class120_Sub12_Sub21_Sub1.drawTextOnScreen(StringLibrary.loadingPleaseWait, false);
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
							for (int id = 0; id < LabelGroup.screenRedrawPos; id++) {
								Class120_Sub12_Sub33.needScreenRedraw[id] = false;
							}
						} catch (final Exception exception) {
							Node.canvas.repaint();
						}
					}
				} else {
					try {
						final Graphics graphics = Node.canvas.getGraphics();
						for (int id = 0; id < LabelGroup.screenRedrawPos; id++) {
							if (Class120_Sub12_Sub33.needScreenRedraw[id]) {
								ClanMember.fullscreenGraphics.drawClippedImage(graphics, GrandExchangeObject.screenRedrawXs[id], Class120_Sub12_Sub38.screenRedrawYs[id], Class120_Sub16.screenRedrawWidhts[id], Class69_Sub3_Sub1.screenRedrawHeights[id]);
								Class120_Sub12_Sub33.needScreenRedraw[id] = false;
							}
						}
					} catch (final Exception exception) {
						Node.canvas.repaint();
					}
				}
			} else {
				HDToolkit.swapBuffers();
				for (int id = 0; id < LabelGroup.screenRedrawPos; id++) {
					Class120_Sub12_Sub33.needScreenRedraw[id] = false;
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
				MasterIndexInfo.gregorianDateSeed = gregoriancalendar.get(11) * 600 + gregoriancalendar.get(12) * 10 + gregoriancalendar.get(13) / 6;
				Class136.aRandom1319.setSeed(MasterIndexInfo.gregorianDateSeed);
			}
			processJs5();
			if (EnumType.aClass112_3460 != null) {// js5
				EnumType.aClass112_3460.method985();
			}
			MapSceneType.method2005();
			Class120_Sub2.method1050();
			PlainTile.handleKeyboard();
			Normal.handleMouse();
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
				Class69_Sub3_Sub1.handleAccountCreation();
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

	static final void method108(final int i) {
		final InterfaceChangeNode class120_sub14_sub7 = InterfaceChangeNode.putInterfaceChange(12, i);
		class120_sub14_sub7.method1453();
	}

	static final String decodeText(final Buffer buffer) {
		return Class120_Sub14_Sub15.decodeText(buffer, 32767);
	}
											
	static final void drawSpriteOnMinimap(final JagexInterface jagexInterface, final int interfaceX, final int interfaceY, final int iconX, final int iconY, final AbstractSprite abstractSprite) {
		if (abstractSprite != null) {
			final int dist = Math.max(jagexInterface.width / 2, jagexInterface.height / 2) + 10;
			final int maxDist = iconY * iconY + iconX * iconX;
			if (maxDist <= dist * dist) {
				final int rot = (int) DummyOutputStream.cameraYaw & 0x7ff;
				final int rotSin = Rasterizer.sinTable[rot];
				final int rotCos = Rasterizer.cosTable[rot];
				final int posX = iconX * rotCos + iconY * rotSin >> 16;
				final int posY = iconY * rotCos - iconX * rotSin >> 16;
				if (!HDToolkit.glEnabled) {
					((LDSprite) abstractSprite).method1610(interfaceX + posX + jagexInterface.width / 2 - abstractSprite.trimWidth / 2, interfaceY + jagexInterface.height / 2 - abstractSprite.trimHeight / 2 - posY, jagexInterface.startOfSpriteLookupTable, jagexInterface.lengthOfSpriteLookupTable);
				} else {
					((HDSprite) abstractSprite).method1598(interfaceX + posX + jagexInterface.width / 2 - abstractSprite.trimWidth / 2, interfaceY + jagexInterface.height / 2 - abstractSprite.trimHeight / 2 - posY, (HDSprite) jagexInterface.constructSpriteFromId(false));
				}
			}
		}
	}

	static final GroundDecoration getGroundDecoration(final int x, final int z, final int level) {
		final GroundTile groundTile = LabelGroup.activeGroundTiles[level][x][z];
		if (groundTile == null || groundTile.groundDecoration == null) {
			return null;
		}
		return groundTile.groundDecoration;
	}

	static final void updateInterfaceSize(final JagexInterface jagexInterface, final int width, final int height, final boolean activateResizeListener) {
		final int oldHeight = jagexInterface.height;
		if (jagexInterface.dynamicHeightValue == 0) {
			jagexInterface.height = jagexInterface.originalHeight;
		} else if (jagexInterface.dynamicHeightValue == 1) {
			jagexInterface.height = height - jagexInterface.originalHeight;
		} else if (jagexInterface.dynamicHeightValue == 2) {
			jagexInterface.height = height * jagexInterface.originalHeight >> 14;
		} else if (jagexInterface.dynamicHeightValue == 3) {					
			if (jagexInterface.type == 2) {	
				jagexInterface.height = (jagexInterface.originalHeight - 1) * jagexInterface.objSpritePadY + jagexInterface.originalHeight * 32;
			} else if (jagexInterface.type == 7) {
				jagexInterface.height = (jagexInterface.originalHeight - 1) * jagexInterface.objSpritePadY + jagexInterface.originalHeight * 12;
			}
		}
		final int oldWidth = jagexInterface.width;
		if (jagexInterface.dynamicWidthValue == 0) {
			jagexInterface.width = jagexInterface.originalWidth;
		} else if (jagexInterface.dynamicWidthValue == 1) {
			jagexInterface.width = width - jagexInterface.originalWidth;
		} else if (jagexInterface.dynamicWidthValue == 2) {
			jagexInterface.width = width * jagexInterface.originalWidth >> 14;
		} else if (jagexInterface.dynamicWidthValue == 3) {
			if (jagexInterface.type == 2) {
				jagexInterface.width = (jagexInterface.originalWidth - 1) * jagexInterface.objSpritePadX + jagexInterface.originalWidth * 32;
			} else if (jagexInterface.type == 7) {
				jagexInterface.width = (jagexInterface.originalWidth - 1) * jagexInterface.objSpritePadX + jagexInterface.originalWidth * 115;
			}
		}
		if (jagexInterface.dynamicWidthValue == 4) {
			jagexInterface.width = jagexInterface.anInt1982 * jagexInterface.height / jagexInterface.anInt2085;
		}
		if (jagexInterface.dynamicHeightValue == 4) {
			jagexInterface.height = jagexInterface.anInt2085 * jagexInterface.width / jagexInterface.anInt1982;
		}
		if (Class120_Sub30_Sub1.qaOpTestEnabled && (getClickMask(jagexInterface).optionMask != 0 || jagexInterface.type == 0)) {
			if (jagexInterface.height >= 5 || jagexInterface.width >= 5) {
				if (jagexInterface.height <= 0) {
					jagexInterface.height = 5;
				}
				if (jagexInterface.width <= 0) {
					jagexInterface.width = 5;
				}
			} else {
				jagexInterface.height = 5;
				jagexInterface.width = 5;
			}
		}
		if (jagexInterface.clientCode == 1337) {
			DummyInputStream.gameScreenInterface = jagexInterface;
		}
		if (activateResizeListener && jagexInterface.onResizeListener != null && (oldWidth != jagexInterface.width || oldHeight != jagexInterface.height)) {
			final InterfaceListener interfaceListener = new InterfaceListener();
			interfaceListener.objectData = jagexInterface.onResizeListener;
			interfaceListener.jagexInterface = jagexInterface;
			Class88.lowPriorityInterfaceScripts.addLast(interfaceListener);
		}
	}

	static final String getMenuOptionText(final int option) {
		if (Class120_Sub12_Sub29.menuOptionSuffix[option].length() <= 0) {
			return Class120_Sub12_Sub33.menuOptionPrefix[option];
		}
		return Class120_Sub12_Sub33.menuOptionPrefix[option] + StringLibrary.useSeperator + Class120_Sub12_Sub29.menuOptionSuffix[option];
	}

	static final void method60(final JagexInterface[] childs, final int parent, final int i_41_, final int i_42_, final int i_43_, final int i_44_, final int xOff, final int yOff) {
		for (int childId = 0; childId < childs.length; childId++) {
			final JagexInterface jagexInterface = childs[childId];
			if (jagexInterface != null && jagexInterface.parent == parent && (!jagexInterface.newFormat || jagexInterface.type == 0 || jagexInterface.hasListener || getClickMask(jagexInterface).optionMask != 0 || jagexInterface == Normal.aClass189_161 || jagexInterface.clientCode == 1338) && (!jagexInterface.newFormat || !isHidden(jagexInterface))) {
				final int posX = jagexInterface.x + xOff;
				final int posY = jagexInterface.y + yOff;
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
					int i_54_ = posX + jagexInterface.width;
					int i_55_ = posY + jagexInterface.height;
					if (jagexInterface.type == 9) {
						i_54_++;
						i_55_++;
					}
					i_50_ = posX > i_41_ ? posX : i_41_;
					i_51_ = posY > i_42_ ? posY : i_42_;
					i_52_ = i_54_ < i_43_ ? i_54_ : i_43_;
					i_53_ = i_55_ < i_44_ ? i_55_ : i_44_;
				}
				if (jagexInterface == Class120_Sub12_Sub4.draggedComponent) {
					WorldInfo.draggingComponent = true;
					Class120_Sub12_Sub17.draggedComponentPosX = posX;
					Class9.draggedComponentPosY = posY;
				}
				if (!jagexInterface.newFormat || i_50_ < i_52_ && i_51_ < i_53_) {
					if (jagexInterface.type == 0) {
						if (!jagexInterface.newFormat && isHidden(jagexInterface) && CursorType.mouseOverInterface != jagexInterface) {
							continue;
						}
						if (jagexInterface.aBoolean1960 && Queue.lastMouseX >= i_50_ && ChunkAtmosphere.lastMouseY >= i_51_ && Queue.lastMouseX < i_52_ && ChunkAtmosphere.lastMouseY < i_53_) {
							for (InterfaceListener interfaceListener = (InterfaceListener) Class88.lowPriorityInterfaceScripts.getFront(); interfaceListener != null; interfaceListener = (InterfaceListener) Class88.lowPriorityInterfaceScripts.getNext()) {
								if (interfaceListener.mouseUsed) {
									interfaceListener.unlink();
									interfaceListener.jagexInterface.mouseOver = false;
								}
							}
							if (SceneGroundObject.componentPressedCycles == 0) {
								Class120_Sub12_Sub4.draggedComponent = null;
								Normal.aClass189_161 = null;
							}
							EnumType.anInt3450 = 0;
							EmitterType.mouseInsideWorldMap = false;
						}
					}
					if (jagexInterface.newFormat) {
						boolean mouseOver;
						if (Queue.lastMouseX >= i_50_ && ChunkAtmosphere.lastMouseY >= i_51_ && Queue.lastMouseX < i_52_ && ChunkAtmosphere.lastMouseY < i_53_) {
							mouseOver = true;
						} else {
							mouseOver = false;
						}
						boolean dragging = false;
						if (InterfaceChangeNode.lastMousePress == 1 && mouseOver) {
							dragging = true;
						}
						boolean clicked = false;
						if (Class156.lastMouseClick == 1 && js5.lastClickX >= i_50_ && Class120_Sub12_Sub36.lastClickY >= i_51_ && js5.lastClickX < i_52_ && Class120_Sub12_Sub36.lastClickY < i_53_) {
							clicked = true;
						}
						if (jagexInterface.keyCodes != null) {
							for (int keyId = 0; keyId < jagexInterface.keyCodes.length; keyId++) {
								if (!NodeCache.heldKeys[jagexInterface.keyCodes[keyId]]) {
									if (jagexInterface.lastPressedKeyCycles != null) {
										jagexInterface.lastPressedKeyCycles[keyId] = 0;
									}
								} else if (jagexInterface.lastPressedKeyCycles == null || Class101_Sub2.loopCycle >= jagexInterface.lastPressedKeyCycles[keyId]) {
									final byte mask = jagexInterface.keyHeldMask[keyId];
									if (mask == 0 || ((mask & 0x8) == 0 || !NodeCache.heldKeys[86] && !NodeCache.heldKeys[82] && !NodeCache.heldKeys[81]) && ((mask & 0x2) == 0 || NodeCache.heldKeys[86]) && ((mask & 0x1) == 0 || NodeCache.heldKeys[82]) && ((mask & 0x4) == 0 || NodeCache.heldKeys[81])) {
										Class120_Sub14_Sub22.method1629(jagexInterface.bitPacked, -1, keyId + 1, "");
										final int i_60_ = jagexInterface.keyPressDelay[keyId];
										if (jagexInterface.lastPressedKeyCycles == null) {
											jagexInterface.lastPressedKeyCycles = new int[jagexInterface.keyCodes.length];
										}
										if (i_60_ != 0) {
											jagexInterface.lastPressedKeyCycles[keyId] = Class101_Sub2.loopCycle + i_60_;
										} else {
											jagexInterface.lastPressedKeyCycles[keyId] = 2147483647;
										}
									}
								}
							}
						}
						if (clicked) {
							Class120_Sub12_Sub8.dragComponent(jagexInterface, js5.lastClickX - posX, Class120_Sub12_Sub36.lastClickY - posY);
						}
						if (Class120_Sub12_Sub4.draggedComponent != null && Class120_Sub12_Sub4.draggedComponent != jagexInterface && mouseOver && getClickMask(jagexInterface).method1677()) {
							LocType.draggedOnComponent = jagexInterface;
						}
						if (jagexInterface == Normal.aClass189_161) {
							Class111.aBoolean1058 = true;
							Class120_Sub12_Sub7.anInt3183 = posX;
							Class120_Sub12_Sub35.anInt3413 = posY;
						}
						if (jagexInterface.hasListener || jagexInterface.clientCode != 0) {
							if (mouseOver && AbstractBuffer.mouseWheelRotation != 0 && jagexInterface.onMouseWheelListener != null) {
								final InterfaceListener interfaceListener = new InterfaceListener();
								interfaceListener.mouseUsed = true;
								interfaceListener.jagexInterface = jagexInterface;
								interfaceListener.data2 = AbstractBuffer.mouseWheelRotation;
								interfaceListener.objectData = jagexInterface.onMouseWheelListener;
								Class88.lowPriorityInterfaceScripts.addLast(interfaceListener);
							}
							if (Class120_Sub12_Sub4.draggedComponent != null || Projectile.clickedInventoryComponent != null || Class15.menuOpen || jagexInterface.clientCode != 1400 && EnumType.anInt3450 > 0) {
								clicked = false;
								dragging = false;
								mouseOver = false;
							}
							if (jagexInterface.clientCode != 0) {
								if (jagexInterface.clientCode == 1337) {
									DummyInputStream.gameScreenInterface = jagexInterface;
									continue;
								}
								if (jagexInterface.clientCode == 1338) {
									if (clicked) {
										FileSystem.minimapClickX = js5.lastClickX - posX;
										Class53_Sub1.minimapClickY = Class120_Sub12_Sub36.lastClickY - posY;
									}
									continue;
								}
								if (jagexInterface.clientCode == 1400) {
									MapSceneType.worldMapInterface = jagexInterface;
									if (mouseOver) {
										EmitterType.mouseInsideWorldMap = true;
									}
									if (clicked) {
										final int i_61_ = (int) ((js5.lastClickX - posX - jagexInterface.width / 2) * 2.0 / WorldMapHandler.currentZoom);
										final int i_62_ = (int) ((Class120_Sub12_Sub36.lastClickY - posY - jagexInterface.height / 2) * 2.0 / WorldMapHandler.currentZoom);
										final int i_63_ = ParticleEmitter.anInt2336 + i_61_;
										final int i_64_ = ModelParticleMagnet.anInt1646 + i_62_;
										final int i_65_ = i_63_ + WorldMapHandler.anInt695;
										final int i_66_ = WorldMapHandler.mapSizeY - 1 - i_64_ + WorldMapHandler.anInt694;
										final Class120_Sub14_Sub22 class120_sub14_sub22 = ParticleEmitter.method938();
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
											AbstractGraphicsBuffer.clickedComponentX = Queue.lastMouseX;
											clickedComponentY = ChunkAtmosphere.lastMouseY;
										}
									} else if (dragging && EnumType.anInt3450 > 0) {
										if (EnumType.anInt3450 == 1 && (AbstractGraphicsBuffer.clickedComponentX != Queue.lastMouseX || clickedComponentY != ChunkAtmosphere.lastMouseY)) {
											Class120_Sub2.anInt2421 = ParticleEmitter.anInt2336;
											EnumType.anInt3456 = ModelParticleMagnet.anInt1646;
											EnumType.anInt3450 = 2;
										}
										if (EnumType.anInt3450 == 2) {
											Class30.aBoolean226 = true;
											VarBit.method236(Class120_Sub2.anInt2421 + (int) ((AbstractGraphicsBuffer.clickedComponentX - Queue.lastMouseX) * 2.0 / WorldMapHandler.wantedZoom));
											Class179.method2260(EnumType.anInt3456 + (int) ((clickedComponentY - ChunkAtmosphere.lastMouseY) * 2.0 / WorldMapHandler.wantedZoom));
										}
									} else {
										if (EnumType.anInt3450 > 0 && !Class30.aBoolean226) {
											if ((Class69.mouseButtons == 1 || SpotAnimationNode.method1438(WallDecoration.menuOptionCount - 1)) && WallDecoration.menuOptionCount > 2) {
												Class120_Sub12_Sub28.openMenu();
											} else if (WallDecoration.menuOptionCount > 0) {
												ChunkAtmosphere.method2508();
											}
										}
										EnumType.anInt3450 = 0;
									}
									continue;
								}
								if (jagexInterface.clientCode == 1401) {
									if (dragging) {
										Npc.method2348(ChunkAtmosphere.lastMouseY - posY, jagexInterface.width, jagexInterface.height, Queue.lastMouseX - posX);
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
							if (!jagexInterface.clicked && clicked) {
								jagexInterface.clicked = true;
								if (jagexInterface.onClickListener != null) {
									final InterfaceListener interfaceListener = new InterfaceListener();
									interfaceListener.mouseUsed = true;
									interfaceListener.jagexInterface = jagexInterface;
									interfaceListener.data1 = js5.lastClickX - posX;
									interfaceListener.data2 = Class120_Sub12_Sub36.lastClickY - posY;
									interfaceListener.objectData = jagexInterface.onClickListener;
									Class88.lowPriorityInterfaceScripts.addLast(interfaceListener);
								}
							}
							if (jagexInterface.clicked && dragging && jagexInterface.onHeldListener != null) {
								final InterfaceListener interfaceListener = new InterfaceListener();
								interfaceListener.mouseUsed = true;
								interfaceListener.jagexInterface = jagexInterface;
								interfaceListener.data1 = Queue.lastMouseX - posX;
								interfaceListener.data2 = ChunkAtmosphere.lastMouseY - posY;
								interfaceListener.objectData = jagexInterface.onHeldListener;
								Class88.lowPriorityInterfaceScripts.addLast(interfaceListener);
							}
							if (jagexInterface.clicked && !dragging) {
								jagexInterface.clicked = false;
								if (jagexInterface.onReleaseListener != null) {
									final InterfaceListener interfaceListener = new InterfaceListener();
									interfaceListener.mouseUsed = true;
									interfaceListener.jagexInterface = jagexInterface;
									interfaceListener.data1 = Queue.lastMouseX - posX;
									interfaceListener.data2 = ChunkAtmosphere.lastMouseY - posY;
									interfaceListener.objectData = jagexInterface.onReleaseListener;
									FileSystem.mediumPriorityInterfaceScripts.addLast(interfaceListener);
								}
							}
							if (dragging && jagexInterface.onMouseDragListener != null) {
								final InterfaceListener interfaceListener = new InterfaceListener();
								interfaceListener.mouseUsed = true;
								interfaceListener.jagexInterface = jagexInterface;
								interfaceListener.data1 = Queue.lastMouseX - posX;
								interfaceListener.data2 = ChunkAtmosphere.lastMouseY - posY;
								interfaceListener.objectData = jagexInterface.onMouseDragListener;
								Class88.lowPriorityInterfaceScripts.addLast(interfaceListener);
							}
							if (!jagexInterface.mouseOver && mouseOver) {
								jagexInterface.mouseOver = true;
								if (jagexInterface.onMouseOverListener != null) {
									final InterfaceListener interfaceListener = new InterfaceListener();
									interfaceListener.mouseUsed = true;
									interfaceListener.jagexInterface = jagexInterface;
									interfaceListener.data1 = Queue.lastMouseX - posX;
									interfaceListener.data2 = ChunkAtmosphere.lastMouseY - posY;
									interfaceListener.objectData = jagexInterface.onMouseOverListener;
									Class88.lowPriorityInterfaceScripts.addLast(interfaceListener);
								}
							}
							if (jagexInterface.mouseOver && mouseOver && jagexInterface.onMouseFocusedListener != null) {
								final InterfaceListener interfaceListener = new InterfaceListener();
								interfaceListener.mouseUsed = true;
								interfaceListener.jagexInterface = jagexInterface;
								interfaceListener.data1 = Queue.lastMouseX - posX;
								interfaceListener.data2 = ChunkAtmosphere.lastMouseY - posY;
								interfaceListener.objectData = jagexInterface.onMouseFocusedListener;
								Class88.lowPriorityInterfaceScripts.addLast(interfaceListener);
							}
							if (jagexInterface.mouseOver && !mouseOver) {
								jagexInterface.mouseOver = false;
								if (jagexInterface.onMouseLeaveListener != null) {
									final InterfaceListener interfaceListener = new InterfaceListener();
									interfaceListener.mouseUsed = true;
									interfaceListener.jagexInterface = jagexInterface;
									interfaceListener.data1 = Queue.lastMouseX - posX;
									interfaceListener.data2 = ChunkAtmosphere.lastMouseY - posY;
									interfaceListener.objectData = jagexInterface.onMouseLeaveListener;
									FileSystem.mediumPriorityInterfaceScripts.addLast(interfaceListener);
								}
							}
							if (jagexInterface.onLoopCycleListener != null) {
								final InterfaceListener interfaceListener = new InterfaceListener();
								interfaceListener.jagexInterface = jagexInterface;
								interfaceListener.objectData = jagexInterface.onLoopCycleListener;
								Class120_Sub4.topPriorityInterfaceScripts.addLast(interfaceListener);
							}
							if (jagexInterface.integerScriptValuesListener != null && Class120_Sub12_Sub23.anInt3308 > jagexInterface.anInt2033) {
								if (jagexInterface.integerScriptValuesTriggers == null || Class120_Sub12_Sub23.anInt3308 - jagexInterface.anInt2033 > 32) {
									final InterfaceListener interfaceListener = new InterfaceListener();
									interfaceListener.jagexInterface = jagexInterface;
									interfaceListener.objectData = jagexInterface.integerScriptValuesListener;
									Class88.lowPriorityInterfaceScripts.addLast(interfaceListener);
								} else {
									while_38_: for (int i_67_ = jagexInterface.anInt2033; i_67_ < Class120_Sub12_Sub23.anInt3308; i_67_++) {
										final int i_68_ = Class101_Sub4.anIntArray2296[i_67_ & 0x1f];
										for (int i_69_ = 0; i_69_ < jagexInterface.integerScriptValuesTriggers.length; i_69_++) {
											if (jagexInterface.integerScriptValuesTriggers[i_69_] == i_68_) {
												final InterfaceListener interfaceListener = new InterfaceListener();
												interfaceListener.jagexInterface = jagexInterface;
												interfaceListener.objectData = jagexInterface.integerScriptValuesListener;
												Class88.lowPriorityInterfaceScripts.addLast(interfaceListener);
												break while_38_;
											}
										}
									}
								}
								jagexInterface.anInt2033 = Class120_Sub12_Sub23.anInt3308;
							}
							if (jagexInterface.stringScriptValuesListener != null && Class112.anInt1077 > jagexInterface.anInt2064) {
								if (jagexInterface.stringScriptValuesTriggers == null || Class112.anInt1077 - jagexInterface.anInt2064 > 32) {
									final InterfaceListener interfaceListener = new InterfaceListener();
									interfaceListener.jagexInterface = jagexInterface;
									interfaceListener.objectData = jagexInterface.stringScriptValuesListener;
									Class88.lowPriorityInterfaceScripts.addLast(interfaceListener);
								} else {
									while_39_: for (int i_70_ = jagexInterface.anInt2064; i_70_ < Class112.anInt1077; i_70_++) {
										final int i_71_ = Class101_Sub4.anIntArray2304[i_70_ & 0x1f];
										for (int i_72_ = 0; i_72_ < jagexInterface.stringScriptValuesTriggers.length; i_72_++) {
											if (jagexInterface.stringScriptValuesTriggers[i_72_] == i_71_) {
												final InterfaceListener interfaceListener = new InterfaceListener();
												interfaceListener.jagexInterface = jagexInterface;
												interfaceListener.objectData = jagexInterface.stringScriptValuesListener;
												Class88.lowPriorityInterfaceScripts.addLast(interfaceListener);
												break while_39_;
											}
										}
									}
								}
								jagexInterface.anInt2064 = Class112.anInt1077;
							}
							if (jagexInterface.onVarpUpdateListener != null && VarBit.anInt165 > jagexInterface.anInt2028) {
								if (jagexInterface.varpListenerTriggers == null || VarBit.anInt165 - jagexInterface.anInt2028 > 32) {
									final InterfaceListener interfaceListener = new InterfaceListener();
									interfaceListener.jagexInterface = jagexInterface;
									interfaceListener.objectData = jagexInterface.onVarpUpdateListener;
									Class88.lowPriorityInterfaceScripts.addLast(interfaceListener);
								} else {
									while_40_: for (int i_73_ = jagexInterface.anInt2028; i_73_ < VarBit.anInt165; i_73_++) {
										final int i_74_ = Class88.anIntArray833[i_73_ & 0x1f];
										for (int i_75_ = 0; i_75_ < jagexInterface.varpListenerTriggers.length; i_75_++) {
											if (jagexInterface.varpListenerTriggers[i_75_] == i_74_) {
												final InterfaceListener interfaceListener = new InterfaceListener();
												interfaceListener.jagexInterface = jagexInterface;
												interfaceListener.objectData = jagexInterface.onVarpUpdateListener;
												Class88.lowPriorityInterfaceScripts.addLast(interfaceListener);
												break while_40_;
											}
										}
									}
								}
								jagexInterface.anInt2028 = VarBit.anInt165;
							}
							if (jagexInterface.onInventoryUpdateListener != null && Class33.anInt278 > jagexInterface.anInt2037) {
								if (jagexInterface.inventoryListenerTriggers == null || Class33.anInt278 - jagexInterface.anInt2037 > 32) {
									final InterfaceListener interfaceListener = new InterfaceListener();
									interfaceListener.jagexInterface = jagexInterface;
									interfaceListener.objectData = jagexInterface.onInventoryUpdateListener;
									Class88.lowPriorityInterfaceScripts.addLast(interfaceListener);
								} else {
									while_41_: for (int i_76_ = jagexInterface.anInt2037; i_76_ < Class33.anInt278; i_76_++) {
										final int i_77_ = Class120_Sub12_Sub21_Sub1.anIntArray3912[i_76_ & 0x1f];
										for (int i_78_ = 0; i_78_ < jagexInterface.inventoryListenerTriggers.length; i_78_++) {
											if (jagexInterface.inventoryListenerTriggers[i_78_] == i_77_) {
												final InterfaceListener interfaceListener = new InterfaceListener();
												interfaceListener.jagexInterface = jagexInterface;
												interfaceListener.objectData = jagexInterface.onInventoryUpdateListener;
												Class88.lowPriorityInterfaceScripts.addLast(interfaceListener);
												break while_41_;
											}
										}
									}
								}
								jagexInterface.anInt2037 = Class33.anInt278;
							}
							if (jagexInterface.onSkillUpdateListener != null && Class120_Sub21.skillTriggersPos > jagexInterface.lastSkillTriggersPos) {
								if (jagexInterface.skillListernerTriggers == null || Class120_Sub21.skillTriggersPos - jagexInterface.lastSkillTriggersPos > 32) {
									final InterfaceListener interfaceListener = new InterfaceListener();
									interfaceListener.jagexInterface = jagexInterface;
									interfaceListener.objectData = jagexInterface.onSkillUpdateListener;
									Class88.lowPriorityInterfaceScripts.addLast(interfaceListener);
								} else {
									while_42_: for (int i_79_ = jagexInterface.lastSkillTriggersPos; i_79_ < Class120_Sub21.skillTriggersPos; i_79_++) {
										final int i_80_ = Class120_Sub12_Sub18.skillTriggers[i_79_ & 0x1f];
										for (int i_81_ = 0; i_81_ < jagexInterface.skillListernerTriggers.length; i_81_++) {
											if (jagexInterface.skillListernerTriggers[i_81_] == i_80_) {
												final InterfaceListener interfaceListener = new InterfaceListener();
												interfaceListener.jagexInterface = jagexInterface;
												interfaceListener.objectData = jagexInterface.onSkillUpdateListener;
												Class88.lowPriorityInterfaceScripts.addLast(interfaceListener);
												break while_42_;
											}
										}
									}
								}
								jagexInterface.lastSkillTriggersPos = Class120_Sub21.skillTriggersPos;
							}
							if (Class166.anInt1612 > jagexInterface.anInt2049 && jagexInterface.onGameMessageReceived != null) {
								final InterfaceListener interfaceListener = new InterfaceListener();
								interfaceListener.jagexInterface = jagexInterface;
								interfaceListener.objectData = jagexInterface.onGameMessageReceived;
								Class88.lowPriorityInterfaceScripts.addLast(interfaceListener);
							}
							if (client.anInt563 > jagexInterface.anInt2049 && jagexInterface.privateChatUpdateListener != null) {
								final InterfaceListener interfaceListener = new InterfaceListener();
								interfaceListener.jagexInterface = jagexInterface;
								interfaceListener.objectData = jagexInterface.privateChatUpdateListener;
								Class88.lowPriorityInterfaceScripts.addLast(interfaceListener);
							}
							if (Class120_Sub12_Sub12.anInt3217 > jagexInterface.anInt2049 && jagexInterface.onClanChatUpdateListener != null) {
								final InterfaceListener interfaceListener = new InterfaceListener();
								interfaceListener.jagexInterface = jagexInterface;
								interfaceListener.objectData = jagexInterface.onClanChatUpdateListener;
								Class88.lowPriorityInterfaceScripts.addLast(interfaceListener);
							}
							if (Class120_Sub29.anInt2768 > jagexInterface.anInt2049 && jagexInterface.onGrandExchangeUpdateListener != null) {
								final InterfaceListener interfaceListener = new InterfaceListener();
								interfaceListener.jagexInterface = jagexInterface;
								interfaceListener.objectData = jagexInterface.onGrandExchangeUpdateListener;
								Class88.lowPriorityInterfaceScripts.addLast(interfaceListener);
							}
							if (Class120_Sub2.anInt2419 > jagexInterface.anInt2049 && jagexInterface.miscInformationUpdateListener != null) {
								final InterfaceListener interfaceListener = new InterfaceListener();
								interfaceListener.jagexInterface = jagexInterface;
								interfaceListener.objectData = jagexInterface.miscInformationUpdateListener;
								Class88.lowPriorityInterfaceScripts.addLast(interfaceListener);
							}
							jagexInterface.anInt2049 = GrandExchangeObject.anInt1494;
							if (jagexInterface.keyPressedListener != null) {
								for (int i_82_ = 0; i_82_ < ObjType.anInt1551; i_82_++) {
									final InterfaceListener interfaceListener = new InterfaceListener();
									interfaceListener.jagexInterface = jagexInterface;
									interfaceListener.keyCode = Class134.anIntArray1285[i_82_];
									interfaceListener.keyChar = Class120_Sub19.anIntArray2658[i_82_];
									interfaceListener.objectData = jagexInterface.keyPressedListener;
									Class88.lowPriorityInterfaceScripts.addLast(interfaceListener);
								}
							}
							if (Class24.aBoolean139 && jagexInterface.anObjectArray1942 != null) {
								final InterfaceListener interfaceListener = new InterfaceListener();
								interfaceListener.jagexInterface = jagexInterface;
								interfaceListener.objectData = jagexInterface.anObjectArray1942;
								Class88.lowPriorityInterfaceScripts.addLast(interfaceListener);
							}
						}
					}
					if (!jagexInterface.newFormat && Class120_Sub12_Sub4.draggedComponent == null && Projectile.clickedInventoryComponent == null && !Class15.menuOpen) {
						if ((jagexInterface.mouseOverId >= 0 || jagexInterface.disabledMouseOverColor != 0) && Queue.lastMouseX >= i_50_ && ChunkAtmosphere.lastMouseY >= i_51_ && Queue.lastMouseX < i_52_ && ChunkAtmosphere.lastMouseY < i_53_) {
							if (jagexInterface.mouseOverId >= 0) {
								CursorType.mouseOverInterface = childs[jagexInterface.mouseOverId];
							} else {
								CursorType.mouseOverInterface = jagexInterface;
							}
						}
						if (jagexInterface.type == 8 && Queue.lastMouseX >= i_50_ && ChunkAtmosphere.lastMouseY >= i_51_ && Queue.lastMouseX < i_52_ && ChunkAtmosphere.lastMouseY < i_53_) {
							Class49.activeYellowBoxComponent = jagexInterface;
						}
						if (jagexInterface.maxScrollVertical > jagexInterface.height) {
							Varp.handleScrollbar(jagexInterface, posX + jagexInterface.width, posY, Queue.lastMouseX, ChunkAtmosphere.lastMouseY, jagexInterface.maxScrollVertical, jagexInterface.height);
						}
					}
					if (jagexInterface.type == 0) {
						method60(childs, jagexInterface.bitPacked, i_50_, i_51_, i_52_, i_53_, posX - jagexInterface.verticalScrollPosition, posY - jagexInterface.horizontalScrollPosition);
						if (jagexInterface.components != null) {
							method60(jagexInterface.components, jagexInterface.bitPacked, i_50_, i_51_, i_52_, i_53_, posX - jagexInterface.verticalScrollPosition, posY - jagexInterface.horizontalScrollPosition);
						}
						final OverridedJInterface overridedInterface = (OverridedJInterface) Class120_Sub12_Sub13.overridedInterfaces.get(jagexInterface.bitPacked);
						if (overridedInterface != null) {
							Class120_Sub6.method1074(overridedInterface.interfaceId, i_52_, posX, i_51_, posY, i_50_, i_53_);
						}
					}
				}
			}
		}
	}
}
