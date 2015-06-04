/* Class120_Sub9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import javax.media.opengl.GL;

final class HDTile extends Node {
	private int[] anIntArray2500;
	private float[] aFloatArray2501;
	private int anInt2502 = 0;
	private float[] aFloatArray2503;
	private int[] anIntArray2504;
	int anInt2505;
	private int[] anIntArray2506;
	int anInt2507;
	private int anInt2508;
	private static Buffer aClass120_Sub7_2509;
	private static ByteBuffer aByteBuffer2510;
	private final boolean aBoolean2511;
	private VertexBuffer aClass104_2512;
	private static Buffer aClass120_Sub7_2513;
	private int[] anIntArray2514;
	private int anInt2515 = 0;
	boolean blend;
	private final float textureSize;//need new name? TODO
	private static ByteBuffer aByteBuffer2518;
	int anInt2519 = 0;
	int textureId;
	private int[] anIntArray2521;
	private boolean[] aBooleanArray2522;
	private int[][] anIntArrayArray2523;
	private int[] anIntArray2524;
	private Hashtable aClass75_2525;
	private int[][] anIntArrayArray2526;
	int anInt2527;
	private ByteBuffer aByteBuffer2528;
	private float[] aFloatArray2529;
	private float[] aFloatArray2530;
	private int[] anIntArray2531;

	final void method1161() {
		final Buffer class120_sub7 = new Buffer((aBoolean2511 ? 40 : 36) * this.anInt2527);
		for (int i = 0; i < this.anInt2527; i++) {
			if (HDToolkit.usingBigEndian) {
				class120_sub7.putFloatAsInt(anIntArray2506[i]);
				class120_sub7.putFloatAsInt(anIntArray2531[i]);
				class120_sub7.putFloatAsInt(anIntArray2521[i]);
				class120_sub7.putInt(anIntArray2500[i]);
				class120_sub7.putFloatAsInt(aFloatArray2501[i]);
				class120_sub7.putFloatAsInt(aFloatArray2529[i]);
				class120_sub7.putFloatAsInt(aFloatArray2503[i]);
				class120_sub7.putFloatAsInt(anIntArray2506[i] / textureSize);
				class120_sub7.putFloatAsInt(anIntArray2521[i] / textureSize);
				if (aBoolean2511) {
					class120_sub7.putFloatAsInt(aFloatArray2530[i]);
				}
			} else {
				class120_sub7.putFloatAsLEInt(anIntArray2506[i]);
				class120_sub7.putFloatAsLEInt(anIntArray2531[i]);
				class120_sub7.putFloatAsLEInt(anIntArray2521[i]);
				class120_sub7.putInt(anIntArray2500[i]);
				class120_sub7.putFloatAsLEInt(aFloatArray2501[i]);
				class120_sub7.putFloatAsLEInt(aFloatArray2529[i]);
				class120_sub7.putFloatAsLEInt(aFloatArray2503[i]);
				class120_sub7.putFloatAsLEInt(anIntArray2506[i] / textureSize);
				class120_sub7.putFloatAsLEInt(anIntArray2521[i] / textureSize);
				if (aBoolean2511) {
					class120_sub7.putFloatAsLEInt(aFloatArray2530[i]);
				}
			}
		}
		if (HDToolkit.vertexBufferAsObject) {
			final ByteBuffer bytebuffer = ByteBuffer.wrap(class120_sub7.buf, 0, class120_sub7.pos);
			aClass104_2512 = new VertexBuffer();
			aClass104_2512.initData(bytebuffer);
		} else {
			aByteBuffer2528 = ByteBuffer.allocateDirect(class120_sub7.pos).order(ByteOrder.nativeOrder());
			aByteBuffer2528.put(class120_sub7.buf, 0, class120_sub7.pos);
			aByteBuffer2528.flip();
		}
		anIntArray2506 = null;
		anIntArray2531 = null;
		anIntArray2521 = null;
		anIntArray2500 = null;
		aFloatArray2501 = null;
		aFloatArray2529 = null;
		aFloatArray2503 = null;
		aClass75_2525 = null;
		aFloatArray2530 = null;
	}

	final void method1162(final GroundTile[][][] class120_sub18s, final float f, final boolean bool) {
		if (aClass120_Sub7_2509 == null || aClass120_Sub7_2509.buf.length < anInt2508 * 4) {
			aClass120_Sub7_2509 = new Buffer(anInt2508 * 4);
		} else {
			aClass120_Sub7_2509.pos = 0;
		}
		if (aClass120_Sub7_2513 == null || aClass120_Sub7_2513.buf.length < anInt2515 * 4) {
			aClass120_Sub7_2513 = new Buffer(anInt2515 * 4);
		} else {
			aClass120_Sub7_2513.pos = 0;
		}
		if (HDToolkit.usingBigEndian) {
			for (int i = 0; i < anInt2502; i++) {
				final GroundTile class120_sub18 = class120_sub18s[anIntArray2504[i]][anIntArray2514[i]][anIntArray2524[i]];
				if (class120_sub18 != null && class120_sub18.aBoolean2647) {
					final int[] is = anIntArrayArray2523[i];
					Buffer class120_sub7;
					if (this.blend) {
						final int[] is_0_ = anIntArrayArray2526[i];
						if (is_0_ != null) {
							int[] is_2_;
							final int i_1_ = (is_2_ = is_0_).length;
							for (int i_3_ = 0; i_3_ < i_1_; i_3_++) {
								final int i_4_ = is_2_[i_3_];
								aClass120_Sub7_2513.putInt(i_4_);
							}
						}
						class120_sub7 = aBooleanArray2522[i] ? aClass120_Sub7_2513 : aClass120_Sub7_2509;
					} else {
						class120_sub7 = aClass120_Sub7_2509;
					}
					for (int i_5_ = 1; i_5_ < is.length - 1; i_5_++) {
						class120_sub7.putInt(is[0]);
						class120_sub7.putInt(is[i_5_]);
						class120_sub7.putInt(is[i_5_ + 1]);
					}
				}
			}
		} else {
			for (int i = 0; i < anInt2502; i++) {
				final GroundTile class120_sub18 = class120_sub18s[anIntArray2504[i]][anIntArray2514[i]][anIntArray2524[i]];
				if (class120_sub18 != null && class120_sub18.aBoolean2647) {
					final int[] is = anIntArrayArray2523[i];
					Buffer class120_sub7;
					if (this.blend) {
						final int[] is_6_ = anIntArrayArray2526[i];
						if (is_6_ != null) {
							for (int i_9_ = 0; i_9_ < is_6_.length; i_9_++) {
								int i_10_ = is_6_[i_9_];
								aClass120_Sub7_2513.putLEInt(i_10_);
							}
						}
						class120_sub7 = aBooleanArray2522[i] ? aClass120_Sub7_2513 : aClass120_Sub7_2509;
					} else {
						class120_sub7 = aClass120_Sub7_2509;
					}
					for (int i_11_ = 1; i_11_ < is.length - 1; i_11_++) {
						class120_sub7.putLEInt(is[0]);
						class120_sub7.putLEInt(is[i_11_]);
						class120_sub7.putLEInt(is[i_11_ + 1]);
					}
				}
			}
		}
		if (aClass120_Sub7_2509.pos != 0 || aClass120_Sub7_2513.pos != 0) {
			final GL gl = HDToolkit.gl;
			if (this.textureId == -1 || bool) {
				HDToolkit.bindTexture2D(-1);
				Class120_Sub14_Sub13.method1532(0, 0);
			} else {
				Rasterizer.anInterface5_973.method25(this.textureId);
			}
			final int i = aBoolean2511 ? 40 : 36;
			if (aClass104_2512 != null) {
				aClass104_2512.bindArrayBuffer();
				gl.glVertexPointer(3, 5126, i, 0L);
				gl.glColorPointer(4, 5121, i, 12L);
				if (Class120_Sub12_Sub6.highLightingDetail) {
					gl.glNormalPointer(5126, i, 16L);
				}
				gl.glTexCoordPointer(2, 5126, i, 28L);
				if (aBoolean2511) {
					gl.glClientActiveTexture(WaterShader.method164());
					gl.glTexCoordPointer(1, 5126, i, 36L);
					gl.glClientActiveTexture(33984);
				}
			} else {
				if (HDToolkit.vertexBufferAsObject) {
					gl.glBindBufferARB(34962, 0);
				}
				aByteBuffer2528.position(0);
				gl.glVertexPointer(3, 5126, i, aByteBuffer2528);
				aByteBuffer2528.position(12);
				gl.glColorPointer(4, 5121, i, aByteBuffer2528);
				if (Class120_Sub12_Sub6.highLightingDetail) {
					aByteBuffer2528.position(16);
					gl.glNormalPointer(5126, i, aByteBuffer2528);
				}
				aByteBuffer2528.position(28);
				gl.glTexCoordPointer(2, 5126, i, aByteBuffer2528);
				if (aBoolean2511) {
					gl.glClientActiveTexture(WaterShader.method164());
					aByteBuffer2528.position(36);
					gl.glTexCoordPointer(1, 5126, i, aByteBuffer2528);
					gl.glClientActiveTexture(33984);
				}
			}
			if (HDToolkit.vertexBufferAsObject) {
				gl.glBindBufferARB(34963, 0);
			}
			if (aClass120_Sub7_2509.pos != 0) {//tile buffer
				if (aByteBuffer2518 == null || aByteBuffer2518.capacity() < aClass120_Sub7_2509.pos) {
					aByteBuffer2518 = ByteBuffer.allocateDirect(aClass120_Sub7_2509.pos).order(ByteOrder.nativeOrder());
				} else {
					aByteBuffer2518.clear();
				}
				aByteBuffer2518.put(aClass120_Sub7_2509.buf, 0, aClass120_Sub7_2509.pos);
				aByteBuffer2518.flip();
				HDToolkit.method527(f);
				gl.glDrawElements(4, aClass120_Sub7_2509.pos / 4, 5125, aByteBuffer2518);
			}
			if (aClass120_Sub7_2513.pos != 0) {//blended tile buffer
				if (aByteBuffer2510 == null || aByteBuffer2510.capacity() < aClass120_Sub7_2513.pos) {
					aByteBuffer2510 = ByteBuffer.allocateDirect(aClass120_Sub7_2513.pos).order(ByteOrder.nativeOrder());
				} else {
					aByteBuffer2510.clear();
				}
				aByteBuffer2510.put(aClass120_Sub7_2513.buf, 0, aClass120_Sub7_2513.pos);
				aByteBuffer2510.flip();
				HDToolkit.method527(f - 100.0F);
				HDToolkit.disableDepthMask();
				gl.glDrawElements(4, aClass120_Sub7_2513.pos / 4, 5125, aByteBuffer2510);
				HDToolkit.enableDepthMask();
			}
		}
	}

	static final void reset() {
		aClass120_Sub7_2509 = null;
		aClass120_Sub7_2513 = null;
		aByteBuffer2518 = null;
		aByteBuffer2510 = null;
	}

	final int method1165(final int i, final int i_12_, final int i_13_, final int[] is, final int[] is_14_, final boolean bool) {
		if (this.blend) {
			anIntArrayArray2526[anInt2502] = is_14_;
			aBooleanArray2522[anInt2502] = bool;
			if (is_14_ != null) {
				anInt2515 += is_14_.length;
			}
			if (bool) {
				anInt2515 += 3 * (is.length - 2);
			} else {
				anInt2508 += 3 * (is.length - 2);
			}
		} else {
			anInt2508 += 3 * (is.length - 2);
		}
		anIntArray2504[anInt2502] = i;
		anIntArray2514[anInt2502] = i_12_;
		anIntArray2524[anInt2502] = i_13_;
		anIntArrayArray2523[anInt2502] = is;
		return anInt2502++;
	}

	final int method1166(final int i, final int i_15_, final int i_16_, final float f, final float f_17_, final float f_18_, final int i_19_, final float f_20_) {
		long l = 0L;
		if ((i & 0x7f) == 0 || (i_16_ & 0x7f) == 0) {
			l = i + (i_16_ << 16) + ((long) i_19_ << 32);
			final IntegerNode class120_sub32 = (IntegerNode) aClass75_2525.get(l);
			if (class120_sub32 != null) {
				if (i_15_ < anIntArray2531[class120_sub32.value]) {
					anIntArray2531[class120_sub32.value] = i_15_;
				}
				return class120_sub32.value;
			}
		}
		anIntArray2506[this.anInt2527] = i;
		anIntArray2531[this.anInt2527] = i_15_;
		anIntArray2521[this.anInt2527] = i_16_;
		if (aBoolean2511) {
			aFloatArray2530[this.anInt2527] = f_20_;
		}
		aFloatArray2501[this.anInt2527] = f;
		aFloatArray2529[this.anInt2527] = f_17_;
		aFloatArray2503[this.anInt2527] = f_18_;
		anIntArray2500[this.anInt2527] = i_19_;
		if (l != 0L) {
			aClass75_2525.put(new IntegerNode(this.anInt2527), l);
		}
		return this.anInt2527++;
	}

	final void method1167() {
		anIntArray2506 = new int[this.anInt2507];
		anIntArray2531 = new int[this.anInt2507];
		anIntArray2521 = new int[this.anInt2507];
		if (aBoolean2511) {
			aFloatArray2530 = new float[this.anInt2507];
		}
		anIntArray2500 = new int[this.anInt2507];
		aFloatArray2501 = new float[this.anInt2507];
		aFloatArray2529 = new float[this.anInt2507];
		aFloatArray2503 = new float[this.anInt2507];
		anIntArray2514 = new int[this.anInt2519];
		anIntArray2524 = new int[this.anInt2519];
		anIntArray2504 = new int[this.anInt2519];
		anIntArrayArray2523 = new int[this.anInt2519][];
		aClass75_2525 = new Hashtable(Class120_Sub12_Sub17.getFarestBitValue(this.anInt2507));
		if (this.blend) {
			anIntArrayArray2526 = new int[this.anInt2519][];
			aBooleanArray2522 = new boolean[this.anInt2519];
		}
	}

	HDTile(final int i, final float f, final boolean bool, final boolean bool_21_, final int i_22_) {
		anInt2508 = 0;
		this.anInt2507 = 0;
		this.anInt2527 = 0;
		this.textureId = i;
		textureSize = f;
		this.blend = bool;
		aBoolean2511 = bool_21_;
		this.anInt2505 = i_22_;
	}
}
