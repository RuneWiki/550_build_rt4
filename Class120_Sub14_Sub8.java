/* Class120_Sub14_Sub8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

abstract class Class120_Sub14_Sub8 extends NodeSub {
	private int anInt3494;
	int[] anIntArray3495;
	private int[] anIntArray3496;
	int anInt3497 = 0;
	private byte[] aByteArray3498;
	private Class107[] aClass107Array3499;
	private static StringBuffer aStringBuffer3500 = new StringBuffer(100);
	private int[] anIntArray3501;
	private int[] anIntArray3502;
	private int[] anIntArray3503;
	int[] anIntArray3504;
	private static int anInt3505;
	private static int anInt3506 = 256;
	private static int anInt3507;
	private static int anInt3508;
	private static int anInt3509;
	private static int anInt3510;
	private static int anInt3511 = 0;
	private int anInt3512;
	private static int anInt3513;
	private static int anInt3514;
	private static int anInt3515;
	private static String[] aStringArray3516;

	static {
		anInt3505 = 256;
		anInt3507 = 0;
		anInt3515 = 0;
		anInt3510 = -1;
		anInt3514 = -1;
		anInt3513 = -1;
		aStringArray3516 = new String[100];
		anInt3508 = -1;
		anInt3509 = 0;
	}

	private final void method1458(final byte[] is) {
		anIntArray3503 = new int[256];
		if (is.length == 257) {
			for (int i = 0; i < anIntArray3503.length; i++) {
				anIntArray3503[i] = is[i] & 0xff;
			}
			this.anInt3497 = is[256] & 0xff;
		} else {
			int i = 0;
			for (int i_0_ = 0; i_0_ < 256; i_0_++) {
				anIntArray3503[i_0_] = is[i++] & 0xff;
			}
			final int[] is_1_ = new int[256];
			final int[] is_2_ = new int[256];
			for (int i_3_ = 0; i_3_ < 256; i_3_++) {
				is_1_[i_3_] = is[i++] & 0xff;
			}
			for (int i_4_ = 0; i_4_ < 256; i_4_++) {
				is_2_[i_4_] = is[i++] & 0xff;
			}
			final byte[][] is_5_ = new byte[256][];
			for (int i_6_ = 0; i_6_ < 256; i_6_++) {
				is_5_[i_6_] = new byte[is_1_[i_6_]];
				byte i_7_ = 0;
				for (int i_8_ = 0; i_8_ < is_5_[i_6_].length; i_8_++) {
					i_7_ += is[i++];
					is_5_[i_6_][i_8_] = i_7_;
				}
			}
			final byte[][] is_9_ = new byte[256][];
			for (int i_10_ = 0; i_10_ < 256; i_10_++) {
				is_9_[i_10_] = new byte[is_1_[i_10_]];
				byte i_11_ = 0;
				for (int i_12_ = 0; i_12_ < is_9_[i_10_].length; i_12_++) {
					i_11_ += is[i++];
					is_9_[i_10_][i_12_] = i_11_;
				}
			}
			aByteArray3498 = new byte[65536];
			for (int i_13_ = 0; i_13_ < 256; i_13_++) {
				if (i_13_ != 32 && i_13_ != 160) {
					for (int i_14_ = 0; i_14_ < 256; i_14_++) {
						if (i_14_ != 32 && i_14_ != 160) {
							aByteArray3498[(i_13_ << 8) + i_14_] = (byte) method1477(is_5_, is_9_, is_2_, anIntArray3503, is_1_, i_13_, i_14_);
						}
					}
				}
			}
			this.anInt3497 = is_2_[32] + is_1_[32];
		}
	}

	final int method1459(final String string) {
		if (string == null) {
			return 0;
		}
		int i = -1;
		int i_15_ = 0;
		int i_16_ = 0;
		final int i_17_ = string.length();
		for (int i_18_ = 0; i_18_ < i_17_; i_18_++) {
			char c = string.charAt(i_18_);
			if (c == '<') {
				i = i_18_;
			} else {
				if (c == '>' && i != -1) {
					final String string_19_ = string.substring(i + 1, i_18_).toLowerCase();
					i = -1;
					if (string_19_.equals("lt")) {
						c = '<';
					} else if (string_19_.equals("gt")) {
						c = '>';
					} else if (string_19_.equals("nbsp")) {
						c = '\u00a0';
					} else if (string_19_.equals("shy")) {
						c = '\u00ad';
					} else if (string_19_.equals("times")) {
						c = '\u00d7';
					} else if (string_19_.equals("euro")) {
						c = '\u20ac';
					} else if (string_19_.equals("copy")) {
						c = '\u00a9';
					} else if (string_19_.equals("reg")) {
						c = '\u00ae';
					} else {
						if (string_19_.startsWith("img=")) {
							try {
								final int i_20_ = Class31.method265(string_19_.substring(4));
								i_16_ += aClass107Array3499[i_20_].anInt1029;
								i_15_ = 0;
							} catch (final Exception exception) {
								/* empty */
							}
						}
						continue;
					}
				}
				if (i == -1) {
					final int i_21_ = (char) (Class120_Sub3.method1060((byte) -107, c) & 0xff);
					i_16_ += anIntArray3503[i_21_];
					if (aByteArray3498 != null && i_15_ != 0) {
						i_16_ += aByteArray3498[(i_15_ << 8) + i_21_];
					}
					i_15_ = i_21_;
				}
			}
		}
		return i_16_;
	}

	abstract void method1460(int i, int i_22_, int i_23_, int i_24_, int i_25_, int i_26_, boolean bool);

	private final void method1461(final String string, int i, int i_27_) {
		i_27_ -= this.anInt3497;
		int i_28_ = -1;
		int i_29_ = 0;
		final int i_30_ = string.length();
		for (int i_31_ = 0; i_31_ < i_30_; i_31_++) {
			char c = string.charAt(i_31_);
			if (c == '<') {
				i_28_ = i_31_;
			} else {
				if (c == '>' && i_28_ != -1) {
					final String string_32_ = string.substring(i_28_ + 1, i_31_).toLowerCase();
					i_28_ = -1;
					if (string_32_.equals("lt")) {
						c = '<';
					} else if (string_32_.equals("gt")) {
						c = '>';
					} else if (string_32_.equals("nbsp")) {
						c = '\u00a0';
					} else if (string_32_.equals("shy")) {
						c = '\u00ad';
					} else if (string_32_.equals("times")) {
						c = '\u00d7';
					} else if (string_32_.equals("euro")) {
						c = '\u20ac';
					} else if (string_32_.equals("copy")) {
						c = '\u00a9';
					} else if (string_32_.equals("reg")) {
						c = '\u00ae';
					} else {
						if (string_32_.startsWith("img=")) {
							try {
								final int i_33_ = Class31.method265(string_32_.substring(4));
								final Class107 class107 = aClass107Array3499[i_33_];
								final int i_34_ = anIntArray3501 != null ? anIntArray3501[i_33_] : class107.anInt1028;
								if (anInt3506 == 256) {
									class107.method910(i, i_27_ + this.anInt3497 - i_34_);
								} else {
									class107.method911(i, i_27_ + this.anInt3497 - i_34_, anInt3506);
								}
								i += class107.anInt1029;
								i_29_ = 0;
							} catch (final Exception exception) {
								/* empty */
							}
						} else {
							method1485(string_32_);
						}
						continue;
					}
				}
				if (i_28_ == -1) {
					final int i_35_ = (char) (Class120_Sub3.method1060((byte) -70, c) & 0xff);
					if (aByteArray3498 != null && i_29_ != 0) {
						i += aByteArray3498[(i_29_ << 8) + i_35_];
					}
					final int i_36_ = this.anIntArray3504[i_35_];
					final int i_37_ = this.anIntArray3495[i_35_];
					if (i_35_ != 32) {
						if (anInt3506 == 256) {
							if (anInt3508 != -1) {
								method1460(i_35_, i + anIntArray3496[i_35_] + 1, i_27_ + anIntArray3502[i_35_] + 1, i_36_, i_37_, anInt3508, true);
							}
							method1460(i_35_, i + anIntArray3496[i_35_], i_27_ + anIntArray3502[i_35_], i_36_, i_37_, anInt3507, false);
						} else {
							if (anInt3508 != -1) {
								method1471(i_35_, i + anIntArray3496[i_35_] + 1, i_27_ + anIntArray3502[i_35_] + 1, i_36_, i_37_, anInt3508, anInt3506, true);
							}
							method1471(i_35_, i + anIntArray3496[i_35_], i_27_ + anIntArray3502[i_35_], i_36_, i_37_, anInt3507, anInt3506, false);
						}
					} else if (anInt3515 > 0) {
						anInt3511 += anInt3515;
						i += anInt3511 >> 8;
						anInt3511 &= 0xff;
					}
					final int i_38_ = anIntArray3503[i_35_];
					if (anInt3513 != -1) {
						if (HDToolkit.glEnabled) {
							GraphicsHD.method598(i, i_27_ + (int) (this.anInt3497 * 0.7), i_38_, anInt3513);
						} else {
							GraphicsLD.method2160(i, i_27_ + (int) (this.anInt3497 * 0.7), i_38_, anInt3513);
						}
					}
					if (anInt3514 != -1) {
						if (HDToolkit.glEnabled) {
							GraphicsHD.method598(i, i_27_ + this.anInt3497 + 1, i_38_, anInt3514);
						} else {
							GraphicsLD.method2160(i, i_27_ + this.anInt3497 + 1, i_38_, anInt3514);
						}
					}
					i += i_38_;
					i_29_ = i_35_;
				}
			}
		}
	}

	final int method1462(final String string, final int i, final int i_39_, final int i_40_, final int i_41_, final int i_42_, final int i_43_, final int i_44_, final int i_45_, final int i_46_) {
		return method1467(string, i, i_39_, i_40_, i_41_, i_42_, i_43_, 256, i_44_, i_45_, i_46_);
	}

	final void method1463(final String string, final int i, final int i_47_, final int i_48_, final int i_49_, final int i_50_) {
		if (string != null) {
			method1465(i_48_, i_49_);
			final int i_51_ = string.length();
			final int[] is = new int[i_51_];
			final int[] is_52_ = new int[i_51_];
			for (int i_53_ = 0; i_53_ < i_51_; i_53_++) {
				is[i_53_] = (int) (Math.sin(i_53_ / 5.0 + i_50_ / 5.0) * 5.0);
				is_52_[i_53_] = (int) (Math.sin(i_53_ / 3.0 + i_50_ / 5.0) * 5.0);
			}
			method1475(string, i - method1459(string) / 2, i_47_, is, is_52_);
		}
	}

	private final void method1464(final String string, final int i) {
		int i_54_ = 0;
		boolean bool = false;
		final int i_55_ = string.length();
		for (int i_56_ = 0; i_56_ < i_55_; i_56_++) {
			final char c = string.charAt(i_56_);
			if (c == '<') {
				bool = true;
			} else if (c == '>') {
				bool = false;
			} else if (!bool && c == ' ') {
				i_54_++;
			}
		}
		if (i_54_ > 0) {
			anInt3515 = (i - method1459(string) << 8) / i_54_;
		}
	}

	private final void method1465(final int i, final int i_57_) {
		anInt3513 = -1;
		anInt3514 = -1;
		anInt3508 = anInt3510 = i_57_;
		anInt3507 = anInt3509 = i;
		anInt3506 = anInt3505 = 256;
		anInt3515 = 0;
		anInt3511 = 0;
	}

	final void method1466(final String string, final int i, final int i_58_, final int i_59_, final int i_60_) {
		if (string != null) {
			method1465(i_59_, i_60_);
			method1461(string, i, i_58_);
		}
	}

	final int method1467(final String string, final int i, final int i_61_, final int i_62_, final int i_63_, final int i_64_, final int i_65_, final int i_66_, final int i_67_, int i_68_, int i_69_) {
		if (string == null) {
			return 0;
		}
		method1483(i_64_, i_65_, i_66_);
		if (i_69_ == 0) {
			i_69_ = this.anInt3497;
		}
		int[] is = { i_62_ };
		if (i_63_ < anInt3494 + anInt3512 + i_69_ && i_63_ < i_69_ + i_69_) {
			is = null;
		}
		final int i_70_ = method1486(string, is, aStringArray3516);
		if (i_68_ == 3 && i_70_ == 1) {
			i_68_ = 1;
		}
		int i_71_;
		if (i_68_ == 0) {
			i_71_ = i_61_ + anInt3494;
		} else if (i_68_ == 1) {
			i_71_ = i_61_ + anInt3494 + (i_63_ - anInt3494 - anInt3512 - (i_70_ - 1) * i_69_) / 2;
		} else if (i_68_ == 2) {
			i_71_ = i_61_ + i_63_ - anInt3512 - (i_70_ - 1) * i_69_;
		} else {
			int i_72_ = (i_63_ - anInt3494 - anInt3512 - (i_70_ - 1) * i_69_) / (i_70_ + 1);
			if (i_72_ < 0) {
				i_72_ = 0;
			}
			i_71_ = i_61_ + anInt3494 + i_72_;
			i_69_ += i_72_;
		}
		for (int i_73_ = 0; i_73_ < i_70_; i_73_++) {
			if (i_67_ == 0) {
				method1461(aStringArray3516[i_73_], i, i_71_);
			} else if (i_67_ == 1) {
				method1461(aStringArray3516[i_73_], i + (i_62_ - method1459(aStringArray3516[i_73_])) / 2, i_71_);
			} else if (i_67_ == 2) {
				method1461(aStringArray3516[i_73_], i + i_62_ - method1459(aStringArray3516[i_73_]), i_71_);
			} else if (i_73_ == i_70_ - 1) {
				method1461(aStringArray3516[i_73_], i, i_71_);
			} else {
				method1464(aStringArray3516[i_73_], i_62_);
				method1461(aStringArray3516[i_73_], i, i_71_);
				anInt3515 = 0;
			}
			i_71_ += i_69_;
		}
		return i_70_;
	}

	final int method1468(final String string, final int i) {
		final int i_74_ = method1486(string, new int[] { i }, aStringArray3516);
		int i_75_ = 0;
		for (int i_76_ = 0; i_76_ < i_74_; i_76_++) {
			final int i_77_ = method1459(aStringArray3516[i_76_]);
			if (i_77_ > i_75_) {
				i_75_ = i_77_;
			}
		}
		return i_75_;
	}

	final void method1469(final String string, final int i, final int i_78_, final int i_79_, final int i_80_, final int i_81_) {
		if (string != null) {
			method1465(i_79_, i_80_);
			final int i_82_ = string.length();
			final int[] is = new int[i_82_];
			for (int i_83_ = 0; i_83_ < i_82_; i_83_++) {
				is[i_83_] = (int) (Math.sin(i_83_ / 2.0 + i_81_ / 5.0) * 5.0);
			}
			method1475(string, i - method1459(string) / 2, i_78_, null, is);
		}
	}

	final int method1470(final String string, final int i, final int i_84_, final int i_85_, final int i_86_, final Random random, final int i_87_) {
		if (string == null) {
			return 0;
		}
		random.setSeed(i_87_);
		method1483(i_85_, i_86_, 192 + (random.nextInt() & 0x1f));
		final int i_88_ = string.length();
		final int[] is = new int[i_88_];
		int i_89_ = 0;
		for (int i_90_ = 0; i_90_ < i_88_; i_90_++) {
			is[i_90_] = i_89_;
			if ((random.nextInt() & 0x3) == 0) {
				i_89_++;
			}
		}
		method1475(string, i, i_84_, is, null);
		return i_89_;
	}

	abstract void method1471(int i, int i_91_, int i_92_, int i_93_, int i_94_, int i_95_, int i_96_, boolean bool);

	static final String method1472(final String string) {
		final int i = string.length();
		int i_97_ = 0;
		for (int i_98_ = 0; i_98_ < i; i_98_++) {
			final char c = string.charAt(i_98_);
			if (c == '<' || c == '>') {
				i_97_ += 3;
			}
		}
		final StringBuffer stringbuffer = new StringBuffer(i + i_97_);
		for (int i_99_ = 0; i_99_ < i; i_99_++) {
			final char c = string.charAt(i_99_);
			if (c == '<') {
				stringbuffer.append("<lt>");
			} else if (c == '>') {
				stringbuffer.append("<gt>");
			} else {
				stringbuffer.append(c);
			}
		}
		return stringbuffer.toString();
	}

	final void method1473(final String string, final int i, final int i_100_, final int i_101_, final int i_102_, final int i_103_, final int i_104_) {
		if (string != null) {
			method1465(i_101_, i_102_);
			double d = 7.0 - i_104_ / 8.0;
			if (d < 0.0) {
				d = 0.0;
			}
			final int i_105_ = string.length();
			final int[] is = new int[i_105_];
			for (int i_106_ = 0; i_106_ < i_105_; i_106_++) {
				is[i_106_] = (int) (Math.sin(i_106_ / 1.5 + i_103_ / 1.0) * d);
			}
			method1475(string, i - method1459(string) / 2, i_100_, null, is);
		}
	}

	final void method1474(final Class107[] class107s, final int[] is) {
		if (is != null && is.length != class107s.length) {
			throw new IllegalArgumentException();
		}
		aClass107Array3499 = class107s;
		anIntArray3501 = is;
	}

	private final void method1475(final String string, int i, int i_107_, final int[] is, final int[] is_108_) {
		i_107_ -= this.anInt3497;
		int i_109_ = -1;
		int i_110_ = 0;
		int i_111_ = 0;
		final int i_112_ = string.length();
		for (int i_113_ = 0; i_113_ < i_112_; i_113_++) {
			char c = string.charAt(i_113_);
			if (c == '<') {
				i_109_ = i_113_;
			} else {
				if (c == '>' && i_109_ != -1) {
					final String string_114_ = string.substring(i_109_ + 1, i_113_).toLowerCase();
					i_109_ = -1;
					if (string_114_.equals("lt")) {
						c = '<';
					} else if (string_114_.equals("gt")) {
						c = '>';
					} else if (string_114_.equals("nbsp")) {
						c = '\u00a0';
					} else if (string_114_.equals("shy")) {
						c = '\u00ad';
					} else if (string_114_.equals("times")) {
						c = '\u00d7';
					} else if (string_114_.equals("euro")) {
						c = '\u20ac';
					} else if (string_114_.equals("copy")) {
						c = '\u00a9';
					} else if (string_114_.equals("reg")) {
						c = '\u00ae';
					} else {
						if (string_114_.startsWith("img=")) {
							try {
								int i_115_;
								if (is != null) {
									i_115_ = is[i_111_];
								} else {
									i_115_ = 0;
								}
								int i_116_;
								if (is_108_ != null) {
									i_116_ = is_108_[i_111_];
								} else {
									i_116_ = 0;
								}
								i_111_++;
								final int i_117_ = Class31.method265(string_114_.substring(4));
								final Class107 class107 = aClass107Array3499[i_117_];
								final int i_118_ = anIntArray3501 != null ? anIntArray3501[i_117_] : class107.anInt1028;
								if (anInt3506 == 256) {
									class107.method910(i + i_115_, i_107_ + this.anInt3497 - i_118_ + i_116_);
								} else {
									class107.method911(i + i_115_, i_107_ + this.anInt3497 - i_118_ + i_116_, anInt3506);
								}
								i += class107.anInt1029;
								i_110_ = 0;
							} catch (final Exception exception) {
								/* empty */
							}
						} else {
							method1485(string_114_);
						}
						continue;
					}
				}
				if (i_109_ == -1) {
					final int i_119_ = (char) (Class120_Sub3.method1060((byte) -111, c) & 0xff);
					if (aByteArray3498 != null && i_110_ != 0) {
						i += aByteArray3498[(i_110_ << 8) + i_119_];
					}
					final int i_120_ = this.anIntArray3504[i_119_];
					final int i_121_ = this.anIntArray3495[i_119_];
					int i_122_;
					if (is != null) {
						i_122_ = is[i_111_];
					} else {
						i_122_ = 0;
					}
					int i_123_;
					if (is_108_ != null) {
						i_123_ = is_108_[i_111_];
					} else {
						i_123_ = 0;
					}
					i_111_++;
					if (i_119_ != 32) {
						if (anInt3506 == 256) {
							if (anInt3508 != -1) {
								method1460(i_119_, i + anIntArray3496[i_119_] + 1 + i_122_, i_107_ + anIntArray3502[i_119_] + 1 + i_123_, i_120_, i_121_, anInt3508, true);
							}
							method1460(i_119_, i + anIntArray3496[i_119_] + i_122_, i_107_ + anIntArray3502[i_119_] + i_123_, i_120_, i_121_, anInt3507, false);
						} else {
							if (anInt3508 != -1) {
								method1471(i_119_, i + anIntArray3496[i_119_] + 1 + i_122_, i_107_ + anIntArray3502[i_119_] + 1 + i_123_, i_120_, i_121_, anInt3508, anInt3506, true);
							}
							method1471(i_119_, i + anIntArray3496[i_119_] + i_122_, i_107_ + anIntArray3502[i_119_] + i_123_, i_120_, i_121_, anInt3507, anInt3506, false);
						}
					} else if (anInt3515 > 0) {
						anInt3511 += anInt3515;
						i += anInt3511 >> 8;
						anInt3511 &= 0xff;
					}
					final int i_124_ = anIntArray3503[i_119_];
					if (anInt3513 != -1) {
						if (HDToolkit.glEnabled) {
							GraphicsHD.method598(i, i_107_ + (int) (this.anInt3497 * 0.7), i_124_, anInt3513);
						} else {
							GraphicsLD.method2160(i, i_107_ + (int) (this.anInt3497 * 0.7), i_124_, anInt3513);
						}
					}
					if (anInt3514 != -1) {
						if (HDToolkit.glEnabled) {
							GraphicsHD.method598(i, i_107_ + this.anInt3497, i_124_, anInt3514);
						} else {
							GraphicsLD.method2160(i, i_107_ + this.anInt3497, i_124_, anInt3514);
						}
					}
					i += i_124_;
					i_110_ = i_119_;
				}
			}
		}
	}

	final int method1476(final String string, final int i, final int i_125_, final int i_126_, final int i_127_, final int i_128_, final int i_129_, final int i_130_, final int i_131_, final Random random, final int i_132_, final int[] is) {
		if (string == null) {
			return 0;
		}
		random.setSeed(i_132_);
		method1483(i_128_, i_129_, 192 + (random.nextInt() & 0x1f));
		final int i_133_ = string.length();
		final int[] is_134_ = new int[i_133_];
		int i_135_ = 0;
		for (int i_136_ = 0; i_136_ < i_133_; i_136_++) {
			is_134_[i_136_] = i_135_;
			if ((random.nextInt() & 0x3) == 0) {
				i_135_++;
			}
		}
		int i_137_ = i;
		int i_138_ = i_125_ + anInt3494;
		int i_139_ = -1;
		if (i_131_ == 1) {
			i_138_ += (i_127_ - anInt3494 - anInt3512) / 2;
		} else if (i_131_ == 2) {
			i_138_ = i_125_ + i_127_ - anInt3512;
		}
		if (i_130_ == 1) {
			i_139_ = method1459(string) + i_135_;
			i_137_ += (i_126_ - i_139_) / 2;
		} else if (i_130_ == 2) {
			i_139_ = method1459(string) + i_135_;
			i_137_ += i_126_ - i_139_;
		}
		method1475(string, i_137_, i_138_, is_134_, null);
		if (is != null) {
			if (i_139_ == -1) {
				i_139_ = method1459(string) + i_135_;
			}
			is[0] = i_137_;
			is[1] = i_138_ - anInt3494;
			is[2] = i_139_;
			is[3] = anInt3494 + anInt3512;
		}
		return i_135_;
	}

	private static final int method1477(final byte[][] is, final byte[][] is_140_, final int[] is_141_, final int[] is_142_, final int[] is_143_, final int i, final int i_144_) {
		final int i_145_ = is_141_[i];
		final int i_146_ = i_145_ + is_143_[i];
		final int i_147_ = is_141_[i_144_];
		final int i_148_ = i_147_ + is_143_[i_144_];
		int i_149_ = i_145_;
		if (i_147_ > i_145_) {
			i_149_ = i_147_;
		}
		int i_150_ = i_146_;
		if (i_148_ < i_146_) {
			i_150_ = i_148_;
		}
		int i_151_ = is_142_[i];
		if (is_142_[i_144_] < i_151_) {
			i_151_ = is_142_[i_144_];
		}
		final byte[] is_152_ = is_140_[i];
		final byte[] is_153_ = is[i_144_];
		int i_154_ = i_149_ - i_145_;
		int i_155_ = i_149_ - i_147_;
		for (int i_156_ = i_149_; i_156_ < i_150_; i_156_++) {
			final int i_157_ = is_152_[i_154_++] + is_153_[i_155_++];
			if (i_157_ < i_151_) {
				i_151_ = i_157_;
			}
		}
		return -i_151_;
	}

	final void method1478(final String string, final int i, final int i_158_, final int i_159_, final int i_160_) {
		if (string != null) {
			method1465(i_159_, i_160_);
			method1461(string, i - method1459(string) / 2, i_158_);
		}
	}

	public static void method1479() {
		aStringBuffer3500 = null;
		aStringArray3516 = null;
	}

	final int method1480(final String string, final int i, int i_161_) {
		if (i_161_ == 0) {
			i_161_ = this.anInt3497;
		}
		final int i_162_ = method1486(string, new int[] { i }, aStringArray3516);
		final int i_163_ = (i_162_ - 1) * i_161_;
		return anInt3494 + i_163_ + anInt3512;
	}

	final int method1481(final String string, final int i) {
		return method1486(string, new int[] { i }, aStringArray3516);
	}

	final void method1482(final String string, final int i, final int i_164_, final int i_165_, final int i_166_) {
		if (string != null) {
			method1465(i_165_, i_166_);
			method1461(string, i - method1459(string), i_164_);
		}
	}

	private final void method1483(final int i, final int i_167_, final int i_168_) {
		anInt3513 = -1;
		anInt3514 = -1;
		anInt3508 = anInt3510 = i_167_;
		anInt3507 = anInt3509 = i;
		anInt3506 = anInt3505 = i_168_;
		anInt3515 = 0;
		anInt3511 = 0;
	}

	private final int method1484(final char c) {
		return anIntArray3503[Class120_Sub3.method1060((byte) -103, c) & 0xff];
	}

	Class120_Sub14_Sub8(final byte[] is, final int[] is_169_, final int[] is_170_, final int[] is_171_, final int[] is_172_) {
		anIntArray3496 = is_169_;
		anIntArray3502 = is_170_;
		this.anIntArray3504 = is_171_;
		this.anIntArray3495 = is_172_;
		method1458(is);
		int i = 2147483647;
		int i_173_ = -2147483648;
		for (int i_174_ = 0; i_174_ < 256; i_174_++) {
			if (anIntArray3502[i_174_] < i && this.anIntArray3495[i_174_] != 0) {
				i = anIntArray3502[i_174_];
			}
			if (anIntArray3502[i_174_] + this.anIntArray3495[i_174_] > i_173_) {
				i_173_ = anIntArray3502[i_174_] + this.anIntArray3495[i_174_];
			}
		}
		anInt3494 = this.anInt3497 - i;
		anInt3512 = i_173_ - this.anInt3497;
	}

	private final void method1485(final String string) {
		try {
			if (string.startsWith("col=")) {
				anInt3507 = Class111.method982(-22511, 16, string.substring(4));
			} else if (string.equals("/col")) {
				anInt3507 = anInt3509;
			} else if (string.startsWith("trans=")) {
				anInt3506 = Class31.method265(string.substring(6));
			} else if (string.equals("/trans")) {
				anInt3506 = anInt3505;
			} else if (string.startsWith("str=")) {
				anInt3513 = Class111.method982(-22511, 16, string.substring(4));
			} else if (string.equals("str")) {
				anInt3513 = 8388608;
			} else if (string.equals("/str")) {
				anInt3513 = -1;
			} else if (string.startsWith("u=")) {
				anInt3514 = Class111.method982(-22511, 16, string.substring(2));
			} else if (string.equals("u")) {
				anInt3514 = 0;
			} else if (string.equals("/u")) {
				anInt3514 = -1;
			} else if (string.startsWith("shad=")) {
				anInt3508 = Class111.method982(-22511, 16, string.substring(5));
			} else if (string.equals("shad")) {
				anInt3508 = 0;
			} else if (string.equals("/shad")) {
				anInt3508 = anInt3510;
			} else if (string.equals("br")) {
				method1483(anInt3509, anInt3510, anInt3505);
			}
		} catch (final Exception exception) {
			/* empty */
		}
	}

	Class120_Sub14_Sub8(final byte[] is) {
		method1458(is);
	}

	final int method1486(final String string, final int[] is, final String[] strings) {
		if (string == null) {
			return 0;
		}
		Class89.method749(' ', aStringBuffer3500, 0, true);
		int i = 0;
		int i_175_ = 0;
		int i_176_ = -1;
		int i_177_ = 0;
		int i_178_ = 0;
		int i_179_ = -1;
		int i_180_ = 0;
		int i_181_ = 0;
		final int i_182_ = string.length();
		for (int i_183_ = 0; i_183_ < i_182_; i_183_++) {
			char c = string.charAt(i_183_);
			if (c == 60) {
				i_179_ = i_183_;
			} else {
				if (c == 62 && i_179_ != -1) {
					final String string_184_ = string.substring(i_179_ + 1, i_183_).toLowerCase();
					i_179_ = -1;
					aStringBuffer3500.append('<');
					aStringBuffer3500.append(string_184_);
					aStringBuffer3500.append('>');
					if (string_184_.equals("br")) {
						strings[i_181_] = aStringBuffer3500.toString().substring(i_175_, aStringBuffer3500.length());
						i_181_++;
						i_175_ = aStringBuffer3500.length();
						i = 0;
						i_176_ = -1;
						i_180_ = 0;
					} else if (string_184_.equals("lt")) {
						i += method1484('<');
						if (aByteArray3498 != null && i_180_ != 0) {
							i += aByteArray3498[(i_180_ << 8) + 60];
						}
						i_180_ = 60;
					} else if (string_184_.equals("gt")) {
						i += method1484('>');
						if (aByteArray3498 != null && i_180_ != 0) {
							i += aByteArray3498[(i_180_ << 8) + 62];
						}
						i_180_ = 62;
					} else if (string_184_.equals("nbsp")) {
						i += method1484('\u00a0');
						if (aByteArray3498 != null && i_180_ != 0) {
							i += aByteArray3498[(i_180_ << 8) + 160];
						}
						i_180_ = 160;
					} else if (string_184_.equals("shy")) {
						i += method1484('\u00ad');
						if (aByteArray3498 != null && i_180_ != 0) {
							i += aByteArray3498[(i_180_ << 8) + 173];
						}
						i_180_ = 173;
					} else if (string_184_.equals("times")) {
						i += method1484('\u00d7');
						if (aByteArray3498 != null && i_180_ != 0) {
							i += aByteArray3498[(i_180_ << 8) + 215];
						}
						i_180_ = 215;
					} else if (string_184_.equals("euro")) {
						i += method1484('\u20ac');
						if (aByteArray3498 != null && i_180_ != 0) {
							i += aByteArray3498[(i_180_ << 8) + 128];
						}
						i_180_ = 8364;
					} else if (string_184_.equals("copy")) {
						i += method1484('\u00a9');
						if (aByteArray3498 != null && i_180_ != 0) {
							i += aByteArray3498[(i_180_ << 8) + 169];
						}
						i_180_ = 169;
					} else if (string_184_.equals("reg")) {
						i += method1484('\u00ae');
						if (aByteArray3498 != null && i_180_ != 0) {
							i += aByteArray3498[(i_180_ << 8) + 174];
						}
						i_180_ = 174;
					} else if (string_184_.startsWith("img=")) {
						try {
							final int i_185_ = Class31.method265(string_184_.substring(4));
							i += aClass107Array3499[i_185_].anInt1029;
							i_180_ = 0;
						} catch (final Exception exception) {
							/* empty */
						}
					}
					c = '\0';
				}
				if (i_179_ == -1) {
					if (c != 0) {
						aStringBuffer3500.append(c);
						c = (char) (Class120_Sub3.method1060((byte) 120, c) & 0xff);
						i += anIntArray3503[c];
						if (aByteArray3498 != null && i_180_ != 0) {
							i += aByteArray3498[(i_180_ << 8) + c];
						}
						i_180_ = c;
					}
					if (c == 32) {
						i_176_ = aStringBuffer3500.length();
						i_177_ = i;
						i_178_ = 1;
					}
					if (is != null && i > is[i_181_ < is.length ? i_181_ : is.length - 1] && i_176_ >= 0) {
						strings[i_181_] = aStringBuffer3500.toString().substring(i_175_, i_176_ - i_178_);
						i_181_++;
						i_175_ = i_176_;
						i_176_ = -1;
						i -= i_177_;
						i_180_ = 0;
					}
					if (c == 45) {
						i_176_ = aStringBuffer3500.length();
						i_177_ = i;
						i_178_ = 0;
					}
				}
			}
		}
		if (aStringBuffer3500.length() > i_175_) {
			strings[i_181_] = aStringBuffer3500.toString().substring(i_175_, aStringBuffer3500.length());
			i_181_++;
		}
		return i_181_;
	}
}
