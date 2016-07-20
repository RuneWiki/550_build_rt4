/* Class184 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class LocType {
	private short[] recolorModified;
	int totalDelay;
	private int[] types;
	static JagexInterface draggedOnComponent = null;
	int anInt1819;
	private byte aByte1820;
	int anInt1821;
	boolean aBoolean1822;
	boolean aBoolean1823;
	private int contrast;
	int cursor1op = -1;
	int mapSceneId;
	int sizeZ;
	private short[] retextureModified;
	int[] randomAnimationDelays;
	private boolean copyNormals;
	int anInt1831;
	int ambientSoundHearDistance;
	int ambientSoundId;
	static int[] soundEffectLoops = new int[50];
	int anInt1835;
	int animationId;
	private short[] retextureOriginal;
	private int offsetX;//orig
	int ambientSoundVolume;
	int mapFunctionId;
	int sizeX;
	int cursor2;
	private int ambient;
	boolean aBoolean1844;
	int anInt1845;
	private int varpId;
	int cursor2op;
	String name;
	String[] options;
	private int[] modelIds;
	boolean members;
	int[] transmogrificationIds;
	boolean aBoolean1853;
	private int varbitId;
	private int offsetY;
	private int resizeX;
	int anInt1857;
	boolean castShadow;
	private int offsetZ;
	private short[] recolorOriginal;
	static int modeWhat = 0;
	boolean adjustMapSceneRotation;
	boolean hasAnimation;
	boolean aBoolean1864;
	private Hashtable params;
	int occludeType;
	private short aShort1867;
	private boolean aBoolean1868;
	int mapSceneRotationOff;
	int[] anIntArray1870;
	private byte[] recolorPalette;
	boolean flipMapSceneSprite;
	private int resizeZ;
	int cursor1;
	private int resizeY;
	boolean aBoolean1876;
	int myId;
	boolean aBoolean1878;
	int anInt1879;
	boolean aBoolean1880;
	int[] randomAnimationIds;
	static int[] anIntArray493 = new int[] { 1, -1, -1, 1 };
	static ObjectCache aClass21_1117 = new ObjectCache(50);
	static ObjectCache aClass21_1618 = new ObjectCache(30);
	static ObjectCache aClass21_2663 = new ObjectCache(500);
	static ObjectCache recentUse = new ObjectCache(64);

	static final void resetSpriteMenu() {
		Class173.aClass120_Sub14_Sub19_1725 = null;
		FrameGroup.aClass120_Sub14_Sub19_3611 = null;
		RuntimeException_Sub1.aClass120_Sub14_Sub19_2144 = null;
		Class157.aClass120_Sub14_Sub19_1472 = null;
		Class120_Sub12_Sub10.aClass120_Sub14_Sub19_3202 = null;
	}

	final boolean modelsCached() {
		if (modelIds == null) {
			return true;
		}
		boolean cached = true;
		for (int id = 0; id < modelIds.length; id++) {
			cached &= Class120_Sub12_Sub36.aClass50_3418.requestDownload(modelIds[id] & 0xffff, 0);
		}
		return cached;
	}

	final Class88 method2453(final int i, final boolean bool, final int type, final int i_5_, final int[][] is, final int[][] is_6_, final boolean bool_7_, final int rotation, final int i_9_, final LDIndexedSprite class107_sub1) {
		if (!HDToolkit.glEnabled) {
			long l;
			if (types == null) {
				l = (this.myId << 10) + rotation;
			} else {
				l = (this.myId << 10) + rotation + (type << 3);
			}
			boolean bool_11_;
			if (!bool || !copyNormals) {
				bool_11_ = false;
			} else {
				l |= ~0x7fffffffffffffffL;
				bool_11_ = true;
			}
			SceneGraphNode sceneGraphNode = (SceneGraphNode) aClass21_1618.get(l);
			if (sceneGraphNode == null) {
				final Model class180_sub2 = method2455(rotation, type);
				if (class180_sub2 == null) {
					Class82.aClass88_783.aClass180_826 = null;
					return Class82.aClass88_783;
				}
				class180_sub2.method2299();
				if (type == 10 && rotation > 3) {
					class180_sub2.rotateY(256);
				}
				if (!bool_11_) {
					sceneGraphNode = new LDModelRenderer(class180_sub2, ambient + 64, contrast * 5 + 768, -50, -10, -50);
				} else {
					class180_sub2.ambient = (short) (ambient + 64);
					class180_sub2.contrast = (short) (contrast * 5 + 768);
					sceneGraphNode = class180_sub2;
					class180_sub2.createNormals();
				}
				aClass21_1618.put(sceneGraphNode, l);
			}
			if (bool_11_) {
				sceneGraphNode = ((Model) sceneGraphNode).method2288();
			}
			if (aByte1820 != 0) {
				if (sceneGraphNode instanceof LDModelRenderer) {
					sceneGraphNode = ((LDModelRenderer) sceneGraphNode).method2399(aByte1820, aShort1867, is, is_6_, i, i_5_, i_9_, true);
				} else if (sceneGraphNode instanceof Model) {
					sceneGraphNode = ((Model) sceneGraphNode).method2305(aByte1820, aShort1867, is, is_6_, i, i_5_, i_9_, true, false);
				}
			}
			Class82.aClass88_783.aClass180_826 = sceneGraphNode;
			return Class82.aClass88_783;
		}
		long l;
		if (types != null) {
			l = rotation + (this.myId << 10) + (type << 3);
		} else {
			l = (this.myId << 10) + rotation;
		}
		Class88 class88_12_ = (Class88) aClass21_1618.get(l);
		HDModelRenderer class180_sub7_sub2;
		LDIndexedSprite class107_sub1_13_;
		if (class88_12_ != null) {
			class180_sub7_sub2 = (HDModelRenderer) class88_12_.aClass180_826;
			class107_sub1_13_ = class88_12_.aClass107_Sub1_830;
		} else {
			class180_sub7_sub2 = method2459(type, false, rotation);
			if (class180_sub7_sub2 == null) {
				Class82.aClass88_783.aClass180_826 = null;
				Class82.aClass88_783.aClass107_Sub1_830 = null;
				return Class82.aClass88_783;
			}
			if (type == 10 && rotation > 3) {
				class180_sub7_sub2.rotateY(256);
			}
			if (!bool_7_) {
				class107_sub1_13_ = null;
			} else {
				class107_sub1_13_ = class180_sub7_sub2.method2414(class107_sub1);
			}
			class88_12_ = new Class88();
			class88_12_.aClass180_826 = class180_sub7_sub2;
			class88_12_.aClass107_Sub1_830 = class107_sub1_13_;
			aClass21_1618.put(class88_12_, l);
		}
		final boolean bool_14_ = bool & copyNormals;
		final HDModelRenderer class180_sub7_sub2_15_ = class180_sub7_sub2.method2412(aByte1820 != 3, aByte1820 == 0, true, true, true, true, !bool_14_, true, true, true, true);
		if (aByte1820 != 0) {
			class180_sub7_sub2_15_.method2419(aByte1820, aShort1867, class180_sub7_sub2, is, is_6_, i, i_5_, i_9_);
		}
		class180_sub7_sub2_15_.method2432(this.anInt1835 == 0 && !this.hasAnimation, true, true, true, this.anInt1835 == 0, true, false);
		class180_sub7_sub2_15_.aBoolean3880 = bool_14_;
		Class82.aClass88_783.aClass180_826 = class180_sub7_sub2_15_;
		Class82.aClass88_783.aClass107_Sub1_830 = class107_sub1_13_;
		return Class82.aClass88_783;
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

	private final Model method2455(int i, final int type) {
		Model class180_sub2_21_ = null;
		boolean bool = aBoolean1868;
		if (type == 2 && i > 3) {
			bool = !bool;
		}
		if (types == null) {
			if (type != 10) {
				return null;
			}
			if (modelIds == null) {
				return null;
			}
			final int i_22_ = modelIds.length;
			for (int i_23_ = 0; i_23_ < i_22_; i_23_++) {
				int i_24_ = modelIds[i_23_];
				if (bool) {
					i_24_ += 65536;
				}
				class180_sub2_21_ = (Model) aClass21_2663.get(i_24_);
				if (class180_sub2_21_ == null) {
					class180_sub2_21_ = Model.get(Class120_Sub12_Sub36.aClass50_3418, i_24_ & 0xffff, 0);
					if (class180_sub2_21_ == null) {
						return null;
					}
					if (bool) {
						class180_sub2_21_.method2287();
					}
					aClass21_2663.put(class180_sub2_21_, i_24_);
				}
				if (i_22_ > 1) {
					AbstractRequest.aClass180_Sub2Array3574[i_23_] = class180_sub2_21_;
				}
			}
			if (i_22_ > 1) {
				class180_sub2_21_ = new Model(AbstractRequest.aClass180_Sub2Array3574, i_22_);
			}
		} else {
			int i_25_ = -1;
			for (int i_26_ = 0; i_26_ < types.length; i_26_++) {
				if (type == types[i_26_]) {
					i_25_ = i_26_;
					break;
				}
			}
			if (i_25_ == -1) {
				return null;
			}
			int i_27_ = modelIds[i_25_];
			if (bool) {
				i_27_ += 65536;
			}
			class180_sub2_21_ = (Model) aClass21_2663.get(i_27_);
			if (class180_sub2_21_ == null) {
				class180_sub2_21_ = Model.get(Class120_Sub12_Sub36.aClass50_3418, i_27_ & 0xffff, 0);
				if (class180_sub2_21_ == null) {
					return null;
				}
				if (bool) {
					class180_sub2_21_.method2287();
				}
				aClass21_2663.put(class180_sub2_21_, i_27_);
			}
		}
		boolean bool_28_;
		if (resizeX == 128 && resizeY == 128 && resizeZ == 128) {
			bool_28_ = false;
		} else {
			bool_28_ = true;
		}
		boolean bool_29_;
		if (offsetX == 0 && offsetY == 0 && offsetZ == 0) {
			bool_29_ = false;
		} else {
			bool_29_ = true;
		}
		final Model class180_sub2_30_ = new Model(class180_sub2_21_, i == 0 && !bool_28_ && !bool_29_, recolorOriginal == null, retextureOriginal == null, true);
		if (type == 4 && i > 3) {
			class180_sub2_30_.rotateY(256);
			class180_sub2_30_.translate(45, 0, -45);
		}
		i &= 0x3;
		if (i == 1) {
			class180_sub2_30_.rotate90();
		} else if (i == 2) {
			class180_sub2_30_.rotate180();
		} else if (i == 3) {
			class180_sub2_30_.rotate270();
		}
		if (recolorOriginal != null) {
			for (int i_31_ = 0; i_31_ < recolorOriginal.length; i_31_++) {
				if (recolorPalette == null || recolorPalette.length <= i_31_) {
					class180_sub2_30_.recolor(recolorOriginal[i_31_], recolorModified[i_31_]);
				} else {
					class180_sub2_30_.recolor(recolorOriginal[i_31_], Class127.aShortArray1214[recolorPalette[i_31_] & 0xff]);
				}
			}
		}
		if (retextureOriginal != null) {
			for (int i_32_ = 0; retextureOriginal.length > i_32_; i_32_++) {
				class180_sub2_30_.retexture(retextureOriginal[i_32_], retextureModified[i_32_]);
			}
		}
		if (bool_28_) {
			class180_sub2_30_.scale(resizeX, resizeY, resizeZ);
		}
		if (bool_29_) {
			class180_sub2_30_.translate(offsetX, offsetY, offsetZ);
		}
		return class180_sub2_30_;
	}

	final LocType handleVarp() {
		int i_34_ = -1;
		if (varbitId != -1) {
			i_34_ = VarBit.getVarbitValue(varbitId);
		} else if (varpId != -1) {
			i_34_ = Class2.playerVariables[varpId];
		}
		if (i_34_ < 0 || this.transmogrificationIds.length + -1 <= i_34_ || this.transmogrificationIds[i_34_] == -1) {
			final int i_35_ = this.transmogrificationIds[-1 + this.transmogrificationIds.length];
			if (i_35_ == -1) {
				return null;
			}
			return list(i_35_);
		}
		return list(this.transmogrificationIds[i_34_]);
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

	static final void method2458() {
		if (Class109.gameState == 10 && HDToolkit.glEnabled) {
			ProjectileNode.setGameState(28);
		}
		if (Class109.gameState == 30) {
			ProjectileNode.setGameState(25);
		}
	}

	private final HDModelRenderer method2459(final int i, final boolean bool, int i_37_) {
		final int i_39_ = 64 + ambient;
		final int i_40_ = 768 + contrast * 5;
		HDModelRenderer class180_sub7_sub2_41_;
		if (types == null) {
			if (i != 10) {
				return null;
			}
			if (modelIds == null) {
				return null;
			}
			final int i_42_ = modelIds.length;
			if (i_42_ == 0) {
				return null;
			}
			long l = 0L;
			for (int i_43_ = 0; i_42_ > i_43_; i_43_++) {
				l = 67783L * l + modelIds[i_43_];
			}
			if (bool) {
				l ^= 0xffffffffffffffffL;
			}
			class180_sub7_sub2_41_ = (HDModelRenderer) aClass21_2663.get(l);
			if (class180_sub7_sub2_41_ == null) {
				Model class180_sub2 = null;
				for (int i_44_ = 0; i_42_ > i_44_; i_44_++) {
					class180_sub2 = Model.get(Class120_Sub12_Sub36.aClass50_3418, 0xffff & modelIds[i_44_], 0);
					if (class180_sub2 == null) {
						return null;
					}
					if (i_42_ > 1) {
						AbstractRequest.aClass180_Sub2Array3574[i_44_] = class180_sub2;
					}
				}
				if (i_42_ > 1) {
					class180_sub2 = new Model(AbstractRequest.aClass180_Sub2Array3574, i_42_);
				}
				class180_sub7_sub2_41_ = new HDModelRenderer(class180_sub2, i_39_, i_40_, bool);
				aClass21_2663.put(class180_sub7_sub2_41_, l);
			}
		} else {
			int i_45_ = -1;
			for (int i_46_ = 0; types.length > i_46_; i_46_++) {
				if (types[i_46_] == i) {
					i_45_ = i_46_;
					break;
				}
			}
			if (i_45_ == -1) {
				return null;
			}
			int i_47_ = modelIds[i_45_];
			if (bool) {
				i_47_ += 65536;
			}
			class180_sub7_sub2_41_ = (HDModelRenderer) aClass21_2663.get(i_47_);
			if (class180_sub7_sub2_41_ == null) {
				final Model class180_sub2 = Model.get(Class120_Sub12_Sub36.aClass50_3418, 0xffff & i_47_, 0);
				if (class180_sub2 == null) {
					return null;
				}
				class180_sub7_sub2_41_ = new HDModelRenderer(class180_sub2, i_39_, i_40_, bool);
				aClass21_2663.put(class180_sub7_sub2_41_, i_47_);
			}
		}
		boolean bool_48_ = aBoolean1868;
		final boolean bool_49_ = resizeY == 128 && offsetY == 0;
		if (i == 2 && i_37_ > 3) {
			bool_48_ = !bool_48_;
		}
		final boolean bool_50_ = i_37_ == 0 && resizeX == 128 && resizeZ == 128 && offsetX == 0 && offsetZ == 0 && !bool_48_;
		final HDModelRenderer class180_sub7_sub2_51_ = class180_sub7_sub2_41_.method2412(bool_50_, bool_49_, recolorOriginal == null, true, class180_sub7_sub2_41_.getAmbient() == i_39_, i_37_ == 0 && !bool_48_, true, class180_sub7_sub2_41_.getContrast() == i_40_, true, !bool_48_, retextureOriginal == null);
		if (bool_48_) {
			class180_sub7_sub2_51_.method2410();
		}
		if (i == 4 && i_37_ > 3) {
			class180_sub7_sub2_51_.method2417(256);
			class180_sub7_sub2_51_.translate(45, 0, -45);
		}
		i_37_ &= 0x3;
		if (i_37_ == 1) {
			class180_sub7_sub2_51_.method2422();
		} else if (i_37_ == 2) {
			class180_sub7_sub2_51_.method2409();
		} else if (i_37_ == 3) {
			class180_sub7_sub2_51_.method2408();
		}
		if (recolorOriginal != null) {
			for (int i_52_ = 0; i_52_ < recolorOriginal.length; i_52_++) {
				class180_sub7_sub2_51_.recolor(recolorOriginal[i_52_], recolorModified[i_52_]);
			}
		}
		if (retextureOriginal != null) {
			for (int i_53_ = 0; i_53_ < retextureOriginal.length; i_53_++) {
				class180_sub7_sub2_51_.retexture(retextureOriginal[i_53_], retextureModified[i_53_]);
			}
		}
		if (resizeX != 128 || resizeY != 128 || resizeZ != 128) {
			class180_sub7_sub2_51_.scale(resizeX, resizeY, resizeZ);
		}
		if (offsetX != 0 || offsetY != 0 || offsetZ != 0) {
			class180_sub7_sub2_51_.translate(offsetX, offsetY, offsetZ);
		}
		if (i_39_ != class180_sub7_sub2_51_.getAmbient()) {
			class180_sub7_sub2_51_.setAmbient(i_39_);
		}
		if (class180_sub7_sub2_51_.getContrast() != i_40_) {
			class180_sub7_sub2_51_.setContrast(i_40_);
		}
		return class180_sub7_sub2_51_;
	}

	final boolean method2460(final int type) {
		if (types != null) {
			for (int id = 0; id < types.length; id++) {
				if (types[id] == type) {
					return Class120_Sub12_Sub36.aClass50_3418.requestDownload(modelIds[id] & 0xffff, 0);
				}
			}
			return true;
		}
		if (modelIds == null) {
			return true;
		}
		if (type != 10) {
			return true;
		}
		boolean bool_56_ = true;
		for (final int element : modelIds) {
			bool_56_ &= Class120_Sub12_Sub36.aClass50_3418.requestDownload(element & 0xffff, 0);
		}
		return bool_56_;
	}

	final Class88 method2461(final int i, final int[][] is, final int i_58_, final int i_60_, final int i_61_, final boolean bool, final int rotation, final int type, final int i_64_, final int[][] is_65_, final SeqType seqType, final LDIndexedSprite class107_sub1, final int i_66_) {
		if (HDToolkit.glEnabled) {
			long l;
			if (types == null) {
				l = (this.myId << 10) + rotation;
			} else {
				l = rotation + (type << 3) + (this.myId << 10);
			}
			HDModelRenderer class180_sub7_sub2 = (HDModelRenderer) aClass21_1117.get(l);
			if (class180_sub7_sub2 == null) {
				class180_sub7_sub2 = method2459(type, true, rotation);
				if (class180_sub7_sub2 == null) {
					return null;
				}
				class180_sub7_sub2.method2426();
				class180_sub7_sub2.method2432(false, false, false, true, false, false, true);
				aClass21_1117.put(class180_sub7_sub2, l);
			}
			HDModelRenderer class180_sub7_sub2_67_ = class180_sub7_sub2;
			boolean bool_68_ = false;
			if (seqType != null) {
				class180_sub7_sub2_67_ = (HDModelRenderer) seqType.method320(class180_sub7_sub2_67_, i_66_, i_58_, rotation, i_64_);
				bool_68_ = true;
			}
			if (type == 10 && rotation > 3) {
				if (!bool_68_) {
					bool_68_ = true;
					class180_sub7_sub2_67_ = (HDModelRenderer) class180_sub7_sub2_67_.method2378(true, true, true);
				}
				class180_sub7_sub2_67_.rotateY(256);
			}
			if (!bool) {
				Class82.aClass88_783.aClass107_Sub1_830 = null;
			} else {
				Class82.aClass88_783.aClass107_Sub1_830 = class180_sub7_sub2_67_.method2414(class107_sub1);
			}
			if (aByte1820 != 0) {
				if (!bool_68_) {
					bool_68_ = true;
					class180_sub7_sub2_67_ = (HDModelRenderer) class180_sub7_sub2_67_.method2378(true, true, true);
				}
				class180_sub7_sub2_67_.method2419(aByte1820, aShort1867, class180_sub7_sub2_67_, is, is_65_, i, i_61_, i_60_);
			}
			Class82.aClass88_783.aClass180_826 = class180_sub7_sub2_67_;
			return Class82.aClass88_783;
		}
		long l;
		if (types != null) {
			l = rotation + (type << 3) + (this.myId << 10);
		} else {
			l = (this.myId << 10) + rotation;
		}
		LDModelRenderer class180_sub7_sub1 = (LDModelRenderer) aClass21_1117.get(l);
		if (class180_sub7_sub1 == null) {
			final Model class180_sub2 = method2455(rotation, type);
			if (class180_sub2 == null) {
				return null;
			}
			class180_sub7_sub1 = new LDModelRenderer(class180_sub2, ambient + 64, 5 * contrast + 768, -50, -10, -50);
			aClass21_1117.put(class180_sub7_sub1, l);
		}
		boolean bool_69_ = false;
		if (seqType != null) {
			bool_69_ = true;
			class180_sub7_sub1 = (LDModelRenderer) seqType.method327(i_66_, i_64_, i_58_, rotation, class180_sub7_sub1);
		}
		if (type == 10 && rotation > 3) {
			if (!bool_69_) {
				class180_sub7_sub1 = (LDModelRenderer) class180_sub7_sub1.method2378(true, true, true);
				bool_69_ = true;
			}
			class180_sub7_sub1.rotateY(256);
		}
		if (aByte1820 != 0) {
			if (!bool_69_) {
				bool_69_ = true;
				class180_sub7_sub1 = (LDModelRenderer) class180_sub7_sub1.method2378(true, true, true);
			}
			class180_sub7_sub1 = class180_sub7_sub1.method2399(aByte1820, aShort1867, is, is_65_, i, i_61_, i_60_, false);
		}
		Class82.aClass88_783.aClass180_826 = class180_sub7_sub1;
		return Class82.aClass88_783;
	}

	final int getRandomAnimationId() {
		if (this.randomAnimationIds != null) {
			int randomDelay = (int) (totalDelay * Math.random());
			int animIndex;
			for (animIndex = 0; randomAnimationDelays[animIndex] <= randomDelay; animIndex++) {
				randomDelay -= randomAnimationDelays[animIndex];
			}
			return this.randomAnimationIds[animIndex];
		}
		return -1;
	}

	private final void decode(final Buffer buffer, final int code) {
		if (code == 1) {
			final int len = buffer.getUByte();
			if (len > 0) {
				if (modelIds != null && !Class120_Sub12_Sub26.aBoolean3326) {
					buffer.pos += 3 * len;
				} else {
					modelIds = new int[len];
					types = new int[len];
					for (int id = 0; id < len; id++) {
						modelIds[id] = buffer.getUShort();
						types[id] = buffer.getUByte();
					}
				}
			}
		} else if (code == 2) {
			this.name = buffer.getJagexString();
		} else if (code == 5) {
			final int len = buffer.getUByte();
			if (len > 0) {
				if (modelIds == null || Class120_Sub12_Sub26.aBoolean3326) {
					types = null;
					modelIds = new int[len];
					for (int id = 0; id < len; id++) {
						modelIds[id] = buffer.getUShort();
					}
				} else {
					buffer.pos += len * 2;
				}
			}
		} else if (code == 14) {
			this.sizeX = buffer.getUByte();
		} else if (code == 15) {
			this.sizeZ = buffer.getUByte();
		} else if (code == 17) {
			this.anInt1821 = 0;
			this.aBoolean1844 = false;
		} else if (code == 18) {
			this.aBoolean1844 = false;
		} else if (code == 19) {
			this.anInt1835 = buffer.getUByte();
		} else if (code == 21) {
			aByte1820 = (byte) 1;
		} else if (code == 22) {
			copyNormals = true;
		} else if (code == 23) {
			this.occludeType = 1;
		} else if (code == 24) {
			this.animationId = buffer.getUShort();
			if (this.animationId == 0xffff) {
				this.animationId = -1;
			}
		} else if (code == 27) {
			this.anInt1821 = 1;
		} else if (code == 28) {
			this.anInt1819 = buffer.getUByte();
		} else if (code == 29) {
			ambient = buffer.getByte();
		} else if (code == 39) {
			contrast = 5 * buffer.getByte();
		} else if (code >= 30 && code < 35) {
			this.options[code - 30] = buffer.getJagexString();
			if (this.options[code - 30].equalsIgnoreCase(StringLibrary.hidden)) {
				this.options[code - 30] = null;
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
			final int i_74_ = buffer.getUByte();
			recolorPalette = new byte[i_74_];
			for (int i_75_ = 0; i_75_ < i_74_; i_75_++) {
				recolorPalette[i_75_] = buffer.getByte();
			}
		} else if (code == 62) {
			aBoolean1868 = true;
		} else if (code == 64) {
			this.castShadow = false;
		} else if (code == 65) {
			resizeX = buffer.getUShort();
		} else if (code == 66) {
			resizeY = buffer.getUShort();
		} else if (code == 67) {
			resizeZ = buffer.getUShort();
		} else if (code == 69) {
			this.anInt1857 = buffer.getUByte();
		} else if (code == 70) {
			offsetX = buffer.getShort();
		} else if (code == 71) {
			offsetY = buffer.getShort();
		} else if (code == 72) {
			offsetZ = buffer.getShort();
		} else if (code == 73) {
			this.aBoolean1853 = true;
		} else if (code == 74) {
			this.aBoolean1880 = true;
		} else if (code == 75) {
			this.anInt1831 = buffer.getUByte();
		} else if (code == 77 || code == 92) {
			int i_85_ = -1;
			varbitId = buffer.getUShort();
			if (varbitId == 0xffff) {
				varbitId = -1;
			}
			varpId = buffer.getUShort();
			if (varpId == 0xffff) {
				varpId = -1;
			}
			if (code == 92) {
				i_85_ = buffer.getUShort();
				if (i_85_ == 0xffff) {
					i_85_ = -1;
				}
			}
			final int i_86_ = buffer.getUByte();
			this.transmogrificationIds = new int[i_86_ + 2];
			for (int i_87_ = 0; i_86_ >= i_87_; i_87_++) {
				this.transmogrificationIds[i_87_] = buffer.getUShort();
				if (this.transmogrificationIds[i_87_] == 0xffff) {
					this.transmogrificationIds[i_87_] = -1;
				}
			}
			this.transmogrificationIds[i_86_ + 1] = i_85_;
		} else if (code == 78) {
			this.ambientSoundId = buffer.getUShort();
			this.ambientSoundHearDistance = buffer.getUByte();
		} else if (code == 79) {
			this.anInt1879 = buffer.getUShort();
			this.anInt1845 = buffer.getUShort();
			this.ambientSoundHearDistance = buffer.getUByte();
			final int i_76_ = buffer.getUByte();
			this.anIntArray1870 = new int[i_76_];
			for (int i_77_ = 0; i_77_ < i_76_; i_77_++) {
				this.anIntArray1870[i_77_] = buffer.getUShort();
			}
		} else if (code == 81) {
			aByte1820 = (byte) 2;
			aShort1867 = (short) (256 * buffer.getUByte());
		} else if (code == 82) {
			this.aBoolean1876 = true;
		} else if (code == 88) {
			this.aBoolean1823 = false;
		} else if (code == 89) {
			this.aBoolean1864 = false;
		} else if (code == 90) {
			this.aBoolean1822 = true;
		} else if (code == 91) {
			this.members = true;
		} else if (code == 93) {
			aByte1820 = (byte) 3;
			aShort1867 = (short) buffer.getUShort();
		} else if (code == 94) {
			aByte1820 = (byte) 4;
		} else if (code == 95) {
			aByte1820 = (byte) 5;
		} else if (code == 96) {
			this.aBoolean1878 = true;
		} else if (code == 97) {
			this.adjustMapSceneRotation = true;
		} else if (code == 98) {
			this.hasAnimation = true;
		} else if (code == 99) {
			this.cursor1op = buffer.getUByte();
			this.cursor1 = buffer.getUShort();
		} else if (code == 100) {
			this.cursor2op = buffer.getUByte();
			this.cursor2 = buffer.getUShort();
		} else if (code == 101) {
			this.mapSceneRotationOff = buffer.getUByte();
		} else if (code == 102) {
			this.mapSceneId = buffer.getUShort();
		} else if (code == 103) {
			this.occludeType = 0;
		} else if (code == 104) {
			this.ambientSoundVolume = buffer.getUByte();
		} else if (code == 105) {
			this.flipMapSceneSprite = true;
		} else if (code == 106) {
			final int len = buffer.getUByte();
			randomAnimationDelays = new int[len];
			this.randomAnimationIds = new int[len];
			for (int id = 0; id < len; id++) {
				this.randomAnimationIds[id] = buffer.getUShort();
				final int delay = buffer.getUByte();
				randomAnimationDelays[id] = delay;
				totalDelay += delay;
			}
		} else if (code == 107) {
			this.mapFunctionId = buffer.getUShort();
		} else if (code >= 150 && code < 155) {
			this.options[code - 150] = buffer.getJagexString();
			if (!Class69_Sub2.locMemberClient || this.options[code - 150].equalsIgnoreCase(StringLibrary.hidden)) {
				this.options[code - 150] = null;
			}
		} else if (code == 249) {
			final int i_81_ = buffer.getUByte();
			if (params == null) {
				final int i_82_ = Class120_Sub12_Sub17.farthestBitValue(i_81_);
				params = new Hashtable(i_82_);
			}
			for (int i_83_ = 0; i_83_ < i_81_; i_83_++) {
				final boolean bool = buffer.getUByte() == 1;
				final int i_84_ = buffer.getMedium();
				Node node;
				if (bool) {
					node = new StringNode(buffer.getJagexString());
				} else {
					node = new IntegerNode(buffer.getInt());
				}
				params.put(node, i_84_);
			}
		}
	}

	static final void method2465(final byte i) {
		if (Class9.aByteArrayArrayArray70 == null) {
			Class9.aByteArrayArrayArray70 = new byte[4][104][104];
		}
		for (int i_96_ = 0; i_96_ < 4; i_96_++) {
			for (int i_97_ = 0; i_97_ < 104; i_97_++) {
				for (int i_98_ = 0; i_98_ < 104; i_98_++) {
					Class9.aByteArrayArrayArray70[i_96_][i_97_][i_98_] = i;
				}
			}
		}
	}

	final boolean hasAmbientSound() {
		if (this.transmogrificationIds == null) {
			if (this.ambientSoundId == -1 && this.anIntArray1870 == null) {
				return false;
			}
			return true;
		}
		for (final int element : this.transmogrificationIds) {
			if (element != -1) {
				final LocType locType = list(element);
				if (locType.ambientSoundId != -1 || locType.anIntArray1870 != null) {
					return true;
				}
			}
		}
		return false;
	}

	static final int method2467(final JagexInterface jagexInterface, final int i) {
		if (jagexInterface.cs1opcodes == null || i >= jagexInterface.cs1opcodes.length) {
			return -2;
		}
		try {
			final int[] is = jagexInterface.cs1opcodes[i];
			int i_103_ = 0;
			int i_104_ = 0;
			int i_105_ = 0;
			for (;;) {
				int i_106_ = 0;
				final int i_107_ = is[i_103_++];
				int i_108_ = 0;
				if (i_107_ == 0) {
					return i_104_;
				}
				if (i_107_ == 1) {
					i_108_ = client.skillsLevel[is[i_103_++]];
				}
				if (i_107_ == 15) {
					i_106_ = 1;
				}
				if (i_107_ == 16) {
					i_106_ = 2;
				}
				if (i_107_ == 17) {
					i_106_ = 3;
				}
				if (i_107_ == 2) {
					i_108_ = client.skillsBaseLevel[is[i_103_++]];
				}
				if (i_107_ == 3) {
					i_108_ = client.skillsXp[is[i_103_++]];
				}
				if (i_107_ == 4) {
					int i_109_ = is[i_103_++] << 16;
					i_109_ += is[i_103_++];
					final JagexInterface class189_110_ = Class74.getJagexInterface(i_109_);
					final int i_111_ = is[i_103_++];
					if ((i_111_ ^ 0xffffffff) != 0 && (!ObjType.list(i_111_).members || Class120_Sub12_Sub37.membersClient)) {
						for (int i_112_ = 0; class189_110_.objIds.length > i_112_; i_112_++) {
							if (class189_110_.objIds[i_112_] == i_111_ + 1) {
								i_108_ += class189_110_.objAmounts[i_112_];
							}
						}
					}
				}
				if (i_107_ == 5) {
					i_108_ = Class2.playerVariables[is[i_103_++]];
				}
				if (i_107_ == 6) {
					i_108_ = SkillsConstants.skillsXpForLevel[client.skillsBaseLevel[is[i_103_++]] - 1];
				}
				if (i_107_ == 7) {
					i_108_ = Class2.playerVariables[is[i_103_++]] * 100 / 46875;
				}
				if (i_107_ == 8) {
					i_108_ = TileParticleQueue.selfPlayer.combatLevel;
				}
				if (i_107_ == 9) {
					for (int i_113_ = 0; i_113_ < 25; i_113_++) {
						if (SkillsConstants.aBooleanArray1723[i_113_]) {
							i_108_ += client.skillsBaseLevel[i_113_];
						}
					}
				}
				if (i_107_ == 10) {
					int i_114_ = is[i_103_++] << 16;
					i_114_ += is[i_103_++];
					final JagexInterface class189_115_ = Class74.getJagexInterface(i_114_);
					final int i_116_ = is[i_103_++];
					if ((i_116_ ^ 0xffffffff) != 0 && (!ObjType.list(i_116_).members || Class120_Sub12_Sub37.membersClient)) {
						for (int i_117_ = 0; class189_115_.objIds.length > i_117_; i_117_++) {
							if (1 + i_116_ == class189_115_.objIds[i_117_]) {
								i_108_ = 999999999;
								break;
							}
						}
					}
				}
				if (i_107_ == 11) {
					i_108_ = Class69_Sub2.energy;
				}
				if (i_107_ == 12) {
					i_108_ = LookupTable.weight;
				}
				if (i_107_ == 13) {
					final int i_118_ = Class2.playerVariables[is[i_103_++]];
					final int i_119_ = is[i_103_++];
					i_108_ = (1 << i_119_ & i_118_) == 0 ? 0 : 1;
				}
				if (i_107_ == 14) {
					final int i_120_ = is[i_103_++];
					i_108_ = VarBit.getVarbitValue(i_120_);
				}
				if (i_107_ == 18) {
					i_108_ = GameEntity.currentBaseX + (TileParticleQueue.selfPlayer.x >> 7);
				}
				if (i_107_ == 19) {
					i_108_ = (TileParticleQueue.selfPlayer.z >> 7) - -LightType.currentBaseZ;
				}
				if (i_107_ == 20) {
					i_108_ = is[i_103_++];
				}
				if (i_106_ == 0) {
					if (i_105_ == 0) {
						i_104_ += i_108_;
					}
					if (i_105_ == 1) {
						i_104_ -= i_108_;
					}
					if (i_105_ == 2 && i_108_ != 0) {
						i_104_ /= i_108_;
					}
					if (i_105_ == 3) {
						i_104_ *= i_108_;
					}
					i_105_ = 0;
				} else {
					i_105_ = i_106_;
				}
			}
		} catch (final Exception exception) {
			return -1;
		}
	}

	final boolean method2468(final int i_121_) {
		if (i_121_ == -1) {
			return false;
		}
		if (i_121_ == this.animationId) {
			return true;
		}
		if (this.randomAnimationIds != null) {
			for (final int element : this.randomAnimationIds) {
				if (i_121_ == element) {
					return true;
				}
			}
		}
		return false;
	}

	final void postDecode() {
		if (this.anInt1835 == -1) {
			this.anInt1835 = 0;
			if (modelIds != null && (types == null || types[0] == 10)) {
				this.anInt1835 = 1;
			}
			for (int i_123_ = 0; i_123_ < 5; i_123_++) {
				if (this.options[i_123_] != null) {
					this.anInt1835 = 1;
					break;
				}
			}
		}
		if (this.anInt1831 == -1) {
			this.anInt1831 = this.anInt1821 == 0 ? 0 : 1;
		}
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

	static final void setup(final js5 js5, final boolean bool, final js5 class50_0_) {
		Class69_Sub2.locMemberClient = bool;
		Class120_Sub12_Sub36.aClass50_3418 = class50_0_;
		Class120_Sub6.aClass50_2450 = js5;
	}

	static final void clearCache() {
		recentUse.clearSoftReference();
		aClass21_2663.clearSoftReference();
		aClass21_1618.clearSoftReference();
		aClass21_1117.clearSoftReference();
	}

	static final void setMembersClient1(final boolean bool) {
		if (Class69_Sub2.locMemberClient != bool) {
			Class69_Sub2.locMemberClient = bool;
			Class120_Sub12_Sub25.clearLocCache();
		}
	}

	static final LocType list(final int id) {
		LocType locType = (LocType) recentUse.get(id);
		if (locType != null) {
			return locType;
		}
		final byte[] data = Class120_Sub6.aClass50_2450.getFile(id >>> 8, id & 0xff);
		locType = new LocType();
		locType.myId = id;
		if (data != null) {
			locType.decode(new Buffer(data));
		}
		locType.postDecode();
		if (!Class69_Sub2.locMemberClient && locType.members) {
			locType.options = null;
		}
		if (locType.aBoolean1880) {
			locType.anInt1821 = 0;
			locType.aBoolean1844 = false;
		}
		recentUse.put(locType, id);
		return locType;
	}

	public LocType() {
		contrast = 0;
		aByte1820 = (byte) 0;
		this.aBoolean1823 = true;
		this.anInt1819 = 16;
		this.ambientSoundHearDistance = 0;
		this.sizeZ = 1;
		this.anInt1845 = 0;
		this.members = false;
		this.anInt1857 = 0;
		this.cursor2op = -1;
		this.options = new String[5];
		this.sizeX = 1;
		this.anInt1831 = -1;
		offsetX = 0;
		copyNormals = false;
		totalDelay = 0;
		this.anInt1821 = 2;
		varbitId = -1;
		this.castShadow = true;
		this.cursor2 = -1;
		this.aBoolean1844 = true;
		this.adjustMapSceneRotation = false;
		this.mapFunctionId = -1;
		offsetY = 0;
		aShort1867 = (short) -1;
		this.aBoolean1864 = true;
		this.name = "null";
		randomAnimationDelays = null;
		this.aBoolean1822 = false;
		this.animationId = -1;
		this.occludeType = -1;
		this.ambientSoundId = -1;
		this.ambientSoundVolume = 255;
		this.flipMapSceneSprite = false;
		this.mapSceneRotationOff = 0;
		this.cursor1 = -1;
		this.anInt1835 = -1;
		aBoolean1868 = false;
		this.mapSceneId = -1;
		varpId = -1;
		resizeZ = 128;
		ambient = 0;
		offsetZ = 0;
		resizeY = 128;
		this.aBoolean1878 = false;
		resizeX = 128;
		this.hasAnimation = false;
		this.anInt1879 = 0;
		this.aBoolean1876 = false;
		this.aBoolean1853 = false;
		this.aBoolean1880 = false;
		this.randomAnimationIds = null;
	}
}
