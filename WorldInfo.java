/* Class151 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class WorldInfo {
	int country;
	static boolean draggingComponent = false;
	static int anInt1420 = 0;
	static String openUrl;
	String region;

	static final void method2065(final JagexInterface[] class189s, final boolean activateResizeListener, final int width, final int height, final int parent) {
		for (final JagexInterface jagexInterface : class189s) {
			if (jagexInterface != null && jagexInterface.layer == parent) {
				client.updateInterfaceSize(jagexInterface, width, height, activateResizeListener);
				SceneGraphNode.updateInterfacePosition(jagexInterface, width, height);
				if (jagexInterface.horizontalScrollPosition > jagexInterface.maxScrollVertical - jagexInterface.height) {
					jagexInterface.horizontalScrollPosition = jagexInterface.maxScrollVertical - jagexInterface.height;
				}
				if (jagexInterface.verticalScrollPosition > jagexInterface.maxScrollHorizontal - jagexInterface.width) {
					jagexInterface.verticalScrollPosition = jagexInterface.maxScrollHorizontal - jagexInterface.width;
				}
				if (jagexInterface.horizontalScrollPosition < 0) {
					jagexInterface.horizontalScrollPosition = 0;
				}
				if (jagexInterface.verticalScrollPosition < 0) {
					jagexInterface.verticalScrollPosition = 0;
				}
				if (jagexInterface.type == 0) {
					ProducingGraphicsBuffer.method1854(jagexInterface, activateResizeListener);
				}
			}
		}
	}

	static final void method2066(final int i_4_) {
		Class136.clickedMouseFunctionCycle = 100;
		Class96.clickedMouseFunctionBlinksLeft = 3;
		Class120_Sub12_Sub9.clickedMouseFunctionId = -1;
		Class127.anInt1215 = i_4_;
	}

	static final void method2067(final int i, final int i_5_, final int i_6_, final int i_7_, final int i_8_, final int i_9_, final int i_10_, final int i_12_, final int i_13_) {
		if (i_7_ == i && i_8_ == i_9_ && i_13_ == i_6_ && i_5_ == i_10_) {
			Class120_Sub12_Sub32.method1369(i_9_, i_10_, i_12_, i, i_6_);
		} else {
			int i_14_ = i;
			int i_15_ = i_9_;
			final int i_16_ = 3 * i;
			final int i_17_ = 3 * i_8_;
			final int i_18_ = 3 * i_7_;
			final int i_19_ = 3 * i_13_;
			final int i_20_ = -i + -i_19_ + i_6_ - -i_18_;
			final int i_21_ = 3 * i_9_;
			final int i_22_ = i_16_ + -i_18_ + -i_18_ + i_19_;
			final int i_23_ = i_5_ * 3;
			final int i_24_ = -i_17_ + i_23_ + -i_17_ - -i_21_;
			final int i_25_ = -i_9_ + i_17_ + i_10_ + -i_23_;
			final int i_26_ = i_18_ - i_16_;
			final int i_27_ = i_17_ - i_21_;
			for (int i_28_ = 128; i_28_ <= 4096; i_28_ += 128) {
				final int i_29_ = i_28_ * i_28_ >> 12;
				final int i_30_ = i_29_ * i_22_;
				final int i_31_ = i_28_ * i_29_ >> 12;
				final int i_32_ = i_31_ * i_20_;
				final int i_33_ = i_27_ * i_28_;
				final int i_34_ = i_24_ * i_29_;
				final int i_35_ = i_25_ * i_31_;
				final int i_36_ = i_26_ * i_28_;
				final int i_37_ = (i_36_ + i_30_ + i_32_ >> 12) + i;
				final int i_38_ = (i_33_ + i_35_ - -i_34_ >> 12) + i_9_;
				Class120_Sub12_Sub32.method1369(i_15_, i_38_, i_12_, i_14_, i_37_);
				i_15_ = i_38_;
				i_14_ = i_37_;
			}
		}
	}

}
