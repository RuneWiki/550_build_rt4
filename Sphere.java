/* Class97 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;

import javax.media.opengl.GL;

final class Sphere {
	private LDSprite aClass120_Sub14_Sub19_Sub2_920;
	private static ByteBuffer aByteBuffer921;
	private final int size;
	private static int[] screenBounds = new int[4];
	private int rotateY;
	private int anInt925;
	private static int anInt926 = -1;
	private static ByteBuffer aByteBuffer927;
	private final int mediaId;
	private final int glowColor;
	int anInt930;
	private int textureSize;
	private final int z;
	private final int x;
	private static Model aClass180_Sub2_934;
	private int anInt935 = -1;
	private boolean aBoolean936;
	private int rotateX;
	private int anInt938 = -1;
	private final int y;
	private final boolean fixedSize;//if true doesn't scale how close the thing is to screen
	private static byte[] aByteArray941;
	private static int anInt942 = -1;
	private final int type;//0 - flat texture, 1 - 3d 17 points polygon with texture, 2 - model
	static js5 aClass50_360;

	private final void method791(final int[] is, int i, final int i_0_, int i_1_, int i_2_, int i_3_, final int i_4_, final int i_5_, final int i_6_, final int i_7_, final int i_8_, final int i_9_) {
		final int i_10_ = i_1_;
		for (int i_11_ = -i_6_; i_11_ < 0; i_11_++) {
			final int i_12_ = (i_2_ >> 16) * i_9_;
			for (int i_13_ = -i_5_; i_13_ < 0; i_13_++) {
				if (is[i_3_] != 0) {
					i = is[i_3_];
					int i_14_ = (aByteArray941[(i_1_ >> 16) + i_12_] & 0xff) + 64;
					if (i_14_ > 255) {
						i_14_ = 255;
					}
					final int i_15_ = 256 - i_14_;
					is[i_3_] = ~0xffffff | ((i_0_ & 0xff00ff) * i_15_ + (i & 0xff00ff) * i_14_ & ~0xff00ff) + ((i_0_ & 0xff00) * i_15_ + (i & 0xff00) * i_14_ & 0xff0000) >> 8;
				}
				i_3_++;
				i_1_ += i_7_;
			}
			i_2_ += i_8_;
			i_1_ = i_10_;
			i_3_ += i_4_;
		}
	}

	private final void method792(final Sphere class97_16_) {
		method800();
		method808();
		final GL gl = HDToolkit.gl;
		GraphicsHD.copyBounds(screenBounds);
		GraphicsHD.clipRect();
		gl.glClearColor(((glowColor & 0xff0000) >> 16) / 255.0F, ((glowColor & 0xff00) >> 8) / 255.0F, (glowColor & 0xff) / 255.0F, 0.0F);
		gl.glClear(16640);
		int lightX_ = 0;
		int lightY_ = 0;
		int lightZ_ = 256;
		if (class97_16_ != null) {
			if (class97_16_.fixedSize) {
				lightX_ = -class97_16_.x;
				lightY_ = -class97_16_.y;
				lightZ_ = -class97_16_.z;
			} else {
				lightX_ = x - class97_16_.x;
				lightY_ = y - class97_16_.y;
				lightZ_ = z - class97_16_.z;
			}
		}
		Class12.method137(-1.0F, 1.0F, -1.0F, 1.0F, textureSize, textureSize);
		if (rotateX != 0) {
			final int i_19_ = Rasterizer.sinTable[rotateX];
			final int i_20_ = Rasterizer.cosTable[rotateX];
			final int i_21_ = lightY_ * i_20_ - lightZ_ * i_19_ + 32767 >> 16;
			lightZ_ = lightY_ * i_19_ + lightZ_ * i_20_ + 32767 >> 16;
			lightY_ = i_21_;
		}
		if (rotateY != 0) {
			final int i_22_ = rotateY - 1024 & 0x7ff;
			final int i_23_ = Rasterizer.sinTable[i_22_];
			final int i_24_ = Rasterizer.cosTable[i_22_];
			final int i_25_ = lightZ_ * i_23_ + lightX_ * i_24_ + 32767 >> 16;
			lightZ_ = lightZ_ * i_24_ - lightX_ * i_23_ + 32767 >> 16;
			lightX_ = i_25_;
		}
		AtmosphereManager.setLightPosition(-lightX_, -lightY_, lightZ_);
		AtmosphereManager.setLightParams(16777215, 0.5F, 0.5F, 1.0F);
		AtmosphereManager.applyLightPosition();
		if (glowColor != 0) {
			gl.glScalef(0.8125F, 0.8125F, 1.0F);
		}
		Rasterizer.anInterface5_973.method28(textureSize, mediaId);
		HDToolkit.toggleLighting(true);
		if (HDToolkit.vertexBufferAsObject) {
			gl.glBindBufferARB(34962, 0);
			gl.glBindBufferARB(34963, 0);
		}
		gl.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		gl.glDisableClientState(32886);
		gl.glNormalPointer(5126, 20, aByteBuffer921.position(0));
		gl.glVertexPointer(2, 5126, 20, aByteBuffer921.position(0));
		gl.glTexCoordPointer(2, 5126, 20, aByteBuffer921.position(12));
		gl.glDrawElements(5, aByteBuffer927.limit() / 2, 5123, aByteBuffer927.position(0));
		gl.glEnableClientState(32886);
		HDToolkit.toggleLighting(false);
		if (glowColor != 0) {
			Class120_Sub14_Sub13.method1532(0, 0);
			HDToolkit.method511(1);
			HDToolkit.method521(0);
			HDToolkit.bindTexture2D(anInt942);
			gl.glColorMask(true, true, true, false);
			gl.glTexEnvi(8960, 34176, 34168);
			gl.glTexEnvi(8960, 34200, 771);
			gl.glBegin(7);
			gl.glColor4ub((byte) (glowColor >> 16), (byte) (glowColor >> 8), (byte) glowColor, (byte) 127);
			gl.glTexCoord2f(0.0F, 0.0F);
			gl.glVertex2i(-1, -1);
			gl.glTexCoord2f(1.0F, 0.0F);
			gl.glVertex2i(1, -1);
			gl.glTexCoord2f(1.0F, 1.0F);
			gl.glVertex2i(1, 1);
			gl.glTexCoord2f(0.0F, 1.0F);
			gl.glVertex2i(-1, 1);
			gl.glEnd();
			gl.glTexEnvi(8960, 34200, 770);
			gl.glLoadIdentity();
			gl.glColorMask(true, true, true, true);
			gl.glBlendFunc(773, 772);
			gl.glBegin(7);
			gl.glColor4ub((byte) (glowColor >> 16), (byte) (glowColor >> 8), (byte) glowColor, (byte) -1);
			gl.glTexCoord2f(0.0F, 0.0F);
			gl.glVertex2i(-1, -1);
			gl.glTexCoord2f(1.0F, 0.0F);
			gl.glVertex2i(1, -1);
			gl.glTexCoord2f(1.0F, 1.0F);
			gl.glVertex2i(1, 1);
			gl.glTexCoord2f(0.0F, 1.0F);
			gl.glVertex2i(-1, 1);
			gl.glEnd();
			gl.glBlendFunc(770, 771);
			gl.glTexEnvi(8960, 34176, 5890);
		}
		Class12.method133();
		HDToolkit.bindTexture2D(anInt935);
		gl.glCopyTexImage2D(3553, 0, 6408, 0, 0, textureSize, textureSize, 0);
		GraphicsHD.setBounds(screenBounds);
	}

	private final boolean method793(final Sphere class97_26_) {
		final Model class180_sub2 = Model.get(aClass50_360, mediaId, 0);
		if (class180_sub2 == null) {
			return false;
		}
		final GL gl = HDToolkit.gl;
		GraphicsHD.copyBounds(screenBounds);
		GraphicsHD.clipRect();
		gl.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
		gl.glClear(16640);
		int i = 0;
		int i_27_ = 0;
		int i_28_ = 256;
		if (class97_26_ != null) {
			if (class97_26_.fixedSize) {
				i = -class97_26_.x;
				i_27_ = -class97_26_.y;
				i_28_ = -class97_26_.z;
			} else {
				i = x - class97_26_.x;
				i_27_ = y - class97_26_.y;
				i_28_ = z - class97_26_.z;
			}
		}
		class180_sub2.method2287();
		final AbstractModelRenderer class180_sub7 = class180_sub2.toRenderer(64, 768, -i, -i_27_, -i_28_);
		final int i_29_ = (class180_sub7.getMinX() - class180_sub7.getMaxX()) / 2;
		final int i_30_ = (class180_sub7.getMinY() - class180_sub7.getMaxY()) / 2;
		final int i_31_ = i_29_ > i_30_ ? i_29_ : i_30_;
		Class12.method136(-i_31_, i_31_, -i_31_, i_31_, 2048.0F, -2048.0F, textureSize, textureSize);
		if (rotateX != 0) {
			final int i_32_ = Rasterizer.sinTable[rotateX];
			final int i_33_ = Rasterizer.cosTable[rotateX];
			final int i_34_ = i_27_ * i_33_ - i_28_ * i_32_ + 32767 >> 16;
			i_28_ = i_27_ * i_32_ + i_28_ * i_33_ + 32767 >> 16;
			i_27_ = i_34_;
		}
		if (rotateY != 0) {
			final int i_35_ = rotateY - 1024 & 0x7ff;
			final int i_36_ = Rasterizer.sinTable[i_35_];
			final int i_37_ = Rasterizer.cosTable[i_35_];
			final int i_38_ = i_28_ * i_36_ + i * i_37_ + 32767 >> 16;
			i_28_ = i_28_ * i_37_ - i * i_36_ + 32767 >> 16;
			i = i_38_;
		}
		AtmosphereManager.setLightPosition(-i, i_27_, -i_28_);
		AtmosphereManager.setLightParams(16777215, 0.5F, 0.5F, 0.5F);
		AtmosphereManager.applyLightPosition();
		HDToolkit.enableDepthMask();
		HDToolkit.toggleDepthTest(true);
		HDToolkit.toggleLighting(true);
		class180_sub7.method2367(0, 0, 0, 0, -i_29_ - class180_sub7.getMaxX(), -i_30_ - class180_sub7.getMaxY(), 0, -1L);
		HDToolkit.toggleLighting(false);
		HDToolkit.toggleDepthTest(false);
		HDToolkit.disableDepthMask();
		Class12.method133();
		HDToolkit.bindTexture2D(anInt935);
		gl.glCopyTexImage2D(3553, 0, 6408, 0, 0, textureSize, textureSize, 0);
		GraphicsHD.setBounds(screenBounds);
		return true;
	}

	private final void method794() {
		int i = textureSize;
		int i_39_ = textureSize;
		final int i_40_ = 8388608 / i;
		final int i_41_ = 8388608 / i_39_;
		int i_42_ = 0;
		int i_43_ = 0;
		int i_44_ = 0;
		int i_45_ = GraphicsLD.width - i;
		if (i_39_ > GraphicsLD.endY) {
			i_39_ -= i_39_ - GraphicsLD.endY;
		}
		if (GraphicsLD.startY > 0) {
			final int i_46_ = GraphicsLD.startY;
			i_39_ -= i_46_;
			i_44_ += i_46_ * GraphicsLD.width;
			i_43_ += i_41_ * i_46_;
		}
		if (i > GraphicsLD.endX) {
			final int i_47_ = i - GraphicsLD.endX;
			i -= i_47_;
			i_45_ += i_47_;
		}
		if (GraphicsLD.startX > 0) {
			final int i_48_ = GraphicsLD.startX;
			i -= i_48_;
			i_44_ += i_48_;
			i_42_ += i_40_ * i_48_;
			i_45_ += i_48_;
		}
		method810(GraphicsLD.pixels, glowColor, i_42_, i_43_, i_44_, i_45_, i, i_39_, i_40_, i_41_, 128);
	}

	final void method795(final int i, final int i_49_, final int i_50_, final int i_51_, final int i_52_, final int i_53_) {
		int i_54_ = rotateX - i_52_ & 0x7ff;
		int i_55_ = rotateY - i_53_ & 0x7ff;
		if (i_55_ > 1024) {
			i_55_ -= 2048;
		}
		if (i_54_ > 1024) {
			i_54_ -= 2048;
		}
		int i_56_ = i_54_ * i_51_ / 512;
		int i_57_ = i_55_ * i_51_ / -512;
		i_56_ += (i_51_ - anInt925) / 2;
		i_57_ += (i_50_ - anInt925) / 2;
		if (i_56_ < i_51_ && i_56_ + anInt925 > 0 && i_57_ < i_50_ && i_57_ + anInt925 > 0) {
			if (type == 0) {
				Rasterizer.anInterface5_973.method28(textureSize, mediaId);
			} else if (anInt935 != -1) {
				HDToolkit.bindTexture2D(anInt935);
			} else {
				return;
			}
			i_56_ += i_49_;
			i_57_ += i;
			final int i_58_ = i_57_ + anInt925;
			final int i_59_ = i_56_ + anInt925;
			final GL gl = HDToolkit.gl;
			gl.glBegin(7);
			gl.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
			gl.glTexCoord2f(0.0F, 0.0F);
			gl.glVertex2i(i_57_, i_56_);
			gl.glTexCoord2f(0.0F, 1.0F);
			gl.glVertex2i(i_57_, i_59_);
			gl.glTexCoord2f(1.0F, 1.0F);
			gl.glVertex2i(i_58_, i_59_);
			gl.glTexCoord2f(1.0F, 0.0F);
			gl.glVertex2i(i_58_, i_56_);
			gl.glEnd();
		}
	}

	final void method796(final Sphere class97_60_) {
		if (type != 0) {
			final boolean bool = anInt935 == -1 || anInt938 != MemoryManager.anInt1083;
			if (aBoolean936 || bool) {
				if (bool) {
					anInt938 = MemoryManager.anInt1083;
					anInt935 = Class163.method2125(Class163.GL_RGBA, textureSize, textureSize);
				} else {
					HDToolkit.bindTexture2D(anInt935);
					Class163.method2124(Class163.GL_RGBA, textureSize, textureSize);
				}
				if (type == 1) {
					method792(class97_60_);
					aBoolean936 = false;
				} else if (type == 2) {
					aBoolean936 = !method793(class97_60_);
				}
			}
		}
	}

	@Override
	protected final void finalize() throws Throwable {
		method809();
		super.finalize();
	}

	final boolean method797(final int xOff, final int yOff, final int zOff, final int height) {
		int i_64_;
		int i_65_;
		int i_66_;
		if (!fixedSize) {
			i_64_ = x - xOff;
			i_65_ = y - yOff;
			i_66_ = z - zOff;
			this.anInt930 = (int) Math.sqrt(i_64_ * i_64_ + i_65_ * i_65_ + i_66_ * i_66_);
			if (this.anInt930 == 0) {
				this.anInt930 = 1;
			}
			i_64_ = (i_64_ << 8) / this.anInt930;
			i_65_ = (i_65_ << 8) / this.anInt930;
			i_66_ = (i_66_ << 8) / this.anInt930;
		} else {
			this.anInt930 = 1073741823;
			i_64_ = x;
			i_65_ = y;
			i_66_ = z;
		}
		final int i_67_ = (int) (Math.sqrt(i_64_ * i_64_ + i_65_ * i_65_ + i_66_ * i_66_) * 256.0);
		if (i_67_ > 128) {
			i_64_ = (i_64_ << 16) / i_67_;
			i_65_ = (i_65_ << 16) / i_67_;
			i_66_ = (i_66_ << 16) / i_67_;
			anInt925 = size * height / (fixedSize ? 1024 : this.anInt930);
		} else {
			anInt925 = 0;
		}
		if (anInt925 < 8) {
			method809();
			aClass120_Sub14_Sub19_Sub2_920 = null;
			return false;
		}
		int i_68_ = Deque.highestOneBit(anInt925);
		if (i_68_ > 512) {
			i_68_ = 512;
		}
		if (i_68_ != textureSize) {
			textureSize = i_68_;
		}
		rotateX = (int) (Math.asin(i_65_ / 256.0F) * 325.9493103027344) & 0x7ff;
		rotateY = (int) (Math.atan2(i_64_, -i_66_) * 325.9493103027344) & 0x7ff;
		aBoolean936 = true;
		aClass120_Sub14_Sub19_Sub2_920 = null;
		return true;
	}

	private static final void method798() {
		if (aByteArray941 == null) {
			aByteArray941 = new byte[16384];
			for (int i = 0; i < 64; i++) {
				int i_69_ = 64 - i;
				i_69_ *= i_69_;
				final int i_70_ = 128 - i - 1;
				final int i_71_ = i * 128;
				final int i_72_ = i_70_ * 128;
				for (int i_73_ = 0; i_73_ < 64; i_73_++) {
					int i_74_ = 64 - i_73_;
					i_74_ *= i_74_;
					final int i_75_ = 128 - i_73_ - 1;
					int i_76_ = 256 - (i_74_ + i_69_ << 8) / 4096;
					i_76_ = i_76_ * 16 * 192 / 1536;
					if (i_76_ < 0) {
						i_76_ = 0;
					} else if (i_76_ > 255) {
						i_76_ = 255;
					}
					aByteArray941[i_71_ + i_73_] = aByteArray941[i_71_ + i_75_] = aByteArray941[i_72_ + i_73_] = aByteArray941[i_72_ + i_75_] = (byte) i_76_;
				}
			}
		}
	}

	private static final void method799() {
		if (aClass180_Sub2_934 == null) {
			final Model class180_sub2 = aClass180_Sub2_934 = new Model(260, 480, 0);
			final int[] is = class180_sub2.xVertices;
			final int[] is_77_ = class180_sub2.yVertices;
			final int[] is_78_ = class180_sub2.zVertices;
			final int[] is_79_ = class180_sub2.facesA;
			final int[] is_80_ = class180_sub2.facesB;
			final int[] is_81_ = class180_sub2.facesC;
			class180_sub2.vertexCount = 2;
			is[0] = 0;
			is_77_[0] = 128;
			is_78_[0] = 0;
			is[1] = 0;
			is_77_[1] = -128;
			is_78_[1] = 0;
			for (int i = 0; i <= 16; i++) {
				final int i_82_ = i * 1024 / 16;
				final int i_83_ = Rasterizer.sinTable[i_82_] >> 1;
				final int i_84_ = Rasterizer.cosTable[i_82_] >> 1;
				for (int i_85_ = 1; i_85_ < 16; i_85_++) {
					final int i_86_ = i_85_ * 1024 / 16;
					final int i_87_ = Rasterizer.cosTable[i_86_] >> 9;
					final int i_88_ = (Rasterizer.sinTable[i_86_] >> 1) * i_83_ >> 23;
					final int i_89_ = (Rasterizer.sinTable[i_86_] >> 1) * i_84_ >> 23;
					is[class180_sub2.vertexCount] = i_89_;
					is_77_[class180_sub2.vertexCount] = i_87_;
					is_78_[class180_sub2.vertexCount] = -i_88_;
					class180_sub2.vertexCount++;
				}
				if (i > 0) {
					int i_90_ = i * 15 + 2;
					int i_91_ = i_90_ - 15;
					is_79_[class180_sub2.triangleCount] = 0;
					is_80_[class180_sub2.triangleCount] = i_91_;
					is_81_[class180_sub2.triangleCount] = i_90_;
					class180_sub2.triangleCount++;
					for (int i_92_ = 1; i_92_ < 15; i_92_++) {
						final int i_93_ = i_91_ + 1;
						final int i_94_ = i_90_ + 1;
						is_79_[class180_sub2.triangleCount] = i_91_;
						is_80_[class180_sub2.triangleCount] = i_93_;
						is_81_[class180_sub2.triangleCount] = i_90_;
						class180_sub2.triangleCount++;
						is_79_[class180_sub2.triangleCount] = i_93_;
						is_80_[class180_sub2.triangleCount] = i_94_;
						is_81_[class180_sub2.triangleCount] = i_90_;
						class180_sub2.triangleCount++;
						i_91_ = i_93_;
						i_90_ = i_94_;
					}
					is_79_[class180_sub2.triangleCount] = i_90_;
					is_80_[class180_sub2.triangleCount] = i_91_;
					is_81_[class180_sub2.triangleCount] = 1;
					class180_sub2.triangleCount++;
				}
			}
			class180_sub2.highestVertexId = class180_sub2.vertexCount;
			class180_sub2.faceTextureIndex = null;
			class180_sub2.faceTextures = null;
			class180_sub2.faceLabelIds = null;
			class180_sub2.vertexLabelIds = null;
			class180_sub2.facePriorities = null;
		}
	}

	private static final void method800() {
		if (aByteBuffer921 == null) {
			final Buffer class120_sub7 = new Buffer(1088);
			final Buffer class120_sub7_95_ = new Buffer(5140);
			if (HDToolkit.usingBigEndian) {
				class120_sub7_95_.putFloatAsInt(0.0F);
				class120_sub7_95_.putFloatAsInt(1.0F);
				class120_sub7_95_.putFloatAsInt(0.0F);
				class120_sub7_95_.putFloatAsInt(0.5F);
				class120_sub7_95_.putFloatAsInt(1.0F);
				class120_sub7_95_.putFloatAsInt(0.0F);
				class120_sub7_95_.putFloatAsInt(-1.0F);
				class120_sub7_95_.putFloatAsInt(0.0F);
				class120_sub7_95_.putFloatAsInt(0.5F);
				class120_sub7_95_.putFloatAsInt(0.0F);
			} else {
				class120_sub7_95_.putFloatAsLEInt(0.0F);
				class120_sub7_95_.putFloatAsLEInt(1.0F);
				class120_sub7_95_.putFloatAsLEInt(0.0F);
				class120_sub7_95_.putFloatAsLEInt(0.5F);
				class120_sub7_95_.putFloatAsLEInt(1.0F);
				class120_sub7_95_.putFloatAsLEInt(0.0F);
				class120_sub7_95_.putFloatAsLEInt(-1.0F);
				class120_sub7_95_.putFloatAsLEInt(0.0F);
				class120_sub7_95_.putFloatAsLEInt(0.5F);
				class120_sub7_95_.putFloatAsLEInt(0.0F);
			}
			float f = 0.0F;
			float f_96_ = 0.05882353F;
			for (int i = 0; i <= 16; i++) {
				final int i_97_ = i * 1024 / 16;
				final float f_98_ = Rasterizer.sinTable[i_97_] / 65535.0F;
				final float f_99_ = Rasterizer.cosTable[i_97_] / 65535.0F;
				for (int i_100_ = 1; i_100_ < 16; i_100_++) {
					final int i_101_ = i_100_ * 1024 / 16;
					final float f_102_ = Rasterizer.cosTable[i_101_] / 65535.0F;
					final float f_103_ = Rasterizer.sinTable[i_101_] * f_98_ / 65535.0F;
					final float f_104_ = Rasterizer.sinTable[i_101_] * f_99_ / 65535.0F;
					if (HDToolkit.usingBigEndian) {
						class120_sub7_95_.putFloatAsInt(f_104_);
						class120_sub7_95_.putFloatAsInt(f_102_);
						class120_sub7_95_.putFloatAsInt(f_103_);
						class120_sub7_95_.putFloatAsInt(f);
						class120_sub7_95_.putFloatAsInt(f_96_);
					} else {
						class120_sub7_95_.putFloatAsLEInt(f_104_);
						class120_sub7_95_.putFloatAsLEInt(f_102_);
						class120_sub7_95_.putFloatAsLEInt(f_103_);
						class120_sub7_95_.putFloatAsLEInt(f);
						class120_sub7_95_.putFloatAsLEInt(f_96_);
					}
					f_96_ += 0.05882353F;
				}
				if (i > 0) {
					int i_105_ = i * 15 + 2;
					int i_106_ = i_105_ - 15;
					if (HDToolkit.usingBigEndian) {
						class120_sub7.putShort(0);
						class120_sub7.putShort(0);
						for (int i_107_ = 1; i_107_ < 16; i_107_++) {
							class120_sub7.putShort(i_106_++);
							class120_sub7.putShort(i_105_++);
						}
						class120_sub7.putShort(1);
						class120_sub7.putShort(1);
					} else {
						class120_sub7.method1105(0);
						class120_sub7.method1105(0);
						for (int i_108_ = 1; i_108_ < 16; i_108_++) {
							class120_sub7.method1105(i_106_++);
							class120_sub7.method1105(i_105_++);
						}
						class120_sub7.method1105(1);
						class120_sub7.method1105(1);
					}
				}
				f += 0.05882353F;
				f_96_ = 0.05882353F;
			}
			aByteBuffer921 = ByteBuffer.allocateDirect(class120_sub7_95_.pos);
			aByteBuffer921.put(class120_sub7_95_.buf, 0, class120_sub7_95_.pos);
			aByteBuffer921.flip();
			aByteBuffer927 = ByteBuffer.allocateDirect(class120_sub7.pos);
			aByteBuffer927.put(class120_sub7.buf, 0, class120_sub7.pos);
			aByteBuffer927.flip();
		}
	}

	private final boolean method801(final Sphere class97_109_) {
		if (aClass120_Sub14_Sub19_Sub2_920 == null) {
			if (type == 0) {
				aClass120_Sub14_Sub19_Sub2_920 = Rasterizer.anInterface5_973.method26(true, Rasterizer.brightness, textureSize, mediaId);
			} else if (type == 2) {
				method807(class97_109_);
			} else if (type == 1) {
				method803(class97_109_);
			}
		}
		if (aClass120_Sub14_Sub19_Sub2_920 != null) {
			return true;
		}
		return false;
	}

	final void method802(final int i, final int i_110_, final int i_111_, final int i_112_, final int i_113_, final int i_114_, final Sphere class97_115_) {
		int i_116_ = rotateX - i_113_ & 0x7ff;
		int i_117_ = rotateY - i_114_ & 0x7ff;
		if (i_117_ > 1024) {
			i_117_ -= 2048;
		}
		if (i_116_ > 1024) {
			i_116_ -= 2048;
		}
		int i_118_ = i_116_ * i_112_ / 512;
		int i_119_ = i_117_ * i_112_ / -512;
		i_118_ += (i_112_ - anInt925) / 2;
		i_119_ += (i_111_ - anInt925) / 2;
		if (i_118_ < i_112_ && i_118_ + anInt925 > 0 && i_119_ < i_111_ && i_119_ + anInt925 > 0 && method801(class97_115_)) {
			aClass120_Sub14_Sub19_Sub2_920.method1588(i_119_ + i, i_118_ + i_110_, anInt925, anInt925);
		}
	}

	private final void method803(final Sphere class97_120_) {
		method799();
		method798();
		aClass120_Sub14_Sub19_Sub2_920 = new LDTransparentSprite(textureSize, textureSize);
		GraphicsLD.copyBounds(screenBounds);
		aClass120_Sub14_Sub19_Sub2_920.init2dCanvas();
		Rasterizer.calculateByBounds();
		GraphicsLD.fillRect(0, 0, textureSize, textureSize, 0);
		int i = 0;
		int i_121_ = 0;
		int i_122_ = 256;
		if (class97_120_ != null) {
			if (class97_120_.fixedSize) {
				i = -class97_120_.x;
				i_121_ = -class97_120_.y;
				i_122_ = -class97_120_.z;
			} else {
				i = x - class97_120_.x;
				i_121_ = y - class97_120_.y;
				i_122_ = z - class97_120_.z;
			}
		}
		if (rotateX != 0) {
			final int i_123_ = Rasterizer.sinTable[rotateX];
			final int i_124_ = Rasterizer.cosTable[rotateX];
			final int i_125_ = i_121_ * i_124_ - i_122_ * i_123_ + 32767 >> 16;
			i_122_ = i_121_ * i_123_ + i_122_ * i_124_ + 32767 >> 16;
			i_121_ = i_125_;
		}
		if (rotateY != 0) {
			final int i_126_ = rotateY - 1024 & 0x7ff;
			final int i_127_ = Rasterizer.sinTable[i_126_];
			final int i_128_ = Rasterizer.cosTable[i_126_];
			final int i_129_ = i_122_ * i_127_ + i * i_128_ + 32767 >> 16;
			i_122_ = i_122_ * i_128_ - i * i_127_ + 32767 >> 16;
			i = i_129_;
		}
		ArrayUtils.fillArray(aClass180_Sub2_934.faceColors, 0, aClass180_Sub2_934.triangleCount, (short) Rasterizer.anInterface5_973.getColorPaletteIndex(mediaId));
		final LDModelRenderer class180_sub7_sub1 = aClass180_Sub2_934.method2298(64, 512, -i, -i_121_, -i_122_);
		final int i_130_ = class180_sub7_sub1.getMinX() - class180_sub7_sub1.getMaxX();
		final int i_131_ = class180_sub7_sub1.getMinY() - class180_sub7_sub1.getMaxY();
		if (i_130_ > i_131_) {
			final int i_132_ = glowColor != 0 ? (i_130_ * 16 << 9) / (textureSize * 13) : (i_130_ << 9) / textureSize;
			class180_sub7_sub1.method2400(0, 0, 0, 0, 0, 0, 0, i_132_);
		} else {
			final int i_133_ = glowColor != 0 ? (i_131_ * 16 << 9) / (textureSize * 13) : (i_131_ << 9) / textureSize;
			class180_sub7_sub1.method2400(0, 0, 0, 0, 0, 0, 0, i_133_);
		}
		if (glowColor != 0) {
			method804();
			method794();
		} else {
			for (int i_134_ = 0; i_134_ < GraphicsLD.pixels.length; i_134_++) {
				if (GraphicsLD.pixels[i_134_] != 0) {
					GraphicsLD.pixels[i_134_] |= ~0xffffff;
				}
			}
		}
		ClanMember.fullscreenGraphics.init2dCanvas();
		GraphicsLD.setBounds(screenBounds);
		Rasterizer.calculateByBounds();
	}

	private final void method804() {
		final int i = 3 * textureSize / 32;
		final int i_135_ = i;
		int i_136_ = 13 * textureSize / 16;
		int i_137_ = i_136_;
		final int i_138_ = 8388608 / i_136_;
		final int i_139_ = 8388608 / i_137_;
		int i_140_ = i + i_135_ * GraphicsLD.width;
		int i_141_ = GraphicsLD.width - i_136_;
		int i_142_ = 0;
		int i_143_ = 0;
		if (i_135_ + i_137_ > GraphicsLD.endY) {
			i_137_ -= i_135_ + i_137_ - GraphicsLD.endY;
		}
		if (i_135_ < GraphicsLD.startY) {
			final int i_144_ = GraphicsLD.startY - i_135_;
			i_137_ -= i_144_;
			i_140_ += i_144_ * GraphicsLD.width;
			i_143_ += i_139_ * i_144_;
		}
		if (i + i_136_ > GraphicsLD.endX) {
			final int i_145_ = i + i_136_ - GraphicsLD.endX;
			i_136_ -= i_145_;
			i_141_ += i_145_;
		}
		if (i < GraphicsLD.startX) {
			final int i_146_ = GraphicsLD.startX - i;
			i_136_ -= i_146_;
			i_140_ += i_146_;
			i_142_ += i_138_ * i_146_;
			i_141_ += i_146_;
		}
		method791(GraphicsLD.pixels, 0, glowColor, i_142_, i_143_, i_140_, i_141_, i_136_, i_137_, i_138_, i_139_, 128);
	}

	static final void method806() {
		if (anInt942 != -1) {
			MemoryManager.method999(anInt942, 0, anInt926);
		}
		anInt942 = -1;
		anInt926 = -1;
		aByteBuffer921 = null;
		aByteBuffer927 = null;
		aClass180_Sub2_934 = null;
		aByteArray941 = null;
	}

	private final void method807(final Sphere class97_147_) {
		final Model class180_sub2 = Model.get(aClass50_360, mediaId, 0);
		if (class180_sub2 != null) {
			aClass120_Sub14_Sub19_Sub2_920 = new LDSprite(textureSize, textureSize);
			GraphicsLD.copyBounds(screenBounds);
			aClass120_Sub14_Sub19_Sub2_920.init2dCanvas();
			Rasterizer.calculateByBounds();
			GraphicsLD.fillRect(0, 0, textureSize, textureSize, 0);
			int i = 0;
			int i_148_ = 0;
			int i_149_ = 256;
			if (class97_147_ != null) {
				if (class97_147_.fixedSize) {
					i = -class97_147_.x;
					i_148_ = -class97_147_.y;
					i_149_ = -class97_147_.z;
				} else {
					i = x - class97_147_.x;
					i_148_ = y - class97_147_.y;
					i_149_ = z - class97_147_.z;
				}
			}
			if (rotateX != 0) {
				final int i_150_ = Rasterizer.sinTable[rotateX];
				final int i_151_ = Rasterizer.cosTable[rotateX];
				final int i_152_ = i_148_ * i_151_ - i_149_ * i_150_ + 32767 >> 16;
				i_149_ = i_148_ * i_150_ + i_149_ * i_151_ + 32767 >> 16;
				i_148_ = i_152_;
			}
			if (rotateY != 0) {
				final int i_153_ = rotateY - 1024 & 0x7ff;
				final int i_154_ = Rasterizer.sinTable[i_153_];
				final int i_155_ = Rasterizer.cosTable[i_153_];
				final int i_156_ = i_149_ * i_154_ + i * i_155_ + 32767 >> 16;
				i_149_ = i_149_ * i_155_ - i * i_154_ + 32767 >> 16;
				i = i_156_;
			}
			final LDModelRenderer class180_sub7_sub1 = class180_sub2.method2298(64, 768, -i, -i_148_, -i_149_);
			final int i_157_ = class180_sub7_sub1.getMinX() - class180_sub7_sub1.getMaxX();
			final int i_158_ = class180_sub7_sub1.getMinY() - class180_sub7_sub1.getMaxY();
			final int i_159_ = class180_sub7_sub1.getMaxX() + i_157_ / 2;
			final int i_160_ = class180_sub7_sub1.getMaxY() + i_158_ / 2;
			if (i_157_ > i_158_) {
				class180_sub7_sub1.method2400(0, 0, 0, 0, -i_159_, -i_160_, 0, (i_157_ << 9) / textureSize);
			} else {
				class180_sub7_sub1.method2400(0, 0, 0, 0, -i_159_, -i_160_, 0, (i_158_ << 9) / textureSize);
			}
			ClanMember.fullscreenGraphics.init2dCanvas();
			GraphicsLD.setBounds(screenBounds);
			Rasterizer.calculateByBounds();
		}
	}

	private static final void method808() {
		method798();
		if (anInt942 == -1 || anInt926 != MemoryManager.anInt1083) {
			anInt942 = Class163.method2127(Class163.GL_ALPHA, 128, 128, aByteArray941);
			anInt926 = MemoryManager.anInt1083;
		}
	}

	private final void method809() {
		if (anInt935 != -1) {
			MemoryManager.method999(anInt935, 0, anInt938);
		}
		aBoolean936 = true;
		anInt935 = -1;
	}

	private final void method810(final int[] is, final int i, int i_161_, int i_162_, int i_163_, final int i_164_, final int i_165_, final int i_166_, final int i_167_, final int i_168_, final int i_169_) {
		final int i_170_ = i_161_;
		for (int i_171_ = -i_166_; i_171_ < 0; i_171_++) {
			final int i_172_ = (i_162_ >> 16) * i_169_;
			for (int i_173_ = -i_165_; i_173_ < 0; i_173_++) {
				if (is[i_163_] == 0) {
					is[i_163_] = (aByteArray941[(i_161_ >> 16) + i_172_] & 0xff) << 24 | i;
				} else {
					is[i_163_] |= ~0xffffff;
				}
				i_163_++;
				i_161_ += i_167_;
			}
			i_162_ += i_168_;
			i_161_ = i_170_;
			i_163_ += i_164_;
		}
	}

	static final void setup(final js5 js5) {
		aClass50_360 = js5;
	}

	Sphere(final int i, final int i_174_, final int i_175_, final int i_176_, final int i_177_, final int i_178_, final int i_179_, final boolean bool) {
		aBoolean936 = true;
		x = i_175_;
		y = i_176_;
		z = i_177_;
		fixedSize = bool;
		mediaId = i_174_;
		glowColor = i_179_;
		size = i_178_;
		type = i;
	}
}
