/* Class44 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Light {
	static String aString369 = null;
	int anInt370;
	boolean aBoolean371;
	short[] aShortArray372;
	int anInt373;
	int color;
	int anInt375;
	int anInt376;
	float[] aFloatArray377;
	private int anInt378;
	static int anInt379;
	Class133 aClass133_380;
	static JagexSocket aClass46_381;
	boolean aBoolean382;
	int anInt384;
	boolean aBoolean385;
	private int anInt386;
	float aFloat387;
	private int anInt388;
	private int anInt389;
	private int anInt390;
	static int anInt391 = 0;
	static int[] anIntArray392;
	static int objSelected = 0;
	float aFloat394;
	int anInt395;

	static {
		InvType.recentUse = new NodeCache(64);
	}

	final void method347(final int i, final int i_0_, final int i_1_, final int i_2_, final int i_3_) {
		try {
			anInt378 = i_2_;
			anInt386 = i_3_;
			anInt388 = i_1_;
			if (i_0_ == 1056) {
				anInt389 = i;
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("em.B(").append(i).append(',').append(i_0_).append(',').append(i_1_).append(',').append(i_2_).append(',').append(i_3_).append(')').toString());
		}
	}

	private final void method348(final int i) {
		while_30_: do {
			try {
				if (i > -13) {
					this.aClass133_380 = null;
				}
				final int i_4_ = this.anInt376;
				while_29_: do {
					while_28_: do {
						while_27_: do {
							while_26_: do {
								while_25_: do {
									while_24_: do {
										while_23_: do {
											while_22_: do {
												while_21_: do {
													while_20_: do {
														while_19_: do {
															while_18_: do {
																while_17_: do {
																	do {
																		if (i_4_ != 2) {
																			if (i_4_ != 3) {
																				if (i_4_ != 4) {
																					if (i_4_ != 5) {
																						if (i_4_ != 12) {
																							if (i_4_ != 13) {
																								if (i_4_ != 10) {
																									if (i_4_ != 11) {
																										if (i_4_ != 6) {
																											if (i_4_ != 7) {
																												if (i_4_ != 8) {
																													if (i_4_ != 9) {
																														if (i_4_ != 14) {
																															if (i_4_ != 15) {
																																if (i_4_ == 16) {
																																	break while_28_;
																																}
																																break while_29_;
																															}
																														} else {
																															break while_26_;
																														}
																														break while_27_;
																													}
																												} else {
																													break while_24_;
																												}
																												break while_25_;
																											}
																										} else {
																											break while_22_;
																										}
																										break while_23_;
																									}
																								} else {
																									break while_20_;
																								}
																								break while_21_;
																							}
																						} else {
																							break while_18_;
																						}
																						break while_19_;
																					}
																				} else {
																					break;
																				}
																				break while_17_;
																			}
																		} else {
																			anInt378 = 1;
																			anInt388 = 0;
																			anInt389 = 2048;
																			anInt386 = 2048;
																			break while_30_;
																		}
																		anInt378 = 1;
																		anInt389 = 2048;
																		anInt388 = 0;
																		anInt386 = 4096;
																		break while_30_;
																	} while (false);
																	anInt389 = 2048;
																	anInt388 = 0;
																	anInt378 = 4;
																	anInt386 = 2048;
																	break while_30_;
																} while (false);
																anInt378 = 4;
																anInt386 = 8192;
																anInt388 = 0;
																anInt389 = 2048;
																break while_30_;
															} while (false);
															anInt389 = 2048;
															anInt388 = 0;
															anInt386 = 2048;
															anInt378 = 2;
															break while_30_;
														} while (false);
														anInt378 = 2;
														anInt389 = 2048;
														anInt388 = 0;
														anInt386 = 8192;
														break while_30_;
													} while (false);
													anInt388 = 1536;
													anInt386 = 2048;
													anInt389 = 512;
													anInt378 = 3;
													break while_30_;
												} while (false);
												anInt388 = 1536;
												anInt386 = 4096;
												anInt378 = 3;
												anInt389 = 512;
												break while_30_;
											} while (false);
											anInt388 = 1280;
											anInt389 = 768;
											anInt386 = 2048;
											anInt378 = 3;
											break while_30_;
										} while (false);
										anInt386 = 4096;
										anInt388 = 1280;
										anInt378 = 3;
										anInt389 = 768;
										break while_30_;
									} while (false);
									anInt388 = 1024;
									anInt378 = 3;
									anInt389 = 1024;
									anInt386 = 2048;
									break while_30_;
								} while (false);
								anInt378 = 3;
								anInt389 = 1024;
								anInt388 = 1024;
								anInt386 = 4096;
								break while_30_;
							} while (false);
							anInt388 = 1280;
							anInt378 = 1;
							anInt389 = 768;
							anInt386 = 2048;
							break while_30_;
						} while (false);
						anInt388 = 1536;
						anInt389 = 512;
						anInt378 = 1;
						anInt386 = 4096;
						break while_30_;
					} while (false);
					anInt388 = 1792;
					anInt386 = 8192;
					anInt389 = 256;
					anInt378 = 1;
					break while_30_;
				} while (false);
				anInt389 = 2048;
				anInt388 = 0;
				anInt386 = 2048;
				anInt378 = 0;
			} catch (final RuntimeException runtimeexception) {
				throw EnumType.method1428(runtimeexception, new StringBuilder("em.F(").append(i).append(')').toString());
			}
		} while (false);
	}

	private final void method349(final int i) {
		try {
			if (i <= -68) {
				final int i_5_ = 64 + (this.anInt370 << 7);
				this.aFloat387 = 1.0F / (i_5_ * i_5_);
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("em.E(").append(i).append(')').toString());
		}
	}

	final void method350(boolean bool, final int i) {
		final int i_7_ = 0x7ff & anInt390 + (anInt386 * i / 50);
		final int i_8_ = anInt378;
		int i_9_ = 0;
		if(i_8_ == 1) {
			i_9_ = 1024 + (Rasterizer.sineTable[i_7_] >> 6);
		} else if(i_8_ == 2) {
			i_9_ = i_7_;
		} else if(i_8_ == 3) {
			i_9_ = JavaObject.anIntArray3916[i_7_] >> 1;
		} else if(i_8_ == 4) {
			i_9_ = i_7_ >> 10 << 11;
		} else if(i_8_ == 5) {
			i_9_ = (i_7_ < 1024 ? i_7_ : -i_7_ + 2048) << 1;
		} else {
			i_9_ = 2048;
		}
		if (bool) {
			i_9_ = 2048;
		}
		this.aFloat394 = ((i_9_ * anInt389 >> 11) + anInt388) / 2048.0F;
		float f = this.aFloat394 / 255.0F;
		this.aFloatArray377[0] = (0xff & this.color >> 16) * f;
		this.aFloatArray377[1] = (0xff & this.color >> 8) * f;
		this.aFloatArray377[2] = (0xff & this.color) * f;
	}

	static final boolean method351(final boolean bool, final String string) {
		boolean bool_10_;
		try {
			if (string == null) {
				return false;
			}
			for (int i = 0; Class120_Sub12_Sub26.ignoreCount > i; i++) {
				if (string.equalsIgnoreCase(GZIPDecompressor.ignoreNames[i])) {
					return true;
				}
			}
			if (bool) {
				aString369 = null;
			}
			bool_10_ = false;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("em.C(").append(bool).append(',').append(string != null ? "{...}" : "null").append(')').toString());
		}
		return bool_10_;
	}

	public static void method352(final byte i) {
		try {
			aString369 = null;
			anIntArray392 = null;
			if (i <= -51) {
				InvType.recentUse = null;
				aClass46_381 = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("em.G(").append(i).append(')').toString());
		}
	}

	static final boolean isShowingVideoAd() {
		if (Class48.jsEnabled) {
			boolean bool_11_ = false;
			try {
				bool_11_ = !((Boolean) JSHelper.call(NpcType.gameSignlink.gameApplet, "showingVideoAd")).booleanValue();
			} catch (final Throwable throwable) {
				/* empty */
			}
			return bool_11_;
		}
		return true;
	}

	protected Light() {
		this.aFloatArray377 = new float[4];
		this.aBoolean385 = false;
		if (JavaObject.anIntArray3916 == null) {
			Js5Request.method1550(1);
		}
		method348(-40);
	}

	Light(final Buffer class120_sub7) {
		this.aFloatArray377 = new float[4];
		this.aBoolean385 = false;
		if (JavaObject.anIntArray3916 == null) {
			Js5Request.method1550(1);
		}
		this.anInt384 = class120_sub7.getUByte();
		this.aBoolean371 = (0x10 & this.anInt384) != 0;
		this.aBoolean382 = (0x8 & this.anInt384) != 0;
		this.anInt384 = this.anInt384 & 0x7;
		this.anInt395 = class120_sub7.getUShort();
		this.anInt373 = class120_sub7.getUShort();
		this.anInt375 = class120_sub7.getUShort();
		this.anInt370 = class120_sub7.getUByte();
		method349(-96);
		this.aShortArray372 = new short[this.anInt370 * 2 + 1];
		for (int i = 0; i < this.aShortArray372.length; i++) {
			this.aShortArray372[i] = (short) class120_sub7.getUShort();
		}
		this.color = Rasterizer.palette[class120_sub7.getUShort()];
		final int i = class120_sub7.getUByte();
		this.anInt376 = 0x1f & i;
		anInt390 = 0x700 & i << 3;
		if (this.anInt376 != 31) {
			method348(-47);
		}
	}
}
