/* Class37 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Arrays;

import javax.media.opengl.GL;

final class Shader {
	int shaderId;
	static int FRAGMENT_SHADER_ID = 35632;
	private static int[] anIntArray317 = new int[2];
	private final int anInt318;

	@Override
	protected final void finalize() throws Throwable {
		MemoryManager.method1002(this.shaderId, anInt318);
		super.finalize();
	}

	static final Shader compile(final String string, final int shaderType) {
		final GL gl = HDToolkit.gl;
		final int shaderId = gl.glCreateShaderObjectARB(shaderType);
		gl.glShaderSourceARB(shaderId, 1, new String[] { string }, new int[] { string.length() }, 0);
		gl.glCompileShaderARB(shaderId);
		gl.glGetObjectParameterivARB(shaderId, 35713, anIntArray317, 0);//return values, 1 for OK, 0 for problems.
		System.out.println(Arrays.toString(anIntArray317));
		if (anIntArray317[0] == 0) {
			if (anIntArray317[0] == 0) {
				System.out.println("Shader compile failed:");
			}
			gl.glGetObjectParameterivARB(shaderId, 35716, anIntArray317, 1);
			if (anIntArray317[1] > 1) {
				final byte[] is = new byte[anIntArray317[1]];
				gl.glGetInfoLogARB(shaderId, anIntArray317[1], anIntArray317, 0, is, 0);
				System.out.println(new String(is));
			}
			if (anIntArray317[0] == 0) {
				gl.glDeleteObjectARB(shaderId);
				return null;
			}
		}
		return new Shader(shaderId, shaderType);
	}

	private Shader(final int shaderId, final int shaderType) {
		this.shaderId = shaderId;
		anInt318 = MemoryManager.anInt1083;
	}
}
