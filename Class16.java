/* Class16 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class16 {
	private final int[] anIntArray102;
	private final int[] anIntArray103;
	private final int[] anIntArray104;
	private static boolean[] aBooleanArray105;
	private static int[] anIntArray106;
	private static int[] anIntArray107;
	private final int[] anIntArray108;
	private final int[][] anIntArrayArray109;
	private final int anInt110;
	private static float[] aFloatArray111 = { 1.0649863E-7F, 1.1341951E-7F, 1.2079015E-7F, 1.2863978E-7F, 1.369995E-7F, 1.459025E-7F, 1.5538409E-7F, 1.6548181E-7F, 1.7623574E-7F, 1.8768856E-7F, 1.998856E-7F, 2.128753E-7F, 2.2670913E-7F, 2.4144197E-7F, 2.5713223E-7F, 2.7384212E-7F, 2.9163792E-7F,
			3.1059022E-7F, 3.307741E-7F, 3.5226967E-7F, 3.7516213E-7F, 3.995423E-7F, 4.255068E-7F, 4.5315863E-7F, 4.8260745E-7F, 5.1397E-7F, 5.4737063E-7F, 5.829419E-7F, 6.208247E-7F, 6.611694E-7F, 7.041359E-7F, 7.4989464E-7F, 7.98627E-7F, 8.505263E-7F, 9.057983E-7F, 9.646621E-7F, 1.0273513E-6F,
			1.0941144E-6F, 1.1652161E-6F, 1.2409384E-6F, 1.3215816E-6F, 1.4074654E-6F, 1.4989305E-6F, 1.5963394E-6F, 1.7000785E-6F, 1.8105592E-6F, 1.9282195E-6F, 2.053526E-6F, 2.1869757E-6F, 2.3290977E-6F, 2.4804558E-6F, 2.6416496E-6F, 2.813319E-6F, 2.9961443E-6F, 3.1908505E-6F, 3.39821E-6F,
			3.619045E-6F, 3.8542307E-6F, 4.1047006E-6F, 4.371447E-6F, 4.6555283E-6F, 4.958071E-6F, 5.280274E-6F, 5.623416E-6F, 5.988857E-6F, 6.3780467E-6F, 6.7925284E-6F, 7.2339453E-6F, 7.704048E-6F, 8.2047E-6F, 8.737888E-6F, 9.305725E-6F, 9.910464E-6F, 1.0554501E-5F, 1.1240392E-5F, 1.1970856E-5F,
			1.2748789E-5F, 1.3577278E-5F, 1.4459606E-5F, 1.5399271E-5F, 1.6400005E-5F, 1.7465769E-5F, 1.8600793E-5F, 1.9809577E-5F, 2.1096914E-5F, 2.2467912E-5F, 2.3928002E-5F, 2.5482977E-5F, 2.7139005E-5F, 2.890265E-5F, 3.078091E-5F, 3.2781227E-5F, 3.4911533E-5F, 3.718028E-5F, 3.9596467E-5F,
			4.2169668E-5F, 4.491009E-5F, 4.7828602E-5F, 5.0936775E-5F, 5.424693E-5F, 5.7772202E-5F, 6.152657E-5F, 6.552491E-5F, 6.9783084E-5F, 7.4317984E-5F, 7.914758E-5F, 8.429104E-5F, 8.976875E-5F, 9.560242E-5F, 1.0181521E-4F, 1.0843174E-4F, 1.1547824E-4F, 1.2298267E-4F, 1.3097477E-4F,
			1.3948625E-4F, 1.4855085E-4F, 1.5820454E-4F, 1.6848555E-4F, 1.7943469E-4F, 1.9109536E-4F, 2.0351382E-4F, 2.167393E-4F, 2.3082423E-4F, 2.4582449E-4F, 2.6179955E-4F, 2.7881275E-4F, 2.9693157E-4F, 3.1622787E-4F, 3.3677815E-4F, 3.5866388E-4F, 3.8197188E-4F, 4.0679457E-4F, 4.3323037E-4F,
			4.613841E-4F, 4.913675E-4F, 5.2329927E-4F, 5.573062E-4F, 5.935231E-4F, 6.320936E-4F, 6.731706E-4F, 7.16917E-4F, 7.635063E-4F, 8.1312325E-4F, 8.6596457E-4F, 9.2223985E-4F, 9.821722E-4F, 0.0010459992F, 0.0011139743F, 0.0011863665F, 0.0012634633F, 0.0013455702F, 0.0014330129F,
			0.0015261382F, 0.0016253153F, 0.0017309374F, 0.0018434235F, 0.0019632196F, 0.0020908006F, 0.0022266726F, 0.0023713743F, 0.0025254795F, 0.0026895993F, 0.0028643848F, 0.0030505287F, 0.003248769F, 0.0034598925F, 0.0036847359F, 0.0039241905F, 0.0041792067F, 0.004450795F, 0.004740033F,
			0.005048067F, 0.0053761187F, 0.005725489F, 0.0060975635F, 0.0064938175F, 0.0069158226F, 0.0073652514F, 0.007843887F, 0.008353627F, 0.008896492F, 0.009474637F, 0.010090352F, 0.01074608F, 0.011444421F, 0.012188144F, 0.012980198F, 0.013823725F, 0.014722068F, 0.015678791F, 0.016697686F,
			0.017782796F, 0.018938422F, 0.020169148F, 0.021479854F, 0.022875736F, 0.02436233F, 0.025945531F, 0.027631618F, 0.029427277F, 0.031339627F, 0.03337625F, 0.035545226F, 0.037855156F, 0.0403152F, 0.042935107F, 0.045725275F, 0.048696756F, 0.05186135F, 0.05523159F, 0.05882085F, 0.062643364F,
			0.06671428F, 0.07104975F, 0.075666964F, 0.08058423F, 0.08582105F, 0.09139818F, 0.097337745F, 0.1036633F, 0.11039993F, 0.11757434F, 0.12521498F, 0.13335215F, 0.14201812F, 0.15124726F, 0.16107617F, 0.1715438F, 0.18269168F, 0.19456401F, 0.20720787F, 0.22067343F, 0.23501402F, 0.25028655F,
			0.26655158F, 0.28387362F, 0.3023213F, 0.32196787F, 0.34289113F, 0.36517414F, 0.3889052F, 0.41417846F, 0.44109413F, 0.4697589F, 0.50028646F, 0.53279793F, 0.5674221F, 0.6042964F, 0.64356697F, 0.6853896F, 0.72993004F, 0.777365F, 0.8278826F, 0.88168305F, 0.9389798F, 1.0F };
	private final int[] anIntArray112;
	private static int[] anIntArray113 = { 256, 128, 86, 64 };

	private static final int method148(final int[] is, final int i) {
		final int i_0_ = is[i];
		int i_1_ = -1;
		int i_2_ = -2147483648;
		for (int i_3_ = 0; i_3_ < i; i_3_++) {
			final int i_4_ = is[i_3_];
			if (i_4_ < i_0_ && i_4_ > i_2_) {
				i_1_ = i_3_;
				i_2_ = i_4_;
			}
		}
		return i_1_;
	}

	final void method149(final float[] fs, final int i) {
		final int i_5_ = anIntArray108.length;
		final int i_6_ = anIntArray113[anInt110 - 1];
		aBooleanArray105[0] = aBooleanArray105[1] = true;
		for (int i_7_ = 2; i_7_ < i_5_; i_7_++) {
			final int i_8_ = method148(anIntArray106, i_7_);
			final int i_9_ = method153(anIntArray106, i_7_);
			final int i_10_ = method155(anIntArray106[i_8_], anIntArray107[i_8_], anIntArray106[i_9_], anIntArray107[i_9_], anIntArray106[i_7_]);
			final int i_11_ = anIntArray107[i_7_];
			final int i_12_ = i_6_ - i_10_;
			final int i_13_ = i_10_;
			final int i_14_ = (i_12_ < i_13_ ? i_12_ : i_13_) << 1;
			if (i_11_ != 0) {
				aBooleanArray105[i_8_] = aBooleanArray105[i_9_] = true;
				aBooleanArray105[i_7_] = true;
				if (i_11_ >= i_14_) {
					anIntArray107[i_7_] = i_12_ > i_13_ ? i_11_ - i_13_ + i_10_ : i_10_ - i_11_ + i_12_ - 1;
				} else {
					anIntArray107[i_7_] = (i_11_ & 0x1) != 0 ? i_10_ - (i_11_ + 1) / 2 : i_10_ + i_11_ / 2;
				}
			} else {
				aBooleanArray105[i_7_] = false;
				anIntArray107[i_7_] = i_10_;
			}
		}
		method150(0, i_5_ - 1);
		int i_15_ = 0;
		int i_16_ = anIntArray107[0] * anInt110;
		for (int i_17_ = 1; i_17_ < i_5_; i_17_++) {
			if (aBooleanArray105[i_17_]) {
				final int i_18_ = anIntArray106[i_17_];
				final int i_19_ = anIntArray107[i_17_] * anInt110;
				method154(i_15_, i_16_, i_18_, i_19_, fs, i);
				if (i_18_ >= i) {
					return;
				}
				i_15_ = i_18_;
				i_16_ = i_19_;
			}
		}
		final float f = aFloatArray111[i_16_];
		for (int i_20_ = i_15_; i_20_ < i; i_20_++) {
			fs[i_20_] *= f;
		}
	}

	private final void method150(final int i, final int i_21_) {
		if (i < i_21_) {
			int i_22_ = i;
			final int i_23_ = anIntArray106[i_22_];
			final int i_24_ = anIntArray107[i_22_];
			final boolean bool = aBooleanArray105[i_22_];
			for (int i_25_ = i + 1; i_25_ <= i_21_; i_25_++) {
				final int i_26_ = anIntArray106[i_25_];
				if (i_26_ < i_23_) {
					anIntArray106[i_22_] = i_26_;
					anIntArray107[i_22_] = anIntArray107[i_25_];
					aBooleanArray105[i_22_] = aBooleanArray105[i_25_];
					i_22_++;
					anIntArray106[i_25_] = anIntArray106[i_22_];
					anIntArray107[i_25_] = anIntArray107[i_22_];
					aBooleanArray105[i_25_] = aBooleanArray105[i_22_];
				}
			}
			anIntArray106[i_22_] = i_23_;
			anIntArray107[i_22_] = i_24_;
			aBooleanArray105[i_22_] = bool;
			method150(i, i_22_ - 1);
			method150(i_22_ + 1, i_21_);
		}
	}

	public static void method151() {
		anIntArray113 = null;
		aFloatArray111 = null;
		anIntArray106 = null;
		anIntArray107 = null;
		aBooleanArray105 = null;
	}

	final boolean method152() {
		final boolean bool = Class120_Sub23.method1712() != 0;
		if (!bool) {
			return false;
		}
		final int i = anIntArray108.length;
		for (int i_27_ = 0; i_27_ < i; i_27_++) {
			anIntArray106[i_27_] = anIntArray108[i_27_];
		}
		final int i_28_ = anIntArray113[anInt110 - 1];
		final int i_29_ = Class110.method979(i_28_ - 1);
		anIntArray107[0] = Class120_Sub23.method1717(i_29_);
		anIntArray107[1] = Class120_Sub23.method1717(i_29_);
		int i_30_ = 2;
		int[] is;
		final int i_31_ = (is = anIntArray103).length;
		for (int i_32_ = 0; i_32_ < i_31_; i_32_++) {
			final int i_33_ = is[i_32_];
			final int i_34_ = anIntArray104[i_33_];
			final int i_35_ = anIntArray102[i_33_];
			final int i_36_ = (1 << i_35_) - 1;
			int i_37_ = 0;
			if (i_35_ > 0) {
				i_37_ = Class120_Sub23.aClass129Array2710[anIntArray112[i_33_]].method1913();
			}
			for (int i_38_ = 0; i_38_ < i_34_; i_38_++) {
				final int i_39_ = anIntArrayArray109[i_33_][i_37_ & i_36_];
				i_37_ >>>= i_35_;
				anIntArray107[i_30_++] = i_39_ >= 0 ? Class120_Sub23.aClass129Array2710[i_39_].method1913() : 0;
			}
		}
		return true;
	}

	private static final int method153(final int[] is, final int i) {
		final int i_40_ = is[i];
		int i_41_ = -1;
		int i_42_ = 2147483647;
		for (int i_43_ = 0; i_43_ < i; i_43_++) {
			final int i_44_ = is[i_43_];
			if (i_44_ > i_40_ && i_44_ < i_42_) {
				i_41_ = i_43_;
				i_42_ = i_44_;
			}
		}
		return i_41_;
	}

	private final void method154(final int i, final int i_45_, int i_46_, final int i_47_, final float[] fs, final int i_48_) {
		final int i_49_ = i_47_ - i_45_;
		final int i_50_ = i_46_ - i;
		int i_51_ = i_49_ < 0 ? -i_49_ : i_49_;
		final int i_52_ = i_49_ / i_50_;
		int i_53_ = i_45_;
		int i_54_ = 0;
		final int i_55_ = i_49_ < 0 ? i_52_ - 1 : i_52_ + 1;
		i_51_ = i_51_ - (i_52_ < 0 ? -i_52_ : i_52_) * i_50_;
		fs[i] *= aFloatArray111[i_53_];
		if (i_46_ > i_48_) {
			i_46_ = i_48_;
		}
		for (int i_56_ = i + 1; i_56_ < i_46_; i_56_++) {
			i_54_ += i_51_;
			if (i_54_ >= i_50_) {
				i_54_ -= i_50_;
				i_53_ += i_55_;
			} else {
				i_53_ += i_52_;
			}
			fs[i_56_] *= aFloatArray111[i_53_];
		}
	}

	private final int method155(final int i, final int i_57_, final int i_58_, final int i_59_, final int i_60_) {
		final int i_61_ = i_59_ - i_57_;
		final int i_62_ = i_58_ - i;
		final int i_63_ = i_61_ < 0 ? -i_61_ : i_61_;
		final int i_64_ = i_63_ * (i_60_ - i);
		final int i_65_ = i_64_ / i_62_;
		return i_61_ < 0 ? i_57_ - i_65_ : i_57_ + i_65_;
	}

	Class16() {
		final int i = Class120_Sub23.method1717(16);
		if (i != 1) {
			throw new RuntimeException();
		}
		final int i_66_ = Class120_Sub23.method1717(5);
		int i_67_ = 0;
		anIntArray103 = new int[i_66_];
		for (int i_68_ = 0; i_68_ < i_66_; i_68_++) {
			final int i_69_ = Class120_Sub23.method1717(4);
			anIntArray103[i_68_] = i_69_;
			if (i_69_ >= i_67_) {
				i_67_ = i_69_ + 1;
			}
		}
		anIntArray104 = new int[i_67_];
		anIntArray102 = new int[i_67_];
		anIntArray112 = new int[i_67_];
		anIntArrayArray109 = new int[i_67_][];
		for (int i_70_ = 0; i_70_ < i_67_; i_70_++) {
			anIntArray104[i_70_] = Class120_Sub23.method1717(3) + 1;
			int i_71_ = anIntArray102[i_70_] = Class120_Sub23.method1717(2);
			if (i_71_ != 0) {
				anIntArray112[i_70_] = Class120_Sub23.method1717(8);
			}
			i_71_ = 1 << i_71_;
			final int[] is = new int[i_71_];
			anIntArrayArray109[i_70_] = is;
			for (int i_72_ = 0; i_72_ < i_71_; i_72_++) {
				is[i_72_] = Class120_Sub23.method1717(8) - 1;
			}
		}
		anInt110 = Class120_Sub23.method1717(2) + 1;
		final int i_73_ = Class120_Sub23.method1717(4);
		int i_74_ = 2;
		for (int i_75_ = 0; i_75_ < i_66_; i_75_++) {
			i_74_ += anIntArray104[anIntArray103[i_75_]];
		}
		anIntArray108 = new int[i_74_];
		anIntArray108[0] = 0;
		anIntArray108[1] = 1 << i_73_;
		i_74_ = 2;
		for (int i_76_ = 0; i_76_ < i_66_; i_76_++) {
			final int i_77_ = anIntArray103[i_76_];
			for (int i_78_ = 0; i_78_ < anIntArray104[i_77_]; i_78_++) {
				anIntArray108[i_74_++] = Class120_Sub23.method1717(i_73_);
			}
		}
		if (anIntArray106 == null || anIntArray106.length < i_74_) {
			anIntArray106 = new int[i_74_];
			anIntArray107 = new int[i_74_];
			aBooleanArray105 = new boolean[i_74_];
		}
	}
}
