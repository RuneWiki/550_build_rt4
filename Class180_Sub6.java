/* Class180_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class180_Sub6 extends SceneGraphNode {
	private int anInt3048;
	private final int anInt3049;
	private int anInt3050;
	private final int anInt3051;
	private int anInt3052;
	private final int anInt3053;
	private boolean aBoolean3054 = false;
	private final int anInt3055;
	static Class50 aClass50_3056;
	private int anInt3057;
	private ParticleEngine aClass108_Sub2_3058;
	private int anInt3059;
	private final int anInt3060;
	private int anInt3061;
	static String aString3062 = "Unable to find ";
	private boolean aBoolean3063;
	private final int anInt3064;
	private Class107_Sub1 aClass107_Sub1_3065;
	private boolean aBoolean3066;
	private int anInt3067;
	private int anInt3068;
	private final int anInt3069;
	private SeqType aClass40_3070;
	static Cache aClass21_3071 = new Cache(200);
	private int anInt3072;
	static AbstractSprite[] aClass120_Sub14_Sub19Array3073;
	static int anInt3074 = 0;
	static int[] anIntArray3075 = new int[2];
	static Class188[] aClass188Array3076;

	@Override
	final void method2266(final int i, final int i_0_, final int i_1_, final int i_2_, final int i_3_) {
		try {
			SceneGraphNode sceneGraphNode = null;
			if (HDToolkit.glEnabled) {
				sceneGraphNode = method2350(true, 6335);
			} else {
				method2353(i_3_, -127, i_2_);
			}
			if (!aBoolean3063) {
				if (sceneGraphNode == null) {
					sceneGraphNode = method2357(-67);
				}
				if (sceneGraphNode == null) {
					return;
				}
				method2359(true, sceneGraphNode);
			}
			if (aClass108_Sub2_3058 != null) {
				aClass108_Sub2_3058.method944(i, i_0_, i_2_, i_1_, i_3_);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ri.BB(").append(i).append(',').append(i_0_).append(',').append(i_1_).append(',').append(i_2_).append(',').append(i_3_).append(')').toString());
		}
	}

	@Override
	final void method2265(final int i, final int i_4_, final int i_5_, final int i_6_, final int i_7_, final int i_8_, final int i_9_, final int i_10_, final long l, final int i_11_, final ParticleEngine class108_sub2) {
		try {
			final SceneGraphNode sceneGraphNode = method2357(-104);
			if (sceneGraphNode != null) {
				method2359(true, sceneGraphNode);
				sceneGraphNode.method2265(i, i_4_, i_5_, i_6_, i_7_, i_8_, i_9_, i_10_, l, i_11_, aClass108_Sub2_3058);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception,
					new StringBuilder("ri.T(").append(i).append(',').append(i_4_).append(',').append(i_5_).append(',').append(i_6_).append(',').append(i_7_).append(',').append(i_8_).append(',').append(i_9_).append(',').append(i_10_).append(',').append(l).append(',').append(i_11_).append(',')
							.append(class108_sub2 != null ? "{...}" : "null").append(')').toString());
		}
	}

	private final SceneGraphNode method2350(final boolean bool, final int i) {
		SceneGraphNode sceneGraphNode;
		try {
			final boolean bool_12_ = OverridedJInterface.anIntArrayArrayArray2741 != Class120_Sub12_Sub33.anIntArrayArrayArray3388;
			LocType locType = LocType.list(anInt3064);
			if (locType.childrenIDs != null) {
				locType = locType.handleVarp();
			}
			if (locType == null) {
				if (HDToolkit.glEnabled && !bool_12_) {
					method2354(-61);
				}
				anInt3072 = anInt3052;
				anInt3050 = -1;
				return null;
			}
			if (!aBoolean3054 && locType.myId != anInt3050) {
				method2352(-1, -1);
			}
			final int i_13_ = 0x3 & anInt3055;
			if (i != 6335) {
				aClass188Array3076 = null;
			}
			int i_14_;
			int i_15_;
			if (i_13_ != 1 && i_13_ != 3) {
				i_14_ = locType.anInt1841;
				i_15_ = locType.anInt1827;
			} else {
				i_14_ = locType.anInt1827;
				i_15_ = locType.anInt1841;
			}
			final int i_16_ = (i_15_ >> 1) + anInt3069;
			final int i_17_ = anInt3049 + (1 + i_14_ >> 1);
			final int i_18_ = anInt3049 + (i_14_ >> 1);
			final int i_19_ = anInt3069 - -(1 + i_15_ >> 1);
			method2353(128 * i_16_, -127, 128 * i_18_);
			final boolean bool_20_ = !bool_12_ && locType.aBoolean1823 && (anInt3050 != locType.myId || (anInt3052 != anInt3072 || aClass40_3070 != null && (aClass40_3070.aBoolean340 || Class164.forceTween) && anInt3052 != anInt3057) && Class74.sceneryShadowsType >= 2);
			if (bool && !bool_20_) {
				anInt3072 = anInt3052;
				anInt3050 = locType.myId;
				return null;
			}
			final int i_21_ = (i_14_ << 6) + (anInt3049 << 7);
			int[][] is = null;
			final int i_22_ = (anInt3069 << 7) - -(i_15_ << 6);
			final int[][] is_23_ = OverridedJInterface.anIntArrayArrayArray2741[anInt3060];
			if (!bool_12_) {
				if (anInt3060 < 3) {
					is = OverridedJInterface.anIntArrayArrayArray2741[anInt3060 + 1];
				}
			} else {
				is = Class120_Sub12_Sub33.anIntArrayArrayArray3388[0];
			}
			final int i_24_ = is_23_[i_18_][i_16_] + is_23_[i_17_][i_16_] - -is_23_[i_18_][i_19_] - -is_23_[i_17_][i_19_] >> 2;
			if (HDToolkit.glEnabled && bool_20_) {
				Class47.method387(aClass107_Sub1_3065, anInt3059, anInt3061, anInt3068);
			}
			final boolean bool_25_ = aClass107_Sub1_3065 == null;
			Class88 class88;
			if (aClass40_3070 != null) {
				class88 = locType.method2461(i_21_, is_23_, anInt3052, i ^ 0x70ac, i_22_, i_24_, bool_20_, anInt3055, anInt3051, anInt3048, is, aClass40_3070, bool_25_ ? Class31.aClass107_Sub1_246 : aClass107_Sub1_3065, anInt3057);
			} else {
				class88 = locType.method2453(i_21_, false, anInt3051, i_24_, is_23_, is, bool_20_, anInt3055, i_22_, -115, bool_25_ ? Class31.aClass107_Sub1_246 : aClass107_Sub1_3065);
			}
			if (class88 == null) {
				anInt3072 = anInt3052;
				anInt3050 = locType.myId;
				return null;
			}
			if (HDToolkit.glEnabled && bool_20_) {
				int i_26_ = 0;
				if (bool_25_) {
					Class31.aClass107_Sub1_246 = class88.aClass107_Sub1_830;
				}
				if (anInt3060 != 0) {
					final int[][] is_27_ = OverridedJInterface.anIntArrayArrayArray2741[0];
					i_26_ = i_24_ + -(is_27_[i_18_][i_16_] - -is_27_[i_17_][i_16_] - -is_27_[i_18_][i_19_] - -is_27_[i_17_][i_19_] >> 2);
				}
				final Class107_Sub1 class107_sub1 = class88.aClass107_Sub1_830;
				if (aBoolean3066 && Class47.method391(class107_sub1, i_21_, i_26_, i_22_)) {
					aBoolean3066 = false;
				}
				if (!aBoolean3066) {
					Class47.method389(class107_sub1, i_21_, i_26_, i_22_);
					if (bool_25_) {
						Class31.aClass107_Sub1_246 = null;
					}
					anInt3068 = i_22_;
					aClass107_Sub1_3065 = class107_sub1;
					anInt3061 = i_26_;
					anInt3059 = i_21_;
				}
			}
			anInt3050 = locType.myId;
			anInt3072 = anInt3052;
			sceneGraphNode = class88.aClass180_826;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ri.B(").append(bool).append(',').append(i).append(')').toString());
		}
		return sceneGraphNode;
	}

	public static void method2351(final int i) {
		try {
			if (i != -1) {
				aClass21_3071 = null;
			}
			aString3062 = null;
			aClass50_3056 = null;
			aClass188Array3076 = null;
			aClass120_Sub14_Sub19Array3073 = null;
			aClass21_3071 = null;
			anIntArray3075 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ri.F(").append(i).append(')').toString());
		}
	}

	private final void method2352(final int i, final int i_28_) {
		try {
			int i_29_ = i_28_;
			boolean bool = false;
			if (i_29_ == -1) {
				LocType locType = LocType.list(anInt3064);
				LocType class184_30_ = locType;
				if (locType.childrenIDs != null) {
					locType = locType.handleVarp();
				}
				if (locType == null) {
					return;
				}
				if (locType == class184_30_) {
					class184_30_ = null;
				}
				if (locType.anIntArray1881 != null) {
					if (aClass40_3070 != null && locType.method2468((byte) 54, aClass40_3070.anInt326)) {
						return;
					}
					i_29_ = locType.method2463(-1);
					if (anInt3050 != locType.myId) {
						bool = locType.aBoolean1864;
					}
				} else if ((locType.anInt1836 ^ 0xffffffff) == 0) {
					if (class184_30_ == null || class184_30_.anIntArray1881 == null) {
						if (class184_30_ != null && (class184_30_.anInt1836 ^ 0xffffffff) != 0 && anInt3050 != class184_30_.myId) {
							bool = class184_30_.aBoolean1864;
							i_29_ = class184_30_.anInt1836;
						}
					} else {
						if (aClass40_3070 != null && class184_30_.method2468((byte) 54, aClass40_3070.anInt326)) {
							return;
						}
						i_29_ = class184_30_.method2463(-1);
						if (class184_30_.myId != anInt3050) {
							bool = class184_30_.aBoolean1864;
						}
					}
				} else if (anInt3050 != locType.myId) {
					bool = locType.aBoolean1864;
					i_29_ = locType.anInt1836;
				}
			}
			if (i == i_29_) {
				aClass40_3070 = null;
			} else {
				if (aClass40_3070 != null && aClass40_3070.anInt326 == i_29_) {
					if (aClass40_3070.anInt337 == 0) {
						return;
					}
				} else {
					aClass40_3070 = SeqType.list(i_29_);
				}
				if (bool) {
					anInt3052 = (int) (Math.random() * aClass40_3070.frames.length);
					anInt3048 = 1 - -(int) (aClass40_3070.cycles[anInt3052] * Math.random());
				} else {
					anInt3048 = 1;
					anInt3052 = 0;
				}
				anInt3057 = anInt3052 - -1;
				if (anInt3057 < 0 || aClass40_3070.frames.length <= anInt3057) {
					anInt3057 = -1;
				}
				anInt3067 = -anInt3048 + Class101_Sub2.loopCycle;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ri.E(").append(i).append(',').append(i_28_).append(')').toString());
		}
	}

	private final void method2353(final int i, final int i_31_, final int i_32_) {
		try {
			if (i_31_ > -125) {
				anInt3072 = -99;
			}
			int i_33_;
			while_11_: for (;;) {
				if (aClass40_3070 == null) {
					if (aBoolean3054) {
						return;
					}
					method2352(-1, -1);
					if (aClass40_3070 == null) {
						return;
					}
				}
				i_33_ = Class101_Sub2.loopCycle - anInt3067;
				if (i_33_ > 100 && aClass40_3070.padding > 0) {
					int i_34_;
					for (i_34_ = -aClass40_3070.padding + aClass40_3070.frames.length; anInt3052 < i_34_ && aClass40_3070.cycles[anInt3052] < i_33_; anInt3052++) {
						i_33_ -= aClass40_3070.cycles[anInt3052];
					}
					if (anInt3052 >= i_34_) {
						int i_35_ = 0;
						for (int i_36_ = i_34_; aClass40_3070.frames.length > i_36_; i_36_++) {
							i_35_ += aClass40_3070.cycles[i_36_];
						}
						i_33_ %= i_35_;
					}
					anInt3057 = anInt3052 - -1;
					if (aClass40_3070.frames.length <= anInt3057) {
						anInt3057 -= aClass40_3070.padding;
						if (anInt3057 < 0 || anInt3057 >= aClass40_3070.frames.length) {
							anInt3057 = -1;
						}
					}
				}
				for (;;) {
					if (aClass40_3070.cycles[anInt3052] >= i_33_) {
						break while_11_;
					}
					Class120_Sub12_Sub23.method1323(aClass40_3070, i, i_32_, anInt3052, false, false);
					i_33_ -= aClass40_3070.cycles[anInt3052];
					anInt3052++;
					if (aClass40_3070.frames.length <= anInt3052) {
						anInt3052 -= aClass40_3070.padding;
						if (anInt3052 < 0 || aClass40_3070.frames.length <= anInt3052) {
							aClass40_3070 = null;
							break;
						}
					}
					anInt3057 = 1 + anInt3052;
					if (anInt3057 >= aClass40_3070.frames.length) {
						anInt3057 -= aClass40_3070.padding;
						if (anInt3057 < 0 || aClass40_3070.frames.length <= anInt3057) {
							anInt3057 = -1;
						}
					}
				}
			}
			anInt3048 = i_33_;
			anInt3067 = -i_33_ + Class101_Sub2.loopCycle;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ri.I(").append(i).append(',').append(i_31_).append(',').append(i_32_).append(')').toString());
		}
	}

	final void method2354(final int i) {
		try {
			if (aClass107_Sub1_3065 != null) {
				Class47.method387(aClass107_Sub1_3065, anInt3059, anInt3061, anInt3068);
				aClass107_Sub1_3065 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ri.D(").append(i).append(')').toString());
		}
	}

	static final void method2355(final boolean bool, final int i) {
		try {
			for (Class120_Sub8 class120_sub8 = (Class120_Sub8) Class101_Sub1.aClass105_2266.getFront(); class120_sub8 != null; class120_sub8 = (Class120_Sub8) Class101_Sub1.aClass105_2266.getNext()) {
				if (class120_sub8.aClass120_Sub30_Sub4_2488 != null) {
					Class120_Sub12_Sub22.aClass120_Sub30_Sub3_3299.method1783(class120_sub8.aClass120_Sub30_Sub4_2488);
					class120_sub8.aClass120_Sub30_Sub4_2488 = null;
				}
				if (class120_sub8.aClass120_Sub30_Sub4_2478 != null) {
					Class120_Sub12_Sub22.aClass120_Sub30_Sub3_3299.method1783(class120_sub8.aClass120_Sub30_Sub4_2478);
					class120_sub8.aClass120_Sub30_Sub4_2478 = null;
				}
				class120_sub8.unlink();
			}
			if (bool) {
				for (Class120_Sub8 class120_sub8 = (Class120_Sub8) Class120_Sub12_Sub10.aClass105_3201.getFront(); class120_sub8 != null; class120_sub8 = (Class120_Sub8) Class120_Sub12_Sub10.aClass105_3201.getNext()) {
					if (class120_sub8.aClass120_Sub30_Sub4_2488 != null) {
						Class120_Sub12_Sub22.aClass120_Sub30_Sub3_3299.method1783(class120_sub8.aClass120_Sub30_Sub4_2488);
						class120_sub8.aClass120_Sub30_Sub4_2488 = null;
					}
					class120_sub8.unlink();
				}
				for (Class120_Sub8 class120_sub8 = (Class120_Sub8) Npc.aClass75_3750.getFirst(); class120_sub8 != null; class120_sub8 = (Class120_Sub8) Npc.aClass75_3750.getNext()) {
					if (class120_sub8.aClass120_Sub30_Sub4_2488 != null) {
						Class120_Sub12_Sub22.aClass120_Sub30_Sub3_3299.method1783(class120_sub8.aClass120_Sub30_Sub4_2488);
						class120_sub8.aClass120_Sub30_Sub4_2488 = null;
					}
					class120_sub8.unlink();
				}
			}
			if (i != 14713) {
				aClass188Array3076 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ri.H(").append(bool).append(',').append(i).append(')').toString());
		}
	}

	static final ObjectPile resetObjectPile(final int level, final int x, final int z) {
		final GroundTile groundTile = Class120_Sub1.groundTiles[level][x][z];
		if (groundTile == null) {
			return null;
		}
		final ObjectPile objectPile = groundTile.objectPile;
		groundTile.objectPile = null;
		return objectPile;
	}

	final SceneGraphNode method2357(final int i) {
		SceneGraphNode sceneGraphNode;
		try {
			if (i >= -65) {
				method2351(-126);
			}
			sceneGraphNode = method2350(false, 6335);
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ri.G(").append(i).append(')').toString());
		}
		return sceneGraphNode;
	}

	static final String method2358(String string, final String string_39_, final String string_40_) {
		for (int i_41_ = string.indexOf(string_40_); (i_41_ ^ 0xffffffff) != 0; i_41_ = string.indexOf(string_40_, i_41_ - -string_39_.length())) {
			string = new StringBuilder(string.substring(0, i_41_)).append(string_39_).append(string.substring(i_41_ + string_40_.length())).toString();
		}
		return string;
	}

	@Override
	final int getMaxY() {
		int i;
		try {
			i = anInt3053;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, "ri.MA()");
		}
		return i;
	}

	private final void method2359(final boolean bool, final SceneGraphNode sceneGraphNode) {
		try {
			if (!HDToolkit.glEnabled) {
				final Class180_Sub7_Sub1 class180_sub7_sub1 = (Class180_Sub7_Sub1) sceneGraphNode;
				if ((aClass108_Sub2_3058 == null || aClass108_Sub2_3058.aBoolean2356) && (class180_sub7_sub1.aClass158Array3788 != null || class180_sub7_sub1.aClass169Array3776 != null)) {
					LocType locType = LocType.list(anInt3064);
					if (locType.childrenIDs != null) {
						locType = locType.handleVarp();
					}
					if (locType != null) {
						aClass108_Sub2_3058 = new ParticleEngine(Class101_Sub2.loopCycle, locType.anInt1841, locType.anInt1827);
					}
				}
				if (aClass108_Sub2_3058 != null) {
					aClass108_Sub2_3058.method962(class180_sub7_sub1.aClass158Array3788, class180_sub7_sub1.aClass169Array3776, false, class180_sub7_sub1.xVertices, class180_sub7_sub1.yVertices, class180_sub7_sub1.zVertices);
				}
			} else {
				final Class180_Sub7_Sub2 class180_sub7_sub2 = (Class180_Sub7_Sub2) sceneGraphNode;
				if ((aClass108_Sub2_3058 == null || aClass108_Sub2_3058.aBoolean2356) && (class180_sub7_sub2.aClass158Array3892 != null || class180_sub7_sub2.aClass169Array3858 != null)) {
					LocType locType = LocType.list(anInt3064);
					if (locType.childrenIDs != null) {
						locType = locType.handleVarp();
					}
					if (locType != null) {
						aClass108_Sub2_3058 = new ParticleEngine(Class101_Sub2.loopCycle, locType.anInt1841, locType.anInt1827);
					}
				}
				if (aClass108_Sub2_3058 != null) {
					aClass108_Sub2_3058.method962(class180_sub7_sub2.aClass158Array3892, class180_sub7_sub2.aClass169Array3858, false, class180_sub7_sub2.anIntArray3878, class180_sub7_sub2.anIntArray3856, class180_sub7_sub2.anIntArray3845);
				}
			}
			aBoolean3063 = bool;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ri.J(").append(bool).append(',').append(sceneGraphNode != null ? "{...}" : "null").append(')').toString());
		}
	}

	@Override
	protected final void finalize() {
		try {
			if (aClass108_Sub2_3058 != null) {
				aClass108_Sub2_3058.method953();
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, "ri.finalize()");
		}
	}

	Class180_Sub6(final int i, final int i_42_, final int i_43_, final int i_44_, final int i_45_, final int i_46_, final int i_47_, final boolean bool, final SceneGraphNode sceneGraphNode) {
		anInt3053 = -32768;
		anInt3059 = 0;
		anInt3061 = 0;
		anInt3050 = -1;
		aBoolean3063 = false;
		aBoolean3066 = true;
		aClass107_Sub1_3065 = null;
		anInt3072 = -1;
		anInt3068 = 0;
		anInt3051 = i_42_;
		anInt3049 = i_45_;
		anInt3069 = i_46_;
		anInt3060 = i_44_;
		anInt3055 = i_43_;
		anInt3064 = i;
		if (sceneGraphNode != null) {
			aBoolean3054 = true;
			if (!(sceneGraphNode instanceof Class180_Sub6)) {
				if (HDToolkit.glEnabled) {
					LocType locType = LocType.list(anInt3064);
					if (locType.childrenIDs != null) {
						locType = locType.handleVarp();
					}
					if (locType != null) {
						Buffer.method1094(anInt3049, 0, anInt3055, anInt3060, locType, (byte) 93, 0, anInt3069, anInt3051);
					}
				}
			} else {
				final Class180_Sub6 class180_sub6_48_ = (Class180_Sub6) sceneGraphNode;
				if (HDToolkit.glEnabled) {
					class180_sub6_48_.method2354(124);
				}
				anInt3048 = class180_sub6_48_.anInt3048;
				anInt3052 = class180_sub6_48_.anInt3052;
				anInt3067 = class180_sub6_48_.anInt3067;
				anInt3057 = class180_sub6_48_.anInt3057;
				aClass40_3070 = class180_sub6_48_.aClass40_3070;
			}
		}
		if (aBoolean3054) {
			method2352(-1, i_47_);
		}
		if (HDToolkit.glEnabled && sceneGraphNode != null) {
			method2350(true, 6335);
		}
	}
}
