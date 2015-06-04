/* Applet_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagex3.jagmisc.jagmisc;

import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.lang.reflect.Method;
import java.net.URL;

public abstract class GameShell extends Applet implements Runnable, FocusListener, WindowListener {
	static long[] mainRedrawCache;
	static short aShort2 = 32767;
	static int loginscreenId;
	static long aLong4;
	private boolean jagmiscLoaded = false;
	private boolean alreadyErrored = false;
	public static boolean aBoolean7;
	public static int anInt8;
	public static int anInt9;

	static {
		mainRedrawCache = new long[32];
		aLong4 = 0L;
	}

	@Override
	public final void windowDeiconified(final WindowEvent windowevent) {
		/* empty */
	}

	abstract void mainLoop();

	static final void method31(final int option) {
		if (option >= 0) {
			final int data1 = (int) Class120_Sub12.menuOptionsData1[option];
			final int data2 = Class120_Sub12_Sub7.menuOptionsData2[option];
			final int data3 = Class120_Sub29.menuOptionsData3[option];
			int code = Class120_Sub29.menuOptionsCode[option];
			final long data1AsLong = Class120_Sub12.menuOptionsData1[option];
			if (code >= 2000) {
				code -= 2000;
			}
			if (code == 24) {
				final Player player = Class118.playersList[data1];
				if (player != null) {
					Class120_Sub12_Sub35.crossX = js5.lastClickX;
					Class120_Sub14_Sub22.crossState = 2;
					Class120_Sub12_Sub7.crossIndex = 0;
					IsaacCipher.crossY = Class120_Sub12_Sub36.lastClickY;
					Class120_Sub12_Sub11.outputStream.putByteIsaac(52);
					Class120_Sub12_Sub11.outputStream.putShort(data1);
					Class120_Sub12_Sub11.outputStream.putByte(NodeCache.heldKeys[82] ? 1 : 0);
					MapFunctionNode.setFlagPosition(TileParticleQueue.selfPlayer.walkQueueX[0], 0, 0, true, player.getSize(), data3, TileParticleQueue.selfPlayer.walkQueueZ[0], 0, player.getSize(), data2);
				}
			}
			if (code == 17) {
				Class120_Sub12_Sub11.outputStream.putByteIsaac(95);
				Class120_Sub12_Sub11.outputStream.putShort(data1);
				Class120_Sub12_Sub11.outputStream.putInt2(data3);
				Class120_Sub12_Sub11.outputStream.putLEShortA(data2);
				Class69_Sub2.anInt2236 = 0;
				MagnetType.aClass189_256 = Class74.getJagexInterface(data3);
				Huffman.anInt1204 = data2;
			}
			if (code == 33) {
				final Npc npc = Class120_Sub12_Sub11.npcList[data1];
				if (npc != null) {
					Class120_Sub12_Sub35.crossX = js5.lastClickX;
					Class120_Sub14_Sub22.crossState = 2;
					IsaacCipher.crossY = Class120_Sub12_Sub36.lastClickY;
					Class120_Sub12_Sub7.crossIndex = 0;
					Class120_Sub12_Sub11.outputStream.putByteIsaac(160);
					Class120_Sub12_Sub11.outputStream.putByteC(NodeCache.heldKeys[82] ? 1 : 0);
					Class120_Sub12_Sub11.outputStream.putLEInt(PlainTile.selectedObjInterface);
					Class120_Sub12_Sub11.outputStream.putLEShort(data1);
					Class120_Sub12_Sub11.outputStream.putShort(ParticleEmitter.selectedObjSlot);
					Class120_Sub12_Sub11.outputStream.putLEShortA(ProjectileNode.selectedObjId);
					MapFunctionNode.setFlagPosition(TileParticleQueue.selfPlayer.walkQueueX[0], 0, 0, true, npc.getSize(), data3, TileParticleQueue.selfPlayer.walkQueueZ[0], 0, npc.getSize(), data2);
				}
			}
			if (code == 40) {
				IsaacCipher.crossY = Class120_Sub12_Sub36.lastClickY;
				Class120_Sub14_Sub22.crossState = 2;
				Class120_Sub12_Sub35.crossX = js5.lastClickX;
				Class120_Sub12_Sub7.crossIndex = 0;
				Class120_Sub12_Sub11.outputStream.putByteIsaac(134);
				Class120_Sub12_Sub11.outputStream.putByteS(NodeCache.heldKeys[82] ? 1 : 0);
				Class120_Sub12_Sub11.outputStream.putShortA(0x7fffffff & (int) (data1AsLong >>> 32));
				Class120_Sub12_Sub11.outputStream.putShortA(LightType.currentBaseZ + data3);
				Class120_Sub12_Sub11.outputStream.putLEShortA(GameEntity.currentBaseX + data2);
				SpotAnimationNode.method1437(data3, data1AsLong, data2);
			}
			if (code == 46) {
				Class120_Sub12_Sub7.crossIndex = 0;
				Class120_Sub12_Sub35.crossX = js5.lastClickX;
				Class120_Sub14_Sub22.crossState = 2;
				IsaacCipher.crossY = Class120_Sub12_Sub36.lastClickY;
				Class120_Sub12_Sub11.outputStream.putByteIsaac(227);
				Class120_Sub12_Sub11.outputStream.putShort(data2 + GameEntity.currentBaseX);
				Class120_Sub12_Sub11.outputStream.putByte(NodeCache.heldKeys[82] ? 1 : 0);
				Class120_Sub12_Sub11.outputStream.putShort(LightType.currentBaseZ + data3);
				Class120_Sub12_Sub11.outputStream.putLEShortA(data1);
				MapFunctionNode.setFlagPosition(TileParticleQueue.selfPlayer.walkQueueX[0], 0, 0, true, 0, data3, TileParticleQueue.selfPlayer.walkQueueZ[0], 0, 0, data2);
			}
			if (code == 21) {
				final Player player = Class118.playersList[data1];
				if (player != null) {
					IsaacCipher.crossY = Class120_Sub12_Sub36.lastClickY;
					Class120_Sub12_Sub35.crossX = js5.lastClickX;
					Class120_Sub14_Sub22.crossState = 2;
					Class120_Sub12_Sub7.crossIndex = 0;
					Class120_Sub12_Sub11.outputStream.putByteIsaac(123);
					Class120_Sub12_Sub11.outputStream.putLEShortA(data1);
					Class120_Sub12_Sub11.outputStream.putInt(PlainTile.selectedObjInterface);
					Class120_Sub12_Sub11.outputStream.putShortA(ParticleEmitter.selectedObjSlot);
					Class120_Sub12_Sub11.outputStream.putByteS(NodeCache.heldKeys[82] ? 1 : 0);
					Class120_Sub12_Sub11.outputStream.putLEShortA(ProjectileNode.selectedObjId);
					MapFunctionNode.setFlagPosition(TileParticleQueue.selfPlayer.walkQueueX[0], 0, 0, true, player.getSize(), data3, TileParticleQueue.selfPlayer.walkQueueZ[0], 0, player.getSize(), data2);
				}
			}
			if (code == 1004) {
				IsaacCipher.crossY = Class120_Sub12_Sub36.lastClickY;
				Class120_Sub12_Sub35.crossX = js5.lastClickX;
				Class120_Sub12_Sub7.crossIndex = 0;
				Class120_Sub14_Sub22.crossState = 2;
				Class120_Sub12_Sub11.outputStream.putByteIsaac(72);
				Class120_Sub12_Sub11.outputStream.putShort(data1);
			}
			if (code == 19) {//Cast spell on scene
				if (data1 == 0) {//From minimap
					MapFunctionNode.anInt3479 = 1;
					Class120_Sub12_Sub20.method1302(Class173.gameLevel, data2, data3);
				} else if (data1 == 1) {//From game screen
					Class120_Sub12_Sub11.outputStream.putByteIsaac(204);
					Class120_Sub12_Sub11.outputStream.putShortA(data3 + LightType.currentBaseZ);
					Class120_Sub12_Sub11.outputStream.putShortA(JagexSocket.selectedSpellComponextIndex);
					Class120_Sub12_Sub11.outputStream.putInt2(AbstractMouseWheelHandler.selectedSpellInterfaceBitPacked);
					Class120_Sub12_Sub11.outputStream.putLEShort(data2 + GameEntity.currentBaseX);
				}
			}
			if (code == 28) {
				IsaacCipher.crossY = Class120_Sub12_Sub36.lastClickY;
				Class120_Sub14_Sub22.crossState = 2;
				Class120_Sub12_Sub35.crossX = js5.lastClickX;
				Class120_Sub12_Sub7.crossIndex = 0;
				Class120_Sub12_Sub11.outputStream.putByteIsaac(119);
				Class120_Sub12_Sub11.outputStream.putInt2(PlainTile.selectedObjInterface);
				Class120_Sub12_Sub11.outputStream.putShort(LightType.currentBaseZ + data3);
				Class120_Sub12_Sub11.outputStream.putShortA(ProjectileNode.selectedObjId);
				Class120_Sub12_Sub11.outputStream.putLEShort(ParticleEmitter.selectedObjSlot);
				Class120_Sub12_Sub11.outputStream.putLEShortA(data1);
				Class120_Sub12_Sub11.outputStream.putLEShort(GameEntity.currentBaseX + data2);
				Class120_Sub12_Sub11.outputStream.putByteS(NodeCache.heldKeys[82] ? 1 : 0);
				MapFunctionNode.setFlagPosition(TileParticleQueue.selfPlayer.walkQueueX[0], 0, 0, true, 0, data3, TileParticleQueue.selfPlayer.walkQueueZ[0], 0, 0, data2);
			}
			if (code == 36) {
				final Npc npc = Class120_Sub12_Sub11.npcList[data1];
				if (npc != null) {
					Class120_Sub14_Sub22.crossState = 2;
					Class120_Sub12_Sub7.crossIndex = 0;
					Class120_Sub12_Sub35.crossX = js5.lastClickX;
					IsaacCipher.crossY = Class120_Sub12_Sub36.lastClickY;
					Class120_Sub12_Sub11.outputStream.putByteIsaac(37);
					Class120_Sub12_Sub11.outputStream.putByte(NodeCache.heldKeys[82] ? 1 : 0);
					Class120_Sub12_Sub11.outputStream.putLEShortA(data1);
					MapFunctionNode.setFlagPosition(TileParticleQueue.selfPlayer.walkQueueX[0], 0, 0, true, npc.getSize(), data3, TileParticleQueue.selfPlayer.walkQueueZ[0], 0, npc.getSize(), data2);
				}
			}
			if (code == 12) {
				final Player player = Class118.playersList[data1];
				if (player != null) {
					Class120_Sub14_Sub22.crossState = 2;
					Class120_Sub12_Sub35.crossX = js5.lastClickX;
					Class120_Sub12_Sub7.crossIndex = 0;
					IsaacCipher.crossY = Class120_Sub12_Sub36.lastClickY;
					Class120_Sub12_Sub11.outputStream.putByteIsaac(4);
					Class120_Sub12_Sub11.outputStream.putByte(NodeCache.heldKeys[82] ? 1 : 0);
					Class120_Sub12_Sub11.outputStream.putShortA(data1);
					MapFunctionNode.setFlagPosition(TileParticleQueue.selfPlayer.walkQueueX[0], 0, 0, true, player.getSize(), data3, TileParticleQueue.selfPlayer.walkQueueZ[0], 0, player.getSize(), data2);
				}
			}
			if (code == 10) {
				Class120_Sub12_Sub11.outputStream.putByteIsaac(102);
				Class120_Sub12_Sub11.outputStream.putInt(data3);
				Class120_Sub12_Sub11.outputStream.putShortA(data2);
				Class120_Sub12_Sub11.outputStream.putShort(data1);
				Class69_Sub2.anInt2236 = 0;
				MagnetType.aClass189_256 = Class74.getJagexInterface(data3);
				Huffman.anInt1204 = data2;
			}
			if (code == 25) {
				final Npc npc = Class120_Sub12_Sub11.npcList[data1];
				if (npc != null) {
					Class120_Sub12_Sub7.crossIndex = 0;
					IsaacCipher.crossY = Class120_Sub12_Sub36.lastClickY;
					Class120_Sub14_Sub22.crossState = 2;
					Class120_Sub12_Sub35.crossX = js5.lastClickX;
					Class120_Sub12_Sub11.outputStream.putByteIsaac(33);
					Class120_Sub12_Sub11.outputStream.putLEShortA(data1);
					Class120_Sub12_Sub11.outputStream.putByteA(NodeCache.heldKeys[82] ? 1 : 0);
					MapFunctionNode.setFlagPosition(TileParticleQueue.selfPlayer.walkQueueX[0], 0, 0, true, npc.getSize(), data3, TileParticleQueue.selfPlayer.walkQueueZ[0], 0, npc.getSize(), data2);
				}
			}
			if (code == 1007) {
				Class120_Sub12_Sub35.crossX = js5.lastClickX;
				Class120_Sub12_Sub7.crossIndex = 0;
				IsaacCipher.crossY = Class120_Sub12_Sub36.lastClickY;
				Class120_Sub14_Sub22.crossState = 2;
				Class120_Sub12_Sub11.outputStream.putByteIsaac(176);
				Class120_Sub12_Sub11.outputStream.putShort(data1);
			}
			if (code == 4) {
				Class120_Sub14_Sub22.crossState = 2;
				IsaacCipher.crossY = Class120_Sub12_Sub36.lastClickY;
				Class120_Sub12_Sub7.crossIndex = 0;
				Class120_Sub12_Sub35.crossX = js5.lastClickX;
				Class120_Sub12_Sub11.outputStream.putByteIsaac(89);
				Class120_Sub12_Sub11.outputStream.putShort((int) (data1AsLong >>> 32) & 0x7fffffff);
				Class120_Sub12_Sub11.outputStream.putByteC(NodeCache.heldKeys[82] ? 1 : 0);
				Class120_Sub12_Sub11.outputStream.putLEShortA(GameEntity.currentBaseX + data2);
				Class120_Sub12_Sub11.outputStream.putLEShort(JagexSocket.selectedSpellComponextIndex);
				Class120_Sub12_Sub11.outputStream.putShort(LightType.currentBaseZ + data3);
				Class120_Sub12_Sub11.outputStream.putInt2(AbstractMouseWheelHandler.selectedSpellInterfaceBitPacked);
				SpotAnimationNode.method1437(data3, data1AsLong, data2);
			}
			if (code == 6) {
				Class120_Sub12_Sub35.crossX = js5.lastClickX;
				Class120_Sub12_Sub7.crossIndex = 0;
				Class120_Sub14_Sub22.crossState = 2;
				IsaacCipher.crossY = Class120_Sub12_Sub36.lastClickY;
				Class120_Sub12_Sub11.outputStream.putByteIsaac(232);
				Class120_Sub12_Sub11.outputStream.putLEShort(data3 - -LightType.currentBaseZ);
				Class120_Sub12_Sub11.outputStream.putLEShortA(data1);
				Class120_Sub12_Sub11.outputStream.putByteA(NodeCache.heldKeys[82] ? 1 : 0);
				Class120_Sub12_Sub11.outputStream.putLEShort(data2 + GameEntity.currentBaseX);
				MapFunctionNode.setFlagPosition(TileParticleQueue.selfPlayer.walkQueueX[0], 0, 0, true, 0, data3, TileParticleQueue.selfPlayer.walkQueueZ[0], 0, 0, data2);
			}
			if (code == 42) {
				final Npc npc = Class120_Sub12_Sub11.npcList[data1];
				if (npc != null) {
					Class120_Sub12_Sub7.crossIndex = 0;
					Class120_Sub12_Sub35.crossX = js5.lastClickX;
					IsaacCipher.crossY = Class120_Sub12_Sub36.lastClickY;
					Class120_Sub14_Sub22.crossState = 2;
					Class120_Sub12_Sub11.outputStream.putByteIsaac(155);
					Class120_Sub12_Sub11.outputStream.putShortA(data1);
					Class120_Sub12_Sub11.outputStream.putByteC(NodeCache.heldKeys[82] ? 1 : 0);
					Class120_Sub12_Sub11.outputStream.putShort(JagexSocket.selectedSpellComponextIndex);
					Class120_Sub12_Sub11.outputStream.putInt2(AbstractMouseWheelHandler.selectedSpellInterfaceBitPacked);
					MapFunctionNode.setFlagPosition(TileParticleQueue.selfPlayer.walkQueueX[0], 0, 0, true, npc.getSize(), data3, TileParticleQueue.selfPlayer.walkQueueZ[0], 0, npc.getSize(), data2);
				}
			}
			if (code == 31) {
				final Player player = Class118.playersList[data1];
				if (player != null) {
					IsaacCipher.crossY = Class120_Sub12_Sub36.lastClickY;
					Class120_Sub12_Sub7.crossIndex = 0;
					Class120_Sub12_Sub35.crossX = js5.lastClickX;
					Class120_Sub14_Sub22.crossState = 2;
					Class120_Sub12_Sub11.outputStream.putByteIsaac(105);
					Class120_Sub12_Sub11.outputStream.putShort(data1);
					Class120_Sub12_Sub11.outputStream.putByte(NodeCache.heldKeys[82] ? 1 : 0);
					MapFunctionNode.setFlagPosition(TileParticleQueue.selfPlayer.walkQueueX[0], 0, 0, true, player.getSize(), data3, TileParticleQueue.selfPlayer.walkQueueZ[0], 0, player.getSize(), data2);
				}
			}
			if (code == 47) {
				if (data1 == 0) {
					Class120_Sub12_Sub33.anInt3401 = 1;
					Class120_Sub12_Sub20.method1302(Class173.gameLevel, data2, data3);
				} else if (Class86.staffLevel <= 0 || !NodeCache.heldKeys[82] || !NodeCache.heldKeys[81]) {
					Class120_Sub12_Sub11.outputStream.putByteIsaac(85);
					Class120_Sub12_Sub11.outputStream.putLEShortA(GameEntity.currentBaseX + data2);
					Class120_Sub12_Sub11.outputStream.putLEShort(LightType.currentBaseZ + data3);
				} else {
					ParticleNode.tele(GameEntity.currentBaseX + data2, LightType.currentBaseZ + data3, Class173.gameLevel);
				}
			}
			if (code == 59) {
				final Npc npc = Class120_Sub12_Sub11.npcList[data1];
				if (npc != null) {
					IsaacCipher.crossY = Class120_Sub12_Sub36.lastClickY;
					Class120_Sub12_Sub35.crossX = js5.lastClickX;
					Class120_Sub12_Sub7.crossIndex = 0;
					Class120_Sub14_Sub22.crossState = 2;
					Class120_Sub12_Sub11.outputStream.putByteIsaac(53);
					Class120_Sub12_Sub11.outputStream.putLEShortA(data1);
					Class120_Sub12_Sub11.outputStream.putByteS(NodeCache.heldKeys[82] ? 1 : 0);
					MapFunctionNode.setFlagPosition(TileParticleQueue.selfPlayer.walkQueueX[0], 0, 0, true, npc.getSize(), data3, TileParticleQueue.selfPlayer.walkQueueZ[0], 0, npc.getSize(), data2);
				}
			}
			if (code == 51) {
				Class120_Sub12_Sub11.outputStream.putByteIsaac(88);
				Class120_Sub12_Sub11.outputStream.putLEShortA(data1);
				Class120_Sub12_Sub11.outputStream.putInt1(data3);
				Class120_Sub12_Sub11.outputStream.putLEShortA(data2);
				Class69_Sub2.anInt2236 = 0;
				MagnetType.aClass189_256 = Class74.getJagexInterface(data3);
				Huffman.anInt1204 = data2;
			}
			if (code == 13) {
				Class120_Sub12_Sub11.outputStream.putByteIsaac(242);
				Class120_Sub12_Sub11.outputStream.putLEShortA(data2);
				Class120_Sub12_Sub11.outputStream.putLEShortA(data1);
				Class120_Sub12_Sub11.outputStream.putInt1(data3);
				Class69_Sub2.anInt2236 = 0;
				MagnetType.aClass189_256 = Class74.getJagexInterface(data3);
				Huffman.anInt1204 = data2;
			}
			if (code == 3 && Class156.aClass189_1454 == null) {
				JagexInterface.method2499(data2, data3);
				Class156.aClass189_1454 = JagexInterface.getComponent(data3, data2);
				InterfaceClickMask.redrawInterface(Class156.aClass189_1454);
			}
			if (code == 1) {
				Class120_Sub12_Sub11.outputStream.putByteIsaac(40);
				Class120_Sub12_Sub11.outputStream.putInt1(data3);
				Class120_Sub12_Sub11.outputStream.putShort(JagexSocket.selectedSpellComponextIndex);
				Class120_Sub12_Sub11.outputStream.putLEShort(data2);
				Class120_Sub12_Sub11.outputStream.putInt(AbstractMouseWheelHandler.selectedSpellInterfaceBitPacked);
			}
			if (code == 29) {
				final Player player = Class118.playersList[data1];
				if (player != null) {
					Class120_Sub12_Sub7.crossIndex = 0;
					IsaacCipher.crossY = Class120_Sub12_Sub36.lastClickY;
					Class120_Sub12_Sub35.crossX = js5.lastClickX;
					Class120_Sub14_Sub22.crossState = 2;
					Class120_Sub12_Sub11.outputStream.putByteIsaac(148);
					Class120_Sub12_Sub11.outputStream.putShortA(data1);
					Class120_Sub12_Sub11.outputStream.putByteA(NodeCache.heldKeys[82] ? 1 : 0);
					MapFunctionNode.setFlagPosition(TileParticleQueue.selfPlayer.walkQueueX[0], 0, 0, true, player.getSize(), data3, TileParticleQueue.selfPlayer.walkQueueZ[0], 0, player.getSize(), data2);
				}
			}
			if (code == 11) {
				Class120_Sub12_Sub11.outputStream.putByteIsaac(158);
				Class120_Sub12_Sub11.outputStream.putInt(data3);
				final JagexInterface jagexInterface = Class74.getJagexInterface(data3);
				if (jagexInterface.cs1opcodes != null && jagexInterface.cs1opcodes[0][0] == 5) {
					final int i_5_ = jagexInterface.cs1opcodes[0][1];
					if (jagexInterface.requiredValues[0] != Class2.permanentVariable[i_5_]) {
						Class2.permanentVariable[i_5_] = jagexInterface.requiredValues[0];
						Class120_Sub14_Sub15.postVarpChange(i_5_);
					}
				}
			}
			if (code == 32) {
				Class120_Sub12_Sub35.crossX = js5.lastClickX;
				Class120_Sub14_Sub22.crossState = 2;
				Class120_Sub12_Sub7.crossIndex = 0;
				IsaacCipher.crossY = Class120_Sub12_Sub36.lastClickY;
				Class120_Sub12_Sub11.outputStream.putByteIsaac(159);
				Class120_Sub12_Sub11.outputStream.putLEShortA(data2 - -GameEntity.currentBaseX);
				Class120_Sub12_Sub11.outputStream.putShort(LightType.currentBaseZ + data3);
				Class120_Sub12_Sub11.outputStream.putByte(NodeCache.heldKeys[82] ? 1 : 0);
				Class120_Sub12_Sub11.outputStream.putLEShortA((int) (data1AsLong >>> 32) & 0x7fffffff);
				SpotAnimationNode.method1437(data3, data1AsLong, data2);
			}
			if (code == 39) {
				final Npc npc = Class120_Sub12_Sub11.npcList[data1];
				if (npc != null) {
					Class120_Sub12_Sub35.crossX = js5.lastClickX;
					IsaacCipher.crossY = Class120_Sub12_Sub36.lastClickY;
					Class120_Sub12_Sub7.crossIndex = 0;
					Class120_Sub14_Sub22.crossState = 2;
					Class120_Sub12_Sub11.outputStream.putByteIsaac(245);
					Class120_Sub12_Sub11.outputStream.putShort(data1);
					Class120_Sub12_Sub11.outputStream.putByteS(NodeCache.heldKeys[82] ? 1 : 0);
					MapFunctionNode.setFlagPosition(TileParticleQueue.selfPlayer.walkQueueX[0], 0, 0, true, npc.getSize(), data3, TileParticleQueue.selfPlayer.walkQueueZ[0], 0, npc.getSize(), data2);
				}
			}
			if (code == 15) {
				Class120_Sub12_Sub11.outputStream.putByteIsaac(58);
				Class120_Sub12_Sub11.outputStream.putShort(data1);
				Class120_Sub12_Sub11.outputStream.putInt2(data3);
				Class120_Sub12_Sub11.outputStream.putShort(ParticleEmitter.selectedObjSlot);
				Class120_Sub12_Sub11.outputStream.putShort(data2);
				Class120_Sub12_Sub11.outputStream.putShortA(ProjectileNode.selectedObjId);
				Class120_Sub12_Sub11.outputStream.putInt2(PlainTile.selectedObjInterface);
				Class69_Sub2.anInt2236 = 0;
				MagnetType.aClass189_256 = Class74.getJagexInterface(data3);
				Huffman.anInt1204 = data2;
			}
			if (code == 57) {
				final JagexInterface jagexInterface = Class74.getJagexInterface(data3);
				boolean bool = true;
				if (jagexInterface.clientCode > 0) {
					bool = IntegerNode.method1833(jagexInterface);
				}
				if (bool) {
					Class120_Sub12_Sub11.outputStream.putByteIsaac(158);
					Class120_Sub12_Sub11.outputStream.putInt(data3);
				}
			}
			if (code == 30) {
				Class120_Sub12_Sub11.outputStream.putByteIsaac(81);
				Class120_Sub12_Sub11.outputStream.putLEShort(data2);
				Class120_Sub12_Sub11.outputStream.putLEShortA(data1);
				Class120_Sub12_Sub11.outputStream.putLEInt(data3);
				Class69_Sub2.anInt2236 = 0;
				MagnetType.aClass189_256 = Class74.getJagexInterface(data3);
				Huffman.anInt1204 = data2;
			}
			if (code == 14) {
				final Player player = Class118.playersList[data1];
				if (player != null) {
					Class120_Sub14_Sub22.crossState = 2;
					IsaacCipher.crossY = Class120_Sub12_Sub36.lastClickY;
					Class120_Sub12_Sub7.crossIndex = 0;
					Class120_Sub12_Sub35.crossX = js5.lastClickX;
					Class120_Sub12_Sub11.outputStream.putByteIsaac(77);
					Class120_Sub12_Sub11.outputStream.putLEShort(data1);
					Class120_Sub12_Sub11.outputStream.putByteS(NodeCache.heldKeys[82] ? 1 : 0);
					MapFunctionNode.setFlagPosition(TileParticleQueue.selfPlayer.walkQueueX[0], 0, 0, true, player.getSize(), data3, TileParticleQueue.selfPlayer.walkQueueZ[0], 0, player.getSize(), data2);
				}
			}
			if (code == 26) {
				if (data1 != 0) {
					if (data1 == 1) {
						if (Class86.staffLevel <= 0 || !NodeCache.heldKeys[82] || !NodeCache.heldKeys[81]) {
							Class53_Sub1.method464(1, data2, data3);
							Class120_Sub12_Sub11.outputStream.putByte(FileSystem.minimapClickX);// 1
							Class120_Sub12_Sub11.outputStream.putByte(Class53_Sub1.minimapClickY);// 2
							Class120_Sub12_Sub11.outputStream.putShort((int) DummyOutputStream.cameraYaw);// 4
							Class120_Sub12_Sub11.outputStream.putByte(57);// 5
							Class120_Sub12_Sub11.outputStream.putByte(69);// 6 deleted
							Class120_Sub12_Sub11.outputStream.putByte(68);// 7 deleted
							Class120_Sub12_Sub11.outputStream.putByte(89);// 8
							Class120_Sub12_Sub11.outputStream.putShort(TileParticleQueue.selfPlayer.x);// 10
							Class120_Sub12_Sub11.outputStream.putShort(TileParticleQueue.selfPlayer.z);// 12
							Class120_Sub12_Sub11.outputStream.putByte(0);// 13
							Class120_Sub12_Sub11.outputStream.putByte(63);// 14
							MapFunctionNode.setFlagPosition(TileParticleQueue.selfPlayer.walkQueueX[0], 0, 0, true, 0, data3, TileParticleQueue.selfPlayer.walkQueueZ[0], 0, 0, data2);
						} else {
							ParticleNode.tele(data2 + GameEntity.currentBaseX, data3 + LightType.currentBaseZ, Class173.gameLevel);
						}
					}
				} else {
					Class120_Sub12_Sub20.method1302(Class173.gameLevel, data2, data3);
				}
			}
			if (code == 9) {
				Node.deselectSpell();
				final JagexInterface jagexInterface = Class74.getJagexInterface(data3);
				ParticleEmitter.selectedObjSlot = data2;
				Light.objSelected = 1;
				PlainTile.selectedObjInterface = data3;
				ProjectileNode.selectedObjId = data1;
				InterfaceClickMask.redrawInterface(jagexInterface);
				Class192.selectedObjName = "<col=ff9040>" + ObjType.list(data1).name + "<col=ffffff>";
				if (Class192.selectedObjName == null) {
					Class192.selectedObjName = "null";
				}
			} else {
				if (code == 1012 || code == 1002 || code == 1008 || code == 1003 || code == 1011) {
					Class38.handleMapFunctionAction(data1, code, data2);
				}
				if (code == 48) {
					Class120_Sub12_Sub35.crossX = js5.lastClickX;
					Class120_Sub14_Sub22.crossState = 2;
					Class120_Sub12_Sub7.crossIndex = 0;
					IsaacCipher.crossY = Class120_Sub12_Sub36.lastClickY;
					Class120_Sub12_Sub11.outputStream.putByteIsaac(28);
					Class120_Sub12_Sub11.outputStream.putLEShortA(data3 + LightType.currentBaseZ);
					Class120_Sub12_Sub11.outputStream.putInt(AbstractMouseWheelHandler.selectedSpellInterfaceBitPacked);
					Class120_Sub12_Sub11.outputStream.putLEShort(JagexSocket.selectedSpellComponextIndex);
					Class120_Sub12_Sub11.outputStream.putShort(data1);
					Class120_Sub12_Sub11.outputStream.putLEShort(data2 - -GameEntity.currentBaseX);
					Class120_Sub12_Sub11.outputStream.putByteS(NodeCache.heldKeys[82] ? 1 : 0);
					MapFunctionNode.setFlagPosition(TileParticleQueue.selfPlayer.walkQueueX[0], 0, 0, true, 0, data3, TileParticleQueue.selfPlayer.walkQueueZ[0], 0, 0, data2);
				}
				if (code == 5) {
					final Player player = Class118.playersList[data1];
					if (player != null) {
						Class120_Sub14_Sub22.crossState = 2;
						Class120_Sub12_Sub35.crossX = js5.lastClickX;
						IsaacCipher.crossY = Class120_Sub12_Sub36.lastClickY;
						Class120_Sub12_Sub7.crossIndex = 0;
						Class120_Sub12_Sub11.outputStream.putByteIsaac(224);
						Class120_Sub12_Sub11.outputStream.putShortA(data1);
						Class120_Sub12_Sub11.outputStream.putShort(JagexSocket.selectedSpellComponextIndex);
						Class120_Sub12_Sub11.outputStream.putLEInt(AbstractMouseWheelHandler.selectedSpellInterfaceBitPacked);
						Class120_Sub12_Sub11.outputStream.putByteS(NodeCache.heldKeys[82] ? 1 : 0);
						MapFunctionNode.setFlagPosition(TileParticleQueue.selfPlayer.walkQueueX[0], 0, 0, true, player.getSize(), data3, TileParticleQueue.selfPlayer.walkQueueZ[0], 0, player.getSize(), data2);
					}
				}
				if (code == 37) {
					Class120_Sub12_Sub7.crossIndex = 0;
					Class120_Sub14_Sub22.crossState = 2;
					IsaacCipher.crossY = Class120_Sub12_Sub36.lastClickY;
					Class120_Sub12_Sub35.crossX = js5.lastClickX;
					Class120_Sub12_Sub11.outputStream.putByteIsaac(48);
					Class120_Sub12_Sub11.outputStream.putShort(GameEntity.currentBaseX + data2);
					Class120_Sub12_Sub11.outputStream.putShortA((int) (data1AsLong >>> 32) & 0x7fffffff);
					Class120_Sub12_Sub11.outputStream.putByteS(NodeCache.heldKeys[82] ? 1 : 0);
					Class120_Sub12_Sub11.outputStream.putShort(LightType.currentBaseZ + data3);
					SpotAnimationNode.method1437(data3, data1AsLong, data2);
				}
				if (code == 34) {
					final JagexInterface jagexInterface = JagexInterface.getComponent(data3, data2);
					if (jagexInterface != null) {
						Node.deselectSpell();
						final InterfaceClickMask interfaceClickMask = client.getClickMask(jagexInterface);
						MouseRecorder.selectSpell(interfaceClickMask.method1685(), interfaceClickMask.paramId, jagexInterface.cursorId, data2, jagexInterface.targetCursorId, data3);
						Light.objSelected = 0;
						Class101.selectedSpellPrefix = Class33.getSpellPrefix(jagexInterface);
						if (Class101.selectedSpellPrefix == null) {
							Class101.selectedSpellPrefix = "Null";
						}
						if (jagexInterface.newFormat) {
							Light.selectedSpellName = jagexInterface.spellNameni + "<col=ffffff>";
						} else {
							Light.selectedSpellName = "<col=00ff00>" + jagexInterface.spellNameoi + "<col=ffffff>";
						}
					}
				} else {
					if (code == 49) {
						Class120_Sub12_Sub11.outputStream.putByteIsaac(145);
						Class120_Sub12_Sub11.outputStream.putShortA(data2);
						Class120_Sub12_Sub11.outputStream.putInt2(data3);
						Class120_Sub12_Sub11.outputStream.putShortA(data1);
						Class69_Sub2.anInt2236 = 0;
						MagnetType.aClass189_256 = Class74.getJagexInterface(data3);
						Huffman.anInt1204 = data2;
					}
					if (code == 58) {
						Class120_Sub12_Sub11.outputStream.putByteIsaac(214);
						Class120_Sub12_Sub11.outputStream.putLEShortA(data2);
						Class120_Sub12_Sub11.outputStream.putShortA(data1);
						Class120_Sub12_Sub11.outputStream.putInt(data3);
						Class69_Sub2.anInt2236 = 0;
						MagnetType.aClass189_256 = Class74.getJagexInterface(data3);
						Huffman.anInt1204 = data2;
					}
					if (code == 8) {
						final Npc npc = Class120_Sub12_Sub11.npcList[data1];
						if (npc != null) {
							Class120_Sub12_Sub35.crossX = js5.lastClickX;
							Class120_Sub14_Sub22.crossState = 2;
							Class120_Sub12_Sub7.crossIndex = 0;
							IsaacCipher.crossY = Class120_Sub12_Sub36.lastClickY;
							Class120_Sub12_Sub11.outputStream.putByteIsaac(12);
							Class120_Sub12_Sub11.outputStream.putLEShort(data1);
							Class120_Sub12_Sub11.outputStream.putByte(NodeCache.heldKeys[82] ? 1 : 0);
							MapFunctionNode.setFlagPosition(TileParticleQueue.selfPlayer.walkQueueX[0], 0, 0, true, npc.getSize(), data3, TileParticleQueue.selfPlayer.walkQueueZ[0], 0, npc.getSize(), data2);
						}
					}
					if (code == 35) {
						Class120_Sub12_Sub11.outputStream.putByteIsaac(103);
						Class120_Sub12_Sub11.outputStream.putInt1(data3);
						Class120_Sub12_Sub11.outputStream.putLEShort(data2);
						Class120_Sub12_Sub11.outputStream.putShort(data1);
						Class69_Sub2.anInt2236 = 0;
						MagnetType.aClass189_256 = Class74.getJagexInterface(data3);
						Huffman.anInt1204 = data2;
					}
					if (code == 43) {
						final Player player = Class118.playersList[data1];
						if (player != null) {
							IsaacCipher.crossY = Class120_Sub12_Sub36.lastClickY;
							Class120_Sub12_Sub35.crossX = js5.lastClickX;
							Class120_Sub12_Sub7.crossIndex = 0;
							Class120_Sub14_Sub22.crossState = 2;
							Class120_Sub12_Sub11.outputStream.putByteIsaac(212);
							Class120_Sub12_Sub11.outputStream.putShortA(data1);
							Class120_Sub12_Sub11.outputStream.putByteA(NodeCache.heldKeys[82] ? 1 : 0);
							MapFunctionNode.setFlagPosition(TileParticleQueue.selfPlayer.walkQueueX[0], 0, 0, true, player.getSize(), data3, TileParticleQueue.selfPlayer.walkQueueZ[0], 0, player.getSize(), data2);
						}
					}
					if (code == 16) {
						IsaacCipher.crossY = Class120_Sub12_Sub36.lastClickY;
						Class120_Sub14_Sub22.crossState = 2;
						Class120_Sub12_Sub35.crossX = js5.lastClickX;
						Class120_Sub12_Sub7.crossIndex = 0;
						Class120_Sub12_Sub11.outputStream.putByteIsaac(116);
						Class120_Sub12_Sub11.outputStream.putShort(ParticleEmitter.selectedObjSlot);
						Class120_Sub12_Sub11.outputStream.putLEShortA(data2 - -GameEntity.currentBaseX);
						Class120_Sub12_Sub11.outputStream.putLEShortA((int) (data1AsLong >>> 32) & 0x7fffffff);
						Class120_Sub12_Sub11.outputStream.putLEInt(PlainTile.selectedObjInterface);
						Class120_Sub12_Sub11.outputStream.putByteC(NodeCache.heldKeys[82] ? 1 : 0);
						Class120_Sub12_Sub11.outputStream.putLEShort(LightType.currentBaseZ + data3);
						Class120_Sub12_Sub11.outputStream.putLEShort(ProjectileNode.selectedObjId);
						SpotAnimationNode.method1437(data3, data1AsLong, data2);
					}
					if (code == 44) {
						IsaacCipher.crossY = Class120_Sub12_Sub36.lastClickY;
						Class120_Sub12_Sub35.crossX = js5.lastClickX;
						Class120_Sub12_Sub7.crossIndex = 0;
						Class120_Sub14_Sub22.crossState = 2;
						Class120_Sub12_Sub11.outputStream.putByteIsaac(3);
						Class120_Sub12_Sub11.outputStream.putByteC(NodeCache.heldKeys[82] ? 1 : 0);
						Class120_Sub12_Sub11.outputStream.putLEShort(LightType.currentBaseZ + data3);
						Class120_Sub12_Sub11.outputStream.putLEShort(data1);
						Class120_Sub12_Sub11.outputStream.putShortA(data2 + GameEntity.currentBaseX);
						MapFunctionNode.setFlagPosition(TileParticleQueue.selfPlayer.walkQueueX[0], 0, 0, true, 0, data3, TileParticleQueue.selfPlayer.walkQueueZ[0], 0, 0, data2);
					}
					if (code == 23 || code == 1009) {
						//23 are 0-4 actions
						//1009 are 5-9 actions.
						Class120_Sub14_Sub22.method1629(data3, data2, data1, Class120_Sub12_Sub29.menuOptionSuffix[option]);
					}
					if (code == 1010) {
						Class120_Sub12_Sub7.crossIndex = 0;
						Class120_Sub14_Sub22.crossState = 2;
						IsaacCipher.crossY = Class120_Sub12_Sub36.lastClickY;
						Class120_Sub12_Sub35.crossX = js5.lastClickX;
						final Npc npc = Class120_Sub12_Sub11.npcList[data1];
						if (npc != null) {
							NpcType npcType = npc.npcType;
							if (npcType.transmogrificationIds != null) {
								npcType = npcType.handleVarp();
							}
							if (npcType != null) {
								Class120_Sub12_Sub11.outputStream.putByteIsaac(65);
								Class120_Sub12_Sub11.outputStream.putLEShort(npcType.myId);
							}
						}
					}
					if (code == 7) {
						Class90.removeOverridedInterfaces();
					}
					if (code == 1005) {
						IsaacCipher.crossY = Class120_Sub12_Sub36.lastClickY;
						Class120_Sub14_Sub22.crossState = 2;
						Class120_Sub12_Sub35.crossX = js5.lastClickX;
						Class120_Sub12_Sub7.crossIndex = 0;
						Class120_Sub12_Sub11.outputStream.putByteIsaac(60);
						Class120_Sub12_Sub11.outputStream.putShortA(data3 + LightType.currentBaseZ);
						Class120_Sub12_Sub11.outputStream.putLEShort((int) (data1AsLong >>> 32) & 0x7fffffff);
						Class120_Sub12_Sub11.outputStream.putByte(NodeCache.heldKeys[82] ? 1 : 0);
						Class120_Sub12_Sub11.outputStream.putLEShort(GameEntity.currentBaseX + data2);
						SpotAnimationNode.method1437(data3, data1AsLong, data2);
					}
					if (code == 41) {
						Class120_Sub14_Sub22.crossState = 2;
						Class120_Sub12_Sub7.crossIndex = 0;
						Class120_Sub12_Sub35.crossX = js5.lastClickX;
						IsaacCipher.crossY = Class120_Sub12_Sub36.lastClickY;
						Class120_Sub12_Sub11.outputStream.putByteIsaac(92);
						Class120_Sub12_Sub11.outputStream.putByteS(NodeCache.heldKeys[82] ? 1 : 0);
						Class120_Sub12_Sub11.outputStream.putLEShort((int) (data1AsLong >>> 32) & 0x7fffffff);
						Class120_Sub12_Sub11.outputStream.putShortA(data2 + GameEntity.currentBaseX);
						Class120_Sub12_Sub11.outputStream.putShortA(data3 - -LightType.currentBaseZ);
						SpotAnimationNode.method1437(data3, data1AsLong, data2);
					}
					if (code == 50) {
						Class120_Sub12_Sub11.outputStream.putByteIsaac(177);
						Class120_Sub12_Sub11.outputStream.putInt1(data3);
						Class120_Sub12_Sub11.outputStream.putShort(data1);
						Class120_Sub12_Sub11.outputStream.putLEInt(AbstractMouseWheelHandler.selectedSpellInterfaceBitPacked);
						Class120_Sub12_Sub11.outputStream.putLEShort(data2);
						Class120_Sub12_Sub11.outputStream.putLEShort(JagexSocket.selectedSpellComponextIndex);
						Class69_Sub2.anInt2236 = 0;
						MagnetType.aClass189_256 = Class74.getJagexInterface(data3);
						Huffman.anInt1204 = data2;
					}
					if (code == 20) {
						Class120_Sub12_Sub11.outputStream.putByteIsaac(124);
						Class120_Sub12_Sub11.outputStream.putLEShortA(data2);
						Class120_Sub12_Sub11.outputStream.putLEShortA(data1);
						Class120_Sub12_Sub11.outputStream.putLEInt(data3);
						Class69_Sub2.anInt2236 = 0;
						MagnetType.aClass189_256 = Class74.getJagexInterface(data3);
						Huffman.anInt1204 = data2;
					}
					if (code == 2) {
						Class120_Sub12_Sub11.outputStream.putByteIsaac(205);
						Class120_Sub12_Sub11.outputStream.putInt1(data3);
						Class120_Sub12_Sub11.outputStream.putLEShort(data2);
						Class120_Sub12_Sub11.outputStream.putShortA(data1);
						Class69_Sub2.anInt2236 = 0;
						MagnetType.aClass189_256 = Class74.getJagexInterface(data3);
						Huffman.anInt1204 = data2;
					}
					if (code == 45) {
						Class120_Sub14_Sub22.crossState = 2;
						Class120_Sub12_Sub35.crossX = js5.lastClickX;
						IsaacCipher.crossY = Class120_Sub12_Sub36.lastClickY;
						Class120_Sub12_Sub7.crossIndex = 0;
						Class120_Sub12_Sub11.outputStream.putByteIsaac(54);
						Class120_Sub12_Sub11.outputStream.putByte(NodeCache.heldKeys[82] ? 1 : 0);
						Class120_Sub12_Sub11.outputStream.putLEShort(LightType.currentBaseZ + data3);
						Class120_Sub12_Sub11.outputStream.putShort(data1);
						Class120_Sub12_Sub11.outputStream.putShort(data2 + GameEntity.currentBaseX);
						MapFunctionNode.setFlagPosition(TileParticleQueue.selfPlayer.walkQueueX[0], 0, 0, true, 0, data3, TileParticleQueue.selfPlayer.walkQueueZ[0], 0, 0, data2);
					}
					if (code == 22) {
						final Player player = Class118.playersList[data1];
						if (player != null) {
							IsaacCipher.crossY = Class120_Sub12_Sub36.lastClickY;
							Class120_Sub14_Sub22.crossState = 2;
							Class120_Sub12_Sub35.crossX = js5.lastClickX;
							Class120_Sub12_Sub7.crossIndex = 0;
							Class120_Sub12_Sub11.outputStream.putByteIsaac(96);
							Class120_Sub12_Sub11.outputStream.putByteA(NodeCache.heldKeys[82] ? 1 : 0);
							Class120_Sub12_Sub11.outputStream.putShort(data1);
							MapFunctionNode.setFlagPosition(TileParticleQueue.selfPlayer.walkQueueX[0], 0, 0, true, player.getSize(), data3, TileParticleQueue.selfPlayer.walkQueueZ[0], 0, player.getSize(), data2);
						}
					}
					if (code == 60) {
						final Player player = Class118.playersList[data1];
						if (player != null) {
							Class120_Sub14_Sub22.crossState = 2;
							Class120_Sub12_Sub7.crossIndex = 0;
							Class120_Sub12_Sub35.crossX = js5.lastClickX;
							IsaacCipher.crossY = Class120_Sub12_Sub36.lastClickY;
							Class120_Sub12_Sub11.outputStream.putByteIsaac(223);
							Class120_Sub12_Sub11.outputStream.putByte(NodeCache.heldKeys[82] ? 1 : 0);
							Class120_Sub12_Sub11.outputStream.putLEShortA(data1);
							MapFunctionNode.setFlagPosition(TileParticleQueue.selfPlayer.walkQueueX[0], 0, 0, true, player.getSize(), data3, TileParticleQueue.selfPlayer.walkQueueZ[0], 0, player.getSize(), data2);
						}
					}
					if (code == 1001) {
						final JagexInterface jagexInterface = Class74.getJagexInterface(data3);
						if (jagexInterface == null || 100000 > jagexInterface.objAmounts[data2]) {
							Class120_Sub12_Sub11.outputStream.putByteIsaac(72);
							Class120_Sub12_Sub11.outputStream.putShort(data1);
						} else {
							AbstractRequest.pushMessage(new StringBuilder(String.valueOf(jagexInterface.objAmounts[data2])).append(" x ").append(ObjType.list(data1).name).toString(), "", 0);
						}
						Class69_Sub2.anInt2236 = 0;
						MagnetType.aClass189_256 = Class74.getJagexInterface(data3);
						Huffman.anInt1204 = data2;
					}
					if (code == 18) {
						Class120_Sub12_Sub11.outputStream.putByteIsaac(158);
						Class120_Sub12_Sub11.outputStream.putInt(data3);
						final JagexInterface jagexInterface = Class74.getJagexInterface(data3);
						if (jagexInterface.cs1opcodes != null && jagexInterface.cs1opcodes[0][0] == 5) {
							final int i_6_ = jagexInterface.cs1opcodes[0][1];
							Class2.permanentVariable[i_6_] = -Class2.permanentVariable[i_6_] + 1;
							Class120_Sub14_Sub15.postVarpChange(i_6_);
						}
					}
					if (code == 38) {
						Class120_Sub12_Sub7.crossIndex = 0;
						Class120_Sub14_Sub22.crossState = 2;
						IsaacCipher.crossY = Class120_Sub12_Sub36.lastClickY;
						Class120_Sub12_Sub35.crossX = js5.lastClickX;
						Class120_Sub12_Sub11.outputStream.putByteIsaac(8);
						Class120_Sub12_Sub11.outputStream.putLEShortA(data1);
						Class120_Sub12_Sub11.outputStream.putShort(data3 + LightType.currentBaseZ);
						Class120_Sub12_Sub11.outputStream.putShort(GameEntity.currentBaseX + data2);
						Class120_Sub12_Sub11.outputStream.putByteA(NodeCache.heldKeys[82] ? 1 : 0);
						MapFunctionNode.setFlagPosition(TileParticleQueue.selfPlayer.walkQueueX[0], 0, 0, true, 0, data3, TileParticleQueue.selfPlayer.walkQueueZ[0], 0, 0, data2);
					}
					if (Light.objSelected != 0) {
						Light.objSelected = 0;
						InterfaceClickMask.redrawInterface(Class74.getJagexInterface(PlainTile.selectedObjInterface));
					}
					if (Class88.spellSelected) {
						Node.deselectSpell();
					}
					if (MagnetType.aClass189_256 != null && Class69_Sub2.anInt2236 == 0) {
						InterfaceClickMask.redrawInterface(MagnetType.aClass189_256);
					}
				}
			}
		}
	}

	static final void setVisibleLevels(final boolean bool) {
		client.allVisibleLevels = bool;
		Class120_Sub12_Sub26.aBoolean3326 = !Class143_Sub1.method2021();
	}

	@Override
	public final AppletContext getAppletContext() {
		if (Class112.frame != null) {
			return null;
		}
		if (NpcType.gameSignlink != null && NpcType.gameSignlink.gameApplet != this) {
			return NpcType.gameSignlink.gameApplet.getAppletContext();
		}
		return super.getAppletContext();
	}

	private final void mainLoopWrapper() {
		final long currentTime = TimeUtil.getSafeTime();
		final long oldTime = Class120_Sub12_Sub26.mainLoopTimeCache[AbstractGraphicsBuffer.gameLoopLength];
		if (oldTime == 0) {
			/* empty */
		}
		Class120_Sub12_Sub26.mainLoopTimeCache[AbstractGraphicsBuffer.gameLoopLength] = currentTime;
		AbstractGraphicsBuffer.gameLoopLength = AbstractGraphicsBuffer.gameLoopLength + 1 & 0x1f;
		synchronized (this) {
			DummyInputStream.focus = Class120_Sub12_Sub21_Sub1.focusIn;
		}
		mainLoop();
	}

	static final void constructSprites(final js5 js5) {
		Class69_Sub2.hitMarkSprites = Class125.constructTransparentSprites(js5, AmbientSound.hitmarksId, 0);
		SeqType.hitBarDefaultSprites = Class125.constructTransparentSprites(js5, Class120_Sub12_Sub25.hitbardefaultId, 0);
		Class54.pkIconSprites = Class125.constructTransparentSprites(js5, Class120_Sub14_Sub15.headiconspkId, 0);
		FileSystemRequest.prayerIconSprites = Class125.constructTransparentSprites(js5, MasterIndexInfo.headiconsprayerId, 0);
		AnimatedLocation.hintHeadIconsSprites = Class125.constructTransparentSprites(js5, Class120_Sub21.hintheadiconsId, 0);
		Class120_Sub12_Sub5.hintMapMarkerSprites = Class125.constructTransparentSprites(js5, Class173.hintmapmarkersId, 0);
		Class101_Sub1.mapFlagSprites = Class167.constructSprites(js5, ModelParticleMagnet.mapflagId, 0);
		Class120_Sub12_Sub30.crossSprites = Class167.constructSprites(js5, Class132_Sub2.crossId, 0);
		Class120_Sub12_Sub6.mapDotSprites = Class167.constructSprites(js5, MapFunctionType.mapdotsId, 0);
		Class118.scrollBarSprites = Class120_Sub12_Sub3.constructIndexedSprites(js5, Class134.scrollbarId, 0);
		Class82.nameIconSprites = Class120_Sub12_Sub3.constructIndexedSprites(js5, Class81.nameiconsId, 0);
		ObjectCache.smallFont.setNameIcons(Class82.nameIconSprites, null);
		Class120_Sub12_Sub20.plainFont.setNameIcons(Class82.nameIconSprites, null);
		Class120_Sub12_Sub22.boldFont.setNameIcons(Class82.nameIconSprites, null);
		if (HDToolkit.glEnabled) {
			ShadowManager.floorshadowSprites = InterfaceChangeNode.constructLDIndexedSprites(js5, Class120_Sub12_Sub7.floorshadowsId);
			for (final LDIndexedSprite element : ShadowManager.floorshadowSprites) {
				element.method923();
			}
		}
		final LDSprite compassSprite = Class120_Sub14_Sub13.constructLDSprite(js5, Class9.compassId, 0);
		compassSprite.method1615();
		if (!HDToolkit.glEnabled) {
			Class157.compassSprite = compassSprite;
		} else {
			Class157.compassSprite = new HDSprite(compassSprite);
		}
		final LDSprite[] hintmapedges = Class115.constructLDSprites(js5, PlayerAppearance.hintmapedgeId, 0);
		for (int id = 0; id < hintmapedges.length; id++) {
			hintmapedges[id].method1615();
		}
		if (!HDToolkit.glEnabled) {
			Class69_Sub2.hintMapEdgeSprites = hintmapedges;
		} else {
			Class69_Sub2.hintMapEdgeSprites = new AbstractSprite[hintmapedges.length];
			for (int id = 0; id < hintmapedges.length; id++) {
				Class69_Sub2.hintMapEdgeSprites[id] = new HDSprite(hintmapedges[id]);
			}
		}
	}

	@Override
	public final URL getDocumentBase() {
		if (Class112.frame != null) {
			return null;
		}
		if (NpcType.gameSignlink != null && NpcType.gameSignlink.gameApplet != this) {
			return NpcType.gameSignlink.gameApplet.getDocumentBase();
		}
		return super.getDocumentBase();
	}

	@Override
	public final void windowClosed(final WindowEvent windowevent) {
		/* empty */
	}

	public static final void providesignlink(final Signlink signlink) {
		Class120_Sub12_Sub18.errorSignlink = NpcType.gameSignlink = signlink;
	}

	@Override
	public final void focusGained(final FocusEvent focusevent) {
		Class120_Sub12_Sub21_Sub1.focusIn = true;
		Class120_Sub12_Sub26.fullRedraw = true;
	}

	final synchronized void addCanvas() {
		if (Node.canvas != null) {
			Node.canvas.removeFocusListener(this);
			Node.canvas.getParent().remove(Node.canvas);
		}
		Container container;
		if (QuickChatMessageType.fullscreenFrame != null) {
			container = QuickChatMessageType.fullscreenFrame;
		} else if (Class112.frame != null) {
			container = Class112.frame;
		} else {
			container = NpcType.gameSignlink.gameApplet;
		}
		container.setLayout(null);
		Node.canvas = new CanvasWrapper(this);
		container.add(Node.canvas);
		Node.canvas.setSize(Class69_Sub1.canvasWidth, Class120_Sub12_Sub5.canvasHeight);
		Node.canvas.setVisible(true);
		if (Class112.frame == container) {
			final Insets insets = Class112.frame.getInsets();
			Node.canvas.setLocation(insets.left + ReflectionCheckNode.leftMargin, WallDecoration.topMargin + insets.top);
		} else {
			Node.canvas.setLocation(ReflectionCheckNode.leftMargin, WallDecoration.topMargin);
		}
		Node.canvas.addFocusListener(this);
		Node.canvas.requestFocus();
		Class120_Sub12_Sub21_Sub1.focusIn = true;
		Class120_Sub12_Sub26.fullRedraw = true;
		LongNode.canvasReplaceRecommended = false;
		DummyInputStream.focus = true;
		Class143.lastCanvasReplace = TimeUtil.getSafeTime();
	}

	@Override
	public final void windowDeactivated(final WindowEvent windowevent) {
		/* empty */
	}

	final void error(final String string) {
		if (!alreadyErrored) {
			alreadyErrored = true;
			System.out.println("error_game_" + string);
			try {
				JSHelper.call(NpcType.gameSignlink.gameApplet, "loggedout");
			} catch (final Throwable throwable) {
				/* empty */
			}
			try {
				getAppletContext().showDocument(new URL(getCodeBase(), "error_game_" + string + ".ws"), "_top");
			} catch (final Exception exception) {
				/* empty */
			}
		}
	}

	@Override
	public final void windowIconified(final WindowEvent windowevent) {
		/* empty */
	}

	@Override
	public final synchronized void paint(final Graphics graphics) {
		if (Class31.gameApplet == this && !client.shutdown) {
			Class120_Sub12_Sub26.fullRedraw = true;
			if (Class43.usingJavaAbove5 && !HDToolkit.glEnabled && TimeUtil.getSafeTime() - Class143.lastCanvasReplace > 1000L) {
				final Rectangle rectangle = graphics.getClipBounds();
				if (rectangle == null || rectangle.width >= Class120_Sub12_Sub7.frameWidth && PlayerAppearance.frameHeight <= rectangle.height) {
					LongNode.canvasReplaceRecommended = true;
				}
			}
		}
	}

	final boolean checkHost() {
		String host = getDocumentBase().getHost().toLowerCase();
		if (host.equals("jagex.com") || host.endsWith(".jagex.com")) {
			return true;
		}
		if (host.equals("runescape.com") || host.endsWith(".runescape.com")) {
			return true;
		}
		if (host.endsWith("127.0.0.1")) {
			return true;
		}
		for (/**/; host.length() > 0 && host.charAt(-1 + host.length()) >= '0' && host.charAt(host.length() + -1) <= '9'; host = host.substring(0, -1 + host.length())) {
			/* empty */
		}
		if (host.endsWith("192.168.1.")) {
			return true;
		}
		error("invalidhost");
		return false;
	}

	abstract void method39();

	abstract void method40();

	@Override
	public final void windowOpened(final WindowEvent windowevent) {
		/* empty */
	}

	@Override
	public final void start() {
		if (Class31.gameApplet == this && !client.shutdown) {
			IntegerNode.killtime = 0L;
		}
	}

	@Override
	public final URL getCodeBase() {
		if (Class112.frame != null) {
			return null;
		}
		if (NpcType.gameSignlink != null && NpcType.gameSignlink.gameApplet != this) {
			return NpcType.gameSignlink.gameApplet.getCodeBase();
		}
		return super.getCodeBase();
	}

	private final void mainRedrawWrapper() {
		final long newTime = TimeUtil.getSafeTime();
		final long oldTime = mainRedrawCache[Class96.mainRedrawCachePos];
		mainRedrawCache[Class96.mainRedrawCachePos] = newTime;
		Class96.mainRedrawCachePos = Class96.mainRedrawCachePos + 1 & 0x1f;
		if (oldTime != 0 && oldTime < newTime) {
			final int timeDelta = (int) (newTime - oldTime);
			//System.out.println(timeDelta+" "+newTime+":"+oldTime);
			MapFunctionType.fps = ((timeDelta >> 1) + 32000) / timeDelta;
		}
		if (ObjectContainer.canvasRefreshCycle++ > 50) {
			ObjectContainer.canvasRefreshCycle -= 50;
			Class120_Sub12_Sub26.fullRedraw = true;
			Node.canvas.setSize(Class69_Sub1.canvasWidth, Class120_Sub12_Sub5.canvasHeight);
			Node.canvas.setVisible(true);
			if (Class112.frame != null && QuickChatMessageType.fullscreenFrame == null) {
				final Insets insets = Class112.frame.getInsets();
				Node.canvas.setLocation(insets.left + ReflectionCheckNode.leftMargin, WallDecoration.topMargin + insets.top);
			} else {
				Node.canvas.setLocation(ReflectionCheckNode.leftMargin, WallDecoration.topMargin);
			}
		}
		mainRedraw();
	}

	@Override
	public final void stop() {
		if (Class31.gameApplet == this && !client.shutdown) {
			IntegerNode.killtime = TimeUtil.getSafeTime() - -4000L;
		}
	}

	@Override
	public final void windowClosing(final WindowEvent windowevent) {
		destroy();
	}

	private final void shutdownApplet(final boolean isClean) {
		synchronized (this) {
			if (client.shutdown) {
				return;
			}
			client.shutdown = true;
		}
		if (NpcType.gameSignlink.gameApplet != null) {
			NpcType.gameSignlink.gameApplet.destroy();
		}
		try {
			method39();
		} catch (final Exception exception) {
			/* empty */
		}
		if (jagmiscLoaded) {
			try {
				jagmisc.quit();
			} catch (final Throwable throwable) {
				/* empty */
			}
			jagmiscLoaded = false;
		}
		NpcType.gameSignlink.finalizeNatives(Class31.gameApplet.getClass());
		if (Node.canvas != null) {
			try {
				Node.canvas.removeFocusListener(this);
				Node.canvas.getParent().remove(Node.canvas);
			} catch (final Exception exception) {
				/* empty */
			}
		}
		if (NpcType.gameSignlink != null) {
			try {
				NpcType.gameSignlink.method1971();
			} catch (final Exception exception) {
				/* empty */
			}
		}
		method40();
		if (Class112.frame != null) {
			try {
				System.exit(0);
			} catch (final Throwable throwable) {
				/* empty */
			}
		}
		System.out.println(new StringBuilder("Shutdown complete - clean:").append(isClean).toString());
	}

	static final void method43(final int i) {
		final InterfaceChangeNode class120_sub14_sub7 = InterfaceChangeNode.putInterfaceChange(9, i);
		class120_sub14_sub7.method1453();
	}

	@Override
	public abstract void init();

	final void startApplet(final int i, final int i_13_, final int height, final int width) {
		try {
			if (Class31.gameApplet != null) {
				Class65.loadAttempts++;
				if (Class65.loadAttempts >= 3) {
					error("alreadyloaded");
				} else {
					getAppletContext().showDocument(getDocumentBase(), "_self");
				}
				return;
			}
			ReflectionCheckNode.leftMargin = 0;
			Class31.gameApplet = this;
			WallDecoration.topMargin = 0;
			Class120_Sub12_Sub7.frameWidth = Class69_Sub1.canvasWidth = width;
			DisplayModeInfo.revision = i;
			PlayerAppearance.frameHeight = Class120_Sub12_Sub5.canvasHeight = height;
			final String string = getParameter("openwinjs");
			if (string != null && string.equals("1")) {
				Class99.openwinjsEnabled = true;
			} else {
				Class99.openwinjsEnabled = false;
			}
			if (NpcType.gameSignlink == null) {
				Class120_Sub12_Sub18.errorSignlink = NpcType.gameSignlink = new Signlink(this, i_13_, null, 0);
			}
			final SignlinkNode signlinkNode = NpcType.gameSignlink.startThread(this, 1);
			while (signlinkNode.status == 0) {
				PacketBuffer.sleepWrapper(10L);
			}
			JagexInterface.gameShellThread = (Thread) signlinkNode.value;
		} catch (final Exception exception) {
			SpotAnimation.method2312(exception, null);
			error("crash");
		}
	}

	@Override
	public final void run() {
		try {
			if (Signlink.javaVendor != null) {
				final String vendor = Signlink.javaVendor.toLowerCase();
				if (vendor.indexOf("sun") != -1 || vendor.indexOf("apple") != -1) {
					final String version = Signlink.javaVersion;
					if (version.equals("1.1") || version.startsWith("1.1.") || version.equals("1.2") || version.startsWith("1.2.")) {
						error("wrongjava");
						return;
					}
					Class145.sleepModifier1 = 5;
				} else if (vendor.indexOf("ibm") != -1 && (Signlink.javaVersion == null || Signlink.javaVersion.equals("1.4.2"))) {
					error("wrongjava");
					return;
				}
			}
			if (Signlink.javaVersion != null && Signlink.javaVersion.startsWith("1.")) {
				int charId = 2;
				int javaVersion = 0;
				while (Signlink.javaVersion.length() > charId) {
					final int c = Signlink.javaVersion.charAt(charId);
					if (c < 48 || c > 57) {
						break;
					}
					charId++;
					javaVersion = 10 * javaVersion + -48 + c;
				}
				if (javaVersion >= 5) {
					Class43.usingJavaAbove5 = true;
				}
			}
			if (NpcType.gameSignlink.gameApplet != null) {
				final Method method = Signlink.setFocusCycleRootMethod;
				if (method != null) {
					try {
						method.invoke(NpcType.gameSignlink.gameApplet, new Object[] { Boolean.TRUE });
					} catch (final Throwable throwable) {
						/* empty */
					}
				}
			}
			VarBit.calculateMaxMemory();
			addCanvas();
			ClanMember.fullscreenGraphics = Class114.constructGraphicsBuffer(Node.canvas, Class69_Sub1.canvasWidth, Class120_Sub12_Sub5.canvasHeight);
			mainInit();
			Class101_Sub2.gameShellTimer = MasterIndexInfo.constructTimer();
			loadJagmisc();
			while (IntegerNode.killtime == 0L || TimeUtil.getSafeTime() < IntegerNode.killtime) {
				Class112.gameLoopCount = Class101_Sub2.gameShellTimer.sleep(Class145.sleepModifier1, Class120_Sub12_Sub1.sleepModifier2);
				for (int loop = 0; loop < Class112.gameLoopCount; loop++) {
					mainLoopWrapper();
				}
				mainRedrawWrapper();
			}
		} catch (final Exception exception) {
			SpotAnimation.method2312(exception, null);
			error("crash");
		}
		shutdownApplet(true);
	}

	abstract void mainRedraw();

	final void startApplication(final String gameName, final int cacheStoreId, final int revision, final int cacheIndexCount, final int width, final int height) {
		try {
			WallDecoration.topMargin = 0;
			DisplayModeInfo.revision = revision;
			PlayerAppearance.frameHeight = Class120_Sub12_Sub5.canvasHeight = height;
			Class120_Sub12_Sub7.frameWidth = Class69_Sub1.canvasWidth = width;
			Class31.gameApplet = this;
			ReflectionCheckNode.leftMargin = 0;
			Class112.frame = new Frame();
			Class112.frame.setTitle("Jagex");
			Class112.frame.setResizable(true);
			Class112.frame.addWindowListener(this);
			Class112.frame.setVisible(true);
			Class112.frame.toFront();
			final Insets insets = Class112.frame.getInsets();
			Class112.frame.setSize(insets.left + Class120_Sub12_Sub7.frameWidth + insets.right, insets.bottom + PlayerAppearance.frameHeight - -insets.top);
			Class120_Sub12_Sub18.errorSignlink = NpcType.gameSignlink = new Signlink(null, cacheStoreId, gameName, cacheIndexCount);
			final SignlinkNode signlinkNode = NpcType.gameSignlink.startThread(this, 1);
			while (signlinkNode.status == 0) {
				PacketBuffer.sleepWrapper(10L);
			}
			JagexInterface.gameShellThread = (Thread) signlinkNode.value;
		} catch (final Exception exception) {
			SpotAnimation.method2312(exception, null);
		}
	}

	static final void method47(final int i) {
		final InterfaceChangeNode class120_sub14_sub7 = InterfaceChangeNode.putInterfaceChange(5, i);
		class120_sub14_sub7.method1453();
	}

	abstract void mainInit();

	@Override
	public final void update(final Graphics graphics) {
		paint(graphics);
	}

	@Override
	public final void focusLost(final FocusEvent focusevent) {
		Class120_Sub12_Sub21_Sub1.focusIn = false;
	}

	@Override
	public final void windowActivated(final WindowEvent windowevent) {
		/* empty */
	}

	final void loadJagmisc() {
		if (!jagmiscLoaded) {
			try {
				final SignlinkNode signlinkNode = NpcType.gameSignlink.loadJagmisc(Class31.gameApplet.getClass());
				while (signlinkNode.status == 0) {
					PacketBuffer.sleepWrapper(100L);
				}
				if (signlinkNode.value != null) {
					throw (Throwable) signlinkNode.value;
				}
				jagmisc.init();
				jagmiscLoaded = true;
				Class101_Sub2.gameShellTimer = MasterIndexInfo.constructTimer();
			} catch (final Throwable throwable) {
				/* empty */
			}
		}
	}

	@Override
	public final void destroy() {
		if (Class31.gameApplet == this && !client.shutdown) {
			IntegerNode.killtime = TimeUtil.getSafeTime();
			PacketBuffer.sleepWrapper(5000L);
			Class120_Sub12_Sub18.errorSignlink = null;
			shutdownApplet(false);
		}
	}

	@Override
	public final String getParameter(final String string) {
		if (Class112.frame != null) {
			return null;
		}
		if (NpcType.gameSignlink != null && NpcType.gameSignlink.gameApplet != this) {
			return NpcType.gameSignlink.gameApplet.getParameter(string);
		}
		return super.getParameter(string);
	}
}
