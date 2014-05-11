/* Class12 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import javax.media.opengl.GL;

final class Class12 {
	private static int[] anIntArray83;
	private static int[] anIntArray84 = new int[4];
	private static int[] anIntArray85 = new int[4];
	private static int anInt86;

	static {
		anIntArray83 = new int[1];
		anInt86 = 0;
	}

	static final int method131() {
		HDToolkit.gl.glGenRenderbuffersEXT(1, anIntArray83, 0);
		return anIntArray83[0];
	}

	public static void method132() {
		anIntArray83 = null;
		anIntArray84 = null;
		anIntArray85 = null;
	}

	static final void method133() {
		final GL gl = HDToolkit.gl;
		gl.glMatrixMode(5889);
		gl.glPopMatrix();
		gl.glMatrixMode(5888);
		gl.glPopMatrix();
		gl.glViewport(anIntArray84[0], anIntArray84[1], anIntArray84[2], anIntArray84[3]);
	}

	static final int method134() {
		HDToolkit.gl.glGenFramebuffersEXT(1, anIntArray83, 0);
		return anIntArray83[0];
	}

	static final void method135(final int i) {
		anIntArray83[0] = i;
		HDToolkit.gl.glDeleteFramebuffersEXT(1, anIntArray83, 0);
	}

	static final void method136(final float f, final float f_0_, final float f_1_, final float f_2_, final float f_3_, final float f_4_, final int i, final int i_5_) {
		final GL gl = HDToolkit.gl;
		gl.glMatrixMode(5889);
		gl.glPushMatrix();
		gl.glLoadIdentity();
		gl.glOrtho(f, f_0_, f_1_, f_2_, f_3_, f_4_);
		gl.glMatrixMode(5888);
		gl.glPushMatrix();
		gl.glLoadIdentity();
		gl.glGetIntegerv(2978, anIntArray84, 0);
		gl.glViewport(0, 0, i, i_5_);
	}

	static final void method137(final float f, final float f_6_, final float f_7_, final float f_8_, final int i, final int i_9_) {
		method136(f, f_6_, f_7_, f_8_, -1.0F, 1.0F, i, i_9_);
	}

	static final void method138(final int i) {
		anIntArray83[0] = i;
		HDToolkit.gl.glDeleteRenderbuffersEXT(1, anIntArray83, 0);
	}

	static final void method139() {
		HDToolkit.gl.glBindFramebufferEXT(36160, --anInt86 > 0 ? anIntArray85[anInt86 - 1] : 0);
	}

	static final void method140(final int i) {
		anIntArray85[anInt86++] = i;
		HDToolkit.gl.glBindFramebufferEXT(36160, i);
	}

	static final boolean method141() {
		final GL gl = HDToolkit.gl;
		final int i = gl.glCheckFramebufferStatusEXT(36160);
		if (i != 36053) {
			return false;
		}
		return true;
	}
}
