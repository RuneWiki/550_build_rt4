/* Class26 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;

final class Normal {
	int y;
	int anInt156;
	int x;
	static NodeCache aClass35_158 = new NodeCache(64);
	static PlayerAppearance aClass144_159 = new PlayerAppearance();
	int z;
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

	public Normal() {
		/* empty */
	}

	static final void removeKeyboard(final Component component) {
		component.removeKeyListener(ModelParticleMagnet.keyboardHandler);
		component.removeFocusListener(ModelParticleMagnet.keyboardHandler);
		AnimatedLocation.anInt3074 = -1;
	}

	static final void removeKeyboardHandler() {
		if (ModelParticleMagnet.keyboardHandler != null) {
			synchronized (ModelParticleMagnet.keyboardHandler) {
				ModelParticleMagnet.keyboardHandler = null;
			}
		}
	}

	Normal(final Normal normal) {
		this.z = normal.z;
		this.anInt156 = normal.anInt156;
		this.x = normal.x;
		this.y = normal.y;
	}
}
