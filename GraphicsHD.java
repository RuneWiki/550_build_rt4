/* Class67 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.IntBuffer;

import javax.media.opengl.GL;

final class GraphicsHD {
	static int anInt601;
	static int anInt602;
	static HDSprite aClass120_Sub14_Sub19_Sub1_603 = null;
	private static int anInt604;
	static int anInt605;

	static {
		anInt601 = 0;
		anInt602 = 0;
		anInt605 = 0;
		anInt604 = 0;
	}

	static final void method582(final int i, final int i_0_, final int i_1_, final int i_2_, final int i_3_) {
		HDToolkit.method499();
		final float f = i + 0.3F;
		final float f_4_ = i_1_ + 0.3F;
		final float f_5_ = HDToolkit.canvasHeight - (i_0_ + 0.3F);
		final float f_6_ = HDToolkit.canvasHeight - (i_2_ + 0.3F);
		final GL gl = HDToolkit.gl;
		gl.glBegin(2);
		gl.glColor3ub((byte) (i_3_ >> 16), (byte) (i_3_ >> 8), (byte) i_3_);
		gl.glVertex2f(f, f_5_);
		gl.glVertex2f(f_4_, f_6_);
		gl.glEnd();
	}

	static final void method583(final int i, final int i_7_, final int i_8_, final int i_9_, final int i_10_, final int i_11_) {
		HDToolkit.method499();
		final float f = i + 0.3F;
		final float f_12_ = f + (i_8_ - 1);
		final float f_13_ = HDToolkit.canvasHeight - (i_7_ + 0.3F);
		final float f_14_ = f_13_ - (i_9_ - 1);
		final GL gl = HDToolkit.gl;
		gl.glBegin(2);
		gl.glColor4ub((byte) (i_10_ >> 16), (byte) (i_10_ >> 8), (byte) i_10_, i_11_ > 255 ? (byte) -1 : (byte) i_11_);
		gl.glVertex2f(f, f_13_);
		gl.glVertex2f(f, f_14_);
		gl.glVertex2f(f_12_, f_14_);
		gl.glVertex2f(f_12_, f_13_);
		gl.glEnd();
	}

	static final void method584(final int i, final int i_15_, final int i_16_, final int i_17_, final int i_18_) {
		HDToolkit.method499();
		final float f = i + 0.3F;
		final float f_19_ = f + i_16_;
		final float f_20_ = HDToolkit.canvasHeight - (i_15_ + 0.3F);
		final GL gl = HDToolkit.gl;
		gl.glBegin(1);
		gl.glColor4ub((byte) (i_17_ >> 16), (byte) (i_17_ >> 8), (byte) i_17_, i_18_ > 255 ? (byte) -1 : (byte) i_18_);
		gl.glVertex2f(f, f_20_);
		gl.glVertex2f(f_19_, f_20_);
		gl.glEnd();
	}

	static final void method585(final int[] is) {
		is[0] = anInt602;
		is[1] = anInt605;
		is[2] = anInt604;
		is[3] = anInt601;
	}

	static final void method586(final int i, final int i_21_, final int i_22_, final int i_23_, final int i_24_, final int i_25_) {
		final GL gl = HDToolkit.gl;
		gl.glLineWidth(i_25_);
		method582(i, i_21_, i_22_, i_23_, i_24_);
		gl.glLineWidth(1.0F);
	}

	static final void method587(final int i, final int i_26_, final int i_27_, final int i_28_) {
		HDToolkit.method499();
		final float f = i + 0.3F;
		final float f_29_ = HDToolkit.canvasHeight - (i_26_ + 0.3F);
		final float f_30_ = f_29_ - i_27_;
		final GL gl = HDToolkit.gl;
		gl.glBegin(1);
		gl.glColor3ub((byte) (i_28_ >> 16), (byte) (i_28_ >> 8), (byte) i_28_);
		gl.glVertex2f(f, f_29_);
		gl.glVertex2f(f, f_30_);
		gl.glEnd();
	}

	static final void method588(final int i, final int i_31_, final int i_32_, final int i_33_, final int i_34_, final int i_35_, final HDSprite class120_sub14_sub19_sub1) {
		if (anInt601 - anInt605 != class120_sub14_sub19_sub1.height) {
			throw new IllegalStateException();
		}
		HDToolkit.method499();
		HDToolkit.method514(class120_sub14_sub19_sub1.anInt3942);
		HDToolkit.method511(1);
		HDToolkit.method521(0);
		final float f = i + 0.3F;
		final float f_36_ = i_32_ + 0.3F;
		final float f_37_ = HDToolkit.canvasHeight - (i_31_ + 0.3F);
		final float f_38_ = HDToolkit.canvasHeight - (i_33_ + 0.3F);
		final GL gl = HDToolkit.gl;
		gl.glTexEnvi(8960, 34176, 34168);
		gl.glBegin(2);
		gl.glColor4ub((byte) (i_34_ >> 16), (byte) (i_34_ >> 8), (byte) i_34_, i_35_ > 255 ? (byte) -1 : (byte) i_35_);
		gl.glTexCoord2f((f - anInt602) / class120_sub14_sub19_sub1.anInt3945, (HDToolkit.canvasHeight - f_37_ - anInt605) / class120_sub14_sub19_sub1.anInt3948);
		gl.glVertex2f(f, f_37_);
		gl.glTexCoord2f((f_36_ - anInt602) / class120_sub14_sub19_sub1.anInt3945, (HDToolkit.canvasHeight - f_38_ - anInt605) / class120_sub14_sub19_sub1.anInt3948);
		gl.glVertex2f(f_36_, f_38_);
		gl.glEnd();
		gl.glTexEnvi(8960, 34176, 5890);
	}

	static final void drawRect(final int i, final int i_39_, final int i_40_, final int i_41_, final int i_42_) {
		HDToolkit.method499();
		final float f = i + 0.3F;
		final float f_43_ = f + (i_40_ - 1);
		final float f_44_ = HDToolkit.canvasHeight - (i_39_ + 0.3F);
		final float f_45_ = f_44_ - (i_41_ - 1);
		final GL gl = HDToolkit.gl;
		gl.glBegin(2);
		gl.glColor3ub((byte) (i_42_ >> 16), (byte) (i_42_ >> 8), (byte) i_42_);
		gl.glVertex2f(f, f_44_);
		gl.glVertex2f(f, f_45_);
		gl.glVertex2f(f_43_, f_45_);
		gl.glVertex2f(f_43_, f_44_);
		gl.glEnd();
	}

	static final void method590(final int i, final int i_46_, final int i_47_, final int i_48_, final int i_49_, final int i_50_) {
		HDToolkit.method499();
		final float f = i;
		final float f_51_ = f + i_47_;
		final float f_52_ = HDToolkit.canvasHeight - i_46_;
		final float f_53_ = f_52_ - i_48_;
		final GL gl = HDToolkit.gl;
		gl.glBegin(6);
		gl.glColor4ub((byte) (i_49_ >> 16), (byte) (i_49_ >> 8), (byte) i_49_, i_50_ > 255 ? (byte) -1 : (byte) i_50_);
		gl.glVertex2f(f, f_52_);
		gl.glVertex2f(f, f_53_);
		gl.glVertex2f(f_51_, f_53_);
		gl.glVertex2f(f_51_, f_52_);
		gl.glEnd();
	}

	static final void method591(final int i, final int i_54_, final int i_55_, final int i_56_) {
		if (anInt602 < i) {
			anInt602 = i;
		}
		if (anInt605 < i_54_) {
			anInt605 = i_54_;
		}
		if (anInt604 > i_55_) {
			anInt604 = i_55_;
		}
		if (anInt601 > i_56_) {
			anInt601 = i_56_;
		}
		final GL gl = HDToolkit.gl;
		gl.glEnable(3089);
		if (anInt602 > anInt604 || anInt605 > anInt601) {
			gl.glScissor(0, 0, 0, 0);
		} else {
			gl.glScissor(HDToolkit.anInt543 + anInt602, HDToolkit.anInt516 + HDToolkit.canvasHeight - anInt601, anInt604 - anInt602, anInt601 - anInt605);
		}
		method601();
	}

	static final void method592(int i, int i_57_, int i_58_, int i_59_) {
		if (i < 0) {
			i = 0;
		}
		if (i_57_ < 0) {
			i_57_ = 0;
		}
		if (i_58_ > HDToolkit.canvasWidth) {
			i_58_ = HDToolkit.canvasWidth;
		}
		if (i_59_ > HDToolkit.canvasHeight) {
			i_59_ = HDToolkit.canvasHeight;
		}
		anInt602 = i;
		anInt605 = i_57_;
		anInt604 = i_58_;
		anInt601 = i_59_;
		final GL gl = HDToolkit.gl;
		gl.glEnable(3089);
		if (anInt602 > anInt604 || anInt605 > anInt601) {
			gl.glScissor(0, 0, 0, 0);
		} else {
			gl.glScissor(HDToolkit.anInt543 + anInt602, HDToolkit.anInt516 + HDToolkit.canvasHeight - anInt601, anInt604 - anInt602, anInt601 - anInt605);
		}
		method601();
	}

	public static void method593() {
		aClass120_Sub14_Sub19_Sub1_603 = null;
	}

	static final void method594(final int[] is) {
		method592(is[0], is[1], is[2], is[3]);
	}

	static final void method595(final HDSprite class120_sub14_sub19_sub1) {
		if (class120_sub14_sub19_sub1.height != anInt601 - anInt605) {
			throw new IllegalArgumentException();
		}
		aClass120_Sub14_Sub19_Sub1_603 = class120_sub14_sub19_sub1;
	}

	static final void method596(final int[] is, final int i, final int i_60_, final int i_61_, final int i_62_) {
		HDToolkit.method499();
		final GL gl = HDToolkit.gl;
		gl.glRasterPos2i(i, HDToolkit.canvasHeight - i_60_ - i_62_);
		gl.glDisable(3042);
		gl.glDisable(3008);
		gl.glDrawPixels(i_61_, i_62_, 32993, HDToolkit.isBigEndian ? 33639 : 5121, IntBuffer.wrap(is));
		gl.glEnable(3008);
		gl.glEnable(3042);
	}

	static final void method597() {
		anInt602 = 0;
		anInt605 = 0;
		anInt604 = HDToolkit.canvasWidth;
		anInt601 = HDToolkit.canvasHeight;
		final GL gl = HDToolkit.gl;
		gl.glDisable(3089);
		method601();
	}

	static final void method598(final int i, final int i_63_, final int i_64_, final int i_65_) {
		HDToolkit.method499();
		final float f = i + 0.3F;
		final float f_66_ = f + i_64_;
		final float f_67_ = HDToolkit.canvasHeight - (i_63_ + 0.3F);
		final GL gl = HDToolkit.gl;
		gl.glBegin(1);
		gl.glColor3ub((byte) (i_65_ >> 16), (byte) (i_65_ >> 8), (byte) i_65_);
		gl.glVertex2f(f, f_67_);
		gl.glVertex2f(f_66_, f_67_);
		gl.glEnd();
	}

	static final void method599() {
		HDToolkit.gl.glClear(16640);
	}

	static final void fillRect(final int i, final int i_68_, final int i_69_, final int i_70_, final int i_71_) {
		HDToolkit.method499();
		final float f = i;
		final float f_72_ = f + i_69_;
		final float f_73_ = HDToolkit.canvasHeight - i_68_;
		final float f_74_ = f_73_ - i_70_;
		final GL gl = HDToolkit.gl;
		gl.glBegin(6);
		gl.glColor3ub((byte) (i_71_ >> 16), (byte) (i_71_ >> 8), (byte) i_71_);
		gl.glVertex2f(f, f_73_);
		gl.glVertex2f(f, f_74_);
		gl.glVertex2f(f_72_, f_74_);
		gl.glVertex2f(f_72_, f_73_);
		gl.glEnd();
	}

	static final void method601() {
		aClass120_Sub14_Sub19_Sub1_603 = null;
	}
}
