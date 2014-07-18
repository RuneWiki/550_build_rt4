/* Class180_Sub7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class180_Sub7 extends SceneGraphNode {
	boolean haveActions = false;

	abstract void method2360(int i);

	final void method2361(final FrameLoader class120_sub14_sub18, final int i, final FrameLoader class120_sub14_sub18_0_, final int i_1_, final int i_2_, final int i_3_, final FrameLoader class120_sub14_sub18_4_, final int i_5_,
			final FrameLoader class120_sub14_sub18_6_, final int i_7_, final int i_8_, final int i_9_, final boolean[] bools, final boolean bool) {
		if (i != -1) {
			if (bools == null || i_5_ == -1) {
				method2380(class120_sub14_sub18, i, class120_sub14_sub18_0_, i_1_, i_2_, i_3_, bool);
			} else if (method2375()) {
				final SeqFrame seqFrame = class120_sub14_sub18.seqFrames[i];
				final LabelGroup class120_sub1 = seqFrame.aClass120_Sub1_48;
				SeqFrame class1_10_ = null;
				if (class120_sub14_sub18_0_ != null) {
					class1_10_ = class120_sub14_sub18_0_.seqFrames[i_1_];
					if (class1_10_.aClass120_Sub1_48 != class120_sub1) {
						class1_10_ = null;
					}
				}
				final SeqFrame class1_11_ = class120_sub14_sub18_4_.seqFrames[i_5_];
				SeqFrame class1_12_ = null;
				if (class120_sub14_sub18_6_ != null) {
					class1_12_ = class120_sub14_sub18_6_.seqFrames[i_7_];
					if (class1_12_.aClass120_Sub1_48 != class120_sub1) {
						class1_12_ = null;
					}
				}
				method2370(class120_sub1, seqFrame, class1_10_, i_2_, i_3_, bools, false, bool, 65535, null);
				method2388(0, new int[0], 0, 0, 0, bool);
				method2370(class120_sub1, class1_11_, class1_12_, i_8_, i_9_, bools, true, bool, 65535, null);
				method2364();
			}
		}
	}

	@Override
	final void method2266(final int i, final int i_13_, final int i_14_, final int i_15_, final int i_16_) {
		/* empty */
	}

	abstract void method2362(int i);

	abstract int method2363();

	abstract void method2364();

	abstract void method2365();

	private static final int method2366(final int[][] is, final int i, final int i_17_) {
		final int i_18_ = i >> 7;
		final int i_19_ = i_17_ >> 7;
		if (i_18_ < 0 || i_19_ < 0 || i_18_ >= is.length || i_19_ >= is[0].length) {
			return 0;
		}
		final int i_20_ = i & 0x7f;
		final int i_21_ = i_17_ & 0x7f;
		final int i_22_ = is[i_18_][i_19_] * (128 - i_20_) + is[i_18_ + 1][i_19_] * i_20_ >> 7;
		final int i_23_ = is[i_18_][i_19_ + 1] * (128 - i_20_) + is[i_18_ + 1][i_19_ + 1] * i_20_ >> 7;
		return i_22_ * (128 - i_21_) + i_23_ * i_21_ >> 7;
	}

	abstract void method2367(int i, int i_24_, int i_25_, int i_26_, int i_27_, int i_28_, int i_29_, long l);

	abstract void method2368(int i, int i_30_, int i_31_);

	abstract void method2369(int i, int i_32_, int i_33_);

	private final void method2370(final LabelGroup class120_sub1, final SeqFrame seqFrame, final SeqFrame class1_34_, final int i, final int i_35_, final boolean[] bools, final boolean bool, final boolean bool_36_, final int i_37_, final int[] is) {
		if (class1_34_ == null || i == 0) {
			for (int i_38_ = 0; i_38_ < seqFrame.anInt43; i_38_++) {
				final short i_39_ = seqFrame.aShortArray35[i_38_];
				if (bools == null || bools[i_39_] == bool || class120_sub1.types[i_39_] == 0) {
					final short i_40_ = seqFrame.aShortArray40[i_38_];
					if (i_40_ != -1) {
						final int i_41_ = i_37_ & class120_sub1.anIntArray2405[i_40_];
						if (i_41_ != 65535) {
							method2382(0, class120_sub1.labels[i_40_], 0, 0, 0, bool_36_, i_41_, is);
						} else {
							method2388(0, class120_sub1.labels[i_40_], 0, 0, 0, bool_36_);
						}
					}
					final int i_42_ = i_37_ & class120_sub1.anIntArray2405[i_39_];
					if (i_42_ != 65535) {
						method2382(class120_sub1.types[i_39_], class120_sub1.labels[i_39_], seqFrame.aShortArray47[i_38_], seqFrame.aShortArray33[i_38_], seqFrame.aShortArray36[i_38_], bool_36_, i_42_, is);
					} else {
						method2388(class120_sub1.types[i_39_], class120_sub1.labels[i_39_], seqFrame.aShortArray47[i_38_], seqFrame.aShortArray33[i_38_], seqFrame.aShortArray36[i_38_], bool_36_);
					}
				}
			}
		} else {
			int i_43_ = 0;
			int i_44_ = 0;
			for (int i_45_ = 0; i_45_ < class120_sub1.length; i_45_++) {
				boolean bool_46_ = false;
				if (i_43_ < seqFrame.anInt43 && seqFrame.aShortArray35[i_43_] == i_45_) {
					bool_46_ = true;
				}
				boolean bool_47_ = false;
				if (i_44_ < class1_34_.anInt43 && class1_34_.aShortArray35[i_44_] == i_45_) {
					bool_47_ = true;
				}
				if (bool_46_ || bool_47_) {
					if (bools != null && bools[i_45_] != bool && class120_sub1.types[i_45_] != 0) {
						if (bool_46_) {
							i_43_++;
						}
						if (bool_47_) {
							i_44_++;
						}
					} else {
						int i_48_ = 0;
						final int i_49_ = class120_sub1.types[i_45_];
						if (i_49_ == 3) {
							i_48_ = 128;
						}
						int i_50_;
						int i_51_;
						int i_52_;
						short i_53_;
						byte i_54_;
						if (bool_46_) {
							i_50_ = seqFrame.aShortArray47[i_43_];
							i_51_ = seqFrame.aShortArray33[i_43_];
							i_52_ = seqFrame.aShortArray36[i_43_];
							i_53_ = seqFrame.aShortArray40[i_43_];
							i_54_ = seqFrame.aByteArray38[i_43_];
							i_43_++;
						} else {
							i_50_ = i_48_;
							i_51_ = i_48_;
							i_52_ = i_48_;
							i_53_ = (short) -1;
							i_54_ = (byte) 0;
						}
						int i_55_;
						int i_56_;
						int i_57_;
						short i_58_;
						byte i_59_;
						if (bool_47_) {
							i_55_ = class1_34_.aShortArray47[i_44_];
							i_56_ = class1_34_.aShortArray33[i_44_];
							i_57_ = class1_34_.aShortArray36[i_44_];
							i_58_ = class1_34_.aShortArray40[i_44_];
							i_59_ = class1_34_.aByteArray38[i_44_];
							i_44_++;
						} else {
							i_55_ = i_48_;
							i_56_ = i_48_;
							i_57_ = i_48_;
							i_58_ = (short) -1;
							i_59_ = (byte) 0;
						}
						int i_60_;
						int i_61_;
						int i_62_;
						if ((i_54_ & 0x2) != 0 || (i_59_ & 0x1) != 0) {
							i_60_ = i_50_;
							i_61_ = i_51_;
							i_62_ = i_52_;
						} else if (i_49_ == 2) {
							int i_63_ = i_55_ - i_50_ & 0x7ff;
							int i_64_ = i_56_ - i_51_ & 0x7ff;
							int i_65_ = i_57_ - i_52_ & 0x7ff;
							if (i_63_ >= 1024) {
								i_63_ -= 2048;
							}
							if (i_64_ >= 1024) {
								i_64_ -= 2048;
							}
							if (i_65_ >= 1024) {
								i_65_ -= 2048;
							}
							i_60_ = i_50_ + i_63_ * i / i_35_ & 0x7ff;
							i_61_ = i_51_ + i_64_ * i / i_35_ & 0x7ff;
							i_62_ = i_52_ + i_65_ * i / i_35_ & 0x7ff;
						} else if (i_49_ == 7) {
							int i_66_ = i_55_ - i_50_ & 0x3f;
							if (i_66_ >= 32) {
								i_66_ -= 64;
							}
							i_60_ = i_50_ + i_66_ * i / i_35_ & 0x3f;
							i_61_ = i_51_ + (i_56_ - i_51_) * i / i_35_;
							i_62_ = i_52_ + (i_57_ - i_52_) * i / i_35_;
						} else {
							i_60_ = i_50_ + (i_55_ - i_50_) * i / i_35_;
							i_61_ = i_51_ + (i_56_ - i_51_) * i / i_35_;
							i_62_ = i_52_ + (i_57_ - i_52_) * i / i_35_;
						}
						if (i_53_ != -1) {
							final int i_67_ = i_37_ & class120_sub1.anIntArray2405[i_53_];
							if (i_67_ != 65535) {
								method2382(0, class120_sub1.labels[i_53_], 0, 0, 0, bool_36_, i_67_, is);
							} else {
								method2388(0, class120_sub1.labels[i_53_], 0, 0, 0, bool_36_);
							}
						} else if (i_58_ != -1) {
							final int i_68_ = i_37_ & class120_sub1.anIntArray2405[i_58_];
							if (i_68_ != 65535) {
								method2382(0, class120_sub1.labels[i_58_], 0, 0, 0, bool_36_, i_68_, is);
							} else {
								method2388(0, class120_sub1.labels[i_58_], 0, 0, 0, bool_36_);
							}
						}
						final int i_69_ = i_37_ & class120_sub1.anIntArray2405[i_45_];
						if (i_69_ != 65535) {
							method2382(i_49_, class120_sub1.labels[i_45_], i_60_, i_61_, i_62_, bool_36_, i_69_, is);
						} else {
							method2388(i_49_, class120_sub1.labels[i_45_], i_60_, i_61_, i_62_, bool_36_);
						}
					}
				}
			}
		}
	}

	@Override
	abstract int getMaxY();

	abstract int method2371();

	@Override
	abstract void method2265(int i, int i_70_, int i_71_, int i_72_, int i_73_, int i_74_, int i_75_, int i_76_, long l, int i_77_, ParticleEngine class108_sub2);

	abstract void method2372();

	abstract void method2373();

	abstract int method2374();

	abstract boolean method2375();

	abstract Class180_Sub7 method2376(boolean bool, boolean bool_78_, boolean bool_79_);

	abstract void method2377(int i);

	abstract Class180_Sub7 method2378(boolean bool, boolean bool_80_, boolean bool_81_);

	abstract void method2379(int i, int i_82_, int i_83_, int i_84_);

	final void method2380(final FrameLoader class120_sub14_sub18, final int i, final FrameLoader class120_sub14_sub18_85_, final int i_86_, final int i_87_, final int i_88_, final boolean bool) {
		if (i != -1 && method2375()) {
			final SeqFrame seqFrame = class120_sub14_sub18.seqFrames[i];
			final LabelGroup class120_sub1 = seqFrame.aClass120_Sub1_48;
			SeqFrame class1_89_ = null;
			if (class120_sub14_sub18_85_ != null) {
				class1_89_ = class120_sub14_sub18_85_.seqFrames[i_86_];
				if (class1_89_.aClass120_Sub1_48 != class120_sub1) {
					class1_89_ = null;
				}
			}
			method2370(class120_sub1, seqFrame, class1_89_, i_87_, i_88_, null, false, bool, 65535, null);
			method2364();
		}
	}

	abstract Class180_Sub7 method2381(boolean bool, boolean bool_90_, boolean bool_91_);

	abstract void method2382(int i, int[] is, int i_92_, int i_93_, int i_94_, boolean bool, int i_95_, int[] is_96_);

	abstract int method2383();

	final void method2384(final FrameLoader class120_sub14_sub18, final int i, final FrameLoader class120_sub14_sub18_97_, final int i_98_, final int i_99_, final int i_100_, final int i_101_, final boolean bool, final int[] is) {
		if (i != -1 && method2375()) {
			final SeqFrame seqFrame = class120_sub14_sub18.seqFrames[i];
			final LabelGroup class120_sub1 = seqFrame.aClass120_Sub1_48;
			SeqFrame class1_102_ = null;
			if (class120_sub14_sub18_97_ != null) {
				class1_102_ = class120_sub14_sub18_97_.seqFrames[i_98_];
				if (class1_102_.aClass120_Sub1_48 != class120_sub1) {
					class1_102_ = null;
				}
			}
			method2370(class120_sub1, seqFrame, class1_102_, i_99_, i_100_, null, false, bool, i_101_, is);
			method2364();
		}
	}

	final void method2385(final int[][] is, final int i, final int i_103_, final int i_104_, final int i_105_, final int i_106_) {
		final int i_107_ = -i_105_ / 2;
		final int i_108_ = -i_106_ / 2;
		final int i_109_ = method2366(is, i + i_107_, i_104_ + i_108_);
		final int i_110_ = i_105_ / 2;
		final int i_111_ = -i_106_ / 2;
		final int i_112_ = method2366(is, i + i_110_, i_104_ + i_111_);
		final int i_113_ = -i_105_ / 2;
		final int i_114_ = i_106_ / 2;
		final int i_115_ = method2366(is, i + i_113_, i_104_ + i_114_);
		final int i_116_ = i_105_ / 2;
		final int i_117_ = i_106_ / 2;
		final int i_118_ = method2366(is, i + i_116_, i_104_ + i_117_);
		final int i_119_ = i_109_ < i_112_ ? i_109_ : i_112_;
		final int i_120_ = i_115_ < i_118_ ? i_115_ : i_118_;
		final int i_121_ = i_112_ < i_118_ ? i_112_ : i_118_;
		final int i_122_ = i_109_ < i_115_ ? i_109_ : i_115_;
		if (i_106_ != 0) {
			final int i_123_ = (int) (Math.atan2(i_119_ - i_120_, i_106_) * 325.95) & 0x7ff;
			if (i_123_ != 0) {
				method2377(i_123_);
			}
		}
		if (i_105_ != 0) {
			final int i_124_ = (int) (Math.atan2(i_122_ - i_121_, i_105_) * 325.95) & 0x7ff;
			if (i_124_ != 0) {
				method2362(i_124_);
			}
		}
		int i_125_ = i_109_ + i_118_;
		if (i_112_ + i_115_ < i_125_) {
			i_125_ = i_112_ + i_115_;
		}
		i_125_ = (i_125_ >> 1) - i_103_;
		if (i_125_ != 0) {
			method2368(0, i_125_, 0);
		}
	}

	abstract int method2386();

	abstract int getMaxZ();

	abstract void method2388(int i, int[] is, int i_126_, int i_127_, int i_128_, boolean bool);

	public Class180_Sub7() {
		/* empty */
	}

	final void method2389(final FrameLoader class120_sub14_sub18, final int i) {
		if (i != -1 && method2375()) {
			final SeqFrame seqFrame = class120_sub14_sub18.seqFrames[i];
			final LabelGroup class120_sub1 = seqFrame.aClass120_Sub1_48;
			for (int i_129_ = 0; i_129_ < seqFrame.anInt43; i_129_++) {
				final short i_130_ = seqFrame.aShortArray35[i_129_];
				if (class120_sub1.aBooleanArray2407[i_130_]) {
					if (seqFrame.aShortArray40[i_129_] != -1) {
						method2379(0, 0, 0, 0);
					}
					method2379(class120_sub1.types[i_130_], seqFrame.aShortArray47[i_129_], seqFrame.aShortArray33[i_129_], seqFrame.aShortArray36[i_129_]);
				}
			}
			method2364();
		}
	}
}
