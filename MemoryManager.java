/* Class113 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import javax.media.opengl.GL;

/**
 * Probably not a good name for it, all it does is clear buffers, textures, lists and gc every now and then.
 */
final class MemoryManager {
	static int anInt1081 = 0;
	static int anInt1082 = 0;
	static int anInt1083;
	private static long aLong1084 = 0L;
	private static Deque buffersDeque;
	static int anInt1086 = 0;
	private static Deque texturesDeque;
	private static Deque texturesDeque2;
	private static Deque listsDeque;
	private static Deque objectsARBDeque;
	private static Deque objectsARBDeque2;
	private static int[] anIntArray1092;

	static {
		anInt1083 = 0;
		buffersDeque = new Deque();
		texturesDeque = new Deque();
		texturesDeque2 = new Deque();
		listsDeque = new Deque();
		objectsARBDeque = new Deque();
		objectsARBDeque2 = new Deque();
		anIntArray1092 = new int[1000];
	}
	static final synchronized void method995() {
		anInt1083++;
		buffersDeque.clear();
		texturesDeque.clear();
		texturesDeque2.clear();
		listsDeque.clear();
		objectsARBDeque.clear();
		objectsARBDeque2.clear();
		anInt1082 = 0;
		anInt1086 = 0;
		anInt1081 = 0;
	}

	public static void method997() {
		buffersDeque = null;
		texturesDeque = null;
		texturesDeque2 = null;
		listsDeque = null;
		objectsARBDeque = null;
		objectsARBDeque2 = null;
		anIntArray1092 = null;
	}

	static final synchronized void process() {
		final GL gl = HDToolkit.gl;
		int i = 0;
		for (;;) {
			final IntegerNode class120_sub32 = (IntegerNode) buffersDeque.removeFront();
			if (class120_sub32 == null) {
				break;
			}
			anIntArray1092[i++] = (int) class120_sub32.uid;
			anInt1082 -= class120_sub32.value;
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
			final IntegerNode class120_sub32 = (IntegerNode) texturesDeque.removeFront();
			if (class120_sub32 == null) {
				break;
			}
			anIntArray1092[i++] = (int) class120_sub32.uid;
			anInt1086 -= class120_sub32.value;
			if (i == 1000) {
				gl.glDeleteTextures(i, anIntArray1092, 0);
				i = 0;
			}
		}
		for (;;) {
			final IntegerNode class120_sub32 = (IntegerNode) texturesDeque2.removeFront();
			if (class120_sub32 == null) {
				break;
			}
			anIntArray1092[i++] = (int) class120_sub32.uid;
			anInt1081 -= class120_sub32.value;
			if (i == 1000) {
				gl.glDeleteTextures(i, anIntArray1092, 0);
				i = 0;
			}
		}
		if (i > 0) {
			gl.glDeleteTextures(i, anIntArray1092, 0);
		}
		for (;;) {
			final IntegerNode class120_sub32 = (IntegerNode) listsDeque.removeFront();
			if (class120_sub32 == null) {
				break;
			}
			final int i_2_ = (int) class120_sub32.uid;
			gl.glDeleteLists(i_2_, 1);
		}
		for (;;) {
			final Class120_Sub27 class120_sub27 = (Class120_Sub27) objectsARBDeque.removeFront();
			if (class120_sub27 == null) {
				break;
			}
			for (int i_3_ = 0; i_3_ < class120_sub27.aClass37Array2748.length; i_3_++) {
				gl.glDetachObjectARB(class120_sub27.anInt2749, class120_sub27.aClass37Array2748[i_3_].anInt315);
			}
			gl.glDeleteObjectARB(class120_sub27.anInt2749);
		}
		for (;;) {
			final IntegerNode class120_sub32 = (IntegerNode) objectsARBDeque2.removeFront();
			if (class120_sub32 == null) {
				break;
			}
			final int i_4_ = (int) class120_sub32.uid;
			gl.glDeleteObjectARB(i_4_);
		}
		if (anInt1082 + anInt1086 + anInt1081 > 100663296 && TimeUtil.getSafeTime() > aLong1084 + 60000L) {
			System.gc();
			System.out.println("gc memory manager");
			aLong1084 = TimeUtil.getSafeTime();
		}
	}
	
	static final synchronized void method1000(final int id, final int i_7_, final int i_8_) {
		if (i_8_ == anInt1083) {
			final IntegerNode class120_sub32 = new IntegerNode(i_7_);
			class120_sub32.uid = id;
			buffersDeque.addLast(class120_sub32);
		}
	}

	static final synchronized void method1001(final int i, final int i_9_, final int i_10_) {
		if (i_10_ == anInt1083) {
			final IntegerNode class120_sub32 = new IntegerNode(i_9_);
			class120_sub32.uid = i;
			texturesDeque.addLast(class120_sub32);
		}
	}

	static final synchronized void method999(final int i, final int i_5_, final int i_6_) {
		if (i_6_ == anInt1083) {
			final IntegerNode class120_sub32 = new IntegerNode(i_5_);
			class120_sub32.uid = i;
			texturesDeque2.addLast(class120_sub32);
		}
	}
	
	static final synchronized void method996(final int i, final int i_1_) {
		if (i_1_ == anInt1083) {
			final IntegerNode class120_sub32 = new IntegerNode();
			class120_sub32.uid = i;
			listsDeque.addLast(class120_sub32);
		}
	}
	
	static final synchronized void method994(final int i, final Class37[] class37s, final int i_0_) {
		if (i_0_ == anInt1083) {
			objectsARBDeque.addLast(new Class120_Sub27(i, class37s));
		}
	}

	static final synchronized void method1002(final int i, final int i_11_) {
		if (i_11_ == anInt1083) {
			final IntegerNode class120_sub32 = new IntegerNode();
			class120_sub32.uid = i;
			objectsARBDeque2.addLast(class120_sub32);
		}
	}

}
