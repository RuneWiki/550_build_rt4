/* Class183 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class ObjectPile {
	int renderX;
	static short[] aShortArray1804;
	static int friendsServerStatus = 0;
	long bitPacked;
	SceneGraphNode thirdItemModel;
	static int anInt1808;
	static Decimator aClass172_1809;
	SceneGraphNode mainItemModel;
	int yLocationModifier;
	SceneGraphNode secondItemModel;
	int renderY;
	int renderZ;

	static {
		aShortArray1804 = new short[] { 6798, 8741, 25238, 4626, 4550 };
	}

	static final void method2447(final byte i, int i_0_, final int i_1_) {
		try {
			if (i <= 75) {
				method2447((byte) 54, -28, 119);
			}
			i_0_ = i_0_ * RuntimeException_Sub1.anInt2142 >> 8;
			if (i_1_ == -1 && !Class120_Sub12_Sub15.aBoolean3247) {
				Class188.method2481(104);
			} else if (i_1_ != -1 && (Class157.anInt1466 != i_1_ || !World.method2193(113)) && i_0_ != 0 && !Class120_Sub12_Sub15.aBoolean3247) {
				Class120_Sub15.method1654(0, Class120_Sub12_Sub36.aClass50_3419, 2, (byte) -127, i_0_, i_1_, false);
			}
			Class157.anInt1466 = i_1_;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("vf.A(").append(i).append(',').append(i_0_).append(',').append(i_1_).append(')').toString());
		}
	}

	static final byte[] method2448(final byte[] is) {
		final int i_3_ = is.length;
		final byte[] is_4_ = new byte[i_3_];
		ArrayUtils.arrayCopy(is, 0, is_4_, 0, i_3_);
		return is_4_;
	}

	public static void method2449(final byte i) {
		try {
			if (i != -91) {
				aClass172_1809 = null;
			}
			aClass172_1809 = null;
			aShortArray1804 = null;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("vf.C(").append(i).append(')').toString());
		}
	}

	public ObjectPile() {
		/* empty */
	}
}
