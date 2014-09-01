/* Class120_Sub14_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class MapFunctionNode extends NodeSub {
	static boolean aBoolean3471 = true;
	boolean focused = false;
	int id = -1;
	int level;
	int worldMapY;
	boolean aBoolean3476 = false;
	static byte[][][] aByteArrayArrayArray3477;
	int worldMapX;
	static int anInt3479 = 0;
	int x;
	int z;

	public static void method1439() {
		aByteArrayArrayArray3477 = null;
	}

	static final void setFlagPosition(final int i, final int i_0_, final int i_1_, final boolean bool, final int i_2_, final int i_3_, final int i_4_, final int i_5_, final int i_7_, final int i_8_) {
		if (TileParticleQueue.selfPlayer.getSize() == 2) {
			Class143.method2013(i_8_, i_2_, i_4_, i_5_, i, bool, i_3_, i_0_, i_1_, i_7_);
		} else if (TileParticleQueue.selfPlayer.getSize() > 2) {
			ParamType.method1518(i_5_, i_8_, i, i_2_, i_4_, i_7_, i_3_, i_1_, TileParticleQueue.selfPlayer.getSize(), i_0_, bool);
		} else {
			Class93.method775(bool, i_4_, i_8_, i_7_, i_0_, i_3_, i_5_, i, i_1_, i_2_);
		}
	}

	static final void method1441() {
		final int[] is = new int[Node.objCount];
		int i_9_ = 0;
		for (int id = 0; id < Node.objCount; id++) {
			final ObjType objType = ObjType.list(id);
			if (objType.anInt1546 >= 0 || objType.anInt1553 >= 0) {
				is[i_9_++] = id;
			}
		}
		KeyboardHandler.anIntArray1506 = new int[i_9_];
		for (int i_11_ = 0; i_9_ > i_11_; i_11_++) {
			KeyboardHandler.anIntArray1506[i_11_] = is[i_11_];
		}
	}

	static final int method1442(final int i_12_, int i_13_, final int i_14_) {
		if (i_14_ <= 243) {
			if (i_14_ > 217) {
				i_13_ >>= 3;
			} else if (i_14_ > 192) {
				i_13_ >>= 2;
			} else if (i_14_ > 179) {
				i_13_ >>= 1;
			}
		} else {
			i_13_ >>= 4;
		}
		return (i_14_ >> 1) + (i_13_ >> 5 << 7) + (i_12_ >> 2 << 10);
	}

	public MapFunctionNode() {
		/* empty */
	}
}
