/* Class120_Sub12_Sub21_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Graphics;

final class Class120_Sub12_Sub21_Sub1 extends Class120_Sub12_Sub21 {
	static boolean aBoolean3908;
	static volatile boolean focusIn = true;
	static String aString3910;
	static String aString3911 = "level: ";
	static int[] anIntArray3912;

	static {
		aString3910 = " is already on your friend list.";
		anIntArray3912 = new int[32];
		aBoolean3908 = false;
	}

	static final void method1312(final int i, final boolean bool) {
		try {
			byte[][] is;
			if (HDToolkit.glEnabled && bool) {
				is = Class101_Sub1.aByteArrayArray2271;
			} else {
				is = Class134.aByteArrayArray1287;
			}
			if (i != 24505) {
				method1313(99, null, -27, null);
			}
			final int i_0_ = RuntimeException_Sub1.aByteArrayArray2140.length;
			for (int i_1_ = 0; i_0_ > i_1_; i_1_++) {
				final byte[] is_2_ = is[i_1_];
				if (is_2_ != null) {
					final int i_3_ = 64 * (Class120_Sub12_Sub36.anIntArray3417[i_1_] >> 8) - GameEntity.currentBaseX;
					final int i_4_ = 64 * (0xff & Class120_Sub12_Sub36.anIntArray3417[i_1_]) + -Class181.currentBaseZ;
					Class120_Sub2.method1050();
					Class25.method222(bool, is_2_, -127, i_4_, i_3_, Class182.aClass25Array1802);
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("wd.CA(").append(i).append(',').append(bool).append(')').toString());
		}
	}

	public Class120_Sub12_Sub21_Sub1() {
		/* empty */
	}

	static final int method1313(final int i, final String string, final int i_5_, final String string_6_) {
		int i_7_;
		try {
			final int i_8_ = string_6_.length();
			if (i != 5379) {
				return 68;
			}
			int i_9_ = 0;
			final int i_10_ = string.length();
			char c = '\0';
			int i_11_ = 0;
			char c_12_ = '\0';
			while (i_8_ > -c + i_9_ || i_10_ > i_11_ + -c_12_) {
				if (i_8_ <= -c + i_9_) {
					return -1;
				}
				if (i_10_ <= i_11_ - c_12_) {
					return 1;
				}
				char c_13_;
				if (c == 0) {
					c_13_ = string_6_.charAt(i_9_++);
				} else {
					c_13_ = c;
				}
				char c_14_;
				if (c_12_ != 0) {
					c_14_ = c_12_;
				} else {
					c_14_ = string.charAt(i_11_++);
				}
				c = Class120_Sub12_Sub29.method1354(c_13_, false);
				c_12_ = Class120_Sub12_Sub29.method1354(c_14_, false);
				c_13_ = Class22.method198(-99, i_5_, c_13_);
				c_14_ = Class22.method198(-73, i_5_, c_14_);
				if (c_14_ != c_13_ && Character.toUpperCase(c_13_) != Character.toUpperCase(c_14_)) {
					c_13_ = Character.toLowerCase(c_13_);
					c_14_ = Character.toLowerCase(c_14_);
					if (c_14_ != c_13_) {
						return Class120_Sub16.method1661(i + -3617, i_5_, c_13_) - Class120_Sub16.method1661(1762, i_5_, c_14_);
					}
				}
			}
			final int i_15_ = Math.min(i_8_, i_10_);
			for (int i_16_ = 0; i_16_ < i_15_; i_16_++) {
				if (i_5_ == 2) {
					i_11_ = -1 + i_10_ + -i_16_;
					i_9_ = i_8_ - 1 + -i_16_;
				} else {
					i_9_ = i_11_ = i_16_;
				}
				char c_17_ = string_6_.charAt(i_9_);
				char c_18_ = string.charAt(i_11_);
				if (c_17_ != c_18_ && Character.toUpperCase(c_17_) != Character.toUpperCase(c_18_)) {
					c_17_ = Character.toLowerCase(c_17_);
					c_18_ = Character.toLowerCase(c_18_);
					if (c_17_ != c_18_) {
						return Class120_Sub16.method1661(1762, i_5_, c_17_) + -Class120_Sub16.method1661(1762, i_5_, c_18_);
					}
				}
			}
			final int i_19_ = -i_10_ + i_8_;
			if (i_19_ != 0) {
				return i_19_;
			}
			for (int i_20_ = 0; i_20_ < i_15_; i_20_++) {
				final char c_21_ = string_6_.charAt(i_20_);
				final char c_22_ = string.charAt(i_20_);
				if (c_21_ != c_22_) {
					return Class120_Sub16.method1661(i + -3617, i_5_, c_21_) + -Class120_Sub16.method1661(1762, i_5_, c_22_);
				}
			}
			i_7_ = 0;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("wd.IA(").append(i).append(',').append(string != null ? "{...}" : "null").append(',').append(i_5_).append(',').append(string_6_ != null ? "{...}" : "null").append(')').toString());
		}
		return i_7_;
	}

	public static void method1314(final byte i) {
		try {
			aString3911 = null;
			aString3910 = null;
			if (i < 112) {
				aString3911 = null;
			}
			anIntArray3912 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("wd.GA(").append(i).append(')').toString());
		}
	}

	static final void method1315(final int i) {
		try {
			if (i != -1122255295) {
				aString3910 = null;
			}
			for (;;) {
				final Class120_Sub29 class120_sub29 = (Class120_Sub29) Class120_Sub14_Sub15.aClass105_3584.method891(false);
				if (class120_sub29 == null) {
					break;
				}
				GameEntity class180_sub5;
				if (class120_sub29.anInt2764 < 0) {
					final int i_23_ = -class120_sub29.anInt2764 + -1;
					if (i_23_ == Class167.anInt1616) {
						class180_sub5 = Class100.selfPlayer;
					} else {
						class180_sub5 = Class118.playersList[i_23_];
					}
				} else {
					final int i_24_ = class120_sub29.anInt2764 + -1;
					class180_sub5 = Class120_Sub12_Sub11.npcList[i_24_];
				}
				if (class180_sub5 != null) {
					final Class184 class184 = Class120_Sub1.method1035(class120_sub29.anInt2776, i + 1122255295);
					if (Class173.anInt1729 != 0) {
						/* empty */
					}
					int i_25_;
					int i_26_;
					if (class120_sub29.anInt2775 != 1 && class120_sub29.anInt2775 != 3) {
						i_26_ = class184.anInt1827;
						i_25_ = class184.anInt1841;
					} else {
						i_25_ = class184.anInt1827;
						i_26_ = class184.anInt1841;
					}
					final int i_27_ = class120_sub29.anInt2780 + (i_25_ + 1 >> 1);
					final int i_28_ = class120_sub29.anInt2780 + (i_25_ >> 1);
					final int i_29_ = class120_sub29.anInt2765 - -(i_26_ >> 1);
					final int i_30_ = class120_sub29.anInt2765 - -(i_26_ - -1 >> 1);
					final int[][] is = Class120_Sub26.anIntArrayArrayArray2741[Class173.anInt1729];
					final int i_31_ = is[i_27_][i_29_] + is[i_28_][i_29_] + is[i_28_][i_30_] - -is[i_27_][i_30_] >> 2;
					Class180 class180 = null;
					final int i_32_ = Class25.anIntArray153[class120_sub29.anInt2772];
					if (i_32_ != 0) {
						if (i_32_ != 1) {
							if (i_32_ != 2) {
								if (i_32_ == 3) {
									final Class36 class36 = Class23.method202(Class173.anInt1729, class120_sub29.anInt2780, class120_sub29.anInt2765);
									if (class36 != null) {
										class180 = class36.aClass180_309;
									}
								}
							} else {
								final Class28 class28 = Class180_Sub3.method2315(Class173.anInt1729, class120_sub29.anInt2780, class120_sub29.anInt2765);
								if (class28 != null) {
									class180 = class28.aClass180_174;
								}
							}
						} else {
							final Class186 class186 = ObjType.method2108(Class173.anInt1729, class120_sub29.anInt2780, class120_sub29.anInt2765);
							if (class186 != null) {
								class180 = class186.aClass180_1901;
							}
						}
					} else {
						final Class182 class182 = Class105.method894(Class173.anInt1729, class120_sub29.anInt2780, class120_sub29.anInt2765);
						if (class182 != null) {
							class180 = class182.aClass180_1800;
						}
					}
					if (class180 != null) {
						Class38.method317(-1, Class173.anInt1729, 0, class120_sub29.anInt2780, class120_sub29.anInt2773 - -1, class120_sub29.anInt2765, (byte) 38, 0, i_32_, 1 + class120_sub29.anInt2771);
						class180_sub5.anInt3028 = class120_sub29.anInt2765 * 128 + i_26_ * 64;
						int i_33_ = class120_sub29.anInt2766;
						int i_34_ = class120_sub29.anInt2767;
						class180_sub5.anInt3033 = 128 * class120_sub29.anInt2780 + i_25_ * 64;
						class180_sub5.anInt2970 = i_31_;
						class180_sub5.anInt3042 = class120_sub29.anInt2771 - -Class101_Sub2.loopCycle;
						int i_35_ = class120_sub29.anInt2778;
						class180_sub5.anObject3047 = class180;
						class180_sub5.anInt3012 = class120_sub29.anInt2773 + Class101_Sub2.loopCycle;
						if (i_35_ < i_34_) {
							final int i_36_ = i_34_;
							i_34_ = i_35_;
							i_35_ = i_36_;
						}
						class180_sub5.anInt3041 = class120_sub29.anInt2780 + i_35_;
						class180_sub5.anInt3043 = class120_sub29.anInt2780 - -i_34_;
						int i_37_ = class120_sub29.anInt2779;
						if (i_37_ < i_33_) {
							final int i_38_ = i_33_;
							i_33_ = i_37_;
							i_37_ = i_38_;
						}
						class180_sub5.anInt3038 = i_37_ + class120_sub29.anInt2765;
						class180_sub5.anInt3020 = i_33_ + class120_sub29.anInt2765;
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("wd.HA(").append(i).append(')').toString());
		}
	}

	static final void method1316(final int i) {
		try {
			Class120_Sub24 class120_sub24 = (Class120_Sub24) Class120_Sub4.aClass105_2439.method893(1253231568);
			if (i < 72) {
				method1317(false, null, 69, -113);
			}
			for (/**/; class120_sub24 != null; class120_sub24 = (Class120_Sub24) Class120_Sub4.aClass105_2439.method899(122)) {
				if ((class120_sub24.anInt2720 ^ 0xffffffff) != 0) {
					class120_sub24.unlink();
				} else {
					class120_sub24.anInt2732 = 0;
					Class53.method457(class120_sub24, (byte) -126);
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("wd.EA(").append(i).append(')').toString());
		}
	}

	static final String method1317(final boolean bool, final String[] strings, final int i, final int i_39_) {
		String string;
		try {
			if (bool) {
				return null;
			}
			if (i_39_ == 0) {
				return "";
			}
			if (i_39_ == 1) {
				final String string_40_ = strings[i];
				if (string_40_ == null) {
					return "null";
				}
				return string_40_.toString();
			}
			int i_41_ = 0;
			final int i_42_ = i_39_ + i;
			for (int i_43_ = i; i_42_ > i_43_; i_43_++) {
				final String string_44_ = strings[i_43_];
				if (string_44_ != null) {
					i_41_ += string_44_.length();
				} else {
					i_41_ += 4;
				}
			}
			final StringBuffer stringbuffer = new StringBuffer(i_41_);
			for (int i_45_ = i; i_45_ < i_42_; i_45_++) {
				final String string_46_ = strings[i_45_];
				if (string_46_ == null) {
					stringbuffer.append("null");
				} else {
					stringbuffer.append(string_46_);
				}
			}
			string = stringbuffer.toString();
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("wd.DA(").append(bool).append(',').append(strings != null ? "{...}" : "null").append(',').append(i).append(',').append(i_39_).append(')').toString());
		}
		return string;
	}

	static final void drawTextOnScreen(final String string, final boolean bool) {
		final int i_49_ = Class120_Sub12_Sub20.aClass120_Sub14_Sub8_3286.method1468(string, 250);
		final int i_51_ = Class120_Sub12_Sub20.aClass120_Sub14_Sub8_3286.method1481(string, 250) * 13;
		if (HDToolkit.glEnabled) {
			GraphicsHD.fillRect(6, 6, i_49_ + 8, 8 + i_51_, 0);
			GraphicsHD.drawRect(6, 6, i_49_ + 8, 8 + i_51_, 16777215);
		} else {
			GraphicsLD.fillRect(6, 6, i_49_ + 8, 8 + i_51_, 0);
			GraphicsLD.drawRect(6, 6, i_49_ + 8, 8 + i_51_, 16777215);
		}
		Class120_Sub12_Sub20.aClass120_Sub14_Sub8_3286.method1462(string, 10, 10, i_49_, i_51_, 16777215, -1, 1, 1, 0);
		Class120_Sub12_Sub1.method1195(i_49_ + 8, i_51_ + 8, 6, 6);
		if (!bool) {
			Class54.method482(10, 10, i_51_, i_49_);
		} else if (HDToolkit.glEnabled) {
			HDToolkit.method536();
		} else {
			try {
				final Graphics graphics = Node.canvas.getGraphics();
				Class120_Sub13.fullscreenGraphics.drawImage(graphics, 0, 0);
			} catch (final Exception exception) {
				Node.canvas.repaint();
			}
		}
	}

	@Override
	final int[][] method1188(final int i, final int i_52_) {
		int[][] is;
		try {
			if (i_52_ != -29869) {
				aString3911 = null;
			}
			final int[][] is_53_ = this.aClass109_2559.method975(i, -48);
			if (this.aClass109_2559.aBoolean1049 && method1304(-128)) {
				final int[] is_54_ = is_53_[1];
				final int[] is_55_ = is_53_[2];
				final int i_56_ = this.anInt3290 * (i % this.anInt3290);
				final int[] is_57_ = is_53_[0];
				for (int i_58_ = 0; i_58_ < Class120_Sub12_Sub7.anInt3178; i_58_++) {
					final int i_59_ = this.anIntArray3296[i_56_ - -(i_58_ % this.anInt3292)];
					is_55_[i_58_] = Class120_Sub12_Sub3.method1207(i_59_, 255) << 4;
					is_54_[i_58_] = Class120_Sub12_Sub3.method1207(4080, i_59_ >> 4);
					is_57_[i_58_] = Class120_Sub12_Sub3.method1207(i_59_, 16711680) >> 12;
				}
			}
			is = is_53_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("wd.K(").append(i).append(',').append(i_52_).append(')').toString());
		}
		return is;
	}
}
