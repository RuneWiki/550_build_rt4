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
	int anInt182;
	static int[] locationsMapFileIds;
	int anInt184;
	int anInt185;
	long bitPacked = 0L;

	static final void method242(final String[] strings, final short[] is) {
		Class148.method2057(strings, strings.length - 1, is, 0);
	}

	static final int method244(final Random random, final int i) {
		if (i <= 0) {
			throw new IllegalArgumentException();
		}
		if (Class179.isPowerOfTwo(i)) {
			return (int) ((random.nextInt() & 0xffffffffL) * i >> 32);
		}
		final int i_2_ = -(int) (4294967296L % i) + -2147483648;
		int i_3_;
		do {
			i_3_ = random.nextInt();
		} while (i_3_ >= i_2_);
		return Class120_Sub14_Sub15.method1558(i_3_, -1, i);
	}

	static final void method247() {
		OverridedJInterface.reflectionCheckDeque = new Deque();
	}

	public Class28() {
		/* empty */
	}
}
