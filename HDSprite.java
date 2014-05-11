/* Class120_Sub14_Sub19_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;

import javax.media.opengl.GL;

class HDSprite extends AbstractSprite {
	int anInt3942;
	private int anInt3943;
	private int anInt3944 = 0;
	int anInt3945;
	private int anInt3946 = -1;
	int anInt3947 = 0;
	int anInt3948;

	@Override
	final void method1589(int i, int i_0_, final int i_1_, final int i_2_, final int i_3_, final int i_4_) {
		HDToolkit.method510();
		final GL gl = HDToolkit.gl;
		HDToolkit.method514(this.anInt3942);
		method1602(1);
		i -= this.offsetX << 4;
		i_0_ -= this.offsetY << 4;
		gl.glTranslatef(i_1_ / 16.0F, HDToolkit.canvasHeight - i_2_ / 16.0F, 0.0F);
		gl.glRotatef(i_3_ * 0.005493164F, 0.0F, 0.0F, 1.0F);
		if (i_4_ != 4096) {
			gl.glScalef(i_4_ / 4096.0F, i_4_ / 4096.0F, 0.0F);
		}
		gl.glTranslatef(-i / 16.0F, i_0_ / 16.0F, 0.0F);
		gl.glCallList(anInt3946);
		gl.glLoadIdentity();
	}

	final void method1595(final int i, final int i_5_, final int i_6_, final int i_7_, final int i_8_) {
		HDToolkit.method539();
		final GL gl = HDToolkit.gl;
		HDToolkit.method514(this.anInt3942);
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
		HDToolkit.method514(this.anInt3942);
		method1602(1);
		gl.glTranslatef(i, HDToolkit.canvasHeight - i_15_, 0.0F);
		gl.glCallList(anInt3946);
		gl.glLoadIdentity();
	}

	@Override
	final void method1594(int i, int i_16_, final int i_17_) {
		HDToolkit.method539();
		i += this.offsetX;
		i_16_ += this.offsetY;
		final GL gl = HDToolkit.gl;
		HDToolkit.method514(this.anInt3942);
		method1602(1);
		gl.glColor4f(1.0F, 1.0F, 1.0F, i_17_ / 256.0F);
		gl.glTranslatef(i, HDToolkit.canvasHeight - i_16_, 0.0F);
		gl.glCallList(anInt3946);
		gl.glLoadIdentity();
	}

	@Override
	protected final void finalize() throws Throwable {
		if (this.anInt3942 != -1) {
			Class113.method1001(this.anInt3942, this.anInt3947, anInt3943);
			this.anInt3942 = -1;
			this.anInt3947 = 0;
		}
		if (anInt3946 != -1) {
			Class113.method996(anInt3946, anInt3943);
			anInt3946 = -1;
		}
		super.finalize();
	}

	void method1596(final int[] pixels) {
		this.anInt3945 = Class120_Sub12_Sub17.method1283(this.width, (byte) 90);
		this.anInt3948 = Class120_Sub12_Sub17.method1283(this.height, (byte) 112);
		final byte[] is_18_ = new byte[this.anInt3945 * this.anInt3948 * 4];
		int i = 0;
		int i_19_ = 0;
		final int i_20_ = (this.anInt3945 - this.width) * 4;
		for (int i_21_ = 0; i_21_ < this.height; i_21_++) {
			for (int i_22_ = 0; i_22_ < this.width; i_22_++) {
				final int i_23_ = pixels[i_19_++];
				if (i_23_ != 0) {
					is_18_[i++] = (byte) (i_23_ >> 16);
					is_18_[i++] = (byte) (i_23_ >> 8);
					is_18_[i++] = (byte) i_23_;
					is_18_[i++] = (byte) -1;
				} else {
					i += 4;
				}
			}
			i += i_20_;
		}
		final ByteBuffer bytebuffer = ByteBuffer.wrap(is_18_);
		final GL gl = HDToolkit.gl;
		if (this.anInt3942 == -1) {
			final int[] is_24_ = new int[1];
			gl.glGenTextures(1, is_24_, 0);
			this.anInt3942 = is_24_[0];
			anInt3943 = Class113.anInt1083;
		}
		HDToolkit.method514(this.anInt3942);
		gl.glTexImage2D(3553, 0, 6408, this.anInt3945, this.anInt3948, 0, 6408, 5121, bytebuffer);
		Class113.anInt1086 += bytebuffer.limit() - this.anInt3947;
		this.anInt3947 = bytebuffer.limit();
	}

	private final void method1597() {
		final float f = (float) this.width / (float) this.anInt3945;
		final float f_25_ = (float) this.height / (float) this.anInt3948;
		final GL gl = HDToolkit.gl;
		if (anInt3946 == -1) {
			anInt3946 = gl.glGenLists(1);
			anInt3943 = Class113.anInt1083;
		}
		gl.glNewList(anInt3946, 4864);
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
			HDToolkit.method514(class120_sub14_sub19_sub1_27_.anInt3942);
			class120_sub14_sub19_sub1_27_.method1602(1);
			final GL gl = HDToolkit.gl;
			HDToolkit.method514(this.anInt3942);
			method1602(1);
			gl.glActiveTexture(33985);
			gl.glEnable(3553);
			gl.glBindTexture(3553, class120_sub14_sub19_sub1_27_.anInt3942);
			gl.glTexEnvi(8960, 34161, 7681);
			gl.glTexEnvi(8960, 34176, 34168);
			final float f = (float) (i - GraphicsHD.anInt602) / (float) class120_sub14_sub19_sub1_27_.anInt3945;
			final float f_28_ = (float) (i_26_ - GraphicsHD.anInt605) / (float) class120_sub14_sub19_sub1_27_.anInt3948;
			final float f_29_ = (float) (i + this.width - GraphicsHD.anInt602) / (float) class120_sub14_sub19_sub1_27_.anInt3945;
			final float f_30_ = (float) (i_26_ + this.height - GraphicsHD.anInt605) / (float) class120_sub14_sub19_sub1_27_.anInt3948;
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
		HDToolkit.method514(this.anInt3942);
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
			HDToolkit.method514(class120_sub14_sub19_sub1_48_.anInt3942);
			class120_sub14_sub19_sub1_48_.method1602(1);
			final GL gl = HDToolkit.gl;
			HDToolkit.method514(this.anInt3942);
			method1602(1);
			gl.glActiveTexture(33985);
			gl.glEnable(3553);
			gl.glBindTexture(3553, class120_sub14_sub19_sub1_48_.anInt3942);
			gl.glTexEnvi(8960, 34161, 7681);
			gl.glTexEnvi(8960, 34176, 34168);
			final int i_49_ = -i_42_ / 2;
			final int i_50_ = -i_43_ / 2;
			final int i_51_ = -i_49_;
			final int i_52_ = -i_50_;
			int i_53_ = (int) (Math.sin(i_46_ / 326.11) * 65536.0);
			int i_54_ = (int) (Math.cos(i_46_ / 326.11) * 65536.0);
			i_53_ = i_53_ * i_47_ >> 8;
			i_54_ = i_54_ * i_47_ >> 8;
			final int i_55_ = (i_44_ << 16) + i_50_ * i_53_ + i_49_ * i_54_;
			final int i_56_ = (i_45_ << 16) + i_50_ * i_54_ - i_49_ * i_53_;
			final int i_57_ = (i_44_ << 16) + i_50_ * i_53_ + i_51_ * i_54_;
			final int i_58_ = (i_45_ << 16) + i_50_ * i_54_ - i_51_ * i_53_;
			final int i_59_ = (i_44_ << 16) + i_52_ * i_53_ + i_49_ * i_54_;
			final int i_60_ = (i_45_ << 16) + i_52_ * i_54_ - i_49_ * i_53_;
			final int i_61_ = (i_44_ << 16) + i_52_ * i_53_ + i_51_ * i_54_;
			final int i_62_ = (i_45_ << 16) + i_52_ * i_54_ - i_51_ * i_53_;
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
			HDToolkit.method514(this.anInt3942);
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
	final void method1587(int i, int i_86_) {
		HDToolkit.method510();
		i += this.offsetX;
		i_86_ += this.offsetY;
		final GL gl = HDToolkit.gl;
		HDToolkit.method514(this.anInt3942);
		method1602(1);
		gl.glTranslatef(i, HDToolkit.canvasHeight - i_86_, 0.0F);
		gl.glCallList(anInt3946);
		gl.glLoadIdentity();
	}

	final void method1601(int i, int i_87_, final int i_88_, final int i_89_, final int i_90_, final int i_91_) {
		HDToolkit.method510();
		final GL gl = HDToolkit.gl;
		HDToolkit.method514(this.anInt3942);
		method1602(2);
		i -= this.offsetX << 4;
		i_87_ -= this.offsetY << 4;
		gl.glTranslatef(i_88_ / 16.0F, HDToolkit.canvasHeight - i_89_ / 16.0F, 0.0F);
		gl.glRotatef(-i_90_ * 0.005493164F, 0.0F, 0.0F, 1.0F);
		if (i_91_ != 4096) {
			gl.glScalef(i_91_ / 4096.0F, i_91_ / 4096.0F, 0.0F);
		}
		gl.glTranslatef(-i / 16.0F, i_87_ / 16.0F, 0.0F);
		gl.glCallList(anInt3946);
		gl.glLoadIdentity();
	}

	@Override
	final void method1592(int i, int i_92_) {
		HDToolkit.method510();
		i += this.offsetX;
		i_92_ += this.offsetY;
		final GL gl = HDToolkit.gl;
		HDToolkit.method514(this.anInt3942);
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
		this.anInt3942 = -1;
		this.trimWidth = i;
		this.trimHeight = i_94_;
		this.offsetX = i_95_;
		this.offsetY = i_96_;
		this.width = i_97_;
		this.height = i_98_;
		method1596(is);
		method1597();
	}

	HDSprite(final LDSprite class120_sub14_sub19_sub2) {
		this.anInt3942 = -1;
		this.trimWidth = class120_sub14_sub19_sub2.trimWidth;
		this.trimHeight = class120_sub14_sub19_sub2.trimHeight;
		this.offsetX = class120_sub14_sub19_sub2.offsetX;
		this.offsetY = class120_sub14_sub19_sub2.offsetY;
		this.width = class120_sub14_sub19_sub2.width;
		this.height = class120_sub14_sub19_sub2.height;
		method1596(class120_sub14_sub19_sub2.pixels);
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
			HDToolkit.method514(this.anInt3942);
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
