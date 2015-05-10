/* Class23 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Font;

final class Class23 {
	static int anInt134;
	static Font loadingFont;
	static int anInt137 = 0;
	static int packetType;

	static {
		anInt134 = 0;
		packetType = 0;
	}

	static final void drawSpriteOnMinimap(final JagexInterface jagexInterface, final int interfaceX, final int interfaceY, final int iconX, final int iconY, final AbstractSprite abstractSprite) {
		if (abstractSprite != null) {
			final int dist = Math.max(jagexInterface.width / 2, jagexInterface.height / 2) + 10;
			final int maxDist = iconY * iconY + iconX * iconX;
			if (maxDist <= dist * dist) {
				final int rot = (int) DummyOutputStream.aFloat28 & 0x7ff;
				final int rotSin = Rasterizer.sinTable[rot];
				final int rotCos = Rasterizer.cosTable[rot];
				final int posX = iconX * rotCos + iconY * rotSin >> 16;
				final int posY = iconY * rotCos - iconX * rotSin >> 16;
				if (!HDToolkit.glEnabled) {
					((LDSprite) abstractSprite).method1610(interfaceX + posX + jagexInterface.width / 2 - abstractSprite.trimWidth / 2, interfaceY + jagexInterface.height / 2 - abstractSprite.trimHeight / 2 - posY, jagexInterface.startOfSpriteLookupTable, jagexInterface.lengthOfSpriteLookupTable);
				} else {
					((HDSprite) abstractSprite).method1598(interfaceX + posX + jagexInterface.width / 2 - abstractSprite.trimWidth / 2, interfaceY + jagexInterface.height / 2 - abstractSprite.trimHeight / 2 - posY, (HDSprite) jagexInterface.constructSpriteFromId(false));
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
			DummyInputStream.fixedGameScreenInterface = jagexInterface;
		}
		if (activateResizeListener && jagexInterface.onResizeListener != null && (oldWidth != jagexInterface.width || oldHeight != jagexInterface.height)) {
			final InterfaceListener interfaceListener = new InterfaceListener();
			interfaceListener.objectData = jagexInterface.onResizeListener;
			interfaceListener.jagexInterface = jagexInterface;
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

	static final void method204(final Npc npc, final int i, final int i_18_) {
		if (i == npc.animId && i != -1) {
			final SeqType seqType = SeqType.list(i);
			final int resetCode = seqType.resetInPlay;
			if (resetCode == 1) {
				npc.animFrame = 0;
				npc.animDelay = i_18_;
				npc.animNextFrame = 1;
				npc.animCyclesElapsed = 0;
				npc.animCurrentFrameDelay = 0;
				Class120_Sub12_Sub23.method1323(seqType, npc.x, npc.z, npc.animFrame, false);
			}
			if (resetCode == 2) {
				npc.animCyclesElapsed = 0;
			}
		} else if (i == -1 || npc.animId == -1 || SeqType.list(i).priority >= SeqType.list(npc.animId).priority) {
			npc.animNextFrame = 1;
			npc.onAnimPlayWalkQueuePos = npc.walkQueuePos;
			npc.animCyclesElapsed = 0;
			npc.animFrame = 0;
			npc.animDelay = i_18_;
			npc.animId = i;
			npc.animCurrentFrameDelay = 0;
			if (npc.animId != -1) {
				Class120_Sub12_Sub23.method1323(SeqType.list(npc.animId), npc.x, npc.z, npc.animFrame, false);
			}
		}
	}
}
