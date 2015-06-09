/* Class96 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;
import java.net.Socket;

final class Class96 {
	static int mainRedrawCachePos;
	byte[] aByteArray884;
	int anInt885;
	byte[] aByteArray886;
	int anInt887;
	int[] anIntArray888;
	byte[] aByteArray889;
	int[] anIntArray890;
	boolean[] aBooleanArray891;
	int anInt892;
	boolean[] aBooleanArray893;
	byte[][] aByteArrayArray894 = new byte[6][258];
	int anInt895;
	int[] anIntArray896;
	int anInt897;
	int anInt898;
	int anInt899;
	static int anInt900;
	int anInt902;
	byte[] aByteArray903;
	int[][] anIntArrayArray904;
	int anInt905;
	int anInt906;
	int anInt907;
	byte aByte908;
	int[][] anIntArrayArray909;
	int[][] anIntArrayArray910;
	int[] anIntArray911;
	int anInt912;
	byte[] aByteArray913;
	byte[] aByteArray914;
	int anInt916;
	int anInt917;
	int anInt918;
	static int clickedMouseFunctionBlinksLeft;

	static {
		QuickChatCategoryType.recentUse = new NodeCache(64);
	}

	static final void method786(final boolean bool, final int i, final boolean bool_0_, final float[][] fs, final float[][] fs_1_, final HDTile class120_sub9, final int[][] is, final int i_3_, final int i_4_, final byte i_5_, final int i_6_, final boolean bool_7_, final int i_8_, final float[][] fs_9_, final int i_10_, final int i_11_, final boolean[] bools, final int[][] is_12_, final int i_13_, final int[] is_14_, final boolean bool_15_) {
		final int i_16_ = (i_13_ << 8) + (bool_15_ ? 255 : 0);
		final int i_17_ = (i_10_ << 8) + (bool_0_ ? 255 : 0);
		final int i_18_ = (i_4_ << 8) + (bool_7_ ? 255 : 0);
		final int i_19_ = (i_3_ << 8) + (bool ? 255 : 0);
		final int[] is_20_ = new int[is_14_.length / 2];
		for (int i_21_ = 0; i_21_ < is_20_.length; i_21_++) {
			final int i_22_ = is_14_[i_21_ + i_21_];
			final int i_23_ = is_14_[1 + i_21_ + i_21_];
			final int[][] is_24_ = is_12_ != null && bools != null && bools[i_21_] ? is_12_ : is;
			is_20_[i_21_] = Class120_Sub14_Sub22.method1634(fs_9_, i_23_, i, is_24_, fs, is_12_, class120_sub9, i_17_, i_11_, false, i_8_, fs_1_, i_5_, i_22_, i_19_, i_18_, i_16_);
		}
		class120_sub9.method1165(i_6_, i_11_, i, is_20_, null, false);
	}

	static final void method787(final LDIndexedSprite class107_sub1) {
		for (int i_25_ = 0; i_25_ < InterfaceChangeNode.anIntArray3485.length; i_25_++) {
			InterfaceChangeNode.anIntArray3485[i_25_] = 0;
		}
		for (int i_27_ = 0; i_27_ < 5000; i_27_++) {
			final int i_29_ = (int) (128.0 * Math.random() * 256.0);
			InterfaceChangeNode.anIntArray3485[i_29_] = (int) (Math.random() * 284.0);
		}
		for (int i_27_ = 0; i_27_ < 20; i_27_++) {
			for (int i_28_ = 1; i_28_ < 255; i_28_++) {
				for (int i_30_ = 1; i_30_ < 127; i_30_++) {
					final int i_31_ = (i_28_ << 7) + i_30_;
					KeyboardHandler.anIntArray1503[i_31_] = (InterfaceChangeNode.anIntArray3485[128 + i_31_] + InterfaceChangeNode.anIntArray3485[1 + i_31_] + InterfaceChangeNode.anIntArray3485[-1 + i_31_] - -InterfaceChangeNode.anIntArray3485[i_31_ - 128]) / 4;
				}
			}
			final int[] is = InterfaceChangeNode.anIntArray3485;
			InterfaceChangeNode.anIntArray3485 = KeyboardHandler.anIntArray1503;
			KeyboardHandler.anIntArray1503 = is;
		}
		if (class107_sub1 != null) {
			int i_27_ = 0;
			for (int i_28_ = 0; i_28_ < class107_sub1.height; i_28_++) {
				for (int i_32_ = 0; i_32_ < class107_sub1.width; i_32_++) {
					if (class107_sub1.paletteIndicators[i_27_++] != 0) {
						final int i_33_ = i_32_ - (-16 - class107_sub1.xOffset);
						final int i_34_ = 16 + i_28_ + class107_sub1.yOffset;
						final int i_35_ = (i_34_ << 7) + i_33_;
						InterfaceChangeNode.anIntArray3485[i_35_] = 0;
					}
				}
			}
		}
	}

	static final int method788() {
		try {
			if (Decimator.worldListLoadStep == 0) {
				if (TimeUtil.getSafeTime() - 5000L < ModelParticleEmitter.worldListLoadedTime) {
					return 0;
				}
				Class53_Sub1.worldConnectionNode = NpcType.gameSignlink.openConnection(Class120_Sub12_Sub30.worldListIpAddress, Class116.worldListPort);
				GameShell.worldListConnectTime = TimeUtil.getSafeTime();
				Decimator.worldListLoadStep = 1;
			}
			if (TimeUtil.getSafeTime() > GameShell.worldListConnectTime + 30000L) {
				return DummyOutputStream.worldListError(1000);
			}
			if (Decimator.worldListLoadStep == 1) {
				if (Class53_Sub1.worldConnectionNode.status == 2) {
					return DummyOutputStream.worldListError(1001);
				}
				if (Class53_Sub1.worldConnectionNode.status != 1) {
					return -1;
				}
				AbstractTimer.worldConnection = new JagexSocket((Socket) Class53_Sub1.worldConnectionNode.value, NpcType.gameSignlink);
				Class53_Sub1.worldConnectionNode = null;
				int i_38_ = 0;
				if (Class159.worldsLoaded) {
					i_38_ = anInt900;
				}
				Class120_Sub12_Sub11.outputStream.pos = 0;
				Class120_Sub12_Sub11.outputStream.putByte(23);
				Class120_Sub12_Sub11.outputStream.putInt(i_38_);
				AbstractTimer.worldConnection.put(Class120_Sub12_Sub11.outputStream.buf, 0, Class120_Sub12_Sub11.outputStream.pos);
				if (Class120_Sub12_Sub3.aClass164_3150 != null) {
					Class120_Sub12_Sub3.aClass164_3150.method2131();
				}
				if (Class120_Sub12_Sub29.aClass164_3366 != null) {
					Class120_Sub12_Sub29.aClass164_3366.method2131();
				}
				final int i_39_ = AbstractTimer.worldConnection.read();
				if (Class120_Sub12_Sub3.aClass164_3150 != null) {
					Class120_Sub12_Sub3.aClass164_3150.method2131();
				}
				if (Class120_Sub12_Sub29.aClass164_3366 != null) {
					Class120_Sub12_Sub29.aClass164_3366.method2131();
				}
				if (i_39_ != 0) {
					return DummyOutputStream.worldListError(i_39_);
				}
				Decimator.worldListLoadStep = 2;
			}
			if (Decimator.worldListLoadStep == 2) {
				if (AbstractTimer.worldConnection.getAvailable() < 2) {
					return -1;
				}
				OverridedJInterface.worldListDataLength = AbstractTimer.worldConnection.read();
				OverridedJInterface.worldListDataLength <<= 8;
				OverridedJInterface.worldListDataLength += AbstractTimer.worldConnection.read();
				client.worldListData = new byte[OverridedJInterface.worldListDataLength];
				Class132_Sub1.worldListDataOff = 0;
				Decimator.worldListLoadStep = 3;
			}
			if (Decimator.worldListLoadStep != 3) {
				return -1;
			}
			int available = AbstractTimer.worldConnection.getAvailable();
			if (available < 1) {
				return -1;
			}
			if (available > OverridedJInterface.worldListDataLength - Class132_Sub1.worldListDataOff) {
				available = OverridedJInterface.worldListDataLength - Class132_Sub1.worldListDataOff;
			}
			AbstractTimer.worldConnection.read(client.worldListData, Class132_Sub1.worldListDataOff, available);
			Class132_Sub1.worldListDataOff += available;
			if (Class132_Sub1.worldListDataOff < OverridedJInterface.worldListDataLength) {
				return -1;
			}
			if (!Class54.decodedWorldInformation(client.worldListData)) {
				return DummyOutputStream.worldListError(1002);
			}
			int worldPos = 0;
			Class86.worlds = new World[Class57.worldLen2];
			for (int worldId = OverridedJInterface.worldOff; worldId <= EnumType.worldLen; worldId++) {
				final World world = World.getWorld(worldId);
				if (world != null) {
					Class86.worlds[worldPos++] = world;
				}
			}
			AbstractTimer.worldConnection.close();
			client.worldListData = null;
			Decimator.worldListLoadStep = 0;
			OverridedJInterface.worldListErrorCount = 0;
			AbstractTimer.worldConnection = null;
			ModelParticleEmitter.worldListLoadedTime = TimeUtil.getSafeTime();
			return 0;
		} catch (final IOException ioexception) {
			return DummyOutputStream.worldListError(1003);
		}
	}

	static final int method789(final int i_43_, int i_44_) {
		if (i_43_ == -2) {
			return 12345678;
		}
		if (i_43_ == -1) {
			if (i_44_ < 2) {
				i_44_ = 2;
			} else if (i_44_ > 126) {
				i_44_ = 126;
			}
			return i_44_;
		}
		i_44_ = i_44_ * (0x7f & i_43_) >> 7;
		if (i_44_ < 2) {
			i_44_ = 2;
		} else if (i_44_ > 126) {
			i_44_ = 126;
		}
		return (i_43_ & 0xff80) + i_44_;
	}

	Class96() {
		this.anIntArray890 = new int[257];
		this.aBooleanArray893 = new boolean[256];
		this.aByteArray889 = new byte[4096];
		this.anIntArray896 = new int[6];
		this.anIntArrayArray904 = new int[6][258];
		this.anIntArray888 = new int[16];
		this.anIntArray911 = new int[256];
		this.anInt907 = 0;
		this.aBooleanArray891 = new boolean[16];
		this.aByteArray913 = new byte[256];
		this.anIntArrayArray909 = new int[6][258];
		this.aByteArray886 = new byte[18002];
		this.anIntArrayArray910 = new int[6][258];
		this.aByteArray914 = new byte[18002];
		this.anInt917 = 0;
	}
}
