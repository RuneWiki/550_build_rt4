/* Class120_Sub25 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class StringNode extends Node {
	static int[] anIntArray2733;
	static boolean aBoolean2734;
	static int[] anIntArray2735 = new int[2];
	String value;
	static Buffer[] aClass120_Sub7Array2737 = new Buffer[2048];

	public static void method1719(final int i) {
		try {
			aClass120_Sub7Array2737 = null;
			anIntArray2733 = null;
			if (i <= 39) {
				method1719(20);
			}
			anIntArray2735 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("rk.B(").append(i).append(')').toString());
		}
	}

	static final void method1720(final int i) {
		try {
			if (i != -19674) {
				method1720(32);
			}
			Class141.aClass21_1350.clear();
			Class182.aClass21_1798.clear();
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("rk.A(").append(i).append(')').toString());
		}
	}

	public StringNode() {
		/* empty */
	}

	static final void method1721(final int i, int x, int height, final boolean bool, int width, int y) {
		InterfaceChangeNode.anInt3490++;
		Class82.method715(68);
		if (!bool) {
			Class120_Sub12_Sub14.method1269(0, 92);
			Class120_Sub14_Sub14_Sub1.method1545(0, true, false, true);
			if (Class134.anInt1281 != 0) {
				for (int i_4_ = 1; i_4_ <= 5; i_4_++) {
					Class120_Sub12_Sub14.method1269(i_4_, -103);
					Class120_Sub14_Sub14_Sub1.method1545(i_4_, true, false, false);
					Class120_Sub14_Sub14_Sub1.method1545(i_4_, true, true, false);
				}
			} else {
				for (int i_5_ = 1; i_5_ <= 5; i_5_++) {
					Class120_Sub14_Sub14_Sub1.method1545(i_5_, true, false, false);
					Class120_Sub14_Sub14_Sub1.method1545(i_5_, true, true, false);
					Class120_Sub12_Sub14.method1269(i_5_, -122);
				}
			}
		} else {
			Class120_Sub14_Sub14_Sub1.method1545(0, true, false, false);
		}
		if (!bool) {
			Class84.method718((byte) -12);
		}
		Class174.method2236(60);
		if (HDToolkit.glEnabled) {
			Class154.method2079(y, true, false, height, x, width);
			width = Class120_Sub12_Sub27.anInt3339;
			height = Light.anInt391;
			y = Class120_Sub28.anInt2751;
			x = Class120_Sub17.anInt2612;
		}
		ParticleEngine.anInt2364 = x;
		ParticleEngine.anInt2358 = y;
		if (client.cameraType != 1) {
			if (client.cameraType == 5) {
				Class27.method240(height);
			}
		} else {
			int i_6_ = (int) Class120_Sub12_Sub21.aFloat3293;
			if (Class26.anInt162 / 256 > i_6_) {
				i_6_ = Class26.anInt162 / 256;
			}
			final int i_7_ = (int) DummyOutputStream.aFloat28 + Class120_Sub14_Sub1.anInt3447 & 0x7ff;
			if (Class120_Sub12_Sub12.aBooleanArray3223[4] && 128 + Class181.anIntArray1790[4] > i_6_) {
				i_6_ = Class181.anIntArray1790[4] + 128;
			}
			Class120_Sub12_Sub30.method1363(57, i_7_, Class22.method197(Class173.gameLevel, Class100.selfPlayer.x, Class100.selfPlayer.z) - 50, i_6_, 3 * i_6_ + 600, Class120_Sub10.playerRenderZ, height, Class69_Sub3_Sub1.playerRenderX);
		}
		final int i_8_ = Class83.renderX;
		final int i_9_ = GroundObjectNode.renderZ;
		final int i_10_ = Class128.renderPitch;
		final int i_11_ = Class120_Sub12_Sub10.renderY;
		final int i_12_ = Class180_Sub3.renderYaw;
		for (int i_13_ = i; i_13_ < 5; i_13_++) {
			if (Class120_Sub12_Sub12.aBooleanArray3223[i_13_]) {
				final int i_14_ = (int) (-Class120_Sub12_Sub37.anIntArray3425[i_13_] + Math.random() * (1 + 2 * Class120_Sub12_Sub37.anIntArray3425[i_13_]) + Math.sin(Class120_Sub1.anIntArray2409[i_13_] / 100.0 * Class120_Sub1.anIntArray2412[i_13_]) * Class181.anIntArray1790[i_13_]);
				if (i_13_ == 1) {
					Class120_Sub12_Sub10.renderY += i_14_;
				}
				if (i_13_ == 4) {
					Class128.renderPitch += i_14_;
					if (Class128.renderPitch < 128) {
						Class128.renderPitch = 128;
					}
					if (Class128.renderPitch > 383) {
						Class128.renderPitch = 383;
					}
				}
				if (i_13_ == 3) {
					Class180_Sub3.renderYaw = 0x7ff & Class180_Sub3.renderYaw + i_14_;
				}
				if (i_13_ == 2) {
					GroundObjectNode.renderZ += i_14_;
				}
				if (i_13_ == 0) {
					Class83.renderX += i_14_;
				}
			}
		}
		Class188.method2484(false);
		if (!HDToolkit.glEnabled) {
			GraphicsLD.clipRect(x, y, width + x, y + height);
			Rasterizer.method874();
			if (Class158.anInt1475 >= 0) {
				final Class41 class41 = Class132_Sub1.method1934(Class120_Sub12.anInt2560, (byte) 127, Class143_Sub1.anInt2197, Class158.anInt1475, Class141.anInt1356);
				class41.method330(Class132.anInt1257, x, y, width, height, Class128.renderPitch, Class180_Sub3.renderYaw, 0);
			} else {
				GraphicsLD.fillRect(x, y, width, height, 0);
			}
		} else {
			GraphicsHD.clipRect(x, y, x + width, height + y);
			float f = Class128.renderPitch * 0.17578125F;
			float f_15_ = Class180_Sub3.renderYaw * 0.17578125F;
			if (client.cameraType == 3) {
				f = Class120_Sub30_Sub1.aFloat3674 * 360.0F / 6.2831855F;
				f_15_ = 360.0F * Class193.aFloat2139 / 6.2831855F;
			}
			int i_16_;
			if (Class109.gameState == 10) {
				i_16_ = Class120_Sub14_Sub18.method1581(Class120_Sub14_Sub14_Sub1.brightness, GroundObjectNode.renderZ >> 10, Class120_Sub12_Sub22.redrawRate, Class83.renderX >> 10);
			} else {
				i_16_ = Class120_Sub14_Sub18.method1581(Class120_Sub14_Sub14_Sub1.brightness, Class100.selfPlayer.anIntArray3040[0] >> 3, Class120_Sub12_Sub22.redrawRate, Class100.selfPlayer.anIntArray2958[0] >> 3);
			}
			if (Class158.anInt1475 >= 0) {
				HDToolkit.method517();
				final Class41 class41 = Class132_Sub1.method1934(Class120_Sub12.anInt2560, (byte) 126, Class143_Sub1.anInt2197, Class158.anInt1475, Class141.anInt1356);
				class41.method331(Class132.anInt1257, x, y, width, height, Class128.renderPitch, Class180_Sub3.renderYaw, i_16_);
			} else {
				HDToolkit.method531(i_16_);
			}
			HDToolkit.method496(x, y, width, height, x - -(width / 2), y + height / 2, f, f_15_, Class179.anInt1775, Class179.anInt1775);
			Class101.method835(-3472, false);
			HDToolkit.method532();
			HDToolkit.method502(true);
			HDToolkit.method507(true);
		}
		if (Class15.menuOpen || Class115.anInt1110 < x || Class115.anInt1110 >= width + x || y > Class120_Sub12_Sub21.anInt3298 || Class120_Sub12_Sub21.anInt3298 >= height + y) {
			Class5.aBoolean2158 = false;
			Class186.actionsLen = 0;
		} else {
			Class186.actionsLen = 0;
			Class5.aBoolean2158 = true;
			final int i_17_ = Class120_Sub12_Sub16.anInt3253;
			final int i_18_ = Class120_Sub30_Sub1.anInt3672;
			final int i_19_ = Class190.anInt2100;
			final int i_20_ = IntegerNode.anInt2792;
			Class173.anInt1728 = i_20_ + (-i_20_ + i_17_) * (Class115.anInt1110 + -x) / width;
			Class2.anInt49 = i_19_ + (-y + Class120_Sub12_Sub21.anInt3298) * (-i_19_ + i_18_) / height;
		}
		Class120_Sub2.method1050();
		final byte i_21_ = Class24.method207() == 2 ? (byte) InterfaceChangeNode.anInt3490 : (byte) 1;
		if (!HDToolkit.glEnabled) {
			Class115.method1007(Class83.renderX, Class120_Sub12_Sub10.renderY, GroundObjectNode.renderZ, Class128.renderPitch, Class180_Sub3.renderYaw, Class9.aByteArrayArrayArray70, Class134.anIntArray1284, Class54.anIntArray488, IntegerNode.anIntArray2787, Class180_Sub6.anIntArray3075, anIntArray2735, Class173.gameLevel - -1, i_21_, Class100.selfPlayer.x >> 7, Class100.selfPlayer.z >> 7);
			Class120_Sub2.method1050();
			Class120_Sub12_Sub13.method1264();
			Class69.method612(x, 256, height, 256, width, y);
			Class143_Sub1.method2027(y, -8967, 256, height, 256, width, x);
		} else {
			LightManager.method1858(Class101_Sub2.loopCycle, !Class191.flickeringEffectsOn);
			Class91.method760(Class180_Sub3.renderYaw, Class128.renderPitch, Class120_Sub12_Sub10.renderY, GroundObjectNode.renderZ, 85, Class83.renderX);
			HDToolkit.anInt542 = Class101_Sub2.loopCycle;
			Class115.method1007(Class83.renderX, Class120_Sub12_Sub10.renderY, GroundObjectNode.renderZ, Class128.renderPitch, Class180_Sub3.renderYaw, Class9.aByteArrayArrayArray70, Class134.anIntArray1284, Class54.anIntArray488, IntegerNode.anIntArray2787, Class180_Sub6.anIntArray3075, anIntArray2735, 1 + Class173.gameLevel, i_21_, Class100.selfPlayer.x >> 7, Class100.selfPlayer.z >> 7);
			Class167.aBoolean1620 = true;
			LightManager.method1859();
			Class91.method760(0, 0, 0, 0, 91, 0);
			Class120_Sub2.method1050();
			Class69.method612(x, Class179.anInt1775, height, Class179.anInt1775, width, y);
			Class143_Sub1.method2027(y, -8967, Class179.anInt1775, height, Class179.anInt1775, width, x);
			Class120_Sub12_Sub13.method1264();
		}
		((Class143_Sub1) Rasterizer.anInterface5_973).method2023(Class120_Sub12_Sub22.redrawRate, -103);
		Class128.drawOverlay(y, x, height, width);
		Class83.renderX = i_8_;
		Class120_Sub12_Sub10.renderY = i_11_;
		Class180_Sub3.renderYaw = i_12_;
		Class128.renderPitch = i_10_;
		GroundObjectNode.renderZ = i_9_;
		if (Class69.aBoolean615 && Class178.aClass45_1772.method366(false) == 0) {
			Class69.aBoolean615 = false;
		}
		if (Class69.aBoolean615) {
			if (!HDToolkit.glEnabled) {
				GraphicsLD.fillRect(x, y, width, height, 0);
			} else {
				GraphicsHD.fillRect(x, y, width, height, 0);
			}
			Class120_Sub12_Sub21_Sub1.drawTextOnScreen(Class120_Sub30_Sub2.aString3679, false);
		}
		if (!bool && !Class69.aBoolean615 && !Class15.menuOpen && x <= Class115.anInt1110 && width + x > Class115.anInt1110 && y <= Class120_Sub12_Sub21.anInt3298 && y + height > Class120_Sub12_Sub21.anInt3298) {
			InterfaceChangeNode.build3dScreenMenu(height, Class115.anInt1110, y, x, width, Class120_Sub12_Sub21.anInt3298);
		}
	}

	StringNode(final String string) {
		this.value = string;
	}
}
