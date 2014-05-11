/* Class150 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Frame;

final class Class150 {
	static int[] anIntArray1405;
	int anInt1406;
	static int anInt1407 = 0;
	static int anInt1408;
	static int anInt1409;
	int anInt1410;
	int anInt1411;
	static int[] anIntArray1412 = new int[4096];
	int anInt1413;
	int anInt1414;
	static String aString1415;
	int anInt1416;
	static int anInt1417;

	static {
		anInt1408 = 0;
		aString1415 = null;
	}

	public static void method2062(final int i) {
		try {
			aString1415 = null;
			anIntArray1405 = null;
			if (i == -23191) {
				anIntArray1412 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("re.A(").append(i).append(')').toString());
		}
	}

	static final void revertFrame(final Signlink signlink, final Frame frame) {
		for (;;) {
			final SignlinkNode signlinkNode = signlink.revertFrame(frame);
			while (signlinkNode.status == 0) {
				PacketBuffer.sleepWrapper(10L);
			}
			if (signlinkNode.status == 1) {
				break;
			}
			PacketBuffer.sleepWrapper(100L);
		}
		frame.setVisible(false);
		frame.dispose();
	}

	static final boolean method2064(final int i, final short i_0_) {
		boolean bool;
		try {
			if (i_0_ == 58 || i_0_ == 35 || i_0_ == 17 || i_0_ == 10 || i_0_ == 51 || i_0_ == 9 || i_0_ == 15 || i_0_ == 50) {
				return true;
			}
			if (i_0_ == 23 || i_0_ == 1 || i_0_ == 1001 || i_0_ == 1009) {
				return true;
			}
			if (i < 69) {
				revertFrame(null, null);
			}
			if (i_0_ == 30 || i_0_ == 20 || i_0_ == 13 || i_0_ == 2 || i_0_ == 49) {
				return true;
			}
			if (i_0_ == 57 || i_0_ == 34 || i_0_ == 7 || i_0_ == 18 || i_0_ == 11 || i_0_ == 3) {
				return true;
			}
			bool = false;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("re.C(").append(i).append(',').append(i_0_).append(')').toString());
		}
		return bool;
	}

	public Class150() {
		/* empty */
	}
}
