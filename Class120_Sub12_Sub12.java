/* Class120_Sub12_Sub12 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class120_Sub12_Sub12 extends Class120_Sub12 {
	static int anInt3217 = 0;
	private short[] aShortArray3218;
	private byte[] aByteArray3219 = new byte[512];
	static int[] anIntArray3220;
	int anInt3221;
	int anInt3222;
	static boolean[] aBooleanArray3223 = new boolean[5];
	private short[] aShortArray3224;
	int anInt3225;
	boolean aBoolean3226 = true;
	static int lastFullscreenHeight;
	int anInt3228;
	int anInt3229;

	static {
		anIntArray3220 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };
		lastFullscreenHeight = 0;
	}

	static final void method1256(final byte i) {
		try {
			Class120_Sub12_Sub31.aClass21_3378.clearSoftReference();
			if (i > -83) {
				method1258(true, -88, -44, -12, 106);
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("jj.S(").append(i).append(')').toString());
		}
	}

	private final void method1257(final byte i) {
		try {
			if (this.anInt3221 <= 0) {
				if (aShortArray3218 != null && aShortArray3218.length == this.anInt3228) {
					aShortArray3224 = new short[this.anInt3228];
					for (int i_0_ = 0; i_0_ < this.anInt3228; i_0_++) {
						aShortArray3224[i_0_] = (short) (int) Math.pow(2.0, i_0_);
					}
				}
			} else {
				aShortArray3224 = new short[this.anInt3228];
				aShortArray3218 = new short[this.anInt3228];
				for (int i_1_ = 0; i_1_ < this.anInt3228; i_1_++) {
					aShortArray3218[i_1_] = (short) (int) (Math.pow(this.anInt3221 / 4096.0F, i_1_) * 4096.0);
					aShortArray3224[i_1_] = (short) (int) Math.pow(2.0, i_1_);
				}
			}
			if (i <= 34) {
				method1187(-79);
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("jj.U(").append(i).append(')').toString());
		}
	}

	@Override
	final void method1180(final byte i, final Buffer class120_sub7, final int i_2_) {
		while_208_: do {
			try {
				if (i == -43) {
					int i_3_ = i_2_;
					while_207_: do {
						while_206_: do {
							while_205_: do {
								while_204_: do {
									do {
										if (i_3_ != 0) {
											if (i_3_ != 1) {
												if (i_3_ != 2) {
													if (i_3_ != 3) {
														if (i_3_ != 4) {
															if (i_3_ != 5) {
																if (i_3_ == 6) {
																	break while_207_;
																}
																break while_208_;
															}
														} else {
															break while_205_;
														}
														break while_206_;
													}
												} else {
													break;
												}
												break while_204_;
											}
										} else {
											this.aBoolean3226 = class120_sub7.getUByte() == 1;
											break while_208_;
										}
										this.anInt3228 = class120_sub7.getUByte();
										break while_208_;
									} while (false);
									this.anInt3221 = class120_sub7.getShort();
									if (this.anInt3221 < 0) {
										aShortArray3218 = new short[this.anInt3228];
										for (i_3_ = 0; this.anInt3228 > i_3_; i_3_++) {
											aShortArray3218[i_3_] = (short) class120_sub7.getShort();
										}
									}
									break while_208_;
								} while (false);
								this.anInt3229 = this.anInt3225 = class120_sub7.getUByte();
								break while_208_;
							} while (false);
							this.anInt3222 = class120_sub7.getUByte();
							break while_208_;
						} while (false);
						this.anInt3229 = class120_sub7.getUByte();
						break while_208_;
					} while (false);
					this.anInt3225 = class120_sub7.getUByte();
				}
			} catch (final RuntimeException runtimeexception) {
				throw EnumType.method1428(runtimeexception, new StringBuilder("jj.M(").append(i).append(',').append(class120_sub7 != null ? "{...}" : "null").append(',').append(i_2_).append(')').toString());
			}
		} while (false);
	}

	static final void method1258(final boolean bool, final int i, final int i_4_, final int i_5_, final int i_6_) {
		try {
			if (i != -6090) {
				method1258(false, -114, 21, 64, -40);
			}
			if (js5.loadInterface(i_5_)) {
				WorldInfo.method2065(Node.interfaceCache[i_5_], bool, i_4_, -1, i_6_, -105);
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("jj.AA(").append(bool).append(',').append(i).append(',').append(i_4_).append(',').append(i_5_).append(',').append(i_6_).append(')').toString());
		}
	}

	private final int method1259(int i, final int i_7_, final int i_8_, final int i_9_, final int i_10_, final int i_11_, final int i_12_) {
		int i_13_;
		try {
			final int i_14_ = i_12_ + -4096;
			int i_15_ = i >> 12;
			i &= 0xfff;
			int i_16_ = 1 + i_15_;
			i_15_ &= 0xff;
			if (i_16_ >= i_11_) {
				i_16_ = 0;
			}
			final int i_17_ = -4096 + i;
			i_16_ &= 0xff;
			int i_18_ = aByteArray3219[i_10_ + i_15_] & 0x3;
			int i_19_;
			if (i_18_ <= 1) {
				i_19_ = i_18_ != 0 ? -i + i_12_ : i_12_ + i;
			} else {
				i_19_ = i_18_ != 2 ? -i_12_ + -i : -i_12_ + i;
			}
			i_18_ = aByteArray3219[i_10_ + i_16_] & 0x3;
			final int i_20_ = Class30.anIntArray224[i];
			int i_21_;
			if (i_18_ > 1) {
				i_21_ = i_18_ == 2 ? -i_12_ + i_17_ : -i_17_ + -i_12_;
			} else {
				i_21_ = i_18_ == 0 ? i_12_ + i_17_ : i_12_ - i_17_;
			}
			i_18_ = 0x3 & aByteArray3219[i_15_ - -i_7_];
			final int i_22_ = i_19_ - -(i_20_ * (i_21_ + -i_19_) >> 12);
			if (i_18_ > i_8_) {
				i_19_ = i_18_ == 2 ? i + -i_14_ : -i - i_14_;
			} else {
				i_19_ = i_18_ == 0 ? i_14_ + i : -i + i_14_;
			}
			i_18_ = aByteArray3219[i_7_ + i_16_] & 0x3;
			if (i_18_ <= 1) {
				i_21_ = i_18_ == 0 ? i_14_ + i_17_ : -i_17_ + i_14_;
			} else {
				i_21_ = i_18_ == 2 ? i_17_ + -i_14_ : -i_14_ + -i_17_;
			}
			final int i_23_ = i_19_ + ((i_21_ - i_19_) * i_20_ >> 12);
			i_13_ = i_22_ - -((-i_22_ + i_23_) * i_9_ >> 12);
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("jj.R(").append(i).append(',').append(i_7_).append(',').append(i_8_).append(',').append(i_9_).append(',').append(i_10_).append(',').append(i_11_).append(',').append(i_12_).append(')').toString());
		}
		return i_13_;
	}

	public static void method1260(final byte i) {
		try {
			aBooleanArray3223 = null;
			anIntArray3220 = null;
			if (i >= -123) {
				aBooleanArray3223 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("jj.V(").append(i).append(')').toString());
		}
	}

	@Override
	final int[] method1187(final int i_24_) {
		final int[] is_25_ = this.aClass30_2563.method258(i_24_);
		if (this.aClass30_2563.aBoolean238) {
			method1261(is_25_, i_24_, -123);
		}
		return is_25_;
	}

	final void method1261(final int[] is, final int i, final int i_26_) {
		try {
			final int i_27_ = this.anInt3225 * Class150.anIntArray1405[i];
			if (this.anInt3228 == 1) {
				final int i_28_ = aShortArray3218[0];
				final int i_29_ = aShortArray3224[0] << 12;
				final int i_30_ = i_29_ * this.anInt3229 >> 12;
				final int i_31_ = this.anInt3225 * i_29_ >> 12;
				int i_32_ = i_29_ * i_27_ >> 12;
				final int i_33_ = i_32_ >> 12;
				i_32_ &= 0xfff;
				final int i_34_ = aByteArray3219[0xff & i_33_] & 0xff;
				final int i_35_ = Class30.anIntArray224[i_32_];
				int i_36_ = 1 + i_33_;
				if (i_31_ <= i_36_) {
					i_36_ = 0;
				}
				final int i_37_ = 0xff & aByteArray3219[i_36_ & 0xff];
				if (!this.aBoolean3226) {
					for (int i_38_ = 0; Class120_Sub12_Sub7.anInt3178 > i_38_; i_38_++) {
						final int i_39_ = Class90.anIntArray849[i_38_] * this.anInt3229;
						final int i_40_ = method1259(i_29_ * i_39_ >> 12, i_37_, 1, i_35_, i_34_, i_30_, i_32_);
						is[i_38_] = i_28_ * i_40_ >> 12;
					}
				} else {
					for (int i_41_ = 0; i_41_ < Class120_Sub12_Sub7.anInt3178; i_41_++) {
						final int i_42_ = Class90.anIntArray849[i_41_] * this.anInt3229;
						int i_43_ = method1259(i_29_ * i_42_ >> 12, i_37_, 1, i_35_, i_34_, i_30_, i_32_);
						i_43_ = i_43_ * i_28_ >> 12;
						is[i_41_] = 2048 - -(i_43_ >> 1);
					}
				}
			} else {
				int i_44_ = aShortArray3218[0];
				if (i_44_ > 8 || i_44_ < -8) {
					final int i_45_ = aShortArray3224[0] << 12;
					int i_46_ = i_45_ * i_27_ >> 12;
					final int i_47_ = i_46_ >> 12;
					final int i_48_ = this.anInt3229 * i_45_ >> 12;
					final int i_49_ = i_45_ * this.anInt3225 >> 12;
					i_46_ &= 0xfff;
					final int i_50_ = 0xff & aByteArray3219[0xff & i_47_];
					final int i_51_ = Class30.anIntArray224[i_46_];
					int i_52_ = i_47_ + 1;
					if (i_52_ >= i_49_) {
						i_52_ = 0;
					}
					final int i_53_ = 0xff & aByteArray3219[i_52_ & 0xff];
					for (int i_54_ = 0; Class120_Sub12_Sub7.anInt3178 > i_54_; i_54_++) {
						final int i_55_ = this.anInt3229 * Class90.anIntArray849[i_54_];
						final int i_56_ = method1259(i_45_ * i_55_ >> 12, i_53_, 1, i_51_, i_50_, i_48_, i_46_);
						is[i_54_] = i_44_ * i_56_ >> 12;
					}
				}
				for (int i_57_ = 1; i_57_ < this.anInt3228; i_57_++) {
					i_44_ = aShortArray3218[i_57_];
					if (i_44_ > 8 || i_44_ < -8) {
						final int i_58_ = aShortArray3224[i_57_] << 12;
						final int i_59_ = i_58_ * this.anInt3229 >> 12;
						int i_60_ = i_27_ * i_58_ >> 12;
						final int i_61_ = this.anInt3225 * i_58_ >> 12;
						final int i_62_ = i_60_ >> 12;
						int i_63_ = i_62_ - -1;
						i_60_ &= 0xfff;
						final int i_64_ = 0xff & aByteArray3219[0xff & i_62_];
						if (i_63_ >= i_61_) {
							i_63_ = 0;
						}
						final int i_65_ = aByteArray3219[0xff & i_63_] & 0xff;
						final int i_66_ = Class30.anIntArray224[i_60_];
						if (!this.aBoolean3226 || i_57_ != this.anInt3228 - 1) {
							for (int i_67_ = 0; i_67_ < Class120_Sub12_Sub7.anInt3178; i_67_++) {
								final int i_68_ = Class90.anIntArray849[i_67_] * this.anInt3229;
								final int i_69_ = method1259(i_58_ * i_68_ >> 12, i_65_, 1, i_66_, i_64_, i_59_, i_60_);
								is[i_67_] += i_44_ * i_69_ >> 12;
							}
						} else {
							for (int i_70_ = 0; Class120_Sub12_Sub7.anInt3178 > i_70_; i_70_++) {
								final int i_71_ = Class90.anIntArray849[i_70_] * this.anInt3229;
								int i_72_ = method1259(i_71_ * i_58_ >> 12, i_65_, 1, i_66_, i_64_, i_59_, i_60_);
								i_72_ = is[i_70_] - -(i_44_ * i_72_ >> 12);
								is[i_70_] = 2048 + (i_72_ >> 1);
							}
						}
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("jj.T(").append(is != null ? "{...}" : "null").append(',').append(i).append(',').append(i_26_).append(')').toString());
		}
	}

	@Override
	final void method1193(final byte i) {
		try {
			aByteArray3219 = Class128.method1899(this.anInt3222, -29382);
			method1257((byte) 114);
			for (int i_73_ = -1 + this.anInt3228; i_73_ >= 1; i_73_--) {
				final short i_74_ = aShortArray3218[i_73_];
				if (i_74_ > 8 || i_74_ < -8) {
					break;
				}
				this.anInt3228--;
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("jj.O(").append(i).append(')').toString());
		}
	}

	static final void method1262() {
		boolean bool = false;
		while (!bool) {
			bool = true;
			for (int i_75_ = 0; i_75_ < Class186.menuOptionCount - 1; i_75_++) {
				if (Class120_Sub29.aShortArray2777[i_75_] < 1000 && Class120_Sub29.aShortArray2777[1 + i_75_] > 1000) {
					bool = false;
					final String string = Class120_Sub12_Sub29.menuOptionSufix[i_75_];
					Class120_Sub12_Sub29.menuOptionSufix[i_75_] = Class120_Sub12_Sub29.menuOptionSufix[i_75_ + 1];
					Class120_Sub12_Sub29.menuOptionSufix[i_75_ + 1] = string;
					final String string_76_ = Class120_Sub12_Sub33.menuOptionPrefix[i_75_];
					Class120_Sub12_Sub33.menuOptionPrefix[i_75_] = Class120_Sub12_Sub33.menuOptionPrefix[i_75_ + 1];
					Class120_Sub12_Sub33.menuOptionPrefix[i_75_ + 1] = string_76_;
					int i_77_ = Class120_Sub12_Sub7.anIntArray3182[i_75_];
					Class120_Sub12_Sub7.anIntArray3182[i_75_] = Class120_Sub12_Sub7.anIntArray3182[1 + i_75_];
					Class120_Sub12_Sub7.anIntArray3182[i_75_ + 1] = i_77_;
					i_77_ = Class120_Sub29.anIntArray2769[i_75_];
					Class120_Sub29.anIntArray2769[i_75_] = Class120_Sub29.anIntArray2769[1 + i_75_];
					Class120_Sub29.anIntArray2769[i_75_ + 1] = i_77_;
					i_77_ = InterfaceChangeNode.menuOptionsCursorId[i_75_];
					InterfaceChangeNode.menuOptionsCursorId[i_75_] = InterfaceChangeNode.menuOptionsCursorId[1 + i_75_];
					InterfaceChangeNode.menuOptionsCursorId[i_75_ + 1] = i_77_;
					final short i_78_ = Class120_Sub29.aShortArray2777[i_75_];
					Class120_Sub29.aShortArray2777[i_75_] = Class120_Sub29.aShortArray2777[i_75_ + 1];
					Class120_Sub29.aShortArray2777[i_75_ + 1] = i_78_;
					final long l = Class120_Sub12.aLongArray2562[i_75_];
					Class120_Sub12.aLongArray2562[i_75_] = Class120_Sub12.aLongArray2562[1 + i_75_];
					Class120_Sub12.aLongArray2562[i_75_ + 1] = l;
				}
			}
		}
	}

	public Class120_Sub12_Sub12() {
		super(0, true);
		this.anInt3221 = 1638;
		this.anInt3225 = 4;
		this.anInt3228 = 4;
		this.anInt3222 = 0;
		this.anInt3229 = 4;
	}
}
