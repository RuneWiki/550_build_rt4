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

	static final void method2517(final Player class180_sub5_sub1, final int i, final int i_0_, final int i_1_) {
		try {
			if (class180_sub5_sub1.anInt3006 != i || (i ^ 0xffffffff) == 0) {
				if ((i ^ 0xffffffff) == 0 || (class180_sub5_sub1.anInt3006 ^ 0xffffffff) == 0 || SeqType.list(i).anInt348 >= SeqType.list(class180_sub5_sub1.anInt3006).anInt348) {
					class180_sub5_sub1.anInt3006 = i;
					class180_sub5_sub1.anInt3044 = 0;
					class180_sub5_sub1.anInt2993 = i_0_;
					class180_sub5_sub1.anInt2964 = 0;
					class180_sub5_sub1.anInt3013 = 1;
					class180_sub5_sub1.anInt2999 = 0;
					class180_sub5_sub1.anInt3031 = class180_sub5_sub1.anInt2960;
					if (class180_sub5_sub1.anInt3006 != -1) {
						Class120_Sub12_Sub23.method1323(SeqType.list(class180_sub5_sub1.anInt3006), class180_sub5_sub1.z, class180_sub5_sub1.x, class180_sub5_sub1.anInt2964, class180_sub5_sub1 == Class100.selfPlayer);
					}
				}
			} else {
				final SeqType seqType = SeqType.list(i);
				final int i_2_ = seqType.anInt337;
				if (i_2_ == 1) {
					class180_sub5_sub1.anInt2993 = i_0_;
					class180_sub5_sub1.anInt2964 = 0;
					class180_sub5_sub1.anInt3044 = 0;
					class180_sub5_sub1.anInt3013 = 1;
					class180_sub5_sub1.anInt2999 = 0;
					Class120_Sub12_Sub23.method1323(seqType, class180_sub5_sub1.z, class180_sub5_sub1.x, class180_sub5_sub1.anInt2964, class180_sub5_sub1 == Class100.selfPlayer);
				}
				if (i_2_ == 2) {
					class180_sub5_sub1.anInt2999 = 0;
				}
			}
			if (i_1_ != -1) {
				method2517(null, 78, -82, -118);
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("wk.A(").append(class180_sub5_sub1 != null ? "{...}" : "null").append(',').append(i).append(',').append(i_0_).append(',').append(i_1_).append(')').toString());
		}
	}
}
