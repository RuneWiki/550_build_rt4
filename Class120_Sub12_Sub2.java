/* Class120_Sub12_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class120_Sub12_Sub2 extends Class120_Sub12 {
	private int anInt3138 = 409;
	private int anInt3139;
	private int anInt3140 = 4096;
	private final int[] anIntArray3141;
	private int anInt3142 = 4096;
	static Cache aClass21_3143 = new Cache(20);
	static Cache aClass21_3144 = new Cache(4);
	static int anInt3145;
	static long aLong3146 = 0L;

	static final void method1201(final int i, final int i_0_, final int i_1_, final int i_2_) {
		final GroundTile class120_sub18 = Class120_Sub1.groundTiles[i][i_0_][i_1_];
		if (class120_sub18 != null) {
			final Class186 class186 = class120_sub18.aClass186_2639;
			if (class186 != null) {
				class186.anInt1905 = class186.anInt1905 * i_2_ / 16;
				class186.anInt1892 = class186.anInt1892 * i_2_ / 16;
			}
		}
	}

	public Class120_Sub12_Sub2() {
		super(1, false);
		anIntArray3141 = new int[3];
		anInt3139 = 4096;
	}

	static final AbstractMouseWheelHandler constructMouseWheelHandler() {
		AbstractMouseWheelHandler instance = null;
		try {
			instance = (AbstractMouseWheelHandler) Class.forName("MouseWheelHandler").newInstance();
		} catch (final Throwable throwable) {
			/* empty */
		}
		return instance;
	}

	@Override
	final int[][] method1188(final int i, final int i_5_) {
		int[][] is;
		try {
			if (i_5_ != -29869) {
				anInt3145 = -90;
			}
			final int[][] is_6_ = this.aClass109_2559.method975(i, -57);
			if (this.aClass109_2559.aBoolean1049) {
				final int[][] is_7_ = method1179(0, i, (byte) -51);
				final int[] is_8_ = is_7_[0];
				final int[] is_9_ = is_7_[1];
				final int[] is_10_ = is_7_[2];
				final int[] is_11_ = is_6_[1];
				final int[] is_12_ = is_6_[0];
				final int[] is_13_ = is_6_[2];
				for (int i_14_ = 0; Class120_Sub12_Sub7.anInt3178 > i_14_; i_14_++) {
					final int i_15_ = is_8_[i_14_];
					int i_16_ = -anIntArray3141[0] + i_15_;
					if (i_16_ < 0) {
						i_16_ = -i_16_;
					}
					if (i_16_ > anInt3138) {
						is_12_[i_14_] = i_15_;
						is_11_[i_14_] = is_9_[i_14_];
						is_13_[i_14_] = is_10_[i_14_];
					} else {
						final int i_17_ = is_9_[i_14_];
						i_16_ = -anIntArray3141[1] + i_17_;
						if (i_16_ < 0) {
							i_16_ = -i_16_;
						}
						if (i_16_ > anInt3138) {
							is_12_[i_14_] = i_15_;
							is_11_[i_14_] = i_17_;
							is_13_[i_14_] = is_10_[i_14_];
						} else {
							final int i_18_ = is_10_[i_14_];
							i_16_ = i_18_ + -anIntArray3141[2];
							if (i_16_ < 0) {
								i_16_ = -i_16_;
							}
							if (anInt3138 < i_16_) {
								is_12_[i_14_] = i_15_;
								is_11_[i_14_] = i_17_;
								is_13_[i_14_] = i_18_;
							} else {
								is_12_[i_14_] = i_15_ * anInt3140 >> 12;
								is_11_[i_14_] = anInt3139 * i_17_ >> 12;
								is_13_[i_14_] = i_18_ * anInt3142 >> 12;
							}
						}
					}
				}
			}
			is = is_6_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("bl.K(").append(i).append(',').append(i_5_).append(')').toString());
		}
		return is;
	}

	@Override
	final void method1180(final byte i, final Buffer class120_sub7, final int i_19_) {
		do {
			try {
				final int i_20_ = i_19_;
				while_124_: do {
					while_123_: do {
						while_122_: do {
							do {
								if (i_20_ != 0) {
									if (i_20_ != 1) {
										if (i_20_ != 2) {
											if (i_20_ != 3) {
												if (i_20_ == 4) {
													break while_123_;
												}
												break while_124_;
											}
										} else {
											break;
										}
										break while_122_;
									}
								} else {
									anInt3138 = class120_sub7.getUShort();
									break while_124_;
								}
								anInt3142 = class120_sub7.getUShort();
								break while_124_;
							} while (false);
							anInt3139 = class120_sub7.getUShort();
							break while_124_;
						} while (false);
						anInt3140 = class120_sub7.getUShort();
						break while_124_;
					} while (false);
					final int i_21_ = class120_sub7.getTriByte();
					anIntArray3141[0] = Class120_Sub12_Sub3.method1207(i_21_ << 4, 267386880);
					anIntArray3141[2] = Class120_Sub12_Sub3.method1207(255, i_21_) >> 12;
					anIntArray3141[1] = Class120_Sub12_Sub3.method1207(4080, i_21_ >> 4);
				} while (false);
				if (i != -43) {
					break;
				}
			} catch (final RuntimeException runtimeexception) {
				throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("bl.M(").append(i).append(',').append(class120_sub7 != null ? "{...}" : "null").append(',').append(i_19_).append(')').toString());
			}
		} while (false);
	}

	static final void method1203(final int i, final Class50 class50) {
		try {
			Class101.aClass50_966 = class50;
			if (i != 2) {
				aClass21_3143 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("bl.S(").append(i).append(',').append(class50 != null ? "{...}" : "null").append(')').toString());
		}
	}

	public static void method1204(final int i) {
		try {
			if (i != 18253) {
				aLong3146 = -116L;
			}
			aClass21_3144 = null;
			aClass21_3143 = null;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("bl.U(").append(i).append(')').toString());
		}
	}
}
