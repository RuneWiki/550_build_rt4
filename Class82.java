/* Class82 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;
import java.lang.reflect.Method;

final class Class82 implements Runnable {
	volatile boolean aBoolean780;
	Signlink aClass135_781;
	volatile Class164[] aClass164Array782 = new Class164[2];
	static Class88 aClass88_783 = new Class88();
	volatile boolean aBoolean784;
	static AbstractIndexedSprite[] aClass107Array785;
	static String aString787 = "Face here";

	static final void addKeyboard(final Component component) {
		final Method method = Signlink.traversalKeyMethod;
		if (method != null) {
			try {
				method.invoke(component, new Object[] { Boolean.FALSE });
			} catch (final Throwable throwable) {
				/* empty */
			}
		}
		component.addKeyListener(Class169.keyboardHandler);
		component.addFocusListener(Class169.keyboardHandler);
	}

	@Override
	public final void run() {
		do {
			try {
				this.aBoolean784 = true;
				try {
					try {
						while (!this.aBoolean780) {
							for (int i = 0; i < 2; i++) {
								final Class164 class164 = this.aClass164Array782[i];
								if (class164 != null) {
									class164.method2133();
								}
							}
							PacketBuffer.sleepWrapper(10L);
						}
					} catch (final Exception exception) {
						SpotAnimation.method2312(exception, null);
						this.aBoolean784 = false;
						break;
					}
					this.aBoolean784 = false;
				} catch (final RuntimeException runtimeexception) {
					this.aBoolean784 = false;
					throw runtimeexception;
				}
			} catch (final RuntimeException runtimeexception) {
				throw EnumType.method1428(runtimeexception, "im.run()");
			}
		} while (false);
	}

	static final World method710(final int i_0_) {
		if (!Class159.worldsLoaded || OverridedJInterface.worldOff > i_0_ || EnumType.worldLen < i_0_) {
			return null;
		}
		return Class48.worldList[i_0_ - OverridedJInterface.worldOff];
	}

	static final void drawWorldMapInterface(final int drawX, final int drawY, final int width, final int height) {
		if (Class90.laodingStage < 100) {
			Class81.loadWorldMap();
		}
		if (HDToolkit.glEnabled) {
			GraphicsHD.clipRect(drawX, drawY, drawX + width, height + drawY);
		} else {
			GraphicsLD.clipRect(drawX, drawY, drawX + width, height + drawY);
		}
		if (Class90.laodingStage < 100) {//Draw loading
			final int i_6_ = (width / 2) + drawX;
			final int i_7_ = (height / 2) + drawY - 38;
			if (HDToolkit.glEnabled) {
				GraphicsHD.fillRect(drawX, drawY, width, height, 0);
				GraphicsHD.drawRect(i_6_ - 152, i_7_, 304, 34, 9179409);
				GraphicsHD.fillRect(i_6_ - 150, i_7_ + 2, Class90.laodingStage * 3, 30, 9179409);
			} else {
				GraphicsLD.fillRect(drawX, drawY, width, height, 0);
				GraphicsLD.drawRect(i_6_ - 152, i_7_, 304, 34, 9179409);
				GraphicsLD.fillRect(i_6_ - 150, i_7_ + 2, Class90.laodingStage * 3, 30, 9179409);
			}
			Class120_Sub12_Sub22.boldFont.method1478(Class36.aString313, i_6_, i_7_ + 20, 16777215, -1);
		} else {
			Class173.worldMapPointerWidth = (int) (width * 2 / WorldMapHandler.currentZoom);
			GroundObjectNode.worldMapPointerHeight = (int) (height * 2 / WorldMapHandler.currentZoom);
			GroundTile.worldMapLookAtY = (int) (height / WorldMapHandler.currentZoom) - Class169.anInt1646;
			ParamType.worldMapLookAtX = ParticleManager.anInt2336 - (int) (width / WorldMapHandler.currentZoom);
			final int i_8_ = -(int) (width / WorldMapHandler.currentZoom) + ParticleManager.anInt2336;
			final int i_9_ = Class169.anInt1646 - (int) (height / WorldMapHandler.currentZoom);
			final int i_10_ = (int) (width / WorldMapHandler.currentZoom) + ParticleManager.anInt2336;
			final int i_11_ = (int) (height / WorldMapHandler.currentZoom) + Class169.anInt1646;
			if (!HDToolkit.glEnabled) {
				WorldMapHandler.method683(i_8_, i_9_, i_10_, i_11_, drawX, drawY, width + drawX, 1 + height + drawY);
				WorldMapHandler.method685();
				final Deque deque = WorldMapHandler.method679();//gather mapfunctions
				Class101_Sub1.method842(deque, 0, 0);//draw mapfunctions
			} else {
				if (Class101_Sub3.aClass120_Sub14_Sub19_Sub2_2290 == null || width != Class101_Sub3.aClass120_Sub14_Sub19_Sub2_2290.width || Class101_Sub3.aClass120_Sub14_Sub19_Sub2_2290.height != height) {
					Class101_Sub3.aClass120_Sub14_Sub19_Sub2_2290 = null;
					Class101_Sub3.aClass120_Sub14_Sub19_Sub2_2290 = new LDSprite(width, height);
				}
				GraphicsLD.init2dCanvas(Class101_Sub3.aClass120_Sub14_Sub19_Sub2_2290.pixels, width, height);
				WorldMapHandler.method683(i_8_, i_9_, i_10_, i_11_, 0, 0, width, 1 + height);
				WorldMapHandler.method685();
				final Deque deque = WorldMapHandler.method679();//gather mapfunctions
				Class101_Sub1.method842(deque, drawX, drawY);//draw mapfunctions
				Class101_Sub3.aClass120_Sub14_Sub19_Sub2_2290.method1608();//flip vertical
				GraphicsHD.method596(Class101_Sub3.aClass120_Sub14_Sub19_Sub2_2290.pixels, drawX, drawY, width, height);//drawPixels
				GraphicsLD.pixels = null;
			}
			if (Class96.clickedMouseFunctionBlinksLeft > 0) {
				Class136.clickedMouseFunctionCycle--;
				if (Class136.clickedMouseFunctionCycle == 0) {
					Class136.clickedMouseFunctionCycle = 20;
					Class96.clickedMouseFunctionBlinksLeft--;
				}
			}
			if (HintIcon.showFps) {
				final int informationX = width + drawX - 5;
				int informationY = drawY + height - 8;
				Class120_Sub12_Sub20.plainFont.method1482("Fps:" + MapFunctionType.fps, informationX, informationY, 16776960, -1);
				int memColor = 16776960;
				final Runtime runtime = Runtime.getRuntime();
				informationY -= 15;
				final int memory = (int) ((runtime.totalMemory() - runtime.freeMemory()) / 1024L);
				if (memory > 65536) {
					memColor = 16711680;
				}
				Class120_Sub12_Sub20.plainFont.method1482("Mem:" + memory + "k", informationX, informationY, memColor, -1);
				informationY -= 15;
			}
		}
	}

	static final void method712(final int i) {
		try {
			GZIPDecompressor.aClass120_Sub14_Sub9_798 = Class120_Sub12_Sub10.aClass120_Sub14_Sub9_3204 = Class3.aClass120_Sub14_Sub9_54 = RuntimeException_Sub1.aClass120_Sub14_Sub9_2145 = null;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("im.E(").append(i).append(')').toString());
		}
	}

	static final void method713(final int i, int i_16_, int i_17_, final int i_18_, final boolean bool) {
		try {
			if (bool) {
				aString787 = null;
			}
			if (Class32.anInt260 <= i && ParamType.anInt3544 >= i) {
				i_16_ = Class3.method83(Class120_Sub30_Sub2.anInt3699, i_16_, IdentityKit.anInt1334);
				i_17_ = Class3.method83(Class120_Sub30_Sub2.anInt3699, i_17_, IdentityKit.anInt1334);
				ParticleManager.method939(i, i_18_, i_17_, (byte) -30, i_16_);
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("im.C(").append(i).append(',').append(i_16_).append(',').append(i_17_).append(',').append(i_18_).append(',').append(bool).append(')').toString());
		}
	}

	public static void method714(final byte i) {
		try {
			MapFunctionType.spriteCache = null;
			aClass107Array785 = null;
			aString787 = null;
			aClass88_783 = null;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("im.F(").append(i).append(')').toString());
		}
	}

	static final void method715() {
		if (TileParticleQueue.selfPlayer != null && TileParticleQueue.selfPlayer.x - (64 * TileParticleQueue.selfPlayer.getSize() - 64) >> 7 == Class120_Sub12_Sub26.flagX && TileParticleQueue.selfPlayer.z - (TileParticleQueue.selfPlayer.getSize() * 64) + 64 >> 7 == Class65.flagY) {
			SceneGroundObject.packetSetFlagPosition = false;
			Class120_Sub12_Sub26.flagX = 0;
		}
		for (int x = 0; x < 104; x++) {
			for (int z = 0; z < 104; z++) {
				FileSystemRequest.anIntArrayArray3933[x][z] = 0;
			}
		}
		for (int id = 0; id < FileSystemWorker.localPlayerCount; id++) {
			final Player player = Class118.playersList[Class112.playerIndices[id]];
			if (player != null) {
				player.hasMenuAction = false;
			}
		}
		for (int id = 0; id < Class148.localNpcCount; id++) {
			final Npc npc = Class120_Sub12_Sub11.npcList[Class120_Sub12_Sub36.localNpcIndices[id]];
			if (npc != null) {
				npc.hasMenuAction = false;
			}
		}
	}

	Class82() {
		this.aBoolean780 = false;
		this.aBoolean784 = false;
	}
}
