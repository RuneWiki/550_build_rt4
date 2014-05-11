/* Class29 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class29 {
	int anInt187;
	int anInt188 = -1;
	int anInt189;
	int anInt190;
	int anInt191;
	int anInt192;
	int anInt193;
	int anInt194 = -1;
	static int anInt195 = 0;
	static String aString196;
	int anInt197 = 0;
	int anInt198 = -1;
	static int[] anIntArray199 = { 4, 4, 1, 2, 6, 4, 2, 48, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
	int anInt200;
	int anInt201;
	int anInt202;
	int anInt203;
	int anInt204;
	int anInt205;
	int anInt206;
	int anInt207;
	int anInt208;
	int anInt209 = 0;
	int anInt210;
	int anInt211;
	int anInt212;
	int anInt213;
	int anInt214;
	int[][] anIntArrayArray215;
	int anInt216;
	static String aString217;
	int anInt218;
	int anInt219;
	int anInt220;
	int anInt221;
	int anInt222;
	int anInt223;

	static {
		aString196 = " ";
		aString217 = "Loading title screen - ";
	}

	final void method248(final Buffer class120_sub7, final byte i) {
		try {
			if (i != 70) {
				method248(null, (byte) 79);
			}
			for (;;) {
				final int i_0_ = class120_sub7.getUByte();
				if (i_0_ == 0) {
					break;
				}
				method252(61, i_0_, class120_sub7);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("d.H(").append(class120_sub7 != null ? "{...}" : "null").append(',').append(i).append(')').toString());
		}
	}

	static final String[] method249(final int i, final char c, final String string) {
		String[] strings;
		try {
			final int i_1_ = Class8.method110(c, string, false);
			final String[] strings_2_ = new String[i_1_ + 1];
			int i_3_ = i;
			int i_4_ = 0;
			for (int i_5_ = 0; i_1_ > i_5_; i_5_++) {
				int i_6_;
				for (i_6_ = i_4_; c != string.charAt(i_6_); i_6_++) {
					/* empty */
				}
				strings_2_[i_3_++] = string.substring(i_4_, i_6_);
				i_4_ = i_6_ - -1;
			}
			strings_2_[i_1_] = string.substring(i_4_);
			strings = strings_2_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("d.F(").append(i).append(',').append(c).append(',').append(string != null ? "{...}" : "null").append(')').toString());
		}
		return strings;
	}

	static final void method250(final int i, final int i_7_, final int i_8_) {
		try {
			final InterfaceChangeNode class120_sub14_sub7 = Class120_Sub14_Sub3.putInterfaceChange(12, i);
			if (i_8_ != 6703) {
				anInt195 = -25;
			}
			class120_sub14_sub7.method1454((byte) -104);
			class120_sub14_sub7.anInt3484 = i_7_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("d.E(").append(i).append(',').append(i_7_).append(',').append(i_8_).append(')').toString());
		}
	}

	static final float[] method251(final int i) {
		float[] fs;
		try {
			if (i < 51) {
				return null;
			}
			final float f = Class117.method1012() + Class117.method1015();
			final int i_9_ = Class117.method1017();
			final float f_10_ = (0xff & i_9_ >> 16) / 255.0F;
			NodeSub.aFloatArray2583[3] = 1.0F;
			final float f_11_ = (0xff & i_9_ >> 8) / 255.0F;
			final float f_13_ = (i_9_ & 0xff) / 255.0F;
			NodeSub.aFloatArray2583[2] = 0.58823526F * (Class120_Sub15.aFloatArray2596[2] * f_13_) * f;
			NodeSub.aFloatArray2583[1] = f * (0.58823526F * (Class120_Sub15.aFloatArray2596[1] * f_11_));
			NodeSub.aFloatArray2583[0] = Class120_Sub15.aFloatArray2596[0] * f_10_ * 0.58823526F * f;
			fs = NodeSub.aFloatArray2583;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("d.C(").append(i).append(')').toString());
		}
		return fs;
	}

	private final void method252(final int i, final int i_14_, final Buffer class120_sub7) {
		try {
			if (i_14_ == 1) {
				this.anInt218 = class120_sub7.getUShort();
				this.anInt205 = class120_sub7.getUShort();
				if (this.anInt218 == 65535) {
					this.anInt218 = -1;
				}
				if ((this.anInt205 ^ 0xffffffff) == -65536) {
					this.anInt205 = -1;
				}
			} else if (i_14_ == 2) {
				this.anInt212 = class120_sub7.getUShort();
			} else if (i_14_ == 3) {
				this.anInt192 = class120_sub7.getUShort();
			} else if (i_14_ == 4) {
				this.anInt210 = class120_sub7.getUShort();
			} else if (i_14_ != 5) {
				if (i_14_ == 6) {
					this.anInt190 = class120_sub7.getUShort();
				} else if (i_14_ == 7) {
					this.anInt188 = class120_sub7.getUShort();
				} else if (i_14_ == 8) {
					this.anInt223 = class120_sub7.getUShort();
				} else if (i_14_ == 9) {
					this.anInt216 = class120_sub7.getUShort();
				} else if (i_14_ != 26) {
					if (i_14_ == 27) {
						if (this.anIntArrayArray215 == null) {
							this.anIntArrayArray215 = new int[12][];
						}
						final int i_15_ = class120_sub7.getUByte();
						this.anIntArrayArray215[i_15_] = new int[6];
						for (int i_16_ = 0; i_16_ < 6; i_16_++) {
							this.anIntArrayArray215[i_15_][i_16_] = class120_sub7.method1078(true);
						}
					} else if (i_14_ == 29) {
						this.anInt189 = class120_sub7.getUByte();
					} else if (i_14_ == 30) {
						this.anInt220 = class120_sub7.getUShort();
					} else if (i_14_ == 31) {
						this.anInt214 = class120_sub7.getUByte();
					} else if (i_14_ == 32) {
						this.anInt197 = class120_sub7.getUShort();
					} else if (i_14_ != 33) {
						if (i_14_ == 34) {
							this.anInt221 = class120_sub7.getUByte();
						} else if (i_14_ == 35) {
							this.anInt207 = class120_sub7.getUShort();
						} else if (i_14_ == 36) {
							this.anInt209 = class120_sub7.method1078(true);
						} else if (i_14_ != 37) {
							if (i_14_ != 38) {
								if (i_14_ == 39) {
									this.anInt191 = class120_sub7.getUShort();
								} else if (i_14_ == 40) {
									this.anInt187 = class120_sub7.getUShort();
								} else if (i_14_ == 41) {
									this.anInt213 = class120_sub7.getUShort();
								} else if (i_14_ != 42) {
									if (i_14_ != 43) {
										if (i_14_ == 44) {
											class120_sub7.getUShort();
										} else if (i_14_ != 45) {
											if (i_14_ == 46) {
												this.anInt203 = class120_sub7.getUShort();
											} else if (i_14_ != 47) {
												if (i_14_ != 48) {
													if (i_14_ == 49) {
														this.anInt211 = class120_sub7.getUShort();
													} else if (i_14_ != 50) {
														if (i_14_ == 51) {
															this.anInt222 = class120_sub7.getUShort();
														}
													} else {
														this.anInt202 = class120_sub7.getUShort();
													}
												} else {
													this.anInt194 = class120_sub7.getUShort();
												}
											} else {
												this.anInt198 = class120_sub7.getUShort();
											}
										} else {
											class120_sub7.getUShort();
										}
									} else {
										class120_sub7.getUShort();
									}
								} else {
									this.anInt200 = class120_sub7.getUShort();
								}
							} else {
								this.anInt193 = class120_sub7.getUShort();
							}
						} else {
							this.anInt201 = class120_sub7.getUByte();
						}
					} else {
						this.anInt208 = class120_sub7.method1078(true);
					}
				} else {
					this.anInt204 = (short) (4 * class120_sub7.getUByte());
					this.anInt206 = (short) (class120_sub7.getUByte() * 4);
				}
			} else {
				this.anInt219 = class120_sub7.getUShort();
			}
			if (i < 40) {
				this.anInt200 = -18;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("d.I(").append(i).append(',').append(i_14_).append(',').append(class120_sub7 != null ? "{...}" : "null").append(')').toString());
		}
	}

	final void method253(final int i) {
		try {
			if (i <= 39) {
				method254((byte) 116, -103, 114, 57);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("d.B(").append(i).append(')').toString());
		}
	}

	static final void method254(final byte i, final int i_17_, final int i_18_, final int i_19_) {
		try {
			if (i <= -87) {
				final InterfaceChangeNode class120_sub14_sub7 = Class120_Sub14_Sub3.putInterfaceChange(11, i_17_);
				class120_sub14_sub7.method1454((byte) -100);
				class120_sub14_sub7.anInt3484 = i_18_;
				class120_sub14_sub7.anInt3492 = i_19_;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("d.D(").append(i).append(',').append(i_17_).append(',').append(i_18_).append(',').append(i_19_).append(')').toString());
		}
	}

	static final long method255(final int i) {
		long l;
		try {
			if (i != 30542) {
				anIntArray199 = null;
			}
			l = Class101_Sub2.gameShellTimer.method739(0);
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("d.G(").append(i).append(')').toString());
		}
		return l;
	}

	public static void method256(final byte i) {
		try {
			if (i == -63) {
				anIntArray199 = null;
				aString217 = null;
				aString196 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("d.A(").append(i).append(')').toString());
		}
	}

	public Class29() {
		this.anInt203 = -1;
		this.anInt211 = -1;
		this.anInt212 = -1;
		this.anInt201 = -1;
		this.anInt204 = 0;
		this.anInt213 = -1;
		this.anInt189 = 0;
		this.anInt207 = 0;
		this.anInt202 = -1;
		this.anInt205 = -1;
		this.anInt206 = 0;
		this.anInt210 = -1;
		this.anInt187 = -1;
		this.anInt208 = 0;
		this.anInt192 = -1;
		this.anInt200 = -1;
		this.anInt216 = -1;
		this.anInt219 = -1;
		this.anInt218 = -1;
		this.anInt222 = -1;
		this.anInt191 = -1;
		this.anInt193 = -1;
		this.anInt190 = -1;
		this.anInt214 = 0;
		this.anInt220 = 0;
		this.anInt223 = -1;
		this.anInt221 = 0;
	}
}
