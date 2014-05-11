/* Class98 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.PixelGrabber;

final class Class98 {
	private byte[] aByteArray944;
	private boolean aBoolean945 = false;
	private int anInt946 = 0;
	private static int anInt947 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00a3$%^&*()-_=+[{]};:'@#~,<.>/?\\| \u00c4\u00cb\u00cf\u00d6\u00dc\u00e4\u00eb\u00ef\u00f6\u00fc\u00ff\u00df\u00c1\u00c0\u00c9\u00c8\u00cd\u00cc\u00d3\u00d2\u00da\u00d9\u00e1\u00e0\u00e9\u00e8\u00ed\u00ec\u00f3\u00f2\u00fa\u00f9\u00c2\u00ca\u00ce\u00d4\u00db\u00e2\u00ea\u00ee\u00f4\u00fb\u00c6\u00e6\u00e3\u00c3\u00f5\u00d5\u00e7\u00c7"
			.length();
	private static int[] anIntArray948 = new int[256];

	static {
		for (int i = 0; i < 256; i++) {
			int i_0_ = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00a3$%^&*()-_=+[{]};:'@#~,<.>/?\\| \u00c4\u00cb\u00cf\u00d6\u00dc\u00e4\u00eb\u00ef\u00f6\u00fc\u00ff\u00df\u00c1\u00c0\u00c9\u00c8\u00cd\u00cc\u00d3\u00d2\u00da\u00d9\u00e1\u00e0\u00e9\u00e8\u00ed\u00ec\u00f3\u00f2\u00fa\u00f9\u00c2\u00ca\u00ce\u00d4\u00db\u00e2\u00ea\u00ee\u00f4\u00fb\u00c6\u00e6\u00e3\u00c3\u00f5\u00d5\u00e7\u00c7"
					.indexOf(i);
			if (i_0_ == -1) {
				i_0_ = 74;
			}
			anIntArray948[i] = i_0_ * 9;
		}
	}

	final int method811(final String string) {
		int i = 0;
		for (int i_1_ = 0; i_1_ < string.length(); i_1_++) {
			if (string.charAt(i_1_) == '@' && i_1_ + 4 < string.length() && string.charAt(i_1_ + 4) == '@') {
				i_1_ += 4;
			} else if (string.charAt(i_1_) == '~' && i_1_ + 4 < string.length() && string.charAt(i_1_ + 4) == '~') {
				i_1_ += 4;
			} else {
				i += aByteArray944[anIntArray948[string.charAt(i_1_)] + 7];
			}
		}
		return i;
	}

	private final void method812(final int i, final int i_2_, final int i_3_, final int i_4_, final byte[] is) {
		int i_5_ = i_2_ + is[i + 5];
		int i_6_ = i_3_ - is[i + 6];
		int i_7_ = is[i + 3];
		int i_8_ = is[i + 4];
		int i_9_ = is[i] * 16384 + is[i + 1] * 128 + is[i + 2];
		int i_10_ = i_5_ + i_6_ * GraphicsLD.width;
		int i_11_ = GraphicsLD.width - i_7_;
		int i_12_ = 0;
		if (i_6_ < GraphicsLD.startY) {
			final int i_13_ = GraphicsLD.startY - i_6_;
			i_8_ -= i_13_;
			i_6_ = GraphicsLD.startY;
			i_9_ += i_13_ * i_7_;
			i_10_ += i_13_ * GraphicsLD.width;
		}
		if (i_6_ + i_8_ >= GraphicsLD.endY) {
			i_8_ -= i_6_ + i_8_ - GraphicsLD.endY + 1;
		}
		if (i_5_ < GraphicsLD.startX) {
			final int i_14_ = GraphicsLD.startX - i_5_;
			i_7_ -= i_14_;
			i_5_ = GraphicsLD.startX;
			i_9_ += i_14_;
			i_10_ += i_14_;
			i_12_ += i_14_;
			i_11_ += i_14_;
		}
		if (i_5_ + i_7_ >= GraphicsLD.endX) {
			final int i_15_ = i_5_ + i_7_ - GraphicsLD.endX + 1;
			i_7_ -= i_15_;
			i_12_ += i_15_;
			i_11_ += i_15_;
		}
		if (i_7_ > 0 && i_8_ > 0) {
			if (aBoolean945) {
				method820(GraphicsLD.pixels, is, i_4_, i_9_, i_10_, i_7_, i_8_, i_11_, i_12_);
			} else {
				method816(GraphicsLD.pixels, is, i_4_, i_9_, i_10_, i_7_, i_8_, i_11_, i_12_);
			}
		}
	}

	final int method813() {
		return aByteArray944[6];
	}

	public static void method814() {
		anIntArray948 = null;
	}

	final void method815(final String string, final int i, final int i_16_, final int i_17_, final boolean bool) {
		final int i_18_ = method811(string) / 2;
		final int i_19_ = method813();
		if (i - i_18_ <= GraphicsLD.endX && i + i_18_ >= GraphicsLD.startX && i_16_ - i_19_ <= GraphicsLD.endY && i_16_ >= 0) {
			method818(string, i - i_18_, i_16_, i_17_, bool);
		}
	}

	private final void method816(final int[] is, final byte[] is_20_, final int i, int i_21_, int i_22_, int i_23_, final int i_24_, final int i_25_, final int i_26_) {
		final int i_27_ = -(i_23_ >> 2);
		i_23_ = -(i_23_ & 0x3);
		for (int i_28_ = -i_24_; i_28_ < 0; i_28_++) {
			for (int i_29_ = i_27_; i_29_ < 0; i_29_++) {
				if (is_20_[i_21_++] != 0) {
					is[i_22_++] = i;
				} else {
					i_22_++;
				}
				if (is_20_[i_21_++] != 0) {
					is[i_22_++] = i;
				} else {
					i_22_++;
				}
				if (is_20_[i_21_++] != 0) {
					is[i_22_++] = i;
				} else {
					i_22_++;
				}
				if (is_20_[i_21_++] != 0) {
					is[i_22_++] = i;
				} else {
					i_22_++;
				}
			}
			for (int i_30_ = i_23_; i_30_ < 0; i_30_++) {
				if (is_20_[i_21_++] != 0) {
					is[i_22_++] = i;
				} else {
					i_22_++;
				}
			}
			i_22_ += i_25_;
			i_21_ += i_26_;
		}
	}

	final int method817() {
		return aByteArray944[8] - 1;
	}

	private final void method818(final String string, int i, final int i_31_, final int i_32_, boolean bool) {
		if (aBoolean945 || i_32_ == 0) {
			bool = false;
		}
		for (int i_33_ = 0; i_33_ < string.length(); i_33_++) {
			final int i_34_ = anIntArray948[string.charAt(i_33_)];
			if (bool) {
				method812(i_34_, i + 1, i_31_, 1, aByteArray944);
				method812(i_34_, i, i_31_ + 1, 1, aByteArray944);
			}
			method812(i_34_, i, i_31_, i_32_, aByteArray944);
			i += aByteArray944[i_34_ + 7];
		}
	}

	private final void method819(final Font font, final FontMetrics fontmetrics, final char c, final int i, boolean bool) {
		int i_35_ = fontmetrics.charWidth(c);
		final int i_36_ = i_35_;
		if (bool) {
			try {
				if (c == '/') {
					bool = false;
				}
				if (c == 'f' || c == 't' || c == 'w' || c == 'v' || c == 'k' || c == 'x' || c == 'y' || c == 'A' || c == 'V' || c == 'W') {
					i_35_++;
				}
			} catch (final Exception exception) {
				/* empty */
			}
		}
		final int i_37_ = fontmetrics.getMaxAscent();
		final int i_38_ = fontmetrics.getMaxAscent() + fontmetrics.getMaxDescent();
		final int i_39_ = fontmetrics.getHeight();
		final Image image = Node.canvas.createImage(i_35_, i_38_);
		final Graphics graphics = image.getGraphics();
		graphics.setColor(Color.black);
		graphics.fillRect(0, 0, i_35_, i_38_);
		graphics.setColor(Color.white);
		graphics.setFont(font);
		graphics.drawString(new StringBuilder(String.valueOf(c)).toString(), 0, i_37_);
		if (bool) {
			graphics.drawString(new StringBuilder(String.valueOf(c)).toString(), 1, i_37_);
		}
		final int[] is = new int[i_35_ * i_38_];
		final PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, i_35_, i_38_, is, 0, i_35_);
		try {
			pixelgrabber.grabPixels();
		} catch (final Exception exception) {
			/* empty */
		}
		image.flush();
		int i_40_ = 0;
		int i_41_ = 0;
		int i_42_ = i_35_;
		int i_43_ = i_38_;
		while_219_: for (int i_44_ = 0; i_44_ < i_38_; i_44_++) {
			for (int i_45_ = 0; i_45_ < i_35_; i_45_++) {
				final int i_46_ = is[i_45_ + i_44_ * i_35_];
				if ((i_46_ & 0xffffff) != 0) {
					i_41_ = i_44_;
					break while_219_;
				}
			}
		}
		while_220_: for (int i_47_ = 0; i_47_ < i_35_; i_47_++) {
			for (int i_48_ = 0; i_48_ < i_38_; i_48_++) {
				final int i_49_ = is[i_47_ + i_48_ * i_35_];
				if ((i_49_ & 0xffffff) != 0) {
					i_40_ = i_47_;
					break while_220_;
				}
			}
		}
		while_221_: for (int i_50_ = i_38_ - 1; i_50_ >= 0; i_50_--) {
			for (int i_51_ = 0; i_51_ < i_35_; i_51_++) {
				final int i_52_ = is[i_51_ + i_50_ * i_35_];
				if ((i_52_ & 0xffffff) != 0) {
					i_43_ = i_50_ + 1;
					break while_221_;
				}
			}
		}
		while_222_: for (int i_53_ = i_35_ - 1; i_53_ >= 0; i_53_--) {
			for (int i_54_ = 0; i_54_ < i_38_; i_54_++) {
				final int i_55_ = is[i_53_ + i_54_ * i_35_];
				if ((i_55_ & 0xffffff) != 0) {
					i_42_ = i_53_ + 1;
					break while_222_;
				}
			}
		}
		aByteArray944[i * 9 + 0] = (byte) (anInt946 / 16384);
		aByteArray944[i * 9 + 1] = (byte) (anInt946 / 128 & 0x7f);
		aByteArray944[i * 9 + 2] = (byte) (anInt946 & 0x7f);
		aByteArray944[i * 9 + 3] = (byte) (i_42_ - i_40_);
		aByteArray944[i * 9 + 4] = (byte) (i_43_ - i_41_);
		aByteArray944[i * 9 + 5] = (byte) i_40_;
		aByteArray944[i * 9 + 6] = (byte) (i_37_ - i_41_);
		aByteArray944[i * 9 + 7] = (byte) i_36_;
		aByteArray944[i * 9 + 8] = (byte) i_39_;
		for (int i_56_ = i_41_; i_56_ < i_43_; i_56_++) {
			for (int i_57_ = i_40_; i_57_ < i_42_; i_57_++) {
				final int i_58_ = is[i_57_ + i_56_ * i_35_] & 0xff;
				if (i_58_ > 30 && i_58_ < 230) {
					aBoolean945 = true;
				}
				aByteArray944[anInt946++] = (byte) i_58_;
			}
		}
	}

	private final void method820(final int[] is, final byte[] is_59_, final int i, int i_60_, int i_61_, final int i_62_, final int i_63_, final int i_64_, final int i_65_) {
		for (int i_66_ = -i_63_; i_66_ < 0; i_66_++) {
			for (int i_67_ = -i_62_; i_67_ < 0; i_67_++) {
				final int i_68_ = is_59_[i_60_++] & 0xff;
				if (i_68_ > 30) {
					if (i_68_ >= 230) {
						is[i_61_++] = i;
					} else {
						final int i_69_ = is[i_61_];
						is[i_61_++] = ((i & 0xff00ff) * i_68_ + (i_69_ & 0xff00ff) * (256 - i_68_) & ~0xff00ff) + ((i & 0xff00) * i_68_ + (i_69_ & 0xff00) * (256 - i_68_) & 0xff0000) >> 8;
					}
				} else {
					i_61_++;
				}
			}
			i_61_ += i_64_;
			i_60_ += i_65_;
		}
	}

	Class98(final int i, final boolean bool, final Component component) {
		aByteArray944 = new byte[100000];
		anInt946 = anInt947 * 9;
		aBoolean945 = false;
		Font font = new Font("Helvetica", bool ? 1 : 0, i);
		FontMetrics fontmetrics = component.getFontMetrics(font);
		for (int i_70_ = 0; i_70_ < anInt947; i_70_++) {
			method819(
					font,
					fontmetrics,
					"ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00a3$%^&*()-_=+[{]};:'@#~,<.>/?\\| \u00c4\u00cb\u00cf\u00d6\u00dc\u00e4\u00eb\u00ef\u00f6\u00fc\u00ff\u00df\u00c1\u00c0\u00c9\u00c8\u00cd\u00cc\u00d3\u00d2\u00da\u00d9\u00e1\u00e0\u00e9\u00e8\u00ed\u00ec\u00f3\u00f2\u00fa\u00f9\u00c2\u00ca\u00ce\u00d4\u00db\u00e2\u00ea\u00ee\u00f4\u00fb\u00c6\u00e6\u00e3\u00c3\u00f5\u00d5\u00e7\u00c7"
							.charAt(i_70_), i_70_, false);
		}
		if (bool && aBoolean945) {
			anInt946 = anInt947 * 9;
			aBoolean945 = false;
			font = new Font("Helvetica", 0, i);
			fontmetrics = component.getFontMetrics(font);
			for (int i_71_ = 0; i_71_ < anInt947; i_71_++) {
				method819(
						font,
						fontmetrics,
						"ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00a3$%^&*()-_=+[{]};:'@#~,<.>/?\\| \u00c4\u00cb\u00cf\u00d6\u00dc\u00e4\u00eb\u00ef\u00f6\u00fc\u00ff\u00df\u00c1\u00c0\u00c9\u00c8\u00cd\u00cc\u00d3\u00d2\u00da\u00d9\u00e1\u00e0\u00e9\u00e8\u00ed\u00ec\u00f3\u00f2\u00fa\u00f9\u00c2\u00ca\u00ce\u00d4\u00db\u00e2\u00ea\u00ee\u00f4\u00fb\u00c6\u00e6\u00e3\u00c3\u00f5\u00d5\u00e7\u00c7"
								.charAt(i_71_), i_71_, false);
			}
			if (!aBoolean945) {
				anInt946 = anInt947 * 9;
				aBoolean945 = false;
				for (int i_72_ = 0; i_72_ < anInt947; i_72_++) {
					method819(
							font,
							fontmetrics,
							"ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00a3$%^&*()-_=+[{]};:'@#~,<.>/?\\| \u00c4\u00cb\u00cf\u00d6\u00dc\u00e4\u00eb\u00ef\u00f6\u00fc\u00ff\u00df\u00c1\u00c0\u00c9\u00c8\u00cd\u00cc\u00d3\u00d2\u00da\u00d9\u00e1\u00e0\u00e9\u00e8\u00ed\u00ec\u00f3\u00f2\u00fa\u00f9\u00c2\u00ca\u00ce\u00d4\u00db\u00e2\u00ea\u00ee\u00f4\u00fb\u00c6\u00e6\u00e3\u00c3\u00f5\u00d5\u00e7\u00c7"
									.charAt(i_72_), i_72_, true);
				}
			}
		}
		final byte[] is = new byte[anInt946];
		for (int i_73_ = 0; i_73_ < anInt946; i_73_++) {
			is[i_73_] = aByteArray944[i_73_];
		}
		aByteArray944 = is;
	}
}
