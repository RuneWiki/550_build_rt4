/* Class107 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;

abstract class AbstractIndexedSprite {
	int xOffset;
	int yOffset;
	static JagexInterface[] aClass189Array1022;
	static int modeWhere = 0;
	static int defaultCursorId;
	static String aString1025;
	int width;
	static int anInt1027 = 0;
	int trimHeight;
	int trimWidth;
	int height;

	static {
		defaultCursorId = -1;
		aString1025 = "Prepared sound engine";
	}

	static final void method908(final int width, final int i_1_, final boolean refreshCanvas, final int height, final int displayMode, final boolean bool_4_) {
		if (bool_4_) {
			HDToolkit.method519();
		}
		if (Class120_Sub14_Sub10.fullscreenFrame != null && (displayMode != 3 || width != Class120_Sub12_Sub18.lastFullscreenWidth || height != Class120_Sub12_Sub12.lastFullscreenHeight)) {
			Class150.revertFrame(NpcType.gameSignlink, Class120_Sub14_Sub10.fullscreenFrame);
			Class120_Sub14_Sub10.fullscreenFrame = null;
		}
		if (displayMode == 3 && Class120_Sub14_Sub10.fullscreenFrame == null) {
			Class120_Sub14_Sub10.fullscreenFrame = Class120_Sub12_Sub1.goFullscreen(0, width, height, 0, NpcType.gameSignlink);
			if (Class120_Sub14_Sub10.fullscreenFrame != null) {
				Class120_Sub12_Sub18.lastFullscreenWidth = width;
				Class120_Sub12_Sub12.lastFullscreenHeight = height;
				Class120_Sub6.savePreferences(NpcType.gameSignlink);
			}
		}
		if (displayMode == 3 && Class120_Sub14_Sub10.fullscreenFrame == null) {
			method908(-1, i_1_, true, -1, Class120_Sub12_Sub19.currentDisplayMode, true);
		} else {
			Container container;
			if (Class120_Sub14_Sub10.fullscreenFrame == null) {
				if (Class112.frame != null) {
					container = Class112.frame;
				} else {
					container = NpcType.gameSignlink.gameApplet;
				}
			} else {
				container = Class120_Sub14_Sub10.fullscreenFrame;
			}
			Class120_Sub12_Sub7.frameWidth = container.getSize().width;
			PlayerAppearance.frameHeight = container.getSize().height;
			if (container == Class112.frame) {
				final Insets insets = Class112.frame.getInsets();
				Class120_Sub12_Sub7.frameWidth -= insets.right + insets.left;
				PlayerAppearance.frameHeight -= insets.top + insets.bottom;
			}
			if (displayMode >= 2) {
				Class186.topMargin = 0;
				Class69_Sub1.canvasWidth = Class120_Sub12_Sub7.frameWidth;
				Class120_Sub28.leftMargin = 0;
				Class120_Sub12_Sub5.canvasHeight = PlayerAppearance.frameHeight;
			} else {
				Class120_Sub28.leftMargin = (Class120_Sub12_Sub7.frameWidth - 765) / 2;
				Class69_Sub1.canvasWidth = 765;
				Class120_Sub12_Sub5.canvasHeight = 503;
				Class186.topMargin = 0;
			}
			if (refreshCanvas) {
				Class26.removeKeyboard(Node.canvas);
				NodeCache.removeMouse(Node.canvas);
				if (Class120_Sub12_Sub31.mouseWheelHandler != null) {
					Class120_Sub12_Sub31.mouseWheelHandler.removeListener(Node.canvas);
				}
				Class179.aClient1776.addCanvas();
				Class82.addKeyboard(Node.canvas);
				NodeCache.addMouse(Node.canvas);
				if (Class120_Sub12_Sub31.mouseWheelHandler != null) {
					Class120_Sub12_Sub31.mouseWheelHandler.addListener(Node.canvas);
				}
			} else {
				if (HDToolkit.glEnabled) {
					HDToolkit.setCanvasSize(Class69_Sub1.canvasWidth, Class120_Sub12_Sub5.canvasHeight);
				}
				Node.canvas.setSize(Class69_Sub1.canvasWidth, Class120_Sub12_Sub5.canvasHeight);
				if (container != Class112.frame) {
					Node.canvas.setLocation(Class120_Sub28.leftMargin, Class186.topMargin);
				} else {
					final Insets insets = Class112.frame.getInsets();
					Node.canvas.setLocation(Class120_Sub28.leftMargin + insets.left, Class186.topMargin + insets.top);
				}
			}
			if (displayMode == 0 && i_1_ > 0) {
				HDToolkit.method525(Node.canvas);
			}
			if (bool_4_ && displayMode > 0) {
				Node.canvas.setIgnoreRepaint(true);
				if (!Class42.aBoolean363) {
					Class173.method2225();
					ClanMember.fullscreenGraphics = null;
					ClanMember.fullscreenGraphics = Class114.constructGraphicsBuffer(Node.canvas, Class69_Sub1.canvasWidth, Class120_Sub12_Sub5.canvasHeight);
					GraphicsLD.clearPixels();
					if (Class109.gameState != 5) {
						Class120_Sub12_Sub21_Sub1.drawTextOnScreen(Class120_Sub30_Sub2.aString3679, false);
					} else {
						OverlayType.method1909(true, Class120_Sub12_Sub22.boldFont, false);
					}
					try {
						final Graphics graphics = Node.canvas.getGraphics();
						ClanMember.fullscreenGraphics.drawImage(graphics, 0, 0);
					} catch (final Exception exception) {
						/* empty */
					}
					Class120_Sub12_Sub22.method1322();
					if (i_1_ != 0) {
						ClanMember.fullscreenGraphics = null;
					} else {
						ClanMember.fullscreenGraphics = Class114.constructGraphicsBuffer(Node.canvas, 765, 503);
					}
					final SignlinkNode signlinkNode = NpcType.gameSignlink.method1967(-72, Class179.aClient1776.getClass());
					while (signlinkNode.status == 0) {
						PacketBuffer.sleepWrapper(100L);
					}
					if (signlinkNode.status == 1) {
						Class42.aBoolean363 = true;
					}
				}
				if (Class42.aBoolean363) {
					HDToolkit.method537(Node.canvas, 2 * Class36.antiAliasingSamples);
				}
			}
			if (!HDToolkit.glEnabled && displayMode > 0) {
				method908(-1, i_1_, true, -1, 0, true);
			} else {
				if (displayMode <= 0 || i_1_ != 0) {
					if (displayMode == 0 && i_1_ > 0) {
						JagexInterface.gameShellThread.setPriority(1);
						ClanMember.fullscreenGraphics = Class114.constructGraphicsBuffer(Node.canvas, 765, 503);
						Class180_Sub7_Sub1.method2395();
						ParticleEngine.method946();
						((Class143_Sub1) Rasterizer.anInterface5_973).method2028(20, (byte) -111);
						if (Class120_Sub12_Sub6.highLightingDetail) {
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
						}
						Class120_Sub9.method1163();
						LocType.resetSpriteMenu();
					}
				} else {
					JagexInterface.gameShellThread.setPriority(5);
					ClanMember.fullscreenGraphics = null;
					Class180_Sub7_Sub1.method2404();
					((Class143_Sub1) Rasterizer.anInterface5_973).method2028(200, (byte) -111);
					if (Class120_Sub12_Sub6.highLightingDetail) {
						Rasterizer.method852(0.7F);
					}
					if (IdentityKit.aClass191ArrayArray1337 == null) {
						IdentityKit.aClass191ArrayArray1337 = new Class191[13][13];
					}
					LightManager.method1856(4, 104, 104);
					Class47.method382(104, 104);
					LocType.resetSpriteMenu();
				}
				Class120_Sub12_Sub26.aBoolean3326 = !Class143_Sub1.method2021();
				ParticleEngine.method961(Class69_Sub1.canvasWidth, Class120_Sub12_Sub5.canvasHeight);
				if (bool_4_) {
					ObjectCache.method191();
				}
				if (displayMode < 2) {
					MouseRecorder.frameResizable = false;
				} else {
					MouseRecorder.frameResizable = true;
				}
				if (Class69.rootInterfaceId != -1) {
					Class101_Sub2.method846(true);
				}
				if (AbstractTimer.worldConnection != null && (Class109.gameState == 30 || Class109.gameState == 25)) {
					ParamType.sendDisplayInfo();
				}
				for (int i_5_ = 0; i_5_ < 100; i_5_++) {
					Class52.needInterfaceRedrawWrapper[i_5_] = true;
				}
				Class120_Sub12_Sub26.fullRedraw = true;
			}
		}
	}

	public static void method909(final boolean bool) {
		try {
			aClass189Array1022 = null;
			if (!bool) {
				method908(73, -89, true, 124, -84, true);
			}
			aString1025 = null;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("ma.H(").append(bool).append(')').toString());
		}
	}

	abstract void method910(int i, int i_6_);

	abstract void method911(int i, int i_7_, int i_8_);

	public AbstractIndexedSprite() {
		/* empty */
	}
}
