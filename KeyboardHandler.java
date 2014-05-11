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
	static Class21 aClass21_1504 = new Class21(64);
	static BigInteger aBigInteger1505 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");
	static int[] anIntArray1506;
	static int anInt1507 = 0;
	static AbstractSprite aClass120_Sub14_Sub19_1508;

	public static void method2101(final int i) {
		try {
			anIntArray1503 = null;
			anIntArray1506 = null;
			aBigInteger1505 = null;
			aClass120_Sub14_Sub19_1508 = null;
			aClass21_1504 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("tb.A(").append(i).append(')').toString());
		}
	}

	@Override
	public final synchronized void focusLost(final FocusEvent focusevent) {
		try {
			if (Class169.keyboardHandler != null) {
				Class180_Sub6.anInt3074 = -1;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("tb.focusLost(").append(focusevent != null ? "{...}" : "null").append(')').toString());
		}
	}

	public KeyboardHandler() {
		/* empty */
	}

	@Override
	public final void keyTyped(final KeyEvent keyevent) {
		try {
			if (Class169.keyboardHandler != null) {
				final char c = keyevent.getKeyChar();
				if (c != '\0' && '\uffff' != c && Class143.method2019(c, -1)) {
					final int i = 0x7f & Class120_Sub28.anInt2762 + 1;
					if (i != Class141.anInt1357) {
						Class120_Sub12_Sub8.anIntArray3187[Class120_Sub28.anInt2762] = -1;
						Class134.aCharArray1286[Class120_Sub28.anInt2762] = c;
						Class120_Sub28.anInt2762 = i;
					}
				}
			}
			keyevent.consume();
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("tb.keyTyped(").append(keyevent != null ? "{...}" : "null").append(')').toString());
		}
	}

	@Override
	public final void focusGained(final FocusEvent focusevent) {
		/* empty */
	}

	@Override
	public final synchronized void keyPressed(final KeyEvent keyevent) {
		try {
			if (Class169.keyboardHandler != null) {
				Class120_Sub14_Sub15.anInt3582 = 0;
				int i = keyevent.getKeyCode();
				if (i < 0 || i >= Class120_Sub12_Sub23.anIntArray3304.length) {
					i = -1;
				} else {
					i = Class120_Sub12_Sub23.anIntArray3304[i];
					if ((i & 0x80) != 0) {
						i = -1;
					}
				}
				if (Class180_Sub6.anInt3074 >= 0 && i >= 0) {
					Class120_Sub12_Sub36.anIntArray3416[Class180_Sub6.anInt3074] = i;
					Class180_Sub6.anInt3074 = 1 + Class180_Sub6.anInt3074 & 0x7f;
					if (Class180_Sub6.anInt3074 == Class111.anInt1060) {
						Class180_Sub6.anInt3074 = -1;
					}
				}
				if (i >= 0) {
					final int i_0_ = 1 + Class120_Sub28.anInt2762 & 0x7f;
					if (i_0_ != Class141.anInt1357) {
						Class120_Sub12_Sub8.anIntArray3187[Class120_Sub28.anInt2762] = i;
						Class134.aCharArray1286[Class120_Sub28.anInt2762] = '\0';
						Class120_Sub28.anInt2762 = i_0_;
					}
				}
				final int i_1_ = keyevent.getModifiers();
				if ((0xa & i_1_) != 0 || i == 85 || i == 10) {
					keyevent.consume();
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("tb.keyPressed(").append(keyevent != null ? "{...}" : "null").append(')').toString());
		}
	}

	@Override
	public final synchronized void keyReleased(final KeyEvent keyevent) {
		try {
			if (Class169.keyboardHandler != null) {
				Class120_Sub14_Sub15.anInt3582 = 0;
				int i = keyevent.getKeyCode();
				if (i >= 0 && i < Class120_Sub12_Sub23.anIntArray3304.length) {
					i = Class120_Sub12_Sub23.anIntArray3304[i] & ~0x80;
				} else {
					i = -1;
				}
				if (Class180_Sub6.anInt3074 >= 0 && i >= 0) {
					Class120_Sub12_Sub36.anIntArray3416[Class180_Sub6.anInt3074] = i ^ 0xffffffff;
					Class180_Sub6.anInt3074 = 1 + Class180_Sub6.anInt3074 & 0x7f;
					if (Class111.anInt1060 == Class180_Sub6.anInt3074) {
						Class180_Sub6.anInt3074 = -1;
					}
				}
			}
			keyevent.consume();
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("tb.keyReleased(").append(keyevent != null ? "{...}" : "null").append(')').toString());
		}
	}
}
