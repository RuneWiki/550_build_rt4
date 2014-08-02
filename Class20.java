/* Class20 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.FontMetrics;

import javax.media.opengl.GL;

final class Class20 implements ShaderInterface {
	static long selfNameAsLong;
	static js5 aClass50_2169;
	private float[] aFloatArray2170 = new float[4];
	static FontMetrics loadingFontMetrics;
	private int anInt2172;
	static long aLong2173 = 0L;
	static int anInt2174 = -1;

	@Override
	public final void method3() {
		try {
			final GL gl = HDToolkit.gl;
			gl.glCallList(anInt2172);
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, "bo.B()");
		}
	}

	@Override
	public final int method4() {
		int i;
		try {
			i = 0;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, "bo.C()");
		}
		return i;
	}

	@Override
	public final void method2() {
		try {
			final GL gl = HDToolkit.gl;
			gl.glCallList(anInt2172 - -1);
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, "bo.A()");
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
			gl.glTranslatef(-Projectile.anInt2955, -Class120_Sub12_Sub27.anInt3353, -Class69_Sub1.anInt2229);
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
			throw EnumType.method1428(runtimeexception, new StringBuilder("bo.D(").append(i).append(')').toString());
		}
	}

	static final int method178(final Npc npc) {
		NpcType npcType = npc.npcType;
		if (npcType.childrenIDs != null) {
			npcType = npcType.handleVarp();
			if (npcType == null) {
				return -1;
			}
		}
		int i_6_ = npcType.anInt1682;
		final Class29 class29 = npc.method2336();
		if (npc.anInt3004 == class29.anInt218) {
			i_6_ = npcType.anInt1681;
		} else if (npc.anInt3004 != class29.anInt190 && npc.anInt3004 != class29.anInt188 && npc.anInt3004 != class29.anInt216 && class29.anInt223 != npc.anInt3004) {
			if (npc.anInt3004 == class29.anInt212 || class29.anInt192 == npc.anInt3004 || class29.anInt219 == npc.anInt3004 || npc.anInt3004 == class29.anInt210) {
				i_6_ = npcType.anInt1657;
			}
		} else {
			i_6_ = npcType.anInt1676;
		}
		return i_6_;
	}

	static final int method179(final Player player) {
		int i_8_ = player.anInt3734;
		final Class29 class29 = player.method2336();
		if (player.anInt3004 != class29.anInt218) {
			if (class29.anInt190 == player.anInt3004 || player.anInt3004 == class29.anInt188 || class29.anInt216 == player.anInt3004 || player.anInt3004 == class29.anInt223) {
				i_8_ = player.anInt3742;
			} else if (class29.anInt212 == player.anInt3004 || player.anInt3004 == class29.anInt192 || player.anInt3004 == class29.anInt219 || class29.anInt210 == player.anInt3004) {
				i_8_ = player.anInt3736;
			}
		} else {
			i_8_ = player.anInt3740;
		}
		return i_8_;
	}

	static final void method180(final int i, final int i_9_) {
		final InterfaceChangeNode class120_sub14_sub7 = AbstractObject.putInterfaceChange(1, i);
		class120_sub14_sub7.method1454();
		class120_sub14_sub7.anInt3484 = i_9_;
	}

	static final boolean runeSpritesCached(final js5 js5) {
		if (js5.method429(Class120_Sub14_Sub13.runesId)) {
			return true;
		}
		return false;
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
			throw EnumType.method1428(runtimeexception, new StringBuilder("bo.J(").append(bool).append(')').toString());
		}
	}

	public Class20() {
		method182(false);
	}

	public static void method183(final byte i) {
		try {
			aClass50_2169 = null;
			loadingFontMetrics = null;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("bo.E(").append(i).append(')').toString());
		}
	}
}
