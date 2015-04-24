import java.util.Arrays;

/* Class172 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Decimator {
	static int anInt1716;
	private int newFrequency;
	private int oldFrequency;
	private int[][] anIntArrayArray1719;
	static int[] skillsBaseLevel = new int[25];
	static js5 aClass50_1721;
	static boolean fogEnabled;

	static {
		anInt1716 = 0;
		fogEnabled = false;
	}

	final int method2217(int i) {
		if (anIntArrayArray1719 != null) {
			i = (int) ((long) newFrequency * (long) i / oldFrequency);
		}
		return i;
	}

	final int method2218(int i_2_) {
		if (anIntArrayArray1719 != null) {
			i_2_ = (int) ((long) newFrequency * (long) i_2_ / oldFrequency) + 6;
		}
		return i_2_;
	}

	static final void method2219(final long l) {
		if (client.cameraType == 1 || client.cameraType == 5) {
			Class120_Sub12_Sub5.method1222(l);
		} else if (client.cameraType == 2) {
			Class120_Sub12_Sub16.method1279();
		} else {
			InvType.method1445();
		}
		if (!Class15.menuOpen) {
			if (FileSystem.anInt455 == 0) {
				if (Class156.lastMouseClick == 0) {
					Class115.menuMouseX = Queue.lastMouseX;
					Class120_Sub12_Sub21.menuMouseY = Class191.lastMouseY;
				} else {
					Class115.menuMouseX = js5.lastClickX;
					Class120_Sub12_Sub21.menuMouseY = Class120_Sub12_Sub36.lastClickY;
				}
			} else {
				Class115.menuMouseX = ClientScript.anInt3558;
				Class120_Sub12_Sub21.menuMouseY = Class31.anInt250;
			}
			Class120_Sub29.menuOptionsCode[0] = (short) 1006;
			Class120_Sub12_Sub33.menuOptionPrefix[0] = Class157.aString1462;
			Class120_Sub12_Sub29.menuOptionSuffix[0] = "";
			InterfaceChangeNode.menuOptionsCursorId[0] = Class192.selectedSpellCursor;
			WallDecoration.menuOptionCount = 1;
		}
		ParticleEngine.process(Class101_Sub2.loopCycle);
		if (Class69.rootInterfaceId != -1) {
			AbstractGraphicsBuffer.animateInterface(Class69.rootInterfaceId);
		}
		for (int id = 0; id < LabelGroup.screenRedrawPos; id++) {
			if (MasterIndexInfo.needInterfaceRedrawWrapper[id]) {
				Class120_Sub12_Sub33.needScreenRedraw[id] = true;
			}
			Class9.needInterfaceRedraw[id] = MasterIndexInfo.needInterfaceRedrawWrapper[id];
			MasterIndexInfo.needInterfaceRedrawWrapper[id] = false;
		}
		Class69_Sub3_Sub1.aClass189_3080 = null;
		GZIPDecompressor.anInt796 = Class101_Sub2.loopCycle;
		LookupTable.anInt497 = -1;
		StructType.anInt3590 = -1;
		StructType.aClass189_3588 = null;
		if (HDToolkit.glEnabled) {
			Class167.clearDepthBuffer = true;
		}
		if (Class69.rootInterfaceId != -1) {
			LabelGroup.screenRedrawPos = 0;
			LookupTable.method486();
		}
		if (HDToolkit.glEnabled) {
			GraphicsHD.clipRect();
		} else {
			GraphicsLD.clipRect();
		}
		Class120_Sub12_Sub12.sortMenuOptions();
		if (Class15.menuOpen) {
			if (WallDecoration.usingSpriteMenu) {
				Class120_Sub12_Sub18.drawSpriteMenu();
			} else {
				FileSystem.drawMenu();
			}
		} else if (Class69_Sub3_Sub1.aClass189_3080 != null) {
			Class86.method728(Class69_Sub3_Sub1.aClass189_3080, Class9.anInt68, Class90.anInt847);
		} else if (LookupTable.anInt497 != -1) {
			Class86.method728(null, LookupTable.anInt497, StructType.anInt3590);
		}
		int cursor = Class15.menuOpen ? -1 : Class53_Sub1.getMenuOptionCursor();
		if (cursor == -1) {
			cursor = AbstractIndexedSprite.defaultCursorId;
		}
		Class120_Sub12_Sub6.setCursor(cursor);
		if (Class120_Sub12_Sub33.anInt3401 == 1) {
			Class120_Sub12_Sub33.anInt3401 = 2;
		}
		if (MapFunctionNode.anInt3479 == 1) {
			MapFunctionNode.anInt3479 = 2;
		}
		if (Class15.rectDebugType == 3) {
			for (int id = 0; id < LabelGroup.screenRedrawPos; id++) {
				if (Class9.needInterfaceRedraw[id]) {
					if (HDToolkit.glEnabled) {
						GraphicsHD.fillRectAlpha(GrandExchangeObject.screenRedrawXs[id], Class120_Sub12_Sub38.screenRedrawYs[id], Class120_Sub16.screenRedrawWidhts[id], Class69_Sub3_Sub1.screenRedrawHeights[id], 16711935, 128);
					} else {
						GraphicsLD.fillRectAlpha(GrandExchangeObject.screenRedrawXs[id], Class120_Sub12_Sub38.screenRedrawYs[id], Class120_Sub16.screenRedrawWidhts[id], Class69_Sub3_Sub1.screenRedrawHeights[id], 16711935, 128);
					}
				} else if (Class120_Sub12_Sub33.needScreenRedraw[id]) {
					if (HDToolkit.glEnabled) {
						GraphicsHD.fillRectAlpha(GrandExchangeObject.screenRedrawXs[id], Class120_Sub12_Sub38.screenRedrawYs[id], Class120_Sub16.screenRedrawWidhts[id], Class69_Sub3_Sub1.screenRedrawHeights[id], 16711680, 128);
					} else {
						GraphicsLD.fillRectAlpha(GrandExchangeObject.screenRedrawXs[id], Class120_Sub12_Sub38.screenRedrawYs[id], Class120_Sub16.screenRedrawWidhts[id], Class69_Sub3_Sub1.screenRedrawHeights[id], 16711680, 128);
					}
				}
			}
		}
		Class120_Sub11.processAmbientSounds(TileParticleQueue.selfPlayer.x, TileParticleQueue.selfPlayer.z, Class173.gameLevel, Class120_Sub12_Sub22.redrawRate);
		Class120_Sub12_Sub22.redrawRate = 0;
	}

	final byte[] method2220(byte[] is) {
		if (anIntArrayArray1719 != null) {
			final int i_8_ = (int) ((long) newFrequency * (long) is.length / oldFrequency) - -14;
			int i_9_ = 0;
			final int[] is_10_ = new int[i_8_];
			int i_11_ = 0;
			byte[] is_13_;
			final int i_12_ = (is_13_ = is).length;
			for (int i_14_ = 0; i_14_ < i_12_; i_14_++) {
				final int i_15_ = is_13_[i_14_];
				final int[] is_16_ = anIntArrayArray1719[i_11_];
				for (int i_17_ = 0; i_17_ < 14; i_17_++) {
					is_10_[i_9_ + i_17_] += is_16_[i_17_] * i_15_;
				}
				i_11_ += newFrequency;
				final int i_18_ = i_11_ / oldFrequency;
				i_9_ += i_18_;
				i_11_ -= oldFrequency * i_18_;
			}
			is = new byte[i_8_];
			for (int i_19_ = 0; i_8_ > i_19_; i_19_++) {
				final int i_20_ = 32768 + is_10_[i_19_] >> 16;
				if (i_20_ >= -128) {
					if (i_20_ > 127) {
						is[i_19_] = (byte) 127;
					} else {
						is[i_19_] = (byte) i_20_;
					}
				} else {
					is[i_19_] = (byte) -128;
				}
			}
		}
		return is;
	}

	static final void method2221() {
		if (HintIcon.anInt802 != -1) {
			ParticleNode.method932(false, -1, -1, HintIcon.anInt802);
			HintIcon.anInt802 = -1;
		}
	}

	Decimator(int oldFreq, int newFreq) {
		if (oldFreq != newFreq) {
			final int i_22_ = PlayerAppearance.method2035(oldFreq, newFreq);
			oldFreq /= i_22_;
			newFreq /= i_22_;
			oldFrequency = oldFreq;
			newFrequency = newFreq;
			anIntArrayArray1719 = new int[oldFreq][14];
			for (int i_23_ = 0; i_23_ < oldFreq; i_23_++) {
				final int[] is = anIntArrayArray1719[i_23_];
				final double d = 6.0 + (double) i_23_ / (double) oldFreq;
				int i_24_ = (int) Math.floor(d - 7.0 + 1.0);
				if (i_24_ < 0) {
					i_24_ = 0;
				}
				
				int i_25_ = (int) Math.ceil(7.0 + d);
				if (i_25_ > 14) {
					i_25_ = 14;
				}
				
				final double d_26_ = (double) newFreq / (double) oldFreq;
				for (/**/; i_24_ < i_25_; i_24_++) {
					final double d_27_ = (i_24_ - d) * Math.PI;
					double d_28_ = d_26_;
					if (d_27_ < -1.0E-4 || d_27_ > 1.0E-4) {
						d_28_ *= Math.sin(d_27_) / d_27_;
					}
					d_28_ *= Math.cos((Math.PI / 14) * (i_24_ - d)) * 0.46 + 0.54;
					is[i_24_] = (int) Math.floor(0.5 + 65536.0 * d_28_);
				}
			}
			System.out.println(Arrays.toString(anIntArrayArray1719));
		}
	}

	static final void method2223() {
		for (int id = 0; id < Class154.anInt1441; id++) {
			final int index = Class169.anIntArray1648[id];
			final Player player = Class118.playersList[index];
			int mask = Canvas_Sub1.inputStream.getUByte();
			if ((mask & 0x80) != 0) {
				mask += Canvas_Sub1.inputStream.getUByte() << 8;
			}
			Class120_Sub22.method1701(player, mask, index);
		}
	}

	static final void drawCompassContents(final JagexInterface jagexInterface, final int x, final int y, final int redrawId) {
		if (HDToolkit.glEnabled) {
			GraphicsHD.clipRect(x, y, x + jagexInterface.width, y + jagexInterface.height);
		}
		final int i_42_ = (int) DummyOutputStream.aFloat28 & 0x7ff;
		if (AbstractGraphicsBuffer.mapbackState >= 3) {
			if (!HDToolkit.glEnabled) {
				GraphicsLD.fillPixels(x, y, 0, jagexInterface.startOfSpriteLookupTable, jagexInterface.lengthOfSpriteLookupTable);
			} else {
				final AbstractSprite sprite = jagexInterface.constructSpriteFromId(false);
				if (sprite != null) {
					sprite.drawReg(x, y);
				}
			}
		} else if (!HDToolkit.glEnabled) {
			((LDSprite) Class157.compassSprite).method1604(x, y, jagexInterface.width, jagexInterface.height, Class157.compassSprite.width / 2, Class157.compassSprite.height / 2, i_42_, 256, jagexInterface.startOfSpriteLookupTable, jagexInterface.lengthOfSpriteLookupTable);
		} else {
			((HDSprite) Class157.compassSprite).method1600(x, y, jagexInterface.width, jagexInterface.height, Class157.compassSprite.width / 2, Class157.compassSprite.height / 2, i_42_, 256, (HDSprite) jagexInterface.constructSpriteFromId(false));
		}
		Class120_Sub12_Sub33.needScreenRedraw[redrawId] = true;
	}
}
