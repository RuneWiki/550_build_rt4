/* Class180_Sub7_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;

import javax.media.opengl.GL;

final class Class180_Sub7_Sub2 extends Class180_Sub7 {
	private short[] aShortArray3844;
	int[] anIntArray3845;
	private short[] aShortArray3846;
	Class49 aClass49_3847;
	private Class49 aClass49_3848;
	private short[] aShortArray3849;
	private int[] anIntArray3850;
	private short aShort3851;
	private short[] aShortArray3852;
	private short aShort3853;
	private Class49 aClass49_3854;
	private short[] aShortArray3855;
	int[] anIntArray3856;
	private short[] aShortArray3857;
	Class169[] aClass169Array3858;
	private Class152 aClass152_3859;
	private byte aByte3860;
	private int anInt3861;
	int anInt3862 = 0;
	private Class49 aClass49_3863;
	private short[] aShortArray3864;
	private int[] anIntArray3865;
	private short[] aShortArray3866;
	private int anInt3867;
	private float[] aFloatArray3868;
	private Class49 aClass49_3869;
	Class13 aClass13_3870;
	private static Buffer aClass120_Sub7_3871 = new Buffer(10000);
	private byte[] aByteArray3872;
	private short[] aShortArray3873;
	private float[] aFloatArray3874;
	private int[] anIntArray3875;
	private short[] aShortArray3876;
	private short[] aShortArray3877;
	int[] anIntArray3878;
	private short[] aShortArray3879;
	boolean aBoolean3880;
	private int[][] anIntArrayArray3881;
	private Class104 aClass104_3882;
	private static long[] aLongArray3883;
	private byte[] aByteArray3884;
	private static Class180_Sub7_Sub2 aClass180_Sub7_Sub2_3885 = new Class180_Sub7_Sub2();
	private int[][] anIntArrayArray3886;
	private static ByteBuffer aByteBuffer3887;
	private byte aByte3888;
	private static Class180_Sub7_Sub2 aClass180_Sub7_Sub2_3889 = new Class180_Sub7_Sub2();
	private int anInt3890;
	private static Class180_Sub7_Sub2 aClass180_Sub7_Sub2_3891 = new Class180_Sub7_Sub2();
	Class158[] aClass158Array3892;
	private static Class180_Sub7_Sub2 aClass180_Sub7_Sub2_3893 = new Class180_Sub7_Sub2();
	private static Class180_Sub7_Sub2 aClass180_Sub7_Sub2_3894 = new Class180_Sub7_Sub2();
	private static Class180_Sub7_Sub2 aClass180_Sub7_Sub2_3895 = new Class180_Sub7_Sub2();
	private static int anInt3896;
	private static boolean aBoolean3897 = false;
	private static int anInt3898;
	private static float aFloat3899;
	private static float aFloat3900;
	private static int[] anIntArray3901;
	private static float aFloat3902;
	private static float aFloat3903;
	private static int anInt3904;
	private static int[] anIntArray3905 = new int[1];
	private static float aFloat3906;
	private static float aFloat3907;

	static {
		anIntArray3901 = new int[1];
	}

	@Override
	final SceneGraphNode method2269(final int i, final int i_0_, final int i_1_) {
		this.aBoolean3880 = false;
		if (aClass152_3859 != null) {
			aShortArray3873 = aClass152_3859.aShortArray1425;
			aShortArray3852 = aClass152_3859.aShortArray1423;
			aShortArray3844 = aClass152_3859.aShortArray1424;
			aShortArray3849 = aClass152_3859.aShortArray1426;
			aClass152_3859 = null;
		}
		return this;
	}

	@Override
	final int method2363() {
		if (!this.aClass13_3870.aBoolean89) {
			method2425();
		}
		return this.aClass13_3870.aShort88;
	}

	final void method2405(final short i, final short i_2_) {
		for (int i_3_ = 0; i_3_ < anInt3867; i_3_++) {
			if (aShortArray3855[i_3_] == i) {
				aShortArray3855[i_3_] = i_2_;
			}
		}
		int i_4_ = 0;
		int i_5_ = 0;
		if (i != -1) {
			i_4_ = Rasterizer.anInterface5_973.method24(i & 0xffff, false);
			i_5_ = Rasterizer.anInterface5_973.method21((byte) -119, i & 0xffff);
		}
		int i_6_ = 0;
		int i_7_ = 0;
		if (i_2_ != -1) {
			i_6_ = Rasterizer.anInterface5_973.method24(i_2_ & 0xffff, false);
			i_7_ = Rasterizer.anInterface5_973.method21((byte) -119, i_2_ & 0xffff);
		}
		if (i_4_ != i_6_ || i_5_ != i_7_) {
			aClass49_3869.aBoolean439 = false;
		}
	}

	public static void method2406() {
		aLongArray3883 = null;
		aClass120_Sub7_3871 = null;
		aByteBuffer3887 = null;
		aClass180_Sub7_Sub2_3885 = null;
		aClass180_Sub7_Sub2_3889 = null;
		aClass180_Sub7_Sub2_3891 = null;
		aClass180_Sub7_Sub2_3893 = null;
		aClass180_Sub7_Sub2_3894 = null;
		aClass180_Sub7_Sub2_3895 = null;
		anIntArray3905 = null;
		anIntArray3901 = null;
	}

	@Override
	final int method2374() {
		if (!this.aClass13_3870.aBoolean89) {
			method2425();
		}
		return this.aClass13_3870.aShort90;
	}

	@Override
	final void method2265(final int i, final int i_8_, final int i_9_, final int i_10_, final int i_11_, final int i_12_, final int i_13_, final int i_14_, final long l, final int i_15_, final ParticleEngine class108_sub2) {
		if (anInt3890 != 0) {
			if (!this.aClass13_3870.aBoolean89) {
				method2425();
			}
			final int i_16_ = this.aClass13_3870.aShort93;
			final int i_17_ = this.aClass13_3870.aShort94;
			final int i_18_ = this.aClass13_3870.aShort87;
			if (class108_sub2 != null) {
				class108_sub2.method965(i, i_15_, i_12_, i_13_, i_14_);
			}
			final int i_19_ = i_14_ * i_11_ - i_12_ * i_10_ >> 16;
			final int i_20_ = i_13_ * i_8_ + i_19_ * i_9_ >> 16;
			final int i_21_ = i_20_ + (i_16_ * i_9_ + i_18_ * i_8_ >> 16);
			if (i_21_ > 50) {
				final int i_22_ = i_20_ + (-i_16_ * i_9_ + i_17_ * i_8_ >> 16);
				if (i_22_ < 3584) {
					final int i_23_ = i_14_ * i_10_ + i_12_ * i_11_ >> 16;
					final int i_24_ = i_23_ + i_16_ << 9;
					if (i_24_ / i_21_ > IntegerNode.anInt2792) {
						final int i_25_ = i_23_ - i_16_ << 9;
						if (i_25_ / i_21_ < Class120_Sub12_Sub16.anInt3253) {
							final int i_26_ = i_13_ * i_9_ - i_19_ * i_8_ >> 16;
							final int i_27_ = i_26_ + (i_16_ * i_8_ + i_18_ * i_9_ >> 16) << 9;
							if (i_27_ / i_21_ > Class190.anInt2100) {
								final int i_28_ = i_26_ + (-i_16_ * i_8_ + i_17_ * i_9_ >> 16) << 9;
								if (i_28_ / i_21_ < Class120_Sub30_Sub1.anInt3672) {
									int i_29_ = 0;
									int i_30_ = 0;
									if (i != 0) {
										i_29_ = Rasterizer.sineTable[i];
										i_30_ = Rasterizer.cosineTable[i];
									}
									while_99_: do {
										if (l > 0L && Class5.aBoolean2158 && i_22_ > 0) {
											int i_31_;
											int i_32_;
											if (i_23_ > 0) {
												i_31_ = i_25_ / i_21_;
												i_32_ = i_24_ / i_22_;
											} else {
												i_31_ = i_25_ / i_22_;
												i_32_ = i_24_ / i_21_;
											}
											int i_33_;
											int i_34_;
											if (i_26_ > 0) {
												i_33_ = i_28_ / i_21_;
												i_34_ = i_27_ / i_22_;
											} else {
												i_33_ = i_28_ / i_22_;
												i_34_ = i_27_ / i_21_;
											}
											if (Class173.anInt1728 >= i_31_ && Class173.anInt1728 <= i_32_ && Class2.anInt49 >= i_33_ && Class2.anInt49 <= i_34_) {
												i_31_ = 999999;
												i_32_ = -999999;
												i_33_ = 999999;
												i_34_ = -999999;
												final int i_35_ = this.aClass13_3870.aShort90;
												final int i_36_ = this.aClass13_3870.aShort91;
												final int i_37_ = this.aClass13_3870.aShort88;
												final int i_38_ = this.aClass13_3870.aShort92;
												final int[] is = { i_35_, i_36_, i_35_, i_36_, i_35_, i_36_, i_35_, i_36_ };
												final int[] is_39_ = { i_37_, i_37_, i_38_, i_38_, i_37_, i_37_, i_38_, i_38_ };
												final int[] is_40_ = { i_17_, i_17_, i_17_, i_17_, i_18_, i_18_, i_18_, i_18_ };
												for (int i_41_ = 0; i_41_ < 8; i_41_++) {
													int i_42_ = is[i_41_];
													int i_43_ = is_40_[i_41_];
													int i_44_ = is_39_[i_41_];
													if (i != 0) {
														final int i_45_ = i_44_ * i_29_ + i_42_ * i_30_ >> 16;
														i_44_ = i_44_ * i_30_ - i_42_ * i_29_ >> 16;
														i_42_ = i_45_;
													}
													i_42_ += i_12_;
													i_43_ += i_13_;
													i_44_ += i_14_;
													int i_46_ = i_44_ * i_10_ + i_42_ * i_11_ >> 16;
													i_44_ = i_44_ * i_11_ - i_42_ * i_10_ >> 16;
													i_42_ = i_46_;
													i_46_ = i_43_ * i_9_ - i_44_ * i_8_ >> 16;
													i_44_ = i_43_ * i_8_ + i_44_ * i_9_ >> 16;
													i_43_ = i_46_;
													if (i_44_ > 0) {
														final int i_47_ = (i_42_ << 9) / i_44_;
														final int i_48_ = (i_43_ << 9) / i_44_;
														if (i_47_ < i_31_) {
															i_31_ = i_47_;
														}
														if (i_47_ > i_32_) {
															i_32_ = i_47_;
														}
														if (i_48_ < i_33_) {
															i_33_ = i_48_;
														}
														if (i_48_ > i_34_) {
															i_34_ = i_48_;
														}
													}
												}
												if (Class173.anInt1728 >= i_31_ && Class173.anInt1728 <= i_32_ && Class2.anInt49 >= i_33_ && Class2.anInt49 <= i_34_) {
													if (this.haveActions) {
														Class120_Sub12_Sub21.actions[Class186.actionsLen++] = l;
													} else {
														if (anIntArray3905.length < anInt3890) {
															anIntArray3905 = new int[anInt3890];
															anIntArray3901 = new int[anInt3890];
														}
														for (int i_49_ = 0; i_49_ < anInt3861; i_49_++) {
															int i_50_ = this.anIntArray3878[i_49_];
															int i_51_ = this.anIntArray3856[i_49_];
															int i_52_ = this.anIntArray3845[i_49_];
															if (i != 0) {
																final int i_53_ = i_52_ * i_29_ + i_50_ * i_30_ >> 16;
																i_52_ = i_52_ * i_30_ - i_50_ * i_29_ >> 16;
																i_50_ = i_53_;
															}
															i_50_ += i_12_;
															i_51_ += i_13_;
															i_52_ += i_14_;
															int i_54_ = i_52_ * i_10_ + i_50_ * i_11_ >> 16;
															i_52_ = i_52_ * i_11_ - i_50_ * i_10_ >> 16;
															i_50_ = i_54_;
															i_54_ = i_51_ * i_9_ - i_52_ * i_8_ >> 16;
															i_52_ = i_51_ * i_8_ + i_52_ * i_9_ >> 16;
															i_51_ = i_54_;
															if (i_52_ < 50) {
																break while_99_;
															}
															final int i_55_ = (i_50_ << 9) / i_52_;
															final int i_56_ = (i_51_ << 9) / i_52_;
															final int i_57_ = anIntArray3875[i_49_];
															final int i_58_ = anIntArray3875[i_49_ + 1];
															for (int i_59_ = i_57_; i_59_ < i_58_; i_59_++) {
																final int i_60_ = aShortArray3864[i_59_] - 1;
																if (i_60_ == -1) {
																	break;
																}
																anIntArray3905[i_60_] = i_55_;
																anIntArray3901[i_60_] = i_56_;
															}
														}
														for (int i_61_ = 0; i_61_ < anInt3867; i_61_++) {
															final short i_62_ = aShortArray3866[i_61_];
															final short i_63_ = aShortArray3877[i_61_];
															final short i_64_ = aShortArray3879[i_61_];
															if (method2428(Class173.anInt1728, Class2.anInt49, anIntArray3901[i_62_], anIntArray3901[i_63_], anIntArray3901[i_64_], anIntArray3905[i_62_], anIntArray3905[i_63_], anIntArray3905[i_64_])) {
																Class120_Sub12_Sub21.actions[Class186.actionsLen++] = l;
																break;
															}
														}
													}
												}
											}
										}
									} while (false);
									final GL gl = HDToolkit.gl;
									gl.glPushMatrix();
									gl.glTranslatef(i_12_, i_13_, i_14_);
									gl.glRotatef(i * 0.17578125F, 0.0F, 1.0F, 0.0F);
									method2418();
									gl.glPopMatrix();
									if (class108_sub2 != null) {
										class108_sub2.method948(i, i_8_, i_9_, i_10_, i_11_, i_15_, i_12_, i_13_, i_14_);
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@Override
	final void method2388(final int i, final int[] is, int i_65_, int i_66_, int i_67_, final boolean bool) {
		final int i_68_ = is.length;
		if (i == 0) {
			i_65_ <<= 4;
			i_66_ <<= 4;
			i_67_ <<= 4;
			int i_69_ = 0;
			anInt3896 = 0;
			anInt3898 = 0;
			anInt3904 = 0;
			for (int i_70_ = 0; i_70_ < i_68_; i_70_++) {
				final int i_71_ = is[i_70_];
				if (i_71_ < anIntArrayArray3881.length) {
					final int[] is_72_ = anIntArrayArray3881[i_71_];
					int[] is_74_;
					final int i_73_ = (is_74_ = is_72_).length;
					for (int i_75_ = 0; i_75_ < i_73_; i_75_++) {
						final int i_76_ = is_74_[i_75_];
						anInt3896 += this.anIntArray3878[i_76_];
						anInt3898 += this.anIntArray3856[i_76_];
						anInt3904 += this.anIntArray3845[i_76_];
						i_69_++;
					}
				}
			}
			if (i_69_ > 0) {
				anInt3896 = anInt3896 / i_69_ + i_65_;
				anInt3898 = anInt3898 / i_69_ + i_66_;
				anInt3904 = anInt3904 / i_69_ + i_67_;
			} else {
				anInt3896 = i_65_;
				anInt3898 = i_66_;
				anInt3904 = i_67_;
			}
		} else if (i == 1) {
			i_65_ <<= 4;
			i_66_ <<= 4;
			i_67_ <<= 4;
			for (int i_77_ = 0; i_77_ < i_68_; i_77_++) {
				final int i_78_ = is[i_77_];
				if (i_78_ < anIntArrayArray3881.length) {
					final int[] is_79_ = anIntArrayArray3881[i_78_];
					int[] is_81_;
					final int i_80_ = (is_81_ = is_79_).length;
					for (int i_82_ = 0; i_82_ < i_80_; i_82_++) {
						final int i_83_ = is_81_[i_82_];
						final int i_84_ = i_83_;
						this.anIntArray3878[i_84_] += i_65_;
						this.anIntArray3856[i_84_] += i_66_;
						this.anIntArray3845[i_84_] += i_67_;
					}
				}
			}
		} else if (i == 2) {
			for (int i_85_ = 0; i_85_ < i_68_; i_85_++) {
				final int i_86_ = is[i_85_];
				if (i_86_ < anIntArrayArray3881.length) {
					final int[] is_87_ = anIntArrayArray3881[i_86_];
					int[] is_89_;
					final int i_88_ = (is_89_ = is_87_).length;
					for (int i_90_ = 0; i_90_ < i_88_; i_90_++) {
						final int i_91_ = is_89_[i_90_];
						final int i_92_ = i_91_;
						this.anIntArray3878[i_92_] -= anInt3896;
						this.anIntArray3856[i_92_] -= anInt3898;
						this.anIntArray3845[i_92_] -= anInt3904;
						if (i_67_ != 0) {
							final int i_93_ = Rasterizer.sineTable[i_67_];
							final int i_94_ = Rasterizer.cosineTable[i_67_];
							final int i_95_ = this.anIntArray3856[i_92_] * i_93_ + this.anIntArray3878[i_92_] * i_94_ + 32767 >> 16;
							this.anIntArray3856[i_92_] = this.anIntArray3856[i_92_] * i_94_ - this.anIntArray3878[i_92_] * i_93_ + 32767 >> 16;
							this.anIntArray3878[i_92_] = i_95_;
						}
						if (i_65_ != 0) {
							final int i_96_ = Rasterizer.sineTable[i_65_];
							final int i_97_ = Rasterizer.cosineTable[i_65_];
							final int i_98_ = this.anIntArray3856[i_92_] * i_97_ - this.anIntArray3845[i_92_] * i_96_ + 32767 >> 16;
							this.anIntArray3845[i_92_] = this.anIntArray3856[i_92_] * i_96_ + this.anIntArray3845[i_92_] * i_97_ + 32767 >> 16;
							this.anIntArray3856[i_92_] = i_98_;
						}
						if (i_66_ != 0) {
							final int i_99_ = Rasterizer.sineTable[i_66_];
							final int i_100_ = Rasterizer.cosineTable[i_66_];
							final int i_101_ = this.anIntArray3845[i_92_] * i_99_ + this.anIntArray3878[i_92_] * i_100_ + 32767 >> 16;
							this.anIntArray3845[i_92_] = this.anIntArray3845[i_92_] * i_100_ - this.anIntArray3878[i_92_] * i_99_ + 32767 >> 16;
							this.anIntArray3878[i_92_] = i_101_;
						}
						this.anIntArray3878[i_92_] += anInt3896;
						this.anIntArray3856[i_92_] += anInt3898;
						this.anIntArray3845[i_92_] += anInt3904;
					}
				}
			}
			if (bool && aShortArray3873 != null) {
				for (int i_102_ = 0; i_102_ < i_68_; i_102_++) {
					final int i_103_ = is[i_102_];
					if (i_103_ < anIntArrayArray3881.length) {
						final int[] is_104_ = anIntArrayArray3881[i_103_];
						int[] is_106_;
						final int i_105_ = (is_106_ = is_104_).length;
						for (int i_107_ = 0; i_107_ < i_105_; i_107_++) {
							final int i_108_ = is_106_[i_107_];
							final int i_109_ = anIntArray3875[i_108_];
							final int i_110_ = anIntArray3875[i_108_ + 1];
							for (int i_111_ = i_109_; i_111_ < i_110_; i_111_++) {
								final int i_112_ = aShortArray3864[i_111_] - 1;
								if (i_112_ == -1) {
									break;
								}
								if (i_67_ != 0) {
									final int i_113_ = Rasterizer.sineTable[i_67_];
									final int i_114_ = Rasterizer.cosineTable[i_67_];
									final int i_115_ = aShortArray3852[i_112_] * i_113_ + aShortArray3873[i_112_] * i_114_ + 32767 >> 16;
									aShortArray3852[i_112_] = (short) (aShortArray3852[i_112_] * i_114_ - aShortArray3873[i_112_] * i_113_ + 32767 >> 16);
									aShortArray3873[i_112_] = (short) i_115_;
								}
								if (i_65_ != 0) {
									final int i_116_ = Rasterizer.sineTable[i_65_];
									final int i_117_ = Rasterizer.cosineTable[i_65_];
									final int i_118_ = aShortArray3852[i_112_] * i_117_ - aShortArray3844[i_112_] * i_116_ + 32767 >> 16;
									aShortArray3844[i_112_] = (short) (aShortArray3852[i_112_] * i_116_ + aShortArray3844[i_112_] * i_117_ + 32767 >> 16);
									aShortArray3852[i_112_] = (short) i_118_;
								}
								if (i_66_ != 0) {
									final int i_119_ = Rasterizer.sineTable[i_66_];
									final int i_120_ = Rasterizer.cosineTable[i_66_];
									final int i_121_ = aShortArray3844[i_112_] * i_119_ + aShortArray3873[i_112_] * i_120_ + 32767 >> 16;
									aShortArray3844[i_112_] = (short) (aShortArray3844[i_112_] * i_120_ - aShortArray3873[i_112_] * i_119_ + 32767 >> 16);
									aShortArray3873[i_112_] = (short) i_121_;
								}
							}
						}
					}
				}
				if (aClass49_3848 != null) {
					aClass49_3848.aBoolean439 = false;
				}
			}
		} else if (i == 3) {
			for (int i_122_ = 0; i_122_ < i_68_; i_122_++) {
				final int i_123_ = is[i_122_];
				if (i_123_ < anIntArrayArray3881.length) {
					final int[] is_124_ = anIntArrayArray3881[i_123_];
					int[] is_126_;
					final int i_125_ = (is_126_ = is_124_).length;
					for (int i_127_ = 0; i_127_ < i_125_; i_127_++) {
						final int i_128_ = is_126_[i_127_];
						final int i_129_ = i_128_;
						this.anIntArray3878[i_129_] -= anInt3896;
						this.anIntArray3856[i_129_] -= anInt3898;
						this.anIntArray3845[i_129_] -= anInt3904;
						this.anIntArray3878[i_129_] = this.anIntArray3878[i_129_] * i_65_ >> 7;
						this.anIntArray3856[i_129_] = this.anIntArray3856[i_129_] * i_66_ >> 7;
						this.anIntArray3845[i_129_] = this.anIntArray3845[i_129_] * i_67_ >> 7;
						this.anIntArray3878[i_129_] += anInt3896;
						this.anIntArray3856[i_129_] += anInt3898;
						this.anIntArray3845[i_129_] += anInt3904;
					}
				}
			}
		} else if (i == 5) {
			if (anIntArrayArray3886 != null && aByteArray3884 != null) {
				for (int i_130_ = 0; i_130_ < i_68_; i_130_++) {
					final int i_131_ = is[i_130_];
					if (i_131_ < anIntArrayArray3886.length) {
						final int[] is_132_ = anIntArrayArray3886[i_131_];
						int[] is_134_;
						final int i_133_ = (is_134_ = is_132_).length;
						for (int i_135_ = 0; i_135_ < i_133_; i_135_++) {
							final int i_136_ = is_134_[i_135_];
							final int i_137_ = i_136_;
							int i_138_ = (aByteArray3884[i_137_] & 0xff) + i_65_ * 8;
							if (i_138_ < 0) {
								i_138_ = 0;
							} else if (i_138_ > 255) {
								i_138_ = 255;
							}
							aByteArray3884[i_137_] = (byte) i_138_;
						}
						if (is_132_.length > 0) {
							aClass49_3869.aBoolean439 = false;
						}
					}
				}
			}
		} else if (i == 7 && anIntArrayArray3886 != null) {
			for (int i_139_ = 0; i_139_ < i_68_; i_139_++) {
				final int i_140_ = is[i_139_];
				if (i_140_ < anIntArrayArray3886.length) {
					final int[] is_141_ = anIntArrayArray3886[i_140_];
					int[] is_143_;
					final int i_142_ = (is_143_ = is_141_).length;
					for (int i_144_ = 0; i_144_ < i_142_; i_144_++) {
						final int i_145_ = is_143_[i_144_];
						final int i_146_ = i_145_;
						final int i_147_ = aShortArray3857[i_146_] & 0xffff;
						int i_148_ = i_147_ >> 10 & 0x3f;
						int i_149_ = i_147_ >> 7 & 0x7;
						int i_150_ = i_147_ & 0x7f;
						i_148_ = i_148_ + i_65_ & 0x3f;
						i_149_ += i_66_ / 4;
						if (i_149_ < 0) {
							i_149_ = 0;
						} else if (i_149_ > 7) {
							i_149_ = 7;
						}
						i_150_ += i_67_;
						if (i_150_ < 0) {
							i_150_ = 0;
						} else if (i_150_ > 127) {
							i_150_ = 127;
						}
						aShortArray3857[i_146_] = (short) (i_148_ << 10 | i_149_ << 7 | i_150_);
					}
					if (is_141_.length > 0) {
						aClass49_3869.aBoolean439 = false;
					}
				}
			}
		}
	}

	@Override
	final int getMaxY() {
		if (!this.aClass13_3870.aBoolean89) {
			method2425();
		}
		return this.aClass13_3870.aShort94;
	}

	final int method2407() {
		return aShort3851;
	}

	final void method2408() {
		if (aShortArray3873 == null) {
			method2372();
		} else {
			for (int i = 0; i < this.anInt3862; i++) {
				final int i_151_ = this.anIntArray3845[i];
				this.anIntArray3845[i] = this.anIntArray3878[i];
				this.anIntArray3878[i] = -i_151_;
			}
			for (int i = 0; i < anInt3890; i++) {
				final int i_152_ = aShortArray3844[i];
				aShortArray3844[i] = aShortArray3873[i];
				aShortArray3873[i] = (short) -i_152_;
			}
			this.aClass13_3870.aBoolean89 = false;
			this.aClass49_3847.aBoolean439 = false;
			if (aClass49_3848 != null) {
				aClass49_3848.aBoolean439 = false;
			}
		}
	}

	@Override
	final int method2371() {
		if (!this.aClass13_3870.aBoolean89) {
			method2425();
		}
		return this.aClass13_3870.aShort93;
	}

	@Override
	final void method2367(final int i, final int i_153_, final int i_154_, final int i_155_, final int i_156_, final int i_157_, final int i_158_, final long l) {
		if (anInt3890 != 0) {
			final GL gl = HDToolkit.gl;
			gl.glPushMatrix();
			if (i_155_ != 0) {
				gl.glRotatef(i_155_ * 0.17578125F, 1.0F, 0.0F, 0.0F);
			}
			gl.glTranslatef(i_156_, i_157_, i_158_);
			if (i_153_ != 0) {
				gl.glRotatef(i_153_ * 0.17578125F, 0.0F, 1.0F, 0.0F);
			}
			if (i != 0) {
				gl.glRotatef(i * 0.17578125F, 1.0F, 0.0F, 0.0F);
			}
			if (i_154_ != 0) {
				gl.glRotatef(-i_154_ * 0.17578125F, 0.0F, 0.0F, 1.0F);
			}
			method2418();
			gl.glPopMatrix();
		}
	}

	@Override
	final void method2360(final int i) {
		final int i_159_ = Rasterizer.sineTable[i];
		final int i_160_ = Rasterizer.cosineTable[i];
		for (int i_161_ = 0; i_161_ < this.anInt3862; i_161_++) {
			final int i_162_ = this.anIntArray3845[i_161_] * i_159_ + this.anIntArray3878[i_161_] * i_160_ >> 16;
			this.anIntArray3845[i_161_] = this.anIntArray3845[i_161_] * i_160_ - this.anIntArray3878[i_161_] * i_159_ >> 16;
			this.anIntArray3878[i_161_] = i_162_;
		}
		this.aClass13_3870.aBoolean89 = false;
		this.aClass49_3847.aBoolean439 = false;
	}

	final void method2409() {
		if (aShortArray3873 == null) {
			method2373();
		} else {
			for (int i = 0; i < this.anInt3862; i++) {
				this.anIntArray3878[i] = -this.anIntArray3878[i];
				this.anIntArray3845[i] = -this.anIntArray3845[i];
			}
			for (int i = 0; i < anInt3890; i++) {
				aShortArray3873[i] = (short) -aShortArray3873[i];
				aShortArray3844[i] = (short) -aShortArray3844[i];
			}
			this.aClass13_3870.aBoolean89 = false;
			this.aClass49_3847.aBoolean439 = false;
			if (aClass49_3848 != null) {
				aClass49_3848.aBoolean439 = false;
			}
		}
	}

	final void method2410() {
		for (int i = 0; i < this.anInt3862; i++) {
			this.anIntArray3845[i] = -this.anIntArray3845[i];
		}
		if (aShortArray3844 != null) {
			for (int i = 0; i < anInt3890; i++) {
				aShortArray3844[i] = (short) -aShortArray3844[i];
			}
		}
		for (int i = 0; i < anInt3867; i++) {
			final short i_163_ = aShortArray3866[i];
			aShortArray3866[i] = aShortArray3879[i];
			aShortArray3879[i] = i_163_;
		}
		this.aClass13_3870.aBoolean89 = false;
		this.aClass49_3847.aBoolean439 = false;
		if (aClass49_3848 != null) {
			aClass49_3848.aBoolean439 = false;
		}
		aClass49_3863.aBoolean439 = false;
	}

	@Override
	final boolean method2375() {
		if (anIntArrayArray3881 == null) {
			return false;
		}
		for (int i = 0; i < this.anInt3862; i++) {
			this.anIntArray3878[i] <<= 4;
			this.anIntArray3856[i] <<= 4;
			this.anIntArray3845[i] <<= 4;
		}
		anInt3896 = 0;
		anInt3898 = 0;
		anInt3904 = 0;
		return true;
	}

	@Override
	final boolean method2268() {
		if (this.aBoolean3880 && this.anIntArray3878 != null && aShortArray3873 != null) {
			return true;
		}
		return false;
	}

	@Override
	final void method2377(final int i) {
		final int i_164_ = Rasterizer.sineTable[i];
		final int i_165_ = Rasterizer.cosineTable[i];
		for (int i_166_ = 0; i_166_ < this.anInt3862; i_166_++) {
			final int i_167_ = this.anIntArray3856[i_166_] * i_165_ - this.anIntArray3845[i_166_] * i_164_ >> 16;
			this.anIntArray3845[i_166_] = this.anIntArray3856[i_166_] * i_164_ + this.anIntArray3845[i_166_] * i_165_ >> 16;
			this.anIntArray3856[i_166_] = i_167_;
		}
		this.aClass13_3870.aBoolean89 = false;
		this.aClass49_3847.aBoolean439 = false;
	}

	private final void method2411() {
		if (aClass120_Sub7_3871.buf.length < anInt3867 * 12) {
			aClass120_Sub7_3871 = new Buffer((anInt3867 + 100) * 12);
		} else {
			aClass120_Sub7_3871.pos = 0;
		}
		if (HDToolkit.usingBigEndian) {
			for (int i = 0; i < anInt3867; i++) {
				aClass120_Sub7_3871.putInt(aShortArray3866[i]);
				aClass120_Sub7_3871.putInt(aShortArray3877[i]);
				aClass120_Sub7_3871.putInt(aShortArray3879[i]);
			}
		} else {
			for (int i = 0; i < anInt3867; i++) {
				aClass120_Sub7_3871.putLEInt(aShortArray3866[i]);
				aClass120_Sub7_3871.putLEInt(aShortArray3877[i]);
				aClass120_Sub7_3871.putLEInt(aShortArray3879[i]);
			}
		}
		if (HDToolkit.vertexBufferAsObject) {
			final Class104 class104 = new Class104();
			final ByteBuffer bytebuffer = ByteBuffer.wrap(aClass120_Sub7_3871.buf, 0, aClass120_Sub7_3871.pos);
			class104.method885(bytebuffer);
			aClass49_3863.aBoolean439 = true;
			aClass49_3863.aByteBuffer443 = null;
			aClass49_3863.aClass104_445 = class104;
		} else {
			final ByteBuffer bytebuffer = ByteBuffer.allocateDirect(aClass120_Sub7_3871.pos);
			bytebuffer.put(aClass120_Sub7_3871.buf, 0, aClass120_Sub7_3871.pos);
			bytebuffer.flip();
			aClass49_3863.aBoolean439 = true;
			aClass49_3863.aByteBuffer443 = bytebuffer;
			aClass49_3863.aClass104_445 = null;
		}
	}

	final Class180_Sub7_Sub2 method2412(final boolean bool, final boolean bool_168_, final boolean bool_169_, final boolean bool_170_, final boolean bool_171_, final boolean bool_172_, final boolean bool_173_, final boolean bool_174_, final boolean bool_175_, final boolean bool_176_,
			final boolean bool_177_) {
		final Class180_Sub7_Sub2 class180_sub7_sub2_178_ = new Class180_Sub7_Sub2();
		class180_sub7_sub2_178_.anInt3862 = this.anInt3862;
		class180_sub7_sub2_178_.anInt3861 = anInt3861;
		class180_sub7_sub2_178_.anInt3890 = anInt3890;
		class180_sub7_sub2_178_.anInt3867 = anInt3867;
		if (bool) {
			class180_sub7_sub2_178_.anIntArray3878 = this.anIntArray3878;
			class180_sub7_sub2_178_.anIntArray3845 = this.anIntArray3845;
		} else {
			class180_sub7_sub2_178_.anIntArray3878 = SpotAnimType.method879(this.anIntArray3878, -123);
			class180_sub7_sub2_178_.anIntArray3845 = SpotAnimType.method879(this.anIntArray3845, -116);
		}
		if (bool_168_) {
			class180_sub7_sub2_178_.anIntArray3856 = this.anIntArray3856;
		} else {
			class180_sub7_sub2_178_.anIntArray3856 = SpotAnimType.method879(this.anIntArray3856, -105);
		}
		if (bool && bool_168_) {
			class180_sub7_sub2_178_.aClass49_3847 = this.aClass49_3847;
			class180_sub7_sub2_178_.aClass13_3870 = this.aClass13_3870;
		} else {
			class180_sub7_sub2_178_.aClass49_3847 = new Class49();
			class180_sub7_sub2_178_.aClass13_3870 = new Class13();
		}
		if (bool_169_) {
			class180_sub7_sub2_178_.aShortArray3857 = aShortArray3857;
		} else {
			class180_sub7_sub2_178_.aShortArray3857 = Class120_Sub12_Sub8.method1236(aShortArray3857, (byte) 119);
		}
		if (bool_170_) {
			class180_sub7_sub2_178_.aByteArray3884 = aByteArray3884;
		} else {
			class180_sub7_sub2_178_.aByteArray3884 = Class126.method1883(64, aByteArray3884);
		}
		if (bool_169_ && bool_170_ && bool_171_ && (bool_174_ && bool_172_ || Class120_Sub12_Sub6.highLightingDetail)) {
			class180_sub7_sub2_178_.aClass49_3869 = aClass49_3869;
		} else {
			class180_sub7_sub2_178_.aClass49_3869 = new Class49();
		}
		if (bool_172_) {
			class180_sub7_sub2_178_.aShortArray3873 = aShortArray3873;
			class180_sub7_sub2_178_.aShortArray3852 = aShortArray3852;
			class180_sub7_sub2_178_.aShortArray3844 = aShortArray3844;
			class180_sub7_sub2_178_.aShortArray3849 = aShortArray3849;
		} else {
			class180_sub7_sub2_178_.aShortArray3873 = Class120_Sub12_Sub8.method1236(aShortArray3873, (byte) 121);
			class180_sub7_sub2_178_.aShortArray3852 = Class120_Sub12_Sub8.method1236(aShortArray3852, (byte) 119);
			class180_sub7_sub2_178_.aShortArray3844 = Class120_Sub12_Sub8.method1236(aShortArray3844, (byte) -120);
			class180_sub7_sub2_178_.aShortArray3849 = Class120_Sub12_Sub8.method1236(aShortArray3849, (byte) -85);
		}
		if (Class120_Sub12_Sub6.highLightingDetail) {
			if (bool_172_ && bool_173_ && bool_174_) {
				class180_sub7_sub2_178_.aClass49_3848 = aClass49_3848;
			} else {
				class180_sub7_sub2_178_.aClass49_3848 = new Class49();
			}
		} else {
			class180_sub7_sub2_178_.aClass49_3848 = null;
		}
		if (bool_175_) {
			class180_sub7_sub2_178_.aFloatArray3874 = aFloatArray3874;
			class180_sub7_sub2_178_.aFloatArray3868 = aFloatArray3868;
			class180_sub7_sub2_178_.aClass49_3854 = aClass49_3854;
		} else {
			class180_sub7_sub2_178_.aFloatArray3874 = Class89.method748(-5899, aFloatArray3874);
			class180_sub7_sub2_178_.aFloatArray3868 = Class89.method748(-5899, aFloatArray3868);
			class180_sub7_sub2_178_.aClass49_3854 = new Class49();
		}
		if (bool_176_) {
			class180_sub7_sub2_178_.aShortArray3866 = aShortArray3866;
			class180_sub7_sub2_178_.aShortArray3877 = aShortArray3877;
			class180_sub7_sub2_178_.aShortArray3879 = aShortArray3879;
			class180_sub7_sub2_178_.aClass49_3863 = aClass49_3863;
		} else {
			class180_sub7_sub2_178_.aShortArray3866 = Class120_Sub12_Sub8.method1236(aShortArray3866, (byte) -105);
			class180_sub7_sub2_178_.aShortArray3877 = Class120_Sub12_Sub8.method1236(aShortArray3877, (byte) 126);
			class180_sub7_sub2_178_.aShortArray3879 = Class120_Sub12_Sub8.method1236(aShortArray3879, (byte) 127);
			class180_sub7_sub2_178_.aClass49_3863 = new Class49();
		}
		if (bool_177_) {
			class180_sub7_sub2_178_.aShortArray3855 = aShortArray3855;
		} else {
			class180_sub7_sub2_178_.aShortArray3855 = Class120_Sub12_Sub8.method1236(aShortArray3855, (byte) 119);
		}
		class180_sub7_sub2_178_.anIntArray3850 = anIntArray3850;
		class180_sub7_sub2_178_.anIntArrayArray3881 = anIntArrayArray3881;
		class180_sub7_sub2_178_.aByteArray3872 = aByteArray3872;
		class180_sub7_sub2_178_.anIntArrayArray3886 = anIntArrayArray3886;
		class180_sub7_sub2_178_.anIntArray3865 = anIntArray3865;
		class180_sub7_sub2_178_.aShortArray3864 = aShortArray3864;
		class180_sub7_sub2_178_.anIntArray3875 = anIntArray3875;
		class180_sub7_sub2_178_.aShort3851 = aShort3851;
		class180_sub7_sub2_178_.aShort3853 = aShort3853;
		class180_sub7_sub2_178_.aClass158Array3892 = this.aClass158Array3892;
		class180_sub7_sub2_178_.aClass169Array3858 = this.aClass169Array3858;
		class180_sub7_sub2_178_.aShortArray3876 = aShortArray3876;
		class180_sub7_sub2_178_.aShortArray3846 = aShortArray3846;
		return class180_sub7_sub2_178_;
	}

	private final short method2413(final Class180_Sub2 class180_sub2, final int i, final long l, final int i_179_, final int i_180_, final int i_181_, final int i_182_, final float f, final float f_183_) {
		final int i_184_ = anIntArray3875[i];
		final int i_185_ = anIntArray3875[i + 1];
		int i_186_ = 0;
		for (int i_187_ = i_184_; i_187_ < i_185_; i_187_++) {
			final short i_188_ = aShortArray3864[i_187_];
			if (i_188_ == 0) {
				i_186_ = i_187_;
				break;
			}
			if (aLongArray3883[i_187_] == l) {
				return (short) (i_188_ - 1);
			}
		}
		aShortArray3864[i_186_] = (short) (anInt3890 + 1);
		aLongArray3883[i_186_] = l;
		aShortArray3873[anInt3890] = (short) i_179_;
		aShortArray3852[anInt3890] = (short) i_180_;
		aShortArray3844[anInt3890] = (short) i_181_;
		aShortArray3849[anInt3890] = (short) i_182_;
		aFloatArray3874[anInt3890] = f;
		aFloatArray3868[anInt3890] = f_183_;
		return (short) anInt3890++;
	}

	@Override
	final int method2386() {
		if (!this.aClass13_3870.aBoolean89) {
			method2425();
		}
		return this.aClass13_3870.aShort92;
	}

	final Class107_Sub1 method2414(final Class107_Sub1 class107_sub1) {
		if (anInt3890 == 0) {
			return null;
		}
		if (!this.aClass13_3870.aBoolean89) {
			method2425();
		}
		int i;
		int i_189_;
		if (Class117.anInt1130 > 0) {
			i = this.aClass13_3870.aShort90 - (this.aClass13_3870.aShort87 * Class117.anInt1130 >> 8) >> 3;
			i_189_ = this.aClass13_3870.aShort91 - (this.aClass13_3870.aShort94 * Class117.anInt1130 >> 8) >> 3;
		} else {
			i = this.aClass13_3870.aShort90 - (this.aClass13_3870.aShort94 * Class117.anInt1130 >> 8) >> 3;
			i_189_ = this.aClass13_3870.aShort91 - (this.aClass13_3870.aShort87 * Class117.anInt1130 >> 8) >> 3;
		}
		int i_190_;
		int i_191_;
		if (Class117.anInt1123 > 0) {
			i_190_ = this.aClass13_3870.aShort88 - (this.aClass13_3870.aShort87 * Class117.anInt1123 >> 8) >> 3;
			i_191_ = this.aClass13_3870.aShort92 - (this.aClass13_3870.aShort94 * Class117.anInt1123 >> 8) >> 3;
		} else {
			i_190_ = this.aClass13_3870.aShort88 - (this.aClass13_3870.aShort94 * Class117.anInt1123 >> 8) >> 3;
			i_191_ = this.aClass13_3870.aShort92 - (this.aClass13_3870.aShort87 * Class117.anInt1123 >> 8) >> 3;
		}
		final int i_192_ = i_189_ - i + 1;
		final int i_193_ = i_191_ - i_190_ + 1;
		Class107_Sub1 class107_sub1_194_;
		if (class107_sub1 != null && class107_sub1.aByteArray2306.length >= i_192_ * i_193_) {
			class107_sub1_194_ = class107_sub1;
			class107_sub1_194_.anInt1029 = class107_sub1_194_.anInt1026 = i_192_;
			class107_sub1_194_.anInt1028 = class107_sub1_194_.anInt1030 = i_193_;
			class107_sub1_194_.method912();
		} else {
			class107_sub1_194_ = new Class107_Sub1(i_192_, i_193_, 0);
		}
		class107_sub1_194_.anInt1020 = i;
		class107_sub1_194_.anInt1021 = i_190_;
		if (anIntArray3905.length < anInt3890) {
			anIntArray3905 = new int[anInt3890];
			anIntArray3901 = new int[anInt3890];
		}
		for (int i_195_ = 0; i_195_ < anInt3861; i_195_++) {
			final int i_196_ = (this.anIntArray3878[i_195_] - (this.anIntArray3856[i_195_] * Class117.anInt1130 >> 8) >> 3) - i;
			final int i_197_ = (this.anIntArray3845[i_195_] - (this.anIntArray3856[i_195_] * Class117.anInt1123 >> 8) >> 3) - i_190_;
			final int i_198_ = anIntArray3875[i_195_];
			final int i_199_ = anIntArray3875[i_195_ + 1];
			for (int i_200_ = i_198_; i_200_ < i_199_; i_200_++) {
				final int i_201_ = aShortArray3864[i_200_] - 1;
				if (i_201_ == -1) {
					break;
				}
				anIntArray3905[i_201_] = i_196_;
				anIntArray3901[i_201_] = i_197_;
			}
		}
		for (int i_202_ = 0; i_202_ < anInt3867; i_202_++) {
			if (aByteArray3884[i_202_] <= 128) {
				final short i_203_ = aShortArray3866[i_202_];
				final short i_204_ = aShortArray3877[i_202_];
				final short i_205_ = aShortArray3879[i_202_];
				final int i_206_ = anIntArray3905[i_203_];
				final int i_207_ = anIntArray3905[i_204_];
				final int i_208_ = anIntArray3905[i_205_];
				final int i_209_ = anIntArray3901[i_203_];
				final int i_210_ = anIntArray3901[i_204_];
				final int i_211_ = anIntArray3901[i_205_];
				if ((i_206_ - i_207_) * (i_210_ - i_211_) - (i_210_ - i_209_) * (i_208_ - i_207_) > 0) {
					Rasterizer.method865(class107_sub1_194_.aByteArray2306, i_209_, i_210_, i_211_, i_206_, i_207_, i_208_, i_192_);
				}
			}
		}
		return class107_sub1_194_;
	}

	final void method2415(final int i) {
		aShort3851 = (short) i;
		aClass49_3869.aBoolean439 = false;
	}

	@Override
	final Class180_Sub7 method2381(final boolean bool, final boolean bool_212_, final boolean bool_213_) {
		return method2433(bool, bool_212_, bool_213_, aClass180_Sub7_Sub2_3893, aClass180_Sub7_Sub2_3891);
	}

	private static final void method2416(int i, int i_214_, int i_215_, final int i_216_, final int i_217_, final int i_218_, final int i_219_, final float[] fs, final int i_220_, final float f, final float f_221_, final float f_222_) {
		i -= i_216_;
		i_214_ -= i_217_;
		i_215_ -= i_218_;
		final float f_223_ = i * fs[0] + i_214_ * fs[1] + i_215_ * fs[2];
		final float f_224_ = i * fs[3] + i_214_ * fs[4] + i_215_ * fs[5];
		final float f_225_ = i * fs[6] + i_214_ * fs[7] + i_215_ * fs[8];
		float f_226_;
		float f_227_;
		if (i_219_ == 0) {
			f_226_ = f_223_ + f + 0.5F;
			f_227_ = -f_225_ + f_222_ + 0.5F;
		} else if (i_219_ == 1) {
			f_226_ = f_223_ + f + 0.5F;
			f_227_ = f_225_ + f_222_ + 0.5F;
		} else if (i_219_ == 2) {
			f_226_ = -f_223_ + f + 0.5F;
			f_227_ = -f_224_ + f_221_ + 0.5F;
		} else if (i_219_ == 3) {
			f_226_ = f_223_ + f + 0.5F;
			f_227_ = -f_224_ + f_221_ + 0.5F;
		} else if (i_219_ == 4) {
			f_226_ = f_225_ + f_222_ + 0.5F;
			f_227_ = -f_224_ + f_221_ + 0.5F;
		} else {
			f_226_ = -f_225_ + f_222_ + 0.5F;
			f_227_ = -f_224_ + f_221_ + 0.5F;
		}
		if (i_220_ == 1) {
			final float f_228_ = f_226_;
			f_226_ = -f_227_;
			f_227_ = f_228_;
		} else if (i_220_ == 2) {
			f_226_ = -f_226_;
			f_227_ = -f_227_;
		} else if (i_220_ == 3) {
			final float f_229_ = f_226_;
			f_226_ = f_227_;
			f_227_ = -f_229_;
		}
		aFloat3906 = f_226_;
		aFloat3900 = f_227_;
	}

	@Override
	final void method2382(final int i, final int[] is, int i_230_, int i_231_, int i_232_, final boolean bool, final int i_233_, final int[] is_234_) {
		final int i_235_ = is.length;
		if (i == 0) {
			i_230_ <<= 4;
			i_231_ <<= 4;
			i_232_ <<= 4;
			int i_236_ = 0;
			anInt3896 = 0;
			anInt3898 = 0;
			anInt3904 = 0;
			for (int i_237_ = 0; i_237_ < i_235_; i_237_++) {
				final int i_238_ = is[i_237_];
				if (i_238_ < anIntArrayArray3881.length) {
					final int[] is_239_ = anIntArrayArray3881[i_238_];
					int[] is_241_;
					final int i_240_ = (is_241_ = is_239_).length;
					for (int i_242_ = 0; i_242_ < i_240_; i_242_++) {
						final int i_243_ = is_241_[i_242_];
						if (aShortArray3876 == null || (i_233_ & aShortArray3876[i_243_]) != 0) {
							anInt3896 += this.anIntArray3878[i_243_];
							anInt3898 += this.anIntArray3856[i_243_];
							anInt3904 += this.anIntArray3845[i_243_];
							i_236_++;
						}
					}
				}
			}
			if (i_236_ > 0) {
				anInt3896 = anInt3896 / i_236_ + i_230_;
				anInt3898 = anInt3898 / i_236_ + i_231_;
				anInt3904 = anInt3904 / i_236_ + i_232_;
				aBoolean3897 = true;
			} else {
				anInt3896 = i_230_;
				anInt3898 = i_231_;
				anInt3904 = i_232_;
			}
		} else if (i == 1) {
			if (is_234_ != null) {
				final int i_244_ = is_234_[0] * i_230_ + is_234_[1] * i_231_ + is_234_[2] * i_232_ + 16384 >> 15;
				final int i_245_ = is_234_[3] * i_230_ + is_234_[4] * i_231_ + is_234_[5] * i_232_ + 16384 >> 15;
				final int i_246_ = is_234_[6] * i_230_ + is_234_[7] * i_231_ + is_234_[8] * i_232_ + 16384 >> 15;
				i_230_ = i_244_;
				i_231_ = i_245_;
				i_232_ = i_246_;
			}
			i_230_ <<= 4;
			i_231_ <<= 4;
			i_232_ <<= 4;
			for (int i_247_ = 0; i_247_ < i_235_; i_247_++) {
				final int i_248_ = is[i_247_];
				if (i_248_ < anIntArrayArray3881.length) {
					final int[] is_249_ = anIntArrayArray3881[i_248_];
					int[] is_251_;
					final int i_250_ = (is_251_ = is_249_).length;
					for (int i_252_ = 0; i_252_ < i_250_; i_252_++) {
						final int i_253_ = is_251_[i_252_];
						final int i_254_ = i_253_;
						if (aShortArray3876 == null || (i_233_ & aShortArray3876[i_254_]) != 0) {
							this.anIntArray3878[i_254_] += i_230_;
							this.anIntArray3856[i_254_] += i_231_;
							this.anIntArray3845[i_254_] += i_232_;
						}
					}
				}
			}
		} else if (i == 2) {
			if (is_234_ != null) {
				final int i_255_ = is_234_[9] << 4;
				final int i_256_ = is_234_[10] << 4;
				final int i_257_ = is_234_[11] << 4;
				final int i_258_ = is_234_[12] << 4;
				final int i_259_ = is_234_[13] << 4;
				final int i_260_ = is_234_[14] << 4;
				if (aBoolean3897) {
					int i_261_ = is_234_[0] * anInt3896 + is_234_[3] * anInt3898 + is_234_[6] * anInt3904 + 16384 >> 15;
					int i_262_ = is_234_[1] * anInt3896 + is_234_[4] * anInt3898 + is_234_[7] * anInt3904 + 16384 >> 15;
					int i_263_ = is_234_[2] * anInt3896 + is_234_[5] * anInt3898 + is_234_[8] * anInt3904 + 16384 >> 15;
					i_261_ += i_258_;
					i_262_ += i_259_;
					i_263_ += i_260_;
					anInt3896 = i_261_;
					anInt3898 = i_262_;
					anInt3904 = i_263_;
					aBoolean3897 = false;
				}
				final int[] is_264_ = new int[9];
				final int i_265_ = Rasterizer.cosineTable[i_230_] >> 1;
				final int i_266_ = Rasterizer.sineTable[i_230_] >> 1;
				final int i_267_ = Rasterizer.cosineTable[i_231_] >> 1;
				final int i_268_ = Rasterizer.sineTable[i_231_] >> 1;
				final int i_269_ = Rasterizer.cosineTable[i_232_] >> 1;
				final int i_270_ = Rasterizer.sineTable[i_232_] >> 1;
				final int i_271_ = i_266_ * i_269_ + 16384 >> 15;
				final int i_272_ = i_266_ * i_270_ + 16384 >> 15;
				is_264_[0] = i_267_ * i_269_ + i_268_ * i_272_ + 16384 >> 15;
				is_264_[1] = -i_267_ * i_270_ + i_268_ * i_271_ + 16384 >> 15;
				is_264_[2] = i_268_ * i_265_ + 16384 >> 15;
				is_264_[3] = i_265_ * i_270_ + 16384 >> 15;
				is_264_[4] = i_265_ * i_269_ + 16384 >> 15;
				is_264_[5] = -i_266_;
				is_264_[6] = -i_268_ * i_269_ + i_267_ * i_272_ + 16384 >> 15;
				is_264_[7] = i_268_ * i_270_ + i_267_ * i_271_ + 16384 >> 15;
				is_264_[8] = i_267_ * i_265_ + 16384 >> 15;
				final int i_273_ = is_264_[0] * -anInt3896 + is_264_[1] * -anInt3898 + is_264_[2] * -anInt3904 + 16384 >> 15;
				final int i_274_ = is_264_[3] * -anInt3896 + is_264_[4] * -anInt3898 + is_264_[5] * -anInt3904 + 16384 >> 15;
				final int i_275_ = is_264_[6] * -anInt3896 + is_264_[7] * -anInt3898 + is_264_[8] * -anInt3904 + 16384 >> 15;
				final int i_276_ = i_273_ + anInt3896;
				final int i_277_ = i_274_ + anInt3898;
				final int i_278_ = i_275_ + anInt3904;
				final int[] is_279_ = new int[9];
				for (int i_280_ = 0; i_280_ < 3; i_280_++) {
					for (int i_281_ = 0; i_281_ < 3; i_281_++) {
						int i_282_ = 0;
						for (int i_283_ = 0; i_283_ < 3; i_283_++) {
							i_282_ += is_264_[i_280_ * 3 + i_283_] * is_234_[i_281_ * 3 + i_283_];
						}
						is_279_[i_280_ * 3 + i_281_] = i_282_ + 16384 >> 15;
					}
				}
				int i_284_ = is_264_[0] * i_258_ + is_264_[1] * i_259_ + is_264_[2] * i_260_ + 16384 >> 15;
				int i_285_ = is_264_[3] * i_258_ + is_264_[4] * i_259_ + is_264_[5] * i_260_ + 16384 >> 15;
				int i_286_ = is_264_[6] * i_258_ + is_264_[7] * i_259_ + is_264_[8] * i_260_ + 16384 >> 15;
				i_284_ += i_276_;
				i_285_ += i_277_;
				i_286_ += i_278_;
				final int[] is_287_ = new int[9];
				for (int i_288_ = 0; i_288_ < 3; i_288_++) {
					for (int i_289_ = 0; i_289_ < 3; i_289_++) {
						int i_290_ = 0;
						for (int i_291_ = 0; i_291_ < 3; i_291_++) {
							i_290_ += is_234_[i_288_ * 3 + i_291_] * is_279_[i_289_ + i_291_ * 3];
						}
						is_287_[i_288_ * 3 + i_289_] = i_290_ + 16384 >> 15;
					}
				}
				int i_292_ = is_234_[0] * i_284_ + is_234_[1] * i_285_ + is_234_[2] * i_286_ + 16384 >> 15;
				int i_293_ = is_234_[3] * i_284_ + is_234_[4] * i_285_ + is_234_[5] * i_286_ + 16384 >> 15;
				int i_294_ = is_234_[6] * i_284_ + is_234_[7] * i_285_ + is_234_[8] * i_286_ + 16384 >> 15;
				i_292_ += i_255_;
				i_293_ += i_256_;
				i_294_ += i_257_;
				for (int i_295_ = 0; i_295_ < i_235_; i_295_++) {
					final int i_296_ = is[i_295_];
					if (i_296_ < anIntArrayArray3881.length) {
						final int[] is_297_ = anIntArrayArray3881[i_296_];
						int[] is_299_;
						final int i_298_ = (is_299_ = is_297_).length;
						for (int i_300_ = 0; i_300_ < i_298_; i_300_++) {
							final int i_301_ = is_299_[i_300_];
							final int i_302_ = i_301_;
							if (aShortArray3876 == null || (i_233_ & aShortArray3876[i_302_]) != 0) {
								int i_303_ = is_287_[0] * this.anIntArray3878[i_302_] + is_287_[1] * this.anIntArray3856[i_302_] + is_287_[2] * this.anIntArray3845[i_302_] + 16384 >> 15;
								int i_304_ = is_287_[3] * this.anIntArray3878[i_302_] + is_287_[4] * this.anIntArray3856[i_302_] + is_287_[5] * this.anIntArray3845[i_302_] + 16384 >> 15;
								int i_305_ = is_287_[6] * this.anIntArray3878[i_302_] + is_287_[7] * this.anIntArray3856[i_302_] + is_287_[8] * this.anIntArray3845[i_302_] + 16384 >> 15;
								i_303_ += i_292_;
								i_304_ += i_293_;
								i_305_ += i_294_;
								this.anIntArray3878[i_302_] = i_303_;
								this.anIntArray3856[i_302_] = i_304_;
								this.anIntArray3845[i_302_] = i_305_;
							}
						}
					}
				}
			} else {
				for (int i_306_ = 0; i_306_ < i_235_; i_306_++) {
					final int i_307_ = is[i_306_];
					if (i_307_ < anIntArrayArray3881.length) {
						final int[] is_308_ = anIntArrayArray3881[i_307_];
						int[] is_310_;
						final int i_309_ = (is_310_ = is_308_).length;
						for (int i_311_ = 0; i_311_ < i_309_; i_311_++) {
							final int i_312_ = is_310_[i_311_];
							final int i_313_ = i_312_;
							if (aShortArray3876 == null || (i_233_ & aShortArray3876[i_313_]) != 0) {
								this.anIntArray3878[i_313_] -= anInt3896;
								this.anIntArray3856[i_313_] -= anInt3898;
								this.anIntArray3845[i_313_] -= anInt3904;
								if (i_232_ != 0) {
									final int i_314_ = Rasterizer.sineTable[i_232_];
									final int i_315_ = Rasterizer.cosineTable[i_232_];
									final int i_316_ = this.anIntArray3856[i_313_] * i_314_ + this.anIntArray3878[i_313_] * i_315_ + 32767 >> 16;
									this.anIntArray3856[i_313_] = this.anIntArray3856[i_313_] * i_315_ - this.anIntArray3878[i_313_] * i_314_ + 32767 >> 16;
									this.anIntArray3878[i_313_] = i_316_;
								}
								if (i_230_ != 0) {
									final int i_317_ = Rasterizer.sineTable[i_230_];
									final int i_318_ = Rasterizer.cosineTable[i_230_];
									final int i_319_ = this.anIntArray3856[i_313_] * i_318_ - this.anIntArray3845[i_313_] * i_317_ + 32767 >> 16;
									this.anIntArray3845[i_313_] = this.anIntArray3856[i_313_] * i_317_ + this.anIntArray3845[i_313_] * i_318_ + 32767 >> 16;
									this.anIntArray3856[i_313_] = i_319_;
								}
								if (i_231_ != 0) {
									final int i_320_ = Rasterizer.sineTable[i_231_];
									final int i_321_ = Rasterizer.cosineTable[i_231_];
									final int i_322_ = this.anIntArray3845[i_313_] * i_320_ + this.anIntArray3878[i_313_] * i_321_ + 32767 >> 16;
									this.anIntArray3845[i_313_] = this.anIntArray3845[i_313_] * i_321_ - this.anIntArray3878[i_313_] * i_320_ + 32767 >> 16;
									this.anIntArray3878[i_313_] = i_322_;
								}
								this.anIntArray3878[i_313_] += anInt3896;
								this.anIntArray3856[i_313_] += anInt3898;
								this.anIntArray3845[i_313_] += anInt3904;
							}
						}
					}
				}
				if (bool && aShortArray3873 != null) {
					for (int i_323_ = 0; i_323_ < i_235_; i_323_++) {
						final int i_324_ = is[i_323_];
						if (i_324_ < anIntArrayArray3881.length) {
							final int[] is_325_ = anIntArrayArray3881[i_324_];
							int[] is_327_;
							final int i_326_ = (is_327_ = is_325_).length;
							for (int i_328_ = 0; i_328_ < i_326_; i_328_++) {
								final int i_329_ = is_327_[i_328_];
								if (aShortArray3876 == null || (i_233_ & aShortArray3876[i_329_]) != 0) {
									final int i_330_ = anIntArray3875[i_329_];
									final int i_331_ = anIntArray3875[i_329_ + 1];
									for (int i_332_ = i_330_; i_332_ < i_331_; i_332_++) {
										final int i_333_ = aShortArray3864[i_332_] - 1;
										if (i_333_ == -1) {
											break;
										}
										if (i_232_ != 0) {
											final int i_334_ = Rasterizer.sineTable[i_232_];
											final int i_335_ = Rasterizer.cosineTable[i_232_];
											final int i_336_ = aShortArray3852[i_333_] * i_334_ + aShortArray3873[i_333_] * i_335_ + 32767 >> 16;
											aShortArray3852[i_333_] = (short) (aShortArray3852[i_333_] * i_335_ - aShortArray3873[i_333_] * i_334_ + 32767 >> 16);
											aShortArray3873[i_333_] = (short) i_336_;
										}
										if (i_230_ != 0) {
											final int i_337_ = Rasterizer.sineTable[i_230_];
											final int i_338_ = Rasterizer.cosineTable[i_230_];
											final int i_339_ = aShortArray3852[i_333_] * i_338_ - aShortArray3844[i_333_] * i_337_ + 32767 >> 16;
											aShortArray3844[i_333_] = (short) (aShortArray3852[i_333_] * i_337_ + aShortArray3844[i_333_] * i_338_ + 32767 >> 16);
											aShortArray3852[i_333_] = (short) i_339_;
										}
										if (i_231_ != 0) {
											final int i_340_ = Rasterizer.sineTable[i_231_];
											final int i_341_ = Rasterizer.cosineTable[i_231_];
											final int i_342_ = aShortArray3844[i_333_] * i_340_ + aShortArray3873[i_333_] * i_341_ + 32767 >> 16;
											aShortArray3844[i_333_] = (short) (aShortArray3844[i_333_] * i_341_ - aShortArray3873[i_333_] * i_340_ + 32767 >> 16);
											aShortArray3873[i_333_] = (short) i_342_;
										}
									}
								}
							}
						}
					}
					if (aClass49_3848 != null) {
						aClass49_3848.aBoolean439 = false;
					}
				}
			}
		} else if (i == 3) {
			if (is_234_ != null) {
				final int i_343_ = is_234_[9] << 4;
				final int i_344_ = is_234_[10] << 4;
				final int i_345_ = is_234_[11] << 4;
				final int i_346_ = is_234_[12] << 4;
				final int i_347_ = is_234_[13] << 4;
				final int i_348_ = is_234_[14] << 4;
				if (aBoolean3897) {
					int i_349_ = is_234_[0] * anInt3896 + is_234_[3] * anInt3898 + is_234_[6] * anInt3904 + 16384 >> 15;
					int i_350_ = is_234_[1] * anInt3896 + is_234_[4] * anInt3898 + is_234_[7] * anInt3904 + 16384 >> 15;
					int i_351_ = is_234_[2] * anInt3896 + is_234_[5] * anInt3898 + is_234_[8] * anInt3904 + 16384 >> 15;
					i_349_ += i_346_;
					i_350_ += i_347_;
					i_351_ += i_348_;
					anInt3896 = i_349_;
					anInt3898 = i_350_;
					anInt3904 = i_351_;
					aBoolean3897 = false;
				}
				final int i_352_ = i_230_ << 15 >> 7;
				final int i_353_ = i_231_ << 15 >> 7;
				final int i_354_ = i_232_ << 15 >> 7;
				final int i_355_ = i_352_ * -anInt3896 + 16384 >> 15;
				final int i_356_ = i_353_ * -anInt3898 + 16384 >> 15;
				final int i_357_ = i_354_ * -anInt3904 + 16384 >> 15;
				final int i_358_ = i_355_ + anInt3896;
				final int i_359_ = i_356_ + anInt3898;
				final int i_360_ = i_357_ + anInt3904;
				final int[] is_361_ = new int[9];
				is_361_[0] = i_352_ * is_234_[0] + 16384 >> 15;
				is_361_[1] = i_352_ * is_234_[3] + 16384 >> 15;
				is_361_[2] = i_352_ * is_234_[6] + 16384 >> 15;
				is_361_[3] = i_353_ * is_234_[1] + 16384 >> 15;
				is_361_[4] = i_353_ * is_234_[4] + 16384 >> 15;
				is_361_[5] = i_353_ * is_234_[7] + 16384 >> 15;
				is_361_[6] = i_354_ * is_234_[2] + 16384 >> 15;
				is_361_[7] = i_354_ * is_234_[5] + 16384 >> 15;
				is_361_[8] = i_354_ * is_234_[8] + 16384 >> 15;
				int i_362_ = i_352_ * i_346_ + 16384 >> 15;
				int i_363_ = i_353_ * i_347_ + 16384 >> 15;
				int i_364_ = i_354_ * i_348_ + 16384 >> 15;
				i_362_ += i_358_;
				i_363_ += i_359_;
				i_364_ += i_360_;
				final int[] is_365_ = new int[9];
				for (int i_366_ = 0; i_366_ < 3; i_366_++) {
					for (int i_367_ = 0; i_367_ < 3; i_367_++) {
						int i_368_ = 0;
						for (int i_369_ = 0; i_369_ < 3; i_369_++) {
							i_368_ += is_234_[i_366_ * 3 + i_369_] * is_361_[i_367_ + i_369_ * 3];
						}
						is_365_[i_366_ * 3 + i_367_] = i_368_ + 16384 >> 15;
					}
				}
				int i_370_ = is_234_[0] * i_362_ + is_234_[1] * i_363_ + is_234_[2] * i_364_ + 16384 >> 15;
				int i_371_ = is_234_[3] * i_362_ + is_234_[4] * i_363_ + is_234_[5] * i_364_ + 16384 >> 15;
				int i_372_ = is_234_[6] * i_362_ + is_234_[7] * i_363_ + is_234_[8] * i_364_ + 16384 >> 15;
				i_370_ += i_343_;
				i_371_ += i_344_;
				i_372_ += i_345_;
				for (int i_373_ = 0; i_373_ < i_235_; i_373_++) {
					final int i_374_ = is[i_373_];
					if (i_374_ < anIntArrayArray3881.length) {
						final int[] is_375_ = anIntArrayArray3881[i_374_];
						int[] is_377_;
						final int i_376_ = (is_377_ = is_375_).length;
						for (int i_378_ = 0; i_378_ < i_376_; i_378_++) {
							final int i_379_ = is_377_[i_378_];
							final int i_380_ = i_379_;
							if (aShortArray3876 == null || (i_233_ & aShortArray3876[i_380_]) != 0) {
								int i_381_ = is_365_[0] * this.anIntArray3878[i_380_] + is_365_[1] * this.anIntArray3856[i_380_] + is_365_[2] * this.anIntArray3845[i_380_] + 16384 >> 15;
								int i_382_ = is_365_[3] * this.anIntArray3878[i_380_] + is_365_[4] * this.anIntArray3856[i_380_] + is_365_[5] * this.anIntArray3845[i_380_] + 16384 >> 15;
								int i_383_ = is_365_[6] * this.anIntArray3878[i_380_] + is_365_[7] * this.anIntArray3856[i_380_] + is_365_[8] * this.anIntArray3845[i_380_] + 16384 >> 15;
								i_381_ += i_370_;
								i_382_ += i_371_;
								i_383_ += i_372_;
								this.anIntArray3878[i_380_] = i_381_;
								this.anIntArray3856[i_380_] = i_382_;
								this.anIntArray3845[i_380_] = i_383_;
							}
						}
					}
				}
			} else {
				for (int i_384_ = 0; i_384_ < i_235_; i_384_++) {
					final int i_385_ = is[i_384_];
					if (i_385_ < anIntArrayArray3881.length) {
						final int[] is_386_ = anIntArrayArray3881[i_385_];
						int[] is_388_;
						final int i_387_ = (is_388_ = is_386_).length;
						for (int i_389_ = 0; i_389_ < i_387_; i_389_++) {
							final int i_390_ = is_388_[i_389_];
							final int i_391_ = i_390_;
							if (aShortArray3876 == null || (i_233_ & aShortArray3876[i_391_]) != 0) {
								this.anIntArray3878[i_391_] -= anInt3896;
								this.anIntArray3856[i_391_] -= anInt3898;
								this.anIntArray3845[i_391_] -= anInt3904;
								this.anIntArray3878[i_391_] = this.anIntArray3878[i_391_] * i_230_ >> 7;
								this.anIntArray3856[i_391_] = this.anIntArray3856[i_391_] * i_231_ >> 7;
								this.anIntArray3845[i_391_] = this.anIntArray3845[i_391_] * i_232_ >> 7;
								this.anIntArray3878[i_391_] += anInt3896;
								this.anIntArray3856[i_391_] += anInt3898;
								this.anIntArray3845[i_391_] += anInt3904;
							}
						}
					}
				}
			}
		} else if (i == 5) {
			if (anIntArrayArray3886 != null && aByteArray3884 != null) {
				for (int i_392_ = 0; i_392_ < i_235_; i_392_++) {
					final int i_393_ = is[i_392_];
					if (i_393_ < anIntArrayArray3886.length) {
						final int[] is_394_ = anIntArrayArray3886[i_393_];
						int[] is_396_;
						final int i_395_ = (is_396_ = is_394_).length;
						for (int i_397_ = 0; i_397_ < i_395_; i_397_++) {
							final int i_398_ = is_396_[i_397_];
							final int i_399_ = i_398_;
							if (aShortArray3846 == null || (i_233_ & aShortArray3846[i_399_]) != 0) {
								int i_400_ = (aByteArray3884[i_399_] & 0xff) + i_230_ * 8;
								if (i_400_ < 0) {
									i_400_ = 0;
								} else if (i_400_ > 255) {
									i_400_ = 255;
								}
								aByteArray3884[i_399_] = (byte) i_400_;
							}
						}
						if (is_394_.length > 0) {
							aClass49_3869.aBoolean439 = false;
						}
					}
				}
			}
		} else if (i == 7 && anIntArrayArray3886 != null) {
			for (int i_401_ = 0; i_401_ < i_235_; i_401_++) {
				final int i_402_ = is[i_401_];
				if (i_402_ < anIntArrayArray3886.length) {
					final int[] is_403_ = anIntArrayArray3886[i_402_];
					int[] is_405_;
					final int i_404_ = (is_405_ = is_403_).length;
					for (int i_406_ = 0; i_406_ < i_404_; i_406_++) {
						final int i_407_ = is_405_[i_406_];
						final int i_408_ = i_407_;
						if (aShortArray3846 == null || (i_233_ & aShortArray3846[i_408_]) != 0) {
							final int i_409_ = aShortArray3857[i_408_] & 0xffff;
							int i_410_ = i_409_ >> 10 & 0x3f;
							int i_411_ = i_409_ >> 7 & 0x7;
							int i_412_ = i_409_ & 0x7f;
							i_410_ = i_410_ + i_230_ & 0x3f;
							i_411_ += i_231_ / 4;
							if (i_411_ < 0) {
								i_411_ = 0;
							} else if (i_411_ > 7) {
								i_411_ = 7;
							}
							i_412_ += i_232_;
							if (i_412_ < 0) {
								i_412_ = 0;
							} else if (i_412_ > 127) {
								i_412_ = 127;
							}
							aShortArray3857[i_408_] = (short) (i_410_ << 10 | i_411_ << 7 | i_412_);
						}
					}
					if (is_403_.length > 0) {
						aClass49_3869.aBoolean439 = false;
					}
				}
			}
		}
	}

	final void method2417(final int i) {
		if (aShortArray3873 == null) {
			method2360(i);
		} else {
			final int i_413_ = Rasterizer.sineTable[i];
			final int i_414_ = Rasterizer.cosineTable[i];
			for (int i_415_ = 0; i_415_ < this.anInt3862; i_415_++) {
				final int i_416_ = this.anIntArray3845[i_415_] * i_413_ + this.anIntArray3878[i_415_] * i_414_ >> 16;
				this.anIntArray3845[i_415_] = this.anIntArray3845[i_415_] * i_414_ - this.anIntArray3878[i_415_] * i_413_ >> 16;
				this.anIntArray3878[i_415_] = i_416_;
			}
			for (int i_417_ = 0; i_417_ < anInt3890; i_417_++) {
				final int i_418_ = aShortArray3844[i_417_] * i_413_ + aShortArray3873[i_417_] * i_414_ >> 16;
				aShortArray3844[i_417_] = (short) (aShortArray3844[i_417_] * i_414_ - aShortArray3873[i_417_] * i_413_ >> 16);
				aShortArray3873[i_417_] = (short) i_418_;
			}
			this.aClass13_3870.aBoolean89 = false;
			this.aClass49_3847.aBoolean439 = false;
			if (aClass49_3848 != null) {
				aClass49_3848.aBoolean439 = false;
			}
		}
	}

	private final void method2418() {
		final GL gl = HDToolkit.gl;
		if (anInt3867 != 0) {
			if (aByte3860 != 0) {
				method2430(true, !this.aClass49_3847.aBoolean439 && (aByte3860 & 0x1) != 0, !aClass49_3869.aBoolean439 && (aByte3860 & 0x2) != 0, aClass49_3848 != null && !aClass49_3848.aBoolean439 && (aByte3860 & 0x4) != 0, false);
			}
			method2430(false, !this.aClass49_3847.aBoolean439, !aClass49_3869.aBoolean439, aClass49_3848 != null && !aClass49_3848.aBoolean439, !aClass49_3854.aBoolean439);
			if (!aClass49_3863.aBoolean439) {
				method2411();
			}
			if (aByte3888 != 0) {
				if ((aByte3888 & 0x1) != 0) {
					this.anIntArray3878 = null;
					this.anIntArray3856 = null;
					this.anIntArray3845 = null;
					aShortArray3864 = null;
					anIntArray3875 = null;
				}
				if ((aByte3888 & 0x2) != 0) {
					aShortArray3857 = null;
					aByteArray3884 = null;
				}
				if ((aByte3888 & 0x4) != 0) {
					aShortArray3873 = null;
					aShortArray3852 = null;
					aShortArray3844 = null;
					aShortArray3849 = null;
				}
				if ((aByte3888 & 0x8) != 0) {
					aFloatArray3874 = null;
					aFloatArray3868 = null;
				}
				if ((aByte3888 & 0x10) != 0) {
					aShortArray3866 = null;
					aShortArray3877 = null;
					aShortArray3879 = null;
				}
				aByte3888 = (byte) 0;
			}
			Class104 class104 = null;
			if (this.aClass49_3847.aClass104_445 != null) {
				this.aClass49_3847.aClass104_445.method887();
				class104 = this.aClass49_3847.aClass104_445;
				gl.glVertexPointer(3, 5126, this.aClass49_3847.anInt444, this.aClass49_3847.anInt442);
			}
			if (aClass49_3869.aClass104_445 != null) {
				if (class104 != aClass49_3869.aClass104_445) {
					aClass49_3869.aClass104_445.method887();
					class104 = aClass49_3869.aClass104_445;
				}
				gl.glColorPointer(4, 5121, aClass49_3869.anInt444, aClass49_3869.anInt442);
			}
			if (Class120_Sub12_Sub6.highLightingDetail && aClass49_3848.aClass104_445 != null) {
				if (class104 != aClass49_3848.aClass104_445) {
					aClass49_3848.aClass104_445.method887();
					class104 = aClass49_3848.aClass104_445;
				}
				gl.glNormalPointer(5126, aClass49_3848.anInt444, aClass49_3848.anInt442);
			}
			if (aClass49_3854.aClass104_445 != null) {
				if (class104 != aClass49_3854.aClass104_445) {
					aClass49_3854.aClass104_445.method887();
					class104 = aClass49_3854.aClass104_445;
				}
				gl.glTexCoordPointer(2, 5126, aClass49_3854.anInt444, aClass49_3854.anInt442);
			}
			if (aClass49_3863.aClass104_445 != null) {
				aClass49_3863.aClass104_445.method886();
			}
			if (this.aClass49_3847.aClass104_445 == null || aClass49_3869.aClass104_445 == null || Class120_Sub12_Sub6.highLightingDetail && aClass49_3848.aClass104_445 == null || aClass49_3854.aClass104_445 == null) {
				if (HDToolkit.vertexBufferAsObject) {
					gl.glBindBufferARB(34962, 0);
				}
				if (this.aClass49_3847.aClass104_445 == null) {
					this.aClass49_3847.aByteBuffer443.position(this.aClass49_3847.anInt442);
					gl.glVertexPointer(3, 5126, this.aClass49_3847.anInt444, this.aClass49_3847.aByteBuffer443);
				}
				if (aClass49_3869.aClass104_445 == null) {
					aClass49_3869.aByteBuffer443.position(aClass49_3869.anInt442);
					gl.glColorPointer(4, 5121, aClass49_3869.anInt444, aClass49_3869.aByteBuffer443);
				}
				if (Class120_Sub12_Sub6.highLightingDetail && aClass49_3848.aClass104_445 == null) {
					aClass49_3848.aByteBuffer443.position(aClass49_3848.anInt442);
					gl.glNormalPointer(5126, aClass49_3848.anInt444, aClass49_3848.aByteBuffer443);
				}
				if (aClass49_3854.aClass104_445 == null) {
					aClass49_3854.aByteBuffer443.position(aClass49_3854.anInt442);
					gl.glTexCoordPointer(2, 5126, aClass49_3854.anInt444, aClass49_3854.aByteBuffer443);
				}
			}
			if (aClass49_3863.aClass104_445 == null && HDToolkit.vertexBufferAsObject) {
				gl.glBindBufferARB(34963, 0);
			}
			final int i = anIntArray3865.length - 1;
			for (int i_419_ = 0; i_419_ < i; i_419_++) {
				final int i_420_ = anIntArray3865[i_419_];
				final int i_421_ = anIntArray3865[i_419_ + 1];
				final int i_422_ = aShortArray3855[i_420_];
				if (i_422_ == -1) {
					HDToolkit.method514(-1);
					Class120_Sub14_Sub13.method1532(0, 0);
				} else {
					Rasterizer.anInterface5_973.method25(64, i_422_ & 0xffff);
				}
				if (aClass49_3863.aClass104_445 != null) {
					gl.glDrawElements(4, (i_421_ - i_420_) * 3, 5125, i_420_ * 12);
				} else {
					aClass49_3863.aByteBuffer443.position(i_420_ * 12);
					gl.glDrawElements(4, (i_421_ - i_420_) * 3, 5125, aClass49_3863.aByteBuffer443);
				}
			}
		}
	}

	@Override
	final int method2383() {
		if (!this.aClass13_3870.aBoolean89) {
			method2425();
		}
		return this.aClass13_3870.aShort91;
	}

	@Override
	final void method2364() {
		for (int i = 0; i < this.anInt3862; i++) {
			this.anIntArray3878[i] = this.anIntArray3878[i] + 7 >> 4;
			this.anIntArray3856[i] = this.anIntArray3856[i] + 7 >> 4;
			this.anIntArray3845[i] = this.anIntArray3845[i] + 7 >> 4;
		}
		this.aClass13_3870.aBoolean89 = false;
		this.aClass49_3847.aBoolean439 = false;
	}

	@Override
	final void method2369(final int i, final int i_423_, final int i_424_) {
		for (int i_425_ = 0; i_425_ < this.anInt3862; i_425_++) {
			this.anIntArray3878[i_425_] = this.anIntArray3878[i_425_] * i >> 7;
			this.anIntArray3856[i_425_] = this.anIntArray3856[i_425_] * i_423_ >> 7;
			this.anIntArray3845[i_425_] = this.anIntArray3845[i_425_] * i_424_ >> 7;
		}
		this.aClass13_3870.aBoolean89 = false;
		this.aClass49_3847.aBoolean439 = false;
	}

	final void method2419(final int i, final int i_426_, final Class180_Sub7_Sub2 class180_sub7_sub2_427_, final int[][] is, final int[][] is_428_, final int i_429_, final int i_430_, final int i_431_) {
		if (!class180_sub7_sub2_427_.aClass13_3870.aBoolean89) {
			class180_sub7_sub2_427_.method2425();
		}
		int i_432_ = i_429_ + class180_sub7_sub2_427_.aClass13_3870.aShort90;
		int i_433_ = i_429_ + class180_sub7_sub2_427_.aClass13_3870.aShort91;
		int i_434_ = i_431_ + class180_sub7_sub2_427_.aClass13_3870.aShort88;
		int i_435_ = i_431_ + class180_sub7_sub2_427_.aClass13_3870.aShort92;
		if (i != 1 && i != 2 && i != 3 && i != 5 || i_432_ >= 0 && i_433_ + 128 >> 7 < is.length && i_434_ >= 0 && i_435_ + 128 >> 7 < is[0].length) {
			if (i == 4 || i == 5) {
				if (is_428_ == null || i_432_ < 0 || i_433_ + 128 >> 7 >= is_428_.length || i_434_ < 0 || i_435_ + 128 >> 7 >= is_428_[0].length) {
					return;
				}
			} else {
				i_432_ >>= 7;
				i_433_ = i_433_ + 127 >> 7;
				i_434_ >>= 7;
				i_435_ = i_435_ + 127 >> 7;
				if (is[i_432_][i_434_] == i_430_ && is[i_433_][i_434_] == i_430_ && is[i_432_][i_435_] == i_430_ && is[i_433_][i_435_] == i_430_) {
					return;
				}
			}
			if (i == 1) {
				for (int i_436_ = 0; i_436_ < anInt3861; i_436_++) {
					final int i_437_ = this.anIntArray3878[i_436_] + i_429_;
					final int i_438_ = this.anIntArray3845[i_436_] + i_431_;
					final int i_439_ = i_437_ & 0x7f;
					final int i_440_ = i_438_ & 0x7f;
					final int i_441_ = i_437_ >> 7;
					final int i_442_ = i_438_ >> 7;
					final int i_443_ = is[i_441_][i_442_] * (128 - i_439_) + is[i_441_ + 1][i_442_] * i_439_ >> 7;
					final int i_444_ = is[i_441_][i_442_ + 1] * (128 - i_439_) + is[i_441_ + 1][i_442_ + 1] * i_439_ >> 7;
					final int i_445_ = i_443_ * (128 - i_440_) + i_444_ * i_440_ >> 7;
					this.anIntArray3856[i_436_] = this.anIntArray3856[i_436_] + i_445_ - i_430_;
				}
			} else if (i == 2) {
				final int i_446_ = class180_sub7_sub2_427_.aClass13_3870.aShort94;
				for (int i_447_ = 0; i_447_ < anInt3861; i_447_++) {
					final int i_448_ = (this.anIntArray3856[i_447_] << 16) / i_446_;
					if (i_448_ < i_426_) {
						final int i_449_ = this.anIntArray3878[i_447_] + i_429_;
						final int i_450_ = this.anIntArray3845[i_447_] + i_431_;
						final int i_451_ = i_449_ & 0x7f;
						final int i_452_ = i_450_ & 0x7f;
						final int i_453_ = i_449_ >> 7;
						final int i_454_ = i_450_ >> 7;
						final int i_455_ = is[i_453_][i_454_] * (128 - i_451_) + is[i_453_ + 1][i_454_] * i_451_ >> 7;
						final int i_456_ = is[i_453_][i_454_ + 1] * (128 - i_451_) + is[i_453_ + 1][i_454_ + 1] * i_451_ >> 7;
						final int i_457_ = i_455_ * (128 - i_452_) + i_456_ * i_452_ >> 7;
						this.anIntArray3856[i_447_] = this.anIntArray3856[i_447_] + (i_457_ - i_430_) * (i_426_ - i_448_) / i_426_;
					}
				}
			} else if (i == 3) {
				final int i_458_ = (i_426_ & 0xff) * 4;
				final int i_459_ = (i_426_ >> 8 & 0xff) * 4;
				method2385(is, i_429_, i_430_, i_431_, i_458_, i_459_);
			} else if (i == 4) {
				final int i_460_ = class180_sub7_sub2_427_.aClass13_3870.aShort87 - class180_sub7_sub2_427_.aClass13_3870.aShort94;
				for (int i_461_ = 0; i_461_ < anInt3861; i_461_++) {
					final int i_462_ = this.anIntArray3878[i_461_] + i_429_;
					final int i_463_ = this.anIntArray3845[i_461_] + i_431_;
					final int i_464_ = i_462_ & 0x7f;
					final int i_465_ = i_463_ & 0x7f;
					final int i_466_ = i_462_ >> 7;
					final int i_467_ = i_463_ >> 7;
					final int i_468_ = is_428_[i_466_][i_467_] * (128 - i_464_) + is_428_[i_466_ + 1][i_467_] * i_464_ >> 7;
					final int i_469_ = is_428_[i_466_][i_467_ + 1] * (128 - i_464_) + is_428_[i_466_ + 1][i_467_ + 1] * i_464_ >> 7;
					final int i_470_ = i_468_ * (128 - i_465_) + i_469_ * i_465_ >> 7;
					this.anIntArray3856[i_461_] = this.anIntArray3856[i_461_] + i_470_ - i_430_ + i_460_;
				}
			} else if (i == 5) {
				final int i_471_ = class180_sub7_sub2_427_.aClass13_3870.aShort87 - class180_sub7_sub2_427_.aClass13_3870.aShort94;
				for (int i_472_ = 0; i_472_ < anInt3861; i_472_++) {
					final int i_473_ = this.anIntArray3878[i_472_] + i_429_;
					final int i_474_ = this.anIntArray3845[i_472_] + i_431_;
					final int i_475_ = i_473_ & 0x7f;
					final int i_476_ = i_474_ & 0x7f;
					final int i_477_ = i_473_ >> 7;
					final int i_478_ = i_474_ >> 7;
					int i_479_ = is[i_477_][i_478_] * (128 - i_475_) + is[i_477_ + 1][i_478_] * i_475_ >> 7;
					int i_480_ = is[i_477_][i_478_ + 1] * (128 - i_475_) + is[i_477_ + 1][i_478_ + 1] * i_475_ >> 7;
					final int i_481_ = i_479_ * (128 - i_476_) + i_480_ * i_476_ >> 7;
					i_479_ = is_428_[i_477_][i_478_] * (128 - i_475_) + is_428_[i_477_ + 1][i_478_] * i_475_ >> 7;
					i_480_ = is_428_[i_477_][i_478_ + 1] * (128 - i_475_) + is_428_[i_477_ + 1][i_478_ + 1] * i_475_ >> 7;
					final int i_482_ = i_479_ * (128 - i_476_) + i_480_ * i_476_ >> 7;
					final int i_483_ = i_481_ - i_482_;
					this.anIntArray3856[i_472_] = ((this.anIntArray3856[i_472_] << 8) / i_471_ * i_483_ >> 8) - (i_430_ - i_481_);
				}
			}
			this.aClass49_3847.aBoolean439 = false;
			this.aClass13_3870.aBoolean89 = false;
		}
	}

	private static final short[] method2420(final short[] is, final int i) {
		final short[] is_484_ = new short[i];
		ArrayUtils.arrayCopy(is, 0, is_484_, 0, i);
		return is_484_;
	}

	final void method2421(final int i) {
		aShort3853 = (short) i;
		if (aClass49_3848 != null) {
			aClass49_3848.aBoolean439 = false;
		}
	}

	@Override
	final void method2267(final SceneGraphNode sceneGraphNode, final int i, final int i_485_, final int i_486_, final boolean bool) {
		final Class180_Sub7_Sub2 class180_sub7_sub2_487_ = (Class180_Sub7_Sub2) sceneGraphNode;
		if (anInt3867 != 0 && class180_sub7_sub2_487_.anInt3867 != 0) {
			final int i_488_ = class180_sub7_sub2_487_.anInt3861;
			final int[] is = class180_sub7_sub2_487_.anIntArray3878;
			final int[] is_489_ = class180_sub7_sub2_487_.anIntArray3856;
			final int[] is_490_ = class180_sub7_sub2_487_.anIntArray3845;
			final short[] is_491_ = class180_sub7_sub2_487_.aShortArray3873;
			final short[] is_492_ = class180_sub7_sub2_487_.aShortArray3852;
			final short[] is_493_ = class180_sub7_sub2_487_.aShortArray3844;
			final short[] is_494_ = class180_sub7_sub2_487_.aShortArray3849;
			short[] is_495_;
			short[] is_496_;
			short[] is_497_;
			short[] is_498_;
			if (aClass152_3859 != null) {
				is_495_ = aClass152_3859.aShortArray1425;
				is_496_ = aClass152_3859.aShortArray1423;
				is_497_ = aClass152_3859.aShortArray1424;
				is_498_ = aClass152_3859.aShortArray1426;
			} else {
				is_495_ = null;
				is_496_ = null;
				is_497_ = null;
				is_498_ = null;
			}
			short[] is_499_;
			short[] is_500_;
			short[] is_501_;
			short[] is_502_;
			if (class180_sub7_sub2_487_.aClass152_3859 != null) {
				is_499_ = class180_sub7_sub2_487_.aClass152_3859.aShortArray1425;
				is_500_ = class180_sub7_sub2_487_.aClass152_3859.aShortArray1423;
				is_501_ = class180_sub7_sub2_487_.aClass152_3859.aShortArray1424;
				is_502_ = class180_sub7_sub2_487_.aClass152_3859.aShortArray1426;
			} else {
				is_499_ = null;
				is_500_ = null;
				is_501_ = null;
				is_502_ = null;
			}
			final int[] is_503_ = class180_sub7_sub2_487_.anIntArray3875;
			final short[] is_504_ = class180_sub7_sub2_487_.aShortArray3864;
			if (!class180_sub7_sub2_487_.aClass13_3870.aBoolean89) {
				class180_sub7_sub2_487_.method2425();
			}
			final int i_505_ = class180_sub7_sub2_487_.aClass13_3870.aShort94;
			final int i_506_ = class180_sub7_sub2_487_.aClass13_3870.aShort87;
			final int i_507_ = class180_sub7_sub2_487_.aClass13_3870.aShort90;
			final int i_508_ = class180_sub7_sub2_487_.aClass13_3870.aShort91;
			final int i_509_ = class180_sub7_sub2_487_.aClass13_3870.aShort88;
			final int i_510_ = class180_sub7_sub2_487_.aClass13_3870.aShort92;
			for (int i_511_ = 0; i_511_ < anInt3861; i_511_++) {
				final int i_512_ = this.anIntArray3856[i_511_] - i_485_;
				if (i_512_ >= i_505_ && i_512_ <= i_506_) {
					final int i_513_ = this.anIntArray3878[i_511_] - i;
					if (i_513_ >= i_507_ && i_513_ <= i_508_) {
						final int i_514_ = this.anIntArray3845[i_511_] - i_486_;
						if (i_514_ >= i_509_ && i_514_ <= i_510_) {
							int i_515_ = -1;
							int i_516_ = anIntArray3875[i_511_];
							int i_517_ = anIntArray3875[i_511_ + 1];
							for (int i_518_ = i_516_; i_518_ < i_517_; i_518_++) {
								i_515_ = aShortArray3864[i_518_] - 1;
								if (i_515_ == -1 || aShortArray3849[i_515_] != 0) {
									break;
								}
							}
							if (i_515_ != -1) {
								for (int i_519_ = 0; i_519_ < i_488_; i_519_++) {
									if (i_513_ == is[i_519_] && i_514_ == is_490_[i_519_] && i_512_ == is_489_[i_519_]) {
										int i_520_ = -1;
										i_516_ = is_503_[i_519_];
										i_517_ = is_503_[i_519_ + 1];
										for (int i_521_ = i_516_; i_521_ < i_517_; i_521_++) {
											i_520_ = is_504_[i_521_] - 1;
											if (i_520_ == -1 || is_494_[i_520_] != 0) {
												break;
											}
										}
										if (i_520_ != -1) {
											if (is_495_ == null) {
												aClass152_3859 = new Class152();
												is_495_ = aClass152_3859.aShortArray1425 = Class120_Sub12_Sub8.method1236(aShortArray3873, (byte) -35);
												is_496_ = aClass152_3859.aShortArray1423 = Class120_Sub12_Sub8.method1236(aShortArray3852, (byte) -50);
												is_497_ = aClass152_3859.aShortArray1424 = Class120_Sub12_Sub8.method1236(aShortArray3844, (byte) -60);
												is_498_ = aClass152_3859.aShortArray1426 = Class120_Sub12_Sub8.method1236(aShortArray3849, (byte) 127);
											}
											if (is_499_ == null) {
												final Class152 class152 = class180_sub7_sub2_487_.aClass152_3859 = new Class152();
												is_499_ = class152.aShortArray1425 = Class120_Sub12_Sub8.method1236(is_491_, (byte) -128);
												is_500_ = class152.aShortArray1423 = Class120_Sub12_Sub8.method1236(is_492_, (byte) -107);
												is_501_ = class152.aShortArray1424 = Class120_Sub12_Sub8.method1236(is_493_, (byte) 121);
												is_502_ = class152.aShortArray1426 = Class120_Sub12_Sub8.method1236(is_494_, (byte) 126);
											}
											short i_522_ = aShortArray3873[i_515_];
											short i_523_ = aShortArray3852[i_515_];
											short i_524_ = aShortArray3844[i_515_];
											short i_525_ = aShortArray3849[i_515_];
											i_516_ = is_503_[i_519_];
											i_517_ = is_503_[i_519_ + 1];
											for (int i_526_ = i_516_; i_526_ < i_517_; i_526_++) {
												final int i_527_ = is_504_[i_526_] - 1;
												if (i_527_ == -1) {
													break;
												}
												if (is_502_[i_527_] != 0) {
													is_499_[i_527_] += i_522_;
													is_500_[i_527_] += i_523_;
													is_501_[i_527_] += i_524_;
													is_502_[i_527_] += i_525_;
												}
											}
											i_522_ = is_491_[i_520_];
											i_523_ = is_492_[i_520_];
											i_524_ = is_493_[i_520_];
											i_525_ = is_494_[i_520_];
											i_516_ = anIntArray3875[i_511_];
											i_517_ = anIntArray3875[i_511_ + 1];
											for (int i_528_ = i_516_; i_528_ < i_517_; i_528_++) {
												final int i_529_ = aShortArray3864[i_528_] - 1;
												if (i_529_ == -1) {
													break;
												}
												if (is_498_[i_529_] != 0) {
													is_495_[i_529_] += i_522_;
													is_496_[i_529_] += i_523_;
													is_497_[i_529_] += i_524_;
													is_498_[i_529_] += i_525_;
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	final void method2422() {
		if (aShortArray3873 == null) {
			method2365();
		} else {
			for (int i = 0; i < this.anInt3862; i++) {
				final int i_530_ = this.anIntArray3878[i];
				this.anIntArray3878[i] = this.anIntArray3845[i];
				this.anIntArray3845[i] = -i_530_;
			}
			for (int i = 0; i < anInt3890; i++) {
				final int i_531_ = aShortArray3873[i];
				aShortArray3873[i] = aShortArray3844[i];
				aShortArray3844[i] = (short) -i_531_;
			}
			this.aClass13_3870.aBoolean89 = false;
			this.aClass49_3847.aBoolean439 = false;
			if (aClass49_3848 != null) {
				aClass49_3848.aBoolean439 = false;
			}
		}
	}

	private static final int method2423(final int i, final short i_532_, final int i_533_, final byte i_534_) {
		int i_535_ = Rasterizer.anIntArray969[Class180_Sub7_Sub1.method2401(i, i_533_)];
		if (i_532_ != -1) {
			final int i_536_ = Rasterizer.anInterface5_973.method24(i_532_ & 0xffff, false);
			if (i_536_ != 0) {
				int i_537_;
				if (i_533_ < 0) {
					i_537_ = 0;
				} else if (i_533_ > 127) {
					i_537_ = 16777215;
				} else {
					i_537_ = 131586 * i_533_;
				}
				if (i_536_ == 256) {
					i_535_ = i_537_;
				} else {
					final int i_538_ = i_536_;
					final int i_539_ = 256 - i_536_;
					i_535_ = ((i_537_ & 0xff00ff) * i_538_ + (i_535_ & 0xff00ff) * i_539_ & ~0xff00ff) + ((i_537_ & 0xff00) * i_538_ + (i_535_ & 0xff00) * i_539_ & 0xff0000) >> 8;
				}
			}
			int i_540_ = Rasterizer.anInterface5_973.method21((byte) -119, i_532_ & 0xffff);
			if (i_540_ != 0) {
				i_540_ += 256;
				int i_541_ = ((i_535_ & 0xff0000) >> 16) * i_540_;
				if (i_541_ > 65535) {
					i_541_ = 65535;
				}
				int i_542_ = ((i_535_ & 0xff00) >> 8) * i_540_;
				if (i_542_ > 65535) {
					i_542_ = 65535;
				}
				int i_543_ = (i_535_ & 0xff) * i_540_;
				if (i_543_ > 65535) {
					i_543_ = 65535;
				}
				i_535_ = (i_541_ << 8 & 0xff0000) + (i_542_ & 0xff00) + (i_543_ >> 8);
			}
		}
		return (i_535_ << 8) + 255 - (i_534_ & 0xff);
	}

	@Override
	final void method2368(final int i, final int i_544_, final int i_545_) {
		for (int i_546_ = 0; i_546_ < this.anInt3862; i_546_++) {
			this.anIntArray3878[i_546_] += i;
			this.anIntArray3856[i_546_] += i_544_;
			this.anIntArray3845[i_546_] += i_545_;
		}
		this.aClass13_3870.aBoolean89 = false;
		this.aClass49_3847.aBoolean439 = false;
	}

	@Override
	final void method2373() {
		for (int i = 0; i < this.anInt3862; i++) {
			this.anIntArray3878[i] = -this.anIntArray3878[i];
			this.anIntArray3845[i] = -this.anIntArray3845[i];
		}
		this.aClass13_3870.aBoolean89 = false;
		this.aClass49_3847.aBoolean439 = false;
	}

	private static final float[] method2424(final int i, final int i_547_, final int i_548_, final int i_549_, final float f, final float f_550_, final float f_551_) {
		final float[] fs = new float[9];
		float f_552_ = 1.0F;
		float f_553_ = 0.0F;
		float f_554_ = i_547_ / 32767.0F;
		float f_555_ = -(float) Math.sqrt(1.0F - f_554_ * f_554_);
		float f_556_ = 1.0F - f_554_;
		final float f_557_ = (float) Math.sqrt(i * i + i_548_ * i_548_);
		if (f_557_ != 0.0F) {
			f_552_ = -i_548_ / f_557_;
			f_553_ = i / f_557_;
		}
		fs[0] = f_554_ + f_552_ * f_552_ * f_556_;
		fs[1] = f_553_ * f_555_;
		fs[2] = f_553_ * f_552_ * f_556_;
		fs[3] = -f_553_ * f_555_;
		fs[4] = f_554_;
		fs[5] = f_552_ * f_555_;
		fs[6] = f_552_ * f_553_ * f_556_;
		fs[7] = -f_552_ * f_555_;
		fs[8] = f_554_ + f_553_ * f_553_ * f_556_;
		final float[] fs_558_ = new float[9];
		f_554_ = (float) Math.cos(i_549_ * 0.024543693F);
		f_555_ = (float) Math.sin(i_549_ * 0.024543693F);
		f_556_ = 1.0F - f_554_;
		fs_558_[0] = f_554_;
		fs_558_[1] = 0.0F;
		fs_558_[2] = f_555_;
		fs_558_[3] = 0.0F;
		fs_558_[4] = 1.0F;
		fs_558_[5] = 0.0F;
		fs_558_[6] = -f_555_;
		fs_558_[7] = 0.0F;
		fs_558_[8] = f_554_;
		final float[] fs_559_ = new float[9];
		fs_559_[0] = fs_558_[0] * fs[0] + fs_558_[1] * fs[3] + fs_558_[2] * fs[6];
		fs_559_[1] = fs_558_[0] * fs[1] + fs_558_[1] * fs[4] + fs_558_[2] * fs[7];
		fs_559_[2] = fs_558_[0] * fs[2] + fs_558_[1] * fs[5] + fs_558_[2] * fs[8];
		fs_559_[3] = fs_558_[3] * fs[0] + fs_558_[4] * fs[3] + fs_558_[5] * fs[6];
		fs_559_[4] = fs_558_[3] * fs[1] + fs_558_[4] * fs[4] + fs_558_[5] * fs[7];
		fs_559_[5] = fs_558_[3] * fs[2] + fs_558_[4] * fs[5] + fs_558_[5] * fs[8];
		fs_559_[6] = fs_558_[6] * fs[0] + fs_558_[7] * fs[3] + fs_558_[8] * fs[6];
		fs_559_[7] = fs_558_[6] * fs[1] + fs_558_[7] * fs[4] + fs_558_[8] * fs[7];
		fs_559_[8] = fs_558_[6] * fs[2] + fs_558_[7] * fs[5] + fs_558_[8] * fs[8];
		fs_559_[0] *= f;
		fs_559_[1] *= f;
		fs_559_[2] *= f;
		fs_559_[3] *= f_550_;
		fs_559_[4] *= f_550_;
		fs_559_[5] *= f_550_;
		fs_559_[6] *= f_551_;
		fs_559_[7] *= f_551_;
		fs_559_[8] *= f_551_;
		return fs_559_;
	}

	private final void method2425() {
		int i = 32767;
		int i_560_ = 32767;
		int i_561_ = 32767;
		int i_562_ = -32768;
		int i_563_ = -32768;
		int i_564_ = -32768;
		int i_565_ = 0;
		int i_566_ = 0;
		for (int i_567_ = 0; i_567_ < anInt3861; i_567_++) {
			final int i_568_ = this.anIntArray3878[i_567_];
			final int i_569_ = this.anIntArray3856[i_567_];
			final int i_570_ = this.anIntArray3845[i_567_];
			if (i_568_ < i) {
				i = i_568_;
			}
			if (i_568_ > i_562_) {
				i_562_ = i_568_;
			}
			if (i_569_ < i_560_) {
				i_560_ = i_569_;
			}
			if (i_569_ > i_563_) {
				i_563_ = i_569_;
			}
			if (i_570_ < i_561_) {
				i_561_ = i_570_;
			}
			if (i_570_ > i_564_) {
				i_564_ = i_570_;
			}
			int i_571_ = i_568_ * i_568_ + i_570_ * i_570_;
			if (i_571_ > i_565_) {
				i_565_ = i_571_;
			}
			i_571_ = i_568_ * i_568_ + i_570_ * i_570_ + i_569_ * i_569_;
			if (i_571_ > i_566_) {
				i_566_ = i_571_;
			}
		}
		this.aClass13_3870.aShort90 = (short) i;
		this.aClass13_3870.aShort91 = (short) i_562_;
		this.aClass13_3870.aShort94 = (short) i_560_;
		this.aClass13_3870.aShort87 = (short) i_563_;
		this.aClass13_3870.aShort88 = (short) i_561_;
		this.aClass13_3870.aShort92 = (short) i_564_;
		this.aClass13_3870.aShort93 = (short) (int) (Math.sqrt(i_565_) + 0.99);
		Math.sqrt(i_566_);
		this.aClass13_3870.aBoolean89 = true;
	}

	final void method2426() {
		if (anIntArray3850 != null) {
			final int[] is = new int[256];
			int i = 0;
			for (int i_572_ = 0; i_572_ < this.anInt3862; i_572_++) {
				final int i_573_ = anIntArray3850[i_572_] & 0xff;
				is[i_573_]++;
				if (i_573_ > i) {
					i = i_573_;
				}
			}
			anIntArrayArray3881 = new int[i + 1][];
			for (int i_574_ = 0; i_574_ <= i; i_574_++) {
				anIntArrayArray3881[i_574_] = new int[is[i_574_]];
				is[i_574_] = 0;
			}
			for (int i_575_ = 0; i_575_ < this.anInt3862; i_575_++) {
				final int i_576_ = anIntArray3850[i_575_] & 0xff;
				anIntArrayArray3881[i_576_][is[i_576_]++] = i_575_;
			}
			anIntArray3850 = null;
		}
		if (aByteArray3872 != null) {
			final int[] is = new int[256];
			int i = 0;
			for (int i_577_ = 0; i_577_ < anInt3867; i_577_++) {
				final int i_578_ = aByteArray3872[i_577_] & 0xff;
				is[i_578_]++;
				if (i_578_ > i) {
					i = i_578_;
				}
			}
			anIntArrayArray3886 = new int[i + 1][];
			for (int i_579_ = 0; i_579_ <= i; i_579_++) {
				anIntArrayArray3886[i_579_] = new int[is[i_579_]];
				is[i_579_] = 0;
			}
			for (int i_580_ = 0; i_580_ < anInt3867; i_580_++) {
				final int i_581_ = aByteArray3872[i_580_] & 0xff;
				anIntArrayArray3886[i_581_][is[i_581_]++] = i_580_;
			}
			aByteArray3872 = null;
		}
	}

	final void method2427(final short i, final short i_582_) {
		for (int i_583_ = 0; i_583_ < anInt3867; i_583_++) {
			if (aShortArray3857[i_583_] == i) {
				aShortArray3857[i_583_] = i_582_;
			}
		}
		aClass49_3869.aBoolean439 = false;
	}

	private final boolean method2428(final int i, final int i_584_, final int i_585_, final int i_586_, final int i_587_, final int i_588_, final int i_589_, final int i_590_) {
		if (i_584_ < i_585_ && i_584_ < i_586_ && i_584_ < i_587_) {
			return false;
		}
		if (i_584_ > i_585_ && i_584_ > i_586_ && i_584_ > i_587_) {
			return false;
		}
		if (i < i_588_ && i < i_589_ && i < i_590_) {
			return false;
		}
		if (i > i_588_ && i > i_589_ && i > i_590_) {
			return false;
		}
		return true;
	}

	final int method2429() {
		return aShort3853;
	}

	@Override
	final void method2365() {
		for (int i = 0; i < this.anInt3862; i++) {
			final int i_591_ = this.anIntArray3878[i];
			this.anIntArray3878[i] = this.anIntArray3845[i];
			this.anIntArray3845[i] = -i_591_;
		}
		this.aClass13_3870.aBoolean89 = false;
		this.aClass49_3847.aBoolean439 = false;
	}

	private final void method2430(final boolean bool, final boolean bool_592_, final boolean bool_593_, final boolean bool_594_, final boolean bool_595_) {
		int i = 0;
		if (bool_592_) {
			this.aClass49_3847.anInt442 = i;
			i += 12;
		}
		if (bool_593_) {
			aClass49_3869.anInt442 = i;
			i += 4;
		}
		if (bool_594_) {
			aClass49_3848.anInt442 = i;
			i += 12;
		}
		if (bool_595_) {
			aClass49_3854.anInt442 = i;
			i += 8;
		}
		if (i != 0) {
			if (aClass120_Sub7_3871.buf.length < anInt3890 * i) {
				aClass120_Sub7_3871 = new Buffer((anInt3890 + 100) * i);
			} else {
				aClass120_Sub7_3871.pos = 0;
			}
			if (bool_592_) {
				if (HDToolkit.usingBigEndian) {
					for (int i_596_ = 0; i_596_ < anInt3861; i_596_++) {
						final int i_597_ = Float.floatToRawIntBits(this.anIntArray3878[i_596_]);
						final int i_598_ = Float.floatToRawIntBits(this.anIntArray3856[i_596_]);
						final int i_599_ = Float.floatToRawIntBits(this.anIntArray3845[i_596_]);
						final int i_600_ = anIntArray3875[i_596_];
						final int i_601_ = anIntArray3875[i_596_ + 1];
						for (int i_602_ = i_600_; i_602_ < i_601_; i_602_++) {
							final int i_603_ = aShortArray3864[i_602_] - 1;
							if (i_603_ == -1) {
								break;
							}
							aClass120_Sub7_3871.pos = i_603_ * i;
							aClass120_Sub7_3871.putInt(i_597_);
							aClass120_Sub7_3871.putInt(i_598_);
							aClass120_Sub7_3871.putInt(i_599_);
						}
					}
				} else {
					for (int i_604_ = 0; i_604_ < anInt3861; i_604_++) {
						final int i_605_ = Float.floatToRawIntBits(this.anIntArray3878[i_604_]);
						final int i_606_ = Float.floatToRawIntBits(this.anIntArray3856[i_604_]);
						final int i_607_ = Float.floatToRawIntBits(this.anIntArray3845[i_604_]);
						final int i_608_ = anIntArray3875[i_604_];
						final int i_609_ = anIntArray3875[i_604_ + 1];
						for (int i_610_ = i_608_; i_610_ < i_609_; i_610_++) {
							final int i_611_ = aShortArray3864[i_610_] - 1;
							if (i_611_ == -1) {
								break;
							}
							aClass120_Sub7_3871.pos = i_611_ * i;
							aClass120_Sub7_3871.putLEInt(i_605_);
							aClass120_Sub7_3871.putLEInt(i_606_);
							aClass120_Sub7_3871.putLEInt(i_607_);
						}
					}
				}
			}
			if (bool_593_) {
				if (!Class120_Sub12_Sub6.highLightingDetail) {
					final int i_612_ = (int) Class117.aFloatArray1127[0];
					final int i_613_ = (int) Class117.aFloatArray1127[1];
					final int i_614_ = (int) Class117.aFloatArray1127[2];
					final int i_615_ = (int) Math.sqrt(i_612_ * i_612_ + i_613_ * i_613_ + i_614_ * i_614_);
					final int i_616_ = (int) (aShort3851 * 1.3F);
					final int i_617_ = aShort3853 * i_615_ >> 8;
					for (int i_618_ = 0; i_618_ < anInt3867; i_618_++) {
						final int i_619_ = aShortArray3866[i_618_];
						final int i_620_ = aShortArray3849[i_619_];
						int i_621_;
						if (i_620_ < 0) {
							i_621_ = -1 - i_620_;
						} else {
							if (i_620_ != 0) {
								i_621_ = i_616_ + (i_612_ * aShortArray3873[i_619_] + i_613_ * aShortArray3852[i_619_] + i_614_ * aShortArray3844[i_619_]) / (i_617_ * i_620_);
							} else {
								i_621_ = i_616_ + (i_612_ * aShortArray3873[i_619_] + i_613_ * aShortArray3852[i_619_] + i_614_ * aShortArray3844[i_619_]) / (i_617_ + i_617_ / 2);
							}
							if (i_621_ < 0) {
								i_621_ = 0;
							} else if (i_621_ > 16384) {
								i_621_ = 16384;
							}
							aShortArray3849[i_619_] = (short) (-1 - i_621_);
						}
						final int i_622_ = aShortArray3877[i_618_];
						final int i_623_ = aShortArray3849[i_622_];
						int i_624_;
						if (i_623_ < 0) {
							i_624_ = -1 - i_623_;
						} else {
							if (i_623_ != 0) {
								i_624_ = i_616_ + (i_612_ * aShortArray3873[i_622_] + i_613_ * aShortArray3852[i_622_] + i_614_ * aShortArray3844[i_622_]) / (i_617_ * i_623_);
							} else {
								i_624_ = i_616_ + (i_612_ * aShortArray3873[i_622_] + i_613_ * aShortArray3852[i_622_] + i_614_ * aShortArray3844[i_622_]) / (i_617_ + i_617_ / 2);
							}
							if (i_624_ < 0) {
								i_624_ = 0;
							} else if (i_624_ > 16384) {
								i_624_ = 16384;
							}
							aShortArray3849[i_622_] = (short) (-1 - i_624_);
						}
						final int i_625_ = aShortArray3879[i_618_];
						final int i_626_ = aShortArray3849[i_625_];
						int i_627_;
						if (i_626_ < 0) {
							i_627_ = -1 - i_626_;
						} else {
							if (i_626_ != 0) {
								i_627_ = i_616_ + (i_612_ * aShortArray3873[i_625_] + i_613_ * aShortArray3852[i_625_] + i_614_ * aShortArray3844[i_625_]) / (i_617_ * i_626_);
							} else {
								i_627_ = i_616_ + (i_612_ * aShortArray3873[i_625_] + i_613_ * aShortArray3852[i_625_] + i_614_ * aShortArray3844[i_625_]) / (i_617_ + i_617_ / 2);
							}
							if (i_627_ < 0) {
								i_627_ = 0;
							} else if (i_627_ > 16384) {
								i_627_ = 16384;
							}
							aShortArray3849[i_625_] = (short) (-1 - i_627_);
						}
						final int i_628_ = method2423(aShortArray3857[i_618_], aShortArray3855[i_618_], i_621_, aByteArray3884[i_618_]);
						final int i_629_ = method2423(aShortArray3857[i_618_], aShortArray3855[i_618_], i_624_, aByteArray3884[i_618_]);
						final int i_630_ = method2423(aShortArray3857[i_618_], aShortArray3855[i_618_], i_627_, aByteArray3884[i_618_]);
						aClass120_Sub7_3871.pos = aClass49_3869.anInt442 + i_619_ * i;
						aClass120_Sub7_3871.putInt(i_628_);
						aClass120_Sub7_3871.pos = aClass49_3869.anInt442 + i_622_ * i;
						aClass120_Sub7_3871.putInt(i_629_);
						aClass120_Sub7_3871.pos = aClass49_3869.anInt442 + i_625_ * i;
						aClass120_Sub7_3871.putInt(i_630_);
					}
					aShortArray3873 = null;
					aShortArray3852 = null;
					aShortArray3844 = null;
				} else {
					for (int i_631_ = 0; i_631_ < anInt3867; i_631_++) {
						final int i_632_ = method2423(aShortArray3857[i_631_], aShortArray3855[i_631_], aShort3851, aByteArray3884[i_631_]);
						aClass120_Sub7_3871.pos = aClass49_3869.anInt442 + aShortArray3866[i_631_] * i;
						aClass120_Sub7_3871.putInt(i_632_);
						aClass120_Sub7_3871.pos = aClass49_3869.anInt442 + aShortArray3877[i_631_] * i;
						aClass120_Sub7_3871.putInt(i_632_);
						aClass120_Sub7_3871.pos = aClass49_3869.anInt442 + aShortArray3879[i_631_] * i;
						aClass120_Sub7_3871.putInt(i_632_);
					}
				}
			}
			if (bool_594_) {
				final float f = 3.0F / aShort3853;
				final float f_633_ = 3.0F / (aShort3853 + aShort3853 / 2);
				aClass120_Sub7_3871.pos = aClass49_3848.anInt442;
				if (HDToolkit.usingBigEndian) {
					for (int i_634_ = 0; i_634_ < anInt3890; i_634_++) {
						final short i_635_ = aShortArray3849[i_634_];
						if (i_635_ == 0) {
							aClass120_Sub7_3871.putFloatAsInt(aShortArray3873[i_634_] * f_633_);
							aClass120_Sub7_3871.putFloatAsInt(aShortArray3852[i_634_] * f_633_);
							aClass120_Sub7_3871.putFloatAsInt(aShortArray3844[i_634_] * f_633_);
						} else {
							final float f_636_ = f / i_635_;
							aClass120_Sub7_3871.putFloatAsInt(aShortArray3873[i_634_] * f_636_);
							aClass120_Sub7_3871.putFloatAsInt(aShortArray3852[i_634_] * f_636_);
							aClass120_Sub7_3871.putFloatAsInt(aShortArray3844[i_634_] * f_636_);
						}
						aClass120_Sub7_3871.pos += i - 12;
					}
				} else {
					for (int i_637_ = 0; i_637_ < anInt3890; i_637_++) {
						final short i_638_ = aShortArray3849[i_637_];
						if (i_638_ == 0) {
							aClass120_Sub7_3871.putFloatAsLEInt(aShortArray3873[i_637_] * f_633_);
							aClass120_Sub7_3871.putFloatAsLEInt(aShortArray3852[i_637_] * f_633_);
							aClass120_Sub7_3871.putFloatAsLEInt(aShortArray3844[i_637_] * f_633_);
						} else {
							final float f_639_ = f / i_638_;
							aClass120_Sub7_3871.putFloatAsLEInt(aShortArray3873[i_637_] * f_639_);
							aClass120_Sub7_3871.putFloatAsLEInt(aShortArray3852[i_637_] * f_639_);
							aClass120_Sub7_3871.putFloatAsLEInt(aShortArray3844[i_637_] * f_639_);
						}
						aClass120_Sub7_3871.pos += i - 12;
					}
				}
			}
			if (bool_595_) {
				aClass120_Sub7_3871.pos = aClass49_3854.anInt442;
				if (HDToolkit.usingBigEndian) {
					for (int i_640_ = 0; i_640_ < anInt3890; i_640_++) {
						aClass120_Sub7_3871.putFloatAsInt(aFloatArray3874[i_640_]);
						aClass120_Sub7_3871.putFloatAsInt(aFloatArray3868[i_640_]);
						aClass120_Sub7_3871.pos += i - 8;
					}
				} else {
					for (int i_641_ = 0; i_641_ < anInt3890; i_641_++) {
						aClass120_Sub7_3871.putFloatAsLEInt(aFloatArray3874[i_641_]);
						aClass120_Sub7_3871.putFloatAsLEInt(aFloatArray3868[i_641_]);
						aClass120_Sub7_3871.pos += i - 8;
					}
				}
			}
			aClass120_Sub7_3871.pos = i * anInt3890;
			if (bool) {
				if (HDToolkit.aBoolean520) {
					final ByteBuffer bytebuffer = ByteBuffer.wrap(aClass120_Sub7_3871.buf, 0, aClass120_Sub7_3871.pos);
					if (aClass104_3882 == null) {
						aClass104_3882 = new Class104(true);
						aClass104_3882.method885(bytebuffer);
					} else {
						aClass104_3882.method883(bytebuffer);
					}
					if (bool_592_) {
						this.aClass49_3847.aBoolean439 = true;
						this.aClass49_3847.aByteBuffer443 = null;
						this.aClass49_3847.aClass104_445 = aClass104_3882;
						this.aClass49_3847.anInt444 = i;
					}
					if (bool_593_) {
						aClass49_3869.aBoolean439 = true;
						aClass49_3869.aByteBuffer443 = null;
						aClass49_3869.aClass104_445 = aClass104_3882;
						aClass49_3869.anInt444 = i;
					}
					if (bool_594_) {
						aClass49_3848.aBoolean439 = true;
						aClass49_3848.aByteBuffer443 = null;
						aClass49_3848.aClass104_445 = aClass104_3882;
						aClass49_3848.anInt444 = i;
					}
					if (bool_595_) {
						aClass49_3854.aBoolean439 = true;
						aClass49_3854.aByteBuffer443 = null;
						aClass49_3854.aClass104_445 = aClass104_3882;
						aClass49_3854.anInt444 = i;
					}
				} else {
					if (aByteBuffer3887 == null || aByteBuffer3887.capacity() < aClass120_Sub7_3871.pos) {
						aByteBuffer3887 = ByteBuffer.allocateDirect(aClass120_Sub7_3871.pos + 100 * i);
					} else {
						aByteBuffer3887.clear();
					}
					aByteBuffer3887.put(aClass120_Sub7_3871.buf, 0, aClass120_Sub7_3871.pos);
					aByteBuffer3887.flip();
					if (bool_592_) {
						this.aClass49_3847.aBoolean439 = true;
						this.aClass49_3847.aByteBuffer443 = aByteBuffer3887;
						this.aClass49_3847.aClass104_445 = null;
						this.aClass49_3847.anInt444 = i;
					}
					if (bool_593_) {
						aClass49_3869.aBoolean439 = true;
						aClass49_3869.aByteBuffer443 = aByteBuffer3887;
						this.aClass49_3847.aClass104_445 = null;
						aClass49_3869.anInt444 = i;
					}
					if (bool_594_) {
						aClass49_3848.aBoolean439 = true;
						aClass49_3848.aByteBuffer443 = aByteBuffer3887;
						aClass49_3848.aClass104_445 = null;
						aClass49_3848.anInt444 = i;
					}
					if (bool_595_) {
						aClass49_3854.aBoolean439 = true;
						aClass49_3854.aByteBuffer443 = aByteBuffer3887;
						aClass49_3854.aClass104_445 = null;
						aClass49_3854.anInt444 = i;
					}
				}
			} else if (HDToolkit.vertexBufferAsObject) {
				final Class104 class104 = new Class104();
				final ByteBuffer bytebuffer = ByteBuffer.wrap(aClass120_Sub7_3871.buf, 0, aClass120_Sub7_3871.pos);
				class104.method885(bytebuffer);
				if (bool_592_) {
					this.aClass49_3847.aBoolean439 = true;
					this.aClass49_3847.aByteBuffer443 = null;
					this.aClass49_3847.aClass104_445 = class104;
					this.aClass49_3847.anInt444 = i;
				}
				if (bool_593_) {
					aClass49_3869.aBoolean439 = true;
					aClass49_3869.aByteBuffer443 = null;
					aClass49_3869.aClass104_445 = class104;
					aClass49_3869.anInt444 = i;
				}
				if (bool_594_) {
					aClass49_3848.aBoolean439 = true;
					aClass49_3848.aByteBuffer443 = null;
					aClass49_3848.aClass104_445 = class104;
					aClass49_3848.anInt444 = i;
				}
				if (bool_595_) {
					aClass49_3854.aBoolean439 = true;
					aClass49_3854.aByteBuffer443 = null;
					aClass49_3854.aClass104_445 = class104;
					aClass49_3854.anInt444 = i;
				}
			} else {
				final ByteBuffer bytebuffer = ByteBuffer.allocateDirect(aClass120_Sub7_3871.pos);
				bytebuffer.put(aClass120_Sub7_3871.buf, 0, aClass120_Sub7_3871.pos);
				bytebuffer.flip();
				if (bool_592_) {
					this.aClass49_3847.aBoolean439 = true;
					this.aClass49_3847.aByteBuffer443 = bytebuffer;
					this.aClass49_3847.aClass104_445 = null;
					this.aClass49_3847.anInt444 = i;
				}
				if (bool_593_) {
					aClass49_3869.aBoolean439 = true;
					aClass49_3869.aByteBuffer443 = bytebuffer;
					this.aClass49_3847.aClass104_445 = null;
					aClass49_3869.anInt444 = i;
				}
				if (bool_594_) {
					aClass49_3848.aBoolean439 = true;
					aClass49_3848.aByteBuffer443 = bytebuffer;
					aClass49_3848.aClass104_445 = null;
					aClass49_3848.anInt444 = i;
				}
				if (bool_595_) {
					aClass49_3854.aBoolean439 = true;
					aClass49_3854.aByteBuffer443 = bytebuffer;
					aClass49_3854.aClass104_445 = null;
					aClass49_3854.anInt444 = i;
				}
			}
		}
	}

	@Override
	final Class180_Sub7 method2378(final boolean bool, final boolean bool_642_, final boolean bool_643_) {
		return method2433(bool, bool_642_, bool_643_, aClass180_Sub7_Sub2_3895, aClass180_Sub7_Sub2_3894);
	}

	private static final void method2431(int i, int i_644_, int i_645_, final int i_646_, final int i_647_, final int i_648_, final float[] fs, final float f, final int i_649_, final float f_650_) {
		i -= i_646_;
		i_644_ -= i_647_;
		i_645_ -= i_648_;
		final float f_651_ = i * fs[0] + i_644_ * fs[1] + i_645_ * fs[2];
		final float f_652_ = i * fs[3] + i_644_ * fs[4] + i_645_ * fs[5];
		final float f_653_ = i * fs[6] + i_644_ * fs[7] + i_645_ * fs[8];
		float f_654_ = (float) Math.atan2(f_651_, f_653_) / 6.2831855F + 0.5F;
		if (f != 1.0F) {
			f_654_ *= f;
		}
		float f_655_ = f_652_ + 0.5F + f_650_;
		if (i_649_ == 1) {
			final float f_656_ = f_654_;
			f_654_ = -f_655_;
			f_655_ = f_656_;
		} else if (i_649_ == 2) {
			f_654_ = -f_654_;
			f_655_ = -f_655_;
		} else if (i_649_ == 3) {
			final float f_657_ = f_654_;
			f_654_ = f_655_;
			f_655_ = -f_657_;
		}
		aFloat3899 = f_654_;
		aFloat3903 = f_655_;
	}

	@Override
	final int getMaxZ() {
		if (!this.aClass13_3870.aBoolean89) {
			method2425();
		}
		return this.aClass13_3870.aShort87;
	}

	@Override
	final void method2372() {
		for (int i = 0; i < this.anInt3862; i++) {
			final int i_658_ = this.anIntArray3845[i];
			this.anIntArray3845[i] = this.anIntArray3878[i];
			this.anIntArray3878[i] = -i_658_;
		}
		this.aClass13_3870.aBoolean89 = false;
		this.aClass49_3847.aBoolean439 = false;
	}

	@Override
	final void method2362(final int i) {
		final int i_659_ = Rasterizer.sineTable[i];
		final int i_660_ = Rasterizer.cosineTable[i];
		for (int i_661_ = 0; i_661_ < this.anInt3862; i_661_++) {
			final int i_662_ = this.anIntArray3856[i_661_] * i_659_ + this.anIntArray3878[i_661_] * i_660_ >> 16;
			this.anIntArray3856[i_661_] = this.anIntArray3856[i_661_] * i_660_ - this.anIntArray3878[i_661_] * i_659_ >> 16;
			this.anIntArray3878[i_661_] = i_662_;
		}
		this.aClass13_3870.aBoolean89 = false;
		this.aClass49_3847.aBoolean439 = false;
	}

	final void method2432(final boolean bool, final boolean bool_663_, final boolean bool_664_, final boolean bool_665_, final boolean bool_666_, final boolean bool_667_, final boolean bool_668_) {
		if (aByte3860 != 0) {
			throw new IllegalArgumentException();
		}
		if (anInt3890 != 0) {
			if (bool_668_) {
				final boolean bool_669_ = !aClass49_3869.aBoolean439 && (bool_663_ || bool_664_ && !Class120_Sub12_Sub6.highLightingDetail);
				method2430(false, !this.aClass49_3847.aBoolean439 && bool, bool_669_, aClass49_3848 != null && !aClass49_3848.aBoolean439 && bool_664_, !aClass49_3854.aBoolean439 && bool_665_);
				if (!aClass49_3863.aBoolean439 && bool_666_ && bool_663_) {
					method2411();
				}
			}
			if (bool) {
				if (this.aClass49_3847.aBoolean439) {
					if (!this.aClass13_3870.aBoolean89) {
						method2425();
					}
					this.anIntArray3878 = null;
					this.anIntArray3856 = null;
					this.anIntArray3845 = null;
					aShortArray3864 = null;
					anIntArray3875 = null;
				} else {
					aByte3888 |= 0x1;
				}
			}
			if (bool_663_) {
				if (aClass49_3869.aBoolean439) {
					aShortArray3857 = null;
					aByteArray3884 = null;
				} else {
					aByte3888 |= 0x2;
				}
			}
			if (bool_664_ && Class120_Sub12_Sub6.highLightingDetail) {
				if (aClass49_3848.aBoolean439) {
					aShortArray3873 = null;
					aShortArray3852 = null;
					aShortArray3844 = null;
					aShortArray3849 = null;
				} else {
					aByte3888 |= 0x4;
				}
			}
			if (bool_665_) {
				if (aClass49_3854.aBoolean439) {
					aFloatArray3874 = null;
					aFloatArray3868 = null;
				} else {
					aByte3888 |= 0x8;
				}
			}
			if (bool_666_ && bool_663_) {
				if (aClass49_3863.aBoolean439 && aClass49_3869.aBoolean439) {
					aShortArray3866 = null;
					aShortArray3877 = null;
					aShortArray3879 = null;
				} else {
					aByte3888 |= 0x10;
				}
			}
			if (bool_667_) {
				anIntArray3850 = null;
				aByteArray3872 = null;
				anIntArrayArray3881 = null;
				anIntArrayArray3886 = null;
			}
		}
	}

	@Override
	final Class180_Sub7 method2376(final boolean bool, final boolean bool_670_, final boolean bool_671_) {
		return method2433(bool, bool_670_, bool_671_, aClass180_Sub7_Sub2_3889, aClass180_Sub7_Sub2_3885);
	}

	private final Class180_Sub7 method2433(final boolean bool, final boolean bool_672_, final boolean bool_673_, final Class180_Sub7_Sub2 class180_sub7_sub2_674_, final Class180_Sub7_Sub2 class180_sub7_sub2_675_) {
		class180_sub7_sub2_674_.anInt3862 = this.anInt3862;
		class180_sub7_sub2_674_.anInt3861 = anInt3861;
		class180_sub7_sub2_674_.anInt3890 = anInt3890;
		class180_sub7_sub2_674_.anInt3867 = anInt3867;
		class180_sub7_sub2_674_.aShort3851 = aShort3851;
		class180_sub7_sub2_674_.aShort3853 = aShort3853;
		class180_sub7_sub2_674_.aByte3860 = (byte) (0x1 | (bool && bool_672_ ? 0 : 2) | (bool_673_ ? 0 : 4));
		if (class180_sub7_sub2_674_.anIntArray3878 == null || class180_sub7_sub2_674_.anIntArray3878.length < this.anInt3862) {
			class180_sub7_sub2_674_.anIntArray3878 = new int[this.anInt3862 + 100];
			class180_sub7_sub2_674_.anIntArray3856 = new int[this.anInt3862 + 100];
			class180_sub7_sub2_674_.anIntArray3845 = new int[this.anInt3862 + 100];
		}
		for (int i = 0; i < this.anInt3862; i++) {
			class180_sub7_sub2_674_.anIntArray3878[i] = this.anIntArray3878[i];
			class180_sub7_sub2_674_.anIntArray3856[i] = this.anIntArray3856[i];
			class180_sub7_sub2_674_.anIntArray3845[i] = this.anIntArray3845[i];
		}
		if (class180_sub7_sub2_674_.aClass49_3847 == null) {
			class180_sub7_sub2_674_.aClass49_3847 = new Class49();
		}
		class180_sub7_sub2_674_.aClass49_3847.aBoolean439 = false;
		if (class180_sub7_sub2_674_.aClass13_3870 == null) {
			class180_sub7_sub2_674_.aClass13_3870 = new Class13();
		}
		class180_sub7_sub2_674_.aClass13_3870.aBoolean89 = false;
		if (bool) {
			class180_sub7_sub2_674_.aByteArray3884 = aByteArray3884;
		} else {
			if (class180_sub7_sub2_675_.aByteArray3884 == null || class180_sub7_sub2_675_.aByteArray3884.length < anInt3867) {
				class180_sub7_sub2_675_.aByteArray3884 = new byte[anInt3867 + 100];
			}
			class180_sub7_sub2_674_.aByteArray3884 = class180_sub7_sub2_675_.aByteArray3884;
			for (int i = 0; i < anInt3867; i++) {
				class180_sub7_sub2_674_.aByteArray3884[i] = aByteArray3884[i];
			}
		}
		if (bool_672_) {
			class180_sub7_sub2_674_.aShortArray3857 = aShortArray3857;
		} else {
			if (class180_sub7_sub2_675_.aShortArray3857 == null || class180_sub7_sub2_675_.aShortArray3857.length < anInt3867) {
				class180_sub7_sub2_675_.aShortArray3857 = new short[anInt3867 + 100];
			}
			class180_sub7_sub2_674_.aShortArray3857 = class180_sub7_sub2_675_.aShortArray3857;
			for (int i = 0; i < anInt3867; i++) {
				class180_sub7_sub2_674_.aShortArray3857[i] = aShortArray3857[i];
			}
		}
		if (!bool || !bool_672_) {
			if (class180_sub7_sub2_675_.aClass49_3869 == null) {
				class180_sub7_sub2_675_.aClass49_3869 = new Class49();
			}
			class180_sub7_sub2_674_.aClass49_3869 = class180_sub7_sub2_675_.aClass49_3869;
			class180_sub7_sub2_674_.aClass49_3869.aBoolean439 = false;
		} else {
			class180_sub7_sub2_674_.aClass49_3869 = aClass49_3869;
		}
		if (bool_673_ || aShortArray3873 == null) {
			class180_sub7_sub2_674_.aShortArray3873 = aShortArray3873;
			class180_sub7_sub2_674_.aShortArray3852 = aShortArray3852;
			class180_sub7_sub2_674_.aShortArray3844 = aShortArray3844;
			class180_sub7_sub2_674_.aShortArray3849 = aShortArray3849;
			class180_sub7_sub2_674_.aClass49_3848 = aClass49_3848;
		} else {
			if (class180_sub7_sub2_675_.aShortArray3873 == null || class180_sub7_sub2_675_.aShortArray3873.length < anInt3890) {
				class180_sub7_sub2_675_.aShortArray3873 = new short[anInt3890 + 100];
				class180_sub7_sub2_675_.aShortArray3852 = new short[anInt3890 + 100];
				class180_sub7_sub2_675_.aShortArray3844 = new short[anInt3890 + 100];
				class180_sub7_sub2_675_.aShortArray3849 = new short[anInt3890 + 100];
			}
			class180_sub7_sub2_674_.aShortArray3873 = class180_sub7_sub2_675_.aShortArray3873;
			class180_sub7_sub2_674_.aShortArray3852 = class180_sub7_sub2_675_.aShortArray3852;
			class180_sub7_sub2_674_.aShortArray3844 = class180_sub7_sub2_675_.aShortArray3844;
			class180_sub7_sub2_674_.aShortArray3849 = class180_sub7_sub2_675_.aShortArray3849;
			for (int i = 0; i < anInt3890; i++) {
				class180_sub7_sub2_674_.aShortArray3873[i] = aShortArray3873[i];
				class180_sub7_sub2_674_.aShortArray3852[i] = aShortArray3852[i];
				class180_sub7_sub2_674_.aShortArray3844[i] = aShortArray3844[i];
				class180_sub7_sub2_674_.aShortArray3849[i] = aShortArray3849[i];
			}
			if (Class120_Sub12_Sub6.highLightingDetail) {
				if (class180_sub7_sub2_675_.aClass49_3848 == null) {
					class180_sub7_sub2_675_.aClass49_3848 = new Class49();
				}
				class180_sub7_sub2_674_.aClass49_3848 = class180_sub7_sub2_675_.aClass49_3848;
				class180_sub7_sub2_674_.aClass49_3848.aBoolean439 = false;
			} else {
				class180_sub7_sub2_674_.aClass49_3848 = null;
			}
		}
		class180_sub7_sub2_674_.aFloatArray3874 = aFloatArray3874;
		class180_sub7_sub2_674_.aFloatArray3868 = aFloatArray3868;
		class180_sub7_sub2_674_.anIntArray3850 = anIntArray3850;
		class180_sub7_sub2_674_.anIntArrayArray3881 = anIntArrayArray3881;
		class180_sub7_sub2_674_.aShortArray3866 = aShortArray3866;
		class180_sub7_sub2_674_.aShortArray3877 = aShortArray3877;
		class180_sub7_sub2_674_.aShortArray3879 = aShortArray3879;
		class180_sub7_sub2_674_.aShortArray3855 = aShortArray3855;
		class180_sub7_sub2_674_.aByteArray3872 = aByteArray3872;
		class180_sub7_sub2_674_.anIntArrayArray3886 = anIntArrayArray3886;
		class180_sub7_sub2_674_.aClass49_3854 = aClass49_3854;
		class180_sub7_sub2_674_.aClass49_3863 = aClass49_3863;
		class180_sub7_sub2_674_.anIntArray3865 = anIntArray3865;
		class180_sub7_sub2_674_.aShortArray3864 = aShortArray3864;
		class180_sub7_sub2_674_.anIntArray3875 = anIntArray3875;
		class180_sub7_sub2_674_.haveActions = this.haveActions;
		class180_sub7_sub2_674_.aShortArray3876 = aShortArray3876;
		class180_sub7_sub2_674_.aShortArray3846 = aShortArray3846;
		class180_sub7_sub2_674_.aClass158Array3892 = this.aClass158Array3892;
		class180_sub7_sub2_674_.aClass169Array3858 = this.aClass169Array3858;
		return class180_sub7_sub2_674_;
	}

	private static final void method2434(int i, int i_676_, int i_677_, final int i_678_, final int i_679_, final int i_680_, final float[] fs, final int i_681_, final float f) {
		i -= i_678_;
		i_676_ -= i_679_;
		i_677_ -= i_680_;
		final float f_682_ = i * fs[0] + i_676_ * fs[1] + i_677_ * fs[2];
		final float f_683_ = i * fs[3] + i_676_ * fs[4] + i_677_ * fs[5];
		final float f_684_ = i * fs[6] + i_676_ * fs[7] + i_677_ * fs[8];
		final float f_685_ = (float) Math.sqrt(f_682_ * f_682_ + f_683_ * f_683_ + f_684_ * f_684_);
		float f_686_ = (float) Math.atan2(f_682_, f_684_) / 6.2831855F + 0.5F;
		float f_687_ = (float) Math.asin(f_683_ / f_685_) / 3.1415927F + 0.5F + f;
		if (i_681_ == 1) {
			final float f_688_ = f_686_;
			f_686_ = -f_687_;
			f_687_ = f_688_;
		} else if (i_681_ == 2) {
			f_686_ = -f_686_;
			f_687_ = -f_687_;
		} else if (i_681_ == 3) {
			final float f_689_ = f_686_;
			f_686_ = f_687_;
			f_687_ = -f_689_;
		}
		aFloat3907 = f_686_;
		aFloat3902 = f_687_;
	}

	@Override
	final void method2379(final int i, final int i_690_, final int i_691_, final int i_692_) {
		if (i == 0) {
			int i_693_ = 0;
			anInt3896 = 0;
			anInt3898 = 0;
			anInt3904 = 0;
			for (int i_694_ = 0; i_694_ < this.anInt3862; i_694_++) {
				anInt3896 += this.anIntArray3878[i_694_];
				anInt3898 += this.anIntArray3856[i_694_];
				anInt3904 += this.anIntArray3845[i_694_];
				i_693_++;
			}
			if (i_693_ > 0) {
				anInt3896 = anInt3896 / i_693_ + i_690_;
				anInt3898 = anInt3898 / i_693_ + i_691_;
				anInt3904 = anInt3904 / i_693_ + i_692_;
			} else {
				anInt3896 = i_690_;
				anInt3898 = i_691_;
				anInt3904 = i_692_;
			}
		} else if (i == 1) {
			for (int i_695_ = 0; i_695_ < this.anInt3862; i_695_++) {
				this.anIntArray3878[i_695_] += i_690_;
				this.anIntArray3856[i_695_] += i_691_;
				this.anIntArray3845[i_695_] += i_692_;
			}
		} else if (i == 2) {
			for (int i_696_ = 0; i_696_ < this.anInt3862; i_696_++) {
				this.anIntArray3878[i_696_] -= anInt3896;
				this.anIntArray3856[i_696_] -= anInt3898;
				this.anIntArray3845[i_696_] -= anInt3904;
				if (i_692_ != 0) {
					final int i_697_ = Rasterizer.sineTable[i_692_];
					final int i_698_ = Rasterizer.cosineTable[i_692_];
					final int i_699_ = this.anIntArray3856[i_696_] * i_697_ + this.anIntArray3878[i_696_] * i_698_ + 32767 >> 16;
					this.anIntArray3856[i_696_] = this.anIntArray3856[i_696_] * i_698_ - this.anIntArray3878[i_696_] * i_697_ + 32767 >> 16;
					this.anIntArray3878[i_696_] = i_699_;
				}
				if (i_690_ != 0) {
					final int i_700_ = Rasterizer.sineTable[i_690_];
					final int i_701_ = Rasterizer.cosineTable[i_690_];
					final int i_702_ = this.anIntArray3856[i_696_] * i_701_ - this.anIntArray3845[i_696_] * i_700_ + 32767 >> 16;
					this.anIntArray3845[i_696_] = this.anIntArray3856[i_696_] * i_700_ + this.anIntArray3845[i_696_] * i_701_ + 32767 >> 16;
					this.anIntArray3856[i_696_] = i_702_;
				}
				if (i_691_ != 0) {
					final int i_703_ = Rasterizer.sineTable[i_691_];
					final int i_704_ = Rasterizer.cosineTable[i_691_];
					final int i_705_ = this.anIntArray3845[i_696_] * i_703_ + this.anIntArray3878[i_696_] * i_704_ + 32767 >> 16;
					this.anIntArray3845[i_696_] = this.anIntArray3845[i_696_] * i_704_ - this.anIntArray3878[i_696_] * i_703_ + 32767 >> 16;
					this.anIntArray3878[i_696_] = i_705_;
				}
				this.anIntArray3878[i_696_] += anInt3896;
				this.anIntArray3856[i_696_] += anInt3898;
				this.anIntArray3845[i_696_] += anInt3904;
			}
		} else if (i == 3) {
			for (int i_706_ = 0; i_706_ < this.anInt3862; i_706_++) {
				this.anIntArray3878[i_706_] -= anInt3896;
				this.anIntArray3856[i_706_] -= anInt3898;
				this.anIntArray3845[i_706_] -= anInt3904;
				this.anIntArray3878[i_706_] = this.anIntArray3878[i_706_] * i_690_ / 128;
				this.anIntArray3856[i_706_] = this.anIntArray3856[i_706_] * i_691_ / 128;
				this.anIntArray3845[i_706_] = this.anIntArray3845[i_706_] * i_692_ / 128;
				this.anIntArray3878[i_706_] += anInt3896;
				this.anIntArray3856[i_706_] += anInt3898;
				this.anIntArray3845[i_706_] += anInt3904;
			}
		} else if (i == 5) {
			for (int i_707_ = 0; i_707_ < anInt3867; i_707_++) {
				int i_708_ = (aByteArray3884[i_707_] & 0xff) + i_690_ * 8;
				if (i_708_ < 0) {
					i_708_ = 0;
				} else if (i_708_ > 255) {
					i_708_ = 255;
				}
				aByteArray3884[i_707_] = (byte) i_708_;
			}
			aClass49_3869.aBoolean439 = false;
		} else if (i == 7) {
			for (int i_709_ = 0; i_709_ < anInt3867; i_709_++) {
				final int i_710_ = aShortArray3857[i_709_] & 0xffff;
				int i_711_ = i_710_ >> 10 & 0x3f;
				int i_712_ = i_710_ >> 7 & 0x7;
				int i_713_ = i_710_ & 0x7f;
				i_711_ = i_711_ + i_690_ & 0x3f;
				i_712_ += i_691_ / 4;
				if (i_712_ < 0) {
					i_712_ = 0;
				} else if (i_712_ > 7) {
					i_712_ = 7;
				}
				i_713_ += i_692_;
				if (i_713_ < 0) {
					i_713_ = 0;
				} else if (i_713_ > 127) {
					i_713_ = 127;
				}
				aShortArray3857[i_709_] = (short) (i_711_ << 10 | i_712_ << 7 | i_713_);
			}
			aClass49_3869.aBoolean439 = false;
		}
	}

	private static final float[] method2435(final float[] fs, final int i) {
		final float[] fs_714_ = new float[i];
		ArrayUtils.arrayCopy(fs, 0, fs_714_, 0, i);
		return fs_714_;
	}

	static final void method2436() {
		aClass180_Sub7_Sub2_3885 = new Class180_Sub7_Sub2();
		aClass180_Sub7_Sub2_3889 = new Class180_Sub7_Sub2();
		aClass180_Sub7_Sub2_3891 = new Class180_Sub7_Sub2();
		aClass180_Sub7_Sub2_3893 = new Class180_Sub7_Sub2();
		aClass180_Sub7_Sub2_3894 = new Class180_Sub7_Sub2();
		aClass180_Sub7_Sub2_3895 = new Class180_Sub7_Sub2();
	}

	private static final int method2437(final float f, final float f_715_, final float f_716_) {
		final float f_717_ = f < 0.0F ? -f : f;
		final float f_718_ = f_715_ < 0.0F ? -f_715_ : f_715_;
		final float f_719_ = f_716_ < 0.0F ? -f_716_ : f_716_;
		if (f_718_ > f_717_ && f_718_ > f_719_) {
			if (f_715_ > 0.0F) {
				return 0;
			}
			return 1;
		}
		if (f_719_ > f_717_ && f_719_ > f_718_) {
			if (f_716_ > 0.0F) {
				return 2;
			}
			return 3;
		}
		if (f > 0.0F) {
			return 4;
		}
		return 5;
	}

	private Class180_Sub7_Sub2() {
		anInt3861 = 0;
		aByte3860 = (byte) 0;
		anInt3867 = 0;
		this.aBoolean3880 = false;
		aByte3888 = (byte) 0;
		anInt3890 = 0;
	}

	Class180_Sub7_Sub2(final Class180_Sub2 class180_sub2, final int i, final int i_720_, final boolean bool) {
		anInt3861 = 0;
		aByte3860 = (byte) 0;
		anInt3867 = 0;
		this.aBoolean3880 = false;
		aByte3888 = (byte) 0;
		anInt3890 = 0;
		final int[] is = new int[class180_sub2.anInt2856];
		anIntArray3875 = new int[class180_sub2.anInt2896 + 1];
		for (int i_721_ = 0; i_721_ < class180_sub2.anInt2856; i_721_++) {
			if ((class180_sub2.aByteArray2895 == null || class180_sub2.aByteArray2895[i_721_] != 2) && (class180_sub2.aShortArray2850 == null || class180_sub2.aShortArray2850[i_721_] == -1 || !Rasterizer.anInterface5_973.method16(class180_sub2.aShortArray2850[i_721_] & 0xffff, (byte) 26))) {
				is[anInt3867++] = i_721_;
				anIntArray3875[class180_sub2.trianglesA[i_721_]]++;
				anIntArray3875[class180_sub2.trianglesB[i_721_]]++;
				anIntArray3875[class180_sub2.trianglesC[i_721_]]++;
			}
		}
		final long[] ls = new long[anInt3867];
		for (int i_722_ = 0; i_722_ < anInt3867; i_722_++) {
			final int i_723_ = is[i_722_];
			int i_724_ = 0;
			int i_725_ = 0;
			int i_726_ = 0;
			int i_727_ = 0;
			int i_728_ = -1;
			if (class180_sub2.aShortArray2850 != null) {
				i_728_ = class180_sub2.aShortArray2850[i_723_];
				if (i_728_ != -1) {
					i_726_ = Rasterizer.anInterface5_973.method18(i_728_ & 0xffff, 255);
					i_727_ = Rasterizer.anInterface5_973.method29(i_728_ & 0xffff, 114);
				}
			}
			final boolean bool_729_ = class180_sub2.aByteArray2864 != null && class180_sub2.aByteArray2864[i_723_] != 0 || i_728_ != -1 && !Rasterizer.anInterface5_973.method17(-1, i_728_ & 0xffff);
			if ((bool || bool_729_) && class180_sub2.aByteArray2879 != null) {
				i_724_ += class180_sub2.aByteArray2879[i_723_] << 17;
			}
			if (bool_729_) {
				i_724_ += 65536;
			}
			i_724_ += (i_726_ & 0xff) << 8;
			i_724_ += i_727_ & 0xff;
			i_725_ += (i_728_ & 0xffff) << 16;
			i_725_ += i_722_ & 0xffff;
			ls[i_722_] = ((long) i_724_ << 32) + i_725_;
		}
		Class73.method642((byte) -46, is, ls);
		this.anInt3862 = class180_sub2.anInt2896;
		anInt3861 = class180_sub2.anInt2886;
		this.anIntArray3878 = class180_sub2.xVertices;
		this.anIntArray3856 = class180_sub2.yVertices;
		this.anIntArray3845 = class180_sub2.zVertices;
		anIntArray3850 = class180_sub2.vertexVSkins;
		aShortArray3876 = class180_sub2.aShortArray2852;
		this.aClass158Array3892 = class180_sub2.aClass158Array2871;
		this.aClass169Array3858 = class180_sub2.aClass169Array2887;
		final int i_730_ = anInt3867 * 3;
		aShortArray3873 = new short[i_730_];
		aShortArray3852 = new short[i_730_];
		aShortArray3844 = new short[i_730_];
		aShortArray3849 = new short[i_730_];
		aFloatArray3874 = new float[i_730_];
		aFloatArray3868 = new float[i_730_];
		aShortArray3857 = new short[anInt3867];
		aByteArray3884 = new byte[anInt3867];
		aShortArray3866 = new short[anInt3867];
		aShortArray3877 = new short[anInt3867];
		aShortArray3879 = new short[anInt3867];
		aShortArray3855 = new short[anInt3867];
		if (class180_sub2.anIntArray2872 != null) {
			aByteArray3872 = new byte[anInt3867];
		}
		if (class180_sub2.aShortArray2867 != null) {
			aShortArray3846 = new short[anInt3867];
		}
		this.aClass13_3870 = new Class13();
		this.aClass49_3847 = new Class49();
		aClass49_3869 = new Class49();
		if (Class120_Sub12_Sub6.highLightingDetail) {
			aClass49_3848 = new Class49();
		}
		aClass49_3854 = new Class49();
		aClass49_3863 = new Class49();
		aShort3851 = (short) i;
		aShort3853 = (short) i_720_;
		aShortArray3864 = new short[i_730_];
		aLongArray3883 = new long[i_730_];
		int i_731_ = 0;
		for (int i_732_ = 0; i_732_ < anInt3861; i_732_++) {
			final int i_733_ = anIntArray3875[i_732_];
			anIntArray3875[i_732_] = i_731_;
			i_731_ += i_733_;
		}
		anIntArray3875[anInt3861] = i_731_;
		int[] is_734_ = null;
		int[] is_735_ = null;
		int[] is_736_ = null;
		float[][] fs = null;
		if (class180_sub2.aByteArray2876 != null) {
			final int i_737_ = class180_sub2.anInt2855;
			final int[] is_738_ = new int[i_737_];
			final int[] is_739_ = new int[i_737_];
			final int[] is_740_ = new int[i_737_];
			final int[] is_741_ = new int[i_737_];
			final int[] is_742_ = new int[i_737_];
			final int[] is_743_ = new int[i_737_];
			for (int i_744_ = 0; i_744_ < i_737_; i_744_++) {
				is_738_[i_744_] = 2147483647;
				is_739_[i_744_] = -2147483647;
				is_740_[i_744_] = 2147483647;
				is_741_[i_744_] = -2147483647;
				is_742_[i_744_] = 2147483647;
				is_743_[i_744_] = -2147483647;
			}
			for (int i_745_ = 0; i_745_ < anInt3867; i_745_++) {
				final int i_746_ = is[i_745_];
				if (class180_sub2.aByteArray2876[i_746_] != -1) {
					final int i_747_ = class180_sub2.aByteArray2876[i_746_] & 0xff;
					for (int i_748_ = 0; i_748_ < 3; i_748_++) {
						int i_749_;
						if (i_748_ == 0) {
							i_749_ = class180_sub2.trianglesA[i_746_];
						} else if (i_748_ == 1) {
							i_749_ = class180_sub2.trianglesB[i_746_];
						} else {
							i_749_ = class180_sub2.trianglesC[i_746_];
						}
						final int i_750_ = class180_sub2.xVertices[i_749_];
						final int i_751_ = class180_sub2.yVertices[i_749_];
						final int i_752_ = class180_sub2.zVertices[i_749_];
						if (i_750_ < is_738_[i_747_]) {
							is_738_[i_747_] = i_750_;
						}
						if (i_750_ > is_739_[i_747_]) {
							is_739_[i_747_] = i_750_;
						}
						if (i_751_ < is_740_[i_747_]) {
							is_740_[i_747_] = i_751_;
						}
						if (i_751_ > is_741_[i_747_]) {
							is_741_[i_747_] = i_751_;
						}
						if (i_752_ < is_742_[i_747_]) {
							is_742_[i_747_] = i_752_;
						}
						if (i_752_ > is_743_[i_747_]) {
							is_743_[i_747_] = i_752_;
						}
					}
				}
			}
			is_734_ = new int[i_737_];
			is_735_ = new int[i_737_];
			is_736_ = new int[i_737_];
			fs = new float[i_737_][];
			for (int i_753_ = 0; i_753_ < i_737_; i_753_++) {
				final byte i_754_ = class180_sub2.texTrianglesType[i_753_];
				if (i_754_ > 0) {
					is_734_[i_753_] = (is_738_[i_753_] + is_739_[i_753_]) / 2;
					is_735_[i_753_] = (is_740_[i_753_] + is_741_[i_753_]) / 2;
					is_736_[i_753_] = (is_742_[i_753_] + is_743_[i_753_]) / 2;
					float f;
					float f_755_;
					float f_756_;
					if (i_754_ == 1) {
						final int i_757_ = class180_sub2.aShortArray2903[i_753_];
						if (i_757_ == 0) {
							f = 1.0F;
							f_756_ = 1.0F;
						} else if (i_757_ > 0) {
							f = 1.0F;
							f_756_ = i_757_ / 1024.0F;
						} else {
							f_756_ = 1.0F;
							f = -i_757_ / 1024.0F;
						}
						f_755_ = 64.0F / (class180_sub2.aShortArray2873[i_753_] & 0xffff);
					} else if (i_754_ == 2) {
						f = 64.0F / (class180_sub2.aShortArray2903[i_753_] & 0xffff);
						f_755_ = 64.0F / (class180_sub2.aShortArray2873[i_753_] & 0xffff);
						f_756_ = 64.0F / (class180_sub2.aShortArray2900[i_753_] & 0xffff);
					} else {
						f = class180_sub2.aShortArray2903[i_753_] / 1024.0F;
						f_755_ = class180_sub2.aShortArray2873[i_753_] / 1024.0F;
						f_756_ = class180_sub2.aShortArray2900[i_753_] / 1024.0F;
					}
					fs[i_753_] = method2424(class180_sub2.texTrianglesA[i_753_], class180_sub2.texTrianglesB[i_753_], class180_sub2.texTrianglesC[i_753_], class180_sub2.aByteArray2877[i_753_] & 0xff, f, f_755_, f_756_);
				}
			}
		}
		for (int i_758_ = 0; i_758_ < anInt3867; i_758_++) {
			final int i_759_ = is[i_758_];
			final int i_760_ = class180_sub2.triangleColors[i_759_] & 0xffff;
			short i_761_;
			if (class180_sub2.aShortArray2850 == null) {
				i_761_ = (short) -1;
			} else {
				i_761_ = class180_sub2.aShortArray2850[i_759_];
			}
			int i_762_;
			if (class180_sub2.aByteArray2876 == null) {
				i_762_ = -1;
			} else {
				i_762_ = class180_sub2.aByteArray2876[i_759_];
			}
			int i_763_;
			if (class180_sub2.aByteArray2864 == null) {
				i_763_ = 0;
			} else {
				i_763_ = class180_sub2.aByteArray2864[i_759_] & 0xff;
			}
			float f = 0.0F;
			float f_764_ = 0.0F;
			float f_765_ = 0.0F;
			float f_766_ = 0.0F;
			float f_767_ = 0.0F;
			float f_768_ = 0.0F;
			int i_769_ = 0;
			int i_770_ = 0;
			int i_771_ = 0;
			if (i_761_ != -1) {
				if (i_762_ == -1) {
					f = 0.0F;
					f_764_ = 1.0F;
					f_765_ = 1.0F;
					f_766_ = 1.0F;
					i_769_ = 1;
					f_767_ = 0.0F;
					f_768_ = 0.0F;
					i_770_ = 2;
				} else {
					i_762_ &= 0xff;
					final byte i_772_ = class180_sub2.texTrianglesType[i_762_];
					if (i_772_ == 0) {
						final int i_773_ = class180_sub2.trianglesA[i_759_];
						final int i_774_ = class180_sub2.trianglesB[i_759_];
						final int i_775_ = class180_sub2.trianglesC[i_759_];
						final short i_776_ = class180_sub2.texTrianglesA[i_762_];
						final short i_777_ = class180_sub2.texTrianglesB[i_762_];
						final short i_778_ = class180_sub2.texTrianglesC[i_762_];
						final float f_779_ = class180_sub2.xVertices[i_776_];
						final float f_780_ = class180_sub2.yVertices[i_776_];
						final float f_781_ = class180_sub2.zVertices[i_776_];
						final float f_782_ = class180_sub2.xVertices[i_777_] - f_779_;
						final float f_783_ = class180_sub2.yVertices[i_777_] - f_780_;
						final float f_784_ = class180_sub2.zVertices[i_777_] - f_781_;
						final float f_785_ = class180_sub2.xVertices[i_778_] - f_779_;
						final float f_786_ = class180_sub2.yVertices[i_778_] - f_780_;
						final float f_787_ = class180_sub2.zVertices[i_778_] - f_781_;
						final float f_788_ = class180_sub2.xVertices[i_773_] - f_779_;
						final float f_789_ = class180_sub2.yVertices[i_773_] - f_780_;
						final float f_790_ = class180_sub2.zVertices[i_773_] - f_781_;
						final float f_791_ = class180_sub2.xVertices[i_774_] - f_779_;
						final float f_792_ = class180_sub2.yVertices[i_774_] - f_780_;
						final float f_793_ = class180_sub2.zVertices[i_774_] - f_781_;
						final float f_794_ = class180_sub2.xVertices[i_775_] - f_779_;
						final float f_795_ = class180_sub2.yVertices[i_775_] - f_780_;
						final float f_796_ = class180_sub2.zVertices[i_775_] - f_781_;
						final float f_797_ = f_783_ * f_787_ - f_784_ * f_786_;
						final float f_798_ = f_784_ * f_785_ - f_782_ * f_787_;
						final float f_799_ = f_782_ * f_786_ - f_783_ * f_785_;
						float f_800_ = f_786_ * f_799_ - f_787_ * f_798_;
						float f_801_ = f_787_ * f_797_ - f_785_ * f_799_;
						float f_802_ = f_785_ * f_798_ - f_786_ * f_797_;
						float f_803_ = 1.0F / (f_800_ * f_782_ + f_801_ * f_783_ + f_802_ * f_784_);
						f = (f_800_ * f_788_ + f_801_ * f_789_ + f_802_ * f_790_) * f_803_;
						f_765_ = (f_800_ * f_791_ + f_801_ * f_792_ + f_802_ * f_793_) * f_803_;
						f_767_ = (f_800_ * f_794_ + f_801_ * f_795_ + f_802_ * f_796_) * f_803_;
						f_800_ = f_783_ * f_799_ - f_784_ * f_798_;
						f_801_ = f_784_ * f_797_ - f_782_ * f_799_;
						f_802_ = f_782_ * f_798_ - f_783_ * f_797_;
						f_803_ = 1.0F / (f_800_ * f_785_ + f_801_ * f_786_ + f_802_ * f_787_);
						f_764_ = (f_800_ * f_788_ + f_801_ * f_789_ + f_802_ * f_790_) * f_803_;
						f_766_ = (f_800_ * f_791_ + f_801_ * f_792_ + f_802_ * f_793_) * f_803_;
						f_768_ = (f_800_ * f_794_ + f_801_ * f_795_ + f_802_ * f_796_) * f_803_;
					} else {
						final int i_804_ = class180_sub2.trianglesA[i_759_];
						final int i_805_ = class180_sub2.trianglesB[i_759_];
						final int i_806_ = class180_sub2.trianglesC[i_759_];
						final int i_807_ = is_734_[i_762_];
						final int i_808_ = is_735_[i_762_];
						final int i_809_ = is_736_[i_762_];
						final float[] fs_810_ = fs[i_762_];
						final byte i_811_ = class180_sub2.aByteArray2888[i_762_];
						final float f_812_ = class180_sub2.aByteArray2870[i_762_] / 256.0F;
						if (i_772_ == 1) {
							final float f_813_ = (class180_sub2.aShortArray2900[i_762_] & 0xffff) / 1024.0F;
							method2431(class180_sub2.xVertices[i_804_], class180_sub2.yVertices[i_804_], class180_sub2.zVertices[i_804_], i_807_, i_808_, i_809_, fs_810_, f_813_, i_811_, f_812_);
							f = aFloat3899;
							f_764_ = aFloat3903;
							method2431(class180_sub2.xVertices[i_805_], class180_sub2.yVertices[i_805_], class180_sub2.zVertices[i_805_], i_807_, i_808_, i_809_, fs_810_, f_813_, i_811_, f_812_);
							f_765_ = aFloat3899;
							f_766_ = aFloat3903;
							method2431(class180_sub2.xVertices[i_806_], class180_sub2.yVertices[i_806_], class180_sub2.zVertices[i_806_], i_807_, i_808_, i_809_, fs_810_, f_813_, i_811_, f_812_);
							f_767_ = aFloat3899;
							f_768_ = aFloat3903;
							final float f_814_ = f_813_ / 2.0F;
							if ((i_811_ & 0x1) == 0) {
								if (f_765_ - f > f_814_) {
									f_765_ -= f_813_;
									i_769_ = 1;
								} else if (f - f_765_ > f_814_) {
									f_765_ += f_813_;
									i_769_ = 2;
								}
								if (f_767_ - f > f_814_) {
									f_767_ -= f_813_;
									i_770_ = 1;
								} else if (f - f_767_ > f_814_) {
									f_767_ += f_813_;
									i_770_ = 2;
								}
							} else {
								if (f_766_ - f_764_ > f_814_) {
									f_766_ -= f_813_;
									i_769_ = 1;
								} else if (f_764_ - f_766_ > f_814_) {
									f_766_ += f_813_;
									i_769_ = 2;
								}
								if (f_768_ - f_764_ > f_814_) {
									f_768_ -= f_813_;
									i_770_ = 1;
								} else if (f_764_ - f_768_ > f_814_) {
									f_768_ += f_813_;
									i_770_ = 2;
								}
							}
						} else if (i_772_ == 2) {
							final float f_815_ = class180_sub2.aByteArray2859[i_762_] / 256.0F;
							final float f_816_ = class180_sub2.aByteArray2851[i_762_] / 256.0F;
							final int i_817_ = class180_sub2.xVertices[i_805_] - class180_sub2.xVertices[i_804_];
							final int i_818_ = class180_sub2.yVertices[i_805_] - class180_sub2.yVertices[i_804_];
							final int i_819_ = class180_sub2.zVertices[i_805_] - class180_sub2.zVertices[i_804_];
							final int i_820_ = class180_sub2.xVertices[i_806_] - class180_sub2.xVertices[i_804_];
							final int i_821_ = class180_sub2.yVertices[i_806_] - class180_sub2.yVertices[i_804_];
							final int i_822_ = class180_sub2.zVertices[i_806_] - class180_sub2.zVertices[i_804_];
							final int i_823_ = i_818_ * i_822_ - i_821_ * i_819_;
							final int i_824_ = i_819_ * i_820_ - i_822_ * i_817_;
							final int i_825_ = i_817_ * i_821_ - i_820_ * i_818_;
							final float f_826_ = 64.0F / (class180_sub2.aShortArray2903[i_762_] & 0xffff);
							final float f_827_ = 64.0F / (class180_sub2.aShortArray2873[i_762_] & 0xffff);
							final float f_828_ = 64.0F / (class180_sub2.aShortArray2900[i_762_] & 0xffff);
							final float f_829_ = (i_823_ * fs_810_[0] + i_824_ * fs_810_[1] + i_825_ * fs_810_[2]) / f_826_;
							final float f_830_ = (i_823_ * fs_810_[3] + i_824_ * fs_810_[4] + i_825_ * fs_810_[5]) / f_827_;
							final float f_831_ = (i_823_ * fs_810_[6] + i_824_ * fs_810_[7] + i_825_ * fs_810_[8]) / f_828_;
							i_771_ = method2437(f_829_, f_830_, f_831_);
							method2416(class180_sub2.xVertices[i_804_], class180_sub2.yVertices[i_804_], class180_sub2.zVertices[i_804_], i_807_, i_808_, i_809_, i_771_, fs_810_, i_811_, f_812_, f_815_, f_816_);
							f = aFloat3906;
							f_764_ = aFloat3900;
							method2416(class180_sub2.xVertices[i_805_], class180_sub2.yVertices[i_805_], class180_sub2.zVertices[i_805_], i_807_, i_808_, i_809_, i_771_, fs_810_, i_811_, f_812_, f_815_, f_816_);
							f_765_ = aFloat3906;
							f_766_ = aFloat3900;
							method2416(class180_sub2.xVertices[i_806_], class180_sub2.yVertices[i_806_], class180_sub2.zVertices[i_806_], i_807_, i_808_, i_809_, i_771_, fs_810_, i_811_, f_812_, f_815_, f_816_);
							f_767_ = aFloat3906;
							f_768_ = aFloat3900;
						} else if (i_772_ == 3) {
							method2434(class180_sub2.xVertices[i_804_], class180_sub2.yVertices[i_804_], class180_sub2.zVertices[i_804_], i_807_, i_808_, i_809_, fs_810_, i_811_, f_812_);
							f = aFloat3907;
							f_764_ = aFloat3902;
							method2434(class180_sub2.xVertices[i_805_], class180_sub2.yVertices[i_805_], class180_sub2.zVertices[i_805_], i_807_, i_808_, i_809_, fs_810_, i_811_, f_812_);
							f_765_ = aFloat3907;
							f_766_ = aFloat3902;
							method2434(class180_sub2.xVertices[i_806_], class180_sub2.yVertices[i_806_], class180_sub2.zVertices[i_806_], i_807_, i_808_, i_809_, fs_810_, i_811_, f_812_);
							f_767_ = aFloat3907;
							f_768_ = aFloat3902;
							if ((i_811_ & 0x1) == 0) {
								if (f_765_ - f > 0.5F) {
									f_765_--;
									i_769_ = 1;
								} else if (f - f_765_ > 0.5F) {
									f_765_++;
									i_769_ = 2;
								}
								if (f_767_ - f > 0.5F) {
									f_767_--;
									i_770_ = 1;
								} else if (f - f_767_ > 0.5F) {
									f_767_++;
									i_770_ = 2;
								}
							} else {
								if (f_766_ - f_764_ > 0.5F) {
									f_766_--;
									i_769_ = 1;
								} else if (f_764_ - f_766_ > 0.5F) {
									f_766_++;
									i_769_ = 2;
								}
								if (f_768_ - f_764_ > 0.5F) {
									f_768_--;
									i_770_ = 1;
								} else if (f_764_ - f_768_ > 0.5F) {
									f_768_++;
									i_770_ = 2;
								}
							}
						}
					}
				}
			}
			class180_sub2.method2303();
			byte i_832_;
			if (class180_sub2.aByteArray2895 == null) {
				i_832_ = (byte) 0;
			} else {
				i_832_ = class180_sub2.aByteArray2895[i_759_];
			}
			if (i_832_ == 0) {
				final long l = (i_762_ << 2) + ((long) (i_771_ << 24) + (long) (i_760_ << 8) + i_763_ << 32);
				final int i_833_ = class180_sub2.trianglesA[i_759_];
				final Class26 class26 = class180_sub2.aClass26Array2878[i_833_];
				aShortArray3866[i_758_] = method2413(class180_sub2, i_833_, l, class26.anInt157, class26.anInt155, class26.anInt160, class26.anInt156, f, f_764_);
				final int i_834_ = class180_sub2.trianglesB[i_759_];
				final Class26 class26_835_ = class180_sub2.aClass26Array2878[i_834_];
				aShortArray3877[i_758_] = method2413(class180_sub2, i_834_, l + i_769_, class26_835_.anInt157, class26_835_.anInt155, class26_835_.anInt160, class26_835_.anInt156, f_765_, f_766_);
				final int i_836_ = class180_sub2.trianglesC[i_759_];
				final Class26 class26_837_ = class180_sub2.aClass26Array2878[i_836_];
				aShortArray3879[i_758_] = method2413(class180_sub2, i_836_, l + i_770_, class26_837_.anInt157, class26_837_.anInt155, class26_837_.anInt160, class26_837_.anInt156, f_767_, f_768_);
			} else if (i_832_ == 1) {
				final Class115 class115 = class180_sub2.aClass115Array2880[i_759_];
				final long l = (i_762_ << 2) + (class115.anInt1111 > 0 ? 1024 : 2048) + (class115.anInt1109 + 256 << 12) + (class115.anInt1112 + 256 << 22) + ((long) (i_771_ << 24) + (long) (i_760_ << 8) + i_763_ << 32);
				aShortArray3866[i_758_] = method2413(class180_sub2, class180_sub2.trianglesA[i_759_], l, class115.anInt1111, class115.anInt1109, class115.anInt1112, 0, f, f_764_);
				aShortArray3877[i_758_] = method2413(class180_sub2, class180_sub2.trianglesB[i_759_], l + i_769_, class115.anInt1111, class115.anInt1109, class115.anInt1112, 0, f_765_, f_766_);
				aShortArray3879[i_758_] = method2413(class180_sub2, class180_sub2.trianglesC[i_759_], l + i_770_, class115.anInt1111, class115.anInt1109, class115.anInt1112, 0, f_767_, f_768_);
			}
			if (class180_sub2.aShortArray2850 != null) {
				aShortArray3855[i_758_] = class180_sub2.aShortArray2850[i_759_];
			} else {
				aShortArray3855[i_758_] = (short) -1;
			}
			if (aByteArray3872 != null) {
				aByteArray3872[i_758_] = (byte) class180_sub2.anIntArray2872[i_759_];
			}
			aShortArray3857[i_758_] = class180_sub2.triangleColors[i_759_];
			if (class180_sub2.aByteArray2864 != null) {
				aByteArray3884[i_758_] = class180_sub2.aByteArray2864[i_759_];
			}
			if (class180_sub2.aShortArray2867 != null) {
				aShortArray3846[i_758_] = class180_sub2.aShortArray2867[i_759_];
			}
		}
		int i_838_ = 0;
		short i_839_ = -10000;
		for (int i_840_ = 0; i_840_ < anInt3867; i_840_++) {
			final short i_841_ = aShortArray3855[i_840_];
			if (i_841_ != i_839_) {
				i_838_++;
				i_839_ = i_841_;
			}
		}
		anIntArray3865 = new int[i_838_ + 1];
		i_838_ = 0;
		i_839_ = (short) -10000;
		for (int i_842_ = 0; i_842_ < anInt3867; i_842_++) {
			final short i_843_ = aShortArray3855[i_842_];
			if (i_843_ != i_839_) {
				anIntArray3865[i_838_++] = i_842_;
				i_839_ = i_843_;
			}
		}
		anIntArray3865[i_838_] = anInt3867;
		aLongArray3883 = null;
		aShortArray3873 = method2420(aShortArray3873, anInt3890);
		aShortArray3852 = method2420(aShortArray3852, anInt3890);
		aShortArray3844 = method2420(aShortArray3844, anInt3890);
		aShortArray3849 = method2420(aShortArray3849, anInt3890);
		aFloatArray3874 = method2435(aFloatArray3874, anInt3890);
		aFloatArray3868 = method2435(aFloatArray3868, anInt3890);
	}
}
