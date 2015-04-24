/* Class120_Sub14_Sub19_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;

import javax.media.opengl.GL;

class HDSprite extends AbstractSprite {
	int textureId;
	private int anInt3943;
	private int anInt3944 = 0;
	int anInt3945;
	private int listId = -1;
	int anInt3947 = 0;
	int anInt3948;

	@Override
	final void method1589(int i, int i_0_, final int i_1_, final int i_2_, final int i_3_, final int i_4_) {
		HDToolkit.method510();
		final GL gl = HDToolkit.gl;
		HDToolkit.bindTexture2D(this.textureId);
		method1602(1);
		i -= this.offsetX << 4;
		i_0_ -= this.offsetY << 4;
		gl.glTranslatef(i_1_ / 16.0F, HDToolkit.canvasHeight - i_2_ / 16.0F, 0.0F);
		gl.glRotatef(i_3_ * 0.005493164F, 0.0F, 0.0F, 1.0F);
		if (i_4_ != 4096) {
			gl.glScalef(i_4_ / 4096.0F, i_4_ / 4096.0F, 0.0F);
		}
		gl.glTranslatef(-i / 16.0F, i_0_ / 16.0F, 0.0F);
		gl.glCallList(listId);
		gl.glLoadIdentity();
	}

	final void method1595(final int i, final int i_5_, final int i_6_, final int i_7_, final int i_8_) {
		HDToolkit.method539();
		final GL gl = HDToolkit.gl;
		HDToolkit.bindTexture2D(this.textureId);
		method1602(1);
		float f = (float) this.width / (float) this.anInt3945;
		float f_9_ = (float) this.height / (float) this.anInt3948;
		f *= i_7_;
		f_9_ *= i_8_;
		final int i_10_ = i + this.offsetX;
		final int i_11_ = i_10_ + this.width * i_7_;
		final int i_12_ = HDToolkit.canvasHeight - i_5_ - this.offsetY;
		final int i_13_ = i_12_ - this.height * i_8_;
		final float f_14_ = i_6_ / 256.0F;
		gl.glBegin(6);
		gl.glColor4f(1.0F, 1.0F, 1.0F, f_14_);
		gl.glTexCoord2f(f, 0.0F);
		gl.glVertex2f(i_11_, i_12_);
		gl.glTexCoord2f(0.0F, 0.0F);
		gl.glVertex2f(i_10_, i_12_);
		gl.glTexCoord2f(0.0F, f_9_);
		gl.glVertex2f(i_10_, i_13_);
		gl.glTexCoord2f(f, f_9_);
		gl.glVertex2f(i_11_, i_13_);
		gl.glEnd();
	}

	@Override
	final void method1591(int i, int i_15_) {
		HDToolkit.method510();
		i += this.offsetX;
		i_15_ += this.offsetY;
		final GL gl = HDToolkit.gl;
		HDToolkit.bindTexture2D(this.textureId);
		method1602(1);
		gl.glTranslatef(i, HDToolkit.canvasHeight - i_15_, 0.0F);
		gl.glCallList(listId);
		gl.glLoadIdentity();
	}

	@Override
	final void drawSpriteTransparency(int x, int i_16_, final int i_17_) {
		HDToolkit.method539();
		x += this.offsetX;
		i_16_ += this.offsetY;
		final GL gl = HDToolkit.gl;
		HDToolkit.bindTexture2D(this.textureId);
		method1602(1);
		gl.glColor4f(1.0F, 1.0F, 1.0F, i_17_ / 256.0F);
		gl.glTranslatef(x, HDToolkit.canvasHeight - i_16_, 0.0F);
		gl.glCallList(listId);
		gl.glLoadIdentity();
	}

	@Override
	protected final void finalize() throws Throwable {
		if (this.textureId != -1) {
			MemoryManager.method1001(this.textureId, this.anInt3947, anInt3943);
			this.textureId = -1;
			this.anInt3947 = 0;
		}
		if (listId != -1) {
			MemoryManager.method996(listId, anInt3943);
			listId = -1;
		}
		super.finalize();
	}

	void method1596(final int[] inputPixels) {
		this.anInt3945 = Class120_Sub12_Sub17.getFarestBitValue(this.width);
		this.anInt3948 = Class120_Sub12_Sub17.getFarestBitValue(this.height);
		final byte[] pixels = new byte[this.anInt3945 * this.anInt3948 * 4];
		int pixelId = 0;
		int inputPixelsId = 0;
		final int pixelStep = (this.anInt3945 - this.width) * 4;
		for (int y = 0; y < this.height; y++) {
			for (int x = 0; x < this.width; x++) {
				final int rgb = inputPixels[inputPixelsId++];
				if (rgb != 0) {
					pixels[pixelId++] = (byte) (rgb >> 16);
					pixels[pixelId++] = (byte) (rgb >> 8);
					pixels[pixelId++] = (byte) rgb;
					pixels[pixelId++] = (byte) -1;
				} else {
					pixelId += 4;
				}
			}
			pixelId += pixelStep;
		}
		final ByteBuffer byteBufferPixels = ByteBuffer.wrap(pixels);
		final GL gl = HDToolkit.gl;
		if (this.textureId == -1) {
			final int[] textureIds = new int[1];
			gl.glGenTextures(1, textureIds, 0);
			this.textureId = textureIds[0];
			anInt3943 = MemoryManager.anInt1083;
		}
		HDToolkit.bindTexture2D(this.textureId);
		gl.glTexImage2D(3553, 0, 6408, this.anInt3945, this.anInt3948, 0, 6408, 5121, byteBufferPixels);
		MemoryManager.memory2d += byteBufferPixels.limit() - this.anInt3947;
		this.anInt3947 = byteBufferPixels.limit();
	}

	private final void method1597() {
		final float f = (float) this.width / (float) this.anInt3945;
		final float f_25_ = (float) this.height / (float) this.anInt3948;
		final GL gl = HDToolkit.gl;
		if (listId == -1) {
			listId = gl.glGenLists(1);
			anInt3943 = MemoryManager.anInt1083;
		}
		gl.glNewList(listId, 4864);
		gl.glBegin(6);
		gl.glTexCoord2f(f, 0.0F);
		gl.glVertex2f(this.width, 0.0F);
		gl.glTexCoord2f(0.0F, 0.0F);
		gl.glVertex2f(0.0F, 0.0F);
		gl.glTexCoord2f(0.0F, f_25_);
		gl.glVertex2f(0.0F, -this.height);
		gl.glTexCoord2f(f, f_25_);
		gl.glVertex2f(this.width, -this.height);
		gl.glEnd();
		gl.glEndList();
	}

	final void method1598(int i, int i_26_, final HDSprite class120_sub14_sub19_sub1_27_) {
		if (class120_sub14_sub19_sub1_27_ != null) {
			HDToolkit.method510();
			HDToolkit.bindTexture2D(class120_sub14_sub19_sub1_27_.textureId);
			class120_sub14_sub19_sub1_27_.method1602(1);
			final GL gl = HDToolkit.gl;
			HDToolkit.bindTexture2D(this.textureId);
			method1602(1);
			gl.glActiveTexture(33985);
			gl.glEnable(3553);
			gl.glBindTexture(3553, class120_sub14_sub19_sub1_27_.textureId);
			gl.glTexEnvi(8960, 34161, 7681);
			gl.glTexEnvi(8960, 34176, 34168);
			final float f = (float) (i - GraphicsHD.startX) / (float) class120_sub14_sub19_sub1_27_.anInt3945;
			final float f_28_ = (float) (i_26_ - GraphicsHD.startY) / (float) class120_sub14_sub19_sub1_27_.anInt3948;
			final float f_29_ = (float) (i + this.width - GraphicsHD.startX) / (float) class120_sub14_sub19_sub1_27_.anInt3945;
			final float f_30_ = (float) (i_26_ + this.height - GraphicsHD.startY) / (float) class120_sub14_sub19_sub1_27_.anInt3948;
			i += this.offsetX;
			i_26_ += this.offsetY;
			gl.glBegin(6);
			gl.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
			final float f_31_ = (float) this.width / (float) this.anInt3945;
			final float f_32_ = (float) this.height / (float) this.anInt3948;
			gl.glMultiTexCoord2f(33985, f_29_, f_28_);
			gl.glTexCoord2f(f_31_, 0.0F);
			gl.glVertex2f(i + this.width, HDToolkit.canvasHeight - i_26_);
			gl.glMultiTexCoord2f(33985, f, f_28_);
			gl.glTexCoord2f(0.0F, 0.0F);
			gl.glVertex2f(i, HDToolkit.canvasHeight - i_26_);
			gl.glMultiTexCoord2f(33985, f, f_30_);
			gl.glTexCoord2f(0.0F, f_32_);
			gl.glVertex2f(i, HDToolkit.canvasHeight - (i_26_ + this.height));
			gl.glMultiTexCoord2f(33985, f_29_, f_30_);
			gl.glTexCoord2f(f_31_, f_32_);
			gl.glVertex2f(i + this.width, HDToolkit.canvasHeight - (i_26_ + this.height));
			gl.glEnd();
			gl.glTexEnvi(8960, 34161, 8448);
			gl.glTexEnvi(8960, 34176, 5890);
			gl.glDisable(3553);
			gl.glActiveTexture(33984);
		}
	}

	final void method1599(final int i, final int i_33_, final int i_34_, final int i_35_) {
		HDToolkit.method510();
		final GL gl = HDToolkit.gl;
		HDToolkit.bindTexture2D(this.textureId);
		method1602(1);
		float f = (float) this.width / (float) this.anInt3945;
		float f_36_ = (float) this.height / (float) this.anInt3948;
		f *= i_34_;
		f_36_ *= i_35_;
		final int i_37_ = i + this.offsetX;
		final int i_38_ = i_37_ + this.width * i_34_;
		final int i_39_ = HDToolkit.canvasHeight - i_33_ - this.offsetY;
		final int i_40_ = i_39_ - this.height * i_35_;
		gl.glBegin(6);
		gl.glTexCoord2f(f, 0.0F);
		gl.glVertex2f(i_38_, i_39_);
		gl.glTexCoord2f(0.0F, 0.0F);
		gl.glVertex2f(i_37_, i_39_);
		gl.glTexCoord2f(0.0F, f_36_);
		gl.glVertex2f(i_37_, i_40_);
		gl.glTexCoord2f(f, f_36_);
		gl.glVertex2f(i_38_, i_40_);
		gl.glEnd();
	}

	final void method1600(final int i, final int i_41_, final int i_42_, final int i_43_, final int i_44_, final int i_45_, final int i_46_, final int i_47_, final HDSprite class120_sub14_sub19_sub1_48_) {
		if (class120_sub14_sub19_sub1_48_ != null) {
			HDToolkit.method510();
			HDToolkit.bindTexture2D(class120_sub14_sub19_sub1_48_.textureId);
			class120_sub14_sub19_sub1_48_.method1602(1);
			final GL gl = HDToolkit.gl;
			HDToolkit.bindTexture2D(this.textureId);
			method1602(1);
			gl.glActiveTexture(33985);
			gl.glEnable(3553);
			gl.glBindTexture(3553, class120_sub14_sub19_sub1_48_.textureId);
			gl.glTexEnvi(8960, 34161, 7681);
			gl.glTexEnvi(8960, 34176, 34168);
			final int i_49_ = i_42_ / 2;
			final int i_50_ = i_43_ / 2;
			int i_53_ = (int) (Math.sin(i_46_ / 326.11) * 65536.0);
			int i_54_ = (int) (Math.cos(i_46_ / 326.11) * 65536.0);
			i_53_ = i_53_ * i_47_ >> 8;
			i_54_ = i_54_ * i_47_ >> 8;
			final int i_55_ = (i_44_ << 16) - i_50_ * i_53_ - i_49_ * i_54_;
			final int i_56_ = (i_45_ << 16) - i_50_ * i_54_ + i_49_ * i_53_;
			final int i_57_ = (i_44_ << 16) - i_50_ * i_53_ + i_49_ * i_54_;
			final int i_58_ = (i_45_ << 16) - i_50_ * i_54_ - i_49_ * i_53_;
			final int i_59_ = (i_44_ << 16) + i_50_ * i_53_ - i_49_ * i_54_;
			final int i_60_ = (i_45_ << 16) + i_50_ * i_54_ + i_49_ * i_53_;
			final int i_61_ = (i_44_ << 16) + i_50_ * i_53_ + i_49_ * i_54_;
			final int i_62_ = (i_45_ << 16) + i_50_ * i_54_ - i_49_ * i_53_;
			final float f = (float) class120_sub14_sub19_sub1_48_.width / (float) class120_sub14_sub19_sub1_48_.anInt3945;
			final float f_63_ = (float) class120_sub14_sub19_sub1_48_.height / (float) class120_sub14_sub19_sub1_48_.anInt3948;
			gl.glBegin(6);
			gl.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
			final float f_64_ = 65536.0F * this.anInt3945;
			final float f_65_ = 65536 * this.anInt3948;
			gl.glMultiTexCoord2f(33985, f, 0.0F);
			gl.glTexCoord2f(i_57_ / f_64_, i_58_ / f_65_);
			gl.glVertex2f(i + i_42_, HDToolkit.canvasHeight - i_41_);
			gl.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			gl.glTexCoord2f(i_55_ / f_64_, i_56_ / f_65_);
			gl.glVertex2f(i, HDToolkit.canvasHeight - i_41_);
			gl.glMultiTexCoord2f(33985, 0.0F, f_63_);
			gl.glTexCoord2f(i_59_ / f_64_, i_60_ / f_65_);
			gl.glVertex2f(i, HDToolkit.canvasHeight - (i_41_ + i_43_));
			gl.glMultiTexCoord2f(33985, f, f_63_);
			gl.glTexCoord2f(i_61_ / f_64_, i_62_ / f_65_);
			gl.glVertex2f(i + i_42_, HDToolkit.canvasHeight - (i_41_ + i_43_));
			gl.glEnd();
			gl.glTexEnvi(8960, 34161, 8448);
			gl.glTexEnvi(8960, 34176, 5890);
			gl.glDisable(3553);
			gl.glActiveTexture(33984);
		}
	}

	@Override
	final void method1585(int i, int i_66_, int i_67_, int i_68_, final int i_69_) {
		if (i_67_ > 0 && i_68_ > 0) {
			HDToolkit.method539();
			final int i_70_ = this.width;
			final int i_71_ = this.height;
			int i_72_ = 0;
			int i_73_ = 0;
			final int i_74_ = this.trimWidth;
			final int i_75_ = this.trimHeight;
			final int i_76_ = (i_74_ << 16) / i_67_;
			final int i_77_ = (i_75_ << 16) / i_68_;
			if (this.offsetX > 0) {
				final int i_78_ = ((this.offsetX << 16) + i_76_ - 1) / i_76_;
				i += i_78_;
				i_72_ += i_78_ * i_76_ - (this.offsetX << 16);
			}
			if (this.offsetY > 0) {
				final int i_79_ = ((this.offsetY << 16) + i_77_ - 1) / i_77_;
				i_66_ += i_79_;
				i_73_ += i_79_ * i_77_ - (this.offsetY << 16);
			}
			if (i_70_ < i_74_) {
				i_67_ = ((i_70_ << 16) - i_72_ + i_76_ - 1) / i_76_;
			}
			if (i_71_ < i_75_) {
				i_68_ = ((i_71_ << 16) - i_73_ + i_77_ - 1) / i_77_;
			}
			final GL gl = HDToolkit.gl;
			HDToolkit.bindTexture2D(this.textureId);
			method1602(1);
			final float f = i;
			final float f_80_ = f + i_67_;
			final float f_81_ = HDToolkit.canvasHeight - i_66_;
			final float f_82_ = f_81_ - i_68_;
			final float f_83_ = (float) this.width / (float) this.anInt3945;
			final float f_84_ = (float) this.height / (float) this.anInt3948;
			final float f_85_ = i_69_ / 256.0F;
			gl.glBegin(6);
			gl.glColor4f(1.0F, 1.0F, 1.0F, f_85_);
			gl.glTexCoord2f(f_83_, 0.0F);
			gl.glVertex2f(f_80_, f_81_);
			gl.glTexCoord2f(0.0F, 0.0F);
			gl.glVertex2f(f, f_81_);
			gl.glTexCoord2f(0.0F, f_84_);
			gl.glVertex2f(f, f_82_);
			gl.glTexCoord2f(f_83_, f_84_);
			gl.glVertex2f(f_80_, f_82_);
			gl.glEnd();
		}
	}

	@Override
	final void drawReg(int x, int i_86_) {
		HDToolkit.method510();
		x += this.offsetX;
		i_86_ += this.offsetY;
		final GL gl = HDToolkit.gl;
		HDToolkit.bindTexture2D(this.textureId);
		method1602(1);
		gl.glTranslatef(x, HDToolkit.canvasHeight - i_86_, 0.0F);
		gl.glCallList(listId);
		gl.glLoadIdentity();
	}

	final void method1601(int i, int i_87_, final int i_88_, final int i_89_, final int i_90_, final int i_91_) {
		HDToolkit.method510();
		final GL gl = HDToolkit.gl;
		HDToolkit.bindTexture2D(this.textureId);
		method1602(2);
		i -= this.offsetX << 4;
		i_87_ -= this.offsetY << 4;
		gl.glTranslatef(i_88_ / 16.0F, HDToolkit.canvasHeight - i_89_ / 16.0F, 0.0F);
		gl.glRotatef(-i_90_ * 0.005493164F, 0.0F, 0.0F, 1.0F);
		if (i_91_ != 4096) {
			gl.glScalef(i_91_ / 4096.0F, i_91_ / 4096.0F, 0.0F);
		}
		gl.glTranslatef(-i / 16.0F, i_87_ / 16.0F, 0.0F);
		gl.glCallList(listId);
		gl.glLoadIdentity();
	}

	@Override
	final void method1592(int i, int i_92_) {
		HDToolkit.method510();
		i += this.offsetX;
		i_92_ += this.offsetY;
		final GL gl = HDToolkit.gl;
		HDToolkit.bindTexture2D(this.textureId);
		method1602(1);
		gl.glTranslatef(i, HDToolkit.canvasHeight - i_92_, 0.0F);
		final float f = (float) this.width / (float) this.anInt3945;
		final float f_93_ = (float) this.height / (float) this.anInt3948;
		gl.glBegin(6);
		gl.glTexCoord2f(0.0F, 0.0F);
		gl.glVertex2f(this.width, 0.0F);
		gl.glTexCoord2f(f, 0.0F);
		gl.glVertex2f(0.0F, 0.0F);
		gl.glTexCoord2f(f, f_93_);
		gl.glVertex2f(0.0F, -this.height);
		gl.glTexCoord2f(0.0F, f_93_);
		gl.glVertex2f(this.width, -this.height);
		gl.glEnd();
		gl.glLoadIdentity();
	}

	HDSprite(final int i, final int i_94_, final int i_95_, final int i_96_, final int i_97_, final int i_98_, final int[] is) {
		this.textureId = -1;
		this.trimWidth = i;
		this.trimHeight = i_94_;
		this.offsetX = i_95_;
		this.offsetY = i_96_;
		this.width = i_97_;
		this.height = i_98_;
		method1596(is);
		method1597();
	}

	HDSprite(final LDSprite ldSprite) {
		this.textureId = -1;
		this.trimWidth = ldSprite.trimWidth;
		this.trimHeight = ldSprite.trimHeight;
		this.offsetX = ldSprite.offsetX;
		this.offsetY = ldSprite.offsetY;
		this.width = ldSprite.width;
		this.height = ldSprite.height;
		method1596(ldSprite.pixels);
		method1597();
	}

	@Override
	final void method1588(int i, int i_99_, int i_100_, int i_101_) {
		if (i_100_ > 0 && i_101_ > 0) {
			HDToolkit.method510();
			final int i_102_ = this.width;
			final int i_103_ = this.height;
			int i_104_ = 0;
			int i_105_ = 0;
			final int i_106_ = this.trimWidth;
			final int i_107_ = this.trimHeight;
			final int i_108_ = (i_106_ << 16) / i_100_;
			final int i_109_ = (i_107_ << 16) / i_101_;
			if (this.offsetX > 0) {
				final int i_110_ = ((this.offsetX << 16) + i_108_ - 1) / i_108_;
				i += i_110_;
				i_104_ += i_110_ * i_108_ - (this.offsetX << 16);
			}
			if (this.offsetY > 0) {
				final int i_111_ = ((this.offsetY << 16) + i_109_ - 1) / i_109_;
				i_99_ += i_111_;
				i_105_ += i_111_ * i_109_ - (this.offsetY << 16);
			}
			if (i_102_ < i_106_) {
				i_100_ = ((i_102_ << 16) - i_104_ + i_108_ - 1) / i_108_;
			}
			if (i_103_ < i_107_) {
				i_101_ = ((i_103_ << 16) - i_105_ + i_109_ - 1) / i_109_;
			}
			final GL gl = HDToolkit.gl;
			HDToolkit.bindTexture2D(this.textureId);
			method1602(2);
			final float f = i;
			final float f_112_ = f + i_100_;
			final float f_113_ = HDToolkit.canvasHeight - i_99_;
			final float f_114_ = f_113_ - i_101_;
			final float f_115_ = (float) this.width / (float) this.anInt3945;
			final float f_116_ = (float) this.height / (float) this.anInt3948;
			gl.glBegin(6);
			gl.glTexCoord2f(f_115_, 0.0F);
			gl.glVertex2f(f_112_, f_113_);
			gl.glTexCoord2f(0.0F, 0.0F);
			gl.glVertex2f(f, f_113_);
			gl.glTexCoord2f(0.0F, f_116_);
			gl.glVertex2f(f, f_114_);
			gl.glTexCoord2f(f_115_, f_116_);
			gl.glVertex2f(f_112_, f_114_);
			gl.glEnd();
		}
	}

	final void method1602(final int i) {
		if (anInt3944 != i) {
			anInt3944 = i;
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
}
