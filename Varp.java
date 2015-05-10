/* Class70 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Varp {
	static short[] aShortArray620 = { -4160, -4163, -8256, -8259, 22461 };
	int setting = 0;
	static js5 aClass50_1517;
	static ObjectCache recentUse = new ObjectCache(64);
	static float aFloat622;
	static int anInt623 = 2301979;

	static final void handleScrollbar(final JagexInterface jagexInterface, final int posX, final int posY, final int mouseX, final int mouseY, final int maxScrollVertical, final int height) {
		if (Class136.scrollBarClicked) {
			DisplayModeInfo.scrollBarOffsetX = 32;
		} else {
			DisplayModeInfo.scrollBarOffsetX = 0;
		}
		Class136.scrollBarClicked = false;
		if (InterfaceChangeNode.lastMousePress != 0) {
			if (mouseX >= posX && mouseX < posX + 16 && mouseY >= posY && mouseY < posY + 16) {//Scroll up
				jagexInterface.horizontalScrollPosition -= 4;
				InterfaceClickMask.redrawInterface(jagexInterface);
			} else if (mouseX >= posX && mouseX < posX + 16 && mouseY >= posY + height - 16 && mouseY < posY + height) {
				jagexInterface.horizontalScrollPosition += 4;
				InterfaceClickMask.redrawInterface(jagexInterface);
			} else if (mouseX >= posX - DisplayModeInfo.scrollBarOffsetX && mouseX < posX + 16 + DisplayModeInfo.scrollBarOffsetX && mouseY >= posY + 16 && mouseY < posY + height - 16) {
				////Substract 32 because of two buttons.
				int scrollOffset = (height - 32) * height / maxScrollVertical;
				if (scrollOffset < 8) {
					scrollOffset = 8;
				}
				final int scrollPos = mouseY - posY - 16 - scrollOffset / 2;
				final int maxScroll = height - 32 - scrollOffset;
				jagexInterface.horizontalScrollPosition = scrollPos * (maxScrollVertical - height) / maxScroll;
				InterfaceClickMask.redrawInterface(jagexInterface);
				Class136.scrollBarClicked = true;
			}
		}
		if (AbstractBuffer.mouseWheelRotation != 0) {
			final int width = jagexInterface.width;
			if (mouseX >= posX - width && mouseX < posX + 16 && mouseY >= posY && mouseY <= posY + height) {
				jagexInterface.horizontalScrollPosition += AbstractBuffer.mouseWheelRotation * 45;
				InterfaceClickMask.redrawInterface(jagexInterface);
			}
		}
	}

	private final void decode(final Buffer buffer, final int code) {
		if (code == 5) {
			this.setting = buffer.getUShort();
		}
	}

	static final void method635(final int i, final int i_11_, final int i_12_, final int i_13_, final int i_15_, final int i_16_, final int i_17_) {
		if (i == i_17_) {
			LabelGroup.method1036(i, i_13_, i_16_, i_11_, i_12_, i_15_);
		} else {
			if (i_12_ + -i >= MagnetType.anInt260 && ParamType.anInt3544 >= i + i_12_ && i_16_ + -i_17_ >= Class120_Sub30_Sub2.anInt3699 && i_17_ + i_16_ <= IdentityKit.anInt1334) {
				Class120_Sub30_Sub1.method1743(i_12_, i_15_, i_13_, i_16_, i, i_11_, i_17_);
			} else {
				Class159.method2095(i_11_, i_13_, i_12_, i_17_, i_16_, i, i_15_);
			}
		}
	}

	static final long stringToLong(final String string) {
		long value = 0L;
		for (int charId = 0; charId < string.length(); charId++) {
			value *= 37L;
			final int c = string.charAt(charId);
			if (c >= 65 && c <= 90) {
				value += c - 64;
			} else if (c >= 97 && c <= 122) {
				value += c - 96;
			} else if (c >= 48 && c <= 57) {
				value += c - 48 + 27;
			}
			if (value >= 177917621779460413L) {
				break;
			}
		}
		for (/**/; value % 37L == 0 && value != 0L; value /= 37L) {
			/* empty */
		}
		return value;
	}

	public Varp() {
		/* empty */
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

	static final Varp list(final int id) {
		Varp varp = (Varp) recentUse.get(id);
		if (varp != null) {
			return varp;
		}
		final byte[] data = aClass50_1517.getFile(16, id);
		varp = new Varp();
		if (data != null) {
			varp.decode(new Buffer(data));
		}
		recentUse.put(varp, id);
		return varp;
	}
}
