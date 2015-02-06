/* Class23 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Font;

final class Class23 {
	static int anInt134;
	static Font loadingFont;
	static int anInt136;
	static int anInt137 = 0;
	static int packetType;

	static {
		anInt136 = 0;
		anInt134 = 0;
		packetType = 0;
	}

	static final void method200(final int i, final JagexInterface jagexInterface, final int i_0_, final int i_1_, final int i_3_, final AbstractSprite class120_sub14_sub19) {
		if (class120_sub14_sub19 != null) {
			final int i_4_ = (int) DummyOutputStream.aFloat28 + Class164.minimapRandomRotation & 0x7ff;
			final int i_5_ = Math.max(jagexInterface.width / 2, jagexInterface.height / 2) + 10;
			final int i_6_ = i_3_ * i_3_ + i_1_ * i_1_;
			if (i_6_ <= i_5_ * i_5_) {
				int i_7_ = Rasterizer.sineTable[i_4_];
				i_7_ = 256 * i_7_ / (Class154.minimapRandomZoom + 256);
				int i_8_ = Rasterizer.cosineTable[i_4_];
				i_8_ = 256 * i_8_ / (Class154.minimapRandomZoom + 256);
				final int i_9_ = i_1_ * i_8_ + i_3_ * i_7_ >> 16;
				final int i_10_ = i_8_ * i_3_ + -(i_1_ * i_7_) >> 16;
				if (!HDToolkit.glEnabled) {
					((LDSprite) class120_sub14_sub19).method1610(-(class120_sub14_sub19.trimWidth / 2) + i + jagexInterface.width / 2 - -i_9_, -(class120_sub14_sub19.trimHeight / 2) + -i_10_ + jagexInterface.height / 2 + i_0_, jagexInterface.startOfSpriteLookupTable, jagexInterface.lengthOfSpriteLookupTable);
				} else {
					((HDSprite) class120_sub14_sub19).method1598(-(class120_sub14_sub19.trimWidth / 2) + jagexInterface.width / 2 + i + i_9_, -(class120_sub14_sub19.trimHeight / 2) + -i_10_ + jagexInterface.height / 2 + i_0_, (HDSprite) jagexInterface.constructSpriteFromId(false));
				}
			}
		}
	}

	static final void updateInterfaceSize(final JagexInterface jagexInterface, final int width, final int height, final boolean activateResizeListener) {
		final int oldHeight = jagexInterface.height;
		if (jagexInterface.dynamicHeightValue == 0) {
			jagexInterface.height = jagexInterface.originalHeight;
		} else if (jagexInterface.dynamicHeightValue == 1) {
			jagexInterface.height = height - jagexInterface.originalHeight;
		} else if (jagexInterface.dynamicHeightValue == 2) {
			jagexInterface.height = height * jagexInterface.originalHeight >> 14;
		} else if (jagexInterface.dynamicHeightValue == 3) {
			if (jagexInterface.type == 2) {
				jagexInterface.height = jagexInterface.objSpritePadY * (jagexInterface.originalHeight + -1) + 32 * jagexInterface.originalHeight;
			} else if (jagexInterface.type == 7) {
				jagexInterface.height = jagexInterface.originalHeight * 12 - -((-1 + jagexInterface.originalHeight) * jagexInterface.objSpritePadY);
			}
		}
		final int oldWidth = jagexInterface.width;
		if (jagexInterface.dynamicWidthValue == 0) {
			jagexInterface.width = jagexInterface.originalWidth;
		} else if (jagexInterface.dynamicWidthValue == 1) {
			jagexInterface.width = width - jagexInterface.originalWidth;
		} else if (jagexInterface.dynamicWidthValue == 2) {
			jagexInterface.width = width * jagexInterface.originalWidth >> 14;
		} else if (jagexInterface.dynamicWidthValue == 3) {
			if (jagexInterface.type == 2) {
				jagexInterface.width = (-1 + jagexInterface.originalWidth) * jagexInterface.objSpritePadX + 32 * jagexInterface.originalWidth;
			} else if (jagexInterface.type == 7) {
				jagexInterface.width = 115 * jagexInterface.originalWidth - -(jagexInterface.objSpritePadX * (-1 + jagexInterface.originalWidth));
			}
		}
		if (jagexInterface.dynamicWidthValue == 4) {
			jagexInterface.width = jagexInterface.anInt1982 * jagexInterface.height / jagexInterface.anInt2085;
		}
		if (jagexInterface.dynamicHeightValue == 4) {
			jagexInterface.height = jagexInterface.anInt2085 * jagexInterface.width / jagexInterface.anInt1982;
		}
		if (Class120_Sub30_Sub1.qaOpTestEnabled && (client.getClickMask(jagexInterface).optionMask != 0 || jagexInterface.type == 0)) {
			if (jagexInterface.height >= 5 || jagexInterface.width >= 5) {
				if (jagexInterface.height <= 0) {
					jagexInterface.height = 5;
				}
				if (jagexInterface.width <= 0) {
					jagexInterface.width = 5;
				}
			} else {
				jagexInterface.height = 5;
				jagexInterface.width = 5;
			}
		}
		if (jagexInterface.clientCode == 1337) {
			DummyInputStream.aClass189_26 = jagexInterface;
		}
		if (activateResizeListener && jagexInterface.onResizeListener != null && (oldWidth != jagexInterface.width || oldHeight != jagexInterface.height)) {
			final InterfaceListener interfaceListener = new InterfaceListener();
			interfaceListener.objectData = jagexInterface.onResizeListener;
			interfaceListener.aClass189_2534 = jagexInterface;
			Class88.aClass105_829.addLast(interfaceListener);
		}
	}

	static final GroundDecoration method202(final int x, final int z, final int level) {
		final GroundTile class120_sub18 = LabelGroup.groundTiles[level][x][z];
		if (class120_sub18 == null || class120_sub18.groundDecoration == null) {
			return null;
		}
		return class120_sub18.groundDecoration;
	}

	public static void method203() {
		loadingFont = null;
	}

	static final void method204(final Npc npc, final int i, final int i_18_) {
		if (i == npc.animId && i != -1) {
			final SeqType seqType = SeqType.list(i);
			final int resetCode = seqType.resetInPlay;
			if (resetCode == 1) {
				npc.animCurrentFrame = 0;
				npc.animDelay = i_18_;
				npc.anInt3013 = 1;
				npc.anInt2999 = 0;
				npc.anInt3044 = 0;
				Class120_Sub12_Sub23.method1323(seqType, npc.x, npc.z, npc.animCurrentFrame, false);
			}
			if (resetCode == 2) {
				npc.anInt2999 = 0;
			}
		} else if (i == -1 || npc.animId == -1 || SeqType.list(i).priority >= SeqType.list(npc.animId).priority) {
			npc.anInt3013 = 1;
			npc.anInt3031 = npc.anInt2960;
			npc.anInt2999 = 0;
			npc.animCurrentFrame = 0;
			npc.animDelay = i_18_;
			npc.animId = i;
			npc.anInt3044 = 0;
			if (npc.animId != -1) {
				Class120_Sub12_Sub23.method1323(SeqType.list(npc.animId), npc.x, npc.z, npc.animCurrentFrame, false);
			}
		}
	}
}
