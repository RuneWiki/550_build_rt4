/* Class14 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;

import javax.media.opengl.GL;

final class Class14 implements ShaderInterface {
	private int anInt2159 = -1;
	private int anInt2160 = -1;
	private int anInt2161 = -1;
	private static float[] aFloatArray2162 = { 0.1F, 0.1F, 0.15F, 0.1F };
	private final float[] aFloatArray2163 = new float[4];

	private final void method142() {
		final GL gl = HDToolkit.gl;
		anInt2161 = gl.glGenLists(2);
		gl.glNewList(anInt2161, 4864);
		gl.glTexEnvi(8960, 34192, 768);
		gl.glTexEnvi(8960, 34177, 34166);
		gl.glTexEnvf(8960, 34163, 2.0F);
		gl.glTexEnvi(8960, 34185, 34166);
		gl.glTexGeni(8192, 9472, 9217);
		gl.glTexGeni(8193, 9472, 9217);
		gl.glTexGenfv(8192, 9473, new float[] { 9.765625E-4F, 0.0F, 0.0F, 0.0F }, 0);
		gl.glTexGenfv(8193, 9473, new float[] { 0.0F, 0.0F, 9.765625E-4F, 0.0F }, 0);
		gl.glEnable(3168);
		gl.glEnable(3169);
		if (Class78.aBoolean685) {
			gl.glBindTexture(32879, Class78.anInt684);
			gl.glTexGeni(8194, 9472, 9217);
			gl.glTexGeni(8195, 9472, 9217);
			gl.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			gl.glEnable(3170);
			gl.glEnable(3171);
			gl.glEnable(32879);
		}
		gl.glActiveTexture(33985);
		gl.glEnable(3552);
		gl.glBindTexture(3552, anInt2159);
		gl.glTexEnvi(8960, 34161, 34165);
		gl.glTexEnvi(8960, 34176, 34166);
		gl.glTexEnvi(8960, 34178, 5890);
		gl.glTexEnvi(8960, 34162, 34165);
		gl.glTexEnvi(8960, 34184, 34166);
		gl.glTexEnvi(8960, 34186, 5890);
		gl.glEnable(3168);
		gl.glTexGeni(8192, 9472, 9216);
		gl.glPushMatrix();
		gl.glLoadIdentity();
		gl.glEndList();
		gl.glNewList(anInt2161 + 1, 4864);
		gl.glActiveTexture(33985);
		gl.glDisable(3552);
		gl.glDisable(3168);
		gl.glTexEnvi(8960, 34161, 8448);
		gl.glTexEnvi(8960, 34176, 5890);
		gl.glTexEnvi(8960, 34178, 34166);
		gl.glTexEnvi(8960, 34162, 8448);
		gl.glTexEnvi(8960, 34184, 5890);
		gl.glTexEnvi(8960, 34186, 34166);
		gl.glActiveTexture(33984);
		gl.glTexEnvi(8960, 34192, 768);
		gl.glTexEnvi(8960, 34177, 34168);
		gl.glTexEnvf(8960, 34163, 1.0F);
		gl.glTexEnvi(8960, 34185, 34168);
		gl.glDisable(3168);
		gl.glDisable(3169);
		if (Class78.aBoolean685) {
			gl.glDisable(3170);
			gl.glDisable(3171);
			gl.glDisable(32879);
		}
		gl.glEndList();
	}

	@Override
	public final int method4() {
		return 15;
	}

	private final void method143() {
		final byte[] is = new byte[2];
		is[0] = (byte) 0;
		is[1] = (byte) -1;
		final GL gl = HDToolkit.gl;
		final int[] is_0_ = new int[1];
		gl.glGenTextures(1, is_0_, 0);
		gl.glBindTexture(3552, is_0_[0]);
		gl.glTexImage1D(3552, 0, 6406, 2, 0, 6406, 5121, ByteBuffer.wrap(is));
		gl.glTexParameteri(3552, 10241, 9729);
		gl.glTexParameteri(3552, 10240, 9729);
		gl.glTexParameteri(3552, 10242, 33071);
		anInt2159 = is_0_[0];
	}

	public static void method144() {
		aFloatArray2162 = null;
	}

	@Override
	public final void method2() {
		HDToolkit.gl.glCallList(anInt2161 + 1);
	}

	@Override
	public final void method3() {
		final GL gl = HDToolkit.gl;
		HDToolkit.method511(2);
		HDToolkit.method521(2);
		HDToolkit.method509();
		gl.glCallList(anInt2161);
		float f = 2662.4001F;
		f += (Class120_Sub14_Sub13.anInt3571 - 128) * 0.5F;
		if (f >= 3328.0F) {
			f = 3327.0F;
		}
		aFloatArray2163[0] = 0.0F;
		aFloatArray2163[1] = 0.0F;
		aFloatArray2163[2] = 1.0F / (f - 3328.0F);
		aFloatArray2163[3] = f / (f - 3328.0F);
		gl.glTexGenfv(8192, 9474, aFloatArray2163, 0);
		gl.glPopMatrix();
		gl.glActiveTexture(33984);
		gl.glTexEnvfv(8960, 8705, aFloatArray2162, 0);
	}

	@Override
	public final void method5(final int i) {
		final GL gl = HDToolkit.gl;
		gl.glActiveTexture(33985);
		gl.glTexEnvfv(8960, 8705, Class120_Sub15.aFloatArray2596, 0);
		gl.glActiveTexture(33984);
		if ((i & 0x1) == 1) {
			if (Class78.aBoolean685) {
				if (anInt2160 != HDToolkit.anInt542) {
					aFloatArray2163[0] = 0.0F;
					aFloatArray2163[1] = 0.0F;
					aFloatArray2163[2] = 0.0F;
					aFloatArray2163[3] = HDToolkit.anInt542 * 0.005F;
					gl.glTexGenfv(8194, 9473, aFloatArray2163, 0);
					anInt2160 = HDToolkit.anInt542;
				}
			} else {
				HDToolkit.method514(Class78.anIntArray682[HDToolkit.anInt542 * 64 / 100 % 64]);
			}
		} else if (Class78.aBoolean685) {
			aFloatArray2163[0] = 0.0F;
			aFloatArray2163[1] = 0.0F;
			aFloatArray2163[2] = 0.0F;
			aFloatArray2163[3] = 0.0F;
			gl.glTexGenfv(8194, 9473, aFloatArray2163, 0);
		} else {
			HDToolkit.method514(Class78.anIntArray682[0]);
		}
	}

	public Class14() {
		method143();
		method142();
	}
}
