/* Class189 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class JagexInterface {
	Object[] onInventoryUpdateListener;
	int maxScrollHorizontal;
	JagexInterface aClass189_1931 = null;
	Object[] onInterfaceOverridingUpdate;
	InterfaceClickMask clickMask;
	String tooltip;
	int rotateZ = 0;
	String enabledText;
	int maxScrollVertical;
	int y;
	boolean keepDragAlpha;
	boolean hasListener;
	int cursorId;
	Object[] anObjectArray1942;
	boolean flipVertical;
	Object[] onGameMessageReceived;
	int disabledAnim;
	int currentFrame;
	Object[] onComponentSwapListener;
	int width;
	int[] lengthOfSpriteLookupTable;
	String disabledText = "";
	Object[] onMouseDragListener;
	static Thread gameShellThread;
	Object[] onMouseFocusedListener;
	Object[] keyPressedListener;
	byte[] keyHeldMask;
	boolean drawObjCount;
	int[] spriteIDs;
	boolean flipHorizontal;
	Object[] onComponentDraggedListener;
	boolean aBoolean1960;
	int modelIdDisabled;
	int pixelsBeforeDrag;
	byte dynamicWidthValue;
	String spellNameni;
	int frameDelay = 0;
	int anInt1966;
	int lineWidth;
	int redrawCycle;
	int rotateSpeed;
	int[][] cs1opcodes;
	boolean clicked;
	int enabledColor;
	int[] lastPressedKeyCycles;
	int alpha;
	int clientCode;
	Object[] privateChatUpdateListener;
	int yOffset2d;
	int[] objIds;
	String spellNameoi;
	Object[] onSpellSelectionListener;
	int translateX;
	int anInt1982;
	int[] objAmounts;
	Object[] onGrandExchangeUpdateListener;
	int[] keyPressDelay;
	int[] spriteYs;
	private int modelTypeEnabled;
	int[] spriteXs;
	boolean invertYAxis;
	int enabledAnim;
	int[] stringScriptValuesTriggers;
	int[] cursors;
	Object[] onHeldListener;
	String actionSufix;
	int type;
	int actionType;
	int anInt1997;
	Object[] onLoopCycleListener;
	int bitPacked;
	Object[] onSpellDeselectionListener;
	boolean gridOriginal;
	int anInt2002;
	boolean ignoreDepthMask;
	int anInt2004;
	int zoom;
	Object[] onComponentClickListener;
	int anInt2007;
	int translateY;
	int verticalAlignment;
	int mouseOverId;
	int horizontalAlignment;
	int enabledSpriteId;
	Object[] anObjectArray2013;
	int originalWidth;
	int originalX;
	private int modelIdEnabled;
	byte dynamicYValue;
	boolean isAlphaSprite;
	boolean filled;
	int targetCursorId;
	int horizontalScrollPosition;
	int[] skillListernerTriggers;
	int verticalScrollPosition;
	Object[] onMouseWheelListener;
	int disabledColor;
	int shadow;
	static int inserting;
	int anInt2028;
	int parent;
	int objId;
	int modelTypeDisabled;
	Object[] stringScriptValuesListener;
	int anInt2033;
	Object[] onloadListener;
	boolean mouseOver;
	Object[] onClanChatUpdateListener;
	int anInt2037;
	int[] valueCompareType;
	int[] varpListenerTriggers;
	boolean textHasBlackShadow;
	boolean newFormat;
	static short[] playerMenuActionCodes;
	int lastSkillTriggersPos;
	int objSpritePadX;
	boolean hidden;
	boolean aBoolean2046;
	int rotateX;
	byte[] keyCodes;
	int anInt2049;
	Object[] onVarpUpdateListener;
	byte dynamicXValue;
	String[] niActions;
	static int anInt2053;
	Object[] onSkillUpdateListener;
	int disabledSpriteId;
	String[] oiActions;
	int verticalSpacing;
	Object[] onMouseOverListener;
	int height;
	int originalHeight;
	int originalY;
	Object[] integerScriptValuesListener;
	int[] inventoryListenerTriggers;
	int anInt2064;
	short aShort2065;
	int cyclesBeforeDrag;
	int font;
	static int anInt2068 = 0;
	int anInt2069;
	int rotation;
	int[] requiredValues;
	JagexInterface[] components;
	int x;
	Object[] onMouseLeaveListener;
	int objCount;
	int xOffset2d;//x offset 2d
	int objSpritePadY;
	int anInt2078;
	int[] startOfSpriteLookupTable;
	Object[] onClickListener;
	int disabledMouseOverColor;
	int redrawId;
	int componentIndex;
	Object[] onReleaseListener;
	int anInt2085;
	Object[] miscInformationUpdateListener;//system update, weight, energy
	int enabledMouseOverColor;
	int anInt2088;
	Object[] onResizeListener;
	int outline;
	int rotateY;
	byte dynamicHeightValue;
	short aShort2093;
	int anInt2094;
	String spellPrefix;
	int[] integerScriptValuesTriggers;
	boolean aBoolean2097;
	int nextFrame;
	static boolean[] interfaceLoaded;
	static JagexInterface[][] interfaceCache;
	static js5 interfaceJs5;
	static js5 aClass50_3213;
	static js5 aClass50_1721;
	static String aString1358 = "Loaded textures";
	static ObjectCache fontCache = new ObjectCache(20);
	static js5 spriteJs5;
	static ObjectCache modelCache = new ObjectCache(50);
	static ObjectCache spriteCache = new ObjectCache(200);

	static {
		inserting = 0;
		playerMenuActionCodes = new short[] { 43, 29, 60, 31, 22, 14, 24, 12 };
		anInt2053 = 0;
	}

	final AbstractModelRenderer constructModel(final SeqType seqType, final PlayerAppearance playerAppearance, final int nextFrame, final int currentFrame, final int frameDelay, final boolean interfaceEnabled) {
		int modelId;
		int modelType;
		if (interfaceEnabled) {
			modelId = modelIdEnabled;
			modelType = modelTypeEnabled;
		} else {
			modelId = modelIdDisabled;
			modelType = modelTypeDisabled;
		}
		Class88.interfaceSpriteIsNull = false;
		if (modelType == 0) {
			return null;
		}
		if (modelType == 1 && modelId == -1) {
			return null;
		}
		if (modelType == 1) {//Simple model
			AbstractModelRenderer cachedModel = (AbstractModelRenderer) modelCache.get(modelId + (modelType << 16));
			if (cachedModel == null) {
				final Model model = Model.get(aClass50_1721, modelId, 0);
				if (model == null) {
					Class88.interfaceSpriteIsNull = true;
					return null;
				}
				cachedModel = model.toRenderer(64, 768, -50, -10, -50);
				modelCache.put(cachedModel, modelId + (modelType << 16));
			}
			if (seqType != null) {
				cachedModel = seqType.method323(cachedModel, frameDelay, nextFrame, currentFrame);
			}
			return cachedModel;
		}
		if (modelType == 2) {//Npc head model
			final AbstractModelRenderer npcModel = NpcType.list(modelId).method2210(seqType, nextFrame, frameDelay, currentFrame);
			if (npcModel == null) {
				Class88.interfaceSpriteIsNull = true;
				return null;
			}
			return npcModel;
		}
		if (modelType == 3) {//Player model
			if (playerAppearance == null) {
				return null;
			}
			final AbstractModelRenderer playerModel = playerAppearance.method2044(seqType, frameDelay, nextFrame, currentFrame);
			if (playerModel == null) {
				Class88.interfaceSpriteIsNull = true;
				return null;
			}
			return playerModel;
		}
		if (modelType == 4) {//Object model
			final ObjType objType = ObjType.list(modelId);
			final AbstractModelRenderer objectModel = objType.method2105(currentFrame, 10, nextFrame, playerAppearance, seqType, frameDelay);
			if (objectModel == null) {
				Class88.interfaceSpriteIsNull = true;
				return null;
			}
			return objectModel;
		}
		if (modelType == 6) {//Npc model
			final AbstractModelRenderer npcModel = NpcType.list(modelId).method2212(currentFrame, 0, null, seqType, nextFrame, null, 0, 0, frameDelay);
			if (npcModel == null) {
				Class88.interfaceSpriteIsNull = true;
				return null;
			}
			return npcModel;
		}
		if (modelType == 7) {//Player head model
			if (playerAppearance == null) {
				return null;
			}
			final int i_14_ = this.modelIdDisabled >>> 16;
			final int i_12_ = this.modelIdDisabled & 0xffff;
			final int i_13_ = this.anInt1997;
			final AbstractModelRenderer playerModel = playerAppearance.method2041(seqType, i_12_, i_13_, currentFrame, frameDelay, i_14_, nextFrame);
			if (playerModel == null) {
				Class88.interfaceSpriteIsNull = true;
				return null;
			}
			return playerModel;
		}
		return null;
	}

	final AbstractSprite constructInventorySprite(final int index) {
		Class88.interfaceSpriteIsNull = false;
		if (index < 0 || index >= this.spriteIDs.length) {
			return null;
		}
		final int spriteId = this.spriteIDs[index];
		if (spriteId == -1) {
			return null;
		}
		AbstractSprite cachedSprite = (AbstractSprite) spriteCache.get(spriteId);
		if (cachedSprite != null) {
			return cachedSprite;
		}
		cachedSprite = EmitterType.constructAbstractSprite(spriteJs5, spriteId, 0);
		if (cachedSprite == null) {
			Class88.interfaceSpriteIsNull = true;
		} else {
			spriteCache.put(cachedSprite, spriteId);
		}
		return cachedSprite;
	}
	
	final void setAction(final String action, final int index) {
		if (this.niActions == null || index >= this.niActions.length) {
			final String[] newArray = new String[index + 1];
			if (this.niActions != null) {
				for (int id = 0; id < this.niActions.length; id++) {
					newArray[id] = this.niActions[id];
				}
			}
			this.niActions = newArray;
		}
		this.niActions[index] = action;
	}

	final void setCursor(final int cursor, final int index) {
		if (this.cursors == null || index >= this.cursors.length) {
			final int[] newArray = new int[index + 1];
			if (this.cursors != null) {
				for (int id = 0; id < this.cursors.length; id++) {
					newArray[id] = this.cursors[id];
				}
				for (int id = this.cursors.length; id < index; id++) {
					newArray[id] = -1;
				}
			}
			this.cursors = newArray;
		}
		this.cursors[index] = cursor;
	}

	final Class41 method2489() {
		return this.anInt2088 != -1 ? Class132_Sub1.method1934(this.anInt2002, this.anInt2094, this.anInt2088, this.anInt1966) : null;
	}

	final void decodeOld(final Buffer buffer) {
		this.newFormat = false;
		this.type = buffer.getUByte();
		this.actionType = buffer.getUByte();
		this.clientCode = buffer.getUShort();
		this.originalX = buffer.getShort();
		this.originalY = buffer.getShort();
		this.originalWidth = buffer.getUShort();
		this.originalHeight = buffer.getUShort();
		this.dynamicHeightValue = (byte) 0;
		this.dynamicXValue = (byte) 0;
		this.dynamicYValue = (byte) 0;
		this.dynamicWidthValue = (byte) 0;
		this.alpha = buffer.getUByte();
		this.parent = buffer.getUShort();
		if (this.parent == 65535) {
			this.parent = -1;
		} else {
			this.parent = this.parent + (~0xffff & this.bitPacked);
		}
		this.mouseOverId = buffer.getUShort();
		if (this.mouseOverId == 65535) {
			this.mouseOverId = -1;
		}
		final int valueCompareCount = buffer.getUByte();
		if (valueCompareCount > 0) {
			this.valueCompareType = new int[valueCompareCount];
			this.requiredValues = new int[valueCompareCount];
			for (int id = 0; id < valueCompareCount; id++) {
				this.valueCompareType[id] = buffer.getUByte();
				this.requiredValues[id] = buffer.getUShort();
			}
		}
		final int cs1length = buffer.getUByte();
		if (cs1length > 0) {
			this.cs1opcodes = new int[cs1length][];
			for (int i_27_ = 0; i_27_ < cs1length; i_27_++) {
				final int i_28_ = buffer.getUShort();
				this.cs1opcodes[i_27_] = new int[i_28_];
				for (int i_29_ = 0; i_28_ > i_29_; i_29_++) {
					this.cs1opcodes[i_27_][i_29_] = buffer.getUShort();
					if (this.cs1opcodes[i_27_][i_29_] == 65535) {
						this.cs1opcodes[i_27_][i_29_] = -1;
					}
				}
			}
		}
		int clickMask = 0;
		if (this.type == 0) {
			this.maxScrollVertical = buffer.getUShort();
			this.hidden = buffer.getUByte() == 1;
		}
		if (this.type == 1) {
			buffer.getUShort();
			buffer.getUByte();
		}
		if (this.type == 2) {
			this.dynamicWidthValue = (byte) 3;
			this.dynamicHeightValue = (byte) 3;
			this.objAmounts = new int[this.originalHeight * this.originalWidth];
			this.objIds = new int[this.originalWidth * this.originalHeight];
			final int i_31_ = buffer.getUByte();
			final int i_32_ = buffer.getUByte();
			if (i_31_ == 1) {
				clickMask |= 0x10000000;
			}
			final int i_33_ = buffer.getUByte();
			if (i_32_ == 1) {
				clickMask |= 0x40000000;
			}
			final int i_34_ = buffer.getUByte();
			if (i_33_ == 1) {
				clickMask |= ~0x7fffffff;
			}
			if (i_34_ == 1) {
				clickMask |= 0x20000000;
			}
			this.objSpritePadX = buffer.getUByte();
			this.objSpritePadY = buffer.getUByte();
			this.spriteYs = new int[20];
			this.spriteXs = new int[20];
			this.spriteIDs = new int[20];
			for (int i_35_ = 0; i_35_ < 20; i_35_++) {
				final int i_36_ = buffer.getUByte();
				if (i_36_ == 1) {
					this.spriteXs[i_35_] = buffer.getShort();
					this.spriteYs[i_35_] = buffer.getShort();
					this.spriteIDs[i_35_] = buffer.getInt();
				} else {
					this.spriteIDs[i_35_] = -1;
				}
			}
			this.oiActions = new String[5];
			for (int i_37_ = 0; i_37_ < 5; i_37_++) {
				final String string = buffer.getJagexString();
				if (string.length() > 0) {
					this.oiActions[i_37_] = string;
					clickMask |= 1 << i_37_ + 23;
				}
			}
		}
		if (this.type == 3) {
			this.filled = buffer.getUByte() == 1;
		}
		if (this.type == 4 || this.type == 1) {
			this.horizontalAlignment = buffer.getUByte();
			this.verticalAlignment = buffer.getUByte();
			this.verticalSpacing = buffer.getUByte();
			this.font = buffer.getUShort();
			if (this.font == 65535) {
				this.font = -1;
			}
			this.textHasBlackShadow = buffer.getUByte() == 1;
		}
		if (this.type == 4) {
			this.disabledText = buffer.getJagexString();
			this.enabledText = buffer.getJagexString();
		}
		if (this.type == 1 || this.type == 3 || this.type == 4) {
			this.disabledColor = buffer.getInt();
		}
		if (this.type == 3 || this.type == 4) {
			this.enabledColor = buffer.getInt();
			this.disabledMouseOverColor = buffer.getInt();
			this.enabledMouseOverColor = buffer.getInt();
		}
		if (this.type == 5) {
			this.disabledSpriteId = buffer.getInt();
			this.enabledSpriteId = buffer.getInt();
		}
		if (this.type == 6) {
			this.modelTypeDisabled = 1;
			this.modelIdDisabled = buffer.getUShort();
			if (this.modelIdDisabled == 65535) {
				this.modelIdDisabled = -1;
			}
			modelTypeEnabled = 1;
			modelIdEnabled = buffer.getUShort();
			if (modelIdEnabled == 65535) {
				modelIdEnabled = -1;
			}
			this.disabledAnim = buffer.getUShort();
			if (this.disabledAnim == 65535) {
				this.disabledAnim = -1;
			}
			this.enabledAnim = buffer.getUShort();
			if (this.enabledAnim == 65535) {
				this.enabledAnim = -1;
			}
			this.zoom = buffer.getUShort();
			this.rotateX = buffer.getUShort();
			this.rotateY = buffer.getUShort();
		}
		if (this.type == 7) {
			this.dynamicHeightValue = (byte) 3;
			this.dynamicWidthValue = (byte) 3;
			this.objAmounts = new int[this.originalWidth * this.originalHeight];
			this.objIds = new int[this.originalHeight * this.originalWidth];
			this.horizontalAlignment = buffer.getUByte();
			this.font = buffer.getUShort();
			if (this.font == 65535) {
				this.font = -1;
			}
			this.textHasBlackShadow = buffer.getUByte() == 1;
			this.disabledColor = buffer.getInt();
			this.objSpritePadX = buffer.getShort();
			this.objSpritePadY = buffer.getShort();
			final int i_38_ = buffer.getUByte();
			if (i_38_ == 1) {
				clickMask |= 0x40000000;
			}
			this.oiActions = new String[5];
			for (int i_39_ = 0; i_39_ < 5; i_39_++) {
				final String string = buffer.getJagexString();
				if (string.length() > 0) {
					this.oiActions[i_39_] = string;
					clickMask |= 1 << i_39_ + 23;
				}
			}
		}
		if (this.type == 8) {
			this.disabledText = buffer.getJagexString();
		}
		if (this.actionType == 2 || this.type == 2) {
			this.spellPrefix = buffer.getJagexString();
			this.spellNameoi = buffer.getJagexString();
			final int i_40_ = 0x3f & buffer.getUShort();
			clickMask |= i_40_ << 11;
		}
		if (this.actionType == 1 || this.actionType == 4 || this.actionType == 5 || this.actionType == 6) {
			this.tooltip = buffer.getJagexString();
			if (this.tooltip.length() == 0) {
				if (this.actionType == 1) {
					this.tooltip = StringLibrary.okString;
				}
				if (this.actionType == 4) {
					this.tooltip = StringLibrary.selectString;
				}
				if (this.actionType == 5) {
					this.tooltip = StringLibrary.selectString;
				}
				if (this.actionType == 6) {
					this.tooltip = StringLibrary.continueString;
				}
			}
		}
		if (this.actionType == 1 || this.actionType == 4 || this.actionType == 5) {
			clickMask |= 0x400000;
		}
		if (this.actionType == 6) {
			clickMask |= 0x1;
		}
		this.clickMask = new InterfaceClickMask(clickMask, -1);
	}

	final AbstractSprite constructSpriteFromId(final boolean enabled) {
		Class88.interfaceSpriteIsNull = false;
		int spriteId;
		if (enabled) {
			spriteId = this.enabledSpriteId;
		} else {
			spriteId = this.disabledSpriteId;
		}
		if (spriteId == -1) {
			return null;
		}
		final long spriteUid = ((this.flipHorizontal ? 1L : 00L) << 39) + ((long) this.outline << 36) + spriteId + ((this.isAlphaSprite ? 1L : 0L) << 35) + ((this.flipVertical ? 1L : 0L) << 38) + ((long) this.shadow << 40);
		AbstractSprite cachedSprite = (AbstractSprite) spriteCache.get(spriteUid);
		if (cachedSprite != null) {
			return cachedSprite;
		}
		LDSprite ldSprite;
		if (this.isAlphaSprite) {
			ldSprite = Class120_Sub12_Sub26.constructLDSpriteAlpha(spriteJs5, spriteId, 0);
		} else {
			ldSprite = Class120_Sub14_Sub13.constructLDSprite(spriteJs5, spriteId, 0);
		}
		if (ldSprite == null) {
			Class88.interfaceSpriteIsNull = true;
			return null;
		}
		if (this.flipVertical) {
			ldSprite.flipVertical();
		}
		if (this.flipHorizontal) {
			ldSprite.flipHorizontal();
		}
		if (this.outline > 0) {
			ldSprite.method1616(this.outline);
		}
		if (this.outline >= 1) {
			ldSprite.outline(1);
		}
		if (this.outline >= 2) {
			ldSprite.outline(16777215);
		}
		if (this.shadow != 0) {
			ldSprite.shadow(this.shadow);
		}
		if (HDToolkit.glEnabled) {
			if (ldSprite instanceof LDTransparentSprite) {//Could be "this.isAlphaSprite"? instead of instanceof
				cachedSprite = new HDTransparentSprite(ldSprite);
			} else {
				cachedSprite = new HDSprite(ldSprite);
			}
		} else {
			cachedSprite = ldSprite;
		}
		spriteCache.put(cachedSprite, spriteUid);
		return cachedSprite;
	}

	private final int[] decodeListenerValues(final Buffer buffer) {
		final int len = buffer.getUByte();
		if (len == 0) {
			return null;
		}
		final int[] values = new int[len];
		for (int id = 0; id < len; id++) {
			values[id] = buffer.getInt();
		}
		return values;
	}

	final void decodeNew(final Buffer buffer) {
		this.newFormat = true;
		buffer.pos++;
		this.type = buffer.getUByte();
		if ((0x80 & this.type) != 0) {
			this.type &= 0x7f;
			buffer.getJagexString();
		}
		this.clientCode = buffer.getUShort();
		this.originalX = buffer.getShort();
		this.originalY = buffer.getShort();
		this.originalWidth = buffer.getUShort();
		this.originalHeight = buffer.getUShort();
		this.dynamicWidthValue = buffer.getByte();
		this.dynamicHeightValue = buffer.getByte();
		this.dynamicXValue = buffer.getByte();
		this.dynamicYValue = buffer.getByte();
		this.parent = buffer.getUShort();
		if (this.parent == 65535) {
			this.parent = -1;
		} else {
			this.parent = (this.bitPacked & ~0xffff) + this.parent;
		}
		this.hidden = buffer.getUByte() == 1;
		if (this.type == 0) {
			this.maxScrollHorizontal = buffer.getUShort();
			this.maxScrollVertical = buffer.getUShort();
			this.aBoolean1960 = buffer.getUByte() == 1;
		}
		if (this.type == 5) {
			this.disabledSpriteId = buffer.getInt();
			this.rotation = buffer.getUShort();
			final int spriteFlag = buffer.getUByte();
			this.gridOriginal = (spriteFlag & 0x1) != 0;
			this.isAlphaSprite = (spriteFlag & 0x2) != 0;
			this.alpha = buffer.getUByte();
			this.outline = buffer.getUByte();
			this.shadow = buffer.getInt();
			this.flipVertical = buffer.getUByte() == 1;
			this.flipHorizontal = buffer.getUByte() == 1;
			this.disabledColor = buffer.getInt();
		}
		if (this.type == 6) {
			this.modelTypeDisabled = 1;
			this.modelIdDisabled = buffer.getUShort();
			if (this.modelIdDisabled == 65535) {
				this.modelIdDisabled = -1;
			}
			this.translateX = buffer.getShort();
			this.translateY = buffer.getShort();
			this.rotateX = buffer.getUShort();
			this.rotateY = buffer.getUShort();
			this.rotateZ = buffer.getUShort();
			this.zoom = buffer.getUShort();
			this.disabledAnim = buffer.getUShort();
			if (this.disabledAnim == 65535) {
				this.disabledAnim = -1;
			}
			this.aBoolean2046 = buffer.getUByte() == 1;
			this.aShort2093 = (short) buffer.getUShort();
			this.aShort2065 = (short) buffer.getUShort();
			this.ignoreDepthMask = buffer.getUByte() == 1;
			if (this.dynamicWidthValue != 0) {
				this.anInt2069 = buffer.getUShort();
			}
			if (this.dynamicHeightValue != 0) {
				this.anInt2007 = buffer.getUShort();
			}
		}
		if (this.type == 4) {
			this.font = buffer.getUShort();
			if (this.font == 65535) {
				this.font = -1;
			}
			this.disabledText = buffer.getJagexString();
			this.verticalSpacing = buffer.getUByte();
			this.horizontalAlignment = buffer.getUByte();
			this.verticalAlignment = buffer.getUByte();
			this.textHasBlackShadow = buffer.getUByte() == 1;
			this.disabledColor = buffer.getInt();
		}
		if (this.type == 3) {
			this.disabledColor = buffer.getInt();
			this.filled = buffer.getUByte() == 1;
			this.alpha = buffer.getUByte();
		}
		if (this.type == 9) {
			this.lineWidth = buffer.getUByte();
			this.disabledColor = buffer.getInt();
			this.invertYAxis = buffer.getUByte() == 1;
		}
		final int clickMask = buffer.getMedium();
		int i_50_ = buffer.getUByte();
		if (i_50_ != 0) {
			this.keyCodes = new byte[10];
			this.keyPressDelay = new int[10];
			this.keyHeldMask = new byte[10];
			for (/**/; i_50_ != 0; i_50_ = buffer.getUByte()) {
				final int i_51_ = (i_50_ >> 4) - 1;
				i_50_ = buffer.getUByte() | i_50_ << 8;
				i_50_ &= 0xfff;
				if (i_50_ != 4095) {
					this.keyPressDelay[i_51_] = i_50_;
				} else {
					this.keyPressDelay[i_51_] = -1;
				}
				this.keyCodes[i_51_] = buffer.getByte();
				this.keyHeldMask[i_51_] = buffer.getByte();
			}
		}
		this.spellNameni = buffer.getJagexString();
		final int i_52_ = buffer.getUByte();
		final int i_53_ = i_52_ >> 4;
		final int i_54_ = 0xf & i_52_;
		if (i_54_ > 0) {
			this.niActions = new String[i_54_];
			for (int i_55_ = 0; i_54_ > i_55_; i_55_++) {
				this.niActions[i_55_] = buffer.getJagexString();
			}
		}
		if (i_53_ > 0) {
			final int i_56_ = buffer.getUByte();
			this.cursors = new int[i_56_ + 1];
			for (int i_57_ = 0; i_57_ < this.cursors.length; i_57_++) {
				this.cursors[i_57_] = -1;
			}
			this.cursors[i_56_] = buffer.getUShort();
		}
		if (i_53_ > 1) {
			final int i_58_ = buffer.getUByte();
			this.cursors[i_58_] = buffer.getUShort();
		}
		this.actionSufix = buffer.getJagexString();
		if (this.actionSufix.equals("")) {
			this.actionSufix = null;
		}
		int paramId = -1;
		this.pixelsBeforeDrag = buffer.getUByte();
		this.cyclesBeforeDrag = buffer.getUByte();
		this.keepDragAlpha = buffer.getUByte() == 1;
		this.spellPrefix = buffer.getJagexString();
		if (Class153.method2073(clickMask) != 0) {
			paramId = buffer.getUShort();
			if (paramId == 65535) {
				paramId = -1;
			}
			this.targetCursorId = buffer.getUShort();
			if (this.targetCursorId == 65535) {
				this.targetCursorId = -1;
			}
			this.cursorId = buffer.getUShort();
			if (this.cursorId == 65535) {
				this.cursorId = -1;
			}
		}
		this.clickMask = new InterfaceClickMask(clickMask, paramId);
		this.onloadListener = decodeListener(buffer);
		this.onMouseOverListener = decodeListener(buffer);
		this.onMouseLeaveListener = decodeListener(buffer);
		this.onSpellDeselectionListener = decodeListener(buffer);
		this.onSpellSelectionListener = decodeListener(buffer);
		this.onVarpUpdateListener = decodeListener(buffer);
		this.onInventoryUpdateListener = decodeListener(buffer);
		this.onSkillUpdateListener = decodeListener(buffer);
		this.onLoopCycleListener = decodeListener(buffer);
		this.onComponentClickListener = decodeListener(buffer);
		this.onMouseFocusedListener = decodeListener(buffer);
		this.onClickListener = decodeListener(buffer);
		this.onHeldListener = decodeListener(buffer);
		this.onReleaseListener = decodeListener(buffer);
		this.onMouseDragListener = decodeListener(buffer);
		this.onComponentDraggedListener = decodeListener(buffer);
		this.onComponentSwapListener = decodeListener(buffer);
		this.onMouseWheelListener = decodeListener(buffer);
		this.integerScriptValuesListener = decodeListener(buffer);
		this.stringScriptValuesListener = decodeListener(buffer);
		this.varpListenerTriggers = decodeListenerValues(buffer);
		this.inventoryListenerTriggers = decodeListenerValues(buffer);
		this.skillListernerTriggers = decodeListenerValues(buffer);
		this.integerScriptValuesTriggers = decodeListenerValues(buffer);
		this.stringScriptValuesTriggers = decodeListenerValues(buffer);
	}

	final void swapObj(final int newIndex, final int oldIndex) {
		int oldData = this.objIds[newIndex];
		this.objIds[newIndex] = this.objIds[oldIndex];
		this.objIds[oldIndex] = oldData;
		oldData = this.objAmounts[newIndex];
		this.objAmounts[newIndex] = this.objAmounts[oldIndex];
		this.objAmounts[oldIndex] = oldData;
	}

	final AbstractFont getFont(final AbstractIndexedSprite[] nameIcons) {
		Class88.interfaceSpriteIsNull = false;
		if (this.font == -1) {
			return null;
		}
		AbstractFont abstractFont = (AbstractFont) fontCache.get(this.font);
		if (abstractFont != null) {
			return abstractFont;
		}
		abstractFont = Class9.constructAbstractFont(spriteJs5, aClass50_3213, this.font, 0);
		if (abstractFont == null) {
			Class88.interfaceSpriteIsNull = true;
		} else {
			abstractFont.setNameIcons(nameIcons, null);
			fontCache.put(abstractFont, this.font);
		}
		return abstractFont;
	}

	static final void method2499(final int i_64_, final int i_65_) {
		Class120_Sub12_Sub11.outputStream.putByteIsaac(178);
		Class120_Sub12_Sub11.outputStream.putLEShort(i_64_);
		Class120_Sub12_Sub11.outputStream.putInt2(i_65_);
	}

	static final void method2500() {
		CursorType.anInt1237 = 0;
		while_176_: for (int i = 0; i < Class49.anInt438; i++) {
			final Class188 class188 = SceneGraphNode.aClass188Array1782[i];
			if (client.anIntArray562 != null) {
				for (int i_66_ = 0; i_66_ < client.anIntArray562.length; i_66_++) {
					if (client.anIntArray562[i_66_] != -1000000 && (class188.anInt1920 <= client.anIntArray562[i_66_] || class188.anInt1928 <= client.anIntArray562[i_66_]) && (class188.anInt1913 <= SpotAnimation.anIntArray2921[i_66_] || class188.anInt1924 <= SpotAnimation.anIntArray2921[i_66_])
							&& (class188.anInt1913 >= Class31.anIntArray243[i_66_] || class188.anInt1924 >= Class31.anIntArray243[i_66_]) && (class188.anInt1911 <= IsaacCipher.anIntArray1015[i_66_] || class188.anInt1927 <= IsaacCipher.anIntArray1015[i_66_])
							&& (class188.anInt1911 >= Class89.anIntArray838[i_66_] || class188.anInt1927 >= Class89.anIntArray838[i_66_])) {
						continue while_176_;
					}
				}
			}
			if (class188.anInt1915 == 1) {
				final int i_67_ = class188.anInt1916 - Class120_Sub12_Sub26.anInt3332 + Class120_Sub14_Sub13.anInt3563;
				if (i_67_ >= 0 && i_67_ <= Class120_Sub14_Sub13.anInt3563 + Class120_Sub14_Sub13.anInt3563) {
					int i_68_ = class188.anInt1923 - Class112.anInt1080 + Class120_Sub14_Sub13.anInt3563;
					if (i_68_ < 0) {
						i_68_ = 0;
					}
					int i_69_ = class188.anInt1919 - Class112.anInt1080 + Class120_Sub14_Sub13.anInt3563;
					if (i_69_ > Class120_Sub14_Sub13.anInt3563 + Class120_Sub14_Sub13.anInt3563) {
						i_69_ = Class120_Sub14_Sub13.anInt3563 + Class120_Sub14_Sub13.anInt3563;
					}
					boolean bool = false;
					while_172_: do {
						do {
							if (i_68_ > i_69_) {
								break while_172_;
							}
						} while (!SpotAnimType.aBooleanArrayArray992[i_67_][i_68_++]);
						bool = true;
					} while (false);
					if (bool) {
						int i_70_ = DisplayModeInfo.anInt1713 - class188.anInt1913;
						if (i_70_ > 32) {
							class188.anInt1921 = 1;
						} else {
							if (i_70_ >= -32) {
								continue;
							}
							class188.anInt1921 = 2;
							i_70_ = -i_70_;
						}
						class188.anInt1914 = (class188.anInt1911 - Class145.anInt1381 << 8) / i_70_;
						class188.anInt1922 = (class188.anInt1927 - Class145.anInt1381 << 8) / i_70_;
						class188.anInt1918 = (class188.anInt1920 - PlayerAppearance.anInt1367 << 8) / i_70_;
						class188.anInt1917 = (class188.anInt1928 - PlayerAppearance.anInt1367 << 8) / i_70_;
						AnimatedLocation.aClass188Array3076[CursorType.anInt1237++] = class188;
					}
				}
			} else if (class188.anInt1915 == 2) {
				final int i_71_ = class188.anInt1923 - Class112.anInt1080 + Class120_Sub14_Sub13.anInt3563;
				if (i_71_ >= 0 && i_71_ <= Class120_Sub14_Sub13.anInt3563 + Class120_Sub14_Sub13.anInt3563) {
					int i_72_ = class188.anInt1916 - Class120_Sub12_Sub26.anInt3332 + Class120_Sub14_Sub13.anInt3563;
					if (i_72_ < 0) {
						i_72_ = 0;
					}
					int i_73_ = class188.anInt1910 - Class120_Sub12_Sub26.anInt3332 + Class120_Sub14_Sub13.anInt3563;
					if (i_73_ > Class120_Sub14_Sub13.anInt3563 + Class120_Sub14_Sub13.anInt3563) {
						i_73_ = Class120_Sub14_Sub13.anInt3563 + Class120_Sub14_Sub13.anInt3563;
					}
					boolean bool = false;
					while_173_: do {
						do {
							if (i_72_ > i_73_) {
								break while_173_;
							}
						} while (!SpotAnimType.aBooleanArrayArray992[i_72_++][i_71_]);
						bool = true;
					} while (false);
					if (bool) {
						int i_74_ = Class145.anInt1381 - class188.anInt1911;
						if (i_74_ > 32) {
							class188.anInt1921 = 3;
						} else {
							if (i_74_ >= -32) {
								continue;
							}
							class188.anInt1921 = 4;
							i_74_ = -i_74_;
						}
						class188.anInt1912 = (class188.anInt1913 - DisplayModeInfo.anInt1713 << 8) / i_74_;
						class188.anInt1926 = (class188.anInt1924 - DisplayModeInfo.anInt1713 << 8) / i_74_;
						class188.anInt1918 = (class188.anInt1920 - PlayerAppearance.anInt1367 << 8) / i_74_;
						class188.anInt1917 = (class188.anInt1928 - PlayerAppearance.anInt1367 << 8) / i_74_;
						AnimatedLocation.aClass188Array3076[CursorType.anInt1237++] = class188;
					}
				}
			} else if (class188.anInt1915 == 4) {
				final int i_75_ = class188.anInt1920 - PlayerAppearance.anInt1367;
				if (i_75_ > 128) {
					int i_76_ = class188.anInt1923 - Class112.anInt1080 + Class120_Sub14_Sub13.anInt3563;
					if (i_76_ < 0) {
						i_76_ = 0;
					}
					int i_77_ = class188.anInt1919 - Class112.anInt1080 + Class120_Sub14_Sub13.anInt3563;
					if (i_77_ > Class120_Sub14_Sub13.anInt3563 + Class120_Sub14_Sub13.anInt3563) {
						i_77_ = Class120_Sub14_Sub13.anInt3563 + Class120_Sub14_Sub13.anInt3563;
					}
					if (i_76_ <= i_77_) {
						int i_78_ = class188.anInt1916 - Class120_Sub12_Sub26.anInt3332 + Class120_Sub14_Sub13.anInt3563;
						if (i_78_ < 0) {
							i_78_ = 0;
						}
						int i_79_ = class188.anInt1910 - Class120_Sub12_Sub26.anInt3332 + Class120_Sub14_Sub13.anInt3563;
						if (i_79_ > Class120_Sub14_Sub13.anInt3563 + Class120_Sub14_Sub13.anInt3563) {
							i_79_ = Class120_Sub14_Sub13.anInt3563 + Class120_Sub14_Sub13.anInt3563;
						}
						boolean bool = false;
						while_174_: for (int i_80_ = i_78_; i_80_ <= i_79_; i_80_++) {
							for (int i_81_ = i_76_; i_81_ <= i_77_; i_81_++) {
								if (SpotAnimType.aBooleanArrayArray992[i_80_][i_81_]) {
									bool = true;
									break while_174_;
								}
							}
						}
						if (bool) {
							class188.anInt1921 = 5;
							class188.anInt1912 = (class188.anInt1913 - DisplayModeInfo.anInt1713 << 8) / i_75_;
							class188.anInt1926 = (class188.anInt1924 - DisplayModeInfo.anInt1713 << 8) / i_75_;
							class188.anInt1914 = (class188.anInt1911 - Class145.anInt1381 << 8) / i_75_;
							class188.anInt1922 = (class188.anInt1927 - Class145.anInt1381 << 8) / i_75_;
							AnimatedLocation.aClass188Array3076[CursorType.anInt1237++] = class188;
						}
					}
				}
			}
		}
	}

	//Calculates length of orb type sprites and where it starts for checking bounds.
	final boolean calculatedSpriteVars() {//TODO new naming.
		if (this.startOfSpriteLookupTable != null) {
			return true;
		}
		final LDIndexedSprite sprite = Class164.constructLDIndexedSprite(spriteJs5, this.disabledSpriteId, 0);
		if (sprite == null) {
			return false;
		}
		sprite.method923();
		this.lengthOfSpriteLookupTable = new int[sprite.height];
		this.startOfSpriteLookupTable = new int[sprite.height];
		for (int y = 0; y < sprite.height; y++) {
			int notBlackPixel = 0;
			for (int x = 0; x < sprite.width; x++) {
				if (sprite.paletteIndicators[x + y * sprite.width] != 0) {
					notBlackPixel = x;
					break;
				}
			}
			int blackPixel = sprite.width;
			for (int x = notBlackPixel; x < sprite.width; x++) {
				if (sprite.paletteIndicators[sprite.width * y + x] == 0) {
					blackPixel = x;
					break;
				}
			}
			this.startOfSpriteLookupTable[y] = notBlackPixel;//use y to get x
			this.lengthOfSpriteLookupTable[y] = blackPixel - notBlackPixel;//use y to get length
		}
		return true;
	}

	static final long getWallDecorationUid(final int x, final int z, final int level) {
		final GroundTile class120_sub18 = LabelGroup.activeGroundTiles[level][x][z];
		if (class120_sub18 == null || class120_sub18.wallDecoration == null) {
			return 0L;
		}
		return class120_sub18.wallDecoration.bitPacked;
	}

	private final Object[] decodeListener(final Buffer buffer) {
		final int len = buffer.getUByte();
		if (len == 0) {
			return null;
		}
		final Object[] values = new Object[len];
		for (int id = 0; id < len; id++) {
			final int type = buffer.getUByte();
			if (type == 0) {
				values[id] = new Integer(buffer.getInt());
			} else if (type == 1) {
				values[id] = buffer.getJagexString();
			}
		}
		this.hasListener = true;
		return values;
	}

	static final void setup(final js5 js5, final js5 class50_2_, final js5 class50_3_, final js5 class50_4_) {
		spriteJs5 = js5;
		aClass50_1721 = class50_4_;
		interfaceJs5 = class50_3_;
		aClass50_3213 = class50_2_;
		interfaceCache = new JagexInterface[interfaceJs5.method421()][];
		interfaceLoaded = new boolean[interfaceJs5.method421()];
	}

	static final JagexInterface getParentInterface(final JagexInterface jagexInterface) {
		if (jagexInterface.parent != -1) {
			return Class74.getJagexInterface(jagexInterface.parent);
		}
		final int id = jagexInterface.bitPacked >>> 16;
		final Class140 class140 = new Class140(Class120_Sub12_Sub13.overridedInterfaces);
		for (OverridedJInterface overridedJInterface = (OverridedJInterface) class140.next(); overridedJInterface != null; overridedJInterface = (OverridedJInterface) class140.getNext()) {
			if (id == overridedJInterface.interfaceId) {
				return Class74.getJagexInterface((int) overridedJInterface.uid);
			}
		}
		return null;
	}

	static final String getActionNI(final JagexInterface jagexInterface, final int actionId) {
		if (!client.getClickMask(jagexInterface).method1678(actionId) && jagexInterface.onComponentClickListener == null) {
			return null;
		}
		if (jagexInterface.niActions == null || actionId >= jagexInterface.niActions.length || jagexInterface.niActions[actionId] == null || jagexInterface.niActions[actionId].trim().length() == 0) {
			if (Class120_Sub30_Sub1.qaOpTestEnabled) {
				return "Hidden-" + actionId;
			}
			return null;
		}
		return jagexInterface.niActions[actionId];
	}

	static final int getCursor(final JagexInterface jagexInterface, final int id) {
		if (!client.getClickMask(jagexInterface).method1678(id) && jagexInterface.onComponentClickListener == null) {
			return -1;
		}
		return jagexInterface.cursors == null || jagexInterface.cursors.length <= id ? -1 : jagexInterface.cursors[id];
	}

	static final JagexInterface getComponent(final int bitPacked, final int componentIndex) {
		final JagexInterface jagexInterface = Class74.getJagexInterface(bitPacked);
		if (componentIndex == -1) {
			return jagexInterface;
		}
		if (jagexInterface == null || jagexInterface.components == null || componentIndex >= jagexInterface.components.length) {
			return null;
		}
		return jagexInterface.components[componentIndex];
	}

	public JagexInterface() {
		this.cursorId = -1;
		this.clicked = false;
		this.keepDragAlpha = false;
		this.hasListener = false;
		this.alpha = 0;
		this.translateX = 0;
		this.tooltip = StringLibrary.okString;
		this.pixelsBeforeDrag = 0;
		this.dynamicWidthValue = (byte) 0;
		this.maxScrollHorizontal = 0;
		this.bitPacked = -1;
		this.invertYAxis = false;
		this.ignoreDepthMask = false;
		this.horizontalAlignment = 0;
		this.isAlphaSprite = false;
		this.enabledText = "";
		this.anInt1997 = -1;
		this.verticalScrollPosition = 0;
		this.enabledColor = 0;
		this.spellNameoi = "";
		this.filled = false;
		this.disabledColor = 0;
		this.width = 0;
		this.y = 0;
		this.enabledAnim = -1;
		this.originalX = 0;
		this.hidden = false;
		this.zoom = 100;
		this.mouseOver = false;
		this.anInt2007 = 0;
		this.aBoolean2046 = false;
		this.lineWidth = 1;
		this.anInt2033 = 0;
		this.mouseOverId = -1;
		this.shadow = 0;
		this.gridOriginal = false;
		this.rotateX = 0;
		this.rotateSpeed = 0;
		this.dynamicYValue = (byte) 0;
		this.height = 0;
		this.anInt2028 = 0;
		this.targetCursorId = -1;
		this.objId = -1;
		this.cyclesBeforeDrag = 0;
		this.drawObjCount = true;
		this.aShort2065 = (short) 3000;
		this.anInt2049 = -1;
		this.horizontalScrollPosition = 0;
		modelTypeEnabled = 1;
		this.verticalSpacing = 0;
		this.textHasBlackShadow = false;
		this.lastSkillTriggersPos = 0;
		this.clientCode = 0;
		this.objSpritePadX = 0;
		this.currentFrame = 0;
		this.maxScrollVertical = 0;
		this.actionType = 0;
		this.parent = -1;
		this.dynamicXValue = (byte) 0;
		this.originalWidth = 0;
		this.verticalAlignment = 0;
		this.enabledSpriteId = -1;
		this.disabledAnim = -1;
		this.objSpritePadY = 0;
		this.anInt1982 = 1;
		modelIdEnabled = -1;
		this.objCount = 0;
		this.font = -1;
		this.spellNameni = "";
		this.anInt2064 = 0;
		this.clickMask = Class110.aClass120_Sub20_1053;
		this.disabledMouseOverColor = 0;
		this.originalHeight = 0;
		this.anInt2069 = 0;
		this.enabledMouseOverColor = 0;
		this.redrawId = -1;
		this.xOffset2d = 0;
		this.newFormat = false;
		this.aBoolean1960 = false;
		this.modelTypeDisabled = 1;
		this.rotation = 0;
		this.redrawCycle = -1;
		this.yOffset2d = 0;
		this.rotateY = 0;
		this.anInt2037 = 0;
		this.x = 0;
		this.aShort2093 = (short) 0;
		this.dynamicHeightValue = (byte) 0;
		this.disabledSpriteId = -1;
		this.componentIndex = -1;
		this.originalY = 0;
		this.outline = 0;
		this.aBoolean2097 = false;
		this.translateY = 0;
		this.anInt2088 = -1;
		this.spellPrefix = "";
		this.nextFrame = 1;
		this.anInt2085 = 1;
	}
}
