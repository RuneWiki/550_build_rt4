/* Class73 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class73 {
	private int anInt628;
	boolean aBoolean629 = true;
	int anInt630;
	private int anInt631;
	static float aFloat632;
	boolean aBoolean633;
	int anInt634;
	static Cache aClass21_635;
	private int anInt636 = -1;
	static int anInt637;
	int[] anIntArray638;
	static int anInt639 = 0;
	int anInt640;
	private int anInt641;
	boolean randomizePosition;
	private int anInt643;
	int anInt644;
	String aString645;
	String[] aStringArray646;
	private int anInt647;
	int anInt648;
	String aString649;
	private int anInt650;
	int anInt651;
	int anInt652;
	static Deque aClass105_653;
	private int anInt654;
	int anInt655;
	int anInt656;
	int anInt657;
	int anInt658;
	boolean aBoolean659;
	private int anInt660;
	static int[] anIntArray661;
	static int fps;
	static Class193 aClass193_663;
	static int[] anIntArray664;
	static int anInt665;

	static {
		aClass21_635 = new Cache(64);
		fps = 0;
		anIntArray661 = new int[1000];
		anIntArray664 = new int[14];
	}

	static final void method642(final byte i, final int[] is, final long[] ls) {
		try {
			if (i != -46) {
				method649((byte) 90);
			}
			Class25.method218(1, -1 + ls.length, ls, 0, is);
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ho.E(").append(i).append(',').append(is != null ? "{...}" : "null").append(',').append(ls != null ? "{...}" : "null").append(')').toString());
		}
	}

	final void method643(final Buffer class120_sub7, final int i) {
		try {
			if (i != 0) {
				method645((byte) 75);
			}
			for (;;) {
				final int i_0_ = class120_sub7.getUByte();
				if (i_0_ == 0) {
					break;
				}
				method646(i ^ ~0x1b3c, i_0_, class120_sub7);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ho.B(").append(class120_sub7 != null ? "{...}" : "null").append(',').append(i).append(')').toString());
		}
	}

	static final String method644(final int i, final int i_1_) {
		String string;
		try {
			if (i < i_1_) {
				return Integer.toString(i);
			}
			string = "*";
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ho.D(").append(i).append(',').append(i_1_).append(')').toString());
		}
		return string;
	}

	final Class107_Sub1 method645(final byte i) {
		Class107_Sub1 class107_sub1;
		try {
			if (i >= -100) {
				method646(104, -75, null);
			}
			Class107_Sub1 class107_sub1_2_ = (Class107_Sub1) Class82.aClass21_786.get(anInt647 | 0x20000);
			if (class107_sub1_2_ != null) {
				return class107_sub1_2_;
			}
			Class88.aClass50_834.method429(anInt647, 66);
			class107_sub1_2_ = Class164.method2138(32, 0, Class88.aClass50_834, anInt647);
			if (class107_sub1_2_ != null) {
				class107_sub1_2_.anInt1029 = class107_sub1_2_.anInt1026;
				class107_sub1_2_.anInt1020 = 0;
				class107_sub1_2_.anInt1028 = class107_sub1_2_.anInt1030;
				class107_sub1_2_.anInt1021 = 0;
				Class82.aClass21_786.put(class107_sub1_2_, 0x20000 | anInt647);
			}
			class107_sub1 = class107_sub1_2_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ho.F(").append(i).append(')').toString());
		}
		return class107_sub1;
	}

	private final void method646(final int i, final int i_3_, final Buffer class120_sub7) {
		try {
			if (i_3_ == 1) {
				this.anInt644 = class120_sub7.getUShort();
			} else if (i_3_ == 2) {
				this.anInt657 = class120_sub7.getUShort();
			} else if (i_3_ == 3) {
				this.aString649 = class120_sub7.getJString();
			} else if (i_3_ != 4) {
				if (i_3_ == 5) {
					this.anInt656 = class120_sub7.getTriByte();
				} else if (i_3_ == 6) {
					this.anInt634 = class120_sub7.getUByte();
				} else if (i_3_ != 7) {
					if (i_3_ == 8) {
						this.randomizePosition = class120_sub7.getUByte() == 1;
					} else if (i_3_ == 9) {
						anInt650 = class120_sub7.getUShort();
						if (anInt650 == 65535) {
							anInt650 = -1;
						}
						anInt660 = class120_sub7.getUShort();
						if (anInt660 == 65535) {
							anInt660 = -1;
						}
						anInt643 = class120_sub7.getInt();
						anInt641 = class120_sub7.getInt();
					} else if (i_3_ >= 10 && i_3_ <= 14) {
						this.aStringArray646[i_3_ + -10] = class120_sub7.getJString();
					} else if (i_3_ != 15) {
						if (i_3_ != 16) {
							if (i_3_ != 17) {
								if (i_3_ == 18) {
									anInt647 = class120_sub7.getUShort();
								} else if (i_3_ != 19) {
									if (i_3_ == 20) {
										anInt631 = class120_sub7.getUShort();
										if ((anInt631 ^ 0xffffffff) == -65536) {
											anInt631 = -1;
										}
										anInt636 = class120_sub7.getUShort();
										if (65535 == anInt636) {
											anInt636 = -1;
										}
										anInt654 = class120_sub7.getInt();
										anInt628 = class120_sub7.getInt();
									} else if (i_3_ == 21) {
										this.anInt648 = class120_sub7.getInt();
									} else if (i_3_ == 22) {
										this.anInt640 = class120_sub7.getInt();
									}
								} else {
									this.anInt652 = class120_sub7.getUShort();
								}
							} else {
								this.aString645 = class120_sub7.getJString();
							}
						} else {
							this.aBoolean659 = false;
						}
					} else {
						final int i_4_ = class120_sub7.getUByte();
						this.anIntArray638 = new int[i_4_ * 2];
						for (int i_5_ = 0; 2 * i_4_ > i_5_; i_5_++) {
							this.anIntArray638[i_5_] = class120_sub7.method1078(true);
						}
						this.anInt630 = class120_sub7.getInt();
						this.anInt651 = class120_sub7.getInt();
					}
				} else {
					final int i_6_ = class120_sub7.getUByte();
					if ((i_6_ & 0x2) == 2) {
						this.aBoolean633 = true;
					}
					if ((i_6_ & 0x1) == 0) {
						this.aBoolean629 = false;
					}
				}
			} else {
				this.anInt655 = class120_sub7.getTriByte();
			}
			if (i != -6973) {
				method644(-128, -21);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ho.G(").append(i).append(',').append(i_3_).append(',').append(class120_sub7 != null ? "{...}" : "null").append(')').toString());
		}
	}

	final boolean method647(final int i) {
		boolean bool;
		try {
			if (i != -1) {
				aClass193_663 = null;
			}
			if ((anInt660 ^ 0xffffffff) == 0 && (anInt650 ^ 0xffffffff) == 0) {
				return true;
			}
			int i_7_;
			if (anInt660 == -1) {
				i_7_ = Class173.method2226((byte) -98, anInt650);
			} else {
				i_7_ = Class2.permanentVariable[anInt660];
			}
			if (anInt643 <= i_7_ && anInt641 >= i_7_) {
				if (anInt636 != -1 || (anInt631 ^ 0xffffffff) != 0) {
					if ((anInt636 ^ 0xffffffff) != 0) {
						i_7_ = Class2.permanentVariable[anInt636];
					} else {
						i_7_ = Class173.method2226((byte) -104, anInt631);
					}
					if (i_7_ >= anInt654 && anInt628 >= i_7_) {
						return true;
					}
					return false;
				}
				return true;
			}
			bool = false;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ho.A(").append(i).append(')').toString());
		}
		return bool;
	}

	final Class107 method648(final boolean bool, final boolean bool_8_, final boolean bool_9_) {
		Class107 class107;
		try {
			if (bool_8_) {
				method647(-42);
			}
			final int i = bool ? this.anInt657 : this.anInt644;
			Class107 class107_10_ = (Class107) Class82.aClass21_786.get(i | (bool ? 65536 : 0));
			if (class107_10_ != null) {
				return class107_10_;
			}
			if (!Class88.aClass50_834.method429(i, 85)) {
				return null;
			}
			final Class107_Sub1 class107_sub1 = Class164.method2138(32, 0, Class88.aClass50_834, i);
			if (!HDToolkit.glEnabled || bool_9_) {
				class107_10_ = class107_sub1;
			} else {
				class107_10_ = new Class107_Sub2(class107_sub1);
			}
			if (class107_10_ != null) {
				class107_10_.anInt1028 = class107_10_.anInt1030;
				class107_10_.anInt1021 = 0;
				class107_10_.anInt1029 = class107_10_.anInt1026;
				class107_10_.anInt1020 = 0;
				Class82.aClass21_786.put(class107_10_, (bool ? 65536 : 0) | i);
			}
			class107 = class107_10_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ho.C(").append(bool).append(',').append(bool_8_).append(',').append(bool_9_).append(')').toString());
		}
		return class107;
	}

	static final Class73 list(int i) {
		Class73 class73_34_ = (Class73) Class120_Sub12_Sub14.aClass21_3238.get(i);
		if (class73_34_ != null) {
			return class73_34_;
		}
		final byte[] is = Class31.aClass50_241.getFile(36, i);
		class73_34_ = new Class73();
		class73_34_.anInt658 = i;
		if (is != null) {
			class73_34_.method643(new Buffer(is), 0);
		}
		Class120_Sub12_Sub14.aClass21_3238.put(class73_34_, i);
		return class73_34_;
	}

	public static void method649(final byte i) {
		try {
			aClass193_663 = null;
			anIntArray664 = null;
			anIntArray661 = null;
			aClass21_635 = null;
			if (i != -41) {
				method644(-111, 123);
			}
			aClass105_653 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ho.H(").append(i).append(')').toString());
		}
	}

	public Class73() {
		this.anInt634 = 0;
		this.aBoolean633 = false;
		this.anInt644 = -1;
		this.randomizePosition = true;
		this.aStringArray646 = new String[5];
		this.anInt652 = -1;
		anInt650 = -1;
		this.aBoolean659 = true;
		anInt631 = -1;
		anInt660 = -1;
		anInt647 = -1;
		this.anInt656 = -1;
		this.anInt657 = -1;
	}
}
