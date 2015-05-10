/* Class51 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.EOFException;
import java.io.IOException;

final class FileSystem {
	static int[] anIntArray453 = { 76, 8, 137, 4, 0, 1, 38, 2, 19 };
	private SeekableFile dataFile = null;
	static int anInt455;
	static Deque aClass105_456;
	static int minimapClickX;
	static SeqType[] aClass40Array458;
	static int anInt459 = 0;
	static float aFloat460;
	static boolean haveInternetExplorer6;
	private SeekableFile indexFile = null;
	private int maxLength = 65000;
	private final int storeId;

	static {
		anInt455 = 0;
		haveInternetExplorer6 = false;
		aClass40Array458 = new SeqType[14];
		aClass105_456 = new Deque();
	}

	static final int method443(final int i, final int i_0_, final int i_2_) {
		int i_4_ = Rasterizer.palette[LDModelRenderer.method2401(i_2_, i)];
		if (i_0_ > 0) {
			final int i_5_ = Rasterizer.anInterface5_973.method24(i_0_ & 0xffff);
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
			int i_9_ = Rasterizer.anInterface5_973.method21(i_0_ & 0xffff);
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
		return i_4_;
	}

	private final boolean save(final byte[] buffer, final int index, final int len, boolean exists) {
		synchronized (dataFile) {
			try {
				int sector;
				if (exists) {
					if (6 + index * 6 > indexFile.length()) {
						return false;
					}
					indexFile.seek(6 * index);
					indexFile.read(EmitterType.aByteArray761, 0, 6);
					sector = (0xff & EmitterType.aByteArray761[5]) + ((EmitterType.aByteArray761[4] & 0xff) << 8) + ((EmitterType.aByteArray761[3] & 0xff) << 16);
					if (sector <= 0 || sector > dataFile.length() / 520L) {
						return false;
					}
				} else {
					sector = (int) ((dataFile.length() + 519L) / 520L);
					if (sector == 0) {
						sector = 1;
					}
				}
				EmitterType.aByteArray761[5] = (byte) sector;
				EmitterType.aByteArray761[0] = (byte) (len >> 16);
				EmitterType.aByteArray761[1] = (byte) (len >> 8);
				int i_19_ = 0;
				EmitterType.aByteArray761[4] = (byte) (sector >> 8);
				int i_20_ = 0;
				EmitterType.aByteArray761[2] = (byte) len;
				EmitterType.aByteArray761[3] = (byte) (sector >> 16);
				indexFile.seek(6 * index);
				indexFile.write(EmitterType.aByteArray761, 0, 6);
				int i_21_;
				for (/**/; i_20_ < len; i_20_ += i_21_) {
					int i_22_ = 0;
					if (exists) {
						dataFile.seek(520 * sector);
						try {
							dataFile.read(EmitterType.aByteArray761, 0, 8);
						} catch (final EOFException eofexception) {
							break;
						}
						i_22_ = (EmitterType.aByteArray761[6] & 0xff) + ((EmitterType.aByteArray761[4] & 0xff) << 16) + ((EmitterType.aByteArray761[5] & 0xff) << 8);
						final int i_23_ = ((EmitterType.aByteArray761[2] & 0xff) << 8) + (0xff & EmitterType.aByteArray761[3]);
						final int i_24_ = 0xff & EmitterType.aByteArray761[7];
						i_21_ = (EmitterType.aByteArray761[1] & 0xff) + ((EmitterType.aByteArray761[0] & 0xff) << 8);
						if (index != i_21_ || i_19_ != i_23_ || i_24_ != storeId) {
							return false;
						}
						if (i_22_ < 0 || (i_22_ ^ 0xffffffffffffffffL) < (dataFile.length() / 520L ^ 0xffffffffffffffffL)) {
							return false;
						}
					}
					if (i_22_ == 0) {
						exists = false;
						i_22_ = (int) ((dataFile.length() + 519L) / 520L);
						if (i_22_ == 0) {
							i_22_++;
						}
						if (i_22_ == sector) {
							i_22_++;
						}
					}
					EmitterType.aByteArray761[1] = (byte) index;
					if (len + -i_20_ <= 512) {
						i_22_ = 0;
					}
					EmitterType.aByteArray761[5] = (byte) (i_22_ >> 8);
					EmitterType.aByteArray761[4] = (byte) (i_22_ >> 16);
					EmitterType.aByteArray761[6] = (byte) i_22_;
					EmitterType.aByteArray761[0] = (byte) (index >> 8);
					EmitterType.aByteArray761[2] = (byte) (i_19_ >> 8);
					EmitterType.aByteArray761[7] = (byte) storeId;
					EmitterType.aByteArray761[3] = (byte) i_19_;
					i_19_++;
					i_21_ = len + -i_20_;
					dataFile.seek(520 * sector);
					if (i_21_ > 512) {
						i_21_ = 512;
					}
					sector = i_22_;
					dataFile.write(EmitterType.aByteArray761, 0, 8);
					dataFile.write(buffer, i_20_, i_21_);
				}
			} catch (final IOException ioexception) {
				return false;
			}
			return true;
		}
	}

	static final void method446(final int i, final int i_29_, final int i_31_, final int i_32_, final int i_33_) {
		for (int i_34_ = i; i_34_ <= i_31_; i_34_++) {
			AmbientSound.fillArray(GameEntity.anIntArrayArray3009[i_34_], i_32_, i_29_, i_33_);
		}
	}

	static final boolean isNumber(final char c) {
		return c >= '0' && c <= '9';
	}

	@Override
	public final String toString() {
		return "Cache:" + storeId;
	}

	static final void drawMenu() {
		final int x = Huffman.menuDrawX;
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
		Class120_Sub12_Sub22.boldFont.method1466(TextRepository.aString1056, x + 3, y + 14, 6116423, -1);
		final int mouseX = Queue.lastMouseX;
		final int mouseY = Class191.lastMouseY;
		for (int optionId = 0; optionId < WallDecoration.menuOptionCount; optionId++) {
			final int optionY = y + 31 + (15 * (WallDecoration.menuOptionCount - 1 - optionId));
			int optionColor = 16777215;
			if (mouseX > x && x + width > mouseX && mouseY > optionY - 13 && mouseY < 3 + optionY) {
				optionColor = 16776960;
			}
			Class120_Sub12_Sub22.boldFont.method1466(client.getMenuOptionText(optionId), x + 3, optionY, optionColor, 0);
		}
		Class54.redrawScreen(Huffman.menuDrawX, Class120_Sub16.menuDrawY, Class120_Sub24.menuWidth, Class120_Sub14_Sub10.menuHeight);
	}

	static final void checkPlayerLocation() {
		Class69_Sub3.isInTutIsland = 0;
		final int x = (TileParticleQueue.selfPlayer.x >> 7) + GameEntity.currentBaseX;
		final int z = (TileParticleQueue.selfPlayer.z >> 7) + Class181.currentBaseZ;
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
		synchronized (dataFile) {
			byte[] is;
			try {
				if ((i * 6 + 6) > indexFile.length()) {
					return null;
				}
				indexFile.seek(i * 6);
				indexFile.read(EmitterType.aByteArray761, 0, 6);
				final int i_50_ = (EmitterType.aByteArray761[0] << 16 & 0xff0000) + (0xff00 & EmitterType.aByteArray761[1] << 8) - -(0xff & EmitterType.aByteArray761[2]);
				int i_51_ = (EmitterType.aByteArray761[5] & 0xff) + ((EmitterType.aByteArray761[4] & 0xff) << 8) + (0xff0000 & EmitterType.aByteArray761[3] << 16);
				if (i_50_ < 0 || i_50_ > maxLength) {
					final byte[] is_52_ = null;
					final byte[] is_53_ = is_52_;
					return is_53_;
				}
				if (i_51_ <= 0 || dataFile.length() / 520L < i_51_) {
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
					dataFile.seek(520 * i_51_);
					int i_61_ = -i_58_ + i_50_;
					if (i_61_ > 512) {
						i_61_ = 512;
					}
					dataFile.read(EmitterType.aByteArray761, 0, i_61_ - -8);
					final int i_62_ = (0xff & EmitterType.aByteArray761[3]) + ((EmitterType.aByteArray761[2] & 0xff) << 8);
					final int i_63_ = (0xff & EmitterType.aByteArray761[6]) + ((0xff & EmitterType.aByteArray761[5]) << 8) + (0xff0000 & EmitterType.aByteArray761[4] << 16);
					final int i_64_ = (EmitterType.aByteArray761[1] & 0xff) + (0xff00 & EmitterType.aByteArray761[0] << 8);
					final int i_65_ = 0xff & EmitterType.aByteArray761[7];
					if (i != i_64_ || i_62_ != i_57_ || i_65_ != storeId) {
						final byte[] is_66_ = null;
						final byte[] is_67_ = is_66_;
						return is_67_;
					}
					if (i_63_ < 0 || i_63_ > dataFile.length() / 520L) {
						final byte[] is_68_ = null;
						final byte[] is_69_ = is_68_;
						return is_69_;
					}
					for (int i_70_ = 0; i_61_ > i_70_; i_70_++) {
						is_56_[i_58_++] = EmitterType.aByteArray761[8 + i_70_];
					}
					i_57_++;
					i_51_ = i_63_;
				}
				is = is_56_;
			} catch (final IOException ioexception) {
				return null;
			}
			return is;
		}
	}

	final boolean save(final byte[] buffer, final int index, final int len) {
		synchronized (dataFile) {
			if (len < 0 || len > maxLength) {
				throw new IllegalArgumentException();
			}
			boolean success = save(buffer, index, len, true);
			if (!success) {
				success = save(buffer, index, len, false);
			}
			return success;
		}
	}

	FileSystem(final int store, final SeekableFile datFile, final SeekableFile idxFile, final int maxLen) {
		storeId = store;
		maxLength = maxLen;
		dataFile = datFile;
		indexFile = idxFile;
	}
}
