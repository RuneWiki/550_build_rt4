/* Class120_Sub14_Sub8_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class LDFont extends AbstractFont {
	private byte[][] paletteIndicators;

	@Override
	final void method1471(final int i, int i_0_, int i_1_, int i_2_, int i_3_, final int i_4_, final int i_5_, final boolean bool) {
		int i_6_ = i_0_ + i_1_ * GraphicsLD.width;
		int i_7_ = GraphicsLD.width - i_2_;
		int i_8_ = 0;
		int i_9_ = 0;
		if (i_1_ < GraphicsLD.startY) {
			final int i_10_ = GraphicsLD.startY - i_1_;
			i_3_ -= i_10_;
			i_1_ = GraphicsLD.startY;
			i_9_ += i_10_ * i_2_;
			i_6_ += i_10_ * GraphicsLD.width;
		}
		if (i_1_ + i_3_ > GraphicsLD.endY) {
			i_3_ -= i_1_ + i_3_ - GraphicsLD.endY;
		}
		if (i_0_ < GraphicsLD.startX) {
			final int i_11_ = GraphicsLD.startX - i_0_;
			i_2_ -= i_11_;
			i_0_ = GraphicsLD.startX;
			i_9_ += i_11_;
			i_6_ += i_11_;
			i_8_ += i_11_;
			i_7_ += i_11_;
		}
		if (i_0_ + i_2_ > GraphicsLD.endX) {
			final int i_12_ = i_0_ + i_2_ - GraphicsLD.endX;
			i_2_ -= i_12_;
			i_8_ += i_12_;
			i_7_ += i_12_;
		}
		if (i_2_ > 0 && i_3_ > 0) {
			method1489(GraphicsLD.pixels, paletteIndicators[i], i_4_, i_9_, i_6_, i_2_, i_3_, i_7_, i_8_, i_5_);
		}
	}

	@Override
	final void method1460(final int i, int i_13_, int i_14_, int i_15_, int i_16_, final int i_17_, final boolean bool) {
		int i_18_ = i_13_ + i_14_ * GraphicsLD.width;
		int i_19_ = GraphicsLD.width - i_15_;
		int i_20_ = 0;
		int i_21_ = 0;
		if (i_14_ < GraphicsLD.startY) {
			final int i_22_ = GraphicsLD.startY - i_14_;
			i_16_ -= i_22_;
			i_14_ = GraphicsLD.startY;
			i_21_ += i_22_ * i_15_;
			i_18_ += i_22_ * GraphicsLD.width;
		}
		if (i_14_ + i_16_ > GraphicsLD.endY) {
			i_16_ -= i_14_ + i_16_ - GraphicsLD.endY;
		}
		if (i_13_ < GraphicsLD.startX) {
			final int i_23_ = GraphicsLD.startX - i_13_;
			i_15_ -= i_23_;
			i_13_ = GraphicsLD.startX;
			i_21_ += i_23_;
			i_18_ += i_23_;
			i_20_ += i_23_;
			i_19_ += i_23_;
		}
		if (i_13_ + i_15_ > GraphicsLD.endX) {
			final int i_24_ = i_13_ + i_15_ - GraphicsLD.endX;
			i_15_ -= i_24_;
			i_20_ += i_24_;
			i_19_ += i_24_;
		}
		if (i_15_ > 0 && i_16_ > 0) {
			if (GraphicsLD.anIntArray1604 != null) {
				method1490(GraphicsLD.pixels, paletteIndicators[i], i_13_, i_14_, i_15_, i_16_, i_17_, i_21_, i_18_, i_19_, i_20_, GraphicsLD.anIntArray1604, GraphicsLD.anIntArray1605);
			} else {
				method1491(GraphicsLD.pixels, paletteIndicators[i], i_17_, i_21_, i_18_, i_15_, i_16_, i_19_, i_20_);
			}
		}
	}

	static final LDFont method2061(final int i_9_) {
		LDFont class120_sub14_sub8_sub2_10_ = (LDFont) Class15.aClass21_95.get(i_9_);
		if (class120_sub14_sub8_sub2_10_ != null) {
			return class120_sub14_sub8_sub2_10_;
		}
		final byte[] is = ClanMember.aClass50_2576.getFile(i_9_, 0);
		class120_sub14_sub8_sub2_10_ = new LDFont(is);
		class120_sub14_sub8_sub2_10_.setNameIcons(Class82.nameIconSprites, null);
		Class15.aClass21_95.put(class120_sub14_sub8_sub2_10_, i_9_);
		return class120_sub14_sub8_sub2_10_;
	}

	private static final void method1489(final int[] is, final byte[] is_25_, int i, int i_26_, int i_27_, final int i_28_, final int i_29_, final int i_30_, final int i_31_, int i_32_) {
		i = ((i & 0xff00ff) * i_32_ & ~0xff00ff) + ((i & 0xff00) * i_32_ & 0xff0000) >> 8;
		i_32_ = 256 - i_32_;
		for (int i_33_ = -i_29_; i_33_ < 0; i_33_++) {
			for (int i_34_ = -i_28_; i_34_ < 0; i_34_++) {
				if (is_25_[i_26_++] != 0) {
					final int i_35_ = is[i_27_];
					is[i_27_++] = (((i_35_ & 0xff00ff) * i_32_ & ~0xff00ff) + ((i_35_ & 0xff00) * i_32_ & 0xff0000) >> 8) + i;
				} else {
					i_27_++;
				}
			}
			i_27_ += i_30_;
			i_26_ += i_31_;
		}
	}

	LDFont(final byte[] data, final int[] xOffs, final int[] yOffs, final int[] widths, final int[] heights, final byte[][] indicators) {
		super(data, xOffs, yOffs, widths, heights);
		paletteIndicators = new byte[256][];
		paletteIndicators = indicators;
	}

	LDFont(final byte[] indicators) {
		super(indicators);
		paletteIndicators = new byte[256][];
	}

	private static final void method1490(final int[] is, final byte[] is_41_, final int i, final int i_42_, final int i_43_, final int i_44_, final int i_45_, int i_46_, int i_47_, final int i_48_, final int i_49_, final int[] is_50_, final int[] is_51_) {
		final int i_52_ = i - GraphicsLD.startX;
		final int i_53_ = i_42_ - GraphicsLD.startY;
		for (int i_54_ = i_53_; i_54_ < i_53_ + i_44_; i_54_++) {
			final int i_55_ = is_50_[i_54_];
			int i_56_ = is_51_[i_54_];
			int i_57_ = i_43_;
			if (i_52_ > i_55_) {
				final int i_58_ = i_52_ - i_55_;
				if (i_58_ >= i_56_) {
					i_46_ += i_43_ + i_49_;
					i_47_ += i_43_ + i_48_;
					continue;
				}
				i_56_ -= i_58_;
			} else {
				final int i_59_ = i_55_ - i_52_;
				if (i_59_ >= i_43_) {
					i_46_ += i_43_ + i_49_;
					i_47_ += i_43_ + i_48_;
					continue;
				}
				i_46_ += i_59_;
				i_57_ -= i_59_;
				i_47_ += i_59_;
			}
			int i_60_ = 0;
			if (i_57_ < i_56_) {
				i_56_ = i_57_;
			} else {
				i_60_ = i_57_ - i_56_;
			}
			for (int i_61_ = -i_56_; i_61_ < 0; i_61_++) {
				if (is_41_[i_46_++] != 0) {
					GraphicsLD.pixels[i_47_++] = i_45_;
				} else {
					i_47_++;
				}
			}
			i_46_ += i_60_ + i_49_;
			i_47_ += i_60_ + i_48_;
		}
	}

	private static final void method1491(final int[] is, final byte[] is_62_, final int i, int i_63_, int i_64_, int i_65_, final int i_66_, final int i_67_, final int i_68_) {
		final int i_69_ = -(i_65_ >> 2);
		i_65_ = -(i_65_ & 0x3);
		for (int i_70_ = -i_66_; i_70_ < 0; i_70_++) {
			for (int i_71_ = i_69_; i_71_ < 0; i_71_++) {
				if (is_62_[i_63_++] != 0) {
					is[i_64_++] = i;
				} else {
					i_64_++;
				}
				if (is_62_[i_63_++] != 0) {
					is[i_64_++] = i;
				} else {
					i_64_++;
				}
				if (is_62_[i_63_++] != 0) {
					is[i_64_++] = i;
				} else {
					i_64_++;
				}
				if (is_62_[i_63_++] != 0) {
					is[i_64_++] = i;
				} else {
					i_64_++;
				}
			}
			for (int i_72_ = i_65_; i_72_ < 0; i_72_++) {
				if (is_62_[i_63_++] != 0) {
					is[i_64_++] = i;
				} else {
					i_64_++;
				}
			}
			i_64_ += i_67_;
			i_63_ += i_68_;
		}
	}
}
