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
	static int anInt1166 = 50;
	static String[] aStringArray1167;
	int[] pixels;
	int height;
	int width;
	static int[] anIntArray1171;
	static double aDouble1172;
	static int anInt1173;
	static int anInt1174;
	static int anInt1175;
	static String aString1176;

	static {
		anIntArray1158 = new int[anInt1166];
		anInt1157 = -1;
		anIntArray1162 = new int[anInt1166];
		anIntArray1159 = new int[anInt1166];
		anIntArray1161 = new int[anInt1166];
		aStringArray1167 = new String[anInt1166];
		anIntArray1163 = new int[anInt1166];
		anIntArray1171 = new int[anInt1166];
		anIntArray1156 = new int[anInt1166];
		ParamType.recentUse = new Class35(64);
		aDouble1172 = -1.0;
		anInt1173 = 0;
		anInt1175 = 0;
		aString1176 = "Use";
	}

	static final Class120_Sub9 method1840(final Hashtable hashtable, final Class124 class124, final byte i) {
		Class120_Sub9 class120_sub9;
		try {
			final long l = ((long) class124.anInt1194 << 56) - -((long) class124.anInt1200 << 32) + class124.anInt1202 + (1 + class124.anInt1203 << 16);
			if (i < 86) {
				return null;
			}
			Class120_Sub9 class120_sub9_0_ = (Class120_Sub9) hashtable.get(l);
			if (class120_sub9_0_ == null) {
				class120_sub9_0_ = new Class120_Sub9(class124.anInt1203, class124.anInt1202, true, false, class124.anInt1200);
				hashtable.put(class120_sub9_0_, l);
			}
			class120_sub9 = class120_sub9_0_;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("ob.B(").append(hashtable != null ? "{...}" : "null").append(',').append(class124 != null ? "{...}" : "null").append(',').append(i).append(')').toString());
		}
		return class120_sub9;
	}

	abstract void drawImage(Graphics graphics, int x, int y);

	static final void method1842(final int i) {
		try {
			anInt1175 = 0;
			SceneGroundObject.packetSetFlagPosition = false;
			Class65.flagY = 0;
			Class120_Sub12_Sub15.anInt3243 = -1;
			Class120_Sub12_Sub26.flagX = 0;
			if (i != 50) {
				ParamType.recentUse = null;
			}
			client.aByte2201 = (byte) 0;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("ob.E(").append(i).append(')').toString());
		}
	}

	abstract void drawClippedImage(Graphics graphics, int x, int i, int i_3_, int y);

	static final void method1844(int i, final byte i_6_, int i_7_, int i_8_, final int i_9_, int i_10_) {
		try {
			if (IdentityKit.anInt1334 >= i_8_ && Class120_Sub30_Sub2.anInt3699 <= i_7_) {
				boolean bool;
				if (Class32.anInt260 > i_10_) {
					i_10_ = Class32.anInt260;
					bool = false;
				} else if (i_10_ > ParamType.anInt3544) {
					i_10_ = ParamType.anInt3544;
					bool = false;
				} else {
					bool = true;
				}
				boolean bool_11_;
				if (i < Class32.anInt260) {
					i = Class32.anInt260;
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
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("ob.C(").append(i).append(',').append(i_6_).append(',').append(i_7_).append(',').append(i_8_).append(',').append(i_9_).append(',').append(i_10_).append(')').toString());
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

	public static void method1848(final int i) {
		try {
			anIntArray1171 = null;
			aStringArray1167 = null;
			ParamType.recentUse = null;
			if (i == 84167136) {
				aString1176 = null;
				anIntArray1158 = null;
				anIntArray1156 = null;
				anIntArray1162 = null;
				anIntArray1161 = null;
				anIntArray1159 = null;
				anIntArray1163 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("ob.H(").append(i).append(')').toString());
		}
	}

	protected AbstractGraphicsBuffer() {
		/* empty */
	}
}
