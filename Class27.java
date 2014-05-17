/* Class27 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.lang.reflect.Method;

final class Class27 {
	int anInt164;
	static int anInt165;
	static int anInt166 = 0;
	static boolean aBoolean167;
	int anInt168;
	int anInt169;
	static Class aClass170;

	static {
		anInt165 = 0;
		aBoolean167 = false;
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
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("cm.C(").append(bool).append(',').append(i).append(')').toString());
		}
	}

	final void method237(final Buffer class120_sub7, final byte i) {
		try {
			if (i != 58) {
				method236(true, 65);
			}
			for (;;) {
				final int i_0_ = class120_sub7.getUByte();
				if (i_0_ == 0) {
					break;
				}
				method238(class120_sub7, (byte) -116, i_0_);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("cm.E(").append(class120_sub7 != null ? "{...}" : "null").append(',').append(i).append(')').toString());
		}
	}

	private final void method238(final Buffer class120_sub7, final byte i, final int i_1_) {
		try {
			if (i >= -98) {
				method240(-121);
			}
			if (i_1_ == 1) {
				this.anInt164 = class120_sub7.getUShort();
				this.anInt168 = class120_sub7.getUByte();
				this.anInt169 = class120_sub7.getUByte();
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("cm.B(").append(class120_sub7 != null ? "{...}" : "null").append(',').append(i).append(',').append(i_1_).append(')').toString());
		}
	}

	public Class27() {
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
		int i_7_ = Class128.renderPitch;
		if (Class120_Sub12_Sub12.aBooleanArray3223[4] && i_5_ < Class181.anIntArray1790[4] + 128) {
			i_5_ = Class181.anIntArray1790[4] + 128;
		}
		final int i_8_ = 0x7ff & (int) DummyOutputStream.aFloat28 + Class120_Sub14_Sub1.anInt3447;
		Class120_Sub12_Sub30.method1363(57, i_8_, Class22.method197(Class173.gameLevel, Class100.selfPlayer.x, Class100.selfPlayer.z) - 50, i_5_, 3 * i_5_ + 600, Class120_Sub10.playerRenderZ, i, Class69_Sub3_Sub1.playerRenderX);
		if (Class83.renderX == i_2_ && i_4_ == Class120_Sub12_Sub10.renderY && i_3_ == GroundObjectNode.renderZ && Class128.renderPitch == i_7_ && Class180_Sub3.renderYaw == i_6_) {
			client.cameraType = 1;
		} else {
			Class120_Sub12_Sub31.anInt3384 = 10;
			NpcType.anInt1660 = 10;
			Class120_Sub17.anInt2621 = 10;
			int i_9_ = Class180_Sub3.renderYaw + -i_6_;
			if (i_3_ < GroundObjectNode.renderZ) {
				i_3_ += NpcType.anInt1660 + (-i_3_ + GroundObjectNode.renderZ) * Class120_Sub17.anInt2621 / 1000;
				if (i_3_ < GroundObjectNode.renderZ) {
					GroundObjectNode.renderZ = i_3_;
				}
			}
			if (GroundObjectNode.renderZ < i_3_) {
				i_3_ -= NpcType.anInt1660 - -((-GroundObjectNode.renderZ + i_3_) * Class120_Sub17.anInt2621 / 1000);
				if (GroundObjectNode.renderZ < i_3_) {
					GroundObjectNode.renderZ = i_3_;
				}
			}
			if (i_9_ > 1024) {
				i_9_ -= 2048;
			}
			if (i_4_ < Class120_Sub12_Sub10.renderY) {
				i_4_ += (Class120_Sub12_Sub10.renderY - i_4_) * Class120_Sub17.anInt2621 / 1000 + NpcType.anInt1660;
				if (Class120_Sub12_Sub10.renderY > i_4_) {
					Class120_Sub12_Sub10.renderY = i_4_;
				}
			}
			if (Class120_Sub12_Sub10.renderY < i_4_) {
				i_4_ -= Class120_Sub17.anInt2621 * (-Class120_Sub12_Sub10.renderY + i_4_) / 1000 + NpcType.anInt1660;
				if (i_4_ > Class120_Sub12_Sub10.renderY) {
					Class120_Sub12_Sub10.renderY = i_4_;
				}
			}
			if (i_2_ < Class83.renderX) {
				i_2_ += NpcType.anInt1660 - -(Class120_Sub17.anInt2621 * (Class83.renderX - i_2_) / 1000);
				if (Class83.renderX > i_2_) {
					Class83.renderX = i_2_;
				}
			}
			Class101_Sub1.anInt2272 = 10;
			if (Class83.renderX < i_2_) {
				i_2_ -= Class120_Sub17.anInt2621 * (i_2_ - Class83.renderX) / 1000 + NpcType.anInt1660;
				if (Class83.renderX < i_2_) {
					Class83.renderX = i_2_;
				}
			}
			if (i_9_ < -1024) {
				i_9_ += 2048;
			}
			if (Class128.renderPitch > i_7_) {
				i_7_ += Class120_Sub12_Sub31.anInt3384 + (-i_7_ + Class128.renderPitch) * Class101_Sub1.anInt2272 / 1000;
				if (i_7_ < Class128.renderPitch) {
					Class128.renderPitch = i_7_;
				}
			}
			if (i_9_ > 0) {
				i_6_ += Class101_Sub1.anInt2272 * i_9_ / 1000 + Class120_Sub12_Sub31.anInt3384;
				i_6_ &= 0x7ff;
			}
			if (Class128.renderPitch < i_7_) {
				i_7_ -= Class120_Sub12_Sub31.anInt3384 - -(Class101_Sub1.anInt2272 * (i_7_ - Class128.renderPitch) / 1000);
				if (Class128.renderPitch < i_7_) {
					Class128.renderPitch = i_7_;
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
