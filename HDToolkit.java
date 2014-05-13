/* Class58 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
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
	private static boolean aBoolean508;
	static GL gl;
	static boolean isBigEndian;
	private static int anInt511 = -1;
	private static float aFloat512;
	static boolean aBoolean513;
	static boolean aBoolean514;
	private static int anInt515;
	static int anInt516;
	private static String aString517;
	private static GLDrawable aGLDrawable518;
	private static String aString519;
	static boolean aBoolean520;
	private static int viewportOffsetY;
	private static GLContext aGLContext522;
	static boolean aBoolean523;
	static int canvasWidth;
	static boolean aBoolean525;
	static int anInt526;
	private static int viewportOffsetX;
	private static boolean aBoolean528;
	private static boolean aBoolean529;
	private static float aFloat530;
	static boolean aBoolean531;
	private static float[] aFloatArray532;
	private static float aFloat533;
	private static float aFloat534;
	static boolean vertexBufferAsObject;
	static boolean aBoolean536;
	static boolean aBoolean537;
	static int canvasHeight;
	private static int anInt539;
	static boolean glEnabled;
	static boolean aBoolean541;
	static int anInt542;
	static int anInt543;
	private static boolean aBoolean544;
	static boolean aBoolean545;
	private static int anInt546;
	private static int viewportWidth;
	private static boolean aBoolean548;
	private static float aFloat549;
	static boolean aBoolean550;
	private static int viewportHeight;
	private static int anInt552;
	private static int anInt553;

	static {
		aBoolean508 = true;
		aFloat534 = 0.0F;
		aBoolean536 = true;
		aBoolean529 = true;
		anInt542 = 0;
		aFloatArray532 = new float[16];
		anInt546 = -1;
		aBoolean548 = true;
		anInt506 = -1;
		glEnabled = false;
		aFloat530 = 0.0F;
		aBoolean544 = false;
		aFloat549 = 0.09765625F;
		aBoolean528 = false;
		anInt553 = 0;
	}

	static final void method496(final int i, final int i_0_, final int i_1_, final int i_2_, final int i_3_, final int i_4_, final float f, final float f_5_, final int i_6_, final int i_7_) {
		final int i_8_ = (i - i_3_ << 8) / i_6_;
		final int i_9_ = (i + i_1_ - i_3_ << 8) / i_6_;
		final int i_10_ = (i_0_ - i_4_ << 8) / i_7_;
		final int i_11_ = (i_0_ + i_2_ - i_4_ << 8) / i_7_;
		gl.glMatrixMode(5889);
		gl.glLoadIdentity();
		method518(i_8_ * aFloat549, i_9_ * aFloat549, -i_11_ * aFloat549, -i_10_ * aFloat549, 50.0F, 3584.0F);
		method497(i, canvasHeight - i_0_ - i_2_, i_1_, i_2_);
		gl.glMatrixMode(5888);
		gl.glLoadIdentity();
		gl.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
		if (f != 0.0F) {
			gl.glRotatef(f, 1.0F, 0.0F, 0.0F);
		}
		if (f_5_ != 0.0F) {
			gl.glRotatef(f_5_, 0.0F, 1.0F, 0.0F);
		}
		aBoolean528 = false;
		IntegerNode.anInt2792 = i_8_;
		Class120_Sub12_Sub16.anInt3253 = i_9_;
		Class190.anInt2100 = i_10_;
		Class120_Sub30_Sub1.anInt3672 = i_11_;
	}

	private static final void method497(int i, int i_12_, int i_13_, int i_14_) {
		viewportOffsetX = i;
		viewportOffsetY = i_12_;
		viewportWidth = i_13_;
		viewportHeight = i_14_;
		method500();
	}

	static final void method498(final int i, final int i_15_) {
		System.out.println("a2");
		anInt543 = i;
		anInt516 = i_15_;
		method500();
	}

	static final void method499() {
		Class120_Sub14_Sub13.method1532(0, 0);
		method515();
		method514(-1);
		method524(false);
		method502(false);
		method507(false);
		method509();
	}

	private static final void method500() {
		gl.glViewport(viewportOffsetX + anInt543, viewportOffsetY + anInt516, viewportWidth, viewportHeight);
	}

	static final void setCanvasSize(final int i, final int i_16_) {
		canvasWidth = i;
		canvasHeight = i_16_;
		aBoolean528 = false;
	}

	static final void method502(final boolean bool) {
		if (bool != aBoolean508) {
			if (bool) {
				gl.glEnable(2929);
			} else {
				gl.glDisable(2929);
			}
			aBoolean508 = bool;
		}
	}

	static final void method503() {
		gl.glDepthMask(false);
	}

	static final void method504() {
		Class120_Sub14_Sub13.method1532(0, 0);
		method515();
		method511(0);
		method521(0);
		method524(false);
		method502(false);
		method507(false);
		method509();
	}

	static final void method505() {
		gl.glDepthMask(true);
	}

	private static final void method506(final boolean bool) {
		if (bool != aBoolean536) {
			if (bool) {
				gl.glEnableClientState(32885);
			} else {
				gl.glDisableClientState(32885);
			}
			aBoolean536 = bool;
		}
	}

	static final void method507(final boolean bool) {
		if (bool != aBoolean548) {
			if (bool) {
				gl.glEnable(2912);
			} else {
				gl.glDisable(2912);
			}
			aBoolean548 = bool;
		}
	}

	private static final int method508(final Canvas canvas, final int i, final GLContext glcontext) {
		int i_17_;
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
			aGLDrawable518 = gldrawablefactory.getGLDrawable(canvas, glcapabilities, null);
			aGLDrawable518.setRealized(true);
			int i_18_ = 0;
			for (;;) {
				aGLContext522 = aGLDrawable518.createContext(glcontext);
				try {
					final int i_19_ = aGLContext522.makeCurrent();
					if (i_19_ != 0) {
						break;
					}
				} catch (final Exception exception) {
					/* empty */
				}
				if (i_18_++ > 5) {
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
			i_18_ = 0;
			for (;;) {
				try {
					aGLDrawable518.swapBuffers();
					break;
				} catch (final Exception exception) {
					if (i_18_++ > 5) {
						method519();
						return -3;
					}
					PacketBuffer.sleepWrapper(100L);
				}
			}
			gl.glClear(16384);
			i_17_ = 0;
		} catch (final Throwable throwable) {
			method519();
			return -5;
		}
		return i_17_;
	}

	static final void method509() {
		if (aBoolean544) {
			gl.glMatrixMode(5890);
			gl.glLoadIdentity();
			gl.glMatrixMode(5888);
			aBoolean544 = false;
		}
	}

	static final void method510() {
		Class120_Sub14_Sub13.method1532(0, 0);
		method515();
		method511(1);
		method521(1);
		method524(false);
		method502(false);
		method507(false);
		method509();
	}

	static final void method511(final int i) {
		if (i != anInt505) {
			if (i == 0) {
				gl.glTexEnvi(8960, 34161, 8448);
			}
			if (i == 1) {
				gl.glTexEnvi(8960, 34161, 7681);
			}
			if (i == 2) {
				gl.glTexEnvi(8960, 34161, 260);
			}
			if (i == 3) {
				gl.glTexEnvi(8960, 34161, 34023);
			}
			if (i == 4) {
				gl.glTexEnvi(8960, 34161, 34164);
			}
			if (i == 5) {
				gl.glTexEnvi(8960, 34161, 34165);
			}
			anInt505 = i;
		}
	}

	static final void method512(final int i, final int i_21_, final int i_22_, final int i_23_, final int i_24_, final int i_25_) {
		final int i_26_ = -i;
		final int i_27_ = canvasWidth - i;
		final int i_28_ = -i_21_;
		final int i_29_ = canvasHeight - i_21_;
		gl.glMatrixMode(5889);
		gl.glLoadIdentity();
		final float f = i_22_ / 512.0F;
		final float f_30_ = f * (256.0F / i_24_);
		final float f_31_ = f * (256.0F / i_25_);
		gl.glOrtho(i_26_ * f_30_, i_27_ * f_30_, -i_29_ * f_31_, -i_28_ * f_31_, 50 - i_23_, 3584 - i_23_);
		method497(0, 0, canvasWidth, canvasHeight);
		gl.glMatrixMode(5888);
		gl.glLoadIdentity();
		gl.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
		aBoolean528 = false;
	}

	static final void method513(final int i, final int i_32_, final int i_33_, final int i_34_) {
		method496(0, 0, canvasWidth, canvasHeight, i, i_32_, 0.0F, 0.0F, i_33_, i_34_);
	}

	static final void method514(final int i) {
		if (i != anInt546) {
			if (i != -1) {
				if (anInt546 == -1) {
					gl.glEnable(3553);
				}
				gl.glBindTexture(3553, i);
			} else {
				gl.glDisable(3553);
			}
			anInt546 = i;
		}
	}

	private static final void method515() {
		if (!aBoolean528) {
			gl.glMatrixMode(5889);
			gl.glLoadIdentity();
			gl.glOrtho(0.0, canvasWidth, 0.0, canvasHeight, -1.0, 1.0);
			method497(0, 0, canvasWidth, canvasHeight);
			gl.glMatrixMode(5888);
			gl.glLoadIdentity();
			aBoolean528 = true;
		}
	}

	public static void method516() {
		aString517 = null;
		aString519 = null;
		gl = null;
		aGLDrawable518 = null;
		aGLContext522 = null;
		aFloatArray532 = null;
	}

	static final void method517() {
		gl.glClear(256);
	}

	private static final void method518(final float f, final float f_35_, final float f_36_, final float f_37_, final float f_38_, final float f_39_) {
		final float f_40_ = f_38_ * 2.0F;
		aFloatArray532[0] = f_40_ / (f_35_ - f);
		aFloatArray532[1] = 0.0F;
		aFloatArray532[2] = 0.0F;
		aFloatArray532[3] = 0.0F;
		aFloatArray532[4] = 0.0F;
		aFloatArray532[5] = f_40_ / (f_37_ - f_36_);
		aFloatArray532[6] = 0.0F;
		aFloatArray532[7] = 0.0F;
		aFloatArray532[8] = (f_35_ + f) / (f_35_ - f);
		aFloatArray532[9] = (f_37_ + f_36_) / (f_37_ - f_36_);
		aFloatArray532[10] = aFloat512 = -(f_39_ + f_38_) / (f_39_ - f_38_);
		aFloatArray532[11] = -1.0F;
		aFloatArray532[12] = 0.0F;
		aFloatArray532[13] = 0.0F;
		aFloatArray532[14] = aFloat533 = -(f_40_ * f_39_) / (f_39_ - f_38_);
		aFloatArray532[15] = 0.0F;
		gl.glLoadMatrixf(aFloatArray532, 0);
		aFloat534 = 0.0F;
		aFloat530 = 0.0F;
	}

	static final void method519() {
		if (gl != null) {
			try {
				Class34.method291();
				Class2.method77(-116);
			} catch (final Throwable throwable) {
				/* empty */
			}
			gl = null;
		}
		if (aGLContext522 != null) {
			Class113.method995();
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
		if (aGLDrawable518 != null) {
			try {
				aGLDrawable518.setRealized(false);
			} catch (final Throwable throwable) {
				/* empty */
			}
			aGLDrawable518 = null;
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
		method497(anInt543, anInt516, canvasWidth, canvasHeight);
		aBoolean528 = false;
	}

	static final void method521(final int i) {
		if (i != anInt553) {
			if (i == 0) {
				gl.glTexEnvi(8960, 34162, 8448);
			}
			if (i == 1) {
				gl.glTexEnvi(8960, 34162, 7681);
			}
			if (i == 2) {
				gl.glTexEnvi(8960, 34162, 260);
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
		method514(-1);
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

	static final void method524(final boolean bool) {
		if (bool != aBoolean529) {
			if (bool) {
				gl.glEnable(2896);
			} else {
				gl.glDisable(2896);
			}
			aBoolean529 = bool;
		}
	}

	static final void method525(final Canvas canvas) {
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
		if (aBoolean531 && (anInt511 <= 0 || anInt506 != Class113.anInt1083)) {
			final int[] is = new int[1];
			gl.glGenFramebuffersEXT(1, is, 0);
			anInt506 = Class113.anInt1083;
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
		aString519 = gl.glGetString(7936);
		aString517 = gl.glGetString(7937);
		final String string = aString519.toLowerCase();
		if (string.indexOf("microsoft") != -1) {
			i |= 0x1;
		}
		if (string.indexOf("brian paul") != -1 || string.indexOf("mesa") != -1) {
			i |= 0x1;
		}
		final String string_46_ = gl.glGetString(7938);
		final String[] strings = string_46_.split("[. ]");
		if (strings.length >= 2) {
			try {
				final int i_47_ = Integer.parseInt(strings[0]);
				final int i_48_ = Integer.parseInt(strings[1]);
				anInt539 = i_47_ * 10 + i_48_;
			} catch (final NumberFormatException numberformatexception) {
				i |= 0x4;
			}
		} else {
			i |= 0x4;
		}
		if (anInt539 < 12) {
			i |= 0x2;
		}
		if (!gl.isExtensionAvailable("GL_ARB_multitexture")) {
			i |= 0x8;
		}
		if (!gl.isExtensionAvailable("GL_ARB_texture_env_combine")) {
			i |= 0x20;
		}
		final int[] is = new int[1];
		gl.glGetIntegerv(34018, is, 0);
		anInt526 = is[0];
		gl.glGetIntegerv(34929, is, 0);
		anInt552 = is[0];
		gl.glGetIntegerv(34930, is, 0);
		anInt515 = is[0];
		if (anInt526 < 2 || anInt552 < 2 || anInt515 < 2) {
			i |= 0x10;
		}
		if (i != 0) {
			return i;
		}
		isBigEndian = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
		vertexBufferAsObject = gl.isExtensionAvailable("GL_ARB_vertex_buffer_object");
		aBoolean523 = gl.isExtensionAvailable("GL_ARB_multisample");
		aBoolean514 = gl.isExtensionAvailable("GL_ARB_texture_cube_map");
		aBoolean550 = gl.isExtensionAvailable("GL_ARB_vertex_program");
		aBoolean531 = gl.isExtensionAvailable("GL_EXT_framebuffer_object");
		gl.isExtensionAvailable("GL_ARB_vertex_shader");
		aBoolean525 = gl.isExtensionAvailable("GL_ARB_fragment_shader");
		aBoolean537 = gl.isExtensionAvailable("GL_EXT_texture3D");
		aBoolean513 = gl.isExtensionAvailable("GL_ARB_texture_rectangle");
		aBoolean545 = gl.isExtensionAvailable("GL_ARB_texture_float");
		aBoolean541 = true;
		final String string_49_ = aString517.toLowerCase(Locale.ENGLISH);
		if (string_49_.indexOf("radeon") != -1) {
			int i_50_ = 0;
			boolean bool = false;
			final String[] strings_51_ = Class29.method249(0, ' ', string_49_.replace('/', ' '));
			String[] strings_53_;
			final int i_52_ = (strings_53_ = strings_51_).length;
			for (int i_54_ = 0; i_54_ < i_52_; i_54_++) {
				final String string_55_ = strings_53_[i_54_];
				if (string_55_.length() >= 4) {
					if (string_55_.charAt(0) == 'x' && Class120_Sub21.method1697(string_55_.substring(1, 3), (byte) -36)) {
						bool = true;
						break;
					}
					if (Class120_Sub21.method1697(string_55_.substring(0, 4), (byte) -36)) {
						i_50_ = Class31.method265(true, string_55_.substring(0, 4));
						break;
					}
				}
			}
			if (i_50_ >= 7000 && i_50_ <= 7999) {
				vertexBufferAsObject = false;
			}
			if (i_50_ >= 7000 && i_50_ <= 9250) {
				aBoolean537 = false;
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

	static final void method531(final int i) {
		gl.glClearColor((i >> 16 & 0xff) / 255.0F, (i >> 8 & 0xff) / 255.0F, (i & 0xff) / 255.0F, 0.0F);
		gl.glClear(16640);
		gl.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
	}

	static final void method532() {
		if (Class120_Sub12_Sub6.highLightingDetail) {
			method524(true);
			method506(true);
		} else {
			method524(false);
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
				aFloatArray532[10] = aFloat512 + f_60_;
				aFloatArray532[14] = aFloat533 * f_59_;
			} else {
				aFloatArray532[10] = aFloat512;
				aFloatArray532[14] = aFloat533;
			}
			gl.glMatrixMode(5889);
			gl.glLoadMatrixf(aFloatArray532, 0);
			gl.glMatrixMode(5888);
		}
	}

	static final void method536() {
		try {
			aGLDrawable518.swapBuffers();
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
		anInt546 = -1;
		gl.glTexEnvi(8960, 8704, 34160);
		gl.glTexEnvi(8960, 34161, 8448);
		anInt505 = 0;
		gl.glTexEnvi(8960, 34162, 8448);
		anInt553 = 0;
		gl.glEnable(2896);
		gl.glEnable(2912);
		gl.glEnable(2929);
		aBoolean529 = true;
		aBoolean508 = true;
		aBoolean548 = true;
		Class153.method2070((byte) -2);
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
		method505();
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
		Class117.method1018();
		LightManager.method1865();
	}

	static final void method539() {
		Class120_Sub14_Sub13.method1532(0, 0);
		method515();
		method511(0);
		method521(0);
		method524(false);
		method502(false);
		method507(false);
		method509();
	}
}
