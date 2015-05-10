/* Class58 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.util.Arrays;
import java.util.Locale;

import javax.media.opengl.GL;
import javax.media.opengl.GLCapabilities;
import javax.media.opengl.GLContext;
import javax.media.opengl.GLDrawable;
import javax.media.opengl.GLDrawableFactory;

final class HDToolkit {
	private static int anInt505 = 0;
	private static int anInt506;
	static int anInt507;
	private static boolean depthTestEnabled;
	static GL gl;
	static boolean usingBigEndian;
	private static int anInt511 = -1;
	private static float aFloat512;
	static boolean aBoolean513;
	static boolean aBoolean514;
	private static int maxTextureImageUnits;
	static int viewportOffsetY;
	private static String renderer;
	private static GLDrawable glDrawable;
	private static String vendor;
	static boolean aBoolean520;
	private static int viewportY;
	private static GLContext aGLContext522;
	static boolean aBoolean523;
	static int canvasWidth;
	static boolean aBoolean525;
	static int maxTextureUnits;
	private static int viewportX;
	private static boolean aBoolean528;
	private static boolean lightingEnabled;
	private static float aFloat530;
	static boolean aBoolean531;
	private static float[] matrices;
	private static float aFloat533;
	private static float aFloat534;
	static boolean vertexBufferAsObject;
	static boolean aBoolean536;
	static boolean allows3DTextureMapping;
	static int canvasHeight;
	private static int version;
	static boolean glEnabled;
	static boolean aBoolean541;
	static int loopCycleWrapper;
	static int viewportOffsetX;
	private static boolean aBoolean544;
	static boolean aBoolean545;
	private static int texture2D_ID;
	private static int viewportWidth;
	private static boolean fogEnabled;
	private static float fieldOfView;
	static boolean aBoolean550;
	private static int viewportHeight;
	private static int maxTextureCoords;
	private static int anInt553;

	static {
		depthTestEnabled = true;
		aFloat534 = 0.0F;
		aBoolean536 = true;
		lightingEnabled = true;
		loopCycleWrapper = 0;
		matrices = new float[16];
		texture2D_ID = -1;
		fogEnabled = true;
		anInt506 = -1;
		glEnabled = false;
		aFloat530 = 0.0F;
		aBoolean544 = false;
		fieldOfView = 25F/256;
		aBoolean528 = false;
		anInt553 = 0;
	}

	static final void method496(final int x, final int y, final int width, final int height, final int centerX, final int centerY, final float pitch, final float yaw, int z1, int z2) {
		final int left = (x - centerX << 8) / z1;
		final int right = (x + width - centerX << 8) / z1;
		final int top = (y - centerY << 8) / z2;
		final int bottom = (y + height - centerY << 8) / z2;
		//System.out.println(left+":"+right+":"+top+":"+bottom);
		gl.glMatrixMode(5889);//GL_PROJECTION
		gl.glLoadIdentity();
		loadFrustumMatrix(left * fieldOfView, right * fieldOfView, -bottom * fieldOfView, -top * fieldOfView, 50.0F, 3584.0F);
		setViewport(x, canvasHeight - y - height, width, height);
		gl.glMatrixMode(5888);//GL_MODELVIEW
		gl.glLoadIdentity();
		gl.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);//roll
		if (pitch != 0.0F) {
			gl.glRotatef(pitch, 1.0F, 0.0F, 0.0F);
		}
		if (yaw != 0.0F) {
			gl.glRotatef(yaw, 0.0F, 1.0F, 0.0F);
		}
		aBoolean528 = false;
		IntegerNode.anInt2792 = left;
		Class120_Sub12_Sub16.anInt3253 = right;
		Class190.anInt2100 = top;
		Class120_Sub30_Sub1.anInt3672 = bottom;
	}

	private static final void setViewport(int x, int y, int width, int height) {
		viewportX = x;
		viewportY = y;
		viewportWidth = width;
		viewportHeight = height;
		refreshViewport();
	}

	static final void setViewportOffset(final int x, final int y) {
		viewportOffsetX = x;
		viewportOffsetY = y;
		refreshViewport();
	}

	static final void method499() {
		Class120_Sub14_Sub13.method1532(0, 0);
		setOrthoProjection();
		bindTexture2D(-1);
		toggleLighting(false);
		toggleDepthTest(false);
		toggleFog(false);
		method509();
	}

	private static final void refreshViewport() {
		gl.glViewport(viewportX + viewportOffsetX, viewportY + viewportOffsetY, viewportWidth, viewportHeight);
	}

	static final void setCanvasSize(final int i, final int i_16_) {
		canvasWidth = i;
		canvasHeight = i_16_;
		aBoolean528 = false;
	}

	static final void toggleDepthTest(final boolean value) {
		if (depthTestEnabled != value) {
			if (value) {
				gl.glEnable(2929);
			} else {
				gl.glDisable(2929);
			}
			depthTestEnabled = value;
		}
	}

	static final void disableDepthMask() {
		gl.glDepthMask(false);
	}

	static final void method504() {
		Class120_Sub14_Sub13.method1532(0, 0);
		setOrthoProjection();
		method511(0);
		method521(0);
		toggleLighting(false);
		toggleDepthTest(false);
		toggleFog(false);
		method509();
	}

	static final void enableDepthMask() {
		gl.glDepthMask(true);
	}

	private static final void method506(final boolean bool) {
		if (aBoolean536 != bool) {
			if (bool) {
				gl.glEnableClientState(32885);
			} else {
				gl.glDisableClientState(32885);
			}
			aBoolean536 = bool;
		}
	}

	static final void toggleFog(final boolean value) {
		if (fogEnabled != value) {
			if (value) {
				gl.glEnable(2912);
			} else {
				gl.glDisable(2912);
			}
			fogEnabled = value;
		}
	}

	private static final int method508(final Canvas canvas, final int i, final GLContext glcontext) {
		try {
			if (!canvas.isDisplayable()) {
				return -1;
			}
			final GLCapabilities glcapabilities = new GLCapabilities();
			if (i > 0) {
				glcapabilities.setSampleBuffers(true);
				glcapabilities.setNumSamples(i);
			}
			final GLDrawableFactory gldrawablefactory = GLDrawableFactory.getFactory();
			glDrawable = gldrawablefactory.getGLDrawable(canvas, glcapabilities, null);
			glDrawable.setRealized(true);
			int tries = 0;
			for (;;) {
				aGLContext522 = glDrawable.createContext(glcontext);
				try {
					final int i_19_ = aGLContext522.makeCurrent();
					if (i_19_ != 0) {
						break;
					}
				} catch (final Exception exception) {
					/* empty */
				}
				if (tries++ > 5) {
					return -2;
				}
				PacketBuffer.sleepWrapper(1000L);
			}
			gl = aGLContext522.getGL();
			glEnabled = true;
			canvasWidth = canvas.getSize().width;
			canvasHeight = canvas.getSize().height;
			final int i_20_ = method530();
			if (i_20_ != 0) {
				method519();
				return i_20_;
			}
			method533();
			method538();
			gl.glClear(16384);
			tries = 0;
			for (;;) {
				try {
					glDrawable.swapBuffers();
					break;
				} catch (final Exception exception) {
					if (tries++ > 5) {
						method519();
						return -3;
					}
					PacketBuffer.sleepWrapper(100L);
				}
			}
			gl.glClear(16384);
			return 0;
		} catch (final Throwable throwable) {
			method519();
			return -5;
		}
	}

	static final void method509() {
		if (aBoolean544) {
			gl.glMatrixMode(5890);//TEXTURE
			gl.glLoadIdentity();
			gl.glMatrixMode(5888);//MODELVIEW
			aBoolean544 = false;
		}
	}

	static final void method510() {
		Class120_Sub14_Sub13.method1532(0, 0);
		setOrthoProjection();
		method511(1);
		method521(1);
		toggleLighting(false);
		toggleDepthTest(false);
		toggleFog(false);
		method509();
	}

	static final void method511(final int i) {
		if (anInt505 != i) {
			//8960 = TEXTURE_ENV
			//34161 = COMBINE_RGB
			if (i == 0) {
				gl.glTexEnvi(8960, 34161, 8448);//MODULATE
			}
			if (i == 1) {
				gl.glTexEnvi(8960, 34161, 7681);//REPLACE
			}
			if (i == 2) {
				gl.glTexEnvi(8960, 34161, 260);//ADD
			}
			if (i == 3) {
				gl.glTexEnvi(8960, 34161, 34023);//SUBTRACT
			}
			if (i == 4) {
				gl.glTexEnvi(8960, 34161, 34164);//ADD_SIGNED
			}
			if (i == 5) {
				gl.glTexEnvi(8960, 34161, 34165);//INTERPOLATE
			}
			anInt505 = i;
		}
	}

	static final void method512(final int i, final int i_21_, final int i_22_, final int near, final int i_24_, final int i_25_) {
		final int left = -i;
		final int right = canvasWidth - i;
		final int top = -i_21_;
		final int bottom = canvasHeight - i_21_;
		gl.glMatrixMode(5889);
		gl.glLoadIdentity();
		final float f = i_22_ / 512.0F;
		final float f_30_ = f * (256.0F / i_24_);
		final float f_31_ = f * (256.0F / i_25_);
		gl.glOrtho(left * f_30_, right * f_30_, -bottom * f_31_, -top * f_31_, 50 - near, 3584 - near);
		setViewport(0, 0, canvasWidth, canvasHeight);
		gl.glMatrixMode(5888);
		gl.glLoadIdentity();
		gl.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
		aBoolean528 = false;
	}

	static final void method513(final int i, final int i_32_, final int i_33_, final int i_34_) {
		method496(0, 0, canvasWidth, canvasHeight, i, i_32_, 0.0F, 0.0F, i_33_, i_34_);
	}

	static final void bindTexture2D(final int id) {
		if (texture2D_ID != id) {
			if (id == -1) {
				gl.glDisable(3553);
			} else {
				if (texture2D_ID == -1) {
					gl.glEnable(3553);
				}
				gl.glBindTexture(3553, id);
			}
			texture2D_ID = id;
		}
	}

	private static final void setOrthoProjection() {
		if (!aBoolean528) {
			gl.glMatrixMode(5889);//PROJECTION
			gl.glLoadIdentity();
			gl.glOrtho(0.0, canvasWidth, 0.0, canvasHeight, -1.0, 1.0);
			setViewport(0, 0, canvasWidth, canvasHeight);
			gl.glMatrixMode(5888);//MODELVIEW
			gl.glLoadIdentity();
			aBoolean528 = true;
		}
	}

	static final void clearDepthBuffer() {
		gl.glClear(256);//GL_DEPTH_BUFFER_BIT
	}

	private static final void loadFrustumMatrix(final float left, final float right, final float bottom, final float top, final float nearMod, final float far) {
		final float near = nearMod * 2.0F;
		matrices[0] = near / (right - left);
		matrices[1] = 0.0F;
		matrices[2] = 0.0F;
		matrices[3] = 0.0F;
		matrices[4] = 0.0F;
		matrices[5] = near / (top - bottom);
		matrices[6] = 0.0F;
		matrices[7] = 0.0F;
		matrices[8] = (right + left) / (right - left);
		matrices[9] = (top + bottom) / (top - bottom);
		matrices[10] = aFloat512 = -(far + nearMod) / (far - nearMod);
		matrices[11] = -1.0F;
		matrices[12] = 0.0F;
		matrices[13] = 0.0F;
		matrices[14] = aFloat533 = -(near * far) / (far - nearMod);
		matrices[15] = 0.0F;
		gl.glLoadMatrixf(matrices, 0);
		aFloat534 = 0.0F;
		aFloat530 = 0.0F;
	}

	static final void method519() {
		if (gl != null) {
			try {
				Class34.method291();
				Class2.method77();
			} catch (final Throwable throwable) {
				/* empty */
			}
			gl = null;
		}
		if (aGLContext522 != null) {
			MemoryManager.method995();
			try {
				if (GLContext.getCurrent() == aGLContext522) {
					aGLContext522.release();
				}
			} catch (final Throwable throwable) {
				/* empty */
			}
			try {
				aGLContext522.destroy();
			} catch (final Throwable throwable) {
				/* empty */
			}
			aGLContext522 = null;
		}
		if (glDrawable != null) {
			try {
				glDrawable.setRealized(false);
			} catch (final Throwable throwable) {
				/* empty */
			}
			glDrawable = null;
		}
		LightManager.method1870();
		glEnabled = false;
	}

	static final void method520(final int i, final int i_41_, final int i_42_, final int i_43_) {
		gl.glMatrixMode(5889);
		gl.glLoadIdentity();
		gl.glOrtho(i, i_41_, i_43_, i_42_, -1.0, 1.0);
		gl.glMatrixMode(5888);
		gl.glLoadIdentity();
		setViewport(viewportOffsetX, viewportOffsetY, canvasWidth, canvasHeight);
		aBoolean528 = false;
	}

	static final void method521(final int i) {
		if (anInt553 != i) {
			//sets a texture environment parameter.
			//TEXTURE_ENV, COMBINE_ALPHA, 
			if (i == 0) {
				gl.glTexEnvi(8960, 34162, 8448);//MODULATE
			}
			if (i == 1) {
				gl.glTexEnvi(8960, 34162, 7681);//REPLACE
			}
			if (i == 2) {
				gl.glTexEnvi(8960, 34162, 260);//ADD
			}
			anInt553 = i;
		}
	}

	static final void method522() {
		final int[] is = new int[2];
		gl.glGetIntegerv(3073, is, 0);
		gl.glGetIntegerv(3074, is, 1);
		gl.glDrawBuffer(1026);
		gl.glReadBuffer(1024);
		bindTexture2D(-1);
		gl.glPushAttrib(8192);
		gl.glDisable(2912);
		gl.glDisable(3042);
		gl.glDisable(2929);
		gl.glDisable(3008);
		gl.glRasterPos2i(0, 0);
		gl.glCopyPixels(0, 0, canvasWidth, canvasHeight, 6144);
		gl.glPopAttrib();
		gl.glDrawBuffer(is[0]);
		gl.glReadBuffer(is[1]);
	}

	static final void method523(final float f, final float f_44_, final float f_45_) {
		gl.glMatrixMode(5890);
		if (aBoolean544) {
			gl.glLoadIdentity();
		}
		gl.glTranslatef(f, f_44_, f_45_);
		gl.glMatrixMode(5888);
		aBoolean544 = true;
	}

	static final void toggleLighting(final boolean value) {
		if (lightingEnabled != value) {
			if (value) {
				gl.glEnable(2896);
			} else {
				gl.glDisable(2896);
			}
			lightingEnabled = value;
		}
	}

	static final void destroy(final Canvas canvas) {
		try {
			if (canvas.isDisplayable()) {
				final GLDrawableFactory gldrawablefactory = GLDrawableFactory.getFactory();
				final GLDrawable gldrawable = gldrawablefactory.getGLDrawable(canvas, null, null);
				gldrawable.setRealized(true);
				final GLContext glcontext = gldrawable.createContext(null);
				glcontext.makeCurrent();
				glcontext.release();
				glcontext.destroy();
				gldrawable.setRealized(false);
			}
		} catch (final Throwable throwable) {
			/* empty */
		}
	}

	static final float method526() {
		return aFloat530;
	}

	static final void method527(final float f) {
		method535(3000.0F, f * 1.5F);
	}

	static final int method528() {
		if (aBoolean531 && (anInt511 <= 0 || anInt506 != MemoryManager.anInt1083)) {
			final int[] is = new int[1];
			gl.glGenFramebuffersEXT(1, is, 0);
			anInt506 = MemoryManager.anInt1083;
			anInt511 = is[0];
		}
		return anInt511;
	}

	static final void method529(final int i) {
		gl.glClearColor((i >> 16 & 0xff) / 255.0F, (i >> 8 & 0xff) / 255.0F, (i & 0xff) / 255.0F, 0.0F);
		gl.glClear(16384);
		gl.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
	}

	private static final int method530() {
		int i = 0;
		vendor = gl.glGetString(7936);//VENDOR
		renderer = gl.glGetString(7937);//RENDERER
		final String vendorLowerCase = vendor.toLowerCase();
		if (vendorLowerCase.indexOf("microsoft") != -1) {
			i |= 0x1;
		}
		if (vendorLowerCase.indexOf("brian paul") != -1 || vendorLowerCase.indexOf("mesa") != -1) {
			i |= 0x1;
		}
		final String versionString = gl.glGetString(7938);//VERSION
		final String[] strings = versionString.split("[. ]");
		if (strings.length >= 2) {
			try {
				final int i_47_ = Integer.parseInt(strings[0]);
				final int i_48_ = Integer.parseInt(strings[1]);
				version = i_47_ * 10 + i_48_;
			} catch (final NumberFormatException numberformatexception) {
				i |= 0x4;
			}
		} else {
			i |= 0x4;
		}
		if (version < 12) {
			i |= 0x2;
		}
		if (!gl.isExtensionAvailable("GL_ARB_multitexture")) {
			i |= 0x8;
		}
		if (!gl.isExtensionAvailable("GL_ARB_texture_env_combine")) {
			i |= 0x20;
		}
		final int[] params = new int[1];
		gl.glGetIntegerv(34018, params, 0);
		maxTextureUnits = params[0];
		gl.glGetIntegerv(34929, params, 0);
		maxTextureCoords = params[0];
		gl.glGetIntegerv(34930, params, 0);
		maxTextureImageUnits = params[0];
		if (maxTextureUnits < 2 || maxTextureCoords < 2 || maxTextureImageUnits < 2) {
			i |= 0x10;
		}
		if (i != 0) {
			return i;
		}
		usingBigEndian = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
		vertexBufferAsObject = gl.isExtensionAvailable("GL_ARB_vertex_buffer_object");
		aBoolean523 = gl.isExtensionAvailable("GL_ARB_multisample");
		aBoolean514 = gl.isExtensionAvailable("GL_ARB_texture_cube_map");
		aBoolean550 = gl.isExtensionAvailable("GL_ARB_vertex_program");
		aBoolean531 = gl.isExtensionAvailable("GL_EXT_framebuffer_object");
		gl.isExtensionAvailable("GL_ARB_vertex_shader");
		aBoolean525 = gl.isExtensionAvailable("GL_ARB_fragment_shader");
		allows3DTextureMapping = gl.isExtensionAvailable("GL_EXT_texture3D");
		aBoolean513 = gl.isExtensionAvailable("GL_ARB_texture_rectangle");
		aBoolean545 = gl.isExtensionAvailable("GL_ARB_texture_float");
		aBoolean541 = true;
		final String string_49_ = renderer.toLowerCase(Locale.ENGLISH);
		if (string_49_.indexOf("radeon") != -1) {
			int i_50_ = 0;
			boolean bool = false;
			final String[] strings_51_ = EntityRenderData.splitString(string_49_.replace('/', ' '), ' ');
			for (int i_54_ = 0; i_54_ < strings_51_.length; i_54_++) {
				final String string_55_ = strings_51_[i_54_];
				if (string_55_.length() >= 4) {
					if (string_55_.charAt(0) == 'x' && Class120_Sub21.isValidStringBase10(string_55_.substring(1, 3))) {
						bool = true;
						break;
					}
					if (Class120_Sub21.isValidStringBase10(string_55_.substring(0, 4))) {
						i_50_ = Class31.stringToBase10(string_55_.substring(0, 4));
						break;
					}
				}
			}
			if (i_50_ >= 7000 && i_50_ <= 7999) {
				vertexBufferAsObject = false;
			}
			if (i_50_ >= 7000 && i_50_ <= 9250) {
				allows3DTextureMapping = false;
			}
			if (i_50_ >= 9200 || bool) {
				aBoolean545 = false;
			}
			aBoolean520 = vertexBufferAsObject;
			aBoolean541 = false;
		}
		if (vertexBufferAsObject) {
			try {
				final int[] is_56_ = new int[1];
				gl.glGenBuffersARB(1, is_56_, 0);
			} catch (final Throwable throwable) {
				return -4;
			}
		}
		return 0;
	}

	static final void method531(final int rgb) {
		gl.glClearColor((rgb >> 16 & 0xff) / 255.0F, (rgb >> 8 & 0xff) / 255.0F, (rgb & 0xff) / 255.0F, 0.0F);
		gl.glClear(16640);
		gl.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
	}

	static final void method532() {
		if (Class120_Sub12_Sub6.highLightingDetail) {
			toggleLighting(true);
			method506(true);
		} else {
			toggleLighting(false);
			method506(false);
		}
	}

	private static final void method533() {
		final int[] is = new int[1];
		gl.glGenTextures(1, is, 0);
		anInt507 = is[0];
		gl.glBindTexture(3553, anInt507);
		gl.glTexImage2D(3553, 0, 4, 1, 1, 0, 6408, 5121, IntBuffer.wrap(new int[] { -1 }));
		LightManager.method1867();
		Class120_Sub12_Sub6.method1227(8);
		Class34.method281();
	}

	static final float method534() {
		return aFloat534;
	}

	static final void method535(final float f, final float f_57_) {
		if (!aBoolean528 && (f != aFloat534 || f_57_ != aFloat530)) {
			aFloat534 = f;
			aFloat530 = f_57_;
			if (f_57_ != 0.0F) {
				final float f_58_ = f / (f_57_ + f);
				final float f_59_ = f_58_ * f_58_;
				final float f_60_ = -aFloat533 * (1.0F - f_58_) * (1.0F - f_58_) / f_57_;
				matrices[10] = aFloat512 + f_60_;
				matrices[14] = aFloat533 * f_59_;
			} else {
				matrices[10] = aFloat512;
				matrices[14] = aFloat533;
			}
			gl.glMatrixMode(5889);
			gl.glLoadMatrixf(matrices, 0);
			gl.glMatrixMode(5888);
		}
	}

	static final void swapBuffers() {
		try {
			glDrawable.swapBuffers();
		} catch (final Exception exception) {
			/* empty */
		}
	}

	static final int method537(final Canvas canvas, final int i) {
		return method508(canvas, i, null);
	}

	private static final void method538() {
		aBoolean528 = false;
		gl.glDisable(3553);
		texture2D_ID = -1;
		gl.glTexEnvi(8960, 8704, 34160);
		gl.glTexEnvi(8960, 34161, 8448);
		anInt505 = 0;
		gl.glTexEnvi(8960, 34162, 8448);
		anInt553 = 0;
		gl.glEnable(2896);
		gl.glEnable(2912);
		gl.glEnable(2929);
		lightingEnabled = true;
		depthTestEnabled = true;
		fogEnabled = true;
		Class153.method2070();
		gl.glActiveTexture(33985);
		gl.glTexEnvi(8960, 8704, 34160);
		gl.glTexEnvi(8960, 34161, 8448);
		gl.glTexEnvi(8960, 34162, 8448);
		gl.glActiveTexture(33984);
		gl.setSwapInterval(0);
		gl.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
		gl.glShadeModel(7425);
		gl.glClearDepth(1.0F);
		gl.glDepthFunc(515);
		enableDepthMask();
		gl.glMatrixMode(5890);
		gl.glLoadIdentity();
		gl.glPolygonMode(1028, 6914);
		gl.glEnable(2884);
		gl.glCullFace(1029);
		gl.glEnable(3042);
		gl.glBlendFunc(770, 771);
		gl.glEnable(3008);
		gl.glAlphaFunc(516, 0.0F);
		gl.glEnableClientState(32884);
		gl.glEnableClientState(32885);
		aBoolean536 = true;
		gl.glEnableClientState(32886);
		gl.glEnableClientState(32888);
		gl.glMatrixMode(5888);
		gl.glLoadIdentity();
		AtmosphereManager.method1018();
		LightManager.method1865();
	}

	static final void method539() {
		Class120_Sub14_Sub13.method1532(0, 0);
		setOrthoProjection();
		method511(0);
		method521(0);
		toggleLighting(false);
		toggleDepthTest(false);
		toggleFog(false);
		method509();
	}
}
