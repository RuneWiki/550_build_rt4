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

	static final int worldListError(final int i_0_) {
		if (AbstractTimer.worldConnection != null) {
			AbstractTimer.worldConnection.close();
			AbstractTimer.worldConnection = null;
		}
		OverridedJInterface.worldListErrorCount++;
		if (OverridedJInterface.worldListErrorCount > 4) {
			OverridedJInterface.worldListErrorCount = 0;
			Decimator.worldListLoadStep = 0;
			return i_0_;
		}
		Decimator.worldListLoadStep = 0;
		if (Class116.worldListPort != Hashtable.anInt675) {
			Class116.worldListPort = Hashtable.anInt675;
		} else {
			Class116.worldListPort = ObjectPile.anInt1808;
		}
		return -1;
	}

	@Override
	public final void write(final int i) throws IOException {
		throw new IOException();
	}

}
