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
	static Class aClass170;

	static {
		anInt165 = 0;
		aBoolean167 = false;
	}
	
	public static void resetLol() {
		recentUse = null;
		aClass50_3056 = null;
	}

	static final void method236(final boolean bool, final int i) {
		try {
			if (bool) {
				anInt166 = -76;
			}
			Class108_Sub1.anInt2336 = i;
			CanvasWrapper.anInt20 = -1;
			Class120_Sub2.anInt2422 = -1;
			Class127.method1889((byte) -106);
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("cm.C(").append(bool).append(',').append(i).append(')').toString());
		}
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
			final Method method = (aClass170 == null ? aClass170 = forClassName("java.lang.Runtime") : aClass170).getMethod("maxMemory", new Class[0]);
			if (method != null) {
				try {
					final Runtime runtime = Runtime.getRuntime();
					final Long maxMemory = (Long) method.invoke(runtime, null);
					Class120_Sub14_Sub13.maxMemory = 1 + (int) (maxMemory.longValue() / 1048576L);
				} catch (final Throwable throwable) {
					/* empty */
				}
			}
		} catch (final Exception exception) {
			/* empty */
		}
	}

	static final void method240(final int i) {
		int i_2_ = Class83.renderX;
		int i_3_ = GroundObjectNode.renderZ;
		int i_4_ = Class120_Sub12_Sub10.renderY;
		int i_5_ = (int) Class120_Sub12_Sub21.aFloat3293;
		int i_6_ = Class180_Sub3.renderYaw;
		if (Class26.anInt162 / 256 > i_5_) {
			i_5_ = Class26.anInt162 / 256;
		}
		int i_7_ = OverlayType.renderPitch;
		if (Class120_Sub12_Sub12.aBooleanArray3223[4] && i_5_ < Class181.anIntArray1790[4] + 128) {
			i_5_ = Class181.anIntArray1790[4] + 128;
		}
		final int i_8_ = 0x7ff & (int) DummyOutputStream.aFloat28 + Class120_Sub14_Sub1.anInt3447;
		Class120_Sub12_Sub30.method1363(57, i_8_, Class22.getTileHeight(Class173.gameLevel, Class100.selfPlayer.x, Class100.selfPlayer.z) - 50, i_5_, 3 * i_5_ + 600, InterfaceListener.playerRenderZ, i, Class69_Sub3_Sub1.playerRenderX);
		if (Class83.renderX == i_2_ && i_4_ == Class120_Sub12_Sub10.renderY && i_3_ == GroundObjectNode.renderZ && OverlayType.renderPitch == i_7_ && Class180_Sub3.renderYaw == i_6_) {
			client.cameraType = 1;
		} else {
			Class120_Sub12_Sub31.anInt3384 = 10;
			NpcType.anInt1660 = 10;
			ObjectContainer.anInt2621 = 10;
			int i_9_ = Class180_Sub3.renderYaw + -i_6_;
			if (i_3_ < GroundObjectNode.renderZ) {
				i_3_ += NpcType.anInt1660 + (-i_3_ + GroundObjectNode.renderZ) * ObjectContainer.anInt2621 / 1000;
				if (i_3_ < GroundObjectNode.renderZ) {
					GroundObjectNode.renderZ = i_3_;
				}
			}
			if (GroundObjectNode.renderZ < i_3_) {
				i_3_ -= NpcType.anInt1660 - -((-GroundObjectNode.renderZ + i_3_) * ObjectContainer.anInt2621 / 1000);
				if (GroundObjectNode.renderZ < i_3_) {
					GroundObjectNode.renderZ = i_3_;
				}
			}
			if (i_9_ > 1024) {
				i_9_ -= 2048;
			}
			if (i_4_ < Class120_Sub12_Sub10.renderY) {
				i_4_ += (Class120_Sub12_Sub10.renderY - i_4_) * ObjectContainer.anInt2621 / 1000 + NpcType.anInt1660;
				if (Class120_Sub12_Sub10.renderY > i_4_) {
					Class120_Sub12_Sub10.renderY = i_4_;
				}
			}
			if (Class120_Sub12_Sub10.renderY < i_4_) {
				i_4_ -= ObjectContainer.anInt2621 * (-Class120_Sub12_Sub10.renderY + i_4_) / 1000 + NpcType.anInt1660;
				if (i_4_ > Class120_Sub12_Sub10.renderY) {
					Class120_Sub12_Sub10.renderY = i_4_;
				}
			}
			if (i_2_ < Class83.renderX) {
				i_2_ += NpcType.anInt1660 - -(ObjectContainer.anInt2621 * (Class83.renderX - i_2_) / 1000);
				if (Class83.renderX > i_2_) {
					Class83.renderX = i_2_;
				}
			}
			Class101_Sub1.anInt2272 = 10;
			if (Class83.renderX < i_2_) {
				i_2_ -= ObjectContainer.anInt2621 * (i_2_ - Class83.renderX) / 1000 + NpcType.anInt1660;
				if (Class83.renderX < i_2_) {
					Class83.renderX = i_2_;
				}
			}
			if (i_9_ < -1024) {
				i_9_ += 2048;
			}
			if (OverlayType.renderPitch > i_7_) {
				i_7_ += Class120_Sub12_Sub31.anInt3384 + (-i_7_ + OverlayType.renderPitch) * Class101_Sub1.anInt2272 / 1000;
				if (i_7_ < OverlayType.renderPitch) {
					OverlayType.renderPitch = i_7_;
				}
			}
			if (i_9_ > 0) {
				i_6_ += Class101_Sub1.anInt2272 * i_9_ / 1000 + Class120_Sub12_Sub31.anInt3384;
				i_6_ &= 0x7ff;
			}
			if (OverlayType.renderPitch < i_7_) {
				i_7_ -= Class120_Sub12_Sub31.anInt3384 - -(Class101_Sub1.anInt2272 * (i_7_ - OverlayType.renderPitch) / 1000);
				if (OverlayType.renderPitch < i_7_) {
					OverlayType.renderPitch = i_7_;
				}
			}
			if (i_9_ < 0) {
				i_6_ -= Class120_Sub12_Sub31.anInt3384 + -i_9_ * Class101_Sub1.anInt2272 / 1000;
				i_6_ &= 0x7ff;
			}
			int i_10_ = Class180_Sub3.renderYaw - i_6_;
			if (i_10_ > 1024) {
				i_10_ -= 2048;
			}
			if (i_10_ < -1024) {
				i_10_ += 2048;
			}
			if (i_10_ >= 0 || i_9_ <= 0 || i_10_ > 0 && i_9_ < 0) {
				Class180_Sub3.renderYaw = i_6_;
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
