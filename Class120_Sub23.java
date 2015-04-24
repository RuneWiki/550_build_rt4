/* Class120_Sub23 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class120_Sub23 extends Node {
	private static int blockSize0;
	private static float[] aFloatArray2683;
	private static int[] modeMappings;
	private int anInt2685;
	private static Residue[] residues;
	private static byte[] source;
	private static float[] aFloatArray2688;
	private static float[] aFloatArray2689;
	private static int blockSize1;
	private boolean aBoolean2691;
	private static float[] aFloatArray2692;
	private int anInt2693;
	private int anInt2694;
	private static float[] aFloatArray2695;
	private static int[] anIntArray2696;
	private static float[] aFloatArray2697;
	private static Mapping[] mappings;
	private static boolean aBoolean2699 = false;
	private static int byteIndex;
	private int anInt2701;
	private int anInt2702;
	private static int bitIndex;
	private byte[][] aByteArrayArray2704;
	private static boolean[] modeBlockFlags;
	private static float[] aFloatArray2706;
	private static Floor1[] floors;
	private float[] aFloatArray2708;
	private static int[] anIntArray2709;
	static CodeBook[] codeBooks;
	private boolean aBoolean2711;
	private int anInt2712;
	private int anInt2713;
	private byte[] aByteArray2714;
	private int anInt2715;

	private final float[] method1707(final int i) {
		setBuffer(aByteArrayArray2704[i], 0);
		getBit();
		final int modeNumber = getInt(Class120_Sub23.ilog(modeMappings.length - 1));
		final boolean blockFlag = modeBlockFlags[modeNumber];
		final int n = blockFlag ? blockSize1 : blockSize0;
		boolean previousWindowFlag = false;
		boolean nextWindowFlag = false;
		if (blockFlag) {
			previousWindowFlag = getBit() != 0;
			nextWindowFlag = getBit() != 0;
		}
		final int windowCenter = n >> 1;
		int leftWindowStart;
		int leftWindowEnd;
		int leftN;
		if (blockFlag && !previousWindowFlag) {
			leftWindowStart = (n >> 2) - (blockSize0 >> 2);
			leftWindowEnd = (n >> 2) + (blockSize0 >> 2);
			leftN = blockSize0 >> 1;
		} else {
			leftWindowStart = 0;
			leftWindowEnd = windowCenter;
			leftN = n >> 1;
		}
		int rightWindowStart;
		int rightWindowEnd;
		int rightN;
		if (blockFlag && !nextWindowFlag) {
			rightWindowStart = n - (n >> 2) - (blockSize0 >> 2);
			rightWindowEnd = n - (n >> 2) + (blockSize0 >> 2);
			rightN = blockSize0 >> 1;
		} else {
			rightWindowStart = windowCenter;
			rightWindowEnd = n;
			rightN = n >> 1;
		}
		final Mapping mapping = mappings[modeMappings[modeNumber]];
		final int submapNumber = mapping.mux;
		int floorNumber = mapping.submapFloors[submapNumber];
		final boolean bool_13_ = !floors[floorNumber].decodedFloor();
		for (floorNumber = 0; floorNumber < mapping.submaps; floorNumber++) {
			final Residue residue = residues[mapping.submapResidues[floorNumber]];
			final float[] fs = aFloatArray2697;
			residue.decodeResidue(fs, n >> 1, bool_13_);
		}
		if (!bool_13_) {
			floorNumber = mapping.mux;
			final int i_15_ = mapping.submapFloors[floorNumber];
			floors[i_15_].computeFloor(aFloatArray2697, n >> 1);
		}
		if (bool_13_) {
			for (floorNumber = n >> 1; floorNumber < n; floorNumber++) {
				aFloatArray2697[floorNumber] = 0.0F;
			}
		} else {
			final int n2 = n >> 1;
			final int n4 = n >> 2;
			final int n8 = n >> 3;
			final float[] fs = aFloatArray2697;
			for (int i_18_ = 0; i_18_ < n2; i_18_++) {
				fs[i_18_] *= 0.5F;
			}
			for (int i_19_ = n2; i_19_ < n; i_19_++) {
				fs[i_19_] = -fs[n - i_19_ - 1];
			}
			final float[] fs_20_ = blockFlag ? aFloatArray2692 : aFloatArray2688;
			final float[] fs_21_ = blockFlag ? aFloatArray2706 : aFloatArray2695;
			final float[] fs_22_ = blockFlag ? aFloatArray2683 : aFloatArray2689;
			final int[] is = blockFlag ? anIntArray2709 : anIntArray2696;
			for (int i_23_ = 0; i_23_ < n4; i_23_++) {
				final float f = fs[4 * i_23_] - fs[n - 4 * i_23_ - 1];
				final float f_24_ = fs[4 * i_23_ + 2] - fs[n - 4 * i_23_ - 3];
				final float f_25_ = fs_20_[2 * i_23_];
				final float f_26_ = fs_20_[2 * i_23_ + 1];
				fs[n - 4 * i_23_ - 1] = f * f_25_ - f_24_ * f_26_;
				fs[n - 4 * i_23_ - 3] = f * f_26_ + f_24_ * f_25_;
			}
			for (int i_27_ = 0; i_27_ < n8; i_27_++) {
				final float f = fs[n2 + 3 + 4 * i_27_];
				final float f_28_ = fs[n2 + 1 + 4 * i_27_];
				final float f_29_ = fs[4 * i_27_ + 3];
				final float f_30_ = fs[4 * i_27_ + 1];
				fs[n2 + 3 + 4 * i_27_] = f + f_29_;
				fs[n2 + 1 + 4 * i_27_] = f_28_ + f_30_;
				final float f_31_ = fs_20_[n2 - 4 - 4 * i_27_];
				final float f_32_ = fs_20_[n2 - 3 - 4 * i_27_];
				fs[4 * i_27_ + 3] = (f - f_29_) * f_31_ - (f_28_ - f_30_) * f_32_;
				fs[4 * i_27_ + 1] = (f_28_ - f_30_) * f_31_ + (f - f_29_) * f_32_;
			}
			final int i_33_ = Class120_Sub23.ilog(n - 1);
			for (int i_34_ = 0; i_34_ < i_33_ - 3; i_34_++) {
				final int i_35_ = n >> i_34_ + 2;
				final int i_36_ = 8 << i_34_;
				for (int i_37_ = 0; i_37_ < 2 << i_34_; i_37_++) {
					final int i_38_ = n - i_35_ * 2 * i_37_;
					final int i_39_ = n - i_35_ * (2 * i_37_ + 1);
					for (int i_40_ = 0; i_40_ < n >> i_34_ + 4; i_40_++) {
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
			for (int i_47_ = 1; i_47_ < n8 - 1; i_47_++) {
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
			for (int i_51_ = 0; i_51_ < n2; i_51_++) {
				fs[i_51_] = fs[2 * i_51_ + 1];
			}
			for (int i_52_ = 0; i_52_ < n8; i_52_++) {
				fs[n - 1 - 2 * i_52_] = fs[4 * i_52_];
				fs[n - 2 - 2 * i_52_] = fs[4 * i_52_ + 1];
				fs[n - n4 - 1 - 2 * i_52_] = fs[4 * i_52_ + 2];
				fs[n - n4 - 2 - 2 * i_52_] = fs[4 * i_52_ + 3];
			}
			for (int i_53_ = 0; i_53_ < n8; i_53_++) {
				final float f = fs_22_[2 * i_53_];
				final float f_54_ = fs_22_[2 * i_53_ + 1];
				final float f_55_ = fs[n2 + 2 * i_53_];
				final float f_56_ = fs[n2 + 2 * i_53_ + 1];
				final float f_57_ = fs[n - 2 - 2 * i_53_];
				final float f_58_ = fs[n - 1 - 2 * i_53_];
				float f_59_ = f_54_ * (f_55_ - f_57_) + f * (f_56_ + f_58_);
				fs[n2 + 2 * i_53_] = (f_55_ + f_57_ + f_59_) * 0.5F;
				fs[n - 2 - 2 * i_53_] = (f_55_ + f_57_ - f_59_) * 0.5F;
				f_59_ = f_54_ * (f_56_ + f_58_) - f * (f_55_ - f_57_);
				fs[n2 + 2 * i_53_ + 1] = (f_56_ - f_58_ + f_59_) * 0.5F;
				fs[n - 1 - 2 * i_53_] = (-f_56_ + f_58_ + f_59_) * 0.5F;
			}
			for (int i_60_ = 0; i_60_ < n4; i_60_++) {
				fs[i_60_] = fs[2 * i_60_ + n2] * fs_21_[2 * i_60_] + fs[2 * i_60_ + 1 + n2] * fs_21_[2 * i_60_ + 1];
				fs[n2 - 1 - i_60_] = fs[2 * i_60_ + n2] * fs_21_[2 * i_60_ + 1] - fs[2 * i_60_ + 1 + n2] * fs_21_[2 * i_60_];
			}
			for (int i_61_ = 0; i_61_ < n4; i_61_++) {
				fs[n - n4 + i_61_] = -fs[i_61_];
			}
			for (int i_62_ = 0; i_62_ < n4; i_62_++) {
				fs[i_62_] = fs[n4 + i_62_];
			}
			for (int i_63_ = 0; i_63_ < n4; i_63_++) {
				fs[n4 + i_63_] = -fs[n4 - i_63_ - 1];
			}
			for (int i_64_ = 0; i_64_ < n4; i_64_++) {
				fs[n2 + i_64_] = fs[n - i_64_ - 1];
			}
			for (int i_65_ = leftWindowStart; i_65_ < leftWindowEnd; i_65_++) {
				final float f = (float) Math.sin((i_65_ - leftWindowStart + 0.5) / leftN * 0.5 * 3.141592653589793);
				aFloatArray2697[i_65_] *= (float) Math.sin(1.5707963267948966 * f * f);
			}
			for (int i_66_ = rightWindowStart; i_66_ < rightWindowEnd; i_66_++) {
				final float f = (float) Math.sin((i_66_ - rightWindowStart + 0.5) / rightN * 0.5 * 3.141592653589793 + 1.5707963267948966);
				aFloatArray2697[i_66_] *= (float) Math.sin(1.5707963267948966 * f * f);
			}
		}
		float[] fs = null;
		if (anInt2712 > 0) {
			final int i_67_ = anInt2712 + n >> 2;
			fs = new float[i_67_];
			if (!aBoolean2691) {
				for (int i_68_ = 0; i_68_ < anInt2693; i_68_++) {
					final int i_69_ = (anInt2712 >> 1) + i_68_;
					fs[i_68_] += aFloatArray2708[i_69_];
				}
			}
			if (!bool_13_) {
				for (int i_70_ = leftWindowStart; i_70_ < n >> 1; i_70_++) {
					final int i_71_ = fs.length - (n >> 1) + i_70_;
					fs[i_71_] += aFloatArray2697[i_70_];
				}
			}
		}
		final float[] fs_72_ = aFloatArray2708;
		aFloatArray2708 = aFloatArray2697;
		aFloatArray2697 = fs_72_;
		anInt2712 = n;
		anInt2693 = rightWindowEnd - (n >> 1);
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

	private static final void setBuffer(final byte[] is, final int i) {
		source = is;
		byteIndex = i;
		bitIndex = 0;
	}

	private static final void method1710(final byte[] is) {
		setBuffer(is, 0);
		blockSize0 = 1 << getInt(4);
		blockSize1 = 1 << getInt(4);
		aFloatArray2697 = new float[blockSize1];
		for (int id = 0; id < 2; id++) {
			final int n = id != 0 ? blockSize1 : blockSize0;
			final int i_74_ = n >> 1;
			final int i_75_ = n >> 2;
			final int i_76_ = n >> 3;
			final float[] fs = new float[i_74_];
			for (int i_77_ = 0; i_77_ < i_75_; i_77_++) {
				fs[2 * i_77_] = (float) Math.cos(4 * i_77_ * 3.141592653589793 / n);
				fs[2 * i_77_ + 1] = -(float) Math.sin(4 * i_77_ * 3.141592653589793 /n);
			}
			final float[] fs_78_ = new float[i_74_];
			for (int i_79_ = 0; i_79_ < i_75_; i_79_++) {
				fs_78_[2 * i_79_] = (float) Math.cos((2 * i_79_ + 1) * 3.141592653589793 / (2 * n));
				fs_78_[2 * i_79_ + 1] = (float) Math.sin((2 * i_79_ + 1) * 3.141592653589793 / (2 * n));
			}
			final float[] fs_80_ = new float[i_75_];
			for (int i_81_ = 0; i_81_ < i_76_; i_81_++) {
				fs_80_[2 * i_81_] = (float) Math.cos((4 * i_81_ + 2) * 3.141592653589793 / n);
				fs_80_[2 * i_81_ + 1] = -(float) Math.sin((4 * i_81_ + 2) * 3.141592653589793 / n);
			}
			final int[] is_82_ = new int[i_76_];
			final int i_83_ = Class120_Sub23.ilog(i_76_ - 1);
			for (int i_84_ = 0; i_84_ < i_76_; i_84_++) {
				is_82_[i_84_] = ClanMember.method1405(i_84_, i_83_);
			}
			if (id != 0) {
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
		
		final int codeBookCount = getInt(8) + 1;
		codeBooks = new CodeBook[codeBookCount];
		for (int id = 0; id < codeBookCount; id++) {
			codeBooks[id] = new CodeBook();
		}
		
		//the time domain transformations, these should all be 0
		int timeCount = getInt(6) + 1;
		for (int id = 0; id < timeCount; id++) {
			getInt(16);
		}
		
		//Jagex only support floor1
		int floorCount = getInt(6) + 1;
		floors = new Floor1[floorCount];
		for (int id = 0; id < floorCount; id++) {
			floors[id] = new Floor1();
		}
		
		final int residueCount = getInt(6) + 1;
		residues = new Residue[residueCount];
		for (int id = 0; id < residueCount; id++) {
			residues[id] = new Residue();
		}
		
		final int mappingCount = getInt(6) + 1;
		mappings = new Mapping[mappingCount];
		for (int i_92_ = 0; i_92_ < mappingCount; i_92_++) {
			mappings[i_92_] = new Mapping();
		}
		
		final int modeCount = getInt(6) + 1;
		modeBlockFlags = new boolean[modeCount];
		modeMappings = new int[modeCount];
		for (int id = 0; id < modeCount; id++) {
			modeBlockFlags[id] = getBit() != 0;
			getInt(16);//windowType
			getInt(16);//transformType
			modeMappings[id] = getInt(8);
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

	static final int getBit() {
		final int value = source[byteIndex] >> bitIndex & 0x1;
		bitIndex++;
		byteIndex += bitIndex >> 3;
		bitIndex &= 0x7;
		return value;
	}

	static final float float32unpack(final int x) {
		int mantissa = x & 0x1fffff;
		final int e = (x & 0x7fe00000) >> 21;
		if ((x & ~0x7fffffff) != 0) {
			mantissa = -mantissa;
		}
		return (float) (mantissa * Math.pow(2.0, e - 788));
	}

	final Class120_Sub5_Sub1 method1715(final int[] is) {
		if (is != null && is[0] <= 0) {
			return null;
		}
		if (aByteArray2714 == null) {
			anInt2712 = 0;
			aFloatArray2708 = new float[blockSize1];
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

	static final int intPow(int e, int base) {
		int res = 1;
		while (e > 1) {
			if ((0x1 & e) != 0) {
				res *= base;
			}
			e >>= 1;
			base *= base;
		}
		if (e == 1) {
			return base * res;
		}
		return res;
	}

	static final int ilog(int x) {
		int res = 0;
		if (x < 0 || x >= 65536) {
			x >>>= 16;
			res += 16;
		}
		if (x >= 256) {
			x >>>= 8;
			res += 8;
		}
		if (x >= 16) {
			x >>>= 4;
			res += 4;
		}
		if (x >= 4) {
			res += 2;
			x >>>= 2;
		}
		if (x >= 1) {
			res++;
			x >>>= 1;
		}
		return res + x;
	}

	static final Class120_Sub23 method1716(final js5 js5, final int i, final int i_106_) {
		if (!method1708(js5)) {
			js5.requestDownload(i, i_106_);
			return null;
		}
		final byte[] is = js5.getFile(i, i_106_);
		if (is == null) {
			return null;
		}
		return new Class120_Sub23(is);
	}

	static final int getInt(int bits) {
		int value = 0;
		int bitsRead = 0;
		int msb;
		for (/**/; bits >= 8 - bitIndex; bits -= msb) {
			msb = 8 - bitIndex;
			value += (source[byteIndex] >> bitIndex & ((1 << msb) - 1)) << bitsRead;
			bitIndex = 0;
			byteIndex++;
			bitsRead += msb;
		}
		if (bits > 0) {
			value += (source[byteIndex] >> bitIndex & ((1 << bits) - 1)) << bitsRead;
			bitIndex += bits;
		}
		return value;
	}

	private Class120_Sub23(final byte[] is) {
		method1711(is);
	}
}
