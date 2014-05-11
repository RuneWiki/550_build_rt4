/* Class78 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;

import javax.media.opengl.GL;

final class Class78 {
	static int anInt681 = -1;
	static int[] anIntArray682;
	private static ByteBuffer aByteBuffer683;
	static int anInt684;
	static boolean aBoolean685;
	private static ByteBuffer aByteBuffer686;
	static int[] anIntArray687 = null;

	static {
		anIntArray682 = null;
		anInt684 = -1;
	}

	public static void method669() {
		anIntArray682 = null;
		anIntArray687 = null;
		aByteBuffer686 = null;
		aByteBuffer683 = null;
	}

	static final void method670() {
		aBoolean685 = HDToolkit.aBoolean537;
		method674();
		method671();
		method672();
	}

	private static final void method671() {
		final GL gl = HDToolkit.gl;
		if (aBoolean685) {
			final int[] is = new int[1];
			gl.glGenTextures(1, is, 0);
			gl.glBindTexture(32879, is[0]);
			aByteBuffer686.position(0);
			gl.glTexImage3D(32879, 0, 6410, 64, 64, 64, 0, 6410, 5121, aByteBuffer686);
			gl.glTexParameteri(32879, 10241, 9729);
			gl.glTexParameteri(32879, 10240, 9729);
			anInt684 = is[0];
			Class113.anInt1081 += aByteBuffer686.limit() * 2;
		} else {
			anIntArray682 = new int[64];
			gl.glGenTextures(64, anIntArray682, 0);
			for (int i = 0; i < 64; i++) {
				HDToolkit.method514(anIntArray682[i]);
				aByteBuffer686.position(i * 64 * 64 * 2);
				gl.glTexImage2D(3553, 0, 6410, 64, 64, 0, 6410, 5121, aByteBuffer686);
				gl.glTexParameteri(3553, 10241, 9729);
				gl.glTexParameteri(3553, 10240, 9729);
			}
			Class113.anInt1081 += aByteBuffer686.limit() * 2;
		}
	}

	private static final void method672() {
		final GL gl = HDToolkit.gl;
		if (aBoolean685) {
			final int[] is = new int[1];
			gl.glGenTextures(1, is, 0);
			gl.glBindTexture(32879, is[0]);
			aByteBuffer683.position(0);
			gl.glTexImage3D(32879, 0, 6410, 64, 64, 64, 0, 6410, 5121, aByteBuffer683);
			gl.glTexParameteri(32879, 10241, 9729);
			gl.glTexParameteri(32879, 10240, 9729);
			anInt681 = is[0];
			Class113.anInt1081 += aByteBuffer683.limit() * 2;
		} else {
			anIntArray687 = new int[64];
			gl.glGenTextures(64, anIntArray687, 0);
			for (int i = 0; i < 64; i++) {
				HDToolkit.method514(anIntArray687[i]);
				aByteBuffer683.position(i * 64 * 64 * 2);
				gl.glTexImage2D(3553, 0, 6410, 64, 64, 0, 6410, 5121, aByteBuffer683);
				gl.glTexParameteri(3553, 10241, 9729);
				gl.glTexParameteri(3553, 10240, 9729);
			}
			Class113.anInt1081 += aByteBuffer683.limit() * 2;
		}
	}

	static final void method673() {
		if (anInt684 != -1) {
			final GL gl = HDToolkit.gl;
			final int[] is = { anInt684 };
			gl.glDeleteTextures(1, is, 0);
			anInt684 = -1;
			Class113.anInt1081 -= aByteBuffer686.limit() * 2;
		}
		if (anIntArray682 != null) {
			final GL gl = HDToolkit.gl;
			gl.glDeleteTextures(64, anIntArray682, 0);
			anIntArray682 = null;
			Class113.anInt1081 -= aByteBuffer686.limit() * 2;
		}
		if (anInt681 != -1) {
			final GL gl = HDToolkit.gl;
			final int[] is = { anInt681 };
			gl.glDeleteTextures(1, is, 0);
			anInt681 = -1;
			Class113.anInt1081 -= aByteBuffer683.limit() * 2;
		}
		if (anIntArray687 != null) {
			final GL gl = HDToolkit.gl;
			gl.glDeleteTextures(64, anIntArray687, 0);
			anIntArray687 = null;
			Class113.anInt1081 -= aByteBuffer683.limit() * 2;
		}
	}

	static final void method674() {
		if (aByteBuffer686 == null) {
			final Class132_Sub1_Sub1 class132_sub1_sub1 = new Class132_Sub1_Sub1();
			final byte[] is = class132_sub1_sub1.method1936(64, 64, 64);
			aByteBuffer686 = ByteBuffer.allocateDirect(is.length);
			aByteBuffer686.position(0);
			aByteBuffer686.put(is);
			aByteBuffer686.flip();
		}
		if (aByteBuffer683 == null) {
			final Class132_Sub2_Sub1 class132_sub2_sub1 = new Class132_Sub2_Sub1();
			final byte[] is = class132_sub2_sub1.method1943(64, 64, 64);
			aByteBuffer683 = ByteBuffer.allocateDirect(is.length);
			aByteBuffer683.position(0);
			aByteBuffer683.put(is);
			aByteBuffer683.flip();
		}
	}
}
