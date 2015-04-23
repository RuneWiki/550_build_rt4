/* Class41 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import javax.media.opengl.GL;

final class Class41 {
	private int anInt350 = -1;
	private final int anInt351;
	private Class97 aClass97_352;
	private int anInt353;
	private final Class97[] aClass97Array354;
	private final int anInt355;
	private final int anInt356;
	private Class97[] aClass97Array357;
	private int anInt358;
	private final int anInt359;
	static js5 aClass50_360;
	private LDSprite aClass120_Sub14_Sub19_Sub2_361;

	final void method330(final int i, final int i_0_, final int i_1_, final int i_2_, final int i_3_, final int i_4_, int i_5_, final int i_6_) {
		method335(i_3_);
		i_5_ = i_5_ + i & 0x7ff;
		if (anInt356 != -1) {
			if (aClass120_Sub14_Sub19_Sub2_361 == null) {
				aClass120_Sub14_Sub19_Sub2_361 = Rasterizer.anInterface5_973.method26(false, Rasterizer.aFloat968, anInt358, anInt356);
			}
			if (!Rasterizer.anInterface5_973.method17(anInt356)) {
				GraphicsLD.fillRect(i_0_, i_1_, i_2_, i_3_, i_6_);
			}
			if (aClass120_Sub14_Sub19_Sub2_361 != null) {
				int i_7_ = i_4_ * i_3_ / -512;
				int i_8_;
				for (i_8_ = (i_2_ - i_3_) / 2 + i_5_ * i_3_ / 512; i_8_ > i_3_; i_8_ -= i_3_) {
					/* empty */
				}
				for (/**/; i_8_ < 0; i_8_ += i_3_) {
					/* empty */
				}
				for (/**/; i_7_ > i_3_; i_7_ -= i_3_) {
					/* empty */
				}
				for (/**/; i_7_ < 0; i_7_ += i_3_) {
					/* empty */
				}
				for (int i_9_ = i_8_ - i_3_; i_9_ < i_2_; i_9_ += i_3_) {
					for (int i_10_ = i_7_ - i_3_; i_10_ < i_3_; i_10_ += i_3_) {
						aClass120_Sub14_Sub19_Sub2_361.method1588(i_9_ + i_0_, i_10_ + i_1_, i_3_, i_3_);
					}
				}
			}
		} else {
			GraphicsLD.fillRect(i_0_, i_1_, i_2_, i_3_, i_6_);
		}
		for (int i_11_ = anInt353 - 1; i_11_ >= 0; i_11_--) {
			aClass97Array357[i_11_].method802(i_0_, i_1_, i_2_, i_3_, i_4_, i_5_, aClass97_352);
		}
	}

	final void method331(final int i, final int i_12_, final int i_13_, final int i_14_, final int i_15_, final int i_16_, int i_17_, final int i_18_) {
		final GL gl = HDToolkit.gl;
		method335(i_15_);
		i_17_ = i_17_ + i & 0x7ff;
		final int i_19_ = i_12_ + i_14_;
		final int i_20_ = i_13_ + i_15_;
		HDToolkit.toggleFog(false);
		HDToolkit.toggleLighting(false);
		HDToolkit.toggleDepthTest(false);
		HDToolkit.method509();
		HDToolkit.method520(i_12_, i_19_, i_13_, i_20_);
		HDToolkit.disableDepthMask();
		for (int i_21_ = anInt353 - 1; i_21_ >= 0; i_21_--) {
			aClass97Array357[i_21_].method796(aClass97_352);
		}
		if (anInt356 != -1) {
			if (!Rasterizer.anInterface5_973.method17(anInt356)) {
				HDToolkit.method529(i_18_);
			}
			Rasterizer.anInterface5_973.method28(anInt358, anInt356);
			final float f = i_16_ / 512.0F;
			final float f_22_ = i_17_ / -512.0F;
			final float f_23_ = (i_14_ - i_15_) / (2.0F * i_15_);
			gl.glBegin(7);
			gl.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
			gl.glTexCoord2f(-f_23_ + f_22_, f);
			gl.glVertex2i(i_12_, i_13_);
			gl.glTexCoord2f(-f_23_ + f_22_, 1.0F + f);
			gl.glVertex2i(i_12_, i_20_);
			gl.glTexCoord2f(1.0F + f_23_ + f_22_, 1.0F + f);
			gl.glVertex2i(i_19_, i_20_);
			gl.glTexCoord2f(1.0F + f_23_ + f_22_, f);
			gl.glVertex2i(i_19_, i_13_);
			gl.glEnd();
		} else {
			HDToolkit.method529(i_18_);
		}
		for (int i_24_ = anInt353 - 1; i_24_ >= 0; i_24_--) {
			aClass97Array357[i_24_].method795(i_12_, i_13_, i_14_, i_15_, i_16_, i_17_);
		}
		HDToolkit.enableDepthMask();
		HDToolkit.toggleDepthTest(true);
		HDToolkit.toggleLighting(true);
		HDToolkit.toggleFog(true);
	}

	public static void method332() {
		aClass50_360 = null;
	}

	static final void method333() {
		Class97.method806();
	}

	static final void method334(final js5 js5) {
		aClass50_360 = js5;
	}

	Class41(final int i, final Class97[] class97s, final int i_25_, final int i_26_, final int i_27_, final int i_28_) {
		anInt351 = i_26_;
		anInt355 = i_27_;
		anInt359 = i_28_;
		anInt356 = i;
		aClass97Array354 = class97s;
		if (class97s != null) {
			aClass97Array357 = new Class97[class97s.length];
			aClass97_352 = i_25_ >= 0 ? class97s[i_25_] : null;
		} else {
			aClass97Array357 = null;
			aClass97_352 = null;
		}
	}

	private final void method335(final int i) {
		if (anInt350 != i) {
			anInt350 = i;
			int i_29_ = Deque.method888(i);
			if (i_29_ > 512) {
				i_29_ = 512;
			}
			if (i_29_ != anInt358) {
				anInt358 = i_29_;
				aClass120_Sub14_Sub19_Sub2_361 = null;
			}
			if (aClass97Array354 != null) {
				anInt353 = 0;
				final int[] is = new int[aClass97Array354.length];
				Class97[] class97s;
				final int i_30_ = (class97s = aClass97Array354).length;
				for (int i_31_ = 0; i_31_ < i_30_; i_31_++) {
					final Class97 class97 = class97s[i_31_];
					if (class97.method797(anInt351, anInt355, anInt359, anInt350)) {
						is[anInt353] = class97.anInt930;
						aClass97Array357[anInt353++] = class97;
					}
				}
				Class57.sortArray(anInt353 - 1, aClass97Array357, 0, is);
			}
		}
	}
}
