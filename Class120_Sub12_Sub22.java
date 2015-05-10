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
	static AbstractFont boldFont;

	static final AbstractModelRenderer method1319(final int i, final AbstractModelRenderer class180_sub7, final int i_0_, final int i_1_, final int i_3_, final int i_4_) {
		final long l = i_1_;
		AbstractModelRenderer class180_sub7_6_ = (AbstractModelRenderer) Class120_Sub14_Sub13.aClass21_3564.get(l);
		if (class180_sub7_6_ == null) {
			final Model class180_sub2 = Model.get(Class120_Sub12_Sub17.aClass50_3258, i_1_, 0);
			if (class180_sub2 == null) {
				return null;
			}
			class180_sub7_6_ = class180_sub2.toRenderer(64, 768, -50, -10, -50);
			Class120_Sub14_Sub13.aClass21_3564.put(class180_sub7_6_, l);
		}
		final int i_7_ = class180_sub7.getMaxX();
		final int i_8_ = class180_sub7.getMinX();
		final int i_9_ = class180_sub7.getMaxZ();
		final int i_10_ = class180_sub7.getMinZ();
		class180_sub7_6_ = class180_sub7_6_.method2381(true, true, true);
		if (i != 0) {
			class180_sub7_6_.rotateY(i);
		}
		if (!HDToolkit.glEnabled) {
			final LDModelRenderer class180_sub7_sub1 = (LDModelRenderer) class180_sub7_6_;
			if (i_3_ != Class22.getTileHeight(i_7_ + i_4_, i_0_ - -i_9_, Class173.gameLevel) || Class22.getTileHeight(i_8_ + i_4_, i_10_ + i_0_, Class173.gameLevel) != i_3_) {
				for (int i_11_ = 0; class180_sub7_sub1.vertexCount > i_11_; i_11_++) {
					class180_sub7_sub1.yVertices[i_11_] += Class22.getTileHeight(i_4_ + class180_sub7_sub1.xVertices[i_11_], class180_sub7_sub1.zVertices[i_11_] + i_0_, Class173.gameLevel) + -i_3_;
				}
				class180_sub7_sub1.boundsCalculated = false;
			}
		} else {
			final HDModelRenderer class180_sub7_sub2 = (HDModelRenderer) class180_sub7_6_;
			if (Class22.getTileHeight(i_4_ - -i_7_, i_0_ + i_9_, Class173.gameLevel) != i_3_ || i_3_ != Class22.getTileHeight(i_8_ + i_4_, i_0_ - -i_10_, Class173.gameLevel)) {
				for (int i_12_ = 0; i_12_ < class180_sub7_sub2.vertexCount; i_12_++) {
					class180_sub7_sub2.yVertices[i_12_] += -i_3_ + Class22.getTileHeight(i_4_ + class180_sub7_sub2.xVertices[i_12_], i_0_ + class180_sub7_sub2.zVertices[i_12_], Class173.gameLevel);
				}
				class180_sub7_sub2.modelBounds.boundsCalculated = false;
				class180_sub7_sub2.aClass49_3847.aBoolean439 = false;
			}
		}
		return class180_sub7_6_;
	}

	@Override
	final void postDecode() {
		PacketBuffer.method1147();
	}

	@Override
	final int[] method1187(final int i_13_) {
		final int[] is_14_ = this.aClass30_2563.method258(i_13_);
		if (this.aClass30_2563.aBoolean238) {
			final int[] is_15_ = method1192(i_13_, 1);
			final int[] is_16_ = method1192(i_13_, 2);
			for (int i_17_ = 0; i_17_ < Class120_Sub12_Sub7.anInt3178; i_17_++) {
				final int i_18_ = is_15_[i_17_] >> 4 & 0xff;
				final int i_19_ = anInt3300 * is_16_[i_17_] >> 12;
				final int i_20_ = i_19_ * GZIPDecompressor.anIntArray800[i_18_] >> 12;
				final int i_21_ = Class120_Sub29.anInt2774 & i_13_ + (i_20_ >> 12);
				final int i_22_ = i_19_ * FileSystemWorker.anIntArray789[i_18_] >> 12;
				final int i_23_ = MagnetType.anInt259 & i_17_ + (i_22_ >> 12);
				final int[] is_24_ = method1192(i_21_, 0);
				is_14_[i_17_] = is_24_[i_23_];
			}
		}
		return is_14_;
	}

	static final void method1321(final int i, final int i_25_, final int i_26_, final int i_28_, final int i_29_) {
		if (MagnetType.anInt260 > i || i_26_ > ParamType.anInt3544 || Class120_Sub30_Sub2.anInt3699 > i_28_ || i_25_ > IdentityKit.anInt1334) {
			Class120_Sub12.method1194(i, i_26_, i_28_, i_29_, i_25_);
		} else {
			FileSystem.method446(i_28_, i, i_25_, i_29_, i_26_);
		}
	}

	public Class120_Sub12_Sub22() {
		super(3, false);
	}

	static final void redrawMargins() {
		final int leftMargin = ReflectionCheckNode.leftMargin;
		final int topMargin = WallDecoration.topMargin;
		final int rigthMargin = Class120_Sub12_Sub7.frameWidth - Class69_Sub1.canvasWidth - leftMargin;
		final int bottomMargin = PlayerAppearance.frameHeight - Class120_Sub12_Sub5.canvasHeight - topMargin;
		if (leftMargin > 0 || rigthMargin > 0 || topMargin > 0 || bottomMargin > 0) {
			try {
				Container container;
				if (Class120_Sub14_Sub10.fullscreenFrame != null) {
					container = Class120_Sub14_Sub10.fullscreenFrame;
				} else if (Class112.frame != null) {
					container = Class112.frame;
				} else {
					container = NpcType.gameSignlink.gameApplet;
				}
				int leftInset = 0;
				int topInset = 0;
				if (container == Class112.frame) {
					final Insets insets = Class112.frame.getInsets();
					leftInset = insets.left;
					topInset = insets.top;
				}
				final Graphics graphics = container.getGraphics();
				//graphics.setColor(Color.black);
				if (leftMargin > 0) {
					graphics.setColor(Color.GRAY);
					graphics.fillRect(leftInset, topInset, leftMargin, PlayerAppearance.frameHeight);
				}
				if (topMargin > 0) {
					graphics.setColor(Color.CYAN);
					graphics.fillRect(leftInset, topInset, Class120_Sub12_Sub7.frameWidth, topMargin);
				}
				if (rigthMargin > 0) {
					graphics.setColor(Color.red);
					graphics.fillRect(leftInset + Class120_Sub12_Sub7.frameWidth - rigthMargin, topInset, rigthMargin, PlayerAppearance.frameHeight);
				}
				if (bottomMargin > 0) {
					graphics.setColor(Color.blue);
					graphics.fillRect(leftInset, topInset + PlayerAppearance.frameHeight - bottomMargin, Class120_Sub12_Sub7.frameWidth, bottomMargin);
				}
			} catch (final Exception exception) {
				/* empty */
			}
		}
	}

	@Override
	final void decode(final Buffer buffer, final int i_37_) {
		do {
			if (i_37_ != 0) {
				if (i_37_ != 1) {
					break;
				}
			} else {
				anInt3300 = buffer.getUShort() << 4;
				break;
			}
			this.aBoolean2558 = buffer.getUByte() == 1;
		} while (false);
	}

	@Override
	final int[][] method1188(final int i) {
		final int[][] is_39_ = this.aClass109_2559.method975(i);
		if (this.aClass109_2559.aBoolean1049) {
			final int[] is_40_ = method1192(i, 1);
			final int[] is_41_ = method1192(i, 2);
			final int[] is_42_ = is_39_[0];
			final int[] is_43_ = is_39_[1];
			final int[] is_44_ = is_39_[2];
			for (int i_45_ = 0; i_45_ < Class120_Sub12_Sub7.anInt3178; i_45_++) {
				final int i_46_ = is_41_[i_45_] * anInt3300 >> 12;
				final int i_47_ = is_40_[i_45_] * 255 >> 12 & 0xff;
				final int i_48_ = i_46_ * GZIPDecompressor.anIntArray800[i_47_] >> 12;
				final int i_49_ = FileSystemWorker.anIntArray789[i_47_] * i_46_ >> 12;
				final int i_50_ = MagnetType.anInt259 & (i_49_ >> 12) + i_45_;
				final int i_51_ = (i_48_ >> 12) + i & Class120_Sub29.anInt2774;
				final int[][] is_52_ = method1179(0, i_51_);
				is_42_[i_45_] = is_52_[0][i_50_];
				is_43_[i_45_] = is_52_[1][i_50_];
				is_44_[i_45_] = is_52_[2][i_50_];
			}
		}
		return is_39_;
	}
}
