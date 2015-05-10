/* Class120_Sub2_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import javax.media.opengl.GL;

final class Class120_Sub2_Sub1 extends Class120_Sub2 {
	private LinkedShader aClass131_3101;
	private int anInt3102 = -1;
	private int anInt3103 = Class163.GL_LINEAR;
	private LinkedShader aClass131_3104;
	private int anInt3105 = -1;
	static float aFloat3106 = 0.25F;
	private int anInt3107 = -1;
	private LinkedShader aClass131_3108;
	private LinkedShader aClass131_3109;
	private int[] anIntArray3110;
	static float aFloat3111;
	static float aFloat3112 = 1.0F;
	private int anInt3113 = -1;

	static {
		aFloat3111 = 1.0F;
	}

	@Override
	final void method1048(final int i, final int i_0_, final int i_1_, final int i_2_, final int i_3_) {
		final GL gl = HDToolkit.gl;
		gl.glPushAttrib(2048);
		gl.glMatrixMode(5889);
		gl.glPushMatrix();
		gl.glLoadIdentity();
		gl.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
		if (anIntArray3110 != null) {
			Class12.method140(anInt3107);
			int i_4_ = Deque.method888(i_0_);
			int i_5_ = Deque.method888(i_1_);
			int i_6_ = 0;
			while (i_4_ > 256 || i_5_ > 256) {
				gl.glViewport(0, 0, i_4_, i_5_);
				gl.glFramebufferTexture2DEXT(36160, 36064, 3553, anIntArray3110[i_6_], 0);
				if (i_6_ == 0) {
					gl.glEnable(34037);
					gl.glBindTexture(34037, i_2_);
					gl.glBegin(7);
					gl.glTexCoord2f(0.0F, 0.0F);
					gl.glVertex2i(0, 0);
					gl.glTexCoord2f(i_0_, 0.0F);
					gl.glVertex2i(1, 0);
					gl.glTexCoord2f(i_0_, i_1_);
					gl.glVertex2i(1, 1);
					gl.glTexCoord2f(0.0F, i_1_);
					gl.glVertex2i(0, 1);
					gl.glEnd();
					gl.glDisable(34037);
				} else {
					HDToolkit.bindTexture2D(anIntArray3110[i_6_ - 1]);
					gl.glBegin(7);
					gl.glTexCoord2f(0.0F, 0.0F);
					gl.glVertex2i(0, 0);
					gl.glTexCoord2f(1.0F, 0.0F);
					gl.glVertex2i(1, 0);
					gl.glTexCoord2f(1.0F, 1.0F);
					gl.glVertex2i(1, 1);
					gl.glTexCoord2f(0.0F, 1.0F);
					gl.glVertex2i(0, 1);
					gl.glEnd();
				}
				if (i_4_ > 256) {
					i_4_ >>= 1;
				}
				if (i_5_ > 256) {
					i_5_ >>= 1;
				}
				i_6_++;
			}
			Class12.method139();
			HDToolkit.bindTexture2D(anIntArray3110[i_6_ - 1]);
			Class12.method140(anInt3102);
			gl.glDrawBuffer(36064);
			gl.glViewport(0, 0, 256, 256);
			final int i_7_ = aClass131_3104.target;
			gl.glUseProgramObjectARB(i_7_);
			gl.glUniform1iARB(gl.glGetUniformLocation(i_7_, "sceneTex"), 0);
			gl.glUniform3fARB(gl.glGetUniformLocation(i_7_, "params"), aFloat3111, 0.0F, 0.0F);
			gl.glBegin(7);
			gl.glTexCoord2f(0.0F, 0.0F);
			gl.glVertex2i(0, 0);
			gl.glTexCoord2f(1.0F, 0.0F);
			gl.glVertex2i(1, 0);
			gl.glTexCoord2f(1.0F, 1.0F);
			gl.glVertex2i(1, 1);
			gl.glTexCoord2f(0.0F, 1.0F);
			gl.glVertex2i(0, 1);
			gl.glEnd();
		} else {
			gl.glBindTexture(34037, i_2_);
			Class12.method140(anInt3102);
			gl.glDrawBuffer(36064);
			gl.glViewport(0, 0, 256, 256);
			final int i_8_ = aClass131_3109.target;
			gl.glUseProgramObjectARB(i_8_);
			gl.glUniform1iARB(gl.glGetUniformLocation(i_8_, "sceneTex"), 0);
			gl.glUniform3fARB(gl.glGetUniformLocation(i_8_, "params"), aFloat3111, 0.0F, 0.0F);
			gl.glBegin(7);
			gl.glTexCoord2f(0.0F, 0.0F);
			gl.glVertex2i(0, 0);
			gl.glTexCoord2f(i_0_, 0.0F);
			gl.glVertex2i(1, 0);
			gl.glTexCoord2f(i_0_, i_1_);
			gl.glVertex2i(1, 1);
			gl.glTexCoord2f(0.0F, i_1_);
			gl.glVertex2i(0, 1);
			gl.glEnd();
		}
		gl.glDrawBuffer(36065);
		HDToolkit.bindTexture2D(anInt3113);
		final int i_9_ = aClass131_3108.target;
		gl.glUseProgramObjectARB(i_9_);
		gl.glUniform1iARB(gl.glGetUniformLocation(i_9_, "baseTex"), 0);
		gl.glUniform3fARB(gl.glGetUniformLocation(i_9_, "step"), 0.00390625F, 0.0F, 0.0F);
		gl.glBegin(7);
		gl.glTexCoord2f(0.0F, 0.0F);
		gl.glVertex2i(0, 0);
		gl.glTexCoord2f(1.0F, 0.0F);
		gl.glVertex2i(1, 0);
		gl.glTexCoord2f(1.0F, 1.0F);
		gl.glVertex2i(1, 1);
		gl.glTexCoord2f(0.0F, 1.0F);
		gl.glVertex2i(0, 1);
		gl.glEnd();
		gl.glDrawBuffer(36064);
		HDToolkit.bindTexture2D(anInt3105);
		gl.glUniform3fARB(gl.glGetUniformLocation(i_9_, "step"), 0.0F, 0.00390625F, 0.0F);
		gl.glBegin(7);
		gl.glTexCoord2f(0.0F, 0.0F);
		gl.glVertex2i(0, 0);
		gl.glTexCoord2f(1.0F, 0.0F);
		gl.glVertex2i(1, 0);
		gl.glTexCoord2f(1.0F, 1.0F);
		gl.glVertex2i(1, 1);
		gl.glTexCoord2f(0.0F, 1.0F);
		gl.glVertex2i(0, 1);
		gl.glEnd();
		gl.glPopAttrib();
		gl.glPopMatrix();
		gl.glMatrixMode(5888);
		Class12.method139();
		final int i_10_ = aClass131_3101.target;
		gl.glUseProgramObjectARB(i_10_);
		gl.glUniform1iARB(gl.glGetUniformLocation(i_10_, "sceneTex"), 0);
		gl.glUniform1iARB(gl.glGetUniformLocation(i_10_, "bloomTex"), 1);
		gl.glUniform3fARB(gl.glGetUniformLocation(i_10_, "params"), aFloat3106, aFloat3112, 0.0F);
		gl.glActiveTexture(33985);
		gl.glBindTexture(3553, anInt3113);
		gl.glActiveTexture(33984);
	}

	@Override
	final void method1052(final int i, final int i_11_) {
		final GL gl = HDToolkit.gl;
		final int i_12_ = Deque.method888(i);
		final int i_13_ = Deque.method888(i_11_);
		if (anIntArray3110 != null) {
			gl.glDeleteTextures(anIntArray3110.length, anIntArray3110, 0);
			anIntArray3110 = null;
		}
		if (anInt3103 == Class163.GL_LINEAR && (i_12_ > 256 || i_13_ > 256)) {
			int i_14_ = i_12_;
			int i_15_ = i_13_;
			int i_16_ = 0;
			if (anInt3107 == -1) {
				anInt3107 = Class12.method134();
			}
			while (i_14_ > 256 || i_15_ > 256) {
				if (i_14_ > 256) {
					i_14_ >>= 1;
				}
				if (i_15_ > 256) {
					i_15_ >>= 1;
				}
				i_16_++;
			}
			anIntArray3110 = new int[i_16_];
			i_14_ = i_12_;
			i_15_ = i_13_;
			i_16_ = 0;
			while (i_14_ > 256 || i_15_ > 256) {
				anIntArray3110[i_16_++] = Class163.method2122(Class163.GL_TEXTURE_2D, Class163.GL_RGBA_FLOAT16, i_14_, i_15_, Class163.GL_LINEAR, Class163.GL_LINEAR, Class163.GL_RGBA, Class163.GL_UNSIGNED_BYTE, null);
				if (i_14_ > 256) {
					i_14_ >>= 1;
				}
				if (i_15_ > 256) {
					i_15_ >>= 1;
				}
			}
		} else if (anInt3107 != -1) {
			Class12.method135(anInt3107);
			anInt3107 = -1;
		}
	}

	@Override
	final void method1047() {
		if (anIntArray3110 != null) {
			HDToolkit.gl.glDeleteTextures(anIntArray3110.length, anIntArray3110, 0);
			anIntArray3110 = null;
		}
		if (anInt3107 != -1) {
			Class12.method135(anInt3107);
			anInt3107 = -1;
		}
		if (anInt3102 != -1) {
			Class12.method135(anInt3102);
			anInt3102 = -1;
		}
		if (anInt3113 != -1) {
			Class163.method2123(anInt3113);
			anInt3113 = -1;
		}
		if (anInt3105 != -1) {
			Class163.method2123(anInt3105);
			anInt3105 = -1;
		}
		aClass131_3109 = null;
		aClass131_3104 = null;
		aClass131_3101 = null;
		aClass131_3108 = null;
	}

	@Override
	final boolean method1053() {
		if (anInt3102 != -1) {
			return true;
		}
		return false;
	}

	@Override
	final int method1041() {
		return 1;
	}

	@Override
	final void method1043(final int i) {
		HDToolkit.gl.glUseProgramObjectARB(0);
	}

	@Override
	final boolean method1049() {
		if (HDToolkit.aBoolean531 && HDToolkit.aBoolean525 && HDToolkit.aBoolean545) {
			final GL gl = HDToolkit.gl;
			anInt3102 = Class12.method134();
			anInt3113 = Class163.method2122(Class163.GL_TEXTURE_2D, Class163.GL_RGBA_FLOAT16, 256, 256, Class163.GL_LINEAR, Class163.GL_LINEAR, Class163.GL_RGBA, Class163.GL_UNSIGNED_BYTE, null);
			gl.glTexParameteri(3553, 10242, 33071);
			gl.glTexParameteri(3553, 10243, 33071);
			anInt3105 = Class163.method2122(Class163.GL_TEXTURE_2D, Class163.GL_RGBA_FLOAT16, 256, 256, Class163.GL_LINEAR, Class163.GL_LINEAR, Class163.GL_RGBA, Class163.GL_UNSIGNED_BYTE, null);
			gl.glTexParameteri(3553, 10242, 33071);
			gl.glTexParameteri(3553, 10243, 33071);
			Class12.method140(anInt3102);
			gl.glFramebufferTexture2DEXT(36160, 36064, 3553, anInt3113, 0);
			gl.glFramebufferTexture2DEXT(36160, 36065, 3553, anInt3105, 0);
			gl.glDrawBuffer(36064);
			if (!Class12.method141()) {
				anInt3103 = Class163.GL_NEAREST;
				HDToolkit.bindTexture2D(anInt3113);
				gl.glTexParameteri(3553, 10241, 9728);
				gl.glTexParameteri(3553, 10240, 9728);
				HDToolkit.bindTexture2D(anInt3105);
				gl.glTexParameteri(3553, 10241, 9728);
				gl.glTexParameteri(3553, 10240, 9728);
				if (!Class12.method141()) {
					Class12.method139();
					return false;
				}
			}
			Class12.method139();
			aClass131_3109 = LinkedShader
					.linkShaders(new Shader[] { Shader
							.compile(
									"#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).rgb;\n    gl_FragColor = vec4(col*step(params.x, dot(lumCoef, col)), 1.0);\n}\n",
									Shader.FRAGMENT_SHADER_ID) });
			aClass131_3104 = LinkedShader.linkShaders(new Shader[] { Shader.compile(
					"uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec3 col = texture2D(sceneTex, gl_TexCoord[0].xy).rgb;\n    gl_FragColor = vec4(col*step(params.x, dot(lumCoef, col)), 1.0);\n}\n", Shader.FRAGMENT_SHADER_ID) });
			aClass131_3101 = LinkedShader
					.linkShaders(new Shader[] { Shader
							.compile(
									"#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec3 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy).rgb;\n\t vec3 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy).rgb;\n\t float preLum = 0.99*dot(lumCoef, sceneCol)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = vec4(sceneCol*(postLum/preLum)+bloomCol*params.x, 1.0);\n}\n",
									Shader.FRAGMENT_SHADER_ID) });
			aClass131_3108 = LinkedShader
					.linkShaders(new Shader[] { Shader
							.compile(
									"uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n",
									Shader.FRAGMENT_SHADER_ID) });
			if (aClass131_3104 != null && aClass131_3109 != null && aClass131_3101 != null && aClass131_3108 != null) {
				return true;
			}
			return false;
		}
		return false;
	}

	public Class120_Sub2_Sub1() {
		/* empty */
	}
}
