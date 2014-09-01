/* Class120_Sub12_Sub17 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class120_Sub12_Sub17 extends Class120_Sub12 {
	static int anInt3257;
	static js5 aClass50_3258;
	private int anInt3259;
	private int anInt3260;
	private int anInt3261;
	private int anInt3262 = 0;
	private int anInt3263;
	static int anInt3264;
	private int anInt3265 = 0;
	private int anInt3266;
	private int anInt3267;
	private int anInt3268 = 0;
	static float[] aFloatArray3269 = { 0.0F, 0.0F, 0.0F, 0.0F };

	static {
		anInt3264 = -1;
	}

	static final Class28 method1281(final int i, final int i_0_, final int i_1_) {
		final GroundTile class120_sub18 = LabelGroup.groundTiles[i][i_0_][i_1_];
		if (class120_sub18 == null) {
			return null;
		}
		for (int i_2_ = 0; i_2_ < class120_sub18.anInt2638; i_2_++) {
			final Class28 class28 = class120_sub18.aClass28Array2625[i_2_];
			if ((class28.bitPacked >> 29 & 0x3L) == 2L && class28.anInt180 == i_0_ && class28.anInt184 == i_1_) {
				Class120_Sub14_Sub10.method1499(class28);
				return class28;
			}
		}
		return null;
	}

	private final void method1282(int i, final int i_3_, final int i_4_, final byte i_5_) {
		while_170_: do {
			try {
				final int i_6_ = i_3_ > 2048 ? i_4_ + i_3_ + -(i_3_ * i_4_ >> 12) : i_3_ * (i_4_ + 4096) >> 12;
				if (i_6_ > 0) {
					final int i_7_ = -i_6_ + i_3_ + i_3_;
					final int i_8_ = (i_6_ + -i_7_ << 12) / i_6_;
					i *= 6;
					final int i_9_ = i >> 12;
					int i_10_ = i_6_;
					final int i_11_ = i + -(i_9_ << 12);
					i_10_ = i_8_ * i_10_ >> 12;
					i_10_ = i_10_ * i_11_ >> 12;
					final int i_12_ = i_6_ + -i_10_;
					final int i_13_ = i_7_ + i_10_;
					final int i_14_ = i_9_;
					while_169_: do {
						while_168_: do {
							while_167_: do {
								do {
									if (i_14_ != 0) {
										if (i_14_ != 1) {
											if (i_14_ != 2) {
												if (i_14_ != 3) {
													if (i_14_ != 4) {
														if (i_14_ != 5) {
															break while_170_;
														}
													} else {
														break while_168_;
													}
													break while_169_;
												}
											} else {
												break;
											}
											break while_167_;
										}
									} else {
										anInt3260 = i_13_;
										anInt3259 = i_6_;
										anInt3267 = i_7_;
										break while_170_;
									}
									anInt3260 = i_6_;
									anInt3259 = i_12_;
									anInt3267 = i_7_;
									break while_170_;
								} while (false);
								anInt3259 = i_7_;
								anInt3260 = i_6_;
								anInt3267 = i_13_;
								break while_170_;
							} while (false);
							anInt3259 = i_7_;
							anInt3260 = i_12_;
							anInt3267 = i_6_;
							break while_170_;
						} while (false);
						anInt3259 = i_13_;
						anInt3260 = i_7_;
						anInt3267 = i_6_;
						break while_170_;
					} while (false);
					anInt3260 = i_7_;
					anInt3259 = i_6_;
					anInt3267 = i_12_;
				} else {
					anInt3259 = anInt3260 = anInt3267 = i_3_;
				}
			} catch (final RuntimeException runtimeexception) {
				throw EnumType.method1428(runtimeexception, new StringBuilder("lj.R(").append(i).append(',').append(i_3_).append(',').append(i_4_).append(',').append(i_5_).append(')').toString());
			}
		} while (false);
	}

	/*
	 * 5 -> 8
	 * 3 -> 4
	 * 9 -> 16
	 */ 
	static final int getFarestBitValue(int i) {//Probably need new name for this, but it will do it job.
		i = --i | i >>> 1;
		i |= i >>> 2;
		i |= i >>> 4;
		i |= i >>> 8;
		i |= i >>> 16;
		return i + 1;
	}

	@Override
	final void decode(final Buffer buffer, final int i_18_) {
		while_171_: do {
			do {
				if (i_18_ != 0) {
					if (i_18_ != 1) {
						if (i_18_ == 2) {
							break;
						}
						break while_171_;
					}
				} else {
					anInt3265 = buffer.getShort();
					break while_171_;
				}
				anInt3268 = (buffer.getByte() << 12) / 100;
				break while_171_;
			} while (false);
			anInt3262 = (buffer.getByte() << 12) / 100;
		} while (false);
	}

	public Class120_Sub12_Sub17() {
		super(1, false);
	}

	private final void method1284(final int i, final int i_19_, final int i_20_, final int i_21_) {
		try {
			int i_22_ = i_19_ >= i_21_ ? i_19_ : i_21_;
			i_22_ = i_22_ < i ? i : i_22_;
			int i_23_ = i_21_ < i_19_ ? i_21_ : i_19_;
			i_23_ = i_23_ > i ? i : i_23_;
			anInt3263 = (i_22_ + i_23_) / 2;
			if (i_20_ != -2) {
				method1284(-23, 40, -83, -78);
			}
			final int i_24_ = -i_23_ + i_22_;
			if (i_24_ <= 0) {
				anInt3261 = 0;
			} else {
				final int i_25_ = (-i + i_22_ << 12) / i_24_;
				final int i_26_ = (-i_21_ + i_22_ << 12) / i_24_;
				final int i_27_ = (i_22_ - i_19_ << 12) / i_24_;
				if (i_22_ != i_21_) {
					if (i_22_ == i_19_) {
						anInt3261 = i != i_23_ ? 12288 + -i_25_ : 4096 + i_26_;
					} else {
						anInt3261 = i_23_ != i_21_ ? 20480 + -i_26_ : i_27_ + 12288;
					}
				} else {
					anInt3261 = i_19_ == i_23_ ? 20480 + i_25_ : -i_27_ + 4096;
				}
				anInt3261 /= 6;
			}
			if (anInt3263 <= 0 || anInt3263 >= 4096) {
				anInt3266 = 0;
			} else {
				anInt3266 = (i_24_ << 12) / (anInt3263 <= 2048 ? 2 * anInt3263 : 8192 + -(2 * anInt3263));
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("lj.W(").append(i).append(',').append(i_19_).append(',').append(i_20_).append(',').append(i_21_).append(')').toString());
		}
	}

	static final String method1285(final JagexInterface jagexInterface, final int i) {
		if (!client.getClickMask(jagexInterface).method1678(i) && jagexInterface.anObjectArray2006 == null) {
			return null;
		}
		if (jagexInterface.niActions == null || i >= jagexInterface.niActions.length || jagexInterface.niActions[i] == null || jagexInterface.niActions[i].trim().length() == 0) {
			if (Class120_Sub30_Sub1.aBoolean3673) {
				return "Hidden-" + i;
			}
			return null;
		}
		return jagexInterface.niActions[i];
	}

	@Override
	final int[][] method1188(final int i) {
		final int[][] is_30_ = this.aClass109_2559.method975(i);
		if (this.aClass109_2559.aBoolean1049) {
			final int[][] is_31_ = method1179(0, i);
			final int[] is_32_ = is_31_[0];
			final int[] is_33_ = is_31_[1];
			final int[] is_34_ = is_30_[0];
			final int[] is_35_ = is_31_[2];
			final int[] is_36_ = is_30_[1];
			final int[] is_37_ = is_30_[2];
			for (int i_38_ = 0; Class120_Sub12_Sub7.anInt3178 > i_38_; i_38_++) {
				method1284(is_35_[i_38_], is_33_[i_38_], -2, is_32_[i_38_]);
				anInt3263 += anInt3262;
				anInt3266 += anInt3268;
				if (anInt3266 < 0) {
					anInt3266 = 0;
				}
				anInt3261 += anInt3265;
				if (anInt3266 > 4096) {
					anInt3266 = 4096;
				}
				for (/**/; anInt3261 < 0; anInt3261 += 4096) {
					/* empty */
				}
				if (anInt3263 < 0) {
					anInt3263 = 0;
				}
				if (anInt3263 > 4096) {
					anInt3263 = 4096;
				}
				for (/**/; anInt3261 > 4096; anInt3261 -= 4096) {
					/* empty */
				}
				method1282(anInt3261, anInt3263, anInt3266, (byte) -100);
				is_34_[i_38_] = anInt3259;
				is_36_[i_38_] = anInt3260;
				is_37_[i_38_] = anInt3267;
			}
		}
		return is_30_;
	}

	public static void method1286(final int i) {
		try {
			aClass50_3258 = null;
			if (i != 12288) {
				anInt3257 = 47;
			}
			aFloatArray3269 = null;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("lj.U(").append(i).append(')').toString());
		}
	}

	static final void method1287(final js5 js5, final byte i) {
		try {
			if (i <= 107) {
				aFloatArray3269 = null;
			}
			Class153.aClass50_3373 = js5;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("lj.AA(").append(js5 != null ? "{...}" : "null").append(',').append(i).append(')').toString());
		}
	}
}
