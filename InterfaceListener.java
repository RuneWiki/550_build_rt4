/* Class120_Sub10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Container;
import java.awt.Insets;

final class InterfaceListener extends Node {
	JagexInterface draggedOnComponent;
	int keyCode;
	JagexInterface jagexInterface;
	int keyChar;
	boolean mouseUsed;
	Object[] objectData;
	String optionBase;
	int data2;
	int optionId;
	int data1;
	static js5 aClass50_2544;
	static int cameraZ;
	static int anInt2546;
	static boolean[] playerOptionsOnTop = new boolean[8];

	static final void updateCanvasPosition() {
		Container container;
		if (QuickChatMessageType.fullscreenFrame != null) {
			container = QuickChatMessageType.fullscreenFrame;
		} else if (Class112.frame != null) {
			container = Class112.frame;
		} else {
			container = NpcType.gameSignlink.gameApplet;
		}
		Class120_Sub12_Sub7.frameWidth = container.getSize().width;
		PlayerAppearance.frameHeight = container.getSize().height;
		if (container == Class112.frame) {
			final Insets insets = Class112.frame.getInsets();
			Class120_Sub12_Sub7.frameWidth -= insets.left + insets.right;
			PlayerAppearance.frameHeight -= insets.bottom + insets.top;
		}
		if (Class120_Sub12_Sub4.determinateDisplayMode() >= 2) {
			Class69_Sub1.canvasWidth = Class120_Sub12_Sub7.frameWidth;
			Class120_Sub12_Sub5.canvasHeight = PlayerAppearance.frameHeight;
			WallDecoration.topMargin = 0;
			ReflectionCheckNode.leftMargin = 0;
		} else {
			Class69_Sub1.canvasWidth = 765;
			Class120_Sub12_Sub5.canvasHeight = 503;
			WallDecoration.topMargin = (PlayerAppearance.frameHeight - Class120_Sub12_Sub5.canvasHeight) / 2;
			ReflectionCheckNode.leftMargin = (Class120_Sub12_Sub7.frameWidth - Class69_Sub1.canvasWidth) / 2;
			//Class186.topMargin = 0;//original
		}
		if (HDToolkit.glEnabled) {
			HDToolkit.setCanvasSize(Class69_Sub1.canvasWidth, Class120_Sub12_Sub5.canvasHeight);
		}
		Node.canvas.setSize(Class69_Sub1.canvasWidth, Class120_Sub12_Sub5.canvasHeight);
		if (Class112.frame != container) {
			Node.canvas.setLocation(ReflectionCheckNode.leftMargin, WallDecoration.topMargin);
		} else {
			final Insets insets = Class112.frame.getInsets();
			Node.canvas.setLocation(ReflectionCheckNode.leftMargin + insets.left, WallDecoration.topMargin + insets.top);
		}
		if (Class69.rootInterfaceId != -1) {
			Class101_Sub2.method846(true);
		}
		Class120_Sub12_Sub22.redrawMargins();
	}

	static final void method1170(final SceneGraphNode sceneGraphNode, final int i, final int i_0_, final int i_1_, final int i_2_, final int i_3_) {
		boolean bool = true;
		int i_4_ = i_0_;
		final int i_5_ = i_0_ + i_2_;
		final int i_6_ = i_1_ - 1;
		final int i_7_ = i_1_ + i_3_;
		for (int i_8_ = i; i_8_ <= i + 1; i_8_++) {
			if (i_8_ != MapSceneType.activeGroundTileLength) {
				for (int i_9_ = i_4_; i_9_ <= i_5_; i_9_++) {
					if (i_9_ >= 0 && i_9_ < WallDecoration.mapSizeX) {
						for (int i_10_ = i_6_; i_10_ <= i_7_; i_10_++) {
							if (i_10_ >= 0 && i_10_ < Class120_Sub12_Sub38.mapSizeZ && (!bool || i_9_ >= i_5_ || i_10_ >= i_7_ || i_10_ < i_1_ && i_9_ != i_0_)) {
								final GroundTile class120_sub18 = SeqFrameBase.activeGroundTiles[i_8_][i_9_][i_10_];
								if (class120_sub18 != null) {
									final int i_11_ = (SubInterface.activeTileHeightMap[i_8_][i_9_][i_10_] + SubInterface.activeTileHeightMap[i_8_][i_9_ + 1][i_10_] + SubInterface.activeTileHeightMap[i_8_][i_9_][i_10_ + 1] + SubInterface.activeTileHeightMap[i_8_][i_9_ + 1][i_10_ + 1])
											/ 4 - (SubInterface.activeTileHeightMap[i][i_0_][i_1_] + SubInterface.activeTileHeightMap[i][i_0_ + 1][i_1_] + SubInterface.activeTileHeightMap[i][i_0_][i_1_ + 1] + SubInterface.activeTileHeightMap[i][i_0_ + 1][i_1_ + 1]) / 4;
									final WallLocation class182 = class120_sub18.wallLocation;
									if (class182 != null) {
										if (class182.aClass180_1800.method2268()) {
											sceneGraphNode.method2267(class182.aClass180_1800, (i_9_ - i_0_) * 128 + (1 - i_2_) * 64, i_11_, (i_10_ - i_1_) * 128 + (1 - i_3_) * 64, bool);
										}
										if (class182.aClass180_1796 != null && class182.aClass180_1796.method2268()) {
											sceneGraphNode.method2267(class182.aClass180_1796, (i_9_ - i_0_) * 128 + (1 - i_2_) * 64, i_11_, (i_10_ - i_1_) * 128 + (1 - i_3_) * 64, bool);
										}
									}
									for (int i_12_ = 0; i_12_ < class120_sub18.anInt2638; i_12_++) {
										final Class28 class28 = class120_sub18.aClass28Array2625[i_12_];
										if (class28 != null && class28.sceneGraphNode.method2268() && (i_9_ == class28.anInt180 || i_9_ == i_4_) && (i_10_ == class28.anInt184 || i_10_ == i_6_)) {
											final int i_13_ = class28.anInt182 - class28.anInt180 + 1;
											final int i_14_ = class28.anInt175 - class28.anInt184 + 1;
											sceneGraphNode.method2267(class28.sceneGraphNode, (class28.anInt180 - i_0_) * 128 + (i_13_ - i_2_) * 64, i_11_, (class28.anInt184 - i_1_) * 128 + (i_14_ - i_3_) * 64, bool);
										}
									}
								}
							}
						}
					}
				}
				i_4_--;
				bool = false;
			}
		}
	}

	static final int method1171(final int i, final int i_15_, final int i_16_) {
		if (i_15_ == i) {
			return i;
		}
		final int i_18_ = 128 + -i_16_;
		final int i_19_ = i_16_ * ((~0xff00ff & i_15_) >>> 7) + ((~0xff00ff & i) >>> 7) * i_18_ & ~0xff00ff;
		final int i_20_ = ~0xff00ff & i_16_ * (i_15_ & 0xff00ff) + (i & 0xff00ff) * i_18_;
		return i_19_ + (i_20_ >> 7);
	}

	static final int method1172(final int i_21_, final int i_22_) {
		final int i_24_ = ParticleEmitter.method936(i_22_ - 1, i_21_ - 1) + ParticleEmitter.method936(i_22_ + 1, i_21_ - 1) - -ParticleEmitter.method936(i_22_ - 1, i_21_ + 1) - -ParticleEmitter.method936(1 + i_22_, 1 + i_21_);
		final int i_25_ = ParticleEmitter.method936(i_22_ - 1, i_21_) - (-ParticleEmitter.method936(i_22_ + 1, i_21_) - ParticleEmitter.method936(i_22_, i_21_ - 1) - ParticleEmitter.method936(i_22_, 1 + i_21_));
		final int i_26_ = ParticleEmitter.method936(i_22_, i_21_);
		return i_24_ / 16 + i_25_ / 8 + i_26_ / 4;
	}

	public InterfaceListener() {
		/* empty */
	}
}
