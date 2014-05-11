/* Class131 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import javax.media.opengl.GL;

final class Class131 {
	private final Class37[] aClass37Array1244;
	private final int anInt1245;
	private static int[] anIntArray1246 = new int[2];
	int anInt1247;

	static final Class131 method1920(final Class37[] class37s) {
		Class37[] class37s_0_;
		final int i = (class37s_0_ = class37s).length;
		for (int i_1_ = 0; i_1_ < i; i_1_++) {
			final Class37 class37 = class37s_0_[i_1_];
			if (class37 == null || class37.anInt315 <= 0) {
				return null;
			}
		}
		final GL gl = HDToolkit.gl;
		final int i_2_ = gl.glCreateProgramObjectARB();
		Class37[] class37s_4_;
		int i_3_ = (class37s_4_ = class37s).length;
		for (int i_5_ = 0; i_5_ < i_3_; i_5_++) {
			final Class37 class37 = class37s_4_[i_5_];
			gl.glAttachObjectARB(i_2_, class37.anInt315);
		}
		gl.glLinkProgramARB(i_2_);
		gl.glGetObjectParameterivARB(i_2_, 35714, anIntArray1246, 0);
		if (anIntArray1246[0] == 0) {
			if (anIntArray1246[0] == 0) {
				System.out.println("Shader linking failed:");
			}
			gl.glGetObjectParameterivARB(i_2_, 35716, anIntArray1246, 1);
			if (anIntArray1246[1] > 1) {
				final byte[] is = new byte[anIntArray1246[1]];
				gl.glGetInfoLogARB(i_2_, anIntArray1246[1], anIntArray1246, 0, is, 0);
				System.out.println(new String(is));
			}
			if (anIntArray1246[0] == 0) {
				i_3_ = (class37s_4_ = class37s).length;
				for (int i_6_ = 0; i_6_ < i_3_; i_6_++) {
					final Class37 class37 = class37s_4_[i_6_];
					gl.glDetachObjectARB(i_2_, class37.anInt315);
				}
				gl.glDeleteObjectARB(i_2_);
				return null;
			}
		}
		return new Class131(i_2_, class37s);
	}

	private Class131(final int i, final Class37[] class37s) {
		this.anInt1247 = i;
		aClass37Array1244 = class37s;
		anInt1245 = Class113.anInt1083;
	}

	@Override
	protected final void finalize() throws Throwable {
		Class113.method994(this.anInt1247, aClass37Array1244, anInt1245);
		super.finalize();
	}

	public static void method1921() {
		anIntArray1246 = null;
	}
}
