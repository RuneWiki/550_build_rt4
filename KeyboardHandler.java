/* Class161 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.math.BigInteger;

final class KeyboardHandler implements KeyListener, FocusListener {
	static int[] anIntArray1503;
	static BigInteger aBigInteger1505 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");
	static int[] equipmentLookupTable;
	static int tradeChatSetting = 0;
	static AbstractSprite titlebgSprite;

	@Override
	public final synchronized void focusLost(final FocusEvent focusevent) {
		if (ModelParticleMagnet.keyboardHandler != null) {
			AnimatedLocation.anInt3074 = -1;
		}
	}

	public KeyboardHandler() {
		/* empty */
	}

	@Override
	public final void keyTyped(final KeyEvent keyevent) {
		if (ModelParticleMagnet.keyboardHandler != null) {
			final char c = keyevent.getKeyChar();
			if (c != '\0' && c != '\uffff' && Class143.method2019(c)) {
				final int i = ReflectionCheckNode.anInt2762 + 1 & 0x7f;
				if (i != PlainTile.anInt1357) {
					Class120_Sub12_Sub8.anIntArray3187[ReflectionCheckNode.anInt2762] = -1;
					Class134.aCharArray1286[ReflectionCheckNode.anInt2762] = c;
					ReflectionCheckNode.anInt2762 = i;
				}
			}
		}
		keyevent.consume();
	}

	@Override
	public final void focusGained(final FocusEvent focusevent) {
		/* empty */
	}

	@Override
	public final synchronized void keyPressed(final KeyEvent keyevent) {
		if (ModelParticleMagnet.keyboardHandler != null) {
			Class120_Sub14_Sub15.keyboardIdleCycle = 0;
			int i = keyevent.getKeyCode();
			if (i < 0 || i >= Class120_Sub12_Sub23.keyCodes.length) {
				i = -1;
			} else {
				i = Class120_Sub12_Sub23.keyCodes[i];
				if ((i & 0x80) != 0) {
					i = -1;
				}
			}
			if (AnimatedLocation.anInt3074 >= 0 && i >= 0) {
				Class120_Sub12_Sub36.anIntArray3416[AnimatedLocation.anInt3074] = i;
				AnimatedLocation.anInt3074 = 1 + AnimatedLocation.anInt3074 & 0x7f;
				if (AnimatedLocation.anInt3074 == Class111.anInt1060) {
					AnimatedLocation.anInt3074 = -1;
				}
			}
			if (i >= 0) {
				final int i_0_ = 1 + ReflectionCheckNode.anInt2762 & 0x7f;
				if (i_0_ != PlainTile.anInt1357) {
					Class120_Sub12_Sub8.anIntArray3187[ReflectionCheckNode.anInt2762] = i;
					Class134.aCharArray1286[ReflectionCheckNode.anInt2762] = '\0';
					ReflectionCheckNode.anInt2762 = i_0_;
				}
			}
			final int modifier = keyevent.getModifiers();
			if ((0xa & modifier) != 0 || i == 85 || i == 10) {
				keyevent.consume();
			}
		}
	}

	@Override
	public final synchronized void keyReleased(final KeyEvent keyevent) {
		if (ModelParticleMagnet.keyboardHandler != null) {
			Class120_Sub14_Sub15.keyboardIdleCycle = 0;
			int keyCode = keyevent.getKeyCode();
			if (keyCode >= 0 && keyCode < Class120_Sub12_Sub23.keyCodes.length) {
				keyCode = Class120_Sub12_Sub23.keyCodes[keyCode] & ~0x80;
			} else {
				keyCode = -1;
			}
			if (AnimatedLocation.anInt3074 >= 0 && keyCode >= 0) {
				Class120_Sub12_Sub36.anIntArray3416[AnimatedLocation.anInt3074] = keyCode ^ 0xffffffff;
				AnimatedLocation.anInt3074 = 1 + AnimatedLocation.anInt3074 & 0x7f;
				if (Class111.anInt1060 == AnimatedLocation.anInt3074) {
					AnimatedLocation.anInt3074 = -1;
				}
			}
		}
		keyevent.consume();
	}
}
