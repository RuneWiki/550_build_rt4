/* Class32 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.Date;

final class Class32 {
	private boolean aBoolean251 = false;
	int anInt252;
	private int anInt253;
	static int anInt254;
	int anInt255;
	static JagexInterface aClass189_256;
	int anInt257;
	int anInt258;
	static int anInt259;
	static int anInt260;
	int anInt261;
	int anInt262;
	static int[] anIntArray263 = { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0 };
	int anInt264 = 0;
	int anInt265;
	int anInt266;
	int anInt267 = 0;
	int anInt268;
	static int anInt269;
	static int anInt270;
	long aLong271;
	static int anInt272;

	static {
		anInt260 = 0;
		anInt269 = 0;
		anInt272 = 0;
	}

	private final void method268(final Buffer class120_sub7, final int i, final int i_0_) {
		try {
			if (i_0_ == 1) {
				anInt253 = class120_sub7.getUShort();
			} else if (i_0_ == 2) {
				class120_sub7.getUByte();
			} else if (i_0_ != 3) {
				if (i_0_ == 4) {
					this.anInt255 = class120_sub7.getUByte();
					this.anInt268 = class120_sub7.getInt();
				} else if (i_0_ == 6) {
					this.anInt266 = class120_sub7.getUByte();
				} else if (i_0_ != 8) {
					if (i_0_ != 9) {
						if (i_0_ == 10) {
							aBoolean251 = true;
						}
					} else {
						this.anInt264 = 1;
					}
				} else {
					this.anInt267 = 1;
				}
			} else {
				this.anInt257 = class120_sub7.getInt();
				this.anInt261 = class120_sub7.getInt();
				this.anInt252 = class120_sub7.getInt();
			}
			if (i != 2) {
				this.anInt267 = 119;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("dc.B(").append(class120_sub7 != null ? "{...}" : "null").append(',').append(i).append(',').append(i_0_).append(')').toString());
		}
	}

	public static void method269(final int i) {
		try {
			if (i == -20507) {
				aClass189_256 = null;
				anIntArray263 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("dc.D(").append(i).append(')').toString());
		}
	}

	static final String method270(final long l, final int i) {
		String string;
		try {
			Class90.aCalendar844.setTime(new Date(l));
			final int i_1_ = Class90.aCalendar844.get(7);
			final int i_2_ = Class90.aCalendar844.get(5);
			final int i_3_ = Class90.aCalendar844.get(2);
			final int i_4_ = Class90.aCalendar844.get(i);
			final int i_5_ = Class90.aCalendar844.get(11);
			final int i_6_ = Class90.aCalendar844.get(12);
			final int i_7_ = Class90.aCalendar844.get(13);
			string = new StringBuilder(Class69_Sub3.aStringArray2242[i_1_ - 1]).append(", ").append(i_2_ / 10).append(i_2_ % 10).append("-").append(Class120_Sub28.aStringArray2759[i_3_]).append("-").append(i_4_).append(" ").append(i_5_ / 10).append(i_5_ % 10).append(":").append(i_6_ / 10)
					.append(i_6_ % 10).append(":").append(i_7_ / 10).append(i_7_ % 10).append(" GMT").toString();
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("dc.G(").append(l).append(',').append(i).append(')').toString());
		}
		return string;
	}

	final void method271(final byte i) {
		try {
			if (i < 38) {
				method271((byte) -40);
			}
			this.anInt265 = Rasterizer.cosineTable[anInt253];
			this.anInt262 = (int) Math.sqrt(this.anInt252 * this.anInt252 + this.anInt257 * this.anInt257 - -(this.anInt261 * this.anInt261));
			if (this.anInt268 == 0) {
				this.anInt268 = 1;
			}
			if (this.anInt255 == 0) {
				this.aLong271 = 2147483647L;
			} else if (this.anInt255 != 1) {
				if (this.anInt255 == 2) {
					this.aLong271 = this.anInt262 * 8 / this.anInt268;
				}
			} else {
				this.aLong271 = this.anInt262 * 8 / this.anInt268;
				this.aLong271 *= this.aLong271;
			}
			if (aBoolean251) {
				this.anInt262 *= -1;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("dc.E(").append(i).append(')').toString());
		}
	}

	static final String method272(final boolean bool, Throwable throwable) throws IOException {
		if (bool) {
			anInt259 = -122;
		}
		String string;
		if (!(throwable instanceof RuntimeException_Sub1)) {
			string = "";
		} else {
			final RuntimeException_Sub1 runtimeexception_sub1 = (RuntimeException_Sub1) throwable;
			string = new StringBuilder(runtimeexception_sub1.aString2141).append(" | ").toString();
			throwable = runtimeexception_sub1.aThrowable2146;
		}
		final StringWriter stringwriter = new StringWriter();
		final PrintWriter printwriter = new PrintWriter(stringwriter);
		throwable.printStackTrace(printwriter);
		printwriter.close();
		final String string_8_ = stringwriter.toString();
		final BufferedReader bufferedreader = new BufferedReader(new StringReader(string_8_));
		final String string_9_ = bufferedreader.readLine();
		for (;;) {
			final String string_10_ = bufferedreader.readLine();
			if (string_10_ == null) {
				break;
			}
			final int i = string_10_.indexOf('(');
			final int i_11_ = string_10_.indexOf(')', 1 + i);
			String string_12_;
			if ((i ^ 0xffffffff) != 0) {
				string_12_ = string_10_.substring(0, i);
			} else {
				string_12_ = string_10_;
			}
			string_12_ = string_12_.trim();
			string_12_ = string_12_.substring(string_12_.lastIndexOf(' ') - -1);
			string_12_ = string_12_.substring(1 + string_12_.lastIndexOf('\t'));
			string = new StringBuilder(string).append(string_12_).toString();
			if ((i ^ 0xffffffff) != 0 && (i_11_ ^ 0xffffffff) != 0) {
				final int i_13_ = string_10_.indexOf(".java:", i);
				if (i_13_ >= 0) {
					string = new StringBuilder(string).append(string_10_.substring(5 + i_13_, i_11_)).toString();
				}
			}
			string = new StringBuilder(string).append(' ').toString();
		}
		string = new StringBuilder(string).append("| ").append(string_9_).toString();
		return string;
	}

	static final Class180_Sub7 method273(final int i, final int i_14_, final Class40 class40, final int i_15_, final int i_16_, final int i_17_, final Class180_Sub7 class180_sub7, int i_18_, final int i_19_, final int i_20_, final boolean bool, final int i_21_, final int i_22_, final int i_23_) {
		Class180_Sub7 class180_sub7_24_;
		try {
			final long l = ((long) i_21_ << 32) + (i_17_ << 24) + (i_22_ << 16) + i_16_ - -((long) i << 48);
			Class180_Sub7 class180_sub7_25_ = (Class180_Sub7) Class154.aClass21_1438.get(l);
			if (class180_sub7_25_ == null) {
				int i_26_;
				if (i_16_ == 1) {
					i_26_ = 9;
				} else if (i_16_ == 2) {
					i_26_ = 12;
				} else if (i_16_ != 3) {
					if (i_16_ == 4) {
						i_26_ = 18;
					} else {
						i_26_ = 21;
					}
				} else {
					i_26_ = 15;
				}
				final int[] is = { 64, 96, 128 };
				final int[][] is_28_ = new int[3][i_26_];
				final Class180_Sub2 class180_sub2 = new Class180_Sub2(3 * i_26_ + 1, 2 * i_26_ * 3 + -i_26_, 0);
				final int i_29_ = class180_sub2.method2302(0, 0, 0);
				for (int i_30_ = 0; i_30_ < 3; i_30_++) {
					final int i_31_ = is[i_30_];
					final int i_32_ = is[i_30_];
					for (int i_33_ = 0; i_26_ > i_33_; i_33_++) {
						final int i_34_ = (i_33_ << 11) / i_26_;
						final int i_35_ = Rasterizer.sineTable[i_34_] * i_31_ + i_23_ >> 16;
						final int i_36_ = Rasterizer.cosineTable[i_34_] * i_32_ + i_20_ >> 16;
						is_28_[i_30_][i_33_] = class180_sub2.method2302(i_35_, 0, i_36_);
					}
				}
				for (int i_37_ = 0; i_37_ < 3; i_37_++) {
					final int i_38_ = (256 * i_37_ + 128) / 3;
					final int i_39_ = -i_38_ + 256;
					final byte i_40_ = (byte) (i_38_ * i_17_ + i_39_ * i_22_ >> 8);
					final short i_41_ = (short) ((0xfc0000 & i_38_ * (i & 0xfc00) + i_39_ * (0xfc00 & i_21_)) + (0x38000 & (i & 0x380) * i_38_ + i_39_ * (0x380 & i_21_)) + (0x7f00 & (i_21_ & 0x7f) * i_39_ + i_38_ * (0x7f & i)) >> 8);
					for (int i_42_ = 0; i_26_ > i_42_; i_42_++) {
						if (i_37_ != 0) {
							class180_sub2.method2295(is_28_[i_37_ - 1][i_42_], is_28_[i_37_ - 1][(1 + i_42_) % i_26_], is_28_[i_37_][(i_42_ + 1) % i_26_], (byte) 1, i_41_, i_40_);
							class180_sub2.method2295(is_28_[i_37_ - 1][i_42_], is_28_[i_37_][(i_42_ - -1) % i_26_], is_28_[i_37_][i_42_], (byte) 1, i_41_, i_40_);
						} else {
							class180_sub2.method2295(i_29_, is_28_[0][(1 + i_42_) % i_26_], is_28_[0][i_42_], (byte) 1, i_41_, i_40_);
						}
					}
				}
				class180_sub7_25_ = class180_sub2.method2300(64, 768, -50, -10, -50);
				Class154.aClass21_1438.put(class180_sub7_25_, l);
			}
			final int i_43_ = 64 * i_16_ - 1;
			int i_44_ = -i_43_;
			if (i_14_ != 2) {
				method269(2);
			}
			int i_45_ = i_43_;
			int i_46_ = -i_43_;
			int i_47_ = i_43_;
			if (bool) {
				if (i_15_ > 128 && i_15_ < 896) {
					i_44_ -= 128;
				}
				if (i_15_ > 1664 || i_15_ < 384) {
					i_46_ -= 128;
				}
				if (i_15_ > 1152 && i_15_ < 1920) {
					i_45_ += 128;
				}
				if (i_15_ > 640 && i_15_ < 1408) {
					i_47_ += 128;
				}
			}
			int i_48_ = class180_sub7.method2374();
			int i_49_ = class180_sub7.method2383();
			int i_50_ = class180_sub7.method2363();
			if (i_45_ < i_49_) {
				i_49_ = i_45_;
			}
			if (i_46_ > i_50_) {
				i_50_ = i_46_;
			}
			int i_51_ = class180_sub7.method2386();
			if (i_48_ < i_44_) {
				i_48_ = i_44_;
			}
			if (i_51_ > i_47_) {
				i_51_ = i_47_;
			}
			Class120_Sub14_Sub18 class120_sub14_sub18 = null;
			if (class40 != null) {
				i_18_ = class40.anIntArray342[i_18_];
				class120_sub14_sub18 = Class120_Sub12_Sub31.method1367(i_18_ >> 16, -1);
				i_18_ &= 0xffff;
			}
			if (class120_sub14_sub18 == null) {
				class180_sub7_25_ = class180_sub7_25_.method2381(true, true, true);
				class180_sub7_25_.method2369((i_49_ + -i_48_) / 2, 128, (i_51_ - i_50_) / 2);
				class180_sub7_25_.method2368((i_48_ + i_49_) / 2, 0, (i_50_ - -i_51_) / 2);
			} else {
				class180_sub7_25_ = class180_sub7_25_.method2381(!class120_sub14_sub18.method1578((byte) -39, i_18_), !class120_sub14_sub18.method1579(3, i_18_), true);
				class180_sub7_25_.method2369((-i_48_ + i_49_) / 2, 128, (i_51_ - i_50_) / 2);
				class180_sub7_25_.method2368((i_49_ + i_48_) / 2, 0, (i_50_ + i_51_) / 2);
				class180_sub7_25_.method2389(class120_sub14_sub18, i_18_);
			}
			if (i_15_ != 0) {
				class180_sub7_25_.method2360(i_15_);
			}
			if (HDToolkit.glEnabled) {
				final Class180_Sub7_Sub2 class180_sub7_sub2 = (Class180_Sub7_Sub2) class180_sub7_25_;
				if (i_19_ != Class22.method197(Class173.gameLevel, i_23_ + i_48_, i_50_ + i_20_) || Class22.method197(Class173.gameLevel, i_49_ + i_23_, i_51_ + i_20_) != i_19_) {
					for (int i_52_ = 0; class180_sub7_sub2.anInt3862 > i_52_; i_52_++) {
						class180_sub7_sub2.anIntArray3856[i_52_] += Class22.method197(Class173.gameLevel, i_23_ + class180_sub7_sub2.anIntArray3878[i_52_], i_20_ + class180_sub7_sub2.anIntArray3845[i_52_]) + -i_19_;
					}
					class180_sub7_sub2.aClass49_3847.aBoolean439 = false;
					class180_sub7_sub2.aClass13_3870.aBoolean89 = false;
				}
			} else {
				final Class180_Sub7_Sub1 class180_sub7_sub1 = (Class180_Sub7_Sub1) class180_sub7_25_;
				if (i_19_ != Class22.method197(Class173.gameLevel, i_48_ + i_23_, i_50_ + i_20_) || i_19_ != Class22.method197(Class173.gameLevel, i_23_ - -i_49_, i_51_ + i_20_)) {
					for (int i_53_ = 0; class180_sub7_sub1.anInt3793 > i_53_; i_53_++) {
						class180_sub7_sub1.yVertices[i_53_] += Class22.method197(Class173.gameLevel, class180_sub7_sub1.xVertices[i_53_] - -i_23_, class180_sub7_sub1.zVertices[i_53_] + i_20_) - i_19_;
					}
					class180_sub7_sub1.boundsCalculated = false;
				}
			}
			class180_sub7_24_ = class180_sub7_25_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, "dc.F(");
		}
		return class180_sub7_24_;
	}

	public Class32() {
		/* empty */
	}

	final void method274(final Buffer class120_sub7, final byte i) {
		try {
			if (i < 38) {
				method269(-66);
			}
			for (;;) {
				final int i_54_ = class120_sub7.getUByte();
				if (i_54_ == 0) {
					break;
				}
				method268(class120_sub7, 2, i_54_);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("dc.A(").append(class120_sub7 != null ? "{...}" : "null").append(',').append(i).append(')').toString());
		}
	}
}
