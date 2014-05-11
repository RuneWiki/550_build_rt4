/* Class49 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;

final class Class49 {
	static int anInt438;
	boolean aBoolean439 = false;
	static Class50 aClass50_440;
	static Class189 aClass189_441;
	int anInt442;
	ByteBuffer aByteBuffer443;
	int anInt444 = 0;
	Class104 aClass104_445;

	public static void method407(final int i) {
		try {
			aClass189_441 = null;
			if (i == 0) {
				aClass50_440 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ff.A(").append(i).append(')').toString());
		}
	}

	static final int method408(final byte i) {
		int i_0_;
		try {
			if (i < 96) {
				method407(110);
			}
			if (Class173.anInt1724 == 0) {
				return 0;
			}
			i_0_ = Class157.anInterface2Array1465[Class173.anInt1724].method4();
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ff.B(").append(i).append(')').toString());
		}
		return i_0_;
	}

	static final void method409(final Class120_Sub30 class120_sub30, final byte i) {
		try {
			class120_sub30.aBoolean2784 = false;
			if (i != 24) {
				method408((byte) -8);
			}
			if (class120_sub30.aClass120_Sub5_2782 != null) {
				class120_sub30.aClass120_Sub5_2782.anInt2442 = 0;
			}
			for (Class120_Sub30 class120_sub30_1_ = class120_sub30.method1736(); class120_sub30_1_ != null; class120_sub30_1_ = class120_sub30.method1735()) {
				method409(class120_sub30_1_, (byte) 24);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ff.C(").append(class120_sub30 != null ? "{...}" : "null").append(',').append(i).append(')').toString());
		}
	}

	public Class49() {
		this.anInt442 = 0;
	}
}
