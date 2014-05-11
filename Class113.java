/* Class113 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import javax.media.opengl.GL;

final class Class113 {
	static int anInt1081 = 0;
	static int anInt1082 = 0;
	static int anInt1083;
	private static long aLong1084 = 0L;
	private static Deque aClass105_1085;
	static int anInt1086 = 0;
	private static Deque aClass105_1087;
	private static Deque aClass105_1088;
	private static Deque aClass105_1089;
	private static Deque aClass105_1090;
	private static Deque aClass105_1091;
	private static int[] anIntArray1092;

	static {
		anInt1083 = 0;
		aClass105_1085 = new Deque();
		aClass105_1087 = new Deque();
		aClass105_1088 = new Deque();
		aClass105_1089 = new Deque();
		aClass105_1090 = new Deque();
		aClass105_1091 = new Deque();
		anIntArray1092 = new int[1000];
	}

	static final synchronized void method994(final int i, final Class37[] class37s, final int i_0_) {
		if (i_0_ == anInt1083) {
			aClass105_1090.addLast(new Class120_Sub27(i, class37s));
		}
	}

	static final synchronized void method995() {
		anInt1083++;
		aClass105_1085.clear();
		aClass105_1087.clear();
		aClass105_1088.clear();
		aClass105_1089.clear();
		aClass105_1090.clear();
		aClass105_1091.clear();
		anInt1082 = 0;
		anInt1086 = 0;
		anInt1081 = 0;
	}

	static final synchronized void method996(final int i, final int i_1_) {
		if (i_1_ == anInt1083) {
			final Class120_Sub32 class120_sub32 = new Class120_Sub32();
			class120_sub32.uid = i;
			aClass105_1089.addLast(class120_sub32);
		}
	}

	public static void method997() {
		aClass105_1085 = null;
		aClass105_1087 = null;
		aClass105_1088 = null;
		aClass105_1089 = null;
		aClass105_1090 = null;
		aClass105_1091 = null;
		anIntArray1092 = null;
	}

	static final synchronized void method998() {
		final GL gl = HDToolkit.gl;
		int i = 0;
		for (;;) {
			final Class120_Sub32 class120_sub32 = (Class120_Sub32) aClass105_1085.removeFront();
			if (class120_sub32 == null) {
				break;
			}
			anIntArray1092[i++] = (int) class120_sub32.uid;
			anInt1082 -= class120_sub32.anInt2790;
			if (i == 1000) {
				gl.glDeleteBuffersARB(i, anIntArray1092, 0);
				i = 0;
			}
		}
		if (i > 0) {
			gl.glDeleteBuffersARB(i, anIntArray1092, 0);
			i = 0;
		}
		for (;;) {
			final Class120_Sub32 class120_sub32 = (Class120_Sub32) aClass105_1087.removeFront();
			if (class120_sub32 == null) {
				break;
			}
			anIntArray1092[i++] = (int) class120_sub32.uid;
			anInt1086 -= class120_sub32.anInt2790;
			if (i == 1000) {
				gl.glDeleteTextures(i, anIntArray1092, 0);
				i = 0;
			}
		}
		for (;;) {
			final Class120_Sub32 class120_sub32 = (Class120_Sub32) aClass105_1088.removeFront();
			if (class120_sub32 == null) {
				break;
			}
			anIntArray1092[i++] = (int) class120_sub32.uid;
			anInt1081 -= class120_sub32.anInt2790;
			if (i == 1000) {
				gl.glDeleteTextures(i, anIntArray1092, 0);
				i = 0;
			}
		}
		if (i > 0) {
			gl.glDeleteTextures(i, anIntArray1092, 0);
		}
		for (;;) {
			final Class120_Sub32 class120_sub32 = (Class120_Sub32) aClass105_1089.removeFront();
			if (class120_sub32 == null) {
				break;
			}
			final int i_2_ = (int) class120_sub32.uid;
			gl.glDeleteLists(i_2_, 1);
		}
		for (;;) {
			final Class120_Sub27 class120_sub27 = (Class120_Sub27) aClass105_1090.removeFront();
			if (class120_sub27 == null) {
				break;
			}
			for (int i_3_ = 0; i_3_ < class120_sub27.aClass37Array2748.length; i_3_++) {
				gl.glDetachObjectARB(class120_sub27.anInt2749, class120_sub27.aClass37Array2748[i_3_].anInt315);
			}
			gl.glDeleteObjectARB(class120_sub27.anInt2749);
		}
		for (;;) {
			final Class120_Sub32 class120_sub32 = (Class120_Sub32) aClass105_1091.removeFront();
			if (class120_sub32 == null) {
				break;
			}
			final int i_4_ = (int) class120_sub32.uid;
			gl.glDeleteObjectARB(i_4_);
		}
		if (anInt1082 + anInt1086 + anInt1081 > 100663296 && TimeUtil.getSafeTime() > aLong1084 + 60000L) {
			System.gc();
			aLong1084 = TimeUtil.getSafeTime();
		}
	}

	static final synchronized void method999(final int i, final int i_5_, final int i_6_) {
		if (i_6_ == anInt1083) {
			final Class120_Sub32 class120_sub32 = new Class120_Sub32(i_5_);
			class120_sub32.uid = i;
			aClass105_1088.addLast(class120_sub32);
		}
	}

	static final synchronized void method1000(final int i, final int i_7_, final int i_8_) {
		if (i_8_ == anInt1083) {
			final Class120_Sub32 class120_sub32 = new Class120_Sub32(i_7_);
			class120_sub32.uid = i;
			aClass105_1085.addLast(class120_sub32);
		}
	}

	static final synchronized void method1001(final int i, final int i_9_, final int i_10_) {
		if (i_10_ == anInt1083) {
			final Class120_Sub32 class120_sub32 = new Class120_Sub32(i_9_);
			class120_sub32.uid = i;
			aClass105_1087.addLast(class120_sub32);
		}
	}

	static final synchronized void method1002(final int i, final int i_11_) {
		if (i_11_ == anInt1083) {
			final Class120_Sub32 class120_sub32 = new Class120_Sub32();
			class120_sub32.uid = i;
			aClass105_1091.addLast(class120_sub32);
		}
	}
}
