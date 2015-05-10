/* Class131 - Decompiled bdy JODE
 * Visit http://jode.sourceforge.net/
 */

import javax.media.opengl.GL;

final class LinkedShader {
	private final Shader[] shaders;
	private final int anInt1245;
	private static int[] linkStatus = new int[2];
	int target;

	static final LinkedShader linkShaders(final Shader[] shaders) {
		for (int id = 0; id < shaders.length; id++) {
			final Shader shader = shaders[id];
			if (shader == null || shader.shaderId <= 0) {
				return null;
			}
		}
		final GL gl = HDToolkit.gl;
		final int target = gl.glCreateProgramObjectARB();
		for (int id = 0; id < shaders.length; id++) {
			final Shader class37 = shaders[id];
			gl.glAttachObjectARB(target, class37.shaderId);
		}
		gl.glLinkProgramARB(target);
		gl.glGetObjectParameterivARB(target, 35714, linkStatus, 0);//GL_LINK_STATUS
		if (linkStatus[0] == 0) {
			if (linkStatus[0] == 0) {
				System.out.println("Shader linking failed:");
			}
			gl.glGetObjectParameterivARB(target, 35716, linkStatus, 1);//GL_INFO_LOG_LENGTH
			if (linkStatus[1] > 1) {
				final byte[] is = new byte[linkStatus[1]];
				gl.glGetInfoLogARB(target, linkStatus[1], linkStatus, 0, is, 0);
				System.out.println(new String(is));
			}
			if (linkStatus[0] == 0) {
				for (int id = 0; id < shaders.length; id++) {
					final Shader class37 = shaders[id];
					gl.glDetachObjectARB(target, class37.shaderId);
				}
				gl.glDeleteObjectARB(target);
				return null;
			}
		}
		return new LinkedShader(target, shaders);
	}

	private LinkedShader(final int target, final Shader[] shaders) {
		this.target = target;
		this.shaders = shaders;
		anInt1245 = MemoryManager.anInt1083;
	}

	@Override
	protected final void finalize() throws Throwable {
		MemoryManager.method994(this.target, shaders, anInt1245);
		super.finalize();
	}

}
