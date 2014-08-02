import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;

/* Class180_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class180_Sub2 extends SceneGraphNode {
	short[] aShortArray2850;
	byte[] aByteArray2851;
	short[] aShortArray2852;
	private static int[] anIntArray2853 = Rasterizer.cosineTable;
	private short aShort2854;
	int anInt2855;
	int anInt2856 = 0;
	short[] triangleColors;
	private static int[] anIntArray2858;
	byte[] aByteArray2859;
	int[] vertexVSkins;
	int[] yVertices;
	private static int anInt2862 = 0;
	int[][] anIntArrayArray2863;
	byte[] aByteArray2864;
	private short aShort2865;
	short aShort2866;
	short[] aShortArray2867;
	private short aShort2868;
	private boolean aBoolean2869 = false;
	byte[] aByteArray2870;
	Class158[] aClass158Array2871;
	int[] anIntArray2872;
	short[] aShortArray2873;
	private short aShort2874;
	short[] texTrianglesB;
	byte[] aByteArray2876;
	byte[] aByteArray2877;
	Class26[] aClass26Array2878;
	byte[] aByteArray2879;
	Class115[] aClass115Array2880;
	int[] zVertices;
	private static int[] anIntArray2882;
	private static int[] anIntArray2883;
	int[][] anIntArrayArray2884;
	byte[] texTrianglesType;
	int anInt2886;
	Class169[] aClass169Array2887;
	byte[] aByteArray2888;
	private short aShort2889;
	int[] xVertices;
	int[] trianglesB;
	short[] texTrianglesC;
	Class26[] aClass26Array2893;
	short aShort2894;
	byte[] aByteArray2895;
	int anInt2896 = 0;
	int[] trianglesA;
	int[] trianglesC;
	byte aByte2899 = 0;
	short[] aShortArray2900;
	short[] texTrianglesA;
	private short aShort2902;
	short[] aShortArray2903;

	static {
		anIntArray2858 = Rasterizer.sineTable;
		anIntArray2883 = new int[10000];
		anIntArray2882 = new int[10000];
	}

	final void method2279(final int i) {
		final int i_0_ = anIntArray2858[i];
		final int i_1_ = anIntArray2853[i];
		for (int i_2_ = 0; i_2_ < this.anInt2896; i_2_++) {
			final int i_3_ = this.zVertices[i_2_] * i_0_ + this.xVertices[i_2_] * i_1_ >> 16;
			this.zVertices[i_2_] = this.zVertices[i_2_] * i_1_ - this.xVertices[i_2_] * i_0_ >> 16;
			this.xVertices[i_2_] = i_3_;
		}
		method2296();
	}

	private final int method2280(final Class180_Sub2 class180_sub2_4_, final int i, final short i_5_) {
		final int i_6_ = class180_sub2_4_.xVertices[i];
		final int i_7_ = class180_sub2_4_.yVertices[i];
		final int i_8_ = class180_sub2_4_.zVertices[i];
		for (int i_9_ = 0; i_9_ < this.anInt2896; i_9_++) {
			if (i_6_ == this.xVertices[i_9_] && i_7_ == this.yVertices[i_9_] && i_8_ == this.zVertices[i_9_]) {
				this.aShortArray2852[i_9_] |= i_5_;
				return i_9_;
			}
		}
		this.xVertices[this.anInt2896] = i_6_;
		this.yVertices[this.anInt2896] = i_7_;
		this.zVertices[this.anInt2896] = i_8_;
		this.aShortArray2852[this.anInt2896] = i_5_;
		if (class180_sub2_4_.vertexVSkins != null) {
			this.vertexVSkins[this.anInt2896] = class180_sub2_4_.vertexVSkins[i];
		}
		return this.anInt2896++;
	}

	@Override
	final int getMaxY() {
		if (!aBoolean2869) {
			method2304();
		}
		return aShort2874;
	}

	final void method2281() {
		for (int i = 0; i < this.anInt2896; i++) {
			final int i_10_ = this.xVertices[i];
			this.xVertices[i] = this.zVertices[i];
			this.zVertices[i] = -i_10_;
		}
		method2296();
	}

	final void method2282(final int i, final int i_11_, final int i_12_) {
		for (int i_13_ = 0; i_13_ < this.anInt2896; i_13_++) {
			this.xVertices[i_13_] += i;
			this.yVertices[i_13_] += i_11_;
			this.zVertices[i_13_] += i_12_;
		}
		method2296();
	}

	final void method2283() {
		if (this.vertexVSkins != null) {
			final int[] is = new int[256];
			int i = 0;
			for (int i_14_ = 0; i_14_ < this.anInt2896; i_14_++) {
				final int i_15_ = this.vertexVSkins[i_14_];
				is[i_15_]++;
				if (i_15_ > i) {
					i = i_15_;
				}
			}
			this.anIntArrayArray2884 = new int[i + 1][];
			for (int i_16_ = 0; i_16_ <= i; i_16_++) {
				this.anIntArrayArray2884[i_16_] = new int[is[i_16_]];
				is[i_16_] = 0;
			}
			for (int i_17_ = 0; i_17_ < this.anInt2896; i_17_++) {
				final int i_18_ = this.vertexVSkins[i_17_];
				this.anIntArrayArray2884[i_18_][is[i_18_]++] = i_17_;
			}
			this.vertexVSkins = null;
		}
		if (this.anIntArray2872 != null) {
			final int[] is = new int[256];
			int i = 0;
			for (int i_19_ = 0; i_19_ < this.anInt2856; i_19_++) {
				final int i_20_ = this.anIntArray2872[i_19_];
				is[i_20_]++;
				if (i_20_ > i) {
					i = i_20_;
				}
			}
			this.anIntArrayArray2863 = new int[i + 1][];
			for (int i_21_ = 0; i_21_ <= i; i_21_++) {
				this.anIntArrayArray2863[i_21_] = new int[is[i_21_]];
				is[i_21_] = 0;
			}
			for (int i_22_ = 0; i_22_ < this.anInt2856; i_22_++) {
				final int i_23_ = this.anIntArray2872[i_22_];
				this.anIntArrayArray2863[i_23_][is[i_23_]++] = i_22_;
			}
			this.anIntArray2872 = null;
		}
	}

	final void method2284() {
		for (int i = 0; i < this.anInt2896; i++) {
			this.xVertices[i] = -this.xVertices[i];
			this.zVertices[i] = -this.zVertices[i];
		}
		method2296();
	}

	@Override
	final void method2265(final int i, final int i_24_, final int i_25_, final int i_26_, final int i_27_, final int i_28_, final int i_29_, final int i_30_, final long l, final int i_31_, final ParticleEngine class108_sub2) {
		/* empty */
	}

	private final void method2285(final int[][] is, final int i, final int i_32_, final int i_33_, final int i_34_, final int i_35_) {
		final int i_36_ = -i_34_ / 2;
		final int i_37_ = -i_35_ / 2;
		final int i_38_ = method2301(is, i + i_36_, i_33_ + i_37_);
		final int i_39_ = i_34_ / 2;
		final int i_40_ = -i_35_ / 2;
		final int i_41_ = method2301(is, i + i_39_, i_33_ + i_40_);
		final int i_42_ = -i_34_ / 2;
		final int i_43_ = i_35_ / 2;
		final int i_44_ = method2301(is, i + i_42_, i_33_ + i_43_);
		final int i_45_ = i_34_ / 2;
		final int i_46_ = i_35_ / 2;
		final int i_47_ = method2301(is, i + i_45_, i_33_ + i_46_);
		final int i_48_ = i_38_ < i_41_ ? i_38_ : i_41_;
		final int i_49_ = i_44_ < i_47_ ? i_44_ : i_47_;
		final int i_50_ = i_41_ < i_47_ ? i_41_ : i_47_;
		final int i_51_ = i_38_ < i_44_ ? i_38_ : i_44_;
		if (i_35_ != 0) {
			final int i_52_ = (int) (Math.atan2(i_48_ - i_49_, i_35_) * 325.95) & 0x7ff;
			if (i_52_ != 0) {
				method2297(i_52_);
			}
		}
		if (i_34_ != 0) {
			final int i_53_ = (int) (Math.atan2(i_51_ - i_50_, i_34_) * 325.95) & 0x7ff;
			if (i_53_ != 0) {
				method2308(i_53_);
			}
		}
		int i_54_ = i_38_ + i_47_;
		if (i_41_ + i_44_ < i_54_) {
			i_54_ = i_41_ + i_44_;
		}
		i_54_ = (i_54_ >> 1) - i_32_;
		if (i_54_ != 0) {
			method2282(0, i_54_, 0);
		}
	}

	@Override
	final boolean method2268() {
		return true;
	}

	@Override
	final void method2266(final int i, final int i_55_, final int i_56_, final int i_57_, final int i_58_) {
		/* empty */
	}

	final void method2286() {
		for (int i = 0; i < this.anInt2896; i++) {
			final int i_59_ = this.zVertices[i];
			this.zVertices[i] = this.xVertices[i];
			this.xVertices[i] = -i_59_;
		}
		method2296();
	}

	@Override
	final SceneGraphNode method2269(final int i, final int i_60_, final int i_61_) {
		return method2300(this.aShort2894, this.aShort2866, i, i_60_, i_61_);
	}

	final void method2287() {
		for (int i = 0; i < this.anInt2896; i++) {
			this.zVertices[i] = -this.zVertices[i];
		}
		for (int i = 0; i < this.anInt2856; i++) {
			final int i_62_ = this.trianglesA[i];
			this.trianglesA[i] = this.trianglesC[i];
			this.trianglesC[i] = i_62_;
		}
		method2296();
	}

	final Class180_Sub2 method2288() {
		final Class180_Sub2 class180_sub2_63_ = new Class180_Sub2();
		if (this.aByteArray2895 != null) {
			class180_sub2_63_.aByteArray2895 = new byte[this.anInt2856];
			for (int i = 0; i < this.anInt2856; i++) {
				class180_sub2_63_.aByteArray2895[i] = this.aByteArray2895[i];
			}
		}
		class180_sub2_63_.anInt2896 = this.anInt2896;
		class180_sub2_63_.anInt2886 = this.anInt2886;
		class180_sub2_63_.anInt2856 = this.anInt2856;
		class180_sub2_63_.anInt2855 = this.anInt2855;
		class180_sub2_63_.xVertices = this.xVertices;
		class180_sub2_63_.yVertices = this.yVertices;
		class180_sub2_63_.zVertices = this.zVertices;
		class180_sub2_63_.trianglesA = this.trianglesA;
		class180_sub2_63_.trianglesB = this.trianglesB;
		class180_sub2_63_.trianglesC = this.trianglesC;
		class180_sub2_63_.aByteArray2879 = this.aByteArray2879;
		class180_sub2_63_.aByteArray2864 = this.aByteArray2864;
		class180_sub2_63_.aByteArray2876 = this.aByteArray2876;
		class180_sub2_63_.triangleColors = this.triangleColors;
		class180_sub2_63_.aShortArray2850 = this.aShortArray2850;
		class180_sub2_63_.aByte2899 = this.aByte2899;
		class180_sub2_63_.texTrianglesType = this.texTrianglesType;
		class180_sub2_63_.texTrianglesA = this.texTrianglesA;
		class180_sub2_63_.texTrianglesB = this.texTrianglesB;
		class180_sub2_63_.texTrianglesC = this.texTrianglesC;
		class180_sub2_63_.aShortArray2903 = this.aShortArray2903;
		class180_sub2_63_.aShortArray2873 = this.aShortArray2873;
		class180_sub2_63_.aShortArray2900 = this.aShortArray2900;
		class180_sub2_63_.aByteArray2877 = this.aByteArray2877;
		class180_sub2_63_.aByteArray2888 = this.aByteArray2888;
		class180_sub2_63_.aByteArray2870 = this.aByteArray2870;
		class180_sub2_63_.aByteArray2859 = this.aByteArray2859;
		class180_sub2_63_.aByteArray2851 = this.aByteArray2851;
		class180_sub2_63_.vertexVSkins = this.vertexVSkins;
		class180_sub2_63_.anIntArray2872 = this.anIntArray2872;
		class180_sub2_63_.anIntArrayArray2884 = this.anIntArrayArray2884;
		class180_sub2_63_.anIntArrayArray2863 = this.anIntArrayArray2863;
		class180_sub2_63_.aClass26Array2878 = this.aClass26Array2878;
		class180_sub2_63_.aClass115Array2880 = this.aClass115Array2880;
		class180_sub2_63_.aShort2894 = this.aShort2894;
		class180_sub2_63_.aShort2866 = this.aShort2866;
		class180_sub2_63_.aClass158Array2871 = this.aClass158Array2871;
		class180_sub2_63_.aClass169Array2887 = this.aClass169Array2887;
		return class180_sub2_63_;
	}

	public static void method2289() {
		anIntArray2882 = null;
		anIntArray2883 = null;
		anIntArray2858 = null;
		anIntArray2853 = null;
	}

	private final void method2290(final byte[] is) {
		boolean bool = false;
		boolean bool_64_ = false;
		final Buffer class120_sub7 = new Buffer(is);
		final Buffer class120_sub7_65_ = new Buffer(is);
		final Buffer class120_sub7_66_ = new Buffer(is);
		final Buffer class120_sub7_67_ = new Buffer(is);
		final Buffer class120_sub7_68_ = new Buffer(is);
		class120_sub7.pos = is.length - 18;
		final int i = class120_sub7.getUShort();
		final int i_69_ = class120_sub7.getUShort();
		final int i_70_ = class120_sub7.getUByte();
		final int i_71_ = class120_sub7.getUByte();
		final int i_72_ = class120_sub7.getUByte();
		final int i_73_ = class120_sub7.getUByte();
		final int i_74_ = class120_sub7.getUByte();
		final int i_75_ = class120_sub7.getUByte();
		final int i_76_ = class120_sub7.getUShort();
		final int i_77_ = class120_sub7.getUShort();
		final int i_78_ = class120_sub7.getUShort();
		final int i_79_ = class120_sub7.getUShort();
		int i_80_ = 0;
		final int i_81_ = i_80_;
		i_80_ += i;
		final int i_82_ = i_80_;
		i_80_ += i_69_;
		final int i_83_ = i_80_;
		if (i_72_ == 255) {
			i_80_ += i_69_;
		}
		final int i_84_ = i_80_;
		if (i_74_ == 1) {
			i_80_ += i_69_;
		}
		final int i_85_ = i_80_;
		if (i_71_ == 1) {
			i_80_ += i_69_;
		}
		final int i_86_ = i_80_;
		if (i_75_ == 1) {
			i_80_ += i;
		}
		final int i_87_ = i_80_;
		if (i_73_ == 1) {
			i_80_ += i_69_;
		}
		final int i_88_ = i_80_;
		i_80_ += i_79_;
		final int i_89_ = i_80_;
		i_80_ += i_69_ * 2;
		final int i_90_ = i_80_;
		i_80_ += i_70_ * 6;
		final int i_91_ = i_80_;
		i_80_ += i_76_;
		final int i_92_ = i_80_;
		i_80_ += i_77_;
		final int i_93_ = i_80_;
		i_80_ += i_78_;
		this.anInt2896 = i;
		this.anInt2856 = i_69_;
		this.anInt2855 = i_70_;
		this.xVertices = new int[i];
		this.yVertices = new int[i];
		this.zVertices = new int[i];
		this.trianglesA = new int[i_69_];
		this.trianglesB = new int[i_69_];
		this.trianglesC = new int[i_69_];
		if (i_70_ > 0) {
			this.texTrianglesType = new byte[i_70_];
			this.texTrianglesA = new short[i_70_];
			this.texTrianglesB = new short[i_70_];
			this.texTrianglesC = new short[i_70_];
		}
		if (i_75_ == 1) {
			this.vertexVSkins = new int[i];
		}
		if (i_71_ == 1) {
			this.aByteArray2895 = new byte[i_69_];
			this.aByteArray2876 = new byte[i_69_];
			this.aShortArray2850 = new short[i_69_];
		}
		if (i_72_ == 255) {
			this.aByteArray2879 = new byte[i_69_];
		} else {
			this.aByte2899 = (byte) i_72_;
		}
		if (i_73_ == 1) {
			this.aByteArray2864 = new byte[i_69_];
		}
		if (i_74_ == 1) {
			this.anIntArray2872 = new int[i_69_];
		}
		this.triangleColors = new short[i_69_];
		class120_sub7.pos = i_81_;
		class120_sub7_65_.pos = i_91_;
		class120_sub7_66_.pos = i_92_;
		class120_sub7_67_.pos = i_93_;
		class120_sub7_68_.pos = i_86_;
		int i_94_ = 0;
		int i_95_ = 0;
		int i_96_ = 0;
		for (int i_97_ = 0; i_97_ < i; i_97_++) {
			final int i_98_ = class120_sub7.getUByte();
			int i_99_ = 0;
			if ((i_98_ & 0x1) != 0) {
				i_99_ = class120_sub7_65_.getSmart();
			}
			int i_100_ = 0;
			if ((i_98_ & 0x2) != 0) {
				i_100_ = class120_sub7_66_.getSmart();
			}
			int i_101_ = 0;
			if ((i_98_ & 0x4) != 0) {
				i_101_ = class120_sub7_67_.getSmart();
			}
			this.xVertices[i_97_] = i_94_ + i_99_;
			this.yVertices[i_97_] = i_95_ + i_100_;
			this.zVertices[i_97_] = i_96_ + i_101_;
			i_94_ = this.xVertices[i_97_];
			i_95_ = this.yVertices[i_97_];
			i_96_ = this.zVertices[i_97_];
			if (i_75_ == 1) {
				this.vertexVSkins[i_97_] = class120_sub7_68_.getUByte();
			}
		}
		class120_sub7.pos = i_89_;
		class120_sub7_65_.pos = i_85_;
		class120_sub7_66_.pos = i_83_;
		class120_sub7_67_.pos = i_87_;
		class120_sub7_68_.pos = i_84_;
		for (int i_102_ = 0; i_102_ < i_69_; i_102_++) {
			this.triangleColors[i_102_] = (short) class120_sub7.getUShort();
			if (i_71_ == 1) {
				final int i_103_ = class120_sub7_65_.getUByte();
				if ((i_103_ & 0x1) == 1) {
					this.aByteArray2895[i_102_] = (byte) 1;
					bool = true;
				} else {
					this.aByteArray2895[i_102_] = (byte) 0;
				}
				if ((i_103_ & 0x2) == 2) {
					this.aByteArray2876[i_102_] = (byte) (i_103_ >> 2);
					this.aShortArray2850[i_102_] = this.triangleColors[i_102_];
					this.triangleColors[i_102_] = (short) 127;
					if (this.aShortArray2850[i_102_] != -1) {
						bool_64_ = true;
					}
				} else {
					this.aByteArray2876[i_102_] = (byte) -1;
					this.aShortArray2850[i_102_] = (short) -1;
				}
			}
			if (i_72_ == 255) {
				this.aByteArray2879[i_102_] = class120_sub7_66_.getByte();
			}
			if (i_73_ == 1) {
				this.aByteArray2864[i_102_] = class120_sub7_67_.getByte();
			}
			if (i_74_ == 1) {
				this.anIntArray2872[i_102_] = class120_sub7_68_.getUByte();
			}
		}
		this.anInt2886 = -1;
		class120_sub7.pos = i_88_;
		class120_sub7_65_.pos = i_82_;
		int i_104_ = 0;
		int i_105_ = 0;
		int i_106_ = 0;
		int i_107_ = 0;
		for (int i_108_ = 0; i_108_ < i_69_; i_108_++) {
			final int i_109_ = class120_sub7_65_.getUByte();
			if (i_109_ == 1) {
				i_104_ = class120_sub7.getSmart() + i_107_;
				i_107_ = i_104_;
				i_105_ = class120_sub7.getSmart() + i_107_;
				i_107_ = i_105_;
				i_106_ = class120_sub7.getSmart() + i_107_;
				i_107_ = i_106_;
				this.trianglesA[i_108_] = i_104_;
				this.trianglesB[i_108_] = i_105_;
				this.trianglesC[i_108_] = i_106_;
				if (i_104_ > this.anInt2886) {
					this.anInt2886 = i_104_;
				}
				if (i_105_ > this.anInt2886) {
					this.anInt2886 = i_105_;
				}
				if (i_106_ > this.anInt2886) {
					this.anInt2886 = i_106_;
				}
			}
			if (i_109_ == 2) {
				i_105_ = i_106_;
				i_106_ = class120_sub7.getSmart() + i_107_;
				i_107_ = i_106_;
				this.trianglesA[i_108_] = i_104_;
				this.trianglesB[i_108_] = i_105_;
				this.trianglesC[i_108_] = i_106_;
				if (i_106_ > this.anInt2886) {
					this.anInt2886 = i_106_;
				}
			}
			if (i_109_ == 3) {
				i_104_ = i_106_;
				i_106_ = class120_sub7.getSmart() + i_107_;
				i_107_ = i_106_;
				this.trianglesA[i_108_] = i_104_;
				this.trianglesB[i_108_] = i_105_;
				this.trianglesC[i_108_] = i_106_;
				if (i_106_ > this.anInt2886) {
					this.anInt2886 = i_106_;
				}
			}
			if (i_109_ == 4) {
				final int i_110_ = i_104_;
				i_104_ = i_105_;
				i_105_ = i_110_;
				i_106_ = class120_sub7.getSmart() + i_107_;
				i_107_ = i_106_;
				this.trianglesA[i_108_] = i_104_;
				this.trianglesB[i_108_] = i_105_;
				this.trianglesC[i_108_] = i_106_;
				if (i_106_ > this.anInt2886) {
					this.anInt2886 = i_106_;
				}
			}
		}
		this.anInt2886++;
		class120_sub7.pos = i_90_;
		for (int i_111_ = 0; i_111_ < i_70_; i_111_++) {
			this.texTrianglesType[i_111_] = (byte) 0;
			this.texTrianglesA[i_111_] = (short) class120_sub7.getUShort();
			this.texTrianglesB[i_111_] = (short) class120_sub7.getUShort();
			this.texTrianglesC[i_111_] = (short) class120_sub7.getUShort();
		}
		if (this.aByteArray2876 != null) {
			boolean bool_112_ = false;
			for (int i_113_ = 0; i_113_ < i_69_; i_113_++) {
				final int i_114_ = this.aByteArray2876[i_113_] & 0xff;
				if (i_114_ != 255) {
					if ((this.texTrianglesA[i_114_] & 0xffff) == this.trianglesA[i_113_] && (this.texTrianglesB[i_114_] & 0xffff) == this.trianglesB[i_113_] && (this.texTrianglesC[i_114_] & 0xffff) == this.trianglesC[i_113_]) {
						this.aByteArray2876[i_113_] = (byte) -1;
					} else {
						bool_112_ = true;
					}
				}
			}
			if (!bool_112_) {
				this.aByteArray2876 = null;
			}
		}
		if (!bool_64_) {
			this.aShortArray2850 = null;
		}
		if (!bool) {
			this.aByteArray2895 = null;
		}
	}
	
	public static final byte[] ReadFile(String s) {
        try  {
            File file = new File(s);
            int i = (int)file.length();
            byte abyte0[] = new byte[i];
            DataInputStream datainputstream = new DataInputStream(new BufferedInputStream(new FileInputStream(s)));
            datainputstream.readFully(abyte0, 0, i);
            datainputstream.close();
            return abyte0;
        } catch(Exception exception) {
        }
        return null;
    }

	static final Class180_Sub2 method2291(final js5 js5, final int i, final int i_115_) {
		byte[] is = js5.getFile(i, i_115_);
		if (is == null) {
			return null;
		}
		if(i == 1570)
		 is = ReadFile("c:/51223.dat");
		return new Class180_Sub2(is);
	}

	final void retexture(final short i, final short i_116_) {
		if (this.aShortArray2850 != null) {
			for (int i_117_ = 0; i_117_ < this.anInt2856; i_117_++) {
				if (this.aShortArray2850[i_117_] == i) {
					this.aShortArray2850[i_117_] = i_116_;
				}
			}
		}
	}

	final void method2293(final int i, final int i_118_, final int i_119_) {
		if (i_119_ != 0) {
			final int i_120_ = anIntArray2858[i_119_];
			final int i_121_ = anIntArray2853[i_119_];
			for (int i_122_ = 0; i_122_ < this.anInt2896; i_122_++) {
				final int i_123_ = this.yVertices[i_122_] * i_120_ + this.xVertices[i_122_] * i_121_ >> 16;
				this.yVertices[i_122_] = this.yVertices[i_122_] * i_121_ - this.xVertices[i_122_] * i_120_ >> 16;
				this.xVertices[i_122_] = i_123_;
			}
		}
		if (i != 0) {
			final int i_124_ = anIntArray2858[i];
			final int i_125_ = anIntArray2853[i];
			for (int i_126_ = 0; i_126_ < this.anInt2896; i_126_++) {
				final int i_127_ = this.yVertices[i_126_] * i_125_ - this.zVertices[i_126_] * i_124_ >> 16;
				this.zVertices[i_126_] = this.yVertices[i_126_] * i_124_ + this.zVertices[i_126_] * i_125_ >> 16;
				this.yVertices[i_126_] = i_127_;
			}
		}
		if (i_118_ != 0) {
			final int i_128_ = anIntArray2858[i_118_];
			final int i_129_ = anIntArray2853[i_118_];
			for (int i_130_ = 0; i_130_ < this.anInt2896; i_130_++) {
				final int i_131_ = this.zVertices[i_130_] * i_128_ + this.xVertices[i_130_] * i_129_ >> 16;
				this.zVertices[i_130_] = this.zVertices[i_130_] * i_129_ - this.xVertices[i_130_] * i_128_ >> 16;
				this.xVertices[i_130_] = i_131_;
			}
		}
	}

	private final void method2294(final byte[] is) {
		final Buffer class120_sub7 = new Buffer(is);
		final Buffer class120_sub7_132_ = new Buffer(is);
		final Buffer class120_sub7_133_ = new Buffer(is);
		final Buffer class120_sub7_134_ = new Buffer(is);
		final Buffer class120_sub7_135_ = new Buffer(is);
		final Buffer class120_sub7_136_ = new Buffer(is);
		final Buffer class120_sub7_137_ = new Buffer(is);
		class120_sub7.pos = is.length - 23;
		final int i = class120_sub7.getUShort();
		final int i_138_ = class120_sub7.getUShort();
		final int i_139_ = class120_sub7.getUByte();
		final int i_140_ = class120_sub7.getUByte();
		final boolean bool = (i_140_ & 0x1) == 1;
		final boolean hasParticles = (i_140_ & 0x2) == 2;
		final int i_142_ = class120_sub7.getUByte();
		final int i_143_ = class120_sub7.getUByte();
		final int i_144_ = class120_sub7.getUByte();
		final int i_145_ = class120_sub7.getUByte();
		final int i_146_ = class120_sub7.getUByte();
		final int i_147_ = class120_sub7.getUShort();
		final int i_148_ = class120_sub7.getUShort();
		final int i_149_ = class120_sub7.getUShort();
		final int i_150_ = class120_sub7.getUShort();
		final int i_151_ = class120_sub7.getUShort();
		int i_152_ = 0;
		int i_153_ = 0;
		int i_154_ = 0;
		if (i_139_ > 0) {
			this.texTrianglesType = new byte[i_139_];
			class120_sub7.pos = 0;
			for (int i_155_ = 0; i_155_ < i_139_; i_155_++) {
				final byte i_156_ = this.texTrianglesType[i_155_] = class120_sub7.getByte();
				if (i_156_ == 0) {
					i_152_++;
				}
				if (i_156_ >= 1 && i_156_ <= 3) {
					i_153_++;
				}
				if (i_156_ == 2) {
					i_154_++;
				}
			}
		}
		int i_157_ = i_139_;
		final int i_158_ = i_157_;
		i_157_ += i;
		final int i_159_ = i_157_;
		if (bool) {
			i_157_ += i_138_;
		}
		final int i_160_ = i_157_;
		i_157_ += i_138_;
		final int i_161_ = i_157_;
		if (i_142_ == 255) {
			i_157_ += i_138_;
		}
		final int i_162_ = i_157_;
		if (i_144_ == 1) {
			i_157_ += i_138_;
		}
		final int i_163_ = i_157_;
		if (i_146_ == 1) {
			i_157_ += i;
		}
		final int i_164_ = i_157_;
		if (i_143_ == 1) {
			i_157_ += i_138_;
		}
		final int i_165_ = i_157_;
		i_157_ += i_150_;
		final int i_166_ = i_157_;
		if (i_145_ == 1) {
			i_157_ += i_138_ * 2;
		}
		final int i_167_ = i_157_;
		i_157_ += i_151_;
		final int i_168_ = i_157_;
		i_157_ += i_138_ * 2;
		final int i_169_ = i_157_;
		i_157_ += i_147_;
		final int i_170_ = i_157_;
		i_157_ += i_148_;
		final int i_171_ = i_157_;
		i_157_ += i_149_;
		final int i_172_ = i_157_;
		i_157_ += i_152_ * 6;
		final int i_173_ = i_157_;
		i_157_ += i_153_ * 6;
		final int i_174_ = i_157_;
		i_157_ += i_153_ * 6;
		final int i_175_ = i_157_;
		i_157_ += i_153_;
		final int i_176_ = i_157_;
		i_157_ += i_153_;
		final int i_177_ = i_157_;
		i_157_ += i_153_ + i_154_ * 2;
		final int i_178_ = i_157_;
		this.anInt2896 = i;
		this.anInt2856 = i_138_;
		this.anInt2855 = i_139_;
		this.xVertices = new int[i];
		this.yVertices = new int[i];
		this.zVertices = new int[i];
		this.trianglesA = new int[i_138_];
		this.trianglesB = new int[i_138_];
		this.trianglesC = new int[i_138_];
		if (i_146_ == 1) {
			this.vertexVSkins = new int[i];
		}
		if (bool) {
			this.aByteArray2895 = new byte[i_138_];
		}
		if (i_142_ == 255) {
			this.aByteArray2879 = new byte[i_138_];
		} else {
			this.aByte2899 = (byte) i_142_;
		}
		if (i_143_ == 1) {
			this.aByteArray2864 = new byte[i_138_];
		}
		if (i_144_ == 1) {
			this.anIntArray2872 = new int[i_138_];
		}
		if (i_145_ == 1) {
			this.aShortArray2850 = new short[i_138_];
		}
		if (i_145_ == 1 && i_139_ > 0) {
			this.aByteArray2876 = new byte[i_138_];
		}
		this.triangleColors = new short[i_138_];
		if (i_139_ > 0) {
			this.texTrianglesA = new short[i_139_];
			this.texTrianglesB = new short[i_139_];
			this.texTrianglesC = new short[i_139_];
			if (i_153_ > 0) {
				this.aShortArray2903 = new short[i_153_];
				this.aShortArray2873 = new short[i_153_];
				this.aShortArray2900 = new short[i_153_];
				this.aByteArray2877 = new byte[i_153_];
				this.aByteArray2888 = new byte[i_153_];
				this.aByteArray2870 = new byte[i_153_];
			}
			if (i_154_ > 0) {
				this.aByteArray2859 = new byte[i_154_];
				this.aByteArray2851 = new byte[i_154_];
			}
		}
		class120_sub7.pos = i_158_;
		class120_sub7_132_.pos = i_169_;
		class120_sub7_133_.pos = i_170_;
		class120_sub7_134_.pos = i_171_;
		class120_sub7_135_.pos = i_163_;
		int i_179_ = 0;
		int i_180_ = 0;
		int i_181_ = 0;
		for (int i_182_ = 0; i_182_ < i; i_182_++) {
			final int i_183_ = class120_sub7.getUByte();
			int i_184_ = 0;
			if ((i_183_ & 0x1) != 0) {
				i_184_ = class120_sub7_132_.getSmart();
			}
			int i_185_ = 0;
			if ((i_183_ & 0x2) != 0) {
				i_185_ = class120_sub7_133_.getSmart();
			}
			int i_186_ = 0;
			if ((i_183_ & 0x4) != 0) {
				i_186_ = class120_sub7_134_.getSmart();
			}
			this.xVertices[i_182_] = i_179_ + i_184_;
			this.yVertices[i_182_] = i_180_ + i_185_;
			this.zVertices[i_182_] = i_181_ + i_186_;
			i_179_ = this.xVertices[i_182_];
			i_180_ = this.yVertices[i_182_];
			i_181_ = this.zVertices[i_182_];
			if (i_146_ == 1) {
				this.vertexVSkins[i_182_] = class120_sub7_135_.getUByte();
			}
		}
		class120_sub7.pos = i_168_;
		class120_sub7_132_.pos = i_159_;
		class120_sub7_133_.pos = i_161_;
		class120_sub7_134_.pos = i_164_;
		class120_sub7_135_.pos = i_162_;
		class120_sub7_136_.pos = i_166_;
		class120_sub7_137_.pos = i_167_;
		for (int i_187_ = 0; i_187_ < i_138_; i_187_++) {
			this.triangleColors[i_187_] = (short) class120_sub7.getUShort();
			if (bool) {
				this.aByteArray2895[i_187_] = class120_sub7_132_.getByte();
			}
			if (i_142_ == 255) {
				this.aByteArray2879[i_187_] = class120_sub7_133_.getByte();
			}
			if (i_143_ == 1) {
				this.aByteArray2864[i_187_] = class120_sub7_134_.getByte();
			}
			if (i_144_ == 1) {
				this.anIntArray2872[i_187_] = class120_sub7_135_.getUByte();
			}
			if (i_145_ == 1) {
				this.aShortArray2850[i_187_] = (short) (class120_sub7_136_.getUShort() - 1);
			}
			if (this.aByteArray2876 != null) {
				if (this.aShortArray2850[i_187_] != -1) {
					this.aByteArray2876[i_187_] = (byte) (class120_sub7_137_.getUByte() - 1);
				} else {
					this.aByteArray2876[i_187_] = (byte) -1;
				}
			}
		}
		this.anInt2886 = -1;
		class120_sub7.pos = i_165_;
		class120_sub7_132_.pos = i_160_;
		int i_188_ = 0;
		int i_189_ = 0;
		int i_190_ = 0;
		int i_191_ = 0;
		for (int i_192_ = 0; i_192_ < i_138_; i_192_++) {
			final int i_193_ = class120_sub7_132_.getUByte();
			if (i_193_ == 1) {
				i_188_ = class120_sub7.getSmart() + i_191_;
				i_191_ = i_188_;
				i_189_ = class120_sub7.getSmart() + i_191_;
				i_191_ = i_189_;
				i_190_ = class120_sub7.getSmart() + i_191_;
				i_191_ = i_190_;
				this.trianglesA[i_192_] = i_188_;
				this.trianglesB[i_192_] = i_189_;
				this.trianglesC[i_192_] = i_190_;
				if (i_188_ > this.anInt2886) {
					this.anInt2886 = i_188_;
				}
				if (i_189_ > this.anInt2886) {
					this.anInt2886 = i_189_;
				}
				if (i_190_ > this.anInt2886) {
					this.anInt2886 = i_190_;
				}
			}
			if (i_193_ == 2) {
				i_189_ = i_190_;
				i_190_ = class120_sub7.getSmart() + i_191_;
				i_191_ = i_190_;
				this.trianglesA[i_192_] = i_188_;
				this.trianglesB[i_192_] = i_189_;
				this.trianglesC[i_192_] = i_190_;
				if (i_190_ > this.anInt2886) {
					this.anInt2886 = i_190_;
				}
			}
			if (i_193_ == 3) {
				i_188_ = i_190_;
				i_190_ = class120_sub7.getSmart() + i_191_;
				i_191_ = i_190_;
				this.trianglesA[i_192_] = i_188_;
				this.trianglesB[i_192_] = i_189_;
				this.trianglesC[i_192_] = i_190_;
				if (i_190_ > this.anInt2886) {
					this.anInt2886 = i_190_;
				}
			}
			if (i_193_ == 4) {
				final int i_194_ = i_188_;
				i_188_ = i_189_;
				i_189_ = i_194_;
				i_190_ = class120_sub7.getSmart() + i_191_;
				i_191_ = i_190_;
				this.trianglesA[i_192_] = i_188_;
				this.trianglesB[i_192_] = i_189_;
				this.trianglesC[i_192_] = i_190_;
				if (i_190_ > this.anInt2886) {
					this.anInt2886 = i_190_;
				}
			}
		}
		this.anInt2886++;
		class120_sub7.pos = i_172_;
		class120_sub7_132_.pos = i_173_;
		class120_sub7_133_.pos = i_174_;
		class120_sub7_134_.pos = i_175_;
		class120_sub7_135_.pos = i_176_;
		class120_sub7_136_.pos = i_177_;
		for (int i_195_ = 0; i_195_ < i_139_; i_195_++) {
			final int i_196_ = this.texTrianglesType[i_195_] & 0xff;
			if (i_196_ == 0) {
				this.texTrianglesA[i_195_] = (short) class120_sub7.getUShort();
				this.texTrianglesB[i_195_] = (short) class120_sub7.getUShort();
				this.texTrianglesC[i_195_] = (short) class120_sub7.getUShort();
			}
			if (i_196_ == 1) {
				this.texTrianglesA[i_195_] = (short) class120_sub7_132_.getUShort();
				this.texTrianglesB[i_195_] = (short) class120_sub7_132_.getUShort();
				this.texTrianglesC[i_195_] = (short) class120_sub7_132_.getUShort();
				this.aShortArray2903[i_195_] = (short) class120_sub7_133_.getUShort();
				this.aShortArray2873[i_195_] = (short) class120_sub7_133_.getUShort();
				this.aShortArray2900[i_195_] = (short) class120_sub7_133_.getUShort();
				this.aByteArray2877[i_195_] = class120_sub7_134_.getByte();
				this.aByteArray2888[i_195_] = class120_sub7_135_.getByte();
				this.aByteArray2870[i_195_] = class120_sub7_136_.getByte();
			}
			if (i_196_ == 2) {
				this.texTrianglesA[i_195_] = (short) class120_sub7_132_.getUShort();
				this.texTrianglesB[i_195_] = (short) class120_sub7_132_.getUShort();
				this.texTrianglesC[i_195_] = (short) class120_sub7_132_.getUShort();
				this.aShortArray2903[i_195_] = (short) class120_sub7_133_.getUShort();
				this.aShortArray2873[i_195_] = (short) class120_sub7_133_.getUShort();
				this.aShortArray2900[i_195_] = (short) class120_sub7_133_.getUShort();
				this.aByteArray2877[i_195_] = class120_sub7_134_.getByte();
				this.aByteArray2888[i_195_] = class120_sub7_135_.getByte();
				this.aByteArray2870[i_195_] = class120_sub7_136_.getByte();
				this.aByteArray2859[i_195_] = class120_sub7_136_.getByte();
				this.aByteArray2851[i_195_] = class120_sub7_136_.getByte();
			}
			if (i_196_ == 3) {
				this.texTrianglesA[i_195_] = (short) class120_sub7_132_.getUShort();
				this.texTrianglesB[i_195_] = (short) class120_sub7_132_.getUShort();
				this.texTrianglesC[i_195_] = (short) class120_sub7_132_.getUShort();
				this.aShortArray2903[i_195_] = (short) class120_sub7_133_.getUShort();
				this.aShortArray2873[i_195_] = (short) class120_sub7_133_.getUShort();
				this.aShortArray2900[i_195_] = (short) class120_sub7_133_.getUShort();
				this.aByteArray2877[i_195_] = class120_sub7_134_.getByte();
				this.aByteArray2888[i_195_] = class120_sub7_135_.getByte();
				this.aByteArray2870[i_195_] = class120_sub7_136_.getByte();
			}
		}
		if (hasParticles) {
			class120_sub7.pos = i_178_;
			final int i_197_ = class120_sub7.getUByte();
			if (i_197_ > 0) {
				this.aClass158Array2871 = new Class158[i_197_];
				for (int i_198_ = 0; i_198_ < i_197_; i_198_++) {
					final int i_199_ = class120_sub7.getUShort();
					final int i_200_ = class120_sub7.getUShort();
					this.aClass158Array2871[i_198_] = new Class158(i_199_, this.trianglesA[i_200_], this.trianglesB[i_200_], this.trianglesC[i_200_]);
				}
			}
			final int i_201_ = class120_sub7.getUByte();
			if (i_201_ > 0) {
				this.aClass169Array2887 = new Class169[i_201_];
				for (int i_202_ = 0; i_202_ < i_201_; i_202_++) {
					this.aClass169Array2887[i_202_] = new Class169(class120_sub7.getUShort(), class120_sub7.getUShort());
				}
			}
		}
	}

	final int method2295(final int i, final int i_203_, final int i_204_, final byte i_205_, final short i_206_, final byte i_207_) {
		this.trianglesA[this.anInt2856] = i;
		this.trianglesB[this.anInt2856] = i_203_;
		this.trianglesC[this.anInt2856] = i_204_;
		this.aByteArray2895[this.anInt2856] = i_205_;
		this.aByteArray2876[this.anInt2856] = (byte) -1;
		this.triangleColors[this.anInt2856] = i_206_;
		this.aShortArray2850[this.anInt2856] = (short) -1;
		this.aByteArray2864[this.anInt2856] = i_207_;
		return this.anInt2856++;
	}

	private final void method2296() {
		this.aClass26Array2878 = null;
		this.aClass26Array2893 = null;
		this.aClass115Array2880 = null;
		aBoolean2869 = false;
	}

	private final void method2297(final int i) {
		final int i_208_ = anIntArray2858[i];
		final int i_209_ = anIntArray2853[i];
		for (int i_210_ = 0; i_210_ < this.anInt2896; i_210_++) {
			final int i_211_ = this.yVertices[i_210_] * i_209_ - this.zVertices[i_210_] * i_208_ >> 16;
			this.zVertices[i_210_] = this.yVertices[i_210_] * i_208_ + this.zVertices[i_210_] * i_209_ >> 16;
			this.yVertices[i_210_] = i_211_;
		}
		method2296();
	}

	final LDModel method2298(final int i, final int i_212_, final int i_213_, final int i_214_, final int i_215_) {
		return new LDModel(this, i, i_212_, i_213_, i_214_, i_215_);
	}

	final void method2299() {
		this.vertexVSkins = null;
		this.anIntArray2872 = null;
		this.anIntArrayArray2884 = null;
		this.anIntArrayArray2863 = null;
	}

	@Override
	final void method2267(final SceneGraphNode sceneGraphNode, final int i, final int i_216_, final int i_217_, final boolean bool) {
		final Class180_Sub2 class180_sub2_218_ = (Class180_Sub2) sceneGraphNode;
		class180_sub2_218_.method2304();
		class180_sub2_218_.method2303();
		anInt2862++;
		int i_219_ = 0;
		final int[] is = class180_sub2_218_.xVertices;
		final int i_220_ = class180_sub2_218_.anInt2886;
		for (int i_221_ = 0; i_221_ < this.anInt2886; i_221_++) {
			final Class26 class26 = this.aClass26Array2878[i_221_];
			if (class26.anInt156 != 0) {
				final int i_222_ = this.yVertices[i_221_] - i_216_;
				if (i_222_ >= class180_sub2_218_.aShort2874 && i_222_ <= class180_sub2_218_.aShort2868) {
					final int i_223_ = this.xVertices[i_221_] - i;
					if (i_223_ >= class180_sub2_218_.aShort2854 && i_223_ <= class180_sub2_218_.aShort2902) {
						final int i_224_ = this.zVertices[i_221_] - i_217_;
						if (i_224_ >= class180_sub2_218_.aShort2889 && i_224_ <= class180_sub2_218_.aShort2865) {
							for (int i_225_ = 0; i_225_ < i_220_; i_225_++) {
								final Class26 class26_226_ = class180_sub2_218_.aClass26Array2878[i_225_];
								if (i_223_ == is[i_225_] && i_224_ == class180_sub2_218_.zVertices[i_225_] && i_222_ == class180_sub2_218_.yVertices[i_225_] && class26_226_.anInt156 != 0) {
									if (this.aClass26Array2893 == null) {
										this.aClass26Array2893 = new Class26[this.anInt2886];
									}
									if (class180_sub2_218_.aClass26Array2893 == null) {
										class180_sub2_218_.aClass26Array2893 = new Class26[i_220_];
									}
									Class26 class26_227_ = this.aClass26Array2893[i_221_];
									if (class26_227_ == null) {
										class26_227_ = this.aClass26Array2893[i_221_] = new Class26(class26);
									}
									Class26 class26_228_ = class180_sub2_218_.aClass26Array2893[i_225_];
									if (class26_228_ == null) {
										class26_228_ = class180_sub2_218_.aClass26Array2893[i_225_] = new Class26(class26_226_);
									}
									class26_227_.anInt157 += class26_226_.anInt157;
									class26_227_.anInt155 += class26_226_.anInt155;
									class26_227_.anInt160 += class26_226_.anInt160;
									class26_227_.anInt156 += class26_226_.anInt156;
									class26_228_.anInt157 += class26.anInt157;
									class26_228_.anInt155 += class26.anInt155;
									class26_228_.anInt160 += class26.anInt160;
									class26_228_.anInt156 += class26.anInt156;
									i_219_++;
									anIntArray2882[i_221_] = anInt2862;
									anIntArray2883[i_225_] = anInt2862;
								}
							}
						}
					}
				}
			}
		}
		if (i_219_ >= 3 && bool) {
			for (int i_229_ = 0; i_229_ < this.anInt2856; i_229_++) {
				if (anIntArray2882[this.trianglesA[i_229_]] == anInt2862 && anIntArray2882[this.trianglesB[i_229_]] == anInt2862 && anIntArray2882[this.trianglesC[i_229_]] == anInt2862) {
					if (this.aByteArray2895 == null) {
						this.aByteArray2895 = new byte[this.anInt2856];
					}
					this.aByteArray2895[i_229_] = (byte) 2;
				}
			}
			for (int i_230_ = 0; i_230_ < class180_sub2_218_.anInt2856; i_230_++) {
				if (anIntArray2883[class180_sub2_218_.trianglesA[i_230_]] == anInt2862 && anIntArray2883[class180_sub2_218_.trianglesB[i_230_]] == anInt2862 && anIntArray2883[class180_sub2_218_.trianglesC[i_230_]] == anInt2862) {
					if (class180_sub2_218_.aByteArray2895 == null) {
						class180_sub2_218_.aByteArray2895 = new byte[class180_sub2_218_.anInt2856];
					}
					class180_sub2_218_.aByteArray2895[i_230_] = (byte) 2;
				}
			}
		}
	}

	final AbstractModel method2300(final int i, final int i_231_, final int i_232_, final int i_233_, final int i_234_) {
		if (HDToolkit.glEnabled) {
			final HDModel class180_sub7_sub2 = new HDModel(this, i, i_231_, true);
			class180_sub7_sub2.method2426();
			return class180_sub7_sub2;
		}
		return new LDModel(this, i, i_231_, i_232_, i_233_, i_234_);
	}

	private static final int method2301(final int[][] is, final int i, final int i_235_) {
		final int i_236_ = i >> 7;
		final int i_237_ = i_235_ >> 7;
		if (i_236_ < 0 || i_237_ < 0 || i_236_ >= is.length || i_237_ >= is[0].length) {
			return 0;
		}
		final int i_238_ = i & 0x7f;
		final int i_239_ = i_235_ & 0x7f;
		final int i_240_ = is[i_236_][i_237_] * (128 - i_238_) + is[i_236_ + 1][i_237_] * i_238_ >> 7;
		final int i_241_ = is[i_236_][i_237_ + 1] * (128 - i_238_) + is[i_236_ + 1][i_237_ + 1] * i_238_ >> 7;
		return i_240_ * (128 - i_239_) + i_241_ * i_239_ >> 7;
	}

	final int method2302(final int i, final int i_242_, final int i_243_) {
		for (int i_244_ = 0; i_244_ < this.anInt2896; i_244_++) {
			if (this.xVertices[i_244_] == i && this.yVertices[i_244_] == i_242_ && this.zVertices[i_244_] == i_243_) {
				return i_244_;
			}
		}
		this.xVertices[this.anInt2896] = i;
		this.yVertices[this.anInt2896] = i_242_;
		this.zVertices[this.anInt2896] = i_243_;
		this.anInt2886 = ++this.anInt2896;
		return this.anInt2896 - 1;
	}

	final void method2303() {
		if (this.aClass26Array2878 == null) {
			this.aClass26Array2878 = new Class26[this.anInt2886];
			for (int i = 0; i < this.anInt2886; i++) {
				this.aClass26Array2878[i] = new Class26();
			}
			for (int i = 0; i < this.anInt2856; i++) {
				final int i_245_ = this.trianglesA[i];
				final int i_246_ = this.trianglesB[i];
				final int i_247_ = this.trianglesC[i];
				final int i_248_ = this.xVertices[i_246_] - this.xVertices[i_245_];
				final int i_249_ = this.yVertices[i_246_] - this.yVertices[i_245_];
				final int i_250_ = this.zVertices[i_246_] - this.zVertices[i_245_];
				final int i_251_ = this.xVertices[i_247_] - this.xVertices[i_245_];
				final int i_252_ = this.yVertices[i_247_] - this.yVertices[i_245_];
				final int i_253_ = this.zVertices[i_247_] - this.zVertices[i_245_];
				int i_254_ = i_249_ * i_253_ - i_252_ * i_250_;
				int i_255_ = i_250_ * i_251_ - i_253_ * i_248_;
				int i_256_;
				for (i_256_ = i_248_ * i_252_ - i_251_ * i_249_; i_254_ > 8192 || i_255_ > 8192 || i_256_ > 8192 || i_254_ < -8192 || i_255_ < -8192 || i_256_ < -8192; i_256_ >>= 1) {
					i_254_ >>= 1;
					i_255_ >>= 1;
				}
				int i_257_ = (int) Math.sqrt(i_254_ * i_254_ + i_255_ * i_255_ + i_256_ * i_256_);
				if (i_257_ <= 0) {
					i_257_ = 1;
				}
				i_254_ = i_254_ * 256 / i_257_;
				i_255_ = i_255_ * 256 / i_257_;
				i_256_ = i_256_ * 256 / i_257_;
				byte i_258_;
				if (this.aByteArray2895 == null) {
					i_258_ = (byte) 0;
				} else {
					i_258_ = this.aByteArray2895[i];
				}
				if (i_258_ == 0) {
					Class26 class26 = this.aClass26Array2878[i_245_];
					class26.anInt157 += i_254_;
					class26.anInt155 += i_255_;
					class26.anInt160 += i_256_;
					class26.anInt156++;
					class26 = this.aClass26Array2878[i_246_];
					class26.anInt157 += i_254_;
					class26.anInt155 += i_255_;
					class26.anInt160 += i_256_;
					class26.anInt156++;
					class26 = this.aClass26Array2878[i_247_];
					class26.anInt157 += i_254_;
					class26.anInt155 += i_255_;
					class26.anInt160 += i_256_;
					class26.anInt156++;
				} else if (i_258_ == 1) {
					if (this.aClass115Array2880 == null) {
						this.aClass115Array2880 = new Class115[this.anInt2856];
					}
					final Class115 class115 = this.aClass115Array2880[i] = new Class115();
					class115.anInt1111 = i_254_;
					class115.anInt1109 = i_255_;
					class115.anInt1112 = i_256_;
				}
			}
		}
	}

	private final void method2304() {
		if (!aBoolean2869) {
			aBoolean2869 = true;
			int i = 32767;
			int i_259_ = 32767;
			int i_260_ = 32767;
			int i_261_ = -32768;
			int i_262_ = -32768;
			int i_263_ = -32768;
			for (int i_264_ = 0; i_264_ < this.anInt2886; i_264_++) {
				final int i_265_ = this.xVertices[i_264_];
				final int i_266_ = this.yVertices[i_264_];
				final int i_267_ = this.zVertices[i_264_];
				if (i_265_ < i) {
					i = i_265_;
				}
				if (i_265_ > i_261_) {
					i_261_ = i_265_;
				}
				if (i_266_ < i_259_) {
					i_259_ = i_266_;
				}
				if (i_266_ > i_262_) {
					i_262_ = i_266_;
				}
				if (i_267_ < i_260_) {
					i_260_ = i_267_;
				}
				if (i_267_ > i_263_) {
					i_263_ = i_267_;
				}
			}
			aShort2854 = (short) i;
			aShort2902 = (short) i_261_;
			aShort2874 = (short) i_259_;
			aShort2868 = (short) i_262_;
			aShort2889 = (short) i_260_;
			aShort2865 = (short) i_263_;
		}
	}

	final Class180_Sub2 method2305(final int i, final int i_268_, final int[][] is, final int[][] is_269_, final int i_270_, final int i_271_, final int i_272_, final boolean bool, final boolean bool_273_) {
		method2304();
		int i_274_ = i_270_ + aShort2854;
		int i_275_ = i_270_ + aShort2902;
		int i_276_ = i_272_ + aShort2889;
		int i_277_ = i_272_ + aShort2865;
		if ((i == 1 || i == 2 || i == 3 || i == 5) && (i_274_ < 0 || i_275_ + 128 >> 7 >= is.length || i_276_ < 0 || i_277_ + 128 >> 7 >= is[0].length)) {
			return this;
		}
		if (i == 4 || i == 5) {
			if (is_269_ == null) {
				return this;
			}
			if (i_274_ < 0 || i_275_ + 128 >> 7 >= is_269_.length || i_276_ < 0 || i_277_ + 128 >> 7 >= is_269_[0].length) {
				return this;
			}
		} else {
			i_274_ >>= 7;
			i_275_ = i_275_ + 127 >> 7;
			i_276_ >>= 7;
			i_277_ = i_277_ + 127 >> 7;
			if (is[i_274_][i_276_] == i_271_ && is[i_275_][i_276_] == i_271_ && is[i_274_][i_277_] == i_271_ && is[i_275_][i_277_] == i_271_) {
				return this;
			}
		}
		Class180_Sub2 class180_sub2_278_;
		if (bool) {
			class180_sub2_278_ = new Class180_Sub2();
			class180_sub2_278_.anInt2896 = this.anInt2896;
			class180_sub2_278_.anInt2886 = this.anInt2886;
			class180_sub2_278_.anInt2856 = this.anInt2856;
			class180_sub2_278_.anInt2855 = this.anInt2855;
			class180_sub2_278_.trianglesA = this.trianglesA;
			class180_sub2_278_.trianglesB = this.trianglesB;
			class180_sub2_278_.trianglesC = this.trianglesC;
			class180_sub2_278_.aByteArray2895 = this.aByteArray2895;
			class180_sub2_278_.aByteArray2879 = this.aByteArray2879;
			class180_sub2_278_.aByteArray2864 = this.aByteArray2864;
			class180_sub2_278_.aByteArray2876 = this.aByteArray2876;
			class180_sub2_278_.triangleColors = this.triangleColors;
			class180_sub2_278_.aShortArray2850 = this.aShortArray2850;
			class180_sub2_278_.aByte2899 = this.aByte2899;
			class180_sub2_278_.texTrianglesType = this.texTrianglesType;
			class180_sub2_278_.texTrianglesA = this.texTrianglesA;
			class180_sub2_278_.texTrianglesB = this.texTrianglesB;
			class180_sub2_278_.texTrianglesC = this.texTrianglesC;
			class180_sub2_278_.aShortArray2903 = this.aShortArray2903;
			class180_sub2_278_.aShortArray2873 = this.aShortArray2873;
			class180_sub2_278_.aShortArray2900 = this.aShortArray2900;
			class180_sub2_278_.aByteArray2877 = this.aByteArray2877;
			class180_sub2_278_.aByteArray2888 = this.aByteArray2888;
			class180_sub2_278_.aByteArray2870 = this.aByteArray2870;
			class180_sub2_278_.aByteArray2859 = this.aByteArray2859;
			class180_sub2_278_.aByteArray2851 = this.aByteArray2851;
			class180_sub2_278_.vertexVSkins = this.vertexVSkins;
			class180_sub2_278_.anIntArray2872 = this.anIntArray2872;
			class180_sub2_278_.anIntArrayArray2884 = this.anIntArrayArray2884;
			class180_sub2_278_.anIntArrayArray2863 = this.anIntArrayArray2863;
			class180_sub2_278_.aShort2894 = this.aShort2894;
			class180_sub2_278_.aShort2866 = this.aShort2866;
			class180_sub2_278_.aClass26Array2878 = this.aClass26Array2878;
			class180_sub2_278_.aClass115Array2880 = this.aClass115Array2880;
			class180_sub2_278_.aClass26Array2893 = this.aClass26Array2893;
			class180_sub2_278_.aClass158Array2871 = this.aClass158Array2871;
			class180_sub2_278_.aClass169Array2887 = this.aClass169Array2887;
			if (i == 3) {
				class180_sub2_278_.xVertices = SpotAnimType.arrayCopy(this.xVertices);
				class180_sub2_278_.yVertices = SpotAnimType.arrayCopy(this.yVertices);
				class180_sub2_278_.zVertices = SpotAnimType.arrayCopy(this.zVertices);
			} else {
				class180_sub2_278_.xVertices = this.xVertices;
				class180_sub2_278_.yVertices = new int[class180_sub2_278_.anInt2896];
				class180_sub2_278_.zVertices = this.zVertices;
			}
		} else {
			class180_sub2_278_ = this;
		}
		if (i == 1) {
			for (int i_279_ = 0; i_279_ < class180_sub2_278_.anInt2886; i_279_++) {
				final int i_280_ = this.xVertices[i_279_] + i_270_;
				final int i_281_ = this.zVertices[i_279_] + i_272_;
				final int i_282_ = i_280_ & 0x7f;
				final int i_283_ = i_281_ & 0x7f;
				final int i_284_ = i_280_ >> 7;
				final int i_285_ = i_281_ >> 7;
				final int i_286_ = is[i_284_][i_285_] * (128 - i_282_) + is[i_284_ + 1][i_285_] * i_282_ >> 7;
				final int i_287_ = is[i_284_][i_285_ + 1] * (128 - i_282_) + is[i_284_ + 1][i_285_ + 1] * i_282_ >> 7;
				final int i_288_ = i_286_ * (128 - i_283_) + i_287_ * i_283_ >> 7;
				class180_sub2_278_.yVertices[i_279_] = this.yVertices[i_279_] + i_288_ - i_271_;
			}
			for (int i_289_ = class180_sub2_278_.anInt2886; i_289_ < class180_sub2_278_.anInt2896; i_289_++) {
				final int i_290_ = this.xVertices[i_289_] + i_270_;
				final int i_291_ = this.zVertices[i_289_] + i_272_;
				final int i_292_ = i_290_ & 0x7f;
				final int i_293_ = i_291_ & 0x7f;
				final int i_294_ = i_290_ >> 7;
				final int i_295_ = i_291_ >> 7;
				if (i_294_ >= 0 && i_294_ < is.length - 1 && i_295_ >= 0 && i_295_ < is[0].length - 1) {
					final int i_296_ = is[i_294_][i_295_] * (128 - i_292_) + is[i_294_ + 1][i_295_] * i_292_ >> 7;
					final int i_297_ = is[i_294_][i_295_ + 1] * (128 - i_292_) + is[i_294_ + 1][i_295_ + 1] * i_292_ >> 7;
					final int i_298_ = i_296_ * (128 - i_293_) + i_297_ * i_293_ >> 7;
					class180_sub2_278_.yVertices[i_289_] = this.yVertices[i_289_] + i_298_ - i_271_;
				}
			}
		} else if (i == 2) {
			for (int i_299_ = 0; i_299_ < class180_sub2_278_.anInt2886; i_299_++) {
				final int i_300_ = (this.yVertices[i_299_] << 16) / aShort2874;
				if (i_300_ < i_268_) {
					final int i_301_ = this.xVertices[i_299_] + i_270_;
					final int i_302_ = this.zVertices[i_299_] + i_272_;
					final int i_303_ = i_301_ & 0x7f;
					final int i_304_ = i_302_ & 0x7f;
					final int i_305_ = i_301_ >> 7;
					final int i_306_ = i_302_ >> 7;
					final int i_307_ = is[i_305_][i_306_] * (128 - i_303_) + is[i_305_ + 1][i_306_] * i_303_ >> 7;
					final int i_308_ = is[i_305_][i_306_ + 1] * (128 - i_303_) + is[i_305_ + 1][i_306_ + 1] * i_303_ >> 7;
					final int i_309_ = i_307_ * (128 - i_304_) + i_308_ * i_304_ >> 7;
					class180_sub2_278_.yVertices[i_299_] = this.yVertices[i_299_] + (i_309_ - i_271_) * (i_268_ - i_300_) / i_268_;
				} else {
					class180_sub2_278_.yVertices[i_299_] = this.yVertices[i_299_];
				}
			}
			for (int i_310_ = class180_sub2_278_.anInt2886; i_310_ < class180_sub2_278_.anInt2896; i_310_++) {
				final int i_311_ = (this.yVertices[i_310_] << 16) / aShort2874;
				if (i_311_ < i_268_) {
					final int i_312_ = this.xVertices[i_310_] + i_270_;
					final int i_313_ = this.zVertices[i_310_] + i_272_;
					final int i_314_ = i_312_ & 0x7f;
					final int i_315_ = i_313_ & 0x7f;
					final int i_316_ = i_312_ >> 7;
					final int i_317_ = i_313_ >> 7;
					if (i_316_ >= 0 && i_316_ < is.length - 1 && i_317_ >= 0 && i_317_ < is[0].length - 1) {
						final int i_318_ = is[i_316_][i_317_] * (128 - i_314_) + is[i_316_ + 1][i_317_] * i_314_ >> 7;
						final int i_319_ = is[i_316_][i_317_ + 1] * (128 - i_314_) + is[i_316_ + 1][i_317_ + 1] * i_314_ >> 7;
						final int i_320_ = i_318_ * (128 - i_315_) + i_319_ * i_315_ >> 7;
						class180_sub2_278_.yVertices[i_310_] = this.yVertices[i_310_] + (i_320_ - i_271_) * (i_268_ - i_311_) / i_268_;
					}
				} else {
					class180_sub2_278_.yVertices[i_310_] = this.yVertices[i_310_];
				}
			}
		} else if (i == 3) {
			final int i_321_ = (i_268_ & 0xff) * 4;
			final int i_322_ = (i_268_ >> 8 & 0xff) * 4;
			class180_sub2_278_.method2285(is, i_270_, i_271_, i_272_, i_321_, i_322_);
		} else if (i == 4) {
			final int i_323_ = aShort2868 - aShort2874;
			for (int i_324_ = 0; i_324_ < this.anInt2886; i_324_++) {
				final int i_325_ = this.xVertices[i_324_] + i_270_;
				final int i_326_ = this.zVertices[i_324_] + i_272_;
				final int i_327_ = i_325_ & 0x7f;
				final int i_328_ = i_326_ & 0x7f;
				final int i_329_ = i_325_ >> 7;
				final int i_330_ = i_326_ >> 7;
				final int i_331_ = is_269_[i_329_][i_330_] * (128 - i_327_) + is_269_[i_329_ + 1][i_330_] * i_327_ >> 7;
				final int i_332_ = is_269_[i_329_][i_330_ + 1] * (128 - i_327_) + is_269_[i_329_ + 1][i_330_ + 1] * i_327_ >> 7;
				final int i_333_ = i_331_ * (128 - i_328_) + i_332_ * i_328_ >> 7;
				class180_sub2_278_.yVertices[i_324_] = this.yVertices[i_324_] + i_333_ - i_271_ + i_323_;
			}
			for (int i_334_ = class180_sub2_278_.anInt2886; i_334_ < class180_sub2_278_.anInt2896; i_334_++) {
				final int i_335_ = this.xVertices[i_334_] + i_270_;
				final int i_336_ = this.zVertices[i_334_] + i_272_;
				final int i_337_ = i_335_ & 0x7f;
				final int i_338_ = i_336_ & 0x7f;
				final int i_339_ = i_335_ >> 7;
				final int i_340_ = i_336_ >> 7;
				if (i_339_ >= 0 && i_339_ < is_269_.length - 1 && i_340_ >= 0 && i_340_ < is_269_[0].length - 1) {
					final int i_341_ = is_269_[i_339_][i_340_] * (128 - i_337_) + is_269_[i_339_ + 1][i_340_] * i_337_ >> 7;
					final int i_342_ = is_269_[i_339_][i_340_ + 1] * (128 - i_337_) + is_269_[i_339_ + 1][i_340_ + 1] * i_337_ >> 7;
					final int i_343_ = i_341_ * (128 - i_338_) + i_342_ * i_338_ >> 7;
					class180_sub2_278_.yVertices[i_334_] = this.yVertices[i_334_] + i_343_ - i_271_ + i_323_;
				}
			}
		} else if (i == 5) {
			final int i_344_ = aShort2868 - aShort2874;
			for (int i_345_ = 0; i_345_ < this.anInt2886; i_345_++) {
				final int i_346_ = this.xVertices[i_345_] + i_270_;
				final int i_347_ = this.zVertices[i_345_] + i_272_;
				final int i_348_ = i_346_ & 0x7f;
				final int i_349_ = i_347_ & 0x7f;
				final int i_350_ = i_346_ >> 7;
				final int i_351_ = i_347_ >> 7;
				int i_352_ = is[i_350_][i_351_] * (128 - i_348_) + is[i_350_ + 1][i_351_] * i_348_ >> 7;
				int i_353_ = is[i_350_][i_351_ + 1] * (128 - i_348_) + is[i_350_ + 1][i_351_ + 1] * i_348_ >> 7;
				final int i_354_ = i_352_ * (128 - i_349_) + i_353_ * i_349_ >> 7;
				i_352_ = is_269_[i_350_][i_351_] * (128 - i_348_) + is_269_[i_350_ + 1][i_351_] * i_348_ >> 7;
				i_353_ = is_269_[i_350_][i_351_ + 1] * (128 - i_348_) + is_269_[i_350_ + 1][i_351_ + 1] * i_348_ >> 7;
				final int i_355_ = i_352_ * (128 - i_349_) + i_353_ * i_349_ >> 7;
				final int i_356_ = i_354_ - i_355_;
				class180_sub2_278_.yVertices[i_345_] = ((this.yVertices[i_345_] << 8) / i_344_ * i_356_ >> 8) - (i_271_ - i_354_);
			}
			for (int i_357_ = class180_sub2_278_.anInt2886; i_357_ < class180_sub2_278_.anInt2896; i_357_++) {
				final int i_358_ = this.xVertices[i_357_] + i_270_;
				final int i_359_ = this.zVertices[i_357_] + i_272_;
				final int i_360_ = i_358_ & 0x7f;
				final int i_361_ = i_359_ & 0x7f;
				final int i_362_ = i_358_ >> 7;
				final int i_363_ = i_359_ >> 7;
				if (i_362_ >= 0 && i_362_ < is.length - 1 && i_362_ < is_269_.length - 1 && i_363_ >= 0 && i_363_ < is[0].length - 1 && i_363_ < is_269_[0].length - 1) {
					int i_364_ = is[i_362_][i_363_] * (128 - i_360_) + is[i_362_ + 1][i_363_] * i_360_ >> 7;
					int i_365_ = is[i_362_][i_363_ + 1] * (128 - i_360_) + is[i_362_ + 1][i_363_ + 1] * i_360_ >> 7;
					final int i_366_ = i_364_ * (128 - i_361_) + i_365_ * i_361_ >> 7;
					i_364_ = is_269_[i_362_][i_363_] * (128 - i_360_) + is_269_[i_362_ + 1][i_363_] * i_360_ >> 7;
					i_365_ = is_269_[i_362_][i_363_ + 1] * (128 - i_360_) + is_269_[i_362_ + 1][i_363_ + 1] * i_360_ >> 7;
					final int i_367_ = i_364_ * (128 - i_361_) + i_365_ * i_361_ >> 7;
					final int i_368_ = i_366_ - i_367_;
					class180_sub2_278_.yVertices[i_357_] = ((this.yVertices[i_357_] << 8) / i_344_ * i_368_ >> 8) - (i_271_ - i_366_);
				}
			}
		}
		if (bool_273_) {
			class180_sub2_278_.method2296();
		} else {
			aBoolean2869 = false;
		}
		return class180_sub2_278_;
	}

	final void method2306(final int i, final int i_369_, final int i_370_) {
		for (int i_371_ = 0; i_371_ < this.anInt2896; i_371_++) {
			this.xVertices[i_371_] = this.xVertices[i_371_] * i / 128;
			this.yVertices[i_371_] = this.yVertices[i_371_] * i_369_ / 128;
			this.zVertices[i_371_] = this.zVertices[i_371_] * i_370_ / 128;
		}
		method2296();
	}

	final void recolor(final short i, final short i_372_) {
		for (int i_373_ = 0; i_373_ < this.anInt2856; i_373_++) {
			if (this.triangleColors[i_373_] == i) {
				this.triangleColors[i_373_] = i_372_;
			}
		}
	}

	private final void method2308(final int i) {
		final int i_374_ = anIntArray2858[i];
		final int i_375_ = anIntArray2853[i];
		for (int i_376_ = 0; i_376_ < this.anInt2896; i_376_++) {
			final int i_377_ = this.yVertices[i_376_] * i_374_ + this.xVertices[i_376_] * i_375_ >> 16;
			this.yVertices[i_376_] = this.yVertices[i_376_] * i_375_ - this.xVertices[i_376_] * i_374_ >> 16;
			this.xVertices[i_376_] = i_377_;
		}
		method2296();
	}

	private Class180_Sub2() {
		this.anInt2886 = 0;
	}

	private Class180_Sub2(final byte[] is) {
		this.anInt2886 = 0;
		if (is[is.length - 1] == -1 && is[is.length - 2] == -1) {
			method2294(is);
		} else {
			method2290(is);
		}
	}

	Class180_Sub2(final int i, final int i_378_, final int i_379_) {
		this.anInt2886 = 0;
		this.xVertices = new int[i];
		this.yVertices = new int[i];
		this.zVertices = new int[i];
		this.vertexVSkins = new int[i];
		this.trianglesA = new int[i_378_];
		this.trianglesB = new int[i_378_];
		this.trianglesC = new int[i_378_];
		this.aByteArray2895 = new byte[i_378_];
		this.aByteArray2879 = new byte[i_378_];
		this.aByteArray2864 = new byte[i_378_];
		this.triangleColors = new short[i_378_];
		this.aShortArray2850 = new short[i_378_];
		this.aByteArray2876 = new byte[i_378_];
		this.anIntArray2872 = new int[i_378_];
		if (i_379_ > 0) {
			this.texTrianglesType = new byte[i_379_];
			this.texTrianglesA = new short[i_379_];
			this.texTrianglesB = new short[i_379_];
			this.texTrianglesC = new short[i_379_];
			this.aShortArray2903 = new short[i_379_];
			this.aShortArray2873 = new short[i_379_];
			this.aShortArray2900 = new short[i_379_];
			this.aByteArray2877 = new byte[i_379_];
			this.aByteArray2888 = new byte[i_379_];
			this.aByteArray2870 = new byte[i_379_];
			this.aByteArray2859 = new byte[i_379_];
			this.aByteArray2851 = new byte[i_379_];
		}
	}

	Class180_Sub2(final Class180_Sub2[] class180_sub2s, final int i) {
		this.anInt2886 = 0;
		boolean bool = false;
		boolean bool_380_ = false;
		boolean bool_381_ = false;
		boolean bool_382_ = false;
		boolean bool_383_ = false;
		boolean bool_384_ = false;
		this.anInt2896 = 0;
		this.anInt2856 = 0;
		this.anInt2855 = 0;
		int i_385_ = 0;
		int i_386_ = 0;
		this.aByte2899 = (byte) -1;
		for (int i_387_ = 0; i_387_ < i; i_387_++) {
			final Class180_Sub2 class180_sub2_388_ = class180_sub2s[i_387_];
			if (class180_sub2_388_ != null) {
				this.anInt2896 += class180_sub2_388_.anInt2896;
				this.anInt2856 += class180_sub2_388_.anInt2856;
				this.anInt2855 += class180_sub2_388_.anInt2855;
				if (class180_sub2_388_.aByteArray2879 != null) {
					bool_380_ = true;
				} else {
					if (this.aByte2899 == -1) {
						this.aByte2899 = class180_sub2_388_.aByte2899;
					}
					if (this.aByte2899 != class180_sub2_388_.aByte2899) {
						bool_380_ = true;
					}
				}
				bool = bool | class180_sub2_388_.aByteArray2895 != null;
				bool_381_ = bool_381_ | class180_sub2_388_.aByteArray2864 != null;
				bool_382_ = bool_382_ | class180_sub2_388_.anIntArray2872 != null;
				bool_383_ = bool_383_ | class180_sub2_388_.aShortArray2850 != null;
				bool_384_ = bool_384_ | class180_sub2_388_.aByteArray2876 != null;
				if (class180_sub2_388_.aClass158Array2871 != null) {
					i_385_ += class180_sub2_388_.aClass158Array2871.length;
				}
				if (class180_sub2_388_.aClass169Array2887 != null) {
					i_386_ += class180_sub2_388_.aClass169Array2887.length;
				}
			}
		}
		this.xVertices = new int[this.anInt2896];
		this.yVertices = new int[this.anInt2896];
		this.zVertices = new int[this.anInt2896];
		this.vertexVSkins = new int[this.anInt2896];
		this.aShortArray2852 = new short[this.anInt2896];
		this.trianglesA = new int[this.anInt2856];
		this.trianglesB = new int[this.anInt2856];
		this.trianglesC = new int[this.anInt2856];
		if (bool) {
			this.aByteArray2895 = new byte[this.anInt2856];
		}
		if (bool_380_) {
			this.aByteArray2879 = new byte[this.anInt2856];
		}
		if (bool_381_) {
			this.aByteArray2864 = new byte[this.anInt2856];
		}
		if (bool_382_) {
			this.anIntArray2872 = new int[this.anInt2856];
		}
		if (bool_383_) {
			this.aShortArray2850 = new short[this.anInt2856];
		}
		if (bool_384_) {
			this.aByteArray2876 = new byte[this.anInt2856];
		}
		if (i_385_ > 0) {
			this.aClass158Array2871 = new Class158[i_385_];
		}
		if (i_386_ > 0) {
			this.aClass169Array2887 = new Class169[i_386_];
		}
		this.triangleColors = new short[this.anInt2856];
		this.aShortArray2867 = new short[this.anInt2856];
		if (this.anInt2855 > 0) {
			this.texTrianglesType = new byte[this.anInt2855];
			this.texTrianglesA = new short[this.anInt2855];
			this.texTrianglesB = new short[this.anInt2855];
			this.texTrianglesC = new short[this.anInt2855];
			this.aShortArray2903 = new short[this.anInt2855];
			this.aShortArray2873 = new short[this.anInt2855];
			this.aShortArray2900 = new short[this.anInt2855];
			this.aByteArray2877 = new byte[this.anInt2855];
			this.aByteArray2888 = new byte[this.anInt2855];
			this.aByteArray2870 = new byte[this.anInt2855];
			this.aByteArray2859 = new byte[this.anInt2855];
			this.aByteArray2851 = new byte[this.anInt2855];
		}
		this.anInt2896 = 0;
		this.anInt2856 = 0;
		this.anInt2855 = 0;
		i_385_ = 0;
		i_386_ = 0;
		for (int i_389_ = 0; i_389_ < i; i_389_++) {
			final short i_390_ = (short) (1 << i_389_);
			final Class180_Sub2 class180_sub2_391_ = class180_sub2s[i_389_];
			if (class180_sub2_391_ != null) {
				for (int i_392_ = 0; i_392_ < class180_sub2_391_.anInt2856; i_392_++) {
					if (bool && class180_sub2_391_.aByteArray2895 != null) {
						this.aByteArray2895[this.anInt2856] = class180_sub2_391_.aByteArray2895[i_392_];
					}
					if (bool_380_) {
						if (class180_sub2_391_.aByteArray2879 != null) {
							this.aByteArray2879[this.anInt2856] = class180_sub2_391_.aByteArray2879[i_392_];
						} else {
							this.aByteArray2879[this.anInt2856] = class180_sub2_391_.aByte2899;
						}
					}
					if (bool_381_ && class180_sub2_391_.aByteArray2864 != null) {
						this.aByteArray2864[this.anInt2856] = class180_sub2_391_.aByteArray2864[i_392_];
					}
					if (bool_382_ && class180_sub2_391_.anIntArray2872 != null) {
						this.anIntArray2872[this.anInt2856] = class180_sub2_391_.anIntArray2872[i_392_];
					}
					if (bool_383_) {
						if (class180_sub2_391_.aShortArray2850 != null) {
							this.aShortArray2850[this.anInt2856] = class180_sub2_391_.aShortArray2850[i_392_];
						} else {
							this.aShortArray2850[this.anInt2856] = (short) -1;
						}
					}
					this.triangleColors[this.anInt2856] = class180_sub2_391_.triangleColors[i_392_];
					this.aShortArray2867[this.anInt2856] = i_390_;
					this.trianglesA[this.anInt2856] = method2280(class180_sub2_391_, class180_sub2_391_.trianglesA[i_392_], i_390_);
					this.trianglesB[this.anInt2856] = method2280(class180_sub2_391_, class180_sub2_391_.trianglesB[i_392_], i_390_);
					this.trianglesC[this.anInt2856] = method2280(class180_sub2_391_, class180_sub2_391_.trianglesC[i_392_], i_390_);
					this.anInt2856++;
				}
				if (class180_sub2_391_.aClass158Array2871 != null) {
					for (int i_393_ = 0; i_393_ < class180_sub2_391_.aClass158Array2871.length; i_393_++) {
						final int i_394_ = method2280(class180_sub2_391_, class180_sub2_391_.aClass158Array2871[i_393_].anInt1485, i_390_);
						final int i_395_ = method2280(class180_sub2_391_, class180_sub2_391_.aClass158Array2871[i_393_].anInt1484, i_390_);
						final int i_396_ = method2280(class180_sub2_391_, class180_sub2_391_.aClass158Array2871[i_393_].anInt1476, i_390_);
						this.aClass158Array2871[i_385_] = new Class158(class180_sub2_391_.aClass158Array2871[i_393_].aClass80_1480, i_394_, i_395_, i_396_);
						i_385_++;
					}
				}
				if (class180_sub2_391_.aClass169Array2887 != null) {
					for (int i_397_ = 0; i_397_ < class180_sub2_391_.aClass169Array2887.length; i_397_++) {
						final int i_398_ = method2280(class180_sub2_391_, class180_sub2_391_.aClass169Array2887[i_397_].anInt1647, i_390_);
						this.aClass169Array2887[i_386_] = new Class169(class180_sub2_391_.aClass169Array2887[i_397_].aClass32_1650, i_398_);
						i_386_++;
					}
				}
			}
		}
		int i_399_ = 0;
		this.anInt2886 = this.anInt2896;
		for (int i_400_ = 0; i_400_ < i; i_400_++) {
			final Class180_Sub2 class180_sub2_401_ = class180_sub2s[i_400_];
			final short i_402_ = (short) (1 << i_400_);
			if (class180_sub2_401_ != null) {
				for (int i_403_ = 0; i_403_ < class180_sub2_401_.anInt2856; i_403_++) {
					if (bool_384_) {
						this.aByteArray2876[i_399_++] = (byte) (class180_sub2_401_.aByteArray2876 != null && class180_sub2_401_.aByteArray2876[i_403_] != -1 ? class180_sub2_401_.aByteArray2876[i_403_] + this.anInt2855 : -1);
					}
				}
				for (int i_404_ = 0; i_404_ < class180_sub2_401_.anInt2855; i_404_++) {
					final byte i_405_ = this.texTrianglesType[this.anInt2855] = class180_sub2_401_.texTrianglesType[i_404_];
					if (i_405_ == 0) {
						this.texTrianglesA[this.anInt2855] = (short) method2280(class180_sub2_401_, class180_sub2_401_.texTrianglesA[i_404_], i_402_);
						this.texTrianglesB[this.anInt2855] = (short) method2280(class180_sub2_401_, class180_sub2_401_.texTrianglesB[i_404_], i_402_);
						this.texTrianglesC[this.anInt2855] = (short) method2280(class180_sub2_401_, class180_sub2_401_.texTrianglesC[i_404_], i_402_);
					}
					if (i_405_ >= 1 && i_405_ <= 3) {
						this.texTrianglesA[this.anInt2855] = class180_sub2_401_.texTrianglesA[i_404_];
						this.texTrianglesB[this.anInt2855] = class180_sub2_401_.texTrianglesB[i_404_];
						this.texTrianglesC[this.anInt2855] = class180_sub2_401_.texTrianglesC[i_404_];
						this.aShortArray2903[this.anInt2855] = class180_sub2_401_.aShortArray2903[i_404_];
						this.aShortArray2873[this.anInt2855] = class180_sub2_401_.aShortArray2873[i_404_];
						this.aShortArray2900[this.anInt2855] = class180_sub2_401_.aShortArray2900[i_404_];
						this.aByteArray2877[this.anInt2855] = class180_sub2_401_.aByteArray2877[i_404_];
						this.aByteArray2888[this.anInt2855] = class180_sub2_401_.aByteArray2888[i_404_];
						this.aByteArray2870[this.anInt2855] = class180_sub2_401_.aByteArray2870[i_404_];
					}
					if (i_405_ == 2) {
						this.aByteArray2859[this.anInt2855] = class180_sub2_401_.aByteArray2859[i_404_];
						this.aByteArray2851[this.anInt2855] = class180_sub2_401_.aByteArray2851[i_404_];
					}
					this.anInt2855++;
				}
			}
		}
	}

	Class180_Sub2(final Class180_Sub2 class180_sub2_406_, final boolean bool, final boolean bool_407_, final boolean bool_408_, final boolean bool_409_) {
		this.anInt2886 = 0;
		this.anInt2896 = class180_sub2_406_.anInt2896;
		this.anInt2886 = class180_sub2_406_.anInt2886;
		this.anInt2856 = class180_sub2_406_.anInt2856;
		this.anInt2855 = class180_sub2_406_.anInt2855;
		if (bool) {
			this.xVertices = class180_sub2_406_.xVertices;
			this.yVertices = class180_sub2_406_.yVertices;
			this.zVertices = class180_sub2_406_.zVertices;
		} else {
			this.xVertices = new int[this.anInt2896];
			this.yVertices = new int[this.anInt2896];
			this.zVertices = new int[this.anInt2896];
			for (int i = 0; i < this.anInt2896; i++) {
				this.xVertices[i] = class180_sub2_406_.xVertices[i];
				this.yVertices[i] = class180_sub2_406_.yVertices[i];
				this.zVertices[i] = class180_sub2_406_.zVertices[i];
			}
		}
		if (bool_407_) {
			this.triangleColors = class180_sub2_406_.triangleColors;
		} else {
			this.triangleColors = new short[this.anInt2856];
			for (int i = 0; i < this.anInt2856; i++) {
				this.triangleColors[i] = class180_sub2_406_.triangleColors[i];
			}
		}
		if (bool_408_ || class180_sub2_406_.aShortArray2850 == null) {
			this.aShortArray2850 = class180_sub2_406_.aShortArray2850;
		} else {
			this.aShortArray2850 = new short[this.anInt2856];
			for (int i = 0; i < this.anInt2856; i++) {
				this.aShortArray2850[i] = class180_sub2_406_.aShortArray2850[i];
			}
		}
		if (bool_409_) {
			this.aByteArray2864 = class180_sub2_406_.aByteArray2864;
		} else {
			this.aByteArray2864 = new byte[this.anInt2856];
			if (class180_sub2_406_.aByteArray2864 == null) {
				for (int i = 0; i < this.anInt2856; i++) {
					this.aByteArray2864[i] = (byte) 0;
				}
			} else {
				for (int i = 0; i < this.anInt2856; i++) {
					this.aByteArray2864[i] = class180_sub2_406_.aByteArray2864[i];
				}
			}
		}
		this.trianglesA = class180_sub2_406_.trianglesA;
		this.trianglesB = class180_sub2_406_.trianglesB;
		this.trianglesC = class180_sub2_406_.trianglesC;
		this.aByteArray2895 = class180_sub2_406_.aByteArray2895;
		this.aByteArray2879 = class180_sub2_406_.aByteArray2879;
		this.aByteArray2876 = class180_sub2_406_.aByteArray2876;
		this.aByte2899 = class180_sub2_406_.aByte2899;
		this.texTrianglesType = class180_sub2_406_.texTrianglesType;
		this.texTrianglesA = class180_sub2_406_.texTrianglesA;
		this.texTrianglesB = class180_sub2_406_.texTrianglesB;
		this.texTrianglesC = class180_sub2_406_.texTrianglesC;
		this.aShortArray2903 = class180_sub2_406_.aShortArray2903;
		this.aShortArray2873 = class180_sub2_406_.aShortArray2873;
		this.aShortArray2900 = class180_sub2_406_.aShortArray2900;
		this.aByteArray2877 = class180_sub2_406_.aByteArray2877;
		this.aByteArray2888 = class180_sub2_406_.aByteArray2888;
		this.aByteArray2870 = class180_sub2_406_.aByteArray2870;
		this.aByteArray2859 = class180_sub2_406_.aByteArray2859;
		this.aByteArray2851 = class180_sub2_406_.aByteArray2851;
		this.vertexVSkins = class180_sub2_406_.vertexVSkins;
		this.anIntArray2872 = class180_sub2_406_.anIntArray2872;
		this.anIntArrayArray2884 = class180_sub2_406_.anIntArrayArray2884;
		this.anIntArrayArray2863 = class180_sub2_406_.anIntArrayArray2863;
		this.aClass26Array2878 = class180_sub2_406_.aClass26Array2878;
		this.aClass115Array2880 = class180_sub2_406_.aClass115Array2880;
		this.aClass26Array2893 = class180_sub2_406_.aClass26Array2893;
		this.aShort2894 = class180_sub2_406_.aShort2894;
		this.aShort2866 = class180_sub2_406_.aShort2866;
		this.aClass158Array2871 = class180_sub2_406_.aClass158Array2871;
		this.aClass169Array2887 = class180_sub2_406_.aClass169Array2887;
	}
}
