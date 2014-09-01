/* Class108_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

import javax.media.opengl.GL;

final class ParticleEngine extends ParticleNode {
	static Class9 aClass9_2346;
	static boolean aBoolean2347;
	int anInt2348 = 0;
	private final long startLoopCycle;
	static Particle[] aClass108_Sub3_Sub1Array2350;
	static int anInt2351 = 0;
	private long aLong2352;
	static int anInt2353 = 0;
	static int anInt2354;
	Particle[] aClass108_Sub3_Sub1Array2355;
	boolean aBoolean2356 = false;
	private Class174 aClass174_2357 = new Class174();
	static int anInt2358;
	long aLong2359;
	static int anInt2360;
	private static Class174 aClass174_2361;
	static boolean aBoolean2362;
	static int runningParticleCount;
	static int anInt2364;
	private int anInt2365 = 0;
	Deque aClass105_2366 = new Deque();
	int anInt2367;
	int anInt2368;
	int anInt2369;
	private boolean aBoolean2370 = false;
	private final int sizeZ;
	int anInt2372;
	int anInt2373;
	int anInt2374;
	int anInt2375;
	private final int sizeX;
	int anInt2377;
	static short[][] aShortArrayArray2378;
	int anInt2379;
	static int anInt2380;
	private static Buffer aClass120_Sub7_2381;
	int anInt2382;
	private static boolean[] aBooleanArray2383;
	int anInt2384;
	private int anInt2385 = 0;
	private static boolean[] aBooleanArray2386;
	static short[][] aShortArrayArray2387;
	static int particleSetting;
	static int[] anIntArray2389;
	static int[] anIntArray2390;
	private boolean aBoolean2391 = false;
	private static int anInt2392;
	static float aFloat2393;
	private static ByteBuffer aByteBuffer2394;

	static {
		aBoolean2347 = false;
		anInt2354 = 0;
		aBoolean2362 = false;
		runningParticleCount = 0;
		aClass9_2346 = new Class9(8);
		aBooleanArray2383 = new boolean[8];
		anInt2380 = 0;
		aBooleanArray2386 = new boolean[8];
		particleSetting = 2;
		anInt2392 = 0;
		aClass120_Sub7_2381 = new Buffer(131056);
		aFloat2393 = 1.0F;
	}

	private final void method943(final Class158[] class158s, final boolean bool, final int[] is, final int[] is_0_, final int[] is_1_) {
		for (int i = 0; i < 8; i++) {
			aBooleanArray2386[i] = false;
		}
		while_116_: for (ParticleManager class108_sub1 = (ParticleManager) aClass174_2357.peekFirst(); class108_sub1 != null; class108_sub1 = (ParticleManager) aClass174_2357.peekNext()) {
			if (class158s != null) {
				for (int i = 0; i < class158s.length; i++) {
					if (class108_sub1.aClass158_2322 == class158s[i]) {
						aBooleanArray2386[i] = true;
						class108_sub1.aBoolean2339 = false;
						continue while_116_;
					}
				}
			}
			if (!bool) {
				if (class108_sub1.anInt2333 == 0) {
					class108_sub1.unlink();
					anInt2365--;
				} else {
					class108_sub1.aBoolean2339 = true;
				}
			}
		}
		if (class158s != null) {
			for (int i = 0; i < class158s.length && anInt2365 != 8; i++) {
				if (!aBooleanArray2386[i]) {
					final ParticleManager class108_sub1 = new ParticleManager(class158s[i], this, this.aLong2359);
					aClass174_2357.insertLast(class108_sub1);
					anInt2365++;
					aBooleanArray2386[i] = true;
				}
			}
			for (ParticleManager class108_sub1 = (ParticleManager) aClass174_2357.peekFirst(); class108_sub1 != null; class108_sub1 = (ParticleManager) aClass174_2357.peekNext()) {
				for (int i = 0; i < class158s.length; i++) {
					if (aBooleanArray2386[i] && class158s[i] == class108_sub1.aClass158_2322) {
						class108_sub1.method942(is[class108_sub1.aClass158_2322.anInt1476], is_0_[class108_sub1.aClass158_2322.anInt1485], is[class108_sub1.aClass158_2322.anInt1485], is_0_[class108_sub1.aClass158_2322.anInt1476], is_0_[class108_sub1.aClass158_2322.anInt1484], -74,
								is[class108_sub1.aClass158_2322.anInt1484], is_1_[class108_sub1.aClass158_2322.anInt1484], is_1_[class108_sub1.aClass158_2322.anInt1485], is_1_[class108_sub1.aClass158_2322.anInt1476]);
						break;
					}
				}
			}
		}
	}

	final void method944(final int i, final int i_2_, final int i_3_, final int i_4_, final int i_5_) {
		if (!this.aBoolean2356) {
			if (i != this.anInt2377) {
				for (ParticleManager class108_sub1 = (ParticleManager) aClass174_2357.peekFirst(); class108_sub1 != null; class108_sub1 = (ParticleManager) aClass174_2357.peekNext()) {
					class108_sub1.aBoolean2329 = true;
				}
			}
			aLong2352 = this.aLong2359;
			this.anInt2377 = i;
			this.anInt2374 = i_2_;
			this.anInt2379 = i_3_;
			this.anInt2372 = i_4_;
			this.anInt2368 = i_5_;
		}
	}

	static final void method945(final js5 js5) {
		anInt2353 = 0;
		anInt2354 = 0;
		aClass174_2361 = new Class174();
		aClass108_Sub3_Sub1Array2350 = new Particle[1024];
		Class120_Sub30_Sub2.method1777(js5);
		NpcType.method2208(js5);
	}

	static final void method946() {
		aShortArrayArray2378 = null;
		aShortArrayArray2387 = null;
		anIntArray2389 = null;
		anIntArray2390 = null;
	}

	final void method947() {
		aBoolean2391 = true;
	}

	final void method948(final int i, final int i_6_, final int i_7_, final int i_8_, final int i_9_, final int i_10_, final int i_11_, final int i_12_, final int i_13_) {
		if (!this.aBoolean2356 && aBoolean2370 && HDToolkit.glEnabled) {
			final GL gl = HDToolkit.gl;
			final int i_14_ = DisplayModeInfo.anInt1713;
			final int i_15_ = PlayerAppearance.anInt1367;
			final int i_16_ = Class145.anInt1381;
			method956(i_14_, i_15_, i_16_);
			final int i_17_ = i_13_ * i_9_ - i_11_ * i_8_ >> 16;
			final int i_18_ = i_12_ * i_6_ + i_17_ * i_7_ >> 16;
			final int i_19_ = method954();
			final int i_20_ = i_18_ + (i_19_ * i_7_ + 0 * i_6_ >> 16);
			final int i_21_ = i_18_ + (-i_19_ * i_7_ - (this.anInt2369 - this.anInt2382) * i_6_ >> 16);
			final int i_22_ = i_20_ - i_21_ + 2;
			if (i_22_ >= 1600) {
				if (aBoolean2362) {
					System.out.println(new StringBuilder("Model too big for particles - radixsize:").append(i_22_).append(" maxmodelsize:").append(1600).toString());
				}
				method957();
			} else {
				final ParticleNode class108 = aClass174_2357.head;
				for (ParticleNode class108_23_ = class108.next; class108_23_ != class108; class108_23_ = class108_23_.next) {
					final ParticleManager class108_sub1 = (ParticleManager) class108_23_;
					for (int i_24_ = 0; i_24_ < i_22_; i_24_++) {
						anIntArray2389[i_24_] = 0;
					}
					for (int i_25_ = 0; i_25_ < 32; i_25_++) {
						anIntArray2390[i_25_] = 0;
					}
					anInt2380 = 0;
					final ParticleNode class108_26_ = class108_sub1.aClass174_2337.head;
					for (ParticleNode class108_27_ = class108_26_.next; class108_27_ != class108_26_; class108_27_ = class108_27_.next) {
						final Particle class108_sub3_sub1 = (Particle) class108_27_;
						if (!class108_sub3_sub1.aBoolean3097) {
							final int i_28_ = (class108_sub3_sub1.anInt3087 >> 12) - i_14_;
							final int i_29_ = (class108_sub3_sub1.anInt3088 >> 12) - i_15_;
							int i_30_ = (class108_sub3_sub1.anInt3090 >> 12) - i_16_;
							i_30_ = i_30_ * i_9_ - i_28_ * i_8_ >> 16;
							i_30_ = (i_29_ * i_6_ + i_30_ * i_7_ >> 16) - i_21_;
							if (i_30_ < 0) {
								i_30_ = 0;
							} else if (i_30_ >= i_22_) {
								i_30_ = i_22_ - 1;
							}
							if (anIntArray2389[i_30_] < 32) {
								aShortArrayArray2378[i_30_][anIntArray2389[i_30_]++] = class108_sub3_sub1.aShort3094;
							} else {
								if (anIntArray2389[i_30_] == 32) {
									if (anInt2380 == 32) {
										if (aBoolean2362) {
											System.out.println("Overflowed model-based radix sort");
										}
										continue;
									}
									anIntArray2389[i_30_] += 1 + anInt2380++;
								}
								aShortArrayArray2387[anIntArray2389[i_30_] - 32 - 1][anIntArray2390[anIntArray2389[i_30_] - 32 - 1]++] = class108_sub3_sub1.aShort3094;
							}
						}
					}
					boolean bool = false;
					if (aBoolean2347 && class108_sub1.aClass80_2323.anInt724 != -1) {
						Rasterizer.anInterface5_973.method25(class108_sub1.aClass80_2323.anInt724);
						bool = true;
					} else {
						HDToolkit.bindTexture2D(-1);
					}
					float f = class108_sub1.aClass80_2323.anInt721 * aFloat2393;
					if (f > 64.0F) {
						f = 64.0F;
					}
					gl.glPointSize(f);
					method950(gl, i_22_, bool, class108_sub1.aClass80_2323.aBoolean750);
				}
				method957();
			}
		}
	}

	static final int method949() {
		return particleSetting;
	}

	final void method950(final GL gl, final int i, final boolean bool, final boolean bool_31_) {
		if (!bool_31_ && Class120_Sub12_Sub6.highLightingDetail) {
			gl.glDisable(2896);
		}
		aClass120_Sub7_2381.pos = 0;
		if (HDToolkit.usingBigEndian) {
			for (int i_32_ = i - 1; i_32_ >= 0; i_32_--) {
				final int i_33_ = anIntArray2389[i_32_] > 32 ? 32 : anIntArray2389[i_32_];
				if (i_33_ > 0) {
					for (int i_34_ = i_33_ - 1; i_34_ >= 0; i_34_--) {
						final Particle class108_sub3_sub1 = this.aClass108_Sub3_Sub1Array2355[aShortArrayArray2378[i_32_][i_34_]];
						aClass120_Sub7_2381.putFloatAsInt(class108_sub3_sub1.anInt3087 >> 12);
						aClass120_Sub7_2381.putFloatAsInt(class108_sub3_sub1.anInt3088 >> 12);
						aClass120_Sub7_2381.putFloatAsInt(class108_sub3_sub1.anInt3090 >> 12);
						final int i_35_ = class108_sub3_sub1.color;
						aClass120_Sub7_2381.putByte((byte) (i_35_ >> 16));
						aClass120_Sub7_2381.putByte((byte) (i_35_ >> 8));
						aClass120_Sub7_2381.putByte((byte) i_35_);
						aClass120_Sub7_2381.putByte((byte) (i_35_ >> 24));
					}
					if (anIntArray2389[i_32_] > 32) {
						final int i_36_ = anIntArray2389[i_32_] - 32 - 1;
						for (int i_37_ = anIntArray2390[i_36_] - 1; i_37_ >= 0; i_37_--) {
							final Particle class108_sub3_sub1 = this.aClass108_Sub3_Sub1Array2355[aShortArrayArray2387[i_36_][i_37_]];
							aClass120_Sub7_2381.putFloatAsInt(class108_sub3_sub1.anInt3087 >> 12);
							aClass120_Sub7_2381.putFloatAsInt(class108_sub3_sub1.anInt3088 >> 12);
							aClass120_Sub7_2381.putFloatAsInt(class108_sub3_sub1.anInt3090 >> 12);
							final int i_38_ = class108_sub3_sub1.color;
							aClass120_Sub7_2381.putByte((byte) (i_38_ >> 16));
							aClass120_Sub7_2381.putByte((byte) (i_38_ >> 8));
							aClass120_Sub7_2381.putByte((byte) i_38_);
							aClass120_Sub7_2381.putByte((byte) (i_38_ >> 24));
						}
					}
				}
			}
		} else {
			for (int i_39_ = i - 1; i_39_ >= 0; i_39_--) {
				final int i_40_ = anIntArray2389[i_39_] > 32 ? 32 : anIntArray2389[i_39_];
				if (i_40_ > 0) {
					for (int i_41_ = i_40_ - 1; i_41_ >= 0; i_41_--) {
						final Particle class108_sub3_sub1 = this.aClass108_Sub3_Sub1Array2355[aShortArrayArray2378[i_39_][i_41_]];
						aClass120_Sub7_2381.putFloatAsLEInt(class108_sub3_sub1.anInt3087 >> 12);
						aClass120_Sub7_2381.putFloatAsLEInt(class108_sub3_sub1.anInt3088 >> 12);
						aClass120_Sub7_2381.putFloatAsLEInt(class108_sub3_sub1.anInt3090 >> 12);
						final int i_42_ = class108_sub3_sub1.color;
						aClass120_Sub7_2381.putByte((byte) (i_42_ >> 16));
						aClass120_Sub7_2381.putByte((byte) (i_42_ >> 8));
						aClass120_Sub7_2381.putByte((byte) i_42_);
						aClass120_Sub7_2381.putByte((byte) (i_42_ >> 24));
					}
					if (anIntArray2389[i_39_] > 32) {
						final int i_43_ = anIntArray2389[i_39_] - 32 - 1;
						for (int i_44_ = anIntArray2390[i_43_] - 1; i_44_ >= 0; i_44_--) {
							final Particle class108_sub3_sub1 = this.aClass108_Sub3_Sub1Array2355[aShortArrayArray2387[i_43_][i_44_]];
							aClass120_Sub7_2381.putFloatAsLEInt(class108_sub3_sub1.anInt3087 >> 12);
							aClass120_Sub7_2381.putFloatAsLEInt(class108_sub3_sub1.anInt3088 >> 12);
							aClass120_Sub7_2381.putFloatAsLEInt(class108_sub3_sub1.anInt3090 >> 12);
							final int i_45_ = class108_sub3_sub1.color;
							aClass120_Sub7_2381.putByte((byte) (i_45_ >> 16));
							aClass120_Sub7_2381.putByte((byte) (i_45_ >> 8));
							aClass120_Sub7_2381.putByte((byte) i_45_);
							aClass120_Sub7_2381.putByte((byte) (i_45_ >> 24));
						}
					}
				}
			}
		}
		if (aClass120_Sub7_2381.pos != 0) {
			if (HDToolkit.vertexBufferAsObject) {
				gl.glBindBufferARB(34962, 0);
			}
			if (aByteBuffer2394 == null || aByteBuffer2394.capacity() < aClass120_Sub7_2381.pos) {
				aByteBuffer2394 = ByteBuffer.allocateDirect(aClass120_Sub7_2381.pos).order(ByteOrder.nativeOrder());
			} else {
				aByteBuffer2394.clear();
			}
			aByteBuffer2394.put(aClass120_Sub7_2381.buf, 0, aClass120_Sub7_2381.pos);
			aByteBuffer2394.flip();
			aByteBuffer2394.position(0);
			gl.glVertexPointer(3, 5126, 16, aByteBuffer2394);
			aByteBuffer2394.position(12);
			gl.glColorPointer(4, 5121, 16, aByteBuffer2394);
			gl.glDrawArrays(0, 0, aClass120_Sub7_2381.pos >> 4);
		}
		if (!bool_31_ && Class120_Sub12_Sub6.highLightingDetail) {
			gl.glEnable(2896);
		}
	}

	public static void method951() {
		aClass174_2361 = null;
		aClass108_Sub3_Sub1Array2350 = null;
		aClass9_2346 = null;
		aBooleanArray2386 = null;
		aBooleanArray2383 = null;
		aShortArrayArray2378 = null;
		aShortArrayArray2387 = null;
		anIntArray2389 = null;
		anIntArray2390 = null;
		aClass120_Sub7_2381 = null;
		aByteBuffer2394 = null;
	}

	static final void setParticles(final int i) {
		particleSetting = i;
	}

	final void method953() {
		this.aBoolean2356 = true;
		for (Class120_Sub14_Sub24 class120_sub14_sub24 = (Class120_Sub14_Sub24) this.aClass105_2366.getFront(); class120_sub14_sub24 != null; class120_sub14_sub24 = (Class120_Sub14_Sub24) this.aClass105_2366.getNext()) {
			if (class120_sub14_sub24.aClass169_3659.aClass32_1650.anInt266 == 1) {
				class120_sub14_sub24.unlinkSub();
			}
		}
		this.aClass108_Sub3_Sub1Array2355 = new Particle[8192];
		this.anInt2348 = 0;
		aClass174_2357 = new Class174();
		anInt2365 = 0;
		this.aClass105_2366 = new Deque();
		anInt2385 = 0;
		unlink();
	}

	final int method954() {
		if (this.anInt2373 == this.anInt2384 && this.anInt2367 == this.anInt2375) {
			return 92;
		}
		final int i = this.anInt2373 << 7;
		final int i_46_ = (this.anInt2384 << 7) + 128;
		final int i_47_ = this.anInt2367 << 7;
		final int i_48_ = (this.anInt2375 << 7) + 128;
		final int i_49_ = this.anInt2379 - i;
		final int i_50_ = i_46_ - this.anInt2379;
		if (i_49_ > i_50_) {
			final int i_51_ = this.anInt2368 - i_47_;
			final int i_52_ = i_48_ - this.anInt2368;
			if (i_51_ > i_52_) {
				return (int) (Math.sqrt(i_49_ * i_49_ + i_51_ * i_51_) + 0.99);
			}
			return (int) (Math.sqrt(i_49_ * i_49_ + i_52_ * i_52_) + 0.99);
		}
		final int i_53_ = this.anInt2368 - i_47_;
		final int i_54_ = i_48_ - this.anInt2368;
		if (i_53_ > i_54_) {
			return (int) (Math.sqrt(i_50_ * i_50_ + i_53_ * i_53_) + 0.99);
		}
		return (int) (Math.sqrt(i_50_ * i_50_ + i_54_ * i_54_) + 0.99);
	}

	private final void method955(final int i, final int i_55_) {
		for (Class120_Sub14_Sub24 class120_sub14_sub24 = (Class120_Sub14_Sub24) this.aClass105_2366.getFront(); class120_sub14_sub24 != null; class120_sub14_sub24 = (Class120_Sub14_Sub24) this.aClass105_2366.getNext()) {
			class120_sub14_sub24.anInt3667 = class120_sub14_sub24.anInt3656 + this.anInt2379;
			class120_sub14_sub24.anInt3662 = class120_sub14_sub24.anInt3657 + this.anInt2372;
			class120_sub14_sub24.anInt3660 = class120_sub14_sub24.anInt3663 + this.anInt2368;
			if (this.anInt2377 != 0) {
				final int i_56_ = class120_sub14_sub24.aClass169_3659.aClass32_1650.anInt257;
				final int i_57_ = class120_sub14_sub24.aClass169_3659.aClass32_1650.anInt252;
				class120_sub14_sub24.anInt3664 = i_57_ * i + i_56_ * i_55_ >> 16;
				class120_sub14_sub24.anInt3661 = i_57_ * i_55_ - i_56_ * i >> 16;
			} else {
				class120_sub14_sub24.anInt3664 = class120_sub14_sub24.aClass169_3659.aClass32_1650.anInt257;
				class120_sub14_sub24.anInt3661 = class120_sub14_sub24.aClass169_3659.aClass32_1650.anInt252;
			}
		}
	}

	static final void method956(final int i, final int i_58_, final int i_59_) {
		final GL gl = HDToolkit.gl;
		if (aBoolean2347) {
			gl.glEnable(34913);
			gl.glTexEnvi(34913, 34914, 1);
		}
		gl.glDepthMask(false);
		Class120_Sub14_Sub13.method1532(0, 0);
		gl.glColorMaterial(1028, 4609);
		gl.glMaterialfv(1028, 4608, Class120_Sub12_Sub17.aFloatArray3269, 0);
		if (Class120_Sub12_Sub6.highLightingDetail) {
			gl.glDisableClientState(32885);
		}
		gl.glDisableClientState(32888);
		gl.glPushMatrix();
		gl.glTranslatef(-i, -i_58_, -i_59_);
		gl.glNormal3f(0.0F, -1.0F, 0.0F);
		if (!HDToolkit.aBoolean541) {
			gl.glDisable(2912);
		}
	}

	static final void method957() {
		final GL gl = HDToolkit.gl;
		if (Class120_Sub12_Sub6.highLightingDetail) {
			gl.glEnableClientState(32885);
		}
		gl.glEnableClientState(32888);
		gl.glDepthMask(true);
		gl.glColorMaterial(1028, 5634);
		gl.glPopMatrix();
		if (!HDToolkit.aBoolean541) {
			gl.glEnable(2912);
		}
		if (aBoolean2347) {
			gl.glTexEnvi(34913, 34914, 0);
			gl.glDisable(34913);
		}
	}

	static final void method958() {
		aClass9_2346 = new Class9(8);
		anInt2392 = 0;
		for (ParticleEngine class108_sub2 = (ParticleEngine) aClass174_2361.peekFirst(); class108_sub2 != null; class108_sub2 = (ParticleEngine) aClass174_2361.peekNext()) {
			class108_sub2.method953();
		}
	}

	static final void process(final long l) {
		anInt2351 = anInt2360;
		runningParticleCount = 0;
		anInt2360 = 0;
		final long l_60_ = TimeUtil.getSafeTime();
		for (ParticleEngine class108_sub2 = (ParticleEngine) aClass174_2361.peekFirst(); class108_sub2 != null; class108_sub2 = (ParticleEngine) aClass174_2361.peekNext()) {
			if (class108_sub2.method963(l)) {
				runningParticleCount++;
			}
		}
		if (aBoolean2362 && l % 100L == 0L) {
			System.out.println(new StringBuilder("Particle system count: ").append(aClass174_2361.getCount()).append(", running: ").append(runningParticleCount).append(". Particles: ").append(anInt2360).append(". Time taken: ").append(TimeUtil.getSafeTime() - l_60_).append("ms").toString());
		}
	}

	private final void method960(final Class169[] class169s, final boolean bool, final int[] is, final int[] is_61_, final int[] is_62_) {
		for (int i = 0; i < 8; i++) {
			aBooleanArray2383[i] = false;
		}
		while_118_: for (Class120_Sub14_Sub24 class120_sub14_sub24 = (Class120_Sub14_Sub24) this.aClass105_2366.getFront(); class120_sub14_sub24 != null; class120_sub14_sub24 = (Class120_Sub14_Sub24) this.aClass105_2366.getNext()) {
			if (class169s != null) {
				for (int i = 0; i < class169s.length; i++) {
					if (class120_sub14_sub24.aClass169_3659 == class169s[i]) {
						aBooleanArray2383[i] = true;
						continue while_118_;
					}
				}
			}
			if (!bool) {
				class120_sub14_sub24.unlink();
				anInt2385--;
				if (class120_sub14_sub24.hasPreviousSub()) {
					class120_sub14_sub24.unlinkSub();
					anInt2392--;
				}
			}
		}
		if (class169s != null) {
			for (int i = 0; i < class169s.length && anInt2385 != 8; i++) {
				if (!aBooleanArray2383[i]) {
					Class120_Sub14_Sub24 class120_sub14_sub24 = null;
					if (class169s[i].aClass32_1650.anInt266 == 1 && anInt2392 < 32) {
						class120_sub14_sub24 = new Class120_Sub14_Sub24(class169s[i], this);
						aClass9_2346.method115(class120_sub14_sub24, class169s[i].aClass32_1650.anInt258);
						anInt2392++;
					}
					if (class120_sub14_sub24 == null) {
						class120_sub14_sub24 = new Class120_Sub14_Sub24(class169s[i], this);
					}
					this.aClass105_2366.addLast(class120_sub14_sub24);
					anInt2385++;
					aBooleanArray2383[i] = true;
				}
			}
			for (Class120_Sub14_Sub24 class120_sub14_sub24 = (Class120_Sub14_Sub24) this.aClass105_2366.getFront(); class120_sub14_sub24 != null; class120_sub14_sub24 = (Class120_Sub14_Sub24) this.aClass105_2366.getNext()) {
				for (int i = 0; i < class169s.length; i++) {
					if (aBooleanArray2383[i] && class169s[i] == class120_sub14_sub24.aClass169_3659) {
						class120_sub14_sub24.method1650(-30263, is_62_[class120_sub14_sub24.aClass169_3659.anInt1647], is_61_[class120_sub14_sub24.aClass169_3659.anInt1647], is[class120_sub14_sub24.aClass169_3659.anInt1647]);
						break;
					}
				}
			}
		}
	}

	static final void method961(final int i, final int i_63_) {
		aFloat2393 = i_63_ / 334.0F;
	}

	final void method962(final Class158[] class158s, final Class169[] class169s, final boolean bool, final int[] xVertices, final int[] yVertices, final int[] zVertices) {
		if (!this.aBoolean2356) {
			method943(class158s, bool, xVertices, yVertices, zVertices);
			method960(class169s, bool, xVertices, yVertices, zVertices);
		}
	}

	private final boolean method963(final long l) {
		long l_66_;
		if (startLoopCycle > aLong2352) {
			l_66_ = startLoopCycle;
		} else {
			l_66_ = aLong2352;
		}
		final int i = (int) (this.aLong2359 - l_66_);
		if (i > 750) {
			method953();
			return false;
		}
		if (aLong2352 > 0L) {
			this.anInt2373 = this.anInt2379 - (sizeX << 6) >> 7;
			this.anInt2384 = (this.anInt2379 + (sizeX << 6) >> 7) - 1;
			this.anInt2367 = this.anInt2368 - (sizeZ << 6) >> 7;
			this.anInt2375 = (this.anInt2368 + (sizeZ << 6) >> 7) - 1;
			this.anInt2369 = this.anInt2372;
			if (this.anInt2374 < 3) {
				this.anInt2382 = OverridedJInterface.tileHeightMap[this.anInt2374 + 1][this.anInt2373][this.anInt2367] + OverridedJInterface.tileHeightMap[this.anInt2374 + 1][this.anInt2384][this.anInt2367]
						+ OverridedJInterface.tileHeightMap[this.anInt2374 + 1][this.anInt2373][this.anInt2375] + OverridedJInterface.tileHeightMap[this.anInt2374 + 1][this.anInt2384][this.anInt2375] >> 2;
			} else {
				this.anInt2382 = this.anInt2369 - 1024;
			}
			aBoolean2370 = true;
			final int i_67_ = Rasterizer.sineTable[this.anInt2377];
			final int i_68_ = Rasterizer.cosineTable[this.anInt2377];
			method955(i_67_, i_68_);
			if (aBoolean2391) {
				for (ParticleManager class108_sub1 = (ParticleManager) aClass174_2357.peekFirst(); class108_sub1 != null; class108_sub1 = (ParticleManager) aClass174_2357.peekNext()) {
					for (int i_69_ = 0; i_69_ < class108_sub1.aClass80_2323.anInt740; i_69_++) {
						class108_sub1.method940(1, i_67_, true, i_68_, this.aLong2359);
					}
				}
				aBoolean2391 = false;
			}
			final int i_70_ = (int) (l - this.aLong2359);
			for (ParticleManager class108_sub1 = (ParticleManager) aClass174_2357.peekFirst(); class108_sub1 != null; class108_sub1 = (ParticleManager) aClass174_2357.peekNext()) {
				class108_sub1.method940(i_70_, i_67_, i < 10, i_68_, l);
			}
		}
		this.aLong2359 = l;
		return true;
	}

	static final void method964() {
		final GL gl = HDToolkit.gl;
		if (gl.isExtensionAvailable("GL_ARB_point_parameters")) {
			final float[] fs = { 1.0F, 0.0F, 5.0E-7F };
			gl.glPointParameterfvARB(33065, fs, 0);
			final FloatBuffer floatbuffer = FloatBuffer.allocate(1);
			gl.glGetFloatv(33063, floatbuffer);
			float f = floatbuffer.get(0);
			if (f > 64.0F) {
				f = 64.0F;
			}
			gl.glPointParameterfARB(33062, 1.0F);
			gl.glPointParameterfARB(33063, f);
		}
		if (gl.isExtensionAvailable("GL_ARB_point_sprite")) {
			aBoolean2347 = true;
		}
		aShortArrayArray2378 = new short[1600][32];
		aShortArrayArray2387 = new short[32][768];
		anIntArray2389 = new int[1600];
		anIntArray2390 = new int[32];
	}

	final void method965(final int i, final int i_71_, final int i_72_, final int i_73_, final int i_74_) {
		method944(i, i_71_, i_72_ + DisplayModeInfo.anInt1713, i_73_ + PlayerAppearance.anInt1367, i_74_ + Class145.anInt1381);
	}

	ParticleEngine(final int lc, final int sx, final int sz) {
		sizeX = sx;
		sizeZ = sz;
		this.aClass108_Sub3_Sub1Array2355 = new Particle[8192];
		startLoopCycle = lc;
		aBoolean2391 = true;
		aClass174_2361.insertLast(this);
	}
}
