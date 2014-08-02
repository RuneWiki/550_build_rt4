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
	static ObjectCache aClass21_786 = new ObjectCache(64);
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

	static final void method711(final int i, final byte i_1_, final int i_2_, final int i_3_, final int i_4_) {
		if (Class90.anInt848 < 100) {
			Class81.method705((byte) -39);
		}
		if (HDToolkit.glEnabled) {
			GraphicsHD.clipRect(i_3_, i_2_, i_3_ + i_4_, i + i_2_);
		} else {
			GraphicsLD.clipRect(i_3_, i_2_, i_3_ + i_4_, i + i_2_);
		}
		if (Class90.anInt848 < 100) {
			final int i_6_ = i_4_ / 2 + i_3_;
			final int i_7_ = -38 + i_2_ - -(i / 2);
			if (HDToolkit.glEnabled) {
				GraphicsHD.fillRect(i_3_, i_2_, i_4_, i, 0);
				GraphicsHD.drawRect(-152 + i_6_, i_7_, 304, 34, 9179409);
				GraphicsHD.fillRect(i_6_ - 150, i_7_ - -2, Class90.anInt848 * 3, 30, 9179409);
			} else {
				GraphicsLD.fillRect(i_3_, i_2_, i_4_, i, 0);
				GraphicsLD.drawRect(i_6_ - 152, i_7_, 304, 34, 9179409);
				GraphicsLD.fillRect(-150 + i_6_, i_7_ + 2, Class90.anInt848 * 3, 30, 9179409);
			}
			Class120_Sub12_Sub22.boldFont.method1478(Class36.aString313, i_6_, i_7_ + 20, 16777215, -1);
		} else {
			GroundObjectNode.anInt3628 = (int) (i * 2 / Class79.aFloat696);
			GroundTile.anInt2627 = Class169.anInt1646 + -(int) (i / Class79.aFloat696);
			ParamType.anInt3538 = -(int) (i_4_ / Class79.aFloat696) + ParticleManager.anInt2336;
			Class173.anInt1726 = (int) (i_4_ * 2 / Class79.aFloat696);
			final int i_8_ = -(int) (i_4_ / Class79.aFloat696) + ParticleManager.anInt2336;
			final int i_9_ = Class169.anInt1646 - (int) (i / Class79.aFloat696);
			if (i_1_ >= -111) {
				method714((byte) -76);
			}
			final int i_10_ = (int) (i_4_ / Class79.aFloat696) + ParticleManager.anInt2336;
			final int i_11_ = (int) (i / Class79.aFloat696) + Class169.anInt1646;
			if (!HDToolkit.glEnabled) {
				Class79.method683(i_8_, i_9_, i_10_, i_11_, i_3_, i_2_, i_4_ + i_3_, 1 + i + i_2_);
				Class79.method685();
				final Deque deque = Class79.method679();
				Class101_Sub1.method842(deque, 0, 5938, 0);
			} else {
				if (Class101_Sub3.aClass120_Sub14_Sub19_Sub2_2290 == null || i_4_ != Class101_Sub3.aClass120_Sub14_Sub19_Sub2_2290.width || Class101_Sub3.aClass120_Sub14_Sub19_Sub2_2290.height != i) {
					Class101_Sub3.aClass120_Sub14_Sub19_Sub2_2290 = null;
					Class101_Sub3.aClass120_Sub14_Sub19_Sub2_2290 = new LDSprite(i_4_, i);
				}
				GraphicsLD.init2dCanvas(Class101_Sub3.aClass120_Sub14_Sub19_Sub2_2290.pixels, i_4_, i);
				Class79.method683(i_8_, i_9_, i_10_, i_11_, 0, 0, i_4_, 1 + i);
				Class79.method685();
				final Deque deque = Class79.method679();
				Class101_Sub1.method842(deque, i_3_, 5938, i_2_);
				Class101_Sub3.aClass120_Sub14_Sub19_Sub2_2290.method1608();
				GraphicsHD.method596(Class101_Sub3.aClass120_Sub14_Sub19_Sub2_2290.pixels, i_3_, i_2_, i_4_, i);
				GraphicsLD.pixels = null;
			}
			if (Class96.anInt919 > 0) {
				Class136.anInt1321--;
				if (Class136.anInt1321 == 0) {
					Class136.anInt1321 = 20;
					Class96.anInt919--;
				}
			}
			if (HintIcon.showFps) {
				final int i_12_ = i_4_ + i_3_ - 5;
				int i_13_ = 16776960;
				int i_14_ = i_2_ + i + -8;
				Class120_Sub12_Sub20.plainFont.method1482(new StringBuilder("Fps:").append(MapFunctionType.fps).toString(), i_12_, i_14_, 16776960, -1);
				final Runtime runtime = Runtime.getRuntime();
				i_14_ -= 15;
				final int i_15_ = (int) ((runtime.totalMemory() - runtime.freeMemory()) / 1024L);
				if (-65537 > (i_15_ ^ 0xffffffff)) {
					i_13_ = 16711680;
				}
				Class120_Sub12_Sub20.plainFont.method1482(new StringBuilder("Mem:").append(i_15_).append("k").toString(), i_12_, i_14_, i_13_, -1);
				i_14_ -= 15;
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
				i_16_ = Class3.method83(Class120_Sub30_Sub2.anInt3699, i_16_, 1, IdentityKit.anInt1334);
				i_17_ = Class3.method83(Class120_Sub30_Sub2.anInt3699, i_17_, 1, IdentityKit.anInt1334);
				ParticleManager.method939(i, i_18_, i_17_, (byte) -30, i_16_);
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("im.C(").append(i).append(',').append(i_16_).append(',').append(i_17_).append(',').append(i_18_).append(',').append(bool).append(')').toString());
		}
	}

	public static void method714(final byte i) {
		try {
			aClass21_786 = null;
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
