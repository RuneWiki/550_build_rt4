/* Class114 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;

final class Class114 {
	static int previousPacketType = 0;
	static byte[][][] aByteArrayArrayArray1094;
	static byte[][][] tileSettings;
	boolean aBoolean1096;
	static js5 aClass50_1097;
	static int anInt1099;
	boolean aBoolean1100;
	boolean aBoolean1101;
	byte aByte1102;
	byte aByte1103;
	byte aByte1104;
	byte aByte1105;
	short aShort1106;
	boolean aBoolean1107;
	boolean aBoolean1108;

	static final DisplayModeInfo[] constructDisplayModes() {
		if (Class65.displayModes == null) {
			final DisplayModeInfo[] class171s_0_ = EnumType.getDisplayModes(NpcType.gameSignlink);
			final DisplayModeInfo[] class171s_1_ = new DisplayModeInfo[class171s_0_.length];
			int i_2_ = 0;
			while_44_: for (int i_3_ = 0; i_3_ < class171s_0_.length; i_3_++) {
				final DisplayModeInfo displayModeInfo = class171s_0_[i_3_];
				if ((displayModeInfo.bitDepth <= 0 || displayModeInfo.bitDepth >= 24) && displayModeInfo.width >= 800 && displayModeInfo.height >= 600) {
					for (int i_4_ = 0; i_4_ < i_2_; i_4_++) {
						final DisplayModeInfo class171_5_ = class171s_1_[i_4_];
						if (displayModeInfo.width == class171_5_.width && class171_5_.height == displayModeInfo.height) {
							if (class171_5_.bitDepth < displayModeInfo.bitDepth) {
								class171s_1_[i_4_] = displayModeInfo;
							}
							continue while_44_;
						}
					}
					class171s_1_[i_2_] = displayModeInfo;
					i_2_++;
				}
			}
			Class65.displayModes = new DisplayModeInfo[i_2_];
			ArrayUtils.arrayCopy(class171s_1_, 0, Class65.displayModes, 0, i_2_);
			final int[] pixelAmount = new int[Class65.displayModes.length];
			for (int id = 0; id < Class65.displayModes.length; id++) {
				final DisplayModeInfo displayModeInfo = Class65.displayModes[id];
				pixelAmount[id] = displayModeInfo.width * displayModeInfo.height;
			}
			ArrayUtils.quicksortArray(pixelAmount, Class65.displayModes);
		}
		return Class65.displayModes;
	}

	static final long getWallLocationUid(final int x, final int z, final int level) {
		final GroundTile groundTile = LabelGroup.activeGroundTiles[level][x][z];
		if (groundTile == null || groundTile.wallLocation == null) {
			return 0L;
		}
		return groundTile.wallLocation.bitPackedUid;
	}

	static final AbstractGraphicsBuffer constructGraphicsBuffer(final Component component, final int width, final int height) {
		try {
			final Class var_class = Class.forName("BasicGraphicsBuffer");
			final AbstractGraphicsBuffer instance = (AbstractGraphicsBuffer) var_class.newInstance();
			instance.init(component, width, height);
			return instance;
		} catch (final Throwable throwable) {
			final ProducingGraphicsBuffer instance = new ProducingGraphicsBuffer();
			instance.init(component, width, height);
			return instance;
		}
	}

	public Class114() {
		/* empty */
	}
}
