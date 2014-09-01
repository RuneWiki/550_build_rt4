/* Class18 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;

import javax.media.opengl.GL;

final class WaterShader implements ShaderInterface {
	private int anInt2164 = -1;
	private static boolean aBoolean2165 = false;
	private int textureId = -1;
	private final float[] aFloatArray2167 = new float[4];

	static final void method163() {
		final GL gl = HDToolkit.gl;
		gl.glClientActiveTexture(method164());
		gl.glDisableClientState(32888);//TEXTURE_COORD_ARRAY
		gl.glClientActiveTexture(33984);//TEXTURE0
	}

	static final int method164() {
		return aBoolean2165 ? 33986 : 33985;//TEXTURE2 : TEXTURE1
	}

	@Override
	public final void method3() {
		final GL gl = HDToolkit.gl;
		gl.glCallList(anInt2164);
	}

	static final void method165() {
		final GL gl = HDToolkit.gl;
		gl.glClientActiveTexture(method164());
		gl.glEnableClientState(32888);//TEXTURE_COORD_ARRAY
		gl.glClientActiveTexture(33984);//TEXTURE0
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
		gl.glNewList(anInt2164, 4864);//COMPILE
		gl.glActiveTexture(33985);//TEXTURE1
		if (aBoolean2165) {
			gl.glBindTexture(32879, Class78.anInt684);//TEXTURE_3D
			gl.glTexEnvi(8960, 34161, 260);//TEXTURE_ENV, COMBINE_RGB, ADD
			gl.glTexEnvi(8960, 34192, 768);//TEXTURE_ENV, OPERAND0_RGB, SRC_COLOR
			gl.glTexEnvi(8960, 34162, 7681);//TEXTURE_ENV, COMBINE_ALPHA, REPLACE
			gl.glTexEnvi(8960, 34184, 34168);//TEXTURE_ENV, SOURCE0_ALPHA, PREVIOUS
			gl.glTexGeni(8192, 9472, 9216);//ENABLE_BIT, TEXTURE_GEN_MODE, EYE_LINEAR
			gl.glTexGeni(8193, 9472, 9216);//T, TEXTURE_GEN_MODE, EYE_LINEAR
			gl.glTexGeni(8194, 9472, 9216);//R, TEXTURE_GEN_MODE, EYE_LINEAR
			gl.glTexGeni(8195, 9472, 9217);//Q, TEXTURE_GEN_MODE, OBJECT_LINEAR
			gl.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);//Q, OBJECT_PLANE
			gl.glEnable(3168);//TEXTURE_GEN_S
			gl.glEnable(3169);//TEXTURE_GEN_T
			gl.glEnable(3170);//TEXTURE_GEN_R
			gl.glEnable(3171);//TEXTURE_GEN_Q
			gl.glEnable(32879);//TEXTURE_3D
			gl.glActiveTexture(33986);//TEXTURE2
			gl.glTexEnvi(8960, 8704, 34160);//TEXTURE_ENV, TEXTURE_ENV_MODE, COMBINE
		}
		gl.glBindTexture(3552, textureId);//TEXTURE_1D
		gl.glTexEnvi(8960, 34161, 34165);//TEXTURE_ENV, COMBINE_RGB, INTERPOLATE
		gl.glTexEnvi(8960, 34176, 34166);//TEXTURE_ENV, SOURCE0_RGB, CONSTANT
		gl.glTexEnvi(8960, 34178, 5890);//TEXTURE_ENV, SOURCE2_RGB, TEXTURE
		gl.glTexEnvi(8960, 34162, 7681);//TEXTURE_ENV, COMBINE_ALPHA, REPLACE
		gl.glTexEnvi(8960, 34184, 34168);//TEXTURE_ENV, SOURCE0_ALPHA, PREVIOUS
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
			gl.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);//roll
			gl.glRotatef(Class120_Sub14_Sub13.renderPitchWrapper * 360.0F / 2048.0F, 1.0F, 0.0F, 0.0F);//pitch
			gl.glRotatef(Class145.renderYawWrapper * 360.0F / 2048.0F, 0.0F, 1.0F, 0.0F);//yaw
			gl.glTranslatef(-Projectile.renderXWrapper, -Class120_Sub12_Sub27.renderYWrapper, -Class69_Sub1.renderZWrapper);//x,y,z
			if (aBoolean2165) {
				aFloatArray2167[0] = 0.001F;
				aFloatArray2167[1] = 9.0E-4F;
				aFloatArray2167[2] = 0.0F;
				aFloatArray2167[3] = 0.0F;
				gl.glTexGenfv(8192, 9474, aFloatArray2167, 0);//S, EYE_PLANE
				aFloatArray2167[0] = 0.0F;
				aFloatArray2167[1] = 9.0E-4F;
				aFloatArray2167[2] = 0.001F;
				aFloatArray2167[3] = 0.0F;
				gl.glTexGenfv(8193, 9474, aFloatArray2167, 0);//T, EYE_PLANE
				aFloatArray2167[0] = 0.0F;
				aFloatArray2167[1] = 0.0F;
				aFloatArray2167[2] = 0.0F;
				aFloatArray2167[3] = HDToolkit.loopCycleWrapper * 0.005F;
				gl.glTexGenfv(8194, 9474, aFloatArray2167, 0);//R, EYE_PLANE\
				gl.glActiveTexture(33986);//TEXTURE2
			}
			gl.glTexEnvfv(8960, 8705, Class29.method251(), 0);//TEXTURE_ENV, TEXTURE_ENV_COLOR
			if (i >= 0) {
				aFloatArray2167[0] = 0.0F;
				aFloatArray2167[1] = 1.0F / Class69_Sub2.anInt2233;
				aFloatArray2167[2] = 0.0F;
				aFloatArray2167[3] = 1.0F * i / Class69_Sub2.anInt2233;
				gl.glTexGenfv(8192, 9474, aFloatArray2167, 0);//S, EYE_PLANE
				gl.glEnable(3168);//TEXTURE_GEN_S
			} else {
				gl.glDisable(3168);//TEXTURE_GEN_S
			}
			gl.glPopMatrix();
		} else {
			gl.glDisable(3168);//TEXTURE_GEN_S
		}
		gl.glActiveTexture(33984);//TEXTURE0
	}

	public WaterShader() {
		if (HDToolkit.maxTextureUnits >= 2) {
			final int[] textures = new int[1];
			final byte[] pixels = new byte[8];
			int pixelsPos = 0;
			while (pixelsPos < 8) {
				pixels[pixelsPos] = (byte) (96 + ++pixelsPos * 159 / 8);
			}
			final GL gl = HDToolkit.gl;
			gl.glGenTextures(1, textures, 0);
			gl.glBindTexture(3552, textures[0]);//TEXTURE_1D
			//TEXTURE_1D, level0, ALPHA, width8, border0, ALPHA, UNSIGNED_BYTE, pixels.
			gl.glTexImage1D(3552, 0, 6406, 8, 0, 6406, 5121, ByteBuffer.wrap(pixels));
			gl.glTexParameteri(3552, 10241, 9729);//TEXTURE_1D, TEXTURE_MIN_FILTER, LINEAR
			gl.glTexParameteri(3552, 10240, 9729);//TEXTURE_1D, TEXTURE_MAG_FILTER, LINEAR
			gl.glTexParameteri(3552, 10242, 33071);//TEXTURE_1D, TEXTURE_WRAP_S, CLAMP_TO_EDGE
			textureId = textures[0];
			aBoolean2165 = HDToolkit.maxTextureUnits > 2 && HDToolkit.allows3DTextureMapping;
			method166();
		}
	}
}
