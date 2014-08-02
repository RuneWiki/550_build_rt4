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
	int anInt640;
	private int anInt641;
	boolean randomizePosition;
	private int anInt643;
	int anInt644;
	String aString645;
	String[] aStringArray646;
	private int spriteId;
	int anInt648;
	String aString649;
	private int varBitId;
	int anInt651;
	int anInt652;
	static Deque aClass105_653;
	private int anInt654;
	int anInt655;
	int anInt656;
	int anInt657;
	int myId;
	boolean aBoolean659;
	private int varpId;
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

	final LDIndexedSprite constructSprite() {
		LDIndexedSprite class107_sub1_2_ = (LDIndexedSprite) Class82.aClass21_786.get(spriteId | 0x20000);
		if (class107_sub1_2_ != null) {
			return class107_sub1_2_;
		}
		Class88.aClass50_834.method429(spriteId);
		class107_sub1_2_ = Class164.constructLDIndexedSprite(Class88.aClass50_834, 0, spriteId);
		if (class107_sub1_2_ != null) {
			class107_sub1_2_.trimWidth = class107_sub1_2_.width;
			class107_sub1_2_.xOffset = 0;
			class107_sub1_2_.trimHeight = class107_sub1_2_.height;
			class107_sub1_2_.yOffset = 0;
			Class82.aClass21_786.put(class107_sub1_2_, 0x20000 | spriteId);
		}
		return class107_sub1_2_;
	}

	private final void decode(final Buffer buffer, final int code) {
		if (code == 1) {
			this.anInt644 = buffer.getUShort();
		} else if (code == 2) {
			this.anInt657 = buffer.getUShort();
		} else if (code == 3) {
			this.aString649 = buffer.getJagexString();
		} else if (code == 4) {
			this.anInt655 = buffer.getMedium();
		} else if (code == 5) {
			this.anInt656 = buffer.getMedium();
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
			this.aStringArray646[code - 10] = buffer.getJagexString();
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
			this.aString645 = buffer.getJagexString();
		} else if (code == 18) {
			spriteId = buffer.getUShort();
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
			this.anInt648 = buffer.getInt();
		} else if (code == 22) {
			this.anInt640 = buffer.getInt();
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

	final AbstractIndexedSprite method648(final boolean bool, final boolean bool_9_) {
		final int i = bool ? this.anInt657 : this.anInt644;
		AbstractIndexedSprite class107_10_ = (AbstractIndexedSprite) Class82.aClass21_786.get(i | (bool ? 65536 : 0));
		if (class107_10_ != null) {
			return class107_10_;
		}
		if (!Class88.aClass50_834.method429(i)) {
			return null;
		}
		final LDIndexedSprite class107_sub1 = Class164.constructLDIndexedSprite(Class88.aClass50_834, 0, i);
		if (!HDToolkit.glEnabled || bool_9_) {
			class107_10_ = class107_sub1;
		} else {
			class107_10_ = new HDIndexedSprite(class107_sub1);
		}
		if (class107_10_ != null) {
			class107_10_.trimHeight = class107_10_.height;
			class107_10_.yOffset = 0;
			class107_10_.trimWidth = class107_10_.width;
			class107_10_.xOffset = 0;
			Class82.aClass21_786.put(class107_10_, (bool ? 65536 : 0) | i);
		}
		return class107_10_;
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
		this.anInt644 = -1;
		this.randomizePosition = true;
		this.aStringArray646 = new String[5];
		this.anInt652 = -1;
		varBitId = -1;
		this.aBoolean659 = true;
		anInt631 = -1;
		varpId = -1;
		spriteId = -1;
		this.anInt656 = -1;
		this.anInt657 = -1;
	}
}
