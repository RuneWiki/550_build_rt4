/* Class120_Sub14_Sub3_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class JavaObject extends AbstractObject {
	static int anInt3913 = 0;
	static Hashtable clickMaskCache;
	static int anInt3915 = 0;
	static int[] anIntArray3916;
	private final Object value;

	static {
		clickMaskCache = new Hashtable(512);
	}

	static final int titleSpriteCachedCount(final js5 js5) {
		int i_1_ = 0;
		if (js5.groupExist(StructType.titlebgId)) {
			i_1_++;
		}
		if (js5.groupExist(ParticleEmitter.logoId)) {
			i_1_++;
		}
		return i_1_;
	}

	@Override
	final boolean isSoftReference() {
		return false;
	}

	@Override
	final Object get() {
		return value;
	}

	JavaObject(final Object object) {
		value = object;
	}

	static final void updateDraggedComponent() {
		InterfaceClickMask.redrawInterface(Class120_Sub12_Sub4.draggedComponent);
		SceneGroundObject.componentPressedCycles++;
		if (!WorldInfo.draggingComponent || !Class111.aBoolean1058) {
			if (SceneGroundObject.componentPressedCycles > 1) {
				Class120_Sub12_Sub4.draggedComponent = null;
			}
		} else {
			int mouseX = Queue.lastMouseX;
			mouseX -= AbstractGraphicsBuffer.clickedComponentX;
			if (mouseX < Class120_Sub12_Sub7.anInt3183) {
				mouseX = Class120_Sub12_Sub7.anInt3183;
			}
			if (Class120_Sub12_Sub4.draggedComponent.width + mouseX > Normal.aClass189_161.width + Class120_Sub12_Sub7.anInt3183) {
				mouseX = Normal.aClass189_161.width + Class120_Sub12_Sub7.anInt3183 - Class120_Sub12_Sub4.draggedComponent.width;
			}
			int mouseY = ChunkAtmosphere.lastMouseY;
			mouseY -= client.clickedComponentY;
			if (Class120_Sub12_Sub35.anInt3413 > mouseY) {
				mouseY = Class120_Sub12_Sub35.anInt3413;
			}
			final int i_4_ = mouseX - Class120_Sub12_Sub17.draggedComponentPosX;
			if (Class120_Sub12_Sub4.draggedComponent.height + mouseY > Class120_Sub12_Sub35.anInt3413 - -Normal.aClass189_161.height) {
				mouseY = Class120_Sub12_Sub35.anInt3413 - -Normal.aClass189_161.height + -Class120_Sub12_Sub4.draggedComponent.height;
			}
			final int i_5_ = mouseY - Class9.draggedComponentPosY;
			int offset = Class120_Sub12_Sub4.draggedComponent.pixelsBeforeDrag;
			if (SceneGroundObject.componentPressedCycles > Class120_Sub12_Sub4.draggedComponent.cyclesBeforeDrag && (i_4_ > offset || i_4_ < -offset || i_5_ > offset || i_5_ < -offset)) {
				Class120_Sub11.draggingComponent = true;
			}
			final int x = Normal.aClass189_161.verticalScrollPosition + mouseX - Class120_Sub12_Sub7.anInt3183;
			final int y = Normal.aClass189_161.horizontalScrollPosition + mouseY - Class120_Sub12_Sub35.anInt3413;
			if (Class120_Sub12_Sub4.draggedComponent.onComponentDraggedListener != null && Class120_Sub11.draggingComponent) {
				final InterfaceListener interfaceListener = new InterfaceListener();
				interfaceListener.data2 = y;
				interfaceListener.jagexInterface = Class120_Sub12_Sub4.draggedComponent;
				interfaceListener.data1 = x;
				interfaceListener.objectData = Class120_Sub12_Sub4.draggedComponent.onComponentDraggedListener;
				Class88.executeScript(interfaceListener);
			}
			if (InterfaceChangeNode.lastMousePress == 0) {
				if (!Class120_Sub11.draggingComponent) {
					if (Class69.mouseButtons != 1 && !SpotAnimationNode.method1438(WallDecoration.menuOptionCount - 1) || WallDecoration.menuOptionCount <= 2) {
						if (WallDecoration.menuOptionCount > 0) {
							ChunkAtmosphere.method2508();
						}
					} else {
						Class120_Sub12_Sub28.determineMenuSize();
					}
				} else {
					if (Class120_Sub12_Sub4.draggedComponent.onComponentSwapListener != null) {
						final InterfaceListener interfaceListener = new InterfaceListener();
						interfaceListener.draggedOnComponent = LocType.draggedOnComponent;
						interfaceListener.jagexInterface = Class120_Sub12_Sub4.draggedComponent;
						interfaceListener.data1 = x;
						interfaceListener.data2 = y;
						interfaceListener.objectData = Class120_Sub12_Sub4.draggedComponent.onComponentSwapListener;
						Class88.executeScript(interfaceListener);
					}
					if (LocType.draggedOnComponent != null && client.method58(Class120_Sub12_Sub4.draggedComponent) != null) {
						Class120_Sub12_Sub11.outputStream.putByteIsaac(0);
						Class120_Sub12_Sub11.outputStream.putLEInt(Class120_Sub12_Sub4.draggedComponent.bitPacked);
						Class120_Sub12_Sub11.outputStream.putInt2(LocType.draggedOnComponent.bitPacked);
						Class120_Sub12_Sub11.outputStream.putShortA(LocType.draggedOnComponent.componentIndex);
						Class120_Sub12_Sub11.outputStream.putLEShortA(Class120_Sub12_Sub4.draggedComponent.componentIndex);
					}
				}
				Class120_Sub12_Sub4.draggedComponent = null;
			}
		}
	}
}
