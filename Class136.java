/* Class136 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

final class Class136 {
	static int[] anIntArray1315 = new int[100];
	static String aString1316;
	static boolean aBoolean1317 = false;
	static int worldId;
	static Random aRandom1319;
	static volatile int anInt1320;
	static int anInt1321;

	static {
		aString1316 = "glow3:";
		worldId = 1;
		aRandom1319 = new Random();
		anInt1320 = 0;
	}

	static final String method1977(final boolean bool, long l) {
		String string;
		try {
			if (bool) {
				method1978(0, 92, 4, -71, null, -105L, null, null);
			}
			if (-1L <= (l ^ 0xffffffffffffffffL) || -6582952005840035282L >= (l ^ 0xffffffffffffffffL)) {
				return null;
			}
			if ((l % 37L ^ 0xffffffffffffffffL) == -1L) {
				return null;
			}
			int i = 0;
			for (long l_0_ = l; 0L != l_0_; l_0_ /= 37L) {
				i++;
			}
			final StringBuffer stringbuffer = new StringBuffer(i);
			while (-1L != (l ^ 0xffffffffffffffffL)) {
				final long l_1_ = l;
				l /= 37L;
				char c = Class120_Sub12_Sub16.aCharArray3254[(int) (-(l * 37L) + l_1_)];
				if (c == '_') {
					c = '\u00a0';
					final int i_2_ = stringbuffer.length() + -1;
					stringbuffer.setCharAt(i_2_, Character.toUpperCase(stringbuffer.charAt(i_2_)));
				}
				stringbuffer.append(c);
			}
			stringbuffer.reverse();
			stringbuffer.setCharAt(0, Character.toUpperCase(stringbuffer.charAt(0)));
			string = stringbuffer.toString();
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("pn.A(").append(bool).append(',').append(l).append(')').toString());
		}
		return string;
	}

	static final void method1978(final int i, final int i_3_, final int i_4_, final int i_5_, final Class180 class180, final long l, final Class180 class180_6_, final Class180 class180_7_) {
		final Class183 class183 = new Class183();
		class183.aClass180_1810 = class180;
		class183.anInt1803 = i_3_ * 128 + 64;
		class183.anInt1814 = i_4_ * 128 + 64;
		class183.anInt1813 = i_5_;
		class183.aLong1806 = l;
		class183.aClass180_1812 = class180_6_;
		class183.aClass180_1807 = class180_7_;
		int i_8_ = 0;
		final Class120_Sub18 class120_sub18 = Class120_Sub1.aClass120_Sub18ArrayArrayArray2411[i][i_3_][i_4_];
		if (class120_sub18 != null) {
			for (int i_9_ = 0; i_9_ < class120_sub18.anInt2638; i_9_++) {
				final Class28 class28 = class120_sub18.aClass28Array2625[i_9_];
				if ((class28.aLong186 & 0x400000L) == 4194304L) {
					final int i_10_ = class28.aClass180_174.getMaxY();
					if (i_10_ != -32768 && i_10_ < i_8_) {
						i_8_ = i_10_;
					}
				}
			}
		}
		class183.anInt1811 = -i_8_;
		if (Class120_Sub1.aClass120_Sub18ArrayArrayArray2411[i][i_3_][i_4_] == null) {
			Class120_Sub1.aClass120_Sub18ArrayArrayArray2411[i][i_3_][i_4_] = new Class120_Sub18(i, i_3_, i_4_);
		}
		Class120_Sub1.aClass120_Sub18ArrayArrayArray2411[i][i_3_][i_4_].aClass183_2634 = class183;
	}

	public static void method1979(final int i) {
		try {
			aString1316 = null;
			if (i != 64) {
				method1978(-90, -53, -118, 99, null, -12L, null, null);
			}
			aRandom1319 = null;
			anIntArray1315 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("pn.B(").append(i).append(')').toString());
		}
	}
}
