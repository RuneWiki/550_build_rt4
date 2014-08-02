/* Class108_Sub3_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Particle extends ParticleNodeSub {
	private static int anInt3086 = 12;
	int anInt3087;
	int anInt3088;
	private short aShort3089;
	int anInt3090;
	int color;
	private int anInt3092;
	private short aShort3093;
	short aShort3094;
	private short aShort3095;
	private short aShort3096;
	boolean aBoolean3097 = false;
	private short aShort3098;
	ParticleManager aClass108_Sub1_3099;
	private int anInt3100;

	final void method968(final long l, final int i) {
		if (this.aClass108_Sub1_3099 != null) {
			aShort3093 -= i;
			if (aShort3093 <= 0) {
				method969();
			} else {
				final int i_0_ = this.anInt3087 >> anInt3086;
				int i_1_ = this.anInt3088 >> anInt3086;
				final int i_2_ = this.anInt3090 >> anInt3086;
				final ParticleEngine class108_sub2 = this.aClass108_Sub1_3099.aClass108_Sub2_2340;
				final Class80 class80 = this.aClass108_Sub1_3099.aClass80_2323;
				if (class80.anInt729 != 0) {
					if (aShort3095 - aShort3093 <= class80.anInt735) {
						int i_3_ = (this.color >> 8 & 0xff00) + (anInt3092 >> 16 & 0xff) + class80.anInt728 * i;
						int i_4_ = (this.color & 0xff00) + (anInt3092 >> 8 & 0xff) + class80.anInt730 * i;
						int i_5_ = (this.color << 8 & 0xff00) + (anInt3092 & 0xff) + class80.anInt745 * i;
						if (i_3_ < 0) {
							i_3_ = 0;
						} else if (i_3_ > 65535) {
							i_3_ = 65535;
						}
						if (i_4_ < 0) {
							i_4_ = 0;
						} else if (i_4_ > 65535) {
							i_4_ = 65535;
						}
						if (i_5_ < 0) {
							i_5_ = 0;
						} else if (i_5_ > 65535) {
							i_5_ = 65535;
						}
						this.color &= ~0xffffff;
						this.color |= ((i_3_ & 0xff00) << 8) + (i_4_ & 0xff00) + ((i_5_ & 0xff00) >> 8);
						anInt3092 &= ~0xffffff;
						anInt3092 |= ((i_3_ & 0xff) << 16) + ((i_4_ & 0xff) << 8) + (i_5_ & 0xff);
					}
					if (aShort3095 - aShort3093 <= class80.anInt731) {
						int i_6_ = (this.color >> 16 & 0xff00) + (anInt3092 >> 24 & 0xff) + class80.anInt720 * i;
						if (i_6_ < 0) {
							i_6_ = 0;
						} else if (i_6_ > 65535) {
							i_6_ = 65535;
						}
						this.color &= 0xffffff;
						this.color |= (i_6_ & 0xff00) << 16;
						anInt3092 &= 0xffffff;
						anInt3092 |= (i_6_ & 0xff) << 24;
					}
				}
				if (class80.anInt733 != -1 && aShort3095 - aShort3093 <= class80.anInt752) {
					anInt3100 += class80.anInt775 * i;
				}
				int i_7_ = aShort3089;
				int i_8_ = aShort3096;
				int i_9_ = aShort3098;
				boolean bool = false;
				if (class80.anInt717 == 1) {
					final int i_10_ = i_0_ - this.aClass108_Sub1_3099.anInt2315;
					final int i_11_ = i_1_ - this.aClass108_Sub1_3099.anInt2318;
					final int i_12_ = i_2_ - this.aClass108_Sub1_3099.anInt2321;
					final int i_13_ = (int) Math.sqrt(i_10_ * i_10_ + i_11_ * i_11_ + i_12_ * i_12_);
					final long l_14_ = class80.anInt741 * i_13_ * i;
					anInt3100 -= anInt3100 * l_14_ >> 18;
				} else if (class80.anInt717 == 2) {
					final int i_15_ = i_0_ - this.aClass108_Sub1_3099.anInt2315;
					final int i_16_ = i_1_ - this.aClass108_Sub1_3099.anInt2318;
					final int i_17_ = i_2_ - this.aClass108_Sub1_3099.anInt2321;
					final int i_18_ = i_15_ * i_15_ + i_16_ * i_16_ + i_17_ * i_17_;
					final long l_19_ = class80.anInt741 * i_18_ * i;
					anInt3100 -= anInt3100 * l_19_ >> 28;
				}
				final Node node = class108_sub2.aClass105_2366.head;
				for (Node class120_20_ = node.next; class120_20_ != node; class120_20_ = class120_20_.next) {
					final Class120_Sub14_Sub24 class120_sub14_sub24 = (Class120_Sub14_Sub24) class120_20_;
					final Class32 class32 = class120_sub14_sub24.aClass169_3659.aClass32_1650;
					if (class32.anInt266 != 1) {
						final int i_21_ = i_0_ - class120_sub14_sub24.anInt3667;
						final int i_22_ = i_1_ - class120_sub14_sub24.anInt3662;
						final int i_23_ = i_2_ - class120_sub14_sub24.anInt3660;
						final long l_24_ = i_21_ * i_21_ + i_22_ * i_22_ + i_23_ * i_23_;
						if (l_24_ <= class32.aLong271) {
							int i_25_ = (int) Math.sqrt(l_24_);
							if (i_25_ == 0) {
								i_25_ = 1;
							}
							final long l_26_ = (i_21_ * class120_sub14_sub24.anInt3664 + i_22_ * class32.anInt261 + i_23_ * class120_sub14_sub24.anInt3661) * 65535L / (class32.anInt262 * i_25_);
							if (l_26_ >= class32.anInt265) {
								int i_27_ = 0;
								if (class32.anInt255 == 1) {
									i_27_ = (i_25_ >> 4) * class32.anInt268;
								} else if (class32.anInt255 == 2) {
									i_27_ = (i_25_ >> 4) * (i_25_ >> 4) * class32.anInt268;
								}
								if (class32.anInt264 == 0) {
									if (class32.anInt267 == 0) {
										i_7_ += (class120_sub14_sub24.anInt3664 - i_27_) * i;
										i_8_ += (class32.anInt261 - i_27_) * i;
										i_9_ += (class120_sub14_sub24.anInt3661 - i_27_) * i;
										bool = true;
									} else {
										this.anInt3087 += (class120_sub14_sub24.anInt3664 - i_27_) * i;
										this.anInt3088 += (class32.anInt261 - i_27_) * i;
										this.anInt3090 += (class120_sub14_sub24.anInt3661 - i_27_) * i;
									}
								} else {
									final int i_28_ = (i_21_ << 15) / i_25_ * class32.anInt262;
									final int i_29_ = (i_22_ << 15) / i_25_ * class32.anInt262;
									final int i_30_ = (i_23_ << 15) / i_25_ * class32.anInt262;
									if (class32.anInt267 == 0) {
										i_7_ += i_28_ * i >> 15;
										i_8_ += i_29_ * i >> 15;
										i_9_ += i_30_ * i >> 15;
										bool = true;
									} else {
										this.anInt3087 += i_28_ * i >> 15;
										this.anInt3088 += i_29_ * i >> 15;
										this.anInt3090 += i_30_ * i >> 15;
									}
								}
							}
						}
					}
				}
				if (class80.anIntArray773 != null) {
					int[] is;
					final int i_31_ = (is = class80.anIntArray773).length;
					for (int i_32_ = 0; i_32_ < i_31_; i_32_++) {
						final int i_33_ = is[i_32_];
						Class120_Sub14_Sub24 class120_sub14_sub24 = (Class120_Sub14_Sub24) ParticleEngine.aClass9_2346.method114((byte) -128, i_33_);
						while (class120_sub14_sub24 != null) {
							final Class32 class32 = class120_sub14_sub24.aClass169_3659.aClass32_1650;
							final int i_34_ = i_0_ - class120_sub14_sub24.anInt3667;
							final int i_35_ = i_1_ - class120_sub14_sub24.anInt3662;
							final int i_36_ = i_2_ - class120_sub14_sub24.anInt3660;
							final long l_37_ = i_34_ * i_34_ + i_35_ * i_35_ + i_36_ * i_36_;
							if (l_37_ > class32.aLong271) {
								class120_sub14_sub24 = (Class120_Sub14_Sub24) ParticleEngine.aClass9_2346.method113(-5463);
							} else {
								int i_38_ = (int) Math.sqrt(l_37_);
								if (i_38_ == 0) {
									i_38_ = 1;
								}
								final long l_39_ = (i_34_ * class120_sub14_sub24.anInt3664 + i_35_ * class32.anInt261 + i_36_ * class120_sub14_sub24.anInt3661) * 65535L / (class32.anInt262 * i_38_);
								if (l_39_ < class32.anInt265) {
									class120_sub14_sub24 = (Class120_Sub14_Sub24) ParticleEngine.aClass9_2346.method113(-5463);
								} else {
									int i_40_ = 0;
									if (class32.anInt255 == 1) {
										i_40_ = (i_38_ >> 4) * class32.anInt268;
									} else if (class32.anInt255 == 2) {
										i_40_ = (i_38_ >> 4) * (i_38_ >> 4) * class32.anInt268;
									}
									if (class32.anInt264 == 0) {
										if (class32.anInt267 == 0) {
											i_7_ += (class120_sub14_sub24.anInt3664 - i_40_) * i;
											i_8_ += (class32.anInt261 - i_40_) * i;
											i_9_ += (class120_sub14_sub24.anInt3661 - i_40_) * i;
											bool = true;
										} else {
											this.anInt3087 += (class120_sub14_sub24.anInt3664 - i_40_) * i;
											this.anInt3088 += (class32.anInt261 - i_40_) * i;
											this.anInt3090 += (class120_sub14_sub24.anInt3661 - i_40_) * i;
										}
									} else {
										final int i_41_ = (i_34_ << 15) / i_38_ * class32.anInt262;
										final int i_42_ = (i_35_ << 15) / i_38_ * class32.anInt262;
										final int i_43_ = (i_36_ << 15) / i_38_ * class32.anInt262;
										if (class32.anInt267 == 0) {
											i_7_ += i_41_ * i >> 15;
											i_8_ += i_42_ * i >> 15;
											i_9_ += i_43_ * i >> 15;
											bool = true;
										} else {
											this.anInt3087 += i_41_ * i >> 15;
											this.anInt3088 += i_42_ * i >> 15;
											this.anInt3090 += i_43_ * i >> 15;
										}
									}
									class120_sub14_sub24 = (Class120_Sub14_Sub24) ParticleEngine.aClass9_2346.method113(-5463);
								}
							}
						}
					}
				}
				if (class80.anIntArray743 != null) {
					if (class80.anIntArray757 == null) {
						class80.anIntArray757 = new int[class80.anIntArray743.length];
						for (int i_44_ = 0; i_44_ < class80.anIntArray743.length; i_44_++) {
							Class32.list(class80.anIntArray743[i_44_]);
							class80.anIntArray757[i_44_] = ((IntegerNode) GroundTile.aClass75_2643.get(class80.anIntArray743[i_44_])).value;
						}
					}
					int[] is;
					final int i_45_ = (is = class80.anIntArray757).length;
					for (int i_46_ = 0; i_46_ < i_45_; i_46_++) {
						final int i_47_ = is[i_46_];
						final Class32 class32 = Class154.aClass32Array1437[i_47_];
						if (class32.anInt267 == 0) {
							i_7_ += class32.anInt257 * i;
							i_8_ += class32.anInt261 * i;
							i_9_ += class32.anInt252 * i;
							bool = true;
						} else {
							this.anInt3087 += class32.anInt257 * i;
							this.anInt3088 += class32.anInt261 * i;
							this.anInt3090 += class32.anInt252 * i;
						}
					}
				}
				if (bool) {
					while (i_7_ > 32767 || i_8_ > 32767 || i_9_ > 32767 || i_7_ < -32767 || i_8_ < -32767 || i_9_ < -32767) {
						i_7_ >>= 1;
						i_8_ >>= 1;
						i_9_ >>= 1;
						anInt3100 <<= 1;
					}
					aShort3089 = (short) i_7_;
					aShort3096 = (short) i_8_;
					aShort3098 = (short) i_9_;
				}
				this.anInt3087 += ((long) aShort3089 * (long) anInt3100 >> 23) * i;
				this.anInt3088 += ((long) aShort3096 * (long) anInt3100 >> 23) * i;
				this.anInt3090 += ((long) aShort3098 * (long) anInt3100 >> 23) * i;
				final int tileX = this.anInt3087 >> 19;
				final int tileZ = this.anInt3090 >> 19;
				i_1_ = this.anInt3088 >> anInt3086;
				if (i_1_ > 0 || i_1_ < -65535 || tileX < 0 || tileX >= Class186.anInt1900 || tileZ < 0 || tileZ >= Class120_Sub12_Sub38.anInt3440) {
					method969();
				} else {
					final int[][][] heightMap = OverridedJInterface.tileHeightMap;
					final int tileHeight = heightMap[class108_sub2.anInt2374][tileX][tileZ];
					int i_51_;
					if (class108_sub2.anInt2374 < 3) {
						i_51_ = heightMap[class108_sub2.anInt2374 + 1][tileX][tileZ];
					} else {
						i_51_ = heightMap[class108_sub2.anInt2374][tileX][tileZ] - 1024;
					}
					if (class80.aBoolean754) {
						if (class80.anInt726 == -1 && i_1_ > tileHeight) {
							method969();
							return;
						}
						if (class80.anInt726 >= 0 && i_1_ > heightMap[class80.anInt726][tileX][tileZ]) {
							method969();
							return;
						}
						if (class80.anInt769 == -1 && i_1_ < i_51_) {
							method969();
							return;
						}
						if (class80.anInt769 >= 0 && i_1_ < heightMap[class80.anInt769 + 1][tileX][tileZ]) {
							method969();
							return;
						}
					}
					if (tileX < class108_sub2.anInt2373 || tileX > class108_sub2.anInt2384 || tileZ < class108_sub2.anInt2367 || tileZ > class108_sub2.anInt2375 || i_1_ > class108_sub2.anInt2369 || i_1_ < class108_sub2.anInt2382) {
						this.aBoolean3097 = true;
						int tileLevel = 3;
						if (i_1_ > heightMap[1][tileX][tileZ]) {
							tileLevel = 0;
						} else if (i_1_ > heightMap[2][tileX][tileZ]) {
							tileLevel = 1;
						} else if (i_1_ > heightMap[3][tileX][tileZ]) {
							tileLevel = 2;
						} else if (i_1_ < heightMap[3][tileX][tileZ] - 1024) {
							method969();
							return;
						}
						GroundTile groundTile = LabelGroup.groundTiles[tileLevel][tileX][tileZ];
						if (groundTile == null) {
							groundTile = LabelGroup.groundTiles[tileLevel][tileX][tileZ] = new GroundTile(tileLevel, tileX, tileZ);
						}
						if (groundTile.tileParticle == null) {
							groundTile.tileParticle = new TileParticleQueue();
							groundTile.aByte2623 = (byte) (int) (l & 0xffL);
						} else if (groundTile.aByte2623 != (byte) (int) (l & 0xffL)) {
							groundTile.tileParticle.clear();
							groundTile.aByte2623 = (byte) (int) (l & 0xffL);
						}
						groundTile.tileParticle.insertLast(this);
					} else {
						this.aBoolean3097 = false;
					}
				}
			}
		}
	}

	private final void method969() {
		this.aClass108_Sub1_3099.aClass108_Sub2_2340.aClass108_Sub3_Sub1Array2355[this.aShort3094] = null;
		ParticleEngine.aClass108_Sub3_Sub1Array2350[ParticleEngine.anInt2354] = this;
		ParticleEngine.anInt2354 = ParticleEngine.anInt2354 + 1 & 0x3ff;
		this.aClass108_Sub1_3099 = null;
		unlink();
		unlinkSub();
	}

	private final void method970() {
		final int i = this.aClass108_Sub1_3099.aClass108_Sub2_2340.anInt2348;
		if (this.aClass108_Sub1_3099.aClass108_Sub2_2340.aClass108_Sub3_Sub1Array2355[i] != null) {
			this.aClass108_Sub1_3099.aClass108_Sub2_2340.aClass108_Sub3_Sub1Array2355[i].method969();
		}
		this.aClass108_Sub1_3099.aClass108_Sub2_2340.aClass108_Sub3_Sub1Array2355[i] = this;
		this.aShort3094 = (short) this.aClass108_Sub1_3099.aClass108_Sub2_2340.anInt2348;
		this.aClass108_Sub1_3099.aClass108_Sub2_2340.anInt2348 = i + 1 & 0x1fff;
		this.aClass108_Sub1_3099.aClass174_2337.insertLast(this);
	}

	final void method971(final ParticleManager class108_sub1, final int i, final int i_53_, final int i_54_, final int i_55_, final int i_56_, final int i_57_, final int i_58_, final int i_59_, final int i_60_) {
		this.aClass108_Sub1_3099 = class108_sub1;
		this.anInt3087 = i << anInt3086;
		this.anInt3088 = i_53_ << anInt3086;
		this.anInt3090 = i_54_ << anInt3086;
		this.color = i_60_;
		aShort3095 = aShort3093 = (short) i_59_;
		aShort3089 = (short) i_55_;
		aShort3096 = (short) i_56_;
		aShort3098 = (short) i_57_;
		anInt3100 = i_58_;
		method970();
	}

	Particle(final ParticleManager class108_sub1, final int i, final int i_61_, final int i_62_, final int i_63_, final int i_64_, final int i_65_, final int i_66_, final int i_67_, final int i_68_) {
		this.aClass108_Sub1_3099 = class108_sub1;
		this.anInt3087 = i << anInt3086;
		this.anInt3088 = i_61_ << anInt3086;
		this.anInt3090 = i_62_ << anInt3086;
		this.color = i_68_;
		aShort3095 = aShort3093 = (short) i_67_;
		aShort3089 = (short) i_63_;
		aShort3096 = (short) i_64_;
		aShort3098 = (short) i_65_;
		anInt3100 = i_66_;
		method970();
	}
}
