/* Class47 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import javax.media.opengl.GL;

final class Class47 {
	static LDIndexedSprite[] floorshadowSprites;
	private static int anInt431;
	static LDIndexedSprite aClass107_Sub1_432;
	static Class94[][] aClass94ArrayArray433;
	private static int anInt434;

	static final void method382(final int i, final int i_0_) {
		anInt431 = i + 7 >> 3;
		anInt434 = i_0_ + 7 >> 3;
		aClass107_Sub1_432 = new LDIndexedSprite(anInt431 * 128 + 2, anInt434 * 128 + 2, 0);
		aClass94ArrayArray433 = new Class94[anInt431][anInt434];
		for (int i_1_ = 0; i_1_ < anInt431; i_1_++) {
			for (int i_2_ = 0; i_2_ < anInt434; i_2_++) {
				aClass94ArrayArray433[i_1_][i_2_] = new Class94();
			}
		}
	}

	private static final void method383(final byte[] is, final byte[] is_3_, int i, int i_4_, final int i_5_, final int i_6_, final int i_7_) {
		for (int i_8_ = -16; i_8_ < 0; i_8_++) {
			for (int i_9_ = -4; i_9_ < 0; i_9_++) {
				is[i_4_++] += 1 - is_3_[i];
				i += i_6_;
				is[i_4_++] += 1 - is_3_[i];
				i += i_6_;
				is[i_4_++] += 1 - is_3_[i];
				i += i_6_;
				is[i_4_++] += 1 - is_3_[i];
				i += i_6_;
			}
			i_4_ += i_5_;
			i += i_7_;
		}
	}

	static final void method384(final int i, final int i_10_, final boolean bool, final boolean bool_11_, final int i_12_, final int i_13_, final int i_14_, final int i_15_, final int i_16_, final int i_17_) {
		if ((!bool || !bool_11_) && (!bool || i != 1) && (!bool_11_ || i != 0)) {
			final int i_18_ = i_12_ << 7;
			final int i_19_ = i_14_ + i_15_ + i_16_ + i_17_ >> 2;
			final int i_20_ = i_13_ << 7;
			final int i_21_ = i_18_ - (i_19_ * AtmosphereManager.lightX >> 8) >> 3;
			final int i_22_ = i_20_ - (i_19_ * AtmosphereManager.lightZ >> 8) >> 3;
			if (i == 0 || i == 1 || !bool && !bool_11_) {
				method396(floorshadowSprites[1], aClass107_Sub1_432, i_21_ + 1, i_22_ + 1);
			} else {
				method393(floorshadowSprites[i], aClass107_Sub1_432, i_21_ + 1, i_22_ + 1, i_10_, bool);
			}
		}
	}

	private static final void method385(final byte[] is, final byte[] is_23_, int i, int i_24_, int i_25_, final int i_26_, final int i_27_, final int i_28_) {
		final int i_29_ = -(i_25_ >> 2);
		i_25_ = -(i_25_ & 0x3);
		for (int i_30_ = -i_26_; i_30_ < 0; i_30_++) {
			for (int i_31_ = i_29_; i_31_ < 0; i_31_++) {
				is[i_24_++] += is_23_[i++];
				is[i_24_++] += is_23_[i++];
				is[i_24_++] += is_23_[i++];
				is[i_24_++] += is_23_[i++];
			}
			for (int i_32_ = i_25_; i_32_ < 0; i_32_++) {
				is[i_24_++] += is_23_[i++];
			}
			i_24_ += i_27_;
			i += i_28_;
		}
	}

	private static final void method386(final byte[] is, final byte[] is_33_, int i, int i_34_, int i_35_, final int i_36_, final int i_37_, final int i_38_) {
		final int i_39_ = -(i_35_ >> 2);
		i_35_ = -(i_35_ & 0x3);
		for (int i_40_ = -i_36_; i_40_ < 0; i_40_++) {
			for (int i_41_ = i_39_; i_41_ < 0; i_41_++) {
				is[i_34_++] -= is_33_[i++];
				is[i_34_++] -= is_33_[i++];
				is[i_34_++] -= is_33_[i++];
				is[i_34_++] -= is_33_[i++];
			}
			for (int i_42_ = i_35_; i_42_ < 0; i_42_++) {
				is[i_34_++] -= is_33_[i++];
			}
			i_34_ += i_37_;
			i += i_38_;
		}
	}

	static final void method387(final LDIndexedSprite class107_sub1, final int i, final int i_43_, final int i_44_) {
		if (class107_sub1 != null) {
			final int i_45_ = i - (i_43_ * AtmosphereManager.lightX >> 8) >> 3;
			final int i_46_ = i_44_ - (i_43_ * AtmosphereManager.lightZ >> 8) >> 3;
			method395(class107_sub1, aClass107_Sub1_432, i_45_ + 1, i_46_ + 1);
		}
	}

	static final void method388() {
		aClass107_Sub1_432 = null;
		floorshadowSprites = null;
		aClass94ArrayArray433 = null;
	}

	static final void method389(final LDIndexedSprite class107_sub1, final int i, final int i_47_, final int i_48_) {
		if (class107_sub1 != null) {
			final int i_49_ = i - (i_47_ * AtmosphereManager.lightX >> 8) >> 3;
			final int i_50_ = i_48_ - (i_47_ * AtmosphereManager.lightZ >> 8) >> 3;
			method396(class107_sub1, aClass107_Sub1_432, i_49_ + 1, i_50_ + 1);
		}
	}

	public static void method390() {
		aClass107_Sub1_432 = null;
		floorshadowSprites = null;
		aClass94ArrayArray433 = null;
	}

	static final boolean method391(final LDIndexedSprite class107_sub1, final int i, final int i_51_, final int i_52_) {
		if (class107_sub1 == null) {
			return false;
		}
		final int i_53_ = i - (i_51_ * AtmosphereManager.lightX >> 8) >> 3;
		final int i_54_ = i_52_ - (i_51_ * AtmosphereManager.lightZ >> 8) >> 3;
		return method394(class107_sub1, aClass107_Sub1_432, i_53_ + 1, i_54_ + 1);
	}

	static final void method392(final int i, final int i_55_, final int i_56_, final int i_57_, final boolean[][] bools, final int[][] is) {
		final GL gl = HDToolkit.gl;
		HDToolkit.method511(1);
		HDToolkit.method521(1);
		HDToolkit.method509();
		HDToolkit.toggleLighting(false);
		Class120_Sub14_Sub13.method1532(0, 0);
		gl.glDepthMask(false);
		for (int i_58_ = 0; i_58_ < anInt431; i_58_++) {
			for (int i_59_ = 0; i_59_ < anInt434; i_59_++) {
				while_35_: for (int i_60_ = i_58_ * 8; i_60_ < i_58_ * 8 + 8; i_60_++) {
					if (i_60_ - i >= -i_56_ && i_60_ - i <= i_56_) {
						for (int i_61_ = i_59_ * 8; i_61_ < i_59_ * 8 + 8; i_61_++) {
							if (i_61_ - i_55_ >= -i_56_ && i_61_ - i_55_ <= i_56_ && bools[i_60_ - i + i_56_][i_61_ - i_55_ + i_56_]) {
								final Class94 class94 = aClass94ArrayArray433[i_58_][i_59_];
								if (class94.aBoolean875) {
									class94.method776(aClass107_Sub1_432, i_58_, i_59_);
									class94.aBoolean875 = false;
								}
								gl.glPushMatrix();
								gl.glTranslatef(i_58_ * 1024, 0.0F, i_59_ * 1024);
								class94.method777();
								gl.glPopMatrix();
								break while_35_;
							}
						}
					}
				}
			}
		}
		gl.glEnableClientState(32886);
		gl.glDepthMask(true);
		HDToolkit.method532();
	}

	private static final void method393(final LDIndexedSprite class107_sub1, final LDIndexedSprite class107_sub1_62_, final int i, final int i_63_, final int i_64_, final boolean bool) {
		if (i > 0 && i_63_ > 0 && i + 16 < class107_sub1_62_.width && i_63_ + 16 < class107_sub1_62_.height) {
			final int i_65_ = i + i_63_ * class107_sub1_62_.width;
			final int i_66_ = class107_sub1_62_.width - 16;
			int i_67_;
			int i_68_;
			int i_69_;
			if (i_64_ == 0) {
				i_67_ = 240;
				i_68_ = 1;
				i_69_ = -i_68_ * 16 - 16;
			} else if (i_64_ == 1) {
				i_67_ = 255;
				i_68_ = -16;
				i_69_ = -i_68_ * 16 - 1;
			} else if (i_64_ == 2) {
				i_67_ = 15;
				i_68_ = -1;
				i_69_ = -i_68_ * 16 + 16;
			} else {
				i_67_ = 0;
				i_68_ = 16;
				i_69_ = -i_68_ * 16 + 1;
			}
			if (bool) {
				method383(class107_sub1_62_.paletteIndicators, class107_sub1.paletteIndicators, i_67_, i_65_, i_66_, i_68_, i_69_);
			} else {
				method399(class107_sub1_62_.paletteIndicators, class107_sub1.paletteIndicators, i_67_, i_65_, i_66_, i_68_, i_69_);
			}
			method397(i, i_63_, 16, 16);
		}
	}

	private static final boolean method394(final LDIndexedSprite class107_sub1, final LDIndexedSprite class107_sub1_70_, int i, int i_71_) {
		i += class107_sub1.xOffset;
		i_71_ += class107_sub1.yOffset;
		int i_72_ = i + i_71_ * class107_sub1_70_.width;
		int i_73_ = class107_sub1.height;
		int i_74_ = class107_sub1.width;
		int i_75_ = class107_sub1_70_.width - i_74_;
		if (i_71_ <= 0) {
			final int i_76_ = 1 - i_71_;
			i_73_ -= i_76_;
			i_72_ += i_76_ * class107_sub1_70_.width;
			i_71_ = 1;
		}
		if (i_71_ + i_73_ >= class107_sub1_70_.height) {
			final int i_77_ = i_71_ + i_73_ + 1 - class107_sub1_70_.height;
			i_73_ -= i_77_;
		}
		if (i <= 0) {
			final int i_78_ = 1 - i;
			i_74_ -= i_78_;
			i_72_ += i_78_;
			i_75_ += i_78_;
			i = 1;
		}
		if (i + i_74_ >= class107_sub1_70_.width) {
			final int i_79_ = i + i_74_ + 1 - class107_sub1_70_.width;
			i_74_ -= i_79_;
			i_75_ += i_79_;
		}
		if (i_74_ <= 0 || i_73_ <= 0) {
			return false;
		}
		i_75_ += 7 * class107_sub1_70_.width;
		return method398(class107_sub1_70_.paletteIndicators, i_72_, i_74_, i_73_, i_75_, 8);
	}

	private static final void method395(final LDIndexedSprite class107_sub1, final LDIndexedSprite class107_sub1_81_, int i, int i_82_) {
		i += class107_sub1.xOffset;
		i_82_ += class107_sub1.yOffset;
		int i_83_ = i + i_82_ * class107_sub1_81_.width;
		int i_84_ = 0;
		int i_85_ = class107_sub1.height;
		int i_86_ = class107_sub1.width;
		int i_87_ = class107_sub1_81_.width - i_86_;
		int i_88_ = 0;
		if (i_82_ <= 0) {
			final int i_89_ = 1 - i_82_;
			i_85_ -= i_89_;
			i_84_ += i_89_ * i_86_;
			i_83_ += i_89_ * class107_sub1_81_.width;
			i_82_ = 1;
		}
		if (i_82_ + i_85_ >= class107_sub1_81_.height) {
			final int i_90_ = i_82_ + i_85_ + 1 - class107_sub1_81_.height;
			i_85_ -= i_90_;
		}
		if (i <= 0) {
			final int i_91_ = 1 - i;
			i_86_ -= i_91_;
			i_84_ += i_91_;
			i_83_ += i_91_;
			i_88_ += i_91_;
			i_87_ += i_91_;
			i = 1;
		}
		if (i + i_86_ >= class107_sub1_81_.width) {
			final int i_92_ = i + i_86_ + 1 - class107_sub1_81_.width;
			i_86_ -= i_92_;
			i_88_ += i_92_;
			i_87_ += i_92_;
		}
		if (i_86_ > 0 && i_85_ > 0) {
			method386(class107_sub1_81_.paletteIndicators, class107_sub1.paletteIndicators, i_84_, i_83_, i_86_, i_85_, i_87_, i_88_);
			method397(i, i_82_, i_86_, i_85_);
		}
	}

	private static final void method396(final LDIndexedSprite class107_sub1, final LDIndexedSprite class107_sub1_93_, int i, int i_94_) {
		i += class107_sub1.xOffset;
		i_94_ += class107_sub1.yOffset;
		int i_95_ = i + i_94_ * class107_sub1_93_.width;
		int i_96_ = 0;
		int i_97_ = class107_sub1.height;
		int i_98_ = class107_sub1.width;
		int i_99_ = class107_sub1_93_.width - i_98_;
		int i_100_ = 0;
		if (i_94_ <= 0) {
			final int i_101_ = 1 - i_94_;
			i_97_ -= i_101_;
			i_96_ += i_101_ * i_98_;
			i_95_ += i_101_ * class107_sub1_93_.width;
			i_94_ = 1;
		}
		if (i_94_ + i_97_ >= class107_sub1_93_.height) {
			final int i_102_ = i_94_ + i_97_ + 1 - class107_sub1_93_.height;
			i_97_ -= i_102_;
		}
		if (i <= 0) {
			final int i_103_ = 1 - i;
			i_98_ -= i_103_;
			i_96_ += i_103_;
			i_95_ += i_103_;
			i_100_ += i_103_;
			i_99_ += i_103_;
			i = 1;
		}
		if (i + i_98_ >= class107_sub1_93_.width) {
			final int i_104_ = i + i_98_ + 1 - class107_sub1_93_.width;
			i_98_ -= i_104_;
			i_100_ += i_104_;
			i_99_ += i_104_;
		}
		if (i_98_ > 0 && i_97_ > 0) {
			method385(class107_sub1_93_.paletteIndicators, class107_sub1.paletteIndicators, i_96_, i_95_, i_98_, i_97_, i_99_, i_100_);
			method397(i, i_94_, i_98_, i_97_);
		}
	}

	private static final void method397(final int i, final int i_105_, final int i_106_, final int i_107_) {
		final int i_108_ = i - 1 >> 7;
		final int i_109_ = i - 1 + i_106_ - 1 >> 7;
		final int i_110_ = i_105_ - 1 >> 7;
		final int i_111_ = i_105_ - 1 + i_107_ - 1 >> 7;
		for (int i_112_ = i_108_; i_112_ <= i_109_; i_112_++) {
			final Class94[] class94s = aClass94ArrayArray433[i_112_];
			for (int i_113_ = i_110_; i_113_ <= i_111_; i_113_++) {
				class94s[i_113_].aBoolean875 = true;
			}
		}
	}

	private static final boolean method398(final byte[] is, int i, final int i_114_, final int i_115_, final int i_116_, final int i_117_) {
		final int i_118_ = i_114_ % i_117_;
		int i_119_;
		if (i_118_ != 0) {
			i_119_ = i_117_ - i_118_;
		} else {
			i_119_ = 0;
		}
		final int i_120_ = -((i_115_ + i_117_ - 1) / i_117_);
		final int i_121_ = -((i_114_ + i_117_ - 1) / i_117_);
		for (int i_122_ = i_120_; i_122_ < 0; i_122_++) {
			for (int i_123_ = i_121_; i_123_ < 0; i_123_++) {
				if (is[i] == 0) {
					return true;
				}
				i += i_117_;
			}
			i -= i_119_;
			if (is[i - 1] == 0) {
				return true;
			}
			i += i_116_;
		}
		return false;
	}

	private static final void method399(final byte[] is, final byte[] is_124_, int i, int i_125_, final int i_126_, final int i_127_, final int i_128_) {
		for (int i_129_ = -16; i_129_ < 0; i_129_++) {
			for (int i_130_ = -4; i_130_ < 0; i_130_++) {
				is[i_125_++] += is_124_[i];
				i += i_127_;
				is[i_125_++] += is_124_[i];
				i += i_127_;
				is[i_125_++] += is_124_[i];
				i += i_127_;
				is[i_125_++] += is_124_[i];
				i += i_127_;
			}
			i_125_ += i_126_;
			i += i_128_;
		}
	}
}
