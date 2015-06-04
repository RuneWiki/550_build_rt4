/* Class120_Sub25 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class StringNode extends Node {
	static int[] anIntArray2733;
	static boolean aBoolean2734;
	static int[] anIntArray2735 = new int[2];
	String value;
	static Buffer[] playerAppearanceBuffers = new Buffer[2048];

	static final void method1720() {
		SpotAnimType.recentUse.clear();
		SpotAnimType.modelCache.clear();
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
		Class174.processSpotAnimations();
		if (HDToolkit.glEnabled) {
			Class154.method2079(x, y, width, height, true);
			x = ObjectContainer.anInt2612;
			y = ReflectionCheckNode.anInt2751;
			width = Class120_Sub12_Sub27.anInt3339;
			height = Light.anInt391;
		}
		ParticleEngine.anInt2364 = x;
		ParticleEngine.anInt2358 = y;
		if (client.cameraType == 1) {
			int pitch = (int) Class120_Sub12_Sub21.cameraPitch;
			if (Normal.cameraYLimit / 256 > pitch) {
				pitch = Normal.cameraYLimit / 256;
			}
			final int yaw = (int) DummyOutputStream.cameraYaw & 0x7ff;
			if (Class120_Sub12_Sub12.aBooleanArray3223[4] && 128 + LightType.anIntArray1790[4] > pitch) {
				pitch = LightType.anIntArray1790[4] + 128;
			}
			Class120_Sub12_Sub30.method1363(Class69_Sub3_Sub1.cameraX, Class22.getTileHeight(TileParticleQueue.selfPlayer.x, TileParticleQueue.selfPlayer.z, Class173.gameLevel) - 50, InterfaceListener.cameraZ, yaw, pitch, 3 * pitch + 600, height);
		} else if (client.cameraType == 5) {
			VarBit.method240(height);
		}
		final int i_8_ = FileSystemWorker.renderX;
		final int i_11_ = Class120_Sub12_Sub10.renderY;
		final int i_9_ = GroundObjectNode.renderZ;
		final int i_12_ = SpotAnimation.renderYaw;
		final int i_10_ = UnderlayType.renderPitch;
		for (int i_13_ = 0; i_13_ < 5; i_13_++) {
			if (Class120_Sub12_Sub12.aBooleanArray3223[i_13_]) {
				final int i_14_ = (int) (-Class120_Sub12_Sub37.anIntArray3425[i_13_] + Math.random() * (1 + 2 * Class120_Sub12_Sub37.anIntArray3425[i_13_]) + Math.sin(LabelGroup.anIntArray2409[i_13_] / 100.0 * LabelGroup.anIntArray2412[i_13_]) * LightType.anIntArray1790[i_13_]);
				if (i_13_ == 0) {
					FileSystemWorker.renderX += i_14_;
				}
				if (i_13_ == 1) {
					Class120_Sub12_Sub10.renderY += i_14_;
				}
				if (i_13_ == 2) {
					GroundObjectNode.renderZ += i_14_;
				}
				if (i_13_ == 3) {
					SpotAnimation.renderYaw = SpotAnimation.renderYaw + i_14_ & 0x7ff;
				}
				if (i_13_ == 4) {
					UnderlayType.renderPitch += i_14_;
					if (UnderlayType.renderPitch < 128) {
						UnderlayType.renderPitch = 128;
					}
					if (UnderlayType.renderPitch > 383) {
						UnderlayType.renderPitch = 383;
					}
				}
			}
		}
		Class188.method2484();
		if (!HDToolkit.glEnabled) {
			GraphicsLD.clipRect(x, y, x + width, y + height);
			Rasterizer.calculateByBounds();
			if (ModelParticleEmitter.anInt1475 >= 0) {//Skyboxes in 550?
				final Class41 class41 = Class132_Sub1.method1934(Class120_Sub12.anInt2560, Class143_Sub1.anInt2197, ModelParticleEmitter.anInt1475, PlainTile.anInt1356);
				class41.method330(Class132.anInt1257, x, y, width, height, UnderlayType.renderPitch, SpotAnimation.renderYaw, 0);
			} else {
				GraphicsLD.fillRect(x, y, width, height, 0);
			}
		} else {
			GraphicsHD.clipRect(x, y, x + width, height + y);
			float pitchAsDegrees = UnderlayType.renderPitch * 0.17578125F;
			float yawAsDegrees = SpotAnimation.renderYaw * 0.17578125F;
			if (client.cameraType == 3) {
				pitchAsDegrees = Class120_Sub30_Sub1.aFloat3674 * 360.0F / 6.2831855F;
				yawAsDegrees = SeekableFile.aFloat2139 * 360.0F / 6.2831855F;
			}
			int i_16_;
			if (Class109.gameState == 10) {
				i_16_ = FrameGroup.method1581(FileSystemWorker.renderX >> 10, GroundObjectNode.renderZ >> 10, FileSystemRequest.brightness, Class120_Sub12_Sub22.redrawRate);
			} else {
				i_16_ = FrameGroup.method1581(TileParticleQueue.selfPlayer.walkQueueX[0] >> 3, TileParticleQueue.selfPlayer.walkQueueZ[0] >> 3, FileSystemRequest.brightness, Class120_Sub12_Sub22.redrawRate);
			}
			if (ModelParticleEmitter.anInt1475 >= 0) {//Skyboxes in 550?
				HDToolkit.clearDepthBuffer();
				final Class41 class41 = Class132_Sub1.method1934(Class120_Sub12.anInt2560, Class143_Sub1.anInt2197, ModelParticleEmitter.anInt1475, PlainTile.anInt1356);
				class41.method331(Class132.anInt1257, x, y, width, height, UnderlayType.renderPitch, SpotAnimation.renderYaw, i_16_);
			} else {
				HDToolkit.method531(i_16_);
			}
			HDToolkit.method496(x, y, width, height, x + width / 2, y + height / 2, pitchAsDegrees, yawAsDegrees, Class179.anInt1775, Class179.anInt1775);
			Class101.refreshAtmosphere(false);
			HDToolkit.method532();
			HDToolkit.toggleDepthTest(true);
			HDToolkit.toggleFog(true);
		}
		if (Class15.menuOpen || Class115.menuMouseX < x || Class115.menuMouseX >= width + x || y > Class120_Sub12_Sub21.menuMouseY || Class120_Sub12_Sub21.menuMouseY >= height + y) {
			Class5.aBoolean2158 = false;
			WallDecoration.actionsLen = 0;
		} else {
			WallDecoration.actionsLen = 0;
			Class5.aBoolean2158 = true;
			final int i_17_ = Class120_Sub12_Sub16.anInt3253;
			final int i_18_ = Class120_Sub30_Sub1.anInt3672;
			final int i_19_ = Class190.anInt2100;
			final int i_20_ = IntegerNode.anInt2792;
			Class173.anInt1728 = i_20_ + (-i_20_ + i_17_) * (Class115.menuMouseX + -x) / width;
			Class2.anInt49 = i_19_ + (-y + Class120_Sub12_Sub21.menuMouseY) * (-i_19_ + i_18_) / height;
		}
		Class120_Sub2.method1050();
		final byte i_21_ = Class24.method207() == 2 ? (byte) InterfaceChangeNode.anInt3490 : (byte) 1;
		if (!HDToolkit.glEnabled) {
			Class115.method1007(FileSystemWorker.renderX, Class120_Sub12_Sub10.renderY, GroundObjectNode.renderZ, UnderlayType.renderPitch, SpotAnimation.renderYaw, Class9.aByteArrayArrayArray70, Class134.anIntArray1284, Class54.anIntArray488, IntegerNode.anIntArray2787, AnimatedLocation.anIntArray3075, anIntArray2735, Class173.gameLevel + 1, i_21_, TileParticleQueue.selfPlayer.x >> 7, TileParticleQueue.selfPlayer.z >> 7);
			Class120_Sub2.method1050();
			Class120_Sub12_Sub13.method1264();
			Class69.method612(x, y, width, height, 256, 256);
			Class143_Sub1.method2027(x, y, width, height, 256, 256);
		} else {
			LightManager.update(Class101_Sub2.loopCycle, !ChunkAtmosphere.flickeringEffectsOn);
			MouseRecorder.setupShaderRenderValues(FileSystemWorker.renderX, Class120_Sub12_Sub10.renderY, GroundObjectNode.renderZ, SpotAnimation.renderYaw, UnderlayType.renderPitch);
			HDToolkit.loopCycleWrapper = Class101_Sub2.loopCycle;
			Class115.method1007(FileSystemWorker.renderX, Class120_Sub12_Sub10.renderY, GroundObjectNode.renderZ, UnderlayType.renderPitch, SpotAnimation.renderYaw, Class9.aByteArrayArrayArray70, Class134.anIntArray1284, Class54.anIntArray488, IntegerNode.anIntArray2787, AnimatedLocation.anIntArray3075, anIntArray2735, Class173.gameLevel + 1, i_21_, TileParticleQueue.selfPlayer.x >> 7, TileParticleQueue.selfPlayer.z >> 7);
			Class167.clearDepthBuffer = true;
			LightManager.disableLights();
			MouseRecorder.setupShaderRenderValues(0, 0, 0, 0, 0);
			Class120_Sub2.method1050();
			Class69.method612(x, y, width, height, Class179.anInt1775, Class179.anInt1775);
			Class143_Sub1.method2027(x, y, width, height, Class179.anInt1775, Class179.anInt1775);
			Class120_Sub12_Sub13.method1264();
		}
		((Class143_Sub1) Rasterizer.anInterface5_973).method2023(Class120_Sub12_Sub22.redrawRate);
		UnderlayType.drawOverlay(x, y, width, height);
		FileSystemWorker.renderX = i_8_;
		Class120_Sub12_Sub10.renderY = i_11_;
		SpotAnimation.renderYaw = i_12_;
		UnderlayType.renderPitch = i_10_;
		GroundObjectNode.renderZ = i_9_;
		if (Class69.loadingScreenOpened && Class178.js5Worker.getUrgentSize() == 0) {
			Class69.loadingScreenOpened = false;
		}
		if (Class69.loadingScreenOpened) {
			if (HDToolkit.glEnabled) {
				GraphicsHD.fillRect(x, y, width, height, 0);
			} else {
				GraphicsLD.fillRect(x, y, width, height, 0);
			}
			Class120_Sub12_Sub21_Sub1.drawTextOnScreen(StringLibrary.loadingPleaseWait, false);
		}
		if (!titleScreen && !Class69.loadingScreenOpened && !Class15.menuOpen && x <= Class115.menuMouseX && width + x > Class115.menuMouseX && y <= Class120_Sub12_Sub21.menuMouseY && y + height > Class120_Sub12_Sub21.menuMouseY) {
			InterfaceChangeNode.build3dScreenMenu(x, y, width, height, Class115.menuMouseX, Class120_Sub12_Sub21.menuMouseY);
		}
	}

	StringNode(final String string) {
		this.value = string;
	}
}
