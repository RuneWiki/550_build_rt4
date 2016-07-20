/* Class129 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class CodeBook {
	private final int numEntries;
	private int[] codeBookMultiplicands;
	private float[][] valueVector;
	private final int[] codewordLength;
	int numDimensions;
	private int[] codewordMap;

	final float[] method1910() {
		return valueVector[decodeScalar()];
	}

	private static final int lookup1Values(final int a, final int b) {
		int res;
		for (res = (int) Math.pow(a, 1.0 / b) + 1; Class120_Sub23.intPow(b, res) > a; res--) {
			/* empty */
		}
		return res;
	}

	private final void prepareHuffman() {
		final int[] is = new int[numEntries];
		final int[] is_2_ = new int[33];
		for (int i = 0; i < numEntries; i++) {
			final int i_3_ = codewordLength[i];
			if (i_3_ != 0) {
				final int i_4_ = 1 << 32 - i_3_;
				final int i_5_ = is_2_[i_3_];
				is[i] = i_5_;
				int i_6_;
				if ((i_5_ & i_4_) != 0) {
					i_6_ = is_2_[i_3_ - 1];
				} else {
					i_6_ = i_5_ | i_4_;
					for (int i_7_ = i_3_ - 1; i_7_ >= 1; i_7_--) {
						final int i_8_ = is_2_[i_7_];
						if (i_8_ != i_5_) {
							break;
						}
						final int i_9_ = 1 << 32 - i_7_;
						if ((i_8_ & i_9_) != 0) {
							is_2_[i_7_] = is_2_[i_7_ - 1];
							break;
						}
						is_2_[i_7_] = i_8_ | i_9_;
					}
				}
				is_2_[i_3_] = i_6_;
				for (int i_10_ = i_3_ + 1; i_10_ <= 32; i_10_++) {
					final int i_11_ = is_2_[i_10_];
					if (i_11_ == i_5_) {
						is_2_[i_10_] = i_6_;
					}
				}
			}
		}
		codewordMap = new int[8];
		int i = 0;
		for (int i_12_ = 0; i_12_ < numEntries; i_12_++) {
			final int i_13_ = codewordLength[i_12_];
			if (i_13_ != 0) {
				final int i_14_ = is[i_12_];
				int i_15_ = 0;
				for (int i_16_ = 0; i_16_ < i_13_; i_16_++) {
					int i_17_ = -2147483648 >>> i_16_;
					if ((i_14_ & i_17_) != 0) {
						if (codewordMap[i_15_] == 0) {
							codewordMap[i_15_] = i;
						}
						i_15_ = codewordMap[i_15_];
					} else {
						i_15_++;
					}
					if (i_15_ >= codewordMap.length) {
						final int[] is_18_ = new int[codewordMap.length * 2];
						for (int i_19_ = 0; i_19_ < codewordMap.length; i_19_++) {
							is_18_[i_19_] = codewordMap[i_19_];
						}
						codewordMap = is_18_;
					}
					i_17_ >>>= 1;
				}
				codewordMap[i_15_] = i_12_ ^ 0xffffffff;
				if (i_15_ >= i) {
					i = i_15_ + 1;
				}
			}
		}
	}

	final int decodeScalar() {
		int i;
		for (i = 0; codewordMap[i] >= 0; i = Class120_Sub23.readBit() != 0 ? codewordMap[i] : i + 1) {
			/* empty */
		}
		return codewordMap[i] ^ 0xffffffff;
	}

	static final float float32unpack(final int x) {
		int mantissa = x & 0x1fffff;
		final int e = (x & 0x7fe00000) >> 21;
		if ((x & ~0x7fffffff) != 0) {
			mantissa = -mantissa;
		}
		return (float) (mantissa * Math.pow(2.0, e - 788));
	}

	CodeBook() {
		int version = Class120_Sub23.readBits(24);
		if (version != 0x564342) {
			throw new RuntimeException("The code book sync pattern is not correct.");
		}
		this.numDimensions = Class120_Sub23.readBits(16);
		numEntries = Class120_Sub23.readBits(24);
		codewordLength = new int[numEntries];
		final boolean ordered = Class120_Sub23.readBit() != 0;
		if (ordered) {
			int num1 = 0;
			int num2 = Class120_Sub23.readBits(5) + 1;
			while (num1 < numEntries) {
				final int num = Class120_Sub23.readBits(Class120_Sub23.bitsRequired(numEntries - num1));
				for (int id = 0; id < num; id++) {
					codewordLength[num1++] = num2;
				}
				num2++;
			}
		} else {
			final boolean sparse = Class120_Sub23.readBit() != 0;
			for (int i = 0; i < numEntries; i++) {
				if (sparse && Class120_Sub23.readBit() == 0) {
					codewordLength[i] = 0;
				} else {
					codewordLength[i] = Class120_Sub23.readBits(5) + 1;
				}
			}
		}
		prepareHuffman();
		final int codeBookLookupType = Class120_Sub23.readBits(4);
		if (codeBookLookupType > 0) {
			final float codeBookMinimumValue = float32unpack(Class120_Sub23.readBits(32));
			final float codeBookDeltaValue = float32unpack(Class120_Sub23.readBits(32));
			final int codeBookValueBits = Class120_Sub23.readBits(4) + 1;
			final boolean codeBookSequenceP = Class120_Sub23.readBit() != 0;
			int codeBookLookupValues;
			if (codeBookLookupType == 1) {
				codeBookLookupValues = lookup1Values(numEntries, this.numDimensions);
			} else {
				codeBookLookupValues = numEntries * this.numDimensions;
			}
			codeBookMultiplicands = new int[codeBookLookupValues];
			for (int id = 0; id < codeBookLookupValues; id++) {
				codeBookMultiplicands[id] = Class120_Sub23.readBits(codeBookValueBits);
			}
			valueVector = new float[numEntries][this.numDimensions];
			if (codeBookLookupType == 1) {
				for (int entry = 0; entry < numEntries; entry++) {
					float last = 0.0F;
					int indexDivisor = 1;
					for (int dimension = 0; dimension < this.numDimensions; dimension++) {
						final int multiplicandOffset = entry / indexDivisor % codeBookLookupValues;
						final float value = codeBookMultiplicands[multiplicandOffset] * codeBookDeltaValue + codeBookMinimumValue + last;
						valueVector[entry][dimension] = value;
						if (codeBookSequenceP) {
							last = value;
						}
						indexDivisor *= codeBookLookupValues;
					}
				}
			} else {
				for (int entry = 0; entry < numEntries; entry++) {
					float last = 0.0F;
					int multiplicandOffset = entry * this.numDimensions;
					for (int dimension = 0; dimension < this.numDimensions; dimension++) {
						final float value = codeBookMultiplicands[multiplicandOffset] * codeBookDeltaValue + codeBookMinimumValue + last;
						valueVector[entry][dimension] = value;
						if (codeBookSequenceP) {
							last = value;
						}
						multiplicandOffset++;
					}
				}
			}
		}
	}
}
