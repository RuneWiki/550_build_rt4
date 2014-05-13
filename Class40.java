/* Class40 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class40 {
	int anInt326;
	boolean[] aBooleanArray327;
	int anInt328 = -1;
	private int[] anIntArray329;
	static int anInt330;
	static Class50 aClass50_331;
	boolean aBoolean332 = false;
	static int anInt333 = 0;
	int anInt334;
	static AbstractSprite[] aClass120_Sub14_Sub19Array335;
	int anInt336;
	int anInt337 = 2;
	int[] anIntArray338;
	int anInt339;
	boolean aBoolean340;
	boolean aBoolean341;
	int[] anIntArray342;
	int anInt343;
	boolean aBoolean344;
	static String aString345 = "";
	int anInt346;
	int[][] anIntArrayArray347;
	int anInt348;
	static int anInt349;

	final Class180_Sub7 method320(final boolean bool, int i, int i_0_, final Class180_Sub7 class180_sub7, int i_1_, final int i_2_) {
		Class180_Sub7 class180_sub7_3_;
		try {
			final int i_4_ = this.anIntArray338[i_0_];
			i_0_ = this.anIntArray342[i_0_];
			final Class120_Sub14_Sub18 class120_sub14_sub18 = Class120_Sub12_Sub31.method1367(i_0_ >> 16, -1);
			i_0_ &= 0xffff;
			if (class120_sub14_sub18 == null) {
				return class180_sub7.method2376(true, true, true);
			}
			Class120_Sub14_Sub18 class120_sub14_sub18_5_ = null;
			i_1_ &= 0x3;
			if ((this.aBoolean332 || Class164.aBoolean1586) && (i ^ 0xffffffff) != 0 && this.anIntArray342.length > i) {
				i = this.anIntArray342[i];
				class120_sub14_sub18_5_ = Class120_Sub12_Sub31.method1367(i >> 16, -1);
				i &= 0xffff;
			}
			if (bool) {
				this.anIntArray338 = null;
			}
			Class180_Sub7 class180_sub7_6_;
			if (class120_sub14_sub18_5_ != null) {
				class180_sub7_6_ = class180_sub7.method2376(!class120_sub14_sub18.method1578((byte) -39, i_0_) & !class120_sub14_sub18_5_.method1578((byte) -39, i), !class120_sub14_sub18.method1579(3, i_0_) & !class120_sub14_sub18_5_.method1579(3, i), !this.aBoolean341);
			} else {
				class180_sub7_6_ = class180_sub7.method2376(!class120_sub14_sub18.method1578((byte) -39, i_0_), !class120_sub14_sub18.method1579(3, i_0_), !this.aBoolean341);
			}
			if (this.aBoolean341 && HDToolkit.glEnabled) {
				if (i_1_ != 1) {
					if (i_1_ == 2) {
						((Class180_Sub7_Sub2) class180_sub7_6_).method2409();
					} else if (i_1_ == 3) {
						((Class180_Sub7_Sub2) class180_sub7_6_).method2422();
					}
				} else {
					((Class180_Sub7_Sub2) class180_sub7_6_).method2408();
				}
			} else if (i_1_ != 1) {
				if (i_1_ != 2) {
					if (i_1_ == 3) {
						class180_sub7_6_.method2365();
					}
				} else {
					class180_sub7_6_.method2373();
				}
			} else {
				class180_sub7_6_.method2372();
			}
			class180_sub7_6_.method2380(class120_sub14_sub18, i_0_, class120_sub14_sub18_5_, i, i_2_ + -1, i_4_, this.aBoolean341);
			if (this.aBoolean341 && HDToolkit.glEnabled) {
				if (i_1_ != 1) {
					if (i_1_ == 2) {
						((Class180_Sub7_Sub2) class180_sub7_6_).method2409();
					} else if (i_1_ == 3) {
						((Class180_Sub7_Sub2) class180_sub7_6_).method2408();
					}
				} else {
					((Class180_Sub7_Sub2) class180_sub7_6_).method2422();
				}
			} else if (i_1_ != 1) {
				if (i_1_ != 2) {
					if (i_1_ == 3) {
						class180_sub7_6_.method2372();
					}
				} else {
					class180_sub7_6_.method2373();
				}
			} else {
				class180_sub7_6_.method2365();
			}
			class180_sub7_3_ = class180_sub7_6_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("eg.I(").append(bool).append(',').append(i).append(',').append(i_0_).append(',').append(class180_sub7 != null ? "{...}" : "null").append(',').append(i_1_).append(',').append(i_2_).append(')').toString());
		}
		return class180_sub7_3_;
	}

	static final void method321(final boolean bool, int i, int i_7_, final int i_8_, final int i_9_) {
		try {
			if (Class120_Sub30_Sub2.anInt3699 <= i_9_ && i_9_ <= Class139.anInt1334) {
				i = Class3.method83(Class32.anInt260, i, 1, Class120_Sub14_Sub11.anInt3544);
				i_7_ = Class3.method83(Class32.anInt260, i_7_, 1, Class120_Sub14_Sub11.anInt3544);
				Class84.method717(i, false, i_7_, i_8_, i_9_);
			}
			if (!bool) {
				method325(21, -94, -102, -35, (byte) 68);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("eg.E(").append(bool).append(',').append(i).append(',').append(i_7_).append(',').append(i_8_).append(',').append(i_9_).append(')').toString());
		}
	}

	final void method322(final Buffer class120_sub7, final boolean bool) {
		try {
			if (bool) {
				this.anInt336 = 76;
			}
			for (;;) {
				final int i = class120_sub7.getUByte();
				if (i == 0) {
					break;
				}
				method326(class120_sub7, i, 4282);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("eg.J(").append(class120_sub7 != null ? "{...}" : "null").append(',').append(bool).append(')').toString());
		}
	}

	final Class180_Sub7 method323(final boolean bool, final int i, int i_10_, final Class180_Sub7 class180_sub7, final int i_11_) {
		Class180_Sub7 class180_sub7_12_;
		try {
			final int i_13_ = this.anIntArray338[i_11_];
			if (bool) {
				this.anIntArray338 = null;
			}
			int i_14_ = this.anIntArray342[i_11_];
			final Class120_Sub14_Sub18 class120_sub14_sub18 = Class120_Sub12_Sub31.method1367(i_14_ >> 16, -1);
			i_14_ &= 0xffff;
			if (class120_sub14_sub18 == null) {
				return class180_sub7.method2376(true, true, true);
			}
			Class120_Sub14_Sub18 class120_sub14_sub18_15_ = null;
			if ((this.aBoolean332 || Class164.aBoolean1586) && i_10_ != -1 && i_10_ < this.anIntArray342.length) {
				i_10_ = this.anIntArray342[i_10_];
				class120_sub14_sub18_15_ = Class120_Sub12_Sub31.method1367(i_10_ >> 16, -1);
				i_10_ &= 0xffff;
			}
			Class120_Sub14_Sub18 class120_sub14_sub18_16_ = null;
			int i_17_ = 0;
			int i_18_ = 0;
			Class120_Sub14_Sub18 class120_sub14_sub18_19_ = null;
			if (anIntArray329 != null) {
				if (i_11_ < anIntArray329.length) {
					i_18_ = anIntArray329[i_11_];
					if (i_18_ != 65535) {
						class120_sub14_sub18_16_ = Class120_Sub12_Sub31.method1367(i_18_ >> 16, -1);
						i_18_ &= 0xffff;
					}
				}
				if ((this.aBoolean332 || Class164.aBoolean1586) && (i_10_ ^ 0xffffffff) != 0 && i_10_ < anIntArray329.length) {
					i_17_ = anIntArray329[i_10_];
					if (-65536 != (i_17_ ^ 0xffffffff)) {
						class120_sub14_sub18_19_ = Class120_Sub12_Sub31.method1367(i_17_ >> 16, -1);
						i_17_ &= 0xffff;
					}
				}
			}
			boolean bool_20_ = !class120_sub14_sub18.method1578((byte) -39, i_14_);
			boolean bool_21_ = !class120_sub14_sub18.method1579(3, i_14_);
			if (class120_sub14_sub18_16_ != null) {
				bool_20_ = bool_20_ & !class120_sub14_sub18_16_.method1578((byte) -39, i_18_);
				bool_21_ = bool_21_ & !class120_sub14_sub18_16_.method1579(3, i_18_);
			}
			if (class120_sub14_sub18_15_ != null) {
				bool_20_ = bool_20_ & !class120_sub14_sub18_15_.method1578((byte) -39, i_10_);
				bool_21_ = bool_21_ & !class120_sub14_sub18_15_.method1579(3, i_10_);
			}
			if (class120_sub14_sub18_19_ != null) {
				bool_20_ = bool_20_ & !class120_sub14_sub18_19_.method1578((byte) -39, i_17_);
				bool_21_ = bool_21_ & !class120_sub14_sub18_19_.method1579(3, i_17_);
			}
			final Class180_Sub7 class180_sub7_22_ = class180_sub7.method2376(bool_20_, bool_21_, !this.aBoolean341);
			class180_sub7_22_.method2380(class120_sub14_sub18, i_14_, class120_sub14_sub18_15_, i_10_, i + -1, i_13_, this.aBoolean341);
			if (class120_sub14_sub18_16_ != null) {
				class180_sub7_22_.method2380(class120_sub14_sub18_16_, i_18_, class120_sub14_sub18_19_, i_17_, i + -1, i_13_, this.aBoolean341);
			}
			class180_sub7_12_ = class180_sub7_22_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("eg.F(").append(bool).append(',').append(i).append(',').append(i_10_).append(',').append(class180_sub7 != null ? "{...}" : "null").append(',').append(i_11_).append(')').toString());
		}
		return class180_sub7_12_;
	}

	final Class180_Sub7 method324(final int i, int i_23_, final int i_24_, final Class180_Sub7 class180_sub7, int i_25_) {
		Class180_Sub7 class180_sub7_26_;
		try {
			final int i_27_ = this.anIntArray338[i_23_];
			i_23_ = this.anIntArray342[i_23_];
			final Class120_Sub14_Sub18 class120_sub14_sub18 = Class120_Sub12_Sub31.method1367(i_23_ >> 16, -1);
			i_23_ &= 0xffff;
			if (class120_sub14_sub18 == null) {
				return class180_sub7.method2381(true, true, true);
			}
			Class120_Sub14_Sub18 class120_sub14_sub18_28_ = null;
			if ((this.aBoolean332 || Class164.aBoolean1586) && (i_25_ ^ 0xffffffff) != 0 && i_25_ < this.anIntArray342.length) {
				i_25_ = this.anIntArray342[i_25_];
				class120_sub14_sub18_28_ = Class120_Sub12_Sub31.method1367(i_25_ >> 16, -1);
				i_25_ &= 0xffff;
			}
			Class180_Sub7 class180_sub7_29_;
			if (class120_sub14_sub18_28_ == null) {
				class180_sub7_29_ = class180_sub7.method2381(!class120_sub14_sub18.method1578((byte) -39, i_23_), !class120_sub14_sub18.method1579(3, i_23_), !this.aBoolean341);
			} else {
				class180_sub7_29_ = class180_sub7.method2381(!class120_sub14_sub18.method1578((byte) -39, i_23_) & !class120_sub14_sub18_28_.method1578((byte) -39, i_25_), !class120_sub14_sub18.method1579(3, i_23_) & !class120_sub14_sub18_28_.method1579(3, i_25_), !this.aBoolean341);
			}
			class180_sub7_29_.method2380(class120_sub14_sub18, i_23_, class120_sub14_sub18_28_, i_25_, i_24_ + -1, i_27_, this.aBoolean341);
			class180_sub7_26_ = class180_sub7_29_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("eg.B(").append(i).append(',').append(i_23_).append(',').append(i_24_).append(',').append(class180_sub7 != null ? "{...}" : "null").append(',').append(i_25_).append(')').toString());
		}
		return class180_sub7_26_;
	}

	static final void method325(final int i, final int i_30_, final int i_31_, final int i_32_, final byte i_33_) {
		try {
			final InterfaceChangeNode class120_sub14_sub7 = AbstractObject.putInterfaceChange(8, i_32_);
			class120_sub14_sub7.method1454((byte) -106);
			class120_sub14_sub7.anInt3492 = i;
			if (i_33_ == 92) {
				class120_sub14_sub7.anInt3486 = i_30_;
				class120_sub14_sub7.anInt3484 = i_31_;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("eg.D(").append(i).append(',').append(i_30_).append(',').append(i_31_).append(',').append(i_32_).append(',').append(i_33_).append(')').toString());
		}
	}

	private final void method326(final Buffer class120_sub7, final int i, final int i_34_) {
		try {
			if (i == 1) {
				final int i_35_ = class120_sub7.getUShort();
				this.anIntArray338 = new int[i_35_];
				for (int i_36_ = 0; i_36_ < i_35_; i_36_++) {
					this.anIntArray338[i_36_] = class120_sub7.getUShort();
				}
				this.anIntArray342 = new int[i_35_];
				for (int i_37_ = 0; i_37_ < i_35_; i_37_++) {
					this.anIntArray342[i_37_] = class120_sub7.getUShort();
				}
				for (int i_38_ = 0; i_38_ < i_35_; i_38_++) {
					this.anIntArray342[i_38_] = (class120_sub7.getUShort() << 16) - -this.anIntArray342[i_38_];
				}
			} else if (i == 2) {
				this.anInt346 = class120_sub7.getUShort();
			} else if (i != 3) {
				if (i == 4) {
					this.aBoolean344 = true;
				} else if (i != 5) {
					if (i != 6) {
						if (i == 7) {
							this.anInt334 = class120_sub7.getUShort();
						} else if (i != 8) {
							if (i != 9) {
								if (i != 10) {
									if (i == 11) {
										this.anInt337 = class120_sub7.getUByte();
									} else if (i != 12) {
										if (i != 13) {
											if (i != 14) {
												if (i == 15) {
													this.aBoolean332 = true;
												} else if (i == 16) {
													this.aBoolean340 = true;
												}
											} else {
												this.aBoolean341 = true;
											}
										} else {
											final int i_39_ = class120_sub7.getUShort();
											this.anIntArrayArray347 = new int[i_39_][];
											for (int i_40_ = 0; i_40_ < i_39_; i_40_++) {
												final int i_41_ = class120_sub7.getUByte();
												if (i_41_ > 0) {
													this.anIntArrayArray347[i_40_] = new int[i_41_];
													this.anIntArrayArray347[i_40_][0] = class120_sub7.getTriByte();
													for (int i_42_ = 1; i_41_ > i_42_; i_42_++) {
														this.anIntArrayArray347[i_40_][i_42_] = class120_sub7.getUShort();
													}
												}
											}
										}
									} else {
										final int i_43_ = class120_sub7.getUByte();
										anIntArray329 = new int[i_43_];
										for (int i_44_ = 0; i_43_ > i_44_; i_44_++) {
											anIntArray329[i_44_] = class120_sub7.getUShort();
										}
										for (int i_45_ = 0; i_45_ < i_43_; i_45_++) {
											anIntArray329[i_45_] = (class120_sub7.getUShort() << 16) + anIntArray329[i_45_];
										}
									}
								} else {
									this.anInt336 = class120_sub7.getUByte();
								}
							} else {
								this.anInt343 = class120_sub7.getUByte();
							}
						} else {
							this.anInt339 = class120_sub7.getUByte();
						}
					} else {
						this.anInt328 = class120_sub7.getUShort();
					}
				} else {
					this.anInt348 = class120_sub7.getUByte();
				}
			} else {
				this.aBooleanArray327 = new boolean[256];
				final int i_46_ = class120_sub7.getUByte();
				for (int i_47_ = 0; i_46_ > i_47_; i_47_++) {
					this.aBooleanArray327[class120_sub7.getUByte()] = true;
				}
			}
			if (i_34_ != 4282) {
				method327(-37, -40, -57, -61, -47, null);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("eg.G(").append(class120_sub7 != null ? "{...}" : "null").append(',').append(i).append(',').append(i_34_).append(')').toString());
		}
	}

	final Class180_Sub7 method327(int i, final int i_48_, final int i_49_, int i_50_, int i_51_, final Class180_Sub7 class180_sub7) {
		Class180_Sub7 class180_sub7_52_;
		try {
			final int i_53_ = this.anIntArray338[i_50_];
			i_50_ = this.anIntArray342[i_50_];
			final Class120_Sub14_Sub18 class120_sub14_sub18 = Class120_Sub12_Sub31.method1367(i_50_ >> 16, -1);
			i_50_ &= 0xffff;
			if (class120_sub14_sub18 == null) {
				return class180_sub7.method2378(true, true, true);
			}
			i_51_ &= 0x3;
			Class120_Sub14_Sub18 class120_sub14_sub18_54_ = null;
			if ((this.aBoolean332 || Class164.aBoolean1586) && (i ^ 0xffffffff) != 0 && i < this.anIntArray342.length) {
				i = this.anIntArray342[i];
				class120_sub14_sub18_54_ = Class120_Sub12_Sub31.method1367(i >> 16, -1);
				i &= 0xffff;
			}
			Class180_Sub7 class180_sub7_55_;
			if (class120_sub14_sub18_54_ != null) {
				class180_sub7_55_ = class180_sub7.method2378(!class120_sub14_sub18.method1578((byte) -39, i_50_) & !class120_sub14_sub18_54_.method1578((byte) -39, i), !class120_sub14_sub18.method1579(i_49_ ^ ~0x66d720ec, i_50_) & !class120_sub14_sub18_54_.method1579(3, i), !this.aBoolean341);
			} else {
				class180_sub7_55_ = class180_sub7.method2378(!class120_sub14_sub18.method1578((byte) -39, i_50_), !class120_sub14_sub18.method1579(3, i_50_), !this.aBoolean341);
			}
			if (i_49_ != -1725374704) {
				return null;
			}
			if (!HDToolkit.glEnabled || !this.aBoolean341) {
				if (i_51_ != 1) {
					if (i_51_ == 2) {
						class180_sub7_55_.method2373();
					} else if (i_51_ == 3) {
						class180_sub7_55_.method2365();
					}
				} else {
					class180_sub7_55_.method2372();
				}
			} else if (i_51_ == 1) {
				((Class180_Sub7_Sub2) class180_sub7_55_).method2408();
			} else if (i_51_ != 2) {
				if (i_51_ == 3) {
					((Class180_Sub7_Sub2) class180_sub7_55_).method2422();
				}
			} else {
				((Class180_Sub7_Sub2) class180_sub7_55_).method2409();
			}
			class180_sub7_55_.method2380(class120_sub14_sub18, i_50_, class120_sub14_sub18_54_, i, -1 + i_48_, i_53_, this.aBoolean341);
			if (!HDToolkit.glEnabled || !this.aBoolean341) {
				if (i_51_ != 1) {
					if (i_51_ == 2) {
						class180_sub7_55_.method2373();
					} else if (i_51_ == 3) {
						class180_sub7_55_.method2372();
					}
				} else {
					class180_sub7_55_.method2365();
				}
			} else if (i_51_ == 1) {
				((Class180_Sub7_Sub2) class180_sub7_55_).method2422();
			} else if (i_51_ == 2) {
				((Class180_Sub7_Sub2) class180_sub7_55_).method2409();
			} else if (i_51_ == 3) {
				((Class180_Sub7_Sub2) class180_sub7_55_).method2408();
			}
			class180_sub7_52_ = class180_sub7_55_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("eg.H(").append(i).append(',').append(i_48_).append(',').append(i_49_).append(',').append(i_50_).append(',').append(i_51_).append(',').append(class180_sub7 != null ? "{...}" : "null").append(')').toString());
		}
		return class180_sub7_52_;
	}

	final void method328(final byte i) {
		try {
			if (i == 89) {
				if (this.anInt343 == -1) {
					if (this.aBooleanArray327 != null) {
						this.anInt343 = 2;
					} else {
						this.anInt343 = 0;
					}
				}
				if ((this.anInt336 ^ 0xffffffff) == 0) {
					if (this.aBooleanArray327 != null) {
						this.anInt336 = 2;
					} else {
						this.anInt336 = 0;
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("eg.A(").append(i).append(')').toString());
		}
	}

	public static void method329(final int i) {
		try {
			aString345 = null;
			aClass120_Sub14_Sub19Array335 = null;
			aClass50_331 = null;
			if (i != 1) {
				anInt333 = 102;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("eg.C(").append(i).append(')').toString());
		}
	}

	public Class40() {
		this.anInt336 = -1;
		this.aBoolean340 = false;
		this.anInt343 = -1;
		this.anInt334 = -1;
		this.anInt339 = 99;
		this.aBoolean341 = false;
		this.anInt346 = -1;
		this.aBoolean344 = false;
		this.anInt348 = 5;
	}
}
