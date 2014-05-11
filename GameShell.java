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
	static int anInt3;
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

	static final void method31(final byte i, final int i_0_) {
		try {
			if (i_0_ >= 0) {
				final int i_1_ = Class120_Sub12_Sub7.anIntArray3182[i_0_];
				final int i_2_ = Class120_Sub29.anIntArray2769[i_0_];
				final int i_3_ = (int) Class120_Sub12.aLongArray2562[i_0_];
				int i_4_ = Class120_Sub29.aShortArray2777[i_0_];
				final long l = Class120_Sub12.aLongArray2562[i_0_];
				if (i_4_ >= 2000) {
					i_4_ -= 2000;
				}
				if (i_4_ == 24) {
					final Player class180_sub5_sub1 = Class118.playersList[i_3_];
					if (class180_sub5_sub1 != null) {
						Class120_Sub12_Sub35.crossX = Class50.anInt449;
						GameEntity.anInt3023++;
						Class120_Sub14_Sub22.crossState = 2;
						Class120_Sub12_Sub7.crossIndex = 0;
						IsaacCipher.crossY = Class120_Sub12_Sub36.anInt3424;
						Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putPacket(52);
						Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putShort(i_3_);
						Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putByte(Class35.aBooleanArray299[82] ? 1 : 0);
						Class120_Sub14_Sub5.method1440(Class100.selfPlayer.anIntArray2958[0], 0, 0, true, class180_sub5_sub1.getSize(), i_2_, Class100.selfPlayer.anIntArray3040[0], 0, (byte) -89, class180_sub5_sub1.getSize(), i_1_);
					}
				}
				if (i_4_ == 17) {
					Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putPacket(95);
					Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putShort(i_3_);
					Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.method1086((byte) 21, i_2_);
					Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putLEShortA(i_1_);
					Class69_Sub2.anInt2236 = 0;
					Class32.aClass189_256 = Class74.method650(127, i_2_);
					Class126.anInt1204 = i_1_;
				}
				if (i_4_ == 33) {
					final Npc class180_sub5_sub2 = Class120_Sub12_Sub11.npcList[i_3_];
					if (class180_sub5_sub2 != null) {
						Class120_Sub12_Sub35.crossX = Class50.anInt449;
						Class120_Sub14_Sub22.crossState = 2;
						IsaacCipher.crossY = Class120_Sub12_Sub36.anInt3424;
						Class120_Sub12_Sub7.crossIndex = 0;
						Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putPacket(160);
						Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.method1080(!Class35.aBooleanArray299[82] ? 0 : 1, (byte) 10);
						Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.method1126((byte) -91, Class141.anInt1355);
						Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.method1115(255, i_3_);
						Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putShort(Class108_Sub1.anInt2319);
						Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putLEShortA(Class120_Sub14_Sub1.anInt3448);
						Class120_Sub14_Sub5.method1440(Class100.selfPlayer.anIntArray2958[0], 0, 0, true, class180_sub5_sub2.getSize(), i_2_, Class100.selfPlayer.anIntArray3040[0], 0, (byte) -114, class180_sub5_sub2.getSize(), i_1_);
					}
				}
				if (i_4_ == 40) {
					IsaacCipher.crossY = Class120_Sub12_Sub36.anInt3424;
					Class120_Sub14_Sub22.crossState = 2;
					Class120_Sub12_Sub35.crossX = Class50.anInt449;
					Class120_Sub12_Sub7.crossIndex = 0;
					Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putPacket(134);
					Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putByteS(!Class35.aBooleanArray299[82] ? 0 : 1);
					Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.method1116(-2076007248, 0x7fffffff & (int) (l >>> 32));
					Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.method1116(-2076007248, Class181.currentBaseZ + i_2_);
					Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putLEShortA(GameEntity.currentBaseX + i_1_);
					Class120_Sub14_Sub4.method1437(i_2_, l, 0, i_1_);
				}
				if (i_4_ == 46) {
					Class120_Sub12_Sub7.crossIndex = 0;
					Class120_Sub12_Sub35.crossX = Class50.anInt449;
					Class120_Sub14_Sub22.crossState = 2;
					IsaacCipher.crossY = Class120_Sub12_Sub36.anInt3424;
					Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putPacket(227);
					Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putShort(i_1_ + GameEntity.currentBaseX);
					Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putByte(Class35.aBooleanArray299[82] ? 1 : 0);
					Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putShort(Class181.currentBaseZ + i_2_);
					Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putLEShortA(i_3_);
					Class120_Sub14_Sub5.method1440(Class100.selfPlayer.anIntArray2958[0], 0, 0, true, 0, i_2_, Class100.selfPlayer.anIntArray3040[0], 0, (byte) -112, 0, i_1_);
				}
				if (i_4_ == 21) {
					final Player class180_sub5_sub1 = Class118.playersList[i_3_];
					if (class180_sub5_sub1 != null) {
						IsaacCipher.crossY = Class120_Sub12_Sub36.anInt3424;
						Class120_Sub12_Sub35.crossX = Class50.anInt449;
						Class120_Sub14_Sub22.crossState = 2;
						Class120_Sub12_Sub7.crossIndex = 0;
						Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putPacket(123);
						Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putLEShortA(i_3_);
						Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putInt(Class141.anInt1355);
						Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.method1116(-2076007248, Class108_Sub1.anInt2319);
						Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putByteS(Class35.aBooleanArray299[82] ? 1 : 0);
						Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putLEShortA(Class120_Sub14_Sub1.anInt3448);
						Class120_Sub14_Sub5.method1440(Class100.selfPlayer.anIntArray2958[0], 0, 0, true, class180_sub5_sub1.getSize(), i_2_, Class100.selfPlayer.anIntArray3040[0], 0, (byte) -112, class180_sub5_sub1.getSize(), i_1_);
					}
				}
				if (i_4_ == 1004) {
					Class120_Sub17.anInt2613++;
					IsaacCipher.crossY = Class120_Sub12_Sub36.anInt3424;
					Class120_Sub12_Sub35.crossX = Class50.anInt449;
					Class120_Sub12_Sub7.crossIndex = 0;
					Class120_Sub14_Sub22.crossState = 2;
					Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putPacket(72);
					Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putShort(i_3_);
				}
				if (i_4_ == 19) {
					if (i_3_ == 0) {
						Class120_Sub14_Sub5.anInt3479 = 1;
						Class120_Sub12_Sub20.method1302(Class173.gameLevel, i_1_, i_2_);
					} else if (i_3_ == 1) {
						Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putPacket(204);
						Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.method1116(-2076007248, i_2_ + Class181.currentBaseZ);
						Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.method1116(-2076007248, Class46.anInt420);
						Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.method1086((byte) 21, AbstractMouseWheelHandler.anInt119);
						Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.method1115(255, i_1_ + GameEntity.currentBaseX);
					}
				}
				if (i_4_ == 28) {
					IsaacCipher.crossY = Class120_Sub12_Sub36.anInt3424;
					Class120_Sub14_Sub22.crossState = 2;
					Class120_Sub12_Sub35.crossX = Class50.anInt449;
					Class120_Sub12_Sub7.crossIndex = 0;
					Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putPacket(119);
					Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.method1086((byte) 21, Class141.anInt1355);
					Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putShort(Class181.currentBaseZ + i_2_);
					Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.method1116(-2076007248, Class120_Sub14_Sub1.anInt3448);
					Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.method1115(255, Class108_Sub1.anInt2319);
					Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putLEShortA(i_3_);
					Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.method1115(i + 159, GameEntity.currentBaseX + i_1_);
					Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putByteS(!Class35.aBooleanArray299[82] ? 0 : 1);
					Class120_Sub14_Sub5.method1440(Class100.selfPlayer.anIntArray2958[0], 0, 0, true, 0, i_2_, Class100.selfPlayer.anIntArray3040[0], 0, (byte) -106, 0, i_1_);
				}
				if (i_4_ == 36) {
					final Npc class180_sub5_sub2 = Class120_Sub12_Sub11.npcList[i_3_];
					if (class180_sub5_sub2 != null) {
						Class120_Sub14_Sub22.crossState = 2;
						Class120_Sub12_Sub7.crossIndex = 0;
						Class120_Sub12_Sub35.crossX = Class50.anInt449;
						IsaacCipher.crossY = Class120_Sub12_Sub36.anInt3424;
						Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putPacket(37);
						Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putByte(Class35.aBooleanArray299[82] ? 1 : 0);
						Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putLEShortA(i_3_);
						Class120_Sub14_Sub5.method1440(Class100.selfPlayer.anIntArray2958[0], 0, 0, true, class180_sub5_sub2.getSize(), i_2_, Class100.selfPlayer.anIntArray3040[0], 0, (byte) -90, class180_sub5_sub2.getSize(), i_1_);
					}
				}
				if (i_4_ == 12) {
					final Player class180_sub5_sub1 = Class118.playersList[i_3_];
					if (class180_sub5_sub1 != null) {
						Class120_Sub14_Sub22.crossState = 2;
						Class120_Sub12_Sub35.crossX = Class50.anInt449;
						Class120_Sub12_Sub7.crossIndex = 0;
						IsaacCipher.crossY = Class120_Sub12_Sub36.anInt3424;
						Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putPacket(4);
						Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putByte(!Class35.aBooleanArray299[82] ? 0 : 1);
						Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.method1116(-2076007248, i_3_);
						Class120_Sub14_Sub5.method1440(Class100.selfPlayer.anIntArray2958[0], 0, 0, true, class180_sub5_sub1.getSize(), i_2_, Class100.selfPlayer.anIntArray3040[0], 0, (byte) -98, class180_sub5_sub1.getSize(), i_1_);
					}
				}
				if (i_4_ == 10) {
					Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putPacket(102);
					Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putInt(i_2_);
					Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.method1116(i + -2076007344, i_1_);
					Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putShort(i_3_);
					Class69_Sub2.anInt2236 = 0;
					Class32.aClass189_256 = Class74.method650(-126, i_2_);
					Class126.anInt1204 = i_1_;
				}
				if (i_4_ == 25) {
					final Npc class180_sub5_sub2 = Class120_Sub12_Sub11.npcList[i_3_];
					if (class180_sub5_sub2 != null) {
						Class120_Sub12_Sub7.crossIndex = 0;
						IsaacCipher.crossY = Class120_Sub12_Sub36.anInt3424;
						Class120_Sub14_Sub22.crossState = 2;
						Class120_Sub12_Sub35.crossX = Class50.anInt449;
						Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putPacket(33);
						Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putLEShortA(i_3_);
						Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.method1113(Class35.aBooleanArray299[82] ? 1 : 0, -112);
						Class120_Sub14_Sub5.method1440(Class100.selfPlayer.anIntArray2958[0], 0, 0, true, class180_sub5_sub2.getSize(), i_2_, Class100.selfPlayer.anIntArray3040[0], 0, (byte) -110, class180_sub5_sub2.getSize(), i_1_);
					}
				}
				if (i_4_ == 1007) {
					Class120_Sub12_Sub35.crossX = Class50.anInt449;
					Class120_Sub12_Sub7.crossIndex = 0;
					IsaacCipher.crossY = Class120_Sub12_Sub36.anInt3424;
					Class120_Sub14_Sub22.crossState = 2;
					Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putPacket(176);
					Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putShort(i_3_);
				}
				if (i_4_ == 4) {
					Class120_Sub14_Sub22.crossState = 2;
					IsaacCipher.crossY = Class120_Sub12_Sub36.anInt3424;
					Class120_Sub12_Sub7.crossIndex = 0;
					Class120_Sub12_Sub35.crossX = Class50.anInt449;
					Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putPacket(89);
					Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putShort((int) (l >>> 32) & 0x7fffffff);
					Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.method1080(Class35.aBooleanArray299[82] ? 1 : 0, (byte) 10);
					Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putLEShortA(GameEntity.currentBaseX + i_1_);
					Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.method1115(255, Class46.anInt420);
					Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putShort(Class181.currentBaseZ + i_2_);
					Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.method1086((byte) 21, AbstractMouseWheelHandler.anInt119);
					Class120_Sub14_Sub4.method1437(i_2_, l, 0, i_1_);
				}
				if (i_4_ == 6) {
					Class120_Sub12_Sub35.crossX = Class50.anInt449;
					Class120_Sub12_Sub7.crossIndex = 0;
					Class120_Sub14_Sub22.crossState = 2;
					IsaacCipher.crossY = Class120_Sub12_Sub36.anInt3424;
					Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putPacket(232);
					Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.method1115(255, i_2_ - -Class181.currentBaseZ);
					Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putLEShortA(i_3_);
					Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.method1113(Class35.aBooleanArray299[82] ? 1 : 0, -93);
					Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.method1115(255, i_1_ + GameEntity.currentBaseX);
					Class120_Sub14_Sub5.method1440(Class100.selfPlayer.anIntArray2958[0], 0, 0, true, 0, i_2_, Class100.selfPlayer.anIntArray3040[0], 0, (byte) -119, 0, i_1_);
				}
				if (i_4_ == 42) {
					final Npc class180_sub5_sub2 = Class120_Sub12_Sub11.npcList[i_3_];
					if (class180_sub5_sub2 != null) {
						Class120_Sub12_Sub7.crossIndex = 0;
						Class120_Sub12_Sub35.crossX = Class50.anInt449;
						IsaacCipher.crossY = Class120_Sub12_Sub36.anInt3424;
						Class120_Sub14_Sub22.crossState = 2;
						Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putPacket(155);
						Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.method1116(-2076007248, i_3_);
						Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.method1080(Class35.aBooleanArray299[82] ? 1 : 0, (byte) 10);
						Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putShort(Class46.anInt420);
						Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.method1086((byte) 21, AbstractMouseWheelHandler.anInt119);
						Class120_Sub14_Sub5.method1440(Class100.selfPlayer.anIntArray2958[0], 0, 0, true, class180_sub5_sub2.getSize(), i_2_, Class100.selfPlayer.anIntArray3040[0], 0, (byte) -113, class180_sub5_sub2.getSize(), i_1_);
					}
				}
				if (i_4_ == 31) {
					final Player class180_sub5_sub1 = Class118.playersList[i_3_];
					if (class180_sub5_sub1 != null) {
						Class193.anInt2131++;
						IsaacCipher.crossY = Class120_Sub12_Sub36.anInt3424;
						Class120_Sub12_Sub7.crossIndex = 0;
						Class120_Sub12_Sub35.crossX = Class50.anInt449;
						Class120_Sub14_Sub22.crossState = 2;
						Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putPacket(105);
						Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putShort(i_3_);
						Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putByte(!Class35.aBooleanArray299[82] ? 0 : 1);
						Class120_Sub14_Sub5.method1440(Class100.selfPlayer.anIntArray2958[0], 0, 0, true, class180_sub5_sub1.getSize(), i_2_, Class100.selfPlayer.anIntArray3040[0], 0, (byte) -104, class180_sub5_sub1.getSize(), i_1_);
					}
				}
				if (i_4_ == 47) {
					if (i_3_ == 0) {
						Class120_Sub12_Sub33.anInt3401 = 1;
						Class120_Sub12_Sub20.method1302(Class173.gameLevel, i_1_, i_2_);
					} else if (Class86.anInt821 <= 0 || !Class35.aBooleanArray299[82] || !Class35.aBooleanArray299[81]) {
						Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putPacket(85);
						Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putLEShortA(GameEntity.currentBaseX - -i_1_);
						Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.method1115(255, Class181.currentBaseZ - -i_2_);
					} else {
						Class108.method930((byte) -120, GameEntity.currentBaseX + i_1_, Class181.currentBaseZ + i_2_, Class173.gameLevel);
					}
				}
				if (i_4_ == 59) {
					final Npc class180_sub5_sub2 = Class120_Sub12_Sub11.npcList[i_3_];
					if (class180_sub5_sub2 != null) {
						IsaacCipher.crossY = Class120_Sub12_Sub36.anInt3424;
						Class120_Sub12_Sub35.crossX = Class50.anInt449;
						Class120_Sub12_Sub7.crossIndex = 0;
						Class120_Sub14_Sub22.crossState = 2;
						Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putPacket(53);
						Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putLEShortA(i_3_);
						Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putByteS(!Class35.aBooleanArray299[82] ? 0 : 1);
						Class120_Sub14_Sub5.method1440(Class100.selfPlayer.anIntArray2958[0], 0, 0, true, class180_sub5_sub2.getSize(), i_2_, Class100.selfPlayer.anIntArray3040[0], 0, (byte) -103, class180_sub5_sub2.getSize(), i_1_);
					}
				}
				if (i_4_ == 51) {
					Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putPacket(88);
					Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putLEShortA(i_3_);
					Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.method1093(-100, i_2_);
					Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putLEShortA(i_1_);
					Class69_Sub2.anInt2236 = 0;
					Class32.aClass189_256 = Class74.method650(i + 31, i_2_);
					Class126.anInt1204 = i_1_;
				}
				if (i_4_ == 13) {
					Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putPacket(242);
					Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putLEShortA(i_1_);
					Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putLEShortA(i_3_);
					Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.method1093(-100, i_2_);
					Class69_Sub2.anInt2236 = 0;
					Class32.aClass189_256 = Class74.method650(-123, i_2_);
					Class126.anInt1204 = i_1_;
				}
				if (i == 96) {
					if (i_4_ == 3 && Class156.aClass189_1454 == null) {
						Class189.method2499((byte) 68, i_1_, i_2_);
						Class156.aClass189_1454 = Class120_Sub13.method1404(i_2_, (byte) 82, i_1_);
						InterfaceClickMask.redrawInterface(Class156.aClass189_1454);
					}
					if (i_4_ == 1) {
						Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putPacket(40);
						Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.method1093(i + -190, i_2_);
						Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putShort(Class46.anInt420);
						Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.method1115(255, i_1_);
						Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putInt(AbstractMouseWheelHandler.anInt119);
					}
					if (i_4_ == 29) {
						final Player class180_sub5_sub1 = Class118.playersList[i_3_];
						if (class180_sub5_sub1 != null) {
							Class120_Sub12_Sub7.crossIndex = 0;
							IsaacCipher.crossY = Class120_Sub12_Sub36.anInt3424;
							Class120_Sub12_Sub35.crossX = Class50.anInt449;
							Class120_Sub14_Sub22.crossState = 2;
							Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putPacket(148);
							Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.method1116(i + -2076007344, i_3_);
							Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.method1113(!Class35.aBooleanArray299[82] ? 0 : 1, -103);
							Class120_Sub14_Sub5.method1440(Class100.selfPlayer.anIntArray2958[0], 0, 0, true, class180_sub5_sub1.getSize(), i_2_, Class100.selfPlayer.anIntArray3040[0], 0, (byte) -100, class180_sub5_sub1.getSize(), i_1_);
						}
					}
					if (i_4_ == 11) {
						Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putPacket(158);
						Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putInt(i_2_);
						Class150.anInt1409++;
						final Class189 class189 = Class74.method650(i + -41, i_2_);
						if (class189.anIntArrayArray1970 != null && class189.anIntArrayArray1970[0][0] == 5) {
							final int i_5_ = class189.anIntArrayArray1970[0][1];
							if (class189.anIntArray2071[0] != Class2.permanentVariable[i_5_]) {
								Class2.permanentVariable[i_5_] = class189.anIntArray2071[0];
								Class120_Sub14_Sub15.method1554((byte) 121, i_5_);
							}
						}
					}
					if (i_4_ == 32) {
						Class120_Sub12_Sub35.crossX = Class50.anInt449;
						Class120_Sub14_Sub22.crossState = 2;
						Class120_Sub12_Sub7.crossIndex = 0;
						IsaacCipher.crossY = Class120_Sub12_Sub36.anInt3424;
						Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putPacket(159);
						Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putLEShortA(i_1_ - -GameEntity.currentBaseX);
						Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putShort(Class181.currentBaseZ + i_2_);
						Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putByte(Class35.aBooleanArray299[82] ? 1 : 0);
						Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putLEShortA((int) (l >>> 32) & 0x7fffffff);
						Class120_Sub14_Sub4.method1437(i_2_, l, i ^ 0x60, i_1_);
					}
					if (i_4_ == 39) {
						final Npc class180_sub5_sub2 = Class120_Sub12_Sub11.npcList[i_3_];
						if (class180_sub5_sub2 != null) {
							Class120_Sub12_Sub35.crossX = Class50.anInt449;
							IsaacCipher.crossY = Class120_Sub12_Sub36.anInt3424;
							Class120_Sub12_Sub7.crossIndex = 0;
							Class120_Sub14_Sub22.crossState = 2;
							Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putPacket(245);
							Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putShort(i_3_);
							Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putByteS(Class35.aBooleanArray299[82] ? 1 : 0);
							Class120_Sub14_Sub5.method1440(Class100.selfPlayer.anIntArray2958[0], 0, 0, true, class180_sub5_sub2.getSize(), i_2_, Class100.selfPlayer.anIntArray3040[0], 0, (byte) -117, class180_sub5_sub2.getSize(), i_1_);
						}
					}
					if (i_4_ == 15) {
						Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putPacket(58);
						Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putShort(i_3_);
						Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.method1086((byte) 21, i_2_);
						Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putShort(Class108_Sub1.anInt2319);
						Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putShort(i_1_);
						Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.method1116(-2076007248, Class120_Sub14_Sub1.anInt3448);
						Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.method1086((byte) 21, Class141.anInt1355);
						Class69_Sub2.anInt2236 = 0;
						Class32.aClass189_256 = Class74.method650(i + -193, i_2_);
						Class126.anInt1204 = i_1_;
					}
					if (i_4_ == 57) {
						final Class189 class189 = Class74.method650(-103, i_2_);
						boolean bool = true;
						if (class189.anInt1975 > 0) {
							bool = Class120_Sub32.method1833((byte) -101, class189);
						}
						if (bool) {
							Class150.anInt1409++;
							Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putPacket(158);
							Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putInt(i_2_);
						}
					}
					if (i_4_ == 30) {
						Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putPacket(81);
						Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.method1115(i + 159, i_1_);
						Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putLEShortA(i_3_);
						Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.method1126((byte) 110, i_2_);
						Class69_Sub2.anInt2236 = 0;
						Class32.aClass189_256 = Class74.method650(-110, i_2_);
						Class126.anInt1204 = i_1_;
					}
					if (i_4_ == 14) {
						final Player class180_sub5_sub1 = Class118.playersList[i_3_];
						if (class180_sub5_sub1 != null) {
							Class120_Sub14_Sub22.crossState = 2;
							IsaacCipher.crossY = Class120_Sub12_Sub36.anInt3424;
							Class22.anInt132++;
							Class120_Sub12_Sub7.crossIndex = 0;
							Class120_Sub12_Sub35.crossX = Class50.anInt449;
							Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putPacket(77);
							Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.method1115(255, i_3_);
							Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putByteS(Class35.aBooleanArray299[82] ? 1 : 0);
							Class120_Sub14_Sub5.method1440(Class100.selfPlayer.anIntArray2958[0], 0, 0, true, class180_sub5_sub1.getSize(), i_2_, Class100.selfPlayer.anIntArray3040[0], 0, (byte) -108, class180_sub5_sub1.getSize(), i_1_);
						}
					}
					if (i_4_ == 26) {
						if (i_3_ != 0) {
							if (i_3_ == 1) {
								if (Class86.anInt821 <= 0 || !Class35.aBooleanArray299[82] || !Class35.aBooleanArray299[81]) {
									Class53_Sub1.method464(i_1_, 1, i_2_);
									Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putByte(FileSystem.anInt457);//1
									Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putByte(Class53_Sub1.anInt2219);//2
									Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putShort((int) OutputStream_Sub1.aFloat28);//4
									Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putByte(57);//5
									Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putByte(Class164.anInt1590);//6
									Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putByte(Class154.anInt1442);//7
									Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putByte(89);//8
									Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putShort(Class100.selfPlayer.x);//10
									Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putShort(Class100.selfPlayer.z);//12
									Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putByte(Class101_Sub2.anInt2276);//13
									Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putByte(63);//14
									Class120_Sub14_Sub5.method1440(Class100.selfPlayer.anIntArray2958[0], 0, 0, true, 0, i_2_, Class100.selfPlayer.anIntArray3040[0], 0, (byte) -111, 0, i_1_);
								} else {
									Class108.method930((byte) -120, i_1_ + GameEntity.currentBaseX, i_2_ + Class181.currentBaseZ, Class173.gameLevel);
								}
							}
						} else {
							Class120_Sub12_Sub20.method1302(Class173.gameLevel, i_1_, i_2_);
						}
					}
					if (i_4_ == 9) {
						Node.method1029((byte) 126);
						final Class189 class189 = Class74.method650(65, i_2_);
						Class108_Sub1.anInt2319 = i_1_;
						Light.anInt393 = 1;
						Class141.anInt1355 = i_2_;
						Class120_Sub14_Sub1.anInt3448 = i_3_;
						InterfaceClickMask.redrawInterface(class189);
						Class192.aString2124 = new StringBuilder("<col=ff9040>").append(ObjType.list(i_3_).name).append("<col=ffffff>").toString();
						if (Class192.aString2124 == null) {
							Class192.aString2124 = "null";
						}
					} else {
						if (i_4_ == 1012 || i_4_ == 1002 || i_4_ == 1008 || i_4_ == 1003 || i_4_ == 1011) {
							Class38.method313(1002, i_3_, i_4_, i_1_);
						}
						if (i_4_ == 48) {
							Class120_Sub12_Sub35.crossX = Class50.anInt449;
							Class120_Sub14_Sub22.crossState = 2;
							Class120_Sub12_Sub7.crossIndex = 0;
							IsaacCipher.crossY = Class120_Sub12_Sub36.anInt3424;
							Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putPacket(28);
							Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putLEShortA(i_2_ + Class181.currentBaseZ);
							Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putInt(AbstractMouseWheelHandler.anInt119);
							Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.method1115(i + 159, Class46.anInt420);
							Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putShort(i_3_);
							Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.method1115(255, i_1_ - -GameEntity.currentBaseX);
							Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putByteS(!Class35.aBooleanArray299[82] ? 0 : 1);
							Class120_Sub14_Sub5.method1440(Class100.selfPlayer.anIntArray2958[0], 0, 0, true, 0, i_2_, Class100.selfPlayer.anIntArray3040[0], 0, (byte) -100, 0, i_1_);
						}
						if (i_4_ == 5) {
							final Player class180_sub5_sub1 = Class118.playersList[i_3_];
							if (class180_sub5_sub1 != null) {
								Class120_Sub14_Sub22.crossState = 2;
								Class120_Sub12_Sub35.crossX = Class50.anInt449;
								IsaacCipher.crossY = Class120_Sub12_Sub36.anInt3424;
								Class120_Sub12_Sub7.crossIndex = 0;
								Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putPacket(224);
								Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.method1116(i ^ ~0x7bbd5b2f, i_3_);
								Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putShort(Class46.anInt420);
								Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.method1126((byte) 93, AbstractMouseWheelHandler.anInt119);
								Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putByteS(Class35.aBooleanArray299[82] ? 1 : 0);
								Class120_Sub14_Sub5.method1440(Class100.selfPlayer.anIntArray2958[0], 0, 0, true, class180_sub5_sub1.getSize(), i_2_, Class100.selfPlayer.anIntArray3040[0], 0, (byte) -98, class180_sub5_sub1.getSize(), i_1_);
							}
						}
						if (i_4_ == 37) {
							Class120_Sub12_Sub7.crossIndex = 0;
							Class120_Sub14_Sub22.crossState = 2;
							IsaacCipher.crossY = Class120_Sub12_Sub36.anInt3424;
							Class120_Sub12_Sub35.crossX = Class50.anInt449;
							Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putPacket(48);
							Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putShort(GameEntity.currentBaseX + i_1_);
							Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.method1116(-2076007248, (int) (l >>> 32) & 0x7fffffff);
							Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putByteS(!Class35.aBooleanArray299[82] ? 0 : 1);
							Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putShort(Class181.currentBaseZ + i_2_);
							Class120_Sub14_Sub4.method1437(i_2_, l, i + -96, i_1_);
						}
						if (i_4_ == 34) {
							final Class189 class189 = Class120_Sub13.method1404(i_2_, (byte) 82, i_1_);
							if (class189 != null) {
								Node.method1029((byte) 126);
								final InterfaceClickMask class120_sub20 = client.method54(class189);
								Class91.method763(class120_sub20.method1685(1105924391), class120_sub20.anInt2661, class189.cursorId, i_1_, class189.anInt2020, i_2_);
								Light.anInt393 = 0;
								Class101.aString963 = Class33.method277((byte) 124, class189);
								if (Class101.aString963 == null) {
									Class101.aString963 = "Null";
								}
								if (!class189.aBoolean2041) {
									Light.aString369 = new StringBuilder("<col=00ff00>").append(class189.aString1979).append("<col=ffffff>").toString();
								} else {
									Light.aString369 = new StringBuilder(class189.aString1964).append("<col=ffffff>").toString();
								}
							}
						} else {
							if (i_4_ == 49) {
								Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putPacket(145);
								Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.method1116(-2076007248, i_1_);
								Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.method1086((byte) 21, i_2_);
								Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.method1116(-2076007248, i_3_);
								Class69_Sub2.anInt2236 = 0;
								Class32.aClass189_256 = Class74.method650(-101, i_2_);
								Class126.anInt1204 = i_1_;
							}
							if (i_4_ == 58) {
								Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putPacket(214);
								Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putLEShortA(i_1_);
								Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.method1116(i + -2076007344, i_3_);
								Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putInt(i_2_);
								Class69_Sub2.anInt2236 = 0;
								Class32.aClass189_256 = Class74.method650(26, i_2_);
								Class126.anInt1204 = i_1_;
							}
							if (i_4_ == 8) {
								final Npc class180_sub5_sub2 = Class120_Sub12_Sub11.npcList[i_3_];
								if (class180_sub5_sub2 != null) {
									Class120_Sub12_Sub35.crossX = Class50.anInt449;
									Class120_Sub14_Sub22.crossState = 2;
									Class120_Sub12_Sub7.crossIndex = 0;
									IsaacCipher.crossY = Class120_Sub12_Sub36.anInt3424;
									Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putPacket(12);
									Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.method1115(i + 159, i_3_);
									Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putByte(!Class35.aBooleanArray299[82] ? 0 : 1);
									Class120_Sub14_Sub5.method1440(Class100.selfPlayer.anIntArray2958[0], 0, 0, true, class180_sub5_sub2.getSize(), i_2_, Class100.selfPlayer.anIntArray3040[0], 0, (byte) -95, class180_sub5_sub2.getSize(), i_1_);
								}
							}
							if (i_4_ == 35) {
								Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putPacket(103);
								Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.method1093(-106, i_2_);
								Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.method1115(255, i_1_);
								Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putShort(i_3_);
								Class69_Sub2.anInt2236 = 0;
								Class32.aClass189_256 = Class74.method650(125, i_2_);
								Class126.anInt1204 = i_1_;
							}
							if (i_4_ == 43) {
								final Player class180_sub5_sub1 = Class118.playersList[i_3_];
								if (class180_sub5_sub1 != null) {
									IsaacCipher.crossY = Class120_Sub12_Sub36.anInt3424;
									Class120_Sub12_Sub35.crossX = Class50.anInt449;
									Class120_Sub12_Sub7.crossIndex = 0;
									Class120_Sub14_Sub22.crossState = 2;
									Class40.anInt330++;
									Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putPacket(212);
									Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.method1116(i ^ ~0x7bbd5b2f, i_3_);
									Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.method1113(Class35.aBooleanArray299[82] ? 1 : 0, i + -1);
									Class120_Sub14_Sub5.method1440(Class100.selfPlayer.anIntArray2958[0], 0, 0, true, class180_sub5_sub1.getSize(), i_2_, Class100.selfPlayer.anIntArray3040[0], 0, (byte) -120, class180_sub5_sub1.getSize(), i_1_);
								}
							}
							if (i_4_ == 16) {
								IsaacCipher.crossY = Class120_Sub12_Sub36.anInt3424;
								Class120_Sub14_Sub22.crossState = 2;
								Class120_Sub12_Sub35.crossX = Class50.anInt449;
								Class120_Sub12_Sub7.crossIndex = 0;
								Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putPacket(116);
								Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putShort(Class108_Sub1.anInt2319);
								Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putLEShortA(i_1_ - -GameEntity.currentBaseX);
								Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putLEShortA((int) (l >>> 32) & 0x7fffffff);
								Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.method1126((byte) 113, Class141.anInt1355);
								Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.method1080(!Class35.aBooleanArray299[82] ? 0 : 1, (byte) 10);
								Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.method1115(i + 159, Class181.currentBaseZ + i_2_);
								Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.method1115(255, Class120_Sub14_Sub1.anInt3448);
								Class120_Sub14_Sub4.method1437(i_2_, l, 0, i_1_);
							}
							if (i_4_ == 44) {
								IsaacCipher.crossY = Class120_Sub12_Sub36.anInt3424;
								Class120_Sub12_Sub35.crossX = Class50.anInt449;
								Class120_Sub12_Sub7.crossIndex = 0;
								Class120_Sub14_Sub22.crossState = 2;
								Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putPacket(3);
								Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.method1080(Class35.aBooleanArray299[82] ? 1 : 0, (byte) 10);
								Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.method1115(255, Class181.currentBaseZ + i_2_);
								Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.method1115(255, i_3_);
								Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.method1116(-2076007248, i_1_ + GameEntity.currentBaseX);
								Class120_Sub14_Sub5.method1440(Class100.selfPlayer.anIntArray2958[0], 0, 0, true, 0, i_2_, Class100.selfPlayer.anIntArray3040[0], 0, (byte) -100, 0, i_1_);
							}
							if (i_4_ == 23 || i_4_ == 1009) {
								Class120_Sub14_Sub22.method1629(i_2_, i_1_, i_3_, i + -169, Class120_Sub12_Sub29.aStringArray3369[i_0_]);
							}
							if (i_4_ == 1010) {
								Class120_Sub12_Sub7.crossIndex = 0;
								Class120_Sub14_Sub22.crossState = 2;
								IsaacCipher.crossY = Class120_Sub12_Sub36.anInt3424;
								Class120_Sub12_Sub35.crossX = Class50.anInt449;
								final Npc class180_sub5_sub2 = Class120_Sub12_Sub11.npcList[i_3_];
								if (class180_sub5_sub2 != null) {
									NpcType npcType = class180_sub5_sub2.npcType;
									if (npcType.childrenIDs != null) {
										npcType = npcType.handleVarp();
									}
									if (npcType != null) {
										Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putPacket(65);
										Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.method1115(i + 159, npcType.anInt1686);
									}
								}
							}
							if (i_4_ == 7) {
								Class90.method758(0);
							}
							if (i_4_ == 1005) {
								IsaacCipher.crossY = Class120_Sub12_Sub36.anInt3424;
								Class120_Sub14_Sub22.crossState = 2;
								Class120_Sub12_Sub35.crossX = Class50.anInt449;
								Class120_Sub12_Sub7.crossIndex = 0;
								Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putPacket(60);
								Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.method1116(-2076007248, i_2_ + Class181.currentBaseZ);
								Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.method1115(255, (int) (l >>> 32) & 0x7fffffff);
								Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putByte(Class35.aBooleanArray299[82] ? 1 : 0);
								Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.method1115(255, GameEntity.currentBaseX + i_1_);
								Class120_Sub14_Sub4.method1437(i_2_, l, 0, i_1_);
							}
							if (i_4_ == 41) {
								Class120_Sub14_Sub22.crossState = 2;
								Class120_Sub12_Sub7.crossIndex = 0;
								Class120_Sub12_Sub35.crossX = Class50.anInt449;
								IsaacCipher.crossY = Class120_Sub12_Sub36.anInt3424;
								Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putPacket(92);
								Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putByteS(Class35.aBooleanArray299[82] ? 1 : 0);
								Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.method1115(255, (int) (l >>> 32) & 0x7fffffff);
								Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.method1116(-2076007248, i_1_ + GameEntity.currentBaseX);
								Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.method1116(i ^ ~0x7bbd5b2f, i_2_ - -Class181.currentBaseZ);
								Class120_Sub14_Sub4.method1437(i_2_, l, 0, i_1_);
							}
							if (i_4_ == 50) {
								Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putPacket(177);
								Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.method1093(-128, i_2_);
								Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putShort(i_3_);
								Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.method1126((byte) -50, AbstractMouseWheelHandler.anInt119);
								Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.method1115(255, i_1_);
								Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.method1115(255, Class46.anInt420);
								Class69_Sub2.anInt2236 = 0;
								Class32.aClass189_256 = Class74.method650(62, i_2_);
								Class126.anInt1204 = i_1_;
							}
							if (i_4_ == 20) {
								Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putPacket(124);
								Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putLEShortA(i_1_);
								Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putLEShortA(i_3_);
								Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.method1126((byte) -76, i_2_);
								Class69_Sub2.anInt2236 = 0;
								Class32.aClass189_256 = Class74.method650(i ^ ~0x3e, i_2_);
								Class126.anInt1204 = i_1_;
							}
							if (i_4_ == 2) {
								Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putPacket(205);
								Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.method1093(-97, i_2_);
								Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.method1115(255, i_1_);
								Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.method1116(-2076007248, i_3_);
								Class69_Sub2.anInt2236 = 0;
								Class32.aClass189_256 = Class74.method650(-128, i_2_);
								Class126.anInt1204 = i_1_;
							}
							if (i_4_ == 45) {
								Class120_Sub14_Sub22.crossState = 2;
								Class120_Sub12_Sub35.crossX = Class50.anInt449;
								IsaacCipher.crossY = Class120_Sub12_Sub36.anInt3424;
								Class120_Sub12_Sub7.crossIndex = 0;
								Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putPacket(54);
								Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putByte(Class35.aBooleanArray299[82] ? 1 : 0);
								Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.method1115(255, Class181.currentBaseZ + i_2_);
								Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putShort(i_3_);
								Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putShort(i_1_ + GameEntity.currentBaseX);
								Class120_Sub14_Sub5.method1440(Class100.selfPlayer.anIntArray2958[0], 0, 0, true, 0, i_2_, Class100.selfPlayer.anIntArray3040[0], 0, (byte) -112, 0, i_1_);
							}
							if (i_4_ == 22) {
								final Player class180_sub5_sub1 = Class118.playersList[i_3_];
								if (class180_sub5_sub1 != null) {
									IsaacCipher.crossY = Class120_Sub12_Sub36.anInt3424;
									Class120_Sub14_Sub22.crossState = 2;
									Class120_Sub12_Sub35.crossX = Class50.anInt449;
									PacketBuffer.anInt3122++;
									Class120_Sub12_Sub7.crossIndex = 0;
									Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putPacket(96);
									Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.method1113(!Class35.aBooleanArray299[82] ? 0 : 1, i + -224);
									Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putShort(i_3_);
									Class120_Sub14_Sub5.method1440(Class100.selfPlayer.anIntArray2958[0], 0, 0, true, class180_sub5_sub1.getSize(), i_2_, Class100.selfPlayer.anIntArray3040[0], 0, (byte) -100, class180_sub5_sub1.getSize(), i_1_);
								}
							}
							if (i_4_ == 60) {
								final Player class180_sub5_sub1 = Class118.playersList[i_3_];
								if (class180_sub5_sub1 != null) {
									Class120_Sub14_Sub22.crossState = 2;
									Class120_Sub12_Sub7.crossIndex = 0;
									Class120_Sub12_Sub35.crossX = Class50.anInt449;
									IsaacCipher.crossY = Class120_Sub12_Sub36.anInt3424;
									Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putPacket(223);
									Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putByte(Class35.aBooleanArray299[82] ? 1 : 0);
									Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putLEShortA(i_3_);
									Class120_Sub14_Sub5.method1440(Class100.selfPlayer.anIntArray2958[0], 0, 0, true, class180_sub5_sub1.getSize(), i_2_, Class100.selfPlayer.anIntArray3040[0], 0, (byte) -118, class180_sub5_sub1.getSize(), i_1_);
								}
							}
							if (i_4_ == 1001) {
								final Class189 class189 = Class74.method650(96, i_2_);
								if (class189 == null || 100000 > class189.anIntArray1983[i_1_]) {
									Class120_Sub17.anInt2613++;
									Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putPacket(72);
									Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putShort(i_3_);
								} else {
									Class120_Sub14_Sub14.method1540("", 0, new StringBuilder(String.valueOf(class189.anIntArray1983[i_1_])).append(" x ").append(ObjType.list(i_3_).name).toString());
								}
								Class69_Sub2.anInt2236 = 0;
								Class32.aClass189_256 = Class74.method650(122, i_2_);
								Class126.anInt1204 = i_1_;
							}
							if (i_4_ == 18) {
								Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putPacket(158);
								Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putInt(i_2_);
								final Class189 class189 = Class74.method650(112, i_2_);
								Class150.anInt1409++;
								if (class189.anIntArrayArray1970 != null && class189.anIntArrayArray1970[0][0] == 5) {
									final int i_6_ = class189.anIntArrayArray1970[0][1];
									Class2.permanentVariable[i_6_] = -Class2.permanentVariable[i_6_] + 1;
									Class120_Sub14_Sub15.method1554((byte) 95, i_6_);
								}
							}
							if (i_4_ == 38) {
								Class120_Sub12_Sub7.crossIndex = 0;
								Class120_Sub14_Sub22.crossState = 2;
								IsaacCipher.crossY = Class120_Sub12_Sub36.anInt3424;
								Class120_Sub12_Sub35.crossX = Class50.anInt449;
								Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putPacket(8);
								Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putLEShortA(i_3_);
								Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putShort(i_2_ + Class181.currentBaseZ);
								Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.putShort(GameEntity.currentBaseX + i_1_);
								Class120_Sub12_Sub11.aClass120_Sub7_Sub1_3209.method1113(Class35.aBooleanArray299[82] ? 1 : 0, i ^ ~0xc);
								Class120_Sub14_Sub5.method1440(Class100.selfPlayer.anIntArray2958[0], 0, 0, true, 0, i_2_, Class100.selfPlayer.anIntArray3040[0], 0, (byte) -118, 0, i_1_);
							}
							if (Light.anInt393 != 0) {
								Light.anInt393 = 0;
								InterfaceClickMask.redrawInterface(Class74.method650(88, Class141.anInt1355));
							}
							if (Class88.aBoolean828) {
								Node.method1029((byte) 126);
							}
							if (Class32.aClass189_256 != null && Class69_Sub2.anInt2236 == 0) {
								InterfaceClickMask.redrawInterface(Class32.aClass189_256);
							}
						}
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ue.R(").append(i).append(',').append(i_0_).append(')').toString());
		}
	}

	static final void method32(final boolean bool) {
		Class61.aBoolean566 = bool;
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
		AbstractGraphicsBuffer.gameLoopLength = 0x1f & 1 + AbstractGraphicsBuffer.gameLoopLength;
		synchronized (this) {
			InputStream_Sub1.focus = Class120_Sub12_Sub21_Sub1.focusIn;
		}
		mainLoop();
	}

	static final void method34(final Class50 class50, final byte i) {
		try {
			Class69_Sub2.aClass120_Sub14_Sub19Array2238 = Class125.method1878(class50, (byte) 110, 0, Class120_Sub8.anInt2490);
			Class40.aClass120_Sub14_Sub19Array335 = Class125.method1878(class50, (byte) 110, 0, Class120_Sub12_Sub25.anInt3315);
			Class54.aClass120_Sub14_Sub19Array490 = Class125.method1878(class50, (byte) 110, 0, Class120_Sub14_Sub15.anInt3583);
			Class120_Sub14_Sub14_Sub1.prayerIconSprites = Class125.method1878(class50, (byte) 110, 0, Class52.anInt477);
			Class180_Sub6.aClass120_Sub14_Sub19Array3073 = Class125.method1878(class50, (byte) 110, 0, Class120_Sub21.anInt2664);
			Class120_Sub12_Sub5.aClass120_Sub14_Sub19Array3167 = Class125.method1878(class50, (byte) 110, 0, Class173.anInt1727);
			Class101_Sub1.aClass120_Sub14_Sub19Array2274 = Class167.method2191(Class169.anInt1644, class50, 8693, 0);
			Class120_Sub12_Sub30.crossSprites = Class167.method2191(Class132_Sub2.anInt2823, class50, 8693, 0);
			Class120_Sub12_Sub6.aClass120_Sub14_Sub19Array3168 = Class167.method2191(Class73.anInt665, class50, 8693, 0);
			Class118.aClass107Array1138 = Class120_Sub12_Sub3.method1209(class50, Class134.anInt1278, -124, 0);
			Class82.aClass107Array785 = Class120_Sub12_Sub3.method1209(class50, Class81.anInt778, -116, 0);
			Class21.aClass120_Sub14_Sub8_121.method1474(Class82.aClass107Array785, null);
			Class120_Sub12_Sub20.aClass120_Sub14_Sub8_3286.method1474(Class82.aClass107Array785, null);
			Class120_Sub12_Sub22.aClass120_Sub14_Sub8_3303.method1474(Class82.aClass107Array785, null);
			if (HDToolkit.glEnabled) {
				Class47.aClass107_Sub1Array430 = InterfaceChangeNode.method1457(class50, (byte) 127, 0, Class120_Sub12_Sub7.anInt3180);
				for (final Class107_Sub1 element : Class47.aClass107_Sub1Array430) {
					element.method923();
				}
			}
			final LDSprite class120_sub14_sub19_sub2 = Class120_Sub14_Sub13.method1534(class50, (byte) -64, Class9.anInt71, 0);
			class120_sub14_sub19_sub2.method1615();
			if (!HDToolkit.glEnabled) {
				Class157.aClass120_Sub14_Sub19_1474 = class120_sub14_sub19_sub2;
			} else {
				Class157.aClass120_Sub14_Sub19_1474 = new HDSprite(class120_sub14_sub19_sub2);
			}
			final LDSprite[] class120_sub14_sub19_sub2s = Class115.method1008(0, PlayerAppearance.anInt1364, (byte) -112, class50);
			int i_9_ = 0;
			if (i < 19) {
				anInt3 = -86;
			}
			for (/**/; class120_sub14_sub19_sub2s.length > i_9_; i_9_++) {
				class120_sub14_sub19_sub2s[i_9_].method1615();
			}
			if (!HDToolkit.glEnabled) {
				Class69_Sub2.aClass120_Sub14_Sub19Array2237 = class120_sub14_sub19_sub2s;
			} else {
				Class69_Sub2.aClass120_Sub14_Sub19Array2237 = new AbstractSprite[class120_sub14_sub19_sub2s.length];
				for (i_9_ = 0; class120_sub14_sub19_sub2s.length > i_9_; i_9_++) {
					Class69_Sub2.aClass120_Sub14_Sub19Array2237[i_9_] = new HDSprite(class120_sub14_sub19_sub2s[i_9_]);
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ue.Q(").append(class50 != null ? "{...}" : "null").append(',').append(i).append(')').toString());
		}
	}

	public static void method35(final int i) {
		try {
			mainRedrawCache = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ue.BA(").append(i).append(')').toString());
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
		if (Class120_Sub14_Sub10.fullscreenFrame != null) {
			container = Class120_Sub14_Sub10.fullscreenFrame;
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
			Node.canvas.setLocation(insets.left + Class120_Sub28.leftMargin, Class186.topMargin + insets.top);
		} else {
			Node.canvas.setLocation(Class120_Sub28.leftMargin, Class186.topMargin);
		}
		Node.canvas.addFocusListener(this);
		Node.canvas.requestFocus();
		Class120_Sub12_Sub21_Sub1.focusIn = true;
		Class120_Sub12_Sub26.fullRedraw = true;
		Class120_Sub3.canvasReplaceRecommended = false;
		InputStream_Sub1.focus = true;
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
				Class77.method666(NpcType.gameSignlink.gameApplet, "loggedout");
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
			if (Class43.usingJavaAbove5 && !HDToolkit.glEnabled && 1000L < -Class143.lastCanvasReplace + TimeUtil.getSafeTime()) {
				final Rectangle rectangle = graphics.getClipBounds();
				if (rectangle == null || rectangle.width >= Class120_Sub12_Sub7.frameWidth && PlayerAppearance.frameHeight <= rectangle.height) {
					Class120_Sub3.canvasReplaceRecommended = true;
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

	abstract void method39(byte i);

	abstract void method40(byte i);

	@Override
	public final void windowOpened(final WindowEvent windowevent) {
		/* empty */
	}

	@Override
	public final void start() {
		if (Class31.gameApplet == this && !client.shutdown) {
			Class120_Sub32.killtime = 0L;
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
		Class96.mainRedrawCachePos = 1 + Class96.mainRedrawCachePos & 0x1f;
		if (oldTime != 0 && oldTime < newTime) {
			final int timeDelta = (int) (newTime - oldTime);
			Class73.fps = ((timeDelta >> 1) + 32000) / timeDelta;
		}
		if (Class120_Sub17.canvasRefreshCycle++ > 50) {
			Class120_Sub17.canvasRefreshCycle -= 50;
			Class120_Sub12_Sub26.fullRedraw = true;
			Node.canvas.setSize(Class69_Sub1.canvasWidth, Class120_Sub12_Sub5.canvasHeight);
			Node.canvas.setVisible(true);
			if (Class112.frame != null && Class120_Sub14_Sub10.fullscreenFrame == null) {
				final Insets insets = Class112.frame.getInsets();
				Node.canvas.setLocation(insets.left + Class120_Sub28.leftMargin, Class186.topMargin + insets.top);
			} else {
				Node.canvas.setLocation(Class120_Sub28.leftMargin, Class186.topMargin);
			}
		}
		mainRedraw();
	}

	@Override
	public final void stop() {
		if (Class31.gameApplet == this && !client.shutdown) {
			Class120_Sub32.killtime = TimeUtil.getSafeTime() - -4000L;
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
			method39((byte) 32);
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
				NpcType.gameSignlink.method1971((byte) 76);
			} catch (final Exception exception) {
				/* empty */
			}
		}
		method40((byte) 116);
		if (Class112.frame != null) {
			try {
				System.exit(0);
			} catch (final Throwable throwable) {
				/* empty */
			}
		}
		System.out.println(new StringBuilder("Shutdown complete - clean:").append(isClean).toString());
	}

	static final void method43(final int i, final int i_12_) {
		final InterfaceChangeNode class120_sub14_sub7 = Class120_Sub14_Sub3.putInterfaceChange(i_12_, i);
		class120_sub14_sub7.method1453((byte) -104);
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
			Class120_Sub28.leftMargin = 0;
			Class31.gameApplet = this;
			Class186.topMargin = 0;
			Class120_Sub12_Sub7.frameWidth = Class69_Sub1.canvasWidth = width;
			DisplayModeInfo.revision = i;
			PlayerAppearance.frameHeight = Class120_Sub12_Sub5.canvasHeight = height;
			final String string = getParameter("openwinjs");
			if (string != null && string.equals("1")) {
				Class99.aBoolean953 = true;
			} else {
				Class99.aBoolean953 = false;
			}
			if (NpcType.gameSignlink == null) {
				Class120_Sub12_Sub18.errorSignlink = NpcType.gameSignlink = new Signlink(this, i_13_, null, 0);
			}
			final SignlinkNode signlinkNode = NpcType.gameSignlink.startThread(this, 1);
			while (signlinkNode.status == 0) {
				PacketBuffer.sleepWrapper(10L);
			}
			Class189.gameShellThread = (Thread) signlinkNode.value;
		} catch (final Exception exception) {
			Class180_Sub3.method2312(exception, null);
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
			Class27.calculateMaxMemory();
			addCanvas();
			Class120_Sub13.fullscreenGraphics = Class114.constructGraphicsBuffer(Node.canvas, Class69_Sub1.canvasWidth, Class120_Sub12_Sub5.canvasHeight);
			mainInit();
			Class101_Sub2.gameShellTimer = Class52.constructTimer();
			loadJagmisc();
			while (Class120_Sub32.killtime == 0L || TimeUtil.getSafeTime() < Class120_Sub32.killtime) {
				Class112.gameLoopCount = Class101_Sub2.gameShellTimer.sleep(Class145.sleepModifier1, Class120_Sub12_Sub1.sleepModifier2);
				for (int i = 0; i < Class112.gameLoopCount; i++) {
					mainLoopWrapper();
				}
				mainRedrawWrapper();
			}
		} catch (final Exception exception) {
			Class180_Sub3.method2312(exception, null);
			error("crash");
		}
		shutdownApplet(true);
	}

	abstract void mainRedraw();

	final void startApplication(final String gameName, final int cacheStoreId, final int revision, final int cacheIndexCount, final int height, final int width) {
		try {
			Class186.topMargin = 0;
			DisplayModeInfo.revision = revision;
			PlayerAppearance.frameHeight = Class120_Sub12_Sub5.canvasHeight = height;
			Class120_Sub12_Sub7.frameWidth = Class69_Sub1.canvasWidth = width;
			Class31.gameApplet = this;
			Class120_Sub28.leftMargin = 0;
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
			Class189.gameShellThread = (Thread) signlinkNode.value;
		} catch (final Exception exception) {
			Class180_Sub3.method2312(exception, null);
		}
	}

	static final void method47(final int i, final boolean bool) {
		try {
			if (bool) {
				method32(false);
			}
			final InterfaceChangeNode class120_sub14_sub7 = Class120_Sub14_Sub3.putInterfaceChange(5, i);
			class120_sub14_sub7.method1453((byte) -104);
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ue.W(").append(i).append(',').append(bool).append(')').toString());
		}
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
				Class101_Sub2.gameShellTimer = Class52.constructTimer();
			} catch (final Throwable throwable) {
				/* empty */
			}
		}
	}

	@Override
	public final void destroy() {
		try {
			if (this == Class31.gameApplet && !client.shutdown) {
				Class120_Sub32.killtime = TimeUtil.getSafeTime();
				PacketBuffer.sleepWrapper(5000L);
				Class120_Sub12_Sub18.errorSignlink = null;
				shutdownApplet(false);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, "ue.destroy()");
		}
	}

	@Override
	public final String getParameter(final String string) {
		String string_25_;
		try {
			if (Class112.frame != null) {
				return null;
			}
			if (NpcType.gameSignlink != null && NpcType.gameSignlink.gameApplet != this) {
				return NpcType.gameSignlink.gameApplet.getParameter(string);
			}
			string_25_ = super.getParameter(string);
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ue.getParameter(").append(string != null ? "{...}" : "null").append(')').toString());
		}
		return string_25_;
	}
}
