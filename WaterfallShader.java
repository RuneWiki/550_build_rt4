/* Class20 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.FontMetrics;

import javax.media.opengl.GL;

final class WaterfallShader implements ShaderInterface {
	static long selfNameAsLong;
	static js5 aClass50_2169;
	private float[] aFloatArray2170 = new float[4];
	static FontMetrics loadingFontMetrics;
	private int listId;
	static long aLong2173 = 0L;
	static int anInt2174 = -1;

	@Override
	public final void method3() {
		final GL gl = HDToolkit.gl;
		gl.glCallList(listId);
	}

	@Override
	public final int method4() {
		return 0;
	}

	@Override
	public final void method2() {
		final GL gl = HDToolkit.gl;
		gl.glCallList(listId + 1);
	}

	@Override
	public final void method5(final int i) {
		final GL gl = HDToolkit.gl;
		float f = -0.01F * (1 + (i & 0x3));
		float f_2_ = ((0x3 & i >> 3) + 1) * 0.01F;
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
		gl.glRotatef(Class120_Sub14_Sub13.renderPitchWrapper * 360.0F / 2048.0F, 1.0F, 0.0F, 0.0F);
		gl.glRotatef(Class145.renderYawWrapper * 360.0F / 2048.0F, 0.0F, 1.0F, 0.0F);
		gl.glTranslatef(-Projectile.renderXWrapper, -Class120_Sub12_Sub27.renderYWrapper, -Class69_Sub1.renderZWrapper);
		gl.glTexGenfv(8192, 9474, aFloatArray2170, 0);
		aFloatArray2170[1] = f_3_;
		aFloatArray2170[0] = 0.0F;
		aFloatArray2170[2] = 0.0F;
		aFloatArray2170[3] = HDToolkit.loopCycleWrapper * f;
		gl.glTexGenfv(8193, 9474, aFloatArray2170, 0);
		gl.glPopMatrix();
		if (Class78.allows3DTextureMapping) {
			aFloatArray2170[2] = 0.0F;
			aFloatArray2170[3] = f_2_ * HDToolkit.loopCycleWrapper;
			aFloatArray2170[1] = 0.0F;
			aFloatArray2170[0] = 0.0F;
			gl.glTexGenfv(8194, 9473, aFloatArray2170, 0);
		} else {
			final int i_4_ = (int) (64.0F * (HDToolkit.loopCycleWrapper * f_2_));
			gl.glBindTexture(3553, Class78.anIntArray687[i_4_ % 64]);
		}
		gl.glActiveTexture(33984);
	}

	static final int method178(final Npc npc) {
		NpcType npcType = npc.npcType;
		if (npcType.transmogrificationIds != null) {
			npcType = npcType.handleVarp();
			if (npcType == null) {
				return -1;
			}
		}
		int i_6_ = npcType.anInt1682;
		final EntityRenderData class29 = npc.getEntityRenderData();
		if (npc.idleAnimId == class29.idleAnimationId) {
			i_6_ = npcType.anInt1681;
		} else if (npc.idleAnimId != class29.runAnimationId && npc.idleAnimId != class29.runAnimationId2 && npc.idleAnimId != class29.runAnimationId4 && class29.runAnimationId3 != npc.idleAnimId) {
			if (npc.idleAnimId == class29.anInt212 || class29.anInt192 == npc.idleAnimId || class29.anInt219 == npc.idleAnimId || npc.idleAnimId == class29.anInt210) {
				i_6_ = npcType.anInt1657;
			}
		} else {
			i_6_ = npcType.anInt1676;
		}
		return i_6_;
	}

	static final int method179(final Player player) {
		int i_8_ = player.walkAmbientSoundId;
		final EntityRenderData entityRenderData = player.getEntityRenderData();
		if (player.idleAnimId == entityRenderData.idleAnimationId) {
			i_8_ = player.stopWalkAmbientSoundId;
		} else if (player.idleAnimId == entityRenderData.runAnimationId || player.idleAnimId == entityRenderData.runAnimationId2 || player.idleAnimId == entityRenderData.runAnimationId4 || player.idleAnimId == entityRenderData.runAnimationId3) {
			i_8_ = player.runAmbientSoundId;
		} else if (player.idleAnimId == entityRenderData.anInt212 || player.idleAnimId == entityRenderData.anInt192 || player.idleAnimId == entityRenderData.anInt219 || player.idleAnimId == entityRenderData.anInt210) {
			i_8_ = player.anInt3736;
		}
		return i_8_;
	}

	static final void method180(final int i, final int i_9_) {
		final InterfaceChangeNode class120_sub14_sub7 = InterfaceChangeNode.putInterfaceChange(1, i);
		class120_sub14_sub7.method1454();
		class120_sub14_sub7.anInt3484 = i_9_;
	}

	static final boolean runeSpritesCached(final js5 js5) {
		if (js5.groupExist(Class120_Sub14_Sub13.runesId)) {
			return true;
		}
		return false;
	}

	private final void method182(final boolean bool) {
		final GL gl = HDToolkit.gl;
		listId = gl.glGenLists(2);
		gl.glNewList(listId, 4864);//COMPILE
		gl.glActiveTexture(33985);//TEXTURE1
		if (Class78.allows3DTextureMapping) {
			gl.glBindTexture(32879, Class78.anInt681);//TEXTURE_3D
			gl.glTexGeni(8194, 9472, 9217);//R, TEXTURE_GEN_MODE, OBJECT_LINEAR
			gl.glEnable(3170);//TEXTURE_GEN_R
			gl.glEnable(32879);//TEXTURE_3D
		} else {
			gl.glEnable(3553);//TEXTURE_2D
		}
		gl.glTexGeni(8192, 9472, 9216);//S, TEXTURE_GEN_MODE, EYE_LINEAR
		gl.glTexGeni(8193, 9472, 9216);//T, TEXTURE_GEN_MODE, EYE_LINEAR
		gl.glEnable(3168);//TEXTURE_GEN_S
		gl.glEnable(3169);//TEXTURE_GEN_T
		gl.glActiveTexture(33984);//TEXTURE0
		gl.glEndList();
		gl.glNewList(listId + 1, 4864);//COMPILE
		gl.glActiveTexture(33985);//TEXTURE1
		if (Class78.allows3DTextureMapping) {
			gl.glDisable(32879);//TEXTURE_3D
			gl.glDisable(3170);//TEXTURE_GEN_R
		} else {
			gl.glDisable(3553);//TEXTURE_2D
		}
		if (bool) {
			aFloatArray2170 = null;
		}
		gl.glDisable(3168);//TEXTURE_GEN_S
		gl.glDisable(3169);//TEXTURE_GEN_T
		gl.glActiveTexture(33984);//TEXTURE0
		gl.glEndList();
	}

	public WaterfallShader() {
		method182(false);
	}
}
