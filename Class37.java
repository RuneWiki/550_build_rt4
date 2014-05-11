/* Class37 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import javax.media.opengl.GL;

final class Class37 {
	int anInt315;
	static int anInt316 = 35632;
	private static int[] anIntArray317 = new int[2];
	private final int anInt318;

	public static void method310() {
		anIntArray317 = null;
	}

	@Override
	protected final void finalize() throws Throwable {
		Class113.method1002(this.anInt315, anInt318);
		super.finalize();
	}

	static final Class37 method311(final String string, final int i) {
		final GL gl = HDToolkit.gl;
		final int i_0_ = gl.glCreateShaderObjectARB(i);
		gl.glShaderSourceARB(i_0_, 1, new String[] { string }, new int[] { string.length() }, 0);
		gl.glCompileShaderARB(i_0_);
		gl.glGetObjectParameterivARB(i_0_, 35713, anIntArray317, 0);
		if (anIntArray317[0] == 0) {
			if (anIntArray317[0] == 0) {
				System.out.println("Shader compile failed:");
			}
			gl.glGetObjectParameterivARB(i_0_, 35716, anIntArray317, 1);
			if (anIntArray317[1] > 1) {
				final byte[] is = new byte[anIntArray317[1]];
				gl.glGetInfoLogARB(i_0_, anIntArray317[1], anIntArray317, 0, is, 0);
				System.out.println(new String(is));
			}
			if (anIntArray317[0] == 0) {
				gl.glDeleteObjectARB(i_0_);
				return null;
			}
		}
		return new Class37(i_0_, i);
	}

	private Class37(final int i, final int i_1_) {
		this.anInt315 = i;
		anInt318 = Class113.anInt1083;
	}
}
