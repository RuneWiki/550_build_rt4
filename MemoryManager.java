/* Class113 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import javax.media.opengl.GL;

/**
 * Probably not a good name for it, all it does is clear buffers, textures, lists and gc every now and then.
 */
final class MemoryManager {
	static int textureMemory = 0;
	static int geometryMemory = 0;
	static int anInt1083;
	private static long aLong1084 = 0L;
	private static Deque buffersDeque;
	static int memory2d = 0;
	private static Deque texturesDeque;
	private static Deque texturesDeque2;
	private static Deque listsDeque;
	private static Deque shadersDeque;
	private static Deque objectsARBDeque;
	private static int[] anIntArray1092;

	static {
		anInt1083 = 0;
		buffersDeque = new Deque();
		texturesDeque = new Deque();
		texturesDeque2 = new Deque();
		listsDeque = new Deque();
		shadersDeque = new Deque();
		objectsARBDeque = new Deque();
		anIntArray1092 = new int[1000];
	}
	
	static final synchronized void method995() {
		anInt1083++;
		buffersDeque.clear();
		texturesDeque.clear();
		texturesDeque2.clear();
		listsDeque.clear();
		shadersDeque.clear();
		objectsARBDeque.clear();
		geometryMemory = 0;
		memory2d = 0;
		textureMemory = 0;
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
			geometryMemory -= class120_sub32.value;
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
			memory2d -= class120_sub32.value;
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
			textureMemory -= class120_sub32.value;
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
			final DeleteShadersNode class120_sub27 = (DeleteShadersNode) shadersDeque.removeFront();
			if (class120_sub27 == null) {
				break;
			}
			for (int i_3_ = 0; i_3_ < class120_sub27.shaders.length; i_3_++) {
				gl.glDetachObjectARB(class120_sub27.target, class120_sub27.shaders[i_3_].shaderId);
			}
			gl.glDeleteObjectARB(class120_sub27.target);
		}
		for (;;) {
			final IntegerNode class120_sub32 = (IntegerNode) objectsARBDeque.removeFront();
			if (class120_sub32 == null) {
				break;
			}
			final int i_4_ = (int) class120_sub32.uid;
			gl.glDeleteObjectARB(i_4_);
		}
		if (geometryMemory + memory2d + textureMemory > 100663296 && TimeUtil.getSafeTime() > aLong1084 + 60000L) {
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
	
	static final synchronized void method994(final int i, final GLShader[] class37s, final int i_0_) {
		if (i_0_ == anInt1083) {
			shadersDeque.addLast(new DeleteShadersNode(i, class37s));
		}
	}

	static final synchronized void method1002(final int i, final int i_11_) {
		if (i_11_ == anInt1083) {
			final IntegerNode class120_sub32 = new IntegerNode();
			class120_sub32.uid = i;
			objectsARBDeque.addLast(class120_sub32);
		}
	}

}
