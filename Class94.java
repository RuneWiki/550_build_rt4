/* Class94 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import javax.media.opengl.GL;

final class Class94 {
	private final int anInt871;
	private int anInt872 = -1;
	private static byte[] aByteArray873 = new byte[16384];
	private Class104 aClass104_874;
	boolean aBoolean875 = true;
	private ByteBuffer aByteBuffer876;
	private Class104 aClass104_877;
	private ByteBuffer aByteBuffer878;

	final boolean method776(final Class107_Sub1 class107_sub1, final int i, final int i_0_) {
		final byte[] is = class107_sub1.aByteArray2306;
		final int i_1_ = class107_sub1.anInt1026;
		int i_2_ = i * 128 + 1 + (i_0_ * 128 + 1) * i_1_;
		int i_3_ = 0;
		for (int i_4_ = -128; i_4_ < 0; i_4_++) {
			i_3_ = (i_3_ << 8) - i_3_;
			for (int i_5_ = -128; i_5_ < 0; i_5_++) {
				if (is[i_2_++] != 0) {
					i_3_++;
				}
			}
			i_2_ += i_1_ - 128;
		}
		if (i_3_ == anInt872) {
			return false;
		}
		anInt872 = i_3_;
		i_2_ = i * 128 + 1 + (i_0_ * 128 + 1) * i_1_;
		int i_6_ = 0;
		for (int i_7_ = -128; i_7_ < 0; i_7_++) {
			for (int i_8_ = -128; i_8_ < 0; i_8_++) {
				if (is[i_2_] != 0) {
					aByteArray873[i_6_++] = (byte) 68;
				} else {
					int i_9_ = 0;
					if (is[i_2_ - 1] != 0) {
						i_9_++;
					}
					if (is[i_2_ + 1] != 0) {
						i_9_++;
					}
					if (is[i_2_ - i_1_] != 0) {
						i_9_++;
					}
					if (is[i_2_ + i_1_] != 0) {
						i_9_++;
					}
					aByteArray873[i_6_++] = (byte) (17 * i_9_);
				}
				i_2_++;
			}
			i_2_ += i_1_ - 128;
		}
		final GL gl = HDToolkit.gl;
		final ByteBuffer bytebuffer = ByteBuffer.wrap(aByteArray873);
		bytebuffer.limit(16384);
		HDToolkit.method514(anInt871);
		gl.glTexImage2D(3553, 0, 6406, 128, 128, 0, 6406, 5121, bytebuffer);
		return true;
	}

	final void method777() {
		final GL gl = HDToolkit.gl;
		HDToolkit.method514(anInt871);
		if (aClass104_877 != null) {
			aClass104_877.method887();
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
			aClass104_874.method886();
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
				if (HDToolkit.isBigEndian) {
					class120_sub7.method1106(true, i_12_ / 8.0F);
					class120_sub7.method1106(true, i_11_ / 8.0F);
					class120_sub7.method1106(true, i_12_ * 128);
					class120_sub7.method1106(true, is[i_12_ + i][i_11_ + i_10_]);
					class120_sub7.method1106(true, i_11_ * 128);
				} else {
					class120_sub7.method1134(i_12_ / 8.0F, -2503);
					class120_sub7.method1134(i_11_ / 8.0F, -2503);
					class120_sub7.method1134(i_12_ * 128, -2503);
					class120_sub7.method1134(is[i_12_ + i][i_11_ + i_10_], -2503);
					class120_sub7.method1134(i_11_ * 128, -2503);
				}
			}
		}
		if (HDToolkit.vertexBufferAsObject) {
			final ByteBuffer bytebuffer = ByteBuffer.wrap(class120_sub7.buf, 0, class120_sub7.pos);
			aClass104_877 = new Class104();
			aClass104_877.method885(bytebuffer);
		} else {
			aByteBuffer876 = ByteBuffer.allocateDirect(class120_sub7.pos).order(ByteOrder.nativeOrder());
			aByteBuffer876.put(class120_sub7.buf, 0, class120_sub7.pos);
			aByteBuffer876.flip();
		}
		final Buffer class120_sub7_13_ = new Buffer(1536);
		for (int i_14_ = 0; i_14_ < 8; i_14_++) {
			for (int i_15_ = 0; i_15_ < 8; i_15_++) {
				if (HDToolkit.isBigEndian) {
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
			aClass104_874 = new Class104();
			aClass104_874.method884(bytebuffer);
		} else {
			aByteBuffer878 = ByteBuffer.allocateDirect(class120_sub7_13_.pos).order(ByteOrder.nativeOrder());
			aByteBuffer878.put(class120_sub7_13_.buf, 0, class120_sub7_13_.pos);
			aByteBuffer878.flip();
		}
	}

	public static void method779() {
		aByteArray873 = null;
	}

	public Class94() {
		final GL gl = HDToolkit.gl;
		final int[] is = new int[1];
		gl.glGenTextures(1, is, 0);
		anInt871 = is[0];
		Class113.anInt1081 += 16384;
		HDToolkit.method514(anInt871);
		gl.glTexParameteri(3553, 10241, 9729);
		gl.glTexParameteri(3553, 10240, 9729);
		gl.glTexParameteri(3553, 10242, 33071);
		gl.glTexParameteri(3553, 10243, 33071);
	}
}
