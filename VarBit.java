/* Class27 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.lang.reflect.Method;

final class VarBit {
	int setting;
	static int anInt165;
	static int anInt166 = 0;
	static boolean aBoolean167;
	int startBit;
	int endBit;
	static js5 aClass50_3056;
	static ObjectCache recentUse = new ObjectCache(64);
	static Class runtimeClass;

	static {
		anInt165 = 0;
		aBoolean167 = false;
	}
	
	static final void method236(final int i) {
		ParticleEmitter.anInt2336 = i;
		CanvasWrapper.anInt20 = -1;
		Class120_Sub2.anInt2422 = -1;
		Class127.fixWorldMapBounds();
	}

	final void decode(final Buffer buffer) {
		for (;;) {
			final int code = buffer.getUByte();
			if (code == 0) {
				break;
			}
			decode(buffer, code);
		}
	}

	private final void decode(final Buffer buffer, final int code) {
		if (code == 1) {
			this.setting = buffer.getUShort();
			this.startBit = buffer.getUByte();
			this.endBit = buffer.getUByte();
		}
	}

	static final void setup(final js5 js5) {
		aClass50_3056 = js5;
	}

	static final int getVarbitValue(final int id) {
		final VarBit varBit = list(id);
		final int setting = varBit.setting;
		final int startBit = varBit.startBit;
		final int endBit = varBit.endBit;
		final int mask = Class120_Sub14_Sub15.masklookup[endBit - startBit];
		return Class2.permanentVariable[setting] >> startBit & mask;
	}

	static final VarBit list(final int id) {
		VarBit varBit = (VarBit) recentUse.get(id);
		if (varBit != null) {
			return varBit;
		}
		final byte[] data = aClass50_3056.getFile(id >>> 10, id & 0x3ff);
		varBit = new VarBit();
		if (data != null) {
			varBit.decode(new Buffer(data));
		}
		recentUse.put(varBit, id);
		return varBit;
	}

	public VarBit() {
		/* empty */
	}

	static final void calculateMaxMemory() {
		try {
			final Method method = (runtimeClass == null ? runtimeClass = forClassName("java.lang.Runtime") : runtimeClass).getMethod("maxMemory", new Class[0]);
			if (method != null) {
				try {
					final Runtime runtime = Runtime.getRuntime();
					final Long maxMemory = (Long) method.invoke(runtime, null);
					Class120_Sub14_Sub13.maxMemory = 1 + (int) (maxMemory.longValue() / 1048576L);
				} catch (final Throwable throwable) {
					throwable.printStackTrace();
				}
			}
		} catch (final Exception exception) {
			exception.printStackTrace();
		}
	}

	static final void method240(final int i) {
		int oldRenderX = FileSystemWorker.renderX;
		int oldRenderY = Class120_Sub12_Sub10.renderY;
		int oldRenderZ = GroundObjectNode.renderZ;
		int oldRenderPitch = UnderlayType.renderPitch;
		int oldRenderYaw = SpotAnimation.renderYaw;
		int cameraPitch = (int) Class120_Sub12_Sub21.cameraPitch;
		final int cameraYaw = (int) DummyOutputStream.cameraYaw & 0x7ff;
		if (Normal.cameraYLimit / 256 > cameraPitch) {
			cameraPitch = Normal.cameraYLimit / 256;
		}
		if (Class120_Sub12_Sub12.aBooleanArray3223[4] && cameraPitch < LightType.anIntArray1790[4] + 128) {
			cameraPitch = LightType.anIntArray1790[4] + 128;
		}
		Class120_Sub12_Sub30.method1363(Class69_Sub3_Sub1.cameraX, Class22.getTileHeight(TileParticleQueue.selfPlayer.x, TileParticleQueue.selfPlayer.z, Class173.gameLevel) - 50, InterfaceListener.cameraZ, cameraYaw, cameraPitch, 3 * cameraPitch + 600, i);
		if (FileSystemWorker.renderX == oldRenderX && oldRenderY == Class120_Sub12_Sub10.renderY && oldRenderZ == GroundObjectNode.renderZ && UnderlayType.renderPitch == oldRenderPitch && SpotAnimation.renderYaw == oldRenderYaw) {
			client.cameraType = 1;
		} else {
			Class120_Sub12_Sub31.anInt3384 = 10;
			NpcType.anInt1660 = 10;
			ObjectContainer.anInt2621 = 10;
			Class101_Sub1.anInt2272 = 10;
			if (oldRenderX < FileSystemWorker.renderX) {
				oldRenderX += NpcType.anInt1660 + (FileSystemWorker.renderX - oldRenderX) * ObjectContainer.anInt2621 / 1000;
				if (FileSystemWorker.renderX > oldRenderX) {
					FileSystemWorker.renderX = oldRenderX;
				}
			}
			if (oldRenderX > FileSystemWorker.renderX) {
				oldRenderX -= NpcType.anInt1660 + (oldRenderX - FileSystemWorker.renderX) * ObjectContainer.anInt2621 / 1000;
				if (FileSystemWorker.renderX < oldRenderX) {
					FileSystemWorker.renderX = oldRenderX;
				}
			}
			if (oldRenderZ < GroundObjectNode.renderZ) {
				oldRenderZ += NpcType.anInt1660 + (GroundObjectNode.renderZ - oldRenderZ) * ObjectContainer.anInt2621 / 1000;
				if (GroundObjectNode.renderZ > oldRenderZ) {
					GroundObjectNode.renderZ = oldRenderZ;
				}
			}
			if (oldRenderZ > GroundObjectNode.renderZ) {
				oldRenderZ -= NpcType.anInt1660 + (oldRenderZ - GroundObjectNode.renderZ) * ObjectContainer.anInt2621 / 1000;
				if (GroundObjectNode.renderZ < oldRenderZ) {
					GroundObjectNode.renderZ = oldRenderZ;
				}
			}
			if (oldRenderY < Class120_Sub12_Sub10.renderY) {
				oldRenderY += NpcType.anInt1660 + (Class120_Sub12_Sub10.renderY - oldRenderY) * ObjectContainer.anInt2621 / 1000;
				if (Class120_Sub12_Sub10.renderY > oldRenderY) {
					Class120_Sub12_Sub10.renderY = oldRenderY;
				}
			}
			if (oldRenderY > Class120_Sub12_Sub10.renderY) {
				oldRenderY -= NpcType.anInt1660 + (oldRenderY - Class120_Sub12_Sub10.renderY) * ObjectContainer.anInt2621 / 1000;
				if (Class120_Sub12_Sub10.renderY < oldRenderY) {
					Class120_Sub12_Sub10.renderY = oldRenderY;
				}
			}
			if (UnderlayType.renderPitch < oldRenderPitch) {
				oldRenderPitch -= Class120_Sub12_Sub31.anInt3384 + (oldRenderPitch - UnderlayType.renderPitch) * Class101_Sub1.anInt2272 / 100;
				if (UnderlayType.renderPitch < oldRenderPitch) {
					UnderlayType.renderPitch = oldRenderPitch;
				}
			}
			if (UnderlayType.renderPitch > oldRenderPitch) {
				oldRenderPitch += Class120_Sub12_Sub31.anInt3384 + (UnderlayType.renderPitch - oldRenderPitch) * Class101_Sub1.anInt2272 / 1000;
				if (UnderlayType.renderPitch > oldRenderPitch) {
					UnderlayType.renderPitch = oldRenderPitch;
				}
			}
			int yawDelta = SpotAnimation.renderYaw - oldRenderYaw;
			if (yawDelta > 1024) {
				yawDelta -= 2048;
			}
			if (yawDelta < -1024) {
				yawDelta += 2048;
			}
			if (yawDelta < 0) {
				oldRenderYaw -= Class120_Sub12_Sub31.anInt3384 - Class101_Sub1.anInt2272 * yawDelta / 1000;
				oldRenderYaw &= 0x7ff;
			}
			if (yawDelta > 0) {
				oldRenderYaw += Class120_Sub12_Sub31.anInt3384 + Class101_Sub1.anInt2272 * yawDelta / 1000;
				oldRenderYaw &= 0x7ff;
			}
			int yawDelta2 = SpotAnimation.renderYaw - oldRenderYaw;
			if (yawDelta2 > 1024) {
				yawDelta2 -= 2048;
			}
			if (yawDelta2 < -1024) {
				yawDelta2 += 2048;
			}
			if (yawDelta2 >= 0 || yawDelta <= 0 || yawDelta2 > 0 && yawDelta < 0) {
				SpotAnimation.renderYaw = oldRenderYaw;
			}
		}
	}

	static Class forClassName(final String string) {
		Class var_class = null;
		try {
			var_class = Class.forName(string);
		} catch (final ClassNotFoundException classnotfoundexception) {
			try {
				throw new NoClassDefFoundError().initCause(classnotfoundexception);
			} catch (final Throwable throwable) {
				throwable.printStackTrace();
			}
		}
		return var_class;
	}
}
