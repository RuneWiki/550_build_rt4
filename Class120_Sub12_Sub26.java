/* Class120_Sub12_Sub26 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class120_Sub12_Sub26 extends Class120_Sub12 {
	private int anInt3322;
	private int anInt3323;
	private int anInt3324 = 0;
	static int[] anIntArray3325 = new int[14];
	static boolean aBoolean3326;
	static int flagX;
	static volatile boolean fullRedraw = true;
	private int anInt3329;
	private int anInt3330;
	static int anInt3331;
	static int anInt3332;
	static long[] mainLoopTimeCache;
	private int anInt3334;
	static int ignoreCount;
	private int anInt3336;
	static Class53_Sub1[] aClass53_Sub1Array3337;

	static {
		flagX = 0;
		aBoolean3326 = false;
		ignoreCount = 0;
		mainLoopTimeCache = new long[32];
		aClass53_Sub1Array3337 = new Class53_Sub1[29];
	}

	private final boolean method1336(final int i, final int i_0_) {
		final int i_2_ = (-i + i_0_) * anInt3329 >> 12;
		int i_3_ = FileSystemWorker.anIntArray789[0xff & 255 * i_2_ >> 12];
		i_3_ = (i_3_ << 12) / anInt3329;
		i_3_ = (i_3_ << 12) / anInt3322;
		i_3_ = anInt3336 * i_3_ >> 12;
		return i_3_ > i - -i_0_ && -i_3_ < i - -i_0_;
	}

	static final void method1337() {
		JagexInterface.spriteCache.clear();
		JagexInterface.modelCache.clear();
		JagexInterface.fontCache.clear();
	}

	private final boolean method1339(final int i, final int i_4_) {
		final int i_6_ = (i - -i_4_) * anInt3329 >> 12;
		int i_7_ = FileSystemWorker.anIntArray789[(0xffafc & 255 * i_6_) >> 12];
		i_7_ = (i_7_ << 12) / anInt3329;
		i_7_ = (i_7_ << 12) / anInt3322;
		i_7_ = i_7_ * anInt3336 >> 12;
		return i_7_ > -i_4_ + i && i + -i_4_ > -i_7_;
	}

	@Override
	final void postDecode() {
		PacketBuffer.method1147();
	}

	static final LDSprite constructLDSpriteAlpha(final js5 js5, final int group, final int file) {
		if (!Class10.decodedSprites(js5, group, file)) {
			return null;
		}
		return Class167.constructLDSpriteAlpha();
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
	final void decode(final Buffer buffer, final int i_10_) {
		while_196_: do {
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
									anInt3330 = buffer.getUShort();
									break while_196_;
								}
								anInt3324 = buffer.getUShort();
								break while_196_;
							} while (false);
							anInt3323 = buffer.getUShort();
							break while_196_;
						} while (false);
						anInt3334 = buffer.getUShort();
						break while_196_;
					} while (false);
					anInt3329 = buffer.getUShort();
					break while_196_;
				} while (false);
				anInt3336 = buffer.getUShort();
				break while_196_;
			} while (false);
			anInt3322 = buffer.getUShort();
		} while (false);
	}

	@Override
	final int[] method1187(final int i_11_) {
		final int[] is_12_ = this.aClass30_2563.method258(i_11_);
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
				is_12_[i_14_] = !method1336(i_16_, i_17_) && !method1339(i_19_, i_18_) ? 0 : 4096;
			}
		}
		return is_12_;
	}
}
