/* Class80 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class80 {
	int anInt717 = 0;
	boolean aBoolean718;
	int anInt719;
	int anInt720;
	int anInt721;
	int anInt722;
	int anInt723;
	int anInt724;
	int anInt725;
	int anInt726;
	private int anInt727 = 100;
	int anInt728;
	int anInt729;
	int anInt730;
	int anInt731;
	private int anInt732;
	int anInt733;
	int anInt734;
	int anInt735;
	boolean aBoolean736;
	int anInt737;
	int anInt738;
	int anInt739;
	int anInt740;
	int anInt741;
	static boolean mouseInsideWorldMap;
	int[] anIntArray743;
	short aShort744;
	int anInt745;
	int anInt746;
	private int anInt747;
	private int anInt748;
	private int anInt749;
	boolean aBoolean750;
	static volatile int currentClickY = 0;
	int anInt752;
	short aShort753;
	boolean aBoolean754;
	int anInt755;
	int anInt756;
	int[] anIntArray757;
	int anInt758;
	short aShort759;
	boolean aBoolean760;
	static byte[] aByteArray761;
	private int anInt762;
	short aShort763;
	private int anInt764;
	int anInt765;
	private int anInt766;
	int anInt767;
	int anInt768;
	int anInt769;
	private int anInt770;
	private int[] anIntArray771;
	int anInt772;
	int[] anIntArray773;
	int anInt774;
	int anInt775;
	int anInt776;

	static {
		mouseInsideWorldMap = false;
		aByteArray761 = new byte[520];
	}

	public static void method697(final int i) {
		try {
			if (i != -1) {
				currentClickY = -23;
			}
			aByteArray761 = null;
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("ik.D(").append(i).append(')').toString());
		}
	}

	final void decode(final Buffer buffer) {
		for (;;) {
			final int code = buffer.getUByte();
			if (code == 0) {
				break;
			}
			decode(buffer, code);
		}
	}

	static final void method699(final int i_1_, final int i_2_) {
		if (FileSystem.anInt459 > 0) {
			Class111.method981(FileSystem.anInt459);
			FileSystem.anInt459 = 0;
		}
		int i_3_ = 0;
		int i_4_ = GraphicsLD.width * i_1_;
		int i_6_ = 0;
		for (int i_7_ = 1; i_7_ < 255; i_7_++) {
			int i_8_ = (256 - i_7_) * Class120_Sub15.anIntArray2597[i_7_] / 256;
			if (i_8_ < 0) {
				i_8_ = 0;
			}
			i_3_ += i_8_;
			for (int i_9_ = i_8_; i_9_ < 128; i_9_++) {
				final int i_10_ = GraphicsLD.pixels[i_2_ + i_4_++];
				int i_11_ = Light.anIntArray392[i_3_++];
				if (i_11_ == 0) {
					Class92.aClass120_Sub14_Sub19_Sub2_862.pixels[i_6_++] = i_10_;
				} else {
					int i_12_ = i_11_ + 18;
					if (i_12_ > 255) {
						i_12_ = 255;
					}
					int i_13_ = 238 - i_11_;
					if (i_13_ > 255) {
						i_13_ = 255;
					}
					i_11_ = Class76.anIntArray679[i_11_];
					Class92.aClass120_Sub14_Sub19_Sub2_862.pixels[i_6_++] = Class120_Sub12_Sub3.method1207(-16711936, i_13_ * Class120_Sub12_Sub3.method1207(16711935, i_10_) + Class120_Sub12_Sub3.method1207(16711935, i_11_) * i_12_) - -Class120_Sub12_Sub3.method1207(16711680, i_13_ * Class120_Sub12_Sub3.method1207(i_10_, 65280) + Class120_Sub12_Sub3.method1207(i_11_, 65280) * i_12_) >> 8;
				}
			}
			for (int i_14_ = 0; i_8_ > i_14_; i_14_++) {
				Class92.aClass120_Sub14_Sub19_Sub2_862.pixels[i_6_++] = GraphicsLD.pixels[i_2_ + i_4_++];
			}
			i_4_ += -128 + GraphicsLD.width;
		}
		if (!HDToolkit.glEnabled) {
			Class92.aClass120_Sub14_Sub19_Sub2_862.method1591(i_2_, i_1_);
		} else {
			GraphicsHD.method596(Class92.aClass120_Sub14_Sub19_Sub2_862.pixels, i_2_, i_1_, Class92.aClass120_Sub14_Sub19_Sub2_862.width, Class92.aClass120_Sub14_Sub19_Sub2_862.height);
		}
	}

	static final AbstractSprite method700(final int i, final int i_15_, final byte i_16_, final js5 js5) {
		AbstractSprite class120_sub14_sub19;
		try {
			if (!Class10.decodedSprites(js5, i, i_15_)) {
				return null;
			}
			if (i_16_ != 124) {
				aByteArray761 = null;
			}
			class120_sub14_sub19 = Class42.constructAbstractSprite();
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("ik.B(").append(i).append(',').append(i_15_).append(',').append(i_16_).append(',').append(js5 != null ? "{...}" : "null").append(')').toString());
		}
		return class120_sub14_sub19;
	}

	private final void decode(final Buffer buffer, final int code) {
		if (code != 1) {
			if (code == 2) {
				buffer.getUByte();
			} else if (code == 3) {
				this.anInt739 = buffer.getInt();
				this.anInt776 = buffer.getInt();
			} else if (code == 4) {
				this.anInt717 = buffer.getUByte();
				this.anInt741 = buffer.getByte();
			} else if (code == 5) {
				this.anInt721 = buffer.getUByte();
			} else if (code == 6) {
				anInt747 = buffer.getInt();
				anInt762 = buffer.getInt();
			} else if (code == 7) {
				this.anInt756 = buffer.getUShort();
				this.anInt738 = buffer.getUShort();
			} else if (code != 8) {
				if (code == 9) {
					final int i_18_ = buffer.getUByte();
					anIntArray771 = new int[i_18_];
					for (int i_19_ = 0; i_18_ > i_19_; i_19_++) {
						anIntArray771[i_19_] = buffer.getUShort();
					}
				} else if (code != 10) {
					if (code != 12) {
						if (code != 13) {
							if (code != 14) {
								if (code == 15) {
									this.anInt724 = buffer.getUShort();
								} else if (code == 16) {
									this.aBoolean718 = buffer.getUByte() == 1;
									this.anInt755 = buffer.getUShort();
									this.anInt772 = buffer.getUShort();
									this.aBoolean760 = buffer.getUByte() == 1;
								} else if (code == 17) {
									this.anInt765 = buffer.getUShort();
								} else if (code != 18) {
									if (code == 19) {
										this.anInt746 = buffer.getUByte();
									} else if (code == 20) {
										anInt764 = buffer.getUByte();
									} else if (code == 21) {
										anInt727 = buffer.getUByte();
									} else if (code != 22) {
										if (code != 23) {
											if (code == 24) {
												this.aBoolean736 = false;
											} else if (code != 25) {
												if (code == 26) {
													this.aBoolean750 = false;
												}
											} else {
												final int i_20_ = buffer.getUByte();
												this.anIntArray773 = new int[i_20_];
												for (int i_21_ = 0; i_20_ > i_21_; i_21_++) {
													this.anIntArray773[i_21_] = buffer.getUShort();
												}
											}
										} else {
											anInt732 = buffer.getUByte();
										}
									} else {
										this.anInt733 = buffer.getInt();
									}
								} else {
									this.anInt729 = buffer.getInt();
								}
							} else {
								this.anInt740 = buffer.getUShort();
							}
						} else {
							this.anInt769 = buffer.getByte();
						}
					} else {
						this.anInt726 = buffer.getByte();
					}
				} else {
					final int i_22_ = buffer.getUByte();
					this.anIntArray743 = new int[i_22_];
					for (int i_23_ = 0; i_22_ > i_23_; i_23_++) {
						this.anIntArray743[i_23_] = buffer.getUShort();
					}
				}
			} else {
				this.anInt768 = buffer.getUShort();
				this.anInt734 = buffer.getUShort();
			}
		} else {
			this.aShort744 = (short) buffer.getUShort();
			this.aShort753 = (short) buffer.getUShort();
			this.aShort759 = (short) buffer.getUShort();
			this.aShort763 = (short) buffer.getUShort();
		}
	}

	final void method702(final byte i) {
		try {
			if (this.anInt726 > -2 || this.anInt769 > -2) {
				this.aBoolean754 = true;
			}
			this.anInt737 = (0xff137c & anInt747) >> 16;
			this.anInt725 = (0xff19 & anInt747) >> 8;
			this.anInt723 = anInt747 >> 24 & 0xff;
			if (this.anInt733 != -1) {
				this.anInt752 = anInt732 * this.anInt738 / 100;
				if (this.anInt752 == 0) {
					this.anInt752 = 1;
				}
				this.anInt775 = (-this.anInt739 - (-this.anInt739 + this.anInt776) / 2 + this.anInt733) / this.anInt752;
			}
			this.anInt758 = 0xff & anInt747;
			anInt766 = 0xff & anInt762 >> 8;
			anInt749 = anInt762 >> 24 & 0xff;
			anInt770 = (anInt762 & 0xff9b08) >> 16;
			this.anInt767 = -this.anInt725 + anInt766;
			if (i == -87) {
				this.anInt719 = -this.anInt737 + anInt770;
				this.anInt774 = -this.anInt723 + anInt749;
				anInt748 = 0xff & anInt762;
				this.anInt722 = -this.anInt758 + anInt748;
				if (this.anInt729 != 0) {
					this.anInt731 = anInt727 * this.anInt738 / 100;
					this.anInt735 = anInt764 * this.anInt738 / 100;
					if (this.anInt731 == 0) {
						this.anInt731 = 1;
					}
					if (this.anInt735 == 0) {
						this.anInt735 = 1;
					}
					this.anInt728 = (((0xffe5a4 & this.anInt729) >> 16) + -this.anInt737 - this.anInt719 / 2 << 8) / this.anInt735;
					final Class80 class80_24_ = this;
					class80_24_.anInt728 = class80_24_.anInt728 + (this.anInt728 > 0 ? -4 : 4);
					this.anInt730 = (((0xff61 & this.anInt729) >> 8) - this.anInt725 - this.anInt767 / 2 << 8) / this.anInt735;
					final Class80 class80_25_ = this;
					class80_25_.anInt730 = class80_25_.anInt730 + (this.anInt730 <= 0 ? 4 : -4);
					this.anInt720 = (-(this.anInt774 / 2) + -this.anInt723 + (this.anInt729 >> 24 & 0xff) << 8) / this.anInt731;
					final Class80 class80_26_ = this;
					class80_26_.anInt720 = class80_26_.anInt720 + (this.anInt720 > 0 ? -4 : 4);
					this.anInt745 = (-(this.anInt722 / 2) - this.anInt758 + (this.anInt729 & 0xff) << 8) / this.anInt735;
					final Class80 class80_27_ = this;
					class80_27_.anInt745 = class80_27_.anInt745 + (this.anInt745 > 0 ? -4 : 4);
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw EnumType.method1428(runtimeexception, new StringBuilder("ik.A(").append(i).append(')').toString());
		}
	}

	static final Class80 list(final int id) {
		Class80 class80_15_ = (Class80) Class120_Sub12_Sub16.aClass21_3251.get(id);
		if (class80_15_ != null) {
			return class80_15_;
		}
		final byte[] is = Class69.aClass50_619.getFile(0, id);
		class80_15_ = new Class80();
		if (is != null) {
			class80_15_.decode(new Buffer(is));
		}
		class80_15_.method702((byte) -87);
		Class120_Sub12_Sub16.aClass21_3251.put(class80_15_, id);
		return class80_15_;
	}

	public Class80() {
		this.anInt724 = -1;
		this.anInt733 = -1;
		this.anInt740 = 0;
		this.aBoolean718 = true;
		this.anInt755 = -1;
		this.aBoolean736 = true;
		this.anInt765 = -1;
		anInt732 = 100;
		this.aBoolean754 = false;
		this.anInt769 = -2;
		this.aBoolean750 = true;
		anInt764 = 100;
		this.aBoolean760 = true;
		this.anInt772 = -1;
		this.anInt746 = 0;
		this.anInt726 = -2;
	}
}
