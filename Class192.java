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
		Class8.aByteArrayArrayArray65 = null;
		Class110.tileOccludeFlags = null;
		CanvasWrapper.anIntArray21 = null;
		Buffer.anIntArray2477 = null;
		Class99.tileOverlayIds = null;
		MapFunctionNode.aByteArrayArrayArray3477 = null;
		Class120_Sub4.tileUnderlayIds = null;
		StringNode.anIntArray2733 = null;
		PacketBuffer.anIntArray3120 = null;
		Class120_Sub12_Sub31.anIntArray3383 = null;
		Class120_Sub12_Sub34.anIntArray3409 = null;
	}

	public static void method2516(final byte i) {
		try {
			selectedObjName = null;
			aCalendar2121 = null;
			if (i < 107) {
				method2515();
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("wk.C(").append(i).append(')').toString());
		}
	}

	static final void method2517(final Player player, final int animationId, final int delay) {
		if (player.animId != animationId || animationId == -1) {
			if (animationId == -1 || player.animId == -1 || SeqType.list(animationId).priority >= SeqType.list(player.animId).priority) {
				player.animId = animationId;
				player.anInt3044 = 0;
				player.animDelay = delay;
				player.animCurrentFrame = 0;
				player.anInt3013 = 1;
				player.anInt2999 = 0;
				player.anInt3031 = player.anInt2960;
				if (player.animId != -1) {
					Class120_Sub12_Sub23.method1323(SeqType.list(player.animId), player.x, player.z, player.animCurrentFrame, player == TileParticleQueue.selfPlayer);
				}
			}
		} else {
			final SeqType seqType = SeqType.list(animationId);
			final int i_2_ = seqType.resetInPlay;
			if (i_2_ == 1) {
				player.animDelay = delay;
				player.animCurrentFrame = 0;
				player.anInt3044 = 0;
				player.anInt3013 = 1;
				player.anInt2999 = 0;
				Class120_Sub12_Sub23.method1323(seqType, player.x, player.z, player.animCurrentFrame, player == TileParticleQueue.selfPlayer);
			}
			if (i_2_ == 2) {
				player.anInt2999 = 0;
			}
		}
	}
}
