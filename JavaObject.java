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

	public static void method1433(final int i) {
		try {
			if (i == 0) {
				clickMaskCache = null;
				anIntArray3916 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("ei.F(").append(i).append(')').toString());
		}
	}

	static final int method1434(final js5 js5) {
		int i_1_ = 0;
		if (js5.method429(StructType.titlebgId)) {
			i_1_++;
		}
		if (js5.method429(Class108_Sub1.logoId)) {
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

	static final void method1435() {
		InterfaceClickMask.redrawInterface(Class120_Sub12_Sub4.aClass189_3156);
		SceneGroundObject.anInt2843++;
		if (!WorldInfo.aBoolean1419 || !Class111.aBoolean1058) {
			if (SceneGroundObject.anInt2843 > 1) {
				Class120_Sub12_Sub4.aClass189_3156 = null;
			}
		} else {
			int mouseX = Queue.lastMouseX;
			mouseX -= AbstractGraphicsBuffer.anInt1173;
			if (mouseX < Class120_Sub12_Sub7.anInt3183) {
				mouseX = Class120_Sub12_Sub7.anInt3183;
			}
			if (Class120_Sub12_Sub4.aClass189_3156.width + mouseX > Class26.aClass189_161.width + Class120_Sub12_Sub7.anInt3183) {
				mouseX = Class26.aClass189_161.width + Class120_Sub12_Sub7.anInt3183 - Class120_Sub12_Sub4.aClass189_3156.width;
			}
			int mouseY = Class191.lastMouseY;
			mouseY -= client.anInt2203;
			if (Class120_Sub12_Sub35.anInt3413 > mouseY) {
				mouseY = Class120_Sub12_Sub35.anInt3413;
			}
			final int i_4_ = mouseX - Class120_Sub12_Sub17.anInt3264;
			if (Class120_Sub12_Sub4.aClass189_3156.height + mouseY > Class120_Sub12_Sub35.anInt3413 - -Class26.aClass189_161.height) {
				mouseY = Class120_Sub12_Sub35.anInt3413 - -Class26.aClass189_161.height + -Class120_Sub12_Sub4.aClass189_3156.height;
			}
			final int i_5_ = mouseY - Class9.anInt77;
			final int i_6_ = Class120_Sub12_Sub4.aClass189_3156.anInt1962;
			if (SceneGroundObject.anInt2843 > Class120_Sub12_Sub4.aClass189_3156.anInt2066 && (i_4_ > i_6_ || i_4_ < -i_6_ || i_5_ > i_6_ || i_5_ < -i_6_)) {
				Class120_Sub11.aBoolean2551 = true;
			}
			final int i_7_ = Class26.aClass189_161.verticalScrollPosition + mouseX - Class120_Sub12_Sub7.anInt3183;
			final int i_8_ = -Class120_Sub12_Sub35.anInt3413 + mouseY + Class26.aClass189_161.horizontalScrollPosition;
			if (Class120_Sub12_Sub4.aClass189_3156.anObjectArray1959 != null && Class120_Sub11.aBoolean2551) {
				final InterfaceListener class120_sub10 = new InterfaceListener();
				class120_sub10.anInt2540 = i_8_;
				class120_sub10.aClass189_2534 = Class120_Sub12_Sub4.aClass189_3156;
				class120_sub10.anInt2543 = i_7_;
				class120_sub10.objectData = Class120_Sub12_Sub4.aClass189_3156.anObjectArray1959;
				Class88.method744(true, class120_sub10);
			}
			if (InterfaceChangeNode.lastMousePress == 0) {
				if (!Class120_Sub11.aBoolean2551) {
					if (Class69.mouseButtons != 1 && !Class120_Sub14_Sub4.method1438(Class186.menuOptionCount - 1) || Class186.menuOptionCount <= 2) {
						if (Class186.menuOptionCount > 0) {
							Class191.method2508();
						}
					} else {
						Class120_Sub12_Sub28.determineMenuSize();
					}
				} else {
					if (Class120_Sub12_Sub4.aClass189_3156.anObjectArray1947 != null) {
						final InterfaceListener class120_sub10 = new InterfaceListener();
						class120_sub10.aClass189_2532 = LocType.aClass189_1818;
						class120_sub10.aClass189_2534 = Class120_Sub12_Sub4.aClass189_3156;
						class120_sub10.anInt2543 = i_7_;
						class120_sub10.anInt2540 = i_8_;
						class120_sub10.objectData = Class120_Sub12_Sub4.aClass189_3156.anObjectArray1947;
						Class88.method744(true, class120_sub10);
					}
					if (LocType.aClass189_1818 != null && client.method58(Class120_Sub12_Sub4.aClass189_3156) != null) {
						Class120_Sub12_Sub11.outputStream.putByteIsaac(0);
						Class120_Sub12_Sub11.outputStream.putLEInt(Class120_Sub12_Sub4.aClass189_3156.bitPacked);
						Class120_Sub12_Sub11.outputStream.putInt2(LocType.aClass189_1818.bitPacked);
						Class120_Sub12_Sub11.outputStream.putShortA(LocType.aClass189_1818.componentIndex);
						Class120_Sub12_Sub11.outputStream.putLEShortA(Class120_Sub12_Sub4.aClass189_3156.componentIndex);
					}
				}
				Class120_Sub12_Sub4.aClass189_3156 = null;
			}
		}
	}
}
