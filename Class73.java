/* Class73 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class73 {
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
	private int anInt650;
	int anInt651;
	int anInt652;
	static Deque aClass105_653;
	private int anInt654;
	int anInt655;
	int anInt656;
	int anInt657;
	int id;
	boolean aBoolean659;
	private int anInt660;
	static ObjectCache recentUse = new ObjectCache(128);
	static int[] anIntArray661;
	static int fps;
	static SeekableFile aClass193_663;
	static int[] anIntArray664;
	static int mapdotsId;

	static {
		fps = 0;
		anIntArray661 = new int[1000];
		anIntArray664 = new int[14];
	}

	static final void method642(final byte i, final int[] is, final long[] ls) {
		try {
			if (i != -46) {
				method649((byte) 90);
			}
			CollisionMap.method218(-1 + ls.length, ls, 0, is);
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("ho.E(").append(i).append(',').append(is != null ? "{...}" : "null").append(',').append(ls != null ? "{...}" : "null").append(')').toString());
		}
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

	static final String method644(final int amount) {
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
			this.aString649 = buffer.getJString();
		} else if (code != 4) {
			if (code == 5) {
				this.anInt656 = buffer.getMedium();
			} else if (code == 6) {
				this.fontType = buffer.getUByte();
			} else if (code != 7) {
				if (code == 8) {
					this.randomizePosition = buffer.getUByte() == 1;
				} else if (code == 9) {
					anInt650 = buffer.getUShort();
					if (anInt650 == 65535) {
						anInt650 = -1;
					}
					anInt660 = buffer.getUShort();
					if (anInt660 == 65535) {
						anInt660 = -1;
					}
					anInt643 = buffer.getInt();
					anInt641 = buffer.getInt();
				} else if (code >= 10 && code <= 14) {
					this.aStringArray646[code + -10] = buffer.getJString();
				} else if (code != 15) {
					if (code != 16) {
						if (code != 17) {
							if (code == 18) {
								spriteId = buffer.getUShort();
							} else if (code != 19) {
								if (code == 20) {
									anInt631 = buffer.getUShort();
									if ((anInt631 ^ 0xffffffff) == -65536) {
										anInt631 = -1;
									}
									anInt636 = buffer.getUShort();
									if (65535 == anInt636) {
										anInt636 = -1;
									}
									anInt654 = buffer.getInt();
									anInt628 = buffer.getInt();
								} else if (code == 21) {
									this.anInt648 = buffer.getInt();
								} else if (code == 22) {
									this.anInt640 = buffer.getInt();
								}
							} else {
								this.anInt652 = buffer.getUShort();
							}
						} else {
							this.aString645 = buffer.getJString();
						}
					} else {
						this.aBoolean659 = false;
					}
				} else {
					final int i_4_ = buffer.getUByte();
					this.anIntArray638 = new int[i_4_ * 2];
					for (int i_5_ = 0; 2 * i_4_ > i_5_; i_5_++) {
						this.anIntArray638[i_5_] = buffer.getShort();
					}
					this.anInt630 = buffer.getInt();
					this.anInt651 = buffer.getInt();
				}
			} else {
				final int i_6_ = buffer.getUByte();
				if ((i_6_ & 0x2) == 2) {
					this.aBoolean633 = true;
				}
				if ((i_6_ & 0x1) == 0) {
					this.aBoolean629 = false;
				}
			}
		} else {
			this.anInt655 = buffer.getMedium();
		}
	}

	final boolean method647() {
		if ((anInt660 ^ 0xffffffff) == 0 && (anInt650 ^ 0xffffffff) == 0) {
			return true;
		}
		int i_7_;
		if (anInt660 == -1) {
			i_7_ = Class173.method2226((byte) -98, anInt650);
		} else {
			i_7_ = Class2.permanentVariable[anInt660];
		}
		if (anInt643 <= i_7_ && anInt641 >= i_7_) {
			if (anInt636 != -1 || (anInt631 ^ 0xffffffff) != 0) {
				if ((anInt636 ^ 0xffffffff) != 0) {
					i_7_ = Class2.permanentVariable[anInt636];
				} else {
					i_7_ = Class173.method2226((byte) -104, anInt631);
				}
				if (i_7_ >= anInt654 && anInt628 >= i_7_) {
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

	static final Class73 list(int i) {
		Class73 class73_34_ = (Class73) recentUse.get(i);
		if (class73_34_ != null) {
			return class73_34_;
		}
		final byte[] is = Class31.aClass50_241.getFile(36, i);
		class73_34_ = new Class73();
		class73_34_.id = i;
		if (is != null) {
			class73_34_.decode(new Buffer(is));
		}
		recentUse.put(class73_34_, i);
		return class73_34_;
	}

	public static void method649(final byte i) {
		try {
			aClass193_663 = null;
			anIntArray664 = null;
			anIntArray661 = null;
			if (i != -41) {
				method644(-111);
			}
			aClass105_653 = null;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("ho.H(").append(i).append(')').toString());
		}
	}

	public Class73() {
		this.fontType = 0;
		this.aBoolean633 = false;
		this.anInt644 = -1;
		this.randomizePosition = true;
		this.aStringArray646 = new String[5];
		this.anInt652 = -1;
		anInt650 = -1;
		this.aBoolean659 = true;
		anInt631 = -1;
		anInt660 = -1;
		spriteId = -1;
		this.anInt656 = -1;
		this.anInt657 = -1;
	}
}
