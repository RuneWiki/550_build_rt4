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

	static final void method2447(int i_0_, final int i_1_) {
		i_0_ = i_0_ * RuntimeException_Sub1.musicVolume >> 8;
		if (i_1_ == -1 && !Class120_Sub12_Sub15.aBoolean3247) {
			Class188.method2481();
		} else if (i_1_ != -1 && (Class157.anInt1466 != i_1_ || !World.method2193()) && i_0_ != 0 && !Class120_Sub12_Sub15.aBoolean3247) {
			Class120_Sub15.method1654(0, Class120_Sub12_Sub36.musicJs5, 2, i_0_, i_1_, false);
		}
		Class157.anInt1466 = i_1_;
	}

	static final byte[] copyBuffer(final byte[] src) {
		final int bufferLen = src.length;
		final byte[] dest = new byte[bufferLen];
		ArrayUtils.arrayCopy(src, 0, dest, 0, bufferLen);
		return dest;
	}

	public ObjectPile() {
		/* empty */
	}
}
