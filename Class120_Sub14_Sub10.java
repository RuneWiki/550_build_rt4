/* Class120_Sub14_Sub10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Frame;

final class Class120_Sub14_Sub10 extends NodeSub {
	private int[] anIntArray3528;
	private int[][] anIntArrayArray3529;
	static Frame fullscreenFrame;
	boolean aBoolean3531 = true;
	static LDSprite aClass120_Sub14_Sub19_Sub2_3532;
	static int[] anIntArray3533 = new int[14];
	static Hashtable aClass75_3534 = new Hashtable(16);
	int[] anIntArray3535;
	private String[] aStringArray3536;
	static int anInt3537;

	static final void method1499(final Class28 class28) {
		for (int i = class28.anInt180; i <= class28.anInt182; i++) {
			for (int i_0_ = class28.anInt184; i_0_ <= class28.anInt175; i_0_++) {
				final GroundTile class120_sub18 = Class120_Sub1.groundTiles[class28.anInt177][i][i_0_];
				if (class120_sub18 != null) {
					for (int i_1_ = 0; i_1_ < class120_sub18.anInt2638; i_1_++) {
						if (class120_sub18.aClass28Array2625[i_1_] == class28) {
							class120_sub18.anInt2638--;
							for (int i_2_ = i_1_; i_2_ < class120_sub18.anInt2638; i_2_++) {
								class120_sub18.aClass28Array2625[i_2_] = class120_sub18.aClass28Array2625[i_2_ + 1];
								class120_sub18.anIntArray2641[i_2_] = class120_sub18.anIntArray2641[i_2_ + 1];
							}
							class120_sub18.aClass28Array2625[class120_sub18.anInt2638] = null;
							break;
						}
					}
					class120_sub18.anInt2635 = 0;
					for (int i_3_ = 0; i_3_ < class120_sub18.anInt2638; i_3_++) {
						class120_sub18.anInt2635 |= class120_sub18.anIntArray2641[i_3_];
					}
				}
			}
		}
	}

	final int method1500(final int i) {
		int i_4_;
		try {
			if (i != 0) {
				aClass75_3534 = null;
			}
			if (anIntArray3528 == null) {
				return 0;
			}
			i_4_ = anIntArray3528.length;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ij.A(").append(i).append(')').toString());
		}
		return i_4_;
	}

	final int method1501(final int i, final int i_5_, final int i_6_) {
		int i_7_;
		try {
			if (i_5_ != 0) {
				method1506(null);
			}
			if (anIntArray3528 == null || i_6_ < 0 || i_6_ > anIntArray3528.length) {
				return -1;
			}
			if (anIntArrayArray3529[i_6_] == null || i < 0 || i > anIntArrayArray3529[i_6_].length) {
				return -1;
			}
			i_7_ = anIntArrayArray3529[i_6_][i];
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ij.G(").append(i).append(',').append(i_5_).append(',').append(i_6_).append(')').toString());
		}
		return i_7_;
	}

	final int method1502(final int i, final int i_8_) {
		int i_9_;
		try {
			if (i_8_ != 0) {
				return -72;
			}
			if (anIntArray3528 == null || i < 0 || i > anIntArray3528.length) {
				return -1;
			}
			i_9_ = anIntArray3528[i];
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ij.B(").append(i).append(',').append(i_8_).append(')').toString());
		}
		return i_9_;
	}

	private final void method1503(final int i, final boolean bool, final Buffer class120_sub7) {
		try {
			if (bool) {
				aClass120_Sub14_Sub19_Sub2_3532 = null;
			}
			if (i != 1) {
				if (i != 2) {
					if (i == 3) {
						final int i_10_ = class120_sub7.getUByte();
						anIntArrayArray3529 = new int[i_10_][];
						anIntArray3528 = new int[i_10_];
						for (int i_11_ = 0; i_10_ > i_11_; i_11_++) {
							final int i_12_ = class120_sub7.getUShort();
							anIntArray3528[i_11_] = i_12_;
							anIntArrayArray3529[i_11_] = new int[Class140.anIntArray1341[i_12_]];
							for (int i_13_ = 0; Class140.anIntArray1341[i_12_] > i_13_; i_13_++) {
								anIntArrayArray3529[i_11_][i_13_] = class120_sub7.getUShort();
							}
						}
					} else if (i == 4) {
						this.aBoolean3531 = false;
					}
				} else {
					final int i_14_ = class120_sub7.getUByte();
					this.anIntArray3535 = new int[i_14_];
					for (int i_15_ = 0; i_14_ > i_15_; i_15_++) {
						this.anIntArray3535[i_15_] = class120_sub7.getUShort();
					}
				}
			} else {
				aStringArray3536 = Class29.method249(0, '<', class120_sub7.getJString());
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ij.E(").append(i).append(',').append(bool).append(',').append(class120_sub7 != null ? "{...}" : "null").append(')').toString());
		}
	}

	static final boolean method1504(final int i, final char c) {
		boolean bool;
		try {
			if (c >= ' ' && c <= '~') {
				return true;
			}
			if (c >= '\u00a0' && c <= '\u00ff') {
				return true;
			}
			if (i != 80) {
				aClass120_Sub14_Sub19_Sub2_3532 = null;
			}
			if (c == '\u20ac' || c == '\u0152' || c == '\u2014' || c == '\u0153' || c == '\u0178') {
				return true;
			}
			bool = false;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ij.F(").append(i).append(',').append(c).append(')').toString());
		}
		return bool;
	}

	final void method1505(final Buffer class120_sub7, final int i) {
		try {
			if (i != 0) {
				this.aBoolean3531 = false;
			}
			for (;;) {
				final int i_16_ = class120_sub7.getUByte();
				if (i_16_ == 0) {
					break;
				}
				method1503(i_16_, false, class120_sub7);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ij.I(").append(class120_sub7 != null ? "{...}" : "null").append(',').append(i).append(')').toString());
		}
	}

	final String method1506(final Buffer class120_sub7) {
		final StringBuffer stringbuffer = new StringBuffer(80);
		if (anIntArray3528 != null) {
			for (int i_17_ = 0; i_17_ < anIntArray3528.length; i_17_++) {
				stringbuffer.append(aStringArray3536[i_17_]);
				stringbuffer.append(Class101_Sub4.method849(class120_sub7.method1098(-124, InputStream_Sub1.anIntArray24[anIntArray3528[i_17_]]), anIntArray3528[i_17_], anIntArrayArray3529[i_17_]));
			}
		}
		stringbuffer.append(aStringArray3536[aStringArray3536.length - 1]);
		return stringbuffer.toString();
	}

	final void method1507(final int i) {
		try {
			if (this.anIntArray3535 != null) {
				for (int i_18_ = 0; this.anIntArray3535.length > i_18_; i_18_++) {
					this.anIntArray3535[i_18_] = Class191.method2512(this.anIntArray3535[i_18_], 32768);
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ij.D(").append(i).append(')').toString());
		}
	}

	final void method1508(final int[] is, final byte i, final Buffer class120_sub7) {
		try {
			if (anIntArray3528 != null) {
				for (int i_19_ = 0; i_19_ < anIntArray3528.length && i_19_ < is.length; i_19_++) {
					final int i_20_ = Class32.anIntArray263[method1502(i_19_, 0)];
					if (i_20_ > 0) {
						class120_sub7.method1108(is[i_19_], true, i_20_);
					}
				}
				if (i != 107) {
					anIntArrayArray3529 = null;
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ij.L(").append(is != null ? "{...}" : "null").append(',').append(i).append(',').append(class120_sub7 != null ? "{...}" : "null").append(')').toString());
		}
	}

	public static void method1509(final boolean bool) {
		try {
			anIntArray3533 = null;
			fullscreenFrame = null;
			if (!bool) {
				method1509(false);
			}
			aClass120_Sub14_Sub19_Sub2_3532 = null;
			aClass75_3534 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ij.H(").append(bool).append(')').toString());
		}
	}

	final String method1510(final int i) {
		final StringBuffer stringbuffer = new StringBuffer(80);
		if (aStringArray3536 == null) {
			return "";
		}
		stringbuffer.append(aStringArray3536[0]);
		for (int i_21_ = 1; i_21_ < aStringArray3536.length; i_21_++) {
			stringbuffer.append("...");
			stringbuffer.append(aStringArray3536[i_21_]);
		}
		System.out.println(stringbuffer.toString());
		return stringbuffer.toString();
	}

	public Class120_Sub14_Sub10() {
		/* empty */
	}
}
