/* Class120_Sub12_Sub22 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;

final class Class120_Sub12_Sub22 extends Class120_Sub12 {
	static Class120_Sub30_Sub3 aClass120_Sub30_Sub3_3299;
	private int anInt3300 = 32768;
	static int redrawRate = 0;
	static int anInt3302;
	static Class120_Sub14_Sub8 boldFont;

	static final Class180_Sub7 method1319(final int i, final Class180_Sub7 class180_sub7, final int i_0_, final int i_1_, final byte i_2_, final int i_3_, final int i_4_) {
		Class180_Sub7 class180_sub7_5_;
		try {
			if (i_2_ >= -74) {
				method1321(96, 45, 101, 59, -98, 60);
			}
			final long l = i_1_;
			Class180_Sub7 class180_sub7_6_ = (Class180_Sub7) Class120_Sub14_Sub13.aClass21_3564.get(l);
			if (class180_sub7_6_ == null) {
				final Class180_Sub2 class180_sub2 = Class180_Sub2.method2291(Class120_Sub12_Sub17.aClass50_3258, i_1_, 0);
				if (class180_sub2 == null) {
					return null;
				}
				class180_sub7_6_ = class180_sub2.method2300(64, 768, -50, -10, -50);
				Class120_Sub14_Sub13.aClass21_3564.put(class180_sub7_6_, l);
			}
			final int i_7_ = class180_sub7.method2374();
			final int i_8_ = class180_sub7.method2383();
			final int i_9_ = class180_sub7.method2363();
			final int i_10_ = class180_sub7.method2386();
			class180_sub7_6_ = class180_sub7_6_.method2381(true, true, true);
			if (i != 0) {
				class180_sub7_6_.method2360(i);
			}
			if (!HDToolkit.glEnabled) {
				final Class180_Sub7_Sub1 class180_sub7_sub1 = (Class180_Sub7_Sub1) class180_sub7_6_;
				if (i_3_ != Class22.method197(Class173.gameLevel, i_7_ + i_4_, i_0_ - -i_9_) || Class22.method197(Class173.gameLevel, i_8_ + i_4_, i_10_ + i_0_) != i_3_) {
					for (int i_11_ = 0; class180_sub7_sub1.anInt3793 > i_11_; i_11_++) {
						class180_sub7_sub1.yVertices[i_11_] += Class22.method197(Class173.gameLevel, i_4_ + class180_sub7_sub1.xVertices[i_11_], class180_sub7_sub1.zVertices[i_11_] + i_0_) + -i_3_;
					}
					class180_sub7_sub1.boundsCalculated = false;
				}
			} else {
				final Class180_Sub7_Sub2 class180_sub7_sub2 = (Class180_Sub7_Sub2) class180_sub7_6_;
				if (Class22.method197(Class173.gameLevel, i_4_ - -i_7_, i_0_ + i_9_) != i_3_ || i_3_ != Class22.method197(Class173.gameLevel, i_8_ + i_4_, i_0_ - -i_10_)) {
					for (int i_12_ = 0; i_12_ < class180_sub7_sub2.anInt3862; i_12_++) {
						class180_sub7_sub2.anIntArray3856[i_12_] += -i_3_ + Class22.method197(Class173.gameLevel, i_4_ + class180_sub7_sub2.anIntArray3878[i_12_], i_0_ + class180_sub7_sub2.anIntArray3845[i_12_]);
					}
					class180_sub7_sub2.aClass13_3870.aBoolean89 = false;
					class180_sub7_sub2.aClass49_3847.aBoolean439 = false;
				}
			}
			class180_sub7_5_ = class180_sub7_6_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception,
					new StringBuilder("ph.R(").append(i).append(',').append(class180_sub7 != null ? "{...}" : "null").append(',').append(i_0_).append(',').append(i_1_).append(',').append(i_2_).append(',').append(i_3_).append(',').append(i_4_).append(')').toString());
		}
		return class180_sub7_5_;
	}

	public static void method1320(final byte i) {
		try {
			if (i >= -81) {
				anInt3302 = 63;
			}
			aClass120_Sub30_Sub3_3299 = null;
			boldFont = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ph.U(").append(i).append(')').toString());
		}
	}

	@Override
	final void method1193(final byte i) {
		try {
			PacketBuffer.method1147((byte) -29);
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ph.O(").append(i).append(')').toString());
		}
	}

	@Override
	final int[] method1187(final int i, final int i_13_) {
		int[] is;
		try {
			final int[] is_14_ = this.aClass30_2563.method258(i_13_, i + 1674);
			if (this.aClass30_2563.aBoolean238) {
				final int[] is_15_ = method1192(-7764, i_13_, 1);
				final int[] is_16_ = method1192(-7764, i_13_, 2);
				for (int i_17_ = 0; i_17_ < Class120_Sub12_Sub7.anInt3178; i_17_++) {
					final int i_18_ = is_15_[i_17_] >> 4 & 0xff;
					final int i_19_ = anInt3300 * is_16_[i_17_] >> 12;
					final int i_20_ = i_19_ * Class84.anIntArray800[i_18_] >> 12;
					final int i_21_ = Class120_Sub29.anInt2774 & i_13_ + (i_20_ >> 12);
					final int i_22_ = i_19_ * Class83.anIntArray789[i_18_] >> 12;
					final int i_23_ = Class32.anInt259 & i_17_ + (i_22_ >> 12);
					final int[] is_24_ = method1192(-7764, i_21_, 0);
					is_14_[i_17_] = is_24_[i_23_];
				}
			}
			if (i != -1735) {
				aClass120_Sub30_Sub3_3299 = null;
			}
			is = is_14_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ph.D(").append(i).append(',').append(i_13_).append(')').toString());
		}
		return is;
	}

	static final void method1321(final int i, final int i_25_, final int i_26_, final int i_27_, final int i_28_, final int i_29_) {
		try {
			if (i_27_ != 2453) {
				boldFont = null;
			}
			if (Class32.anInt260 > i || i_26_ > Class120_Sub14_Sub11.anInt3544 || Class120_Sub30_Sub2.anInt3699 > i_28_ || i_25_ > Class139.anInt1334) {
				Class120_Sub12.method1194(i, i_26_, i_28_, i_27_ + -2449, i_29_, i_25_);
			} else {
				FileSystem.method446(i_28_, i, 0, i_25_, i_29_, i_26_);
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ph.T(").append(i).append(',').append(i_25_).append(',').append(i_26_).append(',').append(i_27_).append(',').append(i_28_).append(',').append(i_29_).append(')').toString());
		}
	}

	public Class120_Sub12_Sub22() {
		super(3, false);
	}

	static final void method1322() {
		final int leftMargin = Class120_Sub28.leftMargin;
		final int topMargin = Class186.topMargin;
		final int i_33_ = Class120_Sub12_Sub7.frameWidth - Class69_Sub1.canvasWidth - leftMargin;
		final int i_32_ = PlayerAppearance.frameHeight - Class120_Sub12_Sub5.canvasHeight - topMargin;
		if (leftMargin > 0 || i_33_ > 0 || topMargin > 0 || i_32_ > 0) {
			try {
				Container container;
				if (Class120_Sub14_Sub10.fullscreenFrame == null) {
					if (Class112.frame != null) {
						container = Class112.frame;
					} else {
						container = NpcType.gameSignlink.gameApplet;
					}
				} else {
					container = Class120_Sub14_Sub10.fullscreenFrame;
				}
				int i_34_ = 0;
				int i_35_ = 0;
				if (container == Class112.frame) {
					final Insets insets = Class112.frame.getInsets();
					i_34_ = insets.left;
					i_35_ = insets.top;
				}
				final Graphics graphics = container.getGraphics();
				graphics.setColor(Color.black);
				if (leftMargin > 0) {
					graphics.fillRect(i_34_, i_35_, leftMargin, PlayerAppearance.frameHeight);
				}
				if (topMargin > 0) {
					graphics.fillRect(i_34_, i_35_, Class120_Sub12_Sub7.frameWidth, topMargin);
				}
				if (i_33_ > 0) {
					graphics.fillRect(i_34_ + Class120_Sub12_Sub7.frameWidth - i_33_, i_35_, i_33_, PlayerAppearance.frameHeight);
				}
				if (i_32_ > 0) {
					graphics.fillRect(i_34_, i_35_ + PlayerAppearance.frameHeight - i_32_, Class120_Sub12_Sub7.frameWidth, i_32_);
				}
			} catch (final Exception exception) {
				/* empty */
			}
		}
	}

	@Override
	final void method1180(final byte i, final Buffer class120_sub7, final int i_36_) {
		do {
			try {
				if (i == -43) {
					final int i_37_ = i_36_;
					if (i_37_ != 0) {
						if (i_37_ != 1) {
							break;
						}
					} else {
						anInt3300 = class120_sub7.getUShort() << 4;
						break;
					}
					this.aBoolean2558 = class120_sub7.getUByte() == 1;
				}
			} catch (final RuntimeException runtimeexception) {
				throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ph.M(").append(i).append(',').append(class120_sub7 != null ? "{...}" : "null").append(',').append(i_36_).append(')').toString());
			}
		} while (false);
	}

	@Override
	final int[][] method1188(final int i, final int i_38_) {
		int[][] is;
		try {
			final int[][] is_39_ = this.aClass109_2559.method975(i, -90);
			if (this.aClass109_2559.aBoolean1049) {
				final int[] is_40_ = method1192(-7764, i, 1);
				final int[] is_41_ = method1192(-7764, i, 2);
				final int[] is_42_ = is_39_[0];
				final int[] is_43_ = is_39_[1];
				final int[] is_44_ = is_39_[2];
				for (int i_45_ = 0; i_45_ < Class120_Sub12_Sub7.anInt3178; i_45_++) {
					final int i_46_ = is_41_[i_45_] * anInt3300 >> 12;
					final int i_47_ = is_40_[i_45_] * 255 >> 12 & 0xff;
					final int i_48_ = i_46_ * Class84.anIntArray800[i_47_] >> 12;
					final int i_49_ = Class83.anIntArray789[i_47_] * i_46_ >> 12;
					final int i_50_ = Class32.anInt259 & (i_49_ >> 12) + i_45_;
					final int i_51_ = (i_48_ >> 12) + i & Class120_Sub29.anInt2774;
					final int[][] is_52_ = method1179(0, i_51_, (byte) -51);
					is_42_[i_45_] = is_52_[0][i_50_];
					is_43_[i_45_] = is_52_[1][i_50_];
					is_44_[i_45_] = is_52_[2][i_50_];
				}
			}
			if (i_38_ != -29869) {
				boldFont = null;
			}
			is = is_39_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("ph.K(").append(i).append(',').append(i_38_).append(')').toString());
		}
		return is;
	}
}
