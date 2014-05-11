/* Class18 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;

import javax.media.opengl.GL;

final class WaterShader implements ShaderInterface {
	private int anInt2164 = -1;
	private static boolean aBoolean2165 = false;
	private int anInt2166 = -1;
	private final float[] aFloatArray2167 = new float[4];

	static final void method163() {
		final GL gl = HDToolkit.gl;
		gl.glClientActiveTexture(method164());
		gl.glDisableClientState(32888);
		gl.glClientActiveTexture(33984);
	}

	static final int method164() {
		return aBoolean2165 ? 33986 : 33985;
	}

	@Override
	public final void method3() {
		final GL gl = HDToolkit.gl;
		gl.glCallList(anInt2164);
	}

	static final void method165() {
		final GL gl = HDToolkit.gl;
		gl.glClientActiveTexture(method164());
		gl.glEnableClientState(32888);
		gl.glClientActiveTexture(33984);
	}

	@Override
	public final int method4() {
		return 0;
	}

	@Override
	public final void method2() {
		final GL gl = HDToolkit.gl;
		gl.glCallList(anInt2164 + 1);
	}

	private final void method166() {
		final GL gl = HDToolkit.gl;
		anInt2164 = gl.glGenLists(2);
		gl.glNewList(anInt2164, 4864);
		gl.glActiveTexture(33985);
		if (aBoolean2165) {
			gl.glBindTexture(32879, Class78.anInt684);
			gl.glTexEnvi(8960, 34161, 260);
			gl.glTexEnvi(8960, 34192, 768);
			gl.glTexEnvi(8960, 34162, 7681);
			gl.glTexEnvi(8960, 34184, 34168);
			gl.glTexGeni(8192, 9472, 9216);
			gl.glTexGeni(8194, 9472, 9216);
			gl.glTexGeni(8193, 9472, 9216);
			gl.glTexGeni(8195, 9472, 9217);
			gl.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			gl.glEnable(3168);
			gl.glEnable(3169);
			gl.glEnable(3170);
			gl.glEnable(3171);
			gl.glEnable(32879);
			gl.glActiveTexture(33986);
			gl.glTexEnvi(8960, 8704, 34160);
		}
		gl.glBindTexture(3552, anInt2166);
		gl.glTexEnvi(8960, 34161, 34165);
		gl.glTexEnvi(8960, 34176, 34166);
		gl.glTexEnvi(8960, 34178, 5890);
		gl.glTexEnvi(8960, 34162, 7681);
		gl.glTexEnvi(8960, 34184, 34168);
		gl.glTexGeni(8192, 9472, 9216);
		gl.glEnable(3552);
		gl.glEnable(3168);
		gl.glActiveTexture(33984);
		gl.glEndList();
		gl.glNewList(anInt2164 + 1, 4864);
		gl.glActiveTexture(33985);
		if (aBoolean2165) {
			gl.glTexEnvi(8960, 34161, 8448);
			gl.glTexEnvi(8960, 34192, 768);
			gl.glTexEnvi(8960, 34162, 8448);
			gl.glTexEnvi(8960, 34184, 5890);
			gl.glDisable(3168);
			gl.glDisable(3169);
			gl.glDisable(3170);
			gl.glDisable(3171);
			gl.glDisable(32879);
			gl.glActiveTexture(33986);
			gl.glTexEnvi(8960, 8704, 8448);
		}
		gl.glTexEnvfv(8960, 8705, new float[] { 0.0F, 1.0F, 0.0F, 1.0F }, 0);
		gl.glTexEnvi(8960, 34161, 8448);
		gl.glTexEnvi(8960, 34176, 5890);
		gl.glTexEnvi(8960, 34178, 34166);
		gl.glTexEnvi(8960, 34162, 8448);
		gl.glTexEnvi(8960, 34184, 5890);
		gl.glDisable(3552);
		gl.glDisable(3168);
		gl.glActiveTexture(33984);
		gl.glEndList();
	}

	@Override
	public final void method5(final int i) {
		final GL gl = HDToolkit.gl;
		gl.glActiveTexture(33985);
		if (aBoolean2165 || i >= 0) {
			gl.glPushMatrix();
			gl.glLoadIdentity();
			gl.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
			gl.glRotatef(Class120_Sub14_Sub13.anInt3571 * 360.0F / 2048.0F, 1.0F, 0.0F, 0.0F);
			gl.glRotatef(Class145.anInt1382 * 360.0F / 2048.0F, 0.0F, 1.0F, 0.0F);
			gl.glTranslatef(-Class180_Sub4.anInt2955, -Class120_Sub12_Sub27.anInt3353, -Class69_Sub1.anInt2229);
			if (aBoolean2165) {
				aFloatArray2167[0] = 0.001F;
				aFloatArray2167[1] = 9.0E-4F;
				aFloatArray2167[2] = 0.0F;
				aFloatArray2167[3] = 0.0F;
				gl.glTexGenfv(8192, 9474, aFloatArray2167, 0);
				aFloatArray2167[0] = 0.0F;
				aFloatArray2167[1] = 9.0E-4F;
				aFloatArray2167[2] = 0.001F;
				aFloatArray2167[3] = 0.0F;
				gl.glTexGenfv(8193, 9474, aFloatArray2167, 0);
				aFloatArray2167[0] = 0.0F;
				aFloatArray2167[1] = 0.0F;
				aFloatArray2167[2] = 0.0F;
				aFloatArray2167[3] = HDToolkit.anInt542 * 0.005F;
				gl.glTexGenfv(8194, 9474, aFloatArray2167, 0);
				gl.glActiveTexture(33986);
			}
			gl.glTexEnvfv(8960, 8705, Class29.method251(113), 0);
			if (i >= 0) {
				aFloatArray2167[0] = 0.0F;
				aFloatArray2167[1] = 1.0F / Class69_Sub2.anInt2233;
				aFloatArray2167[2] = 0.0F;
				aFloatArray2167[3] = 1.0F * i / Class69_Sub2.anInt2233;
				gl.glTexGenfv(8192, 9474, aFloatArray2167, 0);
				gl.glEnable(3168);
			} else {
				gl.glDisable(3168);
			}
			gl.glPopMatrix();
		} else {
			gl.glDisable(3168);
		}
		gl.glActiveTexture(33984);
	}

	public WaterShader() {
		if (HDToolkit.anInt526 >= 2) {
			final int[] textures = new int[1];
			final byte[] is_0_ = new byte[8];
			int i = 0;
			while (i < 8) {
				is_0_[i] = (byte) (96 + ++i * 159 / 8);
			}
			final GL gl = HDToolkit.gl;
			gl.glGenTextures(1, textures, 0);
			gl.glBindTexture(3552, textures[0]);
			gl.glTexImage1D(3552, 0, 6406, 8, 0, 6406, 5121, ByteBuffer.wrap(is_0_));
			gl.glTexParameteri(3552, 10241, 9729);
			gl.glTexParameteri(3552, 10240, 9729);
			gl.glTexParameteri(3552, 10242, 33071);
			anInt2166 = textures[0];
			aBoolean2165 = HDToolkit.anInt526 > 2 && HDToolkit.aBoolean537;
			method166();
		}
	}
}
