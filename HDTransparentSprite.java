/* Class120_Sub14_Sub19_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;

import javax.media.opengl.GL;

final class HDTransparentSprite extends HDSprite {
	HDTransparentSprite(final LDSprite class120_sub14_sub19_sub2) {
		super(class120_sub14_sub19_sub2);
	}

	@Override
	final void method1596(final int[] is) {
		this.anInt3945 = Class120_Sub12_Sub17.method1283(this.width);
		this.anInt3948 = Class120_Sub12_Sub17.method1283(this.height);
		final byte[] is_0_ = new byte[this.anInt3945 * this.anInt3948 * 4];
		int i = 0;
		int i_1_ = 0;
		final int i_2_ = (this.anInt3945 - this.width) * 4;
		for (int i_3_ = 0; i_3_ < this.height; i_3_++) {
			for (int i_4_ = 0; i_4_ < this.width; i_4_++) {
				final int i_5_ = is[i_1_++];
				if (i_5_ != 0) {
					is_0_[i++] = (byte) (i_5_ >> 16);
					is_0_[i++] = (byte) (i_5_ >> 8);
					is_0_[i++] = (byte) i_5_;
					is_0_[i++] = (byte) (i_5_ >> 24);
				} else {
					i += 4;
				}
			}
			i += i_2_;
		}
		final ByteBuffer bytebuffer = ByteBuffer.wrap(is_0_);
		final GL gl = HDToolkit.gl;
		if (this.anInt3942 == -1) {
			final int[] is_6_ = new int[1];
			gl.glGenTextures(1, is_6_, 0);
			this.anInt3942 = is_6_[0];
		}
		HDToolkit.method514(this.anInt3942);
		gl.glTexImage2D(3553, 0, 6408, this.anInt3945, this.anInt3948, 0, 6408, 5121, bytebuffer);
		Class113.anInt1086 += bytebuffer.limit() - this.anInt3947;
		this.anInt3947 = bytebuffer.limit();
	}

	HDTransparentSprite(final int i, final int i_7_, final int i_8_, final int i_9_, final int i_10_, final int i_11_, final int[] is) {
		super(i, i_7_, i_8_, i_9_, i_10_, i_11_, is);
	}
}
