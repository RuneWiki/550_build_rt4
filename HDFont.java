/* Class120_Sub14_Sub8_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;

import javax.media.opengl.GL;

final class HDFont extends AbstractFont {
	private int anInt3920;
	private int[] anIntArray3921;
	private int anInt3922 = 0;
	private int anInt3923;
	private int anInt3924 = -1;

	HDFont(final byte[] is, final int[] is_0_, final int[] is_1_, final int[] is_2_, final int[] is_3_, final byte[][] is_4_) {
		super(is, is_0_, is_1_, is_2_, is_3_);
		method1487(is_4_);
		method1488();
	}

	@Override
	protected final void finalize() throws Throwable {
		if (anInt3924 != -1) {
			MemoryManager.method1001(anInt3924, anInt3922, anInt3920);
			anInt3924 = -1;
			anInt3922 = 0;
		}
		if (anIntArray3921 != null) {
			int[] is;
			final int i = (is = anIntArray3921).length;
			for (int i_5_ = 0; i_5_ < i; i_5_++) {
				final int i_6_ = is[i_5_];
				MemoryManager.method996(i_6_, anInt3920);
			}
			anIntArray3921 = null;
		}
		super.finalize();
	}

	@Override
	final void drawTransparentChar(final int i, final int i_7_, final int i_8_, final int i_9_, final int i_10_, final int i_11_, final int i_12_, final boolean bool) {
		HDToolkit.method504();
		final GL gl = HDToolkit.gl;
		HDToolkit.bindTexture2D(anInt3924);
		gl.glColor4ub((byte) (i_11_ >> 16), (byte) (i_11_ >> 8), (byte) i_11_, i_12_ > 255 ? (byte) -1 : (byte) i_12_);
		gl.glTranslatef(i_7_, HDToolkit.canvasHeight - i_8_, 0.0F);
		gl.glCallList(anIntArray3921[i]);
		gl.glLoadIdentity();
	}

	@Override
	final void drawChar(final int i, final int i_13_, final int i_14_, final int i_15_, final int i_16_, final int i_17_, final boolean bool) {
		if (GraphicsHD.aClass120_Sub14_Sub19_Sub1_603 != null) {
			HDToolkit.method504();
			final GL gl = HDToolkit.gl;
			gl.glColor3ub((byte) (i_17_ >> 16), (byte) (i_17_ >> 8), (byte) i_17_);
			gl.glTranslatef(i_13_, HDToolkit.canvasHeight - i_14_, 0.0F);
			final float f = i % 16 / 16.0F;
			final float f_18_ = i / 16 / 16.0F;
			final float f_19_ = f + (float) this.spriteWidths[i] / (float) anInt3923;
			final float f_20_ = f_18_ + (float) this.spriteHeights[i] / (float) anInt3923;
			HDToolkit.bindTexture2D(anInt3924);
			final HDSprite class120_sub14_sub19_sub1 = GraphicsHD.aClass120_Sub14_Sub19_Sub1_603;
			gl.glActiveTexture(33985);
			gl.glEnable(3553);
			gl.glBindTexture(3553, class120_sub14_sub19_sub1.textureId);
			gl.glTexEnvi(8960, 34161, 7681);
			gl.glTexEnvi(8960, 34176, 34168);
			final float f_21_ = (float) (i_13_ - GraphicsHD.startX) / (float) class120_sub14_sub19_sub1.anInt3945;
			final float f_22_ = (float) (i_14_ - GraphicsHD.startY) / (float) class120_sub14_sub19_sub1.anInt3948;
			final float f_23_ = (float) (i_13_ + i_15_ - GraphicsHD.startX) / (float) class120_sub14_sub19_sub1.anInt3945;
			final float f_24_ = (float) (i_14_ + i_16_ - GraphicsHD.startY) / (float) class120_sub14_sub19_sub1.anInt3948;
			gl.glBegin(6);
			gl.glMultiTexCoord2f(33985, f_23_, f_22_);
			gl.glTexCoord2f(f_19_, f_18_);
			gl.glVertex2f(this.spriteWidths[i], 0.0F);
			gl.glMultiTexCoord2f(33985, f_21_, f_22_);
			gl.glTexCoord2f(f, f_18_);
			gl.glVertex2f(0.0F, 0.0F);
			gl.glMultiTexCoord2f(33985, f_21_, f_24_);
			gl.glTexCoord2f(f, f_20_);
			gl.glVertex2f(0.0F, -this.spriteHeights[i]);
			gl.glMultiTexCoord2f(33985, f_23_, f_24_);
			gl.glTexCoord2f(f_19_, f_20_);
			gl.glVertex2f(this.spriteWidths[i], -this.spriteHeights[i]);
			gl.glEnd();
			gl.glTexEnvi(8960, 34161, 8448);
			gl.glTexEnvi(8960, 34176, 5890);
			gl.glDisable(3553);
			gl.glActiveTexture(33984);
			gl.glLoadIdentity();
		} else {
			HDToolkit.method504();
			final GL gl = HDToolkit.gl;
			HDToolkit.bindTexture2D(anInt3924);
			gl.glColor3ub((byte) (i_17_ >> 16), (byte) (i_17_ >> 8), (byte) i_17_);
			gl.glTranslatef(i_13_, HDToolkit.canvasHeight - i_14_, 0.0F);
			gl.glCallList(anIntArray3921[i]);
			gl.glLoadIdentity();
		}
	}

	private final void method1487(final byte[][] is) {
		if (anInt3924 == -1) {
			anInt3923 = 0;
			for (int i = 0; i < 256; i++) {
				if (this.spriteHeights[i] > anInt3923) {
					anInt3923 = this.spriteHeights[i];
				}
				if (this.spriteWidths[i] > anInt3923) {
					anInt3923 = this.spriteWidths[i];
				}
			}
			anInt3923 *= 16;
			anInt3923 = Class120_Sub12_Sub17.getFarestBitValue(anInt3923);
			final int i = anInt3923 / 16;
			final byte[] is_25_ = new byte[anInt3923 * anInt3923 * 2];
			for (int i_26_ = 0; i_26_ < 256; i_26_++) {
				final int i_27_ = i_26_ % 16 * i;
				final int i_28_ = i_26_ / 16 * i;
				int i_29_ = (i_28_ * anInt3923 + i_27_) * 2;
				int i_30_ = 0;
				final int i_31_ = this.spriteHeights[i_26_];
				final int i_32_ = this.spriteWidths[i_26_];
				final byte[] is_33_ = is[i_26_];
				for (int i_34_ = 0; i_34_ < i_31_; i_34_++) {
					for (int i_35_ = 0; i_35_ < i_32_; i_35_++) {
						if (is_33_[i_30_++] != 0) {
							is_25_[i_29_++] = (byte) -1;
							is_25_[i_29_++] = (byte) -1;
						} else {
							i_29_ += 2;
						}
					}
					i_29_ += (anInt3923 - i_32_) * 2;
				}
			}
			final ByteBuffer bytebuffer = ByteBuffer.wrap(is_25_);
			final GL gl = HDToolkit.gl;
			if (anInt3924 == -1) {
				final int[] is_36_ = new int[1];
				gl.glGenTextures(1, is_36_, 0);
				anInt3924 = is_36_[0];
				anInt3920 = MemoryManager.anInt1083;
			}
			HDToolkit.bindTexture2D(anInt3924);
			gl.glTexImage2D(3553, 0, 6410, anInt3923, anInt3923, 0, 6410, 5121, bytebuffer);
			MemoryManager.memory2d += bytebuffer.limit() - anInt3922;
			anInt3922 = bytebuffer.limit();
			gl.glTexParameteri(3553, 10241, 9728);
			gl.glTexParameteri(3553, 10240, 9728);
		}
	}

	private final void method1488() {
		if (anIntArray3921 == null) {
			anIntArray3921 = new int[256];
			final GL gl = HDToolkit.gl;
			for (int i = 0; i < 256; i++) {
				final float f = i % 16 / 16.0F;
				final float f_37_ = i / 16 / 16.0F;
				final float f_38_ = f + (float) this.spriteWidths[i] / (float) anInt3923;
				final float f_39_ = f_37_ + (float) this.spriteHeights[i] / (float) anInt3923;
				anIntArray3921[i] = gl.glGenLists(1);
				gl.glNewList(anIntArray3921[i], 4864);
				gl.glBegin(6);
				gl.glTexCoord2f(f_38_, f_37_);
				gl.glVertex2f(this.spriteWidths[i], 0.0F);
				gl.glTexCoord2f(f, f_37_);
				gl.glVertex2f(0.0F, 0.0F);
				gl.glTexCoord2f(f, f_39_);
				gl.glVertex2f(0.0F, -this.spriteHeights[i]);
				gl.glTexCoord2f(f_38_, f_39_);
				gl.glVertex2f(this.spriteWidths[i], -this.spriteHeights[i]);
				gl.glEnd();
				gl.glEndList();
			}
			anInt3920 = MemoryManager.anInt1083;
		}
	}
}
