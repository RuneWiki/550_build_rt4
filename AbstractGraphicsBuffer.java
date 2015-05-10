/* Class122 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;

abstract class AbstractGraphicsBuffer {
	static int[] anIntArray1156;
	static int anInt1157;
	static int[] anIntArray1158;
	static int[] anIntArray1159;
	static int[] anIntArray1161;
	static int[] anIntArray1162;
	static int[] anIntArray1163;
	static int gameLoopLength;
	Image image;
	static int maxTextOnScreen = 50;
	static String[] aStringArray1167;
	int[] pixels;
	int height;
	int width;
	static int[] anIntArray1171;
	static double aDouble1172;
	static int clickedComponentX;
	static int anInt1174;
	static int mapbackState;
	
	static {
		anIntArray1158 = new int[maxTextOnScreen];
		anInt1157 = -1;
		anIntArray1162 = new int[maxTextOnScreen];
		anIntArray1159 = new int[maxTextOnScreen];
		anIntArray1161 = new int[maxTextOnScreen];
		aStringArray1167 = new String[maxTextOnScreen];
		anIntArray1163 = new int[maxTextOnScreen];
		anIntArray1171 = new int[maxTextOnScreen];
		anIntArray1156 = new int[maxTextOnScreen];
		ParamType.recentUse = new NodeCache(64);
		aDouble1172 = -1.0;
		clickedComponentX = 0;
		mapbackState = 0;
	}

	static final Class120_Sub9 method1840(final Hashtable hashtable, final OverlayType class124) {
		final long l = ((long) class124.anInt1194 << 56) - -((long) class124.anInt1200 << 32) + class124.anInt1202 + (1 + class124.textureId << 16);
		Class120_Sub9 class120_sub9_0_ = (Class120_Sub9) hashtable.get(l);
		if (class120_sub9_0_ == null) {
			class120_sub9_0_ = new Class120_Sub9(class124.textureId, class124.anInt1202, true, false, class124.anInt1200);
			hashtable.put(class120_sub9_0_, l);
		}
		return class120_sub9_0_;
	}

	abstract void drawImage(Graphics graphics, int x, int y);

	static final void method1842() {
		mapbackState = 0;
		SceneGroundObject.packetSetFlagPosition = false;
		Class65.flagY = 0;
		Class120_Sub12_Sub15.landscapeSpriteLevel = -1;
		Class120_Sub12_Sub26.flagX = 0;
		client.flagCounter = (byte) 0;
	}

	abstract void drawClippedImage(Graphics graphics, int x, int y, int w, int h);

	static final void method1844(int i, int i_7_, int i_8_, final int i_9_, int i_10_) {
		if (IdentityKit.anInt1334 >= i_8_ && Class120_Sub30_Sub2.anInt3699 <= i_7_) {
			boolean bool;
			if (MagnetType.anInt260 > i_10_) {
				i_10_ = MagnetType.anInt260;
				bool = false;
			} else if (i_10_ > ParamType.anInt3544) {
				i_10_ = ParamType.anInt3544;
				bool = false;
			} else {
				bool = true;
			}
			boolean bool_11_;
			if (i < MagnetType.anInt260) {
				i = MagnetType.anInt260;
				bool_11_ = false;
			} else if (ParamType.anInt3544 < i) {
				i = ParamType.anInt3544;
				bool_11_ = false;
			} else {
				bool_11_ = true;
			}
			if (Class120_Sub30_Sub2.anInt3699 <= i_8_) {
				AmbientSound.fillArray(GameEntity.anIntArrayArray3009[i_8_++], i_9_, i_10_, i);
			} else {
				i_8_ = Class120_Sub30_Sub2.anInt3699;
			}
			if (IdentityKit.anInt1334 < i_7_) {
				i_7_ = IdentityKit.anInt1334;
			} else {
				AmbientSound.fillArray(GameEntity.anIntArrayArray3009[i_7_--], i_9_, i_10_, i);
			}
			if (bool && bool_11_) {
				for (int i_12_ = i_8_; i_12_ <= i_7_; i_12_++) {
					final int[] is = GameEntity.anIntArrayArray3009[i_12_];
					is[i_10_] = is[i] = i_9_;
				}
			} else if (!bool) {
				if (bool_11_) {
					for (int i_13_ = i_8_; i_13_ <= i_7_; i_13_++) {
						GameEntity.anIntArrayArray3009[i_13_][i] = i_9_;
					}
				}
			} else {
				for (int i_14_ = i_8_; i_14_ <= i_7_; i_14_++) {
					GameEntity.anIntArrayArray3009[i_14_][i_10_] = i_9_;
				}
			}
		}
	}

	abstract void init(Component component, int width, int height);

	static final void animateInterface(final int id) {
		if (js5.loadInterface(id)) {
			IdentityKit.animateInterfaces(Node.interfaceCache[id], -1);
		}
	}

	final void init2dCanvas() {
		GraphicsLD.init2dCanvas(this.pixels, this.width, this.height);
	}

	protected AbstractGraphicsBuffer() {
		/* empty */
	}
}
