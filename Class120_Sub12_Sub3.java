/* Class120_Sub12_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class120_Sub12_Sub3 extends Class120_Sub12 {
	static int anInt3147;
	static int[] anIntArray3148 = { 8, 11, 4, 6, 9, 7, 10, 0 };
	private int anInt3149 = 4096;
	static Class164 aClass164_3150;
	static int anInt3151;
	private int anInt3152 = 4096;
	private int anInt3153 = 4096;

	static final MapFunctionNode method1206() {
		if (WorldMapHandler.aClass177_690 == null) {
			return null;
		}
		Class22.aClass127_130.method1896(WorldMapHandler.aClass177_690);
		final MapFunctionNode class120_sub14_sub5_0_ = (MapFunctionNode) Class22.aClass127_130.method1895();
		final MapFunctionType class73 = MapFunctionType.list(class120_sub14_sub5_0_.id);
		if (class73 != null && class73.aBoolean659 && class73.method647()) {
			return class120_sub14_sub5_0_;
		}
		return Class112.method992();
	}

	static int method1207(final int i, final int i_1_) {
		return i & i_1_;
	}

	@Override
	final void decode(final Buffer buffer, final int i_4_) {
		while_125_: do {
			do {
				if (i_4_ != 0) {
					if (i_4_ != 1) {
						if (i_4_ == 2) {
							break;
						}
						break while_125_;
					}
				} else {
					anInt3152 = buffer.getUShort();
					break while_125_;
				}
				anInt3149 = buffer.getUShort();
				break while_125_;
			} while (false);
			anInt3153 = buffer.getUShort();
		} while (false);
	}

	public Class120_Sub12_Sub3() {
		super(1, false);
	}

	static final AbstractIndexedSprite[] constructIndexedSprites(final js5 js5, final int i, final int i_8_) {
		if (!Class10.decodedSprites(js5, i, i_8_)) {
			return null;
		}
		return TileParticleQueue.constructIndexedSprites();
	}

	@Override
	final int[][] method1188(final int i) {
		final int[][] is_10_ = this.aClass109_2559.method975(i);
		if (this.aClass109_2559.aBoolean1049) {
			final int[][] is_11_ = method1179(0, i);
			final int[] is_12_ = is_11_[1];
			final int[] is_13_ = is_11_[0];
			final int[] is_14_ = is_10_[0];
			final int[] is_15_ = is_10_[1];
			final int[] is_16_ = is_11_[2];
			final int[] is_17_ = is_10_[2];
			for (int i_18_ = 0; Class120_Sub12_Sub7.anInt3178 > i_18_; i_18_++) {
				final int i_19_ = is_13_[i_18_];
				final int i_20_ = is_16_[i_18_];
				final int i_21_ = is_12_[i_18_];
				if (i_20_ == i_19_ && i_20_ == i_21_) {
					is_14_[i_18_] = anInt3152 * i_19_ >> 12;
					is_15_[i_18_] = i_20_ * anInt3149 >> 12;
					is_17_[i_18_] = anInt3153 * i_21_ >> 12;
				} else {
					is_14_[i_18_] = anInt3152;
					is_15_[i_18_] = anInt3149;
					is_17_[i_18_] = anInt3153;
				}
			}
		}
		return is_10_;
	}

	static final int method1210(int i_22_) {
		i_22_ = ((i_22_ & ~0x55555554) >>> 1) + (0x55555555 & i_22_);
		i_22_ = (0x33333333 & i_22_) - -(~0x4ccccccc & i_22_ >>> 2);
		i_22_ = 0xf0f0f0f & (i_22_ >>> 4) + i_22_;
		i_22_ += i_22_ >>> 8;
		i_22_ += i_22_ >>> 16;
		return i_22_ & 0xff;
	}
}
