/* Class120_Sub14_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class120_Sub14_Sub6 extends NodeSub {
	int anInt3482 = 0;

	private final void method1443(final Buffer class120_sub7, final int i, final int i_0_) {
		try {
			if (i_0_ == (i ^ 0xffffffff)) {
				this.anInt3482 = class120_sub7.getUShort();
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("fn.A(").append(class120_sub7 != null ? "{...}" : "null").append(',').append(i).append(',').append(i_0_).append(')').toString());
		}
	}

	static final void method1445() {
		if (AbstractGraphicsBuffer.anInt1157 != -1 && Class120_Sub12_Sub15.anInt3248 != -1) {
			final int i_3_ = ((Class120_Sub12_Sub6.anInt3176 + -JagexInterface.anInt2053) * Class32.anInt272 >> 16) + JagexInterface.anInt2053;
			final float[] fs = new float[3];
			Class32.anInt272 += i_3_;
			if (65535 > Class32.anInt272) {
				Class24.aBoolean139 = false;
				AbstractSprite.aBoolean3622 = false;
			} else {
				Class32.anInt272 = 65535;
				if (AbstractSprite.aBoolean3622) {
					Class24.aBoolean139 = false;
				} else {
					Class24.aBoolean139 = true;
				}
				AbstractSprite.aBoolean3622 = true;
			}
			final float f = Class32.anInt272 / 65535.0F;
			final int i_4_ = 2 * PlayerAppearance.anInt1372;
			for (int i_5_ = 0; i_5_ < 3; i_5_++) {
				final int i_6_ = 3 * Class143_Sub1.anIntArrayArrayArray2195[AbstractGraphicsBuffer.anInt1157][i_4_][i_5_];
				final int i_7_ = Class143_Sub1.anIntArrayArrayArray2195[AbstractGraphicsBuffer.anInt1157][1 + i_4_][i_5_] * 3;
				final int i_8_ = (-Class143_Sub1.anIntArrayArrayArray2195[AbstractGraphicsBuffer.anInt1157][i_4_ - -3][i_5_] + Class143_Sub1.anIntArrayArrayArray2195[AbstractGraphicsBuffer.anInt1157][2 + i_4_][i_5_] + Class143_Sub1.anIntArrayArrayArray2195[AbstractGraphicsBuffer.anInt1157][2 + i_4_][i_5_]) * 3;
				final int i_9_ = Class143_Sub1.anIntArrayArrayArray2195[AbstractGraphicsBuffer.anInt1157][i_4_][i_5_];
				final int i_10_ = i_7_ - i_6_;
				final int i_11_ = -(i_7_ * 2) + i_6_ - -i_8_;
				final int i_12_ = -i_8_ + Class143_Sub1.anIntArrayArrayArray2195[AbstractGraphicsBuffer.anInt1157][i_4_ + 2][i_5_] - i_9_ + i_7_;
				fs[i_5_] = i_9_ + (i_10_ + (i_11_ + i_12_ * f) * f) * f;
			}
			GroundObjectNode.renderZ = -(128 * Class181.currentBaseZ) + (int) fs[2];
			Class120_Sub12_Sub10.renderY = -1 * (int) fs[1];
			final float[] fs_13_ = new float[3];
			Class83.renderX = (int) fs[0] + -(128 * GameEntity.currentBaseX);
			final int i_14_ = 2 * Class9.anInt67;
			for (int i_15_ = 0; i_15_ < 3; i_15_++) {
				final int i_16_ = Class143_Sub1.anIntArrayArrayArray2195[Class120_Sub12_Sub15.anInt3248][i_14_][i_15_] * 3;
				final int i_17_ = Class143_Sub1.anIntArrayArrayArray2195[Class120_Sub12_Sub15.anInt3248][i_14_ - -1][i_15_] * 3;
				final int i_18_ = 3 * (Class143_Sub1.anIntArrayArrayArray2195[Class120_Sub12_Sub15.anInt3248][i_14_ - -2][i_15_] + Class143_Sub1.anIntArrayArrayArray2195[Class120_Sub12_Sub15.anInt3248][i_14_ + 2][i_15_] + -Class143_Sub1.anIntArrayArrayArray2195[Class120_Sub12_Sub15.anInt3248][3 + i_14_][i_15_]);
				final int i_19_ = Class143_Sub1.anIntArrayArrayArray2195[Class120_Sub12_Sub15.anInt3248][i_14_][i_15_];
				final int i_20_ = -i_16_ + i_17_;
				final int i_21_ = -i_18_ + i_17_ + Class143_Sub1.anIntArrayArrayArray2195[Class120_Sub12_Sub15.anInt3248][2 + i_14_][i_15_] + -i_19_;
				final int i_22_ = i_18_ + -(i_17_ * 2) + i_16_;
				fs_13_[i_15_] = f * ((f * i_21_ + i_22_) * f + i_20_) + i_19_;
			}
			final float f_23_ = -fs[0] + fs_13_[0];
			final float f_24_ = fs_13_[2] - fs[2];
			final float f_25_ = (fs_13_[1] - fs[1]) * -1.0F;
			final double d = Math.sqrt(f_23_ * f_23_ + f_24_ * f_24_);
			Class120_Sub30_Sub1.aFloat3674 = (float) Math.atan2(f_25_, d);
			Class193.aFloat2139 = -(float) Math.atan2(f_23_, f_24_);
			Class180_Sub3.renderYaw = 0x7ff & (int) (Class193.aFloat2139 * 325.949);
			Class128.renderPitch = 0x7ff & (int) (325.949 * Class120_Sub30_Sub1.aFloat3674);
		}
	}

	static final void addMenuOption(final long l, final int i, final int i_26_, final String string, final String string_27_, final short i_28_, final int i_29_) {
		if (!Class15.menuOpen && Class186.menuOptionCount < 500) {//TODO refactor menu options
			Class120_Sub12_Sub33.menuOptionName[Class186.menuOptionCount] = string_27_;
			Class120_Sub12_Sub29.aStringArray3369[Class186.menuOptionCount] = string;
			InterfaceChangeNode.menuOptionsCursorId[Class186.menuOptionCount] = i_29_ == -1 ? Class192.anInt2123 : i_29_;
			Class120_Sub29.aShortArray2777[Class186.menuOptionCount] = i_28_;
			Class120_Sub12.aLongArray2562[Class186.menuOptionCount] = l;
			Class120_Sub12_Sub7.anIntArray3182[Class186.menuOptionCount] = i;
			Class120_Sub29.anIntArray2769[Class186.menuOptionCount] = i_26_;
			Class186.menuOptionCount++;
		}
	}

	static final void method1447(final boolean bool) {
		try {
			int i = 0;
			if (bool) {
				method1447(false);
			}
			for (int i_31_ = 0; i_31_ < 104; i_31_++) {
				for (int i_32_ = 0; i_32_ < 104; i_32_++) {
					if (Class120_Sub3.method1055(i, i_31_, false, true, i_32_, Class120_Sub1.groundTiles)) {
						i++;
					}
					if (i >= 512) {
						return;
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("fn.B(").append(bool).append(')').toString());
		}
	}

	final void method1448(final int i, final Buffer class120_sub7) {
		try {
			if (i == 0) {
				for (;;) {
					final int i_33_ = class120_sub7.getUByte();
					if (i_33_ == 0) {
						break;
					}
					method1443(class120_sub7, i_33_, -3);
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("fn.D(").append(i).append(',').append(class120_sub7 != null ? "{...}" : "null").append(')').toString());
		}
	}

	public Class120_Sub14_Sub6() {
		/* empty */
	}
}
