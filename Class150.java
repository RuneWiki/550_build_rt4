/* Class150 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Frame;

final class Class150 {
	static int[] anIntArray1405;
	int seqId;
	static int soundEffectCount = 0;
	static int anInt1408;
	int frameDelay;
	int delay;
	static int[] anIntArray1412 = new int[4096];
	int frameId;
	int nextFrameId;
	static String clanOwner;
	int cyclesElapsed;
	static int selectedSpellTargetCursor;

	static {
		anInt1408 = 0;
		clanOwner = null;
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

	static final boolean method2064(final short i_0_) {
		if (i_0_ == 58 || i_0_ == 35 || i_0_ == 17 || i_0_ == 10 || i_0_ == 51 || i_0_ == 9 || i_0_ == 15 || i_0_ == 50) {
			return true;
		}
		if (i_0_ == 23 || i_0_ == 1 || i_0_ == 1001 || i_0_ == 1009) {
			return true;
		}
		if (i_0_ == 30 || i_0_ == 20 || i_0_ == 13 || i_0_ == 2 || i_0_ == 49) {
			return true;
		}
		if (i_0_ == 57 || i_0_ == 34 || i_0_ == 7 || i_0_ == 18 || i_0_ == 11 || i_0_ == 3) {
			return true;
		}
		return false;
	}

	public Class150() {
		/* empty */
	}
}
