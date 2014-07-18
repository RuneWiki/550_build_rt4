/* Class180_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class180_Sub4 extends SceneGraphNode {
	int anInt2922;
	static int[] spriteXOffsets;
	private ParticleEngine aClass108_Sub2_2924;
	private int anInt2925 = 0;
	private final int anInt2926;
	private int anInt2927;
	private boolean aBoolean2928;
	int anInt2929;
	private double aDouble2930;
	static Cache aClass21_2931;
	private final int anInt2932;
	static int anInt2933 = 0;
	int anInt2934;
	private double aDouble2935;
	private int anInt2936 = -1;
	double aDouble2937;
	private boolean aBoolean2938;
	int anInt2939;
	private final int anInt2940;
	private SeqType aClass40_2941;
	private double aDouble2942;
	int anInt2943;
	int anInt2944;
	private int anInt2945 = 0;
	private double aDouble2946;
	private final int anInt2947;
	private final int anInt2948;
	double aDouble2949;
	private double aDouble2950;
	private final int anInt2951;
	private int anInt2952;
	double aDouble2953;
	static JagexInterface aClass189_2954;
	static int anInt2955;

	static {
		aClass21_2931 = new Cache(5);
	}

	final void method2317(final int i, final int i_0_) {
		try {
			this.aDouble2953 += aDouble2942 * i;
			aBoolean2938 = true;
			if (anInt2948 != -1) {
				this.aDouble2937 += i * (aDouble2930 * 0.5 * i) + aDouble2946 * i;
				aDouble2946 += aDouble2930 * i;
			} else {
				this.aDouble2937 += i * aDouble2946;
			}
			this.aDouble2949 += i * aDouble2935;
			this.anInt2944 = 0x7ff & 1024 + (int) (325.949 * Math.atan2(aDouble2935, aDouble2942));
			anInt2927 = 0x7ff & (int) (325.949 * Math.atan2(aDouble2946, aDouble2950));
			if (i_0_ != 1) {
				anInt2955 = 2;
			}
			if (aClass40_2941 != null) {
				anInt2945 += i;
				while (aClass40_2941.cycles[anInt2925] < anInt2945) {
					anInt2945 -= aClass40_2941.cycles[anInt2925];
					anInt2925++;
					if (aClass40_2941.frames.length <= anInt2925) {
						anInt2925 -= aClass40_2941.padding;
						if (anInt2925 < 0 || anInt2925 >= aClass40_2941.frames.length) {
							anInt2925 = 0;
						}
					}
					anInt2936 = anInt2925 + 1;
					if (anInt2936 >= aClass40_2941.frames.length) {
						anInt2936 -= aClass40_2941.padding;
						if (anInt2936 < 0 || aClass40_2941.frames.length <= anInt2936) {
							anInt2936 = -1;
						}
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("oc.E(").append(i).append(',').append(i_0_).append(')').toString());
		}
	}

	@Override
	final void method2265(final int i, final int i_1_, final int i_2_, final int i_3_, final int i_4_, final int i_5_, final int i_6_, final int i_7_, final long l, final int i_8_, final ParticleEngine class108_sub2) {
		try {
			final Class180_Sub7 class180_sub7 = method2322(true);
			if (class180_sub7 != null) {
				method2320(-77, class180_sub7);
				class180_sub7.method2265(i, i_1_, i_2_, i_3_, i_4_, i_5_, i_6_, i_7_, l, i_8_, aClass108_Sub2_2924);
				anInt2952 = class180_sub7.getMaxY();
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("oc.T(").append(i).append(',').append(i_1_).append(',').append(i_2_).append(',').append(i_3_).append(',').append(i_4_).append(',').append(i_5_).append(',').append(i_6_).append(',').append(i_7_).append(',')
					.append(l).append(',').append(i_8_).append(',').append(class108_sub2 != null ? "{...}" : "null").append(')').toString());
		}
	}

	static final boolean method2318(final byte i, final int i_9_) {
		boolean bool;
		try {
			if (AbstractSprite.anInt3619 == i_9_) {
				return false;
			}
			Class120_Sub2.anIntArrayArray2416 = new int[104][104];
			Class179.anIntArrayArray1774 = new int[104][104];
			Class120_Sub12_Sub36.anIntArrayArrayArray3420 = new int[4][13][13];
			Class120_Sub14_Sub14_Sub1.anIntArrayArray3933 = new int[104][104];
			if (i != 25) {
				method2318((byte) 5, -58);
			}
			for (int i_10_ = 0; i_10_ < 4; i_10_++) {
				Class182.collisionMaps[i_10_] = new CollisionMap(104, 104);
			}
			Class114.tileSettings = new byte[4][104][104];
			Class9.aByteArrayArrayArray70 = new byte[4][104][104];
			ClientScript.groundObjects = new Deque[4][104][104];
			if (HDToolkit.glEnabled) {
				LightManager.method1856(4, 104, 104);
				Class47.method382(104, 104);
				IdentityKit.aClass191ArrayArray1337 = new Class191[13][13];
			}
			AbstractSprite.anInt3619 = i_9_;
			bool = true;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("oc.D(").append(i).append(',').append(i_9_).append(')').toString());
		}
		return bool;
	}

	final void method2319(final int i, final int i_11_, final int i_12_, final int i_13_, final int i_14_) {
		try {
			if (!aBoolean2938) {
				final double d = -anInt2926 + i_12_;
				final double d_15_ = -anInt2951 + i_14_;
				final double d_16_ = Math.sqrt(d * d + d_15_ * d_15_);
				this.aDouble2937 = anInt2947;
				this.aDouble2949 = anInt2926 + anInt2932 * d / d_16_;
				this.aDouble2953 = anInt2951 + anInt2932 * d_15_ / d_16_;
			}
			final double d = 1 + this.anInt2922 - i_13_;
			aDouble2935 = (-this.aDouble2949 + i_12_) / d;
			aDouble2942 = (-this.aDouble2953 + i_14_) / d;
			if (i >= -4) {
				method2319(11, -71, -105, -1, 43);
			}
			aDouble2950 = Math.sqrt(aDouble2935 * aDouble2935 + aDouble2942 * aDouble2942);
			if ((anInt2948 ^ 0xffffffff) == 0) {
				aDouble2946 = (-this.aDouble2937 + i_11_) / d;
			} else {
				if (!aBoolean2938) {
					aDouble2946 = -aDouble2950 * Math.tan(anInt2948 * 0.02454369);
				}
				aDouble2930 = 2.0 * (-(aDouble2946 * d) + (-this.aDouble2937 + i_11_)) / (d * d);
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("oc.A(").append(i).append(',').append(i_11_).append(',').append(i_12_).append(',').append(i_13_).append(',').append(i_14_).append(')').toString());
		}
	}

	private final void method2320(final int i, final Class180_Sub7 class180_sub7) {
		try {
			if (HDToolkit.glEnabled) {
				final Class180_Sub7_Sub2 class180_sub7_sub2 = (Class180_Sub7_Sub2) class180_sub7;
				if ((aClass108_Sub2_2924 == null || aClass108_Sub2_2924.aBoolean2356) && (class180_sub7_sub2.aClass158Array3892 != null || class180_sub7_sub2.aClass169Array3858 != null)) {
					aClass108_Sub2_2924 = new ParticleEngine(Class101_Sub2.loopCycle, 1, 1);
				}
				if (aClass108_Sub2_2924 != null) {
					aClass108_Sub2_2924.method962(class180_sub7_sub2.aClass158Array3892, class180_sub7_sub2.aClass169Array3858, false, class180_sub7_sub2.anIntArray3878, class180_sub7_sub2.anIntArray3856, class180_sub7_sub2.anIntArray3845);
				}
			} else {
				final Class180_Sub7_Sub1 class180_sub7_sub1 = (Class180_Sub7_Sub1) class180_sub7;
				if ((aClass108_Sub2_2924 == null || aClass108_Sub2_2924.aBoolean2356) && (class180_sub7_sub1.aClass158Array3788 != null || class180_sub7_sub1.aClass169Array3776 != null)) {
					aClass108_Sub2_2924 = new ParticleEngine(Class101_Sub2.loopCycle, 1, 1);
				}
				if (aClass108_Sub2_2924 != null) {
					aClass108_Sub2_2924.method962(class180_sub7_sub1.aClass158Array3788, class180_sub7_sub1.aClass169Array3776, false, class180_sub7_sub1.xVertices, class180_sub7_sub1.yVertices, class180_sub7_sub1.zVertices);
				}
			}
			aBoolean2928 = true;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("oc.C(").append(i).append(',').append(class180_sub7 != null ? "{...}" : "null").append(')').toString());
		}
	}

	@Override
	final int getMaxY() {
		int i;
		try {
			i = anInt2952;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, "oc.MA()");
		}
		return i;
	}

	public static void method2321(final int i) {
		try {
			spriteXOffsets = null;
			if (i == 13) {
				aClass21_2931 = null;
				aClass189_2954 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("oc.F(").append(i).append(')').toString());
		}
	}

	private final Class180_Sub7 method2322(final boolean bool) {
		Class180_Sub7 class180_sub7;
		try {
			if (!bool) {
				aBoolean2938 = false;
			}
			final SpotAnimType spotAnimType = SpotAnimType.list(anInt2940);
			final Class180_Sub7 class180_sub7_17_ = spotAnimType.method882(anInt2936, anInt2945, anInt2925, (byte) 14);
			if (class180_sub7_17_ == null) {
				return null;
			}
			class180_sub7_17_.method2377(anInt2927);
			class180_sub7 = class180_sub7_17_;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("oc.B(").append(bool).append(')').toString());
		}
		return class180_sub7;
	}

	Class180_Sub4(final int i, final int i_18_, final int i_19_, final int i_20_, final int i_21_, final int i_22_, final int i_23_, final int i_24_, final int i_25_, final int i_26_, final int i_27_) {
		aBoolean2938 = false;
		aBoolean2928 = false;
		anInt2952 = -32768;
		anInt2951 = i_20_;
		anInt2947 = i_21_;
		aBoolean2938 = false;
		anInt2926 = i_19_;
		this.anInt2939 = i_22_;
		anInt2932 = i_25_;
		this.anInt2934 = i_18_;
		this.anInt2922 = i_23_;
		this.anInt2929 = i_26_;
		anInt2940 = i;
		anInt2948 = i_24_;
		this.anInt2943 = i_27_;
		final int i_28_ = SpotAnimType.list(anInt2940).animationId;
		if ((i_28_ ^ 0xffffffff) == 0) {
			aClass40_2941 = null;
		} else {
			aClass40_2941 = SeqType.list(i_28_);
		}
	}

	@Override
	final void method2266(final int i, final int i_29_, final int i_30_, final int i_31_, final int i_32_) {
		try {
			if (!aBoolean2928) {
				final Class180_Sub7 class180_sub7 = method2322(true);
				if (class180_sub7 == null) {
					return;
				}
				method2320(104, class180_sub7);
			}
			if (aClass108_Sub2_2924 != null) {
				aClass108_Sub2_2924.method944(i, i_29_, i_31_, i_30_, i_32_);
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("oc.BB(").append(i).append(',').append(i_29_).append(',').append(i_30_).append(',').append(i_31_).append(',').append(i_32_).append(')').toString());
		}
	}
}
