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
	static final void addKeyboard(final Component component) {
		final Method method = Signlink.traversalKeyMethod;
		if (method != null) {
			try {
				method.invoke(component, new Object[] { Boolean.FALSE });
			} catch (final Throwable throwable) {
				/* empty */
			}
		}
		component.addKeyListener(ModelParticleMagnet.keyboardHandler);
		component.addFocusListener(ModelParticleMagnet.keyboardHandler);
	}

	@Override
	public final void run() {
		do {
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
		} while (false);
	}

	static final World method710(final int i_0_) {
		if (!Class159.worldsLoaded || OverridedJInterface.worldOff > i_0_ || EnumType.worldLen < i_0_) {
			return null;
		}
		return Class48.worldList[i_0_ - OverridedJInterface.worldOff];
	}

	static final void drawWorldMapInterface(final int drawX, final int drawY, final int interfaceWidth, final int interfaceHeight) {
		if (Class90.laodingStage < 100) {
			Class81.loadWorldMap();
		}
		if (HDToolkit.glEnabled) {
			GraphicsHD.clipRect(drawX, drawY, drawX + interfaceWidth, interfaceHeight + drawY);
		} else {
			GraphicsLD.clipRect(drawX, drawY, drawX + interfaceWidth, interfaceHeight + drawY);
		}
		if (Class90.laodingStage < 100) {//Draw loading
			final int i_6_ = (interfaceWidth / 2) + drawX;
			final int i_7_ = (interfaceHeight / 2) + drawY - 38;
			if (HDToolkit.glEnabled) {
				GraphicsHD.fillRect(drawX, drawY, interfaceWidth, interfaceHeight, 0);
				GraphicsHD.drawRect(i_6_ - 152, i_7_, 304, 34, 9179409);
				GraphicsHD.fillRect(i_6_ - 150, i_7_ + 2, Class90.laodingStage * 3, 30, 9179409);
			} else {
				GraphicsLD.fillRect(drawX, drawY, interfaceWidth, interfaceHeight, 0);
				GraphicsLD.drawRect(i_6_ - 152, i_7_, 304, 34, 9179409);
				GraphicsLD.fillRect(i_6_ - 150, i_7_ + 2, Class90.laodingStage * 3, 30, 9179409);
			}
			Class120_Sub12_Sub22.boldFont.method1478(TextRepository.aString313, i_6_, i_7_ + 20, 16777215, -1);
		} else {
			Class173.worldMapPointerWidth = (int) (interfaceWidth * 2 / WorldMapHandler.currentZoom);
			GroundObjectNode.worldMapPointerHeight = (int) (interfaceHeight * 2 / WorldMapHandler.currentZoom);
			GroundTile.worldMapLookAtY = (int) (interfaceHeight / WorldMapHandler.currentZoom) - ModelParticleMagnet.anInt1646;
			ParamType.worldMapLookAtX = ParticleEmitter.anInt2336 - (int) (interfaceWidth / WorldMapHandler.currentZoom);
			final int i_8_ = ParticleEmitter.anInt2336 - (int) (interfaceWidth / WorldMapHandler.currentZoom);
			final int i_9_ = ModelParticleMagnet.anInt1646 - (int) (interfaceHeight / WorldMapHandler.currentZoom);
			final int i_10_ = ParticleEmitter.anInt2336 + (int) (interfaceWidth / WorldMapHandler.currentZoom);
			final int i_11_ = ModelParticleMagnet.anInt1646 + (int) (interfaceHeight / WorldMapHandler.currentZoom);
			if (!HDToolkit.glEnabled) {
				WorldMapHandler.method683(i_8_, i_9_, i_10_, i_11_, drawX, drawY, interfaceWidth + drawX, 1 + interfaceHeight + drawY);
				WorldMapHandler.method685();
				final Deque deque = WorldMapHandler.method679();//gather mapfunctions
				Class101_Sub1.method842(deque, 0, 0);//draw mapfunctions
			} else {
				if (Class101_Sub3.aClass120_Sub14_Sub19_Sub2_2290 == null || interfaceWidth != Class101_Sub3.aClass120_Sub14_Sub19_Sub2_2290.width || Class101_Sub3.aClass120_Sub14_Sub19_Sub2_2290.height != interfaceHeight) {
					Class101_Sub3.aClass120_Sub14_Sub19_Sub2_2290 = null;
					Class101_Sub3.aClass120_Sub14_Sub19_Sub2_2290 = new LDSprite(interfaceWidth, interfaceHeight);
				}
				GraphicsLD.init2dCanvas(Class101_Sub3.aClass120_Sub14_Sub19_Sub2_2290.pixels, interfaceWidth, interfaceHeight);
				WorldMapHandler.method683(i_8_, i_9_, i_10_, i_11_, 0, 0, interfaceWidth, 1 + interfaceHeight);
				WorldMapHandler.method685();
				final Deque deque = WorldMapHandler.method679();//gather mapfunctions
				Class101_Sub1.method842(deque, drawX, drawY);//draw mapfunctions
				Class101_Sub3.aClass120_Sub14_Sub19_Sub2_2290.flipVertical();//flip vertical
				GraphicsHD.drawPixels(Class101_Sub3.aClass120_Sub14_Sub19_Sub2_2290.pixels, drawX, drawY, interfaceWidth, interfaceHeight);//drawPixels
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
				final int informationX = interfaceWidth + drawX - 5;
				int informationY = drawY + interfaceHeight - 8;
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

	static final void method712() {
		GZIPDecompressor.aClass120_Sub14_Sub9_798 = Class120_Sub12_Sub10.aClass120_Sub14_Sub9_3204 = Class3.aClass120_Sub14_Sub9_54 = RuntimeException_Sub1.aClass120_Sub14_Sub9_2145 = null;
	}

	static final void method713(final int i, int i_16_, int i_17_, final int i_18_) {
		if (MagnetType.anInt260 <= i && ParamType.anInt3544 >= i) {
			i_16_ = Class3.method83(Class120_Sub30_Sub2.anInt3699, i_16_, IdentityKit.anInt1334);
			i_17_ = Class3.method83(Class120_Sub30_Sub2.anInt3699, i_17_, IdentityKit.anInt1334);
			ParticleEmitter.method939(i, i_18_, i_17_, i_16_);
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
			final Npc npc = Class120_Sub12_Sub11.npcList[Class120_Sub12_Sub36.npcIndices[id]];
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
