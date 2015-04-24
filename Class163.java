/* Class163 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;

import javax.media.opengl.GL;

final class Class163 {
	static int anInt1567 = 3553;
	static int anInt1568 = 34037;
	static int anInt1569 = 6407;
	static int anInt1570 = 6408;
	static int anInt1571 = 32993;
	static int anInt1572 = 34843;
	static int anInt1573 = 34842;
	static int anInt1574 = 34837;
	static int anInt1575 = 34836;
	static int anInt1576 = 6406;
	static int anInt1577 = 6402;
	static int anInt1578 = 9729;
	static int anInt1579 = 9728;
	static int anInt1580 = 5126;
	static int anInt1581 = 5121;
	private static int[] anIntArray1582 = new int[1];

	static final void method2120(final int i, final int i_0_, final int i_1_, final int i_2_, final int i_3_, final int i_4_, final byte[] is) {
		final ByteBuffer bytebuffer = is != null ? ByteBuffer.wrap(is) : null;
		HDToolkit.gl.glTexImage2D(i, 0, i_0_, i_1_, i_2_, 0, i_3_, i_4_, bytebuffer);
	}

	static final void method2121(final int i, final int i_5_, final int i_6_) {
		method2120(anInt1568, i, i_5_, i_6_, anInt1569, anInt1581, null);
	}

	static final int method2122(final int i, final int i_7_, final int i_8_, final int i_9_, final int i_10_, final int i_11_, final int i_12_, final int i_13_, final byte[] is) {
		final GL gl = HDToolkit.gl;
		final int i_14_ = method2126();
		if (i == 3553) {
			HDToolkit.bindTexture2D(i_14_);
		} else {
			gl.glBindTexture(i, i_14_);
		}
		method2120(i, i_7_, i_8_, i_9_, i_12_, i_13_, is);
		gl.glTexParameteri(3553, 10241, i_10_);
		gl.glTexParameteri(3553, 10240, i_11_);
		return i_14_;
	}

	static final void method2123(final int i) {
		anIntArray1582[0] = i;
		HDToolkit.gl.glDeleteTextures(1, anIntArray1582, 0);
	}

	static final void method2124(final int i, final int i_15_, final int i_16_) {
		method2120(anInt1567, i, i_15_, i_16_, anInt1569, anInt1581, null);
	}

	static final int method2125(final int i, final int i_17_, final int i_18_) {
		return method2122(anInt1567, i, i_17_, i_18_, anInt1578, anInt1578, i, anInt1581, null);
	}

	static final int method2126() {
		HDToolkit.gl.glGenTextures(1, anIntArray1582, 0);
		return anIntArray1582[0];
	}

	static final int method2127(final int i, final int i_19_, final int i_20_, final byte[] is) {
		return method2122(anInt1567, i, i_19_, i_20_, anInt1578, anInt1578, i, anInt1581, is);
	}

}
