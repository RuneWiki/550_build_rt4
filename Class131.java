/* Class131 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import javax.media.opengl.GL;

final class Class131 {
	private final Shader[] aClass37Array1244;
	private final int anInt1245;
	private static int[] anIntArray1246 = new int[2];
	int anInt1247;

	static final Class131 linkShaders(final Shader[] shaders) {
		for (int id = 0; id < shaders.length; id++) {
			final Shader shader = shaders[id];
			if (shader == null || shader.shaderId <= 0) {
				return null;
			}
		}
		final GL gl = HDToolkit.gl;
		final int target = gl.glCreateProgramObjectARB();
		for (int i_5_ = 0; i_5_ < shaders.length; i_5_++) {
			final Shader class37 = shaders[i_5_];
			gl.glAttachObjectARB(target, class37.shaderId);
		}
		gl.glLinkProgramARB(target);
		gl.glGetObjectParameterivARB(target, 35714, anIntArray1246, 0);
		if (anIntArray1246[0] == 0) {
			if (anIntArray1246[0] == 0) {
				System.out.println("Shader linking failed:");
			}
			gl.glGetObjectParameterivARB(target, 35716, anIntArray1246, 1);
			if (anIntArray1246[1] > 1) {
				final byte[] is = new byte[anIntArray1246[1]];
				gl.glGetInfoLogARB(target, anIntArray1246[1], anIntArray1246, 0, is, 0);
				System.out.println(new String(is));
			}
			if (anIntArray1246[0] == 0) {
				for (int i_6_ = 0; i_6_ < shaders.length; i_6_++) {
					final Shader class37 = shaders[i_6_];
					gl.glDetachObjectARB(target, class37.shaderId);
				}
				gl.glDeleteObjectARB(target);
				return null;
			}
		}
		return new Class131(target, shaders);
	}

	private Class131(final int i, final Shader[] shaders) {
		this.anInt1247 = i;
		aClass37Array1244 = shaders;
		anInt1245 = MemoryManager.anInt1083;
	}

	@Override
	protected final void finalize() throws Throwable {
		MemoryManager.method994(this.anInt1247, aClass37Array1244, anInt1245);
		super.finalize();
	}

	public static void method1921() {
		anIntArray1246 = null;
	}
}
