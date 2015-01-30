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

	static final AbstractSprite method1224(final PlayerAppearance playerAppearance, int outlineType, final int objCount, int shadow, final int objId, final boolean drawAmount, final boolean shrink, final boolean useHDSprite) {
		ObjType objType = ObjType.list(objId);
		if (objCount > 1 && objType.countobj != null) {
			int countObjId = -1;
			for (int id = 0; id < 10; id++) {
				if (objType.countcounts[id] <= objCount && objType.countcounts[id] != 0) {
					countObjId = objType.countobj[id];
				}
			}
			if (countObjId != -1) {
				objType = ObjType.list(countObjId);
			}
		}
		final LDModel objModel = objType.method2117(playerAppearance);
		if (objModel == null) {
			return null;
		}
		LDSprite certLentTemplateSprite = null;
		if (objType.certtemplate != -1) {
			certLentTemplateSprite = (LDSprite) method1224(playerAppearance, 1, 10, 0, objType.certlink, false, true, true);
			if (certLentTemplateSprite == null) {
				return null;
			}
		} else if (objType.lenttemplate != -1) {
			certLentTemplateSprite = (LDSprite) method1224(playerAppearance, outlineType, objCount, shadow, objType.lentlink, false, false, true);
			if (certLentTemplateSprite == null) {
				return null;
			}
		}
		final int[] pixels = GraphicsLD.pixels;
		final int width = GraphicsLD.width;
		final int height = GraphicsLD.height;
		final int[] bounds = new int[4];
		GraphicsLD.copyBounds(bounds);
		LDSprite objSprite = new LDSprite(36, 32);
		GraphicsLD.init2dCanvas(objSprite.pixels, 36, 32);
		Rasterizer.calculateByBounds();
		Rasterizer.method869(16, 16);
		Rasterizer.aBoolean971 = false;
		int zoom = objType.zoom2d;
		if (shrink) {
			zoom = (int) (1.5 * zoom);
		} else if (outlineType == 2) {
			zoom *= 1.04;
		}
		final int i_14_ = Rasterizer.cosineTable[objType.xan2d] * zoom >> 16;
		final int i_15_ = Rasterizer.sineTable[objType.xan2d] * zoom >> 16;
		objModel.method2367(0, objType.yan2d, objType.zan2d, objType.xan2d, objType.xof2d, i_15_ - objModel.getMaxY() / 2 + objType.yof2d, objType.yof2d + i_14_, -1L);
		if (outlineType >= 1) {
			objSprite.outline(1);
			if (outlineType >= 2) {
				objSprite.outline(16777215);
			}
			GraphicsLD.init2dCanvas(objSprite.pixels, 36, 32);
		}
		if (shadow != 0) {
			objSprite.shadow(shadow);
		}
		if (objType.certtemplate != -1) {
			certLentTemplateSprite.method1587(0, 0);
		} else if (objType.lenttemplate != -1) {
			GraphicsLD.init2dCanvas(certLentTemplateSprite.pixels, 36, 32);
			objSprite.method1587(0, 0);
			objSprite = certLentTemplateSprite;
		}
		if (drawAmount && (objType.stackable == 1 || objCount != 1) && objCount != -1) {
			Class15.objSmallFont.method1466(NodeCache.formatObjCount(objCount), 0, 9, 16776960, 1);
		}
		GraphicsLD.init2dCanvas(pixels, width, height);
		GraphicsLD.setBounds(bounds);
		Rasterizer.calculateByBounds();
		Rasterizer.aBoolean971 = true;
		if (HDToolkit.glEnabled && !useHDSprite) {
			return new HDSprite(objSprite);
		}
		return objSprite;
	}

	static final void setCursor(int i) {
		if (!Class38.cursorsEnabled) {
			i = -1;
		}
		if (Class174.currentCursorId != i) {
			if (i != -1) {
				final CursorType cursorType = CursorType.list(i);
				final LDSprite cursorSprite = cursorType.getCursorSprite();
				if (cursorSprite == null) {
					i = -1;
				} else {
					NpcType.gameSignlink.setCursor(new Point(cursorType.hotSpotX, cursorType.hotSpotY), cursorSprite.trimHeight, cursorSprite.method1609(), cursorSprite.trimWidth, Node.canvas);
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
			throw EnumType.method1428(runtimeexception, new StringBuilder("dn.S(").append(i).append(',').append(i_17_).append(',').append(i_18_).append(',').append(i_19_).append(',').append(i_20_).append(',').append(i_21_).append(',').append(i_22_).append(',').append(i_23_).append(',')
					.append(i_24_).append(',').append(i_25_).append(',').append(i_26_).append(',').append(i_27_).append(',').append(i_28_).append(')').toString());
		}
	}

	@Override
	final void decode(final Buffer buffer, final int i_30_) {
		do {
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
							anInt3172 = buffer.getUShort();
							break while_114_;
						}
						anInt3171 = buffer.getUShort();
						break while_114_;
					} while (false);
					anInt3175 = buffer.getUShort();
					break while_114_;
				} while (false);
				anInt3170 = buffer.getUShort();
			} while (false);
		} while (false);
	}

	static final void method1227(final int i) {
		Class78.method670();
		Class157.shaders = new ShaderInterface[i];
		Class157.shaders[1] = new Class72();
		Class157.shaders[2] = new LavaShader();
		Class157.shaders[3] = new WaterShader();
		Class157.shaders[4] = new Class14();
		Class157.shaders[5] = new WaterfallShader();
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
			throw EnumType.method1428(runtimeexception, new StringBuilder("dn.AA(").append(i).append(')').toString());
		}
	}

	@Override
	final int[] method1187(final int i_31_) {
		final int[] is_32_ = this.aClass30_2563.method258(i_31_);
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
		return is_32_;
	}

	static final void method1229(final int[] pixels, int pixelPos, final int pixelStep, final int x, final int z, final int level) {
		final GroundTile groundTile = LabelGroup.groundTiles[level][x][z];
		if (groundTile != null) {
			final PlainTile plainTile = groundTile.plainTile;
			if (plainTile != null) {
				final int i_47_ = plainTile.anInt1346;
				if (i_47_ != 0) {
					for (int i_48_ = 0; i_48_ < 4; i_48_++) {
						pixels[pixelPos] = i_47_;
						pixels[pixelPos + 1] = i_47_;
						pixels[pixelPos + 2] = i_47_;
						pixels[pixelPos + 3] = i_47_;
						pixelPos += pixelStep;
					}
				}
			} else {
				final ShapedTile shapedTile = groundTile.shapedTile;
				if (shapedTile != null) {
					final int i_49_ = shapedTile.anInt1622;
					final int i_50_ = shapedTile.anInt1628;
					final int i_51_ = shapedTile.anInt1638;
					final int i_52_ = shapedTile.anInt1626;
					final int[] is_53_ = Class116.anIntArrayArray1119[i_49_];
					final int[] is_54_ = ParticleNodeSub.anIntArrayArray2401[i_50_];
					int i_55_ = 0;
					if (i_51_ != 0) {
						for (int i_56_ = 0; i_56_ < 4; i_56_++) {
							pixels[pixelPos] = is_53_[is_54_[i_55_++]] == 0 ? i_51_ : i_52_;
							pixels[pixelPos + 1] = is_53_[is_54_[i_55_++]] == 0 ? i_51_ : i_52_;
							pixels[pixelPos + 2] = is_53_[is_54_[i_55_++]] == 0 ? i_51_ : i_52_;
							pixels[pixelPos + 3] = is_53_[is_54_[i_55_++]] == 0 ? i_51_ : i_52_;
							pixelPos += pixelStep;
						}
					} else {
						for (int i_57_ = 0; i_57_ < 4; i_57_++) {
							if (is_53_[is_54_[i_55_++]] != 0) {
								pixels[pixelPos] = i_52_;
							}
							if (is_53_[is_54_[i_55_++]] != 0) {
								pixels[pixelPos + 1] = i_52_;
							}
							if (is_53_[is_54_[i_55_++]] != 0) {
								pixels[pixelPos + 2] = i_52_;
							}
							if (is_53_[is_54_[i_55_++]] != 0) {
								pixels[pixelPos + 3] = i_52_;
							}
							pixelPos += pixelStep;
						}
					}
				}
			}
		}
	}

	static final void method1230(final int i_58_) {
		Class120_Sub14_Sub23.anInt3649 = -1;
		Class69.anInt614 = i_58_;
		MasterIndexInfo.aClass50_476 = null;
		Class120_Sub12_Sub25.anInt3312 = 1;
		SeqType.anInt349 = -1;
		StringNode.aBoolean2734 = false;
		Js5Request.anInt3940 = 0;
	}
}
