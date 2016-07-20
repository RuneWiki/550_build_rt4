/* Class101 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class101 {
	int anInt959;
	int anInt960;
	static int anInt961;
	static float aFloat962;
	static String selectedSpellPrefix = null;
	int anInt964;
	static float aFloat965;
	
	static final void method832(int i_0_, final int i_1_, final int i_2_) {
		i_0_ = RuntimeException_Sub1.musicVolume * i_0_ >> 8;
		if (i_0_ != 0 && i_2_ != -1) {
			Class127.method1891(InterfaceListener.aClass50_2544, i_0_, 0, i_2_, false);
			Class120_Sub12_Sub15.aBoolean3247 = true;
		}
	}

	abstract void method833(int i, int i_3_);

	abstract void method834(int i_5_, int i_6_);

	static final void refreshAtmosphere(final boolean forceSetFog) {
		AtmosphereManager.setLightParams(Class9.currentLightColor, Class120_Sub12_Sub23.currentLightModelAmbient, AbstractBuffer.currentLight0Diffuse, client.currentLight1Diffuse);
		AtmosphereManager.setFogParams(Deque.currentFogColor, CollisionMap.currentFogOffset, forceSetFog);
		AtmosphereManager.setLightPosition(Class120_Sub30_Sub2.currentLightX, Queue.currentLightY, ProducingGraphicsBuffer.currentLightZ);
		AtmosphereManager.applyLightPosition();
		Class120_Sub2_Sub1.aFloat3112 = aFloat962;
		Class120_Sub12_Sub21.aClass120_Sub14_Sub9_3297 = Class3.aClass120_Sub14_Sub9_54;
		Class120_Sub2_Sub1.aFloat3106 = Class120_Sub12.aFloat2557;
		Class120_Sub2_Sub1.aFloat3111 = ParticleNode.aFloat1034;
	}

	abstract void method837(int i, int i_13_);

	Class101(final int i, final int i_14_, final int i_15_) {
		this.anInt960 = i;
		this.anInt959 = i_15_;
		this.anInt964 = i_14_;
	}
}
