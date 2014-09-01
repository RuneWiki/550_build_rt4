/* Class120_Sub12_Sub27 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

final class Class120_Sub12_Sub27 extends Class120_Sub12 {
	static String aString3338;
	static int anInt3339 = 0;
	private int anInt3340;
	private int anInt3341;
	private short[] aShortArray3343 = new short[512];
	private int anInt3344;
	private int anInt3345;
	private int anInt3346 = 2;
	private byte[] aByteArray3347;
	static boolean disableWorldMapMapFunctions = false;
	static int[] anIntArray3349;
	static volatile int currentMouseY;
	private int anInt3352;
	static int renderYWrapper;
	static AbstractIndexedSprite logoSprite;

	static {
		aString3338 = "Checking for updates - ";
		anIntArray3349 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };
		currentMouseY = -1;
	}

	@Override
	final void postDecode() {
		aByteArray3347 = UnderlayType.method1899(anInt3341);
		method1341();
	}

	@Override
	final int[] method1187(final int i_0_) {
		final int[] is_1_ = this.aClass30_2563.method258(i_0_);
		if (this.aClass30_2563.aBoolean238) {
			final int i_2_ = Class150.anIntArray1405[i_0_] * anInt3352 + 2048;
			final int i_3_ = i_2_ >> 12;
			final int i_4_ = i_3_ - -1;
			int i_5_ = 0;
			while_186_: for (/**/; i_5_ < Class120_Sub12_Sub7.anInt3178; i_5_++) {
				Class120_Sub12_Sub24.anInt3311 = Class101.anInt961 = Class99.anInt954 = AbstractGraphicsBuffer.anInt1174 = 2147483647;
				final int i_6_ = 2048 - -(Class90.anIntArray849[i_5_] * anInt3344);
				final int i_7_ = i_6_ >> 12;
				final int i_8_ = 1 + i_7_;
				for (int i_9_ = -1 + i_3_; i_9_ <= i_4_; i_9_++) {
					final int i_10_ = aByteArray3347[(i_9_ >= anInt3352 ? i_9_ - anInt3352 : i_9_) & 0xff] & 0xff;
					for (int i_11_ = i_7_ + -1; i_11_ <= i_8_; i_11_++) {
						int i_12_ = (aByteArray3347[i_10_ - -(anInt3344 <= i_11_ ? -anInt3344 + i_11_ : i_11_) & 0xff] & 0xff) * 2;
						int i_13_ = i_6_ + -(i_11_ << 12) + -aShortArray3343[i_12_++];
						int i_14_ = -(i_9_ << 12) + -aShortArray3343[i_12_] + i_2_;
						final int i_15_ = anInt3340;
						int i_16_;
						while_182_: do {
							while_181_: do {
								while_180_: do {
									while_179_: do {
										do {
											if (i_15_ != 1) {
												if (i_15_ != 3) {
													if (i_15_ != 4) {
														if (i_15_ != 5) {
															if (i_15_ == 2) {
																break while_180_;
															}
															break while_181_;
														}
													} else {
														break;
													}
													break while_179_;
												}
											} else {
												i_16_ = i_14_ * i_14_ + i_13_ * i_13_ >> 12;
												break while_182_;
											}
											i_13_ = i_13_ >= 0 ? i_13_ : -i_13_;
											i_14_ = i_14_ < 0 ? -i_14_ : i_14_;
											i_16_ = i_14_ >= i_13_ ? i_14_ : i_13_;
											break while_182_;
										} while (false);
										i_13_ = (int) (4096.0 * Math.sqrt((i_13_ < 0 ? -i_13_ : i_13_) / 4096.0F));
										i_14_ = (int) (4096.0 * Math.sqrt((i_14_ >= 0 ? i_14_ : -i_14_) / 4096.0F));
										i_16_ = i_14_ + i_13_;
										i_16_ = i_16_ * i_16_ >> 12;
										break while_182_;
									} while (false);
									i_13_ *= i_13_;
									i_14_ *= i_14_;
									i_16_ = (int) (Math.sqrt(Math.sqrt((i_13_ - -i_14_) / 1.6777216E7F)) * 4096.0);
									break while_182_;
								} while (false);
								i_16_ = (i_13_ < 0 ? -i_13_ : i_13_) - -(i_14_ >= 0 ? i_14_ : -i_14_);
								break while_182_;
							} while (false);
							i_16_ = (int) (4096.0 * Math.sqrt((i_13_ * i_13_ + i_14_ * i_14_) / 1.6777216E7F));
						} while (false);
						if (i_16_ < Class120_Sub12_Sub24.anInt3311) {
							AbstractGraphicsBuffer.anInt1174 = Class99.anInt954;
							Class99.anInt954 = Class101.anInt961;
							Class101.anInt961 = Class120_Sub12_Sub24.anInt3311;
							Class120_Sub12_Sub24.anInt3311 = i_16_;
						} else if (i_16_ < Class101.anInt961) {
							AbstractGraphicsBuffer.anInt1174 = Class99.anInt954;
							Class99.anInt954 = Class101.anInt961;
							Class101.anInt961 = i_16_;
						} else if (i_16_ < Class99.anInt954) {
							AbstractGraphicsBuffer.anInt1174 = Class99.anInt954;
							Class99.anInt954 = i_16_;
						} else if (AbstractGraphicsBuffer.anInt1174 > i_16_) {
							AbstractGraphicsBuffer.anInt1174 = i_16_;
						}
					}
				}
				final int i_17_ = anInt3346;
				while_184_: do {
					while_183_: do {
						do {
							if (i_17_ != 0) {
								if (i_17_ != 1) {
									if (i_17_ != 3) {
										if (i_17_ != 4) {
											if (i_17_ == 2) {
												break while_184_;
											}
											continue while_186_;
										}
									} else {
										break;
									}
									break while_183_;
								}
							} else {
								is_1_[i_5_] = Class120_Sub12_Sub24.anInt3311;
								continue while_186_;
							}
							is_1_[i_5_] = Class101.anInt961;
							continue while_186_;
						} while (false);
						is_1_[i_5_] = Class99.anInt954;
						continue while_186_;
					} while (false);
					is_1_[i_5_] = AbstractGraphicsBuffer.anInt1174;
					continue while_186_;
				} while (false);
				is_1_[i_5_] = -Class120_Sub12_Sub24.anInt3311 + Class101.anInt961;
			}
		}
		return is_1_;
	}

	public Class120_Sub12_Sub27() {
		super(0, true);
		anInt3345 = 2048;
		anInt3341 = 0;
		anInt3340 = 1;
		anInt3344 = 5;
		aByteArray3347 = new byte[512];
		anInt3352 = 5;
	}

	private final void method1341() {
		final Random random = new Random(anInt3341);
		aShortArray3343 = new short[512];
		if (anInt3345 > 0) {
			for (int i_18_ = 0; i_18_ < 512; i_18_++) {
				aShortArray3343[i_18_] = (short) Class28.method244(random, anInt3345);
			}
		}
	}

	static final void method1342(final int i, final int i_19_, final int i_21_) {
		final InterfaceChangeNode class120_sub14_sub7 = AbstractObject.putInterfaceChange(9, i_19_);
		class120_sub14_sub7.method1454();
		class120_sub14_sub7.anInt3492 = i;
		class120_sub14_sub7.anInt3484 = i_21_;
	}

	@Override
	final void decode(final Buffer buffer, final int i_23_) {
		while_191_: do {
			while_190_: do {
				while_189_: do {
					while_188_: do {
						while_187_: do {
							do {
								if (i_23_ != 0) {
									if (i_23_ != 1) {
										if (i_23_ != 2) {
											if (i_23_ != 3) {
												if (i_23_ != 4) {
													if (i_23_ != 5) {
														if (i_23_ == 6) {
															break while_190_;
														}
														break while_191_;
													}
												} else {
													break while_188_;
												}
												break while_189_;
											}
										} else {
											break;
										}
										break while_187_;
									}
								} else {
									anInt3344 = anInt3352 = buffer.getUByte();
									break while_191_;
								}
								anInt3341 = buffer.getUByte();
								break while_191_;
							} while (false);
							anInt3345 = buffer.getUShort();
							break while_191_;
						} while (false);
						anInt3346 = buffer.getUByte();
						break while_191_;
					} while (false);
					anInt3340 = buffer.getUByte();
					break while_191_;
				} while (false);
				anInt3344 = buffer.getUByte();
				break while_191_;
			} while (false);
			anInt3352 = buffer.getUByte();
		} while (false);
	}

	public static void method1343(final int i) {
		try {
			CursorType.spriteCache = null;
			logoSprite = null;
			aString3338 = null;
			anIntArray3349 = null;
			if (i <= 39) {
				aString3338 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("rh.T(").append(i).append(')').toString());
		}
	}
}
