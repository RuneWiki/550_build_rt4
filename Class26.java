/* Class26 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;

final class Class26 {
	int anInt155;
	int anInt156;
	int anInt157;
	static NodeCache aClass35_158 = new NodeCache(64);
	static PlayerAppearance aClass144_159 = new PlayerAppearance();
	int anInt160;
	static JagexInterface aClass189_161 = null;
	static int anInt162 = 0;
	static Class90 aClass90_163;

	static final AbstractSprite constructAbstractSprite(final js5 js5, final int groupId) {
		if (!ObjType.decodedSprites(js5, groupId)) {
			return null;
		}
		return Class42.constructAbstractSprite();
	}

	static final boolean method230(final int i, final int i_1_, final int i_2_, final int i_3_, final SceneGraphNode sceneGraphNode, final int i_4_, final long l, final int i_5_, final int i_6_, final int i_7_, final int i_8_) {
		if (sceneGraphNode == null) {
			return true;
		}
		return ClanMember.method1403(i, i_5_, i_6_, i_7_ - i_5_ + 1, i_8_ - i_6_ + 1, i_1_, i_2_, i_3_, sceneGraphNode, i_4_, true, l);
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

	static final void handleMouse() {
		synchronized (SpotAnimationNode.mouseHandler) {
			Class136.mouseIdleCycle++;
			InterfaceChangeNode.lastMousePress = Class42.currentMousePress;
			Queue.lastMouseX = GrandExchangeObject.currentMouseX;
			Class191.lastMouseY = Class120_Sub12_Sub27.currentMouseY;
			Class156.lastMouseClick = GroundObjectNode.currentMouseClick;
			js5.lastClickX = Class192.currentClickX;
			Class120_Sub12_Sub36.lastClickY = EmitterType.currentClickY;
			Class120_Sub12_Sub2.lastClickTime = WallDecoration.currentClickTime;
			GroundObjectNode.currentMouseClick = 0;
		}
	}

	public Class26() {
		/* empty */
	}

	static final void removeKeyboard(final Component component) {
		component.removeKeyListener(Class169.keyboardHandler);
		component.removeFocusListener(Class169.keyboardHandler);
		AnimatedLocation.anInt3074 = -1;
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
