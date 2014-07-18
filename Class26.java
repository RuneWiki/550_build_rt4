/* Class26 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;

final class Class26 {
	int anInt155;
	int anInt156;
	int anInt157;
	static Class35 aClass35_158 = new Class35(64);
	static PlayerAppearance aClass144_159 = new PlayerAppearance();
	int anInt160;
	static JagexInterface aClass189_161 = null;
	static int anInt162 = 0;
	static Class90 aClass90_163;

	static final AbstractSprite method229(final int i, final int i_0_, final js5 js5) {
		AbstractSprite class120_sub14_sub19;
		try {
			if (!ObjType.method2113(js5, i_0_)) {
				return null;
			}
			if (i != -1) {
				method229(-124, -123, null);
			}
			class120_sub14_sub19 = Class42.method337((byte) 104);
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("ci.D(").append(i).append(',').append(i_0_).append(',').append(js5 != null ? "{...}" : "null").append(')').toString());
		}
		return class120_sub14_sub19;
	}

	static final boolean method230(final int i, final int i_1_, final int i_2_, final int i_3_, final SceneGraphNode sceneGraphNode, final int i_4_, final long l, final int i_5_, final int i_6_, final int i_7_, final int i_8_) {
		if (sceneGraphNode == null) {
			return true;
		}
		return Class120_Sub13.method1403(i, i_5_, i_6_, i_7_ - i_5_ + 1, i_8_ - i_6_ + 1, i_1_, i_2_, i_3_, sceneGraphNode, i_4_, true, l);
	}

	public static void method231(final byte i) {
		try {
			aClass35_158 = null;
			aClass189_161 = null;
			aClass90_163 = null;
			aClass144_159 = null;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("ci.C(").append(i).append(')').toString());
		}
	}

	static final void method232(final byte i, final int i_9_) {
		try {
			Class120_Sub14_Sub14_Sub2.aClass21_3937.method192(i_9_);
			Class132.aClass21_1255.method192(i_9_);
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("ci.G(").append(i).append(',').append(i_9_).append(')').toString());
		}
	}

	static final void handleMouse() {
		synchronized (Class120_Sub14_Sub4.mouseHandler) {
			Class136.mouseIdleCycle++;
			InterfaceChangeNode.lastMousePress = Class42.currentMousePress;
			Queue.lastMouseX = Class160.currentMouseX;
			Class191.lastMouseY = Class120_Sub12_Sub27.currentMouseY;
			Class156.lastMouseClick = GroundObjectNode.currentMouseClick;
			js5.lastClickX = Class192.currentClickX;
			Class120_Sub12_Sub36.lastClickY = Class80.currentClickY;
			Class120_Sub12_Sub2.lastClickTime = Class186.currentClickTime;
			GroundObjectNode.currentMouseClick = 0;
		}
	}

	public Class26() {
		/* empty */
	}

	static final void removeKeyboard(final Component component) {
		component.removeKeyListener(Class169.keyboardHandler);
		component.removeFocusListener(Class169.keyboardHandler);
		Class180_Sub6.anInt3074 = -1;
	}

	static final void removeKeyboardHandler() {
		if (Class169.keyboardHandler != null) {
			synchronized (Class169.keyboardHandler) {
				Class169.keyboardHandler = null;
			}
		}
	}

	Class26(final Class26 class26_10_) {
		this.anInt160 = class26_10_.anInt160;
		this.anInt156 = class26_10_.anInt156;
		this.anInt157 = class26_10_.anInt157;
		this.anInt155 = class26_10_.anInt155;
	}
}
