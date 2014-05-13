/* Class114 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;

final class Class114 {
	static int anInt1093 = 0;
	static byte[][][] aByteArrayArrayArray1094;
	static byte[][][] aByteArrayArrayArray1095;
	boolean aBoolean1096;
	static Class50 aClass50_1097;
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
			aByteArrayArrayArray1095 = null;
			aClass50_1097 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("mi.A(").append(i).append(')').toString());
		}
	}

	static final DisplayModeInfo[] method1004(final byte i) {
		DisplayModeInfo[] class171s;
		try {
			if (Class65.aClass171Array595 == null) {
				final DisplayModeInfo[] class171s_0_ = Class120_Sub14_Sub2.getDisplayModes(NpcType.gameSignlink);
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
				Class65.aClass171Array595 = new DisplayModeInfo[i_2_];
				Class4.method89(class171s_1_, 0, Class65.aClass171Array595, 0, i_2_);
				final int[] is = new int[Class65.aClass171Array595.length];
				for (int i_6_ = 0; Class65.aClass171Array595.length > i_6_; i_6_++) {
					final DisplayModeInfo displayModeInfo = Class65.aClass171Array595[i_6_];
					is[i_6_] = displayModeInfo.height * displayModeInfo.width;
				}
				Class120_Sub14_Sub1.method1415(is, (byte) 119, Class65.aClass171Array595);
			}
			if (i >= -29) {
				method1005(47, -82, -101);
			}
			class171s = Class65.aClass171Array595;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("mi.C(").append(i).append(')').toString());
		}
		return class171s;
	}

	static final long method1005(final int i, final int i_7_, final int i_8_) {
		final GroundTile class120_sub18 = Class120_Sub1.groundTiles[i][i_7_][i_8_];
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
