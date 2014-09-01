/* Class101 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

abstract class Class101 {
	int anInt959;
	int anInt960;
	static int anInt961;
	static float aFloat962;
	static String aString963 = null;
	int anInt964;
	static float aFloat965;
	static js5 aClass50_966;

	static final void method832(int i_0_, final int i_1_, final int i_2_) {
		i_0_ = RuntimeException_Sub1.anInt2142 * i_0_ >> 8;
		if (i_0_ != 0 && i_2_ != -1) {
			Class127.method1891(InterfaceListener.aClass50_2544, i_0_, 0, i_2_, false);
			Class120_Sub12_Sub15.aBoolean3247 = true;
		}
	}

	abstract void method833(int i, int i_3_);

	abstract void method834(int i_5_, int i_6_);

	static final void method835(final boolean bool) {
		AtmosphereManager.setLightingParams(Class9.anInt72, Class120_Sub12_Sub23.aFloat3306, AbstractBuffer.aFloat600, Class147.aFloat1395);
		AtmosphereManager.setFogValues(Deque.anInt1007, CollisionMap.anInt151, bool);
		AtmosphereManager.setLightingPosition(Class120_Sub30_Sub2.anInt3688, Queue.anInt1768, ProducingGraphicsBuffer.anInt2798);
		AtmosphereManager.applyLightingPosition();
		Class120_Sub2_Sub1.aFloat3112 = aFloat962;
		Class120_Sub12_Sub21.aClass120_Sub14_Sub9_3297 = Class3.aClass120_Sub14_Sub9_54;
		Class120_Sub2_Sub1.aFloat3106 = Class120_Sub12.aFloat2557;
		Class120_Sub2_Sub1.aFloat3111 = ParticleNode.aFloat1034;
	}

	static final void method836(final int i, int i_8_) {
		final VarBit varBit = VarBit.list(i);
		final int i_9_ = varBit.setting;
		final int i_10_ = varBit.startBit;
		final int i_11_ = varBit.endBit;
		int i_12_ = Class120_Sub14_Sub15.masklookup[i_11_ - i_10_];
		if (i_8_ < 0 || i_8_ > i_12_) {
			i_8_ = 0;
		}
		i_12_ <<= i_10_;
		Class140.putVarp(i_9_, i_8_ << i_10_ & i_12_ | Class2.permanentVariable[i_9_] & (i_12_ ^ 0xffffffff));
	}

	abstract void method837(int i, int i_13_);

	Class101(final int i, final int i_14_, final int i_15_) {
		this.anInt960 = i;
		this.anInt959 = i_15_;
		this.anInt964 = i_14_;
	}
}
