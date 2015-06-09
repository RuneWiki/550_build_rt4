/* Class120_Sub12_Sub21_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Graphics;

final class Class120_Sub12_Sub21_Sub1 extends Class120_Sub12_Sub21 {
	static boolean extendFriendsList;
	static volatile boolean focusIn = true;
	static int[] anIntArray3912;

	static {
		anIntArray3912 = new int[32];
		extendFriendsList = false;
	}

	static final void method1312(final boolean underwater) {
		byte[][] data;
		if (HDToolkit.glEnabled && underwater) {
			data = Class101_Sub1.underWaterLocationsMapFilesBuffer;
		} else {
			data = Class134.locationMapFilesBuffer;
		}
		for (int id = 0; id < RuntimeException_Sub1.mapFilesBuffer.length; id++) {
			final byte[] is_2_ = data[id];
			if (is_2_ != null) {
				final int i_3_ = 64 * (Class120_Sub12_Sub36.regionBitPackeds[id] >> 8) - GameEntity.currentBaseX;
				final int i_4_ = 64 * (Class120_Sub12_Sub36.regionBitPackeds[id] & 0xff) - LightType.currentBaseZ;
				Class120_Sub2.method1050();
				CollisionMap.decodeObjectMap(underwater, is_2_, i_4_, i_3_, WallLocation.collisionMaps);
			}
		}
	}

	public Class120_Sub12_Sub21_Sub1() {
		/* empty */
	}

	static final int method1313(final String string, final int language, final String string_6_) {
		final int i_8_ = string_6_.length();
		int i_9_ = 0;
		final int i_10_ = string.length();
		char c = '\0';
		int i_11_ = 0;
		char c_12_ = '\0';
		while (i_8_ > -c + i_9_ || i_10_ > i_11_ + -c_12_) {
			if (i_8_ <= -c + i_9_) {
				return -1;
			}
			if (i_10_ <= i_11_ - c_12_) {
				return 1;
			}
			char c_13_;
			if (c == 0) {
				c_13_ = string_6_.charAt(i_9_++);
			} else {
				c_13_ = c;
			}
			char c_14_;
			if (c_12_ != 0) {
				c_14_ = c_12_;
			} else {
				c_14_ = string.charAt(i_11_++);
			}
			c = Class120_Sub12_Sub29.normalizeLatinCharacters(c_13_);
			c_12_ = Class120_Sub12_Sub29.normalizeLatinCharacters(c_14_);
			c_13_ = Class22.normalizeLatinCharacters(language, c_13_);
			c_14_ = Class22.normalizeLatinCharacters(language, c_14_);
			if (c_14_ != c_13_ && Character.toUpperCase(c_13_) != Character.toUpperCase(c_14_)) {
				c_13_ = Character.toLowerCase(c_13_);
				c_14_ = Character.toLowerCase(c_14_);
				if (c_14_ != c_13_) {
					return Class120_Sub16.method1661(language, c_13_) - Class120_Sub16.method1661(language, c_14_);
				}
			}
		}
		final int i_15_ = Math.min(i_8_, i_10_);
		for (int i_16_ = 0; i_16_ < i_15_; i_16_++) {
			if (language == 2) {
				i_11_ = -1 + i_10_ + -i_16_;
				i_9_ = i_8_ - 1 + -i_16_;
			} else {
				i_9_ = i_11_ = i_16_;
			}
			char c_17_ = string_6_.charAt(i_9_);
			char c_18_ = string.charAt(i_11_);
			if (c_17_ != c_18_ && Character.toUpperCase(c_17_) != Character.toUpperCase(c_18_)) {
				c_17_ = Character.toLowerCase(c_17_);
				c_18_ = Character.toLowerCase(c_18_);
				if (c_17_ != c_18_) {
					return Class120_Sub16.method1661(language, c_17_) + -Class120_Sub16.method1661(language, c_18_);
				}
			}
		}
		final int i_19_ = -i_10_ + i_8_;
		if (i_19_ != 0) {
			return i_19_;
		}
		for (int i_20_ = 0; i_20_ < i_15_; i_20_++) {
			final char c_21_ = string_6_.charAt(i_20_);
			final char c_22_ = string.charAt(i_20_);
			if (c_21_ != c_22_) {
				return Class120_Sub16.method1661(language, c_21_) + -Class120_Sub16.method1661(language, c_22_);
			}
		}
		return 0;
	}

	static final void method1315() {
		for (;;) {
			final Class120_Sub29 class120_sub29 = (Class120_Sub29) Class120_Sub14_Sub15.aClass105_3584.removeFront();
			if (class120_sub29 == null) {
				break;
			}
			GameEntity class180_sub5;
			if (class120_sub29.anInt2764 < 0) {
				final int i_23_ = -class120_sub29.anInt2764 + -1;
				if (i_23_ == Class167.selfPlayerIndex) {
					class180_sub5 = TileParticleQueue.selfPlayer;
				} else {
					class180_sub5 = Class118.playersList[i_23_];
				}
			} else {
				final int i_24_ = class120_sub29.anInt2764 + -1;
				class180_sub5 = Class120_Sub12_Sub11.npcList[i_24_];
			}
			if (class180_sub5 != null) {
				final LocType locType = LocType.list(class120_sub29.anInt2776);
				if (Class173.gameLevel != 0) {
					/* empty */
				}
				int i_25_;
				int i_26_;
				if (class120_sub29.anInt2775 != 1 && class120_sub29.anInt2775 != 3) {
					i_26_ = locType.sizeZ;
					i_25_ = locType.sizeX;
				} else {
					i_25_ = locType.sizeZ;
					i_26_ = locType.sizeX;
				}
				final int i_27_ = class120_sub29.anInt2780 + (i_25_ + 1 >> 1);
				final int i_28_ = class120_sub29.anInt2780 + (i_25_ >> 1);
				final int i_29_ = class120_sub29.anInt2765 - -(i_26_ >> 1);
				final int i_30_ = class120_sub29.anInt2765 - -(i_26_ - -1 >> 1);
				final int[][] is = OverridedJInterface.activeTileHeightMap[Class173.gameLevel];
				final int i_31_ = is[i_27_][i_29_] + is[i_28_][i_29_] + is[i_28_][i_30_] - -is[i_27_][i_30_] >> 2;
				SceneGraphNode sceneGraphNode = null;
				final int i_32_ = CollisionMap.anIntArray153[class120_sub29.anInt2772];
				if (i_32_ != 0) {
					if (i_32_ != 1) {
						if (i_32_ != 2) {
							if (i_32_ == 3) {
								final GroundDecoration class36 = client.getGroundDecoration(class120_sub29.anInt2780, class120_sub29.anInt2765, Class173.gameLevel);
								if (class36 != null) {
									sceneGraphNode = class36.sceneGraphNode;
								}
							}
						} else {
							final Class28 class28 = SpotAnimation.method2315(class120_sub29.anInt2780, class120_sub29.anInt2765, Class173.gameLevel);
							if (class28 != null) {
								sceneGraphNode = class28.aClass180_174;
							}
						}
					} else {
						final WallDecoration class186 = ObjType.getWallDecoration(class120_sub29.anInt2780, class120_sub29.anInt2765, Class173.gameLevel);
						if (class186 != null) {
							sceneGraphNode = class186.aClass180_1901;
						}
					}
				} else {
					final WallLocation class182 = Deque.getWallLocation(class120_sub29.anInt2780, class120_sub29.anInt2765, Class173.gameLevel);
					if (class182 != null) {
						sceneGraphNode = class182.aClass180_1800;
					}
				}
				if (sceneGraphNode != null) {
					Class38.method317(-1, Class173.gameLevel, 0, class120_sub29.anInt2780, class120_sub29.anInt2773 - -1, class120_sub29.anInt2765, 0, i_32_, 1 + class120_sub29.anInt2771);
					class180_sub5.anInt3028 = class120_sub29.anInt2765 * 128 + i_26_ * 64;
					int i_33_ = class120_sub29.anInt2766;
					int i_34_ = class120_sub29.anInt2767;
					class180_sub5.anInt3033 = 128 * class120_sub29.anInt2780 + i_25_ * 64;
					class180_sub5.anInt2970 = i_31_;
					class180_sub5.anInt3042 = class120_sub29.anInt2771 - -Class101_Sub2.loopCycle;
					int i_35_ = class120_sub29.anInt2778;
					class180_sub5.anObject3047 = sceneGraphNode;
					class180_sub5.anInt3012 = class120_sub29.anInt2773 + Class101_Sub2.loopCycle;
					if (i_35_ < i_34_) {
						final int i_36_ = i_34_;
						i_34_ = i_35_;
						i_35_ = i_36_;
					}
					class180_sub5.anInt3041 = class120_sub29.anInt2780 + i_35_;
					class180_sub5.anInt3043 = class120_sub29.anInt2780 - -i_34_;
					int i_37_ = class120_sub29.anInt2779;
					if (i_37_ < i_33_) {
						final int i_38_ = i_33_;
						i_33_ = i_37_;
						i_37_ = i_38_;
					}
					class180_sub5.anInt3038 = i_37_ + class120_sub29.anInt2765;
					class180_sub5.anInt3020 = i_33_ + class120_sub29.anInt2765;
				}
			}
		}
	}

	static final void method1316() {
		for (Class120_Sub24 class120_sub24 = (Class120_Sub24) Class120_Sub4.aClass105_2439.getFront(); class120_sub24 != null; class120_sub24 = (Class120_Sub24) Class120_Sub4.aClass105_2439.getNext()) {
			if (class120_sub24.anInt2720 != -1) {
				class120_sub24.unlink();
			} else {
				class120_sub24.anInt2732 = 0;
				Class53.method457(class120_sub24);
			}
		}
	}

	static final String mergeStrings(final String[] stringStack, final int stackIndex, final int toMergeAmount) {
		if (toMergeAmount == 0) {
			return "";
		}
		if (toMergeAmount == 1) {
			final String string = stringStack[stackIndex];
			if (string == null) {
				return "null";
			}
			return string;
		}
		int characterLen = 0;
		final int stringLen = toMergeAmount + stackIndex;
		for (int id = stackIndex; id < stringLen; id++) {
			final String string = stringStack[id];
			if (string != null) {
				characterLen += string.length();
			} else {
				characterLen += 4;
			}
		}
		final StringBuffer stringbuffer = new StringBuffer(characterLen);
		for (int id = stackIndex; id < stringLen; id++) {
			final String string = stringStack[id];
			if (string == null) {
				stringbuffer.append("null");
			} else {
				stringbuffer.append(string);
			}
		}
		return stringbuffer.toString();
	}

	static final void drawTextOnScreen(final String text, final boolean redrawWholeScreen) {
		final int textWidth = Class120_Sub12_Sub20.plainFont.method1468(text, 250);
		final int textHeight = Class120_Sub12_Sub20.plainFont.method1481(text, 250) * 13;
		if (HDToolkit.glEnabled) {
			GraphicsHD.fillRect(6, 6, textWidth + 8, textHeight + 8, 0);
			GraphicsHD.drawRect(6, 6, textWidth + 8, textHeight + 8, 16777215);
		} else {
			GraphicsLD.fillRect(6, 6, textWidth + 8, textHeight + 8, 0);
			GraphicsLD.drawRect(6, 6, textWidth + 8, textHeight + 8, 16777215);
		}
		Class120_Sub12_Sub20.plainFont.drawInterfaceText(text, 10, 10, textWidth, textHeight, 16777215, -1, 1, 1, 0);
		Class120_Sub12_Sub1.redrawScreen(6, 6, textWidth + 8, textHeight + 8);
		if (!redrawWholeScreen) {
			Class54.redrawScreen(10, 10, textWidth, textHeight);
		} else if (HDToolkit.glEnabled) {
			HDToolkit.swapBuffers();
		} else {
			try {
				final Graphics graphics = Node.canvas.getGraphics();
				ClanMember.fullscreenGraphics.drawImage(graphics, 0, 0);
			} catch (final Exception exception) {
				Node.canvas.repaint();
			}
		}
	}

	@Override
	final int[][] method1188(final int i) {
		final int[][] is_53_ = this.aClass109_2559.method975(i);
		if (this.aClass109_2559.aBoolean1049 && method1304()) {
			final int[] is_54_ = is_53_[1];
			final int[] is_55_ = is_53_[2];
			final int i_56_ = this.anInt3290 * (i % this.anInt3290);
			final int[] is_57_ = is_53_[0];
			for (int i_58_ = 0; i_58_ < Class120_Sub12_Sub7.anInt3178; i_58_++) {
				final int i_59_ = this.anIntArray3296[i_56_ - -(i_58_ % this.anInt3292)];
				is_55_[i_58_] = Class120_Sub12_Sub3.method1207(i_59_, 255) << 4;
				is_54_[i_58_] = Class120_Sub12_Sub3.method1207(4080, i_59_ >> 4);
				is_57_[i_58_] = Class120_Sub12_Sub3.method1207(i_59_, 16711680) >> 12;
			}
		}
		return is_53_;
	}
}
