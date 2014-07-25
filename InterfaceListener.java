/* Class120_Sub10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Container;
import java.awt.Insets;

final class InterfaceListener extends Node {
	JagexInterface aClass189_2532;
	int anInt2533;
	JagexInterface aClass189_2534;
	int anInt2535;
	boolean aBoolean2536;
	Object[] objectData;
	static String aString2538 = "slide:";
	String aString2539;
	int anInt2540;
	int anInt2541;
	static ObjectCache aClass21_2542 = new ObjectCache(64);
	int anInt2543;
	static js5 aClass50_2544;
	static int playerRenderZ;
	static int anInt2546;
	static boolean[] playerOptionsOnTop;
	static String aString2548 = "slide:";

	static {
		playerOptionsOnTop = new boolean[8];
	}

	static final void updateCanvasPosition() {
		Container container;
		if (Class120_Sub14_Sub10.fullscreenFrame != null) {
			container = Class120_Sub14_Sub10.fullscreenFrame;
		} else if (Class112.frame != null) {
			container = Class112.frame;
		} else {
			container = NpcType.gameSignlink.gameApplet;
		}
		Class120_Sub12_Sub7.frameWidth = container.getSize().width;
		PlayerAppearance.frameHeight = container.getSize().height;
		if (Class112.frame == container) {
			final Insets insets = Class112.frame.getInsets();
			Class120_Sub12_Sub7.frameWidth -= insets.left + insets.right;
			PlayerAppearance.frameHeight -= insets.bottom + insets.top;
		}
		if (Class120_Sub12_Sub4.getDisplayMode() >= 2) {
			Class186.topMargin = 0;
			Class69_Sub1.canvasWidth = Class120_Sub12_Sub7.frameWidth;
			Class120_Sub28.leftMargin = 0;
			Class120_Sub12_Sub5.canvasHeight = PlayerAppearance.frameHeight;
		} else {
			Class69_Sub1.canvasWidth = 765;
			Class120_Sub12_Sub5.canvasHeight = 503;
			Class120_Sub28.leftMargin = (Class120_Sub12_Sub7.frameWidth - 765) / 2;
			//Class186.topMargin = 0;//original
			Class186.topMargin = (PlayerAppearance.frameHeight - 503) / 2;
		}
		if (HDToolkit.glEnabled) {
			HDToolkit.setCanvasSize(Class69_Sub1.canvasWidth, Class120_Sub12_Sub5.canvasHeight);
		}
		Node.canvas.setSize(Class69_Sub1.canvasWidth, Class120_Sub12_Sub5.canvasHeight);
		if (Class112.frame != container) {
			Node.canvas.setLocation(Class120_Sub28.leftMargin, Class186.topMargin);
		} else {
			final Insets insets = Class112.frame.getInsets();
			Node.canvas.setLocation(insets.left - -Class120_Sub28.leftMargin, Class186.topMargin + insets.top);
		}
		if (Class69.rootInterfaceId != -1) {
			Class101_Sub2.method846(true);
		}
		Class120_Sub12_Sub22.method1322();
	}

	public static void method1169(final byte i) {
		try {
			playerOptionsOnTop = null;
			if (i >= -106) {
				anInt2546 = -128;
			}
			aClass21_2542 = null;
			aString2538 = null;
			aClass50_2544 = null;
			aString2548 = null;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("io.B(").append(i).append(')').toString());
		}
	}

	static final void method1170(final SceneGraphNode sceneGraphNode, final int i, final int i_0_, final int i_1_, final int i_2_, final int i_3_) {
		boolean bool = true;
		int i_4_ = i_0_;
		final int i_5_ = i_0_ + i_2_;
		final int i_6_ = i_1_ - 1;
		final int i_7_ = i_1_ + i_3_;
		for (int i_8_ = i; i_8_ <= i + 1; i_8_++) {
			if (i_8_ != Class142.anInt1361) {
				for (int i_9_ = i_4_; i_9_ <= i_5_; i_9_++) {
					if (i_9_ >= 0 && i_9_ < Class186.anInt1900) {
						for (int i_10_ = i_6_; i_10_ <= i_7_; i_10_++) {
							if (i_10_ >= 0 && i_10_ < Class120_Sub12_Sub38.anInt3440 && (!bool || i_9_ >= i_5_ || i_10_ >= i_7_ || i_10_ < i_1_ && i_9_ != i_0_)) {
								final GroundTile class120_sub18 = LabelGroup.groundTiles[i_8_][i_9_][i_10_];
								if (class120_sub18 != null) {
									final int i_11_ = (OverridedJInterface.tileHeightMap[i_8_][i_9_][i_10_] + OverridedJInterface.tileHeightMap[i_8_][i_9_ + 1][i_10_] + OverridedJInterface.tileHeightMap[i_8_][i_9_][i_10_ + 1] + OverridedJInterface.tileHeightMap[i_8_][i_9_ + 1][i_10_ + 1])
											/ 4 - (OverridedJInterface.tileHeightMap[i][i_0_][i_1_] + OverridedJInterface.tileHeightMap[i][i_0_ + 1][i_1_] + OverridedJInterface.tileHeightMap[i][i_0_][i_1_ + 1] + OverridedJInterface.tileHeightMap[i][i_0_ + 1][i_1_ + 1]) / 4;
									final Class182 class182 = class120_sub18.aClass182_2628;
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
										if (class28 != null && class28.aClass180_174.method2268() && (i_9_ == class28.anInt180 || i_9_ == i_4_) && (i_10_ == class28.anInt184 || i_10_ == i_6_)) {
											final int i_13_ = class28.anInt182 - class28.anInt180 + 1;
											final int i_14_ = class28.anInt175 - class28.anInt184 + 1;
											sceneGraphNode.method2267(class28.aClass180_174, (class28.anInt180 - i_0_) * 128 + (i_13_ - i_2_) * 64, i_11_, (class28.anInt184 - i_1_) * 128 + (i_14_ - i_3_) * 64, bool);
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

	static final int method1171(final int i, final int i_15_, final boolean bool, final int i_16_) {
		int i_17_;
		try {
			if (i_15_ == i) {
				return i;
			}
			if (bool) {
				aClass50_2544 = null;
			}
			final int i_18_ = 128 + -i_16_;
			final int i_19_ = i_16_ * ((~0xff00ff & i_15_) >>> 7) + ((~0xff00ff & i) >>> 7) * i_18_ & ~0xff00ff;
			final int i_20_ = ~0xff00ff & i_16_ * (i_15_ & 0xff00ff) + (i & 0xff00ff) * i_18_;
			i_17_ = i_19_ + (i_20_ >> 7);
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("io.D(").append(i).append(',').append(i_15_).append(',').append(bool).append(',').append(i_16_).append(')').toString());
		}
		return i_17_;
	}

	static final int method1172(final byte i, final int i_21_, final int i_22_) {
		int i_23_;
		try {
			final int i_24_ = ParticleManager.method936(i_22_ - 1, 25528, i_21_ - 1) + ParticleManager.method936(i_22_ + 1, 25528, i_21_ - 1) - -ParticleManager.method936(-1 + i_22_, 25528, i_21_ + 1) - -ParticleManager.method936(1 + i_22_, 25528, 1 + i_21_);
			if (i >= -48) {
				return 6;
			}
			final int i_25_ = ParticleManager.method936(-1 + i_22_, 25528, i_21_) - (-ParticleManager.method936(i_22_ + 1, 25528, i_21_) - ParticleManager.method936(i_22_, 25528, i_21_ - 1) - ParticleManager.method936(i_22_, 25528, 1 + i_21_));
			final int i_26_ = ParticleManager.method936(i_22_, 25528, i_21_);
			i_23_ = i_24_ / 16 + i_25_ / 8 + i_26_ / 4;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("io.A(").append(i).append(',').append(i_21_).append(',').append(i_22_).append(')').toString());
		}
		return i_23_;
	}

	public InterfaceListener() {
		/* empty */
	}
}
