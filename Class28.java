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
	static js5 aClass50_181;
	int anInt182;
	static int[] anIntArray183;
	int anInt184;
	int anInt185;
	long bitPacked = 0L;

	static final void method242(final short[] is, final int i, final String[] strings) {
		try {
			Class148.method2057(strings, true, -1 + strings.length, is, 0);
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("co.F(").append(is != null ? "{...}" : "null").append(',').append(i).append(',').append(strings != null ? "{...}" : "null").append(')').toString());
		}
	}

	static final void method243(final boolean bool) {
		try {
			if (!bool) {
				method243(false);
			}
			ObjectContainer.objectContainerCache = new Hashtable(32);
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("co.A(").append(bool).append(')').toString());
		}
	}

	static final int method244(final Random random, final int i) {
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
		return Class120_Sub14_Sub15.method1558(i_3_, -1, i);
	}

	public static void method245(final int i) {
		try {
			aClass50_181 = null;
			if (i == 8856) {
				anIntArray183 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("co.C(").append(i).append(')').toString());
		}
	}

	static final void method247() {
		OverridedJInterface.aClass105_2746 = new Deque();
	}

	public Class28() {
		/* empty */
	}
}
