/* Canvas_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;

final class CanvasWrapper extends Canvas {
	static Interface3 anInterface3_19;
	static int anInt20 = -1;
	static int[] anIntArray21;
	private final Component component;

	static final int stringToIntRadix(final String string, final int radix, final boolean bool) {
		if (radix < 2 || radix > 36) {
			throw new IllegalArgumentException("Invalid radix:" + radix);
		}
		boolean negative = false;
		boolean resultSet = false;
		int result = 0;
		for (int index = 0; index < string.length(); index++) {
			int charValue = string.charAt(index);
			if (index == 0) {
				if (charValue == 45) {//-
					negative = true;
					continue;
				}
				if (charValue == 43 && bool) {//+
					continue;
				}
			}
			if (charValue < 48 || charValue > 57) {//1-9
				if (charValue < 65 || charValue > 90) {//A-Z
					if (charValue >= 97 && charValue <= 122) {//a-z
						charValue -= 87;
					} else {
						throw new NumberFormatException();
					}
				} else {
					charValue -= 55;
				}
			} else {
				charValue -= 48;
			}
			if (radix <= charValue) {
				throw new NumberFormatException();
			}
			if (negative) {
				charValue = -charValue;
			}
			final int nextResult = charValue + radix * result;
			if (nextResult / radix != result) {
				throw new NumberFormatException();
			}
			resultSet = true;
			result = nextResult;
		}
		if (!resultSet) {
			throw new NumberFormatException();
		}
		return result;
	}

	static final void login(final String string, final String string_9_, final int i) {
		AbstractMouseWheelHandler.anInt116 = i;
		Class74.loginName = string_9_;
		SeqType.loginPassword = string;
		if (Class74.loginName.equals("") || SeqType.loginPassword.equals("")) {
			Class48.returnCode = 3;
		} else if (Class157.worldId != -1) {
			LabelGroup.method1037();
		} else {
			Class79_Sub1.anInt2244 = 0;
			FrameGroup.anInt3609 = 1;
			Class48.returnCode = -3;
			MapFunctionGroup.anInt1323 = 0;
			final Buffer buffer = new Buffer(128);
			buffer.putByte(10);
			buffer.putInt((int) (9.9999999E7 * Math.random()));
			buffer.putLong(Varp.stringToLong(Class74.loginName));
			buffer.putInt((int) (9.9999999E7 * Math.random()));
			buffer.putJagexString(SeqType.loginPassword);
			buffer.putInt((int) (Math.random() * 9.9999999E7));
			buffer.encryptRsa(JagexSocket.aBigInteger415, KeyboardHandler.aBigInteger1505);
			Class120_Sub12_Sub11.outputStream.pos = 0;
			Class120_Sub12_Sub11.outputStream.putByte(24);
			Class120_Sub12_Sub11.outputStream.putByte(buffer.pos + 2);
			Class120_Sub12_Sub11.outputStream.putShort(550);
			Class120_Sub12_Sub11.outputStream.putBuffer(buffer.buf, 0, buffer.pos);
		}
	}

	@Override
	public final void paint(final Graphics graphics) {
		component.paint(graphics);
	}

	@Override
	public final void update(final Graphics graphics) {
		component.update(graphics);
	}

	CanvasWrapper(final Component c) {
		component = c;
	}
}
