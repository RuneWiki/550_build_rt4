/* Class180_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class GameEntity extends SceneGraphNode {
	int spotAnimId;
	static int mapSceneBlueColorModifier;
	int[] walkQueueX = new int[10];
	private boolean aBoolean2959;
	int anInt2960;
	int anInt2961;
	private int anInt2962 = 0;
	int anInt2963;
	int anInt2964;
	int spotAnimHeight;
	private int anInt2966;
	int anInt2967;
	int[] hitsValue;
	int x;
	int anInt2970;
	int spotAnimNextFrame;
	Class150[] aClass150Array2972;
	byte[] aByteArray2973;
	private int anInt2974;
	String textSpoken;
	int anInt2976;
	private int size;
	static int currentBaseX;
	int spotAnimDelay;
	private boolean aBoolean2980;
	int facingEntityIndex;
	int anInt2982;
	int anInt2983;
	int anInt2984;
	int lastUpdateCycle;
	boolean hasMenuAction;
	int anInt2987;
	ParticleEngine aClass108_Sub2_2988;
	int hpBarCycle;
	int anInt2990;
	int[] hitsType;
	boolean aBoolean2992;
	int anInt2993;
	private int anInt2994;
	int anInt2995;
	int anInt2996;
	boolean aBoolean2997;
	int anInt2998;
	int anInt2999;
	int[] hitsCycle;
	int z;
	boolean aBoolean3002;
	int faceZ;
	int anInt3004;
	int y;
	int anInt3006;
	boolean aBoolean3007;
	int anInt3008;
	static int[][] anIntArrayArray3009;
	int anInt3010;
	static String aString3011 = "scroll:";
	int anInt3012;
	int anInt3013;
	private int anInt3014;
	int anInt3015;
	int faceX;
	int anInt3017;
	int maxY;
	int anInt3019;
	int anInt3020;
	int anInt3021;
	int anInt3022;
	int hpBarRatio;
	int textCycle;
	int anInt3026;
	int spotAnimFrame;
	int anInt3028;
	private int anInt3029;
	int anInt3030;
	int anInt3031;
	int anInt3032;
	int anInt3033;
	int anInt3034;
	int anInt3035;
	private int anInt3036;
	int anInt3037;
	int anInt3038;
	private int anInt3039;
	int[] walkQueueZ;
	int anInt3041;
	int anInt3042;
	int anInt3043;
	int anInt3044;
	static int anInt3045;
	int anInt3046;
	Object anObject3047;

	final void method2323(final int x, final int z, final int size, final boolean bool) {
		if (this.anInt3006 != -1 && SeqType.list(this.anInt3006).walkProperties == 1) {
			this.anInt3006 = -1;
		}
		if (this.spotAnimId != -1) {
			final SpotAnimType spotAnimType = SpotAnimType.list(this.spotAnimId);
			if (spotAnimType.aBoolean998 && SeqType.list(spotAnimType.animationId).walkProperties == 1) {
				this.spotAnimId = -1;
			}
		}
		if (!bool) {
			final int i_3_ = x - this.walkQueueX[0];
			final int i_4_ = z - this.walkQueueZ[0];
			if (i_3_ >= -8 && i_3_ <= 8 && i_4_ >= -8 && i_4_ <= 8) {
				if (this.anInt2960 < 9) {
					this.anInt2960++;
				}
				for (int i_5_ = this.anInt2960; i_5_ > 0; i_5_--) {
					this.walkQueueX[i_5_] = this.walkQueueX[i_5_ - 1];
					this.walkQueueZ[i_5_] = this.walkQueueZ[i_5_ - 1];
					this.aByteArray2973[i_5_] = this.aByteArray2973[i_5_ - 1];
				}
				this.walkQueueX[0] = x;
				this.aByteArray2973[0] = (byte) 1;
				this.walkQueueZ[0] = z;
				return;
			}
		}
		this.anInt3031 = 0;
		this.anInt3037 = 0;
		this.walkQueueX[0] = x;
		this.walkQueueZ[0] = z;
		this.x = this.walkQueueX[0] * 128 + 64 * size;
		this.z = this.walkQueueZ[0] * 128 + 64 * size;
		this.anInt2960 = 0;
		if (HDToolkit.glEnabled && this == TileParticleQueue.selfPlayer) {
			ModelParticle.aBoolean1478 = true;
		}
		if (this.aClass108_Sub2_2988 != null) {
			this.aClass108_Sub2_2988.method947();
		}
	}

	abstract int method2325();

	final void addHit(final int damage, final int type, final int cycle) {
		for (int id = 0; id < 4; id++) {
			if (cycle >= this.hitsCycle[id]) {
				this.hitsValue[id] = damage;
				this.hitsType[id] = type;
				this.hitsCycle[id] = cycle + 70;
				break;
			}
		}
	}

	final void method2327(final int i, final AbstractModel class180_sub7) {
		try {
			final Class29 class29 = method2336();
			if (class29.anInt208 != i || class29.anInt209 != 0) {
				int i_10_ = 0;
				int i_11_ = 0;
				if (this.aBoolean2997 && this.anInt3022 != 0) {
					i_11_ = class29.anInt209;
					if (this.anInt3022 < 0) {
						i_10_ = -class29.anInt208;
					} else {
						i_10_ = class29.anInt208;
					}
				}
				if (class29.anInt214 != 0) {
					if (anInt2974 != i_10_) {
						if (anInt3039 > 0 && i_10_ > anInt2966) {
							final int i_12_ = anInt3039 * anInt3039 / (2 * class29.anInt214);
							final int i_13_ = i_10_ + -anInt2966;
							if (i_12_ <= i_13_) {
								aBoolean2959 = true;
								anInt3029 = (-i_12_ + anInt2966 - -i_10_) / 2;
								final int i_14_ = class29.anInt197 * class29.anInt197 / (class29.anInt214 * 2);
								final int i_15_ = -i_14_ + i_10_;
								if (anInt3029 < i_15_) {
									anInt3029 = i_15_;
								}
							} else {
								aBoolean2959 = false;
							}
						} else if (anInt3039 < 0 && anInt2966 > i_10_) {
							final int i_16_ = anInt3039 * anInt3039 / (class29.anInt214 * 2);
							final int i_17_ = i_10_ - anInt2966;
							if (i_17_ >= i_16_) {
								anInt3029 = (i_10_ + i_16_ + anInt2966) / 2;
								final int i_18_ = class29.anInt197 * class29.anInt197 / (class29.anInt214 * 2);
								aBoolean2959 = true;
								final int i_19_ = i_18_ + i_10_;
								if (anInt3029 > i_19_) {
									anInt3029 = i_19_;
								}
							} else {
								aBoolean2959 = false;
							}
						} else {
							aBoolean2959 = false;
						}
						anInt2974 = i_10_;
					}
					if (anInt3039 == 0) {
						final int i_20_ = anInt2974 - anInt2966;
						if (i_20_ > -class29.anInt214 && class29.anInt214 > i_20_) {
							anInt2966 = anInt2974;
						} else {
							final int i_21_ = class29.anInt197 * class29.anInt197 / (class29.anInt214 * 2);
							anInt3029 = (anInt2974 + anInt2966) / 2;
							if (i_20_ < 0) {
								final int i_22_ = anInt2974 + i_21_;
								anInt3039 = -class29.anInt214;
								if (anInt3029 > i_22_) {
									anInt3029 = i_22_;
								}
							} else {
								final int i_23_ = -i_21_ + anInt2974;
								anInt3039 = class29.anInt214;
								if (i_23_ > anInt3029) {
									anInt3029 = i_23_;
								}
							}
							aBoolean2959 = true;
						}
					} else if (anInt3039 <= 0) {
						if (anInt3029 >= anInt2966) {
							aBoolean2959 = false;
						}
						if (!aBoolean2959) {
							anInt3039 += class29.anInt214;
							if (anInt3039 > 0) {
								anInt3039 = 0;
							}
						} else if (anInt3039 > -class29.anInt197) {
							anInt3039 -= class29.anInt214;
						}
					} else {
						if (anInt3029 <= anInt2966) {
							aBoolean2959 = false;
						}
						if (!aBoolean2959) {
							anInt3039 -= class29.anInt214;
							if (anInt3039 < 0) {
								anInt3039 = 0;
							}
						} else if (anInt3039 < class29.anInt197) {
							anInt3039 += class29.anInt214;
						}
					}
					anInt2966 += anInt3039;
					if (anInt2966 != 0) {
						final int i_24_ = 0x7ff & anInt2966 >> 5;
						final int i_25_ = class180_sub7.getMaxY() / 2;
						class180_sub7.translate(0, -i_25_, 0);
						class180_sub7.method2362(i_24_);
						class180_sub7.translate(0, i_25_, 0);
					}
				}
				if (class29.anInt221 != 0) {
					if (i_11_ != anInt3014) {
						if (anInt3036 <= 0 || i_11_ <= anInt2994) {
							if (anInt3036 >= 0 || i_11_ >= anInt2994) {
								aBoolean2980 = false;
							} else {
								final int i_26_ = anInt3036 * anInt3036 / (2 * class29.anInt221);
								final int i_27_ = -anInt2994 + i_11_;
								if (i_26_ > i_27_) {
									aBoolean2980 = false;
								} else {
									aBoolean2980 = true;
									anInt2962 = (i_11_ + i_26_ + anInt2994) / 2;
									final int i_28_ = class29.anInt207 * class29.anInt207 / (class29.anInt221 * 2);
									final int i_29_ = i_28_ + i_11_;
									if (i_29_ < anInt2962) {
										anInt2962 = i_29_;
									}
								}
							}
						} else {
							final int i_30_ = -anInt2994 + i_11_;
							final int i_31_ = anInt3036 * anInt3036 / (2 * class29.anInt221);
							if (i_31_ > i_30_) {
								aBoolean2980 = false;
							} else {
								aBoolean2980 = true;
								final int i_32_ = class29.anInt207 * class29.anInt207 / (class29.anInt221 * 2);
								anInt2962 = (i_11_ + anInt2994 - i_31_) / 2;
								final int i_33_ = -i_32_ + i_11_;
								if (anInt2962 < i_33_) {
									anInt2962 = i_33_;
								}
							}
						}
						anInt3014 = i_11_;
					}
					if (anInt3036 != 0) {
						if (anInt3036 > 0) {
							if (anInt2962 <= anInt2994) {
								aBoolean2980 = false;
							}
							if (aBoolean2980) {
								if (anInt3036 < class29.anInt207) {
									anInt3036 += class29.anInt221;
								}
							} else {
								anInt3036 -= class29.anInt221;
								if (anInt3036 < 0) {
									anInt3036 = 0;
								}
							}
						} else {
							if (anInt2962 >= anInt2994) {
								aBoolean2980 = false;
							}
							if (!aBoolean2980) {
								anInt3036 += class29.anInt221;
								if (anInt3036 > 0) {
									anInt3036 = 0;
								}
							} else if (anInt3036 > -class29.anInt207) {
								anInt3036 -= class29.anInt221;
							}
						}
					} else {
						final int i_34_ = anInt3014 + -anInt2994;
						if (-class29.anInt221 < i_34_ && i_34_ < class29.anInt221) {
							anInt2994 = anInt3014;
						} else {
							anInt2962 = (anInt3014 + anInt2994) / 2;
							final int i_35_ = class29.anInt207 * class29.anInt207 / (class29.anInt221 * 2);
							aBoolean2980 = true;
							if (i_34_ < 0) {
								final int i_36_ = i_35_ + anInt3014;
								if (anInt2962 > i_36_) {
									anInt2962 = i_36_;
								}
								anInt3036 = -class29.anInt221;
							} else {
								anInt3036 = class29.anInt221;
								final int i_37_ = -i_35_ + anInt3014;
								if (anInt2962 < i_37_) {
									anInt2962 = i_37_;
								}
							}
						}
					}
					anInt2994 += anInt3036;
					if (anInt2994 != 0) {
						final int i_38_ = 0x7ff & anInt2994 >> 5;
						final int i_39_ = class180_sub7.getMaxY() / 2;
						class180_sub7.translate(0, -i_39_, 0);
						class180_sub7.method2377(i_38_);
						class180_sub7.translate(0, i_39_, 0);
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("qc.P(").append(i).append(',').append(class180_sub7 != null ? "{...}" : "null").append(')').toString());
		}
	}

	final int getHeight() {
		if (this.maxY == -32768) {
			return 200;
		}
		return -this.maxY;
	}

	final void method2329() {
		this.anInt3031 = 0;
		this.anInt2960 = 0;
	}

	final void move(final int dir, final int type) {
		if (this.anInt3006 != -1 && SeqType.list(this.anInt3006).walkProperties == 1) {
			this.anInt3006 = -1;
		}
		if (this.spotAnimId != -1) {
			final SpotAnimType spotAnimType = SpotAnimType.list(this.spotAnimId);
			if (spotAnimType.aBoolean998 && SeqType.list(spotAnimType.animationId).walkProperties == 1) {
				this.spotAnimId = -1;
			}
		}
		int x = this.walkQueueX[0];
		int z = this.walkQueueZ[0];
		if (dir == 0) {
			x--;
			z++;
		}
		if (dir == 1) {
			z++;
		}
		if (dir == 2) {
			z++;
			x++;
		}
		if (dir == 3) {
			x--;
		}
		if (dir == 4) {
			x++;
		}
		if (dir == 5) {
			x--;
			z--;
		}
		if (dir == 6) {
			z--;
		}
		if (dir == 7) {
			x++;
			z--;
		}
		if (this.anInt2960 < 9) {
			this.anInt2960++;
		}
		for (int i_45_ = this.anInt2960; i_45_ > 0; i_45_--) {
			this.walkQueueX[i_45_] = this.walkQueueX[i_45_ - 1];
			this.walkQueueZ[i_45_] = this.walkQueueZ[i_45_ - 1];
			this.aByteArray2973[i_45_] = this.aByteArray2973[i_45_ - 1];
		}
		this.aByteArray2973[0] = (byte) type;
		this.walkQueueX[0] = x;
		this.walkQueueZ[0] = z;
	}

	public static void method2331() {
		aString3011 = null;
		anIntArrayArray3009 = null;
	}

	boolean isVisible() {
		return false;
	}

	int getSize() {
		return size;
	}

	final void method2334(final AbstractModel abstractModel, final int i) {
		Class159.anInt1488 = 0;
		Class93.anInt867 = 0;
		MouseHandler.anInt1140 = 0;
		final Class29 class29 = method2336();
		final int i_48_ = class29.anInt204;
		final int i_49_ = class29.anInt206;
		if (i_48_ != 0 && i_49_ != 0) {
			final int i_50_ = Rasterizer.sineTable[i];
			final int i_51_ = Rasterizer.cosineTable[i];
			final int i_52_ = -i_48_ / 2;
			final int i_53_ = -i_49_ / 2;
			final int i_54_ = i_51_ * i_53_ - i_52_ * i_50_ >> 16;
			final int i_55_ = i_51_ * i_52_ + i_53_ * i_50_ >> 16;
			final int i_56_ = -i_49_ / 2;
			final int i_57_ = Class22.getTileHeight(i_55_ + this.x, i_54_ + this.z, Class173.gameLevel);
			final int i_58_ = i_48_ / 2;
			final int i_59_ = -i_48_ / 2;
			final int i_60_ = i_50_ * i_56_ - -(i_58_ * i_51_) >> 16;
			final int i_61_ = i_49_ / 2;
			final int i_62_ = i_51_ * i_61_ - i_50_ * i_59_ >> 16;
			final int i_63_ = i_51_ * i_56_ - i_50_ * i_58_ >> 16;
			final int i_64_ = i_59_ * i_51_ + i_50_ * i_61_ >> 16;
			final int i_65_ = Class22.getTileHeight(this.x + i_60_, i_63_ + this.z, Class173.gameLevel);
			final int i_66_ = Class22.getTileHeight(this.x + i_64_, i_62_ + this.z, Class173.gameLevel);
			final int i_67_ = i_48_ / 2;
			final int i_68_ = i_49_ / 2;
			final int i_69_ = i_50_ * i_68_ - -(i_67_ * i_51_) >> 16;
			final int i_70_ = -(i_50_ * i_67_) + i_51_ * i_68_ >> 16;
			final int i_71_ = Class22.getTileHeight(i_69_ + this.x, this.z - -i_70_, Class173.gameLevel);
			final int i_72_ = i_71_ > i_66_ ? i_66_ : i_71_;
			final int i_73_ = i_66_ > i_57_ ? i_57_ : i_66_;
			final int i_74_ = i_57_ < i_65_ ? i_57_ : i_65_;
			final int i_75_ = i_65_ >= i_71_ ? i_71_ : i_65_;
			MouseHandler.anInt1140 = (int) (Math.atan2(i_74_ - i_72_, i_49_) * 325.95) & 0x7ff;
			if (MouseHandler.anInt1140 != 0) {
				abstractModel.method2377(MouseHandler.anInt1140);
			}
			Class159.anInt1488 = (int) (Math.atan2(-i_75_ + i_73_, i_48_) * 325.95) & 0x7ff;
			if (Class159.anInt1488 != 0) {
				abstractModel.method2362(Class159.anInt1488);
			}
			Class93.anInt867 = i_57_ + i_71_;
			if (Class93.anInt867 > i_66_ + i_65_) {
				Class93.anInt867 = i_65_ + i_66_;
			}
			Class93.anInt867 = -this.y + (Class93.anInt867 >> 1);
			if (Class93.anInt867 != 0) {
				abstractModel.translate(0, Class93.anInt867, 0);
			}
		}
	}

	static final boolean method2335(final int i, final int i_76_, final int i_77_, final int i_78_) {
		if (!Class69_Sub1.method618(i, i_76_, i_77_)) {
			return false;
		}
		final int i_79_ = i_76_ << 7;
		final int i_80_ = i_77_ << 7;
		final int i_81_ = OverridedJInterface.tileHeightMap[i][i_76_][i_77_] - 1;
		final int i_82_ = i_81_ - 120;
		final int i_83_ = i_81_ - 230;
		final int i_84_ = i_81_ - 238;
		if (i_78_ < 16) {
			if (i_78_ == 1) {
				if (i_79_ > DisplayModeInfo.anInt1713) {
					if (!Class120_Sub12_Sub34.method1380(i_79_, i_81_, i_80_)) {
						return false;
					}
					if (!Class120_Sub12_Sub34.method1380(i_79_, i_81_, i_80_ + 128)) {
						return false;
					}
				}
				if (i > 0) {
					if (!Class120_Sub12_Sub34.method1380(i_79_, i_82_, i_80_)) {
						return false;
					}
					if (!Class120_Sub12_Sub34.method1380(i_79_, i_82_, i_80_ + 128)) {
						return false;
					}
				}
				if (!Class120_Sub12_Sub34.method1380(i_79_, i_83_, i_80_)) {
					return false;
				}
				if (!Class120_Sub12_Sub34.method1380(i_79_, i_83_, i_80_ + 128)) {
					return false;
				}
				return true;
			}
			if (i_78_ == 2) {
				if (i_80_ < Class145.anInt1381) {
					if (!Class120_Sub12_Sub34.method1380(i_79_, i_81_, i_80_ + 128)) {
						return false;
					}
					if (!Class120_Sub12_Sub34.method1380(i_79_ + 128, i_81_, i_80_ + 128)) {
						return false;
					}
				}
				if (i > 0) {
					if (!Class120_Sub12_Sub34.method1380(i_79_, i_82_, i_80_ + 128)) {
						return false;
					}
					if (!Class120_Sub12_Sub34.method1380(i_79_ + 128, i_82_, i_80_ + 128)) {
						return false;
					}
				}
				if (!Class120_Sub12_Sub34.method1380(i_79_, i_83_, i_80_ + 128)) {
					return false;
				}
				if (!Class120_Sub12_Sub34.method1380(i_79_ + 128, i_83_, i_80_ + 128)) {
					return false;
				}
				return true;
			}
			if (i_78_ == 4) {
				if (i_79_ < DisplayModeInfo.anInt1713) {
					if (!Class120_Sub12_Sub34.method1380(i_79_ + 128, i_81_, i_80_)) {
						return false;
					}
					if (!Class120_Sub12_Sub34.method1380(i_79_ + 128, i_81_, i_80_ + 128)) {
						return false;
					}
				}
				if (i > 0) {
					if (!Class120_Sub12_Sub34.method1380(i_79_ + 128, i_82_, i_80_)) {
						return false;
					}
					if (!Class120_Sub12_Sub34.method1380(i_79_ + 128, i_82_, i_80_ + 128)) {
						return false;
					}
				}
				if (!Class120_Sub12_Sub34.method1380(i_79_ + 128, i_83_, i_80_)) {
					return false;
				}
				if (!Class120_Sub12_Sub34.method1380(i_79_ + 128, i_83_, i_80_ + 128)) {
					return false;
				}
				return true;
			}
			if (i_78_ == 8) {
				if (i_80_ > Class145.anInt1381) {
					if (!Class120_Sub12_Sub34.method1380(i_79_, i_81_, i_80_)) {
						return false;
					}
					if (!Class120_Sub12_Sub34.method1380(i_79_ + 128, i_81_, i_80_)) {
						return false;
					}
				}
				if (i > 0) {
					if (!Class120_Sub12_Sub34.method1380(i_79_, i_82_, i_80_)) {
						return false;
					}
					if (!Class120_Sub12_Sub34.method1380(i_79_ + 128, i_82_, i_80_)) {
						return false;
					}
				}
				if (!Class120_Sub12_Sub34.method1380(i_79_, i_83_, i_80_)) {
					return false;
				}
				if (!Class120_Sub12_Sub34.method1380(i_79_ + 128, i_83_, i_80_)) {
					return false;
				}
				return true;
			}
		}
		if (!Class120_Sub12_Sub34.method1380(i_79_ + 64, i_84_, i_80_ + 64)) {
			return false;
		}
		if (i_78_ == 16) {
			if (!Class120_Sub12_Sub34.method1380(i_79_, i_83_, i_80_ + 128)) {
				return false;
			}
			return true;
		}
		if (i_78_ == 32) {
			if (!Class120_Sub12_Sub34.method1380(i_79_ + 128, i_83_, i_80_ + 128)) {
				return false;
			}
			return true;
		}
		if (i_78_ == 64) {
			if (!Class120_Sub12_Sub34.method1380(i_79_ + 128, i_83_, i_80_)) {
				return false;
			}
			return true;
		}
		if (i_78_ == 128) {
			if (!Class120_Sub12_Sub34.method1380(i_79_, i_83_, i_80_)) {
				return false;
			}
			return true;
		}
		return true;
	}

	final Class29 method2336() {
		final int i_85_ = method2325();
		if (i_85_ != -1) {
			return Class29.list(i_85_);
		}
		return ObjectContainer.aClass29_2620;
	}

	final void method2337(final AbstractModel class180_sub7, final AbstractModel class180_sub7_86_) {
		if (!HDToolkit.glEnabled) {
			final LDModel class180_sub7_sub1 = (LDModel) class180_sub7_86_;
			final LDModel class180_sub7_sub1_87_ = (LDModel) class180_sub7;
			if ((this.aClass108_Sub2_2988 == null || this.aClass108_Sub2_2988.aBoolean2356) && (class180_sub7_sub1_87_.aClass158Array3788 != null || class180_sub7_sub1_87_.aClass169Array3776 != null || class180_sub7_sub1 != null && (class180_sub7_sub1.aClass158Array3788 != null || class180_sub7_sub1.aClass169Array3776 != null))) {
				this.aClass108_Sub2_2988 = new ParticleEngine(Class101_Sub2.loopCycle, getSize(), getSize());
			}
			if (this.aClass108_Sub2_2988 != null) {
				this.aClass108_Sub2_2988.method962(class180_sub7_sub1_87_.aClass158Array3788, class180_sub7_sub1_87_.aClass169Array3776, false, class180_sub7_sub1_87_.xVertices, class180_sub7_sub1_87_.yVertices, class180_sub7_sub1_87_.zVertices);
			}
		} else {
			final HDModel class180_sub7_sub2 = (HDModel) class180_sub7;
			final HDModel class180_sub7_sub2_88_ = (HDModel) class180_sub7_86_;
			if ((this.aClass108_Sub2_2988 == null || this.aClass108_Sub2_2988.aBoolean2356) && (class180_sub7_sub2.aClass158Array3892 != null || class180_sub7_sub2.aClass169Array3858 != null || class180_sub7_sub2_88_ != null && (class180_sub7_sub2_88_.aClass158Array3892 != null || class180_sub7_sub2_88_.aClass169Array3858 != null))) {
				this.aClass108_Sub2_2988 = new ParticleEngine(Class101_Sub2.loopCycle, getSize(), getSize());
			}
			if (this.aClass108_Sub2_2988 != null) {
				this.aClass108_Sub2_2988.method962(class180_sub7_sub2.aClass158Array3892, class180_sub7_sub2.aClass169Array3858, false, class180_sub7_sub2.anIntArray3878, class180_sub7_sub2.anIntArray3856, class180_sub7_sub2.anIntArray3845);
			}
		}
		this.aBoolean3007 = true;
	}

	final void setSize(final int size_) {
		size = size_;
	}

	GameEntity() {
		aBoolean2959 = false;
		this.anInt2963 = 0;
		this.aClass150Array2972 = new Class150[12];
		anInt2974 = 0;
		anInt2966 = 0;
		size = 1;
		this.facingEntityIndex = -1;
		this.hitsType = new int[4];
		this.anInt2983 = 0;
		aBoolean2980 = false;
		anInt2994 = 0;
		this.aBoolean2992 = true;
		this.anInt2984 = 0;
		this.anInt2996 = 0;
		this.anInt2960 = 0;
		this.anInt2982 = -1;
		this.anInt3006 = -1;
		this.anInt3012 = 0;
		this.anInt3013 = -1;
		this.anInt2998 = 0;
		this.anInt3010 = 32;
		this.hasMenuAction = false;
		anInt3014 = 0;
		this.textSpoken = null;
		this.aBoolean2997 = false;
		this.aByteArray2973 = new byte[10];
		this.anInt2993 = 0;
		this.aBoolean3002 = false;
		this.anInt2999 = 0;
		this.anInt3004 = -1;
		this.anInt2987 = 0;
		this.textCycle = 100;
		this.anInt3030 = 0;
		this.anInt2995 = 0;
		this.anInt3031 = 0;
		this.spotAnimId = -1;
		this.anInt2964 = 0;
		this.anInt3021 = -1;
		this.spotAnimNextFrame = -1;
		this.faceX = 0;
		this.spotAnimFrame = 0;
		this.hitsCycle = new int[4];
		this.maxY = -32768;
		this.anInt2976 = 0;
		anInt3039 = 0;
		anInt3036 = 0;
		this.anInt3017 = 0;
		this.hitsValue = new int[4];
		this.hpBarCycle = -1000;
		this.anInt3037 = 0;
		this.walkQueueZ = new int[10];
		anInt3029 = 0;
		this.anInt3022 = 0;
		this.anInt2990 = 0;
		this.lastUpdateCycle = 0;
		this.faceZ = 0;
		this.anInt3042 = 0;
		this.anInt3046 = 0;
		this.anInt3044 = 0;
		this.aBoolean3007 = false;
	}
}
