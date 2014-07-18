/* Class120_Sub14_Sub9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.IntBuffer;

import javax.media.opengl.GL;

final class Class120_Sub14_Sub9 extends NodeSub {
	static Class35 aClass35_3517 = new Class35(4);
	private int[] anIntArray3518;
	private static int[] anIntArray3519 = null;
	private int anInt3520 = -1;
	private int anInt3521;
	private static int[] anIntArray3522 = new int[4];
	private static int anInt3523 = -1;
	private int anInt3524 = 0;
	private int anInt3525;
	private static float[] aFloatArray3526 = new float[4];
	private int anInt3527;

	private final void method1492() {
		if (anInt3520 < 0 || anInt3527 != Class113.anInt1083) {
			final GL gl = HDToolkit.gl;
			final int[] is = new int[1];
			gl.glGenTextures(1, is, 0);
			anInt3520 = is[0];
			gl.glBindTexture(34067, anInt3520);
			gl.glTexParameteri(34067, 32882, 33071);
			gl.glTexParameteri(34067, 10242, 33071);
			gl.glTexParameteri(34067, 10243, 33071);
			anInt3527 = Class113.anInt1083;
			anInt3524 = 0;
		}
	}

	public static void method1493() {
		aClass35_3517 = null;
		anIntArray3519 = null;
		aFloatArray3526 = null;
		anIntArray3522 = null;
	}

	@Override
	protected final void finalize() throws Throwable {
		if (anInt3520 != -1) {
			Class113.method999(anInt3520, anInt3521, anInt3527);
			anInt3520 = -1;
			anInt3521 = 0;
		}
		super.finalize();
	}

	final void method1494() {
		final GL gl = HDToolkit.gl;
		method1492();
		gl.glBindTexture(34067, anInt3520);
		if (anIntArray3518 != null && anInt3524 != 2) {
			if (method1496()) {
				int i = -1;
				for (int i_0_ = 0; i_0_ < 6; i_0_++) {
					final int i_1_ = anIntArray3518[i_0_];
					anInt3525 = Rasterizer.anInterface5_973.method27(0, i_1_) ? 64 : 128;
					if (i_0_ > 0) {
						if (anInt3525 != i) {
							throw new RuntimeException("");
						}
					} else {
						i = anInt3525;
					}
					final IntBuffer intbuffer = IntBuffer.wrap(Rasterizer.anInterface5_973.method23(i_1_, (byte) 27));
					gl.glTexImage2D(34069 + i_0_, 0, 6407, i, i, 0, 32993, 5121, intbuffer);
				}
				gl.glTexParameteri(34067, 10241, 9729);
				gl.glTexParameteri(34067, 10240, 9729);
				final int i_2_ = i * i * 6 * 3;
				Class113.anInt1081 += i_2_ - anInt3521;
				anInt3521 = i_2_;
				anInt3524 = 2;
			} else if (anInt3524 != 1) {
				for (int i = 0; i < 6; i++) {
					final IntBuffer intbuffer = IntBuffer.wrap(Rasterizer.palette, Rasterizer.anInterface5_973.method20(anIntArray3518[i], 65535), 1);
					gl.glTexImage2D(34069 + i, 0, 6407, 1, 1, 0, 32993, 5121, intbuffer);
					Class113.anInt1081 += 3 - anInt3521;
					anInt3521 = 3;
				}
				anInt3524 = 1;
			}
		}
	}

	final Class120_Sub14_Sub9 method1495(final Class120_Sub14_Sub9 class120_sub14_sub9_3_, final Class120_Sub14_Sub9 class120_sub14_sub9_4_, final float f) {
		final GL gl = HDToolkit.gl;
		final Class120_Sub14_Sub9 class120_sub14_sub9_5_ = f < 0.5 ? class120_sub14_sub9_3_ : class120_sub14_sub9_4_;
		if (!HDToolkit.aBoolean531) {
			return class120_sub14_sub9_5_;
		}
		method1492();
		if (anIntArray3519 == null || anInt3523 != Class113.anInt1083) {
			anIntArray3519 = new int[2];
			gl.glGenTextures(2, anIntArray3519, 0);
			for (int i = 0; i < 2; i++) {
				HDToolkit.method514(anIntArray3519[i]);
				gl.glTexParameteri(3553, 10241, 9728);
				gl.glTexParameteri(3553, 10240, 9728);
			}
			anInt3523 = Class113.anInt1083;
		}
		final int i = class120_sub14_sub9_3_.anInt3525 > class120_sub14_sub9_4_.anInt3525 ? class120_sub14_sub9_3_.anInt3525 : class120_sub14_sub9_4_.anInt3525;
		if (anInt3525 != i) {
			anInt3525 = i;
			gl.glBindTexture(34067, anInt3520);
			for (int i_6_ = 0; i_6_ < 6; i_6_++) {
				gl.glTexImage2D(34069 + i_6_, 0, 6407, anInt3525, anInt3525, 0, 6407, 5121, null);
			}
			gl.glTexParameteri(34067, 10241, 9729);
			gl.glTexParameteri(34067, 10240, 9729);
		}
		class120_sub14_sub9_3_.method1494();
		class120_sub14_sub9_4_.method1494();
		GraphicsHD.method585(anIntArray3522);
		GraphicsHD.method597();
		Class12.method140(HDToolkit.method528());
		gl.glPushAttrib(2048);
		HDToolkit.method507(false);
		HDToolkit.method524(false);
		HDToolkit.method502(false);
		HDToolkit.method511(1);
		HDToolkit.method521(1);
		gl.glDisable(3042);
		gl.glDisable(3008);
		gl.glPushMatrix();
		gl.glLoadIdentity();
		gl.glMatrixMode(5889);
		gl.glPushMatrix();
		gl.glLoadIdentity();
		gl.glOrtho(0.0, anInt3525, 0.0, anInt3525, -1.0, 1.0);
		gl.glViewport(0, 0, anInt3525, anInt3525);
		gl.glActiveTexture(33985);
		gl.glBindTexture(3553, anIntArray3519[1]);
		gl.glTexEnvi(8960, 34161, 34165);
		gl.glTexEnvi(8960, 34162, 34165);
		aFloatArray3526[3] = f;
		gl.glTexEnvfv(8960, 8705, aFloatArray3526, 0);
		gl.glEnable(3553);
		gl.glActiveTexture(33984);
		boolean bool = true;
		for (int i_7_ = 0; i_7_ < 6; i_7_++) {
			final int i_8_ = 34069 + i_7_;
			if (!method1497(gl, class120_sub14_sub9_3_.anInt3520, i_8_, class120_sub14_sub9_3_.anInt3525, anIntArray3519[0])) {
				bool = false;
				break;
			}
			if (!method1497(gl, class120_sub14_sub9_4_.anInt3520, i_8_, class120_sub14_sub9_4_.anInt3525, anIntArray3519[1])) {
				bool = false;
				break;
			}
			gl.glFramebufferTexture2DEXT(36160, 36064, i_8_, anInt3520, 0);
			gl.glDrawBuffer(36064);
			final int i_9_ = gl.glCheckFramebufferStatusEXT(36160);
			if (i_9_ != 36053) {
				bool = false;
				break;
			}
			HDToolkit.method514(anIntArray3519[0]);
			gl.glBegin(7);
			gl.glTexCoord2i(0, 0);
			gl.glMultiTexCoord2i(33985, 0, 0);
			gl.glVertex2i(0, 0);
			gl.glTexCoord2i(1, 0);
			gl.glMultiTexCoord2i(33985, 1, 0);
			gl.glVertex2i(anInt3525, 0);
			gl.glTexCoord2i(1, 1);
			gl.glMultiTexCoord2i(33985, 1, 1);
			gl.glVertex2i(anInt3525, anInt3525);
			gl.glTexCoord2i(0, 1);
			gl.glMultiTexCoord2i(33985, 0, 1);
			gl.glVertex2i(0, anInt3525);
			gl.glEnd();
		}
		gl.glPopMatrix();
		gl.glMatrixMode(5888);
		gl.glPopMatrix();
		HDToolkit.method502(true);
		HDToolkit.method524(true);
		HDToolkit.method507(true);
		gl.glEnable(3008);
		gl.glEnable(3042);
		gl.glPopAttrib();
		Class12.method139();
		gl.glActiveTexture(33985);
		gl.glTexEnvi(8960, 34161, 8448);
		gl.glTexEnvi(8960, 34162, 8448);
		gl.glDisable(3553);
		gl.glActiveTexture(33984);
		GraphicsHD.method594(anIntArray3522);
		return bool ? this : class120_sub14_sub9_5_;
	}

	private final boolean method1496() {
		for (int i = 0; i < 6; i++) {
			if (!Rasterizer.anInterface5_973.method22(anIntArray3518[i], true)) {
				return false;
			}
		}
		return true;
	}

	private static final boolean method1497(final GL gl, final int i, final int i_10_, final int i_11_, final int i_12_) {
		HDToolkit.method514(i_12_);
		gl.glFramebufferTexture2DEXT(36160, 36064, i_10_, i, 0);
		gl.glReadBuffer(36064);
		final int i_13_ = gl.glCheckFramebufferStatusEXT(36160);
		if (i_13_ != 36053) {
			return false;
		}
		gl.glCopyTexImage2D(3553, 0, 6407, 0, 0, i_11_, i_11_, 0);
		return true;
	}

	static final Class120_Sub14_Sub9 method1498(final int i, final int i_14_, final int i_15_, final int i_16_, final int i_17_, final int i_18_) {
		final long l = i * 67481L ^ i_14_ * 97549L ^ i_15_ * 475427L ^ i_16_ * 986053L ^ i_17_ * 32147369L ^ i_18_ * 76724863L;
		Class120_Sub14_Sub9 class120_sub14_sub9 = (Class120_Sub14_Sub9) aClass35_3517.get(l);
		if (class120_sub14_sub9 != null) {
			return class120_sub14_sub9;
		}
		class120_sub14_sub9 = new Class120_Sub14_Sub9(i, i_14_, i_15_, i_16_, i_17_, i_18_);
		aClass35_3517.put(class120_sub14_sub9, l);
		return class120_sub14_sub9;
	}

	public Class120_Sub14_Sub9() {
		anInt3521 = 0;
		anInt3525 = -1;
	}

	private Class120_Sub14_Sub9(final int i, final int i_19_, final int i_20_, final int i_21_, final int i_22_, final int i_23_) {
		anInt3521 = 0;
		anInt3525 = -1;
		anIntArray3518 = new int[6];
		anIntArray3518[0] = i;
		anIntArray3518[1] = i_19_;
		anIntArray3518[2] = i_20_;
		anIntArray3518[3] = i_21_;
		anIntArray3518[4] = i_22_;
		anIntArray3518[5] = i_23_;
	}
}
