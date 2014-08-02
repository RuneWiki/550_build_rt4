/* Class120_Sub25 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class StringNode extends Node {
	static int[] anIntArray2733;
	static boolean aBoolean2734;
	static int[] anIntArray2735 = new int[2];
	String value;
	static Buffer[] playerAppearanceBuffers = new Buffer[2048];

	public static void method1719(final int i) {
		try {
			playerAppearanceBuffers = null;
			anIntArray2733 = null;
			if (i <= 39) {
				method1719(20);
			}
			anIntArray2735 = null;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("rk.B(").append(i).append(')').toString());
		}
	}

	static final void method1720() {
		SpotAnimType.recentUse.clear();
		SpotAnimType.aClass21_1798.clear();
	}

	public StringNode() {
		/* empty */
	}

	static final void method1721(int x, int y, int width, int height, final boolean titleScreen) {
		InterfaceChangeNode.anInt3490++;
		Class82.method715();
		if (!titleScreen) {
			Class120_Sub12_Sub14.method1269(0);
			FileSystemRequest.method1545(0, false, true);
			if (Class134.entityRenderPriority != 0) {
				for (int size = 1; size <= 5; size++) {
					Class120_Sub12_Sub14.method1269(size);
					FileSystemRequest.method1545(size, false, false);
					FileSystemRequest.method1545(size, true, false);
				}
			} else {
				for (int size = 1; size <= 5; size++) {
					FileSystemRequest.method1545(size, false, false);
					FileSystemRequest.method1545(size, true, false);
					Class120_Sub12_Sub14.method1269(size);
				}
			}
		} else {
			FileSystemRequest.method1545(0, false, false);
		}
		if (!titleScreen) {
			GZIPDecompressor.method718();
		}
		Class174.method2236();
		if (HDToolkit.glEnabled) {
			Class154.method2079(y, true, false, height, x, width);
			width = Class120_Sub12_Sub27.anInt3339;
			height = Light.anInt391;
			y = Class120_Sub28.anInt2751;
			x = ObjectContainer.anInt2612;
		}
		ParticleEngine.anInt2364 = x;
		ParticleEngine.anInt2358 = y;
		if (client.cameraType != 1) {
			if (client.cameraType == 5) {
				VarBit.method240(height);
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
			Class120_Sub12_Sub30.method1363(57, i_7_, Class22.getTileHeight(Class173.gameLevel, TileParticleQueue.selfPlayer.x, TileParticleQueue.selfPlayer.z) - 50, i_6_, 3 * i_6_ + 600, InterfaceListener.playerRenderZ, height, Class69_Sub3_Sub1.playerRenderX);
		}
		final int i_8_ = FileSystemWorker.renderX;
		final int i_9_ = GroundObjectNode.renderZ;
		final int i_10_ = OverlayType.renderPitch;
		final int i_11_ = Class120_Sub12_Sub10.renderY;
		final int i_12_ = SpotAnimation.renderYaw;
		for (int i_13_ = 0; i_13_ < 5; i_13_++) {
			if (Class120_Sub12_Sub12.aBooleanArray3223[i_13_]) {
				final int i_14_ = (int) (-Class120_Sub12_Sub37.anIntArray3425[i_13_] + Math.random() * (1 + 2 * Class120_Sub12_Sub37.anIntArray3425[i_13_]) + Math.sin(LabelGroup.anIntArray2409[i_13_] / 100.0 * LabelGroup.anIntArray2412[i_13_]) * Class181.anIntArray1790[i_13_]);
				if (i_13_ == 1) {
					Class120_Sub12_Sub10.renderY += i_14_;
				}
				if (i_13_ == 4) {
					OverlayType.renderPitch += i_14_;
					if (OverlayType.renderPitch < 128) {
						OverlayType.renderPitch = 128;
					}
					if (OverlayType.renderPitch > 383) {
						OverlayType.renderPitch = 383;
					}
				}
				if (i_13_ == 3) {
					SpotAnimation.renderYaw = 0x7ff & SpotAnimation.renderYaw + i_14_;
				}
				if (i_13_ == 2) {
					GroundObjectNode.renderZ += i_14_;
				}
				if (i_13_ == 0) {
					FileSystemWorker.renderX += i_14_;
				}
			}
		}
		Class188.method2484(false);
		if (!HDToolkit.glEnabled) {
			GraphicsLD.clipRect(x, y, width + x, y + height);
			Rasterizer.calculateByBounds();
			if (Class158.anInt1475 >= 0) {
				final Class41 class41 = Class132_Sub1.method1934(Class120_Sub12.anInt2560, (byte) 127, Class143_Sub1.anInt2197, Class158.anInt1475, PlainTile.anInt1356);
				class41.method330(Class132.anInt1257, x, y, width, height, OverlayType.renderPitch, SpotAnimation.renderYaw, 0);
			} else {
				GraphicsLD.fillRect(x, y, width, height, 0);
			}
		} else {
			GraphicsHD.clipRect(x, y, x + width, height + y);
			float f = OverlayType.renderPitch * 0.17578125F;
			float f_15_ = SpotAnimation.renderYaw * 0.17578125F;
			if (client.cameraType == 3) {
				f = Class120_Sub30_Sub1.aFloat3674 * 360.0F / 6.2831855F;
				f_15_ = 360.0F * SeekableFile.aFloat2139 / 6.2831855F;
			}
			int i_16_;
			if (Class109.gameState == 10) {
				i_16_ = FrameLoader.method1581(FileSystemRequest.brightness, GroundObjectNode.renderZ >> 10, Class120_Sub12_Sub22.redrawRate, FileSystemWorker.renderX >> 10);
			} else {
				i_16_ = FrameLoader.method1581(FileSystemRequest.brightness, TileParticleQueue.selfPlayer.walkQueueZ[0] >> 3, Class120_Sub12_Sub22.redrawRate, TileParticleQueue.selfPlayer.walkQueueX[0] >> 3);
			}
			if (Class158.anInt1475 >= 0) {
				HDToolkit.method517();
				final Class41 class41 = Class132_Sub1.method1934(Class120_Sub12.anInt2560, (byte) 126, Class143_Sub1.anInt2197, Class158.anInt1475, PlainTile.anInt1356);
				class41.method331(Class132.anInt1257, x, y, width, height, OverlayType.renderPitch, SpotAnimation.renderYaw, i_16_);
			} else {
				HDToolkit.method531(i_16_);
			}
			HDToolkit.method496(x, y, width, height, x - -(width / 2), y + height / 2, f, f_15_, Class179.anInt1775, Class179.anInt1775);
			Class101.method835(false);
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
			Class115.method1007(FileSystemWorker.renderX, Class120_Sub12_Sub10.renderY, GroundObjectNode.renderZ, OverlayType.renderPitch, SpotAnimation.renderYaw, Class9.aByteArrayArrayArray70, Class134.anIntArray1284, Class54.anIntArray488, IntegerNode.anIntArray2787, AnimatedLocation.anIntArray3075, anIntArray2735, Class173.gameLevel - -1, i_21_, TileParticleQueue.selfPlayer.x >> 7, TileParticleQueue.selfPlayer.z >> 7);
			Class120_Sub2.method1050();
			Class120_Sub12_Sub13.method1264();
			Class69.method612(x, y, width, height, 256, 256);
			Class143_Sub1.method2027(x, y, width, height, 256, 256);
		} else {
			LightManager.method1858(Class101_Sub2.loopCycle, !Class191.flickeringEffectsOn);
			MouseRecorder.method760(SpotAnimation.renderYaw, OverlayType.renderPitch, Class120_Sub12_Sub10.renderY, GroundObjectNode.renderZ, 85, FileSystemWorker.renderX);
			HDToolkit.anInt542 = Class101_Sub2.loopCycle;
			Class115.method1007(FileSystemWorker.renderX, Class120_Sub12_Sub10.renderY, GroundObjectNode.renderZ, OverlayType.renderPitch, SpotAnimation.renderYaw, Class9.aByteArrayArrayArray70, Class134.anIntArray1284, Class54.anIntArray488, IntegerNode.anIntArray2787, AnimatedLocation.anIntArray3075, anIntArray2735, 1 + Class173.gameLevel, i_21_, TileParticleQueue.selfPlayer.x >> 7, TileParticleQueue.selfPlayer.z >> 7);
			Class167.aBoolean1620 = true;
			LightManager.method1859();
			MouseRecorder.method760(0, 0, 0, 0, 91, 0);
			Class120_Sub2.method1050();
			Class69.method612(x, y, width, height, Class179.anInt1775, Class179.anInt1775);
			Class143_Sub1.method2027(x, y, width, height, Class179.anInt1775, Class179.anInt1775);
			Class120_Sub12_Sub13.method1264();
		}
		((Class143_Sub1) Rasterizer.anInterface5_973).method2023(Class120_Sub12_Sub22.redrawRate, -103);
		OverlayType.drawOverlay(y, x, height, width);
		FileSystemWorker.renderX = i_8_;
		Class120_Sub12_Sub10.renderY = i_11_;
		SpotAnimation.renderYaw = i_12_;
		OverlayType.renderPitch = i_10_;
		GroundObjectNode.renderZ = i_9_;
		if (Class69.aBoolean615 && Class178.js5Worker.getUrgentSize() == 0) {
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
		if (!titleScreen && !Class69.aBoolean615 && !Class15.menuOpen && x <= Class115.anInt1110 && width + x > Class115.anInt1110 && y <= Class120_Sub12_Sub21.anInt3298 && y + height > Class120_Sub12_Sub21.anInt3298) {
			InterfaceChangeNode.build3dScreenMenu(height, Class115.anInt1110, y, x, width, Class120_Sub12_Sub21.anInt3298);
		}
	}

	StringNode(final String string) {
		this.value = string;
	}
}
