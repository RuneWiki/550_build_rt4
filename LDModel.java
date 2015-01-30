/* Class180_Sub7_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class LDModel extends AbstractModel {
	boolean boundsCalculated;
	private byte aByte3756 = 0;
	private short minZ;
	private int[] trianglesC;
	private short maxX;
	private short[] aShortArray3760;
	private short[] aShortArray3761;
	private byte[] aByteArray3762;
	private short aShort3763;
	int[] zVertices;
	private byte[] trianglesAlpha;
	private int[] anIntArray3766;
	private static LDModel aClass180_Sub7_Sub1_3767 = new LDModel();
	private int anInt3768 = 0;
	private int[] anIntArray3769;
	private byte[] aByteArray3770;
	private short maxZ;
	private short minY;
	private int[] trianglesA;
	private boolean aBoolean3774 = false;
	int[] yVertices;
	Class169[] aClass169Array3776;
	private short[] aShortArray3777;
	private short minX;
	private int[] anIntArray3779;
	private int[] anIntArray3780;
	private int vertexCount;
	private static byte[] aByteArray3782;
	private short[] aShortArray3783;
	int[] xVertices;
	private short aShort3785;
	private int[][] anIntArrayArray3786;
	private int[] trianglesB;
	ModelParticle[] aClass158Array3788;
	private static int[] anIntArray3789 = new int[1];
	private static int[] anIntArray3790;
	private int[] anIntArray3791;
	private int anInt3792;
	int anInt3793;
	private short maxY;
	private int[][] anIntArrayArray3795;
	private static int[] anIntArray3796;
	private int[] anIntArray3797;
	private static short[] aShortArray3798;
	private static LDModel aClass180_Sub7_Sub1_3799;
	private static LDModel aClass180_Sub7_Sub1_3800;
	private static int[] anIntArray3801;
	private static short[] aShortArray3802;
	private static byte[] aByteArray3803;
	private static int[] anIntArray3804;
	private static int[] anIntArray3805;
	private static int[] anIntArray3806;
	private static int[] anIntArray3807;
	private static int[] anIntArray3808;
	private static int[][] anIntArrayArray3809;
	private static int[] anIntArray3810;
	private static int[] anIntArray3811;
	private static int[] anIntArray3812;
	private static int[][] anIntArrayArray3813;
	private static int anInt3814;
	private static int[] anIntArray3815;
	private static int anInt3816;
	private static int[] anIntArray3817;
	private static int[] anIntArray3818;
	private static int[] anIntArray3819;
	private static int[] anIntArray3820;
	private static int[] anIntArray3821;
	private static int anInt3822;
	private static boolean[] aBooleanArray3823;
	private static short[] aShortArray3824;
	private static byte[] aByteArray3825;
	private static int[] anIntArray3826;
	private static int[] anIntArray3827;
	private static int[] anIntArray3828;
	private static int[] anIntArray3829;
	private static int[] anIntArray3830;
	private static boolean[] aBooleanArray3831;
	private static int[] anIntArray3832;
	private static boolean aBoolean3833;
	private static int[] anIntArray3834;
	private static boolean aBoolean3835;
	private static int[] anIntArray3836;
	private static int[] anIntArray3837;
	private static int[][] anIntArrayArray3838;
	private static int[] anIntArray3839;
	private static int[] anIntArray3840;
	private static int anInt3841;
	private static int[] anIntArray3842;
	private static int[] anIntArray3843;

	static {
		aByteArray3782 = new byte[1];
		anIntArray3796 = new int[1];
		anIntArray3790 = new int[1];
		aShortArray3798 = new short[1];
		aClass180_Sub7_Sub1_3799 = new LDModel();
		anIntArray3801 = new int[1];
		aShortArray3802 = new short[1];
		anIntArray3804 = new int[1];
		aByteArray3803 = new byte[1];
		anIntArray3805 = new int[1];
		aClass180_Sub7_Sub1_3800 = new LDModel();
		anIntArray3812 = new int[8192];
		anIntArray3821 = new int[8192];
		anIntArray3819 = new int[12];
		aBooleanArray3823 = new boolean[4096];
		anIntArray3811 = new int[4096];
		aShortArray3824 = new short[1];
		anIntArray3829 = new int[4096];
		anIntArray3820 = new int[4096];
		anIntArray3828 = new int[4096];
		anIntArray3830 = new int[1];
		aBoolean3833 = false;
		anIntArray3807 = new int[12];
		anIntArray3827 = new int[4096];
		anIntArrayArray3838 = new int[12][4096];
		anIntArray3818 = new int[8192];
		anInt3814 = 0;
		anIntArray3817 = new int[1];
		aByteArray3825 = new byte[1];
		anIntArray3840 = new int[4096];
		anIntArray3842 = new int[10];
		aBooleanArray3831 = new boolean[4096];
		anIntArray3836 = new int[4096];
		anIntArray3808 = new int[1];
		anIntArray3806 = new int[8192];
		anIntArray3839 = new int[4096];
		anIntArray3837 = new int[10];
		aBoolean3835 = false;
		if (aBoolean3833) {
			anIntArray3826 = new int[4096];
			anIntArray3810 = new int[4096];
		} else {
			anIntArray3832 = new int[1600];
			anIntArrayArray3813 = new int[1600][64];
			anIntArray3815 = new int[32];
			anIntArrayArray3809 = new int[32][512];
		}
		anIntArray3843 = new int[10];
		anIntArray3834 = new int[8192];
	}

	@Override
	final void rotate180() {
		for (int i = 0; i < this.anInt3793; i++) {
			this.xVertices[i] = -this.xVertices[i];
			this.zVertices[i] = -this.zVertices[i];
		}
		this.boundsCalculated = false;
	}

	@Override
	final int getMaxZ() {
		if (!this.boundsCalculated) {
			calculateBounds();
		}
		return minY;
	}

	@Override
	final AbstractModel method2376(final boolean bool, final boolean bool_0_, final boolean bool_1_) {
		if (!bool && aByteArray3782.length < anInt3792) {
			aByteArray3782 = new byte[anInt3792 + 100];
		}
		if (!bool_0_ && aShortArray3798.length < anInt3792) {
			anIntArray3790 = new int[anInt3792 + 100];
			anIntArray3789 = new int[anInt3792 + 100];
			anIntArray3796 = new int[anInt3792 + 100];
			aShortArray3798 = new short[anInt3792 + 100];
		}
		return method2397(bool, bool_0_, aClass180_Sub7_Sub1_3767, aByteArray3782, aShortArray3798, anIntArray3790, anIntArray3789, anIntArray3796);
	}

	private final boolean method2390(final int i, final int i_2_, final int i_3_, final int i_4_, final int i_5_, final int i_6_, final int i_7_, final int i_8_) {
		if (i_2_ < i_3_ && i_2_ < i_4_ && i_2_ < i_5_) {
			return false;
		}
		if (i_2_ > i_3_ && i_2_ > i_4_ && i_2_ > i_5_) {
			return false;
		}
		if (i < i_6_ && i < i_7_ && i < i_8_) {
			return false;
		}
		if (i > i_6_ && i > i_7_ && i > i_8_) {
			return false;
		}
		return true;
	}

	@Override
	final int method2383() {
		if (!this.boundsCalculated) {
			calculateBounds();
		}
		return maxX;
	}

	private final void method2391(final boolean bool, boolean bool_9_, final long l, final int i, final int i_10_, final ParticleEngine class108_sub2) {
		if (i_10_ < 1600) {
			int i_11_ = 0;
			int i_12_ = 0;
			if (!aBoolean3833) {
				for (int i_13_ = 0; i_13_ < 1600; i_13_++) {
					anIntArray3832[i_13_] = 0;
				}
				for (int i_14_ = 0; i_14_ < 32; i_14_++) {
					anIntArray3815[i_14_] = 0;
				}
				anInt3814 = 0;
			}
			for (int i_15_ = 0; i_15_ < anInt3792; i_15_++) {
				if (anIntArray3769[i_15_] != -2) {
					final int i_16_ = trianglesA[i_15_];
					final int i_17_ = trianglesB[i_15_];
					final int i_18_ = trianglesC[i_15_];
					final int i_19_ = anIntArray3840[i_16_];
					final int i_20_ = anIntArray3840[i_17_];
					final int i_21_ = anIntArray3840[i_18_];
					if (bool && (i_19_ == -5000 || i_20_ == -5000 || i_21_ == -5000)) {
						int i_22_ = anIntArray3827[i_16_];
						final int i_23_ = anIntArray3827[i_17_];
						int i_24_ = anIntArray3827[i_18_];
						int i_25_ = anIntArray3820[i_16_];
						final int i_26_ = anIntArray3820[i_17_];
						int i_27_ = anIntArray3820[i_18_];
						int i_28_ = anIntArray3829[i_16_];
						final int i_29_ = anIntArray3829[i_17_];
						int i_30_ = anIntArray3829[i_18_];
						i_22_ -= i_23_;
						i_24_ -= i_23_;
						i_25_ -= i_26_;
						i_27_ -= i_26_;
						i_28_ -= i_29_;
						i_30_ -= i_29_;
						final int i_31_ = i_25_ * i_30_ - i_28_ * i_27_;
						final int i_32_ = i_28_ * i_24_ - i_22_ * i_30_;
						final int i_33_ = i_22_ * i_27_ - i_25_ * i_24_;
						if (i_23_ * i_31_ + i_26_ * i_32_ + i_29_ * i_33_ > 0) {
							aBooleanArray3831[i_15_] = true;
							if (aBoolean3833) {
								anIntArray3826[i_11_] = (anIntArray3836[i_16_] + anIntArray3836[i_17_] + anIntArray3836[i_18_]) / 3;
								anIntArray3810[i_11_++] = i_15_;
							} else {
								final int i_34_ = (anIntArray3836[i_16_] + anIntArray3836[i_17_] + anIntArray3836[i_18_]) / 3 + i;
								if (anIntArray3832[i_34_] < 64) {
									anIntArrayArray3813[i_34_][anIntArray3832[i_34_]++] = i_15_;
								} else {
									int i_35_ = anIntArray3832[i_34_];
									if (i_35_ == 64) {
										if (anInt3814 == 512) {
											continue;
										}
										anIntArray3832[i_34_] = i_35_ = 65 + anInt3814++;
									}
									i_35_ -= 65;
									anIntArrayArray3809[i_35_][anIntArray3815[i_35_]++] = i_15_;
								}
							}
						}
					} else {
						if (bool_9_ && method2390(Class173.anInt1728 + Rasterizer.anInt967, Class2.anInt49 + Rasterizer.anInt970, anIntArray3811[i_16_], anIntArray3811[i_17_], anIntArray3811[i_18_], i_19_, i_20_, i_21_)) {
							Class120_Sub12_Sub21.actions[Class186.actionsLen++] = l;
							bool_9_ = false;
						}
						if ((i_19_ - i_20_) * (anIntArray3811[i_18_] - anIntArray3811[i_17_]) - (anIntArray3811[i_16_] - anIntArray3811[i_17_]) * (i_21_ - i_20_) > 0) {
							aBooleanArray3831[i_15_] = false;
							if (i_19_ < 0 || i_20_ < 0 || i_21_ < 0 || i_19_ > Rasterizer.anInt983 || i_20_ > Rasterizer.anInt983 || i_21_ > Rasterizer.anInt983) {
								aBooleanArray3823[i_15_] = true;
							} else {
								aBooleanArray3823[i_15_] = false;
							}
							if (aBoolean3833) {
								anIntArray3826[i_11_] = (anIntArray3836[i_16_] + anIntArray3836[i_17_] + anIntArray3836[i_18_]) / 3;
								anIntArray3810[i_11_++] = i_15_;
							} else {
								final int i_36_ = (anIntArray3836[i_16_] + anIntArray3836[i_17_] + anIntArray3836[i_18_]) / 3 + i;
								if (anIntArray3832[i_36_] < 64) {
									anIntArrayArray3813[i_36_][anIntArray3832[i_36_]++] = i_15_;
								} else {
									int i_37_ = anIntArray3832[i_36_];
									if (i_37_ == 64) {
										if (anInt3814 == 512) {
											continue;
										}
										anIntArray3832[i_36_] = i_37_ = 65 + anInt3814++;
									}
									i_37_ -= 65;
									anIntArrayArray3809[i_37_][anIntArray3815[i_37_]++] = i_15_;
								}
							}
						}
					}
				}
			}
			if (class108_sub2 != null && !aBoolean3833) {
				int i_38_ = 0;
				for (/**/; i_38_ < anIntArray3821.length; i_38_++) {
					final int i_39_ = anIntArray3821[i_38_] + i;
					if (i_39_ >= 0 && i_39_ < 1600) {
						if (anIntArray3832[i_39_] < 64) {
							anIntArrayArray3813[i_39_][anIntArray3832[i_39_]++] = i_38_ + 1 << 16;
						} else {
							int i_40_ = anIntArray3832[i_39_];
							if (i_40_ == 64) {
								if (anInt3814 == 512) {
									continue;
								}
								anIntArray3832[i_39_] = i_40_ = 65 + anInt3814++;
							}
							i_40_ -= 65;
							anIntArrayArray3809[i_40_][anIntArray3815[i_40_]++] = i_38_ + 1 << 16;
						}
					}
				}
			}
			if (aBoolean3833) {
				TileParticleQueue.method829(i_11_ - 1, anIntArray3810, anIntArray3826, 0);
				if (aByteArray3762 == null) {
					for (int i_41_ = 0; i_41_ < i_11_; i_41_++) {
						method2393(anIntArray3810[i_41_]);
					}
					return;
				}
				for (int i_42_ = 0; i_42_ < 12; i_42_++) {
					anIntArray3819[i_42_] = 0;
					anIntArray3807[i_42_] = 0;
				}
				for (int i_43_ = 0; i_43_ < i_11_; i_43_++) {
					final int i_44_ = anIntArray3810[i_43_];
					final int i_45_ = anIntArray3826[i_43_];
					final byte i_46_ = aByteArray3762[i_44_];
					final int i_47_ = anIntArray3819[i_46_]++;
					anIntArrayArray3838[i_46_][i_47_] = i_44_;
					if (i_46_ < 10) {
						anIntArray3807[i_46_] += i_45_;
					} else if (i_46_ == 10) {
						anIntArray3828[i_47_] = i_45_;
					} else {
						anIntArray3839[i_47_] = i_45_;
					}
				}
			} else {
				if (aByteArray3762 == null) {
					for (int i_48_ = i_10_ - 1; i_48_ >= 0; i_48_--) {
						final int i_49_ = anIntArray3832[i_48_];
						if (i_49_ > 0) {
							final int i_50_ = i_49_ > 64 ? 64 : i_49_;
							final int[] is = anIntArrayArray3813[i_48_];
							for (int i_51_ = 0; i_51_ < i_50_; i_51_++) {
								final int i_52_ = is[i_51_];
								if (i_52_ < 65536) {
									method2393(is[i_51_]);
								} else {
									final int i_53_ = (i_52_ >> 16) - 1;
									final Particle class108_sub3_sub1 = class108_sub2.aClass108_Sub3_Sub1Array2355[i_53_];
									int i_54_ = anIntArray3834[i_53_] * 400;
									if (i_54_ == 0) {
										i_54_ = 1;
									}
									GraphicsLD.drawAlphaCircle(anIntArray3812[i_53_], anIntArray3806[i_53_], (class108_sub3_sub1.aClass108_Sub1_3099.particleType.anInt721 << 16) / i_54_, class108_sub3_sub1.color, class108_sub3_sub1.color >> 24 & 0xff);
								}
							}
						}
						if (i_49_ > 64) {
							final int i_55_ = anIntArray3832[i_48_] - 64 - 1;
							final int[] is = anIntArrayArray3809[i_55_];
							for (int i_56_ = 0; i_56_ < anIntArray3815[i_55_]; i_56_++) {
								final int i_57_ = is[i_56_];
								if (i_57_ < 65536) {
									method2393(is[i_56_]);
								} else {
									final int i_58_ = (i_57_ >> 16) - 1;
									final Particle class108_sub3_sub1 = class108_sub2.aClass108_Sub3_Sub1Array2355[i_58_];
									int i_59_ = anIntArray3834[i_58_] * 400;
									if (i_59_ == 0) {
										i_59_ = 1;
									}
									GraphicsLD.drawAlphaCircle(anIntArray3812[i_58_], anIntArray3806[i_58_], (class108_sub3_sub1.aClass108_Sub1_3099.particleType.anInt721 << 16) / i_59_, class108_sub3_sub1.color, class108_sub3_sub1.color >> 24 & 0xff);
								}
							}
						}
					}
					return;
				}
				for (int i_60_ = 0; i_60_ < 12; i_60_++) {
					anIntArray3819[i_60_] = 0;
					anIntArray3807[i_60_] = 0;
				}
				for (int i_61_ = i_10_ - 1; i_61_ >= 0; i_61_--) {
					final int i_62_ = anIntArray3832[i_61_];
					if (i_62_ > 0) {
						int i_63_;
						if (i_62_ > 64) {
							i_63_ = 64;
						} else {
							i_63_ = i_62_;
						}
						final int[] is = anIntArrayArray3813[i_61_];
						for (int i_64_ = 0; i_64_ < i_63_; i_64_++) {
							final int i_65_ = is[i_64_];
							if (i_65_ < 65536) {
								final byte i_66_ = aByteArray3762[i_65_];
								final int i_67_ = anIntArray3819[i_66_]++;
								anIntArrayArray3838[i_66_][i_67_] = i_65_;
								if (i_66_ < 10) {
									anIntArray3807[i_66_] += i_61_;
								} else if (i_66_ == 10) {
									anIntArray3828[i_67_] = i_61_;
								} else {
									anIntArray3839[i_67_] = i_61_;
								}
							} else {
								anIntArray3818[i_12_++] = (i_65_ >> 16) - 1;
							}
						}
					}
					if (i_62_ > 64) {
						final int i_68_ = anIntArray3832[i_61_] - 64 - 1;
						final int[] is = anIntArrayArray3809[i_68_];
						for (int i_69_ = 0; i_69_ < anIntArray3815[i_68_]; i_69_++) {
							final int i_70_ = is[i_69_];
							if (i_70_ < 65536) {
								final byte i_71_ = aByteArray3762[i_70_];
								final int i_72_ = anIntArray3819[i_71_]++;
								anIntArrayArray3838[i_71_][i_72_] = i_70_;
								if (i_71_ < 10) {
									anIntArray3807[i_71_] += i_61_;
								} else if (i_71_ == 10) {
									anIntArray3828[i_72_] = i_61_;
								} else {
									anIntArray3839[i_72_] = i_61_;
								}
							} else {
								anIntArray3818[i_12_++] = (i_70_ >> 16) - 1;
							}
						}
					}
				}
			}
			int i_73_ = 0;
			if (anIntArray3819[1] > 0 || anIntArray3819[2] > 0) {
				i_73_ = (anIntArray3807[1] + anIntArray3807[2]) / (anIntArray3819[1] + anIntArray3819[2]);
			}
			int i_74_ = 0;
			if (anIntArray3819[3] > 0 || anIntArray3819[4] > 0) {
				i_74_ = (anIntArray3807[3] + anIntArray3807[4]) / (anIntArray3819[3] + anIntArray3819[4]);
			}
			int i_75_ = 0;
			if (anIntArray3819[6] > 0 || anIntArray3819[8] > 0) {
				i_75_ = (anIntArray3807[6] + anIntArray3807[8]) / (anIntArray3819[6] + anIntArray3819[8]);
			}
			int i_76_ = 0;
			int i_77_ = anIntArray3819[10];
			int[] is = anIntArrayArray3838[10];
			int[] is_78_ = anIntArray3828;
			int i_79_ = 0;
			if (i_76_ == i_77_) {
				i_76_ = 0;
				i_77_ = anIntArray3819[11];
				is = anIntArrayArray3838[11];
				is_78_ = anIntArray3839;
			}
			int i_80_;
			if (i_76_ < i_77_) {
				i_80_ = is_78_[i_76_];
			} else {
				i_80_ = -1000;
			}
			for (int i_81_ = 0; i_81_ < 10; i_81_++) {
				while (i_81_ == 0) {
					if (i_80_ <= i_73_) {
						break;
					}
					method2393(is[i_76_++]);
					if (i_76_ == i_77_ && is != anIntArrayArray3838[11]) {
						i_76_ = 0;
						i_77_ = anIntArray3819[11];
						is = anIntArrayArray3838[11];
						is_78_ = anIntArray3839;
					}
					if (i_76_ < i_77_) {
						i_80_ = is_78_[i_76_];
					} else {
						i_80_ = -1000;
					}
				}
				while (i_81_ == 3) {
					if (i_80_ <= i_74_) {
						break;
					}
					method2393(is[i_76_++]);
					if (i_76_ == i_77_ && is != anIntArrayArray3838[11]) {
						i_76_ = 0;
						i_77_ = anIntArray3819[11];
						is = anIntArrayArray3838[11];
						is_78_ = anIntArray3839;
					}
					if (i_76_ < i_77_) {
						i_80_ = is_78_[i_76_];
					} else {
						i_80_ = -1000;
					}
				}
				while (i_81_ == 5 && i_80_ > i_75_) {
					method2393(is[i_76_++]);
					if (i_76_ == i_77_ && is != anIntArrayArray3838[11]) {
						i_76_ = 0;
						i_77_ = anIntArray3819[11];
						is = anIntArrayArray3838[11];
						is_78_ = anIntArray3839;
					}
					if (i_76_ < i_77_) {
						i_80_ = is_78_[i_76_];
					} else {
						i_80_ = -1000;
					}
				}
				final int i_82_ = anIntArray3819[i_81_];
				final int[] is_83_ = anIntArrayArray3838[i_81_];
				if (class108_sub2 != null) {
					int i_84_ = 2147483647;
					if (i_82_ != 0) {
						i_84_ = anIntArray3807[i_81_] / i_82_;
					}
					for (int i_85_ = anIntArray3818[i_79_]; anIntArray3821[i_85_] + i > i_84_; i_85_ = anIntArray3818[i_79_++]) {
						final Particle class108_sub3_sub1 = class108_sub2.aClass108_Sub3_Sub1Array2355[i_85_];
						int i_86_ = anIntArray3834[i_85_] * 400;
						if (i_86_ == 0) {
							i_86_ = 1;
						}
						GraphicsLD.drawAlphaCircle(anIntArray3812[i_85_], anIntArray3806[i_85_], (class108_sub3_sub1.aClass108_Sub1_3099.particleType.anInt721 << 16) / i_86_, class108_sub3_sub1.color, class108_sub3_sub1.color >> 24 & 0xff);
						if (i_79_ >= i_12_) {
							break;
						}
					}
				}
				for (int i_87_ = 0; i_87_ < i_82_; i_87_++) {
					method2393(is_83_[i_87_]);
				}
			}
			while (i_80_ != -1000) {
				method2393(is[i_76_++]);
				if (i_76_ == i_77_ && is != anIntArrayArray3838[11]) {
					i_76_ = 0;
					is = anIntArrayArray3838[11];
					i_77_ = anIntArray3819[11];
					is_78_ = anIntArray3839;
				}
				if (i_76_ < i_77_) {
					i_80_ = is_78_[i_76_];
				} else {
					i_80_ = -1000;
				}
			}
			if (class108_sub2 != null) {
				int i_88_ = anIntArray3818[i_79_];
				while (i_79_ < i_12_) {
					final Particle class108_sub3_sub1 = class108_sub2.aClass108_Sub3_Sub1Array2355[i_88_];
					int i_89_ = anIntArray3834[i_88_] * 400;
					if (i_89_ == 0) {
						i_89_ = 1;
					}
					GraphicsLD.drawAlphaCircle(anIntArray3812[i_88_], anIntArray3806[i_88_], (class108_sub3_sub1.aClass108_Sub1_3099.particleType.anInt721 << 16) / i_89_, class108_sub3_sub1.color, class108_sub3_sub1.color >> 24 & 0xff);
					i_88_ = anIntArray3818[i_79_++];
				}
			}
		}
	}

	@Override
	final void method2360(final int i) {
		final int i_90_ = Rasterizer.sineTable[i];
		final int i_91_ = Rasterizer.cosineTable[i];
		for (int i_92_ = 0; i_92_ < this.anInt3793; i_92_++) {
			final int i_93_ = this.zVertices[i_92_] * i_90_ + this.xVertices[i_92_] * i_91_ >> 16;
			this.zVertices[i_92_] = this.zVertices[i_92_] * i_91_ - this.xVertices[i_92_] * i_90_ >> 16;
			this.xVertices[i_92_] = i_93_;
		}
		this.boundsCalculated = false;
	}

	@Override
	final void rotate90() {
		for (int i = 0; i < this.anInt3793; i++) {
			final int i_94_ = this.xVertices[i];
			this.xVertices[i] = this.zVertices[i];
			this.zVertices[i] = -i_94_;
		}
		this.boundsCalculated = false;
	}

	@Override
	final void method2377(final int i) {
		final int i_95_ = Rasterizer.sineTable[i];
		final int i_96_ = Rasterizer.cosineTable[i];
		for (int i_97_ = 0; i_97_ < this.anInt3793; i_97_++) {
			final int i_98_ = this.yVertices[i_97_] * i_96_ - this.zVertices[i_97_] * i_95_ >> 16;
			this.zVertices[i_97_] = this.yVertices[i_97_] * i_95_ + this.zVertices[i_97_] * i_96_ >> 16;
			this.yVertices[i_97_] = i_98_;
		}
		this.boundsCalculated = false;
	}

	@Override
	final int method2374() {
		if (!this.boundsCalculated) {
			calculateBounds();
		}
		return minX;
	}

	final AbstractModel method2392(final AbstractModel class180_sub7) {
		return new LDModel(new LDModel[] { this, (LDModel) class180_sub7 }, 2);
	}

	@Override
	final void render(final int i, final int i_99_, final int i_100_, final int i_101_, final int i_102_, final int i_103_, final int i_104_, final int i_105_, final long l, final int i_106_, final ParticleEngine class108_sub2) {
		if (!this.boundsCalculated) {
			calculateBounds();
		}
		final int i_107_ = i_105_ * i_102_ - i_103_ * i_101_ >> 16;
		final int i_108_ = i_104_ * i_99_ + i_107_ * i_100_ >> 16;
		int i_109_ = i_108_ + (aShort3763 * i_100_ + minY * i_99_ >> 16);
		int i_110_ = i_108_ + (-aShort3763 * i_100_ + maxY * i_99_ >> 16);
		if (class108_sub2 != null) {
			final int i_111_ = class108_sub2.method954();
			final int i_112_ = i_108_ + (i_111_ * i_100_ + 0 * i_99_ >> 16);
			final int i_113_ = i_108_ + (-i_111_ * i_100_ - (class108_sub2.anInt2369 - class108_sub2.anInt2382) * i_99_ >> 16);
			if (i_113_ < i_110_) {
				i_110_ = i_113_;
			}
			if (i_112_ > i_109_) {
				i_109_ = i_112_;
			}
			class108_sub2.method965(i, i_106_, i_103_, i_104_, i_105_);
		}
		if (i_109_ > 50 && i_110_ < 3500) {
			final int i_114_ = i_105_ * i_101_ + i_103_ * i_102_ >> 16;
			final int i_115_ = i_114_ + aShort3763 << 9;
			if (i_115_ / i_109_ > IntegerNode.anInt2792) {
				final int i_116_ = i_114_ - aShort3763 << 9;
				if (i_116_ / i_109_ < Class120_Sub12_Sub16.anInt3253) {
					final int i_117_ = i_104_ * i_100_ - i_107_ * i_99_ >> 16;
					final int i_118_ = i_117_ + (aShort3763 * i_99_ + minY * i_100_ >> 16) << 9;
					if (i_118_ / i_109_ > Class190.anInt2100) {
						final int i_119_ = i_117_ + (-aShort3763 * i_99_ + maxY * i_100_ >> 16) << 9;
						if (i_119_ / i_109_ < Class120_Sub30_Sub1.anInt3672) {
							boolean bool = false;
							final boolean bool_120_ = i_110_ <= 50;
							final boolean bool_121_ = bool_120_ || anInt3768 > 0;
							final int i_122_ = Rasterizer.anInt967;
							final int i_123_ = Rasterizer.anInt970;
							int i_124_ = 0;
							int i_125_ = 0;
							if (i != 0) {
								i_124_ = Rasterizer.sineTable[i];
								i_125_ = Rasterizer.cosineTable[i];
							}
							boolean bool_126_ = false;
							if (l > 0L && Class5.aBoolean2158 && i_110_ > 0) {
								int i_127_;
								int i_128_;
								if (i_114_ > 0) {
									i_127_ = i_116_ / i_109_;
									i_128_ = i_115_ / i_110_;
								} else {
									i_127_ = i_116_ / i_110_;
									i_128_ = i_115_ / i_109_;
								}
								int i_129_;
								int i_130_;
								if (i_117_ > 0) {
									i_129_ = i_119_ / i_109_;
									i_130_ = i_118_ / i_110_;
								} else {
									i_129_ = i_119_ / i_110_;
									i_130_ = i_118_ / i_109_;
								}
								if (Class173.anInt1728 >= i_127_ && Class173.anInt1728 <= i_128_ && Class2.anInt49 >= i_129_ && Class2.anInt49 <= i_130_) {
									i_127_ = 999999;
									i_128_ = -999999;
									i_129_ = 999999;
									i_130_ = -999999;
									final int[] is = new int[] { minX, maxX, minX, maxX, minX, maxX, minX, maxX };
									final int[] is_131_ = new int[] { minZ, minZ, maxZ, maxZ, minZ, minZ, maxZ, maxZ };
									final int[] is_132_ = new int[] { maxY, maxY, maxY, maxY, minY, minY, minY, minY };
									for (int i_133_ = 0; i_133_ < 8; i_133_++) {
										int i_134_ = is[i_133_];
										int i_135_ = is_132_[i_133_];
										int i_136_ = is_131_[i_133_];
										if (i != 0) {
											final int i_137_ = i_136_ * i_124_ + i_134_ * i_125_ >> 16;
											i_136_ = i_136_ * i_125_ - i_134_ * i_124_ >> 16;
											i_134_ = i_137_;
										}
										i_134_ += i_103_;
										i_135_ += i_104_;
										i_136_ += i_105_;
										int i_138_ = i_136_ * i_101_ + i_134_ * i_102_ >> 16;
										i_136_ = i_136_ * i_102_ - i_134_ * i_101_ >> 16;
										i_134_ = i_138_;
										i_138_ = i_135_ * i_100_ - i_136_ * i_99_ >> 16;
										i_136_ = i_135_ * i_99_ + i_136_ * i_100_ >> 16;
										i_135_ = i_138_;
										if (i_136_ > 0) {
											final int i_139_ = (i_134_ << 9) / i_136_;
											final int i_140_ = (i_135_ << 9) / i_136_;
											if (i_139_ < i_127_) {
												i_127_ = i_139_;
											}
											if (i_139_ > i_128_) {
												i_128_ = i_139_;
											}
											if (i_140_ < i_129_) {
												i_129_ = i_140_;
											}
											if (i_140_ > i_130_) {
												i_130_ = i_140_;
											}
										}
									}
									if (Class173.anInt1728 >= i_127_ && Class173.anInt1728 <= i_128_ && Class2.anInt49 >= i_129_ && Class2.anInt49 <= i_130_) {
										if (this.haveActions) {
											Class120_Sub12_Sub21.actions[Class186.actionsLen++] = l;
										} else {
											bool_126_ = true;
										}
									}
								}
							}
							for (int i_141_ = 0; i_141_ < this.anInt3793; i_141_++) {
								int i_142_ = this.xVertices[i_141_];
								int i_143_ = this.yVertices[i_141_];
								int i_144_ = this.zVertices[i_141_];
								if (i != 0) {
									final int i_145_ = i_144_ * i_124_ + i_142_ * i_125_ >> 16;
									i_144_ = i_144_ * i_125_ - i_142_ * i_124_ >> 16;
									i_142_ = i_145_;
								}
								i_142_ += i_103_;
								i_143_ += i_104_;
								i_144_ += i_105_;
								int i_146_ = i_144_ * i_101_ + i_142_ * i_102_ >> 16;
								i_144_ = i_144_ * i_102_ - i_142_ * i_101_ >> 16;
								i_142_ = i_146_;
								i_146_ = i_143_ * i_100_ - i_144_ * i_99_ >> 16;
								i_144_ = i_143_ * i_99_ + i_144_ * i_100_ >> 16;
								i_143_ = i_146_;
								anIntArray3836[i_141_] = i_144_ - i_108_;
								if (i_144_ >= 50) {
									anIntArray3840[i_141_] = i_122_ + (i_142_ << 9) / i_144_;
									anIntArray3811[i_141_] = i_123_ + (i_143_ << 9) / i_144_;
								} else {
									anIntArray3840[i_141_] = -5000;
									bool = true;
								}
								if (bool_121_) {
									anIntArray3827[i_141_] = i_142_;
									anIntArray3820[i_141_] = i_143_;
									anIntArray3829[i_141_] = i_144_;
								}
							}
							if (class108_sub2 != null) {
								final int i_147_ = ParticleEngine.anInt2364 + i_122_;
								final int i_148_ = ParticleEngine.anInt2358 + i_123_;
								for (int i_149_ = 0; i_149_ < class108_sub2.aClass108_Sub3_Sub1Array2355.length; i_149_++) {
									final Particle class108_sub3_sub1 = class108_sub2.aClass108_Sub3_Sub1Array2355[i_149_];
									if (class108_sub3_sub1 != null && !class108_sub3_sub1.aBoolean3097) {
										int i_150_ = (class108_sub3_sub1.anInt3087 >> 12) - DisplayModeInfo.anInt1713;
										int i_151_ = (class108_sub3_sub1.anInt3088 >> 12) - PlayerAppearance.anInt1367;
										int i_152_ = (class108_sub3_sub1.anInt3090 >> 12) - Class145.anInt1381;
										int i_153_ = i_152_ * i_101_ + i_150_ * i_102_ >> 16;
										i_152_ = i_152_ * i_102_ - i_150_ * i_101_ >> 16;
										i_150_ = i_153_;
										i_153_ = i_151_ * i_100_ - i_152_ * i_99_ >> 16;
										i_152_ = i_151_ * i_99_ + i_152_ * i_100_ >> 16;
										i_151_ = i_153_;
										if (i_152_ >= 50) {
											anIntArray3812[i_149_] = i_147_ + (i_150_ << 9) / i_152_;
											anIntArray3806[i_149_] = i_148_ + (i_151_ << 9) / i_152_;
											anIntArray3834[i_149_] = i_152_;
											anIntArray3821[i_149_] = i_152_ - i_108_;
										} else {
											anIntArray3821[i_149_] = -2147483648;
										}
									} else {
										anIntArray3821[i_149_] = -2147483648;
									}
								}
							}
							try {
								method2391(bool, bool_126_, l, i_108_ - i_110_, i_109_ - i_110_ + 2, class108_sub2);
							} catch (final Exception exception) {
								/* empty */
							}
						}
					}
				}
			}
		}
	}

	@Override
	final void method2362(final int i) {
		final int i_154_ = Rasterizer.sineTable[i];
		final int i_155_ = Rasterizer.cosineTable[i];
		for (int i_156_ = 0; i_156_ < this.anInt3793; i_156_++) {
			final int i_157_ = this.yVertices[i_156_] * i_154_ + this.xVertices[i_156_] * i_155_ >> 16;
			this.yVertices[i_156_] = this.yVertices[i_156_] * i_155_ - this.xVertices[i_156_] * i_154_ >> 16;
			this.xVertices[i_156_] = i_157_;
		}
		this.boundsCalculated = false;
	}

	@Override
	final boolean method2375() {
		if (anIntArrayArray3786 == null) {
			return false;
		}
		anInt3822 = 0;
		anInt3841 = 0;
		anInt3816 = 0;
		return true;
	}

	@Override
	final void rotate270() {
		for (int i = 0; i < this.anInt3793; i++) {
			final int i_158_ = this.zVertices[i];
			this.zVertices[i] = this.xVertices[i];
			this.xVertices[i] = -i_158_;
		}
		this.boundsCalculated = false;
	}

	@Override
	final void translate(final int x, final int y, final int z) {
		for (int i_161_ = 0; i_161_ < this.anInt3793; i_161_++) {
			this.xVertices[i_161_] += x;
			this.yVertices[i_161_] += y;
			this.zVertices[i_161_] += z;
		}
		this.boundsCalculated = false;
	}

	private final void method2393(final int i) {
		if (aBooleanArray3831[i]) {
			method2396(i);
		} else {
			final int i_162_ = trianglesA[i];
			final int i_163_ = trianglesB[i];
			final int i_164_ = trianglesC[i];
			Rasterizer.aBoolean972 = aBooleanArray3823[i];
			if (trianglesAlpha == null) {
				Rasterizer.alpha = 0;
			} else {
				Rasterizer.alpha = trianglesAlpha[i] & 0xff;
			}
			if (aShortArray3760 == null || aShortArray3760[i] == -1) {
				if (anIntArray3769[i] == -1) {
					Rasterizer.method863(anIntArray3811[i_162_], anIntArray3811[i_163_], anIntArray3811[i_164_], anIntArray3840[i_162_], anIntArray3840[i_163_], anIntArray3840[i_164_], Rasterizer.palette[anIntArray3779[i] & 0xffff]);
				} else {
					Rasterizer.method856(anIntArray3811[i_162_], anIntArray3811[i_163_], anIntArray3811[i_164_], anIntArray3840[i_162_], anIntArray3840[i_163_], anIntArray3840[i_164_], anIntArray3779[i] & 0xffff, anIntArray3780[i] & 0xffff, anIntArray3769[i] & 0xffff);
				}
			} else {
				int i_165_;
				int i_166_;
				int i_167_;
				if (aByteArray3770 != null && aByteArray3770[i] != -1) {
					final int i_168_ = aByteArray3770[i] & 0xff;
					i_165_ = anIntArray3791[i_168_];
					i_166_ = anIntArray3797[i_168_];
					i_167_ = anIntArray3766[i_168_];
				} else {
					i_165_ = i_162_;
					i_166_ = i_163_;
					i_167_ = i_164_;
				}
				if (anIntArray3769[i] == -1) {
					Rasterizer.method862(anIntArray3811[i_162_], anIntArray3811[i_163_], anIntArray3811[i_164_], anIntArray3840[i_162_], anIntArray3840[i_163_], anIntArray3840[i_164_], anIntArray3779[i], anIntArray3779[i], anIntArray3779[i], anIntArray3827[i_165_], anIntArray3827[i_166_],
							anIntArray3827[i_167_], anIntArray3820[i_165_], anIntArray3820[i_166_], anIntArray3820[i_167_], anIntArray3829[i_165_], anIntArray3829[i_166_], anIntArray3829[i_167_], aShortArray3760[i]);
				} else {
					Rasterizer.method862(anIntArray3811[i_162_], anIntArray3811[i_163_], anIntArray3811[i_164_], anIntArray3840[i_162_], anIntArray3840[i_163_], anIntArray3840[i_164_], anIntArray3779[i], anIntArray3780[i], anIntArray3769[i], anIntArray3827[i_165_], anIntArray3827[i_166_],
							anIntArray3827[i_167_], anIntArray3820[i_165_], anIntArray3820[i_166_], anIntArray3820[i_167_], anIntArray3829[i_165_], anIntArray3829[i_166_], anIntArray3829[i_167_], aShortArray3760[i]);
				}
			}
		}
	}

	@Override
	final int method2371() {
		if (!this.boundsCalculated) {
			calculateBounds();
		}
		return aShort3763;
	}

	@Override
	final int method2363() {
		if (!this.boundsCalculated) {
			calculateBounds();
		}
		return minZ;
	}

	public static void method2394() {
		aClass180_Sub7_Sub1_3767 = null;
		aByteArray3782 = null;
		aShortArray3798 = null;
		anIntArray3790 = null;
		anIntArray3789 = null;
		anIntArray3796 = null;
		aClass180_Sub7_Sub1_3799 = null;
		aByteArray3803 = null;
		aShortArray3802 = null;
		anIntArray3804 = null;
		anIntArray3805 = null;
		anIntArray3801 = null;
		aClass180_Sub7_Sub1_3800 = null;
		aByteArray3825 = null;
		aShortArray3824 = null;
		anIntArray3830 = null;
		anIntArray3817 = null;
		anIntArray3808 = null;
		aBooleanArray3823 = null;
		aBooleanArray3831 = null;
		anIntArray3840 = null;
		anIntArray3811 = null;
		anIntArray3836 = null;
		anIntArray3812 = null;
		anIntArray3806 = null;
		anIntArray3834 = null;
		anIntArray3821 = null;
		anIntArray3818 = null;
		anIntArray3827 = null;
		anIntArray3820 = null;
		anIntArray3829 = null;
		anIntArray3832 = null;
		anIntArrayArray3813 = null;
		anIntArray3815 = null;
		anIntArrayArray3809 = null;
		anIntArray3826 = null;
		anIntArray3810 = null;
		anIntArray3819 = null;
		anIntArrayArray3838 = null;
		anIntArray3828 = null;
		anIntArray3839 = null;
		anIntArray3807 = null;
		anIntArray3843 = null;
		anIntArray3837 = null;
		anIntArray3842 = null;
	}

	@Override
	final void method2367(final int i, final int i_169_, final int i_170_, final int i_171_, final int i_172_, final int i_173_, final int i_174_, final long l) {
		if (!this.boundsCalculated) {
			calculateBounds();
		}
		final int i_175_ = Rasterizer.anInt967;
		final int i_176_ = Rasterizer.anInt970;
		final int i_177_ = Rasterizer.sineTable[i];
		final int i_178_ = Rasterizer.cosineTable[i];
		final int i_179_ = Rasterizer.sineTable[i_169_];
		final int i_180_ = Rasterizer.cosineTable[i_169_];
		final int i_181_ = Rasterizer.sineTable[i_170_];
		final int i_182_ = Rasterizer.cosineTable[i_170_];
		final int i_183_ = Rasterizer.sineTable[i_171_];
		final int i_184_ = Rasterizer.cosineTable[i_171_];
		final int i_185_ = i_173_ * i_183_ + i_174_ * i_184_ >> 16;
		for (int i_186_ = 0; i_186_ < this.anInt3793; i_186_++) {
			int i_187_ = this.xVertices[i_186_];
			int i_188_ = this.yVertices[i_186_];
			int i_189_ = this.zVertices[i_186_];
			if (i_170_ != 0) {
				final int i_190_ = i_188_ * i_181_ + i_187_ * i_182_ >> 16;
				i_188_ = i_188_ * i_182_ - i_187_ * i_181_ >> 16;
				i_187_ = i_190_;
			}
			if (i != 0) {
				final int i_191_ = i_188_ * i_178_ - i_189_ * i_177_ >> 16;
				i_189_ = i_188_ * i_177_ + i_189_ * i_178_ >> 16;
				i_188_ = i_191_;
			}
			if (i_169_ != 0) {
				final int i_192_ = i_189_ * i_179_ + i_187_ * i_180_ >> 16;
				i_189_ = i_189_ * i_180_ - i_187_ * i_179_ >> 16;
				i_187_ = i_192_;
			}
			i_187_ += i_172_;
			i_188_ += i_173_;
			i_189_ += i_174_;
			final int i_193_ = i_188_ * i_184_ - i_189_ * i_183_ >> 16;
			i_189_ = i_188_ * i_183_ + i_189_ * i_184_ >> 16;
			i_188_ = i_193_;
			anIntArray3836[i_186_] = i_189_ - i_185_;
			anIntArray3840[i_186_] = i_175_ + (i_187_ << 9) / i_189_;
			anIntArray3811[i_186_] = i_176_ + (i_188_ << 9) / i_189_;
			if (anInt3768 > 0) {
				anIntArray3827[i_186_] = i_187_;
				anIntArray3820[i_186_] = i_188_;
				anIntArray3829[i_186_] = i_189_;
			}
		}
		method2391(false, l >= 0L, l, aShort3785, aShort3785 << 1, null);
	}

	@Override
	final AbstractModel method2378(final boolean bool, final boolean bool_194_, final boolean bool_195_) {
		if (!bool && aByteArray3825.length < anInt3792) {
			aByteArray3825 = new byte[anInt3792 + 100];
		}
		if (!bool_194_ && aShortArray3824.length < anInt3792) {
			anIntArray3830 = new int[anInt3792 + 100];
			anIntArray3817 = new int[anInt3792 + 100];
			anIntArray3808 = new int[anInt3792 + 100];
			aShortArray3824 = new short[anInt3792 + 100];
		}
		return method2397(bool, bool_194_, aClass180_Sub7_Sub1_3800, aByteArray3825, aShortArray3824, anIntArray3830, anIntArray3817, anIntArray3808);
	}

	@Override
	final void method2364() {
		if (aBoolean3774) {
			method2402();
			aBoolean3774 = false;
		}
		this.boundsCalculated = false;
	}

	static final void method2395() {
		aBoolean3833 = false;
		anIntArray3826 = null;
		anIntArray3810 = null;
		anIntArray3832 = new int[1600];
		anIntArrayArray3813 = new int[1600][64];
		anIntArray3815 = new int[32];
		anIntArrayArray3809 = new int[32][512];
	}

	@Override
	final AbstractModel method2381(final boolean bool, final boolean bool_196_, final boolean bool_197_) {
		if (!bool && aByteArray3803.length < anInt3792) {
			aByteArray3803 = new byte[anInt3792 + 100];
		}
		if (!bool_196_ && aShortArray3802.length < anInt3792) {
			anIntArray3804 = new int[anInt3792 + 100];
			anIntArray3805 = new int[anInt3792 + 100];
			anIntArray3801 = new int[anInt3792 + 100];
			aShortArray3802 = new short[anInt3792 + 100];
		}
		return method2397(bool, bool_196_, aClass180_Sub7_Sub1_3799, aByteArray3803, aShortArray3802, anIntArray3804, anIntArray3805, anIntArray3801);
	}

	private final void method2396(final int i) {
		final int i_198_ = Rasterizer.anInt967;
		final int i_199_ = Rasterizer.anInt970;
		int i_200_ = 0;
		final int i_201_ = trianglesA[i];
		final int i_202_ = trianglesB[i];
		final int i_203_ = trianglesC[i];
		final int i_204_ = anIntArray3829[i_201_];
		final int i_205_ = anIntArray3829[i_202_];
		final int i_206_ = anIntArray3829[i_203_];
		if (trianglesAlpha == null) {
			Rasterizer.alpha = 0;
		} else {
			Rasterizer.alpha = trianglesAlpha[i] & 0xff;
		}
		if (i_204_ >= 50) {
			anIntArray3843[i_200_] = anIntArray3840[i_201_];
			anIntArray3837[i_200_] = anIntArray3811[i_201_];
			anIntArray3842[i_200_++] = anIntArray3779[i] & 0xffff;
		} else {
			final int i_207_ = anIntArray3827[i_201_];
			final int i_208_ = anIntArray3820[i_201_];
			final int i_209_ = anIntArray3779[i] & 0xffff;
			if (i_206_ >= 50) {
				final int i_210_ = (50 - i_204_) * Rasterizer.anIntArray984[i_206_ - i_204_];
				anIntArray3843[i_200_] = i_198_ + (i_207_ + ((anIntArray3827[i_203_] - i_207_) * i_210_ >> 16) << 9) / 50;
				anIntArray3837[i_200_] = i_199_ + (i_208_ + ((anIntArray3820[i_203_] - i_208_) * i_210_ >> 16) << 9) / 50;
				anIntArray3842[i_200_++] = i_209_ + (((anIntArray3769[i] & 0xffff) - i_209_) * i_210_ >> 16);
			}
			if (i_205_ >= 50) {
				final int i_211_ = (50 - i_204_) * Rasterizer.anIntArray984[i_205_ - i_204_];
				anIntArray3843[i_200_] = i_198_ + (i_207_ + ((anIntArray3827[i_202_] - i_207_) * i_211_ >> 16) << 9) / 50;
				anIntArray3837[i_200_] = i_199_ + (i_208_ + ((anIntArray3820[i_202_] - i_208_) * i_211_ >> 16) << 9) / 50;
				anIntArray3842[i_200_++] = i_209_ + (((anIntArray3780[i] & 0xffff) - i_209_) * i_211_ >> 16);
			}
		}
		if (i_205_ >= 50) {
			anIntArray3843[i_200_] = anIntArray3840[i_202_];
			anIntArray3837[i_200_] = anIntArray3811[i_202_];
			anIntArray3842[i_200_++] = anIntArray3780[i] & 0xffff;
		} else {
			final int i_212_ = anIntArray3827[i_202_];
			final int i_213_ = anIntArray3820[i_202_];
			final int i_214_ = anIntArray3780[i] & 0xffff;
			if (i_204_ >= 50) {
				final int i_215_ = (50 - i_205_) * Rasterizer.anIntArray984[i_204_ - i_205_];
				anIntArray3843[i_200_] = i_198_ + (i_212_ + ((anIntArray3827[i_201_] - i_212_) * i_215_ >> 16) << 9) / 50;
				anIntArray3837[i_200_] = i_199_ + (i_213_ + ((anIntArray3820[i_201_] - i_213_) * i_215_ >> 16) << 9) / 50;
				anIntArray3842[i_200_++] = i_214_ + (((anIntArray3779[i] & 0xffff) - i_214_) * i_215_ >> 16);
			}
			if (i_206_ >= 50) {
				final int i_216_ = (50 - i_205_) * Rasterizer.anIntArray984[i_206_ - i_205_];
				anIntArray3843[i_200_] = i_198_ + (i_212_ + ((anIntArray3827[i_203_] - i_212_) * i_216_ >> 16) << 9) / 50;
				anIntArray3837[i_200_] = i_199_ + (i_213_ + ((anIntArray3820[i_203_] - i_213_) * i_216_ >> 16) << 9) / 50;
				anIntArray3842[i_200_++] = i_214_ + (((anIntArray3769[i] & 0xffff) - i_214_) * i_216_ >> 16);
			}
		}
		if (i_206_ >= 50) {
			anIntArray3843[i_200_] = anIntArray3840[i_203_];
			anIntArray3837[i_200_] = anIntArray3811[i_203_];
			anIntArray3842[i_200_++] = anIntArray3769[i] & 0xffff;
		} else {
			final int i_217_ = anIntArray3827[i_203_];
			final int i_218_ = anIntArray3820[i_203_];
			final int i_219_ = anIntArray3769[i] & 0xffff;
			if (i_205_ >= 50) {
				final int i_220_ = (50 - i_206_) * Rasterizer.anIntArray984[i_205_ - i_206_];
				anIntArray3843[i_200_] = i_198_ + (i_217_ + ((anIntArray3827[i_202_] - i_217_) * i_220_ >> 16) << 9) / 50;
				anIntArray3837[i_200_] = i_199_ + (i_218_ + ((anIntArray3820[i_202_] - i_218_) * i_220_ >> 16) << 9) / 50;
				anIntArray3842[i_200_++] = i_219_ + (((anIntArray3780[i] & 0xffff) - i_219_) * i_220_ >> 16);
			}
			if (i_204_ >= 50) {
				final int i_221_ = (50 - i_206_) * Rasterizer.anIntArray984[i_204_ - i_206_];
				anIntArray3843[i_200_] = i_198_ + (i_217_ + ((anIntArray3827[i_201_] - i_217_) * i_221_ >> 16) << 9) / 50;
				anIntArray3837[i_200_] = i_199_ + (i_218_ + ((anIntArray3820[i_201_] - i_218_) * i_221_ >> 16) << 9) / 50;
				anIntArray3842[i_200_++] = i_219_ + (((anIntArray3779[i] & 0xffff) - i_219_) * i_221_ >> 16);
			}
		}
		final int i_222_ = anIntArray3843[0];
		final int i_223_ = anIntArray3843[1];
		final int i_224_ = anIntArray3843[2];
		final int i_225_ = anIntArray3837[0];
		final int i_226_ = anIntArray3837[1];
		final int i_227_ = anIntArray3837[2];
		Rasterizer.aBoolean972 = false;
		if (i_200_ == 3) {
			if (i_222_ < 0 || i_223_ < 0 || i_224_ < 0 || i_222_ > Rasterizer.anInt983 || i_223_ > Rasterizer.anInt983 || i_224_ > Rasterizer.anInt983) {
				Rasterizer.aBoolean972 = true;
			}
			if (aShortArray3760 == null || aShortArray3760[i] == -1) {
				if (anIntArray3769[i] == -1) {
					Rasterizer.method863(i_225_, i_226_, i_227_, i_222_, i_223_, i_224_, Rasterizer.palette[anIntArray3779[i] & 0xffff]);
				} else {
					Rasterizer.method856(i_225_, i_226_, i_227_, i_222_, i_223_, i_224_, anIntArray3842[0], anIntArray3842[1], anIntArray3842[2]);
				}
			} else {
				int i_228_;
				int i_229_;
				int i_230_;
				if (aByteArray3770 != null && aByteArray3770[i] != -1) {
					final int i_231_ = aByteArray3770[i] & 0xff;
					i_228_ = anIntArray3791[i_231_];
					i_229_ = anIntArray3797[i_231_];
					i_230_ = anIntArray3766[i_231_];
				} else {
					i_228_ = i_201_;
					i_229_ = i_202_;
					i_230_ = i_203_;
				}
				if (anIntArray3769[i] == -1) {
					Rasterizer.method862(i_225_, i_226_, i_227_, i_222_, i_223_, i_224_, anIntArray3779[i], anIntArray3779[i], anIntArray3779[i], anIntArray3827[i_228_], anIntArray3827[i_229_], anIntArray3827[i_230_], anIntArray3820[i_228_], anIntArray3820[i_229_], anIntArray3820[i_230_],
							anIntArray3829[i_228_], anIntArray3829[i_229_], anIntArray3829[i_230_], aShortArray3760[i]);
				} else {
					Rasterizer.method862(i_225_, i_226_, i_227_, i_222_, i_223_, i_224_, anIntArray3842[0], anIntArray3842[1], anIntArray3842[2], anIntArray3827[i_228_], anIntArray3827[i_229_], anIntArray3827[i_230_], anIntArray3820[i_228_], anIntArray3820[i_229_], anIntArray3820[i_230_],
							anIntArray3829[i_228_], anIntArray3829[i_229_], anIntArray3829[i_230_], aShortArray3760[i]);
				}
			}
		}
		if (i_200_ == 4) {
			if (i_222_ < 0 || i_223_ < 0 || i_224_ < 0 || i_222_ > Rasterizer.anInt983 || i_223_ > Rasterizer.anInt983 || i_224_ > Rasterizer.anInt983 || anIntArray3843[3] < 0 || anIntArray3843[3] > Rasterizer.anInt983) {
				Rasterizer.aBoolean972 = true;
			}
			if (aShortArray3760 == null || aShortArray3760[i] == -1) {
				if (anIntArray3769[i] == -1) {
					final int i_232_ = Rasterizer.palette[anIntArray3779[i] & 0xffff];
					Rasterizer.method863(i_225_, i_226_, i_227_, i_222_, i_223_, i_224_, i_232_);
					Rasterizer.method863(i_225_, i_227_, anIntArray3837[3], i_222_, i_224_, anIntArray3843[3], i_232_);
				} else {
					Rasterizer.method856(i_225_, i_226_, i_227_, i_222_, i_223_, i_224_, anIntArray3842[0], anIntArray3842[1], anIntArray3842[2]);
					Rasterizer.method856(i_225_, i_227_, anIntArray3837[3], i_222_, i_224_, anIntArray3843[3], anIntArray3842[0], anIntArray3842[2], anIntArray3842[3]);
				}
			} else {
				int i_233_;
				int i_234_;
				int i_235_;
				if (aByteArray3770 != null && aByteArray3770[i] != -1) {
					final int i_236_ = aByteArray3770[i] & 0xff;
					i_233_ = anIntArray3791[i_236_];
					i_234_ = anIntArray3797[i_236_];
					i_235_ = anIntArray3766[i_236_];
				} else {
					i_233_ = i_201_;
					i_234_ = i_202_;
					i_235_ = i_203_;
				}
				final short i_237_ = aShortArray3760[i];
				if (anIntArray3769[i] == -1) {
					Rasterizer.method862(i_225_, i_226_, i_227_, i_222_, i_223_, i_224_, anIntArray3779[i], anIntArray3779[i], anIntArray3779[i], anIntArray3827[i_233_], anIntArray3827[i_234_], anIntArray3827[i_235_], anIntArray3820[i_233_], anIntArray3820[i_234_], anIntArray3820[i_235_],
							anIntArray3829[i_233_], anIntArray3829[i_234_], anIntArray3829[i_235_], i_237_);
					Rasterizer.method862(i_225_, i_227_, anIntArray3837[3], i_222_, i_224_, anIntArray3843[3], anIntArray3779[i], anIntArray3779[i], anIntArray3779[i], anIntArray3827[i_233_], anIntArray3827[i_234_], anIntArray3827[i_235_], anIntArray3820[i_233_], anIntArray3820[i_234_],
							anIntArray3820[i_235_], anIntArray3829[i_233_], anIntArray3829[i_234_], anIntArray3829[i_235_], i_237_);
				} else {
					Rasterizer.method862(i_225_, i_226_, i_227_, i_222_, i_223_, i_224_, anIntArray3842[0], anIntArray3842[1], anIntArray3842[2], anIntArray3827[i_233_], anIntArray3827[i_234_], anIntArray3827[i_235_], anIntArray3820[i_233_], anIntArray3820[i_234_], anIntArray3820[i_235_],
							anIntArray3829[i_233_], anIntArray3829[i_234_], anIntArray3829[i_235_], i_237_);
					Rasterizer.method862(i_225_, i_227_, anIntArray3837[3], i_222_, i_224_, anIntArray3843[3], anIntArray3842[0], anIntArray3842[2], anIntArray3842[3], anIntArray3827[i_233_], anIntArray3827[i_234_], anIntArray3827[i_235_], anIntArray3820[i_233_], anIntArray3820[i_234_],
							anIntArray3820[i_235_], anIntArray3829[i_233_], anIntArray3829[i_234_], anIntArray3829[i_235_], i_237_);
				}
			}
		}
	}

	private final AbstractModel method2397(final boolean bool, final boolean bool_238_, final LDModel class180_sub7_sub1_239_, final byte[] is, final short[] is_240_, final int[] is_241_, final int[] is_242_, final int[] is_243_) {
		class180_sub7_sub1_239_.anInt3793 = this.anInt3793;
		class180_sub7_sub1_239_.vertexCount = vertexCount;
		class180_sub7_sub1_239_.anInt3792 = anInt3792;
		class180_sub7_sub1_239_.anInt3768 = anInt3768;
		if (class180_sub7_sub1_239_.xVertices == null || class180_sub7_sub1_239_.xVertices.length < this.anInt3793) {
			class180_sub7_sub1_239_.xVertices = new int[this.anInt3793 + 100];
			class180_sub7_sub1_239_.yVertices = new int[this.anInt3793 + 100];
			class180_sub7_sub1_239_.zVertices = new int[this.anInt3793 + 100];
		}
		for (int i = 0; i < this.anInt3793; i++) {
			class180_sub7_sub1_239_.xVertices[i] = this.xVertices[i];
			class180_sub7_sub1_239_.yVertices[i] = this.yVertices[i];
			class180_sub7_sub1_239_.zVertices[i] = this.zVertices[i];
		}
		if (bool) {
			class180_sub7_sub1_239_.trianglesAlpha = trianglesAlpha;
		} else {
			class180_sub7_sub1_239_.trianglesAlpha = is;
			if (trianglesAlpha == null) {
				for (int i = 0; i < anInt3792; i++) {
					class180_sub7_sub1_239_.trianglesAlpha[i] = (byte) 0;
				}
			} else {
				for (int i = 0; i < anInt3792; i++) {
					class180_sub7_sub1_239_.trianglesAlpha[i] = trianglesAlpha[i];
				}
			}
		}
		if (bool_238_) {
			class180_sub7_sub1_239_.aShortArray3777 = aShortArray3777;
			class180_sub7_sub1_239_.anIntArray3779 = anIntArray3779;
			class180_sub7_sub1_239_.anIntArray3780 = anIntArray3780;
			class180_sub7_sub1_239_.anIntArray3769 = anIntArray3769;
		} else {
			class180_sub7_sub1_239_.aShortArray3777 = is_240_;
			class180_sub7_sub1_239_.anIntArray3779 = is_241_;
			class180_sub7_sub1_239_.anIntArray3780 = is_242_;
			class180_sub7_sub1_239_.anIntArray3769 = is_243_;
			for (int i = 0; i < anInt3792; i++) {
				class180_sub7_sub1_239_.aShortArray3777[i] = aShortArray3777[i];
				class180_sub7_sub1_239_.anIntArray3779[i] = anIntArray3779[i];
				class180_sub7_sub1_239_.anIntArray3780[i] = anIntArray3780[i];
				class180_sub7_sub1_239_.anIntArray3769[i] = anIntArray3769[i];
			}
		}
		class180_sub7_sub1_239_.trianglesA = trianglesA;
		class180_sub7_sub1_239_.trianglesB = trianglesB;
		class180_sub7_sub1_239_.trianglesC = trianglesC;
		class180_sub7_sub1_239_.aByteArray3762 = aByteArray3762;
		class180_sub7_sub1_239_.aByteArray3770 = aByteArray3770;
		class180_sub7_sub1_239_.aShortArray3760 = aShortArray3760;
		class180_sub7_sub1_239_.aByte3756 = aByte3756;
		class180_sub7_sub1_239_.anIntArray3791 = anIntArray3791;
		class180_sub7_sub1_239_.anIntArray3797 = anIntArray3797;
		class180_sub7_sub1_239_.anIntArray3766 = anIntArray3766;
		class180_sub7_sub1_239_.anIntArrayArray3786 = anIntArrayArray3786;
		class180_sub7_sub1_239_.anIntArrayArray3795 = anIntArrayArray3795;
		class180_sub7_sub1_239_.aShortArray3783 = aShortArray3783;
		class180_sub7_sub1_239_.aShortArray3761 = aShortArray3761;
		class180_sub7_sub1_239_.haveActions = this.haveActions;
		class180_sub7_sub1_239_.boundsCalculated = false;
		class180_sub7_sub1_239_.aClass158Array3788 = this.aClass158Array3788;
		class180_sub7_sub1_239_.aClass169Array3776 = this.aClass169Array3776;
		return class180_sub7_sub1_239_;
	}

	private final void calculateBounds() {
		int minX = 32767;
		int minY = 32767;
		int minZ = 32767;
		int maxX = -32768;
		int maxY = -32768;
		int maxZ = -32768;
		int i_249_ = 0;
		int i_250_ = 0;
		for (int i_251_ = 0; i_251_ < vertexCount; i_251_++) {
			final int xVertex = this.xVertices[i_251_];
			final int yVertex = this.yVertices[i_251_];
			final int zVertex = this.zVertices[i_251_];
			if (xVertex < minX) {
				minX = xVertex;
			}
			if (xVertex > maxX) {
				maxX = xVertex;
			}
			if (yVertex < minY) {
				minY = yVertex;
			}
			if (yVertex > maxY) {
				maxY = yVertex;
			}
			if (zVertex < minZ) {
				minZ = zVertex;
			}
			if (zVertex > maxZ) {
				maxZ = zVertex;
			}
			int i_255_ = xVertex * xVertex + zVertex * zVertex;
			if (i_255_ > i_249_) {
				i_249_ = i_255_;
			}
			i_255_ += yVertex * yVertex;
			if (i_255_ > i_250_) {
				i_250_ = i_255_;
			}
		}
		this.minX = (short) minX;
		this.maxX = (short) maxX;
		this.maxY = (short) minY;
		this.minY = (short) maxY;
		this.minZ = (short) minZ;
		this.maxZ = (short) maxZ;
		this.aShort3763 = (short) (int) (Math.sqrt(i_249_) + 0.99);
		this.aShort3785 = (short) (int) (Math.sqrt(i_250_) + 0.99);
		this.boundsCalculated = true;
	}

	final LDModel method2399(final int i, final int i_256_, final int[][] is, final int[][] is_257_, final int i_258_, final int i_259_, final int i_260_, final boolean bool) {
		if (!this.boundsCalculated) {
			calculateBounds();
		}
		int i_261_ = i_258_ + minX;
		int i_262_ = i_258_ + maxX;
		int i_263_ = i_260_ + minZ;
		int i_264_ = i_260_ + maxZ;
		if ((i == 1 || i == 2 || i == 3 || i == 5) && (i_261_ < 0 || i_262_ + 128 >> 7 >= is.length || i_263_ < 0 || i_264_ + 128 >> 7 >= is[0].length)) {
			return this;
		}
		if (i == 4 || i == 5) {
			if (is_257_ == null) {
				return this;
			}
			if (i_261_ < 0 || i_262_ + 128 >> 7 >= is_257_.length || i_263_ < 0 || i_264_ + 128 >> 7 >= is_257_[0].length) {
				return this;
			}
		} else {
			i_261_ >>= 7;
			i_262_ = i_262_ + 127 >> 7;
			i_263_ >>= 7;
			i_264_ = i_264_ + 127 >> 7;
			if (is[i_261_][i_263_] == i_259_ && is[i_262_][i_263_] == i_259_ && is[i_261_][i_264_] == i_259_ && is[i_262_][i_264_] == i_259_) {
				return this;
			}
		}
		LDModel class180_sub7_sub1_265_;
		if (bool) {
			class180_sub7_sub1_265_ = new LDModel();
			class180_sub7_sub1_265_.anInt3793 = this.anInt3793;
			class180_sub7_sub1_265_.vertexCount = vertexCount;
			class180_sub7_sub1_265_.anInt3792 = anInt3792;
			class180_sub7_sub1_265_.anInt3768 = anInt3768;
			class180_sub7_sub1_265_.trianglesA = trianglesA;
			class180_sub7_sub1_265_.trianglesB = trianglesB;
			class180_sub7_sub1_265_.trianglesC = trianglesC;
			class180_sub7_sub1_265_.anIntArray3779 = anIntArray3779;
			class180_sub7_sub1_265_.anIntArray3780 = anIntArray3780;
			class180_sub7_sub1_265_.anIntArray3769 = anIntArray3769;
			class180_sub7_sub1_265_.aByteArray3762 = aByteArray3762;
			class180_sub7_sub1_265_.aByteArray3770 = aByteArray3770;
			class180_sub7_sub1_265_.aShortArray3760 = aShortArray3760;
			class180_sub7_sub1_265_.aShortArray3777 = aShortArray3777;
			class180_sub7_sub1_265_.trianglesAlpha = trianglesAlpha;
			class180_sub7_sub1_265_.aByte3756 = aByte3756;
			class180_sub7_sub1_265_.anIntArray3791 = anIntArray3791;
			class180_sub7_sub1_265_.anIntArray3797 = anIntArray3797;
			class180_sub7_sub1_265_.anIntArray3766 = anIntArray3766;
			class180_sub7_sub1_265_.anIntArrayArray3786 = anIntArrayArray3786;
			class180_sub7_sub1_265_.anIntArrayArray3795 = anIntArrayArray3795;
			class180_sub7_sub1_265_.aShortArray3783 = aShortArray3783;
			class180_sub7_sub1_265_.aShortArray3761 = aShortArray3761;
			class180_sub7_sub1_265_.haveActions = this.haveActions;
			if (i == 3) {
				class180_sub7_sub1_265_.xVertices = SpotAnimType.arrayCopy(this.xVertices);
				class180_sub7_sub1_265_.yVertices = SpotAnimType.arrayCopy(this.yVertices);
				class180_sub7_sub1_265_.zVertices = SpotAnimType.arrayCopy(this.zVertices);
			} else {
				class180_sub7_sub1_265_.xVertices = this.xVertices;
				class180_sub7_sub1_265_.yVertices = new int[class180_sub7_sub1_265_.anInt3793];
				class180_sub7_sub1_265_.zVertices = this.zVertices;
			}
		} else {
			class180_sub7_sub1_265_ = this;
		}
		if (i == 1) {
			for (int i_266_ = 0; i_266_ < class180_sub7_sub1_265_.vertexCount; i_266_++) {
				final int i_267_ = this.xVertices[i_266_] + i_258_;
				final int i_268_ = this.zVertices[i_266_] + i_260_;
				final int i_269_ = i_267_ & 0x7f;
				final int i_270_ = i_268_ & 0x7f;
				final int i_271_ = i_267_ >> 7;
				final int i_272_ = i_268_ >> 7;
				final int i_273_ = is[i_271_][i_272_] * (128 - i_269_) + is[i_271_ + 1][i_272_] * i_269_ >> 7;
				final int i_274_ = is[i_271_][i_272_ + 1] * (128 - i_269_) + is[i_271_ + 1][i_272_ + 1] * i_269_ >> 7;
				final int i_275_ = i_273_ * (128 - i_270_) + i_274_ * i_270_ >> 7;
				class180_sub7_sub1_265_.yVertices[i_266_] = this.yVertices[i_266_] + i_275_ - i_259_;
			}
			for (int i_276_ = class180_sub7_sub1_265_.vertexCount; i_276_ < class180_sub7_sub1_265_.anInt3793; i_276_++) {
				final int i_277_ = this.xVertices[i_276_] + i_258_;
				final int i_278_ = this.zVertices[i_276_] + i_260_;
				final int i_279_ = i_277_ & 0x7f;
				final int i_280_ = i_278_ & 0x7f;
				final int i_281_ = i_277_ >> 7;
				final int i_282_ = i_278_ >> 7;
				if (i_281_ >= 0 && i_281_ < is.length - 1 && i_282_ >= 0 && i_282_ < is[0].length - 1) {
					final int i_283_ = is[i_281_][i_282_] * (128 - i_279_) + is[i_281_ + 1][i_282_] * i_279_ >> 7;
					final int i_284_ = is[i_281_][i_282_ + 1] * (128 - i_279_) + is[i_281_ + 1][i_282_ + 1] * i_279_ >> 7;
					final int i_285_ = i_283_ * (128 - i_280_) + i_284_ * i_280_ >> 7;
					class180_sub7_sub1_265_.yVertices[i_276_] = this.yVertices[i_276_] + i_285_ - i_259_;
				}
			}
		} else if (i == 2) {
			for (int i_286_ = 0; i_286_ < class180_sub7_sub1_265_.vertexCount; i_286_++) {
				final int i_287_ = (this.yVertices[i_286_] << 16) / maxY;
				if (i_287_ < i_256_) {
					final int i_288_ = this.xVertices[i_286_] + i_258_;
					final int i_289_ = this.zVertices[i_286_] + i_260_;
					final int i_290_ = i_288_ & 0x7f;
					final int i_291_ = i_289_ & 0x7f;
					final int i_292_ = i_288_ >> 7;
					final int i_293_ = i_289_ >> 7;
					final int i_294_ = is[i_292_][i_293_] * (128 - i_290_) + is[i_292_ + 1][i_293_] * i_290_ >> 7;
					final int i_295_ = is[i_292_][i_293_ + 1] * (128 - i_290_) + is[i_292_ + 1][i_293_ + 1] * i_290_ >> 7;
					final int i_296_ = i_294_ * (128 - i_291_) + i_295_ * i_291_ >> 7;
					class180_sub7_sub1_265_.yVertices[i_286_] = this.yVertices[i_286_] + (i_296_ - i_259_) * (i_256_ - i_287_) / i_256_;
				} else {
					class180_sub7_sub1_265_.yVertices[i_286_] = this.yVertices[i_286_];
				}
			}
			for (int i_297_ = class180_sub7_sub1_265_.vertexCount; i_297_ < class180_sub7_sub1_265_.anInt3793; i_297_++) {
				final int i_298_ = (this.yVertices[i_297_] << 16) / maxY;
				if (i_298_ < i_256_) {
					final int i_299_ = this.xVertices[i_297_] + i_258_;
					final int i_300_ = this.zVertices[i_297_] + i_260_;
					final int i_301_ = i_299_ & 0x7f;
					final int i_302_ = i_300_ & 0x7f;
					final int i_303_ = i_299_ >> 7;
					final int i_304_ = i_300_ >> 7;
					if (i_303_ >= 0 && i_303_ < is.length - 1 && i_304_ >= 0 && i_304_ < is[0].length - 1) {
						final int i_305_ = is[i_303_][i_304_] * (128 - i_301_) + is[i_303_ + 1][i_304_] * i_301_ >> 7;
						final int i_306_ = is[i_303_][i_304_ + 1] * (128 - i_301_) + is[i_303_ + 1][i_304_ + 1] * i_301_ >> 7;
						final int i_307_ = i_305_ * (128 - i_302_) + i_306_ * i_302_ >> 7;
						class180_sub7_sub1_265_.yVertices[i_297_] = this.yVertices[i_297_] + (i_307_ - i_259_) * (i_256_ - i_298_) / i_256_;
					}
				} else {
					class180_sub7_sub1_265_.yVertices[i_297_] = this.yVertices[i_297_];
				}
			}
		} else if (i == 3) {
			final int i_308_ = (i_256_ & 0xff) * 4;
			final int i_309_ = (i_256_ >> 8 & 0xff) * 4;
			class180_sub7_sub1_265_.method2385(is, i_258_, i_259_, i_260_, i_308_, i_309_);
		} else if (i == 4) {
			final int i_310_ = minY - maxY;
			for (int i_311_ = 0; i_311_ < vertexCount; i_311_++) {
				final int i_312_ = this.xVertices[i_311_] + i_258_;
				final int i_313_ = this.zVertices[i_311_] + i_260_;
				final int i_314_ = i_312_ & 0x7f;
				final int i_315_ = i_313_ & 0x7f;
				final int i_316_ = i_312_ >> 7;
				final int i_317_ = i_313_ >> 7;
				final int i_318_ = is_257_[i_316_][i_317_] * (128 - i_314_) + is_257_[i_316_ + 1][i_317_] * i_314_ >> 7;
				final int i_319_ = is_257_[i_316_][i_317_ + 1] * (128 - i_314_) + is_257_[i_316_ + 1][i_317_ + 1] * i_314_ >> 7;
				final int i_320_ = i_318_ * (128 - i_315_) + i_319_ * i_315_ >> 7;
				class180_sub7_sub1_265_.yVertices[i_311_] = this.yVertices[i_311_] + i_320_ - i_259_ + i_310_;
			}
			for (int i_321_ = class180_sub7_sub1_265_.vertexCount; i_321_ < class180_sub7_sub1_265_.anInt3793; i_321_++) {
				final int i_322_ = this.xVertices[i_321_] + i_258_;
				final int i_323_ = this.zVertices[i_321_] + i_260_;
				final int i_324_ = i_322_ & 0x7f;
				final int i_325_ = i_323_ & 0x7f;
				final int i_326_ = i_322_ >> 7;
				final int i_327_ = i_323_ >> 7;
				if (i_326_ >= 0 && i_326_ < is_257_.length - 1 && i_327_ >= 0 && i_327_ < is_257_[0].length - 1) {
					final int i_328_ = is_257_[i_326_][i_327_] * (128 - i_324_) + is_257_[i_326_ + 1][i_327_] * i_324_ >> 7;
					final int i_329_ = is_257_[i_326_][i_327_ + 1] * (128 - i_324_) + is_257_[i_326_ + 1][i_327_ + 1] * i_324_ >> 7;
					final int i_330_ = i_328_ * (128 - i_325_) + i_329_ * i_325_ >> 7;
					class180_sub7_sub1_265_.yVertices[i_321_] = this.yVertices[i_321_] + i_330_ - i_259_ + i_310_;
				}
			}
		} else if (i == 5) {
			final int i_331_ = minY - maxY;
			for (int i_332_ = 0; i_332_ < vertexCount; i_332_++) {
				final int i_333_ = this.xVertices[i_332_] + i_258_;
				final int i_334_ = this.zVertices[i_332_] + i_260_;
				final int i_335_ = i_333_ & 0x7f;
				final int i_336_ = i_334_ & 0x7f;
				final int i_337_ = i_333_ >> 7;
				final int i_338_ = i_334_ >> 7;
				int i_339_ = is[i_337_][i_338_] * (128 - i_335_) + is[i_337_ + 1][i_338_] * i_335_ >> 7;
				int i_340_ = is[i_337_][i_338_ + 1] * (128 - i_335_) + is[i_337_ + 1][i_338_ + 1] * i_335_ >> 7;
				final int i_341_ = i_339_ * (128 - i_336_) + i_340_ * i_336_ >> 7;
				i_339_ = is_257_[i_337_][i_338_] * (128 - i_335_) + is_257_[i_337_ + 1][i_338_] * i_335_ >> 7;
				i_340_ = is_257_[i_337_][i_338_ + 1] * (128 - i_335_) + is_257_[i_337_ + 1][i_338_ + 1] * i_335_ >> 7;
				final int i_342_ = i_339_ * (128 - i_336_) + i_340_ * i_336_ >> 7;
				final int i_343_ = i_341_ - i_342_;
				class180_sub7_sub1_265_.yVertices[i_332_] = ((this.yVertices[i_332_] << 8) / i_331_ * i_343_ >> 8) - (i_259_ - i_341_);
			}
			for (int i_344_ = class180_sub7_sub1_265_.vertexCount; i_344_ < class180_sub7_sub1_265_.anInt3793; i_344_++) {
				final int i_345_ = this.xVertices[i_344_] + i_258_;
				final int i_346_ = this.zVertices[i_344_] + i_260_;
				final int i_347_ = i_345_ & 0x7f;
				final int i_348_ = i_346_ & 0x7f;
				final int i_349_ = i_345_ >> 7;
				final int i_350_ = i_346_ >> 7;
				if (i_349_ >= 0 && i_349_ < is.length - 1 && i_349_ < is_257_.length - 1 && i_350_ >= 0 && i_350_ < is[0].length - 1 && i_350_ < is_257_[0].length - 1) {
					int i_351_ = is[i_349_][i_350_] * (128 - i_347_) + is[i_349_ + 1][i_350_] * i_347_ >> 7;
					int i_352_ = is[i_349_][i_350_ + 1] * (128 - i_347_) + is[i_349_ + 1][i_350_ + 1] * i_347_ >> 7;
					final int i_353_ = i_351_ * (128 - i_348_) + i_352_ * i_348_ >> 7;
					i_351_ = is_257_[i_349_][i_350_] * (128 - i_347_) + is_257_[i_349_ + 1][i_350_] * i_347_ >> 7;
					i_352_ = is_257_[i_349_][i_350_ + 1] * (128 - i_347_) + is_257_[i_349_ + 1][i_350_ + 1] * i_347_ >> 7;
					final int i_354_ = i_351_ * (128 - i_348_) + i_352_ * i_348_ >> 7;
					final int i_355_ = i_353_ - i_354_;
					class180_sub7_sub1_265_.yVertices[i_344_] = ((this.yVertices[i_344_] << 8) / i_331_ * i_355_ >> 8) - (i_259_ - i_353_);
				}
			}
		}
		class180_sub7_sub1_265_.boundsCalculated = false;
		return class180_sub7_sub1_265_;
	}

	@Override
	final void method2388(final int i, final int[] is, final int i_356_, final int i_357_, final int i_358_, final boolean bool) {
		final int i_359_ = is.length;
		if (i == 0) {
			int i_360_ = 0;
			anInt3822 = 0;
			anInt3841 = 0;
			anInt3816 = 0;
			for (int i_361_ = 0; i_361_ < i_359_; i_361_++) {
				final int i_362_ = is[i_361_];
				if (i_362_ < anIntArrayArray3786.length) {
					final int[] is_363_ = anIntArrayArray3786[i_362_];
					int[] is_365_;
					final int i_364_ = (is_365_ = is_363_).length;
					for (int i_366_ = 0; i_366_ < i_364_; i_366_++) {
						final int i_367_ = is_365_[i_366_];
						anInt3822 += this.xVertices[i_367_];
						anInt3841 += this.yVertices[i_367_];
						anInt3816 += this.zVertices[i_367_];
						i_360_++;
					}
				}
			}
			if (i_360_ > 0) {
				anInt3822 = anInt3822 / i_360_ + i_356_;
				anInt3841 = anInt3841 / i_360_ + i_357_;
				anInt3816 = anInt3816 / i_360_ + i_358_;
			} else {
				anInt3822 = i_356_;
				anInt3841 = i_357_;
				anInt3816 = i_358_;
			}
		} else if (i == 1) {
			for (int i_368_ = 0; i_368_ < i_359_; i_368_++) {
				final int i_369_ = is[i_368_];
				if (i_369_ < anIntArrayArray3786.length) {
					final int[] is_370_ = anIntArrayArray3786[i_369_];
					int[] is_372_;
					final int i_371_ = (is_372_ = is_370_).length;
					for (int i_373_ = 0; i_373_ < i_371_; i_373_++) {
						final int i_374_ = is_372_[i_373_];
						final int i_375_ = i_374_;
						this.xVertices[i_375_] += i_356_;
						this.yVertices[i_375_] += i_357_;
						this.zVertices[i_375_] += i_358_;
					}
				}
			}
		} else if (i == 2) {
			for (int i_376_ = 0; i_376_ < i_359_; i_376_++) {
				final int i_377_ = is[i_376_];
				if (i_377_ < anIntArrayArray3786.length) {
					final int[] is_378_ = anIntArrayArray3786[i_377_];
					int[] is_380_;
					final int i_379_ = (is_380_ = is_378_).length;
					for (int i_381_ = 0; i_381_ < i_379_; i_381_++) {
						final int i_382_ = is_380_[i_381_];
						final int i_383_ = i_382_;
						this.xVertices[i_383_] -= anInt3822;
						this.yVertices[i_383_] -= anInt3841;
						this.zVertices[i_383_] -= anInt3816;
						if (i_358_ != 0) {
							final int i_384_ = Rasterizer.sineTable[i_358_];
							final int i_385_ = Rasterizer.cosineTable[i_358_];
							final int i_386_ = this.yVertices[i_383_] * i_384_ + this.xVertices[i_383_] * i_385_ + 32767 >> 16;
							this.yVertices[i_383_] = this.yVertices[i_383_] * i_385_ - this.xVertices[i_383_] * i_384_ + 32767 >> 16;
							this.xVertices[i_383_] = i_386_;
						}
						if (i_356_ != 0) {
							final int i_387_ = Rasterizer.sineTable[i_356_];
							final int i_388_ = Rasterizer.cosineTable[i_356_];
							final int i_389_ = this.yVertices[i_383_] * i_388_ - this.zVertices[i_383_] * i_387_ + 32767 >> 16;
							this.zVertices[i_383_] = this.yVertices[i_383_] * i_387_ + this.zVertices[i_383_] * i_388_ + 32767 >> 16;
							this.yVertices[i_383_] = i_389_;
						}
						if (i_357_ != 0) {
							final int i_390_ = Rasterizer.sineTable[i_357_];
							final int i_391_ = Rasterizer.cosineTable[i_357_];
							final int i_392_ = this.zVertices[i_383_] * i_390_ + this.xVertices[i_383_] * i_391_ + 32767 >> 16;
							this.zVertices[i_383_] = this.zVertices[i_383_] * i_391_ - this.xVertices[i_383_] * i_390_ + 32767 >> 16;
							this.xVertices[i_383_] = i_392_;
						}
						this.xVertices[i_383_] += anInt3822;
						this.yVertices[i_383_] += anInt3841;
						this.zVertices[i_383_] += anInt3816;
					}
				}
			}
		} else if (i == 3) {
			for (int i_393_ = 0; i_393_ < i_359_; i_393_++) {
				final int i_394_ = is[i_393_];
				if (i_394_ < anIntArrayArray3786.length) {
					final int[] is_395_ = anIntArrayArray3786[i_394_];
					int[] is_397_;
					final int i_396_ = (is_397_ = is_395_).length;
					for (int i_398_ = 0; i_398_ < i_396_; i_398_++) {
						final int i_399_ = is_397_[i_398_];
						final int i_400_ = i_399_;
						this.xVertices[i_400_] -= anInt3822;
						this.yVertices[i_400_] -= anInt3841;
						this.zVertices[i_400_] -= anInt3816;
						this.xVertices[i_400_] = this.xVertices[i_400_] * i_356_ / 128;
						this.yVertices[i_400_] = this.yVertices[i_400_] * i_357_ / 128;
						this.zVertices[i_400_] = this.zVertices[i_400_] * i_358_ / 128;
						this.xVertices[i_400_] += anInt3822;
						this.yVertices[i_400_] += anInt3841;
						this.zVertices[i_400_] += anInt3816;
					}
				}
			}
		} else if (i == 5) {
			if (anIntArrayArray3795 != null && trianglesAlpha != null) {
				for (int i_401_ = 0; i_401_ < i_359_; i_401_++) {
					final int i_402_ = is[i_401_];
					if (i_402_ < anIntArrayArray3795.length) {
						final int[] is_403_ = anIntArrayArray3795[i_402_];
						int[] is_405_;
						final int i_404_ = (is_405_ = is_403_).length;
						for (int i_406_ = 0; i_406_ < i_404_; i_406_++) {
							final int i_407_ = is_405_[i_406_];
							final int i_408_ = i_407_;
							int i_409_ = (trianglesAlpha[i_408_] & 0xff) + i_356_ * 8;
							if (i_409_ < 0) {
								i_409_ = 0;
							} else if (i_409_ > 255) {
								i_409_ = 255;
							}
							trianglesAlpha[i_408_] = (byte) i_409_;
						}
					}
				}
			}
		} else if (i == 7 && anIntArrayArray3795 != null) {
			for (int i_410_ = 0; i_410_ < i_359_; i_410_++) {
				final int i_411_ = is[i_410_];
				if (i_411_ < anIntArrayArray3795.length) {
					final int[] is_412_ = anIntArrayArray3795[i_411_];
					int[] is_414_;
					final int i_413_ = (is_414_ = is_412_).length;
					for (int i_415_ = 0; i_415_ < i_413_; i_415_++) {
						final int i_416_ = is_414_[i_415_];
						final int i_417_ = i_416_;
						final int i_418_ = aShortArray3777[i_417_] & 0xffff;
						int i_419_ = i_418_ >> 10 & 0x3f;
						int i_420_ = i_418_ >> 7 & 0x7;
						int i_421_ = i_418_ & 0x7f;
						i_419_ = i_419_ + i_356_ & 0x3f;
						i_420_ += i_357_;
						if (i_420_ < 0) {
							i_420_ = 0;
						} else if (i_420_ > 7) {
							i_420_ = 7;
						}
						i_421_ += i_358_;
						if (i_421_ < 0) {
							i_421_ = 0;
						} else if (i_421_ > 127) {
							i_421_ = 127;
						}
						aShortArray3777[i_417_] = (short) (i_419_ << 10 | i_420_ << 7 | i_421_);
					}
					aBoolean3774 = true;
				}
			}
		}
	}

	@Override
	final int getMaxY() {
		if (!this.boundsCalculated) {
			calculateBounds();
		}
		return maxY;
	}

	@Override
	final void resize(final int i, final int i_422_, final int i_423_) {
		for (int i_424_ = 0; i_424_ < this.anInt3793; i_424_++) {
			this.xVertices[i_424_] = this.xVertices[i_424_] * i / 128;
			this.yVertices[i_424_] = this.yVertices[i_424_] * i_422_ / 128;
			this.zVertices[i_424_] = this.zVertices[i_424_] * i_423_ / 128;
		}
		this.boundsCalculated = false;
	}

	final void method2400(final int i, final int i_425_, final int i_426_, final int i_427_, final int i_428_, final int i_429_, final int i_430_, final int i_431_) {
		try {
			if (!this.boundsCalculated) {
				calculateBounds();
			}
			final int i_432_ = Rasterizer.anInt967;
			final int i_433_ = Rasterizer.anInt970;
			final int i_434_ = Rasterizer.sineTable[i];
			final int i_435_ = Rasterizer.cosineTable[i];
			final int i_436_ = Rasterizer.sineTable[i_425_];
			final int i_437_ = Rasterizer.cosineTable[i_425_];
			final int i_438_ = Rasterizer.sineTable[i_426_];
			final int i_439_ = Rasterizer.cosineTable[i_426_];
			final int i_440_ = Rasterizer.sineTable[i_427_];
			final int i_441_ = Rasterizer.cosineTable[i_427_];
			final int i_442_ = i_429_ * i_440_ + i_430_ * i_441_ >> 16;
			for (int i_443_ = 0; i_443_ < this.anInt3793; i_443_++) {
				int i_444_ = this.xVertices[i_443_];
				int i_445_ = this.yVertices[i_443_];
				int i_446_ = this.zVertices[i_443_];
				if (i_426_ != 0) {
					final int i_447_ = i_445_ * i_438_ + i_444_ * i_439_ >> 16;
					i_445_ = i_445_ * i_439_ - i_444_ * i_438_ >> 16;
					i_444_ = i_447_;
				}
				if (i != 0) {
					final int i_448_ = i_445_ * i_435_ - i_446_ * i_434_ >> 16;
					i_446_ = i_445_ * i_434_ + i_446_ * i_435_ >> 16;
					i_445_ = i_448_;
				}
				if (i_425_ != 0) {
					final int i_449_ = i_446_ * i_436_ + i_444_ * i_437_ >> 16;
					i_446_ = i_446_ * i_437_ - i_444_ * i_436_ >> 16;
					i_444_ = i_449_;
				}
				i_444_ += i_428_;
				i_445_ += i_429_;
				i_446_ += i_430_;
				final int i_450_ = i_445_ * i_441_ - i_446_ * i_440_ >> 16;
				i_446_ = i_445_ * i_440_ + i_446_ * i_441_ >> 16;
				i_445_ = i_450_;
				anIntArray3836[i_443_] = i_446_ - i_442_;
				anIntArray3840[i_443_] = i_432_ + (i_444_ << 9) / i_431_;
				anIntArray3811[i_443_] = i_433_ + (i_445_ << 9) / i_431_;
				if (anInt3768 > 0) {
					anIntArray3827[i_443_] = i_444_;
					anIntArray3820[i_443_] = i_445_;
					anIntArray3829[i_443_] = i_446_;
				}
			}
			method2391(false, false, 0L, aShort3785, aShort3785 << 1, null);
		} catch (final RuntimeException runtimeexception) {
			/* empty */
		}
	}

	@Override
	final void method2382(final int i, final int[] is, int i_451_, int i_452_, int i_453_, final boolean bool, final int i_454_, final int[] is_455_) {
		final int i_456_ = is.length;
		if (i == 0) {
			int i_457_ = 0;
			anInt3822 = 0;
			anInt3841 = 0;
			anInt3816 = 0;
			for (int i_458_ = 0; i_458_ < i_456_; i_458_++) {
				final int i_459_ = is[i_458_];
				if (i_459_ < anIntArrayArray3786.length) {
					final int[] is_460_ = anIntArrayArray3786[i_459_];
					int[] is_462_;
					final int i_461_ = (is_462_ = is_460_).length;
					for (int i_463_ = 0; i_463_ < i_461_; i_463_++) {
						final int i_464_ = is_462_[i_463_];
						if (aShortArray3783 == null || (i_454_ & aShortArray3783[i_464_]) != 0) {
							anInt3822 += this.xVertices[i_464_];
							anInt3841 += this.yVertices[i_464_];
							anInt3816 += this.zVertices[i_464_];
							i_457_++;
						}
					}
				}
			}
			if (i_457_ > 0) {
				anInt3822 = anInt3822 / i_457_ + i_451_;
				anInt3841 = anInt3841 / i_457_ + i_452_;
				anInt3816 = anInt3816 / i_457_ + i_453_;
				aBoolean3835 = true;
			} else {
				anInt3822 = i_451_;
				anInt3841 = i_452_;
				anInt3816 = i_453_;
			}
		} else if (i == 1) {
			if (is_455_ != null) {
				final int i_465_ = is_455_[0] * i_451_ + is_455_[1] * i_452_ + is_455_[2] * i_453_ + 16384 >> 15;
				final int i_466_ = is_455_[3] * i_451_ + is_455_[4] * i_452_ + is_455_[5] * i_453_ + 16384 >> 15;
				final int i_467_ = is_455_[6] * i_451_ + is_455_[7] * i_452_ + is_455_[8] * i_453_ + 16384 >> 15;
				i_451_ = i_465_;
				i_452_ = i_466_;
				i_453_ = i_467_;
			}
			for (int i_468_ = 0; i_468_ < i_456_; i_468_++) {
				final int i_469_ = is[i_468_];
				if (i_469_ < anIntArrayArray3786.length) {
					final int[] is_470_ = anIntArrayArray3786[i_469_];
					int[] is_472_;
					final int i_471_ = (is_472_ = is_470_).length;
					for (int i_473_ = 0; i_473_ < i_471_; i_473_++) {
						final int i_474_ = is_472_[i_473_];
						final int i_475_ = i_474_;
						if (aShortArray3783 == null || (i_454_ & aShortArray3783[i_475_]) != 0) {
							this.xVertices[i_475_] += i_451_;
							this.yVertices[i_475_] += i_452_;
							this.zVertices[i_475_] += i_453_;
						}
					}
				}
			}
		} else if (i == 2) {
			if (is_455_ != null) {
				final int i_476_ = is_455_[9];
				final int i_477_ = is_455_[10];
				final int i_478_ = is_455_[11];
				final int i_479_ = is_455_[12];
				final int i_480_ = is_455_[13];
				final int i_481_ = is_455_[14];
				if (aBoolean3835) {
					int i_482_ = is_455_[0] * anInt3822 + is_455_[3] * anInt3841 + is_455_[6] * anInt3816 + 16384 >> 15;
					int i_483_ = is_455_[1] * anInt3822 + is_455_[4] * anInt3841 + is_455_[7] * anInt3816 + 16384 >> 15;
					int i_484_ = is_455_[2] * anInt3822 + is_455_[5] * anInt3841 + is_455_[8] * anInt3816 + 16384 >> 15;
					i_482_ += i_479_;
					i_483_ += i_480_;
					i_484_ += i_481_;
					anInt3822 = i_482_;
					anInt3841 = i_483_;
					anInt3816 = i_484_;
					aBoolean3835 = false;
				}
				final int[] is_485_ = new int[9];
				final int i_486_ = Rasterizer.cosineTable[i_451_] >> 1;
				final int i_487_ = Rasterizer.sineTable[i_451_] >> 1;
				final int i_488_ = Rasterizer.cosineTable[i_452_] >> 1;
				final int i_489_ = Rasterizer.sineTable[i_452_] >> 1;
				final int i_490_ = Rasterizer.cosineTable[i_453_] >> 1;
				final int i_491_ = Rasterizer.sineTable[i_453_] >> 1;
				final int i_492_ = i_487_ * i_490_ + 16384 >> 15;
				final int i_493_ = i_487_ * i_491_ + 16384 >> 15;
				is_485_[0] = i_488_ * i_490_ + i_489_ * i_493_ + 16384 >> 15;
				is_485_[1] = -i_488_ * i_491_ + i_489_ * i_492_ + 16384 >> 15;
				is_485_[2] = i_489_ * i_486_ + 16384 >> 15;
				is_485_[3] = i_486_ * i_491_ + 16384 >> 15;
				is_485_[4] = i_486_ * i_490_ + 16384 >> 15;
				is_485_[5] = -i_487_;
				is_485_[6] = -i_489_ * i_490_ + i_488_ * i_493_ + 16384 >> 15;
				is_485_[7] = i_489_ * i_491_ + i_488_ * i_492_ + 16384 >> 15;
				is_485_[8] = i_488_ * i_486_ + 16384 >> 15;
				final int i_494_ = is_485_[0] * -anInt3822 + is_485_[1] * -anInt3841 + is_485_[2] * -anInt3816 + 16384 >> 15;
				final int i_495_ = is_485_[3] * -anInt3822 + is_485_[4] * -anInt3841 + is_485_[5] * -anInt3816 + 16384 >> 15;
				final int i_496_ = is_485_[6] * -anInt3822 + is_485_[7] * -anInt3841 + is_485_[8] * -anInt3816 + 16384 >> 15;
				final int i_497_ = i_494_ + anInt3822;
				final int i_498_ = i_495_ + anInt3841;
				final int i_499_ = i_496_ + anInt3816;
				final int[] is_500_ = new int[9];
				for (int i_501_ = 0; i_501_ < 3; i_501_++) {
					for (int i_502_ = 0; i_502_ < 3; i_502_++) {
						int i_503_ = 0;
						for (int i_504_ = 0; i_504_ < 3; i_504_++) {
							i_503_ += is_485_[i_501_ * 3 + i_504_] * is_455_[i_502_ * 3 + i_504_];
						}
						is_500_[i_501_ * 3 + i_502_] = i_503_ + 16384 >> 15;
					}
				}
				int i_505_ = is_485_[0] * i_479_ + is_485_[1] * i_480_ + is_485_[2] * i_481_ + 16384 >> 15;
				int i_506_ = is_485_[3] * i_479_ + is_485_[4] * i_480_ + is_485_[5] * i_481_ + 16384 >> 15;
				int i_507_ = is_485_[6] * i_479_ + is_485_[7] * i_480_ + is_485_[8] * i_481_ + 16384 >> 15;
				i_505_ += i_497_;
				i_506_ += i_498_;
				i_507_ += i_499_;
				final int[] is_508_ = new int[9];
				for (int i_509_ = 0; i_509_ < 3; i_509_++) {
					for (int i_510_ = 0; i_510_ < 3; i_510_++) {
						int i_511_ = 0;
						for (int i_512_ = 0; i_512_ < 3; i_512_++) {
							i_511_ += is_455_[i_509_ * 3 + i_512_] * is_500_[i_510_ + i_512_ * 3];
						}
						is_508_[i_509_ * 3 + i_510_] = i_511_ + 16384 >> 15;
					}
				}
				int i_513_ = is_455_[0] * i_505_ + is_455_[1] * i_506_ + is_455_[2] * i_507_ + 16384 >> 15;
				int i_514_ = is_455_[3] * i_505_ + is_455_[4] * i_506_ + is_455_[5] * i_507_ + 16384 >> 15;
				int i_515_ = is_455_[6] * i_505_ + is_455_[7] * i_506_ + is_455_[8] * i_507_ + 16384 >> 15;
				i_513_ += i_476_;
				i_514_ += i_477_;
				i_515_ += i_478_;
				for (int i_516_ = 0; i_516_ < i_456_; i_516_++) {
					final int i_517_ = is[i_516_];
					if (i_517_ < anIntArrayArray3786.length) {
						final int[] is_518_ = anIntArrayArray3786[i_517_];
						int[] is_520_;
						final int i_519_ = (is_520_ = is_518_).length;
						for (int i_521_ = 0; i_521_ < i_519_; i_521_++) {
							final int i_522_ = is_520_[i_521_];
							final int i_523_ = i_522_;
							if (aShortArray3783 == null || (i_454_ & aShortArray3783[i_523_]) != 0) {
								int i_524_ = is_508_[0] * this.xVertices[i_523_] + is_508_[1] * this.yVertices[i_523_] + is_508_[2] * this.zVertices[i_523_] + 16384 >> 15;
								int i_525_ = is_508_[3] * this.xVertices[i_523_] + is_508_[4] * this.yVertices[i_523_] + is_508_[5] * this.zVertices[i_523_] + 16384 >> 15;
								int i_526_ = is_508_[6] * this.xVertices[i_523_] + is_508_[7] * this.yVertices[i_523_] + is_508_[8] * this.zVertices[i_523_] + 16384 >> 15;
								i_524_ += i_513_;
								i_525_ += i_514_;
								i_526_ += i_515_;
								this.xVertices[i_523_] = i_524_;
								this.yVertices[i_523_] = i_525_;
								this.zVertices[i_523_] = i_526_;
							}
						}
					}
				}
			} else {
				for (int i_527_ = 0; i_527_ < i_456_; i_527_++) {
					final int i_528_ = is[i_527_];
					if (i_528_ < anIntArrayArray3786.length) {
						final int[] is_529_ = anIntArrayArray3786[i_528_];
						int[] is_531_;
						final int i_530_ = (is_531_ = is_529_).length;
						for (int i_532_ = 0; i_532_ < i_530_; i_532_++) {
							final int i_533_ = is_531_[i_532_];
							final int i_534_ = i_533_;
							if (aShortArray3783 == null || (i_454_ & aShortArray3783[i_534_]) != 0) {
								this.xVertices[i_534_] -= anInt3822;
								this.yVertices[i_534_] -= anInt3841;
								this.zVertices[i_534_] -= anInt3816;
								if (i_453_ != 0) {
									final int i_535_ = Rasterizer.sineTable[i_453_];
									final int i_536_ = Rasterizer.cosineTable[i_453_];
									final int i_537_ = this.yVertices[i_534_] * i_535_ + this.xVertices[i_534_] * i_536_ + 32767 >> 16;
									this.yVertices[i_534_] = this.yVertices[i_534_] * i_536_ - this.xVertices[i_534_] * i_535_ + 32767 >> 16;
									this.xVertices[i_534_] = i_537_;
								}
								if (i_451_ != 0) {
									final int i_538_ = Rasterizer.sineTable[i_451_];
									final int i_539_ = Rasterizer.cosineTable[i_451_];
									final int i_540_ = this.yVertices[i_534_] * i_539_ - this.zVertices[i_534_] * i_538_ + 32767 >> 16;
									this.zVertices[i_534_] = this.yVertices[i_534_] * i_538_ + this.zVertices[i_534_] * i_539_ + 32767 >> 16;
									this.yVertices[i_534_] = i_540_;
								}
								if (i_452_ != 0) {
									final int i_541_ = Rasterizer.sineTable[i_452_];
									final int i_542_ = Rasterizer.cosineTable[i_452_];
									final int i_543_ = this.zVertices[i_534_] * i_541_ + this.xVertices[i_534_] * i_542_ + 32767 >> 16;
									this.zVertices[i_534_] = this.zVertices[i_534_] * i_542_ - this.xVertices[i_534_] * i_541_ + 32767 >> 16;
									this.xVertices[i_534_] = i_543_;
								}
								this.xVertices[i_534_] += anInt3822;
								this.yVertices[i_534_] += anInt3841;
								this.zVertices[i_534_] += anInt3816;
							}
						}
					}
				}
			}
		} else if (i == 3) {
			if (is_455_ != null) {
				final int i_544_ = is_455_[9];
				final int i_545_ = is_455_[10];
				final int i_546_ = is_455_[11];
				final int i_547_ = is_455_[12];
				final int i_548_ = is_455_[13];
				final int i_549_ = is_455_[14];
				if (aBoolean3835) {
					int i_550_ = is_455_[0] * anInt3822 + is_455_[3] * anInt3841 + is_455_[6] * anInt3816 + 16384 >> 15;
					int i_551_ = is_455_[1] * anInt3822 + is_455_[4] * anInt3841 + is_455_[7] * anInt3816 + 16384 >> 15;
					int i_552_ = is_455_[2] * anInt3822 + is_455_[5] * anInt3841 + is_455_[8] * anInt3816 + 16384 >> 15;
					i_550_ += i_547_;
					i_551_ += i_548_;
					i_552_ += i_549_;
					anInt3822 = i_550_;
					anInt3841 = i_551_;
					anInt3816 = i_552_;
					aBoolean3835 = false;
				}
				final int i_553_ = i_451_ << 15 >> 7;
				final int i_554_ = i_452_ << 15 >> 7;
				final int i_555_ = i_453_ << 15 >> 7;
				final int i_556_ = i_553_ * -anInt3822 + 16384 >> 15;
				final int i_557_ = i_554_ * -anInt3841 + 16384 >> 15;
				final int i_558_ = i_555_ * -anInt3816 + 16384 >> 15;
				final int i_559_ = i_556_ + anInt3822;
				final int i_560_ = i_557_ + anInt3841;
				final int i_561_ = i_558_ + anInt3816;
				final int[] is_562_ = new int[9];
				is_562_[0] = i_553_ * is_455_[0] + 16384 >> 15;
				is_562_[1] = i_553_ * is_455_[3] + 16384 >> 15;
				is_562_[2] = i_553_ * is_455_[6] + 16384 >> 15;
				is_562_[3] = i_554_ * is_455_[1] + 16384 >> 15;
				is_562_[4] = i_554_ * is_455_[4] + 16384 >> 15;
				is_562_[5] = i_554_ * is_455_[7] + 16384 >> 15;
				is_562_[6] = i_555_ * is_455_[2] + 16384 >> 15;
				is_562_[7] = i_555_ * is_455_[5] + 16384 >> 15;
				is_562_[8] = i_555_ * is_455_[8] + 16384 >> 15;
				int i_563_ = i_553_ * i_547_ + 16384 >> 15;
				int i_564_ = i_554_ * i_548_ + 16384 >> 15;
				int i_565_ = i_555_ * i_549_ + 16384 >> 15;
				i_563_ += i_559_;
				i_564_ += i_560_;
				i_565_ += i_561_;
				final int[] is_566_ = new int[9];
				for (int i_567_ = 0; i_567_ < 3; i_567_++) {
					for (int i_568_ = 0; i_568_ < 3; i_568_++) {
						int i_569_ = 0;
						for (int i_570_ = 0; i_570_ < 3; i_570_++) {
							i_569_ += is_455_[i_567_ * 3 + i_570_] * is_562_[i_568_ + i_570_ * 3];
						}
						is_566_[i_567_ * 3 + i_568_] = i_569_ + 16384 >> 15;
					}
				}
				int i_571_ = is_455_[0] * i_563_ + is_455_[1] * i_564_ + is_455_[2] * i_565_ + 16384 >> 15;
				int i_572_ = is_455_[3] * i_563_ + is_455_[4] * i_564_ + is_455_[5] * i_565_ + 16384 >> 15;
				int i_573_ = is_455_[6] * i_563_ + is_455_[7] * i_564_ + is_455_[8] * i_565_ + 16384 >> 15;
				i_571_ += i_544_;
				i_572_ += i_545_;
				i_573_ += i_546_;
				for (int i_574_ = 0; i_574_ < i_456_; i_574_++) {
					final int i_575_ = is[i_574_];
					if (i_575_ < anIntArrayArray3786.length) {
						final int[] is_576_ = anIntArrayArray3786[i_575_];
						int[] is_578_;
						final int i_577_ = (is_578_ = is_576_).length;
						for (int i_579_ = 0; i_579_ < i_577_; i_579_++) {
							final int i_580_ = is_578_[i_579_];
							final int i_581_ = i_580_;
							if (aShortArray3783 == null || (i_454_ & aShortArray3783[i_581_]) != 0) {
								int i_582_ = is_566_[0] * this.xVertices[i_581_] + is_566_[1] * this.yVertices[i_581_] + is_566_[2] * this.zVertices[i_581_] + 16384 >> 15;
								int i_583_ = is_566_[3] * this.xVertices[i_581_] + is_566_[4] * this.yVertices[i_581_] + is_566_[5] * this.zVertices[i_581_] + 16384 >> 15;
								int i_584_ = is_566_[6] * this.xVertices[i_581_] + is_566_[7] * this.yVertices[i_581_] + is_566_[8] * this.zVertices[i_581_] + 16384 >> 15;
								i_582_ += i_571_;
								i_583_ += i_572_;
								i_584_ += i_573_;
								this.xVertices[i_581_] = i_582_;
								this.yVertices[i_581_] = i_583_;
								this.zVertices[i_581_] = i_584_;
							}
						}
					}
				}
			} else {
				for (int i_585_ = 0; i_585_ < i_456_; i_585_++) {
					final int i_586_ = is[i_585_];
					if (i_586_ < anIntArrayArray3786.length) {
						final int[] is_587_ = anIntArrayArray3786[i_586_];
						int[] is_589_;
						final int i_588_ = (is_589_ = is_587_).length;
						for (int i_590_ = 0; i_590_ < i_588_; i_590_++) {
							final int i_591_ = is_589_[i_590_];
							final int i_592_ = i_591_;
							if (aShortArray3783 == null || (i_454_ & aShortArray3783[i_592_]) != 0) {
								this.xVertices[i_592_] -= anInt3822;
								this.yVertices[i_592_] -= anInt3841;
								this.zVertices[i_592_] -= anInt3816;
								this.xVertices[i_592_] = this.xVertices[i_592_] * i_451_ / 128;
								this.yVertices[i_592_] = this.yVertices[i_592_] * i_452_ / 128;
								this.zVertices[i_592_] = this.zVertices[i_592_] * i_453_ / 128;
								this.xVertices[i_592_] += anInt3822;
								this.yVertices[i_592_] += anInt3841;
								this.zVertices[i_592_] += anInt3816;
							}
						}
					}
				}
			}
		} else if (i == 5) {
			if (anIntArrayArray3795 != null && trianglesAlpha != null) {
				for (int i_593_ = 0; i_593_ < i_456_; i_593_++) {
					final int i_594_ = is[i_593_];
					if (i_594_ < anIntArrayArray3795.length) {
						final int[] is_595_ = anIntArrayArray3795[i_594_];
						int[] is_597_;
						final int i_596_ = (is_597_ = is_595_).length;
						for (int i_598_ = 0; i_598_ < i_596_; i_598_++) {
							final int i_599_ = is_597_[i_598_];
							final int i_600_ = i_599_;
							if (aShortArray3761 == null || (i_454_ & aShortArray3761[i_600_]) != 0) {
								int i_601_ = (trianglesAlpha[i_600_] & 0xff) + i_451_ * 8;
								if (i_601_ < 0) {
									i_601_ = 0;
								} else if (i_601_ > 255) {
									i_601_ = 255;
								}
								trianglesAlpha[i_600_] = (byte) i_601_;
							}
						}
					}
				}
			}
		} else if (i == 7 && anIntArrayArray3795 != null) {
			for (int i_602_ = 0; i_602_ < i_456_; i_602_++) {
				final int i_603_ = is[i_602_];
				if (i_603_ < anIntArrayArray3795.length) {
					final int[] is_604_ = anIntArrayArray3795[i_603_];
					int[] is_606_;
					final int i_605_ = (is_606_ = is_604_).length;
					for (int i_607_ = 0; i_607_ < i_605_; i_607_++) {
						final int i_608_ = is_606_[i_607_];
						final int i_609_ = i_608_;
						if (aShortArray3761 == null || (i_454_ & aShortArray3761[i_609_]) != 0) {
							final int i_610_ = aShortArray3777[i_609_] & 0xffff;
							int i_611_ = i_610_ >> 10 & 0x3f;
							int i_612_ = i_610_ >> 7 & 0x7;
							int i_613_ = i_610_ & 0x7f;
							i_611_ = i_611_ + i_451_ & 0x3f;
							i_612_ += i_452_;
							if (i_612_ < 0) {
								i_612_ = 0;
							} else if (i_612_ > 7) {
								i_612_ = 7;
							}
							i_613_ += i_453_;
							if (i_613_ < 0) {
								i_613_ = 0;
							} else if (i_613_ > 127) {
								i_613_ = 127;
							}
							aShortArray3777[i_609_] = (short) (i_611_ << 10 | i_612_ << 7 | i_613_);
						}
					}
					aBoolean3774 = true;
				}
			}
		}
	}

	@Override
	final int method2386() {
		if (!this.boundsCalculated) {
			calculateBounds();
		}
		return maxZ;
	}

	static final int method2401(final int i, int i_614_) {
		i_614_ = i_614_ * (i & 0x7f) >> 7;
		if (i_614_ < 2) {
			i_614_ = 2;
		} else if (i_614_ > 126) {
			i_614_ = 126;
		}
		return (i & 0xff80) + i_614_;
	}

	private final void method2402() {
		for (int i = 0; i < anInt3792; i++) {
			final short i_615_ = aShortArray3760 != null ? aShortArray3760[i] : (short) -1;
			if (i_615_ == -1) {
				final int i_616_ = aShortArray3777[i] & 0xffff;
				if (anIntArray3769[i] == -1) {
					final int i_617_ = anIntArray3779[i] & ~0x1ffff;
					anIntArray3779[i] = i_617_ | method2401(i_616_, i_617_ >> 17);
				} else if (anIntArray3769[i] != -2) {
					int i_618_ = anIntArray3779[i] & ~0x1ffff;
					anIntArray3779[i] = i_618_ | method2401(i_616_, i_618_ >> 17);
					i_618_ = anIntArray3780[i] & ~0x1ffff;
					anIntArray3780[i] = i_618_ | method2401(i_616_, i_618_ >> 17);
					i_618_ = anIntArray3769[i] & ~0x1ffff;
					anIntArray3769[i] = i_618_ | method2401(i_616_, i_618_ >> 17);
				}
			}
		}
	}

	@Override
	final void method2379(final int i, final int i_619_, final int i_620_, final int i_621_) {
		if (i == 0) {
			int i_622_ = 0;
			anInt3822 = 0;
			anInt3841 = 0;
			anInt3816 = 0;
			for (int i_623_ = 0; i_623_ < this.anInt3793; i_623_++) {
				anInt3822 += this.xVertices[i_623_];
				anInt3841 += this.yVertices[i_623_];
				anInt3816 += this.zVertices[i_623_];
				i_622_++;
			}
			if (i_622_ > 0) {
				anInt3822 = anInt3822 / i_622_ + i_619_;
				anInt3841 = anInt3841 / i_622_ + i_620_;
				anInt3816 = anInt3816 / i_622_ + i_621_;
			} else {
				anInt3822 = i_619_;
				anInt3841 = i_620_;
				anInt3816 = i_621_;
			}
		} else if (i == 1) {
			for (int i_624_ = 0; i_624_ < this.anInt3793; i_624_++) {
				this.xVertices[i_624_] += i_619_;
				this.yVertices[i_624_] += i_620_;
				this.zVertices[i_624_] += i_621_;
			}
		} else if (i == 2) {
			for (int i_625_ = 0; i_625_ < this.anInt3793; i_625_++) {
				this.xVertices[i_625_] -= anInt3822;
				this.yVertices[i_625_] -= anInt3841;
				this.zVertices[i_625_] -= anInt3816;
				if (i_621_ != 0) {
					final int i_626_ = Rasterizer.sineTable[i_621_];
					final int i_627_ = Rasterizer.cosineTable[i_621_];
					final int i_628_ = this.yVertices[i_625_] * i_626_ + this.xVertices[i_625_] * i_627_ + 32767 >> 16;
					this.yVertices[i_625_] = this.yVertices[i_625_] * i_627_ - this.xVertices[i_625_] * i_626_ + 32767 >> 16;
					this.xVertices[i_625_] = i_628_;
				}
				if (i_619_ != 0) {
					final int i_629_ = Rasterizer.sineTable[i_619_];
					final int i_630_ = Rasterizer.cosineTable[i_619_];
					final int i_631_ = this.yVertices[i_625_] * i_630_ - this.zVertices[i_625_] * i_629_ + 32767 >> 16;
					this.zVertices[i_625_] = this.yVertices[i_625_] * i_629_ + this.zVertices[i_625_] * i_630_ + 32767 >> 16;
					this.yVertices[i_625_] = i_631_;
				}
				if (i_620_ != 0) {
					final int i_632_ = Rasterizer.sineTable[i_620_];
					final int i_633_ = Rasterizer.cosineTable[i_620_];
					final int i_634_ = this.zVertices[i_625_] * i_632_ + this.xVertices[i_625_] * i_633_ + 32767 >> 16;
					this.zVertices[i_625_] = this.zVertices[i_625_] * i_633_ - this.xVertices[i_625_] * i_632_ + 32767 >> 16;
					this.xVertices[i_625_] = i_634_;
				}
				this.xVertices[i_625_] += anInt3822;
				this.yVertices[i_625_] += anInt3841;
				this.zVertices[i_625_] += anInt3816;
			}
		} else if (i == 3) {
			for (int i_635_ = 0; i_635_ < this.anInt3793; i_635_++) {
				this.xVertices[i_635_] -= anInt3822;
				this.yVertices[i_635_] -= anInt3841;
				this.zVertices[i_635_] -= anInt3816;
				this.xVertices[i_635_] = this.xVertices[i_635_] * i_619_ / 128;
				this.yVertices[i_635_] = this.yVertices[i_635_] * i_620_ / 128;
				this.zVertices[i_635_] = this.zVertices[i_635_] * i_621_ / 128;
				this.xVertices[i_635_] += anInt3822;
				this.yVertices[i_635_] += anInt3841;
				this.zVertices[i_635_] += anInt3816;
			}
		} else if (i == 5) {
			for (int i_636_ = 0; i_636_ < anInt3792; i_636_++) {
				int i_637_ = (trianglesAlpha[i_636_] & 0xff) + i_619_ * 8;
				if (i_637_ < 0) {
					i_637_ = 0;
				} else if (i_637_ > 255) {
					i_637_ = 255;
				}
				trianglesAlpha[i_636_] = (byte) i_637_;
			}
		} else if (i == 7) {
			for (int i_638_ = 0; i_638_ < anInt3792; i_638_++) {
				final int i_639_ = aShortArray3777[i_638_] & 0xffff;
				int i_640_ = i_639_ >> 10 & 0x3f;
				int i_641_ = i_639_ >> 7 & 0x7;
				int i_642_ = i_639_ & 0x7f;
				i_640_ = i_640_ + i_619_ & 0x3f;
				i_641_ += i_620_;
				if (i_641_ < 0) {
					i_641_ = 0;
				} else if (i_641_ > 7) {
					i_641_ = 7;
				}
				i_642_ += i_621_;
				if (i_642_ < 0) {
					i_642_ = 0;
				} else if (i_642_ > 127) {
					i_642_ = 127;
				}
				aShortArray3777[i_638_] = (short) (i_640_ << 10 | i_641_ << 7 | i_642_);
			}
			aBoolean3774 = true;
		}
	}

	private static final int method2403(int i) {
		if (i < 2) {
			i = 2;
		} else if (i > 126) {
			i = 126;
		}
		return i;
	}

	static final void method2404() {
		aBoolean3833 = true;
		anIntArray3826 = new int[4096];
		anIntArray3810 = new int[4096];
		anIntArray3832 = null;
		anIntArrayArray3813 = null;
		anIntArray3815 = null;
		anIntArrayArray3809 = null;
	}

	public LDModel() {
		this.boundsCalculated = false;
		anInt3792 = 0;
		vertexCount = 0;
		this.anInt3793 = 0;
	}

	LDModel(final Class180_Sub2 class180_sub2, final int i, final int i_643_, final int i_644_, final int i_645_, final int i_646_) {
		this.boundsCalculated = false;
		anInt3792 = 0;
		vertexCount = 0;
		this.anInt3793 = 0;
		class180_sub2.method2303();
		class180_sub2.createLabels();
		this.anInt3793 = class180_sub2.vertexCount;
		vertexCount = class180_sub2.anInt2886;
		this.xVertices = class180_sub2.xVertices;
		this.yVertices = class180_sub2.yVertices;
		this.zVertices = class180_sub2.zVertices;
		anInt3792 = class180_sub2.triangleCount;
		trianglesA = class180_sub2.trianglesA;
		trianglesB = class180_sub2.trianglesB;
		trianglesC = class180_sub2.trianglesC;
		aByteArray3762 = class180_sub2.aByteArray2879;
		trianglesAlpha = class180_sub2.aByteArray2864;
		aByte3756 = class180_sub2.aByte2899;
		aShortArray3777 = class180_sub2.triangleColors;
		anIntArrayArray3786 = class180_sub2.vertexLabels;
		anIntArrayArray3795 = class180_sub2.triangleLabels;
		aShortArray3761 = class180_sub2.aShortArray2867;
		this.aClass158Array3788 = class180_sub2.aClass158Array2871;
		this.aClass169Array3776 = class180_sub2.aClass169Array2887;
		aShortArray3783 = class180_sub2.aShortArray2852;
		final int i_647_ = (int) Math.sqrt(i_644_ * i_644_ + i_645_ * i_645_ + i_646_ * i_646_);
		final int i_648_ = i_643_ * i_647_ >> 8;
		anIntArray3779 = new int[anInt3792];
		anIntArray3780 = new int[anInt3792];
		anIntArray3769 = new int[anInt3792];
		if (class180_sub2.aShortArray2850 != null) {
			aShortArray3760 = new short[anInt3792];
			for (int i_649_ = 0; i_649_ < anInt3792; i_649_++) {
				final short i_650_ = class180_sub2.aShortArray2850[i_649_];
				if (i_650_ != -1 && Rasterizer.anInterface5_973.method15(i_650_)) {
					aShortArray3760[i_649_] = i_650_;
				} else {
					aShortArray3760[i_649_] = (short) -1;
				}
			}
		} else {
			aShortArray3760 = null;
		}
		if (class180_sub2.anInt2855 > 0 && class180_sub2.aByteArray2876 != null) {
			final int[] is = new int[class180_sub2.anInt2855];
			for (int i_651_ = 0; i_651_ < anInt3792; i_651_++) {
				if (class180_sub2.aByteArray2876[i_651_] != -1) {
					is[class180_sub2.aByteArray2876[i_651_] & 0xff]++;
				}
			}
			anInt3768 = 0;
			for (int i_652_ = 0; i_652_ < class180_sub2.anInt2855; i_652_++) {
				if (is[i_652_] > 0 && class180_sub2.texTrianglesType[i_652_] == 0) {
					anInt3768++;
				}
			}
			anIntArray3791 = new int[anInt3768];
			anIntArray3797 = new int[anInt3768];
			anIntArray3766 = new int[anInt3768];
			int i_653_ = 0;
			for (int i_654_ = 0; i_654_ < class180_sub2.anInt2855; i_654_++) {
				if (is[i_654_] > 0 && class180_sub2.texTrianglesType[i_654_] == 0) {
					anIntArray3791[i_653_] = class180_sub2.texTrianglesA[i_654_] & 0xffff;
					anIntArray3797[i_653_] = class180_sub2.texTrianglesB[i_654_] & 0xffff;
					anIntArray3766[i_653_] = class180_sub2.texTrianglesC[i_654_] & 0xffff;
					is[i_654_] = i_653_++;
				} else {
					is[i_654_] = -1;
				}
			}
			aByteArray3770 = new byte[anInt3792];
			for (int i_655_ = 0; i_655_ < anInt3792; i_655_++) {
				if (class180_sub2.aByteArray2876[i_655_] != -1) {
					aByteArray3770[i_655_] = (byte) is[class180_sub2.aByteArray2876[i_655_] & 0xff];
					if (aByteArray3770[i_655_] == -1 && aShortArray3760 != null) {
						aShortArray3760[i_655_] = (short) -1;
					}
				} else {
					aByteArray3770[i_655_] = (byte) -1;
				}
			}
		}
		for (int i_656_ = 0; i_656_ < anInt3792; i_656_++) {
			byte i_657_;
			if (class180_sub2.aByteArray2895 == null) {
				i_657_ = (byte) 0;
			} else {
				i_657_ = class180_sub2.aByteArray2895[i_656_];
			}
			byte i_658_;
			if (class180_sub2.aByteArray2864 == null) {
				i_658_ = (byte) 0;
			} else {
				i_658_ = class180_sub2.aByteArray2864[i_656_];
			}
			short i_659_;
			if (aShortArray3760 == null) {
				i_659_ = (short) -1;
			} else {
				i_659_ = aShortArray3760[i_656_];
			}
			if (i_658_ == -2) {
				i_657_ = (byte) 3;
			}
			if (i_658_ == -1) {
				i_657_ = (byte) 2;
			}
			if (i_659_ == -1) {
				if (i_657_ == 0) {
					final int i_660_ = class180_sub2.triangleColors[i_656_] & 0xffff;
					Class26 class26;
					if (class180_sub2.aClass26Array2893 != null && class180_sub2.aClass26Array2893[trianglesA[i_656_]] != null) {
						class26 = class180_sub2.aClass26Array2893[trianglesA[i_656_]];
					} else {
						class26 = class180_sub2.aClass26Array2878[trianglesA[i_656_]];
					}
					int i_661_ = i + (i_644_ * class26.anInt157 + i_645_ * class26.anInt155 + i_646_ * class26.anInt160) / (i_648_ * class26.anInt156) << 17;
					anIntArray3779[i_656_] = i_661_ | method2401(i_660_, i_661_ >> 17);
					if (class180_sub2.aClass26Array2893 != null && class180_sub2.aClass26Array2893[trianglesB[i_656_]] != null) {
						class26 = class180_sub2.aClass26Array2893[trianglesB[i_656_]];
					} else {
						class26 = class180_sub2.aClass26Array2878[trianglesB[i_656_]];
					}
					i_661_ = i + (i_644_ * class26.anInt157 + i_645_ * class26.anInt155 + i_646_ * class26.anInt160) / (i_648_ * class26.anInt156) << 17;
					anIntArray3780[i_656_] = i_661_ | method2401(i_660_, i_661_ >> 17);
					if (class180_sub2.aClass26Array2893 != null && class180_sub2.aClass26Array2893[trianglesC[i_656_]] != null) {
						class26 = class180_sub2.aClass26Array2893[trianglesC[i_656_]];
					} else {
						class26 = class180_sub2.aClass26Array2878[trianglesC[i_656_]];
					}
					i_661_ = i + (i_644_ * class26.anInt157 + i_645_ * class26.anInt155 + i_646_ * class26.anInt160) / (i_648_ * class26.anInt156) << 17;
					anIntArray3769[i_656_] = i_661_ | method2401(i_660_, i_661_ >> 17);
				} else if (i_657_ == 1) {
					final Class115 class115 = class180_sub2.aClass115Array2880[i_656_];
					final int i_662_ = i + (i_644_ * class115.anInt1111 + i_645_ * class115.anInt1109 + i_646_ * class115.anInt1112) / (i_648_ + i_648_ / 2) << 17;
					anIntArray3779[i_656_] = i_662_ | method2401(class180_sub2.triangleColors[i_656_] & 0xffff, i_662_ >> 17);
					anIntArray3769[i_656_] = -1;
				} else if (i_657_ == 3) {
					anIntArray3779[i_656_] = 128;
					anIntArray3769[i_656_] = -1;
				} else {
					anIntArray3769[i_656_] = -2;
				}
			} else if (i_657_ == 0) {
				Class26 class26;
				if (class180_sub2.aClass26Array2893 != null && class180_sub2.aClass26Array2893[trianglesA[i_656_]] != null) {
					class26 = class180_sub2.aClass26Array2893[trianglesA[i_656_]];
				} else {
					class26 = class180_sub2.aClass26Array2878[trianglesA[i_656_]];
				}
				int i_663_ = i + (i_644_ * class26.anInt157 + i_645_ * class26.anInt155 + i_646_ * class26.anInt160) / (i_648_ * class26.anInt156);
				anIntArray3779[i_656_] = method2403(i_663_);
				if (class180_sub2.aClass26Array2893 != null && class180_sub2.aClass26Array2893[trianglesB[i_656_]] != null) {
					class26 = class180_sub2.aClass26Array2893[trianglesB[i_656_]];
				} else {
					class26 = class180_sub2.aClass26Array2878[trianglesB[i_656_]];
				}
				i_663_ = i + (i_644_ * class26.anInt157 + i_645_ * class26.anInt155 + i_646_ * class26.anInt160) / (i_648_ * class26.anInt156);
				anIntArray3780[i_656_] = method2403(i_663_);
				if (class180_sub2.aClass26Array2893 != null && class180_sub2.aClass26Array2893[trianglesC[i_656_]] != null) {
					class26 = class180_sub2.aClass26Array2893[trianglesC[i_656_]];
				} else {
					class26 = class180_sub2.aClass26Array2878[trianglesC[i_656_]];
				}
				i_663_ = i + (i_644_ * class26.anInt157 + i_645_ * class26.anInt155 + i_646_ * class26.anInt160) / (i_648_ * class26.anInt156);
				anIntArray3769[i_656_] = method2403(i_663_);
			} else if (i_657_ == 1) {
				final Class115 class115 = class180_sub2.aClass115Array2880[i_656_];
				final int i_664_ = i + (i_644_ * class115.anInt1111 + i_645_ * class115.anInt1109 + i_646_ * class115.anInt1112) / (i_648_ + i_648_ / 2);
				anIntArray3779[i_656_] = method2403(i_664_);
				anIntArray3769[i_656_] = -1;
			} else {
				anIntArray3769[i_656_] = -2;
			}
		}
	}

	private LDModel(final LDModel[] class180_sub7_sub1s, final int i) {
		this.boundsCalculated = false;
		anInt3792 = 0;
		vertexCount = 0;
		this.anInt3793 = 0;
		boolean bool = false;
		boolean bool_665_ = false;
		boolean bool_666_ = false;
		boolean bool_667_ = false;
		this.anInt3793 = 0;
		anInt3792 = 0;
		anInt3768 = 0;
		int i_668_ = 0;
		int i_669_ = 0;
		aByte3756 = (byte) -1;
		for (int i_670_ = 0; i_670_ < i; i_670_++) {
			final LDModel class180_sub7_sub1_671_ = class180_sub7_sub1s[i_670_];
			if (class180_sub7_sub1_671_ != null) {
				this.anInt3793 += class180_sub7_sub1_671_.anInt3793;
				anInt3792 += class180_sub7_sub1_671_.anInt3792;
				anInt3768 += class180_sub7_sub1_671_.anInt3768;
				if (class180_sub7_sub1_671_.aByteArray3762 != null) {
					bool = true;
				} else {
					if (aByte3756 == -1) {
						aByte3756 = class180_sub7_sub1_671_.aByte3756;
					}
					if (aByte3756 != class180_sub7_sub1_671_.aByte3756) {
						bool = true;
					}
				}
				bool_665_ = bool_665_ | class180_sub7_sub1_671_.trianglesAlpha != null;
				bool_666_ = bool_666_ | class180_sub7_sub1_671_.aShortArray3760 != null;
				bool_667_ = bool_667_ | class180_sub7_sub1_671_.aByteArray3770 != null;
				if (class180_sub7_sub1_671_.aClass158Array3788 != null) {
					i_668_ += class180_sub7_sub1_671_.aClass158Array3788.length;
				}
				if (class180_sub7_sub1_671_.aClass169Array3776 != null) {
					i_669_ += class180_sub7_sub1_671_.aClass169Array3776.length;
				}
			}
		}
		this.xVertices = new int[this.anInt3793];
		this.yVertices = new int[this.anInt3793];
		this.zVertices = new int[this.anInt3793];
		trianglesA = new int[anInt3792];
		trianglesB = new int[anInt3792];
		trianglesC = new int[anInt3792];
		anIntArray3779 = new int[anInt3792];
		anIntArray3780 = new int[anInt3792];
		anIntArray3769 = new int[anInt3792];
		if (bool) {
			aByteArray3762 = new byte[anInt3792];
		}
		if (bool_665_) {
			trianglesAlpha = new byte[anInt3792];
		}
		if (bool_666_) {
			aShortArray3760 = new short[anInt3792];
		}
		if (bool_667_) {
			aByteArray3770 = new byte[anInt3792];
		}
		if (anInt3768 > 0) {
			anIntArray3791 = new int[anInt3768];
			anIntArray3797 = new int[anInt3768];
			anIntArray3766 = new int[anInt3768];
		}
		if (i_668_ > 0) {
			this.aClass158Array3788 = new ModelParticle[i_668_];
		}
		if (i_669_ > 0) {
			this.aClass169Array3776 = new Class169[i_669_];
		}
		aShortArray3777 = new short[anInt3792];
		this.anInt3793 = 0;
		anInt3792 = 0;
		anInt3768 = 0;
		i_669_ = 0;
		i_668_ = 0;
		for (int i_672_ = 0; i_672_ < i; i_672_++) {
			final LDModel class180_sub7_sub1_673_ = class180_sub7_sub1s[i_672_];
			if (class180_sub7_sub1_673_ != null) {
				for (int i_674_ = 0; i_674_ < class180_sub7_sub1_673_.anInt3792; i_674_++) {
					trianglesA[anInt3792] = class180_sub7_sub1_673_.trianglesA[i_674_] + this.anInt3793;
					trianglesB[anInt3792] = class180_sub7_sub1_673_.trianglesB[i_674_] + this.anInt3793;
					trianglesC[anInt3792] = class180_sub7_sub1_673_.trianglesC[i_674_] + this.anInt3793;
					anIntArray3779[anInt3792] = class180_sub7_sub1_673_.anIntArray3779[i_674_];
					anIntArray3780[anInt3792] = class180_sub7_sub1_673_.anIntArray3780[i_674_];
					anIntArray3769[anInt3792] = class180_sub7_sub1_673_.anIntArray3769[i_674_];
					aShortArray3777[anInt3792] = class180_sub7_sub1_673_.aShortArray3777[i_674_];
					if (bool) {
						if (class180_sub7_sub1_673_.aByteArray3762 != null) {
							aByteArray3762[anInt3792] = class180_sub7_sub1_673_.aByteArray3762[i_674_];
						} else {
							aByteArray3762[anInt3792] = class180_sub7_sub1_673_.aByte3756;
						}
					}
					if (bool_665_ && class180_sub7_sub1_673_.trianglesAlpha != null) {
						trianglesAlpha[anInt3792] = class180_sub7_sub1_673_.trianglesAlpha[i_674_];
					}
					if (bool_666_) {
						if (class180_sub7_sub1_673_.aShortArray3760 != null) {
							aShortArray3760[anInt3792] = class180_sub7_sub1_673_.aShortArray3760[i_674_];
						} else {
							aShortArray3760[anInt3792] = (short) -1;
						}
					}
					if (bool_667_) {
						aByteArray3770[anInt3792] = (byte) (class180_sub7_sub1_673_.aByteArray3770 != null && class180_sub7_sub1_673_.aByteArray3770[i_674_] != -1 ? class180_sub7_sub1_673_.aByteArray3770[i_674_] + anInt3768 : -1);
					}
					anInt3792++;
				}
				if (class180_sub7_sub1_673_.aClass158Array3788 != null) {
					for (int i_675_ = 0; i_675_ < class180_sub7_sub1_673_.aClass158Array3788.length; i_675_++) {
						this.aClass158Array3788[i_668_] = new ModelParticle(class180_sub7_sub1_673_.aClass158Array3788[i_675_].particleType, class180_sub7_sub1_673_.aClass158Array3788[i_675_].anInt1485 + this.anInt3793, class180_sub7_sub1_673_.aClass158Array3788[i_675_].anInt1484 + this.anInt3793,
								class180_sub7_sub1_673_.aClass158Array3788[i_675_].anInt1476 + this.anInt3793);
						i_668_++;
					}
				}
				if (class180_sub7_sub1_673_.aClass169Array3776 != null) {
					for (int i_676_ = 0; i_676_ < class180_sub7_sub1_673_.aClass169Array3776.length; i_676_++) {
						this.aClass169Array3776[i_669_] = new Class169(class180_sub7_sub1_673_.aClass169Array3776[i_676_].aClass32_1650, class180_sub7_sub1_673_.aClass169Array3776[i_676_].anInt1647 + this.anInt3793);
						i_669_++;
					}
				}
				for (int i_677_ = 0; i_677_ < class180_sub7_sub1_673_.anInt3768; i_677_++) {
					if (class180_sub7_sub1_673_.anIntArray3791[i_677_] < class180_sub7_sub1_673_.vertexCount) {
						anIntArray3791[anInt3768] = class180_sub7_sub1_673_.anIntArray3791[i_677_] + this.anInt3793;
					}
					if (class180_sub7_sub1_673_.anIntArray3797[i_677_] < class180_sub7_sub1_673_.vertexCount) {
						anIntArray3797[anInt3768] = class180_sub7_sub1_673_.anIntArray3797[i_677_] + this.anInt3793;
					}
					if (class180_sub7_sub1_673_.anIntArray3766[i_677_] < class180_sub7_sub1_673_.vertexCount) {
						anIntArray3766[anInt3768] = class180_sub7_sub1_673_.anIntArray3766[i_677_] + this.anInt3793;
					}
					anInt3768++;
				}
				for (int i_678_ = 0; i_678_ < class180_sub7_sub1_673_.vertexCount; i_678_++) {
					this.xVertices[this.anInt3793] = class180_sub7_sub1_673_.xVertices[i_678_];
					this.yVertices[this.anInt3793] = class180_sub7_sub1_673_.yVertices[i_678_];
					this.zVertices[this.anInt3793] = class180_sub7_sub1_673_.zVertices[i_678_];
					this.anInt3793++;
				}
			}
		}
		int i_679_ = 0;
		vertexCount = this.anInt3793;
		for (int i_680_ = 0; i_680_ < i; i_680_++) {
			final LDModel class180_sub7_sub1_681_ = class180_sub7_sub1s[i_680_];
			if (class180_sub7_sub1_681_ != null) {
				for (int i_682_ = 0; i_682_ < class180_sub7_sub1_681_.anInt3768; i_682_++) {
					if (class180_sub7_sub1_681_.anIntArray3791[i_682_] >= class180_sub7_sub1_681_.vertexCount) {
						anIntArray3791[i_679_] = class180_sub7_sub1_681_.anIntArray3791[i_682_] - class180_sub7_sub1_681_.vertexCount + this.anInt3793;
					}
					if (class180_sub7_sub1_681_.anIntArray3797[i_682_] >= class180_sub7_sub1_681_.vertexCount) {
						anIntArray3797[i_679_] = class180_sub7_sub1_681_.anIntArray3797[i_682_] - class180_sub7_sub1_681_.vertexCount + this.anInt3793;
					}
					if (class180_sub7_sub1_681_.anIntArray3766[i_682_] >= class180_sub7_sub1_681_.vertexCount) {
						anIntArray3766[i_679_] = class180_sub7_sub1_681_.anIntArray3766[i_682_] - class180_sub7_sub1_681_.vertexCount + this.anInt3793;
					}
					i_679_++;
				}
				for (int i_683_ = class180_sub7_sub1_681_.vertexCount; i_683_ < class180_sub7_sub1_681_.anInt3793; i_683_++) {
					this.xVertices[this.anInt3793] = class180_sub7_sub1_681_.xVertices[i_683_];
					this.yVertices[this.anInt3793] = class180_sub7_sub1_681_.yVertices[i_683_];
					this.zVertices[this.anInt3793] = class180_sub7_sub1_681_.zVertices[i_683_];
					this.anInt3793++;
				}
			}
		}
	}
}
