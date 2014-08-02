/* Class4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

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
}
