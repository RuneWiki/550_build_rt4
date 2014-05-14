/* Class28 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

final class Class28 {
	int anInt171;
	int anInt172;
	int anInt173;
	SceneGraphNode aClass180_174;
	int anInt175;
	static int anInt176;
	int anInt177;
	int anInt178;
	int anInt179;
	int anInt180;
	static Class50 aClass50_181;
	int anInt182;
	static int[] anIntArray183;
	int anInt184;
	int anInt185;
	long bitPacked = 0L;

	static final void method242(final short[] is, final int i, final String[] strings) {
		try {
			Class148.method2057(strings, true, -1 + strings.length, is, 0);
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("co.F(").append(is != null ? "{...}" : "null").append(',').append(i).append(',').append(strings != null ? "{...}" : "null").append(')').toString());
		}
	}

	static final void method243(final boolean bool) {
		try {
			if (!bool) {
				method243(false);
			}
			Canvas_Sub1.aClass75_15 = new Hashtable(32);
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("co.A(").append(bool).append(')').toString());
		}
	}

	static final int method244(final Random random, final int i, final int i_0_) {
		int i_1_;
		try {
			if (i <= 0) {
				throw new IllegalArgumentException();
			}
			if (Class179.method2264((byte) -121, i)) {
				return (int) ((random.nextInt() & 0xffffffffL) * i >> 32);
			}
			final int i_2_ = -(int) (4294967296L % i) + -2147483648;
			int i_3_;
			do {
				i_3_ = random.nextInt();
			} while (i_3_ >= i_2_);
			i_1_ = Class120_Sub14_Sub15.method1558(i_3_, -1, i);
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("co.D(").append(random != null ? "{...}" : "null").append(',').append(i).append(',').append(i_0_).append(')').toString());
		}
		return i_1_;
	}

	public static void method245(final int i) {
		try {
			aClass50_181 = null;
			if (i == 8856) {
				anIntArray183 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("co.C(").append(i).append(')').toString());
		}
	}

	static final Class120_Sub14_Sub12 method246(final boolean bool, final int i) {
		Class120_Sub14_Sub12 class120_sub14_sub12;
		try {
			Class120_Sub14_Sub12 class120_sub14_sub12_4_ = (Class120_Sub14_Sub12) Class128.aClass35_1219.method302(17301, i);
			if (class120_sub14_sub12_4_ != null) {
				return class120_sub14_sub12_4_;
			}
			final byte[] is = IsaacCipher.aClass50_1019.getFile(i, 0);
			if (is == null || is.length <= 1) {
				return null;
			}
			class120_sub14_sub12_4_ = Class120_Sub19.method1676((byte) 63, is);
			if (bool) {
				method247();
			}
			Class128.aClass35_1219.method301(i, 45, class120_sub14_sub12_4_);
			class120_sub14_sub12 = class120_sub14_sub12_4_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("co.E(").append(bool).append(',').append(i).append(')').toString());
		}
		return class120_sub14_sub12;
	}

	static final void method247() {
		OverridedJInterface.aClass105_2746 = new Deque();
	}

	public Class28() {
		/* empty */
	}
}
