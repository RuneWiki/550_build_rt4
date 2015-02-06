/* Class189 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class JagexInterface {
	Object[] onInventoryUpdateListener;
	int maxScrollHorizontal;
	JagexInterface aClass189_1931 = null;
	Object[] anObjectArray1932;
	InterfaceClickMask clickMask;
	String tooltip;
	int rotateZ = 0;
	String enabledText;
	int maxScrollVertical;
	int y;
	boolean aBoolean1939;
	boolean hasListener;
	int cursorId;
	Object[] anObjectArray1942;
	boolean flipVertical;
	Object[] anObjectArray1944;
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
	boolean aBoolean1956;
	int[] spriteIDs;
	boolean flipHorizontal;
	Object[] anObjectArray1959;
	boolean aBoolean1960;
	int mediaIdDisabled;
	int anInt1962;
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
	int anInt1977;
	int[] objIds;
	String spellNameoi;
	Object[] onSpellSelectionListener;
	int translateX;
	int anInt1982;
	int[] objAmounts;
	Object[] anObjectArray1984;
	int[] keyPressDelay;
	int[] spriteYs;
	private int mediaTypeEnabled;
	int[] spriteXs;
	boolean aBoolean1989;
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
	boolean aBoolean2001;
	int anInt2002;
	boolean aBoolean2003;
	int anInt2004;
	int zoom;
	Object[] anObjectArray2006;
	int anInt2007;
	int translateY;
	int verticalAlignment;
	int mouseOverId;
	int horizontalAlignment;
	int enabledSpriteId;
	Object[] anObjectArray2013;
	int originalWidth;
	int originalX;
	private int mediaIdEnabled;
	byte dynamicYValue;
	boolean hasAlpha;
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
	boolean aBoolean2035;
	Object[] anObjectArray2036;
	int anInt2037;
	int[] valueCompareType;
	int[] varpListenerTriggers;
	boolean shaded;
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
	int anInt2066;
	int font;
	static int anInt2068 = 0;
	int anInt2069;
	int rotation;
	int[] requiredValues;
	JagexInterface[] components;
	int x;
	Object[] onMouseLeaveListener;
	int objCount;
	int anInt2076;
	int objSpritePadY;
	int anInt2078;
	int[] startOfSpriteLookupTable;
	Object[] onClickListener;
	int disabledMouseOverColor;
	int redrawId;
	int componentIndex;
	Object[] onReleaseListener;
	int anInt2085;
	Object[] anObjectArray2086;
	int enabledMouseOverColor;
	int anInt2088;
	Object[] onResizeListener;
	int outline;
	int rotateY;
	byte dynamicHeightValue;
	short aShort2093;
	int anInt2094;
	String selectedSpellName;
	int[] integerScriptValuesTriggers;
	boolean aBoolean2097;
	int nextFrame;
	static ObjectCache spriteCache = new ObjectCache(200);

	static {
		inserting = 0;
		playerMenuActionCodes = new short[] { 43, 29, 60, 31, 22, 14, 24, 12 };
		anInt2053 = 0;
	}

	final AbstractModelRenderer method2486(final SeqType seqType, final PlayerAppearance playerAppearance, final int i, final int i_3_, final int i_4_, final boolean bool) {
		int i_5_;
		int i_6_;
		if (!bool) {
			i_6_ = this.modelTypeDisabled;
			i_5_ = this.mediaIdDisabled;
		} else {
			i_5_ = mediaIdEnabled;
			i_6_ = mediaTypeEnabled;
		}
		Class88.interfaceSpriteIsNull = false;
		if (i_6_ == 0) {
			return null;
		}
		if (i_6_ == 1 && i_5_ == -1) {
			return null;
		}
		if (i_6_ == 1) {
			AbstractModelRenderer class180_sub7_7_ = (AbstractModelRenderer) LabelGroup.aClass21_2406.get(i_5_ + (i_6_ << 16));
			if (class180_sub7_7_ == null) {
				final Model class180_sub2 = Model.get(Decimator.aClass50_1721, i_5_, 0);
				if (class180_sub2 == null) {
					Class88.interfaceSpriteIsNull = true;
					return null;
				}
				class180_sub7_7_ = class180_sub2.toRenderer(64, 768, -50, -10, -50);
				LabelGroup.aClass21_2406.put(class180_sub7_7_, i_5_ + (i_6_ << 16));
			}
			if (seqType != null) {
				class180_sub7_7_ = seqType.method323(class180_sub7_7_, i_4_, i, i_3_);
			}
			return class180_sub7_7_;
		}
		if (i_6_ == 2) {
			final AbstractModelRenderer class180_sub7_8_ = NpcType.list(i_5_).method2210(seqType, i, i_4_, i_3_);
			if (class180_sub7_8_ == null) {
				Class88.interfaceSpriteIsNull = true;
				return null;
			}
			return class180_sub7_8_;
		}
		if (i_6_ == 3) {
			if (playerAppearance == null) {
				return null;
			}
			final AbstractModelRenderer class180_sub7_9_ = playerAppearance.method2044(seqType, i_4_, i, i_3_);
			if (class180_sub7_9_ == null) {
				Class88.interfaceSpriteIsNull = true;
				return null;
			}
			return class180_sub7_9_;
		}
		if (i_6_ == 4) {
			final ObjType objType = ObjType.list(i_5_);
			final AbstractModelRenderer class180_sub7_10_ = objType.method2105(i_3_, 10, i, playerAppearance, seqType, i_4_);
			if (class180_sub7_10_ == null) {
				Class88.interfaceSpriteIsNull = true;
				return null;
			}
			return class180_sub7_10_;
		}
		if (i_6_ == 6) {
			final AbstractModelRenderer class180_sub7_11_ = NpcType.list(i_5_).method2212(i_3_, 0, null, seqType, i, null, 0, 0, i_4_);
			if (class180_sub7_11_ == null) {
				Class88.interfaceSpriteIsNull = true;
				return null;
			}
			return class180_sub7_11_;
		}
		if (i_6_ == 7) {
			if (playerAppearance == null) {
				return null;
			}
			final int i_12_ = this.mediaIdDisabled & 0xffff;
			final int i_13_ = this.anInt1997;
			final int i_14_ = this.mediaIdDisabled >>> 16;
			final AbstractModelRenderer class180_sub7_15_ = playerAppearance.method2041(-6, seqType, i_12_, i_13_, i_3_, i_4_, i_14_, i);
			if (class180_sub7_15_ == null) {
				Class88.interfaceSpriteIsNull = true;
				return null;
			}
			return class180_sub7_15_;
		}
		return null;
	}

	final AbstractSprite method2487(final int i_16_) {
		Class88.interfaceSpriteIsNull = false;
		if (i_16_ < 0 || i_16_ >= this.spriteIDs.length) {
			return null;
		}
		final int i_17_ = this.spriteIDs[i_16_];
		if (i_17_ == -1) {
			return null;
		}
		AbstractSprite class120_sub14_sub19_18_ = (AbstractSprite) spriteCache.get(i_17_);
		if (class120_sub14_sub19_18_ != null) {
			return class120_sub14_sub19_18_;
		}
		class120_sub14_sub19_18_ = ParticleType.constructAbstractSprite(Class89.aClass50_836, i_17_, 0);
		if (class120_sub14_sub19_18_ == null) {
			Class88.interfaceSpriteIsNull = true;
		} else {
			spriteCache.put(class120_sub14_sub19_18_, i_17_);
		}
		return class120_sub14_sub19_18_;
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
			this.shaded = buffer.getUByte() == 1;
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
			this.mediaIdDisabled = buffer.getUShort();
			if (this.mediaIdDisabled == 65535) {
				this.mediaIdDisabled = -1;
			}
			mediaTypeEnabled = 1;
			mediaIdEnabled = buffer.getUShort();
			if (mediaIdEnabled == 65535) {
				mediaIdEnabled = -1;
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
			this.shaded = buffer.getUByte() == 1;
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
			this.selectedSpellName = buffer.getJagexString();
			this.spellNameoi = buffer.getJagexString();
			final int i_40_ = 0x3f & buffer.getUShort();
			clickMask |= i_40_ << 11;
		}
		if (this.actionType == 1 || this.actionType == 4 || this.actionType == 5 || this.actionType == 6) {
			this.tooltip = buffer.getJagexString();
			if (this.tooltip.length() == 0) {
				if (this.actionType == 1) {
					this.tooltip = Class120_Sub12_Sub28.okString;
				}
				if (this.actionType == 4) {
					this.tooltip = Class143.selectString;
				}
				if (this.actionType == 5) {
					this.tooltip = Class143.selectString;
				}
				if (this.actionType == 6) {
					this.tooltip = Class109.continueString;
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
		final long spriteUid = ((this.flipHorizontal ? 1L : 00L) << 39) + ((long) this.outline << 36) + spriteId + ((this.hasAlpha ? 1L : 0L) << 35) + ((this.flipVertical ? 1L : 0L) << 38) + ((long) this.shadow << 40);
		AbstractSprite cachedSprite = (AbstractSprite) spriteCache.get(spriteUid);
		if (cachedSprite != null) {
			return cachedSprite;
		}
		LDSprite ldSprite;
		if (this.hasAlpha) {
			ldSprite = Class120_Sub12_Sub26.constructLDSpriteAlpha(Class89.aClass50_836, spriteId, 0);
		} else {
			ldSprite = Class120_Sub14_Sub13.constructLDSprite(Class89.aClass50_836, spriteId, 0);
		}
		if (ldSprite == null) {
			Class88.interfaceSpriteIsNull = true;
			return null;
		}
		if (this.flipVertical) {
			ldSprite.method1608();
		}
		if (this.flipHorizontal) {
			ldSprite.method1603();
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
			if (!(ldSprite instanceof LDTransparentSprite)) {
				cachedSprite = new HDSprite(ldSprite);
			} else {
				cachedSprite = new HDTransparentSprite(ldSprite);
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
			final int i_48_ = buffer.getUByte();
			this.aBoolean2001 = (i_48_ & 0x1) != 0;
			this.hasAlpha = (i_48_ & 0x2) != 0;
			this.alpha = buffer.getUByte();
			this.outline = buffer.getUByte();
			this.shadow = buffer.getInt();
			this.flipVertical = buffer.getUByte() == 1;
			this.flipHorizontal = buffer.getUByte() == 1;
			this.disabledColor = buffer.getInt();
		}
		if (this.type == 6) {
			this.modelTypeDisabled = 1;
			this.mediaIdDisabled = buffer.getUShort();
			if (this.mediaIdDisabled == 65535) {
				this.mediaIdDisabled = -1;
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
			this.aBoolean2003 = buffer.getUByte() == 1;
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
			this.shaded = buffer.getUByte() == 1;
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
			this.aBoolean1989 = buffer.getUByte() == 1;
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
		this.anInt1962 = buffer.getUByte();
		this.anInt2066 = buffer.getUByte();
		this.aBoolean1939 = buffer.getUByte() == 1;
		this.selectedSpellName = buffer.getJagexString();
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
		this.anObjectArray2006 = decodeListener(buffer);
		this.onMouseFocusedListener = decodeListener(buffer);
		this.onClickListener = decodeListener(buffer);
		this.onHeldListener = decodeListener(buffer);
		this.onReleaseListener = decodeListener(buffer);
		this.onMouseDragListener = decodeListener(buffer);
		this.anObjectArray1959 = decodeListener(buffer);
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
		int i_62_ = this.objIds[newIndex];
		this.objIds[newIndex] = this.objIds[oldIndex];
		this.objIds[oldIndex] = i_62_;
		i_62_ = this.objAmounts[newIndex];
		this.objAmounts[newIndex] = this.objAmounts[oldIndex];
		this.objAmounts[oldIndex] = i_62_;
	}

	final AbstractFont method2497(final AbstractIndexedSprite[] class107s) {
		Class88.interfaceSpriteIsNull = false;
		if (this.font == -1) {
			return null;
		}
		AbstractFont class120_sub14_sub8_63_ = (AbstractFont) Class120_Sub12_Sub2.aClass21_3143.get(this.font);
		if (class120_sub14_sub8_63_ != null) {
			return class120_sub14_sub8_63_;
		}
		class120_sub14_sub8_63_ = Class9.constructAbstractFont(Class89.aClass50_836, Class120_Sub12_Sub11.aClass50_3213, this.font, 0);
		if (class120_sub14_sub8_63_ == null) {
			Class88.interfaceSpriteIsNull = true;
		} else {
			class120_sub14_sub8_63_.setNameIcons(class107s, null);
			Class120_Sub12_Sub2.aClass21_3143.put(class120_sub14_sub8_63_, this.font);
		}
		return class120_sub14_sub8_63_;
	}

	public static void method2498() {
		playerMenuActionCodes = null;
		gameShellThread = null;
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
			if (Class61.anIntArray562 != null) {
				for (int i_66_ = 0; i_66_ < Class61.anIntArray562.length; i_66_++) {
					if (Class61.anIntArray562[i_66_] != -1000000 && (class188.anInt1920 <= Class61.anIntArray562[i_66_] || class188.anInt1928 <= Class61.anIntArray562[i_66_]) && (class188.anInt1913 <= SpotAnimation.anIntArray2921[i_66_] || class188.anInt1924 <= SpotAnimation.anIntArray2921[i_66_])
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
		final LDIndexedSprite sprite = Class164.constructLDIndexedSprite(Class89.aClass50_836, this.disabledSpriteId, 0);
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

	static final long method2502(final int x, final int z, final int level) {
		final GroundTile class120_sub18 = LabelGroup.groundTiles[level][x][z];
		if (class120_sub18 == null || class120_sub18.aClass186_2639 == null) {
			return 0L;
		}
		return class120_sub18.aClass186_2639.bitPacked;
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
		this.aBoolean1939 = false;
		this.hasListener = false;
		this.alpha = 0;
		this.translateX = 0;
		this.tooltip = Class120_Sub12_Sub28.okString;
		this.anInt1962 = 0;
		this.dynamicWidthValue = (byte) 0;
		this.maxScrollHorizontal = 0;
		this.bitPacked = -1;
		this.aBoolean1989 = false;
		this.aBoolean2003 = false;
		this.horizontalAlignment = 0;
		this.hasAlpha = false;
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
		this.aBoolean2035 = false;
		this.anInt2007 = 0;
		this.aBoolean2046 = false;
		this.lineWidth = 1;
		this.anInt2033 = 0;
		this.mouseOverId = -1;
		this.shadow = 0;
		this.aBoolean2001 = false;
		this.rotateX = 0;
		this.rotateSpeed = 0;
		this.dynamicYValue = (byte) 0;
		this.height = 0;
		this.anInt2028 = 0;
		this.targetCursorId = -1;
		this.objId = -1;
		this.anInt2066 = 0;
		this.aBoolean1956 = true;
		this.aShort2065 = (short) 3000;
		this.anInt2049 = -1;
		this.horizontalScrollPosition = 0;
		mediaTypeEnabled = 1;
		this.verticalSpacing = 0;
		this.shaded = false;
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
		mediaIdEnabled = -1;
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
		this.anInt2076 = 0;
		this.newFormat = false;
		this.aBoolean1960 = false;
		this.modelTypeDisabled = 1;
		this.rotation = 0;
		this.redrawCycle = -1;
		this.anInt1977 = 0;
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
		this.selectedSpellName = "";
		this.nextFrame = 1;
		this.anInt2085 = 1;
	}
}
