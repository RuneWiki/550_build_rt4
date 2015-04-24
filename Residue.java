/* Class155 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Residue {
	private final int[] books;
	private final int partitionSize;
	private final int end;
	private final int classBook;
	private final int type = Class120_Sub23.getInt(16);
	private final int classifications;
	private final int begin = Class120_Sub23.getInt(24);

	final void decodeResidue(final float[] a, final int i, final boolean bool) {
		for (int i_0_ = 0; i_0_ < i; i_0_++) {
			a[i_0_] = 0.0F;
		}
		if (!bool) {
			final int classvalsPerCodeword = Class120_Sub23.codeBooks[classBook].dimensions;
			final int nToRead = end - begin;
			final int partitionsToRead = nToRead / partitionSize;
			final int[] is = new int[partitionsToRead];
			for (int i_4_ = 0; i_4_ < 8; i_4_++) {
				int i_5_ = 0;
				while (i_5_ < partitionsToRead) {
					if (i_4_ == 0) {
						int i_6_ = Class120_Sub23.codeBooks[classBook].getHuffmanRoot();
						for (int i_7_ = classvalsPerCodeword - 1; i_7_ >= 0; i_7_--) {
							if (i_5_ + i_7_ < partitionsToRead) {
								is[i_5_ + i_7_] = i_6_ % classifications;
							}
							i_6_ /= classifications;
						}
					}
					for (int i_8_ = 0; i_8_ < classvalsPerCodeword; i_8_++) {
						final int i_9_ = is[i_5_];
						final int i_10_ = books[i_9_ * 8 + i_4_];
						if (i_10_ >= 0) {
							final int i_11_ = begin + i_5_ * partitionSize;
							final CodeBook class129 = Class120_Sub23.codeBooks[i_10_];
							if (type == 0) {
								final int i_12_ = partitionSize / class129.dimensions;
								for (int i_13_ = 0; i_13_ < i_12_; i_13_++) {
									final float[] ve = class129.method1910();
									for (int dimension = 0; dimension < class129.dimensions; dimension++) {
										a[i_11_ + i_13_ + dimension * i_12_] += ve[dimension];
									}
								}
							} else {
								int i_16_ = 0;
								while (i_16_ < partitionSize) {
									final float[] fs_17_ = class129.method1910();
									for (int i_18_ = 0; i_18_ < class129.dimensions; i_18_++) {
										a[i_11_ + i_16_] += fs_17_[i_18_];
										i_16_++;
									}
								}
							}
						}
						if (++i_5_ >= partitionsToRead) {
							break;
						}
					}
				}
			}
		}
	}

	Residue() {
		end = Class120_Sub23.getInt(24);
		partitionSize = Class120_Sub23.getInt(24) + 1;
		classifications = Class120_Sub23.getInt(6) + 1;
		classBook = Class120_Sub23.getInt(8);
		final int[] cascade = new int[classifications];
		for (int id = 0; id < classifications; id++) {
			int highBits = 0;
			final int lowBits = Class120_Sub23.getInt(3);
			final boolean hasHighBit = Class120_Sub23.getBit() != 0;
			if (hasHighBit) {
				highBits = Class120_Sub23.getInt(5);
			}
			cascade[id] = highBits << 3 | lowBits;
		}
		books = new int[classifications * 8];
		for (int id = 0; id < classifications * 8; id++) {
			books[id] = (cascade[id >> 3] & 1 << (id & 0x7)) != 0 ? Class120_Sub23.getInt(8) : -1;
		}
	}
}
