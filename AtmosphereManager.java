/* Class117 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import javax.media.opengl.GL;

final class AtmosphereManager {
	private static float light1Diffuse;
	private static int screenColorRgb;
	private static int fogOffset = -1;
	static int lightingZ;
	static float[] fogColor;
	private static float light0Diffuse;
	static int defaultScreenColorRgb;
	static float[] light0Position;
	static int defaulFogColorRgb;
	private static float[] light1Position;
	static int lightingX;
	private static float lightModelAmbient;
	private static int fogColorRGB;

	static {
		light1Diffuse = -1.0F;
		light0Diffuse = -1.0F;
		defaultScreenColorRgb = 16777215;
		light0Position = new float[4];
		defaulFogColorRgb = 13156520;
		fogColor = new float[4];
		fogColorRGB = -1;
		light1Position = new float[4];
		screenColorRgb = -1;
	}

	static final void setFogColor(float[] params) {
		if (params == null) {
			params = fogColor;
		}
		final GL gl = HDToolkit.gl;
		gl.glFogfv(2918, params, 0);//FOG_COLOR
	}

	static final float getLightingModelAmbient() {
		return lightModelAmbient;
	}

	private static final void initDefaults() {
		setLightingParams(defaultScreenColorRgb, 1.1523438F, 0.69921875F, 1.2F);
		setLightingPosition(-50.0F, -60.0F, -50.0F);
		setFogValues(defaulFogColorRgb, 0, false);
	}

	static final void setLightingPosition(final float x, final float y, final float z) {
		if (light0Position[0] != x || light0Position[1] != y || light0Position[2] != z) {
			light0Position[0] = x;
			light0Position[1] = y;
			light0Position[2] = z;
			light1Position[0] = -x;
			light1Position[1] = -y;
			light1Position[2] = -z;
			lightingX = (int) (x * 256.0F / y);
			lightingZ = (int) (z * 256.0F / y);
		}
	}

	static final float getLight0Diffuse() {
		return light0Diffuse;
	}

	static final void applyLightingPosition() {
		final GL gl = HDToolkit.gl;
		gl.glLightfv(16384, 4611, light0Position, 0);//LIGHT0, POSITION
		gl.glLightfv(16385, 4611, light1Position, 0);//LIGHT1, POSITION
	}

	static final int getScreenColorRgb() {
		return screenColorRgb;
	}

	static final void method1018() {
		final GL gl = HDToolkit.gl;
		gl.glColorMaterial(1028, 5634);//FRONT, AMBIENT_AND_DIFFUSE
		gl.glEnable(2903);//COLOR_MATERIAL
		final float[] light0Params = { 0.0F, 0.0F, 0.0F, 1.0F };
		gl.glLightfv(16384, 4608, light0Params, 0);//LIGHT0, AMBIENT
		gl.glEnable(16384);//LIGHT0
		final float[] light1Params = { 0.0F, 0.0F, 0.0F, 1.0F };
		gl.glLightfv(16385, 4608, light1Params, 0);//LIGHT1, AMBIENT
		gl.glEnable(16385);//LIGHT1
		screenColorRgb = -1;
		fogColorRGB = -1;
		initDefaults();
	}

	public static void method1019() {
		light0Position = null;
		light1Position = null;
		fogColor = null;
	}

	//More info here. http://nehe.gamedev.net/tutorial/cool_looking_fog/19001/
	static final void setFogValues(int fogCol, int fogOff, boolean force) {
		fogOff = 600;//TODO looks better with this.
		if (force || fogColorRGB != fogCol || fogOffset != fogOff) {
			fogColorRGB = fogCol;
			fogOffset = fogOff;
			final GL gl = HDToolkit.gl;
			byte lowestFogStart = 50;
			//short baseFogStart = 3584; This is unused because it was originally this but to avoid math jagex simplified it.
			fogColor[0] = (fogCol >> 16 & 0xff) / 255.0F;
			fogColor[1] = (fogCol >> 8 & 0xff) / 255.0F;
			fogColor[2] = (fogCol & 0xff) / 255.0F;
			//2917 FOG_MODE
			//9729 LINEAR
			gl.glFogi(2917, 9729);
			//FOG_DENSITY
			gl.glFogf(2914, 0.95F);
			//3156 = FOG_HINT
			//4353 = FASTEST, 4354 = NICEST, 4352 = DONT_CARE
			gl.glHint(3156, 4353);
			int fogStart = 3072 - fogOff;//baseFogStart - 512 - fogOff
			if (fogStart < lowestFogStart) {
				fogStart = lowestFogStart;
			}
			//FOG_START
			gl.glFogf(2915, fogStart);
			//FOG_END
			gl.glFogf(2916, 3328.0F);//baseFogStart - 256
			//FOG_COLOR
			gl.glFogfv(2918, fogColor, 0);
		}
	}

	static final void setLightingParams(int screenColor, float ambientMod, float l0Diffuse, float l1Diffuse) {
		if (screenColorRgb != screenColor || lightModelAmbient != ambientMod || light0Diffuse != l0Diffuse || light1Diffuse != l1Diffuse) {
			screenColorRgb = screenColor;
			lightModelAmbient = ambientMod;
			light0Diffuse = l0Diffuse;
			light1Diffuse = l1Diffuse;
			final GL gl = HDToolkit.gl;
			final float red = (screenColor >> 16 & 0xff) / 255.0F;
			final float green = (screenColor >> 8 & 0xff) / 255.0F;
			final float blue = (screenColor & 0xff) / 255.0F;
			final float[] lightModelAmbientParams = { ambientMod * red, ambientMod * green, ambientMod * blue, 1.0F };
			gl.glLightModelfv(2899, lightModelAmbientParams, 0);//LIGHT_MODEL_AMBIENT
			final float[] light0Params = { l0Diffuse * red, l0Diffuse * green, l0Diffuse * blue, 1.0F };
			gl.glLightfv(16384, 4609, light0Params, 0);//LIGHT0, DIFFUSE
			final float[] light1Params = { -l1Diffuse * red, -l1Diffuse * green, -l1Diffuse * blue, 1.0F };
			gl.glLightfv(16385, 4609, light1Params, 0);//LIGHT1, DIFFUSE
		}
	}
}
