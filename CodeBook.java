/* Class129 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class CodeBook {
	private final int entries;
	private int[] codeBookMultiplicands;
	private float[][] valueVector;
	private final int[] entryLengths;
	int dimensions;
	private int[] anIntArray1235;

	final float[] method1910() {
		return valueVector[getHuffmanRoot()];
	}

	private static final int lookup1Values(final int a, final int b) {
		int res;
		for (res = (int) Math.pow(a, 1.0 / b) + 1; Class120_Sub23.intPow(b, res) > a; res--) {
			/* empty */
		}
		return res;
	}

	private final void createHuffmanTree() {
		final int[] is = new int[entries];
		final int[] is_2_ = new int[33];
		for (int i = 0; i < entries; i++) {
			final int i_3_ = entryLengths[i];
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
		anIntArray1235 = new int[8];
		int i = 0;
		for (int i_12_ = 0; i_12_ < entries; i_12_++) {
			final int i_13_ = entryLengths[i_12_];
			if (i_13_ != 0) {
				final int i_14_ = is[i_12_];
				int i_15_ = 0;
				for (int i_16_ = 0; i_16_ < i_13_; i_16_++) {
					int i_17_ = -2147483648 >>> i_16_;
					if ((i_14_ & i_17_) != 0) {
						if (anIntArray1235[i_15_] == 0) {
							anIntArray1235[i_15_] = i;
						}
						i_15_ = anIntArray1235[i_15_];
					} else {
						i_15_++;
					}
					if (i_15_ >= anIntArray1235.length) {
						final int[] is_18_ = new int[anIntArray1235.length * 2];
						for (int i_19_ = 0; i_19_ < anIntArray1235.length; i_19_++) {
							is_18_[i_19_] = anIntArray1235[i_19_];
						}
						anIntArray1235 = is_18_;
					}
					i_17_ >>>= 1;
				}
				anIntArray1235[i_15_] = i_12_ ^ 0xffffffff;
				if (i_15_ >= i) {
					i = i_15_ + 1;
				}
			}
		}
	}

	final int getHuffmanRoot() {//prob wrong
		int i;
		for (i = 0; anIntArray1235[i] >= 0; i = Class120_Sub23.getBit() != 0 ? anIntArray1235[i] : i + 1) {
			/* empty */
		}
		return anIntArray1235[i] ^ 0xffffffff;
	}

	CodeBook() {
		int version = Class120_Sub23.getInt(24);
		if (version != 0x564342) {
			throw new RuntimeException("The code book sync pattern is not correct.");
		}
		this.dimensions = Class120_Sub23.getInt(16);
		entries = Class120_Sub23.getInt(24);
		entryLengths = new int[entries];
		final boolean ordered = Class120_Sub23.getBit() != 0;
		if (ordered) {
			int i = 0;
			int cl = Class120_Sub23.getInt(5) + 1;
			while (i < entries) {
				final int num = Class120_Sub23.getInt(Class120_Sub23.ilog(entries - i));
				for (int id = 0; id < num; id++) {
					entryLengths[i++] = cl;
				}
				cl++;
			}
		} else {
			final boolean sparse = Class120_Sub23.getBit() != 0;
			for (int i = 0; i < entries; i++) {
				if (sparse && Class120_Sub23.getBit() == 0) {
					entryLengths[i] = 0;
				} else {
					entryLengths[i] = Class120_Sub23.getInt(5) + 1;
				}
			}
		}
		createHuffmanTree();
		final int codeBookLookupType = Class120_Sub23.getInt(4);
		if (codeBookLookupType > 0) {
			final float codeBookMinimumValue = Class120_Sub23.float32unpack(Class120_Sub23.getInt(32));
			final float codeBookDeltaValue = Class120_Sub23.float32unpack(Class120_Sub23.getInt(32));
			final int codeBookValueBits = Class120_Sub23.getInt(4) + 1;
			final boolean codeBookSequenceP = Class120_Sub23.getBit() != 0;
			int codeBookLookupValues;
			if (codeBookLookupType == 1) {
				codeBookLookupValues = lookup1Values(entries, this.dimensions);
			} else {
				codeBookLookupValues = entries * this.dimensions;
			}
			codeBookMultiplicands = new int[codeBookLookupValues];
			for (int id = 0; id < codeBookLookupValues; id++) {
				codeBookMultiplicands[id] = Class120_Sub23.getInt(codeBookValueBits);
			}
			valueVector = new float[entries][this.dimensions];
			if (codeBookLookupType == 1) {
				for (int entry = 0; entry < entries; entry++) {
					float last = 0.0F;
					int indexDivisor = 1;
					for (int dimension = 0; dimension < this.dimensions; dimension++) {
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
				for (int entry = 0; entry < entries; entry++) {
					float last = 0.0F;
					int multiplicandOffset = entry * this.dimensions;
					for (int dimension = 0; dimension < this.dimensions; dimension++) {
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
