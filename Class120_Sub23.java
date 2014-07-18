/* Class120_Sub23 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class120_Sub23 extends Node {
	private static int anInt2682;
	private static float[] aFloatArray2683;
	private static int[] anIntArray2684;
	private int anInt2685;
	private static Class155[] aClass155Array2686;
	private static byte[] aByteArray2687;
	private static float[] aFloatArray2688;
	private static float[] aFloatArray2689;
	private static int anInt2690;
	private boolean aBoolean2691;
	private static float[] aFloatArray2692;
	private int anInt2693;
	private int anInt2694;
	private static float[] aFloatArray2695;
	private static int[] anIntArray2696;
	private static float[] aFloatArray2697;
	private static Class149[] aClass149Array2698;
	private static boolean aBoolean2699 = false;
	private static int anInt2700;
	private int anInt2701;
	private int anInt2702;
	private static int anInt2703;
	private byte[][] aByteArrayArray2704;
	private static boolean[] aBooleanArray2705;
	private static float[] aFloatArray2706;
	private static Class16[] aClass16Array2707;
	private float[] aFloatArray2708;
	private static int[] anIntArray2709;
	static Class129[] aClass129Array2710;
	private boolean aBoolean2711;
	private int anInt2712;
	private int anInt2713;
	private byte[] aByteArray2714;
	private int anInt2715;

	private final float[] method1707(final int i) {
		method1709(aByteArrayArray2704[i], 0);
		method1712();
		final int i_0_ = method1717(Class110.method979(anIntArray2684.length - 1, -90));
		final boolean bool = aBooleanArray2705[i_0_];
		final int i_1_ = bool ? anInt2690 : anInt2682;
		boolean bool_2_ = false;
		boolean bool_3_ = false;
		if (bool) {
			bool_2_ = method1712() != 0;
			bool_3_ = method1712() != 0;
		}
		final int i_4_ = i_1_ >> 1;
		int i_5_;
		int i_6_;
		int i_7_;
		if (bool && !bool_2_) {
			i_5_ = (i_1_ >> 2) - (anInt2682 >> 2);
			i_6_ = (i_1_ >> 2) + (anInt2682 >> 2);
			i_7_ = anInt2682 >> 1;
		} else {
			i_5_ = 0;
			i_6_ = i_4_;
			i_7_ = i_1_ >> 1;
		}
		int i_8_;
		int i_9_;
		int i_10_;
		if (bool && !bool_3_) {
			i_8_ = i_1_ - (i_1_ >> 2) - (anInt2682 >> 2);
			i_9_ = i_1_ - (i_1_ >> 2) + (anInt2682 >> 2);
			i_10_ = anInt2682 >> 1;
		} else {
			i_8_ = i_4_;
			i_9_ = i_1_;
			i_10_ = i_1_ >> 1;
		}
		final Class149 class149 = aClass149Array2698[anIntArray2684[i_0_]];
		final int i_11_ = class149.anInt1401;
		int i_12_ = class149.anIntArray1403[i_11_];
		final boolean bool_13_ = !aClass16Array2707[i_12_].method152();
		final boolean bool_14_ = bool_13_;
		for (i_12_ = 0; i_12_ < class149.anInt1402; i_12_++) {
			final Class155 class155 = aClass155Array2686[class149.anIntArray1404[i_12_]];
			final float[] fs = aFloatArray2697;
			class155.method2084(fs, i_1_ >> 1, bool_14_);
		}
		if (!bool_13_) {
			i_12_ = class149.anInt1401;
			final int i_15_ = class149.anIntArray1403[i_12_];
			aClass16Array2707[i_15_].method149(aFloatArray2697, i_1_ >> 1);
		}
		if (bool_13_) {
			for (i_12_ = i_1_ >> 1; i_12_ < i_1_; i_12_++) {
				aFloatArray2697[i_12_] = 0.0F;
			}
		} else {
			i_12_ = i_1_ >> 1;
			final int i_16_ = i_1_ >> 2;
			final int i_17_ = i_1_ >> 3;
			final float[] fs = aFloatArray2697;
			for (int i_18_ = 0; i_18_ < i_12_; i_18_++) {
				fs[i_18_] *= 0.5F;
			}
			for (int i_19_ = i_12_; i_19_ < i_1_; i_19_++) {
				fs[i_19_] = -fs[i_1_ - i_19_ - 1];
			}
			final float[] fs_20_ = bool ? aFloatArray2692 : aFloatArray2688;
			final float[] fs_21_ = bool ? aFloatArray2706 : aFloatArray2695;
			final float[] fs_22_ = bool ? aFloatArray2683 : aFloatArray2689;
			final int[] is = bool ? anIntArray2709 : anIntArray2696;
			for (int i_23_ = 0; i_23_ < i_16_; i_23_++) {
				final float f = fs[4 * i_23_] - fs[i_1_ - 4 * i_23_ - 1];
				final float f_24_ = fs[4 * i_23_ + 2] - fs[i_1_ - 4 * i_23_ - 3];
				final float f_25_ = fs_20_[2 * i_23_];
				final float f_26_ = fs_20_[2 * i_23_ + 1];
				fs[i_1_ - 4 * i_23_ - 1] = f * f_25_ - f_24_ * f_26_;
				fs[i_1_ - 4 * i_23_ - 3] = f * f_26_ + f_24_ * f_25_;
			}
			for (int i_27_ = 0; i_27_ < i_17_; i_27_++) {
				final float f = fs[i_12_ + 3 + 4 * i_27_];
				final float f_28_ = fs[i_12_ + 1 + 4 * i_27_];
				final float f_29_ = fs[4 * i_27_ + 3];
				final float f_30_ = fs[4 * i_27_ + 1];
				fs[i_12_ + 3 + 4 * i_27_] = f + f_29_;
				fs[i_12_ + 1 + 4 * i_27_] = f_28_ + f_30_;
				final float f_31_ = fs_20_[i_12_ - 4 - 4 * i_27_];
				final float f_32_ = fs_20_[i_12_ - 3 - 4 * i_27_];
				fs[4 * i_27_ + 3] = (f - f_29_) * f_31_ - (f_28_ - f_30_) * f_32_;
				fs[4 * i_27_ + 1] = (f_28_ - f_30_) * f_31_ + (f - f_29_) * f_32_;
			}
			final int i_33_ = Class110.method979(i_1_ - 1, -91);
			for (int i_34_ = 0; i_34_ < i_33_ - 3; i_34_++) {
				final int i_35_ = i_1_ >> i_34_ + 2;
				final int i_36_ = 8 << i_34_;
				for (int i_37_ = 0; i_37_ < 2 << i_34_; i_37_++) {
					final int i_38_ = i_1_ - i_35_ * 2 * i_37_;
					final int i_39_ = i_1_ - i_35_ * (2 * i_37_ + 1);
					for (int i_40_ = 0; i_40_ < i_1_ >> i_34_ + 4; i_40_++) {
						final int i_41_ = 4 * i_40_;
						final float f = fs[i_38_ - 1 - i_41_];
						final float f_42_ = fs[i_38_ - 3 - i_41_];
						final float f_43_ = fs[i_39_ - 1 - i_41_];
						final float f_44_ = fs[i_39_ - 3 - i_41_];
						fs[i_38_ - 1 - i_41_] = f + f_43_;
						fs[i_38_ - 3 - i_41_] = f_42_ + f_44_;
						final float f_45_ = fs_20_[i_40_ * i_36_];
						final float f_46_ = fs_20_[i_40_ * i_36_ + 1];
						fs[i_39_ - 1 - i_41_] = (f - f_43_) * f_45_ - (f_42_ - f_44_) * f_46_;
						fs[i_39_ - 3 - i_41_] = (f_42_ - f_44_) * f_45_ + (f - f_43_) * f_46_;
					}
				}
			}
			for (int i_47_ = 1; i_47_ < i_17_ - 1; i_47_++) {
				final int i_48_ = is[i_47_];
				if (i_47_ < i_48_) {
					final int i_49_ = 8 * i_47_;
					final int i_50_ = 8 * i_48_;
					float f = fs[i_49_ + 1];
					fs[i_49_ + 1] = fs[i_50_ + 1];
					fs[i_50_ + 1] = f;
					f = fs[i_49_ + 3];
					fs[i_49_ + 3] = fs[i_50_ + 3];
					fs[i_50_ + 3] = f;
					f = fs[i_49_ + 5];
					fs[i_49_ + 5] = fs[i_50_ + 5];
					fs[i_50_ + 5] = f;
					f = fs[i_49_ + 7];
					fs[i_49_ + 7] = fs[i_50_ + 7];
					fs[i_50_ + 7] = f;
				}
			}
			for (int i_51_ = 0; i_51_ < i_12_; i_51_++) {
				fs[i_51_] = fs[2 * i_51_ + 1];
			}
			for (int i_52_ = 0; i_52_ < i_17_; i_52_++) {
				fs[i_1_ - 1 - 2 * i_52_] = fs[4 * i_52_];
				fs[i_1_ - 2 - 2 * i_52_] = fs[4 * i_52_ + 1];
				fs[i_1_ - i_16_ - 1 - 2 * i_52_] = fs[4 * i_52_ + 2];
				fs[i_1_ - i_16_ - 2 - 2 * i_52_] = fs[4 * i_52_ + 3];
			}
			for (int i_53_ = 0; i_53_ < i_17_; i_53_++) {
				final float f = fs_22_[2 * i_53_];
				final float f_54_ = fs_22_[2 * i_53_ + 1];
				final float f_55_ = fs[i_12_ + 2 * i_53_];
				final float f_56_ = fs[i_12_ + 2 * i_53_ + 1];
				final float f_57_ = fs[i_1_ - 2 - 2 * i_53_];
				final float f_58_ = fs[i_1_ - 1 - 2 * i_53_];
				float f_59_ = f_54_ * (f_55_ - f_57_) + f * (f_56_ + f_58_);
				fs[i_12_ + 2 * i_53_] = (f_55_ + f_57_ + f_59_) * 0.5F;
				fs[i_1_ - 2 - 2 * i_53_] = (f_55_ + f_57_ - f_59_) * 0.5F;
				f_59_ = f_54_ * (f_56_ + f_58_) - f * (f_55_ - f_57_);
				fs[i_12_ + 2 * i_53_ + 1] = (f_56_ - f_58_ + f_59_) * 0.5F;
				fs[i_1_ - 1 - 2 * i_53_] = (-f_56_ + f_58_ + f_59_) * 0.5F;
			}
			for (int i_60_ = 0; i_60_ < i_16_; i_60_++) {
				fs[i_60_] = fs[2 * i_60_ + i_12_] * fs_21_[2 * i_60_] + fs[2 * i_60_ + 1 + i_12_] * fs_21_[2 * i_60_ + 1];
				fs[i_12_ - 1 - i_60_] = fs[2 * i_60_ + i_12_] * fs_21_[2 * i_60_ + 1] - fs[2 * i_60_ + 1 + i_12_] * fs_21_[2 * i_60_];
			}
			for (int i_61_ = 0; i_61_ < i_16_; i_61_++) {
				fs[i_1_ - i_16_ + i_61_] = -fs[i_61_];
			}
			for (int i_62_ = 0; i_62_ < i_16_; i_62_++) {
				fs[i_62_] = fs[i_16_ + i_62_];
			}
			for (int i_63_ = 0; i_63_ < i_16_; i_63_++) {
				fs[i_16_ + i_63_] = -fs[i_16_ - i_63_ - 1];
			}
			for (int i_64_ = 0; i_64_ < i_16_; i_64_++) {
				fs[i_12_ + i_64_] = fs[i_1_ - i_64_ - 1];
			}
			for (int i_65_ = i_5_; i_65_ < i_6_; i_65_++) {
				final float f = (float) Math.sin((i_65_ - i_5_ + 0.5) / i_7_ * 0.5 * 3.141592653589793);
				aFloatArray2697[i_65_] *= (float) Math.sin(1.5707963267948966 * f * f);
			}
			for (int i_66_ = i_8_; i_66_ < i_9_; i_66_++) {
				final float f = (float) Math.sin((i_66_ - i_8_ + 0.5) / i_10_ * 0.5 * 3.141592653589793 + 1.5707963267948966);
				aFloatArray2697[i_66_] *= (float) Math.sin(1.5707963267948966 * f * f);
			}
		}
		float[] fs = null;
		if (anInt2712 > 0) {
			final int i_67_ = anInt2712 + i_1_ >> 2;
			fs = new float[i_67_];
			if (!aBoolean2691) {
				for (int i_68_ = 0; i_68_ < anInt2693; i_68_++) {
					final int i_69_ = (anInt2712 >> 1) + i_68_;
					fs[i_68_] += aFloatArray2708[i_69_];
				}
			}
			if (!bool_13_) {
				for (int i_70_ = i_5_; i_70_ < i_1_ >> 1; i_70_++) {
					final int i_71_ = fs.length - (i_1_ >> 1) + i_70_;
					fs[i_71_] += aFloatArray2697[i_70_];
				}
			}
		}
		final float[] fs_72_ = aFloatArray2708;
		aFloatArray2708 = aFloatArray2697;
		aFloatArray2697 = fs_72_;
		anInt2712 = i_1_;
		anInt2693 = i_9_ - (i_1_ >> 1);
		aBoolean2691 = bool_13_;
		return fs;
	}

	private static final boolean method1708(final js5 js5) {
		if (!aBoolean2699) {
			final byte[] is = js5.getFile(0, 0);
			if (is == null) {
				return false;
			}
			method1710(is);
			aBoolean2699 = true;
		}
		return true;
	}

	private static final void method1709(final byte[] is, final int i) {
		aByteArray2687 = is;
		anInt2700 = i;
		anInt2703 = 0;
	}

	private static final void method1710(final byte[] is) {
		method1709(is, 0);
		anInt2682 = 1 << method1717(4);
		anInt2690 = 1 << method1717(4);
		aFloatArray2697 = new float[anInt2690];
		for (int i = 0; i < 2; i++) {
			final int i_73_ = i != 0 ? anInt2690 : anInt2682;
			final int i_74_ = i_73_ >> 1;
			final int i_75_ = i_73_ >> 2;
			final int i_76_ = i_73_ >> 3;
			final float[] fs = new float[i_74_];
			for (int i_77_ = 0; i_77_ < i_75_; i_77_++) {
				fs[2 * i_77_] = (float) Math.cos(4 * i_77_ * 3.141592653589793 / i_73_);
				fs[2 * i_77_ + 1] = -(float) Math.sin(4 * i_77_ * 3.141592653589793 / i_73_);
			}
			final float[] fs_78_ = new float[i_74_];
			for (int i_79_ = 0; i_79_ < i_75_; i_79_++) {
				fs_78_[2 * i_79_] = (float) Math.cos((2 * i_79_ + 1) * 3.141592653589793 / (2 * i_73_));
				fs_78_[2 * i_79_ + 1] = (float) Math.sin((2 * i_79_ + 1) * 3.141592653589793 / (2 * i_73_));
			}
			final float[] fs_80_ = new float[i_75_];
			for (int i_81_ = 0; i_81_ < i_76_; i_81_++) {
				fs_80_[2 * i_81_] = (float) Math.cos((4 * i_81_ + 2) * 3.141592653589793 / i_73_);
				fs_80_[2 * i_81_ + 1] = -(float) Math.sin((4 * i_81_ + 2) * 3.141592653589793 / i_73_);
			}
			final int[] is_82_ = new int[i_76_];
			final int i_83_ = Class110.method979(i_76_ - 1, -67);
			for (int i_84_ = 0; i_84_ < i_76_; i_84_++) {
				is_82_[i_84_] = Class120_Sub13.method1405(i_84_, false, i_83_);
			}
			if (i != 0) {
				aFloatArray2692 = fs;
				aFloatArray2706 = fs_78_;
				aFloatArray2683 = fs_80_;
				anIntArray2709 = is_82_;
			} else {
				aFloatArray2688 = fs;
				aFloatArray2695 = fs_78_;
				aFloatArray2689 = fs_80_;
				anIntArray2696 = is_82_;
			}
		}
		final int i = method1717(8) + 1;
		aClass129Array2710 = new Class129[i];
		for (int i_85_ = 0; i_85_ < i; i_85_++) {
			aClass129Array2710[i_85_] = new Class129();
		}
		int i_86_ = method1717(6) + 1;
		for (int i_87_ = 0; i_87_ < i_86_; i_87_++) {
			method1717(16);
		}
		i_86_ = method1717(6) + 1;
		aClass16Array2707 = new Class16[i_86_];
		for (int i_88_ = 0; i_88_ < i_86_; i_88_++) {
			aClass16Array2707[i_88_] = new Class16();
		}
		final int i_89_ = method1717(6) + 1;
		aClass155Array2686 = new Class155[i_89_];
		for (int i_90_ = 0; i_90_ < i_89_; i_90_++) {
			aClass155Array2686[i_90_] = new Class155();
		}
		final int i_91_ = method1717(6) + 1;
		aClass149Array2698 = new Class149[i_91_];
		for (int i_92_ = 0; i_92_ < i_91_; i_92_++) {
			aClass149Array2698[i_92_] = new Class149();
		}
		final int i_93_ = method1717(6) + 1;
		aBooleanArray2705 = new boolean[i_93_];
		anIntArray2684 = new int[i_93_];
		for (int i_94_ = 0; i_94_ < i_93_; i_94_++) {
			aBooleanArray2705[i_94_] = method1712() != 0;
			method1717(16);
			method1717(16);
			anIntArray2684[i_94_] = method1717(8);
		}
	}

	private final void method1711(final byte[] is) {
		final Buffer class120_sub7 = new Buffer(is);
		anInt2694 = class120_sub7.getInt();
		anInt2685 = class120_sub7.getInt();
		anInt2701 = class120_sub7.getInt();
		anInt2702 = class120_sub7.getInt();
		if (anInt2702 < 0) {
			anInt2702 ^= 0xffffffff;
			aBoolean2711 = true;
		}
		final int i = class120_sub7.getInt();
		aByteArrayArray2704 = new byte[i][];
		for (int i_95_ = 0; i_95_ < i; i_95_++) {
			int i_96_ = 0;
			int i_97_;
			do {
				i_97_ = class120_sub7.getUByte();
				i_96_ += i_97_;
			} while (i_97_ >= 255);
			final byte[] is_98_ = new byte[i_96_];
			class120_sub7.getBuffer(is_98_, 0, i_96_);
			aByteArrayArray2704[i_95_] = is_98_;
		}
	}

	static final int method1712() {
		final int i = aByteArray2687[anInt2700] >> anInt2703 & 0x1;
		anInt2703++;
		anInt2700 += anInt2703 >> 3;
		anInt2703 &= 0x7;
		return i;
	}

	public static void method1713() {
		aByteArray2687 = null;
		aClass129Array2710 = null;
		aClass16Array2707 = null;
		aClass155Array2686 = null;
		aClass149Array2698 = null;
		aBooleanArray2705 = null;
		anIntArray2684 = null;
		aFloatArray2697 = null;
		aFloatArray2688 = null;
		aFloatArray2695 = null;
		aFloatArray2689 = null;
		aFloatArray2692 = null;
		aFloatArray2706 = null;
		aFloatArray2683 = null;
		anIntArray2696 = null;
		anIntArray2709 = null;
	}

	static final float method1714(final int i) {
		int i_99_ = i & 0x1fffff;
		final int i_100_ = i & ~0x7fffffff;
		final int i_101_ = (i & 0x7fe00000) >> 21;
		if (i_100_ != 0) {
			i_99_ = -i_99_;
		}
		return (float) (i_99_ * Math.pow(2.0, i_101_ - 788));
	}

	final Class120_Sub5_Sub1 method1715(final int[] is) {
		if (is != null && is[0] <= 0) {
			return null;
		}
		if (aByteArray2714 == null) {
			anInt2712 = 0;
			aFloatArray2708 = new float[anInt2690];
			aByteArray2714 = new byte[anInt2685];
			anInt2715 = 0;
			anInt2713 = 0;
		}
		for (/**/; anInt2713 < aByteArrayArray2704.length; anInt2713++) {
			if (is != null && is[0] <= 0) {
				return null;
			}
			final float[] fs = method1707(anInt2713);
			if (fs != null) {
				int i = anInt2715;
				int i_102_ = fs.length;
				if (i_102_ > anInt2685 - i) {
					i_102_ = anInt2685 - i;
				}
				for (int i_103_ = 0; i_103_ < i_102_; i_103_++) {
					int i_104_ = (int) (128.0F + fs[i_103_] * 128.0F);
					if ((i_104_ & ~0xff) != 0) {
						i_104_ = (i_104_ ^ 0xffffffff) >> 31;
					}
					aByteArray2714[i++] = (byte) (i_104_ - 128);
				}
				if (is != null) {
					is[0] -= i - anInt2715;
				}
				anInt2715 = i;
			}
		}
		aFloatArray2708 = null;
		final byte[] is_105_ = aByteArray2714;
		aByteArray2714 = null;
		return new Class120_Sub5_Sub1(anInt2694, is_105_, anInt2701, anInt2702, aBoolean2711);
	}

	static final Class120_Sub23 method1716(final js5 js5, final int i, final int i_106_) {
		if (!method1708(js5)) {
			js5.method440(i, true, i_106_);
			return null;
		}
		final byte[] is = js5.getFile(i, i_106_);
		if (is == null) {
			return null;
		}
		return new Class120_Sub23(is);
	}

	static final int method1717(int i) {
		int i_107_ = 0;
		int i_108_ = 0;
		int i_109_;
		for (/**/; i >= 8 - anInt2703; i -= i_109_) {
			i_109_ = 8 - anInt2703;
			final int i_110_ = (1 << i_109_) - 1;
			i_107_ += (aByteArray2687[anInt2700] >> anInt2703 & i_110_) << i_108_;
			anInt2703 = 0;
			anInt2700++;
			i_108_ += i_109_;
		}
		if (i > 0) {
			i_109_ = (1 << i) - 1;
			i_107_ += (aByteArray2687[anInt2700] >> anInt2703 & i_109_) << i_108_;
			anInt2703 += i;
		}
		return i_107_;
	}

	private Class120_Sub23(final byte[] is) {
		method1711(is);
	}
}
