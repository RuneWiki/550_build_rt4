/* Class130 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class CursorType {
	int hotSpotY;
	static int anInt1237 = 0;
	private int graphic;
	int hotSpotX;
	static js5 aClass50_794;
	static js5 aClass50_2413;
	static ObjectCache graphicCache = new ObjectCache(2);
	static ObjectCache recentUse = new ObjectCache(64);
	static int ambientSoundsVolume;
	static JagexInterface mouseOverInterface;

	static {
		ambientSoundsVolume = 127;
	}

	static final void method1914(final int i_0_) {
		final InterfaceChangeNode class120_sub14_sub7 = InterfaceChangeNode.putInterfaceChange(1, i_0_);
		class120_sub14_sub7.method1453();
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
		if (Projectile.clickedInventoryComponent == null && Class120_Sub12_Sub4.draggedComponent == null && EnumType.anInt3450 <= 0) {
			int mouseClickType = Class156.lastMouseClick;
			if (!Class15.menuOpen) {
				if (mouseClickType == 1 && WallDecoration.menuOptionCount > 0) {
					final short code = Class120_Sub29.menuOptionsCode[WallDecoration.menuOptionCount - 1];
					if (code == 30 || code == 20 || code == 13 || code == 2 || code == 49 || code == 58 || code == 35 || code == 17 || code == 10 || code == 51 || code == 9 || code == 1001) {
						final int bitPacked = Class120_Sub29.menuOptionsData3[WallDecoration.menuOptionCount - 1];
						final int index = Class120_Sub12_Sub7.menuOptionsData2[WallDecoration.menuOptionCount - 1];
						final JagexInterface jagexInterface = Class74.getJagexInterface(bitPacked);
						final InterfaceClickMask clickMask = client.getClickMask(jagexInterface);
						if (clickMask.method1681() || clickMask.method1691()) {
							JavaObject.clickedInventoryComponentCycle = 0;
							Huffman.draggingClickedInventoryObject = false;
							if (Projectile.clickedInventoryComponent != null) {
								InterfaceClickMask.redrawInterface(Projectile.clickedInventoryComponent);
							}
							Projectile.clickedInventoryComponent = Class74.getJagexInterface(bitPacked);
							client.clickedInventoryComponentX = js5.lastClickX;
							Class5.clickedInventoryIndex = index;
							VarBit.clickedInventoryComponentY = Class120_Sub12_Sub36.lastClickY;
							InterfaceClickMask.redrawInterface(Projectile.clickedInventoryComponent);
							return;
						}
					}
				}
				if (mouseClickType == 1 && (Class69.mouseButtons == 1 && WallDecoration.menuOptionCount > 2 || SpotAnimationNode.method1438(WallDecoration.menuOptionCount - 1))) {
					mouseClickType = 2;
				}
				if (mouseClickType == 2 && WallDecoration.menuOptionCount > 0 || FileSystem.anInt455 == 1) {
					Class120_Sub12_Sub28.openMenu();
				}
				if (mouseClickType == 1 && WallDecoration.menuOptionCount > 0 || FileSystem.anInt455 == 2) {
					ChunkAtmosphere.method2508();
				}
			} else {
				if (mouseClickType != 1) {//Move mouse of menu
					final int mouseX = Queue.lastMouseX;
					final int mouseY = ChunkAtmosphere.lastMouseY;
					if (mouseX < Huffman.menuDrawX - 10 || mouseX > 10 + Class120_Sub24.menuWidth + Huffman.menuDrawX || mouseY < Class120_Sub16.menuDrawY - 10 || mouseY > 10 + QuickChatMessageType.menuHeight + Class120_Sub16.menuDrawY) {
						Class15.menuOpen = false;
						Class120_Sub12_Sub1.redrawScreen(Huffman.menuDrawX, Class120_Sub16.menuDrawY, Class120_Sub24.menuWidth, QuickChatMessageType.menuHeight);
					}
				}
				if (mouseClickType == 1) {//Click option
					final int menuX = Huffman.menuDrawX;
					final int menuY = Class120_Sub16.menuDrawY;
					final int clickX = js5.lastClickX;
					final int clickY = Class120_Sub12_Sub36.lastClickY;
					final int menuWidth = Class120_Sub24.menuWidth;
					int optionIndex = -1;
					for (int id = 0; id < WallDecoration.menuOptionCount; id++) {
						if (!WallDecoration.usingSpriteMenu) {
							final int height = (WallDecoration.menuOptionCount - id - 1) * 15 + menuY + 31;
							if (clickX > menuX && clickX < menuWidth + menuX && clickY > height - 13 && clickY < height + 3) {
								optionIndex = id;
							}
						} else {
							final int height = (WallDecoration.menuOptionCount - id - 1) * 15 + menuY + 33;
							if (clickX > menuX && clickX < menuWidth + menuX && clickY > height - 13 && clickY < height + 3) {
								optionIndex = id;
							}
						}
					}
					if (optionIndex != -1) {
						GameShell.method31(optionIndex);
					}
					Class15.menuOpen = false;
					Class120_Sub12_Sub1.redrawScreen(Huffman.menuDrawX, Class120_Sub16.menuDrawY, Class120_Sub24.menuWidth, QuickChatMessageType.menuHeight);
				}
			}
		}
	}

	public CursorType() {
		/* empty */
	}

	final LDSprite getCursorSprite() {
		LDSprite ldSprite = (LDSprite) graphicCache.get(graphic);
		if (ldSprite != null) {
			return ldSprite;
		}
		ldSprite = Class120_Sub12_Sub26.constructLDSpriteAlpha(aClass50_794, graphic, 0);
		if (ldSprite != null) {
			graphicCache.put(ldSprite, graphic);
		}
		return ldSprite;
	}

	static final void setup(final js5 js5, final js5 class50_1_) {
		aClass50_794 = class50_1_;
		aClass50_2413 = js5;
	}

	static final CursorType list(final int id) {
		CursorType cursorType = (CursorType) recentUse.get(id);
		if (cursorType != null) {
			return cursorType;
		}
		final byte[] data = aClass50_2413.getFile(33, id);
		cursorType = new CursorType();
		if (data != null) {
			cursorType.decode(new Buffer(data));
		}
		recentUse.put(cursorType, id);
		return cursorType;
	}
}
