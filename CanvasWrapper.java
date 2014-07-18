/* Canvas_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;

final class CanvasWrapper extends Canvas {
	static js5 aClass50_18;
	static Interface3 anInterface3_19;
	static int anInt20 = -1;
	static int[] anIntArray21;
	private final Component component;

	static final int method65(final String string, final int radix, final boolean bool) {
		if (radix < 2 || radix > 36) {
			throw new IllegalArgumentException(new StringBuilder("Invalid radix:").append(radix).toString());
		}
		boolean negate = false;
		boolean bool_3_ = false;
		final int i_4_ = string.length();
		int i_5_ = 0;
		for (int i_6_ = 0; i_4_ > i_6_; i_6_++) {
			int i_7_ = string.charAt(i_6_);
			if (i_6_ == 0) {
				if (i_7_ == 45) {//-
					negate = true;
					continue;
				}
				if (i_7_ == 43 && bool) {//+
					continue;
				}
			}
			if (i_7_ < 48 || i_7_ > 57) {
				if (i_7_ < 65 || i_7_ > 90) {
					if (i_7_ >= 97 && i_7_ <= 122) {
						i_7_ -= 87;
					} else {
						throw new NumberFormatException();
					}
				} else {
					i_7_ -= 55;
				}
			} else {
				i_7_ -= 48;
			}
			if (radix <= i_7_) {
				throw new NumberFormatException();
			}
			if (negate) {
				i_7_ = -i_7_;
			}
			final int i_8_ = i_7_ + radix * i_5_;
			if (i_8_ / radix != i_5_) {
				throw new NumberFormatException();
			}
			bool_3_ = true;
			i_5_ = i_8_;
		}
		if (!bool_3_) {
			throw new NumberFormatException();
		}
		return i_5_;
	}

	static final void method66(final String string, final String string_9_, final int i) {
		AbstractMouseWheelHandler.anInt116 = i;
		Class74.loginName = string_9_;
		SeqType.loginPassword = string;
		if (Class74.loginName.equals("") || SeqType.loginPassword.equals("")) {
			Class48.returnCode = 3;
		} else if (Class157.worldId != -1) {
			LabelGroup.method1037();
		} else {
			Class79_Sub1.anInt2244 = 0;
			FrameLoader.anInt3609 = 1;
			Class48.returnCode = -3;
			Class137.anInt1323 = 0;
			final Buffer class120_sub7 = new Buffer(128);
			class120_sub7.putByte(10);
			class120_sub7.putInt((int) (9.9999999E7 * Math.random()));
			class120_sub7.putLong(Varp.stringToLong(Class74.loginName));
			class120_sub7.putInt((int) (9.9999999E7 * Math.random()));
			class120_sub7.putJagexString(SeqType.loginPassword);
			class120_sub7.putInt((int) (Math.random() * 9.9999999E7));
			class120_sub7.encryptRsa(JagexSocket.aBigInteger415, KeyboardHandler.aBigInteger1505);
			Class120_Sub12_Sub11.outputStream.pos = 0;
			Class120_Sub12_Sub11.outputStream.putByte(24);
			Class120_Sub12_Sub11.outputStream.putByte(class120_sub7.pos + 2);
			Class120_Sub12_Sub11.outputStream.putShort(550);
			Class120_Sub12_Sub11.outputStream.putBuffer(class120_sub7.buf, 0, class120_sub7.pos);
		}
	}

	public static void method67(final byte i) {
		try {
			anInterface3_19 = null;
			if (i <= -85) {
				aClass50_18 = null;
				anIntArray21 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("ql.B(").append(i).append(')').toString());
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
