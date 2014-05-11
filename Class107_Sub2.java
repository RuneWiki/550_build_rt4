/* Class107_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;

import javax.media.opengl.GL;

final class Class107_Sub2 extends Class107 {
	private int anInt2307;
	private int anInt2308;
	private int anInt2309;
	private int anInt2310;
	private int anInt2311 = -1;
	private int anInt2312;
	private int anInt2313 = 0;

	@Override
	final void method910(int i, int i_0_) {
		HDToolkit.method510();
		i += this.anInt1020;
		i_0_ += this.anInt1021;
		final GL gl = HDToolkit.gl;
		HDToolkit.method514(anInt2311);
		method926(1);
		gl.glTranslatef(i, HDToolkit.canvasHeight - i_0_, 0.0F);
		gl.glCallList(anInt2307);
		gl.glLoadIdentity();
	}

	@Override
	protected final void finalize() throws Throwable {
		if (anInt2311 != -1) {
			Class113.method1001(anInt2311, anInt2312, anInt2308);
			anInt2311 = -1;
			anInt2312 = 0;
		}
		if (anInt2307 != -1) {
			Class113.method996(anInt2307, anInt2308);
			anInt2307 = -1;
		}
		super.finalize();
	}

	private final void method925() {
		final float f = (float) this.anInt1026 / (float) anInt2309;
		final float f_1_ = (float) this.anInt1030 / (float) anInt2310;
		final GL gl = HDToolkit.gl;
		if (anInt2307 == -1) {
			anInt2307 = gl.glGenLists(1);
			anInt2308 = Class113.anInt1083;
		}
		gl.glNewList(anInt2307, 4864);
		gl.glBegin(6);
		gl.glTexCoord2f(f, 0.0F);
		gl.glVertex2f(this.anInt1026, 0.0F);
		gl.glTexCoord2f(0.0F, 0.0F);
		gl.glVertex2f(0.0F, 0.0F);
		gl.glTexCoord2f(0.0F, f_1_);
		gl.glVertex2f(0.0F, -this.anInt1030);
		gl.glTexCoord2f(f, f_1_);
		gl.glVertex2f(this.anInt1026, -this.anInt1030);
		gl.glEnd();
		gl.glEndList();
	}

	@Override
	final void method911(int i, int i_2_, final int i_3_) {
		HDToolkit.method539();
		i += this.anInt1020;
		i_2_ += this.anInt1021;
		final GL gl = HDToolkit.gl;
		HDToolkit.method514(anInt2311);
		method926(1);
		gl.glColor4f(1.0F, 1.0F, 1.0F, i_3_ / 256.0F);
		gl.glTranslatef(i, HDToolkit.canvasHeight - i_2_, 0.0F);
		gl.glCallList(anInt2307);
		gl.glLoadIdentity();
	}

	private final void method926(final int i) {
		if (anInt2313 != i) {
			anInt2313 = i;
			final GL gl = HDToolkit.gl;
			if (i == 2) {
				gl.glTexParameteri(3553, 10241, 9729);
				gl.glTexParameteri(3553, 10240, 9729);
			} else {
				gl.glTexParameteri(3553, 10241, 9728);
				gl.glTexParameteri(3553, 10240, 9728);
			}
		}
	}

	private final void method927(final byte[] is, final int[] is_4_) {
		anInt2309 = Class120_Sub12_Sub17.method1283(this.anInt1026, (byte) 112);
		anInt2310 = Class120_Sub12_Sub17.method1283(this.anInt1030, (byte) 108);
		final byte[] is_5_ = new byte[anInt2309 * anInt2310 * 4];
		int i = 0;
		int i_6_ = 0;
		for (int i_7_ = 0; i_7_ < this.anInt1030; i_7_++) {
			for (int i_8_ = 0; i_8_ < this.anInt1026; i_8_++) {
				final byte i_9_ = is[i_6_++];
				if (i_9_ != 0) {
					final int i_10_ = is_4_[i_9_];
					is_5_[i++] = (byte) (i_10_ >> 16);
					is_5_[i++] = (byte) (i_10_ >> 8);
					is_5_[i++] = (byte) i_10_;
					is_5_[i++] = (byte) -1;
				} else {
					i += 4;
				}
			}
			i += (anInt2309 - this.anInt1026) * 4;
		}
		final ByteBuffer bytebuffer = ByteBuffer.wrap(is_5_);
		final GL gl = HDToolkit.gl;
		if (anInt2311 == -1) {
			final int[] is_11_ = new int[1];
			gl.glGenTextures(1, is_11_, 0);
			anInt2311 = is_11_[0];
			anInt2308 = Class113.anInt1083;
		}
		HDToolkit.method514(anInt2311);
		gl.glTexImage2D(3553, 0, 6408, anInt2309, anInt2310, 0, 6408, 5121, bytebuffer);
		Class113.anInt1086 += bytebuffer.limit() - anInt2312;
		anInt2312 = bytebuffer.limit();
	}

	final void method928(int i, int i_12_, final HDSprite class120_sub14_sub19_sub1) {
		if (class120_sub14_sub19_sub1 != null) {
			HDToolkit.method510();
			HDToolkit.method514(class120_sub14_sub19_sub1.anInt3942);
			class120_sub14_sub19_sub1.method1602(1);
			final GL gl = HDToolkit.gl;
			HDToolkit.method514(anInt2311);
			method926(1);
			gl.glActiveTexture(33985);
			gl.glEnable(3553);
			gl.glBindTexture(3553, class120_sub14_sub19_sub1.anInt3942);
			gl.glTexEnvi(8960, 34161, 7681);
			gl.glTexEnvi(8960, 34176, 34168);
			final float f = (float) (i - GraphicsHD.anInt602) / (float) class120_sub14_sub19_sub1.anInt3945;
			final float f_13_ = (float) (i_12_ - GraphicsHD.anInt605) / (float) class120_sub14_sub19_sub1.anInt3948;
			final float f_14_ = (float) (i + this.anInt1026 - GraphicsHD.anInt602) / (float) class120_sub14_sub19_sub1.anInt3945;
			final float f_15_ = (float) (i_12_ + this.anInt1030 - GraphicsHD.anInt605) / (float) class120_sub14_sub19_sub1.anInt3948;
			i += this.anInt1020;
			i_12_ += this.anInt1021;
			gl.glBegin(6);
			gl.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
			final float f_16_ = (float) this.anInt1026 / (float) anInt2309;
			final float f_17_ = (float) this.anInt1030 / (float) anInt2310;
			gl.glMultiTexCoord2f(33985, f_14_, f_13_);
			gl.glTexCoord2f(f_16_, 0.0F);
			gl.glVertex2f(i + this.anInt1026, HDToolkit.canvasHeight - i_12_);
			gl.glMultiTexCoord2f(33985, f, f_13_);
			gl.glTexCoord2f(0.0F, 0.0F);
			gl.glVertex2f(i, HDToolkit.canvasHeight - i_12_);
			gl.glMultiTexCoord2f(33985, f, f_15_);
			gl.glTexCoord2f(0.0F, f_17_);
			gl.glVertex2f(i, HDToolkit.canvasHeight - (i_12_ + this.anInt1030));
			gl.glMultiTexCoord2f(33985, f_14_, f_15_);
			gl.glTexCoord2f(f_16_, f_17_);
			gl.glVertex2f(i + this.anInt1026, HDToolkit.canvasHeight - (i_12_ + this.anInt1030));
			gl.glEnd();
			gl.glTexEnvi(8960, 34161, 8448);
			gl.glTexEnvi(8960, 34176, 5890);
			gl.glDisable(3553);
			gl.glActiveTexture(33984);
		}
	}

	Class107_Sub2(final int i, final int i_18_, final int i_19_, final int i_20_, final int i_21_, final int i_22_, final byte[] is, final int[] is_23_) {
		anInt2312 = 0;
		anInt2307 = -1;
		this.anInt1029 = i;
		this.anInt1028 = i_18_;
		this.anInt1020 = i_19_;
		this.anInt1021 = i_20_;
		this.anInt1026 = i_21_;
		this.anInt1030 = i_22_;
		method927(is, is_23_);
		method925();
	}

	Class107_Sub2(final Class107_Sub1 class107_sub1) {
		anInt2312 = 0;
		anInt2307 = -1;
		this.anInt1026 = class107_sub1.anInt1026;
		this.anInt1030 = class107_sub1.anInt1030;
		this.anInt1020 = class107_sub1.anInt1020;
		this.anInt1021 = class107_sub1.anInt1021;
		this.anInt1029 = class107_sub1.anInt1029;
		this.anInt1028 = class107_sub1.anInt1028;
		method927(class107_sub1.aByteArray2306, class107_sub1.anIntArray2305);
		method925();
	}
}
