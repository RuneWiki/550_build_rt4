/* Class120_Sub14_Sub13 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class120_Sub14_Sub13 extends NodeSub {
	private final Class120_Sub12 aClass120_Sub12_3559;
	private final int[] anIntArray3560;
	static int runesId;
	private final Class120_Sub12 aClass120_Sub12_3562;
	static int anInt3563;
	static ObjectCache aClass21_3564 = new ObjectCache(4);
	private final Class120_Sub12[] aClass120_Sub12Array3565;
	private final Class120_Sub12 aClass120_Sub12_3566;
	static int maxMemory = 64;
	private final int[] anIntArray3568;
	static int anInt3569;
	static short aShort3570 = 205;
	static int anInt3571;
	static int clanMembersAmount;

	static final int method1524(final String string, final int i) {
		int i_0_;
		try {
			int i_1_ = i;
			final int i_2_ = string.length();
			for (int i_3_ = 0; i_2_ > i_3_; i_3_++) {
				i_1_ = -i_1_ + (i_1_ << 5) + Class120_Sub3.method1060((byte) 116, string.charAt(i_3_));
			}
			i_0_ = i_1_;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("ln.I(").append(string != null ? "{...}" : "null").append(',').append(i).append(')').toString());
		}
		return i_0_;
	}

	final LDSprite method1525(final double d, final int i, final int i_4_, final Interface3 interface3, final js5 js5, final int i_5_, final boolean bool) {
		LDSprite class120_sub14_sub19_sub2;
		try {
			Class11.method124(d, (byte) -78);
			CanvasWrapper.anInterface3_19 = interface3;
			Class10.aClass50_79 = js5;
			if (i >= -35) {
				aShort3570 = (short) 117;
			}
			Class22.method199(i_4_, i_5_, false);
			final LDSprite class120_sub14_sub19_sub2_6_ = new LDSprite(i_4_, i_5_);
			for (final Class120_Sub12 element : aClass120_Sub12Array3565) {
				element.method1190(i_5_, 58, i_4_);
			}
			int i_8_ = 0;
			for (int i_9_ = 0; i_9_ < i_5_; i_9_++) {
				if (bool) {
					i_8_ = i_9_;
				}
				int[] is;
				int[] is_10_;
				int[] is_11_;
				if (aClass120_Sub12_3566.aBoolean2558) {
					final int[] is_12_ = aClass120_Sub12_3566.method1187(i_9_);
					is_11_ = is_12_;
					is = is_12_;
					is_10_ = is_12_;
				} else {
					final int[][] is_13_ = aClass120_Sub12_3566.method1188(i_9_);
					is = is_13_[1];
					is_10_ = is_13_[2];
					is_11_ = is_13_[0];
				}
				for (int i_14_ = i_4_ - 1; i_14_ >= 0; i_14_--) {
					int i_15_ = is_11_[i_14_] >> 4;
					int i_16_ = is[i_14_] >> 4;
					if (i_16_ > 255) {
						i_16_ = 255;
					}
					if (i_16_ < 0) {
						i_16_ = 0;
					}
					if (i_15_ > 255) {
						i_15_ = 255;
					}
					if (i_15_ < 0) {
						i_15_ = 0;
					}
					i_15_ = Class79_Sub1.anIntArray2246[i_15_];
					i_16_ = Class79_Sub1.anIntArray2246[i_16_];
					int i_17_ = is_10_[i_14_] >> 4;
					if (i_17_ > 255) {
						i_17_ = 255;
					}
					if (i_17_ < 0) {
						i_17_ = 0;
					}
					i_17_ = Class79_Sub1.anIntArray2246[i_17_];
					class120_sub14_sub19_sub2_6_.pixels[i_8_++] = i_17_ + (i_15_ << 16) - -(i_16_ << 8);
					if (bool) {
						i_8_ += i_4_ - 1;
					}
				}
			}
			Class120_Sub12[] class120_sub12s;
			final int i_18_ = (class120_sub12s = aClass120_Sub12Array3565).length;
			for (int i_19_ = 0; i_19_ < i_18_; i_19_++) {
				final Class120_Sub12 class120_sub12 = class120_sub12s[i_19_];
				class120_sub12.method1189(-2);
			}
			class120_sub14_sub19_sub2 = class120_sub14_sub19_sub2_6_;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("ln.F(").append(d).append(',').append(i).append(',').append(i_4_).append(',').append(interface3 != null ? "{...}" : "null").append(',').append(js5 != null ? "{...}" : "null").append(',').append(i_5_)
					.append(',').append(bool).append(')').toString());
		}
		return class120_sub14_sub19_sub2;
	}

	final int[] method1526(final int i, final byte i_20_, final int i_21_, final js5 js5, final double d, final Interface3 interface3, final boolean bool) {
		int[] is;
		try {
			final int[] is_22_ = new int[i_21_ * i * 4];
			Class11.method124(d, (byte) -78);
			CanvasWrapper.anInterface3_19 = interface3;
			Class10.aClass50_79 = js5;
			Class22.method199(i, i_21_, false);
			for (final Class120_Sub12 element : aClass120_Sub12Array3565) {
				element.method1190(i_21_, 87, i);
			}
			int i_24_ = 0;
			int i_25_ = -104 / ((-55 - i_20_) / 37);
			for (int i_26_ = 0; i_26_ < i_21_; i_26_++) {
				if (bool) {
					i_24_ = i_26_;
				}
				int[] is_27_;
				int[] is_28_;
				int[] is_29_;
				if (!aClass120_Sub12_3566.aBoolean2558) {
					final int[][] is_30_ = aClass120_Sub12_3566.method1188(i_26_);
					is_28_ = is_30_[0];
					is_29_ = is_30_[2];
					is_27_ = is_30_[1];
				} else {
					final int[] is_31_ = aClass120_Sub12_3566.method1187(i_26_);
					is_27_ = is_31_;
					is_28_ = is_31_;
					is_29_ = is_31_;
				}
				int[] is_32_;
				if (!aClass120_Sub12_3559.aBoolean2558) {
					is_32_ = aClass120_Sub12_3559.method1188(i_26_)[0];
				} else {
					is_32_ = aClass120_Sub12_3559.method1187(i_26_);
				}
				for (int i_33_ = i + -1; i_33_ >= 0; i_33_--) {
					int i_34_ = is_28_[i_33_] >> 4;
					if (i_34_ > 255) {
						i_34_ = 255;
					}
					if (i_34_ < 0) {
						i_34_ = 0;
					}
					int i_35_ = is_27_[i_33_] >> 4;
					int i_36_ = is_29_[i_33_] >> 4;
					if (i_35_ > 255) {
						i_35_ = 255;
					}
					i_34_ = Class79_Sub1.anIntArray2246[i_34_];
					if (i_35_ < 0) {
						i_35_ = 0;
					}
					if (i_36_ > 255) {
						i_36_ = 255;
					}
					i_35_ = Class79_Sub1.anIntArray2246[i_35_];
					if (i_36_ < 0) {
						i_36_ = 0;
					}
					i_36_ = Class79_Sub1.anIntArray2246[i_36_];
					int i_37_;
					if (i_34_ == 0 && i_35_ == 0 && i_36_ == 0) {
						i_37_ = 0;
					} else {
						i_37_ = is_32_[i_33_] >> 4;
						if (i_37_ > 255) {
							i_37_ = 255;
						}
						if (i_37_ < 0) {
							i_37_ = 0;
						}
					}
					is_22_[i_24_++] = (i_35_ << 8) + (i_34_ << 16) + (i_37_ << 24) - -i_36_;
					if (bool) {
						i_24_ += -1 + i;
					}
				}
			}
			for (i_25_ = 0; aClass120_Sub12Array3565.length > i_25_; i_25_++) {
				aClass120_Sub12Array3565[i_25_].method1189(-2);
			}
			is = is_22_;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception,
					new StringBuilder("ln.A(").append(i).append(',').append(i_20_).append(',').append(i_21_).append(',').append(js5 != null ? "{...}" : "null").append(',').append(d).append(',').append(interface3 != null ? "{...}" : "null").append(',').append(bool).append(')').toString());
		}
		return is;
	}

	public static void method1527(final int i) {
		try {
			aClass21_3564 = null;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("ln.G(").append(i).append(')').toString());
		}
	}

	final float[] method1528(final int i, final byte i_38_, final boolean bool, final Interface3 interface3, final js5 js5, final int i_39_) {
		float[] fs;
		try {
			if (i_38_ > -79) {
				method1526(-116, (byte) -18, 125, null, -0.06318501449701354, null, true);
			}
			CanvasWrapper.anInterface3_19 = interface3;
			final float[] fs_40_ = new float[4 * i_39_ * i];
			Class10.aClass50_79 = js5;
			Class22.method199(i_39_, i, false);
			for (final Class120_Sub12 element : aClass120_Sub12Array3565) {
				element.method1190(i, 100, i_39_);
			}
			int i_42_ = 0;
			for (int i_43_ = 0; i_43_ < i; i_43_++) {
				if (bool) {
					i_42_ = i_43_ << 2;
				}
				int[] is;
				int[] is_44_;
				int[] is_45_;
				if (!aClass120_Sub12_3566.aBoolean2558) {
					final int[][] is_46_ = aClass120_Sub12_3566.method1188(i_43_);
					is_44_ = is_46_[1];
					is_45_ = is_46_[0];
					is = is_46_[2];
				} else {
					final int[] is_47_ = aClass120_Sub12_3566.method1187(i_43_);
					is = is_47_;
					is_44_ = is_47_;
					is_45_ = is_47_;
				}
				int[] is_48_;
				if (aClass120_Sub12_3559.aBoolean2558) {
					is_48_ = aClass120_Sub12_3559.method1187(i_43_);
				} else {
					is_48_ = aClass120_Sub12_3559.method1188(i_43_)[0];
				}
				int[] is_49_;
				if (aClass120_Sub12_3562.aBoolean2558) {
					is_49_ = aClass120_Sub12_3562.method1187(i_43_);
				} else {
					is_49_ = aClass120_Sub12_3562.method1188(i_43_)[0];
				}
				for (int i_50_ = i_39_ - 1; i_50_ >= 0; i_50_--) {
					float f = is_48_[i_50_] / 4096.0F;
					final float f_51_ = (31.0F * is_49_[i_50_] / 4096.0F + 1.0F) / 4096.0F;
					if (f < 0.0F) {
						f = 0.0F;
					} else if (1.0F < f) {
						f = 1.0F;
					}
					fs_40_[i_42_++] = is_45_[i_50_] * f_51_;
					fs_40_[i_42_++] = f_51_ * is_44_[i_50_];
					fs_40_[i_42_++] = is[i_50_] * f_51_;
					fs_40_[i_42_++] = f;
					if (bool) {
						i_42_ += (i_39_ << 2) + -4;
					}
				}
			}
			for (final Class120_Sub12 element : aClass120_Sub12Array3565) {
				element.method1189(-2);
			}
			fs = fs_40_;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("ln.H(").append(i).append(',').append(i_38_).append(',').append(bool).append(',').append(interface3 != null ? "{...}" : "null").append(',').append(js5 != null ? "{...}" : "null").append(',').append(i_39_)
					.append(')').toString());
		}
		return fs;
	}

	final boolean method1529(final Interface3 interface3, final js5 js5) {
		if (Class120_Sub12_Sub25.anInt3316 > 0) {
			for (int i_53_ = 0; i_53_ < anIntArray3568.length; i_53_++) {
				if (!js5.fileExists(Class120_Sub12_Sub25.anInt3316, anIntArray3568[i_53_])) {
					return false;
				}
			}
		} else {
			for (int i_54_ = 0; anIntArray3568.length > i_54_; i_54_++) {
				if (!js5.method429(anIntArray3568[i_54_])) {
					return false;
				}
			}
		}
		for (int i_55_ = 0; i_55_ < anIntArray3560.length; i_55_++) {
			if (!interface3.method7(anIntArray3560[i_55_])) {
				return false;
			}
		}
		return true;
	}

	final LDTransparentSprite method1530(final int i, final Interface3 interface3, final js5 js5, final int i_56_, final double d, final int i_57_, final boolean bool) {
		LDTransparentSprite class120_sub14_sub19_sub2_sub1;
		try {
			Class11.method124(d, (byte) -78);
			CanvasWrapper.anInterface3_19 = interface3;
			Class10.aClass50_79 = js5;
			Class22.method199(i_57_, i, false);
			final LDTransparentSprite class120_sub14_sub19_sub2_sub1_58_ = new LDTransparentSprite(i_57_, i);
			for (final Class120_Sub12 element : aClass120_Sub12Array3565) {
				element.method1190(i, 126, i_57_);
			}
			int i_60_ = 0;
			for (int i_61_ = 0; i_61_ < i; i_61_++) {
				if (bool) {
					i_60_ = i_61_ << 2;
				}
				int[] is;
				int[] is_62_;
				int[] is_63_;
				if (aClass120_Sub12_3566.aBoolean2558) {
					final int[] is_64_ = aClass120_Sub12_3566.method1187(i_61_);
					is_62_ = is_64_;
					is_63_ = is_64_;
					is = is_64_;
				} else {
					final int[][] is_65_ = aClass120_Sub12_3566.method1188(i_61_);
					is = is_65_[0];
					is_62_ = is_65_[1];
					is_63_ = is_65_[2];
				}
				int[] is_66_;
				if (!aClass120_Sub12_3559.aBoolean2558) {
					is_66_ = aClass120_Sub12_3559.method1188(i_61_)[0];
				} else {
					is_66_ = aClass120_Sub12_3559.method1187(i_61_);
				}
				for (int i_67_ = -1 + i_57_; i_67_ >= 0; i_67_--) {
					int i_68_ = is[i_67_] >> 4;
					int i_69_ = is_63_[i_67_] >> 4;
					if (i_68_ > 255) {
						i_68_ = 255;
					}
					int i_70_ = is_62_[i_67_] >> 4;
					if (i_70_ > 255) {
						i_70_ = 255;
					}
					if (i_69_ > 255) {
						i_69_ = 255;
					}
					if (i_68_ < 0) {
						i_68_ = 0;
					}
					if (i_69_ < 0) {
						i_69_ = 0;
					}
					i_69_ = Class79_Sub1.anIntArray2246[i_69_];
					i_68_ = Class79_Sub1.anIntArray2246[i_68_];
					if (i_70_ < 0) {
						i_70_ = 0;
					}
					i_70_ = Class79_Sub1.anIntArray2246[i_70_];
					int i_71_;
					if (i_68_ == 0 && i_70_ == 0 && i_69_ == 0) {
						i_71_ = 0;
					} else {
						i_71_ = is_66_[i_67_] >> 4;
						if (i_71_ > 255) {
							i_71_ = 255;
						}
						if (i_71_ < 0) {
							i_71_ = 0;
						}
					}
					class120_sub14_sub19_sub2_sub1_58_.pixels[i_60_++] = (i_70_ << 8) + (i_71_ << 24) - (-(i_68_ << 16) - i_69_);
					if (bool) {
						i_60_ += (i_57_ << 2) - 4;
					}
				}
			}
			for (final Class120_Sub12 element : aClass120_Sub12Array3565) {
				element.method1189(-2);
			}
			class120_sub14_sub19_sub2_sub1 = class120_sub14_sub19_sub2_sub1_58_;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception,
					new StringBuilder("ln.C(").append(i).append(',').append(interface3 != null ? "{...}" : "null").append(',').append(js5 != null ? "{...}" : "null").append(',').append(i_56_).append(',').append(d).append(',').append(i_57_).append(',').append(bool).append(')').toString());
		}
		return class120_sub14_sub19_sub2_sub1;
	}

	static final void method1531(final String string) {
		System.out.println(new StringBuilder("Error: ").append(AnimatedLocation.method2358(string, "\n", "%0a")).toString());
	}

	static final void method1532(int i, int i_73_) {
		if (i == 8) {
			i = 4;
		}
		if (i == 4 && !PacketBuffer.highWaterDetail) {
			i = 2;
			i_73_ = 2;
		}
		if (Class173.anInt1724 != i) {
			if (!ParamType.aBoolean3545) {
				if (Class173.anInt1724 != 0) {
					Class157.shaders[Class173.anInt1724].method2();
				}
				if (i != 0) {
					final ShaderInterface shaderInterface = Class157.shaders[i];
					shaderInterface.method3();
					shaderInterface.method5(i_73_);
				}
				Class101_Sub1.anInt2275 = i_73_;
				Class173.anInt1724 = i;
			}
		} else if (i != 0 && Class101_Sub1.anInt2275 != i_73_) {
			Class157.shaders[i].method5(i_73_);
			Class101_Sub1.anInt2275 = i_73_;
		}
	}

	final int[] method1533(final double d, final boolean bool, final int i, final js5 js5, final Interface3 interface3, final int i_75_, final boolean bool_76_, final int i_77_) {
		int[] is;
		try {
			Class11.method124(d, (byte) -78);
			CanvasWrapper.anInterface3_19 = interface3;
			Class10.aClass50_79 = js5;
			Class22.method199(i_77_, i_75_, false);
			final int[] is_78_ = new int[i_77_ * i_75_];
			Class120_Sub12[] class120_sub12s;
			int i_79_ = (class120_sub12s = aClass120_Sub12Array3565).length;
			for (int i_80_ = 0; i_80_ < i_79_; i_80_++) {
				final Class120_Sub12 class120_sub12 = class120_sub12s[i_80_];
				class120_sub12.method1190(i_75_, 54, i_77_);
			}
			int i_81_;
			int i_82_;
			if (!bool_76_) {
				i_79_ = 1;
				i_82_ = i_77_;
				i_81_ = 0;
			} else {
				i_81_ = i_77_ + -1;
				i_82_ = -1;
				i_79_ = -1;
			}
			int i_83_ = 0;
			for (int i_84_ = 0; i_75_ > i_84_; i_84_++) {
				if (bool) {
					i_83_ = i_84_;
				}
				int[] is_85_;
				int[] is_86_;
				int[] is_87_;
				if (!aClass120_Sub12_3566.aBoolean2558) {
					final int[][] is_88_ = aClass120_Sub12_3566.method1188(i_84_);
					is_87_ = is_88_[0];
					is_86_ = is_88_[2];
					is_85_ = is_88_[1];
				} else {
					final int[] is_89_ = aClass120_Sub12_3566.method1187(i_84_);
					is_85_ = is_89_;
					is_86_ = is_89_;
					is_87_ = is_89_;
				}
				for (int i_90_ = i_81_; i_82_ != i_90_; i_90_ += i_79_) {
					int i_91_ = is_87_[i_90_] >> 4;
					int i_92_ = is_85_[i_90_] >> 4;
					if (i_92_ > 255) {
						i_92_ = 255;
					}
					int i_93_ = is_86_[i_90_] >> 4;
					if (i_91_ > 255) {
						i_91_ = 255;
					}
					if (i_93_ > 255) {
						i_93_ = 255;
					}
					if (i_92_ < 0) {
						i_92_ = 0;
					}
					if (i_91_ < 0) {
						i_91_ = 0;
					}
					i_92_ = Class79_Sub1.anIntArray2246[i_92_];
					i_91_ = Class79_Sub1.anIntArray2246[i_91_];
					if (i_93_ < 0) {
						i_93_ = 0;
					}
					i_93_ = Class79_Sub1.anIntArray2246[i_93_];
					is_78_[i_83_++] = i_93_ + (i_91_ << 16) + (i_92_ << 8);
					if (bool) {
						i_83_ += -1 + i_77_;
					}
				}
			}
			if (i != 30319) {
				maxMemory = 37;
			}
			for (final Class120_Sub12 element : aClass120_Sub12Array3565) {
				element.method1189(-2);
			}
			is = is_78_;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception,
					new StringBuilder("ln.E(").append(d).append(',').append(bool).append(',').append(i).append(',').append(js5 != null ? "{...}" : "null").append(',').append(interface3 != null ? "{...}" : "null").append(',').append(i_75_).append(',').append(bool_76_).append(',').append(i_77_)
							.append(')').toString());
		}
		return is;
	}

	public Class120_Sub14_Sub13() {
		anIntArray3568 = new int[0];
		anIntArray3560 = new int[0];
		aClass120_Sub12_3562 = new Class120_Sub12_Sub24(0);
		aClass120_Sub12_3562.anInt2570 = 1;
		aClass120_Sub12_3566 = new Class120_Sub12_Sub24();
		aClass120_Sub12_3566.anInt2570 = 1;
		aClass120_Sub12_3559 = new Class120_Sub12_Sub24();
		aClass120_Sub12_3559.anInt2570 = 1;
		aClass120_Sub12Array3565 = new Class120_Sub12[] { aClass120_Sub12_3566, aClass120_Sub12_3559, aClass120_Sub12_3562 };
	}

	Class120_Sub14_Sub13(final Buffer class120_sub7) {
		int i = 0;
		final int i_95_ = class120_sub7.getUByte();
		aClass120_Sub12Array3565 = new Class120_Sub12[i_95_];
		int i_96_ = 0;
		final int[][] is = new int[i_95_][];
		for (int i_97_ = 0; i_97_ < i_95_; i_97_++) {
			final Class120_Sub12 class120_sub12 = PlainTile.method2003(class120_sub7);
			if (class120_sub12.method1181() >= 0) {
				i++;
			}
			if (class120_sub12.method1184() >= 0) {
				i_96_++;
			}
			final int i_98_ = class120_sub12.aClass120_Sub12Array2561.length;
			is[i_97_] = new int[i_98_];
			for (int i_99_ = 0; i_98_ > i_99_; i_99_++) {
				is[i_97_][i_99_] = class120_sub7.getUByte();
			}
			aClass120_Sub12Array3565[i_97_] = class120_sub12;
		}
		anIntArray3560 = new int[i_96_];
		i_96_ = 0;
		anIntArray3568 = new int[i];
		i = 0;
		for (int i_100_ = 0; i_95_ > i_100_; i_100_++) {
			final Class120_Sub12 class120_sub12 = aClass120_Sub12Array3565[i_100_];
			final int i_101_ = class120_sub12.aClass120_Sub12Array2561.length;
			for (int i_102_ = 0; i_101_ > i_102_; i_102_++) {
				class120_sub12.aClass120_Sub12Array2561[i_102_] = aClass120_Sub12Array3565[is[i_100_][i_102_]];
			}
			final int i_103_ = class120_sub12.method1181();
			final int i_104_ = class120_sub12.method1184();
			if (i_103_ > 0) {
				anIntArray3568[i++] = i_103_;
			}
			if (i_104_ > 0) {
				anIntArray3560[i_96_++] = i_104_;
			}
			is[i_100_] = null;
		}
		aClass120_Sub12_3566 = aClass120_Sub12Array3565[class120_sub7.getUByte()];
		aClass120_Sub12_3559 = aClass120_Sub12Array3565[class120_sub7.getUByte()];
		aClass120_Sub12_3562 = aClass120_Sub12Array3565[class120_sub7.getUByte()];
	}

	static final LDSprite method1534(final js5 js5, final int i_105_, final int i_106_) {
		if (!Class10.decodedSprites(js5, i_105_, i_106_)) {
			return null;
		}
		return HintIcon.constructLDSprite();
	}
}
