/* Class120_Sub14_Sub19_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;

import javax.media.opengl.GL;

final class HDTransparentSprite extends HDSprite {
	HDTransparentSprite(final LDSprite ldSprite) {
		super(ldSprite);
	}

	@Override
	final void method1596(final int[] inputPixels) {
		this.anInt3945 = Class120_Sub12_Sub17.getFarestBitValue(this.width);
		this.anInt3948 = Class120_Sub12_Sub17.getFarestBitValue(this.height);
		final byte[] pixels = new byte[this.anInt3945 * this.anInt3948 * 4];
		int pixelId = 0;
		int inputPixelsId = 0;
		final int pixelStep = (this.anInt3945 - this.width) * 4;
		for (int y = 0; y < this.height; y++) {
			for (int x = 0; x < this.width; x++) {
				final int rgba = inputPixels[inputPixelsId++];
				if (rgba != 0) {
					pixels[pixelId++] = (byte) (rgba >> 16);
					pixels[pixelId++] = (byte) (rgba >> 8);
					pixels[pixelId++] = (byte) rgba;
					pixels[pixelId++] = (byte) (rgba >> 24);
				} else {
					pixelId += 4;
				}
			}
			pixelId += pixelStep;
		}
		final ByteBuffer byteBufferPixels = ByteBuffer.wrap(pixels);
		final GL gl = HDToolkit.gl;
		if (this.textureId == -1) {
			final int[] textureIds = new int[1];
			gl.glGenTextures(1, textureIds, 0);
			this.textureId = textureIds[0];
		}
		HDToolkit.bindTexture2D(this.textureId);
		gl.glTexImage2D(3553, 0, 6408, this.anInt3945, this.anInt3948, 0, 6408, 5121, byteBufferPixels);
		MemoryManager.memory2d += byteBufferPixels.limit() - this.anInt3947;
		this.anInt3947 = byteBufferPixels.limit();
	}

	HDTransparentSprite(final int i, final int i_7_, final int i_8_, final int i_9_, final int i_10_, final int i_11_, final int[] is) {
		super(i, i_7_, i_8_, i_9_, i_10_, i_11_, is);
	}
}
