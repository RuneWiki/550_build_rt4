/* Class133 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;

import javax.media.opengl.GL;

final class Class133 {
	int anInt1260;
	private ByteBuffer aByteBuffer1261;
	int anInt1262;
	private ByteBuffer aByteBuffer1263;
	private byte[] aByteArray1264;
	private byte[] aByteArray1265;
	private VertexBuffer aClass104_1266;
	int anInt1267;
	private int[] anIntArray1268;
	private int[] anIntArray1269;
	private VertexBuffer aClass104_1270;
	int anInt1271;
	private int[] anIntArray1272;
	private Hashtable aClass75_1273;
	private byte[] aByteArray1274;
	private int[] anIntArray1275;

	final void method1944(final int[] is) {
		for (int i = 1; i < is.length - 1; i++) {
			anIntArray1269[this.anInt1271++] = is[0];
			anIntArray1269[this.anInt1271++] = is[i];
			anIntArray1269[this.anInt1271++] = is[i + 1];
		}
	}

	final void method1945() {
		anIntArray1269 = new int[this.anInt1262];
		anIntArray1275 = new int[this.anInt1260];
		anIntArray1272 = new int[this.anInt1260];
		anIntArray1268 = new int[this.anInt1260];
		aByteArray1264 = new byte[this.anInt1260];
		aByteArray1265 = new byte[this.anInt1260];
		aByteArray1274 = new byte[this.anInt1260];
		aClass75_1273 = new Hashtable(Class120_Sub12_Sub17.getFarestBitValue(this.anInt1260));
	}

	final void method1946() {
		final GL gl = HDToolkit.gl;
		if (HDToolkit.vertexBufferAsObject) {
			aClass104_1266.bindArrayBuffer();
			gl.glInterleavedArrays(10787, 16, 0L);
			HDToolkit.aBoolean536 = false;
			aClass104_1270.bindElementArrayBuffer();
			gl.glDrawElements(4, this.anInt1271, 5125, 0L);
		} else {
			if (HDToolkit.vertexBufferAsObject) {
				gl.glBindBufferARB(34962, 0);
				gl.glBindBufferARB(34963, 0);
			}
			gl.glInterleavedArrays(10787, 16, aByteBuffer1261);
			HDToolkit.aBoolean536 = false;
			gl.glDrawElements(4, this.anInt1271, 5125, aByteBuffer1263);
		}
	}

	final void method1947() {
		final Buffer class120_sub7 = new Buffer(this.anInt1271 * 4);
		final Buffer class120_sub7_0_ = new Buffer(this.anInt1267 * 16);
		if (HDToolkit.usingBigEndian) {
			for (int i = 0; i < this.anInt1267; i++) {
				class120_sub7_0_.putByte(aByteArray1264[i]);
				class120_sub7_0_.putByte(aByteArray1265[i]);
				class120_sub7_0_.putByte(aByteArray1274[i]);
				class120_sub7_0_.putByte(255);
				class120_sub7_0_.putFloatAsInt(anIntArray1275[i]);
				class120_sub7_0_.putFloatAsInt(anIntArray1272[i]);
				class120_sub7_0_.putFloatAsInt(anIntArray1268[i]);
			}
			for (int i = 0; i < this.anInt1271; i++) {
				class120_sub7.putInt(anIntArray1269[i]);
			}
		} else {
			for (int i = 0; i < this.anInt1267; i++) {
				class120_sub7_0_.putByte(aByteArray1264[i]);
				class120_sub7_0_.putByte(aByteArray1265[i]);
				class120_sub7_0_.putByte(aByteArray1274[i]);
				class120_sub7_0_.putByte(255);
				class120_sub7_0_.putFloatAsLEInt(anIntArray1275[i]);
				class120_sub7_0_.putFloatAsLEInt(anIntArray1272[i]);
				class120_sub7_0_.putFloatAsLEInt(anIntArray1268[i]);
			}
			for (int i = 0; i < this.anInt1271; i++) {
				class120_sub7.putLEInt(anIntArray1269[i]);
			}
		}
		if (HDToolkit.vertexBufferAsObject) {
			aClass104_1266 = new VertexBuffer();
			ByteBuffer bytebuffer = ByteBuffer.wrap(class120_sub7_0_.buf);
			aClass104_1266.method885(bytebuffer);
			aClass104_1270 = new VertexBuffer();
			bytebuffer = ByteBuffer.wrap(class120_sub7.buf);
			aClass104_1270.method884(bytebuffer);
		} else {
			aByteBuffer1261 = ByteBuffer.allocateDirect(class120_sub7_0_.pos);
			aByteBuffer1261.put(class120_sub7_0_.buf);
			aByteBuffer1261.flip();
			aByteBuffer1263 = ByteBuffer.allocateDirect(class120_sub7.pos);
			aByteBuffer1263.put(class120_sub7.buf);
			aByteBuffer1263.flip();
		}
		anIntArray1275 = null;
		anIntArray1272 = null;
		anIntArray1268 = null;
		aByteArray1264 = null;
		aByteArray1265 = null;
		aByteArray1274 = null;
		anIntArray1269 = null;
		aClass75_1273 = null;
	}

	final int method1948(final Light light, final int i, final int i_1_, final int i_2_, final float f, final float f_3_, final float f_4_) {
		long l = 0L;
		if ((i & 0x7f) == 0 || (i_2_ & 0x7f) == 0) {
			l = i + (i_2_ << 16);
			final IntegerNode class120_sub32 = (IntegerNode) aClass75_1273.get(l);
			if (class120_sub32 != null) {
				return class120_sub32.value;
			}
		}
		final int i_5_ = light.color;
		float f_6_ = light.x - i;
		float f_7_ = light.y - i_1_;
		float f_8_ = light.z - i_2_;
		final float f_9_ = (float) Math.sqrt(f_6_ * f_6_ + f_7_ * f_7_ + f_8_ * f_8_);
		final float f_10_ = 1.0F / f_9_;
		f_6_ *= f_10_;
		f_7_ *= f_10_;
		f_8_ *= f_10_;
		final float f_11_ = f_9_ / ((light.anInt370 << 7) + 64);
		float f_12_ = 1.0F - f_11_ * f_11_;
		if (f_12_ < 0.0F) {
			f_12_ = 0.0F;
		}
		float f_13_ = f_6_ * f + f_7_ * f_3_ + f_8_ * f_4_;
		if (f_13_ < 0.0F) {
			f_13_ = 0.0F;
		}
		float f_14_ = f_13_ * f_12_ * 2.0F;
		if (f_14_ > 1.0F) {
			f_14_ = 1.0F;
		}
		int i_15_ = (int) (f_14_ * (i_5_ >> 16 & 0xff));
		if (i_15_ > 255) {
			i_15_ = 255;
		}
		int i_16_ = (int) (f_14_ * (i_5_ >> 8 & 0xff));
		if (i_16_ > 255) {
			i_16_ = 255;
		}
		int i_17_ = (int) (f_14_ * (i_5_ & 0xff));
		if (i_17_ > 255) {
			i_17_ = 255;
		}
		aByteArray1264[this.anInt1267] = (byte) i_15_;
		aByteArray1265[this.anInt1267] = (byte) i_16_;
		aByteArray1274[this.anInt1267] = (byte) i_17_;
		anIntArray1275[this.anInt1267] = i;
		anIntArray1272[this.anInt1267] = i_1_;
		anIntArray1268[this.anInt1267] = i_2_;
		aClass75_1273.put(new IntegerNode(this.anInt1267), l);
		return this.anInt1267++;
	}

	public Class133() {
		/* empty */
	}
}
