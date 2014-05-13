/* Class120_Sub12_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Point;

final class Class120_Sub12_Sub6 extends Class120_Sub12 {
	static AbstractSprite[] aClass120_Sub14_Sub19Array3168;
	static boolean highLightingDetail;
	private int anInt3170;
	private int anInt3171 = 20;
	private int anInt3172;
	static int anInt3173 = 0;
	static Class120_Sub14_Sub22 aClass120_Sub14_Sub22_3174;
	private int anInt3175;
	static int anInt3176 = 0;

	static {
		highLightingDetail = true;
	}

	static final AbstractSprite method1224(final int i, final boolean bool, final int i_0_, final boolean bool_1_, final PlayerAppearance playerAppearance, final int i_2_, final int i_3_, final int i_4_, final boolean bool_5_) {
		LDSprite class120_sub14_sub19_sub2;
		try {
			ObjType objType = ObjType.list(i_4_);
			if (i_0_ > 1 && objType.countobj != null) {
				int i_6_ = -1;
				for (int i_7_ = 0; i_7_ < 10; i_7_++) {
					if (objType.countco[i_7_] <= i_0_ && objType.countco[i_7_] != 0) {
						i_6_ = objType.countobj[i_7_];
					}
				}
				if ((i_6_ ^ 0xffffffff) != 0) {
					objType = ObjType.list(i_6_);
				}
			}
			final Class180_Sub7_Sub1 class180_sub7_sub1 = objType.method2117(playerAppearance, 23);
			if (class180_sub7_sub1 == null) {
				return null;
			}
			LDSprite class120_sub14_sub19_sub2_8_ = null;
			if (objType.certtemplate == -1) {
				if ((objType.lenttemplate ^ 0xffffffff) != 0) {
					class120_sub14_sub19_sub2_8_ = (LDSprite) method1224(i, false, i_0_, false, playerAppearance, -101, i_3_, objType.lentlink, true);
					if (class120_sub14_sub19_sub2_8_ == null) {
						return null;
					}
				}
			} else {
				class120_sub14_sub19_sub2_8_ = (LDSprite) method1224(1, false, 10, true, playerAppearance, -93, 0, objType.certlink, true);
				if (class120_sub14_sub19_sub2_8_ == null) {
					return null;
				}
			}
			final int[] is = GraphicsLD.pixels;
			final int i_9_ = GraphicsLD.height;
			final int[] is_10_ = new int[4];
			final int i_11_ = GraphicsLD.width;
			GraphicsLD.method2169(is_10_);
			LDSprite class120_sub14_sub19_sub2_12_ = new LDSprite(36, 32);
			GraphicsLD.init2dCanvas(class120_sub14_sub19_sub2_12_.pixels, 36, 32);
			Rasterizer.method874();
			Rasterizer.method869(16, 16);
			Rasterizer.aBoolean971 = false;
			int i_13_ = objType.zoom2d;
			if (!bool_1_) {
				if (i == 2) {
					i_13_ *= 1.04;
				}
			} else {
				i_13_ = (int) (1.5 * i_13_);
			}
			final int i_14_ = i_13_ * Rasterizer.cosineTable[objType.xan2d] >> 16;
			final int i_15_ = Rasterizer.sineTable[objType.xan2d] * i_13_ >> 16;
			class180_sub7_sub1.method2367(0, objType.yan2d, objType.zan2d, objType.xan2d, objType.xof2d, i_15_ - class180_sub7_sub1.getMaxY() / 2 + objType.yof2d, objType.yof2d + i_14_, -1L);
			if (i >= 1) {
				class120_sub14_sub19_sub2_12_.method1613(1);
				if (i >= 2) {
					class120_sub14_sub19_sub2_12_.method1613(16777215);
				}
				GraphicsLD.init2dCanvas(class120_sub14_sub19_sub2_12_.pixels, 36, 32);
			}
			if (i_3_ != 0) {
				class120_sub14_sub19_sub2_12_.method1607(i_3_);
			}
			if (objType.certtemplate == -1) {
				if (objType.lenttemplate != -1) {
					GraphicsLD.init2dCanvas(class120_sub14_sub19_sub2_8_.pixels, 36, 32);
					class120_sub14_sub19_sub2_12_.method1587(0, 0);
					class120_sub14_sub19_sub2_12_ = class120_sub14_sub19_sub2_8_;
				}
			} else {
				class120_sub14_sub19_sub2_8_.method1587(0, 0);
			}
			if (bool && (objType.stackable == 1 || i_0_ != 1) && i_0_ != -1) {
				Class15.aClass120_Sub14_Sub8_Sub2_99.method1466(Class35.method305(-41, i_0_), 0, 9, 16776960, 1);
			}
			GraphicsLD.init2dCanvas(is, i_11_, i_9_);
			GraphicsLD.method2172(is_10_);
			Rasterizer.method874();
			Rasterizer.aBoolean971 = true;
			if (HDToolkit.glEnabled && !bool_5_) {
				return new HDSprite(class120_sub14_sub19_sub2_12_);
			}
			class120_sub14_sub19_sub2 = class120_sub14_sub19_sub2_12_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("dn.V(").append(i).append(',').append(bool).append(',').append(i_0_).append(',').append(bool_1_).append(',').append(playerAppearance != null ? "{...}" : "null").append(',').append(i_2_).append(',').append(i_3_).append(',')
					.append(i_4_).append(',').append(bool_5_).append(')').toString());
		}
		return class120_sub14_sub19_sub2;
	}

	static final void method1225(int i, final int i_16_) {
		if (!Class38.cursorsEnabled) {
			i = -1;
		}
		if (Class174.currentCursorId != i) {
			if (i != -1) {
				final CursorType cursorType = CursorType.list(i);
				final LDSprite class120_sub14_sub19_sub2 = cursorType.getCursor();
				if (class120_sub14_sub19_sub2 == null) {
					i = -1;
				} else {
					NpcType.gameSignlink.setCursor(new Point(cursorType.hotSpotX, cursorType.hotSpotY), class120_sub14_sub19_sub2.trimHeight, class120_sub14_sub19_sub2.method1609(), class120_sub14_sub19_sub2.trimWidth, Node.canvas);
					Class174.currentCursorId = i;
				}
			}
			if (i == -1 && Class174.currentCursorId != -1) {
				NpcType.gameSignlink.setCursor(new Point(), -1, null, -1, Node.canvas);
				Class174.currentCursorId = -1;
			}
		}
	}

	public Class120_Sub12_Sub6() {
		super(0, true);
		anInt3170 = 0;
		anInt3172 = 1365;
		anInt3175 = 0;
	}

	static final void method1226(final int i, final int i_17_, final int i_18_, final int i_19_, final int i_20_, final int i_21_, final int i_22_, final int i_23_, final int i_24_, final int i_25_, final int i_26_, final int i_27_, final int i_28_) {
		try {
			final Class120_Sub29 class120_sub29 = new Class120_Sub29();
			class120_sub29.anInt2766 = i_22_;
			class120_sub29.anInt2771 = i_19_;
			class120_sub29.anInt2778 = i_27_;
			class120_sub29.anInt2780 = i_28_;
			class120_sub29.anInt2772 = i_20_;
			class120_sub29.anInt2779 = i_21_;
			class120_sub29.anInt2776 = i_24_;
			if (i_23_ >= 70) {
				class120_sub29.anInt2767 = i;
				class120_sub29.anInt2773 = i_18_;
				class120_sub29.anInt2765 = i_26_;
				class120_sub29.anInt2764 = i_17_;
				class120_sub29.anInt2775 = i_25_;
				Class120_Sub14_Sub15.aClass105_3584.addLast(class120_sub29);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("dn.S(").append(i).append(',').append(i_17_).append(',').append(i_18_).append(',').append(i_19_).append(',').append(i_20_).append(',').append(i_21_).append(',').append(i_22_).append(',').append(i_23_).append(',')
					.append(i_24_).append(',').append(i_25_).append(',').append(i_26_).append(',').append(i_27_).append(',').append(i_28_).append(')').toString());
		}
	}

	@Override
	final void method1180(final byte i, final Buffer class120_sub7, final int i_29_) {
		do {
			try {
				final int i_30_ = i_29_;
				while_114_: do {
					while_113_: do {
						do {
							if (i_30_ != 0) {
								if (i_30_ != 1) {
									if (i_30_ != 2) {
										if (i_30_ != 3) {
											break while_114_;
										}
									} else {
										break;
									}
									break while_113_;
								}
							} else {
								anInt3172 = class120_sub7.getUShort();
								break while_114_;
							}
							anInt3171 = class120_sub7.getUShort();
							break while_114_;
						} while (false);
						anInt3175 = class120_sub7.getUShort();
						break while_114_;
					} while (false);
					anInt3170 = class120_sub7.getUShort();
				} while (false);
				if (i != -43) {
					break;
				}
			} catch (final RuntimeException runtimeexception) {
				throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("dn.M(").append(i).append(',').append(class120_sub7 != null ? "{...}" : "null").append(',').append(i_29_).append(')').toString());
			}
		} while (false);
	}

	static final void method1227(final int i) {
		Class78.method670();
		Class157.shaders = new ShaderInterface[i];
		Class157.shaders[1] = new Class72();
		Class157.shaders[2] = new Class60();
		Class157.shaders[3] = new WaterShader();
		Class157.shaders[4] = new Class14();
		Class157.shaders[5] = new Class20();
		Class157.shaders[6] = new Class138();
		Class157.shaders[7] = new Class5();
	}

	public static void method1228(final int i) {
		try {
			aClass120_Sub14_Sub22_3174 = null;
			if (i != 0) {
				aClass120_Sub14_Sub22_3174 = null;
			}
			aClass120_Sub14_Sub19Array3168 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("dn.AA(").append(i).append(')').toString());
		}
	}

	@Override
	final int[] method1187(final int i, final int i_31_) {
		int[] is;
		try {
			final int[] is_32_ = this.aClass30_2563.method258(i_31_, -55);
			if (i != -1735) {
				highLightingDetail = true;
			}
			if (this.aClass30_2563.aBoolean238) {
				for (int i_33_ = 0; Class120_Sub12_Sub7.anInt3178 > i_33_; i_33_++) {
					final int i_34_ = anInt3175 + (Class90.anIntArray849[i_33_] << 12) / anInt3172;
					final int i_35_ = anInt3170 + (Class150.anIntArray1405[i_31_] << 12) / anInt3172;
					final int i_36_ = i_35_;
					int i_37_ = i_35_;
					int i_38_ = i_34_;
					final int i_39_ = i_34_;
					int i_40_ = 0;
					int i_41_ = i_34_ * i_34_ >> 12;
					for (int i_42_ = i_35_ * i_35_ >> 12; i_41_ + i_42_ < 16384 && i_40_ < anInt3171; i_41_ = i_38_ * i_38_ >> 12) {
						i_40_++;
						i_37_ = i_36_ + 2 * (i_37_ * i_38_ >> 12);
						i_38_ = i_39_ + i_41_ + -i_42_;
						i_42_ = i_37_ * i_37_ >> 12;
					}
					is_32_[i_33_] = i_40_ >= -1 + anInt3171 ? 0 : (i_40_ << 12) / anInt3171;
				}
			}
			is = is_32_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("dn.D(").append(i).append(',').append(i_31_).append(')').toString());
		}
		return is;
	}

	static final void method1229(final int[] is, int i, final int i_43_, final int i_44_, final int i_45_, final int i_46_) {
		final GroundTile class120_sub18 = Class120_Sub1.groundTiles[i_44_][i_45_][i_46_];
		if (class120_sub18 != null) {
			final Class141 class141 = class120_sub18.aClass141_2626;
			if (class141 != null) {
				final int i_47_ = class141.anInt1346;
				if (i_47_ != 0) {
					for (int i_48_ = 0; i_48_ < 4; i_48_++) {
						is[i] = i_47_;
						is[i + 1] = i_47_;
						is[i + 2] = i_47_;
						is[i + 3] = i_47_;
						i += i_43_;
					}
				}
			} else {
				final Class168 class168 = class120_sub18.aClass168_2640;
				if (class168 != null) {
					final int i_49_ = class168.anInt1622;
					final int i_50_ = class168.anInt1628;
					final int i_51_ = class168.anInt1638;
					final int i_52_ = class168.anInt1626;
					final int[] is_53_ = Class116.anIntArrayArray1119[i_49_];
					final int[] is_54_ = Class108_Sub3.anIntArrayArray2401[i_50_];
					int i_55_ = 0;
					if (i_51_ != 0) {
						for (int i_56_ = 0; i_56_ < 4; i_56_++) {
							is[i] = is_53_[is_54_[i_55_++]] == 0 ? i_51_ : i_52_;
							is[i + 1] = is_53_[is_54_[i_55_++]] == 0 ? i_51_ : i_52_;
							is[i + 2] = is_53_[is_54_[i_55_++]] == 0 ? i_51_ : i_52_;
							is[i + 3] = is_53_[is_54_[i_55_++]] == 0 ? i_51_ : i_52_;
							i += i_43_;
						}
					} else {
						for (int i_57_ = 0; i_57_ < 4; i_57_++) {
							if (is_53_[is_54_[i_55_++]] != 0) {
								is[i] = i_52_;
							}
							if (is_53_[is_54_[i_55_++]] != 0) {
								is[i + 1] = i_52_;
							}
							if (is_53_[is_54_[i_55_++]] != 0) {
								is[i + 2] = i_52_;
							}
							if (is_53_[is_54_[i_55_++]] != 0) {
								is[i + 3] = i_52_;
							}
							i += i_43_;
						}
					}
				}
			}
		}
	}

	static final void method1230(final int i, final int i_58_) {
		try {
			Class120_Sub14_Sub23.anInt3649 = -1;
			Class69.anInt614 = i_58_;
			if (i != 5) {
				method1229(null, 7, 90, 60, -66, -47);
			}
			Class52.aClass50_476 = null;
			Class120_Sub12_Sub25.anInt3312 = 1;
			Class40.anInt349 = -1;
			StringNode.aBoolean2734 = false;
			Class120_Sub14_Sub14_Sub2.anInt3940 = 0;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("dn.T(").append(i).append(',').append(i_58_).append(')').toString());
		}
	}
}
