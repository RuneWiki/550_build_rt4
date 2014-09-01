/* Class189 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class JagexInterface {
	Object[] anObjectArray1929;
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
	boolean aBoolean1940;
	int cursorId;
	Object[] anObjectArray1942;
	boolean flipVertical;
	Object[] anObjectArray1944;
	int disabledAnim;
	int currentFrame;
	Object[] anObjectArray1947;
	int width;
	int[] anIntArray1949;
	String disabledText = "";
	Object[] mouseDraggedListener;
	static Thread gameShellThread;
	Object[] anObjectArray1953;
	Object[] keyPressedListener;
	byte[] aByteArray1955;
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
	int thickness;
	int redrawCycle;
	int rotateSpeed;
	int[][] cs1opcodes;
	boolean aBoolean1971;
	int enabledColor;
	int[] anIntArray1973;
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
	int[] anIntArray1985;
	int[] spriteYs;
	private int mediaTypeEnabled;
	int[] spriteXs;
	boolean aBoolean1989;
	int enabledAnim;
	int[] stringScriptValuesTriggers;
	int[] cursors;
	Object[] anObjectArray1993;
	String actionSufix;
	int type;
	int actionType;
	int anInt1997;
	Object[] anObjectArray1998;
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
	boolean aBoolean2018;
	boolean filled;
	int targetCursorId;
	int horizontalScrollPosition;
	int[] skillListernerTriggers;
	int verticalScrollPosition;
	Object[] mouseWheelListener;
	int disabledColor;
	int shadow;
	static int inserting;
	int anInt2028;
	int parent;
	int anInt2030;
	int modelTypeDisabled;
	Object[] anObjectArray2032;
	int anInt2033;
	Object[] onloadListener;
	boolean aBoolean2035;
	Object[] anObjectArray2036;
	int anInt2037;
	int[] requiredValues;
	int[] varpListenerTriggers;
	boolean shaded;
	boolean newFormat;
	static short[] playerMenuActionCodes;
	int lastSkillTriggersPos;
	int objSpritePadX;
	boolean hidden;
	boolean aBoolean2046;
	int rotateX;
	byte[] aByteArray2048;
	int anInt2049;
	Object[] anObjectArray2050;
	byte dynamicXValue;
	String[] niActions;
	static int anInt2053;
	Object[] skillUpdateListener;
	int disabledSpriteId;
	String[] oiActions;
	int verticalSpacing;
	Object[] mouseFocusListener;
	int height;
	int originalHeight;
	int originalY;
	Object[] anObjectArray2062;
	int[] inventoryListenerTriggers;
	int anInt2064;
	short aShort2065;
	int anInt2066;
	int font;
	static int anInt2068 = 0;
	int anInt2069;
	int rotation;
	int[] valueCompareType;
	JagexInterface[] components;
	int x;
	Object[] mouseUnfocusListener;
	int anInt2075;
	int anInt2076;
	int objSpritePadY;
	int anInt2078;
	int[] anIntArray2079;
	Object[] mouseClickFocusListener;
	int disabledMouseOverColor;
	int redrawId;
	int componentIndex;
	Object[] mouseClickUnfocusListener;
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
	String selectedActionName;
	int[] integerScriptsValuesTriggers;
	boolean aBoolean2097;
	int nextFrame;

	static {
		inserting = 0;
		playerMenuActionCodes = new short[] { 43, 29, 60, 31, 22, 14, 24, 12 };
		anInt2053 = 0;
	}

	final void setAction(final String string, final int i_0_) {
		if (this.niActions == null || i_0_ >= this.niActions.length) {
			final String[] strings = new String[i_0_ + 1];
			if (this.niActions != null) {
				for (int i_1_ = 0; this.niActions.length > i_1_; i_1_++) {
					strings[i_1_] = this.niActions[i_1_];
				}
			}
			this.niActions = strings;
		}
		this.niActions[i_0_] = string;
	}

	final AbstractModel method2486(final SeqType seqType, final PlayerAppearance playerAppearance, final int i, final int i_3_, final int i_4_, final boolean bool) {
		int i_5_;
		int i_6_;
		if (!bool) {
			i_6_ = this.modelTypeDisabled;
			i_5_ = this.mediaIdDisabled;
		} else {
			i_5_ = mediaIdEnabled;
			i_6_ = mediaTypeEnabled;
		}
		Class88.aBoolean835 = false;
		if (i_6_ == 0) {
			return null;
		}
		if (i_6_ == 1 && i_5_ == -1) {
			return null;
		}
		if (i_6_ == 1) {
			AbstractModel class180_sub7_7_ = (AbstractModel) LabelGroup.aClass21_2406.get(i_5_ + (i_6_ << 16));
			if (class180_sub7_7_ == null) {
				final Class180_Sub2 class180_sub2 = Class180_Sub2.method2291(Decimator.aClass50_1721, i_5_, 0);
				if (class180_sub2 == null) {
					Class88.aBoolean835 = true;
					return null;
				}
				class180_sub7_7_ = class180_sub2.method2300(64, 768, -50, -10, -50);
				LabelGroup.aClass21_2406.put(class180_sub7_7_, i_5_ + (i_6_ << 16));
			}
			if (seqType != null) {
				class180_sub7_7_ = seqType.method323(class180_sub7_7_, i_4_, i, i_3_);
			}
			return class180_sub7_7_;
		}
		if (i_6_ == 2) {
			final AbstractModel class180_sub7_8_ = NpcType.list(i_5_).method2210(i, seqType, (byte) -128, i_4_, i_3_);
			if (class180_sub7_8_ == null) {
				Class88.aBoolean835 = true;
				return null;
			}
			return class180_sub7_8_;
		}
		if (i_6_ == 3) {
			if (playerAppearance == null) {
				return null;
			}
			final AbstractModel class180_sub7_9_ = playerAppearance.method2044(seqType, i_4_, i, i_3_);
			if (class180_sub7_9_ == null) {
				Class88.aBoolean835 = true;
				return null;
			}
			return class180_sub7_9_;
		}
		if (i_6_ == 4) {
			final ObjType objType = ObjType.list(i_5_);
			final AbstractModel class180_sub7_10_ = objType.method2105(i_3_, 10, i, playerAppearance, seqType, i_4_);
			if (class180_sub7_10_ == null) {
				Class88.aBoolean835 = true;
				return null;
			}
			return class180_sub7_10_;
		}
		if (i_6_ == 6) {
			final AbstractModel class180_sub7_11_ = NpcType.list(i_5_).method2212(i_3_, 0, -95, null, seqType, i, null, 0, 0, i_4_);
			if (class180_sub7_11_ == null) {
				Class88.aBoolean835 = true;
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
			final AbstractModel class180_sub7_15_ = playerAppearance.method2041(-6, seqType, i_12_, i_13_, i_3_, i_4_, i_14_, i);
			if (class180_sub7_15_ == null) {
				Class88.aBoolean835 = true;
				return null;
			}
			return class180_sub7_15_;
		}
		return null;
	}

	final AbstractSprite method2487(final byte i, final int i_16_) {
		AbstractSprite class120_sub14_sub19;
		try {
			Class88.aBoolean835 = false;
			if (i_16_ < 0 || i_16_ >= this.spriteIDs.length) {
				return null;
			}
			if (i <= 106) {
				method2499(110, -113);
			}
			final int i_17_ = this.spriteIDs[i_16_];
			if (i_17_ == -1) {
				return null;
			}
			AbstractSprite class120_sub14_sub19_18_ = (AbstractSprite) AnimatedLocation.aClass21_3071.get(i_17_);
			if (class120_sub14_sub19_18_ != null) {
				return class120_sub14_sub19_18_;
			}
			class120_sub14_sub19_18_ = Class80.method700(i_17_, 0, (byte) 124, Class89.aClass50_836);
			if (class120_sub14_sub19_18_ == null) {
				Class88.aBoolean835 = true;
			} else {
				AnimatedLocation.aClass21_3071.put(class120_sub14_sub19_18_, i_17_);
			}
			class120_sub14_sub19 = class120_sub14_sub19_18_;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("wf.Q(").append(i).append(',').append(i_16_).append(')').toString());
		}
		return class120_sub14_sub19;
	}

	final void setCursor(final int index, final int cursor) {
		if (this.cursors == null || this.cursors.length <= index) {
			final int[] newArray = new int[1 + index];
			if (this.cursors != null) {
				for (int i_21_ = 0; i_21_ < this.cursors.length; i_21_++) {
					newArray[i_21_] = this.cursors[i_21_];
				}
				for (int i_22_ = this.cursors.length; i_22_< index; i_22_++) {
					newArray[i_22_] = -1;
				}
			}
			this.cursors = newArray;
		}
		this.cursors[index] = cursor;
	}

	final Class41 method2489(final int i) {
		Class41 class41;
		try {
			if (i != 0) {
				return null;
			}
			class41 = (this.anInt2088 ^ 0xffffffff) != 0 ? Class132_Sub1.method1934(this.anInt2002, this.anInt2094, this.anInt2088, this.anInt1966) : null;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("wf.R(").append(i).append(')').toString());
		}
		return class41;
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
		if ((this.mouseOverId ^ 0xffffffff) == -65536) {
			this.mouseOverId = -1;
		}
		final int valueCompareCount = buffer.getUByte();
		if (valueCompareCount > 0) {
			this.requiredValues = new int[valueCompareCount];
			this.valueCompareType = new int[valueCompareCount];
			for (int id = 0; id < valueCompareCount; id++) {
				this.requiredValues[id] = buffer.getUByte();
				this.valueCompareType[id] = buffer.getUShort();
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
					if (65535 == this.cs1opcodes[i_27_][i_29_]) {
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
			this.selectedActionName = buffer.getJagexString();
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

	final AbstractSprite method2492(final boolean bool) {
		Class88.aBoolean835 = false;
		int i_41_;
		if (!bool) {
			i_41_ = this.disabledSpriteId;
		} else {
			i_41_ = this.enabledSpriteId;
		}
		if (i_41_ == -1) {
			return null;
		}
		final long l = ((!this.flipHorizontal ? 0L : 1L) << 39) + ((long) this.outline << 36) + i_41_ + ((this.aBoolean2018 ? 1L : 0L) << 35) - -((this.flipVertical ? 1L : 0L) << 38) + ((long) this.shadow << 40);
		AbstractSprite class120_sub14_sub19_42_ = (AbstractSprite) AnimatedLocation.aClass21_3071.get(l);
		if (class120_sub14_sub19_42_ != null) {
			return class120_sub14_sub19_42_;
		}
		LDSprite class120_sub14_sub19_sub2;
		if (!this.aBoolean2018) {
			class120_sub14_sub19_sub2 = Class120_Sub14_Sub13.method1534(Class89.aClass50_836, i_41_, 0);
		} else {
			class120_sub14_sub19_sub2 = Class120_Sub12_Sub26.method1340(Class89.aClass50_836, i_41_, 0);
		}
		if (class120_sub14_sub19_sub2 == null) {
			Class88.aBoolean835 = true;
			return null;
		}
		if (this.flipVertical) {
			class120_sub14_sub19_sub2.method1608();
		}
		if (this.flipHorizontal) {
			class120_sub14_sub19_sub2.method1603();
		}
		if (this.outline > 0) {
			class120_sub14_sub19_sub2.method1616(this.outline);
		}
		if (this.outline >= 1) {
			class120_sub14_sub19_sub2.outline(1);
		}
		if (this.outline >= 2) {
			class120_sub14_sub19_sub2.outline(16777215);
		}
		if (this.shadow != 0) {
			class120_sub14_sub19_sub2.shadow(this.shadow);
		}
		if (HDToolkit.glEnabled) {
			if (!(class120_sub14_sub19_sub2 instanceof LDTransparentSprite)) {
				class120_sub14_sub19_42_ = new HDSprite(class120_sub14_sub19_sub2);
			} else {
				class120_sub14_sub19_42_ = new HDTransparentSprite(class120_sub14_sub19_sub2);
			}
		} else {
			class120_sub14_sub19_42_ = class120_sub14_sub19_sub2;
		}
		AnimatedLocation.aClass21_3071.put(class120_sub14_sub19_42_, l);
		return class120_sub14_sub19_42_;
	}

	private final int[] method2493(final Buffer class120_sub7) {
		final int i_43_ = class120_sub7.getUByte();
		if (i_43_ == 0) {
			return null;
		}
		final int[] is_44_ = new int[i_43_];
		for (int i_45_ = 0; i_45_ < i_43_; i_45_++) {
			is_44_[i_45_] = class120_sub7.getInt();
		}
		return is_44_;
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
			this.aBoolean2018 = (i_48_ & 0x2) != 0;
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
			this.thickness = buffer.getUByte();
			this.disabledColor = buffer.getInt();
			this.aBoolean1989 = buffer.getUByte() == 1;
		}
		final int clickMask = buffer.getMedium();
		int i_50_ = buffer.getUByte();
		if (i_50_ != 0) {
			this.aByteArray2048 = new byte[10];
			this.anIntArray1985 = new int[10];
			this.aByteArray1955 = new byte[10];
			for (/**/; i_50_ != 0; i_50_ = buffer.getUByte()) {
				final int i_51_ = -1 + (i_50_ >> 4);
				i_50_ = buffer.getUByte() | i_50_ << 8;
				i_50_ &= 0xfff;
				if (i_50_ != 4095) {
					this.anIntArray1985[i_51_] = i_50_;
				} else {
					this.anIntArray1985[i_51_] = -1;
				}
				this.aByteArray2048[i_51_] = buffer.getByte();
				this.aByteArray1955[i_51_] = buffer.getByte();
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
		this.selectedActionName = buffer.getJagexString();
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
		this.onloadListener = method2503(buffer);
		this.mouseFocusListener = method2503(buffer);
		this.mouseUnfocusListener = method2503(buffer);
		this.onSpellDeselectionListener = method2503(buffer);
		this.onSpellSelectionListener = method2503(buffer);
		this.anObjectArray2050 = method2503(buffer);
		this.anObjectArray1929 = method2503(buffer);
		this.skillUpdateListener = method2503(buffer);
		this.anObjectArray1998 = method2503(buffer);
		this.anObjectArray2006 = method2503(buffer);
		this.anObjectArray1953 = method2503(buffer);
		this.mouseClickFocusListener = method2503(buffer);
		this.anObjectArray1993 = method2503(buffer);
		this.mouseClickUnfocusListener = method2503(buffer);
		this.mouseDraggedListener = method2503(buffer);
		this.anObjectArray1959 = method2503(buffer);
		this.anObjectArray1947 = method2503(buffer);
		this.mouseWheelListener = method2503(buffer);
		this.anObjectArray2062 = method2503(buffer);
		this.anObjectArray2032 = method2503(buffer);
		this.varpListenerTriggers = method2493(buffer);
		this.inventoryListenerTriggers = method2493(buffer);
		this.skillListernerTriggers = method2493(buffer);
		this.integerScriptsValuesTriggers = method2493(buffer);
		this.stringScriptValuesTriggers = method2493(buffer);
	}

	final void method2496(final int i, final byte i_60_, final int i_61_) {
		try {
			int i_62_ = this.objIds[i];
			this.objIds[i] = this.objIds[i_61_];
			this.objIds[i_61_] = i_62_;
			if (i_60_ <= 53) {
				method2501();
			}
			i_62_ = this.objAmounts[i];
			this.objAmounts[i] = this.objAmounts[i_61_];
			this.objAmounts[i_61_] = i_62_;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("wf.D(").append(i).append(',').append(i_60_).append(',').append(i_61_).append(')').toString());
		}
	}

	final AbstractFont method2497(final byte i, final AbstractIndexedSprite[] class107s) {
		AbstractFont class120_sub14_sub8;
		try {
			Class88.aBoolean835 = false;
			if ((this.font ^ 0xffffffff) == 0) {
				return null;
			}
			if (i != 54) {
				return null;
			}
			AbstractFont class120_sub14_sub8_63_ = (AbstractFont) Class120_Sub12_Sub2.aClass21_3143.get(this.font);
			if (class120_sub14_sub8_63_ != null) {
				return class120_sub14_sub8_63_;
			}
			class120_sub14_sub8_63_ = Class9.constructAbstractFont(Class89.aClass50_836, Class120_Sub12_Sub11.aClass50_3213, this.font, 0);
			if (class120_sub14_sub8_63_ == null) {
				Class88.aBoolean835 = true;
			} else {
				class120_sub14_sub8_63_.setNameIcons(class107s, null);
				Class120_Sub12_Sub2.aClass21_3143.put(class120_sub14_sub8_63_, this.font);
			}
			class120_sub14_sub8 = class120_sub14_sub8_63_;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("wf.M(").append(i).append(',').append(class107s != null ? "{...}" : "null").append(')').toString());
		}
		return class120_sub14_sub8;
	}

	public static void method2498(final int i) {
		try {
			playerMenuActionCodes = null;
			if (i > -54) {
				playerMenuActionCodes = null;
			}
			gameShellThread = null;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("wf.H(").append(i).append(')').toString());
		}
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

	final boolean method2501() {
		if (this.anIntArray2079 != null) {
			return true;
		}
		final LDIndexedSprite class107_sub1 = Class164.constructLDIndexedSprite(Class89.aClass50_836, 0, this.disabledSpriteId);
		if (class107_sub1 == null) {
			return false;
		}
		class107_sub1.method923();
		this.anIntArray1949 = new int[class107_sub1.height];
		this.anIntArray2079 = new int[class107_sub1.height];
		for (int i_82_ = 0; i_82_ < class107_sub1.height; i_82_++) {
			int i_83_ = 0;
			for (int i_84_ = 0; i_84_ < class107_sub1.width; i_84_++) {
				if (class107_sub1.paletteIndicators[i_84_ + i_82_ * class107_sub1.width] != 0) {
					i_83_ = i_84_;
					break;
				}
			}
			int i_85_ = class107_sub1.width;
			for (int i_86_ = i_83_; class107_sub1.width > i_86_; i_86_++) {
				if (class107_sub1.paletteIndicators[class107_sub1.width * i_82_ + i_86_] == 0) {
					i_85_ = i_86_;
					break;
				}
			}
			this.anIntArray2079[i_82_] = i_83_;
			this.anIntArray1949[i_82_] = i_85_ + -i_83_;
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

	private final Object[] method2503(final Buffer class120_sub7) {
		final int i_89_ = class120_sub7.getUByte();
		if (i_89_ == 0) {
			return null;
		}
		final Object[] objects_90_ = new Object[i_89_];
		for (int i_91_ = 0; i_89_ > i_91_; i_91_++) {
			final int i_92_ = class120_sub7.getUByte();
			if (i_92_ != 0) {
				if (i_92_ == 1) {
					objects_90_[i_91_] = class120_sub7.getJagexString();
				}
			} else {
				objects_90_[i_91_] = new Integer(class120_sub7.getInt());
			}
		}
		this.aBoolean1940 = true;
		return objects_90_;
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
		this.aBoolean1971 = false;
		this.aBoolean1939 = false;
		this.aBoolean1940 = false;
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
		this.aBoolean2018 = false;
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
		this.thickness = 1;
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
		this.anInt2030 = -1;
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
		this.anInt2075 = 0;
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
		this.selectedActionName = "";
		this.nextFrame = 1;
		this.anInt2085 = 1;
	}
}
