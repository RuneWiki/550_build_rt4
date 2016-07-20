/* Class4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
//http://en.wikipedia.org/wiki/Duff%27s_device
//http://en.wikipedia.org/wiki/Quicksort
final class ArrayUtils {
	
	static final void fillArray(final short[] is, int i, int i_0_, final short i_1_) {
		i_0_ = i + i_0_ - 7;
		while (i < i_0_) {
			is[i++] = i_1_;
			is[i++] = i_1_;
			is[i++] = i_1_;
			is[i++] = i_1_;
			is[i++] = i_1_;
			is[i++] = i_1_;
			is[i++] = i_1_;
			is[i++] = i_1_;
		}
		i_0_ += 7;
		while (i < i_0_) {
			is[i++] = i_1_;
		}
	}

	static final void arrayCopy(final Object[] objects, int i, final Object[] objects_2_, int i_3_, int i_4_) {
		if (objects == objects_2_) {
			if (i == i_3_) {
				return;
			}
			if (i_3_ > i && i_3_ < i + i_4_) {
				i_4_--;
				i += i_4_;
				i_3_ += i_4_;
				i_4_ = i - i_4_;
				i_4_ += 7;
				while (i >= i_4_) {
					objects_2_[i_3_--] = objects[i--];
					objects_2_[i_3_--] = objects[i--];
					objects_2_[i_3_--] = objects[i--];
					objects_2_[i_3_--] = objects[i--];
					objects_2_[i_3_--] = objects[i--];
					objects_2_[i_3_--] = objects[i--];
					objects_2_[i_3_--] = objects[i--];
					objects_2_[i_3_--] = objects[i--];
				}
				i_4_ -= 7;
				while (i >= i_4_) {
					objects_2_[i_3_--] = objects[i--];
				}
				return;
			}
		}
		i_4_ += i;
		i_4_ -= 7;
		while (i < i_4_) {
			objects_2_[i_3_++] = objects[i++];
			objects_2_[i_3_++] = objects[i++];
			objects_2_[i_3_++] = objects[i++];
			objects_2_[i_3_++] = objects[i++];
			objects_2_[i_3_++] = objects[i++];
			objects_2_[i_3_++] = objects[i++];
			objects_2_[i_3_++] = objects[i++];
			objects_2_[i_3_++] = objects[i++];
		}
		i_4_ += 7;
		while (i < i_4_) {
			objects_2_[i_3_++] = objects[i++];
		}
	}

	static final void arrayCopy(final int[] is, int i, final int[] is_5_, int i_6_, int i_7_) {
		if (is == is_5_) {
			if (i == i_6_) {
				return;
			}
			if (i_6_ > i && i_6_ < i + i_7_) {
				i_7_--;
				i += i_7_;
				i_6_ += i_7_;
				i_7_ = i - i_7_;
				i_7_ += 7;
				while (i >= i_7_) {
					is_5_[i_6_--] = is[i--];
					is_5_[i_6_--] = is[i--];
					is_5_[i_6_--] = is[i--];
					is_5_[i_6_--] = is[i--];
					is_5_[i_6_--] = is[i--];
					is_5_[i_6_--] = is[i--];
					is_5_[i_6_--] = is[i--];
					is_5_[i_6_--] = is[i--];
				}
				i_7_ -= 7;
				while (i >= i_7_) {
					is_5_[i_6_--] = is[i--];
				}
				return;
			}
		}
		i_7_ += i;
		i_7_ -= 7;
		while (i < i_7_) {
			is_5_[i_6_++] = is[i++];
			is_5_[i_6_++] = is[i++];
			is_5_[i_6_++] = is[i++];
			is_5_[i_6_++] = is[i++];
			is_5_[i_6_++] = is[i++];
			is_5_[i_6_++] = is[i++];
			is_5_[i_6_++] = is[i++];
			is_5_[i_6_++] = is[i++];
		}
		i_7_ += 7;
		while (i < i_7_) {
			is_5_[i_6_++] = is[i++];
		}
	}

	static final void fillArray(final int[] is, int i, int i_8_, final int i_9_) {
		i_8_ = i + i_8_ - 7;
		while (i < i_8_) {
			is[i++] = i_9_;
			is[i++] = i_9_;
			is[i++] = i_9_;
			is[i++] = i_9_;
			is[i++] = i_9_;
			is[i++] = i_9_;
			is[i++] = i_9_;
			is[i++] = i_9_;
		}
		i_8_ += 7;
		while (i < i_8_) {
			is[i++] = i_9_;
		}
	}

	static final void resetArray(final int[] data, int off, int len) {
		len = off + len - 7;
		while (off < len) {
			data[off++] = 0;
			data[off++] = 0;
			data[off++] = 0;
			data[off++] = 0;
			data[off++] = 0;
			data[off++] = 0;
			data[off++] = 0;
			data[off++] = 0;
		}
		len += 7;
		while (off < len) {
			data[off++] = 0;
		}
	}

	static final void arrayCopy(final float[] fs, int i, final float[] fs_11_, int i_12_, int i_13_) {
		if (fs == fs_11_) {
			if (i == i_12_) {
				return;
			}
			if (i_12_ > i && i_12_ < i + i_13_) {
				i_13_--;
				i += i_13_;
				i_12_ += i_13_;
				i_13_ = i - i_13_;
				i_13_ += 7;
				while (i >= i_13_) {
					fs_11_[i_12_--] = fs[i--];
					fs_11_[i_12_--] = fs[i--];
					fs_11_[i_12_--] = fs[i--];
					fs_11_[i_12_--] = fs[i--];
					fs_11_[i_12_--] = fs[i--];
					fs_11_[i_12_--] = fs[i--];
					fs_11_[i_12_--] = fs[i--];
					fs_11_[i_12_--] = fs[i--];
				}
				i_13_ -= 7;
				while (i >= i_13_) {
					fs_11_[i_12_--] = fs[i--];
				}
				return;
			}
		}
		i_13_ += i;
		i_13_ -= 7;
		while (i < i_13_) {
			fs_11_[i_12_++] = fs[i++];
			fs_11_[i_12_++] = fs[i++];
			fs_11_[i_12_++] = fs[i++];
			fs_11_[i_12_++] = fs[i++];
			fs_11_[i_12_++] = fs[i++];
			fs_11_[i_12_++] = fs[i++];
			fs_11_[i_12_++] = fs[i++];
			fs_11_[i_12_++] = fs[i++];
		}
		i_13_ += 7;
		while (i < i_13_) {
			fs_11_[i_12_++] = fs[i++];
		}
	}

	static final void arrayCopy(final short[] is, int i, final short[] is_14_, int i_15_, int i_16_) {
		if (is == is_14_) {
			if (i == i_15_) {
				return;
			}
			if (i_15_ > i && i_15_ < i + i_16_) {
				i_16_--;
				i += i_16_;
				i_15_ += i_16_;
				i_16_ = i - i_16_;
				i_16_ += 7;
				while (i >= i_16_) {
					is_14_[i_15_--] = is[i--];
					is_14_[i_15_--] = is[i--];
					is_14_[i_15_--] = is[i--];
					is_14_[i_15_--] = is[i--];
					is_14_[i_15_--] = is[i--];
					is_14_[i_15_--] = is[i--];
					is_14_[i_15_--] = is[i--];
					is_14_[i_15_--] = is[i--];
				}
				i_16_ -= 7;
				while (i >= i_16_) {
					is_14_[i_15_--] = is[i--];
				}
				return;
			}
		}
		i_16_ += i;
		i_16_ -= 7;
		while (i < i_16_) {
			is_14_[i_15_++] = is[i++];
			is_14_[i_15_++] = is[i++];
			is_14_[i_15_++] = is[i++];
			is_14_[i_15_++] = is[i++];
			is_14_[i_15_++] = is[i++];
			is_14_[i_15_++] = is[i++];
			is_14_[i_15_++] = is[i++];
			is_14_[i_15_++] = is[i++];
		}
		i_16_ += 7;
		while (i < i_16_) {
			is_14_[i_15_++] = is[i++];
		}
	}

	static final void arrayCopy(final long[] ls, int i, final long[] ls_17_, int i_18_, int i_19_) {
		if (ls == ls_17_) {
			if (i == i_18_) {
				return;
			}
			if (i_18_ > i && i_18_ < i + i_19_) {
				i_19_--;
				i += i_19_;
				i_18_ += i_19_;
				i_19_ = i - i_19_;
				i_19_ += 3;
				while (i >= i_19_) {
					ls_17_[i_18_--] = ls[i--];
					ls_17_[i_18_--] = ls[i--];
					ls_17_[i_18_--] = ls[i--];
					ls_17_[i_18_--] = ls[i--];
				}
				i_19_ -= 3;
				while (i >= i_19_) {
					ls_17_[i_18_--] = ls[i--];
				}
				return;
			}
		}
		i_19_ += i;
		i_19_ -= 3;
		while (i < i_19_) {
			ls_17_[i_18_++] = ls[i++];
			ls_17_[i_18_++] = ls[i++];
			ls_17_[i_18_++] = ls[i++];
			ls_17_[i_18_++] = ls[i++];
		}
		i_19_ += 3;
		while (i < i_19_) {
			ls_17_[i_18_++] = ls[i++];
		}
	}

	static final void arrayCopy(final byte[] is, int i, final byte[] is_20_, int i_21_, int i_22_) {
		if (is == is_20_) {
			if (i == i_21_) {
				return;
			}
			if (i_21_ > i && i_21_ < i + i_22_) {
				i_22_--;
				i += i_22_;
				i_21_ += i_22_;
				i_22_ = i - i_22_;
				i_22_ += 7;
				while (i >= i_22_) {
					is_20_[i_21_--] = is[i--];
					is_20_[i_21_--] = is[i--];
					is_20_[i_21_--] = is[i--];
					is_20_[i_21_--] = is[i--];
					is_20_[i_21_--] = is[i--];
					is_20_[i_21_--] = is[i--];
					is_20_[i_21_--] = is[i--];
					is_20_[i_21_--] = is[i--];
				}
				i_22_ -= 7;
				while (i >= i_22_) {
					is_20_[i_21_--] = is[i--];
				}
				return;
			}
		}
		i_22_ += i;
		i_22_ -= 7;
		while (i < i_22_) {
			is_20_[i_21_++] = is[i++];
			is_20_[i_21_++] = is[i++];
			is_20_[i_21_++] = is[i++];
			is_20_[i_21_++] = is[i++];
			is_20_[i_21_++] = is[i++];
			is_20_[i_21_++] = is[i++];
			is_20_[i_21_++] = is[i++];
			is_20_[i_21_++] = is[i++];
		}
		i_22_ += 7;
		while (i < i_22_) {
			is_20_[i_21_++] = is[i++];
		}
	}

	static final float[] arrayCopy(final float[] fs) {
		if (fs == null) {
			return null;
		}
		final float[] fs_3_ = new float[fs.length];
		arrayCopy(fs, 0, fs_3_, 0, fs.length);
		return fs_3_;
	}

	static final int[] arrayCopy(final int[] is) {
		if (is == null) {
			return null;
		}
		final int[] is_10_ = new int[is.length];
		arrayCopy(is, 0, is_10_, 0, is.length);
		return is_10_;
	}

	static final byte[] arrayCopy(final byte[] is) {
		if (is == null) {
			return null;
		}
		final byte[] is_10_ = new byte[is.length];
		arrayCopy(is, 0, is_10_, 0, is.length);
		return is_10_;
	}

	static final void quicksort(final int[] is, final Object[] objects) {
		ArrayUtils.quicksort(is.length - 1, objects, 0, is);
	}

	static final void quicksort(final int len, final Object[] objects, final int off, final int[] is) {
		if (len > off) {
			final int i_5_ = (off + len) / 2;
			final int i_7_ = is[i_5_];
			final Object object = objects[i_5_];
			is[i_5_] = is[len];
			is[len] = i_7_;
			objects[i_5_] = objects[len];
			objects[len] = object;
			int i_6_ = off;
			for (int i_8_ = off; i_8_ < len; i_8_++) {
				if (is[i_8_] < i_7_ + (i_8_ & 0x1)) {
					final int i_9_ = is[i_8_];
					is[i_8_] = is[i_6_];
					is[i_6_] = i_9_;
					final Object object_10_ = objects[i_8_];
					objects[i_8_] = objects[i_6_];
					objects[i_6_++] = object_10_;
				}
			}
			is[len] = is[i_6_];
			is[i_6_] = i_7_;
			objects[len] = objects[i_6_];
			objects[i_6_] = object;
			quicksort(i_6_ - 1, objects, off, is);
			quicksort(len, objects, 1 + i_6_, is);
		}
	}

	static final void quicksort(final int i_50_, final long[] ls, final int i_51_, final int[] is) {
		if (i_50_ > i_51_) {
			final int i_52_ = (i_50_ + i_51_) / 2;
			int i_53_ = i_51_;
			final long l = ls[i_52_];
			ls[i_52_] = ls[i_50_];
			ls[i_50_] = l;
			final int i_54_ = is[i_52_];
			is[i_52_] = is[i_50_];
			is[i_50_] = i_54_;
			for (int i_55_ = i_51_; i_55_ < i_50_; i_55_++) {
				if (ls[i_55_] < (i_55_ & 0x1) + l) {
					final long l_56_ = ls[i_55_];
					ls[i_55_] = ls[i_53_];
					ls[i_53_] = l_56_;
					final int i_57_ = is[i_55_];
					is[i_55_] = is[i_53_];
					is[i_53_++] = i_57_;
				}
			}
			ls[i_50_] = ls[i_53_];
			ls[i_53_] = l;
			is[i_50_] = is[i_53_];
			is[i_53_] = i_54_;
			quicksort(i_53_ - 1, ls, i_51_, is);
			quicksort(i_50_, ls, i_53_ - -1, is);
		}
	}

	static final void quicksort(final int[] is, final long[] ls) {
		quicksort(ls.length - 1, ls, 0, is);
	}

	static final void quicksort(final long[] ls, final int i_3_, final int i_4_, final Object[] objects) {
		if (i_4_ < i_3_) {
			final int i_5_ = (i_3_ + i_4_) / 2;
			int i_6_ = i_4_;
			final long l = ls[i_5_];
			ls[i_5_] = ls[i_3_];
			ls[i_3_] = l;
			final Object object = objects[i_5_];
			objects[i_5_] = objects[i_3_];
			objects[i_3_] = object;
			for (int i_7_ = i_4_; i_3_ > i_7_; i_7_++) {
				if ((ls[i_7_] ^ 0xffffffffffffffffL) > ((0x1 & i_7_) + l ^ 0xffffffffffffffffL)) {
					final long l_8_ = ls[i_7_];
					ls[i_7_] = ls[i_6_];
					ls[i_6_] = l_8_;
					final Object object_9_ = objects[i_7_];
					objects[i_7_] = objects[i_6_];
					objects[i_6_++] = object_9_;
				}
			}
			ls[i_3_] = ls[i_6_];
			ls[i_6_] = l;
			objects[i_3_] = objects[i_6_];
			objects[i_6_] = object;
			quicksort(ls, i_6_ - 1, i_4_, objects);
			quicksort(ls, i_3_, i_6_ + 1, objects);
		}
	}

	static final void quicksort(final Object[] objects, final long[] ls) {
		quicksort(ls, ls.length - 1, 0, objects);
	}

	static final void quicksort(final String[] strings, final short[] is) {
		ArrayUtils.quicksort(strings, strings.length - 1, is, 0);
	}

	static final void quicksort(final String[] strings, final int i, final short[] is, final int i_0_) {
		if (i > i_0_) {
			final int i_1_ = (i_0_ - -i) / 2;
			int i_2_ = i_0_;
			final String string = strings[i_1_];
			strings[i_1_] = strings[i];
			strings[i] = string;
			final short i_3_ = is[i_1_];
			is[i_1_] = is[i];
			is[i] = i_3_;
			for (int i_4_ = i_0_; i > i_4_; i_4_++) {
				if (string == null || strings[i_4_] != null && strings[i_4_].compareTo(string) < (0x1 & i_4_)) {
					final String string_5_ = strings[i_4_];
					strings[i_4_] = strings[i_2_];
					strings[i_2_] = string_5_;
					final short i_6_ = is[i_4_];
					is[i_4_] = is[i_2_];
					is[i_2_++] = i_6_;
				}
			}
			strings[i] = strings[i_2_];
			strings[i_2_] = string;
			is[i] = is[i_2_];
			is[i_2_] = i_3_;
			quicksort(strings, i_2_ - 1, is, i_0_);
			quicksort(strings, i, is, i_2_ + 1);
		}
	}
}
