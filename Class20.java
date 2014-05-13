/* Class20 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.FontMetrics;

import javax.media.opengl.GL;

final class Class20 implements ShaderInterface {
	static long aLong2168;
	static Class50 aClass50_2169;
	private float[] aFloatArray2170 = new float[4];
	static FontMetrics aFontMetrics2171;
	private int anInt2172;
	static long aLong2173 = 0L;
	static int anInt2174 = -1;

	@Override
	public final void method3() {
		try {
			final GL gl = HDToolkit.gl;
			gl.glCallList(anInt2172);
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, "bo.B()");
		}
	}

	@Override
	public final int method4() {
		int i;
		try {
			i = 0;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, "bo.C()");
		}
		return i;
	}

	static final int method176(final boolean bool) {
		int i;
		try {
			if (bool) {
				return -118;
			}
			i = 2;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("bo.H(").append(bool).append(')').toString());
		}
		return i;
	}

	static final int method177(final int i, final int i_0_) {
		int i_1_;
		try {
			if (i != 522353736) {
				method178((byte) -20, null);
			}
			i_1_ = i_0_ >>> 8;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("bo.F(").append(i).append(',').append(i_0_).append(')').toString());
		}
		return i_1_;
	}

	@Override
	public final void method2() {
		try {
			final GL gl = HDToolkit.gl;
			gl.glCallList(anInt2172 - -1);
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, "bo.A()");
		}
	}

	@Override
	public final void method5(final int i) {
		try {
			final GL gl = HDToolkit.gl;
			final float f = -0.01F * (1 + (i & 0x3));
			final float f_2_ = ((0x3 & i >> 3) + 1) * 0.01F;
			final boolean bool = (0x80 & i) != 0;
			final float f_3_ = (i & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
			if (!bool) {
				aFloatArray2170[0] = 0.0F;
				aFloatArray2170[1] = 0.0F;
				aFloatArray2170[3] = 0.0F;
				aFloatArray2170[2] = f_3_;
			} else {
				aFloatArray2170[0] = f_3_;
				aFloatArray2170[1] = 0.0F;
				aFloatArray2170[2] = 0.0F;
				aFloatArray2170[3] = 0.0F;
			}
			gl.glActiveTexture(33985);
			gl.glMatrixMode(5888);
			gl.glPushMatrix();
			gl.glLoadIdentity();
			gl.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
			gl.glRotatef(Class120_Sub14_Sub13.anInt3571 * 360.0F / 2048.0F, 1.0F, 0.0F, 0.0F);
			gl.glRotatef(Class145.anInt1382 * 360.0F / 2048.0F, 0.0F, 1.0F, 0.0F);
			gl.glTranslatef(-Class180_Sub4.anInt2955, -Class120_Sub12_Sub27.anInt3353, -Class69_Sub1.anInt2229);
			gl.glTexGenfv(8192, 9474, aFloatArray2170, 0);
			aFloatArray2170[1] = f_3_;
			aFloatArray2170[0] = 0.0F;
			aFloatArray2170[2] = 0.0F;
			aFloatArray2170[3] = HDToolkit.anInt542 * f;
			gl.glTexGenfv(8193, 9474, aFloatArray2170, 0);
			gl.glPopMatrix();
			if (Class78.aBoolean685) {
				aFloatArray2170[2] = 0.0F;
				aFloatArray2170[3] = f_2_ * HDToolkit.anInt542;
				aFloatArray2170[1] = 0.0F;
				aFloatArray2170[0] = 0.0F;
				gl.glTexGenfv(8194, 9473, aFloatArray2170, 0);
			} else {
				final int i_4_ = (int) (64.0F * (HDToolkit.anInt542 * f_2_));
				gl.glBindTexture(3553, Class78.anIntArray687[i_4_ % 64]);
			}
			gl.glActiveTexture(33984);
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("bo.D(").append(i).append(')').toString());
		}
	}

	static final int method178(final byte i, final Npc class180_sub5_sub2) {
		int i_5_;
		try {
			NpcType npcType = class180_sub5_sub2.npcType;
			if (npcType.childrenIDs != null) {
				npcType = npcType.handleVarp();
				if (npcType == null) {
					return -1;
				}
			}
			if (i != -54) {
				method179(null, (byte) 123);
			}
			int i_6_ = npcType.anInt1682;
			final Class29 class29 = class180_sub5_sub2.method2336((byte) 111);
			if (class180_sub5_sub2.anInt3004 == class29.anInt218) {
				i_6_ = npcType.anInt1681;
			} else if (class180_sub5_sub2.anInt3004 != class29.anInt190 && class180_sub5_sub2.anInt3004 != class29.anInt188 && class180_sub5_sub2.anInt3004 != class29.anInt216 && class29.anInt223 != class180_sub5_sub2.anInt3004) {
				if (class180_sub5_sub2.anInt3004 == class29.anInt212 || class29.anInt192 == class180_sub5_sub2.anInt3004 || class29.anInt219 == class180_sub5_sub2.anInt3004 || class180_sub5_sub2.anInt3004 == class29.anInt210) {
					i_6_ = npcType.anInt1657;
				}
			} else {
				i_6_ = npcType.anInt1676;
			}
			i_5_ = i_6_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("bo.L(").append(i).append(',').append(class180_sub5_sub2 != null ? "{...}" : "null").append(')').toString());
		}
		return i_5_;
	}

	static final int method179(final Player class180_sub5_sub1, final byte i) {
		int i_7_;
		try {
			int i_8_ = class180_sub5_sub1.anInt3734;
			final Class29 class29 = class180_sub5_sub1.method2336((byte) 91);
			if (class180_sub5_sub1.anInt3004 != class29.anInt218) {
				if (class29.anInt190 == class180_sub5_sub1.anInt3004 || class180_sub5_sub1.anInt3004 == class29.anInt188 || class29.anInt216 == class180_sub5_sub1.anInt3004 || class180_sub5_sub1.anInt3004 == class29.anInt223) {
					i_8_ = class180_sub5_sub1.anInt3742;
				} else if (class29.anInt212 == class180_sub5_sub1.anInt3004 || class180_sub5_sub1.anInt3004 == class29.anInt192 || class180_sub5_sub1.anInt3004 == class29.anInt219 || class29.anInt210 == class180_sub5_sub1.anInt3004) {
					i_8_ = class180_sub5_sub1.anInt3736;
				}
			} else {
				i_8_ = class180_sub5_sub1.anInt3740;
			}
			if (i > -64) {
				return 44;
			}
			i_7_ = i_8_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("bo.I(").append(class180_sub5_sub1 != null ? "{...}" : "null").append(',').append(i).append(')').toString());
		}
		return i_7_;
	}

	static final void method180(final int i, final int i_9_, final int i_10_) {
		final InterfaceChangeNode class120_sub14_sub7 = AbstractObject.putInterfaceChange(1, i);
		class120_sub14_sub7.method1454((byte) -127);
		class120_sub14_sub7.anInt3484 = i_9_;
	}

	static final boolean method181(final int i, final Class50 class50) {
		boolean bool;
		try {
			if (i != 0) {
				aLong2168 = 28L;
			}
			if (class50.method429(Class120_Sub14_Sub13.anInt3561, i ^ 0x46)) {
				return true;
			}
			bool = false;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("bo.G(").append(i).append(',').append(class50 != null ? "{...}" : "null").append(')').toString());
		}
		return bool;
	}

	private final void method182(final boolean bool) {
		try {
			final GL gl = HDToolkit.gl;
			anInt2172 = gl.glGenLists(2);
			gl.glNewList(anInt2172, 4864);
			gl.glActiveTexture(33985);
			if (!Class78.aBoolean685) {
				gl.glEnable(3553);
			} else {
				gl.glBindTexture(32879, Class78.anInt681);
				gl.glTexGeni(8194, 9472, 9217);
				gl.glEnable(3170);
				gl.glEnable(32879);
			}
			gl.glTexGeni(8192, 9472, 9216);
			gl.glTexGeni(8193, 9472, 9216);
			gl.glEnable(3168);
			gl.glEnable(3169);
			gl.glActiveTexture(33984);
			gl.glEndList();
			gl.glNewList(anInt2172 + 1, 4864);
			gl.glActiveTexture(33985);
			if (!Class78.aBoolean685) {
				gl.glDisable(3553);
			} else {
				gl.glDisable(32879);
				gl.glDisable(3170);
			}
			if (bool) {
				aFloatArray2170 = null;
			}
			gl.glDisable(3168);
			gl.glDisable(3169);
			gl.glActiveTexture(33984);
			gl.glEndList();
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("bo.J(").append(bool).append(')').toString());
		}
	}

	public Class20() {
		method182(false);
	}

	public static void method183(final byte i) {
		try {
			aClass50_2169 = null;
			aFontMetrics2171 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("bo.E(").append(i).append(')').toString());
		}
	}
}
