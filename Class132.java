/* Class132 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

abstract class Class132 {
	static int anInt1248;
	private int anInt1249 = 4;
	static String aString1250 = " has logged out.";
	static js5 aClass50_1251;
	private int anInt1252;
	private short[] aShortArray1253;
	private int seed;
	int anInt1256 = 4;
	static int anInt1257;
	private int anInt1258;
	private short[] aShortArray1259;

	abstract void method1922(byte i);

	final void method1923(final int i, final int i_1_, final int i_2_) {
		final int[] is = new int[i];
		final int[] is_3_ = new int[i_2_];
		for (int i_4_ = 0; i > i_4_; i_4_++) {
			is[i_4_] = (i_4_ << 12) / i;
		}
		final int[] is_5_ = new int[i_1_];
		for (int i_6_ = 0; i_6_ < i_1_; i_6_++) {
			is_5_[i_6_] = (i_6_ << 12) / i_1_;
		}
		for (int i_7_ = 0; i_7_ < i_2_; i_7_++) {
			is_3_[i_7_] = (i_7_ << 12) / i_2_;
		}
		method1925(255);
		for (int i_8_ = 0; i_8_ < i_2_; i_8_++) {
			for (int i_9_ = 0; i_1_ > i_9_; i_9_++) {
				for (int i_10_ = 0; i_10_ < i; i_10_++) {
					for (int i_11_ = 0; i_11_ < this.anInt1256; i_11_++) {
						int i_7_ = aShortArray1259[i_11_] << 12;
						int i_12_ = i_7_ * is_3_[i_8_] >> 12;
						final int i_13_ = anInt1249 * i_7_ >> 12;
						int i_14_ = is[i_10_] * i_7_ >> 12;
						i_12_ *= anInt1249;
						i_14_ *= anInt1258;
						final int i_15_ = anInt1258 * i_7_ >> 12;
						int i_16_ = i_14_ >> 12;
						int i_17_ = i_7_ * is_5_[i_9_] >> 12;
						i_14_ &= 0xfff;
						i_17_ *= anInt1252;
						final int i_18_ = anInt1252 * i_7_ >> 12;
						final int i_19_ = Class30.anIntArray224[i_14_];
						int i_20_ = i_16_ + 1;
						int i_21_ = i_17_ >> 12;
						int i_22_ = i_21_ + 1;
						final int i_23_ = i_14_ + -4096;
						i_17_ &= 0xfff;
						if (i_15_ > i_20_) {
							i_20_ &= 0xff;
						} else {
							i_20_ = 0;
						}
						i_16_ &= 0xff;
						final int i_24_ = Class30.anIntArray224[i_17_];
						if (i_18_ > i_22_) {
							i_22_ &= 0xff;
						} else {
							i_22_ = 0;
						}
						i_21_ &= 0xff;
						final int i_25_ = -4096 + i_17_;
						int i_26_ = i_12_ >> 12;
						i_12_ &= 0xfff;
						final int i_27_ = i_12_ + -4096;
						final int i_28_ = Class30.anIntArray224[i_12_];
						int i_29_ = 1 + i_26_;
						if (i_13_ > i_29_) {
							i_29_ &= 0xff;
						} else {
							i_29_ = 0;
						}
						i_26_ &= 0xff;
						final int i_30_ = aShortArray1253[i_29_];
						final int i_31_ = aShortArray1253[i_30_ + i_21_];
						final int i_32_ = aShortArray1253[i_22_ + i_30_];
						final int i_33_ = aShortArray1253[i_26_];
						final int i_34_ = aShortArray1253[i_21_ + i_33_];
						final int i_35_ = aShortArray1253[i_22_ + i_33_];
						int i_36_ = WallLocation.method2446(i_17_, i_14_, aShortArray1253[i_16_ + i_34_], i_12_);
						int i_37_ = WallLocation.method2446(i_17_, i_23_, aShortArray1253[i_20_ + i_34_], i_12_);
						int i_38_ = (i_19_ * (i_37_ - i_36_) >> 12) + i_36_;
						i_36_ = WallLocation.method2446(i_25_, i_14_, aShortArray1253[i_35_ + i_16_], i_12_);
						i_37_ = WallLocation.method2446(i_25_, i_23_, aShortArray1253[i_20_ + i_35_], i_12_);
						int i_39_ = i_36_ + (i_19_ * (-i_36_ + i_37_) >> 12);
						final int i_40_ = (i_24_ * (i_39_ - i_38_) >> 12) + i_38_;
						i_36_ = WallLocation.method2446(i_17_, i_14_, aShortArray1253[i_16_ + i_31_], i_27_);
						i_37_ = WallLocation.method2446(i_17_, i_23_, aShortArray1253[i_20_ + i_31_], i_27_);
						i_38_ = i_36_ + ((-i_36_ + i_37_) * i_19_ >> 12);
						i_36_ = WallLocation.method2446(i_25_, i_14_, aShortArray1253[i_32_ + i_16_], i_27_);
						i_37_ = WallLocation.method2446(i_25_, i_23_, aShortArray1253[i_32_ + i_20_], i_27_);
						i_39_ = (i_19_ * (i_37_ - i_36_) >> 12) + i_36_;
						final int i_41_ = i_38_ + ((i_39_ + -i_38_) * i_24_ >> 12);
						method1927(i_11_, i_40_ + ((i_41_ - i_40_) * i_28_ >> 12), (byte) -24);
					}
					method1922((byte) -90);
				}
			}
		}
	}

	private final void method1924() {
		final Random random = new Random(seed);
		for (int i = 0; i < 255; i++) {
			aShortArray1253[i] = (short) i;
		}
		for (int i = 0; i < 255; i++) {
			final int i_42_ = -i + 255;
			final int i_43_ = Class28.method244(random, i_42_);
			final short i_44_ = aShortArray1253[i_43_];
			aShortArray1253[i_43_] = aShortArray1253[i_42_];
			aShortArray1253[i_42_] = aShortArray1253[256 + i_42_] = i_44_;
		}
	}

	abstract void method1925(int i);

	private final void method1926(final int i) {
		try {
			aShortArray1259 = new short[this.anInt1256];
			if (i != -15508) {
				anInt1258 = -110;
			}
			for (int i_45_ = 0; this.anInt1256 > i_45_; i_45_++) {
				aShortArray1259[i_45_] = (short) (int) Math.pow(2.0, i_45_);
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("pg.P(").append(i).append(')').toString());
		}
	}

	abstract void method1927(int i, int i_46_, byte i_47_);

	static final int method1928(int i, final int i_48_, final int i_49_, final int i_50_, int i_51_, final int i_52_, int i_53_) {
		int i_54_;
		try {
			i_51_ &= 0x3;
			if (i_52_ == (0x1 & i_49_ ^ 0xffffffff)) {
				final int i_55_ = i;
				i = i_53_;
				i_53_ = i_55_;
			}
			if (i_51_ == 0) {
				return i_50_;
			}
			if (i_51_ == 1) {
				return i_48_;
			}
			if (i_51_ == 2) {
				return -i + 1 + 7 - i_50_;
			}
			i_54_ = -i_48_ + 7 + 1 + -i_53_;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("pg.N(").append(i).append(',').append(i_48_).append(',').append(i_49_).append(',').append(i_50_).append(',').append(i_51_).append(',').append(i_52_).append(',').append(i_53_).append(')').toString());
		}
		return i_54_;
	}

	Class132(final int i, final int i_56_, final int i_57_, final int i_58_, final int i_59_) {
		seed = 0;
		anInt1252 = 4;
		aShortArray1253 = new short[512];
		anInt1258 = 4;
		this.anInt1256 = i_56_;
		anInt1258 = i_57_;
		anInt1252 = i_58_;
		seed = i;
		anInt1249 = i_59_;
		method1926(-15508);
		method1924();
	}

	static final Class120_Sub9[] method1930(final byte[][][] is, final byte i, final byte[][] is_60_, final int[][] is_61_, final float[][] fs, final int i_62_, final byte[][] is_63_, final byte[][] is_64_, final int[][] is_65_, final byte[][] is_66_, final float[][] fs_67_, final float[][] fs_68_) {
		final Hashtable hashtable = new Hashtable(128);
		for (int i_69_ = 1; i_69_ <= 102; i_69_++) {
			for (int i_70_ = 1; i_70_ <= 102; i_70_++) {
				final int i_71_ = is_66_[i_69_][i_70_] & 0xff;
				final int i_72_ = is_60_[i_69_][i_70_] & 0xff;
				if (i_72_ != 0) {
					final OverlayType class124 = OverlayType.list(i_72_ + -1);
					if (class124.anInt1197 == -1) {
						continue;
					}
					final Class120_Sub9 class120_sub9 = AbstractGraphicsBuffer.method1840(hashtable, class124);
					final int i_73_ = is_63_[i_69_][i_70_];
					final int[] is_74_ = Class120_Sub12_Sub4.anIntArrayArray3157[i_73_];
					class120_sub9.anInt2507 += is_74_.length / 2;
					class120_sub9.anInt2519++;
					if (class124.aBoolean1196 && i_71_ != 0) {
						class120_sub9.anInt2507 += Class112.anIntArray1069[i_73_];
					}
				}
				if ((is_66_[i_69_][i_70_] & 0xff) != 0 || i_72_ != 0 && is_63_[i_69_][i_70_] == 0) {
					int i_75_ = 0;
					int i_76_ = 0;
					final int[] is_77_ = new int[8];
					int i_78_ = 0;
					int i_79_ = 0;
					int i_80_ = 0;
					final int i_81_ = is_60_[i_69_][i_70_ + 1] & 0xff;
					final int i_82_ = is_60_[-1 + i_69_][i_70_] & 0xff;
					final int i_83_ = 0xff & is_60_[i_69_][i_70_ - 1];
					final int i_84_ = 0xff & is_60_[1 + i_69_][i_70_];
					final int i_85_ = 0xff & is_60_[i_69_ - 1][1 + i_70_];
					final int i_86_ = 0xff & is_60_[-1 + i_69_][i_70_ - 1];
					final int i_87_ = 0xff & is_60_[i_69_ + 1][i_70_ - 1];
					final int i_88_ = is_60_[i_69_ + 1][i_70_ + 1] & 0xff;
					if (i_85_ != 0 && i_72_ != i_85_) {
						final OverlayType class124 = OverlayType.list(-1 + i_85_);
						if (class124.aBoolean1196 && class124.anInt1197 != -1) {
							final int i_89_ = is_63_[i_69_ - 1][1 + i_70_];
							final int i_90_ = is_64_[-1 + i_69_][i_70_ + 1];
							final int i_91_ = Class120_Sub24.anIntArray2730[i_89_ * 4 + (0x3 & i_90_ + 2)];
							final int i_92_ = Class120_Sub24.anIntArray2730[(0x3 & 3 + i_90_) + 4 * i_89_];
							if (!Class132_Sub1.aBooleanArrayArray2811[i_92_][1] || !Class132_Sub1.aBooleanArrayArray2811[i_91_][0]) {
								for (int i_93_ = 0; i_93_ < 8; i_93_++) {
									if (i_75_ == i_93_) {
										is_77_[i_75_++] = i_85_;
										break;
									}
									if (i_85_ == is_77_[i_93_]) {
										break;
									}
								}
							}
						}
					}
					if (i_86_ != 0 && i_72_ != i_86_) {
						final OverlayType class124 = OverlayType.list(i_86_ + -1);
						if (class124.aBoolean1196 && class124.anInt1197 != -1) {
							final int i_94_ = is_64_[-1 + i_69_][i_70_ - 1];
							final int i_95_ = is_63_[-1 + i_69_][-1 + i_70_];
							final int i_96_ = Class120_Sub24.anIntArray2730[i_95_ * 4 + (3 + i_94_ & 0x3)];
							final int i_97_ = Class120_Sub24.anIntArray2730[(i_94_ & 0x3) + i_95_ * 4];
							if (!Class132_Sub1.aBooleanArrayArray2811[i_97_][1] || !Class132_Sub1.aBooleanArrayArray2811[i_96_][0]) {
								for (int i_98_ = 0; i_98_ < 8; i_98_++) {
									if (i_98_ == i_75_) {
										is_77_[i_75_++] = i_86_;
										break;
									}
									if (i_86_ == is_77_[i_98_]) {
										break;
									}
								}
							}
						}
					}
					if (i_87_ != 0 && i_72_ != i_87_) {
						final OverlayType class124 = OverlayType.list(i_87_ + -1);
						if (class124.aBoolean1196 && class124.anInt1197 != -1) {
							final int i_99_ = is_64_[i_69_ + 1][-1 + i_70_];
							final int i_100_ = is_63_[1 + i_69_][-1 + i_70_];
							final int i_101_ = Class120_Sub24.anIntArray2730[i_100_ * 4 + (0x3 & i_99_ + 1)];
							final int i_102_ = Class120_Sub24.anIntArray2730[(i_99_ & 0x3) + 4 * i_100_];
							if (!Class132_Sub1.aBooleanArrayArray2811[i_101_][1] || !Class132_Sub1.aBooleanArrayArray2811[i_102_][0]) {
								for (int i_103_ = 0; i_103_ < 8; i_103_++) {
									if (i_75_ == i_103_) {
										is_77_[i_75_++] = i_87_;
										break;
									}
									if (i_87_ == is_77_[i_103_]) {
										break;
									}
								}
							}
						}
					}
					if (i_88_ != 0 && i_72_ != i_88_) {
						final OverlayType class124 = OverlayType.list(i_88_ - 1);
						if (class124.aBoolean1196 && class124.anInt1197 != -1) {
							final int i_104_ = is_64_[1 + i_69_][i_70_ + 1];
							final int i_105_ = is_63_[1 + i_69_][i_70_ + 1];
							final int i_106_ = Class120_Sub24.anIntArray2730[i_105_ * 4 + (2 + i_104_ & 0x3)];
							final int i_107_ = Class120_Sub24.anIntArray2730[(0x3 & 1 + i_104_) + 4 * i_105_];
							if (!Class132_Sub1.aBooleanArrayArray2811[i_106_][1] || !Class132_Sub1.aBooleanArrayArray2811[i_107_][0]) {
								for (int i_108_ = 0; i_108_ < 8; i_108_++) {
									if (i_75_ == i_108_) {
										is_77_[i_75_++] = i_88_;
										break;
									}
									if (is_77_[i_108_] == i_88_) {
										break;
									}
								}
							}
						}
					}
					if (i_81_ != 0 && i_81_ != i_72_) {
						final OverlayType class124 = OverlayType.list(i_81_ - 1);
						if (class124.aBoolean1196 && (class124.anInt1197 ^ 0xffffffff) != 0) {
							i_76_ = Class120_Sub24.anIntArray2730[(is_64_[i_69_][1 + i_70_] + 2 & 0x3) + 4 * is_63_[i_69_][1 + i_70_]];
							for (int i_109_ = 0; i_109_ < 8; i_109_++) {
								if (i_109_ == i_75_) {
									is_77_[i_75_++] = i_81_;
									break;
								}
								if (i_81_ == is_77_[i_109_]) {
									break;
								}
							}
						}
					}
					if (i_82_ != 0 && i_82_ != i_72_) {
						final OverlayType class124 = OverlayType.list(-1 + i_82_);
						if (class124.aBoolean1196 && class124.anInt1197 != -1) {
							i_78_ = Class120_Sub24.anIntArray2730[(is_64_[-1 + i_69_][i_70_] + 3 & 0x3) + 4 * is_63_[-1 + i_69_][i_70_]];
							for (int i_110_ = 0; i_110_ < 8; i_110_++) {
								if (i_110_ == i_75_) {
									is_77_[i_75_++] = i_82_;
									break;
								}
								if (is_77_[i_110_] == i_82_) {
									break;
								}
							}
						}
					}
					if (i_83_ != 0 && i_83_ != i_72_) {
						final OverlayType class124 = OverlayType.list(-1 + i_83_);
						if (class124.aBoolean1196 && class124.anInt1197 != -1) {
							i_79_ = Class120_Sub24.anIntArray2730[is_63_[i_69_][-1 + i_70_] * 4 + (is_64_[i_69_][-1 + i_70_] & 0x3)];
							for (int i_111_ = 0; i_111_ < 8; i_111_++) {
								if (i_75_ == i_111_) {
									is_77_[i_75_++] = i_83_;
									break;
								}
								if (i_83_ == is_77_[i_111_]) {
									break;
								}
							}
						}
					}
					if (i_84_ != 0 && i_84_ != i_72_) {
						final OverlayType class124 = OverlayType.list(i_84_ - 1);
						if (class124.aBoolean1196 && class124.anInt1197 != -1) {
							i_80_ = Class120_Sub24.anIntArray2730[4 * is_63_[1 + i_69_][i_70_] + (0x3 & is_64_[1 + i_69_][i_70_] + 1)];
							for (int i_112_ = 0; i_112_ < 8; i_112_++) {
								if (i_112_ == i_75_) {
									is_77_[i_75_++] = i_84_;
									break;
								}
								if (i_84_ == is_77_[i_112_]) {
									break;
								}
							}
						}
					}
					for (int i_113_ = 0; i_113_ < i_75_; i_113_++) {
						final int i_114_ = is_77_[i_113_];
						final boolean[] bools = Class132_Sub1.aBooleanArrayArray2811[i_114_ == i_82_ ? i_78_ : 0];
						final boolean[] bools_115_ = Class132_Sub1.aBooleanArrayArray2811[i_83_ == i_114_ ? i_79_ : 0];
						final boolean[] bools_116_ = Class132_Sub1.aBooleanArrayArray2811[i_114_ != i_84_ ? 0 : i_80_];
						final boolean[] bools_117_ = Class132_Sub1.aBooleanArrayArray2811[i_81_ == i_114_ ? i_76_ : 0];
						final OverlayType class124 = OverlayType.list(-1 + i_114_);
						final Class120_Sub9 class120_sub9 = AbstractGraphicsBuffer.method1840(hashtable, class124);
						class120_sub9.anInt2507 += 5;
						class120_sub9.anInt2507 += -2 + bools_117_.length;
						class120_sub9.anInt2507 += bools.length + -2;
						class120_sub9.anInt2507 += bools_115_.length + -2;
						class120_sub9.anInt2507 += bools_116_.length - 2;
						class120_sub9.anInt2519++;
					}
				}
			}
		}
		for (Class120_Sub9 class120_sub9 = (Class120_Sub9) hashtable.getFirst(); class120_sub9 != null; class120_sub9 = (Class120_Sub9) hashtable.getNext()) {
			class120_sub9.method1167();
		}
		for (int i_118_ = 1; i_118_ <= 102; i_118_++) {
			for (int i_119_ = 1; i_119_ <= 102; i_119_++) {
				int i_120_;
				if ((is[i_62_][i_118_][i_119_] & 0x8) != 0) {
					i_120_ = 0;
				} else if ((0x2 & is[1][i_118_][i_119_]) == 2 && i_62_ > 0) {
					i_120_ = i_62_ + -1;
				} else {
					i_120_ = i_62_;
				}
				final int i_121_ = is_60_[i_118_][i_119_] & 0xff;
				final int i_122_ = 0xff & is_66_[i_118_][i_119_];
				if (i_121_ != 0) {
					final OverlayType class124 = OverlayType.list(-1 + i_121_);
					if ((class124.anInt1197 ^ 0xffffffff) == 0) {
						continue;
					}
					final Class120_Sub9 class120_sub9 = AbstractGraphicsBuffer.method1840(hashtable, class124);
					final byte i_123_ = is_63_[i_118_][i_119_];
					final byte i_124_ = is_64_[i_118_][i_119_];
					final int i_125_ = FileSystem.method443(is_61_[i_118_][i_119_], class124.textureId, 13080, class124.anInt1197);
					final int i_126_ = FileSystem.method443(is_61_[1 + i_118_][i_119_], class124.textureId, 13080, class124.anInt1197);
					final int i_127_ = FileSystem.method443(is_61_[i_118_ + 1][i_119_ + 1], class124.textureId, 13080, class124.anInt1197);
					final int i_128_ = FileSystem.method443(is_61_[i_118_][i_119_ + 1], class124.textureId, 13080, class124.anInt1197);
					Class22.method196(fs_68_, i_126_, (byte) 123, i_120_, i_128_, i_127_, fs, i_125_, i_123_, i_124_, class120_sub9, i_122_ != 0 && class124.aBoolean1196, fs_67_, is_65_, i_118_, i_119_);
				}
				if ((0xff & is_66_[i_118_][i_119_]) != 0 || i_121_ != 0 && is_63_[i_118_][i_119_] == 0) {
					int i_129_ = 0;
					final int[] is_130_ = new int[8];
					int i_131_ = 0;
					int i_132_ = 0;
					int i_133_ = 0;
					int i_134_ = 0;
					final int i_135_ = is_60_[i_118_ - 1][i_119_] & 0xff;
					final int i_136_ = is_60_[i_118_ + 1][i_119_] & 0xff;
					final int i_137_ = 0xff & is_60_[i_118_][-1 + i_119_];
					final int i_138_ = is_60_[i_118_][1 + i_119_] & 0xff;
					int i_139_ = 0xff & is_60_[-1 + i_118_][i_119_ - 1];
					int i_140_ = is_60_[-1 + i_118_][1 + i_119_] & 0xff;
					int i_141_ = 0xff & is_60_[1 + i_118_][i_119_ - 1];
					int i_142_ = is_60_[i_118_ + 1][1 + i_119_] & 0xff;
					if (i_140_ != 0 && i_121_ != i_140_) {
						final OverlayType class124 = OverlayType.list(i_140_ - 1);
						if (!class124.aBoolean1196 || (class124.anInt1197 ^ 0xffffffff) == 0) {
							i_140_ = 0;
						} else {
							final int i_143_ = is_64_[i_118_ - 1][i_119_ + 1];
							final int i_144_ = is_63_[-1 + i_118_][1 + i_119_];
							final int i_145_ = Class120_Sub24.anIntArray2730[i_144_ * 4 + (0x3 & i_143_ + 3)];
							final int i_146_ = Class120_Sub24.anIntArray2730[(0x3 & 2 + i_143_) + 4 * i_144_];
							if (Class132_Sub1.aBooleanArrayArray2811[i_145_][1] && Class132_Sub1.aBooleanArrayArray2811[i_146_][0]) {
								i_140_ = 0;
							} else {
								for (int i_147_ = 0; i_147_ < 8; i_147_++) {
									if (i_129_ == i_147_) {
										is_130_[i_129_++] = i_140_;
										break;
									}
									if (i_140_ == is_130_[i_147_]) {
										break;
									}
								}
							}
						}
					} else {
						i_140_ = 0;
					}
					if (i_139_ != 0 && i_121_ != i_139_) {
						final OverlayType class124 = OverlayType.list(-1 + i_139_);
						if (class124.aBoolean1196 && (class124.anInt1197 ^ 0xffffffff) != 0) {
							final int i_148_ = is_64_[-1 + i_118_][-1 + i_119_];
							final int i_149_ = is_63_[i_118_ - 1][i_119_ + -1];
							final int i_150_ = Class120_Sub24.anIntArray2730[i_149_ * 4 + (0x3 & i_148_)];
							final int i_151_ = Class120_Sub24.anIntArray2730[(i_148_ + 3 & 0x3) + 4 * i_149_];
							if (Class132_Sub1.aBooleanArrayArray2811[i_150_][1] && Class132_Sub1.aBooleanArrayArray2811[i_151_][0]) {
								i_139_ = 0;
							} else {
								for (int i_152_ = 0; i_152_ < 8; i_152_++) {
									if (i_129_ == i_152_) {
										is_130_[i_129_++] = i_139_;
										break;
									}
									if (is_130_[i_152_] == i_139_) {
										break;
									}
								}
							}
						} else {
							i_139_ = 0;
						}
					} else {
						i_139_ = 0;
					}
					if (i_141_ != 0 && i_141_ != i_121_) {
						final OverlayType class124 = OverlayType.list(-1 + i_141_);
						if (class124.aBoolean1196 && class124.anInt1197 != -1) {
							final int i_153_ = is_64_[1 + i_118_][-1 + i_119_];
							final int i_154_ = is_63_[i_118_ + 1][-1 + i_119_];
							final int i_155_ = Class120_Sub24.anIntArray2730[4 * i_154_ + (0x3 & i_153_)];
							final int i_156_ = Class120_Sub24.anIntArray2730[(0x3 & 1 + i_153_) + 4 * i_154_];
							if (Class132_Sub1.aBooleanArrayArray2811[i_156_][1] && Class132_Sub1.aBooleanArrayArray2811[i_155_][0]) {
								i_141_ = 0;
							} else {
								for (int i_157_ = 0; i_157_ < 8; i_157_++) {
									if (i_129_ == i_157_) {
										is_130_[i_129_++] = i_141_;
										break;
									}
									if (i_141_ == is_130_[i_157_]) {
										break;
									}
								}
							}
						} else {
							i_141_ = 0;
						}
					} else {
						i_141_ = 0;
					}
					if (i_142_ == 0 || i_142_ == i_121_) {
						i_142_ = 0;
					} else {
						final OverlayType class124 = OverlayType.list(-1 + i_142_);
						if (class124.aBoolean1196 && class124.anInt1197 != -1) {
							final int i_158_ = is_64_[1 + i_118_][1 + i_119_];
							final int i_159_ = is_63_[1 + i_118_][1 + i_119_];
							final int i_160_ = Class120_Sub24.anIntArray2730[(i_158_ + 1 & 0x3) + i_159_ * 4];
							final int i_161_ = Class120_Sub24.anIntArray2730[(2 + i_158_ & 0x3) + 4 * i_159_];
							if (Class132_Sub1.aBooleanArrayArray2811[i_161_][1] && Class132_Sub1.aBooleanArrayArray2811[i_160_][0]) {
								i_142_ = 0;
							} else {
								for (int i_162_ = 0; i_162_ < 8; i_162_++) {
									if (i_162_ == i_129_) {
										is_130_[i_129_++] = i_142_;
										break;
									}
									if (i_142_ == is_130_[i_162_]) {
										break;
									}
								}
							}
						} else {
							i_142_ = 0;
						}
					}
					if (i_138_ != 0 && i_138_ != i_121_) {
						final OverlayType class124 = OverlayType.list(i_138_ + -1);
						if (class124.aBoolean1196 && class124.anInt1197 != -1) {
							i_131_ = Class120_Sub24.anIntArray2730[4 * is_63_[i_118_][i_119_ + 1] + (is_64_[i_118_][i_119_ + 1] + 2 & 0x3)];
							for (int i_163_ = 0; i_163_ < 8; i_163_++) {
								if (i_163_ == i_129_) {
									is_130_[i_129_++] = i_138_;
									break;
								}
								if (is_130_[i_163_] == i_138_) {
									break;
								}
							}
						}
					}
					if (i_135_ != 0 && i_121_ != i_135_) {
						final OverlayType class124 = OverlayType.list(i_135_ - 1);
						if (class124.aBoolean1196 && class124.anInt1197 != -1) {
							i_132_ = Class120_Sub24.anIntArray2730[is_63_[i_118_ - 1][i_119_] * 4 + (3 + is_64_[-1 + i_118_][i_119_] & 0x3)];
							for (int i_164_ = 0; i_164_ < 8; i_164_++) {
								if (i_164_ == i_129_) {
									is_130_[i_129_++] = i_135_;
									break;
								}
								if (i_135_ == is_130_[i_164_]) {
									break;
								}
							}
						}
					}
					if (i_137_ != 0 && i_121_ != i_137_) {
						final OverlayType class124 = OverlayType.list(i_137_ + -1);
						if (class124.aBoolean1196 && (class124.anInt1197 ^ 0xffffffff) != 0) {
							i_133_ = Class120_Sub24.anIntArray2730[is_63_[i_118_][-1 + i_119_] * 4 + (is_64_[i_118_][-1 + i_119_] & 0x3)];
							for (int i_165_ = 0; i_165_ < 8; i_165_++) {
								if (i_165_ == i_129_) {
									is_130_[i_129_++] = i_137_;
									break;
								}
								if (is_130_[i_165_] == i_137_) {
									break;
								}
							}
						}
					}
					if (i_136_ != 0 && i_121_ != i_136_) {
						final OverlayType class124 = OverlayType.list(-1 + i_136_);
						if (class124.aBoolean1196 && (class124.anInt1197 ^ 0xffffffff) != 0) {
							i_134_ = Class120_Sub24.anIntArray2730[4 * is_63_[1 + i_118_][i_119_] + (is_64_[i_118_ + 1][i_119_] + 1 & 0x3)];
							for (int i_166_ = 0; i_166_ < 8; i_166_++) {
								if (i_129_ == i_166_) {
									is_130_[i_129_++] = i_136_;
									break;
								}
								if (i_136_ == is_130_[i_166_]) {
									break;
								}
							}
						}
					}
					for (int i_167_ = 0; i_167_ < i_129_; i_167_++) {
						final int i_168_ = is_130_[i_167_];
						final boolean[] bools = Class132_Sub1.aBooleanArrayArray2811[i_138_ != i_168_ ? 0 : i_131_];
						final boolean[] bools_169_ = Class132_Sub1.aBooleanArrayArray2811[i_168_ != i_135_ ? 0 : i_132_];
						final boolean[] bools_170_ = Class132_Sub1.aBooleanArrayArray2811[i_168_ == i_137_ ? i_133_ : 0];
						final boolean[] bools_171_ = Class132_Sub1.aBooleanArrayArray2811[i_168_ == i_136_ ? i_134_ : 0];
						final OverlayType class124 = OverlayType.list(i_168_ + -1);
						final Class120_Sub9 class120_sub9 = AbstractGraphicsBuffer.method1840(hashtable, class124);
						final int i_172_ = 0xff | FileSystem.method443(is_61_[i_118_][i_119_], class124.textureId, 13080, class124.anInt1197) << 8;
						final int i_173_ = 0xff | FileSystem.method443(is_61_[1 + i_118_][i_119_], class124.textureId, 13080, class124.anInt1197) << 8;
						final int i_174_ = 0xff | FileSystem.method443(is_61_[i_118_ + 1][1 + i_119_], class124.textureId, 13080, class124.anInt1197) << 8;
						int i_175_ = 6;
						final int i_176_ = FileSystem.method443(is_61_[i_118_][1 + i_119_], class124.textureId, 13080, class124.anInt1197) << 8 | 0xff;
						i_175_ += bools.length + -2;
						i_175_ += -2 + bools_169_.length;
						final boolean bool = i_168_ != i_140_ && bools_169_[0] && bools[1];
						i_175_ += -2 + bools_170_.length;
						i_175_ += -2 + bools_171_.length;
						final boolean bool_177_ = i_168_ != i_141_ && bools_171_[0] && bools_170_[1];
						final boolean bool_178_ = i_139_ != i_168_ && bools_170_[0] && bools_169_[1];
						final int[] is_179_ = new int[i_175_];
						final boolean bool_180_ = i_168_ != i_142_ && bools[0] && bools_171_[1];
						i_175_ = 0;
						final int i_181_ = Class120_Sub14_Sub22.method1634(fs, 64, i_119_, is_65_, fs_67_, null, class120_sub9, i_173_, i_118_, true, 0.0F, fs_68_, 0, 64, 103, i_176_, i_174_, i_172_);
						final int i_182_ = Class120_Sub14_Sub22.method1634(fs, 128, i_119_, is_65_, fs_67_, null, class120_sub9, i_173_, i_118_, bool, 0.0F, fs_68_, 0, 0, 92, i_176_, i_174_, i_172_);
						final int i_183_ = Class120_Sub14_Sub22.method1634(fs, 128, i_119_, is_65_, fs_67_, null, class120_sub9, i_173_, i_118_, bool_180_, 0.0F, fs_68_, 0, 128, 26, i_176_, i_174_, i_172_);
						final int i_184_ = Class120_Sub14_Sub22.method1634(fs, 0, i_119_, is_65_, fs_67_, null, class120_sub9, i_173_, i_118_, bool_178_, 0.0F, fs_68_, 0, 0, 80, i_176_, i_174_, i_172_);
						final int i_185_ = Class120_Sub14_Sub22.method1634(fs, 0, i_119_, is_65_, fs_67_, null, class120_sub9, i_173_, i_118_, bool_177_, 0.0F, fs_68_, 0, 128, 71, i_176_, i_174_, i_172_);
						is_179_[i_175_++] = i_181_;
						is_179_[i_175_++] = i_183_;
						if (bools.length > 2) {
							is_179_[i_175_++] = Class120_Sub14_Sub22.method1634(fs, 128, i_119_, is_65_, fs_67_, null, class120_sub9, i_173_, i_118_, bools[2], 0.0F, fs_68_, 0, 64, 103, i_176_, i_174_, i_172_);
						}
						is_179_[i_175_++] = i_182_;
						if (bools_169_.length > 2) {
							is_179_[i_175_++] = Class120_Sub14_Sub22.method1634(fs, 64, i_119_, is_65_, fs_67_, null, class120_sub9, i_173_, i_118_, bools_169_[2], 0.0F, fs_68_, 0, 0, 103, i_176_, i_174_, i_172_);
						}
						is_179_[i_175_++] = i_184_;
						if (bools_170_.length > 2) {
							is_179_[i_175_++] = Class120_Sub14_Sub22.method1634(fs, 0, i_119_, is_65_, fs_67_, null, class120_sub9, i_173_, i_118_, bools_170_[2], 0.0F, fs_68_, 0, 64, 69, i_176_, i_174_, i_172_);
						}
						is_179_[i_175_++] = i_185_;
						if (bools_171_.length > 2) {
							is_179_[i_175_++] = Class120_Sub14_Sub22.method1634(fs, 64, i_119_, is_65_, fs_67_, null, class120_sub9, i_173_, i_118_, bools_171_[2], 0.0F, fs_68_, 0, 128, 33, i_176_, i_174_, i_172_);
						}
						is_179_[i_175_++] = i_183_;
						class120_sub9.method1165(i_120_, i_118_, i_119_, is_179_, null, true);
					}
				}
			}
		}
		for (Class120_Sub9 class120_sub9 = (Class120_Sub9) hashtable.getFirst(); class120_sub9 != null; class120_sub9 = (Class120_Sub9) hashtable.getNext()) {
			if (class120_sub9.anInt2527 == 0) {
				class120_sub9.unlink();
			} else {
				class120_sub9.method1161();
			}
		}
		final int i_186_ = hashtable.getCount();
		final Class120_Sub9[] class120_sub9s_187_ = new Class120_Sub9[i_186_];
		final long[] ls = new long[i_186_];
		hashtable.method660(class120_sub9s_187_);
		for (int i_188_ = 0; i_188_ < i_186_; i_188_++) {
			ls[i_188_] = class120_sub9s_187_[i_188_].uid;
		}
		Class24.method209(-4391, ls, class120_sub9s_187_);
		return class120_sub9s_187_;
	}
}
