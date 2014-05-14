/* Class51 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.EOFException;
import java.io.IOException;

final class FileSystem {
	static int[] anIntArray453 = { 76, 8, 137, 4, 0, 1, 38, 2, 19 };
	private Class193 aClass193_454 = null;
	static int anInt455;
	static Deque aClass105_456;
	static int anInt457;
	static Class40[] aClass40Array458;
	static int anInt459 = 0;
	static float aFloat460;
	static boolean haveInternetExplorer6;
	private Class193 aClass193_462 = null;
	private int anInt463 = 65000;
	private final int anInt464;

	static {
		anInt455 = 0;
		haveInternetExplorer6 = false;
		aClass40Array458 = new Class40[14];
		aClass105_456 = new Deque();
	}

	static final int method443(final int i, final int i_0_, final int i_1_, final int i_2_) {
		int i_3_;
		try {
			if (i_1_ != 13080) {
				return 64;
			}
			int i_4_ = Rasterizer.anIntArray969[Class180_Sub7_Sub1.method2401(i_2_, i)];
			if (i_0_ > 0) {
				final int i_5_ = Rasterizer.anInterface5_973.method24(i_0_ & 0xffff, false);
				if (i_5_ != 0) {
					int i_6_;
					if (i >= 0) {
						if (i > 127) {
							i_6_ = 16777215;
						} else {
							i_6_ = 131586 * i;
						}
					} else {
						i_6_ = 0;
					}
					if (i_5_ != 256) {
						final int i_7_ = i_5_;
						final int i_8_ = 256 - i_5_;
						i_4_ = (i_8_ * (0xff00ff & i_4_) + i_7_ * (0xff00ff & i_6_) & ~0xff00ff) - -((0xff00 & i_6_) * i_7_ - -((i_4_ & 0xff00) * i_8_) & 0xff0000) >> 8;
					} else {
						i_4_ = i_6_;
					}
				}
				int i_9_ = Rasterizer.anInterface5_973.method21((byte) -119, i_0_ & 0xffff);
				if (i_9_ != 0) {
					i_9_ += 256;
					int i_10_ = i_9_ * (0xff & i_4_ >> 16);
					if (65535 < i_10_) {
						i_10_ = 65535;
					}
					int i_11_ = ((0xff00 & i_4_) >> 8) * i_9_;
					if (-65536 > (i_11_ ^ 0xffffffff)) {
						i_11_ = 65535;
					}
					int i_12_ = (0xff & i_4_) * i_9_;
					if ((i_12_ ^ 0xffffffff) < -65536) {
						i_12_ = 65535;
					}
					i_4_ = (i_10_ << 8 & 0xff0066) - (-(0xff00 & i_11_) + -(i_12_ >> 8));
				}
			}
			i_3_ = i_4_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("fm.A(").append(i).append(',').append(i_0_).append(',').append(i_1_).append(',').append(i_2_).append(')').toString());
		}
		return i_3_;
	}

	private final boolean put(final int i, boolean bool, final int i_14_, final byte[] is) {
		synchronized (aClass193_454) {
			boolean bool_15_;
			try {
				int i_16_;
				if (bool) {
					if (6 + i * 6 > aClass193_462.method2521((byte) -110)) {
						return false;
					}
					aClass193_462.seek(6 * i);
					aClass193_462.method2525(0, Class80.aByteArray761, 0, 6);
					i_16_ = (0xff & Class80.aByteArray761[5]) + ((Class80.aByteArray761[4] & 0xff) << 8) + (0xff0000 & Class80.aByteArray761[3] << 16);
					if (i_16_ <= 0 || i_16_ > aClass193_454.method2521((byte) -47) / 520L) {
						return false;
					}
				} else {
					i_16_ = (int) ((aClass193_454.method2521((byte) -96) - -519L) / 520L);
					if (i_16_ == 0) {
						i_16_ = 1;
					}
				}
				Class80.aByteArray761[5] = (byte) i_16_;
				Class80.aByteArray761[0] = (byte) (i_14_ >> 16);
				Class80.aByteArray761[1] = (byte) (i_14_ >> 8);
				int i_19_ = 0;
				Class80.aByteArray761[4] = (byte) (i_16_ >> 8);
				int i_20_ = 0;
				Class80.aByteArray761[2] = (byte) i_14_;
				Class80.aByteArray761[3] = (byte) (i_16_ >> 16);
				aClass193_462.seek(6 * i);
				aClass193_462.method2519(0, Class80.aByteArray761, 6, (byte) 42);
				int i_21_;
				for (/**/; i_20_ < i_14_; i_20_ += i_21_) {
					int i_22_ = 0;
					if (bool) {
						aClass193_454.seek(520 * i_16_);
						try {
							aClass193_454.method2525(0, Class80.aByteArray761, 0, 8);
						} catch (final EOFException eofexception) {
							break;
						}
						i_22_ = (Class80.aByteArray761[6] & 0xff) + ((Class80.aByteArray761[4] & 0xff) << 16) + ((Class80.aByteArray761[5] & 0xff) << 8);
						final int i_23_ = ((Class80.aByteArray761[2] & 0xff) << 8) + (0xff & Class80.aByteArray761[3]);
						final int i_24_ = 0xff & Class80.aByteArray761[7];
						i_21_ = (Class80.aByteArray761[1] & 0xff) + ((Class80.aByteArray761[0] & 0xff) << 8);
						if (i != i_21_ || i_19_ != i_23_ || i_24_ != anInt464) {
							return false;
						}
						if (i_22_ < 0 || (i_22_ ^ 0xffffffffffffffffL) < (aClass193_454.method2521((byte) -74) / 520L ^ 0xffffffffffffffffL)) {
							return false;
						}
					}
					if (i_22_ == 0) {
						bool = false;
						i_22_ = (int) ((aClass193_454.method2521((byte) -91) + 519L) / 520L);
						if (i_22_ == 0) {
							i_22_++;
						}
						if (i_22_ == i_16_) {
							i_22_++;
						}
					}
					Class80.aByteArray761[1] = (byte) i;
					if (i_14_ + -i_20_ <= 512) {
						i_22_ = 0;
					}
					Class80.aByteArray761[5] = (byte) (i_22_ >> 8);
					Class80.aByteArray761[4] = (byte) (i_22_ >> 16);
					Class80.aByteArray761[6] = (byte) i_22_;
					Class80.aByteArray761[0] = (byte) (i >> 8);
					Class80.aByteArray761[2] = (byte) (i_19_ >> 8);
					Class80.aByteArray761[7] = (byte) anInt464;
					Class80.aByteArray761[3] = (byte) i_19_;
					i_19_++;
					i_21_ = i_14_ + -i_20_;
					aClass193_454.seek(520 * i_16_);
					if (i_21_ > 512) {
						i_21_ = 512;
					}
					i_16_ = i_22_;
					aClass193_454.method2519(0, Class80.aByteArray761, 8, (byte) 42);
					aClass193_454.method2519(i_20_, is, i_21_, (byte) 42);
				}
				bool_15_ = true;
			} catch (final IOException ioexception) {
				return false;
			}
			final boolean bool_28_ = bool_15_;
			return bool_28_;
		}
	}

	public static void method445(final int i) {
		try {
			anIntArray453 = null;
			aClass105_456 = null;
			if (i != 255) {
				method447(false, '\uff9b');
			}
			aClass40Array458 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("fm.H(").append(i).append(')').toString());
		}
	}

	static final void method446(final int i, final int i_29_, final int i_30_, final int i_31_, final int i_32_, final int i_33_) {
		try {
			if (i_30_ == 0) {
				for (int i_34_ = i; i_34_ <= i_31_; i_34_++) {
					Class120_Sub8.method1160((byte) 115, GameEntity.anIntArrayArray3009[i_34_], i_32_, i_29_, i_33_);
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("fm.C(").append(i).append(',').append(i_29_).append(',').append(i_30_).append(',').append(i_31_).append(',').append(i_32_).append(',').append(i_33_).append(')').toString());
		}
	}

	static final boolean method447(final boolean bool, final char c) {
		boolean bool_35_;
		try {
			if (bool) {
				method443(1, -6, -58, 66);
			}
			bool_35_ = c >= '0' && c <= '9';
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("fm.I(").append(bool).append(',').append(c).append(')').toString());
		}
		return bool_35_;
	}

	@Override
	public final String toString() {
		String string;
		try {
			string = new StringBuilder("Cache:").append(anInt464).toString();
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, "fm.toString()");
		}
		return string;
	}

	static final void drawMenu() {
		final int x = Class126.menuDrawX;
		final int y = Class120_Sub16.menuDrawY;
		final int width = Class120_Sub24.menuWidth;
		final int height = Class120_Sub14_Sub10.menuHeight;
		if (!HDToolkit.glEnabled) {
			GraphicsLD.fillRect(x, y, width, height, 6116423);
			GraphicsLD.fillRect(x + 1, y + 1, width - 2, 16, 0);
			GraphicsLD.drawRect(x + 1, y + 18, width - 2, height - 19, 0);
		} else {
			GraphicsHD.fillRect(x, y, width, height, 6116423);
			GraphicsHD.fillRect(x + 1, y + 1, width - 2, 16, 0);
			GraphicsHD.drawRect(x + 1, y + 18, width - 2, height - 19, 0);
		}
		Class120_Sub12_Sub22.boldFont.method1466(Class111.aString1056, x + 3, y + 14, 6116423, -1);
		final int mouseX = Queue.lastMouseX;
		final int mouseY = Class191.lastMouseY;
		for (int optionId = 0; optionId < Class186.menuOptionCount; optionId++) {
			final int optionY = y + 31 + (15 * (Class186.menuOptionCount - 1 - optionId));
			int optionColor = 16777215;
			if (mouseX > x && x + width > mouseX && mouseY > optionY - 13 && mouseY < 3 + optionY) {
				optionColor = 16776960;
			}
			Class120_Sub12_Sub22.boldFont.method1466(Class121.getMenuOptionName(optionId), x + 3, optionY, optionColor, 0);
		}
		Class54.method482(Class126.menuDrawX, Class120_Sub16.menuDrawY, Class120_Sub14_Sub10.menuHeight, Class120_Sub24.menuWidth);
	}

	static final void checkPlayerLocation() {
		Class69_Sub3.isInTutIsland = 0;
		final int x = (Class100.selfPlayer.x >> 7) + GameEntity.currentBaseX;
		final int z = (Class100.selfPlayer.z >> 7) + Class181.currentBaseZ;
		if (x >= 3053 && x <= 3156 && z >= 3056 && z <= 3136) {
			Class69_Sub3.isInTutIsland = 1;
		}
		if (x >= 3072 && x <= 3118 && z >= 9492 && z <= 9535) {
			Class69_Sub3.isInTutIsland = 1;
		}
		if (Class69_Sub3.isInTutIsland == 1 && x >= 3139 && x <= 3199 && z >= 3008 && z <= 3062) {
			Class69_Sub3.isInTutIsland = 0;
		}
	}

	final byte[] get(final int i) {
		synchronized (aClass193_454) {
			byte[] is;
			try {
				if ((i * 6 + 6 ^ 0xffffffffffffffffL) < (aClass193_462.method2521((byte) -31) ^ 0xffffffffffffffffL)) {
					final byte[] is_48_ = null;
					final byte[] is_49_ = is_48_;
					return is_49_;
				}
				aClass193_462.seek(i * 6);
				aClass193_462.method2525(0, Class80.aByteArray761, 0, 6);
				final int i_50_ = (Class80.aByteArray761[0] << 16 & 0xff0000) + (0xff00 & Class80.aByteArray761[1] << 8) - -(0xff & Class80.aByteArray761[2]);
				int i_51_ = (Class80.aByteArray761[5] & 0xff) + ((Class80.aByteArray761[4] & 0xff) << 8) + (0xff0000 & Class80.aByteArray761[3] << 16);
				if (i_50_ < 0 || i_50_ > anInt463) {
					final byte[] is_52_ = null;
					final byte[] is_53_ = is_52_;
					return is_53_;
				}
				if (i_51_ <= 0 || aClass193_454.method2521((byte) -54) / 520L < i_51_) {
					final byte[] is_54_ = null;
					final byte[] is_55_ = is_54_;
					return is_55_;
				}
				final byte[] is_56_ = new byte[i_50_];
				int i_57_ = 0;
				int i_58_ = 0;
				while (i_50_ > i_58_) {
					if (i_51_ == 0) {
						final byte[] is_59_ = null;
						final byte[] is_60_ = is_59_;
						return is_60_;
					}
					aClass193_454.seek(520 * i_51_);
					int i_61_ = -i_58_ + i_50_;
					if (i_61_ > 512) {
						i_61_ = 512;
					}
					aClass193_454.method2525(0, Class80.aByteArray761, 0, i_61_ - -8);
					final int i_62_ = (0xff & Class80.aByteArray761[3]) + ((Class80.aByteArray761[2] & 0xff) << 8);
					final int i_63_ = (0xff & Class80.aByteArray761[6]) + ((0xff & Class80.aByteArray761[5]) << 8) + (0xff0000 & Class80.aByteArray761[4] << 16);
					final int i_64_ = (Class80.aByteArray761[1] & 0xff) + (0xff00 & Class80.aByteArray761[0] << 8);
					final int i_65_ = 0xff & Class80.aByteArray761[7];
					if (i != i_64_ || i_62_ != i_57_ || i_65_ != anInt464) {
						final byte[] is_66_ = null;
						final byte[] is_67_ = is_66_;
						return is_67_;
					}
					if (i_63_ < 0 || i_63_ > aClass193_454.method2521((byte) -115) / 520L) {
						final byte[] is_68_ = null;
						final byte[] is_69_ = is_68_;
						return is_69_;
					}
					for (int i_70_ = 0; i_61_ > i_70_; i_70_++) {
						is_56_[i_58_++] = Class80.aByteArray761[8 + i_70_];
					}
					i_57_++;
					i_51_ = i_63_;
				}
				is = is_56_;
			} catch (final IOException ioexception) {
				final byte[] is_71_ = null;
				final byte[] is_72_ = is_71_;
				return is_72_;
			}
			final byte[] is_73_ = is;
			return is_73_;
		}
	}

	final boolean put(final int i, final byte[] is, final int i_74_) {
		synchronized (aClass193_454) {
			if (i < 0 || anInt463 < i) {
				throw new IllegalArgumentException();
			}
			boolean bool = put(i_74_, true, i, is);
			if (!bool) {
				bool = put(i_74_, false, i, is);
			}
			return bool;
		}
	}

	FileSystem(final int i, final Class193 class193, final Class193 class193_78_, final int i_79_) {
		anInt464 = i;
		anInt463 = i_79_;
		aClass193_454 = class193;
		aClass193_462 = class193_78_;
	}
}
