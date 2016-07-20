/* Class192 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Calendar;

final class Class192 {
	static int anInt2120 = 0;
	static Calendar aCalendar2121;
	static volatile int currentClickX = 0;
	static int selectedSpellCursor;
	static String selectedObjName;

	static {
		aCalendar2121 = Calendar.getInstance();
		selectedObjName = null;
		selectedSpellCursor = -1;
	}

	static final void method2515() {
		Npc.aByteArrayArrayArray3754 = null;
		Class8.tileOverlayRotations = null;
		Class110.tileOccludeFlags = null;
		CanvasWrapper.anIntArray21 = null;
		Buffer.anIntArray2477 = null;
		Class99.tileOverlayIds = null;
		MapFunctionNode.tileOverlayShapes = null;
		Class120_Sub4.tileUnderlayIds = null;
		StringNode.anIntArray2733 = null;
		PacketBuffer.anIntArray3120 = null;
		Class120_Sub12_Sub31.anIntArray3383 = null;
		Class120_Sub12_Sub34.anIntArray3409 = null;
	}

	static final void animatePlayer(final Player player, final int animationId, final int delay) {
		if (player.animId != animationId || animationId == -1) {
			if (animationId == -1 || player.animId == -1 || SeqType.list(animationId).priority >= SeqType.list(player.animId).priority) {
				player.animId = animationId;
				player.animFrameDelay = 0;
				player.animDelay = delay;
				player.animFrame = 0;
				player.animNextFrame = 1;
				player.animCyclesElapsed = 0;
				player.onAnimPlayWalkQueuePos = player.walkQueuePos;
				if (player.animId != -1) {
					Class120_Sub12_Sub23.method1323(SeqType.list(player.animId), player.x, player.z, player.animFrame, player == TileParticleQueue.selfPlayer);
				}
			}
		} else {
			final SeqType seqType = SeqType.list(animationId);
			final int resetType = seqType.resetInPlay;
			if (resetType == 1) {
				player.animDelay = delay;
				player.animFrame = 0;
				player.animFrameDelay = 0;
				player.animNextFrame = 1;
				player.animCyclesElapsed = 0;
				Class120_Sub12_Sub23.method1323(seqType, player.x, player.z, player.animFrame, player == TileParticleQueue.selfPlayer);
			}
			if (resetType == 2) {
				player.animCyclesElapsed = 0;
			}
		}
	}
}
