/* Class120_Sub12_Sub33 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

final class Class120_Sub12_Sub33 extends Class120_Sub12 {
	static int[][][] anIntArrayArrayArray3388;
	private int anInt3389 = 81;
	private int anInt3390;
	static boolean[] needScreenRedraw;
	private int anInt3392;
	static int affiliateId;
	static String[] menuOptionPrefix = new String[500];
	private int[][] anIntArrayArray3395;
	private int anInt3396;
	private int anInt3397;
	private int anInt3398 = 4;
	private int anInt3399 = 0;
	private int anInt3400;
	static int anInt3401 = 0;
	private int anInt3402;
	private int[] anIntArray3403;
	private int anInt3404;
	private int[][] anIntArrayArray3405;
	static int js5Stage;
	static int anInt3407;
	private int anInt3408;

	static {
		affiliateId = 0;
		needScreenRedraw = new boolean[100];
		js5Stage = 0;
		anInt3407 = -1;
	}

	public static void method1375() {
		menuOptionPrefix = null;
		anIntArrayArrayArray3388 = null;
		needScreenRedraw = null;
	}

	public Class120_Sub12_Sub33() {
		super(0, true);
		anInt3397 = 1024;
		anInt3396 = 1024;
		anInt3400 = 409;
		anInt3408 = 204;
		anInt3390 = 8;
	}

	private final void method1376(final int i) {
		try {
			final Random random = new Random(anInt3390);
			anInt3392 = 4096 / anInt3390;
			anIntArray3403 = new int[1 + anInt3390];
			anIntArrayArray3395 = new int[anInt3390][anInt3398 + 1];
			anIntArrayArray3405 = new int[anInt3390][anInt3398];
			anIntArray3403[0] = 0;
			anInt3404 = 4096 / anInt3398;
			final int i_0_ = anInt3404 / 2;
			anInt3402 = anInt3389 / 2;
			final int i_1_ = anInt3392 / 2;
			if (i == -1) {
				for (int i_2_ = 0; anInt3390 > i_2_; i_2_++) {
					if (i_2_ > 0) {
						int i_3_ = anInt3392;
						final int i_4_ = (-2048 + Class28.method244(random, 4096)) * anInt3408 >> 12;
						i_3_ += i_4_ * i_1_ >> 12;
						anIntArray3403[i_2_] = i_3_ + anIntArray3403[i_2_ - 1];
					}
					anIntArrayArray3395[i_2_][0] = 0;
					for (int i_5_ = 0; i_5_ < anInt3398; i_5_++) {
						if (i_5_ > 0) {
							int i_6_ = anInt3404;
							final int i_7_ = (Class28.method244(random, 4096) - 2048) * anInt3400 >> 12;
							i_6_ += i_0_ * i_7_ >> 12;
							anIntArrayArray3395[i_2_][i_5_] = anIntArrayArray3395[i_2_][i_5_ + -1] - -i_6_;
						}
						anIntArrayArray3405[i_2_][i_5_] = anInt3396 <= 0 ? 4096 : -Class28.method244(random, anInt3396) + 4096;
					}
					anIntArrayArray3395[i_2_][anInt3398] = 4096;
				}
				anIntArray3403[anInt3390] = 4096;
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("sn.R(").append(i).append(')').toString());
		}
	}

	@Override
	final void postDecode() {
		method1376(-1);
	}

	@Override
	final void decode(final Buffer buffer, final int i_11_) {
		while_144_: do {
			while_143_: do {
				while_142_: do {
					while_141_: do {
						while_140_: do {
							while_139_: do {
								do {
									if (i_11_ != 0) {
										if (i_11_ != 1) {
											if (i_11_ != 2) {
												if (i_11_ != 3) {
													if (i_11_ != 4) {
														if (i_11_ != 5) {
															if (i_11_ != 6) {
																if (i_11_ != 7) {
																	break while_144_;
																}
															} else {
																break while_142_;
															}
															break while_143_;
														}
													} else {
														break while_140_;
													}
													break while_141_;
												}
											} else {
												break;
											}
											break while_139_;
										}
									} else {
										anInt3398 = buffer.getUByte();
										break while_144_;
									}
									anInt3390 = buffer.getUByte();
									break while_144_;
								} while (false);
								anInt3400 = buffer.getUShort();
								break while_144_;
							} while (false);
							anInt3408 = buffer.getUShort();
							break while_144_;
						} while (false);
						anInt3397 = buffer.getUShort();
						break while_144_;
					} while (false);
					anInt3399 = buffer.getUShort();
					break while_144_;
				} while (false);
				anInt3389 = buffer.getUShort();
				break while_144_;
			} while (false);
			anInt3396 = buffer.getUShort();
		} while (false);
	}

	@Override
	final int[] method1187(final int i_12_) {
		final int[] is_13_ = this.aClass30_2563.method258(i_12_);
		if (this.aClass30_2563.aBoolean238) {
			int i_14_ = 0;
			int i_15_;
			for (i_15_ = anInt3399 + Class150.anIntArray1405[i_12_]; i_15_ < 0; i_15_ += 4096) {
				/* empty */
			}
			for (/**/; i_15_ > 4096; i_15_ -= 4096) {
				/* empty */
			}
			for (/**/; anInt3390 > i_14_ && i_15_ >= anIntArray3403[i_14_]; i_14_++) {
				/* empty */
			}
			final int i_16_ = -1 + i_14_;
			final int i_17_ = anIntArray3403[i_14_];
			final boolean bool = (i_14_ & 0x1) == 0;
			final int i_18_ = anIntArray3403[i_14_ + -1];
			if (i_18_ - -anInt3402 < i_15_ && i_15_ < i_17_ + -anInt3402) {
				for (int i_19_ = 0; Class120_Sub12_Sub7.anInt3178 > i_19_; i_19_++) {
					final int i_20_ = !bool ? -anInt3397 : anInt3397;
					int i_21_ = Class90.anIntArray849[i_19_] - -(i_20_ * anInt3404 >> 12);
					int i_22_ = 0;
					for (/**/; i_21_ < 0; i_21_ += 4096) {
						/* empty */
					}
					for (/**/; i_21_ > 4096; i_21_ -= 4096) {
						/* empty */
					}
					for (/**/; i_22_ < anInt3398 && i_21_ >= anIntArrayArray3395[i_16_][i_22_]; i_22_++) {
						/* empty */
					}
					final int i_23_ = anIntArrayArray3395[i_16_][i_22_];
					final int i_24_ = -1 + i_22_;
					final int i_25_ = anIntArrayArray3395[i_16_][i_24_];
					if (i_25_ + anInt3402 >= i_21_ || -anInt3402 + i_23_ <= i_21_) {
						is_13_[i_19_] = 0;
					} else {
						is_13_[i_19_] = anIntArrayArray3405[i_16_][i_24_];
					}
				}
			} else {
				ArrayUtils.fillArray(is_13_, 0, Class120_Sub12_Sub7.anInt3178, 0);
			}
		}
		return is_13_;
	}
}
