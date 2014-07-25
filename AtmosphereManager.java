/* Class117 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import javax.media.opengl.GL;

final class AtmosphereManager {
	private static float aFloat1120;
	private static int anInt1121;
	private static int fogOffset = -1;
	static int anInt1123;
	static float[] fogColor;
	private static float aFloat1125;
	static int defaultScreenColorRgb;
	static float[] aFloatArray1127;
	static int defaulFogColorRgb;
	private static float[] aFloatArray1129;
	static int anInt1130;
	private static float aFloat1131;
	private static int anInt1132;

	static {
		aFloat1120 = -1.0F;
		aFloat1125 = -1.0F;
		defaultScreenColorRgb = 16777215;
		aFloatArray1127 = new float[4];
		defaulFogColorRgb = 13156520;
		fogColor = new float[4];
		anInt1132 = -1;
		aFloatArray1129 = new float[4];
		anInt1121 = -1;
	}

	static final void setFogColor(float[] fs) {
		if (fs == null) {
			fs = fogColor;
		}
		final GL gl = HDToolkit.gl;
		gl.glFogfv(2918, fs, 0);
	}

	static final float method1012() {
		return aFloat1131;
	}

	private static final void method1013() {
		method1021(defaultScreenColorRgb, 1.1523438F, 0.69921875F, 1.2F);
		method1014(-50.0F, -60.0F, -50.0F);
		method1020(defaulFogColorRgb, 0, false);
	}

	static final void method1014(final float f, final float f_0_, final float f_1_) {
		if (aFloatArray1127[0] != f || aFloatArray1127[1] != f_0_ || aFloatArray1127[2] != f_1_) {
			aFloatArray1127[0] = f;
			aFloatArray1127[1] = f_0_;
			aFloatArray1127[2] = f_1_;
			aFloatArray1129[0] = -f;
			aFloatArray1129[1] = -f_0_;
			aFloatArray1129[2] = -f_1_;
			anInt1130 = (int) (f * 256.0F / f_0_);
			anInt1123 = (int) (f_1_ * 256.0F / f_0_);
		}
	}

	static final float method1015() {
		return aFloat1125;
	}

	static final void method1016() {
		final GL gl = HDToolkit.gl;
		gl.glLightfv(16384, 4611, aFloatArray1127, 0);
		gl.glLightfv(16385, 4611, aFloatArray1129, 0);
	}

	static final int method1017() {
		return anInt1121;
	}

	static final void method1018() {
		final GL gl = HDToolkit.gl;
		gl.glColorMaterial(1028, 5634);
		gl.glEnable(2903);
		final float[] fs = { 0.0F, 0.0F, 0.0F, 1.0F };
		gl.glLightfv(16384, 4608, fs, 0);
		gl.glEnable(16384);
		final float[] fs_2_ = { 0.0F, 0.0F, 0.0F, 1.0F };
		gl.glLightfv(16385, 4608, fs_2_, 0);
		gl.glEnable(16385);
		anInt1121 = -1;
		anInt1132 = -1;
		method1013();
	}

	public static void method1019() {
		aFloatArray1127 = null;
		aFloatArray1129 = null;
		fogColor = null;
	}

	static final void method1020(final int fogCol, final int fogOff, final boolean force) {
		if (force || anInt1132 != fogCol || fogOffset != fogOff) {
			anInt1132 = fogCol;
			fogOffset = fogOff;
			final GL gl = HDToolkit.gl;
			fogColor[0] = (fogCol >> 16 & 0xff) / 255.0F;
			fogColor[1] = (fogCol >> 8 & 0xff) / 255.0F;
			fogColor[2] = (fogCol & 0xff) / 255.0F;
			gl.glFogi(2917, 9729);
			gl.glFogf(2914, 0.95F);
			gl.glHint(3156, 4353);
			int i_6_ = 3072 - fogOff;
			if (i_6_ < 50) {
				i_6_ = 50;
			}
			gl.glFogf(2915, i_6_);
			gl.glFogf(2916, 3328.0F);
			gl.glFogfv(2918, fogColor, 0);
		}
	}

	static final void method1021(final int i, final float f, final float f_7_, final float f_8_) {
		if (anInt1121 != i || aFloat1131 != f || aFloat1125 != f_7_ || aFloat1120 != f_8_) {
			anInt1121 = i;
			aFloat1131 = f;
			aFloat1125 = f_7_;
			aFloat1120 = f_8_;
			final GL gl = HDToolkit.gl;
			final float f_9_ = (i >> 16 & 0xff) / 255.0F;
			final float f_10_ = (i >> 8 & 0xff) / 255.0F;
			final float f_11_ = (i & 0xff) / 255.0F;
			final float[] fs = { f * f_9_, f * f_10_, f * f_11_, 1.0F };
			gl.glLightModelfv(2899, fs, 0);
			final float[] fs_12_ = { f_7_ * f_9_, f_7_ * f_10_, f_7_ * f_11_, 1.0F };
			gl.glLightfv(16384, 4609, fs_12_, 0);
			final float[] fs_13_ = { -f_8_ * f_9_, -f_8_ * f_10_, -f_8_ * f_11_, 1.0F };
			gl.glLightfv(16385, 4609, fs_13_, 0);
		}
	}
}
