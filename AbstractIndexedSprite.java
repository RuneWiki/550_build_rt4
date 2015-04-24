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

	static final void changeDisplayMode(final int newDisplayMode, final int width, final int height, final int currentDisplayMode, final boolean canvasReplaceRecommended, final boolean changeRenderer) {
		if (changeRenderer) {
			HDToolkit.method519();
		}
		if (Class120_Sub14_Sub10.fullscreenFrame != null && (newDisplayMode != 3 || width != Class120_Sub12_Sub18.lastFullscreenWidth || height != Class120_Sub12_Sub12.lastFullscreenHeight)) {
			Class150.revertFrame(NpcType.gameSignlink, Class120_Sub14_Sub10.fullscreenFrame);
			Class120_Sub14_Sub10.fullscreenFrame = null;
		}
		if (newDisplayMode == 3 && Class120_Sub14_Sub10.fullscreenFrame == null) {
			Class120_Sub14_Sub10.fullscreenFrame = Class120_Sub12_Sub1.goFullscreen(0, width, height, 0, NpcType.gameSignlink);
			if (Class120_Sub14_Sub10.fullscreenFrame != null) {
				Class120_Sub12_Sub18.lastFullscreenWidth = width;
				Class120_Sub12_Sub12.lastFullscreenHeight = height;
				Class120_Sub6.savePreferences(NpcType.gameSignlink);
			}
		}
		if (newDisplayMode == 3 && Class120_Sub14_Sub10.fullscreenFrame == null) {
			changeDisplayMode(Class120_Sub12_Sub19.currentDisplayMode, -1, -1, currentDisplayMode, true, true);
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
			if (newDisplayMode >= 2) {
				WallDecoration.topMargin = 0;
				Class69_Sub1.canvasWidth = Class120_Sub12_Sub7.frameWidth;
				ReflectionCheckNode.leftMargin = 0;
				Class120_Sub12_Sub5.canvasHeight = PlayerAppearance.frameHeight;
			} else {
				ReflectionCheckNode.leftMargin = (Class120_Sub12_Sub7.frameWidth - 765) / 2;
				Class69_Sub1.canvasWidth = 765;
				Class120_Sub12_Sub5.canvasHeight = 503;
				//Class186.topMargin = 0;//original
				WallDecoration.topMargin = (PlayerAppearance.frameHeight - 503) / 2;
			}
			if (canvasReplaceRecommended) {
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
					Node.canvas.setLocation(ReflectionCheckNode.leftMargin, WallDecoration.topMargin);
				} else {
					final Insets insets = Class112.frame.getInsets();
					Node.canvas.setLocation(ReflectionCheckNode.leftMargin + insets.left, WallDecoration.topMargin + insets.top);
				}
			}
			if (newDisplayMode == 0 && currentDisplayMode > 0) {
				HDToolkit.destroy(Node.canvas);
			}
			if (changeRenderer && newDisplayMode > 0) {
				Node.canvas.setIgnoreRepaint(true);
				if (!Class42.aBoolean363) {
					Class173.method2225();
					ClanMember.fullscreenGraphics = null;
					ClanMember.fullscreenGraphics = Class114.constructGraphicsBuffer(Node.canvas, Class69_Sub1.canvasWidth, Class120_Sub12_Sub5.canvasHeight);
					GraphicsLD.clearPixels();
					if (Class109.gameState != 5) {
						Class120_Sub12_Sub21_Sub1.drawTextOnScreen(Class120_Sub30_Sub2.loadingPleaseWait, false);
					} else {
						UnderlayType.method1909(Class120_Sub12_Sub22.boldFont, true);
					}
					try {
						final Graphics graphics = Node.canvas.getGraphics();
						ClanMember.fullscreenGraphics.drawImage(graphics, 0, 0);
					} catch (final Exception exception) {
						/* empty */
					}
					Class120_Sub12_Sub22.method1322();
					if (currentDisplayMode != 0) {
						ClanMember.fullscreenGraphics = null;
					} else {
						ClanMember.fullscreenGraphics = Class114.constructGraphicsBuffer(Node.canvas, 765, 503);
					}
					final SignlinkNode signlinkNode = NpcType.gameSignlink.method1967(Class179.aClient1776.getClass());
					while (signlinkNode.status == 0) {
						PacketBuffer.sleepWrapper(100L);
					}
					if (signlinkNode.status == 1) {
						Class42.aBoolean363 = true;
					}
				}
				if (Class42.aBoolean363) {
					HDToolkit.method537(Node.canvas, 2 * GroundDecoration.antiAliasingSamples);
				}
			}
			if (!HDToolkit.glEnabled && newDisplayMode > 0) {
				changeDisplayMode(0, -1, -1, currentDisplayMode, true, true);
			} else {
				if (newDisplayMode <= 0 || currentDisplayMode != 0) {
					if (newDisplayMode == 0 && currentDisplayMode > 0) {
						JagexInterface.gameShellThread.setPriority(1);
						ClanMember.fullscreenGraphics = Class114.constructGraphicsBuffer(Node.canvas, 765, 503);
						LDModelRenderer.method2395();
						ParticleEngine.method946();
						((Class143_Sub1) Rasterizer.anInterface5_973).method2028(20);
						if (Class120_Sub12_Sub6.highLightingDetail) {
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
						}
						Class120_Sub9.method1163();
						LocType.resetSpriteMenu();
					}
				} else {
					JagexInterface.gameShellThread.setPriority(5);
					ClanMember.fullscreenGraphics = null;
					LDModelRenderer.method2404();
					((Class143_Sub1) Rasterizer.anInterface5_973).method2028(200);
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
				if (changeRenderer) {
					ObjectCache.method191();
				}
				if (newDisplayMode < 2) {
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
				for (int id = 0; id < 100; id++) {
					MasterIndexInfo.needInterfaceRedrawWrapper[id] = true;
				}
				Class120_Sub12_Sub26.fullRedraw = true;
			}
		}
	}

	abstract void drawReg(int i, int i_6_);

	abstract void method911(int i, int i_7_, int i_8_);

	public AbstractIndexedSprite() {
		/* empty */
	}
}
