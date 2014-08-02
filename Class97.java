/* Class97 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;

import javax.media.opengl.GL;

final class Class97 {
	private LDSprite aClass120_Sub14_Sub19_Sub2_920;
	private static ByteBuffer aByteBuffer921;
	private final int anInt922;
	private static int[] anIntArray923 = new int[4];
	private int anInt924;
	private int anInt925;
	private static int anInt926 = -1;
	private static ByteBuffer aByteBuffer927;
	private final int anInt928;
	private final int anInt929;
	int anInt930;
	private int anInt931;
	private final int anInt932;
	private final int anInt933;
	private static Class180_Sub2 aClass180_Sub2_934;
	private int anInt935 = -1;
	private boolean aBoolean936;
	private int anInt937;
	private int anInt938 = -1;
	private final int anInt939;
	private final boolean aBoolean940;
	private static byte[] aByteArray941;
	private static int anInt942 = -1;
	private final int anInt943;

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

	private final void method792(final Class97 class97_16_) {
		method800();
		method808();
		final GL gl = HDToolkit.gl;
		GraphicsHD.method585(anIntArray923);
		GraphicsHD.method597();
		gl.glClearColor(((anInt929 & 0xff0000) >> 16) / 255.0F, ((anInt929 & 0xff00) >> 8) / 255.0F, (anInt929 & 0xff) / 255.0F, 0.0F);
		gl.glClear(16640);
		int i = 0;
		int i_17_ = 0;
		int i_18_ = 256;
		if (class97_16_ != null) {
			if (class97_16_.aBoolean940) {
				i = -class97_16_.anInt933;
				i_17_ = -class97_16_.anInt939;
				i_18_ = -class97_16_.anInt932;
			} else {
				i = anInt933 - class97_16_.anInt933;
				i_17_ = anInt939 - class97_16_.anInt939;
				i_18_ = anInt932 - class97_16_.anInt932;
			}
		}
		Class12.method137(-1.0F, 1.0F, -1.0F, 1.0F, anInt931, anInt931);
		if (anInt937 != 0) {
			final int i_19_ = Rasterizer.sineTable[anInt937];
			final int i_20_ = Rasterizer.cosineTable[anInt937];
			final int i_21_ = i_17_ * i_20_ - i_18_ * i_19_ + 32767 >> 16;
			i_18_ = i_17_ * i_19_ + i_18_ * i_20_ + 32767 >> 16;
			i_17_ = i_21_;
		}
		if (anInt924 != 0) {
			final int i_22_ = anInt924 - 1024 & 0x7ff;
			final int i_23_ = Rasterizer.sineTable[i_22_];
			final int i_24_ = Rasterizer.cosineTable[i_22_];
			final int i_25_ = i_18_ * i_23_ + i * i_24_ + 32767 >> 16;
			i_18_ = i_18_ * i_24_ - i * i_23_ + 32767 >> 16;
			i = i_25_;
		}
		AtmosphereManager.method1014(-i, -i_17_, i_18_);
		AtmosphereManager.method1021(16777215, 0.5F, 0.5F, 1.0F);
		AtmosphereManager.method1016();
		if (anInt929 != 0) {
			gl.glScalef(0.8125F, 0.8125F, 1.0F);
		}
		Rasterizer.anInterface5_973.method28((byte) -115, anInt931, anInt928);
		HDToolkit.method524(true);
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
		HDToolkit.method524(false);
		if (anInt929 != 0) {
			Class120_Sub14_Sub13.method1532(0, 0);
			HDToolkit.method511(1);
			HDToolkit.method521(0);
			HDToolkit.method514(anInt942);
			gl.glColorMask(true, true, true, false);
			gl.glTexEnvi(8960, 34176, 34168);
			gl.glTexEnvi(8960, 34200, 771);
			gl.glBegin(7);
			gl.glColor4ub((byte) (anInt929 >> 16), (byte) (anInt929 >> 8), (byte) anInt929, (byte) 127);
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
			gl.glColor4ub((byte) (anInt929 >> 16), (byte) (anInt929 >> 8), (byte) anInt929, (byte) -1);
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
		HDToolkit.method514(anInt935);
		gl.glCopyTexImage2D(3553, 0, 6408, 0, 0, anInt931, anInt931, 0);
		GraphicsHD.method594(anIntArray923);
	}

	private final boolean method793(final Class97 class97_26_) {
		final Class180_Sub2 class180_sub2 = Class180_Sub2.method2291(Class41.aClass50_360, anInt928, 0);
		if (class180_sub2 == null) {
			return false;
		}
		final GL gl = HDToolkit.gl;
		GraphicsHD.method585(anIntArray923);
		GraphicsHD.method597();
		gl.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
		gl.glClear(16640);
		int i = 0;
		int i_27_ = 0;
		int i_28_ = 256;
		if (class97_26_ != null) {
			if (class97_26_.aBoolean940) {
				i = -class97_26_.anInt933;
				i_27_ = -class97_26_.anInt939;
				i_28_ = -class97_26_.anInt932;
			} else {
				i = anInt933 - class97_26_.anInt933;
				i_27_ = anInt939 - class97_26_.anInt939;
				i_28_ = anInt932 - class97_26_.anInt932;
			}
		}
		class180_sub2.method2287();
		final AbstractModel class180_sub7 = class180_sub2.method2300(64, 768, -i, -i_27_, -i_28_);
		final int i_29_ = (class180_sub7.method2383() - class180_sub7.method2374()) / 2;
		final int i_30_ = (class180_sub7.getMaxZ() - class180_sub7.getMaxY()) / 2;
		final int i_31_ = i_29_ > i_30_ ? i_29_ : i_30_;
		Class12.method136(-i_31_, i_31_, -i_31_, i_31_, 2048.0F, -2048.0F, anInt931, anInt931);
		if (anInt937 != 0) {
			final int i_32_ = Rasterizer.sineTable[anInt937];
			final int i_33_ = Rasterizer.cosineTable[anInt937];
			final int i_34_ = i_27_ * i_33_ - i_28_ * i_32_ + 32767 >> 16;
			i_28_ = i_27_ * i_32_ + i_28_ * i_33_ + 32767 >> 16;
			i_27_ = i_34_;
		}
		if (anInt924 != 0) {
			final int i_35_ = anInt924 - 1024 & 0x7ff;
			final int i_36_ = Rasterizer.sineTable[i_35_];
			final int i_37_ = Rasterizer.cosineTable[i_35_];
			final int i_38_ = i_28_ * i_36_ + i * i_37_ + 32767 >> 16;
			i_28_ = i_28_ * i_37_ - i * i_36_ + 32767 >> 16;
			i = i_38_;
		}
		AtmosphereManager.method1014(-i, i_27_, -i_28_);
		AtmosphereManager.method1021(16777215, 0.5F, 0.5F, 0.5F);
		AtmosphereManager.method1016();
		HDToolkit.method505();
		HDToolkit.method502(true);
		HDToolkit.method524(true);
		class180_sub7.method2367(0, 0, 0, 0, -i_29_ - class180_sub7.method2374(), -i_30_ - class180_sub7.getMaxY(), 0, -1L);
		HDToolkit.method524(false);
		HDToolkit.method502(false);
		HDToolkit.method503();
		Class12.method133();
		HDToolkit.method514(anInt935);
		gl.glCopyTexImage2D(3553, 0, 6408, 0, 0, anInt931, anInt931, 0);
		GraphicsHD.method594(anIntArray923);
		return true;
	}

	private final void method794() {
		int i = anInt931;
		int i_39_ = anInt931;
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
		method810(GraphicsLD.pixels, anInt929, i_42_, i_43_, i_44_, i_45_, i, i_39_, i_40_, i_41_, 128);
	}

	final void method795(final int i, final int i_49_, final int i_50_, final int i_51_, final int i_52_, final int i_53_) {
		int i_54_ = anInt937 - i_52_ & 0x7ff;
		int i_55_ = anInt924 - i_53_ & 0x7ff;
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
			if (anInt943 == 0) {
				Rasterizer.anInterface5_973.method28((byte) -108, anInt931, anInt928);
			} else if (anInt935 != -1) {
				HDToolkit.method514(anInt935);
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

	final void method796(final Class97 class97_60_) {
		if (anInt943 != 0) {
			final boolean bool = anInt935 == -1 || anInt938 != Class113.anInt1083;
			if (aBoolean936 || bool) {
				if (bool) {
					anInt938 = Class113.anInt1083;
					anInt935 = Class163.method2125(Class163.anInt1570, anInt931, anInt931);
				} else {
					HDToolkit.method514(anInt935);
					Class163.method2124(Class163.anInt1570, anInt931, anInt931);
				}
				if (anInt943 == 1) {
					method792(class97_60_);
					aBoolean936 = false;
				} else if (anInt943 == 2) {
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

	final boolean method797(final int i, final int i_61_, final int i_62_, final int i_63_) {
		int i_64_;
		int i_65_;
		int i_66_;
		if (!aBoolean940) {
			i_64_ = anInt933 - i;
			i_65_ = anInt939 - i_61_;
			i_66_ = anInt932 - i_62_;
			this.anInt930 = (int) Math.sqrt(i_64_ * i_64_ + i_65_ * i_65_ + i_66_ * i_66_);
			if (this.anInt930 == 0) {
				this.anInt930 = 1;
			}
			i_64_ = (i_64_ << 8) / this.anInt930;
			i_65_ = (i_65_ << 8) / this.anInt930;
			i_66_ = (i_66_ << 8) / this.anInt930;
		} else {
			this.anInt930 = 1073741823;
			i_64_ = anInt933;
			i_65_ = anInt939;
			i_66_ = anInt932;
		}
		final int i_67_ = (int) (Math.sqrt(i_64_ * i_64_ + i_65_ * i_65_ + i_66_ * i_66_) * 256.0);
		if (i_67_ > 128) {
			i_64_ = (i_64_ << 16) / i_67_;
			i_65_ = (i_65_ << 16) / i_67_;
			i_66_ = (i_66_ << 16) / i_67_;
			anInt925 = anInt922 * i_63_ / (aBoolean940 ? 1024 : this.anInt930);
		} else {
			anInt925 = 0;
		}
		if (anInt925 < 8) {
			method809();
			aClass120_Sub14_Sub19_Sub2_920 = null;
			return false;
		}
		int i_68_ = Deque.method888(anInt925, (byte) 115);
		if (i_68_ > 512) {
			i_68_ = 512;
		}
		if (i_68_ != anInt931) {
			anInt931 = i_68_;
		}
		anInt937 = (int) (Math.asin(i_65_ / 256.0F) * 325.9493103027344) & 0x7ff;
		anInt924 = (int) (Math.atan2(i_64_, -i_66_) * 325.9493103027344) & 0x7ff;
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
			final Class180_Sub2 class180_sub2 = aClass180_Sub2_934 = new Class180_Sub2(260, 480, 0);
			final int[] is = class180_sub2.xVertices;
			final int[] is_77_ = class180_sub2.yVertices;
			final int[] is_78_ = class180_sub2.zVertices;
			final int[] is_79_ = class180_sub2.trianglesA;
			final int[] is_80_ = class180_sub2.trianglesB;
			final int[] is_81_ = class180_sub2.trianglesC;
			class180_sub2.anInt2896 = 2;
			is[0] = 0;
			is_77_[0] = 128;
			is_78_[0] = 0;
			is[1] = 0;
			is_77_[1] = -128;
			is_78_[1] = 0;
			for (int i = 0; i <= 16; i++) {
				final int i_82_ = i * 1024 / 16;
				final int i_83_ = Rasterizer.sineTable[i_82_] >> 1;
				final int i_84_ = Rasterizer.cosineTable[i_82_] >> 1;
				for (int i_85_ = 1; i_85_ < 16; i_85_++) {
					final int i_86_ = i_85_ * 1024 / 16;
					final int i_87_ = Rasterizer.cosineTable[i_86_] >> 9;
					final int i_88_ = (Rasterizer.sineTable[i_86_] >> 1) * i_83_ >> 23;
					final int i_89_ = (Rasterizer.sineTable[i_86_] >> 1) * i_84_ >> 23;
					is[class180_sub2.anInt2896] = i_89_;
					is_77_[class180_sub2.anInt2896] = i_87_;
					is_78_[class180_sub2.anInt2896] = -i_88_;
					class180_sub2.anInt2896++;
				}
				if (i > 0) {
					int i_90_ = i * 15 + 2;
					int i_91_ = i_90_ - 15;
					is_79_[class180_sub2.anInt2856] = 0;
					is_80_[class180_sub2.anInt2856] = i_91_;
					is_81_[class180_sub2.anInt2856] = i_90_;
					class180_sub2.anInt2856++;
					for (int i_92_ = 1; i_92_ < 15; i_92_++) {
						final int i_93_ = i_91_ + 1;
						final int i_94_ = i_90_ + 1;
						is_79_[class180_sub2.anInt2856] = i_91_;
						is_80_[class180_sub2.anInt2856] = i_93_;
						is_81_[class180_sub2.anInt2856] = i_90_;
						class180_sub2.anInt2856++;
						is_79_[class180_sub2.anInt2856] = i_93_;
						is_80_[class180_sub2.anInt2856] = i_94_;
						is_81_[class180_sub2.anInt2856] = i_90_;
						class180_sub2.anInt2856++;
						i_91_ = i_93_;
						i_90_ = i_94_;
					}
					is_79_[class180_sub2.anInt2856] = i_90_;
					is_80_[class180_sub2.anInt2856] = i_91_;
					is_81_[class180_sub2.anInt2856] = 1;
					class180_sub2.anInt2856++;
				}
			}
			class180_sub2.anInt2886 = class180_sub2.anInt2896;
			class180_sub2.aByteArray2876 = null;
			class180_sub2.aShortArray2850 = null;
			class180_sub2.anIntArray2872 = null;
			class180_sub2.vertexVSkins = null;
			class180_sub2.aByteArray2879 = null;
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
				final float f_98_ = Rasterizer.sineTable[i_97_] / 65535.0F;
				final float f_99_ = Rasterizer.cosineTable[i_97_] / 65535.0F;
				for (int i_100_ = 1; i_100_ < 16; i_100_++) {
					final int i_101_ = i_100_ * 1024 / 16;
					final float f_102_ = Rasterizer.cosineTable[i_101_] / 65535.0F;
					final float f_103_ = Rasterizer.sineTable[i_101_] * f_98_ / 65535.0F;
					final float f_104_ = Rasterizer.sineTable[i_101_] * f_99_ / 65535.0F;
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

	private final boolean method801(final Class97 class97_109_) {
		if (aClass120_Sub14_Sub19_Sub2_920 == null) {
			if (anInt943 == 0) {
				aClass120_Sub14_Sub19_Sub2_920 = Rasterizer.anInterface5_973.method26(true, Rasterizer.aFloat968, false, anInt931, anInt928);
			} else if (anInt943 == 2) {
				method807(class97_109_);
			} else if (anInt943 == 1) {
				method803(class97_109_);
			}
		}
		if (aClass120_Sub14_Sub19_Sub2_920 != null) {
			return true;
		}
		return false;
	}

	final void method802(final int i, final int i_110_, final int i_111_, final int i_112_, final int i_113_, final int i_114_, final Class97 class97_115_) {
		int i_116_ = anInt937 - i_113_ & 0x7ff;
		int i_117_ = anInt924 - i_114_ & 0x7ff;
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

	private final void method803(final Class97 class97_120_) {
		method799();
		method798();
		aClass120_Sub14_Sub19_Sub2_920 = new LDTransparentSprite(anInt931, anInt931);
		GraphicsLD.method2169(anIntArray923);
		aClass120_Sub14_Sub19_Sub2_920.method1617();
		Rasterizer.calculateByBounds();
		GraphicsLD.fillRect(0, 0, anInt931, anInt931, 0);
		int i = 0;
		int i_121_ = 0;
		int i_122_ = 256;
		if (class97_120_ != null) {
			if (class97_120_.aBoolean940) {
				i = -class97_120_.anInt933;
				i_121_ = -class97_120_.anInt939;
				i_122_ = -class97_120_.anInt932;
			} else {
				i = anInt933 - class97_120_.anInt933;
				i_121_ = anInt939 - class97_120_.anInt939;
				i_122_ = anInt932 - class97_120_.anInt932;
			}
		}
		if (anInt937 != 0) {
			final int i_123_ = Rasterizer.sineTable[anInt937];
			final int i_124_ = Rasterizer.cosineTable[anInt937];
			final int i_125_ = i_121_ * i_124_ - i_122_ * i_123_ + 32767 >> 16;
			i_122_ = i_121_ * i_123_ + i_122_ * i_124_ + 32767 >> 16;
			i_121_ = i_125_;
		}
		if (anInt924 != 0) {
			final int i_126_ = anInt924 - 1024 & 0x7ff;
			final int i_127_ = Rasterizer.sineTable[i_126_];
			final int i_128_ = Rasterizer.cosineTable[i_126_];
			final int i_129_ = i_122_ * i_127_ + i * i_128_ + 32767 >> 16;
			i_122_ = i_122_ * i_128_ - i * i_127_ + 32767 >> 16;
			i = i_129_;
		}
		ArrayUtils.fillArray(aClass180_Sub2_934.triangleColors, 0, aClass180_Sub2_934.anInt2856, (short) Rasterizer.anInterface5_973.method20(anInt928, 65535));
		final LDModel class180_sub7_sub1 = aClass180_Sub2_934.method2298(64, 512, -i, -i_121_, -i_122_);
		final int i_130_ = class180_sub7_sub1.method2383() - class180_sub7_sub1.method2374();
		final int i_131_ = class180_sub7_sub1.getMaxZ() - class180_sub7_sub1.getMaxY();
		if (i_130_ > i_131_) {
			final int i_132_ = anInt929 != 0 ? (i_130_ * 16 << 9) / (anInt931 * 13) : (i_130_ << 9) / anInt931;
			class180_sub7_sub1.method2400(0, 0, 0, 0, 0, 0, 0, i_132_);
		} else {
			final int i_133_ = anInt929 != 0 ? (i_131_ * 16 << 9) / (anInt931 * 13) : (i_131_ << 9) / anInt931;
			class180_sub7_sub1.method2400(0, 0, 0, 0, 0, 0, 0, i_133_);
		}
		if (anInt929 != 0) {
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
		GraphicsLD.method2172(anIntArray923);
		Rasterizer.calculateByBounds();
	}

	private final void method804() {
		final int i = 3 * anInt931 / 32;
		final int i_135_ = i;
		int i_136_ = 13 * anInt931 / 16;
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
		method791(GraphicsLD.pixels, 0, anInt929, i_142_, i_143_, i_140_, i_141_, i_136_, i_137_, i_138_, i_139_, 128);
	}

	public static void method805() {
		aByteBuffer921 = null;
		aByteBuffer927 = null;
		aClass180_Sub2_934 = null;
		aByteArray941 = null;
		anIntArray923 = null;
	}

	static final void method806() {
		if (anInt942 != -1) {
			Class113.method999(anInt942, 0, anInt926);
		}
		anInt942 = -1;
		anInt926 = -1;
		aByteBuffer921 = null;
		aByteBuffer927 = null;
		aClass180_Sub2_934 = null;
		aByteArray941 = null;
	}

	private final void method807(final Class97 class97_147_) {
		final Class180_Sub2 class180_sub2 = Class180_Sub2.method2291(Class41.aClass50_360, anInt928, 0);
		if (class180_sub2 != null) {
			aClass120_Sub14_Sub19_Sub2_920 = new LDSprite(anInt931, anInt931);
			GraphicsLD.method2169(anIntArray923);
			aClass120_Sub14_Sub19_Sub2_920.method1617();
			Rasterizer.calculateByBounds();
			GraphicsLD.fillRect(0, 0, anInt931, anInt931, 0);
			int i = 0;
			int i_148_ = 0;
			int i_149_ = 256;
			if (class97_147_ != null) {
				if (class97_147_.aBoolean940) {
					i = -class97_147_.anInt933;
					i_148_ = -class97_147_.anInt939;
					i_149_ = -class97_147_.anInt932;
				} else {
					i = anInt933 - class97_147_.anInt933;
					i_148_ = anInt939 - class97_147_.anInt939;
					i_149_ = anInt932 - class97_147_.anInt932;
				}
			}
			if (anInt937 != 0) {
				final int i_150_ = Rasterizer.sineTable[anInt937];
				final int i_151_ = Rasterizer.cosineTable[anInt937];
				final int i_152_ = i_148_ * i_151_ - i_149_ * i_150_ + 32767 >> 16;
				i_149_ = i_148_ * i_150_ + i_149_ * i_151_ + 32767 >> 16;
				i_148_ = i_152_;
			}
			if (anInt924 != 0) {
				final int i_153_ = anInt924 - 1024 & 0x7ff;
				final int i_154_ = Rasterizer.sineTable[i_153_];
				final int i_155_ = Rasterizer.cosineTable[i_153_];
				final int i_156_ = i_149_ * i_154_ + i * i_155_ + 32767 >> 16;
				i_149_ = i_149_ * i_155_ - i * i_154_ + 32767 >> 16;
				i = i_156_;
			}
			final LDModel class180_sub7_sub1 = class180_sub2.method2298(64, 768, -i, -i_148_, -i_149_);
			final int i_157_ = class180_sub7_sub1.method2383() - class180_sub7_sub1.method2374();
			final int i_158_ = class180_sub7_sub1.getMaxZ() - class180_sub7_sub1.getMaxY();
			final int i_159_ = class180_sub7_sub1.method2374() + i_157_ / 2;
			final int i_160_ = class180_sub7_sub1.getMaxY() + i_158_ / 2;
			if (i_157_ > i_158_) {
				class180_sub7_sub1.method2400(0, 0, 0, 0, -i_159_, -i_160_, 0, (i_157_ << 9) / anInt931);
			} else {
				class180_sub7_sub1.method2400(0, 0, 0, 0, -i_159_, -i_160_, 0, (i_158_ << 9) / anInt931);
			}
			ClanMember.fullscreenGraphics.init2dCanvas();
			GraphicsLD.method2172(anIntArray923);
			Rasterizer.calculateByBounds();
		}
	}

	private static final void method808() {
		method798();
		if (anInt942 == -1 || anInt926 != Class113.anInt1083) {
			anInt942 = Class163.method2127(Class163.anInt1576, 128, 128, aByteArray941);
			anInt926 = Class113.anInt1083;
		}
	}

	private final void method809() {
		if (anInt935 != -1) {
			Class113.method999(anInt935, 0, anInt938);
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

	Class97(final int i, final int i_174_, final int i_175_, final int i_176_, final int i_177_, final int i_178_, final int i_179_, final boolean bool) {
		aBoolean936 = true;
		anInt933 = i_175_;
		anInt939 = i_176_;
		anInt932 = i_177_;
		aBoolean940 = bool;
		anInt928 = i_174_;
		anInt929 = i_179_;
		anInt922 = i_178_;
		anInt943 = i;
	}
}
