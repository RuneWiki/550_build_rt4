/* Class170 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class NpcType {
	byte spawnDirection;
	boolean hasShadow;
	private short[] recolorOriginal;
	int cursor2op = -1;
	boolean aBoolean1656;
	int anInt1657;
	int ambientSoundVolume;
	private int[][] anIntArrayArray1659;
	static int anInt1660;
	private Hashtable params;
	short aShort1662;
	private int varbitId;
	int headIcon;
	private int contrast;
	int anInt1666;
	private short[] retextureModified;
	int anInt1668;
	private int[] headModelIds;
	private int[][] anIntArrayArray1670;
	boolean displayOnMinimap;
	int anInt1672;
	int cursor1op;
	int combatLevel;
	private int resizeX;
	int anInt1676;
	int ambientSoundHearDistance;
	private int[] modelIds;
	int[] transmogrificationIds;
	private short[] retextureOriginal;
	int anInt1681;
	int anInt1682;
	short aShort1683;
	private int ambient;
	int myId;
	static Signlink gameSignlink;
	boolean canRightClick;
	private short[] recolorModified;
	int cursor2;
	int iconHeight;
	int anInt1692;
	int size;
	byte aByte1694;
	int cursor1;
	private int resizeY;
	private int varpId;
	int mapFunctionId;
	byte aByte1699;
	byte aByte1700;
	boolean aBoolean1701;
	static int anInt1702 = 0;
	String[] options;
	private byte[] recolorPalette;
	String name;
	boolean render;
	static boolean npcMemberClient;
	static js5 aClass50_181;
	static ObjectCache aClass21_80 = new ObjectCache(50);
	static js5 configClient;
	static ObjectCache recentUse = new ObjectCache(64);

	final boolean method2199() {
		if (this.transmogrificationIds == null) {
			return true;
		}
		int i_0_ = -1;
		if (varbitId != -1) {
			i_0_ = VarBit.getVarbitValue(varbitId);
		} else if (varpId != -1) {
			i_0_ = Class2.permanentVariable[varpId];
		}
		if (i_0_ < 0 || i_0_ >= this.transmogrificationIds.length - 1 || this.transmogrificationIds[i_0_] == -1) {
			final int i_1_ = this.transmogrificationIds[this.transmogrificationIds.length - 1];
			if (i_1_ == -1) {
				return false;
			}
			return true;
		}
		return true;
	}

	final String getStringParamValue(final int param, final String defaultString) {
		if (params == null) {
			return defaultString;
		}
		final StringNode stringNode = (StringNode) params.get(param);
		if (stringNode == null) {
			return defaultString;
		}
		return stringNode.value;
	}

	private final void decode(final Buffer buffer, final int code) {
		if (code == 1) {
			final int len = buffer.getUByte();
			modelIds = new int[len];
			for (int id = 0; id < len; id++) {
				modelIds[id] = buffer.getUShort();
				if (modelIds[id] == 0xffff) {
					modelIds[id] = -1;
				}
			}
		} else if (code == 2) {
			name = buffer.getJagexString();
		} else if (code == 12) {
			size = buffer.getUByte();
		} else if (code >= 30 && code < 35) {
			options[code - 30] = buffer.getJagexString();
			if (options[code - 30].equalsIgnoreCase(TextRepository.hidden)) {
				options[code - 30] = null;
			}
		} else if (code == 40) {
			final int len = buffer.getUByte();
			recolorOriginal = new short[len];
			recolorModified = new short[len];
			for (int id = 0; id < len; id++) {
				recolorOriginal[id] = (short) buffer.getUShort();
				recolorModified[id] = (short) buffer.getUShort();
			}
		} else if (code == 41) {
			final int len = buffer.getUByte();
			retextureOriginal = new short[len];
			retextureModified = new short[len];
			for (int id = 0; id < len; id++) {
				retextureOriginal[id] = (short) buffer.getUShort();
				retextureModified[id] = (short) buffer.getUShort();
			}
		} else if (code == 42) {
			final int len = buffer.getUByte();
			recolorPalette = new byte[len];
			for (int id = 0; id < len; id++) {
				recolorPalette[id] = buffer.getByte();
			}
		} else if (code == 60) {
			final int len = buffer.getUByte();
			headModelIds = new int[len];
			for (int id = 0; id < len; id++) {
				headModelIds[id] = buffer.getUShort();
			}
		} else if (code == 93) {
			displayOnMinimap = false;
		} else if (code == 95) {
			combatLevel = buffer.getUShort();
		} else if (code == 97) {
			resizeX = buffer.getUShort();
		} else if (code == 98) {
			resizeY = buffer.getUShort();
		} else if (code == 99) {
			render = true;
		} else if (code == 100) {
			ambient = buffer.getByte();
		} else if (code == 101) {
			contrast = buffer.getByte() * 5;
		} else if (code == 102) {
			headIcon = buffer.getUShort();
		} else if (code == 103) {
			anInt1672 = buffer.getUShort();
		} else if (code == 106 || code == 118) {
			varbitId = buffer.getUShort();
			int i_13_ = -1;
			if (varbitId == 0xffff) {
				varbitId = -1;
			}
			varpId = buffer.getUShort();
			if (varpId == 0xffff) {
				varpId = -1;
			}
			if (code == 118) {
				i_13_ = buffer.getUShort();
				if (i_13_ == 0xffff) {
					i_13_ = -1;
				}
			}
			final int len = buffer.getUByte();
			transmogrificationIds = new int[len + 2];
			for (int id = 0; id <= len; id++) {
				transmogrificationIds[id] = buffer.getUShort();
				if (transmogrificationIds[id] == 0xffff) {
					transmogrificationIds[id] = -1;
				}
			}
			transmogrificationIds[len + 1] = i_13_;
		} else if (code == 107) {
			canRightClick = false;
		} else if (code == 109) {
			aBoolean1701 = false;
		} else if (code == 111) {
			hasShadow = false;
		} else if (code == 113) {
			aShort1683 = (short) buffer.getUShort();
			aShort1662 = (short) buffer.getUShort();
		} else if (code == 114) {
			aByte1694 = buffer.getByte();
			aByte1699 = buffer.getByte();
		} else if (code == 115) {
			buffer.getUByte();
			buffer.getUByte();
		} else if (code == 119) {
			aByte1700 = buffer.getByte();
		} else if (code == 121) {
			anIntArrayArray1670 = new int[modelIds.length][];
			final int i_20_ = buffer.getUByte();
			for (int i_21_ = 0; i_21_ < i_20_; i_21_++) {
				final int i_22_ = buffer.getUByte();
				final int[] is = anIntArrayArray1670[i_22_] = new int[3];
				is[0] = buffer.getByte();
				is[1] = buffer.getByte();
				is[2] = buffer.getByte();
			}
		} else if (code == 122) {
			anInt1666 = buffer.getUShort();
		} else if (code == 123) {
			iconHeight = buffer.getUShort();
		} else if (code == 125) {
			spawnDirection = buffer.getByte();
		} else if (code == 127) {
			anInt1692 = buffer.getUShort();
		} else if (code == 128) {
			buffer.getUByte();
		} else if (code == 134) {
			anInt1681 = buffer.getUShort();
			if (anInt1681 == 65535) {
				anInt1681 = -1;
			}
			anInt1657 = buffer.getUShort();
			if (anInt1657 == 65535) {
				anInt1657 = -1;
			}
			anInt1682 = buffer.getUShort();
			if (anInt1682 == 65535) {
				anInt1682 = -1;
			}
			anInt1676 = buffer.getUShort();
			if (anInt1676 == 65535) {
				anInt1676 = -1;
			}
			ambientSoundHearDistance = buffer.getUByte();
		} else if (code == 135) {
			cursor1op = buffer.getUByte();
			cursor1 = buffer.getUShort();
		} else if (code == 136) {
			cursor2op = buffer.getUByte();
			cursor2 = buffer.getUShort();
		} else if (code == 137) {
			anInt1668 = buffer.getUShort();
		} else if (code == 140) {
			ambientSoundVolume = buffer.getUByte();
		} else if (code == 141) {
			aBoolean1656 = true;
		} else if (code == 142) {
			mapFunctionId = buffer.getUShort();
		} else if (code >= 150 && code < 155) {
			options[code - 150] = buffer.getJagexString();
			if (!NpcType.npcMemberClient || options[code - 150].equalsIgnoreCase(TextRepository.hidden)) {
				options[code - 150] = null;
			}
		} else if (code == 249) {
			final int i_16_ = buffer.getUByte();
			if (params == null) {
				final int i_17_ = Class120_Sub12_Sub17.getFarestBitValue(i_16_);
				params = new Hashtable(i_17_);
			}
			for (int i_18_ = 0; i_18_ < i_16_; i_18_++) {
				final boolean bool = buffer.getUByte() == 1;
				final int i_19_ = buffer.getMedium();
				Node node;
				if (bool) {
					node = new StringNode(buffer.getJagexString());
				} else {
					node = new IntegerNode(buffer.getInt());
				}
				params.put(node, i_19_);
			}
		}
	}

	final boolean hasAmbientSound() {
		if (this.transmogrificationIds == null) {
			if (this.anInt1681 == -1 && this.anInt1682 == -1 && this.anInt1676 == -1) {
				return false;
			}
			return true;
		}
		for (int id = 0; id < this.transmogrificationIds.length; id++) {
			if (this.transmogrificationIds[id] != -1) {
				final NpcType npcType = list(this.transmogrificationIds[id]);
				if (npcType.anInt1681 != -1 || npcType.anInt1682 != -1 || npcType.anInt1676 != -1) {
					return true;
				}
			}
		}
		return false;
	}

	final int getIntegerParamValue(final int param, final int defaultInt) {
		if (params == null) {
			return defaultInt;
		}
		final IntegerNode integerNode = (IntegerNode) params.get(param);
		if (integerNode == null) {
			return defaultInt;
		}
		return integerNode.value;
	}

	final void decode(final Buffer buffer) {
		for (;;) {
			final int code = buffer.getUByte();
			if (code == 0) {
				break;
			}
			decode(buffer, code);
		}
	}

	final NpcType handleVarp() {
		int value = -1;
		if (varbitId != -1) {
			value = VarBit.getVarbitValue(varbitId);
		} else if (varpId != -1) {
			value = Class2.permanentVariable[varpId];
		}
		if (value < 0 || value >= this.transmogrificationIds.length - 1 || this.transmogrificationIds[value] == -1) {
			final int newId = this.transmogrificationIds[this.transmogrificationIds.length - 1];
			if (newId == -1) {
				return null;
			}
			return list(newId);
		}
		return list(this.transmogrificationIds[value]);
	}

	final AbstractModelRenderer method2210(final SeqType seqType, final int i, final int i_39_, final int i_40_) {
		if (this.transmogrificationIds != null) {
			final NpcType class170_41_ = handleVarp();
			if (class170_41_ == null) {
				return null;
			}
			return class170_41_.method2210(seqType, i, i_39_, i_40_);
		}
		if (headModelIds == null) {
			return null;
		}
		AbstractModelRenderer class180_sub7_42_ = (AbstractModelRenderer) Projectile.aClass21_2931.get(this.myId);
		if (class180_sub7_42_ == null) {
			boolean bool = false;
			for (int i_43_ = 0; headModelIds.length > i_43_; i_43_++) {
				if (!aClass50_181.requestDownload(headModelIds[i_43_], 0)) {
					bool = true;
				}
			}
			if (bool) {
				return null;
			}
			final Model[] class180_sub2s = new Model[headModelIds.length];
			for (int i_44_ = 0; i_44_ < headModelIds.length; i_44_++) {
				class180_sub2s[i_44_] = Model.get(aClass50_181, headModelIds[i_44_], 0);
			}
			Model class180_sub2;
			if (class180_sub2s.length != 1) {
				class180_sub2 = new Model(class180_sub2s, class180_sub2s.length);
			} else {
				class180_sub2 = class180_sub2s[0];
			}
			if (recolorOriginal != null) {
				for (int i_45_ = 0; recolorOriginal.length > i_45_; i_45_++) {
					if (recolorPalette != null && recolorPalette.length > i_45_) {
						class180_sub2.recolor(recolorOriginal[i_45_], Class69_Sub3_Sub1.aShortArray3085[recolorPalette[i_45_] & 0xff]);
					} else {
						class180_sub2.recolor(recolorOriginal[i_45_], recolorModified[i_45_]);
					}
				}
			}
			if (retextureOriginal != null) {
				for (int i_46_ = 0; i_46_ < retextureOriginal.length; i_46_++) {
					class180_sub2.retexture(retextureOriginal[i_46_], retextureModified[i_46_]);
				}
			}
			class180_sub7_42_ = class180_sub2.toRenderer(64, 768, -50, -10, -50);
			Projectile.aClass21_2931.put(class180_sub7_42_, this.myId);
		}
		if (seqType != null) {
			class180_sub7_42_ = seqType.method323(class180_sub7_42_, i_39_, i, i_40_);
		}
		return class180_sub7_42_;
	}

	static final void sleep(final long millis) {
		try {
			Thread.sleep(millis);
		} catch (final InterruptedException interruptedexception) {
			/* empty */
		}
	}

	final AbstractModelRenderer method2212(final int i, final int i_47_, final SeqType seqType, final SeqType class40_49_, final int i_50_, final Class150[] class150s, final int i_51_, final int i_52_, final int i_53_) {
		if (this.transmogrificationIds != null) {
			final NpcType class170_54_ = handleVarp();
			if (class170_54_ == null) {
				return null;
			}
			return class170_54_.method2212(i, i_47_, seqType, class40_49_, i_50_, class150s, i_51_, i_52_, i_53_);
		}
		AbstractModelRenderer class180_sub7_55_ = (AbstractModelRenderer) aClass21_80.get(this.myId);
		if (class180_sub7_55_ == null) {
			boolean bool = false;
			for (int i_56_ = 0; i_56_ < modelIds.length; i_56_++) {
				if (modelIds[i_56_] != -1 && !aClass50_181.requestDownload(modelIds[i_56_], 0)) {
					bool = true;
				}
			}
			if (bool) {
				return null;
			}
			final Model[] class180_sub2s = new Model[modelIds.length];
			for (int i_57_ = 0; i_57_ < modelIds.length; i_57_++) {
				if (modelIds[i_57_] != -1) {
					class180_sub2s[i_57_] = Model.get(aClass50_181, modelIds[i_57_], 0);
					if (anIntArrayArray1670 != null && anIntArrayArray1670[i_57_] != null && class180_sub2s[i_57_] != null) {
						class180_sub2s[i_57_].translate(anIntArrayArray1670[i_57_][0], anIntArrayArray1670[i_57_][1], anIntArrayArray1670[i_57_][2]);
					}
				}
			}
			EntityRenderData class29 = null;
			if (this.anInt1692 != -1) {
				class29 = EntityRenderData.list(this.anInt1692);
			}
			if (class29 != null && class29.modelRotateTranslate != null) {
				for (int i_58_ = 0; class29.modelRotateTranslate.length > i_58_; i_58_++) {
					if (class29.modelRotateTranslate[i_58_] != null && i_58_ < class180_sub2s.length && class180_sub2s[i_58_] != null) {
						final int i_59_ = class29.modelRotateTranslate[i_58_][0];
						final int i_60_ = class29.modelRotateTranslate[i_58_][3];
						final int i_61_ = class29.modelRotateTranslate[i_58_][2];
						final int i_62_ = class29.modelRotateTranslate[i_58_][1];
						final int i_63_ = class29.modelRotateTranslate[i_58_][4];
						final int i_64_ = class29.modelRotateTranslate[i_58_][5];
						if (anIntArrayArray1659 == null) {
							anIntArrayArray1659 = new int[class29.modelRotateTranslate.length][];
						}
						if (anIntArrayArray1659[i_58_] == null) {
							final int[] is = anIntArrayArray1659[i_58_] = new int[15];
							if (i_60_ != 0 || i_63_ != 0 || i_64_ != 0) {
								final int i_65_ = Rasterizer.cosTable[i_60_] >> 1;
								final int i_66_ = Rasterizer.sinTable[i_60_] >> 1;
								final int i_67_ = Rasterizer.cosTable[i_63_] >> 1;
								final int i_68_ = Rasterizer.sinTable[i_63_] >> 1;
								final int i_69_ = Rasterizer.cosTable[i_64_] >> 1;
								final int i_70_ = Rasterizer.sinTable[i_64_] >> 1;
								final int i_71_ = 16384 + i_69_ * i_66_ >> 15;
								is[8] = i_67_ * i_65_ - -16384 >> 15;
								is[5] = -i_66_;
								is[1] = 16384 + i_68_ * i_71_ + -i_70_ * i_67_ >> 15;
								is[4] = i_65_ * i_69_ - -16384 >> 15;
								final int i_72_ = i_70_ * i_66_ - -16384 >> 15;
								is[6] = 16384 + i_69_ * -i_68_ - -(i_67_ * i_72_) >> 15;
								is[3] = i_70_ * i_65_ + 16384 >> 15;
								is[2] = i_65_ * i_68_ - -16384 >> 15;
								is[0] = i_72_ * i_68_ + i_69_ * i_67_ - -16384 >> 15;
								is[7] = 16384 + -i_70_ * -i_68_ + i_71_ * i_67_ >> 15;
								is[12] = is[6] * -i_61_ + is[0] * -i_59_ - (-(-i_62_ * is[3]) - 16384) >> 15;
								is[13] = -i_62_ * is[4] + is[1] * -i_59_ - (-(is[7] * -i_61_) + -16384) >> 15;
								is[14] = 16384 + is[8] * -i_61_ + -i_59_ * is[2] + -i_62_ * is[5] >> 15;
							} else {
								is[13] = -i_62_;
								is[0] = is[4] = is[8] = 32768;
								is[12] = -i_59_;
								is[14] = -i_61_;
							}
							is[10] = i_62_;
							is[11] = i_61_;
							is[9] = i_59_;
						}
						if (i_60_ != 0 || i_63_ != 0 || i_64_ != 0) {
							class180_sub2s[i_58_].rotate(i_60_, i_63_, i_64_);
						}
						if (i_59_ != 0 || i_62_ != 0 || i_61_ != 0) {
							class180_sub2s[i_58_].translate(i_59_, i_62_, i_61_);
						}
					}
				}
			}
			Model class180_sub2;
			if (class180_sub2s.length == 1) {
				class180_sub2 = class180_sub2s[0];
			} else {
				class180_sub2 = new Model(class180_sub2s, class180_sub2s.length);
			}
			if (recolorOriginal != null) {
				for (int i_73_ = 0; recolorOriginal.length > i_73_; i_73_++) {
					if (recolorPalette == null || i_73_ >= recolorPalette.length) {
						class180_sub2.recolor(recolorOriginal[i_73_], recolorModified[i_73_]);
					} else {
						class180_sub2.recolor(recolorOriginal[i_73_], Class69_Sub3_Sub1.aShortArray3085[recolorPalette[i_73_] & 0xff]);
					}
				}
			}
			if (retextureOriginal != null) {
				for (int i_74_ = 0; i_74_ < retextureOriginal.length; i_74_++) {
					class180_sub2.retexture(retextureOriginal[i_74_], retextureModified[i_74_]);
				}
			}
			class180_sub7_55_ = class180_sub2.toRenderer(ambient + 64, contrast + 850, -30, -50, -30);
			if (HDToolkit.glEnabled) {
				((HDModelRenderer) class180_sub7_55_).method2432(false, false, false, true, false, false, true);
			}
			aClass21_80.put(class180_sub7_55_, this.myId);
		}
		boolean bool = false;
		boolean bool_75_ = false;
		boolean bool_76_ = false;
		boolean bool_77_ = false;
		final int i_78_ = class150s != null ? class150s.length : 0;
		for (int i_79_ = 0; i_79_ < i_78_; i_79_++) {
			if (class150s[i_79_] != null) {
				final SeqType class40_80_ = SeqType.list(class150s[i_79_].seqId);
				if (class40_80_.frames != null) {
					FileSystem.aClass40Array458[i_79_] = class40_80_;
					bool = true;
					final int i_81_ = class150s[i_79_].frameId;
					final int i_82_ = class150s[i_79_].nextFrameId;
					int i_83_ = class40_80_.frames[i_81_];
					EnumType.aClass120_Sub14_Sub18Array3453[i_79_] = FrameLoader.list(i_83_ >>> 16);
					i_83_ &= 0xffff;
					SpotAnimation.anIntArray2918[i_79_] = i_83_;
					if (EnumType.aClass120_Sub14_Sub18Array3453[i_79_] != null) {
						bool_76_ |= EnumType.aClass120_Sub14_Sub18Array3453[i_79_].method1579(i_83_);
						bool_75_ |= EnumType.aClass120_Sub14_Sub18Array3453[i_79_].method1578(i_83_);
						bool_77_ |= class40_80_.aBoolean341;
					}
					if ((class40_80_.tween || Class164.forceTween) && (i_82_ ^ 0xffffffff) != 0 && i_82_ < class40_80_.frames.length) {
						ReflectionCheckNode.anIntArray2761[i_79_] = class40_80_.delays[i_81_];
						ObjectCache.anIntArray124[i_79_] = class150s[i_79_].frameDelay;
						int i_84_ = class40_80_.frames[i_82_];
						DummyOutputStream.aClass120_Sub14_Sub18Array31[i_79_] = FrameLoader.list(i_84_ >>> 16);
						i_84_ &= 0xffff;
						Class120_Sub12.anIntArray2567[i_79_] = i_84_;
						if (DummyOutputStream.aClass120_Sub14_Sub18Array31[i_79_] != null) {
							bool_76_ |= DummyOutputStream.aClass120_Sub14_Sub18Array31[i_79_].method1579(i_84_);
							bool_75_ |= DummyOutputStream.aClass120_Sub14_Sub18Array31[i_79_].method1578(i_84_);
						}
					} else {
						ReflectionCheckNode.anIntArray2761[i_79_] = 0;
						ObjectCache.anIntArray124[i_79_] = 0;
						DummyOutputStream.aClass120_Sub14_Sub18Array31[i_79_] = null;
						Class120_Sub12.anIntArray2567[i_79_] = -1;
					}
				}
			}
		}
		if (!bool && class40_49_ == null && seqType == null) {
			final AbstractModelRenderer class180_sub7_85_ = class180_sub7_55_.method2376(true, true, true);
			if (resizeX != 128 || resizeY != 128) {
				class180_sub7_85_.resize(resizeX, resizeY, resizeX);
			}
			return class180_sub7_85_;
		}
		int i_86_ = -1;
		int i_87_ = -1;
		FrameLoader class120_sub14_sub18 = null;
		FrameLoader class120_sub14_sub18_88_ = null;
		int i_89_ = 0;
		if (class40_49_ != null) {
			i_87_ = class40_49_.frames[i];
			final int i_90_ = i_87_ >>> 16;
			class120_sub14_sub18 = FrameLoader.list(i_90_);
			i_87_ &= 0xffff;
			if (class120_sub14_sub18 != null) {
				bool_76_ |= class120_sub14_sub18.method1579(i_87_);
				bool_75_ |= class120_sub14_sub18.method1578(i_87_);
				bool_77_ |= class40_49_.aBoolean341;
			}
			if ((class40_49_.tween || Class164.forceTween) && i_50_ != -1 && i_50_ < class40_49_.frames.length) {
				i_86_ = class40_49_.frames[i_50_];
				i_89_ = class40_49_.delays[i];
				final int i_91_ = i_86_ >>> 16;
				i_86_ &= 0xffff;
				if (i_91_ != i_90_) {
					class120_sub14_sub18_88_ = FrameLoader.list(i_86_ >>> 16);
				} else {
					class120_sub14_sub18_88_ = class120_sub14_sub18;
				}
				if (class120_sub14_sub18_88_ != null) {
					bool_76_ |= class120_sub14_sub18_88_.method1579(i_86_);
					bool_75_ |= class120_sub14_sub18_88_.method1578(i_86_);
				}
			}
		}
		int i_92_ = -1;
		int i_93_ = -1;
		int i_94_ = 0;
		FrameLoader class120_sub14_sub18_95_ = null;
		FrameLoader class120_sub14_sub18_96_ = null;
		if (seqType != null) {
			i_93_ = seqType.frames[i_52_];
			final int i_97_ = i_93_ >>> 16;
			i_93_ &= 0xffff;
			class120_sub14_sub18_95_ = FrameLoader.list(i_97_);
			if (class120_sub14_sub18_95_ != null) {
				bool_76_ |= class120_sub14_sub18_95_.method1579(i_93_);
				bool_75_ |= class120_sub14_sub18_95_.method1578(i_93_);
				bool_77_ |= seqType.aBoolean341;
			}
			if ((seqType.tween || Class164.forceTween) && i_51_ != -1 && i_51_ < seqType.frames.length) {
				i_94_ = seqType.delays[i_52_];
				i_92_ = seqType.frames[i_51_];
				final int i_98_ = i_92_ >>> 16;
				i_92_ &= 0xffff;
				if (i_98_ == i_97_) {
					class120_sub14_sub18_96_ = class120_sub14_sub18_95_;
				} else {
					class120_sub14_sub18_96_ = FrameLoader.list(i_92_ >>> 16);
				}
				if (class120_sub14_sub18_96_ != null) {
					bool_76_ |= class120_sub14_sub18_96_.method1579(i_92_);
					bool_75_ |= class120_sub14_sub18_96_.method1578(i_92_);
				}
			}
		}
		final AbstractModelRenderer class180_sub7_99_ = class180_sub7_55_.method2376(!bool_75_, !bool_76_, !bool_77_);
		int i_100_ = 1;
		for (int i_101_ = 0; i_101_ < i_78_; i_101_++) {
			if (EnumType.aClass120_Sub14_Sub18Array3453[i_101_] != null) {
				class180_sub7_99_.method2384(EnumType.aClass120_Sub14_Sub18Array3453[i_101_], SpotAnimation.anIntArray2918[i_101_], DummyOutputStream.aClass120_Sub14_Sub18Array31[i_101_], Class120_Sub12.anIntArray2567[i_101_], ObjectCache.anIntArray124[i_101_] - 1, ReflectionCheckNode.anIntArray2761[i_101_], i_100_, FileSystem.aClass40Array458[i_101_].aBoolean341, anIntArrayArray1659[i_101_]);
			}
			i_100_ <<= 1;
		}
		if (class120_sub14_sub18 == null || class120_sub14_sub18_95_ == null) {
			if (class120_sub14_sub18 != null) {
				class180_sub7_99_.method2380(class120_sub14_sub18, i_87_, class120_sub14_sub18_88_, i_86_, i_53_ + -1, i_89_, class40_49_.aBoolean341);
			} else if (class120_sub14_sub18_95_ != null) {
				class180_sub7_99_.method2380(class120_sub14_sub18_95_, i_93_, class120_sub14_sub18_96_, i_92_, -1 + i_47_, i_94_, seqType.aBoolean341);
			}
		} else {
			class180_sub7_99_.method2361(class120_sub14_sub18, i_87_, class120_sub14_sub18_88_, i_86_, i_53_ + -1, i_89_, class120_sub14_sub18_95_, i_93_, class120_sub14_sub18_96_, i_92_, -1 + i_47_, i_94_, class40_49_.aBooleanArray327, class40_49_.aBoolean341 | seqType.aBoolean341);
		}
		for (int i_102_ = 0; i_102_ < i_78_; i_102_++) {
			EnumType.aClass120_Sub14_Sub18Array3453[i_102_] = null;
			DummyOutputStream.aClass120_Sub14_Sub18Array31[i_102_] = null;
			FileSystem.aClass40Array458[i_102_] = null;
		}
		if (resizeX != 128 || resizeY != 128) {
			class180_sub7_99_.resize(resizeX, resizeY, resizeX);
		}
		return class180_sub7_99_;
	}

	static final void setMembersClient3(final boolean bool) {
		if (NpcType.npcMemberClient != bool) {
			NpcType.npcMemberClient = bool;
			NodeCache.clearNpcCache();
		}
	}

	static final NpcType list(final int id) {
		NpcType npcType = (NpcType) recentUse.get(id);
		if (npcType != null) {
			return npcType;
		}
		final byte[] data = configClient.getFile(id >>> 7, id & 0x7f);
		npcType = new NpcType();
		npcType.myId = id;
		if (data != null) {
			npcType.decode(new Buffer(data));
		}
		recentUse.put(npcType, id);
		return npcType;
	}

	public NpcType() {
		this.hasShadow = true;
		this.anInt1657 = -1;
		this.anInt1681 = -1;
		this.headIcon = -1;
		this.anInt1682 = -1;
		this.aShort1683 = (short) 0;
		this.anInt1668 = -1;
		this.combatLevel = -1;
		this.cursor1op = -1;
		this.ambientSoundHearDistance = 0;
		this.anInt1672 = 32;
		this.canRightClick = true;
		this.spawnDirection = (byte) 7;
		ambient = 0;
		this.anInt1666 = -1;
		resizeX = 128;
		this.aShort1662 = (short) 0;
		this.size = 1;
		varpId = -1;
		varbitId = -1;
		this.aByte1699 = (byte) -16;
		this.ambientSoundVolume = 255;
		resizeY = 128;
		this.mapFunctionId = -1;
		this.aBoolean1701 = true;
		this.anInt1692 = -1;
		this.aByte1700 = (byte) 0;
		this.displayOnMinimap = true;
		this.anInt1676 = -1;
		this.cursor2 = -1;
		contrast = 0;
		this.options = new String[5];
		this.aByte1694 = (byte) -96;
		this.cursor1 = -1;
		this.aBoolean1656 = false;
		this.name = "null";
		this.iconHeight = -1;
		this.render = false;
	}
}
