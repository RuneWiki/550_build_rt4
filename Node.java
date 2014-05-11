/* Class120 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;

class Node {
	static int anInt1143;
	Node previous;
	Node next;
	static int countryId;
	long uid;
	static String aString1148 = "purple:";
	static Canvas canvas;
	static Class189[][] aClass189ArrayArray1150;
	static int[] anIntArray1151 = { 1, 4 };

	static final void method1029(final byte i) {
		try {
			if (Class88.aBoolean828 && i == 126) {
				final Class189 class189 = Class120_Sub13.method1404(AbstractMouseWheelHandler.anInt119, (byte) 82, Class46.anInt420);
				if (class189 != null && class189.anObjectArray2000 != null) {
					final Class120_Sub10 class120_sub10 = new Class120_Sub10();
					class120_sub10.anObjectArray2537 = class189.anObjectArray2000;
					class120_sub10.aClass189_2534 = class189;
					Class88.method744(true, class120_sub10);
				}
				Class88.aBoolean828 = false;
				Class192.anInt2123 = -1;
				InterfaceClickMask.redrawInterface(class189);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ni.VA(").append(i).append(')').toString());
		}
	}

	public static void method1030(final int i) {
		try {
			aString1148 = null;
			canvas = null;
			aClass189ArrayArray1150 = null;
			anIntArray1151 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ni.TA(").append(i).append(')').toString());
		}
	}

	static final void method1031(final int i, final int i_0_, final int i_1_, final int i_2_, final int i_3_, final int i_4_) {
		try {
			int i_5_ = i_0_;
			int i_6_ = 0;
			final int i_7_ = i_0_ * i_0_;
			final int i_8_ = i_2_ * i_2_;
			final int i_9_ = i_8_ << 1;
			final int i_10_ = i_7_ << 1;
			final int i_11_ = i_0_ << 1;
			int i_12_ = -((i_11_ - 1) * i_9_) + i_7_;
			int i_13_ = (-i_11_ + 1) * i_8_ - -i_10_;
			final int i_14_ = i_8_ << 2;
			final int i_15_ = i_7_ << 2;
			int i_16_ = i_10_ * ((i_6_ << 1) + 3);
			int i_17_ = i_15_ * (1 + i_6_);
			int i_18_ = (-3 + (i_5_ << 1)) * i_9_;
			if (i >= Class120_Sub30_Sub2.anInt3699 && Class139.anInt1334 >= i) {
				final int i_19_ = Class3.method83(Class32.anInt260, i_3_ + i_2_, 1, Class120_Sub14_Sub11.anInt3544);
				final int i_20_ = Class3.method83(Class32.anInt260, i_3_ - i_2_, 1, Class120_Sub14_Sub11.anInt3544);
				Class120_Sub8.method1160((byte) 115, GameEntity.anIntArrayArray3009[i], i_1_, i_20_, i_19_);
			}
			int i_21_ = i_14_ * (i_5_ + -1);
			while (i_5_ > 0) {
				if (i_13_ < 0) {
					while (i_13_ < 0) {
						i_13_ += i_16_;
						i_12_ += i_17_;
						i_17_ += i_15_;
						i_16_ += i_15_;
						i_6_++;
					}
				}
				i_5_--;
				if (i_12_ < 0) {
					i_12_ += i_17_;
					i_17_ += i_15_;
					i_13_ += i_16_;
					i_6_++;
					i_16_ += i_15_;
				}
				i_13_ += -i_21_;
				final int i_22_ = -i_5_ + i;
				i_12_ += -i_18_;
				i_21_ -= i_14_;
				final int i_23_ = i_5_ + i;
				i_18_ -= i_14_;
				if (i_23_ >= Class120_Sub30_Sub2.anInt3699 && Class139.anInt1334 >= i_22_) {
					final int i_24_ = Class3.method83(Class32.anInt260, i_6_ + i_3_, 1, Class120_Sub14_Sub11.anInt3544);
					final int i_25_ = Class3.method83(Class32.anInt260, i_3_ - i_6_, 1, Class120_Sub14_Sub11.anInt3544);
					if (Class120_Sub30_Sub2.anInt3699 <= i_22_) {
						Class120_Sub8.method1160((byte) 115, GameEntity.anIntArrayArray3009[i_22_], i_1_, i_25_, i_24_);
					}
					if (i_23_ <= Class139.anInt1334) {
						Class120_Sub8.method1160((byte) 115, GameEntity.anIntArrayArray3009[i_23_], i_1_, i_25_, i_24_);
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ni.AB(").append(i).append(',').append(i_0_).append(',').append(i_1_).append(',').append(i_2_).append(',').append(i_3_).append(',').append(i_4_).append(')').toString());
		}
	}

	final boolean hasPrevious() {
		if (this.previous == null) {
			return false;
		}
		return true;
	}

	static final String method1033(final byte i, final int i_26_) {
		String string;
		try {
			if (i != 126) {
				return null;
			}
			String string_27_ = Integer.toString(i_26_);
			for (int i_28_ = string_27_.length() - 3; i_28_ > 0; i_28_ -= 3) {
				string_27_ = new StringBuilder(string_27_.substring(0, i_28_)).append(",").append(string_27_.substring(i_28_)).toString();
			}
			if (string_27_.length() > 9) {
				return new StringBuilder(" <col=00ff80>").append(string_27_.substring(0, string_27_.length() - 8)).append(Class120_Sub19.aString2653).append(" (").append(string_27_).append(")</col>").toString();
			}
			if (string_27_.length() > 6) {
				return new StringBuilder(" <col=ffffff>").append(string_27_.substring(0, -4 + string_27_.length())).append(Class91.aString854).append(" (").append(string_27_).append(")</col>").toString();
			}
			string = new StringBuilder(" <col=ffff00>").append(string_27_).append("</col>").toString();
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ni.WA(").append(i).append(',').append(i_26_).append(')').toString());
		}
		return string;
	}

	final void unlink() {
		if (this.previous != null) {
			this.previous.next = this.next;
			this.next.previous = this.previous;
			this.previous = null;
			this.next = null;
		}
	}

	public Node() {
		/* empty */
	}
}
