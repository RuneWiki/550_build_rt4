/* Class114 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;
import java.util.Arrays;

final class Class114 {
	static int anInt1093 = 0;
	static byte[][][] aByteArrayArrayArray1094;
	static byte[][][] tileSettings;
	boolean aBoolean1096;
	static js5 aClass50_1097;
	static String aString1098 = "Loading world list data";
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

	public static void method1003(final byte i) {
		try {
			aByteArrayArrayArray1094 = null;
			if (i != -104) {
				constructGraphicsBuffer(null, 12, 69);
			}
			aString1098 = null;
			tileSettings = null;
			aClass50_1097 = null;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("mi.A(").append(i).append(')').toString());
		}
	}

	static final DisplayModeInfo[] constructDisplayModes() {
		if (Class65.displayModes == null) {
			final DisplayModeInfo[] class171s_0_ = EnumType.getDisplayModes(NpcType.gameSignlink);
			final DisplayModeInfo[] class171s_1_ = new DisplayModeInfo[class171s_0_.length];
			int i_2_ = 0;
			while_44_: for (int i_3_ = 0; class171s_0_.length > i_3_; i_3_++) {
				final DisplayModeInfo displayModeInfo = class171s_0_[i_3_];
				if ((displayModeInfo.bitDepth <= 0 || displayModeInfo.bitDepth >= 24) && displayModeInfo.width >= 800 && displayModeInfo.height >= 600) {
					for (int i_4_ = 0; i_2_ > i_4_; i_4_++) {
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
			final int[] is = new int[Class65.displayModes.length];
			for (int i_6_ = 0; Class65.displayModes.length > i_6_; i_6_++) {
				final DisplayModeInfo displayModeInfo = Class65.displayModes[i_6_];
				is[i_6_] = displayModeInfo.height * displayModeInfo.width;
			}
			Class120_Sub14_Sub1.sortArray(is, Class65.displayModes);
		}
		return Class65.displayModes;
	}

	static final long method1005(final int i, final int i_7_, final int i_8_) {
		final GroundTile class120_sub18 = LabelGroup.groundTiles[i][i_7_][i_8_];
		if (class120_sub18 == null || class120_sub18.aClass182_2628 == null) {
			return 0L;
		}
		return class120_sub18.aClass182_2628.bitPacked;
	}

	static final AbstractGraphicsBuffer constructGraphicsBuffer(final Component component, final int width, final int height) {
		AbstractGraphicsBuffer abstractGraphicsBuffer;
		try {
			final Class var_class = Class.forName("BasicGraphicsBuffer");
			final AbstractGraphicsBuffer instance = (AbstractGraphicsBuffer) var_class.newInstance();
			instance.init(component, width, height);
			abstractGraphicsBuffer = instance;
		} catch (final Throwable throwable) {
			final ProducingGraphicsBuffer instance = new ProducingGraphicsBuffer();
			instance.init(component, width, height);
			return instance;
		}
		return abstractGraphicsBuffer;
	}

	public Class114() {
		/* empty */
	}
}
