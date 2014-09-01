/* Class94 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import javax.media.opengl.GL;

final class Class94 {
	private final int textureId;
	private int anInt872 = -1;
	private static byte[] pixels = new byte[16384];
	private VertexBuffer aClass104_874;
	boolean aBoolean875 = true;
	private ByteBuffer aByteBuffer876;
	private VertexBuffer aClass104_877;
	private ByteBuffer aByteBuffer878;

	final boolean method776(final LDIndexedSprite class107_sub1, final int i, final int i_0_) {
		final byte[] paletteIndicators = class107_sub1.paletteIndicators;
		final int width = class107_sub1.width;
		int i_2_ = i * 128 + 1 + (i_0_ * 128 + 1) * width;
		int i_3_ = 0;
		for (int i_4_ = -128; i_4_ < 0; i_4_++) {
			i_3_ = (i_3_ << 8) - i_3_;
			for (int i_5_ = -128; i_5_ < 0; i_5_++) {
				if (paletteIndicators[i_2_++] != 0) {
					i_3_++;
				}
			}
			i_2_ += width - 128;
		}
		if (i_3_ == anInt872) {
			return false;
		}
		anInt872 = i_3_;
		i_2_ = i * 128 + 1 + (i_0_ * 128 + 1) * width;
		int i_6_ = 0;
		for (int i_7_ = -128; i_7_ < 0; i_7_++) {
			for (int i_8_ = -128; i_8_ < 0; i_8_++) {
				if (paletteIndicators[i_2_] != 0) {
					pixels[i_6_++] = (byte) 68;
				} else {
					int i_9_ = 0;
					if (paletteIndicators[i_2_ - 1] != 0) {
						i_9_++;
					}
					if (paletteIndicators[i_2_ + 1] != 0) {
						i_9_++;
					}
					if (paletteIndicators[i_2_ - width] != 0) {
						i_9_++;
					}
					if (paletteIndicators[i_2_ + width] != 0) {
						i_9_++;
					}
					pixels[i_6_++] = (byte) (17 * i_9_);
				}
				i_2_++;
			}
			i_2_ += width - 128;
		}
		final GL gl = HDToolkit.gl;
		final ByteBuffer byteBuffer = ByteBuffer.wrap(pixels);
		byteBuffer.limit(16384);
		HDToolkit.bindTexture2D(textureId);
		//glTexImage2D(int target, int level, int internalformat, int width, int height, int border, int format, int type, java.nio.ByteBuffer pixels) 
		gl.glTexImage2D(3553, 0, 6406, 128, 128, 0, 6406, 5121, byteBuffer);//TEXTURE_2D, 0, ALPHA, 128, 1228, 0, ALPHA, UNSIGNED_BYTE, 
		return true;
	}

	final void method777() {
		final GL gl = HDToolkit.gl;
		HDToolkit.bindTexture2D(textureId);
		if (aClass104_877 != null) {
			aClass104_877.bindArrayBuffer();
			gl.glInterleavedArrays(10791, 20, 0L);
			HDToolkit.aBoolean536 = false;
		} else {
			if (HDToolkit.vertexBufferAsObject) {
				gl.glBindBufferARB(34962, 0);
			}
			gl.glInterleavedArrays(10791, 20, aByteBuffer876);
			HDToolkit.aBoolean536 = false;
		}
		if (aClass104_874 != null) {
			aClass104_874.bindElementArrayBuffer();
			gl.glDrawElements(4, 384, 5125, 0L);
		} else {
			if (HDToolkit.vertexBufferAsObject) {
				gl.glBindBufferARB(34963, 0);
			}
			gl.glDrawElements(4, 384, 5125, aByteBuffer878);
		}
	}

	final void method778(final int[][] is, final int i, final int i_10_) {
		final Buffer class120_sub7 = new Buffer(1620);
		for (int i_11_ = 0; i_11_ <= 8; i_11_++) {
			for (int i_12_ = 0; i_12_ <= 8; i_12_++) {
				if (HDToolkit.usingBigEndian) {
					class120_sub7.putFloatAsInt(i_12_ / 8.0F);
					class120_sub7.putFloatAsInt(i_11_ / 8.0F);
					class120_sub7.putFloatAsInt(i_12_ * 128);
					class120_sub7.putFloatAsInt(is[i_12_ + i][i_11_ + i_10_]);
					class120_sub7.putFloatAsInt(i_11_ * 128);
				} else {
					class120_sub7.putFloatAsLEInt(i_12_ / 8.0F);
					class120_sub7.putFloatAsLEInt(i_11_ / 8.0F);
					class120_sub7.putFloatAsLEInt(i_12_ * 128);
					class120_sub7.putFloatAsLEInt(is[i_12_ + i][i_11_ + i_10_]);
					class120_sub7.putFloatAsLEInt(i_11_ * 128);
				}
			}
		}
		if (HDToolkit.vertexBufferAsObject) {
			final ByteBuffer bytebuffer = ByteBuffer.wrap(class120_sub7.buf, 0, class120_sub7.pos);
			aClass104_877 = new VertexBuffer();
			aClass104_877.method885(bytebuffer);
		} else {
			aByteBuffer876 = ByteBuffer.allocateDirect(class120_sub7.pos).order(ByteOrder.nativeOrder());
			aByteBuffer876.put(class120_sub7.buf, 0, class120_sub7.pos);
			aByteBuffer876.flip();
		}
		final Buffer class120_sub7_13_ = new Buffer(1536);
		for (int i_14_ = 0; i_14_ < 8; i_14_++) {
			for (int i_15_ = 0; i_15_ < 8; i_15_++) {
				if (HDToolkit.usingBigEndian) {
					class120_sub7_13_.putInt(i_15_ + (i_14_ + 1) * 9);
					class120_sub7_13_.putInt(i_15_ + i_14_ * 9);
					class120_sub7_13_.putInt(i_15_ + 1 + i_14_ * 9);
					class120_sub7_13_.putInt(i_15_ + (i_14_ + 1) * 9);
					class120_sub7_13_.putInt(i_15_ + 1 + i_14_ * 9);
					class120_sub7_13_.putInt(i_15_ + 1 + (i_14_ + 1) * 9);
				} else {
					class120_sub7_13_.putLEInt(i_15_ + (i_14_ + 1) * 9);
					class120_sub7_13_.putLEInt(i_15_ + i_14_ * 9);
					class120_sub7_13_.putLEInt(i_15_ + 1 + i_14_ * 9);
					class120_sub7_13_.putLEInt(i_15_ + (i_14_ + 1) * 9);
					class120_sub7_13_.putLEInt(i_15_ + 1 + i_14_ * 9);
					class120_sub7_13_.putLEInt(i_15_ + 1 + (i_14_ + 1) * 9);
				}
			}
		}
		if (HDToolkit.vertexBufferAsObject) {
			final ByteBuffer bytebuffer = ByteBuffer.wrap(class120_sub7_13_.buf, 0, class120_sub7_13_.pos);
			aClass104_874 = new VertexBuffer();
			aClass104_874.method884(bytebuffer);
		} else {
			aByteBuffer878 = ByteBuffer.allocateDirect(class120_sub7_13_.pos).order(ByteOrder.nativeOrder());
			aByteBuffer878.put(class120_sub7_13_.buf, 0, class120_sub7_13_.pos);
			aByteBuffer878.flip();
		}
	}

	public static void method779() {
		pixels = null;
	}

	public Class94() {
		final GL gl = HDToolkit.gl;
		final int[] is = new int[1];
		gl.glGenTextures(1, is, 0);
		textureId = is[0];
		MemoryManager.anInt1081 += 16384;
		HDToolkit.bindTexture2D(textureId);
		gl.glTexParameteri(3553, 10241, 9729);//TEXTURE_2D, TEXTURE_MIN_FILTER, LINEAR
		gl.glTexParameteri(3553, 10240, 9729);//TEXTURE_2D, TEXTURE_MAG_FILTER, LINEAR
		gl.glTexParameteri(3553, 10242, 33071);//TEXTURE_2D, TEXTURE_WRAP_S, CLAMP_TO_EDGE
		gl.glTexParameteri(3553, 10243, 33071);//TEXTURE_2D, TEXTURE_WRAP_T, CLAMP_TO_EDGE
	}
}
