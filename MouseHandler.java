/* Class119 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

final class MouseHandler implements MouseListener, MouseMotionListener, FocusListener {
	static int anInt1140;
	static byte selfClanRank;
	static boolean showNumbersOnActions = false;

	static {
		anInt1140 = 0;
	}

	@Override
	public final synchronized void mouseEntered(final MouseEvent mouseevent) {
		if (Class120_Sub14_Sub4.mouseHandler != null) {
			Class136.mouseIdleCycle = 0;
			GrandExchangeObject.currentMouseX = mouseevent.getX();
			Class120_Sub12_Sub27.currentMouseY = mouseevent.getY();
		}
	}

	public MouseHandler() {
		/* empty */
	}

	@Override
	public final void focusGained(final FocusEvent focusevent) {
		/* empty */
	}

	@Override
	public final void mouseClicked(final MouseEvent mouseevent) {
		if (mouseevent.isPopupTrigger()) {
			mouseevent.consume();
		}
	}

	@Override
	public final synchronized void mouseExited(final MouseEvent mouseevent) {
		if (Class120_Sub14_Sub4.mouseHandler != null) {
			Class136.mouseIdleCycle = 0;
			GrandExchangeObject.currentMouseX = -1;
			Class120_Sub12_Sub27.currentMouseY = -1;
		}
	}

	@Override
	public final synchronized void mouseReleased(final MouseEvent mouseevent) {
		do {
			if (Class120_Sub14_Sub4.mouseHandler != null) {
				Class136.mouseIdleCycle = 0;
				Class42.currentMousePress = 0;
				final int i = mouseevent.getModifiers();
				if ((0x10 & i) != 0) {
					break;
				}
			}
		} while (false);
		if (mouseevent.isPopupTrigger()) {
			mouseevent.consume();
		}
	}

	@Override
	public final synchronized void mouseDragged(final MouseEvent mouseevent) {
		if (Class120_Sub14_Sub4.mouseHandler != null) {
			Class136.mouseIdleCycle = 0;
			GrandExchangeObject.currentMouseX = mouseevent.getX();
			Class120_Sub12_Sub27.currentMouseY = mouseevent.getY();
		}
	}

	@Override
	public final synchronized void focusLost(final FocusEvent focusevent) {
		if (Class120_Sub14_Sub4.mouseHandler != null) {
			Class42.currentMousePress = 0;
		}
	}

	@Override
	public final synchronized void mousePressed(final MouseEvent mouseevent) {
		do {
			if (Class120_Sub14_Sub4.mouseHandler != null) {
				Class136.mouseIdleCycle = 0;
				Class192.currentClickX = mouseevent.getX();
				Class80.currentClickY = mouseevent.getY();
				Class186.currentClickTime = TimeUtil.getSafeTime();
				if (mouseevent.isMetaDown()) {
					GroundObjectNode.currentMouseClick = 2;
					Class42.currentMousePress = 2;
				} else {
					GroundObjectNode.currentMouseClick = 1;
					Class42.currentMousePress = 1;
				}
				final int i = mouseevent.getModifiers();
				if ((i & 0x4) == 0) {
					break;
				}
			}
		} while (false);
		if (mouseevent.isPopupTrigger()) {
			mouseevent.consume();
		}
	}

	static final void method1028() {
		if (!Class154.aBoolean1439) {
			Class154.aBoolean1439 = true;
			Class118.aBoolean1134 = true;
			if (!Class134.aBoolean1277) {
				Class120_Sub12_Sub4.aFloat3154 += (-Class120_Sub12_Sub4.aFloat3154 + -12.0F) / 2.0F;
			} else {
				Class120_Sub12_Sub21.aFloat3293 = -17 + (int) Class120_Sub12_Sub21.aFloat3293 & ~0xf;
			}
		}
	}

	@Override
	public final synchronized void mouseMoved(final MouseEvent mouseevent) {
		if (Class120_Sub14_Sub4.mouseHandler != null) {
			Class136.mouseIdleCycle = 0;
			GrandExchangeObject.currentMouseX = mouseevent.getX();
			Class120_Sub12_Sub27.currentMouseY = mouseevent.getY();
		}
	}
}
