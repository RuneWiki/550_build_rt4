/* Class72 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;

import javax.media.opengl.GL;

final class Class72 implements ShaderInterface {
	private int anInt2180 = -1;
	private boolean aBoolean2181 = false;
	private int[] anIntArray2182 = null;

	@Override
	public final void method2() {
		final GL gl = HDToolkit.gl;
		if (Class120_Sub12_Sub6.highLightingDetail) {
			gl.glCallList(anInt2180 + 1);
		} else {
			gl.glTexEnvi(8960, 34184, 5890);
		}
	}

	@Override
	public final void method5(final int i) {
		final GL gl = HDToolkit.gl;
		if (Class120_Sub12_Sub6.highLightingDetail && anIntArray2182 != null) {
			gl.glActiveTexture(33985);
			gl.glBindTexture(34067, anIntArray2182[i - 1]);
			gl.glActiveTexture(33984);
		}
	}

	private final void method640() {
		final GL gl = HDToolkit.gl;
		anInt2180 = gl.glGenLists(2);
		gl.glNewList(anInt2180, 4864);
		if (anIntArray2182 != null) {
			gl.glActiveTexture(33985);
			gl.glTexGeni(8192, 9472, 34065);
			gl.glTexGeni(8193, 9472, 34065);
			gl.glTexGeni(8194, 9472, 34065);
			gl.glEnable(3168);
			gl.glEnable(3169);
			gl.glEnable(3170);
			gl.glEnable(34067);
			gl.glMatrixMode(5890);
			gl.glLoadIdentity();
			gl.glRotatef(22.5F, 1.0F, 0.0F, 0.0F);
			gl.glMatrixMode(5888);
			if (!aBoolean2181) {
				gl.glTexEnvi(8960, 34161, 7681);
				gl.glTexEnvi(8960, 34176, 34168);
				gl.glTexEnvi(8960, 34162, 8448);
				gl.glActiveTexture(33986);
				gl.glTexEnvi(8960, 8704, 34160);
				gl.glTexEnvi(8960, 34161, 260);
				gl.glTexEnvi(8960, 34176, 34168);
				gl.glTexEnvi(8960, 34177, 34168);
				gl.glTexEnvi(8960, 34193, 770);
				gl.glTexEnvi(8960, 34162, 7681);
				gl.glTexEnvi(8960, 34184, 34167);
				gl.glBindTexture(3553, HDToolkit.anInt507);
				gl.glEnable(3553);
			} else {
				gl.glTexEnvi(8960, 34161, 260);
				gl.glTexEnvi(8960, 34192, 770);
				gl.glTexEnvi(8960, 34162, 7681);
				gl.glTexEnvi(8960, 34184, 34167);
			}
			gl.glActiveTexture(33984);
		} else {
			gl.glTexEnvi(8960, 34184, 34167);
		}
		gl.glEndList();
		gl.glNewList(anInt2180 + 1, 4864);
		if (anIntArray2182 != null) {
			gl.glActiveTexture(33985);
			gl.glDisable(3168);
			gl.glDisable(3169);
			gl.glDisable(3170);
			gl.glDisable(34067);
			gl.glMatrixMode(5890);
			gl.glLoadIdentity();
			gl.glMatrixMode(5888);
			if (!aBoolean2181) {
				gl.glTexEnvi(8960, 34161, 8448);
				gl.glTexEnvi(8960, 34176, 5890);
				gl.glActiveTexture(33986);
				gl.glTexEnvi(8960, 8704, 8448);
				gl.glTexEnvi(8960, 34161, 8448);
				gl.glTexEnvi(8960, 34176, 5890);
				gl.glTexEnvi(8960, 34193, 768);
				gl.glTexEnvi(8960, 34162, 8448);
				gl.glTexEnvi(8960, 34184, 5890);
				gl.glDisable(3553);
			} else {
				gl.glTexEnvi(8960, 34161, 8448);
				gl.glTexEnvi(8960, 34192, 768);
				gl.glTexEnvi(8960, 34162, 8448);
				gl.glTexEnvi(8960, 34184, 5890);
			}
			gl.glActiveTexture(33984);
		} else {
			gl.glTexEnvi(8960, 34184, 5890);
		}
		gl.glEndList();
	}

	@Override
	public final int method4() {
		return 4;
	}

	private final void method641() {
		final GL gl = HDToolkit.gl;
		if (anIntArray2182 == null) {
			anIntArray2182 = new int[3];
			gl.glGenTextures(3, anIntArray2182, 0);
		}
		final byte[] is = new byte[4096];
		final byte[] is_0_ = new byte[4096];
		final byte[] is_1_ = new byte[4096];
		for (int i_2_ = 0; i_2_ < 6; i_2_++) {
			int i_3_ = 0;
			for (int i_4_ = 0; i_4_ < 64; i_4_++) {
				for (int i_5_ = 0; i_5_ < 64; i_5_++) {
					float f = 2.0F * i_5_ / 64.0F - 1.0F;
					float f_6_ = 2.0F * i_4_ / 64.0F - 1.0F;
					final float f_7_ = (float) (1.0 / Math.sqrt(f * f + 1.0F + f_6_ * f_6_));
					f *= f_7_;
					f_6_ *= f_7_;
					float f_8_;
					if (i_2_ == 0) {
						f_8_ = -f;
					} else if (i_2_ == 1) {
						f_8_ = f;
					} else if (i_2_ == 2) {
						f_8_ = f_6_;
					} else if (i_2_ == 3) {
						f_8_ = -f_6_;
					} else if (i_2_ == 4) {
						f_8_ = f_7_;
					} else {
						f_8_ = -f_7_;
					}
					int i_9_;
					int i_10_;
					int i_11_;
					if (f_8_ > 0.0F) {
						i_9_ = (int) (Math.pow(f_8_, 96.0) * 255.0);
						i_10_ = (int) (Math.pow(f_8_, 36.0) * 255.0);
						i_11_ = (int) (Math.pow(f_8_, 12.0) * 255.0);
					} else {
						i_9_ = i_10_ = i_11_ = 0;
					}
					if (HDToolkit.maxTextureUnits < 3) {
						i_9_ /= 5;
						i_10_ /= 5;
						i_11_ /= 5;
					} else {
						i_9_ /= 2;
						i_10_ /= 2;
						i_11_ /= 2;
					}
					is_0_[i_3_] = (byte) i_9_;
					is_1_[i_3_] = (byte) i_10_;
					is[i_3_] = (byte) i_11_;
					i_3_++;
				}
			}
			gl.glBindTexture(34067, anIntArray2182[0]);
			gl.glTexImage2D(34069 + i_2_, 0, 6406, 64, 64, 0, 6406, 5121, ByteBuffer.wrap(is_0_));
			gl.glBindTexture(34067, anIntArray2182[1]);
			gl.glTexImage2D(34069 + i_2_, 0, 6406, 64, 64, 0, 6406, 5121, ByteBuffer.wrap(is_1_));
			gl.glBindTexture(34067, anIntArray2182[2]);
			gl.glTexImage2D(34069 + i_2_, 0, 6406, 64, 64, 0, 6406, 5121, ByteBuffer.wrap(is));
			MemoryManager.anInt1081 += 12288;
		}
	}

	@Override
	public final void method3() {
		final GL gl = HDToolkit.gl;
		HDToolkit.method521(1);
		if (Class120_Sub12_Sub6.highLightingDetail) {
			gl.glCallList(anInt2180);
		} else {
			gl.glTexEnvi(8960, 34184, 34167);
		}
	}

	public Class72() {
		if (HDToolkit.aBoolean514 && HDToolkit.maxTextureUnits >= 2) {
			method641();
			final GL gl = HDToolkit.gl;
			gl.glBindTexture(34067, anIntArray2182[0]);
			gl.glTexParameteri(34067, 10241, 9729);
			gl.glTexParameteri(34067, 10240, 9729);
			gl.glTexParameteri(34067, 32882, 33071);
			gl.glTexParameteri(34067, 10242, 33071);
			gl.glTexParameteri(34067, 10243, 33071);
			gl.glBindTexture(34067, anIntArray2182[1]);
			gl.glTexParameteri(34067, 10241, 9729);
			gl.glTexParameteri(34067, 10240, 9729);
			gl.glTexParameteri(34067, 32882, 33071);
			gl.glTexParameteri(34067, 10242, 33071);
			gl.glTexParameteri(34067, 10243, 33071);
			gl.glBindTexture(34067, anIntArray2182[2]);
			gl.glTexParameteri(34067, 10241, 9729);
			gl.glTexParameteri(34067, 10240, 9729);
			gl.glTexParameteri(34067, 32882, 33071);
			gl.glTexParameteri(34067, 10242, 33071);
			gl.glTexParameteri(34067, 10243, 33071);
			aBoolean2181 = HDToolkit.maxTextureUnits < 3;
		}
		method640();
	}
}
