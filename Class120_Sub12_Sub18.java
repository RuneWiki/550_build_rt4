/* Class120_Sub12_Sub18 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;

final class Class120_Sub12_Sub18 extends Class120_Sub12 {
	private int anInt3270 = 0;
	private int anInt3271 = 4096;
	static Signlink errorSignlink;
	static boolean aBoolean3275;
	static int lastFullscreenWidth;

	static {
		aBoolean3275 = false;
		lastFullscreenWidth = 0;
	}

	static final int getGameSettingsBitpacked() {
		return           (ParticleEngine.getParticleSetting() << 23) +
			   ((CursorType.ambientSoundsVolume != 0 ? 1 : 0) << 22) +
			((RuntimeException_Sub1.musicVolume != 0 ? 1 : 0) << 21) +
			       ((Class111.soundEffectVolume != 0 ? 1 : 0) << 20) +
			                     ((Class167.isStereo ? 1 : 0) << 19) +
			                              (Class140.buildArea << 17) +
			                  ((Decimator.fogEnabled ? 1 : 0) << 16) +
			          ((PacketBuffer.highWaterDetail ? 1 : 0) << 15) +
		    ((Class120_Sub12_Sub6.highLightingDetail ? 1 : 0) << 13) +
		                 (0x1800 & Class74.sceneryShadowsType << 11) +
		          ((Class120_Sub6.characterShadowsOn ? 1 : 0) << 10) +
		    ((Class120_Sub30_Sub1.manyGroundTextures ? 1 : 0) << 9) +
		       ((ChunkAtmosphere.flickeringEffectsOn ? 1 : 0) << 8) +
		   ((Class120_Sub12_Sub10.manyIdleAnimations ? 1 : 0) << 7) +
		        ((ParticleNodeSub.highDetailTextures ? 1 : 0) << 6) +
		           ((Hashtable.showGroundDecorations ? 1 : 0) << 5) +
		     ((Class120_Sub12.removeRoofsSelectively ? 1 : 0) << 4) +
		                   ((client.allVisibleLevels ? 1 : 0) << 3) +
		                      (FileSystemRequest.brightness & 0x7);
	}

	static final Class164 method1289(final Component component, int i_0_, final Signlink signlink, final int i_1_) {
		if (Class178.anInt1771 == 0) {
			throw new IllegalStateException();
		}
		if (i_1_ < 0 || i_1_ >= 2) {
			throw new IllegalArgumentException();
		}
		if (i_0_ < 256) {
			i_0_ = 256;
		}
		try {
			final Class164 class164_2_ = (Class164) Class.forName("Class164_Sub1").newInstance();
			class164_2_.anInt1594 = i_0_;
			class164_2_.anIntArray1587 = new int[256 * (Class90.aBoolean846 ? 2 : 1)];
			class164_2_.method2141(component);
			class164_2_.anInt1596 = 1024 + (~0x3ff & i_0_);
			if (class164_2_.anInt1596 > 16384) {
				class164_2_.anInt1596 = 16384;
			}
			class164_2_.method2134(class164_2_.anInt1596);
			if (Class120_Sub14_Sub13.anInt3569 > 0 && Class90.aClass82_850 == null) {
				Class90.aClass82_850 = new Class82();
				Class90.aClass82_850.aClass135_781 = signlink;
				signlink.startThread(Class90.aClass82_850, Class120_Sub14_Sub13.anInt3569);
			}
			if (Class90.aClass82_850 != null) {
				if (Class90.aClass82_850.aClass164Array782[i_1_] != null) {
					throw new IllegalArgumentException();
				}
				Class90.aClass82_850.aClass164Array782[i_1_] = class164_2_;
			}
			return class164_2_;
		} catch (final Exception exception) {
			try {
				final Class164_Sub2 class164_sub2_3_ = new Class164_Sub2(signlink, i_1_);
				((Class164) class164_sub2_3_).anInt1594 = i_0_;
				((Class164) class164_sub2_3_).anIntArray1587 = new int[(Class90.aBoolean846 ? 2 : 1) * 256];
				class164_sub2_3_.method2141(component);
				((Class164) class164_sub2_3_).anInt1596 = 16384;
				class164_sub2_3_.method2134(((Class164) class164_sub2_3_).anInt1596);
				if (Class120_Sub14_Sub13.anInt3569 > 0 && Class90.aClass82_850 == null) {
					Class90.aClass82_850 = new Class82();
					Class90.aClass82_850.aClass135_781 = signlink;
					signlink.startThread(Class90.aClass82_850, Class120_Sub14_Sub13.anInt3569);
				}
				if (Class90.aClass82_850 != null) {
					if (Class90.aClass82_850.aClass164Array782[i_1_] != null) {
						throw new IllegalArgumentException();
					}
					Class90.aClass82_850.aClass164Array782[i_1_] = class164_sub2_3_;
				}
				return class164_sub2_3_;
			} catch (final Exception exception_4_) {
				return new Class164();
			}
		}
	}

	@Override
	final void decode(final Buffer buffer, final int i_7_) {
		do {
			if (i_7_ != 0) {
				if (i_7_ != 1) {
					break;
				}
			} else {
				anInt3270 = buffer.getUShort();
				break;
			}
			anInt3271 = buffer.getUShort();
		} while (false);
	}

	static final void clearObjCache() {
		ObjType.recentUse.clear();
		Class33.aClass21_273.clear();
		SpotAnimation.objectSpriteCache.clear();
	}

	static final void drawSpriteMenu() {
		final int drawX = Huffman.menuDrawX;
		final int drawY = Class120_Sub16.menuDrawY;
		final int height = QuickChatMessageType.menuHeight - 3;
		final int width = CustomLocation.menuWidth;
		if (Class157.aClass120_Sub14_Sub19_1472 == null || Class120_Sub12_Sub10.aClass120_Sub14_Sub19_3202 == null) {
			if (client.spritesJs5.groupExist(client.anInt2199) && client.spritesJs5.groupExist(Class114.anInt1099)) {
				Class157.aClass120_Sub14_Sub19_1472 = Class120_Sub12_Sub26.constructLDSpriteAlpha(client.spritesJs5, client.anInt2199, 0);
				Class120_Sub12_Sub10.aClass120_Sub14_Sub19_3202 = Class120_Sub12_Sub26.constructLDSpriteAlpha(client.spritesJs5, Class114.anInt1099, 0);
				if (HDToolkit.glEnabled) {
					if (!(Class157.aClass120_Sub14_Sub19_1472 instanceof LDTransparentSprite)) {
						Class157.aClass120_Sub14_Sub19_1472 = new HDSprite((LDSprite) Class157.aClass120_Sub14_Sub19_1472);
					} else {
						Class157.aClass120_Sub14_Sub19_1472 = new HDTransparentSprite((LDSprite) Class157.aClass120_Sub14_Sub19_1472);
					}
					if (!(Class120_Sub12_Sub10.aClass120_Sub14_Sub19_3202 instanceof LDTransparentSprite)) {
						Class120_Sub12_Sub10.aClass120_Sub14_Sub19_3202 = new HDSprite((LDSprite) Class120_Sub12_Sub10.aClass120_Sub14_Sub19_3202);
					} else {
						Class120_Sub12_Sub10.aClass120_Sub14_Sub19_3202 = new HDTransparentSprite((LDSprite) Class120_Sub12_Sub10.aClass120_Sub14_Sub19_3202);
					}
				}
			} else if (!HDToolkit.glEnabled) {
				GraphicsLD.fillRectAlpha(drawX, drawY, width, 20, Class140.anInt1345, 256 - Class89.anInt837);
			} else {
				GraphicsHD.fillRectAlpha(drawX, drawY, width, 20, Class140.anInt1345, 256 - Class89.anInt837);
			}
		}
		if (Class157.aClass120_Sub14_Sub19_1472 != null && Class120_Sub12_Sub10.aClass120_Sub14_Sub19_3202 != null) {
			final int i_12_ = (width + -(Class120_Sub12_Sub10.aClass120_Sub14_Sub19_3202.width * 2)) / Class157.aClass120_Sub14_Sub19_1472.width;
			for (int i_13_ = 0; i_13_ < i_12_; i_13_++) {
				Class157.aClass120_Sub14_Sub19_1472.drawReg(i_13_ * Class157.aClass120_Sub14_Sub19_1472.width + drawX + Class120_Sub12_Sub10.aClass120_Sub14_Sub19_3202.width, drawY);
			}
			Class120_Sub12_Sub10.aClass120_Sub14_Sub19_3202.drawReg(drawX, drawY);
			Class120_Sub12_Sub10.aClass120_Sub14_Sub19_3202.method1592(width + drawX - Class120_Sub12_Sub10.aClass120_Sub14_Sub19_3202.width, drawY);
		}
		Class120_Sub12_Sub22.boldFont.method1466(StringLibrary.chooseOption, drawX - -3, 14 + drawY, Class120_Sub12_Sub3.anInt3151, -1);
		if (!HDToolkit.glEnabled) {
			GraphicsLD.fillRectAlpha(drawX, 20 + drawY, width, height - 20, Class140.anInt1345, 256 - Class89.anInt837);
		} else {
			GraphicsHD.fillRectAlpha(drawX, 20 + drawY, width, height - 20, Class140.anInt1345, 256 - Class89.anInt837);
		}
		final int mouseX = Queue.lastMouseX;
		final int mouseY = ChunkAtmosphere.lastMouseY;
		for (int i_16_ = 0; i_16_ < WallDecoration.menuOptionCount; i_16_++) {
			final int i_17_ = (-i_16_ + -1 + WallDecoration.menuOptionCount) * 15 + 20 + drawY - -13;
			if (drawX < mouseX && width + drawX > mouseX && -13 + i_17_ < mouseY && i_17_ - -3 > mouseY) {
				if (!HDToolkit.glEnabled) {
					GraphicsLD.fillRectAlpha(drawX, i_17_ + -12, width, 15, Class120_Sub12_Sub3.anInt3147, -Class88.anInt832 + 256);
				} else {
					GraphicsHD.fillRectAlpha(drawX, -12 + i_17_, width, 15, Class120_Sub12_Sub3.anInt3147, -Class88.anInt832 + 256);
				}
			}
		}
		if ((Class173.aClass120_Sub14_Sub19_1725 == null || FrameGroup.aClass120_Sub14_Sub19_3611 == null || RuntimeException_Sub1.aClass120_Sub14_Sub19_2144 == null) && client.spritesJs5.groupExist(Class24.anInt146) && client.spritesJs5.groupExist(Class92.anInt864)
				&& client.spritesJs5.groupExist(Class31.anInt240)) {
			Class173.aClass120_Sub14_Sub19_1725 = Class120_Sub12_Sub26.constructLDSpriteAlpha(client.spritesJs5, Class24.anInt146, 0);
			FrameGroup.aClass120_Sub14_Sub19_3611 = Class120_Sub12_Sub26.constructLDSpriteAlpha(client.spritesJs5, Class92.anInt864, 0);
			RuntimeException_Sub1.aClass120_Sub14_Sub19_2144 = Class120_Sub12_Sub26.constructLDSpriteAlpha(client.spritesJs5, Class31.anInt240, 0);
			if (HDToolkit.glEnabled) {
				if (Class173.aClass120_Sub14_Sub19_1725 instanceof LDTransparentSprite) {
					Class173.aClass120_Sub14_Sub19_1725 = new HDTransparentSprite((LDSprite) Class173.aClass120_Sub14_Sub19_1725);
				} else {
					Class173.aClass120_Sub14_Sub19_1725 = new HDSprite((LDSprite) Class173.aClass120_Sub14_Sub19_1725);
				}
				if (FrameGroup.aClass120_Sub14_Sub19_3611 instanceof LDTransparentSprite) {
					FrameGroup.aClass120_Sub14_Sub19_3611 = new HDTransparentSprite((LDSprite) FrameGroup.aClass120_Sub14_Sub19_3611);
				} else {
					FrameGroup.aClass120_Sub14_Sub19_3611 = new HDSprite((LDSprite) FrameGroup.aClass120_Sub14_Sub19_3611);
				}
				if (RuntimeException_Sub1.aClass120_Sub14_Sub19_2144 instanceof LDTransparentSprite) {
					RuntimeException_Sub1.aClass120_Sub14_Sub19_2144 = new HDTransparentSprite((LDSprite) RuntimeException_Sub1.aClass120_Sub14_Sub19_2144);
				} else {
					RuntimeException_Sub1.aClass120_Sub14_Sub19_2144 = new HDSprite((LDSprite) RuntimeException_Sub1.aClass120_Sub14_Sub19_2144);
				}
			}
		}
		if (Class173.aClass120_Sub14_Sub19_1725 != null && FrameGroup.aClass120_Sub14_Sub19_3611 != null && RuntimeException_Sub1.aClass120_Sub14_Sub19_2144 != null) {
			final int i_18_ = (-(2 * RuntimeException_Sub1.aClass120_Sub14_Sub19_2144.width) + width) / Class173.aClass120_Sub14_Sub19_1725.width;
			for (int i_19_ = 0; i_19_ < i_18_; i_19_++) {
				Class173.aClass120_Sub14_Sub19_1725.drawReg(RuntimeException_Sub1.aClass120_Sub14_Sub19_2144.width + drawX - -(Class173.aClass120_Sub14_Sub19_1725.width * i_19_), height + drawY - Class173.aClass120_Sub14_Sub19_1725.height);
			}
			final int i_20_ = (-RuntimeException_Sub1.aClass120_Sub14_Sub19_2144.height + -20 + height) / FrameGroup.aClass120_Sub14_Sub19_3611.height;
			for (int i_21_ = 0; i_21_ < i_20_; i_21_++) {
				FrameGroup.aClass120_Sub14_Sub19_3611.drawReg(drawX, 20 + drawY + FrameGroup.aClass120_Sub14_Sub19_3611.height * i_21_);
				FrameGroup.aClass120_Sub14_Sub19_3611.method1592(-FrameGroup.aClass120_Sub14_Sub19_3611.width + drawX - -width, i_21_ * FrameGroup.aClass120_Sub14_Sub19_3611.height + 20 + drawY);
			}
			RuntimeException_Sub1.aClass120_Sub14_Sub19_2144.drawReg(drawX, height + drawY - RuntimeException_Sub1.aClass120_Sub14_Sub19_2144.height);
			RuntimeException_Sub1.aClass120_Sub14_Sub19_2144.method1592(width + drawX - RuntimeException_Sub1.aClass120_Sub14_Sub19_2144.width, height + drawY + -RuntimeException_Sub1.aClass120_Sub14_Sub19_2144.height);
		}
		for (int i_22_ = 0; WallDecoration.menuOptionCount > i_22_; i_22_++) {
			final int i_23_ = 13 + drawY + 20 + (WallDecoration.menuOptionCount - 1 - i_22_) * 15;
			int i_24_ = Class120_Sub12_Sub3.anInt3151;
			if (mouseX > drawX && width + drawX > mouseX && i_23_ - 13 < mouseY && i_23_ + 3 > mouseY) {
				i_24_ = Class120_Sub12_Sub13.anInt3233;
			}
			Class120_Sub12_Sub22.boldFont.method1466(client.getMenuOptionText(i_22_), 3 + drawX, i_23_, i_24_, 0);
		}
		Class54.redrawScreen(Huffman.menuDrawX, Class120_Sub16.menuDrawY, CustomLocation.menuWidth, QuickChatMessageType.menuHeight);
	}

	static final int method1294(final int i, final int i_25_) {
		final int i_26_ = i_25_ & 0x3f;
		final int i_27_ = 0x3 & i_25_ >> 6;
		if (i_26_ != 18) {
			if (i_26_ == 19 || i_26_ == 21) {
				if (i_27_ == 0) {
					return 16;
				}
				if (i_27_ == 1) {
					return 32;
				}
				if (i_27_ == 2) {
					return 64;
				}
				if (i_27_ == 3) {
					return 128;
				}
			}
		} else {
			if (i_27_ == 0) {
				return 1;
			}
			if (i_27_ == 1) {
				return 2;
			}
			if (i_27_ == 2) {
				return 4;
			}
			if (i_27_ == 3) {
				return 8;
			}
		}
		if (i != 26957) {
			return 86;
		}
		return 0;
	}

	@Override
	final int[] method1187(final int i_28_) {
		final int[] is = this.aClass30_2563.method258(i_28_);
		if (this.aClass30_2563.aBoolean238) {
			final int[] is_29_ = method1192(i_28_, 0);
			for (int i_30_ = 0; Class120_Sub12_Sub7.anInt3178 > i_30_; i_30_++) {
				final int i_31_ = is_29_[i_30_];
				is[i_30_] = i_31_ >= anInt3270 && anInt3271 >= i_31_ ? 4096 : 0;
			}
		}
		return is;
	}

	public Class120_Sub12_Sub18() {
		super(1, true);
	}
}
