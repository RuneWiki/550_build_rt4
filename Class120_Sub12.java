/* Class120_Sub12 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class120_Sub12 extends Node {
	static float aFloat2557;
	boolean aBoolean2558;
	Class109 aClass109_2559;
	static int anInt2560;
	Class120_Sub12[] aClass120_Sub12Array2561;
	static long[] aLongArray2562 = new long[500];
	Class30 aClass30_2563;
	static boolean aBoolean2564 = true;
	static int[] anIntArray2565 = new int[4096];
	static String aString2566 = "yellow:";
	static int[] anIntArray2567 = new int[14];
	static byte[][] spriteAlphas;
	static float aFloat2569;
	int anInt2570;

	public static void method1178(final int i) {
		try {
			aString2566 = null;
			if (i >= -112) {
				method1191(67, 20, -102, -32, 127, 30, -118, -120, 53, -66, -33, 2, 12, 6, -93, 99, -4, 101, -15, 83);
			}
			aLongArray2562 = null;
			anIntArray2567 = null;
			spriteAlphas = null;
			anIntArray2565 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("jo.C(").append(i).append(')').toString());
		}
	}

	final int[][] method1179(final int i, final int i_0_, final byte i_1_) {
		int[][] is;
		try {
			if (i_1_ != -51) {
				method1184((byte) -115);
			}
			if (!this.aClass120_Sub12Array2561[i].aBoolean2558) {
				return this.aClass120_Sub12Array2561[i].method1188(i_0_, -29869);
			}
			final int[][] is_2_ = new int[3][];
			final int[] is_3_ = this.aClass120_Sub12Array2561[i].method1187(-1735, i_0_);
			is_2_[0] = is_3_;
			is_2_[2] = is_3_;
			is_2_[1] = is_3_;
			is = is_2_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("jo.J(").append(i).append(',').append(i_0_).append(',').append(i_1_).append(')').toString());
		}
		return is;
	}

	void method1180(final byte i, final Buffer class120_sub7, final int i_4_) {
		try {
			if (i != -43) {
				anIntArray2567 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("jo.M(").append(i).append(',').append(class120_sub7 != null ? "{...}" : "null").append(',').append(i_4_).append(')').toString());
		}
	}

	int method1181(final int i) {
		int i_5_;
		try {
			if (i != -1) {
				spriteAlphas = null;
			}
			i_5_ = -1;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("jo.I(").append(i).append(')').toString());
		}
		return i_5_;
	}

	static final void method1182(final Signlink signlink, final int i, final byte i_6_, final Buffer class120_sub7) {
		try {
			final Class120_Sub28 class120_sub28 = new Class120_Sub28();
			class120_sub28.anInt2753 = class120_sub7.getUByte();
			class120_sub28.anInt2757 = class120_sub7.getInt();
			class120_sub28.anIntArray2756 = new int[class120_sub28.anInt2753];
			if (i_6_ > -100) {
				anIntArray2565 = null;
			}
			class120_sub28.aByteArrayArrayArray2750 = new byte[class120_sub28.anInt2753][][];
			class120_sub28.aClass185Array2755 = new SignlinkNode[class120_sub28.anInt2753];
			class120_sub28.aClass185Array2760 = new SignlinkNode[class120_sub28.anInt2753];
			class120_sub28.anIntArray2763 = new int[class120_sub28.anInt2753];
			class120_sub28.anIntArray2752 = new int[class120_sub28.anInt2753];
			for (int i_7_ = 0; class120_sub28.anInt2753 > i_7_; i_7_++) {
				try {
					final int i_8_ = class120_sub7.getUByte();
					if (i_8_ == 0 || i_8_ == 1 || i_8_ == 2) {
						final String string = class120_sub7.getJString();
						int i_9_ = 0;
						final String string_10_ = class120_sub7.getJString();
						if (i_8_ == 1) {
							i_9_ = class120_sub7.getInt();
						}
						class120_sub28.anIntArray2756[i_7_] = i_8_;
						class120_sub28.anIntArray2752[i_7_] = i_9_;
						class120_sub28.aClass185Array2755[i_7_] = signlink.method1974(string_10_, Class120_Sub14_Sub18.method1584(0, string));
					} else if (i_8_ == 3 || i_8_ == 4) {
						final String string = class120_sub7.getJString();
						final String string_11_ = class120_sub7.getJString();
						final int i_12_ = class120_sub7.getUByte();
						final String[] strings = new String[i_12_];
						for (int i_13_ = 0; i_13_ < i_12_; i_13_++) {
							strings[i_13_] = class120_sub7.getJString();
						}
						final byte[][] is = new byte[i_12_][];
						if (i_8_ == 3) {
							for (int i_14_ = 0; i_12_ > i_14_; i_14_++) {
								final int i_15_ = class120_sub7.getInt();
								is[i_14_] = new byte[i_15_];
								class120_sub7.getBuffer(is[i_14_], 0, i_15_);
							}
						}
						final Class[] var_classes = new Class[i_12_];
						class120_sub28.anIntArray2756[i_7_] = i_8_;
						for (int i_16_ = 0; i_12_ > i_16_; i_16_++) {
							var_classes[i_16_] = Class120_Sub14_Sub18.method1584(0, strings[i_16_]);
						}
						class120_sub28.aClass185Array2760[i_7_] = signlink.method1964(string_11_, (byte) 70, Class120_Sub14_Sub18.method1584(0, string), var_classes);
						class120_sub28.aByteArrayArrayArray2750[i_7_] = is;
					}
				} catch (final ClassNotFoundException classnotfoundexception) {
					class120_sub28.anIntArray2763[i_7_] = -1;
				} catch (final SecurityException securityexception) {
					class120_sub28.anIntArray2763[i_7_] = -2;
				} catch (final NullPointerException nullpointerexception) {
					class120_sub28.anIntArray2763[i_7_] = -3;
				} catch (final Exception exception) {
					class120_sub28.anIntArray2763[i_7_] = -4;
				} catch (final Throwable throwable) {
					class120_sub28.anIntArray2763[i_7_] = -5;
				}
			}
			OverridedJInterface.aClass105_2746.addLast(class120_sub28);
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("jo.P(").append(signlink != null ? "{...}" : "null").append(',').append(i).append(',').append(i_6_).append(',').append(class120_sub7 != null ? "{...}" : "null").append(')').toString());
		}
	}

	static final void method1183(final int i, final LocType locType, final int i_17_, final int i_18_, final int i_19_) {
		try {
			if (i_18_ != 16157) {
				aFloat2569 = 1.1516114F;
			}
			for (Class120_Sub8 class120_sub8 = (Class120_Sub8) Class101_Sub1.aClass105_2266.getFront(); class120_sub8 != null; class120_sub8 = (Class120_Sub8) Class101_Sub1.aClass105_2266.getNext()) {
				if (class120_sub8.anInt2498 == i_17_ && class120_sub8.anInt2494 == i_19_ * 128 && class120_sub8.anInt2483 == i * 128 && locType.myId == class120_sub8.aClass184_2497.myId) {
					if (class120_sub8.aClass120_Sub30_Sub4_2488 != null) {
						Class120_Sub12_Sub22.aClass120_Sub30_Sub3_3299.method1783(class120_sub8.aClass120_Sub30_Sub4_2488);
						class120_sub8.aClass120_Sub30_Sub4_2488 = null;
					}
					if (class120_sub8.aClass120_Sub30_Sub4_2478 != null) {
						Class120_Sub12_Sub22.aClass120_Sub30_Sub3_3299.method1783(class120_sub8.aClass120_Sub30_Sub4_2478);
						class120_sub8.aClass120_Sub30_Sub4_2478 = null;
					}
					class120_sub8.unlink();
					break;
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("jo.L(").append(i).append(',').append(locType != null ? "{...}" : "null").append(',').append(i_17_).append(',').append(i_18_).append(',').append(i_19_).append(')').toString());
		}
	}

	int method1184(final byte i) {
		int i_20_;
		try {
			if (i >= -26) {
				this.aBoolean2558 = true;
			}
			i_20_ = -1;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("jo.Q(").append(i).append(')').toString());
		}
		return i_20_;
	}

	static final void method1185(final int i) {
		try {
			for (Class120_Sub24 class120_sub24 = (Class120_Sub24) Class120_Sub4.aClass105_2439.getFront(); class120_sub24 != null; class120_sub24 = (Class120_Sub24) Class120_Sub4.aClass105_2439.getNext()) {
				if (class120_sub24.anInt2720 > 0) {
					class120_sub24.anInt2720--;
				}
				if (class120_sub24.anInt2720 == 0) {
					if (class120_sub24.anInt2723 < 0 || Class167.method2190(class120_sub24.anInt2723, class120_sub24.anInt2728, -110)) {
						Class31.method264(-1, class120_sub24.anInt2722, class120_sub24.anInt2729, class120_sub24.anInt2725, class120_sub24.anInt2721, class120_sub24.anInt2723, class120_sub24.anInt2731, class120_sub24.anInt2728);
						class120_sub24.unlink();
					}
				} else {
					if (class120_sub24.anInt2732 > 0) {
						class120_sub24.anInt2732--;
					}
					if (class120_sub24.anInt2732 == 0 && class120_sub24.anInt2731 >= 1 && class120_sub24.anInt2725 >= 1 && class120_sub24.anInt2731 <= 102 && class120_sub24.anInt2725 <= 102
							&& (class120_sub24.anInt2719 < 0 || Class167.method2190(class120_sub24.anInt2719, class120_sub24.anInt2727, -102))) {
						Class31.method264(-1, class120_sub24.anInt2722, class120_sub24.anInt2717, class120_sub24.anInt2725, class120_sub24.anInt2721, class120_sub24.anInt2719, class120_sub24.anInt2731, class120_sub24.anInt2727);
						class120_sub24.anInt2732 = -1;
						if (class120_sub24.anInt2719 == class120_sub24.anInt2723 && class120_sub24.anInt2723 == -1) {
							class120_sub24.unlink();
						} else if (class120_sub24.anInt2719 == class120_sub24.anInt2723 && class120_sub24.anInt2717 == class120_sub24.anInt2729 && class120_sub24.anInt2727 == class120_sub24.anInt2728) {
							class120_sub24.unlink();
						}
					}
				}
			}
			if (i != 3) {
				method1182(null, -107, (byte) 0, null);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("jo.G(").append(i).append(')').toString());
		}
	}

	static final void method1186(final int i, final int i_21_, final int i_22_, final int i_23_, final int i_24_, final int i_25_, final int i_26_, final int i_27_, final int i_28_, final int i_29_) {
		try {
			if (Class32.anInt260 > i_28_ || i_28_ > Class120_Sub14_Sub11.anInt3544 || Class32.anInt260 > i || Class120_Sub14_Sub11.anInt3544 < i || Class32.anInt260 > i_23_ || Class120_Sub14_Sub11.anInt3544 < i_23_ || Class32.anInt260 > i_24_ || i_24_ > Class120_Sub14_Sub11.anInt3544
					|| i_25_ < Class120_Sub30_Sub2.anInt3699 || i_25_ > Class139.anInt1334 || i_21_ < Class120_Sub30_Sub2.anInt3699 || Class139.anInt1334 < i_21_ || i_27_ < Class120_Sub30_Sub2.anInt3699 || Class139.anInt1334 < i_27_ || Class120_Sub30_Sub2.anInt3699 > i_26_
					|| Class139.anInt1334 < i_26_) {
				WorldInfo.method2067(i_28_, i_27_, i_24_, i, i_21_, i_25_, i_26_, -17731, i_22_, i_23_);
			} else {
				Class120_Sub3.method1059(i_26_, i_27_, i_25_, i_22_, i, i_23_, i_24_, i_21_, i_28_, true);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("jo.A(").append(i).append(',').append(i_21_).append(',').append(i_22_).append(',').append(i_23_).append(',').append(i_24_).append(',').append(i_25_).append(',').append(i_26_).append(',').append(i_27_).append(',')
					.append(i_28_).append(',').append(i_29_).append(')').toString());
		}
	}

	int[] method1187(final int i, final int i_30_) {
		try {
			if (i != -1735) {
				method1191(-82, -31, -95, 97, -1, -4, 79, 54, -110, -103, 114, -128, -27, 46, 22, -61, 90, -33, 103, -29);
			}
			throw new IllegalStateException("This operation does not have a monochrome output");
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("jo.D(").append(i).append(',').append(i_30_).append(')').toString());
		}
	}

	int[][] method1188(final int i, final int i_31_) {
		try {
			if (i_31_ != -29869) {
				return null;
			}
			throw new IllegalStateException("This operation does not have a colour output");
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("jo.K(").append(i).append(',').append(i_31_).append(')').toString());
		}
	}

	void method1189(final int i) {
		try {
			if (this.aBoolean2558) {
				this.aClass30_2563.method261((byte) -49);
				this.aClass30_2563 = null;
			} else {
				this.aClass109_2559.method972((byte) -74);
				this.aClass109_2559 = null;
			}
			if (i != -2) {
				this.aClass109_2559 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("jo.N(").append(i).append(')').toString());
		}
	}

	final void method1190(final int i, final int i_32_, final int i_33_) {
		try {
			final int i_34_ = this.anInt2570 == 255 ? i : this.anInt2570;
			if (i_32_ <= 14) {
				method1193((byte) -78);
			}
			if (this.aBoolean2558) {
				this.aClass30_2563 = new Class30(i_34_, i, i_33_);
			} else {
				this.aClass109_2559 = new Class109(i_34_, i, i_33_);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("jo.H(").append(i).append(',').append(i_32_).append(',').append(i_33_).append(')').toString());
		}
	}

	static final void method1191(final int i, final int i_35_, final int i_36_, final int i_37_, final int i_38_, final int i_39_, final int i_40_, final int i_41_, final int i_42_, final int i_43_, final int i_44_, final int i_45_, final int i_46_, final int i_47_, final int i_48_,
			final int i_49_, final int i_50_, final int i_51_, final int i_52_, final int i_53_) {
		if (i_37_ == 0) {
			final Class141 class141 = new Class141(i_44_, i_45_, i_46_, i_47_, -1, i_52_, false);
			for (int i_54_ = i; i_54_ >= 0; i_54_--) {
				if (Class120_Sub1.groundTiles[i_54_][i_35_][i_36_] == null) {
					Class120_Sub1.groundTiles[i_54_][i_35_][i_36_] = new GroundTile(i_54_, i_35_, i_36_);
				}
			}
			Class120_Sub1.groundTiles[i][i_35_][i_36_].aClass141_2626 = class141;
		} else if (i_37_ == 1) {
			final Class141 class141 = new Class141(i_48_, i_49_, i_50_, i_51_, i_39_, i_53_, i_40_ == i_41_ && i_40_ == i_42_ && i_40_ == i_43_);
			for (int i_55_ = i; i_55_ >= 0; i_55_--) {
				if (Class120_Sub1.groundTiles[i_55_][i_35_][i_36_] == null) {
					Class120_Sub1.groundTiles[i_55_][i_35_][i_36_] = new GroundTile(i_55_, i_35_, i_36_);
				}
			}
			Class120_Sub1.groundTiles[i][i_35_][i_36_].aClass141_2626 = class141;
		} else {
			final Class168 class168 = new Class168(i_37_, i_38_, i_39_, i_35_, i_36_, i_40_, i_41_, i_42_, i_43_, i_44_, i_45_, i_46_, i_47_, i_48_, i_49_, i_50_, i_51_, i_52_, i_53_);
			for (int i_56_ = i; i_56_ >= 0; i_56_--) {
				if (Class120_Sub1.groundTiles[i_56_][i_35_][i_36_] == null) {
					Class120_Sub1.groundTiles[i_56_][i_35_][i_36_] = new GroundTile(i_56_, i_35_, i_36_);
				}
			}
			Class120_Sub1.groundTiles[i][i_35_][i_36_].aClass168_2640 = class168;
		}
	}

	final int[] method1192(final int i, final int i_57_, final int i_58_) {
		int[] is;
		try {
			if (i != -7764) {
				method1183(-61, null, 112, 39, 59);
			}
			if (this.aClass120_Sub12Array2561[i_58_].aBoolean2558) {
				return this.aClass120_Sub12Array2561[i_58_].method1187(-1735, i_57_);
			}
			is = this.aClass120_Sub12Array2561[i_58_].method1188(i_57_, -29869)[0];
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("jo.F(").append(i).append(',').append(i_57_).append(',').append(i_58_).append(')').toString());
		}
		return is;
	}

	void method1193(final byte i) {
		/* empty */
	}

	Class120_Sub12(final int i, final boolean bool) {
		this.aBoolean2558 = bool;
		this.aClass120_Sub12Array2561 = new Class120_Sub12[i];
	}

	static final void method1194(final int i, final int i_59_, final int i_60_, final int i_61_, final int i_62_, final int i_63_) {
		try {
			final int i_64_ = Class3.method83(Class120_Sub30_Sub2.anInt3699, i_60_, 1, Class139.anInt1334);
			final int i_65_ = Class3.method83(Class120_Sub30_Sub2.anInt3699, i_63_, 1, Class139.anInt1334);
			final int i_66_ = Class3.method83(Class32.anInt260, i, 1, Class120_Sub14_Sub11.anInt3544);
			final int i_67_ = Class3.method83(Class32.anInt260, i_59_, 1, Class120_Sub14_Sub11.anInt3544);
			for (int i_68_ = i_64_; i_65_ >= i_68_; i_68_++) {
				Class120_Sub8.method1160((byte) 115, GameEntity.anIntArrayArray3009[i_68_], i_62_, i_66_, i_67_);
			}
			if (i_61_ != 4) {
				method1185(109);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("jo.B(").append(i).append(',').append(i_59_).append(',').append(i_60_).append(',').append(i_61_).append(',').append(i_62_).append(',').append(i_63_).append(')').toString());
		}
	}
}
