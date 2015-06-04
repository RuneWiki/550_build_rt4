/* Class37 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Arrays;

import javax.media.opengl.GL;

final class GLShader {
	int shaderId;
	static int FRAGMENT_SHADER_ID = 35632;
	private static int[] params = new int[2];
	private final int anInt318;

	@Override
	protected final void finalize() throws Throwable {
		MemoryManager.method1002(this.shaderId, anInt318);
		super.finalize();
	}

	static final GLShader compile(final String string, final int shaderType) {
		final GL gl = HDToolkit.gl;
		final int shaderId = gl.glCreateShaderObjectARB(shaderType);
		gl.glShaderSourceARB(shaderId, 1, new String[] { string }, new int[] { string.length() }, 0);
		gl.glCompileShaderARB(shaderId);
		gl.glGetObjectParameterivARB(shaderId, 35713, params, 0);//return values, 1 for OK, 0 for problems.
		System.out.println(Arrays.toString(params));
		if (params[0] == 0) {
			if (params[0] == 0) {
				System.out.println("Shader compile failed:");
			}
			gl.glGetObjectParameterivARB(shaderId, 35716, params, 1);
			if (params[1] > 1) {
				final byte[] is = new byte[params[1]];
				gl.glGetInfoLogARB(shaderId, params[1], params, 0, is, 0);
				System.out.println(new String(is));
			}
			if (params[0] == 0) {
				gl.glDeleteObjectARB(shaderId);
				return null;
			}
		}
		return new GLShader(shaderId, shaderType);
	}

	private GLShader(final int shaderId, final int shaderType) {
		this.shaderId = shaderId;
		anInt318 = MemoryManager.anInt1083;
	}
}
