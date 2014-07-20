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

	static final void method2515(final int i) {
		try {
			Npc.aByteArrayArrayArray3754 = null;
			Class8.aByteArrayArrayArray65 = null;
			Class110.anIntArrayArrayArray1050 = null;
			if (i != 1) {
				method2515(-31);
			}
			CanvasWrapper.anIntArray21 = null;
			Buffer.anIntArray2477 = null;
			Class99.aByteArrayArrayArray949 = null;
			Class120_Sub14_Sub5.aByteArrayArrayArray3477 = null;
			Class120_Sub4.aByteArrayArrayArray2441 = null;
			StringNode.anIntArray2733 = null;
			PacketBuffer.anIntArray3120 = null;
			Class120_Sub12_Sub31.anIntArray3383 = null;
			Class120_Sub12_Sub34.anIntArray3409 = null;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("wk.B(").append(i).append(')').toString());
		}
	}

	public static void method2516(final byte i) {
		try {
			selectedObjName = null;
			aCalendar2121 = null;
			if (i < 107) {
				method2515(44);
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("wk.C(").append(i).append(')').toString());
		}
	}

	static final void method2517(final Player player, final int animationId, final int delay) {
		if (player.anInt3006 != animationId || animationId == -1) {
			if (animationId == -1 || player.anInt3006 == -1 || SeqType.list(animationId).priority >= SeqType.list(player.anInt3006).priority) {
				player.anInt3006 = animationId;
				player.anInt3044 = 0;
				player.anInt2993 = delay;
				player.anInt2964 = 0;
				player.anInt3013 = 1;
				player.anInt2999 = 0;
				player.anInt3031 = player.anInt2960;
				if (player.anInt3006 != -1) {
					Class120_Sub12_Sub23.method1323(SeqType.list(player.anInt3006), player.x, player.z, player.anInt2964, player == Class100.selfPlayer);
				}
			}
		} else {
			final SeqType seqType = SeqType.list(animationId);
			final int i_2_ = seqType.resetInPlay;
			if (i_2_ == 1) {
				player.anInt2993 = delay;
				player.anInt2964 = 0;
				player.anInt3044 = 0;
				player.anInt3013 = 1;
				player.anInt2999 = 0;
				Class120_Sub12_Sub23.method1323(seqType, player.x, player.z, player.anInt2964, player == Class100.selfPlayer);
			}
			if (i_2_ == 2) {
				player.anInt2999 = 0;
			}
		}
	}
}
