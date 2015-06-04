/* Class120_Sub12_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Point;

final class Class120_Sub12_Sub6 extends Class120_Sub12 {
	static AbstractSprite[] mapDotSprites;
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

	static final AbstractSprite constructObjectSprite(final PlayerAppearance playerAppearance, int outlineType, final int objCount, int shadow, final int objId, final boolean drawCount, final boolean shrink, final boolean useHDSprite) {
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
		final LDModelRenderer objModel = objType.method2117(playerAppearance);
		if (objModel == null) {
			return null;
		}
		LDSprite certLentTemplateSprite = null;
		if (objType.certtemplate != -1) {
			certLentTemplateSprite = (LDSprite) constructObjectSprite(playerAppearance, 1, 10, 0, objType.certlink, false, true, true);
			if (certLentTemplateSprite == null) {
				return null;
			}
		} else if (objType.lenttemplate != -1) {
			certLentTemplateSprite = (LDSprite) constructObjectSprite(playerAppearance, outlineType, objCount, shadow, objType.lentlink, false, false, true);
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
		final int i_14_ = Rasterizer.cosTable[objType.xan2d] * zoom >> 16;
		final int i_15_ = Rasterizer.sinTable[objType.xan2d] * zoom >> 16;
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
			certLentTemplateSprite.drawReg(0, 0);
		} else if (objType.lenttemplate != -1) {
			GraphicsLD.init2dCanvas(certLentTemplateSprite.pixels, 36, 32);
			objSprite.drawReg(0, 0);
			objSprite = certLentTemplateSprite;
		}
		if (drawCount && (objType.stackable == 1 || objCount != 1) && objCount != -1) {
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

	static final void setCursor(int newCursorId) {
		if (!Class38.cursorsEnabled) {
			newCursorId = -1;
		}
		if (Class174.currentCursorId != newCursorId) {
			if (newCursorId != -1) {
				final CursorType cursorType = CursorType.list(newCursorId);
				final LDSprite cursorSprite = cursorType.getCursorSprite();
				if (cursorSprite == null) {
					newCursorId = -1;
				} else {
					NpcType.gameSignlink.setCursor(new Point(cursorType.hotSpotX, cursorType.hotSpotY), cursorSprite.trimHeight, cursorSprite.method1609(), cursorSprite.trimWidth, Node.canvas);
					Class174.currentCursorId = newCursorId;
				}
			}
			if (newCursorId == -1 && Class174.currentCursorId != -1) {
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

	static final void method1226(final int i, final int i_17_, final int i_18_, final int i_19_, final int i_20_, final int i_21_, final int i_22_, final int i_24_, final int i_25_, final int i_26_, final int i_27_, final int i_28_) {
		final Class120_Sub29 class120_sub29 = new Class120_Sub29();
		class120_sub29.anInt2766 = i_22_;
		class120_sub29.anInt2771 = i_19_;
		class120_sub29.anInt2778 = i_27_;
		class120_sub29.anInt2780 = i_28_;
		class120_sub29.anInt2772 = i_20_;
		class120_sub29.anInt2779 = i_21_;
		class120_sub29.anInt2776 = i_24_;
		class120_sub29.anInt2767 = i;
		class120_sub29.anInt2773 = i_18_;
		class120_sub29.anInt2765 = i_26_;
		class120_sub29.anInt2764 = i_17_;
		class120_sub29.anInt2775 = i_25_;
		Class120_Sub14_Sub15.aClass105_3584.addLast(class120_sub29);
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

	static final void pushTilesPixels(final int[] pixels, int pixelPos, final int pixelStep, final int x, final int z, final int level) {
		final GroundTile groundTile = LabelGroup.activeGroundTiles[level][x][z];
		if (groundTile != null) {
			final PlainTile plainTile = groundTile.plainTile;
			if (plainTile != null) {
				final int color = plainTile.minimapColor;
				if (color != 0) {
					for (int loops = 0; loops < 4; loops++) {
						pixels[pixelPos] = color;
						pixels[pixelPos + 1] = color;
						pixels[pixelPos + 2] = color;
						pixels[pixelPos + 3] = color;
						pixelPos += pixelStep;
					}
				}
			} else {
				final ShapedTile shapedTile = groundTile.shapedTile;
				if (shapedTile != null) {
					final int shape = shapedTile.shape;
					final int rotation = shapedTile.rotation;
					final int overlayColor = shapedTile.overlayMinimapColor;
					final int underlayColor = shapedTile.underlayMinimapColor;
					final int[] is_53_ = Class116.anIntArrayArray1119[shape];
					final int[] is_54_ = ParticleNodeSub.anIntArrayArray2401[rotation];
					int i_55_ = 0;
					if (overlayColor != 0) {
						for (int i_56_ = 0; i_56_ < 4; i_56_++) {
							pixels[pixelPos] = is_53_[is_54_[i_55_++]] == 0 ? overlayColor : underlayColor;
							pixels[pixelPos + 1] = is_53_[is_54_[i_55_++]] == 0 ? overlayColor : underlayColor;
							pixels[pixelPos + 2] = is_53_[is_54_[i_55_++]] == 0 ? overlayColor : underlayColor;
							pixels[pixelPos + 3] = is_53_[is_54_[i_55_++]] == 0 ? overlayColor : underlayColor;
							pixelPos += pixelStep;
						}
					} else {
						for (int i_57_ = 0; i_57_ < 4; i_57_++) {
							if (is_53_[is_54_[i_55_++]] != 0) {
								pixels[pixelPos] = underlayColor;
							}
							if (is_53_[is_54_[i_55_++]] != 0) {
								pixels[pixelPos + 1] = underlayColor;
							}
							if (is_53_[is_54_[i_55_++]] != 0) {
								pixels[pixelPos + 2] = underlayColor;
							}
							if (is_53_[is_54_[i_55_++]] != 0) {
								pixels[pixelPos + 3] = underlayColor;
							}
							pixelPos += pixelStep;
						}
					}
				}
			}
		}
	}

	static final void method1230(final int i_58_) {
		QuickChatCategoryType.anInt3649 = -1;
		Class69.anInt614 = i_58_;
		MasterIndexInfo.aClass50_476 = null;
		Class120_Sub12_Sub25.anInt3312 = 1;
		SeqType.anInt349 = -1;
		StringNode.aBoolean2734 = false;
		Js5Request.anInt3940 = 0;
	}
}
