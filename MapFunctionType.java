/* Class73 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class MapFunctionType {
	private int anInt628;
	boolean aBoolean629 = true;
	int anInt630;
	private int anInt631;
	static float aFloat632;
	boolean aBoolean633;
	int fontType;
	private int anInt636 = -1;
	static int anInt637;
	int[] anIntArray638;
	static int anInt639 = 0;
	int fillRectARGB;
	private int anInt641;
	boolean randomizePosition;
	private int anInt643;
	int unfocusedSpriteId;
	String actionSufix;
	String[] actionPrefixes;
	private int worldMapSpriteId;
	int rectARGB;
	String headerText;
	private int varBitId;
	int anInt651;
	int anInt652;
	static Deque aClass105_653;
	private int anInt654;
	int unfocusedFontColor;
	int focusedFontColor;
	int focusedSpriteId;
	int myId;
	boolean aBoolean659;
	private int varpId;
	static ObjectCache spriteCache = new ObjectCache(64);
	static ObjectCache recentUse = new ObjectCache(128);
	static int[] mapFunctionXs;
	static int fps;
	static SeekableFile aClass193_663;
	static int[] anIntArray664;
	static int mapdotsId;

	static {
		fps = 0;
		mapFunctionXs = new int[1000];
		anIntArray664 = new int[14];
	}

	static final void method642(final int[] is, final long[] ls) {
		CollisionMap.method218(ls.length - 1, ls, 0, is);
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

	static final String amountToString(final int amount) {
		if (amount < 999999999) {
			return Integer.toString(amount);
		}
		return "*";
	}

	final LDIndexedSprite constructSpriteForWorldMap() {
		LDIndexedSprite class107_sub1_2_ = (LDIndexedSprite) spriteCache.get(worldMapSpriteId | 0x20000);
		if (class107_sub1_2_ != null) {
			return class107_sub1_2_;
		}
		Class88.aClass50_834.method429(worldMapSpriteId);
		class107_sub1_2_ = Class164.constructLDIndexedSprite(Class88.aClass50_834, worldMapSpriteId, 0);
		if (class107_sub1_2_ != null) {
			class107_sub1_2_.trimWidth = class107_sub1_2_.width;
			class107_sub1_2_.xOffset = 0;
			class107_sub1_2_.trimHeight = class107_sub1_2_.height;
			class107_sub1_2_.yOffset = 0;
			spriteCache.put(class107_sub1_2_, 0x20000 | worldMapSpriteId);
		}
		return class107_sub1_2_;
	}

	private final void decode(final Buffer buffer, final int code) {
		if (code == 1) {
			this.unfocusedSpriteId = buffer.getUShort();
		} else if (code == 2) {
			this.focusedSpriteId = buffer.getUShort();
		} else if (code == 3) {
			this.headerText = buffer.getJagexString();
		} else if (code == 4) {
			this.unfocusedFontColor = buffer.getMedium();
		} else if (code == 5) {
			this.focusedFontColor = buffer.getMedium();
		} else if (code == 6) {
			this.fontType = buffer.getUByte();
		} else if (code == 7) {
			final int i_6_ = buffer.getUByte();
			if ((i_6_ & 0x1) == 0) {
				this.aBoolean629 = false;
			}
			if ((i_6_ & 0x2) == 2) {
				this.aBoolean633 = true;
			}
		} else if (code == 8) {
			this.randomizePosition = buffer.getUByte() == 1;
		} else if (code == 9) {
			varBitId = buffer.getUShort();
			if (varBitId == 65535) {
				varBitId = -1;
			}
			varpId = buffer.getUShort();
			if (varpId == 65535) {
				varpId = -1;
			}
			anInt643 = buffer.getInt();
			anInt641 = buffer.getInt();
		} else if (code >= 10 && code <= 14) {
			this.actionPrefixes[code - 10] = buffer.getJagexString();
		} else if (code == 15) {
			final int i_4_ = buffer.getUByte();
			this.anIntArray638 = new int[i_4_ * 2];
			for (int i_5_ = 0; 2 * i_4_ > i_5_; i_5_++) {
				this.anIntArray638[i_5_] = buffer.getShort();
			}
			this.anInt630 = buffer.getInt();
			this.anInt651 = buffer.getInt();
		} else if (code == 16) {
			this.aBoolean659 = false;
		} else if (code == 17) {
			this.actionSufix = buffer.getJagexString();
		} else if (code == 18) {
			worldMapSpriteId = buffer.getUShort();
		} else if (code == 19) {
			this.anInt652 = buffer.getUShort();
		} else if (code == 20) {
			anInt631 = buffer.getUShort();
			if (anInt631 == 65535) {
				anInt631 = -1;
			}
			anInt636 = buffer.getUShort();
			if (anInt636 == 65535) {
				anInt636 = -1;
			}
			anInt654 = buffer.getInt();
			anInt628 = buffer.getInt();
		} else if (code == 21) {
			this.rectARGB = buffer.getInt();
		} else if (code == 22) {
			this.fillRectARGB = buffer.getInt();
		}
	}

	final boolean method647() {
		if (varpId == -1 && varBitId == -1) {
			return true;
		}
		int value;
		if (varpId == -1) {
			value = VarBit.getVarbitValue(varBitId);
		} else {
			value = Class2.permanentVariable[varpId];
		}
		if (anInt643 <= value && anInt641 >= value) {
			if (anInt636 != -1 || anInt631 != -1) {
				if (anInt636 != -1) {
					value = Class2.permanentVariable[anInt636];
				} else {
					value = VarBit.getVarbitValue(anInt631);
				}
				if (value >= anInt654 && anInt628 >= value) {
					return true;
				}
				return false;
			}
			return true;
		}
		return false;
	}

	final AbstractIndexedSprite consturctSprite(final boolean focused, final boolean useLDSprite) {
		final int spriteId = focused ? this.focusedSpriteId : this.unfocusedSpriteId;
		AbstractIndexedSprite cachedSprite = (AbstractIndexedSprite) spriteCache.get(spriteId | (focused ? 65536 : 0));
		if (cachedSprite != null) {
			return cachedSprite;
		}
		if (!Class88.aClass50_834.method429(spriteId)) {
			return null;
		}
		final LDIndexedSprite ldIndexedSprite = Class164.constructLDIndexedSprite(Class88.aClass50_834, spriteId, 0);
		if (!HDToolkit.glEnabled || useLDSprite) {
			cachedSprite = ldIndexedSprite;
		} else {
			cachedSprite = new HDIndexedSprite(ldIndexedSprite);
		}
		if (cachedSprite != null) {
			cachedSprite.trimHeight = cachedSprite.height;
			cachedSprite.yOffset = 0;
			cachedSprite.trimWidth = cachedSprite.width;
			cachedSprite.xOffset = 0;
			spriteCache.put(cachedSprite, (focused ? 65536 : 0) | spriteId);
		}
		return cachedSprite;
	}

	static final MapFunctionType list(int id) {
		MapFunctionType mapFunctionType = (MapFunctionType) recentUse.get(id);
		if (mapFunctionType != null) {
			return mapFunctionType;
		}
		final byte[] data = Class31.aClass50_241.getFile(36, id);
		mapFunctionType = new MapFunctionType();
		mapFunctionType.myId = id;
		if (data != null) {
			mapFunctionType.decode(new Buffer(data));
		}
		recentUse.put(mapFunctionType, id);
		return mapFunctionType;
	}

	public static void method649() {
		aClass193_663 = null;
		anIntArray664 = null;
		mapFunctionXs = null;
		aClass105_653 = null;
	}

	public MapFunctionType() {
		this.fontType = 0;
		this.aBoolean633 = false;
		this.unfocusedSpriteId = -1;
		this.randomizePosition = true;
		this.actionPrefixes = new String[5];
		this.anInt652 = -1;
		varBitId = -1;
		this.aBoolean659 = true;
		anInt631 = -1;
		varpId = -1;
		worldMapSpriteId = -1;
		this.focusedFontColor = -1;
		this.focusedSpriteId = -1;
	}
}
