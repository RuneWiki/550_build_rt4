/* OutputStream_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;
import java.io.OutputStream;

final class DummyOutputStream extends OutputStream {
	static Class120_Sub19 aClass120_Sub19_27 = new Class120_Sub19(0, 0);
	static float cameraYaw = 0.0F;
	static int anInt29 = 99;
	static FrameGroup[] aClass120_Sub14_Sub18Array31;
	static int anInt32 = 0;

	static {
		aClass120_Sub14_Sub18Array31 = new FrameGroup[14];
	}

	static final int method72(final int i_0_) {
		if (AbstractTimer.worldConnection != null) {
			AbstractTimer.worldConnection.close();
			AbstractTimer.worldConnection = null;
		}
		OverridedJInterface.anInt2742++;
		if (OverridedJInterface.anInt2742 > 4) {
			Decimator.anInt1716 = 0;
			OverridedJInterface.anInt2742 = 0;
			return i_0_;
		}
		Decimator.anInt1716 = 0;
		if (Hashtable.anInt675 != Class116.anInt1115) {
			Class116.anInt1115 = Hashtable.anInt675;
		} else {
			Class116.anInt1115 = ObjectPile.anInt1808;
		}
		return -1;
	}

	@Override
	public final void write(final int i) throws IOException {
		throw new IOException();
	}

}
