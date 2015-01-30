/* Class158 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class ModelParticle {
	static int anInt1475 = -1;
	int anInt1476;
	static boolean aBoolean1478 = false;
	static int anInt1479;
	ParticleType particleType;
	static int mapSceneRedColorModifier;
	static long aLong1482;
	static String aString1483 = "cyan:";
	int anInt1484;
	int anInt1485;

	static {
		aLong1482 = 0L;
	}

	static final void method2090(final int i, final int i_0_, final int i_1_, final int i_2_, final int i_3_, final int i_4_) {
		if (i < Class32.anInt260 || ParamType.anInt3544 < i_4_ || i_1_ < Class120_Sub30_Sub2.anInt3699 || IdentityKit.anInt1334 < i_3_) {
			if (i_2_ == 1) {
				AbstractGraphicsBuffer.method1844(i_4_, (byte) -83, i_3_, i_1_, i_0_, i);
			} else {
				Class120_Sub12_Sub28.method1347(i_4_, i_0_, i_2_, i, (byte) -9, i_1_, i_3_);
			}
		} else if (i_2_ == 1) {
			Class120_Sub12_Sub21.method1308(-1, i_0_, i, i_4_, i_1_, i_3_);
		} else {
			Class120_Sub12_Sub7.method1231(0, i_0_, i, i_3_, i_4_, i_2_, i_1_);
		}
	}

	public static void method2091() {
		aString1483 = null;
	}

	ModelParticle(final int particleId, final int i_5_, final int i_6_, final int i_7_) {
		final ParticleType particleType = ParticleType.list(particleId);
		this.anInt1476 = i_7_;
		this.anInt1484 = i_6_;
		this.anInt1485 = i_5_;
		if (!HDToolkit.glEnabled && particleType.lowDetailsParticleSubId != -1) {
			this.particleType = ParticleType.list(particleType.lowDetailsParticleSubId);
		} else {
			this.particleType = particleType;
		}
	}

	ModelParticle(final ParticleType particleType, final int i, final int i_8_, final int i_9_) {
		this.anInt1485 = i;
		this.particleType = particleType;
		this.anInt1476 = i_9_;
		this.anInt1484 = i_8_;
	}
}
