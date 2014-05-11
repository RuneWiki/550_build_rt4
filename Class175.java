/* Class175 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

final class Class175 {
	private Class63 aClass63_1736;
	private Class63 aClass63_1737;
	private Class63 aClass63_1738;
	int anInt1739 = 500;
	private Class63 aClass63_1740;
	private static int[] anIntArray1741;
	private Class63 aClass63_1742;
	private int anInt1743;
	private int anInt1744;
	int anInt1745 = 0;
	private Class63 aClass63_1746;
	private static int[] anIntArray1747;
	private Class63 aClass63_1748;
	private final int[] anIntArray1749;
	private final int[] anIntArray1750;
	private Class146 aClass146_1751;
	private final int[] anIntArray1752 = new int[5];
	private Class63 aClass63_1753;
	private static int[] anIntArray1754 = new int[32768];
	private static int[] anIntArray1755;
	private static int[] anIntArray1756;
	private static int[] anIntArray1757;
	private static int[] anIntArray1758;
	private Class63 aClass63_1759;
	private static int[] anIntArray1760;

	static {
		final Random random = new Random(0L);
		for (int i = 0; i < 32768; i++) {
			anIntArray1754[i] = (random.nextInt() & 0x2) - 1;
		}
		anIntArray1741 = new int[32768];
		for (int i = 0; i < 32768; i++) {
			anIntArray1741[i] = (int) (Math.sin(i / 5215.1903) * 16384.0);
		}
		anIntArray1747 = new int[220500];
		anIntArray1756 = new int[5];
		anIntArray1755 = new int[5];
		anIntArray1758 = new int[5];
		anIntArray1757 = new int[5];
		anIntArray1760 = new int[5];
	}

	final void method2238(final Buffer class120_sub7) {
		aClass63_1748 = new Class63();
		aClass63_1748.method572(class120_sub7);
		aClass63_1740 = new Class63();
		aClass63_1740.method572(class120_sub7);
		int i = class120_sub7.getUByte();
		if (i != 0) {
			class120_sub7.pos--;
			aClass63_1746 = new Class63();
			aClass63_1746.method572(class120_sub7);
			aClass63_1753 = new Class63();
			aClass63_1753.method572(class120_sub7);
		}
		i = class120_sub7.getUByte();
		if (i != 0) {
			class120_sub7.pos--;
			aClass63_1742 = new Class63();
			aClass63_1742.method572(class120_sub7);
			aClass63_1737 = new Class63();
			aClass63_1737.method572(class120_sub7);
		}
		i = class120_sub7.getUByte();
		if (i != 0) {
			class120_sub7.pos--;
			aClass63_1738 = new Class63();
			aClass63_1738.method572(class120_sub7);
			aClass63_1736 = new Class63();
			aClass63_1736.method572(class120_sub7);
		}
		for (int i_0_ = 0; i_0_ < 10; i_0_++) {
			final int i_1_ = class120_sub7.method1081((byte) 98);
			if (i_1_ == 0) {
				break;
			}
			anIntArray1750[i_0_] = i_1_;
			anIntArray1749[i_0_] = class120_sub7.getSmart();
			anIntArray1752[i_0_] = class120_sub7.method1081((byte) 98);
		}
		anInt1743 = class120_sub7.method1081((byte) 98);
		anInt1744 = class120_sub7.method1081((byte) 98);
		this.anInt1739 = class120_sub7.getUShort();
		this.anInt1745 = class120_sub7.getUShort();
		aClass146_1751 = new Class146();
		aClass63_1759 = new Class63();
		aClass146_1751.method2054(class120_sub7, aClass63_1759);
	}

	public static void method2239() {
		anIntArray1747 = null;
		anIntArray1754 = null;
		anIntArray1741 = null;
		anIntArray1758 = null;
		anIntArray1756 = null;
		anIntArray1757 = null;
		anIntArray1760 = null;
		anIntArray1755 = null;
	}

	final int[] method2240(final int i, final int i_2_) {
		Class4.method92(anIntArray1747, 0, i);
		if (i_2_ < 10) {
			return anIntArray1747;
		}
		final double d = i / (i_2_ + 0.0);
		aClass63_1748.method571();
		aClass63_1740.method571();
		int i_3_ = 0;
		int i_4_ = 0;
		int i_5_ = 0;
		if (aClass63_1746 != null) {
			aClass63_1746.method571();
			aClass63_1753.method571();
			i_3_ = (int) ((aClass63_1746.anInt579 - aClass63_1746.anInt580) * 32.768 / d);
			i_4_ = (int) (aClass63_1746.anInt580 * 32.768 / d);
		}
		int i_6_ = 0;
		int i_7_ = 0;
		int i_8_ = 0;
		if (aClass63_1742 != null) {
			aClass63_1742.method571();
			aClass63_1737.method571();
			i_6_ = (int) ((aClass63_1742.anInt579 - aClass63_1742.anInt580) * 32.768 / d);
			i_7_ = (int) (aClass63_1742.anInt580 * 32.768 / d);
		}
		for (int i_9_ = 0; i_9_ < 5; i_9_++) {
			if (anIntArray1750[i_9_] != 0) {
				anIntArray1758[i_9_] = 0;
				anIntArray1756[i_9_] = (int) (anIntArray1752[i_9_] * d);
				anIntArray1757[i_9_] = (anIntArray1750[i_9_] << 14) / 100;
				anIntArray1760[i_9_] = (int) ((aClass63_1748.anInt579 - aClass63_1748.anInt580) * 32.768 * Math.pow(1.0057929410678534, anIntArray1749[i_9_]) / d);
				anIntArray1755[i_9_] = (int) (aClass63_1748.anInt580 * 32.768 / d);
			}
		}
		for (int i_10_ = 0; i_10_ < i; i_10_++) {
			int i_11_ = aClass63_1748.method573(i);
			int i_12_ = aClass63_1740.method573(i);
			if (aClass63_1746 != null) {
				final int i_13_ = aClass63_1746.method573(i);
				final int i_14_ = aClass63_1753.method573(i);
				i_11_ += method2241(i_5_, i_14_, aClass63_1746.anInt582) >> 1;
				i_5_ += (i_13_ * i_3_ >> 16) + i_4_;
			}
			if (aClass63_1742 != null) {
				final int i_15_ = aClass63_1742.method573(i);
				final int i_16_ = aClass63_1737.method573(i);
				i_12_ = i_12_ * ((method2241(i_8_, i_16_, aClass63_1742.anInt582) >> 1) + 32768) >> 15;
				i_8_ += (i_15_ * i_6_ >> 16) + i_7_;
			}
			for (int i_17_ = 0; i_17_ < 5; i_17_++) {
				if (anIntArray1750[i_17_] != 0) {
					final int i_18_ = i_10_ + anIntArray1756[i_17_];
					if (i_18_ < i) {
						anIntArray1747[i_18_] += method2241(anIntArray1758[i_17_], i_12_ * anIntArray1757[i_17_] >> 15, aClass63_1748.anInt582);
						anIntArray1758[i_17_] += (i_11_ * anIntArray1760[i_17_] >> 16) + anIntArray1755[i_17_];
					}
				}
			}
		}
		if (aClass63_1738 != null) {
			aClass63_1738.method571();
			aClass63_1736.method571();
			int i_19_ = 0;
			boolean bool = true;
			for (int i_20_ = 0; i_20_ < i; i_20_++) {
				final int i_21_ = aClass63_1738.method573(i);
				final int i_22_ = aClass63_1736.method573(i);
				int i_23_;
				if (bool) {
					i_23_ = aClass63_1738.anInt580 + ((aClass63_1738.anInt579 - aClass63_1738.anInt580) * i_21_ >> 8);
				} else {
					i_23_ = aClass63_1738.anInt580 + ((aClass63_1738.anInt579 - aClass63_1738.anInt580) * i_22_ >> 8);
				}
				i_19_ += 256;
				if (i_19_ >= i_23_) {
					i_19_ = 0;
					bool = !bool;
				}
				if (bool) {
					anIntArray1747[i_20_] = 0;
				}
			}
		}
		if (anInt1743 > 0 && anInt1744 > 0) {
			final int i_24_ = (int) (anInt1743 * d);
			for (int i_25_ = i_24_; i_25_ < i; i_25_++) {
				anIntArray1747[i_25_] += anIntArray1747[i_25_ - i_24_] * anInt1744 / 100;
			}
		}
		if (aClass146_1751.anIntArray1391[0] > 0 || aClass146_1751.anIntArray1391[1] > 0) {
			aClass63_1759.method571();
			int i_26_ = aClass63_1759.method573(i + 1);
			int i_27_ = aClass146_1751.method2052(0, i_26_ / 65536.0F);
			int i_28_ = aClass146_1751.method2052(1, i_26_ / 65536.0F);
			if (i >= i_27_ + i_28_) {
				int i_29_ = 0;
				int i_30_ = i_28_;
				if (i_30_ > i - i_27_) {
					i_30_ = i - i_27_;
				}
				for (/**/; i_29_ < i_30_; i_29_++) {
					int i_31_ = (int) ((long) anIntArray1747[i_29_ + i_27_] * (long) Class146.anInt1388 >> 16);
					for (int i_32_ = 0; i_32_ < i_27_; i_32_++) {
						i_31_ += (int) ((long) anIntArray1747[i_29_ + i_27_ - 1 - i_32_] * (long) Class146.anIntArrayArray1387[0][i_32_] >> 16);
					}
					for (int i_33_ = 0; i_33_ < i_29_; i_33_++) {
						i_31_ -= (int) ((long) anIntArray1747[i_29_ - 1 - i_33_] * (long) Class146.anIntArrayArray1387[1][i_33_] >> 16);
					}
					anIntArray1747[i_29_] = i_31_;
					i_26_ = aClass63_1759.method573(i + 1);
				}
				i_30_ = 128;
				for (;;) {
					if (i_30_ > i - i_27_) {
						i_30_ = i - i_27_;
					}
					for (/**/; i_29_ < i_30_; i_29_++) {
						int i_34_ = (int) ((long) anIntArray1747[i_29_ + i_27_] * (long) Class146.anInt1388 >> 16);
						for (int i_35_ = 0; i_35_ < i_27_; i_35_++) {
							i_34_ += (int) ((long) anIntArray1747[i_29_ + i_27_ - 1 - i_35_] * (long) Class146.anIntArrayArray1387[0][i_35_] >> 16);
						}
						for (int i_36_ = 0; i_36_ < i_28_; i_36_++) {
							i_34_ -= (int) ((long) anIntArray1747[i_29_ - 1 - i_36_] * (long) Class146.anIntArrayArray1387[1][i_36_] >> 16);
						}
						anIntArray1747[i_29_] = i_34_;
						i_26_ = aClass63_1759.method573(i + 1);
					}
					if (i_29_ >= i - i_27_) {
						break;
					}
					i_27_ = aClass146_1751.method2052(0, i_26_ / 65536.0F);
					i_28_ = aClass146_1751.method2052(1, i_26_ / 65536.0F);
					i_30_ += 128;
				}
				for (/**/; i_29_ < i; i_29_++) {
					int i_37_ = 0;
					for (int i_38_ = i_29_ + i_27_ - i; i_38_ < i_27_; i_38_++) {
						i_37_ += (int) ((long) anIntArray1747[i_29_ + i_27_ - 1 - i_38_] * (long) Class146.anIntArrayArray1387[0][i_38_] >> 16);
					}
					for (int i_39_ = 0; i_39_ < i_28_; i_39_++) {
						i_37_ -= (int) ((long) anIntArray1747[i_29_ - 1 - i_39_] * (long) Class146.anIntArrayArray1387[1][i_39_] >> 16);
					}
					anIntArray1747[i_29_] = i_37_;
					i_26_ = aClass63_1759.method573(i + 1);
				}
			}
		}
		for (int i_40_ = 0; i_40_ < i; i_40_++) {
			if (anIntArray1747[i_40_] < -32768) {
				anIntArray1747[i_40_] = -32768;
			}
			if (anIntArray1747[i_40_] > 32767) {
				anIntArray1747[i_40_] = 32767;
			}
		}
		return anIntArray1747;
	}

	private final int method2241(final int i, final int i_41_, final int i_42_) {
		if (i_42_ == 1) {
			if ((i & 0x7fff) < 16384) {
				return i_41_;
			}
			return -i_41_;
		}
		if (i_42_ == 2) {
			return anIntArray1741[i & 0x7fff] * i_41_ >> 14;
		}
		if (i_42_ == 3) {
			return ((i & 0x7fff) * i_41_ >> 14) - i_41_;
		}
		if (i_42_ == 4) {
			return anIntArray1754[i / 2607 & 0x7fff] * i_41_;
		}
		return 0;
	}

	public Class175() {
		anIntArray1750 = new int[5];
		anInt1743 = 0;
		anIntArray1749 = new int[5];
		anInt1744 = 100;
	}
}
