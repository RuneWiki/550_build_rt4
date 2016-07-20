/* Class163 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;

import javax.media.opengl.GL;

final class Class163 {
	static int GL_TEXTURE_2D = 3553;
	static int GL_TEXTURE_RECTANGLE = 34037;
	static int GL_RGB = 6407;
	static int GL_RGBA = 6408;
	static int GL_BGRA = 32993;
	static int GL_RGB_FLOAT16 = 34843;
	static int GL_RGBA_FLOAT16 = 34842;
	static int GL_RGB_FLOAT32 = 34837;
	static int GL_RGBA_FLOAT32 = 34836;
	static int GL_ALPHA = 6406;
	static int GL_DEPTH_COMPONENT = 6402;
	static int GL_LINEAR = 9729;
	static int GL_NEAREST = 9728;
	static int GL_FLOAT = 5126;
	static int GL_UNSIGNED_BYTE = 5121;
	private static int[] textures = new int[1];

	static final void method2120(final int i, final int i_0_, final int i_1_, final int i_2_, final int i_3_, final int i_4_, final byte[] is) {
		final ByteBuffer bytebuffer = is != null ? ByteBuffer.wrap(is) : null;
		HDToolkit.gl.glTexImage2D(i, 0, i_0_, i_1_, i_2_, 0, i_3_, i_4_, bytebuffer);
	}

	static final void method2121(final int i, final int i_5_, final int i_6_) {
		method2120(GL_TEXTURE_RECTANGLE, i, i_5_, i_6_, GL_RGB, GL_UNSIGNED_BYTE, null);
	}

	static final int method2122(final int i, final int i_7_, final int i_8_, final int i_9_, final int i_10_, final int i_11_, final int i_12_, final int i_13_, final byte[] is) {
		final GL gl = HDToolkit.gl;
		final int i_14_ = genTexture();
		if (i == GL_TEXTURE_2D) {
			HDToolkit.bindTexture2D(i_14_);
		} else {
			gl.glBindTexture(i, i_14_);
		}
		method2120(i, i_7_, i_8_, i_9_, i_12_, i_13_, is);
		gl.glTexParameteri(GL_TEXTURE_2D, 10241, i_10_);
		gl.glTexParameteri(GL_TEXTURE_2D, 10240, i_11_);
		return i_14_;
	}

	static final void deleteTexture(final int i) {
		textures[0] = i;
		HDToolkit.gl.glDeleteTextures(1, textures, 0);
	}

	static final void method2124(final int i, final int i_15_, final int i_16_) {
		method2120(GL_TEXTURE_2D, i, i_15_, i_16_, GL_RGB, GL_UNSIGNED_BYTE, null);
	}

	static final int method2125(final int i, final int i_17_, final int i_18_) {
		return method2122(GL_TEXTURE_2D, i, i_17_, i_18_, GL_LINEAR, GL_LINEAR, i, GL_UNSIGNED_BYTE, null);
	}

	static final int genTexture() {
		HDToolkit.gl.glGenTextures(1, textures, 0);
		return textures[0];
	}

	static final int method2127(final int i, final int i_19_, final int i_20_, final byte[] is) {
		return method2122(GL_TEXTURE_2D, i, i_19_, i_20_, GL_LINEAR, GL_LINEAR, i, GL_UNSIGNED_BYTE, is);
	}

}
