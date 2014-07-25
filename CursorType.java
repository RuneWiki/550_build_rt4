/* Class130 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class CursorType {
	int hotSpotY;
	static int anInt1237 = 0;
	static String aString1238;
	static String aString1239 = "Loaded title screen";
	private int graphic;
	int hotSpotX;
	static ObjectCache spriteCache = new ObjectCache(2);
	static ObjectCache recentUse = new ObjectCache(64);
	static int anInt1242;
	static JagexInterface aClass189_1243;

	static {
		aString1238 = "K";
		anInt1242 = 127;
	}

	static final void method1914(final int i_0_) {
		final InterfaceChangeNode class120_sub14_sub7 = AbstractObject.putInterfaceChange(1, i_0_);
		class120_sub14_sub7.method1453();
	}

	public static void method1915() {
		aString1238 = null;
		aClass189_1243 = null;
		aString1239 = null;
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

	private final void decode(final Buffer buffer, final int code) {
		if (code == 1) {
			graphic = buffer.getUShort();
		} else if (code == 2) {
			this.hotSpotX = buffer.getUByte();
			this.hotSpotY = buffer.getUByte();
		}
	}

	static final void method1918() {
		if (Projectile.aClass189_2954 == null && Class120_Sub12_Sub4.aClass189_3156 == null && EnumType.anInt3450 <= 0) {
			int i_5_ = Class156.lastMouseClick;
			if (!Class15.menuOpen) {
				if (i_5_ == 1 && Class186.menuOptionCount > 0) {
					final short i_6_ = Class120_Sub29.aShortArray2777[Class186.menuOptionCount - 1];
					if (i_6_ == 30 || i_6_ == 20 || i_6_ == 13 || i_6_ == 2 || i_6_ == 49 || i_6_ == 58 || i_6_ == 35 || i_6_ == 17 || i_6_ == 10 || i_6_ == 51 || i_6_ == 9 || i_6_ == 1001) {
						final int i_7_ = Class120_Sub29.anIntArray2769[Class186.menuOptionCount - 1];
						final int i_8_ = Class120_Sub12_Sub7.anIntArray3182[Class186.menuOptionCount - 1];
						final JagexInterface jagexInterface = Class74.getJagexInterface(i_7_);
						final InterfaceClickMask class120_sub20 = client.getClickMask(jagexInterface);
						if (class120_sub20.method1681() || class120_sub20.method1691()) {
							JavaObject.anInt3915 = 0;
							Huffman.aBoolean1207 = false;
							if (Projectile.aClass189_2954 != null) {
								InterfaceClickMask.redrawInterface(Projectile.aClass189_2954);
							}
							Projectile.aClass189_2954 = Class74.getJagexInterface(i_7_);
							Class23.anInt134 = js5.lastClickX;
							Class5.anInt2154 = i_8_;
							VarBit.anInt166 = Class120_Sub12_Sub36.lastClickY;
							InterfaceClickMask.redrawInterface(Projectile.aClass189_2954);
							return;
						}
					}
				}
				if (i_5_ == 1 && (Class69.mouseButtons == 1 && Class186.menuOptionCount > 2 || Class120_Sub14_Sub4.method1438(Class186.menuOptionCount + -1))) {
					i_5_ = 2;
				}
				if (i_5_ == 2 && Class186.menuOptionCount > 0 || FileSystem.anInt455 == 1) {
					Class120_Sub12_Sub28.determineMenuSize();
				}
				if (i_5_ == 1 && Class186.menuOptionCount > 0 || FileSystem.anInt455 == 2) {
					Class191.method2508();
				}
			} else {
				if (i_5_ != 1) {
					final int i_9_ = Queue.lastMouseX;
					final int i_10_ = Class191.lastMouseY;
					if (i_9_ < -10 + Huffman.menuDrawX || i_9_ > 10 + Class120_Sub24.menuWidth + Huffman.menuDrawX || i_10_ < -10 + Class120_Sub16.menuDrawY || 10 + Class120_Sub14_Sub10.menuHeight + Class120_Sub16.menuDrawY < i_10_) {
						Class15.menuOpen = false;
						Class120_Sub12_Sub1.redrawScreen(Huffman.menuDrawX, Class120_Sub16.menuDrawY, Class120_Sub24.menuWidth, Class120_Sub14_Sub10.menuHeight);
					}
				}
				if (i_5_ == 1) {
					final int i_11_ = Huffman.menuDrawX;
					final int i_12_ = Class120_Sub16.menuDrawY;
					final int i_13_ = js5.lastClickX;
					final int i_14_ = Class120_Sub12_Sub36.lastClickY;
					final int i_15_ = Class120_Sub24.menuWidth;
					int i_16_ = -1;
					for (int i_17_ = 0; Class186.menuOptionCount > i_17_; i_17_++) {
						if (!Class186.usingSpriteMenu) {
							final int i_18_ = (Class186.menuOptionCount + -1 + -i_17_) * 15 + i_12_ - -31;
							if (i_11_ < i_13_ && i_15_ + i_11_ > i_13_ && i_18_ - 13 < i_14_ && 3 + i_18_ > i_14_) {
								i_16_ = i_17_;
							}
						} else {
							final int i_19_ = 15 * (-i_17_ + Class186.menuOptionCount + -1) + 33 + i_12_;
							if (i_11_ < i_13_ && i_15_ + i_11_ > i_13_ && i_19_ + -13 < i_14_ && i_19_ + 3 > i_14_) {
								i_16_ = i_17_;
							}
						}
					}
					if (i_16_ != -1) {
						GameShell.method31(i_16_);
					}
					Class15.menuOpen = false;
					Class120_Sub12_Sub1.redrawScreen(Huffman.menuDrawX, Class120_Sub16.menuDrawY, Class120_Sub24.menuWidth, Class120_Sub14_Sub10.menuHeight);
				}
			}
		}
	}

	public CursorType() {
		/* empty */
	}

	final LDSprite getCursor() {
		LDSprite ldSprite = (LDSprite) spriteCache.get(graphic);
		if (ldSprite != null) {
			return ldSprite;
		}
		ldSprite = Class120_Sub12_Sub26.method1340(FileSystemWorker.aClass50_794, graphic, 0);
		if (ldSprite != null) {
			spriteCache.put(ldSprite, graphic);
		}
		return ldSprite;
	}

	static final CursorType list(final int id) {
		CursorType cursorType = (CursorType) recentUse.get(id);
		if (cursorType != null) {
			return cursorType;
		}
		final byte[] data = LabelGroup.aClass50_2413.getFile(33, id);
		cursorType = new CursorType();
		if (data != null) {
			cursorType.decode(new Buffer(data));
		}
		recentUse.put(cursorType, id);
		return cursorType;
	}
}
