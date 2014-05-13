/* Class120_Sub12_Sub26 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class120_Sub12_Sub26 extends Class120_Sub12 {
	private int anInt3322;
	private int anInt3323;
	private int anInt3324 = 0;
	static int[] anIntArray3325 = new int[14];
	static boolean aBoolean3326;
	static int anInt3327;
	static volatile boolean fullRedraw = true;
	private int anInt3329;
	private int anInt3330;
	static int anInt3331;
	static int anInt3332;
	static long[] mainLoopTimeCache;
	private int anInt3334;
	static int anInt3335;
	private int anInt3336;
	static Class53_Sub1[] aClass53_Sub1Array3337;

	static {
		anInt3327 = 0;
		aBoolean3326 = false;
		anInt3335 = 0;
		mainLoopTimeCache = new long[32];
		aClass53_Sub1Array3337 = new Class53_Sub1[29];
	}

	private final boolean method1336(final int i, final int i_0_, final int i_1_) {
		boolean bool;
		try {
			final int i_2_ = (-i + i_0_) * anInt3329 >> 12;
			if (i_1_ < 84) {
				anInt3331 = -62;
			}
			int i_3_ = Class83.anIntArray789[0xff & 255 * i_2_ >> 12];
			i_3_ = (i_3_ << 12) / anInt3329;
			i_3_ = (i_3_ << 12) / anInt3322;
			i_3_ = anInt3336 * i_3_ >> 12;
			bool = i_3_ > i - -i_0_ && -i_3_ < i - -i_0_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("rg.T(").append(i).append(',').append(i_0_).append(',').append(i_1_).append(')').toString());
		}
		return bool;
	}

	static final void method1337(final byte i) {
		try {
			Class180_Sub6.aClass21_3071.clear();
			Class120_Sub1.aClass21_2406.clear();
			Class120_Sub12_Sub2.aClass21_3143.clear();
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("rg.U(").append(i).append(')').toString());
		}
	}

	public static void method1338(final int i) {
		try {
			if (i == -9465) {
				anIntArray3325 = null;
				mainLoopTimeCache = null;
				aClass53_Sub1Array3337 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("rg.V(").append(i).append(')').toString());
		}
	}

	private final boolean method1339(final int i, final int i_4_, final byte i_5_) {
		boolean bool;
		try {
			final int i_6_ = (i - -i_4_) * anInt3329 >> 12;
			int i_7_ = Class83.anIntArray789[(0xffafc & 255 * i_6_) >> 12];
			if (i_5_ != -46) {
				method1340(null, 23, 112);
			}
			i_7_ = (i_7_ << 12) / anInt3329;
			i_7_ = (i_7_ << 12) / anInt3322;
			i_7_ = i_7_ * anInt3336 >> 12;
			bool = i_7_ > -i_4_ + i && i + -i_4_ > -i_7_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("rg.S(").append(i).append(',').append(i_4_).append(',').append(i_5_).append(')').toString());
		}
		return bool;
	}

	@Override
	final void method1193(final byte i) {
		try {
			PacketBuffer.method1147((byte) -29);
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("rg.O(").append(i).append(')').toString());
		}
	}

	static final LDSprite method1340(final Class50 class50, final int i, final int i_8_) {
		if (!Class10.method121(class50, i, i_8_)) {
			return null;
		}
		return Class167.constructLDSprite();
	}

	public Class120_Sub12_Sub26() {
		super(0, true);
		anInt3322 = 8192;
		anInt3330 = 2048;
		anInt3323 = 0;
		anInt3334 = 2048;
		anInt3329 = 12288;
		anInt3336 = 4096;
	}

	@Override
	final void method1180(final byte i, final Buffer class120_sub7, final int i_9_) {
		while_196_: do {
			try {
				if (i == -43) {
					final int i_10_ = i_9_;
					while_195_: do {
						while_194_: do {
							while_193_: do {
								while_192_: do {
									do {
										if (i_10_ != 0) {
											if (i_10_ != 1) {
												if (i_10_ != 2) {
													if (i_10_ != 3) {
														if (i_10_ != 4) {
															if (i_10_ != 5) {
																if (i_10_ == 6) {
																	break while_195_;
																}
																break while_196_;
															}
														} else {
															break while_193_;
														}
														break while_194_;
													}
												} else {
													break;
												}
												break while_192_;
											}
										} else {
											anInt3330 = class120_sub7.getUShort();
											break while_196_;
										}
										anInt3324 = class120_sub7.getUShort();
										break while_196_;
									} while (false);
									anInt3323 = class120_sub7.getUShort();
									break while_196_;
								} while (false);
								anInt3334 = class120_sub7.getUShort();
								break while_196_;
							} while (false);
							anInt3329 = class120_sub7.getUShort();
							break while_196_;
						} while (false);
						anInt3336 = class120_sub7.getUShort();
						break while_196_;
					} while (false);
					anInt3322 = class120_sub7.getUShort();
				}
			} catch (final RuntimeException runtimeexception) {
				throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("rg.M(").append(i).append(',').append(class120_sub7 != null ? "{...}" : "null").append(',').append(i_9_).append(')').toString());
			}
		} while (false);
	}

	@Override
	final int[] method1187(final int i, final int i_11_) {
		int[] is;
		try {
			if (i != -1735) {
				aBoolean3326 = false;
			}
			final int[] is_12_ = this.aClass30_2563.method258(i_11_, -106);
			if (this.aClass30_2563.aBoolean238) {
				final int i_13_ = -2048 + Class150.anIntArray1405[i_11_];
				for (int i_14_ = 0; Class120_Sub12_Sub7.anInt3178 > i_14_; i_14_++) {
					final int i_15_ = -2048 + Class90.anIntArray849[i_14_];
					int i_16_ = i_15_ + anInt3330;
					i_16_ = i_16_ >= -2048 ? i_16_ : 4096 + i_16_;
					int i_17_ = i_13_ - -anInt3324;
					i_16_ = i_16_ <= 2048 ? i_16_ : -4096 + i_16_;
					i_17_ = i_17_ < -2048 ? i_17_ + 4096 : i_17_;
					i_17_ = i_17_ <= 2048 ? i_17_ : -4096 + i_17_;
					int i_18_ = anInt3323 + i_15_;
					int i_19_ = anInt3334 + i_13_;
					i_18_ = i_18_ >= -2048 ? i_18_ : i_18_ - -4096;
					i_18_ = i_18_ <= 2048 ? i_18_ : -4096 + i_18_;
					i_19_ = i_19_ < -2048 ? 4096 + i_19_ : i_19_;
					i_19_ = i_19_ <= 2048 ? i_19_ : i_19_ + -4096;
					is_12_[i_14_] = !method1336(i_16_, i_17_, 92) && !method1339(i_19_, i_18_, (byte) -46) ? 0 : 4096;
				}
			}
			is = is_12_;
		} catch (final RuntimeException runtimeexception) {
			throw Class120_Sub14_Sub2.method1428(runtimeexception, new StringBuilder("rg.D(").append(i).append(',').append(i_11_).append(')').toString());
		}
		return is;
	}
}
