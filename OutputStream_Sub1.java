/* OutputStream_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;
import java.io.OutputStream;

final class OutputStream_Sub1 extends OutputStream {
	static Class120_Sub19 aClass120_Sub19_27 = new Class120_Sub19(0, 0);
	static float aFloat28 = 0.0F;
	static int anInt29 = 99;
	static Cache aClass21_30 = new Cache(64);
	static Class120_Sub14_Sub18[] aClass120_Sub14_Sub18Array31;
	static int anInt32 = 0;

	static {
		aClass120_Sub14_Sub18Array31 = new Class120_Sub14_Sub18[14];
	}

	static final int method72(final byte i, final int i_0_) {
		int i_1_;
		try {
			if (AbstractTimer.worldConnection != null) {
				AbstractTimer.worldConnection.method377();
				AbstractTimer.worldConnection = null;
			}
			if (i != 9) {
				return -10;
			}
			Class120_Sub26.anInt2742++;
			if (Class120_Sub26.anInt2742 > 4) {
				Decimator.anInt1716 = 0;
				Class120_Sub26.anInt2742 = 0;
				return i_0_;
			}
			Decimator.anInt1716 = 0;
			if (Hashtable.anInt675 != Class116.anInt1115) {
				Class116.anInt1115 = Hashtable.anInt675;
			} else {
				Class116.anInt1115 = ObjectPile.anInt1808;
			}
			i_1_ = -1;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ok.C(").append(i).append(',').append(i_0_).append(')').toString());
		}
		return i_1_;
	}

	static final void method73(final byte i, final int i_2_) {
		try {
			Class86.aClass21_816.method192(i_2_);
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ok.A(").append(i).append(',').append(i_2_).append(')').toString());
		}
	}

	@Override
	public final void write(final int i) throws IOException {
		try {
			throw new IOException();
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ok.write(").append(i).append(')').toString());
		}
	}

	public static void method74(final int i) {
		try {
			aClass21_30 = null;
			aClass120_Sub14_Sub18Array31 = null;
			aClass120_Sub19_27 = null;
			if (i > -50) {
				anInt29 = 121;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ok.B(").append(i).append(')').toString());
		}
	}
}
