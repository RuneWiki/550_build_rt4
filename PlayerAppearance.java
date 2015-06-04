/* Class144 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class PlayerAppearance {
	static int hintmapedgeId;
	private long appearanceHash;
	private int entityRenderDataId;
	static int anInt1367;
	static String aString1368 = "Allocated memory";
	static int frameHeight;
	int[] colors;
	boolean isFemale;
	static int anInt1372 = 0;
	static WorldMapFont aClass98_1373;
	private long lastCachedModelHash;
	int npcId;
	private int[] appearanceData;
	private int[][] anIntArrayArray1377;

	static final int method2035(int i, int i_1_) {
		if (i_1_ > i) {
			final int i_3_ = i;
			i = i_1_;
			i_1_ = i_3_;
		}
		for (int i_4_; i_1_ != 0; i_1_ = i_4_) {
			i_4_ = i % i_1_;
			i = i_1_;
		}
		return i;
	}

	final void setAppearanceData(final int index, final int data) {
		final int i_7_ = Class120_Sub12_Sub3.anIntArray3148[index];
		if (appearanceData[i_7_] != 0 && Identikit.list(data) != null) {
			appearanceData[i_7_] = ChunkAtmosphere.method2512(-2147483648, data);
			updateApperanceHash();
		}
	}

	final void setFemaleGender(final boolean bool) {
		this.isFemale = bool;
		updateApperanceHash();
	}

	private final void updateApperanceHash() {
		final long l = appearanceHash;
		final long[] ls = SeekableFile.aLongArray2137;
		appearanceHash = -1L;
		appearanceHash = appearanceHash >>> 8 ^ ls[(int) (0xffL & (entityRenderDataId >> 8 ^ appearanceHash))];
		appearanceHash = ls[(int) (0xffL & (appearanceHash ^ entityRenderDataId))] ^ appearanceHash >>> 8;
		for (int i_8_ = 0; i_8_ < 12; i_8_++) {
			appearanceHash = appearanceHash >>> 8 ^ ls[(int) ((appearanceData[i_8_] >> 24 ^ appearanceHash) & 0xffL)];
			appearanceHash = appearanceHash >>> 8 ^ ls[(int) ((appearanceData[i_8_] >> 16 ^ appearanceHash) & 0xffL)];
			appearanceHash = ls[(int) (0xffL & (appearanceHash ^ appearanceData[i_8_] >> 8))] ^ appearanceHash >>> 8;
			appearanceHash = ls[(int) (0xffL & (appearanceHash ^ appearanceData[i_8_]))] ^ appearanceHash >>> 8;
		}
		for (int i_9_ = 0; i_9_ < 5; i_9_++) {
			appearanceHash = appearanceHash >>> 8 ^ ls[(int) (0xffL & (this.colors[i_9_] ^ appearanceHash))];
		}
		appearanceHash = ls[(int) (0xffL & (appearanceHash ^ (!this.isFemale ? 0 : 1)))] ^ appearanceHash >>> 8;
		if (l != 0L && appearanceHash != l) {
			Class43.playerModelsCache.remove(l);
		}
	}

	static final void method2039(final int i, final int i_11_, final int i_12_, final int i_13_, final int i_14_) {
		int i_15_ = (-32 + i) * i / i_12_;
		Class118.scrollBarSprites[0].drawReg(i_11_, i_13_);
		if (i_15_ < 8) {
			i_15_ = 8;
		}
		Class118.scrollBarSprites[1].drawReg(i_11_, i + i_13_ - 16);
		final int i_16_ = i_14_ * (-32 + i - i_15_) / (-i + i_12_);
		if (!HDToolkit.glEnabled) {
			GraphicsLD.fillRect(i_11_, i_13_ - -16, 16, i + -32, Varp.anInt623);
			GraphicsLD.fillRect(i_11_, 16 + i_13_ - -i_16_, 16, i_15_, JagexSocket.anInt414);
			GraphicsLD.drawVerticalLine(i_11_, i_16_ + i_13_ - -16, i_15_, client.anInt322);
			GraphicsLD.drawVerticalLine(1 + i_11_, 16 + i_13_ + i_16_, i_15_, client.anInt322);
			GraphicsLD.drawHorizontalLine(i_11_, 16 + i_13_ - -i_16_, 16, client.anInt322);
			GraphicsLD.drawHorizontalLine(i_11_, 17 + i_13_ - -i_16_, 16, client.anInt322);
			GraphicsLD.drawVerticalLine(15 + i_11_, i_16_ + i_13_ - -16, i_15_, Class120_Sub19.anInt2655);
			GraphicsLD.drawVerticalLine(i_11_ - -14, i_16_ + 17 + i_13_, -1 + i_15_, Class120_Sub19.anInt2655);
			GraphicsLD.drawHorizontalLine(i_11_, i_15_ + i_16_ + 15 + i_13_, 16, Class120_Sub19.anInt2655);
			GraphicsLD.drawHorizontalLine(i_11_ + 1, i_16_ + i_13_ + 14 - -i_15_, 15, Class120_Sub19.anInt2655);
		} else {
			GraphicsHD.fillRect(i_11_, 16 + i_13_, 16, i - 32, Varp.anInt623);
			GraphicsHD.fillRect(i_11_, i_13_ - (-16 + -i_16_), 16, i_15_, JagexSocket.anInt414);
			GraphicsHD.drawVerticalLine(i_11_, i_16_ + 16 + i_13_, i_15_, client.anInt322);
			GraphicsHD.drawVerticalLine(1 + i_11_, 16 + i_13_ + i_16_, i_15_, client.anInt322);
			GraphicsHD.drawHorizontalLine(i_11_, 16 + i_13_ - -i_16_, 16, client.anInt322);
			GraphicsHD.drawHorizontalLine(i_11_, i_16_ + i_13_ + 17, 16, client.anInt322);
			GraphicsHD.drawVerticalLine(i_11_ - -15, i_13_ - (-16 + -i_16_), i_15_, Class120_Sub19.anInt2655);
			GraphicsHD.drawVerticalLine(14 + i_11_, 17 + i_13_ + i_16_, i_15_ - 1, Class120_Sub19.anInt2655);
			GraphicsHD.drawHorizontalLine(i_11_, i_15_ + 15 + i_13_ + i_16_, 16, Class120_Sub19.anInt2655);
			GraphicsHD.drawHorizontalLine(i_11_ + 1, i_15_ + 14 + i_13_ - -i_16_, 15, Class120_Sub19.anInt2655);
		}
	}

	final AbstractModelRenderer method2040(final Class150[] class150s, final int i, final int i_17_, final int i_18_, final SeqType idleSeqType, final int i_19_, final boolean bool, final int i_21_, final SeqType animSeqType, final boolean bool_23_, final int i_24_) {
		if (this.npcId != -1) {
			return NpcType.list(this.npcId).method2212(i_19_, i_21_, idleSeqType, animSeqType, i_17_, class150s, i_18_, i, i_24_);
		}
		int[] appData = appearanceData;
		long hash = appearanceHash;
		if (animSeqType != null && (animSeqType.shieldDisplayed >= 0 || animSeqType.weaponDisplayed >= 0)) {
			appData = new int[12];
			for (int id = 0; id < 12; id++) {
				appData[id] = appearanceData[id];
			}
			if (animSeqType.shieldDisplayed >= 0) {
				if (animSeqType.shieldDisplayed == 65535) {//65535 to remove
					appData[5] = 0;
					hash ^= ~0xffffffffL;
				} else {
					appData[5] = animSeqType.shieldDisplayed | 0x40000000;
					hash ^= (long) appData[5] << 32;
				}
			}
			if (animSeqType.weaponDisplayed >= 0) {
				if (animSeqType.weaponDisplayed == 65535) {//65535 to remove
					appData[3] = 0;
					hash ^= 0xffffffffL;
				} else {
					appData[3] = animSeqType.weaponDisplayed | 0x40000000;
					hash ^= appData[3];
				}
			}
		}
		AbstractModelRenderer cachedModel = (AbstractModelRenderer) Class43.playerModelsCache.get(hash);
		if (cachedModel == null) {
			boolean failedToDownload = false;
			for (int id = 0; id < 12; id++) {
				final int data = appData[id];
				if ((data & 0x40000000) != 0) {//check if it's an object
					if (!ObjType.list(data & 0x3fffffff).modelsDownloaded(this.isFemale)) {
						failedToDownload = true;
					}
				} else if ((~0x7fffffff & data) != 0 && !Identikit.list(data & 0x3fffffff).modelsDownloaded()) {//checks
					failedToDownload = true;
				}
			}
			if (failedToDownload) {
				//if failed to download latest models for appearance display newest that we got, if not return null
				if (lastCachedModelHash != -1L) {
					cachedModel = (AbstractModelRenderer) Class43.playerModelsCache.get(lastCachedModelHash);
				}
				if (cachedModel == null) {
					return null;
				}
			}
			if (cachedModel == null) {
				final Model[] playerModels = new Model[12];
				for (int id = 0; id < 12; id++) {
					final int data = appData[id];
					if ((data & 0x40000000) != 0) {//check if it's an object
						final Model objectModel = ObjType.list(data & 0x3fffffff).method2103(this.isFemale);
						if (objectModel != null) {
							playerModels[id] = objectModel;
						}
					} else if ((~0x7fffffff & data) != 0) {
						final Model kitModel = Identikit.list(0x3fffffff & data).constructModel();
						if (kitModel != null) {
							playerModels[id] = kitModel;
						}
					}
				}
				EntityRenderData entityRenderData = null;
				if (entityRenderDataId != -1) {
					entityRenderData = EntityRenderData.list(entityRenderDataId);
					/*int i_15_ = 4;
					entityRenderData.anIntArrayArray215 = new int[12][];
					entityRenderData.anIntArrayArray215[i_15_] = new int[6];
					//for (int i_16_ = 0; i_16_ < 6; i_16_++) {
						entityRenderData.anIntArrayArray215[i_15_][4] = 1024;
					//}*/
				}
				if (entityRenderData != null && entityRenderData.modelRotateTranslate != null) {
					for (int id = 0; id < entityRenderData.modelRotateTranslate.length; id++) {
						if (entityRenderData.modelRotateTranslate[id] != null && playerModels[id] != null) {
							final int translateX = entityRenderData.modelRotateTranslate[id][0];
							final int translateY = entityRenderData.modelRotateTranslate[id][1];
							final int translateZ = entityRenderData.modelRotateTranslate[id][2];
							final int rotateX = entityRenderData.modelRotateTranslate[id][3];
							final int rotateZ = entityRenderData.modelRotateTranslate[id][5];
							final int rotateY = entityRenderData.modelRotateTranslate[id][4];
							if (anIntArrayArray1377 == null) {
								anIntArrayArray1377 = new int[entityRenderData.modelRotateTranslate.length][];
							}
							if (anIntArrayArray1377[id] == null) {
								final int[] is_39_ = anIntArrayArray1377[id] = new int[15];
								if (rotateX == 0 && rotateY == 0 && rotateZ == 0) {
									is_39_[13] = -translateY;
									is_39_[0] = is_39_[4] = is_39_[8] = 32768;
									is_39_[14] = -translateZ;
									is_39_[12] = -translateX;
								} else {
									final int i_41_ = Rasterizer.sinTable[rotateX] >> 1;
									final int i_40_ = Rasterizer.cosTable[rotateX] >> 1;
									final int i_44_ = Rasterizer.sinTable[rotateY] >> 1;
									final int i_42_ = Rasterizer.cosTable[rotateY] >> 1;
									final int i_43_ = Rasterizer.sinTable[rotateZ] >> 1;
									final int i_46_ = Rasterizer.cosTable[rotateZ] >> 1;
									final int i_45_ = i_41_ * i_43_ - -16384 >> 15;
									final int i_47_ = 16384 + i_46_ * i_41_ >> 15;
									is_39_[3] = 16384 + i_40_ * i_43_ >> 15;
									is_39_[1] = 16384 + -i_43_ * i_42_ - -(i_44_ * i_47_) >> 15;
									is_39_[8] = i_40_ * i_42_ - -16384 >> 15;
									is_39_[7] = 16384 + -i_43_ * -i_44_ - -(i_42_ * i_47_) >> 15;
									is_39_[6] = i_45_ * i_42_ + -i_44_ * i_46_ + 16384 >> 15;
									is_39_[4] = 16384 + i_40_ * i_46_ >> 15;
									is_39_[13] = 16384 + -translateZ * is_39_[7] + is_39_[1] * -translateX - -(is_39_[4] * -translateY) >> 15;
									is_39_[5] = -i_41_;
									is_39_[2] = i_40_ * i_44_ + 16384 >> 15;
									is_39_[0] = 16384 + i_42_ * i_46_ + i_44_ * i_45_ >> 15;
									is_39_[12] = is_39_[3] * -translateY + is_39_[0] * -translateX + -translateZ * is_39_[6] + 16384 >> 15;
									is_39_[14] = 16384 + is_39_[8] * -translateZ + -translateX * is_39_[2] + -translateY * is_39_[5] >> 15;
								}
								is_39_[10] = translateY;
								is_39_[9] = translateX;
								is_39_[11] = translateZ;
							}
							if (rotateX != 0 || rotateY != 0 || rotateZ != 0) {
								playerModels[id].rotate(rotateX, rotateY, rotateZ);
							}
							if (translateX != 0 || translateY != 0 || translateZ != 0) {
								playerModels[id].translate(translateX, translateY, translateZ);
							}
						}
					}
				}
				final Model class180_sub2 = new Model(playerModels, playerModels.length);
				for (int i_48_ = 0; i_48_ < 5; i_48_++) {
					if (Class159.aShortArrayArray1489[i_48_].length > this.colors[i_48_]) {
						class180_sub2.recolor(Class120_Sub12_Sub37.aShortArray3429[i_48_], Class159.aShortArrayArray1489[i_48_][this.colors[i_48_]]);
					}
					if (Class120_Sub30_Sub1.aShortArrayArray3668[i_48_].length > this.colors[i_48_]) {
						class180_sub2.recolor(SpotAnimType.aShortArray994[i_48_], Class120_Sub30_Sub1.aShortArrayArray3668[i_48_][this.colors[i_48_]]);
					}
				}
				cachedModel = class180_sub2.toRenderer(64, 850, -30, -50, -30);
				if (HDToolkit.glEnabled) {
					((HDModelRenderer) cachedModel).method2432(false, false, true, true, false, false, true);
				}
				if (bool_23_) {
					Class43.playerModelsCache.put(cachedModel, hash);
					lastCachedModelHash = hash;
				}
			}
		}
		boolean bool_49_ = false;
		boolean bool_50_ = false;
		boolean bool_51_ = false;
		boolean bool_52_ = false;
		final int i_53_ = class150s != null ? class150s.length : 0;
		for (int i_54_ = 0; i_54_ < i_53_; i_54_++) {
			if (class150s[i_54_] != null) {
				final SeqType class40_55_ = SeqType.list(class150s[i_54_].seqId);
				if (class40_55_.frames != null) {
					bool_49_ = true;
					GroundTile.aClass40Array2649[i_54_] = class40_55_;
					final int i_56_ = class150s[i_54_].frameId;
					final int i_57_ = class150s[i_54_].nextFrameId;
					int i_58_ = class40_55_.frames[i_56_];
					Class120_Sub21.aClass120_Sub14_Sub18Array2667[i_54_] = FrameGroup.list(i_58_ >>> 16);
					i_58_ &= 0xffff;
					MapFunctionType.anIntArray664[i_54_] = i_58_;
					if (Class120_Sub21.aClass120_Sub14_Sub18Array2667[i_54_] != null) {
						bool_51_ |= Class120_Sub21.aClass120_Sub14_Sub18Array2667[i_54_].method1579(i_58_);
						bool_50_ |= Class120_Sub21.aClass120_Sub14_Sub18Array2667[i_54_].method1578(i_58_);
						bool_52_ |= class40_55_.aBoolean341;
					}
					if (!class40_55_.tween && !Class164.forceTween || i_57_ == -1 || class40_55_.frames.length <= i_57_) {
						Class120_Sub12_Sub26.anIntArray3325[i_54_] = 0;
						Class71.anIntArray627[i_54_] = 0;
						Class120_Sub15.aClass120_Sub14_Sub18Array2595[i_54_] = null;
						QuickChatMessageType.anIntArray3533[i_54_] = -1;
					} else {
						Class120_Sub12_Sub26.anIntArray3325[i_54_] = class40_55_.delays[i_56_];
						Class71.anIntArray627[i_54_] = class150s[i_54_].frameDelay;
						int i_59_ = class40_55_.frames[i_57_];
						Class120_Sub15.aClass120_Sub14_Sub18Array2595[i_54_] = FrameGroup.list(i_59_ >>> 16);
						i_59_ &= 0xffff;
						QuickChatMessageType.anIntArray3533[i_54_] = i_59_;
						if (Class120_Sub15.aClass120_Sub14_Sub18Array2595[i_54_] != null) {
							bool_51_ |= Class120_Sub15.aClass120_Sub14_Sub18Array2595[i_54_].method1579(i_59_);
							bool_50_ |= Class120_Sub15.aClass120_Sub14_Sub18Array2595[i_54_].method1578(i_59_);
						}
					}
				}
			}
		}
		if (!bool_49_ && animSeqType == null && idleSeqType == null) {
			if (bool) {
				return cachedModel.method2376(false, false, false);
			}
			return cachedModel;
		}
		int i_60_ = -1;
		int i_61_ = -1;
		FrameGroup class120_sub14_sub18 = null;
		int i_62_ = 0;
		FrameGroup class120_sub14_sub18_63_ = null;
		if (animSeqType != null) {
			i_60_ = animSeqType.frames[i_19_];
			final int i_64_ = i_60_ >>> 16;
			i_60_ &= 0xffff;
			class120_sub14_sub18 = FrameGroup.list(i_64_);
			if (class120_sub14_sub18 != null) {
				bool_51_ |= class120_sub14_sub18.method1579(i_60_);
				bool_50_ |= class120_sub14_sub18.method1578(i_60_);
				bool_52_ |= animSeqType.aBoolean341;
			}
			if ((animSeqType.tween || Class164.forceTween) && i_17_ != -1 && i_17_ < animSeqType.frames.length) {
				i_61_ = animSeqType.frames[i_17_];
				final int i_65_ = i_61_ >>> 16;
				i_61_ &= 0xffff;
				i_62_ = animSeqType.delays[i_19_];
				if (i_65_ != i_64_) {
					class120_sub14_sub18_63_ = FrameGroup.list(i_61_ >>> 16);
				} else {
					class120_sub14_sub18_63_ = class120_sub14_sub18;
				}
				if (class120_sub14_sub18_63_ != null) {
					bool_51_ |= class120_sub14_sub18_63_.method1579(i_61_);
					bool_50_ |= class120_sub14_sub18_63_.method1578(i_61_);
				}
			}
		}
		int i_66_ = -1;
		int i_67_ = 0;
		int i_68_ = -1;
		FrameGroup class120_sub14_sub18_69_ = null;
		FrameGroup class120_sub14_sub18_70_ = null;
		if (idleSeqType != null) {
			i_68_ = idleSeqType.frames[i];
			final int i_71_ = i_68_ >>> 16;
			class120_sub14_sub18_70_ = FrameGroup.list(i_71_);
			i_68_ &= 0xffff;
			if (class120_sub14_sub18_70_ != null) {
				bool_51_ |= class120_sub14_sub18_70_.method1579(i_68_);
				bool_50_ |= class120_sub14_sub18_70_.method1578(i_68_);
				bool_52_ |= idleSeqType.aBoolean341;
			}
			if ((idleSeqType.tween || Class164.forceTween) && i_18_ != -1 && i_18_ < idleSeqType.frames.length) {
				i_67_ = idleSeqType.delays[i];
				i_66_ = idleSeqType.frames[i_18_];
				final int i_72_ = i_66_ >>> 16;
				i_66_ &= 0xffff;
				if (i_72_ != i_71_) {
					class120_sub14_sub18_69_ = FrameGroup.list(i_66_ >>> 16);
				} else {
					class120_sub14_sub18_69_ = class120_sub14_sub18_70_;
				}
				if (class120_sub14_sub18_69_ != null) {
					bool_51_ |= class120_sub14_sub18_69_.method1579(i_66_);
					bool_50_ |= class120_sub14_sub18_69_.method1578(i_66_);
				}
			}
		}
		final AbstractModelRenderer class180_sub7_73_ = cachedModel.method2376(!bool_50_, !bool_51_, !bool_52_);
		int i_74_ = 0;
		int i_75_ = 1;
		while (i_53_ > i_74_) {
			if (Class120_Sub21.aClass120_Sub14_Sub18Array2667[i_74_] != null) {
				class180_sub7_73_.method2384(Class120_Sub21.aClass120_Sub14_Sub18Array2667[i_74_], MapFunctionType.anIntArray664[i_74_], Class120_Sub15.aClass120_Sub14_Sub18Array2595[i_74_], QuickChatMessageType.anIntArray3533[i_74_], -1 + Class71.anIntArray627[i_74_], Class120_Sub12_Sub26.anIntArray3325[i_74_], i_75_, GroundTile.aClass40Array2649[i_74_].aBoolean341, anIntArrayArray1377[i_74_]);
			}
			i_74_++;
			i_75_ <<= 1;
		}
		if (class120_sub14_sub18 != null && class120_sub14_sub18_70_ != null) {
			class180_sub7_73_.method2361(class120_sub14_sub18, i_60_, class120_sub14_sub18_63_, i_61_, -1 + i_24_, i_62_, class120_sub14_sub18_70_, i_68_, class120_sub14_sub18_69_, i_66_, -1 + i_21_, i_67_, animSeqType.aBooleanArray327, idleSeqType.aBoolean341 | animSeqType.aBoolean341);
		} else if (class120_sub14_sub18 == null) {
			if (class120_sub14_sub18_70_ != null) {
				class180_sub7_73_.method2380(class120_sub14_sub18_70_, i_68_, class120_sub14_sub18_69_, i_66_, -1 + i_21_, i_67_, idleSeqType.aBoolean341);
			}
		} else {
			class180_sub7_73_.method2380(class120_sub14_sub18, i_60_, class120_sub14_sub18_63_, i_61_, -1 + i_24_, i_62_, animSeqType.aBoolean341);
		}
		for (int id = 0; id < i_53_; id++) {
			Class120_Sub21.aClass120_Sub14_Sub18Array2667[id] = null;
			Class120_Sub15.aClass120_Sub14_Sub18Array2595[id] = null;
			GroundTile.aClass40Array2649[id] = null;
		}
		return class180_sub7_73_;
	}

	final AbstractModelRenderer method2041(final SeqType seqType, final int i_76_, final int i_77_, final int i_78_, final int i_79_, final int i_80_, final int i_81_) {
		final long l = (long) i_77_ << 32 | i_76_ << 16 | i_80_;
		AbstractModelRenderer class180_sub7_82_ = (AbstractModelRenderer) Class90.playerHeadModelsCache.get(l);
		if (class180_sub7_82_ == null) {
			int i_83_ = 0;
			final Model[] class180_sub2s = new Model[3];
			if (!Identikit.list(i_80_).headModelsDownloaded() || !Identikit.list(i_76_).headModelsDownloaded() || !Identikit.list(i_77_).headModelsDownloaded()) {
				return null;
			}
			Model class180_sub2 = Identikit.list(i_80_).constructHeadModel();
			if (class180_sub2 != null) {
				class180_sub2s[i_83_++] = class180_sub2;
			}
			class180_sub2 = Identikit.list(i_76_).constructHeadModel();
			if (class180_sub2 != null) {
				class180_sub2s[i_83_++] = class180_sub2;
			}
			class180_sub2 = Identikit.list(i_77_).constructHeadModel();
			if (class180_sub2 != null) {
				class180_sub2s[i_83_++] = class180_sub2;
			}
			class180_sub2 = new Model(class180_sub2s, i_83_);
			for (int i_84_ = 0; i_84_ < 5; i_84_++) {
				if (Class159.aShortArrayArray1489[i_84_].length > this.colors[i_84_]) {
					class180_sub2.recolor(Class120_Sub12_Sub37.aShortArray3429[i_84_], Class159.aShortArrayArray1489[i_84_][this.colors[i_84_]]);
				}
				if (Class120_Sub30_Sub1.aShortArrayArray3668[i_84_].length > this.colors[i_84_]) {
					class180_sub2.recolor(SpotAnimType.aShortArray994[i_84_], Class120_Sub30_Sub1.aShortArrayArray3668[i_84_][this.colors[i_84_]]);
				}
			}
			class180_sub7_82_ = class180_sub2.toRenderer(64, 768, -50, -10, -50);
			Class90.playerHeadModelsCache.put(class180_sub7_82_, l);
		}
		if (seqType != null) {
			class180_sub7_82_ = seqType.method323(class180_sub7_82_, i_79_, i_81_, i_78_);
		}
		return class180_sub7_82_;
	}

	final void init(final int i_85_, int[] is, final int i_86_, final int[] is_87_, final boolean bool) {
		if (entityRenderDataId != i_86_) {
			entityRenderDataId = i_86_;
			anIntArrayArray1377 = null;
		}
		if (is == null) {
			is = new int[12];
			for (int i_88_ = 0; i_88_ < 8; i_88_++) {
				for (int i_89_ = 0; i_89_ < Identikit.identikitLength; i_89_++) {
					final Identikit identityKit = Identikit.list(i_89_);
					if (identityKit != null && !identityKit.noInterface && ((bool ? Class120_Sub12_Sub27.anIntArray3349[i_88_] : ObjType.anIntArray1520[i_88_]) ^ 0xffffffff) == (identityKit.partId ^ 0xffffffff)) {
						is[Class120_Sub12_Sub3.anIntArray3148[i_88_]] = ChunkAtmosphere.method2512(-2147483648, i_89_);
						break;
					}
				}
			}
		}
		appearanceData = is;
		this.colors = is_87_;
		this.isFemale = bool;
		this.npcId = i_85_;
		updateApperanceHash();
	}

	final int method2043() {
		if (this.npcId != -1) {
			return NpcType.list(this.npcId).myId + 0x12345678;
		}
		return (appearanceData[8] << 10) + (this.colors[0] << 25) + (this.colors[4] << 20) + (appearanceData[0] << 15) + (appearanceData[11] << 5) + appearanceData[1];
	}

	final AbstractModelRenderer method2044(final SeqType seqType, final int i, final int i_91_, final int i_92_) {
		if (this.npcId != -1) {
			return NpcType.list(this.npcId).method2210(seqType, i_91_, i, i_92_);
		}
		AbstractModelRenderer class180_sub7_94_ = (AbstractModelRenderer) Class90.playerHeadModelsCache.get(appearanceHash);
		if (class180_sub7_94_ == null) {
			boolean bool = false;
			for (int i_95_ = 0; i_95_ < 12; i_95_++) {
				final int i_96_ = appearanceData[i_95_];
				if ((i_96_ & 0x40000000) == 0) {
					if ((~0x7fffffff & i_96_) != 0 && !Identikit.list(i_96_ & 0x3fffffff).headModelsDownloaded()) {
						bool = true;
					}
				} else if (!ObjType.list(0x3fffffff & i_96_).method2116(this.isFemale)) {
					bool = true;
				}
			}
			if (bool) {
				return null;
			}
			final Model[] class180_sub2s = new Model[12];
			int i_97_ = 0;
			for (int i_98_ = 0; i_98_ < 12; i_98_++) {
				final int i_99_ = appearanceData[i_98_];
				if ((0x40000000 & i_99_) != 0) {
					final Model class180_sub2 = ObjType.list(i_99_ & 0x3fffffff).method2107(this.isFemale);
					if (class180_sub2 != null) {
						class180_sub2s[i_97_++] = class180_sub2;
					}
				} else if ((~0x7fffffff & i_99_) != 0) {
					final Model class180_sub2 = Identikit.list(0x3fffffff & i_99_).constructHeadModel();
					if (class180_sub2 != null) {
						class180_sub2s[i_97_++] = class180_sub2;
					}
				}
			}
			final Model class180_sub2 = new Model(class180_sub2s, i_97_);
			for (int i_100_ = 0; i_100_ < 5; i_100_++) {
				if (Class159.aShortArrayArray1489[i_100_].length > this.colors[i_100_]) {
					class180_sub2.recolor(Class120_Sub12_Sub37.aShortArray3429[i_100_], Class159.aShortArrayArray1489[i_100_][this.colors[i_100_]]);
				}
				if (this.colors[i_100_] < Class120_Sub30_Sub1.aShortArrayArray3668[i_100_].length) {
					class180_sub2.recolor(SpotAnimType.aShortArray994[i_100_], Class120_Sub30_Sub1.aShortArrayArray3668[i_100_][this.colors[i_100_]]);
				}
			}
			class180_sub7_94_ = class180_sub2.toRenderer(64, 768, -50, -10, -50);
			Class90.playerHeadModelsCache.put(class180_sub7_94_, appearanceHash);
		}
		if (seqType != null) {
			class180_sub7_94_ = seqType.method323(class180_sub7_94_, i, i_91_, i_92_);
		}
		return class180_sub7_94_;
	}

	final void setColor(final int index, final int color) {
		this.colors[index] = color;
		updateApperanceHash();
	}

	public PlayerAppearance() {
		/* empty */
	}
}
